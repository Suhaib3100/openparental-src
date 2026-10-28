package net.time4j.format.expert;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Set;
import net.time4j.format.expert.x;

/* compiled from: ParsedEntity.java */
/* loaded from: classes7.dex */
abstract class x<T extends x<T>> extends net.time4j.engine.r<T> {
    x() {
    }

    @Override // net.time4j.engine.r
    public <V> boolean G(net.time4j.engine.q<V> qVar, V v4) {
        if (qVar != null) {
            return true;
        }
        throw new NullPointerException(ProtectedSandApp.s("镭\u0001"));
    }

    abstract <E> E P();

    abstract void Q(net.time4j.engine.q<?> qVar, int i4);

    abstract void R(net.time4j.engine.q<?> qVar, Object obj);

    abstract void S(Object obj);

    @Override // net.time4j.engine.r
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public T K(net.time4j.engine.q<Integer> qVar, int i4) {
        Q(qVar, i4);
        return this;
    }

    @Override // net.time4j.engine.r
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public <V> T M(net.time4j.engine.q<V> qVar, V v4) {
        R(qVar, v4);
        return this;
    }

    @Override // net.time4j.engine.r, net.time4j.engine.p
    public final boolean e() {
        return w(f0.TIMEZONE_ID) || w(f0.TIMEZONE_OFFSET);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        Set<net.time4j.engine.q<?>> A = A();
        Set<net.time4j.engine.q<?>> A2 = xVar.A();
        if (A.size() != A2.size()) {
            return false;
        }
        for (net.time4j.engine.q<?> qVar : A) {
            if (!A2.contains(qVar) || !r(qVar).equals(xVar.r(qVar))) {
                return false;
            }
        }
        Object P = P();
        Object P2 = xVar.P();
        return P == null ? P2 == null : P.equals(P2);
    }

    @Override // net.time4j.engine.r, net.time4j.engine.p
    public <V> V g(net.time4j.engine.q<V> qVar) {
        return qVar.getDefaultMaximum();
    }

    public final int hashCode() {
        int hashCode = A().hashCode();
        Object P = P();
        return P != null ? hashCode + (P.hashCode() * 31) : hashCode;
    }

    @Override // net.time4j.engine.r, net.time4j.engine.p
    public <V> V i(net.time4j.engine.q<V> qVar) {
        return qVar.getDefaultMinimum();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append('{');
        boolean z4 = true;
        for (net.time4j.engine.q<?> qVar : A()) {
            if (z4) {
                z4 = false;
            } else {
                sb.append(ProtectedSandApp.s("镮\u0001"));
            }
            sb.append(qVar.name());
            sb.append('=');
            sb.append(r(qVar));
        }
        sb.append('}');
        Object P = P();
        if (P != null) {
            sb.append(ProtectedSandApp.s("镯\u0001"));
            sb.append(P);
        }
        return sb.toString();
    }

    @Override // net.time4j.engine.r, net.time4j.engine.p
    public final net.time4j.tz.k v() {
        Object r4;
        f0 f0Var = f0.TIMEZONE_ID;
        if (w(f0Var)) {
            r4 = r(f0Var);
        } else {
            f0 f0Var2 = f0.TIMEZONE_OFFSET;
            r4 = w(f0Var2) ? r(f0Var2) : null;
        }
        return r4 instanceof net.time4j.tz.k ? (net.time4j.tz.k) net.time4j.tz.k.class.cast(r4) : super.v();
    }

    @Override // net.time4j.engine.r
    protected final net.time4j.engine.x<T> y() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("镰\u0001"));
    }
}
