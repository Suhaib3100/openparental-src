package com.google.common.base;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collections;
import java.util.Set;

/* compiled from: Absent.java */
@o
@d9.b
/* loaded from: classes6.dex */
final class a<T> extends g0<T> {

    /* renamed from: c, reason: collision with root package name */
    static final a<Object> f54847c = new a<>();

    /* renamed from: d, reason: collision with root package name */
    private static final long f54848d = 0;

    private a() {
    }

    private Object m() {
        return f54847c;
    }

    static <T> g0<T> n() {
        return f54847c;
    }

    @Override // com.google.common.base.g0
    public Set<T> b() {
        return Collections.emptySet();
    }

    @Override // com.google.common.base.g0
    public T d() {
        throw new IllegalStateException(ProtectedSandApp.s("\uf2b6"));
    }

    @Override // com.google.common.base.g0
    public boolean e() {
        return false;
    }

    @Override // com.google.common.base.g0
    public boolean equals(@zc.a Object obj) {
        return obj == this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.base.g0
    public g0<T> g(g0<? extends T> g0Var) {
        g0Var.getClass();
        return g0Var;
    }

    @Override // com.google.common.base.g0
    public T h(u0<? extends T> u0Var) {
        return (T) l0.F(u0Var.get(), ProtectedSandApp.s("\uf2b7"));
    }

    @Override // com.google.common.base.g0
    public int hashCode() {
        return 2040732332;
    }

    @Override // com.google.common.base.g0
    public T i(T t4) {
        return (T) l0.F(t4, ProtectedSandApp.s("\uf2b8"));
    }

    @Override // com.google.common.base.g0
    @zc.a
    public T j() {
        return null;
    }

    @Override // com.google.common.base.g0
    public <V> g0<V> l(x<? super T, V> xVar) {
        xVar.getClass();
        return n();
    }

    @Override // com.google.common.base.g0
    public String toString() {
        return ProtectedSandApp.s("\uf2b9");
    }
}
