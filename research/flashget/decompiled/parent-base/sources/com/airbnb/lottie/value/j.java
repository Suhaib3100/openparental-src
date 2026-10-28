package com.airbnb.lottie.value;

import androidx.annotation.c1;
import androidx.annotation.q0;

/* compiled from: LottieValueCallback.java */
/* loaded from: classes3.dex */
public class j<T> {

    /* renamed from: a, reason: collision with root package name */
    private final b<T> f39432a;

    /* renamed from: b, reason: collision with root package name */
    @q0
    private com.airbnb.lottie.animation.keyframe.a<?, ?> f39433b;

    /* renamed from: c, reason: collision with root package name */
    @q0
    protected T f39434c;

    public j() {
        this.f39432a = new b<>();
        this.f39434c = null;
    }

    @q0
    public T a(b<T> bVar) {
        return this.f39434c;
    }

    @q0
    @c1({c1.a.LIBRARY})
    public final T b(float f4, float f5, T t4, T t5, float f6, float f7, float f10) {
        return a(this.f39432a.h(f4, f5, t4, t5, f6, f7, f10));
    }

    @c1({c1.a.LIBRARY})
    public final void c(@q0 com.airbnb.lottie.animation.keyframe.a<?, ?> aVar) {
        this.f39433b = aVar;
    }

    public final void d(@q0 T t4) {
        this.f39434c = t4;
        com.airbnb.lottie.animation.keyframe.a<?, ?> aVar = this.f39433b;
        if (aVar != null) {
            aVar.k();
        }
    }

    public j(@q0 T t4) {
        this.f39432a = new b<>();
        this.f39434c = t4;
    }
}
