import 'package:flutter/material.dart';
import 'package:flutter_riverpod/flutter_riverpod.dart';

import '../api/models.dart';
import '../state/providers.dart';
import '../theme/app_theme.dart';

/// Chronological feed of device events — screen lock/unlock, app usage, etc.
/// Mirroring the "Usage Logs" screen from FlashGet Kids.
class UsageLogsScreen extends ConsumerStatefulWidget {
  final String deviceId;
  final String deviceName;
  const UsageLogsScreen({
    super.key,
    required this.deviceId,
    required this.deviceName,
  });

  @override
  ConsumerState<UsageLogsScreen> createState() => _UsageLogsScreenState();
}

class _UsageLogsScreenState extends ConsumerState<UsageLogsScreen> {
  List<EventLog> _events = [];
  bool _loading = true;
  String? _error;
  String? _filterType;

  @override
  void initState() {
    super.initState();
    _load();
  }

  Future<void> _load() async {
    setState(() {
      _loading = true;
      _error = null;
    });
    try {
      final items = await ref.read(apiProvider).getEvents(widget.deviceId);
      setState(() {
        _events = items;
        _loading = false;
      });
    } catch (e) {
      setState(() {
        _error = '$e';
        _loading = false;
      });
    }
  }

  List<EventLog> get _filtered {
    if (_filterType == null) return _events;
    return _events.where((e) => e.type == _filterType).toList();
  }

  /// Group events by date for the timeline.
  Map<String, List<EventLog>> get _grouped {
    final grouped = <String, List<EventLog>>{};
    for (final event in _filtered) {
      final day = _dateLabel(event.occurredAt);
      grouped.putIfAbsent(day, () => []).add(event);
    }
    return grouped;
  }

  String _dateLabel(DateTime dt) {
    final now = DateTime.now();
    final today = DateTime(now.year, now.month, now.day);
    final date = DateTime(dt.year, dt.month, dt.day);
    if (date == today) return 'Today';
    if (date == today.subtract(const Duration(days: 1))) return 'Yesterday';
    return '${dt.day}/${dt.month}/${dt.year}';
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Usage Logs'),
        actions: [
          IconButton(
            icon: const Icon(Icons.refresh_rounded),
            onPressed: _load,
            tooltip: 'Refresh',
          ),
        ],
      ),
      body: _loading
          ? const Center(child: CircularProgressIndicator())
          : _error != null
              ? _ErrorView(error: _error!, onRetry: _load)
              : _events.isEmpty
                  ? _EmptyView()
                  : Column(
                      children: [
                        _FilterBar(
                          selected: _filterType,
                          onSelect: (t) =>
                              setState(() => _filterType = t),
                          hasActiveFilter: _filterType != null,
                          onClear: () => setState(() => _filterType = null),
                        ),
                        Expanded(
                          child: RefreshIndicator(
                            onRefresh: _load,
                            child: ListView(
                              padding:
                                  const EdgeInsets.fromLTRB(16, 4, 16, 24),
                              children: [
                                // Summary
                                Padding(
                                  padding:
                                      const EdgeInsets.only(left: 4, bottom: 8),
                                  child: Text(
                                    '${_filtered.length} event${_filtered.length == 1 ? '' : 's'} · ${widget.deviceName}',
                                    style: TextStyle(
                                      fontSize: 13,
                                      color: Theme.of(context)
                                          .colorScheme
                                          .onSurfaceVariant,
                                    ),
                                  ),
                                ),
                                // Timeline
                                for (final entry in _grouped.entries) ...[
                                  _DateHeader(entry.key, entry.value.length),
                                  ...entry.value.map(_EventCard.new),
                                ],
                              ],
                            ),
                          ),
                        ),
                      ],
                    ),
    );
  }
}

/// Date section header in the timeline
class _DateHeader extends StatelessWidget {
  final String label;
  final int count;
  const _DateHeader(this.label, this.count);

  @override
  Widget build(BuildContext context) {
    final muted = Theme.of(context).colorScheme.onSurfaceVariant;
    return Padding(
      padding: const EdgeInsets.fromLTRB(4, 16, 4, 8),
      child: Row(
        children: [
          Text(
            label,
            style: TextStyle(
              fontSize: 14,
              fontWeight: FontWeight.w700,
              color: muted,
            ),
          ),
          const SizedBox(width: 8),
          Container(
            padding: const EdgeInsets.symmetric(horizontal: 7, vertical: 2),
            decoration: BoxDecoration(
              color: muted.withValues(alpha: 0.12),
              borderRadius: BorderRadius.circular(8),
            ),
            child: Text(
              '$count',
              style: TextStyle(fontSize: 11, color: muted),
            ),
          ),
        ],
      ),
    );
  }
}

/// Filter bar at top
class _FilterBar extends StatelessWidget {
  final String? selected;
  final ValueChanged<String?> onSelect;
  final bool hasActiveFilter;
  final VoidCallback onClear;

  const _FilterBar({
    required this.selected,
    required this.onSelect,
    required this.hasActiveFilter,
    required this.onClear,
  });

