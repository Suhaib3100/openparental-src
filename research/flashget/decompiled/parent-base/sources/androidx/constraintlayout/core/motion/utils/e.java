package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* compiled from: Easing.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    String f22204a = "identity";

    /* renamed from: c, reason: collision with root package name */
    private static final String f22191c = "cubic(0.4, 0.0, 0.2, 1)";

    /* renamed from: d, reason: collision with root package name */
    private static final String f22192d = "cubic(0.4, 0.05, 0.8, 0.7)";

    /* renamed from: e, reason: collision with root package name */
    private static final String f22193e = "cubic(0.0, 0.0, 0.2, 0.95)";

    /* renamed from: f, reason: collision with root package name */
    private static final String f22194f = "cubic(1, 1, 0, 0)";

    /* renamed from: g, reason: collision with root package name */
    private static final String f22195g = "cubic(0.36, 0, 0.66, -0.56)";

    /* renamed from: h, reason: collision with root package name */
    private static final String f22196h = "cubic(0.34, 1.56, 0.64, 1)";

    /* renamed from: i, reason: collision with root package name */
    private static final String f22197i = "decelerate";

    /* renamed from: j, reason: collision with root package name */
    private static final String f22198j = "accelerate";

    /* renamed from: k, reason: collision with root package name */
    private static final String f22199k = "standard";

    /* renamed from: l, reason: collision with root package name */
    private static final String f22200l = "linear";

    /* renamed from: m, reason: collision with root package name */
    private static final String f22201m = "anticipate";

    /* renamed from: n, reason: collision with root package name */
    private static final String f22202n = "overshoot";

    /* renamed from: b, reason: collision with root package name */
    static e f22190b = new e();

    /* renamed from: o, reason: collision with root package name */
    public static String[] f22203o = {"standard", "accelerate", "decelerate", "linear"};

    public static e c(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new a(str);
        }
        if (str.startsWith("spline")) {
            return new r(str);
        }
        if (str.startsWith("Schlick")) {
            return new o(str);
        }
        switch (str) {
            case "accelerate":
                return new a("cubic(0.4, 0.05, 0.8, 0.7)");
            case "decelerate":
                return new a("cubic(0.0, 0.0, 0.2, 0.95)");
            case "anticipate":
                return new a("cubic(0.36, 0, 0.66, -0.56)");
            case "linear":
                return new a("cubic(1, 1, 0, 0)");
            case "overshoot":
                return new a("cubic(0.34, 1.56, 0.64, 1)");
            case "standard":
                return new a("cubic(0.4, 0.0, 0.2, 1)");
            default:
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f22203o));
                return f22190b;
        }
    }

    public double a(double d5) {
        return d5;
    }

    public double b(double d5) {
        return 1.0d;
    }

    public String toString() {
        return this.f22204a;
    }

    /* compiled from: Easing.java */
    static class a extends e {

        /* renamed from: t, reason: collision with root package name */
        private static double f22205t = 0.01d;

        /* renamed from: u, reason: collision with root package name */
        private static double f22206u = 1.0E-4d;

        /* renamed from: p, reason: collision with root package name */
        double f22207p;

        /* renamed from: q, reason: collision with root package name */
        double f22208q;

        /* renamed from: r, reason: collision with root package name */
        double f22209r;

        /* renamed from: s, reason: collision with root package name */
        double f22210s;

        a(String str) {
            this.f22204a = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.f22207p = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i4 = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i4);
            this.f22208q = Double.parseDouble(str.substring(i4, indexOf3).trim());
            int i5 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i5);
            this.f22209r = Double.parseDouble(str.substring(i5, indexOf4).trim());
            int i6 = indexOf4 + 1;
            this.f22210s = Double.parseDouble(str.substring(i6, str.indexOf(41, i6)).trim());
        }

        private double d(double d5) {
            double d6 = 1.0d - d5;
            double d7 = this.f22207p;
            double d10 = d6 * 3.0d * d6 * d7;
            double d11 = d6 * 6.0d * d5;
            double d12 = this.f22209r;
            return androidx.constraintlayout.core.motion.utils.a.a(1.0d, d12, 3.0d * d5 * d5, androidx.constraintlayout.core.motion.utils.a.a(d12, d7, d11, d10));
        }

        private double e(double d5) {
            double d6 = 1.0d - d5;
            double d7 = this.f22208q;
            double d10 = d6 * 3.0d * d6 * d7;
            double d11 = d6 * 6.0d * d5;
            double d12 = this.f22210s;
            return androidx.constraintlayout.core.motion.utils.a.a(1.0d, d12, 3.0d * d5 * d5, androidx.constraintlayout.core.motion.utils.a.a(d12, d7, d11, d10));
        }

        private double f(double d5) {
            double d6 = 1.0d - d5;
            double d7 = 3.0d * d6;
            double d10 = d6 * d7 * d5;
            double d11 = d7 * d5 * d5;
            return (this.f22209r * d11) + (this.f22207p * d10) + (d5 * d5 * d5);
        }

        private double g(double d5) {
            double d6 = 1.0d - d5;
            double d7 = 3.0d * d6;
            double d10 = d6 * d7 * d5;
            double d11 = d7 * d5 * d5;
            return (this.f22210s * d11) + (this.f22208q * d10) + (d5 * d5 * d5);
        }

        @Override // androidx.constraintlayout.core.motion.utils.e
        public double a(double d5) {
            if (d5 <= com.google.firebase.remoteconfig.p.f60679p) {
                return com.google.firebase.remoteconfig.p.f60679p;
            }
            if (d5 >= 1.0d) {
                return 1.0d;
            }
            double d6 = 0.5d;
            double d7 = 0.5d;
            while (d6 > f22205t) {
                d6 *= 0.5d;
                d7 = f(d7) < d5 ? d7 + d6 : d7 - d6;
            }
            double d10 = d7 - d6;
            double f4 = f(d10);
            double d11 = d7 + d6;
            double f5 = f(d11);
            double g4 = g(d10);
            return (((d5 - f4) * (g(d11) - g4)) / (f5 - f4)) + g4;
        }

        @Override // androidx.constraintlayout.core.motion.utils.e
        public double b(double d5) {
            double d6 = 0.5d;
            double d7 = 0.5d;
            while (d6 > f22206u) {
                d6 *= 0.5d;
                d7 = f(d7) < d5 ? d7 + d6 : d7 - d6;
            }
            double d10 = d7 - d6;
            double d11 = d7 + d6;
            return (g(d11) - g(d10)) / (f(d11) - f(d10));
        }

        void h(double d5, double d6, double d7, double d10) {
            this.f22207p = d5;
            this.f22208q = d6;
            this.f22209r = d7;
            this.f22210s = d10;
        }

        public a(double d5, double d6, double d7, double d10) {
            h(d5, d6, d7, d10);
        }
    }
}
