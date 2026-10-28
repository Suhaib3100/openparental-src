package androidx.constraintlayout.solver;

import androidx.constraintlayout.motion.widget.r;
import androidx.constraintlayout.solver.b;
import java.util.Arrays;

/* compiled from: ArrayLinkedVariables.java */
/* loaded from: classes2.dex */
public class a implements b.a {

    /* renamed from: l, reason: collision with root package name */
    private static final boolean f2125l = false;

    /* renamed from: m, reason: collision with root package name */
    static final int f2126m = -1;

    /* renamed from: n, reason: collision with root package name */
    private static final boolean f2127n = false;

    /* renamed from: o, reason: collision with root package name */
    private static float f2128o = 0.001f;

    /* renamed from: b, reason: collision with root package name */
    private final b f2130b;

    /* renamed from: c, reason: collision with root package name */
    protected final c f2131c;

    /* renamed from: a, reason: collision with root package name */
    int f2129a = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f2132d = 8;

    /* renamed from: e, reason: collision with root package name */
    private k f2133e = null;

    /* renamed from: f, reason: collision with root package name */
    private int[] f2134f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    private int[] f2135g = new int[8];

    /* renamed from: h, reason: collision with root package name */
    private float[] f2136h = new float[8];

    /* renamed from: i, reason: collision with root package name */
    private int f2137i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f2138j = -1;

    /* renamed from: k, reason: collision with root package name */
    private boolean f2139k = false;

    a(b bVar, c cVar) {
        this.f2130b = bVar;
        this.f2131c = cVar;
    }

    public int a() {
        return this.f2137i;
    }

    public final int b(int i5) {
        return this.f2134f[i5];
    }

    public final int c(int i5) {
        return this.f2135g[i5];
    }

    @Override // androidx.constraintlayout.solver.b.a
    public final void clear() {
        int i5 = this.f2137i;
        for (int i6 = 0; i5 != -1 && i6 < this.f2129a; i6++) {
            k kVar = this.f2131c.f2151d[this.f2134f[i5]];
            if (kVar != null) {
                kVar.f(this.f2130b);
            }
            i5 = this.f2135g[i5];
        }
        this.f2137i = -1;
        this.f2138j = -1;
        this.f2139k = false;
        this.f2129a = 0;
    }

    @Override // androidx.constraintlayout.solver.b.a
    public int d() {
        return this.f2129a;
    }

    @Override // androidx.constraintlayout.solver.b.a
    public void e() {
        int i5 = this.f2129a;
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
        int i6 = this.f2137i;
        for (int i7 = 0; i6 != -1 && i7 < this.f2129a; i7++) {
            if (i7 == i5) {
                return this.f2131c.f2151d[this.f2134f[i6]];
            }
            i6 = this.f2135g[i6];
        }
        return null;
    }

    @Override // androidx.constraintlayout.solver.b.a
    public void g() {
        int i5 = this.f2137i;
        for (int i6 = 0; i5 != -1 && i6 < this.f2129a; i6++) {
            float[] fArr = this.f2136h;
            fArr[i5] = fArr[i5] * (-1.0f);
            i5 = this.f2135g[i5];
        }
    }

