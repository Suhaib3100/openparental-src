package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import net.time4j.engine.n0;

/* compiled from: PrettyTime.java */
/* loaded from: classes7.dex */
public final class p0 {

    /* renamed from: k, reason: collision with root package name */
    private static final net.time4j.format.i f83463k;

    /* renamed from: l, reason: collision with root package name */
    private static final int f83464l = 1000000;

    /* renamed from: m, reason: collision with root package name */
    private static final ConcurrentMap<Locale, p0> f83465m;

    /* renamed from: n, reason: collision with root package name */
    private static final z[] f83466n;

    /* renamed from: o, reason: collision with root package name */
    private static final z[] f83467o;

    /* renamed from: p, reason: collision with root package name */
    private static final Set<z> f83468p;

    /* renamed from: q, reason: collision with root package name */
    private static final long f83469q;

    /* renamed from: r, reason: collision with root package name */
    static final /* synthetic */ boolean f83470r = false;

    /* renamed from: a, reason: collision with root package name */
    private final net.time4j.format.p f83471a;

    /* renamed from: b, reason: collision with root package name */
    private final Locale f83472b;

    /* renamed from: c, reason: collision with root package name */
    private final net.time4j.base.e<?> f83473c;

    /* renamed from: d, reason: collision with root package name */
    private final char f83474d;

    /* renamed from: e, reason: collision with root package name */
    private final String f83475e;

    /* renamed from: f, reason: collision with root package name */
    private final z f83476f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f83477g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f83478h;

    /* renamed from: i, reason: collision with root package name */
    private final String f83479i;

    /* renamed from: j, reason: collision with root package name */
    private final String f83480j;

