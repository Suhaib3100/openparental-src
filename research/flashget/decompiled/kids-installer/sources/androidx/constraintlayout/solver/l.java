package androidx.constraintlayout.solver;

import androidx.constraintlayout.motion.widget.r;
import androidx.constraintlayout.solver.b;
import java.util.Arrays;

/* compiled from: SolverVariableValues.java */
/* loaded from: classes2.dex */
public class l implements b.a {

    /* renamed from: n, reason: collision with root package name */
    private static final boolean f2248n = false;

    /* renamed from: o, reason: collision with root package name */
    private static final boolean f2249o = true;

    /* renamed from: p, reason: collision with root package name */
    private static float f2250p = 0.001f;

    /* renamed from: a, reason: collision with root package name */
    private final int f2251a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f2252b = 16;

    /* renamed from: c, reason: collision with root package name */
    private int f2253c = 16;

    /* renamed from: d, reason: collision with root package name */
    int[] f2254d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    int[] f2255e = new int[16];

    /* renamed from: f, reason: collision with root package name */
    int[] f2256f = new int[16];

    /* renamed from: g, reason: collision with root package name */
    float[] f2257g = new float[16];

    /* renamed from: h, reason: collision with root package name */
    int[] f2258h = new int[16];

    /* renamed from: i, reason: collision with root package name */
    int[] f2259i = new int[16];

    /* renamed from: j, reason: collision with root package name */
    int f2260j = 0;

    /* renamed from: k, reason: collision with root package name */
    int f2261k = -1;

    /* renamed from: l, reason: collision with root package name */
    private final b f2262l;

    /* renamed from: m, reason: collision with root package name */
    protected final c f2263m;

    l(b bVar, c cVar) {
        this.f2262l = bVar;
        this.f2263m = cVar;
        clear();
    }

    private void a(k kVar, int i5) {
        int[] iArr;
        int i6 = kVar.f2232c % this.f2253c;
        int[] iArr2 = this.f2254d;
        int i7 = iArr2[i6];
        if (i7 == -1) {
            iArr2[i6] = i5;
        } else {
            while (true) {
                iArr = this.f2255e;
                int i8 = iArr[i7];
                if (i8 == -1) {
                    break;
                } else {
                    i7 = i8;
                }
            }
            iArr[i7] = i5;
        }
        this.f2255e[i5] = -1;
    }

    private void b(int i5, k kVar, float f6) {
        this.f2256f[i5] = kVar.f2232c;
        this.f2257g[i5] = f6;
        this.f2258h[i5] = -1;
        this.f2259i[i5] = -1;
        kVar.a(this.f2262l);
        kVar.f2242m++;
        this.f2260j++;
    }

    private void c() {
        for (int i5 = 0; i5 < this.f2253c; i5++) {
            if (this.f2254d[i5] != -1) {
                String str = hashCode() + " hash [" + i5 + "] => ";
                int i6 = this.f2254d[i5];
                boolean z5 = false;
                while (!z5) {
                    StringBuilder a6 = androidx.constraintlayout.motion.widget.c.a(str, " ");
                    a6.append(this.f2256f[i6]);
                    str = a6.toString();
                    int i7 = this.f2255e[i6];
                    if (i7 != -1) {
                        i6 = i7;
                    } else {
                        z5 = f2249o;
                    }
                }
                System.out.println(str);
            }
        }
    }

    private int r() {
        for (int i5 = 0; i5 < this.f2252b; i5++) {
            if (this.f2256f[i5] == -1) {
                return i5;
            }
        }
        return -1;
    }

    private void s() {
        int i5 = this.f2252b * 2;
        this.f2256f = Arrays.copyOf(this.f2256f, i5);
        this.f2257g = Arrays.copyOf(this.f2257g, i5);
        this.f2258h = Arrays.copyOf(this.f2258h, i5);
        this.f2259i = Arrays.copyOf(this.f2259i, i5);
        this.f2255e = Arrays.copyOf(this.f2255e, i5);
        for (int i6 = this.f2252b; i6 < i5; i6++) {
            this.f2256f[i6] = -1;
            this.f2255e[i6] = -1;
        }
        this.f2252b = i5;
    }

    private void t(int i5, k kVar, float f6) {
        int r5 = r();
        b(r5, kVar, f6);
        if (i5 != -1) {
            this.f2258h[r5] = i5;
            int[] iArr = this.f2259i;
            iArr[r5] = iArr[i5];
            iArr[i5] = r5;
        } else {
            this.f2258h[r5] = -1;
            if (this.f2260j > 0) {
                this.f2259i[r5] = this.f2261k;
                this.f2261k = r5;
            } else {
                this.f2259i[r5] = -1;
            }
        }
        int i6 = this.f2259i[r5];
        if (i6 != -1) {
            this.f2258h[i6] = r5;
        }
        a(kVar, r5);
    }

