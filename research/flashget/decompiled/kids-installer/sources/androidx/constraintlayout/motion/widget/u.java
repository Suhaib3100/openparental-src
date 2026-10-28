package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.annotation.o0;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.d;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* compiled from: MotionPaths.java */
/* loaded from: classes.dex */
class u implements Comparable<u> {
    public static final boolean E = false;
    public static final boolean F = false;
    static final int G = 0;
    static final int H = 1;
    static final int I = 2;
    static final int J = 3;
    static final int K = 4;
    static final int L = 5;
    static final int M = 1;
    static final int N = 2;
    static final int O = 3;
    int A;
    double[] B;
    double[] C;

    /* renamed from: o, reason: collision with root package name */
    androidx.constraintlayout.motion.utils.c f1994o;

    /* renamed from: p, reason: collision with root package name */
    int f1995p;

    /* renamed from: q, reason: collision with root package name */
    float f1996q;

    /* renamed from: r, reason: collision with root package name */
    float f1997r;

    /* renamed from: s, reason: collision with root package name */
    float f1998s;

    /* renamed from: t, reason: collision with root package name */
    float f1999t;

    /* renamed from: u, reason: collision with root package name */
    float f2000u;

    /* renamed from: v, reason: collision with root package name */
    float f2001v;

    /* renamed from: w, reason: collision with root package name */
    float f2002w;

    /* renamed from: x, reason: collision with root package name */
    float f2003x;

    /* renamed from: y, reason: collision with root package name */
    int f2004y;

    /* renamed from: z, reason: collision with root package name */
    LinkedHashMap<String, androidx.constraintlayout.widget.a> f2005z;
    public static final String D = "MotionPaths";
    static String[] P = {"position", "x", "y", "width", "height", "pathRotate"};

    public u() {
        this.f1995p = 0;
        this.f2002w = Float.NaN;
        this.f2003x = Float.NaN;
        this.f2004y = f.f1803f;
        this.f2005z = new LinkedHashMap<>();
        this.A = 0;
        this.B = new double[18];
        this.C = new double[18];
    }

    private static final float B(float f6, float f7, float f8, float f9, float f10, float f11) {
        return (((f10 - f8) * f7) - ((f11 - f9) * f6)) + f8;
    }

    private static final float C(float f6, float f7, float f8, float f9, float f10, float f11) {
        return ((f11 - f9) * f7) + ((f10 - f8) * f6) + f9;
    }

    private boolean j(float f6, float f7) {
        return (Float.isNaN(f6) || Float.isNaN(f7)) ? Float.isNaN(f6) != Float.isNaN(f7) : Math.abs(f6 - f7) > 1.0E-6f;
    }

