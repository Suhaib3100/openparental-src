package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: ShapeGroupParser.java */
/* loaded from: classes3.dex */
class j0 {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f39226a = c.a.a(ProtectedSandApp.s("Ȑ"), ProtectedSandApp.s("Ȏ"), ProtectedSandApp.s("ȏ"));

    private j0() {
    }

    static com.airbnb.lottie.model.content.p a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z4 = false;
        while (cVar.f()) {
            int q4 = cVar.q(f39226a);
            if (q4 == 0) {
                str = cVar.l();
            } else if (q4 == 1) {
                z4 = cVar.g();
            } else if (q4 != 2) {
                cVar.t();
            } else {
                cVar.b();
                while (cVar.f()) {
                    com.airbnb.lottie.model.content.c a5 = h.a(cVar, kVar);
                    if (a5 != null) {
                        arrayList.add(a5);
                    }
                }
                cVar.d();
            }
        }
        return new com.airbnb.lottie.model.content.p(str, arrayList, z4);
    }
}
