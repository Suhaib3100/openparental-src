package com.airbnb.lottie.value;

import android.view.animation.Interpolator;

/* compiled from: LottieInterpolatedFloatValue.java */
/* loaded from: classes3.dex */
public class c extends f<Float> {
    public c(Float f4, Float f5) {
        super(f4, f5);
    }

    @Override // com.airbnb.lottie.value.f, com.airbnb.lottie.value.j
    public /* bridge */ /* synthetic */ Object a(b bVar) {
        return super.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.value.f
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Float e(Float f4, Float f5, float f6) {
        return Float.valueOf(com.airbnb.lottie.utils.i.k(f4.floatValue(), f5.floatValue(), f6));
    }

    public c(Float f4, Float f5, Interpolator interpolator) {
        super(f4, f5, interpolator);
    }
}
