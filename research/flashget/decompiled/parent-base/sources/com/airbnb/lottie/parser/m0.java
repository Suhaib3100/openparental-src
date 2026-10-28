package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.content.s;
import com.airbnb.lottie.parser.moshi.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: ShapeTrimPathParser.java */
/* loaded from: classes3.dex */
class m0 {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f39240a = c.a.a(ProtectedSandApp.s("ȫ"), ProtectedSandApp.s("Ȭ"), ProtectedSandApp.s("ȭ"), ProtectedSandApp.s("Ȯ"), ProtectedSandApp.s("ȩ"), ProtectedSandApp.s("Ȫ"));

    private m0() {
    }

    static com.airbnb.lottie.model.content.s a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        String str = null;
        s.a aVar = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        com.airbnb.lottie.model.animatable.b bVar3 = null;
        boolean z4 = false;
        while (cVar.f()) {
            int q4 = cVar.q(f39240a);
            if (q4 == 0) {
                bVar = d.f(cVar, kVar, false);
            } else if (q4 == 1) {
                bVar2 = d.f(cVar, kVar, false);
            } else if (q4 == 2) {
                bVar3 = d.f(cVar, kVar, false);
            } else if (q4 == 3) {
                str = cVar.l();
            } else if (q4 == 4) {
                aVar = s.a.forId(cVar.i());
            } else if (q4 != 5) {
                cVar.t();
            } else {
                z4 = cVar.g();
            }
        }
        return new com.airbnb.lottie.model.content.s(str, aVar, bVar, bVar2, bVar3, z4);
    }
}
