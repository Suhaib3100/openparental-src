package org.ocpsoft.prettytime.i18n;

import android.support.v4.media.b;
import java.util.ListResourceBundle;
import java.util.ResourceBundle;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.ocpsoft.prettytime.Duration;
import org.ocpsoft.prettytime.TimeFormat;
import org.ocpsoft.prettytime.TimeUnit;
import org.ocpsoft.prettytime.impl.c;
import org.ocpsoft.prettytime.units.Decade;
import org.ocpsoft.prettytime.units.Millennium;

/* loaded from: classes9.dex */
public class Resources_ja extends ListResourceBundle implements c {

    /* renamed from: b, reason: collision with root package name */
    private static final Object[][] f87860b = {new Object[]{"CenturyPattern", "%n%u"}, new Object[]{"CenturyFuturePrefix", "今から"}, new Object[]{"CenturyFutureSuffix", "後"}, new Object[]{"CenturyPastPrefix", ""}, new Object[]{"CenturyPastSuffix", "前"}, new Object[]{"CenturySingularName", "世紀"}, new Object[]{"CenturyPluralName", "世紀"}, new Object[]{"DayPattern", "%n%u"}, new Object[]{"DayFuturePrefix", "今から"}, new Object[]{"DayFutureSuffix", "後"}, new Object[]{"DayPastPrefix", ""}, new Object[]{"DayPastSuffix", "前"}, new Object[]{"DaySingularName", "日"}, new Object[]{"DayPluralName", "日"}, new Object[]{"DecadePattern", "%n%u"}, new Object[]{"DecadeFuturePrefix", "今から"}, new Object[]{"DecadeFutureSuffix", "後"}, new Object[]{"DecadePastPrefix", ""}, new Object[]{"DecadePastSuffix", "前"}, new Object[]{"DecadeSingularName", "年"}, new Object[]{"DecadePluralName", "年"}, new Object[]{"HourPattern", "%n%u"}, new Object[]{"HourFuturePrefix", "今から"}, new Object[]{"HourFutureSuffix", "後"}, new Object[]{"HourPastPrefix", ""}, new Object[]{"HourPastSuffix", "前"}, new Object[]{"HourSingularName", "時間"}, new Object[]{"HourPluralName", "時間"}, new Object[]{"JustNowPattern", "%u"}, new Object[]{"JustNowFuturePrefix", "今から"}, new Object[]{"JustNowFutureSuffix", "すぐ"}, new Object[]{"JustNowPastPrefix", ""}, new Object[]{"JustNowPastSuffix", "たった今"}, new Object[]{"JustNowSingularName", ""}, new Object[]{"JustNowPluralName", ""}, new Object[]{"MillenniumPattern", "%n%u"}, new Object[]{"MillenniumFuturePrefix", "今から"}, new Object[]{"MillenniumFutureSuffix", "後"}, new Object[]{"MillenniumPastPrefix", ""}, new Object[]{"MillenniumPastSuffix", "前"}, new Object[]{"MillenniumSingularName", "年"}, new Object[]{"MillenniumPluralName", "年"}, new Object[]{"MillisecondPattern", "%n%u"}, new Object[]{"MillisecondFuturePrefix", "今から"}, new Object[]{"MillisecondFutureSuffix", "後"}, new Object[]{"MillisecondPastPrefix", ""}, new Object[]{"MillisecondPastSuffix", "前"}, new Object[]{"MillisecondSingularName", "ミリ秒"}, new Object[]{"MillisecondPluralName", "ミリ秒"}, new Object[]{"MinutePattern", "%n%u"}, new Object[]{"MinuteFuturePrefix", "今から"}, new Object[]{"MinuteFutureSuffix", "後"}, new Object[]{"MinutePastPrefix", ""}, new Object[]{"MinutePastSuffix", "前"}, new Object[]{"MinuteSingularName", "分"}, new Object[]{"MinutePluralName", "分"}, new Object[]{"MonthPattern", "%n%u"}, new Object[]{"MonthFuturePrefix", "今から"}, new Object[]{"MonthFutureSuffix", "後"}, new Object[]{"MonthPastPrefix", ""}, new Object[]{"MonthPastSuffix", "前"}, new Object[]{"MonthSingularName", "ヶ月"}, new Object[]{"MonthPluralName", "ヶ月"}, new Object[]{"SecondPattern", "%n%u"}, new Object[]{"SecondFuturePrefix", "今から"}, new Object[]{"SecondFutureSuffix", "後"}, new Object[]{"SecondPastPrefix", ""}, new Object[]{"SecondPastSuffix", "前"}, new Object[]{"SecondSingularName", "秒"}, new Object[]{"SecondPluralName", "秒"}, new Object[]{"WeekPattern", "%n%u"}, new Object[]{"WeekFuturePrefix", "今から"}, new Object[]{"WeekFutureSuffix", "後"}, new Object[]{"WeekPastPrefix", ""}, new Object[]{"WeekPastSuffix", "前"}, new Object[]{"WeekSingularName", "週間"}, new Object[]{"WeekPluralName", "週間"}, new Object[]{"YearPattern", "%n%u"}, new Object[]{"YearFuturePrefix", "今から"}, new Object[]{"YearFutureSuffix", "後"}, new Object[]{"YearPastPrefix", ""}, new Object[]{"YearPastSuffix", "前"}, new Object[]{"YearSingularName", "年"}, new Object[]{"YearPluralName", "年"}, new Object[]{"AbstractTimeUnitPattern", ""}, new Object[]{"AbstractTimeUnitFuturePrefix", ""}, new Object[]{"AbstractTimeUnitFutureSuffix", ""}, new Object[]{"AbstractTimeUnitPastPrefix", ""}, new Object[]{"AbstractTimeUnitPastSuffix", ""}, new Object[]{"AbstractTimeUnitSingularName", ""}, new Object[]{"AbstractTimeUnitPluralName", ""}};

