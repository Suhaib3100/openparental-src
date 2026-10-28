package androidx.constraintlayout.core.motion;

import androidx.appcompat.app.b0;
import androidx.constraintlayout.core.motion.f;
import com.google.firebase.remoteconfig.p;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: MotionPaths.java */
/* loaded from: classes.dex */
public class e implements Comparable<e> {
    static final int A = 3;
    static final int B = 4;
    static final int C = 5;
    public static final int D = 1;
    public static final int E = 0;
    public static final int F = 2;

    /* renamed from: v, reason: collision with root package name */
    public static final boolean f22029v = false;

    /* renamed from: w, reason: collision with root package name */
    public static final boolean f22030w = false;

    /* renamed from: x, reason: collision with root package name */
    static final int f22031x = 0;

    /* renamed from: y, reason: collision with root package name */
    static final int f22032y = 1;

    /* renamed from: z, reason: collision with root package name */
    static final int f22033z = 2;

    /* renamed from: b, reason: collision with root package name */
    androidx.constraintlayout.core.motion.utils.e f22034b;

    /* renamed from: c, reason: collision with root package name */
    int f22035c;

    /* renamed from: d, reason: collision with root package name */
    float f22036d;

    /* renamed from: e, reason: collision with root package name */
    float f22037e;

    /* renamed from: f, reason: collision with root package name */
    float f22038f;

    /* renamed from: g, reason: collision with root package name */
    float f22039g;

    /* renamed from: h, reason: collision with root package name */
    float f22040h;

    /* renamed from: i, reason: collision with root package name */
    float f22041i;

    /* renamed from: j, reason: collision with root package name */
    float f22042j;

    /* renamed from: k, reason: collision with root package name */
    float f22043k;

    /* renamed from: l, reason: collision with root package name */
    int f22044l;

    /* renamed from: m, reason: collision with root package name */
    int f22045m;

    /* renamed from: n, reason: collision with root package name */
    float f22046n;

    /* renamed from: o, reason: collision with root package name */
    c f22047o;

    /* renamed from: p, reason: collision with root package name */
    HashMap<String, b> f22048p;

    /* renamed from: q, reason: collision with root package name */
    int f22049q;

    /* renamed from: r, reason: collision with root package name */
    int f22050r;

    /* renamed from: s, reason: collision with root package name */
    double[] f22051s;

    /* renamed from: t, reason: collision with root package name */
    double[] f22052t;

    /* renamed from: u, reason: collision with root package name */
    public static final String f22028u = "MotionPaths";
    static String[] G = {"position", "x", "y", "width", "height", "pathRotate"};

    public e() {
        this.f22035c = 0;
        this.f22042j = Float.NaN;
        this.f22043k = Float.NaN;
        this.f22044l = -1;
        this.f22045m = -1;
        this.f22046n = Float.NaN;
        this.f22047o = null;
        this.f22048p = new HashMap<>();
        this.f22049q = 0;
        this.f22051s = new double[18];
        this.f22052t = new double[18];
    }

    private boolean d(float f4, float f5) {
        return (Float.isNaN(f4) || Float.isNaN(f5)) ? Float.isNaN(f4) != Float.isNaN(f5) : Math.abs(f4 - f5) > 1.0E-6f;
    }

    private static final float w(float f4, float f5, float f6, float f7, float f10, float f11) {
        return (((f10 - f6) * f5) - ((f11 - f7) * f4)) + f6;
    }

    private static final float x(float f4, float f5, float f6, float f7, float f10, float f11) {
        return ((f11 - f7) * f5) + ((f10 - f6) * f4) + f7;
    }

