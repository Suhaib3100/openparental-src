package com.airbnb.lottie.model.content;

import androidx.annotation.q0;
import com.airbnb.lottie.n0;

/* compiled from: RoundedCorners.java */
/* loaded from: classes3.dex */
public class m implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f39044a;

    /* renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.m<Float, Float> f39045b;

    public m(String str, com.airbnb.lottie.model.animatable.m<Float, Float> mVar) {
        this.f39044a = str;
        this.f39045b = mVar;
    }

    @Override // com.airbnb.lottie.model.content.c
    @q0
    public com.airbnb.lottie.animation.content.c a(n0 n0Var, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.r(n0Var, bVar, this);
    }

    public com.airbnb.lottie.model.animatable.m<Float, Float> b() {
        return this.f39045b;
    }

    public String c() {
        return this.f39044a;
    }
}
