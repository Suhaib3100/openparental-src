package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.d;
import androidx.constraintlayout.solver.widgets.e;
import java.util.HashMap;

/* compiled from: Guideline.java */
/* loaded from: classes3.dex */
public class h extends e {
    public static final int A1 = -1;

    /* renamed from: v1, reason: collision with root package name */
    public static final int f2605v1 = 0;

    /* renamed from: w1, reason: collision with root package name */
    public static final int f2606w1 = 1;

    /* renamed from: x1, reason: collision with root package name */
    public static final int f2607x1 = 0;

    /* renamed from: y1, reason: collision with root package name */
    public static final int f2608y1 = 1;

    /* renamed from: z1, reason: collision with root package name */
    public static final int f2609z1 = 2;

    /* renamed from: o1, reason: collision with root package name */
    protected float f2610o1 = -1.0f;

    /* renamed from: p1, reason: collision with root package name */
    protected int f2611p1 = -1;

    /* renamed from: q1, reason: collision with root package name */
    protected int f2612q1 = -1;

    /* renamed from: r1, reason: collision with root package name */
    private d f2613r1 = this.K;

    /* renamed from: s1, reason: collision with root package name */
    private int f2614s1 = 0;

    /* renamed from: t1, reason: collision with root package name */
    private int f2615t1 = 0;

    /* renamed from: u1, reason: collision with root package name */
    private boolean f2616u1;

