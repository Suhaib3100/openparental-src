package androidx.constraintlayout.solver;

import androidx.constraintlayout.motion.widget.r;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: SolverVariable.java */
/* loaded from: classes.dex */
public class k {
    public static final int A = 7;
    public static final int B = 8;
    private static int C = 1;
    private static int D = 1;
    private static int E = 1;
    private static int F = 1;
    private static int G = 1;
    static final int H = 9;

    /* renamed from: r, reason: collision with root package name */
    private static final boolean f2221r = false;

    /* renamed from: s, reason: collision with root package name */
    private static final boolean f2222s = false;

    /* renamed from: t, reason: collision with root package name */
    public static final int f2223t = 0;

    /* renamed from: u, reason: collision with root package name */
    public static final int f2224u = 1;

    /* renamed from: v, reason: collision with root package name */
    public static final int f2225v = 2;

    /* renamed from: w, reason: collision with root package name */
    public static final int f2226w = 3;

    /* renamed from: x, reason: collision with root package name */
    public static final int f2227x = 4;

    /* renamed from: y, reason: collision with root package name */
    public static final int f2228y = 5;

    /* renamed from: z, reason: collision with root package name */
    public static final int f2229z = 6;

    /* renamed from: a, reason: collision with root package name */
    public boolean f2230a;

    /* renamed from: b, reason: collision with root package name */
    private String f2231b;

    /* renamed from: c, reason: collision with root package name */
    public int f2232c;

    /* renamed from: d, reason: collision with root package name */
    int f2233d;

    /* renamed from: e, reason: collision with root package name */
    public int f2234e;

    /* renamed from: f, reason: collision with root package name */
    public float f2235f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2236g;

    /* renamed from: h, reason: collision with root package name */
    float[] f2237h;

    /* renamed from: i, reason: collision with root package name */
    float[] f2238i;

    /* renamed from: j, reason: collision with root package name */
    b f2239j;

    /* renamed from: k, reason: collision with root package name */
    androidx.constraintlayout.solver.b[] f2240k;

    /* renamed from: l, reason: collision with root package name */
    int f2241l;

    /* renamed from: m, reason: collision with root package name */
    public int f2242m;

    /* renamed from: n, reason: collision with root package name */
    boolean f2243n;

    /* renamed from: o, reason: collision with root package name */
    int f2244o;

    /* renamed from: p, reason: collision with root package name */
    float f2245p;

    /* renamed from: q, reason: collision with root package name */
    HashSet<androidx.constraintlayout.solver.b> f2246q;

    /* compiled from: SolverVariable.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2247a;

        static {
            int[] iArr = new int[b.values().length];
            f2247a = iArr;
            try {
                iArr[b.UNRESTRICTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2247a[b.CONSTANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2247a[b.SLACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2247a[b.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2247a[b.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: SolverVariable.java */
    public enum b {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public k(String str, b bVar) {
        this.f2232c = -1;
        this.f2233d = -1;
        this.f2234e = 0;
        this.f2236g = false;
        this.f2237h = new float[9];
        this.f2238i = new float[9];
        this.f2240k = new androidx.constraintlayout.solver.b[16];
        this.f2241l = 0;
        this.f2242m = 0;
        this.f2243n = false;
        this.f2244o = -1;
        this.f2245p = 0.0f;
        this.f2246q = null;
        this.f2231b = str;
        this.f2239j = bVar;
    }

    private static String d(b bVar, String str) {
        if (str != null) {
            StringBuilder a6 = r.a(str);
            a6.append(D);
            return a6.toString();
        }
        int i5 = a.f2247a[bVar.ordinal()];
        if (i5 == 1) {
            StringBuilder sb = new StringBuilder("U");
            int i6 = E + 1;
            E = i6;
            sb.append(i6);
            return sb.toString();
        }
        if (i5 == 2) {
            StringBuilder sb2 = new StringBuilder("C");
            int i7 = F + 1;
            F = i7;
            sb2.append(i7);
            return sb2.toString();
        }
        if (i5 == 3) {
            StringBuilder sb3 = new StringBuilder("S");
            int i8 = C + 1;
            C = i8;
            sb3.append(i8);
            return sb3.toString();
        }
        if (i5 == 4) {
            StringBuilder sb4 = new StringBuilder("e");
            int i9 = D + 1;
            D = i9;
            sb4.append(i9);
            return sb4.toString();
        }
        if (i5 != 5) {
            throw new AssertionError(bVar.name());
        }
        StringBuilder sb5 = new StringBuilder("V");
        int i10 = G + 1;
        G = i10;
        sb5.append(i10);
        return sb5.toString();
    }

    static void e() {
        D++;
    }

