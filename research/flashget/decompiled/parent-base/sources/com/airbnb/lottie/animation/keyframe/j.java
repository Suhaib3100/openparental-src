package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* compiled from: PathKeyframeAnimation.java */
/* loaded from: classes3.dex */
public class j extends g<PointF> {

    /* renamed from: i, reason: collision with root package name */
    private final PointF f38831i;

    /* renamed from: j, reason: collision with root package name */
    private final float[] f38832j;

    /* renamed from: k, reason: collision with root package name */
    private final PathMeasure f38833k;

    /* renamed from: l, reason: collision with root package name */
    private i f38834l;

    public j(List<? extends com.airbnb.lottie.value.a<PointF>> list) {
        super(list);
        this.f38831i = new PointF();
        this.f38832j = new float[2];
        this.f38833k = new PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public PointF i(com.airbnb.lottie.value.a<PointF> aVar, float f4) {
        PointF pointF;
        i iVar = (i) aVar;
        Path j4 = iVar.j();
        if (j4 == null) {
            return aVar.f39405b;
        }
        com.airbnb.lottie.value.j<A> jVar = this.f38805e;
        if (jVar != 0 && (pointF = (PointF) jVar.b(iVar.f39410g, iVar.f39411h.floatValue(), (PointF) iVar.f39405b, (PointF) iVar.f39406c, e(), f4, f())) != null) {
            return pointF;
        }
        if (this.f38834l != iVar) {
            this.f38833k.setPath(j4, false);
            this.f38834l = iVar;
        }
        PathMeasure pathMeasure = this.f38833k;
        pathMeasure.getPosTan(pathMeasure.getLength() * f4, this.f38832j, null);
        PointF pointF2 = this.f38831i;
        float[] fArr = this.f38832j;
        pointF2.set(fArr[0], fArr[1]);
        return this.f38831i;
    }
}
