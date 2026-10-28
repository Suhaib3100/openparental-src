package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import androidx.annotation.q0;
import java.util.Collections;

/* compiled from: SplitDimensionPathKeyframeAnimation.java */
/* loaded from: classes3.dex */
public class n extends a<PointF, PointF> {

    /* renamed from: i, reason: collision with root package name */
    private final PointF f38840i;

    /* renamed from: j, reason: collision with root package name */
    private final PointF f38841j;

    /* renamed from: k, reason: collision with root package name */
    private final a<Float, Float> f38842k;

    /* renamed from: l, reason: collision with root package name */
    private final a<Float, Float> f38843l;

    /* renamed from: m, reason: collision with root package name */
    @q0
    protected com.airbnb.lottie.value.j<Float> f38844m;

    /* renamed from: n, reason: collision with root package name */
    @q0
    protected com.airbnb.lottie.value.j<Float> f38845n;

    public n(a<Float, Float> aVar, a<Float, Float> aVar2) {
        super(Collections.emptyList());
        this.f38840i = new PointF();
        this.f38841j = new PointF();
        this.f38842k = aVar;
        this.f38843l = aVar2;
        m(f());
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public void m(float f4) {
        this.f38842k.m(f4);
        this.f38843l.m(f4);
        this.f38840i.set(this.f38842k.h().floatValue(), this.f38843l.h().floatValue());
        for (int i4 = 0; i4 < this.f38801a.size(); i4++) {
            this.f38801a.get(i4).a();
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public PointF h() {
        return i(null, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF i(com.airbnb.lottie.value.a<PointF> aVar, float f4) {
        Float f5;
        com.airbnb.lottie.value.a<Float> b5;
        com.airbnb.lottie.value.a<Float> b6;
        Float f6 = null;
        if (this.f38844m == null || (b6 = this.f38842k.b()) == null) {
            f5 = null;
        } else {
            float d5 = this.f38842k.d();
            Float f7 = b6.f39411h;
            com.airbnb.lottie.value.j<Float> jVar = this.f38844m;
            float f10 = b6.f39410g;
            f5 = jVar.b(f10, f7 == null ? f10 : f7.floatValue(), b6.f39405b, b6.f39406c, f4, f4, d5);
        }
        if (this.f38845n != null && (b5 = this.f38843l.b()) != null) {
            float d6 = this.f38843l.d();
            Float f11 = b5.f39411h;
            com.airbnb.lottie.value.j<Float> jVar2 = this.f38845n;
            float f12 = b5.f39410g;
            f6 = jVar2.b(f12, f11 == null ? f12 : f11.floatValue(), b5.f39405b, b5.f39406c, f4, f4, d6);
        }
        if (f5 == null) {
            this.f38841j.set(this.f38840i.x, 0.0f);
        } else {
            this.f38841j.set(f5.floatValue(), 0.0f);
        }
        if (f6 == null) {
            PointF pointF = this.f38841j;
            pointF.set(pointF.x, this.f38840i.y);
        } else {
            PointF pointF2 = this.f38841j;
            pointF2.set(pointF2.x, f6.floatValue());
        }
        return this.f38841j;
    }

    public void r(@q0 com.airbnb.lottie.value.j<Float> jVar) {
        com.airbnb.lottie.value.j<Float> jVar2 = this.f38844m;
        if (jVar2 != null) {
            jVar2.c(null);
        }
        this.f38844m = jVar;
        if (jVar != null) {
            jVar.c(this);
        }
    }

    public void s(@q0 com.airbnb.lottie.value.j<Float> jVar) {
        com.airbnb.lottie.value.j<Float> jVar2 = this.f38845n;
        if (jVar2 != null) {
            jVar2.c(null);
        }
        this.f38845n = jVar;
        if (jVar != null) {
            jVar.c(this);
        }
    }
}
