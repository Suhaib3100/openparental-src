package net.time4j.engine;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Set;
import net.time4j.engine.r;

/* compiled from: ChronoEntity.java */
/* loaded from: classes7.dex */
public abstract class r<T extends r<T>> implements p {
    public Set<q<?>> A() {
        return y().H();
    }

    <V> a0<T, V> B(q<V> qVar) {
        return y().I(qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean C(q<Integer> qVar, int i4) {
        e0<T> F = y().F(qVar);
        return F != null ? F.e(z(), i4) : G(qVar, Integer.valueOf(i4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean E(q<Long> qVar, long j4) {
        return G(qVar, Long.valueOf(j4));
    }

    public <V> boolean G(q<V> qVar, V v4) {
        if (qVar != null) {
            return w(qVar) && B(qVar).j(z(), v4);
        }
        throw new NullPointerException(ProtectedSandApp.s("訥\u0001"));
    }

    public boolean J(o<? super T> oVar) {
        return oVar.test(z());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T K(q<Integer> qVar, int i4) {
        e0<T> F = y().F(qVar);
        return F != null ? F.a(z(), i4, qVar.isLenient()) : M(qVar, Integer.valueOf(i4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T L(q<Long> qVar, long j4) {
        return M(qVar, Long.valueOf(j4));
    }

    public <V> T M(q<V> qVar, V v4) {
        return B(qVar).withValue(z(), v4, qVar.isLenient());
    }

    public T N(v<T> vVar) {
        return vVar.apply(z());
    }

    @Override // net.time4j.engine.p
    public boolean e() {
        return false;
    }

    @Override // net.time4j.engine.p
    public <V> V g(q<V> qVar) {
        return B(qVar).getMaximum(z());
    }

    @Override // net.time4j.engine.p
    public <V> V i(q<V> qVar) {
        return B(qVar).getMinimum(z());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // net.time4j.engine.p
    public int l(q<Integer> qVar) {
        e0<T> F = y().F(qVar);
        try {
            return F == null ? ((Integer) r(qVar)).intValue() : F.d(z());
        } catch (ChronoException unused) {
            return Integer.MIN_VALUE;
        }
    }

    @Override // net.time4j.engine.p
    public <V> V r(q<V> qVar) {
        return B(qVar).getValue(z());
    }

    @Override // net.time4j.engine.p
    public net.time4j.tz.k v() {
        throw new ChronoException(ProtectedSandApp.s("訦\u0001") + this);
    }

    @Override // net.time4j.engine.p
    public boolean w(q<?> qVar) {
        return y().M(qVar);
    }

    public final <R> R x(t<? super T, R> tVar) {
        return tVar.apply(z());
    }

    protected abstract x<T> y();

    protected T z() {
        x<T> y4 = y();
        Class<T> C = y4.C();
        if (C.isInstance(this)) {
            return C.cast(this);
        }
        for (q<?> qVar : y4.H()) {
            if (C == qVar.getType()) {
                return C.cast(r(qVar));
            }
        }
        throw new IllegalStateException(ProtectedSandApp.s("訧\u0001"));
    }
}
