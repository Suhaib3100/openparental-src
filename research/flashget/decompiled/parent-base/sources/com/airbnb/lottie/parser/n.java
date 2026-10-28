package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: FontParser.java */
/* loaded from: classes3.dex */
class n {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f39308a = c.a.a(ProtectedSandApp.s("ɽ"), ProtectedSandApp.s("ɾ"), ProtectedSandApp.s("ɻ"), ProtectedSandApp.s("ɼ"));

    private n() {
    }

    static com.airbnb.lottie.model.c a(com.airbnb.lottie.parser.moshi.c cVar) throws IOException {
        cVar.c();
        String str = null;
        String str2 = null;
        float f4 = 0.0f;
        String str3 = null;
        while (cVar.f()) {
            int q4 = cVar.q(f39308a);
            if (q4 == 0) {
                str = cVar.l();
            } else if (q4 == 1) {
                str3 = cVar.l();
            } else if (q4 == 2) {
                str2 = cVar.l();
            } else if (q4 != 3) {
                cVar.s();
                cVar.t();
            } else {
                f4 = (float) cVar.h();
            }
        }
        cVar.e();
        return new com.airbnb.lottie.model.c(str, str3, str2, f4);
    }
}
