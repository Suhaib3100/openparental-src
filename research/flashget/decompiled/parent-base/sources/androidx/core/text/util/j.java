package androidx.core.text.util;

import android.icu.number.NumberFormatter;
import android.icu.number.UnlocalizedNumberFormatter;
import android.icu.text.DateFormat;
import android.icu.text.DateTimePatternGenerator;
import android.icu.util.Calendar;
import android.icu.util.MeasureUnit;
import android.os.Build;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.x0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: LocalePreferences.java */
@x0(21)
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final String f26781a = "j";

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f26782b = {"BS", "BZ", "KY", "PR", "PW", "US"};

    /* compiled from: LocalePreferences.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26783a;

        static {
            DateFormat.HourCycle[] values;
            DateFormat.HourCycle hourCycle;
            int ordinal;
            DateFormat.HourCycle hourCycle2;
            int ordinal2;
            DateFormat.HourCycle hourCycle3;
            int ordinal3;
            DateFormat.HourCycle hourCycle4;
            int ordinal4;
            values = DateFormat.HourCycle.values();
            int[] iArr = new int[values.length];
            f26783a = iArr;
            try {
                hourCycle4 = DateFormat.HourCycle.HOUR_CYCLE_11;
                ordinal4 = hourCycle4.ordinal();
                iArr[ordinal4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f26783a;
                hourCycle3 = DateFormat.HourCycle.HOUR_CYCLE_12;
                ordinal3 = hourCycle3.ordinal();
                iArr2[ordinal3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = f26783a;
                hourCycle2 = DateFormat.HourCycle.HOUR_CYCLE_23;
                ordinal2 = hourCycle2.ordinal();
                iArr3[ordinal2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = f26783a;
                hourCycle = DateFormat.HourCycle.HOUR_CYCLE_24;
                ordinal = hourCycle.ordinal();
                iArr4[ordinal] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: LocalePreferences.java */
    @x0(24)
    private static class b {
        private b() {
        }

        static String a(@o0 Locale locale) {
            return Calendar.getInstance(locale).getType();
        }

        static Locale b() {
            return Locale.getDefault(Locale.Category.FORMAT);
        }
    }

    /* compiled from: LocalePreferences.java */
    @x0(33)
    private static class c {
        private c() {
        }

        static String a(@o0 Locale locale) {
            return b(DateTimePatternGenerator.getInstance(locale).getDefaultHourCycle());
        }

        private static String b(DateFormat.HourCycle hourCycle) {
            int i4 = a.f26783a[hourCycle.ordinal()];
            return i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? "" : "h24" : "h23" : "h12" : "h11";
        }

        static String c(@o0 Locale locale) {
            String identifier = ((UnlocalizedNumberFormatter) ((UnlocalizedNumberFormatter) NumberFormatter.with().usage("weather")).unit(MeasureUnit.CELSIUS)).locale(locale).format(1L).getOutputUnit().getIdentifier();
            return identifier.startsWith("fahrenhe") ? "fahrenhe" : identifier;
        }
    }

    /* compiled from: LocalePreferences.java */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private static final String f26784a = "ca";

        /* renamed from: b, reason: collision with root package name */
        public static final String f26785b = "chinese";

        /* renamed from: c, reason: collision with root package name */
        public static final String f26786c = "dangi";

        /* renamed from: d, reason: collision with root package name */
        public static final String f26787d = "gregorian";

        /* renamed from: e, reason: collision with root package name */
        public static final String f26788e = "hebrew";

        /* renamed from: f, reason: collision with root package name */
        public static final String f26789f = "indian";

        /* renamed from: g, reason: collision with root package name */
        public static final String f26790g = "islamic";

        /* renamed from: h, reason: collision with root package name */
        public static final String f26791h = "islamic-civil";

        /* renamed from: i, reason: collision with root package name */
        public static final String f26792i = "islamic-rgsa";

        /* renamed from: j, reason: collision with root package name */
        public static final String f26793j = "islamic-tbla";

        /* renamed from: k, reason: collision with root package name */
        public static final String f26794k = "islamic-umalqura";

        /* renamed from: l, reason: collision with root package name */
        public static final String f26795l = "persian";

        /* renamed from: m, reason: collision with root package name */
        public static final String f26796m = "";

        /* compiled from: LocalePreferences.java */
        @c1({c1.a.LIBRARY})
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        private d() {
        }
    }

    /* compiled from: LocalePreferences.java */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        private static final String f26797a = "fw";

        /* renamed from: b, reason: collision with root package name */
        public static final String f26798b = "sun";

        /* renamed from: c, reason: collision with root package name */
        public static final String f26799c = "mon";

        /* renamed from: d, reason: collision with root package name */
        public static final String f26800d = "tue";

        /* renamed from: e, reason: collision with root package name */
        public static final String f26801e = "wed";

        /* renamed from: f, reason: collision with root package name */
        public static final String f26802f = "thu";

        /* renamed from: g, reason: collision with root package name */
        public static final String f26803g = "fri";

        /* renamed from: h, reason: collision with root package name */
        public static final String f26804h = "sat";

        /* renamed from: i, reason: collision with root package name */
        public static final String f26805i = "";

        /* compiled from: LocalePreferences.java */
        @c1({c1.a.LIBRARY})
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        private e() {
        }
    }

    /* compiled from: LocalePreferences.java */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        private static final String f26806a = "hc";

        /* renamed from: b, reason: collision with root package name */
        public static final String f26807b = "h11";

        /* renamed from: c, reason: collision with root package name */
        public static final String f26808c = "h12";

        /* renamed from: d, reason: collision with root package name */
        public static final String f26809d = "h23";

        /* renamed from: e, reason: collision with root package name */
        public static final String f26810e = "h24";

        /* renamed from: f, reason: collision with root package name */
        public static final String f26811f = "";

        /* compiled from: LocalePreferences.java */
        @c1({c1.a.LIBRARY})
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        private f() {
        }
    }

    /* compiled from: LocalePreferences.java */
    public static class g {

        /* renamed from: a, reason: collision with root package name */
        private static final String f26812a = "mu";

        /* renamed from: b, reason: collision with root package name */
        public static final String f26813b = "celsius";

        /* renamed from: c, reason: collision with root package name */
        public static final String f26814c = "fahrenhe";

        /* renamed from: d, reason: collision with root package name */
        public static final String f26815d = "kelvin";

        /* renamed from: e, reason: collision with root package name */
        public static final String f26816e = "";

        /* compiled from: LocalePreferences.java */
        @c1({c1.a.LIBRARY})
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        private g() {
        }
    }

    private j() {
    }

    private static String a(@o0 Locale locale) {
        return p(java.util.Calendar.getInstance(locale).getFirstDayOfWeek());
    }

    private static String b(@o0 Locale locale) {
        return android.text.format.DateFormat.getBestDateTimePattern(locale, "jm").contains("H") ? "h23" : "h12";
    }

    @o0
    public static String c() {
        return f(true);
    }

    @o0
    public static String d(@o0 Locale locale) {
        return e(locale, true);
    }

    @o0
    public static String e(@o0 Locale locale, boolean z4) {
        String v4 = v("ca", "", locale, z4);
        return v4 != null ? v4 : b.a(locale);
    }

    @o0
    public static String f(boolean z4) {
        return e(Locale.getDefault(Locale.Category.FORMAT), z4);
    }

    private static Locale g() {
        return Locale.getDefault();
    }

    @o0
    public static String h() {
        return k(true);
    }

    @o0
    public static String i(@o0 Locale locale) {
        return j(locale, true);
    }

    @o0
    public static String j(@o0 Locale locale, boolean z4) {
        String v4 = v("fw", "", locale, z4);
        return v4 != null ? v4 : a(locale);
    }

    @o0
    public static String k(boolean z4) {
        return j(Locale.getDefault(Locale.Category.FORMAT), z4);
    }

    @o0
    public static String l() {
        return o(true);
    }

    @o0
    public static String m(@o0 Locale locale) {
        return n(locale, true);
    }

    @o0
    public static String n(@o0 Locale locale, boolean z4) {
        String v4 = v("hc", "", locale, z4);
        return v4 != null ? v4 : Build.VERSION.SDK_INT >= 33 ? c.a(locale) : b(locale);
    }

    @o0
    public static String o(boolean z4) {
        return n(Locale.getDefault(Locale.Category.FORMAT), z4);
    }

    private static String p(int i4) {
        return (i4 < 1 || i4 > 7) ? "" : new String[]{"sun", "mon", "tue", "wed", "thu", "fri", "sat"}[i4 - 1];
    }

    private static String q(Locale locale) {
        return Arrays.binarySearch(f26782b, locale.getCountry()) >= 0 ? "fahrenhe" : "celsius";
    }

    @o0
    public static String r() {
        return u(true);
    }

    @o0
    public static String s(@o0 Locale locale) {
        return t(locale, true);
    }

    @o0
    public static String t(@o0 Locale locale, boolean z4) {
        String v4 = v("mu", "", locale, z4);
        return v4 != null ? v4 : Build.VERSION.SDK_INT >= 33 ? c.c(locale) : q(locale);
    }

    @o0
    public static String u(boolean z4) {
        return t(Locale.getDefault(Locale.Category.FORMAT), z4);
    }

    private static String v(String str, String str2, Locale locale, boolean z4) {
        String unicodeLocaleType = locale.getUnicodeLocaleType(str);
        if (unicodeLocaleType != null) {
            return unicodeLocaleType;
        }
        if (z4) {
            return null;
        }
        return str2;
    }
}
