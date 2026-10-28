package org.threeten.bp.format;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.chrono.o;
import org.threeten.bp.r;
import org.threeten.bp.s;

/* compiled from: DateTimeBuilder.java */
/* loaded from: classes9.dex */
final class a extends ng.c implements org.threeten.bp.temporal.f, Cloneable {

    /* renamed from: b, reason: collision with root package name */
    final Map<org.threeten.bp.temporal.j, Long> f88094b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    org.threeten.bp.chrono.j f88095c;

    /* renamed from: d, reason: collision with root package name */
    r f88096d;

    /* renamed from: e, reason: collision with root package name */
    org.threeten.bp.chrono.c f88097e;

    /* renamed from: f, reason: collision with root package name */
    org.threeten.bp.i f88098f;

    /* renamed from: g, reason: collision with root package name */
    boolean f88099g;

    /* renamed from: h, reason: collision with root package name */
    org.threeten.bp.n f88100h;

    public a() {
    }

    private boolean A(j jVar) {
        int i4 = 0;
        loop0: while (i4 < 100) {
            Iterator<Map.Entry<org.threeten.bp.temporal.j, Long>> it = this.f88094b.entrySet().iterator();
            while (it.hasNext()) {
                org.threeten.bp.temporal.j key = it.next().getKey();
                org.threeten.bp.temporal.f resolve = key.resolve(this.f88094b, this, jVar);
                if (resolve != null) {
                    if (resolve instanceof org.threeten.bp.chrono.h) {
                        org.threeten.bp.chrono.h hVar = (org.threeten.bp.chrono.h) resolve;
                        r rVar = this.f88096d;
                        if (rVar == null) {
                            this.f88096d = hVar.q();
                        } else if (!rVar.equals(hVar.q())) {
                            throw new DateTimeException("ChronoZonedDateTime must use the effective parsed zone: " + this.f88096d);
                        }
                        resolve = hVar.E();
                    }
                    if (resolve instanceof org.threeten.bp.chrono.c) {
                        G(key, (org.threeten.bp.chrono.c) resolve);
                    } else if (resolve instanceof org.threeten.bp.i) {
                        E(key, (org.threeten.bp.i) resolve);
                    } else {
                        if (!(resolve instanceof org.threeten.bp.chrono.d)) {
                            throw new DateTimeException("Unknown type: ".concat(resolve.getClass().getName()));
                        }
                        org.threeten.bp.chrono.d dVar = (org.threeten.bp.chrono.d) resolve;
                        G(key, dVar.B());
                        E(key, dVar.C());
                    }
                } else if (!this.f88094b.containsKey(key)) {
                    break;
                }
                i4++;
            }
        }
        if (i4 != 100) {
            return i4 > 0;
        }
        throw new DateTimeException("Badly written field");
    }

    private void B() {
        if (this.f88098f == null) {
            if (this.f88094b.containsKey(org.threeten.bp.temporal.a.INSTANT_SECONDS) || this.f88094b.containsKey(org.threeten.bp.temporal.a.SECOND_OF_DAY) || this.f88094b.containsKey(org.threeten.bp.temporal.a.SECOND_OF_MINUTE)) {
                Map<org.threeten.bp.temporal.j, Long> map = this.f88094b;
                org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.NANO_OF_SECOND;
                if (map.containsKey(aVar)) {
                    long longValue = this.f88094b.get(aVar).longValue();
                    this.f88094b.put(org.threeten.bp.temporal.a.MICRO_OF_SECOND, Long.valueOf(longValue / 1000));
                    this.f88094b.put(org.threeten.bp.temporal.a.MILLI_OF_SECOND, Long.valueOf(longValue / 1000000));
                } else {
                    this.f88094b.put(aVar, 0L);
                    this.f88094b.put(org.threeten.bp.temporal.a.MICRO_OF_SECOND, 0L);
                    this.f88094b.put(org.threeten.bp.temporal.a.MILLI_OF_SECOND, 0L);
                }
            }
        }
    }

    private void C() {
        if (this.f88097e == null || this.f88098f == null) {
            return;
        }
        Long l4 = this.f88094b.get(org.threeten.bp.temporal.a.OFFSET_SECONDS);
        if (l4 != null) {
            org.threeten.bp.chrono.h<?> l5 = this.f88097e.l(this.f88098f).l(s.A(l4.intValue()));
            org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.INSTANT_SECONDS;
            this.f88094b.put(aVar, Long.valueOf(l5.getLong(aVar)));
            return;
        }
        if (this.f88096d != null) {
            org.threeten.bp.chrono.h<?> l6 = this.f88097e.l(this.f88098f).l(this.f88096d);
            org.threeten.bp.temporal.a aVar2 = org.threeten.bp.temporal.a.INSTANT_SECONDS;
            this.f88094b.put(aVar2, Long.valueOf(l6.getLong(aVar2)));
        }
    }

