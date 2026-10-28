package com.bumptech.glide.util;

import android.annotation.TargetApi;
import android.os.SystemClock;

/* compiled from: LogTime.java */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final double f44966a = 1.0d / Math.pow(10.0d, 6.0d);

    private i() {
    }

    public static double a(long j4) {
        return (SystemClock.elapsedRealtimeNanos() - j4) * f44966a;
    }

    @TargetApi(17)
    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
