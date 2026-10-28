package androidx.constraintlayout.motion.utils;

import com.google.firebase.remoteconfig.p;
import java.util.Arrays;

/* compiled from: Oscillator.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: g, reason: collision with root package name */
    public static String f1655g = "Oscillator";

    /* renamed from: h, reason: collision with root package name */
    public static final int f1656h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f1657i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static final int f1658j = 2;

    /* renamed from: k, reason: collision with root package name */
    public static final int f1659k = 3;

    /* renamed from: l, reason: collision with root package name */
    public static final int f1660l = 4;

    /* renamed from: m, reason: collision with root package name */
    public static final int f1661m = 5;

    /* renamed from: n, reason: collision with root package name */
    public static final int f1662n = 6;

    /* renamed from: c, reason: collision with root package name */
    double[] f1665c;

    /* renamed from: d, reason: collision with root package name */
    int f1666d;

    /* renamed from: a, reason: collision with root package name */
    float[] f1663a = new float[0];

    /* renamed from: b, reason: collision with root package name */
    double[] f1664b = new double[0];

    /* renamed from: e, reason: collision with root package name */
    double f1667e = 6.283185307179586d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1668f = false;

    public void a(double d6, float f6) {
        int length = this.f1663a.length + 1;
        int binarySearch = Arrays.binarySearch(this.f1664b, d6);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.f1664b = Arrays.copyOf(this.f1664b, length);
        this.f1663a = Arrays.copyOf(this.f1663a, length);
        this.f1665c = new double[length];
        double[] dArr = this.f1664b;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.f1664b[binarySearch] = d6;
        this.f1663a[binarySearch] = f6;
        this.f1668f = false;
    }

    double b(double d6) {
        if (d6 <= p.f18289o) {
            d6 = 1.0E-5d;
        } else if (d6 >= 1.0d) {
            d6 = 0.999999d;
        }
        int binarySearch = Arrays.binarySearch(this.f1664b, d6);
        if (binarySearch > 0 || binarySearch == 0) {
            return p.f18289o;
        }
        int i5 = (-binarySearch) - 1;
        float[] fArr = this.f1663a;
        float f6 = fArr[i5];
        int i6 = i5 - 1;
        float f7 = fArr[i6];
        double d7 = f6 - f7;
        double[] dArr = this.f1664b;
        double d8 = dArr[i5];
        double d9 = dArr[i6];
        double d10 = d7 / (d8 - d9);
        return (f7 - (d10 * d9)) + (d6 * d10);
    }

    double c(double d6) {
        if (d6 < p.f18289o) {
            d6 = 0.0d;
        } else if (d6 > 1.0d) {
            d6 = 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.f1664b, d6);
        if (binarySearch > 0) {
            return 1.0d;
        }
        if (binarySearch == 0) {
            return p.f18289o;
        }
        int i5 = (-binarySearch) - 1;
        float[] fArr = this.f1663a;
        float f6 = fArr[i5];
        int i6 = i5 - 1;
        float f7 = fArr[i6];
        double d7 = f6 - f7;
        double[] dArr = this.f1664b;
        double d8 = dArr[i5];
        double d9 = dArr[i6];
        double d10 = d7 / (d8 - d9);
        return ((((d6 * d6) - (d9 * d9)) * d10) / 2.0d) + ((d6 - d9) * (f7 - (d10 * d9))) + this.f1665c[i6];
    }

    public double d(double d6) {
        switch (this.f1666d) {
            case 1:
                return p.f18289o;
            case 2:
                return Math.signum((((c(d6) * 4.0d) + 3.0d) % 4.0d) - 2.0d) * b(d6) * 4.0d;
            case 3:
                return b(d6) * 2.0d;
            case 4:
                return (-b(d6)) * 2.0d;
            case 5:
                return Math.sin(this.f1667e * c(d6)) * (-this.f1667e) * b(d6);
            case 6:
                return ((((c(d6) * 4.0d) + 2.0d) % 4.0d) - 2.0d) * b(d6) * 4.0d;
            default:
                return Math.cos(this.f1667e * c(d6)) * this.f1667e * b(d6);
        }
    }

    public double e(double d6) {
        double abs;
        switch (this.f1666d) {
            case 1:
                return Math.signum(0.5d - (c(d6) % 1.0d));
            case 2:
                abs = Math.abs((((c(d6) * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((c(d6) * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                abs = ((c(d6) * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.f1667e * c(d6));
            case 6:
                double abs2 = 1.0d - Math.abs(((c(d6) * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                break;
            default:
                return Math.sin(this.f1667e * c(d6));
        }
        return 1.0d - abs;
    }

    public void f() {
        double d6 = 0.0d;
        int i5 = 0;
        while (true) {
            if (i5 >= this.f1663a.length) {
                break;
            }
            d6 += r7[i5];
            i5++;
        }
        double d7 = 0.0d;
        int i6 = 1;
        while (true) {
            float[] fArr = this.f1663a;
            if (i6 >= fArr.length) {
                break;
            }
            int i7 = i6 - 1;
            float f6 = (fArr[i7] + fArr[i6]) / 2.0f;
            double[] dArr = this.f1664b;
            d7 += (dArr[i6] - dArr[i7]) * f6;
            i6++;
        }
        int i8 = 0;
        while (true) {
            float[] fArr2 = this.f1663a;
            if (i8 >= fArr2.length) {
                break;
            }
            fArr2[i8] = (float) (fArr2[i8] * (d6 / d7));
            i8++;
        }
        this.f1665c[0] = 0.0d;
        int i9 = 1;
        while (true) {
            float[] fArr3 = this.f1663a;
            if (i9 >= fArr3.length) {
                this.f1668f = true;
                return;
            }
            int i10 = i9 - 1;
            float f7 = (fArr3[i10] + fArr3[i9]) / 2.0f;
            double[] dArr2 = this.f1664b;
            double d8 = dArr2[i9] - dArr2[i10];
            double[] dArr3 = this.f1665c;
            dArr3[i9] = (d8 * f7) + dArr3[i10];
            i9++;
        }
    }

    public void g(int i5) {
        this.f1666d = i5;
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.f1664b) + " period=" + Arrays.toString(this.f1663a);
    }
}
