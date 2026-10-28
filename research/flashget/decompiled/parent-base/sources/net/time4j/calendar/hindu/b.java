package net.time4j.calendar.hindu;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import java.util.Collections;
import java.util.List;
import net.time4j.engine.b0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AryaSiddhanta.java */
/* loaded from: classes7.dex */
public abstract class b {
    private static final /* synthetic */ b[] $VALUES;
    public static final b LUNAR;
    static final String PREFIX = ProtectedSandApp.s("邂\u0001");
    public static final b SOLAR;

    /* compiled from: AryaSiddhanta.java */
    enum a extends b {
        a(String str, int i4) {
            super(str, i4, null);
        }

        @Override // net.time4j.calendar.hindu.b
        public net.time4j.calendar.hindu.c getCalendarSystem() {
            return new c(true);
        }
    }

    /* compiled from: AryaSiddhanta.java */
    private static class c extends net.time4j.calendar.hindu.c {

        /* renamed from: c, reason: collision with root package name */
        private static final double f82497c = 365.25868055555554d;

        /* renamed from: d, reason: collision with root package name */
        private static final double f82498d = 30.43822337962963d;

        /* renamed from: e, reason: collision with root package name */
        private static final double f82499e = 29.530581807581694d;

        c(boolean z4) {
            super(z4 ? j.f82534l : j.f82535m);
        }

        private boolean q() {
            return this.f82501a == j.f82534l;
        }

        @Override // net.time4j.calendar.hindu.c, net.time4j.engine.l
        public List<net.time4j.engine.j> a() {
            return Collections.singletonList(f.KALI_YUGA);
        }

        @Override // net.time4j.engine.l
        public long d() {
            return q() ? 338699L : 338671L;
        }

        @Override // net.time4j.engine.l
        public long g() {
            return b0.UTC.transform(q() ? -1132959L : -1132988L, b0.RATA_DIE);
        }

        @Override // net.time4j.calendar.hindu.c
        d i(int i4, g gVar, e eVar) {
            double c5;
            if (q()) {
                c5 = ((((gVar.f() - 1) * f82498d) + (i4 * f82497c)) + eVar.c()) - 1.25d;
            } else {
                double d5 = ((i4 * 12) - 1) * f82498d;
                double floor = (Math.floor(d5 / f82499e) + 1.0d) * f82499e;
                int value = gVar.h().getValue();
                if (gVar.a() || Math.ceil((floor - d5) / 0.907641572047936d) > value) {
                    value--;
                }
                c5 = (((eVar.c() - 1) * 0.9843527269193898d) + ((value * f82499e) + floor)) - 0.25d;
            }
            return new d(this.f82501a, i4, gVar, eVar, b0.UTC.transform((long) Math.ceil(c5 - 1132959.0d), b0.RATA_DIE));
        }

        @Override // net.time4j.calendar.hindu.c
        d j(long j4) {
            double transform = (b0.RATA_DIE.transform(j4, b0.UTC) - (-1132959)) + 0.25d;
            if (q()) {
                return new d(this.f82501a, (int) Math.floor(transform / f82497c), g.k(((int) net.time4j.calendar.hindu.c.n(Math.floor(transform / f82498d), 12.0d)) + 1), e.e(((int) Math.floor(net.time4j.calendar.hindu.c.n(transform, f82498d))) + 1), j4);
            }
            double n4 = transform - net.time4j.calendar.hindu.c.n(transform, f82499e);
            double n5 = net.time4j.calendar.hindu.c.n(n4, f82498d);
            boolean z4 = 0.907641572047936d >= n5 && n5 > p.f60679p;
            int ceil = (int) (Math.ceil((n4 + f82498d) / f82497c) - 1.0d);
            int n6 = (int) (net.time4j.calendar.hindu.c.n(Math.ceil(n4 / f82498d), 12.0d) + 1.0d);
            int n7 = (int) (net.time4j.calendar.hindu.c.n(Math.floor((transform * 30.0d) / f82499e), 30.0d) + 1.0d);
            g j5 = g.j(n6);
            j jVar = this.f82501a;
            if (z4) {
                j5 = j5.m();
            }
            return new d(jVar, ceil, j5, e.e(n7), j4);
        }

        @Override // net.time4j.calendar.hindu.c
        boolean m(int i4, g gVar, e eVar) {
            if (i4 < 0 || i4 > 5999 || gVar == null || eVar == null) {
                return false;
            }
            if (q() && (gVar.a() || eVar.a())) {
                return false;
            }
            if (eVar.c() > (q() ? 31 : 30)) {
                return false;
            }
            return !l(i4, gVar, eVar);
        }
    }

    static {
        a aVar = new a(ProtectedSandApp.s("邃\u0001"), 0);
        SOLAR = aVar;
        b bVar = new b(ProtectedSandApp.s("還\u0001"), 1) { // from class: net.time4j.calendar.hindu.b.b
            {
                a aVar2 = null;
            }

            @Override // net.time4j.calendar.hindu.b
            public net.time4j.calendar.hindu.c getCalendarSystem() {
                return new c(false);
            }
        };
        LUNAR = bVar;
        $VALUES = new b[]{aVar, bVar};
    }

    private b(String str, int i4) {
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    abstract net.time4j.calendar.hindu.c getCalendarSystem();

    public j variant() {
        return this == SOLAR ? j.f82534l : j.f82535m;
    }

    /* synthetic */ b(String str, int i4, a aVar) {
        this(str, i4);
    }
}
