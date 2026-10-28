package org.ocpsoft.prettytime;

import androidx.compose.runtime.z4;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.ocpsoft.prettytime.impl.ResourcesTimeUnit;
import org.ocpsoft.prettytime.impl.a;
import org.ocpsoft.prettytime.impl.b;
import org.ocpsoft.prettytime.units.Century;
import org.ocpsoft.prettytime.units.Day;
import org.ocpsoft.prettytime.units.Decade;
import org.ocpsoft.prettytime.units.Hour;
import org.ocpsoft.prettytime.units.JustNow;
import org.ocpsoft.prettytime.units.Millennium;
import org.ocpsoft.prettytime.units.Millisecond;
import org.ocpsoft.prettytime.units.Minute;
import org.ocpsoft.prettytime.units.Month;
import org.ocpsoft.prettytime.units.Second;
import org.ocpsoft.prettytime.units.Week;
import org.ocpsoft.prettytime.units.Year;

/* loaded from: classes9.dex */
public class PrettyTime {

    /* renamed from: a, reason: collision with root package name */
    private volatile Date f87793a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Locale f87794b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Map<TimeUnit, TimeFormat> f87795c;

    /* renamed from: d, reason: collision with root package name */
    private volatile List<TimeUnit> f87796d;

    /* renamed from: e, reason: collision with root package name */
    private String f87797e;

    public PrettyTime() {
        this.f87794b = Locale.getDefault();
        this.f87795c = new LinkedHashMap();
        B();
    }

    private void B() {
        a(new JustNow());
        a(new Millisecond());
        a(new Second());
        a(new Minute());
        a(new Hour());
        a(new Day());
        a(new Week());
        a(new Month());
        a(new Year());
        a(new Decade());
        a(new Century());
        a(new Millennium());
    }

    private Date C() {
        return new Date();
    }

    private void a(ResourcesTimeUnit resourcesTimeUnit) {
        D(resourcesTimeUnit, new b(resourcesTimeUnit, this.f87797e));
    }

    private Duration c(long j4) {
        long abs = Math.abs(j4);
        List<TimeUnit> A = A();
        a aVar = new a();
        int i4 = 0;
        while (i4 < A.size()) {
            TimeUnit timeUnit = A.get(i4);
            long abs2 = Math.abs(timeUnit.b());
            long abs3 = Math.abs(timeUnit.a());
            boolean z4 = i4 == A.size() - 1;
            if (0 == abs3 && !z4) {
                abs3 = A.get(i4 + 1).b() / timeUnit.b();
            }
            if (abs3 * abs2 > abs || z4) {
                aVar.i(timeUnit);
                if (abs2 > abs) {
                    aVar.h(y(j4));
                    aVar.g(0L);
                } else {
                    aVar.h(j4 / abs2);
                    aVar.g(j4 - (aVar.f() * abs2));
                }
                return aVar;
            }
            i4++;
        }
        return aVar;
    }

    private long y(long j4) {
        return 0 > j4 ? -1L : 1L;
    }

    public List<TimeUnit> A() {
        if (this.f87796d == null) {
            ArrayList arrayList = new ArrayList(this.f87795c.keySet());
            Collections.sort(arrayList, new org.ocpsoft.prettytime.units.a());
            this.f87796d = Collections.unmodifiableList(arrayList);
        }
        return this.f87796d;
    }

    public PrettyTime D(TimeUnit timeUnit, TimeFormat timeFormat) {
        if (timeUnit == null) {
            throw new IllegalArgumentException("Unit to register must not be null.");
        }
        if (timeFormat == null) {
            throw new IllegalArgumentException("Format to register must not be null.");
        }
        this.f87796d = null;
        this.f87795c.put(timeUnit, timeFormat);
        if (timeUnit instanceof LocaleAware) {
            ((LocaleAware) timeUnit).setLocale(this.f87794b);
        }
        if (timeFormat instanceof LocaleAware) {
            ((LocaleAware) timeFormat).setLocale(this.f87794b);
        }
        return this;
    }

    public <UNIT extends TimeUnit> TimeFormat E(Class<UNIT> cls) {
        if (cls == null) {
            return null;
        }
        for (TimeUnit timeUnit : this.f87795c.keySet()) {
            if (cls.isAssignableFrom(timeUnit.getClass())) {
                this.f87796d = null;
                return this.f87795c.remove(timeUnit);
            }
        }
        return null;
    }

    public TimeFormat F(TimeUnit timeUnit) {
        if (timeUnit == null) {
            return null;
        }
        this.f87796d = null;
        return this.f87795c.remove(timeUnit);
    }

    public PrettyTime G(Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        this.f87794b = locale;
        for (TimeUnit timeUnit : this.f87795c.keySet()) {
            if (timeUnit instanceof LocaleAware) {
                ((LocaleAware) timeUnit).setLocale(locale);
            }
        }
        for (TimeFormat timeFormat : this.f87795c.values()) {
            if (timeFormat instanceof LocaleAware) {
                ((LocaleAware) timeFormat).setLocale(locale);
            }
        }
        this.f87796d = null;
        return this;
    }

    public PrettyTime H(Date date) {
        this.f87793a = date;
        return this;
    }

    public Duration b(Date date) {
        if (date == null) {
            date = new Date();
        }
        Date date2 = this.f87793a;
        if (date2 == null) {
            date2 = new Date();
        }
        return c(date.getTime() - date2.getTime());
    }

