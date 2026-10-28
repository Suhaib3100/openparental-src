package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.icu.text.DateFormat;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import n1.a;

/* compiled from: UtcDates.java */
/* loaded from: classes2.dex */
class q {

    /* renamed from: a, reason: collision with root package name */
    static final String f13441a = ProtectedSandApp.s("ም");

    /* renamed from: b, reason: collision with root package name */
    static AtomicReference<p> f13442b = new AtomicReference<>();

    private q() {
    }

    static void A(@q0 p pVar) {
        f13442b.set(pVar);
    }

    static long a(long j5) {
        Calendar w5 = w(null);
        w5.setTimeInMillis(j5);
        return f(w5).getTimeInMillis();
    }

    private static int b(@o0 String str, @o0 String str2, int i5, int i6) {
        while (i6 >= 0 && i6 < str.length() && str2.indexOf(str.charAt(i6)) == -1) {
            if (str.charAt(i6) == '\'') {
                do {
                    i6 += i5;
                    if (i6 >= 0 && i6 < str.length()) {
                    }
                } while (str.charAt(i6) != '\'');
            }
            i6 += i5;
        }
        return i6;
    }

    @TargetApi(24)
    static DateFormat c(Locale locale) {
        return e(ProtectedSandApp.s("ሞ"), locale);
    }

    @TargetApi(24)
    static DateFormat d(Locale locale) {
        return e(ProtectedSandApp.s("ሟ"), locale);
    }

    @TargetApi(24)
    private static DateFormat e(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(u());
        return instanceForSkeleton;
    }

    static Calendar f(Calendar calendar) {
        Calendar w5 = w(calendar);
        Calendar w6 = w(null);
        w6.set(w5.get(1), w5.get(2), w5.get(5));
        return w6;
    }

    private static java.text.DateFormat g(int i5, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i5, locale);
        dateInstance.setTimeZone(s());
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
        simpleDateFormat.setTimeZone(s());
        return simpleDateFormat;
    }

    static SimpleDateFormat p() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toLocalizedPattern().replaceAll(ProtectedSandApp.s("ሠ"), ""), Locale.getDefault());
        simpleDateFormat.setTimeZone(s());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    static String q(Resources resources, SimpleDateFormat simpleDateFormat) {
        String localizedPattern = simpleDateFormat.toLocalizedPattern();
        return localizedPattern.replaceAll(ProtectedSandApp.s("ሡ"), resources.getString(a.m.M0)).replaceAll(ProtectedSandApp.s("ሢ"), resources.getString(a.m.N0)).replaceAll(ProtectedSandApp.s("ሣ"), resources.getString(a.m.O0));
    }

    static p r() {
        p pVar = f13442b.get();
        return pVar == null ? p.e() : pVar;
    }

    private static TimeZone s() {
        return TimeZone.getTimeZone(ProtectedSandApp.s("ሤ"));
    }

    static Calendar t() {
        Calendar c6 = r().c();
        c6.set(11, 0);
        c6.set(12, 0);
        c6.set(13, 0);
        c6.set(14, 0);
        c6.setTimeZone(s());
        return c6;
    }

    @TargetApi(24)
    private static android.icu.util.TimeZone u() {
        return android.icu.util.TimeZone.getTimeZone(ProtectedSandApp.s("ሥ"));
    }

    static Calendar v() {
        return w(null);
    }

    static Calendar w(@q0 Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(s());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    @TargetApi(24)
    static DateFormat x(Locale locale) {
        return e(ProtectedSandApp.s("ሦ"), locale);
    }

    @TargetApi(24)
    static DateFormat y(Locale locale) {
        return e(ProtectedSandApp.s("ሧ"), locale);
    }

    @o0
    private static String z(@o0 String str) {
        int b6 = b(str, ProtectedSandApp.s("ረ"), 1, 0);
        if (b6 >= str.length()) {
            return str;
        }
        String s5 = ProtectedSandApp.s("ሩ");
        int b7 = b(str, s5, 1, b6);
        if (b7 < str.length()) {
            s5 = ProtectedSandApp.s("ሪ");
        }
        return str.replace(str.substring(b(str, s5, -1, b6) + 1, b7), ProtectedSandApp.s("ራ")).trim();
    }
}
