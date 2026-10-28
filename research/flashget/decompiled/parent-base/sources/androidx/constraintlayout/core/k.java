package androidx.constraintlayout.core;

import androidx.compose.material3.j4;
import androidx.constraintlayout.core.b;
import java.util.Arrays;

/* compiled from: SolverVariableValues.java */
/* loaded from: classes.dex */
public class k implements b.a {

    /* renamed from: n, reason: collision with root package name */
    private static final boolean f21929n = false;

    /* renamed from: o, reason: collision with root package name */
    private static final boolean f21930o = true;

    /* renamed from: p, reason: collision with root package name */
    private static float f21931p = 0.001f;

    /* renamed from: a, reason: collision with root package name */
    private final int f21932a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f21933b = 16;

    /* renamed from: c, reason: collision with root package name */
    private int f21934c = 16;

    /* renamed from: d, reason: collision with root package name */
    int[] f21935d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    int[] f21936e = new int[16];

    /* renamed from: f, reason: collision with root package name */
    int[] f21937f = new int[16];

    /* renamed from: g, reason: collision with root package name */
    float[] f21938g = new float[16];

    /* renamed from: h, reason: collision with root package name */
    int[] f21939h = new int[16];

    /* renamed from: i, reason: collision with root package name */
    int[] f21940i = new int[16];

    /* renamed from: j, reason: collision with root package name */
    int f21941j = 0;

    /* renamed from: k, reason: collision with root package name */
    int f21942k = -1;

    /* renamed from: l, reason: collision with root package name */
    private final b f21943l;

    /* renamed from: m, reason: collision with root package name */
    protected final c f21944m;

    k(b bVar, c cVar) {
        this.f21943l = bVar;
        this.f21944m = cVar;
        clear();
    }

    private void a(j jVar, int i4) {
        int[] iArr;
        int i5 = jVar.f21913d % this.f21934c;
        int[] iArr2 = this.f21935d;
        int i6 = iArr2[i5];
        if (i6 == -1) {
            iArr2[i5] = i4;
        } else {
            while (true) {
                iArr = this.f21936e;
                int i7 = iArr[i6];
                if (i7 == -1) {
                    break;
                } else {
                    i6 = i7;
                }
            }
            iArr[i6] = i4;
        }
        this.f21936e[i4] = -1;
    }

    private void b(int i4, j jVar, float f4) {
        this.f21937f[i4] = jVar.f21913d;
        this.f21938g[i4] = f4;
        this.f21939h[i4] = -1;
        this.f21940i[i4] = -1;
        jVar.a(this.f21943l);
        jVar.f21923n++;
        this.f21941j++;
    }

    private void c() {
        for (int i4 = 0; i4 < this.f21934c; i4++) {
            if (this.f21935d[i4] != -1) {
                String str = hashCode() + " hash [" + i4 + "] => ";
                int i5 = this.f21935d[i4];
                boolean z4 = false;
                while (!z4) {
                    StringBuilder a5 = e.a(str, " ");
                    a5.append(this.f21937f[i5]);
                    str = a5.toString();
                    int i6 = this.f21936e[i5];
                    if (i6 != -1) {
                        i5 = i6;
                    } else {
                        z4 = true;
                    }
                }
                System.out.println(str);
            }
        }
    }

    private int d() {
        for (int i4 = 0; i4 < this.f21933b; i4++) {
            if (this.f21937f[i4] == -1) {
                return i4;
            }
        }
        return -1;
    }

    private void s() {
        int i4 = this.f21933b * 2;
        this.f21937f = Arrays.copyOf(this.f21937f, i4);
        this.f21938g = Arrays.copyOf(this.f21938g, i4);
        this.f21939h = Arrays.copyOf(this.f21939h, i4);
        this.f21940i = Arrays.copyOf(this.f21940i, i4);
        this.f21936e = Arrays.copyOf(this.f21936e, i4);
        for (int i5 = this.f21933b; i5 < i4; i5++) {
            this.f21937f[i5] = -1;
            this.f21936e[i5] = -1;
        }
        this.f21933b = i4;
    }

    private void t(int i4, j jVar, float f4) {
        int d5 = d();
        b(d5, jVar, f4);
        if (i4 != -1) {
            this.f21939h[d5] = i4;
            int[] iArr = this.f21940i;
            iArr[d5] = iArr[i4];
            iArr[i4] = d5;
        } else {
            this.f21939h[d5] = -1;
            if (this.f21941j > 0) {
                this.f21940i[d5] = this.f21942k;
                this.f21942k = d5;
            } else {
                this.f21940i[d5] = -1;
            }
        }
        int i5 = this.f21940i[d5];
        if (i5 != -1) {
            this.f21939h[i5] = d5;
        }
        a(jVar, d5);
    }

