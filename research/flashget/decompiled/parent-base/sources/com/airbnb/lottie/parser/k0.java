package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: ShapePathParser.java */
/* loaded from: classes3.dex */
class k0 {

    /* renamed from: a, reason: collision with root package name */
    static c.a f39234a = c.a.a(ProtectedSandApp.s("ȓ"), ProtectedSandApp.s("Ȕ"), ProtectedSandApp.s("ȑ"), ProtectedSandApp.s("Ȓ"));

    private k0() {
    }

    static com.airbnb.lottie.model.content.q a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        String str = null;
        int i4 = 0;
        boolean z4 = false;
        com.airbnb.lottie.model.animatable.h hVar = null;
        while (cVar.f()) {
            int q4 = cVar.q(f39234a);
            if (q4 == 0) {
                str = cVar.l();
            } else if (q4 == 1) {
                i4 = cVar.i();
            } else if (q4 == 2) {
                hVar = d.k(cVar, kVar);
            } else if (q4 != 3) {
                cVar.t();
            } else {
                z4 = cVar.g();
            }
        }
        return new com.airbnb.lottie.model.content.q(str, i4, hVar, z4);
    }
}
