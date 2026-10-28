package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.event.open.EventResult;
import com.tencent.liteav.TXLiteAVCode;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PersianAlgorithm.java */
/* loaded from: classes7.dex */
public abstract class h0 {
    private static final /* synthetic */ h0[] $VALUES;
    public static final h0 ASTRONOMICAL;
    private static final net.time4j.engine.c<h0> ATTRIBUTE;
    public static final h0 BIRASHK;
    public static final h0 BORKOWSKI;
    public static final h0 KHAYYAM;
    private static final int LENGTH_OF_KHAYYAM_CYCLE = 12053;
    private static final long REFERENCE_ZERO_KHAYYAM = 493363;
    private static final long START_OF_BIRASHK_CYCLE = -319872;
    static final net.time4j.tz.p STD_OFFSET;

    static {
        a aVar = new a(ProtectedSandApp.s("遷\u0001"), 0);
        BORKOWSKI = aVar;
        h0 h0Var = new h0(ProtectedSandApp.s("選\u0001"), 1) { // from class: net.time4j.calendar.h0.b
            {
                a aVar2 = null;
            }

            @Override // net.time4j.calendar.h0
            boolean isLeapYear(int i4, net.time4j.tz.p pVar) {
                h0.checkYear(i4);
                int i5 = i4 % 33;
                return i5 == 1 || i5 == 5 || i5 == 9 || i5 == 13 || i5 == 17 || i5 == 22 || i5 == 26 || i5 == 30;
            }

            @Override // net.time4j.calendar.h0
            PersianCalendar transform(long j4, net.time4j.tz.p pVar) {
                h0.checkRange(j4);
                long j5 = j4 + h0.REFERENCE_ZERO_KHAYYAM;
                int i4 = (int) (j5 / 12053);
                int i5 = (int) (j5 % 12053);
                int i6 = i4 * 33;
                int i7 = 0;
                while (i7 < 33) {
                    int i10 = (i7 == 1 || i7 == 5 || i7 == 9 || i7 == 13 || i7 == 17 || i7 == 22 || i7 == 26 || i7 == 30) ? 366 : 365;
                    if (i5 < i10) {
                        break;
                    }
                    i5 -= i10;
                    i6++;
                    i7++;
                }
                int i11 = 1;
                int i12 = 1;
                while (i11 < 12) {
                    int i13 = i11 <= 6 ? 31 : 30;
                    if (i5 < i13) {
                        break;
                    }
                    i5 -= i13;
                    i12++;
                    i11++;
                }
                return new PersianCalendar(i6, i12, 1 + i5);
            }

            @Override // net.time4j.calendar.h0
            long transform(PersianCalendar persianCalendar, net.time4j.tz.p pVar) {
                int o4 = persianCalendar.o();
                long j4 = ((o4 / 33) * h0.LENGTH_OF_KHAYYAM_CYCLE) - h0.REFERENCE_ZERO_KHAYYAM;
                int i4 = 0;
                while (i4 < o4 % 33) {
                    j4 += (i4 == 1 || i4 == 5 || i4 == 9 || i4 == 13 || i4 == 17 || i4 == 22 || i4 == 26 || i4 == 30) ? 366 : 365;
                    i4++;
                }
                return ((j4 + (persianCalendar.D0().getValue() <= 7 ? (r7 - 1) * 31 : androidx.core.graphics.y.a(r7, 1, 30, 6))) + persianCalendar.t()) - 1;
            }
        };
        KHAYYAM = h0Var;
        h0 h0Var2 = new h0(ProtectedSandApp.s("遹\u0001"), 2) { // from class: net.time4j.calendar.h0.c
            {
                a aVar2 = null;
            }

            @Override // net.time4j.calendar.h0
            boolean isLeapYear(int i4, net.time4j.tz.p pVar) {
                h0.checkYear(i4);
                return net.time4j.base.c.c((net.time4j.base.c.c(i4 + (-474), 2820) + 512) * 31, 128) < 31;
            }

            @Override // net.time4j.calendar.h0
            PersianCalendar transform(long j4, net.time4j.tz.p pVar) {
                h0.checkRange(j4);
                int i4 = (int) (j4 - h0.START_OF_BIRASHK_CYCLE);
                int a5 = net.time4j.base.c.a(i4, 1029983);
                int c5 = net.time4j.base.c.c(i4, 1029983);
                int a6 = (a5 * 2820) + 474 + (c5 == 1029982 ? 2820 : net.time4j.base.c.a((c5 * 128) + 46878, 46751));
                int transform = (int) (j4 - transform(new PersianCalendar(a6, 1, 1), pVar));
                int i5 = 1;
                int i6 = 1;
                while (i5 < 12) {
                    int i7 = i5 <= 6 ? 31 : 30;
                    if (transform < i7) {
                        break;
                    }
                    transform -= i7;
                    i6++;
                    i5++;
                }
                return new PersianCalendar(a6, i6, 1 + transform);
            }

            @Override // net.time4j.calendar.h0
            long transform(PersianCalendar persianCalendar, net.time4j.tz.p pVar) {
                int c5 = net.time4j.base.c.c(persianCalendar.o() - 474, 2820);
                return ((net.time4j.base.c.a(r9, 2820) * 1029983) - 492998) + ((c5 + 473) * 365) + net.time4j.base.c.a(((c5 + 474) * 31) - 5, 128) + (persianCalendar.D0().getValue() <= 7 ? (r9 - 1) * 31 : androidx.core.graphics.y.a(r9, 1, 30, 6)) + persianCalendar.t();
            }
        };
        BIRASHK = h0Var2;
        h0 h0Var3 = new h0(ProtectedSandApp.s("遺\u0001"), 3) { // from class: net.time4j.calendar.h0.d
            {
                a aVar2 = null;
            }

            /* JADX WARN: Multi-variable type inference failed */
            private net.time4j.l0 vernalEquinox(int i4, net.time4j.tz.p pVar) {
                net.time4j.n0 n0Var = (net.time4j.n0) net.time4j.calendar.astro.b.VERNAL_EQUINOX.inYear(i4 + 621).x(net.time4j.calendar.astro.j.o(pVar));
                return n0Var.u() >= 12 ? (net.time4j.l0) n0Var.k0().W(1L, net.time4j.h.DAYS) : n0Var.k0();
            }

            @Override // net.time4j.calendar.h0
            int getMaxPersianYear() {
                return 2378;
            }

            @Override // net.time4j.calendar.h0
            boolean isLeapYear(int i4, net.time4j.tz.p pVar) {
                if (i4 < 1 || i4 > getMaxPersianYear()) {
                    throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("避\u0001"), i4));
                }
                return transform(new PersianCalendar(i4 + 1, 1, 1), pVar) - transform(new PersianCalendar(i4, 1, 1), pVar) == 366;
            }

