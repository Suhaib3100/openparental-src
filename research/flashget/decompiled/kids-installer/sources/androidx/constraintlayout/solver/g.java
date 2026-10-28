package androidx.constraintlayout.solver;

import androidx.constraintlayout.motion.widget.r;
import androidx.constraintlayout.solver.k;
import androidx.constraintlayout.solver.widgets.d;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: LinearSystem.java */
/* loaded from: classes.dex */
public class g {
    public static boolean A = false;
    private static int B = 1000;
    public static h C = null;
    public static long D = 0;
    public static long E = 0;

    /* renamed from: r, reason: collision with root package name */
    public static final boolean f2152r = false;

    /* renamed from: s, reason: collision with root package name */
    public static final boolean f2153s = false;

    /* renamed from: t, reason: collision with root package name */
    public static final boolean f2154t = false;

    /* renamed from: u, reason: collision with root package name */
    private static final boolean f2155u = false;

    /* renamed from: v, reason: collision with root package name */
    public static boolean f2156v = false;

    /* renamed from: w, reason: collision with root package name */
    public static boolean f2157w = true;

    /* renamed from: x, reason: collision with root package name */
    public static boolean f2158x = true;

    /* renamed from: y, reason: collision with root package name */
    public static boolean f2159y = true;

    /* renamed from: z, reason: collision with root package name */
    public static boolean f2160z = true;

    /* renamed from: d, reason: collision with root package name */
    private a f2164d;

    /* renamed from: g, reason: collision with root package name */
    androidx.constraintlayout.solver.b[] f2167g;

    /* renamed from: n, reason: collision with root package name */
    final c f2174n;

    /* renamed from: q, reason: collision with root package name */
    private a f2177q;

    /* renamed from: a, reason: collision with root package name */
    public boolean f2161a = false;

    /* renamed from: b, reason: collision with root package name */
    int f2162b = 0;

    /* renamed from: c, reason: collision with root package name */
    private HashMap<String, k> f2163c = null;

    /* renamed from: e, reason: collision with root package name */
    private int f2165e = 32;

    /* renamed from: f, reason: collision with root package name */
    private int f2166f = 32;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2168h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2169i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean[] f2170j = new boolean[32];

    /* renamed from: k, reason: collision with root package name */
    int f2171k = 1;

    /* renamed from: l, reason: collision with root package name */
    int f2172l = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f2173m = 32;

    /* renamed from: o, reason: collision with root package name */
    private k[] f2175o = new k[B];

    /* renamed from: p, reason: collision with root package name */
    private int f2176p = 0;

    /* compiled from: LinearSystem.java */
    interface a {
        void a(g gVar, k kVar, boolean z5);

        void b(k kVar);

        void c(g gVar, androidx.constraintlayout.solver.b bVar, boolean z5);

        void clear();

        k d(g gVar, boolean[] zArr);

        void e(a aVar);

        void f(g gVar);

        k getKey();

        boolean isEmpty();
    }

    /* compiled from: LinearSystem.java */
    /* loaded from: classes3.dex */
    class b extends androidx.constraintlayout.solver.b {
        public b(c cVar) {
            this.f2146e = new l(this, cVar);
        }
    }

    public g() {
        this.f2167g = null;
        this.f2167g = new androidx.constraintlayout.solver.b[32];
        W();
        c cVar = new c();
        this.f2174n = cVar;
        this.f2164d = new j(cVar);
        if (A) {
            this.f2177q = new b(cVar);
        } else {
            this.f2177q = new androidx.constraintlayout.solver.b(cVar);
        }
    }

    private void A() {
        B();
        String str = "";
        for (int i5 = 0; i5 < this.f2172l; i5++) {
            StringBuilder a6 = r.a(str);
            a6.append(this.f2167g[i5]);
            str = androidx.concurrent.futures.b.a(a6.toString(), "\n");
        }
        StringBuilder a7 = r.a(str);
        a7.append(this.f2164d);
        a7.append("\n");
        System.out.println(a7.toString());
    }

    private void B() {
        StringBuilder sb = new StringBuilder("Display Rows (");
        sb.append(this.f2172l);
        sb.append("x");
        System.out.println(e.a(sb, this.f2171k, ")\n"));
    }

