package net.time4j.tz;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.mmkv.MMKV;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: PlatformTimezone.java */
/* loaded from: classes7.dex */
final class h extends l {
    private static final long serialVersionUID = -8432968264242113551L;
    private final transient p A;

    /* renamed from: id, reason: collision with root package name */
    private final k f83551id;
    private final boolean strict;
    private final TimeZone tz;

    h() {
        this.f83551id = null;
        this.tz = null;
        this.strict = false;
        this.A = null;
    }

    static TimeZone i0(String str) {
        if (str.equals(ProtectedSandApp.s("飥\u0001"))) {
            return TimeZone.getTimeZone(ProtectedSandApp.s("飦\u0001"));
        }
        boolean startsWith = str.startsWith(ProtectedSandApp.s("飢\u0001"));
        String s4 = ProtectedSandApp.s("飞\u0001");
        if (startsWith) {
            return TimeZone.getTimeZone(s4 + str.substring(3));
        }
        if (!str.startsWith(ProtectedSandApp.s("飧\u0001"))) {
            return TimeZone.getTimeZone(str);
        }
        return TimeZone.getTimeZone(s4 + str.substring(2));
    }

    private static p j0(int i4) {
        return p.o(net.time4j.base.c.a(i4, 1000));
    }

    private Object readResolve() {
        k kVar = this.f83551id;
        return kVar == null ? new h() : new h(kVar, this.tz, this.strict);
    }

