import 'package:flutter/material.dart';
import 'package:flutter_riverpod/flutter_riverpod.dart';

import '../state/providers.dart';
import '../theme/app_theme.dart';
import '../theme/status.dart';
import '../widgets/ui.dart';
import 'live_mirror_screen.dart';
import '../api/models.dart';

/// Consent-based remote camera and screen recording, plus live screen mirror.
class SnapshotScreen extends ConsumerWidget {
  final Device device;
  const SnapshotScreen({
    super.key,
    required this.device,
  });

  @override
  Widget build(BuildContext context, WidgetRef ref) {
    final scheme = Theme.of(context).colorScheme;
    final muted = scheme.onSurfaceVariant;
    final status = deviceStatusStyle(device.status);

    return Scaffold(
      appBar: AppBar(title: const Text('Snapshot & Recording')),
      body: ListView(
        padding: const EdgeInsets.fromLTRB(20, 8, 20, 32),
        children: [
          // Device info header
          Card(
            child: Padding(
              padding: const EdgeInsets.all(16),
              child: Row(
                children: [
                  Container(
                    width: 40,
                    height: 40,
                    decoration: BoxDecoration(
                      color: AppColors.brand.withValues(alpha: 0.12),
                      borderRadius: BorderRadius.circular(10),
                    ),
                    child: const Icon(Icons.smartphone_rounded,
                        color: AppColors.brand, size: 22),
                  ),
                  const SizedBox(width: 12),
                  Expanded(
                    child: Column(
                      crossAxisAlignment: CrossAxisAlignment.start,
                      children: [
                        Text(device.name,
                            style: const TextStyle(
                                fontSize: 15, fontWeight: FontWeight.w600)),
                        Text('Consent-based remote actions',
                            style: TextStyle(fontSize: 12, color: muted)),
                      ],
                    ),
                  ),
                  Row(
                    mainAxisSize: MainAxisSize.min,
                    children: [
                      StatusDot(status.color, size: 8),
                      const SizedBox(width: 6),
                      Text(status.label,
                          style: TextStyle(
                              fontSize: 11,
                              color: status.color,
                              fontWeight: FontWeight.w600)),
                    ],
                  ),
                ],
              ),
            ),
          ),
          const SizedBox(height: 12),

          // Camera Snapshot
          Card(
            child: Padding(
              padding: const EdgeInsets.all(16),
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  Row(
                    children: [
                      Container(
                        width: 44,
                        height: 44,
                        decoration: BoxDecoration(
                          color: AppColors.brand.withValues(alpha: 0.12),
                          borderRadius: BorderRadius.circular(12),
                        ),
                        child: const Icon(Icons.camera_alt_rounded,
                            color: AppColors.brand, size: 24),
                      ),
                      const SizedBox(width: 12),
                      Expanded(
                        child: Column(
                          crossAxisAlignment: CrossAxisAlignment.start,
                          children: [
                            const Text('Camera Snapshot',
                                style: TextStyle(
                                    fontSize: 15,
                                    fontWeight: FontWeight.w600)),
                            Text(
                                'Take a photo using the child\'s camera',
                                style: TextStyle(fontSize: 12, color: muted)),
                          ],
                        ),
                      ),
                    ],
                  ),
                  const SizedBox(height: 16),
                  Row(
                    children: [
                      Expanded(
                        child: _ActionButton(
                          icon: Icons.camera_front_rounded,
                          label: 'Front Camera',
                          onTap: () => _sendCommand(
                              context, ref, 'CAMERA_SNAPSHOT',
                              {'camera': 'front'}),
                        ),
                      ),
                      const SizedBox(width: 10),
                      Expanded(
                        child: _ActionButton(
                          icon: Icons.camera_rear_rounded,
                          label: 'Rear Camera',
                          onTap: () => _sendCommand(
                              context, ref, 'CAMERA_SNAPSHOT',
                              {'camera': 'rear'}),
                        ),
                      ),
                    ],
                  ),
                ],
              ),
            ),
          ),
          const SizedBox(height: 12),

          // Screen Recording
          Card(
            child: Padding(
              padding: const EdgeInsets.all(16),
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  Row(
                    children: [
                      Container(
                        width: 44,
                        height: 44,
                        decoration: BoxDecoration(
                          color: AppColors.alert.withValues(alpha: 0.12),
                          borderRadius: BorderRadius.circular(12),
                        ),
                        child: const Icon(Icons.record_voice_over_rounded,
                            color: AppColors.alert, size: 24),
                      ),
                      const SizedBox(width: 12),
                      Expanded(
                        child: Column(
                          crossAxisAlignment: CrossAxisAlignment.start,
                          children: [
                            const Text('Screen Recording',
                                style: TextStyle(
                                    fontSize: 15,
                                    fontWeight: FontWeight.w600)),
                            Text('Record the child\'s screen',
                                style: TextStyle(fontSize: 12, color: muted)),
                          ],
                        ),
                      ),
                    ],
                  ),
                  const SizedBox(height: 16),
                  Row(
                    children: [
                      Expanded(
                        child: _ActionButton(
                          icon: Icons.fiber_manual_record_rounded,
                          label: 'Start Recording',
                          color: AppColors.alert,
                          onTap: () => _sendCommand(
                              context, ref, 'SCREEN_RECORD',
                              {'action': 'start'}),
                        ),
                      ),
                      const SizedBox(width: 10),
                      Expanded(
                        child: _ActionButton(
                          icon: Icons.stop_rounded,
                          label: 'Stop Recording',
                          color: AppColors.offline,
                          onTap: () => _sendCommand(
                              context, ref, 'SCREEN_RECORD',
                              {'action': 'stop'}),
                        ),
                      ),
                    ],
                  ),
                ],
              ),
            ),
          ),
          const SizedBox(height: 12),

