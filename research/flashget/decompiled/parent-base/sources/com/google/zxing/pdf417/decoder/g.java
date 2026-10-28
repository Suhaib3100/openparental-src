package com.google.zxing.pdf417.decoder;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Formatter;

/* compiled from: DetectionResultColumn.java */
/* loaded from: classes6.dex */
class g {

    /* renamed from: c, reason: collision with root package name */
    private static final int f63228c = 5;

    /* renamed from: a, reason: collision with root package name */
    private final c f63229a;

    /* renamed from: b, reason: collision with root package name */
    private final d[] f63230b;

    g(c cVar) {
        this.f63229a = new c(cVar);
        this.f63230b = new d[(cVar.e() - cVar.g()) + 1];
    }

    final c a() {
        return this.f63229a;
    }

    final d b(int i4) {
        return this.f63230b[e(i4)];
    }

    final d c(int i4) {
        d dVar;
        d dVar2;
        d b5 = b(i4);
        if (b5 != null) {
            return b5;
        }
        for (int i5 = 1; i5 < 5; i5++) {
            int e4 = e(i4) - i5;
            if (e4 >= 0 && (dVar2 = this.f63230b[e4]) != null) {
                return dVar2;
            }
            int e5 = e(i4) + i5;
            d[] dVarArr = this.f63230b;
            if (e5 < dVarArr.length && (dVar = dVarArr[e5]) != null) {
                return dVar;
            }
        }
        return null;
    }

    final d[] d() {
        return this.f63230b;
    }

    final int e(int i4) {
        return i4 - this.f63229a.g();
    }

    final void f(int i4, d dVar) {
        this.f63230b[e(i4)] = dVar;
    }

    public String toString() {
        Formatter formatter = new Formatter();
        try {
            int i4 = 0;
            for (d dVar : this.f63230b) {
                if (dVar == null) {
                    formatter.format(ProtectedSandApp.s("చ\u0001"), Integer.valueOf(i4));
                    i4++;
                } else {
                    formatter.format(ProtectedSandApp.s("ఛ\u0001"), Integer.valueOf(i4), Integer.valueOf(dVar.c()), Integer.valueOf(dVar.e()));
                    i4++;
                }
            }
            String formatter2 = formatter.toString();
            formatter.close();
            return formatter2;
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
}
