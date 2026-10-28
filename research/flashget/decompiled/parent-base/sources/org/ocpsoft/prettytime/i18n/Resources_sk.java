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
public class Resources_sk extends ListResourceBundle implements c {

    /* renamed from: a, reason: collision with root package name */
    private static final Object[][] f87897a = {new Object[]{"CenturyPattern", "%n %u"}, new Object[]{"CenturyFuturePrefix", "o "}, new Object[]{"CenturyFutureSuffix", ""}, new Object[]{"CenturyPastPrefix", "pred "}, new Object[]{"CenturyPastSuffix", ""}, new Object[]{"CenturySingularName", "storočie"}, new Object[]{"CenturyPluralName", "storočia"}, new Object[]{"CenturyPastSingularName", "storočím"}, new Object[]{"CenturyPastPluralName", "storočiami"}, new Object[]{"CenturyFutureSingularName", "storočí"}, new Object[]{"CenturyFuturePluralName", "storočia"}, new Object[]{"DayPattern", "%n %u"}, new Object[]{"DayFuturePrefix", "o "}, new Object[]{"DayFutureSuffix", ""}, new Object[]{"DayPastPrefix", "pred "}, new Object[]{"DayPastSuffix", ""}, new Object[]{"DaySingularName", "deň"}, new Object[]{"DayPluralName", "dni"}, new Object[]{"DecadePattern", "%n %u"}, new Object[]{"DecadeFuturePrefix", "o "}, new Object[]{"DecadeFutureSuffix", ""}, new Object[]{"DecadePastPrefix", "pred "}, new Object[]{"DecadePastSuffix", ""}, new Object[]{"DecadeSingularName", "desaťročie"}, new Object[]{"DecadePluralName", "desaťročia"}, new Object[]{"DecadePastSingularName", "desaťročím"}, new Object[]{"DecadePastPluralName", "desaťročiami"}, new Object[]{"DecadeFutureSingularName", "desaťročí"}, new Object[]{"DecadeFuturePluralName", "desaťročia"}, new Object[]{"HourPattern", "%n %u"}, new Object[]{"HourFuturePrefix", "o "}, new Object[]{"HourFutureSuffix", ""}, new Object[]{"HourPastPrefix", "pred"}, new Object[]{"HourPastSuffix", ""}, new Object[]{"HourSingularName", "hodina"}, new Object[]{"HourPluralName", "hodiny"}, new Object[]{"JustNowPattern", "%u"}, new Object[]{"JustNowFuturePrefix", ""}, new Object[]{"JustNowFutureSuffix", "o chvíľu"}, new Object[]{"JustNowPastPrefix", "pred chvíľou"}, new Object[]{"JustNowPastSuffix", ""}, new Object[]{"JustNowSingularName", ""}, new Object[]{"JustNowPluralName", ""}, new Object[]{"MillenniumPattern", "%n %u"}, new Object[]{"MillenniumFuturePrefix", "o "}, new Object[]{"MillenniumFutureSuffix", ""}, new Object[]{"MillenniumPastPrefix", "pred "}, new Object[]{"MillenniumPastSuffix", ""}, new Object[]{"MillenniumSingularName", "tísícročie"}, new Object[]{"MillenniumPluralName", "tisícročia"}, new Object[]{"MillisecondPattern", "%n %u"}, new Object[]{"MillisecondFuturePrefix", "o "}, new Object[]{"MillisecondFutureSuffix", ""}, new Object[]{"MillisecondPastPrefix", "pred "}, new Object[]{"MillisecondPastSuffix", ""}, new Object[]{"MillisecondSingularName", "milisekunda"}, new Object[]{"MillisecondPluralName", "milisekundy"}, new Object[]{"MillisecondPastSingularName", "milisekundou"}, new Object[]{"MillisecondPastPluralName", "milisekundami"}, new Object[]{"MillisecondFutureSingularName", "milisekundu"}, new Object[]{"MillisecondFuturePluralName", "milisekúnd"}, new Object[]{"MinutePattern", "%n %u"}, new Object[]{"MinuteFuturePrefix", "o "}, new Object[]{"MinuteFutureSuffix", ""}, new Object[]{"MinutePastPrefix", "pred "}, new Object[]{"MinutePastSuffix", ""}, new Object[]{"MinuteSingularName", "minúta"}, new Object[]{"MinutePluralName", "minúty"}, new Object[]{"MonthPattern", "%n %u"}, new Object[]{"MonthFuturePrefix", "o "}, new Object[]{"MonthFutureSuffix", ""}, new Object[]{"MonthPastPrefix", "pred "}, new Object[]{"MonthPastSuffix", ""}, new Object[]{"MonthSingularName", "mesiac"}, new Object[]{"MonthPluralName", "mesiace"}, new Object[]{"SecondPattern", "%n %u"}, new Object[]{"SecondFuturePrefix", "o "}, new Object[]{"SecondFutureSuffix", ""}, new Object[]{"SecondPastPrefix", "pred "}, new Object[]{"SecondPastSuffix", ""}, new Object[]{"SecondSingularName", "sekunda"}, new Object[]{"SecondPluralName", "sekundy"}, new Object[]{"WeekPattern", "%n %u"}, new Object[]{"WeekFuturePrefix", "o "}, new Object[]{"WeekFutureSuffix", ""}, new Object[]{"WeekPastPrefix", "pred "}, new Object[]{"WeekPastSuffix", ""}, new Object[]{"WeekSingularName", "týždeň"}, new Object[]{"WeekPluralName", "týždne"}, new Object[]{"YearPattern", "%n %u"}, new Object[]{"YearFuturePrefix", "o "}, new Object[]{"YearFutureSuffix", ""}, new Object[]{"YearPastPrefix", "pred "}, new Object[]{"YearPastSuffix", ""}, new Object[]{"YearSingularName", "rok"}, new Object[]{"YearPluralName", "roky"}, new Object[]{"AbstractTimeUnitPattern", ""}, new Object[]{"AbstractTimeUnitFuturePrefix", ""}, new Object[]{"AbstractTimeUnitFutureSuffix", ""}, new Object[]{"AbstractTimeUnitPastPrefix", ""}, new Object[]{"AbstractTimeUnitPastSuffix", ""}, new Object[]{"AbstractTimeUnitSingularName", ""}, new Object[]{"AbstractTimeUnitPluralName", ""}};

