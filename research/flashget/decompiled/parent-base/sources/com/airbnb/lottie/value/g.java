package com.airbnb.lottie.value;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: LottieRelativeFloatValueCallback.java */
/* loaded from: classes3.dex */
public class g extends j<Float> {
    public g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Float e(b<Float> bVar) {
        T t4 = this.f39434c;
        if (t4 != 0) {
            return (Float) t4;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("˽"));
    }

    @Override // com.airbnb.lottie.value.j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Float a(b<Float> bVar) {
        return Float.valueOf(e(bVar).floatValue() + com.airbnb.lottie.utils.i.k(bVar.g().floatValue(), bVar.b().floatValue(), bVar.c()));
    }

    public g(@o0 Float f4) {
        super(f4);
    }
}
