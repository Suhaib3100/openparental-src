package app.monii.managed.collectors

import android.content.Context
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import app.monii.managed.repo.MoniiRepository

/**
 * Reports the list of installed apps (package + label + system flag) so the
 * parent dashboard can show a real app picker instead of asking for raw package
 * names. Throttled — the inventory changes rarely, so we re-report at most once
 * every few hours (install/remove deltas still arrive via PackageEventReceiver).
 */
class AppInventoryCollector(context: Context) {
    private val appContext = context.applicationContext
    private val prefs =
        appContext.getSharedPreferences("monii_inventory", Context.MODE_PRIVATE)

    fun collect(repo: MoniiRepository) {
        if (!due()) return
        val pm = appContext.packageManager
        val apps = pm.getInstalledApplications(PackageManager.GET_META_DATA)
            .mapNotNull { info -> toEntry(pm, info) }
            .sortedBy { it["label"] as? String ?: "" }
        if (apps.isEmpty()) return
        repo.bufferEvent("APP_INVENTORY", mapOf("apps" to apps, "count" to apps.size))
        prefs.edit().putLong("last_run", System.currentTimeMillis()).apply()
    }

    private fun toEntry(
        pm: PackageManager,
        info: ApplicationInfo,
    ): Map<String, Any?>? {
        // Keep the list useful: launchable apps, plus any non-system app.
        val launchable = pm.getLaunchIntentForPackage(info.packageName) != null
        val isSystem = (info.flags and ApplicationInfo.FLAG_SYSTEM) != 0
        if (!launchable && isSystem) return null
        if (info.packageName == appContext.packageName) return null
        val label = runCatching { pm.getApplicationLabel(info).toString() }
            .getOrDefault(info.packageName)
        val iconB64 = AppIconUtil.iconBase64(pm, info.packageName)
        return buildMap {
            put("pkg", info.packageName)
            put("label", label)
            put("system", isSystem)
            put("launchable", launchable)
            if (iconB64 != null) put("iconB64", iconB64)
        }
    }

    private fun due(): Boolean {
        val last = prefs.getLong("last_run", 0L)
        return System.currentTimeMillis() - last > REPORT_INTERVAL_MS
    }

    companion object {
        private const val REPORT_INTERVAL_MS = 30 * 60 * 1000L // 30m — faster picker fill-in
    }
}
