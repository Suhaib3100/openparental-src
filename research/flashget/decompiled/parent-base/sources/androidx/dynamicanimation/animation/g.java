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
        double d5 = hVar.d();
        if (d5 > this.f29224g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d5 < this.f29225h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    public boolean A() {
        return this.G.f29253b > p.f60679p;
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
        if (this.f29223f) {
            this.I = true;
        }
    }

    @Override // androidx.dynamicanimation.animation.b
    float f(float f4, float f5) {
        return this.G.b(f4, f5);
    }

    @Override // androidx.dynamicanimation.animation.b
    boolean j(float f4, float f5) {
        return this.G.a(f4, f5);
    }

    @Override // androidx.dynamicanimation.animation.b
    void v(float f4) {
    }

    @Override // androidx.dynamicanimation.animation.b
    public void w() {
        C();
        this.G.j(i());
        super.w();
    }

    @Override // androidx.dynamicanimation.animation.b
    boolean y(long j4) {
        if (this.I) {
            float f4 = this.H;
            if (f4 != Float.MAX_VALUE) {
                this.G.h(f4);
                this.H = Float.MAX_VALUE;
            }
            this.f29219b = this.G.d();
            this.f29218a = 0.0f;
            this.I = false;
            return true;
        }
        if (this.H != Float.MAX_VALUE) {
            this.G.d();
            long j5 = j4 / 2;
            b.p k4 = this.G.k(this.f29219b, this.f29218a, j5);
            this.G.h(this.H);
            this.H = Float.MAX_VALUE;
            b.p k5 = this.G.k(k4.f29232a, k4.f29233b, j5);
            this.f29219b = k5.f29232a;
            this.f29218a = k5.f29233b;
        } else {
            b.p k6 = this.G.k(this.f29219b, this.f29218a, j4);
            this.f29219b = k6.f29232a;
            this.f29218a = k6.f29233b;
        }
        float max = Math.max(this.f29219b, this.f29225h);
        this.f29219b = max;
        float min = Math.min(max, this.f29224g);
        this.f29219b = min;
        if (!this.G.a(min, this.f29218a)) {
            return false;
        }
        this.f29219b = this.G.d();
        this.f29218a = 0.0f;
        return true;
    }

    public void z(float f4) {
        if (this.f29223f) {
            this.H = f4;
            return;
        }
        if (this.G == null) {
            this.G = new h(f4);
        }
        this.G.h(f4);
        w();
    }

    public <K> g(K k4, d<K> dVar) {
        super(k4, dVar);
        this.G = null;
        this.H = Float.MAX_VALUE;
        this.I = false;
    }

    public <K> g(K k4, d<K> dVar, float f4) {
        super(k4, dVar);
        this.G = null;
        this.H = Float.MAX_VALUE;
        this.I = false;
        this.G = new h(f4);
    }
}
