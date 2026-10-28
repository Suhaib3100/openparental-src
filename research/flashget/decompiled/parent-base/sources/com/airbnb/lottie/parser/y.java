package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.content.i;
import com.airbnb.lottie.parser.moshi.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: MergePathsParser.java */
/* loaded from: classes3.dex */
class y {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f39332a = c.a.a(ProtectedSandApp.s("˯"), ProtectedSandApp.s("˭"), ProtectedSandApp.s("ˮ"));

    private y() {
    }

    static com.airbnb.lottie.model.content.i a(com.airbnb.lottie.parser.moshi.c cVar) throws IOException {
        String str = null;
        boolean z4 = false;
        i.a aVar = null;
        while (cVar.f()) {
            int q4 = cVar.q(f39332a);
            if (q4 == 0) {
                str = cVar.l();
            } else if (q4 == 1) {
                aVar = i.a.forId(cVar.i());
            } else if (q4 != 2) {
                cVar.s();
                cVar.t();
            } else {
                z4 = cVar.g();
            }
        }
        return new com.airbnb.lottie.model.content.i(str, aVar, z4);
    }
}
