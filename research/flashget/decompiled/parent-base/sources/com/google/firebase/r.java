package com.google.firebase;

import android.os.SystemClock;
import androidx.annotation.o0;

/* compiled from: StartupTime.java */
@b9.c
/* loaded from: classes6.dex */
public abstract class r {
    @o0
    public static r a(long j4, long j5, long j6) {
        return new a(j4, j5, j6);
    }

    @o0
    public static r e() {
        return new a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long b();

    public abstract long c();

    public abstract long d();
}
