package com.airbnb.lottie.value;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* compiled from: LottieInterpolatedPointValue.java */
/* loaded from: classes3.dex */
public class e extends f<PointF> {

    /* renamed from: g, reason: collision with root package name */
    private final PointF f39427g;

    public e(PointF pointF, PointF pointF2) {
        super(pointF, pointF2);
        this.f39427g = new PointF();
    }

    @Override // com.airbnb.lottie.value.f, com.airbnb.lottie.value.j
    public /* bridge */ /* synthetic */ Object a(b bVar) {
        return super.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.value.f
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public PointF e(PointF pointF, PointF pointF2, float f4) {
        this.f39427g.set(com.airbnb.lottie.utils.i.k(pointF.x, pointF2.x, f4), com.airbnb.lottie.utils.i.k(pointF.y, pointF2.y, f4));
        return this.f39427g;
    }

    public e(PointF pointF, PointF pointF2, Interpolator interpolator) {
        super(pointF, pointF2, interpolator);
        this.f39427g = new PointF();
    }
}
