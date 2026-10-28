package androidx.dynamicanimation.animation;

import androidx.annotation.c1;
import androidx.annotation.x;
import androidx.dynamicanimation.animation.b;
import com.google.firebase.remoteconfig.p;

/* compiled from: SpringForce.java */
/* loaded from: classes3.dex */
public final class h implements f {

    /* renamed from: k, reason: collision with root package name */
    public static final float f29242k = 10000.0f;

    /* renamed from: l, reason: collision with root package name */
    public static final float f29243l = 1500.0f;

    /* renamed from: m, reason: collision with root package name */
    public static final float f29244m = 200.0f;

    /* renamed from: n, reason: collision with root package name */
    public static final float f29245n = 50.0f;

    /* renamed from: o, reason: collision with root package name */
    public static final float f29246o = 0.2f;

    /* renamed from: p, reason: collision with root package name */
    public static final float f29247p = 0.5f;

    /* renamed from: q, reason: collision with root package name */
    public static final float f29248q = 0.75f;

    /* renamed from: r, reason: collision with root package name */
    public static final float f29249r = 1.0f;

    /* renamed from: s, reason: collision with root package name */
    private static final double f29250s = 62.5d;

    /* renamed from: t, reason: collision with root package name */
    private static final double f29251t = Double.MAX_VALUE;

    /* renamed from: a, reason: collision with root package name */
    double f29252a;

    /* renamed from: b, reason: collision with root package name */
    double f29253b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f29254c;

    /* renamed from: d, reason: collision with root package name */
    private double f29255d;

    /* renamed from: e, reason: collision with root package name */
    private double f29256e;

    /* renamed from: f, reason: collision with root package name */
    private double f29257f;

    /* renamed from: g, reason: collision with root package name */
    private double f29258g;

    /* renamed from: h, reason: collision with root package name */
    private double f29259h;

    /* renamed from: i, reason: collision with root package name */
    private double f29260i;

    /* renamed from: j, reason: collision with root package name */
    private final b.p f29261j;

    public h() {
        this.f29252a = Math.sqrt(1500.0d);
        this.f29253b = 0.5d;
        this.f29254c = false;
        this.f29260i = Double.MAX_VALUE;
        this.f29261j = new b.p();
    }

    private void f() {
        if (this.f29254c) {
            return;
        }
        if (this.f29260i == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d5 = this.f29253b;
        if (d5 > 1.0d) {
            double d6 = this.f29252a;
            this.f29257f = (Math.sqrt((d5 * d5) - 1.0d) * d6) + ((-d5) * d6);
            double d7 = this.f29253b;
            double d10 = this.f29252a;
            this.f29258g = ((-d7) * d10) - (Math.sqrt((d7 * d7) - 1.0d) * d10);
        } else if (d5 >= p.f60679p && d5 < 1.0d) {
            this.f29259h = Math.sqrt(1.0d - (d5 * d5)) * this.f29252a;
        }
        this.f29254c = true;
    }

    @Override // androidx.dynamicanimation.animation.f
    @c1({c1.a.LIBRARY})
    public boolean a(float f4, float f5) {
        return ((double) Math.abs(f5)) < this.f29256e && ((double) Math.abs(f4 - ((float) this.f29260i))) < this.f29255d;
    }

    @Override // androidx.dynamicanimation.animation.f
    @c1({c1.a.LIBRARY})
    public float b(float f4, float f5) {
        float f6 = f4 - ((float) this.f29260i);
        double d5 = this.f29252a;
        return (float) (((-(d5 * d5)) * f6) - (((d5 * 2.0d) * this.f29253b) * f5));
    }

    public float c() {
        return (float) this.f29253b;
    }

    public float d() {
        return (float) this.f29260i;
    }

    public float e() {
        double d5 = this.f29252a;
        return (float) (d5 * d5);
    }

    public h g(@x(from = 0.0d) float f4) {
        if (f4 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f29253b = f4;
        this.f29254c = false;
        return this;
    }

    public h h(float f4) {
        this.f29260i = f4;
        return this;
    }

    public h i(@x(from = 0.0d, fromInclusive = false) float f4) {
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f29252a = Math.sqrt(f4);
        this.f29254c = false;
        return this;
    }

    void j(double d5) {
        double abs = Math.abs(d5);
        this.f29255d = abs;
        this.f29256e = abs * f29250s;
    }

    b.p k(double d5, double d6, long j4) {
        double cos;
        double d7;
        f();
        double d10 = j4 / 1000.0d;
        double d11 = d5 - this.f29260i;
        double d12 = this.f29253b;
        if (d12 > 1.0d) {
            double d13 = this.f29258g;
            double d14 = this.f29257f;
            double d15 = d11 - (((d13 * d11) - d6) / (d13 - d14));
            double d16 = ((d11 * d13) - d6) / (d13 - d14);
            d7 = (Math.pow(2.718281828459045d, this.f29257f * d10) * d16) + (Math.pow(2.718281828459045d, d13 * d10) * d15);
            double d17 = this.f29258g;
            double pow = Math.pow(2.718281828459045d, d17 * d10) * d15 * d17;
            double d18 = this.f29257f;
            cos = (Math.pow(2.718281828459045d, d18 * d10) * d16 * d18) + pow;
        } else if (d12 == 1.0d) {
            double d19 = this.f29252a;
            double d20 = (d19 * d11) + d6;
            double d21 = (d20 * d10) + d11;
            double pow2 = Math.pow(2.718281828459045d, (-d19) * d10) * d21;
            double pow3 = Math.pow(2.718281828459045d, (-this.f29252a) * d10) * d21;
            double d22 = this.f29252a;
            cos = (Math.pow(2.718281828459045d, (-d22) * d10) * d20) + (pow3 * (-d22));
            d7 = pow2;
        } else {
            double d23 = 1.0d / this.f29259h;
            double d24 = this.f29252a;
            double d25 = ((d12 * d24 * d11) + d6) * d23;
            double sin = ((Math.sin(this.f29259h * d10) * d25) + (Math.cos(this.f29259h * d10) * d11)) * Math.pow(2.718281828459045d, (-d12) * d24 * d10);
            double d26 = this.f29252a;
            double d27 = this.f29253b;
            double d28 = (-d26) * sin * d27;
            double pow4 = Math.pow(2.718281828459045d, (-d27) * d26 * d10);
            double d29 = this.f29259h;
            double sin2 = Math.sin(d29 * d10) * (-d29) * d11;
            double d30 = this.f29259h;
            cos = (((Math.cos(d30 * d10) * d25 * d30) + sin2) * pow4) + d28;
            d7 = sin;
        }
        b.p pVar = this.f29261j;
        pVar.f29232a = (float) (d7 + this.f29260i);
        pVar.f29233b = (float) cos;
        return pVar;
    }

    public h(float f4) {
        this.f29252a = Math.sqrt(1500.0d);
        this.f29253b = 0.5d;
        this.f29254c = false;
        this.f29261j = new b.p();
        this.f29260i = f4;
    }
}
