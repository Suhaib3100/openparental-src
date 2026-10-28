import 'package:flutter/material.dart';
import 'package:flutter_riverpod/flutter_riverpod.dart';

import '../api/models.dart';
import '../state/providers.dart';
import '../theme/app_theme.dart';

/// Shows browsing history captured from browser notifications.
/// Has History and Blocked tabs.
class BrowserSafetyScreen extends ConsumerStatefulWidget {
  final String deviceId;
  final String deviceName;
  const BrowserSafetyScreen({
    super.key,
    required this.deviceId,
    required this.deviceName,
  });

  @override
  ConsumerState<BrowserSafetyScreen> createState() =>
      _BrowserSafetyScreenState();
}

class _BrowserSafetyScreenState extends ConsumerState<BrowserSafetyScreen>
    with SingleTickerProviderStateMixin {
  late TabController _tabCtrl;
  List<ContentItem> _history = [];
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
      final items = await ref
          .read(apiProvider)
          .getContent(widget.deviceId, source: 'browser');
      setState(() {
        _history = items;
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
        title: const Text('Browser Safety'),
        bottom: TabBar(
          controller: _tabCtrl,
          tabs: const [
            Tab(icon: Icon(Icons.history_rounded), text: 'History'),
            Tab(icon: Icon(Icons.block_rounded), text: 'Blocked'),
          ],
        ),
        actions: [
          if (!_loading)
            Text('${_history.length}',
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
              : TabBarView(
                  controller: _tabCtrl,
                  children: [
                    _HistoryTab(items: _history, onRefresh: _load),
                    const _BlockedTab(),
                  ],
                ),
    );
  }
}

/// Browsing history list
class _HistoryTab extends StatelessWidget {
  final List<ContentItem> items;
  final VoidCallback onRefresh;

  const _HistoryTab({required this.items, required this.onRefresh});

  @override
  Widget build(BuildContext context) {
    if (items.isEmpty) {
      final muted = Theme.of(context).colorScheme.onSurfaceVariant;
      return ListView(
        padding: const EdgeInsets.fromLTRB(32, 60, 32, 32),
        children: [
          Icon(Icons.language_rounded, size: 52, color: muted),
          const SizedBox(height: 16),
          Text(
            'No browsing history yet',
            textAlign: TextAlign.center,
            style: Theme.of(context)
                .textTheme
                .titleMedium
                ?.copyWith(fontWeight: FontWeight.w600),
          ),
          const SizedBox(height: 8),
          Text(
            'Browser activity will appear here when the child '
            'uses Chrome, Brave, Firefox, or other browsers.',
            textAlign: TextAlign.center,
            style: TextStyle(color: muted, height: 1.4),
          ),
        ],
      );
    }

    return RefreshIndicator(
      onRefresh: () async => onRefresh(),
      child: ListView.separated(
        padding: const EdgeInsets.fromLTRB(16, 12, 16, 24),
        itemCount: items.length,
        separatorBuilder: (_, __) =>
            const Divider(height: 1, indent: 16, endIndent: 16),
        itemBuilder: (ctx, i) => _BrowserCard(item: items[i]),
      ),
    );
  }
}

/// One browser visit entry
class _BrowserCard extends StatelessWidget {
  final ContentItem item;
  const _BrowserCard({required this.item});

  @override
  Widget build(BuildContext context) {
    final scheme = Theme.of(context).colorScheme;
    final muted = scheme.onSurfaceVariant;

    final browserName = _browserName(item.counterparty ?? '');
    final browserIcon = _browserIcon(item.counterparty ?? '');
    final timeStr = _formatTime(item.occurredAt);

    // Parse URL from body
    final url = _extractUrl(item.body);
    final pageTitle = item.body.split(' · ').firstOrNull ?? '';

    return InkWell(
      onTap: () => _showUrl(context, url),
      child: Padding(
        padding: const EdgeInsets.symmetric(vertical: 10),
        child: Row(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Container(
              width: 40,
              height: 40,
              decoration: BoxDecoration(
                color: browserIcon.color.withValues(alpha: 0.12),
                borderRadius: BorderRadius.circular(10),
              ),
              child: Icon(browserIcon.icon, size: 22, color: browserIcon.color),
            ),
            const SizedBox(width: 12),
            Expanded(
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  Text(
                    pageTitle.isNotEmpty ? pageTitle : '(browser visit)',
                    maxLines: 1,
                    overflow: TextOverflow.ellipsis,
                    style: const TextStyle(
                      fontSize: 14,
                      fontWeight: FontWeight.w600,
                    ),
                  ),
                  const SizedBox(height: 2),
                  Text(
                    url,
                    maxLines: 1,
                    overflow: TextOverflow.ellipsis,
                    style: TextStyle(fontSize: 11, color: muted),
                  ),
                  const SizedBox(height: 4),
                  Row(
                    children: [
                      Text(browserName,
                          style: TextStyle(fontSize: 11, color: muted)),
                      const SizedBox(width: 8),
                      Icon(Icons.access_time_rounded,
                          size: 11, color: muted),
                      const SizedBox(width: 3),
                      Text(timeStr,
                          style: TextStyle(fontSize: 11, color: muted)),
                    ],
                  ),
                ],
              ),
            ),
            const SizedBox(width: 4),
            TextButton(
              onPressed: () => _showUrl(context, url),
              style: TextButton.styleFrom(
                padding: const EdgeInsets.symmetric(horizontal: 8),
                minimumSize: Size.zero,
                tapTargetSize: MaterialTapTargetSize.shrinkWrap,
              ),
              child: Text('Operate >',
                  style: TextStyle(fontSize: 11, color: AppColors.brand)),
            ),
          ],
        ),
      ),
    );
  }

  ({IconData icon, Color color}) _browserIcon(String pkg) {
    switch (pkg) {
      case 'com.android.chrome':
        return (icon: Icons.language_rounded, color: Colors.green);
      case 'com.brave.browser':
      case 'com.brave.browser_default':
        return (icon: Icons.shield_rounded, color: Colors.orange);
      case 'org.mozilla.firefox':
      case 'org.mozilla.firefox_beta':
        return (icon: Icons.local_fire_department_rounded, color: Colors.orange);
      case 'com.microsoft.edge':
        return (icon: Icons.language_rounded, color: Colors.blue);
      case 'com.duckduckgo.mobile.android':
        return (icon: Icons.search_rounded, color: Colors.orange);
      default:
        return (icon: Icons.public_rounded, color: Colors.grey);
    }
  }

  String _browserName(String pkg) {
    switch (pkg) {
      case 'com.android.chrome':
        return 'Chrome';
      case 'com.brave.browser':
      case 'com.brave.browser_default':
        return 'Brave';
      case 'org.mozilla.firefox':
      case 'org.mozilla.firefox_beta':
        return 'Firefox';
      case 'com.opera.browser':
        return 'Opera';
      case 'com.microsoft.edge':
        return 'Edge';
      case 'com.duckduckgo.mobile.android':
        return 'DuckDuckGo';
      case 'com.vivaldi.browser':
        return 'Vivaldi';
      case 'mark.via.gp':
        return 'Via';
      default:
        return pkg.split('.').last;
    }
  }

  String _extractUrl(String body) {
    // Try to find a URL in the body
    final urlMatch = RegExp(r'https?://[^\s·]+').firstMatch(body);
    if (urlMatch != null) return urlMatch.group(0)!;

    // Fallback: notification content
    final parts = body.split(' · ');
    for (final part in parts.reversed) {
      if (part.contains('.') && part.length > 10) return part.trim();
    }
    return body.isNotEmpty ? body.split(' · ').last : '(no data)';
  }

  String _formatTime(DateTime? dt) {
    if (dt == null) return '';
    final now = DateTime.now();
    final diff = now.difference(dt);
    if (diff.inMinutes < 60) return '${diff.inMinutes}m ago';
    if (diff.inHours < 24) return '${diff.inHours}h ago';
    return '${dt.day}/${dt.month} ${dt.hour.toString().padLeft(2, '0')}:${dt.minute.toString().padLeft(2, '0')}';
  }

  void _showUrl(BuildContext context, String url) {
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
                'URL Details',
                style: Theme.of(context)
                    .textTheme
                    .titleMedium
                    ?.copyWith(fontWeight: FontWeight.w700),
              ),
              const SizedBox(height: 12),
              SelectableText(
                url,
                style: const TextStyle(fontSize: 13, height: 1.4),
              ),
              if (item.occurredAt != null) ...[
                const SizedBox(height: 12),
                Text(
                  'Visited ${_formatTime(item.occurredAt)}',
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

/// Blocked domains from the family DNS policy (plus built-in Cloudflare Families).
class _BlockedTab extends ConsumerStatefulWidget {
  const _BlockedTab();

  @override
  ConsumerState<_BlockedTab> createState() => _BlockedTabState();
}

class _BlockedTabState extends ConsumerState<_BlockedTab> {
  List<String> _domains = const [];
  bool _loading = true;

  @override
  void initState() {
    super.initState();
    _load();
  }

  Future<void> _load() async {
    try {
      final rules = await ref.read(apiProvider).getPolicy();
      final domains =
          (rules?['blockedDomains'] as List?)?.cast<String>() ?? const [];
      if (mounted) {
        setState(() {
          _domains = domains;
          _loading = false;
        });
      }
    } catch (_) {
      if (mounted) setState(() => _loading = false);
    }
  }

  @override
  Widget build(BuildContext context) {
    final muted = Theme.of(context).colorScheme.onSurfaceVariant;

    if (_loading) {
      return const Center(child: CircularProgressIndicator());
    }

    if (_domains.isEmpty) {
      return ListView(
        padding: const EdgeInsets.fromLTRB(32, 60, 32, 32),
        children: [
          Icon(Icons.shield_rounded, size: 52, color: Colors.green.shade300),
          const SizedBox(height: 16),
          Text(
            'DNS filter active',
            textAlign: TextAlign.center,
            style: Theme.of(context)
                .textTheme
                .titleMedium
                ?.copyWith(fontWeight: FontWeight.w600),
          ),
          const SizedBox(height: 8),
          Text(
            'Cloudflare Families blocks adult and malware domains by default. '
            'Add custom domains under Devices → Family policy → DNS.',
            textAlign: TextAlign.center,
            style: TextStyle(color: muted, height: 1.4),
          ),
          const SizedBox(height: 24),
          FilledButton.icon(
            onPressed: _load,
            icon: const Icon(Icons.refresh_rounded),
            label: const Text('Refresh'),
          ),
        ],
      );
    }

    return RefreshIndicator(
      onRefresh: _load,
      child: ListView.separated(
        padding: const EdgeInsets.fromLTRB(16, 12, 16, 24),
        itemCount: _domains.length + 1,
        separatorBuilder: (_, __) =>
            const Divider(height: 1, indent: 16, endIndent: 16),
        itemBuilder: (ctx, i) {
          if (i == 0) {
            return Padding(
              padding: const EdgeInsets.fromLTRB(8, 8, 8, 4),
              child: Text(
                '${_domains.length} custom blocked domain(s)',
                style: TextStyle(fontSize: 13, color: muted),
              ),
            );
          }
          final domain = _domains[i - 1];
          return ListTile(
            leading: const Icon(Icons.block_rounded, color: AppColors.attention),
            title: Text(domain),
            subtitle: Text('Blocked by family DNS policy',
                style: TextStyle(fontSize: 12, color: muted)),
          );
        },
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
        Text('Could not load browsing data',
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
