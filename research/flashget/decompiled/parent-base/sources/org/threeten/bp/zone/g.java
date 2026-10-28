package org.threeten.bp.zone;

import com.tencent.mmkv.MMKV;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.chrono.o;
import org.threeten.bp.j;
import org.threeten.bp.s;
import org.threeten.bp.zone.e;

/* compiled from: ZoneRulesBuilder.java */
/* loaded from: classes9.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    private List<b> f88448a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private Map<Object, Object> f88449b;

    /* compiled from: ZoneRulesBuilder.java */
    class a implements Comparable<a> {

        /* renamed from: b, reason: collision with root package name */
        private int f88450b;

        /* renamed from: c, reason: collision with root package name */
        private j f88451c;

        /* renamed from: d, reason: collision with root package name */
        private int f88452d;

        /* renamed from: e, reason: collision with root package name */
        private org.threeten.bp.d f88453e;

        /* renamed from: f, reason: collision with root package name */
        private org.threeten.bp.i f88454f;

        /* renamed from: g, reason: collision with root package name */
        private int f88455g;

        /* renamed from: h, reason: collision with root package name */
        private e.b f88456h;

        /* renamed from: i, reason: collision with root package name */
        private int f88457i;

        a(int i4, j jVar, int i5, org.threeten.bp.d dVar, org.threeten.bp.i iVar, int i6, e.b bVar, int i7) {
            this.f88450b = i4;
            this.f88451c = jVar;
            this.f88452d = i5;
            this.f88453e = dVar;
            this.f88454f = iVar;
            this.f88455g = i6;
            this.f88456h = bVar;
            this.f88457i = i7;
        }

        private org.threeten.bp.g k() {
            int i4 = this.f88452d;
            if (i4 < 0) {
                org.threeten.bp.g y02 = org.threeten.bp.g.y0(this.f88450b, this.f88451c, this.f88451c.length(o.f88011f.v(this.f88450b)) + 1 + this.f88452d);
                org.threeten.bp.d dVar = this.f88453e;
                return dVar != null ? y02.J(org.threeten.bp.temporal.h.m(dVar)) : y02;
            }
            org.threeten.bp.g y03 = org.threeten.bp.g.y0(this.f88450b, this.f88451c, i4);
            org.threeten.bp.d dVar2 = this.f88453e;
            return dVar2 != null ? y03.J(org.threeten.bp.temporal.h.k(dVar2)) : y03;
        }

        @Override // java.lang.Comparable
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            int i4 = this.f88450b - aVar.f88450b;
            if (i4 == 0) {
                i4 = this.f88451c.compareTo(aVar.f88451c);
            }
            if (i4 == 0) {
                i4 = k().compareTo(aVar.k());
            }
            if (i4 != 0) {
                return i4;
            }
            long g02 = (this.f88455g * MMKV.ExpireInDay) + this.f88454f.g0();
            long g03 = (aVar.f88455g * MMKV.ExpireInDay) + aVar.f88454f.g0();
            if (g02 < g03) {
                return -1;
            }
            return g02 > g03 ? 1 : 0;
        }

        d l(s sVar, int i4) {
            org.threeten.bp.h hVar = (org.threeten.bp.h) g.this.g(org.threeten.bp.h.y0(((org.threeten.bp.g) g.this.g(k())).F0(this.f88455g), this.f88454f));
            s sVar2 = (s) g.this.g(s.A(sVar.v() + i4));
            return new d((org.threeten.bp.h) g.this.g(this.f88456h.createDateTime(hVar, sVar, sVar2)), sVar2, (s) g.this.g(s.A(sVar.v() + this.f88457i)));
        }

        e m(s sVar, int i4) {
            j jVar;
            if (this.f88452d < 0 && (jVar = this.f88451c) != j.FEBRUARY) {
                this.f88452d = jVar.maxLength() - 6;
            }
            d l4 = l(sVar, i4);
            return new e(this.f88451c, this.f88452d, this.f88453e, this.f88454f, this.f88455g, this.f88456h, sVar, l4.h(), l4.g());
        }
    }

    /* compiled from: ZoneRulesBuilder.java */
    class b {

        /* renamed from: a, reason: collision with root package name */
        private final s f88459a;

        /* renamed from: b, reason: collision with root package name */
        private final org.threeten.bp.h f88460b;

        /* renamed from: c, reason: collision with root package name */
        private final e.b f88461c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f88462d;

        /* renamed from: e, reason: collision with root package name */
        private List<a> f88463e = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        private int f88464f = -999999999;

        /* renamed from: g, reason: collision with root package name */
        private List<a> f88465g = new ArrayList();

        b(s sVar, org.threeten.bp.h hVar, e.b bVar) {
            this.f88460b = hVar;
            this.f88461c = bVar;
            this.f88459a = sVar;
        }

        void e(int i4, int i5, j jVar, int i6, org.threeten.bp.d dVar, org.threeten.bp.i iVar, int i7, e.b bVar, int i10) {
            boolean z4;
            if (this.f88462d != null) {
                throw new IllegalStateException("Window has a fixed DST saving, so cannot have DST rules");
            }
            if (this.f88463e.size() >= 2000) {
                throw new IllegalStateException("Window has reached the maximum number of allowed rules");
            }
            int i11 = i5;
            if (i11 == 999999999) {
                z4 = true;
                i11 = i4;
            } else {
                z4 = false;
            }
            for (int i12 = i4; i12 <= i11; i12++) {
                a aVar = g.this.new a(i12, jVar, i6, dVar, iVar, i7, bVar, i10);
                if (z4) {
                    this.f88465g.add(aVar);
                    this.f88464f = Math.max(i4, this.f88464f);
                } else {
                    this.f88463e.add(aVar);
                }
            }
        }

        long f(int i4) {
            s g4 = g(i4);
            return this.f88461c.createDateTime(this.f88460b, this.f88459a, g4).z(g4);
        }

        s g(int i4) {
            return s.A(this.f88459a.v() + i4);
        }

        boolean h() {
            return this.f88460b.equals(org.threeten.bp.h.f88235f) && this.f88461c == e.b.WALL && this.f88462d == null && this.f88465g.isEmpty() && this.f88463e.isEmpty();
        }

        void i(int i4) {
            if (this.f88463e.size() > 0 || this.f88465g.size() > 0) {
                throw new IllegalStateException("Window has DST rules, so cannot have fixed savings");
            }
            this.f88462d = Integer.valueOf(i4);
        }

        void j(int i4) {
            if (this.f88465g.size() == 1) {
                throw new IllegalStateException("Cannot have only one rule defined as being forever");
            }
            if (this.f88460b.equals(org.threeten.bp.h.f88235f)) {
                this.f88464f = Math.max(this.f88464f, i4) + 1;
                for (a aVar : this.f88465g) {
                    e(aVar.f88450b, this.f88464f, aVar.f88451c, aVar.f88452d, aVar.f88453e, aVar.f88454f, aVar.f88455g, aVar.f88456h, aVar.f88457i);
                    aVar.f88450b = this.f88464f + 1;
                }
                int i5 = this.f88464f;
                if (i5 == 999999999) {
                    this.f88465g.clear();
                } else {
                    this.f88464f = i5 + 1;
                }
            } else {
                int a02 = this.f88460b.a0();
                for (a aVar2 : this.f88465g) {
                    e(aVar2.f88450b, a02 + 1, aVar2.f88451c, aVar2.f88452d, aVar2.f88453e, aVar2.f88454f, aVar2.f88455g, aVar2.f88456h, aVar2.f88457i);
                }
                this.f88465g.clear();
                this.f88464f = 999999999;
            }
            Collections.sort(this.f88463e);
            Collections.sort(this.f88465g);
            if (this.f88463e.size() == 0 && this.f88462d == null) {
                this.f88462d = 0;
            }
        }

        void k(b bVar) {
            if (this.f88460b.r(bVar.f88460b)) {
                throw new IllegalStateException("Windows must be added in date-time order: " + this.f88460b + " < " + bVar.f88460b);
            }
        }
    }

    g a(int i4, int i5, j jVar, int i6, org.threeten.bp.d dVar, org.threeten.bp.i iVar, int i7, e.b bVar, int i10) {
        ng.d.j(jVar, "month");
        ng.d.j(bVar, "timeDefinition");
        org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.YEAR;
        aVar.checkValidValue(i4);
        aVar.checkValidValue(i5);
        if (i6 < -28 || i6 > 31 || i6 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (this.f88448a.isEmpty()) {
            throw new IllegalStateException("Must add a window before adding a rule");
        }
        ((b) androidx.appcompat.view.menu.d.a(this.f88448a, 1)).e(i4, i5, jVar, i6, dVar, iVar, i7, bVar, i10);
        return this;
    }

    public g b(int i4, int i5, j jVar, int i6, org.threeten.bp.d dVar, org.threeten.bp.i iVar, boolean z4, e.b bVar, int i7) {
        ng.d.j(jVar, "month");
        ng.d.j(iVar, "time");
        ng.d.j(bVar, "timeDefinition");
        org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.YEAR;
        aVar.checkValidValue(i4);
        aVar.checkValidValue(i5);
        if (i6 < -28 || i6 > 31 || i6 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z4 && !iVar.equals(org.threeten.bp.i.f88243h)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (this.f88448a.isEmpty()) {
            throw new IllegalStateException("Must add a window before adding a rule");
        }
        ((b) androidx.appcompat.view.menu.d.a(this.f88448a, 1)).e(i4, i5, jVar, i6, dVar, iVar, z4 ? 1 : 0, bVar, i7);
        return this;
    }

    public g c(int i4, j jVar, int i5, org.threeten.bp.i iVar, boolean z4, e.b bVar, int i6) {
        return b(i4, i4, jVar, i5, null, iVar, z4, bVar, i6);
    }

    public g d(org.threeten.bp.h hVar, e.b bVar, int i4) {
        ng.d.j(hVar, "transitionDateTime");
        return b(hVar.a0(), hVar.a0(), hVar.V(), hVar.P(), null, hVar.C(), false, bVar, i4);
    }

    public g e(s sVar, org.threeten.bp.h hVar, e.b bVar) {
        ng.d.j(sVar, "standardOffset");
        ng.d.j(hVar, "until");
        ng.d.j(bVar, "untilDefinition");
        b bVar2 = new b(sVar, hVar, bVar);
        if (this.f88448a.size() > 0) {
            bVar2.k((b) androidx.appcompat.view.menu.d.a(this.f88448a, 1));
        }
        this.f88448a.add(bVar2);
        return this;
    }

    public g f(s sVar) {
        return e(sVar, org.threeten.bp.h.f88235f, e.b.WALL);
    }

    <T> T g(T t4) {
        if (!this.f88449b.containsKey(t4)) {
            this.f88449b.put(t4, t4);
        }
        return (T) this.f88449b.get(t4);
    }

    public g h(int i4) {
        if (this.f88448a.isEmpty()) {
            throw new IllegalStateException("Must add a window before setting the fixed savings");
        }
        ((b) androidx.appcompat.view.menu.d.a(this.f88448a, 1)).i(i4);
        return this;
    }

    public f i(String str) {
        return j(str, new HashMap());
    }

    f j(String str, Map<Object, Object> map) {
        int i4;
        ng.d.j(str, "zoneId");
        this.f88449b = map;
        if (this.f88448a.isEmpty()) {
            throw new IllegalStateException("No windows have been added to the builder");
        }
        ArrayList arrayList = new ArrayList(4);
        ArrayList arrayList2 = new ArrayList(256);
        ArrayList arrayList3 = new ArrayList(2);
        int i5 = 0;
        b bVar = this.f88448a.get(0);
        s sVar = bVar.f88459a;
        int intValue = bVar.f88462d != null ? bVar.f88462d.intValue() : 0;
        s sVar2 = (s) g(s.A(sVar.v() + intValue));
        org.threeten.bp.h hVar = (org.threeten.bp.h) g(org.threeten.bp.h.s0(-999999999, 1, 1, 0, 0));
        s sVar3 = sVar2;
        for (b bVar2 : this.f88448a) {
            bVar2.j(hVar.a0());
            Integer num = bVar2.f88462d;
            if (num == null) {
                num = Integer.valueOf(i5);
                for (a aVar : bVar2.f88463e) {
                    if (aVar.l(sVar, intValue).o() > hVar.z(sVar3)) {
                        break;
                    }
                    num = Integer.valueOf(aVar.f88457i);
                }
            }
            if (!sVar.equals(bVar2.f88459a)) {
                arrayList.add(g(new d(org.threeten.bp.h.z0(hVar.z(sVar3), i5, sVar), sVar, bVar2.f88459a)));
                sVar = (s) g(bVar2.f88459a);
            }
            s sVar4 = (s) g(s.A(num.intValue() + sVar.v()));
            if (!sVar3.equals(sVar4)) {
                arrayList2.add((d) g(new d(hVar, sVar3, sVar4)));
            }
            intValue = num.intValue();
            for (a aVar2 : bVar2.f88463e) {
                d dVar = (d) g(aVar2.l(sVar, intValue));
                if (dVar.o() >= hVar.z(sVar3) && dVar.o() < bVar2.f(intValue)) {
                    i4 = intValue;
                    if (!dVar.h().equals(dVar.g())) {
                        arrayList2.add(dVar);
                        intValue = aVar2.f88457i;
                    }
                } else {
                    i4 = intValue;
                }
                intValue = i4;
            }
            for (a aVar3 : bVar2.f88465g) {
                arrayList3.add((e) g(aVar3.m(sVar, intValue)));
                intValue = aVar3.f88457i;
            }
            sVar3 = (s) g(bVar2.g(intValue));
            i5 = 0;
            hVar = (org.threeten.bp.h) g(org.threeten.bp.h.z0(bVar2.f(intValue), 0, sVar3));
        }
        return new org.threeten.bp.zone.b(bVar.f88459a, sVar2, arrayList, arrayList2, arrayList3);
    }
}
