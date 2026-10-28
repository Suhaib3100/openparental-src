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
import org.ocpsoft.prettytime.units.Minute;
import org.ocpsoft.prettytime.units.Month;
import org.ocpsoft.prettytime.units.Week;
import org.ocpsoft.prettytime.units.Year;

/* loaded from: classes9.dex */
public class Resources_cs extends ListResourceBundle implements c {

    /* renamed from: a, reason: collision with root package name */
    private static final Object[][] f87819a = {new Object[]{"CenturyPattern", "%n %u"}, new Object[]{"CenturyFuturePrefix", "za "}, new Object[]{"CenturyFutureSuffix", ""}, new Object[]{"CenturyPastPrefix", "před "}, new Object[]{"CenturyPastSuffix", ""}, new Object[]{"CenturySingularName", "století"}, new Object[]{"CenturyPluralName", "století"}, new Object[]{"CenturyPastSingularName", "stoletím"}, new Object[]{"CenturyPastPluralName", "stoletími"}, new Object[]{"CenturyFutureSingularName", "století"}, new Object[]{"CenturyFuturePluralName", "století"}, new Object[]{"DayPattern", "%n %u"}, new Object[]{"DayFuturePrefix", "za "}, new Object[]{"DayFutureSuffix", ""}, new Object[]{"DayPastPrefix", "před "}, new Object[]{"DayPastSuffix", ""}, new Object[]{"DaySingularName", "den"}, new Object[]{"DayPluralName", "dny"}, new Object[]{"DecadePattern", "%n %u"}, new Object[]{"DecadeFuturePrefix", "za "}, new Object[]{"DecadeFutureSuffix", ""}, new Object[]{"DecadePastPrefix", "před "}, new Object[]{"DecadePastSuffix", ""}, new Object[]{"DecadeSingularName", "desetiletí"}, new Object[]{"DecadePluralName", "desetiletí"}, new Object[]{"DecadePastSingularName", "desetiletím"}, new Object[]{"DecadePastPluralName", "desetiletími"}, new Object[]{"DecadeFutureSingularName", "desetiletí"}, new Object[]{"DecadeFuturePluralName", "desetiletí"}, new Object[]{"HourPattern", "%n %u"}, new Object[]{"HourFuturePrefix", "za "}, new Object[]{"HourFutureSuffix", ""}, new Object[]{"HourPastPrefix", "před"}, new Object[]{"HourPastSuffix", ""}, new Object[]{"HourSingularName", "hodina"}, new Object[]{"HourPluralName", "hodiny"}, new Object[]{"JustNowPattern", "%u"}, new Object[]{"JustNowFuturePrefix", ""}, new Object[]{"JustNowFutureSuffix", "za chvíli"}, new Object[]{"JustNowPastPrefix", "před chvílí"}, new Object[]{"JustNowPastSuffix", ""}, new Object[]{"JustNowSingularName", ""}, new Object[]{"JustNowPluralName", ""}, new Object[]{"MillenniumPattern", "%n %u"}, new Object[]{"MillenniumFuturePrefix", "za "}, new Object[]{"MillenniumFutureSuffix", ""}, new Object[]{"MillenniumPastPrefix", "před "}, new Object[]{"MillenniumPastSuffix", ""}, new Object[]{"MillenniumSingularName", "tisíciletí"}, new Object[]{"MillenniumPluralName", "tisíciletí"}, new Object[]{"MillisecondPattern", "%n %u"}, new Object[]{"MillisecondFuturePrefix", "za "}, new Object[]{"MillisecondFutureSuffix", ""}, new Object[]{"MillisecondPastPrefix", "před "}, new Object[]{"MillisecondPastSuffix", ""}, new Object[]{"MillisecondSingularName", "milisekunda"}, new Object[]{"MillisecondPluralName", "milisekundy"}, new Object[]{"MillisecondPastSingularName", "milisekundou"}, new Object[]{"MillisecondPastPluralName", "milisekundami"}, new Object[]{"MillisecondFutureSingularName", "milisekundu"}, new Object[]{"MillisecondFuturePluralName", "milisekund"}, new Object[]{"MinutePattern", "%n %u"}, new Object[]{"MinuteFuturePrefix", "za "}, new Object[]{"MinuteFutureSuffix", ""}, new Object[]{"MinutePastPrefix", "před "}, new Object[]{"MinutePastSuffix", ""}, new Object[]{"MinuteSingularName", "minuta"}, new Object[]{"MinutePluralName", "minuty"}, new Object[]{"MonthPattern", "%n %u"}, new Object[]{"MonthFuturePrefix", "za "}, new Object[]{"MonthFutureSuffix", ""}, new Object[]{"MonthPastPrefix", "před "}, new Object[]{"MonthPastSuffix", ""}, new Object[]{"MonthSingularName", "měsíc"}, new Object[]{"MonthPluralName", "měsíce"}, new Object[]{"SecondPattern", "%n %u"}, new Object[]{"SecondFuturePrefix", "za "}, new Object[]{"SecondFutureSuffix", ""}, new Object[]{"SecondPastPrefix", "před "}, new Object[]{"SecondPastSuffix", ""}, new Object[]{"SecondSingularName", "sekunda"}, new Object[]{"SecondPluralName", "sekundy"}, new Object[]{"WeekPattern", "%n %u"}, new Object[]{"WeekFuturePrefix", "za "}, new Object[]{"WeekFutureSuffix", ""}, new Object[]{"WeekPastPrefix", "před "}, new Object[]{"WeekPastSuffix", ""}, new Object[]{"WeekSingularName", "týden"}, new Object[]{"WeekPluralName", "týdny"}, new Object[]{"YearPattern", "%n %u"}, new Object[]{"YearFuturePrefix", "za "}, new Object[]{"YearFutureSuffix", ""}, new Object[]{"YearPastPrefix", "před "}, new Object[]{"YearPastSuffix", ""}, new Object[]{"YearSingularName", "rok"}, new Object[]{"YearPluralName", "roky"}, new Object[]{"AbstractTimeUnitPattern", ""}, new Object[]{"AbstractTimeUnitFuturePrefix", ""}, new Object[]{"AbstractTimeUnitFutureSuffix", ""}, new Object[]{"AbstractTimeUnitPastPrefix", ""}, new Object[]{"AbstractTimeUnitPastSuffix", ""}, new Object[]{"AbstractTimeUnitSingularName", ""}, new Object[]{"AbstractTimeUnitPluralName", ""}};

