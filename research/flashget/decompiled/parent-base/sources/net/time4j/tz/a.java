package net.time4j.tz;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: FallbackTimezone.java */
/* loaded from: classes7.dex */
final class a extends l {
    private static final long serialVersionUID = -2894726563499525332L;
    private final l fallback;
    private final k tzid;

    a(k kVar, l lVar) {
        if (kVar == null || lVar == null) {
            throw null;
        }
        this.tzid = kVar;
        this.fallback = lVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(ProtectedSandApp.s("飉\u0001"));
    }

    private Object writeReplace() {
        return new SPX(this, 12);
    }

    @Override // net.time4j.tz.l
    public p B(net.time4j.base.f fVar) {
        return this.fallback.B(fVar);
    }

    @Override // net.time4j.tz.l
    public m F() {
        return this.fallback.F();
    }

    @Override // net.time4j.tz.l
    public k G() {
        return this.tzid;
    }

    @Override // net.time4j.tz.l
    public p H(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return this.fallback.H(aVar, gVar);
    }

    @Override // net.time4j.tz.l
    public p I(net.time4j.base.f fVar) {
        return this.fallback.I(fVar);
    }

    @Override // net.time4j.tz.l
    public p N(net.time4j.base.f fVar) {
        return this.fallback.N(fVar);
    }

    @Override // net.time4j.tz.l
    public o O() {
        return this.fallback.O();
    }

    @Override // net.time4j.tz.l
    public boolean T(net.time4j.base.f fVar) {
        return this.fallback.T(fVar);
    }

    @Override // net.time4j.tz.l
    public boolean U() {
        return this.fallback.U();
    }

    @Override // net.time4j.tz.l
    public boolean V(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return this.fallback.V(aVar, gVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.tzid.canonical().equals(aVar.tzid.canonical()) && this.fallback.equals(aVar.fallback);
    }

    @Override // net.time4j.tz.l
    public l h0(o oVar) {
        return new a(this.tzid, this.fallback.h0(oVar));
    }

    public int hashCode() {
        return this.tzid.canonical().hashCode();
    }

    l i0() {
        return this.fallback;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append('[');
        sb.append(a.class.getName());
        sb.append(':');
        sb.append(this.tzid.canonical());
        sb.append(ProtectedSandApp.s("飊\u0001"));
        sb.append(this.fallback);
        sb.append(']');
        return sb.toString();
    }
}
