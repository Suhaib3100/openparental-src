import 'package:flutter/material.dart';
import 'package:flutter_riverpod/flutter_riverpod.dart';
import 'package:url_launcher/url_launcher.dart';

import '../config/product_config.dart';
import '../state/providers.dart';
import '../theme/app_theme.dart';
import '../widgets/ui.dart';
import 'pairing_screen.dart';

/// FlashGet-style onboarding: parent app → child APK → pair → permission checklist.
class SetupWizardScreen extends ConsumerStatefulWidget {
  const SetupWizardScreen({super.key});

  @override
  ConsumerState<SetupWizardScreen> createState() => _SetupWizardScreenState();
}

class _SetupWizardScreenState extends ConsumerState<SetupWizardScreen> {
  final _page = PageController();
  int _step = 0;

  @override
  void dispose() {
    _page.dispose();
    super.dispose();
  }

  void _go(int i) {
    setState(() => _step = i);
    _page.animateToPage(
      i,
      duration: const Duration(milliseconds: 280),
      curve: Curves.easeOutCubic,
    );
  }

  Future<void> _openChildDownload() async {
    final uri = Uri.parse(ProductConfig.childApkDownloadUrl);
    if (!await launchUrl(uri, mode: LaunchMode.externalApplication)) {
      if (mounted) {
        ScaffoldMessenger.of(context).showSnackBar(
          SnackBar(content: Text('Could not open ${uri.toString()}')),
        );
      }
    }
  }

  Future<void> _startPairing() async {
    final messenger = ScaffoldMessenger.of(context);
    final navigator = Navigator.of(context);
    try {
      final pairing = await ref.read(apiProvider).createPairing();
      if (!mounted) return;
      await navigator.push(
        MaterialPageRoute<void>(
          builder: (_) => PairingScreen(pairing: pairing),
        ),
      );
      ref.invalidate(devicesProvider);
      if (mounted) navigator.pop(context);
    } catch (e) {
      messenger.showSnackBar(SnackBar(content: Text('Pairing failed: $e')));
    }
  }

  @override
  Widget build(BuildContext context) {
    final scheme = Theme.of(context).colorScheme;
    return Scaffold(
      appBar: AppBar(
        title: const Text('Get started'),
        bottom: PreferredSize(
          preferredSize: const Size.fromHeight(4),
          child: LinearProgressIndicator(
            value: (_step + 1) / 4,
            backgroundColor: scheme.surfaceContainerHighest,
          ),
        ),
      ),
      body: Column(
        children: [
          Expanded(
            child: PageView(
              controller: _page,
              physics: const NeverScrollableScrollPhysics(),
              onPageChanged: (i) => setState(() => _step = i),
              children: [
                _StepWelcome(onNext: () => _go(1)),
                _StepChildApk(onBack: () => _go(0), onNext: () => _go(2)),
                _StepPair(onBack: () => _go(1), onPair: _startPairing),
                _StepPermissions(onBack: () => _go(2), onDone: () => Navigator.pop(context)),
              ],
            ),
          ),
          Padding(
            padding: const EdgeInsets.fromLTRB(20, 8, 20, 24),
            child: Text(
              '${ProductConfig.brandName} — same setup flow as leading parental apps, '
              'your server and your brand.',
              textAlign: TextAlign.center,
              style: TextStyle(fontSize: 12, color: scheme.onSurfaceVariant),
            ),
          ),
        ],
      ),
    );
  }
}

class _StepWelcome extends StatelessWidget {
  final VoidCallback onNext;
  const _StepWelcome({required this.onNext});

  @override
  Widget build(BuildContext context) {
    final scheme = Theme.of(context).colorScheme;
    return _StepShell(
      icon: Icons.shield_rounded,
      iconColor: AppColors.brand,
      title: 'Welcome to ${ProductConfig.brandName}',
      body:
          'Install ${ProductConfig.brandName} on your phone (parent) and on each '
          'child phone. After pairing, you control rules and live monitoring from here.',
      children: [
        Card(
          child: ListTile(
            leading: const SoftIcon(Icons.check_circle_rounded, AppColors.online),
            title: const Text('Parent app'),
            subtitle: const Text('This device — you’re in the right place'),
          ),
        ),
        const SizedBox(height: 24),
        FilledButton(onPressed: onNext, child: const Text('Continue')),
      ],
      muted: scheme.onSurfaceVariant,
    );
  }
}

class _StepChildApk extends StatelessWidget {
  final VoidCallback onBack;
  final VoidCallback onNext;
  const _StepChildApk({required this.onBack, required this.onNext});

