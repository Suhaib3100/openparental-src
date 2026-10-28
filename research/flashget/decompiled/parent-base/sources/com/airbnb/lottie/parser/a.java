package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: AnimatablePathValueParser.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f39199a = c.a.a(ProtectedSandApp.s("Ʋ"), ProtectedSandApp.s("ư"), ProtectedSandApp.s("Ʊ"));

    private a() {
    }

    public static com.airbnb.lottie.model.animatable.e a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (cVar.n() == c.b.BEGIN_ARRAY) {
            cVar.b();
            while (cVar.f()) {
                arrayList.add(z.a(cVar, kVar));
            }
            cVar.d();
            u.b(arrayList);
        } else {
            arrayList.add(new com.airbnb.lottie.value.a(s.e(cVar, com.airbnb.lottie.utils.j.e())));
        }
        return new com.airbnb.lottie.model.animatable.e(arrayList);
    }

    static com.airbnb.lottie.model.animatable.m<PointF, PointF> b(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        cVar.c();
        com.airbnb.lottie.model.animatable.e eVar = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        boolean z4 = false;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        while (cVar.n() != c.b.END_OBJECT) {
            int q4 = cVar.q(f39199a);
            if (q4 == 0) {
                eVar = a(cVar, kVar);
            } else if (q4 != 1) {
                if (q4 != 2) {
                    cVar.s();
                    cVar.t();
                } else if (cVar.n() == c.b.STRING) {
                    cVar.t();
                    z4 = true;
                } else {
                    bVar = d.f(cVar, kVar, true);
                }
            } else if (cVar.n() == c.b.STRING) {
                cVar.t();
                z4 = true;
            } else {
                bVar2 = d.f(cVar, kVar, true);
            }
        }
        cVar.e();
        if (z4) {
            kVar.a(ProtectedSandApp.s("Ƴ"));
        }
        return eVar != null ? eVar : new com.airbnb.lottie.model.animatable.i(bVar2, bVar);
    }
}
