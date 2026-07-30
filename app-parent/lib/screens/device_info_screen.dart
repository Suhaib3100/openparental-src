import 'package:flutter/material.dart';

import '../api/models.dart';
import '../theme/app_theme.dart';
import '../theme/status.dart';
import '../widgets/ui.dart';
import 'keyword_detection_screen.dart';
import 'usage_logs_screen.dart';

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
              ],
            ),
          ),
        ],
      ),
    );
  }
}
