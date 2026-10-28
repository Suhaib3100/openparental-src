package net.time4j;

import androidx.content.preferences.protobuf.m2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.text.ParsePosition;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Weekmodel.java */
/* loaded from: classes7.dex */
public final class i1 implements Serializable {

    /* renamed from: m, reason: collision with root package name */
    private static final int f83243m = 0;

    /* renamed from: n, reason: collision with root package name */
    private static final int f83244n = 1;

    /* renamed from: o, reason: collision with root package name */
    private static final int f83245o = 2;

    /* renamed from: p, reason: collision with root package name */
    private static final int f83246p = 3;

    /* renamed from: q, reason: collision with root package name */
    private static final Map<Locale, i1> f83247q = new ConcurrentHashMap();

    /* renamed from: r, reason: collision with root package name */
    public static final i1 f83248r = new i1(g1.MONDAY, 4, g1.SATURDAY, g1.SUNDAY);

    /* renamed from: s, reason: collision with root package name */
    private static final net.time4j.format.a0 f83249s;
    private static final long serialVersionUID = 7794495882610436763L;

    /* renamed from: b, reason: collision with root package name */
    private final transient g1 f83250b;

    /* renamed from: c, reason: collision with root package name */
    private final transient int f83251c;

    /* renamed from: d, reason: collision with root package name */
    private final transient g1 f83252d;

    /* renamed from: e, reason: collision with root package name */
    private final transient g1 f83253e;

    /* renamed from: f, reason: collision with root package name */
    private final transient net.time4j.c<Integer, l0> f83254f;

    /* renamed from: g, reason: collision with root package name */
    private final transient net.time4j.c<Integer, l0> f83255g;

    /* renamed from: h, reason: collision with root package name */
    private final transient net.time4j.c<Integer, l0> f83256h;

    /* renamed from: i, reason: collision with root package name */
    private final transient net.time4j.c<Integer, l0> f83257i;

    /* renamed from: j, reason: collision with root package name */
    private final transient f0<g1> f83258j;

    /* renamed from: k, reason: collision with root package name */
    private final transient Set<net.time4j.engine.q<?>> f83259k;

    /* renamed from: l, reason: collision with root package name */
    private final transient net.time4j.engine.o<net.time4j.base.a> f83260l;

    /* compiled from: Weekmodel.java */
    class a implements net.time4j.engine.o<net.time4j.base.a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g1 f83261b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g1 f83262c;

        a(g1 g1Var, g1 g1Var2) {
            this.f83261b = g1Var;
            this.f83262c = g1Var2;
        }

