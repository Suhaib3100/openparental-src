package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import net.time4j.engine.h;
import net.time4j.engine.r;
import net.time4j.g1;

/* compiled from: WeekdayInMonthElement.java */
/* loaded from: classes7.dex */
final class r0<T extends net.time4j.engine.r<T> & net.time4j.engine.h> extends net.time4j.calendar.service.j<T> implements g0<T> {

    /* renamed from: k, reason: collision with root package name */
    private static final int f82621k = Integer.MAX_VALUE;
    private static final long serialVersionUID = 4275169663905222176L;

    /* renamed from: i, reason: collision with root package name */
    private final transient net.time4j.engine.q<Integer> f82622i;

    /* renamed from: j, reason: collision with root package name */
    private final transient net.time4j.engine.q<g1> f82623j;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WeekdayInMonthElement.java */
    static class a<T extends net.time4j.engine.r<T> & net.time4j.engine.h> implements net.time4j.engine.e0<T> {

        /* renamed from: b, reason: collision with root package name */
        private final r0<T> f82624b;

        a(r0<T> r0Var) {
            this.f82624b = r0Var;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)I */
        private int g(net.time4j.engine.r rVar) {
            int l4 = rVar.l(((r0) this.f82624b).f82622i);
            while (true) {
                int i4 = l4 + 7;
                if (i4 > ((Integer) rVar.g(((r0) this.f82624b).f82622i)).intValue()) {
                    return net.time4j.base.c.a(l4 - 1, 7) + 1;
                }
                l4 = i4;
            }
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Lnet/time4j/engine/q<*>; */
        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q getChildAtCeiling(net.time4j.engine.r rVar) {
            return null;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Lnet/time4j/engine/q<*>; */
        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q getChildAtFloor(net.time4j.engine.r rVar) {
            return null;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)I */
        @Override // net.time4j.engine.e0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public int d(net.time4j.engine.r rVar) {
            return net.time4j.base.c.a(rVar.l(((r0) this.f82624b).f82622i) - 1, 7) + 1;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Integer; */
        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(net.time4j.engine.r rVar) {
            return Integer.valueOf(g(rVar));
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Integer; */
        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(net.time4j.engine.r rVar) {
            return 1;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Integer; */
        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer getValue(net.time4j.engine.r rVar) {
            return Integer.valueOf(d(rVar));
        }

        /* JADX WARN: Incorrect types in method signature: (TT;I)Z */
        @Override // net.time4j.engine.e0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean e(net.time4j.engine.r rVar, int i4) {
            return i4 >= 1 && i4 <= g(rVar);
        }

        /* JADX WARN: Incorrect types in method signature: (TT;Ljava/lang/Integer;)Z */
        @Override // net.time4j.engine.a0
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public boolean j(net.time4j.engine.r rVar, Integer num) {
            return num != null && e(rVar, num.intValue());
        }

        /* JADX WARN: Incorrect return type in method signature: (TT;IZ)TT; */
        @Override // net.time4j.engine.e0
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.r a(net.time4j.engine.r rVar, int i4, boolean z4) {
            if (!e(rVar, i4)) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鈊\u0001"), i4));
            }
            g1 g1Var = (g1) rVar.r(((r0) this.f82624b).f82623j);
            r0<T> r0Var = this.f82624b;
            r0Var.getClass();
            return rVar.N(new b(r0Var, i4, g1Var));
        }

        /* JADX WARN: Incorrect return type in method signature: (TT;Ljava/lang/Integer;Z)TT; */
        @Override // net.time4j.engine.a0
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.r withValue(net.time4j.engine.r rVar, Integer num, boolean z4) {
            if (num != null) {
                return a(rVar, num.intValue(), z4);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("鈋\u0001"));
        }
    }

    /* compiled from: WeekdayInMonthElement.java */
    private static class b<T extends net.time4j.engine.r<T> & net.time4j.engine.h> implements net.time4j.engine.v<T> {

        /* renamed from: b, reason: collision with root package name */
        private final r0<T> f82625b;

        /* renamed from: c, reason: collision with root package name */
        private final long f82626c;

        /* renamed from: d, reason: collision with root package name */
        private final g1 f82627d;

        b(r0<T> r0Var, int i4, g1 g1Var) {
            if (g1Var == null) {
                throw new NullPointerException(ProtectedSandApp.s("鈌\u0001"));
            }
            this.f82625b = r0Var;
            this.f82626c = i4;
            this.f82627d = g1Var;
        }

        /* JADX WARN: Incorrect return type in method signature: (TT;)TT; */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.r apply(net.time4j.engine.r rVar) {
            long a5;
            g1 g1Var = (g1) rVar.r(((r0) this.f82625b).f82623j);
            int l4 = rVar.l(((r0) this.f82625b).f82622i);
            if (this.f82626c == 2147483647L) {
                int intValue = ((Integer) rVar.g(((r0) this.f82625b).f82622i)).intValue() - l4;
                int value = (intValue % 7) + g1Var.getValue();
                if (value > 7) {
                    value -= 7;
                }
                int value2 = this.f82627d.getValue() - value;
                a5 = intValue + value2;
                if (value2 > 0) {
                    a5 -= 7;
                }
            } else {
                a5 = ((this.f82626c - (net.time4j.base.c.a((l4 + r2) - 1, 7) + 1)) * 7) + (this.f82627d.getValue() - g1Var.getValue());
            }
            return rVar.L(net.time4j.engine.b0.UTC, ((net.time4j.engine.h) rVar).b() + a5);
        }
    }

    /* compiled from: WeekdayInMonthElement.java */
    private static class c<T extends net.time4j.engine.r<T>> implements net.time4j.engine.v<T> {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f82628b;

        c(boolean z4) {
            this.f82628b = z4;
        }

        @Override // net.time4j.engine.v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public T apply(T t4) {
            net.time4j.engine.b0 b0Var = net.time4j.engine.b0.UTC;
            long longValue = ((Long) t4.r(b0Var)).longValue();
            return (T) t4.L(b0Var, this.f82628b ? longValue - 7 : longValue + 7);
        }
    }

    r0(Class<T> cls, net.time4j.engine.q<Integer> qVar, net.time4j.engine.q<g1> qVar2) {
        super(ProtectedSandApp.s("鈍\u0001"), cls, 1, qVar.getDefaultMaximum().intValue() / 7, 'F', new c(true), new c(false));
        this.f82622i = qVar;
        this.f82623j = qVar2;
    }

    static <T extends net.time4j.engine.r<T> & net.time4j.engine.h> net.time4j.engine.a0<T, Integer> E(r0<T> r0Var) {
        return new a(r0Var);
    }

    @Override // net.time4j.calendar.g0
    public net.time4j.engine.v<T> P(int i4, g1 g1Var) {
        return new b(this, i4, g1Var);
    }

    @Override // net.time4j.calendar.g0
    public net.time4j.engine.v<T> i(g1 g1Var) {
        return new b(this, Integer.MAX_VALUE, g1Var);
    }

    @Override // net.time4j.calendar.g0
    public net.time4j.engine.v<T> m(g1 g1Var) {
        return new b(this, 1, g1Var);
    }
}
