package org.apache.commons.lang3.time;

import androidx.collection.r2;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.k1;

/* compiled from: DateUtils.java */
/* loaded from: classes6.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final long f86239a = 1000;

    /* renamed from: b, reason: collision with root package name */
    public static final long f86240b = 60000;

    /* renamed from: c, reason: collision with root package name */
    public static final long f86241c = 3600000;

    /* renamed from: d, reason: collision with root package name */
    public static final long f86242d = 86400000;

    /* renamed from: e, reason: collision with root package name */
    public static final int f86243e = 1001;

    /* renamed from: f, reason: collision with root package name */
    private static final int[][] f86244f = {new int[]{14}, new int[]{13}, new int[]{12}, new int[]{11, 10}, new int[]{5, 5, 9}, new int[]{2, 1001}, new int[]{1}, new int[]{0}};

    /* renamed from: g, reason: collision with root package name */
    public static final int f86245g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f86246h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static final int f86247i = 3;

    /* renamed from: j, reason: collision with root package name */
    public static final int f86248j = 4;

    /* renamed from: k, reason: collision with root package name */
    public static final int f86249k = 5;

    /* renamed from: l, reason: collision with root package name */
    public static final int f86250l = 6;

    /* compiled from: DateUtils.java */
    static class a implements Iterator<Calendar> {

        /* renamed from: b, reason: collision with root package name */
        private final Calendar f86251b;

        /* renamed from: c, reason: collision with root package name */
        private final Calendar f86252c;

        a(Calendar calendar, Calendar calendar2) {
            this.f86251b = calendar2;
            this.f86252c = calendar;
            calendar.add(5, -1);
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Calendar next() {
            if (this.f86252c.equals(this.f86251b)) {
                throw new NoSuchElementException();
            }
            this.f86252c.add(5, 1);
            return (Calendar) this.f86252c.clone();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f86252c.before(this.f86251b);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: DateUtils.java */
    private enum b {
        TRUNCATE,
        ROUND,
        CEILING
    }

    public static boolean A(Calendar calendar, Calendar calendar2) {
        if (calendar == null || calendar2 == null) {
            throw H();
        }
        return calendar.getTime().getTime() == calendar2.getTime().getTime();
    }

    public static boolean B(Date date, Date date2) {
        if (date == null || date2 == null) {
            throw H();
        }
        return date.getTime() == date2.getTime();
    }

    public static boolean C(Calendar calendar, Calendar calendar2) {
        if (calendar == null || calendar2 == null) {
            throw H();
        }
        return calendar.get(14) == calendar2.get(14) && calendar.get(13) == calendar2.get(13) && calendar.get(12) == calendar2.get(12) && calendar.get(11) == calendar2.get(11) && calendar.get(6) == calendar2.get(6) && calendar.get(1) == calendar2.get(1) && calendar.get(0) == calendar2.get(0) && calendar.getClass() == calendar2.getClass();
    }

    public static Iterator<?> D(Object obj, int i4) {
        if (obj == null) {
            throw H();
        }
        if (obj instanceof Date) {
            return F((Date) obj, i4);
        }
        if (obj instanceof Calendar) {
            return E((Calendar) obj, i4);
        }
        throw new ClassCastException(androidx.databinding.a.a("Could not iterate based on ", obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[LOOP:0: B:20:0x0068->B:22:0x006e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078 A[LOOP:1: B:24:0x0072->B:26:0x0078, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Iterator<java.util.Calendar> E(java.util.Calendar r8, int r9) {
        /*
            if (r8 == 0) goto L82
            r0 = -1
            r1 = 5
            r2 = 2
            r3 = 1
            r4 = 7
            switch(r9) {
                case 1: goto L34;
                case 2: goto L34;
                case 3: goto L34;
                case 4: goto L34;
                case 5: goto L18;
                case 6: goto L18;
                default: goto La;
            }
        La:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The range style "
            java.lang.String r1 = " is not valid."
            java.lang.String r9 = androidx.collection.r2.a(r0, r9, r1)
            r8.<init>(r9)
            throw r8
        L18:
            java.util.Calendar r8 = a0(r8, r2)
            java.lang.Object r5 = r8.clone()
            java.util.Calendar r5 = (java.util.Calendar) r5
            r5.add(r2, r3)
            r5.add(r1, r0)
            r6 = 6
            if (r9 != r6) goto L2f
            r6 = r5
            r5 = r8
        L2d:
            r8 = r3
            goto L58
        L2f:
            r2 = r3
            r6 = r5
            r5 = r8
        L32:
            r8 = r4
            goto L58
        L34:
            java.util.Calendar r5 = a0(r8, r1)
            java.util.Calendar r6 = a0(r8, r1)
            if (r9 == r2) goto L2d
            r2 = 3
            if (r9 == r2) goto L52
            r7 = 4
            if (r9 == r7) goto L46
            r2 = r3
            goto L32
        L46:
            int r9 = r8.get(r4)
            int r9 = r9 - r2
            int r8 = r8.get(r4)
            int r8 = r8 + r2
            r2 = r9
            goto L58
        L52:
            int r2 = r8.get(r4)
            int r8 = r2 + (-1)
        L58:
            if (r2 >= r3) goto L5c
            int r2 = r2 + 7
        L5c:
            if (r2 <= r4) goto L60
            int r2 = r2 + (-7)
        L60:
            if (r8 >= r3) goto L64
            int r8 = r8 + 7
        L64:
            if (r8 <= r4) goto L68
            int r8 = r8 + (-7)
        L68:
            int r9 = r5.get(r4)
            if (r9 == r2) goto L72
            r5.add(r1, r0)
            goto L68
        L72:
            int r9 = r6.get(r4)
            if (r9 == r8) goto L7c
            r6.add(r1, r3)
            goto L72
        L7c:
            org.apache.commons.lang3.time.e$a r8 = new org.apache.commons.lang3.time.e$a
            r8.<init>(r5, r6)
            return r8
        L82:
            java.lang.IllegalArgumentException r8 = H()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.time.e.E(java.util.Calendar, int):java.util.Iterator");
    }

    public static Iterator<Calendar> F(Date date, int i4) {
        h0(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return E(calendar, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void G(java.util.Calendar r16, int r17, org.apache.commons.lang3.time.e.b r18) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.time.e.G(java.util.Calendar, int, org.apache.commons.lang3.time.e$b):void");
    }

    private static IllegalArgumentException H() {
        return new IllegalArgumentException("The date must not be null");
    }

    public static Date I(String str, Locale locale, String... strArr) throws ParseException {
        return M(str, locale, strArr, true);
    }

    public static Date J(String str, String... strArr) throws ParseException {
        return M(str, null, strArr, true);
    }

    public static Date K(String str, Locale locale, String... strArr) throws ParseException {
        return M(str, locale, strArr, false);
    }

    public static Date L(String str, String... strArr) throws ParseException {
        return M(str, null, strArr, false);
    }

    private static Date M(String str, Locale locale, String[] strArr, boolean z4) throws ParseException {
        if (str == null || strArr == null) {
            throw new IllegalArgumentException("Date and Patterns must not be null");
        }
        TimeZone timeZone = TimeZone.getDefault();
        if (locale == null) {
            locale = Locale.getDefault();
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Calendar calendar = Calendar.getInstance(timeZone, locale);
        calendar.setLenient(z4);
        for (String str2 : strArr) {
            h hVar = new h(str2, timeZone, locale, null);
            calendar.clear();
            try {
                if (hVar.f(str, parsePosition, calendar) && parsePosition.getIndex() == str.length()) {
                    return calendar.getTime();
                }
            } catch (IllegalArgumentException unused) {
            }
            parsePosition.setIndex(0);
        }
        throw new ParseException("Unable to parse the date: ".concat(str), -1);
    }

    public static Calendar N(Calendar calendar, int i4) {
        if (calendar == null) {
            throw H();
        }
        Calendar calendar2 = (Calendar) calendar.clone();
        G(calendar2, i4, b.ROUND);
        return calendar2;
    }

    public static Date O(Object obj, int i4) {
        if (obj == null) {
            throw H();
        }
        if (obj instanceof Date) {
            return P((Date) obj, i4);
        }
        if (obj instanceof Calendar) {
            return N((Calendar) obj, i4).getTime();
        }
        throw new ClassCastException(androidx.databinding.a.a("Could not round ", obj));
    }

    public static Date P(Date date, int i4) {
        h0(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        G(calendar, i4, b.ROUND);
        return calendar.getTime();
    }

    private static Date Q(Date date, int i4, int i5) {
        h0(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setLenient(false);
        calendar.setTime(date);
        calendar.set(i4, i5);
        return calendar.getTime();
    }

    public static Date R(Date date, int i4) {
        return Q(date, 5, i4);
    }

    public static Date S(Date date, int i4) {
        return Q(date, 11, i4);
    }

    public static Date T(Date date, int i4) {
        return Q(date, 14, i4);
    }

    public static Date U(Date date, int i4) {
        return Q(date, 12, i4);
    }

    public static Date V(Date date, int i4) {
        return Q(date, 2, i4);
    }

    public static Date W(Date date, int i4) {
        return Q(date, 13, i4);
    }

    public static Date X(Date date, int i4) {
        return Q(date, 1, i4);
    }

    public static Calendar Y(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    public static Calendar Z(Date date, TimeZone timeZone) {
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTime(date);
        return calendar;
    }

    private static Date a(Date date, int i4, int i5) {
        h0(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(i4, i5);
        return calendar.getTime();
    }

    public static Calendar a0(Calendar calendar, int i4) {
        if (calendar == null) {
            throw H();
        }
        Calendar calendar2 = (Calendar) calendar.clone();
        G(calendar2, i4, b.TRUNCATE);
        return calendar2;
    }

    public static Date b(Date date, int i4) {
        return a(date, 5, i4);
    }

    public static Date b0(Object obj, int i4) {
        if (obj == null) {
            throw H();
        }
        if (obj instanceof Date) {
            return c0((Date) obj, i4);
        }
        if (obj instanceof Calendar) {
            return a0((Calendar) obj, i4).getTime();
        }
        throw new ClassCastException(androidx.databinding.a.a("Could not truncate ", obj));
    }

    public static Date c(Date date, int i4) {
        return a(date, 11, i4);
    }

    public static Date c0(Date date, int i4) {
        h0(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        G(calendar, i4, b.TRUNCATE);
        return calendar.getTime();
    }

    public static Date d(Date date, int i4) {
        return a(date, 14, i4);
    }

    public static int d0(Calendar calendar, Calendar calendar2, int i4) {
        return a0(calendar, i4).compareTo(a0(calendar2, i4));
    }

    public static Date e(Date date, int i4) {
        return a(date, 12, i4);
    }

    public static int e0(Date date, Date date2, int i4) {
        return c0(date, i4).compareTo(c0(date2, i4));
    }

    public static Date f(Date date, int i4) {
        return a(date, 2, i4);
    }

    public static boolean f0(Calendar calendar, Calendar calendar2, int i4) {
        return d0(calendar, calendar2, i4) == 0;
    }

    public static Date g(Date date, int i4) {
        return a(date, 13, i4);
    }

    public static boolean g0(Date date, Date date2, int i4) {
        return e0(date, date2, i4) == 0;
    }

    public static Date h(Date date, int i4) {
        return a(date, 3, i4);
    }

    private static void h0(Date date) {
        k1.b0(date, "The date must not be null", new Object[0]);
    }

    public static Date i(Date date, int i4) {
        return a(date, 1, i4);
    }

    public static Calendar j(Calendar calendar, int i4) {
        if (calendar == null) {
            throw H();
        }
        Calendar calendar2 = (Calendar) calendar.clone();
        G(calendar2, i4, b.CEILING);
        return calendar2;
    }

    public static Date k(Object obj, int i4) {
        if (obj == null) {
            throw H();
        }
        if (obj instanceof Date) {
            return l((Date) obj, i4);
        }
        if (obj instanceof Calendar) {
            return j((Calendar) obj, i4).getTime();
        }
        throw new ClassCastException("Could not find ceiling of for type: " + obj.getClass());
    }

    public static Date l(Date date, int i4) {
        h0(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        G(calendar, i4, b.CEILING);
        return calendar.getTime();
    }

    private static long m(Calendar calendar, int i4, TimeUnit timeUnit) {
        if (calendar == null) {
            throw H();
        }
        TimeUnit timeUnit2 = TimeUnit.DAYS;
        int i5 = timeUnit == timeUnit2 ? 0 : 1;
        long convert = i4 != 1 ? i4 != 2 ? 0L : timeUnit.convert(calendar.get(5) - i5, timeUnit2) : timeUnit.convert(calendar.get(6) - i5, timeUnit2);
        if (i4 == 1 || i4 == 2 || i4 == 5 || i4 == 6) {
            convert += timeUnit.convert(calendar.get(11), TimeUnit.HOURS);
        } else {
            switch (i4) {
                case 11:
                    break;
                case 12:
                    convert += timeUnit.convert(calendar.get(13), TimeUnit.SECONDS);
                case 13:
                    return convert + timeUnit.convert(calendar.get(14), TimeUnit.MILLISECONDS);
                case 14:
                    return convert;
                default:
                    throw new IllegalArgumentException(r2.a("The fragment ", i4, " is not supported"));
            }
        }
        convert += timeUnit.convert(calendar.get(12), TimeUnit.MINUTES);
        convert += timeUnit.convert(calendar.get(13), TimeUnit.SECONDS);
        return convert + timeUnit.convert(calendar.get(14), TimeUnit.MILLISECONDS);
    }

    private static long n(Date date, int i4, TimeUnit timeUnit) {
        h0(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return m(calendar, i4, timeUnit);
    }

    public static long o(Calendar calendar, int i4) {
        return m(calendar, i4, TimeUnit.DAYS);
    }

    public static long p(Date date, int i4) {
        return n(date, i4, TimeUnit.DAYS);
    }

    public static long q(Calendar calendar, int i4) {
        return m(calendar, i4, TimeUnit.HOURS);
    }

    public static long r(Date date, int i4) {
        return n(date, i4, TimeUnit.HOURS);
    }

    public static long s(Calendar calendar, int i4) {
        return m(calendar, i4, TimeUnit.MILLISECONDS);
    }

    public static long t(Date date, int i4) {
        return n(date, i4, TimeUnit.MILLISECONDS);
    }

    public static long u(Calendar calendar, int i4) {
        return m(calendar, i4, TimeUnit.MINUTES);
    }

    public static long v(Date date, int i4) {
        return n(date, i4, TimeUnit.MINUTES);
    }

    public static long w(Calendar calendar, int i4) {
        return m(calendar, i4, TimeUnit.SECONDS);
    }

    public static long x(Date date, int i4) {
        return n(date, i4, TimeUnit.SECONDS);
    }

    public static boolean y(Calendar calendar, Calendar calendar2) {
        if (calendar == null || calendar2 == null) {
            throw H();
        }
        return calendar.get(0) == calendar2.get(0) && calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }

    public static boolean z(Date date, Date date2) {
        if (date == null || date2 == null) {
            throw H();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        return y(calendar, calendar2);
    }
}