    /* compiled from: PrettyTime.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f83481a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f83482b;

        static {
            int[] iArr = new int[j.values().length];
            f83482b = iArr;
            try {
                iArr[j.HOURS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83482b[j.MINUTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f83482b[j.SECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f83482b[j.MILLIS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f83482b[j.MICROS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f83482b[j.NANOS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[h.values().length];
            f83481a = iArr2;
            try {
                iArr2[h.MILLENNIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f83481a[h.CENTURIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f83481a[h.DECADES.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f83481a[h.YEARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f83481a[h.QUARTERS.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f83481a[h.MONTHS.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f83481a[h.WEEKS.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f83481a[h.DAYS.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    static {
        net.time4j.format.i iVar = null;
        int i4 = 0;
        for (net.time4j.format.i iVar2 : net.time4j.base.d.c().g(net.time4j.format.i.class)) {
            int length = iVar2.a().length;
            if (length >= i4) {
                iVar = iVar2;
                i4 = length;
            }
        }
        if (iVar == null) {
            iVar = net.time4j.format.i.f83083a;
        }
        f83463k = iVar;
        f83465m = new ConcurrentHashMap();
        h hVar = h.YEARS;
        h hVar2 = h.MONTHS;
        h hVar3 = h.DAYS;
        j jVar = j.HOURS;
        j jVar2 = j.MINUTES;
        j jVar3 = j.SECONDS;
        z[] zVarArr = {hVar, hVar2, h.WEEKS, hVar3, jVar, jVar2, jVar3};
        f83466n = zVarArr;
        f83467o = new z[]{hVar, hVar2, hVar3, jVar, jVar2, jVar3};
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, zVarArr);
        hashSet.add(j.NANOS);
        f83468p = Collections.unmodifiableSet(hashSet);
        f83469q = 63072000L;
    }

    private p0(Locale locale, net.time4j.base.e<?> eVar, char c5, String str, z zVar, boolean z4, boolean z5, String str2, String str3) {
        if (zVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("領\u0001"));
        }
        if (eVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("頗\u0001"));
        }
        this.f83471a = net.time4j.format.p.h(locale, net.time4j.format.k.CARDINALS);
        this.f83472b = locale;
        this.f83473c = eVar;
        this.f83474d = c5;
        this.f83476f = zVar;
        this.f83475e = str;
        this.f83477g = z4;
        this.f83478h = z5;
        this.f83479i = str2;
        this.f83480j = str3;
    }

    private String B(d0 d0Var, d0 d0Var2, long j4) {
        long j5 = d0Var.j();
        long j6 = f83469q;
        if (j5 >= j6 && d0Var2.j() >= j6) {
            j4 = u0.SECONDS.between(d0Var, d0Var2);
        }
        if (j4 == 0) {
            return a1.s(this.f83472b).e();
        }
        long abs = Math.abs(j4);
        return c(j4 < 0 ? j(abs, j.SECONDS) : g(abs, j.SECONDS), abs);
    }

    private String C(d0 d0Var, d0 d0Var2, net.time4j.tz.l lVar, TimeUnit timeUnit, h hVar, net.time4j.format.t<d0> tVar) {
        n0 j02 = n0.j0(d0Var, lVar.I(d0Var));
        n0 j03 = n0.j0(d0Var2, lVar.I(d0Var2));
        p<z> a5 = p.N(lVar, this.f83477g ? f83467o : f83466n).a(j02, j03);
        if (a5.isEmpty()) {
            return e(timeUnit);
        }
        n0.a<z> aVar = a5.f().get(0);
        long a6 = aVar.a();
        z b5 = aVar.b();
        if (b5 instanceof j) {
            if (5 - ((j) b5).ordinal() < timeUnit.ordinal()) {
                return e(timeUnit);
            }
        } else {
            if (hVar != null && Double.compare(b5.getLength(), hVar.getLength()) > 0) {
                return tVar.d(d0Var2);
            }
            if (b5.equals(h.DAYS)) {
                String l4 = l(j03.H0(), a5.d(), a6);
                if (!l4.isEmpty()) {
                    return l4;
                }
            }
        }
        return c(a5.d() ? b5.isCalendrical() ? i(a6, (h) b5) : j(a6, (j) b5) : b5.isCalendrical() ? f(a6, (h) b5) : g(a6, (j) b5), a6);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void G(long[] jArr, h hVar, long j4, boolean z4) {
        char c5 = 1;
        switch (a.f83481a[hVar.ordinal()]) {
            case 1:
                j4 = net.time4j.base.c.i(j4, 1000L);
                c5 = 0;
                jArr[c5] = net.time4j.base.c.f(j4, jArr[c5]);
                return;
            case 2:
                j4 = net.time4j.base.c.i(j4, 100L);
                c5 = 0;
                jArr[c5] = net.time4j.base.c.f(j4, jArr[c5]);
                return;
            case 3:
                j4 = net.time4j.base.c.i(j4, 10L);
                c5 = 0;
                jArr[c5] = net.time4j.base.c.f(j4, jArr[c5]);
                return;
            case 4:
                c5 = 0;
                jArr[c5] = net.time4j.base.c.f(j4, jArr[c5]);
                return;
            case 5:
                j4 = net.time4j.base.c.i(j4, 3L);
                jArr[c5] = net.time4j.base.c.f(j4, jArr[c5]);
                return;
            case 6:
                jArr[c5] = net.time4j.base.c.f(j4, jArr[c5]);
                return;
            case 7:
                if (!z4) {
                    c5 = 2;
                    jArr[c5] = net.time4j.base.c.f(j4, jArr[c5]);
                    return;
                } else {
                    j4 = net.time4j.base.c.i(j4, 7L);
                    c5 = 3;
                    jArr[c5] = net.time4j.base.c.f(j4, jArr[c5]);
                    return;
                }
            case 8:
                c5 = 3;
                jArr[c5] = net.time4j.base.c.f(j4, jArr[c5]);
                return;
            default:
                throw new UnsupportedOperationException(hVar.name());
        }
    }

    private static void H(long[] jArr, j jVar, long j4) {
        char c5 = 7;
        switch (a.f83482b[jVar.ordinal()]) {
            case 1:
                c5 = 4;
                break;
            case 2:
                c5 = 5;
                break;
            case 3:
                c5 = 6;
                break;
            case 4:
                j4 = net.time4j.base.c.i(j4, 1000000L);
                break;
            case 5:
                j4 = net.time4j.base.c.i(j4, 1000L);
                break;
            case 6:
                break;
            default:
                throw new UnsupportedOperationException(jVar.name());
        }
        jArr[c5] = net.time4j.base.c.f(j4, jArr[c5]);
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [net.time4j.base.f] */
    private static void I(long[] jArr, p<?> pVar, net.time4j.base.e<?> eVar, boolean z4) {
        int size = pVar.f().size();
        for (int i4 = 0; i4 < size; i4++) {
            n0.a<?> aVar = pVar.f().get(i4);
            z zVar = (z) aVar.b();
            long a5 = aVar.a();
            if (zVar instanceof h) {
                G(jArr, (h) h.class.cast(zVar), a5, z4);
            } else if (zVar instanceof j) {
                H(jArr, (j) j.class.cast(zVar), a5);
            } else if (zVar instanceof k0) {
                G(jArr, ((k0) k0.class.cast(zVar)).c(), a5, z4);
            } else if (zVar.equals(h.weekBasedYears())) {
                jArr[0] = net.time4j.base.c.f(a5, jArr[0]);
            } else {
                n0 j12 = d0.y0(eVar.c()).j1(net.time4j.tz.p.f83649l);
                I(jArr, (p) p.O(z4 ? f83467o : f83466n).a(j12, j12.W(a5, zVar)), eVar, z4);
            }
        }
    }

