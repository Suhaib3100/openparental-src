package com.google.android.gms.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import androidx.annotation.b1;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@Deprecated
/* loaded from: classes5.dex */
public interface FusedLocationProviderApi {

    @o0
    public static final String KEY_MOCK_LOCATION = ProtectedSandApp.s("톎");

    @o0
    @Deprecated
    public static final String KEY_LOCATION_CHANGED = ProtectedSandApp.s("톏");

    @o0
    PendingResult<Status> flushLocations(@o0 GoogleApiClient googleApiClient);

    @o0
    @b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    Location getLastLocation(@o0 GoogleApiClient googleApiClient);

    @o0
    @b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    LocationAvailability getLocationAvailability(@o0 GoogleApiClient googleApiClient);

    @o0
    PendingResult<Status> removeLocationUpdates(@o0 GoogleApiClient googleApiClient, @o0 PendingIntent pendingIntent);

    @o0
    PendingResult<Status> removeLocationUpdates(@o0 GoogleApiClient googleApiClient, @o0 LocationCallback locationCallback);

    @o0
    PendingResult<Status> removeLocationUpdates(@o0 GoogleApiClient googleApiClient, @o0 LocationListener locationListener);

    @o0
    @b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    PendingResult<Status> requestLocationUpdates(@o0 GoogleApiClient googleApiClient, @o0 LocationRequest locationRequest, @o0 PendingIntent pendingIntent);

    @o0
    @b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    PendingResult<Status> requestLocationUpdates(@o0 GoogleApiClient googleApiClient, @o0 LocationRequest locationRequest, @o0 LocationCallback locationCallback, @o0 Looper looper);

    @o0
    @b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    PendingResult<Status> requestLocationUpdates(@o0 GoogleApiClient googleApiClient, @o0 LocationRequest locationRequest, @o0 LocationListener locationListener);

    @o0
    @b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    PendingResult<Status> requestLocationUpdates(@o0 GoogleApiClient googleApiClient, @o0 LocationRequest locationRequest, @o0 LocationListener locationListener, @o0 Looper looper);

    @o0
    @b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    PendingResult<Status> setMockLocation(@o0 GoogleApiClient googleApiClient, @o0 Location location);

    @o0
    @b1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    PendingResult<Status> setMockMode(@o0 GoogleApiClient googleApiClient, boolean z4);
}
