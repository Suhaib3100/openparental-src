package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.mmkv.MMKV;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.engine.ChronoException;
import net.time4j.engine.j0;
import net.time4j.h;
import net.time4j.j1;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: PlainDate.java */
@net.time4j.format.c("iso8601")
/* loaded from: classes7.dex */
public final class l0 extends net.time4j.engine.n<x, l0> implements net.time4j.base.a, net.time4j.engine.f0<h>, net.time4j.format.h {

    @net.time4j.engine.d0(format = "F")
    public static final j0 A;
    private static final Map<String, Object> B;
    private static final net.time4j.engine.l<l0> C;
    private static final net.time4j.engine.j0<x, l0> D;

    /* renamed from: e, reason: collision with root package name */
    private static final int f83314e = 19;

    /* renamed from: f, reason: collision with root package name */
    static final l0 f83315f = new l0(-999999999, 1, 1);

    /* renamed from: g, reason: collision with root package name */
    static final l0 f83316g = new l0(999999999, 12, 31);

    /* renamed from: h, reason: collision with root package name */
    static final Integer f83317h = -999999999;

    /* renamed from: i, reason: collision with root package name */
    static final Integer f83318i = 999999999;

    /* renamed from: j, reason: collision with root package name */
    private static final Integer f83319j = 1;

    /* renamed from: k, reason: collision with root package name */
    private static final Integer f83320k = 12;

    /* renamed from: l, reason: collision with root package name */
    private static final Integer f83321l = 365;

    /* renamed from: m, reason: collision with root package name */
    private static final Integer f83322m = 366;

    /* renamed from: n, reason: collision with root package name */
    private static final int[] f83323n = {31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};

    /* renamed from: o, reason: collision with root package name */
    private static final int[] f83324o = {31, 60, 91, 121, SyslogAppender.LOG_LOCAL3, 182, 213, 244, 274, 305, 335, 366};

    /* renamed from: p, reason: collision with root package name */
    static final net.time4j.engine.q<l0> f83325p;

    /* renamed from: q, reason: collision with root package name */
    public static final net.time4j.f f83326q;

    /* renamed from: r, reason: collision with root package name */
    @net.time4j.engine.d0(format = "u")
    public static final net.time4j.c<Integer, l0> f83327r;

    /* renamed from: s, reason: collision with root package name */
    @net.time4j.engine.d0(format = "Y")
    public static final net.time4j.c<Integer, l0> f83328s;
    private static final long serialVersionUID = -6698431452072325688L;

    /* renamed from: t, reason: collision with root package name */
    @net.time4j.engine.d0(alt = "q", format = "Q")
    public static final f0<s0> f83329t;

    /* renamed from: u, reason: collision with root package name */
    @net.time4j.engine.d0(alt = "L", format = "M")
    public static final f0<e0> f83330u;

    /* renamed from: v, reason: collision with root package name */
    @net.time4j.engine.d0(format = "M")
    public static final q0<Integer, l0> f83331v;

    /* renamed from: w, reason: collision with root package name */
    @net.time4j.engine.d0(format = "d")
    public static final q0<Integer, l0> f83332w;

    /* renamed from: x, reason: collision with root package name */
    @net.time4j.engine.d0(format = "E")
    public static final f0<g1> f83333x;

    /* renamed from: y, reason: collision with root package name */
    @net.time4j.engine.d0(format = "D")
    public static final q0<Integer, l0> f83334y;

    /* renamed from: z, reason: collision with root package name */
    public static final q0<Integer, l0> f83335z;

    /* renamed from: b, reason: collision with root package name */
    private final transient int f83336b;

    /* renamed from: c, reason: collision with root package name */
    private final transient byte f83337c;

    /* renamed from: d, reason: collision with root package name */
    private final transient byte f83338d;

