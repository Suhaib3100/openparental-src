package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ObjectStreamException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import net.time4j.g1;
import net.time4j.i1;

/* compiled from: CommonElements.java */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    @net.time4j.engine.d0(format = "r")
    public static final net.time4j.engine.q<Integer> f82409a = k0.f82590b;

    /* compiled from: CommonElements.java */
    private static class b<D extends net.time4j.engine.r<D>> implements net.time4j.engine.a0<D, Integer> {

        /* renamed from: b, reason: collision with root package name */
        private final C1280d<?> f82410b;

        private net.time4j.engine.q<?> b(D d5, boolean z4) {
            f q02 = f.q0(d5.getClass(), ((C1280d) this.f82410b).model);
            int m4 = m(d5, 0);
            net.time4j.engine.b0 b0Var = net.time4j.engine.b0.UTC;
            long longValue = ((Long) d5.r(b0Var)).longValue();
            int l4 = d5.l(((C1280d) this.f82410b).dayElement);
            if (z4) {
                if (((Integer) d5.g(((C1280d) this.f82410b).dayElement)).intValue() < l4 + (((Long) d5.M(q02, d5.g(q02)).r(b0Var)).longValue() - longValue)) {
                    return ((C1280d) this.f82410b).dayElement;
                }
            } else if (m4 <= 1) {
                if (((Integer) d5.i(((C1280d) this.f82410b).dayElement)).intValue() > l4 - (longValue - ((Long) d5.M(q02, d5.i(q02)).r(b0Var)).longValue())) {
                    return ((C1280d) this.f82410b).dayElement;
                }
            }
            return q02;
        }

        private int g(D d5) {
            return m(d5, 1);
        }

        private int i(D d5) {
            return m(d5, -1);
        }

        private int l(D d5) {
            return m(d5, 0);
        }

        private int m(D d5, int i4) {
            int l4 = d5.l(((C1280d) this.f82410b).dayElement);
            int value = d.g((((Long) d5.r(net.time4j.engine.b0.UTC)).longValue() - l4) + 1).getValue(((C1280d) this.f82410b).model);
            int i5 = value <= 8 - ((C1280d) this.f82410b).model.h() ? 2 - value : 9 - value;
            if (i4 == -1) {
                l4 = 1;
            } else if (i4 != 0) {
                if (i4 != 1) {
                    throw new AssertionError(android.support.v4.media.a.a(ProtectedSandApp.s("趙\u0001"), i4));
                }
                l4 = ((Integer) d5.g(((C1280d) this.f82410b).dayElement)).intValue();
            }
            return net.time4j.base.c.a(l4 - i5, 7) + 1;
        }

        private D o(D d5, int i4) {
            int m4 = m(d5, 0);
            if (i4 == m4) {
                return d5;
            }
            int i5 = (i4 - m4) * 7;
            net.time4j.engine.b0 b0Var = net.time4j.engine.b0.UTC;
            return (D) d5.L(b0Var, ((Long) d5.r(b0Var)).longValue() + i5);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(D d5) {
            return b(d5, true);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(D d5) {
            return b(d5, false);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(D d5) {
            return Integer.valueOf(m(d5, 1));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(D d5) {
            return Integer.valueOf(m(d5, -1));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer getValue(D d5) {
            return Integer.valueOf(m(d5, 0));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public boolean j(D d5, Integer num) {
            int intValue;
            return num != null && (intValue = num.intValue()) >= m(d5, -1) && intValue <= m(d5, 1);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public D withValue(D d5, Integer num, boolean z4) {
            if (num != null && (z4 || j(d5, num))) {
                return o(d5, num.intValue());
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("趚\u0001") + num + ProtectedSandApp.s("趛\u0001") + d5 + ProtectedSandApp.s("趜\u0001"));
        }

        private b(C1280d<?> c1280d) {
            this.f82410b = c1280d;
        }
    }

    /* compiled from: CommonElements.java */
    private static class c<D extends net.time4j.engine.r<D>> implements net.time4j.engine.a0<D, Integer> {

        /* renamed from: b, reason: collision with root package name */
        private final C1280d<?> f82411b;

        private int b(D d5) {
            int l4 = d5.l(((C1280d) this.f82411b).dayElement);
            int h4 = h(d5, 0);
            if (h4 > l4) {
                return (((l4 + i(d5, -1)) - h(d5, -1)) / 7) + 1;
            }
            if (h(d5, 1) + i(d5, 0) <= l4) {
                return 1;
            }
            return androidx.appcompat.widget.a.a(l4, h4, 7, 1);
        }

        private net.time4j.engine.q<?> c(Object obj) {
            return new f((Class) obj, ((C1280d) this.f82411b).model);
        }

        private int h(D d5, int i4) {
            g1 n4 = n(d5, i4);
            i1 i1Var = ((C1280d) this.f82411b).model;
            int value = n4.getValue(i1Var);
            return value <= 8 - i1Var.h() ? 2 - value : 9 - value;
        }

        private int i(D d5, int i4) {
            int l4 = d5.l(((C1280d) this.f82411b).dayElement);
            if (i4 == -1) {
                net.time4j.engine.q qVar = ((C1280d) this.f82411b).dayElement;
                net.time4j.engine.b0 b0Var = net.time4j.engine.b0.UTC;
                return d.h(qVar, d5.L(b0Var, ((Long) d5.r(b0Var)).longValue() - l4));
            }
            if (i4 == 0) {
                return d.h(((C1280d) this.f82411b).dayElement, d5);
            }
            if (i4 != 1) {
                throw new AssertionError(android.support.v4.media.a.a(ProtectedSandApp.s("趝\u0001"), i4));
            }
            int h4 = d.h(((C1280d) this.f82411b).dayElement, d5);
            net.time4j.engine.q qVar2 = ((C1280d) this.f82411b).dayElement;
            net.time4j.engine.b0 b0Var2 = net.time4j.engine.b0.UTC;
            return d.h(qVar2, d5.L(b0Var2, ((((Long) d5.r(b0Var2)).longValue() + h4) + 1) - l4));
        }

        /* JADX WARN: Multi-variable type inference failed */
        private int j(D d5) {
            int l4 = d5.l(((C1280d) this.f82411b).dayElement);
            int h4 = h(d5, 0);
            if (h4 > l4) {
                return ((h4 + i(d5, -1)) - h(d5, -1)) / 7;
            }
            int h5 = h(d5, 1) + i(d5, 0);
            if (h5 <= l4) {
                try {
                    int h6 = h(d5, 1);
                    net.time4j.engine.b0 b0Var = net.time4j.engine.b0.UTC;
                    h5 = h(d5.L(b0Var, ((Long) d5.r(b0Var)).longValue() + 7), 1) + i(d5, 1);
                    h4 = h6;
                } catch (RuntimeException unused) {
                    h5 += 7;
                }
            }
            return (h5 - h4) / 7;
        }

        private g1 n(D d5, int i4) {
            int l4 = d5.l(((C1280d) this.f82411b).dayElement);
            if (i4 == -1) {
                return d.g(((((Long) d5.r(net.time4j.engine.b0.UTC)).longValue() - l4) - d5.L(r8, r4).l(((C1280d) this.f82411b).dayElement)) + 1);
            }
            if (i4 == 0) {
                return d.g((((Long) d5.r(net.time4j.engine.b0.UTC)).longValue() - l4) + 1);
            }
            if (i4 != 1) {
                throw new AssertionError(android.support.v4.media.a.a(ProtectedSandApp.s("趝\u0001"), i4));
            }
            return d.g(((((Long) d5.r(net.time4j.engine.b0.UTC)).longValue() + d.h(((C1280d) this.f82411b).dayElement, d5)) + 1) - l4);
        }

        private D p(D d5, int i4) {
            if (i4 == b(d5)) {
                return d5;
            }
            net.time4j.engine.b0 b0Var = net.time4j.engine.b0.UTC;
            return (D) d5.L(b0Var, ((Long) d5.r(b0Var)).longValue() + ((i4 - r0) * 7));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(D d5) {
            return c(d5.getClass());
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(D d5) {
            return c(d5.getClass());
        }

        @Override // net.time4j.engine.a0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(D d5) {
            return Integer.valueOf(j(d5));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(D d5) {
            return 1;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Integer getValue(D d5) {
            return Integer.valueOf(b(d5));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public boolean j(D d5, Integer num) {
            int intValue;
            return num != null && (intValue = num.intValue()) >= 1 && intValue <= j(d5);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public D withValue(D d5, Integer num, boolean z4) {
            int intValue = num.intValue();
            if (z4 || j(d5, num)) {
                return p(d5, intValue);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("趞\u0001") + intValue + ProtectedSandApp.s("趟\u0001") + d5 + ProtectedSandApp.s("趠\u0001"));
        }

        private c(C1280d<?> c1280d) {
            this.f82411b = c1280d;
        }
    }

    /* compiled from: CommonElements.java */
    /* renamed from: net.time4j.calendar.d$d, reason: collision with other inner class name */
    private static class C1280d<T extends net.time4j.engine.r<T>> extends net.time4j.calendar.service.j<T> {
        private static final long serialVersionUID = -7471192143785466686L;
        private final boolean bounded;
        private final net.time4j.engine.q<Integer> dayElement;
        private final i1 model;

        C1280d(String str, Class<T> cls, int i4, int i5, char c5, i1 i1Var, net.time4j.engine.q<Integer> qVar, boolean z4) {
            super(str, cls, i4, i5, c5);
            if (i1Var == null) {
                throw new NullPointerException(ProtectedSandApp.s("趡\u0001"));
            }
            this.model = i1Var;
            this.dayElement = qVar;
            this.bounded = z4;
        }

        static <T extends net.time4j.engine.r<T>> C1280d<T> E(String str, Class<T> cls, int i4, int i5, char c5, i1 i1Var, net.time4j.engine.q<Integer> qVar, boolean z4) {
            return new C1280d<>(str, cls, i4, i5, c5, i1Var, qVar, z4);
        }

        @Override // net.time4j.calendar.service.j, net.time4j.calendar.service.h, net.time4j.calendar.o0
        public net.time4j.engine.v<T> f() {
            return new g(7);
        }

        @Override // net.time4j.engine.e
        protected <D extends net.time4j.engine.r<D>> net.time4j.engine.a0<D, Integer> g(net.time4j.engine.x<D> xVar) {
            if (y().equals(xVar.C())) {
                return this.bounded ? new b(this) : new c(this);
            }
            return null;
        }

        @Override // net.time4j.engine.e, net.time4j.engine.q
        public boolean isLenient() {
            return true;
        }

        @Override // net.time4j.calendar.service.h, net.time4j.engine.e
        protected boolean k(net.time4j.engine.e<?> eVar) {
            if (!super.k(eVar)) {
                return false;
            }
            C1280d c1280d = (C1280d) C1280d.class.cast(eVar);
            return this.model.equals(c1280d.model) && this.bounded == c1280d.bounded;
        }

        @Override // net.time4j.calendar.service.j, net.time4j.calendar.service.h, net.time4j.calendar.o0
        public net.time4j.engine.v<T> l() {
            return new g(-7);
        }

        @Override // net.time4j.calendar.service.h
        protected Object readResolve() throws ObjectStreamException {
            return this;
        }
    }

    /* compiled from: CommonElements.java */
    private static class e<T extends net.time4j.engine.r<T>> implements net.time4j.engine.a0<T, g1> {

        /* renamed from: b, reason: collision with root package name */
        private final f<?> f82412b;

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(T t4) {
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(T t4) {
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public g1 getMaximum(T t4) {
            net.time4j.engine.x N = net.time4j.engine.x.N(t4.getClass());
            long d5 = t4 instanceof net.time4j.engine.m ? N.z(((net.time4j.engine.m) net.time4j.engine.m.class.cast(t4)).getVariant()).d() : N.y().d();
            long longValue = ((Long) t4.r(net.time4j.engine.b0.UTC)).longValue();
            return (longValue + 7) - ((long) d.g(longValue).getValue(((f) this.f82412b).model)) > d5 ? d.g(d5) : this.f82412b.getDefaultMaximum();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public g1 getMinimum(T t4) {
            net.time4j.engine.x N = net.time4j.engine.x.N(t4.getClass());
            long g4 = t4 instanceof net.time4j.engine.m ? N.z(((net.time4j.engine.m) net.time4j.engine.m.class.cast(t4)).getVariant()).g() : N.y().g();
            long longValue = ((Long) t4.r(net.time4j.engine.b0.UTC)).longValue();
            return (longValue + 1) - ((long) d.g(longValue).getValue(((f) this.f82412b).model)) < g4 ? d.g(g4) : this.f82412b.getDefaultMinimum();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public g1 getValue(T t4) {
            return d.g(((Long) t4.r(net.time4j.engine.b0.UTC)).longValue());
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(T t4, g1 g1Var) {
            if (g1Var == null) {
                return false;
            }
            try {
                withValue(t4, g1Var, false);
                return true;
            } catch (ArithmeticException | IllegalArgumentException unused) {
                return false;
            }
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public T withValue(T t4, g1 g1Var, boolean z4) {
            net.time4j.engine.b0 b0Var = net.time4j.engine.b0.UTC;
            long longValue = ((Long) t4.r(b0Var)).longValue();
            if (g1Var == d.g(longValue)) {
                return t4;
            }
            return (T) t4.L(b0Var, (longValue + g1Var.getValue(((f) this.f82412b).model)) - r2.getValue(((f) this.f82412b).model));
        }

        private e(f<?> fVar) {
            this.f82412b = fVar;
        }
    }

    /* compiled from: CommonElements.java */
    private static class f<T extends net.time4j.engine.r<T>> extends net.time4j.calendar.service.i<g1, T> {
        private static final long serialVersionUID = 5613494586572932860L;
        private final i1 model;

        f(Class<T> cls, i1 i1Var) {
            super(ProtectedSandApp.s("趢\u0001"), cls, g1.class, 'e');
            this.model = i1Var;
        }

        static <T extends net.time4j.engine.r<T>> f<T> q0(Class<T> cls, i1 i1Var) {
            return new f<>(cls, i1Var);
        }

        @Override // net.time4j.calendar.service.i
        protected boolean J() {
            return true;
        }

        @Override // net.time4j.calendar.service.i, net.time4j.engine.q
        /* renamed from: Y, reason: merged with bridge method [inline-methods] */
        public g1 getDefaultMaximum() {
            return this.model.f().roll(6);
        }

        @Override // net.time4j.calendar.service.i, net.time4j.engine.q
        /* renamed from: c0, reason: merged with bridge method [inline-methods] */
        public g1 getDefaultMinimum() {
            return this.model.f();
        }

        @Override // net.time4j.calendar.service.i, net.time4j.calendar.service.h, net.time4j.calendar.o0
        public net.time4j.engine.v<T> f() {
            return new g(1);
        }

        @Override // net.time4j.engine.e
        protected <D extends net.time4j.engine.r<D>> net.time4j.engine.a0<D, g1> g(net.time4j.engine.x<D> xVar) {
            if (y().equals(xVar.C())) {
                return new e(this);
            }
            return null;
        }

        @Override // net.time4j.calendar.service.h, net.time4j.engine.e
        protected boolean k(net.time4j.engine.e<?> eVar) {
            if (!super.k(eVar)) {
                return false;
            }
            return this.model.equals(((f) f.class.cast(eVar)).model);
        }

        @Override // net.time4j.calendar.service.i, net.time4j.calendar.service.h, net.time4j.calendar.o0
        public net.time4j.engine.v<T> l() {
            return new g(-1);
        }

        @Override // net.time4j.calendar.service.i, net.time4j.format.l
        /* renamed from: o0, reason: merged with bridge method [inline-methods] */
        public int b0(g1 g1Var) {
            return g1Var.getValue(this.model);
        }

        @Override // net.time4j.calendar.service.h
        protected Object readResolve() throws ObjectStreamException {
            return this;
        }

        @Override // net.time4j.engine.e, java.util.Comparator
        public int compare(net.time4j.engine.p pVar, net.time4j.engine.p pVar2) {
            int value = ((g1) pVar.r(this)).getValue(this.model);
            int value2 = ((g1) pVar2.r(this)).getValue(this.model);
            if (value < value2) {
                return -1;
            }
            return value == value2 ? 0 : 1;
        }
    }

    /* compiled from: CommonElements.java */
    private static class g<T extends net.time4j.engine.r<T>> implements net.time4j.engine.v<T> {

        /* renamed from: b, reason: collision with root package name */
        private final int f82413b;

        g(int i4) {
            this.f82413b = i4;
        }

        @Override // net.time4j.engine.v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public T apply(T t4) {
            net.time4j.engine.b0 b0Var = net.time4j.engine.b0.UTC;
            return (T) t4.L(b0Var, net.time4j.base.c.f(((Long) t4.r(b0Var)).longValue(), this.f82413b));
        }
    }

    /* compiled from: CommonElements.java */
    static class h implements net.time4j.engine.s {

        /* renamed from: a, reason: collision with root package name */
        private final Class<? extends net.time4j.engine.r> f82414a;

        /* renamed from: b, reason: collision with root package name */
        private final net.time4j.engine.q<Integer> f82415b;

        /* renamed from: c, reason: collision with root package name */
        private final net.time4j.engine.q<Integer> f82416c;

        /* renamed from: d, reason: collision with root package name */
        private final i1 f82417d;

        h(Class<? extends net.time4j.engine.r> cls, net.time4j.engine.q<Integer> qVar, net.time4j.engine.q<Integer> qVar2, i1 i1Var) {
            this.f82414a = cls;
            this.f82415b = qVar;
            this.f82416c = qVar2;
            this.f82417d = i1Var;
        }

        @Override // net.time4j.engine.s
        public net.time4j.engine.r<?> a(net.time4j.engine.r<?> rVar, Locale locale, net.time4j.engine.d dVar) {
            return rVar;
        }

        @Override // net.time4j.engine.s
        public Set<net.time4j.engine.q<?>> b(Locale locale, net.time4j.engine.d dVar) {
            i1 k4 = locale.getCountry().isEmpty() ? this.f82417d : i1.k(locale);
            HashSet hashSet = new HashSet();
            hashSet.add(f.q0(this.f82414a, k4));
            hashSet.add(C1280d.E(ProtectedSandApp.s("趣\u0001"), this.f82414a, 1, 5, 'W', k4, this.f82415b, false));
            hashSet.add(new C1280d(ProtectedSandApp.s("趤\u0001"), this.f82414a, 1, 52, 'w', k4, this.f82416c, false));
            hashSet.add(new C1280d(ProtectedSandApp.s("趥\u0001"), this.f82414a, 1, 5, (char) 0, k4, this.f82415b, true));
            hashSet.add(new C1280d(ProtectedSandApp.s("趦\u0001"), this.f82414a, 1, 52, (char) 0, k4, this.f82416c, true));
            return Collections.unmodifiableSet(hashSet);
        }

        @Override // net.time4j.engine.s
        public boolean c(net.time4j.engine.q<?> qVar) {
            return false;
        }

        @Override // net.time4j.engine.s
        public boolean d(Class<?> cls) {
            return this.f82414a.equals(cls);
        }
    }

    private d() {
    }

    public static <T extends net.time4j.engine.r<T> & net.time4j.engine.h> o0<Integer, T> c(net.time4j.engine.x<T> xVar, i1 i1Var) {
        net.time4j.engine.q<Integer> f4 = f(xVar, ProtectedSandApp.s("趰\u0001"));
        if (f4 != null) {
            return new C1280d(ProtectedSandApp.s("趱\u0001"), xVar.C(), 1, 5, (char) 0, i1Var, f4, true);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("趲\u0001") + xVar);
    }

    public static <T extends net.time4j.engine.r<T> & net.time4j.engine.h> o0<Integer, T> d(net.time4j.engine.x<T> xVar, i1 i1Var) {
        net.time4j.engine.q<Integer> f4 = f(xVar, ProtectedSandApp.s("足\u0001"));
        if (f4 != null) {
            return new C1280d(ProtectedSandApp.s("趴\u0001"), xVar.C(), 1, 52, (char) 0, i1Var, f4, true);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("趲\u0001") + xVar);
    }

    private static void e(net.time4j.engine.x<?> xVar) {
        Object[] enumConstants;
        if (net.time4j.engine.h.class.isAssignableFrom(xVar.C())) {
            for (net.time4j.engine.q<?> qVar : xVar.H()) {
                if (qVar.name().equals(ProtectedSandApp.s("趵\u0001")) && (enumConstants = qVar.getType().getEnumConstants()) != null && enumConstants.length == 7) {
                    return;
                }
            }
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("趶\u0001") + xVar);
    }

    private static <D extends net.time4j.engine.r<D>> net.time4j.engine.q<Integer> f(net.time4j.engine.x<D> xVar, String str) {
        e(xVar);
        Iterator<net.time4j.engine.q<?>> it = xVar.H().iterator();
        while (it.hasNext()) {
            net.time4j.engine.q<Integer> qVar = (net.time4j.engine.q) it.next();
            if (qVar.name().equals(str)) {
                if (qVar.getType() == Integer.class) {
                    return qVar;
                }
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static g1 g(long j4) {
        return g1.valueOf(net.time4j.base.c.d(j4 + 5, 7) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <D extends net.time4j.engine.r<D>> int h(net.time4j.engine.q<?> qVar, D d5) {
        return ((Integer) Integer.class.cast(d5.g(qVar))).intValue();
    }

    @net.time4j.engine.d0(alt = "c", format = "e")
    public static <T extends net.time4j.engine.r<T> & net.time4j.engine.h> o0<g1, T> i(net.time4j.engine.x<T> xVar, i1 i1Var) {
        e(xVar);
        return new f(xVar.C(), i1Var);
    }

    @net.time4j.engine.d0(format = "W")
    public static <T extends net.time4j.engine.r<T> & net.time4j.engine.h> o0<Integer, T> j(net.time4j.engine.x<T> xVar, i1 i1Var) {
        net.time4j.engine.q<Integer> f4 = f(xVar, ProtectedSandApp.s("趰\u0001"));
        if (f4 != null) {
            return new C1280d(ProtectedSandApp.s("趷\u0001"), xVar.C(), 1, 5, 'W', i1Var, f4, false);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("趲\u0001") + xVar);
    }

    @net.time4j.engine.d0(format = "w")
    public static <T extends net.time4j.engine.r<T> & net.time4j.engine.h> o0<Integer, T> k(net.time4j.engine.x<T> xVar, i1 i1Var) {
        net.time4j.engine.q<Integer> f4 = f(xVar, ProtectedSandApp.s("足\u0001"));
        if (f4 != null) {
            return new C1280d(ProtectedSandApp.s("趸\u0001"), xVar.C(), 1, 52, 'w', i1Var, f4, false);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("趲\u0001") + xVar);
    }
}
