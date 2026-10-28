package com.airbnb.lottie.parser;

import android.graphics.Rect;
import androidx.collection.c3;
import androidx.collection.e1;
import com.airbnb.lottie.model.layer.e;
import com.airbnb.lottie.parser.moshi.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: LottieCompositionMoshiParser.java */
/* loaded from: classes3.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f39328a = c.a.a(ProtectedSandApp.s("ˎ"), ProtectedSandApp.s("ˏ"), ProtectedSandApp.s("ː"), ProtectedSandApp.s("ˑ"), ProtectedSandApp.s("˒"), ProtectedSandApp.s("˓"), ProtectedSandApp.s("˔"), ProtectedSandApp.s("˕"), ProtectedSandApp.s("˖"), ProtectedSandApp.s("ˌ"), ProtectedSandApp.s("ˍ"));

    /* renamed from: b, reason: collision with root package name */
    static c.a f39329b = c.a.a(ProtectedSandApp.s("˙"), ProtectedSandApp.s("˔"), ProtectedSandApp.s("ˎ"), ProtectedSandApp.s("ˏ"), ProtectedSandApp.s("˗"), ProtectedSandApp.s("˘"));

    /* renamed from: c, reason: collision with root package name */
    private static final c.a f39330c = c.a.a(ProtectedSandApp.s("˚"));

    /* renamed from: d, reason: collision with root package name */
    private static final c.a f39331d = c.a.a(ProtectedSandApp.s("˝"), ProtectedSandApp.s("˛"), ProtectedSandApp.s("˜"));

    public static com.airbnb.lottie.k a(com.airbnb.lottie.parser.moshi.c cVar) throws IOException {
        HashMap hashMap;
        ArrayList arrayList;
        com.airbnb.lottie.parser.moshi.c cVar2 = cVar;
        float e4 = com.airbnb.lottie.utils.j.e();
        e1<com.airbnb.lottie.model.layer.e> e1Var = new e1<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        c3<com.airbnb.lottie.model.d> c3Var = new c3<>();
        com.airbnb.lottie.k kVar = new com.airbnb.lottie.k();
        cVar.c();
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        int i4 = 0;
        int i5 = 0;
        while (cVar.f()) {
            switch (cVar2.q(f39328a)) {
                case 0:
                    i4 = cVar.i();
                    continue;
                case 1:
                    i5 = cVar.i();
                    continue;
                case 2:
                    f4 = (float) cVar.h();
                    continue;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f5 = ((float) cVar.h()) - 0.01f;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f6 = (float) cVar.h();
                    break;
                case 5:
                    String[] split = cVar.l().split(ProtectedSandApp.s("˞"));
                    if (com.airbnb.lottie.utils.j.j(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        break;
                    } else {
                        kVar.a(ProtectedSandApp.s("˟"));
                        continue;
                    }
                case 6:
                    e(cVar2, kVar, arrayList2, e1Var);
                    continue;
                case 7:
                    b(cVar2, kVar, hashMap2, hashMap3);
                    continue;
                case 8:
                    d(cVar2, hashMap4);
                    continue;
                case 9:
                    c(cVar2, kVar, c3Var);
                    continue;
                case 10:
                    f(cVar2, arrayList3);
                    continue;
                default:
                    cVar.s();
                    cVar.t();
                    continue;
            }
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            cVar2 = cVar;
        }
        kVar.w(new Rect(0, 0, (int) (i4 * e4), (int) (i5 * e4)), f4, f5, f6, arrayList2, e1Var, hashMap2, hashMap3, c3Var, hashMap4, arrayList3);
        return kVar;
    }

    private static void b(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar, Map<String, List<com.airbnb.lottie.model.layer.e>> map, Map<String, com.airbnb.lottie.o0> map2) throws IOException {
        cVar.b();
        while (cVar.f()) {
            ArrayList arrayList = new ArrayList();
            e1 e1Var = new e1();
            cVar.c();
            int i4 = 0;
            int i5 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (cVar.f()) {
                int q4 = cVar.q(f39329b);
                if (q4 == 0) {
                    str = cVar.l();
                } else if (q4 == 1) {
                    cVar.b();
                    while (cVar.f()) {
                        com.airbnb.lottie.model.layer.e b5 = v.b(cVar, kVar);
                        e1Var.p(b5.d(), b5);
                        arrayList.add(b5);
                    }
                    cVar.d();
                } else if (q4 == 2) {
                    i4 = cVar.i();
                } else if (q4 == 3) {
                    i5 = cVar.i();
                } else if (q4 == 4) {
                    str2 = cVar.l();
                } else if (q4 != 5) {
                    cVar.s();
                    cVar.t();
                } else {
                    str3 = cVar.l();
                }
            }
            cVar.e();
            if (str2 != null) {
                com.airbnb.lottie.o0 o0Var = new com.airbnb.lottie.o0(i4, i5, str, str2, str3);
                map2.put(o0Var.e(), o0Var);
            } else {
                map.put(str, arrayList);
            }
        }
        cVar.d();
    }

    private static void c(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar, c3<com.airbnb.lottie.model.d> c3Var) throws IOException {
        cVar.b();
        while (cVar.f()) {
            com.airbnb.lottie.model.d a5 = m.a(cVar, kVar);
            c3Var.q(a5.hashCode(), a5);
        }
        cVar.d();
    }

    private static void d(com.airbnb.lottie.parser.moshi.c cVar, Map<String, com.airbnb.lottie.model.c> map) throws IOException {
        cVar.c();
        while (cVar.f()) {
            if (cVar.q(f39330c) != 0) {
                cVar.s();
                cVar.t();
            } else {
                cVar.b();
                while (cVar.f()) {
                    com.airbnb.lottie.model.c a5 = n.a(cVar);
                    map.put(a5.c(), a5);
                }
                cVar.d();
            }
        }
        cVar.e();
    }

    private static void e(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar, List<com.airbnb.lottie.model.layer.e> list, e1<com.airbnb.lottie.model.layer.e> e1Var) throws IOException {
        cVar.b();
        int i4 = 0;
        while (cVar.f()) {
            com.airbnb.lottie.model.layer.e b5 = v.b(cVar, kVar);
            if (b5.f() == e.a.IMAGE) {
                i4++;
            }
            list.add(b5);
            e1Var.p(b5.d(), b5);
            if (i4 > 4) {
                com.airbnb.lottie.utils.f.e(ProtectedSandApp.s("ˠ") + i4 + ProtectedSandApp.s("ˡ"));
            }
        }
        cVar.d();
    }

    private static void f(com.airbnb.lottie.parser.moshi.c cVar, List<com.airbnb.lottie.model.h> list) throws IOException {
        cVar.b();
        while (cVar.f()) {
            cVar.c();
            float f4 = 0.0f;
            String str = null;
            float f5 = 0.0f;
            while (cVar.f()) {
                int q4 = cVar.q(f39331d);
                if (q4 == 0) {
                    str = cVar.l();
                } else if (q4 == 1) {
                    f4 = (float) cVar.h();
                } else if (q4 != 2) {
                    cVar.s();
                    cVar.t();
                } else {
                    f5 = (float) cVar.h();
                }
            }
            cVar.e();
            list.add(new com.airbnb.lottie.model.h(str, f4, f5));
        }
        cVar.d();
    }
}
