package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzdw {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int zza(@q0 String str) {
        char c5;
        if (str == null) {
            return 13;
        }
        switch (str.hashCode()) {
            case -1698126997:
                if (str.equals(ProtectedSandApp.s("\ue919"))) {
                    c5 = 3;
                    break;
                }
                c5 = 65535;
                break;
            case -1125000185:
                if (str.equals(ProtectedSandApp.s("\ue918"))) {
                    c5 = 4;
                    break;
                }
                c5 = 65535;
                break;
            case -813482689:
                if (str.equals(ProtectedSandApp.s("\ue917"))) {
                    c5 = 1;
                    break;
                }
                c5 = 65535;
                break;
            case 2524:
                if (str.equals(ProtectedSandApp.s("\ue916"))) {
                    c5 = 0;
                    break;
                }
                c5 = 65535;
                break;
            case 1023286998:
                if (str.equals(ProtectedSandApp.s("\ue915"))) {
                    c5 = 5;
                    break;
                }
                c5 = 65535;
                break;
            case 1831775833:
                if (str.equals(ProtectedSandApp.s("\ue914"))) {
                    c5 = 2;
                    break;
                }
                c5 = 65535;
                break;
            default:
                c5 = 65535;
                break;
        }
        if (c5 == 0 || c5 == 1) {
            return 0;
        }
        if (c5 == 2) {
            return PlacesStatusCodes.OVER_QUERY_LIMIT;
        }
        if (c5 == 3) {
            return PlacesStatusCodes.REQUEST_DENIED;
        }
        if (c5 == 4) {
            return PlacesStatusCodes.INVALID_REQUEST;
        }
        if (c5 != 5) {
            return 13;
        }
        return PlacesStatusCodes.NOT_FOUND;
    }

    @q0
    public static String zzb(@q0 String str, @q0 String str2) {
        return TextUtils.isEmpty(str2) ? str : str2;
    }
}
