package com.google.firebase.crashlytics.internal;

import android.util.Log;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: Logger.java */
/* loaded from: classes2.dex */
public class g {

    /* renamed from: c, reason: collision with root package name */
    public static final String f15784c = ProtectedSandApp.s("ᒾ");

    /* renamed from: d, reason: collision with root package name */
    static final g f15785d = new g(ProtectedSandApp.s("ᒿ"));

    /* renamed from: a, reason: collision with root package name */
    private final String f15786a;

    /* renamed from: b, reason: collision with root package name */
    private int f15787b = 4;

    public g(String str) {
        this.f15786a = str;
    }

    private boolean a(int i5) {
        return this.f15787b <= i5 || Log.isLoggable(this.f15786a, i5);
    }

    public static g f() {
        return f15785d;
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

    public void i(int i5, String str) {
        j(i5, str, false);
    }

    public void j(int i5, String str, boolean z5) {
        if (z5 || a(i5)) {
            Log.println(i5, this.f15786a, str);
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
