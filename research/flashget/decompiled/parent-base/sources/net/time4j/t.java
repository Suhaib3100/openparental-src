package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: FullValueOperator.java */
/* loaded from: classes7.dex */
final class t extends q<m0> {
    static final t C = new t(13);
    static final t D = new t(14);
    static final t E = new t(15);
    static final t F = new t(16);
    private final net.time4j.engine.v<n0> B;

    /* compiled from: FullValueOperator.java */
    class a implements net.time4j.engine.v<n0> {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n0 apply(n0 n0Var) {
            m0 k4 = t.this.k(n0Var.m0());
            return k4.u() == 24 ? n0.B0((l0) n0Var.k0().W(1L, h.DAYS), m0.f83366q) : n0Var.L0(k4);
        }
    }

    private t(int i4) {
        super(m0.f83369t, i4);
        this.B = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public m0 k(m0 m0Var) {
        int u4 = m0Var.u();
        int m4 = m0Var.m();
        int i4 = 0;
        switch (d()) {
            case 13:
                if (m4 >= 30 && (u4 = u4 + 1) == 25) {
                    u4 = 1;
                }
                return m0.a1(u4);
            case 14:
                if (m0Var.h() >= 30) {
                    if (u4 == 24) {
                        u4 = 0;
                        m4 = 1;
                    } else {
                        m4++;
                        if (m4 == 60) {
                            u4++;
                            m4 = 0;
                        }
                    }
                }
                return m0.b1(u4, m4);
            case 15:
                int i5 = u4 + 1;
                return m0.a1(i5 != 25 ? i5 : 1);
            case 16:
                if (u4 == 24) {
                    u4 = 0;
                    i4 = 1;
                } else {
                    int i6 = m4 + 1;
                    if (i6 == 60) {
                        u4++;
                    } else {
                        i4 = i6;
                    }
                }
                return m0.b1(u4, i4);
            default:
                throw new AssertionError(ProtectedSandApp.s("顩\u0001") + d());
        }
    }

    @Override // net.time4j.engine.v
    public Object apply(Object obj) {
        return k((m0) obj);
    }

    @Override // net.time4j.q
    net.time4j.engine.v<n0> h() {
        return this.B;
    }

    public m0 j(m0 m0Var) {
        return k(m0Var);
    }
}
