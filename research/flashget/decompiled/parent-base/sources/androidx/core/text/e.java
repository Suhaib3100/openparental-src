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
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f26714a = "ICUCompat";

    /* renamed from: b, reason: collision with root package name */
    private static Method f26715b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f26716c;

    /* compiled from: ICUCompat.java */
    @x0(21)
    static class a {
        private a() {
        }

        static String a(Locale locale) {
            return locale.getScript();
        }
    }

    /* compiled from: ICUCompat.java */
    @x0(24)
    static class b {
        private b() {
        }

        static ULocale a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        static ULocale b(Locale locale) {
            return ULocale.forLocale(locale);
        }

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
            Method method = f26716c;
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
            Method method = f26715b;
            if (method != null) {
                return (String) method.invoke(null, str);
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return null;
    }

    @q0
    public static String c(@o0 Locale locale) {
        return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
    }
}
