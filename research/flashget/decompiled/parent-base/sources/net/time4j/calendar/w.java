package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: HijriAlgorithm.java */
/* loaded from: classes7.dex */
public enum w implements net.time4j.engine.q0 {
    EAST_ISLAMIC_CIVIL(ProtectedSandApp.s("銇\u0001"), new int[]{2, 5, 7, 10, 13, 15, 18, 21, 24, 26, 29}, true),
    EAST_ISLAMIC_ASTRO(ProtectedSandApp.s("銉\u0001"), new int[]{2, 5, 7, 10, 13, 15, 18, 21, 24, 26, 29}, false),
    WEST_ISLAMIC_CIVIL(ProtectedSandApp.s("銋\u0001"), new int[]{2, 5, 7, 10, 13, 16, 18, 21, 24, 26, 29}, true),
    WEST_ISLAMIC_ASTRO(ProtectedSandApp.s("銍\u0001"), new int[]{2, 5, 7, 10, 13, 16, 18, 21, 24, 26, 29}, false),
    FATIMID_CIVIL(ProtectedSandApp.s("銏\u0001"), new int[]{2, 5, 8, 10, 13, 16, 19, 21, 24, 27, 29}, true),
    FATIMID_ASTRO(ProtectedSandApp.s("銑\u0001"), new int[]{2, 5, 8, 10, 13, 16, 19, 21, 24, 27, 29}, false),
    HABASH_AL_HASIB_CIVIL(ProtectedSandApp.s("銓\u0001"), new int[]{2, 5, 8, 11, 13, 16, 19, 21, 24, 27, 30}, true),
    HABASH_AL_HASIB_ASTRO(ProtectedSandApp.s("銕\u0001"), new int[]{2, 5, 8, 11, 13, 16, 19, 21, 24, 27, 30}, false);

    private final transient a calsys;
    private static final long LENGTH_OF_30_YEAR_CYCLE = 10631;
    private static final long START_622_07_15 = -492879;
    private static final long START_622_07_16 = (-492879) + 1;
    private static final int MAX_YEAR = 1600;
    private static final long ASTRO_1600_12_29 = 74106;
    private static final long CIVIL_1600_12_29 = 74106 + 1;

    /* compiled from: HijriAlgorithm.java */
    private static class a implements o<HijriCalendar> {

        /* renamed from: a, reason: collision with root package name */
        private final String f82661a;

        /* renamed from: b, reason: collision with root package name */
        private final int[] f82662b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f82663c;

        /* renamed from: d, reason: collision with root package name */
        private final int f82664d;

        a(String str, int[] iArr, boolean z4, int i4) {
            this.f82661a = str;
            this.f82662b = iArr;
            this.f82663c = z4;
            this.f82664d = i4;
        }

        @Override // net.time4j.engine.l
        public List<net.time4j.engine.j> a() {
            return Collections.singletonList(y.ANNO_HEGIRAE);
        }

        @Override // net.time4j.calendar.o
        public int b(net.time4j.engine.j jVar, int i4, int i5) {
            if (jVar != y.ANNO_HEGIRAE) {
                throw new IllegalArgumentException(ProtectedSandApp.s("銂\u0001") + jVar);
            }
            if (i4 < 1 || i4 > w.MAX_YEAR || i5 < 1 || i5 > 12) {
                throw new IllegalArgumentException(androidx.compose.foundation.text.q.a(ProtectedSandApp.s("銀\u0001"), i4, ProtectedSandApp.s("銁\u0001"), i5));
            }
            if (i5 == 12) {
                return Arrays.binarySearch(this.f82662b, ((i4 - 1) % 30) + 1) >= 0 ? 30 : 29;
            }
            return i5 % 2 == 1 ? 30 : 29;
        }

        @Override // net.time4j.calendar.o
        public boolean c(net.time4j.engine.j jVar, int i4, int i5, int i6) {
            return jVar == y.ANNO_HEGIRAE && i4 >= 1 && i4 <= w.MAX_YEAR && i5 >= 1 && i5 <= 12 && i6 >= 1 && i6 <= b(jVar, i4, i5);
        }

        @Override // net.time4j.engine.l
        public long d() {
            return net.time4j.base.c.m(this.f82663c ? w.CIVIL_1600_12_29 : w.ASTRO_1600_12_29, this.f82664d);
        }

        @Override // net.time4j.engine.l
        public long g() {
            return net.time4j.base.c.m(this.f82663c ? w.START_622_07_16 : w.START_622_07_15, this.f82664d);
        }

