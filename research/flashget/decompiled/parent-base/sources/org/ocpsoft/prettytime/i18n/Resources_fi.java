package org.ocpsoft.prettytime.i18n;

import java.util.ListResourceBundle;
import java.util.ResourceBundle;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.ocpsoft.prettytime.Duration;
import org.ocpsoft.prettytime.TimeFormat;
import org.ocpsoft.prettytime.TimeUnit;
import org.ocpsoft.prettytime.format.a;
import org.ocpsoft.prettytime.impl.c;
import org.ocpsoft.prettytime.units.Day;

/* loaded from: classes9.dex */
public class Resources_fi extends ListResourceBundle implements c {

    /* renamed from: b, reason: collision with root package name */
    private static final int f87835b = 50;

    /* renamed from: c, reason: collision with root package name */
    private static Object[][] f87836c = {new Object[]{"JustNowPattern", "%u"}, new Object[]{"JustNowPastSingularName", "hetki"}, new Object[]{"JustNowFutureSingularName", "hetken"}, new Object[]{"JustNowPastSuffix", "sitten"}, new Object[]{"JustNowFutureSuffix", "päästä"}, new Object[]{"MillisecondPattern", "%u"}, new Object[]{"MillisecondPluralPattern", "%n %u"}, new Object[]{"MillisecondPastSingularName", "millisekunti"}, new Object[]{"MillisecondPastPluralName", "millisekuntia"}, new Object[]{"MillisecondFutureSingularName", "millisekunnin"}, new Object[]{"MillisecondPastSuffix", "sitten"}, new Object[]{"MillisecondFutureSuffix", "päästä"}, new Object[]{"SecondPattern", "%u"}, new Object[]{"SecondPluralPattern", "%n %u"}, new Object[]{"SecondPastSingularName", "sekunti"}, new Object[]{"SecondPastPluralName", "sekuntia"}, new Object[]{"SecondFutureSingularName", "sekunnin"}, new Object[]{"SecondPastSuffix", "sitten"}, new Object[]{"SecondFutureSuffix", "päästä"}, new Object[]{"MinutePattern", "%u"}, new Object[]{"MinutePluralPattern", "%n %u"}, new Object[]{"MinutePastSingularName", "minuutti"}, new Object[]{"MinutePastPluralName", "minuuttia"}, new Object[]{"MinuteFutureSingularName", "minuutin"}, new Object[]{"MinutePastSuffix", "sitten"}, new Object[]{"MinuteFutureSuffix", "päästä"}, new Object[]{"HourPattern", "%u"}, new Object[]{"HourPluralPattern", "%n %u"}, new Object[]{"HourPastSingularName", "tunti"}, new Object[]{"HourPastPluralName", "tuntia"}, new Object[]{"HourFutureSingularName", "tunnin"}, new Object[]{"HourPastSuffix", "sitten"}, new Object[]{"HourFutureSuffix", "päästä"}, new Object[]{"DayPattern", "%u"}, new Object[]{"DayPluralPattern", "%n %u"}, new Object[]{"DayPastSingularName", "eilen"}, new Object[]{"DayPastPluralName", "päivää"}, new Object[]{"DayFutureSingularName", "huomenna"}, new Object[]{"DayFuturePluralName", "päivän"}, new Object[]{"DayPastSuffix", "sitten"}, new Object[]{"DayFutureSuffix", "päästä"}, new Object[]{"WeekPattern", "%u"}, new Object[]{"WeekPluralPattern", "%n %u"}, new Object[]{"WeekPastSingularName", "viikko"}, new Object[]{"WeekPastPluralName", "viikkoa"}, new Object[]{"WeekFutureSingularName", "viikon"}, new Object[]{"WeekFuturePluralName", "viikon"}, new Object[]{"WeekPastSuffix", "sitten"}, new Object[]{"WeekFutureSuffix", "päästä"}, new Object[]{"MonthPattern", "%u"}, new Object[]{"MonthPluralPattern", "%n %u"}, new Object[]{"MonthPastSingularName", "kuukausi"}, new Object[]{"MonthPastPluralName", "kuukautta"}, new Object[]{"MonthFutureSingularName", "kuukauden"}, new Object[]{"MonthPastSuffix", "sitten"}, new Object[]{"MonthFutureSuffix", "päästä"}, new Object[]{"YearPattern", "%u"}, new Object[]{"YearPluralPattern", "%n %u"}, new Object[]{"YearPastSingularName", "vuosi"}, new Object[]{"YearPastPluralName", "vuotta"}, new Object[]{"YearFutureSingularName", "vuoden"}, new Object[]{"YearPastSuffix", "sitten"}, new Object[]{"YearFutureSuffix", "päästä"}, new Object[]{"DecadePattern", "%u"}, new Object[]{"DecadePluralPattern", "%n %u"}, new Object[]{"DecadePastSingularName", "vuosikymmen"}, new Object[]{"DecadePastPluralName", "vuosikymmentä"}, new Object[]{"DecadeFutureSingularName", "vuosikymmenen"}, new Object[]{"DecadePastSuffix", "sitten"}, new Object[]{"DecadeFutureSuffix", "päästä"}, new Object[]{"CenturyPattern", "%u"}, new Object[]{"CenturyPluralPattern", "%n %u"}, new Object[]{"CenturyPastSingularName", "vuosisata"}, new Object[]{"CenturyPastPluralName", "vuosisataa"}, new Object[]{"CenturyFutureSingularName", "vuosisadan"}, new Object[]{"CenturyPastSuffix", "sitten"}, new Object[]{"CenturyFutureSuffix", "päästä"}, new Object[]{"MillenniumPattern", "%u"}, new Object[]{"MillenniumPluralPattern", "%n %u"}, new Object[]{"MillenniumPastSingularName", "vuosituhat"}, new Object[]{"MillenniumPastPluralName", "vuosituhatta"}, new Object[]{"MillenniumFutureSingularName", "vuosituhannen"}, new Object[]{"MillenniumPastSuffix", "sitten"}, new Object[]{"MillenniumFutureSuffix", "päästä"}};

