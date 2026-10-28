package com.airbnb.lottie.animation.keyframe;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;

/* compiled from: ScaleKeyframeAnimation.java */
/* loaded from: classes3.dex */
public class l extends g<com.airbnb.lottie.value.k> {

    /* renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.value.k f38836i;

    public l(List<com.airbnb.lottie.value.a<com.airbnb.lottie.value.k>> list) {
        super(list);
        this.f38836i = new com.airbnb.lottie.value.k();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.value.k i(com.airbnb.lottie.value.a<com.airbnb.lottie.value.k> aVar, float f4) {
        com.airbnb.lottie.value.k kVar;
        com.airbnb.lottie.value.k kVar2;
        com.airbnb.lottie.value.k kVar3 = aVar.f39405b;
        if (kVar3 == null || (kVar = aVar.f39406c) == null) {
            throw new IllegalStateException(ProtectedSandApp.s("ċ"));
        }
        com.airbnb.lottie.value.k kVar4 = kVar3;
        com.airbnb.lottie.value.k kVar5 = kVar;
        com.airbnb.lottie.value.j<A> jVar = this.f38805e;
        if (jVar != 0 && (kVar2 = (com.airbnb.lottie.value.k) jVar.b(aVar.f39410g, aVar.f39411h.floatValue(), kVar4, kVar5, f4, e(), f())) != null) {
            return kVar2;
        }
        this.f38836i.d(com.airbnb.lottie.utils.i.k(kVar4.b(), kVar5.b(), f4), com.airbnb.lottie.utils.i.k(kVar4.c(), kVar5.c(), f4));
        return this.f38836i;
    }
}
