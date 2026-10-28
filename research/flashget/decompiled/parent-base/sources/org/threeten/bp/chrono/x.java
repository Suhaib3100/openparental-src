package org.threeten.bp.chrono;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.threeten.bp.DateTimeException;

/* compiled from: ThaiBuddhistChronology.java */
/* loaded from: classes9.dex */
public final class x extends j implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final x f88061f = new x();

    /* renamed from: g, reason: collision with root package name */
    private static final long f88062g = 2775954514031616474L;

    /* renamed from: h, reason: collision with root package name */
    static final int f88063h = 543;

    /* compiled from: ThaiBuddhistChronology.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f88064a;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.a.values().length];
            f88064a = iArr;
            try {
                iArr[org.threeten.bp.temporal.a.PROLEPTIC_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88064a[org.threeten.bp.temporal.a.YEAR_OF_ERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f88064a[org.threeten.bp.temporal.a.YEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private x() {
    }

    private Object readResolve() {
        return f88061f;
    }

    @Override // org.threeten.bp.chrono.j
    public int A(k kVar, int i4) {
        if (kVar instanceof z) {
            return kVar == z.BE ? i4 : 1 - i4;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    @Override // org.threeten.bp.chrono.j
    public org.threeten.bp.temporal.n B(org.threeten.bp.temporal.a aVar) {
        int i4 = a.f88064a[aVar.ordinal()];
        if (i4 == 1) {
            org.threeten.bp.temporal.n range = org.threeten.bp.temporal.a.PROLEPTIC_MONTH.range();
            return org.threeten.bp.temporal.n.k(range.e() + 6516, range.d() + 6516);
        }
        if (i4 == 2) {
            org.threeten.bp.temporal.n range2 = org.threeten.bp.temporal.a.YEAR.range();
            return org.threeten.bp.temporal.n.m(1L, 1L, (-(range2.e() + 543)) + 1, range2.d() + 543);
        }
        if (i4 != 3) {
            return aVar.range();
        }
        org.threeten.bp.temporal.n range3 = org.threeten.bp.temporal.a.YEAR.range();
        return org.threeten.bp.temporal.n.k(range3.e() + 543, range3.d() + 543);
    }

    @Override // org.threeten.bp.chrono.j
    public h<y> L(org.threeten.bp.f fVar, org.threeten.bp.r rVar) {
        return i.U(this, fVar, rVar);
    }

    @Override // org.threeten.bp.chrono.j
    public h<y> M(org.threeten.bp.temporal.f fVar) {
        return super.M(fVar);
    }

    @Override // org.threeten.bp.chrono.j
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public y b(int i4, int i5, int i6) {
        return new y(org.threeten.bp.g.x0(i4 - 543, i5, i6));
    }

    public y P(k kVar, int i4, int i5, int i6) {
        return (y) super.c(kVar, i4, i5, i6);
    }

    @Override // org.threeten.bp.chrono.j
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public y d(org.threeten.bp.temporal.f fVar) {
        return fVar instanceof y ? (y) fVar : new y(org.threeten.bp.g.Z(fVar));
    }

    @Override // org.threeten.bp.chrono.j
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public y e(long j4) {
        return new y(org.threeten.bp.g.z0(j4));
    }

    public y S() {
        return (y) super.f();
    }

    @Override // org.threeten.bp.chrono.j
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public y g(org.threeten.bp.a aVar) {
        ng.d.j(aVar, "clock");
        return (y) super.g(aVar);
    }

    public y U(org.threeten.bp.r rVar) {
        return (y) super.h(rVar);
    }

    @Override // org.threeten.bp.chrono.j
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public y i(int i4, int i5) {
        return new y(org.threeten.bp.g.A0(i4 - 543, i5));
    }

    public y W(k kVar, int i4, int i5) {
        return (y) super.j(kVar, i4, i5);
    }

    public z X(int i4) {
        return z.of(i4);
    }

    @Override // org.threeten.bp.chrono.j
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public y G(Map<org.threeten.bp.temporal.j, Long> map, org.threeten.bp.format.j jVar) {
        org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.EPOCH_DAY;
        if (map.containsKey(aVar)) {
            return e(map.remove(aVar).longValue());
        }
        org.threeten.bp.temporal.a aVar2 = org.threeten.bp.temporal.a.PROLEPTIC_MONTH;
        Long remove = map.remove(aVar2);
        if (remove != null) {
            if (jVar != org.threeten.bp.format.j.LENIENT) {
                aVar2.checkValidValue(remove.longValue());
            }
            J(map, org.threeten.bp.temporal.a.MONTH_OF_YEAR, ng.d.g(remove.longValue(), 12) + 1);
            J(map, org.threeten.bp.temporal.a.YEAR, ng.d.e(remove.longValue(), 12L));
        }
        org.threeten.bp.temporal.a aVar3 = org.threeten.bp.temporal.a.YEAR_OF_ERA;
        Long remove2 = map.remove(aVar3);
        if (remove2 != null) {
            if (jVar != org.threeten.bp.format.j.LENIENT) {
                aVar3.checkValidValue(remove2.longValue());
            }
            Long remove3 = map.remove(org.threeten.bp.temporal.a.ERA);
            if (remove3 == null) {
                org.threeten.bp.temporal.a aVar4 = org.threeten.bp.temporal.a.YEAR;
                Long l4 = map.get(aVar4);
                if (jVar != org.threeten.bp.format.j.STRICT) {
                    J(map, aVar4, (l4 == null || l4.longValue() > 0) ? remove2.longValue() : ng.d.q(1L, remove2.longValue()));
                } else if (l4 != null) {
                    J(map, aVar4, l4.longValue() > 0 ? remove2.longValue() : ng.d.q(1L, remove2.longValue()));
                } else {
                    map.put(aVar3, remove2);
                }
            } else if (remove3.longValue() == 1) {
                J(map, org.threeten.bp.temporal.a.YEAR, remove2.longValue());
            } else {
                if (remove3.longValue() != 0) {
                    throw new DateTimeException("Invalid value for era: " + remove3);
                }
                J(map, org.threeten.bp.temporal.a.YEAR, ng.d.q(1L, remove2.longValue()));
            }
        } else {
            org.threeten.bp.temporal.a aVar5 = org.threeten.bp.temporal.a.ERA;
            if (map.containsKey(aVar5)) {
                aVar5.checkValidValue(map.get(aVar5).longValue());
            }
        }
        org.threeten.bp.temporal.a aVar6 = org.threeten.bp.temporal.a.YEAR;
        if (!map.containsKey(aVar6)) {
            return null;
        }
        org.threeten.bp.temporal.a aVar7 = org.threeten.bp.temporal.a.MONTH_OF_YEAR;
        if (map.containsKey(aVar7)) {
            org.threeten.bp.temporal.a aVar8 = org.threeten.bp.temporal.a.DAY_OF_MONTH;
            if (map.containsKey(aVar8)) {
                int checkValidIntValue = aVar6.checkValidIntValue(map.remove(aVar6).longValue());
                if (jVar == org.threeten.bp.format.j.LENIENT) {
                    return b(checkValidIntValue, 1, 1).U(ng.d.q(map.remove(aVar7).longValue(), 1L)).T(ng.d.q(map.remove(aVar8).longValue(), 1L));
                }
                int a5 = B(aVar7).a(map.remove(aVar7).longValue(), aVar7);
                int a6 = B(aVar8).a(map.remove(aVar8).longValue(), aVar8);
                if (jVar == org.threeten.bp.format.j.SMART && a6 > 28) {
                    a6 = Math.min(a6, b(checkValidIntValue, a5, 1).v());
                }
                return b(checkValidIntValue, a5, a6);
            }
            org.threeten.bp.temporal.a aVar9 = org.threeten.bp.temporal.a.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(aVar9)) {
                org.threeten.bp.temporal.a aVar10 = org.threeten.bp.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (map.containsKey(aVar10)) {
                    int checkValidIntValue2 = aVar6.checkValidIntValue(map.remove(aVar6).longValue());
                    if (jVar == org.threeten.bp.format.j.LENIENT) {
                        return b(checkValidIntValue2, 1, 1).k0(ng.d.q(map.remove(aVar7).longValue(), 1L), org.threeten.bp.temporal.b.MONTHS).k0(ng.d.q(map.remove(aVar9).longValue(), 1L), org.threeten.bp.temporal.b.WEEKS).k0(ng.d.q(map.remove(aVar10).longValue(), 1L), org.threeten.bp.temporal.b.DAYS);
                    }
                    int checkValidIntValue3 = aVar7.checkValidIntValue(map.remove(aVar7).longValue());
                    y k02 = b(checkValidIntValue2, checkValidIntValue3, 1).k0((aVar10.checkValidIntValue(map.remove(aVar10).longValue()) - 1) + ((aVar9.checkValidIntValue(map.remove(aVar9).longValue()) - 1) * 7), org.threeten.bp.temporal.b.DAYS);
                    if (jVar != org.threeten.bp.format.j.STRICT || k02.get(aVar7) == checkValidIntValue3) {
                        return k02;
                    }
                    throw new DateTimeException("Strict mode rejected date parsed to a different month");
                }
                org.threeten.bp.temporal.a aVar11 = org.threeten.bp.temporal.a.DAY_OF_WEEK;
                if (map.containsKey(aVar11)) {
                    int checkValidIntValue4 = aVar6.checkValidIntValue(map.remove(aVar6).longValue());
                    if (jVar == org.threeten.bp.format.j.LENIENT) {
                        return b(checkValidIntValue4, 1, 1).k0(ng.d.q(map.remove(aVar7).longValue(), 1L), org.threeten.bp.temporal.b.MONTHS).k0(ng.d.q(map.remove(aVar9).longValue(), 1L), org.threeten.bp.temporal.b.WEEKS).k0(ng.d.q(map.remove(aVar11).longValue(), 1L), org.threeten.bp.temporal.b.DAYS);
                    }
                    int checkValidIntValue5 = aVar7.checkValidIntValue(map.remove(aVar7).longValue());
                    y u02 = b(checkValidIntValue4, checkValidIntValue5, 1).k0(aVar9.checkValidIntValue(map.remove(aVar9).longValue()) - 1, org.threeten.bp.temporal.b.WEEKS).u0(org.threeten.bp.temporal.h.k(org.threeten.bp.d.of(aVar11.checkValidIntValue(map.remove(aVar11).longValue()))));
                    if (jVar != org.threeten.bp.format.j.STRICT || u02.get(aVar7) == checkValidIntValue5) {
                        return u02;
                    }
                    throw new DateTimeException("Strict mode rejected date parsed to a different month");
                }
            }
        }
        org.threeten.bp.temporal.a aVar12 = org.threeten.bp.temporal.a.DAY_OF_YEAR;
        if (map.containsKey(aVar12)) {
            int checkValidIntValue6 = aVar6.checkValidIntValue(map.remove(aVar6).longValue());
            if (jVar == org.threeten.bp.format.j.LENIENT) {
                return i(checkValidIntValue6, 1).T(ng.d.q(map.remove(aVar12).longValue(), 1L));
            }
            return i(checkValidIntValue6, aVar12.checkValidIntValue(map.remove(aVar12).longValue()));
        }
        org.threeten.bp.temporal.a aVar13 = org.threeten.bp.temporal.a.ALIGNED_WEEK_OF_YEAR;
        if (!map.containsKey(aVar13)) {
            return null;
        }
        org.threeten.bp.temporal.a aVar14 = org.threeten.bp.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        if (map.containsKey(aVar14)) {
            int checkValidIntValue7 = aVar6.checkValidIntValue(map.remove(aVar6).longValue());
            if (jVar == org.threeten.bp.format.j.LENIENT) {
                return b(checkValidIntValue7, 1, 1).k0(ng.d.q(map.remove(aVar13).longValue(), 1L), org.threeten.bp.temporal.b.WEEKS).k0(ng.d.q(map.remove(aVar14).longValue(), 1L), org.threeten.bp.temporal.b.DAYS);
            }
            y T = b(checkValidIntValue7, 1, 1).T((aVar14.checkValidIntValue(map.remove(aVar14).longValue()) - 1) + ((aVar13.checkValidIntValue(map.remove(aVar13).longValue()) - 1) * 7));
            if (jVar != org.threeten.bp.format.j.STRICT || T.get(aVar6) == checkValidIntValue7) {
                return T;
            }
            throw new DateTimeException("Strict mode rejected date parsed to a different year");
        }
        org.threeten.bp.temporal.a aVar15 = org.threeten.bp.temporal.a.DAY_OF_WEEK;
        if (!map.containsKey(aVar15)) {
            return null;
        }
        int checkValidIntValue8 = aVar6.checkValidIntValue(map.remove(aVar6).longValue());
        if (jVar == org.threeten.bp.format.j.LENIENT) {
            return b(checkValidIntValue8, 1, 1).k0(ng.d.q(map.remove(aVar13).longValue(), 1L), org.threeten.bp.temporal.b.WEEKS).k0(ng.d.q(map.remove(aVar15).longValue(), 1L), org.threeten.bp.temporal.b.DAYS);
        }
        y u03 = b(checkValidIntValue8, 1, 1).k0(aVar13.checkValidIntValue(map.remove(aVar13).longValue()) - 1, org.threeten.bp.temporal.b.WEEKS).u0(org.threeten.bp.temporal.h.k(org.threeten.bp.d.of(aVar15.checkValidIntValue(map.remove(aVar15).longValue()))));
        if (jVar != org.threeten.bp.format.j.STRICT || u03.get(aVar6) == checkValidIntValue8) {
            return u03;
        }
        throw new DateTimeException("Strict mode rejected date parsed to a different month");
    }

    @Override // org.threeten.bp.chrono.j
    public c c(k kVar, int i4, int i5, int i6) {
        return (y) super.c(kVar, i4, i5, i6);
    }

    @Override // org.threeten.bp.chrono.j
    public c f() {
        return (y) super.f();
    }

    @Override // org.threeten.bp.chrono.j
    public c h(org.threeten.bp.r rVar) {
        return (y) super.h(rVar);
    }

    @Override // org.threeten.bp.chrono.j
    public c j(k kVar, int i4, int i5) {
        return (y) super.j(kVar, i4, i5);
    }

    @Override // org.threeten.bp.chrono.j
    public k n(int i4) {
        return z.of(i4);
    }

    @Override // org.threeten.bp.chrono.j
    public List<k> o() {
        return Arrays.asList(z.values());
    }

    @Override // org.threeten.bp.chrono.j
    public String r() {
        return "buddhist";
    }

    @Override // org.threeten.bp.chrono.j
    public String t() {
        return "ThaiBuddhist";
    }

    @Override // org.threeten.bp.chrono.j
    public boolean v(long j4) {
        return o.f88011f.v(j4 - 543);
    }

    @Override // org.threeten.bp.chrono.j
    public d<y> w(org.threeten.bp.temporal.f fVar) {
        return super.w(fVar);
    }
}