            @Override // net.time4j.calendar.h0
            PersianCalendar transform(long j4, net.time4j.tz.p pVar) {
                if (j4 < -492997 || j4 > 375548) {
                    throw new IllegalArgumentException(androidx.collection.p0.a(ProtectedSandApp.s("避\u0001"), j4));
                }
                net.time4j.l0 w12 = net.time4j.l0.w1(j4, net.time4j.engine.b0.UTC);
                int o4 = w12.o();
                int i4 = o4 - 621;
                if (w12.q() < 3) {
                    i4 = o4 - 622;
                }
                long between = net.time4j.h.DAYS.between(vernalEquinox(i4, pVar), w12);
                while (between < 0) {
                    i4--;
                    between = net.time4j.h.DAYS.between(vernalEquinox(i4, pVar), w12);
                }
                int i5 = 1;
                while (i5 < 12) {
                    long j5 = i5 <= 6 ? 31 : 30;
                    if (between < j5) {
                        break;
                    }
                    between -= j5;
                    i5++;
                }
                return new PersianCalendar(i4, i5, (int) (between + 1));
            }

            @Override // net.time4j.calendar.h0
            long transform(PersianCalendar persianCalendar, net.time4j.tz.p pVar) {
                int o4 = persianCalendar.o();
                int value = persianCalendar.D0().getValue();
                long b5 = vernalEquinox(o4, pVar).b();
                int i4 = value / 7;
                return b5 + ((persianCalendar.t() + (((value - 1) * 31) - ((value - 7) * i4))) - 1);
            }
        };
        ASTRONOMICAL = h0Var3;
        $VALUES = new h0[]{aVar, h0Var, h0Var2, h0Var3};
        STD_OFFSET = net.time4j.tz.p.n(net.time4j.tz.f.AHEAD_OF_UTC, 3, 30);
        ATTRIBUTE = net.time4j.format.a.e(ProtectedSandApp.s("遻\u0001"), h0.class);
    }

    private h0(String str, int i4) {
    }

    public static net.time4j.engine.c<h0> attribute() {
        return ATTRIBUTE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void checkRange(long j4) {
        net.time4j.engine.l<PersianCalendar> y4 = PersianCalendar.v0().y();
        if (j4 < y4.g() || j4 > y4.d()) {
            throw new IllegalArgumentException(androidx.collection.p0.a(ProtectedSandApp.s("遼\u0001"), j4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void checkYear(int i4) {
        if (i4 < 1 || i4 > 3000) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("遼\u0001"), i4));
        }
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) $VALUES.clone();
    }

    int getMaxPersianYear() {
        return 3000;
    }

    public boolean isLeapYear(int i4) {
        return isLeapYear(i4, STD_OFFSET);
    }

    abstract boolean isLeapYear(int i4, net.time4j.tz.p pVar);

    boolean isValid(int i4, int i5, int i6, net.time4j.tz.p pVar) {
        if (i4 < 1 || i4 > getMaxPersianYear() || i5 < 1 || i5 > 12 || i6 < 1) {
            return false;
        }
        if (i5 <= 6) {
            return i6 <= 31;
        }
        if (i5 <= 11) {
            return i6 <= 30;
        }
        return i6 <= (isLeapYear(i4, pVar) ? 30 : 29);
    }

    abstract long transform(PersianCalendar persianCalendar, net.time4j.tz.p pVar);

    abstract PersianCalendar transform(long j4, net.time4j.tz.p pVar);

    /* synthetic */ h0(String str, int i4, a aVar) {
        this(str, i4);
    }

    /* compiled from: PersianAlgorithm.java */
    enum a extends h0 {
        a(String str, int i4) {
            super(str, i4, null);
        }

        private net.time4j.l0 vernalEquinox(int i4) {
            int[] iArr = {-61, 9, 38, EventResult.ERROR_CODE_OTHER, 426, 686, 756, 818, TXLiteAVCode.WARNING_CAMERA_DEVICE_EMPTY, 1181, 1210, 1635, 2060, 2097, 2192, 2262, 2324, 2394, 2456, 3178};
            int i5 = iArr[19];
            if (i4 < 1 || i4 >= i5) {
                throw new IllegalArgumentException(androidx.compose.foundation.text.q.a(ProtectedSandApp.s("遽\u0001"), i5, ProtectedSandApp.s("遾\u0001"), i4));
            }
            int i6 = i4 + 621;
            int i7 = 0;
            int i10 = iArr[0];
            int i11 = -14;
            int i12 = 1;
            while (true) {
                if (i12 >= 20) {
                    break;
                }
                int i13 = iArr[i12];
                int i14 = i13 - i10;
                if (i4 < i13) {
                    i7 = i14;
                    break;
                }
                i11 += ((i14 % 33) / 4) + ((i14 / 33) * 8);
                i12++;
                i10 = i13;
                i7 = i14;
            }
            int i15 = i4 - i10;
            int i16 = (((i15 % 33) + 3) / 4) + ((i15 / 33) * 8) + i11;
            if (i7 % 33 == 4 && i7 - i15 == 4) {
                i16++;
            }
            return net.time4j.l0.r1(i6, 3, (i16 + 20) - (((i6 / 4) - ((((i6 / 100) + 1) * 3) / 4)) - 150));
        }

        @Override // net.time4j.calendar.h0
        boolean isLeapYear(int i4, net.time4j.tz.p pVar) {
            h0.checkYear(i4);
            return transform(new PersianCalendar(i4 + 1, 1, 1), pVar) - transform(new PersianCalendar(i4, 1, 1), pVar) == 366;
        }

        @Override // net.time4j.calendar.h0
        PersianCalendar transform(long j4, net.time4j.tz.p pVar) {
            net.time4j.l0 w12 = net.time4j.l0.w1(j4, net.time4j.engine.b0.UTC);
            int o4 = w12.o();
            int i4 = o4 - 621;
            if (w12.q() < 3) {
                i4 = o4 - 622;
            }
            long between = net.time4j.h.DAYS.between(vernalEquinox(i4), w12);
            while (between < 0) {
                i4--;
                between = net.time4j.h.DAYS.between(vernalEquinox(i4), w12);
            }
            int i5 = 1;
            while (i5 < 12) {
                long j5 = i5 <= 6 ? 31 : 30;
                if (between < j5) {
                    break;
                }
                between -= j5;
                i5++;
            }
            return PersianCalendar.J0(i4, i5, (int) (between + 1));
        }

        @Override // net.time4j.calendar.h0
        long transform(PersianCalendar persianCalendar, net.time4j.tz.p pVar) {
            int o4 = persianCalendar.o();
            int value = persianCalendar.D0().getValue() / 7;
            return vernalEquinox(o4).b() + ((persianCalendar.t() + (((r0 - 1) * 31) - ((r0 - 7) * value))) - 1);
        }
    }
}
