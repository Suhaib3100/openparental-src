package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;

/* compiled from: PointKeyframeAnimation.java */
/* loaded from: classes3.dex */
public class k extends g<PointF> {

    /* renamed from: i, reason: collision with root package name */
    private final PointF f38835i;

    public k(List<com.airbnb.lottie.value.a<PointF>> list) {
        super(list);
        this.f38835i = new PointF();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public PointF i(com.airbnb.lottie.value.a<PointF> aVar, float f4) {
        return j(aVar, f4, f4, f4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF j(com.airbnb.lottie.value.a<PointF> aVar, float f4, float f5, float f6) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = aVar.f39405b;
        if (pointF3 == null || (pointF = aVar.f39406c) == null) {
            throw new IllegalStateException(ProtectedSandApp.s("Ċ"));
        }
        PointF pointF4 = pointF3;
        PointF pointF5 = pointF;
        com.airbnb.lottie.value.j<A> jVar = this.f38805e;
        if (jVar != 0 && (pointF2 = (PointF) jVar.b(aVar.f39410g, aVar.f39411h.floatValue(), pointF4, pointF5, f4, e(), f())) != null) {
            return pointF2;
        }
        PointF pointF6 = this.f38835i;
        float f7 = pointF4.x;
        float a5 = androidx.appcompat.graphics.drawable.d.a(pointF5.x, f7, f5, f7);
        float f10 = pointF4.y;
        pointF6.set(a5, androidx.appcompat.graphics.drawable.d.a(pointF5.y, f10, f6, f10));
        return this.f38835i;
    }
}
