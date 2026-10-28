package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.state.r;
import androidx.constraintlayout.core.widgets.analyzer.p;
import androidx.constraintlayout.core.widgets.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: ConstraintWidget.java */
/* loaded from: classes.dex */
public class e {
    private static final boolean U0 = false;
    protected static final int V0 = 1;
    protected static final int W0 = 2;
    private static final boolean X0 = false;
    public static final int Y0 = 0;
    public static final int Z0 = 1;

    /* renamed from: a1, reason: collision with root package name */
    public static final int f22907a1 = 2;

    /* renamed from: b1, reason: collision with root package name */
    public static final int f22908b1 = 3;

    /* renamed from: c1, reason: collision with root package name */
    public static final int f22909c1 = 4;

    /* renamed from: d1, reason: collision with root package name */
    public static final int f22910d1 = -1;

    /* renamed from: e1, reason: collision with root package name */
    public static final int f22911e1 = 0;

    /* renamed from: f1, reason: collision with root package name */
    public static final int f22912f1 = 1;

    /* renamed from: g1, reason: collision with root package name */
    public static final int f22913g1 = 2;

    /* renamed from: h1, reason: collision with root package name */
    public static final int f22914h1 = 0;

    /* renamed from: i1, reason: collision with root package name */
    public static final int f22915i1 = 4;

    /* renamed from: j1, reason: collision with root package name */
    public static final int f22916j1 = 8;

    /* renamed from: k1, reason: collision with root package name */
    public static final int f22917k1 = 0;

    /* renamed from: l1, reason: collision with root package name */
    public static final int f22918l1 = 1;

    /* renamed from: m1, reason: collision with root package name */
    public static final int f22919m1 = 2;

    /* renamed from: n1, reason: collision with root package name */
    public static final int f22920n1 = 0;

    /* renamed from: o1, reason: collision with root package name */
    public static final int f22921o1 = 1;

    /* renamed from: p1, reason: collision with root package name */
    public static final int f22922p1 = 2;

    /* renamed from: q1, reason: collision with root package name */
    public static final int f22923q1 = 3;

    /* renamed from: r1, reason: collision with root package name */
    private static final int f22924r1 = -2;

    /* renamed from: s1, reason: collision with root package name */
    public static final int f22925s1 = 0;

    /* renamed from: t1, reason: collision with root package name */
    public static final int f22926t1 = 1;

    /* renamed from: u1, reason: collision with root package name */
    public static final int f22927u1 = 2;

    /* renamed from: v1, reason: collision with root package name */
    public static final int f22928v1 = 3;

    /* renamed from: w1, reason: collision with root package name */
    public static final int f22929w1 = 4;

    /* renamed from: x1, reason: collision with root package name */
    static final int f22930x1 = 0;

    /* renamed from: y1, reason: collision with root package name */
    static final int f22931y1 = 1;

    /* renamed from: z1, reason: collision with root package name */
    public static float f22932z1 = 0.5f;
    public int A;
    int A0;
    public float B;
    int B0;
    public int C;
    boolean C0;
    public int D;
    boolean D0;
    public float E;
    boolean E0;
    public boolean F;
    boolean F0;
    public boolean G;
    boolean G0;
    int H;
    boolean H0;
    float I;
    boolean I0;
    private int[] J;
    int J0;
    private float K;
    int K0;
    private boolean L;
    boolean L0;
    private boolean M;
    boolean M0;
    private boolean N;
    public float[] N0;
    private int O;
    protected e[] O0;
    private int P;
    protected e[] P0;
    public d Q;
    e Q0;
    public d R;
    e R0;
    public d S;
    public int S0;
    public d T;
    public int T0;
    public d U;
    d V;
    d W;
    public d X;
    public d[] Y;
    protected ArrayList<d> Z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f22933a;

    /* renamed from: a0, reason: collision with root package name */
    private boolean[] f22934a0;

    /* renamed from: b, reason: collision with root package name */
    public p[] f22935b;

    /* renamed from: b0, reason: collision with root package name */
    public b[] f22936b0;

    /* renamed from: c, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.c f22937c;

    /* renamed from: c0, reason: collision with root package name */
    public e f22938c0;

    /* renamed from: d, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.c f22939d;

    /* renamed from: d0, reason: collision with root package name */
    int f22940d0;

    /* renamed from: e, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.l f22941e;

    /* renamed from: e0, reason: collision with root package name */
    int f22942e0;

    /* renamed from: f, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.n f22943f;

    /* renamed from: f0, reason: collision with root package name */
    public float f22944f0;

    /* renamed from: g, reason: collision with root package name */
    public boolean[] f22945g;

    /* renamed from: g0, reason: collision with root package name */
    protected int f22946g0;

    /* renamed from: h, reason: collision with root package name */
    boolean f22947h;

    /* renamed from: h0, reason: collision with root package name */
    protected int f22948h0;

    /* renamed from: i, reason: collision with root package name */
    private boolean f22949i;

    /* renamed from: i0, reason: collision with root package name */
    protected int f22950i0;

    /* renamed from: j, reason: collision with root package name */
    private boolean f22951j;

    /* renamed from: j0, reason: collision with root package name */
    int f22952j0;

    /* renamed from: k, reason: collision with root package name */
    private boolean f22953k;

    /* renamed from: k0, reason: collision with root package name */
    int f22954k0;

    /* renamed from: l, reason: collision with root package name */
    private int f22955l;

    /* renamed from: l0, reason: collision with root package name */
    protected int f22956l0;

    /* renamed from: m, reason: collision with root package name */
    private int f22957m;

    /* renamed from: m0, reason: collision with root package name */
    protected int f22958m0;

    /* renamed from: n, reason: collision with root package name */
    public r f22959n;

    /* renamed from: n0, reason: collision with root package name */
    int f22960n0;

    /* renamed from: o, reason: collision with root package name */
    public String f22961o;

    /* renamed from: o0, reason: collision with root package name */
    protected int f22962o0;

    /* renamed from: p, reason: collision with root package name */
    private boolean f22963p;

    /* renamed from: p0, reason: collision with root package name */
    protected int f22964p0;

    /* renamed from: q, reason: collision with root package name */
    private boolean f22965q;

    /* renamed from: q0, reason: collision with root package name */
    float f22966q0;

    /* renamed from: r, reason: collision with root package name */
    private boolean f22967r;

    /* renamed from: r0, reason: collision with root package name */
    float f22968r0;

    /* renamed from: s, reason: collision with root package name */
    private boolean f22969s;

    /* renamed from: s0, reason: collision with root package name */
    private Object f22970s0;

    /* renamed from: t, reason: collision with root package name */
    public int f22971t;

    /* renamed from: t0, reason: collision with root package name */
    private int f22972t0;

    /* renamed from: u, reason: collision with root package name */
    public int f22973u;

    /* renamed from: u0, reason: collision with root package name */
    private int f22974u0;

    /* renamed from: v, reason: collision with root package name */
    private int f22975v;

    /* renamed from: v0, reason: collision with root package name */
    private boolean f22976v0;

    /* renamed from: w, reason: collision with root package name */
    public int f22977w;

    /* renamed from: w0, reason: collision with root package name */
    private String f22978w0;

    /* renamed from: x, reason: collision with root package name */
    public int f22979x;

    /* renamed from: x0, reason: collision with root package name */
    private String f22980x0;

    /* renamed from: y, reason: collision with root package name */
    public int[] f22981y;

    /* renamed from: y0, reason: collision with root package name */
    int f22982y0;

    /* renamed from: z, reason: collision with root package name */
    public int f22983z;

    /* renamed from: z0, reason: collision with root package name */
    int f22984z0;

