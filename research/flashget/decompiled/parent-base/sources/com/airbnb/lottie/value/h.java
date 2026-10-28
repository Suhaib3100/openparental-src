package com.airbnb.lottie.value;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: LottieRelativeIntegerValueCallback.java */
/* loaded from: classes3.dex */
public class h extends j<Integer> {
    /* JADX WARN: Multi-variable type inference failed */
    public Integer e(b<Integer> bVar) {
        T t4 = this.f39434c;
        if (t4 != 0) {
            return (Integer) t4;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("˾"));
    }

    @Override // com.airbnb.lottie.value.j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Integer a(b<Integer> bVar) {
        return Integer.valueOf(e(bVar).intValue() + com.airbnb.lottie.utils.i.l(bVar.g().intValue(), bVar.b().intValue(), bVar.c()));
    }
}
