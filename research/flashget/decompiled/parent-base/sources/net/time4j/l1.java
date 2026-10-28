package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.text.ParseException;
import net.time4j.engine.ChronoException;

/* compiled from: ZonalDateTime.java */
/* loaded from: classes7.dex */
public final class l1 implements net.time4j.engine.p, net.time4j.scale.g {

    /* renamed from: b, reason: collision with root package name */
    private final d0 f83352b;

    /* renamed from: c, reason: collision with root package name */
    private final net.time4j.tz.l f83353c;

    /* renamed from: d, reason: collision with root package name */
    private final transient n0 f83354d;

    private l1(d0 d0Var, net.time4j.tz.l lVar) {
        this.f83353c = lVar;
        net.time4j.tz.p I = lVar.I(d0Var);
        if (!d0Var.n() || (I.h() == 0 && I.g() % 60 == 0)) {
            this.f83352b = d0Var;
            this.f83354d = n0.j0(d0Var, I);
        } else {
            throw new IllegalArgumentException(ProtectedSandApp.s("鞩\u0001") + I);
        }
    }

    static l1 k(d0 d0Var, net.time4j.tz.l lVar) {
        return new l1(d0Var, lVar);
    }

    static l1 m(n0 n0Var, net.time4j.tz.p pVar) {
        return new l1(n0Var, pVar);
    }

    public static l1 o(String str, net.time4j.format.t<d0> tVar) {
        net.time4j.tz.l x4;
        String s4 = ProtectedSandApp.s("鞪\u0001");
        try {
            net.time4j.format.r rVar = new net.time4j.format.r();
            d0 j4 = tVar.j(str, rVar);
            if (rVar.b().e()) {
                x4 = x(rVar.b().v(), str);
            } else {
                net.time4j.engine.d i4 = tVar.i();
                net.time4j.engine.c<net.time4j.tz.k> cVar = net.time4j.format.a.f82782d;
                if (!i4.c(cVar)) {
                    throw new ChronoException(s4 + str);
                }
                x4 = x((net.time4j.tz.k) tVar.i().a(cVar), str);
            }
            return new l1(j4, x4);
        } catch (ParseException e4) {
            throw new ChronoException(e4.getMessage(), (Throwable) e4);
        }
    }

    public static l1 s(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        return new l1((d0) objectInput.readObject(), (net.time4j.tz.l) objectInput.readObject());
    }

    private static net.time4j.tz.l x(net.time4j.tz.k kVar, String str) {
        try {
            return net.time4j.tz.l.c0(kVar);
        } catch (IllegalArgumentException e4) {
            throw new ChronoException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("鞫\u0001"), str), (Throwable) e4);
        }
    }

    @Override // net.time4j.base.f
    public int a() {
        return this.f83352b.a();
    }

    public int b(l1 l1Var) {
        int compareTo = this.f83354d.compareTo(l1Var.f83354d);
        return compareTo == 0 ? this.f83352b.compareTo(l1Var.f83352b) : compareTo;
    }

    @Override // net.time4j.scale.g
    public long c(net.time4j.scale.f fVar) {
        return this.f83352b.c(fVar);
    }

    public int d(l1 l1Var) {
        int compareTo = this.f83352b.compareTo(l1Var.f83352b);
        return compareTo == 0 ? this.f83354d.compareTo(l1Var.f83354d) : compareTo;
    }

    @Override // net.time4j.engine.p
    public boolean e() {
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return this.f83352b.equals(l1Var.f83352b) && this.f83353c.equals(l1Var.f83353c);
    }

    public net.time4j.tz.p f() {
        return this.f83353c.I(this.f83352b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // net.time4j.engine.p
    public <V> V g(net.time4j.engine.q<V> qVar) {
        V v4 = this.f83354d.w(qVar) ? (V) this.f83354d.g(qVar) : (V) this.f83352b.g(qVar);
        if (qVar == m0.C && this.f83354d.o() >= 1972) {
            n0 n0Var = (n0) this.f83354d.M(qVar, v4);
            if (!this.f83353c.V(n0Var, n0Var) && n0Var.n0(this.f83353c).Y0(1L, u0.SECONDS).n()) {
                return qVar.getType().cast(60);
            }
        }
        return v4;
    }

    net.time4j.tz.l h() {
        return this.f83353c;
    }

    public int hashCode() {
        return this.f83352b.hashCode() ^ this.f83353c.hashCode();
    }

    @Override // net.time4j.engine.p
    public <V> V i(net.time4j.engine.q<V> qVar) {
        return this.f83354d.w(qVar) ? (V) this.f83354d.i(qVar) : (V) this.f83352b.i(qVar);
    }

    @Override // net.time4j.base.f
    public long j() {
        return this.f83352b.j();
    }

    @Override // net.time4j.engine.p
    public int l(net.time4j.engine.q<Integer> qVar) {
        if (this.f83352b.n() && qVar == m0.C) {
            return 60;
        }
        int l4 = this.f83354d.l(qVar);
        return l4 == Integer.MIN_VALUE ? this.f83352b.l(qVar) : l4;
    }

    @Override // net.time4j.scale.g
    public boolean n() {
        return this.f83352b.n();
    }

    @Override // net.time4j.scale.g
    public int p(net.time4j.scale.f fVar) {
        return this.f83352b.p(fVar);
    }

    public String q(net.time4j.format.t<d0> tVar) {
        return tVar.a(this.f83353c.G()).h(this.f83352b);
    }

    @Override // net.time4j.engine.p
    public <V> V r(net.time4j.engine.q<V> qVar) {
        return (this.f83352b.n() && qVar == m0.C) ? qVar.getType().cast(60) : this.f83354d.w(qVar) ? (V) this.f83354d.r(qVar) : (V) this.f83352b.r(qVar);
    }

    public d0 t() {
        return this.f83352b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append(this.f83354d.k0());
        sb.append('T');
        int u4 = this.f83354d.u();
        if (u4 < 10) {
            sb.append('0');
        }
        sb.append(u4);
        sb.append(':');
        int m4 = this.f83354d.m();
        if (m4 < 10) {
            sb.append('0');
        }
        sb.append(m4);
        sb.append(':');
        if (this.f83352b.n()) {
            sb.append(ProtectedSandApp.s("鞬\u0001"));
        } else {
            int h4 = this.f83354d.h();
            if (h4 < 10) {
                sb.append('0');
            }
            sb.append(h4);
        }
        int a5 = this.f83354d.a();
        if (a5 != 0) {
            m0.i1(sb, a5);
        }
        sb.append(f());
        net.time4j.tz.k G = this.f83353c.G();
        if (!(G instanceof net.time4j.tz.p)) {
            sb.append('[');
            sb.append(G.canonical());
            sb.append(']');
        }
        return sb.toString();
    }

    public n0 u() {
        return this.f83354d;
    }

    @Override // net.time4j.engine.p
    public net.time4j.tz.k v() {
        return this.f83353c.G();
    }

    @Override // net.time4j.engine.p
    public boolean w(net.time4j.engine.q<?> qVar) {
        return this.f83354d.w(qVar) || this.f83352b.w(qVar);
    }

    public void y(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.f83352b);
        objectOutput.writeObject(this.f83353c);
    }

    private l1(n0 n0Var, net.time4j.tz.p pVar) {
        this.f83352b = n0Var.e0(pVar);
        this.f83353c = net.time4j.tz.l.c0(pVar);
        this.f83354d = n0Var;
    }
}
