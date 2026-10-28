package app.monii.managed.location

import android.Manifest
import android.annotation.SuppressLint
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.util.Log
import androidx.core.content.ContextCompat
import app.monii.managed.net.GeofenceDto
import app.monii.managed.repo.MoniiRepository
import com.google.android.gms.location.Geofence
import com.google.android.gms.location.GeofencingClient
import com.google.android.gms.location.GeofencingRequest
import com.google.android.gms.location.LocationServices

/**
 * Registers Play Services geofences from the backend list. Refreshed on each sync loop.
 */
class GeofenceManager(private val context: Context) {
    private val client: GeofencingClient = LocationServices.getGeofencingClient(context)

    @SuppressLint("MissingPermission")
    suspend fun syncFromBackend(repo: MoniiRepository) {
        if (!hasLocationPermission()) return
        val fences = runCatching { repo.listGeofences() }.getOrElse {
            Log.w(TAG, "listGeofences failed: ${it.message}")
            return
        }
        register(fences.filter { it.active != false })
    }

    @SuppressLint("MissingPermission")
    private fun register(fences: List<GeofenceDto>) {
        if (fences.isEmpty()) {
            client.removeGeofences(pendingIntent()).addOnCompleteListener { }
            return
        }
        val geofences = fences.map { dto ->
            Geofence.Builder()
                .setRequestId(dto.id)
                .setCircularRegion(dto.lat, dto.lng, dto.radiusM?.toFloat() ?: 200f)
                .setExpirationDuration(Geofence.NEVER_EXPIRE)
                .setTransitionTypes(Geofence.GEOFENCE_TRANSITION_ENTER or Geofence.GEOFENCE_TRANSITION_EXIT)
                .build()
        }
        val request = GeofencingRequest.Builder()
            .setInitialTrigger(GeofencingRequest.INITIAL_TRIGGER_ENTER)
            .addGeofences(geofences)
            .build()
        client.addGeofences(request, pendingIntent())
            .addOnFailureListener { e -> Log.w(TAG, "addGeofences: ${e.message}") }
    }

    private fun pendingIntent(): PendingIntent {
        val intent = Intent(context, GeofenceBroadcastReceiver::class.java)
        val flags = PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_MUTABLE
        return PendingIntent.getBroadcast(context, 0, intent, flags)
    }

    private fun hasLocationPermission(): Boolean {
        val fine = ContextCompat.checkSelfPermission(
            context,
            Manifest.permission.ACCESS_FINE_LOCATION,
        ) == PackageManager.PERMISSION_GRANTED
        return fine
    }

    companion object {
        private const val TAG = "GeofenceManager"
    }
}
