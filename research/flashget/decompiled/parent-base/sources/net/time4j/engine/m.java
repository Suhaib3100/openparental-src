package net.time4j.engine;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import net.time4j.engine.m;

/* compiled from: CalendarVariant.java */
/* loaded from: classes7.dex */
public abstract class m<D extends m<D>> extends r<D> implements h, q0, Comparable<D>, Serializable {
    private <T> T X(l<T> lVar, String str) {
        long b5 = b();
        if (lVar.g() > b5 || lVar.d() < b5) {
            throw new ArithmeticException(com.cby.txliteav.live.impl.tx.f.a(ProtectedSandApp.s("諈\u0001"), b5, ProtectedSandApp.s("諉\u0001"), str));
        }
        return lVar.e(b5);
    }

    @Override // net.time4j.engine.r
    <V> a0<D, V> B(q<V> qVar) {
        return qVar instanceof b0 ? ((b0) b0.class.cast(qVar)).derive(Q()) : super.B(qVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public int compareTo(D d5) {
        long b5 = b();
        long b6 = d5.b();
        if (b5 < b6) {
            return -1;
        }
        if (b5 > b6) {
            return 1;
        }
        return getVariant().compareTo(d5.getVariant());
    }

    protected l<D> Q() {
        return y().z(getVariant());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.r
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public abstract k<D> y();

    @Override // net.time4j.engine.i0
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public boolean s(h hVar) {
        return b() > hVar.b();
    }

    @Override // net.time4j.engine.i0
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public boolean f(h hVar) {
        return b() < hVar.b();
    }

    @Override // net.time4j.engine.i0
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public boolean k(h hVar) {
        return b() == hVar.b();
    }

    public D V(i iVar) {
        return W(i.i(net.time4j.base.c.k(iVar.d())));
    }

    public D W(i iVar) {
        long f4 = net.time4j.base.c.f(b(), iVar.d());
        try {
            return Q().e(f4);
        } catch (IllegalArgumentException e4) {
            ArithmeticException arithmeticException = new ArithmeticException(androidx.collection.p0.a(ProtectedSandApp.s("諊\u0001"), f4));
            arithmeticException.initCause(e4);
            throw arithmeticException;
        }
    }

    public <T extends m<T>> T Y(Class<T> cls, String str) {
        String name = cls.getName();
        x N = x.N(cls);
        if (N != null) {
            return (T) X(N.z(str), name);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("請\u0001").concat(name));
    }

    public <T extends m<T>> T Z(Class<T> cls, q0 q0Var) {
        return (T) Y(cls, q0Var.getVariant());
    }

    public <T extends n<?, T>> T a0(Class<T> cls) {
        String name = cls.getName();
        x N = x.N(cls);
        if (N != null) {
            return (T) X(N.y(), name);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("請\u0001").concat(name));
    }

    public long b() {
        return Q().f(z());
    }

    public D b0(String str) {
        return str.equals(getVariant()) ? (D) z() : (D) Y(y().C(), str);
    }

    public D c0(q0 q0Var) {
        return b0(q0Var.getVariant());
    }

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract String toString();
}
