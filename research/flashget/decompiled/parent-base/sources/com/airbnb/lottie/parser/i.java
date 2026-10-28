package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.b;
import com.airbnb.lottie.parser.moshi.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: DocumentDataParser.java */
/* loaded from: classes3.dex */
public class i implements n0<com.airbnb.lottie.model.b> {

    /* renamed from: a, reason: collision with root package name */
    public static final i f39218a = new i();

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f39219b = c.a.a(ProtectedSandApp.s("ȅ"), ProtectedSandApp.s("Ȇ"), ProtectedSandApp.s("ȇ"), ProtectedSandApp.s("Ȉ"), ProtectedSandApp.s("ȉ"), ProtectedSandApp.s("Ȋ"), ProtectedSandApp.s("ȋ"), ProtectedSandApp.s("Ȍ"), ProtectedSandApp.s("ȍ"), ProtectedSandApp.s("ȃ"), ProtectedSandApp.s("Ȅ"));

    private i() {
    }

    @Override // com.airbnb.lottie.parser.n0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.model.b a(com.airbnb.lottie.parser.moshi.c cVar, float f4) throws IOException {
        b.a aVar = b.a.CENTER;
        cVar.c();
        b.a aVar2 = aVar;
        String str = null;
        String str2 = null;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f10 = 0.0f;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z4 = true;
        while (cVar.f()) {
            switch (cVar.q(f39219b)) {
                case 0:
                    str = cVar.l();
                    break;
                case 1:
                    str2 = cVar.l();
                    break;
                case 2:
                    f5 = (float) cVar.h();
                    break;
                case 3:
                    int i7 = cVar.i();
                    aVar2 = b.a.CENTER;
                    if (i7 <= aVar2.ordinal() && i7 >= 0) {
                        aVar2 = b.a.values()[i7];
                        break;
                    }
                    break;
                case 4:
                    i4 = cVar.i();
                    break;
                case 5:
                    f6 = (float) cVar.h();
                    break;
                case 6:
                    f7 = (float) cVar.h();
                    break;
                case 7:
                    i5 = s.d(cVar);
                    break;
                case 8:
                    i6 = s.d(cVar);
                    break;
                case 9:
                    f10 = (float) cVar.h();
                    break;
                case 10:
                    z4 = cVar.g();
                    break;
                default:
                    cVar.s();
                    cVar.t();
                    break;
            }
        }
        cVar.e();
        return new com.airbnb.lottie.model.b(str, str2, f5, aVar2, i4, f6, f7, i5, i6, f10, z4);
    }
}
