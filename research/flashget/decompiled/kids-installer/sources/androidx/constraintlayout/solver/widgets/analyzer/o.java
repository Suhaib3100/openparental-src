package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.analyzer.g;
import androidx.constraintlayout.solver.widgets.analyzer.q;
import androidx.constraintlayout.solver.widgets.d;
import androidx.constraintlayout.solver.widgets.e;

/* compiled from: VerticalWidgetRun.java */
/* loaded from: classes3.dex */
public class o extends q {

    /* renamed from: k, reason: collision with root package name */
    public g f2430k;

    /* renamed from: l, reason: collision with root package name */
    h f2431l;

    /* compiled from: VerticalWidgetRun.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2432a;

        static {
            int[] iArr = new int[q.b.values().length];
            f2432a = iArr;
            try {
                iArr[q.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2432a[q.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2432a[q.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public o(androidx.constraintlayout.solver.widgets.e eVar) {
        super(eVar);
        g gVar = new g(this);
        this.f2430k = gVar;
        this.f2431l = null;
        this.f2456h.f2403e = g.a.TOP;
        this.f2457i.f2403e = g.a.BOTTOM;
        gVar.f2403e = g.a.BASELINE;
        this.f2454f = 1;
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.q, androidx.constraintlayout.solver.widgets.analyzer.d
    public void a(d dVar) {
        float f6;
        float A;
        int i5;
        int i6 = a.f2432a[this.f2458j.ordinal()];
        if (i6 == 1) {
            s(dVar);
        } else if (i6 == 2) {
            r(dVar);
        } else if (i6 == 3) {
            androidx.constraintlayout.solver.widgets.e eVar = this.f2450b;
            q(dVar, eVar.K, eVar.M, 1);
            return;
        }
        h hVar = this.f2453e;
        if (hVar.f2401c && !hVar.f2408j && this.f2452d == e.b.MATCH_CONSTRAINT) {
            androidx.constraintlayout.solver.widgets.e eVar2 = this.f2450b;
            int i7 = eVar2.f2542q;
            if (i7 == 2) {
                androidx.constraintlayout.solver.widgets.e U = eVar2.U();
                if (U != null) {
                    if (U.f2520f.f2453e.f2408j) {
                        this.f2453e.e((int) ((r7.f2405g * this.f2450b.f2556x) + 0.5f));
                    }
                }
            } else if (i7 == 3 && eVar2.f2518e.f2453e.f2408j) {
                int B = eVar2.B();
                if (B != -1) {
                    if (B == 0) {
                        i5 = (int) ((this.f2450b.A() * r7.f2518e.f2453e.f2405g) + 0.5f);
                    } else if (B != 1) {
                        i5 = 0;
                    } else {
                        androidx.constraintlayout.solver.widgets.e eVar3 = this.f2450b;
                        f6 = eVar3.f2518e.f2453e.f2405g;
                        A = eVar3.A();
                    }
                    this.f2453e.e(i5);
                } else {
                    androidx.constraintlayout.solver.widgets.e eVar4 = this.f2450b;
                    f6 = eVar4.f2518e.f2453e.f2405g;
                    A = eVar4.A();
                }
                i5 = (int) ((f6 / A) + 0.5f);
                this.f2453e.e(i5);
            }
        }
        g gVar = this.f2456h;
        if (gVar.f2401c) {
            g gVar2 = this.f2457i;
            if (gVar2.f2401c) {
                if (gVar.f2408j && gVar2.f2408j && this.f2453e.f2408j) {
                    return;
                }
                if (!this.f2453e.f2408j && this.f2452d == e.b.MATCH_CONSTRAINT) {
                    androidx.constraintlayout.solver.widgets.e eVar5 = this.f2450b;
                    if (eVar5.f2540p == 0 && !eVar5.u0()) {
                        g gVar3 = this.f2456h.f2410l.get(0);
                        g gVar4 = this.f2457i.f2410l.get(0);
                        int i8 = gVar3.f2405g;
                        g gVar5 = this.f2456h;
                        int i9 = i8 + gVar5.f2404f;
                        int i10 = gVar4.f2405g + this.f2457i.f2404f;
                        gVar5.e(i9);
                        this.f2457i.e(i10);
                        this.f2453e.e(i10 - i9);
                        return;
                    }
                }
                if (!this.f2453e.f2408j && this.f2452d == e.b.MATCH_CONSTRAINT && this.f2449a == 1 && this.f2456h.f2410l.size() > 0 && this.f2457i.f2410l.size() > 0) {
                    g gVar6 = this.f2456h.f2410l.get(0);
                    int i11 = (this.f2457i.f2410l.get(0).f2405g + this.f2457i.f2404f) - (gVar6.f2405g + this.f2456h.f2404f);
                    h hVar2 = this.f2453e;
                    int i12 = hVar2.f2411m;
                    if (i11 < i12) {
                        hVar2.e(i11);
                    } else {
                        hVar2.e(i12);
                    }
                }
                if (this.f2453e.f2408j && this.f2456h.f2410l.size() > 0 && this.f2457i.f2410l.size() > 0) {
                    g gVar7 = this.f2456h.f2410l.get(0);
                    g gVar8 = this.f2457i.f2410l.get(0);
                    int i13 = gVar7.f2405g + this.f2456h.f2404f;
                    int i14 = gVar8.f2405g + this.f2457i.f2404f;
                    float d02 = this.f2450b.d0();
                    if (gVar7 == gVar8) {
                        i13 = gVar7.f2405g;
                        i14 = gVar8.f2405g;
                        d02 = 0.5f;
                    }
                    this.f2456h.e((int) ((((i14 - i13) - this.f2453e.f2405g) * d02) + i13 + 0.5f));
                    this.f2457i.e(this.f2456h.f2405g + this.f2453e.f2405g);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.q
    void d() {
        androidx.constraintlayout.solver.widgets.e U;
        androidx.constraintlayout.solver.widgets.e U2;
        androidx.constraintlayout.solver.widgets.e eVar = this.f2450b;
        if (eVar.f2510a) {
            this.f2453e.e(eVar.D());
        }
        if (!this.f2453e.f2408j) {
            this.f2452d = this.f2450b.g0();
            if (this.f2450b.m0()) {
                this.f2431l = new androidx.constraintlayout.solver.widgets.analyzer.a(this);
            }
            e.b bVar = this.f2452d;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.MATCH_PARENT && (U2 = this.f2450b.U()) != null && U2.g0() == e.b.FIXED) {
                    int D = (U2.D() - this.f2450b.K.g()) - this.f2450b.M.g();
                    b(this.f2456h, U2.f2520f.f2456h, this.f2450b.K.g());
                    b(this.f2457i, U2.f2520f.f2457i, -this.f2450b.M.g());
                    this.f2453e.e(D);
                    return;
                }
                if (this.f2452d == e.b.FIXED) {
                    this.f2453e.e(this.f2450b.D());
                }
            }
        } else if (this.f2452d == e.b.MATCH_PARENT && (U = this.f2450b.U()) != null && U.g0() == e.b.FIXED) {
            b(this.f2456h, U.f2520f.f2456h, this.f2450b.K.g());
            b(this.f2457i, U.f2520f.f2457i, -this.f2450b.M.g());
            return;
        }
        h hVar = this.f2453e;
        boolean z5 = hVar.f2408j;
        if (z5) {
            androidx.constraintlayout.solver.widgets.e eVar2 = this.f2450b;
            if (eVar2.f2510a) {
                androidx.constraintlayout.solver.widgets.d[] dVarArr = eVar2.R;
                androidx.constraintlayout.solver.widgets.d dVar = dVarArr[2];
                androidx.constraintlayout.solver.widgets.d dVar2 = dVar.f2491f;
                if (dVar2 != null && dVarArr[3].f2491f != null) {
                    if (eVar2.u0()) {
                        this.f2456h.f2404f = this.f2450b.R[2].g();
                        this.f2457i.f2404f = -this.f2450b.R[3].g();
                    } else {
                        g h5 = h(this.f2450b.R[2]);
                        if (h5 != null) {
                            b(this.f2456h, h5, this.f2450b.R[2].g());
                        }
                        g h6 = h(this.f2450b.R[3]);
                        if (h6 != null) {
                            b(this.f2457i, h6, -this.f2450b.R[3].g());
                        }
                        this.f2456h.f2400b = true;
                        this.f2457i.f2400b = true;
                    }
                    if (this.f2450b.m0()) {
                        b(this.f2430k, this.f2456h, this.f2450b.t());
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    g h7 = h(dVar);
                    if (h7 != null) {
                        b(this.f2456h, h7, this.f2450b.R[2].g());
                        b(this.f2457i, this.f2456h, this.f2453e.f2405g);
                        if (this.f2450b.m0()) {
                            b(this.f2430k, this.f2456h, this.f2450b.t());
                            return;
                        }
                        return;
                    }
                    return;
                }
                androidx.constraintlayout.solver.widgets.d dVar3 = dVarArr[3];
                if (dVar3.f2491f != null) {
                    g h8 = h(dVar3);
                    if (h8 != null) {
                        b(this.f2457i, h8, -this.f2450b.R[3].g());
                        b(this.f2456h, this.f2457i, -this.f2453e.f2405g);
                    }
                    if (this.f2450b.m0()) {
                        b(this.f2430k, this.f2456h, this.f2450b.t());
                        return;
                    }
                    return;
                }
                androidx.constraintlayout.solver.widgets.d dVar4 = dVarArr[4];
                if (dVar4.f2491f != null) {
                    g h9 = h(dVar4);
                    if (h9 != null) {
                        b(this.f2430k, h9, 0);
                        b(this.f2456h, this.f2430k, -this.f2450b.t());
                        b(this.f2457i, this.f2456h, this.f2453e.f2405g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof androidx.constraintlayout.solver.widgets.i) || eVar2.U() == null || this.f2450b.r(d.b.CENTER).f2491f != null) {
                    return;
                }
                b(this.f2456h, this.f2450b.U().f2520f.f2456h, this.f2450b.l0());
                b(this.f2457i, this.f2456h, this.f2453e.f2405g);
                if (this.f2450b.m0()) {
                    b(this.f2430k, this.f2456h, this.f2450b.t());
                    return;
                }
                return;
            }
        }
        if (z5 || this.f2452d != e.b.MATCH_CONSTRAINT) {
            hVar.b(this);
        } else {
            androidx.constraintlayout.solver.widgets.e eVar3 = this.f2450b;
            int i5 = eVar3.f2542q;
            if (i5 == 2) {
                androidx.constraintlayout.solver.widgets.e U3 = eVar3.U();
                if (U3 != null) {
                    h hVar2 = U3.f2520f.f2453e;
                    this.f2453e.f2410l.add(hVar2);
                    hVar2.f2409k.add(this.f2453e);
                    h hVar3 = this.f2453e;
                    hVar3.f2400b = true;
                    hVar3.f2409k.add(this.f2456h);
                    this.f2453e.f2409k.add(this.f2457i);
                }
            } else if (i5 == 3 && !eVar3.u0()) {
                androidx.constraintlayout.solver.widgets.e eVar4 = this.f2450b;
                if (eVar4.f2540p != 3) {
                    h hVar4 = eVar4.f2518e.f2453e;
                    this.f2453e.f2410l.add(hVar4);
                    hVar4.f2409k.add(this.f2453e);
                    h hVar5 = this.f2453e;
                    hVar5.f2400b = true;
                    hVar5.f2409k.add(this.f2456h);
                    this.f2453e.f2409k.add(this.f2457i);
                }
            }
        }
        androidx.constraintlayout.solver.widgets.e eVar5 = this.f2450b;
        androidx.constraintlayout.solver.widgets.d[] dVarArr2 = eVar5.R;
        androidx.constraintlayout.solver.widgets.d dVar5 = dVarArr2[2];
        androidx.constraintlayout.solver.widgets.d dVar6 = dVar5.f2491f;
        if (dVar6 != null && dVarArr2[3].f2491f != null) {
            if (eVar5.u0()) {
                this.f2456h.f2404f = this.f2450b.R[2].g();
                this.f2457i.f2404f = -this.f2450b.R[3].g();
            } else {
                g h10 = h(this.f2450b.R[2]);
                g h11 = h(this.f2450b.R[3]);
                h10.b(this);
                h11.b(this);
                this.f2458j = q.b.CENTER;
            }
            if (this.f2450b.m0()) {
                c(this.f2430k, this.f2456h, 1, this.f2431l);
            }
        } else if (dVar6 != null) {
            g h12 = h(dVar5);
            if (h12 != null) {
                b(this.f2456h, h12, this.f2450b.R[2].g());
                c(this.f2457i, this.f2456h, 1, this.f2453e);
                if (this.f2450b.m0()) {
                    c(this.f2430k, this.f2456h, 1, this.f2431l);
                }
                e.b bVar2 = this.f2452d;
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f2450b.A() > 0.0f) {
                    m mVar = this.f2450b.f2518e;
                    if (mVar.f2452d == bVar3) {
                        mVar.f2453e.f2409k.add(this.f2453e);
                        this.f2453e.f2410l.add(this.f2450b.f2518e.f2453e);
                        this.f2453e.f2399a = this;
                    }
                }
            }
        } else {
            androidx.constraintlayout.solver.widgets.d dVar7 = dVarArr2[3];
            if (dVar7.f2491f != null) {
                g h13 = h(dVar7);
                if (h13 != null) {
                    b(this.f2457i, h13, -this.f2450b.R[3].g());
                    c(this.f2456h, this.f2457i, -1, this.f2453e);
                    if (this.f2450b.m0()) {
                        c(this.f2430k, this.f2456h, 1, this.f2431l);
                    }
                }
            } else {
                androidx.constraintlayout.solver.widgets.d dVar8 = dVarArr2[4];
                if (dVar8.f2491f != null) {
                    g h14 = h(dVar8);
                    if (h14 != null) {
                        b(this.f2430k, h14, 0);
                        c(this.f2456h, this.f2430k, -1, this.f2431l);
                        c(this.f2457i, this.f2456h, 1, this.f2453e);
                    }
                } else if (!(eVar5 instanceof androidx.constraintlayout.solver.widgets.i) && eVar5.U() != null) {
                    b(this.f2456h, this.f2450b.U().f2520f.f2456h, this.f2450b.l0());
                    c(this.f2457i, this.f2456h, 1, this.f2453e);
                    if (this.f2450b.m0()) {
                        c(this.f2430k, this.f2456h, 1, this.f2431l);
                    }
                    e.b bVar4 = this.f2452d;
                    e.b bVar5 = e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f2450b.A() > 0.0f) {
                        m mVar2 = this.f2450b.f2518e;
                        if (mVar2.f2452d == bVar5) {
                            mVar2.f2453e.f2409k.add(this.f2453e);
                            this.f2453e.f2410l.add(this.f2450b.f2518e.f2453e);
                            this.f2453e.f2399a = this;
                        }
                    }
                }
            }
        }
        if (this.f2453e.f2410l.size() == 0) {
            this.f2453e.f2401c = true;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.q
    public void e() {
        g gVar = this.f2456h;
        if (gVar.f2408j) {
            this.f2450b.K1(gVar.f2405g);
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.q
    void f() {
        this.f2451c = null;
        this.f2456h.c();
        this.f2457i.c();
        this.f2430k.c();
        this.f2453e.c();
        this.f2455g = false;
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.q
    void n() {
        this.f2455g = false;
        this.f2456h.c();
        this.f2456h.f2408j = false;
        this.f2457i.c();
        this.f2457i.f2408j = false;
        this.f2430k.c();
        this.f2430k.f2408j = false;
        this.f2453e.f2408j = false;
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.q
    boolean p() {
        return this.f2452d != e.b.MATCH_CONSTRAINT || this.f2450b.f2542q == 0;
    }

    public String toString() {
        return "VerticalRun " + this.f2450b.y();
    }
}
