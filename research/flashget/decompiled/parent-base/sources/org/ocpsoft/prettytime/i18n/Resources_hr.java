package org.ocpsoft.prettytime.i18n;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListResourceBundle;
import java.util.ResourceBundle;
import org.ocpsoft.prettytime.Duration;
import org.ocpsoft.prettytime.TimeFormat;
import org.ocpsoft.prettytime.TimeUnit;
import org.ocpsoft.prettytime.format.a;
import org.ocpsoft.prettytime.impl.c;
import org.ocpsoft.prettytime.units.Day;
import org.ocpsoft.prettytime.units.Hour;
import org.ocpsoft.prettytime.units.Millennium;
import org.ocpsoft.prettytime.units.Minute;
import org.ocpsoft.prettytime.units.Month;
import org.ocpsoft.prettytime.units.Week;
import org.ocpsoft.prettytime.units.Year;

/* loaded from: classes9.dex */
public class Resources_hr extends ListResourceBundle implements c {

    /* renamed from: a, reason: collision with root package name */
    private static final Object[][] f87848a = {new Object[]{"CenturyPattern", "%n %u"}, new Object[]{"CenturyFuturePrefix", "za "}, new Object[]{"CenturyFutureSuffix", ""}, new Object[]{"CenturyPastPrefix", ""}, new Object[]{"CenturyPastSuffix", " unatrag"}, new Object[]{"CenturySingularName", "stoljeće"}, new Object[]{"CenturyPluralName", "stoljeća"}, new Object[]{"DayPattern", "%n %u"}, new Object[]{"DayFuturePrefix", "za "}, new Object[]{"DayFutureSuffix", ""}, new Object[]{"DayPastPrefix", "prije "}, new Object[]{"DayPastSuffix", ""}, new Object[]{"DaySingularName", "dan"}, new Object[]{"DayPluralName", "dana"}, new Object[]{"DecadePattern", "%n %u"}, new Object[]{"DecadeFuturePrefix", "za "}, new Object[]{"DecadeFutureSuffix", ""}, new Object[]{"DecadePastPrefix", "prije "}, new Object[]{"DecadePastSuffix", ""}, new Object[]{"DecadeSingularName", "desetljeće"}, new Object[]{"DecadePluralName", "desetljeća"}, new Object[]{"HourPattern", "%n %u"}, new Object[]{"HourFuturePrefix", "za "}, new Object[]{"HourFutureSuffix", ""}, new Object[]{"HourPastPrefix", "prije "}, new Object[]{"HourPastSuffix", ""}, new Object[]{"HourSingularName", "sat"}, new Object[]{"HourPluralName", "sati"}, new Object[]{"JustNowPattern", "%u"}, new Object[]{"JustNowFuturePrefix", "za nekoliko trenutaka"}, new Object[]{"JustNowFutureSuffix", ""}, new Object[]{"JustNowPastPrefix", "prije nekoliko trenutaka"}, new Object[]{"JustNowPastSuffix", ""}, new Object[]{"JustNowSingularName", ""}, new Object[]{"JustNowPluralName", ""}, new Object[]{"MillenniumPattern", "%n %u"}, new Object[]{"MillenniumFuturePrefix", "za "}, new Object[]{"MillenniumFutureSuffix", ""}, new Object[]{"MillenniumPastPrefix", "prije "}, new Object[]{"MillenniumPastSuffix", ""}, new Object[]{"MillenniumSingularName", "tisućljeće"}, new Object[]{"MillenniumPluralName", "tisućljeća"}, new Object[]{"MillisecondPattern", "%n %u"}, new Object[]{"MillisecondFuturePrefix", "za "}, new Object[]{"MillisecondFutureSuffix", ""}, new Object[]{"MillisecondPastPrefix", "prije "}, new Object[]{"MillisecondPastSuffix", ""}, new Object[]{"MillisecondSingularName", "milisekunda"}, new Object[]{"MillisecondPluralName", "milisekunda"}, new Object[]{"MinutePattern", "%n %u"}, new Object[]{"MinuteFuturePrefix", "za "}, new Object[]{"MinuteFutureSuffix", ""}, new Object[]{"MinutePastPrefix", "prije "}, new Object[]{"MinutePastSuffix", ""}, new Object[]{"MinuteSingularName", "minuta"}, new Object[]{"MinutePluralName", "minuta"}, new Object[]{"MonthPattern", "%n %u"}, new Object[]{"MonthFuturePrefix", "za "}, new Object[]{"MonthFutureSuffix", ""}, new Object[]{"MonthPastPrefix", "prije "}, new Object[]{"MonthPastSuffix", ""}, new Object[]{"MonthSingularName", "mjesec"}, new Object[]{"MonthPluralName", "mjeseca"}, new Object[]{"SecondPattern", "%n %u"}, new Object[]{"SecondFuturePrefix", "za "}, new Object[]{"SecondFutureSuffix", ""}, new Object[]{"SecondPastPrefix", "prije "}, new Object[]{"SecondPastSuffix", ""}, new Object[]{"SecondSingularName", "sekunda"}, new Object[]{"SecondPluralName", "sekundi"}, new Object[]{"WeekPattern", "%n %u"}, new Object[]{"WeekFuturePrefix", "za "}, new Object[]{"WeekFutureSuffix", ""}, new Object[]{"WeekPastPrefix", "prije "}, new Object[]{"WeekPastSuffix", ""}, new Object[]{"WeekSingularName", "tjedan"}, new Object[]{"WeekPluralName", "tjedna"}, new Object[]{"YearPattern", "%n %u"}, new Object[]{"YearFuturePrefix", "za "}, new Object[]{"YearFutureSuffix", ""}, new Object[]{"YearPastPrefix", "prije "}, new Object[]{"YearPastSuffix", ""}, new Object[]{"YearSingularName", "godina"}, new Object[]{"YearPluralName", "godina"}, new Object[]{"AbstractTimeUnitPattern", ""}, new Object[]{"AbstractTimeUnitFuturePrefix", ""}, new Object[]{"AbstractTimeUnitFutureSuffix", ""}, new Object[]{"AbstractTimeUnitPastPrefix", ""}, new Object[]{"AbstractTimeUnitPastSuffix", ""}, new Object[]{"AbstractTimeUnitSingularName", ""}, new Object[]{"AbstractTimeUnitPluralName", ""}};

