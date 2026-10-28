package net.time4j.sql;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import net.time4j.d0;
import net.time4j.engine.ChronoException;
import net.time4j.engine.b0;
import net.time4j.j;
import net.time4j.l0;
import net.time4j.m0;
import net.time4j.n0;
import net.time4j.scale.f;
import net.time4j.tz.l;
import net.time4j.x0;

/* compiled from: JDBCAdapter.java */
/* loaded from: classes7.dex */
public abstract class a<S, T> extends x0<S, T> {

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f83534g = Boolean.getBoolean(ProtectedSandApp.s("顧\u0001"));

    /* renamed from: h, reason: collision with root package name */
    private static final l0 f83535h = l0.w1(0, b0.UNIX);

    /* renamed from: i, reason: collision with root package name */
    public static final a<Date, l0> f83536i = new b();

    /* renamed from: j, reason: collision with root package name */
    public static final a<Time, m0> f83537j = new d();

    /* renamed from: k, reason: collision with root package name */
    public static final a<Timestamp, n0> f83538k = new e();

    /* renamed from: l, reason: collision with root package name */
    public static final a<Timestamp, d0> f83539l = new c();

    /* compiled from: JDBCAdapter.java */
    private static class b extends a<Date, l0> {
        private b() {
        }

        @Override // net.time4j.engine.y
        public Class<Date> a() {
            return Date.class;
        }

        @Override // net.time4j.x0, net.time4j.engine.y
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Date c(l0 l0Var) {
            int o4 = l0Var.o();
            if (o4 < 1900 || o4 > 9999) {
                throw new ChronoException(ProtectedSandApp.s("顨\u0001"));
            }
            long i4 = net.time4j.base.c.i(((Long) l0Var.r(b0.UNIX)).longValue(), 86400000L);
            if (!a.f83534g) {
                i4 -= l.e0().H(l0Var, m0.a1(0)).i() * 1000;
            }
            return new Date(i4);
        }

        @Override // net.time4j.x0, net.time4j.engine.y
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public l0 b(Date date) {
            long time = date.getTime();
            if (!a.f83534g) {
                time += l.e0().I(d0.W0(net.time4j.base.c.b(time, 1000), f.POSIX)).i() * 1000;
            }
            return l0.T0().y().e(net.time4j.base.c.b(time, 86400000) - 730);
        }

        b(C1302a c1302a) {
        }
    }

    /* compiled from: JDBCAdapter.java */
    private static class c extends a<Timestamp, d0> {
        private c() {
        }

        @Override // net.time4j.engine.y
        public Class<Timestamp> a() {
            return Timestamp.class;
        }

        @Override // net.time4j.x0, net.time4j.engine.y
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Timestamp c(d0 d0Var) {
            Timestamp timestamp = new Timestamp(net.time4j.base.c.i(d0Var.j(), 1000L));
            timestamp.setNanos(d0Var.a());
            return timestamp;
        }

        @Override // net.time4j.x0, net.time4j.engine.y
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public d0 b(Timestamp timestamp) {
            try {
                return d0.V0(net.time4j.base.c.b(timestamp.getTime(), 1000), timestamp.getNanos(), f.POSIX);
            } catch (IllegalArgumentException e4) {
                throw new ChronoException(e4.getMessage(), (Throwable) e4);
            }
        }

        c(C1302a c1302a) {
        }
    }

    /* compiled from: JDBCAdapter.java */
    private static class d extends a<Time, m0> {
        private d() {
        }

        @Override // net.time4j.engine.y
        public Class<Time> a() {
            return Time.class;
        }

        @Override // net.time4j.x0, net.time4j.engine.y
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Time c(m0 m0Var) {
            long l4 = m0Var.l(m0.H);
            if (!a.f83534g) {
                l4 -= l.e0().H(a.f83535h, m0Var).i() * 1000;
            }
            return new Time(l4);
        }

        @Override // net.time4j.x0, net.time4j.engine.y
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public m0 b(Time time) {
            long time2 = time.getTime();
            if (!a.f83534g) {
                time2 += l.e0().I(d0.W0(net.time4j.base.c.b(time2, 1000), f.POSIX)).i() * 1000;
            }
            return (m0) m0.Y0().K(m0.H, net.time4j.base.c.d(time2, 86400000));
        }

        d(C1302a c1302a) {
        }
    }

    /* compiled from: JDBCAdapter.java */
    private static class e extends a<Timestamp, n0> {
        private e() {
        }

        @Override // net.time4j.engine.y
        public Class<Timestamp> a() {
            return Timestamp.class;
        }

        @Override // net.time4j.x0, net.time4j.engine.y
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Timestamp c(n0 n0Var) {
            long i4 = net.time4j.base.c.i(((Long) n0Var.k0().r(b0.UNIX)).longValue(), 86400000L);
            long l4 = n0Var.l(m0.H);
            if (!a.f83534g) {
                l4 -= l.e0().H(n0Var, n0Var).i() * 1000;
            }
            Timestamp timestamp = new Timestamp(net.time4j.base.c.f(i4, l4));
            timestamp.setNanos(n0Var.l(m0.G));
            return timestamp;
        }

        @Override // net.time4j.x0, net.time4j.engine.y
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public n0 b(Timestamp timestamp) {
            long time = timestamp.getTime();
            if (!a.f83534g) {
                time += l.e0().I(d0.W0(net.time4j.base.c.b(time, 1000), f.POSIX)).i() * 1000;
            }
            return (n0) n0.B0(l0.w1(net.time4j.base.c.b(time, 86400000), b0.UNIX), m0.a1(0).W(net.time4j.base.c.d(time, 86400000), j.MILLIS)).K(m0.G, timestamp.getNanos());
        }

        e(C1302a c1302a) {
        }
    }

    private a() {
    }

    a(C1302a c1302a) {
    }
}
