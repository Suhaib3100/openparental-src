package com.airbnb.lottie.animation.keyframe;

import androidx.annotation.q0;
import java.util.Collections;

/* compiled from: ValueCallbackKeyframeAnimation.java */
/* loaded from: classes3.dex */
public class q<K, A> extends a<K, A> {

    /* renamed from: i, reason: collision with root package name */
    private final A f38864i;

    public q(com.airbnb.lottie.value.j<A> jVar) {
        this(jVar, null);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    float c() {
        return 1.0f;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public A h() {
        com.airbnb.lottie.value.j<A> jVar = this.f38805e;
        A a5 = this.f38864i;
        return jVar.b(0.0f, 0.0f, a5, a5, f(), f(), f());
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    A i(com.airbnb.lottie.value.a<K> aVar, float f4) {
        return h();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public void k() {
        if (this.f38805e != null) {
            super.k();
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public void m(float f4) {
        this.f38804d = f4;
    }

    public q(com.airbnb.lottie.value.j<A> jVar, @q0 A a5) {
        super(Collections.emptyList());
        n(jVar);
        this.f38864i = a5;
    }
}
