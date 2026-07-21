package app.monii.managed.identity

import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey

/**
 * Device identity + backend base URL. Uses EncryptedSharedPreferences for
 * sensitive pairing secrets (device token, device secret) so they are encrypted
 * at rest. Falls back to plain SharedPreferences if encryption fails (e.g. on
 * devices without hardware-backed keystore), so pairing is never bricked.
 *
 * The base URL and FCM token (non-sensitive) use plain SharedPreferences.
 */
class DeviceStore(context: Context) {
    private val appContext = context.applicationContext

    // ---- Encrypted store for sensitive data ----
    private val securePrefs: SharedPreferences = runCatching {
        val masterKey = MasterKey.Builder(appContext)
            .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
            .build()
        EncryptedSharedPreferences.create(
            appContext,
            SECURE_PREFS,
            masterKey,
            EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
            EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM,
        )
    }.getOrElse { e ->
        Log.w(TAG, "EncryptedSharedPreferences unavailable, falling back: ${e.message}")
        appContext.getSharedPreferences(SECURE_PREFS, Context.MODE_PRIVATE)
    }

    // ---- Plain store for non-sensitive data ----
    private val prefs: SharedPreferences =
        appContext.getSharedPreferences(PREFS, Context.MODE_PRIVATE)

    // ---- Non-sensitive: base URL, FCM token ----

    fun baseUrl(): String = prefs.getString("base_url", DEFAULT_BASE) ?: DEFAULT_BASE
    fun setBaseUrl(url: String) = prefs.edit().putString("base_url", url.trim()).apply()

    fun fcmToken(): String? = prefs.getString("fcm_token", null)

    fun setFcmToken(token: String) {
        if (token != fcmToken()) {
            prefs.edit().putString("fcm_token", token).putBoolean("fcm_needs_sync", true).apply()
        }
    }

    fun fcmNeedsSync(): Boolean =
        prefs.getBoolean("fcm_needs_sync", false) && fcmToken() != null

    fun markFcmSynced() = prefs.edit().putBoolean("fcm_needs_sync", false).apply()

    // ---- Sensitive: pairing tokens (encrypted at rest) ----

    fun token(): String? = securePrefs.getString("device_token", null)
    fun setToken(token: String) = securePrefs.edit().putString("device_token", token).apply()

    fun deviceId(): String? = securePrefs.getString("device_id", null)

    fun deviceSecret(): String? = securePrefs.getString("device_secret", null)

    fun isPaired(): Boolean = token() != null && deviceId() != null

    fun savePairing(deviceId: String, token: String, secret: String) {
        securePrefs.edit()
            .putString("device_id", deviceId)
            .putString("device_token", token)
            .putString("device_secret", secret)
            .apply()
    }

    fun clearPairing() {
        securePrefs.edit()
            .remove("device_id")
            .remove("device_token")
            .remove("device_secret")
            .apply()
    }

    companion object {
        private const val TAG = "DeviceStore"
        private const val PREFS = "monii_identity"
        private const val SECURE_PREFS = "monii_identity_secure"

        // 10.0.2.2 = the host machine from the Android emulator.
        const val DEFAULT_BASE = "http://10.0.2.2:3000"
    }
}
