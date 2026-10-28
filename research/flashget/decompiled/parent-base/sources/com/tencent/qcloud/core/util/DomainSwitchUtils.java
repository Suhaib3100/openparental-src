package com.tencent.qcloud.core.util;

import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public class DomainSwitchUtils {
    public static String DOMAIN_MYQCLOUD = ProtectedSandApp.s("媯\u0001");
    public static String DOMAIN_TENCENTCOS = ProtectedSandApp.s("媰\u0001");

    public static boolean isMyqcloudUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return (!Pattern.compile(ProtectedSandApp.s("媱\u0001")).matcher(str).matches() || Pattern.compile(ProtectedSandApp.s("媲\u0001")).matcher(str).matches() || Pattern.compile(ProtectedSandApp.s("媳\u0001")).matcher(str).matches() || Pattern.compile(ProtectedSandApp.s("媴\u0001")).matcher(str).matches()) ? false : true;
    }
}
