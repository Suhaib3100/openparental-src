package androidx.constraintlayout.core.motion.utils;

/* compiled from: Schlick.java */
/* loaded from: classes.dex */
public class o extends e {

    /* renamed from: s, reason: collision with root package name */
    private static final boolean f22307s = false;

    /* renamed from: p, reason: collision with root package name */
    double f22308p;

    /* renamed from: q, reason: collision with root package name */
    double f22309q;

    /* renamed from: r, reason: collision with root package name */
    double f22310r;

    o(String str) {
        this.f22204a = str;
        int indexOf = str.indexOf(40);
        int indexOf2 = str.indexOf(44, indexOf);
        this.f22308p = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
        int i4 = indexOf2 + 1;
        this.f22309q = Double.parseDouble(str.substring(i4, str.indexOf(44, i4)).trim());
    }

    private double d(double d5) {
        double d6 = this.f22309q;
        if (d5 < d6) {
            double d7 = this.f22308p;
            return ((d7 * d6) * d6) / ((((d6 - d5) * d7) + d5) * a.a(d6, d5, d7, d5));
        }
        double d10 = this.f22308p;
        return ((d6 - 1.0d) * ((d6 - 1.0d) * d10)) / (((((d6 - d5) * (-d10)) - d5) + 1.0d) * ((((d6 - d5) * (-d10)) - d5) + 1.0d));
    }

    private double e(double d5) {
        double d6 = this.f22309q;
        if (d5 < d6) {
            return (d6 * d5) / (((d6 - d5) * this.f22308p) + d5);
        }
        return ((d5 - 1.0d) * (1.0d - d6)) / ((1.0d - d5) - ((d6 - d5) * this.f22308p));
    }

    @Override // androidx.constraintlayout.core.motion.utils.e
    public double a(double d5) {
        return e(d5);
    }

    @Override // androidx.constraintlayout.core.motion.utils.e
    public double b(double d5) {
        return d(d5);
    }
}
