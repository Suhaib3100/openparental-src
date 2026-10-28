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
        private static final float f29234d = -4.2f;

        /* renamed from: e, reason: collision with root package name */
        private static final float f29235e = 62.5f;

        /* renamed from: b, reason: collision with root package name */
        private float f29237b;

        /* renamed from: a, reason: collision with root package name */
        private float f29236a = f29234d;

        /* renamed from: c, reason: collision with root package name */
        private final b.p f29238c = new b.p();

        a() {
        }

        @Override // androidx.dynamicanimation.animation.f
        public boolean a(float f4, float f5) {
            return Math.abs(f5) < this.f29237b;
        }

        @Override // androidx.dynamicanimation.animation.f
        public float b(float f4, float f5) {
            return f5 * this.f29236a;
        }

        float c() {
            return this.f29236a / f29234d;
        }

        void d(float f4) {
            this.f29236a = f4 * f29234d;
        }

        void e(float f4) {
            this.f29237b = f4 * f29235e;
        }

        b.p f(float f4, float f5, long j4) {
            float f6 = j4;
            this.f29238c.f29233b = (float) (Math.exp((f6 / 1000.0f) * this.f29236a) * f5);
            b.p pVar = this.f29238c;
            float f7 = this.f29236a;
            pVar.f29232a = (float) ((Math.exp((f7 * f6) / 1000.0f) * (f5 / f7)) + (f4 - (f5 / f7)));
            b.p pVar2 = this.f29238c;
            if (a(pVar2.f29232a, pVar2.f29233b)) {
                this.f29238c.f29233b = 0.0f;
            }
            return this.f29238c;
        }
    }

    public c(e eVar) {
        super(eVar);
        a aVar = new a();
        this.G = aVar;
        aVar.e(i());
    }

    public c A(@x(from = 0.0d, fromInclusive = false) float f4) {
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("Friction must be positive");
        }
        this.G.d(f4);
        return this;
    }

    public c B(float f4) {
        this.f29224g = f4;
        return this;
    }

    public c C(float f4) {
        this.f29225h = f4;
        return this;
    }

    public c D(float f4) {
        this.f29218a = f4;
        return this;
    }

    @Override // androidx.dynamicanimation.animation.b
    float f(float f4, float f5) {
        return this.G.b(f4, f5);
    }

    @Override // androidx.dynamicanimation.animation.b
    boolean j(float f4, float f5) {
        return f4 >= this.f29224g || f4 <= this.f29225h || this.G.a(f4, f5);
    }

    @Override // androidx.dynamicanimation.animation.b
    public c p(float f4) {
        this.f29224g = f4;
        return this;
    }

    @Override // androidx.dynamicanimation.animation.b
    public c q(float f4) {
        this.f29225h = f4;
        return this;
    }

    @Override // androidx.dynamicanimation.animation.b
    public c u(float f4) {
        this.f29218a = f4;
        return this;
    }

    @Override // androidx.dynamicanimation.animation.b
    void v(float f4) {
        this.G.e(f4);
    }

    @Override // androidx.dynamicanimation.animation.b
    boolean y(long j4) {
        b.p f4 = this.G.f(this.f29219b, this.f29218a, j4);
        float f5 = f4.f29232a;
        this.f29219b = f5;
        float f6 = f4.f29233b;
        this.f29218a = f6;
        float f7 = this.f29225h;
        if (f5 < f7) {
            this.f29219b = f7;
            return true;
        }
        float f10 = this.f29224g;
        if (f5 <= f10) {
            return j(f5, f6);
        }
        this.f29219b = f10;
        return true;
    }

    public float z() {
        return this.G.c();
    }

    public <K> c(K k4, d<K> dVar) {
        super(k4, dVar);
        a aVar = new a();
        this.G = aVar;
        aVar.e(i());
    }
}
