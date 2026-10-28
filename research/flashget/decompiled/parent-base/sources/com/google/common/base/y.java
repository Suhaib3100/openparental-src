package com.google.common.base;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import java.util.Arrays;

/* compiled from: FunctionalEquivalence.java */
@d9.a
@o
@d9.b
/* loaded from: classes6.dex */
final class y<F, T> extends q<F> implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    private static final long f55075d = 0;

    /* renamed from: b, reason: collision with root package name */
    private final x<? super F, ? extends T> f55076b;

    /* renamed from: c, reason: collision with root package name */
    private final q<T> f55077c;

    y(x<? super F, ? extends T> xVar, q<T> qVar) {
        xVar.getClass();
        this.f55076b = xVar;
        qVar.getClass();
        this.f55077c = qVar;
    }

    @Override // com.google.common.base.q
    protected boolean a(F f4, F f5) {
        return this.f55077c.d(this.f55076b.apply(f4), this.f55076b.apply(f5));
    }

    @Override // com.google.common.base.q
    protected int b(F f4) {
        return this.f55077c.f(this.f55076b.apply(f4));
    }

    public boolean equals(@zc.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f55076b.equals(yVar.f55076b) && this.f55077c.equals(yVar.f55077c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f55076b, this.f55077c});
    }

    public String toString() {
        String valueOf = String.valueOf(this.f55077c);
        String valueOf2 = String.valueOf(this.f55076b);
        return e.a(valueOf2.length() + valueOf.length() + 13, valueOf, ProtectedSandApp.s("\uf3b9"), valueOf2, ProtectedSandApp.s("\uf3ba"));
    }
}