    public final void a(androidx.constraintlayout.solver.b bVar) {
        int i5 = 0;
        while (true) {
            int i6 = this.f2241l;
            if (i5 >= i6) {
                androidx.constraintlayout.solver.b[] bVarArr = this.f2240k;
                if (i6 >= bVarArr.length) {
                    this.f2240k = (androidx.constraintlayout.solver.b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                androidx.constraintlayout.solver.b[] bVarArr2 = this.f2240k;
                int i7 = this.f2241l;
                bVarArr2[i7] = bVar;
                this.f2241l = i7 + 1;
                return;
            }
            if (this.f2240k[i5] == bVar) {
                return;
            } else {
                i5++;
            }
        }
    }

    void b() {
        for (int i5 = 0; i5 < 9; i5++) {
            this.f2237h[i5] = 0.0f;
        }
    }

    public String c() {
        return this.f2231b;
    }

    public final void f(androidx.constraintlayout.solver.b bVar) {
        int i5 = this.f2241l;
        int i6 = 0;
        while (i6 < i5) {
            if (this.f2240k[i6] == bVar) {
                while (i6 < i5 - 1) {
                    androidx.constraintlayout.solver.b[] bVarArr = this.f2240k;
                    int i7 = i6 + 1;
                    bVarArr[i6] = bVarArr[i7];
                    i6 = i7;
                }
                this.f2241l--;
                return;
            }
            i6++;
        }
    }

    public void g() {
        this.f2231b = null;
        this.f2239j = b.UNKNOWN;
        this.f2234e = 0;
        this.f2232c = -1;
        this.f2233d = -1;
        this.f2235f = 0.0f;
        this.f2236g = false;
        this.f2243n = false;
        this.f2244o = -1;
        this.f2245p = 0.0f;
        int i5 = this.f2241l;
        for (int i6 = 0; i6 < i5; i6++) {
            this.f2240k[i6] = null;
        }
        this.f2241l = 0;
        this.f2242m = 0;
        this.f2230a = false;
        Arrays.fill(this.f2238i, 0.0f);
    }

    public void h(g gVar, float f6) {
        this.f2235f = f6;
        this.f2236g = true;
        this.f2243n = false;
        this.f2244o = -1;
        this.f2245p = 0.0f;
        int i5 = this.f2241l;
        this.f2233d = -1;
        for (int i6 = 0; i6 < i5; i6++) {
            this.f2240k[i6].a(gVar, this, false);
        }
        this.f2241l = 0;
    }

    public void i(String str) {
        this.f2231b = str;
    }

    public void j(g gVar, k kVar, float f6) {
        this.f2243n = true;
        this.f2244o = kVar.f2232c;
        this.f2245p = f6;
        int i5 = this.f2241l;
        this.f2233d = -1;
        for (int i6 = 0; i6 < i5; i6++) {
            this.f2240k[i6].G(gVar, this, false);
        }
        this.f2241l = 0;
        gVar.z();
    }

    public void k(b bVar, String str) {
        this.f2239j = bVar;
    }

    String l() {
        String str = this + "[";
        int i5 = 0;
        boolean z5 = false;
        boolean z6 = true;
        while (i5 < this.f2237h.length) {
            StringBuilder a6 = r.a(str);
            a6.append(this.f2237h[i5]);
            String sb = a6.toString();
            float[] fArr = this.f2237h;
            float f6 = fArr[i5];
            if (f6 > 0.0f) {
                z5 = false;
            } else if (f6 < 0.0f) {
                z5 = true;
            }
            if (f6 != 0.0f) {
                z6 = false;
            }
            str = i5 < fArr.length - 1 ? androidx.concurrent.futures.b.a(sb, ", ") : androidx.concurrent.futures.b.a(sb, "] ");
            i5++;
        }
        if (z5) {
            str = androidx.concurrent.futures.b.a(str, " (-)");
        }
        return z6 ? androidx.concurrent.futures.b.a(str, " (*)") : str;
    }

    public final void m(g gVar, androidx.constraintlayout.solver.b bVar) {
        int i5 = this.f2241l;
        for (int i6 = 0; i6 < i5; i6++) {
            this.f2240k[i6].c(gVar, bVar, false);
        }
        this.f2241l = 0;
    }

    public String toString() {
        if (this.f2231b != null) {
            return "" + this.f2231b;
        }
        return "" + this.f2232c;
    }

    public k(b bVar, String str) {
        this.f2232c = -1;
        this.f2233d = -1;
        this.f2234e = 0;
        this.f2236g = false;
        this.f2237h = new float[9];
        this.f2238i = new float[9];
        this.f2240k = new androidx.constraintlayout.solver.b[16];
        this.f2241l = 0;
        this.f2242m = 0;
        this.f2243n = false;
        this.f2244o = -1;
        this.f2245p = 0.0f;
        this.f2246q = null;
        this.f2239j = bVar;
    }
}
