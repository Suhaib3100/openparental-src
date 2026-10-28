package org.threeten.bp.chrono;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* compiled from: MinguoDate.java */
/* loaded from: classes9.dex */
public final class u extends b<u> implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    private static final long f88044e = 1300372329181994526L;

    /* renamed from: d, reason: collision with root package name */
    private final org.threeten.bp.g f88045d;

    /* compiled from: MinguoDate.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f88046a;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.a.values().length];
            f88046a = iArr;
            try {
                iArr[org.threeten.bp.temporal.a.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88046a[org.threeten.bp.temporal.a.DAY_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f88046a[org.threeten.bp.temporal.a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f88046a[org.threeten.bp.temporal.a.YEAR_OF_ERA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f88046a[org.threeten.bp.temporal.a.PROLEPTIC_MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f88046a[org.threeten.bp.temporal.a.YEAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f88046a[org.threeten.bp.temporal.a.ERA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    u(org.threeten.bp.g gVar) {
        ng.d.j(gVar, "date");
        this.f88045d = gVar;
    }

    public static u Y(org.threeten.bp.temporal.f fVar) {
        return t.f88040f.d(fVar);
    }

    private long b0() {
        return ((c0() * 12) + this.f88045d.g0()) - 1;
    }

    private int c0() {
        return this.f88045d.i0() - 1911;
    }

    public static u f0() {
        return g0(org.threeten.bp.a.g());
    }

    public static u g0(org.threeten.bp.a aVar) {
        return new u(org.threeten.bp.g.v0(aVar));
    }

    public static u h0(org.threeten.bp.r rVar) {
        return g0(org.threeten.bp.a.f(rVar));
    }

    public static u i0(int i4, int i5, int i6) {
        return t.f88040f.b(i4, i5, i6);
    }

    static c s0(DataInput dataInput) throws IOException {
        return t.f88040f.b(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    private u t0(org.threeten.bp.g gVar) {
        return gVar.equals(this.f88045d) ? this : new u(gVar);
    }

    private Object writeReplace() {
        return new w((byte) 5, this);
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.chrono.c
    /* renamed from: A */
    public c v(long j4, org.threeten.bp.temporal.m mVar) {
        return (u) super.v(j4, mVar);
    }

    @Override // org.threeten.bp.chrono.c
    /* renamed from: B */
    public c g(org.threeten.bp.temporal.i iVar) {
        return (u) super.g(iVar);
    }

    @Override // org.threeten.bp.chrono.c
    public long E() {
        return this.f88045d.E();
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.chrono.c
    public f G(c cVar) {
        org.threeten.bp.n G = this.f88045d.G(cVar);
        t tVar = t.f88040f;
        int s4 = G.s();
        int r4 = G.r();
        int q4 = G.q();
        tVar.getClass();
        return new g(tVar, s4, r4, q4);
    }

    @Override // org.threeten.bp.chrono.c
    /* renamed from: J */
    public c i(org.threeten.bp.temporal.g gVar) {
        return (u) super.i(gVar);
    }

    @Override // org.threeten.bp.chrono.b
    /* renamed from: S */
    public b<u> v(long j4, org.threeten.bp.temporal.m mVar) {
        return (u) super.v(j4, mVar);
    }

    public t Z() {
        return t.f88040f;
    }

    public v a0() {
        return (v) super.q();
    }

    @Override // org.threeten.bp.chrono.c, ng.b, org.threeten.bp.temporal.e
    public org.threeten.bp.temporal.e c(org.threeten.bp.temporal.i iVar) {
        return (u) super.c(iVar);
    }

    public u d0(long j4, org.threeten.bp.temporal.m mVar) {
        return (u) super.t(j4, mVar);
    }

    @Override // org.threeten.bp.chrono.c, ng.b, org.threeten.bp.temporal.e
    /* renamed from: e */
    public org.threeten.bp.temporal.e t(long j4, org.threeten.bp.temporal.m mVar) {
        return (u) super.t(j4, mVar);
    }

    public u e0(org.threeten.bp.temporal.i iVar) {
        return (u) super.c(iVar);
    }

    @Override // org.threeten.bp.chrono.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return this.f88045d.equals(((u) obj).f88045d);
        }
        return false;
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.temporal.e
    public /* bridge */ /* synthetic */ long f(org.threeten.bp.temporal.e eVar, org.threeten.bp.temporal.m mVar) {
        return super.f(eVar, mVar);
    }

    @Override // org.threeten.bp.chrono.c, ng.b, org.threeten.bp.temporal.e
    public org.threeten.bp.temporal.e g(org.threeten.bp.temporal.i iVar) {
        return (u) super.g(iVar);
    }

    @Override // org.threeten.bp.temporal.f
    public long getLong(org.threeten.bp.temporal.j jVar) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.getFrom(this);
        }
        int i4 = a.f88046a[((org.threeten.bp.temporal.a) jVar).ordinal()];
        if (i4 == 4) {
            int c02 = c0();
            if (c02 < 1) {
                c02 = 1 - c02;
            }
            return c02;
        }
        if (i4 == 5) {
            return b0();
        }
        if (i4 == 6) {
            return c0();
        }
        if (i4 != 7) {
            return this.f88045d.getLong(jVar);
        }
        return c0() < 1 ? 0 : 1;
    }

    @Override // org.threeten.bp.chrono.c
    public int hashCode() {
        t.f88040f.getClass();
        return this.f88045d.hashCode() ^ (-1990173233);
    }

    @Override // org.threeten.bp.chrono.c, ng.b, org.threeten.bp.temporal.e
    public org.threeten.bp.temporal.e i(org.threeten.bp.temporal.g gVar) {
        return (u) super.i(gVar);
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.chrono.c, org.threeten.bp.temporal.e
    /* renamed from: k */
    public org.threeten.bp.temporal.e v(long j4, org.threeten.bp.temporal.m mVar) {
        return (u) super.v(j4, mVar);
    }

    public u k0(long j4, org.threeten.bp.temporal.m mVar) {
        return (u) super.v(j4, mVar);
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.chrono.c
    public final d<u> l(org.threeten.bp.i iVar) {
        return e.J(this, iVar);
    }

    public u l0(org.threeten.bp.temporal.i iVar) {
        return (u) super.g(iVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.bp.chrono.b
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public u T(long j4) {
        return t0(this.f88045d.F0(j4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.bp.chrono.b
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public u U(long j4) {
        return t0(this.f88045d.G0(j4));
    }

    @Override // org.threeten.bp.chrono.c
    public j p() {
        return t.f88040f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.bp.chrono.b
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public u W(long j4) {
        return t0(this.f88045d.I0(j4));
    }

    @Override // org.threeten.bp.chrono.c
    public k q() {
        return (v) super.q();
    }

    @Override // ng.c, org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.n range(org.threeten.bp.temporal.j jVar) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.rangeRefinedBy(this);
        }
        if (!isSupported(jVar)) {
            throw new UnsupportedTemporalTypeException(org.threeten.bp.c.a("Unsupported field: ", jVar));
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) jVar;
        int i4 = a.f88046a[aVar.ordinal()];
        if (i4 == 1 || i4 == 2 || i4 == 3) {
            return this.f88045d.range(jVar);
        }
        if (i4 != 4) {
            return t.f88040f.B(aVar);
        }
        org.threeten.bp.temporal.n range = org.threeten.bp.temporal.a.YEAR.range();
        return org.threeten.bp.temporal.n.k(1L, c0() <= 0 ? (-range.e()) + 1912 : range.d() - 1911);
    }

    public u u0(org.threeten.bp.temporal.g gVar) {
        return (u) super.i(gVar);
    }

    @Override // org.threeten.bp.chrono.c
    public int v() {
        return this.f88045d.v();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if (r2 != 7) goto L20;
     */
    @Override // org.threeten.bp.chrono.c, org.threeten.bp.temporal.e
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.threeten.bp.chrono.u b(org.threeten.bp.temporal.j r8, long r9) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof org.threeten.bp.temporal.a
            if (r0 == 0) goto L8e
            r0 = r8
            org.threeten.bp.temporal.a r0 = (org.threeten.bp.temporal.a) r0
            long r1 = r7.getLong(r0)
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 != 0) goto L10
            return r7
        L10:
            int[] r1 = org.threeten.bp.chrono.u.a.f88046a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            r3 = 7
            r4 = 6
            r5 = 4
            if (r2 == r5) goto L38
            r6 = 5
            if (r2 == r6) goto L25
            if (r2 == r4) goto L38
            if (r2 == r3) goto L38
            goto L4e
        L25:
            org.threeten.bp.chrono.t r8 = org.threeten.bp.chrono.t.f88040f
            org.threeten.bp.temporal.n r8 = r8.B(r0)
            r8.b(r9, r0)
            long r0 = r7.b0()
            long r9 = r9 - r0
            org.threeten.bp.chrono.u r8 = r7.U(r9)
            return r8
        L38:
            org.threeten.bp.chrono.t r2 = org.threeten.bp.chrono.t.f88040f
            org.threeten.bp.temporal.n r2 = r2.B(r0)
            int r2 = r2.a(r9, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r5) goto L77
            if (r0 == r4) goto L6a
            if (r0 == r3) goto L59
        L4e:
            org.threeten.bp.g r0 = r7.f88045d
            org.threeten.bp.g r8 = r0.K(r8, r9)
            org.threeten.bp.chrono.u r8 = r7.t0(r8)
            return r8
        L59:
            org.threeten.bp.g r8 = r7.f88045d
            int r9 = r7.c0()
            int r9 = 1912 - r9
            org.threeten.bp.g r8 = r8.U0(r9)
            org.threeten.bp.chrono.u r8 = r7.t0(r8)
            return r8
        L6a:
            org.threeten.bp.g r8 = r7.f88045d
            int r2 = r2 + 1911
            org.threeten.bp.g r8 = r8.U0(r2)
            org.threeten.bp.chrono.u r8 = r7.t0(r8)
            return r8
        L77:
            org.threeten.bp.g r8 = r7.f88045d
            int r9 = r7.c0()
            r10 = 1
            if (r9 < r10) goto L83
            int r2 = r2 + 1911
            goto L85
        L83:
            int r2 = 1912 - r2
        L85:
            org.threeten.bp.g r8 = r8.U0(r2)
            org.threeten.bp.chrono.u r8 = r7.t0(r8)
            return r8
        L8e:
            org.threeten.bp.temporal.e r8 = r8.adjustInto(r7, r9)
            org.threeten.bp.chrono.u r8 = (org.threeten.bp.chrono.u) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.chrono.u.b(org.threeten.bp.temporal.j, long):org.threeten.bp.chrono.u");
    }

    void w0(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(get(org.threeten.bp.temporal.a.YEAR));
        dataOutput.writeByte(get(org.threeten.bp.temporal.a.MONTH_OF_YEAR));
        dataOutput.writeByte(get(org.threeten.bp.temporal.a.DAY_OF_MONTH));
    }

    @Override // org.threeten.bp.chrono.c
    /* renamed from: y */
    public c t(long j4, org.threeten.bp.temporal.m mVar) {
        return (u) super.t(j4, mVar);
    }

    @Override // org.threeten.bp.chrono.c
    /* renamed from: z */
    public c c(org.threeten.bp.temporal.i iVar) {
        return (u) super.c(iVar);
    }
}
