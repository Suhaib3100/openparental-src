package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.regex.Pattern;
import org.threeten.bp.zone.ZoneRulesException;

/* compiled from: ZoneRegion.java */
/* loaded from: classes9.dex */
final class t extends r implements Serializable {

    /* renamed from: g, reason: collision with root package name */
    private static final long f88342g = 8386373296231747096L;

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f88343h = Pattern.compile("[A-Za-z][A-Za-z0-9~/._+-]+");

    /* renamed from: e, reason: collision with root package name */
    private final String f88344e;

    /* renamed from: f, reason: collision with root package name */
    private final transient org.threeten.bp.zone.f f88345f;

    t(String str, org.threeten.bp.zone.f fVar) {
        this.f88344e = str;
        this.f88345f = fVar;
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    static t s(String str, boolean z4) {
        org.threeten.bp.zone.f fVar;
        ng.d.j(str, "zoneId");
        if (str.length() < 2 || !f88343h.matcher(str).matches()) {
            throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
        }
        try {
            fVar = org.threeten.bp.zone.i.c(str, true);
        } catch (ZoneRulesException e4) {
            if (str.equals("GMT0")) {
                s sVar = s.f88337o;
                sVar.getClass();
                fVar = org.threeten.bp.zone.f.m(sVar);
            } else {
                if (z4) {
                    throw e4;
                }
                fVar = null;
            }
        }
        return new t(str, fVar);
    }

    private static t t(String str) {
        if (str.equals("Z") || str.startsWith("+") || str.startsWith("-")) {
            throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
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
            return s(str, false);
        }
        s w5 = s.w(str.substring(2));
        if (w5.v() == 0) {
            return new t("UT", org.threeten.bp.zone.f.m(w5));
        }
        return new t("UT" + w5.j(), org.threeten.bp.zone.f.m(w5));
    }

    static r u(DataInput dataInput) throws IOException {
        return t(dataInput.readUTF());
    }

    private Object writeReplace() {
        return new o((byte) 7, this);
    }

    @Override // org.threeten.bp.r
    public String j() {
        return this.f88344e;
    }

    @Override // org.threeten.bp.r
    public org.threeten.bp.zone.f l() {
        org.threeten.bp.zone.f fVar = this.f88345f;
        return fVar != null ? fVar : org.threeten.bp.zone.i.c(this.f88344e, false);
    }

    @Override // org.threeten.bp.r
    void r(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(7);
        v(dataOutput);
    }

    void v(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(this.f88344e);
    }
}
