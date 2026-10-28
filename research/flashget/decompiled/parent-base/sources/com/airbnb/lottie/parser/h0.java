package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ShapeDataParser.java */
/* loaded from: classes3.dex */
public class h0 implements n0<com.airbnb.lottie.model.content.n> {

    /* renamed from: a, reason: collision with root package name */
    public static final h0 f39216a = new h0();

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f39217b = c.a.a(ProtectedSandApp.s("Ǩ"), ProtectedSandApp.s("ǩ"), ProtectedSandApp.s("Ǧ"), ProtectedSandApp.s("ǧ"));

    private h0() {
    }

    @Override // com.airbnb.lottie.parser.n0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.model.content.n a(com.airbnb.lottie.parser.moshi.c cVar, float f4) throws IOException {
        if (cVar.n() == c.b.BEGIN_ARRAY) {
            cVar.b();
        }
        cVar.c();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z4 = false;
        while (cVar.f()) {
            int q4 = cVar.q(f39217b);
            if (q4 == 0) {
                z4 = cVar.g();
            } else if (q4 == 1) {
                list = s.f(cVar, f4);
            } else if (q4 == 2) {
                list2 = s.f(cVar, f4);
            } else if (q4 != 3) {
                cVar.s();
                cVar.t();
            } else {
                list3 = s.f(cVar, f4);
            }
        }
        cVar.e();
        if (cVar.n() == c.b.END_ARRAY) {
            cVar.d();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("Ǫ"));
        }
        if (list.isEmpty()) {
            return new com.airbnb.lottie.model.content.n(new PointF(), false, Collections.emptyList());
        }
        int size = list.size();
        PointF pointF = list.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i4 = 1; i4 < size; i4++) {
            PointF pointF2 = list.get(i4);
            int i5 = i4 - 1;
            arrayList.add(new com.airbnb.lottie.model.a(com.airbnb.lottie.utils.i.a(list.get(i5), list3.get(i5)), com.airbnb.lottie.utils.i.a(pointF2, list2.get(i4)), pointF2));
        }
        if (z4) {
            PointF pointF3 = list.get(0);
            int i6 = size - 1;
            arrayList.add(new com.airbnb.lottie.model.a(com.airbnb.lottie.utils.i.a(list.get(i6), list3.get(i6)), com.airbnb.lottie.utils.i.a(pointF3, list2.get(0)), pointF3));
        }
        return new com.airbnb.lottie.model.content.n(pointF, z4, arrayList);
    }
}
