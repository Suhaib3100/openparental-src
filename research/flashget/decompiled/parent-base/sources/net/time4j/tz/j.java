package net.time4j.tz;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: SingleOffsetTimezone.java */
/* loaded from: classes7.dex */
final class j extends l implements m {
    private static final j A = new j(p.f83649l);
    private static final long serialVersionUID = 7807230388259573234L;
    private final p offset;

    private j(p pVar) {
        if (pVar.h() == 0) {
            this.offset = pVar;
        } else {
            int i4 = pVar.i();
            this.offset = p.p(pVar.h() < 0 ? i4 - 1 : i4, 0);
        }
    }

    static j i0(p pVar) {
        return (pVar.i() == 0 && pVar.h() == 0) ? A : new j(pVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        if (this.offset.h() != 0) {
            throw new InvalidObjectException(ProtectedSandApp.s("飨\u0001"));
        }
    }

    @Override // net.time4j.tz.l
    public p B(net.time4j.base.f fVar) {
        return p.f83649l;
    }

    @Override // net.time4j.tz.l
    public String D(d dVar, Locale locale) {
        return dVar.isAbbreviation() ? this.offset.toString() : this.offset.canonical();
    }

    @Override // net.time4j.tz.l
    public m F() {
        return this;
    }

    @Override // net.time4j.tz.l
    public k G() {
        return this.offset;
    }

    @Override // net.time4j.tz.l
    public p H(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return this.offset;
    }

    @Override // net.time4j.tz.l
    public p I(net.time4j.base.f fVar) {
        return this.offset;
    }

    @Override // net.time4j.tz.l
    public p N(net.time4j.base.f fVar) {
        return this.offset;
    }

    @Override // net.time4j.tz.l
    public o O() {
        return l.f83557e;
    }

    @Override // net.time4j.tz.l
    public boolean T(net.time4j.base.f fVar) {
        return false;
    }

    @Override // net.time4j.tz.l
    public boolean U() {
        return true;
    }

    @Override // net.time4j.tz.l
    public boolean V(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return false;
    }

    @Override // net.time4j.tz.m
    public q a(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return null;
    }

    @Override // net.time4j.tz.m
    public List<q> b() {
        return Collections.emptyList();
    }

    @Override // net.time4j.tz.m
    public List<q> c(net.time4j.base.f fVar, net.time4j.base.f fVar2) {
        return Collections.emptyList();
    }

    @Override // net.time4j.tz.m
    public q d(net.time4j.base.f fVar) {
        return null;
    }

    @Override // net.time4j.tz.m
    public boolean e() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return this.offset.equals(((j) obj).offset);
        }
        return false;
    }

    @Override // net.time4j.tz.m
    public p f() {
        return this.offset;
    }

    @Override // net.time4j.tz.m
    public List<p> h(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return Collections.singletonList(this.offset);
    }

    @Override // net.time4j.tz.l
    public l h0(o oVar) {
        return this;
    }

    public int hashCode() {
        return this.offset.hashCode();
    }

    @Override // net.time4j.tz.m
    public q i(net.time4j.base.f fVar) {
        return null;
    }

    @Override // net.time4j.tz.m
    public boolean isEmpty() {
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append('[');
        sb.append(j.class.getName());
        sb.append(':');
        sb.append(this.offset);
        sb.append(']');
        return sb.toString();
    }
}
