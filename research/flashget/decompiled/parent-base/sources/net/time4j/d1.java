package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: WallTimeOperator.java */
/* loaded from: classes7.dex */
final class d1 extends q<n0> {
    private final int B;
    private final m0 C;

    d1(int i4, m0 m0Var) {
        super(m0.f83369t, i4);
        if (m0Var == null) {
            throw new NullPointerException(ProtectedSandApp.s("鋈\u0001"));
        }
        this.B = i4;
        this.C = m0Var;
    }

    private n0 j(n0 n0Var) {
        switch (this.B) {
            case 9:
            case 11:
                return n0Var.W(1L, h.DAYS).L0(this.C);
            case 10:
            case 12:
                return n0Var.L0(this.C);
            default:
                throw new AssertionError(ProtectedSandApp.s("鋉\u0001") + this.B);
        }
    }

    private n0 k(n0 n0Var) {
        switch (this.B) {
            case 9:
            case 11:
                return n0Var.L0(this.C);
            case 10:
            case 12:
                return n0Var.U(1L, h.DAYS).L0(this.C);
            default:
                throw new AssertionError(ProtectedSandApp.s("鋉\u0001") + this.B);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private n0 l(n0 n0Var) {
        l0 k02 = n0Var.k0();
        switch (this.B) {
            case 9:
            case 11:
                l0 l0Var = (l0) k02.W(1L, h.DAYS);
                l0Var.getClass();
                return n0.B0(l0Var, m0.f83366q);
            case 10:
            case 12:
                k02.getClass();
                return n0.B0(k02, m0.f83366q);
            default:
                throw new AssertionError(ProtectedSandApp.s("鋉\u0001") + this.B);
        }
    }

    private n0 m(n0 n0Var) {
        switch (this.B) {
            case 9:
                return n0Var.W(1L, h.DAYS);
            case 10:
                return n0Var.U(1L, h.DAYS);
            case 11:
            case 12:
                return n0Var;
            default:
                throw new AssertionError(ProtectedSandApp.s("鋉\u0001") + this.B);
        }
    }

    @Override // net.time4j.q
    net.time4j.engine.v<n0> h() {
        return this;
    }

    @Override // net.time4j.engine.v
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public n0 apply(n0 n0Var) {
        m0 m02 = n0Var.m0();
        return this.C.k(m02) ? m(n0Var) : this.C.u() == 24 ? l(n0Var) : this.C.s(m02) ? k(n0Var) : j(n0Var);
    }
}