    private int E(a aVar) throws Exception {
        boolean z5;
        int i5 = 0;
        while (true) {
            if (i5 >= this.f2172l) {
                z5 = false;
                break;
            }
            androidx.constraintlayout.solver.b bVar = this.f2167g[i5];
            if (bVar.f2142a.f2239j != k.b.UNRESTRICTED && bVar.f2143b < 0.0f) {
                z5 = true;
                break;
            }
            i5++;
        }
        if (!z5) {
            return 0;
        }
        boolean z6 = false;
        int i6 = 0;
        while (!z6) {
            h hVar = C;
            if (hVar != null) {
                hVar.f2193o++;
            }
            i6++;
            float f6 = Float.MAX_VALUE;
            int i7 = -1;
            int i8 = -1;
            int i9 = 0;
            for (int i10 = 0; i10 < this.f2172l; i10++) {
                androidx.constraintlayout.solver.b bVar2 = this.f2167g[i10];
                if (bVar2.f2142a.f2239j != k.b.UNRESTRICTED && !bVar2.f2147f && bVar2.f2143b < 0.0f) {
                    int i11 = 9;
                    if (f2160z) {
                        int d6 = bVar2.f2146e.d();
                        int i12 = 0;
                        while (i12 < d6) {
                            k f7 = bVar2.f2146e.f(i12);
                            float j5 = bVar2.f2146e.j(f7);
                            if (j5 > 0.0f) {
                                int i13 = 0;
                                while (i13 < i11) {
                                    float f8 = f7.f2237h[i13] / j5;
                                    if ((f8 < f6 && i13 == i9) || i13 > i9) {
                                        i8 = f7.f2232c;
                                        i9 = i13;
                                        i7 = i10;
                                        f6 = f8;
                                    }
                                    i13++;
                                    i11 = 9;
                                }
                            }
                            i12++;
                            i11 = 9;
                        }
                    } else {
                        for (int i14 = 1; i14 < this.f2171k; i14++) {
                            k kVar = this.f2174n.f2151d[i14];
                            float j6 = bVar2.f2146e.j(kVar);
                            if (j6 > 0.0f) {
                                for (int i15 = 0; i15 < 9; i15++) {
                                    float f9 = kVar.f2237h[i15] / j6;
                                    if ((f9 < f6 && i15 == i9) || i15 > i9) {
                                        i8 = i14;
                                        i9 = i15;
                                        i7 = i10;
                                        f6 = f9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i7 != -1) {
                androidx.constraintlayout.solver.b bVar3 = this.f2167g[i7];
                bVar3.f2142a.f2233d = -1;
                h hVar2 = C;
                if (hVar2 != null) {
                    hVar2.f2192n++;
                }
                bVar3.C(this.f2174n.f2151d[i8]);
                k kVar2 = bVar3.f2142a;
                kVar2.f2233d = i7;
                kVar2.m(this, bVar3);
            } else {
                z6 = true;
            }
            if (i6 > this.f2171k / 2) {
                z6 = true;
            }
        }
        return i6;
    }

    private String H(int i5) {
        int i6 = i5 * 4;
        int i7 = i6 / 1024;
        int i8 = i7 / 1024;
        return i8 > 0 ? f.a("", i8, " Mb") : i7 > 0 ? f.a("", i7, " Kb") : f.a("", i6, " bytes");
    }

    private String I(int i5) {
        return i5 == 1 ? "LOW" : i5 == 2 ? "MEDIUM" : i5 == 3 ? "HIGH" : i5 == 4 ? "HIGHEST" : i5 == 5 ? "EQUALITY" : i5 == 8 ? "FIXED" : i5 == 6 ? "BARRIER" : "NONE";
    }

    public static h L() {
        return C;
    }

    private void S() {
        int i5 = this.f2165e * 2;
        this.f2165e = i5;
        this.f2167g = (androidx.constraintlayout.solver.b[]) Arrays.copyOf(this.f2167g, i5);
        c cVar = this.f2174n;
        cVar.f2151d = (k[]) Arrays.copyOf(cVar.f2151d, this.f2165e);
        int i6 = this.f2165e;
        this.f2170j = new boolean[i6];
        this.f2166f = i6;
        this.f2173m = i6;
        h hVar = C;
        if (hVar != null) {
            hVar.f2186h++;
            hVar.f2198t = Math.max(hVar.f2198t, i6);
            h hVar2 = C;
            hVar2.J = hVar2.f2198t;
        }
    }

    private final int V(a aVar, boolean z5) {
        h hVar = C;
        if (hVar != null) {
            hVar.f2190l++;
        }
        for (int i5 = 0; i5 < this.f2171k; i5++) {
            this.f2170j[i5] = false;
        }
        boolean z6 = false;
        int i6 = 0;
        while (!z6) {
            h hVar2 = C;
            if (hVar2 != null) {
                hVar2.f2191m++;
            }
            i6++;
            if (i6 >= this.f2171k * 2) {
                return i6;
            }
            if (aVar.getKey() != null) {
                this.f2170j[aVar.getKey().f2232c] = true;
            }
            k d6 = aVar.d(this, this.f2170j);
            if (d6 != null) {
                boolean[] zArr = this.f2170j;
                int i7 = d6.f2232c;
                if (zArr[i7]) {
                    return i6;
                }
                zArr[i7] = true;
            }
            if (d6 != null) {
                float f6 = Float.MAX_VALUE;
                int i8 = -1;
                for (int i9 = 0; i9 < this.f2172l; i9++) {
                    androidx.constraintlayout.solver.b bVar = this.f2167g[i9];
                    if (bVar.f2142a.f2239j != k.b.UNRESTRICTED && !bVar.f2147f && bVar.y(d6)) {
                        float j5 = bVar.f2146e.j(d6);
                        if (j5 < 0.0f) {
                            float f7 = (-bVar.f2143b) / j5;
                            if (f7 < f6) {
                                i8 = i9;
                                f6 = f7;
                            }
                        }
                    }
                }
                if (i8 > -1) {
                    androidx.constraintlayout.solver.b bVar2 = this.f2167g[i8];
                    bVar2.f2142a.f2233d = -1;
                    h hVar3 = C;
                    if (hVar3 != null) {
                        hVar3.f2192n++;
                    }
                    bVar2.C(d6);
                    k kVar = bVar2.f2142a;
                    kVar.f2233d = i8;
                    kVar.m(this, bVar2);
                }
            } else {
                z6 = true;
            }
        }
        return i6;
    }

    private void W() {
        int i5 = 0;
        if (A) {
            while (i5 < this.f2172l) {
                androidx.constraintlayout.solver.b bVar = this.f2167g[i5];
                if (bVar != null) {
                    this.f2174n.f2148a.a(bVar);
                }
                this.f2167g[i5] = null;
                i5++;
            }
            return;
        }
        while (i5 < this.f2172l) {
            androidx.constraintlayout.solver.b bVar2 = this.f2167g[i5];
            if (bVar2 != null) {
                this.f2174n.f2149b.a(bVar2);
            }
            this.f2167g[i5] = null;
            i5++;
        }
    }

    private k a(k.b bVar, String str) {
        k b6 = this.f2174n.f2150c.b();
        if (b6 == null) {
            b6 = new k(bVar, str);
            b6.f2239j = bVar;
        } else {
            b6.g();
            b6.k(bVar, str);
        }
        int i5 = this.f2176p;
        int i6 = B;
        if (i5 >= i6) {
            int i7 = i6 * 2;
            B = i7;
            this.f2175o = (k[]) Arrays.copyOf(this.f2175o, i7);
        }
        k[] kVarArr = this.f2175o;
        int i8 = this.f2176p;
        this.f2176p = i8 + 1;
        kVarArr[i8] = b6;
        return b6;
    }

    private void g(androidx.constraintlayout.solver.b bVar) {
        bVar.g(this, 0);
    }

    private final void m(androidx.constraintlayout.solver.b bVar) {
        int i5;
        if (f2158x && bVar.f2147f) {
            bVar.f2142a.h(this, bVar.f2143b);
        } else {
            androidx.constraintlayout.solver.b[] bVarArr = this.f2167g;
            int i6 = this.f2172l;
            bVarArr[i6] = bVar;
            k kVar = bVar.f2142a;
            kVar.f2233d = i6;
            this.f2172l = i6 + 1;
            kVar.m(this, bVar);
        }
        if (f2158x && this.f2161a) {
            int i7 = 0;
            while (i7 < this.f2172l) {
                if (this.f2167g[i7] == null) {
                    System.out.println("WTF");
                }
                androidx.constraintlayout.solver.b bVar2 = this.f2167g[i7];
                if (bVar2 != null && bVar2.f2147f) {
                    bVar2.f2142a.h(this, bVar2.f2143b);
                    if (A) {
                        this.f2174n.f2148a.a(bVar2);
                    } else {
                        this.f2174n.f2149b.a(bVar2);
                    }
                    this.f2167g[i7] = null;
                    int i8 = i7 + 1;
                    int i9 = i8;
                    while (true) {
                        i5 = this.f2172l;
                        if (i8 >= i5) {
                            break;
                        }
                        androidx.constraintlayout.solver.b[] bVarArr2 = this.f2167g;
                        int i10 = i8 - 1;
                        androidx.constraintlayout.solver.b bVar3 = bVarArr2[i8];
                        bVarArr2[i10] = bVar3;
                        k kVar2 = bVar3.f2142a;
                        if (kVar2.f2233d == i8) {
                            kVar2.f2233d = i10;
                        }
                        i9 = i8;
                        i8++;
                    }
                    if (i9 < i5) {
                        this.f2167g[i9] = null;
                    }
                    this.f2172l = i5 - 1;
                    i7--;
                }
                i7++;
            }
            this.f2161a = false;
        }
    }

    private void n(androidx.constraintlayout.solver.b bVar, int i5) {
        o(bVar, i5, 0);
    }

    private void r() {
        for (int i5 = 0; i5 < this.f2172l; i5++) {
            androidx.constraintlayout.solver.b bVar = this.f2167g[i5];
            bVar.f2142a.f2235f = bVar.f2143b;
        }
    }

    public static androidx.constraintlayout.solver.b w(g gVar, k kVar, k kVar2, float f6) {
        return gVar.v().m(kVar, kVar2, f6);
    }

    private k y(String str, k.b bVar) {
        h hVar = C;
        if (hVar != null) {
            hVar.f2194p++;
        }
        if (this.f2171k + 1 >= this.f2166f) {
            S();
        }
        k a6 = a(bVar, null);
        a6.i(str);
        int i5 = this.f2162b + 1;
        this.f2162b = i5;
        this.f2171k++;
        a6.f2232c = i5;
        if (this.f2163c == null) {
            this.f2163c = new HashMap<>();
        }
        this.f2163c.put(str, a6);
        this.f2174n.f2151d[this.f2162b] = a6;
        return a6;
    }

    void C() {
        int i5 = 0;
        for (int i6 = 0; i6 < this.f2165e; i6++) {
            androidx.constraintlayout.solver.b bVar = this.f2167g[i6];
            if (bVar != null) {
                i5 += bVar.E();
            }
        }
        int i7 = 0;
        for (int i8 = 0; i8 < this.f2172l; i8++) {
            androidx.constraintlayout.solver.b bVar2 = this.f2167g[i8];
            if (bVar2 != null) {
                i7 += bVar2.E();
            }
        }
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder("Linear System -> Table size: ");
        sb.append(this.f2165e);
        sb.append(" (");
        int i9 = this.f2165e;
        sb.append(H(i9 * i9));
        sb.append(") -- row sizes: ");
        sb.append(H(i5));
        sb.append(", actual size: ");
        sb.append(H(i7));
        sb.append(" rows: ");
        sb.append(this.f2172l);
        sb.append("/");
        sb.append(this.f2173m);
        sb.append(" cols: ");
        sb.append(this.f2171k);
        sb.append("/");
        sb.append(this.f2166f);
        sb.append(" 0 occupied cells, ");
        sb.append(H(0));
        printStream.println(sb.toString());
    }

    public void D() {
        B();
        String str = "";
        for (int i5 = 0; i5 < this.f2172l; i5++) {
            if (this.f2167g[i5].f2142a.f2239j == k.b.UNRESTRICTED) {
                StringBuilder a6 = r.a(str);
                a6.append(this.f2167g[i5].F());
                str = androidx.concurrent.futures.b.a(a6.toString(), "\n");
            }
        }
        StringBuilder a7 = r.a(str);
        a7.append(this.f2164d);
        a7.append("\n");
        System.out.println(a7.toString());
    }

    public void F(h hVar) {
        C = hVar;
    }

    public c G() {
        return this.f2174n;
    }

    a J() {
        return this.f2164d;
    }

    public int K() {
        int i5 = 0;
        for (int i6 = 0; i6 < this.f2172l; i6++) {
            androidx.constraintlayout.solver.b bVar = this.f2167g[i6];
            if (bVar != null) {
                i5 += bVar.E();
            }
        }
        return i5;
    }

    public int M() {
        return this.f2172l;
    }

    public int N() {
        return this.f2162b;
    }

    public int O(Object obj) {
        k j5 = ((androidx.constraintlayout.solver.widgets.d) obj).j();
        if (j5 != null) {
            return (int) (j5.f2235f + 0.5f);
        }
        return 0;
    }

    androidx.constraintlayout.solver.b P(int i5) {
        return this.f2167g[i5];
    }

    float Q(String str) {
        k R = R(str, k.b.UNRESTRICTED);
        if (R == null) {
            return 0.0f;
        }
        return R.f2235f;
    }

    k R(String str, k.b bVar) {
        if (this.f2163c == null) {
            this.f2163c = new HashMap<>();
        }
        k kVar = this.f2163c.get(str);
        return kVar == null ? y(str, bVar) : kVar;
    }

    public void T() throws Exception {
        h hVar = C;
        if (hVar != null) {
            hVar.f2187i++;
        }
        if (this.f2164d.isEmpty()) {
            r();
            return;
        }
        if (!this.f2168h && !this.f2169i) {
            U(this.f2164d);
            return;
        }
        h hVar2 = C;
        if (hVar2 != null) {
            hVar2.f2200v++;
        }
        boolean z5 = false;
        int i5 = 0;
        while (true) {
            if (i5 >= this.f2172l) {
                z5 = true;
                break;
            } else if (!this.f2167g[i5].f2147f) {
                break;
            } else {
                i5++;
            }
        }
        if (!z5) {
            U(this.f2164d);
            return;
        }
        h hVar3 = C;
        if (hVar3 != null) {
            hVar3.f2199u++;
        }
        r();
    }

    void U(a aVar) throws Exception {
        h hVar = C;
        if (hVar != null) {
            hVar.f2204z++;
            hVar.A = Math.max(hVar.A, this.f2171k);
            h hVar2 = C;
            hVar2.B = Math.max(hVar2.B, this.f2172l);
        }
        E(aVar);
        V(aVar, false);
        r();
    }

    public void X(androidx.constraintlayout.solver.b bVar) {
        k kVar;
        int i5;
        if (!bVar.f2147f || (kVar = bVar.f2142a) == null) {
            return;
        }
        int i6 = kVar.f2233d;
        if (i6 != -1) {
            while (true) {
                i5 = this.f2172l;
                if (i6 >= i5 - 1) {
                    break;
                }
                androidx.constraintlayout.solver.b[] bVarArr = this.f2167g;
                int i7 = i6 + 1;
                androidx.constraintlayout.solver.b bVar2 = bVarArr[i7];
                k kVar2 = bVar2.f2142a;
                if (kVar2.f2233d == i7) {
                    kVar2.f2233d = i6;
                }
                bVarArr[i6] = bVar2;
                i6 = i7;
            }
            this.f2172l = i5 - 1;
        }
        k kVar3 = bVar.f2142a;
        if (!kVar3.f2236g) {
            kVar3.h(this, bVar.f2143b);
        }
        if (A) {
            this.f2174n.f2148a.a(bVar);
        } else {
            this.f2174n.f2149b.a(bVar);
        }
    }

    public void Y() {
        c cVar;
        int i5 = 0;
        while (true) {
            cVar = this.f2174n;
            k[] kVarArr = cVar.f2151d;
            if (i5 >= kVarArr.length) {
                break;
            }
            k kVar = kVarArr[i5];
            if (kVar != null) {
                kVar.g();
            }
            i5++;
        }
        cVar.f2150c.c(this.f2175o, this.f2176p);
        this.f2176p = 0;
        Arrays.fill(this.f2174n.f2151d, (Object) null);
        HashMap<String, k> hashMap = this.f2163c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f2162b = 0;
        this.f2164d.clear();
        this.f2171k = 1;
        for (int i6 = 0; i6 < this.f2172l; i6++) {
            androidx.constraintlayout.solver.b bVar = this.f2167g[i6];
            if (bVar != null) {
                bVar.f2144c = false;
            }
        }
        W();
        this.f2172l = 0;
        if (A) {
            this.f2177q = new b(this.f2174n);
        } else {
            this.f2177q = new androidx.constraintlayout.solver.b(this.f2174n);
        }
    }

    public void b(androidx.constraintlayout.solver.widgets.e eVar, androidx.constraintlayout.solver.widgets.e eVar2, float f6, int i5) {
        d.b bVar = d.b.LEFT;
        k u5 = u(eVar.r(bVar));
        d.b bVar2 = d.b.TOP;
        k u6 = u(eVar.r(bVar2));
        d.b bVar3 = d.b.RIGHT;
        k u7 = u(eVar.r(bVar3));
        d.b bVar4 = d.b.BOTTOM;
        k u8 = u(eVar.r(bVar4));
        k u9 = u(eVar2.r(bVar));
        k u10 = u(eVar2.r(bVar2));
        k u11 = u(eVar2.r(bVar3));
        k u12 = u(eVar2.r(bVar4));
        androidx.constraintlayout.solver.b v5 = v();
        double d6 = f6;
        double d7 = i5;
        v5.v(u6, u8, u10, u12, (float) (Math.sin(d6) * d7));
        d(v5);
        androidx.constraintlayout.solver.b v6 = v();
        v6.v(u5, u7, u9, u11, (float) (Math.cos(d6) * d7));
        d(v6);
    }

    public void c(k kVar, k kVar2, int i5, float f6, k kVar3, k kVar4, int i6, int i7) {
        androidx.constraintlayout.solver.b v5 = v();
        v5.k(kVar, kVar2, i5, f6, kVar3, kVar4, i6);
        if (i7 != 8) {
            v5.g(this, i7);
        }
        d(v5);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(androidx.constraintlayout.solver.b r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L3
            return
        L3:
            androidx.constraintlayout.solver.h r0 = androidx.constraintlayout.solver.g.C
            r1 = 1
            if (r0 == 0) goto L17
            long r3 = r0.f2188j
            long r3 = r3 + r1
            r0.f2188j = r3
            boolean r3 = r8.f2147f
            if (r3 == 0) goto L17
            long r3 = r0.f2189k
            long r3 = r3 + r1
            r0.f2189k = r3
        L17:
            int r0 = r7.f2172l
            r3 = 1
            int r0 = r0 + r3
            int r4 = r7.f2173m
            if (r0 >= r4) goto L26
            int r0 = r7.f2171k
            int r0 = r0 + r3
            int r4 = r7.f2166f
            if (r0 < r4) goto L29
        L26:
            r7.S()
        L29:
            boolean r0 = r8.f2147f
            r4 = 0
            if (r0 != 0) goto La1
            r8.f(r7)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L38
            return
        L38:
            r8.w()
            boolean r0 = r8.i(r7)
            if (r0 == 0) goto L98
            androidx.constraintlayout.solver.k r0 = r7.t()
            r8.f2142a = r0
            int r5 = r7.f2172l
            r7.m(r8)
            int r6 = r7.f2172l
            int r5 = r5 + r3
            if (r6 != r5) goto L98
            androidx.constraintlayout.solver.g$a r4 = r7.f2177q
            r4.e(r8)
            androidx.constraintlayout.solver.g$a r4 = r7.f2177q
            r7.V(r4, r3)
            int r4 = r0.f2233d
            r5 = -1
            if (r4 != r5) goto L99
            androidx.constraintlayout.solver.k r4 = r8.f2142a
            if (r4 != r0) goto L76
            androidx.constraintlayout.solver.k r0 = r8.A(r0)
            if (r0 == 0) goto L76
            androidx.constraintlayout.solver.h r4 = androidx.constraintlayout.solver.g.C
            if (r4 == 0) goto L73
            long r5 = r4.f2192n
            long r5 = r5 + r1
            r4.f2192n = r5
        L73:
            r8.C(r0)
        L76:
            boolean r0 = r8.f2147f
            if (r0 != 0) goto L7f
            androidx.constraintlayout.solver.k r0 = r8.f2142a
            r0.m(r7, r8)
        L7f:
            boolean r0 = androidx.constraintlayout.solver.g.A
            if (r0 == 0) goto L8b
            androidx.constraintlayout.solver.c r0 = r7.f2174n
            androidx.constraintlayout.solver.i$a<androidx.constraintlayout.solver.b> r0 = r0.f2148a
            r0.a(r8)
            goto L92
        L8b:
            androidx.constraintlayout.solver.c r0 = r7.f2174n
            androidx.constraintlayout.solver.i$a<androidx.constraintlayout.solver.b> r0 = r0.f2149b
            r0.a(r8)
        L92:
            int r0 = r7.f2172l
            int r0 = r0 - r3
            r7.f2172l = r0
            goto L99
        L98:
            r3 = r4
        L99:
            boolean r0 = r8.x()
            if (r0 != 0) goto La0
            return
        La0:
            r4 = r3
        La1:
            if (r4 != 0) goto La6
            r7.m(r8)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.g.d(androidx.constraintlayout.solver.b):void");
    }

    public androidx.constraintlayout.solver.b e(k kVar, k kVar2, int i5, int i6) {
        if (f2157w && i6 == 8 && kVar2.f2236g && kVar.f2233d == -1) {
            kVar.h(this, kVar2.f2235f + i5);
            return null;
        }
        androidx.constraintlayout.solver.b v5 = v();
        v5.r(kVar, kVar2, i5);
        if (i6 != 8) {
            v5.g(this, i6);
        }
        d(v5);
        return v5;
    }

    public void f(k kVar, int i5) {
        if (f2157w && kVar.f2233d == -1) {
            float f6 = i5;
            kVar.h(this, f6);
            for (int i6 = 0; i6 < this.f2162b + 1; i6++) {
                k kVar2 = this.f2174n.f2151d[i6];
                if (kVar2 != null && kVar2.f2243n && kVar2.f2244o == kVar.f2232c) {
                    kVar2.h(this, kVar2.f2245p + f6);
                }
            }
            return;
        }
        int i7 = kVar.f2233d;
        if (i7 == -1) {
            androidx.constraintlayout.solver.b v5 = v();
            v5.l(kVar, i5);
            d(v5);
            return;
        }
        androidx.constraintlayout.solver.b bVar = this.f2167g[i7];
        if (bVar.f2147f) {
            bVar.f2143b = i5;
            return;
        }
        if (bVar.f2146e.d() == 0) {
            bVar.f2147f = true;
            bVar.f2143b = i5;
        } else {
            androidx.constraintlayout.solver.b v6 = v();
            v6.q(kVar, i5);
            d(v6);
        }
    }

    public void h(k kVar, k kVar2, int i5, boolean z5) {
        androidx.constraintlayout.solver.b v5 = v();
        k x5 = x();
        x5.f2234e = 0;
        v5.t(kVar, kVar2, x5, i5);
        d(v5);
    }

    public void i(k kVar, k kVar2, int i5, int i6) {
        androidx.constraintlayout.solver.b v5 = v();
        k x5 = x();
        x5.f2234e = 0;
        v5.t(kVar, kVar2, x5, i5);
        if (i6 != 8) {
            o(v5, (int) (v5.f2146e.j(x5) * (-1.0f)), i6);
        }
        d(v5);
    }

    public void j(k kVar, k kVar2, int i5, boolean z5) {
        androidx.constraintlayout.solver.b v5 = v();
        k x5 = x();
        x5.f2234e = 0;
        v5.u(kVar, kVar2, x5, i5);
        d(v5);
    }

    public void k(k kVar, k kVar2, int i5, int i6) {
        androidx.constraintlayout.solver.b v5 = v();
        k x5 = x();
        x5.f2234e = 0;
        v5.u(kVar, kVar2, x5, i5);
        if (i6 != 8) {
            o(v5, (int) (v5.f2146e.j(x5) * (-1.0f)), i6);
        }
        d(v5);
    }

    public void l(k kVar, k kVar2, k kVar3, k kVar4, float f6, int i5) {
        androidx.constraintlayout.solver.b v5 = v();
        v5.n(kVar, kVar2, kVar3, kVar4, f6);
        if (i5 != 8) {
            v5.g(this, i5);
        }
        d(v5);
    }

    void o(androidx.constraintlayout.solver.b bVar, int i5, int i6) {
        bVar.h(s(i6, null), i5);
    }

    public void p(k kVar, k kVar2, int i5) {
        if (kVar.f2233d != -1 || i5 != 0) {
            e(kVar, kVar2, i5, 8);
            return;
        }
        if (kVar2.f2243n) {
            kVar2 = this.f2174n.f2151d[kVar2.f2244o];
        }
        if (kVar.f2243n) {
            k kVar3 = this.f2174n.f2151d[kVar.f2244o];
        } else {
            kVar.j(this, kVar2, 0.0f);
        }
    }

    final void q() {
        int i5;
        int i6 = 0;
        while (i6 < this.f2172l) {
            androidx.constraintlayout.solver.b bVar = this.f2167g[i6];
            if (bVar.f2146e.d() == 0) {
                bVar.f2147f = true;
            }
            if (bVar.f2147f) {
                k kVar = bVar.f2142a;
                kVar.f2235f = bVar.f2143b;
                kVar.f(bVar);
                int i7 = i6;
                while (true) {
                    i5 = this.f2172l;
                    if (i7 >= i5 - 1) {
                        break;
                    }
                    androidx.constraintlayout.solver.b[] bVarArr = this.f2167g;
                    int i8 = i7 + 1;
                    bVarArr[i7] = bVarArr[i8];
                    i7 = i8;
                }
                this.f2167g[i5 - 1] = null;
                this.f2172l = i5 - 1;
                i6--;
                if (A) {
                    this.f2174n.f2148a.a(bVar);
                } else {
                    this.f2174n.f2149b.a(bVar);
                }
            }
            i6++;
        }
    }

    public k s(int i5, String str) {
        h hVar = C;
        if (hVar != null) {
            hVar.f2195q++;
        }
        if (this.f2171k + 1 >= this.f2166f) {
            S();
        }
        k a6 = a(k.b.ERROR, str);
        int i6 = this.f2162b + 1;
        this.f2162b = i6;
        this.f2171k++;
        a6.f2232c = i6;
        a6.f2234e = i5;
        this.f2174n.f2151d[i6] = a6;
        this.f2164d.b(a6);
        return a6;
    }

    public k t() {
        h hVar = C;
        if (hVar != null) {
            hVar.f2197s++;
        }
        if (this.f2171k + 1 >= this.f2166f) {
            S();
        }
        k a6 = a(k.b.SLACK, null);
        int i5 = this.f2162b + 1;
        this.f2162b = i5;
        this.f2171k++;
        a6.f2232c = i5;
        this.f2174n.f2151d[i5] = a6;
        return a6;
    }

    public k u(Object obj) {
        k kVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f2171k + 1 >= this.f2166f) {
            S();
        }
        if (obj instanceof androidx.constraintlayout.solver.widgets.d) {
            androidx.constraintlayout.solver.widgets.d dVar = (androidx.constraintlayout.solver.widgets.d) obj;
            kVar = dVar.j();
            if (kVar == null) {
                dVar.z(this.f2174n);
                kVar = dVar.j();
            }
            int i5 = kVar.f2232c;
            if (i5 == -1 || i5 > this.f2162b || this.f2174n.f2151d[i5] == null) {
                if (i5 != -1) {
                    kVar.g();
                }
                int i6 = this.f2162b + 1;
                this.f2162b = i6;
                this.f2171k++;
                kVar.f2232c = i6;
                kVar.f2239j = k.b.UNRESTRICTED;
                this.f2174n.f2151d[i6] = kVar;
            }
        }
        return kVar;
    }

    public androidx.constraintlayout.solver.b v() {
        androidx.constraintlayout.solver.b b6;
        if (A) {
            b6 = this.f2174n.f2148a.b();
            if (b6 == null) {
                b6 = new b(this.f2174n);
                E++;
            } else {
                b6.D();
            }
        } else {
            b6 = this.f2174n.f2149b.b();
            if (b6 == null) {
                b6 = new androidx.constraintlayout.solver.b(this.f2174n);
                D++;
            } else {
                b6.D();
            }
        }
        k.e();
        return b6;
    }

    public k x() {
        h hVar = C;
        if (hVar != null) {
            hVar.f2196r++;
        }
        if (this.f2171k + 1 >= this.f2166f) {
            S();
        }
        k a6 = a(k.b.SLACK, null);
        int i5 = this.f2162b + 1;
        this.f2162b = i5;
        this.f2171k++;
        a6.f2232c = i5;
        this.f2174n.f2151d[i5] = a6;
        return a6;
    }

    public void z() {
        B();
        String a6 = e.a(new StringBuilder(" num vars "), this.f2162b, "\n");
        for (int i5 = 0; i5 < this.f2162b + 1; i5++) {
            k kVar = this.f2174n.f2151d[i5];
            if (kVar != null && kVar.f2236g) {
                a6 = a6 + " $[" + i5 + "] => " + kVar + " = " + kVar.f2235f + "\n";
            }
        }
        String a7 = androidx.concurrent.futures.b.a(a6, "\n");
        for (int i6 = 0; i6 < this.f2162b + 1; i6++) {
            k[] kVarArr = this.f2174n.f2151d;
            k kVar2 = kVarArr[i6];
            if (kVar2 != null && kVar2.f2243n) {
                a7 = a7 + " ~[" + i6 + "] => " + kVar2 + " = " + kVarArr[kVar2.f2244o] + " + " + kVar2.f2245p + "\n";
            }
        }
        String a8 = androidx.concurrent.futures.b.a(a7, "\n\n #  ");
        for (int i7 = 0; i7 < this.f2172l; i7++) {
            StringBuilder a9 = r.a(a8);
            a9.append(this.f2167g[i7].F());
            a8 = androidx.concurrent.futures.b.a(a9.toString(), "\n #  ");
        }
        if (this.f2164d != null) {
            StringBuilder a10 = androidx.constraintlayout.motion.widget.c.a(a8, "Goal: ");
            a10.append(this.f2164d);
            a10.append("\n");
            a8 = a10.toString();
        }
        System.out.println(a8);
    }
}
