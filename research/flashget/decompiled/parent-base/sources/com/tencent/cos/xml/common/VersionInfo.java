package com.tencent.cos.xml.common;

import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.base.BuildConfig;

/* loaded from: classes6.dex */
public class VersionInfo {
    public static String sdkName = null;
    public static int versionCode = -1;
    public static String versionName;

    public static String getQuicUserAgent() {
        return String.format(ProtectedSandApp.s("㕯\u0001"), getSdkName(), getVersionName());
    }

    public static String getSdkName() {
        if (TextUtils.isEmpty(sdkName)) {
            sdkName = ProtectedSandApp.s("㕰\u0001");
        }
        return sdkName;
    }

    public static String getUserAgent() {
        return String.format(ProtectedSandApp.s("㕱\u0001"), getSdkName(), getVersionName());
    }

    public static int getVersionCode() {
        if (versionCode == -1) {
            versionCode = BuildConfig.VERSION_CODE;
        }
        return versionCode;
    }

    public static String getVersionName() {
        if (TextUtils.isEmpty(versionName)) {
            versionName = ProtectedSandApp.s("㕲\u0001");
        }
        return versionName;
    }
}