    private void u(k kVar) {
        int[] iArr;
        int i5;
        int i6 = kVar.f2232c;
        int i7 = i6 % this.f2253c;
        int[] iArr2 = this.f2254d;
        int i8 = iArr2[i7];
        if (i8 == -1) {
            return;
        }
        if (this.f2256f[i8] == i6) {
            int[] iArr3 = this.f2255e;
            iArr2[i7] = iArr3[i8];
            iArr3[i8] = -1;
            return;
        }
        while (true) {
            iArr = this.f2255e;
            i5 = iArr[i8];
            if (i5 == -1 || this.f2256f[i5] == i6) {
                break;
            } else {
                i8 = i5;
            }
        }
        if (i5 == -1 || this.f2256f[i5] != i6) {
            return;
        }
        iArr[i8] = iArr[i5];
        iArr[i5] = -1;
    }

    @Override // androidx.constraintlayout.solver.b.a
    public void clear() {
        int i5 = this.f2260j;
        for (int i6 = 0; i6 < i5; i6++) {
            k f6 = f(i6);
            if (f6 != null) {
                f6.f(this.f2262l);
            }
        }
        for (int i7 = 0; i7 < this.f2252b; i7++) {
            this.f2256f[i7] = -1;
            this.f2255e[i7] = -1;
        }
        for (int i8 = 0; i8 < this.f2253c; i8++) {
            this.f2254d[i8] = -1;
        }
        this.f2260j = 0;
        this.f2261k = -1;
    }

    @Override // androidx.constraintlayout.solver.b.a
    public int d() {
        return this.f2260j;
    }

    @Override // androidx.constraintlayout.solver.b.a
    public void e() {
        int i5 = this.f2260j;
        System.out.print("{ ");
        for (int i6 = 0; i6 < i5; i6++) {
            k f6 = f(i6);
            if (f6 != null) {
                System.out.print(f6 + " = " + h(i6) + " ");
            }
        }
        System.out.println(" }");
    }

