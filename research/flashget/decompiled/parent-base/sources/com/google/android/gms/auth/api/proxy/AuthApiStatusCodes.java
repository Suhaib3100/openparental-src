package com.google.android.gms.auth.api.proxy;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.internal.ShowFirstParty;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@ShowFirstParty
@KeepForSdkWithMembers
/* loaded from: classes5.dex */
public class AuthApiStatusCodes extends CommonStatusCodes {

    @ShowFirstParty
    public static final int AUTH_API_ACCESS_FORBIDDEN = 3001;

    @ShowFirstParty
    public static final int AUTH_API_CLIENT_ERROR = 3002;

    @ShowFirstParty
    public static final int AUTH_API_INVALID_CREDENTIALS = 3000;

    @ShowFirstParty
    public static final int AUTH_API_SERVER_ERROR = 3003;

    @ShowFirstParty
    public static final int AUTH_APP_CERT_ERROR = 3006;

    @ShowFirstParty
    public static final int AUTH_TOKEN_ERROR = 3004;

    @ShowFirstParty
    public static final int AUTH_URL_RESOLUTION = 3005;

    private AuthApiStatusCodes() {
    }

    @o0
    public static String getStatusCodeString(int i4) {
        switch (i4) {
            case 3000:
                return ProtectedSandApp.s("쟠");
            case 3001:
                return ProtectedSandApp.s("쟟");
            case 3002:
                return ProtectedSandApp.s("쟞");
            case 3003:
                return ProtectedSandApp.s("쟝");
            case 3004:
                return ProtectedSandApp.s("쟜");
            case 3005:
                return ProtectedSandApp.s("쟛");
            case AUTH_APP_CERT_ERROR /* 3006 */:
                return ProtectedSandApp.s("쟚");
            default:
                return CommonStatusCodes.getStatusCodeString(i4);
        }
    }
}