  @override
  Widget build(BuildContext context) {
    return Container(
      padding: const EdgeInsets.fromLTRB(16, 8, 16, 4),
      child: Row(
        children: [
          Expanded(
            child: SingleChildScrollView(
              scrollDirection: Axis.horizontal,
              child: Row(
                children: [
                  _chip('All', null, selected),
                  const SizedBox(width: 6),
                  _chip('🔒 Screen', 'SCREEN_TIME', selected),
                  const SizedBox(width: 6),
                  _chip('📱 Apps', 'APP_FOREGROUND', selected),
                  const SizedBox(width: 6),
                  _chip('📥 Installed', 'APP_INSTALLED', selected),
                  const SizedBox(width: 6),
                  _chip('📊 Summary', 'USAGE_SUMMARY', selected),
                ],
              ),
            ),
          ),
          if (hasActiveFilter)
            TextButton(
              onPressed: onClear,
              child: const Text('Clear', style: TextStyle(fontSize: 12)),
            ),
        ],
      ),
    );
  }

  Widget _chip(String label, String? value, String? selected) {
    final isSelected = selected == value;
    return FilterChip(
      label: Text(label, style: const TextStyle(fontSize: 12)),
      selected: isSelected,
      onSelected: (_) => onSelect(value),
      visualDensity: VisualDensity.compact,
    );
  }
}

/// Card showing one event in the timeline
class _EventCard extends StatelessWidget {
  final EventLog event;
  const _EventCard(this.event);

  @override
  Widget build(BuildContext context) {
    final scheme = Theme.of(context).colorScheme;
    final muted = scheme.onSurfaceVariant;

    final iconInfo = _eventIcon(event);
    final timeStr = _formatTime(event.occurredAt);

    return Padding(
      padding: const EdgeInsets.only(bottom: 2),
      child: Card(
        margin: EdgeInsets.zero,
        child: ListTile(
          dense: true,
          leading: Container(
            width: 38,
            height: 38,
            decoration: BoxDecoration(
              color: iconInfo.color.withValues(alpha: 0.1),
              borderRadius: BorderRadius.circular(10),
            ),
            child: Icon(iconInfo.icon, size: 20, color: iconInfo.color),
          ),
          title: Text(
            iconInfo.title,
            style: const TextStyle(
              fontSize: 14,
              fontWeight: FontWeight.w500,
            ),
          ),
          subtitle: Text(
            event.type == 'APP_FOREGROUND'
                ? _appName(event.data)
                : event.type == 'SCREEN_TIME'
                    ? _screenAction(event.data)
                    : event.type == 'USAGE_SUMMARY'
                        ? _summaryText(event.data)
                        : event.type == 'APP_INSTALLED'
                            ? 'New app: ${_appName(event.data)}'
                            : event.type,
            style: TextStyle(fontSize: 12, color: muted),
          ),
          trailing: Text(
            timeStr,
            style: TextStyle(fontSize: 11, color: muted),
          ),
          onTap: event.type == 'APP_FOREGROUND'
              ? () => _showDetails(context, event)
              : null,
        ),
      ),
    );
  }

  ({IconData icon, Color color, String title}) _eventIcon(EventLog e) {
    switch (e.type) {
      case 'SCREEN_TIME':
        final action = e.data['action'] as String? ?? '';
        if (action == 'LOCK') {
          return (
            icon: Icons.lock_rounded,
            color: AppColors.alert,
            title: 'Lock the Screen',
          );
        } else if (action == 'UNLOCK') {
          return (
            icon: Icons.lock_open_rounded,
            color: AppColors.online,
            title: 'Unlock the Screen',
          );
        } else {
          return (
            icon: Icons.screen_lock_portrait_rounded,
            color: AppColors.attention,
            title: 'Screen On',
          );
        }
      case 'APP_FOREGROUND':
        final pkg = e.data['packageName'] as String? ?? '';
        final appName = _appNameFromPkg(pkg);
        return (
          icon: Icons.open_in_new_rounded,
          color: AppColors.brand,
          title: 'Use $appName',
        );
      case 'APP_INSTALLED':
        return (
          icon: Icons.download_rounded,
          color: AppColors.brand,
          title: 'App Installed',
        );
      case 'APP_REMOVED':
        return (
          icon: Icons.delete_outline_rounded,
          color: AppColors.alert,
          title: 'App Removed',
        );
      case 'USAGE_SUMMARY':
        return (
          icon: Icons.bar_chart_rounded,
          color: AppColors.offline,
          title: 'Usage Summary',
        );
      default:
        return (
          icon: Icons.circle_rounded,
          color: AppColors.offline,
          title: e.type,
        );
    }
  }

  String _screenAction(Map<String, dynamic> data) {
    final action = data['action'] as String? ?? '';
    switch (action) {
      case 'LOCK':
        return 'Device was locked';
      case 'UNLOCK':
        return 'Device was unlocked';
      default:
        return 'Screen state changed';
    }
  }

  String _appName(Map<String, dynamic> data) {
    final pkg = data['packageName'] as String? ?? data['package'] as String? ?? '';
    return _appNameFromPkg(pkg);
  }

