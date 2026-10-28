package net.time4j.format.expert;

import androidx.content.preferences.protobuf.m2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.Locale;
import java.util.Set;
import net.time4j.m0;
import net.time4j.n0;

/* compiled from: StyleProcessor.java */
/* loaded from: classes7.dex */
final class d0<T> implements i<T> {

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ boolean f82892e = false;

    /* renamed from: b, reason: collision with root package name */
    private final c<T> f82893b;

    /* renamed from: c, reason: collision with root package name */
    private final net.time4j.engine.z f82894c;

    /* renamed from: d, reason: collision with root package name */
    private final net.time4j.engine.z f82895d;

    d0(net.time4j.engine.z zVar, net.time4j.engine.z zVar2) {
        this(null, zVar, zVar2);
    }

    private static <T> c<T> a(net.time4j.engine.x<?> xVar, net.time4j.engine.z zVar, net.time4j.engine.z zVar2, Locale locale, boolean z4, net.time4j.tz.l lVar) {
        String n4;
        if (xVar.equals(net.time4j.l0.T0())) {
            n4 = net.time4j.format.b.t((net.time4j.format.e) zVar, locale);
        } else if (xVar.equals(m0.y0())) {
            n4 = net.time4j.format.b.w((net.time4j.format.e) zVar2, locale);
        } else if (xVar.equals(n0.h0())) {
            n4 = net.time4j.format.b.x((net.time4j.format.e) zVar, (net.time4j.format.e) zVar2, locale);
        } else if (xVar.equals(net.time4j.d0.r0())) {
            n4 = net.time4j.format.b.v((net.time4j.format.e) zVar, (net.time4j.format.e) zVar2, locale);
        } else {
            if (!net.time4j.format.h.class.isAssignableFrom(xVar.C())) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("鑧\u0001") + xVar);
            }
            n4 = xVar.n(zVar, locale);
        }
        if (z4) {
            String s4 = ProtectedSandApp.s("鑤\u0001");
            if (n4.contains(s4) && !n4.contains(ProtectedSandApp.s("鑥\u0001"))) {
                n4 = n4.replace(s4, ProtectedSandApp.s("鑦\u0001"));
            }
        }
        c<T> R = c.R(n4, a0.CLDR, locale, xVar);
        return lVar != null ? R.A0(lVar) : R;
    }

    String b() {
        c<T> cVar = this.f82893b;
        return cVar == null ? "" : cVar.D();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            if (this.f82894c.equals(d0Var.f82894c) && this.f82895d.equals(d0Var.f82895d)) {
                c<T> cVar = this.f82893b;
                return cVar == null ? d0Var.f82893b == null : cVar.equals(d0Var.f82893b);
            }
        }
        return false;
    }

    @Override // net.time4j.format.expert.i
    public net.time4j.engine.q<T> getElement() {
        return null;
    }

    public int hashCode() {
        c<T> cVar = this.f82893b;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }

    @Override // net.time4j.format.expert.i
    public boolean isNumerical() {
        return false;
    }

    @Override // net.time4j.format.expert.i
    public void parse(CharSequence charSequence, w wVar, net.time4j.engine.d dVar, x<?> xVar, boolean z4) {
        c<T> a5;
        if (z4) {
            a5 = this.f82893b;
        } else {
            net.time4j.engine.d i4 = this.f82893b.i();
            net.time4j.engine.c<net.time4j.tz.o> cVar = net.time4j.format.a.f82783e;
            net.time4j.tz.o oVar = (net.time4j.tz.o) dVar.b(cVar, i4.b(cVar, net.time4j.tz.l.f83557e));
            net.time4j.engine.c<net.time4j.tz.k> cVar2 = net.time4j.format.a.f82782d;
            net.time4j.tz.k kVar = (net.time4j.tz.k) dVar.b(cVar2, i4.b(cVar2, null));
            a5 = a(this.f82893b.y(), this.f82894c, this.f82895d, (Locale) dVar.b(net.time4j.format.a.f82781c, this.f82893b.C()), ((Boolean) dVar.b(net.time4j.format.a.f82800v, Boolean.FALSE)).booleanValue(), kVar != null ? net.time4j.tz.l.c0(kVar).h0(oVar) : null);
        }
        T b5 = a5.b(charSequence, wVar, dVar);
        if (wVar.i() || b5 == null) {
            return;
        }
        xVar.S(b5);
    }

    @Override // net.time4j.format.expert.i
    public int print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar, Set<h> set, boolean z4) throws IOException {
        Set<h> f02 = this.f82893b.f0(pVar, appendable, dVar, set != null);
        if (set == null) {
            return Integer.MAX_VALUE;
        }
        set.addAll(f02);
        return Integer.MAX_VALUE;
    }

    @Override // net.time4j.format.expert.i
    public i<T> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i4) {
        net.time4j.tz.o oVar = (net.time4j.tz.o) dVar.b(net.time4j.format.a.f82783e, net.time4j.tz.l.f83557e);
        net.time4j.tz.k kVar = (net.time4j.tz.k) dVar.b(net.time4j.format.a.f82782d, null);
        return new d0(a(cVar.y(), this.f82894c, this.f82895d, (Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT), ((Boolean) dVar.b(net.time4j.format.a.f82800v, Boolean.FALSE)).booleanValue(), kVar != null ? net.time4j.tz.l.c0(kVar).h0(oVar) : null), this.f82894c, this.f82895d);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        m2.a(d0.class, sb, ProtectedSandApp.s("鑨\u0001"));
        sb.append(this.f82894c);
        sb.append(ProtectedSandApp.s("鑩\u0001"));
        sb.append(this.f82895d);
        sb.append(ProtectedSandApp.s("鑪\u0001"));
        sb.append(this.f82893b);
        sb.append(']');
        return sb.toString();
    }

    @Override // net.time4j.format.expert.i
    public i<T> withElement(net.time4j.engine.q<T> qVar) {
        return this;
    }

    private d0(c<T> cVar, net.time4j.engine.z zVar, net.time4j.engine.z zVar2) {
        if (zVar == null || zVar2 == null) {
            throw new NullPointerException(ProtectedSandApp.s("鑣\u0001"));
        }
        this.f82894c = zVar;
        this.f82895d = zVar2;
        this.f82893b = cVar;
    }
}
