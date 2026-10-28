package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.content.r;
import com.airbnb.lottie.parser.moshi.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: GradientStrokeParser.java */
/* loaded from: classes3.dex */
class q {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f39312a = c.a.a(ProtectedSandApp.s("ʋ"), ProtectedSandApp.s("ʌ"), ProtectedSandApp.s("ʍ"), ProtectedSandApp.s("ʎ"), ProtectedSandApp.s("ʏ"), ProtectedSandApp.s("ʐ"), ProtectedSandApp.s("ʑ"), ProtectedSandApp.s("ʒ"), ProtectedSandApp.s("ʓ"), ProtectedSandApp.s("ʔ"), ProtectedSandApp.s("ʉ"), ProtectedSandApp.s("ʊ"));

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f39313b = c.a.a(ProtectedSandApp.s("ʕ"), ProtectedSandApp.s("ʖ"));

    /* renamed from: c, reason: collision with root package name */
    private static final c.a f39314c = c.a.a(ProtectedSandApp.s("ʗ"), ProtectedSandApp.s("ʘ"));

    private q() {
    }

    static com.airbnb.lottie.model.content.f a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        String str;
        com.airbnb.lottie.model.animatable.c cVar2;
        ArrayList arrayList = new ArrayList();
        float f4 = 0.0f;
        String str2 = null;
        com.airbnb.lottie.model.content.g gVar = null;
        com.airbnb.lottie.model.animatable.c cVar3 = null;
        com.airbnb.lottie.model.animatable.f fVar = null;
        com.airbnb.lottie.model.animatable.f fVar2 = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        r.b bVar2 = null;
        r.c cVar4 = null;
        com.airbnb.lottie.model.animatable.b bVar3 = null;
        boolean z4 = false;
        com.airbnb.lottie.model.animatable.d dVar = null;
        while (cVar.f()) {
            switch (cVar.q(f39312a)) {
                case 0:
                    str2 = cVar.l();
                    continue;
                case 1:
                    str = str2;
                    cVar.c();
                    int i4 = -1;
                    while (cVar.f()) {
                        int q4 = cVar.q(f39313b);
                        if (q4 != 0) {
                            cVar2 = cVar3;
                            if (q4 != 1) {
                                cVar.s();
                                cVar.t();
                            } else {
                                cVar3 = d.g(cVar, kVar, i4);
                            }
                        } else {
                            cVar2 = cVar3;
                            i4 = cVar.i();
                        }
                        cVar3 = cVar2;
                    }
                    cVar.e();
                    break;
                case 2:
                    dVar = d.h(cVar, kVar);
                    continue;
                case 3:
                    str = str2;
                    gVar = cVar.i() == 1 ? com.airbnb.lottie.model.content.g.LINEAR : com.airbnb.lottie.model.content.g.RADIAL;
                    break;
                case 4:
                    fVar = d.i(cVar, kVar);
                    continue;
                case 5:
                    fVar2 = d.i(cVar, kVar);
                    continue;
                case 6:
                    str = str2;
                    bVar = d.f(cVar, kVar, true);
                    break;
                case 7:
                    str = str2;
                    bVar2 = r.b.values()[cVar.i() - 1];
                    break;
                case 8:
                    str = str2;
                    cVar4 = r.c.values()[cVar.i() - 1];
                    break;
                case 9:
                    str = str2;
                    f4 = (float) cVar.h();
                    break;
                case 10:
                    z4 = cVar.g();
                    continue;
                case 11:
                    cVar.b();
                    while (cVar.f()) {
                        cVar.c();
                        String str3 = null;
                        com.airbnb.lottie.model.animatable.b bVar4 = null;
                        while (cVar.f()) {
                            int q5 = cVar.q(f39314c);
                            if (q5 != 0) {
                                com.airbnb.lottie.model.animatable.b bVar5 = bVar3;
                                if (q5 != 1) {
                                    cVar.s();
                                    cVar.t();
                                } else {
                                    bVar4 = d.f(cVar, kVar, true);
                                }
                                bVar3 = bVar5;
                            } else {
                                str3 = cVar.l();
                            }
                        }
                        com.airbnb.lottie.model.animatable.b bVar6 = bVar3;
                        cVar.e();
                        if (str3.equals(ProtectedSandApp.s("ʍ"))) {
                            bVar3 = bVar4;
                        } else {
                            if (str3.equals(ProtectedSandApp.s("ʊ")) || str3.equals(ProtectedSandApp.s("ʌ"))) {
                                kVar.y(true);
                                arrayList.add(bVar4);
                            }
                            bVar3 = bVar6;
                        }
                    }
                    com.airbnb.lottie.model.animatable.b bVar7 = bVar3;
                    cVar.d();
                    if (arrayList.size() == 1) {
                        arrayList.add((com.airbnb.lottie.model.animatable.b) arrayList.get(0));
                    }
                    bVar3 = bVar7;
                    continue;
                default:
                    cVar.s();
                    cVar.t();
                    continue;
            }
            str2 = str;
        }
        String str4 = str2;
        if (dVar == null) {
            dVar = new com.airbnb.lottie.model.animatable.d(Collections.singletonList(new com.airbnb.lottie.value.a(100)));
        }
        return new com.airbnb.lottie.model.content.f(str4, gVar, cVar3, dVar, fVar, fVar2, bVar, bVar2, cVar4, f4, arrayList, bVar3, z4);
    }
}
