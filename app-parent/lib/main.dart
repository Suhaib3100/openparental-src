import 'package:firebase_core/firebase_core.dart' show Firebase;
import 'package:flutter/material.dart';
import 'package:flutter_riverpod/flutter_riverpod.dart';

import 'screens/home_screen.dart';
import 'screens/login_screen.dart';
import 'state/providers.dart';
import 'theme/app_theme.dart';

/// Global flag so the auth notifier knows whether Firebase is available.
bool firebaseAvailable = false;

Future<void> main() async {
  WidgetsFlutterBinding.ensureInitialized();

  // Initialize Firebase (FCM). This is optional — the app works without it;
  // push notifications simply won't arrive until a Firebase project is set up.
  try {
    await Firebase.initializeApp();
    firebaseAvailable = true;
  } catch (_) {
    // Firebase not configured — alerts arrive on next poll instead.
  }

  runApp(const ProviderScope(child: OpenParentalApp()));
}

class OpenParentalApp extends StatelessWidget {
  const OpenParentalApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'OpenParental',
      debugShowCheckedModeBanner: false,
      theme: AppTheme.light(),
      darkTheme: AppTheme.dark(),
      themeMode: ThemeMode.system,
      home: const RootView(),
    );
  }
}

class RootView extends ConsumerWidget {
  const RootView({super.key});

  @override
  Widget build(BuildContext context, WidgetRef ref) {
    final auth = ref.watch(authProvider);
    if (auth.loading) {
      return const Scaffold(body: Center(child: CircularProgressIndicator()));
    }
    return auth.loggedIn ? const HomeScreen() : const LoginScreen();
  }
}
