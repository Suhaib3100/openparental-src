package com.google.android.gms.location;

import androidx.annotation.o0;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@Deprecated
/* loaded from: classes5.dex */
public final class LocationStatusCodes {
    public static final int ERROR = 1;
    public static final int GEOFENCE_NOT_AVAILABLE = 1000;
    public static final int GEOFENCE_TOO_MANY_GEOFENCES = 1001;
    public static final int GEOFENCE_TOO_MANY_PENDING_INTENTS = 1002;
    public static final int SUCCESS = 0;

    private LocationStatusCodes() {
    }

    public static int zza(int i4) {
        if ((i4 < 0 || i4 > 1) && (i4 < 1000 || i4 >= 1006)) {
            return 1;
        }
        return i4;
    }

    @o0
    public static Status zzb(int i4) {
        if (i4 == 1) {
            i4 = 13;
        }
        return new Status(i4);
    }
}
