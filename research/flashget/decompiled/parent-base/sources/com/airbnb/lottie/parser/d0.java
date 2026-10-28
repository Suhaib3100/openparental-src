package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: RectangleShapeParser.java */
/* loaded from: classes3.dex */
class d0 {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f39207a = c.a.a(ProtectedSandApp.s("Ǔ"), ProtectedSandApp.s("ǔ"), ProtectedSandApp.s("Ǖ"), ProtectedSandApp.s("Ǒ"), ProtectedSandApp.s("ǒ"));

    private d0() {
    }

    static com.airbnb.lottie.model.content.k a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        String str = null;
        com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar = null;
        com.airbnb.lottie.model.animatable.f fVar = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        boolean z4 = false;
        while (cVar.f()) {
            int q4 = cVar.q(f39207a);
            if (q4 == 0) {
                str = cVar.l();
            } else if (q4 == 1) {
                mVar = a.b(cVar, kVar);
            } else if (q4 == 2) {
                fVar = d.i(cVar, kVar);
            } else if (q4 == 3) {
                bVar = d.f(cVar, kVar, true);
            } else if (q4 != 4) {
                cVar.t();
            } else {
                z4 = cVar.g();
            }
        }
        return new com.airbnb.lottie.model.content.k(str, mVar, fVar, bVar, z4);
    }
}
