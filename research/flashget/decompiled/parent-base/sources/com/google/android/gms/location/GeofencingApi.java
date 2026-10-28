package com.google.android.gms.location;

import android.app.PendingIntent;
import androidx.annotation.b1;
import androidx.annotation.o0;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@Deprecated
/* loaded from: classes5.dex */
public interface GeofencingApi {
    @o0
    @b1("android.permission.ACCESS_FINE_LOCATION")
    PendingResult<Status> addGeofences(@o0 GoogleApiClient googleApiClient, @o0 GeofencingRequest geofencingRequest, @o0 PendingIntent pendingIntent);

    @o0
    @b1("android.permission.ACCESS_FINE_LOCATION")
    @Deprecated
    PendingResult<Status> addGeofences(@o0 GoogleApiClient googleApiClient, @o0 List<Geofence> list, @o0 PendingIntent pendingIntent);

    @o0
    PendingResult<Status> removeGeofences(@o0 GoogleApiClient googleApiClient, @o0 PendingIntent pendingIntent);

    @o0
    PendingResult<Status> removeGeofences(@o0 GoogleApiClient googleApiClient, @o0 List<String> list);
}
