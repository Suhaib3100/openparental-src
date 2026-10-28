package com.airbnb.lottie.model.content;

import androidx.annotation.q0;
import com.airbnb.lottie.n0;

/* compiled from: Repeater.java */
/* loaded from: classes3.dex */
public class l implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f39039a;

    /* renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f39040b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f39041c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.l f39042d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f39043e;

    public l(String str, com.airbnb.lottie.model.animatable.b bVar, com.airbnb.lottie.model.animatable.b bVar2, com.airbnb.lottie.model.animatable.l lVar, boolean z4) {
        this.f39039a = str;
        this.f39040b = bVar;
        this.f39041c = bVar2;
        this.f39042d = lVar;
        this.f39043e = z4;
    }

    @Override // com.airbnb.lottie.model.content.c
    @q0
    public com.airbnb.lottie.animation.content.c a(n0 n0Var, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.q(n0Var, bVar, this);
    }

    public com.airbnb.lottie.model.animatable.b b() {
        return this.f39040b;
    }

    public String c() {
        return this.f39039a;
    }

    public com.airbnb.lottie.model.animatable.b d() {
        return this.f39041c;
    }

    public com.airbnb.lottie.model.animatable.l e() {
        return this.f39042d;
    }

    public boolean f() {
        return this.f39043e;
    }
}
