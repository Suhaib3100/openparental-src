package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* compiled from: Oscillator.java */
/* loaded from: classes.dex */
public class m {

    /* renamed from: i, reason: collision with root package name */
    public static String f22286i = "Oscillator";

    /* renamed from: j, reason: collision with root package name */
    public static final int f22287j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final int f22288k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static final int f22289l = 2;

    /* renamed from: m, reason: collision with root package name */
    public static final int f22290m = 3;

    /* renamed from: n, reason: collision with root package name */
    public static final int f22291n = 4;

    /* renamed from: o, reason: collision with root package name */
    public static final int f22292o = 5;

    /* renamed from: p, reason: collision with root package name */
    public static final int f22293p = 6;

    /* renamed from: q, reason: collision with root package name */
    public static final int f22294q = 7;

    /* renamed from: c, reason: collision with root package name */
    double[] f22297c;

    /* renamed from: d, reason: collision with root package name */
    String f22298d;

    /* renamed from: e, reason: collision with root package name */
    l f22299e;

    /* renamed from: f, reason: collision with root package name */
    int f22300f;

    /* renamed from: a, reason: collision with root package name */
    float[] f22295a = new float[0];

    /* renamed from: b, reason: collision with root package name */
    double[] f22296b = new double[0];

    /* renamed from: g, reason: collision with root package name */
    double f22301g = 6.283185307179586d;

    /* renamed from: h, reason: collision with root package name */
    private boolean f22302h = false;

    public void a(double d5, float f4) {
        int length = this.f22295a.length + 1;
        int binarySearch = Arrays.binarySearch(this.f22296b, d5);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.f22296b = Arrays.copyOf(this.f22296b, length);
        this.f22295a = Arrays.copyOf(this.f22295a, length);
        this.f22297c = new double[length];
        double[] dArr = this.f22296b;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.f22296b[binarySearch] = d5;
        this.f22295a[binarySearch] = f4;
        this.f22302h = false;
    }

    double b(double d5) {
        if (d5 <= com.google.firebase.remoteconfig.p.f60679p) {
            d5 = 1.0E-5d;
        } else if (d5 >= 1.0d) {
            d5 = 0.999999d;
        }
        int binarySearch = Arrays.binarySearch(this.f22296b, d5);
        if (binarySearch > 0 || binarySearch == 0) {
            return com.google.firebase.remoteconfig.p.f60679p;
        }
        int i4 = -binarySearch;
        int i5 = i4 - 1;
        float[] fArr = this.f22295a;
        float f4 = fArr[i5];
        int i6 = i4 - 2;
        float f5 = fArr[i6];
        double[] dArr = this.f22296b;
        double d6 = dArr[i5];
        double d7 = dArr[i6];
        double d10 = (f4 - f5) / (d6 - d7);
        return (f5 - (d10 * d7)) + (d5 * d10);
    }

    double c(double d5) {
        double d6 = d5 < com.google.firebase.remoteconfig.p.f60679p ? 0.0d : d5 > 1.0d ? 1.0d : d5;
        int binarySearch = Arrays.binarySearch(this.f22296b, d6);
        if (binarySearch > 0) {
            return 1.0d;
        }
        if (binarySearch == 0) {
            return com.google.firebase.remoteconfig.p.f60679p;
        }
        int i4 = -binarySearch;
        int i5 = i4 - 1;
        float[] fArr = this.f22295a;
        float f4 = fArr[i5];
        int i6 = i4 - 2;
        float f5 = fArr[i6];
        double[] dArr = this.f22296b;
        double d7 = dArr[i5];
        double d10 = dArr[i6];
        double d11 = (f4 - f5) / (d7 - d10);
        return a.a(d6, d10, f5 - (d11 * d10), this.f22297c[i6]) + ((((d6 * d6) - (d10 * d10)) * d11) / 2.0d);
    }

    public double d(double d5, double d6, double d7) {
        double d10;
        double signum;
        double c5 = d6 + c(d5);
        double b5 = b(d5) + d7;
        switch (this.f22300f) {
            case 1:
                return com.google.firebase.remoteconfig.p.f60679p;
            case 2:
                d10 = b5 * 4.0d;
                signum = Math.signum((((c5 * 4.0d) + 3.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return b5 * 2.0d;
            case 4:
                return (-b5) * 2.0d;
            case 5:
                double d11 = this.f22301g;
                return Math.sin(d11 * c5) * (-d11) * b5;
            case 6:
                d10 = b5 * 4.0d;
                signum = (((c5 * 4.0d) + 2.0d) % 4.0d) - 2.0d;
                break;
            case 7:
                return this.f22299e.f(c5 % 1.0d, 0);
            default:
                double d12 = this.f22301g;
                d10 = b5 * d12;
                signum = Math.cos(d12 * c5);
                break;
        }
        return signum * d10;
    }

    public double e(double d5, double d6) {
        double abs;
        double c5 = c(d5) + d6;
        switch (this.f22300f) {
            case 1:
                return Math.signum(0.5d - (c5 % 1.0d));
            case 2:
                abs = Math.abs((((c5 * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((c5 * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                abs = ((c5 * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos((d6 + c5) * this.f22301g);
            case 6:
                double abs2 = 1.0d - Math.abs(((c5 * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                break;
            case 7:
                return this.f22299e.c(c5 % 1.0d, 0);
            default:
                return Math.sin(this.f22301g * c5);
        }
        return 1.0d - abs;
    }

    public void f() {
        double d5 = 0.0d;
        int i4 = 0;
        while (true) {
            if (i4 >= this.f22295a.length) {
                break;
            }
            d5 += r7[i4];
            i4++;
        }
        double d6 = 0.0d;
        int i5 = 1;
        while (true) {
            float[] fArr = this.f22295a;
            if (i5 >= fArr.length) {
                break;
            }
            int i6 = i5 - 1;
            float f4 = (fArr[i6] + fArr[i5]) / 2.0f;
            double[] dArr = this.f22296b;
            d6 += (dArr[i5] - dArr[i6]) * f4;
            i5++;
        }
        int i7 = 0;
        while (true) {
            float[] fArr2 = this.f22295a;
            if (i7 >= fArr2.length) {
                break;
            }
            fArr2[i7] = (float) (fArr2[i7] * (d5 / d6));
            i7++;
        }
        this.f22297c[0] = 0.0d;
        int i10 = 1;
        while (true) {
            float[] fArr3 = this.f22295a;
            if (i10 >= fArr3.length) {
                this.f22302h = true;
                return;
            }
            int i11 = i10 - 1;
            float f5 = (fArr3[i11] + fArr3[i10]) / 2.0f;
            double[] dArr2 = this.f22296b;
            double d7 = dArr2[i10] - dArr2[i11];
            double[] dArr3 = this.f22297c;
            dArr3[i10] = (d7 * f5) + dArr3[i11];
            i10++;
        }
    }

    public void g(int i4, String str) {
        this.f22300f = i4;
        this.f22298d = str;
        if (str != null) {
            this.f22299e = l.i(str);
        }
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.f22296b) + " period=" + Arrays.toString(this.f22295a);
    }
}