    /* compiled from: Guideline.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2617a;

        static {
            int[] iArr = new int[d.b.values().length];
            f2617a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2617a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2617a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2617a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2617a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2617a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2617a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2617a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2617a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public h() {
        this.S.clear();
        this.S.add(this.f2613r1);
        int length = this.R.length;
        for (int i5 = 0; i5 < length; i5++) {
            this.R[i5] = this.f2613r1;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.e
    public void N1(androidx.constraintlayout.solver.g gVar, boolean z5) {
        if (U() == null) {
            return;
        }
        int O = gVar.O(this.f2613r1);
        if (this.f2614s1 == 1) {
            J1(O);
            K1(0);
            d1(U().D());
            H1(0);
            return;
        }
        J1(0);
        K1(O);
        H1(U().j0());
        d1(0);
    }

    public void O1() {
        if (this.f2611p1 != -1) {
            X1();
        } else if (this.f2610o1 != -1.0f) {
            W1();
        } else if (this.f2612q1 != -1) {
            V1();
        }
    }

    public d P1() {
        return this.f2613r1;
    }

    public int Q1() {
        return this.f2614s1;
    }

    public int R1() {
        return this.f2611p1;
    }

    public int S1() {
        if (this.f2610o1 != -1.0f) {
            return 0;
        }
        if (this.f2611p1 != -1) {
            return 1;
        }
        return this.f2612q1 != -1 ? 2 : -1;
    }

    public int T1() {
        return this.f2612q1;
    }

    public float U1() {
        return this.f2610o1;
    }

    void V1() {
        int k02 = k0();
        if (this.f2614s1 == 0) {
            k02 = l0();
        }
        a2(k02);
    }

    void W1() {
        int j02 = U().j0() - k0();
        if (this.f2614s1 == 0) {
            j02 = U().D() - l0();
        }
        b2(j02);
    }

    void X1() {
        float k02 = k0() / U().j0();
        if (this.f2614s1 == 0) {
            k02 = l0() / U().D();
        }
        c2(k02);
    }

    public boolean Y1() {
        return this.f2610o1 != -1.0f && this.f2611p1 == -1 && this.f2612q1 == -1;
    }

    public void Z1(int i5) {
        this.f2613r1.A(i5);
        this.f2616u1 = true;
    }

    public void a2(int i5) {
        if (i5 > -1) {
            this.f2610o1 = -1.0f;
            this.f2611p1 = i5;
            this.f2612q1 = -1;
        }
    }

    public void b2(int i5) {
        if (i5 > -1) {
            this.f2610o1 = -1.0f;
            this.f2611p1 = -1;
            this.f2612q1 = i5;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.e
    public String c0() {
        return "Guideline";
    }

    public void c2(float f6) {
        if (f6 > -1.0f) {
            this.f2610o1 = f6;
            this.f2611p1 = -1;
            this.f2612q1 = -1;
        }
    }

    public void d2(int i5) {
        c2(i5 / 100.0f);
    }

    public void e2(int i5) {
        this.f2615t1 = i5;
    }

    public void f2(int i5) {
        if (this.f2614s1 == i5) {
            return;
        }
        this.f2614s1 = i5;
        this.S.clear();
        if (this.f2614s1 == 1) {
            this.f2613r1 = this.J;
        } else {
            this.f2613r1 = this.K;
        }
        this.S.add(this.f2613r1);
        int length = this.R.length;
        for (int i6 = 0; i6 < length; i6++) {
            this.R[i6] = this.f2613r1;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.e
    public void g(androidx.constraintlayout.solver.g gVar, boolean z5) {
        f fVar = (f) U();
        if (fVar == null) {
            return;
        }
        d r5 = fVar.r(d.b.LEFT);
        d r6 = fVar.r(d.b.RIGHT);
        e eVar = this.V;
        boolean z6 = eVar != null && eVar.U[0] == e.b.WRAP_CONTENT;
        if (this.f2614s1 == 0) {
            r5 = fVar.r(d.b.TOP);
            r6 = fVar.r(d.b.BOTTOM);
            e eVar2 = this.V;
            z6 = eVar2 != null && eVar2.U[1] == e.b.WRAP_CONTENT;
        }
        if (this.f2616u1 && this.f2613r1.o()) {
            androidx.constraintlayout.solver.k u5 = gVar.u(this.f2613r1);
            gVar.f(u5, this.f2613r1.f());
            if (this.f2611p1 != -1) {
                if (z6) {
                    gVar.i(gVar.u(r6), u5, 0, 5);
                }
            } else if (this.f2612q1 != -1 && z6) {
                androidx.constraintlayout.solver.k u6 = gVar.u(r6);
                gVar.i(u5, gVar.u(r5), 0, 5);
                gVar.i(u6, u5, 0, 5);
            }
            this.f2616u1 = false;
            return;
        }
        if (this.f2611p1 != -1) {
            androidx.constraintlayout.solver.k u7 = gVar.u(this.f2613r1);
            gVar.e(u7, gVar.u(r5), this.f2611p1, 8);
            if (z6) {
                gVar.i(gVar.u(r6), u7, 0, 5);
                return;
            }
            return;
        }
        if (this.f2612q1 == -1) {
            if (this.f2610o1 != -1.0f) {
                gVar.d(androidx.constraintlayout.solver.g.w(gVar, gVar.u(this.f2613r1), gVar.u(r6), this.f2610o1));
                return;
            }
            return;
        }
        androidx.constraintlayout.solver.k u8 = gVar.u(this.f2613r1);
        androidx.constraintlayout.solver.k u9 = gVar.u(r6);
        gVar.e(u8, u9, -this.f2612q1, 8);
        if (z6) {
            gVar.i(u8, gVar.u(r5), 0, 5);
            gVar.i(u9, u8, 0, 5);
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.e
    public boolean h() {
        return true;
    }

    @Override // androidx.constraintlayout.solver.widgets.e
    public void n(e eVar, HashMap<e, e> hashMap) {
        super.n(eVar, hashMap);
        h hVar = (h) eVar;
        this.f2610o1 = hVar.f2610o1;
        this.f2611p1 = hVar.f2611p1;
        this.f2612q1 = hVar.f2612q1;
        f2(hVar.f2614s1);
    }

    @Override // androidx.constraintlayout.solver.widgets.e
    public d r(d.b bVar) {
        switch (a.f2617a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f2614s1 == 1) {
                    return this.f2613r1;
                }
                break;
            case 3:
            case 4:
                if (this.f2614s1 == 0) {
                    return this.f2613r1;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(bVar.name());
    }

    @Override // androidx.constraintlayout.solver.widgets.e
    public boolean x0() {
        return this.f2616u1;
    }

    @Override // androidx.constraintlayout.solver.widgets.e
    public boolean y0() {
        return this.f2616u1;
    }
}
