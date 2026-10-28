package net.time4j.tz;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.List;

/* compiled from: HistorizedTimezone.java */
/* loaded from: classes7.dex */
final class c extends l {
    private static final long serialVersionUID = 1738909257417361021L;
    private final transient k A;
    private final transient m B;
    private final transient o C;

    c(k kVar, m mVar) {
        this(kVar, mVar, l.f83557e);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException(ProtectedSandApp.s("飒\u0001"));
    }

    private Object writeReplace() {
        return new SPX(this, 14);
    }

    @Override // net.time4j.tz.l
    public p B(net.time4j.base.f fVar) {
        q d5 = this.B.d(fVar);
        return d5 == null ? p.f83649l : p.o(d5.d());
    }

    @Override // net.time4j.tz.l
    public m F() {
        return this.B;
    }

    @Override // net.time4j.tz.l
    public k G() {
        return this.A;
    }

    @Override // net.time4j.tz.l
    public p H(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        List<p> h4 = this.B.h(aVar, gVar);
        return h4.size() == 1 ? h4.get(0) : p.o(this.B.a(aVar, gVar).i());
    }

    @Override // net.time4j.tz.l
    public p I(net.time4j.base.f fVar) {
        q d5 = this.B.d(fVar);
        return d5 == null ? this.B.f() : p.o(d5.i());
    }

    @Override // net.time4j.tz.l
    public p N(net.time4j.base.f fVar) {
        q d5 = this.B.d(fVar);
        return d5 == null ? this.B.f() : p.o(d5.h());
    }

    @Override // net.time4j.tz.l
    public o O() {
        return this.C;
    }

    @Override // net.time4j.tz.l
    public boolean T(net.time4j.base.f fVar) {
        net.time4j.base.f b5;
        q d5;
        q d6 = this.B.d(fVar);
        if (d6 == null) {
            return false;
        }
        int d7 = d6.d();
        if (d7 > 0) {
            return true;
        }
        if (d7 >= 0 && this.B.e() && (d5 = this.B.d((b5 = i.b(d6.e(), 0)))) != null) {
            return d5.h() == d6.h() ? d5.d() < 0 : T(b5);
        }
        return false;
    }

    @Override // net.time4j.tz.l
    public boolean U() {
        return this.B.isEmpty();
    }

    @Override // net.time4j.tz.l
    public boolean V(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        q a5 = this.B.a(aVar, gVar);
        return a5 != null && a5.j();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.A.canonical().equals(cVar.A.canonical()) && this.B.equals(cVar.B) && this.C.equals(cVar.C);
    }

    @Override // net.time4j.tz.l
    public l h0(o oVar) {
        return this.C == oVar ? this : new c(this.A, this.B, oVar);
    }

    public int hashCode() {
        return this.A.canonical().hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append('[');
        sb.append(c.class.getName());
        sb.append(':');
        sb.append(this.A.canonical());
        sb.append(ProtectedSandApp.s("飓\u0001"));
        sb.append(this.B);
        sb.append(ProtectedSandApp.s("飔\u0001"));
        sb.append(this.C);
        sb.append(']');
        return sb.toString();
    }

    c(k kVar, m mVar, o oVar) {
        if (kVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("飑\u0001"));
        }
        if ((kVar instanceof p) && !mVar.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("风\u0001") + kVar.canonical());
        }
        if (mVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("飐\u0001"));
        }
        if (oVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("飏\u0001"));
        }
        this.A = kVar;
        this.B = mVar;
        this.C = oVar;
    }
}
