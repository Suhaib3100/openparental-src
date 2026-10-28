package com.bumptech.glide.util;

import android.annotation.TargetApi;
import android.os.SystemClock;

/* compiled from: LogTime.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final double f12157a = 1.0d / Math.pow(10.0d, 6.0d);

    private h() {
    }

    public static double a(long j5) {
        return (SystemClock.elapsedRealtimeNanos() - j5) * f12157a;
    }

    @TargetApi(17)
    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
