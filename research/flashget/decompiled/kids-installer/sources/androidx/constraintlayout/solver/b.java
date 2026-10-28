package androidx.constraintlayout.solver;

import androidx.constraintlayout.solver.g;
import androidx.constraintlayout.solver.k;
import java.util.ArrayList;

/* compiled from: ArrayRow.java */
/* loaded from: classes2.dex */
public class b implements g.a {

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f2140g = false;

    /* renamed from: h, reason: collision with root package name */
    private static final boolean f2141h = false;

    /* renamed from: e, reason: collision with root package name */
    public a f2146e;

    /* renamed from: a, reason: collision with root package name */
    k f2142a = null;

    /* renamed from: b, reason: collision with root package name */
    float f2143b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    boolean f2144c = false;

    /* renamed from: d, reason: collision with root package name */
    ArrayList<k> f2145d = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    boolean f2147f = false;

    /* compiled from: ArrayRow.java */
    /* loaded from: classes.dex */
    public interface a {
        void clear();

        int d();

        void e();

        k f(int i5);

        void g();

        float h(int i5);

        void i(k kVar, float f6, boolean z5);

        float j(k kVar);

        boolean k(k kVar);

        int l(k kVar);

        float m(b bVar, boolean z5);

        int n();

        void o(k kVar, float f6);

        float p(k kVar, boolean z5);

        void q(float f6);
    }

    public b() {
    }

    private k B(boolean[] zArr, k kVar) {
        k.b bVar;
        int d6 = this.f2146e.d();
        k kVar2 = null;
        float f6 = 0.0f;
        for (int i5 = 0; i5 < d6; i5++) {
            float h5 = this.f2146e.h(i5);
            if (h5 < 0.0f) {
                k f7 = this.f2146e.f(i5);
                if ((zArr == null || !zArr[f7.f2232c]) && f7 != kVar && (((bVar = f7.f2239j) == k.b.SLACK || bVar == k.b.ERROR) && h5 < f6)) {
                    f6 = h5;
                    kVar2 = f7;
                }
            }
        }
        return kVar2;
    }

    private boolean z(k kVar, g gVar) {
        return kVar.f2242m <= 1;
    }

    public k A(k kVar) {
        return B(null, kVar);
    }

    void C(k kVar) {
        k kVar2 = this.f2142a;
        if (kVar2 != null) {
            this.f2146e.o(kVar2, -1.0f);
            this.f2142a.f2233d = -1;
            this.f2142a = null;
        }
        float p5 = this.f2146e.p(kVar, true) * (-1.0f);
        this.f2142a = kVar;
        if (p5 == 1.0f) {
            return;
        }
        this.f2143b /= p5;
        this.f2146e.q(p5);
    }

    public void D() {
        this.f2142a = null;
        this.f2146e.clear();
        this.f2143b = 0.0f;
        this.f2147f = false;
    }

