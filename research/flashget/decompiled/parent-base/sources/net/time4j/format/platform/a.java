package net.time4j.format.platform;

import androidx.constraintlayout.core.motion.key.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import net.time4j.c0;
import net.time4j.d0;
import net.time4j.engine.ChronoException;
import net.time4j.engine.q;
import net.time4j.engine.r;
import net.time4j.engine.x;
import net.time4j.format.a;
import net.time4j.format.e;
import net.time4j.format.g;
import net.time4j.format.t;
import net.time4j.g0;
import net.time4j.l0;
import net.time4j.l1;
import net.time4j.m0;
import net.time4j.n0;
import net.time4j.tz.k;
import net.time4j.tz.l;
import net.time4j.tz.p;
import net.time4j.x0;
import pe.d;

/* compiled from: SimpleFormatter.java */
/* loaded from: classes7.dex */
public final class a<T> implements t<T> {

    /* renamed from: f, reason: collision with root package name */
    private static final String f83094f = ProtectedSandApp.s("闙\u0001");

    /* renamed from: g, reason: collision with root package name */
    private static final String f83095g = ProtectedSandApp.s("闚\u0001");

    /* renamed from: h, reason: collision with root package name */
    private static final String f83096h = ProtectedSandApp.s("闛\u0001");

    /* renamed from: i, reason: collision with root package name */
    private static final Date f83097i = new Date(Long.MIN_VALUE);

    /* renamed from: j, reason: collision with root package name */
    private static final l0 f83098j = l0.r1(1970, 1, 1);

    /* renamed from: k, reason: collision with root package name */
    private static final Map<Class<?>, x<?>> f83099k;

    /* renamed from: l, reason: collision with root package name */
    public static final a<d0> f83100l;

    /* renamed from: a, reason: collision with root package name */
    private final Class<T> f83101a;

    /* renamed from: b, reason: collision with root package name */
    private final String f83102b;

    /* renamed from: c, reason: collision with root package name */
    private final Locale f83103c;

    /* renamed from: d, reason: collision with root package name */
    private final g f83104d;

    /* renamed from: e, reason: collision with root package name */
    private final String f83105e;

    /* compiled from: SimpleFormatter.java */
    /* renamed from: net.time4j.format.platform.a$a, reason: collision with other inner class name */
    private static class C1296a extends r<C1296a> {

        /* renamed from: b, reason: collision with root package name */
        private final Map<q<?>, Object> f83106b;

        /* renamed from: c, reason: collision with root package name */
        private k f83107c = null;

        C1296a(b bVar) {
            HashMap hashMap = new HashMap();
            if (bVar.isSet(1)) {
                hashMap.put(l0.f83327r, Integer.valueOf(bVar.b(1)));
            }
            if (bVar.isSet(2)) {
                hashMap.put(l0.f83331v, Integer.valueOf(bVar.b(2) + 1));
            }
            if (bVar.isSet(6)) {
                hashMap.put(l0.f83334y, Integer.valueOf(bVar.b(6)));
            }
            if (bVar.isSet(5)) {
                hashMap.put(l0.f83332w, Integer.valueOf(bVar.b(5)));
            }
            if (bVar.isSet(9)) {
                hashMap.put(m0.f83370u, c0.values()[bVar.b(9)]);
            }
            if (bVar.isSet(10)) {
                hashMap.put(m0.f83373x, Integer.valueOf(bVar.b(10)));
            }
            if (bVar.isSet(11)) {
                hashMap.put(m0.f83374y, Integer.valueOf(bVar.b(11)));
            }
            if (bVar.isSet(12)) {
                hashMap.put(m0.A, Integer.valueOf(bVar.b(12)));
            }
            if (bVar.isSet(13)) {
                hashMap.put(m0.C, Integer.valueOf(bVar.b(13)));
            }
            if (bVar.isSet(14)) {
                hashMap.put(m0.E, Integer.valueOf(bVar.b(14)));
            }
            this.f83106b = Collections.unmodifiableMap(hashMap);
        }

        private void P(q<?> qVar) {
            if (!this.f83106b.containsKey(qVar)) {
                throw new ChronoException(g0.a(qVar, new StringBuilder(ProtectedSandApp.s("闖\u0001"))));
            }
        }

