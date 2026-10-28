package com.google.android.gms.auth.api.accounttransfer;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.api.CommonStatusCodes;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
public final class AccountTransferStatusCodes extends CommonStatusCodes {
    public static final int CHALLENGE_NOT_ALLOWED = 20503;
    public static final int INVALID_REQUEST = 20502;
    public static final int NOT_ALLOWED_SECURITY = 20500;
    public static final int NO_DATA_AVAILABLE = 20501;
    public static final int SESSION_INACTIVE = 20504;

    private AccountTransferStatusCodes() {
    }

    @o0
    public static String getStatusCodeString(int i4) {
        switch (i4) {
            case NOT_ALLOWED_SECURITY /* 20500 */:
                return ProtectedSandApp.s("읲");
            case NO_DATA_AVAILABLE /* 20501 */:
                return ProtectedSandApp.s("읱");
            case INVALID_REQUEST /* 20502 */:
                return ProtectedSandApp.s("읰");
            case CHALLENGE_NOT_ALLOWED /* 20503 */:
                return ProtectedSandApp.s("읯");
            case SESSION_INACTIVE /* 20504 */:
                return ProtectedSandApp.s("읮");
            default:
                return CommonStatusCodes.getStatusCodeString(i4);
        }
    }
}
