package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import androidx.dynamicanimation.animation.b;
import com.google.firebase.remoteconfig.p;

/* compiled from: SpringAnimation.java */
/* loaded from: classes3.dex */
public final class g extends b<g> {
    private static final float J = Float.MAX_VALUE;
    private h G;
    private float H;
    private boolean I;

    public g(e eVar) {
        super(eVar);
        this.G = null;
        this.H = Float.MAX_VALUE;
        this.I = false;
    }

    private void C() {
        h hVar = this.G;
        if (hVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double d6 = hVar.d();
        if (d6 > this.f7772g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d6 < this.f7773h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    public boolean A() {
        return this.G.f7801b > p.f18289o;
    }

    public h B() {
        return this.G;
    }

    public g D(h hVar) {
        this.G = hVar;
        return this;
    }

    public void E() {
        if (!A()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f7771f) {
            this.I = true;
        }
    }

    @Override // androidx.dynamicanimation.animation.b
    float f(float f6, float f7) {
        return this.G.b(f6, f7);
    }

    @Override // androidx.dynamicanimation.animation.b
    boolean j(float f6, float f7) {
        return this.G.a(f6, f7);
    }

    @Override // androidx.dynamicanimation.animation.b
    void v(float f6) {
    }

    @Override // androidx.dynamicanimation.animation.b
    public void w() {
        C();
        this.G.j(i());
        super.w();
    }

    @Override // androidx.dynamicanimation.animation.b
    boolean y(long j5) {
        if (this.I) {
            float f6 = this.H;
            if (f6 != Float.MAX_VALUE) {
                this.G.h(f6);
                this.H = Float.MAX_VALUE;
            }
            this.f7767b = this.G.d();
            this.f7766a = 0.0f;
            this.I = false;
            return true;
        }
        if (this.H != Float.MAX_VALUE) {
            this.G.d();
            long j6 = j5 / 2;
            b.p k5 = this.G.k(this.f7767b, this.f7766a, j6);
            this.G.h(this.H);
            this.H = Float.MAX_VALUE;
            b.p k6 = this.G.k(k5.f7780a, k5.f7781b, j6);
            this.f7767b = k6.f7780a;
            this.f7766a = k6.f7781b;
        } else {
            b.p k7 = this.G.k(this.f7767b, this.f7766a, j5);
            this.f7767b = k7.f7780a;
            this.f7766a = k7.f7781b;
        }
        float max = Math.max(this.f7767b, this.f7773h);
        this.f7767b = max;
        float min = Math.min(max, this.f7772g);
        this.f7767b = min;
        if (!j(min, this.f7766a)) {
            return false;
        }
        this.f7767b = this.G.d();
        this.f7766a = 0.0f;
        return true;
    }

    public void z(float f6) {
        if (this.f7771f) {
            this.H = f6;
            return;
        }
        if (this.G == null) {
            this.G = new h(f6);
        }
        this.G.h(f6);
        w();
    }

    public <K> g(K k5, d<K> dVar) {
        super(k5, dVar);
        this.G = null;
        this.H = Float.MAX_VALUE;
        this.I = false;
    }

    public <K> g(K k5, d<K> dVar, float f6) {
        super(k5, dVar);
        this.G = null;
        this.H = Float.MAX_VALUE;
        this.I = false;
        this.G = new h(f6);
    }
}
