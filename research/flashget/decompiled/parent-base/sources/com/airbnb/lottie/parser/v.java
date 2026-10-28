package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.Rect;
import com.airbnb.lottie.model.layer.e;
import com.airbnb.lottie.parser.moshi.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: LayerParser.java */
/* loaded from: classes3.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f39324a = c.a.a(ProtectedSandApp.s("ʬ"), ProtectedSandApp.s("ʭ"), ProtectedSandApp.s("ʮ"), ProtectedSandApp.s("ʯ"), ProtectedSandApp.s("ʰ"), ProtectedSandApp.s("ʱ"), ProtectedSandApp.s("ʲ"), ProtectedSandApp.s("ʳ"), ProtectedSandApp.s("ʴ"), ProtectedSandApp.s("ʵ"), ProtectedSandApp.s("ʶ"), ProtectedSandApp.s("ʷ"), ProtectedSandApp.s("ʸ"), ProtectedSandApp.s("ʹ"), ProtectedSandApp.s("ʺ"), ProtectedSandApp.s("ʻ"), ProtectedSandApp.s("ʼ"), ProtectedSandApp.s("ʽ"), ProtectedSandApp.s("ʾ"), ProtectedSandApp.s("ʿ"), ProtectedSandApp.s("ˀ"), ProtectedSandApp.s("ʪ"), ProtectedSandApp.s("ʫ"));

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f39325b = c.a.a(ProtectedSandApp.s("ˁ"), ProtectedSandApp.s("˂"));

    /* renamed from: c, reason: collision with root package name */
    private static final c.a f39326c = c.a.a(ProtectedSandApp.s("ʯ"), ProtectedSandApp.s("ʬ"));

    /* compiled from: LayerParser.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f39327a;

        static {
            int[] iArr = new int[e.b.values().length];
            f39327a = iArr;
            try {
                iArr[e.b.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39327a[e.b.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private v() {
    }

    public static com.airbnb.lottie.model.layer.e a(com.airbnb.lottie.k kVar) {
        Rect b5 = kVar.b();
        return new com.airbnb.lottie.model.layer.e(Collections.emptyList(), kVar, ProtectedSandApp.s("˃"), -1L, e.a.PRE_COMP, -1L, null, Collections.emptyList(), new com.airbnb.lottie.model.animatable.l(), 0, 0, 0, 0.0f, 0.0f, b5.width(), b5.height(), null, null, Collections.emptyList(), e.b.NONE, null, false, null, null);
    }

    public static com.airbnb.lottie.model.layer.e b(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        float f4;
        e.b bVar = e.b.NONE;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        cVar.c();
        String s4 = ProtectedSandApp.s("˄");
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        e.b bVar2 = bVar;
        e.a aVar = null;
        String str = null;
        com.airbnb.lottie.model.animatable.l lVar = null;
        com.airbnb.lottie.model.animatable.j jVar = null;
        com.airbnb.lottie.model.animatable.k kVar2 = null;
        com.airbnb.lottie.model.animatable.b bVar3 = null;
        com.airbnb.lottie.model.content.a aVar2 = null;
        j jVar2 = null;
        long j4 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i10 = 0;
        boolean z4 = false;
        float f5 = 1.0f;
        long j5 = -1;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f10 = 0.0f;
        String str2 = s4;
        String str3 = null;
        while (cVar.f()) {
            switch (cVar.q(f39324a)) {
                case 0:
                    str2 = cVar.l();
                    break;
                case 1:
                    j4 = cVar.i();
                    break;
                case 2:
                    str = cVar.l();
                    break;
                case 3:
                    int i11 = cVar.i();
                    aVar = e.a.UNKNOWN;
                    if (i11 >= aVar.ordinal()) {
                        break;
                    } else {
                        aVar = e.a.values()[i11];
                        break;
                    }
                case 4:
                    j5 = cVar.i();
                    break;
                case 5:
                    i4 = (int) (com.airbnb.lottie.utils.j.e() * cVar.i());
                    break;
                case 6:
                    i5 = (int) (com.airbnb.lottie.utils.j.e() * cVar.i());
                    break;
                case 7:
                    i6 = Color.parseColor(cVar.l());
                    break;
                case 8:
                    lVar = c.g(cVar, kVar);
                    break;
                case 9:
                    int i12 = cVar.i();
                    if (i12 < e.b.values().length) {
                        bVar2 = e.b.values()[i12];
                        int i13 = a.f39327a[bVar2.ordinal()];
                        if (i13 == 1) {
                            kVar.a(ProtectedSandApp.s("ˈ"));
                        } else if (i13 == 2) {
                            kVar.a(ProtectedSandApp.s("ˇ"));
                        }
                        kVar.v(1);
                        break;
                    } else {
                        kVar.a(ProtectedSandApp.s("ˆ") + i12);
                        break;
                    }
                case 10:
                    cVar.b();
                    while (cVar.f()) {
                        arrayList3.add(x.a(cVar, kVar));
                    }
                    kVar.v(arrayList3.size());
                    cVar.d();
                    break;
                case 11:
                    cVar.b();
                    while (cVar.f()) {
                        com.airbnb.lottie.model.content.c a5 = h.a(cVar, kVar);
                        if (a5 != null) {
                            arrayList4.add(a5);
                        }
                    }
                    cVar.d();
                    break;
                case 12:
                    cVar.c();
                    while (cVar.f()) {
                        int q4 = cVar.q(f39325b);
                        if (q4 == 0) {
                            jVar = d.d(cVar, kVar);
                        } else if (q4 != 1) {
                            cVar.s();
                            cVar.t();
                        } else {
                            cVar.b();
                            if (cVar.f()) {
                                kVar2 = b.a(cVar, kVar);
                            }
                            while (cVar.f()) {
                                cVar.t();
                            }
                            cVar.d();
                        }
                    }
                    cVar.e();
                    break;
                case 13:
                    cVar.b();
                    ArrayList arrayList5 = new ArrayList();
                    while (cVar.f()) {
                        cVar.c();
                        while (cVar.f()) {
                            int q5 = cVar.q(f39326c);
                            if (q5 == 0) {
                                int i14 = cVar.i();
                                if (i14 == 29) {
                                    aVar2 = e.b(cVar, kVar);
                                } else if (i14 == 25) {
                                    jVar2 = new k().b(cVar, kVar);
                                }
                            } else if (q5 != 1) {
                                cVar.s();
                                cVar.t();
                            } else {
                                arrayList5.add(cVar.l());
                            }
                        }
                        cVar.e();
                    }
                    cVar.d();
                    kVar.a(ProtectedSandApp.s("˅") + arrayList5);
                    break;
                case 14:
                    f5 = (float) cVar.h();
                    break;
                case 15:
                    f7 = (float) cVar.h();
                    break;
                case 16:
                    i7 = (int) (com.airbnb.lottie.utils.j.e() * cVar.i());
                    break;
                case 17:
                    i10 = (int) (com.airbnb.lottie.utils.j.e() * cVar.i());
                    break;
                case 18:
                    f6 = (float) cVar.h();
                    break;
                case 19:
                    f10 = (float) cVar.h();
                    break;
                case 20:
                    bVar3 = d.f(cVar, kVar, false);
                    break;
                case 21:
                    str3 = cVar.l();
                    break;
                case 22:
                    z4 = cVar.g();
                    break;
                default:
                    cVar.s();
                    cVar.t();
                    break;
            }
        }
        cVar.e();
        ArrayList arrayList6 = new ArrayList();
        if (f6 > 0.0f) {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            arrayList2.add(new com.airbnb.lottie.value.a(kVar, valueOf2, valueOf2, null, 0.0f, Float.valueOf(f6)));
            f4 = 0.0f;
        } else {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            f4 = 0.0f;
        }
        if (f10 <= f4) {
            f10 = kVar.f();
        }
        arrayList2.add(new com.airbnb.lottie.value.a(kVar, valueOf, valueOf, null, f6, Float.valueOf(f10)));
        arrayList2.add(new com.airbnb.lottie.value.a(kVar, valueOf2, valueOf2, null, f10, Float.valueOf(Float.MAX_VALUE)));
        if (str2.endsWith(ProtectedSandApp.s("ˉ")) || ProtectedSandApp.s("ˊ").equals(str3)) {
            kVar.a(ProtectedSandApp.s("ˋ"));
        }
        return new com.airbnb.lottie.model.layer.e(arrayList4, kVar, str2, j4, aVar, j5, str, arrayList, lVar, i4, i5, i6, f5, f7, i7, i10, jVar, kVar2, arrayList2, bVar2, bVar3, z4, aVar2, jVar2);
    }
}
