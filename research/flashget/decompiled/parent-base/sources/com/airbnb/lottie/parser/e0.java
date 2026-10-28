package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: RepeaterParser.java */
/* loaded from: classes3.dex */
class e0 {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f39210a = c.a.a(ProtectedSandApp.s("ǘ"), ProtectedSandApp.s("Ǚ"), ProtectedSandApp.s("ǚ"), ProtectedSandApp.s("ǖ"), ProtectedSandApp.s("Ǘ"));

    private e0() {
    }

    static com.airbnb.lottie.model.content.l a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        String str = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        com.airbnb.lottie.model.animatable.l lVar = null;
        boolean z4 = false;
        while (cVar.f()) {
            int q4 = cVar.q(f39210a);
            if (q4 == 0) {
                str = cVar.l();
            } else if (q4 == 1) {
                bVar = d.f(cVar, kVar, false);
            } else if (q4 == 2) {
                bVar2 = d.f(cVar, kVar, false);
            } else if (q4 == 3) {
                lVar = c.g(cVar, kVar);
            } else if (q4 != 4) {
                cVar.t();
            } else {
                z4 = cVar.g();
            }
        }
        return new com.airbnb.lottie.model.content.l(str, bVar, bVar2, lVar, z4);
    }
}
