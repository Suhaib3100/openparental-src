package com.tencent.liteav.base.b;

import android.os.SystemClock;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private long f71785a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final long f71786b;

    public a(long j4) {
        this.f71786b = j4;
    }

    public final boolean a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j4 = this.f71785a;
        if (j4 != 0 && elapsedRealtime - j4 <= this.f71786b) {
            return false;
        }
        this.f71785a = SystemClock.elapsedRealtime();
        return true;
    }
}
