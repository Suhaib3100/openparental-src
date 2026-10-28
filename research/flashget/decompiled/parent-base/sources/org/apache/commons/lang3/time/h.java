package org.apache.commons.lang3.time;

import androidx.compose.material3.j4;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: FastDateParser.java */
/* loaded from: classes6.dex */
public class h implements org.apache.commons.lang3.time.c, Serializable {

    /* renamed from: h, reason: collision with root package name */
    private static final long f86271h = 3;

    /* renamed from: b, reason: collision with root package name */
    private final String f86290b;

    /* renamed from: c, reason: collision with root package name */
    private final TimeZone f86291c;

    /* renamed from: d, reason: collision with root package name */
    private final Locale f86292d;

    /* renamed from: e, reason: collision with root package name */
    private final int f86293e;

    /* renamed from: f, reason: collision with root package name */
    private final int f86294f;

    /* renamed from: g, reason: collision with root package name */
    private transient List<l> f86295g;

    /* renamed from: i, reason: collision with root package name */
    static final Locale f86272i = new Locale("ja", "JP", "JP");

    /* renamed from: j, reason: collision with root package name */
    private static final Comparator<String> f86273j = Comparator.reverseOrder();

    /* renamed from: k, reason: collision with root package name */
    private static final ConcurrentMap<Locale, k>[] f86274k = new ConcurrentMap[17];

    /* renamed from: l, reason: collision with root package name */
    private static final k f86275l = new a(1);

    /* renamed from: m, reason: collision with root package name */
    private static final k f86276m = new b(2);

    /* renamed from: n, reason: collision with root package name */
    private static final k f86277n = new i(1);

    /* renamed from: o, reason: collision with root package name */
    private static final k f86278o = new i(3);

    /* renamed from: p, reason: collision with root package name */
    private static final k f86279p = new i(4);

    /* renamed from: q, reason: collision with root package name */
    private static final k f86280q = new i(6);

    /* renamed from: r, reason: collision with root package name */
    private static final k f86281r = new i(5);

    /* renamed from: s, reason: collision with root package name */
    private static final k f86282s = new c(7);

    /* renamed from: t, reason: collision with root package name */
    private static final k f86283t = new i(8);

    /* renamed from: u, reason: collision with root package name */
    private static final k f86284u = new i(11);

    /* renamed from: v, reason: collision with root package name */
    private static final k f86285v = new d(11);

    /* renamed from: w, reason: collision with root package name */
    private static final k f86286w = new e(10);

    /* renamed from: x, reason: collision with root package name */
    private static final k f86287x = new i(10);

    /* renamed from: y, reason: collision with root package name */
    private static final k f86288y = new i(12);

    /* renamed from: z, reason: collision with root package name */
    private static final k f86289z = new i(13);
    private static final k A = new i(14);

    /* compiled from: FastDateParser.java */
    static class a extends i {
        a(int i4) {
            super(i4);
        }

        @Override // org.apache.commons.lang3.time.h.i
        int c(h hVar, int i4) {
            return i4 < 100 ? hVar.l(i4) : i4;
        }
    }

    /* compiled from: FastDateParser.java */
    static class b extends i {
        b(int i4) {
            super(i4);
        }

        @Override // org.apache.commons.lang3.time.h.i
        int c(h hVar, int i4) {
            return i4 - 1;
        }
    }

    /* compiled from: FastDateParser.java */
    static class c extends i {
        c(int i4) {
            super(i4);
        }

        @Override // org.apache.commons.lang3.time.h.i
        int c(h hVar, int i4) {
            if (i4 == 7) {
                return 1;
            }
            return 1 + i4;
        }
    }

    /* compiled from: FastDateParser.java */
    static class d extends i {
        d(int i4) {
            super(i4);
        }

        @Override // org.apache.commons.lang3.time.h.i
        int c(h hVar, int i4) {
            if (i4 == 24) {
                return 0;
            }
            return i4;
        }
    }

    /* compiled from: FastDateParser.java */
    static class e extends i {
        e(int i4) {
            super(i4);
        }

        @Override // org.apache.commons.lang3.time.h.i
        int c(h hVar, int i4) {
            if (i4 == 12) {
                return 0;
            }
            return i4;
        }
    }

    /* compiled from: FastDateParser.java */
    private static class f extends j {

        /* renamed from: b, reason: collision with root package name */
        private final int f86296b;

        /* renamed from: c, reason: collision with root package name */
        final Locale f86297c;

        /* renamed from: d, reason: collision with root package name */
        private final Map<String, Integer> f86298d;