    public List<Duration> d(Date date) {
        if (date == null) {
            date = new Date();
        }
        Date date2 = this.f87793a;
        if (date2 == null) {
            date2 = new Date();
        }
        ArrayList arrayList = new ArrayList();
        Duration c5 = c(date.getTime() - date2.getTime());
        arrayList.add(c5);
        while (0 != c5.c()) {
            c5 = c(c5.c());
            if (arrayList.size() > 0 && ((Duration) z4.a(arrayList, 1)).a().equals(c5.a())) {
                break;
            }
            if (c5.a().c()) {
                arrayList.add(c5);
            }
        }
        return arrayList;
    }

    public List<TimeUnit> e() {
        List<TimeUnit> A = A();
        this.f87796d = null;
        this.f87795c.clear();
        return A;
    }

    public String f(Calendar calendar) {
        return calendar == null ? g(new Date()) : g(calendar.getTime());
    }

    public String g(Date date) {
        if (date == null) {
            date = new Date();
        }
        return i(b(date));
    }

    public String h(List<Duration> list) {
        if (list == null || list.isEmpty()) {
            return g(new Date());
        }
        StringBuilder sb = new StringBuilder();
        TimeFormat timeFormat = null;
        Duration duration = null;
        for (int i4 = 0; i4 < list.size(); i4++) {
            duration = list.get(i4);
            timeFormat = v(duration.a());
            if (i4 < list.size() - 1) {
                sb.append(timeFormat.d(duration));
                sb.append(" ");
            } else {
                sb.append(timeFormat.b(duration));
            }
        }
        return timeFormat.c(duration, sb.toString());
    }

    public String i(Duration duration) {
        if (duration == null) {
            return g(new Date());
        }
        TimeFormat v4 = v(duration.a());
        return v4.a(duration, v4.b(duration));
    }

    public String j(Calendar calendar) {
        return calendar == null ? k(new Date()) : m(b(calendar.getTime()));
    }

    public String k(Date date) {
        return m(b(date));
    }

    public String l(List<Duration> list) {
        if (list == null || list.isEmpty()) {
            return g(new Date());
        }
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < list.size(); i4++) {
            Duration duration = list.get(i4);
            TimeFormat v4 = v(duration.a());
            if (i4 < list.size() - 1) {
                sb.append(v4.d(duration));
                sb.append(" ");
            } else {
                sb.append(v4.b(duration));
            }
        }
        return sb.toString();
    }

    public String m(Duration duration) {
        return duration == null ? g(new Date()) : v(duration.a()).b(duration);
    }

    public String n(Calendar calendar) {
        return calendar == null ? k(new Date()) : q(b(calendar.getTime()));
    }

    public String o(Date date) {
        return q(b(date));
    }

    public String p(List<Duration> list) {
        if (list == null || list.isEmpty()) {
            return g(new Date());
        }
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < list.size(); i4++) {
            Duration duration = list.get(i4);
            sb.append(v(duration.a()).d(duration));
            if (i4 < list.size() - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public String q(Duration duration) {
        return duration == null ? g(new Date()) : v(duration.a()).d(duration);
    }

    public String r(Calendar calendar) {
        return calendar == null ? s(new Date()) : s(calendar.getTime());
    }

    public String s(Date date) {
        if (date == null) {
            date = new Date();
        }
        return u(b(date));
    }

    public String t(List<Duration> list) {
        if (list == null || list.isEmpty()) {
            return g(new Date());
        }
        StringBuilder sb = new StringBuilder();
        TimeFormat timeFormat = null;
        Duration duration = null;
        for (int i4 = 0; i4 < list.size(); i4++) {
            duration = list.get(i4);
            timeFormat = v(duration.a());
            sb.append(timeFormat.d(duration));
            if (i4 < list.size() - 1) {
                sb.append(" ");
            }
        }
        return timeFormat.c(duration, sb.toString());
    }

    public String toString() {
        return "PrettyTime [reference=" + this.f87793a + ", locale=" + this.f87794b + "]";
    }

    public String u(Duration duration) {
        if (duration == null) {
            return s(new Date());
        }
        TimeFormat v4 = v(duration.a());
        return v4.c(duration, v4.d(duration));
    }

    public TimeFormat v(TimeUnit timeUnit) {
        if (timeUnit == null || this.f87795c.get(timeUnit) == null) {
            return null;
        }
        return this.f87795c.get(timeUnit);
    }

    public Locale w() {
        return this.f87794b;
    }

    public Date x() {
        return this.f87793a;
    }

    public <UNIT extends TimeUnit> UNIT z(Class<UNIT> cls) {
        if (cls == null) {
            return null;
        }
        Iterator<TimeUnit> it = this.f87795c.keySet().iterator();
        while (it.hasNext()) {
            UNIT unit = (UNIT) it.next();
            if (cls.isAssignableFrom(unit.getClass())) {
                return unit;
            }
        }
        return null;
    }

    public PrettyTime(String str) {
        this.f87794b = Locale.getDefault();
        this.f87795c = new LinkedHashMap();
        this.f87797e = str;
        B();
    }

    public PrettyTime(Date date) {
        this();
        H(date);
    }

    public PrettyTime(Date date, String str) {
        this(str);
        H(date);
    }

    public PrettyTime(Locale locale) {
        this.f87794b = Locale.getDefault();
        this.f87795c = new LinkedHashMap();
        G(locale);
        B();
    }

    public PrettyTime(Locale locale, String str) {
        this.f87794b = Locale.getDefault();
        this.f87795c = new LinkedHashMap();
        this.f87797e = str;
        G(locale);
        B();
    }

    public PrettyTime(Date date, Locale locale) {
        this(locale);
        H(date);
    }

    public PrettyTime(Date date, Locale locale, String str) {
        this(locale, str);
        H(date);
    }
}
