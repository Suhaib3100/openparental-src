import 'package:flutter/material.dart';
import 'package:flutter_riverpod/flutter_riverpod.dart';

import '../api/models.dart';
import '../state/providers.dart';
import '../theme/app_theme.dart';
import '../theme/status.dart';
import '../widgets/ui.dart';
import 'browser_safety_screen.dart';
import 'call_sms_safety_screen.dart';
import 'keyword_detection_screen.dart';
import 'live_mirror_screen.dart';
import 'notifications_screen.dart';
import 'snapshot_screen.dart';
import 'usage_logs_screen.dart';
import 'watch_history_screen.dart';

/// Read-only details for one device.
class DeviceInfoScreen extends StatelessWidget {
  final Device device;
  const DeviceInfoScreen({super.key, required this.device});

  @override
  Widget build(BuildContext context) {
    final scheme = Theme.of(context).colorScheme;
    final s = deviceStatusStyle(device.status);

    Widget row(String label, Widget value) => ListTile(
          title: Text(label),
          trailing: DefaultTextStyle(
            style: TextStyle(fontSize: 15, color: scheme.onSurfaceVariant),
            child: value,
          ),
        );

    return Scaffold(
      appBar: AppBar(title: Text(device.name)),
      body: ListView(
        padding: const EdgeInsets.fromLTRB(20, 8, 20, 32),
        children: [
          Card(
            child: Column(
              children: [
                row(
                  'Status',
                  Row(
                    mainAxisSize: MainAxisSize.min,
                    children: [
                      StatusDot(s.color, size: 8),
                      const SizedBox(width: 6),
                      Text(s.label,
                          style: TextStyle(
                              color: s.color, fontWeight: FontWeight.w600)),
                    ],
                  ),
                ),
                const Divider(height: 1),
                row('Last seen', Text(timeAgo(device.lastSeenAt))),
                const Divider(height: 1),
                row(
                  'Battery',
                  Text(device.batteryPct != null
                      ? '${device.batteryPct}%'
                      : '—'),
                ),
                const Divider(height: 1),
                row('Model', Text(device.model ?? '—')),
                const Divider(height: 1),
                row('Manufacturer', Text(device.manufacturer ?? '—')),
              ],
            ),
          ),
          const SizedBox(height: 12),
          Card(
            child: Column(
              children: [
                ListTile(
                  leading: Container(
                    width: 42,
                    height: 42,
                    decoration: BoxDecoration(
                      color: AppColors.alert.withValues(alpha: 0.12),
                      borderRadius: BorderRadius.circular(12),
                    ),
                    child: const Icon(Icons.warning_amber_rounded,
                        color: AppColors.alert),
                  ),
                  title: const Text('Keyword Detection'),
                  subtitle: const Text('Social media safety keywords'),
                  trailing: const Icon(Icons.chevron_right_rounded),
                  onTap: () => Navigator.push(
                    context,
                    MaterialPageRoute<void>(
                      builder: (_) => KeywordDetectionScreen(
                        deviceId: device.id,
                        deviceName: device.name,
                      ),
                    ),
                  ),
                ),
                const Divider(height: 1, indent: 16, endIndent: 16),
                ListTile(
                  leading: Container(
                    width: 42,
                    height: 42,
                    decoration: BoxDecoration(
                      color: AppColors.offline.withValues(alpha: 0.12),
                      borderRadius: BorderRadius.circular(12),
                    ),
                    child: const Icon(Icons.history_rounded,
                        color: AppColors.offline),
                  ),
                  title: const Text('Usage Logs'),
                  subtitle: const Text('Screen events & app timeline'),
                  trailing: const Icon(Icons.chevron_right_rounded),
                  onTap: () => Navigator.push(
                    context,
                    MaterialPageRoute<void>(
                      builder: (_) => UsageLogsScreen(
                        deviceId: device.id,
                        deviceName: device.name,
                      ),
                    ),
                  ),
                ),
                const Divider(height: 1, indent: 16, endIndent: 16),
                ListTile(
                  leading: Container(
                    width: 42,
                    height: 42,
                    decoration: BoxDecoration(
                      color: AppColors.brand.withValues(alpha: 0.12),
                      borderRadius: BorderRadius.circular(12),
                    ),
                    child: const Icon(Icons.notifications_rounded,
                        color: AppColors.brand),
                  ),
                  title: const Text('Notifications'),
                  subtitle: const Text('App notification history'),
                  trailing: const Icon(Icons.chevron_right_rounded),
                  onTap: () => Navigator.push(
                    context,
                    MaterialPageRoute<void>(
                      builder: (_) => NotificationsScreen(
                        deviceId: device.id,
                        deviceName: device.name,
                      ),
                    ),
                  ),
                ),
                const Divider(height: 1, indent: 16, endIndent: 16),
                ListTile(
                  leading: Container(
                    width: 42,
                    height: 42,
                    decoration: BoxDecoration(
                      color: Colors.red.withValues(alpha: 0.12),
                      borderRadius: BorderRadius.circular(12),
                    ),
                    child: const Icon(Icons.play_circle_filled_rounded,
                        color: Colors.red),
                  ),
                  title: const Text('Watch History'),
                  subtitle: const Text('YouTube & TikTok activity'),
                  trailing: const Icon(Icons.chevron_right_rounded),
                  onTap: () => Navigator.push(
                    context,
                    MaterialPageRoute<void>(
                      builder: (_) => WatchHistoryScreen(
                        deviceId: device.id,
                        deviceName: device.name,
                      ),
                    ),
                  ),
                ),
                const Divider(height: 1, indent: 16, endIndent: 16),
                ListTile(
                  leading: Container(
                    width: 42,
                    height: 42,
                    decoration: BoxDecoration(
                      color: Colors.green.withValues(alpha: 0.12),
                      borderRadius: BorderRadius.circular(12),
                    ),
                    child: const Icon(Icons.language_rounded,
                        color: Colors.green),
                  ),
                  title: const Text('Browser Safety'),
                  subtitle: const Text('Browsing history & blocked sites'),
                  trailing: const Icon(Icons.chevron_right_rounded),
                  onTap: () => Navigator.push(
                    context,
                    MaterialPageRoute<void>(
                      builder: (_) => BrowserSafetyScreen(
                        deviceId: device.id,
                        deviceName: device.name,
                      ),
                    ),
                  ),
                ),
                const Divider(height: 1, indent: 16, endIndent: 16),
                ListTile(
                  leading: Container(
                    width: 42,
                    height: 42,
                    decoration: BoxDecoration(
                      color: AppColors.brand.withValues(alpha: 0.12),
                      borderRadius: BorderRadius.circular(12),
                    ),
                    child: const Icon(Icons.camera_alt_rounded,
                        color: AppColors.brand),
                  ),
                  title: const Text('Snapshot & Recording'),
                  subtitle: const Text('Live screen & consent-based capture'),
                  trailing: const Icon(Icons.chevron_right_rounded),
                  onTap: () => Navigator.push(
                    context,
                    MaterialPageRoute<void>(
                      builder: (_) => SnapshotScreen(device: device),
                    ),
                  ),
                ),
                const Divider(height: 1, indent: 16, endIndent: 16),
                ListTile(
                  leading: Container(
                    width: 42,
                    height: 42,
                    decoration: BoxDecoration(
                      color: AppColors.online.withValues(alpha: 0.12),
                      borderRadius: BorderRadius.circular(12),
                    ),
                    child: const Icon(Icons.phone_rounded,
                        color: AppColors.online),
                  ),
                  title: const Text('Call & SMS Safety'),
                  subtitle: const Text('Call logs & message history'),
                  trailing: const Icon(Icons.chevron_right_rounded),
                  onTap: () => Navigator.push(
                    context,
                    MaterialPageRoute<void>(
                      builder: (_) => CallSmsSafetyScreen(
                        deviceId: device.id,
                        deviceName: device.name,
                      ),
                    ),
                  ),
                ),
                const Divider(height: 1, indent: 16, endIndent: 16),
                ListTile(
                  leading: Container(
                    width: 42,
                    height: 42,
                    decoration: BoxDecoration(
                      color: AppColors.brand.withValues(alpha: 0.12),
                      borderRadius: BorderRadius.circular(12),
                    ),
                    child: const Icon(Icons.screenshot_rounded,
                        color: AppColors.brand),
                  ),
                  title: const Text('Screenshot now'),
                  subtitle: const Text('Capture the current screen on demand'),
                  trailing: const Icon(Icons.chevron_right_rounded),
                  onTap: () => Navigator.push(
                    context,
                    MaterialPageRoute<void>(
                      builder: (_) =>
                          LiveMirrorScreen(device: device, mode: 'screenshot'),
                    ),
                  ),
                ),
                const Divider(height: 1, indent: 16, endIndent: 16),
                _ReleaseProtectionTile(device: device),
              ],
            ),
          ),
        ],
      ),
    );
  }
}

