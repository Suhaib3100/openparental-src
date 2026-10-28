package org.apache.commons.lang3.time;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.apache.commons.lang3.k1;

/* compiled from: FormatCache.java */
/* loaded from: classes6.dex */
abstract class k<F extends Format> {

    /* renamed from: b, reason: collision with root package name */
    static final int f86360b = -1;

    /* renamed from: c, reason: collision with root package name */
    private static final ConcurrentMap<a, String> f86361c = new ConcurrentHashMap(7);

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentMap<a, F> f86362a = new ConcurrentHashMap(7);

    /* compiled from: FormatCache.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object[] f86363a;

        /* renamed from: b, reason: collision with root package name */
        private int f86364b;

        a(Object... objArr) {
            this.f86363a = objArr;
        }

        public boolean equals(Object obj) {
            return Arrays.equals(this.f86363a, ((a) obj).f86363a);
        }

        public int hashCode() {
            if (this.f86364b == 0) {
                int i4 = 0;
                for (Object obj : this.f86363a) {
                    if (obj != null) {
                        i4 = obj.hashCode() + (i4 * 7);
                    }
                }
                this.f86364b = i4;
            }
            return this.f86364b;
        }
    }

    k() {
    }

    private F d(Integer num, Integer num2, TimeZone timeZone, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return f(g(num, num2, locale), timeZone, locale);
    }

    static String g(Integer num, Integer num2, Locale locale) {
        a aVar = new a(num, num2, locale);
        ConcurrentMap<a, String> concurrentMap = f86361c;
        String str = concurrentMap.get(aVar);
        if (str != null) {
            return str;
        }
        try {
            String pattern = ((SimpleDateFormat) (num == null ? DateFormat.getTimeInstance(num2.intValue(), locale) : num2 == null ? DateFormat.getDateInstance(num.intValue(), locale) : DateFormat.getDateTimeInstance(num.intValue(), num2.intValue(), locale))).toPattern();
            String putIfAbsent = concurrentMap.putIfAbsent(aVar, pattern);
            return putIfAbsent != null ? putIfAbsent : pattern;
        } catch (ClassCastException unused) {
            throw new IllegalArgumentException("No date time pattern for locale: " + locale);
        }
    }

    protected abstract F a(String str, TimeZone timeZone, Locale locale);

    F b(int i4, TimeZone timeZone, Locale locale) {
        return d(Integer.valueOf(i4), null, timeZone, locale);
    }

    F c(int i4, int i5, TimeZone timeZone, Locale locale) {
        return d(Integer.valueOf(i4), Integer.valueOf(i5), timeZone, locale);
    }

    public F e() {
        return c(3, 3, TimeZone.getDefault(), Locale.getDefault());
    }

    public F f(String str, TimeZone timeZone, Locale locale) {
        k1.b0(str, "pattern must not be null", new Object[0]);
        if (timeZone == null) {
            timeZone = TimeZone.getDefault();
        }
        if (locale == null) {
            locale = Locale.getDefault();
        }
        a aVar = new a(str, timeZone, locale);
        F f4 = this.f86362a.get(aVar);
        if (f4 != null) {
            return f4;
        }
        F a5 = a(str, timeZone, locale);
        F putIfAbsent = this.f86362a.putIfAbsent(aVar, a5);
        return putIfAbsent != null ? putIfAbsent : a5;
    }

    F h(int i4, TimeZone timeZone, Locale locale) {
        return d(null, Integer.valueOf(i4), timeZone, locale);
    }
}