        @Override // net.time4j.engine.r
        public Set<q<?>> A() {
            return Collections.unmodifiableSet(this.f83106b.keySet());
        }

        @Override // net.time4j.engine.r
        public <V> boolean G(q<V> qVar, V v4) {
            return qVar != null;
        }

        void Q(k kVar) {
            this.f83107c = kVar;
        }

        @Override // net.time4j.engine.r
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public <V> C1296a M(q<V> qVar, V v4) {
            qVar.getClass();
            if (v4 == null) {
                this.f83106b.remove(qVar);
            } else {
                this.f83106b.put(qVar, v4);
            }
            return this;
        }

        @Override // net.time4j.engine.r, net.time4j.engine.p
        public boolean e() {
            return this.f83107c != null;
        }

        @Override // net.time4j.engine.r, net.time4j.engine.p
        public <V> V g(q<V> qVar) {
            P(qVar);
            return qVar.getDefaultMaximum();
        }

        @Override // net.time4j.engine.r, net.time4j.engine.p
        public <V> V i(q<V> qVar) {
            P(qVar);
            return qVar.getDefaultMinimum();
        }

        @Override // net.time4j.engine.r, net.time4j.engine.p
        public int l(q<Integer> qVar) {
            if (this.f83106b.containsKey(qVar)) {
                return ((Integer) Integer.class.cast(this.f83106b.get(qVar))).intValue();
            }
            return Integer.MIN_VALUE;
        }

        @Override // net.time4j.engine.r, net.time4j.engine.p
        public <V> V r(q<V> qVar) {
            P(qVar);
            return qVar.getType().cast(this.f83106b.get(qVar));
        }

        @Override // net.time4j.engine.r, net.time4j.engine.p
        public k v() {
            k kVar = this.f83107c;
            if (kVar != null) {
                return kVar;
            }
            throw new ChronoException(ProtectedSandApp.s("闗\u0001"));
        }

        @Override // net.time4j.engine.r, net.time4j.engine.p
        public boolean w(q<?> qVar) {
            return this.f83106b.containsKey(qVar);
        }

