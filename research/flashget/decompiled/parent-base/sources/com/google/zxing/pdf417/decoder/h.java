package com.google.zxing.pdf417.decoder;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.zxing.p;

/* compiled from: DetectionResultRowIndicatorColumn.java */
/* loaded from: classes6.dex */
final class h extends g {

    /* renamed from: d, reason: collision with root package name */
    private final boolean f63231d;

    h(c cVar, boolean z4) {
        super(cVar);
        this.f63231d = z4;
    }

    private void h(a aVar) {
        c a5 = a();
        p h4 = this.f63231d ? a5.h() : a5.i();
        p b5 = this.f63231d ? a5.b() : a5.c();
        int e4 = e((int) b5.d());
        d[] d5 = d();
        int i4 = -1;
        int i5 = 0;
        int i6 = 1;
        for (int e5 = e((int) h4.d()); e5 < e4; e5++) {
            d dVar = d5[e5];
            if (dVar != null) {
                dVar.j();
                int c5 = dVar.c() - i4;
                if (c5 == 0) {
                    i5++;
                } else {
                    if (c5 == 1) {
                        i6 = Math.max(i6, i5);
                        i4 = dVar.c();
                    } else if (dVar.c() >= aVar.c()) {
                        d5[e5] = null;
                    } else {
                        i4 = dVar.c();
                    }
                    i5 = 1;
                }
            }
        }
    }

    private void l(d[] dVarArr, a aVar) {
        for (int i4 = 0; i4 < dVarArr.length; i4++) {
            d dVar = dVarArr[i4];
            if (dVar != null) {
                int e4 = dVar.e() % 30;
                int c5 = dVar.c();
                if (c5 > aVar.c()) {
                    dVarArr[i4] = null;
                } else {
                    if (!this.f63231d) {
                        c5 += 2;
                    }
                    int i5 = c5 % 3;
                    if (i5 != 0) {
                        if (i5 != 1) {
                            if (i5 == 2 && e4 + 1 != aVar.a()) {
                                dVarArr[i4] = null;
                            }
                        } else if (e4 / 3 != aVar.b() || e4 % 3 != aVar.d()) {
                            dVarArr[i4] = null;
                        }
                    } else if ((e4 * 3) + 1 != aVar.e()) {
                        dVarArr[i4] = null;
                    }
                }
            }
        }
    }

    private void m() {
        for (d dVar : d()) {
            if (dVar != null) {
                dVar.j();
            }
        }
    }

    void g(a aVar) {
        d[] d5 = d();
        m();
        l(d5, aVar);
        c a5 = a();
        p h4 = this.f63231d ? a5.h() : a5.i();
        p b5 = this.f63231d ? a5.b() : a5.c();
        int e4 = e((int) h4.d());
        int e5 = e((int) b5.d());
        int i4 = -1;
        int i5 = 0;
        int i6 = 1;
        while (e4 < e5) {
            d dVar = d5[e4];
            if (dVar != null) {
                int c5 = dVar.c() - i4;
                if (c5 == 0) {
                    i5++;
                } else {
                    if (c5 == 1) {
                        i6 = Math.max(i6, i5);
                        i4 = dVar.c();
                    } else if (c5 < 0 || dVar.c() >= aVar.c() || c5 > e4) {
                        d5[e4] = null;
                    } else {
                        if (i6 > 2) {
                            c5 *= i6 - 2;
                        }
                        boolean z4 = c5 >= e4;
                        for (int i7 = 1; i7 <= c5 && !z4; i7++) {
                            z4 = d5[e4 - i7] != null;
                        }
                        if (z4) {
                            d5[e4] = null;
                        } else {
                            i4 = dVar.c();
                        }
                    }
                    i5 = 1;
                }
            }
            e4++;
        }
    }

    a i() {
        d[] d5 = d();
        b bVar = new b();
        b bVar2 = new b();
        b bVar3 = new b();
        b bVar4 = new b();
        for (d dVar : d5) {
            if (dVar != null) {
                dVar.j();
                int e4 = dVar.e() % 30;
                int c5 = dVar.c();
                if (!this.f63231d) {
                    c5 += 2;
                }
                int i4 = c5 % 3;
                if (i4 == 0) {
                    bVar2.c((e4 * 3) + 1);
                } else if (i4 == 1) {
                    bVar4.c(e4 / 3);
                    bVar3.c(e4 % 3);
                } else if (i4 == 2) {
                    bVar.c(e4 + 1);
                }
            }
        }
        if (bVar.b().length == 0 || bVar2.b().length == 0 || bVar3.b().length == 0 || bVar4.b().length == 0 || bVar.b()[0] <= 0 || bVar2.b()[0] + bVar3.b()[0] < 3 || bVar2.b()[0] + bVar3.b()[0] > 90) {
            return null;
        }
        a aVar = new a(bVar.b()[0], bVar2.b()[0], bVar3.b()[0], bVar4.b()[0]);
        l(d5, aVar);
        return aVar;
    }

    int[] j() {
        int c5;
        a i4 = i();
        if (i4 == null) {
            return null;
        }
        h(i4);
        int c6 = i4.c();
        int[] iArr = new int[c6];
        for (d dVar : d()) {
            if (dVar != null && (c5 = dVar.c()) < c6) {
                iArr[c5] = iArr[c5] + 1;
            }
        }
        return iArr;
    }

    boolean k() {
        return this.f63231d;
    }

    @Override // com.google.zxing.pdf417.decoder.g
    public String toString() {
        return ProtectedSandApp.s("జ\u0001") + this.f63231d + '\n' + super.toString();
    }
}
