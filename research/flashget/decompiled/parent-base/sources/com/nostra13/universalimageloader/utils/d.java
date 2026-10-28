package com.nostra13.universalimageloader.utils;

import android.util.Log;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: L.java */
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f70521a = ProtectedSandApp.s("᪭\u0001");

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f70522b = false;

    /* renamed from: c, reason: collision with root package name */
    private static volatile boolean f70523c = true;

    private d() {
    }

    public static void a(String str, Object... objArr) {
        if (f70522b) {
            h(3, null, str, objArr);
        }
    }

    @Deprecated
    public static void b() {
        f70523c = false;
    }

    public static void c(String str, Object... objArr) {
        h(6, null, str, objArr);
    }

    public static void d(Throwable th) {
        h(6, th, null, new Object[0]);
    }

    public static void e(Throwable th, String str, Object... objArr) {
        h(6, th, str, objArr);
    }

    @Deprecated
    public static void f() {
        f70523c = true;
    }

    public static void g(String str, Object... objArr) {
        h(4, null, str, objArr);
    }

    private static void h(int i4, Throwable th, String str, Object... objArr) {
        if (f70523c) {
            if (objArr.length > 0) {
                str = String.format(str, objArr);
            }
            if (th != null) {
                if (str == null) {
                    str = th.getMessage();
                }
                str = String.format(ProtectedSandApp.s("᪭\u0001"), str, Log.getStackTraceString(th));
            }
            Log.println(i4, com.nostra13.universalimageloader.core.d.f70334d, str);
        }
    }

    public static void i(String str, Object... objArr) {
        h(5, null, str, objArr);
    }

    public static void j(boolean z4) {
        f70522b = z4;
    }

    public static void k(boolean z4) {
        f70523c = z4;
    }
}
