package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.d;
import androidx.constraintlayout.solver.widgets.e;

/* compiled from: WidgetRun.java */
/* loaded from: classes3.dex */
public abstract class q implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f2449a;

    /* renamed from: b, reason: collision with root package name */
    androidx.constraintlayout.solver.widgets.e f2450b;

    /* renamed from: c, reason: collision with root package name */
    n f2451c;

    /* renamed from: d, reason: collision with root package name */
    protected e.b f2452d;

    /* renamed from: e, reason: collision with root package name */
    h f2453e = new h(this);

    /* renamed from: f, reason: collision with root package name */
    public int f2454f = 0;

    /* renamed from: g, reason: collision with root package name */
    boolean f2455g = false;

    /* renamed from: h, reason: collision with root package name */
    public g f2456h = new g(this);

    /* renamed from: i, reason: collision with root package name */
    public g f2457i = new g(this);

    /* renamed from: j, reason: collision with root package name */
    protected b f2458j = b.NONE;

    /* compiled from: WidgetRun.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2459a;

        static {
            int[] iArr = new int[d.b.values().length];
            f2459a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2459a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2459a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2459a[d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2459a[d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: WidgetRun.java */
    /* loaded from: classes.dex */
    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public q(androidx.constraintlayout.solver.widgets.e eVar) {
        this.f2450b = eVar;
    }

    private void o(int i5, int i6) {
        int i7 = this.f2449a;
        if (i7 == 0) {
            this.f2453e.e(g(i6, i5));
            return;
        }
        if (i7 == 1) {
            this.f2453e.e(Math.min(g(this.f2453e.f2411m, i5), i6));
            return;
        }
        if (i7 == 2) {
            androidx.constraintlayout.solver.widgets.e U = this.f2450b.U();
            if (U != null) {
                if ((i5 == 0 ? U.f2518e : U.f2520f).f2453e.f2408j) {
                    androidx.constraintlayout.solver.widgets.e eVar = this.f2450b;
                    this.f2453e.e(g((int) ((r9.f2405g * (i5 == 0 ? eVar.f2550u : eVar.f2556x)) + 0.5f), i5));
                    return;
                }
                return;
            }
            return;
        }
        if (i7 != 3) {
            return;
        }
        androidx.constraintlayout.solver.widgets.e eVar2 = this.f2450b;
        q qVar = eVar2.f2518e;
        e.b bVar = qVar.f2452d;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && qVar.f2449a == 3) {
            o oVar = eVar2.f2520f;
            if (oVar.f2452d == bVar2 && oVar.f2449a == 3) {
                return;
            }
        }
        if (i5 == 0) {
            qVar = eVar2.f2520f;
        }
        if (qVar.f2453e.f2408j) {
            float A = eVar2.A();
            this.f2453e.e(i5 == 1 ? (int) ((qVar.f2453e.f2405g / A) + 0.5f) : (int) ((A * qVar.f2453e.f2405g) + 0.5f));
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.d
    public void a(d dVar) {
    }

    protected final void b(g gVar, g gVar2, int i5) {
        gVar.f2410l.add(gVar2);
        gVar.f2404f = i5;
        gVar2.f2409k.add(gVar);
    }

    protected final void c(g gVar, g gVar2, int i5, h hVar) {
        gVar.f2410l.add(gVar2);
        gVar.f2410l.add(this.f2453e);
        gVar.f2406h = i5;
        gVar.f2407i = hVar;
        gVar2.f2409k.add(gVar);
        hVar.f2409k.add(gVar);
    }

    abstract void d();

    abstract void e();

    abstract void f();

    protected final int g(int i5, int i6) {
        int max;
        if (i6 == 0) {
            androidx.constraintlayout.solver.widgets.e eVar = this.f2450b;
            int i7 = eVar.f2548t;
            max = Math.max(eVar.f2546s, i5);
            if (i7 > 0) {
                max = Math.min(i7, i5);
            }
            if (max == i5) {
                return i5;
            }
        } else {
            androidx.constraintlayout.solver.widgets.e eVar2 = this.f2450b;
            int i8 = eVar2.f2554w;
            max = Math.max(eVar2.f2552v, i5);
            if (i8 > 0) {
                max = Math.min(i8, i5);
            }
            if (max == i5) {
                return i5;
            }
        }
        return max;
    }

    protected final g h(androidx.constraintlayout.solver.widgets.d dVar) {
        androidx.constraintlayout.solver.widgets.d dVar2 = dVar.f2491f;
        if (dVar2 == null) {
            return null;
        }
        androidx.constraintlayout.solver.widgets.e eVar = dVar2.f2489d;
        int i5 = a.f2459a[dVar2.f2490e.ordinal()];
        if (i5 == 1) {
            return eVar.f2518e.f2456h;
        }
        if (i5 == 2) {
            return eVar.f2518e.f2457i;
        }
        if (i5 == 3) {
            return eVar.f2520f.f2456h;
        }
        if (i5 == 4) {
            return eVar.f2520f.f2430k;
        }
        if (i5 != 5) {
            return null;
        }
        return eVar.f2520f.f2457i;
    }

    protected final g i(androidx.constraintlayout.solver.widgets.d dVar, int i5) {
        androidx.constraintlayout.solver.widgets.d dVar2 = dVar.f2491f;
        if (dVar2 == null) {
            return null;
        }
        androidx.constraintlayout.solver.widgets.e eVar = dVar2.f2489d;
        q qVar = i5 == 0 ? eVar.f2518e : eVar.f2520f;
        int i6 = a.f2459a[dVar2.f2490e.ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 != 5) {
                        return null;
                    }
                }
            }
            return qVar.f2457i;
        }
        return qVar.f2456h;
    }

    public long j() {
        if (this.f2453e.f2408j) {
            return r0.f2405g;
        }
        return 0L;
    }

    public boolean k() {
        int size = this.f2456h.f2410l.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            if (this.f2456h.f2410l.get(i6).f2402d != this) {
                i5++;
            }
        }
        int size2 = this.f2457i.f2410l.size();
        for (int i7 = 0; i7 < size2; i7++) {
            if (this.f2457i.f2410l.get(i7).f2402d != this) {
                i5++;
            }
        }
        return i5 >= 2;
    }

    public boolean l() {
        return this.f2453e.f2408j;
    }

    public boolean m() {
        return this.f2455g;
    }

    abstract void n();

    abstract boolean p();

    protected void q(d dVar, androidx.constraintlayout.solver.widgets.d dVar2, androidx.constraintlayout.solver.widgets.d dVar3, int i5) {
        g h5 = h(dVar2);
        g h6 = h(dVar3);
        if (h5.f2408j && h6.f2408j) {
            int g5 = dVar2.g() + h5.f2405g;
            int g6 = h6.f2405g - dVar3.g();
            int i6 = g6 - g5;
            if (!this.f2453e.f2408j && this.f2452d == e.b.MATCH_CONSTRAINT) {
                o(i5, i6);
            }
            h hVar = this.f2453e;
            if (hVar.f2408j) {
                if (hVar.f2405g == i6) {
                    this.f2456h.e(g5);
                    this.f2457i.e(g6);
                    return;
                }
                androidx.constraintlayout.solver.widgets.e eVar = this.f2450b;
                float E = i5 == 0 ? eVar.E() : eVar.d0();
                if (h5 == h6) {
                    g5 = h5.f2405g;
                    g6 = h6.f2405g;
                    E = 0.5f;
                }
                this.f2456h.e((int) ((((g6 - g5) - this.f2453e.f2405g) * E) + g5 + 0.5f));
                this.f2457i.e(this.f2456h.f2405g + this.f2453e.f2405g);
            }
        }
    }

    protected void r(d dVar) {
    }

    protected void s(d dVar) {
    }

    public long t(int i5) {
        int i6;
        h hVar = this.f2453e;
        if (!hVar.f2408j) {
            return 0L;
        }
        long j5 = hVar.f2405g;
        if (k()) {
            i6 = this.f2456h.f2404f - this.f2457i.f2404f;
        } else {
            if (i5 != 0) {
                return j5 - this.f2457i.f2404f;
            }
            i6 = this.f2456h.f2404f;
        }
        return j5 + i6;
    }
}
