package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: BatteryState.java */
/* loaded from: classes6.dex */
class e {

    /* renamed from: c, reason: collision with root package name */
    static final int f58667c = 1;

    /* renamed from: d, reason: collision with root package name */
    static final int f58668d = 2;

    /* renamed from: e, reason: collision with root package name */
    static final int f58669e = 3;

    /* renamed from: a, reason: collision with root package name */
    private final Float f58670a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f58671b;

    private e(Float f4, boolean z4) {
        this.f58671b = z4;
        this.f58670a = f4;
    }

    public static e a(Context context) {
        boolean z4 = false;
        Float f4 = null;
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter(ProtectedSandApp.s("ﯿ")));
            if (registerReceiver != null) {
                z4 = f(registerReceiver);
                f4 = d(registerReceiver);
            }
        } catch (IllegalStateException e4) {
            com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("ﰀ"), e4);
        }
        return new e(f4, z4);
    }

    private static Float d(Intent intent) {
        int intExtra = intent.getIntExtra(ProtectedSandApp.s("ﰁ"), -1);
        int intExtra2 = intent.getIntExtra(ProtectedSandApp.s("ﰂ"), -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }

    private static boolean f(Intent intent) {
        int intExtra = intent.getIntExtra(ProtectedSandApp.s("ﰃ"), -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    public Float b() {
        return this.f58670a;
    }

    public int c() {
        Float f4;
        if (!this.f58671b || (f4 = this.f58670a) == null) {
            return 1;
        }
        return ((double) f4.floatValue()) < 0.99d ? 2 : 3;
    }

    boolean e() {
        return this.f58671b;
    }
}
