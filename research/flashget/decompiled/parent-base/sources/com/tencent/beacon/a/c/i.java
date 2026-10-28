package com.tencent.beacon.a.c;

import android.content.Context;
import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.a.b.j;
import java.util.HashMap;
import java.util.Map;

/* compiled from: QimeiWrapper.java */
/* loaded from: classes6.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static h f71115a = new h();

    /* renamed from: b, reason: collision with root package name */
    private static String f71116b = "";

    /* renamed from: c, reason: collision with root package name */
    private static boolean f71117c = false;

    public static h a(Context context, String str) {
        return null;
    }

    public static synchronized String b() {
        String a5;
        synchronized (i.class) {
            a5 = f71115a.a();
        }
        return a5;
    }

    public static synchronized String c() {
        String b5;
        synchronized (i.class) {
            b5 = f71115a.b();
        }
        return b5;
    }

    public static synchronized Map<String, String> d() {
        HashMap hashMap;
        synchronized (i.class) {
            hashMap = new HashMap(2);
            hashMap.put(ProtectedSandApp.s("ぺ\u0001"), b());
            hashMap.put(ProtectedSandApp.s("ほ\u0001"), c());
        }
        return hashMap;
    }

    public static synchronized String e() {
        String str;
        synchronized (i.class) {
            str = f71116b;
        }
        return str;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static synchronized String f() {
        synchronized (i.class) {
        }
        return "";
    }

    public static void g() {
    }

    public static void a() {
    }

    public static synchronized void b(String str) {
        synchronized (i.class) {
            f71116b = str;
        }
    }

    public static void a(boolean z4) {
    }

    public static synchronized void a(String str, String str2) {
        synchronized (i.class) {
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("ぴ\u0001"), new Object[0]);
                return;
            }
            if (!TextUtils.isEmpty(b()) && !TextUtils.equals(b(), str)) {
                String format = String.format(ProtectedSandApp.s("ふ\u0001"), str);
                com.tencent.beacon.base.util.c.a(format, new Object[0]);
                j.e().a(ProtectedSandApp.s("ぶ\u0001"), format);
            }
            if (!TextUtils.isEmpty(c()) && !TextUtils.equals(c(), str2)) {
                String format2 = String.format(ProtectedSandApp.s("ぷ\u0001"), str2);
                com.tencent.beacon.base.util.c.a(format2, new Object[0]);
                j.e().a(ProtectedSandApp.s("へ\u0001"), format2);
            }
            com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("べ\u0001"), str, str2);
            if (f71115a.c() && (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2))) {
                com.tencent.beacon.a.a.b.a().a(new com.tencent.beacon.a.a.c(1));
            }
            f71115a.a(str);
            f71115a.b(str2);
            if (!f71117c && !TextUtils.isEmpty(b())) {
                com.tencent.beacon.a.a.b.a().a(new com.tencent.beacon.a.a.c(13));
                f71117c = true;
            }
        }
    }

    public static h a(String str) {
        return f71115a;
    }

    public static void a(String str, Context context, f fVar) {
        com.tencent.beacon.base.util.c.e(ProtectedSandApp.s("び\u0001"), new Object[0]);
    }
}
