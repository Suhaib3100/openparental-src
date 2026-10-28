package org.threeten.bp;

import androidx.compose.material3.j4;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.zone.ZoneRulesException;

/* compiled from: ZoneId.java */
/* loaded from: classes9.dex */
public abstract class r implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final org.threeten.bp.temporal.l<r> f88325b = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final Map<String, String> f88326c;

    /* renamed from: d, reason: collision with root package name */
    private static final long f88327d = 8352817235686L;

    /* compiled from: ZoneId.java */
    class a implements org.threeten.bp.temporal.l<r> {
        a() {
        }

        @Override // org.threeten.bp.temporal.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public r a(org.threeten.bp.temporal.f fVar) {
            return r.a(fVar);
        }
    }

    /* compiled from: ZoneId.java */
    class b extends ng.c {
        b() {
        }

        @Override // org.threeten.bp.temporal.f
        public long getLong(org.threeten.bp.temporal.j jVar) {
            throw new UnsupportedTemporalTypeException(c.a("Unsupported field: ", jVar));
        }

        @Override // org.threeten.bp.temporal.f
        public boolean isSupported(org.threeten.bp.temporal.j jVar) {
            return false;
        }

        @Override // ng.c, org.threeten.bp.temporal.f
        public <R> R query(org.threeten.bp.temporal.l<R> lVar) {
            return lVar == org.threeten.bp.temporal.k.g() ? (R) r.this : (R) super.query(lVar);
        }
    }

    static {
        HashMap a5 = com.coremedia.iso.boxes.d.a("ACT", "Australia/Darwin", "AET", "Australia/Sydney");
        a5.put("AGT", "America/Argentina/Buenos_Aires");
        a5.put("ART", "Africa/Cairo");
        a5.put("AST", "America/Anchorage");
        a5.put("BET", "America/Sao_Paulo");
        a5.put("BST", "Asia/Dhaka");
        a5.put("CAT", "Africa/Harare");
        a5.put("CNT", "America/St_Johns");
        a5.put("CST", "America/Chicago");
        a5.put("CTT", "Asia/Shanghai");
        a5.put("EAT", "Africa/Addis_Ababa");
        a5.put("ECT", "Europe/Paris");
        a5.put("IET", "America/Indiana/Indianapolis");
        a5.put("IST", "Asia/Kolkata");
        a5.put("JST", "Asia/Tokyo");
        a5.put("MIT", "Pacific/Apia");
        a5.put("NET", "Asia/Yerevan");
        a5.put("NST", "Pacific/Auckland");
        a5.put("PLT", "Asia/Karachi");
        a5.put("PNT", "America/Phoenix");
        a5.put("PRT", "America/Puerto_Rico");
        a5.put("PST", "America/Los_Angeles");
        a5.put("SST", "Pacific/Guadalcanal");
        a5.put("VST", "Asia/Ho_Chi_Minh");
        a5.put("EST", "-05:00");
        a5.put("MST", "-07:00");
        a5.put("HST", "-10:00");
        f88326c = Collections.unmodifiableMap(a5);
    }

    r() {
        if (getClass() != s.class && getClass() != t.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public static r a(org.threeten.bp.temporal.f fVar) {
        r rVar = (r) fVar.query(org.threeten.bp.temporal.k.f());
        if (rVar != null) {
            return rVar;
        }
        throw new DateTimeException("Unable to obtain ZoneId from TemporalAccessor: " + fVar + ", type " + fVar.getClass().getName());
    }

    public static Set<String> h() {
        return new HashSet(org.threeten.bp.zone.i.a());
    }

    public static r n(String str) {
        ng.d.j(str, "zoneId");
        if (str.equals("Z")) {
            return s.f88337o;
        }
        if (str.length() == 1) {
            throw new DateTimeException("Invalid zone: ".concat(str));
        }
        if (str.startsWith("+") || str.startsWith("-")) {
            return s.w(str);
        }
        if (str.equals("UTC") || str.equals("GMT") || str.equals("UT")) {
            s sVar = s.f88337o;
            sVar.getClass();
            return new t(str, org.threeten.bp.zone.f.m(sVar));
        }
        if (str.startsWith("UTC+") || str.startsWith("GMT+") || str.startsWith("UTC-") || str.startsWith("GMT-")) {
            s w4 = s.w(str.substring(3));
            if (w4.v() == 0) {
                return new t(str.substring(0, 3), org.threeten.bp.zone.f.m(w4));
            }
            return new t(str.substring(0, 3) + w4.j(), org.threeten.bp.zone.f.m(w4));
        }
        if (!str.startsWith("UT+") && !str.startsWith("UT-")) {
            return t.s(str, true);
        }
        s w5 = s.w(str.substring(2));
        if (w5.v() == 0) {
            return new t("UT", org.threeten.bp.zone.f.m(w5));
        }
        return new t("UT" + w5.j(), org.threeten.bp.zone.f.m(w5));
    }

    public static r o(String str, Map<String, String> map) {
        ng.d.j(str, "zoneId");
        ng.d.j(map, "aliasMap");
        String str2 = map.get(str);
        if (str2 != null) {
            str = str2;
        }
        return n(str);
    }

    public static r p(String str, s sVar) {
        ng.d.j(str, "prefix");
        ng.d.j(sVar, "offset");
        if (str.length() == 0) {
            return sVar;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("Invalid prefix, must be GMT, UTC or UT: ".concat(str));
        }
        if (sVar.v() == 0) {
            return new t(str, org.threeten.bp.zone.f.m(sVar));
        }
        StringBuilder a5 = j4.a(str);
        a5.append(sVar.j());
        return new t(a5.toString(), org.threeten.bp.zone.f.m(sVar));
    }

    public static r q() {
        return o(TimeZone.getDefault().getID(), f88326c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return j().equals(((r) obj).j());
        }
        return false;
    }

    public String getDisplayName(org.threeten.bp.format.n nVar, Locale locale) {
        return new org.threeten.bp.format.d().B(nVar).Q(locale).d(new b());
    }

    public int hashCode() {
        return j().hashCode();
    }

    public abstract String j();

    public abstract org.threeten.bp.zone.f l();

    public r m() {
        try {
            org.threeten.bp.zone.f l4 = l();
            if (l4.j()) {
                return l4.b(f.f88077d);
            }
        } catch (ZoneRulesException unused) {
        }
        return this;
    }

    abstract void r(DataOutput dataOutput) throws IOException;

    public String toString() {
        return j();
    }
}
