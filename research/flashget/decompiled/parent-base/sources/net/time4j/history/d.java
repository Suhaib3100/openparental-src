package net.time4j.history;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.engine.b0;
import net.time4j.engine.d0;
import net.time4j.engine.q;
import net.time4j.engine.q0;
import net.time4j.format.v;
import net.time4j.l0;

/* compiled from: ChronoHistory.java */
/* loaded from: classes7.dex */
public final class d implements q0, Serializable {

    /* renamed from: q, reason: collision with root package name */
    public static final net.time4j.engine.c<p> f83158q = net.time4j.format.a.e(ProtectedSandApp.s("阮\u0001"), p.class);

    /* renamed from: r, reason: collision with root package name */
    public static final d f83159r;

    /* renamed from: s, reason: collision with root package name */
    public static final d f83160s;
    private static final long serialVersionUID = 4100690610730913643L;

    /* renamed from: t, reason: collision with root package name */
    public static final d f83161t;

    /* renamed from: u, reason: collision with root package name */
    static final int f83162u = 999984973;

    /* renamed from: v, reason: collision with root package name */
    static final int f83163v = 999979465;

    /* renamed from: w, reason: collision with root package name */
    private static final long f83164w;

    /* renamed from: x, reason: collision with root package name */
    private static final d f83165x;

    /* renamed from: y, reason: collision with root package name */
    private static final d f83166y;

    /* renamed from: z, reason: collision with root package name */
    private static final Map<String, d> f83167z;

    /* renamed from: b, reason: collision with root package name */
    private final transient net.time4j.history.internal.b f83168b;

    /* renamed from: c, reason: collision with root package name */
    private final transient List<f> f83169c;

    /* renamed from: d, reason: collision with root package name */
    private final transient net.time4j.history.a f83170d;

    /* renamed from: e, reason: collision with root package name */
    private final transient o f83171e;

    /* renamed from: f, reason: collision with root package name */
    private final transient g f83172f;

    /* renamed from: g, reason: collision with root package name */
    private final transient q<h> f83173g;

    /* renamed from: h, reason: collision with root package name */
    private final transient q<j> f83174h;

    /* renamed from: i, reason: collision with root package name */
    private final transient v<Integer> f83175i;

    /* renamed from: j, reason: collision with root package name */
    private final transient q<Integer> f83176j;

    /* renamed from: k, reason: collision with root package name */
    private final transient q<Integer> f83177k;

    /* renamed from: l, reason: collision with root package name */
    private final transient v<Integer> f83178l;

    /* renamed from: m, reason: collision with root package name */
    private final transient v<Integer> f83179m;

    /* renamed from: n, reason: collision with root package name */
    private final transient v<Integer> f83180n;

    /* renamed from: o, reason: collision with root package name */
    private final transient q<Integer> f83181o;

    /* renamed from: p, reason: collision with root package name */
    private final transient Set<q<?>> f83182p;