    void A(View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f6;
        float f7;
        boolean z5;
        float f8 = this.f1998s;
        float f9 = this.f1999t;
        float f10 = this.f2000u;
        float f11 = this.f2001v;
        boolean z6 = true;
        if (iArr.length != 0 && this.B.length <= iArr[iArr.length - 1]) {
            int i5 = iArr[iArr.length - 1] + 1;
            this.B = new double[i5];
            this.C = new double[i5];
        }
        Arrays.fill(this.B, Double.NaN);
        for (int i6 = 0; i6 < iArr.length; i6++) {
            double[] dArr4 = this.B;
            int i7 = iArr[i6];
            dArr4[i7] = dArr[i6];
            this.C[i7] = dArr2[i6];
        }
        int i8 = 0;
        float f12 = Float.NaN;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        while (true) {
            double[] dArr5 = this.B;
            if (i8 >= dArr5.length) {
                break;
            }
            boolean isNaN = Double.isNaN(dArr5[i8]);
            double d6 = com.google.firebase.remoteconfig.p.f18289o;
            if (isNaN && (dArr3 == null || dArr3[i8] == com.google.firebase.remoteconfig.p.f18289o)) {
                f7 = f8;
                z5 = z6;
            } else {
                if (dArr3 != null) {
                    d6 = dArr3[i8];
                }
                if (!Double.isNaN(this.B[i8])) {
                    d6 = this.B[i8] + d6;
                }
                f6 = (float) d6;
                f7 = f8;
                float f17 = (float) this.C[i8];
                z5 = true;
                if (i8 == 1) {
                    f13 = f17;
                    i8++;
                    z6 = z5;
                    f8 = f6;
                } else if (i8 == 2) {
                    f15 = f17;
                    f9 = f6;
                } else if (i8 == 3) {
                    f14 = f17;
                    f10 = f6;
                } else if (i8 == 4) {
                    f16 = f17;
                    f11 = f6;
                } else if (i8 == 5) {
                    f12 = f6;
                }
            }
            f6 = f7;
            i8++;
            z6 = z5;
            f8 = f6;
        }
        float f18 = f8;
        boolean z7 = z6;
        if (!Float.isNaN(f12)) {
            view.setRotation((float) (Math.toDegrees(Math.atan2((f16 / 2.0f) + f15, (f14 / 2.0f) + f13)) + f12 + (Float.isNaN(Float.NaN) ? 0.0f : Float.NaN)));
        } else if (!Float.isNaN(Float.NaN)) {
            view.setRotation(Float.NaN);
        }
        float f19 = f18 + 0.5f;
        int i9 = (int) f19;
        float f20 = f9 + 0.5f;
        int i10 = (int) f20;
        int i11 = (int) (f19 + f10);
        int i12 = (int) (f20 + f11);
        int i13 = i11 - i9;
        int i14 = i12 - i10;
        if ((i13 == view.getMeasuredWidth() && i14 == view.getMeasuredHeight()) ? false : z7) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i13, androidx.constraintlayout.solver.widgets.analyzer.b.f2366g), View.MeasureSpec.makeMeasureSpec(i14, androidx.constraintlayout.solver.widgets.analyzer.b.f2366g));
        }
        view.layout(i9, i10, i11, i12);
    }

    public void g(d.a aVar) {
        this.f1994o = androidx.constraintlayout.motion.utils.c.c(aVar.f2925c.f3001c);
        d.c cVar = aVar.f2925c;
        this.f2004y = cVar.f3002d;
        this.f2002w = cVar.f3005g;
        this.f1995p = cVar.f3003e;
        this.f2003x = aVar.f2924b.f3010e;
        for (String str : aVar.f2928f.keySet()) {
            androidx.constraintlayout.widget.a aVar2 = aVar.f2928f.get(str);
            if (aVar2.d() != a.b.STRING_TYPE) {
                this.f2005z.put(str, aVar2);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compareTo(@o0 u uVar) {
        return Float.compare(this.f1997r, uVar.f1997r);
    }

    void l(u uVar, boolean[] zArr, String[] strArr, boolean z5) {
        zArr[0] = zArr[0] | j(this.f1997r, uVar.f1997r);
        zArr[1] = zArr[1] | j(this.f1998s, uVar.f1998s) | z5;
        zArr[2] = z5 | j(this.f1999t, uVar.f1999t) | zArr[2];
        zArr[3] = zArr[3] | j(this.f2000u, uVar.f2000u);
        zArr[4] = j(this.f2001v, uVar.f2001v) | zArr[4];
    }

    void o(double[] dArr, int[] iArr) {
        float[] fArr = {this.f1997r, this.f1998s, this.f1999t, this.f2000u, this.f2001v, this.f2002w};
        int i5 = 0;
        for (int i6 : iArr) {
            if (i6 < 6) {
                dArr[i5] = fArr[r4];
                i5++;
            }
        }
    }

    void p(int[] iArr, double[] dArr, float[] fArr, int i5) {
        float f6 = this.f2000u;
        float f7 = this.f2001v;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            float f8 = (float) dArr[i6];
            int i7 = iArr[i6];
            if (i7 == 3) {
                f6 = f8;
            } else if (i7 == 4) {
                f7 = f8;
            }
        }
        fArr[i5] = f6;
        fArr[i5 + 1] = f7;
    }

    void q(int[] iArr, double[] dArr, float[] fArr, int i5) {
        float f6 = this.f1998s;
        float f7 = this.f1999t;
        float f8 = this.f2000u;
        float f9 = this.f2001v;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            float f10 = (float) dArr[i6];
            int i7 = iArr[i6];
            if (i7 == 1) {
                f6 = f10;
            } else if (i7 == 2) {
                f7 = f10;
            } else if (i7 == 3) {
                f8 = f10;
            } else if (i7 == 4) {
                f9 = f10;
            }
        }
        fArr[i5] = (f8 / 2.0f) + f6 + 0.0f;
        fArr[i5 + 1] = (f9 / 2.0f) + f7 + 0.0f;
    }

    int r(String str, double[] dArr, int i5) {
        androidx.constraintlayout.widget.a aVar = this.f2005z.get(str);
        if (aVar.g() == 1) {
            dArr[i5] = aVar.e();
            return 1;
        }
        int g5 = aVar.g();
        aVar.f(new float[g5]);
        int i6 = 0;
        while (i6 < g5) {
            dArr[i5] = r1[i6];
            i6++;
            i5++;
        }
        return g5;
    }

    int s(String str) {
        return this.f2005z.get(str).g();
    }

    void t(int[] iArr, double[] dArr, float[] fArr, int i5) {
        float f6 = this.f1998s;
        float f7 = this.f1999t;
        float f8 = this.f2000u;
        float f9 = this.f2001v;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            float f10 = (float) dArr[i6];
            int i7 = iArr[i6];
            if (i7 == 1) {
                f6 = f10;
            } else if (i7 == 2) {
                f7 = f10;
            } else if (i7 == 3) {
                f8 = f10;
            } else if (i7 == 4) {
                f9 = f10;
            }
        }
        float f11 = f8 + f6;
        float f12 = f9 + f7;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        int i8 = i5 + 1;
        fArr[i5] = f6 + 0.0f;
        int i9 = i8 + 1;
        fArr[i8] = f7 + 0.0f;
        int i10 = i9 + 1;
        fArr[i9] = f11 + 0.0f;
        int i11 = i10 + 1;
        fArr[i10] = f7 + 0.0f;
        int i12 = i11 + 1;
        fArr[i11] = f11 + 0.0f;
        int i13 = i12 + 1;
        fArr[i12] = f12 + 0.0f;
        fArr[i13] = f6 + 0.0f;
        fArr[i13 + 1] = f12 + 0.0f;
    }

    boolean u(String str) {
        return this.f2005z.containsKey(str);
    }

    void v(m mVar, u uVar, u uVar2) {
        float f6 = mVar.f1822a / 100.0f;
        this.f1996q = f6;
        this.f1995p = mVar.C;
        float f7 = Float.isNaN(mVar.D) ? f6 : mVar.D;
        float f8 = Float.isNaN(mVar.E) ? f6 : mVar.E;
        float f9 = uVar2.f2000u;
        float f10 = uVar.f2000u;
        float f11 = f9 - f10;
        float f12 = uVar2.f2001v;
        float f13 = uVar.f2001v;
        float f14 = f12 - f13;
        this.f1997r = this.f1996q;
        float f15 = uVar.f1998s;
        float f16 = uVar.f1999t;
        float f17 = ((f9 / 2.0f) + uVar2.f1998s) - ((f10 / 2.0f) + f15);
        float f18 = ((f12 / 2.0f) + uVar2.f1999t) - ((f13 / 2.0f) + f16);
        float f19 = (f11 * f7) / 2.0f;
        this.f1998s = (int) (((f17 * f6) + f15) - f19);
        float f20 = (f18 * f6) + f16;
        float f21 = (f14 * f8) / 2.0f;
        this.f1999t = (int) (f20 - f21);
        this.f2000u = (int) (f10 + r9);
        this.f2001v = (int) (f13 + r12);
        float f22 = Float.isNaN(mVar.F) ? f6 : mVar.F;
        float f23 = Float.isNaN(mVar.I) ? 0.0f : mVar.I;
        if (!Float.isNaN(mVar.G)) {
            f6 = mVar.G;
        }
        float f24 = Float.isNaN(mVar.H) ? 0.0f : mVar.H;
        this.A = 2;
        this.f1998s = (int) (((f24 * f18) + ((f22 * f17) + uVar.f1998s)) - f19);
        this.f1999t = (int) (((f18 * f6) + ((f17 * f23) + uVar.f1999t)) - f21);
        this.f1994o = androidx.constraintlayout.motion.utils.c.c(mVar.A);
        this.f2004y = mVar.B;
    }

    void w(m mVar, u uVar, u uVar2) {
        float f6 = mVar.f1822a / 100.0f;
        this.f1996q = f6;
        this.f1995p = mVar.C;
        float f7 = Float.isNaN(mVar.D) ? f6 : mVar.D;
        float f8 = Float.isNaN(mVar.E) ? f6 : mVar.E;
        float f9 = uVar2.f2000u - uVar.f2000u;
        float f10 = uVar2.f2001v - uVar.f2001v;
        this.f1997r = this.f1996q;
        if (!Float.isNaN(mVar.F)) {
            f6 = mVar.F;
        }
        float f11 = uVar.f1998s;
        float f12 = uVar.f2000u;
        float f13 = uVar.f1999t;
        float f14 = uVar.f2001v;
        float f15 = ((uVar2.f2000u / 2.0f) + uVar2.f1998s) - ((f12 / 2.0f) + f11);
        float f16 = ((uVar2.f2001v / 2.0f) + uVar2.f1999t) - ((f14 / 2.0f) + f13);
        float f17 = f15 * f6;
        float f18 = (f9 * f7) / 2.0f;
        this.f1998s = (int) ((f11 + f17) - f18);
        float f19 = f6 * f16;
        float f20 = (f10 * f8) / 2.0f;
        this.f1999t = (int) ((f13 + f19) - f20);
        this.f2000u = (int) (f12 + r7);
        this.f2001v = (int) (f14 + r8);
        float f21 = Float.isNaN(mVar.G) ? 0.0f : mVar.G;
        this.A = 1;
        float f22 = (int) ((uVar.f1998s + f17) - f18);
        float f23 = (int) ((uVar.f1999t + f19) - f20);
        this.f1998s = f22 + ((-f16) * f21);
        this.f1999t = f23 + (f15 * f21);
        this.f1994o = androidx.constraintlayout.motion.utils.c.c(mVar.A);
        this.f2004y = mVar.B;
    }

    void x(int i5, int i6, m mVar, u uVar, u uVar2) {
        float f6 = mVar.f1822a / 100.0f;
        this.f1996q = f6;
        this.f1995p = mVar.C;
        float f7 = Float.isNaN(mVar.D) ? f6 : mVar.D;
        float f8 = Float.isNaN(mVar.E) ? f6 : mVar.E;
        float f9 = uVar2.f2000u;
        float f10 = f9 - uVar.f2000u;
        float f11 = uVar2.f2001v;
        float f12 = f11 - uVar.f2001v;
        this.f1997r = this.f1996q;
        float f13 = uVar.f1998s;
        float f14 = uVar.f1999t;
        float f15 = (f9 / 2.0f) + uVar2.f1998s;
        float f16 = (f11 / 2.0f) + uVar2.f1999t;
        float f17 = f10 * f7;
        this.f1998s = (int) ((((f15 - ((r8 / 2.0f) + f13)) * f6) + f13) - (f17 / 2.0f));
        float f18 = f12 * f8;
        this.f1999t = (int) ((((f16 - ((r11 / 2.0f) + f14)) * f6) + f14) - (f18 / 2.0f));
        this.f2000u = (int) (r8 + f17);
        this.f2001v = (int) (r11 + f18);
        this.A = 3;
        if (!Float.isNaN(mVar.F)) {
            this.f1998s = (int) (mVar.F * ((int) (i5 - this.f2000u)));
        }
        if (!Float.isNaN(mVar.G)) {
            this.f1999t = (int) (mVar.G * ((int) (i6 - this.f2001v)));
        }
        this.f1994o = androidx.constraintlayout.motion.utils.c.c(mVar.A);
        this.f2004y = mVar.B;
    }

    void y(float f6, float f7, float f8, float f9) {
        this.f1998s = f6;
        this.f1999t = f7;
        this.f2000u = f8;
        this.f2001v = f9;
    }

    void z(float f6, float f7, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            float f12 = (float) dArr[i5];
            double d6 = dArr2[i5];
            int i6 = iArr[i5];
            if (i6 == 1) {
                f8 = f12;
            } else if (i6 == 2) {
                f10 = f12;
            } else if (i6 == 3) {
                f9 = f12;
            } else if (i6 == 4) {
                f11 = f12;
            }
        }
        float f13 = f8 - ((0.0f * f9) / 2.0f);
        float f14 = f10 - ((0.0f * f11) / 2.0f);
        fArr[0] = (((f9 * 1.0f) + f13) * f6) + ((1.0f - f6) * f13) + 0.0f;
        fArr[1] = (((f11 * 1.0f) + f14) * f7) + ((1.0f - f7) * f14) + 0.0f;
    }

    public u(int i5, int i6, m mVar, u uVar, u uVar2) {
        this.f1995p = 0;
        this.f2002w = Float.NaN;
        this.f2003x = Float.NaN;
        this.f2004y = f.f1803f;
        this.f2005z = new LinkedHashMap<>();
        this.A = 0;
        this.B = new double[18];
        this.C = new double[18];
        int i7 = mVar.J;
        if (i7 == 1) {
            w(mVar, uVar, uVar2);
        } else if (i7 != 2) {
            v(mVar, uVar, uVar2);
        } else {
            x(i5, i6, mVar, uVar, uVar2);
        }
    }
}
