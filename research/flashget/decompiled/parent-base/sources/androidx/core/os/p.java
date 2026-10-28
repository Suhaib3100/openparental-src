package androidx.core.os;

import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.e1;
import androidx.annotation.x0;
import java.util.Locale;

/* compiled from: LocaleListCompat.java */
/* loaded from: classes3.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    private static final p f26537b = a(new Locale[0]);

    /* renamed from: a, reason: collision with root package name */
    private final r f26538a;

    /* compiled from: LocaleListCompat.java */
    @x0(21)
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final Locale[] f26539a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        private a() {
        }

        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        private static boolean b(Locale locale) {
            for (Locale locale2 : f26539a) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        static boolean c(@androidx.annotation.o0 Locale locale, @androidx.annotation.o0 Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || b(locale) || b(locale2)) {
                return false;
            }
            String c5 = androidx.core.text.e.c(locale);
            if (!c5.isEmpty()) {
                return c5.equals(androidx.core.text.e.c(locale2));
            }
            String country = locale.getCountry();
            return country.isEmpty() || country.equals(locale2.getCountry());
        }
    }

    /* compiled from: LocaleListCompat.java */
    @x0(24)
    static class b {
        private b() {
        }

        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    private p(r rVar) {
        this.f26538a = rVar;
    }

    @androidx.annotation.o0
    public static p a(@androidx.annotation.o0 Locale... localeArr) {
        return o(new LocaleList(localeArr));
    }

    static Locale b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else {
            if (!str.contains("_")) {
                return new Locale(str);
            }
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException(android.support.v4.media.d.a("Can not parse language tag: [", str, "]"));
    }

    @androidx.annotation.o0
    public static p c(@androidx.annotation.q0 String str) {
        if (str == null || str.isEmpty()) {
            return f26537b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i4 = 0; i4 < length; i4++) {
            localeArr[i4] = a.a(split[i4]);
        }
        return a(localeArr);
    }

    @e1(min = 1)
    @androidx.annotation.o0
    public static p e() {
        return o(LocaleList.getAdjustedDefault());
    }

    @e1(min = 1)
    @androidx.annotation.o0
    public static p f() {
        return o(LocaleList.getDefault());
    }

    @androidx.annotation.o0
    public static p g() {
        return f26537b;
    }

    @x0(21)
    public static boolean k(@androidx.annotation.o0 Locale locale, @androidx.annotation.o0 Locale locale2) {
        boolean matchesLanguageAndScript;
        if (Build.VERSION.SDK_INT < 33) {
            return a.c(locale, locale2);
        }
        matchesLanguageAndScript = LocaleList.matchesLanguageAndScript(locale, locale2);
        return matchesLanguageAndScript;
    }

    @androidx.annotation.o0
    @x0(24)
    public static p o(@androidx.annotation.o0 LocaleList localeList) {
        return new p(new s(localeList));
    }

    @x0(24)
    @Deprecated
    public static p p(Object obj) {
        return o((LocaleList) obj);
    }

    @androidx.annotation.q0
    public Locale d(int i4) {
        return this.f26538a.get(i4);
    }

    public boolean equals(Object obj) {
        return (obj instanceof p) && this.f26538a.equals(((p) obj).f26538a);
    }

    @androidx.annotation.q0
    public Locale h(@androidx.annotation.o0 String[] strArr) {
        return this.f26538a.d(strArr);
    }

    public int hashCode() {
        return this.f26538a.hashCode();
    }

    @androidx.annotation.g0(from = -1)
    public int i(@androidx.annotation.q0 Locale locale) {
        return this.f26538a.a(locale);
    }

    public boolean j() {
        return this.f26538a.isEmpty();
    }

    @androidx.annotation.g0(from = 0)
    public int l() {
        return this.f26538a.size();
    }

    @androidx.annotation.o0
    public String m() {
        return this.f26538a.b();
    }

    @androidx.annotation.q0
    public Object n() {
        return this.f26538a.c();
    }

    @androidx.annotation.o0
    public String toString() {
        return this.f26538a.toString();
    }
}
