package com.google.android.gms.common.moduleinstall;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.api.CommonStatusCodes;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
public final class ModuleInstallStatusCodes extends CommonStatusCodes {
    public static final int INSUFFICIENT_STORAGE = 46003;
    public static final int MODULE_NOT_FOUND = 46002;
    public static final int NOT_ALLOWED_MODULE = 46001;
    public static final int SUCCESS = 0;
    public static final int UNKNOWN_MODULE = 46000;

    private ModuleInstallStatusCodes() {
    }

    @o0
    public static String getStatusCodeString(int i4) {
        switch (i4) {
            case UNKNOWN_MODULE /* 46000 */:
                return ProtectedSandApp.s("쭮");
            case NOT_ALLOWED_MODULE /* 46001 */:
                return ProtectedSandApp.s("쭭");
            case MODULE_NOT_FOUND /* 46002 */:
                return ProtectedSandApp.s("쭬");
            case INSUFFICIENT_STORAGE /* 46003 */:
                return ProtectedSandApp.s("쭫");
            default:
                return CommonStatusCodes.getStatusCodeString(i4);
        }
    }
}
