package net.time4j.engine;

import com.flashget.parentalcontrol.ProtectedSandApp;
import net.time4j.engine.n;

/* compiled from: Calendrical.java */
/* loaded from: classes7.dex */
public abstract class n<U, D extends n<U, D>> extends m0<U, D> implements h {
    private l<D> c0() {
        return y().y();
    }

    private <T> T i0(l<T> lVar, String str) {
        long b5 = b();
        if (lVar.g() > b5 || lVar.d() < b5) {
            throw new ArithmeticException(com.cby.txliteav.live.impl.tx.f.a(ProtectedSandApp.s("訩\u0001"), b5, ProtectedSandApp.s("訪\u0001"), str));
        }
        return lVar.e(b5);
    }

    protected int a0(h hVar) {
        long b5 = b();
        long b6 = hVar.b();
        if (b5 < b6) {
            return -1;
        }
        return b5 == b6 ? 0 : 1;
    }

    public long b() {
        return c0().f(z());
    }

    @Override // net.time4j.engine.m0, java.lang.Comparable
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public int compareTo(D d5) {
        if (y().C() == d5.y().C()) {
            return a0(d5);
        }
        throw new ClassCastException(ProtectedSandApp.s("訫\u0001"));
    }

    @Override // net.time4j.engine.i0
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public boolean s(h hVar) {
        return a0(hVar) > 0;
    }

    @Override // net.time4j.engine.i0
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public boolean f(h hVar) {
        return a0(hVar) < 0;
    }

    @Override // net.time4j.engine.m0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return y().C() == nVar.y().C() && b() == nVar.b();
    }

    @Override // net.time4j.engine.i0
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public boolean k(h hVar) {
        return this == hVar || a0(hVar) == 0;
    }

    public D g0(i iVar) {
        return h0(i.i(net.time4j.base.c.k(iVar.d())));
    }

    public D h0(i iVar) {
        long f4 = net.time4j.base.c.f(b(), iVar.d());
        try {
            return c0().e(f4);
        } catch (IllegalArgumentException e4) {
            ArithmeticException arithmeticException = new ArithmeticException(androidx.collection.p0.a(ProtectedSandApp.s("訬\u0001"), f4));
            arithmeticException.initCause(e4);
            throw arithmeticException;
        }
    }

    @Override // net.time4j.engine.m0
    public int hashCode() {
        long b5 = b();
        return (int) (b5 ^ (b5 >>> 32));
    }

    public <T extends m<T>> T j0(Class<T> cls, String str) {
        String name = cls.getName();
        x N = x.N(cls);
        if (N != null) {
            return (T) i0(N.z(str), name);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("設\u0001").concat(name));
    }

    public <T extends m<T>> T k0(Class<T> cls, q0 q0Var) {
        return (T) j0(cls, q0Var.getVariant());
    }

    public <T extends n<?, T>> T l0(Class<T> cls) {
        String name = cls.getName();
        x N = x.N(cls);
        if (N != null) {
            return (T) i0(N.y(), name);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("設\u0001").concat(name));
    }
}
