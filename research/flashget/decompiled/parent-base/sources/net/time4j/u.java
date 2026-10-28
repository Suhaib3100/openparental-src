package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;
import net.time4j.engine.ChronoException;
import net.time4j.m0;

/* compiled from: GeneralTimestamp.java */
/* loaded from: classes7.dex */
public final class u<C> implements net.time4j.engine.p, net.time4j.engine.q0 {

    /* renamed from: b, reason: collision with root package name */
    private final net.time4j.engine.m<?> f83669b;

    /* renamed from: c, reason: collision with root package name */
    private final net.time4j.engine.n<?, ?> f83670c;

    /* renamed from: d, reason: collision with root package name */
    private final m0 f83671d;

    /* JADX WARN: Type inference failed for: r3v1, types: [net.time4j.engine.m, net.time4j.engine.m<?>] */
    /* JADX WARN: Type inference failed for: r3v4, types: [net.time4j.engine.n, net.time4j.engine.n<?, ?>] */
    private u(net.time4j.engine.m<?> mVar, net.time4j.engine.n<?, ?> nVar, m0 m0Var) {
        if (m0Var.u() != 24) {
            this.f83669b = mVar;
            this.f83670c = nVar;
            this.f83671d = m0Var;
        } else {
            if (mVar == null) {
                this.f83669b = null;
                this.f83670c = nVar.h0(net.time4j.engine.i.i(1L));
            } else {
                this.f83669b = mVar.W(net.time4j.engine.i.i(1L));
                this.f83670c = null;
            }
            this.f83671d = m0.f83366q;
        }
    }

    /* JADX WARN: Incorrect types in method signature: <C:Lnet/time4j/engine/m<TC;>;>(TC;Lnet/time4j/m0;)Lnet/time4j/u<TC;>; */
    public static u f(net.time4j.engine.m mVar, m0 m0Var) {
        if (mVar != null) {
            return new u(mVar, null, m0Var);
        }
        throw new NullPointerException(ProtectedSandApp.s("鸀\u0001"));
    }

    /* JADX WARN: Incorrect types in method signature: <C:Lnet/time4j/engine/n<*TC;>;>(TC;Lnet/time4j/m0;)Lnet/time4j/u<TC;>; */
    public static u h(net.time4j.engine.n nVar, m0 m0Var) {
        if (nVar != null) {
            return new u(null, nVar, m0Var);
        }
        throw new NullPointerException(ProtectedSandApp.s("鸀\u0001"));
    }

    private net.time4j.engine.p n() {
        net.time4j.engine.m<?> mVar = this.f83669b;
        return mVar == null ? this.f83670c : mVar;
    }

    public d0 a(net.time4j.tz.p pVar, net.time4j.engine.g0 g0Var) {
        n0 B0;
        net.time4j.engine.m<?> mVar = this.f83669b;
        if (mVar == null) {
            l0 l0Var = (l0) this.f83670c.l0(l0.class);
            m0 m0Var = this.f83671d;
            l0Var.getClass();
            B0 = n0.B0(l0Var, m0Var);
        } else {
            l0 l0Var2 = (l0) mVar.a0(l0.class);
            m0 m0Var2 = this.f83671d;
            l0Var2.getClass();
            B0 = n0.B0(l0Var2, m0Var2);
        }
        int intValue = ((Integer) this.f83671d.r(m0.D)).intValue() - g0Var.c(B0.k0(), pVar);
        if (intValue >= 86400) {
            B0 = B0.U(1L, h.DAYS);
        } else if (intValue < 0) {
            B0 = B0.W(1L, h.DAYS);
        }
        return B0.e0(pVar);
    }

    public d0 b(net.time4j.tz.l lVar, net.time4j.engine.g0 g0Var) {
        n0 B0;
        net.time4j.engine.m<?> mVar = this.f83669b;
        if (mVar == null) {
            l0 l0Var = (l0) this.f83670c.l0(l0.class);
            m0 m0Var = this.f83671d;
            l0Var.getClass();
            B0 = n0.B0(l0Var, m0Var);
        } else {
            l0 l0Var2 = (l0) mVar.a0(l0.class);
            m0 m0Var2 = this.f83671d;
            l0Var2.getClass();
            B0 = n0.B0(l0Var2, m0Var2);
        }
        int intValue = ((Integer) this.f83671d.r(m0.D)).intValue() - g0Var.c(B0.k0(), lVar.G());
        if (intValue >= 86400) {
            B0 = B0.U(1L, h.DAYS);
        } else if (intValue < 0) {
            B0 = B0.W(1L, h.DAYS);
        }
        return B0.n0(lVar);
    }