          // Screen Mirroring
          Card(
            child: Padding(
              padding: const EdgeInsets.all(16),
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  Row(
                    children: [
                      Container(
                        width: 44,
                        height: 44,
                        decoration: BoxDecoration(
                          color: AppColors.online.withValues(alpha: 0.12),
                          borderRadius: BorderRadius.circular(12),
                        ),
                        child: const Icon(Icons.screen_share_rounded,
                            color: AppColors.online, size: 24),
                      ),
                      const SizedBox(width: 12),
                      Expanded(
                        child: Column(
                          crossAxisAlignment: CrossAxisAlignment.start,
                          children: [
                            const Text('Screen Mirroring',
                                style: TextStyle(
                                    fontSize: 15,
                                    fontWeight: FontWeight.w600)),
                            Text('View child\'s screen in real time',
                                style: TextStyle(fontSize: 12, color: muted)),
                          ],
                        ),
                      ),
                    ],
                  ),
                  const SizedBox(height: 16),
                  SizedBox(
                    width: double.infinity,
                    child: FilledButton.icon(
                      onPressed: () => Navigator.push(
                        context,
                        MaterialPageRoute<void>(
                          builder: (_) => LiveMirrorScreen(device: device),
                        ),
                      ),
                      icon: const Icon(Icons.screen_share_rounded),
                      label: const Text('Open Live Screen'),
                    ),
                  ),
                  const SizedBox(height: 8),
                  Text(
                    'Starts immediately if screen monitoring was granted during child setup.',
                    style: TextStyle(fontSize: 11, color: muted),
                  ),
                ],
              ),
            ),
          ),

          // Consent notice
          const SizedBox(height: 16),
          Card(
            child: Padding(
              padding: const EdgeInsets.all(14),
              child: Row(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  Icon(Icons.info_outline_rounded,
                      size: 18, color: AppColors.attention),
                  const SizedBox(width: 10),
                  Expanded(
                    child: Text(
                      'OpenParental does not support ambient or covert audio. '
                      'Camera and screen record show on the child device. Live '
                      'screen uses access granted at setup.',
                      style: TextStyle(fontSize: 12, color: muted, height: 1.4),
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

  Future<void> _sendCommand(BuildContext context, WidgetRef ref,
      String type, Map<String, dynamic> payload) async {
    final messenger = ScaffoldMessenger.of(context);
    try {
      await ref.read(apiProvider).sendCommand(device.id, type, payload);
      messenger.showSnackBar(
        SnackBar(
          content: Text('$type command sent to ${device.name}'),
          behavior: SnackBarBehavior.floating,
        ),
      );
    } catch (e) {
      messenger.showSnackBar(
        SnackBar(
          content: Text('Failed: $e'),
          behavior: SnackBarBehavior.floating,
          backgroundColor: AppColors.alert,
        ),
      );
    }
  }
}

class _ActionButton extends StatelessWidget {
  final IconData icon;
  final String label;
  final VoidCallback onTap;
  final Color? color;

  const _ActionButton({
    required this.icon,
    required this.label,
    required this.onTap,
    this.color,
  });

  @override
  Widget build(BuildContext context) {
    final c = color ?? AppColors.brand;
    return OutlinedButton.icon(
      onPressed: onTap,
      icon: Icon(icon, size: 18),
      label: Text(label, style: const TextStyle(fontSize: 12.5)),
      style: OutlinedButton.styleFrom(
        foregroundColor: c,
        side: BorderSide(color: c.withValues(alpha: 0.3)),
        padding: const EdgeInsets.symmetric(vertical: 12),
        shape: RoundedRectangleBorder(
          borderRadius: BorderRadius.circular(12),
        ),
      ),
    );
  }
}