    private void u(j jVar) {
        int[] iArr;
        int i4;
        int i5 = jVar.f21913d;
        int i6 = i5 % this.f21934c;
        int[] iArr2 = this.f21935d;
        int i7 = iArr2[i6];
        if (i7 == -1) {
            return;
        }
        if (this.f21937f[i7] == i5) {
            int[] iArr3 = this.f21936e;
            iArr2[i6] = iArr3[i7];
            iArr3[i7] = -1;
            return;
        }
        while (true) {
            iArr = this.f21936e;
            i4 = iArr[i7];
            if (i4 == -1 || this.f21937f[i4] == i5) {
                break;
            } else {
                i7 = i4;
            }
        }
        if (i4 == -1 || this.f21937f[i4] != i5) {
            return;
        }
        iArr[i7] = iArr[i4];
        iArr[i4] = -1;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void clear() {
        int i4 = this.f21941j;
        for (int i5 = 0; i5 < i4; i5++) {
            j h4 = h(i5);
            if (h4 != null) {
                h4.f(this.f21943l);
            }
        }
        for (int i6 = 0; i6 < this.f21933b; i6++) {
            this.f21937f[i6] = -1;
            this.f21936e[i6] = -1;
        }
        for (int i7 = 0; i7 < this.f21934c; i7++) {
            this.f21935d[i7] = -1;
        }
        this.f21941j = 0;
        this.f21942k = -1;
    }

    @Override // androidx.constraintlayout.core.b.a
    public int e() {
        return this.f21941j;
    }

    @Override // androidx.constraintlayout.core.b.a
    public int f(j jVar) {
        if (this.f21941j != 0 && jVar != null) {
            int i4 = jVar.f21913d;
            int i5 = this.f21935d[i4 % this.f21934c];
            if (i5 == -1) {
                return -1;
            }
            if (this.f21937f[i5] == i4) {
                return i5;
            }
            do {
                i5 = this.f21936e[i5];
                if (i5 == -1) {
                    break;
                }
            } while (this.f21937f[i5] != i4);
            if (i5 != -1 && this.f21937f[i5] == i4) {
                return i5;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.b.a
    public boolean g(j jVar) {
        return f(jVar) != -1;
    }

    @Override // androidx.constraintlayout.core.b.a
    public j h(int i4) {
        int i5 = this.f21941j;
        if (i5 == 0) {
            return null;
        }
        int i6 = this.f21942k;
        for (int i7 = 0; i7 < i5; i7++) {
            if (i7 == i4 && i6 != -1) {
                return this.f21944m.f21833d[this.f21937f[i6]];
            }
            i6 = this.f21940i[i6];
            if (i6 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void i(j jVar, float f4, boolean z4) {
        float f5 = f21931p;
        if (f4 <= (-f5) || f4 >= f5) {
            int f6 = f(jVar);
            if (f6 == -1) {
                o(jVar, f4);
                return;
            }
            float[] fArr = this.f21938g;
            float f7 = fArr[f6] + f4;
            fArr[f6] = f7;
            float f10 = f21931p;
            if (f7 <= (-f10) || f7 >= f10) {
                return;
            }
            fArr[f6] = 0.0f;
            k(jVar, z4);
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public void j() {
        int i4 = this.f21941j;
        int i5 = this.f21942k;
        for (int i6 = 0; i6 < i4; i6++) {
            float[] fArr = this.f21938g;
            fArr[i5] = fArr[i5] * (-1.0f);
            i5 = this.f21940i[i5];
            if (i5 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public float k(j jVar, boolean z4) {
        int f4 = f(jVar);
        if (f4 == -1) {
            return 0.0f;
        }
        u(jVar);
        float f5 = this.f21938g[f4];
        if (this.f21942k == f4) {
            this.f21942k = this.f21940i[f4];
        }
        this.f21937f[f4] = -1;
        int[] iArr = this.f21939h;
        int i4 = iArr[f4];
        if (i4 != -1) {
            int[] iArr2 = this.f21940i;
            iArr2[i4] = iArr2[f4];
        }
        int i5 = this.f21940i[f4];
        if (i5 != -1) {
            iArr[i5] = iArr[f4];
        }
        this.f21941j--;
        jVar.f21923n--;
        if (z4) {
            jVar.f(this.f21943l);
        }
        return f5;
    }

    @Override // androidx.constraintlayout.core.b.a
    public int l() {
        return 0;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void m() {
        int i4 = this.f21941j;
        System.out.print("{ ");
        for (int i5 = 0; i5 < i4; i5++) {
            j h4 = h(i5);
            if (h4 != null) {
                System.out.print(h4 + " = " + p(i5) + " ");
            }
        }
        System.out.println(" }");
    }

    @Override // androidx.constraintlayout.core.b.a
    public float n(b bVar, boolean z4) {
        float q4 = q(bVar.f21824a);
        k(bVar.f21824a, z4);
        k kVar = (k) bVar.f21828e;
        int e4 = kVar.e();
        int i4 = 0;
        int i5 = 0;
        while (i4 < e4) {
            int i6 = kVar.f21937f[i5];
            if (i6 != -1) {
                i(this.f21944m.f21833d[i6], kVar.f21938g[i5] * q4, z4);
                i4++;
            }
            i5++;
        }
        return q4;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void o(j jVar, float f4) {
        float f5 = f21931p;
        if (f4 > (-f5) && f4 < f5) {
            k(jVar, true);
            return;
        }
        if (this.f21941j == 0) {
            b(0, jVar, f4);
            a(jVar, 0);
            this.f21942k = 0;
            return;
        }
        int f6 = f(jVar);
        if (f6 != -1) {
            this.f21938g[f6] = f4;
            return;
        }
        if (this.f21941j + 1 >= this.f21933b) {
            s();
        }
        int i4 = this.f21941j;
        int i5 = this.f21942k;
        int i6 = -1;
        for (int i7 = 0; i7 < i4; i7++) {
            int i10 = this.f21937f[i5];
            int i11 = jVar.f21913d;
            if (i10 == i11) {
                this.f21938g[i5] = f4;
                return;
            }
            if (i10 < i11) {
                i6 = i5;
            }
            i5 = this.f21940i[i5];
            if (i5 == -1) {
                break;
            }
        }
        t(i6, jVar, f4);
    }

    @Override // androidx.constraintlayout.core.b.a
    public float p(int i4) {
        int i5 = this.f21941j;
        int i6 = this.f21942k;
        for (int i7 = 0; i7 < i5; i7++) {
            if (i7 == i4) {
                return this.f21938g[i6];
            }
            i6 = this.f21940i[i6];
            if (i6 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public float q(j jVar) {
        int f4 = f(jVar);
        if (f4 != -1) {
            return this.f21938g[f4];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void r(float f4) {
        int i4 = this.f21941j;
        int i5 = this.f21942k;
        for (int i6 = 0; i6 < i4; i6++) {
            float[] fArr = this.f21938g;
            fArr[i5] = fArr[i5] / f4;
            i5 = this.f21940i[i5];
            if (i5 == -1) {
                return;
            }
        }
    }

    public String toString() {
        String a5;
        String a6;
        String str = hashCode() + " { ";
        int i4 = this.f21941j;
        for (int i5 = 0; i5 < i4; i5++) {
            j h4 = h(i5);
            if (h4 != null) {
                String str2 = str + h4 + " = " + p(i5) + " ";
                int f4 = f(h4);
                String a7 = androidx.compose.runtime.changelist.j.a(str2, "[p: ");
                if (this.f21939h[f4] != -1) {
                    StringBuilder a8 = j4.a(a7);
                    a8.append(this.f21944m.f21833d[this.f21937f[this.f21939h[f4]]]);
                    a5 = a8.toString();
                } else {
                    a5 = androidx.compose.runtime.changelist.j.a(a7, "none");
                }
                String a10 = androidx.compose.runtime.changelist.j.a(a5, ", n: ");
                if (this.f21940i[f4] != -1) {
                    StringBuilder a11 = j4.a(a10);
                    a11.append(this.f21944m.f21833d[this.f21937f[this.f21940i[f4]]]);
                    a6 = a11.toString();
                } else {
                    a6 = androidx.compose.runtime.changelist.j.a(a10, "none");
                }
                str = androidx.compose.runtime.changelist.j.a(a6, "]");
            }
        }
        return androidx.compose.runtime.changelist.j.a(str, " }");
    }
}
