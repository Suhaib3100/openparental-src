package com.airbnb.lottie.parser;

import android.graphics.Path;
import com.airbnb.lottie.parser.moshi.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.Collections;

/* compiled from: ShapeFillParser.java */
/* loaded from: classes3.dex */
class i0 {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f39220a = c.a.a(ProtectedSandApp.s("ǿ"), ProtectedSandApp.s("Ȁ"), ProtectedSandApp.s("ȁ"), ProtectedSandApp.s("Ȃ"), ProtectedSandApp.s("ǽ"), ProtectedSandApp.s("Ǿ"));

    private i0() {
    }

    static com.airbnb.lottie.model.content.o a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        com.airbnb.lottie.model.animatable.d dVar = null;
        String str = null;
        com.airbnb.lottie.model.animatable.a aVar = null;
        boolean z4 = false;
        boolean z5 = false;
        int i4 = 1;
        while (cVar.f()) {
            int q4 = cVar.q(f39220a);
            if (q4 == 0) {
                str = cVar.l();
            } else if (q4 == 1) {
                aVar = d.c(cVar, kVar);
            } else if (q4 == 2) {
                dVar = d.h(cVar, kVar);
            } else if (q4 == 3) {
                z4 = cVar.g();
            } else if (q4 == 4) {
                i4 = cVar.i();
            } else if (q4 != 5) {
                cVar.s();
                cVar.t();
            } else {
                z5 = cVar.g();
            }
        }
        if (dVar == null) {
            dVar = new com.airbnb.lottie.model.animatable.d(Collections.singletonList(new com.airbnb.lottie.value.a(100)));
        }
        return new com.airbnb.lottie.model.content.o(str, z4, i4 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVar, dVar, z5);
    }
}
