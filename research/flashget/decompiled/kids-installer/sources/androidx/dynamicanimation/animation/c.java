package androidx.dynamicanimation.animation;

import androidx.annotation.x;
import androidx.dynamicanimation.animation.b;

/* compiled from: FlingAnimation.java */
/* loaded from: classes3.dex */
public final class c extends b<c> {
    private final a G;

    /* compiled from: FlingAnimation.java */
    static final class a implements f {

        /* renamed from: d, reason: collision with root package name */
        private static final float f7782d = -4.2f;

        /* renamed from: e, reason: collision with root package name */
        private static final float f7783e = 62.5f;

        /* renamed from: b, reason: collision with root package name */
        private float f7785b;

        /* renamed from: a, reason: collision with root package name */
        private float f7784a = f7782d;

        /* renamed from: c, reason: collision with root package name */
        private final b.p f7786c = new b.p();

        a() {
        }

        @Override // androidx.dynamicanimation.animation.f
        public boolean a(float f6, float f7) {
            return Math.abs(f7) < this.f7785b;
        }

        @Override // androidx.dynamicanimation.animation.f
        public float b(float f6, float f7) {
            return f7 * this.f7784a;
        }

        float c() {
            return this.f7784a / f7782d;
        }

        void d(float f6) {
            this.f7784a = f6 * f7782d;
        }

        void e(float f6) {
            this.f7785b = f6 * f7783e;
        }

        b.p f(float f6, float f7, long j5) {
            float f8 = j5;
            this.f7786c.f7781b = (float) (Math.exp((f8 / 1000.0f) * this.f7784a) * f7);
            b.p pVar = this.f7786c;
            float f9 = this.f7784a;
            pVar.f7780a = (float) ((Math.exp((f9 * f8) / 1000.0f) * (f7 / f9)) + (f6 - (f7 / f9)));
            b.p pVar2 = this.f7786c;
            if (a(pVar2.f7780a, pVar2.f7781b)) {
                this.f7786c.f7781b = 0.0f;
            }
            return this.f7786c;
        }
    }

    public c(e eVar) {
        super(eVar);
        a aVar = new a();
        this.G = aVar;
        aVar.e(i());
    }

    public c A(@x(from = 0.0d, fromInclusive = false) float f6) {
        if (f6 <= 0.0f) {
            throw new IllegalArgumentException("Friction must be positive");
        }
        this.G.d(f6);
        return this;
    }

    public c B(float f6) {
        this.f7772g = f6;
        return this;
    }

    public c C(float f6) {
        this.f7773h = f6;
        return this;
    }

    public c D(float f6) {
        this.f7766a = f6;
        return this;
    }

    @Override // androidx.dynamicanimation.animation.b
    float f(float f6, float f7) {
        return this.G.b(f6, f7);
    }

    @Override // androidx.dynamicanimation.animation.b
    boolean j(float f6, float f7) {
        return f6 >= this.f7772g || f6 <= this.f7773h || this.G.a(f6, f7);
    }

    @Override // androidx.dynamicanimation.animation.b
    public c p(float f6) {
        this.f7772g = f6;
        return this;
    }

    @Override // androidx.dynamicanimation.animation.b
    public c q(float f6) {
        this.f7773h = f6;
        return this;
    }

    @Override // androidx.dynamicanimation.animation.b
    public c u(float f6) {
        this.f7766a = f6;
        return this;
    }

    @Override // androidx.dynamicanimation.animation.b
    void v(float f6) {
        this.G.e(f6);
    }

    @Override // androidx.dynamicanimation.animation.b
    boolean y(long j5) {
        b.p f6 = this.G.f(this.f7767b, this.f7766a, j5);
        float f7 = f6.f7780a;
        this.f7767b = f7;
        float f8 = f6.f7781b;
        this.f7766a = f8;
        float f9 = this.f7773h;
        if (f7 < f9) {
            this.f7767b = f9;
            return true;
        }
        float f10 = this.f7772g;
        if (f7 <= f10) {
            return j(f7, f8);
        }
        this.f7767b = f10;
        return true;
    }

    public float z() {
        return this.G.c();
    }

    public <K> c(K k5, d<K> dVar) {
        super(k5, dVar);
        a aVar = new a();
        this.G = aVar;
        aVar.e(i());
    }
}