        @Override // net.time4j.calendar.o
        public int h(net.time4j.engine.j jVar, int i4) {
            if (jVar != y.ANNO_HEGIRAE) {
                throw new IllegalArgumentException(ProtectedSandApp.s("銂\u0001") + jVar);
            }
            if (i4 < 1 || i4 > w.MAX_YEAR) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("銃\u0001"), i4));
            }
            return Arrays.binarySearch(this.f82662b, ((i4 - 1) % 30) + 1) >= 0 ? 355 : 354;
        }

        @Override // net.time4j.engine.l
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public long f(HijriCalendar hijriCalendar) {
            int o4 = hijriCalendar.o();
            int value = hijriCalendar.t0().getValue();
            int t4 = hijriCalendar.t();
            if (o4 < 1 || o4 > w.MAX_YEAR || value < 1 || value > 12 || t4 < 1 || t4 > 30) {
                throw new IllegalArgumentException(ProtectedSandApp.s("銅\u0001") + hijriCalendar);
            }
            long j4 = (r0 / 30) * w.LENGTH_OF_30_YEAR_CYCLE;
            int i4 = ((o4 - 1) % 30) + 1;
            for (int i5 = 1; i5 < i4; i5++) {
                j4 += Arrays.binarySearch(this.f82662b, i5) >= 0 ? 355L : 354L;
            }
            for (int i6 = 1; i6 < value; i6++) {
                j4 += i6 % 2 == 0 ? 29L : 30L;
            }
            if (t4 != 30 || ((value != 12 || Arrays.binarySearch(this.f82662b, i4) >= 0) && (value == 12 || value % 2 != 0))) {
                return net.time4j.base.c.m(((this.f82663c ? w.START_622_07_16 : w.START_622_07_15) + (j4 + t4)) - 1, this.f82664d);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("銄\u0001") + hijriCalendar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
        
            if (java.util.Arrays.binarySearch(r7.f82662b, ((r0 - 1) % 30) + 1) >= 0) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
        
            r2 = 29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
        
            if (r8 <= r2) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
        
            r3 = r3 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
        
            if (r3 <= 12) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
        
            r0 = r0 + 1;
            r8 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x009b, code lost:
        
            return net.time4j.calendar.HijriCalendar.E0(r7.f82661a, r0, r1, r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0093, code lost:
        
            r8 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0094, code lost:
        
            r1 = r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0087, code lost:
        
            if ((r3 % 2) == 1) goto L40;
         */
        @Override // net.time4j.engine.l
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public net.time4j.calendar.HijriCalendar e(long r8) {
            /*
                r7 = this;
                int r0 = r7.f82664d
                long r0 = (long) r0
                long r0 = net.time4j.base.c.f(r8, r0)
                boolean r2 = r7.f82663c
                if (r2 == 0) goto L10
                long r2 = net.time4j.calendar.w.access$400()
                goto L14
            L10:
                long r2 = net.time4j.calendar.w.access$500()
            L14:
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 < 0) goto L9c
                boolean r4 = r7.f82663c
                if (r4 == 0) goto L21
                long r4 = net.time4j.calendar.w.access$600()
                goto L25
            L21:
                long r4 = net.time4j.calendar.w.access$700()
            L25:
                int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r4 > 0) goto L9c
                long r8 = net.time4j.base.c.m(r0, r2)
                long r0 = net.time4j.calendar.w.access$800()
                long r0 = r8 / r0
                r2 = 30
                long r0 = r0 * r2
                int r0 = net.time4j.base.c.g(r0)
                r1 = 1
                int r0 = r0 + r1
                long r2 = net.time4j.calendar.w.access$800()
                long r8 = r8 % r2
                int r8 = (int) r8
                r9 = r1
            L43:
                r2 = 30
                if (r9 >= r2) goto L5c
                int[] r3 = r7.f82662b
                int r3 = java.util.Arrays.binarySearch(r3, r9)
                if (r3 < 0) goto L52
                r3 = 355(0x163, float:4.97E-43)
                goto L54
            L52:
                r3 = 354(0x162, float:4.96E-43)
            L54:
                if (r8 <= r3) goto L5c
                int r8 = r8 - r3
                int r0 = r0 + 1
                int r9 = r9 + 1
                goto L43
            L5c:
                r9 = r1
                r3 = r9
            L5e:
                r4 = 29
                r5 = 12
                if (r9 >= r5) goto L73
                int r6 = r9 % 2
                if (r6 != 0) goto L6a
                r6 = r4
                goto L6b
            L6a:
                r6 = r2
            L6b:
                if (r8 <= r6) goto L73
                int r8 = r8 - r6
                int r3 = r3 + 1
                int r9 = r9 + 1
                goto L5e
            L73:
                int r8 = r8 + r1
                if (r3 != r5) goto L85
                int r9 = r0 + (-1)
                int r9 = r9 % r2
                int r9 = r9 + r1
                int[] r6 = r7.f82662b
                int r9 = java.util.Arrays.binarySearch(r6, r9)
                if (r9 < 0) goto L83
                goto L89
            L83:
                r2 = r4
                goto L89
            L85:
                int r9 = r3 % 2
                if (r9 != r1) goto L83
            L89:
                if (r8 <= r2) goto L94
                int r3 = r3 + 1
                if (r3 <= r5) goto L93
                int r0 = r0 + 1
                r8 = r1
                goto L95
            L93:
                r8 = r1
            L94:
                r1 = r3
            L95:
                java.lang.String r9 = r7.f82661a
                net.time4j.calendar.HijriCalendar r8 = net.time4j.calendar.HijriCalendar.E0(r9, r0, r1, r8)
                return r8
            L9c:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "銅\u0001"
                java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
                java.lang.String r8 = androidx.collection.p0.a(r1, r8)
                r0.<init>(r8)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: net.time4j.calendar.w.a.e(long):net.time4j.calendar.HijriCalendar");
        }
    }

    w(String str, int[] iArr, boolean z4) {
        this.calsys = new a(str, iArr, z4, 0);
    }

    o<HijriCalendar> getCalendarSystem(int i4) {
        return i4 == 0 ? this.calsys : new a(v.d(getVariant(), i4).getVariant(), this.calsys.f82662b, this.calsys.f82663c, i4);
    }

    @Override // net.time4j.engine.q0
    public String getVariant() {
        return this.calsys.f82661a;
    }
}
