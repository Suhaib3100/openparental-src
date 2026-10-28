/// OpenParental product URLs and copy (FlashGet-style flow, our brand).
class ProductConfig {
  ProductConfig._();

  static const brandName = 'OpenParental';
  static const childPackageName = 'app.monii.managed';

  /// Where parents download the child APK (GitHub Releases, CDN, or docs).
  /// Override at build time: `--dart-define=CHILD_APK_URL=https://...`
  static const childApkDownloadUrl = String.fromEnvironment(
    'CHILD_APK_URL',
    defaultValue:
        'https://github.com/abuzar310/openparental/releases/latest',
  );

  static const setupDocUrl = String.fromEnvironment(
    'SETUP_DOC_URL',
    defaultValue:
        'https://github.com/abuzar310/openparental/blob/main/android-managed/README.md',
  );
}
