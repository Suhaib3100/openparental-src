package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: FontCharacterParser.java */
/* loaded from: classes3.dex */
class m {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f39238a = c.a.a(ProtectedSandApp.s("ȱ"), ProtectedSandApp.s("Ȳ"), ProtectedSandApp.s("ȳ"), ProtectedSandApp.s("ȴ"), ProtectedSandApp.s("ȯ"), ProtectedSandApp.s("Ȱ"));

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f39239b = c.a.a(ProtectedSandApp.s("ȵ"));

    private m() {
    }

    static com.airbnb.lottie.model.d a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        cVar.c();
        double d5 = 0.0d;
        String str = null;
        String str2 = null;
        char c5 = 0;
        double d6 = 0.0d;
        while (cVar.f()) {
            int q4 = cVar.q(f39238a);
            if (q4 == 0) {
                c5 = cVar.l().charAt(0);
            } else if (q4 == 1) {
                d6 = cVar.h();
            } else if (q4 == 2) {
                d5 = cVar.h();
            } else if (q4 == 3) {
                str = cVar.l();
            } else if (q4 == 4) {
                str2 = cVar.l();
            } else if (q4 != 5) {
                cVar.s();
                cVar.t();
            } else {
                cVar.c();
                while (cVar.f()) {
                    if (cVar.q(f39239b) != 0) {
                        cVar.s();
                        cVar.t();
                    } else {
                        cVar.b();
                        while (cVar.f()) {
                            arrayList.add((com.airbnb.lottie.model.content.p) h.a(cVar, kVar));
                        }
                        cVar.d();
                    }
                }
                cVar.e();
            }
        }
        cVar.e();
        return new com.airbnb.lottie.model.d(arrayList, c5, d6, d5, str, str2);
    }
}
