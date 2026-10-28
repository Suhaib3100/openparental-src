package com.airbnb.lottie.parser;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.c;
import java.io.IOException;

/* compiled from: ColorParser.java */
/* loaded from: classes3.dex */
public class g implements n0<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public static final g f39213a = new g();

    private g() {
    }

    @Override // com.airbnb.lottie.parser.n0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer a(com.airbnb.lottie.parser.moshi.c cVar, float f4) throws IOException {
        boolean z4 = cVar.n() == c.b.BEGIN_ARRAY;
        if (z4) {
            cVar.b();
        }
        double h4 = cVar.h();
        double h5 = cVar.h();
        double h6 = cVar.h();
        double h7 = cVar.n() == c.b.NUMBER ? cVar.h() : 1.0d;
        if (z4) {
            cVar.d();
        }
        if (h4 <= 1.0d && h5 <= 1.0d && h6 <= 1.0d) {
            h4 *= 255.0d;
            h5 *= 255.0d;
            h6 *= 255.0d;
            if (h7 <= 1.0d) {
                h7 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) h7, (int) h4, (int) h5, (int) h6));
    }
}