    private void E(org.threeten.bp.temporal.j jVar, org.threeten.bp.i iVar) {
        long f02 = iVar.f0();
        Long put = this.f88094b.put(org.threeten.bp.temporal.a.NANO_OF_DAY, Long.valueOf(f02));
        if (put == null || put.longValue() == f02) {
            return;
        }
        throw new DateTimeException("Conflict found: " + org.threeten.bp.i.S(put.longValue()) + " differs from " + iVar + " while resolving  " + jVar);
    }

    private void G(org.threeten.bp.temporal.j jVar, org.threeten.bp.chrono.c cVar) {
        if (!this.f88095c.equals(cVar.p())) {
            throw new DateTimeException("ChronoLocalDate must use the effective parsed chronology: " + this.f88095c);
        }
        long E = cVar.E();
        Long put = this.f88094b.put(org.threeten.bp.temporal.a.EPOCH_DAY, Long.valueOf(E));
        if (put == null || put.longValue() == E) {
            return;
        }
        throw new DateTimeException("Conflict found: " + org.threeten.bp.g.z0(put.longValue()) + " differs from " + org.threeten.bp.g.z0(E) + " while resolving  " + jVar);
    }

    private void J(j jVar) {
        Map<org.threeten.bp.temporal.j, Long> map = this.f88094b;
        org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.HOUR_OF_DAY;
        Long l4 = map.get(aVar);
        Map<org.threeten.bp.temporal.j, Long> map2 = this.f88094b;
        org.threeten.bp.temporal.a aVar2 = org.threeten.bp.temporal.a.MINUTE_OF_HOUR;
        Long l5 = map2.get(aVar2);
        Map<org.threeten.bp.temporal.j, Long> map3 = this.f88094b;
        org.threeten.bp.temporal.a aVar3 = org.threeten.bp.temporal.a.SECOND_OF_MINUTE;
        Long l6 = map3.get(aVar3);
        Map<org.threeten.bp.temporal.j, Long> map4 = this.f88094b;
        org.threeten.bp.temporal.a aVar4 = org.threeten.bp.temporal.a.NANO_OF_SECOND;
        Long l7 = map4.get(aVar4);
        if (l4 == null) {
            return;
        }
        if (l5 != null || (l6 == null && l7 == null)) {
            if (l5 == null || l6 != null || l7 == null) {
                if (jVar != j.LENIENT) {
                    if (jVar == j.SMART && l4.longValue() == 24 && ((l5 == null || l5.longValue() == 0) && ((l6 == null || l6.longValue() == 0) && (l7 == null || l7.longValue() == 0)))) {
                        l4 = 0L;
                        this.f88100h = org.threeten.bp.n.B(1);
                    }
                    int checkValidIntValue = aVar.checkValidIntValue(l4.longValue());
                    if (l5 != null) {
                        int checkValidIntValue2 = aVar2.checkValidIntValue(l5.longValue());
                        if (l6 != null) {
                            int checkValidIntValue3 = aVar3.checkValidIntValue(l6.longValue());
                            if (l7 != null) {
                                this.f88098f = org.threeten.bp.i.R(checkValidIntValue, checkValidIntValue2, checkValidIntValue3, aVar4.checkValidIntValue(l7.longValue()));
                            } else {
                                this.f88098f = org.threeten.bp.i.P(checkValidIntValue, checkValidIntValue2, checkValidIntValue3);
                            }
                        } else if (l7 == null) {
                            this.f88098f = org.threeten.bp.i.N(checkValidIntValue, checkValidIntValue2);
                        }
                    } else if (l6 == null && l7 == null) {
                        this.f88098f = org.threeten.bp.i.N(checkValidIntValue, 0);
                    }
                } else {
                    long longValue = l4.longValue();
                    if (l5 == null) {
                        int r4 = ng.d.r(ng.d.e(longValue, 24L));
                        this.f88098f = org.threeten.bp.i.N(ng.d.g(longValue, 24), 0);
                        this.f88100h = org.threeten.bp.n.B(r4);
                    } else if (l6 != null) {
                        if (l7 == null) {
                            l7 = 0L;
                        }
                        long l10 = ng.d.l(ng.d.l(ng.d.l(ng.d.o(longValue, 3600000000000L), ng.d.o(l5.longValue(), 60000000000L)), ng.d.o(l6.longValue(), 1000000000L)), l7.longValue());
                        int e4 = (int) ng.d.e(l10, 86400000000000L);
                        this.f88098f = org.threeten.bp.i.S(ng.d.h(l10, 86400000000000L));
                        this.f88100h = org.threeten.bp.n.B(e4);
                    } else {
                        long l11 = ng.d.l(ng.d.o(longValue, 3600L), ng.d.o(l5.longValue(), 60L));
                        int e5 = (int) ng.d.e(l11, 86400L);
                        this.f88098f = org.threeten.bp.i.T(ng.d.h(l11, 86400L));
                        this.f88100h = org.threeten.bp.n.B(e5);
                    }
                }
                this.f88094b.remove(aVar);
                this.f88094b.remove(aVar2);
                this.f88094b.remove(aVar3);
                this.f88094b.remove(aVar4);
            }
        }
    }

