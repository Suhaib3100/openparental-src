package org.threeten.bp;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* compiled from: DateTimeUtils.java */
/* loaded from: classes9.dex */
public final class b {
    private b() {
    }

    public static Date a(f fVar) {
        try {
            return new Date(fVar.W());
        } catch (ArithmeticException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static GregorianCalendar b(u uVar) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(m(uVar.q()));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        gregorianCalendar.setFirstDayOfWeek(2);
        gregorianCalendar.setMinimalDaysInFirstWeek(4);
        try {
            gregorianCalendar.setTimeInMillis(uVar.B().W());
            return gregorianCalendar;
        } catch (ArithmeticException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static f c(Timestamp timestamp) {
        return f.J(timestamp.getTime() / 1000, timestamp.getNanos());
    }

    public static f d(Calendar calendar) {
        return f.E(calendar.getTimeInMillis());
    }

    public static f e(Date date) {
        return f.E(date.getTime());
    }

    public static g f(java.sql.Date date) {
        return g.x0(date.getYear() + 1900, date.getMonth() + 1, date.getDate());
    }

    public static h g(Timestamp timestamp) {
        return h.u0(timestamp.getYear() + 1900, timestamp.getMonth() + 1, timestamp.getDate(), timestamp.getHours(), timestamp.getMinutes(), timestamp.getSeconds(), timestamp.getNanos());
    }

    public static i h(Time time) {
        return i.P(time.getHours(), time.getMinutes(), time.getSeconds());
    }

    public static java.sql.Date i(g gVar) {
        return new java.sql.Date(gVar.i0() - 1900, gVar.g0() - 1, gVar.c0());
    }

    public static Time j(i iVar) {
        return new Time(iVar.s(), iVar.t(), iVar.v());
    }

    public static Timestamp k(f fVar) {
        try {
            Timestamp timestamp = new Timestamp(fVar.q() * 1000);
            timestamp.setNanos(fVar.r());
            return timestamp;
        } catch (ArithmeticException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static Timestamp l(h hVar) {
        return new Timestamp(hVar.a0() - 1900, hVar.W() - 1, hVar.P(), hVar.T(), hVar.U(), hVar.Z(), hVar.Y());
    }

    public static TimeZone m(r rVar) {
        String j4 = rVar.j();
        if (j4.startsWith("+") || j4.startsWith("-")) {
            j4 = "GMT".concat(j4);
        } else if (j4.equals("Z")) {
            j4 = "UTC";
        }
        return TimeZone.getTimeZone(j4);
    }

    public static r n(TimeZone timeZone) {
        return r.o(timeZone.getID(), r.f88326c);
    }

    public static u o(Calendar calendar) {
        return u.z0(f.E(calendar.getTimeInMillis()), n(calendar.getTimeZone()));
    }
}
