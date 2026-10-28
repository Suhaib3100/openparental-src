package com.google.zxing.client.result;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: CalendarParsedResult.java */
/* loaded from: classes6.dex */
public final class g extends q {

    /* renamed from: m, reason: collision with root package name */
    private static final Pattern f62682m = Pattern.compile(ProtectedSandApp.s("ণ\u0001"));

    /* renamed from: n, reason: collision with root package name */
    private static final long[] f62683n = {604800000, 86400000, org.apache.commons.lang3.time.e.f86241c, 60000, 1000};

    /* renamed from: o, reason: collision with root package name */
    private static final Pattern f62684o = Pattern.compile(ProtectedSandApp.s("ত\u0001"));

    /* renamed from: b, reason: collision with root package name */
    private final String f62685b;

    /* renamed from: c, reason: collision with root package name */
    private final long f62686c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f62687d;

    /* renamed from: e, reason: collision with root package name */
    private final long f62688e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f62689f;

    /* renamed from: g, reason: collision with root package name */
    private final String f62690g;

    /* renamed from: h, reason: collision with root package name */
    private final String f62691h;

    /* renamed from: i, reason: collision with root package name */
    private final String[] f62692i;

    /* renamed from: j, reason: collision with root package name */
    private final String f62693j;

    /* renamed from: k, reason: collision with root package name */
    private final double f62694k;

    /* renamed from: l, reason: collision with root package name */
    private final double f62695l;

    public g(String str, String str2, String str3, String str4, String str5, String str6, String[] strArr, String str7, double d5, double d6) {
        super(r.CALENDAR);
        this.f62685b = str;
        try {
            long s4 = s(str2);
            this.f62686c = s4;
            if (str3 == null) {
                long u4 = u(str4);
                this.f62688e = u4 < 0 ? -1L : s4 + u4;
            } else {
                try {
                    this.f62688e = s(str3);
                } catch (ParseException e4) {
                    throw new IllegalArgumentException(e4.toString());
                }
            }
            boolean z4 = false;
            this.f62687d = str2.length() == 8;
            if (str3 != null && str3.length() == 8) {
                z4 = true;
            }
            this.f62689f = z4;
            this.f62690g = str5;
            this.f62691h = str6;
            this.f62692i = strArr;
            this.f62693j = str7;
            this.f62694k = d5;
            this.f62695l = d6;
        } catch (ParseException e5) {
            throw new IllegalArgumentException(e5.toString());
        }
    }

    private static String e(boolean z4, long j4) {
        if (j4 < 0) {
            return null;
        }
        return (z4 ? DateFormat.getDateInstance(2) : DateFormat.getDateTimeInstance(2, 2)).format(Long.valueOf(j4));
    }

    private static long s(String str) throws ParseException {
        if (!f62684o.matcher(str).matches()) {
            throw new ParseException(str, 0);
        }
        if (str.length() == 8) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ProtectedSandApp.s("থ\u0001"), Locale.ENGLISH);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(ProtectedSandApp.s("দ\u0001")));
            return simpleDateFormat.parse(str).getTime();
        }
        if (str.length() != 16 || str.charAt(15) != 'Z') {
            return t(str);
        }
        long t4 = t(str.substring(0, 15));
        long j4 = t4 + r5.get(15);
        new GregorianCalendar().setTime(new Date(j4));
        return j4 + r5.get(16);
    }

    private static long t(String str) throws ParseException {
        return new SimpleDateFormat(ProtectedSandApp.s("ধ\u0001"), Locale.ENGLISH).parse(str).getTime();
    }

    private static long u(CharSequence charSequence) {
        if (charSequence == null) {
            return -1L;
        }
        Matcher matcher = f62682m.matcher(charSequence);
        if (!matcher.matches()) {
            return -1L;
        }
        long j4 = 0;
        int i4 = 0;
        while (true) {
            long[] jArr = f62683n;
            if (i4 >= jArr.length) {
                return j4;
            }
            int i5 = i4 + 1;
            if (matcher.group(i5) != null) {
                j4 = (jArr[i4] * Integer.parseInt(r5)) + j4;
            }
            i4 = i5;
        }
    }

    @Override // com.google.zxing.client.result.q
    public String a() {
        StringBuilder sb = new StringBuilder(100);
        q.c(this.f62685b, sb);
        q.c(e(this.f62687d, this.f62686c), sb);
        q.c(e(this.f62689f, this.f62688e), sb);
        q.c(this.f62690g, sb);
        q.c(this.f62691h, sb);
        q.d(this.f62692i, sb);
        q.c(this.f62693j, sb);
        return sb.toString();
    }

    public String[] f() {
        return this.f62692i;
    }

    public String g() {
        return this.f62693j;
    }

    @Deprecated
    public Date h() {
        if (this.f62688e < 0) {
            return null;
        }
        return new Date(this.f62688e);
    }

    public long i() {
        return this.f62688e;
    }

    public double j() {
        return this.f62694k;
    }

    public String k() {
        return this.f62690g;
    }

    public double l() {
        return this.f62695l;
    }

    public String m() {
        return this.f62691h;
    }

    @Deprecated
    public Date n() {
        return new Date(this.f62686c);
    }

    public long o() {
        return this.f62686c;
    }

    public String p() {
        return this.f62685b;
    }

    public boolean q() {
        return this.f62689f;
    }

    public boolean r() {
        return this.f62687d;
    }
}
