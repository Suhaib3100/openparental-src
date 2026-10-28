package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ObjectStreamException;

/* compiled from: YOWElement.java */
/* loaded from: classes7.dex */
final class j1 extends net.time4j.a<Integer> {

    /* renamed from: g, reason: collision with root package name */
    private static final net.time4j.engine.o0 f83298g = new c();

    /* renamed from: h, reason: collision with root package name */
    static final j1 f83299h = new j1(ProtectedSandApp.s("鞃\u0001"));
    private static final long serialVersionUID = -6907291758376370420L;

    /* renamed from: e, reason: collision with root package name */
    private final transient q<l0> f83300e;

    /* renamed from: f, reason: collision with root package name */
    private final transient q<l0> f83301f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: YOWElement.java */
    static class b<T extends net.time4j.engine.r<T>> implements net.time4j.engine.a0<T, Integer> {
        private b() {
        }

        private net.time4j.engine.q<?> b() {
            return i1.f83248r.p();
        }

        private static l0 k(l0 l0Var, int i4) {
            int J = j1.J(i4);
            int N = j1.N(l0Var);
            long transform = net.time4j.engine.b0.UNIX.transform(net.time4j.base.b.j(i4, 1, 1), net.time4j.engine.b0.MODIFIED_JULIAN_DATE) + (J - 1) + ((N - 1) * 7) + (l0Var.d1().getValue(i1.f83248r) - 1);
            if (N == 53) {
                if (((j1.J(i4 + 1) + (net.time4j.base.b.e(i4) ? 366 : 365)) - J) / 7 < 53) {
                    transform -= 7;
                }
            }
            return l0Var.E1(transform - 730);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(T t4) {
            return i1.f83248r.p();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(T t4) {
            return i1.f83248r.p();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(T t4) {
            j1.f83299h.getClass();
            return l0.f83318i;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(T t4) {
            j1.f83299h.getClass();
            return l0.f83317h;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Integer getValue(T t4) {
            l0 l0Var = (l0) t4.r(l0.f83325p);
            int o4 = l0Var.o();
            int e12 = l0Var.e1();
            int K = j1.K(l0Var, 0);
            if (K > e12) {
                o4--;
            } else if (androidx.appcompat.widget.a.a(e12, K, 7, 1) >= 53 && j1.K(l0Var, 1) + j1.M(l0Var, 0) <= e12) {
                o4++;
            }
            return Integer.valueOf(o4);
        }

        @Override // net.time4j.engine.a0
        public boolean j(T t4, Integer num) {
            int intValue;
            return num != null && (intValue = num.intValue()) >= -999999999 && intValue <= 999999999;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public T withValue(T t4, Integer num, boolean z4) {
            if (num == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("鞂\u0001"));
            }
            net.time4j.engine.q<l0> qVar = l0.f83325p;
            return (T) t4.M(qVar, k((l0) t4.r(qVar), num.intValue()));
        }

        b(a aVar) {
        }
    }

    /* compiled from: YOWElement.java */
    private static class c<T extends net.time4j.engine.r<T>> implements net.time4j.engine.o0<T> {
        private c() {
        }

        @Override // net.time4j.engine.o0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public T b(T t4, long j4) {
            if (j4 == 0) {
                return t4;
            }
            int g4 = net.time4j.base.c.g(net.time4j.base.c.f(((Integer) t4.r(j1.f83299h)).intValue(), j4));
            net.time4j.engine.q<l0> qVar = l0.f83325p;
            l0 l0Var = (l0) t4.r(qVar);
            int h12 = l0Var.h1();
            g1 d12 = l0Var.d1();
            if (h12 == 53) {
                h12 = ((Integer) l0.t1(g4, 26, d12).g(i1.f83248r.p())).intValue();
            }
            return (T) t4.M(qVar, l0.t1(g4, h12, d12));
        }

        @Override // net.time4j.engine.o0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public long a(T t4, T t5) {
            net.time4j.engine.q<l0> qVar = l0.f83325p;
            l0 l0Var = (l0) t4.r(qVar);
            l0 l0Var2 = (l0) t5.r(qVar);
            j1 j1Var = j1.f83299h;
            long intValue = ((Integer) l0Var2.r(j1Var)).intValue() - ((Integer) l0Var.r(j1Var)).intValue();
            if (intValue == 0) {
                return intValue;
            }
            int N = j1.N(l0Var);
            int N2 = j1.N(l0Var2);
            if (intValue > 0 && N > N2) {
                intValue--;
            } else if (intValue < 0 && N < N2) {
                intValue++;
            }
            if (intValue == 0 || N != N2) {
                return intValue;
            }
            int value = l0Var.d1().getValue();
            int value2 = l0Var2.d1().getValue();
            if (intValue > 0 && value > value2) {
                intValue--;
            } else if (intValue < 0 && value < value2) {
                intValue++;
            }
            if (intValue == 0 || value != value2) {
                return intValue;
            }
            net.time4j.engine.q<m0> qVar2 = m0.f83368s;
            if (!t4.w(qVar2) || !t5.w(qVar2)) {
                return intValue;
            }
            m0 m0Var = (m0) t4.r(qVar2);
            m0 m0Var2 = (m0) t5.r(qVar2);
            return (intValue <= 0 || !m0Var.s(m0Var2)) ? (intValue >= 0 || !m0Var.f(m0Var2)) ? intValue : intValue + 1 : intValue - 1;
        }

        c(a aVar) {
        }
    }

    /* compiled from: YOWElement.java */
    private static class d extends q<l0> {
        private final long B;
        private final net.time4j.engine.v<n0> C;

        /* compiled from: YOWElement.java */
        class a implements net.time4j.engine.v<n0> {
            a() {
            }

            @Override // net.time4j.engine.v
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public n0 apply(n0 n0Var) {
                return (n0) j1.O().b(n0Var, d.this.B);
            }
        }

        @Override // net.time4j.q
        net.time4j.engine.v<n0> h() {
            return this.C;
        }

        @Override // net.time4j.engine.v
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public l0 apply(l0 l0Var) {
            return (l0) j1.O().b(l0Var, this.B);
        }

        private d(long j4) {
            super(j1.f83299h, 8);
            this.B = j4;
            this.C = new a();
        }
    }

    private j1(String str) {
        super(str);
        this.f83300e = new d(-1L);
        this.f83301f = new d(1L);
    }

    static <T extends net.time4j.engine.r<T>> net.time4j.engine.a0<T, Integer> F(Class<T> cls) {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int J(int i4) {
        g1 valueOf = g1.valueOf(net.time4j.base.b.c(i4, 1, 1));
        i1 i1Var = i1.f83248r;
        int value = valueOf.getValue(i1Var);
        return value <= 8 - i1Var.h() ? 2 - value : 9 - value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int K(l0 l0Var, int i4) {
        return J(l0Var.o() + i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int M(l0 l0Var, int i4) {
        return net.time4j.base.b.e(l0Var.o() + i4) ? 366 : 365;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int N(l0 l0Var) {
        int e12 = l0Var.e1();
        int K = K(l0Var, 0);
        if (K > e12) {
            return (((e12 + M(l0Var, -1)) - K(l0Var, -1)) / 7) + 1;
        }
        int a5 = androidx.appcompat.widget.a.a(e12, K, 7, 1);
        if (a5 < 53 || K(l0Var, 1) + M(l0Var, 0) > e12) {
            return a5;
        }
        return 1;
    }

    static <T extends net.time4j.engine.r<T>> net.time4j.engine.o0<T> O() {
        return f83298g;
    }

    private Object readResolve() throws ObjectStreamException {
        return f83299h;
    }

    public Integer H() {
        return l0.f83318i;
    }

    public Integer I() {
        return l0.f83317h;
    }

    @Override // net.time4j.a, net.time4j.c
    public q<l0> f() {
        return this.f83301f;
    }

    @Override // net.time4j.engine.q
    public Object getDefaultMaximum() {
        return l0.f83318i;
    }

    @Override // net.time4j.engine.q
    public Object getDefaultMinimum() {
        return l0.f83317h;
    }

    @Override // net.time4j.engine.e, net.time4j.engine.q
    public char getSymbol() {
        return 'Y';
    }

    @Override // net.time4j.engine.q
    public Class<Integer> getType() {
        return Integer.class;
    }

    @Override // net.time4j.engine.q
    public boolean isDateElement() {
        return true;
    }

    @Override // net.time4j.engine.q
    public boolean isTimeElement() {
        return false;
    }

    @Override // net.time4j.a, net.time4j.c
    public q<l0> l() {
        return this.f83300e;
    }

    @Override // net.time4j.engine.e
    protected boolean u() {
        return true;
    }
}
