package com.meituan.android.walle;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.io.File;
import java.util.Map;

/* compiled from: WalleChannelReader.java */
/* loaded from: classes6.dex */
public final class h {
    private h() {
    }

    @q0
    public static String a(@o0 Context context, @o0 String str) {
        Map<String, String> f4 = f(context);
        if (f4 == null) {
            return null;
        }
        return f4.get(str);
    }

    @q0
    private static String b(@o0 Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo == null) {
                return null;
            }
            return applicationInfo.sourceDir;
        } catch (Throwable unused) {
            return null;
        }
    }

    @q0
    public static String c(@o0 Context context) {
        return d(context, null);
    }

    @q0
    public static String d(@o0 Context context, @o0 String str) {
        c e4 = e(context);
        return e4 == null ? str : e4.a();
    }

    @q0
    public static c e(@o0 Context context) {
        String b5 = b(context);
        if (TextUtils.isEmpty(b5)) {
            return null;
        }
        return d.a(new File(b5));
    }

    @q0
    public static Map<String, String> f(@o0 Context context) {
        String b5 = b(context);
        if (TextUtils.isEmpty(b5)) {
            return null;
        }
        return d.b(new File(b5));
    }
}
