package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import java.util.List;

/* compiled from: AllEqualOrdering.java */
@w0
@d9.b(serializable = true)
/* loaded from: classes6.dex */
final class r extends e5<Object> implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    static final r f56275d = new r();

    /* renamed from: e, reason: collision with root package name */
    private static final long f56276e = 0;

    r() {
    }

    private Object y0() {
        return f56275d;
    }

    @Override // com.google.common.collect.e5
    public <E> f3<E> B(Iterable<E> iterable) {
        return f3.w(iterable);
    }

    @Override // com.google.common.collect.e5, java.util.Comparator
    public int compare(@zc.a Object obj, @zc.a Object obj2) {
        return 0;
    }

    public String toString() {
        return ProtectedSandApp.s("\uf53a");
    }

    @Override // com.google.common.collect.e5
    public <S> e5<S> v0() {
        return this;
    }

    @Override // com.google.common.collect.e5
    public <E> List<E> w0(Iterable<E> iterable) {
        return l4.r(iterable);
    }
}
