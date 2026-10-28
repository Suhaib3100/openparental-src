package androidx.constraintlayout.core;

import androidx.compose.material3.j4;
import androidx.constraintlayout.core.b;
import java.util.Arrays;

/* compiled from: ArrayLinkedVariables.java */
/* loaded from: classes.dex */
public class a implements b.a {

    /* renamed from: l, reason: collision with root package name */
    private static final boolean f21807l = false;

    /* renamed from: m, reason: collision with root package name */
    static final int f21808m = -1;

    /* renamed from: n, reason: collision with root package name */
    private static final boolean f21809n = false;

    /* renamed from: o, reason: collision with root package name */
    private static float f21810o = 0.001f;

    /* renamed from: b, reason: collision with root package name */
    private final b f21812b;

    /* renamed from: c, reason: collision with root package name */
    protected final c f21813c;

    /* renamed from: a, reason: collision with root package name */
    int f21811a = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f21814d = 8;

    /* renamed from: e, reason: collision with root package name */
    private j f21815e = null;

    /* renamed from: f, reason: collision with root package name */
    private int[] f21816f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    private int[] f21817g = new int[8];

    /* renamed from: h, reason: collision with root package name */
    private float[] f21818h = new float[8];

    /* renamed from: i, reason: collision with root package name */
    private int f21819i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f21820j = -1;

    /* renamed from: k, reason: collision with root package name */
    private boolean f21821k = false;

    a(b bVar, c cVar) {
        this.f21812b = bVar;
        this.f21813c = cVar;
    }

    public int a() {
        return this.f21819i;
    }

    public final int b(int i4) {
        return this.f21816f[i4];
    }

