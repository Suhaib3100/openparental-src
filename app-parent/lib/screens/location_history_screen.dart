import 'package:flutter/material.dart';
import 'package:flutter_riverpod/flutter_riverpod.dart';
import 'package:intl/intl.dart';
import 'package:url_launcher/url_launcher.dart';

import '../api/models.dart';
import '../state/providers.dart';
import '../theme/app_theme.dart';
import '../widgets/ui.dart';

/// Location timeline + geofence places for one child device.
class LocationHistoryScreen extends ConsumerStatefulWidget {
  final Device device;
  const LocationHistoryScreen({super.key, required this.device});

  @override
  ConsumerState<LocationHistoryScreen> createState() =>
      _LocationHistoryScreenState();
}

class _LocationHistoryScreenState extends ConsumerState<LocationHistoryScreen> {
  bool _loading = true;
  List<DeviceLocation> _history = [];
  List<GeofencePlace> _geofences = [];

  @override
  void initState() {
    super.initState();
    _load();
  }

  Future<void> _load() async {
    setState(() => _loading = true);
    final api = ref.read(apiProvider);
    try {
      final results = await Future.wait([
        api.locationHistory(widget.device.id, limit: 80),
        api.listGeofences(widget.device.id),
      ]);
      if (mounted) {
        setState(() {
          _history = results[0] as List<DeviceLocation>;
          _geofences = results[1] as List<GeofencePlace>;
          _loading = false;
        });
      }
    } catch (_) {
      if (mounted) setState(() => _loading = false);
    }
  }

  Future<void> _addGeofence() async {
    final latest = _history.isNotEmpty ? _history.first : null;
    final nameCtrl = TextEditingController(text: 'Home');
    final latCtrl = TextEditingController(
      text: latest?.lat.toStringAsFixed(5) ?? '',
    );
    final lngCtrl = TextEditingController(
      text: latest?.lng.toStringAsFixed(5) ?? '',
    );
    final radiusCtrl = TextEditingController(text: '200');

    final ok = await showDialog<bool>(
      context: context,
      builder: (ctx) => AlertDialog(
        title: const Text('Add geofence'),
        content: SingleChildScrollView(
          child: Column(
            mainAxisSize: MainAxisSize.min,
            children: [
              TextField(
                controller: nameCtrl,
                decoration: const InputDecoration(labelText: 'Name'),
              ),
              TextField(
                controller: latCtrl,
                keyboardType:
                    const TextInputType.numberWithOptions(decimal: true),
                decoration: const InputDecoration(labelText: 'Latitude'),
              ),
              TextField(
                controller: lngCtrl,
                keyboardType:
                    const TextInputType.numberWithOptions(decimal: true),
                decoration: const InputDecoration(labelText: 'Longitude'),
              ),
              TextField(
                controller: radiusCtrl,
                keyboardType: TextInputType.number,
                decoration: const InputDecoration(
                  labelText: 'Radius (meters)',
                ),
              ),
            ],
          ),
        ),
        actions: [
          TextButton(
            onPressed: () => Navigator.pop(ctx, false),
            child: const Text('Cancel'),
          ),
          FilledButton(
            onPressed: () => Navigator.pop(ctx, true),
            child: const Text('Save'),
          ),
        ],
      ),
    );
    if (ok != true || !mounted) return;

    final lat = double.tryParse(latCtrl.text.trim());
    final lng = double.tryParse(lngCtrl.text.trim());
    final radius = double.tryParse(radiusCtrl.text.trim()) ?? 200;
    if (lat == null || lng == null) {
      ScaffoldMessenger.of(context).showSnackBar(
        const SnackBar(content: Text('Enter valid latitude and longitude')),
      );
      return;
    }

    try {
      await ref.read(apiProvider).createGeofence(
            widget.device.id,
            name: nameCtrl.text.trim().isEmpty ? 'Place' : nameCtrl.text.trim(),
            lat: lat,
            lng: lng,
            radiusM: radius,
          );
      await _load();
    } catch (e) {
      if (mounted) {
        ScaffoldMessenger.of(context).showSnackBar(
          SnackBar(content: Text('Failed: $e')),
        );
      }
    }
  }