        @Override // net.time4j.engine.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean test(net.time4j.base.a aVar) {
            g1 valueOf = g1.valueOf(net.time4j.base.b.c(aVar.o(), aVar.q(), aVar.t()));
            return valueOf == this.f83261b || valueOf == this.f83262c;
        }
    }

    /* compiled from: Weekmodel.java */
    private static class b<T extends net.time4j.engine.r<T>> implements net.time4j.engine.a0<T, Integer> {

        /* renamed from: b, reason: collision with root package name */
        private final d f83264b;

        /* synthetic */ b(d dVar, a aVar) {
            this(dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private net.time4j.engine.q<?> b(T t4, boolean z4) {
            l0 l0Var = (l0) t4.r(l0.f83325p);
            f0<g1> j4 = d.B(this.f83264b).j();
            int intValue = getValue(t4).intValue();
            if (z4) {
                if (intValue >= (this.f83264b.I() ? 52 : 4)) {
                    l0 l0Var2 = (l0) l0Var.M(j4, t4.g(j4));
                    if (this.f83264b.I()) {
                        if (l0Var2.e1() < l0Var.e1()) {
                            return l0.f83334y;
                        }
                    } else if (l0Var2.t() < l0Var.t()) {
                        return l0.f83332w;
                    }
                }
            } else if (intValue <= 1) {
                l0 l0Var3 = (l0) l0Var.M(j4, t4.i(j4));
                if (this.f83264b.I()) {
                    if (l0Var3.e1() > l0Var.e1()) {
                        return l0.f83334y;
                    }
                } else if (l0Var3.t() > l0Var.t()) {
                    return l0.f83332w;
                }
            }
            return j4;
        }

        private int g(l0 l0Var) {
            return this.f83264b.I() ? net.time4j.base.b.e(l0Var.o()) ? 366 : 365 : net.time4j.base.b.d(l0Var.o(), l0Var.q());
        }

        private int h(l0 l0Var) {
            return n(l0Var, 1);
        }

        private int j(l0 l0Var) {
            return n(l0Var, -1);
        }

        private int m(l0 l0Var) {
            return n(l0Var, 0);
        }

        private int n(l0 l0Var, int i4) {
            int e12 = this.f83264b.I() ? l0Var.e1() : l0Var.t();
            int value = i1.c((l0Var.f1() - e12) + 1).getValue(i1.this);
            int i5 = value <= 8 - i1.this.h() ? 2 - value : 9 - value;
            if (i4 == -1) {
                e12 = 1;
            } else if (i4 != 0) {
                if (i4 != 1) {
                    throw new AssertionError(android.support.v4.media.a.a(ProtectedSandApp.s("雊\u0001"), i4));
                }
                e12 = g(l0Var);
            }
            return net.time4j.base.c.a(e12 - i5, 7) + 1;
        }

        private l0 p(l0 l0Var, int i4) {
            if (i4 == n(l0Var, 0)) {
                return l0Var;
            }
            return l0Var.E1(l0Var.f1() + ((i4 - r0) * 7));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(T t4) {
            return b(t4, true);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(T t4) {
            return b(t4, false);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(T t4) {
            return Integer.valueOf(n((l0) t4.r(l0.f83325p), 1));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(T t4) {
            return Integer.valueOf(n((l0) t4.r(l0.f83325p), -1));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Integer getValue(T t4) {
            return Integer.valueOf(n((l0) t4.r(l0.f83325p), 0));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public boolean j(T t4, Integer num) {
            if (num == null) {
                return false;
            }
            int intValue = num.intValue();
            l0 l0Var = (l0) t4.r(l0.f83325p);
            return intValue >= n(l0Var, -1) && intValue <= n(l0Var, 1);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public T withValue(T t4, Integer num, boolean z4) {
            net.time4j.engine.q<l0> qVar = l0.f83325p;
            l0 l0Var = (l0) t4.r(qVar);
            if (num != null && (z4 || j(t4, num))) {
                return (T) t4.M(qVar, p(l0Var, num.intValue()));
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("雋\u0001") + num + ProtectedSandApp.s("雌\u0001") + t4 + ProtectedSandApp.s("雍\u0001"));
        }

        private b(d dVar) {
            this.f83264b = dVar;
        }
    }

    /* compiled from: Weekmodel.java */
    private static class c<T extends net.time4j.engine.r<T>> implements net.time4j.engine.a0<T, Integer> {

        /* renamed from: b, reason: collision with root package name */
        private final d f83265b;

        /* synthetic */ c(d dVar, a aVar) {
            this(dVar);
        }

        private int b(l0 l0Var) {
            int e12 = this.f83265b.I() ? l0Var.e1() : l0Var.t();
            int h4 = h(l0Var, 0);
            if (h4 > e12) {
                return (((e12 + i(l0Var, -1)) - h(l0Var, -1)) / 7) + 1;
            }
            int a5 = androidx.appcompat.widget.a.a(e12, h4, 7, 1);
            if ((a5 >= 53 || (!this.f83265b.I() && a5 >= 5)) && h(l0Var, 1) + i(l0Var, 0) <= e12) {
                return 1;
            }
            return a5;
        }

        private net.time4j.engine.q<?> c() {
            return d.B(this.f83265b).j();
        }

        private int h(l0 l0Var, int i4) {
            g1 n4 = n(l0Var, i4);
            i1 B = d.B(this.f83265b);
            int value = n4.getValue(B);
            return value <= 8 - B.h() ? 2 - value : 9 - value;
        }

        private int i(l0 l0Var, int i4) {
            if (this.f83265b.I()) {
                return net.time4j.base.b.e(l0Var.o() + i4) ? 366 : 365;
            }
            int o4 = l0Var.o();
            int q4 = l0Var.q() + i4;
            if (q4 == 0) {
                o4--;
                q4 = 12;
            } else if (q4 == 13) {
                o4++;
                q4 = 1;
            }
            return net.time4j.base.b.d(o4, q4);
        }

        private int j(l0 l0Var) {
            int e12 = this.f83265b.I() ? l0Var.e1() : l0Var.t();
            int h4 = h(l0Var, 0);
            if (h4 > e12) {
                return ((h4 + i(l0Var, -1)) - h(l0Var, -1)) / 7;
            }
            int h5 = h(l0Var, 1) + i(l0Var, 0);
            if (h5 <= e12) {
                try {
                    int h6 = h(l0Var, 1);
                    h5 = h(l0Var, 2) + i(l0Var, 1);
                    h4 = h6;
                } catch (RuntimeException unused) {
                    h5 += 7;
                }
            }
            return (h5 - h4) / 7;
        }

        private g1 n(l0 l0Var, int i4) {
            if (this.f83265b.I()) {
                return g1.valueOf(net.time4j.base.b.c(l0Var.o() + i4, 1, 1));
            }
            int o4 = l0Var.o();
            int q4 = l0Var.q() + i4;
            if (q4 == 0) {
                o4--;
                q4 = 12;
            } else if (q4 == 13) {
                o4++;
                q4 = 1;
            } else if (q4 == 14) {
                o4++;
                q4 = 2;
            }
            return g1.valueOf(net.time4j.base.b.c(o4, q4, 1));
        }

        private l0 p(l0 l0Var, int i4) {
            if (i4 == b(l0Var)) {
                return l0Var;
            }
            return l0Var.E1(l0Var.f1() + ((i4 - r0) * 7));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(T t4) {
            return c();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(T t4) {
            return c();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(T t4) {
            return Integer.valueOf(j((l0) t4.r(l0.f83325p)));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(T t4) {
            return 1;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Integer getValue(T t4) {
            return Integer.valueOf(b((l0) t4.r(l0.f83325p)));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public boolean j(T t4, Integer num) {
            if (num == null) {
                return false;
            }
            int intValue = num.intValue();
            if (this.f83265b.I() && intValue >= 1 && intValue <= 52) {
                return true;
            }
            if (!this.f83265b.I() || intValue == 53) {
                return intValue >= 1 && intValue <= j((l0) t4.r(l0.f83325p));
            }
            return false;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public T withValue(T t4, Integer num, boolean z4) {
            net.time4j.engine.q<l0> qVar = l0.f83325p;
            l0 l0Var = (l0) t4.r(qVar);
            if (num != null && (z4 || j(t4, num))) {
                return (T) t4.M(qVar, p(l0Var, num.intValue()));
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("雎\u0001") + num + ProtectedSandApp.s("雏\u0001") + t4 + ProtectedSandApp.s("雐\u0001"));
        }

        private c(d dVar) {
            this.f83265b = dVar;
        }
    }

    /* compiled from: Weekmodel.java */
    private class d extends net.time4j.a<Integer> {
        private static final long serialVersionUID = -5936254509996557266L;
        private final int category;

        d(String str, int i4) {
            super(str);
            this.category = i4;
        }

        static i1 B(d dVar) {
            return i1.this;
        }

        private i1 F() {
            return i1.this;
        }

        private boolean H() {
            return this.category >= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean I() {
            return this.category % 2 == 0;
        }

        private Object readResolve() throws ObjectStreamException {
            i1 i1Var = i1.this;
            int i4 = this.category;
            if (i4 == 0) {
                return i1Var.p();
            }
            if (i4 == 1) {
                return i1Var.o();
            }
            if (i4 == 2) {
                return i1Var.b();
            }
            if (i4 == 3) {
                return i1Var.a();
            }
            throw new InvalidObjectException(ProtectedSandApp.s("雑\u0001") + this.category);
        }

        @Override // net.time4j.engine.q
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public Integer getDefaultMaximum() {
            return Integer.valueOf(I() ? 52 : 5);
        }

        @Override // net.time4j.engine.q
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public Integer getDefaultMinimum() {
            return 1;
        }

        @Override // net.time4j.engine.e
        protected <T extends net.time4j.engine.r<T>> net.time4j.engine.a0<T, Integer> g(net.time4j.engine.x<T> xVar) {
            a aVar = null;
            if (xVar.K(l0.f83325p)) {
                return H() ? new b(this, aVar) : new c(this, aVar);
            }
            return null;
        }

        @Override // net.time4j.format.d, net.time4j.engine.e, net.time4j.engine.q
        public String getDisplayName(Locale locale) {
            String str = net.time4j.format.b.f(locale).o().get(ProtectedSandApp.s("雒\u0001"));
            return str == null ? name() : str;
        }

        @Override // net.time4j.engine.e, net.time4j.engine.q
        public char getSymbol() {
            int i4 = this.category;
            if (i4 != 0) {
                return i4 != 1 ? (char) 0 : 'W';
            }
            return 'w';
        }

        @Override // net.time4j.engine.q
        public Class<Integer> getType() {
            return Integer.class;
        }

        @Override // net.time4j.engine.q
        public boolean isDateElement() {
            return true;
        }

        @Override // net.time4j.engine.e, net.time4j.engine.q
        public boolean isLenient() {
            return true;
        }

        @Override // net.time4j.engine.q
        public boolean isTimeElement() {
            return false;
        }

        @Override // net.time4j.engine.e
        protected boolean k(net.time4j.engine.e<?> eVar) {
            return i1.this.equals(i1.this);
        }

        @Override // net.time4j.engine.e
        protected net.time4j.engine.q<?> n() {
            return l0.A;
        }
    }

    /* compiled from: Weekmodel.java */
    private static class e<T extends net.time4j.engine.r<T>> implements net.time4j.engine.a0<T, g1> {

        /* renamed from: b, reason: collision with root package name */
        final f f83266b;

        /* synthetic */ e(f fVar, a aVar) {
            this(fVar);
        }

        private net.time4j.engine.q<?> b(T t4) {
            net.time4j.engine.q<m0> qVar = m0.f83368s;
            if (t4.w(qVar)) {
                return qVar;
            }
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(T t4) {
            return b(t4);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(T t4) {
            return b(t4);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public g1 getMaximum(T t4) {
            l0 l0Var = (l0) t4.r(l0.f83325p);
            return (l0Var.b() + 7) - ((long) l0Var.d1().getValue(f.B(this.f83266b))) > l0.T0().y().d() ? g1.FRIDAY : this.f83266b.getDefaultMaximum();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public g1 getMinimum(T t4) {
            l0 l0Var = (l0) t4.r(l0.f83325p);
            return (l0Var.b() + 1) - ((long) l0Var.d1().getValue(f.B(this.f83266b))) < l0.T0().y().g() ? g1.MONDAY : this.f83266b.getDefaultMinimum();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public g1 getValue(T t4) {
            return ((l0) t4.r(l0.f83325p)).d1();
        }

        @Override // net.time4j.engine.a0
        public boolean j(T t4, g1 g1Var) {
            if (g1Var == null) {
                return false;
            }
            try {
                withValue(t4, g1Var, false);
                return true;
            } catch (RuntimeException unused) {
                return false;
            }
        }

        @Override // net.time4j.engine.a0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public T withValue(T t4, g1 g1Var, boolean z4) {
            if (g1Var == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("雓\u0001"));
            }
            net.time4j.engine.q<l0> qVar = l0.f83325p;
            l0 l0Var = (l0) t4.r(qVar);
            long f12 = l0Var.f1();
            if (g1Var == i1.c(f12)) {
                return t4;
            }
            return (T) t4.M(qVar, l0Var.E1((f12 + g1Var.getValue(i1.this)) - r3.getValue(f.B(this.f83266b))));
        }

        private e(f fVar) {
            this.f83266b = fVar;
        }
    }

    /* compiled from: Weekmodel.java */
    private class f extends net.time4j.a<g1> implements f0<g1>, net.time4j.format.l<g1>, net.time4j.format.v<g1> {
        private static final long serialVersionUID = 1945670789283677398L;

        f() {
            super(ProtectedSandApp.s("雔\u0001"));
        }

        static i1 B(f fVar) {
            return i1.this;
        }

        private net.time4j.format.u C(net.time4j.engine.d dVar, net.time4j.format.m mVar) {
            return net.time4j.format.b.f((Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT)).r((net.time4j.format.x) dVar.b(net.time4j.format.a.f82785g, net.time4j.format.x.WIDE), mVar);
        }

        private i1 F() {
            return i1.this;
        }

        private Object readResolve() throws ObjectStreamException {
            return i1.this.j();
        }

        @Override // net.time4j.engine.q
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public g1 getDefaultMaximum() {
            return i1.this.f().roll(6);
        }

        @Override // net.time4j.engine.q
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public g1 getDefaultMinimum() {
            return i1.this.f();
        }

        @Override // net.time4j.format.l
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public int b0(g1 g1Var) {
            return g1Var.getValue(i1.this);
        }

        @Override // net.time4j.format.v
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public g1 parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
            int index = parsePosition.getIndex();
            net.time4j.engine.c<net.time4j.format.m> cVar = net.time4j.format.a.f82786h;
            net.time4j.format.m mVar = net.time4j.format.m.FORMAT;
            net.time4j.format.m mVar2 = (net.time4j.format.m) dVar.b(cVar, mVar);
            g1 g1Var = (g1) C(dVar, mVar2).d(charSequence, parsePosition, getType(), dVar);
            if (g1Var != null || !((Boolean) dVar.b(net.time4j.format.a.f82789k, Boolean.TRUE)).booleanValue()) {
                return g1Var;
            }
            parsePosition.setErrorIndex(-1);
            parsePosition.setIndex(index);
            if (mVar2 == mVar) {
                mVar = net.time4j.format.m.STANDALONE;
            }
            return (g1) C(dVar, mVar).d(charSequence, parsePosition, getType(), dVar);
        }

        @Override // net.time4j.format.l
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public int w(g1 g1Var, net.time4j.engine.p pVar, net.time4j.engine.d dVar) {
            return b0(g1Var);
        }

        @Override // net.time4j.f0
        /* renamed from: K, reason: merged with bridge method [inline-methods] */
        public q<l0> V(g1 g1Var) {
            return new h0(this, 9, g1Var);
        }

        @Override // net.time4j.f0
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public q<l0> G(g1 g1Var) {
            return new h0(this, 11, g1Var);
        }

        @Override // net.time4j.f0
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public q<l0> e0(g1 g1Var) {
            return new h0(this, 10, g1Var);
        }

        @Override // net.time4j.f0
        /* renamed from: O, reason: merged with bridge method [inline-methods] */
        public q<l0> R(g1 g1Var) {
            return new h0(this, 12, g1Var);
        }

        @Override // net.time4j.engine.e
        protected <T extends net.time4j.engine.r<T>> net.time4j.engine.a0<T, g1> g(net.time4j.engine.x<T> xVar) {
            a aVar = null;
            if (xVar.K(l0.f83325p)) {
                return new e(this, aVar);
            }
            return null;
        }

        @Override // net.time4j.format.d, net.time4j.engine.e, net.time4j.engine.q
        public String getDisplayName(Locale locale) {
            String str = net.time4j.format.b.f(locale).o().get(ProtectedSandApp.s("雕\u0001"));
            return str == null ? name() : str;
        }

        @Override // net.time4j.engine.e, net.time4j.engine.q
        public char getSymbol() {
            return 'e';
        }

        @Override // net.time4j.engine.q
        public Class<g1> getType() {
            return g1.class;
        }

        @Override // net.time4j.format.l
        public boolean i0(net.time4j.engine.r<?> rVar, int i4) {
            for (g1 g1Var : g1.values()) {
                if (g1Var.getValue(i1.this) == i4) {
                    rVar.M(this, g1Var);
                    return true;
                }
            }
            return false;
        }

        @Override // net.time4j.engine.q
        public boolean isDateElement() {
            return true;
        }

        @Override // net.time4j.engine.q
        public boolean isTimeElement() {
            return false;
        }

        @Override // net.time4j.engine.e
        protected boolean k(net.time4j.engine.e<?> eVar) {
            return i1.this.equals(i1.this);
        }

        @Override // net.time4j.engine.e
        protected net.time4j.engine.q<?> n() {
            return l0.f83333x;
        }

        @Override // net.time4j.format.v
        public void print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar) throws IOException {
            appendable.append(C(dVar, (net.time4j.format.m) dVar.b(net.time4j.format.a.f82786h, net.time4j.format.m.FORMAT)).g((Enum) pVar.r(this)));
        }

        @Override // net.time4j.engine.e, java.util.Comparator
        public int compare(net.time4j.engine.p pVar, net.time4j.engine.p pVar2) {
            int value = ((g1) pVar.r(this)).getValue(i1.this);
            int value2 = ((g1) pVar2.r(this)).getValue(i1.this);
            if (value < value2) {
                return -1;
            }
            return value == value2 ? 0 : 1;
        }
    }

    static {
        Iterator it = net.time4j.base.d.c().g(net.time4j.format.a0.class).iterator();
        f83249s = it.hasNext() ? (net.time4j.format.a0) it.next() : null;
    }

    private i1(g1 g1Var, int i4, g1 g1Var2, g1 g1Var3) {
        if (g1Var == null) {
            throw new NullPointerException(ProtectedSandApp.s("靵\u0001"));
        }
        if (i4 < 1 || i4 > 7) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("靴\u0001"), i4));
        }
        if (g1Var2 == null) {
            throw new NullPointerException(ProtectedSandApp.s("靳\u0001"));
        }
        if (g1Var3 == null) {
            throw new NullPointerException(ProtectedSandApp.s("靲\u0001"));
        }
        this.f83250b = g1Var;
        this.f83251c = i4;
        this.f83252d = g1Var2;
        this.f83253e = g1Var3;
        d dVar = new d(ProtectedSandApp.s("靮\u0001"), 0);
        this.f83254f = dVar;
        d dVar2 = new d(ProtectedSandApp.s("靯\u0001"), 1);
        this.f83255g = dVar2;
        d dVar3 = new d(ProtectedSandApp.s("靰\u0001"), 2);
        this.f83256h = dVar3;
        d dVar4 = new d(ProtectedSandApp.s("靱\u0001"), 3);
        this.f83257i = dVar4;
        f fVar = new f();
        this.f83258j = fVar;
        this.f83260l = new a(g1Var2, g1Var3);
        HashSet hashSet = new HashSet();
        hashSet.add(dVar);
        hashSet.add(dVar2);
        hashSet.add(fVar);
        hashSet.add(dVar3);
        hashSet.add(dVar4);
        this.f83259k = Collections.unmodifiableSet(hashSet);
    }

    static g1 c(long j4) {
        return g1.valueOf(net.time4j.base.c.d(j4 + 5, 7) + 1);
    }

    public static i1 k(Locale locale) {
        if (locale.getCountry().isEmpty()) {
            return f83248r;
        }
        Map<Locale, i1> map = f83247q;
        i1 i1Var = map.get(locale);
        if (i1Var != null) {
            return i1Var;
        }
        net.time4j.format.a0 a0Var = f83249s;
        if (a0Var == null) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(locale);
            int firstDayOfWeek = gregorianCalendar.getFirstDayOfWeek();
            return l(g1.valueOf(firstDayOfWeek == 1 ? 7 : firstDayOfWeek - 1), gregorianCalendar.getMinimalDaysInFirstWeek());
        }
        i1 i1Var2 = new i1(g1.valueOf(a0Var.d(locale)), a0Var.b(locale), g1.valueOf(a0Var.c(locale)), g1.valueOf(a0Var.a(locale)));
        if (map.size() > 150) {
            map.clear();
        }
        map.put(locale, i1Var2);
        return i1Var2;
    }

    public static i1 l(g1 g1Var, int i4) {
        return m(g1Var, i4, g1.SATURDAY, g1.SUNDAY);
    }

    public static i1 m(g1 g1Var, int i4, g1 g1Var2, g1 g1Var3) {
        return (g1Var == g1.MONDAY && i4 == 4 && g1Var2 == g1.SATURDAY && g1Var3 == g1.SUNDAY) ? f83248r : new i1(g1Var, i4, g1Var2, g1Var3);
    }

    public static i1 n() {
        return k(Locale.getDefault());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException(ProtectedSandApp.s("靶\u0001"));
    }

    private Object writeReplace() {
        return new SPX(this, 3);
    }

    public net.time4j.c<Integer, l0> a() {
        return this.f83257i;
    }

    public net.time4j.c<Integer, l0> b() {
        return this.f83256h;
    }

    Set<net.time4j.engine.q<?>> d() {
        return this.f83259k;
    }

    public g1 e() {
        return this.f83253e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return this.f83250b == i1Var.f83250b && this.f83251c == i1Var.f83251c && this.f83252d == i1Var.f83252d && this.f83253e == i1Var.f83253e;
    }

    public g1 f() {
        return this.f83250b;
    }

    public g1 g() {
        return this.f83253e.next();
    }

    public int h() {
        return this.f83251c;
    }

    public int hashCode() {
        return (this.f83251c * 37) + (this.f83250b.name().hashCode() * 17);
    }

    public g1 i() {
        return this.f83252d;
    }

    @net.time4j.engine.d0(alt = "c", format = "e")
    public f0<g1> j() {
        return this.f83258j;
    }

    @net.time4j.engine.d0(format = "W")
    public net.time4j.c<Integer, l0> o() {
        return this.f83255g;
    }

    @net.time4j.engine.d0(format = "w")
    public net.time4j.c<Integer, l0> p() {
        return this.f83254f;
    }

    public net.time4j.engine.o<net.time4j.base.a> q() {
        return this.f83260l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        m2.a(i1.class, sb, ProtectedSandApp.s("靷\u0001"));
        sb.append(this.f83250b);
        sb.append(ProtectedSandApp.s("靸\u0001"));
        sb.append(this.f83251c);
        sb.append(ProtectedSandApp.s("靹\u0001"));
        sb.append(this.f83252d);
        sb.append(ProtectedSandApp.s("靺\u0001"));
        sb.append(this.f83253e);
        sb.append(']');
        return sb.toString();
    }
}
