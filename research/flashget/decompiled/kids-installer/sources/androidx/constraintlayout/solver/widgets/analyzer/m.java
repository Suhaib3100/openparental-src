package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.analyzer.g;
import androidx.constraintlayout.solver.widgets.analyzer.q;
import androidx.constraintlayout.solver.widgets.d;
import androidx.constraintlayout.solver.widgets.e;

/* compiled from: HorizontalWidgetRun.java */
/* loaded from: classes3.dex */
public class m extends q {

    /* renamed from: k, reason: collision with root package name */
    private static int[] f2417k = new int[2];

    /* compiled from: HorizontalWidgetRun.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2418a;

        static {
            int[] iArr = new int[q.b.values().length];
            f2418a = iArr;
            try {
                iArr[q.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2418a[q.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2418a[q.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public m(androidx.constraintlayout.solver.widgets.e eVar) {
        super(eVar);
        this.f2456h.f2403e = g.a.LEFT;
        this.f2457i.f2403e = g.a.RIGHT;
        this.f2454f = 0;
    }

    private void u(int[] iArr, int i5, int i6, int i7, int i8, float f6, int i9) {
        int i10 = i6 - i5;
        int i11 = i8 - i7;
        if (i9 != -1) {
            if (i9 == 0) {
                iArr[0] = (int) ((i11 * f6) + 0.5f);
                iArr[1] = i11;
                return;
            } else {
                if (i9 != 1) {
                    return;
                }
                iArr[0] = i10;
                iArr[1] = (int) ((i10 * f6) + 0.5f);
                return;
            }
        }
        int i12 = (int) ((i11 * f6) + 0.5f);
        int i13 = (int) ((i10 / f6) + 0.5f);
        if (i12 <= i10) {
            iArr[0] = i12;
            iArr[1] = i11;
        } else if (i13 <= i11) {
            iArr[0] = i10;
            iArr[1] = i13;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x02bb, code lost:
    
        if (r14 != 1) goto L134;
     */
    @Override // androidx.constraintlayout.solver.widgets.analyzer.q, androidx.constraintlayout.solver.widgets.analyzer.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(androidx.constraintlayout.solver.widgets.analyzer.d r17) {
        /*
            Method dump skipped, instructions count: 1089
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.m.a(androidx.constraintlayout.solver.widgets.analyzer.d):void");
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.q
    void d() {
        androidx.constraintlayout.solver.widgets.e U;
        androidx.constraintlayout.solver.widgets.e U2;
        androidx.constraintlayout.solver.widgets.e eVar = this.f2450b;
        if (eVar.f2510a) {
            this.f2453e.e(eVar.j0());
        }
        if (this.f2453e.f2408j) {
            e.b bVar = this.f2452d;
            e.b bVar2 = e.b.MATCH_PARENT;
            if (bVar == bVar2 && (((U = this.f2450b.U()) != null && U.H() == e.b.FIXED) || U.H() == bVar2)) {
                b(this.f2456h, U.f2518e.f2456h, this.f2450b.J.g());
                b(this.f2457i, U.f2518e.f2457i, -this.f2450b.L.g());
                return;
            }
        } else {
            e.b H = this.f2450b.H();
            this.f2452d = H;
            if (H != e.b.MATCH_CONSTRAINT) {
                e.b bVar3 = e.b.MATCH_PARENT;
                if (H == bVar3 && (((U2 = this.f2450b.U()) != null && U2.H() == e.b.FIXED) || U2.H() == bVar3)) {
                    int j02 = (U2.j0() - this.f2450b.J.g()) - this.f2450b.L.g();
                    b(this.f2456h, U2.f2518e.f2456h, this.f2450b.J.g());
                    b(this.f2457i, U2.f2518e.f2457i, -this.f2450b.L.g());
                    this.f2453e.e(j02);
                    return;
                }
                if (this.f2452d == e.b.FIXED) {
                    this.f2453e.e(this.f2450b.j0());
                }
            }
        }
        h hVar = this.f2453e;
        if (hVar.f2408j) {
            androidx.constraintlayout.solver.widgets.e eVar2 = this.f2450b;
            if (eVar2.f2510a) {
                androidx.constraintlayout.solver.widgets.d[] dVarArr = eVar2.R;
                androidx.constraintlayout.solver.widgets.d dVar = dVarArr[0];
                androidx.constraintlayout.solver.widgets.d dVar2 = dVar.f2491f;
                if (dVar2 != null && dVarArr[1].f2491f != null) {
                    if (eVar2.s0()) {
                        this.f2456h.f2404f = this.f2450b.R[0].g();
                        this.f2457i.f2404f = -this.f2450b.R[1].g();
                        return;
                    }
                    g h5 = h(this.f2450b.R[0]);
                    if (h5 != null) {
                        b(this.f2456h, h5, this.f2450b.R[0].g());
                    }
                    g h6 = h(this.f2450b.R[1]);
                    if (h6 != null) {
                        b(this.f2457i, h6, -this.f2450b.R[1].g());
                    }
                    this.f2456h.f2400b = true;
                    this.f2457i.f2400b = true;
                    return;
                }
                if (dVar2 != null) {
                    g h7 = h(dVar);
                    if (h7 != null) {
                        b(this.f2456h, h7, this.f2450b.R[0].g());
                        b(this.f2457i, this.f2456h, this.f2453e.f2405g);
                        return;
                    }
                    return;
                }
                androidx.constraintlayout.solver.widgets.d dVar3 = dVarArr[1];
                if (dVar3.f2491f != null) {
                    g h8 = h(dVar3);
                    if (h8 != null) {
                        b(this.f2457i, h8, -this.f2450b.R[1].g());
                        b(this.f2456h, this.f2457i, -this.f2453e.f2405g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof androidx.constraintlayout.solver.widgets.i) || eVar2.U() == null || this.f2450b.r(d.b.CENTER).f2491f != null) {
                    return;
                }
                b(this.f2456h, this.f2450b.U().f2518e.f2456h, this.f2450b.k0());
                b(this.f2457i, this.f2456h, this.f2453e.f2405g);
                return;
            }
        }
        if (this.f2452d == e.b.MATCH_CONSTRAINT) {
            androidx.constraintlayout.solver.widgets.e eVar3 = this.f2450b;
            int i5 = eVar3.f2540p;
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
            } else if (i5 == 3) {
                if (eVar3.f2542q == 3) {
                    this.f2456h.f2399a = this;
                    this.f2457i.f2399a = this;
                    o oVar = eVar3.f2520f;
                    oVar.f2456h.f2399a = this;
                    oVar.f2457i.f2399a = this;
                    hVar.f2399a = this;
                    if (eVar3.u0()) {
                        this.f2453e.f2410l.add(this.f2450b.f2520f.f2453e);
                        this.f2450b.f2520f.f2453e.f2409k.add(this.f2453e);
                        o oVar2 = this.f2450b.f2520f;
                        oVar2.f2453e.f2399a = this;
                        this.f2453e.f2410l.add(oVar2.f2456h);
                        this.f2453e.f2410l.add(this.f2450b.f2520f.f2457i);
                        this.f2450b.f2520f.f2456h.f2409k.add(this.f2453e);
                        this.f2450b.f2520f.f2457i.f2409k.add(this.f2453e);
                    } else if (this.f2450b.s0()) {
                        this.f2450b.f2520f.f2453e.f2410l.add(this.f2453e);
                        this.f2453e.f2409k.add(this.f2450b.f2520f.f2453e);
                    } else {
                        this.f2450b.f2520f.f2453e.f2410l.add(this.f2453e);
                    }
                } else {
                    h hVar4 = eVar3.f2520f.f2453e;
                    hVar.f2410l.add(hVar4);
                    hVar4.f2409k.add(this.f2453e);
                    this.f2450b.f2520f.f2456h.f2409k.add(this.f2453e);
                    this.f2450b.f2520f.f2457i.f2409k.add(this.f2453e);
                    h hVar5 = this.f2453e;
                    hVar5.f2400b = true;
                    hVar5.f2409k.add(this.f2456h);
                    this.f2453e.f2409k.add(this.f2457i);
                    this.f2456h.f2410l.add(this.f2453e);
                    this.f2457i.f2410l.add(this.f2453e);
                }
            }
        }
        androidx.constraintlayout.solver.widgets.e eVar4 = this.f2450b;
        androidx.constraintlayout.solver.widgets.d[] dVarArr2 = eVar4.R;
        androidx.constraintlayout.solver.widgets.d dVar4 = dVarArr2[0];
        androidx.constraintlayout.solver.widgets.d dVar5 = dVar4.f2491f;
        if (dVar5 != null && dVarArr2[1].f2491f != null) {
            if (eVar4.s0()) {
                this.f2456h.f2404f = this.f2450b.R[0].g();
                this.f2457i.f2404f = -this.f2450b.R[1].g();
                return;
            }
            g h9 = h(this.f2450b.R[0]);
            g h10 = h(this.f2450b.R[1]);
            h9.b(this);
            h10.b(this);
            this.f2458j = q.b.CENTER;
            return;
        }
        if (dVar5 != null) {
            g h11 = h(dVar4);
            if (h11 != null) {
                b(this.f2456h, h11, this.f2450b.R[0].g());
                c(this.f2457i, this.f2456h, 1, this.f2453e);
                return;
            }
            return;
        }
        androidx.constraintlayout.solver.widgets.d dVar6 = dVarArr2[1];
        if (dVar6.f2491f != null) {
            g h12 = h(dVar6);
            if (h12 != null) {
                b(this.f2457i, h12, -this.f2450b.R[1].g());
                c(this.f2456h, this.f2457i, -1, this.f2453e);
                return;
            }
            return;
        }
        if ((eVar4 instanceof androidx.constraintlayout.solver.widgets.i) || eVar4.U() == null) {
            return;
        }
        b(this.f2456h, this.f2450b.U().f2518e.f2456h, this.f2450b.k0());
        c(this.f2457i, this.f2456h, 1, this.f2453e);
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.q
    public void e() {
        g gVar = this.f2456h;
        if (gVar.f2408j) {
            this.f2450b.J1(gVar.f2405g);
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.q
    void f() {
        this.f2451c = null;
        this.f2456h.c();
        this.f2457i.c();
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
        this.f2453e.f2408j = false;
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.q
    boolean p() {
        return this.f2452d != e.b.MATCH_CONSTRAINT || this.f2450b.f2540p == 0;
    }

    public String toString() {
        return "HorizontalRun " + this.f2450b.y();
    }
}
