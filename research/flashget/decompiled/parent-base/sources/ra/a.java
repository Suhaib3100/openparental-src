package ra;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.b;
import com.google.zxing.common.g;
import com.google.zxing.common.i;
import com.google.zxing.p;
import pa.c;

/* compiled from: Detector.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final b f89789a;

    /* renamed from: b, reason: collision with root package name */
    private final c f89790b;

    public a(b bVar) throws NotFoundException {
        this.f89789a = bVar;
        this.f89790b = new c(bVar);
    }

    private p a(p[] pVarArr) {
        p pVar = pVarArr[0];
        p pVar2 = pVarArr[1];
        p pVar3 = pVarArr[2];
        p pVar4 = pVarArr[3];
        int j4 = j(pVar, pVar4);
        p h4 = h(pVar, pVar2, (j(pVar2, pVar4) + 1) << 2);
        p h5 = h(pVar3, pVar2, (j4 + 1) << 2);
        int j5 = j(h4, pVar4);
        int j6 = j(h5, pVar4);
        float f4 = j5 + 1;
        p pVar5 = new p(((pVar3.c() - pVar2.c()) / f4) + pVar4.c(), ((pVar3.d() - pVar2.d()) / f4) + pVar4.d());
        float f5 = j6 + 1;
        p pVar6 = new p(((pVar.c() - pVar2.c()) / f5) + pVar4.c(), ((pVar.d() - pVar2.d()) / f5) + pVar4.d());
        if (e(pVar5)) {
            return !e(pVar6) ? pVar5 : j(h4, pVar5) + j(h5, pVar5) > j(h4, pVar6) + j(h5, pVar6) ? pVar5 : pVar6;
        }
        if (e(pVar6)) {
            return pVar6;
        }
        return null;
    }

    private p[] c(p[] pVarArr) {
        p pVar = pVarArr[0];
        p pVar2 = pVarArr[1];
        p pVar3 = pVarArr[3];
        p pVar4 = pVarArr[2];
        int j4 = j(pVar, pVar2);
        int j5 = j(pVar2, pVar3);
        int j6 = j(pVar3, pVar4);
        int j7 = j(pVar4, pVar);
        p[] pVarArr2 = {pVar4, pVar, pVar2, pVar3};
        if (j4 > j5) {
            pVarArr2[0] = pVar;
            pVarArr2[1] = pVar2;
            pVarArr2[2] = pVar3;
            pVarArr2[3] = pVar4;
            j4 = j5;
        }
        if (j4 > j6) {
            pVarArr2[0] = pVar2;
            pVarArr2[1] = pVar3;
            pVarArr2[2] = pVar4;
            pVarArr2[3] = pVar;
        } else {
            j6 = j4;
        }
        if (j6 > j7) {
            pVarArr2[0] = pVar3;
            pVarArr2[1] = pVar4;
            pVarArr2[2] = pVar;
            pVarArr2[3] = pVar2;
        }
        return pVarArr2;
    }

    private p[] d(p[] pVarArr) {
        p pVar = pVarArr[0];
        p pVar2 = pVarArr[1];
        p pVar3 = pVarArr[2];
        p pVar4 = pVarArr[3];
        int j4 = (j(pVar, pVar4) + 1) << 2;
        if (j(h(pVar2, pVar3, j4), pVar) < j(h(pVar3, pVar2, j4), pVar4)) {
            pVarArr[0] = pVar;
            pVarArr[1] = pVar2;
            pVarArr[2] = pVar3;
            pVarArr[3] = pVar4;
        } else {
            pVarArr[0] = pVar2;
            pVarArr[1] = pVar3;
            pVarArr[2] = pVar4;
            pVarArr[3] = pVar;
        }
        return pVarArr;
    }

    private boolean e(p pVar) {
        return pVar.c() >= 0.0f && pVar.c() < ((float) this.f89789a.o()) && pVar.d() > 0.0f && pVar.d() < ((float) this.f89789a.k());
    }

    private static p f(p pVar, float f4, float f5) {
        float c5 = pVar.c();
        float d5 = pVar.d();
        return new p(c5 < f4 ? c5 - 1.0f : c5 + 1.0f, d5 < f5 ? d5 - 1.0f : d5 + 1.0f);
    }

    private static b g(b bVar, p pVar, p pVar2, p pVar3, p pVar4, int i4, int i5) throws NotFoundException {
        float f4 = i4 - 0.5f;
        float f5 = i5 - 0.5f;
        return i.b().c(bVar, i4, i5, 0.5f, 0.5f, f4, 0.5f, f4, f5, 0.5f, f5, pVar.c(), pVar.d(), pVar4.c(), pVar4.d(), pVar3.c(), pVar3.d(), pVar2.c(), pVar2.d());
    }

    private static p h(p pVar, p pVar2, int i4) {
        float f4 = i4 + 1;
        return new p(pVar.c() + ((pVar2.c() - pVar.c()) / f4), pVar.d() + ((pVar2.d() - pVar.d()) / f4));
    }

    private p[] i(p[] pVarArr) {
        p pVar = pVarArr[0];
        p pVar2 = pVarArr[1];
        p pVar3 = pVarArr[2];
        p pVar4 = pVarArr[3];
        int j4 = j(pVar, pVar4) + 1;
        p h4 = h(pVar, pVar2, (j(pVar3, pVar4) + 1) << 2);
        p h5 = h(pVar3, pVar2, j4 << 2);
        int j5 = j(h4, pVar4);
        int i4 = j5 + 1;
        int j6 = j(h5, pVar4);
        int i5 = j6 + 1;
        if ((i4 & 1) == 1) {
            i4 = j5 + 2;
        }
        if ((i5 & 1) == 1) {
            i5 = j6 + 2;
        }
        float c5 = (pVar4.c() + (pVar3.c() + (pVar2.c() + pVar.c()))) / 4.0f;
        float d5 = (pVar4.d() + (pVar3.d() + (pVar2.d() + pVar.d()))) / 4.0f;
        p f4 = f(pVar, c5, d5);
        p f5 = f(pVar2, c5, d5);
        p f6 = f(pVar3, c5, d5);
        p f7 = f(pVar4, c5, d5);
        int i6 = i5 << 2;
        int i7 = i4 << 2;
        return new p[]{h(h(f4, f5, i6), f7, i7), h(h(f5, f4, i6), f6, i7), h(h(f6, f7, i6), f5, i7), h(h(f7, f6, i6), f4, i7)};
    }

    private int j(p pVar, p pVar2) {
        int c5 = (int) pVar.c();
        int d5 = (int) pVar.d();
        int c6 = (int) pVar2.c();
        int d6 = (int) pVar2.d();
        int i4 = 0;
        boolean z4 = Math.abs(d6 - d5) > Math.abs(c6 - c5);
        if (z4) {
            d5 = c5;
            c5 = d5;
            d6 = c6;
            c6 = d6;
        }
        int abs = Math.abs(c6 - c5);
        int abs2 = Math.abs(d6 - d5);
        int i5 = (-abs) / 2;
        int i6 = d5 < d6 ? 1 : -1;
        int i7 = c5 >= c6 ? -1 : 1;
        boolean f4 = this.f89789a.f(z4 ? d5 : c5, z4 ? c5 : d5);
        while (c5 != c6) {
            boolean f5 = this.f89789a.f(z4 ? d5 : c5, z4 ? c5 : d5);
            if (f5 != f4) {
                i4++;
                f4 = f5;
            }
            i5 += abs2;
            if (i5 > 0) {
                if (d5 == d6) {
                    break;
                }
                d5 += i6;
                i5 -= abs;
            }
            c5 += i7;
        }
        return i4;
    }

    public g b() throws NotFoundException {
        int i4;
        int i5;
        p[] d5 = d(c(this.f89790b.c()));
        p a5 = a(d5);
        d5[3] = a5;
        if (a5 == null) {
            throw NotFoundException.a();
        }
        p[] i6 = i(d5);
        p pVar = i6[0];
        p pVar2 = i6[1];
        p pVar3 = i6[2];
        p pVar4 = i6[3];
        int j4 = j(pVar, pVar4);
        int i7 = j4 + 1;
        int j5 = j(pVar3, pVar4);
        int i10 = j5 + 1;
        if ((i7 & 1) == 1) {
            i7 = j4 + 2;
        }
        if ((i10 & 1) == 1) {
            i10 = j5 + 2;
        }
        if (i7 * 4 >= i10 * 7 || i10 * 4 >= i7 * 7) {
            i4 = i7;
            i5 = i10;
        } else {
            i4 = Math.max(i7, i10);
            i5 = i4;
        }
        return new g(g(this.f89789a, pVar, pVar2, pVar3, pVar4, i4, i5), new p[]{pVar, pVar2, pVar3, pVar4});
    }
}
