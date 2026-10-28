package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.text.ParseException;
import java.util.Locale;
import java.util.Map;
import net.time4j.engine.x;

/* compiled from: AnnualDate.java */
@net.time4j.format.c("iso8601")
/* loaded from: classes7.dex */
public final class e extends net.time4j.engine.r<e> implements Comparable<e>, net.time4j.engine.i0<e>, net.time4j.format.h, Serializable {

    /* renamed from: b, reason: collision with root package name */
    @net.time4j.engine.d0(alt = "L", format = "M")
    public static final net.time4j.engine.q<e0> f82697b;

    /* renamed from: c, reason: collision with root package name */
    public static final net.time4j.engine.q<Integer> f82698c;

    /* renamed from: d, reason: collision with root package name */
    @net.time4j.engine.d0(format = "d")
    public static final net.time4j.engine.q<Integer> f82699d;

    /* renamed from: e, reason: collision with root package name */
    private static final net.time4j.engine.x<e> f82700e;
    private static final long serialVersionUID = 7510648008819092983L;
    private final int dayOfMonth;
    private final int month;

    /* compiled from: AnnualDate.java */
    class a implements net.time4j.engine.v<l0> {
        a() {
        }

        @Override // net.time4j.engine.v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l0 apply(l0 l0Var) {
            int o4 = l0Var.o();
            int value = e.this.b0().getValue();
            int t4 = e.this.t();
            if (value < l0Var.q() || (value == l0Var.q() && t4 <= l0Var.t())) {
                o4++;
            }
            if (value == 2 && t4 == 29) {
                while (!net.time4j.base.b.e(o4)) {
                    o4++;
                }
            }
            return l0.r1(o4, value, t4);
        }
    }

    /* compiled from: AnnualDate.java */
    class b implements net.time4j.engine.v<l0> {
        b() {
        }

        @Override // net.time4j.engine.v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l0 apply(l0 l0Var) {
            int o4 = l0Var.o();
            int value = e.this.b0().getValue();
            int t4 = e.this.t();
            if (value < l0Var.q() || (value == l0Var.q() && t4 <= l0Var.t())) {
                o4++;
            }
            if (value == 2 && t4 == 29 && !net.time4j.base.b.e(o4)) {
                t4 = 1;
                value = 3;
            }
            return l0.r1(o4, value, t4);
        }
    }

    /* compiled from: AnnualDate.java */
    private static class c implements net.time4j.engine.e0<e> {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f82703b;

        c(boolean z4) {
            this.f82703b = z4;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(e eVar) {
            if (this.f82703b) {
                return null;
            }
            return e.f82699d;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(e eVar) {
            if (this.f82703b) {
                return null;
            }
            return e.f82699d;
        }

        @Override // net.time4j.engine.e0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public int d(e eVar) {
            return this.f82703b ? eVar.dayOfMonth : eVar.month;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(e eVar) {
            if (this.f82703b) {
                return Integer.valueOf(e.a0(eVar.month));
            }
            return 12;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(e eVar) {
            return 1;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Integer getValue(e eVar) {
            return Integer.valueOf(d(eVar));
        }

        @Override // net.time4j.engine.e0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean e(e eVar, int i4) {
            if (i4 < 1) {
                return false;
            }
            return this.f82703b ? i4 <= e.a0(eVar.month) : i4 <= 12;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean j(e eVar, Integer num) {
            if (num == null) {
                return false;
            }
            return e(eVar, num.intValue());
        }

        @Override // net.time4j.engine.e0
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public e a(e eVar, int i4, boolean z4) {
            return this.f82703b ? e.h0(eVar.month, i4) : e.h0(i4, Math.min(eVar.dayOfMonth, e.a0(i4)));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public e withValue(e eVar, Integer num, boolean z4) {
            if (num != null) {
                return a(eVar, num.intValue(), z4);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("鋌\u0001"));
        }
    }

    /* compiled from: AnnualDate.java */
    private static class d implements net.time4j.engine.u<e> {
        private d() {
        }

        private static String f(Map<String, String> map, String str) {
            if (map.containsKey(str)) {
                return map.get(str);
            }
            boolean equals = ProtectedSandApp.s("鋍\u0001").equals(str);
            String s4 = ProtectedSandApp.s("鋎\u0001");
            if (equals) {
                return f(map, s4);
            }
            boolean equals2 = s4.equals(str);
            String s5 = ProtectedSandApp.s("鋏\u0001");
            if (equals2) {
                return f(map, s5);
            }
            if (s5.equals(str)) {
                return f(map, ProtectedSandApp.s("鋐\u0001"));
            }
            return null;
        }

        @Override // net.time4j.engine.u
        public net.time4j.engine.g0 a() {
            return net.time4j.engine.g0.f82720a;
        }

        /* JADX WARN: Type inference failed for: r3v2, types: [net.time4j.base.f] */
        @Override // net.time4j.engine.u
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e o(net.time4j.base.e<?> eVar, net.time4j.engine.d dVar) {
            net.time4j.tz.l e02;
            net.time4j.engine.c<net.time4j.tz.k> cVar = net.time4j.format.a.f82782d;
            if (dVar.c(cVar)) {
                e02 = net.time4j.tz.l.c0((net.time4j.tz.k) dVar.a(cVar));
            } else {
                if (!((net.time4j.format.g) dVar.b(net.time4j.format.a.f82784f, net.time4j.format.g.SMART)).isLax()) {
                    return null;
                }
                e02 = net.time4j.tz.l.e0();
            }
            l0 H0 = d0.y0(eVar.c()).j1(e02.G()).H0();
            return e.h0(H0.q(), H0.t());
        }

        @Override // net.time4j.engine.u
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e e(net.time4j.engine.r<?> rVar, net.time4j.engine.d dVar, boolean z4, boolean z5) {
            int l4 = rVar.l(e.f82699d);
            a aVar = null;
            if (l4 != Integer.MIN_VALUE) {
                int l5 = rVar.l(l0.f83331v);
                if (l5 == Integer.MIN_VALUE) {
                    net.time4j.engine.q<?> qVar = e.f82697b;
                    if (rVar.w(qVar)) {
                        l5 = ((e0) rVar.r(qVar)).getValue();
                    }
                }
                if (l5 != Integer.MIN_VALUE) {
                    if (l4 < 1 || l4 > e.a0(l5)) {
                        rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, ProtectedSandApp.s("鋒\u0001") + l4);
                    } else {
                        if (l5 >= 1 && l5 <= 12) {
                            return new e(l5, l4, aVar);
                        }
                        rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, ProtectedSandApp.s("鋑\u0001") + l5);
                    }
                }
            }
            return null;
        }

        @Override // net.time4j.engine.u
        public net.time4j.engine.x<?> d() {
            return null;
        }

        @Override // net.time4j.engine.u
        public int g() {
            return l0.T0().g();
        }

        @Override // net.time4j.engine.u
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p k(e eVar, net.time4j.engine.d dVar) {
            return eVar;
        }

        @Override // net.time4j.engine.u
        public String n(net.time4j.engine.z zVar, Locale locale) {
            Map<String, String> o4 = net.time4j.format.b.f(locale).o();
            int styleValue = zVar.getStyleValue();
            String f4 = f(o4, styleValue != 0 ? styleValue != 1 ? styleValue != 2 ? styleValue != 3 ? null : ProtectedSandApp.s("鋐\u0001") : ProtectedSandApp.s("鋏\u0001") : ProtectedSandApp.s("鋎\u0001") : ProtectedSandApp.s("鋍\u0001"));
            return f4 == null ? ProtectedSandApp.s("鋓\u0001") : f4;
        }

        d(a aVar) {
        }
    }

    /* compiled from: AnnualDate.java */
    /* renamed from: net.time4j.e$e, reason: collision with other inner class name */
    private static class C1290e implements net.time4j.engine.a0<e, e0> {
        private C1290e() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(e eVar) {
            return e.f82699d;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(e eVar) {
            return e.f82699d;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public e0 getMaximum(e eVar) {
            return e0.DECEMBER;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public e0 getMinimum(e eVar) {
            return e0.JANUARY;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public e0 getValue(e eVar) {
            return eVar.b0();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(e eVar, e0 e0Var) {
            return e0Var != null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public e withValue(e eVar, e0 e0Var, boolean z4) {
            if (e0Var == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("鋔\u0001"));
            }
            int value = e0Var.getValue();
            return new e(value, Math.min(eVar.dayOfMonth, e.a0(value)), null);
        }

        C1290e(a aVar) {
        }
    }

    static {
        f0<e0> f0Var = l0.f83330u;
        f82697b = f0Var;
        q0<Integer, l0> q0Var = l0.f83331v;
        f82698c = q0Var;
        q0<Integer, l0> q0Var2 = l0.f83332w;
        f82699d = q0Var2;
        f82700e = x.a.e(e.class, new d()).a(q0Var2, new c(true)).a(f0Var, new C1290e()).a(q0Var, new c(false)).c();
    }

    /* synthetic */ e(int i4, int i5, a aVar) {
        this(i4, i5);
    }

    private static void V(int i4, int i5) {
        if (i4 < 1 || i4 > 12) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鋤\u0001"), i4));
        }
        if (i5 < 1 || i5 > a0(i4)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("鋣\u0001") + l0(i4, i5));
        }
    }

    public static net.time4j.engine.x<e> W() {
        return f82700e;
    }

    public static e Y(net.time4j.base.a aVar) {
        l0 Y0 = l0.Y0(aVar);
        return new e(Y0.q(), Y0.t());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int a0(int i4) {
        if (i4 != 2) {
            return (i4 == 4 || i4 == 6 || i4 == 9 || i4 == 11) ? 30 : 31;
        }
        return 29;
    }

    public static e g0() {
        return (e) w0.g().f(f82700e);
    }

    public static e h0(int i4, int i5) {
        V(i4, i5);
        return new e(i4, i5);
    }

    public static e i0(e0 e0Var, int i4) {
        return h0(e0Var.getValue(), i4);
    }

    public static e j0(String str) throws ParseException {
        if (str.length() != 7 || str.charAt(0) != '-' || str.charAt(1) != '-' || str.charAt(4) != '-') {
            throw new ParseException(ProtectedSandApp.s("鋥\u0001").concat(str), str.length());
        }
        int k02 = k0(str, 2);
        return new e((k02 * 10) + k0(str, 3), (k0(str, 5) * 10) + k0(str, 6));
    }

    private static int k0(String str, int i4) throws ParseException {
        char charAt = str.charAt(i4);
        if (charAt < '0' || charAt > '9') {
            throw new ParseException(ProtectedSandApp.s("鋦\u0001").concat(str), i4);
        }
        return charAt - '0';
    }

    private static String l0(int i4, int i5) {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("鋧\u0001"));
        if (i4 < 10) {
            sb.append('0');
        }
        sb.append(i4);
        sb.append('-');
        if (i5 < 10) {
            sb.append('0');
        }
        sb.append(i5);
        return sb.toString();
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            V(this.month, this.dayOfMonth);
            return this;
        } catch (IllegalArgumentException e4) {
            throw new InvalidObjectException(e4.getMessage());
        }
    }

    public net.time4j.engine.v<l0> S() {
        return new a();
    }

    public net.time4j.engine.v<l0> T() {
        return new b();
    }

    public l0 U(int i4) {
        return l0.r1(i4, this.month, this.dayOfMonth);
    }

    @Override // java.lang.Comparable
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public int compareTo(e eVar) {
        int i4 = this.month;
        int i5 = eVar.month;
        if (i4 < i5) {
            return -1;
        }
        if (i4 > i5) {
            return 1;
        }
        int i6 = this.dayOfMonth;
        int i7 = eVar.dayOfMonth;
        if (i6 < i7) {
            return -1;
        }
        return i6 > i7 ? 1 : 0;
    }

    protected e Z() {
        return this;
    }

    public e0 b0() {
        return e0.valueOf(this.month);
    }

    @Override // net.time4j.engine.i0
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public boolean s(e eVar) {
        return compareTo(eVar) > 0;
    }

    @Override // net.time4j.engine.i0
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public boolean f(e eVar) {
        return compareTo(eVar) < 0;
    }

    @Override // net.time4j.engine.i0
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public boolean k(e eVar) {
        return compareTo(eVar) == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.month == eVar.month && this.dayOfMonth == eVar.dayOfMonth;
    }

    public boolean f0(int i4) {
        return i4 >= -999999999 && i4 <= 999999999 && !(this.month == 2 && this.dayOfMonth == 29 && !net.time4j.base.b.e(i4));
    }

    public int hashCode() {
        return (this.month << 16) + this.dayOfMonth;
    }

    public int t() {
        return this.dayOfMonth;
    }

    public String toString() {
        return l0(this.month, this.dayOfMonth);
    }

    @Override // net.time4j.engine.r
    protected net.time4j.engine.x<e> y() {
        return f82700e;
    }

    @Override // net.time4j.engine.r
    protected e z() {
        return this;
    }

    private e(int i4, int i5) {
        this.month = i4;
        this.dayOfMonth = i5;
    }
}
