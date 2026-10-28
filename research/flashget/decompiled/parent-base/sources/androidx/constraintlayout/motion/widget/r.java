package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.annotation.o0;
import androidx.constraintlayout.widget.d;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* compiled from: MotionPaths.java */
/* loaded from: classes.dex */
class r implements Comparable<r> {
    static final int A = 3;
    static final int B = 4;
    static final int C = 5;
    static final int D = 1;
    static final int E = 0;
    static final int F = 2;

    /* renamed from: v, reason: collision with root package name */
    public static final boolean f23531v = false;

    /* renamed from: w, reason: collision with root package name */
    public static final boolean f23532w = false;

    /* renamed from: x, reason: collision with root package name */
    static final int f23533x = 0;

    /* renamed from: y, reason: collision with root package name */
    static final int f23534y = 1;

    /* renamed from: z, reason: collision with root package name */
    static final int f23535z = 2;

    /* renamed from: b, reason: collision with root package name */
    androidx.constraintlayout.core.motion.utils.e f23536b;

    /* renamed from: d, reason: collision with root package name */
    float f23538d;

    /* renamed from: e, reason: collision with root package name */
    float f23539e;

    /* renamed from: f, reason: collision with root package name */
    float f23540f;

    /* renamed from: g, reason: collision with root package name */
    float f23541g;

    /* renamed from: h, reason: collision with root package name */
    float f23542h;

    /* renamed from: i, reason: collision with root package name */
    float f23543i;

    /* renamed from: l, reason: collision with root package name */
    int f23546l;

    /* renamed from: m, reason: collision with root package name */
    int f23547m;

    /* renamed from: n, reason: collision with root package name */
    float f23548n;

    /* renamed from: o, reason: collision with root package name */
    o f23549o;

    /* renamed from: p, reason: collision with root package name */
    LinkedHashMap<String, androidx.constraintlayout.widget.a> f23550p;

    /* renamed from: q, reason: collision with root package name */
    int f23551q;

    /* renamed from: r, reason: collision with root package name */
    int f23552r;

    /* renamed from: s, reason: collision with root package name */
    double[] f23553s;

    /* renamed from: t, reason: collision with root package name */
    double[] f23554t;

    /* renamed from: u, reason: collision with root package name */
    public static final String f23530u = "MotionPaths";
    static String[] G = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: c, reason: collision with root package name */
    int f23537c = 0;

    /* renamed from: j, reason: collision with root package name */
    float f23544j = Float.NaN;

    /* renamed from: k, reason: collision with root package name */
    float f23545k = Float.NaN;

    public r() {
        int i4 = f.f23308f;
        this.f23546l = i4;
        this.f23547m = i4;
        this.f23548n = Float.NaN;
        this.f23549o = null;
        this.f23550p = new LinkedHashMap<>();
        this.f23551q = 0;
        this.f23553s = new double[18];
        this.f23554t = new double[18];
    }

    private boolean d(float a5, float b5) {
        return (Float.isNaN(a5) || Float.isNaN(b5)) ? Float.isNaN(a5) != Float.isNaN(b5) : Math.abs(a5 - b5) > 1.0E-6f;
    }

    private static final float w(float sin, float cos, float cx, float cy, float x4, float y4) {
        return (((x4 - cx) * cos) - ((y4 - cy) * sin)) + cx;
    }

    private static final float x(float sin, float cos, float cx, float cy, float x4, float y4) {
        return ((y4 - cy) * cos) + ((x4 - cx) * sin) + cy;
    }

