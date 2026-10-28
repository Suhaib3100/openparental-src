import 'package:flutter/material.dart';
import 'package:flutter_riverpod/flutter_riverpod.dart';

import '../api/models.dart';
import '../state/providers.dart';
/// Shows watch history from YouTube & TikTok — video titles, channel names,
/// and timestamps. Mirrors the FlashGet Kids \"TikTok & YouTube History\" screen.
class WatchHistoryScreen extends ConsumerStatefulWidget {
  final String deviceId;
  final String deviceName;
  const WatchHistoryScreen({
    super.key,
    required this.deviceId,
    required this.deviceName,
  });

  @override
  ConsumerState<WatchHistoryScreen> createState() =>
      _WatchHistoryScreenState();
}

class _WatchHistoryScreenState extends ConsumerState<WatchHistoryScreen>
    with SingleTickerProviderStateMixin {
  late TabController _tabCtrl;
  List<ContentItem> _youtube = [];
  List<ContentItem> _tiktok = [];
  bool _loading = true;
  String? _error;

  @override
  void initState() {
    super.initState();
    _tabCtrl = TabController(length: 2, vsync: this);
    _load();
  }

  @override
  void dispose() {
    _tabCtrl.dispose();
    super.dispose();
  }

  Future<void> _load() async {
    setState(() {
      _loading = true;
      _error = null;
    });
    try {
      final results = await Future.wait([
        ref.read(apiProvider).getContent(widget.deviceId, source: 'youtube'),
        ref.read(apiProvider).getContent(widget.deviceId, source: 'tiktok'),
      ]);
      setState(() {
        _youtube = results[0];
        _tiktok = results[1];
        _loading = false;
      });
    } catch (e) {
      setState(() {
        _error = '$e';
        _loading = false;
      });
    }
  }

  @override
  Widget build(BuildContext context) {
    final muted = Theme.of(context).colorScheme.onSurfaceVariant;

    return Scaffold(
      appBar: AppBar(
        title: const Text('Watch History'),
        bottom: TabBar(
          controller: _tabCtrl,
          tabs: [
            Tab(
              icon: Icon(Icons.play_circle_filled_rounded,
                  color: Colors.red.shade400),
              text: 'YouTube',
            ),
            Tab(
              icon: Icon(Icons.music_note_rounded,
                  color: _tiktokColor()),
              text: 'TikTok',
            ),
          ],
        ),
        actions: [
          if (!_loading)
            Text(
              '${_youtube.length + _tiktok.length}',
              style: TextStyle(fontSize: 14, color: muted),
            ),
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
              : TabBarView(
                  controller: _tabCtrl,
                  children: [
                    _MediaList(
                      items: _youtube,
                      emptyMsg:
                          'No YouTube history yet.\nWatch videos on YouTube to see them here.',
                      accentColor: Colors.red.shade400,
                      platform: 'youtube',
                    ),
                    _MediaList(
                      items: _tiktok,
                      emptyMsg:
                          'No TikTok history yet.\nWatch videos on TikTok to see them here.',
                      accentColor: _tiktokColor(),
                      platform: 'tiktok',
                    ),
                  ],
                ),
    );
  }

  Color _tiktokColor() {
    // TikTok uses a specific black/cyan/red palette
    return const Color(0xFF00F2EA);
  }
}

/// List of watch history items for one platform
class _MediaList extends StatelessWidget {
  final List<ContentItem> items;
  final String emptyMsg;
  final Color accentColor;
  final String platform;

  const _MediaList({
    required this.items,
    required this.emptyMsg,
    required this.accentColor,
    required this.platform,
  });

  @override
  Widget build(BuildContext context) {
    if (items.isEmpty) {
      final muted = Theme.of(context).colorScheme.onSurfaceVariant;
      return ListView(
        padding: const EdgeInsets.fromLTRB(32, 60, 32, 32),
        children: [
          Icon(
            platform == 'youtube'
                ? Icons.play_circle_outline_rounded
                : Icons.music_note_outlined,
            size: 52,
            color: muted,
          ),
          const SizedBox(height: 16),
          Text(
            'No history yet',
            textAlign: TextAlign.center,
            style: Theme.of(context)
                .textTheme
                .titleMedium
                ?.copyWith(fontWeight: FontWeight.w600),
          ),
          const SizedBox(height: 8),
          Text(
            emptyMsg,
            textAlign: TextAlign.center,
            style: TextStyle(color: muted, height: 1.4),
          ),
        ],
      );
    }

    return RefreshIndicator(
      onRefresh: () => Future<void>.value(),
      child: ListView.separated(
        padding: const EdgeInsets.fromLTRB(16, 12, 16, 24),
        itemCount: items.length,
        separatorBuilder: (_, __) => const Divider(height: 1, indent: 72),
        itemBuilder: (ctx, i) => _WatchCard(
          item: items[i],
          accentColor: accentColor,
          platform: platform,
        ),
      ),
    );
  }
}

/// A single watch history entry — video title + channel
class _WatchCard extends StatelessWidget {
  final ContentItem item;
  final Color accentColor;
  final String platform;

  const _WatchCard({
    required this.item,
    required this.accentColor,
    required this.platform,
  });

  @override
  Widget build(BuildContext context) {
    final scheme = Theme.of(context).colorScheme;
    final muted = scheme.onSurfaceVariant;

    // Parse the notification body: "title · text · ..."
    final parts = item.body.split(' · ');
    final title = parts.isNotEmpty ? parts[0] : '';
    final body = parts.length > 1 ? parts.skip(1).join(' · ') : '';

    // Try to extract channel name and video title from notification text
    final channelName = _extractChannel(title, body);
    final videoTitle = _extractVideoTitle(body, title);

    final timeStr = item.occurredAt != null ? _formatTime(item.occurredAt!) : '';

    return InkWell(
      onTap: () => _showDetails(context),
      child: Padding(
        padding: const EdgeInsets.symmetric(vertical: 10),
        child: Row(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            // Thumbnail placeholder
            Container(
              width: 56,
              height: 56,
              decoration: BoxDecoration(
                color: accentColor.withValues(alpha: 0.1),
                borderRadius: BorderRadius.circular(12),
              ),
              child: Icon(
                platform == 'youtube'
                    ? Icons.play_arrow_rounded
                    : Icons.music_note_rounded,
                color: accentColor,
                size: 28,
              ),
            ),
            const SizedBox(width: 12),
            Expanded(
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  Text(
                    videoTitle,
                    maxLines: 2,
                    overflow: TextOverflow.ellipsis,
                    style: const TextStyle(
                      fontSize: 14,
                      fontWeight: FontWeight.w600,
                      height: 1.2,
                    ),
                  ),
                  const SizedBox(height: 4),
                  Row(
                    children: [
                      Icon(Icons.person_rounded, size: 13, color: muted),
                      const SizedBox(width: 3),
                      Flexible(
                        child: Text(
                          channelName,
                          maxLines: 1,
                          overflow: TextOverflow.ellipsis,
                          style: TextStyle(fontSize: 12, color: muted),
                        ),
                      ),
                    ],
                  ),
                  const SizedBox(height: 2),
                  Text(
                    timeStr,
                    style: TextStyle(fontSize: 11, color: muted),
                  ),
                ],
              ),
            ),
            const SizedBox(width: 8),
            Icon(Icons.chevron_right_rounded, size: 18, color: muted),
          ],
        ),
      ),
    );
  }

  String _extractChannel(String title, String body) {
    // YouTube: "@ChannelName" or "ChannelName"
    final atMatch = RegExp(r'@(\w[\w.]*)').firstMatch('$title $body');
    if (atMatch != null) return '@${atMatch.group(1)}';

    // Fallback: look for common patterns
    if (title.contains('YouTube') || title.contains('TikTok')) {
      return body.split(' ').first;
    }
    return title.isNotEmpty ? title : 'Unknown';
  }

  String _extractVideoTitle(String body, String title) {
    // Take the first non-empty, non-@ segment
    final segments = '$body $title'.split(' · ');
    for (final seg in segments) {
      final s = seg.trim();
      if (s.isNotEmpty && !s.startsWith('@') && s.length > 3) {
        return s;
      }
    }
    return title.isNotEmpty ? title : body;
  }

  String _formatTime(DateTime dt) {
    final now = DateTime.now();
    final diff = now.difference(dt);
    if (diff.inMinutes < 60) return '${diff.inMinutes}m ago';
    if (diff.inHours < 24) return '${diff.inHours}h ago';
    if (diff.inDays < 7) return '${diff.inDays}d ago';
    return '${dt.day}/${dt.month}';
  }

  void _showDetails(BuildContext context) {
    final parts = item.body.split(' · ');
    final title = parts.isNotEmpty ? parts[0] : '';
    final body_text = parts.length > 1 ? parts.skip(1).join(' · ') : '';

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
                'Video Details',
                style: Theme.of(context).textTheme.titleMedium?.copyWith(
                      fontWeight: FontWeight.w700,
                    ),
              ),
              const SizedBox(height: 12),
              if (title.isNotEmpty)
                Text('Channel: $title',
                    style: const TextStyle(fontSize: 14)),
              if (body_text.isNotEmpty) ...[
                const SizedBox(height: 8),
                Text(body_text,
                    style: const TextStyle(fontSize: 14, height: 1.4)),
              ],
              if (item.occurredAt != null) ...[
                const SizedBox(height: 8),
                Text(
                  'Watched ${_formatTime(item.occurredAt!)}',
                  style: TextStyle(fontSize: 12, color: Theme.of(context).colorScheme.onSurfaceVariant),
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
        Text('Could not load history',
            textAlign: TextAlign.center,
            style: Theme.of(context).textTheme.titleMedium),
        const SizedBox(height: 8),
        Text(error,
            textAlign: TextAlign.center,
            style: TextStyle(color: muted, fontSize: 13)),
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
