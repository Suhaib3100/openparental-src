package com.google.zxing.pdf417.decoder;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Formatter;

/* compiled from: DetectionResult.java */
/* loaded from: classes6.dex */
final class f {

    /* renamed from: e, reason: collision with root package name */
    private static final int f63223e = 2;

    /* renamed from: a, reason: collision with root package name */
    private final a f63224a;

    /* renamed from: b, reason: collision with root package name */
    private final g[] f63225b;

    /* renamed from: c, reason: collision with root package name */
    private c f63226c;

    /* renamed from: d, reason: collision with root package name */
    private final int f63227d;

    f(a aVar, c cVar) {
        this.f63224a = aVar;
        int a5 = aVar.a();
        this.f63227d = a5;
        this.f63226c = cVar;
        this.f63225b = new g[a5 + 2];
    }

    private void a(g gVar) {
        if (gVar != null) {
            ((h) gVar).g(this.f63224a);
        }
    }

    private static boolean b(d dVar, d dVar2) {
        if (dVar2 == null || !dVar2.g() || dVar2.a() != dVar.a()) {
            return false;
        }
        dVar.i(dVar2.c());
        return true;
    }

    private static int c(int i4, int i5, d dVar) {
        if (dVar == null) {
            return i5;
        }
        if (dVar.g()) {
            return i5;
        }
        if (!dVar.h(i4)) {
            return i5 + 1;
        }
        dVar.i(i4);
        return 0;
    }

    private int d() {
        int f4 = f();
        if (f4 == 0) {
            return 0;
        }
        for (int i4 = 1; i4 < this.f63227d + 1; i4++) {
            d[] d5 = this.f63225b[i4].d();
            for (int i5 = 0; i5 < d5.length; i5++) {
                d dVar = d5[i5];
                if (dVar != null && !dVar.g()) {
                    e(i4, i5, d5);
                }
            }
        }
        return f4;
    }

    private void e(int i4, int i5, d[] dVarArr) {
        d dVar = dVarArr[i5];
        d[] d5 = this.f63225b[i4 - 1].d();
        g gVar = this.f63225b[i4 + 1];
        d[] d6 = gVar != null ? gVar.d() : d5;
        d[] dVarArr2 = new d[14];
        dVarArr2[2] = d5[i5];
        dVarArr2[3] = d6[i5];
        if (i5 > 0) {
            int i6 = i5 - 1;
            dVarArr2[0] = dVarArr[i6];
            dVarArr2[4] = d5[i6];
            dVarArr2[5] = d6[i6];
        }
        if (i5 > 1) {
            int i7 = i5 - 2;
            dVarArr2[8] = dVarArr[i7];
            dVarArr2[10] = d5[i7];
            dVarArr2[11] = d6[i7];
        }
        if (i5 < dVarArr.length - 1) {
            int i10 = i5 + 1;
            dVarArr2[1] = dVarArr[i10];
            dVarArr2[6] = d5[i10];
            dVarArr2[7] = d6[i10];
        }
        if (i5 < dVarArr.length - 2) {
            int i11 = i5 + 2;
            dVarArr2[9] = dVarArr[i11];
            dVarArr2[12] = d5[i11];
            dVarArr2[13] = d6[i11];
        }
        for (int i12 = 0; i12 < 14 && !b(dVar, dVarArr2[i12]); i12++) {
        }
    }

    private int f() {
        g();
        return h() + i();
    }

    private void g() {
        g[] gVarArr = this.f63225b;
        g gVar = gVarArr[0];
        if (gVar == null || gVarArr[this.f63227d + 1] == null) {
            return;
        }
        d[] d5 = gVar.d();
        d[] d6 = this.f63225b[this.f63227d + 1].d();
        for (int i4 = 0; i4 < d5.length; i4++) {
            d dVar = d5[i4];
            if (dVar != null && d6[i4] != null && dVar.c() == d6[i4].c()) {
                for (int i5 = 1; i5 <= this.f63227d; i5++) {
                    d dVar2 = this.f63225b[i5].d()[i4];
                    if (dVar2 != null) {
                        dVar2.i(d5[i4].c());
                        if (!dVar2.g()) {
                            this.f63225b[i5].d()[i4] = null;
                        }
                    }
                }
            }
        }
    }

    private int h() {
        g gVar = this.f63225b[0];
        if (gVar == null) {
            return 0;
        }
        d[] d5 = gVar.d();
        int i4 = 0;
        for (int i5 = 0; i5 < d5.length; i5++) {
            d dVar = d5[i5];
            if (dVar != null) {
                int c5 = dVar.c();
                int i6 = 0;
                for (int i7 = 1; i7 < this.f63227d + 1 && i6 < 2; i7++) {
                    d dVar2 = this.f63225b[i7].d()[i5];
                    if (dVar2 != null) {
                        i6 = c(c5, i6, dVar2);
                        if (!dVar2.g()) {
                            i4++;
                        }
                    }
                }
            }
        }
        return i4;
    }

    private int i() {
        g[] gVarArr = this.f63225b;
        int i4 = this.f63227d;
        if (gVarArr[i4 + 1] == null) {
            return 0;
        }
        d[] d5 = gVarArr[i4 + 1].d();
        int i5 = 0;
        for (int i6 = 0; i6 < d5.length; i6++) {
            d dVar = d5[i6];
            if (dVar != null) {
                int c5 = dVar.c();
                int i7 = 0;
                for (int i10 = this.f63227d + 1; i10 > 0 && i7 < 2; i10--) {
                    d dVar2 = this.f63225b[i10].d()[i6];
                    if (dVar2 != null) {
                        i7 = c(c5, i7, dVar2);
                        if (!dVar2.g()) {
                            i5++;
                        }
                    }
                }
            }
        }
        return i5;
    }

    int j() {
        return this.f63227d;
    }

    int k() {
        return this.f63224a.b();
    }

    int l() {
        return this.f63224a.c();
    }

    c m() {
        return this.f63226c;
    }

    g n(int i4) {
        return this.f63225b[i4];
    }

    g[] o() {
        a(this.f63225b[0]);
        a(this.f63225b[this.f63227d + 1]);
        int i4 = ta.a.f91897b;
        while (true) {
            int d5 = d();
            if (d5 <= 0 || d5 >= i4) {
                break;
            }
            i4 = d5;
        }
        return this.f63225b;
    }

    void p(c cVar) {
        this.f63226c = cVar;
    }

    void q(int i4, g gVar) {
        this.f63225b[i4] = gVar;
    }

    public String toString() {
        g[] gVarArr = this.f63225b;
        g gVar = gVarArr[0];
        if (gVar == null) {
            gVar = gVarArr[this.f63227d + 1];
        }
        Formatter formatter = new Formatter();
        for (int i4 = 0; i4 < gVar.d().length; i4++) {
            try {
                formatter.format(ProtectedSandApp.s("ఖ\u0001"), Integer.valueOf(i4));
                for (int i5 = 0; i5 < this.f63227d + 2; i5++) {
                    g gVar2 = this.f63225b[i5];
                    String s4 = ProtectedSandApp.s("గ\u0001");
                    if (gVar2 == null) {
                        formatter.format(s4, new Object[0]);
                    } else {
                        d dVar = gVar2.d()[i4];
                        if (dVar == null) {
                            formatter.format(s4, new Object[0]);
                        } else {
                            formatter.format(ProtectedSandApp.s("ఘ\u0001"), Integer.valueOf(dVar.c()), Integer.valueOf(dVar.e()));
                        }
                    }
                }
                formatter.format(ProtectedSandApp.s("ఙ\u0001"), new Object[0]);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        formatter.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
