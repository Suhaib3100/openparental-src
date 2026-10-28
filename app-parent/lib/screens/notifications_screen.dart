import 'package:flutter/material.dart';
import 'package:flutter_riverpod/flutter_riverpod.dart';

import '../api/models.dart';
import '../state/providers.dart';
import '../theme/app_theme.dart';

/// Shows the child's notification feed — all notifications captured from
/// the device, organized by app and time.
class NotificationsScreen extends ConsumerStatefulWidget {
  final String deviceId;
  final String deviceName;
  const NotificationsScreen({
    super.key,
    required this.deviceId,
    required this.deviceName,
  });

  @override
  ConsumerState<NotificationsScreen> createState() =>
      _NotificationsScreenState();
}

class _NotificationsScreenState extends ConsumerState<NotificationsScreen> {
  List<ContentItem> _items = [];
  bool _loading = true;
  String? _error;

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
      final items = await ref
          .read(apiProvider)
          .getContent(widget.deviceId, source: 'notification');
      setState(() {
        _items = items;
        _loading = false;
      });
    } catch (e) {
      setState(() {
        _error = '$e';
        _loading = false;
      });
    }
  }

  /// Group notifications by app package name
  Map<String, List<ContentItem>> get _grouped {
    final grouped = <String, List<ContentItem>>{};
    for (final item in _items) {
      final app = item.counterparty ?? 'Unknown';
      grouped.putIfAbsent(app, () => []).add(item);
    }
    return grouped;
  }

  /// Sort apps by most recent notification
  List<String> get _sortedApps {
    final apps = _grouped.keys.toList();
    apps.sort((a, b) {
      final aLatest = _grouped[a]!.first.occurredAt ?? DateTime(2000);
      final bLatest = _grouped[b]!.first.occurredAt ?? DateTime(2000);
      return bLatest.compareTo(aLatest);
    });
    return apps;
  }

  @override
  Widget build(BuildContext context) {
    final muted = Theme.of(context).colorScheme.onSurfaceVariant;

    return Scaffold(
      appBar: AppBar(
        title: Text('Notifications'),
        actions: [
          if (!_loading)
            Text('${_items.length}',
                style: TextStyle(fontSize: 14, color: muted)),
          const SizedBox(width: 4),
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
              : _items.isEmpty
                  ? _EmptyView()
                  : RefreshIndicator(
                      onRefresh: _load,
                      child: ListView(
                        padding:
                            const EdgeInsets.fromLTRB(16, 8, 16, 24),
                        children: [
                          for (final app in _sortedApps) ...[
                            _AppSection(
                              appName: app,
                              notifications: _grouped[app]!,
                            ),
                            const SizedBox(height: 12),
                          ],
                        ],
                      ),
                    ),
    );
  }
}

/// Section header + notifications for one app
class _AppSection extends StatelessWidget {
  final String appName;
  final List<ContentItem> notifications;
  const _AppSection({
    required this.appName,
    required this.notifications,
  });

  @override
  Widget build(BuildContext context) {
    final scheme = Theme.of(context).colorScheme;

    final appIcon = _appIcon(appName);
    final displayName = _appDisplayName(appName);

    return Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        // App header
        Row(
          children: [
            Container(
              width: 36,
              height: 36,
              decoration: BoxDecoration(
                color: appIcon.color.withValues(alpha: 0.12),
                borderRadius: BorderRadius.circular(10),
              ),
              child: Icon(appIcon.icon, size: 20, color: appIcon.color),
            ),
            const SizedBox(width: 10),
            Text(
              displayName,
              style: const TextStyle(
                fontSize: 15,
                fontWeight: FontWeight.w700,
              ),
            ),
            const Spacer(),
            Container(
              padding:
                  const EdgeInsets.symmetric(horizontal: 8, vertical: 3),
              decoration: BoxDecoration(
                color: scheme.onSurfaceVariant.withValues(alpha: 0.1),
                borderRadius: BorderRadius.circular(8),
              ),
              child: Text(
                '${notifications.length}',
                style: TextStyle(
                  fontSize: 11,
                  color: scheme.onSurfaceVariant,
                ),
              ),
            ),
          ],
        ),
        const SizedBox(height: 8),
        // Notification cards
        Card(
          margin: EdgeInsets.zero,
          child: Column(
            children: [
              for (int i = 0; i < notifications.length; i++) ...[
                if (i > 0)
                  const Divider(height: 1, indent: 16, endIndent: 16),
                _NotifRow(notification: notifications[i]),
              ],
            ],
          ),
        ),
      ],
    );
  }

  ({IconData icon, Color color}) _appIcon(String pkg) {
    final icons = <String, IconData>{
      'com.instagram.android': Icons.camera_alt_rounded,
      'com.google.android.apps.youtube': Icons.play_circle_filled_rounded,
      'com.zhiliaoapp.musically': Icons.music_note_rounded,
      'com.twitter.android': Icons.alternate_email_rounded,
      'com.snapchat.android': Icons.chat_bubble_rounded,
      'com.facebook.katana': Icons.facebook_rounded,
      'com.facebook.orca': Icons.message_rounded,
      'com.whatsapp': Icons.chat_rounded,
      'org.telegram.messenger': Icons.send_rounded,
      'com.discord': Icons.headset_mic_rounded,
      'com.reddit.frontpage': Icons.forum_rounded,
      'com.google.android.gm': Icons.mail_rounded,
      'com.android.chrome': Icons.language_rounded,
      'com.brave.browser': Icons.language_rounded,
      'com.spotify.music': Icons.music_note_rounded,
      'com.netflix.mediaclient': Icons.movie_rounded,
      'com.amazon.avod.thirdpartyclient': Icons.play_circle_rounded,
      'com.amazon': Icons.shopping_bag_rounded,
      'com.myantra': Icons.shopping_bag_rounded,
      'com.flipkart.android': Icons.shopping_cart_rounded,
    };
    final icon = icons[pkg] ?? Icons.notifications_rounded;
    return (icon: icon, color: AppColors.brand);
  }

  String _appDisplayName(String pkg) {
    final names = <String, String>{
      'com.instagram.android': 'Instagram',
      'com.google.android.apps.youtube': 'YouTube',
      'com.zhiliaoapp.musically': 'TikTok',
      'com.twitter.android': 'X',
      'com.snapchat.android': 'Snapchat',
      'com.facebook.katana': 'Facebook',
      'com.facebook.orca': 'Messenger',
      'com.whatsapp': 'WhatsApp',
      'org.telegram.messenger': 'Telegram',
      'com.discord': 'Discord',
      'com.reddit.frontpage': 'Reddit',
      'com.google.android.gm': 'Gmail',
      'com.android.chrome': 'Chrome',
      'com.brave.browser': 'Brave',
      'com.spotify.music': 'Spotify',
      'com.netflix.mediaclient': 'Netflix',
      'com.amazon.avod.thirdpartyclient': 'Prime Video',
      'com.amazon': 'Amazon',
      'com.myantra': 'Myntra',
      'com.flipkart.android': 'Flipkart',
    };
    return names[pkg] ?? pkg.split('.').last;
  }
}

