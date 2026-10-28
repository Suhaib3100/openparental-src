package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.n0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: RectangleShape.java */
/* loaded from: classes3.dex */
public class k implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f39034a;

    /* renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.m<PointF, PointF> f39035b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.m<PointF, PointF> f39036c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f39037d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f39038e;

    public k(String str, com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar, com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar2, com.airbnb.lottie.model.animatable.b bVar, boolean z4) {
        this.f39034a = str;
        this.f39035b = mVar;
        this.f39036c = mVar2;
        this.f39037d = bVar;
        this.f39038e = z4;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(n0 n0Var, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.p(n0Var, bVar, this);
    }

    public com.airbnb.lottie.model.animatable.b b() {
        return this.f39037d;
    }

    public String c() {
        return this.f39034a;
    }

    public com.airbnb.lottie.model.animatable.m<PointF, PointF> d() {
        return this.f39035b;
    }

    public com.airbnb.lottie.model.animatable.m<PointF, PointF> e() {
        return this.f39036c;
    }

    public boolean f() {
        return this.f39038e;
    }

    public String toString() {
        return ProtectedSandApp.s("ĺ") + this.f39035b + ProtectedSandApp.s("Ļ") + this.f39036c + '}';
    }
}