    /* compiled from: PlainDate.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f83339a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f83340b;

        static {
            int[] iArr = new int[s0.values().length];
            f83340b = iArr;
            try {
                iArr[s0.Q1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83340b[s0.Q2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[h.values().length];
            f83339a = iArr2;
            try {
                iArr2[h.MILLENNIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f83339a[h.CENTURIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f83339a[h.DECADES.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f83339a[h.YEARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f83339a[h.QUARTERS.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f83339a[h.MONTHS.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f83339a[h.WEEKS.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f83339a[h.DAYS.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: PlainDate.java */
    private static class b implements net.time4j.engine.a0<l0, l0> {
        private b() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(l0 l0Var) {
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(l0 l0Var) {
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public l0 getMaximum(l0 l0Var) {
            return l0.f83316g;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public l0 getMinimum(l0 l0Var) {
            return l0.f83315f;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public l0 getValue(l0 l0Var) {
            return l0Var;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(l0 l0Var, l0 l0Var2) {
            return l0Var2 != null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public l0 withValue(l0 l0Var, l0 l0Var2, boolean z4) {
            if (l0Var2 != null) {
                return l0Var2;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("鞐\u0001"));
        }

        b(a aVar) {
        }
    }

    /* compiled from: PlainDate.java */
    private static class c<V extends Enum<V>> implements net.time4j.engine.a0<l0, V> {

        /* renamed from: b, reason: collision with root package name */
        private final String f83341b;

        /* renamed from: c, reason: collision with root package name */
        private final Class<V> f83342c;

        /* renamed from: d, reason: collision with root package name */
        private final V f83343d;

        /* renamed from: e, reason: collision with root package name */
        private final V f83344e;

        /* renamed from: f, reason: collision with root package name */
        private final int f83345f;

        c(String str, Class<V> cls, V v4, V v5, int i4) {
            this.f83341b = str;
            this.f83342c = cls;
            this.f83343d = v4;
            this.f83344e = v5;
            this.f83345f = i4;
        }

        private net.time4j.engine.q<?> b() {
            switch (this.f83345f) {
                case 101:
                    return l0.f83332w;
                case 102:
                    return null;
                case 103:
                    return l0.f83335z;
                default:
                    throw new UnsupportedOperationException(this.f83341b);
            }
        }

        static <V extends Enum<V>> c<V> k(net.time4j.engine.q<V> qVar) {
            return new c<>(qVar.name(), qVar.getType(), qVar.getDefaultMinimum(), qVar.getDefaultMaximum(), ((r) qVar).E());
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(l0 l0Var) {
            return b();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(l0 l0Var) {
            return b();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public V getMaximum(l0 l0Var) {
            return (this.f83345f == 102 && l0Var.f83336b == 999999999 && l0Var.f83337c == 12 && l0Var.f83338d >= 27) ? this.f83342c.cast(g1.FRIDAY) : this.f83344e;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public V getMinimum(l0 l0Var) {
            return this.f83343d;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public V getValue(l0 l0Var) {
            Object valueOf;
            switch (this.f83345f) {
                case 101:
                    valueOf = e0.valueOf(l0Var.f83337c);
                    break;
                case 102:
                    valueOf = l0Var.d1();
                    break;
                case 103:
                    valueOf = s0.valueOf(((l0Var.f83337c - 1) / 3) + 1);
                    break;
                default:
                    throw new UnsupportedOperationException(this.f83341b);
            }
            return this.f83342c.cast(valueOf);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean j(l0 l0Var, V v4) {
            if (v4 == null) {
                return false;
            }
            if (this.f83345f != 102 || l0Var.f83336b != 999999999) {
                return true;
            }
            try {
                withValue(l0Var, v4, false);
                return true;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.a0
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public l0 withValue(l0 l0Var, V v4, boolean z4) {
            if (v4 == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("鞑\u0001"));
            }
            switch (this.f83345f) {
                case 101:
                    return l0Var.F1(((e0) e0.class.cast(v4)).getValue());
                case 102:
                    return l0Var.C1((g1) g1.class.cast(v4));
                case 103:
                    return (l0) l0Var.W(((s0) s0.class.cast(v4)).getValue() - androidx.appcompat.widget.a.a(l0Var.f83337c, 1, 3, 1), h.QUARTERS);
                default:
                    throw new UnsupportedOperationException(this.f83341b);
            }
        }
    }

    /* compiled from: PlainDate.java */
    private static class d implements net.time4j.engine.e0<l0> {

        /* renamed from: b, reason: collision with root package name */
        private final net.time4j.engine.q<?> f83346b;

        /* renamed from: c, reason: collision with root package name */
        private final String f83347c;

        /* renamed from: d, reason: collision with root package name */
        private final int f83348d;

        d(net.time4j.engine.q<Integer> qVar) {
            this(((v) qVar).E(), qVar);
        }

        private net.time4j.engine.q<?> b() {
            switch (this.f83348d) {
                case 14:
                    return l0.f83331v;
                case 15:
                    return l0.f83332w;
                case 16:
                case 17:
                case 18:
                case 19:
                    return null;
                default:
                    throw new UnsupportedOperationException(this.f83347c);
            }
        }

        private static int i(l0 l0Var) {
            int a5 = androidx.appcompat.widget.a.a(l0Var.f83337c, 1, 3, 1);
            return a5 == 1 ? net.time4j.base.b.e(l0Var.f83336b) ? 91 : 90 : a5 == 2 ? 91 : 92;
        }

        private int j(l0 l0Var) {
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                if ((i5 * 7) + l0Var.f83338d > net.time4j.base.b.d(l0Var.f83336b, l0Var.f83337c)) {
                    return ((((i4 * 7) + r5) - 1) / 7) + 1;
                }
                i4 = i5;
            }
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(l0 l0Var) {
            return b();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(l0 l0Var) {
            return b();
        }

        @Override // net.time4j.engine.e0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public int d(l0 l0Var) {
            switch (this.f83348d) {
                case 14:
                    return l0Var.f83336b;
                case 15:
                    return l0Var.f83337c;
                case 16:
                    return l0Var.f83338d;
                case 17:
                    return l0Var.e1();
                case 18:
                    return l0Var.c1();
                case 19:
                    return androidx.appcompat.widget.a.a(l0Var.f83338d, 1, 7, 1);
                default:
                    throw new UnsupportedOperationException(this.f83347c);
            }
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(l0 l0Var) {
            switch (this.f83348d) {
                case 14:
                    return l0.f83318i;
                case 15:
                    return l0.f83320k;
                case 16:
                    return Integer.valueOf(net.time4j.base.b.d(l0Var.f83336b, l0Var.f83337c));
                case 17:
                    return net.time4j.base.b.e(l0Var.f83336b) ? l0.f83322m : l0.f83321l;
                case 18:
                    return Integer.valueOf(i(l0Var));
                case 19:
                    return Integer.valueOf(j(l0Var));
                default:
                    throw new UnsupportedOperationException(this.f83347c);
            }
        }

        @Override // net.time4j.engine.a0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(l0 l0Var) {
            switch (this.f83348d) {
                case 14:
                    return l0.f83317h;
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    return l0.f83319j;
                default:
                    throw new UnsupportedOperationException(this.f83347c);
            }
        }

        @Override // net.time4j.engine.a0
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Integer getValue(l0 l0Var) {
            return Integer.valueOf(d(l0Var));
        }

        @Override // net.time4j.engine.e0
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public boolean e(l0 l0Var, int i4) {
            switch (this.f83348d) {
                case 14:
                    return i4 >= -999999999 && i4 <= 999999999;
                case 15:
                    return i4 >= 1 && i4 <= 12;
                case 16:
                    return i4 >= 1 && i4 <= net.time4j.base.b.d(l0Var.f83336b, l0Var.f83337c);
                case 17:
                    if (i4 >= 1) {
                        return i4 <= (net.time4j.base.b.e(l0Var.f83336b) ? 366 : 365);
                    }
                    return false;
                case 18:
                    return i4 >= 1 && i4 <= i(l0Var);
                case 19:
                    return i4 >= 1 && i4 <= j(l0Var);
                default:
                    throw new UnsupportedOperationException(this.f83347c);
            }
        }

        @Override // net.time4j.engine.a0
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public boolean j(l0 l0Var, Integer num) {
            return num != null && e(l0Var, num.intValue());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.e0
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public l0 a(l0 l0Var, int i4, boolean z4) {
            if (z4) {
                return (l0) l0Var.W(net.time4j.base.c.l(i4, d(l0Var)), (x) l0.D.t0(this.f83346b));
            }
            int i5 = this.f83348d;
            String s4 = ProtectedSandApp.s("鞒\u0001");
            switch (i5) {
                case 14:
                    return l0Var.G1(i4);
                case 15:
                    return l0Var.F1(i4);
                case 16:
                    return l0Var.B1(i4);
                case 17:
                    return l0Var.D1(i4);
                case 18:
                    if (i4 < 1 || i4 > i(l0Var)) {
                        throw new IllegalArgumentException(android.support.v4.media.a.a(s4, i4));
                    }
                    return (l0) l0Var.W(i4 - l0Var.c1(), h.DAYS);
                case 19:
                    if (z4 || (i4 >= 1 && i4 <= j(l0Var))) {
                        return (l0) l0Var.W(i4 - (((l0Var.f83338d - 1) / 7) + 1), h.WEEKS);
                    }
                    throw new IllegalArgumentException(android.support.v4.media.a.a(s4, i4));
                default:
                    throw new UnsupportedOperationException(this.f83347c);
            }
        }

        @Override // net.time4j.engine.a0
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public l0 withValue(l0 l0Var, Integer num, boolean z4) {
            if (num != null) {
                return a(l0Var, num.intValue(), z4);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("鞓\u0001"));
        }

        d(int i4, net.time4j.engine.q<?> qVar) {
            this.f83346b = qVar;
            this.f83347c = qVar.name();
            this.f83348d = i4;
        }
    }

    /* compiled from: PlainDate.java */
    private static class e implements net.time4j.engine.u<l0> {

        /* renamed from: b, reason: collision with root package name */
        private static final int f83349b = ((int) (net.time4j.base.b.l(net.time4j.engine.b0.MODIFIED_JULIAN_DATE.transform(net.time4j.base.c.b(System.currentTimeMillis(), 86400000), net.time4j.engine.b0.UNIX)) >> 32)) + 20;

        private e() {
        }

        private static void f(net.time4j.engine.r<?> rVar, String str) {
            net.time4j.engine.p0 p0Var = net.time4j.engine.p0.ERROR_MESSAGE;
            if (rVar.G(p0Var, str)) {
                rVar.M(p0Var, str);
            }
        }

        private static boolean i(net.time4j.engine.r<?> rVar, int i4, int i5, int i6) {
            if (i6 >= 1 && (i6 <= 28 || i6 <= net.time4j.base.b.d(i4, i5))) {
                return true;
            }
            f(rVar, android.support.v4.media.a.a(ProtectedSandApp.s("鞔\u0001"), i6));
            return false;
        }

        private static boolean j(net.time4j.engine.r<?> rVar, boolean z4, s0 s0Var, int i4) {
            int i5 = a.f83340b[s0Var.ordinal()];
            int i6 = 91;
            if (i5 != 1) {
                if (i5 != 2) {
                    i6 = 92;
                }
            } else if (!z4) {
                i6 = 90;
            }
            if (i4 >= 1 && i4 <= i6) {
                return true;
            }
            f(rVar, android.support.v4.media.a.a(ProtectedSandApp.s("鞕\u0001"), i4));
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
        
            if (r4 > (net.time4j.base.b.e(r3) ? 366 : 365)) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static boolean l(net.time4j.engine.r<?> r2, int r3, int r4) {
            /*
                r0 = 1
                if (r4 < r0) goto L13
                r1 = 365(0x16d, float:5.11E-43)
                if (r4 <= r1) goto L12
                boolean r3 = net.time4j.base.b.e(r3)
                if (r3 == 0) goto Lf
                r1 = 366(0x16e, float:5.13E-43)
            Lf:
                if (r4 <= r1) goto L12
                goto L13
            L12:
                return r0
            L13:
                java.lang.String r3 = "鞖\u0001"
                java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
                java.lang.String r3 = android.support.v4.media.a.a(r3, r4)
                f(r2, r3)
                r2 = 0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: net.time4j.l0.e.l(net.time4j.engine.r, int, int):boolean");
        }

        private static boolean m(net.time4j.engine.r<?> rVar, int i4) {
            if (i4 >= 1 && i4 <= 12) {
                return true;
            }
            f(rVar, android.support.v4.media.a.a(ProtectedSandApp.s("鞗\u0001"), i4));
            return false;
        }

        private static boolean p(net.time4j.engine.r<?> rVar, int i4) {
            if (i4 >= -999999999 && i4 <= 999999999) {
                return true;
            }
            f(rVar, android.support.v4.media.a.a(ProtectedSandApp.s("鞘\u0001"), i4));
            return false;
        }

        @Override // net.time4j.engine.u
        public net.time4j.engine.g0 a() {
            return net.time4j.engine.g0.f82720a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v2, types: [net.time4j.base.f] */
        @Override // net.time4j.engine.u
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l0 o(net.time4j.base.e<?> eVar, net.time4j.engine.d dVar) {
            net.time4j.tz.l lVar;
            net.time4j.engine.c<net.time4j.tz.k> cVar = net.time4j.format.a.f82782d;
            if (dVar.c(cVar)) {
                lVar = net.time4j.tz.l.c0((net.time4j.tz.k) dVar.a(cVar));
            } else {
                if (!((net.time4j.format.g) dVar.b(net.time4j.format.a.f82784f, net.time4j.format.g.SMART)).isLax()) {
                    return null;
                }
                lVar = net.time4j.tz.l.e0();
            }
            ?? c5 = eVar.c();
            return l0.Z0(c5, lVar.I(c5));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.u
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public l0 e(net.time4j.engine.r<?> rVar, net.time4j.engine.d dVar, boolean z4, boolean z5) {
            g1 g1Var;
            q0<Integer, l0> q0Var;
            int l4;
            net.time4j.engine.q<l0> qVar = l0.f83325p;
            if (rVar.w(qVar)) {
                return (l0) rVar.r(qVar);
            }
            int l5 = rVar.l(l0.f83327r);
            if (l5 != Integer.MIN_VALUE) {
                q0<Integer, l0> q0Var2 = l0.f83331v;
                int l6 = rVar.l(q0Var2);
                if (l6 == Integer.MIN_VALUE) {
                    f0<e0> f0Var = l0.f83330u;
                    if (rVar.w(f0Var)) {
                        l6 = ((e0) rVar.r(f0Var)).getValue();
                    }
                }
                if (l6 != Integer.MIN_VALUE && (l4 = rVar.l((q0Var = l0.f83332w))) != Integer.MIN_VALUE) {
                    if (z4) {
                        return (l0) ((l0) l0.r1(l5, 1, 1).N(q0Var2.d0(Integer.valueOf(l6)))).N(q0Var.d0(Integer.valueOf(l4)));
                    }
                    if (p(rVar, l5) && m(rVar, l6) && i(rVar, l5, l6, l4)) {
                        return l0.s1(l5, l6, l4, false);
                    }
                    return null;
                }
                q0<Integer, l0> q0Var3 = l0.f83334y;
                int l7 = rVar.l(q0Var3);
                if (l7 != Integer.MIN_VALUE) {
                    if (z4) {
                        return (l0) l0.q1(l5, 1).N(q0Var3.d0(Integer.valueOf(l7)));
                    }
                    if (p(rVar, l5) && l(rVar, l5, l7)) {
                        return l0.q1(l5, l7);
                    }
                    return null;
                }
                int l10 = rVar.l(l0.f83335z);
                if (l10 != Integer.MIN_VALUE) {
                    f0<s0> f0Var2 = l0.f83329t;
                    if (rVar.w(f0Var2)) {
                        s0 s0Var = (s0) rVar.r(f0Var2);
                        boolean e4 = net.time4j.base.b.e(l5);
                        int i4 = (e4 ? 91 : 90) + l10;
                        if (s0Var == s0.Q1) {
                            i4 = l10;
                        } else if (s0Var == s0.Q3) {
                            i4 += 91;
                        } else if (s0Var == s0.Q4) {
                            i4 += 183;
                        }
                        if (z4) {
                            return (l0) l0.q1(l5, 1).N(q0Var3.d0(Integer.valueOf(i4)));
                        }
                        if (p(rVar, l5) && j(rVar, e4, s0Var, l10)) {
                            return l0.q1(l5, i4);
                        }
                        return null;
                    }
                }
            }
            int l11 = rVar.l(l0.f83328s);
            if (l11 != Integer.MIN_VALUE) {
                i1 i1Var = i1.f83248r;
                if (rVar.w(i1Var.p())) {
                    int intValue = ((Integer) rVar.r(i1Var.p())).intValue();
                    f0<g1> f0Var3 = l0.f83333x;
                    if (!rVar.w(f0Var3)) {
                        if (rVar.w(i1Var.j())) {
                            g1Var = (g1) rVar.r(i1Var.j());
                        }
                        return null;
                    }
                    g1Var = (g1) rVar.r(f0Var3);
                    if (l11 < -999999999 || l11 > 999999999) {
                        f(rVar, l0.I1(l11));
                        return null;
                    }
                    l0 u12 = l0.u1(l11, intValue, g1Var, false);
                    if (u12 == null) {
                        f(rVar, l0.H1(intValue));
                    }
                    return u12;
                }
            }
            net.time4j.engine.b0 b0Var = net.time4j.engine.b0.MODIFIED_JULIAN_DATE;
            if (rVar.w(b0Var)) {
                return (l0) l0.C.e(net.time4j.engine.b0.UTC.transform(((Long) rVar.r(b0Var)).longValue(), b0Var));
            }
            if (rVar instanceof net.time4j.base.f) {
                return n0.h0().e(rVar, dVar, z4, z5).k0();
            }
            return null;
        }

        @Override // net.time4j.engine.u
        public net.time4j.engine.x<?> d() {
            return null;
        }

        @Override // net.time4j.engine.u
        public int g() {
            return f83349b;
        }

        @Override // net.time4j.engine.u
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p k(l0 l0Var, net.time4j.engine.d dVar) {
            return l0Var;
        }

        @Override // net.time4j.engine.u
        public String n(net.time4j.engine.z zVar, Locale locale) {
            return net.time4j.format.b.t(net.time4j.format.e.ofStyle(zVar.getStyleValue()), locale);
        }

        e(a aVar) {
        }
    }

    /* compiled from: PlainDate.java */
    private static class f implements net.time4j.engine.l<l0> {

        /* renamed from: a, reason: collision with root package name */
        private static final long f83350a = -365243219892L;

        /* renamed from: b, reason: collision with root package name */
        private static final long f83351b = 365241779741L;

        private f() {
        }

        @Override // net.time4j.engine.l
        public List<net.time4j.engine.j> a() {
            return Collections.emptyList();
        }

        @Override // net.time4j.engine.l
        public long d() {
            return f83351b;
        }

        @Override // net.time4j.engine.l
        public long g() {
            return f83350a;
        }

        @Override // net.time4j.engine.l
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public long f(l0 l0Var) {
            return net.time4j.engine.b0.UTC.transform(net.time4j.base.b.k(l0Var), net.time4j.engine.b0.MODIFIED_JULIAN_DATE);
        }

        @Override // net.time4j.engine.l
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public l0 e(long j4) {
            if (j4 == f83350a) {
                return l0.f83315f;
            }
            if (j4 == f83351b) {
                return l0.f83316g;
            }
            long l4 = net.time4j.base.b.l(net.time4j.engine.b0.MODIFIED_JULIAN_DATE.transform(j4, net.time4j.engine.b0.UTC));
            return l0.r1((int) (l4 >> 32), net.time4j.base.b.h(l4), (int) (l4 & 255));
        }

        f(a aVar) {
        }
    }

    static {
        k kVar = k.f83303b;
        f83325p = kVar;
        f83326q = kVar;
        v B2 = v.B(ProtectedSandApp.s("鞙\u0001"), 14, -999999999, 999999999, 'u');
        f83327r = B2;
        j1 j1Var = j1.f83299h;
        f83328s = j1Var;
        r rVar = new r(ProtectedSandApp.s("鞚\u0001"), s0.class, s0.Q1, s0.Q4, 103, 'Q');
        f83329t = rVar;
        r rVar2 = new r(ProtectedSandApp.s("鞛\u0001"), e0.class, e0.JANUARY, e0.DECEMBER, 101, 'M');
        f83330u = rVar2;
        v B3 = v.B(ProtectedSandApp.s("鞜\u0001"), 15, 1, 12, 'M');
        f83331v = B3;
        v B4 = v.B(ProtectedSandApp.s("鞝\u0001"), 16, 1, 31, 'd');
        f83332w = B4;
        r rVar3 = new r(ProtectedSandApp.s("鞞\u0001"), g1.class, g1.MONDAY, g1.SUNDAY, 102, 'E');
        f83333x = rVar3;
        v B5 = v.B(ProtectedSandApp.s("鞟\u0001"), 17, 1, 365, 'D');
        f83334y = B5;
        v B6 = v.B(ProtectedSandApp.s("鞠\u0001"), 18, 1, 92, (char) 0);
        f83335z = B6;
        h1 h1Var = h1.f83140e;
        A = h1Var;
        HashMap hashMap = new HashMap();
        V0(hashMap, kVar);
        V0(hashMap, B2);
        V0(hashMap, j1Var);
        V0(hashMap, rVar);
        V0(hashMap, rVar2);
        V0(hashMap, B3);
        V0(hashMap, B4);
        V0(hashMap, rVar3);
        V0(hashMap, B5);
        V0(hashMap, B6);
        V0(hashMap, h1Var);
        B = Collections.unmodifiableMap(hashMap);
        f fVar = new f();
        C = fVar;
        j0.c m4 = j0.c.m(x.class, l0.class, new e(), fVar);
        b bVar = new b();
        h hVar = h.DAYS;
        j0.c g4 = m4.g(kVar, bVar, hVar).g(B2, new d(B2), h.YEARS).g(j1Var, new j1.b(), f1.f82779b).g(rVar, c.k(rVar), h.QUARTERS);
        c k4 = c.k(rVar2);
        h hVar2 = h.MONTHS;
        j0.c g5 = g4.g(rVar2, k4, hVar2).g(B3, new d(B3), hVar2).g(B4, new d(B4), hVar).g(rVar3, c.k(rVar3), hVar).g(B5, new d(B5), hVar).g(B6, new d(B6), hVar).g(h1Var, new d(19, h1Var), h.WEEKS);
        A1(g5);
        z1(g5);
        D = g5.c();
    }

    private l0(int i4, int i5, int i6) {
        this.f83336b = i4;
        this.f83337c = (byte) i5;
        this.f83338d = (byte) i6;
    }

    private static void A1(j0.c<x, l0> cVar) {
        Set<? extends x> range = EnumSet.range(h.MILLENNIA, h.MONTHS);
        Set<? extends x> range2 = EnumSet.range(h.WEEKS, h.DAYS);
        for (h hVar : h.values()) {
            cVar.j(hVar, new h.j<>(hVar, 0), hVar.getLength(), hVar.compareTo(h.WEEKS) < 0 ? range : range2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public l0 B1(int i4) {
        return this.f83338d == i4 ? this : s1(this.f83336b, this.f83337c, i4, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public l0 C1(g1 g1Var) {
        if (d1() == g1Var) {
            return this;
        }
        net.time4j.engine.l<l0> lVar = C;
        return lVar.e(net.time4j.base.c.f(lVar.f(this), g1Var.getValue() - r0.getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public l0 D1(int i4) {
        return e1() == i4 ? this : q1(this.f83336b, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public l0 F1(int i4) {
        if (this.f83337c == i4) {
            return this;
        }
        return s1(this.f83336b, i4, Math.min(net.time4j.base.b.d(this.f83336b, i4), (int) this.f83338d), true);
    }

    private static l0 G0(l0 l0Var, long j4) {
        long f4 = net.time4j.base.c.f(l0Var.f83338d, j4);
        if (f4 >= 1 && f4 <= 28) {
            return s1(l0Var.f83336b, l0Var.f83337c, (int) f4, true);
        }
        long f5 = net.time4j.base.c.f(l0Var.e1(), j4);
        if (f5 >= 1 && f5 <= 365) {
            return q1(l0Var.f83336b, (int) f5);
        }
        net.time4j.engine.l<l0> lVar = C;
        return lVar.e(net.time4j.base.c.f(lVar.f(l0Var), j4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public l0 G1(int i4) {
        if (this.f83336b == i4) {
            return this;
        }
        return s1(i4, this.f83337c, Math.min(net.time4j.base.b.d(i4, this.f83337c), (int) this.f83338d), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String H1(int i4) {
        return android.support.v4.media.a.a(ProtectedSandApp.s("鞡\u0001"), i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String I1(int i4) {
        return android.support.v4.media.a.a(ProtectedSandApp.s("鞢\u0001"), i4);
    }

    private d0 K0(net.time4j.tz.l lVar) {
        net.time4j.tz.m F = lVar.F();
        if (F != null) {
            m0 m0Var = m0.f83366q;
            net.time4j.tz.q a5 = F.a(this, m0Var);
            return (a5 == null || !a5.j()) ? n0.B0(this, m0Var).n0(lVar) : d0.W0(a5.e(), net.time4j.scale.f.POSIX);
        }
        throw new UnsupportedOperationException(ProtectedSandApp.s("鞣\u0001") + net.time4j.tz.l.L());
    }

    private n0 P0(net.time4j.tz.m mVar) {
        if (mVar == null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("鞣\u0001") + net.time4j.tz.l.L());
        }
        m0 m0Var = m0.f83366q;
        net.time4j.tz.q a5 = mVar.a(this, m0Var);
        if (a5 == null || !a5.j()) {
            return n0.B0(this, m0Var);
        }
        long e4 = a5.e() + a5.i();
        l0 w12 = w1(net.time4j.base.c.b(e4, MMKV.ExpireInDay), net.time4j.engine.b0.UNIX);
        int d5 = net.time4j.base.c.d(e4, MMKV.ExpireInDay);
        int i4 = d5 % 60;
        int i5 = d5 / 60;
        return n0.B0(w12, m0.c1(i5 / 60, i5 % 60, i4));
    }

    public static <S> net.time4j.engine.x<S> S0(net.time4j.engine.y<S, l0> yVar) {
        return new net.time4j.engine.g(yVar, D);
    }

    public static net.time4j.engine.j0<x, l0> T0() {
        return D;
    }

    static l0 U0(h hVar, l0 l0Var, long j4, int i4) {
        switch (a.f83339a[hVar.ordinal()]) {
            case 1:
                return U0(h.MONTHS, l0Var, net.time4j.base.c.i(j4, 12000L), i4);
            case 2:
                return U0(h.MONTHS, l0Var, net.time4j.base.c.i(j4, 1200L), i4);
            case 3:
                return U0(h.MONTHS, l0Var, net.time4j.base.c.i(j4, 120L), i4);
            case 4:
                return U0(h.MONTHS, l0Var, net.time4j.base.c.i(j4, 12L), i4);
            case 5:
                return U0(h.MONTHS, l0Var, net.time4j.base.c.i(j4, 3L), i4);
            case 6:
                return a1(l0Var, net.time4j.base.c.f(l0Var.g1(), j4), l0Var.f83338d, i4);
            case 7:
                return U0(h.DAYS, l0Var, net.time4j.base.c.i(j4, 7L), i4);
            case 8:
                return G0(l0Var, j4);
            default:
                throw new UnsupportedOperationException(hVar.name());
        }
    }

    private static void V0(Map<String, Object> map, net.time4j.engine.q<?> qVar) {
        map.put(qVar.name(), qVar);
    }

    private static void W0(StringBuilder sb, int i4) {
        sb.append('-');
        if (i4 < 10) {
            sb.append('0');
        }
        sb.append(i4);
    }

    private static void X0(StringBuilder sb, int i4) {
        int i5;
        if (i4 < 0) {
            sb.append('-');
            i5 = net.time4j.base.c.j(i4);
        } else {
            i5 = i4;
        }
        if (i5 >= 10000) {
            if (i4 > 0) {
                sb.append('+');
            }
        } else if (i5 < 1000) {
            sb.append('0');
            if (i5 < 100) {
                sb.append('0');
                if (i5 < 10) {
                    sb.append('0');
                }
            }
        }
        sb.append(i5);
    }

    public static l0 Y0(net.time4j.base.a aVar) {
        return aVar instanceof l0 ? (l0) aVar : s1(aVar.o(), aVar.q(), aVar.t(), true);
    }

    static l0 Z0(net.time4j.base.f fVar, net.time4j.tz.p pVar) {
        long j4 = fVar.j() + pVar.i();
        int h4 = pVar.h() + fVar.a();
        if (h4 < 0) {
            j4--;
        } else if (h4 >= 1000000000) {
            j4++;
        }
        long l4 = net.time4j.base.b.l(net.time4j.engine.b0.MODIFIED_JULIAN_DATE.transform(net.time4j.base.c.b(j4, MMKV.ExpireInDay), net.time4j.engine.b0.UNIX));
        return s1((int) (l4 >> 32), net.time4j.base.b.h(l4), (int) (l4 & 255), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r11 == 2) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static net.time4j.l0 a1(net.time4j.l0 r7, long r8, int r10, int r11) {
        /*
            r0 = 5
            r1 = 2
            if (r11 != r0) goto Ld
            byte r0 = r7.f83338d
            int r2 = r7.l1()
            if (r0 != r2) goto Ld
            r11 = r1
        Ld:
            r0 = 12
            long r2 = net.time4j.base.c.b(r8, r0)
            r4 = 1970(0x7b2, double:9.733E-321)
            long r2 = net.time4j.base.c.f(r2, r4)
            int r2 = net.time4j.base.c.g(r2)
            int r0 = net.time4j.base.c.d(r8, r0)
            r3 = 1
            int r0 = r0 + r3
            int r4 = net.time4j.base.b.d(r2, r0)
            if (r10 <= r4) goto L72
            r5 = 1
            switch(r11) {
                case 0: goto L76;
                case 1: goto L69;
                case 2: goto L76;
                case 3: goto L5f;
                case 4: goto L3f;
                case 5: goto L76;
                case 6: goto L76;
                default: goto L2e;
            }
        L2e:
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            java.lang.String r8 = "鞤\u0001"
            java.lang.String r8 = com.flashget.parentalcontrol.ProtectedSandApp.s(r8)
            java.lang.String r8 = android.support.v4.media.a.a(r8, r11)
            r7.<init>(r8)
            throw r7
        L3f:
            r7 = 32
            java.lang.String r8 = "鞥\u0001"
            java.lang.String r8 = com.flashget.parentalcontrol.ProtectedSandApp.s(r8)
            java.lang.StringBuilder r7 = androidx.fragment.app.a.a(r7, r8)
            X0(r7, r2)
            W0(r7, r0)
            W0(r7, r10)
            net.time4j.engine.ChronoException r8 = new net.time4j.engine.ChronoException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L5f:
            long r8 = net.time4j.base.c.f(r8, r5)
            int r10 = r10 - r4
            net.time4j.l0 r7 = a1(r7, r8, r10, r11)
            return r7
        L69:
            long r8 = net.time4j.base.c.f(r8, r5)
            net.time4j.l0 r7 = a1(r7, r8, r3, r11)
            return r7
        L72:
            if (r10 >= r4) goto L77
            if (r11 != r1) goto L77
        L76:
            r10 = r4
        L77:
            net.time4j.l0 r7 = s1(r2, r0, r10, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.l0.a1(net.time4j.l0, long, int, int):net.time4j.l0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c1() {
        switch (this.f83337c) {
            case 1:
            case 4:
            case 7:
            case 10:
                return this.f83338d;
            case 2:
            case 8:
            case 11:
                return this.f83338d + com.google.common.base.c.I;
            case 3:
                return (net.time4j.base.b.e(this.f83336b) ? (byte) 60 : (byte) 59) + this.f83338d;
            case 5:
                return this.f83338d + com.google.common.base.c.H;
            case 6:
            case 12:
                return this.f83338d + kotlin.io.encoding.a.f75126h;
            case 9:
                return this.f83338d + 62;
            default:
                throw new AssertionError(ProtectedSandApp.s("鞦\u0001") + ((int) this.f83337c));
        }
    }

    public static boolean j1(int i4, int i5, int i6) {
        return net.time4j.base.b.f(i4, i5, i6);
    }

    static Object n1(String str) {
        return B.get(str);
    }

    public static l0 p1() {
        return k1.g().h();
    }

    public static l0 q1(int i4, int i5) {
        String s4 = ProtectedSandApp.s("鞧\u0001");
        if (i5 < 1) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(s4, i5));
        }
        if (i5 <= 31) {
            return s1(i4, 1, i5, true);
        }
        int[] iArr = net.time4j.base.b.e(i4) ? f83324o : f83323n;
        for (int i6 = i5 > iArr[6] ? 7 : 1; i6 < 12; i6++) {
            if (i5 <= iArr[i6]) {
                return s1(i4, i6 + 1, i5 - iArr[i6 - 1], false);
            }
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a(s4, i5));
    }

    public static l0 r1(int i4, int i5, int i6) {
        return s1(i4, i5, i6, true);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException(ProtectedSandApp.s("鞨\u0001"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static l0 s1(int i4, int i5, int i6, boolean z4) {
        if (z4) {
            net.time4j.base.b.a(i4, i5, i6);
        }
        return new l0(i4, i5, i6);
    }

    public static l0 t1(int i4, int i5, g1 g1Var) {
        return u1(i4, i5, g1Var, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static l0 u1(int i4, int i5, g1 g1Var, boolean z4) {
        if (i5 < 1 || i5 > 53) {
            if (z4) {
                throw new IllegalArgumentException(H1(i5));
            }
            return null;
        }
        if (z4 && (i4 < f83317h.intValue() || i4 > f83318i.intValue())) {
            throw new IllegalArgumentException(I1(i4));
        }
        int value = g1.valueOf(net.time4j.base.b.c(i4, 1, 1)).getValue();
        int value2 = (g1Var.getValue() + androidx.core.graphics.y.a(i5, 1, 7, value <= 4 ? 2 - value : 9 - value)) - 1;
        if (value2 <= 0) {
            i4--;
            value2 += net.time4j.base.b.e(i4) ? 366 : 365;
        } else {
            int i6 = net.time4j.base.b.e(i4) ? 366 : 365;
            if (value2 > i6) {
                value2 -= i6;
                i4++;
            }
        }
        l0 q12 = q1(i4, value2);
        if (i5 != 53 || q12.h1() == 53) {
            return q12;
        }
        if (z4) {
            throw new IllegalArgumentException(H1(i5));
        }
        return null;
    }

    public static l0 v1(int i4, e0 e0Var, int i5) {
        return s1(i4, e0Var.getValue(), i5, true);
    }

    public static l0 w1(long j4, net.time4j.engine.b0 b0Var) {
        return C.e(net.time4j.engine.b0.UTC.transform(j4, b0Var));
    }

    private Object writeReplace() {
        return new SPX(this, 1);
    }

    public static l0 x1(String str, net.time4j.format.t<l0> tVar) {
        try {
            return tVar.f(str);
        } catch (ParseException e4) {
            throw new ChronoException(e4.getMessage(), (Throwable) e4);
        }
    }

    private static void z1(j0.c<x, l0> cVar) {
        for (net.time4j.engine.s sVar : net.time4j.base.d.c().g(net.time4j.engine.s.class)) {
            if (sVar.d(l0.class)) {
                cVar.h(sVar);
            }
        }
        cVar.h(new e1());
    }

    l0 E1(long j4) {
        return C.e(j4);
    }

    public n0 H0(m0 m0Var) {
        return n0.B0(this, m0Var);
    }

    public d0 I0(String str) {
        return K0(net.time4j.tz.l.Z(str));
    }

    public d0 J0(net.time4j.tz.k kVar) {
        return K0(net.time4j.tz.l.c0(kVar));
    }

    public n0 L0() {
        return n0.B0(this, m0.f83366q);
    }

    public n0 N0(String str) {
        return P0(net.time4j.tz.l.Z(str).F());
    }

    public n0 O0(net.time4j.tz.k kVar) {
        return P0(net.time4j.tz.l.c0(kVar).F());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.m0
    /* renamed from: Q */
    public net.time4j.engine.j0<x, l0> y() {
        return D;
    }

    public n0 Q0(int i4, int i5) {
        return n0.B0(this, m0.b1(i4, i5));
    }

    public n0 R0(int i4, int i5, int i6) {
        return n0.B0(this, m0.c1(i4, i5, i6));
    }

    @Override // net.time4j.engine.n
    protected int a0(net.time4j.engine.h hVar) {
        if (!(hVar instanceof l0)) {
            return super.a0(hVar);
        }
        l0 l0Var = (l0) hVar;
        int i4 = this.f83336b - l0Var.f83336b;
        if (i4 != 0) {
            return i4;
        }
        int i5 = this.f83337c - l0Var.f83337c;
        return i5 == 0 ? this.f83338d - l0Var.f83338d : i5;
    }

    protected l0 b1() {
        return this;
    }

    public g1 d1() {
        return g1.valueOf(net.time4j.base.b.c(this.f83336b, this.f83337c, this.f83338d));
    }

    public int e1() {
        byte b5 = this.f83337c;
        if (b5 == 1) {
            return this.f83338d;
        }
        if (b5 == 2) {
            return this.f83338d + com.google.common.base.c.I;
        }
        return (net.time4j.base.b.e(this.f83336b) ? 1 : 0) + f83323n[b5 - 2] + this.f83338d;
    }

    @Override // net.time4j.engine.n, net.time4j.engine.m0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f83338d == l0Var.f83338d && this.f83337c == l0Var.f83337c && this.f83336b == l0Var.f83336b;
    }

    long f1() {
        return C.f(this);
    }

    long g1() {
        return (((this.f83336b - 1970) * 12) + this.f83337c) - 1;
    }

    int h1() {
        return ((Integer) r(i1.f83248r.p())).intValue();
    }

    @Override // net.time4j.engine.n, net.time4j.engine.m0
    public int hashCode() {
        int i4 = this.f83336b;
        return (((i4 << 11) + (this.f83337c << 6)) + this.f83338d) ^ (i4 & (-2048));
    }

    public boolean i1() {
        return net.time4j.base.b.e(this.f83336b);
    }

    public boolean k1(Locale locale) {
        return J(i1.k(locale).q());
    }

    public int l1() {
        return net.time4j.base.b.d(this.f83336b, this.f83337c);
    }

    public int m1() {
        return net.time4j.base.b.e(this.f83336b) ? 366 : 365;
    }

    @Override // net.time4j.base.a
    public int o() {
        return this.f83336b;
    }

    @Override // net.time4j.engine.f0
    /* renamed from: o1, reason: merged with bridge method [inline-methods] */
    public p<h> d(net.time4j.engine.n0<? extends h> n0Var) {
        return (p) Z(X(n0Var), p.R());
    }

    @Override // net.time4j.base.a
    public int q() {
        return this.f83337c;
    }

    @Override // net.time4j.base.a
    public int t() {
        return this.f83338d;
    }

    @Override // net.time4j.engine.m0
    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        X0(sb, this.f83336b);
        W0(sb, this.f83337c);
        W0(sb, this.f83338d);
        return sb.toString();
    }

    @Override // net.time4j.engine.m0, net.time4j.engine.r
    protected net.time4j.engine.x y() {
        return D;
    }

    public String y1(net.time4j.format.t<l0> tVar) {
        return tVar.h(this);
    }

    @Override // net.time4j.engine.r
    protected net.time4j.engine.r z() {
        return this;
    }
}
