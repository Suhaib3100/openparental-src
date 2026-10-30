package app.monii.managed.data

import android.content.Context

/**
 * Packages blocked because they were installed while the policy's "block new
 * apps" rule was on. Kept separate from the parent-set blockedApps so a parent
 * can still explicitly allow one later.
 */
object NewAppBlocklist {
    private const val PREFS = "monii_newblock"
    private const val KEY = "pkgs"

    fun add(context: Context, pkg: String) {
        val prefs = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
        val set = prefs.getStringSet(KEY, emptySet())!!.toMutableSet()
        if (set.add(pkg)) prefs.edit().putStringSet(KEY, set).apply()
    }

    fun all(context: Context): Set<String> =
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
            .getStringSet(KEY, emptySet()) ?: emptySet()
}