  String _appNameFromPkg(String pkg) {
    final names = {
      'com.instagram.android': 'Instagram',
      'com.google.android.apps.youtube': 'YouTube',
      'com.zhiliaoapp.musically': 'TikTok',
      'com.twitter.android': 'X / Twitter',
      'com.snapchat.android': 'Snapchat',
      'com.facebook.katana': 'Facebook',
      'com.facebook.orca': 'Messenger',
      'com.whatsapp': 'WhatsApp',
      'org.telegram.messenger': 'Telegram',
      'com.discord': 'Discord',
      'com.reddit.frontpage': 'Reddit',
      'com.google.android.apps.maps': 'Maps',
      'com.google.android.apps.photos': 'Photos',
      'com.google.android.gm': 'Gmail',
      'com.android.chrome': 'Chrome',
      'com.brave.browser': 'Brave',
      'com.spotify.music': 'Spotify',
      'com.netflix.mediaclient': 'Netflix',
      'com.amazon.avod.thirdpartyclient': 'Prime Video',
    };
    return names[pkg] ?? pkg.split('.').last;
  }

  String _summaryText(Map<String, dynamic> data) {
    final minutesByApp = data['minutesByApp'] as Map<String, dynamic>?;
    if (minutesByApp == null || minutesByApp.isEmpty) return 'No app data';
    final entries = minutesByApp.entries
        .map((e) => '${_appNameFromPkg(e.key)}: ${e.value} min')
        .join(', ');
    return entries;
  }

  String _formatTime(DateTime dt) {
    final now = DateTime.now();
    final diff = now.difference(dt);
    if (diff.inMinutes < 60) return '${diff.inMinutes} min ago';
    if (diff.inHours < 24) return '${diff.inHours} hr ago';
    return '${dt.hour.toString().padLeft(2, '0')}:${dt.minute.toString().padLeft(2, '0')}';
  }

  void _showDetails(BuildContext context, EventLog event) {
    final appName = event.type == 'APP_FOREGROUND'
        ? _appName(event.data)
        : event.type;
    final pkg = event.data['packageName'] as String? ?? '';

    showModalBottomSheet(
      context: context,
      builder: (sheet) => SafeArea(
        child: Padding(
          padding: const EdgeInsets.all(24),
          child: Column(
            mainAxisSize: MainAxisSize.min,
            crossAxisAlignment: CrossAxisAlignment.start,
            children: [
              Text(
                appName,
                style: Theme.of(context)
                    .textTheme
                    .titleLarge
                    ?.copyWith(fontWeight: FontWeight.w700),
              ),
              const SizedBox(height: 8),
              if (pkg.isNotEmpty)
                Text(
                  'Package: $pkg',
                  style: TextStyle(
                    fontSize: 13,
                    color: Theme.of(context).colorScheme.onSurfaceVariant,
                  ),
                ),
              const SizedBox(height: 4),
              Text(
                'Opened ${_formatTime(event.occurredAt)}',
                style: TextStyle(
                  fontSize: 13,
                  color: Theme.of(context).colorScheme.onSurfaceVariant,
                ),
              ),
              const SizedBox(height: 24),
              FilledButton(
                onPressed: () => Navigator.pop(sheet),
                child: const Text('Close'),
              ),
            ],
          ),
        ),
      ),
    );
  }
}

class _EmptyView extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    final muted = Theme.of(context).colorScheme.onSurfaceVariant;
    return ListView(
      padding: const EdgeInsets.fromLTRB(32, 80, 32, 32),
      children: [
        Icon(Icons.history_rounded, size: 52, color: muted),
        const SizedBox(height: 16),
        Text(
          'No usage logs yet',
          textAlign: TextAlign.center,
          style: Theme.of(context)
              .textTheme
              .titleMedium
              ?.copyWith(fontWeight: FontWeight.w600),
        ),
        const SizedBox(height: 8),
        Text(
          'Usage logs will appear here as the child uses the device — '
          'screen locks, app launches, and more.',
          textAlign: TextAlign.center,
          style: TextStyle(color: muted, height: 1.4),
        ),
      ],
    );
  }
}

class _ErrorView extends StatelessWidget {
  final String error;
  final VoidCallback onRetry;
  const _ErrorView({required this.error, required this.onRetry});

  @override
  Widget build(BuildContext context) {
    final muted = Theme.of(context).colorScheme.onSurfaceVariant;
    return ListView(
      padding: const EdgeInsets.fromLTRB(32, 80, 32, 32),
      children: [
        Icon(Icons.cloud_off_rounded, size: 52, color: muted),
        const SizedBox(height: 16),
        Text(
          'Could not load logs',
          textAlign: TextAlign.center,
          style: Theme.of(context).textTheme.titleMedium,
        ),
        const SizedBox(height: 8),
        Text(
          error,
          textAlign: TextAlign.center,
          style: TextStyle(color: muted, fontSize: 13),
        ),
        const SizedBox(height: 24),
        FilledButton.icon(
          onPressed: onRetry,
          icon: const Icon(Icons.refresh_rounded),
          label: const Text('Retry'),
        ),
      ],
    );
  }
}
