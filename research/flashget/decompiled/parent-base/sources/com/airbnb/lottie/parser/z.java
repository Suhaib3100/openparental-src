package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.c;
import java.io.IOException;

/* compiled from: PathKeyframeParser.java */
/* loaded from: classes3.dex */
class z {
    private z() {
    }

    static com.airbnb.lottie.animation.keyframe.i a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        return new com.airbnb.lottie.animation.keyframe.i(kVar, t.c(cVar, kVar, com.airbnb.lottie.utils.j.e(), a0.f39200a, cVar.n() == c.b.BEGIN_OBJECT, false));
    }
}
