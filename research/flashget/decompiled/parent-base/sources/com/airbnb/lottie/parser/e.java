package com.airbnb.lottie.parser;

import androidx.annotation.q0;
import com.airbnb.lottie.parser.moshi.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: BlurEffectParser.java */
/* loaded from: classes3.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f39208a = c.a.a(ProtectedSandApp.s("Ǜ"));

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f39209b = c.a.a(ProtectedSandApp.s("ǜ"), ProtectedSandApp.s("ǝ"));

    e() {
    }

    @q0
    private static com.airbnb.lottie.model.content.a a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        cVar.c();
        com.airbnb.lottie.model.content.a aVar = null;
        while (true) {
            boolean z4 = false;
            while (cVar.f()) {
                int q4 = cVar.q(f39209b);
                if (q4 != 0) {
                    if (q4 != 1) {
                        cVar.s();
                        cVar.t();
                    } else if (z4) {
                        aVar = new com.airbnb.lottie.model.content.a(d.f(cVar, kVar, true));
                    } else {
                        cVar.t();
                    }
                } else if (cVar.i() == 0) {
                    z4 = true;
                }
            }
            cVar.e();
            return aVar;
        }
    }

    @q0
    static com.airbnb.lottie.model.content.a b(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        com.airbnb.lottie.model.content.a aVar = null;
        while (cVar.f()) {
            if (cVar.q(f39208a) != 0) {
                cVar.s();
                cVar.t();
            } else {
                cVar.b();
                while (cVar.f()) {
                    com.airbnb.lottie.model.content.a a5 = a(cVar, kVar);
                    if (a5 != null) {
                        aVar = a5;
                    }
                }
                cVar.d();
            }
        }
        return aVar;
    }
}
