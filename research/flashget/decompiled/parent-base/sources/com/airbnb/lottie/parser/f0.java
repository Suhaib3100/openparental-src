package com.airbnb.lottie.parser;

import androidx.annotation.q0;
import com.airbnb.lottie.parser.moshi.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: RoundedCornersParser.java */
/* loaded from: classes3.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f39212a = c.a.a(ProtectedSandApp.s("Ǡ"), ProtectedSandApp.s("Ǟ"), ProtectedSandApp.s("ǟ"));

    private f0() {
    }

    @q0
    static com.airbnb.lottie.model.content.m a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        boolean z4 = false;
        String str = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        while (cVar.f()) {
            int q4 = cVar.q(f39212a);
            if (q4 == 0) {
                str = cVar.l();
            } else if (q4 == 1) {
                bVar = d.f(cVar, kVar, true);
            } else if (q4 != 2) {
                cVar.t();
            } else {
                z4 = cVar.g();
            }
        }
        if (z4) {
            return null;
        }
        return new com.airbnb.lottie.model.content.m(str, bVar);
    }
}
