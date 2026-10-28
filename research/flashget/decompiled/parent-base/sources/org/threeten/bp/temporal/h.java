package org.threeten.bp.temporal;

/* compiled from: TemporalAdjusters.java */
/* loaded from: classes9.dex */
public final class h {

    /* compiled from: TemporalAdjusters.java */
    private static final class b implements g {

        /* renamed from: b, reason: collision with root package name */
        private final int f88357b;

        /* renamed from: c, reason: collision with root package name */
        private final int f88358c;

        @Override // org.threeten.bp.temporal.g
        public e adjustInto(e eVar) {
            if (this.f88357b >= 0) {
                return eVar.b(org.threeten.bp.temporal.a.DAY_OF_MONTH, 1L).v(((this.f88357b - 1) * 7) + (((this.f88358c - r10.get(org.threeten.bp.temporal.a.DAY_OF_WEEK)) + 7) % 7), org.threeten.bp.temporal.b.DAYS);
            }
            org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.DAY_OF_MONTH;
            e b5 = eVar.b(aVar, eVar.range(aVar).d());
            long j4 = this.f88358c - b5.get(org.threeten.bp.temporal.a.DAY_OF_WEEK);
            if (j4 == 0) {
                j4 = 0;
            } else if (j4 > 0) {
                j4 -= 7;
            }
            return b5.v(j4 - (((-this.f88357b) - 1) * 7), org.threeten.bp.temporal.b.DAYS);
        }

        private b(int i4, org.threeten.bp.d dVar) {
            this.f88357b = i4;
            this.f88358c = dVar.getValue();
        }
    }

    /* compiled from: TemporalAdjusters.java */
    private static class c implements g {

        /* renamed from: c, reason: collision with root package name */
        private static final c f88359c = new c(0);

        /* renamed from: d, reason: collision with root package name */
        private static final c f88360d = new c(1);

        /* renamed from: e, reason: collision with root package name */
        private static final c f88361e = new c(2);

        /* renamed from: f, reason: collision with root package name */
        private static final c f88362f = new c(3);

        /* renamed from: g, reason: collision with root package name */
        private static final c f88363g = new c(4);

        /* renamed from: h, reason: collision with root package name */
        private static final c f88364h = new c(5);

        /* renamed from: b, reason: collision with root package name */
        private final int f88365b;

        private c(int i4) {
            this.f88365b = i4;
        }

        @Override // org.threeten.bp.temporal.g
        public e adjustInto(e eVar) {
            int i4 = this.f88365b;
            if (i4 == 0) {
                return eVar.b(org.threeten.bp.temporal.a.DAY_OF_MONTH, 1L);
            }
            if (i4 == 1) {
                org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.DAY_OF_MONTH;
                return eVar.b(aVar, eVar.range(aVar).d());
            }
            if (i4 == 2) {
                return eVar.b(org.threeten.bp.temporal.a.DAY_OF_MONTH, 1L).v(1L, org.threeten.bp.temporal.b.MONTHS);
            }
            if (i4 == 3) {
                return eVar.b(org.threeten.bp.temporal.a.DAY_OF_YEAR, 1L);
            }
            if (i4 == 4) {
                org.threeten.bp.temporal.a aVar2 = org.threeten.bp.temporal.a.DAY_OF_YEAR;
                return eVar.b(aVar2, eVar.range(aVar2).d());
            }
            if (i4 == 5) {
                return eVar.b(org.threeten.bp.temporal.a.DAY_OF_YEAR, 1L).v(1L, org.threeten.bp.temporal.b.YEARS);
            }
            throw new IllegalStateException("Unreachable");
        }
    }

    /* compiled from: TemporalAdjusters.java */
    private static final class d implements g {

        /* renamed from: b, reason: collision with root package name */
        private final int f88366b;

        /* renamed from: c, reason: collision with root package name */
        private final int f88367c;

        @Override // org.threeten.bp.temporal.g
        public e adjustInto(e eVar) {
            int i4 = eVar.get(org.threeten.bp.temporal.a.DAY_OF_WEEK);
            int i5 = this.f88366b;
            if (i5 < 2 && i4 == this.f88367c) {
                return eVar;
            }
            if ((i5 & 1) == 0) {
                return eVar.v(i4 - this.f88367c >= 0 ? 7 - r0 : -r0, org.threeten.bp.temporal.b.DAYS);
            }
            return eVar.t(this.f88367c - i4 >= 0 ? 7 - r1 : -r1, org.threeten.bp.temporal.b.DAYS);
        }

        private d(int i4, org.threeten.bp.d dVar) {
            ng.d.j(dVar, "dayOfWeek");
            this.f88366b = i4;
            this.f88367c = dVar.getValue();
        }
    }

    private h() {
    }

    public static g a(int i4, org.threeten.bp.d dVar) {
        ng.d.j(dVar, "dayOfWeek");
        return new b(i4, dVar);
    }

    public static g b() {
        return c.f88359c;
    }

    public static g c() {
        return c.f88361e;
    }

    public static g d() {
        return c.f88364h;
    }

    public static g e() {
        return c.f88362f;
    }

    public static g f(org.threeten.bp.d dVar) {
        ng.d.j(dVar, "dayOfWeek");
        return new b(1, dVar);
    }

    public static g g() {
        return c.f88360d;
    }

    public static g h() {
        return c.f88363g;
    }

    public static g i(org.threeten.bp.d dVar) {
        ng.d.j(dVar, "dayOfWeek");
        return new b(-1, dVar);
    }

    public static g j(org.threeten.bp.d dVar) {
        return new d(2, dVar);
    }

    public static g k(org.threeten.bp.d dVar) {
        return new d(0, dVar);
    }

    public static g l(org.threeten.bp.d dVar) {
        return new d(3, dVar);
    }

    public static g m(org.threeten.bp.d dVar) {
        return new d(1, dVar);
    }
}
