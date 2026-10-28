package com.airbnb.lottie.animation.keyframe;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;

/* compiled from: ColorKeyframeAnimation.java */
/* loaded from: classes3.dex */
public class b extends g<Integer> {
    public b(List<com.airbnb.lottie.value.a<Integer>> list) {
        super(list);
    }

    public int p() {
        return q(b(), d());
    }

    public int q(com.airbnb.lottie.value.a<Integer> aVar, float f4) {
        Integer num;
        if (aVar.f39405b == null || aVar.f39406c == null) {
            throw new IllegalStateException(ProtectedSandApp.s("Ă"));
        }
        com.airbnb.lottie.value.j<A> jVar = this.f38805e;
        return (jVar == 0 || (num = (Integer) jVar.b(aVar.f39410g, aVar.f39411h.floatValue(), aVar.f39405b, aVar.f39406c, f4, e(), f())) == null) ? com.airbnb.lottie.utils.d.c(com.airbnb.lottie.utils.i.c(f4, 0.0f, 1.0f), aVar.f39405b.intValue(), aVar.f39406c.intValue()) : num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Integer i(com.airbnb.lottie.value.a<Integer> aVar, float f4) {
        return Integer.valueOf(q(aVar, f4));
    }
}
