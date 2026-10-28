package org.apache.commons.lang3.time;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: FastDateFormat.java */
/* loaded from: classes6.dex */
public class g extends Format implements c, d {

    /* renamed from: d, reason: collision with root package name */
    private static final long f86263d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f86264e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f86265f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f86266g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f86267h = 3;

    /* renamed from: i, reason: collision with root package name */
    private static final k<g> f86268i = new a();

    /* renamed from: b, reason: collision with root package name */
    private final i f86269b;

    /* renamed from: c, reason: collision with root package name */
    private final h f86270c;

    /* compiled from: FastDateFormat.java */
    static class a extends k<g> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.apache.commons.lang3.time.k
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public g a(String str, TimeZone timeZone, Locale locale) {
            return new g(str, timeZone, locale, null);
        }
    }

    protected g(String str, TimeZone timeZone, Locale locale) {
        this(str, timeZone, locale, null);
    }

    public static g A(int i4, int i5, TimeZone timeZone, Locale locale) {
        return f86268i.c(i4, i5, timeZone, locale);
    }

    public static g B() {
        return f86268i.e();
    }

    public static g C(String str) {
        return f86268i.f(str, null, null);
    }

    public static g D(String str, Locale locale) {
        return f86268i.f(str, null, locale);
    }

    public static g E(String str, TimeZone timeZone) {
        return f86268i.f(str, timeZone, null);
    }

    public static g F(String str, TimeZone timeZone, Locale locale) {
        return f86268i.f(str, timeZone, locale);
    }

    public static g H(int i4) {
        return f86268i.h(i4, null, null);
    }

    public static g I(int i4, Locale locale) {
        return f86268i.h(i4, null, locale);
    }

    public static g J(int i4, TimeZone timeZone) {
        return f86268i.h(i4, timeZone, null);
    }

    public static g K(int i4, TimeZone timeZone, Locale locale) {
        return f86268i.h(i4, timeZone, locale);
    }

    public static g s(int i4) {
        return f86268i.b(i4, null, null);
    }

    public static g t(int i4, Locale locale) {
        return f86268i.b(i4, null, locale);
    }

    public static g u(int i4, TimeZone timeZone) {
        return f86268i.b(i4, timeZone, null);
    }

    public static g v(int i4, TimeZone timeZone, Locale locale) {
        return f86268i.b(i4, timeZone, locale);
    }

    public static g w(int i4, int i5) {
        return f86268i.c(i4, i5, null, null);
    }

    public static g y(int i4, int i5, Locale locale) {
        return f86268i.c(i4, i5, null, locale);
    }

    public static g z(int i4, int i5, TimeZone timeZone) {
        return A(i4, i5, timeZone, null);
    }

    public int G() {
        return this.f86269b.t();
    }

    @Override // org.apache.commons.lang3.time.c, org.apache.commons.lang3.time.d
    public String b() {
        return this.f86269b.b();
    }

    @Override // org.apache.commons.lang3.time.c, org.apache.commons.lang3.time.d
    public TimeZone c() {
        return this.f86269b.c();
    }

    @Override // org.apache.commons.lang3.time.d
    @Deprecated
    public StringBuffer d(long j4, StringBuffer stringBuffer) {
        return this.f86269b.d(j4, stringBuffer);
    }

    @Override // org.apache.commons.lang3.time.d
    @Deprecated
    public StringBuffer e(Date date, StringBuffer stringBuffer) {
        return this.f86269b.e(date, stringBuffer);
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f86269b.equals(((g) obj).f86269b);
        }
        return false;
    }

    @Override // org.apache.commons.lang3.time.c
    public boolean f(String str, ParsePosition parsePosition, Calendar calendar) {
        return this.f86270c.f(str, parsePosition, calendar);
    }

    @Override // java.text.Format, org.apache.commons.lang3.time.d
    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        stringBuffer.append(this.f86269b.s(obj));
        return stringBuffer;
    }

    @Override // org.apache.commons.lang3.time.d
    public <B extends Appendable> B g(Calendar calendar, B b5) {
        return (B) this.f86269b.g(calendar, b5);
    }

    @Override // org.apache.commons.lang3.time.c, org.apache.commons.lang3.time.d
    public Locale getLocale() {
        return this.f86269b.getLocale();
    }

    public int hashCode() {
        return this.f86269b.hashCode();
    }

    @Override // org.apache.commons.lang3.time.c
    public Date i(String str, ParsePosition parsePosition) {
        return this.f86270c.i(str, parsePosition);
    }

    @Override // org.apache.commons.lang3.time.d
    public String k(Date date) {
        return this.f86269b.k(date);
    }

    @Override // org.apache.commons.lang3.time.d
    @Deprecated
    public StringBuffer l(Calendar calendar, StringBuffer stringBuffer) {
        return this.f86269b.l(calendar, stringBuffer);
    }

    @Override // org.apache.commons.lang3.time.d
    public String m(long j4) {
        return this.f86269b.m(j4);
    }

    @Override // org.apache.commons.lang3.time.c
    public Date n(String str) throws ParseException {
        return this.f86270c.n(str);
    }

    @Override // org.apache.commons.lang3.time.d
    public <B extends Appendable> B o(long j4, B b5) {
        return (B) this.f86269b.o(j4, b5);
    }

    @Override // org.apache.commons.lang3.time.d
    public <B extends Appendable> B p(Date date, B b5) {
        return (B) this.f86269b.p(date, b5);
    }

    @Override // java.text.Format, org.apache.commons.lang3.time.c
    public Object parseObject(String str, ParsePosition parsePosition) {
        return this.f86270c.parseObject(str, parsePosition);
    }

    @Override // org.apache.commons.lang3.time.d
    public String q(Calendar calendar) {
        return this.f86269b.q(calendar);
    }

    @Deprecated
    protected StringBuffer r(Calendar calendar, StringBuffer stringBuffer) {
        return this.f86269b.n(calendar, stringBuffer);
    }

    public String toString() {
        return "FastDateFormat[" + this.f86269b.b() + "," + this.f86269b.getLocale() + "," + this.f86269b.c().getID() + "]";
    }

    protected g(String str, TimeZone timeZone, Locale locale, Date date) {
        this.f86269b = new i(str, timeZone, locale);
        this.f86270c = new h(str, timeZone, locale, date);
    }
}
