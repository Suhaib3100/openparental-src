package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: BatteryState.java */
/* loaded from: classes2.dex */
class e {

    /* renamed from: c, reason: collision with root package name */
    static final int f15586c = 1;

    /* renamed from: d, reason: collision with root package name */
    static final int f15587d = 2;

    /* renamed from: e, reason: collision with root package name */
    static final int f15588e = 3;

    /* renamed from: a, reason: collision with root package name */
    private final Float f15589a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f15590b;

    private e(Float f6, boolean z5) {
        this.f15590b = z5;
        this.f15589a = f6;
    }

    public static e a(Context context) {
        boolean z5 = false;
        Float f6 = null;
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter(ProtectedSandApp.s("Ꮩ")));
            if (registerReceiver != null) {
                z5 = f(registerReceiver);
                f6 = d(registerReceiver);
            }
        } catch (IllegalStateException e6) {
            com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("Ꮪ"), e6);
        }
        return new e(f6, z5);
    }

    private static Float d(Intent intent) {
        int intExtra = intent.getIntExtra(ProtectedSandApp.s("Ꮫ"), -1);
        int intExtra2 = intent.getIntExtra(ProtectedSandApp.s("Ꮬ"), -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }

    private static boolean f(Intent intent) {
        int intExtra = intent.getIntExtra(ProtectedSandApp.s("Ꮭ"), -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    public Float b() {
        return this.f15589a;
    }

    public int c() {
        Float f6;
        if (!this.f15590b || (f6 = this.f15589a) == null) {
            return 1;
        }
        return ((double) f6.floatValue()) < 0.99d ? 2 : 3;
    }

    boolean e() {
        return this.f15590b;
    }
}