    public u<C> c(long j4, j jVar) {
        return j(net.time4j.base.c.k(j4), jVar);
    }

    public u<C> d(net.time4j.engine.i iVar) {
        return k(iVar.e());
    }

    @Override // net.time4j.engine.p
    public boolean e() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) u.class.cast(obj);
        if (!this.f83671d.equals(uVar.f83671d)) {
            return false;
        }
        net.time4j.engine.m<?> mVar = this.f83669b;
        return mVar == null ? uVar.f83669b == null && this.f83670c.equals(uVar.f83670c) : uVar.f83670c == null && mVar.equals(uVar.f83669b);
    }

    @Override // net.time4j.engine.p
    public <V> V g(net.time4j.engine.q<V> qVar) {
        return qVar.isDateElement() ? (V) n().g(qVar) : (V) this.f83671d.g(qVar);
    }

    @Override // net.time4j.engine.q0
    public String getVariant() {
        net.time4j.engine.m<?> mVar = this.f83669b;
        return mVar == null ? "" : mVar.getVariant();
    }

    public int hashCode() {
        net.time4j.engine.m<?> mVar = this.f83669b;
        return this.f83671d.hashCode() + (mVar == null ? this.f83670c.hashCode() : mVar.hashCode());
    }

    @Override // net.time4j.engine.p
    public <V> V i(net.time4j.engine.q<V> qVar) {
        return qVar.isDateElement() ? (V) n().i(qVar) : (V) this.f83671d.i(qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [net.time4j.engine.m] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    public u<C> j(long j4, j jVar) {
        m0 m0Var = this.f83671d;
        m0Var.getClass();
        m e4 = m0.c.e(m0Var, j4, jVar);
        net.time4j.engine.i i4 = net.time4j.engine.i.i(e4.a());
        net.time4j.engine.m<?> mVar = this.f83669b;
        ?? W = mVar == null ? 0 : mVar.W(i4);
        net.time4j.engine.n<?, ?> nVar = this.f83670c;
        return new u<>(W, nVar != null ? nVar.h0(i4) : null, e4.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [net.time4j.engine.m] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public u<C> k(net.time4j.engine.i iVar) {
        net.time4j.engine.m<?> mVar = this.f83669b;
        ?? W = mVar == null ? 0 : mVar.W(iVar);
        net.time4j.engine.n<?, ?> nVar = this.f83670c;
        return new u<>(W, nVar != null ? nVar.h0(iVar) : null, this.f83671d);
    }

    @Override // net.time4j.engine.p
    public int l(net.time4j.engine.q<Integer> qVar) {
        return qVar.isDateElement() ? n().l(qVar) : this.f83671d.l(qVar);
    }

    public C m() {
        C c5 = (C) this.f83669b;
        return c5 == null ? (C) this.f83670c : c5;
    }

    public m0 o() {
        return this.f83671d;
    }

    @Override // net.time4j.engine.p
    public <V> V r(net.time4j.engine.q<V> qVar) {
        return qVar.isDateElement() ? (V) n().r(qVar) : (V) this.f83671d.r(qVar);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        net.time4j.engine.m<?> mVar = this.f83669b;
        if (mVar == null) {
            sb.append(this.f83670c);
        } else {
            sb.append(mVar);
        }
        sb.append(this.f83671d);
        return sb.toString();
    }

    @Override // net.time4j.engine.p
    public net.time4j.tz.k v() {
        throw new ChronoException(ProtectedSandApp.s("鸁\u0001") + this);
    }

    @Override // net.time4j.engine.p
    public boolean w(net.time4j.engine.q<?> qVar) {
        return qVar.isDateElement() ? n().w(qVar) : this.f83671d.w(qVar);
    }
}
