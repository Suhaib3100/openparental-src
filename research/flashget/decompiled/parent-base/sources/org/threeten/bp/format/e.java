package org.threeten.bp.format;

import androidx.compose.runtime.z4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.threeten.bp.chrono.o;
import org.threeten.bp.format.d;
import org.threeten.bp.r;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* compiled from: DateTimeParseContext.java */
/* loaded from: classes9.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private Locale f88188a;

    /* renamed from: b, reason: collision with root package name */
    private h f88189b;

    /* renamed from: c, reason: collision with root package name */
    private org.threeten.bp.chrono.j f88190c;

    /* renamed from: d, reason: collision with root package name */
    private r f88191d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f88192e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f88193f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList<b> f88194g;

    /* compiled from: DateTimeParseContext.java */
    final class b extends ng.c {

        /* renamed from: b, reason: collision with root package name */
        org.threeten.bp.chrono.j f88195b;

        /* renamed from: c, reason: collision with root package name */
        r f88196c;

        /* renamed from: d, reason: collision with root package name */
        final Map<org.threeten.bp.temporal.j, Long> f88197d;

        /* renamed from: e, reason: collision with root package name */
        boolean f88198e;

        /* renamed from: f, reason: collision with root package name */
        org.threeten.bp.n f88199f;

        /* renamed from: g, reason: collision with root package name */
        List<Object[]> f88200g;

        @Override // ng.c, org.threeten.bp.temporal.f
        public int get(org.threeten.bp.temporal.j jVar) {
            if (this.f88197d.containsKey(jVar)) {
                return ng.d.r(this.f88197d.get(jVar).longValue());
            }
            throw new UnsupportedTemporalTypeException(org.threeten.bp.c.a("Unsupported field: ", jVar));
        }

        @Override // org.threeten.bp.temporal.f
        public long getLong(org.threeten.bp.temporal.j jVar) {
            if (this.f88197d.containsKey(jVar)) {
                return this.f88197d.get(jVar).longValue();
            }
            throw new UnsupportedTemporalTypeException(org.threeten.bp.c.a("Unsupported field: ", jVar));
        }

        @Override // org.threeten.bp.temporal.f
        public boolean isSupported(org.threeten.bp.temporal.j jVar) {
            return this.f88197d.containsKey(jVar);
        }

        protected b l() {
            b bVar = e.this.new b();
            bVar.f88195b = this.f88195b;
            bVar.f88196c = this.f88196c;
            bVar.f88197d.putAll(this.f88197d);
            bVar.f88198e = this.f88198e;
            return bVar;
        }

        org.threeten.bp.format.a m() {
            org.threeten.bp.format.a aVar = new org.threeten.bp.format.a();
            aVar.f88094b.putAll(this.f88197d);
            aVar.f88095c = e.this.h();
            r rVar = this.f88196c;
            if (rVar != null) {
                aVar.f88096d = rVar;
            } else {
                aVar.f88096d = e.this.f88191d;
            }
            aVar.f88099g = this.f88198e;
            aVar.f88100h = this.f88199f;
            return aVar;
        }

        @Override // ng.c, org.threeten.bp.temporal.f
        public <R> R query(org.threeten.bp.temporal.l<R> lVar) {
            return lVar == org.threeten.bp.temporal.k.a() ? (R) this.f88195b : (lVar == org.threeten.bp.temporal.k.g() || lVar == org.threeten.bp.temporal.k.f()) ? (R) this.f88196c : (R) super.query(lVar);
        }

        public String toString() {
            return this.f88197d.toString() + "," + this.f88195b + "," + this.f88196c;
        }

        private b() {
            this.f88195b = null;
            this.f88196c = null;
            this.f88197d = new HashMap();
            this.f88199f = org.threeten.bp.n.f88288e;
        }
    }

    e(c cVar) {
        this.f88192e = true;
        this.f88193f = true;
        ArrayList<b> arrayList = new ArrayList<>();
        this.f88194g = arrayList;
        this.f88188a = cVar.h();
        this.f88189b = cVar.g();
        this.f88190c = cVar.f();
        this.f88191d = cVar.k();
        arrayList.add(new b());
    }

    static boolean d(char c5, char c6) {
        return c5 == c6 || Character.toUpperCase(c5) == Character.toUpperCase(c6) || Character.toLowerCase(c5) == Character.toLowerCase(c6);
    }

    private b f() {
        return (b) z4.a(this.f88194g, 1);
    }

    void b(d.q qVar, long j4, int i4, int i5) {
        b f4 = f();
        if (f4.f88200g == null) {
            f4.f88200g = new ArrayList(2);
        }
        f4.f88200g.add(new Object[]{qVar, Long.valueOf(j4), Integer.valueOf(i4), Integer.valueOf(i5)});
    }

    boolean c(char c5, char c6) {
        return this.f88192e ? c5 == c6 : d(c5, c6);
    }

    e e() {
        return new e(this);
    }

    void g(boolean z4) {
        if (z4) {
            this.f88194g.remove(r2.size() - 2);
        } else {
            this.f88194g.remove(r2.size() - 1);
        }
    }

    org.threeten.bp.chrono.j h() {
        org.threeten.bp.chrono.j jVar = f().f88195b;
        if (jVar != null) {
            return jVar;
        }
        org.threeten.bp.chrono.j jVar2 = this.f88190c;
        return jVar2 == null ? o.f88011f : jVar2;
    }

    Locale i() {
        return this.f88188a;
    }

    Long j(org.threeten.bp.temporal.j jVar) {
        return f().f88197d.get(jVar);
    }

    h k() {
        return this.f88189b;
    }

    boolean l() {
        return this.f88192e;
    }

    boolean m() {
        return this.f88193f;
    }

    void n(boolean z4) {
        this.f88192e = z4;
    }

    void o(Locale locale) {
        ng.d.j(locale, "locale");
        this.f88188a = locale;
    }

    void p(r rVar) {
        ng.d.j(rVar, "zone");
        f().f88196c = rVar;
    }

    void q(org.threeten.bp.chrono.j jVar) {
        ng.d.j(jVar, "chrono");
        b f4 = f();
        f4.f88195b = jVar;
        if (f4.f88200g != null) {
            ArrayList arrayList = new ArrayList(f4.f88200g);
            f4.f88200g.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object[] objArr = (Object[]) it.next();
                ((d.q) objArr[0]).c(this, ((Long) objArr[1]).longValue(), ((Integer) objArr[2]).intValue(), ((Integer) objArr[3]).intValue());
            }
        }
    }

    int r(org.threeten.bp.temporal.j jVar, long j4, int i4, int i5) {
        ng.d.j(jVar, "field");
        Long put = f().f88197d.put(jVar, Long.valueOf(j4));
        return (put == null || put.longValue() == j4) ? i5 : ~i4;
    }

    void s() {
        f().f88198e = true;
    }

    void t(boolean z4) {
        this.f88193f = z4;
    }

    public String toString() {
        return f().toString();
    }

    void u() {
        this.f88194g.add(f().l());
    }

    boolean v(CharSequence charSequence, int i4, CharSequence charSequence2, int i5, int i6) {
        if (i4 + i6 > charSequence.length() || i5 + i6 > charSequence2.length()) {
            return false;
        }
        if (this.f88192e) {
            for (int i7 = 0; i7 < i6; i7++) {
                if (charSequence.charAt(i4 + i7) != charSequence2.charAt(i5 + i7)) {
                    return false;
                }
            }
            return true;
        }
        for (int i10 = 0; i10 < i6; i10++) {
            char charAt = charSequence.charAt(i4 + i10);
            char charAt2 = charSequence2.charAt(i5 + i10);
            if (charAt != charAt2 && Character.toUpperCase(charAt) != Character.toUpperCase(charAt2) && Character.toLowerCase(charAt) != Character.toLowerCase(charAt2)) {
                return false;
            }
        }
        return true;
    }

    b w() {
        return f();
    }

    e(Locale locale, h hVar, org.threeten.bp.chrono.j jVar) {
        this.f88192e = true;
        this.f88193f = true;
        ArrayList<b> arrayList = new ArrayList<>();
        this.f88194g = arrayList;
        this.f88188a = locale;
        this.f88189b = hVar;
        this.f88190c = jVar;
        this.f88191d = null;
        arrayList.add(new b());
    }

    e(e eVar) {
        this.f88192e = true;
        this.f88193f = true;
        ArrayList<b> arrayList = new ArrayList<>();
        this.f88194g = arrayList;
        this.f88188a = eVar.f88188a;
        this.f88189b = eVar.f88189b;
        this.f88190c = eVar.f88190c;
        this.f88191d = eVar.f88191d;
        this.f88192e = eVar.f88192e;
        this.f88193f = eVar.f88193f;
        arrayList.add(new b());
    }
}
