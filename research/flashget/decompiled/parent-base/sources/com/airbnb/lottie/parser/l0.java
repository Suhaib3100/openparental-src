package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.content.r;
import com.airbnb.lottie.parser.moshi.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: ShapeStrokeParser.java */
/* loaded from: classes3.dex */
class l0 {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f39236a = c.a.a(ProtectedSandApp.s("ȟ"), ProtectedSandApp.s("Ƞ"), ProtectedSandApp.s("ȡ"), ProtectedSandApp.s("Ȣ"), ProtectedSandApp.s("ȣ"), ProtectedSandApp.s("Ȥ"), ProtectedSandApp.s("ȥ"), ProtectedSandApp.s("ȝ"), ProtectedSandApp.s("Ȟ"));

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f39237b = c.a.a(ProtectedSandApp.s("Ȧ"), ProtectedSandApp.s("ȧ"));

    private l0() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static com.airbnb.lottie.model.content.r a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        String str;
        char c5;
        ArrayList arrayList = new ArrayList();
        float f4 = 0.0f;
        String str2 = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        com.airbnb.lottie.model.animatable.a aVar = null;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        r.b bVar3 = null;
        r.c cVar2 = null;
        boolean z4 = false;
        com.airbnb.lottie.model.animatable.d dVar = null;
        while (cVar.f()) {
            switch (cVar.q(f39236a)) {
                case 0:
                    str2 = cVar.l();
                    continue;
                case 1:
                    aVar = d.c(cVar, kVar);
                    continue;
                case 2:
                    str = str2;
                    bVar2 = d.f(cVar, kVar, true);
                    break;
                case 3:
                    dVar = d.h(cVar, kVar);
                    continue;
                case 4:
                    str = str2;
                    bVar3 = r.b.values()[cVar.i() - 1];
                    break;
                case 5:
                    str = str2;
                    cVar2 = r.c.values()[cVar.i() - 1];
                    break;
                case 6:
                    str = str2;
                    f4 = (float) cVar.h();
                    break;
                case 7:
                    z4 = cVar.g();
                    continue;
                case 8:
                    cVar.b();
                    while (cVar.f()) {
                        cVar.c();
                        com.airbnb.lottie.model.animatable.b bVar4 = null;
                        String str3 = null;
                        while (cVar.f()) {
                            int q4 = cVar.q(f39237b);
                            if (q4 == 0) {
                                str3 = cVar.l();
                            } else if (q4 != 1) {
                                cVar.s();
                                cVar.t();
                            } else {
                                bVar4 = d.f(cVar, kVar, true);
                            }
                        }
                        cVar.e();
                        str3.getClass();
                        switch (str3.hashCode()) {
                            case 100:
                                if (str3.equals(ProtectedSandApp.s("Ȟ"))) {
                                    c5 = 0;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 103:
                                if (str3.equals(ProtectedSandApp.s("Ȩ"))) {
                                    c5 = 1;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 111:
                                if (str3.equals(ProtectedSandApp.s("Ȣ"))) {
                                    c5 = 2;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            default:
                                c5 = 65535;
                                break;
                        }
                        switch (c5) {
                            case 0:
                            case 1:
                                kVar.y(true);
                                arrayList.add(bVar4);
                                break;
                            case 2:
                                bVar = bVar4;
                                break;
                        }
                    }
                    cVar.d();
                    if (arrayList.size() == 1) {
                        arrayList.add((com.airbnb.lottie.model.animatable.b) arrayList.get(0));
                        break;
                    } else {
                        continue;
                    }
                    break;
                default:
                    cVar.t();
                    continue;
            }
            str2 = str;
        }
        String str4 = str2;
        if (dVar == null) {
            dVar = new com.airbnb.lottie.model.animatable.d(Collections.singletonList(new com.airbnb.lottie.value.a(100)));
        }
        return new com.airbnb.lottie.model.content.r(str4, bVar, arrayList, aVar, dVar, bVar2, bVar3, cVar2, f4, z4);
    }
}