    int E() {
        return this.f2146e.n() + (this.f2142a != null ? 4 : 0) + 4 + 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.String F() {
        /*
            r10 = this;
            androidx.constraintlayout.solver.k r0 = r10.f2142a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            androidx.constraintlayout.solver.k r1 = r10.f2142a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = androidx.concurrent.futures.b.a(r0, r1)
            float r1 = r10.f2143b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = androidx.constraintlayout.motion.widget.r.a(r0)
            float r1 = r10.f2143b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L36
        L35:
            r1 = r3
        L36:
            androidx.constraintlayout.solver.b$a r5 = r10.f2146e
            int r5 = r5.d()
        L3c:
            if (r3 >= r5) goto L9b
            androidx.constraintlayout.solver.b$a r6 = r10.f2146e
            androidx.constraintlayout.solver.k r6 = r6.f(r3)
            if (r6 != 0) goto L47
            goto L98
        L47:
            androidx.constraintlayout.solver.b$a r7 = r10.f2146e
            float r7 = r7.h(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L98
        L52:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L65
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L75
            java.lang.String r1 = "- "
            java.lang.String r0 = androidx.concurrent.futures.b.a(r0, r1)
            goto L74
        L65:
            if (r8 <= 0) goto L6e
            java.lang.String r1 = " + "
            java.lang.String r0 = androidx.concurrent.futures.b.a(r0, r1)
            goto L75
        L6e:
            java.lang.String r1 = " - "
            java.lang.String r0 = androidx.concurrent.futures.b.a(r0, r1)
        L74:
            float r7 = r7 * r9
        L75:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L80
            java.lang.String r0 = androidx.concurrent.futures.b.a(r0, r6)
            goto L97
        L80:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L97:
            r1 = r4
        L98:
            int r3 = r3 + 1
            goto L3c
        L9b:
            if (r1 != 0) goto La3
            java.lang.String r1 = "0.0"
            java.lang.String r0 = androidx.concurrent.futures.b.a(r0, r1)
        La3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.b.F():java.lang.String");
    }

    public void G(g gVar, k kVar, boolean z5) {
        if (kVar.f2243n) {
            float j5 = this.f2146e.j(kVar);
            this.f2143b = (kVar.f2245p * j5) + this.f2143b;
            this.f2146e.p(kVar, z5);
            if (z5) {
                kVar.f(this);
            }
            this.f2146e.i(gVar.f2174n.f2151d[kVar.f2244o], j5, z5);
            if (g.f2158x && this.f2146e.d() == 0) {
                this.f2147f = true;
                gVar.f2161a = true;
            }
        }
    }

    @Override // androidx.constraintlayout.solver.g.a
    public void a(g gVar, k kVar, boolean z5) {
        if (kVar.f2236g) {
            float j5 = this.f2146e.j(kVar);
            this.f2143b = (kVar.f2235f * j5) + this.f2143b;
            this.f2146e.p(kVar, z5);
            if (z5) {
                kVar.f(this);
            }
            if (g.f2158x && this.f2146e.d() == 0) {
                this.f2147f = true;
                gVar.f2161a = true;
            }
        }
    }

    @Override // androidx.constraintlayout.solver.g.a
    public void b(k kVar) {
        int i5 = kVar.f2234e;
        float f6 = 1.0f;
        if (i5 != 1) {
            if (i5 == 2) {
                f6 = 1000.0f;
            } else if (i5 == 3) {
                f6 = 1000000.0f;
            } else if (i5 == 4) {
                f6 = 1.0E9f;
            } else if (i5 == 5) {
                f6 = 1.0E12f;
            }
        }
        this.f2146e.o(kVar, f6);
    }

    @Override // androidx.constraintlayout.solver.g.a
    public void c(g gVar, b bVar, boolean z5) {
        float m5 = this.f2146e.m(bVar, z5);
        this.f2143b = (bVar.f2143b * m5) + this.f2143b;
        if (z5) {
            bVar.f2142a.f(this);
        }
        if (g.f2158x && this.f2142a != null && this.f2146e.d() == 0) {
            this.f2147f = true;
            gVar.f2161a = true;
        }
    }

    @Override // androidx.constraintlayout.solver.g.a
    public void clear() {
        this.f2146e.clear();
        this.f2142a = null;
        this.f2143b = 0.0f;
    }

    @Override // androidx.constraintlayout.solver.g.a
    public k d(g gVar, boolean[] zArr) {
        return B(zArr, null);
    }

    @Override // androidx.constraintlayout.solver.g.a
    public void e(g.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f2142a = null;
            this.f2146e.clear();
            for (int i5 = 0; i5 < bVar.f2146e.d(); i5++) {
                this.f2146e.i(bVar.f2146e.f(i5), bVar.f2146e.h(i5), true);
            }
        }
    }

    @Override // androidx.constraintlayout.solver.g.a
    public void f(g gVar) {
        if (gVar.f2167g.length == 0) {
            return;
        }
        boolean z5 = false;
        while (!z5) {
            int d6 = this.f2146e.d();
            for (int i5 = 0; i5 < d6; i5++) {
                k f6 = this.f2146e.f(i5);
                if (f6.f2233d != -1 || f6.f2236g || f6.f2243n) {
                    this.f2145d.add(f6);
                }
            }
            int size = this.f2145d.size();
            if (size > 0) {
                for (int i6 = 0; i6 < size; i6++) {
                    k kVar = this.f2145d.get(i6);
                    if (kVar.f2236g) {
                        a(gVar, kVar, true);
                    } else if (kVar.f2243n) {
                        G(gVar, kVar, true);
                    } else {
                        c(gVar, gVar.f2167g[kVar.f2233d], true);
                    }
                }
                this.f2145d.clear();
            } else {
                z5 = true;
            }
        }
        if (g.f2158x && this.f2142a != null && this.f2146e.d() == 0) {
            this.f2147f = true;
            gVar.f2161a = true;
        }
    }

    public b g(g gVar, int i5) {
        this.f2146e.o(gVar.s(i5, "ep"), 1.0f);
        this.f2146e.o(gVar.s(i5, "em"), -1.0f);
        return this;
    }

    @Override // androidx.constraintlayout.solver.g.a
    public k getKey() {
        return this.f2142a;
    }

    b h(k kVar, int i5) {
        this.f2146e.o(kVar, i5);
        return this;
    }

    boolean i(g gVar) {
        boolean z5;
        k j5 = j(gVar);
        if (j5 == null) {
            z5 = true;
        } else {
            C(j5);
            z5 = false;
        }
        if (this.f2146e.d() == 0) {
            this.f2147f = true;
        }
        return z5;
    }

    @Override // androidx.constraintlayout.solver.g.a
    public boolean isEmpty() {
        return this.f2142a == null && this.f2143b == 0.0f && this.f2146e.d() == 0;
    }

    k j(g gVar) {
        boolean z5;
        boolean z6;
        int d6 = this.f2146e.d();
        k kVar = null;
        float f6 = 0.0f;
        float f7 = 0.0f;
        boolean z7 = false;
        boolean z8 = false;
        k kVar2 = null;
        for (int i5 = 0; i5 < d6; i5++) {
            float h5 = this.f2146e.h(i5);
            k f8 = this.f2146e.f(i5);
            if (f8.f2239j == k.b.UNRESTRICTED) {
                if (kVar == null) {
                    z6 = z(f8, gVar);
                } else if (f6 > h5) {
                    z6 = z(f8, gVar);
                } else if (!z7 && z(f8, gVar)) {
                    f6 = h5;
                    kVar = f8;
                    z7 = true;
                }
                z7 = z6;
                f6 = h5;
                kVar = f8;
            } else if (kVar == null && h5 < 0.0f) {
                if (kVar2 == null) {
                    z5 = z(f8, gVar);
                } else if (f7 > h5) {
                    z5 = z(f8, gVar);
                } else if (!z8 && z(f8, gVar)) {
                    f7 = h5;
                    kVar2 = f8;
                    z8 = true;
                }
                z8 = z5;
                f7 = h5;
                kVar2 = f8;
            }
        }
        return kVar != null ? kVar : kVar2;
    }

    b k(k kVar, k kVar2, int i5, float f6, k kVar3, k kVar4, int i6) {
        if (kVar2 == kVar3) {
            this.f2146e.o(kVar, 1.0f);
            this.f2146e.o(kVar4, 1.0f);
            this.f2146e.o(kVar2, -2.0f);
            return this;
        }
        if (f6 == 0.5f) {
            this.f2146e.o(kVar, 1.0f);
            this.f2146e.o(kVar2, -1.0f);
            this.f2146e.o(kVar3, -1.0f);
            this.f2146e.o(kVar4, 1.0f);
            if (i5 > 0 || i6 > 0) {
                this.f2143b = (-i5) + i6;
            }
        } else if (f6 <= 0.0f) {
            this.f2146e.o(kVar, -1.0f);
            this.f2146e.o(kVar2, 1.0f);
            this.f2143b = i5;
        } else if (f6 >= 1.0f) {
            this.f2146e.o(kVar4, -1.0f);
            this.f2146e.o(kVar3, 1.0f);
            this.f2143b = -i6;
        } else {
            float f7 = 1.0f - f6;
            this.f2146e.o(kVar, f7 * 1.0f);
            this.f2146e.o(kVar2, f7 * (-1.0f));
            this.f2146e.o(kVar3, (-1.0f) * f6);
            this.f2146e.o(kVar4, 1.0f * f6);
            if (i5 > 0 || i6 > 0) {
                this.f2143b = (i6 * f6) + ((-i5) * f7);
            }
        }
        return this;
    }

    b l(k kVar, int i5) {
        this.f2142a = kVar;
        float f6 = i5;
        kVar.f2235f = f6;
        this.f2143b = f6;
        this.f2147f = true;
        return this;
    }

    b m(k kVar, k kVar2, float f6) {
        this.f2146e.o(kVar, -1.0f);
        this.f2146e.o(kVar2, f6);
        return this;
    }

    public b n(k kVar, k kVar2, k kVar3, k kVar4, float f6) {
        this.f2146e.o(kVar, -1.0f);
        this.f2146e.o(kVar2, 1.0f);
        this.f2146e.o(kVar3, f6);
        this.f2146e.o(kVar4, -f6);
        return this;
    }

    public b o(float f6, float f7, float f8, k kVar, int i5, k kVar2, int i6, k kVar3, int i7, k kVar4, int i8) {
        if (f7 == 0.0f || f6 == f8) {
            this.f2143b = ((-i5) - i6) + i7 + i8;
            this.f2146e.o(kVar, 1.0f);
            this.f2146e.o(kVar2, -1.0f);
            this.f2146e.o(kVar4, 1.0f);
            this.f2146e.o(kVar3, -1.0f);
        } else {
            float f9 = (f6 / f7) / (f8 / f7);
            this.f2143b = (i8 * f9) + (i7 * f9) + ((-i5) - i6);
            this.f2146e.o(kVar, 1.0f);
            this.f2146e.o(kVar2, -1.0f);
            this.f2146e.o(kVar4, f9);
            this.f2146e.o(kVar3, -f9);
        }
        return this;
    }

    public b p(float f6, float f7, float f8, k kVar, k kVar2, k kVar3, k kVar4) {
        this.f2143b = 0.0f;
        if (f7 == 0.0f || f6 == f8) {
            this.f2146e.o(kVar, 1.0f);
            this.f2146e.o(kVar2, -1.0f);
            this.f2146e.o(kVar4, 1.0f);
            this.f2146e.o(kVar3, -1.0f);
        } else if (f6 == 0.0f) {
            this.f2146e.o(kVar, 1.0f);
            this.f2146e.o(kVar2, -1.0f);
        } else if (f8 == 0.0f) {
            this.f2146e.o(kVar3, 1.0f);
            this.f2146e.o(kVar4, -1.0f);
        } else {
            float f9 = (f6 / f7) / (f8 / f7);
            this.f2146e.o(kVar, 1.0f);
            this.f2146e.o(kVar2, -1.0f);
            this.f2146e.o(kVar4, f9);
            this.f2146e.o(kVar3, -f9);
        }
        return this;
    }

    public b q(k kVar, int i5) {
        if (i5 < 0) {
            this.f2143b = i5 * (-1);
            this.f2146e.o(kVar, 1.0f);
        } else {
            this.f2143b = i5;
            this.f2146e.o(kVar, -1.0f);
        }
        return this;
    }

    public b r(k kVar, k kVar2, int i5) {
        boolean z5 = false;
        if (i5 != 0) {
            if (i5 < 0) {
                i5 *= -1;
                z5 = true;
            }
            this.f2143b = i5;
        }
        if (z5) {
            this.f2146e.o(kVar, 1.0f);
            this.f2146e.o(kVar2, -1.0f);
        } else {
            this.f2146e.o(kVar, -1.0f);
            this.f2146e.o(kVar2, 1.0f);
        }
        return this;
    }

    public b s(k kVar, int i5, k kVar2) {
        this.f2143b = i5;
        this.f2146e.o(kVar, -1.0f);
        return this;
    }

    public b t(k kVar, k kVar2, k kVar3, int i5) {
        boolean z5 = false;
        if (i5 != 0) {
            if (i5 < 0) {
                i5 *= -1;
                z5 = true;
            }
            this.f2143b = i5;
        }
        if (z5) {
            this.f2146e.o(kVar, 1.0f);
            this.f2146e.o(kVar2, -1.0f);
            this.f2146e.o(kVar3, -1.0f);
        } else {
            this.f2146e.o(kVar, -1.0f);
            this.f2146e.o(kVar2, 1.0f);
            this.f2146e.o(kVar3, 1.0f);
        }
        return this;
    }

    public String toString() {
        return F();
    }

    public b u(k kVar, k kVar2, k kVar3, int i5) {
        boolean z5 = false;
        if (i5 != 0) {
            if (i5 < 0) {
                i5 *= -1;
                z5 = true;
            }
            this.f2143b = i5;
        }
        if (z5) {
            this.f2146e.o(kVar, 1.0f);
            this.f2146e.o(kVar2, -1.0f);
            this.f2146e.o(kVar3, 1.0f);
        } else {
            this.f2146e.o(kVar, -1.0f);
            this.f2146e.o(kVar2, 1.0f);
            this.f2146e.o(kVar3, -1.0f);
        }
        return this;
    }

    public b v(k kVar, k kVar2, k kVar3, k kVar4, float f6) {
        this.f2146e.o(kVar3, 0.5f);
        this.f2146e.o(kVar4, 0.5f);
        this.f2146e.o(kVar, -0.5f);
        this.f2146e.o(kVar2, -0.5f);
        this.f2143b = -f6;
        return this;
    }

    void w() {
        float f6 = this.f2143b;
        if (f6 < 0.0f) {
            this.f2143b = f6 * (-1.0f);
            this.f2146e.g();
        }
    }

    boolean x() {
        k kVar = this.f2142a;
        return kVar != null && (kVar.f2239j == k.b.UNRESTRICTED || this.f2143b >= 0.0f);
    }

    boolean y(k kVar) {
        return this.f2146e.k(kVar);
    }

    public b(c cVar) {
        this.f2146e = new androidx.constraintlayout.solver.a(this, cVar);
    }
}
