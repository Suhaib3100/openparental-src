package com.google.android.gms.auth.api.signin;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.api.CommonStatusCodes;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@Deprecated
/* loaded from: classes5.dex */
public final class GoogleSignInStatusCodes extends CommonStatusCodes {
    public static final int SIGN_IN_CANCELLED = 12501;
    public static final int SIGN_IN_CURRENTLY_IN_PROGRESS = 12502;
    public static final int SIGN_IN_FAILED = 12500;

    private GoogleSignInStatusCodes() {
    }

    @o0
    public static String getStatusCodeString(int i4) {
        switch (i4) {
            case SIGN_IN_FAILED /* 12500 */:
                return ProtectedSandApp.s("접");
            case SIGN_IN_CANCELLED /* 12501 */:
                return ProtectedSandApp.s("점");
            case SIGN_IN_CURRENTLY_IN_PROGRESS /* 12502 */:
                return ProtectedSandApp.s("젏");
            default:
                return CommonStatusCodes.getStatusCodeString(i4);
        }
    }
}
