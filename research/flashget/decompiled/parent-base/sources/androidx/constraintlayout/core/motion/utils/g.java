package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;

/* compiled from: HyperSpline.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    int f22215a;

    /* renamed from: b, reason: collision with root package name */
    a[][] f22216b;

    /* renamed from: c, reason: collision with root package name */
    int f22217c;

    /* renamed from: d, reason: collision with root package name */
    double[] f22218d;

    /* renamed from: e, reason: collision with root package name */
    double f22219e;

    /* renamed from: f, reason: collision with root package name */
    double[][] f22220f;

    /* compiled from: HyperSpline.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        double f22221a;

        /* renamed from: b, reason: collision with root package name */
        double f22222b;

        /* renamed from: c, reason: collision with root package name */
        double f22223c;

        /* renamed from: d, reason: collision with root package name */
        double f22224d;

        public a(double d5, double d6, double d7, double d10) {
            this.f22221a = d5;
            this.f22222b = d6;
            this.f22223c = d7;
            this.f22224d = d10;
        }

        public double a(double d5) {
            return (((((this.f22224d * d5) + this.f22223c) * d5) + this.f22222b) * d5) + this.f22221a;
        }

        public double b(double d5) {
            return (((this.f22223c * 2.0d) + (this.f22224d * 3.0d * d5)) * d5) + this.f22222b;
        }
    }

    public g(double[][] dArr) {
        g(dArr);
    }

    static a[] b(int i4, double[] dArr) {
        double[] dArr2 = new double[i4];
        double[] dArr3 = new double[i4];
        double[] dArr4 = new double[i4];
        int i5 = i4 - 1;
        int i6 = 0;
        dArr2[0] = 0.5d;
        int i7 = 1;
        for (int i10 = 1; i10 < i5; i10++) {
            dArr2[i10] = 1.0d / (4.0d - dArr2[i10 - 1]);
        }
        int i11 = i4 - 2;
        dArr2[i5] = 1.0d / (2.0d - dArr2[i11]);
        dArr3[0] = (dArr[1] - dArr[0]) * 3.0d * dArr2[0];
        while (i7 < i5) {
            int i12 = i7 + 1;
            int i13 = i7 - 1;
            dArr3[i7] = (((dArr[i12] - dArr[i13]) * 3.0d) - dArr3[i13]) * dArr2[i7];
            i7 = i12;
        }
        double d5 = (((dArr[i5] - dArr[i11]) * 3.0d) - dArr3[i11]) * dArr2[i5];
        dArr3[i5] = d5;
        dArr4[i5] = d5;
        while (i11 >= 0) {
            dArr4[i11] = dArr3[i11] - (dArr2[i11] * dArr4[i11 + 1]);
            i11--;
        }
        a[] aVarArr = new a[i5];
        while (i6 < i5) {
            double d6 = dArr[i6];
            double d7 = dArr4[i6];
            int i14 = i6 + 1;
            double d10 = dArr[i14];
            double d11 = dArr4[i14];
            aVarArr[i6] = new a((float) d6, d7, (((d10 - d6) * 3.0d) - (d7 * 2.0d)) - d11, ((d6 - d10) * 2.0d) + d7 + d11);
            i6 = i14;
        }
        return aVarArr;
    }

    public double a(a[] aVarArr) {
        int i4;
        int length = aVarArr.length;
        double[] dArr = new double[aVarArr.length];
        double d5 = com.google.firebase.remoteconfig.p.f60679p;
        double d6 = 0.0d;
        double d7 = 0.0d;
        while (true) {
            i4 = 0;
            if (d6 >= 1.0d) {
                break;
            }
            double d10 = 0.0d;
            while (i4 < aVarArr.length) {
                double d11 = dArr[i4];
                double a5 = aVarArr[i4].a(d6);
                dArr[i4] = a5;
                double d12 = d11 - a5;
                d10 += d12 * d12;
                i4++;
            }
            if (d6 > com.google.firebase.remoteconfig.p.f60679p) {
                d7 += Math.sqrt(d10);
            }
            d6 += 0.1d;
        }
        while (i4 < aVarArr.length) {
            double d13 = dArr[i4];
            double a6 = aVarArr[i4].a(1.0d);
            dArr[i4] = a6;
            double d14 = d13 - a6;
            d5 += d14 * d14;
            i4++;
        }
        return Math.sqrt(d5) + d7;
    }

    public double c(double d5, int i4) {
        double[] dArr;
        double d6 = d5 * this.f22219e;
        int i5 = 0;
        while (true) {
            dArr = this.f22218d;
            if (i5 >= dArr.length - 1) {
                break;
            }
            double d7 = dArr[i5];
            if (d7 >= d6) {
                break;
            }
            d6 -= d7;
            i5++;
        }
        return this.f22216b[i4][i5].a(d6 / dArr[i5]);
    }

    public void d(double d5, double[] dArr) {
        double d6 = d5 * this.f22219e;
        int i4 = 0;
        while (true) {
            double[] dArr2 = this.f22218d;
            if (i4 >= dArr2.length - 1) {
                break;
            }
            double d7 = dArr2[i4];
            if (d7 >= d6) {
                break;
            }
            d6 -= d7;
            i4++;
        }
        for (int i5 = 0; i5 < dArr.length; i5++) {
            dArr[i5] = this.f22216b[i5][i4].a(d6 / this.f22218d[i4]);
        }
    }

    public void e(double d5, float[] fArr) {
        double d6 = d5 * this.f22219e;
        int i4 = 0;
        while (true) {
            double[] dArr = this.f22218d;
            if (i4 >= dArr.length - 1) {
                break;
            }
            double d7 = dArr[i4];
            if (d7 >= d6) {
                break;
            }
            d6 -= d7;
            i4++;
        }
        for (int i5 = 0; i5 < fArr.length; i5++) {
            fArr[i5] = (float) this.f22216b[i5][i4].a(d6 / this.f22218d[i4]);
        }
    }

    public void f(double d5, double[] dArr) {
        double d6 = d5 * this.f22219e;
        int i4 = 0;
        while (true) {
            double[] dArr2 = this.f22218d;
            if (i4 >= dArr2.length - 1) {
                break;
            }
            double d7 = dArr2[i4];
            if (d7 >= d6) {
                break;
            }
            d6 -= d7;
            i4++;
        }
        for (int i5 = 0; i5 < dArr.length; i5++) {
            dArr[i5] = this.f22216b[i5][i4].b(d6 / this.f22218d[i4]);
        }
    }

    public void g(double[][] dArr) {
        int i4;
        int length = dArr[0].length;
        this.f22217c = length;
        int length2 = dArr.length;
        this.f22215a = length2;
        this.f22220f = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, length2);
        this.f22216b = new a[this.f22217c][];
        for (int i5 = 0; i5 < this.f22217c; i5++) {
            for (int i6 = 0; i6 < this.f22215a; i6++) {
                this.f22220f[i5][i6] = dArr[i6][i5];
            }
        }
        int i7 = 0;
        while (true) {
            i4 = this.f22217c;
            if (i7 >= i4) {
                break;
            }
            a[][] aVarArr = this.f22216b;
            double[] dArr2 = this.f22220f[i7];
            aVarArr[i7] = b(dArr2.length, dArr2);
            i7++;
        }
        this.f22218d = new double[this.f22215a - 1];
        this.f22219e = com.google.firebase.remoteconfig.p.f60679p;
        a[] aVarArr2 = new a[i4];
        for (int i10 = 0; i10 < this.f22218d.length; i10++) {
            for (int i11 = 0; i11 < this.f22217c; i11++) {
                aVarArr2[i11] = this.f22216b[i11][i10];
            }
            double d5 = this.f22219e;
            double[] dArr3 = this.f22218d;
            double a5 = a(aVarArr2);
            dArr3[i10] = a5;
            this.f22219e = d5 + a5;
        }
    }

    public g() {
    }
}
