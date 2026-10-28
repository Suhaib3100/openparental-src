package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import java.util.Arrays;

/* compiled from: ByFunctionOrdering.java */
@w0
@d9.b(serializable = true)
/* loaded from: classes6.dex */
final class y<F, T> extends e5<F> implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    private static final long f56638f = 0;

    /* renamed from: d, reason: collision with root package name */
    final com.google.common.base.x<F, ? extends T> f56639d;

    /* renamed from: e, reason: collision with root package name */
    final e5<T> f56640e;

    y(com.google.common.base.x<F, ? extends T> xVar, e5<T> e5Var) {
        xVar.getClass();
        this.f56639d = xVar;
        e5Var.getClass();
        this.f56640e = e5Var;
    }

    @Override // com.google.common.collect.e5, java.util.Comparator
    public int compare(@f5 F f4, @f5 F f5) {
        return this.f56640e.compare(this.f56639d.apply(f4), this.f56639d.apply(f5));
    }

    @Override // java.util.Comparator
    public boolean equals(@zc.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f56639d.equals(yVar.f56639d) && this.f56640e.equals(yVar.f56640e);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f56639d, this.f56640e});
    }

    public String toString() {
        String valueOf = String.valueOf(this.f56640e);
        String valueOf2 = String.valueOf(this.f56639d);
        return com.google.common.base.e.a(valueOf2.length() + valueOf.length() + 13, valueOf, ProtectedSandApp.s("\uf585"), valueOf2, ProtectedSandApp.s("\uf586"));
    }
}
