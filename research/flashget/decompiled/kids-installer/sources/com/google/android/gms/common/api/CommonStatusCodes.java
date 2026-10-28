package com.google.android.gms.common.api;

import androidx.annotation.o0;
import androidx.appcompat.view.menu.s;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
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
    public static String getStatusCodeString(int i5) {
        switch (i5) {
            case -1:
                return ProtectedSandApp.s("ઝ");
            case 0:
                return ProtectedSandApp.s("જ");
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return s.a(ProtectedSandApp.s("ઉ"), i5);
            case 2:
                return ProtectedSandApp.s("છ");
            case 3:
                return ProtectedSandApp.s("ચ");
            case 4:
                return ProtectedSandApp.s("ઙ");
            case 5:
                return ProtectedSandApp.s("ઘ");
            case 6:
                return ProtectedSandApp.s("ગ");
            case 7:
                return ProtectedSandApp.s("ખ");
            case 8:
                return ProtectedSandApp.s("ક");
            case 10:
                return ProtectedSandApp.s("ઔ");
            case 13:
                return ProtectedSandApp.s("ઓ");
            case 14:
                return ProtectedSandApp.s("\u0a92");
            case 15:
                return ProtectedSandApp.s("ઑ");
            case 16:
                return ProtectedSandApp.s("ઐ");
            case 17:
                return ProtectedSandApp.s("એ");
            case 18:
                return ProtectedSandApp.s("\u0a8e");
            case 19:
                return ProtectedSandApp.s("ઍ");
            case 20:
                return ProtectedSandApp.s("ઌ");
            case 21:
                return ProtectedSandApp.s("ઋ");
            case 22:
                return ProtectedSandApp.s("ઊ");
        }
    }
}
