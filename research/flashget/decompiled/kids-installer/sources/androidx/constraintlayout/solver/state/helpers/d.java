package androidx.constraintlayout.solver.state.helpers;

import androidx.constraintlayout.solver.state.e;

/* compiled from: ChainReference.java */
/* loaded from: classes3.dex */
public class d extends androidx.constraintlayout.solver.state.c {

    /* renamed from: e, reason: collision with root package name */
    protected float f2334e;

    /* renamed from: f, reason: collision with root package name */
    protected e.b f2335f;

    public d(androidx.constraintlayout.solver.state.e eVar, e.EnumC0020e enumC0020e) {
        super(eVar, enumC0020e);
        this.f2334e = 0.5f;
        this.f2335f = e.b.SPREAD;
    }

    public void f(float f6) {
        this.f2334e = f6;
    }

    public float g() {
        return this.f2334e;
    }

    public e.b h() {
        return e.b.SPREAD;
    }

    public void i(e.b bVar) {
        this.f2335f = bVar;
    }
}
