package com.google.firebase;

import android.os.SystemClock;
import androidx.annotation.o0;
import com.google.auto.value.AutoValue;

/* compiled from: StartupTime.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class r {
    @o0
    public static r a(long j5, long j6, long j7) {
        return new a(j5, j6, j7);
    }

    @o0
    public static r e() {
        return a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long b();

    public abstract long c();

    public abstract long d();
}
