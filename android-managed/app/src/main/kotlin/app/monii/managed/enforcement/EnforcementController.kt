package app.monii.managed.enforcement

import android.accessibilityservice.AccessibilityService
import android.content.Context
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import app.monii.managed.data.NewAppBlocklist

/**
 * Decides whether the foreground app should be blocked and, if so, bounces the
 * user home. Block reasons (FlashGet-parity tri-state):
 *   - allowedApps          → never blocked
 *   - blockedApps          → always blocked
 *   - blockAllExceptAllowed → every *user* app not in allowedApps is blocked
 *   - an active blocking schedule (bedtime/school)
 *   - a per-app daily time limit exceeded
 *
 * System/launcher apps are never blocked by blockAllExceptAllowed, so the home
 * screen and essential UI stay usable.
 *
 * Honest limit (from the eng review): GLOBAL_ACTION_HOME is racy and a fast
 * switcher can flash the app for a moment. The VPN layer is the harder-to-dodge
 * backstop; this is the responsive first line.
 */
class EnforcementController(context: Context) {
    private val appContext = context.applicationContext
    private val usage = UsageTracker(appContext)
    private val pm = appContext.packageManager

    fun onForegroundApp(pkg: String, service: AccessibilityService) {
        if (pkg == appContext.packageName) return // never block ourselves
        val rules = PolicyRules.load(appContext) ?: return
        if (shouldBlock(pkg, rules)) {
            service.performGlobalAction(AccessibilityService.GLOBAL_ACTION_HOME)
        }
    }

    private fun shouldBlock(pkg: String, rules: PolicyRules): Boolean {
        if (pkg in rules.allowedApps) return false
        if (pkg in rules.blockedApps) return true
        if (rules.blockNewApps && pkg in NewAppBlocklist.all(appContext)) return true
        if (rules.blockAllExceptAllowed && isUserApp(pkg)) return true
        if (rules.isWithinBlockingSchedule()) return true
        val limit = rules.appLimits[pkg]
        if (limit != null && usage.todayMinutes(pkg) >= limit) return true
        return false
    }

    /**
     * A "user app" = something the child installed / can be limited, not the
     * launcher, system UI, dialer, settings, etc. Protects the device from being
     * bricked by "block all except allowed".
     */
    private fun isUserApp(pkg: String): Boolean {
        return try {
            val info = pm.getApplicationInfo(pkg, 0)
            val system = (info.flags and ApplicationInfo.FLAG_SYSTEM) != 0
            val updatedSystem =
                (info.flags and ApplicationInfo.FLAG_UPDATED_SYSTEM_APP) != 0
            // Non-system, or a system app the user updated (e.g. Chrome), counts
            // as a user app; pure system components do not.
            !system || updatedSystem
        } catch (e: PackageManager.NameNotFoundException) {
            false
        }
    }
}
