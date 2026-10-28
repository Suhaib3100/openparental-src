package g8;

/* compiled from: Vector3.java */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f73906d = new a(0.0f, 0.0f, 0.0f);

    /* renamed from: e, reason: collision with root package name */
    public static final a f73907e = new a(1.0f, 0.0f, 0.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final a f73908f = new a(0.0f, 1.0f, 0.0f);

    /* renamed from: g, reason: collision with root package name */
    public static final a f73909g = new a(0.0f, 0.0f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public float f73910a;

    /* renamed from: b, reason: collision with root package name */
    public float f73911b;

    /* renamed from: c, reason: collision with root package name */
    public float f73912c;

    public a() {
    }

    public final void a(float f4, float f5, float f6) {
        this.f73910a += f4;
        this.f73911b += f5;
        this.f73912c += f6;
    }

    public final void b(a aVar) {
        this.f73910a += aVar.f73910a;
        this.f73911b += aVar.f73911b;
        this.f73912c += aVar.f73912c;
    }

    public final a c(a aVar) {
        float f4 = this.f73911b;
        float f5 = aVar.f73912c;
        float f6 = this.f73912c;
        float f7 = aVar.f73911b;
        float f10 = (f4 * f5) - (f6 * f7);
        float f11 = aVar.f73910a;
        float f12 = this.f73910a;
        return new a(f10, (f6 * f11) - (f5 * f12), (f12 * f7) - (f4 * f11));
    }

    public final float d(a aVar) {
        float f4 = this.f73910a - aVar.f73910a;
        float f5 = this.f73911b - aVar.f73911b;
        float f6 = this.f73912c - aVar.f73912c;
        return (f6 * f6) + (f5 * f5) + (f4 * f4);
    }

    public final void e(float f4) {
        if (f4 != 0.0f) {
            this.f73910a /= f4;
            this.f73911b /= f4;
            this.f73912c /= f4;
        }
    }

    public final float f(a aVar) {
        return (this.f73912c * aVar.f73912c) + (this.f73911b * aVar.f73911b) + (this.f73910a * aVar.f73910a);
    }

    public final float g() {
        return (float) Math.sqrt(h());
    }

    public final float h() {
        float f4 = this.f73910a;
        float f5 = this.f73911b;
        float f6 = (f5 * f5) + (f4 * f4);
        float f7 = this.f73912c;
        return (f7 * f7) + f6;
    }

    public final void i(float f4) {
        this.f73910a *= f4;
        this.f73911b *= f4;
        this.f73912c *= f4;
    }

    public final void j(a aVar) {
        this.f73910a *= aVar.f73910a;
        this.f73911b *= aVar.f73911b;
        this.f73912c *= aVar.f73912c;
    }

    public final float k() {
        float g4 = g();
        if (g4 != 0.0f) {
            this.f73910a /= g4;
            this.f73911b /= g4;
            this.f73912c /= g4;
        }
        return g4;
    }

    public final boolean l(a aVar) {
        return f(aVar) > 0.0f;
    }

    public final void m(float f4, float f5, float f6) {
        this.f73910a = f4;
        this.f73911b = f5;
        this.f73912c = f6;
    }

    public final void n(a aVar) {
        this.f73910a = aVar.f73910a;
        this.f73911b = aVar.f73911b;
        this.f73912c = aVar.f73912c;
    }

    public final void o(a aVar) {
        this.f73910a -= aVar.f73910a;
        this.f73911b -= aVar.f73911b;
        this.f73912c -= aVar.f73912c;
    }

    public final void p(a aVar, float f4) {
        this.f73910a -= aVar.f73910a * f4;
        this.f73911b -= aVar.f73911b * f4;
        this.f73912c -= aVar.f73912c * f4;
    }

    public final void q() {
        m(0.0f, 0.0f, 0.0f);
    }

    public a(float[] fArr) {
        m(fArr[0], fArr[1], fArr[2]);
    }

    public a(float f4, float f5, float f6) {
        m(f4, f5, f6);
    }

    public a(a aVar) {
        n(aVar);
    }
}