        f(int i4, Calendar calendar, Locale locale) {
            super(null);
            this.f86296b = i4;
            this.f86297c = locale;
            StringBuilder a5 = j4.a("((?iu)");
            this.f86298d = h.m(calendar, locale, i4, a5);
            a5.setLength(a5.length() - 1);
            a5.append(")");
            d(a5);
        }

        @Override // org.apache.commons.lang3.time.h.j
        void e(h hVar, Calendar calendar, String str) {
            String lowerCase = str.toLowerCase(this.f86297c);
            Integer num = this.f86298d.get(lowerCase);
            if (num == null) {
                num = this.f86298d.get(lowerCase + '.');
            }
            calendar.set(this.f86296b, num.intValue());
        }
    }

    /* compiled from: FastDateParser.java */
    private static class g extends k {

        /* renamed from: a, reason: collision with root package name */
        private final String f86299a;

        g(String str) {
            super(null);
            this.f86299a = str;
        }

        @Override // org.apache.commons.lang3.time.h.k
        boolean a() {
            return false;
        }

        @Override // org.apache.commons.lang3.time.h.k
        boolean b(h hVar, Calendar calendar, String str, ParsePosition parsePosition, int i4) {
            for (int i5 = 0; i5 < this.f86299a.length(); i5++) {
                int index = parsePosition.getIndex() + i5;
                if (index == str.length()) {
                    parsePosition.setErrorIndex(index);
                    return false;
                }
                if (this.f86299a.charAt(i5) != str.charAt(index)) {
                    parsePosition.setErrorIndex(index);
                    return false;
                }
            }
            parsePosition.setIndex(parsePosition.getIndex() + this.f86299a.length());
            return true;
        }
    }

    /* compiled from: FastDateParser.java */
    /* renamed from: org.apache.commons.lang3.time.h$h, reason: collision with other inner class name */
    private static class C1339h extends j {

        /* renamed from: b, reason: collision with root package name */
        private static final k f86300b = new C1339h("(Z|(?:[+-]\\d{2}))");

        /* renamed from: c, reason: collision with root package name */
        private static final k f86301c = new C1339h("(Z|(?:[+-]\\d{2}\\d{2}))");

        /* renamed from: d, reason: collision with root package name */
        private static final k f86302d = new C1339h("(Z|(?:[+-]\\d{2}(?::)\\d{2}))");

        C1339h(String str) {
            super(null);
            c(str);
        }

        static k g(int i4) {
            if (i4 == 1) {
                return f86300b;
            }
            if (i4 == 2) {
                return f86301c;
            }
            if (i4 == 3) {
                return f86302d;
            }
            throw new IllegalArgumentException("invalid number of X");
        }

        @Override // org.apache.commons.lang3.time.h.j
        void e(h hVar, Calendar calendar, String str) {
            calendar.setTimeZone(org.apache.commons.lang3.time.j.b(str));
        }
    }

    /* compiled from: FastDateParser.java */
    private static class i extends k {

        /* renamed from: a, reason: collision with root package name */
        private final int f86303a;

        i(int i4) {
            super(null);
            this.f86303a = i4;
        }

        @Override // org.apache.commons.lang3.time.h.k
        boolean a() {
            return true;
        }

        @Override // org.apache.commons.lang3.time.h.k
        boolean b(h hVar, Calendar calendar, String str, ParsePosition parsePosition, int i4) {
            int index = parsePosition.getIndex();
            int length = str.length();
            if (i4 == 0) {
                while (index < length && Character.isWhitespace(str.charAt(index))) {
                    index++;
                }
                parsePosition.setIndex(index);
            } else {
                int i5 = i4 + index;
                if (length > i5) {
                    length = i5;
                }
            }
            while (index < length && Character.isDigit(str.charAt(index))) {
                index++;
            }
            if (parsePosition.getIndex() == index) {
                parsePosition.setErrorIndex(index);
                return false;
            }
            int parseInt = Integer.parseInt(str.substring(parsePosition.getIndex(), index));
            parsePosition.setIndex(index);
            calendar.set(this.f86303a, c(hVar, parseInt));
            return true;
        }

        int c(h hVar, int i4) {
            return i4;
        }
    }

    /* compiled from: FastDateParser.java */
    private static abstract class j extends k {

        /* renamed from: a, reason: collision with root package name */
        private Pattern f86304a;

        private j() {
            super(null);
        }

        @Override // org.apache.commons.lang3.time.h.k
        boolean a() {
            return false;
        }

