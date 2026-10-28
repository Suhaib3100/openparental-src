package com.airbnb.lottie.parser;

import androidx.annotation.q0;
import com.airbnb.lottie.parser.moshi.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: DropShadowEffectParser.java */
/* loaded from: classes3.dex */
public class k {

    /* renamed from: f, reason: collision with root package name */
    private static final c.a f39227f = c.a.a(ProtectedSandApp.s("ȕ"));

    /* renamed from: g, reason: collision with root package name */
    private static final c.a f39228g = c.a.a(ProtectedSandApp.s("Ȗ"), ProtectedSandApp.s("ȗ"));

    /* renamed from: a, reason: collision with root package name */
    private com.airbnb.lottie.model.animatable.a f39229a;

    /* renamed from: b, reason: collision with root package name */
    private com.airbnb.lottie.model.animatable.b f39230b;

    /* renamed from: c, reason: collision with root package name */
    private com.airbnb.lottie.model.animatable.b f39231c;

    /* renamed from: d, reason: collision with root package name */
    private com.airbnb.lottie.model.animatable.b f39232d;

    /* renamed from: e, reason: collision with root package name */
    private com.airbnb.lottie.model.animatable.b f39233e;

    private void a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        cVar.c();
        String str = "";
        while (cVar.f()) {
            int q4 = cVar.q(f39228g);
            if (q4 == 0) {
                str = cVar.l();
            } else if (q4 == 1) {
                str.getClass();
                char c5 = 65535;
                switch (str.hashCode()) {
                    case 353103893:
                        if (str.equals(ProtectedSandApp.s("Ȝ"))) {
                            c5 = 0;
                            break;
                        }
                        break;
                    case 397447147:
                        if (str.equals(ProtectedSandApp.s("ț"))) {
                            c5 = 1;
                            break;
                        }
                        break;
                    case 1041377119:
                        if (str.equals(ProtectedSandApp.s("Ț"))) {
                            c5 = 2;
                            break;
                        }
                        break;
                    case 1379387491:
                        if (str.equals(ProtectedSandApp.s("ș"))) {
                            c5 = 3;
                            break;
                        }
                        break;
                    case 1383710113:
                        if (str.equals(ProtectedSandApp.s("Ș"))) {
                            c5 = 4;
                            break;
                        }
                        break;
                }
                switch (c5) {
                    case 0:
                        this.f39232d = d.f(cVar, kVar, true);
                        break;
                    case 1:
                        this.f39230b = d.f(cVar, kVar, false);
                        break;
                    case 2:
                        this.f39231c = d.f(cVar, kVar, false);
                        break;
                    case 3:
                        this.f39229a = d.c(cVar, kVar);
                        break;
                    case 4:
                        this.f39233e = d.f(cVar, kVar, true);
                        break;
                    default:
                        cVar.t();
                        break;
                }
            } else {
                cVar.s();
                cVar.t();
            }
        }
        cVar.e();
    }

    @q0
    j b(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        com.airbnb.lottie.model.animatable.b bVar;
        com.airbnb.lottie.model.animatable.b bVar2;
        com.airbnb.lottie.model.animatable.b bVar3;
        com.airbnb.lottie.model.animatable.b bVar4;
        while (cVar.f()) {
            if (cVar.q(f39227f) != 0) {
                cVar.s();
                cVar.t();
            } else {
                cVar.b();
                while (cVar.f()) {
                    a(cVar, kVar);
                }
                cVar.d();
            }
        }
        com.airbnb.lottie.model.animatable.a aVar = this.f39229a;
        if (aVar == null || (bVar = this.f39230b) == null || (bVar2 = this.f39231c) == null || (bVar3 = this.f39232d) == null || (bVar4 = this.f39233e) == null) {
            return null;
        }
        return new j(aVar, bVar, bVar2, bVar3, bVar4);
    }
}
