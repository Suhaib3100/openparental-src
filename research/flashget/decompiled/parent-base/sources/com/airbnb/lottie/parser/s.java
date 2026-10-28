package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: JsonUtils.java */
/* loaded from: classes3.dex */
class s {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f39316a = c.a.a(ProtectedSandApp.s("ʙ"), ProtectedSandApp.s("ʚ"));

    /* compiled from: JsonUtils.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f39317a;

        static {
            int[] iArr = new int[c.b.values().length];
            f39317a = iArr;
            try {
                iArr[c.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39317a[c.b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39317a[c.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private s() {
    }

    private static PointF a(com.airbnb.lottie.parser.moshi.c cVar, float f4) throws IOException {
        cVar.b();
        float h4 = (float) cVar.h();
        float h5 = (float) cVar.h();
        while (cVar.n() != c.b.END_ARRAY) {
            cVar.t();
        }
        cVar.d();
        return new PointF(h4 * f4, h5 * f4);
    }

    private static PointF b(com.airbnb.lottie.parser.moshi.c cVar, float f4) throws IOException {
        float h4 = (float) cVar.h();
        float h5 = (float) cVar.h();
        while (cVar.f()) {
            cVar.t();
        }
        return new PointF(h4 * f4, h5 * f4);
    }

    private static PointF c(com.airbnb.lottie.parser.moshi.c cVar, float f4) throws IOException {
        cVar.c();
        float f5 = 0.0f;
        float f6 = 0.0f;
        while (cVar.f()) {
            int q4 = cVar.q(f39316a);
            if (q4 == 0) {
                f5 = g(cVar);
            } else if (q4 != 1) {
                cVar.s();
                cVar.t();
            } else {
                f6 = g(cVar);
            }
        }
        cVar.e();
        return new PointF(f5 * f4, f6 * f4);
    }

    @androidx.annotation.l
    static int d(com.airbnb.lottie.parser.moshi.c cVar) throws IOException {
        cVar.b();
        int h4 = (int) (cVar.h() * 255.0d);
        int h5 = (int) (cVar.h() * 255.0d);
        int h6 = (int) (cVar.h() * 255.0d);
        while (cVar.f()) {
            cVar.t();
        }
        cVar.d();
        return Color.argb(255, h4, h5, h6);
    }

    static PointF e(com.airbnb.lottie.parser.moshi.c cVar, float f4) throws IOException {
        int i4 = a.f39317a[cVar.n().ordinal()];
        if (i4 == 1) {
            return b(cVar, f4);
        }
        if (i4 == 2) {
            return a(cVar, f4);
        }
        if (i4 == 3) {
            return c(cVar, f4);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ʛ") + cVar.n());
    }

    static List<PointF> f(com.airbnb.lottie.parser.moshi.c cVar, float f4) throws IOException {
        ArrayList arrayList = new ArrayList();
        cVar.b();
        while (cVar.n() == c.b.BEGIN_ARRAY) {
            cVar.b();
            arrayList.add(e(cVar, f4));
            cVar.d();
        }
        cVar.d();
        return arrayList;
    }

    static float g(com.airbnb.lottie.parser.moshi.c cVar) throws IOException {
        c.b n4 = cVar.n();
        int i4 = a.f39317a[n4.ordinal()];
        if (i4 == 1) {
            return (float) cVar.h();
        }
        if (i4 != 2) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ʜ") + n4);
        }
        cVar.b();
        float h4 = (float) cVar.h();
        while (cVar.f()) {
            cVar.t();
        }
        cVar.d();
        return h4;
    }
}