    private static class CsName implements Comparable<CsName> {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f87898b;

        /* renamed from: c, reason: collision with root package name */
        private final String f87899c;

        /* renamed from: d, reason: collision with root package name */
        private final Long f87900d;

        public CsName(boolean z4, String str, Long l4) {
            this.f87898b = z4;
            this.f87899c = str;
            this.f87900d = l4;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(CsName csName) {
            return this.f87900d.compareTo(Long.valueOf(csName.c()));
        }

        public String b() {
            return this.f87899c;
        }

        public long c() {
            return this.f87900d.longValue();
        }

        public boolean d() {
            return this.f87898b;
        }
    }

    private static class CsTimeFormat extends a implements TimeFormat {

        /* renamed from: r, reason: collision with root package name */
        private final List<CsName> f87901r = new ArrayList();

        /* renamed from: s, reason: collision with root package name */
        private final List<CsName> f87902s = new ArrayList();

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
                    this.f87901r.add(csName);
                } else {
                    this.f87902s.add(csName);
                }
            }
            Collections.sort(this.f87901r);
            Collections.sort(this.f87902s);
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
            return duration.b() ? z(abs, this.f87901r) : z(abs, this.f87902s);
        }
    }

    private static class CsTimeFormatBuilder {

        /* renamed from: a, reason: collision with root package name */
        private List<CsName> f87903a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private String f87904b;

        CsTimeFormatBuilder(String str) {
            this.f87904b = str;
        }

        private CsTimeFormatBuilder b(boolean z4, String str, long j4) {
            if (str == null) {
                throw new IllegalArgumentException();
            }
            this.f87903a.add(new CsName(z4, str, Long.valueOf(j4)));
            return this;
        }

        CsTimeFormatBuilder a(String str, long j4) {
            return b(true, str, j4);
        }

        CsTimeFormatBuilder c(String str, long j4) {
            return b(false, str, j4);
        }

        CsTimeFormat d(ResourceBundle resourceBundle) {
            return new CsTimeFormat(this.f87904b, resourceBundle, this.f87903a);
        }
    }

    @Override // org.ocpsoft.prettytime.impl.c
    public TimeFormat a(TimeUnit timeUnit) {
        if (timeUnit instanceof Minute) {
            return new CsTimeFormatBuilder("Minute").a("minútu", 1L).a("minúty", 4L).a("minút", Long.MAX_VALUE).c("minútou", 1L).c("minútami", Long.MAX_VALUE).d(this);
        }
        if (timeUnit instanceof Hour) {
            return new CsTimeFormatBuilder("Hour").a("hodinu", 1L).a("hodiny", 4L).a("hodín", Long.MAX_VALUE).c("hodinou", 1L).c("hodinami", Long.MAX_VALUE).d(this);
        }
        if (timeUnit instanceof Day) {
            return new CsTimeFormatBuilder("Day").a("deň", 1L).a("dni", 4L).a("dní", Long.MAX_VALUE).c("dňom", 1L).c("dňami", Long.MAX_VALUE).d(this);
        }
        if (timeUnit instanceof Week) {
            return new CsTimeFormatBuilder("Week").a("týždeň", 1L).a("týždne", 4L).a("týždňov", Long.MAX_VALUE).c("týždňom", 1L).c("týždňami", Long.MAX_VALUE).d(this);
        }
        if (timeUnit instanceof Month) {
            return new CsTimeFormatBuilder("Month").a("mesiac", 1L).a("mesiace", 4L).a("mesiacov", Long.MAX_VALUE).c("mesiacom", 1L).c("mesiacmi", Long.MAX_VALUE).d(this);
        }
        if (timeUnit instanceof Year) {
            return new CsTimeFormatBuilder("Year").a("rok", 1L).a("roky", 4L).a("rokov", Long.MAX_VALUE).c("rokom", 1L).c("rokmi", Long.MAX_VALUE).d(this);
        }
        return null;
    }

    @Override // java.util.ListResourceBundle
    public Object[][] getContents() {
        return f87897a;
    }
}
