package com.google.android.libraries.places.api.net;

import androidx.annotation.RecentlyNonNull;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.api.CommonStatusCodes;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class PlacesStatusCodes extends CommonStatusCodes {
    public static final int INVALID_REQUEST = 9012;
    public static final int NOT_FOUND = 9013;
    public static final int OVER_QUERY_LIMIT = 9010;
    public static final int REQUEST_DENIED = 9011;

    @RecentlyNonNull
    public static String getStatusCodeString(int i4) {
        switch (i4) {
            case OVER_QUERY_LIMIT /* 9010 */:
                return ProtectedSandApp.s("\ue675");
            case REQUEST_DENIED /* 9011 */:
                return ProtectedSandApp.s("\ue674");
            case INVALID_REQUEST /* 9012 */:
                return ProtectedSandApp.s("\ue673");
            case NOT_FOUND /* 9013 */:
                return ProtectedSandApp.s("\ue672");
            default:
                return CommonStatusCodes.getStatusCodeString(i4);
        }
    }

    public static boolean isError(int i4) {
        return i4 > 0;
    }
}
