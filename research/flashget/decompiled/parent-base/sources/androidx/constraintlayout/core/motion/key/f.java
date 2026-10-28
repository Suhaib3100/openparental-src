package androidx.constraintlayout.core.motion.key;

import androidx.compose.material3.f4;
import androidx.constraintlayout.core.motion.utils.p;
import androidx.constraintlayout.core.motion.utils.w;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: MotionKeyPosition.java */
/* loaded from: classes.dex */
public class f extends b {
    static final String L = "KeyPosition";
    protected static final float M = 20.0f;
    public static final int N = 2;
    public static final int O = 1;
    public static final int P = 0;
    static final int Q = 2;
    public int A;
    public int B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public int I;
    private float J;
    private float K;

    /* renamed from: y, reason: collision with root package name */
    public int f22131y;

    /* renamed from: z, reason: collision with root package name */
    public String f22132z;

    public f() {
        int i4 = b.f22105m;
        this.f22131y = i4;
        this.f22132z = null;
        this.A = i4;
        this.B = 0;
        this.C = Float.NaN;
        this.D = Float.NaN;
        this.E = Float.NaN;
        this.F = Float.NaN;
        this.G = Float.NaN;
        this.H = Float.NaN;
        this.I = 0;
        this.J = Float.NaN;
        this.K = Float.NaN;
        this.f22120k = 2;
    }

    private void v(float f4, float f5, float f6, float f7) {
        float f10 = f6 - f4;
        float f11 = f7 - f5;
        float f12 = Float.isNaN(this.E) ? 0.0f : this.E;
        float f13 = Float.isNaN(this.H) ? 0.0f : this.H;
        float f14 = Float.isNaN(this.F) ? 0.0f : this.F;
        this.J = (int) (((Float.isNaN(this.G) ? 0.0f : this.G) * f11) + (f12 * f10) + f4);
        this.K = (int) ((f11 * f14) + (f10 * f13) + f5);
    }

    private void w(float f4, float f5, float f6, float f7) {
        float f10 = f6 - f4;
        float f11 = f7 - f5;
        float f12 = this.E;
        float f13 = (f10 * f12) + f4;
        float f14 = this.F;
        this.J = ((-f11) * f14) + f13;
        this.K = (f10 * f14) + (f11 * f12) + f5;
    }

    private void y(int i4, int i5) {
        float f4 = this.E;
        float f5 = 0;
        this.J = (i4 * f4) + f5;
        this.K = (i5 * f4) + f5;
    }

    float A() {
        return this.K;
    }

    public boolean B(int i4, int i5, androidx.constraintlayout.core.motion.utils.f fVar, androidx.constraintlayout.core.motion.utils.f fVar2, float f4, float f5) {
        x(i4, i5, fVar.a(), fVar.b(), fVar2.a(), fVar2.b());
        return Math.abs(f4 - this.J) < M && Math.abs(f5 - this.K) < M;
    }

    public void C(androidx.constraintlayout.core.motion.f fVar, androidx.constraintlayout.core.motion.utils.f fVar2, androidx.constraintlayout.core.motion.utils.f fVar3, float f4, float f5, String[] strArr, float[] fArr) {
        int i4 = this.I;
        if (i4 == 1) {
            E(fVar2, fVar3, f4, f5, strArr, fArr);
        } else if (i4 != 2) {
            D(fVar2, fVar3, f4, f5, strArr, fArr);
        } else {
            F(fVar, fVar2, fVar3, f4, f5, strArr, fArr);
        }
    }

    void D(androidx.constraintlayout.core.motion.utils.f fVar, androidx.constraintlayout.core.motion.utils.f fVar2, float f4, float f5, String[] strArr, float[] fArr) {
        float a5 = fVar.a();
        float b5 = fVar.b();
        float a6 = fVar2.a() - a5;
        float b6 = fVar2.b() - b5;
        String str = strArr[0];
        if (str == null) {
            strArr[0] = "percentX";
            fArr[0] = (f4 - a5) / a6;
            strArr[1] = "percentY";
            fArr[1] = (f5 - b5) / b6;
            return;
        }
        if ("percentX".equals(str)) {
            fArr[0] = (f4 - a5) / a6;
            fArr[1] = (f5 - b5) / b6;
        } else {
            fArr[1] = (f4 - a5) / a6;
            fArr[0] = (f5 - b5) / b6;
        }
    }