    /* compiled from: ConstraintWidget.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22985a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f22986b;

        static {
            int[] iArr = new int[b.values().length];
            f22986b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22986b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22986b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22986b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f22985a = iArr2;
            try {
                iArr2[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22985a[d.b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22985a[d.b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22985a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22985a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22985a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f22985a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f22985a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f22985a[d.b.NONE.ordinal()] = 9;
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
        this.f22933a = false;
        this.f22935b = new p[2];
        this.f22941e = null;
        this.f22943f = null;
        this.f22945g = new boolean[]{true, true};
        this.f22947h = false;
        this.f22949i = true;
        this.f22951j = false;
        this.f22953k = true;
        this.f22955l = -1;
        this.f22957m = -1;
        this.f22959n = new r(this);
        this.f22963p = false;
        this.f22965q = false;
        this.f22967r = false;
        this.f22969s = false;
        this.f22971t = -1;
        this.f22973u = -1;
        this.f22975v = 0;
        this.f22977w = 0;
        this.f22979x = 0;
        this.f22981y = new int[2];
        this.f22983z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = 0;
        this.D = 0;
        this.E = 1.0f;
        this.H = -1;
        this.I = 1.0f;
        this.J = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.K = 0.0f;
        this.L = false;
        this.N = false;
        this.O = 0;
        this.P = 0;
        this.Q = new d(this, d.b.LEFT);
        this.R = new d(this, d.b.TOP);
        this.S = new d(this, d.b.RIGHT);
        this.T = new d(this, d.b.BOTTOM);
        this.U = new d(this, d.b.BASELINE);
        this.V = new d(this, d.b.CENTER_X);
        this.W = new d(this, d.b.CENTER_Y);
        d dVar = new d(this, d.b.CENTER);
        this.X = dVar;
        this.Y = new d[]{this.Q, this.S, this.R, this.T, this.U, dVar};
        this.Z = new ArrayList<>();
        this.f22934a0 = new boolean[2];
        b bVar = b.FIXED;
        this.f22936b0 = new b[]{bVar, bVar};
        this.f22938c0 = null;
        this.f22940d0 = 0;
        this.f22942e0 = 0;
        this.f22944f0 = 0.0f;
        this.f22946g0 = -1;
        this.f22948h0 = 0;
        this.f22950i0 = 0;
        this.f22952j0 = 0;
        this.f22954k0 = 0;
        this.f22956l0 = 0;
        this.f22958m0 = 0;
        this.f22960n0 = 0;
        float f4 = f22932z1;
        this.f22966q0 = f4;
        this.f22968r0 = f4;
        this.f22972t0 = 0;
        this.f22974u0 = 0;
        this.f22976v0 = false;
        this.f22978w0 = null;
        this.f22980x0 = null;
        this.I0 = false;
        this.J0 = 0;
        this.K0 = 0;
        this.N0 = new float[]{-1.0f, -1.0f};
        this.O0 = new e[]{null, null};
        this.P0 = new e[]{null, null};
        this.Q0 = null;
        this.R0 = null;
        this.S0 = -1;
        this.T0 = -1;
        d();
    }

    private void Z0(StringBuilder sb, String str, d dVar) {
        if (dVar.f22902f == null) {
            return;
        }
        sb.append(str);
        sb.append(" : [ '");
        sb.append(dVar.f22902f);
        sb.append("',");
        sb.append(dVar.f22903g);
        sb.append(",");
        sb.append(dVar.f22904h);
        sb.append(",");
        sb.append(" ] ,\n");
    }

    private void a1(StringBuilder sb, String str, float f4, float f5) {
        if (f4 == f5) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f4);
        sb.append(",\n");
    }

    private void b1(StringBuilder sb, String str, int i4, int i5) {
        if (i4 == i5) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i4);
        sb.append(",\n");
    }

    private void c0(StringBuilder sb, String str, int i4, int i5, int i6, int i7, int i10, int i11, float f4, float f5) {
        sb.append(str);
        sb.append(" :  {\n");
        b1(sb, "      size", i4, 0);
        b1(sb, "      min", i5, 0);
        b1(sb, "      max", i6, Integer.MAX_VALUE);
        b1(sb, "      matchMin", i10, 0);
        b1(sb, "      matchDef", i11, 0);
        a1(sb, "      matchPercent", f4, 1.0f);
        sb.append("    },\n");
    }

    private void c1(StringBuilder sb, d dVar, float f4) {
        if (dVar.f22902f == null) {
            return;
        }
        sb.append("circle : [ '");
        sb.append(dVar.f22902f);
        sb.append("',");
        sb.append(dVar.f22903g);
        sb.append(",");
        sb.append(f4);
        sb.append(",");
        sb.append(" ] ,\n");
    }

    private void d() {
        this.Z.add(this.Q);
        this.Z.add(this.R);
        this.Z.add(this.S);
        this.Z.add(this.T);
        this.Z.add(this.V);
        this.Z.add(this.W);
        this.Z.add(this.X);
        this.Z.add(this.U);
    }

    private void d0(StringBuilder sb, String str, d dVar) {
        if (dVar.f22902f == null) {
            return;
        }
        androidx.concurrent.futures.a.a(sb, "    ", str, " : [ '");
        sb.append(dVar.f22902f);
        sb.append("'");
        if (dVar.f22904h != Integer.MIN_VALUE || dVar.f22903g != 0) {
            sb.append(",");
            sb.append(dVar.f22903g);
            if (dVar.f22904h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(dVar.f22904h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    private void d1(StringBuilder sb, String str, float f4, int i4) {
        if (f4 == 0.0f) {
            return;
        }
        sb.append(str);
        sb.append(" :  [");
        sb.append(f4);
        sb.append(",");
        sb.append(i4);
        sb.append("");
        sb.append("],\n");
    }

    private void e1(StringBuilder sb, String str, int i4, int i5, int i6, int i7, int i10, int i11, float f4, float f5) {
        sb.append(str);
        sb.append(" :  {\n");
        b1(sb, "size", i4, Integer.MIN_VALUE);
        b1(sb, "min", i5, 0);
        b1(sb, "max", i6, Integer.MAX_VALUE);
        b1(sb, "matchMin", i10, 0);
        b1(sb, "matchDef", i11, 0);
        b1(sb, "matchPercent", i11, 1);
        sb.append("},\n");
    }

    /* JADX WARN: Removed duplicated region for block: B:111:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x039d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x042d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04c7 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i(androidx.constraintlayout.core.f r32, boolean r33, boolean r34, boolean r35, boolean r36, androidx.constraintlayout.core.j r37, androidx.constraintlayout.core.j r38, androidx.constraintlayout.core.widgets.e.b r39, boolean r40, androidx.constraintlayout.core.widgets.d r41, androidx.constraintlayout.core.widgets.d r42, int r43, int r44, int r45, int r46, float r47, boolean r48, boolean r49, boolean r50, boolean r51, boolean r52, int r53, int r54, int r55, int r56, float r57, boolean r58) {
        /*
            Method dump skipped, instructions count: 1347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.e.i(androidx.constraintlayout.core.f, boolean, boolean, boolean, boolean, androidx.constraintlayout.core.j, androidx.constraintlayout.core.j, androidx.constraintlayout.core.widgets.e$b, boolean, androidx.constraintlayout.core.widgets.d, androidx.constraintlayout.core.widgets.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    private boolean x0(int i4) {
        d dVar;
        d dVar2;
        int i5 = i4 * 2;
        d[] dVarArr = this.Y;
        d dVar3 = dVarArr[i5];
        d dVar4 = dVar3.f22902f;
        return (dVar4 == null || dVar4.f22902f == dVar3 || (dVar2 = (dVar = dVarArr[i5 + 1]).f22902f) == null || dVar2.f22902f != dVar) ? false : true;
    }

    public float A() {
        return this.f22944f0;
    }

    public boolean A0(int i4) {
        return this.f22934a0[i4];
    }

    public void A1(float f4) {
        this.f22966q0 = f4;
    }

    public int B() {
        return this.f22946g0;
    }

    public boolean B0() {
        d dVar = this.Q;
        d dVar2 = dVar.f22902f;
        if (dVar2 != null && dVar2.f22902f == dVar) {
            return true;
        }
        d dVar3 = this.S;
        d dVar4 = dVar3.f22902f;
        return dVar4 != null && dVar4.f22902f == dVar3;
    }

    public void B1(int i4) {
        this.J0 = i4;
    }

    public boolean C() {
        return this.L;
    }

    public boolean C0() {
        return this.M;
    }

    public void C1(int i4, int i5) {
        this.f22948h0 = i4;
        int i6 = i5 - i4;
        this.f22940d0 = i6;
        int i7 = this.f22962o0;
        if (i6 < i7) {
            this.f22940d0 = i7;
        }
    }

    public int D() {
        if (this.f22974u0 == 8) {
            return 0;
        }
        return this.f22942e0;
    }

    public boolean D0() {
        d dVar = this.R;
        d dVar2 = dVar.f22902f;
        if (dVar2 != null && dVar2.f22902f == dVar) {
            return true;
        }
        d dVar3 = this.T;
        d dVar4 = dVar3.f22902f;
        return dVar4 != null && dVar4.f22902f == dVar3;
    }

    public void D1(b bVar) {
        this.f22936b0[0] = bVar;
    }

    public float E() {
        return this.f22966q0;
    }

    public boolean E0() {
        return this.N;
    }

    public void E1(int i4, int i5, int i6, float f4) {
        this.f22977w = i4;
        this.f22983z = i5;
        if (i6 == Integer.MAX_VALUE) {
            i6 = 0;
        }
        this.A = i6;
        this.B = f4;
        if (f4 <= 0.0f || f4 >= 1.0f || i4 != 0) {
            return;
        }
        this.f22977w = 2;
    }

    public e F() {
        if (!B0()) {
            return null;
        }
        e eVar = this;
        e eVar2 = null;
        while (eVar2 == null && eVar != null) {
            d r4 = eVar.r(d.b.LEFT);
            d k4 = r4 == null ? null : r4.k();
            e i4 = k4 == null ? null : k4.i();
            if (i4 == U()) {
                return eVar;
            }
            d k5 = i4 == null ? null : i4.r(d.b.RIGHT).k();
            if (k5 == null || k5.i() == eVar) {
                eVar = i4;
            } else {
                eVar2 = eVar;
            }
        }
        return eVar2;
    }

    public boolean F0() {
        return this.f22949i && this.f22974u0 != 8;
    }

    public void F1(float f4) {
        this.N0[0] = f4;
    }

    public int G() {
        return this.J0;
    }

    public boolean G0() {
        return this.f22963p || (this.Q.o() && this.S.o());
    }

    protected void G1(int i4, boolean z4) {
        this.f22934a0[i4] = z4;
    }

    public b H() {
        return this.f22936b0[0];
    }

    public boolean H0() {
        return this.f22965q || (this.R.o() && this.T.o());
    }

    public void H1(boolean z4) {
        this.M = z4;
    }

    public int I() {
        d dVar = this.Q;
        int i4 = dVar != null ? dVar.f22903g : 0;
        d dVar2 = this.S;
        return dVar2 != null ? i4 + dVar2.f22903g : i4;
    }

    public boolean I0() {
        return this.f22938c0 == null;
    }

    public void I1(boolean z4) {
        this.N = z4;
    }

    public int J() {
        return this.O;
    }

    public boolean J0() {
        return this.f22979x == 0 && this.f22944f0 == 0.0f && this.C == 0 && this.D == 0 && this.f22936b0[1] == b.MATCH_CONSTRAINT;
    }

    public void J1(int i4, int i5) {
        this.O = i4;
        this.P = i5;
        N1(false);
    }

    public int K() {
        return this.P;
    }

    public boolean K0() {
        return this.f22977w == 0 && this.f22944f0 == 0.0f && this.f22983z == 0 && this.A == 0 && this.f22936b0[0] == b.MATCH_CONSTRAINT;
    }

    public void K1(int i4, int i5) {
        if (i5 == 0) {
            c2(i4);
        } else if (i5 == 1) {
            y1(i4);
        }
    }

    public int L() {
        return o0();
    }

    public boolean L0() {
        return this.f22969s;
    }

    public void L1(int i4) {
        this.J[1] = i4;
    }

    public int M(int i4) {
        if (i4 == 0) {
            return m0();
        }
        if (i4 == 1) {
            return D();
        }
        return 0;
    }

    public boolean M0() {
        return this.F;
    }

    public void M1(int i4) {
        this.J[0] = i4;
    }

    public int N() {
        return this.J[1];
    }

    public void N0() {
        this.f22967r = true;
    }

    public void N1(boolean z4) {
        this.f22949i = z4;
    }

    public int O() {
        return this.J[0];
    }

    public void O0() {
        this.f22969s = true;
    }

    public void O1(int i4) {
        if (i4 < 0) {
            this.f22964p0 = 0;
        } else {
            this.f22964p0 = i4;
        }
    }

    public int P() {
        return this.f22964p0;
    }

    public boolean P0(int i4) {
        char c5 = i4 == 0 ? (char) 1 : (char) 0;
        b[] bVarArr = this.f22936b0;
        b bVar = bVarArr[i4];
        b bVar2 = bVarArr[c5];
        b bVar3 = b.MATCH_CONSTRAINT;
        return bVar == bVar3 && bVar2 == bVar3;
    }

    public void P1(int i4) {
        if (i4 < 0) {
            this.f22962o0 = 0;
        } else {
            this.f22962o0 = i4;
        }
    }

    public int Q() {
        return this.f22962o0;
    }

    public boolean Q0() {
        b[] bVarArr = this.f22936b0;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    public void Q1(int i4, int i5) {
        this.f22956l0 = i4;
        this.f22958m0 = i5;
    }

    public e R(int i4) {
        d dVar;
        d dVar2;
        if (i4 != 0) {
            if (i4 == 1 && (dVar2 = (dVar = this.T).f22902f) != null && dVar2.f22902f == dVar) {
                return dVar2.f22900d;
            }
            return null;
        }
        d dVar3 = this.S;
        d dVar4 = dVar3.f22902f;
        if (dVar4 == null || dVar4.f22902f != dVar3) {
            return null;
        }
        return dVar4.f22900d;
    }

    public void R0() {
        this.Q.x();
        this.R.x();
        this.S.x();
        this.T.x();
        this.U.x();
        this.V.x();
        this.W.x();
        this.X.x();
        this.f22938c0 = null;
        this.K = 0.0f;
        this.f22940d0 = 0;
        this.f22942e0 = 0;
        this.f22944f0 = 0.0f;
        this.f22946g0 = -1;
        this.f22948h0 = 0;
        this.f22950i0 = 0;
        this.f22956l0 = 0;
        this.f22958m0 = 0;
        this.f22960n0 = 0;
        this.f22962o0 = 0;
        this.f22964p0 = 0;
        float f4 = f22932z1;
        this.f22966q0 = f4;
        this.f22968r0 = f4;
        b[] bVarArr = this.f22936b0;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f22970s0 = null;
        this.f22972t0 = 0;
        this.f22974u0 = 0;
        this.f22980x0 = null;
        this.G0 = false;
        this.H0 = false;
        this.J0 = 0;
        this.K0 = 0;
        this.L0 = false;
        this.M0 = false;
        float[] fArr = this.N0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f22971t = -1;
        this.f22973u = -1;
        int[] iArr = this.J;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f22977w = 0;
        this.f22979x = 0;
        this.B = 1.0f;
        this.E = 1.0f;
        this.A = Integer.MAX_VALUE;
        this.D = Integer.MAX_VALUE;
        this.f22983z = 0;
        this.C = 0;
        this.f22947h = false;
        this.H = -1;
        this.I = 1.0f;
        this.I0 = false;
        boolean[] zArr = this.f22945g;
        zArr[0] = true;
        zArr[1] = true;
        this.N = false;
        boolean[] zArr2 = this.f22934a0;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f22949i = true;
        int[] iArr2 = this.f22981y;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f22955l = -1;
        this.f22957m = -1;
    }

    public void R1(int i4, int i5) {
        this.f22948h0 = i4;
        this.f22950i0 = i5;
    }

    public int S() {
        int i4;
        int i5 = this.f22942e0;
        if (this.f22936b0[1] != b.MATCH_CONSTRAINT) {
            return i5;
        }
        if (this.f22979x == 1) {
            i4 = Math.max(this.C, i5);
        } else {
            i4 = this.C;
            if (i4 > 0) {
                this.f22942e0 = i4;
            } else {
                i4 = 0;
            }
        }
        int i6 = this.D;
        return (i6 <= 0 || i6 >= i4) ? i4 : i6;
    }

    public void S0() {
        U0();
        V1(f22932z1);
        A1(f22932z1);
    }

    public void S1(e eVar) {
        this.f22938c0 = eVar;
    }

    public int T() {
        int i4;
        int i5 = this.f22940d0;
        if (this.f22936b0[0] != b.MATCH_CONSTRAINT) {
            return i5;
        }
        if (this.f22977w == 1) {
            i4 = Math.max(this.f22983z, i5);
        } else {
            i4 = this.f22983z;
            if (i4 > 0) {
                this.f22940d0 = i4;
            } else {
                i4 = 0;
            }
        }
        int i6 = this.A;
        return (i6 <= 0 || i6 >= i4) ? i4 : i6;
    }

    public void T0(d dVar) {
        if (U() != null && (U() instanceof f) && ((f) U()).K2()) {
            return;
        }
        d r4 = r(d.b.LEFT);
        d r5 = r(d.b.RIGHT);
        d r6 = r(d.b.TOP);
        d r7 = r(d.b.BOTTOM);
        d r10 = r(d.b.CENTER);
        d r11 = r(d.b.CENTER_X);
        d r12 = r(d.b.CENTER_Y);
        if (dVar == r10) {
            if (r4.p() && r5.p() && r4.k() == r5.k()) {
                r4.x();
                r5.x();
            }
            if (r6.p() && r7.p() && r6.k() == r7.k()) {
                r6.x();
                r7.x();
            }
            this.f22966q0 = 0.5f;
            this.f22968r0 = 0.5f;
        } else if (dVar == r11) {
            if (r4.p() && r5.p() && r4.k().i() == r5.k().i()) {
                r4.x();
                r5.x();
            }
            this.f22966q0 = 0.5f;
        } else if (dVar == r12) {
            if (r6.p() && r7.p() && r6.k().i() == r7.k().i()) {
                r6.x();
                r7.x();
            }
            this.f22968r0 = 0.5f;
        } else if (dVar == r4 || dVar == r5) {
            if (r4.p() && r4.k() == r5.k()) {
                r10.x();
            }
        } else if ((dVar == r6 || dVar == r7) && r6.p() && r6.k() == r7.k()) {
            r10.x();
        }
        dVar.x();
    }

    void T1(int i4, int i5) {
        if (i5 == 0) {
            this.f22952j0 = i4;
        } else if (i5 == 1) {
            this.f22954k0 = i4;
        }
    }

    public e U() {
        return this.f22938c0;
    }

    public void U0() {
        e U = U();
        if (U != null && (U instanceof f) && ((f) U()).K2()) {
            return;
        }
        int size = this.Z.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.Z.get(i4).x();
        }
    }

    public void U1(String str) {
        this.f22980x0 = str;
    }

    public e V(int i4) {
        d dVar;
        d dVar2;
        if (i4 != 0) {
            if (i4 == 1 && (dVar2 = (dVar = this.R).f22902f) != null && dVar2.f22902f == dVar) {
                return dVar2.f22900d;
            }
            return null;
        }
        d dVar3 = this.Q;
        d dVar4 = dVar3.f22902f;
        if (dVar4 == null || dVar4.f22902f != dVar3) {
            return null;
        }
        return dVar4.f22900d;
    }

    public void V0() {
        this.f22963p = false;
        this.f22965q = false;
        this.f22967r = false;
        this.f22969s = false;
        int size = this.Z.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.Z.get(i4).y();
        }
    }

    public void V1(float f4) {
        this.f22968r0 = f4;
    }

    int W(int i4) {
        if (i4 == 0) {
            return this.f22952j0;
        }
        if (i4 == 1) {
            return this.f22954k0;
        }
        return 0;
    }

    public void W0(androidx.constraintlayout.core.c cVar) {
        this.Q.z(cVar);
        this.R.z(cVar);
        this.S.z(cVar);
        this.T.z(cVar);
        this.U.z(cVar);
        this.X.z(cVar);
        this.V.z(cVar);
        this.W.z(cVar);
    }

    public void W1(int i4) {
        this.K0 = i4;
    }

    public int X() {
        return o0() + this.f22940d0;
    }

    public void X0() {
        this.f22967r = false;
        this.f22969s = false;
    }

    public void X1(int i4, int i5) {
        this.f22950i0 = i4;
        int i6 = i5 - i4;
        this.f22942e0 = i6;
        int i7 = this.f22964p0;
        if (i6 < i7) {
            this.f22942e0 = i7;
        }
    }

    protected int Y() {
        return this.f22948h0 + this.f22956l0;
    }

    public StringBuilder Y0(StringBuilder sb) {
        sb.append("{\n");
        Z0(sb, "left", this.Q);
        Z0(sb, "top", this.R);
        Z0(sb, "right", this.S);
        Z0(sb, "bottom", this.T);
        Z0(sb, "baseline", this.U);
        Z0(sb, "centerX", this.V);
        Z0(sb, "centerY", this.W);
        c1(sb, this.X, this.K);
        e1(sb, "width", this.f22940d0, this.f22962o0, this.J[0], this.f22955l, this.f22983z, this.f22977w, this.B, this.N0[0]);
        e1(sb, "height", this.f22942e0, this.f22964p0, this.J[1], this.f22957m, this.C, this.f22979x, this.E, this.N0[1]);
        d1(sb, "dimensionRatio", this.f22944f0, this.f22946g0);
        a1(sb, "horizontalBias", this.f22966q0, f22932z1);
        a1(sb, "verticalBias", this.f22968r0, f22932z1);
        sb.append("}\n");
        return sb;
    }

    public void Y1(b bVar) {
        this.f22936b0[1] = bVar;
    }

    protected int Z() {
        return this.f22950i0 + this.f22958m0;
    }

    public void Z1(int i4, int i5, int i6, float f4) {
        this.f22979x = i4;
        this.C = i5;
        if (i6 == Integer.MAX_VALUE) {
            i6 = 0;
        }
        this.D = i6;
        this.E = f4;
        if (f4 <= 0.0f || f4 >= 1.0f || i4 != 0) {
            return;
        }
        this.f22979x = 2;
    }

    public p a0(int i4) {
        if (i4 == 0) {
            return this.f22941e;
        }
        if (i4 == 1) {
            return this.f22943f;
        }
        return null;
    }

    public void a2(float f4) {
        this.N0[1] = f4;
    }

    public void b0(StringBuilder sb) {
        sb.append("  " + this.f22961o + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.f22940d0);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.f22942e0);
        sb.append("\n");
        sb.append("    actualLeft:" + this.f22948h0);
        sb.append("\n");
        sb.append("    actualTop:" + this.f22950i0);
        sb.append("\n");
        d0(sb, "left", this.Q);
        d0(sb, "top", this.R);
        d0(sb, "right", this.S);
        d0(sb, "bottom", this.T);
        d0(sb, "baseline", this.U);
        d0(sb, "centerX", this.V);
        d0(sb, "centerY", this.W);
        c0(sb, "    width", this.f22940d0, this.f22962o0, this.J[0], this.f22955l, this.f22983z, this.f22977w, this.B, this.N0[0]);
        c0(sb, "    height", this.f22942e0, this.f22964p0, this.J[1], this.f22957m, this.C, this.f22979x, this.E, this.N0[1]);
        d1(sb, "    dimensionRatio", this.f22944f0, this.f22946g0);
        a1(sb, "    horizontalBias", this.f22966q0, f22932z1);
        a1(sb, "    verticalBias", this.f22968r0, f22932z1);
        b1(sb, "    horizontalChainStyle", this.J0, 0);
        b1(sb, "    verticalChainStyle", this.K0, 0);
        sb.append("  }");
    }

    public void b2(int i4) {
        this.f22974u0 = i4;
    }

    public void c2(int i4) {
        this.f22940d0 = i4;
        int i5 = this.f22962o0;
        if (i4 < i5) {
            this.f22940d0 = i5;
        }
    }

    public void d2(boolean z4) {
        this.F = z4;
    }

    public void e(f fVar, androidx.constraintlayout.core.f fVar2, HashSet<e> hashSet, int i4, boolean z4) {
        if (z4) {
            if (!hashSet.contains(this)) {
                return;
            }
            k.a(fVar, fVar2, this);
            hashSet.remove(this);
            g(fVar2, fVar.S2(64));
        }
        if (i4 == 0) {
            HashSet<d> e4 = this.Q.e();
            if (e4 != null) {
                Iterator<d> it = e4.iterator();
                while (it.hasNext()) {
                    it.next().f22900d.e(fVar, fVar2, hashSet, i4, true);
                }
            }
            HashSet<d> e5 = this.S.e();
            if (e5 != null) {
                Iterator<d> it2 = e5.iterator();
                while (it2.hasNext()) {
                    it2.next().f22900d.e(fVar, fVar2, hashSet, i4, true);
                }
                return;
            }
            return;
        }
        HashSet<d> e6 = this.R.e();
        if (e6 != null) {
            Iterator<d> it3 = e6.iterator();
            while (it3.hasNext()) {
                it3.next().f22900d.e(fVar, fVar2, hashSet, i4, true);
            }
        }
        HashSet<d> e7 = this.T.e();
        if (e7 != null) {
            Iterator<d> it4 = e7.iterator();
            while (it4.hasNext()) {
                it4.next().f22900d.e(fVar, fVar2, hashSet, i4, true);
            }
        }
        HashSet<d> e10 = this.U.e();
        if (e10 != null) {
            Iterator<d> it5 = e10.iterator();
            while (it5.hasNext()) {
                it5.next().f22900d.e(fVar, fVar2, hashSet, i4, true);
            }
        }
    }

    public int e0() {
        return p0();
    }

    public void e2(int i4) {
        if (i4 < 0 || i4 > 3) {
            return;
        }
        this.f22975v = i4;
    }

    boolean f() {
        return (this instanceof n) || (this instanceof h);
    }

    public String f0() {
        return this.f22980x0;
    }

    public void f1(boolean z4) {
        this.f22976v0 = z4;
    }

    public void f2(int i4) {
        this.f22948h0 = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(androidx.constraintlayout.core.f r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 1539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.e.g(androidx.constraintlayout.core.f, boolean):void");
    }

    public float g0() {
        return this.f22968r0;
    }

    public void g1(int i4) {
        this.f22960n0 = i4;
        this.L = i4 > 0;
    }

    public void g2(int i4) {
        this.f22950i0 = i4;
    }

    public boolean h() {
        return this.f22974u0 != 8;
    }

    public e h0() {
        if (!D0()) {
            return null;
        }
        e eVar = this;
        e eVar2 = null;
        while (eVar2 == null && eVar != null) {
            d r4 = eVar.r(d.b.TOP);
            d k4 = r4 == null ? null : r4.k();
            e i4 = k4 == null ? null : k4.i();
            if (i4 == U()) {
                return eVar;
            }
            d k5 = i4 == null ? null : i4.r(d.b.BOTTOM).k();
            if (k5 == null || k5.i() == eVar) {
                eVar = i4;
            } else {
                eVar2 = eVar;
            }
        }
        return eVar2;
    }

    public void h1(Object obj) {
        this.f22970s0 = obj;
    }

    public void h2(boolean z4, boolean z5, boolean z6, boolean z7) {
        if (this.H == -1) {
            if (z6 && !z7) {
                this.H = 0;
            } else if (!z6 && z7) {
                this.H = 1;
                if (this.f22946g0 == -1) {
                    this.I = 1.0f / this.I;
                }
            }
        }
        if (this.H == 0 && (!this.R.p() || !this.T.p())) {
            this.H = 1;
        } else if (this.H == 1 && (!this.Q.p() || !this.S.p())) {
            this.H = 0;
        }
        if (this.H == -1 && (!this.R.p() || !this.T.p() || !this.Q.p() || !this.S.p())) {
            if (this.R.p() && this.T.p()) {
                this.H = 0;
            } else if (this.Q.p() && this.S.p()) {
                this.I = 1.0f / this.I;
                this.H = 1;
            }
        }
        if (this.H == -1) {
            int i4 = this.f22983z;
            if (i4 > 0 && this.C == 0) {
                this.H = 0;
            } else {
                if (i4 != 0 || this.C <= 0) {
                    return;
                }
                this.I = 1.0f / this.I;
                this.H = 1;
            }
        }
    }

    public int i0() {
        return this.K0;
    }

    public void i1(int i4) {
        if (i4 >= 0) {
            this.f22972t0 = i4;
        } else {
            this.f22972t0 = 0;
        }
    }

    public void i2(boolean z4, boolean z5) {
        int i4;
        int i5;
        boolean m4 = z4 & this.f22941e.m();
        boolean m5 = z5 & this.f22943f.m();
        androidx.constraintlayout.core.widgets.analyzer.l lVar = this.f22941e;
        int i6 = lVar.f22867h.f22813g;
        androidx.constraintlayout.core.widgets.analyzer.n nVar = this.f22943f;
        int i7 = nVar.f22867h.f22813g;
        int i10 = lVar.f22868i.f22813g;
        int i11 = nVar.f22868i.f22813g;
        int i12 = i11 - i7;
        if (i10 - i6 < 0 || i12 < 0 || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE || i10 == Integer.MIN_VALUE || i10 == Integer.MAX_VALUE || i11 == Integer.MIN_VALUE || i11 == Integer.MAX_VALUE) {
            i10 = 0;
            i6 = 0;
            i11 = 0;
            i7 = 0;
        }
        int i13 = i10 - i6;
        int i14 = i11 - i7;
        if (m4) {
            this.f22948h0 = i6;
        }
        if (m5) {
            this.f22950i0 = i7;
        }
        if (this.f22974u0 == 8) {
            this.f22940d0 = 0;
            this.f22942e0 = 0;
            return;
        }
        if (m4) {
            if (this.f22936b0[0] == b.FIXED && i13 < (i5 = this.f22940d0)) {
                i13 = i5;
            }
            this.f22940d0 = i13;
            int i15 = this.f22962o0;
            if (i13 < i15) {
                this.f22940d0 = i15;
            }
        }
        if (m5) {
            if (this.f22936b0[1] == b.FIXED && i14 < (i4 = this.f22942e0)) {
                i14 = i4;
            }
            this.f22942e0 = i14;
            int i16 = this.f22964p0;
            if (i14 < i16) {
                this.f22942e0 = i16;
            }
        }
    }

    public void j(d.b bVar, e eVar, d.b bVar2) {
        k(bVar, eVar, bVar2, 0);
    }

    public b j0() {
        return this.f22936b0[1];
    }

    public void j1(String str) {
        this.f22978w0 = str;
    }

    public void j2(androidx.constraintlayout.core.f fVar, boolean z4) {
        androidx.constraintlayout.core.widgets.analyzer.n nVar;
        androidx.constraintlayout.core.widgets.analyzer.l lVar;
        int O = fVar.O(this.Q);
        int O2 = fVar.O(this.R);
        int O3 = fVar.O(this.S);
        int O4 = fVar.O(this.T);
        if (z4 && (lVar = this.f22941e) != null) {
            androidx.constraintlayout.core.widgets.analyzer.f fVar2 = lVar.f22867h;
            if (fVar2.f22816j) {
                androidx.constraintlayout.core.widgets.analyzer.f fVar3 = lVar.f22868i;
                if (fVar3.f22816j) {
                    O = fVar2.f22813g;
                    O3 = fVar3.f22813g;
                }
            }
        }
        if (z4 && (nVar = this.f22943f) != null) {
            androidx.constraintlayout.core.widgets.analyzer.f fVar4 = nVar.f22867h;
            if (fVar4.f22816j) {
                androidx.constraintlayout.core.widgets.analyzer.f fVar5 = nVar.f22868i;
                if (fVar5.f22816j) {
                    O2 = fVar4.f22813g;
                    O4 = fVar5.f22813g;
                }
            }
        }
        int i4 = O4 - O2;
        if (O3 - O < 0 || i4 < 0 || O == Integer.MIN_VALUE || O == Integer.MAX_VALUE || O2 == Integer.MIN_VALUE || O2 == Integer.MAX_VALUE || O3 == Integer.MIN_VALUE || O3 == Integer.MAX_VALUE || O4 == Integer.MIN_VALUE || O4 == Integer.MAX_VALUE) {
            O = 0;
            O4 = 0;
            O2 = 0;
            O3 = 0;
        }
        v1(O, O2, O3, O4);
    }

    public void k(d.b bVar, e eVar, d.b bVar2, int i4) {
        d.b bVar3;
        d.b bVar4;
        boolean z4;
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
            d r4 = r(bVar8);
            d.b bVar9 = d.b.RIGHT;
            d r5 = r(bVar9);
            d.b bVar10 = d.b.TOP;
            d r6 = r(bVar10);
            d.b bVar11 = d.b.BOTTOM;
            d r7 = r(bVar11);
            boolean z5 = true;
            if ((r4 == null || !r4.p()) && (r5 == null || !r5.p())) {
                k(bVar8, eVar, bVar8, 0);
                k(bVar9, eVar, bVar9, 0);
                z4 = true;
            } else {
                z4 = false;
            }
            if ((r6 == null || !r6.p()) && (r7 == null || !r7.p())) {
                k(bVar10, eVar, bVar10, 0);
                k(bVar11, eVar, bVar11, 0);
            } else {
                z5 = false;
            }
            if (z4 && z5) {
                r(bVar5).a(eVar.r(bVar5), 0);
                return;
            }
            if (z4) {
                d.b bVar12 = d.b.CENTER_X;
                r(bVar12).a(eVar.r(bVar12), 0);
                return;
            } else {
                if (z5) {
                    d.b bVar13 = d.b.CENTER_Y;
                    r(bVar13).a(eVar.r(bVar13), 0);
                    return;
                }
                return;
            }
        }
        d.b bVar14 = d.b.CENTER_X;
        if (bVar == bVar14 && (bVar2 == (bVar4 = d.b.LEFT) || bVar2 == d.b.RIGHT)) {
            d r10 = r(bVar4);
            d r11 = eVar.r(bVar2);
            d r12 = r(d.b.RIGHT);
            r10.a(r11, 0);
            r12.a(r11, 0);
            r(bVar14).a(r11, 0);
            return;
        }
        d.b bVar15 = d.b.CENTER_Y;
        if (bVar == bVar15 && (bVar2 == (bVar3 = d.b.TOP) || bVar2 == d.b.BOTTOM)) {
            d r13 = eVar.r(bVar2);
            r(bVar3).a(r13, 0);
            r(d.b.BOTTOM).a(r13, 0);
            r(bVar15).a(r13, 0);
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
        d r14 = r(bVar);
        d r15 = eVar.r(bVar2);
        if (r14.v(r15)) {
            d.b bVar20 = d.b.BASELINE;
            if (bVar == bVar20) {
                d r16 = r(d.b.TOP);
                d r17 = r(d.b.BOTTOM);
                if (r16 != null) {
                    r16.x();
                }
                if (r17 != null) {
                    r17.x();
                }
            } else if (bVar == d.b.TOP || bVar == d.b.BOTTOM) {
                d r18 = r(bVar20);
                if (r18 != null) {
                    r18.x();
                }
                d r19 = r(bVar5);
                if (r19.k() != r15) {
                    r19.x();
                }
                d h4 = r(bVar).h();
                d r20 = r(bVar15);
                if (r20.p()) {
                    h4.x();
                    r20.x();
                }
            } else if (bVar == d.b.LEFT || bVar == d.b.RIGHT) {
                d r21 = r(bVar5);
                if (r21.k() != r15) {
                    r21.x();
                }
                d h5 = r(bVar).h();
                d r22 = r(bVar14);
                if (r22.p()) {
                    h5.x();
                    r22.x();
                }
            }
            r14.a(r15, i4);
        }
    }

    public int k0() {
        int i4 = this.Q != null ? this.R.f22903g : 0;
        return this.S != null ? i4 + this.T.f22903g : i4;
    }

    public void k1(androidx.constraintlayout.core.f fVar, String str) {
        this.f22978w0 = str;
        androidx.constraintlayout.core.j u4 = fVar.u(this.Q);
        androidx.constraintlayout.core.j u5 = fVar.u(this.R);
        androidx.constraintlayout.core.j u6 = fVar.u(this.S);
        androidx.constraintlayout.core.j u7 = fVar.u(this.T);
        u4.i(str + ".left");
        u5.i(str + ".top");
        u6.i(str + ".right");
        u7.i(str + ".bottom");
        fVar.u(this.U).i(str + ".baseline");
    }

    public void l(d dVar, d dVar2, int i4) {
        if (dVar.i() == this) {
            k(dVar.l(), dVar2.i(), dVar2.l(), i4);
        }
    }

    public int l0() {
        return this.f22974u0;
    }

    public void l1(int i4, int i5) {
        this.f22940d0 = i4;
        int i6 = this.f22962o0;
        if (i4 < i6) {
            this.f22940d0 = i6;
        }
        this.f22942e0 = i5;
        int i7 = this.f22964p0;
        if (i5 < i7) {
            this.f22942e0 = i7;
        }
    }

    public void m(e eVar, float f4, int i4) {
        d.b bVar = d.b.CENTER;
        v0(bVar, eVar, bVar, i4, 0);
        this.K = f4;
    }

    public int m0() {
        if (this.f22974u0 == 8) {
            return 0;
        }
        return this.f22940d0;
    }

    public void m1(float f4, int i4) {
        this.f22944f0 = f4;
        this.f22946g0 = i4;
    }

    public void n(e eVar, HashMap<e, e> hashMap) {
        this.f22971t = eVar.f22971t;
        this.f22973u = eVar.f22973u;
        this.f22977w = eVar.f22977w;
        this.f22979x = eVar.f22979x;
        int[] iArr = this.f22981y;
        int[] iArr2 = eVar.f22981y;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.f22983z = eVar.f22983z;
        this.A = eVar.A;
        this.C = eVar.C;
        this.D = eVar.D;
        this.E = eVar.E;
        this.F = eVar.F;
        this.G = eVar.G;
        this.H = eVar.H;
        this.I = eVar.I;
        int[] iArr3 = eVar.J;
        this.J = Arrays.copyOf(iArr3, iArr3.length);
        this.K = eVar.K;
        this.L = eVar.L;
        this.M = eVar.M;
        this.Q.x();
        this.R.x();
        this.S.x();
        this.T.x();
        this.U.x();
        this.V.x();
        this.W.x();
        this.X.x();
        this.f22936b0 = (b[]) Arrays.copyOf(this.f22936b0, 2);
        this.f22938c0 = this.f22938c0 == null ? null : hashMap.get(eVar.f22938c0);
        this.f22940d0 = eVar.f22940d0;
        this.f22942e0 = eVar.f22942e0;
        this.f22944f0 = eVar.f22944f0;
        this.f22946g0 = eVar.f22946g0;
        this.f22948h0 = eVar.f22948h0;
        this.f22950i0 = eVar.f22950i0;
        this.f22952j0 = eVar.f22952j0;
        this.f22954k0 = eVar.f22954k0;
        this.f22956l0 = eVar.f22956l0;
        this.f22958m0 = eVar.f22958m0;
        this.f22960n0 = eVar.f22960n0;
        this.f22962o0 = eVar.f22962o0;
        this.f22964p0 = eVar.f22964p0;
        this.f22966q0 = eVar.f22966q0;
        this.f22968r0 = eVar.f22968r0;
        this.f22970s0 = eVar.f22970s0;
        this.f22972t0 = eVar.f22972t0;
        this.f22974u0 = eVar.f22974u0;
        this.f22976v0 = eVar.f22976v0;
        this.f22978w0 = eVar.f22978w0;
        this.f22980x0 = eVar.f22980x0;
        this.f22982y0 = eVar.f22982y0;
        this.f22984z0 = eVar.f22984z0;
        this.A0 = eVar.A0;
        this.B0 = eVar.B0;
        this.C0 = eVar.C0;
        this.D0 = eVar.D0;
        this.E0 = eVar.E0;
        this.F0 = eVar.F0;
        this.G0 = eVar.G0;
        this.H0 = eVar.H0;
        this.J0 = eVar.J0;
        this.K0 = eVar.K0;
        this.L0 = eVar.L0;
        this.M0 = eVar.M0;
        float[] fArr = this.N0;
        float[] fArr2 = eVar.N0;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        e[] eVarArr = this.O0;
        e[] eVarArr2 = eVar.O0;
        eVarArr[0] = eVarArr2[0];
        eVarArr[1] = eVarArr2[1];
        e[] eVarArr3 = this.P0;
        e[] eVarArr4 = eVar.P0;
        eVarArr3[0] = eVarArr4[0];
        eVarArr3[1] = eVarArr4[1];
        e eVar2 = eVar.Q0;
        this.Q0 = eVar2 == null ? null : hashMap.get(eVar2);
        e eVar3 = eVar.R0;
        this.R0 = eVar3 != null ? hashMap.get(eVar3) : null;
    }

    public int n0() {
        return this.f22975v;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0086 -> B:31:0x0087). Please report as a decompilation issue!!! */
    public void n1(String str) {
        float f4;
        int i4 = 0;
        if (str == null || str.length() == 0) {
            this.f22944f0 = 0.0f;
            return;
        }
        int length = str.length();
        int indexOf = str.indexOf(44);
        int i5 = -1;
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            i5 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
            r3 = indexOf + 1;
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 < 0 || indexOf2 >= length - 1) {
            String substring2 = str.substring(r3);
            if (substring2.length() > 0) {
                f4 = Float.parseFloat(substring2);
            }
            f4 = i4;
        } else {
            String substring3 = str.substring(r3, indexOf2);
            String substring4 = str.substring(indexOf2 + 1);
            if (substring3.length() > 0 && substring4.length() > 0) {
                float parseFloat = Float.parseFloat(substring3);
                float parseFloat2 = Float.parseFloat(substring4);
                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                    f4 = i5 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                }
            }
            f4 = i4;
        }
        i4 = (f4 > i4 ? 1 : (f4 == i4 ? 0 : -1));
        if (i4 > 0) {
            this.f22944f0 = f4;
            this.f22946g0 = i5;
        }
    }

    public void o(androidx.constraintlayout.core.f fVar) {
        fVar.u(this.Q);
        fVar.u(this.R);
        fVar.u(this.S);
        fVar.u(this.T);
        if (this.f22960n0 > 0) {
            fVar.u(this.U);
        }
    }

    public int o0() {
        e eVar = this.f22938c0;
        return (eVar == null || !(eVar instanceof f)) ? this.f22948h0 : ((f) eVar).I1 + this.f22948h0;
    }

    public void o1(int i4) {
        if (this.L) {
            int i5 = i4 - this.f22960n0;
            int i6 = this.f22942e0 + i5;
            this.f22950i0 = i5;
            this.R.A(i5);
            this.T.A(i6);
            this.U.A(i4);
            this.f22965q = true;
        }
    }

    public void p() {
        this.f22949i = true;
    }

    public int p0() {
        e eVar = this.f22938c0;
        return (eVar == null || !(eVar instanceof f)) ? this.f22950i0 : ((f) eVar).J1 + this.f22950i0;
    }

    public void p1(int i4, int i5, int i6, int i7, int i10, int i11) {
        v1(i4, i5, i6, i7);
        g1(i10);
        if (i11 == 0) {
            this.f22963p = true;
            this.f22965q = false;
        } else if (i11 == 1) {
            this.f22963p = false;
            this.f22965q = true;
        } else if (i11 == 2) {
            this.f22963p = true;
            this.f22965q = true;
        } else {
            this.f22963p = false;
            this.f22965q = false;
        }
    }

    public void q() {
        if (this.f22941e == null) {
            this.f22941e = new androidx.constraintlayout.core.widgets.analyzer.l(this);
        }
        if (this.f22943f == null) {
            this.f22943f = new androidx.constraintlayout.core.widgets.analyzer.n(this);
        }
    }

    public boolean q0() {
        return this.L;
    }

    public void q1(int i4, int i5) {
        if (this.f22963p) {
            return;
        }
        this.Q.A(i4);
        this.S.A(i5);
        this.f22948h0 = i4;
        this.f22940d0 = i5 - i4;
        this.f22963p = true;
    }

    public d r(d.b bVar) {
        switch (a.f22985a[bVar.ordinal()]) {
            case 1:
                return this.Q;
            case 2:
                return this.R;
            case 3:
                return this.S;
            case 4:
                return this.T;
            case 5:
                return this.U;
            case 6:
                return this.X;
            case 7:
                return this.V;
            case 8:
                return this.W;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public boolean r0(int i4) {
        if (i4 == 0) {
            return (this.Q.f22902f != null ? 1 : 0) + (this.S.f22902f != null ? 1 : 0) < 2;
        }
        return ((this.R.f22902f != null ? 1 : 0) + (this.T.f22902f != null ? 1 : 0)) + (this.U.f22902f != null ? 1 : 0) < 2;
    }

    public void r1(int i4) {
        this.Q.A(i4);
        this.f22948h0 = i4;
    }

    public ArrayList<d> s() {
        return this.Z;
    }

    public boolean s0() {
        int size = this.Z.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (this.Z.get(i4).n()) {
                return true;
            }
        }
        return false;
    }

    public void s1(int i4) {
        this.R.A(i4);
        this.f22950i0 = i4;
    }

    public int t() {
        return this.f22960n0;
    }

    public boolean t0() {
        return (this.f22955l == -1 && this.f22957m == -1) ? false : true;
    }

    public void t1(int i4, int i5) {
        if (this.f22965q) {
            return;
        }
        this.R.A(i4);
        this.T.A(i5);
        this.f22950i0 = i4;
        this.f22942e0 = i5 - i4;
        if (this.L) {
            this.U.A(i4 + this.f22960n0);
        }
        this.f22965q = true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f22980x0 != null ? android.support.v4.media.c.a(new StringBuilder("type: "), this.f22980x0, " ") : "");
        sb.append(this.f22978w0 != null ? android.support.v4.media.c.a(new StringBuilder("id: "), this.f22978w0, " ") : "");
        sb.append("(");
        sb.append(this.f22948h0);
        sb.append(", ");
        sb.append(this.f22950i0);
        sb.append(") - (");
        sb.append(this.f22940d0);
        sb.append(" x ");
        return android.support.v4.media.b.a(sb, this.f22942e0, ")");
    }

    public float u(int i4) {
        if (i4 == 0) {
            return this.f22966q0;
        }
        if (i4 == 1) {
            return this.f22968r0;
        }
        return -1.0f;
    }

    public boolean u0(int i4, int i5) {
        d dVar;
        d dVar2;
        if (i4 == 0) {
            d dVar3 = this.Q.f22902f;
            if (dVar3 != null && dVar3.o() && (dVar2 = this.S.f22902f) != null && dVar2.o()) {
                return (this.S.f22902f.f() - this.S.g()) - (this.Q.g() + this.Q.f22902f.f()) >= i5;
            }
        } else {
            d dVar4 = this.R.f22902f;
            if (dVar4 != null && dVar4.o() && (dVar = this.T.f22902f) != null && dVar.o()) {
                return (this.T.f22902f.f() - this.T.g()) - (this.R.g() + this.R.f22902f.f()) >= i5;
            }
        }
        return false;
    }

    public void u1(int i4, int i5, int i6) {
        if (i6 == 0) {
            C1(i4, i5);
        } else if (i6 == 1) {
            X1(i4, i5);
        }
    }

    public int v() {
        return p0() + this.f22942e0;
    }

    public void v0(d.b bVar, e eVar, d.b bVar2, int i4, int i5) {
        r(bVar).b(eVar.r(bVar2), i4, i5, true);
    }

    public void v1(int i4, int i5, int i6, int i7) {
        int i10;
        int i11;
        int i12 = i6 - i4;
        int i13 = i7 - i5;
        this.f22948h0 = i4;
        this.f22950i0 = i5;
        if (this.f22974u0 == 8) {
            this.f22940d0 = 0;
            this.f22942e0 = 0;
            return;
        }
        b[] bVarArr = this.f22936b0;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i12 < (i11 = this.f22940d0)) {
            i12 = i11;
        }
        if (bVarArr[1] == bVar2 && i13 < (i10 = this.f22942e0)) {
            i13 = i10;
        }
        this.f22940d0 = i12;
        this.f22942e0 = i13;
        int i14 = this.f22964p0;
        if (i13 < i14) {
            this.f22942e0 = i14;
        }
        int i15 = this.f22962o0;
        if (i12 < i15) {
            this.f22940d0 = i15;
        }
        int i16 = this.A;
        if (i16 > 0 && bVar == b.MATCH_CONSTRAINT) {
            this.f22940d0 = Math.min(this.f22940d0, i16);
        }
        int i17 = this.D;
        if (i17 > 0 && this.f22936b0[1] == b.MATCH_CONSTRAINT) {
            this.f22942e0 = Math.min(this.f22942e0, i17);
        }
        int i18 = this.f22940d0;
        if (i12 != i18) {
            this.f22955l = i18;
        }
        int i19 = this.f22942e0;
        if (i13 != i19) {
            this.f22957m = i19;
        }
    }

    public Object w() {
        return this.f22970s0;
    }

    public boolean w0() {
        return this.f22976v0;
    }

    public void w1(d.b bVar, int i4) {
        int i5 = a.f22985a[bVar.ordinal()];
        if (i5 == 1) {
            this.Q.f22904h = i4;
            return;
        }
        if (i5 == 2) {
            this.R.f22904h = i4;
            return;
        }
        if (i5 == 3) {
            this.S.f22904h = i4;
        } else if (i5 == 4) {
            this.T.f22904h = i4;
        } else {
            if (i5 != 5) {
                return;
            }
            this.U.f22904h = i4;
        }
    }

    public int x() {
        return this.f22972t0;
    }

    public void x1(boolean z4) {
        this.L = z4;
    }

    public String y() {
        return this.f22978w0;
    }

    public boolean y0() {
        return this.G;
    }

    public void y1(int i4) {
        this.f22942e0 = i4;
        int i5 = this.f22964p0;
        if (i4 < i5) {
            this.f22942e0 = i5;
        }
    }

    public b z(int i4) {
        if (i4 == 0) {
            return H();
        }
        if (i4 == 1) {
            return j0();
        }
        return null;
    }

    public boolean z0() {
        return this.f22967r;
    }

    public void z1(boolean z4) {
        this.G = z4;
    }

    public e(String str) {
        this.f22933a = false;
        this.f22935b = new p[2];
        this.f22941e = null;
        this.f22943f = null;
        this.f22945g = new boolean[]{true, true};
        this.f22947h = false;
        this.f22949i = true;
        this.f22951j = false;
        this.f22953k = true;
        this.f22955l = -1;
        this.f22957m = -1;
        this.f22959n = new r(this);
        this.f22963p = false;
        this.f22965q = false;
        this.f22967r = false;
        this.f22969s = false;
        this.f22971t = -1;
        this.f22973u = -1;
        this.f22975v = 0;
        this.f22977w = 0;
        this.f22979x = 0;
        this.f22981y = new int[2];
        this.f22983z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = 0;
        this.D = 0;
        this.E = 1.0f;
        this.H = -1;
        this.I = 1.0f;
        this.J = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.K = 0.0f;
        this.L = false;
        this.N = false;
        this.O = 0;
        this.P = 0;
        this.Q = new d(this, d.b.LEFT);
        this.R = new d(this, d.b.TOP);
        this.S = new d(this, d.b.RIGHT);
        this.T = new d(this, d.b.BOTTOM);
        this.U = new d(this, d.b.BASELINE);
        this.V = new d(this, d.b.CENTER_X);
        this.W = new d(this, d.b.CENTER_Y);
        d dVar = new d(this, d.b.CENTER);
        this.X = dVar;
        this.Y = new d[]{this.Q, this.S, this.R, this.T, this.U, dVar};
        this.Z = new ArrayList<>();
        this.f22934a0 = new boolean[2];
        b bVar = b.FIXED;
        this.f22936b0 = new b[]{bVar, bVar};
        this.f22938c0 = null;
        this.f22940d0 = 0;
        this.f22942e0 = 0;
        this.f22944f0 = 0.0f;
        this.f22946g0 = -1;
        this.f22948h0 = 0;
        this.f22950i0 = 0;
        this.f22952j0 = 0;
        this.f22954k0 = 0;
        this.f22956l0 = 0;
        this.f22958m0 = 0;
        this.f22960n0 = 0;
        float f4 = f22932z1;
        this.f22966q0 = f4;
        this.f22968r0 = f4;
        this.f22972t0 = 0;
        this.f22974u0 = 0;
        this.f22976v0 = false;
        this.f22978w0 = null;
        this.f22980x0 = null;
        this.I0 = false;
        this.J0 = 0;
        this.K0 = 0;
        this.N0 = new float[]{-1.0f, -1.0f};
        this.O0 = new e[]{null, null};
        this.P0 = new e[]{null, null};
        this.Q0 = null;
        this.R0 = null;
        this.S0 = -1;
        this.T0 = -1;
        d();
        j1(str);
    }

    public e(int i4, int i5, int i6, int i7) {
        this.f22933a = false;
        this.f22935b = new p[2];
        this.f22941e = null;
        this.f22943f = null;
        this.f22945g = new boolean[]{true, true};
        this.f22947h = false;
        this.f22949i = true;
        this.f22951j = false;
        this.f22953k = true;
        this.f22955l = -1;
        this.f22957m = -1;
        this.f22959n = new r(this);
        this.f22963p = false;
        this.f22965q = false;
        this.f22967r = false;
        this.f22969s = false;
        this.f22971t = -1;
        this.f22973u = -1;
        this.f22975v = 0;
        this.f22977w = 0;
        this.f22979x = 0;
        this.f22981y = new int[2];
        this.f22983z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = 0;
        this.D = 0;
        this.E = 1.0f;
        this.H = -1;
        this.I = 1.0f;
        this.J = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.K = 0.0f;
        this.L = false;
        this.N = false;
        this.O = 0;
        this.P = 0;
        this.Q = new d(this, d.b.LEFT);
        this.R = new d(this, d.b.TOP);
        this.S = new d(this, d.b.RIGHT);
        this.T = new d(this, d.b.BOTTOM);
        this.U = new d(this, d.b.BASELINE);
        this.V = new d(this, d.b.CENTER_X);
        this.W = new d(this, d.b.CENTER_Y);
        d dVar = new d(this, d.b.CENTER);
        this.X = dVar;
        this.Y = new d[]{this.Q, this.S, this.R, this.T, this.U, dVar};
        this.Z = new ArrayList<>();
        this.f22934a0 = new boolean[2];
        b bVar = b.FIXED;
        this.f22936b0 = new b[]{bVar, bVar};
        this.f22938c0 = null;
        this.f22944f0 = 0.0f;
        this.f22946g0 = -1;
        this.f22952j0 = 0;
        this.f22954k0 = 0;
        this.f22956l0 = 0;
        this.f22958m0 = 0;
        this.f22960n0 = 0;
        float f4 = f22932z1;
        this.f22966q0 = f4;
        this.f22968r0 = f4;
        this.f22972t0 = 0;
        this.f22974u0 = 0;
        this.f22976v0 = false;
        this.f22978w0 = null;
        this.f22980x0 = null;
        this.I0 = false;
        this.J0 = 0;
        this.K0 = 0;
        this.N0 = new float[]{-1.0f, -1.0f};
        this.O0 = new e[]{null, null};
        this.P0 = new e[]{null, null};
        this.Q0 = null;
        this.R0 = null;
        this.S0 = -1;
        this.T0 = -1;
        this.f22948h0 = i4;
        this.f22950i0 = i5;
        this.f22940d0 = i6;
        this.f22942e0 = i7;
        d();
    }

    public e(String str, int i4, int i5, int i6, int i7) {
        this(i4, i5, i6, i7);
        j1(str);
    }

    public e(int i4, int i5) {
        this(0, 0, i4, i5);
    }

    public e(String str, int i4, int i5) {
        this(0, 0, i4, i5);
        j1(str);
    }
}