    private void p(org.threeten.bp.g gVar) {
        if (gVar != null) {
            this.f88097e = gVar;
            for (org.threeten.bp.temporal.j jVar : this.f88094b.keySet()) {
                if ((jVar instanceof org.threeten.bp.temporal.a) && jVar.isDateBased()) {
                    try {
                        long j4 = gVar.getLong(jVar);
                        Long l4 = this.f88094b.get(jVar);
                        if (j4 != l4.longValue()) {
                            throw new DateTimeException("Conflict found: Field " + jVar + " " + j4 + " differs from " + jVar + " " + l4 + " derived from " + gVar);
                        }
                    } catch (DateTimeException unused) {
                        continue;
                    }
                }
            }
        }
    }

    private void q() {
        org.threeten.bp.i iVar;
        if (this.f88094b.size() > 0) {
            org.threeten.bp.chrono.c cVar = this.f88097e;
            if (cVar != null && (iVar = this.f88098f) != null) {
                r(cVar.l(iVar));
                return;
            }
            if (cVar != null) {
                r(cVar);
                return;
            }
            org.threeten.bp.temporal.f fVar = this.f88098f;
            if (fVar != null) {
                r(fVar);
            }
        }
    }

    private void r(org.threeten.bp.temporal.f fVar) {
        Iterator<Map.Entry<org.threeten.bp.temporal.j, Long>> it = this.f88094b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<org.threeten.bp.temporal.j, Long> next = it.next();
            org.threeten.bp.temporal.j key = next.getKey();
            long longValue = next.getValue().longValue();
            if (fVar.isSupported(key)) {
                try {
                    long j4 = fVar.getLong(key);
                    if (j4 != longValue) {
                        throw new DateTimeException("Cross check failed: " + key + " " + j4 + " vs " + key + " " + longValue);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    private Long s(org.threeten.bp.temporal.j jVar) {
        return this.f88094b.get(jVar);
    }

    private void t(j jVar) {
        if (this.f88095c instanceof o) {
            p(o.f88011f.G(this.f88094b, jVar));
            return;
        }
        Map<org.threeten.bp.temporal.j, Long> map = this.f88094b;
        org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.EPOCH_DAY;
        if (map.containsKey(aVar)) {
            p(org.threeten.bp.g.z0(this.f88094b.remove(aVar).longValue()));
        }
    }

    private void u() {
        if (this.f88094b.containsKey(org.threeten.bp.temporal.a.INSTANT_SECONDS)) {
            r rVar = this.f88096d;
            if (rVar != null) {
                v(rVar);
                return;
            }
            Long l4 = this.f88094b.get(org.threeten.bp.temporal.a.OFFSET_SECONDS);
            if (l4 != null) {
                v(s.A(l4.intValue()));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [org.threeten.bp.chrono.c] */
    private void v(r rVar) {
        Map<org.threeten.bp.temporal.j, Long> map = this.f88094b;
        org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.INSTANT_SECONDS;
        org.threeten.bp.chrono.h<?> L = this.f88095c.L(org.threeten.bp.f.G(map.remove(aVar).longValue()), rVar);
        if (this.f88097e == null) {
            this.f88097e = L.C();
        } else {
            G(aVar, L.C());
        }
        l(org.threeten.bp.temporal.a.SECOND_OF_DAY, L.G().g0());
    }

    private void w(j jVar) {
        Map<org.threeten.bp.temporal.j, Long> map = this.f88094b;
        org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.CLOCK_HOUR_OF_DAY;
        if (map.containsKey(aVar)) {
            long longValue = this.f88094b.remove(aVar).longValue();
            if (jVar != j.LENIENT && (jVar != j.SMART || longValue != 0)) {
                aVar.checkValidValue(longValue);
            }
            org.threeten.bp.temporal.a aVar2 = org.threeten.bp.temporal.a.HOUR_OF_DAY;
            if (longValue == 24) {
                longValue = 0;
            }
            l(aVar2, longValue);
        }
        Map<org.threeten.bp.temporal.j, Long> map2 = this.f88094b;
        org.threeten.bp.temporal.a aVar3 = org.threeten.bp.temporal.a.CLOCK_HOUR_OF_AMPM;
        if (map2.containsKey(aVar3)) {
            long longValue2 = this.f88094b.remove(aVar3).longValue();
            if (jVar != j.LENIENT && (jVar != j.SMART || longValue2 != 0)) {
                aVar3.checkValidValue(longValue2);
            }
            l(org.threeten.bp.temporal.a.HOUR_OF_AMPM, longValue2 != 12 ? longValue2 : 0L);
        }
        j jVar2 = j.LENIENT;
        if (jVar != jVar2) {
            Map<org.threeten.bp.temporal.j, Long> map3 = this.f88094b;
            org.threeten.bp.temporal.a aVar4 = org.threeten.bp.temporal.a.AMPM_OF_DAY;
            if (map3.containsKey(aVar4)) {
                aVar4.checkValidValue(this.f88094b.get(aVar4).longValue());
            }
            Map<org.threeten.bp.temporal.j, Long> map4 = this.f88094b;
            org.threeten.bp.temporal.a aVar5 = org.threeten.bp.temporal.a.HOUR_OF_AMPM;
            if (map4.containsKey(aVar5)) {
                aVar5.checkValidValue(this.f88094b.get(aVar5).longValue());
            }
        }
        Map<org.threeten.bp.temporal.j, Long> map5 = this.f88094b;
        org.threeten.bp.temporal.a aVar6 = org.threeten.bp.temporal.a.AMPM_OF_DAY;
        if (map5.containsKey(aVar6)) {
            Map<org.threeten.bp.temporal.j, Long> map6 = this.f88094b;
            org.threeten.bp.temporal.a aVar7 = org.threeten.bp.temporal.a.HOUR_OF_AMPM;
            if (map6.containsKey(aVar7)) {
                l(org.threeten.bp.temporal.a.HOUR_OF_DAY, (this.f88094b.remove(aVar6).longValue() * 12) + this.f88094b.remove(aVar7).longValue());
            }
        }
        Map<org.threeten.bp.temporal.j, Long> map7 = this.f88094b;
        org.threeten.bp.temporal.a aVar8 = org.threeten.bp.temporal.a.NANO_OF_DAY;
        if (map7.containsKey(aVar8)) {
            long longValue3 = this.f88094b.remove(aVar8).longValue();
            if (jVar != jVar2) {
                aVar8.checkValidValue(longValue3);
            }
            l(org.threeten.bp.temporal.a.SECOND_OF_DAY, longValue3 / 1000000000);
            l(org.threeten.bp.temporal.a.NANO_OF_SECOND, longValue3 % 1000000000);
        }
        Map<org.threeten.bp.temporal.j, Long> map8 = this.f88094b;
        org.threeten.bp.temporal.a aVar9 = org.threeten.bp.temporal.a.MICRO_OF_DAY;
        if (map8.containsKey(aVar9)) {
            long longValue4 = this.f88094b.remove(aVar9).longValue();
            if (jVar != jVar2) {
                aVar9.checkValidValue(longValue4);
            }
            l(org.threeten.bp.temporal.a.SECOND_OF_DAY, longValue4 / 1000000);
            l(org.threeten.bp.temporal.a.MICRO_OF_SECOND, longValue4 % 1000000);
        }
        Map<org.threeten.bp.temporal.j, Long> map9 = this.f88094b;
        org.threeten.bp.temporal.a aVar10 = org.threeten.bp.temporal.a.MILLI_OF_DAY;
        if (map9.containsKey(aVar10)) {
            long longValue5 = this.f88094b.remove(aVar10).longValue();
            if (jVar != jVar2) {
                aVar10.checkValidValue(longValue5);
            }
            l(org.threeten.bp.temporal.a.SECOND_OF_DAY, longValue5 / 1000);
            l(org.threeten.bp.temporal.a.MILLI_OF_SECOND, longValue5 % 1000);
        }
        Map<org.threeten.bp.temporal.j, Long> map10 = this.f88094b;
        org.threeten.bp.temporal.a aVar11 = org.threeten.bp.temporal.a.SECOND_OF_DAY;
        if (map10.containsKey(aVar11)) {
            long longValue6 = this.f88094b.remove(aVar11).longValue();
            if (jVar != jVar2) {
                aVar11.checkValidValue(longValue6);
            }
            l(org.threeten.bp.temporal.a.HOUR_OF_DAY, longValue6 / 3600);
            l(org.threeten.bp.temporal.a.MINUTE_OF_HOUR, (longValue6 / 60) % 60);
            l(org.threeten.bp.temporal.a.SECOND_OF_MINUTE, longValue6 % 60);
        }
        Map<org.threeten.bp.temporal.j, Long> map11 = this.f88094b;
        org.threeten.bp.temporal.a aVar12 = org.threeten.bp.temporal.a.MINUTE_OF_DAY;
        if (map11.containsKey(aVar12)) {
            long longValue7 = this.f88094b.remove(aVar12).longValue();
            if (jVar != jVar2) {
                aVar12.checkValidValue(longValue7);
            }
            l(org.threeten.bp.temporal.a.HOUR_OF_DAY, longValue7 / 60);
            l(org.threeten.bp.temporal.a.MINUTE_OF_HOUR, longValue7 % 60);
        }
        if (jVar != jVar2) {
            Map<org.threeten.bp.temporal.j, Long> map12 = this.f88094b;
            org.threeten.bp.temporal.a aVar13 = org.threeten.bp.temporal.a.MILLI_OF_SECOND;
            if (map12.containsKey(aVar13)) {
                aVar13.checkValidValue(this.f88094b.get(aVar13).longValue());
            }
            Map<org.threeten.bp.temporal.j, Long> map13 = this.f88094b;
            org.threeten.bp.temporal.a aVar14 = org.threeten.bp.temporal.a.MICRO_OF_SECOND;
            if (map13.containsKey(aVar14)) {
                aVar14.checkValidValue(this.f88094b.get(aVar14).longValue());
            }
        }
        Map<org.threeten.bp.temporal.j, Long> map14 = this.f88094b;
        org.threeten.bp.temporal.a aVar15 = org.threeten.bp.temporal.a.MILLI_OF_SECOND;
        if (map14.containsKey(aVar15)) {
            Map<org.threeten.bp.temporal.j, Long> map15 = this.f88094b;
            org.threeten.bp.temporal.a aVar16 = org.threeten.bp.temporal.a.MICRO_OF_SECOND;
            if (map15.containsKey(aVar16)) {
                l(aVar16, (this.f88094b.get(aVar16).longValue() % 1000) + (this.f88094b.remove(aVar15).longValue() * 1000));
            }
        }
        Map<org.threeten.bp.temporal.j, Long> map16 = this.f88094b;
        org.threeten.bp.temporal.a aVar17 = org.threeten.bp.temporal.a.MICRO_OF_SECOND;
        if (map16.containsKey(aVar17)) {
            Map<org.threeten.bp.temporal.j, Long> map17 = this.f88094b;
            org.threeten.bp.temporal.a aVar18 = org.threeten.bp.temporal.a.NANO_OF_SECOND;
            if (map17.containsKey(aVar18)) {
                l(aVar17, this.f88094b.get(aVar18).longValue() / 1000);
                this.f88094b.remove(aVar17);
            }
        }
        if (this.f88094b.containsKey(aVar15)) {
            Map<org.threeten.bp.temporal.j, Long> map18 = this.f88094b;
            org.threeten.bp.temporal.a aVar19 = org.threeten.bp.temporal.a.NANO_OF_SECOND;
            if (map18.containsKey(aVar19)) {
                l(aVar15, this.f88094b.get(aVar19).longValue() / 1000000);
                this.f88094b.remove(aVar15);
            }
        }
        if (this.f88094b.containsKey(aVar17)) {
            l(org.threeten.bp.temporal.a.NANO_OF_SECOND, this.f88094b.remove(aVar17).longValue() * 1000);
        } else if (this.f88094b.containsKey(aVar15)) {
            l(org.threeten.bp.temporal.a.NANO_OF_SECOND, this.f88094b.remove(aVar15).longValue() * 1000000);
        }
    }

    private a y(org.threeten.bp.temporal.j jVar, long j4) {
        this.f88094b.put(jVar, Long.valueOf(j4));
        return this;
    }

    @Override // org.threeten.bp.temporal.f
    public long getLong(org.threeten.bp.temporal.j jVar) {
        ng.d.j(jVar, "field");
        Long s4 = s(jVar);
        if (s4 != null) {
            return s4.longValue();
        }
        org.threeten.bp.chrono.c cVar = this.f88097e;
        if (cVar != null && cVar.isSupported(jVar)) {
            return this.f88097e.getLong(jVar);
        }
        org.threeten.bp.i iVar = this.f88098f;
        if (iVar == null || !iVar.isSupported(jVar)) {
            throw new DateTimeException(org.threeten.bp.c.a("Field not found: ", jVar));
        }
        return this.f88098f.getLong(jVar);
    }

    @Override // org.threeten.bp.temporal.f
    public boolean isSupported(org.threeten.bp.temporal.j jVar) {
        org.threeten.bp.chrono.c cVar;
        org.threeten.bp.i iVar;
        if (jVar == null) {
            return false;
        }
        return this.f88094b.containsKey(jVar) || ((cVar = this.f88097e) != null && cVar.isSupported(jVar)) || ((iVar = this.f88098f) != null && iVar.isSupported(jVar));
    }

    a l(org.threeten.bp.temporal.j jVar, long j4) {
        ng.d.j(jVar, "field");
        Long s4 = s(jVar);
        if (s4 == null || s4.longValue() == j4) {
            return y(jVar, j4);
        }
        throw new DateTimeException("Conflict found: " + jVar + " " + s4 + " differs from " + jVar + " " + j4 + ": " + this);
    }

    void m(org.threeten.bp.i iVar) {
        this.f88098f = iVar;
    }

    void n(org.threeten.bp.chrono.c cVar) {
        this.f88097e = cVar;
    }

    public <R> R o(org.threeten.bp.temporal.l<R> lVar) {
        return lVar.a(this);
    }

    @Override // ng.c, org.threeten.bp.temporal.f
    public <R> R query(org.threeten.bp.temporal.l<R> lVar) {
        if (lVar == org.threeten.bp.temporal.k.g()) {
            return (R) this.f88096d;
        }
        if (lVar == org.threeten.bp.temporal.k.a()) {
            return (R) this.f88095c;
        }
        if (lVar == org.threeten.bp.temporal.k.b()) {
            org.threeten.bp.chrono.c cVar = this.f88097e;
            if (cVar != null) {
                return (R) org.threeten.bp.g.Z(cVar);
            }
            return null;
        }
        if (lVar == org.threeten.bp.temporal.k.c()) {
            return (R) this.f88098f;
        }
        if (lVar == org.threeten.bp.temporal.k.f() || lVar == org.threeten.bp.temporal.k.d()) {
            return lVar.a(this);
        }
        if (lVar == org.threeten.bp.temporal.k.e()) {
            return null;
        }
        return lVar.a(this);
    }

    public String toString() {
        StringBuilder a5 = androidx.fragment.app.a.a(128, "DateTimeBuilder[");
        if (this.f88094b.size() > 0) {
            a5.append("fields=");
            a5.append(this.f88094b);
        }
        a5.append(", ");
        a5.append(this.f88095c);
        a5.append(", ");
        a5.append(this.f88096d);
        a5.append(", ");
        a5.append(this.f88097e);
        a5.append(", ");
        a5.append(this.f88098f);
        a5.append(']');
        return a5.toString();
    }

    public a z(j jVar, Set<org.threeten.bp.temporal.j> set) {
        org.threeten.bp.chrono.c cVar;
        if (set != null) {
            this.f88094b.keySet().retainAll(set);
        }
        u();
        t(jVar);
        w(jVar);
        if (A(jVar)) {
            u();
            t(jVar);
            w(jVar);
        }
        J(jVar);
        q();
        org.threeten.bp.n nVar = this.f88100h;
        if (nVar != null && !nVar.h() && (cVar = this.f88097e) != null && this.f88098f != null) {
            this.f88097e = cVar.g(this.f88100h);
            this.f88100h = org.threeten.bp.n.f88288e;
        }
        B();
        C();
        return this;
    }

    public a(org.threeten.bp.temporal.j jVar, long j4) {
        l(jVar, j4);
    }
}
