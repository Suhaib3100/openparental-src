package net.time4j.format;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: CalendarText.java */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: l, reason: collision with root package name */
    private static final Set<String> f82807l;

    /* renamed from: m, reason: collision with root package name */
    private static final f f82808m;

    /* renamed from: n, reason: collision with root package name */
    public static final String f82809n = ProtectedSandApp.s("鍶\u0001");

    /* renamed from: o, reason: collision with root package name */
    private static final w f82810o;

    /* renamed from: p, reason: collision with root package name */
    private static final w f82811p;

    /* renamed from: q, reason: collision with root package name */
    private static final ConcurrentMap<String, b> f82812q;

    /* renamed from: a, reason: collision with root package name */
    private final String f82813a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<x, Map<m, u>> f82814b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<x, Map<m, u>> f82815c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<x, Map<m, u>> f82816d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<x, Map<m, u>> f82817e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<x, Map<m, u>> f82818f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<x, u> f82819g;

    /* renamed from: h, reason: collision with root package name */
    private final Map<String, String> f82820h;

    /* renamed from: i, reason: collision with root package name */
    private final String f82821i;

    /* renamed from: j, reason: collision with root package name */
    private final Locale f82822j;

    /* renamed from: k, reason: collision with root package name */
    private final MissingResourceException f82823k;

    /* compiled from: CalendarText.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f82824a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f82825b;

        static {
            int[] iArr = new int[e.values().length];
            f82825b = iArr;
            try {
                iArr[e.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82825b[e.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f82825b[e.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f82825b[e.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[x.values().length];
            f82824a = iArr2;
            try {
                iArr2[x.WIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f82824a[x.ABBREVIATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f82824a[x.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f82824a[x.NARROW.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: CalendarText.java */
    /* renamed from: net.time4j.format.b$b, reason: collision with other inner class name */
    private static class C1293b implements w {
        private C1293b() {
        }

        @Override // net.time4j.format.w
        public Locale[] a() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("鍃\u0001"));
        }

        @Override // net.time4j.format.w
        public boolean c(Locale locale) {
            return true;
        }

        @Override // net.time4j.format.w
        public String[] d(String str, Locale locale, x xVar, m mVar) {
            if (xVar == x.NARROW) {
                return new String[]{ProtectedSandApp.s("鍆\u0001"), ProtectedSandApp.s("鍇\u0001"), ProtectedSandApp.s("鍄\u0001"), ProtectedSandApp.s("鍅\u0001")};
            }
            return new String[]{ProtectedSandApp.s("鍊\u0001"), ProtectedSandApp.s("鍋\u0001"), ProtectedSandApp.s("鍈\u0001"), ProtectedSandApp.s("鍉\u0001")};
        }

        @Override // net.time4j.format.w
        public String[] e(String str, Locale locale, x xVar, m mVar, boolean z4) {
            if (xVar == x.WIDE) {
                return new String[]{ProtectedSandApp.s("鍎\u0001"), ProtectedSandApp.s("鍏\u0001"), ProtectedSandApp.s("鍐\u0001"), ProtectedSandApp.s("鍑\u0001"), ProtectedSandApp.s("鍒\u0001"), ProtectedSandApp.s("鍓\u0001"), ProtectedSandApp.s("鍔\u0001"), ProtectedSandApp.s("鍕\u0001"), ProtectedSandApp.s("鍖\u0001"), ProtectedSandApp.s("鍗\u0001"), ProtectedSandApp.s("鍘\u0001"), ProtectedSandApp.s("鍌\u0001"), ProtectedSandApp.s("鍍\u0001")};
            }
            return new String[]{ProtectedSandApp.s("鍆\u0001"), ProtectedSandApp.s("鍇\u0001"), ProtectedSandApp.s("鍄\u0001"), ProtectedSandApp.s("鍅\u0001"), ProtectedSandApp.s("鍙\u0001"), ProtectedSandApp.s("鍚\u0001"), ProtectedSandApp.s("鍛\u0001"), ProtectedSandApp.s("鍜\u0001"), ProtectedSandApp.s("鍝\u0001"), ProtectedSandApp.s("鍗\u0001"), ProtectedSandApp.s("鍘\u0001"), ProtectedSandApp.s("鍌\u0001"), ProtectedSandApp.s("鍍\u0001")};
        }

        @Override // net.time4j.format.w
        public String[] g(String str, Locale locale, x xVar) {
            return xVar == x.NARROW ? new String[]{ProtectedSandApp.s("鍞\u0001"), ProtectedSandApp.s("鍟\u0001")} : new String[]{ProtectedSandApp.s("鍠\u0001"), ProtectedSandApp.s("鍡\u0001")};
        }

        @Override // net.time4j.format.w
        public String[] h(String str, Locale locale, x xVar, m mVar) {
            return new String[]{ProtectedSandApp.s("鍆\u0001"), ProtectedSandApp.s("鍇\u0001"), ProtectedSandApp.s("鍄\u0001"), ProtectedSandApp.s("鍅\u0001"), ProtectedSandApp.s("鍙\u0001"), ProtectedSandApp.s("鍚\u0001"), ProtectedSandApp.s("鍛\u0001")};
        }

        @Override // net.time4j.format.w
        public String[] i(String str, Locale locale, x xVar, m mVar) {
            return xVar == x.NARROW ? new String[]{ProtectedSandApp.s("鍟\u0001"), ProtectedSandApp.s("鍢\u0001")} : new String[]{ProtectedSandApp.s("鍣\u0001"), ProtectedSandApp.s("鍤\u0001")};
        }

        @Override // net.time4j.format.w
        public boolean k(String str) {
            return true;
        }

        @Override // net.time4j.format.w
        public String[] l() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("鍃\u0001"));
        }

        public String toString() {
            return ProtectedSandApp.s("鍥\u0001");
        }

        C1293b(a aVar) {
        }
    }

    /* compiled from: CalendarText.java */
    private static class c implements f {

        /* renamed from: a, reason: collision with root package name */
        private final f f82826a;

        c(f fVar) {
            this.f82826a = fVar;
        }

        private static String a(DateFormat dateFormat) {
            if (dateFormat instanceof SimpleDateFormat) {
                return ((SimpleDateFormat) SimpleDateFormat.class.cast(dateFormat)).toPattern();
            }
            throw new IllegalStateException(ProtectedSandApp.s("鍦\u0001") + dateFormat);
        }

        private static int c(e eVar) {
            int i4 = a.f82825b[eVar.ordinal()];
            if (i4 == 1) {
                return 0;
            }
            if (i4 == 2) {
                return 1;
            }
            if (i4 == 3) {
                return 2;
            }
            if (i4 == 4) {
                return 3;
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("鍧\u0001") + eVar);
        }

        @Override // net.time4j.format.f
        public String b(e eVar, Locale locale) {
            f fVar = this.f82826a;
            return pe.d.a(fVar == null ? a(DateFormat.getTimeInstance(c(eVar), locale)) : fVar instanceof pe.c ? ((pe.c) pe.c.class.cast(fVar)).j(eVar, locale, true) : fVar.b(eVar, locale));
        }

        @Override // net.time4j.format.f
        public String f(e eVar, Locale locale) {
            f fVar = this.f82826a;
            return fVar == null ? a(DateFormat.getDateInstance(c(eVar), locale)) : fVar.f(eVar, locale);
        }

        @Override // net.time4j.format.f
        public String m(Locale locale) {
            f fVar = this.f82826a;
            return fVar == null ? (locale.getLanguage().isEmpty() && locale.getCountry().isEmpty()) ? ProtectedSandApp.s("鍨\u0001") : ProtectedSandApp.s("鍩\u0001") : fVar.m(locale);
        }

        @Override // net.time4j.format.f
        public String n(e eVar, e eVar2, Locale locale) {
            f fVar = this.f82826a;
            if (fVar == null) {
                return a(DateFormat.getDateTimeInstance(c(eVar), c(eVar2), locale));
            }
            return this.f82826a.n(eVar, eVar2, locale).replace(ProtectedSandApp.s("鍪\u0001"), this.f82826a.f(eVar, locale)).replace(ProtectedSandApp.s("鍫\u0001"), fVar.b(eVar2, locale));
        }
    }

    /* compiled from: CalendarText.java */
    private static class d implements w {
        private d() {
        }

        private static String[] b(String[] strArr, int i4) {
            String[] strArr2 = new String[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                if (strArr[i5].isEmpty()) {
                    strArr2[i5] = String.valueOf(i5 + 1);
                } else {
                    strArr2[i5] = f(strArr[i5]);
                }
            }
            return strArr2;
        }

        private static String f(String str) {
            char charAt = Normalizer.normalize(str, Normalizer.Form.NFD).charAt(0);
            return (charAt < 'A' || charAt > 'Z') ? (charAt < 'a' || charAt > 'z') ? (charAt < 1040 || charAt > 1071) ? (charAt < 1072 || charAt > 1103) ? str : String.valueOf((char) (charAt - ' ')) : String.valueOf(charAt) : String.valueOf((char) (charAt - ' ')) : String.valueOf(charAt);
        }

        @Override // net.time4j.format.w
        public Locale[] a() {
            return DateFormatSymbols.getAvailableLocales();
        }

        @Override // net.time4j.format.w
        public boolean c(Locale locale) {
            String language = locale.getLanguage();
            for (Locale locale2 : DateFormatSymbols.getAvailableLocales()) {
                if (locale2.getLanguage().equals(language)) {
                    return true;
                }
            }
            return false;
        }

        @Override // net.time4j.format.w
        public String[] d(String str, Locale locale, x xVar, m mVar) {
            return new String[]{ProtectedSandApp.s("鍮\u0001"), ProtectedSandApp.s("鍯\u0001"), ProtectedSandApp.s("鍬\u0001"), ProtectedSandApp.s("鍭\u0001")};
        }

        @Override // net.time4j.format.w
        public String[] e(String str, Locale locale, x xVar, m mVar, boolean z4) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            int i4 = a.f82824a[xVar.ordinal()];
            if (i4 == 1) {
                return dateFormatSymbols.getMonths();
            }
            if (i4 == 2 || i4 == 3) {
                return dateFormatSymbols.getShortMonths();
            }
            if (i4 == 4) {
                return b(dateFormatSymbols.getShortMonths(), 12);
            }
            throw new UnsupportedOperationException(xVar.name());
        }

        @Override // net.time4j.format.w
        public String[] g(String str, Locale locale, x xVar) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            if (xVar != x.NARROW) {
                return dateFormatSymbols.getEras();
            }
            String[] eras = dateFormatSymbols.getEras();
            String[] strArr = new String[eras.length];
            int length = eras.length;
            for (int i4 = 0; i4 < length; i4++) {
                if (!eras[i4].isEmpty()) {
                    strArr[i4] = f(eras[i4]);
                } else if (i4 == 0 && eras.length == 2) {
                    strArr[i4] = ProtectedSandApp.s("鍰\u0001");
                } else if (i4 == 1 && eras.length == 2) {
                    strArr[i4] = ProtectedSandApp.s("鍱\u0001");
                } else {
                    strArr[i4] = String.valueOf(i4);
                }
            }
            return strArr;
        }

        @Override // net.time4j.format.w
        public String[] h(String str, Locale locale, x xVar, m mVar) {
            String[] weekdays;
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            int i4 = a.f82824a[xVar.ordinal()];
            if (i4 == 1) {
                weekdays = dateFormatSymbols.getWeekdays();
            } else if (i4 == 2 || i4 == 3) {
                weekdays = dateFormatSymbols.getShortWeekdays();
            } else {
                if (i4 != 4) {
                    throw new UnsupportedOperationException(ProtectedSandApp.s("鍲\u0001") + xVar);
                }
                weekdays = b(h("", locale, x.SHORT, mVar), 7);
            }
            if (weekdays.length <= 7) {
                return weekdays;
            }
            String str2 = weekdays[1];
            String[] strArr = new String[7];
            System.arraycopy(weekdays, 2, strArr, 0, 6);
            strArr[6] = str2;
            return strArr;
        }

        @Override // net.time4j.format.w
        public String[] i(String str, Locale locale, x xVar, m mVar) {
            return xVar == x.NARROW ? new String[]{ProtectedSandApp.s("鍱\u0001"), ProtectedSandApp.s("鍳\u0001")} : DateFormatSymbols.getInstance(locale).getAmPmStrings();
        }

        @Override // net.time4j.format.w
        public boolean k(String str) {
            return ProtectedSandApp.s("鍴\u0001").equals(str);
        }

        @Override // net.time4j.format.w
        public String[] l() {
            return new String[]{ProtectedSandApp.s("鍴\u0001")};
        }

        public String toString() {
            return ProtectedSandApp.s("鍵\u0001");
        }

        d(a aVar) {
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(ProtectedSandApp.s("鍷\u0001"));
        hashSet.add(ProtectedSandApp.s("鍸\u0001"));
        hashSet.add(ProtectedSandApp.s("鍹\u0001"));
        hashSet.add(ProtectedSandApp.s("鍺\u0001"));
        hashSet.add(ProtectedSandApp.s("鍻\u0001"));
        hashSet.add(ProtectedSandApp.s("鍼\u0001"));
        hashSet.add(ProtectedSandApp.s("鍽\u0001"));
        hashSet.add(ProtectedSandApp.s("鍾\u0001"));
        hashSet.add(ProtectedSandApp.s("鍿\u0001"));
        hashSet.add(ProtectedSandApp.s("鎀\u0001"));
        hashSet.add(ProtectedSandApp.s("鎁\u0001"));
        hashSet.add(ProtectedSandApp.s("鎂\u0001"));
        f82807l = Collections.unmodifiableSet(hashSet);
        Iterator it = net.time4j.base.d.c().g(f.class).iterator();
        f82808m = new c(it.hasNext() ? (f) it.next() : new net.time4j.i18n.c());
        f82810o = new d();
        f82811p = new C1293b();
        f82812q = new ConcurrentHashMap();
    }

    private b(String str, Locale locale, w wVar) {
        this.f82813a = wVar.toString();
        int i4 = 0;
        Map<x, Map<m, u>> unmodifiableMap = Collections.unmodifiableMap(k(str, locale, wVar, false));
        this.f82814b = unmodifiableMap;
        Map<x, Map<m, u>> k4 = k(str, locale, wVar, true);
        if (k4 == null) {
            this.f82815c = unmodifiableMap;
        } else {
            this.f82815c = Collections.unmodifiableMap(k4);
        }
        EnumMap enumMap = new EnumMap(x.class);
        x[] values = x.values();
        int length = values.length;
        int i5 = 0;
        while (i5 < length) {
            x xVar = values[i5];
            EnumMap enumMap2 = new EnumMap(m.class);
            m[] values2 = m.values();
            int length2 = values2.length;
            int i6 = i4;
            while (i6 < length2) {
                m mVar = values2[i6];
                enumMap2.put((EnumMap) mVar, (m) new u(wVar.d(str, locale, xVar, mVar)));
                i6++;
                values = values;
            }
            enumMap.put((EnumMap) xVar, (x) enumMap2);
            i5++;
            i4 = 0;
        }
        this.f82816d = Collections.unmodifiableMap(enumMap);
        EnumMap enumMap3 = new EnumMap(x.class);
        x[] values3 = x.values();
        int length3 = values3.length;
        for (int i7 = 0; i7 < length3; i7++) {
            x xVar2 = values3[i7];
            EnumMap enumMap4 = new EnumMap(m.class);
            m[] values4 = m.values();
            int length4 = values4.length;
            int i10 = 0;
            while (i10 < length4) {
                m mVar2 = values4[i10];
                enumMap4.put((EnumMap) mVar2, (m) new u(wVar.h(str, locale, xVar2, mVar2)));
                i10++;
                values3 = values3;
                length3 = length3;
            }
            enumMap3.put((EnumMap) xVar2, (x) enumMap4);
        }
        this.f82817e = Collections.unmodifiableMap(enumMap3);
        EnumMap enumMap5 = new EnumMap(x.class);
        for (x xVar3 : x.values()) {
            enumMap5.put((EnumMap) xVar3, (x) new u(wVar.g(str, locale, xVar3)));
        }
        this.f82819g = Collections.unmodifiableMap(enumMap5);
        EnumMap enumMap6 = new EnumMap(x.class);
        x[] values5 = x.values();
        int length5 = values5.length;
        for (int i11 = 0; i11 < length5; i11++) {
            x xVar4 = values5[i11];
            EnumMap enumMap7 = new EnumMap(m.class);
            m[] values6 = m.values();
            int length6 = values6.length;
            int i12 = 0;
            while (i12 < length6) {
                m mVar3 = values6[i12];
                enumMap7.put((EnumMap) mVar3, (m) new u(wVar.i(str, locale, xVar4, mVar3)));
                i12++;
                values5 = values5;
            }
            enumMap6.put((EnumMap) xVar4, (x) enumMap7);
        }
        this.f82818f = Collections.unmodifiableMap(enumMap6);
        HashMap hashMap = new HashMap();
        try {
            net.time4j.i18n.e i13 = net.time4j.i18n.e.i(ProtectedSandApp.s("鎃\u0001") + str + ProtectedSandApp.s("鎄\u0001") + str, locale);
            for (String str2 : i13.h()) {
                hashMap.put(str2, i13.g(str2));
            }
            e = null;
        } catch (MissingResourceException e4) {
            e = e4;
        }
        this.f82820h = Collections.unmodifiableMap(hashMap);
        this.f82821i = str;
        this.f82822j = locale;
        this.f82823k = e;
    }

    public static void a() {
        f82812q.clear();
    }

    static String b(net.time4j.engine.x<?> xVar) {
        while (xVar instanceof net.time4j.engine.g) {
            xVar = xVar.d();
        }
        net.time4j.format.c cVar = (net.time4j.format.c) xVar.C().getAnnotation(net.time4j.format.c.class);
        return cVar == null ? ProtectedSandApp.s("鍶\u0001") : cVar.value();
    }

    public static b d(String str, Locale locale) {
        w wVar;
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("鎅\u0001"));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(':');
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (!country.isEmpty()) {
            sb.append('-');
            sb.append(country);
        }
        String sb2 = sb.toString();
        b bVar = f82812q.get(sb2);
        if (bVar != null) {
            return bVar;
        }
        if (locale.getLanguage().isEmpty() && str.equals(ProtectedSandApp.s("鍶\u0001"))) {
            wVar = f82811p;
        } else {
            Iterator it = net.time4j.base.d.c().g(w.class).iterator();
            while (true) {
                if (!it.hasNext()) {
                    wVar = null;
                    break;
                }
                w wVar2 = (w) it.next();
                if (wVar2.k(str) && wVar2.c(locale)) {
                    wVar = wVar2;
                    break;
                }
            }
            if (wVar == null) {
                w wVar3 = f82810o;
                if (wVar3.k(str) && wVar3.c(locale)) {
                    wVar = wVar3;
                }
                if (wVar == null) {
                    wVar = f82811p;
                }
            }
        }
        b bVar2 = new b(str, locale, wVar);
        b putIfAbsent = f82812q.putIfAbsent(sb2, bVar2);
        return putIfAbsent != null ? putIfAbsent : bVar2;
    }

    public static b e(net.time4j.engine.x<?> xVar, Locale locale) {
        return d(b(xVar), locale);
    }

    public static b f(Locale locale) {
        return d(ProtectedSandApp.s("鍶\u0001"), locale);
    }

    private String g(String str) {
        Map<String, String> map = this.f82820h;
        String s4 = ProtectedSandApp.s("鎆\u0001");
        if (map.containsKey(s4)) {
            return ProtectedSandApp.s("鎇\u0001").equals(this.f82820h.get(s4)) ? (str.equals(ProtectedSandApp.s("鎈\u0001")) || str.equals(ProtectedSandApp.s("鎉\u0001")) || str.equals(ProtectedSandApp.s("鎊\u0001")) || str.equals(ProtectedSandApp.s("鎋\u0001"))) ? str.substring(0, 1) : str.equals(ProtectedSandApp.s("鎌\u0001")) ? ProtectedSandApp.s("鎍\u0001") : str.equals(ProtectedSandApp.s("鎎\u0001")) ? ProtectedSandApp.s("鎏\u0001") : str.equals(ProtectedSandApp.s("鎐\u0001")) ? ProtectedSandApp.s("鎑\u0001") : str : str;
        }
        return str;
    }

    private static String h(String str, int i4, String... strArr) {
        if (strArr == null || strArr.length <= 0) {
            if (i4 > 0) {
                return null;
            }
            return str;
        }
        if (strArr.length < i4) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str);
        boolean z4 = true;
        for (int i5 = 0; i5 < strArr.length - i4; i5++) {
            if (z4) {
                sb.append('(');
                z4 = false;
            } else {
                sb.append('|');
            }
            sb.append(strArr[i5]);
        }
        if (!z4) {
            sb.append(')');
        }
        return sb.toString();
    }

    private static Map<x, Map<m, u>> k(String str, Locale locale, w wVar, boolean z4) {
        int i4;
        m[] mVarArr;
        EnumMap enumMap;
        x xVar;
        EnumMap enumMap2 = new EnumMap(x.class);
        x[] values = x.values();
        int length = values.length;
        boolean z5 = false;
        int i5 = 0;
        while (i5 < length) {
            x xVar2 = values[i5];
            EnumMap enumMap3 = new EnumMap(m.class);
            m[] values2 = m.values();
            int length2 = values2.length;
            boolean z6 = z5;
            int i6 = 0;
            while (i6 < length2) {
                m mVar = values2[i6];
                int i7 = i6;
                String[] e4 = wVar.e(str, locale, xVar2, mVar, z4);
                if (!z4 || z6) {
                    i4 = length2;
                    mVarArr = values2;
                    enumMap = enumMap3;
                    xVar = xVar2;
                } else {
                    i4 = length2;
                    mVarArr = values2;
                    enumMap = enumMap3;
                    xVar = xVar2;
                    z6 = !Arrays.equals(wVar.e(str, locale, xVar2, mVar, false), e4);
                }
                enumMap.put((EnumMap) mVar, (m) new u(e4));
                i6 = i7 + 1;
                length2 = i4;
                values2 = mVarArr;
                enumMap3 = enumMap;
                xVar2 = xVar;
            }
            enumMap2.put((EnumMap) xVar2, (x) enumMap3);
            i5++;
            z5 = z6;
        }
        if (!z4 || z5) {
            return enumMap2;
        }
        return null;
    }

    private u l(x xVar, m mVar, boolean z4) {
        return z4 ? this.f82815c.get(xVar).get(mVar) : this.f82814b.get(xVar).get(mVar);
    }

    public static boolean s(Locale locale) {
        return f82807l.contains(locale.getLanguage());
    }

    public static String t(e eVar, Locale locale) {
        return f82808m.f(eVar, locale);
    }

    public static String u(Locale locale) {
        return f82808m.m(locale);
    }

    public static String v(e eVar, e eVar2, Locale locale) {
        return f82808m.n(eVar, eVar2, locale);
    }

    public static String w(e eVar, Locale locale) {
        return f82808m.b(eVar, locale);
    }

    public static String x(e eVar, e eVar2, Locale locale) {
        return pe.d.a(f82808m.n(eVar, eVar2, locale));
    }

    private static String y(String str, int i4, int i5) {
        return str + '_' + (i4 + i5);
    }

    public u c(x xVar) {
        return this.f82819g.get(xVar);
    }

    public u i(x xVar, m mVar) {
        return l(xVar, mVar, true);
    }

    public u j(x xVar, m mVar) {
        return this.f82818f.get(xVar).get(mVar);
    }

    public u m(x xVar, m mVar) {
        return this.f82816d.get(xVar).get(mVar);
    }

    public u n(x xVar, m mVar) {
        return l(xVar, mVar, false);
    }

    public Map<String, String> o() {
        return this.f82820h;
    }

    public <V extends Enum<V>> u p(String str, Class<V> cls, String... strArr) {
        String str2;
        if (this.f82823k != null) {
            throw new MissingResourceException(this.f82823k.getMessage(), this.f82823k.getClassName(), this.f82823k.getKey());
        }
        V[] enumConstants = cls.getEnumConstants();
        int length = enumConstants.length;
        String[] strArr2 = new String[length];
        String g4 = g(str);
        int i4 = !net.time4j.engine.j.class.isAssignableFrom(cls) ? 1 : 0;
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = 0;
            while (true) {
                String h4 = h(g4, i6, strArr);
                if (h4 == null) {
                    str2 = null;
                    break;
                }
                str2 = y(h4, i5, i4);
                if (this.f82820h.containsKey(str2)) {
                    break;
                }
                i6++;
            }
            if (str2 != null) {
                strArr2[i5] = this.f82820h.get(str2);
            } else if (this.f82820h.containsKey(str)) {
                strArr2[i5] = this.f82820h.get(str);
            } else {
                strArr2[i5] = enumConstants[i5].name();
            }
        }
        return new u(strArr2);
    }

    public <V extends Enum<V>> u q(net.time4j.engine.q<V> qVar, String... strArr) {
        return p(qVar.name(), qVar.getType(), strArr);
    }

    public u r(x xVar, m mVar) {
        return this.f82817e.get(xVar).get(mVar);
    }

    public String toString() {
        return this.f82813a + ProtectedSandApp.s("鎒\u0001") + this.f82821i + ProtectedSandApp.s("鎄\u0001") + this.f82822j + ProtectedSandApp.s("鎓\u0001");
    }
}
