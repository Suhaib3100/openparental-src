package com.google.zxing.oned.rss.expanded.decoders;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* compiled from: AbstractExpandedDecoder.java */
/* loaded from: classes6.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.zxing.common.a f63119a;

    /* renamed from: b, reason: collision with root package name */
    private final s f63120b;

    j(com.google.zxing.common.a aVar) {
        this.f63119a = aVar;
        this.f63120b = new s(aVar);
    }

    public static j a(com.google.zxing.common.a aVar) {
        if (aVar.k(1)) {
            return new g(aVar);
        }
        if (!aVar.k(2)) {
            return new k(aVar);
        }
        int g4 = s.g(aVar, 1, 4);
        if (g4 == 4) {
            return new a(aVar);
        }
        if (g4 == 5) {
            return new b(aVar);
        }
        int g5 = s.g(aVar, 1, 5);
        if (g5 == 12) {
            return new c(aVar);
        }
        if (g5 == 13) {
            return new d(aVar);
        }
        int g6 = s.g(aVar, 1, 7);
        String s4 = ProtectedSandApp.s("ୱ\u0001");
        String s5 = ProtectedSandApp.s("୲\u0001");
        String s6 = ProtectedSandApp.s("୳\u0001");
        String s7 = ProtectedSandApp.s("୴\u0001");
        String s10 = ProtectedSandApp.s("୵\u0001");
        String s11 = ProtectedSandApp.s("୶\u0001");
        switch (g6) {
            case 56:
                return new e(aVar, s10, s4);
            case 57:
                return new e(aVar, s11, s4);
            case 58:
                return new e(aVar, s10, s5);
            case 59:
                return new e(aVar, s11, s5);
            case 60:
                return new e(aVar, s10, s6);
            case 61:
                return new e(aVar, s11, s6);
            case 62:
                return new e(aVar, s10, s7);
            case 63:
                return new e(aVar, s11, s7);
            default:
                throw new IllegalStateException(ProtectedSandApp.s("୷\u0001").concat(String.valueOf(aVar)));
        }
    }

    protected final s b() {
        return this.f63120b;
    }

    protected final com.google.zxing.common.a c() {
        return this.f63119a;
    }

    public abstract String d() throws NotFoundException, FormatException;
}
