package androidx.core.app;

import android.app.LocaleManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.m1;
import java.util.Locale;

/* compiled from: LocaleManagerCompat.java */
/* loaded from: classes3.dex */
public final class v {

    /* compiled from: LocaleManagerCompat.java */
    @androidx.annotation.x0(21)
    static class a {
        private a() {
        }

        static String a(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* compiled from: LocaleManagerCompat.java */
    @androidx.annotation.x0(24)
    static class b {
        private b() {
        }

        static androidx.core.os.p a(Configuration configuration) {
            return androidx.core.os.p.c(configuration.getLocales().toLanguageTags());
        }
    }

    /* compiled from: LocaleManagerCompat.java */
    @androidx.annotation.x0(33)
    static class c {
        private c() {
        }

        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        static LocaleList b(Object obj) {
            return ((LocaleManager) obj).getSystemLocales();
        }
    }

    private v() {
    }

    @androidx.annotation.d
    @androidx.annotation.o0
    public static androidx.core.os.p a(@androidx.annotation.o0 Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            return androidx.core.os.p.c(j.b(context));
        }
        Object systemService = context.getSystemService("locale");
        return systemService != null ? androidx.core.os.p.o(c.a(systemService)) : androidx.core.os.p.g();
    }

    @m1
    static androidx.core.os.p b(Configuration configuration) {
        return b.a(configuration);
    }

    @androidx.annotation.x0(33)
    private static Object c(Context context) {
        return context.getSystemService("locale");
    }

    @androidx.annotation.d
    @androidx.annotation.o0
    public static androidx.core.os.p d(@androidx.annotation.o0 Context context) {
        androidx.core.os.p g4 = androidx.core.os.p.g();
        if (Build.VERSION.SDK_INT < 33) {
            return b.a(Resources.getSystem().getConfiguration());
        }
        Object systemService = context.getSystemService("locale");
        return systemService != null ? androidx.core.os.p.o(c.b(systemService)) : g4;
    }
}
