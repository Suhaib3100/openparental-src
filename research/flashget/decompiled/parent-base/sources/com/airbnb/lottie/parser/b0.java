package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: PointFParser.java */
/* loaded from: classes3.dex */
public class b0 implements n0<PointF> {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f39203a = new b0();

    private b0() {
    }

    @Override // com.airbnb.lottie.parser.n0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public PointF a(com.airbnb.lottie.parser.moshi.c cVar, float f4) throws IOException {
        c.b n4 = cVar.n();
        if (n4 == c.b.BEGIN_ARRAY) {
            return s.e(cVar, f4);
        }
        if (n4 == c.b.BEGIN_OBJECT) {
            return s.e(cVar, f4);
        }
        if (n4 != c.b.NUMBER) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ƴ") + n4);
        }
        PointF pointF = new PointF(((float) cVar.h()) * f4, ((float) cVar.h()) * f4);
        while (cVar.f()) {
            cVar.t();
        }
        return pointF;
    }
}