    @Override // androidx.constraintlayout.solver.b.a
    public float h(int i5) {
        int i6 = this.f2137i;
        for (int i7 = 0; i6 != -1 && i7 < this.f2129a; i7++) {
            if (i7 == i5) {
                return this.f2136h[i6];
            }
            i6 = this.f2135g[i6];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.solver.b.a
    public void i(k kVar, float f6, boolean z5) {
        float f7 = f2128o;
        if (f6 <= (-f7) || f6 >= f7) {
            int i5 = this.f2137i;
            if (i5 == -1) {
                this.f2137i = 0;
                this.f2136h[0] = f6;
                this.f2134f[0] = kVar.f2232c;
                this.f2135g[0] = -1;
                kVar.f2242m++;
                kVar.a(this.f2130b);
                this.f2129a++;
                if (this.f2139k) {
                    return;
                }
                int i6 = this.f2138j + 1;
                this.f2138j = i6;
                int[] iArr = this.f2134f;
                if (i6 >= iArr.length) {
                    this.f2139k = true;
                    this.f2138j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i7 = -1;
            for (int i8 = 0; i5 != -1 && i8 < this.f2129a; i8++) {
                int i9 = this.f2134f[i5];
                int i10 = kVar.f2232c;
                if (i9 == i10) {
                    float[] fArr = this.f2136h;
                    float f8 = fArr[i5] + f6;
                    float f9 = f2128o;
                    if (f8 > (-f9) && f8 < f9) {
                        f8 = 0.0f;
                    }
                    fArr[i5] = f8;
                    if (f8 == 0.0f) {
                        if (i5 == this.f2137i) {
                            this.f2137i = this.f2135g[i5];
                        } else {
                            int[] iArr2 = this.f2135g;
                            iArr2[i7] = iArr2[i5];
                        }
                        if (z5) {
                            kVar.f(this.f2130b);
                        }
                        if (this.f2139k) {
                            this.f2138j = i5;
                        }
                        kVar.f2242m--;
                        this.f2129a--;
                        return;
                    }
                    return;
                }
                if (i9 < i10) {
                    i7 = i5;
                }
                i5 = this.f2135g[i5];
            }
            int i11 = this.f2138j;
            int i12 = i11 + 1;
            if (this.f2139k) {
                int[] iArr3 = this.f2134f;
                if (iArr3[i11] != -1) {
                    i11 = iArr3.length;
                }
            } else {
                i11 = i12;
            }
            int[] iArr4 = this.f2134f;
            if (i11 >= iArr4.length && this.f2129a < iArr4.length) {
                int i13 = 0;
                while (true) {
                    int[] iArr5 = this.f2134f;
                    if (i13 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i13] == -1) {
                        i11 = i13;
                        break;
                    }
                    i13++;
                }
            }
            int[] iArr6 = this.f2134f;
            if (i11 >= iArr6.length) {
                i11 = iArr6.length;
                int i14 = this.f2132d * 2;
                this.f2132d = i14;
                this.f2139k = false;
                this.f2138j = i11 - 1;
                this.f2136h = Arrays.copyOf(this.f2136h, i14);
                this.f2134f = Arrays.copyOf(this.f2134f, this.f2132d);
                this.f2135g = Arrays.copyOf(this.f2135g, this.f2132d);
            }
            this.f2134f[i11] = kVar.f2232c;
            this.f2136h[i11] = f6;
            if (i7 != -1) {
                int[] iArr7 = this.f2135g;
                iArr7[i11] = iArr7[i7];
                iArr7[i7] = i11;
            } else {
                this.f2135g[i11] = this.f2137i;
                this.f2137i = i11;
            }
            kVar.f2242m++;
            kVar.a(this.f2130b);
            this.f2129a++;
            if (!this.f2139k) {
                this.f2138j++;
            }
            int i15 = this.f2138j;
            int[] iArr8 = this.f2134f;
            if (i15 >= iArr8.length) {
                this.f2139k = true;
                this.f2138j = iArr8.length - 1;
            }
        }
    }

    @Override // androidx.constraintlayout.solver.b.a
    public final float j(k kVar) {
        int i5 = this.f2137i;
        for (int i6 = 0; i5 != -1 && i6 < this.f2129a; i6++) {
            if (this.f2134f[i5] == kVar.f2232c) {
                return this.f2136h[i5];
            }
            i5 = this.f2135g[i5];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.solver.b.a
    public boolean k(k kVar) {
        int i5 = this.f2137i;
        if (i5 == -1) {
            return false;
        }
        for (int i6 = 0; i5 != -1 && i6 < this.f2129a; i6++) {
            if (this.f2134f[i5] == kVar.f2232c) {
                return true;
            }
            i5 = this.f2135g[i5];
        }
        return false;
    }

    @Override // androidx.constraintlayout.solver.b.a
    public int l(k kVar) {
        int i5 = this.f2137i;
        if (i5 == -1) {
            return -1;
        }
        for (int i6 = 0; i5 != -1 && i6 < this.f2129a; i6++) {
            if (this.f2134f[i5] == kVar.f2232c) {
                return i5;
            }
            i5 = this.f2135g[i5];
        }
        return -1;
    }

    @Override // androidx.constraintlayout.solver.b.a
    public float m(b bVar, boolean z5) {
        float j5 = j(bVar.f2142a);
        p(bVar.f2142a, z5);
        b.a aVar = bVar.f2146e;
        int d6 = aVar.d();
        for (int i5 = 0; i5 < d6; i5++) {
            k f6 = aVar.f(i5);
            i(f6, aVar.j(f6) * j5, z5);
        }
        return j5;
    }

    @Override // androidx.constraintlayout.solver.b.a
    public int n() {
        return (this.f2134f.length * 4 * 3) + 0 + 36;
    }

    @Override // androidx.constraintlayout.solver.b.a
    public final void o(k kVar, float f6) {
        if (f6 == 0.0f) {
            p(kVar, true);
            return;
        }
        int i5 = this.f2137i;
        if (i5 == -1) {
            this.f2137i = 0;
            this.f2136h[0] = f6;
            this.f2134f[0] = kVar.f2232c;
            this.f2135g[0] = -1;
            kVar.f2242m++;
            kVar.a(this.f2130b);
            this.f2129a++;
            if (this.f2139k) {
                return;
            }
            int i6 = this.f2138j + 1;
            this.f2138j = i6;
            int[] iArr = this.f2134f;
            if (i6 >= iArr.length) {
                this.f2139k = true;
                this.f2138j = iArr.length - 1;
                return;
            }
            return;
        }
        int i7 = -1;
        for (int i8 = 0; i5 != -1 && i8 < this.f2129a; i8++) {
            int i9 = this.f2134f[i5];
            int i10 = kVar.f2232c;
            if (i9 == i10) {
                this.f2136h[i5] = f6;
                return;
            }
            if (i9 < i10) {
                i7 = i5;
            }
            i5 = this.f2135g[i5];
        }
        int i11 = this.f2138j;
        int i12 = i11 + 1;
        if (this.f2139k) {
            int[] iArr2 = this.f2134f;
            if (iArr2[i11] != -1) {
                i11 = iArr2.length;
            }
        } else {
            i11 = i12;
        }
        int[] iArr3 = this.f2134f;
        if (i11 >= iArr3.length && this.f2129a < iArr3.length) {
            int i13 = 0;
            while (true) {
                int[] iArr4 = this.f2134f;
                if (i13 >= iArr4.length) {
                    break;
                }
                if (iArr4[i13] == -1) {
                    i11 = i13;
                    break;
                }
                i13++;
            }
        }
        int[] iArr5 = this.f2134f;
        if (i11 >= iArr5.length) {
            i11 = iArr5.length;
            int i14 = this.f2132d * 2;
            this.f2132d = i14;
            this.f2139k = false;
            this.f2138j = i11 - 1;
            this.f2136h = Arrays.copyOf(this.f2136h, i14);
            this.f2134f = Arrays.copyOf(this.f2134f, this.f2132d);
            this.f2135g = Arrays.copyOf(this.f2135g, this.f2132d);
        }
        this.f2134f[i11] = kVar.f2232c;
        this.f2136h[i11] = f6;
        if (i7 != -1) {
            int[] iArr6 = this.f2135g;
            iArr6[i11] = iArr6[i7];
            iArr6[i7] = i11;
        } else {
            this.f2135g[i11] = this.f2137i;
            this.f2137i = i11;
        }
        kVar.f2242m++;
        kVar.a(this.f2130b);
        int i15 = this.f2129a + 1;
        this.f2129a = i15;
        if (!this.f2139k) {
            this.f2138j++;
        }
        int[] iArr7 = this.f2134f;
        if (i15 >= iArr7.length) {
            this.f2139k = true;
        }
        if (this.f2138j >= iArr7.length) {
            this.f2139k = true;
            this.f2138j = iArr7.length - 1;
        }
    }

    @Override // androidx.constraintlayout.solver.b.a
    public final float p(k kVar, boolean z5) {
        if (this.f2133e == kVar) {
            this.f2133e = null;
        }
        int i5 = this.f2137i;
        if (i5 == -1) {
            return 0.0f;
        }
        int i6 = 0;
        int i7 = -1;
        while (i5 != -1 && i6 < this.f2129a) {
            if (this.f2134f[i5] == kVar.f2232c) {
                if (i5 == this.f2137i) {
                    this.f2137i = this.f2135g[i5];
                } else {
                    int[] iArr = this.f2135g;
                    iArr[i7] = iArr[i5];
                }
                if (z5) {
                    kVar.f(this.f2130b);
                }
                kVar.f2242m--;
                this.f2129a--;
                this.f2134f[i5] = -1;
                if (this.f2139k) {
                    this.f2138j = i5;
                }
                return this.f2136h[i5];
            }
            i6++;
            i7 = i5;
            i5 = this.f2135g[i5];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.solver.b.a
    public void q(float f6) {
        int i5 = this.f2137i;
        for (int i6 = 0; i5 != -1 && i6 < this.f2129a; i6++) {
            float[] fArr = this.f2136h;
            fArr[i5] = fArr[i5] / f6;
            i5 = this.f2135g[i5];
        }
    }

    k r() {
        k kVar = this.f2133e;
        if (kVar != null) {
            return kVar;
        }
        int i5 = this.f2137i;
        k kVar2 = null;
        for (int i6 = 0; i5 != -1 && i6 < this.f2129a; i6++) {
            if (this.f2136h[i5] < 0.0f) {
                k kVar3 = this.f2131c.f2151d[this.f2134f[i5]];
                if (kVar2 == null || kVar2.f2234e < kVar3.f2234e) {
                    kVar2 = kVar3;
                }
            }
            i5 = this.f2135g[i5];
        }
        return kVar2;
    }

    public final float s(int i5) {
        return this.f2136h[i5];
    }

    boolean t() {
        int i5 = this.f2137i;
        for (int i6 = 0; i5 != -1 && i6 < this.f2129a; i6++) {
            if (this.f2136h[i5] > 0.0f) {
                return true;
            }
            i5 = this.f2135g[i5];
        }
        return false;
    }

    public String toString() {
        int i5 = this.f2137i;
        String str = "";
        for (int i6 = 0; i5 != -1 && i6 < this.f2129a; i6++) {
            StringBuilder a6 = r.a(androidx.concurrent.futures.b.a(str, " -> "));
            a6.append(this.f2136h[i5]);
            a6.append(" : ");
            StringBuilder a7 = r.a(a6.toString());
            a7.append(this.f2131c.f2151d[this.f2134f[i5]]);
            str = a7.toString();
            i5 = this.f2135g[i5];
        }
        return str;
    }
}
