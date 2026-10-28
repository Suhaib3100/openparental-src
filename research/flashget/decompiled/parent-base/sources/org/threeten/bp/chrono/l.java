package org.threeten.bp.chrono;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.DateTimeException;

/* compiled from: HijrahChronology.java */
/* loaded from: classes9.dex */
public final class l extends j implements Serializable {

    /* renamed from: g, reason: collision with root package name */
    private static final long f87982g = 3127340209035924785L;

    /* renamed from: h, reason: collision with root package name */
    private static final HashMap<String, String[]> f87983h;

    /* renamed from: i, reason: collision with root package name */
    private static final HashMap<String, String[]> f87984i;

    /* renamed from: j, reason: collision with root package name */
    private static final HashMap<String, String[]> f87985j;

    /* renamed from: k, reason: collision with root package name */
    private static final String f87986k = "en";

    /* renamed from: f, reason: collision with root package name */
    public static final l f87981f = new l();

    static {
        HashMap<String, String[]> hashMap = new HashMap<>();
        f87983h = hashMap;
        HashMap<String, String[]> hashMap2 = new HashMap<>();
        f87984i = hashMap2;
        HashMap<String, String[]> hashMap3 = new HashMap<>();
        f87985j = hashMap3;
        hashMap.put("en", new String[]{"BH", "HE"});
        hashMap2.put("en", new String[]{"B.H.", "H.E."});
        hashMap3.put("en", new String[]{"Before Hijrah", "Hijrah Era"});
    }

    private l() {
    }

    private Object readResolve() {
        return f87981f;
    }

    @Override // org.threeten.bp.chrono.j
    public int A(k kVar, int i4) {
        if (kVar instanceof n) {
            return kVar == n.AH ? i4 : 1 - i4;
        }
        throw new ClassCastException("Era must be HijrahEra");
    }

    @Override // org.threeten.bp.chrono.j
    public org.threeten.bp.temporal.n B(org.threeten.bp.temporal.a aVar) {
        return aVar.range();
    }

    @Override // org.threeten.bp.chrono.j
    public h<m> L(org.threeten.bp.f fVar, org.threeten.bp.r rVar) {
        return i.U(this, fVar, rVar);
    }

    @Override // org.threeten.bp.chrono.j
    public h<m> M(org.threeten.bp.temporal.f fVar) {
        return super.M(fVar);
    }

    public m N(int i4, int i5, int i6) {
        return m.J0(i4, i5, i6);
    }

    public m P(k kVar, int i4, int i5, int i6) {
        return (m) super.c(kVar, i4, i5, i6);
    }

    @Override // org.threeten.bp.chrono.j
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public m d(org.threeten.bp.temporal.f fVar) {
        return fVar instanceof m ? (m) fVar : m.P0(fVar.getLong(org.threeten.bp.temporal.a.EPOCH_DAY));
    }

    @Override // org.threeten.bp.chrono.j
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public m e(long j4) {
        return m.L0(org.threeten.bp.g.z0(j4));
    }

    public m S() {
        return (m) super.f();
    }

    @Override // org.threeten.bp.chrono.j
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public m g(org.threeten.bp.a aVar) {
        ng.d.j(aVar, "clock");
        return (m) super.g(aVar);
    }

    public m U(org.threeten.bp.r rVar) {
        return (m) super.h(rVar);
    }

    @Override // org.threeten.bp.chrono.j
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public m i(int i4, int i5) {
        return m.J0(i4, 1, 1).T(i5 - 1);
    }

    public m W(k kVar, int i4, int i5) {
        return (m) super.j(kVar, i4, i5);
    }

    @Override // org.threeten.bp.chrono.j
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public n n(int i4) {
        if (i4 == 0) {
            return n.BEFORE_AH;
        }
        if (i4 == 1) {
            return n.AH;
        }
        throw new DateTimeException("invalid Hijrah era");
    }

