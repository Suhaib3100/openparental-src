package com.tencent.liteav.base.util;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.Log;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes7.dex */
public class TimeFormat {
    public static String format(long j4, String str) {
        try {
            return new SimpleDateFormat(str).format(new Date(j4));
        } catch (Exception e4) {
            Log.i(ProtectedSandApp.s("厤\u0001"), ProtectedSandApp.s("厣\u0001"), e4);
            return "";
        }
    }

    public static long fromString(String str, String str2) {
        try {
            Date parse = new SimpleDateFormat(str2).parse(str);
            if (parse == null) {
                return 0L;
            }
            return parse.getTime();
        } catch (Exception e4) {
            Log.i(ProtectedSandApp.s("厤\u0001"), ProtectedSandApp.s("厥\u0001"), e4);
            return 0L;
        }
    }
}
