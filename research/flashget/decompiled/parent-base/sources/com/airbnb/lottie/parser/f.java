package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: CircleShapeParser.java */
/* loaded from: classes3.dex */
class f {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f39211a = c.a.a(ProtectedSandApp.s("ǣ"), ProtectedSandApp.s("Ǥ"), ProtectedSandApp.s("ǥ"), ProtectedSandApp.s("ǡ"), ProtectedSandApp.s("Ǣ"));

    private f() {
    }

    static com.airbnb.lottie.model.content.b a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar, int i4) throws IOException {
        boolean z4 = i4 == 3;
        boolean z5 = false;
        String str = null;
        com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar = null;
        com.airbnb.lottie.model.animatable.f fVar = null;
        while (cVar.f()) {
            int q4 = cVar.q(f39211a);
            if (q4 == 0) {
                str = cVar.l();
            } else if (q4 == 1) {
                mVar = a.b(cVar, kVar);
            } else if (q4 == 2) {
                fVar = d.i(cVar, kVar);
            } else if (q4 == 3) {
                z5 = cVar.g();
            } else if (q4 != 4) {
                cVar.s();
                cVar.t();
            } else {
                z4 = cVar.i() == 3;
            }
        }
        return new com.airbnb.lottie.model.content.b(str, mVar, fVar, z4, z5);
    }
}