        @Override // org.apache.commons.lang3.time.h.k
        boolean b(h hVar, Calendar calendar, String str, ParsePosition parsePosition, int i4) {
            Matcher matcher = this.f86304a.matcher(str.substring(parsePosition.getIndex()));
            if (!matcher.lookingAt()) {
                parsePosition.setErrorIndex(parsePosition.getIndex());
                return false;
            }
            parsePosition.setIndex(matcher.end(1) + parsePosition.getIndex());
            e(hVar, calendar, matcher.group(1));
            return true;
        }

        void c(String str) {
            this.f86304a = Pattern.compile(str);
        }

        void d(StringBuilder sb) {
            c(sb.toString());
        }

        abstract void e(h hVar, Calendar calendar, String str);

        j(a aVar) {
            super(null);
        }
    }

    /* compiled from: FastDateParser.java */
    private static abstract class k {
        private k() {
        }

        boolean a() {
            return false;
        }

        abstract boolean b(h hVar, Calendar calendar, String str, ParsePosition parsePosition, int i4);

        /* synthetic */ k(a aVar) {
            this();
        }
    }

    /* compiled from: FastDateParser.java */
    private static class l {

        /* renamed from: a, reason: collision with root package name */
        final k f86305a;

        /* renamed from: b, reason: collision with root package name */
        final int f86306b;

        l(k kVar, int i4) {
            this.f86305a = kVar;
            this.f86306b = i4;
        }

        int a(ListIterator<l> listIterator) {
            if (!this.f86305a.a() || !listIterator.hasNext()) {
                return 0;
            }
            k kVar = listIterator.next().f86305a;
            listIterator.previous();
            if (kVar.a()) {
                return this.f86306b;
            }
            return 0;
        }
    }

    /* compiled from: FastDateParser.java */
    private class m {

        /* renamed from: a, reason: collision with root package name */
        private final Calendar f86307a;

        /* renamed from: b, reason: collision with root package name */
        private int f86308b;

        m(Calendar calendar) {
            this.f86307a = calendar;
        }

        private l b(char c5) {
            int i4 = this.f86308b;
            do {
                int i5 = this.f86308b + 1;
                this.f86308b = i5;
                if (i5 >= h.this.f86290b.length()) {
                    break;
                }
            } while (h.this.f86290b.charAt(this.f86308b) == c5);
            int i6 = this.f86308b - i4;
            return new l(h.this.q(c5, i6, this.f86307a), i6);
        }

        private l c() {
            StringBuilder sb = new StringBuilder();
            boolean z4 = false;
            while (this.f86308b < h.this.f86290b.length()) {
                char charAt = h.this.f86290b.charAt(this.f86308b);
                if (!z4 && h.s(charAt)) {
                    break;
                }
                if (charAt == '\'') {
                    int i4 = this.f86308b + 1;
                    this.f86308b = i4;
                    if (i4 == h.this.f86290b.length() || h.this.f86290b.charAt(this.f86308b) != '\'') {
                        z4 = !z4;
                    }
                }
                this.f86308b++;
                sb.append(charAt);
            }
            if (z4) {
                throw new IllegalArgumentException("Unterminated quote");
            }
            String sb2 = sb.toString();
            return new l(new g(sb2), sb2.length());
        }

        l a() {
            if (this.f86308b >= h.this.f86290b.length()) {
                return null;
            }
            char charAt = h.this.f86290b.charAt(this.f86308b);
            return h.s(charAt) ? b(charAt) : c();
        }
    }

    /* compiled from: FastDateParser.java */
    static class n extends j {

        /* renamed from: d, reason: collision with root package name */
        private static final String f86310d = "[+-]\\d{4}";

        /* renamed from: e, reason: collision with root package name */
        private static final String f86311e = "GMT[+-]\\d{1,2}:\\d{2}";

        /* renamed from: f, reason: collision with root package name */
        private static final int f86312f = 0;

        /* renamed from: b, reason: collision with root package name */
        private final Locale f86313b;

        /* renamed from: c, reason: collision with root package name */
        private final Map<String, a> f86314c;

        /* compiled from: FastDateParser.java */
        private static class a {

            /* renamed from: a, reason: collision with root package name */
            TimeZone f86315a;

            /* renamed from: b, reason: collision with root package name */
            int f86316b;

            a(TimeZone timeZone, boolean z4) {
                this.f86315a = timeZone;
                this.f86316b = z4 ? timeZone.getDSTSavings() : 0;
            }
        }

