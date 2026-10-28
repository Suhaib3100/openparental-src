import 'package:flutter/material.dart';
import 'package:flutter_riverpod/flutter_riverpod.dart';

import '../api/models.dart';
import '../state/providers.dart';
import '../theme/app_theme.dart';
import '../widgets/ui.dart';

/// Displays keyword detections from social apps for a specific device.
/// Shows flagged notifications with matched keywords like Drugs, Alcohol, etc.
class KeywordDetectionScreen extends ConsumerStatefulWidget {
  final String deviceId;
  final String deviceName;
  const KeywordDetectionScreen({
    super.key,
    required this.deviceId,
    required this.deviceName,
  });

  @override
  ConsumerState<KeywordDetectionScreen> createState() =>
      _KeywordDetectionScreenState();
}

class _KeywordDetectionScreenState
    extends ConsumerState<KeywordDetectionScreen> {
  List<ContentItem> _items = [];
  bool _loading = true;
  String? _error;

  // Category filter
  String? _selectedCategory;

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
          .getContent(widget.deviceId, source: 'keyword');
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

  List<ContentItem> get _filtered {
    if (_selectedCategory == null) return _items;
    return _items.where((i) => i.matched == _selectedCategory).toList();
  }

  Set<String> get _categories =>
      _items.map((i) => i.matched ?? 'Unknown').toSet();

  @override
  Widget build(BuildContext context) {
    final scheme = Theme.of(context).colorScheme;
    final muted = scheme.onSurfaceVariant;

    return Scaffold(
      appBar: AppBar(
        title: Text('Keyword Detection'),
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
              ? _ErrorView(
                  error: _error!,
                  onRetry: _load,
                )
              : _items.isEmpty
                  ? _EmptyView()
                  : Column(
                      children: [
                        // Category filter chips
                        _CategoryBar(
                          categories: _categories,
                          selected: _selectedCategory,
                          onSelect: (c) =>
                              setState(() => _selectedCategory = c),
                        ),
                        // Summary header
                        Padding(
                          padding: const EdgeInsets.fromLTRB(20, 8, 20, 0),
                          child: Row(
                            children: [
                              Icon(Icons.warning_amber_rounded,
                                  size: 16, color: AppColors.alert),
                              const SizedBox(width: 6),
                              Text(
                                '${_filtered.length} flag${_filtered.length == 1 ? '' : 's'} found',
                                style: TextStyle(
                                  color: muted,
                                  fontSize: 13,
                                ),
                              ),
                              const Spacer(),
                              Text(
                                'Device: ${widget.deviceName}',
                                style: TextStyle(
                                  color: muted,
                                  fontSize: 12,
                                ),
                              ),
                            ],
                          ),
                        ),
                        const SizedBox(height: 8),
                        // List of detections
                        Expanded(
                          child: RefreshIndicator(
                            onRefresh: _load,
                            child: ListView.builder(
                              padding: const EdgeInsets.fromLTRB(
                                  16, 0, 16, 24),
                              itemCount: _filtered.length + 1,
                              itemBuilder: (ctx, i) {
                                if (i == 0) {
                                  if (_selectedCategory != null) {
                                    return Padding(
                                      padding:
                                          const EdgeInsets.only(bottom: 8),
                                      child: TextButton.icon(
                                        onPressed: () => setState(
                                            () => _selectedCategory = null),
                                        icon: const Icon(
                                            Icons.clear_rounded, size: 16),
                                        label:
                                            const Text('Clear filter'),
                                      ),
                                    );
                                  }
                                  return const SizedBox.shrink();
                                }
                                return _KeywordCard(
                                  item: _filtered[i - 1],
                                );
                              },
                            ),
                          ),
                        ),
                      ],
                    ),
    );
  }
}

/// Category filter bar at the top
class _CategoryBar extends StatelessWidget {
  final Set<String> categories;
  final String? selected;
  final ValueChanged<String?> onSelect;

  const _CategoryBar({
    required this.categories,
    required this.selected,
    required this.onSelect,
  });

  @override
  Widget build(BuildContext context) {
    return Container(
      padding: const EdgeInsets.fromLTRB(16, 12, 16, 4),
      child: SingleChildScrollView(
        scrollDirection: Axis.horizontal,
        child: Row(
          children: [
            _Chip(
              label: 'All',
              selected: selected == null,
              color: null,
              onTap: () => onSelect(null),
            ),
            const SizedBox(width: 6),
            for (final cat in categories)
              Padding(
                padding: const EdgeInsets.only(right: 6),
                child: _Chip(
                  label: _labelForCategory(cat),
                  selected: selected == cat,
                  color: _colorForCategory(cat),
                  onTap: () => onSelect(selected == cat ? null : cat),
                ),
              ),
          ],
        ),
      ),
    );
  }

  Widget _Chip({
    required String label,
    required bool selected,
    required Color? color,
    required VoidCallback onTap,
  }) {
    return FilterChip(
      label: Text(label, style: const TextStyle(fontSize: 13)),
      selected: selected,
      onSelected: (_) => onTap(),
      selectedColor: (color ?? Colors.grey).withValues(alpha: 0.2),
      checkmarkColor: color ?? Colors.grey,
      visualDensity: VisualDensity.compact,
    );
  }

  Color _colorForCategory(String cat) {
    switch (cat.toLowerCase()) {
      case 'drugs':
        return AppColors.alert;
      case 'alcohol':
        return Colors.orange;
      case 'suicide':
      case 'suicide & self harm':
        return Colors.red;
      case 'violence':
      case 'violence & bullying':
        return Colors.deepOrange;
      case 'sexual':
      case 'sexual content':
        return Colors.purple;
      case 'predator':
      case 'grooming / predator':
        return Colors.red.shade900;
      default:
        return Colors.grey;
    }
  }

  String _labelForCategory(String cat) {
    switch (cat.toLowerCase()) {
      case 'drugs':
        return '💊 Drugs';
      case 'alcohol':
        return '🍺 Alcohol';
      case 'suicide':
      case 'suicide & self harm':
        return '⚠️ Suicide';
      case 'violence':
      case 'violence & bullying':
        return '🔪 Violence';
      case 'sexual':
      case 'sexual content':
        return '🔞 Sexual';
      case 'predator':
      case 'grooming / predator':
        return '🚨 Predator';
      default:
        return cat;
    }
  }
}

/// Card showing one keyword detection
class _KeywordCard extends StatelessWidget {
  final ContentItem item;
  const _KeywordCard({required this.item});

  @override
  Widget build(BuildContext context) {
    final scheme = Theme.of(context).colorScheme;
    final muted = scheme.onSurfaceVariant;

    final catColor = _matchColor(item.matched);
    final timeStr = item.occurredAt != null
        ? timeAgo(item.occurredAt)
        : '';

    return Card(
      margin: const EdgeInsets.only(bottom: 10),
      child: Padding(
        padding: const EdgeInsets.all(14),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            // Header row: category badge + timestamp
            Row(
              children: [
                Container(
                  padding:
                      const EdgeInsets.symmetric(horizontal: 8, vertical: 3),
                  decoration: BoxDecoration(
                    color: catColor.withValues(alpha: 0.15),
                    borderRadius: BorderRadius.circular(6),
                  ),
                  child: Text(
                    item.matched ?? 'Unknown',
                    style: TextStyle(
                      color: catColor,
                      fontSize: 11.5,
                      fontWeight: FontWeight.w700,
                    ),
                  ),
                ),
                const SizedBox(width: 8),
                Text(
                  timeStr,
                  style: TextStyle(fontSize: 11.5, color: muted),
                ),
              ],
            ),
            const SizedBox(height: 10),
            // Body text
            Text(
              item.body.isNotEmpty ? item.body : '(no text)',
              maxLines: 4,
              overflow: TextOverflow.ellipsis,
              style: TextStyle(
                fontSize: 14,
                color: scheme.onSurface,
                height: 1.35,
              ),
            ),
            // Counterparty if present
            if (item.counterparty != null &&
                item.counterparty!.isNotEmpty) ...[
              const SizedBox(height: 6),
              Row(
                children: [
                  Icon(Icons.person_outline_rounded,
                      size: 14, color: muted),
                  const SizedBox(width: 4),
                  Text(
                    item.counterparty!,
                    style: TextStyle(fontSize: 12, color: muted),
                  ),
                ],
              ),
            ],
            const SizedBox(height: 6),
            // Source label
            Align(
              alignment: Alignment.bottomRight,
              child: Text(
                _sourceLabel(item.body),
                style: TextStyle(fontSize: 10, color: muted),
              ),
            ),
          ],
        ),
      ),
    );
  }

  Color _matchColor(String? matched) {
    switch (matched?.toLowerCase() ?? '') {
      case 'drugs':
        return AppColors.alert;
      case 'alcohol':
        return Colors.orange;
      case 'suicide':
      case 'suicide & self harm':
        return Colors.red;
      case 'violence':
      case 'violence & bullying':
        return Colors.deepOrange;
      case 'sexual':
      case 'sexual content':
        return Colors.purple;
      case 'predator':
      case 'grooming / predator':
        return Colors.red.shade900;
      default:
        return Colors.grey;
    }
  }

  String _sourceLabel(String body) {
    if (body.isEmpty) return '';
    // Try to determine source from body content patterns
    return 'Notification scan';
  }
}

/// Empty state when no keyword detections exist
class _EmptyView extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    final muted = Theme.of(context).colorScheme.onSurfaceVariant;
    return ListView(
      padding: const EdgeInsets.fromLTRB(32, 80, 32, 32),
      children: [
        Icon(Icons.security_rounded, size: 52, color: Colors.green.shade300),
        const SizedBox(height: 16),
        Text(
          'No keyword flags',
          textAlign: TextAlign.center,
          style: Theme.of(context)
              .textTheme
              .titleMedium
              ?.copyWith(fontWeight: FontWeight.w600),
        ),
        const SizedBox(height: 8),
        Text(
          'No suspicious keywords detected yet. '
          'Keywords are scanned from social media notifications '
          '(Instagram, TikTok, YouTube, etc.).',
          textAlign: TextAlign.center,
          style: TextStyle(color: muted, height: 1.4),
        ),
      ],
    );
  }
}

/// Error state with retry button
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
          'Could not load flags',
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
