package com.airbnb.lottie.animation.keyframe;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;

/* compiled from: IntegerKeyframeAnimation.java */
/* loaded from: classes3.dex */
public class f extends g<Integer> {
    public f(List<com.airbnb.lottie.value.a<Integer>> list) {
        super(list);
    }

    public int p() {
        return q(b(), d());
    }

    int q(com.airbnb.lottie.value.a<Integer> aVar, float f4) {
        Integer num;
        if (aVar.f39405b == null || aVar.f39406c == null) {
            throw new IllegalStateException(ProtectedSandApp.s("Ą"));
        }
        com.airbnb.lottie.value.j<A> jVar = this.f38805e;
        return (jVar == 0 || (num = (Integer) jVar.b(aVar.f39410g, aVar.f39411h.floatValue(), aVar.f39405b, aVar.f39406c, f4, e(), f())) == null) ? com.airbnb.lottie.utils.i.l(aVar.g(), aVar.d(), f4) : num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Integer i(com.airbnb.lottie.value.a<Integer> aVar, float f4) {
        return Integer.valueOf(q(aVar, f4));
    }
}
