package com.google.firebase.crashlytics.internal;

import android.util.Log;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: Logger.java */
/* loaded from: classes6.dex */
public class g {

    /* renamed from: c, reason: collision with root package name */
    public static final String f58886c = ProtectedSandApp.s("ﳥ");

    /* renamed from: d, reason: collision with root package name */
    static final g f58887d = new g(ProtectedSandApp.s("ﳥ"));

    /* renamed from: a, reason: collision with root package name */
    private final String f58888a;

    /* renamed from: b, reason: collision with root package name */
    private int f58889b = 4;

    public g(String str) {
        this.f58888a = str;
    }

    private boolean a(int i4) {
        return this.f58889b <= i4 || Log.isLoggable(this.f58888a, i4);
    }

    public static g f() {
        return f58887d;
    }

    public void b(String str) {
        c(str, null);
    }

    public void c(String str, Throwable th) {
        a(3);
    }

    public void d(String str) {
        e(str, null);
    }

    public void e(String str, Throwable th) {
        a(6);
    }

    public void g(String str) {
        h(str, null);
    }

    public void h(String str, Throwable th) {
        a(4);
    }

    public void i(int i4, String str) {
        j(i4, str, false);
    }

    public void j(int i4, String str, boolean z4) {
        if (z4 || a(i4)) {
            Log.println(i4, this.f58888a, str);
        }
    }

    public void k(String str) {
        l(str, null);
    }

    public void l(String str, Throwable th) {
        a(2);
    }

    public void m(String str) {
        n(str, null);
    }

    public void n(String str, Throwable th) {
        a(5);
    }
}