        @Override // net.time4j.engine.r
        protected x<C1296a> y() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("闘\u0001"));
        }
    }

    /* compiled from: SimpleFormatter.java */
    private static class b extends GregorianCalendar {
        b(TimeZone timeZone, Locale locale) {
            super(timeZone, locale);
            setGregorianChange(a.f83097i);
        }

        int b(int i4) {
            return super.internalGet(i4);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(l0.class, l0.T0());
        hashMap.put(m0.class, m0.y0());
        hashMap.put(n0.class, n0.h0());
        hashMap.put(d0.class, d0.r0());
        f83099k = Collections.unmodifiableMap(hashMap);
        f83100l = new a<>(d0.class, ProtectedSandApp.s("闙\u0001"), Locale.ENGLISH, g.SMART, ProtectedSandApp.s("關\u0001"));
    }

    private a(Class<T> cls, String str, Locale locale, g gVar, String str2) {
        if (cls == null) {
            throw new NullPointerException(ProtectedSandApp.s("闠\u0001"));
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("闟\u0001"));
        }
        if (locale == null) {
            throw new NullPointerException(ProtectedSandApp.s("闞\u0001"));
        }
        if (gVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("闝\u0001"));
        }
        this.f83101a = cls;
        this.f83102b = str;
        this.f83103c = locale;
        this.f83104d = gVar;
        this.f83105e = str2;
    }

    private static String g(DateFormat dateFormat) {
        if (dateFormat instanceof SimpleDateFormat) {
            return ((SimpleDateFormat) SimpleDateFormat.class.cast(dateFormat)).toPattern();
        }
        throw new IllegalStateException(ProtectedSandApp.s("闡\u0001") + dateFormat);
    }

    private boolean l() {
        boolean z4 = false;
        for (int length = this.f83102b.length() - 1; length >= 0; length--) {
            char charAt = this.f83102b.charAt(length);
            if (charAt == '\'') {
                z4 = !z4;
            } else if (!z4 && charAt == 'z') {
                return true;
            }
        }
        return false;
    }

    public static a<l0> m(String str, Locale locale) {
        return new a<>(l0.class, str, locale, g.SMART, null);
    }

    public static a<l0> n(e eVar, Locale locale) {
        return m(g(DateFormat.getDateInstance(eVar.getStyleValue(), locale)), locale);
    }

    public static a<d0> o(String str, Locale locale, k kVar) {
        return new a<>(d0.class, str, locale, g.SMART, kVar.canonical());
    }

    public static a<d0> p(e eVar, e eVar2, Locale locale, k kVar) {
        return o(g(DateFormat.getDateTimeInstance(eVar.getStyleValue(), eVar2.getStyleValue(), locale)), locale, kVar);
    }

    public static a<m0> q(String str, Locale locale) {
        return new a<>(m0.class, str, locale, g.SMART, null);
    }

    public static a<m0> r(e eVar, Locale locale) {
        return q(d.a(g(DateFormat.getTimeInstance(eVar.getStyleValue(), locale))), locale);
    }

    public static a<n0> s(String str, Locale locale) {
        return new a<>(n0.class, str, locale, g.SMART, null);
    }

    public static a<n0> t(e eVar, e eVar2, Locale locale) {
        return s(d.a(g(DateFormat.getDateTimeInstance(eVar.getStyleValue(), eVar2.getStyleValue(), locale))), locale);
    }

    private T u(CharSequence charSequence, ParsePosition parsePosition, net.time4j.format.r rVar) {
        String canonical;
        Object J0;
        String charSequence2 = charSequence.toString();
        if (this.f83101a.equals(l0.class)) {
            SimpleDateFormat x4 = x();
            J0 = x0.f83715b.b(x4.parse(charSequence2, parsePosition)).j1(p.f83649l).k0();
            y(rVar, x4);
        } else if (this.f83101a.equals(m0.class)) {
            SimpleDateFormat x5 = x();
            J0 = x0.f83715b.b(x5.parse(charSequence2, parsePosition)).j1(p.f83649l).m0();
            y(rVar, x5);
        } else if (this.f83101a.equals(n0.class)) {
            SimpleDateFormat x6 = x();
            J0 = x0.f83715b.b(x6.parse(charSequence2, parsePosition)).j1(p.f83649l);
            y(rVar, x6);
        } else {
            int i4 = 0;
            if (this.f83101a.equals(d0.class)) {
                String str = this.f83102b;
                if (str.equals(ProtectedSandApp.s("闙\u0001"))) {
                    String substring = charSequence2.substring(parsePosition.getIndex());
                    str = (substring.length() < 4 || substring.charAt(3) != ',') ? ProtectedSandApp.s("闛\u0001") : ProtectedSandApp.s("闚\u0001");
                    int length = substring.length();
                    while (true) {
                        length--;
                        if (length < 0 || i4 >= 2) {
                            break;
                        }
                        if (substring.charAt(length) == ':') {
                            i4++;
                        }
                    }
                    if (i4 >= 2) {
                        str = str.replace(ProtectedSandApp.s("闢\u0001"), "");
                    }
                }
                l1 l1Var = (l1) new a(l1.class, str, this.f83103c, this.f83104d, this.f83105e).u(charSequence, parsePosition, rVar);
                if (l1Var != null) {
                    J0 = l1Var.t();
                }
                J0 = null;
            } else {
                if (this.f83101a.equals(l1.class)) {
                    String str2 = this.f83105e;
                    String s4 = str2 == null ? ProtectedSandApp.s("闣\u0001") : str2.replace(ProtectedSandApp.s("闤\u0001"), ProtectedSandApp.s("關\u0001"));
                    b bVar = new b(TimeZone.getTimeZone(s4), this.f83103c);
                    Date parse = w(this.f83102b, this.f83103c, bVar, !this.f83104d.isStrict()).parse(charSequence2, parsePosition);
                    if (parse == null || parsePosition.getErrorIndex() >= 0) {
                        return null;
                    }
                    C1296a c1296a = new C1296a(bVar);
                    int i5 = bVar.get(16) + bVar.get(15);
                    if (i5 == -1080) {
                        parsePosition.setErrorIndex(parsePosition.getIndex());
                        throw new IllegalArgumentException(c.a(ProtectedSandApp.s("闥\u0001"), charSequence2));
                    }
                    if (bVar.getTimeZone().getID().equals(s4)) {
                        canonical = (this.f83105e == null || bVar.getTimeZone().getOffset(parse.getTime()) != i5) ? p.o(i5 / 1000).canonical() : this.f83105e;
                    } else {
                        canonical = bVar.getTimeZone().getID();
                    }
                    k G = l.Z(canonical).G();
                    c1296a.Q(G);
                    n0 e4 = n0.h0().e(c1296a, i(), this.f83104d.isLax(), false);
                    J0 = e4 == null ? null : e4.r0(G).J0(G);
                    if (rVar != null) {
                        rVar.a(c1296a);
                    }
                }
                J0 = null;
            }
        }
        return this.f83101a.cast(J0);
    }

    private void v(T t4, Appendable appendable) throws IOException {
        String str;
        if (this.f83101a.equals(l0.class)) {
            l0 l0Var = (l0) l0.class.cast(t4);
            x0<Date, d0> x0Var = x0.f83715b;
            n0 L0 = l0Var.L0();
            L0.getClass();
            str = x().format(x0Var.c(L0.e0(p.f83649l)));
        } else if (this.f83101a.equals(m0.class)) {
            m0 m0Var = (m0) m0.class.cast(t4);
            x0<Date, d0> x0Var2 = x0.f83715b;
            l0 l0Var2 = f83098j;
            l0Var2.getClass();
            n0 B0 = n0.B0(l0Var2, m0Var);
            B0.getClass();
            str = x().format(x0Var2.c(B0.e0(p.f83649l)));
        } else if (this.f83101a.equals(n0.class)) {
            n0 n0Var = (n0) n0.class.cast(t4);
            x0<Date, d0> x0Var3 = x0.f83715b;
            n0Var.getClass();
            str = x().format(x0Var3.c(n0Var.e0(p.f83649l)));
        } else if (this.f83101a.equals(d0.class)) {
            d0 d0Var = (d0) d0.class.cast(t4);
            if (this.f83105e == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("闦\u0001"));
            }
            String str2 = this.f83102b;
            if (str2.equals(ProtectedSandApp.s("闙\u0001"))) {
                str2 = ProtectedSandApp.s("闚\u0001");
            }
            str = new a(l1.class, str2, this.f83103c, this.f83104d, this.f83105e).h(d0Var.I0(this.f83105e));
        } else {
            if (!this.f83101a.equals(l1.class)) {
                throw new IllegalArgumentException(androidx.databinding.a.a(ProtectedSandApp.s("门\u0001"), t4));
            }
            l1 l1Var = (l1) l1.class.cast(t4);
            d0 t5 = l1Var.t();
            Date c5 = x0.f83715b.c(t5);
            String str3 = this.f83105e;
            if (str3 == null) {
                str3 = l1Var.v().canonical();
            }
            l Z = l.Z(str3);
            SimpleDateFormat w4 = w(this.f83102b, this.f83103c, new b(TimeZone.getTimeZone(ProtectedSandApp.s("關\u0001") + Z.I(t5).toString()), this.f83103c), !this.f83104d.isStrict());
            FieldPosition fieldPosition = new FieldPosition(17);
            String stringBuffer = w4.format(c5, new StringBuffer(), fieldPosition).toString();
            int beginIndex = fieldPosition.getBeginIndex();
            int endIndex = fieldPosition.getEndIndex();
            if (endIndex <= beginIndex || beginIndex <= 0 || (Z.G() instanceof p) || !l()) {
                str = stringBuffer;
            } else {
                boolean T = Z.T(t5);
                str = stringBuffer.substring(0, beginIndex) + Z.D(!this.f83102b.contains(ProtectedSandApp.s("闧\u0001")) ? T ? net.time4j.tz.d.SHORT_DAYLIGHT_TIME : net.time4j.tz.d.SHORT_STANDARD_TIME : T ? net.time4j.tz.d.LONG_DAYLIGHT_TIME : net.time4j.tz.d.LONG_STANDARD_TIME, this.f83103c) + stringBuffer.substring(endIndex);
            }
        }
        appendable.append(str);
    }

    private static SimpleDateFormat w(String str, Locale locale, b bVar, boolean z4) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setCalendar(bVar);
        simpleDateFormat.setLenient(z4);
        return simpleDateFormat;
    }

    private SimpleDateFormat x() {
        return w(this.f83102b, this.f83103c, new b(TimeZone.getTimeZone(ProtectedSandApp.s("關\u0001")), this.f83103c), !this.f83104d.isStrict());
    }

    private static void y(net.time4j.format.r rVar, SimpleDateFormat simpleDateFormat) {
        if (rVar != null) {
            rVar.a(new C1296a((b) b.class.cast(simpleDateFormat.getCalendar())));
        }
    }

    @Override // net.time4j.format.t
    public t<T> a(k kVar) {
        return c(kVar.canonical());
    }

    @Override // net.time4j.format.t
    public t<T> c(String str) {
        return new a(this.f83101a, this.f83102b, this.f83103c, this.f83104d, str);
    }

    @Override // net.time4j.format.t
    public String d(T t4) {
        return h(t4);
    }

    @Override // net.time4j.format.t
    public t<T> e(Locale locale) {
        return new a(this.f83101a, this.f83102b, locale, this.f83104d, this.f83105e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f83101a.equals(aVar.f83101a) && this.f83102b.equals(aVar.f83102b) && this.f83103c.equals(aVar.f83103c) && this.f83104d == aVar.f83104d) {
            String str = this.f83105e;
            String str2 = aVar.f83105e;
            if (str == null) {
                if (str2 == null) {
                    return true;
                }
            } else if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // net.time4j.format.t
    public T f(CharSequence charSequence) throws ParseException {
        String s4 = ProtectedSandApp.s("闩\u0001");
        ParsePosition parsePosition = new ParsePosition(0);
        try {
            T u4 = u(charSequence, parsePosition, null);
            if (u4 != null && parsePosition.getErrorIndex() <= -1) {
                return u4;
            }
            throw new ParseException(s4 + ((Object) charSequence), parsePosition.getErrorIndex());
        } catch (RuntimeException e4) {
            ParseException parseException = new ParseException(e4.getMessage(), parsePosition.getErrorIndex());
            parseException.initCause(e4);
            throw parseException;
        }
    }

    @Override // net.time4j.format.t
    public String h(T t4) {
        StringBuilder sb = new StringBuilder();
        try {
            v(t4, sb);
            return sb.toString();
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }

    public int hashCode() {
        return (this.f83105e.hashCode() * 37) + (this.f83103c.hashCode() * 31) + (this.f83102b.hashCode() * 17);
    }

    @Override // net.time4j.format.t
    public net.time4j.engine.d i() {
        x<?> xVar = f83099k.get(this.f83101a);
        a.b bVar = xVar == null ? new a.b() : new a.b(xVar);
        bVar.j(this.f83103c);
        bVar.e(net.time4j.format.a.f82784f, this.f83104d);
        String str = this.f83105e;
        if (str != null) {
            bVar.l(str);
        }
        return bVar.a();
    }

    @Override // net.time4j.format.t
    public T j(CharSequence charSequence, net.time4j.format.r rVar) throws ParseException {
        String s4 = ProtectedSandApp.s("闩\u0001");
        if (rVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("闪\u0001"));
        }
        ParsePosition parsePosition = new ParsePosition(0);
        try {
            T u4 = u(charSequence, parsePosition, rVar);
            if (u4 != null && parsePosition.getErrorIndex() <= -1) {
                return u4;
            }
            throw new ParseException(s4 + ((Object) charSequence), parsePosition.getErrorIndex());
        } catch (RuntimeException e4) {
            ParseException parseException = new ParseException(e4.getMessage(), parsePosition.getErrorIndex());
            parseException.initCause(e4);
            throw parseException;
        }
    }

    @Override // net.time4j.format.t
    public t<T> k(g gVar) {
        return new a(this.f83101a, this.f83102b, this.f83103c, gVar, this.f83105e);
    }
}
