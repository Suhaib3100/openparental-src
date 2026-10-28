package androidx.constraintlayout.motion.utils;

import com.google.firebase.remoteconfig.p;
import java.lang.reflect.Array;

/* compiled from: MonotonicCurveFit.java */
/* loaded from: classes2.dex */
public class f extends b {

    /* renamed from: g, reason: collision with root package name */
    private static final String f1651g = "MonotonicCurveFit";

    /* renamed from: d, reason: collision with root package name */
    private double[] f1652d;

    /* renamed from: e, reason: collision with root package name */
    private double[][] f1653e;

    /* renamed from: f, reason: collision with root package name */
    private double[][] f1654f;

    public f(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        int i5 = length - 1;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i5, length2);
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, length2);
        for (int i6 = 0; i6 < length2; i6++) {
            int i7 = 0;
            while (i7 < i5) {
                int i8 = i7 + 1;
                double d6 = dArr[i8] - dArr[i7];
                double[] dArr5 = dArr3[i7];
                double d7 = (dArr2[i8][i6] - dArr2[i7][i6]) / d6;
                dArr5[i6] = d7;
                if (i7 == 0) {
                    dArr4[i7][i6] = d7;
                } else {
                    dArr4[i7][i6] = (dArr3[i7 - 1][i6] + d7) * 0.5d;
                }
                i7 = i8;
            }
            dArr4[i5][i6] = dArr3[length - 2][i6];
        }
        for (int i9 = 0; i9 < i5; i9++) {
            for (int i10 = 0; i10 < length2; i10++) {
                double d8 = dArr3[i9][i10];
                if (d8 == p.f18289o) {
                    dArr4[i9][i10] = 0.0d;
                    dArr4[i9 + 1][i10] = 0.0d;
                } else {
                    double d9 = dArr4[i9][i10] / d8;
                    int i11 = i9 + 1;
                    double d10 = dArr4[i11][i10] / d8;
                    double hypot = Math.hypot(d9, d10);
                    if (hypot > 9.0d) {
                        double d11 = 3.0d / hypot;
                        double[] dArr6 = dArr4[i9];
                        double[] dArr7 = dArr3[i9];
                        dArr6[i10] = d9 * d11 * dArr7[i10];
                        dArr4[i11][i10] = d11 * d10 * dArr7[i10];
                    }
                }
            }
        }
        this.f1652d = dArr;
        this.f1653e = dArr2;
        this.f1654f = dArr4;
    }

    private static double i(double d6, double d7, double d8, double d9, double d10, double d11) {
        double d12 = d7 * d7;
        double d13 = d7 * 6.0d;
        double d14 = 6.0d * d12 * d8;
        double d15 = 3.0d * d6;
        return (d6 * d10) + (((((d15 * d10) * d12) + (((d15 * d11) * d12) + ((d14 + ((d13 * d9) + (((-6.0d) * d12) * d9))) - (d13 * d8)))) - (((2.0d * d6) * d11) * d7)) - (((4.0d * d6) * d10) * d7));
    }

    private static double j(double d6, double d7, double d8, double d9, double d10, double d11) {
        double d12 = d7 * d7;
        double d13 = d12 * d7;
        double d14 = 3.0d * d12;
        double d15 = d13 * 2.0d * d8;
        double d16 = ((d15 + ((d14 * d9) + (((-2.0d) * d13) * d9))) - (d14 * d8)) + d8;
        double d17 = d6 * d11;
        double d18 = (d17 * d13) + d16;
        double d19 = d6 * d10;
        return (d19 * d7) + ((((d13 * d19) + d18) - (d17 * d12)) - (((2.0d * d6) * d10) * d12));
    }

    @Override // androidx.constraintlayout.motion.utils.b
    public double c(double d6, int i5) {
        double[] dArr = this.f1652d;
        int length = dArr.length;
        int i6 = 0;
        if (d6 <= dArr[0]) {
            return this.f1653e[0][i5];
        }
        int i7 = length - 1;
        if (d6 >= dArr[i7]) {
            return this.f1653e[i7][i5];
        }
        while (i6 < i7) {
            double[] dArr2 = this.f1652d;
            double d7 = dArr2[i6];
            if (d6 == d7) {
                return this.f1653e[i6][i5];
            }
            int i8 = i6 + 1;
            double d8 = dArr2[i8];
            if (d6 < d8) {
                double d9 = d8 - d7;
                double d10 = (d6 - d7) / d9;
                double[][] dArr3 = this.f1653e;
                double d11 = dArr3[i6][i5];
                double d12 = dArr3[i8][i5];
                double[][] dArr4 = this.f1654f;
                return j(d9, d10, d11, d12, dArr4[i6][i5], dArr4[i8][i5]);
            }
            i6 = i8;
        }
        return p.f18289o;
    }

    @Override // androidx.constraintlayout.motion.utils.b
    public void d(double d6, double[] dArr) {
        double[] dArr2 = this.f1652d;
        int length = dArr2.length;
        int i5 = 0;
        int length2 = this.f1653e[0].length;
        if (d6 <= dArr2[0]) {
            for (int i6 = 0; i6 < length2; i6++) {
                dArr[i6] = this.f1653e[0][i6];
            }
            return;
        }
        int i7 = length - 1;
        if (d6 >= dArr2[i7]) {
            while (i5 < length2) {
                dArr[i5] = this.f1653e[i7][i5];
                i5++;
            }
            return;
        }
        int i8 = 0;
        while (i8 < i7) {
            if (d6 == this.f1652d[i8]) {
                for (int i9 = 0; i9 < length2; i9++) {
                    dArr[i9] = this.f1653e[i8][i9];
                }
            }
            double[] dArr3 = this.f1652d;
            int i10 = i8 + 1;
            double d7 = dArr3[i10];
            if (d6 < d7) {
                double d8 = dArr3[i8];
                double d9 = d7 - d8;
                double d10 = (d6 - d8) / d9;
                while (i5 < length2) {
                    double[][] dArr4 = this.f1653e;
                    double d11 = dArr4[i8][i5];
                    double d12 = dArr4[i10][i5];
                    double[][] dArr5 = this.f1654f;
                    dArr[i5] = j(d9, d10, d11, d12, dArr5[i8][i5], dArr5[i10][i5]);
                    i5++;
                }
                return;
            }
            i8 = i10;
        }
    }

    @Override // androidx.constraintlayout.motion.utils.b
    public void e(double d6, float[] fArr) {
        double[] dArr = this.f1652d;
        int length = dArr.length;
        int i5 = 0;
        int length2 = this.f1653e[0].length;
        if (d6 <= dArr[0]) {
            for (int i6 = 0; i6 < length2; i6++) {
                fArr[i6] = (float) this.f1653e[0][i6];
            }
            return;
        }
        int i7 = length - 1;
        if (d6 >= dArr[i7]) {
            while (i5 < length2) {
                fArr[i5] = (float) this.f1653e[i7][i5];
                i5++;
            }
            return;
        }
        int i8 = 0;
        while (i8 < i7) {
            if (d6 == this.f1652d[i8]) {
                for (int i9 = 0; i9 < length2; i9++) {
                    fArr[i9] = (float) this.f1653e[i8][i9];
                }
            }
            double[] dArr2 = this.f1652d;
            int i10 = i8 + 1;
            double d7 = dArr2[i10];
            if (d6 < d7) {
                double d8 = dArr2[i8];
                double d9 = d7 - d8;
                double d10 = (d6 - d8) / d9;
                while (i5 < length2) {
                    double[][] dArr3 = this.f1653e;
                    double d11 = dArr3[i8][i5];
                    double d12 = dArr3[i10][i5];
                    double[][] dArr4 = this.f1654f;
                    fArr[i5] = (float) j(d9, d10, d11, d12, dArr4[i8][i5], dArr4[i10][i5]);
                    i5++;
                }
                return;
            }
            i8 = i10;
        }
    }

    @Override // androidx.constraintlayout.motion.utils.b
    public double f(double d6, int i5) {
        double[] dArr = this.f1652d;
        int length = dArr.length;
        int i6 = 0;
        double d7 = dArr[0];
        if (d6 >= d7) {
            d7 = dArr[length - 1];
            if (d6 < d7) {
                d7 = d6;
            }
        }
        while (i6 < length - 1) {
            double[] dArr2 = this.f1652d;
            int i7 = i6 + 1;
            double d8 = dArr2[i7];
            if (d7 <= d8) {
                double d9 = dArr2[i6];
                double d10 = d8 - d9;
                double[][] dArr3 = this.f1653e;
                double d11 = dArr3[i6][i5];
                double d12 = dArr3[i7][i5];
                double[][] dArr4 = this.f1654f;
                return i(d10, (d7 - d9) / d10, d11, d12, dArr4[i6][i5], dArr4[i7][i5]) / d10;
            }
            i6 = i7;
        }
        return p.f18289o;
    }

    @Override // androidx.constraintlayout.motion.utils.b
    public void g(double d6, double[] dArr) {
        double[] dArr2 = this.f1652d;
        int length = dArr2.length;
        int length2 = this.f1653e[0].length;
        double d7 = dArr2[0];
        if (d6 > d7) {
            d7 = dArr2[length - 1];
            if (d6 < d7) {
                d7 = d6;
            }
        }
        int i5 = 0;
        while (i5 < length - 1) {
            double[] dArr3 = this.f1652d;
            int i6 = i5 + 1;
            double d8 = dArr3[i6];
            if (d7 <= d8) {
                double d9 = dArr3[i5];
                double d10 = d8 - d9;
                double d11 = (d7 - d9) / d10;
                for (int i7 = 0; i7 < length2; i7++) {
                    double[][] dArr4 = this.f1653e;
                    double d12 = dArr4[i5][i7];
                    double d13 = dArr4[i6][i7];
                    double[][] dArr5 = this.f1654f;
                    dArr[i7] = i(d10, d11, d12, d13, dArr5[i5][i7], dArr5[i6][i7]) / d10;
                }
                return;
            }
            i5 = i6;
        }
    }

    @Override // androidx.constraintlayout.motion.utils.b
    public double[] h() {
        return this.f1652d;
    }
}
