package com.google.android.gms.common.api;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
public class CommonStatusCodes {
    public static final int API_NOT_CONNECTED = 17;
    public static final int CANCELED = 16;
    public static final int CONNECTION_SUSPENDED_DURING_CALL = 20;
    public static final int DEVELOPER_ERROR = 10;
    public static final int ERROR = 13;
    public static final int INTERNAL_ERROR = 8;
    public static final int INTERRUPTED = 14;
    public static final int INVALID_ACCOUNT = 5;
    public static final int NETWORK_ERROR = 7;
    public static final int RECONNECTION_TIMED_OUT = 22;
    public static final int RECONNECTION_TIMED_OUT_DURING_UPDATE = 21;
    public static final int REMOTE_EXCEPTION = 19;
    public static final int RESOLUTION_REQUIRED = 6;

    @Deprecated
    public static final int SERVICE_DISABLED = 3;

    @Deprecated
    public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
    public static final int SIGN_IN_REQUIRED = 4;
    public static final int SUCCESS = 0;
    public static final int SUCCESS_CACHE = -1;
    public static final int TIMEOUT = 15;

    @KeepForSdk
    protected CommonStatusCodes() {
    }

    @o0
    public static String getStatusCodeString(int i4) {
        switch (i4) {
            case -1:
                return ProtectedSandApp.s("읭");
            case 0:
                return ProtectedSandApp.s("읬");
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 21);
                sb.append(ProtectedSandApp.s("읙"));
                sb.append(i4);
                return sb.toString();
            case 2:
                return ProtectedSandApp.s("읫");
            case 3:
                return ProtectedSandApp.s("읪");
            case 4:
                return ProtectedSandApp.s("읩");
            case 5:
                return ProtectedSandApp.s("읨");
            case 6:
                return ProtectedSandApp.s("읧");
            case 7:
                return ProtectedSandApp.s("읦");
            case 8:
                return ProtectedSandApp.s("읥");
            case 10:
                return ProtectedSandApp.s("읤");
            case 13:
                return ProtectedSandApp.s("읣");
            case 14:
                return ProtectedSandApp.s("읢");
            case 15:
                return ProtectedSandApp.s("읡");
            case 16:
                return ProtectedSandApp.s("읠");
            case 17:
                return ProtectedSandApp.s("읟");
            case 18:
                return ProtectedSandApp.s("읞");
            case 19:
                return ProtectedSandApp.s("읝");
            case 20:
                return ProtectedSandApp.s("읜");
            case 21:
                return ProtectedSandApp.s("읛");
            case 22:
                return ProtectedSandApp.s("읚");
        }
    }
}
