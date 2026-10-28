package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: UnitPatterns.java */
/* loaded from: classes7.dex */
final class a1 {

    /* renamed from: n, reason: collision with root package name */
    private static final int f81817n = 2;

    /* renamed from: o, reason: collision with root package name */
    private static final int f81818o = 7;

    /* renamed from: p, reason: collision with root package name */
    private static final ConcurrentMap<Locale, a1> f81819p = new ConcurrentHashMap();

    /* renamed from: q, reason: collision with root package name */
    private static final z[] f81820q = {h.YEARS, h.MONTHS, h.WEEKS, h.DAYS, j.HOURS, j.MINUTES, j.SECONDS, j.MILLIS, j.MICROS, j.NANOS};

    /* renamed from: r, reason: collision with root package name */
    private static final net.time4j.format.z f81821r;

    /* renamed from: s, reason: collision with root package name */
    private static final net.time4j.format.z f81822s;

    /* renamed from: a, reason: collision with root package name */
    private final Locale f81823a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<z, Map<net.time4j.format.x, Map<net.time4j.format.n, String>>> f81824b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<z, Map<net.time4j.format.n, String>> f81825c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<z, Map<net.time4j.format.n, String>> f81826d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<z, Map<net.time4j.format.n, String>> f81827e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<z, Map<net.time4j.format.n, String>> f81828f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<Integer, Map<net.time4j.format.x, String>> f81829g;

    /* renamed from: h, reason: collision with root package name */
    private final String f81830h;

    /* renamed from: i, reason: collision with root package name */
    private final String f81831i;

    /* renamed from: j, reason: collision with root package name */
    private final String f81832j;

    /* renamed from: k, reason: collision with root package name */
    private final String f81833k;

    /* renamed from: l, reason: collision with root package name */
    private final Map<g1, String> f81834l;

    /* renamed from: m, reason: collision with root package name */
    private final Map<g1, String> f81835m;

    /* compiled from: UnitPatterns.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f81836a;

        static {
            int[] iArr = new int[net.time4j.format.x.values().length];
            f81836a = iArr;
            try {
                iArr[net.time4j.format.x.WIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f81836a[net.time4j.format.x.ABBREVIATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f81836a[net.time4j.format.x.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f81836a[net.time4j.format.x.NARROW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: UnitPatterns.java */
    private static class b implements net.time4j.format.z {
        private b() {
        }

        private static String F(String str, String str2, String str3, net.time4j.format.x xVar, net.time4j.format.n nVar) {
            int i4 = a.f81836a[xVar.ordinal()];
            if (i4 == 1) {
                return G(str, nVar);
            }
            if (i4 == 2 || i4 == 3) {
                return G(str2, nVar);
            }
            if (i4 == 4) {
                return androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("覉\u0001"), str3);
            }
            throw new UnsupportedOperationException(xVar.name());
        }

        private static String G(String str, net.time4j.format.n nVar) {
            return android.support.v4.media.d.a(ProtectedSandApp.s("見\u0001"), str, nVar == net.time4j.format.n.ONE ? "" : ProtectedSandApp.s("覊\u0001"));
        }

        private static String H(String str, boolean z4, net.time4j.format.n nVar) {
            String s4 = nVar == net.time4j.format.n.ONE ? "" : ProtectedSandApp.s("覊\u0001");
            return z4 ? android.support.v4.media.d.a(ProtectedSandApp.s("覌\u0001"), str, s4) : androidx.fragment.app.y.a(ProtectedSandApp.s("見\u0001"), str, s4, ProtectedSandApp.s("覍\u0001"));
        }

        private static String I(String str, boolean z4) {
            return androidx.fragment.app.k0.a(new StringBuilder(), z4 ? ProtectedSandApp.s("覎\u0001") : ProtectedSandApp.s("規\u0001"), ProtectedSandApp.s("見\u0001"), str);
        }

