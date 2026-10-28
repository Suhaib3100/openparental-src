package com.google.android.gms.auth.api.phone;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.api.CommonStatusCodes;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@18.0.2 */
/* loaded from: classes5.dex */
public final class SmsRetrieverStatusCodes extends CommonStatusCodes {
    public static final int API_NOT_AVAILABLE = 36501;
    public static final int PLATFORM_NOT_SUPPORTED = 36500;
    public static final int USER_PERMISSION_REQUIRED = 36502;

    private SmsRetrieverStatusCodes() {
    }

    @o0
    public static String getStatusCodeString(int i4) {
        switch (i4) {
            case PLATFORM_NOT_SUPPORTED /* 36500 */:
                return ProtectedSandApp.s("쟙");
            case API_NOT_AVAILABLE /* 36501 */:
                return ProtectedSandApp.s("쟘");
            case USER_PERMISSION_REQUIRED /* 36502 */:
                return ProtectedSandApp.s("쟗");
            default:
                return CommonStatusCodes.getStatusCodeString(i4);
        }
    }
}
