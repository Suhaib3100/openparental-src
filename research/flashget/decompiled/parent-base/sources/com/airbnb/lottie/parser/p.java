package com.airbnb.lottie.parser;

import android.graphics.Path;
import com.airbnb.lottie.parser.moshi.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.Collections;

/* compiled from: GradientFillParser.java */
/* loaded from: classes3.dex */
class p {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f39310a = c.a.a(ProtectedSandApp.s("ʁ"), ProtectedSandApp.s("ʂ"), ProtectedSandApp.s("ʃ"), ProtectedSandApp.s("ʄ"), ProtectedSandApp.s("ʅ"), ProtectedSandApp.s("ʆ"), ProtectedSandApp.s("ɿ"), ProtectedSandApp.s("ʀ"));

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f39311b = c.a.a(ProtectedSandApp.s("ʇ"), ProtectedSandApp.s("ʈ"));

    private p() {
    }

    static com.airbnb.lottie.model.content.e a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        com.airbnb.lottie.model.animatable.d dVar = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        com.airbnb.lottie.model.content.g gVar = null;
        com.airbnb.lottie.model.animatable.c cVar2 = null;
        com.airbnb.lottie.model.animatable.f fVar = null;
        com.airbnb.lottie.model.animatable.f fVar2 = null;
        boolean z4 = false;
        while (cVar.f()) {
            switch (cVar.q(f39310a)) {
                case 0:
                    str = cVar.l();
                    break;
                case 1:
                    cVar.c();
                    int i4 = -1;
                    while (cVar.f()) {
                        int q4 = cVar.q(f39311b);
                        if (q4 == 0) {
                            i4 = cVar.i();
                        } else if (q4 != 1) {
                            cVar.s();
                            cVar.t();
                        } else {
                            cVar2 = d.g(cVar, kVar, i4);
                        }
                    }
                    cVar.e();
                    break;
                case 2:
                    dVar = d.h(cVar, kVar);
                    break;
                case 3:
                    gVar = cVar.i() == 1 ? com.airbnb.lottie.model.content.g.LINEAR : com.airbnb.lottie.model.content.g.RADIAL;
                    break;
                case 4:
                    fVar = d.i(cVar, kVar);
                    break;
                case 5:
                    fVar2 = d.i(cVar, kVar);
                    break;
                case 6:
                    fillType = cVar.i() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    z4 = cVar.g();
                    break;
                default:
                    cVar.s();
                    cVar.t();
                    break;
            }
        }
        return new com.airbnb.lottie.model.content.e(str, gVar, fillType, cVar2, dVar == null ? new com.airbnb.lottie.model.animatable.d(Collections.singletonList(new com.airbnb.lottie.value.a(100))) : dVar, fVar, fVar2, null, null, z4);
    }
}
