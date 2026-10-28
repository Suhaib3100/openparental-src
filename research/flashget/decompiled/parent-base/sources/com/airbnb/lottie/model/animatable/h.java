package com.airbnb.lottie.model.animatable;

import android.graphics.Path;
import java.util.List;

/* compiled from: AnimatableShapeValue.java */
/* loaded from: classes3.dex */
public class h extends n<com.airbnb.lottie.model.content.n, Path> {
    public h(List<com.airbnb.lottie.value.a<com.airbnb.lottie.model.content.n>> list) {
        super((List) list);
    }

    @Override // com.airbnb.lottie.model.animatable.m
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.animation.keyframe.m p() {
        return new com.airbnb.lottie.animation.keyframe.m(this.f38968a);
    }

    @Override // com.airbnb.lottie.model.animatable.n, com.airbnb.lottie.model.animatable.m
    public /* bridge */ /* synthetic */ boolean o() {
        return super.o();
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
