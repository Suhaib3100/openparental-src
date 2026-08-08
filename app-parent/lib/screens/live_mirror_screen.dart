import 'dart:async';
import 'dart:convert';
import 'dart:typed_data';

import 'package:flutter/material.dart';
import 'package:flutter_riverpod/flutter_riverpod.dart';
import 'package:socket_io_client/socket_io_client.dart' as io;

import '../api/models.dart';
import '../state/providers.dart';
import '../theme/app_theme.dart';

enum _MirrorPhase { requesting, waiting, live, ended, denied, error }

/// Quiet live screen viewer. Creates a session and renders JPEG frames from
/// the child device over Socket.IO `/screen` (no child-side approve prompt).
class LiveMirrorScreen extends ConsumerStatefulWidget {
  final Device device;
  const LiveMirrorScreen({super.key, required this.device});

  @override
  ConsumerState<LiveMirrorScreen> createState() => _LiveMirrorScreenState();
}

class _LiveMirrorScreenState extends ConsumerState<LiveMirrorScreen> {
  _MirrorPhase _phase = _MirrorPhase.requesting;
  String? _sessionId;
  String? _error;
  Uint8List? _frame;
  io.Socket? _socket;
  Timer? _pollTimer;

  @override
  void initState() {
    super.initState();
    _start();
  }

  @override
  void dispose() {
    _pollTimer?.cancel();
    _teardownSocket();
    final id = _sessionId;
    if (id != null &&
        (_phase == _MirrorPhase.waiting || _phase == _MirrorPhase.live)) {
      // Best-effort end; don't await in dispose.
      final api = ref.read(apiProvider);
      unawaited(() async {
        try {
          await api.endScreenSession(id);
        } catch (_) {}
      }());
    }
    super.dispose();
  }

  Future<void> _start() async {
    setState(() {
      _phase = _MirrorPhase.requesting;
      _error = null;
      _frame = null;
    });
    try {
      final api = ref.read(apiProvider);
      final session = await api.createScreenSession(widget.device.id);
      _sessionId = session.id;
      await _connectSocket(session.id);
      if (!mounted) return;
      setState(() => _phase = _MirrorPhase.waiting);
      _pollTimer = Timer.periodic(const Duration(seconds: 3), (_) => _poll());
    } catch (e) {
      if (!mounted) return;
      setState(() {
        _phase = _MirrorPhase.error;
        _error = e.toString();
      });
    }
  }

  Future<void> _connectSocket(String sessionId) async {
    final api = ref.read(apiProvider);
    final token = await api.accessToken();
    if (token == null) throw Exception('Not signed in');

    final base = api.baseUrl.replaceFirst(RegExp(r'/+$'), '');
    final socket = io.io(
      '$base/screen',
      io.OptionBuilder()
          .setTransports(['websocket'])
          .disableAutoConnect()
          .setAuth({'token': token})
          .build(),
    );
    _socket = socket;

    socket.onConnect((_) {
      socket.emit('join', {'sessionId': sessionId});
    });
    socket.on('session_ready', (_) {
      if (!mounted) return;
      setState(() => _phase = _MirrorPhase.live);
    });
    socket.on('session_denied', (_) {
      if (!mounted) return;
      setState(() => _phase = _MirrorPhase.denied);
      _teardownSocket();
    });
    socket.on('session_ended', (_) {
      if (!mounted) return;
      if (_phase == _MirrorPhase.live || _phase == _MirrorPhase.waiting) {
        setState(() => _phase = _MirrorPhase.ended);
      }
      _teardownSocket();
    });
    socket.on('frame', (data) {
      if (!mounted) return;
      try {
        final map = data is Map
            ? Map<String, dynamic>.from(data)
            : <String, dynamic>{};
        final b64 = map['data'] as String?;
        if (b64 == null || b64.isEmpty) return;
        final bytes = base64Decode(b64);
        setState(() {
          _frame = bytes;
          _phase = _MirrorPhase.live;
        });
      } catch (_) {
        // ignore malformed frames
      }
    });
    socket.connect();
  }

  Future<void> _poll() async {
    final id = _sessionId;
    if (id == null) return;
    if (_phase != _MirrorPhase.waiting && _phase != _MirrorPhase.live) {
      _pollTimer?.cancel();
      return;
    }
    try {
      final s = await ref.read(apiProvider).getScreenSession(id);
      if (!mounted) return;
      switch (s.status) {
        case 'live':
          setState(() => _phase = _MirrorPhase.live);
        case 'denied':
          setState(() => _phase = _MirrorPhase.denied);
          _pollTimer?.cancel();
          _teardownSocket();
        case 'expired':
          setState(() {
            _phase = _MirrorPhase.error;
            _error = 'Could not reach the device in time.';
          });
          _pollTimer?.cancel();
          _teardownSocket();
        case 'ended':
          setState(() => _phase = _MirrorPhase.ended);
          _pollTimer?.cancel();
          _teardownSocket();
        default:
          break;
      }
    } catch (_) {
      // keep waiting
    }
  }

  Future<void> _stop() async {
    final id = _sessionId;
    _pollTimer?.cancel();
    _teardownSocket();
    if (id != null) {
      try {
        await ref.read(apiProvider).endScreenSession(id);
      } catch (_) {}
    }
    if (!mounted) return;
    setState(() => _phase = _MirrorPhase.ended);
  }

  void _teardownSocket() {
    try {
      _socket?.dispose();
    } catch (_) {}
    _socket = null;
  }

