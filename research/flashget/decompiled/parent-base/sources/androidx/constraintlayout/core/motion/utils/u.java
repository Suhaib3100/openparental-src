package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.utils.j;
import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* compiled from: TimeCycleSplineSet.java */
/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: k, reason: collision with root package name */
    private static final String f22355k = "SplineSet";

    /* renamed from: l, reason: collision with root package name */
    protected static final int f22356l = 0;

    /* renamed from: m, reason: collision with root package name */
    protected static final int f22357m = 1;

    /* renamed from: n, reason: collision with root package name */
    protected static final int f22358n = 2;

    /* renamed from: o, reason: collision with root package name */
    protected static float f22359o = 6.2831855f;

    /* renamed from: a, reason: collision with root package name */
    protected androidx.constraintlayout.core.motion.utils.c f22360a;

    /* renamed from: e, reason: collision with root package name */
    protected int f22364e;

    /* renamed from: f, reason: collision with root package name */
    protected String f22365f;

    /* renamed from: i, reason: collision with root package name */
    protected long f22368i;

    /* renamed from: b, reason: collision with root package name */
    protected int f22361b = 0;

    /* renamed from: c, reason: collision with root package name */
    protected int[] f22362c = new int[10];

    /* renamed from: d, reason: collision with root package name */
    protected float[][] f22363d = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);

    /* renamed from: g, reason: collision with root package name */
    protected float[] f22366g = new float[3];

    /* renamed from: h, reason: collision with root package name */
    protected boolean f22367h = false;

    /* renamed from: j, reason: collision with root package name */
    protected float f22369j = Float.NaN;

    /* compiled from: TimeCycleSplineSet.java */
    public static class a extends u {

        /* renamed from: p, reason: collision with root package name */
        String f22370p;

        /* renamed from: q, reason: collision with root package name */
        j.a f22371q;

        /* renamed from: r, reason: collision with root package name */
        j.c f22372r = new j.c();

        /* renamed from: s, reason: collision with root package name */
        float[] f22373s;

        /* renamed from: t, reason: collision with root package name */
        float[] f22374t;

        public a(String str, j.a aVar) {
            this.f22370p = str.split(",")[1];
            this.f22371q = aVar;
        }

        @Override // androidx.constraintlayout.core.motion.utils.u
        public void c(int i4, float f4, float f5, int i5, float f6) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.u
        public void f(int i4) {
            int f4 = this.f22371q.f();
            int h4 = this.f22371q.g(0).h();
            double[] dArr = new double[f4];
            int i5 = h4 + 2;
            this.f22373s = new float[i5];
            this.f22374t = new float[h4];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, f4, i5);
            for (int i6 = 0; i6 < f4; i6++) {
                int d5 = this.f22371q.d(i6);
                androidx.constraintlayout.core.motion.a g4 = this.f22371q.g(i6);
                float[] g5 = this.f22372r.g(i6);
                dArr[i6] = d5 * 0.01d;
                g4.e(this.f22373s);
                int i7 = 0;
                while (true) {
                    if (i7 < this.f22373s.length) {
                        dArr2[i6][i7] = r8[i7];
                        i7++;
                    }
                }
                double[] dArr3 = dArr2[i6];
                dArr3[h4] = g5[0];
                dArr3[h4 + 1] = g5[1];
            }
            this.f22360a = androidx.constraintlayout.core.motion.utils.c.a(i4, dArr, dArr2);
        }

        public void g(int i4, androidx.constraintlayout.core.motion.a aVar, float f4, int i5, float f5) {
            this.f22371q.a(i4, aVar);
            this.f22372r.a(i4, new float[]{f4, f5});
            this.f22361b = Math.max(this.f22361b, i5);
        }

        public boolean h(androidx.constraintlayout.core.motion.f fVar, float f4, long j4, h hVar) {
            this.f22360a.e(f4, this.f22373s);
            float[] fArr = this.f22373s;
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            long j5 = j4 - this.f22368i;
            if (Float.isNaN(this.f22369j)) {
                float a5 = hVar.a(fVar, this.f22370p, 0);
                this.f22369j = a5;
                if (Float.isNaN(a5)) {
                    this.f22369j = 0.0f;
                }
            }
            float f7 = (float) ((((j5 * 1.0E-9d) * f5) + this.f22369j) % 1.0d);
            this.f22369j = f7;
            this.f22368i = j4;
            float a6 = a(f7);
            this.f22367h = false;
            int i4 = 0;
            while (true) {
                float[] fArr2 = this.f22374t;
                if (i4 >= fArr2.length) {
                    break;
                }
                boolean z4 = this.f22367h;
                float f10 = this.f22373s[i4];
                this.f22367h = z4 | (((double) f10) != com.google.firebase.remoteconfig.p.f60679p);
                fArr2[i4] = (f10 * a6) + f6;
                i4++;
            }
            fVar.M(this.f22371q.g(0), this.f22374t);
            if (f5 != 0.0f) {
                this.f22367h = true;
            }
            return this.f22367h;
        }
    }

    /* compiled from: TimeCycleSplineSet.java */
    public static class b extends u {

        /* renamed from: p, reason: collision with root package name */
        String f22375p;

        /* renamed from: q, reason: collision with root package name */
        j.b f22376q;

        /* renamed from: r, reason: collision with root package name */
        j.c f22377r = new j.c();

        /* renamed from: s, reason: collision with root package name */
        float[] f22378s;

        /* renamed from: t, reason: collision with root package name */
        float[] f22379t;

        public b(String str, j.b bVar) {
            this.f22375p = str.split(",")[1];
            this.f22376q = bVar;
        }

        @Override // androidx.constraintlayout.core.motion.utils.u
        public void c(int i4, float f4, float f5, int i5, float f6) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.u
        public void f(int i4) {
            int f4 = this.f22376q.f();
            int r4 = this.f22376q.g(0).r();
            double[] dArr = new double[f4];
            int i5 = r4 + 2;
            this.f22378s = new float[i5];
            this.f22379t = new float[r4];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, f4, i5);
            for (int i6 = 0; i6 < f4; i6++) {
                int d5 = this.f22376q.d(i6);
                androidx.constraintlayout.core.motion.b g4 = this.f22376q.g(i6);
                float[] g5 = this.f22377r.g(i6);
                dArr[i6] = d5 * 0.01d;
                g4.o(this.f22378s);
                int i7 = 0;
                while (true) {
                    if (i7 < this.f22378s.length) {
                        dArr2[i6][i7] = r8[i7];
                        i7++;
                    }
                }
                double[] dArr3 = dArr2[i6];
                dArr3[r4] = g5[0];
                dArr3[r4 + 1] = g5[1];
            }
            this.f22360a = androidx.constraintlayout.core.motion.utils.c.a(i4, dArr, dArr2);
        }

        public void g(int i4, androidx.constraintlayout.core.motion.b bVar, float f4, int i5, float f5) {
            this.f22376q.a(i4, bVar);
            this.f22377r.a(i4, new float[]{f4, f5});
            this.f22361b = Math.max(this.f22361b, i5);
        }

        public boolean h(androidx.constraintlayout.core.motion.f fVar, float f4, long j4, h hVar) {
            this.f22360a.e(f4, this.f22378s);
            float[] fArr = this.f22378s;
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            long j5 = j4 - this.f22368i;
            if (Float.isNaN(this.f22369j)) {
                float a5 = hVar.a(fVar, this.f22375p, 0);
                this.f22369j = a5;
                if (Float.isNaN(a5)) {
                    this.f22369j = 0.0f;
                }
            }
            float f7 = (float) ((((j5 * 1.0E-9d) * f5) + this.f22369j) % 1.0d);
            this.f22369j = f7;
            this.f22368i = j4;
            float a6 = a(f7);
            this.f22367h = false;
            int i4 = 0;
            while (true) {
                float[] fArr2 = this.f22379t;
                if (i4 >= fArr2.length) {
                    break;
                }
                boolean z4 = this.f22367h;
                float f10 = this.f22378s[i4];
                this.f22367h = z4 | (((double) f10) != com.google.firebase.remoteconfig.p.f60679p);
                fArr2[i4] = (f10 * a6) + f6;
                i4++;
            }
            this.f22376q.g(0).w(fVar, this.f22379t);
            if (f5 != 0.0f) {
                this.f22367h = true;
            }
            return this.f22367h;
        }
    }

    /* compiled from: TimeCycleSplineSet.java */
    protected static class c {
        protected c() {
        }

        static void a(int[] iArr, float[][] fArr, int i4, int i5) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i5;
            iArr2[1] = i4;
            int i6 = 2;
            while (i6 > 0) {
                int i7 = iArr2[i6 - 1];
                int i10 = i6 - 2;
                int i11 = iArr2[i10];
                if (i7 < i11) {
                    int b5 = b(iArr, fArr, i7, i11);
                    iArr2[i10] = b5 - 1;
                    iArr2[i6 - 1] = i7;
                    int i12 = i6 + 1;
                    iArr2[i6] = i11;
                    i6 += 2;
                    iArr2[i12] = b5 + 1;
                } else {
                    i6 = i10;
                }
            }
        }

        private static int b(int[] iArr, float[][] fArr, int i4, int i5) {
            int i6 = iArr[i5];
            int i7 = i4;
            while (i4 < i5) {
                if (iArr[i4] <= i6) {
                    c(iArr, fArr, i7, i4);
                    i7++;
                }
                i4++;
            }
            c(iArr, fArr, i7, i5);
            return i7;
        }

        private static void c(int[] iArr, float[][] fArr, int i4, int i5) {
            int i6 = iArr[i4];
            iArr[i4] = iArr[i5];
            iArr[i5] = i6;
            float[] fArr2 = fArr[i4];
            fArr[i4] = fArr[i5];
            fArr[i5] = fArr2;
        }
    }

    protected float a(float f4) {
        float abs;
        switch (this.f22361b) {
            case 1:
                return Math.signum(f4 * f22359o);
            case 2:
                abs = Math.abs(f4);
                break;
            case 3:
                return (((f4 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f4 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f4 * f22359o);
            case 6:
                float abs2 = 1.0f - Math.abs(((f4 * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin(f4 * f22359o);
        }
        return 1.0f - abs;
    }

    public androidx.constraintlayout.core.motion.utils.c b() {
        return this.f22360a;
    }

    public void c(int i4, float f4, float f5, int i5, float f6) {
        int[] iArr = this.f22362c;
        int i6 = this.f22364e;
        iArr[i6] = i4;
        float[] fArr = this.f22363d[i6];
        fArr[0] = f4;
        fArr[1] = f5;
        fArr[2] = f6;
        this.f22361b = Math.max(this.f22361b, i5);
        this.f22364e++;
    }

    protected void d(long j4) {
        this.f22368i = j4;
    }

    public void e(String str) {
        this.f22365f = str;
    }

    public void f(int i4) {
        int i5;
        int i6 = this.f22364e;
        if (i6 == 0) {
            System.err.println("Error no points added to " + this.f22365f);
            return;
        }
        c.a(this.f22362c, this.f22363d, 0, i6 - 1);
        int i7 = 1;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f22362c;
            if (i7 >= iArr.length) {
                break;
            }
            if (iArr[i7] != iArr[i7 - 1]) {
                i10++;
            }
            i7++;
        }
        if (i10 == 0) {
            i10 = 1;
        }
        double[] dArr = new double[i10];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i10, 3);
        int i11 = 0;
        for (0; i5 < this.f22364e; i5 + 1) {
            if (i5 > 0) {
                int[] iArr2 = this.f22362c;
                i5 = iArr2[i5] == iArr2[i5 - 1] ? i5 + 1 : 0;
            }
            dArr[i11] = this.f22362c[i5] * 0.01d;
            double[] dArr3 = dArr2[i11];
            float[] fArr = this.f22363d[i5];
            dArr3[0] = fArr[0];
            dArr3[1] = fArr[1];
            dArr3[2] = fArr[2];
            i11++;
        }
        this.f22360a = androidx.constraintlayout.core.motion.utils.c.a(i4, dArr, dArr2);
    }

    public String toString() {
        String str = this.f22365f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i4 = 0; i4 < this.f22364e; i4++) {
            StringBuilder a5 = androidx.constraintlayout.core.e.a(str, "[");
            a5.append(this.f22362c[i4]);
            a5.append(" , ");
            a5.append(decimalFormat.format(this.f22363d[i4]));
            a5.append("] ");
            str = a5.toString();
        }
        return str;
    }
}