    /* compiled from: ChronoHistory.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f83183a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f83184b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f83185c;

        static {
            int[] iArr = new int[p.values().length];
            f83185c = iArr;
            try {
                iArr[p.DUAL_DATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83185c[p.AFTER_NEW_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f83185c[p.BEFORE_NEW_YEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[j.values().length];
            f83184b = iArr2;
            try {
                iArr2[j.HISPANIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f83184b[j.BYZANTINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f83184b[j.AB_URBE_CONDITA.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[net.time4j.history.internal.b.values().length];
            f83183a = iArr3;
            try {
                iArr3[net.time4j.history.internal.b.PROLEPTIC_GREGORIAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f83183a[net.time4j.history.internal.b.PROLEPTIC_JULIAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f83183a[net.time4j.history.internal.b.PROLEPTIC_BYZANTINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f83183a[net.time4j.history.internal.b.SWEDEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f83183a[net.time4j.history.internal.b.INTRODUCTION_ON_1582_10_15.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f83183a[net.time4j.history.internal.b.SINGLE_CUTOVER_DATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        net.time4j.history.internal.b bVar = net.time4j.history.internal.b.PROLEPTIC_GREGORIAN;
        c cVar = c.GREGORIAN;
        f83159r = new d(bVar, Collections.singletonList(new f(Long.MIN_VALUE, cVar, cVar)));
        net.time4j.history.internal.b bVar2 = net.time4j.history.internal.b.PROLEPTIC_JULIAN;
        c cVar2 = c.JULIAN;
        d dVar = new d(bVar2, Collections.singletonList(new f(Long.MIN_VALUE, cVar2, cVar2)));
        f83160s = dVar;
        net.time4j.history.internal.b bVar3 = net.time4j.history.internal.b.PROLEPTIC_BYZANTINE;
        List singletonList = Collections.singletonList(new f(Long.MIN_VALUE, cVar2, cVar2));
        n nVar = n.BEGIN_OF_SEPTEMBER;
        f83161t = new d(bVar3, singletonList, null, new o(nVar, Integer.MAX_VALUE), g.e(l0.T0().w0()));
        long longValue = ((Long) l0.r1(1582, 10, 15).r(b0.MODIFIED_JULIAN_DATE)).longValue();
        f83164w = longValue;
        d E = E(longValue);
        f83165x = E;
        ArrayList arrayList = new ArrayList();
        c cVar3 = c.SWEDISH;
        arrayList.add(new f(-57959L, cVar2, cVar3));
        arrayList.add(new f(-53575L, cVar3, cVar2));
        arrayList.add(new f(-38611L, cVar2, cVar));
        d dVar2 = new d(net.time4j.history.internal.b.SWEDEN, Collections.unmodifiableList(arrayList));
        f83166y = dVar2;
        HashMap hashMap = new HashMap();
        j jVar = j.AD;
        l0 d5 = dVar.d(h.g(jVar, 988, 3, 1));
        l0 d6 = dVar.d(h.g(jVar, 1382, 12, 24));
        l0 d7 = dVar.d(h.g(jVar, 1421, 12, 24));
        l0 d10 = dVar.d(h.g(jVar, 1699, 12, 31));
        n nVar2 = n.BEGIN_OF_JANUARY;
        o until = nVar2.until(1383);
        n nVar3 = n.CHRISTMAS_STYLE;
        hashMap.put(ProtectedSandApp.s("阯\u0001"), E.J(until.b(nVar3.until(1556))).I(g.h(d6)));
        hashMap.put(ProtectedSandApp.s("阰\u0001"), E.J(nVar2.until(1422).b(nVar3.until(1556))).I(g.h(d7)));
        hashMap.put(ProtectedSandApp.s("阱\u0001"), F(l0.r1(1582, 12, 20)).J(n.EASTER_STYLE.until(1567)));
        hashMap.put(ProtectedSandApp.s("防\u0001"), E.J(nVar3.until(1544)));
        hashMap.put(ProtectedSandApp.s("阳\u0001"), F(l0.r1(1583, 10, 16)).J(nVar3.until(1544)));
        hashMap.put(ProtectedSandApp.s("阴\u0001"), F(l0.r1(1610, 9, 2)).J(nVar3.until(1559)));
        hashMap.put(ProtectedSandApp.s("阵\u0001"), F(l0.r1(1700, 3, 1)).J(nVar3.until(1559)));
        hashMap.put(ProtectedSandApp.s("阶\u0001"), F(l0.r1(1583, 1, 1)));
        hashMap.put(ProtectedSandApp.s("阷\u0001"), F(l0.r1(1584, 1, 17)));
        hashMap.put(ProtectedSandApp.s("阸\u0001"), F(l0.r1(1584, 1, 22)));
        hashMap.put(ProtectedSandApp.s("阹\u0001"), F(l0.r1(1587, 11, 1)));
        d F = F(l0.r1(1700, 3, 1));
        n nVar4 = n.MARIA_ANUNCIATA;
        hashMap.put(ProtectedSandApp.s("阺\u0001"), F.J(nVar4.until(1623)));
        hashMap.put(ProtectedSandApp.s("阻\u0001"), F(l0.r1(1700, 3, 1)).J(nVar4.until(1623)));
        hashMap.put(ProtectedSandApp.s("阼\u0001"), E.J(nVar3.until(1583)));
        hashMap.put(ProtectedSandApp.s("阽\u0001"), E.J(nVar4.until(1749)));
        hashMap.put(ProtectedSandApp.s("阾\u0001"), E.J(n.CALCULUS_PISANUS.until(1749)));
        n nVar5 = n.BEGIN_OF_MARCH;
        hashMap.put(ProtectedSandApp.s("阿\u0001"), E.J(nVar5.until(1798)));
        hashMap.put(ProtectedSandApp.s("陀\u0001"), F(l0.r1(1752, 9, 14)).J(nVar3.until(1087).b(nVar2.until(1155)).b(nVar4.until(1752))));
        hashMap.put(ProtectedSandApp.s("陁\u0001"), F(l0.r1(1752, 9, 14)).J(nVar3.until(1087).b(nVar2.until(1155)).b(nVar4.until(1600))));
        hashMap.put(ProtectedSandApp.s("陂\u0001"), F(l0.r1(1918, 2, 14)).J(nVar2.until(988).b(nVar5.until(1493)).b(nVar.until(1700))).I(g.d(d5, d10)));
        hashMap.put(ProtectedSandApp.s("陃\u0001"), dVar2);
        f83167z = Collections.unmodifiableMap(hashMap);
    }

    private d(net.time4j.history.internal.b bVar, List<f> list) {
        this(bVar, list, null, null, g.f83190d);
    }

    public static d C(Locale locale) {
        d dVar;
        String country = locale.getCountry();
        if (locale.getVariant().isEmpty()) {
            dVar = null;
        } else {
            StringBuilder a5 = androidx.constraintlayout.core.e.a(country, ProtectedSandApp.s("陇\u0001"));
            a5.append(locale.getVariant());
            country = a5.toString();
            dVar = f83167z.get(country);
        }
        if (dVar == null) {
            dVar = f83167z.get(country);
        }
        return dVar == null ? f83165x : dVar;
    }

    public static d D() {
        return f83165x;
    }

    private static d E(long j4) {
        return new d(j4 == f83164w ? net.time4j.history.internal.b.INTRODUCTION_ON_1582_10_15 : net.time4j.history.internal.b.SINGLE_CUTOVER_DATE, Collections.singletonList(new f(j4, c.JULIAN, c.GREGORIAN)));
    }

    public static d F(l0 l0Var) {
        if (l0Var.equals(l0.T0().w0())) {
            return f83160s;
        }
        if (l0Var.equals(l0.T0().x0())) {
            return f83159r;
        }
        long longValue = ((Long) l0Var.r(b0.MODIFIED_JULIAN_DATE)).longValue();
        c(longValue);
        return longValue == f83164w ? f83165x : E(longValue);
    }

    public static d G() {
        return f83166y;
    }

    private static void c(long j4) {
        if (j4 < f83164w) {
            throw new IllegalArgumentException(ProtectedSandApp.s("陈\u0001"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d2 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static net.time4j.history.d j(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.history.d.j(java.lang.String):net.time4j.history.d");
    }

    private static l0 r(String[] strArr, String str) {
        String[] split = strArr[1].split(ProtectedSandApp.s("陌\u0001"));
        if (split.length != 2) {
            throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("陙\u0001"), str));
        }
        if (split[0].equals(ProtectedSandApp.s("陗\u0001"))) {
            try {
                return net.time4j.format.expert.n.f82992m.f(split[1]);
            } catch (ParseException unused) {
            }
        }
        throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("陘\u0001"), str));
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException(ProtectedSandApp.s("陚\u0001"));
    }

    private b t() {
        net.time4j.history.a aVar = this.f83170d;
        return aVar != null ? aVar.d() : c.JULIAN;
    }

    private Object writeReplace() {
        return new SPX(this, 3);
    }

    private static boolean y(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    private boolean z(h hVar) {
        int annoDomini = hVar.c().annoDomini(hVar.e());
        if (this != f83161t) {
            return this == f83160s ? Math.abs(annoDomini) > f83163v : this == f83159r ? Math.abs(annoDomini) > 999999999 : annoDomini < -44 || annoDomini > 9999;
        }
        if (annoDomini >= -5508) {
            return (annoDomini == -5508 && hVar.d() < 9) || annoDomini > f83163v;
        }
        return true;
    }

    public boolean A(h hVar) {
        b k4;
        return (hVar == null || z(hVar) || (k4 = k(hVar)) == null || !k4.isValid(hVar)) ? false : true;
    }

    @d0(alt = "L", format = "M")
    public v<Integer> B() {
        return this.f83178l;
    }

    public d H(net.time4j.history.a aVar) {
        if (aVar != null) {
            return !x() ? this : new d(this.f83168b, this.f83169c, aVar, this.f83171e, this.f83172f);
        }
        throw new NullPointerException(ProtectedSandApp.s("陛\u0001"));
    }

    public d I(g gVar) {
        return (gVar.equals(this.f83172f) || !x()) ? this : new d(this.f83168b, this.f83169c, this.f83170d, this.f83171e, gVar);
    }

    public d J(o oVar) {
        return oVar.equals(o.f83227d) ? this.f83171e == null ? this : new d(this.f83168b, this.f83169c, this.f83170d, null, this.f83172f) : !x() ? this : new d(this.f83168b, this.f83169c, this.f83170d, oVar, this.f83172f);
    }

    public q<Integer> K(p pVar) {
        int i4 = a.f83185c[pVar.ordinal()];
        if (i4 == 1) {
            return this.f83175i;
        }
        if (i4 == 2) {
            return this.f83176j;
        }
        if (i4 == 3) {
            return this.f83177k;
        }
        throw new UnsupportedOperationException(pVar.name());
    }

    @d0(format = "y")
    public v<Integer> L() {
        return this.f83175i;
    }

    h a(h hVar) {
        b k4 = k(hVar);
        if (k4 == null) {
            return hVar;
        }
        int maximumDayOfMonth = k4.getMaximumDayOfMonth(hVar);
        return maximumDayOfMonth < hVar.b() ? h.g(hVar.c(), hVar.e(), hVar.d(), maximumDayOfMonth) : hVar;
    }

    public q<Integer> b() {
        return this.f83181o;
    }

    public l0 d(h hVar) {
        if (z(hVar)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("陝\u0001") + hVar);
        }
        b k4 = k(hVar);
        if (k4 != null) {
            return l0.w1(k4.toMJD(hVar), b0.MODIFIED_JULIAN_DATE);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("陜\u0001") + hVar);
    }

    public h e(l0 l0Var) {
        h hVar;
        long longValue = ((Long) l0Var.r(b0.MODIFIED_JULIAN_DATE)).longValue();
        int size = this.f83169c.size() - 1;
        while (true) {
            if (size < 0) {
                hVar = null;
                break;
            }
            f fVar = this.f83169c.get(size);
            if (longValue >= fVar.f83186a) {
                hVar = fVar.f83187b.fromMJD(longValue);
                break;
            }
            size--;
        }
        if (hVar == null) {
            hVar = t().fromMJD(longValue);
        }
        j f4 = this.f83172f.f(hVar, l0Var);
        if (f4 != hVar.c()) {
            hVar = h.g(f4, f4.yearOfEra(hVar.c(), hVar.e()), hVar.d(), hVar.b());
        }
        if (!z(hVar)) {
            return hVar;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("陝\u0001") + hVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f83168b == dVar.f83168b && y(this.f83170d, dVar.f83170d) && y(this.f83171e, dVar.f83171e) && this.f83172f.equals(dVar.f83172f)) {
                return this.f83168b != net.time4j.history.internal.b.SINGLE_CUTOVER_DATE || this.f83169c.get(0).f83186a == dVar.f83169c.get(0).f83186a;
            }
        }
        return false;
    }

    public q<h> f() {
        return this.f83173g;
    }

    @d0(format = "d")
    public q<Integer> g() {
        return this.f83179m;
    }

    @Override // net.time4j.engine.q0
    public String getVariant() {
        StringBuilder a5 = androidx.fragment.app.a.a(64, ProtectedSandApp.s("陉\u0001"));
        a5.append(this.f83168b.name());
        int i4 = a.f83183a[this.f83168b.ordinal()];
        if (i4 == 1 || i4 == 2 || i4 == 3) {
            a5.append(ProtectedSandApp.s("陣\u0001"));
        } else {
            if (i4 == 5 || i4 == 6) {
                a5.append(ProtectedSandApp.s("陞\u0001"));
                a5.append(q());
            }
            a5.append(ProtectedSandApp.s("陟\u0001"));
            net.time4j.history.a aVar = this.f83170d;
            if (aVar != null) {
                int[] e4 = aVar.e();
                a5.append('[');
                a5.append(e4[0]);
                for (int i5 = 1; i5 < e4.length; i5++) {
                    a5.append(',');
                    a5.append(e4[i5]);
                }
                a5.append(']');
            } else {
                a5.append(ProtectedSandApp.s("陠\u0001"));
            }
            a5.append(ProtectedSandApp.s("陡\u0001"));
            a5.append(v());
            a5.append(ProtectedSandApp.s("院\u0001"));
            a5.append(this.f83172f);
        }
        return a5.toString();
    }

    @d0(format = "D")
    public q<Integer> h() {
        return this.f83180n;
    }

    public int hashCode() {
        net.time4j.history.internal.b bVar = this.f83168b;
        if (bVar != net.time4j.history.internal.b.SINGLE_CUTOVER_DATE) {
            return bVar.hashCode();
        }
        long j4 = this.f83169c.get(0).f83186a;
        return (int) (j4 ^ (j4 << 32));
    }

    @d0(format = "G")
    public q<j> i() {
        return this.f83174h;
    }

    b k(h hVar) {
        for (int size = this.f83169c.size() - 1; size >= 0; size--) {
            f fVar = this.f83169c.get(size);
            if (hVar.compareTo(fVar.f83188c) >= 0) {
                return fVar.f83187b;
            }
            if (hVar.compareTo(fVar.f83189d) > 0) {
                return null;
            }
        }
        return t();
    }

    public net.time4j.history.a l() {
        net.time4j.history.a aVar = this.f83170d;
        if (aVar != null) {
            return aVar;
        }
        throw new UnsupportedOperationException(ProtectedSandApp.s("除\u0001"));
    }

    public h m(j jVar, int i4) {
        h d5 = v().d(jVar, i4);
        if (A(d5)) {
            j f4 = this.f83172f.f(d5, d(d5));
            return f4 != jVar ? h.g(f4, f4.yearOfEra(d5.c(), d5.e()), d5.d(), d5.b()) : d5;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("陥\u0001") + jVar + ProtectedSandApp.s("陇\u0001") + i4);
    }

    public Set<q<?>> n() {
        return this.f83182p;
    }

    g o() {
        return this.f83172f;
    }

    List<f> p() {
        return this.f83169c;
    }

    public l0 q() {
        long j4 = ((f) androidx.appcompat.view.menu.d.a(this.f83169c, 1)).f83186a;
        if (j4 != Long.MIN_VALUE) {
            return l0.w1(j4, b0.MODIFIED_JULIAN_DATE);
        }
        throw new UnsupportedOperationException(ProtectedSandApp.s("陦\u0001"));
    }

    net.time4j.history.internal.b s() {
        return this.f83168b;
    }

    public String toString() {
        return ProtectedSandApp.s("陧\u0001") + getVariant() + ProtectedSandApp.s("陨\u0001");
    }

    public int u(j jVar, int i4) {
        h d5;
        h hVar;
        try {
            o oVar = this.f83171e;
            int i5 = 1;
            if (oVar == null) {
                d5 = h.g(jVar, i4, 1, 1);
                hVar = h.g(jVar, i4, 12, 31);
            } else {
                d5 = oVar.d(jVar, i4);
                if (jVar == j.BC) {
                    hVar = i4 == 1 ? this.f83171e.d(j.AD, 1) : this.f83171e.d(jVar, i4 - 1);
                } else {
                    h d6 = this.f83171e.d(jVar, i4 + 1);
                    if (jVar == j.BYZANTINE) {
                        hVar = this.f83171e.d(j.AD, jVar.annoDomini(i4));
                        if (hVar.compareTo(d5) > 0) {
                        }
                    }
                    hVar = d6;
                }
                i5 = 0;
            }
            return (int) (net.time4j.h.DAYS.between(d(d5), d(hVar)) + i5);
        } catch (RuntimeException unused) {
            return -1;
        }
    }

    public o v() {
        o oVar = this.f83171e;
        return oVar == null ? o.f83227d : oVar;
    }

    public boolean w() {
        return this.f83170d != null;
    }

    public boolean x() {
        return ((f) androidx.appcompat.view.menu.d.a(this.f83169c, 1)).f83186a > Long.MIN_VALUE;
    }

    private d(net.time4j.history.internal.b bVar, List<f> list, net.time4j.history.a aVar, o oVar, g gVar) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("陆\u0001"));
        }
        if (bVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("际\u0001"));
        }
        if (gVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("附\u0001"));
        }
        this.f83168b = bVar;
        this.f83169c = list;
        this.f83170d = aVar;
        this.f83171e = oVar;
        this.f83172f = gVar;
        i iVar = new i(this);
        this.f83173g = iVar;
        k kVar = new k(this);
        this.f83174h = kVar;
        l lVar = new l('y', 1, 999999999, this, 2);
        this.f83175i = lVar;
        l lVar2 = new l((char) 0, 1, 999999999, this, 6);
        this.f83176j = lVar2;
        l lVar3 = new l((char) 0, 1, 999999999, this, 7);
        this.f83177k = lVar3;
        l lVar4 = new l('M', 1, 12, this, 3);
        this.f83178l = lVar4;
        l lVar5 = new l('d', 1, 31, this, 4);
        this.f83179m = lVar5;
        l lVar6 = new l('D', 1, 365, this, 5);
        this.f83180n = lVar6;
        l lVar7 = new l((char) 0, 1, 10000000, this, 8);
        this.f83181o = lVar7;
        HashSet hashSet = new HashSet();
        hashSet.add(iVar);
        hashSet.add(kVar);
        hashSet.add(lVar);
        hashSet.add(lVar2);
        hashSet.add(lVar3);
        hashSet.add(lVar4);
        hashSet.add(lVar5);
        hashSet.add(lVar6);
        hashSet.add(lVar7);
        this.f83182p = Collections.unmodifiableSet(hashSet);
    }
}
