package androidx.constraintlayout.motion.utils;

import androidx.constraintlayout.core.motion.utils.s;
import androidx.constraintlayout.core.motion.utils.t;
import androidx.constraintlayout.motion.widget.q;

/* compiled from: StopLogic.java */
/* loaded from: classes.dex */
public class b extends q {

    /* renamed from: a, reason: collision with root package name */
    private t f23138a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.q f23139b;

    /* renamed from: c, reason: collision with root package name */
    private s f23140c;

    public b() {
        t tVar = new t();
        this.f23138a = tVar;
        this.f23140c = tVar;
    }

    @Override // androidx.constraintlayout.motion.widget.q
    public float a() {
        return this.f23140c.a();
    }

    public void b(float currentPos, float destination, float currentVelocity, float maxTime, float maxAcceleration, float maxVelocity) {
        t tVar = this.f23138a;
        this.f23140c = tVar;
        tVar.c(currentPos, destination, currentVelocity, maxTime, maxAcceleration, maxVelocity);
    }

    public String c(String desc, float time) {
        return this.f23140c.M(desc, time);
    }

    public float d(float x4) {
        return this.f23140c.L(x4);
    }

    public boolean e() {
        return this.f23140c.K();
    }

    public void f(float currentPos, float destination, float currentVelocity, float mass, float stiffness, float damping, float stopThreshold, int boundaryMode) {
        if (this.f23139b == null) {
            this.f23139b = new androidx.constraintlayout.core.motion.utils.q();
        }
        androidx.constraintlayout.core.motion.utils.q qVar = this.f23139b;
        this.f23140c = qVar;
        qVar.e(currentPos, destination, currentVelocity, mass, stiffness, damping, stopThreshold, boundaryMode);
    }

    @Override // androidx.constraintlayout.motion.widget.q, android.animation.TimeInterpolator
    public float getInterpolation(float v4) {
        return this.f23140c.getInterpolation(v4);
    }
}
