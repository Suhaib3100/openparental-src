package androidx.constraintlayout.motion.utils;

import com.google.firebase.remoteconfig.p;
import java.util.Arrays;

/* compiled from: Easing.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    String f1628a = "identity";

    /* renamed from: c, reason: collision with root package name */
    private static final String f1619c = "cubic(0.4, 0.0, 0.2, 1)";

    /* renamed from: d, reason: collision with root package name */
    private static final String f1620d = "cubic(0.4, 0.05, 0.8, 0.7)";

    /* renamed from: e, reason: collision with root package name */
    private static final String f1621e = "cubic(0.0, 0.0, 0.2, 0.95)";

    /* renamed from: f, reason: collision with root package name */
    private static final String f1622f = "cubic(1, 1, 0, 0)";

    /* renamed from: g, reason: collision with root package name */
    private static final String f1623g = "decelerate";

    /* renamed from: h, reason: collision with root package name */
    private static final String f1624h = "accelerate";

    /* renamed from: i, reason: collision with root package name */
    private static final String f1625i = "standard";

    /* renamed from: j, reason: collision with root package name */
    private static final String f1626j = "linear";

    /* renamed from: b, reason: collision with root package name */
    static c f1618b = new c();

    /* renamed from: k, reason: collision with root package name */
    public static String[] f1627k = {"standard", "accelerate", "decelerate", "linear"};

    public static c c(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new a(str);
        }
        switch (str) {
            case "accelerate":
                return new a("cubic(0.4, 0.05, 0.8, 0.7)");
            case "decelerate":
                return new a("cubic(0.0, 0.0, 0.2, 0.95)");
            case "linear":
                return new a("cubic(1, 1, 0, 0)");
            case "standard":
                return new a("cubic(0.4, 0.0, 0.2, 1)");
            default:
                Arrays.toString(f1627k);
                return f1618b;
        }
    }

    public double a(double d6) {
        return d6;
    }

    public double b(double d6) {
        return 1.0d;
    }

    public String toString() {
        return this.f1628a;
    }

    /* compiled from: Easing.java */
    /* loaded from: classes2.dex */
    static class a extends c {

        /* renamed from: p, reason: collision with root package name */
        private static double f1629p = 0.01d;

        /* renamed from: q, reason: collision with root package name */
        private static double f1630q = 1.0E-4d;

        /* renamed from: l, reason: collision with root package name */
        double f1631l;

        /* renamed from: m, reason: collision with root package name */
        double f1632m;

        /* renamed from: n, reason: collision with root package name */
        double f1633n;

        /* renamed from: o, reason: collision with root package name */
        double f1634o;

        a(String str) {
            this.f1628a = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.f1631l = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i5 = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i5);
            this.f1632m = Double.parseDouble(str.substring(i5, indexOf3).trim());
            int i6 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i6);
            this.f1633n = Double.parseDouble(str.substring(i6, indexOf4).trim());
            int i7 = indexOf4 + 1;
            this.f1634o = Double.parseDouble(str.substring(i7, str.indexOf(41, i7)).trim());
        }

        private double d(double d6) {
            double d7 = 1.0d - d6;
            double d8 = this.f1631l;
            double d9 = d7 * 3.0d * d7 * d8;
            double d10 = this.f1633n;
            return ((1.0d - d10) * 3.0d * d6 * d6) + ((d10 - d8) * d7 * 6.0d * d6) + d9;
        }

        private double e(double d6) {
            double d7 = 1.0d - d6;
            double d8 = this.f1632m;
            double d9 = d7 * 3.0d * d7 * d8;
            double d10 = this.f1634o;
            return ((1.0d - d10) * 3.0d * d6 * d6) + ((d10 - d8) * d7 * 6.0d * d6) + d9;
        }

        private double f(double d6) {
            double d7 = 1.0d - d6;
            double d8 = 3.0d * d7;
            double d9 = d7 * d8 * d6;
            double d10 = d8 * d6 * d6;
            return (this.f1633n * d10) + (this.f1631l * d9) + (d6 * d6 * d6);
        }

        private double g(double d6) {
            double d7 = 1.0d - d6;
            double d8 = 3.0d * d7;
            double d9 = d7 * d8 * d6;
            double d10 = d8 * d6 * d6;
            return (this.f1634o * d10) + (this.f1632m * d9) + (d6 * d6 * d6);
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public double a(double d6) {
            if (d6 <= p.f18289o) {
                return p.f18289o;
            }
            if (d6 >= 1.0d) {
                return 1.0d;
            }
            double d7 = 0.5d;
            double d8 = 0.5d;
            while (d7 > f1629p) {
                d7 *= 0.5d;
                d8 = f(d8) < d6 ? d8 + d7 : d8 - d7;
            }
            double d9 = d8 - d7;
            double f6 = f(d9);
            double d10 = d8 + d7;
            double f7 = f(d10);
            double g5 = g(d9);
            return (((d6 - f6) * (g(d10) - g5)) / (f7 - f6)) + g5;
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public double b(double d6) {
            double d7 = 0.5d;
            double d8 = 0.5d;
            while (d7 > f1630q) {
                d7 *= 0.5d;
                d8 = f(d8) < d6 ? d8 + d7 : d8 - d7;
            }
            double d9 = d8 - d7;
            double d10 = d8 + d7;
            return (g(d10) - g(d9)) / (f(d10) - f(d9));
        }

        void h(double d6, double d7, double d8, double d9) {
            this.f1631l = d6;
            this.f1632m = d7;
            this.f1633n = d8;
            this.f1634o = d9;
        }

        public a(double d6, double d7, double d8, double d9) {
            h(d6, d7, d8, d9);
        }
    }
}
