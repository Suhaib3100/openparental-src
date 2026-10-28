package androidx.constraintlayout.core;

import androidx.collection.r2;
import androidx.compose.material3.j4;
import androidx.constraintlayout.core.j;
import androidx.constraintlayout.core.widgets.d;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: LinearSystem.java */
/* loaded from: classes.dex */
public class f {
    public static boolean A = false;
    private static int B = 1000;
    public static g C = null;
    public static long D = 0;
    public static long E = 0;

    /* renamed from: r, reason: collision with root package name */
    public static final boolean f21834r = false;

    /* renamed from: s, reason: collision with root package name */
    public static final boolean f21835s = false;

    /* renamed from: t, reason: collision with root package name */
    public static final boolean f21836t = false;

    /* renamed from: u, reason: collision with root package name */
    private static final boolean f21837u = false;

    /* renamed from: v, reason: collision with root package name */
    public static boolean f21838v = false;

    /* renamed from: w, reason: collision with root package name */
    public static boolean f21839w = true;

    /* renamed from: x, reason: collision with root package name */
    public static boolean f21840x = true;

    /* renamed from: y, reason: collision with root package name */
    public static boolean f21841y = true;

    /* renamed from: z, reason: collision with root package name */
    public static boolean f21842z = true;

    /* renamed from: d, reason: collision with root package name */
    private a f21846d;

    /* renamed from: g, reason: collision with root package name */
    androidx.constraintlayout.core.b[] f21849g;

    /* renamed from: n, reason: collision with root package name */
    final c f21856n;

    /* renamed from: q, reason: collision with root package name */
    private a f21859q;

    /* renamed from: a, reason: collision with root package name */
    public boolean f21843a = false;

    /* renamed from: b, reason: collision with root package name */
    int f21844b = 0;

    /* renamed from: c, reason: collision with root package name */
    private HashMap<String, j> f21845c = null;

    /* renamed from: e, reason: collision with root package name */
    private int f21847e = 32;

    /* renamed from: f, reason: collision with root package name */
    private int f21848f = 32;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21850h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f21851i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean[] f21852j = new boolean[32];

    /* renamed from: k, reason: collision with root package name */
    int f21853k = 1;

    /* renamed from: l, reason: collision with root package name */
    int f21854l = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f21855m = 32;

    /* renamed from: o, reason: collision with root package name */
    private j[] f21857o = new j[B];

    /* renamed from: p, reason: collision with root package name */
    private int f21858p = 0;

    /* compiled from: LinearSystem.java */
    interface a {
        void a(f fVar, j jVar, boolean z4);

        void b(f fVar);

        void c(f fVar, androidx.constraintlayout.core.b bVar, boolean z4);

        void clear();

        void d(a aVar);

        j e(f fVar, boolean[] zArr);

        void f(j jVar);

        j getKey();

        boolean isEmpty();
    }

    /* compiled from: LinearSystem.java */
    class b extends androidx.constraintlayout.core.b {
        public b(c cVar) {
            this.f21828e = new k(this, cVar);
        }
    }

    public f() {
        this.f21849g = null;
        this.f21849g = new androidx.constraintlayout.core.b[32];
        W();
        c cVar = new c();
        this.f21856n = cVar;
        this.f21846d = new i(cVar);
        if (A) {
            this.f21859q = new b(cVar);
        } else {
            this.f21859q = new androidx.constraintlayout.core.b(cVar);
        }
    }

    private void A() {
        B();
        String str = "";
        for (int i4 = 0; i4 < this.f21854l; i4++) {
            StringBuilder a5 = j4.a(str);
            a5.append(this.f21849g[i4]);
            str = androidx.compose.runtime.changelist.j.a(a5.toString(), "\n");
        }
        StringBuilder a6 = j4.a(str);
        a6.append(this.f21846d);
        a6.append("\n");
        System.out.println(a6.toString());
    }

    private void B() {
        StringBuilder sb = new StringBuilder("Display Rows (");
        sb.append(this.f21854l);
        sb.append("x");
        System.out.println(android.support.v4.media.b.a(sb, this.f21853k, ")\n"));
    }

