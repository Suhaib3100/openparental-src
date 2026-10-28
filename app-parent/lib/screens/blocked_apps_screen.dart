import 'package:flutter/material.dart';
import 'package:flutter_riverpod/flutter_riverpod.dart';

import '../state/providers.dart';
import '../theme/app_theme.dart';
import '../widgets/ui.dart';

/// Family policy editor: blocked apps, per-app limits, bedtime schedule, and
/// custom DNS blocklist. Saving merges on the server so each tab can push
/// independently without wiping other rules.
class BlockedAppsScreen extends ConsumerStatefulWidget {
  const BlockedAppsScreen({super.key});

  @override
  ConsumerState<BlockedAppsScreen> createState() => _BlockedAppsScreenState();
}

class _BlockedAppsScreenState extends ConsumerState<BlockedAppsScreen>
    with SingleTickerProviderStateMixin {
  late TabController _tabs;
  final _blocked = TextEditingController();
  final _limits = TextEditingController();
  final _domains = TextEditingController();
  final _bedtimeStart = TextEditingController(text: '22:00');
  final _bedtimeEnd = TextEditingController(text: '06:30');
  bool _bedtimeEnabled = false;
  bool _loading = true;
  bool _busy = false;

  @override
  void initState() {
    super.initState();
    _tabs = TabController(length: 4, vsync: this);
    _load();
  }

  @override
  void dispose() {
    _tabs.dispose();
    _blocked.dispose();
    _limits.dispose();
    _domains.dispose();
    _bedtimeStart.dispose();
    _bedtimeEnd.dispose();
    super.dispose();
  }

  Future<void> _load() async {
    try {
      final rules = await ref.read(apiProvider).getPolicy();
      final blocked =
          (rules?['blockedApps'] as List?)?.cast<String>() ?? const [];
      _blocked.text = blocked.join(', ');

      final limits = (rules?['appLimits'] as List?) ?? const [];
      _limits.text = limits
          .map((e) {
            final m = e as Map<String, dynamic>;
            final pkg = m['pkg'] as String? ?? '';
            final mins = m['dailyMinutes'];
            return '$pkg=${mins ?? 0}';
          })
          .where((s) => s.isNotEmpty && !s.startsWith('='))
          .join('\n');

      final domains =
          (rules?['blockedDomains'] as List?)?.cast<String>() ?? const [];
      _domains.text = domains.join('\n');

      final schedules = (rules?['schedules'] as List?) ?? const [];
      Map<String, dynamic>? bedtime;
      for (final s in schedules) {
        final m = s as Map<String, dynamic>;
        if (m['blockAll'] == true) {
          bedtime = m;
          break;
        }
      }
      if (bedtime != null) {
        _bedtimeEnabled = true;
        _bedtimeStart.text = bedtime['start'] as String? ?? '22:00';
        _bedtimeEnd.text = bedtime['end'] as String? ?? '06:30';
      } else {
        _bedtimeEnabled = false;
      }
    } catch (_) {}
    if (mounted) setState(() => _loading = false);
  }

  List<String> _parseCommaList(String raw) => raw
      .split(RegExp(r'[,\n]'))
      .map((s) => s.trim())
      .where((s) => s.isNotEmpty)
      .toList();

  List<Map<String, dynamic>> _parseAppLimits(String raw) {
    final out = <Map<String, dynamic>>[];
    for (final line in raw.split('\n')) {
      final t = line.trim();
      if (t.isEmpty) continue;
      final eq = t.indexOf('=');
      if (eq <= 0) continue;
      final pkg = t.substring(0, eq).trim();
      final mins = int.tryParse(t.substring(eq + 1).trim());
      if (pkg.isNotEmpty && mins != null && mins > 0) {
        out.add({'pkg': pkg, 'dailyMinutes': mins});
      }
    }
    return out;
  }

  Future<void> _save(Map<String, dynamic> patch, String success) async {
    final messenger = ScaffoldMessenger.of(context);
    setState(() => _busy = true);
    try {
      await ref.read(apiProvider).updatePolicy(patch);
      messenger.showSnackBar(SnackBar(content: Text(success)));
    } catch (e) {
      messenger.showSnackBar(SnackBar(content: Text('Failed: $e')));
    } finally {
      if (mounted) setState(() => _busy = false);
    }
  }

  Future<void> _saveBlocked() async {
    await _save(
      {'blockedApps': _parseCommaList(_blocked.text)},
      'Blocked apps saved — pushed to your devices',
    );
  }

  Future<void> _saveLimits() async {
    await _save(
      {'appLimits': _parseAppLimits(_limits.text)},
      'Daily limits saved — pushed to your devices',
    );
  }

  Future<void> _saveDomains() async {
    await _save(
      {'blockedDomains': _parseCommaList(_domains.text)},
      'Blocked domains saved — DNS filter will update',
    );
  }

  Future<void> _saveBedtime() async {
    final schedules = _bedtimeEnabled
        ? [
            {
              'name': 'bedtime',
              'start': _bedtimeStart.text.trim(),
              'end': _bedtimeEnd.text.trim(),
              'blockAll': true,
            },
          ]
        : <Map<String, dynamic>>[];
    await _save(
      {'schedules': schedules},
      _bedtimeEnabled
          ? 'Bedtime schedule saved'
          : 'Bedtime schedule cleared',
    );
  }

  @override
  Widget build(BuildContext context) {
    final scheme = Theme.of(context).colorScheme;
    return Scaffold(
      appBar: AppBar(
        title: const Text('Family policy'),
        bottom: TabBar(
          controller: _tabs,
          isScrollable: true,
          tabs: const [
            Tab(text: 'Apps'),
            Tab(text: 'Limits'),
            Tab(text: 'Bedtime'),
            Tab(text: 'DNS'),
          ],
        ),
      ),
      body: _loading
          ? const Center(child: CircularProgressIndicator())
          : TabBarView(
              controller: _tabs,
              children: [
                _PolicyTab(
                  intro:
                      'Blocked apps bounce back to the home screen. The child '
                      'always sees that the app is blocked.',
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.stretch,
                    children: [
                      const SectionLabel('Package names'),
                      const SizedBox(height: 10),
                      TextField(
                        controller: _blocked,
                        minLines: 4,
                        maxLines: 8,
                        decoration: const InputDecoration(
                          hintText:
                              'com.zhiliaoapp.musically, com.instagram.android',
                        ),
                      ),
                      const SizedBox(height: 16),
                      FilledButton(
                        onPressed: _busy ? null : _saveBlocked,
                        child: const Text('Save blocked apps'),
                      ),
                    ],
                  ),
                ),
                _PolicyTab(
                  intro:
                      'Per-app daily limits in minutes. One line per app: '
                      'package=dailyMinutes.',
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.stretch,
                    children: [
                      const SectionLabel('Daily limits'),
                      const SizedBox(height: 10),
                      TextField(
                        controller: _limits,
                        minLines: 4,
                        maxLines: 10,
                        decoration: const InputDecoration(
                          hintText:
                              'com.instagram.android=60\ncom.zhiliaoapp.musically=30',
                        ),
                      ),
                      const SizedBox(height: 16),
                      FilledButton(
                        onPressed: _busy ? null : _saveLimits,
                        child: const Text('Save limits'),
                      ),
                    ],
                  ),
                ),
                _PolicyTab(
                  intro:
                      'During bedtime, all apps are blocked except essentials '
                      '(phone, OpenParental). Uses device local time.',
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.stretch,
                    children: [
                      SwitchListTile(
                        contentPadding: EdgeInsets.zero,
                        title: const Text('Bedtime schedule'),
                        subtitle: Text(
                          'Block all apps overnight',
                          style: TextStyle(
                            fontSize: 13,
                            color: scheme.onSurfaceVariant,
                          ),
                        ),
                        value: _bedtimeEnabled,
                        onChanged: _busy
                            ? null
                            : (v) => setState(() => _bedtimeEnabled = v),
                      ),
                      const SizedBox(height: 8),
                      Row(
                        children: [
                          Expanded(
                            child: TextField(
                              controller: _bedtimeStart,
                              enabled: _bedtimeEnabled && !_busy,
                              decoration: const InputDecoration(
                                labelText: 'Start (HH:mm)',
                                hintText: '22:00',
                              ),
                            ),
                          ),
                          const SizedBox(width: 12),
                          Expanded(
                            child: TextField(
                              controller: _bedtimeEnd,
                              enabled: _bedtimeEnabled && !_busy,
                              decoration: const InputDecoration(
                                labelText: 'End (HH:mm)',
                                hintText: '06:30',
                              ),
                            ),
                          ),
                        ],
                      ),
                      const SizedBox(height: 16),
                      FilledButton(
                        onPressed: _busy ? null : _saveBedtime,
                        child: const Text('Save bedtime'),
                      ),
                    ],
                  ),
                ),
                _PolicyTab(
                  intro:
                      'Extra domains blocked by the child app\'s DNS-only VPN '
                      '(Cloudflare Families is the default upstream).',
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.stretch,
                    children: [
                      const SectionLabel('Blocked domains'),
                      const SizedBox(height: 10),
                      TextField(
                        controller: _domains,
                        minLines: 4,
                        maxLines: 10,
                        decoration: const InputDecoration(
                          hintText: 'badexample.com\nanother.example',
                        ),
                      ),
                      const SizedBox(height: 16),
                      FilledButton(
                        onPressed: _busy ? null : _saveDomains,
                        child: const Text('Save domains'),
                      ),
                    ],
                  ),
                ),
              ],
            ),
    );
  }
}

class _PolicyTab extends StatelessWidget {
  final String intro;
  final Widget child;

  const _PolicyTab({required this.intro, required this.child});

  @override
  Widget build(BuildContext context) {
    final scheme = Theme.of(context).colorScheme;
    return ListView(
      padding: const EdgeInsets.fromLTRB(20, 8, 20, 32),
      children: [
        Card(
          child: Padding(
            padding: const EdgeInsets.all(16),
            child: Row(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                const SoftIcon(Icons.rule_rounded, AppColors.brand),
                const SizedBox(width: 12),
                Expanded(
                  child: Text(
                    intro,
                    style: TextStyle(
                      color: scheme.onSurfaceVariant,
                      fontSize: 13,
                      height: 1.4,
                    ),
                  ),
                ),
              ],
            ),
          ),
        ),
        const SizedBox(height: 20),
        child,
      ],
    );
  }
}
