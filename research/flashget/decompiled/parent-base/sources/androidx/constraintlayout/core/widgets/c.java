package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.e;
import java.util.ArrayList;

/* compiled from: ChainHead.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    protected e f22873a;

    /* renamed from: b, reason: collision with root package name */
    protected e f22874b;

    /* renamed from: c, reason: collision with root package name */
    protected e f22875c;

    /* renamed from: d, reason: collision with root package name */
    protected e f22876d;

    /* renamed from: e, reason: collision with root package name */
    protected e f22877e;

    /* renamed from: f, reason: collision with root package name */
    protected e f22878f;

    /* renamed from: g, reason: collision with root package name */
    protected e f22879g;

    /* renamed from: h, reason: collision with root package name */
    protected ArrayList<e> f22880h;

    /* renamed from: i, reason: collision with root package name */
    protected int f22881i;

    /* renamed from: j, reason: collision with root package name */
    protected int f22882j;

    /* renamed from: k, reason: collision with root package name */
    protected float f22883k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    int f22884l;

    /* renamed from: m, reason: collision with root package name */
    int f22885m;

    /* renamed from: n, reason: collision with root package name */
    int f22886n;

    /* renamed from: o, reason: collision with root package name */
    boolean f22887o;

    /* renamed from: p, reason: collision with root package name */
    private int f22888p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f22889q;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f22890r;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f22891s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f22892t;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f22893u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f22894v;

    public c(e eVar, int i4, boolean z4) {
        this.f22873a = eVar;
        this.f22888p = i4;
        this.f22889q = z4;
    }

    private void b() {
        int i4 = this.f22888p * 2;
        e eVar = this.f22873a;
        this.f22887o = true;
        e eVar2 = eVar;
        boolean z4 = false;
        while (!z4) {
            this.f22881i++;
            e[] eVarArr = eVar.P0;
            int i5 = this.f22888p;
            e eVar3 = null;
            eVarArr[i5] = null;
            eVar.O0[i5] = null;
            if (eVar.l0() != 8) {
                this.f22884l++;
                e.b z5 = eVar.z(this.f22888p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (z5 != bVar) {
                    this.f22885m = eVar.M(this.f22888p) + this.f22885m;
                }
                int g4 = eVar.Y[i4].g() + this.f22885m;
                this.f22885m = g4;
                int i6 = i4 + 1;
                this.f22885m = eVar.Y[i6].g() + g4;
                int g5 = eVar.Y[i4].g() + this.f22886n;
                this.f22886n = g5;
                this.f22886n = eVar.Y[i6].g() + g5;
                if (this.f22874b == null) {
                    this.f22874b = eVar;
                }
                this.f22876d = eVar;
                e.b[] bVarArr = eVar.f22936b0;
                int i7 = this.f22888p;
                if (bVarArr[i7] == bVar) {
                    int i10 = eVar.f22981y[i7];
                    if (i10 == 0 || i10 == 3 || i10 == 2) {
                        this.f22882j++;
                        float f4 = eVar.N0[i7];
                        if (f4 > 0.0f) {
                            this.f22883k += f4;
                        }
                        if (k(eVar, i7)) {
                            if (f4 < 0.0f) {
                                this.f22890r = true;
                            } else {
                                this.f22891s = true;
                            }
                            if (this.f22880h == null) {
                                this.f22880h = new ArrayList<>();
                            }
                            this.f22880h.add(eVar);
                        }
                        if (this.f22878f == null) {
                            this.f22878f = eVar;
                        }
                        e eVar4 = this.f22879g;
                        if (eVar4 != null) {
                            eVar4.O0[this.f22888p] = eVar;
                        }
                        this.f22879g = eVar;
                    }
                    if (this.f22888p == 0) {
                        if (eVar.f22977w != 0) {
                            this.f22887o = false;
                        } else if (eVar.f22983z != 0 || eVar.A != 0) {
                            this.f22887o = false;
                        }
                    } else if (eVar.f22979x != 0) {
                        this.f22887o = false;
                    } else if (eVar.C != 0 || eVar.D != 0) {
                        this.f22887o = false;
                    }
                    if (eVar.f22944f0 != 0.0f) {
                        this.f22887o = false;
                        this.f22893u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.P0[this.f22888p] = eVar;
            }
            d dVar = eVar.Y[i4 + 1].f22902f;
            if (dVar != null) {
                e eVar5 = dVar.f22900d;
                d dVar2 = eVar5.Y[i4].f22902f;
                if (dVar2 != null && dVar2.f22900d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z4 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f22874b;
        if (eVar6 != null) {
            this.f22885m -= eVar6.Y[i4].g();
        }
        e eVar7 = this.f22876d;
        if (eVar7 != null) {
            this.f22885m -= eVar7.Y[i4 + 1].g();
        }
        this.f22875c = eVar;
        if (this.f22888p == 0 && this.f22889q) {
            this.f22877e = eVar;
        } else {
            this.f22877e = this.f22873a;
        }
        this.f22892t = this.f22891s && this.f22890r;
    }

    private static boolean k(e eVar, int i4) {
        int i5;
        return eVar.l0() != 8 && eVar.f22936b0[i4] == e.b.MATCH_CONSTRAINT && ((i5 = eVar.f22981y[i4]) == 0 || i5 == 3);
    }

    public void a() {
        if (!this.f22894v) {
            b();
        }
        this.f22894v = true;
    }

    public e c() {
        return this.f22873a;
    }

    public e d() {
        return this.f22878f;
    }

    public e e() {
        return this.f22874b;
    }

    public e f() {
        return this.f22877e;
    }

    public e g() {
        return this.f22875c;
    }

    public e h() {
        return this.f22879g;
    }

    public e i() {
        return this.f22876d;
    }

    public float j() {
        return this.f22883k;
    }
}
