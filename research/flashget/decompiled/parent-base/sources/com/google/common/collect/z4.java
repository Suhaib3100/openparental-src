package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;

/* compiled from: NullsFirstOrdering.java */
@w0
@d9.b(serializable = true)
/* loaded from: classes6.dex */
final class z4<T> extends e5<T> implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    private static final long f56675e = 0;

    /* renamed from: d, reason: collision with root package name */
    final e5<? super T> f56676d;

    z4(e5<? super T> e5Var) {
        this.f56676d = e5Var;
    }

    @Override // com.google.common.collect.e5, java.util.Comparator
    public int compare(@zc.a T t4, @zc.a T t5) {
        if (t4 == t5) {
            return 0;
        }
        if (t4 == null) {
            return -1;
        }
        if (t5 == null) {
            return 1;
        }
        return this.f56676d.compare(t4, t5);
    }

    @Override // java.util.Comparator
    public boolean equals(@zc.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z4) {
            return this.f56676d.equals(((z4) obj).f56676d);
        }
        return false;
    }

    public int hashCode() {
        return this.f56676d.hashCode() ^ 957692532;
    }

    @Override // com.google.common.collect.e5
    public <S extends T> e5<S> o0() {
        return this;
    }

    @Override // com.google.common.collect.e5
    public <S extends T> e5<S> q0() {
        return this.f56676d.q0();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f56676d);
        return com.google.common.base.i.a(valueOf.length() + 13, valueOf, ProtectedSandApp.s("\uf588"));
    }

    @Override // com.google.common.collect.e5
    public <S extends T> e5<S> v0() {
        return this.f56676d.v0().q0();
    }
}