    @Override // androidx.constraintlayout.solver.b.a
    public k f(int i5) {
        int i6 = this.f2260j;
        if (i6 == 0) {
            return null;
        }
        int i7 = this.f2261k;
        for (int i8 = 0; i8 < i6; i8++) {
            if (i8 == i5 && i7 != -1) {
                return this.f2263m.f2151d[this.f2256f[i7]];
            }
            i7 = this.f2259i[i7];
            if (i7 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.solver.b.a
    public void g() {
        int i5 = this.f2260j;
        int i6 = this.f2261k;
        for (int i7 = 0; i7 < i5; i7++) {
            float[] fArr = this.f2257g;
            fArr[i6] = fArr[i6] * (-1.0f);
            i6 = this.f2259i[i6];
            if (i6 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.solver.b.a
    public float h(int i5) {
        int i6 = this.f2260j;
        int i7 = this.f2261k;
        for (int i8 = 0; i8 < i6; i8++) {
            if (i8 == i5) {
                return this.f2257g[i7];
            }
            i7 = this.f2259i[i7];
            if (i7 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.solver.b.a
    public void i(k kVar, float f6, boolean z5) {
        float f7 = f2250p;
        if (f6 <= (-f7) || f6 >= f7) {
            int l5 = l(kVar);
            if (l5 == -1) {
                o(kVar, f6);
                return;
            }
            float[] fArr = this.f2257g;
            float f8 = fArr[l5] + f6;
            fArr[l5] = f8;
            float f9 = f2250p;
            if (f8 <= (-f9) || f8 >= f9) {
                return;
            }
            fArr[l5] = 0.0f;
            p(kVar, z5);
        }
    }

    @Override // androidx.constraintlayout.solver.b.a
    public float j(k kVar) {
        int l5 = l(kVar);
        if (l5 != -1) {
            return this.f2257g[l5];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.solver.b.a
    public boolean k(k kVar) {
        if (l(kVar) != -1) {
            return f2249o;
        }
        return false;
    }

    @Override // androidx.constraintlayout.solver.b.a
    public int l(k kVar) {
        if (this.f2260j != 0 && kVar != null) {
            int i5 = kVar.f2232c;
            int i6 = this.f2254d[i5 % this.f2253c];
            if (i6 == -1) {
                return -1;
            }
            if (this.f2256f[i6] == i5) {
                return i6;
            }
            do {
                i6 = this.f2255e[i6];
                if (i6 == -1) {
                    break;
                }
            } while (this.f2256f[i6] != i5);
            if (i6 != -1 && this.f2256f[i6] == i5) {
                return i6;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.solver.b.a
    public float m(b bVar, boolean z5) {
        float j5 = j(bVar.f2142a);
        p(bVar.f2142a, z5);
        l lVar = (l) bVar.f2146e;
        int d6 = lVar.d();
        int i5 = 0;
        int i6 = 0;
        while (i5 < d6) {
            int i7 = lVar.f2256f[i6];
            if (i7 != -1) {
                i(this.f2263m.f2151d[i7], lVar.f2257g[i6] * j5, z5);
                i5++;
            }
            i6++;
        }
        return j5;
    }

    @Override // androidx.constraintlayout.solver.b.a
    public int n() {
        return 0;
    }

    @Override // androidx.constraintlayout.solver.b.a
    public void o(k kVar, float f6) {
        float f7 = f2250p;
        if (f6 > (-f7) && f6 < f7) {
            p(kVar, f2249o);
            return;
        }
        if (this.f2260j == 0) {
            b(0, kVar, f6);
            a(kVar, 0);
            this.f2261k = 0;
            return;
        }
        int l5 = l(kVar);
        if (l5 != -1) {
            this.f2257g[l5] = f6;
            return;
        }
        if (this.f2260j + 1 >= this.f2252b) {
            s();
        }
        int i5 = this.f2260j;
        int i6 = this.f2261k;
        int i7 = -1;
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = this.f2256f[i6];
            int i10 = kVar.f2232c;
            if (i9 == i10) {
                this.f2257g[i6] = f6;
                return;
            }
            if (i9 < i10) {
                i7 = i6;
            }
            i6 = this.f2259i[i6];
            if (i6 == -1) {
                break;
            }
        }
        t(i7, kVar, f6);
    }

    @Override // androidx.constraintlayout.solver.b.a
    public float p(k kVar, boolean z5) {
        int l5 = l(kVar);
        if (l5 == -1) {
            return 0.0f;
        }
        u(kVar);
        float f6 = this.f2257g[l5];
        if (this.f2261k == l5) {
            this.f2261k = this.f2259i[l5];
        }
        this.f2256f[l5] = -1;
        int[] iArr = this.f2258h;
        int i5 = iArr[l5];
        if (i5 != -1) {
            int[] iArr2 = this.f2259i;
            iArr2[i5] = iArr2[l5];
        }
        int i6 = this.f2259i[l5];
        if (i6 != -1) {
            iArr[i6] = iArr[l5];
        }
        this.f2260j--;
        kVar.f2242m--;
        if (z5) {
            kVar.f(this.f2262l);
        }
        return f6;
    }

    @Override // androidx.constraintlayout.solver.b.a
    public void q(float f6) {
        int i5 = this.f2260j;
        int i6 = this.f2261k;
        for (int i7 = 0; i7 < i5; i7++) {
            float[] fArr = this.f2257g;
            fArr[i6] = fArr[i6] / f6;
            i6 = this.f2259i[i6];
            if (i6 == -1) {
                return;
            }
        }
    }

    public String toString() {
        String a6;
        String a7;
        String str = hashCode() + " { ";
        int i5 = this.f2260j;
        for (int i6 = 0; i6 < i5; i6++) {
            k f6 = f(i6);
            if (f6 != null) {
                String str2 = str + f6 + " = " + h(i6) + " ";
                int l5 = l(f6);
                String a8 = androidx.concurrent.futures.b.a(str2, "[p: ");
                if (this.f2258h[l5] != -1) {
                    StringBuilder a9 = r.a(a8);
                    a9.append(this.f2263m.f2151d[this.f2256f[this.f2258h[l5]]]);
                    a6 = a9.toString();
                } else {
                    a6 = androidx.concurrent.futures.b.a(a8, "none");
                }
                String a10 = androidx.concurrent.futures.b.a(a6, ", n: ");
                if (this.f2259i[l5] != -1) {
                    StringBuilder a11 = r.a(a10);
                    a11.append(this.f2263m.f2151d[this.f2256f[this.f2259i[l5]]]);
                    a7 = a11.toString();
                } else {
                    a7 = androidx.concurrent.futures.b.a(a10, "none");
                }
                str = androidx.concurrent.futures.b.a(a7, "]");
            }
        }
        return androidx.concurrent.futures.b.a(str, " }");
    }
}
