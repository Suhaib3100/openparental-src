package org.threeten.bp.chrono;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Locale;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* compiled from: ThaiBuddhistEra.java */
/* loaded from: classes9.dex */
public enum z implements k {
    BEFORE_BE,
    BE;

    public static z of(int i4) {
        if (i4 == 0) {
            return BEFORE_BE;
        }
        if (i4 == 1) {
            return BE;
        }
        throw new DateTimeException("Era is not valid for ThaiBuddhistEra");
    }

    static z readExternal(DataInput dataInput) throws IOException {
        return of(dataInput.readByte());
    }

    private Object writeReplace() {
        return new w((byte) 8, this);
    }

    @Override // org.threeten.bp.temporal.g
    public org.threeten.bp.temporal.e adjustInto(org.threeten.bp.temporal.e eVar) {
        return eVar.b(org.threeten.bp.temporal.a.ERA, getValue());
    }

    @Override // org.threeten.bp.temporal.f
    public int get(org.threeten.bp.temporal.j jVar) {
        return jVar == org.threeten.bp.temporal.a.ERA ? getValue() : range(jVar).a(getLong(jVar), jVar);
    }

    @Override // org.threeten.bp.chrono.k
    public String getDisplayName(org.threeten.bp.format.n nVar, Locale locale) {
        return new org.threeten.bp.format.d().r(org.threeten.bp.temporal.a.ERA, nVar).Q(locale).d(this);
    }

    @Override // org.threeten.bp.temporal.f
    public long getLong(org.threeten.bp.temporal.j jVar) {
        if (jVar == org.threeten.bp.temporal.a.ERA) {
            return getValue();
        }
        if (jVar instanceof org.threeten.bp.temporal.a) {
            throw new UnsupportedTemporalTypeException(org.threeten.bp.c.a("Unsupported field: ", jVar));
        }
        return jVar.getFrom(this);
    }

    @Override // org.threeten.bp.chrono.k
    public int getValue() {
        return ordinal();
    }

    @Override // org.threeten.bp.temporal.f
    public boolean isSupported(org.threeten.bp.temporal.j jVar) {
        return jVar instanceof org.threeten.bp.temporal.a ? jVar == org.threeten.bp.temporal.a.ERA : jVar != null && jVar.isSupportedBy(this);
    }

    @Override // org.threeten.bp.temporal.f
    public <R> R query(org.threeten.bp.temporal.l<R> lVar) {
        if (lVar == org.threeten.bp.temporal.k.e()) {
            return (R) org.threeten.bp.temporal.b.ERAS;
        }
        if (lVar == org.threeten.bp.temporal.k.a() || lVar == org.threeten.bp.temporal.k.f() || lVar == org.threeten.bp.temporal.k.g() || lVar == org.threeten.bp.temporal.k.d() || lVar == org.threeten.bp.temporal.k.b() || lVar == org.threeten.bp.temporal.k.c()) {
            return null;
        }
        return lVar.a(this);
    }

    @Override // org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.n range(org.threeten.bp.temporal.j jVar) {
        if (jVar == org.threeten.bp.temporal.a.ERA) {
            return jVar.range();
        }
        if (jVar instanceof org.threeten.bp.temporal.a) {
            throw new UnsupportedTemporalTypeException(org.threeten.bp.c.a("Unsupported field: ", jVar));
        }
        return jVar.rangeRefinedBy(this);
    }

    void writeExternal(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(getValue());
    }
}
