package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.e;
import java.util.HashMap;

/* compiled from: Guideline.java */
/* loaded from: classes.dex */
public class h extends e {
    public static final int I1 = 0;
    public static final int J1 = 1;
    public static final int K1 = 0;
    public static final int L1 = 1;
    public static final int M1 = 2;
    public static final int N1 = -1;
    protected float A1 = -1.0f;
    protected int B1 = -1;
    protected int C1 = -1;
    protected boolean D1 = true;
    private d E1 = this.R;
    private int F1 = 0;
    private int G1 = 0;
    private boolean H1;

    /* compiled from: Guideline.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23041a;

        static {
            int[] iArr = new int[d.b.values().length];
            f23041a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23041a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23041a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23041a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23041a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23041a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23041a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23041a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f23041a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public h() {
        this.Z.clear();
        this.Z.add(this.E1);
        int length = this.Y.length;
        for (int i4 = 0; i4 < length; i4++) {
            this.Y[i4] = this.E1;
        }
    }

    public void A2(int i4) {
        this.G1 = i4;
    }

    public void B2(int i4) {
        if (this.F1 == i4) {
            return;
        }
        this.F1 = i4;
        this.Z.clear();
        if (this.F1 == 1) {
            this.E1 = this.Q;
        } else {
            this.E1 = this.R;
        }
        this.Z.add(this.E1);
        int length = this.Y.length;
        for (int i5 = 0; i5 < length; i5++) {
            this.Y[i5] = this.E1;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public boolean G0() {
        return this.H1;
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public boolean H0() {
        return this.H1;
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public String f0() {
        return "Guideline";
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public void g(androidx.constraintlayout.core.f fVar, boolean z4) {
        f fVar2 = (f) U();
        if (fVar2 == null) {
            return;
        }
        d r4 = fVar2.r(d.b.LEFT);
        d r5 = fVar2.r(d.b.RIGHT);
        e eVar = this.f22938c0;
        boolean z5 = eVar != null && eVar.f22936b0[0] == e.b.WRAP_CONTENT;
        if (this.F1 == 0) {
            r4 = fVar2.r(d.b.TOP);
            r5 = fVar2.r(d.b.BOTTOM);
            e eVar2 = this.f22938c0;
            z5 = eVar2 != null && eVar2.f22936b0[1] == e.b.WRAP_CONTENT;
        }
        if (this.H1 && this.E1.o()) {
            androidx.constraintlayout.core.j u4 = fVar.u(this.E1);
            fVar.f(u4, this.E1.f());
            if (this.B1 != -1) {
                if (z5) {
                    fVar.i(fVar.u(r5), u4, 0, 5);
                }
            } else if (this.C1 != -1 && z5) {
                androidx.constraintlayout.core.j u5 = fVar.u(r5);
                fVar.i(u4, fVar.u(r4), 0, 5);
                fVar.i(u5, u4, 0, 5);
            }
            this.H1 = false;
            return;
        }
        if (this.B1 != -1) {
            androidx.constraintlayout.core.j u6 = fVar.u(this.E1);
            fVar.e(u6, fVar.u(r4), this.B1, 8);
            if (z5) {
                fVar.i(fVar.u(r5), u6, 0, 5);
                return;
            }
            return;
        }
        if (this.C1 == -1) {
            if (this.A1 != -1.0f) {
                fVar.d(androidx.constraintlayout.core.f.w(fVar, fVar.u(this.E1), fVar.u(r5), this.A1));
                return;
            }
            return;
        }
        androidx.constraintlayout.core.j u7 = fVar.u(this.E1);
        androidx.constraintlayout.core.j u10 = fVar.u(r5);
        fVar.e(u7, u10, -this.C1, 8);
        if (z5) {
            fVar.i(u7, fVar.u(r4), 0, 5);
            fVar.i(u10, u7, 0, 5);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public boolean h() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public void j2(androidx.constraintlayout.core.f fVar, boolean z4) {
        if (U() == null) {
            return;
        }
        int O = fVar.O(this.E1);
        if (this.F1 == 1) {
            f2(O);
            g2(0);
            y1(U().D());
            c2(0);
            return;
        }
        f2(0);
        g2(O);
        c2(U().m0());
        y1(0);
    }

    public void k2() {
        if (this.B1 != -1) {
            t2();
        } else if (this.A1 != -1.0f) {
            s2();
        } else if (this.C1 != -1) {
            r2();
        }
    }

    public d l2() {
        return this.E1;
    }

    public int m2() {
        return this.F1;
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public void n(e eVar, HashMap<e, e> hashMap) {
        super.n(eVar, hashMap);
        h hVar = (h) eVar;
        this.A1 = hVar.A1;
        this.B1 = hVar.B1;
        this.C1 = hVar.C1;
        this.D1 = hVar.D1;
        B2(hVar.F1);
    }

    public int n2() {
        return this.B1;
    }

    public int o2() {
        if (this.A1 != -1.0f) {
            return 0;
        }
        if (this.B1 != -1) {
            return 1;
        }
        return this.C1 != -1 ? 2 : -1;
    }

    public int p2() {
        return this.C1;
    }

    public float q2() {
        return this.A1;
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public d r(d.b bVar) {
        int i4 = a.f23041a[bVar.ordinal()];
        if (i4 == 1 || i4 == 2) {
            if (this.F1 == 1) {
                return this.E1;
            }
            return null;
        }
        if ((i4 == 3 || i4 == 4) && this.F1 == 0) {
            return this.E1;
        }
        return null;
    }

    void r2() {
        int o02 = o0();
        if (this.F1 == 0) {
            o02 = p0();
        }
        w2(o02);
    }

    void s2() {
        int m02 = U().m0() - o0();
        if (this.F1 == 0) {
            m02 = U().D() - p0();
        }
        x2(m02);
    }

    void t2() {
        float o02 = o0() / U().m0();
        if (this.F1 == 0) {
            o02 = p0() / U().D();
        }
        y2(o02);
    }

    public boolean u2() {
        return this.A1 != -1.0f && this.B1 == -1 && this.C1 == -1;
    }

    public void v2(int i4) {
        this.E1.A(i4);
        this.H1 = true;
    }

    public void w2(int i4) {
        if (i4 > -1) {
            this.A1 = -1.0f;
            this.B1 = i4;
            this.C1 = -1;
        }
    }

    public void x2(int i4) {
        if (i4 > -1) {
            this.A1 = -1.0f;
            this.B1 = -1;
            this.C1 = i4;
        }
    }

    public void y2(float f4) {
        if (f4 > -1.0f) {
            this.A1 = f4;
            this.B1 = -1;
            this.C1 = -1;
        }
    }

    public void z2(int i4) {
        y2(i4 / 100.0f);
    }
}