    /* renamed from: a, reason: collision with root package name */
    private volatile ConcurrentMap<TimeUnit, TimeFormat> f87861a = new ConcurrentHashMap();

    private static class JaTimeFormat implements TimeFormat {

        /* renamed from: a, reason: collision with root package name */
        private final ResourceBundle f87866a;

        /* renamed from: b, reason: collision with root package name */
        private String f87867b = "";

        /* renamed from: c, reason: collision with root package name */
        private String f87868c = "";

        /* renamed from: d, reason: collision with root package name */
        private String f87869d = "";

        /* renamed from: e, reason: collision with root package name */
        private String f87870e = "";

        /* renamed from: f, reason: collision with root package name */
        private String f87871f = "";

        /* renamed from: g, reason: collision with root package name */
        private String f87872g = "";

        /* renamed from: h, reason: collision with root package name */
        private String f87873h = "";

        /* renamed from: i, reason: collision with root package name */
        private String f87874i = "";

        /* renamed from: j, reason: collision with root package name */
        private String f87875j = "";

        /* renamed from: k, reason: collision with root package name */
        private String f87876k = "";

        /* renamed from: l, reason: collision with root package name */
        private String f87877l = "";

        /* renamed from: m, reason: collision with root package name */
        private int f87878m = 50;

        /* renamed from: p, reason: collision with root package name */
        public static final String f87864p = "%n";

        /* renamed from: q, reason: collision with root package name */
        public static final String f87865q = "%u";

        /* renamed from: n, reason: collision with root package name */
        private static final String f87862n = "-";

        /* renamed from: o, reason: collision with root package name */
        public static final String f87863o = "%s";

        public JaTimeFormat(ResourceBundle resourceBundle, TimeUnit timeUnit) {
            this.f87866a = resourceBundle;
            w(resourceBundle.getString(n(timeUnit) + "Pattern"));
            p(resourceBundle.getString(n(timeUnit) + "FuturePrefix"));
            r(resourceBundle.getString(n(timeUnit) + "FutureSuffix"));
            t(resourceBundle.getString(n(timeUnit) + "PastPrefix"));
            v(resourceBundle.getString(n(timeUnit) + "PastSuffix"));
            z(resourceBundle.getString(n(timeUnit) + "SingularName"));
            x(resourceBundle.getString(n(timeUnit) + "PluralName"));
            try {
                o(resourceBundle.getString(n(timeUnit) + "FuturePluralName"));
            } catch (Exception unused) {
            }
            try {
                q(resourceBundle.getString(n(timeUnit) + "FutureSingularName"));
            } catch (Exception unused2) {
            }
            try {
                s(resourceBundle.getString(n(timeUnit) + "PastPluralName"));
            } catch (Exception unused3) {
            }
            try {
                u(resourceBundle.getString(n(timeUnit) + "PastSingularName"));
            } catch (Exception unused4) {
            }
        }

        private String e(String str, String str2, long j4) {
            return i(j4).replaceAll("%s", str).replaceAll("%n", String.valueOf(j4)).replaceAll("%u", str2);
        }

