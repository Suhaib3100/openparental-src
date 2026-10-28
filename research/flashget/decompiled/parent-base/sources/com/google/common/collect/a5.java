package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;

/* compiled from: NullsLastOrdering.java */
@w0
@d9.b(serializable = true)
/* loaded from: classes6.dex */
final class a5<T> extends e5<T> implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    private static final long f55347e = 0;

    /* renamed from: d, reason: collision with root package name */
    final e5<? super T> f55348d;

    a5(e5<? super T> e5Var) {
        this.f55348d = e5Var;
    }

    @Override // com.google.common.collect.e5, java.util.Comparator
    public int compare(@zc.a T t4, @zc.a T t5) {
        if (t4 == t5) {
            return 0;
        }
        if (t4 == null) {
            return 1;
        }
        if (t5 == null) {
            return -1;
        }
        return this.f55348d.compare(t4, t5);
    }

    @Override // java.util.Comparator
    public boolean equals(@zc.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a5) {
            return this.f55348d.equals(((a5) obj).f55348d);
        }
        return false;
    }

    public int hashCode() {
        return this.f55348d.hashCode() ^ (-921210296);
    }

    @Override // com.google.common.collect.e5
    public <S extends T> e5<S> o0() {
        return this.f55348d.o0();
    }

    @Override // com.google.common.collect.e5
    public <S extends T> e5<S> q0() {
        return this;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f55348d);
        return com.google.common.base.i.a(valueOf.length() + 12, valueOf, ProtectedSandApp.s("\uf446"));
    }

    @Override // com.google.common.collect.e5
    public <S extends T> e5<S> v0() {
        return this.f55348d.v0().o0();
    }
}
