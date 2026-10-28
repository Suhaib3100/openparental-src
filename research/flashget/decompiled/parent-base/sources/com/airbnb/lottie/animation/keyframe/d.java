package com.airbnb.lottie.animation.keyframe;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;

/* compiled from: FloatKeyframeAnimation.java */
/* loaded from: classes3.dex */
public class d extends g<Float> {
    public d(List<com.airbnb.lottie.value.a<Float>> list) {
        super(list);
    }

    public float p() {
        return q(b(), d());
    }

    float q(com.airbnb.lottie.value.a<Float> aVar, float f4) {
        Float f5;
        if (aVar.f39405b == null || aVar.f39406c == null) {
            throw new IllegalStateException(ProtectedSandApp.s("ă"));
        }
        com.airbnb.lottie.value.j<A> jVar = this.f38805e;
        return (jVar == 0 || (f5 = (Float) jVar.b(aVar.f39410g, aVar.f39411h.floatValue(), aVar.f39405b, aVar.f39406c, f4, e(), f())) == null) ? com.airbnb.lottie.utils.i.k(aVar.f(), aVar.c(), f4) : f5.floatValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Float i(com.airbnb.lottie.value.a<Float> aVar, float f4) {
        return Float.valueOf(q(aVar, f4));
    }
}
