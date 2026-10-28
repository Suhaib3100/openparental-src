package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;

/* compiled from: NaturalOrdering.java */
@w0
@d9.b(serializable = true)
/* loaded from: classes6.dex */
final class x4 extends e5<Comparable<?>> implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    static final x4 f56632f = new x4();

    /* renamed from: g, reason: collision with root package name */
    private static final long f56633g = 0;

    /* renamed from: d, reason: collision with root package name */
    @zc.a
    private transient e5<Comparable<?>> f56634d;

    /* renamed from: e, reason: collision with root package name */
    @zc.a
    private transient e5<Comparable<?>> f56635e;

    private x4() {
    }

    private Object z0() {
        return f56632f;
    }

    @Override // com.google.common.collect.e5
    public <S extends Comparable<?>> e5<S> o0() {
        e5<S> e5Var = (e5<S>) this.f56634d;
        if (e5Var != null) {
            return e5Var;
        }
        z4 z4Var = new z4(this);
        this.f56634d = z4Var;
        return z4Var;
    }

    @Override // com.google.common.collect.e5
    public <S extends Comparable<?>> e5<S> q0() {
        e5<S> e5Var = (e5<S>) this.f56635e;
        if (e5Var != null) {
            return e5Var;
        }
        a5 a5Var = new a5(this);
        this.f56635e = a5Var;
        return a5Var;
    }

    public String toString() {
        return ProtectedSandApp.s("\uf57c");
    }

    @Override // com.google.common.collect.e5
    public <S extends Comparable<?>> e5<S> v0() {
        return y5.f56654d;
    }

    @Override // com.google.common.collect.e5, java.util.Comparator
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }
}