/// One notification row in the list
class _NotifRow extends StatelessWidget {
  final ContentItem notification;
  const _NotifRow({required this.notification});

  @override
  Widget build(BuildContext context) {
    final muted = Theme.of(context).colorScheme.onSurfaceVariant;

    // Parse the body which is: "title · text · subText · ..."
    final parts = notification.body.split(' · ');
    final title = parts.isNotEmpty ? parts[0] : '';
    final body = parts.length > 1 ? parts.skip(1).join(' · ') : '';
    final timeStr = notification.occurredAt != null
        ? _formatTime(notification.occurredAt!)
        : '';

    return InkWell(
      onTap: () => _showFull(context),
      child: Padding(
        padding: const EdgeInsets.fromLTRB(16, 10, 16, 10),
        child: Row(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Expanded(
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  if (title.isNotEmpty)
                    Text(
                      title,
                      maxLines: 1,
                      overflow: TextOverflow.ellipsis,
                      style: const TextStyle(
                        fontSize: 14,
                        fontWeight: FontWeight.w600,
                      ),
                    ),
                  if (body.isNotEmpty) ...[
                    const SizedBox(height: 2),
                    Text(
                      body,
                      maxLines: 2,
                      overflow: TextOverflow.ellipsis,
                      style: TextStyle(
                        fontSize: 13,
                        color: muted,
                        height: 1.3,
                      ),
                    ),
                  ],
                ],
              ),
            ),
            const SizedBox(width: 12),
            Text(
              timeStr,
              style: TextStyle(fontSize: 11, color: muted),
            ),
          ],
        ),
      ),
    );
  }

  String _formatTime(DateTime dt) {
    final now = DateTime.now();
    final diff = now.difference(dt);
    if (diff.inMinutes < 60) return '${diff.inMinutes}m';
    if (diff.inHours < 24) return '${diff.inHours}h';
    return '${dt.hour.toString().padLeft(2, '0')}:${dt.minute.toString().padLeft(2, '0')}';
  }

  void _showFull(BuildContext context) {
    final parts = notification.body.split(' · ');
    final title = parts.isNotEmpty ? parts[0] : '';
    final body = parts.length > 1 ? parts.skip(1).join(' · ') : '';

    showModalBottomSheet(
      context: context,
      builder: (sheet) => SafeArea(
        child: Padding(
          padding: const EdgeInsets.all(24),
          child: Column(
            mainAxisSize: MainAxisSize.min,
            crossAxisAlignment: CrossAxisAlignment.start,
            children: [
              if (title.isNotEmpty)
                Text(
                  title,
                  style: Theme.of(context)
                      .textTheme
                      .titleLarge
                      ?.copyWith(fontWeight: FontWeight.w700),
                ),
              if (body.isNotEmpty) ...[
                const SizedBox(height: 12),
                Text(body, style: const TextStyle(fontSize: 14, height: 1.4)),
              ],
              if (notification.occurredAt != null) ...[
                const SizedBox(height: 16),
                Text(
                  _formatTime(notification.occurredAt!),
                  style: TextStyle(
                    fontSize: 12,
                    color: Theme.of(context).colorScheme.onSurfaceVariant,
                  ),
                ),
              ],
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
        Icon(Icons.notifications_off_rounded, size: 52, color: muted),
        const SizedBox(height: 16),
        Text(
          'No notifications captured',
          textAlign: TextAlign.center,
          style: Theme.of(context)
              .textTheme
              .titleMedium
              ?.copyWith(fontWeight: FontWeight.w600),
        ),
        const SizedBox(height: 8),
        Text(
          'Notifications from the child\'s device will appear here.\n'
          'Make sure Notification Listener permission is granted in the child app.',
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
          'Could not load notifications',
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
