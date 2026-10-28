package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import java.util.List;

/* compiled from: AnimatablePointValue.java */
/* loaded from: classes3.dex */
public class f extends n<PointF, PointF> {
    public f(List<com.airbnb.lottie.value.a<PointF>> list) {
        super((List) list);
    }

    @Override // com.airbnb.lottie.model.animatable.n, com.airbnb.lottie.model.animatable.m
    public /* bridge */ /* synthetic */ boolean o() {
        return super.o();
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public com.airbnb.lottie.animation.keyframe.a<PointF, PointF> p() {
        return new com.airbnb.lottie.animation.keyframe.k(this.f38968a);
    }

    @Override // com.airbnb.lottie.model.animatable.n, com.airbnb.lottie.model.animatable.m
    public List q() {
        return this.f38968a;
    }

    @Override // com.airbnb.lottie.model.animatable.n
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