        private static String J(String str) {
            return androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("見\u0001"), str);
        }

        @Override // net.time4j.format.z
        public String B(Locale locale, net.time4j.format.x xVar, net.time4j.format.n nVar) {
            boolean equals = locale.getLanguage().equals(ProtectedSandApp.s("覐\u0001"));
            String s4 = ProtectedSandApp.s("覑\u0001");
            return equals ? F(ProtectedSandApp.s("覒\u0001"), ProtectedSandApp.s("覓\u0001"), s4, xVar, nVar) : J(s4);
        }

        @Override // net.time4j.format.z
        public String C(Locale locale, boolean z4, net.time4j.format.n nVar) {
            return locale.getLanguage().equals(ProtectedSandApp.s("覐\u0001")) ? H(ProtectedSandApp.s("覔\u0001"), z4, nVar) : I(ProtectedSandApp.s("覕\u0001"), z4);
        }

        @Override // net.time4j.format.z
        public String c(Locale locale) {
            return ProtectedSandApp.s("視\u0001");
        }

        @Override // net.time4j.format.z
        public String d(Locale locale, boolean z4, net.time4j.format.n nVar) {
            return locale.getLanguage().equals(ProtectedSandApp.s("覐\u0001")) ? H(ProtectedSandApp.s("覗\u0001"), z4, nVar) : I(ProtectedSandApp.s("覊\u0001"), z4);
        }

        @Override // net.time4j.format.z
        public String e(Locale locale, net.time4j.format.x xVar, net.time4j.format.n nVar) {
            boolean equals = locale.getLanguage().equals(ProtectedSandApp.s("覐\u0001"));
            String s4 = ProtectedSandApp.s("覕\u0001");
            return equals ? F(ProtectedSandApp.s("覔\u0001"), s4, ProtectedSandApp.s("覘\u0001"), xVar, nVar) : J(s4);
        }

        @Override // net.time4j.format.z
        public String f(Locale locale, boolean z4, net.time4j.format.n nVar) {
            return locale.getLanguage().equals(ProtectedSandApp.s("覐\u0001")) ? H(ProtectedSandApp.s("覙\u0001"), z4, nVar) : I(ProtectedSandApp.s("覘\u0001"), z4);
        }

        @Override // net.time4j.format.z
        public String g(Locale locale, net.time4j.format.x xVar, net.time4j.format.n nVar) {
            boolean equals = locale.getLanguage().equals(ProtectedSandApp.s("覐\u0001"));
            String s4 = ProtectedSandApp.s("覚\u0001");
            return equals ? F(ProtectedSandApp.s("覛\u0001"), ProtectedSandApp.s("覜\u0001"), s4, xVar, nVar) : J(s4);
        }

        @Override // net.time4j.format.z
        public String i(Locale locale, boolean z4, net.time4j.format.n nVar) {
            return locale.getLanguage().equals(ProtectedSandApp.s("覐\u0001")) ? H(ProtectedSandApp.s("覝\u0001"), z4, nVar) : I(ProtectedSandApp.s("覞\u0001"), z4);
        }

        @Override // net.time4j.format.z
        public String k(Locale locale, net.time4j.format.x xVar, net.time4j.format.n nVar) {
            boolean equals = locale.getLanguage().equals(ProtectedSandApp.s("覐\u0001"));
            String s4 = ProtectedSandApp.s("覟\u0001");
            return equals ? F(ProtectedSandApp.s("覠\u0001"), ProtectedSandApp.s("覡\u0001"), s4, xVar, nVar) : J(s4);
        }

        @Override // net.time4j.format.z
        public String l(Locale locale, net.time4j.format.x xVar, net.time4j.format.n nVar) {
            boolean equals = locale.getLanguage().equals(ProtectedSandApp.s("覐\u0001"));
            String s4 = ProtectedSandApp.s("覊\u0001");
            return equals ? F(ProtectedSandApp.s("覗\u0001"), ProtectedSandApp.s("覢\u0001"), s4, xVar, nVar) : J(s4);
        }

        @Override // net.time4j.format.z
        public String m(Locale locale, net.time4j.format.x xVar, net.time4j.format.n nVar) {
            boolean equals = locale.getLanguage().equals(ProtectedSandApp.s("覐\u0001"));
            String s4 = ProtectedSandApp.s("覘\u0001");
            return equals ? F(ProtectedSandApp.s("覙\u0001"), ProtectedSandApp.s("覣\u0001"), s4, xVar, nVar) : J(s4);
        }

        @Override // net.time4j.format.z
        public String n(Locale locale, net.time4j.format.x xVar, net.time4j.format.n nVar) {
            boolean equals = locale.getLanguage().equals(ProtectedSandApp.s("覐\u0001"));
            String s4 = ProtectedSandApp.s("覤\u0001");
            return equals ? F(ProtectedSandApp.s("覥\u0001"), ProtectedSandApp.s("覦\u0001"), s4, xVar, nVar) : J(s4);
        }

        @Override // net.time4j.format.z
        public String p(Locale locale, net.time4j.format.x xVar, net.time4j.format.n nVar) {
            boolean equals = locale.getLanguage().equals(ProtectedSandApp.s("覐\u0001"));
            String s4 = ProtectedSandApp.s("覧\u0001");
            return equals ? F(ProtectedSandApp.s("覨\u0001"), ProtectedSandApp.s("覩\u0001"), s4, xVar, nVar) : J(s4);
        }

        @Override // net.time4j.format.z
        public String r(Locale locale, boolean z4, net.time4j.format.n nVar) {
            return locale.getLanguage().equals(ProtectedSandApp.s("覐\u0001")) ? H(ProtectedSandApp.s("覛\u0001"), z4, nVar) : I(ProtectedSandApp.s("覚\u0001"), z4);
        }

        @Override // net.time4j.format.z
        public String s(Locale locale, net.time4j.format.x xVar, net.time4j.format.n nVar) {
            boolean equals = locale.getLanguage().equals(ProtectedSandApp.s("覐\u0001"));
            String s4 = ProtectedSandApp.s("親\u0001");
            if (!equals) {
                return J(s4);
            }
            String s5 = ProtectedSandApp.s("覫\u0001");
            return F(s5, s5, s4, xVar, nVar);
        }

        @Override // net.time4j.format.z
        public String t(Locale locale, net.time4j.format.x xVar, int i4) {
            if (i4 < 2) {
                throw new IllegalArgumentException(ProtectedSandApp.s("覭\u0001"));
            }
            StringBuilder sb = new StringBuilder(i4 * 5);
            for (int i5 = 0; i5 < i4; i5++) {
                sb.append('{');
                sb.append(i5);
                sb.append('}');
                if (i5 < i4 - 1) {
                    sb.append(ProtectedSandApp.s("覬\u0001"));
                }
            }
            return sb.toString();
        }

        @Override // net.time4j.format.z
        public String u(Locale locale, boolean z4, net.time4j.format.n nVar) {
            return locale.getLanguage().equals(ProtectedSandApp.s("覐\u0001")) ? H(ProtectedSandApp.s("覫\u0001"), z4, nVar) : I(ProtectedSandApp.s("親\u0001"), z4);
        }

        @Override // net.time4j.format.z
        public String v(Locale locale, net.time4j.format.x xVar, net.time4j.format.n nVar) {
            boolean equals = locale.getLanguage().equals(ProtectedSandApp.s("覐\u0001"));
            String s4 = ProtectedSandApp.s("覞\u0001");
            return equals ? F(ProtectedSandApp.s("覝\u0001"), ProtectedSandApp.s("覮\u0001"), s4, xVar, nVar) : J(s4);
        }

        @Override // net.time4j.format.z
        public String z(Locale locale, boolean z4, net.time4j.format.n nVar) {
            return locale.getLanguage().equals(ProtectedSandApp.s("覐\u0001")) ? H(ProtectedSandApp.s("覠\u0001"), z4, nVar) : I(ProtectedSandApp.s("覟\u0001"), z4);
        }

        b(a aVar) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [net.time4j.format.z] */
    static {
        b bVar = new b();
        f81822s = bVar;
        Iterator it = net.time4j.base.d.c().g(net.time4j.format.z.class).iterator();
        b bVar2 = it.hasNext() ? (net.time4j.format.z) it.next() : null;
        if (bVar2 != null) {
            bVar = bVar2;
        }
        f81821r = bVar;
    }

    private a1(Locale locale) {
        String str;
        String str2;
        String str3;
        String str4;
        this.f81823a = locale;
        HashMap hashMap = new HashMap(10);
        HashMap hashMap2 = new HashMap(10);
        HashMap hashMap3 = new HashMap(10);
        HashMap hashMap4 = new HashMap(10);
        HashMap hashMap5 = new HashMap(10);
        HashMap hashMap6 = new HashMap(10);
        z[] zVarArr = f81820q;
        int length = zVarArr.length;
        int i4 = 0;
        while (i4 < length) {
            z zVar = zVarArr[i4];
            EnumMap enumMap = new EnumMap(net.time4j.format.x.class);
            net.time4j.format.x[] values = net.time4j.format.x.values();
            int length2 = values.length;
            z[] zVarArr2 = zVarArr;
            int i5 = 0;
            while (i5 < length2) {
                int i6 = length;
                net.time4j.format.x xVar = values[i5];
                net.time4j.format.x[] xVarArr = values;
                EnumMap enumMap2 = new EnumMap(net.time4j.format.n.class);
                net.time4j.format.n[] values2 = net.time4j.format.n.values();
                int i7 = length2;
                int length3 = values2.length;
                int i10 = 0;
                while (i10 < length3) {
                    int i11 = length3;
                    net.time4j.format.n nVar = values2[i10];
                    enumMap2.put((EnumMap) nVar, (net.time4j.format.n) n(locale, zVar, xVar, nVar));
                    i10++;
                    length3 = i11;
                    values2 = values2;
                }
                enumMap.put((EnumMap) xVar, (net.time4j.format.x) Collections.unmodifiableMap(enumMap2));
                i5++;
                length = i6;
                values = xVarArr;
                length2 = i7;
            }
            int i12 = length;
            hashMap.put(zVar, Collections.unmodifiableMap(enumMap));
            if (!Character.isDigit(zVar.getSymbol())) {
                EnumMap enumMap3 = new EnumMap(net.time4j.format.n.class);
                net.time4j.format.n[] values3 = net.time4j.format.n.values();
                int length4 = values3.length;
                int i13 = 0;
                while (i13 < length4) {
                    net.time4j.format.n nVar2 = values3[i13];
                    enumMap3.put((EnumMap) nVar2, (net.time4j.format.n) o(locale, zVar, false, false, nVar2));
                    i13++;
                    values3 = values3;
                }
                hashMap2.put(zVar, Collections.unmodifiableMap(enumMap3));
                EnumMap enumMap4 = new EnumMap(net.time4j.format.n.class);
                net.time4j.format.n[] values4 = net.time4j.format.n.values();
                int length5 = values4.length;
                int i14 = 0;
                while (i14 < length5) {
                    net.time4j.format.n nVar3 = values4[i14];
                    enumMap4.put((EnumMap) nVar3, (net.time4j.format.n) o(locale, zVar, false, true, nVar3));
                    i14++;
                    values4 = values4;
                }
                hashMap4.put(zVar, Collections.unmodifiableMap(enumMap4));
                EnumMap enumMap5 = new EnumMap(net.time4j.format.n.class);
                net.time4j.format.n[] values5 = net.time4j.format.n.values();
                int length6 = values5.length;
                int i15 = 0;
                while (i15 < length6) {
                    net.time4j.format.n nVar4 = values5[i15];
                    enumMap5.put((EnumMap) nVar4, (net.time4j.format.n) o(locale, zVar, true, false, nVar4));
                    i15++;
                    length6 = length6;
                    values5 = values5;
                }
                hashMap3.put(zVar, Collections.unmodifiableMap(enumMap5));
                EnumMap enumMap6 = new EnumMap(net.time4j.format.n.class);
                for (net.time4j.format.n nVar5 : net.time4j.format.n.values()) {
                    enumMap6.put((EnumMap) nVar5, (net.time4j.format.n) o(locale, zVar, true, true, nVar5));
                }
                hashMap5.put(zVar, Collections.unmodifiableMap(enumMap6));
            }
            i4++;
            zVarArr = zVarArr2;
            length = i12;
        }
        for (int i16 = 2; i16 <= 7; i16++) {
            Integer valueOf = Integer.valueOf(i16);
            EnumMap enumMap7 = new EnumMap(net.time4j.format.x.class);
            for (net.time4j.format.x xVar2 : net.time4j.format.x.values()) {
                enumMap7.put((EnumMap) xVar2, (net.time4j.format.x) p(locale, xVar2, i16));
            }
            hashMap6.put(valueOf, Collections.unmodifiableMap(enumMap7));
        }
        this.f81824b = Collections.unmodifiableMap(hashMap);
        this.f81825c = Collections.unmodifiableMap(hashMap2);
        this.f81826d = Collections.unmodifiableMap(hashMap3);
        this.f81827e = Collections.unmodifiableMap(hashMap4);
        this.f81828f = Collections.unmodifiableMap(hashMap5);
        this.f81829g = Collections.unmodifiableMap(hashMap6);
        EnumMap enumMap8 = new EnumMap(g1.class);
        EnumMap enumMap9 = new EnumMap(g1.class);
        g1[] values6 = g1.values();
        int length7 = values6.length;
        int i17 = 0;
        while (true) {
            str = "";
            if (i17 < length7) {
                g1 g1Var = values6[i17];
                enumMap8.put((EnumMap) g1Var, (g1) "");
                enumMap9.put((EnumMap) g1Var, (g1) "");
                i17++;
            } else {
                try {
                    break;
                } catch (MissingResourceException unused) {
                    str2 = "";
                    str3 = str2;
                }
            }
        }
        net.time4j.format.z zVar2 = f81821r;
        String c5 = zVar2.c(locale);
        if (zVar2 instanceof net.time4j.format.s) {
            net.time4j.format.s sVar = (net.time4j.format.s) net.time4j.format.s.class.cast(zVar2);
            String b5 = sVar.b(locale);
            try {
                str3 = sVar.o(locale);
                try {
                    str = sVar.h(locale);
                    for (g1 g1Var2 : g1.values()) {
                        enumMap8.put((EnumMap) g1Var2, (g1) sVar.j(g1Var2, locale));
                        enumMap9.put((EnumMap) g1Var2, (g1) sVar.A(g1Var2, locale));
                    }
                    str4 = str;
                    str = b5;
                } catch (MissingResourceException unused2) {
                    str2 = str;
                    str = b5;
                    c5 = f81822s.c(locale);
                    str4 = str2;
                    this.f81830h = c5;
                    this.f81831i = str;
                    this.f81832j = str3;
                    this.f81833k = str4;
                    this.f81834l = Collections.unmodifiableMap(enumMap8);
                    this.f81835m = Collections.unmodifiableMap(enumMap9);
                }
            } catch (MissingResourceException unused3) {
                str2 = "";
                str3 = str2;
            }
        } else {
            str4 = "";
            str3 = str4;
        }
        this.f81830h = c5;
        this.f81831i = str;
        this.f81832j = str3;
        this.f81833k = str4;
        this.f81834l = Collections.unmodifiableMap(enumMap8);
        this.f81835m = Collections.unmodifiableMap(enumMap9);
    }

    private static void a(net.time4j.format.n nVar) {
        if (nVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("覯\u0001"));
        }
    }

    private static void b(net.time4j.format.x xVar, net.time4j.format.n nVar) {
        if (xVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("覰\u0001"));
        }
        a(nVar);
    }

    private static char c(z zVar) {
        char symbol = zVar.getSymbol();
        if (zVar == j.MINUTES) {
            return 'N';
        }
        return symbol;
    }

    private static String n(Locale locale, z zVar, net.time4j.format.x xVar, net.time4j.format.n nVar) {
        try {
            return q(f81821r, locale, c(zVar), xVar, nVar);
        } catch (MissingResourceException unused) {
            return q(f81822s, locale, c(zVar), xVar, nVar);
        }
    }

    private static String o(Locale locale, z zVar, boolean z4, boolean z5, net.time4j.format.n nVar) {
        try {
            return r(f81821r, locale, c(zVar), z4, z5, nVar);
        } catch (MissingResourceException unused) {
            return r(f81822s, locale, c(zVar), z4, z5, nVar);
        }
    }

    private static String p(Locale locale, net.time4j.format.x xVar, int i4) {
        try {
            return f81821r.t(locale, xVar, i4);
        } catch (MissingResourceException unused) {
            return f81822s.t(locale, xVar, i4);
        }
    }

    private static String q(net.time4j.format.z zVar, Locale locale, char c5, net.time4j.format.x xVar, net.time4j.format.n nVar) {
        if (c5 == '3') {
            return zVar.p(locale, xVar, nVar);
        }
        if (c5 == '6') {
            return zVar.B(locale, xVar, nVar);
        }
        if (c5 == '9') {
            return zVar.n(locale, xVar, nVar);
        }
        if (c5 == 'D') {
            return zVar.s(locale, xVar, nVar);
        }
        if (c5 == 'H') {
            return zVar.g(locale, xVar, nVar);
        }
        if (c5 == 'S') {
            return zVar.l(locale, xVar, nVar);
        }
        if (c5 == 'W') {
            return zVar.v(locale, xVar, nVar);
        }
        if (c5 == 'Y') {
            return zVar.k(locale, xVar, nVar);
        }
        if (c5 == 'M') {
            return zVar.m(locale, xVar, nVar);
        }
        if (c5 == 'N') {
            return zVar.e(locale, xVar, nVar);
        }
        throw new UnsupportedOperationException(androidx.compose.ui.graphics.vector.j.a(ProtectedSandApp.s("覱\u0001"), c5));
    }

    private static String r(net.time4j.format.z zVar, Locale locale, char c5, boolean z4, boolean z5, net.time4j.format.n nVar) {
        String s4 = ProtectedSandApp.s("覱\u0001");
        if (!z5 || !(zVar instanceof net.time4j.format.s)) {
            if (c5 == 'D') {
                return zVar.u(locale, z4, nVar);
            }
            if (c5 == 'H') {
                return zVar.r(locale, z4, nVar);
            }
            if (c5 == 'S') {
                return zVar.d(locale, z4, nVar);
            }
            if (c5 == 'W') {
                return zVar.i(locale, z4, nVar);
            }
            if (c5 == 'Y') {
                return zVar.z(locale, z4, nVar);
            }
            if (c5 == 'M') {
                return zVar.f(locale, z4, nVar);
            }
            if (c5 == 'N') {
                return zVar.C(locale, z4, nVar);
            }
            throw new UnsupportedOperationException(androidx.compose.ui.graphics.vector.j.a(s4, c5));
        }
        net.time4j.format.s sVar = (net.time4j.format.s) net.time4j.format.s.class.cast(zVar);
        if (c5 == 'D') {
            return sVar.w(locale, z4, nVar);
        }
        if (c5 == 'H') {
            return sVar.a(locale, z4, nVar);
        }
        if (c5 == 'S') {
            return sVar.y(locale, z4, nVar);
        }
        if (c5 == 'W') {
            return sVar.x(locale, z4, nVar);
        }
        if (c5 == 'Y') {
            return sVar.q(locale, z4, nVar);
        }
        if (c5 == 'M') {
            return sVar.D(locale, z4, nVar);
        }
        if (c5 == 'N') {
            return sVar.E(locale, z4, nVar);
        }
        throw new UnsupportedOperationException(androidx.compose.ui.graphics.vector.j.a(s4, c5));
    }

    static a1 s(Locale locale) {
        if (locale == null) {
            throw new NullPointerException(ProtectedSandApp.s("覲\u0001"));
        }
        ConcurrentMap<Locale, a1> concurrentMap = f81819p;
        a1 a1Var = concurrentMap.get(locale);
        if (a1Var != null) {
            return a1Var;
        }
        a1 a1Var2 = new a1(locale);
        a1 putIfAbsent = concurrentMap.putIfAbsent(locale, a1Var2);
        return putIfAbsent != null ? putIfAbsent : a1Var2;
    }

    String d(net.time4j.format.x xVar, int i4) {
        if (xVar != null) {
            return (i4 < 2 || i4 > 7) ? p(this.f81823a, xVar, i4) : this.f81829g.get(Integer.valueOf(i4)).get(xVar);
        }
        throw new NullPointerException(ProtectedSandApp.s("観\u0001"));
    }

    String e() {
        return this.f81830h;
    }

    String f(net.time4j.format.x xVar, net.time4j.format.n nVar, z zVar) {
        b(xVar, nVar);
        return this.f81824b.get(zVar).get(xVar).get(nVar);
    }

    String g(net.time4j.format.n nVar, boolean z4, z zVar) {
        a(nVar);
        return z4 ? this.f81828f.get(zVar).get(nVar) : this.f81826d.get(zVar).get(nVar);
    }

    String h(net.time4j.format.n nVar, boolean z4, z zVar) {
        a(nVar);
        return z4 ? this.f81827e.get(zVar).get(nVar) : this.f81825c.get(zVar).get(nVar);
    }

    String i() {
        return this.f81832j;
    }

    String j() {
        return this.f81833k;
    }

    String k() {
        return this.f81831i;
    }

    String l(g1 g1Var) {
        return this.f81834l.get(g1Var);
    }

    String m(g1 g1Var) {
        return this.f81835m.get(g1Var);
    }
}
