package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.h;

/* compiled from: ChainReference.java */
/* loaded from: classes.dex */
public class d extends androidx.constraintlayout.core.state.c {

    /* renamed from: n0, reason: collision with root package name */
    protected float f22703n0;

    /* renamed from: o0, reason: collision with root package name */
    protected h.b f22704o0;

    public d(androidx.constraintlayout.core.state.h hVar, h.e eVar) {
        super(hVar, eVar);
        this.f22703n0 = 0.5f;
        this.f22704o0 = h.b.SPREAD;
    }

    @Override // androidx.constraintlayout.core.state.a
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public d m(float f4) {
        this.f22703n0 = f4;
        return this;
    }

    public float Q0() {
        return this.f22703n0;
    }

    public h.b R0() {
        return h.b.SPREAD;
    }

    public d S0(h.b bVar) {
        this.f22704o0 = bVar;
        return this;
    }
}
