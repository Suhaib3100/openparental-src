package org.threeten.bp.chrono;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.threeten.bp.DateTimeException;

/* compiled from: IsoChronology.java */
/* loaded from: classes9.dex */
public final class o extends j implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final o f88011f = new o();

    /* renamed from: g, reason: collision with root package name */
    private static final long f88012g = -1440403870442975015L;

    private o() {
    }

    private Object readResolve() {
        return f88011f;
    }

    @Override // org.threeten.bp.chrono.j
    public int A(k kVar, int i4) {
        if (kVar instanceof p) {
            return kVar == p.CE ? i4 : 1 - i4;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // org.threeten.bp.chrono.j
    public org.threeten.bp.temporal.n B(org.threeten.bp.temporal.a aVar) {
        return aVar.range();
    }

    @Override // org.threeten.bp.chrono.j
    public h L(org.threeten.bp.f fVar, org.threeten.bp.r rVar) {
        return org.threeten.bp.u.z0(fVar, rVar);
    }

    @Override // org.threeten.bp.chrono.j
    public h M(org.threeten.bp.temporal.f fVar) {
        return org.threeten.bp.u.T(fVar);
    }

    public org.threeten.bp.g N(int i4, int i5, int i6) {
        return org.threeten.bp.g.x0(i4, i5, i6);
    }

    @Override // org.threeten.bp.chrono.j
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public org.threeten.bp.g c(k kVar, int i4, int i5, int i6) {
        return org.threeten.bp.g.x0(A(kVar, i4), i5, i6);
    }

    public org.threeten.bp.g Q(org.threeten.bp.temporal.f fVar) {
        return org.threeten.bp.g.Z(fVar);
    }

    public org.threeten.bp.g R(long j4) {
        return org.threeten.bp.g.z0(j4);
    }

    @Override // org.threeten.bp.chrono.j
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public org.threeten.bp.g f() {
        return g(org.threeten.bp.a.g());
    }

    @Override // org.threeten.bp.chrono.j
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public org.threeten.bp.g g(org.threeten.bp.a aVar) {
        ng.d.j(aVar, "clock");
        return org.threeten.bp.g.Z(org.threeten.bp.g.v0(aVar));
    }

    @Override // org.threeten.bp.chrono.j
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public org.threeten.bp.g h(org.threeten.bp.r rVar) {
        return g(org.threeten.bp.a.f(rVar));
    }

    public org.threeten.bp.g V(int i4, int i5) {
        return org.threeten.bp.g.A0(i4, i5);
    }

    @Override // org.threeten.bp.chrono.j
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public org.threeten.bp.g j(k kVar, int i4, int i5) {
        return org.threeten.bp.g.A0(A(kVar, i4), i5);
    }

    public p X(int i4) {
        return p.of(i4);
    }

    public org.threeten.bp.h Y(org.threeten.bp.temporal.f fVar) {
        return org.threeten.bp.h.N(fVar);
    }

    @Override // org.threeten.bp.chrono.j
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public org.threeten.bp.g G(Map<org.threeten.bp.temporal.j, Long> map, org.threeten.bp.format.j jVar) {
        org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.EPOCH_DAY;
        if (map.containsKey(aVar)) {
            return org.threeten.bp.g.z0(map.remove(aVar).longValue());
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
                int r4 = ng.d.r(map.remove(aVar7).longValue());
                int r5 = ng.d.r(map.remove(aVar8).longValue());
                if (jVar == org.threeten.bp.format.j.LENIENT) {
                    return org.threeten.bp.g.x0(checkValidIntValue, 1, 1).G0(ng.d.p(r4, 1)).F0(ng.d.p(r5, 1));
                }
                if (jVar != org.threeten.bp.format.j.SMART) {
                    return org.threeten.bp.g.x0(checkValidIntValue, r4, r5);
                }
                aVar8.checkValidValue(r5);
                if (r4 == 4 || r4 == 6 || r4 == 9 || r4 == 11) {
                    r5 = Math.min(r5, 30);
                } else if (r4 == 2) {
                    r5 = Math.min(r5, org.threeten.bp.j.FEBRUARY.length(org.threeten.bp.p.v(checkValidIntValue)));
                }
                return org.threeten.bp.g.x0(checkValidIntValue, r4, r5);
            }
            org.threeten.bp.temporal.a aVar9 = org.threeten.bp.temporal.a.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(aVar9)) {
                org.threeten.bp.temporal.a aVar10 = org.threeten.bp.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (map.containsKey(aVar10)) {
                    int checkValidIntValue2 = aVar6.checkValidIntValue(map.remove(aVar6).longValue());
                    if (jVar == org.threeten.bp.format.j.LENIENT) {
                        return org.threeten.bp.g.x0(checkValidIntValue2, 1, 1).G0(ng.d.q(map.remove(aVar7).longValue(), 1L)).H0(ng.d.q(map.remove(aVar9).longValue(), 1L)).F0(ng.d.q(map.remove(aVar10).longValue(), 1L));
                    }
                    int checkValidIntValue3 = aVar7.checkValidIntValue(map.remove(aVar7).longValue());
                    org.threeten.bp.g F0 = org.threeten.bp.g.x0(checkValidIntValue2, checkValidIntValue3, 1).F0((aVar10.checkValidIntValue(map.remove(aVar10).longValue()) - 1) + ((aVar9.checkValidIntValue(map.remove(aVar9).longValue()) - 1) * 7));
                    if (jVar != org.threeten.bp.format.j.STRICT || F0.get(aVar7) == checkValidIntValue3) {
                        return F0;
                    }
                    throw new DateTimeException("Strict mode rejected date parsed to a different month");
                }
                org.threeten.bp.temporal.a aVar11 = org.threeten.bp.temporal.a.DAY_OF_WEEK;
                if (map.containsKey(aVar11)) {
                    int checkValidIntValue4 = aVar6.checkValidIntValue(map.remove(aVar6).longValue());
                    if (jVar == org.threeten.bp.format.j.LENIENT) {
                        return org.threeten.bp.g.x0(checkValidIntValue4, 1, 1).G0(ng.d.q(map.remove(aVar7).longValue(), 1L)).H0(ng.d.q(map.remove(aVar9).longValue(), 1L)).F0(ng.d.q(map.remove(aVar11).longValue(), 1L));
                    }
                    int checkValidIntValue5 = aVar7.checkValidIntValue(map.remove(aVar7).longValue());
                    org.threeten.bp.g J = org.threeten.bp.g.x0(checkValidIntValue4, checkValidIntValue5, 1).H0(aVar9.checkValidIntValue(map.remove(aVar9).longValue()) - 1).J(org.threeten.bp.temporal.h.k(org.threeten.bp.d.of(aVar11.checkValidIntValue(map.remove(aVar11).longValue()))));
                    if (jVar != org.threeten.bp.format.j.STRICT || J.get(aVar7) == checkValidIntValue5) {
                        return J;
                    }
                    throw new DateTimeException("Strict mode rejected date parsed to a different month");
                }
            }
        }
        org.threeten.bp.temporal.a aVar12 = org.threeten.bp.temporal.a.DAY_OF_YEAR;
        if (map.containsKey(aVar12)) {
            int checkValidIntValue6 = aVar6.checkValidIntValue(map.remove(aVar6).longValue());
            if (jVar == org.threeten.bp.format.j.LENIENT) {
                return org.threeten.bp.g.A0(checkValidIntValue6, 1).F0(ng.d.q(map.remove(aVar12).longValue(), 1L));
            }
            return org.threeten.bp.g.A0(checkValidIntValue6, aVar12.checkValidIntValue(map.remove(aVar12).longValue()));
        }
        org.threeten.bp.temporal.a aVar13 = org.threeten.bp.temporal.a.ALIGNED_WEEK_OF_YEAR;
        if (!map.containsKey(aVar13)) {
            return null;
        }
        org.threeten.bp.temporal.a aVar14 = org.threeten.bp.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        if (map.containsKey(aVar14)) {
            int checkValidIntValue7 = aVar6.checkValidIntValue(map.remove(aVar6).longValue());
            if (jVar == org.threeten.bp.format.j.LENIENT) {
                return org.threeten.bp.g.x0(checkValidIntValue7, 1, 1).H0(ng.d.q(map.remove(aVar13).longValue(), 1L)).F0(ng.d.q(map.remove(aVar14).longValue(), 1L));
            }
            org.threeten.bp.g F02 = org.threeten.bp.g.x0(checkValidIntValue7, 1, 1).F0((aVar14.checkValidIntValue(map.remove(aVar14).longValue()) - 1) + ((aVar13.checkValidIntValue(map.remove(aVar13).longValue()) - 1) * 7));
            if (jVar != org.threeten.bp.format.j.STRICT || F02.get(aVar6) == checkValidIntValue7) {
                return F02;
            }
            throw new DateTimeException("Strict mode rejected date parsed to a different year");
        }
        org.threeten.bp.temporal.a aVar15 = org.threeten.bp.temporal.a.DAY_OF_WEEK;
        if (!map.containsKey(aVar15)) {
            return null;
        }
        int checkValidIntValue8 = aVar6.checkValidIntValue(map.remove(aVar6).longValue());
        if (jVar == org.threeten.bp.format.j.LENIENT) {
            return org.threeten.bp.g.x0(checkValidIntValue8, 1, 1).H0(ng.d.q(map.remove(aVar13).longValue(), 1L)).F0(ng.d.q(map.remove(aVar15).longValue(), 1L));
        }
        org.threeten.bp.g J2 = org.threeten.bp.g.x0(checkValidIntValue8, 1, 1).H0(aVar13.checkValidIntValue(map.remove(aVar13).longValue()) - 1).J(org.threeten.bp.temporal.h.k(org.threeten.bp.d.of(aVar15.checkValidIntValue(map.remove(aVar15).longValue()))));
        if (jVar != org.threeten.bp.format.j.STRICT || J2.get(aVar6) == checkValidIntValue8) {
            return J2;
        }
        throw new DateTimeException("Strict mode rejected date parsed to a different month");
    }

    public org.threeten.bp.u a0(org.threeten.bp.f fVar, org.threeten.bp.r rVar) {
        return org.threeten.bp.u.z0(fVar, rVar);
    }

    @Override // org.threeten.bp.chrono.j
    public c b(int i4, int i5, int i6) {
        return org.threeten.bp.g.x0(i4, i5, i6);
    }

    public org.threeten.bp.u b0(org.threeten.bp.temporal.f fVar) {
        return org.threeten.bp.u.T(fVar);
    }

    @Override // org.threeten.bp.chrono.j
    public c d(org.threeten.bp.temporal.f fVar) {
        return org.threeten.bp.g.Z(fVar);
    }

    @Override // org.threeten.bp.chrono.j
    public c e(long j4) {
        return org.threeten.bp.g.z0(j4);
    }

    @Override // org.threeten.bp.chrono.j
    public c i(int i4, int i5) {
        return org.threeten.bp.g.A0(i4, i5);
    }

    @Override // org.threeten.bp.chrono.j
    public k n(int i4) {
        return p.of(i4);
    }

    @Override // org.threeten.bp.chrono.j
    public List<k> o() {
        return Arrays.asList(p.values());
    }

    @Override // org.threeten.bp.chrono.j
    public String r() {
        return "iso8601";
    }

    @Override // org.threeten.bp.chrono.j
    public String t() {
        return "ISO";
    }

    @Override // org.threeten.bp.chrono.j
    public boolean v(long j4) {
        return (3 & j4) == 0 && (j4 % 100 != 0 || j4 % 400 == 0);
    }

    @Override // org.threeten.bp.chrono.j
    public d w(org.threeten.bp.temporal.f fVar) {
        return org.threeten.bp.h.N(fVar);
    }
}