    @Override // net.time4j.tz.l
    public p B(net.time4j.base.f fVar) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(this.f83551id == null ? TimeZone.getDefault() : this.tz);
        gregorianCalendar.setTimeInMillis(fVar.j() * 1000);
        return j0(gregorianCalendar.get(16));
    }

    @Override // net.time4j.tz.l
    public String D(d dVar, Locale locale) {
        return (this.f83551id == null ? TimeZone.getDefault() : this.tz).getDisplayName(dVar.isDaylightSaving(), !dVar.isAbbreviation() ? 1 : 0, locale);
    }

    @Override // net.time4j.tz.l
    public m F() {
        p pVar = this.A;
        if (pVar == null) {
            return null;
        }
        pVar.getClass();
        return j.i0(pVar);
    }

    @Override // net.time4j.tz.l
    public k G() {
        k kVar = this.f83551id;
        return kVar == null ? new e(TimeZone.getDefault().getID()) : kVar;
    }

    @Override // net.time4j.tz.l
    public p H(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        int i4;
        int i5;
        int i6;
        p pVar = this.A;
        if (pVar != null) {
            return pVar;
        }
        int o4 = aVar.o();
        int q4 = aVar.q();
        int t4 = aVar.t();
        if (gVar.u() == 24) {
            long l4 = net.time4j.base.b.l(net.time4j.base.c.f(net.time4j.base.b.k(aVar), 1L));
            i4 = (int) (l4 & 255);
            q4 = net.time4j.base.b.h(l4);
            o4 = (int) (l4 >> 32);
        } else {
            i4 = t4;
        }
        if (o4 > 0) {
            i6 = o4;
            i5 = 1;
        } else {
            i5 = 0;
            i6 = 1 - o4;
        }
        int c5 = net.time4j.base.b.c(o4, q4, i4) + 1;
        return j0((this.f83551id == null ? TimeZone.getDefault() : this.tz).getOffset(i5, i6, q4 - 1, i4, c5 == 8 ? 1 : c5, gVar.u() == 24 ? 0 : (gVar.a() / 1000000) + ((gVar.h() + (gVar.m() * 60) + (gVar.u() * MMKV.ExpireInHour)) * 1000)));
    }

    @Override // net.time4j.tz.l
    public p I(net.time4j.base.f fVar) {
        TimeZone timeZone;
        if (this.f83551id == null) {
            timeZone = TimeZone.getDefault();
        } else {
            p pVar = this.A;
            if (pVar != null) {
                return pVar;
            }
            timeZone = this.tz;
        }
        return j0(timeZone.getOffset(fVar.j() * 1000));
    }

    @Override // net.time4j.tz.l
    public p N(net.time4j.base.f fVar) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(this.f83551id == null ? TimeZone.getDefault() : this.tz);
        gregorianCalendar.setTimeInMillis(fVar.j() * 1000);
        return j0(gregorianCalendar.get(15));
    }

    @Override // net.time4j.tz.l
    public o O() {
        return this.strict ? l.f83558f : l.f83557e;
    }

    @Override // net.time4j.tz.l
    public boolean T(net.time4j.base.f fVar) {
        if (this.A != null) {
            return false;
        }
        return (this.f83551id == null ? TimeZone.getDefault() : this.tz).inDaylightTime(new Date(fVar.j() * 1000));
    }

    @Override // net.time4j.tz.l
    public boolean U() {
        return this.A != null;
    }

    @Override // net.time4j.tz.l
    public boolean V(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        if (this.A != null) {
            return false;
        }
        int o4 = aVar.o();
        int q4 = aVar.q();
        int t4 = aVar.t();
        int u4 = gVar.u();
        int m4 = gVar.m();
        int h4 = gVar.h();
        int a5 = gVar.a() / 1000000;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(this.f83551id == null ? TimeZone.getDefault() : this.tz);
        gregorianCalendar.set(14, a5);
        gregorianCalendar.set(o4, q4 - 1, t4, u4, m4, h4);
        return (gregorianCalendar.get(1) == o4 && gregorianCalendar.get(2) + 1 == q4 && gregorianCalendar.get(5) == t4 && gregorianCalendar.get(11) == u4 && gregorianCalendar.get(12) == m4 && gregorianCalendar.get(13) == h4 && gregorianCalendar.get(14) == a5) ? false : true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f83551id == null) {
                return hVar.f83551id == null;
            }
            if (this.tz.equals(hVar.tz) && this.strict == hVar.strict) {
                p pVar = this.A;
                return pVar == null ? hVar.A == null : pVar.equals(hVar.A);
            }
        }
        return false;
    }

    @Override // net.time4j.tz.l
    public l h0(o oVar) {
        if (this.f83551id == null || O() == oVar) {
            return this;
        }
        if (oVar == l.f83557e) {
            return new h(this.f83551id, this.tz, false);
        }
        if (oVar == l.f83558f) {
            return new h(this.f83551id, this.tz, true);
        }
        throw new UnsupportedOperationException(oVar.toString());
    }

    public int hashCode() {
        if (this.f83551id == null) {
            return 0;
        }
        return this.tz.hashCode();
    }

    boolean k0() {
        return (this.f83551id == null ? TimeZone.getDefault() : this.tz).getID().equals(ProtectedSandApp.s("飞\u0001"));
    }

    public String toString() {
        TimeZone timeZone = this.f83551id == null ? TimeZone.getDefault() : this.tz;
        StringBuilder sb = new StringBuilder(256);
        sb.append('[');
        sb.append(h.class.getName());
        sb.append(':');
        sb.append(timeZone);
        sb.append(']');
        return sb.toString();
    }

    h(k kVar) {
        this(kVar, TimeZone.getDefault(), false);
    }

    h(k kVar, String str) {
        this(kVar, i0(str), false);
    }

    private h(k kVar, TimeZone timeZone, boolean z4) {
        this.f83551id = kVar;
        TimeZone timeZone2 = (TimeZone) timeZone.clone();
        this.tz = timeZone2;
        this.strict = z4;
        if (timeZone2.useDaylightTime()) {
            this.A = null;
            return;
        }
        String id2 = timeZone2.getID();
        if (!id2.startsWith(ProtectedSandApp.s("飞\u0001")) && !id2.startsWith(ProtectedSandApp.s("食\u0001")) && !id2.equals(ProtectedSandApp.s("飠\u0001")) && !id2.equals(ProtectedSandApp.s("飡\u0001")) && !id2.equals(ProtectedSandApp.s("飢\u0001")) && !id2.equals(ProtectedSandApp.s("飣\u0001")) && !id2.equals(ProtectedSandApp.s("飤\u0001"))) {
            this.A = null;
        } else {
            this.A = j0(timeZone2.getOffset(System.currentTimeMillis()));
        }
    }
}