    private int E(a aVar) throws Exception {
        for (int i4 = 0; i4 < this.f21854l; i4++) {
            androidx.constraintlayout.core.b bVar = this.f21849g[i4];
            if (bVar.f21824a.f21920k != j.b.UNRESTRICTED && bVar.f21825b < 0.0f) {
                boolean z4 = false;
                int i5 = 0;
                while (!z4) {
                    g gVar = C;
                    if (gVar != null) {
                        gVar.f21875o++;
                    }
                    i5++;
                    float f4 = Float.MAX_VALUE;
                    int i6 = 0;
                    int i7 = -1;
                    int i10 = -1;
                    int i11 = 0;
                    while (true) {
                        if (i6 >= this.f21854l) {
                            break;
                        }
                        androidx.constraintlayout.core.b bVar2 = this.f21849g[i6];
                        if (bVar2.f21824a.f21920k != j.b.UNRESTRICTED && !bVar2.f21829f && bVar2.f21825b < 0.0f) {
                            int i12 = 9;
                            if (f21842z) {
                                int e4 = bVar2.f21828e.e();
                                int i13 = 0;
                                while (i13 < e4) {
                                    j h4 = bVar2.f21828e.h(i13);
                                    float q4 = bVar2.f21828e.q(h4);
                                    if (q4 > 0.0f) {
                                        int i14 = 0;
                                        while (i14 < i12) {
                                            float f5 = h4.f21918i[i14] / q4;
                                            if ((f5 < f4 && i14 == i11) || i14 > i11) {
                                                i11 = i14;
                                                i10 = h4.f21913d;
                                                i7 = i6;
                                                f4 = f5;
                                            }
                                            i14++;
                                            i12 = 9;
                                        }
                                    }
                                    i13++;
                                    i12 = 9;
                                }
                            } else {
                                for (int i15 = 1; i15 < this.f21853k; i15++) {
                                    j jVar = this.f21856n.f21833d[i15];
                                    float q5 = bVar2.f21828e.q(jVar);
                                    if (q5 > 0.0f) {
                                        for (int i16 = 0; i16 < 9; i16++) {
                                            float f6 = jVar.f21918i[i16] / q5;
                                            if ((f6 < f4 && i16 == i11) || i16 > i11) {
                                                i11 = i16;
                                                i7 = i6;
                                                i10 = i15;
                                                f4 = f6;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i6++;
                    }
                    if (i7 != -1) {
                        androidx.constraintlayout.core.b bVar3 = this.f21849g[i7];
                        bVar3.f21824a.f21914e = -1;
                        g gVar2 = C;
                        if (gVar2 != null) {
                            gVar2.f21874n++;
                        }
                        bVar3.C(this.f21856n.f21833d[i10]);
                        j jVar2 = bVar3.f21824a;
                        jVar2.f21914e = i7;
                        jVar2.m(this, bVar3);
                    } else {
                        z4 = true;
                    }
                    if (i5 > this.f21853k / 2) {
                        z4 = true;
                    }
                }
                return i5;
            }
        }
        return 0;
    }

    private String H(int i4) {
        int i5 = i4 * 4;
        int i6 = i5 / 1024;
        int i7 = i6 / 1024;
        return i7 > 0 ? r2.a("", i7, " Mb") : i6 > 0 ? r2.a("", i6, " Kb") : r2.a("", i5, " bytes");
    }

    private String I(int i4) {
        return i4 == 1 ? "LOW" : i4 == 2 ? "MEDIUM" : i4 == 3 ? "HIGH" : i4 == 4 ? "HIGHEST" : i4 == 5 ? "EQUALITY" : i4 == 8 ? "FIXED" : i4 == 6 ? "BARRIER" : "NONE";
    }

    public static g L() {
        return C;
    }

    private void S() {
        int i4 = this.f21847e * 2;
        this.f21847e = i4;
        this.f21849g = (androidx.constraintlayout.core.b[]) Arrays.copyOf(this.f21849g, i4);
        c cVar = this.f21856n;
        cVar.f21833d = (j[]) Arrays.copyOf(cVar.f21833d, this.f21847e);
        int i5 = this.f21847e;
        this.f21852j = new boolean[i5];
        this.f21848f = i5;
        this.f21855m = i5;
        g gVar = C;
        if (gVar != null) {
            gVar.f21868h++;
            gVar.f21880t = Math.max(gVar.f21880t, i5);
            g gVar2 = C;
            gVar2.J = gVar2.f21880t;
        }
    }

    private final int V(a aVar, boolean z4) {
        g gVar = C;
        if (gVar != null) {
            gVar.f21872l++;
        }
        for (int i4 = 0; i4 < this.f21853k; i4++) {
            this.f21852j[i4] = false;
        }
        boolean z5 = false;
        int i5 = 0;
        while (!z5) {
            g gVar2 = C;
            if (gVar2 != null) {
                gVar2.f21873m++;
            }
            i5++;
            if (i5 >= this.f21853k * 2) {
                return i5;
            }
            if (aVar.getKey() != null) {
                this.f21852j[aVar.getKey().f21913d] = true;
            }
            j e4 = aVar.e(this, this.f21852j);
            if (e4 != null) {
                boolean[] zArr = this.f21852j;
                int i6 = e4.f21913d;
                if (zArr[i6]) {
                    return i5;
                }
                zArr[i6] = true;
            }
            if (e4 != null) {
                float f4 = Float.MAX_VALUE;
                int i7 = -1;
                for (int i10 = 0; i10 < this.f21854l; i10++) {
                    androidx.constraintlayout.core.b bVar = this.f21849g[i10];
                    if (bVar.f21824a.f21920k != j.b.UNRESTRICTED && !bVar.f21829f && bVar.y(e4)) {
                        float q4 = bVar.f21828e.q(e4);
                        if (q4 < 0.0f) {
                            float f5 = (-bVar.f21825b) / q4;
                            if (f5 < f4) {
                                i7 = i10;
                                f4 = f5;
                            }
                        }
                    }
                }
                if (i7 > -1) {
                    androidx.constraintlayout.core.b bVar2 = this.f21849g[i7];
                    bVar2.f21824a.f21914e = -1;
                    g gVar3 = C;
                    if (gVar3 != null) {
                        gVar3.f21874n++;
                    }
                    bVar2.C(e4);
                    j jVar = bVar2.f21824a;
                    jVar.f21914e = i7;
                    jVar.m(this, bVar2);
                }
            } else {
                z5 = true;
            }
        }
        return i5;
    }

    private void W() {
        int i4 = 0;
        if (A) {
            while (i4 < this.f21854l) {
                androidx.constraintlayout.core.b bVar = this.f21849g[i4];
                if (bVar != null) {
                    this.f21856n.f21830a.release(bVar);
                }
                this.f21849g[i4] = null;
                i4++;
            }
            return;
        }
        while (i4 < this.f21854l) {
            androidx.constraintlayout.core.b bVar2 = this.f21849g[i4];
            if (bVar2 != null) {
                this.f21856n.f21831b.release(bVar2);
            }
            this.f21849g[i4] = null;
            i4++;
        }
    }

    private j a(j.b bVar, String str) {
        j acquire = this.f21856n.f21832c.acquire();
        if (acquire == null) {
            acquire = new j(bVar, str);
            acquire.f21920k = bVar;
        } else {
            acquire.g();
            acquire.k(bVar, str);
        }
        int i4 = this.f21858p;
        int i5 = B;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            B = i6;
            this.f21857o = (j[]) Arrays.copyOf(this.f21857o, i6);
        }
        j[] jVarArr = this.f21857o;
        int i7 = this.f21858p;
        this.f21858p = i7 + 1;
        jVarArr[i7] = acquire;
        return acquire;
    }

    private void g(androidx.constraintlayout.core.b bVar) {
        bVar.g(this, 0);
    }

    private final void m(androidx.constraintlayout.core.b bVar) {
        int i4;
        if (f21840x && bVar.f21829f) {
            bVar.f21824a.h(this, bVar.f21825b);
        } else {
            androidx.constraintlayout.core.b[] bVarArr = this.f21849g;
            int i5 = this.f21854l;
            bVarArr[i5] = bVar;
            j jVar = bVar.f21824a;
            jVar.f21914e = i5;
            this.f21854l = i5 + 1;
            jVar.m(this, bVar);
        }
        if (f21840x && this.f21843a) {
            int i6 = 0;
            while (i6 < this.f21854l) {
                if (this.f21849g[i6] == null) {
                    System.out.println("WTF");
                }
                androidx.constraintlayout.core.b bVar2 = this.f21849g[i6];
                if (bVar2 != null && bVar2.f21829f) {
                    bVar2.f21824a.h(this, bVar2.f21825b);
                    if (A) {
                        this.f21856n.f21830a.release(bVar2);
                    } else {
                        this.f21856n.f21831b.release(bVar2);
                    }
                    this.f21849g[i6] = null;
                    int i7 = i6 + 1;
                    int i10 = i7;
                    while (true) {
                        i4 = this.f21854l;
                        if (i7 >= i4) {
                            break;
                        }
                        androidx.constraintlayout.core.b[] bVarArr2 = this.f21849g;
                        int i11 = i7 - 1;
                        androidx.constraintlayout.core.b bVar3 = bVarArr2[i7];
                        bVarArr2[i11] = bVar3;
                        j jVar2 = bVar3.f21824a;
                        if (jVar2.f21914e == i7) {
                            jVar2.f21914e = i11;
                        }
                        i10 = i7;
                        i7++;
                    }
                    if (i10 < i4) {
                        this.f21849g[i10] = null;
                    }
                    this.f21854l = i4 - 1;
                    i6--;
                }
                i6++;
            }
            this.f21843a = false;
        }
    }

    private void n(androidx.constraintlayout.core.b bVar, int i4) {
        o(bVar, i4, 0);
    }

    private void r() {
        for (int i4 = 0; i4 < this.f21854l; i4++) {
            androidx.constraintlayout.core.b bVar = this.f21849g[i4];
            bVar.f21824a.f21916g = bVar.f21825b;
        }
    }

    public static androidx.constraintlayout.core.b w(f fVar, j jVar, j jVar2, float f4) {
        return fVar.v().m(jVar, jVar2, f4);
    }

    private j y(String str, j.b bVar) {
        g gVar = C;
        if (gVar != null) {
            gVar.f21876p++;
        }
        if (this.f21853k + 1 >= this.f21848f) {
            S();
        }
        j a5 = a(bVar, null);
        a5.i(str);
        int i4 = this.f21844b + 1;
        this.f21844b = i4;
        this.f21853k++;
        a5.f21913d = i4;
        if (this.f21845c == null) {
            this.f21845c = new HashMap<>();
        }
        this.f21845c.put(str, a5);
        this.f21856n.f21833d[this.f21844b] = a5;
        return a5;
    }

    void C() {
        int i4 = 0;
        for (int i5 = 0; i5 < this.f21847e; i5++) {
            androidx.constraintlayout.core.b bVar = this.f21849g[i5];
            if (bVar != null) {
                i4 += bVar.E();
            }
        }
        int i6 = 0;
        for (int i7 = 0; i7 < this.f21854l; i7++) {
            androidx.constraintlayout.core.b bVar2 = this.f21849g[i7];
            if (bVar2 != null) {
                i6 += bVar2.E();
            }
        }
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder("Linear System -> Table size: ");
        sb.append(this.f21847e);
        sb.append(" (");
        int i10 = this.f21847e;
        sb.append(H(i10 * i10));
        sb.append(") -- row sizes: ");
        sb.append(H(i4));
        sb.append(", actual size: ");
        sb.append(H(i6));
        sb.append(" rows: ");
        sb.append(this.f21854l);
        sb.append("/");
        sb.append(this.f21855m);
        sb.append(" cols: ");
        sb.append(this.f21853k);
        sb.append("/");
        sb.append(this.f21848f);
        sb.append(" 0 occupied cells, ");
        sb.append(H(0));
        printStream.println(sb.toString());
    }

    public void D() {
        B();
        String str = "";
        for (int i4 = 0; i4 < this.f21854l; i4++) {
            if (this.f21849g[i4].f21824a.f21920k == j.b.UNRESTRICTED) {
                StringBuilder a5 = j4.a(str);
                a5.append(this.f21849g[i4].F());
                str = androidx.compose.runtime.changelist.j.a(a5.toString(), "\n");
            }
        }
        StringBuilder a6 = j4.a(str);
        a6.append(this.f21846d);
        a6.append("\n");
        System.out.println(a6.toString());
    }

    public void F(g gVar) {
        C = gVar;
    }

    public c G() {
        return this.f21856n;
    }

    a J() {
        return this.f21846d;
    }

    public int K() {
        int i4 = 0;
        for (int i5 = 0; i5 < this.f21854l; i5++) {
            androidx.constraintlayout.core.b bVar = this.f21849g[i5];
            if (bVar != null) {
                i4 += bVar.E();
            }
        }
        return i4;
    }

    public int M() {
        return this.f21854l;
    }

    public int N() {
        return this.f21844b;
    }

    public int O(Object obj) {
        j j4 = ((androidx.constraintlayout.core.widgets.d) obj).j();
        if (j4 != null) {
            return (int) (j4.f21916g + 0.5f);
        }
        return 0;
    }

    androidx.constraintlayout.core.b P(int i4) {
        return this.f21849g[i4];
    }

    float Q(String str) {
        j R = R(str, j.b.UNRESTRICTED);
        if (R == null) {
            return 0.0f;
        }
        return R.f21916g;
    }

    j R(String str, j.b bVar) {
        if (this.f21845c == null) {
            this.f21845c = new HashMap<>();
        }
        j jVar = this.f21845c.get(str);
        return jVar == null ? y(str, bVar) : jVar;
    }

    public void T() throws Exception {
        g gVar = C;
        if (gVar != null) {
            gVar.f21869i++;
        }
        if (this.f21846d.isEmpty()) {
            r();
            return;
        }
        if (!this.f21850h && !this.f21851i) {
            U(this.f21846d);
            return;
        }
        g gVar2 = C;
        if (gVar2 != null) {
            gVar2.f21882v++;
        }
        for (int i4 = 0; i4 < this.f21854l; i4++) {
            if (!this.f21849g[i4].f21829f) {
                U(this.f21846d);
                return;
            }
        }
        g gVar3 = C;
        if (gVar3 != null) {
            gVar3.f21881u++;
        }
        r();
    }

    void U(a aVar) throws Exception {
        g gVar = C;
        if (gVar != null) {
            gVar.f21886z++;
            gVar.A = Math.max(gVar.A, this.f21853k);
            g gVar2 = C;
            gVar2.B = Math.max(gVar2.B, this.f21854l);
        }
        E(aVar);
        V(aVar, false);
        r();
    }

    public void X(androidx.constraintlayout.core.b bVar) {
        j jVar;
        int i4;
        if (!bVar.f21829f || (jVar = bVar.f21824a) == null) {
            return;
        }
        int i5 = jVar.f21914e;
        if (i5 != -1) {
            while (true) {
                i4 = this.f21854l;
                if (i5 >= i4 - 1) {
                    break;
                }
                androidx.constraintlayout.core.b[] bVarArr = this.f21849g;
                int i6 = i5 + 1;
                androidx.constraintlayout.core.b bVar2 = bVarArr[i6];
                j jVar2 = bVar2.f21824a;
                if (jVar2.f21914e == i6) {
                    jVar2.f21914e = i5;
                }
                bVarArr[i5] = bVar2;
                i5 = i6;
            }
            this.f21854l = i4 - 1;
        }
        j jVar3 = bVar.f21824a;
        if (!jVar3.f21917h) {
            jVar3.h(this, bVar.f21825b);
        }
        if (A) {
            this.f21856n.f21830a.release(bVar);
        } else {
            this.f21856n.f21831b.release(bVar);
        }
    }

    public void Y() {
        c cVar;
        int i4 = 0;
        while (true) {
            cVar = this.f21856n;
            j[] jVarArr = cVar.f21833d;
            if (i4 >= jVarArr.length) {
                break;
            }
            j jVar = jVarArr[i4];
            if (jVar != null) {
                jVar.g();
            }
            i4++;
        }
        cVar.f21832c.a(this.f21857o, this.f21858p);
        this.f21858p = 0;
        Arrays.fill(this.f21856n.f21833d, (Object) null);
        HashMap<String, j> hashMap = this.f21845c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f21844b = 0;
        this.f21846d.clear();
        this.f21853k = 1;
        for (int i5 = 0; i5 < this.f21854l; i5++) {
            androidx.constraintlayout.core.b bVar = this.f21849g[i5];
            if (bVar != null) {
                bVar.f21826c = false;
            }
        }
        W();
        this.f21854l = 0;
        if (A) {
            this.f21859q = new b(this.f21856n);
        } else {
            this.f21859q = new androidx.constraintlayout.core.b(this.f21856n);
        }
    }

    public void b(androidx.constraintlayout.core.widgets.e eVar, androidx.constraintlayout.core.widgets.e eVar2, float f4, int i4) {
        d.b bVar = d.b.LEFT;
        j u4 = u(eVar.r(bVar));
        d.b bVar2 = d.b.TOP;
        j u5 = u(eVar.r(bVar2));
        d.b bVar3 = d.b.RIGHT;
        j u6 = u(eVar.r(bVar3));
        d.b bVar4 = d.b.BOTTOM;
        j u7 = u(eVar.r(bVar4));
        j u10 = u(eVar2.r(bVar));
        j u11 = u(eVar2.r(bVar2));
        j u12 = u(eVar2.r(bVar3));
        j u13 = u(eVar2.r(bVar4));
        androidx.constraintlayout.core.b v4 = v();
        double d5 = f4;
        double d6 = i4;
        v4.v(u5, u7, u11, u13, (float) (Math.sin(d5) * d6));
        d(v4);
        androidx.constraintlayout.core.b v5 = v();
        v5.v(u4, u6, u10, u12, (float) (Math.cos(d5) * d6));
        d(v5);
    }

    public void c(j jVar, j jVar2, int i4, float f4, j jVar3, j jVar4, int i5, int i6) {
        androidx.constraintlayout.core.b v4 = v();
        v4.k(jVar, jVar2, i4, f4, jVar3, jVar4, i5);
        if (i6 != 8) {
            v4.g(this, i6);
        }
        d(v4);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(androidx.constraintlayout.core.b r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L3
            return
        L3:
            androidx.constraintlayout.core.g r0 = androidx.constraintlayout.core.f.C
            r1 = 1
            if (r0 == 0) goto L17
            long r3 = r0.f21870j
            long r3 = r3 + r1
            r0.f21870j = r3
            boolean r3 = r8.f21829f
            if (r3 == 0) goto L17
            long r3 = r0.f21871k
            long r3 = r3 + r1
            r0.f21871k = r3
        L17:
            int r0 = r7.f21854l
            r3 = 1
            int r0 = r0 + r3
            int r4 = r7.f21855m
            if (r0 >= r4) goto L26
            int r0 = r7.f21853k
            int r0 = r0 + r3
            int r4 = r7.f21848f
            if (r0 < r4) goto L29
        L26:
            r7.S()
        L29:
            boolean r0 = r8.f21829f
            r4 = 0
            if (r0 != 0) goto La1
            r8.b(r7)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L38
            return
        L38:
            r8.w()
            boolean r0 = r8.i(r7)
            if (r0 == 0) goto L98
            androidx.constraintlayout.core.j r0 = r7.t()
            r8.f21824a = r0
            int r5 = r7.f21854l
            r7.m(r8)
            int r6 = r7.f21854l
            int r5 = r5 + r3
            if (r6 != r5) goto L98
            androidx.constraintlayout.core.f$a r4 = r7.f21859q
            r4.d(r8)
            androidx.constraintlayout.core.f$a r4 = r7.f21859q
            r7.V(r4, r3)
            int r4 = r0.f21914e
            r5 = -1
            if (r4 != r5) goto L99
            androidx.constraintlayout.core.j r4 = r8.f21824a
            if (r4 != r0) goto L76
            androidx.constraintlayout.core.j r0 = r8.A(r0)
            if (r0 == 0) goto L76
            androidx.constraintlayout.core.g r4 = androidx.constraintlayout.core.f.C
            if (r4 == 0) goto L73
            long r5 = r4.f21874n
            long r5 = r5 + r1
            r4.f21874n = r5
        L73:
            r8.C(r0)
        L76:
            boolean r0 = r8.f21829f
            if (r0 != 0) goto L7f
            androidx.constraintlayout.core.j r0 = r8.f21824a
            r0.m(r7, r8)
        L7f:
            boolean r0 = androidx.constraintlayout.core.f.A
            if (r0 == 0) goto L8b
            androidx.constraintlayout.core.c r0 = r7.f21856n
            androidx.constraintlayout.core.h$a<androidx.constraintlayout.core.b> r0 = r0.f21830a
            r0.release(r8)
            goto L92
        L8b:
            androidx.constraintlayout.core.c r0 = r7.f21856n
            androidx.constraintlayout.core.h$a<androidx.constraintlayout.core.b> r0 = r0.f21831b
            r0.release(r8)
        L92:
            int r0 = r7.f21854l
            int r0 = r0 - r3
            r7.f21854l = r0
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.f.d(androidx.constraintlayout.core.b):void");
    }

    public androidx.constraintlayout.core.b e(j jVar, j jVar2, int i4, int i5) {
        if (f21839w && i5 == 8 && jVar2.f21917h && jVar.f21914e == -1) {
            jVar.h(this, jVar2.f21916g + i4);
            return null;
        }
        androidx.constraintlayout.core.b v4 = v();
        v4.r(jVar, jVar2, i4);
        if (i5 != 8) {
            v4.g(this, i5);
        }
        d(v4);
        return v4;
    }

    public void f(j jVar, int i4) {
        if (f21839w && jVar.f21914e == -1) {
            float f4 = i4;
            jVar.h(this, f4);
            for (int i5 = 0; i5 < this.f21844b + 1; i5++) {
                j jVar2 = this.f21856n.f21833d[i5];
                if (jVar2 != null && jVar2.f21924o && jVar2.f21925p == jVar.f21913d) {
                    jVar2.h(this, jVar2.f21926q + f4);
                }
            }
            return;
        }
        int i6 = jVar.f21914e;
        if (i6 == -1) {
            androidx.constraintlayout.core.b v4 = v();
            v4.l(jVar, i4);
            d(v4);
            return;
        }
        androidx.constraintlayout.core.b bVar = this.f21849g[i6];
        if (bVar.f21829f) {
            bVar.f21825b = i4;
            return;
        }
        if (bVar.f21828e.e() == 0) {
            bVar.f21829f = true;
            bVar.f21825b = i4;
        } else {
            androidx.constraintlayout.core.b v5 = v();
            v5.q(jVar, i4);
            d(v5);
        }
    }

    public void h(j jVar, j jVar2, int i4, boolean z4) {
        androidx.constraintlayout.core.b v4 = v();
        j x4 = x();
        x4.f21915f = 0;
        v4.t(jVar, jVar2, x4, i4);
        d(v4);
    }

    public void i(j jVar, j jVar2, int i4, int i5) {
        androidx.constraintlayout.core.b v4 = v();
        j x4 = x();
        x4.f21915f = 0;
        v4.t(jVar, jVar2, x4, i4);
        if (i5 != 8) {
            o(v4, (int) (v4.f21828e.q(x4) * (-1.0f)), i5);
        }
        d(v4);
    }

    public void j(j jVar, j jVar2, int i4, boolean z4) {
        androidx.constraintlayout.core.b v4 = v();
        j x4 = x();
        x4.f21915f = 0;
        v4.u(jVar, jVar2, x4, i4);
        d(v4);
    }

    public void k(j jVar, j jVar2, int i4, int i5) {
        androidx.constraintlayout.core.b v4 = v();
        j x4 = x();
        x4.f21915f = 0;
        v4.u(jVar, jVar2, x4, i4);
        if (i5 != 8) {
            o(v4, (int) (v4.f21828e.q(x4) * (-1.0f)), i5);
        }
        d(v4);
    }

    public void l(j jVar, j jVar2, j jVar3, j jVar4, float f4, int i4) {
        androidx.constraintlayout.core.b v4 = v();
        v4.n(jVar, jVar2, jVar3, jVar4, f4);
        if (i4 != 8) {
            v4.g(this, i4);
        }
        d(v4);
    }

    void o(androidx.constraintlayout.core.b bVar, int i4, int i5) {
        bVar.h(s(i5, null), i4);
    }

    public void p(j jVar, j jVar2, int i4) {
        if (jVar.f21914e != -1 || i4 != 0) {
            e(jVar, jVar2, i4, 8);
            return;
        }
        if (jVar2.f21924o) {
            jVar2 = this.f21856n.f21833d[jVar2.f21925p];
        }
        if (jVar.f21924o) {
            j jVar3 = this.f21856n.f21833d[jVar.f21925p];
        } else {
            jVar.j(this, jVar2, 0.0f);
        }
    }

    final void q() {
        int i4;
        int i5 = 0;
        while (i5 < this.f21854l) {
            androidx.constraintlayout.core.b bVar = this.f21849g[i5];
            if (bVar.f21828e.e() == 0) {
                bVar.f21829f = true;
            }
            if (bVar.f21829f) {
                j jVar = bVar.f21824a;
                jVar.f21916g = bVar.f21825b;
                jVar.f(bVar);
                int i6 = i5;
                while (true) {
                    i4 = this.f21854l;
                    if (i6 >= i4 - 1) {
                        break;
                    }
                    androidx.constraintlayout.core.b[] bVarArr = this.f21849g;
                    int i7 = i6 + 1;
                    bVarArr[i6] = bVarArr[i7];
                    i6 = i7;
                }
                this.f21849g[i4 - 1] = null;
                this.f21854l = i4 - 1;
                i5--;
                if (A) {
                    this.f21856n.f21830a.release(bVar);
                } else {
                    this.f21856n.f21831b.release(bVar);
                }
            }
            i5++;
        }
    }

    public j s(int i4, String str) {
        g gVar = C;
        if (gVar != null) {
            gVar.f21877q++;
        }
        if (this.f21853k + 1 >= this.f21848f) {
            S();
        }
        j a5 = a(j.b.ERROR, str);
        int i5 = this.f21844b + 1;
        this.f21844b = i5;
        this.f21853k++;
        a5.f21913d = i5;
        a5.f21915f = i4;
        this.f21856n.f21833d[i5] = a5;
        this.f21846d.f(a5);
        return a5;
    }

    public j t() {
        g gVar = C;
        if (gVar != null) {
            gVar.f21879s++;
        }
        if (this.f21853k + 1 >= this.f21848f) {
            S();
        }
        j a5 = a(j.b.SLACK, null);
        int i4 = this.f21844b + 1;
        this.f21844b = i4;
        this.f21853k++;
        a5.f21913d = i4;
        this.f21856n.f21833d[i4] = a5;
        return a5;
    }

    public j u(Object obj) {
        j jVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f21853k + 1 >= this.f21848f) {
            S();
        }
        if (obj instanceof androidx.constraintlayout.core.widgets.d) {
            androidx.constraintlayout.core.widgets.d dVar = (androidx.constraintlayout.core.widgets.d) obj;
            jVar = dVar.j();
            if (jVar == null) {
                dVar.z(this.f21856n);
                jVar = dVar.j();
            }
            int i4 = jVar.f21913d;
            if (i4 == -1 || i4 > this.f21844b || this.f21856n.f21833d[i4] == null) {
                if (i4 != -1) {
                    jVar.g();
                }
                int i5 = this.f21844b + 1;
                this.f21844b = i5;
                this.f21853k++;
                jVar.f21913d = i5;
                jVar.f21920k = j.b.UNRESTRICTED;
                this.f21856n.f21833d[i5] = jVar;
            }
        }
        return jVar;
    }

    public androidx.constraintlayout.core.b v() {
        androidx.constraintlayout.core.b acquire;
        if (A) {
            acquire = this.f21856n.f21830a.acquire();
            if (acquire == null) {
                acquire = new b(this.f21856n);
                E++;
            } else {
                acquire.D();
            }
        } else {
            acquire = this.f21856n.f21831b.acquire();
            if (acquire == null) {
                acquire = new androidx.constraintlayout.core.b(this.f21856n);
                D++;
            } else {
                acquire.D();
            }
        }
        j.e();
        return acquire;
    }

    public j x() {
        g gVar = C;
        if (gVar != null) {
            gVar.f21878r++;
        }
        if (this.f21853k + 1 >= this.f21848f) {
            S();
        }
        j a5 = a(j.b.SLACK, null);
        int i4 = this.f21844b + 1;
        this.f21844b = i4;
        this.f21853k++;
        a5.f21913d = i4;
        this.f21856n.f21833d[i4] = a5;
        return a5;
    }

    public void z() {
        B();
        String a5 = android.support.v4.media.b.a(new StringBuilder(" num vars "), this.f21844b, "\n");
        for (int i4 = 0; i4 < this.f21844b + 1; i4++) {
            j jVar = this.f21856n.f21833d[i4];
            if (jVar != null && jVar.f21917h) {
                StringBuilder sb = new StringBuilder();
                sb.append(a5);
                sb.append(" $[");
                sb.append(i4);
                sb.append("] => ");
                sb.append(jVar);
                sb.append(" = ");
                a5 = androidx.compose.foundation.shape.j.a(sb, jVar.f21916g, "\n");
            }
        }
        String a6 = androidx.compose.runtime.changelist.j.a(a5, "\n");
        for (int i5 = 0; i5 < this.f21844b + 1; i5++) {
            j[] jVarArr = this.f21856n.f21833d;
            j jVar2 = jVarArr[i5];
            if (jVar2 != null && jVar2.f21924o) {
                j jVar3 = jVarArr[jVar2.f21925p];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(a6);
                sb2.append(" ~[");
                sb2.append(i5);
                sb2.append("] => ");
                sb2.append(jVar2);
                sb2.append(" = ");
                sb2.append(jVar3);
                sb2.append(" + ");
                a6 = androidx.compose.foundation.shape.j.a(sb2, jVar2.f21926q, "\n");
            }
        }
        String a7 = androidx.compose.runtime.changelist.j.a(a6, "\n\n #  ");
        for (int i6 = 0; i6 < this.f21854l; i6++) {
            StringBuilder a8 = j4.a(a7);
            a8.append(this.f21849g[i6].F());
            a7 = androidx.compose.runtime.changelist.j.a(a8.toString(), "\n #  ");
        }
        if (this.f21846d != null) {
            StringBuilder a10 = e.a(a7, "Goal: ");
            a10.append(this.f21846d);
            a10.append("\n");
            a7 = a10.toString();
        }
        System.out.println(a7);
    }
}
