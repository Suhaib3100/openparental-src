package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: AnimatableTextPropertiesParser.java */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f39201a = c.a.a(ProtectedSandApp.s("Ƶ"));

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f39202b = c.a.a(ProtectedSandApp.s("Ƹ"), ProtectedSandApp.s("ƹ"), ProtectedSandApp.s("ƶ"), ProtectedSandApp.s("Ʒ"));

    private b() {
    }

    public static com.airbnb.lottie.model.animatable.k a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        cVar.c();
        com.airbnb.lottie.model.animatable.k kVar2 = null;
        while (cVar.f()) {
            if (cVar.q(f39201a) != 0) {
                cVar.s();
                cVar.t();
            } else {
                kVar2 = b(cVar, kVar);
            }
        }
        cVar.e();
        return kVar2 == null ? new com.airbnb.lottie.model.animatable.k(null, null, null, null) : kVar2;
    }

    private static com.airbnb.lottie.model.animatable.k b(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        cVar.c();
        com.airbnb.lottie.model.animatable.a aVar = null;
        com.airbnb.lottie.model.animatable.a aVar2 = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        while (cVar.f()) {
            int q4 = cVar.q(f39202b);
            if (q4 == 0) {
                aVar = d.c(cVar, kVar);
            } else if (q4 == 1) {
                aVar2 = d.c(cVar, kVar);
            } else if (q4 == 2) {
                bVar = d.f(cVar, kVar, true);
            } else if (q4 != 3) {
                cVar.s();
                cVar.t();
            } else {
                bVar2 = d.f(cVar, kVar, true);
            }
        }
        cVar.e();
        return new com.airbnb.lottie.model.animatable.k(aVar, aVar2, bVar, bVar2);
    }
}
