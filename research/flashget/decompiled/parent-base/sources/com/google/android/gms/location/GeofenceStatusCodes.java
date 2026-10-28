package com.google.android.gms.location;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.api.CommonStatusCodes;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes5.dex */
public final class GeofenceStatusCodes extends CommonStatusCodes {
    public static final int GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION = 1004;
    public static final int GEOFENCE_NOT_AVAILABLE = 1000;
    public static final int GEOFENCE_REQUEST_TOO_FREQUENT = 1005;
    public static final int GEOFENCE_TOO_MANY_GEOFENCES = 1001;
    public static final int GEOFENCE_TOO_MANY_PENDING_INTENTS = 1002;

    private GeofenceStatusCodes() {
    }

    @o0
    public static String getStatusCodeString(int i4) {
        switch (i4) {
            case 1000:
                return ProtectedSandApp.s("\ud9c9");
            case 1001:
                return ProtectedSandApp.s("\ud9c8");
            case 1002:
                return ProtectedSandApp.s("\ud9c7");
            case 1003:
            default:
                return CommonStatusCodes.getStatusCodeString(i4);
            case 1004:
                return ProtectedSandApp.s("\ud9c6");
        }
    }
}
