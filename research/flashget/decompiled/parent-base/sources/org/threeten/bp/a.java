package org.threeten.bp;

import java.io.Serializable;

/* compiled from: Clock.java */
/* loaded from: classes9.dex */
public abstract class a {

    /* compiled from: Clock.java */
    /* renamed from: org.threeten.bp.a$a, reason: collision with other inner class name */
    static final class C1365a extends a implements Serializable {

        /* renamed from: d, reason: collision with root package name */
        private static final long f87933d = 7430389292664866958L;

        /* renamed from: b, reason: collision with root package name */
        private final f f87934b;

        /* renamed from: c, reason: collision with root package name */
        private final r f87935c;

        C1365a(f fVar, r rVar) {
            this.f87934b = fVar;
            this.f87935c = rVar;
        }

        @Override // org.threeten.bp.a
        public r b() {
            return this.f87935c;
        }

        @Override // org.threeten.bp.a
        public f c() {
            return this.f87934b;
        }

        @Override // org.threeten.bp.a
        public long d() {
            return this.f87934b.W();
        }

        @Override // org.threeten.bp.a
        public boolean equals(Object obj) {
            if (!(obj instanceof C1365a)) {
                return false;
            }
            C1365a c1365a = (C1365a) obj;
            return this.f87934b.equals(c1365a.f87934b) && this.f87935c.equals(c1365a.f87935c);
        }

        @Override // org.threeten.bp.a
        public int hashCode() {
            return this.f87934b.hashCode() ^ this.f87935c.hashCode();
        }

        @Override // org.threeten.bp.a
        public a l(r rVar) {
            return rVar.equals(this.f87935c) ? this : new C1365a(this.f87934b, rVar);
        }

        public String toString() {
            return "FixedClock[" + this.f87934b + "," + this.f87935c + "]";
        }
    }

    /* compiled from: Clock.java */
    static final class b extends a implements Serializable {

        /* renamed from: d, reason: collision with root package name */
        private static final long f87936d = 2007484719125426256L;

        /* renamed from: b, reason: collision with root package name */
        private final a f87937b;

        /* renamed from: c, reason: collision with root package name */
        private final e f87938c;

        b(a aVar, e eVar) {
            this.f87937b = aVar;
            this.f87938c = eVar;
        }

        @Override // org.threeten.bp.a
        public r b() {
            return this.f87937b.b();
        }

        @Override // org.threeten.bp.a
        public f c() {
            f c5 = this.f87937b.c();
            e eVar = this.f87938c;
            c5.getClass();
            return (f) eVar.b(c5);
        }

        @Override // org.threeten.bp.a
        public long d() {
            return ng.d.l(this.f87937b.d(), this.f87938c.e0());
        }

        @Override // org.threeten.bp.a
        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f87937b.equals(bVar.f87937b) && this.f87938c.equals(bVar.f87938c);
        }

        @Override // org.threeten.bp.a
        public int hashCode() {
            return this.f87937b.hashCode() ^ this.f87938c.hashCode();
        }

        @Override // org.threeten.bp.a
        public a l(r rVar) {
            return rVar.equals(this.f87937b.b()) ? this : new b(this.f87937b.l(rVar), this.f87938c);
        }

        public String toString() {
            return "OffsetClock[" + this.f87937b + "," + this.f87938c + "]";
        }
    }

    /* compiled from: Clock.java */
    static final class c extends a implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final long f87939c = 6740630888130243051L;

        /* renamed from: b, reason: collision with root package name */
        private final r f87940b;

        c(r rVar) {
            this.f87940b = rVar;
        }

        @Override // org.threeten.bp.a
        public r b() {
            return this.f87940b;
        }

        @Override // org.threeten.bp.a
        public f c() {
            return f.E(System.currentTimeMillis());
        }

        @Override // org.threeten.bp.a
        public long d() {
            return System.currentTimeMillis();
        }

        @Override // org.threeten.bp.a
        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return this.f87940b.equals(((c) obj).f87940b);
            }
            return false;
        }

        @Override // org.threeten.bp.a
        public int hashCode() {
            return this.f87940b.hashCode() + 1;
        }

        @Override // org.threeten.bp.a
        public a l(r rVar) {
            return rVar.equals(this.f87940b) ? this : new c(rVar);
        }

        public String toString() {
            return "SystemClock[" + this.f87940b + "]";
        }
    }

    /* compiled from: Clock.java */
    static final class d extends a implements Serializable {

        /* renamed from: d, reason: collision with root package name */
        private static final long f87941d = 6504659149906368850L;

        /* renamed from: b, reason: collision with root package name */
        private final a f87942b;

        /* renamed from: c, reason: collision with root package name */
        private final long f87943c;

        d(a aVar, long j4) {
            this.f87942b = aVar;
            this.f87943c = j4;
        }

        @Override // org.threeten.bp.a
        public r b() {
            return this.f87942b.b();
        }

        @Override // org.threeten.bp.a
        public f c() {
            if (this.f87943c % 1000000 == 0) {
                long d5 = this.f87942b.d();
                return f.E(d5 - ng.d.h(d5, this.f87943c / 1000000));
            }
            return this.f87942b.c().y(ng.d.h(r0.r(), this.f87943c));
        }

        @Override // org.threeten.bp.a
        public long d() {
            long d5 = this.f87942b.d();
            return d5 - ng.d.h(d5, this.f87943c / 1000000);
        }

        @Override // org.threeten.bp.a
        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f87942b.equals(dVar.f87942b) && this.f87943c == dVar.f87943c;
        }

        @Override // org.threeten.bp.a
        public int hashCode() {
            int hashCode = this.f87942b.hashCode();
            long j4 = this.f87943c;
            return hashCode ^ ((int) (j4 ^ (j4 >>> 32)));
        }

        @Override // org.threeten.bp.a
        public a l(r rVar) {
            return rVar.equals(this.f87942b.b()) ? this : new d(this.f87942b.l(rVar), this.f87943c);
        }

        public String toString() {
            return "TickClock[" + this.f87942b + "," + e.J(this.f87943c) + "]";
        }
    }

    protected a() {
    }

    public static a a(f fVar, r rVar) {
        ng.d.j(fVar, "fixedInstant");
        ng.d.j(rVar, "zone");
        return new C1365a(fVar, rVar);
    }

    public static a e(a aVar, e eVar) {
        ng.d.j(aVar, "baseClock");
        ng.d.j(eVar, "offsetDuration");
        return eVar.equals(e.f88068d) ? aVar : new b(aVar, eVar);
    }

    public static a f(r rVar) {
        ng.d.j(rVar, "zone");
        return new c(rVar);
    }

    public static a g() {
        return new c(r.q());
    }

    public static a h() {
        return new c(s.f88337o);
    }

    public static a i(a aVar, e eVar) {
        ng.d.j(aVar, "baseClock");
        ng.d.j(eVar, "tickDuration");
        if (eVar.o()) {
            throw new IllegalArgumentException("Tick duration must not be negative");
        }
        long i02 = eVar.i0();
        if (i02 % 1000000 == 0 || 1000000000 % i02 == 0) {
            return i02 <= 1 ? aVar : new d(aVar, i02);
        }
        throw new IllegalArgumentException("Invalid tick duration");
    }

    public static a j(r rVar) {
        return new d(f(rVar), 60000000000L);
    }

    public static a k(r rVar) {
        return new d(f(rVar), 1000000000L);
    }

    public abstract r b();

    public abstract f c();

    public long d() {
        return c().W();
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public abstract a l(r rVar);
}
