package androidx.core.text;

import android.annotation.SuppressLint;
import android.icu.util.ULocale;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* compiled from: ICUCompat.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5161a = "ICUCompat";

    /* renamed from: b, reason: collision with root package name */
    private static Method f5162b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f5163c;

    /* compiled from: ICUCompat.java */
    @x0(21)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static String a(Locale locale) {
            return locale.getScript();
        }
    }

    /* compiled from: ICUCompat.java */
    @x0(24)
    static class b {
        private b() {
        }

        @androidx.annotation.u
        static ULocale a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        @androidx.annotation.u
        static ULocale b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        @androidx.annotation.u
        static String c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    private e() {
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static String a(Locale locale) {
        String locale2 = locale.toString();
        try {
            Method method = f5163c;
            if (method != null) {
                return (String) method.invoke(null, locale2);
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return locale2;
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static String b(String str) {
        try {
            Method method = f5162b;
            if (method != null) {
                return (String) method.invoke(null, str);
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return null;
    }

    @q0
    public static String c(@o0 Locale locale) {
        return b.c(b.a(b.b(locale)));
    }
}
