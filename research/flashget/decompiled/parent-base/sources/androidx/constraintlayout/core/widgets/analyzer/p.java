package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.e;

/* compiled from: WidgetRun.java */
/* loaded from: classes.dex */
public abstract class p implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f22860a;

    /* renamed from: b, reason: collision with root package name */
    androidx.constraintlayout.core.widgets.e f22861b;

    /* renamed from: c, reason: collision with root package name */
    m f22862c;

    /* renamed from: d, reason: collision with root package name */
    protected e.b f22863d;

    /* renamed from: e, reason: collision with root package name */
    g f22864e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f22865f = 0;

    /* renamed from: g, reason: collision with root package name */
    boolean f22866g = false;

    /* renamed from: h, reason: collision with root package name */
    public f f22867h = new f(this);

    /* renamed from: i, reason: collision with root package name */
    public f f22868i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    protected b f22869j = b.NONE;

    /* compiled from: WidgetRun.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22870a;

        static {
            int[] iArr = new int[d.b.values().length];
            f22870a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22870a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22870a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22870a[d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22870a[d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: WidgetRun.java */
    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(androidx.constraintlayout.core.widgets.e eVar) {
        this.f22861b = eVar;
    }

    private void o(int i4, int i5) {
        int i6 = this.f22860a;
        if (i6 == 0) {
            this.f22864e.e(g(i5, i4));
            return;
        }
        if (i6 == 1) {
            this.f22864e.e(Math.min(g(this.f22864e.f22819m, i4), i5));
            return;
        }
        if (i6 == 2) {
            androidx.constraintlayout.core.widgets.e U = this.f22861b.U();
            if (U != null) {
                if ((i4 == 0 ? U.f22941e : U.f22943f).f22864e.f22816j) {
                    androidx.constraintlayout.core.widgets.e eVar = this.f22861b;
                    this.f22864e.e(g((int) ((r9.f22813g * (i4 == 0 ? eVar.B : eVar.E)) + 0.5f), i4));
                    return;
                }
                return;
            }
            return;
        }
        if (i6 != 3) {
            return;
        }
        androidx.constraintlayout.core.widgets.e eVar2 = this.f22861b;
        p pVar = eVar2.f22941e;
        e.b bVar = pVar.f22863d;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && pVar.f22860a == 3) {
            n nVar = eVar2.f22943f;
            if (nVar.f22863d == bVar2 && nVar.f22860a == 3) {
                return;
            }
        }
        if (i4 == 0) {
            pVar = eVar2.f22943f;
        }
        if (pVar.f22864e.f22816j) {
            float A = eVar2.A();
            this.f22864e.e(i4 == 1 ? (int) ((pVar.f22864e.f22813g / A) + 0.5f) : (int) ((A * pVar.f22864e.f22813g) + 0.5f));
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.d
    public void a(d dVar) {
    }

    protected final void b(f fVar, f fVar2, int i4) {
        fVar.f22818l.add(fVar2);
        fVar.f22812f = i4;
        fVar2.f22817k.add(fVar);
    }

    protected final void c(f fVar, f fVar2, int i4, g gVar) {
        fVar.f22818l.add(fVar2);
        fVar.f22818l.add(this.f22864e);
        fVar.f22814h = i4;
        fVar.f22815i = gVar;
        fVar2.f22817k.add(fVar);
        gVar.f22817k.add(fVar);
    }

    abstract void d();

    abstract void e();

    abstract void f();

    protected final int g(int i4, int i5) {
        int max;
        if (i5 == 0) {
            androidx.constraintlayout.core.widgets.e eVar = this.f22861b;
            int i6 = eVar.A;
            max = Math.max(eVar.f22983z, i4);
            if (i6 > 0) {
                max = Math.min(i6, i4);
            }
            if (max == i4) {
                return i4;
            }
        } else {
            androidx.constraintlayout.core.widgets.e eVar2 = this.f22861b;
            int i7 = eVar2.D;
            max = Math.max(eVar2.C, i4);
            if (i7 > 0) {
                max = Math.min(i7, i4);
            }
            if (max == i4) {
                return i4;
            }
        }
        return max;
    }

    protected final f h(androidx.constraintlayout.core.widgets.d dVar) {
        androidx.constraintlayout.core.widgets.d dVar2 = dVar.f22902f;
        if (dVar2 == null) {
            return null;
        }
        androidx.constraintlayout.core.widgets.e eVar = dVar2.f22900d;
        int i4 = a.f22870a[dVar2.f22901e.ordinal()];
        if (i4 == 1) {
            return eVar.f22941e.f22867h;
        }
        if (i4 == 2) {
            return eVar.f22941e.f22868i;
        }
        if (i4 == 3) {
            return eVar.f22943f.f22867h;
        }
        if (i4 == 4) {
            return eVar.f22943f.f22841k;
        }
        if (i4 != 5) {
            return null;
        }
        return eVar.f22943f.f22868i;
    }

    protected final f i(androidx.constraintlayout.core.widgets.d dVar, int i4) {
        androidx.constraintlayout.core.widgets.d dVar2 = dVar.f22902f;
        if (dVar2 == null) {
            return null;
        }
        androidx.constraintlayout.core.widgets.e eVar = dVar2.f22900d;
        p pVar = i4 == 0 ? eVar.f22941e : eVar.f22943f;
        int i5 = a.f22870a[dVar2.f22901e.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f22868i;
        }
        return pVar.f22867h;
    }

    public long j() {
        if (this.f22864e.f22816j) {
            return r0.f22813g;
        }
        return 0L;
    }

    public boolean k() {
        int size = this.f22867h.f22818l.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            if (this.f22867h.f22818l.get(i5).f22810d != this) {
                i4++;
            }
        }
        int size2 = this.f22868i.f22818l.size();
        for (int i6 = 0; i6 < size2; i6++) {
            if (this.f22868i.f22818l.get(i6).f22810d != this) {
                i4++;
            }
        }
        return i4 >= 2;
    }

    public boolean l() {
        return this.f22864e.f22816j;
    }

    public boolean m() {
        return this.f22866g;
    }

    abstract void n();

    abstract boolean p();

    protected void q(d dVar, androidx.constraintlayout.core.widgets.d dVar2, androidx.constraintlayout.core.widgets.d dVar3, int i4) {
        f h4 = h(dVar2);
        f h5 = h(dVar3);
        if (h4.f22816j && h5.f22816j) {
            int g4 = dVar2.g() + h4.f22813g;
            int g5 = h5.f22813g - dVar3.g();
            int i5 = g5 - g4;
            if (!this.f22864e.f22816j && this.f22863d == e.b.MATCH_CONSTRAINT) {
                o(i4, i5);
            }
            g gVar = this.f22864e;
            if (gVar.f22816j) {
                if (gVar.f22813g == i5) {
                    this.f22867h.e(g4);
                    this.f22868i.e(g5);
                    return;
                }
                androidx.constraintlayout.core.widgets.e eVar = this.f22861b;
                float E = i4 == 0 ? eVar.E() : eVar.g0();
                if (h4 == h5) {
                    g4 = h4.f22813g;
                    g5 = h5.f22813g;
                    E = 0.5f;
                }
                this.f22867h.e((int) ((((g5 - g4) - this.f22864e.f22813g) * E) + g4 + 0.5f));
                this.f22868i.e(this.f22867h.f22813g + this.f22864e.f22813g);
            }
        }
    }

    protected void r(d dVar) {
    }

    protected void s(d dVar) {
    }

    public long t(int i4) {
        int i5;
        g gVar = this.f22864e;
        if (!gVar.f22816j) {
            return 0L;
        }
        long j4 = gVar.f22813g;
        if (k()) {
            i5 = this.f22867h.f22812f - this.f22868i.f22812f;
        } else {
            if (i4 != 0) {
                return j4 - this.f22868i.f22812f;
            }
            i5 = this.f22867h.f22812f;
        }
        return j4 + i5;
    }
}
