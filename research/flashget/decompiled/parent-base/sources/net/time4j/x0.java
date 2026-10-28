package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* compiled from: TemporalType.java */
/* loaded from: classes7.dex */
public abstract class x0<S, T> implements net.time4j.engine.y<S, T> {

    /* renamed from: a, reason: collision with root package name */
    private static final int f83714a = 1000000;

    /* renamed from: f, reason: collision with root package name */
    private static final String f83719f = ProtectedSandApp.s("顦\u0001");

    /* renamed from: b, reason: collision with root package name */
    public static final x0<Date, d0> f83715b = new c();

    /* renamed from: c, reason: collision with root package name */
    public static final x0<Long, d0> f83716c = new d();

    /* renamed from: d, reason: collision with root package name */
    public static final x0<Calendar, l1> f83717d = new b();

    /* renamed from: e, reason: collision with root package name */
    public static final x0<TimeZone, net.time4j.tz.l> f83718e = new e();

    /* compiled from: TemporalType.java */
    private static class b extends x0<Calendar, l1> {
        private b() {
        }

        @Override // net.time4j.engine.y
        public Class<Calendar> a() {
            return Calendar.class;
        }

        @Override // net.time4j.x0, net.time4j.engine.y
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Calendar c(l1 l1Var) {
            Date c5 = x0.f83715b.c(l1Var.t());
            TimeZone c6 = x0.f83718e.c(l1Var.h());
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
            gregorianCalendar.setFirstDayOfWeek(2);
            gregorianCalendar.setMinimalDaysInFirstWeek(4);
            gregorianCalendar.setTimeZone(c6);
            gregorianCalendar.setTime(c5);
            return gregorianCalendar;
        }

        @Override // net.time4j.x0, net.time4j.engine.y
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public l1 b(Calendar calendar) {
            return l1.k(x0.f83715b.b(calendar.getTime()), x0.f83718e.b(calendar.getTimeZone()));
        }

        b(a aVar) {
        }
    }

    /* compiled from: TemporalType.java */
    private static class c extends x0<Date, d0> {
        private c() {
        }

        @Override // net.time4j.engine.y
        public Class<Date> a() {
            return Date.class;
        }

        @Override // net.time4j.x0, net.time4j.engine.y
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Date c(d0 d0Var) {
            return new Date(net.time4j.base.c.f(net.time4j.base.c.i(d0Var.j(), 1000L), d0Var.a() / 1000000));
        }

        @Override // net.time4j.x0, net.time4j.engine.y
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public d0 b(Date date) {
            long time = date.getTime();
            return d0.V0(net.time4j.base.c.b(time, 1000), net.time4j.base.c.d(time, 1000) * 1000000, net.time4j.scale.f.POSIX);
        }

        c(a aVar) {
        }
    }

    /* compiled from: TemporalType.java */
    private static class d extends x0<Long, d0> {
        private d() {
        }

        @Override // net.time4j.engine.y
        public Class<Long> a() {
            return Long.class;
        }

        @Override // net.time4j.x0, net.time4j.engine.y
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Long c(d0 d0Var) {
            return Long.valueOf(net.time4j.base.c.f(net.time4j.base.c.i(d0Var.j(), 1000L), d0Var.a() / 1000000));
        }

        @Override // net.time4j.x0, net.time4j.engine.y
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public d0 b(Long l4) {
            long longValue = l4.longValue();
            return d0.V0(net.time4j.base.c.b(longValue, 1000), net.time4j.base.c.d(longValue, 1000) * 1000000, net.time4j.scale.f.POSIX);
        }

        d(a aVar) {
        }
    }

    /* compiled from: TemporalType.java */
    private static class e extends x0<TimeZone, net.time4j.tz.l> {
        private e() {
        }

        @Override // net.time4j.engine.y
        public Class<TimeZone> a() {
            return TimeZone.class;
        }

        @Override // net.time4j.x0, net.time4j.engine.y
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public TimeZone c(net.time4j.tz.l lVar) {
            if (lVar.F() != null) {
                return new i0(lVar);
            }
            String canonical = lVar.G().canonical();
            if (canonical.startsWith(ProtectedSandApp.s("鸅\u0001"))) {
                canonical = canonical.substring(19);
            }
            return TimeZone.getTimeZone(canonical);
        }

        @Override // net.time4j.x0, net.time4j.engine.y
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public net.time4j.tz.l b(TimeZone timeZone) {
            if (timeZone instanceof i0) {
                return ((i0) timeZone).b();
            }
            return net.time4j.tz.l.Z(ProtectedSandApp.s("鸅\u0001") + timeZone.getID());
        }

        e(a aVar) {
        }
    }

    protected x0() {
    }

    @Override // net.time4j.engine.y
    public abstract T b(S s4);

    @Override // net.time4j.engine.y
    public abstract S c(T t4);
}