/// Remote-release Device Owner self-protection (makes the app removable again).
class _ReleaseProtectionTile extends ConsumerWidget {
  final Device device;
  const _ReleaseProtectionTile({required this.device});

  @override
  Widget build(BuildContext context, WidgetRef ref) {
    return ListTile(
      leading: Container(
        width: 42,
        height: 42,
        decoration: BoxDecoration(
          color: AppColors.alert.withValues(alpha: 0.12),
          borderRadius: BorderRadius.circular(12),
        ),
        child: const Icon(Icons.lock_open_rounded, color: AppColors.alert),
      ),
      title: const Text('Release protection'),
      subtitle: const Text('Lift uninstall lock so this device can be removed'),
      trailing: const Icon(Icons.chevron_right_rounded),
      onTap: () async {
        final confirm = await showDialog<bool>(
          context: context,
          builder: (ctx) => AlertDialog(
            title: const Text('Release protection?'),
            content: const Text(
              'This lifts the uninstall and force-stop locks and relinquishes '
              'device ownership. The app can then be removed. Continue?',
            ),
            actions: [
              TextButton(
                onPressed: () => Navigator.pop(ctx, false),
                child: const Text('Cancel'),
              ),
              TextButton(
                onPressed: () => Navigator.pop(ctx, true),
                child: const Text('Release'),
              ),
            ],
          ),
        );
        if (confirm != true) return;
        try {
          await ref.read(apiProvider).releaseDeviceOwner(device.id);
          if (context.mounted) {
            ScaffoldMessenger.of(context).showSnackBar(
              const SnackBar(content: Text('Release command sent')),
            );
          }
        } catch (e) {
          if (context.mounted) {
            ScaffoldMessenger.of(context).showSnackBar(
              SnackBar(content: Text('Failed: $e')),
            );
          }
        }
      },
    );
  }
}