  @override
  Widget build(BuildContext context) {
    final scheme = Theme.of(context).colorScheme;
    return _StepShell(
      icon: Icons.download_rounded,
      iconColor: AppColors.attention,
      title: 'Install on child’s phone',
      body:
          'On the child device, sideload the OpenParental child APK '
          '(${ProductConfig.childPackageName}). FlashGet uses a separate installer app; '
          'we ship one child APK you install directly (installer module coming).',
      children: [
        OutlinedButton.icon(
          onPressed: () async {
            final uri = Uri.parse(ProductConfig.childApkDownloadUrl);
            await launchUrl(uri, mode: LaunchMode.externalApplication);
          },
          icon: const Icon(Icons.open_in_new_rounded),
          label: const Text('Open child APK download'),
        ),
        const SizedBox(height: 12),
        OutlinedButton.icon(
          onPressed: () async {
            final uri = Uri.parse(ProductConfig.setupDocUrl);
            await launchUrl(uri, mode: LaunchMode.externalApplication);
          },
          icon: const Icon(Icons.menu_book_outlined),
          label: const Text('Build / install instructions'),
        ),
        const SizedBox(height: 28),
        Row(
          children: [
            TextButton(onPressed: onBack, child: const Text('Back')),
            const Spacer(),
            FilledButton(onPressed: onNext, child: const Text('Child app installed')),
          ],
        ),
      ],
      muted: scheme.onSurfaceVariant,
    );
  }
}

class _StepPair extends StatelessWidget {
  final VoidCallback onBack;
  final VoidCallback onPair;
  const _StepPair({required this.onBack, required this.onPair});

  @override
  Widget build(BuildContext context) {
    final scheme = Theme.of(context).colorScheme;
    return _StepShell(
      icon: Icons.qr_code_rounded,
      iconColor: AppColors.brand,
      title: 'Bind the child device',
      body:
          'Open the child app, set your server URL, and enter the pairing code '
          'shown on the next screen (same bind step as FlashGet Kids).',
      children: [
        FilledButton.icon(
          onPressed: onPair,
          icon: const Icon(Icons.link_rounded),
          label: const Text('Create pairing code'),
        ),
        const SizedBox(height: 28),
        Row(
          children: [
            TextButton(onPressed: onBack, child: const Text('Back')),
          ],
        ),
      ],
      muted: scheme.onSurfaceVariant,
    );
  }
}

class _StepPermissions extends StatelessWidget {
  final VoidCallback onBack;
  final VoidCallback onDone;
  const _StepPermissions({required this.onBack, required this.onDone});

  @override
  Widget build(BuildContext context) {
    final scheme = Theme.of(context).colorScheme;
    const items = [
      ('Accessibility', 'App limits & screen enforcement'),
      ('Device admin', 'Remote lock'),
      ('Notifications', 'Alert when protection is off'),
      ('Usage access', 'Screen time reports'),
      ('Location', 'Map & geofence (when enabled)'),
      ('VPN / DNS filter', 'Browser safety domains'),
      ('Screen capture', 'Live screen (granted at setup)'),
      ('Battery unrestricted', 'Survive overnight on OEM phones'),
    ];
    return _StepShell(
      icon: Icons.fact_check_rounded,
      iconColor: AppColors.online,
      title: 'Finish on the child phone',
      body:
          'Complete Permissions & setup in the child app (same checklist family as FlashGet). '
          'The child always sees that monitoring is on.',
      children: [
        Card(
          child: Column(
            children: [
              for (var i = 0; i < items.length; i++) ...[
                if (i > 0) const Divider(height: 1, indent: 16, endIndent: 16),
                ListTile(
                  dense: true,
                  leading: Icon(Icons.circle, size: 8, color: AppColors.brand),
                  title: Text(items[i].$1,
                      style: const TextStyle(fontWeight: FontWeight.w600)),
                  subtitle: Text(items[i].$2),
                ),
              ],
            ],
          ),
        ),
        const SizedBox(height: 24),
        Row(
          children: [
            TextButton(onPressed: onBack, child: const Text('Back')),
            const Spacer(),
            FilledButton(onPressed: onDone, child: const Text('Done')),
          ],
        ),
      ],
      muted: scheme.onSurfaceVariant,
    );
  }
}

class _StepShell extends StatelessWidget {
  final IconData icon;
  final Color iconColor;
  final String title;
  final String body;
  final List<Widget> children;
  final Color muted;

  const _StepShell({
    required this.icon,
    required this.iconColor,
    required this.title,
    required this.body,
    required this.children,
    required this.muted,
  });

  @override
  Widget build(BuildContext context) {
    return ListView(
      padding: const EdgeInsets.fromLTRB(24, 16, 24, 24),
      children: [
        Center(
          child: Container(
            width: 72,
            height: 72,
            decoration: BoxDecoration(
              color: iconColor.withValues(alpha: 0.12),
              borderRadius: BorderRadius.circular(20),
            ),
            child: Icon(icon, size: 36, color: iconColor),
          ),
        ),
        const SizedBox(height: 20),
        Text(
          title,
          textAlign: TextAlign.center,
          style: Theme.of(context)
              .textTheme
              .headlineSmall
              ?.copyWith(fontWeight: FontWeight.w700),
        ),
        const SizedBox(height: 12),
        Text(
          body.replaceAll('**', ''),
          textAlign: TextAlign.center,
          style: TextStyle(color: muted, height: 1.45, fontSize: 15),
        ),
        const SizedBox(height: 28),
        ...children,
      ],
    );
  }
}
