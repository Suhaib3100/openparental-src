package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.analyzer.o;
import androidx.constraintlayout.solver.widgets.analyzer.q;
import androidx.constraintlayout.solver.widgets.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: ConstraintWidget.java */
/* loaded from: classes.dex */
public class e {
    private static final boolean M0 = false;
    protected static final int N0 = 1;
    protected static final int O0 = 2;
    private static final boolean P0 = false;
    public static final int Q0 = 0;
    public static final int R0 = 1;
    public static final int S0 = 2;
    public static final int T0 = 3;
    public static final int U0 = 4;
    public static final int V0 = -1;
    public static final int W0 = 0;
    public static final int X0 = 1;
    public static final int Y0 = 2;
    public static final int Z0 = 0;

    /* renamed from: a1, reason: collision with root package name */
    public static final int f2496a1 = 4;

    /* renamed from: b1, reason: collision with root package name */
    public static final int f2497b1 = 8;

    /* renamed from: c1, reason: collision with root package name */
    public static final int f2498c1 = 0;

    /* renamed from: d1, reason: collision with root package name */
    public static final int f2499d1 = 1;

    /* renamed from: e1, reason: collision with root package name */
    public static final int f2500e1 = 2;

    /* renamed from: f1, reason: collision with root package name */
    private static final int f2501f1 = -2;

    /* renamed from: g1, reason: collision with root package name */
    public static final int f2502g1 = 0;

    /* renamed from: h1, reason: collision with root package name */
    public static final int f2503h1 = 1;

    /* renamed from: i1, reason: collision with root package name */
    public static final int f2504i1 = 2;

    /* renamed from: j1, reason: collision with root package name */
    public static final int f2505j1 = 3;

    /* renamed from: k1, reason: collision with root package name */
    public static final int f2506k1 = 4;

    /* renamed from: l1, reason: collision with root package name */
    static final int f2507l1 = 0;

    /* renamed from: m1, reason: collision with root package name */
    static final int f2508m1 = 1;

    /* renamed from: n1, reason: collision with root package name */
    public static float f2509n1 = 0.5f;
    int A;
    boolean A0;
    float B;
    int B0;
    private int[] C;
    int C0;
    private float D;
    boolean D0;
    private boolean E;
    boolean E0;
    private boolean F;
    public float[] F0;
    private boolean G;
    protected e[] G0;
    private int H;
    protected e[] H0;
    private int I;
    e I0;
    public d J;
    e J0;
    public d K;
    public int K0;
    public d L;
    public int L0;
    public d M;
    public d N;
    d O;
    d P;
    public d Q;
    public d[] R;
    protected ArrayList<d> S;
    private boolean[] T;
    public b[] U;
    public e V;
    int W;
    int X;
    public float Y;
    protected int Z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f2510a;

    /* renamed from: a0, reason: collision with root package name */
    protected int f2511a0;

    /* renamed from: b, reason: collision with root package name */
    public q[] f2512b;

    /* renamed from: b0, reason: collision with root package name */
    protected int f2513b0;

    /* renamed from: c, reason: collision with root package name */
    public androidx.constraintlayout.solver.widgets.analyzer.c f2514c;

    /* renamed from: c0, reason: collision with root package name */
    int f2515c0;

    /* renamed from: d, reason: collision with root package name */
    public androidx.constraintlayout.solver.widgets.analyzer.c f2516d;

    /* renamed from: d0, reason: collision with root package name */
    int f2517d0;

    /* renamed from: e, reason: collision with root package name */
    public androidx.constraintlayout.solver.widgets.analyzer.m f2518e;

    /* renamed from: e0, reason: collision with root package name */
    protected int f2519e0;

    /* renamed from: f, reason: collision with root package name */
    public o f2520f;

    /* renamed from: f0, reason: collision with root package name */
    protected int f2521f0;

    /* renamed from: g, reason: collision with root package name */
    public boolean[] f2522g;

    /* renamed from: g0, reason: collision with root package name */
    int f2523g0;

    /* renamed from: h, reason: collision with root package name */
    boolean f2524h;

    /* renamed from: h0, reason: collision with root package name */
    protected int f2525h0;

    /* renamed from: i, reason: collision with root package name */
    private boolean f2526i;

    /* renamed from: i0, reason: collision with root package name */
    protected int f2527i0;

    /* renamed from: j, reason: collision with root package name */
    private boolean f2528j;

    /* renamed from: j0, reason: collision with root package name */
    float f2529j0;

    /* renamed from: k, reason: collision with root package name */
    private boolean f2530k;

    /* renamed from: k0, reason: collision with root package name */
    float f2531k0;

    /* renamed from: l, reason: collision with root package name */
    private boolean f2532l;

    /* renamed from: l0, reason: collision with root package name */
    private Object f2533l0;

    /* renamed from: m, reason: collision with root package name */
    private boolean f2534m;

    /* renamed from: m0, reason: collision with root package name */
    private int f2535m0;

    /* renamed from: n, reason: collision with root package name */
    public int f2536n;

    /* renamed from: n0, reason: collision with root package name */
    private int f2537n0;

    /* renamed from: o, reason: collision with root package name */
    public int f2538o;

    /* renamed from: o0, reason: collision with root package name */
    private String f2539o0;

    /* renamed from: p, reason: collision with root package name */
    public int f2540p;

    /* renamed from: p0, reason: collision with root package name */
    private String f2541p0;

    /* renamed from: q, reason: collision with root package name */
    public int f2542q;

    /* renamed from: q0, reason: collision with root package name */
    int f2543q0;

    /* renamed from: r, reason: collision with root package name */
    public int[] f2544r;

    /* renamed from: r0, reason: collision with root package name */
    int f2545r0;

    /* renamed from: s, reason: collision with root package name */
    public int f2546s;

    /* renamed from: s0, reason: collision with root package name */
    int f2547s0;

    /* renamed from: t, reason: collision with root package name */
    public int f2548t;

    /* renamed from: t0, reason: collision with root package name */
    int f2549t0;

    /* renamed from: u, reason: collision with root package name */
    public float f2550u;

    /* renamed from: u0, reason: collision with root package name */
    boolean f2551u0;

    /* renamed from: v, reason: collision with root package name */
    public int f2552v;

    /* renamed from: v0, reason: collision with root package name */
    boolean f2553v0;

    /* renamed from: w, reason: collision with root package name */
    public int f2554w;

    /* renamed from: w0, reason: collision with root package name */
    boolean f2555w0;

    /* renamed from: x, reason: collision with root package name */
    public float f2556x;

    /* renamed from: x0, reason: collision with root package name */
    boolean f2557x0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2558y;

    /* renamed from: y0, reason: collision with root package name */
    boolean f2559y0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2560z;

    /* renamed from: z0, reason: collision with root package name */
    boolean f2561z0;