    private static class CsName implements Comparable<CsName> {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f87820b;

        /* renamed from: c, reason: collision with root package name */
        private final String f87821c;

        /* renamed from: d, reason: collision with root package name */
        private final Long f87822d;

        public CsName(boolean z4, String str, Long l4) {
            this.f87820b = z4;
            this.f87821c = str;
            this.f87822d = l4;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(CsName csName) {
            return this.f87822d.compareTo(Long.valueOf(csName.c()));
        }

        public String b() {
            return this.f87821c;
        }

        public long c() {
            return this.f87822d.longValue();
        }

        public boolean d() {
            return this.f87820b;
        }
    }

    private static class CsTimeFormat extends a implements TimeFormat {

        /* renamed from: r, reason: collision with root package name */
        private final List<CsName> f87823r = new ArrayList();

        /* renamed from: s, reason: collision with root package name */
        private final List<CsName> f87824s = new ArrayList();

        public CsTimeFormat(String str, ResourceBundle resourceBundle, Collection<CsName> collection) {
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
            for (CsName csName : collection) {
                if (csName.d()) {
                    this.f87823r.add(csName);
                } else {
                    this.f87824s.add(csName);
                }
            }
            Collections.sort(this.f87823r);
            Collections.sort(this.f87824s);
        }

        private String z(long j4, List<CsName> list) {
            for (CsName csName : list) {
                if (csName.c() >= j4) {
                    return csName.b();
                }
            }
            throw new IllegalStateException("Invalid resource bundle configuration");
        }

        @Override // org.ocpsoft.prettytime.format.a
        protected String g(Duration duration, boolean z4) {
            long abs = Math.abs(k(duration, z4));
            return duration.b() ? z(abs, this.f87823r) : z(abs, this.f87824s);
        }
    }

    private static class CsTimeFormatBuilder {

        /* renamed from: a, reason: collision with root package name */
        private List<CsName> f87825a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private String f87826b;

        CsTimeFormatBuilder(String str) {
            this.f87826b = str;
        }

        private CsTimeFormatBuilder b(boolean z4, String str, long j4) {
            if (str == null) {
                throw new IllegalArgumentException();
            }
            this.f87825a.add(new CsName(z4, str, Long.valueOf(j4)));
            return this;
        }

        CsTimeFormatBuilder a(String str, long j4) {
            return b(true, str, j4);
        }

        CsTimeFormatBuilder c(String str, long j4) {
            return b(false, str, j4);
        }

        CsTimeFormat d(ResourceBundle resourceBundle) {
            return new CsTimeFormat(this.f87826b, resourceBundle, this.f87825a);
        }
    }

    @Override // org.ocpsoft.prettytime.impl.c
    public TimeFormat a(TimeUnit timeUnit) {
        if (timeUnit instanceof Minute) {
            return new CsTimeFormatBuilder("Minute").a("minutu", 1L).a("minuty", 4L).a("minut", Long.MAX_VALUE).c("minutou", 1L).c("minutami", Long.MAX_VALUE).d(this);
        }
        if (timeUnit instanceof Hour) {
            return new CsTimeFormatBuilder("Hour").a("hodinu", 1L).a("hodiny", 4L).a("hodin", Long.MAX_VALUE).c("hodinou", 1L).c("hodinami", Long.MAX_VALUE).d(this);
        }
        if (timeUnit instanceof Day) {
            return new CsTimeFormatBuilder("Day").a("den", 1L).a("dny", 4L).a("dní", Long.MAX_VALUE).c("dnem", 1L).c("dny", Long.MAX_VALUE).d(this);
        }
        if (timeUnit instanceof Week) {
            return new CsTimeFormatBuilder("Week").a("týden", 1L).a("týdny", 4L).a("týdnů", Long.MAX_VALUE).c("týdnem", 1L).c("týdny", Long.MAX_VALUE).d(this);
        }
        if (timeUnit instanceof Month) {
            return new CsTimeFormatBuilder("Month").a("měsíc", 1L).a("měsíce", 4L).a("měsíců", Long.MAX_VALUE).c("měsícem", 1L).c("měsíci", Long.MAX_VALUE).d(this);
        }
        if (timeUnit instanceof Year) {
            return new CsTimeFormatBuilder("Year").a("rok", 1L).a("roky", 4L).a("let", Long.MAX_VALUE).c("rokem", 1L).c("roky", Long.MAX_VALUE).d(this);
        }
        return null;
    }

    @Override // java.util.ListResourceBundle
    public Object[][] getContents() {
        return f87819a;
    }
}