    private static class HrName implements Comparable<HrName> {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f87849b;

        /* renamed from: c, reason: collision with root package name */
        private final Long f87850c;

        /* renamed from: d, reason: collision with root package name */
        private final String f87851d;

        public HrName(boolean z4, String str, Long l4) {
            this.f87849b = z4;
            this.f87851d = str;
            this.f87850c = l4;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(HrName hrName) {
            return this.f87850c.compareTo(Long.valueOf(hrName.c()));
        }

        public String b() {
            return this.f87851d;
        }

        public long c() {
            return this.f87850c.longValue();
        }

        public boolean d() {
            return this.f87849b;
        }
    }

    private static class HrTimeFormat extends a implements TimeFormat {

        /* renamed from: r, reason: collision with root package name */
        private final List<HrName> f87852r = new ArrayList();

        /* renamed from: s, reason: collision with root package name */
        private final List<HrName> f87853s = new ArrayList();

        public HrTimeFormat(String str, ResourceBundle resourceBundle, Collection<HrName> collection) {
            v(resourceBundle.getString(str + "Pattern"));
            o(resourceBundle.getString(str + "FuturePrefix"));
            q(resourceBundle.getString(str + "FutureSuffix"));
            s(resourceBundle.getString(str + "PastPrefix"));
            u(resourceBundle.getString(str + "PastSuffix"));
            y(resourceBundle.getString(str + "SingularName"));
            w(resourceBundle.getString(str + "PluralName"));
            try {
                n(resourceBundle.getString(str + "FuturePluralName"));
            } catch (Exception unused) {
            }
            try {
                p(resourceBundle.getString(str + "FutureSingularName"));
            } catch (Exception unused2) {
            }
            try {
                r(resourceBundle.getString(str + "PastPluralName"));
            } catch (Exception unused3) {
            }
            try {
                t(resourceBundle.getString(str + "PastSingularName"));
            } catch (Exception unused4) {
            }
            for (HrName hrName : collection) {
                if (hrName.d()) {
                    this.f87852r.add(hrName);
                } else {
                    this.f87853s.add(hrName);
                }
            }
            Collections.sort(this.f87852r);
            Collections.sort(this.f87853s);
        }

        private String z(long j4, List<HrName> list) {
            for (HrName hrName : list) {
                if (hrName.c() >= j4) {
                    return hrName.b();
                }
            }
            throw new IllegalStateException("Invalid resource bundle configuration");
        }

        @Override // org.ocpsoft.prettytime.format.a
        protected String g(Duration duration, boolean z4) {
            long abs = Math.abs(k(duration, z4));
            return duration.b() ? z(abs, this.f87852r) : z(abs, this.f87853s);
        }
    }

    private static class HrTimeFormatBuilder {

        /* renamed from: a, reason: collision with root package name */
        private final List<HrName> f87854a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final String f87855b;

        HrTimeFormatBuilder(String str) {
            this.f87855b = str;
        }

        private HrTimeFormatBuilder a(boolean z4, String str, long j4) {
            if (str == null) {
                throw new IllegalArgumentException();
            }
            this.f87854a.add(new HrName(z4, str, Long.valueOf(j4)));
            return this;
        }

        HrTimeFormatBuilder b(String str, long j4) {
            return a(true, str, j4).a(false, str, j4);
        }

        HrTimeFormat c(ResourceBundle resourceBundle) {
            return new HrTimeFormat(this.f87855b, resourceBundle, this.f87854a);
        }
    }

    @Override // org.ocpsoft.prettytime.impl.c
    public TimeFormat a(TimeUnit timeUnit) {
        if (timeUnit instanceof Minute) {
            return new HrTimeFormatBuilder("Minute").b("minutu", 1L).b("minute", 4L).b("minuta", Long.MAX_VALUE).c(this);
        }
        if (timeUnit instanceof Hour) {
            return new HrTimeFormatBuilder("Hour").b("sat", 1L).b("sata", 4L).b("sati", Long.MAX_VALUE).c(this);
        }
        if (timeUnit instanceof Day) {
            return new HrTimeFormatBuilder("Day").b("dan", 1L).b("dana", 4L).b("dana", Long.MAX_VALUE).c(this);
        }
        if (timeUnit instanceof Week) {
            return new HrTimeFormatBuilder("Week").b("tjedan", 1L).b("tjedna", 4L).b("tjedana", Long.MAX_VALUE).c(this);
        }
        if (timeUnit instanceof Month) {
            return new HrTimeFormatBuilder("Month").b("mjesec", 1L).b("mjeseca", 4L).b("mjeseci", Long.MAX_VALUE).c(this);
        }
        if (timeUnit instanceof Year) {
            return new HrTimeFormatBuilder("Year").b("godinu", 1L).b("godine", 4L).b("godina", Long.MAX_VALUE).c(this);
        }
        if (timeUnit instanceof Millennium) {
            return new HrTimeFormatBuilder("Millennium").b("tisućljeće", 1L).b("tisućljeća", Long.MAX_VALUE).c(this);
        }
        return null;
    }

    @Override // java.util.ListResourceBundle
    public Object[][] getContents() {
        return f87848a;
    }
}
