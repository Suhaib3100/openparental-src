package org.apache.commons.lang3.time;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: DateFormatUtils.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final TimeZone f86224a = j.a();

    /* renamed from: b, reason: collision with root package name */
    public static final g f86225b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final g f86226c;

    /* renamed from: d, reason: collision with root package name */
    public static final g f86227d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final g f86228e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f86229f;

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final g f86230g;

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final g f86231h;

    /* renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final g f86232i;

    /* renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final g f86233j;

    /* renamed from: k, reason: collision with root package name */
    public static final g f86234k;

    /* renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final g f86235l;

    /* renamed from: m, reason: collision with root package name */
    public static final g f86236m;

    /* renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final g f86237n;

    /* renamed from: o, reason: collision with root package name */
    public static final g f86238o;

    static {
        g C = g.C("yyyy-MM-dd'T'HH:mm:ss");
        f86225b = C;
        f86226c = C;
        g C2 = g.C("yyyy-MM-dd'T'HH:mm:ssZZ");
        f86227d = C2;
        f86228e = C2;
        g C3 = g.C("yyyy-MM-dd");
        f86229f = C3;
        f86230g = C3;
        f86231h = g.C("yyyy-MM-ddZZ");
        f86232i = g.C("'T'HH:mm:ss");
        f86233j = g.C("'T'HH:mm:ssZZ");
        g C4 = g.C("HH:mm:ss");
        f86234k = C4;
        f86235l = C4;
        g C5 = g.C("HH:mm:ssZZ");
        f86236m = C5;
        f86237n = C5;
        f86238o = g.D("EEE, dd MMM yyyy HH:mm:ss Z", Locale.US);
    }

    public static String a(long j4, String str) {
        return l(new Date(j4), str, null, null);
    }

    public static String b(long j4, String str, Locale locale) {
        return l(new Date(j4), str, null, locale);
    }

    public static String c(long j4, String str, TimeZone timeZone) {
        return l(new Date(j4), str, timeZone, null);
    }

    public static String d(long j4, String str, TimeZone timeZone, Locale locale) {
        return l(new Date(j4), str, timeZone, locale);
    }

    public static String e(Calendar calendar, String str) {
        return h(calendar, str, null, null);
    }

    public static String f(Calendar calendar, String str, Locale locale) {
        return h(calendar, str, null, locale);
    }

    public static String g(Calendar calendar, String str, TimeZone timeZone) {
        return h(calendar, str, timeZone, null);
    }

    public static String h(Calendar calendar, String str, TimeZone timeZone, Locale locale) {
        return g.F(str, timeZone, locale).q(calendar);
    }

    public static String i(Date date, String str) {
        return l(date, str, null, null);
    }

    public static String j(Date date, String str, Locale locale) {
        return l(date, str, null, locale);
    }

    public static String k(Date date, String str, TimeZone timeZone) {
        return l(date, str, timeZone, null);
    }

    public static String l(Date date, String str, TimeZone timeZone, Locale locale) {
        return g.F(str, timeZone, locale).k(date);
    }

    public static String m(long j4, String str) {
        return l(new Date(j4), str, f86224a, null);
    }

    public static String n(long j4, String str, Locale locale) {
        return l(new Date(j4), str, f86224a, locale);
    }

    public static String o(Date date, String str) {
        return l(date, str, f86224a, null);
    }

    public static String p(Date date, String str, Locale locale) {
        return l(date, str, f86224a, locale);
    }
}
