package com.google.common.base;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collections;
import java.util.Set;

/* compiled from: Present.java */
@o
@d9.b
/* loaded from: classes6.dex */
final class o0<T> extends g0<T> {

    /* renamed from: d, reason: collision with root package name */
    private static final long f54992d = 0;

    /* renamed from: c, reason: collision with root package name */
    private final T f54993c;

    o0(T t4) {
        this.f54993c = t4;
    }

    @Override // com.google.common.base.g0
    public Set<T> b() {
        return Collections.singleton(this.f54993c);
    }

    @Override // com.google.common.base.g0
    public T d() {
        return this.f54993c;
    }

    @Override // com.google.common.base.g0
    public boolean e() {
        return true;
    }

    @Override // com.google.common.base.g0
    public boolean equals(@zc.a Object obj) {
        if (obj instanceof o0) {
            return this.f54993c.equals(((o0) obj).f54993c);
        }
        return false;
    }

    @Override // com.google.common.base.g0
    public g0<T> g(g0<? extends T> g0Var) {
        g0Var.getClass();
        return this;
    }

    @Override // com.google.common.base.g0
    public T h(u0<? extends T> u0Var) {
        u0Var.getClass();
        return this.f54993c;
    }

    @Override // com.google.common.base.g0
    public int hashCode() {
        return this.f54993c.hashCode() + 1502476572;
    }

    @Override // com.google.common.base.g0
    public T i(T t4) {
        l0.F(t4, ProtectedSandApp.s("\uf330"));
        return this.f54993c;
    }

    @Override // com.google.common.base.g0
    public T j() {
        return this.f54993c;
    }

    @Override // com.google.common.base.g0
    public <V> g0<V> l(x<? super T, V> xVar) {
        return new o0(l0.F(xVar.apply(this.f54993c), ProtectedSandApp.s("\uf331")));
    }

    @Override // com.google.common.base.g0
    public String toString() {
        String valueOf = String.valueOf(this.f54993c);
        return h.a(valueOf.length() + 13, ProtectedSandApp.s("\uf332"), valueOf, ProtectedSandApp.s("\uf333"));
    }
}
