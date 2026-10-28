package androidx.constraintlayout.motion.utils;

import com.google.firebase.remoteconfig.p;
import java.lang.reflect.Array;

/* compiled from: HyperSpline.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    int f1635a;

    /* renamed from: b, reason: collision with root package name */
    a[][] f1636b;

    /* renamed from: c, reason: collision with root package name */
    int f1637c;

    /* renamed from: d, reason: collision with root package name */
    double[] f1638d;

    /* renamed from: e, reason: collision with root package name */
    double f1639e;

    /* renamed from: f, reason: collision with root package name */
    double[][] f1640f;

    /* compiled from: HyperSpline.java */
    public static class a {

        /* renamed from: e, reason: collision with root package name */
        public static final double f1641e = 0.3333333333333333d;

        /* renamed from: f, reason: collision with root package name */
        public static final double f1642f = 0.5d;

        /* renamed from: a, reason: collision with root package name */
        double f1643a;

        /* renamed from: b, reason: collision with root package name */
        double f1644b;

        /* renamed from: c, reason: collision with root package name */
        double f1645c;

        /* renamed from: d, reason: collision with root package name */
        double f1646d;

        public a(double d6, double d7, double d8, double d9) {
            this.f1643a = d6;
            this.f1644b = d7;
            this.f1645c = d8;
            this.f1646d = d9;
        }

        public double a(double d6) {
            return (((((this.f1646d * d6) + this.f1645c) * d6) + this.f1644b) * d6) + this.f1643a;
        }

        public double b(double d6) {
            return (((this.f1645c * 0.5d) + (this.f1646d * 0.3333333333333333d * d6)) * d6) + this.f1644b;
        }
    }

    public d(double[][] dArr) {
        g(dArr);
    }

    static a[] b(int i5, double[] dArr) {
        double[] dArr2 = new double[i5];
        double[] dArr3 = new double[i5];
        double[] dArr4 = new double[i5];
        int i6 = i5 - 1;
        int i7 = 0;
        dArr2[0] = 0.5d;
        int i8 = 1;
        for (int i9 = 1; i9 < i6; i9++) {
            dArr2[i9] = 1.0d / (4.0d - dArr2[i9 - 1]);
        }
        int i10 = i6 - 1;
        dArr2[i6] = 1.0d / (2.0d - dArr2[i10]);
        dArr3[0] = (dArr[1] - dArr[0]) * 3.0d * dArr2[0];
        while (i8 < i6) {
            int i11 = i8 + 1;
            int i12 = i8 - 1;
            dArr3[i8] = (((dArr[i11] - dArr[i12]) * 3.0d) - dArr3[i12]) * dArr2[i8];
            i8 = i11;
        }
        double d6 = (((dArr[i6] - dArr[i10]) * 3.0d) - dArr3[i10]) * dArr2[i6];
        dArr3[i6] = d6;
        dArr4[i6] = d6;
        while (i10 >= 0) {
            dArr4[i10] = dArr3[i10] - (dArr2[i10] * dArr4[i10 + 1]);
            i10--;
        }
        a[] aVarArr = new a[i6];
        while (i7 < i6) {
            double d7 = dArr[i7];
            double d8 = dArr4[i7];
            int i13 = i7 + 1;
            double d9 = dArr[i13];
            double d10 = dArr4[i13];
            aVarArr[i7] = new a((float) d7, d8, (((d9 - d7) * 3.0d) - (d8 * 2.0d)) - d10, ((d7 - d9) * 2.0d) + d8 + d10);
            i7 = i13;
        }
        return aVarArr;
    }

    public double a(a[] aVarArr) {
        int i5;
        int length = aVarArr.length;
        double[] dArr = new double[aVarArr.length];
        double d6 = p.f18289o;
        double d7 = 0.0d;
        double d8 = 0.0d;
        while (true) {
            i5 = 0;
            if (d7 >= 1.0d) {
                break;
            }
            double d9 = 0.0d;
            while (i5 < aVarArr.length) {
                double d10 = dArr[i5];
                double a6 = aVarArr[i5].a(d7);
                dArr[i5] = a6;
                double d11 = d10 - a6;
                d9 += d11 * d11;
                i5++;
            }
            if (d7 > p.f18289o) {
                d8 += Math.sqrt(d9);
            }
            d7 += 0.1d;
        }
        while (i5 < aVarArr.length) {
            double d12 = dArr[i5];
            double a7 = aVarArr[i5].a(1.0d);
            dArr[i5] = a7;
            double d13 = d12 - a7;
            d6 += d13 * d13;
            i5++;
        }
        return Math.sqrt(d6) + d8;
    }

    public double c(double d6, int i5) {
        double[] dArr;
        double d7 = d6 * this.f1639e;
        int i6 = 0;
        while (true) {
            dArr = this.f1638d;
            if (i6 >= dArr.length - 1) {
                break;
            }
            double d8 = dArr[i6];
            if (d8 >= d7) {
                break;
            }
            d7 -= d8;
            i6++;
        }
        return this.f1636b[i5][i6].a(d7 / dArr[i6]);
    }

    public void d(double d6, double[] dArr) {
        double d7 = d6 * this.f1639e;
        int i5 = 0;
        while (true) {
            double[] dArr2 = this.f1638d;
            if (i5 >= dArr2.length - 1) {
                break;
            }
            double d8 = dArr2[i5];
            if (d8 >= d7) {
                break;
            }
            d7 -= d8;
            i5++;
        }
        for (int i6 = 0; i6 < dArr.length; i6++) {
            dArr[i6] = this.f1636b[i6][i5].a(d7 / this.f1638d[i5]);
        }
    }

    public void e(double d6, float[] fArr) {
        double d7 = d6 * this.f1639e;
        int i5 = 0;
        while (true) {
            double[] dArr = this.f1638d;
            if (i5 >= dArr.length - 1) {
                break;
            }
            double d8 = dArr[i5];
            if (d8 >= d7) {
                break;
            }
            d7 -= d8;
            i5++;
        }
        for (int i6 = 0; i6 < fArr.length; i6++) {
            fArr[i6] = (float) this.f1636b[i6][i5].a(d7 / this.f1638d[i5]);
        }
    }

    public void f(double d6, double[] dArr) {
        double d7 = d6 * this.f1639e;
        int i5 = 0;
        while (true) {
            double[] dArr2 = this.f1638d;
            if (i5 >= dArr2.length - 1) {
                break;
            }
            double d8 = dArr2[i5];
            if (d8 >= d7) {
                break;
            }
            d7 -= d8;
            i5++;
        }
        for (int i6 = 0; i6 < dArr.length; i6++) {
            dArr[i6] = this.f1636b[i6][i5].b(d7 / this.f1638d[i5]);
        }
    }

    public void g(double[][] dArr) {
        int i5;
        int length = dArr[0].length;
        this.f1637c = length;
        int length2 = dArr.length;
        this.f1635a = length2;
        this.f1640f = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, length2);
        this.f1636b = new a[this.f1637c][];
        for (int i6 = 0; i6 < this.f1637c; i6++) {
            for (int i7 = 0; i7 < this.f1635a; i7++) {
                this.f1640f[i6][i7] = dArr[i7][i6];
            }
        }
        int i8 = 0;
        while (true) {
            i5 = this.f1637c;
            if (i8 >= i5) {
                break;
            }
            a[][] aVarArr = this.f1636b;
            double[] dArr2 = this.f1640f[i8];
            aVarArr[i8] = b(dArr2.length, dArr2);
            i8++;
        }
        this.f1638d = new double[this.f1635a - 1];
        this.f1639e = p.f18289o;
        a[] aVarArr2 = new a[i5];
        for (int i9 = 0; i9 < this.f1638d.length; i9++) {
            for (int i10 = 0; i10 < this.f1637c; i10++) {
                aVarArr2[i10] = this.f1636b[i10][i9];
            }
            double d6 = this.f1639e;
            double[] dArr3 = this.f1638d;
            double a6 = a(aVarArr2);
            dArr3[i9] = a6;
            this.f1639e = d6 + a6;
        }
    }

    public d() {
    }
}