  Future<void> _removeGeofence(GeofencePlace g) async {
    final ok = await showDialog<bool>(
      context: context,
      builder: (ctx) => AlertDialog(
        title: Text('Remove "${g.name}"?'),
        actions: [
          TextButton(
            onPressed: () => Navigator.pop(ctx, false),
            child: const Text('Cancel'),
          ),
          FilledButton(
            onPressed: () => Navigator.pop(ctx, true),
            child: const Text('Remove'),
          ),
        ],
      ),
    );
    if (ok != true) return;
    try {
      await ref.read(apiProvider).deleteGeofence(widget.device.id, g.id);
      await _load();
    } catch (_) {}
  }

  Future<void> _openMaps(double lat, double lng) async {
    final uri =
        Uri.parse('https://www.google.com/maps/search/?api=1&query=$lat,$lng');
    if (await canLaunchUrl(uri)) {
      await launchUrl(uri, mode: LaunchMode.externalApplication);
    }
  }

  @override
  Widget build(BuildContext context) {
    final scheme = Theme.of(context).colorScheme;

    return Scaffold(
      appBar: AppBar(
        title: Text('${widget.device.name} — location'),
        actions: [
          IconButton(
            onPressed: _loading ? null : _load,
            icon: const Icon(Icons.refresh_rounded),
          ),
        ],
      ),
      floatingActionButton: FloatingActionButton.extended(
        onPressed: _loading ? null : _addGeofence,
        icon: const Icon(Icons.add_location_alt_rounded),
        label: const Text('Geofence'),
      ),
      body: _loading
          ? const Center(child: CircularProgressIndicator())
          : ListView(
              padding: const EdgeInsets.fromLTRB(20, 8, 20, 88),
              children: [
                Text(
                  'Geofences',
                  style: Theme.of(context).textTheme.titleSmall?.copyWith(
                        color: scheme.onSurfaceVariant,
                      ),
                ),
                const SizedBox(height: 8),
                if (_geofences.where((g) => g.active).isEmpty)
                  const Card(
                    child: Padding(
                      padding: EdgeInsets.all(16),
                      child: Text(
                        'No geofences yet. Add one at the child’s last known '
                        'coordinates or enter lat/lng manually.',
                      ),
                    ),
                  )
                else
                  ..._geofences.where((g) => g.active).map(
                        (g) => Card(
                          child: ListTile(
                            leading: const SoftIcon(
                              Icons.fence_rounded,
                              AppColors.brand,
                            ),
                            title: Text(g.name),
                            subtitle: Text(
                              '${g.lat.toStringAsFixed(5)}, ${g.lng.toStringAsFixed(5)}'
                              ' · ${g.radiusM.round()}m',
                            ),
                            trailing: IconButton(
                              icon: const Icon(Icons.delete_outline),
                              onPressed: () => _removeGeofence(g),
                            ),
                            onTap: () => _openMaps(g.lat, g.lng),
                          ),
                        ),
                      ),
                const SizedBox(height: 24),
                Text(
                  'History',
                  style: Theme.of(context).textTheme.titleSmall?.copyWith(
                        color: scheme.onSurfaceVariant,
                      ),
                ),
                const SizedBox(height: 8),
                if (_history.isEmpty)
                  const EmptyState(
                    icon: Icons.history_rounded,
                    title: 'No history yet',
                    subtitle: 'Points appear as the child reports location.',
                  )
                else
                  ..._history.map(
                    (loc) => Card(
                      child: ListTile(
                        leading: const SoftIcon(
                          Icons.place_rounded,
                          AppColors.online,
                        ),
                        title: Text(
                          '${loc.lat.toStringAsFixed(5)}, '
                          '${loc.lng.toStringAsFixed(5)}',
                        ),
                        subtitle: Text(
                          '${loc.occurredAt != null ? DateFormat('MMM d, HH:mm').format(loc.occurredAt!.toLocal()) : ''}'
                          '${loc.accuracyM != null ? ' · ±${loc.accuracyM!.round()}m' : ''}',
                        ),
                        onTap: () => _openMaps(loc.lat, loc.lng),
                      ),
                    ),
                  ),
              ],
            ),
    );
  }
}
