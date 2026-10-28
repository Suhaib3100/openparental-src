package app.monii.managed.location

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import app.monii.managed.identity.DeviceStore
import app.monii.managed.repo.MoniiRepository
import com.google.android.gms.location.Geofence
import com.google.android.gms.location.GeofencingEvent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

/** Reports ENTER/EXIT to the backend (parent geofence alerts). */
class GeofenceBroadcastReceiver : BroadcastReceiver() {
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)

    override fun onReceive(context: Context, intent: Intent) {
        val event = GeofencingEvent.fromIntent(intent) ?: return
        if (event.hasError()) return
        val store = DeviceStore(context)
        if (!store.isPaired()) return
        val repo = MoniiRepository(context.applicationContext, store)
        val transition = when (event.geofenceTransition) {
            Geofence.GEOFENCE_TRANSITION_ENTER -> "ENTER"
            Geofence.GEOFENCE_TRANSITION_EXIT -> "EXIT"
            else -> return
        }
        val pending = goAsync()
        scope.launch {
            try {
                for (id in event.triggeringGeofences?.map { it.requestId }.orEmpty()) {
                    repo.reportGeofenceTransition(id, transition)
                }
            } finally {
                pending.finish()
            }
        }
    }
}
