package net.time4j.format.expert;

import androidx.content.preferences.protobuf.m2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import net.time4j.l1;

/* compiled from: CustomizedProcessor.java */
/* loaded from: classes7.dex */
final class f<V> implements i<V> {

    /* renamed from: i, reason: collision with root package name */
    private static final net.time4j.engine.t<net.time4j.engine.p, Void> f82904i = new a();

    /* renamed from: b, reason: collision with root package name */
    private final net.time4j.engine.q<V> f82905b;

    /* renamed from: c, reason: collision with root package name */
    private final e<V> f82906c;

    /* renamed from: d, reason: collision with root package name */
    private final d<V> f82907d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f82908e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f82909f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f82910g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f82911h;

    /* compiled from: CustomizedProcessor.java */
    static class a implements net.time4j.engine.t<net.time4j.engine.p, Void> {
        a() {
        }

        public Void a(net.time4j.engine.p pVar) {
            return null;
        }

        @Override // net.time4j.engine.t
        public Void apply(net.time4j.engine.p pVar) {
            return null;
        }
    }

    f(net.time4j.engine.q<V> qVar, e<V> eVar, d<V> dVar) {
        this(qVar, eVar, dVar, false, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Map<net.time4j.engine.q<?>, Object> a(Map<net.time4j.engine.q<?>, Object> map, c<?> cVar) {
        net.time4j.engine.x<?> y4 = cVar.y();
        HashMap hashMap = new HashMap();
        for (net.time4j.engine.q<?> qVar : map.keySet()) {
            if (y4.M(qVar)) {
                hashMap.put(qVar, map.get(qVar));
            }
        }
        return hashMap;
    }

    private static <T> Set<h> c(c<T> cVar, Object obj, StringBuilder sb, net.time4j.engine.d dVar) throws IOException {
        return cVar.d0(cVar.y().C().cast(obj), sb, dVar);
    }

    boolean b() {
        return this.f82911h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f82905b.equals(fVar.f82905b) && this.f82906c.equals(fVar.f82906c) && this.f82907d.equals(fVar.f82907d);
    }

    @Override // net.time4j.format.expert.i
    public net.time4j.engine.q<V> getElement() {
        return this.f82905b;
    }

    public int hashCode() {
        return (this.f82907d.hashCode() * 37) + (this.f82906c.hashCode() * 31) + (this.f82905b.hashCode() * 7);
    }

    @Override // net.time4j.format.expert.i
    public boolean isNumerical() {
        return false;
    }

    @Override // net.time4j.format.expert.i
    public void parse(CharSequence charSequence, w wVar, net.time4j.engine.d dVar, x<?> xVar, boolean z4) {
        int f4 = wVar.f();
        if (z4) {
            try {
                if (this.f82910g) {
                    dVar = ((c) c.class.cast(this.f82907d)).i();
                }
            } catch (IndexOutOfBoundsException e4) {
                wVar.l(f4, e4.getMessage());
                return;
            }
        }
        V b5 = this.f82907d.b(charSequence, wVar, dVar);
        if (b5 == null) {
            wVar.l(f4, wVar.d());
            return;
        }
        if (this.f82911h && (xVar instanceof y)) {
            xVar.S(b5);
            return;
        }
        net.time4j.engine.r<?> g4 = wVar.g();
        for (net.time4j.engine.q<?> qVar : g4.A()) {
            if (qVar.getType() == Integer.class) {
                xVar.Q(qVar, g4.l(qVar));
            } else {
                xVar.R(qVar, g4.r(qVar));
            }
        }
        xVar.R(this.f82905b, b5);
    }

    @Override // net.time4j.format.expert.i
    public int print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar, Set<h> set, boolean z4) throws IOException {
        if (z4 && this.f82909f) {
            dVar = ((c) c.class.cast(this.f82906c)).i();
        }
        if (this.f82908e && (pVar instanceof l1) && set == null) {
            ((c) this.f82906c).f0(pVar, appendable, dVar, false);
            return Integer.MAX_VALUE;
        }
        Object r4 = pVar.r(this.f82905b);
        StringBuilder sb = new StringBuilder();
        if (!(appendable instanceof CharSequence) || set == null) {
            this.f82906c.g(r4, sb, dVar, f82904i);
        } else {
            int length = ((CharSequence) appendable).length();
            e<V> eVar = this.f82906c;
            if (eVar instanceof c) {
                Set<h> c5 = c((c) c.class.cast(eVar), r4, sb, dVar);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (h hVar : c5) {
                    linkedHashSet.add(new h(hVar.a(), hVar.c() + length, hVar.b() + length));
                }
                set.addAll(linkedHashSet);
            } else {
                eVar.g(r4, sb, dVar, f82904i);
            }
            set.add(new h(this.f82905b, length, sb.length() + length));
        }
        appendable.append(sb);
        return sb.length();
    }

    @Override // net.time4j.format.expert.i
    public i<V> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i4) {
        e<V> eVar;
        boolean z4;
        boolean z5;
        d<V> dVar2;
        boolean z6 = cVar.J() && this.f82905b.getType().equals(cVar.y().C());
        if (!(dVar instanceof b)) {
            return (this.f82909f || this.f82910g) ? new f(this.f82905b, this.f82906c, this.f82907d) : this;
        }
        e<V> eVar2 = this.f82906c;
        d<V> dVar3 = this.f82907d;
        Map<net.time4j.engine.q<?>, Object> z7 = cVar.z();
        b bVar = (b) dVar;
        e<V> eVar3 = this.f82906c;
        if (eVar3 instanceof c) {
            c cVar2 = (c) c.class.cast(eVar3);
            eVar = cVar2.r0(a(z7, cVar2), bVar);
            z4 = true;
        } else {
            eVar = eVar2;
            z4 = false;
        }
        d<V> dVar4 = this.f82907d;
        if (dVar4 instanceof c) {
            c cVar3 = (c) c.class.cast(dVar4);
            dVar2 = cVar3.r0(a(z7, cVar3), bVar);
            z5 = true;
        } else {
            z5 = false;
            dVar2 = dVar3;
        }
        return new f(this.f82905b, eVar, dVar2, z4, z5, z6);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        m2.a(f.class, sb, ProtectedSandApp.s("鑹\u0001"));
        sb.append(this.f82905b.name());
        sb.append(ProtectedSandApp.s("鑺\u0001"));
        sb.append(this.f82906c);
        sb.append(ProtectedSandApp.s("鑻\u0001"));
        sb.append(this.f82907d);
        sb.append(']');
        return sb.toString();
    }

    @Override // net.time4j.format.expert.i
    public i<V> withElement(net.time4j.engine.q<V> qVar) {
        return this.f82905b == qVar ? this : new f(qVar, this.f82906c, this.f82907d);
    }

    private f(net.time4j.engine.q<V> qVar, e<V> eVar, d<V> dVar, boolean z4, boolean z5, boolean z6) {
        if (qVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("鑸\u0001"));
        }
        if (eVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("鑷\u0001"));
        }
        if (dVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("鑶\u0001"));
        }
        this.f82905b = qVar;
        this.f82906c = eVar;
        this.f82907d = dVar;
        this.f82908e = (eVar instanceof c) && qVar.getType() == net.time4j.d0.class;
        this.f82909f = z4;
        this.f82910g = z5;
        this.f82911h = z6;
    }
}
