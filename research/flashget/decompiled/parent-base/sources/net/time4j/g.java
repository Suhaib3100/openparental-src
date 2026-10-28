package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: CalendarOperator.java */
/* loaded from: classes7.dex */
final class g extends q<l0> {
    static final g C = new g(17);
    static final g D = new g(18);
    static final g E = new g(19);
    static final g F = new g(20);
    static final g G = new g(21);
    static final g H = new g(22);
    private final net.time4j.engine.v<n0> B;

    /* compiled from: CalendarOperator.java */
    class a implements net.time4j.engine.v<n0> {
        a() {
        }

        @Override // net.time4j.engine.v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n0 apply(n0 n0Var) {
            return n0Var.K0(g.this.k(n0Var.k0()));
        }
    }

    private g(int i4) {
        super(l0.f83326q, i4);
        this.B = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public l0 k(l0 l0Var) {
        int o4 = l0Var.o();
        int q4 = l0Var.q();
        int i4 = 12;
        switch (d()) {
            case 17:
                int i5 = q4 + 1;
                if (i5 >= 13) {
                    o4++;
                    i5 = 1;
                }
                return l0.r1(o4, i5, 1);
            case 18:
                s0 quarterOfYear = e0.valueOf(q4).getQuarterOfYear();
                int value = e0.atStartOfQuarterYear(quarterOfYear.next()).getValue();
                if (quarterOfYear == s0.Q4) {
                    o4++;
                }
                return l0.r1(o4, value, 1);
            case 19:
                return l0.r1(o4 + 1, 1, 1);
            case 20:
                int i6 = q4 - 1;
                if (i6 <= 0) {
                    o4--;
                } else {
                    i4 = i6;
                }
                return l0.r1(o4, i4, net.time4j.base.b.d(o4, i4));
            case 21:
                s0 previous = e0.valueOf(q4).getQuarterOfYear().previous();
                int value2 = e0.atEndOfQuarterYear(previous).getValue();
                return previous == s0.Q4 ? l0.r1(o4 - 1, value2, 31) : previous == s0.Q1 ? l0.r1(o4, value2, 31) : l0.r1(o4, value2, 30);
            case 22:
                return l0.r1(o4 - 1, 12, 31);
            default:
                throw new AssertionError(ProtectedSandApp.s("阍\u0001") + d());
        }
    }

    @Override // net.time4j.engine.v
    public Object apply(Object obj) {
        return k((l0) obj);
    }

    @Override // net.time4j.q
    net.time4j.engine.v<n0> h() {
        return this.B;
    }

    public l0 j(l0 l0Var) {
        return k(l0Var);
    }
}