        n(Locale locale) {
            super(null);
            this.f86314c = new HashMap();
            this.f86313b = locale;
            StringBuilder sb = new StringBuilder("((?iu)[+-]\\d{4}|GMT[+-]\\d{1,2}:\\d{2}");
            TreeSet treeSet = new TreeSet(h.f86273j);
            for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
                String str = strArr[0];
                if (!str.equalsIgnoreCase("GMT")) {
                    TimeZone timeZone = TimeZone.getTimeZone(str);
                    a aVar = new a(timeZone, false);
                    a aVar2 = aVar;
                    for (int i4 = 1; i4 < strArr.length; i4++) {
                        if (i4 == 3) {
                            aVar2 = new a(timeZone, true);
                        } else if (i4 == 5) {
                            aVar2 = aVar;
                        }
                        String str2 = strArr[i4];
                        if (str2 != null) {
                            String lowerCase = str2.toLowerCase(locale);
                            if (treeSet.add(lowerCase)) {
                                this.f86314c.put(lowerCase, aVar2);
                            }
                        }
                    }
                }
            }
            Iterator it = treeSet.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                sb.append('|');
                h.u(sb, str3);
            }
            sb.append(")");
            d(sb);
        }

        @Override // org.apache.commons.lang3.time.h.j
        void e(h hVar, Calendar calendar, String str) {
            TimeZone b5 = org.apache.commons.lang3.time.j.b(str);
            if (b5 != null) {
                calendar.setTimeZone(b5);
                return;
            }
            String lowerCase = str.toLowerCase(this.f86313b);
            a aVar = this.f86314c.get(lowerCase);
            if (aVar == null) {
                aVar = this.f86314c.get(lowerCase + '.');
            }
            calendar.set(16, aVar.f86316b);
            calendar.set(15, aVar.f86315a.getRawOffset());
        }
    }

    protected h(String str, TimeZone timeZone, Locale locale) {
        this(str, timeZone, locale, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int l(int i4) {
        int i5 = this.f86293e + i4;
        return i4 >= this.f86294f ? i5 : i5 + 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, Integer> m(Calendar calendar, Locale locale, int i4, StringBuilder sb) {
        HashMap hashMap = new HashMap();
        Map<String, Integer> displayNames = calendar.getDisplayNames(i4, 0, locale);
        TreeSet treeSet = new TreeSet(f86273j);
        for (Map.Entry<String, Integer> entry : displayNames.entrySet()) {
            String lowerCase = entry.getKey().toLowerCase(locale);
            if (treeSet.add(lowerCase)) {
                hashMap.put(lowerCase, entry.getValue());
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            u(sb, (String) it.next()).append('|');
        }
        return hashMap;
    }

    private static ConcurrentMap<Locale, k> o(int i4) {
        ConcurrentMap<Locale, k> concurrentMap;
        ConcurrentMap<Locale, k>[] concurrentMapArr = f86274k;
        synchronized (concurrentMapArr) {
            try {
                if (concurrentMapArr[i4] == null) {
                    concurrentMapArr[i4] = new ConcurrentHashMap(3);
                }
                concurrentMap = concurrentMapArr[i4];
            } catch (Throwable th) {
                throw th;
            }
        }
        return concurrentMap;
    }

    private k p(int i4, Calendar calendar) {
        ConcurrentMap<Locale, k> o4 = o(i4);
        k kVar = o4.get(this.f86292d);
        if (kVar == null) {
            kVar = i4 == 15 ? new n(this.f86292d) : new f(i4, calendar, this.f86292d);
            k putIfAbsent = o4.putIfAbsent(this.f86292d, kVar);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
        }
        return kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public k q(char c5, int i4, Calendar calendar) {
        if (c5 != 'y') {
            if (c5 != 'z') {
                switch (c5) {
                    case 'D':
                        return f86280q;
                    case 'E':
                        return p(7, calendar);
                    case 'F':
                        return f86283t;
                    case 'G':
                        return p(0, calendar);
                    case 'H':
                        return f86284u;
                    default:
                        switch (c5) {
                            case 'K':
                                return f86287x;
                            case 'M':
                                return i4 >= 3 ? p(2, calendar) : f86276m;
                            case 'S':
                                return A;
                            case 'a':
                                return p(9, calendar);
                            case 'd':
                                return f86281r;
                            case 'h':
                                return f86286w;
                            case 'k':
                                return f86285v;
                            case 'm':
                                return f86288y;
                            case 's':
                                return f86289z;
                            case 'u':
                                return f86282s;
                            case 'w':
                                return f86278o;
                            default:
                                switch (c5) {
                                    case 'W':
                                        return f86279p;
                                    case 'X':
                                        return C1339h.g(i4);
                                    case 'Y':
                                        break;
                                    case 'Z':
                                        if (i4 == 2) {
                                            return C1339h.f86302d;
                                        }
                                        break;
                                    default:
                                        throw new IllegalArgumentException("Format '" + c5 + "' not supported");
                                }
                        }
                }
            }
            return p(15, calendar);
        }
        return i4 > 2 ? f86277n : f86275l;
    }

    private void r(Calendar calendar) {
        this.f86295g = new ArrayList();
        m mVar = new m(calendar);
        while (true) {
            l a5 = mVar.a();
            if (a5 == null) {
                return;
            } else {
                this.f86295g.add(a5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean s(char c5) {
        return (c5 >= 'A' && c5 <= 'Z') || (c5 >= 'a' && c5 <= 'z');
    }

    private void t(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        r(Calendar.getInstance(this.f86291c, this.f86292d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static StringBuilder u(StringBuilder sb, String str) {
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (charAt != '$' && charAt != '.' && charAt != '?' && charAt != '^' && charAt != '[' && charAt != '\\' && charAt != '{' && charAt != '|') {
                switch (charAt) {
                }
                sb.append(charAt);
            }
            sb.append('\\');
            sb.append(charAt);
        }
        if (sb.charAt(sb.length() - 1) == '.') {
            sb.append('?');
        }
        return sb;
    }

    @Override // org.apache.commons.lang3.time.c, org.apache.commons.lang3.time.d
    public String b() {
        return this.f86290b;
    }

    @Override // org.apache.commons.lang3.time.c, org.apache.commons.lang3.time.d
    public TimeZone c() {
        return this.f86291c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f86290b.equals(hVar.f86290b) && this.f86291c.equals(hVar.f86291c) && this.f86292d.equals(hVar.f86292d);
    }

    @Override // org.apache.commons.lang3.time.c
    public boolean f(String str, ParsePosition parsePosition, Calendar calendar) {
        ListIterator<l> listIterator = this.f86295g.listIterator();
        while (listIterator.hasNext()) {
            l next = listIterator.next();
            if (!next.f86305a.b(this, calendar, str, parsePosition, next.a(listIterator))) {
                return false;
            }
        }
        return true;
    }

    @Override // org.apache.commons.lang3.time.c, org.apache.commons.lang3.time.d
    public Locale getLocale() {
        return this.f86292d;
    }

    public int hashCode() {
        return (((this.f86292d.hashCode() * 13) + this.f86291c.hashCode()) * 13) + this.f86290b.hashCode();
    }

    @Override // org.apache.commons.lang3.time.c
    public Date i(String str, ParsePosition parsePosition) {
        Calendar calendar = Calendar.getInstance(this.f86291c, this.f86292d);
        calendar.clear();
        if (f(str, parsePosition, calendar)) {
            return calendar.getTime();
        }
        return null;
    }

    @Override // org.apache.commons.lang3.time.c
    public Date n(String str) throws ParseException {
        ParsePosition parsePosition = new ParsePosition(0);
        Date i4 = i(str, parsePosition);
        if (i4 != null) {
            return i4;
        }
        if (!this.f86292d.equals(f86272i)) {
            throw new ParseException(androidx.constraintlayout.core.motion.key.c.a("Unparseable date: ", str), parsePosition.getErrorIndex());
        }
        throw new ParseException("(The " + this.f86292d + " locale does not support dates before 1868 AD)\nUnparseable date: \"" + str, parsePosition.getErrorIndex());
    }

    @Override // org.apache.commons.lang3.time.c
    public Object parseObject(String str) throws ParseException {
        return n(str);
    }

    public String toString() {
        return "FastDateParser[" + this.f86290b + "," + this.f86292d + "," + this.f86291c.getID() + "]";
    }

    protected h(String str, TimeZone timeZone, Locale locale, Date date) {
        int i4;
        this.f86290b = str;
        this.f86291c = timeZone;
        this.f86292d = locale;
        Calendar calendar = Calendar.getInstance(timeZone, locale);
        if (date != null) {
            calendar.setTime(date);
            i4 = calendar.get(1);
        } else if (locale.equals(f86272i)) {
            i4 = 0;
        } else {
            calendar.setTime(new Date());
            i4 = calendar.get(1) - 80;
        }
        int i5 = (i4 / 100) * 100;
        this.f86293e = i5;
        this.f86294f = i4 - i5;
        r(calendar);
    }

    @Override // org.apache.commons.lang3.time.c
    public Object parseObject(String str, ParsePosition parsePosition) {
        return i(str, parsePosition);
    }
}
