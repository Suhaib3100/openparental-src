package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import s8.a;

/* compiled from: UtcDates.java */
/* loaded from: classes6.dex */
class q {

    /* renamed from: a, reason: collision with root package name */
    static final String f53220a = ProtectedSandApp.s("\uf1b3");

    /* renamed from: b, reason: collision with root package name */
    static AtomicReference<p> f53221b = new AtomicReference<>();

    private q() {
    }

    static void A(@q0 p pVar) {
        f53221b.set(pVar);
    }

    static long a(long j4) {
        Calendar w4 = w(null);
        w4.setTimeInMillis(j4);
        return f(w4).getTimeInMillis();
    }

    private static int b(@o0 String str, @o0 String str2, int i4, int i5) {
        while (i5 >= 0 && i5 < str.length() && str2.indexOf(str.charAt(i5)) == -1) {
            if (str.charAt(i5) == '\'') {
                do {
                    i5 += i4;
                    if (i5 >= 0 && i5 < str.length()) {
                    }
                } while (str.charAt(i5) != '\'');
            }
            i5 += i4;
        }
        return i5;
    }

    @TargetApi(24)
    static DateFormat c(Locale locale) {
        return e(ProtectedSandApp.s("\uf1b4"), locale);
    }

    @TargetApi(24)
    static DateFormat d(Locale locale) {
        return e(ProtectedSandApp.s("\uf1b5"), locale);
    }

    @TargetApi(24)
    private static DateFormat e(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone(ProtectedSandApp.s("\uf1b3")));
        return instanceForSkeleton;
    }

    static Calendar f(Calendar calendar) {
        Calendar w4 = w(calendar);
        Calendar w5 = w(null);
        w5.set(w4.get(1), w4.get(2), w4.get(5));
        return w5;
    }

    private static java.text.DateFormat g(int i4, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i4, locale);
        dateInstance.setTimeZone(java.util.TimeZone.getTimeZone(ProtectedSandApp.s("\uf1b3")));
        return dateInstance;
    }

    static java.text.DateFormat h() {
        return g(0, Locale.getDefault());
    }

    static java.text.DateFormat i(Locale locale) {
        return g(0, locale);
    }

    static java.text.DateFormat j() {
        return g(2, Locale.getDefault());
    }

    static java.text.DateFormat k(Locale locale) {
        return g(2, locale);
    }

    static java.text.DateFormat l() {
        return m(Locale.getDefault());
    }

    static java.text.DateFormat m(Locale locale) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) g(2, locale);
        simpleDateFormat.applyPattern(z(simpleDateFormat.toPattern()));
        return simpleDateFormat;
    }

    static SimpleDateFormat n(String str) {
        return o(str, Locale.getDefault());
    }

    private static SimpleDateFormat o(String str, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone(ProtectedSandApp.s("\uf1b3")));
        return simpleDateFormat;
    }

    static SimpleDateFormat p() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toLocalizedPattern().replaceAll(ProtectedSandApp.s("\uf1b6"), ""), Locale.getDefault());
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone(ProtectedSandApp.s("\uf1b3")));
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    static String q(Resources resources, SimpleDateFormat simpleDateFormat) {
        String localizedPattern = simpleDateFormat.toLocalizedPattern();
        return localizedPattern.replaceAll(ProtectedSandApp.s("\uf1b7"), resources.getString(a.m.M0)).replaceAll(ProtectedSandApp.s("\uf1b8"), resources.getString(a.m.N0)).replaceAll(ProtectedSandApp.s("\uf1b9"), resources.getString(a.m.O0));
    }

    static p r() {
        p pVar = f53221b.get();
        return pVar == null ? p.e() : pVar;
    }

    private static java.util.TimeZone s() {
        return java.util.TimeZone.getTimeZone(ProtectedSandApp.s("\uf1b3"));
    }

    static Calendar t() {
        Calendar c5 = r().c();
        c5.set(11, 0);
        c5.set(12, 0);
        c5.set(13, 0);
        c5.set(14, 0);
        c5.setTimeZone(java.util.TimeZone.getTimeZone(ProtectedSandApp.s("\uf1b3")));
        return c5;
    }

    @TargetApi(24)
    private static TimeZone u() {
        return TimeZone.getTimeZone(ProtectedSandApp.s("\uf1b3"));
    }

    static Calendar v() {
        return w(null);
    }

    static Calendar w(@q0 Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(java.util.TimeZone.getTimeZone(ProtectedSandApp.s("\uf1b3")));
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    @TargetApi(24)
    static DateFormat x(Locale locale) {
        return e(ProtectedSandApp.s("\uf1ba"), locale);
    }

    @TargetApi(24)
    static DateFormat y(Locale locale) {
        return e(ProtectedSandApp.s("\uf1bb"), locale);
    }

    @o0
    private static String z(@o0 String str) {
        int b5 = b(str, ProtectedSandApp.s("\uf1bc"), 1, 0);
        if (b5 >= str.length()) {
            return str;
        }
        String s4 = ProtectedSandApp.s("\uf1bd");
        int b6 = b(str, s4, 1, b5);
        if (b6 < str.length()) {
            s4 = ProtectedSandApp.s("\uf1be");
        }
        return str.replace(str.substring(b(str, s4, -1, b5) + 1, b6), ProtectedSandApp.s("\uf1bf")).trim();
    }
}