    public void a(f fVar) {
        this.f22034b = androidx.constraintlayout.core.motion.utils.e.c(fVar.f22068i.f22077c);
        f.a aVar = fVar.f22068i;
        this.f22044l = aVar.f22078d;
        this.f22045m = aVar.f22075a;
        this.f22042j = aVar.f22082h;
        this.f22035c = aVar.f22079e;
        this.f22050r = aVar.f22076b;
        this.f22043k = fVar.f22069j.f22091d;
        this.f22046n = 0.0f;
        for (String str : fVar.j()) {
            b i4 = fVar.i(str);
            if (i4 != null && i4.q()) {
                this.f22048p.put(str, i4);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(e eVar) {
        return Float.compare(this.f22037e, eVar.f22037e);
    }

    public void c(c cVar) {
        cVar.F(this.f22043k);
    }

    void e(e eVar, boolean[] zArr, String[] strArr, boolean z4) {
        boolean d5 = d(this.f22038f, eVar.f22038f);
        boolean d6 = d(this.f22039g, eVar.f22039g);
        zArr[0] = zArr[0] | d(this.f22037e, eVar.f22037e);
        boolean z5 = d5 | d6 | z4;
        zArr[1] = zArr[1] | z5;
        zArr[2] = z5 | zArr[2];
        zArr[3] = zArr[3] | d(this.f22040h, eVar.f22040h);
        zArr[4] = d(this.f22041i, eVar.f22041i) | zArr[4];
    }

    void f(double[] dArr, int[] iArr) {
        float[] fArr = {this.f22037e, this.f22038f, this.f22039g, this.f22040h, this.f22041i, this.f22042j};
        int i4 = 0;
        for (int i5 : iArr) {
            if (i5 < 6) {
                dArr[i4] = fArr[r2];
                i4++;
            }
        }
    }

    void g(int[] iArr, double[] dArr, float[] fArr, int i4) {
        float f4 = this.f22040h;
        float f5 = this.f22041i;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            float f6 = (float) dArr[i5];
            int i6 = iArr[i5];
            if (i6 == 3) {
                f4 = f6;
            } else if (i6 == 4) {
                f5 = f6;
            }
        }
        fArr[i4] = f4;
        fArr[i4 + 1] = f5;
    }

    void h(double d5, int[] iArr, double[] dArr, float[] fArr, int i4) {
        float f4 = this.f22038f;
        float f5 = this.f22039g;
        float f6 = this.f22040h;
        float f7 = this.f22041i;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            float f10 = (float) dArr[i5];
            int i6 = iArr[i5];
            if (i6 == 1) {
                f4 = f10;
            } else if (i6 == 2) {
                f5 = f10;
            } else if (i6 == 3) {
                f6 = f10;
            } else if (i6 == 4) {
                f7 = f10;
            }
        }
        c cVar = this.f22047o;
        if (cVar != null) {
            float[] fArr2 = new float[2];
            cVar.r(d5, fArr2, new float[2]);
            float f11 = fArr2[0];
            float f12 = fArr2[1];
            double d6 = f11;
            double d7 = f4;
            double d10 = f5;
            f4 = (float) (b0.a(d10, d7, d6) - (f6 / 2.0f));
            f5 = (float) ((f12 - (Math.cos(d10) * d7)) - (f7 / 2.0f));
        }
        fArr[i4] = (f6 / 2.0f) + f4 + 0.0f;
        fArr[i4 + 1] = (f7 / 2.0f) + f5 + 0.0f;
    }

    void i(double d5, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f4;
        float f5 = this.f22038f;
        float f6 = this.f22039g;
        float f7 = this.f22040h;
        float f10 = this.f22041i;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            float f15 = (float) dArr[i4];
            float f16 = (float) dArr2[i4];
            int i5 = iArr[i4];
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
        c cVar = this.f22047o;
        if (cVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            cVar.r(d5, fArr3, fArr4);
            float f20 = fArr3[0];
            float f21 = fArr3[1];
            float f22 = fArr4[0];
            float f23 = fArr4[1];
            double d6 = f5;
            double d7 = f6;
            f4 = f7;
            float a5 = (float) (b0.a(d7, d6, f20) - (f7 / 2.0f));
            float cos = (float) ((f21 - (Math.cos(d7) * d6)) - (f10 / 2.0f));
            double d10 = f11;
            double d11 = f13;
            float cos2 = (float) ((Math.cos(d7) * d11) + b0.a(d7, d10, f22));
            f19 = (float) b0.a(d7, d11, f23 - (Math.cos(d7) * d10));
            f18 = cos2;
            f5 = a5;
            f6 = cos;
            f17 = 2.0f;
        } else {
            f4 = f7;
        }
        fArr[0] = (f4 / f17) + f5 + 0.0f;
        fArr[1] = (f10 / f17) + f6 + 0.0f;
        fArr2[0] = f18;
        fArr2[1] = f19;
    }

    void j(double d5, int[] iArr, double[] dArr, float[] fArr, int i4) {
        float f4 = this.f22038f;
        float f5 = this.f22039g;
        float f6 = this.f22040h;
        float f7 = this.f22041i;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            float f10 = (float) dArr[i5];
            int i6 = iArr[i5];
            if (i6 == 1) {
                f4 = f10;
            } else if (i6 == 2) {
                f5 = f10;
            } else if (i6 == 3) {
                f6 = f10;
            } else if (i6 == 4) {
                f7 = f10;
            }
        }
        c cVar = this.f22047o;
        if (cVar != null) {
            float[] fArr2 = new float[2];
            cVar.r(d5, fArr2, new float[2]);
            float f11 = fArr2[0];
            float f12 = fArr2[1];
            double d6 = f11;
            double d7 = f4;
            double d10 = f5;
            f4 = (float) (b0.a(d10, d7, d6) - (f6 / 2.0f));
            f5 = (float) ((f12 - (Math.cos(d10) * d7)) - (f7 / 2.0f));
        }
        fArr[i4] = (f6 / 2.0f) + f4 + 0.0f;
        fArr[i4 + 1] = (f7 / 2.0f) + f5 + 0.0f;
    }