    @Override // org.threeten.bp.chrono.j
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public m G(Map<org.threeten.bp.temporal.j, Long> map, org.threeten.bp.format.j jVar) {
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
            org.threeten.bp.temporal.j jVar2 = org.threeten.bp.temporal.a.DAY_OF_MONTH;
            if (map.containsKey(jVar2)) {
                int checkValidIntValue = aVar6.checkValidIntValue(map.remove(aVar6).longValue());
                if (jVar == org.threeten.bp.format.j.LENIENT) {
                    return m.J0(checkValidIntValue, 1, 1).U(ng.d.q(map.remove(aVar7).longValue(), 1L)).T(ng.d.q(map.remove(jVar2).longValue(), 1L));
                }
                int a5 = aVar7.range().a(map.remove(aVar7).longValue(), aVar7);
                int a6 = jVar2.range().a(map.remove(jVar2).longValue(), jVar2);
                if (jVar == org.threeten.bp.format.j.SMART && a6 > 28) {
                    a6 = Math.min(a6, m.J0(checkValidIntValue, a5, 1).v());
                }
                return m.J0(checkValidIntValue, a5, a6);
            }
            org.threeten.bp.temporal.a aVar8 = org.threeten.bp.temporal.a.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(aVar8)) {
                org.threeten.bp.temporal.a aVar9 = org.threeten.bp.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (map.containsKey(aVar9)) {
                    int checkValidIntValue2 = aVar6.checkValidIntValue(map.remove(aVar6).longValue());
                    if (jVar == org.threeten.bp.format.j.LENIENT) {
                        return m.J0(checkValidIntValue2, 1, 1).R0(ng.d.q(map.remove(aVar7).longValue(), 1L), org.threeten.bp.temporal.b.MONTHS).R0(ng.d.q(map.remove(aVar8).longValue(), 1L), org.threeten.bp.temporal.b.WEEKS).R0(ng.d.q(map.remove(aVar9).longValue(), 1L), org.threeten.bp.temporal.b.DAYS);
                    }
                    int checkValidIntValue3 = aVar7.checkValidIntValue(map.remove(aVar7).longValue());
                    m R0 = m.J0(checkValidIntValue2, checkValidIntValue3, 1).R0((aVar9.checkValidIntValue(map.remove(aVar9).longValue()) - 1) + ((aVar8.checkValidIntValue(map.remove(aVar8).longValue()) - 1) * 7), org.threeten.bp.temporal.b.DAYS);
                    if (jVar != org.threeten.bp.format.j.STRICT || R0.get(aVar7) == checkValidIntValue3) {
                        return R0;
                    }
                    throw new DateTimeException("Strict mode rejected date parsed to a different month");
                }
                org.threeten.bp.temporal.a aVar10 = org.threeten.bp.temporal.a.DAY_OF_WEEK;
                if (map.containsKey(aVar10)) {
                    int checkValidIntValue4 = aVar6.checkValidIntValue(map.remove(aVar6).longValue());
                    if (jVar == org.threeten.bp.format.j.LENIENT) {
                        return m.J0(checkValidIntValue4, 1, 1).R0(ng.d.q(map.remove(aVar7).longValue(), 1L), org.threeten.bp.temporal.b.MONTHS).R0(ng.d.q(map.remove(aVar8).longValue(), 1L), org.threeten.bp.temporal.b.WEEKS).R0(ng.d.q(map.remove(aVar10).longValue(), 1L), org.threeten.bp.temporal.b.DAYS);
                    }
                    int checkValidIntValue5 = aVar7.checkValidIntValue(map.remove(aVar7).longValue());
                    m Z0 = m.J0(checkValidIntValue4, checkValidIntValue5, 1).R0(aVar8.checkValidIntValue(map.remove(aVar8).longValue()) - 1, org.threeten.bp.temporal.b.WEEKS).Z0(org.threeten.bp.temporal.h.k(org.threeten.bp.d.of(aVar10.checkValidIntValue(map.remove(aVar10).longValue()))));
                    if (jVar != org.threeten.bp.format.j.STRICT || Z0.get(aVar7) == checkValidIntValue5) {
                        return Z0;
                    }
                    throw new DateTimeException("Strict mode rejected date parsed to a different month");
                }
            }
        }
        org.threeten.bp.temporal.a aVar11 = org.threeten.bp.temporal.a.DAY_OF_YEAR;
        if (map.containsKey(aVar11)) {
            int checkValidIntValue6 = aVar6.checkValidIntValue(map.remove(aVar6).longValue());
            if (jVar == org.threeten.bp.format.j.LENIENT) {
                return i(checkValidIntValue6, 1).T(ng.d.q(map.remove(aVar11).longValue(), 1L));
            }
            return i(checkValidIntValue6, aVar11.checkValidIntValue(map.remove(aVar11).longValue()));
        }
        org.threeten.bp.temporal.a aVar12 = org.threeten.bp.temporal.a.ALIGNED_WEEK_OF_YEAR;
        if (!map.containsKey(aVar12)) {
            return null;
        }
        org.threeten.bp.temporal.a aVar13 = org.threeten.bp.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        if (map.containsKey(aVar13)) {
            int checkValidIntValue7 = aVar6.checkValidIntValue(map.remove(aVar6).longValue());
            if (jVar == org.threeten.bp.format.j.LENIENT) {
                return m.J0(checkValidIntValue7, 1, 1).R0(ng.d.q(map.remove(aVar12).longValue(), 1L), org.threeten.bp.temporal.b.WEEKS).R0(ng.d.q(map.remove(aVar13).longValue(), 1L), org.threeten.bp.temporal.b.DAYS);
            }
            m T = m.J0(checkValidIntValue7, 1, 1).T((aVar13.checkValidIntValue(map.remove(aVar13).longValue()) - 1) + ((aVar12.checkValidIntValue(map.remove(aVar12).longValue()) - 1) * 7));
            if (jVar != org.threeten.bp.format.j.STRICT || T.get(aVar6) == checkValidIntValue7) {
                return T;
            }
            throw new DateTimeException("Strict mode rejected date parsed to a different year");
        }
        org.threeten.bp.temporal.a aVar14 = org.threeten.bp.temporal.a.DAY_OF_WEEK;
        if (!map.containsKey(aVar14)) {
            return null;
        }
        int checkValidIntValue8 = aVar6.checkValidIntValue(map.remove(aVar6).longValue());
        if (jVar == org.threeten.bp.format.j.LENIENT) {
            return m.J0(checkValidIntValue8, 1, 1).R0(ng.d.q(map.remove(aVar12).longValue(), 1L), org.threeten.bp.temporal.b.WEEKS).R0(ng.d.q(map.remove(aVar14).longValue(), 1L), org.threeten.bp.temporal.b.DAYS);
        }
        m Z02 = m.J0(checkValidIntValue8, 1, 1).R0(aVar12.checkValidIntValue(map.remove(aVar12).longValue()) - 1, org.threeten.bp.temporal.b.WEEKS).Z0(org.threeten.bp.temporal.h.k(org.threeten.bp.d.of(aVar14.checkValidIntValue(map.remove(aVar14).longValue()))));
        if (jVar != org.threeten.bp.format.j.STRICT || Z02.get(aVar6) == checkValidIntValue8) {
            return Z02;
        }
        throw new DateTimeException("Strict mode rejected date parsed to a different month");
    }

    @Override // org.threeten.bp.chrono.j
    public c b(int i4, int i5, int i6) {
        return m.J0(i4, i5, i6);
    }

    @Override // org.threeten.bp.chrono.j
    public c c(k kVar, int i4, int i5, int i6) {
        return (m) super.c(kVar, i4, i5, i6);
    }

    @Override // org.threeten.bp.chrono.j
    public c f() {
        return (m) super.f();
    }

    @Override // org.threeten.bp.chrono.j
    public c h(org.threeten.bp.r rVar) {
        return (m) super.h(rVar);
    }

    @Override // org.threeten.bp.chrono.j
    public c j(k kVar, int i4, int i5) {
        return (m) super.j(kVar, i4, i5);
    }

    @Override // org.threeten.bp.chrono.j
    public List<k> o() {
        return Arrays.asList(n.values());
    }

    @Override // org.threeten.bp.chrono.j
    public String r() {
        return "islamic-umalqura";
    }

    @Override // org.threeten.bp.chrono.j
    public String t() {
        return "Hijrah-umalqura";
    }

    @Override // org.threeten.bp.chrono.j
    public boolean v(long j4) {
        return m.D0(j4);
    }

    @Override // org.threeten.bp.chrono.j
    public d<m> w(org.threeten.bp.temporal.f fVar) {
        return super.w(fVar);
    }
}
