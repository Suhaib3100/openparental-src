package com.tencent.beacon.base.util;

import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.charset.Charset;

/* compiled from: StringUtil.java */
/* loaded from: classes6.dex */
public class i {
    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return Charset.forName(ProtectedSandApp.s("㇔\u0001")).newEncoder().canEncode(str);
        } catch (Exception e4) {
            c.a(e4);
            return false;
        }
    }
}
