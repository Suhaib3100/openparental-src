package com.tencent.beacon.base.net.b;

import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.base.util.h;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Constant.java */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static String f71303a = ProtectedSandApp.s("ㄘ\u0001");

    /* renamed from: b, reason: collision with root package name */
    public static String f71304b = ProtectedSandApp.s("ㄙ\u0001");

    /* renamed from: c, reason: collision with root package name */
    public static String f71305c = ProtectedSandApp.s("ㄚ\u0001");

    /* renamed from: d, reason: collision with root package name */
    public static String f71306d = ProtectedSandApp.s("ㄛ\u0001");

    /* renamed from: e, reason: collision with root package name */
    public static String f71307e = ProtectedSandApp.s("ㄜ\u0001");

    /* renamed from: f, reason: collision with root package name */
    public static String f71308f = "";

    /* renamed from: g, reason: collision with root package name */
    private static boolean f71309g;

    public static String a(String str) {
        if (str == null || "".equals(str)) {
            return "";
        }
        String s4 = str.contains(ProtectedSandApp.s("ㄏ\u0001")) ? ProtectedSandApp.s("ㄍ\u0001") : ProtectedSandApp.s("ㄐ\u0001");
        int indexOf = str.indexOf(s4);
        if (indexOf == -1) {
            return str;
        }
        String substring = str.substring(s4.length() + indexOf, str.indexOf(ProtectedSandApp.s("ㄑ\u0001"), s4.length()));
        int indexOf2 = substring.indexOf(ProtectedSandApp.s("ㄒ\u0001"));
        return indexOf2 != -1 ? substring.substring(0, indexOf2) : substring;
    }

    public static void b(String str) {
        if (TextUtils.isEmpty(str) || f71309g) {
            return;
        }
        f71305c = str;
    }

    public static void c(String str) {
        if (TextUtils.isEmpty(str) || f71309g) {
            return;
        }
        f71303a = str;
    }

    public static void d(String str) {
        if (TextUtils.isEmpty(str) || f71309g) {
            return;
        }
        f71306d = str;
    }

    public static void e(String str) {
        if (TextUtils.isEmpty(str) || f71309g) {
            return;
        }
        f71304b = str;
    }

    public static String b(boolean z4) {
        return z4 ? f71306d : f71304b;
    }

    public static void b(String str, String str2) {
        Pattern compile = Pattern.compile(ProtectedSandApp.s("ㄕ\u0001"));
        Matcher matcher = compile.matcher(str);
        Matcher matcher2 = compile.matcher(str2);
        if (matcher.matches() && matcher2.matches()) {
            f71306d = str;
            f71304b = f71304b.replace(ProtectedSandApp.s("ㄓ\u0001"), str);
            f71305c = str2;
            String replace = f71303a.replace(ProtectedSandApp.s("ㄔ\u0001"), str2);
            f71303a = replace;
            com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("ㄖ\u0001"), f71306d, f71304b, f71305c, replace);
            return;
        }
        h.a(ProtectedSandApp.s("ㄗ\u0001"));
    }

    public static String a(boolean z4) {
        return z4 ? f71305c : f71303a;
    }

    public static String a() {
        int c5 = com.tencent.beacon.d.b.b().c();
        if (c5 != 1) {
            return c5 != 2 ? "" : f71307e;
        }
        return android.support.v4.media.c.a(new StringBuilder(ProtectedSandApp.s("ㄍ\u0001")), f71308f, ProtectedSandApp.s("ㄎ\u0001"));
    }

    public static void a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            f71306d = str;
            f71304b = f71304b.replace(ProtectedSandApp.s("ㄓ\u0001"), str);
            f71309g = true;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        f71305c = str2;
        f71303a = f71303a.replace(ProtectedSandApp.s("ㄔ\u0001"), str2);
        f71309g = true;
    }
}
