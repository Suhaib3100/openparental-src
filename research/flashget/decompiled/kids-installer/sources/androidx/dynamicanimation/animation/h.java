package androidx.dynamicanimation.animation;

import androidx.annotation.c1;
import androidx.annotation.x;
import androidx.dynamicanimation.animation.b;
import com.google.firebase.remoteconfig.p;

/* compiled from: SpringForce.java */
/* loaded from: classes3.dex */
public final class h implements f {

    /* renamed from: k, reason: collision with root package name */
    public static final float f7790k = 10000.0f;

    /* renamed from: l, reason: collision with root package name */
    public static final float f7791l = 1500.0f;

    /* renamed from: m, reason: collision with root package name */
    public static final float f7792m = 200.0f;

    /* renamed from: n, reason: collision with root package name */
    public static final float f7793n = 50.0f;

    /* renamed from: o, reason: collision with root package name */
    public static final float f7794o = 0.2f;

    /* renamed from: p, reason: collision with root package name */
    public static final float f7795p = 0.5f;

    /* renamed from: q, reason: collision with root package name */
    public static final float f7796q = 0.75f;

    /* renamed from: r, reason: collision with root package name */
    public static final float f7797r = 1.0f;

    /* renamed from: s, reason: collision with root package name */
    private static final double f7798s = 62.5d;

    /* renamed from: t, reason: collision with root package name */
    private static final double f7799t = Double.MAX_VALUE;

    /* renamed from: a, reason: collision with root package name */
    double f7800a;

    /* renamed from: b, reason: collision with root package name */
    double f7801b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7802c;

    /* renamed from: d, reason: collision with root package name */
    private double f7803d;

    /* renamed from: e, reason: collision with root package name */
    private double f7804e;

    /* renamed from: f, reason: collision with root package name */
    private double f7805f;

    /* renamed from: g, reason: collision with root package name */
    private double f7806g;

    /* renamed from: h, reason: collision with root package name */
    private double f7807h;

    /* renamed from: i, reason: collision with root package name */
    private double f7808i;

    /* renamed from: j, reason: collision with root package name */
    private final b.p f7809j;

    public h() {
        this.f7800a = Math.sqrt(1500.0d);
        this.f7801b = 0.5d;
        this.f7802c = false;
        this.f7808i = Double.MAX_VALUE;
        this.f7809j = new b.p();
    }

    private void f() {
        if (this.f7802c) {
            return;
        }
        if (this.f7808i == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d6 = this.f7801b;
        if (d6 > 1.0d) {
            double d7 = this.f7800a;
            this.f7805f = (Math.sqrt((d6 * d6) - 1.0d) * d7) + ((-d6) * d7);
            double d8 = this.f7801b;
            double d9 = this.f7800a;
            this.f7806g = ((-d8) * d9) - (Math.sqrt((d8 * d8) - 1.0d) * d9);
        } else if (d6 >= p.f18289o && d6 < 1.0d) {
            this.f7807h = Math.sqrt(1.0d - (d6 * d6)) * this.f7800a;
        }
        this.f7802c = true;
    }

    @Override // androidx.dynamicanimation.animation.f
    @c1({c1.a.LIBRARY})
    public boolean a(float f6, float f7) {
        return ((double) Math.abs(f7)) < this.f7804e && ((double) Math.abs(f6 - ((float) this.f7808i))) < this.f7803d;
    }

    @Override // androidx.dynamicanimation.animation.f
    @c1({c1.a.LIBRARY})
    public float b(float f6, float f7) {
        float f8 = f6 - ((float) this.f7808i);
        double d6 = this.f7800a;
        return (float) (((-(d6 * d6)) * f8) - (((d6 * 2.0d) * this.f7801b) * f7));
    }

    public float c() {
        return (float) this.f7801b;
    }

    public float d() {
        return (float) this.f7808i;
    }

    public float e() {
        double d6 = this.f7800a;
        return (float) (d6 * d6);
    }

    public h g(@x(from = 0.0d) float f6) {
        if (f6 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f7801b = f6;
        this.f7802c = false;
        return this;
    }

    public h h(float f6) {
        this.f7808i = f6;
        return this;
    }

    public h i(@x(from = 0.0d, fromInclusive = false) float f6) {
        if (f6 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f7800a = Math.sqrt(f6);
        this.f7802c = false;
        return this;
    }

    void j(double d6) {
        double abs = Math.abs(d6);
        this.f7803d = abs;
        this.f7804e = abs * f7798s;
    }

    b.p k(double d6, double d7, long j5) {
        double cos;
        double d8;
        f();
        double d9 = j5 / 1000.0d;
        double d10 = d6 - this.f7808i;
        double d11 = this.f7801b;
        if (d11 > 1.0d) {
            double d12 = this.f7806g;
            double d13 = this.f7805f;
            double d14 = d10 - (((d12 * d10) - d7) / (d12 - d13));
            double d15 = ((d10 * d12) - d7) / (d12 - d13);
            d8 = (Math.pow(2.718281828459045d, this.f7805f * d9) * d15) + (Math.pow(2.718281828459045d, d12 * d9) * d14);
            double d16 = this.f7806g;
            double pow = Math.pow(2.718281828459045d, d16 * d9) * d14 * d16;
            double d17 = this.f7805f;
            cos = (Math.pow(2.718281828459045d, d17 * d9) * d15 * d17) + pow;
        } else if (d11 == 1.0d) {
            double d18 = this.f7800a;
            double d19 = (d18 * d10) + d7;
            double d20 = (d19 * d9) + d10;
            double pow2 = Math.pow(2.718281828459045d, (-d18) * d9) * d20;
            double pow3 = Math.pow(2.718281828459045d, (-this.f7800a) * d9) * d20;
            double d21 = this.f7800a;
            cos = (Math.pow(2.718281828459045d, (-d21) * d9) * d19) + (pow3 * (-d21));
            d8 = pow2;
        } else {
            double d22 = 1.0d / this.f7807h;
            double d23 = this.f7800a;
            double d24 = ((d11 * d23 * d10) + d7) * d22;
            double sin = ((Math.sin(this.f7807h * d9) * d24) + (Math.cos(this.f7807h * d9) * d10)) * Math.pow(2.718281828459045d, (-d11) * d23 * d9);
            double d25 = this.f7800a;
            double d26 = this.f7801b;
            double d27 = (-d25) * sin * d26;
            double pow4 = Math.pow(2.718281828459045d, (-d26) * d25 * d9);
            double d28 = this.f7807h;
            double sin2 = Math.sin(d28 * d9) * (-d28) * d10;
            double d29 = this.f7807h;
            cos = (((Math.cos(d29 * d9) * d24 * d29) + sin2) * pow4) + d27;
            d8 = sin;
        }
        b.p pVar = this.f7809j;
        pVar.f7780a = (float) (d8 + this.f7808i);
        pVar.f7781b = (float) cos;
        return pVar;
    }

    public h(float f6) {
        this.f7800a = Math.sqrt(1500.0d);
        this.f7801b = 0.5d;
        this.f7802c = false;
        this.f7808i = Double.MAX_VALUE;
        this.f7809j = new b.p();
        this.f7808i = f6;
    }
}