        private String f(Duration duration, boolean z4) {
            String l4 = l(duration);
            String g4 = g(duration, z4);
            long k4 = k(duration, z4);
            if (duration.a() instanceof Decade) {
                k4 *= 10;
            }
            if (duration.a() instanceof Millennium) {
                k4 *= 1000;
            }
            return e(l4, g4, k4);
        }

        private String j(Duration duration) {
            return (!duration.b() || this.f87870e == null || this.f87869d.length() <= 0) ? (!duration.e() || this.f87872g == null || this.f87871f.length() <= 0) ? this.f87868c : this.f87872g : this.f87870e;
        }

        private String l(Duration duration) {
            return duration.f() < 0 ? "-" : "";
        }

        private String m(Duration duration) {
            String str;
            String str2;
            return (!duration.b() || (str2 = this.f87869d) == null || str2.length() <= 0) ? (!duration.e() || (str = this.f87871f) == null || str.length() <= 0) ? this.f87867b : this.f87871f : this.f87869d;
        }

        private String n(TimeUnit timeUnit) {
            return timeUnit.getClass().getSimpleName();
        }

        @Override // org.ocpsoft.prettytime.TimeFormat
        public String a(Duration duration, String str) {
            StringBuilder sb = new StringBuilder();
            if (duration.e()) {
                sb.append(this.f87876k);
                sb.append(str);
                sb.append(this.f87877l);
            } else {
                sb.append(this.f87874i);
                sb.append(str);
                sb.append(this.f87875j);
            }
            return sb.toString().replaceAll("\\s+", " ").trim();
        }

        @Override // org.ocpsoft.prettytime.TimeFormat
        public String b(Duration duration) {
            return f(duration, true);
        }

        @Override // org.ocpsoft.prettytime.TimeFormat
        public String c(Duration duration, String str) {
            return a(duration, str);
        }

        @Override // org.ocpsoft.prettytime.TimeFormat
        public String d(Duration duration) {
            return f(duration, false);
        }

        protected String g(Duration duration, boolean z4) {
            return (Math.abs(k(duration, z4)) == 0 || Math.abs(k(duration, z4)) > 1) ? j(duration) : m(duration);
        }

        public String h() {
            return this.f87873h;
        }

        protected String i(long j4) {
            return this.f87873h;
        }

        protected long k(Duration duration, boolean z4) {
            return Math.abs(z4 ? duration.d(this.f87878m) : duration.f());
        }

        public JaTimeFormat o(String str) {
            this.f87870e = str;
            return this;
        }

        public JaTimeFormat p(String str) {
            this.f87874i = str.trim();
            return this;
        }

        public JaTimeFormat q(String str) {
            this.f87869d = str;
            return this;
        }

        public JaTimeFormat r(String str) {
            this.f87875j = str.trim();
            return this;
        }

        public JaTimeFormat s(String str) {
            this.f87872g = str;
            return this;
        }

        public JaTimeFormat t(String str) {
            this.f87876k = str.trim();
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("JaTimeFormat [pattern=");
            sb.append(this.f87873h);
            sb.append(", futurePrefix=");
            sb.append(this.f87874i);
            sb.append(", futureSuffix=");
            sb.append(this.f87875j);
            sb.append(", pastPrefix=");
            sb.append(this.f87876k);
            sb.append(", pastSuffix=");
            sb.append(this.f87877l);
            sb.append(", roundingTolerance=");
            return b.a(sb, this.f87878m, "]");
        }

        public JaTimeFormat u(String str) {
            this.f87871f = str;
            return this;
        }

        public JaTimeFormat v(String str) {
            this.f87877l = str.trim();
            return this;
        }

        public JaTimeFormat w(String str) {
            this.f87873h = str;
            return this;
        }

        public JaTimeFormat x(String str) {
            this.f87868c = str;
            return this;
        }

        public JaTimeFormat y(int i4) {
            this.f87878m = i4;
            return this;
        }

        public JaTimeFormat z(String str) {
            this.f87867b = str;
            return this;
        }
    }

    @Override // org.ocpsoft.prettytime.impl.c
    public TimeFormat a(TimeUnit timeUnit) {
        if (!this.f87861a.containsKey(timeUnit)) {
            this.f87861a.putIfAbsent(timeUnit, new JaTimeFormat(this, timeUnit));
        }
        return this.f87861a.get(timeUnit);
    }

    @Override // java.util.ListResourceBundle
    public Object[][] getContents() {
        return f87860b;
    }
}