    public final int c(int i4) {
        return this.f21817g[i4];
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void clear() {
        int i4 = this.f21819i;
        for (int i5 = 0; i4 != -1 && i5 < this.f21811a; i5++) {
            j jVar = this.f21813c.f21833d[this.f21816f[i4]];
            if (jVar != null) {
                jVar.f(this.f21812b);
            }
            i4 = this.f21817g[i4];
        }
        this.f21819i = -1;
        this.f21820j = -1;
        this.f21821k = false;
        this.f21811a = 0;
    }

    j d() {
        j jVar = this.f21815e;
        if (jVar != null) {
            return jVar;
        }
        int i4 = this.f21819i;
        j jVar2 = null;
        for (int i5 = 0; i4 != -1 && i5 < this.f21811a; i5++) {
            if (this.f21818h[i4] < 0.0f) {
                j jVar3 = this.f21813c.f21833d[this.f21816f[i4]];
                if (jVar2 == null || jVar2.f21915f < jVar3.f21915f) {
                    jVar2 = jVar3;
                }
            }
            i4 = this.f21817g[i4];
        }
        return jVar2;
    }

    @Override // androidx.constraintlayout.core.b.a
    public int e() {
        return this.f21811a;
    }

    @Override // androidx.constraintlayout.core.b.a
    public int f(j jVar) {
        int i4 = this.f21819i;
        if (i4 == -1) {
            return -1;
        }
        for (int i5 = 0; i4 != -1 && i5 < this.f21811a; i5++) {
            if (this.f21816f[i4] == jVar.f21913d) {
                return i4;
            }
            i4 = this.f21817g[i4];
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.b.a
    public boolean g(j jVar) {
        int i4 = this.f21819i;
        if (i4 == -1) {
            return false;
        }
        for (int i5 = 0; i4 != -1 && i5 < this.f21811a; i5++) {
            if (this.f21816f[i4] == jVar.f21913d) {
                return true;
            }
            i4 = this.f21817g[i4];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.b.a
    public j h(int i4) {
        int i5 = this.f21819i;
        for (int i6 = 0; i5 != -1 && i6 < this.f21811a; i6++) {
            if (i6 == i4) {
                return this.f21813c.f21833d[this.f21816f[i5]];
            }
            i5 = this.f21817g[i5];
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void i(j jVar, float f4, boolean z4) {
        float f5 = f21810o;
        if (f4 <= (-f5) || f4 >= f5) {
            int i4 = this.f21819i;
            if (i4 == -1) {
                this.f21819i = 0;
                this.f21818h[0] = f4;
                this.f21816f[0] = jVar.f21913d;
                this.f21817g[0] = -1;
                jVar.f21923n++;
                jVar.a(this.f21812b);
                this.f21811a++;
                if (this.f21821k) {
                    return;
                }
                int i5 = this.f21820j + 1;
                this.f21820j = i5;
                int[] iArr = this.f21816f;
                if (i5 >= iArr.length) {
                    this.f21821k = true;
                    this.f21820j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i6 = -1;
            for (int i7 = 0; i4 != -1 && i7 < this.f21811a; i7++) {
                int i10 = this.f21816f[i4];
                int i11 = jVar.f21913d;
                if (i10 == i11) {
                    float[] fArr = this.f21818h;
                    float f6 = fArr[i4] + f4;
                    float f7 = f21810o;
                    if (f6 > (-f7) && f6 < f7) {
                        f6 = 0.0f;
                    }
                    fArr[i4] = f6;
                    if (f6 == 0.0f) {
                        if (i4 == this.f21819i) {
                            this.f21819i = this.f21817g[i4];
                        } else {
                            int[] iArr2 = this.f21817g;
                            iArr2[i6] = iArr2[i4];
                        }
                        if (z4) {
                            jVar.f(this.f21812b);
                        }
                        if (this.f21821k) {
                            this.f21820j = i4;
                        }
                        jVar.f21923n--;
                        this.f21811a--;
                        return;
                    }
                    return;
                }
                if (i10 < i11) {
                    i6 = i4;
                }
                i4 = this.f21817g[i4];
            }
            int i12 = this.f21820j;
            int i13 = i12 + 1;
            if (this.f21821k) {
                int[] iArr3 = this.f21816f;
                if (iArr3[i12] != -1) {
                    i12 = iArr3.length;
                }
            } else {
                i12 = i13;
            }
            int[] iArr4 = this.f21816f;
            if (i12 >= iArr4.length && this.f21811a < iArr4.length) {
                int i14 = 0;
                while (true) {
                    int[] iArr5 = this.f21816f;
                    if (i14 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i14] == -1) {
                        i12 = i14;
                        break;
                    }
                    i14++;
                }
            }
            int[] iArr6 = this.f21816f;
            if (i12 >= iArr6.length) {
                i12 = iArr6.length;
                int i15 = this.f21814d * 2;
                this.f21814d = i15;
                this.f21821k = false;
                this.f21820j = i12 - 1;
                this.f21818h = Arrays.copyOf(this.f21818h, i15);
                this.f21816f = Arrays.copyOf(this.f21816f, this.f21814d);
                this.f21817g = Arrays.copyOf(this.f21817g, this.f21814d);
            }
            this.f21816f[i12] = jVar.f21913d;
            this.f21818h[i12] = f4;
            if (i6 != -1) {
                int[] iArr7 = this.f21817g;
                iArr7[i12] = iArr7[i6];
                iArr7[i6] = i12;
            } else {
                this.f21817g[i12] = this.f21819i;
                this.f21819i = i12;
            }
            jVar.f21923n++;
            jVar.a(this.f21812b);
            this.f21811a++;
            if (!this.f21821k) {
                this.f21820j++;
            }
            int i16 = this.f21820j;
            int[] iArr8 = this.f21816f;
            if (i16 >= iArr8.length) {
                this.f21821k = true;
                this.f21820j = iArr8.length - 1;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public void j() {
        int i4 = this.f21819i;
        for (int i5 = 0; i4 != -1 && i5 < this.f21811a; i5++) {
            float[] fArr = this.f21818h;
            fArr[i4] = fArr[i4] * (-1.0f);
            i4 = this.f21817g[i4];
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float k(j jVar, boolean z4) {
        if (this.f21815e == jVar) {
            this.f21815e = null;
        }
        int i4 = this.f21819i;
        if (i4 == -1) {
            return 0.0f;
        }
        int i5 = 0;
        int i6 = -1;
        while (i4 != -1 && i5 < this.f21811a) {
            if (this.f21816f[i4] == jVar.f21913d) {
                if (i4 == this.f21819i) {
                    this.f21819i = this.f21817g[i4];
                } else {
                    int[] iArr = this.f21817g;
                    iArr[i6] = iArr[i4];
                }
                if (z4) {
                    jVar.f(this.f21812b);
                }
                jVar.f21923n--;
                this.f21811a--;
                this.f21816f[i4] = -1;
                if (this.f21821k) {
                    this.f21820j = i4;
                }
                return this.f21818h[i4];
            }
            i5++;
            i6 = i4;
            i4 = this.f21817g[i4];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public int l() {
        return (this.f21816f.length * 12) + 36;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void m() {
        int i4 = this.f21811a;
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
        b.a aVar = bVar.f21828e;
        int e4 = aVar.e();
        for (int i4 = 0; i4 < e4; i4++) {
            j h4 = aVar.h(i4);
            i(h4, aVar.q(h4) * q4, z4);
        }
        return q4;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void o(j jVar, float f4) {
        if (f4 == 0.0f) {
            k(jVar, true);
            return;
        }
        int i4 = this.f21819i;
        if (i4 == -1) {
            this.f21819i = 0;
            this.f21818h[0] = f4;
            this.f21816f[0] = jVar.f21913d;
            this.f21817g[0] = -1;
            jVar.f21923n++;
            jVar.a(this.f21812b);
            this.f21811a++;
            if (this.f21821k) {
                return;
            }
            int i5 = this.f21820j + 1;
            this.f21820j = i5;
            int[] iArr = this.f21816f;
            if (i5 >= iArr.length) {
                this.f21821k = true;
                this.f21820j = iArr.length - 1;
                return;
            }
            return;
        }
        int i6 = -1;
        for (int i7 = 0; i4 != -1 && i7 < this.f21811a; i7++) {
            int i10 = this.f21816f[i4];
            int i11 = jVar.f21913d;
            if (i10 == i11) {
                this.f21818h[i4] = f4;
                return;
            }
            if (i10 < i11) {
                i6 = i4;
            }
            i4 = this.f21817g[i4];
        }
        int i12 = this.f21820j;
        int i13 = i12 + 1;
        if (this.f21821k) {
            int[] iArr2 = this.f21816f;
            if (iArr2[i12] != -1) {
                i12 = iArr2.length;
            }
        } else {
            i12 = i13;
        }
        int[] iArr3 = this.f21816f;
        if (i12 >= iArr3.length && this.f21811a < iArr3.length) {
            int i14 = 0;
            while (true) {
                int[] iArr4 = this.f21816f;
                if (i14 >= iArr4.length) {
                    break;
                }
                if (iArr4[i14] == -1) {
                    i12 = i14;
                    break;
                }
                i14++;
            }
        }
        int[] iArr5 = this.f21816f;
        if (i12 >= iArr5.length) {
            i12 = iArr5.length;
            int i15 = this.f21814d * 2;
            this.f21814d = i15;
            this.f21821k = false;
            this.f21820j = i12 - 1;
            this.f21818h = Arrays.copyOf(this.f21818h, i15);
            this.f21816f = Arrays.copyOf(this.f21816f, this.f21814d);
            this.f21817g = Arrays.copyOf(this.f21817g, this.f21814d);
        }
        this.f21816f[i12] = jVar.f21913d;
        this.f21818h[i12] = f4;
        if (i6 != -1) {
            int[] iArr6 = this.f21817g;
            iArr6[i12] = iArr6[i6];
            iArr6[i6] = i12;
        } else {
            this.f21817g[i12] = this.f21819i;
            this.f21819i = i12;
        }
        jVar.f21923n++;
        jVar.a(this.f21812b);
        int i16 = this.f21811a + 1;
        this.f21811a = i16;
        if (!this.f21821k) {
            this.f21820j++;
        }
        int[] iArr7 = this.f21816f;
        if (i16 >= iArr7.length) {
            this.f21821k = true;
        }
        if (this.f21820j >= iArr7.length) {
            this.f21821k = true;
            this.f21820j = iArr7.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public float p(int i4) {
        int i5 = this.f21819i;
        for (int i6 = 0; i5 != -1 && i6 < this.f21811a; i6++) {
            if (i6 == i4) {
                return this.f21818h[i5];
            }
            i5 = this.f21817g[i5];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float q(j jVar) {
        int i4 = this.f21819i;
        for (int i5 = 0; i4 != -1 && i5 < this.f21811a; i5++) {
            if (this.f21816f[i4] == jVar.f21913d) {
                return this.f21818h[i4];
            }
            i4 = this.f21817g[i4];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void r(float f4) {
        int i4 = this.f21819i;
        for (int i5 = 0; i4 != -1 && i5 < this.f21811a; i5++) {
            float[] fArr = this.f21818h;
            fArr[i4] = fArr[i4] / f4;
            i4 = this.f21817g[i4];
        }
    }

    public final float s(int i4) {
        return this.f21818h[i4];
    }

    boolean t() {
        int i4 = this.f21819i;
        for (int i5 = 0; i4 != -1 && i5 < this.f21811a; i5++) {
            if (this.f21818h[i4] > 0.0f) {
                return true;
            }
            i4 = this.f21817g[i4];
        }
        return false;
    }

    public String toString() {
        int i4 = this.f21819i;
        String str = "";
        for (int i5 = 0; i4 != -1 && i5 < this.f21811a; i5++) {
            StringBuilder a5 = j4.a(androidx.compose.foundation.shape.j.a(j4.a(androidx.compose.runtime.changelist.j.a(str, " -> ")), this.f21818h[i4], " : "));
            a5.append(this.f21813c.f21833d[this.f21816f[i4]]);
            str = a5.toString();
            i4 = this.f21817g[i4];
        }
        return str;
    }
}
