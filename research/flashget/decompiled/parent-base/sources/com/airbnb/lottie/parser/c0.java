package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.model.content.j;
import com.airbnb.lottie.parser.moshi.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: PolystarShapeParser.java */
/* loaded from: classes3.dex */
class c0 {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f39206a = c.a.a(ProtectedSandApp.s("Ƽ"), ProtectedSandApp.s("ƽ"), ProtectedSandApp.s("ƾ"), ProtectedSandApp.s("ƿ"), ProtectedSandApp.s("ǀ"), ProtectedSandApp.s("ǁ"), ProtectedSandApp.s("ǂ"), ProtectedSandApp.s("ǃ"), ProtectedSandApp.s("Ǆ"), ProtectedSandApp.s("ƺ"), ProtectedSandApp.s("ƻ"));

    private c0() {
    }

    static com.airbnb.lottie.model.content.j a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar, int i4) throws IOException {
        boolean z4 = false;
        boolean z5 = i4 == 3;
        String str = null;
        j.a aVar = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar = null;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        com.airbnb.lottie.model.animatable.b bVar3 = null;
        com.airbnb.lottie.model.animatable.b bVar4 = null;
        com.airbnb.lottie.model.animatable.b bVar5 = null;
        com.airbnb.lottie.model.animatable.b bVar6 = null;
        while (cVar.f()) {
            switch (cVar.q(f39206a)) {
                case 0:
                    str = cVar.l();
                    break;
                case 1:
                    aVar = j.a.forValue(cVar.i());
                    break;
                case 2:
                    bVar = d.f(cVar, kVar, false);
                    break;
                case 3:
                    mVar = a.b(cVar, kVar);
                    break;
                case 4:
                    bVar2 = d.f(cVar, kVar, false);
                    break;
                case 5:
                    bVar4 = d.f(cVar, kVar, true);
                    break;
                case 6:
                    bVar6 = d.f(cVar, kVar, false);
                    break;
                case 7:
                    bVar3 = d.f(cVar, kVar, true);
                    break;
                case 8:
                    bVar5 = d.f(cVar, kVar, false);
                    break;
                case 9:
                    z4 = cVar.g();
                    break;
                case 10:
                    if (cVar.i() != 3) {
                        z5 = false;
                        break;
                    } else {
                        z5 = true;
                        break;
                    }
                default:
                    cVar.s();
                    cVar.t();
                    break;
            }
        }
        return new com.airbnb.lottie.model.content.j(str, aVar, bVar, mVar, bVar2, bVar3, bVar4, bVar5, bVar6, z4, z5);
    }
}
