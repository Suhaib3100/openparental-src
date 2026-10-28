package com.airbnb.lottie.animation.keyframe;

import java.util.List;

/* compiled from: GradientColorKeyframeAnimation.java */
/* loaded from: classes3.dex */
public class e extends g<com.airbnb.lottie.model.content.d> {

    /* renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.model.content.d f38825i;

    public e(List<com.airbnb.lottie.value.a<com.airbnb.lottie.model.content.d>> list) {
        super(list);
        com.airbnb.lottie.model.content.d dVar = list.get(0).f39405b;
        int c5 = dVar != null ? dVar.c() : 0;
        this.f38825i = new com.airbnb.lottie.model.content.d(new float[c5], new int[c5]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.model.content.d i(com.airbnb.lottie.value.a<com.airbnb.lottie.model.content.d> aVar, float f4) {
        this.f38825i.d(aVar.f39405b, aVar.f39406c, f4);
        return this.f38825i;
    }
}
