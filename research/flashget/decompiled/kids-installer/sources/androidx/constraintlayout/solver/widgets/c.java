package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.e;
import java.util.ArrayList;

/* compiled from: ChainHead.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    protected e f2462a;

    /* renamed from: b, reason: collision with root package name */
    protected e f2463b;

    /* renamed from: c, reason: collision with root package name */
    protected e f2464c;

    /* renamed from: d, reason: collision with root package name */
    protected e f2465d;

    /* renamed from: e, reason: collision with root package name */
    protected e f2466e;

    /* renamed from: f, reason: collision with root package name */
    protected e f2467f;

    /* renamed from: g, reason: collision with root package name */
    protected e f2468g;

    /* renamed from: h, reason: collision with root package name */
    protected ArrayList<e> f2469h;

    /* renamed from: i, reason: collision with root package name */
    protected int f2470i;

    /* renamed from: j, reason: collision with root package name */
    protected int f2471j;

    /* renamed from: k, reason: collision with root package name */
    protected float f2472k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    int f2473l;

    /* renamed from: m, reason: collision with root package name */
    int f2474m;

    /* renamed from: n, reason: collision with root package name */
    int f2475n;

    /* renamed from: o, reason: collision with root package name */
    boolean f2476o;

    /* renamed from: p, reason: collision with root package name */
    private int f2477p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f2478q;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f2479r;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f2480s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f2481t;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f2482u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f2483v;

    public c(e eVar, int i5, boolean z5) {
        this.f2462a = eVar;
        this.f2477p = i5;
        this.f2478q = z5;
    }

    private void b() {
        int i5 = this.f2477p * 2;
        e eVar = this.f2462a;
        this.f2476o = true;
        e eVar2 = eVar;
        boolean z5 = false;
        while (!z5) {
            this.f2470i++;
            e[] eVarArr = eVar.H0;
            int i6 = this.f2477p;
            e eVar3 = null;
            eVarArr[i6] = null;
            eVar.G0[i6] = null;
            if (eVar.i0() != 8) {
                this.f2473l++;
                e.b z6 = eVar.z(this.f2477p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (z6 != bVar) {
                    this.f2474m = eVar.M(this.f2477p) + this.f2474m;
                }
                int g5 = eVar.R[i5].g() + this.f2474m;
                this.f2474m = g5;
                int i7 = i5 + 1;
                this.f2474m = eVar.R[i7].g() + g5;
                int g6 = eVar.R[i5].g() + this.f2475n;
                this.f2475n = g6;
                this.f2475n = eVar.R[i7].g() + g6;
                if (this.f2463b == null) {
                    this.f2463b = eVar;
                }
                this.f2465d = eVar;
                e.b[] bVarArr = eVar.U;
                int i8 = this.f2477p;
                if (bVarArr[i8] == bVar) {
                    int i9 = eVar.f2544r[i8];
                    if (i9 == 0 || i9 == 3 || i9 == 2) {
                        this.f2471j++;
                        float f6 = eVar.F0[i8];
                        if (f6 > 0.0f) {
                            this.f2472k += f6;
                        }
                        if (k(eVar, i8)) {
                            if (f6 < 0.0f) {
                                this.f2479r = true;
                            } else {
                                this.f2480s = true;
                            }
                            if (this.f2469h == null) {
                                this.f2469h = new ArrayList<>();
                            }
                            this.f2469h.add(eVar);
                        }
                        if (this.f2467f == null) {
                            this.f2467f = eVar;
                        }
                        e eVar4 = this.f2468g;
                        if (eVar4 != null) {
                            eVar4.G0[this.f2477p] = eVar;
                        }
                        this.f2468g = eVar;
                    }
                    if (this.f2477p == 0) {
                        if (eVar.f2540p != 0) {
                            this.f2476o = false;
                        } else if (eVar.f2546s != 0 || eVar.f2548t != 0) {
                            this.f2476o = false;
                        }
                    } else if (eVar.f2542q != 0) {
                        this.f2476o = false;
                    } else if (eVar.f2552v != 0 || eVar.f2554w != 0) {
                        this.f2476o = false;
                    }
                    if (eVar.Y != 0.0f) {
                        this.f2476o = false;
                        this.f2482u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.H0[this.f2477p] = eVar;
            }
            d dVar = eVar.R[i5 + 1].f2491f;
            if (dVar != null) {
                e eVar5 = dVar.f2489d;
                d dVar2 = eVar5.R[i5].f2491f;
                if (dVar2 != null && dVar2.f2489d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z5 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f2463b;
        if (eVar6 != null) {
            this.f2474m -= eVar6.R[i5].g();
        }
        e eVar7 = this.f2465d;
        if (eVar7 != null) {
            this.f2474m -= eVar7.R[i5 + 1].g();
        }
        this.f2464c = eVar;
        if (this.f2477p == 0 && this.f2478q) {
            this.f2466e = eVar;
        } else {
            this.f2466e = this.f2462a;
        }
        this.f2481t = this.f2480s && this.f2479r;
    }

    private static boolean k(e eVar, int i5) {
        int i6;
        return eVar.i0() != 8 && eVar.U[i5] == e.b.MATCH_CONSTRAINT && ((i6 = eVar.f2544r[i5]) == 0 || i6 == 3);
    }

    public void a() {
        if (!this.f2483v) {
            b();
        }
        this.f2483v = true;
    }

    public e c() {
        return this.f2462a;
    }

    public e d() {
        return this.f2467f;
    }

    public e e() {
        return this.f2463b;
    }

    public e f() {
        return this.f2466e;
    }

    public e g() {
        return this.f2464c;
    }

    public e h() {
        return this.f2468g;
    }

    public e i() {
        return this.f2465d;
    }

    public float j() {
        return this.f2472k;
    }
}
