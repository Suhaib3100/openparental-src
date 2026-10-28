package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.c;
import java.io.IOException;

/* compiled from: ScaleXYParser.java */
/* loaded from: classes3.dex */
public class g0 implements n0<com.airbnb.lottie.value.k> {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f39214a = new g0();

    private g0() {
    }

    @Override // com.airbnb.lottie.parser.n0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.value.k a(com.airbnb.lottie.parser.moshi.c cVar, float f4) throws IOException {
        boolean z4 = cVar.n() == c.b.BEGIN_ARRAY;
        if (z4) {
            cVar.b();
        }
        float h4 = (float) cVar.h();
        float h5 = (float) cVar.h();
        while (cVar.f()) {
            cVar.t();
        }
        if (z4) {
            cVar.d();
        }
        return new com.airbnb.lottie.value.k((h4 / 100.0f) * f4, (h5 / 100.0f) * f4);
    }
}