    /* compiled from: ConstraintWidget.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2562a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f2563b;

        static {
            int[] iArr = new int[b.values().length];
            f2563b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2563b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2563b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2563b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f2562a = iArr2;
            try {
                iArr2[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2562a[d.b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2562a[d.b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2562a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2562a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2562a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2562a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2562a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2562a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* compiled from: ConstraintWidget.java */
    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        this.f2510a = false;
        this.f2512b = new q[2];
        this.f2518e = null;
        this.f2520f = null;
        this.f2522g = new boolean[]{true, true};
        this.f2524h = false;
        this.f2526i = true;
        this.f2528j = false;
        this.f2530k = true;
        this.f2532l = false;
        this.f2534m = false;
        this.f2536n = -1;
        this.f2538o = -1;
        this.f2540p = 0;
        this.f2542q = 0;
        this.f2544r = new int[2];
        this.f2546s = 0;
        this.f2548t = 0;
        this.f2550u = 1.0f;
        this.f2552v = 0;
        this.f2554w = 0;
        this.f2556x = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = 0.0f;
        this.E = false;
        this.G = false;
        this.H = 0;
        this.I = 0;
        this.J = new d(this, d.b.LEFT);
        this.K = new d(this, d.b.TOP);
        this.L = new d(this, d.b.RIGHT);
        this.M = new d(this, d.b.BOTTOM);
        this.N = new d(this, d.b.BASELINE);
        this.O = new d(this, d.b.CENTER_X);
        this.P = new d(this, d.b.CENTER_Y);
        d dVar = new d(this, d.b.CENTER);
        this.Q = dVar;
        this.R = new d[]{this.J, this.L, this.K, this.M, this.N, dVar};
        this.S = new ArrayList<>();
        this.T = new boolean[2];
        b bVar = b.FIXED;
        this.U = new b[]{bVar, bVar};
        this.V = null;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.f2511a0 = 0;
        this.f2513b0 = 0;
        this.f2515c0 = 0;
        this.f2517d0 = 0;
        this.f2519e0 = 0;
        this.f2521f0 = 0;
        this.f2523g0 = 0;
        float f6 = f2509n1;
        this.f2529j0 = f6;
        this.f2531k0 = f6;
        this.f2535m0 = 0;
        this.f2537n0 = 0;
        this.f2539o0 = null;
        this.f2541p0 = null;
        this.A0 = false;
        this.B0 = 0;
        this.C0 = 0;
        this.F0 = new float[]{-1.0f, -1.0f};
        this.G0 = new e[]{null, null};
        this.H0 = new e[]{null, null};
        this.I0 = null;
        this.J0 = null;
        this.K0 = -1;
        this.L0 = -1;
        d();
    }

    private void d() {
        this.S.add(this.J);
        this.S.add(this.K);
        this.S.add(this.L);
        this.S.add(this.M);
        this.S.add(this.O);
        this.S.add(this.P);
        this.S.add(this.Q);
        this.S.add(this.N);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x04f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x04b7 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i(androidx.constraintlayout.solver.g r32, boolean r33, boolean r34, boolean r35, boolean r36, androidx.constraintlayout.solver.k r37, androidx.constraintlayout.solver.k r38, androidx.constraintlayout.solver.widgets.e.b r39, boolean r40, androidx.constraintlayout.solver.widgets.d r41, androidx.constraintlayout.solver.widgets.d r42, int r43, int r44, int r45, int r46, float r47, boolean r48, boolean r49, boolean r50, boolean r51, boolean r52, int r53, int r54, int r55, int r56, float r57, boolean r58) {
        /*
            Method dump skipped, instructions count: 1329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.e.i(androidx.constraintlayout.solver.g, boolean, boolean, boolean, boolean, androidx.constraintlayout.solver.k, androidx.constraintlayout.solver.k, androidx.constraintlayout.solver.widgets.e$b, boolean, androidx.constraintlayout.solver.widgets.d, androidx.constraintlayout.solver.widgets.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    private boolean q0(int i5) {
        d dVar;
        d dVar2;
        int i6 = i5 * 2;
        d[] dVarArr = this.R;
        d dVar3 = dVarArr[i6];
        d dVar4 = dVar3.f2491f;
        return (dVar4 == null || dVar4.f2491f == dVar3 || (dVar2 = (dVar = dVarArr[i6 + 1]).f2491f) == null || dVar2.f2491f != dVar) ? false : true;
    }

    public float A() {
        return this.Y;
    }

    public boolean A0() {
        return this.f2542q == 0 && this.Y == 0.0f && this.f2552v == 0 && this.f2554w == 0 && this.U[1] == b.MATCH_CONSTRAINT;
    }

    public void A1(float f6) {
        this.f2531k0 = f6;
    }

    public int B() {
        return this.Z;
    }

    public boolean B0() {
        return this.f2540p == 0 && this.Y == 0.0f && this.f2546s == 0 && this.f2548t == 0 && this.U[0] == b.MATCH_CONSTRAINT;
    }

    public void B1(int i5) {
        this.C0 = i5;
    }

    public boolean C() {
        return this.E;
    }

    public boolean C0() {
        return this.f2558y;
    }

    public void C1(int i5, int i6) {
        this.f2513b0 = i5;
        int i7 = i6 - i5;
        this.X = i7;
        int i8 = this.f2527i0;
        if (i7 < i8) {
            this.X = i8;
        }
    }

    public int D() {
        if (this.f2537n0 == 8) {
            return 0;
        }
        return this.X;
    }

    public boolean D0(int i5) {
        char c6 = i5 == 0 ? (char) 1 : (char) 0;
        b[] bVarArr = this.U;
        b bVar = bVarArr[i5];
        b bVar2 = bVarArr[c6];
        b bVar3 = b.MATCH_CONSTRAINT;
        return bVar == bVar3 && bVar2 == bVar3;
    }

    public void D1(b bVar) {
        this.U[1] = bVar;
    }

    public float E() {
        return this.f2529j0;
    }

    public boolean E0() {
        b[] bVarArr = this.U;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    public void E1(int i5, int i6, int i7, float f6) {
        this.f2542q = i5;
        this.f2552v = i6;
        if (i7 == Integer.MAX_VALUE) {
            i7 = 0;
        }
        this.f2554w = i7;
        this.f2556x = f6;
        if (f6 <= 0.0f || f6 >= 1.0f || i5 != 0) {
            return;
        }
        this.f2542q = 2;
    }

    public e F() {
        if (!s0()) {
            return null;
        }
        e eVar = this;
        e eVar2 = null;
        while (eVar2 == null && eVar != null) {
            d r5 = eVar.r(d.b.LEFT);
            d k5 = r5 == null ? null : r5.k();
            e i5 = k5 == null ? null : k5.i();
            if (i5 == U()) {
                return eVar;
            }
            d k6 = i5 == null ? null : i5.r(d.b.RIGHT).k();
            if (k6 == null || k6.i() == eVar) {
                eVar = i5;
            } else {
                eVar2 = eVar;
            }
        }
        return eVar2;
    }

    public void F0() {
        this.J.x();
        this.K.x();
        this.L.x();
        this.M.x();
        this.N.x();
        this.O.x();
        this.P.x();
        this.Q.x();
        this.V = null;
        this.D = 0.0f;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.f2511a0 = 0;
        this.f2513b0 = 0;
        this.f2519e0 = 0;
        this.f2521f0 = 0;
        this.f2523g0 = 0;
        this.f2525h0 = 0;
        this.f2527i0 = 0;
        float f6 = f2509n1;
        this.f2529j0 = f6;
        this.f2531k0 = f6;
        b[] bVarArr = this.U;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f2533l0 = null;
        this.f2535m0 = 0;
        this.f2537n0 = 0;
        this.f2541p0 = null;
        this.f2559y0 = false;
        this.f2561z0 = false;
        this.B0 = 0;
        this.C0 = 0;
        this.D0 = false;
        this.E0 = false;
        float[] fArr = this.F0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f2536n = -1;
        this.f2538o = -1;
        int[] iArr = this.C;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f2540p = 0;
        this.f2542q = 0;
        this.f2550u = 1.0f;
        this.f2556x = 1.0f;
        this.f2548t = Integer.MAX_VALUE;
        this.f2554w = Integer.MAX_VALUE;
        this.f2546s = 0;
        this.f2552v = 0;
        this.f2524h = false;
        this.A = -1;
        this.B = 1.0f;
        this.A0 = false;
        boolean[] zArr = this.f2522g;
        zArr[0] = true;
        zArr[1] = true;
        this.G = false;
        boolean[] zArr2 = this.T;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f2526i = true;
    }

    public void F1(float f6) {
        this.F0[1] = f6;
    }

    public int G() {
        return this.B0;
    }

    public void G0() {
        I0();
        A1(f2509n1);
        f1(f2509n1);
    }

    public void G1(int i5) {
        this.f2537n0 = i5;
    }

    public b H() {
        return this.U[0];
    }

    public void H0(d dVar) {
        if (U() != null && (U() instanceof f) && ((f) U()).o2()) {
            return;
        }
        d r5 = r(d.b.LEFT);
        d r6 = r(d.b.RIGHT);
        d r7 = r(d.b.TOP);
        d r8 = r(d.b.BOTTOM);
        d r9 = r(d.b.CENTER);
        d r10 = r(d.b.CENTER_X);
        d r11 = r(d.b.CENTER_Y);
        if (dVar == r9) {
            if (r5.p() && r6.p() && r5.k() == r6.k()) {
                r5.x();
                r6.x();
            }
            if (r7.p() && r8.p() && r7.k() == r8.k()) {
                r7.x();
                r8.x();
            }
            this.f2529j0 = 0.5f;
            this.f2531k0 = 0.5f;
        } else if (dVar == r10) {
            if (r5.p() && r6.p() && r5.k().i() == r6.k().i()) {
                r5.x();
                r6.x();
            }
            this.f2529j0 = 0.5f;
        } else if (dVar == r11) {
            if (r7.p() && r8.p() && r7.k().i() == r8.k().i()) {
                r7.x();
                r8.x();
            }
            this.f2531k0 = 0.5f;
        } else if (dVar == r5 || dVar == r6) {
            if (r5.p() && r5.k() == r6.k()) {
                r9.x();
            }
        } else if ((dVar == r7 || dVar == r8) && r7.p() && r7.k() == r8.k()) {
            r9.x();
        }
        dVar.x();
    }

    public void H1(int i5) {
        this.W = i5;
        int i6 = this.f2525h0;
        if (i5 < i6) {
            this.W = i6;
        }
    }

    public int I() {
        d dVar = this.J;
        int i5 = dVar != null ? 0 + dVar.f2492g : 0;
        d dVar2 = this.L;
        return dVar2 != null ? i5 + dVar2.f2492g : i5;
    }

    public void I0() {
        e U = U();
        if (U != null && (U instanceof f) && ((f) U()).o2()) {
            return;
        }
        int size = this.S.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.S.get(i5).x();
        }
    }

    public void I1(boolean z5) {
        this.f2558y = z5;
    }

    public int J() {
        return this.H;
    }

    public void J0() {
        this.f2532l = false;
        this.f2534m = false;
        int size = this.S.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.S.get(i5).y();
        }
    }

    public void J1(int i5) {
        this.f2511a0 = i5;
    }

    public int K() {
        return this.I;
    }

    public void K0(androidx.constraintlayout.solver.c cVar) {
        this.J.z(cVar);
        this.K.z(cVar);
        this.L.z(cVar);
        this.M.z(cVar);
        this.N.z(cVar);
        this.Q.z(cVar);
        this.O.z(cVar);
        this.P.z(cVar);
    }

    public void K1(int i5) {
        this.f2513b0 = i5;
    }

    public int L() {
        return k0();
    }

    public void L0(int i5) {
        this.f2523g0 = i5;
        this.E = i5 > 0;
    }

    public void L1(boolean z5, boolean z6, boolean z7, boolean z8) {
        if (this.A == -1) {
            if (z7 && !z8) {
                this.A = 0;
            } else if (!z7 && z8) {
                this.A = 1;
                if (this.Z == -1) {
                    this.B = 1.0f / this.B;
                }
            }
        }
        if (this.A == 0 && (!this.K.p() || !this.M.p())) {
            this.A = 1;
        } else if (this.A == 1 && (!this.J.p() || !this.L.p())) {
            this.A = 0;
        }
        if (this.A == -1 && (!this.K.p() || !this.M.p() || !this.J.p() || !this.L.p())) {
            if (this.K.p() && this.M.p()) {
                this.A = 0;
            } else if (this.J.p() && this.L.p()) {
                this.B = 1.0f / this.B;
                this.A = 1;
            }
        }
        if (this.A == -1) {
            int i5 = this.f2546s;
            if (i5 > 0 && this.f2552v == 0) {
                this.A = 0;
            } else {
                if (i5 != 0 || this.f2552v <= 0) {
                    return;
                }
                this.B = 1.0f / this.B;
                this.A = 1;
            }
        }
    }

    public int M(int i5) {
        if (i5 == 0) {
            return j0();
        }
        if (i5 == 1) {
            return D();
        }
        return 0;
    }

    public void M0(Object obj) {
        this.f2533l0 = obj;
    }

    public void M1(boolean z5, boolean z6) {
        int i5;
        int i6;
        boolean m5 = z5 & this.f2518e.m();
        boolean m6 = z6 & this.f2520f.m();
        androidx.constraintlayout.solver.widgets.analyzer.m mVar = this.f2518e;
        int i7 = mVar.f2456h.f2405g;
        o oVar = this.f2520f;
        int i8 = oVar.f2456h.f2405g;
        int i9 = mVar.f2457i.f2405g;
        int i10 = oVar.f2457i.f2405g;
        int i11 = i10 - i8;
        if (i9 - i7 < 0 || i11 < 0 || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE || i8 == Integer.MIN_VALUE || i8 == Integer.MAX_VALUE || i9 == Integer.MIN_VALUE || i9 == Integer.MAX_VALUE || i10 == Integer.MIN_VALUE || i10 == Integer.MAX_VALUE) {
            i9 = 0;
            i7 = 0;
            i10 = 0;
            i8 = 0;
        }
        int i12 = i9 - i7;
        int i13 = i10 - i8;
        if (m5) {
            this.f2511a0 = i7;
        }
        if (m6) {
            this.f2513b0 = i8;
        }
        if (this.f2537n0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        if (m5) {
            if (this.U[0] == b.FIXED && i12 < (i6 = this.W)) {
                i12 = i6;
            }
            this.W = i12;
            int i14 = this.f2525h0;
            if (i12 < i14) {
                this.W = i14;
            }
        }
        if (m6) {
            if (this.U[1] == b.FIXED && i13 < (i5 = this.X)) {
                i13 = i5;
            }
            this.X = i13;
            int i15 = this.f2527i0;
            if (i13 < i15) {
                this.X = i15;
            }
        }
    }

    public int N() {
        return this.C[1];
    }

    public void N0(int i5) {
        if (i5 >= 0) {
            this.f2535m0 = i5;
        } else {
            this.f2535m0 = 0;
        }
    }

    public void N1(androidx.constraintlayout.solver.g gVar, boolean z5) {
        o oVar;
        androidx.constraintlayout.solver.widgets.analyzer.m mVar;
        int O = gVar.O(this.J);
        int O2 = gVar.O(this.K);
        int O3 = gVar.O(this.L);
        int O4 = gVar.O(this.M);
        if (z5 && (mVar = this.f2518e) != null) {
            androidx.constraintlayout.solver.widgets.analyzer.g gVar2 = mVar.f2456h;
            if (gVar2.f2408j) {
                androidx.constraintlayout.solver.widgets.analyzer.g gVar3 = mVar.f2457i;
                if (gVar3.f2408j) {
                    O = gVar2.f2405g;
                    O3 = gVar3.f2405g;
                }
            }
        }
        if (z5 && (oVar = this.f2520f) != null) {
            androidx.constraintlayout.solver.widgets.analyzer.g gVar4 = oVar.f2456h;
            if (gVar4.f2408j) {
                androidx.constraintlayout.solver.widgets.analyzer.g gVar5 = oVar.f2457i;
                if (gVar5.f2408j) {
                    O2 = gVar4.f2405g;
                    O4 = gVar5.f2405g;
                }
            }
        }
        int i5 = O4 - O2;
        if (O3 - O < 0 || i5 < 0 || O == Integer.MIN_VALUE || O == Integer.MAX_VALUE || O2 == Integer.MIN_VALUE || O2 == Integer.MAX_VALUE || O3 == Integer.MIN_VALUE || O3 == Integer.MAX_VALUE || O4 == Integer.MIN_VALUE || O4 == Integer.MAX_VALUE) {
            O = 0;
            O4 = 0;
            O2 = 0;
            O3 = 0;
        }
        a1(O, O2, O3, O4);
    }

    public int O() {
        return this.C[0];
    }

    public void O0(String str) {
        this.f2539o0 = str;
    }

    public int P() {
        return this.f2527i0;
    }

    public void P0(androidx.constraintlayout.solver.g gVar, String str) {
        this.f2539o0 = str;
        androidx.constraintlayout.solver.k u5 = gVar.u(this.J);
        androidx.constraintlayout.solver.k u6 = gVar.u(this.K);
        androidx.constraintlayout.solver.k u7 = gVar.u(this.L);
        androidx.constraintlayout.solver.k u8 = gVar.u(this.M);
        u5.i(str + ".left");
        u6.i(str + ".top");
        u7.i(str + ".right");
        u8.i(str + ".bottom");
        gVar.u(this.N).i(str + ".baseline");
    }

    public int Q() {
        return this.f2525h0;
    }

    public void Q0(int i5, int i6) {
        this.W = i5;
        int i7 = this.f2525h0;
        if (i5 < i7) {
            this.W = i7;
        }
        this.X = i6;
        int i8 = this.f2527i0;
        if (i6 < i8) {
            this.X = i8;
        }
    }

    public e R(int i5) {
        d dVar;
        d dVar2;
        if (i5 != 0) {
            if (i5 == 1 && (dVar2 = (dVar = this.M).f2491f) != null && dVar2.f2491f == dVar) {
                return dVar2.f2489d;
            }
            return null;
        }
        d dVar3 = this.L;
        d dVar4 = dVar3.f2491f;
        if (dVar4 == null || dVar4.f2491f != dVar3) {
            return null;
        }
        return dVar4.f2489d;
    }

    public void R0(float f6, int i5) {
        this.Y = f6;
        this.Z = i5;
    }

    public int S() {
        int i5;
        int i6 = this.X;
        if (this.U[1] != b.MATCH_CONSTRAINT) {
            return i6;
        }
        if (this.f2542q == 1) {
            i5 = Math.max(this.f2552v, i6);
        } else {
            i5 = this.f2552v;
            if (i5 > 0) {
                this.X = i5;
            } else {
                i5 = 0;
            }
        }
        int i7 = this.f2554w;
        return (i7 <= 0 || i7 >= i5) ? i5 : i7;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0086 -> B:31:0x0087). Please report as a decompilation issue!!! */
    public void S0(String str) {
        float f6;
        int i5 = 0;
        if (str == null || str.length() == 0) {
            this.Y = 0.0f;
            return;
        }
        int length = str.length();
        int indexOf = str.indexOf(44);
        int i6 = -1;
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            i6 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
            r3 = indexOf + 1;
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 < 0 || indexOf2 >= length - 1) {
            String substring2 = str.substring(r3);
            if (substring2.length() > 0) {
                f6 = Float.parseFloat(substring2);
            }
            f6 = i5;
        } else {
            String substring3 = str.substring(r3, indexOf2);
            String substring4 = str.substring(indexOf2 + 1);
            if (substring3.length() > 0 && substring4.length() > 0) {
                float parseFloat = Float.parseFloat(substring3);
                float parseFloat2 = Float.parseFloat(substring4);
                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                    f6 = i6 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                }
            }
            f6 = i5;
        }
        i5 = (f6 > i5 ? 1 : (f6 == i5 ? 0 : -1));
        if (i5 > 0) {
            this.Y = f6;
            this.Z = i6;
        }
    }

    public int T() {
        int i5;
        int i6 = this.W;
        if (this.U[0] != b.MATCH_CONSTRAINT) {
            return i6;
        }
        if (this.f2540p == 1) {
            i5 = Math.max(this.f2546s, i6);
        } else {
            i5 = this.f2546s;
            if (i5 > 0) {
                this.W = i5;
            } else {
                i5 = 0;
            }
        }
        int i7 = this.f2548t;
        return (i7 <= 0 || i7 >= i5) ? i5 : i7;
    }

    public void T0(int i5) {
        if (this.E) {
            int i6 = i5 - this.f2523g0;
            int i7 = this.X + i6;
            this.f2513b0 = i6;
            this.K.A(i6);
            this.M.A(i7);
            this.N.A(i5);
            this.f2534m = true;
        }
    }

    public e U() {
        return this.V;
    }

    public void U0(int i5, int i6, int i7, int i8, int i9, int i10) {
        a1(i5, i6, i7, i8);
        L0(i9);
        if (i10 == 0) {
            this.f2532l = true;
            this.f2534m = false;
        } else if (i10 == 1) {
            this.f2532l = false;
            this.f2534m = true;
        } else if (i10 == 2) {
            this.f2532l = true;
            this.f2534m = true;
        } else {
            this.f2532l = false;
            this.f2534m = false;
        }
    }

    public e V(int i5) {
        d dVar;
        d dVar2;
        if (i5 != 0) {
            if (i5 == 1 && (dVar2 = (dVar = this.K).f2491f) != null && dVar2.f2491f == dVar) {
                return dVar2.f2489d;
            }
            return null;
        }
        d dVar3 = this.J;
        d dVar4 = dVar3.f2491f;
        if (dVar4 == null || dVar4.f2491f != dVar3) {
            return null;
        }
        return dVar4.f2489d;
    }

    public void V0(int i5, int i6) {
        this.J.A(i5);
        this.L.A(i6);
        this.f2511a0 = i5;
        this.W = i6 - i5;
        this.f2532l = true;
    }

    int W(int i5) {
        if (i5 == 0) {
            return this.f2515c0;
        }
        if (i5 == 1) {
            return this.f2517d0;
        }
        return 0;
    }

    public void W0(int i5) {
        this.J.A(i5);
        this.f2511a0 = i5;
    }

    public int X() {
        return k0() + this.W;
    }

    public void X0(int i5) {
        this.K.A(i5);
        this.f2513b0 = i5;
    }

    protected int Y() {
        return this.f2511a0 + this.f2519e0;
    }

    public void Y0(int i5, int i6) {
        this.K.A(i5);
        this.M.A(i6);
        this.f2513b0 = i5;
        this.X = i6 - i5;
        if (this.E) {
            this.N.A(i5 + this.f2523g0);
        }
        this.f2534m = true;
    }

    protected int Z() {
        return this.f2513b0 + this.f2521f0;
    }

    public void Z0(int i5, int i6, int i7) {
        if (i7 == 0) {
            h1(i5, i6);
        } else if (i7 == 1) {
            C1(i5, i6);
        }
    }

    public q a0(int i5) {
        if (i5 == 0) {
            return this.f2518e;
        }
        if (i5 == 1) {
            return this.f2520f;
        }
        return null;
    }

    public void a1(int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        int i11 = i7 - i5;
        int i12 = i8 - i6;
        this.f2511a0 = i5;
        this.f2513b0 = i6;
        if (this.f2537n0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        b[] bVarArr = this.U;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i11 < (i10 = this.W)) {
            i11 = i10;
        }
        if (bVarArr[1] == bVar2 && i12 < (i9 = this.X)) {
            i12 = i9;
        }
        this.W = i11;
        this.X = i12;
        int i13 = this.f2527i0;
        if (i12 < i13) {
            this.X = i13;
        }
        int i14 = this.f2525h0;
        if (i11 < i14) {
            this.W = i14;
        }
    }

    public int b0() {
        return l0();
    }

    public void b1(d.b bVar, int i5) {
        int i6 = a.f2562a[bVar.ordinal()];
        if (i6 == 1) {
            this.J.f2493h = i5;
            return;
        }
        if (i6 == 2) {
            this.K.f2493h = i5;
        } else if (i6 == 3) {
            this.L.f2493h = i5;
        } else {
            if (i6 != 4) {
                return;
            }
            this.M.f2493h = i5;
        }
    }

    public String c0() {
        return this.f2541p0;
    }

    public void c1(boolean z5) {
        this.E = z5;
    }

    public float d0() {
        return this.f2531k0;
    }

    public void d1(int i5) {
        this.X = i5;
        int i6 = this.f2527i0;
        if (i5 < i6) {
            this.X = i6;
        }
    }

    public void e(f fVar, androidx.constraintlayout.solver.g gVar, HashSet<e> hashSet, int i5, boolean z5) {
        if (z5) {
            if (!hashSet.contains(this)) {
                return;
            }
            k.a(fVar, gVar, this);
            hashSet.remove(this);
            g(gVar, fVar.w2(64));
        }
        if (i5 == 0) {
            HashSet<d> e6 = this.J.e();
            if (e6 != null) {
                Iterator<d> it = e6.iterator();
                while (it.hasNext()) {
                    it.next().f2489d.e(fVar, gVar, hashSet, i5, true);
                }
            }
            HashSet<d> e7 = this.L.e();
            if (e7 != null) {
                Iterator<d> it2 = e7.iterator();
                while (it2.hasNext()) {
                    it2.next().f2489d.e(fVar, gVar, hashSet, i5, true);
                }
                return;
            }
            return;
        }
        HashSet<d> e8 = this.K.e();
        if (e8 != null) {
            Iterator<d> it3 = e8.iterator();
            while (it3.hasNext()) {
                it3.next().f2489d.e(fVar, gVar, hashSet, i5, true);
            }
        }
        HashSet<d> e9 = this.M.e();
        if (e9 != null) {
            Iterator<d> it4 = e9.iterator();
            while (it4.hasNext()) {
                it4.next().f2489d.e(fVar, gVar, hashSet, i5, true);
            }
        }
        HashSet<d> e10 = this.N.e();
        if (e10 != null) {
            Iterator<d> it5 = e10.iterator();
            while (it5.hasNext()) {
                it5.next().f2489d.e(fVar, gVar, hashSet, i5, true);
            }
        }
    }

    public e e0() {
        if (!u0()) {
            return null;
        }
        e eVar = this;
        e eVar2 = null;
        while (eVar2 == null && eVar != null) {
            d r5 = eVar.r(d.b.TOP);
            d k5 = r5 == null ? null : r5.k();
            e i5 = k5 == null ? null : k5.i();
            if (i5 == U()) {
                return eVar;
            }
            d k6 = i5 == null ? null : i5.r(d.b.BOTTOM).k();
            if (k6 == null || k6.i() == eVar) {
                eVar = i5;
            } else {
                eVar2 = eVar;
            }
        }
        return eVar2;
    }

    public void e1(boolean z5) {
        this.f2560z = z5;
    }

    boolean f() {
        return (this instanceof m) || (this instanceof h);
    }

    public int f0() {
        return this.C0;
    }

    public void f1(float f6) {
        this.f2529j0 = f6;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x02da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(androidx.constraintlayout.solver.g r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 1514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.e.g(androidx.constraintlayout.solver.g, boolean):void");
    }

    public b g0() {
        return this.U[1];
    }

    public void g1(int i5) {
        this.B0 = i5;
    }

    public boolean h() {
        return this.f2537n0 != 8;
    }

    public int h0() {
        int i5 = this.J != null ? 0 + this.K.f2492g : 0;
        return this.L != null ? i5 + this.M.f2492g : i5;
    }

    public void h1(int i5, int i6) {
        this.f2511a0 = i5;
        int i7 = i6 - i5;
        this.W = i7;
        int i8 = this.f2525h0;
        if (i7 < i8) {
            this.W = i8;
        }
    }

    public int i0() {
        return this.f2537n0;
    }

    public void i1(b bVar) {
        this.U[0] = bVar;
    }

    public void j(d.b bVar, e eVar, d.b bVar2) {
        k(bVar, eVar, bVar2, 0);
    }

    public int j0() {
        if (this.f2537n0 == 8) {
            return 0;
        }
        return this.W;
    }

    public void j1(int i5, int i6, int i7, float f6) {
        this.f2540p = i5;
        this.f2546s = i6;
        if (i7 == Integer.MAX_VALUE) {
            i7 = 0;
        }
        this.f2548t = i7;
        this.f2550u = f6;
        if (f6 <= 0.0f || f6 >= 1.0f || i5 != 0) {
            return;
        }
        this.f2540p = 2;
    }

    public void k(d.b bVar, e eVar, d.b bVar2, int i5) {
        d.b bVar3;
        d.b bVar4;
        boolean z5;
        d.b bVar5 = d.b.CENTER;
        if (bVar == bVar5) {
            if (bVar2 != bVar5) {
                d.b bVar6 = d.b.LEFT;
                if (bVar2 == bVar6 || bVar2 == d.b.RIGHT) {
                    k(bVar6, eVar, bVar2, 0);
                    k(d.b.RIGHT, eVar, bVar2, 0);
                    r(bVar5).a(eVar.r(bVar2), 0);
                    return;
                }
                d.b bVar7 = d.b.TOP;
                if (bVar2 == bVar7 || bVar2 == d.b.BOTTOM) {
                    k(bVar7, eVar, bVar2, 0);
                    k(d.b.BOTTOM, eVar, bVar2, 0);
                    r(bVar5).a(eVar.r(bVar2), 0);
                    return;
                }
                return;
            }
            d.b bVar8 = d.b.LEFT;
            d r5 = r(bVar8);
            d.b bVar9 = d.b.RIGHT;
            d r6 = r(bVar9);
            d.b bVar10 = d.b.TOP;
            d r7 = r(bVar10);
            d.b bVar11 = d.b.BOTTOM;
            d r8 = r(bVar11);
            boolean z6 = true;
            if ((r5 == null || !r5.p()) && (r6 == null || !r6.p())) {
                k(bVar8, eVar, bVar8, 0);
                k(bVar9, eVar, bVar9, 0);
                z5 = true;
            } else {
                z5 = false;
            }
            if ((r7 == null || !r7.p()) && (r8 == null || !r8.p())) {
                k(bVar10, eVar, bVar10, 0);
                k(bVar11, eVar, bVar11, 0);
            } else {
                z6 = false;
            }
            if (z5 && z6) {
                r(bVar5).a(eVar.r(bVar5), 0);
                return;
            }
            if (z5) {
                d.b bVar12 = d.b.CENTER_X;
                r(bVar12).a(eVar.r(bVar12), 0);
                return;
            } else {
                if (z6) {
                    d.b bVar13 = d.b.CENTER_Y;
                    r(bVar13).a(eVar.r(bVar13), 0);
                    return;
                }
                return;
            }
        }
        d.b bVar14 = d.b.CENTER_X;
        if (bVar == bVar14 && (bVar2 == (bVar4 = d.b.LEFT) || bVar2 == d.b.RIGHT)) {
            d r9 = r(bVar4);
            d r10 = eVar.r(bVar2);
            d r11 = r(d.b.RIGHT);
            r9.a(r10, 0);
            r11.a(r10, 0);
            r(bVar14).a(r10, 0);
            return;
        }
        d.b bVar15 = d.b.CENTER_Y;
        if (bVar == bVar15 && (bVar2 == (bVar3 = d.b.TOP) || bVar2 == d.b.BOTTOM)) {
            d r12 = eVar.r(bVar2);
            r(bVar3).a(r12, 0);
            r(d.b.BOTTOM).a(r12, 0);
            r(bVar15).a(r12, 0);
            return;
        }
        if (bVar == bVar14 && bVar2 == bVar14) {
            d.b bVar16 = d.b.LEFT;
            r(bVar16).a(eVar.r(bVar16), 0);
            d.b bVar17 = d.b.RIGHT;
            r(bVar17).a(eVar.r(bVar17), 0);
            r(bVar14).a(eVar.r(bVar2), 0);
            return;
        }
        if (bVar == bVar15 && bVar2 == bVar15) {
            d.b bVar18 = d.b.TOP;
            r(bVar18).a(eVar.r(bVar18), 0);
            d.b bVar19 = d.b.BOTTOM;
            r(bVar19).a(eVar.r(bVar19), 0);
            r(bVar15).a(eVar.r(bVar2), 0);
            return;
        }
        d r13 = r(bVar);
        d r14 = eVar.r(bVar2);
        if (r13.v(r14)) {
            d.b bVar20 = d.b.BASELINE;
            if (bVar == bVar20) {
                d r15 = r(d.b.TOP);
                d r16 = r(d.b.BOTTOM);
                if (r15 != null) {
                    r15.x();
                }
                if (r16 != null) {
                    r16.x();
                }
                i5 = 0;
            } else if (bVar == d.b.TOP || bVar == d.b.BOTTOM) {
                d r17 = r(bVar20);
                if (r17 != null) {
                    r17.x();
                }
                d r18 = r(bVar5);
                if (r18.k() != r14) {
                    r18.x();
                }
                d h5 = r(bVar).h();
                d r19 = r(bVar15);
                if (r19.p()) {
                    h5.x();
                    r19.x();
                }
            } else if (bVar == d.b.LEFT || bVar == d.b.RIGHT) {
                d r20 = r(bVar5);
                if (r20.k() != r14) {
                    r20.x();
                }
                d h6 = r(bVar).h();
                d r21 = r(bVar14);
                if (r21.p()) {
                    h6.x();
                    r21.x();
                }
            }
            r13.a(r14, i5);
        }
    }

    public int k0() {
        e eVar = this.V;
        return (eVar == null || !(eVar instanceof f)) ? this.f2511a0 : ((f) eVar).f2570v1 + this.f2511a0;
    }

    public void k1(float f6) {
        this.F0[0] = f6;
    }

    public void l(d dVar, d dVar2, int i5) {
        if (dVar.i() == this) {
            k(dVar.l(), dVar2.i(), dVar2.l(), i5);
        }
    }

    public int l0() {
        e eVar = this.V;
        return (eVar == null || !(eVar instanceof f)) ? this.f2513b0 : ((f) eVar).f2571w1 + this.f2513b0;
    }

    protected void l1(int i5, boolean z5) {
        this.T[i5] = z5;
    }

    public void m(e eVar, float f6, int i5) {
        d.b bVar = d.b.CENTER;
        p0(bVar, eVar, bVar, i5, 0);
        this.D = f6;
    }

    public boolean m0() {
        return this.E;
    }

    public void m1(boolean z5) {
        this.F = z5;
    }

    public void n(e eVar, HashMap<e, e> hashMap) {
        this.f2536n = eVar.f2536n;
        this.f2538o = eVar.f2538o;
        this.f2540p = eVar.f2540p;
        this.f2542q = eVar.f2542q;
        int[] iArr = this.f2544r;
        int[] iArr2 = eVar.f2544r;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.f2546s = eVar.f2546s;
        this.f2548t = eVar.f2548t;
        this.f2552v = eVar.f2552v;
        this.f2554w = eVar.f2554w;
        this.f2556x = eVar.f2556x;
        this.f2558y = eVar.f2558y;
        this.f2560z = eVar.f2560z;
        this.A = eVar.A;
        this.B = eVar.B;
        int[] iArr3 = eVar.C;
        this.C = Arrays.copyOf(iArr3, iArr3.length);
        this.D = eVar.D;
        this.E = eVar.E;
        this.F = eVar.F;
        this.J.x();
        this.K.x();
        this.L.x();
        this.M.x();
        this.N.x();
        this.O.x();
        this.P.x();
        this.Q.x();
        this.U = (b[]) Arrays.copyOf(this.U, 2);
        this.V = this.V == null ? null : hashMap.get(eVar.V);
        this.W = eVar.W;
        this.X = eVar.X;
        this.Y = eVar.Y;
        this.Z = eVar.Z;
        this.f2511a0 = eVar.f2511a0;
        this.f2513b0 = eVar.f2513b0;
        this.f2515c0 = eVar.f2515c0;
        this.f2517d0 = eVar.f2517d0;
        this.f2519e0 = eVar.f2519e0;
        this.f2521f0 = eVar.f2521f0;
        this.f2523g0 = eVar.f2523g0;
        this.f2525h0 = eVar.f2525h0;
        this.f2527i0 = eVar.f2527i0;
        this.f2529j0 = eVar.f2529j0;
        this.f2531k0 = eVar.f2531k0;
        this.f2533l0 = eVar.f2533l0;
        this.f2535m0 = eVar.f2535m0;
        this.f2537n0 = eVar.f2537n0;
        this.f2539o0 = eVar.f2539o0;
        this.f2541p0 = eVar.f2541p0;
        this.f2543q0 = eVar.f2543q0;
        this.f2545r0 = eVar.f2545r0;
        this.f2547s0 = eVar.f2547s0;
        this.f2549t0 = eVar.f2549t0;
        this.f2551u0 = eVar.f2551u0;
        this.f2553v0 = eVar.f2553v0;
        this.f2555w0 = eVar.f2555w0;
        this.f2557x0 = eVar.f2557x0;
        this.f2559y0 = eVar.f2559y0;
        this.f2561z0 = eVar.f2561z0;
        this.B0 = eVar.B0;
        this.C0 = eVar.C0;
        this.D0 = eVar.D0;
        this.E0 = eVar.E0;
        float[] fArr = this.F0;
        float[] fArr2 = eVar.F0;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        e[] eVarArr = this.G0;
        e[] eVarArr2 = eVar.G0;
        eVarArr[0] = eVarArr2[0];
        eVarArr[1] = eVarArr2[1];
        e[] eVarArr3 = this.H0;
        e[] eVarArr4 = eVar.H0;
        eVarArr3[0] = eVarArr4[0];
        eVarArr3[1] = eVarArr4[1];
        e eVar2 = eVar.I0;
        this.I0 = eVar2 == null ? null : hashMap.get(eVar2);
        e eVar3 = eVar.J0;
        this.J0 = eVar3 != null ? hashMap.get(eVar3) : null;
    }

    public boolean n0(int i5) {
        if (i5 == 0) {
            return (this.J.f2491f != null ? 1 : 0) + (this.L.f2491f != null ? 1 : 0) < 2;
        }
        return ((this.K.f2491f != null ? 1 : 0) + (this.M.f2491f != null ? 1 : 0)) + (this.N.f2491f != null ? 1 : 0) < 2;
    }

    public void n1(boolean z5) {
        this.G = z5;
    }

    public void o(androidx.constraintlayout.solver.g gVar) {
        gVar.u(this.J);
        gVar.u(this.K);
        gVar.u(this.L);
        gVar.u(this.M);
        if (this.f2523g0 > 0) {
            gVar.u(this.N);
        }
    }

    public boolean o0() {
        int size = this.S.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (this.S.get(i5).n()) {
                return true;
            }
        }
        return false;
    }

    public void o1(int i5, int i6) {
        this.H = i5;
        this.I = i6;
        s1(false);
    }

    public void p() {
        this.f2526i = true;
    }

    public void p0(d.b bVar, e eVar, d.b bVar2, int i5, int i6) {
        r(bVar).b(eVar.r(bVar2), i5, i6, true);
    }

    public void p1(int i5, int i6) {
        if (i6 == 0) {
            H1(i5);
        } else if (i6 == 1) {
            d1(i5);
        }
    }

    public void q() {
        if (this.f2518e == null) {
            this.f2518e = new androidx.constraintlayout.solver.widgets.analyzer.m(this);
        }
        if (this.f2520f == null) {
            this.f2520f = new o(this);
        }
    }

    public void q1(int i5) {
        this.C[1] = i5;
    }

    public d r(d.b bVar) {
        switch (a.f2562a[bVar.ordinal()]) {
            case 1:
                return this.J;
            case 2:
                return this.K;
            case 3:
                return this.L;
            case 4:
                return this.M;
            case 5:
                return this.N;
            case 6:
                return this.Q;
            case 7:
                return this.O;
            case 8:
                return this.P;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public boolean r0() {
        return this.f2560z;
    }

    public void r1(int i5) {
        this.C[0] = i5;
    }

    public ArrayList<d> s() {
        return this.S;
    }

    public boolean s0() {
        d dVar = this.J;
        d dVar2 = dVar.f2491f;
        if (dVar2 != null && dVar2.f2491f == dVar) {
            return true;
        }
        d dVar3 = this.L;
        d dVar4 = dVar3.f2491f;
        return dVar4 != null && dVar4.f2491f == dVar3;
    }

    public void s1(boolean z5) {
        this.f2526i = z5;
    }

    public int t() {
        return this.f2523g0;
    }

    public boolean t0() {
        return this.F;
    }

    public void t1(int i5) {
        if (i5 < 0) {
            this.f2527i0 = 0;
        } else {
            this.f2527i0 = i5;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2541p0 != null ? androidx.concurrent.futures.a.a(new StringBuilder("type: "), this.f2541p0, " ") : "");
        sb.append(this.f2539o0 != null ? androidx.concurrent.futures.a.a(new StringBuilder("id: "), this.f2539o0, " ") : "");
        sb.append("(");
        sb.append(this.f2511a0);
        sb.append(", ");
        sb.append(this.f2513b0);
        sb.append(") - (");
        sb.append(this.W);
        sb.append(" x ");
        return androidx.constraintlayout.solver.e.a(sb, this.X, ")");
    }

    public float u(int i5) {
        if (i5 == 0) {
            return this.f2529j0;
        }
        if (i5 == 1) {
            return this.f2531k0;
        }
        return -1.0f;
    }

    public boolean u0() {
        d dVar = this.K;
        d dVar2 = dVar.f2491f;
        if (dVar2 != null && dVar2.f2491f == dVar) {
            return true;
        }
        d dVar3 = this.M;
        d dVar4 = dVar3.f2491f;
        return dVar4 != null && dVar4.f2491f == dVar3;
    }

    public void u1(int i5) {
        if (i5 < 0) {
            this.f2525h0 = 0;
        } else {
            this.f2525h0 = i5;
        }
    }

    public int v() {
        return l0() + this.X;
    }

    public boolean v0() {
        return this.G;
    }

    public void v1(int i5, int i6) {
        this.f2519e0 = i5;
        this.f2521f0 = i6;
    }

    public Object w() {
        return this.f2533l0;
    }

    public boolean w0() {
        return this.f2526i && this.f2537n0 != 8;
    }

    public void w1(int i5, int i6) {
        this.f2511a0 = i5;
        this.f2513b0 = i6;
    }

    public int x() {
        return this.f2535m0;
    }

    public boolean x0() {
        return this.f2532l || (this.J.o() && this.L.o());
    }

    public void x1(e eVar) {
        this.V = eVar;
    }

    public String y() {
        return this.f2539o0;
    }

    public boolean y0() {
        return this.f2534m || (this.K.o() && this.M.o());
    }

    void y1(int i5, int i6) {
        if (i6 == 0) {
            this.f2515c0 = i5;
        } else if (i6 == 1) {
            this.f2517d0 = i5;
        }
    }

    public b z(int i5) {
        if (i5 == 0) {
            return H();
        }
        if (i5 == 1) {
            return g0();
        }
        return null;
    }

    public boolean z0() {
        return this.V == null;
    }

    public void z1(String str) {
        this.f2541p0 = str;
    }

    public e(String str) {
        this.f2510a = false;
        this.f2512b = new q[2];
        this.f2518e = null;
        this.f2520f = null;
        this.f2522g = new boolean[]{true, true};
        this.f2524h = false;
        this.f2526i = true;
        this.f2528j = false;
        this.f2530k = true;
        this.f2532l = false;
        this.f2534m = false;
        this.f2536n = -1;
        this.f2538o = -1;
        this.f2540p = 0;
        this.f2542q = 0;
        this.f2544r = new int[2];
        this.f2546s = 0;
        this.f2548t = 0;
        this.f2550u = 1.0f;
        this.f2552v = 0;
        this.f2554w = 0;
        this.f2556x = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = 0.0f;
        this.E = false;
        this.G = false;
        this.H = 0;
        this.I = 0;
        this.J = new d(this, d.b.LEFT);
        this.K = new d(this, d.b.TOP);
        this.L = new d(this, d.b.RIGHT);
        this.M = new d(this, d.b.BOTTOM);
        this.N = new d(this, d.b.BASELINE);
        this.O = new d(this, d.b.CENTER_X);
        this.P = new d(this, d.b.CENTER_Y);
        d dVar = new d(this, d.b.CENTER);
        this.Q = dVar;
        this.R = new d[]{this.J, this.L, this.K, this.M, this.N, dVar};
        this.S = new ArrayList<>();
        this.T = new boolean[2];
        b bVar = b.FIXED;
        this.U = new b[]{bVar, bVar};
        this.V = null;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.f2511a0 = 0;
        this.f2513b0 = 0;
        this.f2515c0 = 0;
        this.f2517d0 = 0;
        this.f2519e0 = 0;
        this.f2521f0 = 0;
        this.f2523g0 = 0;
        float f6 = f2509n1;
        this.f2529j0 = f6;
        this.f2531k0 = f6;
        this.f2535m0 = 0;
        this.f2537n0 = 0;
        this.f2539o0 = null;
        this.f2541p0 = null;
        this.A0 = false;
        this.B0 = 0;
        this.C0 = 0;
        this.F0 = new float[]{-1.0f, -1.0f};
        this.G0 = new e[]{null, null};
        this.H0 = new e[]{null, null};
        this.I0 = null;
        this.J0 = null;
        this.K0 = -1;
        this.L0 = -1;
        d();
        O0(str);
    }

    public e(int i5, int i6, int i7, int i8) {
        this.f2510a = false;
        this.f2512b = new q[2];
        this.f2518e = null;
        this.f2520f = null;
        this.f2522g = new boolean[]{true, true};
        this.f2524h = false;
        this.f2526i = true;
        this.f2528j = false;
        this.f2530k = true;
        this.f2532l = false;
        this.f2534m = false;
        this.f2536n = -1;
        this.f2538o = -1;
        this.f2540p = 0;
        this.f2542q = 0;
        this.f2544r = new int[2];
        this.f2546s = 0;
        this.f2548t = 0;
        this.f2550u = 1.0f;
        this.f2552v = 0;
        this.f2554w = 0;
        this.f2556x = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = 0.0f;
        this.E = false;
        this.G = false;
        this.H = 0;
        this.I = 0;
        this.J = new d(this, d.b.LEFT);
        this.K = new d(this, d.b.TOP);
        this.L = new d(this, d.b.RIGHT);
        this.M = new d(this, d.b.BOTTOM);
        this.N = new d(this, d.b.BASELINE);
        this.O = new d(this, d.b.CENTER_X);
        this.P = new d(this, d.b.CENTER_Y);
        d dVar = new d(this, d.b.CENTER);
        this.Q = dVar;
        this.R = new d[]{this.J, this.L, this.K, this.M, this.N, dVar};
        this.S = new ArrayList<>();
        this.T = new boolean[2];
        b bVar = b.FIXED;
        this.U = new b[]{bVar, bVar};
        this.V = null;
        this.Y = 0.0f;
        this.Z = -1;
        this.f2515c0 = 0;
        this.f2517d0 = 0;
        this.f2519e0 = 0;
        this.f2521f0 = 0;
        this.f2523g0 = 0;
        float f6 = f2509n1;
        this.f2529j0 = f6;
        this.f2531k0 = f6;
        this.f2535m0 = 0;
        this.f2537n0 = 0;
        this.f2539o0 = null;
        this.f2541p0 = null;
        this.A0 = false;
        this.B0 = 0;
        this.C0 = 0;
        this.F0 = new float[]{-1.0f, -1.0f};
        this.G0 = new e[]{null, null};
        this.H0 = new e[]{null, null};
        this.I0 = null;
        this.J0 = null;
        this.K0 = -1;
        this.L0 = -1;
        this.f2511a0 = i5;
        this.f2513b0 = i6;
        this.W = i7;
        this.X = i8;
        d();
    }

    public e(String str, int i5, int i6, int i7, int i8) {
        this(i5, i6, i7, i8);
        O0(str);
    }

    public e(int i5, int i6) {
        this(0, 0, i5, i6);
    }

    public e(String str, int i5, int i6) {
        this(0, 0, i5, i6);
        O0(str);
    }
}
