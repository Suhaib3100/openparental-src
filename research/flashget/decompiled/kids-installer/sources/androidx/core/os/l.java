package androidx.core.os;

import android.os.LocaleList;
import androidx.annotation.e1;
import androidx.annotation.g0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import java.util.Locale;

/* compiled from: LocaleListCompat.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    private static final l f4978b = a(new Locale[0]);

    /* renamed from: a, reason: collision with root package name */
    private final n f4979a;

    /* compiled from: LocaleListCompat.java */
    @x0(21)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* compiled from: LocaleListCompat.java */
    @x0(24)
    static class b {
        private b() {
        }

        @androidx.annotation.u
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        @androidx.annotation.u
        static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        @androidx.annotation.u
        static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    private l(n nVar) {
        this.f4979a = nVar;
    }

    @o0
    public static l a(@o0 Locale... localeArr) {
        return n(b.a(localeArr));
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
        throw new IllegalArgumentException(androidx.constraintlayout.solver.widgets.analyzer.e.a("Can not parse language tag: [", str, "]"));
    }

    @o0
    public static l c(@q0 String str) {
        if (str == null || str.isEmpty()) {
            return f4978b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i5 = 0; i5 < length; i5++) {
            localeArr[i5] = a.a(split[i5]);
        }
        return a(localeArr);
    }

    @e1(min = 1)
    @o0
    public static l e() {
        return n(b.b());
    }

    @e1(min = 1)
    @o0
    public static l f() {
        return n(b.c());
    }

    @o0
    public static l g() {
        return f4978b;
    }

    @o0
    @x0(24)
    public static l n(@o0 LocaleList localeList) {
        return new l(new o(localeList));
    }

    @x0(24)
    @Deprecated
    public static l o(Object obj) {
        return n((LocaleList) obj);
    }

    @q0
    public Locale d(int i5) {
        return this.f4979a.get(i5);
    }

    public boolean equals(Object obj) {
        return (obj instanceof l) && this.f4979a.equals(((l) obj).f4979a);
    }

    @q0
    public Locale h(@o0 String[] strArr) {
        return this.f4979a.d(strArr);
    }

    public int hashCode() {
        return this.f4979a.hashCode();
    }

    @g0(from = -1)
    public int i(@q0 Locale locale) {
        return this.f4979a.a(locale);
    }

    public boolean j() {
        return this.f4979a.isEmpty();
    }

    @g0(from = 0)
    public int k() {
        return this.f4979a.size();
    }

    @o0
    public String l() {
        return this.f4979a.b();
    }

    @q0
    public Object m() {
        return this.f4979a.c();
    }

    @o0
    public String toString() {
        return this.f4979a.toString();
    }
}
