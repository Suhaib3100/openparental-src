package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: KeyframesParser.java */
/* loaded from: classes3.dex */
class u {

    /* renamed from: a, reason: collision with root package name */
    static c.a f39323a = c.a.a(ProtectedSandApp.s("ʨ"));

    private u() {
    }

    static <T> List<com.airbnb.lottie.value.a<T>> a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar, float f4, n0<T> n0Var, boolean z4) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (cVar.n() == c.b.STRING) {
            kVar.a(ProtectedSandApp.s("ʩ"));
            return arrayList;
        }
        cVar.c();
        while (cVar.f()) {
            if (cVar.q(f39323a) != 0) {
                cVar.t();
            } else if (cVar.n() == c.b.BEGIN_ARRAY) {
                cVar.b();
                if (cVar.n() == c.b.NUMBER) {
                    arrayList.add(t.c(cVar, kVar, f4, n0Var, false, z4));
                } else {
                    while (cVar.f()) {
                        arrayList.add(t.c(cVar, kVar, f4, n0Var, true, z4));
                    }
                }
                cVar.d();
            } else {
                arrayList.add(t.c(cVar, kVar, f4, n0Var, false, z4));
            }
        }
        cVar.e();
        b(arrayList);
        return arrayList;
    }

    public static <T> void b(List<? extends com.airbnb.lottie.value.a<T>> list) {
        int i4;
        T t4;
        int size = list.size();
        int i5 = 0;
        while (true) {
            i4 = size - 1;
            if (i5 >= i4) {
                break;
            }
            com.airbnb.lottie.value.a<T> aVar = list.get(i5);
            i5++;
            com.airbnb.lottie.value.a<T> aVar2 = list.get(i5);
            aVar.f39411h = Float.valueOf(aVar2.f39410g);
            if (aVar.f39406c == null && (t4 = aVar2.f39405b) != null) {
                aVar.f39406c = t4;
                if (aVar instanceof com.airbnb.lottie.animation.keyframe.i) {
                    ((com.airbnb.lottie.animation.keyframe.i) aVar).i();
                }
            }
        }
        com.airbnb.lottie.value.a<T> aVar3 = list.get(i4);
        if ((aVar3.f39405b == null || aVar3.f39406c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
