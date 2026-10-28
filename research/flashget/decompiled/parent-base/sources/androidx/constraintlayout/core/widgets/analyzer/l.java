package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.analyzer.f;
import androidx.constraintlayout.core.widgets.analyzer.p;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.e;

/* compiled from: HorizontalWidgetRun.java */
/* loaded from: classes.dex */
public class l extends p {

    /* renamed from: k, reason: collision with root package name */
    private static int[] f22828k = new int[2];

    /* compiled from: HorizontalWidgetRun.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22829a;

        static {
            int[] iArr = new int[p.b.values().length];
            f22829a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22829a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22829a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(androidx.constraintlayout.core.widgets.e eVar) {
        super(eVar);
        this.f22867h.f22811e = f.a.LEFT;
        this.f22868i.f22811e = f.a.RIGHT;
        this.f22865f = 0;
    }

    private void u(int[] iArr, int i4, int i5, int i6, int i7, float f4, int i10) {
        int i11 = i5 - i4;
        int i12 = i7 - i6;
        if (i10 != -1) {
            if (i10 == 0) {
                iArr[0] = (int) ((i12 * f4) + 0.5f);
                iArr[1] = i12;
                return;
            } else {
                if (i10 != 1) {
                    return;
                }
                iArr[0] = i11;
                iArr[1] = (int) ((i11 * f4) + 0.5f);
                return;
            }
        }
        int i13 = (int) ((i12 * f4) + 0.5f);
        int i14 = (int) ((i11 / f4) + 0.5f);
        if (i13 <= i11) {
            iArr[0] = i13;
            iArr[1] = i12;
        } else if (i14 <= i12) {
            iArr[0] = i11;
            iArr[1] = i14;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x02bc, code lost:
    
        if (r14 != 1) goto L134;
     */
    @Override // androidx.constraintlayout.core.widgets.analyzer.p, androidx.constraintlayout.core.widgets.analyzer.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(androidx.constraintlayout.core.widgets.analyzer.d r17) {
        /*
            Method dump skipped, instructions count: 1090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.l.a(androidx.constraintlayout.core.widgets.analyzer.d):void");
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    void d() {
        androidx.constraintlayout.core.widgets.e U;
        androidx.constraintlayout.core.widgets.e U2;
        androidx.constraintlayout.core.widgets.e eVar = this.f22861b;
        if (eVar.f22933a) {
            this.f22864e.e(eVar.m0());
        }
        if (this.f22864e.f22816j) {
            e.b bVar = this.f22863d;
            e.b bVar2 = e.b.MATCH_PARENT;
            if (bVar == bVar2 && (U = this.f22861b.U()) != null && (U.H() == e.b.FIXED || U.H() == bVar2)) {
                b(this.f22867h, U.f22941e.f22867h, this.f22861b.Q.g());
                b(this.f22868i, U.f22941e.f22868i, -this.f22861b.S.g());
                return;
            }
        } else {
            e.b H = this.f22861b.H();
            this.f22863d = H;
            if (H != e.b.MATCH_CONSTRAINT) {
                e.b bVar3 = e.b.MATCH_PARENT;
                if (H == bVar3 && (U2 = this.f22861b.U()) != null && (U2.H() == e.b.FIXED || U2.H() == bVar3)) {
                    int m02 = (U2.m0() - this.f22861b.Q.g()) - this.f22861b.S.g();
                    b(this.f22867h, U2.f22941e.f22867h, this.f22861b.Q.g());
                    b(this.f22868i, U2.f22941e.f22868i, -this.f22861b.S.g());
                    this.f22864e.e(m02);
                    return;
                }
                if (this.f22863d == e.b.FIXED) {
                    this.f22864e.e(this.f22861b.m0());
                }
            }
        }
        g gVar = this.f22864e;
        if (gVar.f22816j) {
            androidx.constraintlayout.core.widgets.e eVar2 = this.f22861b;
            if (eVar2.f22933a) {
                androidx.constraintlayout.core.widgets.d[] dVarArr = eVar2.Y;
                androidx.constraintlayout.core.widgets.d dVar = dVarArr[0];
                androidx.constraintlayout.core.widgets.d dVar2 = dVar.f22902f;
                if (dVar2 != null && dVarArr[1].f22902f != null) {
                    if (eVar2.B0()) {
                        this.f22867h.f22812f = this.f22861b.Y[0].g();
                        this.f22868i.f22812f = -this.f22861b.Y[1].g();
                        return;
                    }
                    f h4 = h(this.f22861b.Y[0]);
                    if (h4 != null) {
                        b(this.f22867h, h4, this.f22861b.Y[0].g());
                    }
                    f h5 = h(this.f22861b.Y[1]);
                    if (h5 != null) {
                        b(this.f22868i, h5, -this.f22861b.Y[1].g());
                    }
                    this.f22867h.f22808b = true;
                    this.f22868i.f22808b = true;
                    return;
                }
                if (dVar2 != null) {
                    f h6 = h(dVar);
                    if (h6 != null) {
                        b(this.f22867h, h6, this.f22861b.Y[0].g());
                        b(this.f22868i, this.f22867h, this.f22864e.f22813g);
                        return;
                    }
                    return;
                }
                androidx.constraintlayout.core.widgets.d dVar3 = dVarArr[1];
                if (dVar3.f22902f != null) {
                    f h7 = h(dVar3);
                    if (h7 != null) {
                        b(this.f22868i, h7, -this.f22861b.Y[1].g());
                        b(this.f22867h, this.f22868i, -this.f22864e.f22813g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof androidx.constraintlayout.core.widgets.i) || eVar2.U() == null || this.f22861b.r(d.b.CENTER).f22902f != null) {
                    return;
                }
                b(this.f22867h, this.f22861b.U().f22941e.f22867h, this.f22861b.o0());
                b(this.f22868i, this.f22867h, this.f22864e.f22813g);
                return;
            }
        }
        if (this.f22863d == e.b.MATCH_CONSTRAINT) {
            androidx.constraintlayout.core.widgets.e eVar3 = this.f22861b;
            int i4 = eVar3.f22977w;
            if (i4 == 2) {
                androidx.constraintlayout.core.widgets.e U3 = eVar3.U();
                if (U3 != null) {
                    g gVar2 = U3.f22943f.f22864e;
                    this.f22864e.f22818l.add(gVar2);
                    gVar2.f22817k.add(this.f22864e);
                    g gVar3 = this.f22864e;
                    gVar3.f22808b = true;
                    gVar3.f22817k.add(this.f22867h);
                    this.f22864e.f22817k.add(this.f22868i);
                }
            } else if (i4 == 3) {
                if (eVar3.f22979x == 3) {
                    this.f22867h.f22807a = this;
                    this.f22868i.f22807a = this;
                    n nVar = eVar3.f22943f;
                    nVar.f22867h.f22807a = this;
                    nVar.f22868i.f22807a = this;
                    gVar.f22807a = this;
                    if (eVar3.D0()) {
                        this.f22864e.f22818l.add(this.f22861b.f22943f.f22864e);
                        this.f22861b.f22943f.f22864e.f22817k.add(this.f22864e);
                        n nVar2 = this.f22861b.f22943f;
                        nVar2.f22864e.f22807a = this;
                        this.f22864e.f22818l.add(nVar2.f22867h);
                        this.f22864e.f22818l.add(this.f22861b.f22943f.f22868i);
                        this.f22861b.f22943f.f22867h.f22817k.add(this.f22864e);
                        this.f22861b.f22943f.f22868i.f22817k.add(this.f22864e);
                    } else if (this.f22861b.B0()) {
                        this.f22861b.f22943f.f22864e.f22818l.add(this.f22864e);
                        this.f22864e.f22817k.add(this.f22861b.f22943f.f22864e);
                    } else {
                        this.f22861b.f22943f.f22864e.f22818l.add(this.f22864e);
                    }
                } else {
                    g gVar4 = eVar3.f22943f.f22864e;
                    gVar.f22818l.add(gVar4);
                    gVar4.f22817k.add(this.f22864e);
                    this.f22861b.f22943f.f22867h.f22817k.add(this.f22864e);
                    this.f22861b.f22943f.f22868i.f22817k.add(this.f22864e);
                    g gVar5 = this.f22864e;
                    gVar5.f22808b = true;
                    gVar5.f22817k.add(this.f22867h);
                    this.f22864e.f22817k.add(this.f22868i);
                    this.f22867h.f22818l.add(this.f22864e);
                    this.f22868i.f22818l.add(this.f22864e);
                }
            }
        }
        androidx.constraintlayout.core.widgets.e eVar4 = this.f22861b;
        androidx.constraintlayout.core.widgets.d[] dVarArr2 = eVar4.Y;
        androidx.constraintlayout.core.widgets.d dVar4 = dVarArr2[0];
        androidx.constraintlayout.core.widgets.d dVar5 = dVar4.f22902f;
        if (dVar5 != null && dVarArr2[1].f22902f != null) {
            if (eVar4.B0()) {
                this.f22867h.f22812f = this.f22861b.Y[0].g();
                this.f22868i.f22812f = -this.f22861b.Y[1].g();
                return;
            }
            f h10 = h(this.f22861b.Y[0]);
            f h11 = h(this.f22861b.Y[1]);
            if (h10 != null) {
                h10.b(this);
            }
            if (h11 != null) {
                h11.b(this);
            }
            this.f22869j = p.b.CENTER;
            return;
        }
        if (dVar5 != null) {
            f h12 = h(dVar4);
            if (h12 != null) {
                b(this.f22867h, h12, this.f22861b.Y[0].g());
                c(this.f22868i, this.f22867h, 1, this.f22864e);
                return;
            }
            return;
        }
        androidx.constraintlayout.core.widgets.d dVar6 = dVarArr2[1];
        if (dVar6.f22902f != null) {
            f h13 = h(dVar6);
            if (h13 != null) {
                b(this.f22868i, h13, -this.f22861b.Y[1].g());
                c(this.f22867h, this.f22868i, -1, this.f22864e);
                return;
            }
            return;
        }
        if ((eVar4 instanceof androidx.constraintlayout.core.widgets.i) || eVar4.U() == null) {
            return;
        }
        b(this.f22867h, this.f22861b.U().f22941e.f22867h, this.f22861b.o0());
        c(this.f22868i, this.f22867h, 1, this.f22864e);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public void e() {
        f fVar = this.f22867h;
        if (fVar.f22816j) {
            this.f22861b.f2(fVar.f22813g);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    void f() {
        this.f22862c = null;
        this.f22867h.c();
        this.f22868i.c();
        this.f22864e.c();
        this.f22866g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    void n() {
        this.f22866g = false;
        this.f22867h.c();
        this.f22867h.f22816j = false;
        this.f22868i.c();
        this.f22868i.f22816j = false;
        this.f22864e.f22816j = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    boolean p() {
        return this.f22863d != e.b.MATCH_CONSTRAINT || this.f22861b.f22977w == 0;
    }

    public String toString() {
        return "HorizontalRun " + this.f22861b.y();
    }
}