    private String a(long j4) {
        String valueOf = String.valueOf(Math.abs(j4));
        char c5 = this.f83474d;
        StringBuilder sb = new StringBuilder();
        if (j4 < 0) {
            sb.append(this.f83475e);
        }
        int length = valueOf.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = valueOf.charAt(i4);
            if (c5 != '0') {
                charAt = (char) ((charAt + c5) - 48);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    private String b(long j4, z zVar, boolean z4, net.time4j.format.x xVar) {
        long k4 = z4 ? net.time4j.base.c.k(j4) : j4;
        if (!f83468p.contains(zVar)) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("頙\u0001") + zVar);
        }
        if (zVar.isCalendrical()) {
            return n(k4, (h) h.class.cast(zVar), xVar);
        }
        j jVar = (j) j.class.cast(zVar);
        if (jVar == j.NANOS) {
            if (j4 % 1000000 == 0) {
                jVar = j.MILLIS;
                k4 /= 1000000;
            } else if (j4 % 1000 == 0) {
                jVar = j.MICROS;
                k4 /= 1000;
            }
        }
        return o(k4, jVar, xVar);
    }

    private String c(String str, long j4) {
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (i4 < length - 2 && str.charAt(i4) == '{' && str.charAt(i4 + 1) == '0' && str.charAt(i4 + 2) == '}') {
                StringBuilder sb = new StringBuilder(str);
                sb.replace(i4, i4 + 3, a(j4));
                return sb.toString();
            }
        }
        return j4 < 0 ? android.support.v4.media.c.a(new StringBuilder(), this.f83475e, str) : str;
    }

    private net.time4j.format.n d(long j4) {
        return this.f83471a.e(Math.abs(j4));
    }

    private String e(TimeUnit timeUnit) {
        a1 s4 = a1.s(this.f83472b);
        if (timeUnit.equals(TimeUnit.DAYS)) {
            String i4 = s4.i();
            if (!i4.isEmpty()) {
                return i4;
            }
        }
        return s4.e();
    }

    private String f(long j4, h hVar) {
        return a1.s(this.f83472b).g(d(j4), this.f83478h, hVar);
    }

    private String g(long j4, j jVar) {
        return a1.s(this.f83472b).g(d(j4), this.f83478h, jVar);
    }

    private String i(long j4, h hVar) {
        return a1.s(this.f83472b).h(d(j4), this.f83478h, hVar);
    }

    private String j(long j4, j jVar) {
        return a1.s(this.f83472b).h(d(j4), this.f83478h, jVar);
    }

    private String l(l0 l0Var, boolean z4, long j4) {
        if (j4 < 1 || j4 > 7) {
            return "";
        }
        a1 s4 = a1.s(this.f83472b);
        if (j4 == 1) {
            return z4 ? s4.k() : s4.j();
        }
        g1 d12 = l0Var.d1();
        return z4 ? s4.l(d12) : s4.m(d12);
    }

    public static p0 m(Locale locale) {
        ConcurrentMap<Locale, p0> concurrentMap = f83465m;
        p0 p0Var = concurrentMap.get(locale);
        if (p0Var != null) {
            return p0Var;
        }
        w0 w0Var = w0.f83710g;
        net.time4j.format.i iVar = f83463k;
        p0 p0Var2 = new p0(locale, w0Var, iVar.f(locale), iVar.e(locale), j.SECONDS, false, false, null, null);
        p0 putIfAbsent = concurrentMap.putIfAbsent(locale, p0Var2);
        return putIfAbsent != null ? putIfAbsent : p0Var2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [net.time4j.base.f] */
    public String A(net.time4j.base.f fVar, net.time4j.tz.l lVar, TimeUnit timeUnit, h hVar, net.time4j.format.t<d0> tVar) {
        if (hVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("頚\u0001"));
        }
        d0 y02 = d0.y0(this.f83473c.c());
        d0 y03 = d0.y0(fVar);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        long Y = y02.Y(y03, timeUnit2);
        return (timeUnit.compareTo(timeUnit2) > 0 || Math.abs(Y) >= 60) ? C(y02, y03, lVar, timeUnit, hVar, tVar) : B(y02, y03, Y);
    }

    public String D() {
        return a1.s(this.f83472b).i();
    }

    public String E() {
        return a1.s(this.f83472b).j();
    }

    public String F() {
        return a1.s(this.f83472b).k();
    }

    public p0 J(String str) {
        return str.equals(this.f83479i) ? this : new p0(this.f83472b, this.f83473c, this.f83474d, this.f83475e, this.f83476f, this.f83477g, this.f83478h, str, this.f83480j);
    }

    public p0 K(h hVar) {
        return this.f83476f.equals(hVar) ? this : new p0(this.f83472b, this.f83473c, this.f83474d, this.f83475e, hVar, this.f83477g, this.f83478h, this.f83479i, this.f83480j);
    }

    public p0 L(j jVar) {
        return this.f83476f.equals(jVar) ? this : new p0(this.f83472b, this.f83473c, this.f83474d, this.f83475e, jVar, this.f83477g, this.f83478h, this.f83479i, this.f83480j);
    }

    public p0 M(String str) {
        return str.equals(this.f83480j) ? this : new p0(this.f83472b, this.f83473c, this.f83474d, this.f83475e, this.f83476f, this.f83477g, this.f83478h, this.f83479i, str);
    }

    public p0 N(String str) {
        return str.equals(this.f83475e) ? this : new p0(this.f83472b, this.f83473c, this.f83474d, str, this.f83476f, this.f83477g, this.f83478h, this.f83479i, this.f83480j);
    }

    public p0 O(net.time4j.base.e<?> eVar) {
        return new p0(this.f83472b, eVar, this.f83474d, this.f83475e, this.f83476f, this.f83477g, this.f83478h, this.f83479i, this.f83480j);
    }

    public p0 P() {
        return this.f83478h ? this : new p0(this.f83472b, this.f83473c, this.f83474d, this.f83475e, this.f83476f, this.f83477g, true, this.f83479i, this.f83480j);
    }

    public p0 Q() {
        return this.f83477g ? this : new p0(this.f83472b, this.f83473c, this.f83474d, this.f83475e, this.f83476f, true, this.f83478h, this.f83479i, this.f83480j);
    }

    public p0 R(char c5) {
        return this.f83474d == c5 ? this : new p0(this.f83472b, this.f83473c, c5, this.f83475e, this.f83476f, this.f83477g, this.f83478h, this.f83479i, this.f83480j);
    }

    public p0 S(net.time4j.format.j jVar) {
        if (jVar.isDecimal()) {
            return R(jVar.getDigits().charAt(0));
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("頛\u0001") + jVar);
    }

    public Locale h() {
        return this.f83472b;
    }

    public net.time4j.base.e<?> k() {
        return this.f83473c;
    }

    public String n(long j4, h hVar, net.time4j.format.x xVar) {
        h hVar2;
        a1 s4 = a1.s(this.f83472b);
        switch (a.f83481a[hVar.ordinal()]) {
            case 1:
                j4 = net.time4j.base.c.i(j4, 1000L);
                hVar2 = h.YEARS;
                break;
            case 2:
                j4 = net.time4j.base.c.i(j4, 100L);
                hVar2 = h.YEARS;
                break;
            case 3:
                j4 = net.time4j.base.c.i(j4, 10L);
                hVar2 = h.YEARS;
                break;
            case 4:
                hVar2 = h.YEARS;
                break;
            case 5:
                j4 = net.time4j.base.c.i(j4, 3L);
                hVar2 = h.MONTHS;
                break;
            case 6:
                hVar2 = h.MONTHS;
                break;
            case 7:
                if (!this.f83477g) {
                    hVar2 = h.WEEKS;
                    break;
                } else {
                    j4 = net.time4j.base.c.i(j4, 7L);
                    hVar2 = h.DAYS;
                    break;
                }
            case 8:
                hVar2 = h.DAYS;
                break;
            default:
                throw new UnsupportedOperationException(hVar.name());
        }
        return c(s4.f(xVar, d(j4), hVar2), j4);
    }

    public String o(long j4, j jVar, net.time4j.format.x xVar) {
        return c(a1.s(this.f83472b).f(xVar, d(j4), jVar), j4);
    }

    public String p(p<?> pVar) {
        return r(pVar, this.f83478h ? net.time4j.format.x.ABBREVIATED : net.time4j.format.x.WIDE, false, Integer.MAX_VALUE);
    }

    public String q(p<?> pVar, net.time4j.format.x xVar) {
        return r(pVar, xVar, false, Integer.MAX_VALUE);
    }

    public String r(p<?> pVar, net.time4j.format.x xVar, boolean z4, int i4) {
        String d5;
        int i5;
        int i6;
        if (i4 < 1) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("頝\u0001"), i4));
        }
        long j4 = 0;
        if (pVar.isEmpty()) {
            return this.f83476f.isCalendrical() ? n(0L, (h) h.class.cast(this.f83476f), xVar) : o(0L, (j) j.class.cast(this.f83476f), xVar);
        }
        boolean d6 = pVar.d();
        long[] jArr = new long[8];
        I(jArr, pVar, this.f83473c, this.f83477g);
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 8; i11 < i12; i12 = 8) {
            if (i10 >= i4 || ((this.f83477g && i11 == 2) || ((!z4 || i10 <= 0) && jArr[i11] <= j4))) {
                i5 = i11;
                i6 = i7;
                i10 = i10;
            } else {
                i5 = i11;
                i6 = i7;
                arrayList.add(b(jArr[i11], i11 == 7 ? j.NANOS : f83466n[i11], d6, xVar));
                i10++;
            }
            i11 = i5 + 1;
            i7 = i6;
            j4 = 0;
        }
        int i13 = i10;
        int i14 = i7;
        if (i13 == 1) {
            return arrayList.get(i14).toString();
        }
        String str = this.f83479i;
        if (str != null) {
            String str2 = this.f83480j;
            if (str2 != null) {
                str = str2;
            }
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("頜\u0001"));
            int i15 = i13 - 1;
            for (int i16 = 1; i16 < i15; i16++) {
                sb.append(this.f83479i);
                sb.append('{');
                sb.append(i16);
                sb.append('}');
            }
            sb.append(str);
            sb.append('{');
            sb.append(i15);
            sb.append('}');
            d5 = sb.toString();
        } else {
            d5 = a1.s(this.f83472b).d(xVar, i13);
        }
        return MessageFormat.format(d5, arrayList.toArray(new Object[i13]));
    }

    public String s(g1 g1Var) {
        return a1.s(this.f83472b).l(g1Var);
    }

    public String t(g1 g1Var) {
        return a1.s(this.f83472b).m(g1Var);
    }

    public String u(net.time4j.base.f fVar, String str) {
        return w(fVar, net.time4j.tz.l.Z(str), TimeUnit.SECONDS);
    }

    public String v(net.time4j.base.f fVar, net.time4j.tz.k kVar) {
        return w(fVar, net.time4j.tz.l.c0(kVar), TimeUnit.SECONDS);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [net.time4j.base.f] */
    public String w(net.time4j.base.f fVar, net.time4j.tz.l lVar, TimeUnit timeUnit) {
        d0 y02 = d0.y0(this.f83473c.c());
        d0 y03 = d0.y0(fVar);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        if (timeUnit.compareTo(timeUnit2) <= 0) {
            long Y = y02.Y(y03, timeUnit2);
            if (Math.abs(Y) < 60) {
                return B(y02, y03, Y);
            }
        }
        return C(y02, y03, lVar, timeUnit, null, null);
    }

    public String x(net.time4j.base.f fVar) {
        return w(fVar, net.time4j.tz.l.e0(), TimeUnit.SECONDS);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [net.time4j.base.f] */
    public String y(l0 l0Var, net.time4j.tz.k kVar, h hVar, net.time4j.format.t<l0> tVar) {
        if (hVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("頚\u0001"));
        }
        l0 H0 = d0.y0(this.f83473c.c()).j1(kVar).H0();
        p<h> a5 = this.f83477g ? p.R().a(H0, l0Var) : (p) p.O(h.YEARS, h.MONTHS, h.WEEKS, h.DAYS).a(H0, l0Var);
        if (a5.isEmpty()) {
            return e(TimeUnit.DAYS);
        }
        n0.a<h> aVar = a5.f().get(0);
        long a6 = aVar.a();
        h b5 = aVar.b();
        if (Double.compare(b5.getLength(), hVar.getLength()) > 0) {
            return tVar.d(l0Var);
        }
        if (b5.equals(h.DAYS)) {
            String l4 = l(l0Var, a5.d(), a6);
            if (!l4.isEmpty()) {
                return l4;
            }
        }
        return c(a5.d() ? i(a6, b5) : f(a6, b5), a6);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [net.time4j.base.f] */
    public String z(net.time4j.base.f fVar, net.time4j.tz.l lVar, TimeUnit timeUnit, long j4, net.time4j.format.t<d0> tVar) {
        d0 y02 = d0.y0(this.f83473c.c());
        d0 y03 = d0.y0(fVar);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        long Y = y02.Y(y03, timeUnit2);
        return Math.abs(Y) > j4 ? tVar.d(y03) : (timeUnit.compareTo(timeUnit2) > 0 || Math.abs(Y) >= 60) ? C(y02, y03, lVar, timeUnit, null, null) : B(y02, y03, Y);
    }
}
