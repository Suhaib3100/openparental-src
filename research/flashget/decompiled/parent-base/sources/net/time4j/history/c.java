package net.time4j.history;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CalendarAlgorithm.java */
/* loaded from: classes7.dex */
abstract class c implements net.time4j.history.b {
    private static final /* synthetic */ c[] $VALUES;
    public static final c GREGORIAN;
    public static final c JULIAN;
    public static final c SWEDISH;

    /* compiled from: CalendarAlgorithm.java */
    enum a extends c {
        a(String str, int i4) {
            super(str, i4, null);
        }

        @Override // net.time4j.history.b
        public h fromMJD(long j4) {
            long l4 = net.time4j.base.b.l(j4);
            int i4 = (int) (l4 >> 32);
            int h4 = net.time4j.base.b.h(l4);
            int i5 = (int) (l4 & 255);
            j jVar = i4 <= 0 ? j.BC : j.AD;
            if (i4 <= 0) {
                i4 = 1 - i4;
            }
            return new h(jVar, i4, h4, i5);
        }

        @Override // net.time4j.history.b
        public int getMaximumDayOfMonth(h hVar) {
            return net.time4j.base.b.d(c.getProlepticYear(hVar), hVar.d());
        }

        @Override // net.time4j.history.b
        public boolean isValid(h hVar) {
            return net.time4j.base.b.f(c.getProlepticYear(hVar), hVar.d(), hVar.b());
        }

        @Override // net.time4j.history.b
        public long toMJD(h hVar) {
            return net.time4j.base.b.j(c.getProlepticYear(hVar), hVar.d(), hVar.b());
        }
    }

    static {
        a aVar = new a(ProtectedSandApp.s("阫\u0001"), 0);
        GREGORIAN = aVar;
        c cVar = new c(ProtectedSandApp.s("阬\u0001"), 1) { // from class: net.time4j.history.c.b
            {
                a aVar2 = null;
            }

            @Override // net.time4j.history.b
            public h fromMJD(long j4) {
                long i4 = m.i(j4);
                int i5 = (int) (i4 >> 32);
                int f4 = m.f(i4);
                int i6 = (int) (i4 & 255);
                j jVar = i5 <= 0 ? j.BC : j.AD;
                if (i5 <= 0) {
                    i5 = 1 - i5;
                }
                return new h(jVar, i5, f4, i6);
            }

            @Override // net.time4j.history.b
            public int getMaximumDayOfMonth(h hVar) {
                return m.b(c.getProlepticYear(hVar), hVar.d());
            }

            @Override // net.time4j.history.b
            public boolean isValid(h hVar) {
                return m.d(c.getProlepticYear(hVar), hVar.d(), hVar.b());
            }

            @Override // net.time4j.history.b
            public long toMJD(h hVar) {
                return m.h(c.getProlepticYear(hVar), hVar.d(), hVar.b());
            }
        };
        JULIAN = cVar;
        c cVar2 = new c(ProtectedSandApp.s("阭\u0001"), 2) { // from class: net.time4j.history.c.c
            {
                a aVar2 = null;
            }

            @Override // net.time4j.history.b
            public h fromMJD(long j4) {
                return j4 == -53576 ? new h(j.AD, 1712, 2, 30) : c.JULIAN.fromMJD(j4 + 1);
            }

            @Override // net.time4j.history.b
            public int getMaximumDayOfMonth(h hVar) {
                int prolepticYear = c.getProlepticYear(hVar);
                if (hVar.d() == 2 && prolepticYear == 1712) {
                    return 30;
                }
                return m.b(prolepticYear, hVar.d());
            }

            @Override // net.time4j.history.b
            public boolean isValid(h hVar) {
                int prolepticYear = c.getProlepticYear(hVar);
                if (hVar.b() == 30 && hVar.d() == 2 && prolepticYear == 1712) {
                    return true;
                }
                return m.d(prolepticYear, hVar.d(), hVar.b());
            }

            @Override // net.time4j.history.b
            public long toMJD(h hVar) {
                int prolepticYear = c.getProlepticYear(hVar);
                if (hVar.b() == 30 && hVar.d() == 2 && prolepticYear == 1712) {
                    return -53576L;
                }
                return m.h(prolepticYear, hVar.d(), hVar.b()) - 1;
            }
        };
        SWEDISH = cVar2;
        $VALUES = new c[]{aVar, cVar, cVar2};
    }

    private c(String str, int i4) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getProlepticYear(h hVar) {
        return hVar.c().annoDomini(hVar.e());
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    /* synthetic */ c(String str, int i4, a aVar) {
        this(str, i4);
    }
}
