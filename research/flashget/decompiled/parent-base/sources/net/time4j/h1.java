package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ObjectStreamException;
import net.time4j.engine.ChronoException;

/* compiled from: WeekdayInMonthElement.java */
/* loaded from: classes7.dex */
final class h1 extends net.time4j.a<Integer> implements j0 {

    /* renamed from: e, reason: collision with root package name */
    static final h1 f83140e = new h1();

    /* renamed from: f, reason: collision with root package name */
    private static final int f83141f = 5;
    private static final long serialVersionUID = -2378018589067147278L;

    /* compiled from: WeekdayInMonthElement.java */
    private static class a extends q<l0> {
        private final long B;
        private final g1 C;
        private final net.time4j.engine.v<n0> D;

        /* compiled from: WeekdayInMonthElement.java */
        /* renamed from: net.time4j.h1$a$a, reason: collision with other inner class name */
        class C1298a implements net.time4j.engine.v<n0> {
            C1298a() {
            }

            @Override // net.time4j.engine.v
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public n0 apply(n0 n0Var) {
                return (n0) a.this.k(n0Var);
            }
        }

        a(int i4, g1 g1Var) {
            super(h1.f83140e, 7);
            if (g1Var == null) {
                throw new NullPointerException(ProtectedSandApp.s("阞\u0001"));
            }
            this.B = i4;
            this.C = g1Var;
            this.D = new C1298a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public <T extends net.time4j.engine.r<T>> T k(T t4) {
            long a5;
            net.time4j.engine.q<l0> qVar = l0.f83325p;
            if (!t4.w(qVar)) {
                throw new ChronoException(ProtectedSandApp.s("队\u0001") + t4);
            }
            l0 l0Var = (l0) t4.r(qVar);
            int value = this.C.getValue() - ((g1) l0Var.r(l0.f83333x)).getValue();
            int t5 = l0Var.t() + value;
            long j4 = this.B;
            if (j4 == 5) {
                a5 = ((5 - (net.time4j.base.c.a(t5 - 1, 7) + 1)) * 7) + value;
                if (l0Var.t() + a5 > net.time4j.base.b.d(l0Var.o(), l0Var.q())) {
                    a5 -= 7;
                }
            } else {
                a5 = ((j4 - (net.time4j.base.c.a(t5 - 1, 7) + 1)) * 7) + value;
            }
            return (T) t4.M(qVar, (l0) l0Var.W(a5, h.DAYS));
        }

        @Override // net.time4j.q
        net.time4j.engine.v<n0> h() {
            return this.D;
        }

        @Override // net.time4j.engine.v
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public l0 apply(l0 l0Var) {
            return (l0) k(l0Var);
        }
    }

    private h1() {
        super(ProtectedSandApp.s("阠\u0001"));
    }

    private q<l0> D(int i4, g1 g1Var) {
        return new a(i4, g1Var);
    }

    private Object readResolve() throws ObjectStreamException {
        return f83140e;
    }

    public Integer B() {
        return 5;
    }

    public Integer C() {
        return 1;
    }

    @Override // net.time4j.j0
    public q<l0> U(g1 g1Var) {
        return new a(4, g1Var);
    }

    @Override // net.time4j.engine.q
    public Object getDefaultMaximum() {
        return 5;
    }

    @Override // net.time4j.engine.q
    public Object getDefaultMinimum() {
        return 1;
    }

    @Override // net.time4j.engine.e, net.time4j.engine.q
    public char getSymbol() {
        return 'F';
    }

    @Override // net.time4j.engine.q
    public Class<Integer> getType() {
        return Integer.class;
    }

    @Override // net.time4j.j0
    public q<l0> i(g1 g1Var) {
        return new a(5, g1Var);
    }

    @Override // net.time4j.engine.q
    public boolean isDateElement() {
        return true;
    }

    @Override // net.time4j.engine.q
    public boolean isTimeElement() {
        return false;
    }

    @Override // net.time4j.j0
    public q<l0> k0(g1 g1Var) {
        return new a(3, g1Var);
    }

    @Override // net.time4j.j0
    public q<l0> m(g1 g1Var) {
        return new a(1, g1Var);
    }

    @Override // net.time4j.engine.e
    protected boolean u() {
        return true;
    }

    @Override // net.time4j.j0
    public q<l0> v(g1 g1Var) {
        return new a(2, g1Var);
    }
}
