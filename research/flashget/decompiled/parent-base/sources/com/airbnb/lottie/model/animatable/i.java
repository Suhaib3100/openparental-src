package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;

/* compiled from: AnimatableSplitDimensionPathValue.java */
/* loaded from: classes3.dex */
public class i implements m<PointF, PointF> {

    /* renamed from: a, reason: collision with root package name */
    private final b f38953a;

    /* renamed from: b, reason: collision with root package name */
    private final b f38954b;

    public i(b bVar, b bVar2) {
        this.f38953a = bVar;
        this.f38954b = bVar2;
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public boolean o() {
        return this.f38953a.o() && this.f38954b.o();
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public com.airbnb.lottie.animation.keyframe.a<PointF, PointF> p() {
        return new com.airbnb.lottie.animation.keyframe.n(this.f38953a.p(), this.f38954b.p());
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public List<com.airbnb.lottie.value.a<PointF>> q() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("Ĥ"));
    }
}