    int k(String str, double[] dArr, int i4) {
        b bVar = this.f22048p.get(str);
        int i5 = 0;
        if (bVar == null) {
            return 0;
        }
        if (bVar.r() == 1) {
            dArr[i4] = bVar.n();
            return 1;
        }
        int r4 = bVar.r();
        bVar.o(new float[r4]);
        while (i5 < r4) {
            dArr[i4] = r2[i5];
            i5++;
            i4++;
        }
        return r4;
    }

    int l(String str) {
        b bVar = this.f22048p.get(str);
        if (bVar == null) {
            return 0;
        }
        return bVar.r();
    }

    void m(int[] iArr, double[] dArr, float[] fArr, int i4) {
        float f4 = this.f22038f;
        float f5 = this.f22039g;
        float f6 = this.f22040h;
        float f7 = this.f22041i;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            float f10 = (float) dArr[i5];
            int i6 = iArr[i5];
            if (i6 == 1) {
                f4 = f10;
            } else if (i6 == 2) {
                f5 = f10;
            } else if (i6 == 3) {
                f6 = f10;
            } else if (i6 == 4) {
                f7 = f10;
            }
        }
        c cVar = this.f22047o;
        if (cVar != null) {
            float s4 = cVar.s();
            float t4 = this.f22047o.t();
            double d5 = s4;
            double d6 = f4;
            double d7 = f5;
            float a5 = (float) (b0.a(d7, d6, d5) - (f6 / 2.0f));
            f5 = (float) ((t4 - (Math.cos(d7) * d6)) - (f7 / 2.0f));
            f4 = a5;
        }
        float f11 = f6 + f4;
        float f12 = f7 + f5;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        fArr[i4] = f4 + 0.0f;
        fArr[i4 + 1] = f5 + 0.0f;
        fArr[i4 + 2] = f11 + 0.0f;
        fArr[i4 + 3] = f5 + 0.0f;
        fArr[i4 + 4] = f11 + 0.0f;
        fArr[i4 + 5] = f12 + 0.0f;
        fArr[i4 + 6] = f4 + 0.0f;
        fArr[i4 + 7] = f12 + 0.0f;
    }

    boolean n(String str) {
        return this.f22048p.containsKey(str);
    }

    void o(androidx.constraintlayout.core.motion.key.f fVar, e eVar, e eVar2) {
        float f4 = fVar.f22117h / 100.0f;
        this.f22036d = f4;
        this.f22035c = fVar.B;
        float f5 = Float.isNaN(fVar.C) ? f4 : fVar.C;
        float f6 = Float.isNaN(fVar.D) ? f4 : fVar.D;
        float f7 = eVar2.f22040h;
        float f10 = eVar.f22040h;
        float f11 = f7 - f10;
        float f12 = eVar2.f22041i;
        float f13 = eVar.f22041i;
        float f14 = f12 - f13;
        this.f22037e = this.f22036d;
        float f15 = eVar.f22038f;
        float f16 = eVar.f22039g;
        float f17 = ((f7 / 2.0f) + eVar2.f22038f) - ((f10 / 2.0f) + f15);
        float f18 = ((f12 / 2.0f) + eVar2.f22039g) - ((f13 / 2.0f) + f16);
        float f19 = (f11 * f5) / 2.0f;
        this.f22038f = (int) (((f17 * f4) + f15) - f19);
        float f20 = (f18 * f4) + f16;
        float f21 = (f14 * f6) / 2.0f;
        this.f22039g = (int) (f20 - f21);
        this.f22040h = (int) (f10 + r9);
        this.f22041i = (int) (f13 + r12);
        float f22 = Float.isNaN(fVar.E) ? f4 : fVar.E;
        float f23 = Float.isNaN(fVar.H) ? 0.0f : fVar.H;
        if (!Float.isNaN(fVar.F)) {
            f4 = fVar.F;
        }
        float f24 = Float.isNaN(fVar.G) ? 0.0f : fVar.G;
        this.f22049q = 0;
        this.f22038f = (int) (((f24 * f18) + ((f22 * f17) + eVar.f22038f)) - f19);
        this.f22039g = (int) (((f18 * f4) + ((f17 * f23) + eVar.f22039g)) - f21);
        this.f22034b = androidx.constraintlayout.core.motion.utils.e.c(fVar.f22132z);
        this.f22044l = fVar.A;
    }

    void p(androidx.constraintlayout.core.motion.key.f fVar, e eVar, e eVar2) {
        float f4 = fVar.f22117h / 100.0f;
        this.f22036d = f4;
        this.f22035c = fVar.B;
        float f5 = Float.isNaN(fVar.C) ? f4 : fVar.C;
        float f6 = Float.isNaN(fVar.D) ? f4 : fVar.D;
        float f7 = eVar2.f22040h - eVar.f22040h;
        float f10 = eVar2.f22041i - eVar.f22041i;
        this.f22037e = this.f22036d;
        if (!Float.isNaN(fVar.E)) {
            f4 = fVar.E;
        }
        float f11 = eVar.f22038f;
        float f12 = eVar.f22040h;
        float f13 = eVar.f22039g;
        float f14 = eVar.f22041i;
        float f15 = ((eVar2.f22040h / 2.0f) + eVar2.f22038f) - ((f12 / 2.0f) + f11);
        float f16 = ((eVar2.f22041i / 2.0f) + eVar2.f22039g) - ((f14 / 2.0f) + f13);
        float f17 = f15 * f4;
        float f18 = (f7 * f5) / 2.0f;
        this.f22038f = (int) ((f11 + f17) - f18);
        float f19 = f4 * f16;
        float f20 = (f10 * f6) / 2.0f;
        this.f22039g = (int) ((f13 + f19) - f20);
        this.f22040h = (int) (f12 + r7);
        this.f22041i = (int) (f14 + r8);
        float f21 = Float.isNaN(fVar.F) ? 0.0f : fVar.F;
        this.f22049q = 1;
        float f22 = (int) ((eVar.f22038f + f17) - f18);
        float f23 = (int) ((eVar.f22039g + f19) - f20);
        this.f22038f = f22 + ((-f16) * f21);
        this.f22039g = f23 + (f15 * f21);
        this.f22045m = this.f22045m;
        this.f22034b = androidx.constraintlayout.core.motion.utils.e.c(fVar.f22132z);
        this.f22044l = fVar.A;
    }

    void q(int i4, int i5, androidx.constraintlayout.core.motion.key.f fVar, e eVar, e eVar2) {
        float min;
        float f4;
        float f5 = fVar.f22117h / 100.0f;
        this.f22036d = f5;
        this.f22035c = fVar.B;
        this.f22049q = fVar.I;
        float f6 = Float.isNaN(fVar.C) ? f5 : fVar.C;
        float f7 = Float.isNaN(fVar.D) ? f5 : fVar.D;
        float f10 = eVar2.f22040h;
        float f11 = eVar.f22040h;
        float f12 = eVar2.f22041i;
        float f13 = eVar.f22041i;
        this.f22037e = this.f22036d;
        this.f22040h = (int) (((f10 - f11) * f6) + f11);
        this.f22041i = (int) (((f12 - f13) * f7) + f13);
        int i6 = fVar.I;
        if (i6 == 1) {
            float f14 = Float.isNaN(fVar.E) ? f5 : fVar.E;
            float f15 = eVar2.f22038f;
            float f16 = eVar.f22038f;
            this.f22038f = androidx.appcompat.graphics.drawable.d.a(f15, f16, f14, f16);
            if (!Float.isNaN(fVar.F)) {
                f5 = fVar.F;
            }
            float f17 = eVar2.f22039g;
            float f18 = eVar.f22039g;
            this.f22039g = androidx.appcompat.graphics.drawable.d.a(f17, f18, f5, f18);
        } else if (i6 != 2) {
            float f19 = Float.isNaN(fVar.E) ? f5 : fVar.E;
            float f20 = eVar2.f22038f;
            float f21 = eVar.f22038f;
            this.f22038f = androidx.appcompat.graphics.drawable.d.a(f20, f21, f19, f21);
            if (!Float.isNaN(fVar.F)) {
                f5 = fVar.F;
            }
            float f22 = eVar2.f22039g;
            float f23 = eVar.f22039g;
            this.f22039g = androidx.appcompat.graphics.drawable.d.a(f22, f23, f5, f23);
        } else {
            if (Float.isNaN(fVar.E)) {
                float f24 = eVar2.f22038f;
                float f25 = eVar.f22038f;
                min = androidx.appcompat.graphics.drawable.d.a(f24, f25, f5, f25);
            } else {
                min = Math.min(f7, f6) * fVar.E;
            }
            this.f22038f = min;
            if (Float.isNaN(fVar.F)) {
                float f26 = eVar2.f22039g;
                float f27 = eVar.f22039g;
                f4 = androidx.appcompat.graphics.drawable.d.a(f26, f27, f5, f27);
            } else {
                f4 = fVar.F;
            }
            this.f22039g = f4;
        }
        this.f22045m = eVar.f22045m;
        this.f22034b = androidx.constraintlayout.core.motion.utils.e.c(fVar.f22132z);
        this.f22044l = fVar.A;
    }

    void r(int i4, int i5, androidx.constraintlayout.core.motion.key.f fVar, e eVar, e eVar2) {
        float f4 = fVar.f22117h / 100.0f;
        this.f22036d = f4;
        this.f22035c = fVar.B;
        float f5 = Float.isNaN(fVar.C) ? f4 : fVar.C;
        float f6 = Float.isNaN(fVar.D) ? f4 : fVar.D;
        float f7 = eVar2.f22040h;
        float f10 = f7 - eVar.f22040h;
        float f11 = eVar2.f22041i;
        float f12 = f11 - eVar.f22041i;
        this.f22037e = this.f22036d;
        float f13 = eVar.f22038f;
        float f14 = eVar.f22039g;
        float f15 = (f7 / 2.0f) + eVar2.f22038f;
        float f16 = (f11 / 2.0f) + eVar2.f22039g;
        float f17 = f10 * f5;
        this.f22038f = (int) ((((f15 - ((r8 / 2.0f) + f13)) * f4) + f13) - (f17 / 2.0f));
        float f18 = f12 * f6;
        this.f22039g = (int) ((((f16 - ((r11 / 2.0f) + f14)) * f4) + f14) - (f18 / 2.0f));
        this.f22040h = (int) (r8 + f17);
        this.f22041i = (int) (r11 + f18);
        this.f22049q = 2;
        if (!Float.isNaN(fVar.E)) {
            this.f22038f = (int) (fVar.E * ((int) (i4 - this.f22040h)));
        }
        if (!Float.isNaN(fVar.F)) {
            this.f22039g = (int) (fVar.F * ((int) (i5 - this.f22041i)));
        }
        this.f22045m = this.f22045m;
        this.f22034b = androidx.constraintlayout.core.motion.utils.e.c(fVar.f22132z);
        this.f22044l = fVar.A;
    }

    void s(float f4, float f5, float f6, float f7) {
        this.f22038f = f4;
        this.f22039g = f5;
        this.f22040h = f6;
        this.f22041i = f7;
    }

    void t(float f4, float f5, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            float f12 = (float) dArr[i4];
            double d5 = dArr2[i4];
            int i5 = iArr[i4];
            if (i5 == 1) {
                f6 = f12;
            } else if (i5 == 2) {
                f10 = f12;
            } else if (i5 == 3) {
                f7 = f12;
            } else if (i5 == 4) {
                f11 = f12;
            }
        }
        float f13 = f6 - ((0.0f * f7) / 2.0f);
        float f14 = f10 - ((0.0f * f11) / 2.0f);
        fArr[0] = (((f7 * 1.0f) + f13) * f4) + ((1.0f - f4) * f13) + 0.0f;
        fArr[1] = (((f11 * 1.0f) + f14) * f5) + ((1.0f - f5) * f14) + 0.0f;
    }

    void u(float f4, f fVar, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f5;
        float f6;
        float f7 = this.f22038f;
        float f10 = this.f22039g;
        float f11 = this.f22040h;
        float f12 = this.f22041i;
        if (iArr.length != 0 && this.f22051s.length <= iArr[iArr.length - 1]) {
            int i4 = iArr[iArr.length - 1] + 1;
            this.f22051s = new double[i4];
            this.f22052t = new double[i4];
        }
        Arrays.fill(this.f22051s, Double.NaN);
        for (int i5 = 0; i5 < iArr.length; i5++) {
            double[] dArr4 = this.f22051s;
            int i6 = iArr[i5];
            dArr4[i6] = dArr[i5];
            this.f22052t[i6] = dArr2[i5];
        }
        float f13 = Float.NaN;
        int i7 = 0;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        while (true) {
            double[] dArr5 = this.f22051s;
            if (i7 >= dArr5.length) {
                break;
            }
            boolean isNaN = Double.isNaN(dArr5[i7]);
            double d5 = p.f60679p;
            if (isNaN && (dArr3 == null || dArr3[i7] == p.f60679p)) {
                f6 = f13;
            } else {
                if (dArr3 != null) {
                    d5 = dArr3[i7];
                }
                if (!Double.isNaN(this.f22051s[i7])) {
                    d5 = this.f22051s[i7] + d5;
                }
                f6 = f13;
                float f18 = (float) d5;
                float f19 = (float) this.f22052t[i7];
                if (i7 == 1) {
                    f13 = f6;
                    f14 = f19;
                    f7 = f18;
                } else if (i7 == 2) {
                    f13 = f6;
                    f15 = f19;
                    f10 = f18;
                } else if (i7 == 3) {
                    f13 = f6;
                    f16 = f19;
                    f11 = f18;
                } else if (i7 == 4) {
                    f13 = f6;
                    f17 = f19;
                    f12 = f18;
                } else if (i7 == 5) {
                    f13 = f18;
                }
                i7++;
            }
            f13 = f6;
            i7++;
        }
        float f20 = f13;
        c cVar = this.f22047o;
        if (cVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            cVar.r(f4, fArr, fArr2);
            float f21 = fArr[0];
            float f22 = fArr[1];
            float f23 = fArr2[0];
            float f24 = fArr2[1];
            double d6 = f7;
            double d7 = f10;
            float a5 = (float) (b0.a(d7, d6, f21) - (f11 / 2.0f));
            f5 = f12;
            float cos = (float) ((f22 - (Math.cos(d7) * d6)) - (f12 / 2.0f));
            double d10 = f14;
            double d11 = f15;
            float cos2 = (float) ((Math.cos(d7) * d6 * d11) + b0.a(d7, d10, f23));
            float sin = (float) ((Math.sin(d7) * d6 * d11) + (f24 - (Math.cos(d7) * d10)));
            if (dArr2.length >= 2) {
                dArr2[0] = cos2;
                dArr2[1] = sin;
            }
            if (!Float.isNaN(f20)) {
                fVar.R((float) (Math.toDegrees(Math.atan2(sin, cos2)) + f20));
            }
            f7 = a5;
            f10 = cos;
        } else {
            f5 = f12;
            if (!Float.isNaN(f20)) {
                fVar.R((float) (Math.toDegrees(Math.atan2((f17 / 2.0f) + f15, (f16 / 2.0f) + f14)) + f20 + 0.0f));
            }
        }
        float f25 = f7 + 0.5f;
        float f26 = f10 + 0.5f;
        fVar.G((int) f25, (int) f26, (int) (f25 + f11), (int) (f26 + f5));
    }

    public void v(c cVar, e eVar) {
        double d5 = (((this.f22040h / 2.0f) + this.f22038f) - eVar.f22038f) - (eVar.f22040h / 2.0f);
        double d6 = (((this.f22041i / 2.0f) + this.f22039g) - eVar.f22039g) - (eVar.f22041i / 2.0f);
        this.f22047o = cVar;
        this.f22038f = (float) Math.hypot(d6, d5);
        if (Float.isNaN(this.f22046n)) {
            this.f22039g = (float) (Math.atan2(d6, d5) + 1.5707963267948966d);
        } else {
            this.f22039g = (float) Math.toRadians(this.f22046n);
        }
    }

    public e(int i4, int i5, androidx.constraintlayout.core.motion.key.f fVar, e eVar, e eVar2) {
        this.f22035c = 0;
        this.f22042j = Float.NaN;
        this.f22043k = Float.NaN;
        this.f22044l = -1;
        this.f22045m = -1;
        this.f22046n = Float.NaN;
        this.f22047o = null;
        this.f22048p = new HashMap<>();
        this.f22049q = 0;
        this.f22051s = new double[18];
        this.f22052t = new double[18];
        if (eVar.f22045m != -1) {
            q(i4, i5, fVar, eVar, eVar2);
            return;
        }
        int i6 = fVar.I;
        if (i6 == 1) {
            p(fVar, eVar, eVar2);
        } else if (i6 != 2) {
            o(fVar, eVar, eVar2);
        } else {
            r(i4, i5, fVar, eVar, eVar2);
        }
    }
}
