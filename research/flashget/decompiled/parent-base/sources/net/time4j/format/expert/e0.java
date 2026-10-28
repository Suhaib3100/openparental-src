package net.time4j.format.expert;

import androidx.content.preferences.protobuf.m2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.Locale;
import java.util.Set;

/* compiled from: TextProcessor.java */
/* loaded from: classes7.dex */
final class e0<V> implements i<V> {

    /* renamed from: b, reason: collision with root package name */
    private final net.time4j.format.v<V> f82896b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f82897c;

    /* renamed from: d, reason: collision with root package name */
    private final pe.e<V> f82898d;

    /* renamed from: e, reason: collision with root package name */
    private final Locale f82899e;

    /* renamed from: f, reason: collision with root package name */
    private final net.time4j.format.x f82900f;

    /* renamed from: g, reason: collision with root package name */
    private final net.time4j.format.m f82901g;

    /* renamed from: h, reason: collision with root package name */
    private final net.time4j.format.g f82902h;

    /* renamed from: i, reason: collision with root package name */
    private final int f82903i;

    private e0(net.time4j.format.v<V> vVar, boolean z4, Locale locale, net.time4j.format.x xVar, net.time4j.format.m mVar, net.time4j.format.g gVar, int i4) {
        if (vVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("鑫\u0001"));
        }
        this.f82896b = vVar;
        this.f82897c = z4;
        this.f82898d = vVar instanceof pe.e ? (pe.e) vVar : null;
        this.f82899e = locale;
        this.f82900f = xVar;
        this.f82901g = mVar;
        this.f82902h = gVar;
        this.f82903i = i4;
    }

    static <V> e0<V> a(net.time4j.format.v<V> vVar) {
        return new e0<>(vVar, false, Locale.ROOT, net.time4j.format.x.WIDE, net.time4j.format.m.FORMAT, net.time4j.format.g.SMART, 0);
    }

    static <V> e0<V> b(net.time4j.format.v<V> vVar) {
        return new e0<>(vVar, true, Locale.ROOT, net.time4j.format.x.WIDE, net.time4j.format.m.FORMAT, net.time4j.format.g.SMART, 0);
    }

    private boolean c(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar, boolean z4) throws IOException {
        pe.e<V> eVar = this.f82898d;
        if (eVar != null && z4) {
            eVar.print(pVar, appendable, this.f82899e, this.f82900f, this.f82901g);
            return true;
        }
        if (!pVar.w(this.f82896b)) {
            return false;
        }
        this.f82896b.print(pVar, appendable, dVar);
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f82896b.equals(e0Var.f82896b) && this.f82897c == e0Var.f82897c;
    }

    @Override // net.time4j.format.expert.i
    public net.time4j.engine.q<V> getElement() {
        return this.f82896b;
    }

    public int hashCode() {
        return this.f82896b.hashCode();
    }

    @Override // net.time4j.format.expert.i
    public boolean isNumerical() {
        return false;
    }

    @Override // net.time4j.format.expert.i
    public void parse(CharSequence charSequence, w wVar, net.time4j.engine.d dVar, x<?> xVar, boolean z4) {
        Object x4;
        pe.e<V> eVar;
        int f4 = wVar.f();
        int length = charSequence.length();
        int intValue = z4 ? this.f82903i : ((Integer) dVar.b(net.time4j.format.a.f82797s, 0)).intValue();
        if (intValue > 0) {
            length -= intValue;
        }
        if (f4 >= length) {
            wVar.l(f4, ProtectedSandApp.s("鑬\u0001") + this.f82896b.name());
            wVar.o();
            return;
        }
        if (!z4 || (eVar = this.f82898d) == null || this.f82902h == null) {
            net.time4j.format.v<V> vVar = this.f82896b;
            x4 = vVar instanceof pe.a ? ((pe.a) vVar).x(charSequence, wVar.e(), dVar, xVar) : vVar.parse(charSequence, wVar.e(), dVar);
        } else {
            x4 = eVar.parse(charSequence, wVar.e(), this.f82899e, this.f82900f, this.f82901g, this.f82902h);
        }
        if (wVar.i()) {
            Class<V> type = this.f82896b.getType();
            if (type.isEnum()) {
                wVar.l(wVar.c(), ProtectedSandApp.s("鑭\u0001").concat(type.getName()));
                return;
            }
            wVar.l(wVar.c(), ProtectedSandApp.s("鑮\u0001") + this.f82896b.name());
            return;
        }
        if (x4 == null) {
            wVar.l(f4, ProtectedSandApp.s("鑯\u0001"));
            return;
        }
        net.time4j.format.v<V> vVar2 = this.f82896b;
        if (vVar2 == net.time4j.l0.f83330u) {
            xVar.Q(net.time4j.l0.f83331v, ((net.time4j.e0) net.time4j.e0.class.cast(x4)).getValue());
        } else {
            xVar.R(vVar2, x4);
        }
    }

    @Override // net.time4j.format.expert.i
    public int print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar, Set<h> set, boolean z4) throws IOException {
        if (!(appendable instanceof CharSequence)) {
            return c(pVar, appendable, dVar, z4) ? Integer.MAX_VALUE : -1;
        }
        CharSequence charSequence = (CharSequence) appendable;
        int length = charSequence.length();
        if (!c(pVar, appendable, dVar, z4)) {
            return -1;
        }
        if (set != null) {
            set.add(new h(this.f82896b, length, charSequence.length()));
        }
        return charSequence.length() - length;
    }

    @Override // net.time4j.format.expert.i
    public i<V> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i4) {
        net.time4j.engine.c<net.time4j.format.g> cVar2 = net.time4j.format.a.f82784f;
        net.time4j.format.g gVar = net.time4j.format.g.SMART;
        net.time4j.format.g gVar2 = (net.time4j.format.g) dVar.b(cVar2, gVar);
        net.time4j.engine.c<Boolean> cVar3 = net.time4j.format.a.f82789k;
        Boolean bool = Boolean.TRUE;
        boolean booleanValue = ((Boolean) dVar.b(cVar3, bool)).booleanValue();
        boolean booleanValue2 = ((Boolean) dVar.b(net.time4j.format.a.f82787i, bool)).booleanValue();
        boolean booleanValue3 = ((Boolean) dVar.b(net.time4j.format.a.f82788j, Boolean.FALSE)).booleanValue();
        return new e0(this.f82896b, this.f82897c, (Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT), (net.time4j.format.x) dVar.b(net.time4j.format.a.f82785g, net.time4j.format.x.WIDE), (net.time4j.format.m) dVar.b(net.time4j.format.a.f82786h, net.time4j.format.m.FORMAT), (!(gVar2 == net.time4j.format.g.STRICT && (booleanValue || booleanValue2 || booleanValue3)) && (gVar2 != gVar || (booleanValue && booleanValue2 && !booleanValue3)) && booleanValue && booleanValue2 && booleanValue3) ? gVar2 : null, ((Integer) dVar.b(net.time4j.format.a.f82797s, 0)).intValue());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        m2.a(e0.class, sb, ProtectedSandApp.s("鑰\u0001"));
        sb.append(this.f82896b.name());
        sb.append(ProtectedSandApp.s("鑱\u0001"));
        return androidx.compose.animation.l.a(sb, this.f82897c, ']');
    }

    @Override // net.time4j.format.expert.i
    public i<V> withElement(net.time4j.engine.q<V> qVar) {
        if (this.f82897c || this.f82896b == qVar) {
            return this;
        }
        if (qVar instanceof net.time4j.format.v) {
            return a((net.time4j.format.v) qVar);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("鑲\u0001").concat(qVar.getClass().getName()));
    }
}