    void E(androidx.constraintlayout.core.motion.utils.f fVar, androidx.constraintlayout.core.motion.utils.f fVar2, float f4, float f5, String[] strArr, float[] fArr) {
        float a5 = fVar.a();
        float b5 = fVar.b();
        float a6 = fVar2.a() - a5;
        float b6 = fVar2.b() - b5;
        float hypot = (float) Math.hypot(a6, b6);
        if (hypot < 1.0E-4d) {
            System.out.println("distance ~ 0");
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        float f6 = a6 / hypot;
        float f7 = b6 / hypot;
        float f10 = f5 - b5;
        float f11 = f4 - a5;
        float a7 = f4.a(f11, f7, f6 * f10, hypot);
        float f12 = ((f7 * f10) + (f6 * f11)) / hypot;
        String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = f12;
                fArr[1] = a7;
                return;
            }
            return;
        }
        strArr[0] = "percentX";
        strArr[1] = "percentY";
        fArr[0] = f12;
        fArr[1] = a7;
    }

    void F(androidx.constraintlayout.core.motion.f fVar, androidx.constraintlayout.core.motion.utils.f fVar2, androidx.constraintlayout.core.motion.utils.f fVar3, float f4, float f5, String[] strArr, float[] fArr) {
        fVar2.a();
        fVar2.b();
        fVar3.a();
        fVar3.b();
        androidx.constraintlayout.core.motion.f n4 = fVar.n();
        int D = n4.D();
        int k4 = n4.k();
        String str = strArr[0];
        if (str == null) {
            strArr[0] = "percentX";
            fArr[0] = f4 / D;
            strArr[1] = "percentY";
            fArr[1] = f5 / k4;
            return;
        }
        if ("percentX".equals(str)) {
            fArr[0] = f4 / D;
            fArr[1] = f5 / k4;
        } else {
            fArr[1] = f4 / D;
            fArr[0] = f5 / k4;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.w
    public int a(String str) {
        return w.g.a(str);
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.w
    public boolean b(int i4, int i5) {
        if (i4 == 100) {
            this.f22117h = i5;
            return true;
        }
        if (i4 == 508) {
            this.f22131y = i5;
            return true;
        }
        if (i4 != 510) {
            return super.b(i4, i5);
        }
        this.I = i5;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.w
    public boolean c(int i4, float f4) {
        switch (i4) {
            case 503:
                this.C = f4;
                return true;
            case 504:
                this.D = f4;
                return true;
            case 505:
                this.C = f4;
                this.D = f4;
                return true;
            case w.g.f22539n /* 506 */:
                this.E = f4;
                return true;
            case 507:
                this.F = f4;
                return true;
            default:
                return false;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.w
    public boolean e(int i4, String str) {
        if (i4 != 501) {
            return super.e(i4, str);
        }
        this.f22132z = str.toString();
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void f(HashMap<String, p> hashMap) {
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    /* renamed from: g */
    public b clone() {
        return new f().h(this);
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public b h(b bVar) {
        super.h(bVar);
        f fVar = (f) bVar;
        this.f22132z = fVar.f22132z;
        this.A = fVar.A;
        this.B = fVar.B;
        this.C = fVar.C;
        this.D = Float.NaN;
        this.E = fVar.E;
        this.F = fVar.F;
        this.G = fVar.G;
        this.H = fVar.H;
        this.J = fVar.J;
        this.K = fVar.K;
        return this;
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void i(HashSet<String> hashSet) {
    }

    void x(int i4, int i5, float f4, float f5, float f6, float f7) {
        int i6 = this.I;
        if (i6 == 1) {
            w(f4, f5, f6, f7);
        } else if (i6 != 2) {
            v(f4, f5, f6, f7);
        } else {
            y(i4, i5);
        }
    }

    float z() {
        return this.J;
    }
}
