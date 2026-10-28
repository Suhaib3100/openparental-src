package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.analyzer.f;
import androidx.constraintlayout.core.widgets.analyzer.p;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.e;

/* compiled from: VerticalWidgetRun.java */
/* loaded from: classes.dex */
public class n extends p {

    /* renamed from: k, reason: collision with root package name */
    public f f22841k;

    /* renamed from: l, reason: collision with root package name */
    g f22842l;

    /* compiled from: VerticalWidgetRun.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22843a;

        static {
            int[] iArr = new int[p.b.values().length];
            f22843a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22843a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22843a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(androidx.constraintlayout.core.widgets.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f22841k = fVar;
        this.f22842l = null;
        this.f22867h.f22811e = f.a.TOP;
        this.f22868i.f22811e = f.a.BOTTOM;
        fVar.f22811e = f.a.BASELINE;
        this.f22865f = 1;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p, androidx.constraintlayout.core.widgets.analyzer.d
    public void a(d dVar) {
        float f4;
        float A;
        int i4;
        int i5 = a.f22843a[this.f22869j.ordinal()];
        if (i5 == 1) {
            s(dVar);
        } else if (i5 == 2) {
            r(dVar);
        } else if (i5 == 3) {
            androidx.constraintlayout.core.widgets.e eVar = this.f22861b;
            q(dVar, eVar.R, eVar.T, 1);
            return;
        }
        g gVar = this.f22864e;
        if (gVar.f22809c && !gVar.f22816j && this.f22863d == e.b.MATCH_CONSTRAINT) {
            androidx.constraintlayout.core.widgets.e eVar2 = this.f22861b;
            int i6 = eVar2.f22979x;
            if (i6 == 2) {
                androidx.constraintlayout.core.widgets.e U = eVar2.U();
                if (U != null) {
                    if (U.f22943f.f22864e.f22816j) {
                        this.f22864e.e((int) ((r7.f22813g * this.f22861b.E) + 0.5f));
                    }
                }
            } else if (i6 == 3 && eVar2.f22941e.f22864e.f22816j) {
                int B = eVar2.B();
                if (B != -1) {
                    if (B == 0) {
                        i4 = (int) ((this.f22861b.A() * r7.f22941e.f22864e.f22813g) + 0.5f);
                    } else if (B != 1) {
                        i4 = 0;
                    } else {
                        androidx.constraintlayout.core.widgets.e eVar3 = this.f22861b;
                        f4 = eVar3.f22941e.f22864e.f22813g;
                        A = eVar3.A();
                    }
                    this.f22864e.e(i4);
                } else {
                    androidx.constraintlayout.core.widgets.e eVar4 = this.f22861b;
                    f4 = eVar4.f22941e.f22864e.f22813g;
                    A = eVar4.A();
                }
                i4 = (int) ((f4 / A) + 0.5f);
                this.f22864e.e(i4);
            }
        }
        f fVar = this.f22867h;
        if (fVar.f22809c) {
            f fVar2 = this.f22868i;
            if (fVar2.f22809c) {
                if (fVar.f22816j && fVar2.f22816j && this.f22864e.f22816j) {
                    return;
                }
                if (!this.f22864e.f22816j && this.f22863d == e.b.MATCH_CONSTRAINT) {
                    androidx.constraintlayout.core.widgets.e eVar5 = this.f22861b;
                    if (eVar5.f22977w == 0 && !eVar5.D0()) {
                        f fVar3 = this.f22867h.f22818l.get(0);
                        f fVar4 = this.f22868i.f22818l.get(0);
                        int i7 = fVar3.f22813g;
                        f fVar5 = this.f22867h;
                        int i10 = i7 + fVar5.f22812f;
                        int i11 = fVar4.f22813g + this.f22868i.f22812f;
                        fVar5.e(i10);
                        this.f22868i.e(i11);
                        this.f22864e.e(i11 - i10);
                        return;
                    }
                }
                if (!this.f22864e.f22816j && this.f22863d == e.b.MATCH_CONSTRAINT && this.f22860a == 1 && this.f22867h.f22818l.size() > 0 && this.f22868i.f22818l.size() > 0) {
                    f fVar6 = this.f22867h.f22818l.get(0);
                    int i12 = (this.f22868i.f22818l.get(0).f22813g + this.f22868i.f22812f) - (fVar6.f22813g + this.f22867h.f22812f);
                    g gVar2 = this.f22864e;
                    int i13 = gVar2.f22819m;
                    if (i12 < i13) {
                        gVar2.e(i12);
                    } else {
                        gVar2.e(i13);
                    }
                }
                if (this.f22864e.f22816j && this.f22867h.f22818l.size() > 0 && this.f22868i.f22818l.size() > 0) {
                    f fVar7 = this.f22867h.f22818l.get(0);
                    f fVar8 = this.f22868i.f22818l.get(0);
                    int i14 = fVar7.f22813g + this.f22867h.f22812f;
                    int i15 = fVar8.f22813g + this.f22868i.f22812f;
                    float g02 = this.f22861b.g0();
                    if (fVar7 == fVar8) {
                        i14 = fVar7.f22813g;
                        i15 = fVar8.f22813g;
                        g02 = 0.5f;
                    }
                    this.f22867h.e((int) ((((i15 - i14) - this.f22864e.f22813g) * g02) + i14 + 0.5f));
                    this.f22868i.e(this.f22867h.f22813g + this.f22864e.f22813g);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    void d() {
        androidx.constraintlayout.core.widgets.e U;
        androidx.constraintlayout.core.widgets.e U2;
        androidx.constraintlayout.core.widgets.e eVar = this.f22861b;
        if (eVar.f22933a) {
            this.f22864e.e(eVar.D());
        }
        if (!this.f22864e.f22816j) {
            this.f22863d = this.f22861b.j0();
            if (this.f22861b.q0()) {
                this.f22842l = new androidx.constraintlayout.core.widgets.analyzer.a(this);
            }
            e.b bVar = this.f22863d;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.MATCH_PARENT && (U2 = this.f22861b.U()) != null && U2.j0() == e.b.FIXED) {
                    int D = (U2.D() - this.f22861b.R.g()) - this.f22861b.T.g();
                    b(this.f22867h, U2.f22943f.f22867h, this.f22861b.R.g());
                    b(this.f22868i, U2.f22943f.f22868i, -this.f22861b.T.g());
                    this.f22864e.e(D);
                    return;
                }
                if (this.f22863d == e.b.FIXED) {
                    this.f22864e.e(this.f22861b.D());
                }
            }
        } else if (this.f22863d == e.b.MATCH_PARENT && (U = this.f22861b.U()) != null && U.j0() == e.b.FIXED) {
            b(this.f22867h, U.f22943f.f22867h, this.f22861b.R.g());
            b(this.f22868i, U.f22943f.f22868i, -this.f22861b.T.g());
            return;
        }
        g gVar = this.f22864e;
        boolean z4 = gVar.f22816j;
        if (z4) {
            androidx.constraintlayout.core.widgets.e eVar2 = this.f22861b;
            if (eVar2.f22933a) {
                androidx.constraintlayout.core.widgets.d[] dVarArr = eVar2.Y;
                androidx.constraintlayout.core.widgets.d dVar = dVarArr[2];
                androidx.constraintlayout.core.widgets.d dVar2 = dVar.f22902f;
                if (dVar2 != null && dVarArr[3].f22902f != null) {
                    if (eVar2.D0()) {
                        this.f22867h.f22812f = this.f22861b.Y[2].g();
                        this.f22868i.f22812f = -this.f22861b.Y[3].g();
                    } else {
                        f h4 = h(this.f22861b.Y[2]);
                        if (h4 != null) {
                            b(this.f22867h, h4, this.f22861b.Y[2].g());
                        }
                        f h5 = h(this.f22861b.Y[3]);
                        if (h5 != null) {
                            b(this.f22868i, h5, -this.f22861b.Y[3].g());
                        }
                        this.f22867h.f22808b = true;
                        this.f22868i.f22808b = true;
                    }
                    if (this.f22861b.q0()) {
                        b(this.f22841k, this.f22867h, this.f22861b.t());
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    f h6 = h(dVar);
                    if (h6 != null) {
                        b(this.f22867h, h6, this.f22861b.Y[2].g());
                        b(this.f22868i, this.f22867h, this.f22864e.f22813g);
                        if (this.f22861b.q0()) {
                            b(this.f22841k, this.f22867h, this.f22861b.t());
                            return;
                        }
                        return;
                    }
                    return;
                }
                androidx.constraintlayout.core.widgets.d dVar3 = dVarArr[3];
                if (dVar3.f22902f != null) {
                    f h7 = h(dVar3);
                    if (h7 != null) {
                        b(this.f22868i, h7, -this.f22861b.Y[3].g());
                        b(this.f22867h, this.f22868i, -this.f22864e.f22813g);
                    }
                    if (this.f22861b.q0()) {
                        b(this.f22841k, this.f22867h, this.f22861b.t());
                        return;
                    }
                    return;
                }
                androidx.constraintlayout.core.widgets.d dVar4 = dVarArr[4];
                if (dVar4.f22902f != null) {
                    f h10 = h(dVar4);
                    if (h10 != null) {
                        b(this.f22841k, h10, 0);
                        b(this.f22867h, this.f22841k, -this.f22861b.t());
                        b(this.f22868i, this.f22867h, this.f22864e.f22813g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof androidx.constraintlayout.core.widgets.i) || eVar2.U() == null || this.f22861b.r(d.b.CENTER).f22902f != null) {
                    return;
                }
                b(this.f22867h, this.f22861b.U().f22943f.f22867h, this.f22861b.p0());
                b(this.f22868i, this.f22867h, this.f22864e.f22813g);
                if (this.f22861b.q0()) {
                    b(this.f22841k, this.f22867h, this.f22861b.t());
                    return;
                }
                return;
            }
        }
        if (z4 || this.f22863d != e.b.MATCH_CONSTRAINT) {
            gVar.b(this);
        } else {
            androidx.constraintlayout.core.widgets.e eVar3 = this.f22861b;
            int i4 = eVar3.f22979x;
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
            } else if (i4 == 3 && !eVar3.D0()) {
                androidx.constraintlayout.core.widgets.e eVar4 = this.f22861b;
                if (eVar4.f22977w != 3) {
                    g gVar4 = eVar4.f22941e.f22864e;
                    this.f22864e.f22818l.add(gVar4);
                    gVar4.f22817k.add(this.f22864e);
                    g gVar5 = this.f22864e;
                    gVar5.f22808b = true;
                    gVar5.f22817k.add(this.f22867h);
                    this.f22864e.f22817k.add(this.f22868i);
                }
            }
        }
        androidx.constraintlayout.core.widgets.e eVar5 = this.f22861b;
        androidx.constraintlayout.core.widgets.d[] dVarArr2 = eVar5.Y;
        androidx.constraintlayout.core.widgets.d dVar5 = dVarArr2[2];
        androidx.constraintlayout.core.widgets.d dVar6 = dVar5.f22902f;
        if (dVar6 != null && dVarArr2[3].f22902f != null) {
            if (eVar5.D0()) {
                this.f22867h.f22812f = this.f22861b.Y[2].g();
                this.f22868i.f22812f = -this.f22861b.Y[3].g();
            } else {
                f h11 = h(this.f22861b.Y[2]);
                f h12 = h(this.f22861b.Y[3]);
                if (h11 != null) {
                    h11.b(this);
                }
                if (h12 != null) {
                    h12.b(this);
                }
                this.f22869j = p.b.CENTER;
            }
            if (this.f22861b.q0()) {
                c(this.f22841k, this.f22867h, 1, this.f22842l);
            }
        } else if (dVar6 != null) {
            f h13 = h(dVar5);
            if (h13 != null) {
                b(this.f22867h, h13, this.f22861b.Y[2].g());
                c(this.f22868i, this.f22867h, 1, this.f22864e);
                if (this.f22861b.q0()) {
                    c(this.f22841k, this.f22867h, 1, this.f22842l);
                }
                e.b bVar2 = this.f22863d;
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f22861b.A() > 0.0f) {
                    l lVar = this.f22861b.f22941e;
                    if (lVar.f22863d == bVar3) {
                        lVar.f22864e.f22817k.add(this.f22864e);
                        this.f22864e.f22818l.add(this.f22861b.f22941e.f22864e);
                        this.f22864e.f22807a = this;
                    }
                }
            }
        } else {
            androidx.constraintlayout.core.widgets.d dVar7 = dVarArr2[3];
            if (dVar7.f22902f != null) {
                f h14 = h(dVar7);
                if (h14 != null) {
                    b(this.f22868i, h14, -this.f22861b.Y[3].g());
                    c(this.f22867h, this.f22868i, -1, this.f22864e);
                    if (this.f22861b.q0()) {
                        c(this.f22841k, this.f22867h, 1, this.f22842l);
                    }
                }
            } else {
                androidx.constraintlayout.core.widgets.d dVar8 = dVarArr2[4];
                if (dVar8.f22902f != null) {
                    f h15 = h(dVar8);
                    if (h15 != null) {
                        b(this.f22841k, h15, 0);
                        c(this.f22867h, this.f22841k, -1, this.f22842l);
                        c(this.f22868i, this.f22867h, 1, this.f22864e);
                    }
                } else if (!(eVar5 instanceof androidx.constraintlayout.core.widgets.i) && eVar5.U() != null) {
                    b(this.f22867h, this.f22861b.U().f22943f.f22867h, this.f22861b.p0());
                    c(this.f22868i, this.f22867h, 1, this.f22864e);
                    if (this.f22861b.q0()) {
                        c(this.f22841k, this.f22867h, 1, this.f22842l);
                    }
                    e.b bVar4 = this.f22863d;
                    e.b bVar5 = e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f22861b.A() > 0.0f) {
                        l lVar2 = this.f22861b.f22941e;
                        if (lVar2.f22863d == bVar5) {
                            lVar2.f22864e.f22817k.add(this.f22864e);
                            this.f22864e.f22818l.add(this.f22861b.f22941e.f22864e);
                            this.f22864e.f22807a = this;
                        }
                    }
                }
            }
        }
        if (this.f22864e.f22818l.size() == 0) {
            this.f22864e.f22809c = true;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public void e() {
        f fVar = this.f22867h;
        if (fVar.f22816j) {
            this.f22861b.g2(fVar.f22813g);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    void f() {
        this.f22862c = null;
        this.f22867h.c();
        this.f22868i.c();
        this.f22841k.c();
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
        this.f22841k.c();
        this.f22841k.f22816j = false;
        this.f22864e.f22816j = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    boolean p() {
        return this.f22863d != e.b.MATCH_CONSTRAINT || this.f22861b.f22979x == 0;
    }

    public String toString() {
        return "VerticalRun " + this.f22861b.y();
    }
}
