package net.time4j.calendar.frenchrev;

import androidx.collection.p0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import net.time4j.calendar.astro.j;
import net.time4j.engine.b0;
import net.time4j.h;
import net.time4j.l0;
import net.time4j.n0;
import net.time4j.tz.p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FrenchRepublicanAlgorithm.java */
/* loaded from: classes7.dex */
public abstract class b {
    private static final /* synthetic */ b[] $VALUES;
    private static final long ABOLITION;
    private static final net.time4j.engine.c<b> ATTRIBUTE;
    private static final long EPOCH;
    public static final b EQUINOX;
    private static final p PARIS_OBSERVATORY;
    public static final b ROMME;

    static {
        a aVar = new a(ProtectedSandApp.s("踝\u0001"), 0);
        EQUINOX = aVar;
        b bVar = new b(ProtectedSandApp.s("踞\u0001"), 1) { // from class: net.time4j.calendar.frenchrev.b.b
            {
                a aVar2 = null;
            }

            @Override // net.time4j.calendar.frenchrev.b
            public boolean isLeapYear(int i4) {
                if (i4 < 1 || i4 > 1202) {
                    throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("踢\u0001"), i4));
                }
                if (i4 == 3 || i4 == 7 || i4 == 11) {
                    return true;
                }
                if (i4 >= 15) {
                    return (i4 & 3) == 0 && (i4 % 100 != 0 || i4 % 400 == 0);
                }
                return false;
            }

            @Override // net.time4j.calendar.frenchrev.b
            c transform(long j4) {
                if (j4 < b.ABOLITION) {
                    return b.EQUINOX.transform(j4);
                }
                b.check(j4);
                int b5 = (int) (net.time4j.base.c.b(((j4 - b.EPOCH) + 2) * 4000, 1460969) + 1);
                long transform = transform(new c(b5, 1));
                if (transform > j4) {
                    transform = transform(new c(b5 - 1, 1));
                    b5--;
                }
                return new c(b5, (int) ((j4 - transform) + 1));
            }

            @Override // net.time4j.calendar.frenchrev.b
            long transform(c cVar) {
                if (cVar.o() < 15) {
                    return b.EQUINOX.transform(cVar);
                }
                int o4 = cVar.o() - 1;
                return ((((b.EPOCH - 1) + (o4 * 365)) + net.time4j.base.c.a(o4, 4)) - net.time4j.base.c.a(o4, 100)) + net.time4j.base.c.a(o4, 400) + cVar.A0();
            }
        };
        ROMME = bVar;
        $VALUES = new b[]{aVar, bVar};
        PARIS_OBSERVATORY = p.b(net.time4j.tz.f.AHEAD_OF_UTC, 2, 20, 14.025d);
        l0 r12 = l0.r1(1806, 1, 1);
        b0 b0Var = b0.UTC;
        ABOLITION = ((Long) r12.r(b0Var)).longValue();
        EPOCH = ((Long) l0.r1(1792, 9, 22).r(b0Var)).longValue();
        ATTRIBUTE = net.time4j.format.a.e(ProtectedSandApp.s("踟\u0001"), b.class);
    }

    private b(String str, int i4) {
    }

    public static net.time4j.engine.c<b> attribute() {
        return ATTRIBUTE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void check(long j4) {
        if (j4 < -65478 || j4 > 373542) {
            throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("踠\u0001"), j4));
        }
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public boolean isLeapYear(int i4) {
        throw new AbstractMethodError();
    }

    abstract long transform(c cVar);

    abstract c transform(long j4);

    /* synthetic */ b(String str, int i4, a aVar) {
        this(str, i4);
    }

    /* compiled from: FrenchRepublicanAlgorithm.java */
    enum a extends b {
        a(String str, int i4) {
            super(str, i4, null);
        }

        private l0 autumnalEquinox(int i4) {
            return ((n0) net.time4j.calendar.astro.b.AUTUMNAL_EQUINOX.inYear(i4 + 1791).x(j.o(b.PARIS_OBSERVATORY))).k0();
        }

        @Override // net.time4j.calendar.frenchrev.b
        public boolean isLeapYear(int i4) {
            if (i4 < 1 || i4 > 1202) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("踡\u0001"), i4));
            }
            return autumnalEquinox(i4 + 1).b() - autumnalEquinox(i4).b() == 366;
        }

        @Override // net.time4j.calendar.frenchrev.b
        c transform(long j4) {
            b.check(j4);
            l0 w12 = l0.w1(j4, b0.UTC);
            int o4 = w12.o();
            int i4 = o4 - 1791;
            if (w12.q() < 9) {
                i4 = o4 - 1792;
            }
            long between = h.DAYS.between(autumnalEquinox(i4), w12);
            while (between < 0) {
                i4--;
                between = h.DAYS.between(autumnalEquinox(i4), w12);
            }
            return new c(i4, (int) (between + 1));
        }

        @Override // net.time4j.calendar.frenchrev.b
        long transform(c cVar) {
            return (autumnalEquinox(cVar.o()).b() + cVar.A0()) - 1;
        }
    }
}
