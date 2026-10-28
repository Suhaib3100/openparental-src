package com.airbnb.lottie;

import java.util.Arrays;

/* compiled from: LottieResult.java */
/* loaded from: classes3.dex */
public final class t0<V> {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.q0
    private final V f39367a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.q0
    private final Throwable f39368b;

    public t0(V v4) {
        this.f39367a = v4;
        this.f39368b = null;
    }

    @androidx.annotation.q0
    public Throwable a() {
        return this.f39368b;
    }

    @androidx.annotation.q0
    public V b() {
        return this.f39367a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        V v4 = this.f39367a;
        if (v4 != null && v4.equals(t0Var.f39367a)) {
            return true;
        }
        Throwable th = this.f39368b;
        if (th == null || t0Var.f39368b == null) {
            return false;
        }
        return th.toString().equals(this.f39368b.toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f39367a, this.f39368b});
    }

    public t0(Throwable th) {
        this.f39368b = th;
        this.f39367a = null;
    }
}
