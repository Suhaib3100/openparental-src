package com.airbnb.lottie.value;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: LottieInterpolatedValue.java */
/* loaded from: classes3.dex */
abstract class f<T> extends j<T> {

    /* renamed from: d, reason: collision with root package name */
    private final T f39428d;

    /* renamed from: e, reason: collision with root package name */
    private final T f39429e;

    /* renamed from: f, reason: collision with root package name */
    private final Interpolator f39430f;

    f(T t4, T t5) {
        this(t4, t5, new LinearInterpolator());
    }

    @Override // com.airbnb.lottie.value.j
    public T a(b<T> bVar) {
        return e(this.f39428d, this.f39429e, this.f39430f.getInterpolation(bVar.e()));
    }

    abstract T e(T t4, T t5, float f4);

    f(T t4, T t5, Interpolator interpolator) {
        this.f39428d = t4;
        this.f39429e = t5;
        this.f39430f = interpolator;
    }
}
