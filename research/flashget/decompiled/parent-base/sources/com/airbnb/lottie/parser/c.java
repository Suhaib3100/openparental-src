package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: AnimatableTransformParser.java */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f39204a = c.a.a(ProtectedSandApp.s("Ǉ"), ProtectedSandApp.s("ǈ"), ProtectedSandApp.s("ǉ"), ProtectedSandApp.s("Ǌ"), ProtectedSandApp.s("ǋ"), ProtectedSandApp.s("ǌ"), ProtectedSandApp.s("Ǎ"), ProtectedSandApp.s("ǎ"), ProtectedSandApp.s("ǅ"), ProtectedSandApp.s("ǆ"));

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f39205b = c.a.a(ProtectedSandApp.s("Ǐ"));

    private c() {
    }

    private static boolean a(com.airbnb.lottie.model.animatable.e eVar) {
        return eVar == null || (eVar.o() && eVar.q().get(0).f39405b.equals(0.0f, 0.0f));
    }

    private static boolean b(com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar) {
        return mVar == null || (!(mVar instanceof com.airbnb.lottie.model.animatable.i) && mVar.o() && mVar.q().get(0).f39405b.equals(0.0f, 0.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean c(com.airbnb.lottie.model.animatable.b bVar) {
        return bVar == null || (bVar.o() && ((Float) ((com.airbnb.lottie.value.a) bVar.q().get(0)).f39405b).floatValue() == 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean d(com.airbnb.lottie.model.animatable.g gVar) {
        return gVar == null || (gVar.o() && ((com.airbnb.lottie.value.k) ((com.airbnb.lottie.value.a) gVar.q().get(0)).f39405b).a(1.0f, 1.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean e(com.airbnb.lottie.model.animatable.b bVar) {
        return bVar == null || (bVar.o() && ((Float) ((com.airbnb.lottie.value.a) bVar.q().get(0)).f39405b).floatValue() == 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean f(com.airbnb.lottie.model.animatable.b bVar) {
        return bVar == null || (bVar.o() && ((Float) ((com.airbnb.lottie.value.a) bVar.q().get(0)).f39405b).floatValue() == 0.0f);
    }

    public static com.airbnb.lottie.model.animatable.l g(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        boolean z4;
        boolean z5 = false;
        boolean z6 = cVar.n() == c.b.BEGIN_OBJECT;
        if (z6) {
            cVar.c();
        }
        com.airbnb.lottie.model.animatable.b bVar = null;
        com.airbnb.lottie.model.animatable.e eVar = null;
        com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar = null;
        com.airbnb.lottie.model.animatable.g gVar = null;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        com.airbnb.lottie.model.animatable.b bVar3 = null;
        com.airbnb.lottie.model.animatable.d dVar = null;
        com.airbnb.lottie.model.animatable.b bVar4 = null;
        com.airbnb.lottie.model.animatable.b bVar5 = null;
        while (cVar.f()) {
            switch (cVar.q(f39204a)) {
                case 0:
                    boolean z7 = z5;
                    cVar.c();
                    while (cVar.f()) {
                        if (cVar.q(f39205b) != 0) {
                            cVar.s();
                            cVar.t();
                        } else {
                            eVar = a.a(cVar, kVar);
                        }
                    }
                    cVar.e();
                    z5 = z7;
                    continue;
                case 1:
                    mVar = a.b(cVar, kVar);
                    continue;
                case 2:
                    gVar = d.j(cVar, kVar);
                    continue;
                case 3:
                    kVar.a(ProtectedSandApp.s("ǐ"));
                    break;
                case 4:
                    break;
                case 5:
                    dVar = d.h(cVar, kVar);
                    continue;
                case 6:
                    bVar4 = d.f(cVar, kVar, z5);
                    continue;
                case 7:
                    bVar5 = d.f(cVar, kVar, z5);
                    continue;
                case 8:
                    bVar2 = d.f(cVar, kVar, z5);
                    continue;
                case 9:
                    bVar3 = d.f(cVar, kVar, z5);
                    continue;
                default:
                    cVar.s();
                    cVar.t();
                    continue;
            }
            com.airbnb.lottie.model.animatable.b f4 = d.f(cVar, kVar, z5);
            if (f4.q().isEmpty()) {
                f4.q().add(new com.airbnb.lottie.value.a(kVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(kVar.f())));
            } else if (((com.airbnb.lottie.value.a) f4.q().get(0)).f39405b == 0) {
                z4 = false;
                f4.q().set(0, new com.airbnb.lottie.value.a(kVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(kVar.f())));
                z5 = z4;
                bVar = f4;
            }
            z4 = false;
            z5 = z4;
            bVar = f4;
        }
        if (z6) {
            cVar.e();
        }
        com.airbnb.lottie.model.animatable.e eVar2 = a(eVar) ? null : eVar;
        com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar2 = b(mVar) ? null : mVar;
        com.airbnb.lottie.model.animatable.b bVar6 = c(bVar) ? null : bVar;
        if (d(gVar)) {
            gVar = null;
        }
        return new com.airbnb.lottie.model.animatable.l(eVar2, mVar2, gVar, bVar6, dVar, bVar4, bVar5, f(bVar2) ? null : bVar2, e(bVar3) ? null : bVar3);
    }
}