    public void a(d.a c5) {
        this.f23536b = androidx.constraintlayout.core.motion.utils.e.c(c5.f24047d.f24161d);
        d.c cVar = c5.f24047d;
        this.f23546l = cVar.f24162e;
        this.f23547m = cVar.f24159b;
        this.f23544j = cVar.f24166i;
        this.f23537c = cVar.f24163f;
        this.f23552r = cVar.f24160c;
        this.f23545k = c5.f24046c.f24176e;
        this.f23548n = c5.f24048e.D;
        for (String str : c5.f24050g.keySet()) {
            androidx.constraintlayout.widget.a aVar = c5.f24050g.get(str);
            if (aVar != null && aVar.n()) {
                this.f23550p.put(str, aVar);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(@o0 r o4) {
        return Float.compare(this.f23539e, o4.f23539e);
    }

    public void c(o toOrbit) {
        toOrbit.A(this.f23545k);
    }

    void e(r points, boolean[] mask, String[] custom, boolean arcMode) {
        boolean d5 = d(this.f23540f, points.f23540f);
        boolean d6 = d(this.f23541g, points.f23541g);
        mask[0] = mask[0] | d(this.f23539e, points.f23539e);
        boolean z4 = d5 | d6 | arcMode;
        mask[1] = mask[1] | z4;
        mask[2] = z4 | mask[2];
        mask[3] = mask[3] | d(this.f23542h, points.f23542h);
        mask[4] = d(this.f23543i, points.f23543i) | mask[4];
    }

    void f(double[] data, int[] toUse) {
        float[] fArr = {this.f23539e, this.f23540f, this.f23541g, this.f23542h, this.f23543i, this.f23544j};
        int i4 = 0;
        for (int i5 : toUse) {
            if (i5 < 6) {
                data[i4] = fArr[r2];
                i4++;
            }
        }
    }

    void g(int[] toUse, double[] data, float[] point, int offset) {
        float f4 = this.f23542h;
        float f5 = this.f23543i;
        for (int i4 = 0; i4 < toUse.length; i4++) {
            float f6 = (float) data[i4];
            int i5 = toUse[i4];
            if (i5 == 3) {
                f4 = f6;
            } else if (i5 == 4) {
                f5 = f6;
            }
        }
        point[offset] = f4;
        point[offset + 1] = f5;
    }

    void h(double p4, int[] toUse, double[] data, float[] point, int offset) {
        float f4 = this.f23540f;
        float f5 = this.f23541g;
        float f6 = this.f23542h;
        float f7 = this.f23543i;
        for (int i4 = 0; i4 < toUse.length; i4++) {
            float f10 = (float) data[i4];
            int i5 = toUse[i4];
            if (i5 == 1) {
                f4 = f10;
            } else if (i5 == 2) {
                f5 = f10;
            } else if (i5 == 3) {
                f6 = f10;
            } else if (i5 == 4) {
                f7 = f10;
            }
        }
        o oVar = this.f23549o;
        if (oVar != null) {
            float[] fArr = new float[2];
            oVar.m(p4, fArr, new float[2]);
            float f11 = fArr[0];
            float f12 = fArr[1];
            double d5 = f11;
            double d6 = f4;
            double d7 = f5;
            f4 = (float) (androidx.appcompat.app.b0.a(d7, d6, d5) - (f6 / 2.0f));
            f5 = (float) ((f12 - (Math.cos(d7) * d6)) - (f7 / 2.0f));
        }
        point[offset] = (f6 / 2.0f) + f4 + 0.0f;
        point[offset + 1] = (f7 / 2.0f) + f5 + 0.0f;
    }

    void i(double p4, int[] toUse, double[] data, float[] point, double[] vdata, float[] velocity) {
        float f4;
        float f5 = this.f23540f;
        float f6 = this.f23541g;
        float f7 = this.f23542h;
        float f10 = this.f23543i;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        for (int i4 = 0; i4 < toUse.length; i4++) {
            float f15 = (float) data[i4];
            float f16 = (float) vdata[i4];
            int i5 = toUse[i4];
            if (i5 == 1) {
                f5 = f15;
                f11 = f16;
            } else if (i5 == 2) {
                f6 = f15;
                f13 = f16;
            } else if (i5 == 3) {
                f7 = f15;
                f12 = f16;
            } else if (i5 == 4) {
                f10 = f15;
                f14 = f16;
            }
        }
        float f17 = 2.0f;
        float f18 = (f12 / 2.0f) + f11;
        float f19 = (f14 / 2.0f) + f13;
        o oVar = this.f23549o;
        if (oVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            oVar.m(p4, fArr, fArr2);
            float f20 = fArr[0];
            float f21 = fArr[1];
            float f22 = fArr2[0];
            float f23 = fArr2[1];
            double d5 = f5;
            double d6 = f6;
            f4 = f7;
            float a5 = (float) (androidx.appcompat.app.b0.a(d6, d5, f20) - (f7 / 2.0f));
            float cos = (float) ((f21 - (Math.cos(d6) * d5)) - (f10 / 2.0f));
            double d7 = f11;
            double d10 = f13;
            float cos2 = (float) ((Math.cos(d6) * d10) + androidx.appcompat.app.b0.a(d6, d7, f22));
            f19 = (float) androidx.appcompat.app.b0.a(d6, d10, f23 - (Math.cos(d6) * d7));
            f18 = cos2;
            f5 = a5;
            f6 = cos;
            f17 = 2.0f;
        } else {
            f4 = f7;
        }
        point[0] = (f4 / f17) + f5 + 0.0f;
        point[1] = (f10 / f17) + f6 + 0.0f;
        velocity[0] = f18;
        velocity[1] = f19;
    }

    void j(double p4, int[] toUse, double[] data, float[] point, int offset) {
        float f4 = this.f23540f;
        float f5 = this.f23541g;
        float f6 = this.f23542h;
        float f7 = this.f23543i;
        for (int i4 = 0; i4 < toUse.length; i4++) {
            float f10 = (float) data[i4];
            int i5 = toUse[i4];
            if (i5 == 1) {
                f4 = f10;
            } else if (i5 == 2) {
                f5 = f10;
            } else if (i5 == 3) {
                f6 = f10;
            } else if (i5 == 4) {
                f7 = f10;
            }
        }
        o oVar = this.f23549o;
        if (oVar != null) {
            float[] fArr = new float[2];
            oVar.m(p4, fArr, new float[2]);
            float f11 = fArr[0];
            float f12 = fArr[1];
            double d5 = f11;
            double d6 = f4;
            double d7 = f5;
            f4 = (float) (androidx.appcompat.app.b0.a(d7, d6, d5) - (f6 / 2.0f));
            f5 = (float) ((f12 - (Math.cos(d7) * d6)) - (f7 / 2.0f));
        }
        point[offset] = (f6 / 2.0f) + f4 + 0.0f;
        point[offset + 1] = (f7 / 2.0f) + f5 + 0.0f;
    }

    int k(String name, double[] value, int offset) {
        androidx.constraintlayout.widget.a aVar = this.f23550p.get(name);
        int i4 = 0;
        if (aVar == null) {
            return 0;
        }
        if (aVar.p() == 1) {
            value[offset] = aVar.k();
            return 1;
        }
        int p4 = aVar.p();
        aVar.l(new float[p4]);
        while (i4 < p4) {
            value[offset] = r2[i4];
            i4++;
            offset++;
        }
        return p4;
    }

    int l(String name) {
        androidx.constraintlayout.widget.a aVar = this.f23550p.get(name);
        if (aVar == null) {
            return 0;
        }
        return aVar.p();
    }

    void m(int[] toUse, double[] data, float[] path, int offset) {
        float f4 = this.f23540f;
        float f5 = this.f23541g;
        float f6 = this.f23542h;
        float f7 = this.f23543i;
        for (int i4 = 0; i4 < toUse.length; i4++) {
            float f10 = (float) data[i4];
            int i5 = toUse[i4];
            if (i5 == 1) {
                f4 = f10;
            } else if (i5 == 2) {
                f5 = f10;
            } else if (i5 == 3) {
                f6 = f10;
            } else if (i5 == 4) {
                f7 = f10;
            }
        }
        o oVar = this.f23549o;
        if (oVar != null) {
            float n4 = oVar.n();
            float o4 = this.f23549o.o();
            double d5 = n4;
            double d6 = f4;
            double d7 = f5;
            float a5 = (float) (androidx.appcompat.app.b0.a(d7, d6, d5) - (f6 / 2.0f));
            f5 = (float) ((o4 - (Math.cos(d7) * d6)) - (f7 / 2.0f));
            f4 = a5;
        }
        float f11 = f6 + f4;
        float f12 = f7 + f5;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        path[offset] = f4 + 0.0f;
        path[offset + 1] = f5 + 0.0f;
        path[offset + 2] = f11 + 0.0f;
        path[offset + 3] = f5 + 0.0f;
        path[offset + 4] = f11 + 0.0f;
        path[offset + 5] = f12 + 0.0f;
        path[offset + 6] = f4 + 0.0f;
        path[offset + 7] = f12 + 0.0f;
    }

    boolean n(String name) {
        return this.f23550p.containsKey(name);
    }

    void o(j c5, r startTimePoint, r endTimePoint) {
        float f4 = c5.f23329a / 100.0f;
        this.f23538d = f4;
        this.f23537c = c5.H;
        float f5 = Float.isNaN(c5.I) ? f4 : c5.I;
        float f6 = Float.isNaN(c5.J) ? f4 : c5.J;
        float f7 = endTimePoint.f23542h;
        float f10 = startTimePoint.f23542h;
        float f11 = f7 - f10;
        float f12 = endTimePoint.f23543i;
        float f13 = startTimePoint.f23543i;
        float f14 = f12 - f13;
        this.f23539e = this.f23538d;
        float f15 = startTimePoint.f23540f;
        float f16 = startTimePoint.f23541g;
        float f17 = ((f7 / 2.0f) + endTimePoint.f23540f) - ((f10 / 2.0f) + f15);
        float f18 = ((f12 / 2.0f) + endTimePoint.f23541g) - ((f13 / 2.0f) + f16);
        float f19 = (f11 * f5) / 2.0f;
        this.f23540f = (int) (((f17 * f4) + f15) - f19);
        float f20 = (f18 * f4) + f16;
        float f21 = (f14 * f6) / 2.0f;
        this.f23541g = (int) (f20 - f21);
        this.f23542h = (int) (f10 + r9);
        this.f23543i = (int) (f13 + r12);
        float f22 = Float.isNaN(c5.K) ? f4 : c5.K;
        float f23 = Float.isNaN(c5.N) ? 0.0f : c5.N;
        if (!Float.isNaN(c5.L)) {
            f4 = c5.L;
        }
        float f24 = Float.isNaN(c5.M) ? 0.0f : c5.M;
        this.f23551q = 0;
        this.f23540f = (int) (((f24 * f18) + ((f22 * f17) + startTimePoint.f23540f)) - f19);
        this.f23541g = (int) (((f18 * f4) + ((f17 * f23) + startTimePoint.f23541g)) - f21);
        this.f23536b = androidx.constraintlayout.core.motion.utils.e.c(c5.F);
        this.f23546l = c5.G;
    }

    void p(j c5, r startTimePoint, r endTimePoint) {
        float f4 = c5.f23329a / 100.0f;
        this.f23538d = f4;
        this.f23537c = c5.H;
        float f5 = Float.isNaN(c5.I) ? f4 : c5.I;
        float f6 = Float.isNaN(c5.J) ? f4 : c5.J;
        float f7 = endTimePoint.f23542h - startTimePoint.f23542h;
        float f10 = endTimePoint.f23543i - startTimePoint.f23543i;
        this.f23539e = this.f23538d;
        if (!Float.isNaN(c5.K)) {
            f4 = c5.K;
        }
        float f11 = startTimePoint.f23540f;
        float f12 = startTimePoint.f23542h;
        float f13 = startTimePoint.f23541g;
        float f14 = startTimePoint.f23543i;
        float f15 = ((endTimePoint.f23542h / 2.0f) + endTimePoint.f23540f) - ((f12 / 2.0f) + f11);
        float f16 = ((endTimePoint.f23543i / 2.0f) + endTimePoint.f23541g) - ((f14 / 2.0f) + f13);
        float f17 = f15 * f4;
        float f18 = (f7 * f5) / 2.0f;
        this.f23540f = (int) ((f11 + f17) - f18);
        float f19 = f4 * f16;
        float f20 = (f10 * f6) / 2.0f;
        this.f23541g = (int) ((f13 + f19) - f20);
        this.f23542h = (int) (f12 + r7);
        this.f23543i = (int) (f14 + r8);
        float f21 = Float.isNaN(c5.L) ? 0.0f : c5.L;
        this.f23551q = 1;
        float f22 = (int) ((startTimePoint.f23540f + f17) - f18);
        float f23 = (int) ((startTimePoint.f23541g + f19) - f20);
        this.f23540f = f22 + ((-f16) * f21);
        this.f23541g = f23 + (f15 * f21);
        this.f23547m = this.f23547m;
        this.f23536b = androidx.constraintlayout.core.motion.utils.e.c(c5.F);
        this.f23546l = c5.G;
    }

    void q(int parentWidth, int parentHeight, j c5, r s4, r e4) {
        float min;
        float f4;
        float f5 = c5.f23329a / 100.0f;
        this.f23538d = f5;
        this.f23537c = c5.H;
        this.f23551q = c5.O;
        float f6 = Float.isNaN(c5.I) ? f5 : c5.I;
        float f7 = Float.isNaN(c5.J) ? f5 : c5.J;
        float f10 = e4.f23542h;
        float f11 = s4.f23542h;
        float f12 = e4.f23543i;
        float f13 = s4.f23543i;
        this.f23539e = this.f23538d;
        this.f23542h = (int) (((f10 - f11) * f6) + f11);
        this.f23543i = (int) (((f12 - f13) * f7) + f13);
        int i4 = c5.O;
        if (i4 == 1) {
            float f14 = Float.isNaN(c5.K) ? f5 : c5.K;
            float f15 = e4.f23540f;
            float f16 = s4.f23540f;
            this.f23540f = androidx.appcompat.graphics.drawable.d.a(f15, f16, f14, f16);
            if (!Float.isNaN(c5.L)) {
                f5 = c5.L;
            }
            float f17 = e4.f23541g;
            float f18 = s4.f23541g;
            this.f23541g = androidx.appcompat.graphics.drawable.d.a(f17, f18, f5, f18);
        } else if (i4 != 2) {
            float f19 = Float.isNaN(c5.K) ? f5 : c5.K;
            float f20 = e4.f23540f;
            float f21 = s4.f23540f;
            this.f23540f = androidx.appcompat.graphics.drawable.d.a(f20, f21, f19, f21);
            if (!Float.isNaN(c5.L)) {
                f5 = c5.L;
            }
            float f22 = e4.f23541g;
            float f23 = s4.f23541g;
            this.f23541g = androidx.appcompat.graphics.drawable.d.a(f22, f23, f5, f23);
        } else {
            if (Float.isNaN(c5.K)) {
                float f24 = e4.f23540f;
                float f25 = s4.f23540f;
                min = androidx.appcompat.graphics.drawable.d.a(f24, f25, f5, f25);
            } else {
                min = Math.min(f7, f6) * c5.K;
            }
            this.f23540f = min;
            if (Float.isNaN(c5.L)) {
                float f26 = e4.f23541g;
                float f27 = s4.f23541g;
                f4 = androidx.appcompat.graphics.drawable.d.a(f26, f27, f5, f27);
            } else {
                f4 = c5.L;
            }
            this.f23541g = f4;
        }
        this.f23547m = s4.f23547m;
        this.f23536b = androidx.constraintlayout.core.motion.utils.e.c(c5.F);
        this.f23546l = c5.G;
    }

    void r(int parentWidth, int parentHeight, j c5, r startTimePoint, r endTimePoint) {
        float f4 = c5.f23329a / 100.0f;
        this.f23538d = f4;
        this.f23537c = c5.H;
        float f5 = Float.isNaN(c5.I) ? f4 : c5.I;
        float f6 = Float.isNaN(c5.J) ? f4 : c5.J;
        float f7 = endTimePoint.f23542h;
        float f10 = f7 - startTimePoint.f23542h;
        float f11 = endTimePoint.f23543i;
        float f12 = f11 - startTimePoint.f23543i;
        this.f23539e = this.f23538d;
        float f13 = startTimePoint.f23540f;
        float f14 = startTimePoint.f23541g;
        float f15 = (f7 / 2.0f) + endTimePoint.f23540f;
        float f16 = (f11 / 2.0f) + endTimePoint.f23541g;
        float f17 = f10 * f5;
        this.f23540f = (int) ((((f15 - ((r8 / 2.0f) + f13)) * f4) + f13) - (f17 / 2.0f));
        float f18 = f12 * f6;
        this.f23541g = (int) ((((f16 - ((r11 / 2.0f) + f14)) * f4) + f14) - (f18 / 2.0f));
        this.f23542h = (int) (r8 + f17);
        this.f23543i = (int) (r11 + f18);
        this.f23551q = 2;
        if (!Float.isNaN(c5.K)) {
            this.f23540f = (int) (c5.K * ((int) (parentWidth - this.f23542h)));
        }
        if (!Float.isNaN(c5.L)) {
            this.f23541g = (int) (c5.L * ((int) (parentHeight - this.f23543i)));
        }
        this.f23547m = this.f23547m;
        this.f23536b = androidx.constraintlayout.core.motion.utils.e.c(c5.F);
        this.f23546l = c5.G;
    }

    void s(float x4, float y4, float w4, float h4) {
        this.f23540f = x4;
        this.f23541g = y4;
        this.f23542h = w4;
        this.f23543i = h4;
    }

    void t(float locationX, float locationY, float[] mAnchorDpDt, int[] toUse, double[] deltaData, double[] data) {
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        for (int i4 = 0; i4 < toUse.length; i4++) {
            float f10 = (float) deltaData[i4];
            double d5 = data[i4];
            int i5 = toUse[i4];
            if (i5 == 1) {
                f4 = f10;
            } else if (i5 == 2) {
                f6 = f10;
            } else if (i5 == 3) {
                f5 = f10;
            } else if (i5 == 4) {
                f7 = f10;
            }
        }
        float f11 = f4 - ((0.0f * f5) / 2.0f);
        float f12 = f6 - ((0.0f * f7) / 2.0f);
        mAnchorDpDt[0] = (((f5 * 1.0f) + f11) * locationX) + ((1.0f - locationX) * f11) + 0.0f;
        mAnchorDpDt[1] = (((f7 * 1.0f) + f12) * locationY) + ((1.0f - locationY) * f12) + 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void u(float position, View view, int[] toUse, double[] data, double[] slope, double[] cycle, boolean mForceMeasure) {
        float f4;
        float f5;
        float f6 = this.f23540f;
        float f7 = this.f23541g;
        float f10 = this.f23542h;
        float f11 = this.f23543i;
        if (toUse.length != 0 && this.f23553s.length <= toUse[toUse.length - 1]) {
            int i4 = toUse[toUse.length - 1] + 1;
            this.f23553s = new double[i4];
            this.f23554t = new double[i4];
        }
        Arrays.fill(this.f23553s, Double.NaN);
        for (int i5 = 0; i5 < toUse.length; i5++) {
            double[] dArr = this.f23553s;
            int i6 = toUse[i5];
            dArr[i6] = data[i5];
            this.f23554t[i6] = slope[i5];
        }
        float f12 = Float.NaN;
        int i7 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        while (true) {
            double[] dArr2 = this.f23553s;
            if (i7 >= dArr2.length) {
                break;
            }
            boolean isNaN = Double.isNaN(dArr2[i7]);
            double d5 = com.google.firebase.remoteconfig.p.f60679p;
            if (isNaN && (cycle == null || cycle[i7] == com.google.firebase.remoteconfig.p.f60679p)) {
                f5 = f12;
            } else {
                if (cycle != null) {
                    d5 = cycle[i7];
                }
                if (!Double.isNaN(this.f23553s[i7])) {
                    d5 = this.f23553s[i7] + d5;
                }
                f5 = f12;
                float f17 = (float) d5;
                float f18 = (float) this.f23554t[i7];
                if (i7 == 1) {
                    f12 = f5;
                    f13 = f18;
                    f6 = f17;
                } else if (i7 == 2) {
                    f12 = f5;
                    f14 = f18;
                    f7 = f17;
                } else if (i7 == 3) {
                    f12 = f5;
                    f15 = f18;
                    f10 = f17;
                } else if (i7 == 4) {
                    f12 = f5;
                    f16 = f18;
                    f11 = f17;
                } else if (i7 == 5) {
                    f12 = f17;
                }
                i7++;
            }
            f12 = f5;
            i7++;
        }
        float f19 = f12;
        o oVar = this.f23549o;
        if (oVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            oVar.m(position, fArr, fArr2);
            float f20 = fArr[0];
            float f21 = fArr[1];
            float f22 = fArr2[0];
            float f23 = fArr2[1];
            double d6 = f6;
            double d7 = f7;
            float a5 = (float) (androidx.appcompat.app.b0.a(d7, d6, f20) - (f10 / 2.0f));
            f4 = f11;
            float cos = (float) ((f21 - (Math.cos(d7) * d6)) - (f11 / 2.0f));
            double d10 = f13;
            double d11 = f14;
            float cos2 = (float) ((Math.cos(d7) * d6 * d11) + androidx.appcompat.app.b0.a(d7, d10, f22));
            float sin = (float) ((Math.sin(d7) * d6 * d11) + (f23 - (Math.cos(d7) * d10)));
            if (slope.length >= 2) {
                slope[0] = cos2;
                slope[1] = sin;
            }
            if (!Float.isNaN(f19)) {
                view.setRotation((float) (Math.toDegrees(Math.atan2(sin, cos2)) + f19));
            }
            f6 = a5;
            f7 = cos;
        } else {
            f4 = f11;
            if (!Float.isNaN(f19)) {
                view.setRotation((float) (Math.toDegrees(Math.atan2((f16 / 2.0f) + f14, (f15 / 2.0f) + f13)) + f19 + 0.0f));
            }
        }
        if (view instanceof e) {
            ((e) view).a(f6, f7, f10 + f6, f7 + f4);
            return;
        }
        float f24 = f6 + 0.5f;
        int i10 = (int) f24;
        float f25 = f7 + 0.5f;
        int i11 = (int) f25;
        int i12 = (int) (f24 + f10);
        int i13 = (int) (f25 + f4);
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != view.getMeasuredWidth() || i15 != view.getMeasuredHeight() || mForceMeasure) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
        }
        view.layout(i10, i11, i12, i13);
    }

    public void v(o mc, r relative) {
        double d5 = (((this.f23542h / 2.0f) + this.f23540f) - relative.f23540f) - (relative.f23542h / 2.0f);
        double d6 = (((this.f23543i / 2.0f) + this.f23541g) - relative.f23541g) - (relative.f23543i / 2.0f);
        this.f23549o = mc;
        this.f23540f = (float) Math.hypot(d6, d5);
        if (Float.isNaN(this.f23548n)) {
            this.f23541g = (float) (Math.atan2(d6, d5) + 1.5707963267948966d);
        } else {
            this.f23541g = (float) Math.toRadians(this.f23548n);
        }
    }

    public r(int parentWidth, int parentHeight, j c5, r startTimePoint, r endTimePoint) {
        int i4 = f.f23308f;
        this.f23546l = i4;
        this.f23547m = i4;
        this.f23548n = Float.NaN;
        this.f23549o = null;
        this.f23550p = new LinkedHashMap<>();
        this.f23551q = 0;
        this.f23553s = new double[18];
        this.f23554t = new double[18];
        if (startTimePoint.f23547m != f.f23308f) {
            q(parentWidth, parentHeight, c5, startTimePoint, endTimePoint);
            return;
        }
        int i5 = c5.O;
        if (i5 == 1) {
            p(c5, startTimePoint, endTimePoint);
        } else if (i5 != 2) {
            o(c5, startTimePoint, endTimePoint);
        } else {
            r(parentWidth, parentHeight, c5, startTimePoint, endTimePoint);
        }
    }
}