  @override
  Widget build(BuildContext context) {
    final scheme = Theme.of(context).colorScheme;
    return Scaffold(
      backgroundColor: Colors.black,
      appBar: AppBar(
        title: Text('Live · ${widget.device.name}'),
        backgroundColor: Colors.black,
        foregroundColor: Colors.white,
        actions: [
          if (_phase == _MirrorPhase.live || _phase == _MirrorPhase.waiting)
            TextButton(
              onPressed: _stop,
              child: const Text('Stop', style: TextStyle(color: Colors.white)),
            ),
        ],
      ),
      body: Column(
        children: [
          _StatusBar(phase: _phase),
          Expanded(child: _body(scheme)),
          if (_phase == _MirrorPhase.ended ||
              _phase == _MirrorPhase.denied ||
              _phase == _MirrorPhase.error)
            SafeArea(
              child: Padding(
                padding: const EdgeInsets.all(16),
                child: Row(
                  children: [
                    Expanded(
                      child: OutlinedButton(
                        onPressed: () => Navigator.pop(context),
                        style: OutlinedButton.styleFrom(
                          foregroundColor: Colors.white,
                          side: const BorderSide(color: Colors.white54),
                        ),
                        child: const Text('Close'),
                      ),
                    ),
                    const SizedBox(width: 12),
                    Expanded(
                      child: FilledButton(
                        onPressed: _start,
                        child: const Text('Request again'),
                      ),
                    ),
                  ],
                ),
              ),
            ),
        ],
      ),
    );
  }

  Widget _body(ColorScheme scheme) {
    switch (_phase) {
      case _MirrorPhase.requesting:
        return const Center(
          child: CircularProgressIndicator(color: Colors.white),
        );
      case _MirrorPhase.waiting:
        return Center(
          child: Padding(
            padding: const EdgeInsets.all(32),
            child: Column(
              mainAxisSize: MainAxisSize.min,
              children: [
                const CircularProgressIndicator(color: AppColors.brandDark),
                const SizedBox(height: 20),
                Text(
                  'Connecting to ${widget.device.name}…',
                  textAlign: TextAlign.center,
                  style: const TextStyle(
                    color: Colors.white,
                    fontSize: 18,
                    fontWeight: FontWeight.w600,
                  ),
                ),
                const SizedBox(height: 8),
                Text(
                  'Connecting quietly — the child is not asked to approve.',
                  textAlign: TextAlign.center,
                  style: TextStyle(color: Colors.white.withValues(alpha: 0.7)),
                ),
              ],
            ),
          ),
        );
      case _MirrorPhase.live:
        if (_frame == null) {
          return const Center(
            child: Text('Connected — waiting for first frame…',
                style: TextStyle(color: Colors.white70)),
          );
        }
        return InteractiveViewer(
          child: Center(
            child: Image.memory(
              _frame!,
              gaplessPlayback: true,
              fit: BoxFit.contain,
            ),
          ),
        );
      case _MirrorPhase.denied:
        return const _Message(
          icon: Icons.block_rounded,
          title: 'Child declined',
          body: 'Screen sharing was denied on the device.',
          color: AppColors.alert,
        );
      case _MirrorPhase.ended:
        return const _Message(
          icon: Icons.stop_circle_outlined,
          title: 'Session ended',
          body: 'Live screen sharing has stopped.',
          color: AppColors.offline,
        );
      case _MirrorPhase.error:
        return _Message(
          icon: Icons.error_outline_rounded,
          title: 'Could not start',
          body: _error ?? 'Unknown error',
          color: AppColors.alert,
        );
    }
  }
}

class _StatusBar extends StatelessWidget {
  final _MirrorPhase phase;
  const _StatusBar({required this.phase});

  @override
  Widget build(BuildContext context) {
    late final String label;
    late final Color color;
    switch (phase) {
      case _MirrorPhase.requesting:
        label = 'Requesting…';
        color = AppColors.attention;
      case _MirrorPhase.waiting:
        label = 'Connecting…';
        color = AppColors.attention;
      case _MirrorPhase.live:
        label = 'LIVE';
        color = AppColors.online;
      case _MirrorPhase.denied:
        label = 'Denied';
        color = AppColors.alert;
      case _MirrorPhase.ended:
        label = 'Ended';
        color = AppColors.offline;
      case _MirrorPhase.error:
        label = 'Error';
        color = AppColors.alert;
    }
    return Container(
      width: double.infinity,
      padding: const EdgeInsets.symmetric(horizontal: 16, vertical: 8),
      color: color.withValues(alpha: 0.2),
      child: Text(
        label,
        textAlign: TextAlign.center,
        style: TextStyle(
          color: color,
          fontWeight: FontWeight.w700,
          letterSpacing: 0.4,
        ),
      ),
    );
  }
}

class _Message extends StatelessWidget {
  final IconData icon;
  final String title;
  final String body;
  final Color color;
  const _Message({
    required this.icon,
    required this.title,
    required this.body,
    required this.color,
  });

  @override
  Widget build(BuildContext context) {
    return Center(
      child: Padding(
        padding: const EdgeInsets.all(32),
        child: Column(
          mainAxisSize: MainAxisSize.min,
          children: [
            Icon(icon, size: 48, color: color),
            const SizedBox(height: 16),
            Text(title,
                style: const TextStyle(
                    color: Colors.white,
                    fontSize: 18,
                    fontWeight: FontWeight.w600)),
            const SizedBox(height: 8),
            Text(body,
                textAlign: TextAlign.center,
                style: TextStyle(color: Colors.white.withValues(alpha: 0.7))),
          ],
        ),
      ),
    );
  }
}