    /* renamed from: a, reason: collision with root package name */
    private volatile ConcurrentMap<TimeUnit, TimeFormat> f87837a = new ConcurrentHashMap();

    private static class FiTimeFormat extends a {

        /* renamed from: r, reason: collision with root package name */
        private final ResourceBundle f87838r;

        /* renamed from: s, reason: collision with root package name */
        private String f87839s = "";

        /* renamed from: t, reason: collision with root package name */
        private String f87840t = "";

        /* renamed from: u, reason: collision with root package name */
        private String f87841u = "";

        /* renamed from: v, reason: collision with root package name */
        private String f87842v = "";

        /* renamed from: w, reason: collision with root package name */
        private String f87843w = "";

        public FiTimeFormat(ResourceBundle resourceBundle, TimeUnit timeUnit) {
            this.f87838r = resourceBundle;
            if (resourceBundle.containsKey(E(timeUnit) + "PastSingularName")) {
                H(resourceBundle.getString(E(timeUnit) + "PastSingularName")).F(resourceBundle.getString(E(timeUnit) + "FutureSingularName")).r(resourceBundle.getString(E(timeUnit) + "PastSingularName")).n(resourceBundle.getString(E(timeUnit) + "FutureSingularName")).J(resourceBundle.getString(E(timeUnit) + "Pattern"));
                if (resourceBundle.containsKey(E(timeUnit) + "PastPluralName")) {
                    r(resourceBundle.getString(E(timeUnit) + "PastPluralName"));
                }
                if (resourceBundle.containsKey(E(timeUnit) + "FuturePluralName")) {
                    n(resourceBundle.getString(E(timeUnit) + "FuturePluralName"));
                }
                if (resourceBundle.containsKey(E(timeUnit) + "PluralPattern")) {
                    J(resourceBundle.getString(E(timeUnit) + "PluralPattern"));
                }
                v(resourceBundle.getString(E(timeUnit) + "Pattern")).u(resourceBundle.getString(E(timeUnit) + "PastSuffix")).q(resourceBundle.getString(E(timeUnit) + "FutureSuffix")).o("").s("").y("").w("");
            }
        }

        private String E(TimeUnit timeUnit) {
            return timeUnit.getClass().getSimpleName();
        }

        public String A() {
            return this.f87842v;
        }

        public String B() {
            return this.f87839s;
        }

        public String C() {
            return this.f87841u;
        }

        public String D() {
            return this.f87843w;
        }

        public FiTimeFormat F(String str) {
            this.f87840t = str;
            return this;
        }

        @Override // org.ocpsoft.prettytime.format.a
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public FiTimeFormat n(String str) {
            this.f87842v = str;
            return this;
        }

        public FiTimeFormat H(String str) {
            this.f87839s = str;
            return this;
        }

        @Override // org.ocpsoft.prettytime.format.a
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public FiTimeFormat r(String str) {
            this.f87841u = str;
            return this;
        }

        public FiTimeFormat J(String str) {
            this.f87843w = str;
            return this;
        }

        @Override // org.ocpsoft.prettytime.format.a, org.ocpsoft.prettytime.TimeFormat
        public String a(Duration duration, String str) {
            return ((duration.a() instanceof Day) && Math.abs(duration.d(50)) == 1) ? str : super.a(duration, str);
        }

        @Override // org.ocpsoft.prettytime.format.a
        protected String g(Duration duration, boolean z4) {
            String B = duration.e() ? B() : z();
            if (Math.abs(k(duration, z4)) == 0 || Math.abs(k(duration, z4)) > 1) {
                return duration.e() ? C() : A();
            }
            return B;
        }

        @Override // org.ocpsoft.prettytime.format.a
        protected String i(long j4) {
            return Math.abs(j4) == 1 ? h() : D();
        }

        public String z() {
            return this.f87840t;
        }
    }

    @Override // org.ocpsoft.prettytime.impl.c
    public TimeFormat a(TimeUnit timeUnit) {
        if (!this.f87837a.containsKey(timeUnit)) {
            this.f87837a.putIfAbsent(timeUnit, new FiTimeFormat(this, timeUnit));
        }
        return this.f87837a.get(timeUnit);
    }

    @Override // java.util.ListResourceBundle
    protected Object[][] getContents() {
        return f87836c;
    }
}
