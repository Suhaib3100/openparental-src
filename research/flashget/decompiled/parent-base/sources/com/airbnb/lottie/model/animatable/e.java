package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import java.util.List;

/* compiled from: AnimatablePathValue.java */
/* loaded from: classes3.dex */
public class e implements m<PointF, PointF> {

    /* renamed from: a, reason: collision with root package name */
    private final List<com.airbnb.lottie.value.a<PointF>> f38952a;

    public e(List<com.airbnb.lottie.value.a<PointF>> list) {
        this.f38952a = list;
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public boolean o() {
        return this.f38952a.size() == 1 && this.f38952a.get(0).h();
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public com.airbnb.lottie.animation.keyframe.a<PointF, PointF> p() {
        return this.f38952a.get(0).h() ? new com.airbnb.lottie.animation.keyframe.k(this.f38952a) : new com.airbnb.lottie.animation.keyframe.j(this.f38952a);
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public List<com.airbnb.lottie.value.a<PointF>> q() {
        return this.f38952a;
    }
}
