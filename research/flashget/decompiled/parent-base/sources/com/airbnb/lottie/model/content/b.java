package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.n0;

/* compiled from: CircleShape.java */
/* loaded from: classes3.dex */
public class b implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f38986a;

    /* renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.m<PointF, PointF> f38987b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.f f38988c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f38989d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f38990e;

    public b(String str, com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar, com.airbnb.lottie.model.animatable.f fVar, boolean z4, boolean z5) {
        this.f38986a = str;
        this.f38987b = mVar;
        this.f38988c = fVar;
        this.f38989d = z4;
        this.f38990e = z5;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(n0 n0Var, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.f(n0Var, bVar, this);
    }

    public String b() {
        return this.f38986a;
    }

    public com.airbnb.lottie.model.animatable.m<PointF, PointF> c() {
        return this.f38987b;
    }

    public com.airbnb.lottie.model.animatable.f d() {
        return this.f38988c;
    }

    public boolean e() {
        return this.f38990e;
    }

    public boolean f() {
        return this.f38989d;
    }
}
