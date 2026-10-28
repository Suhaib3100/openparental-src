package net.time4j.history;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.engine.ChronoException;
import net.time4j.engine.a0;
import net.time4j.engine.q;
import net.time4j.engine.r;
import net.time4j.format.u;
import net.time4j.format.v;
import net.time4j.format.x;
import net.time4j.l0;

/* compiled from: HistoricEraElement.java */
/* loaded from: classes7.dex */
final class k extends net.time4j.format.d<j> implements v<j> {

    /* renamed from: c, reason: collision with root package name */
    private static final Locale f83212c = new Locale(ProtectedSandApp.s("隕\u0001"));
    private static final long serialVersionUID = 5200533417265981438L;
    private final d history;

    /* compiled from: HistoricEraElement.java */
    private static class a<C extends r<C>> implements a0<C, j> {

        /* renamed from: b, reason: collision with root package name */
        private final d f83213b;

        a(d dVar) {
            this.f83213b = dVar;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtCeiling(C c5) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("隓\u0001"));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtFloor(C c5) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("隓\u0001"));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public j getMaximum(C c5) {
            j value = getValue(c5);
            return value == j.BC ? j.AD : value;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public j getMinimum(C c5) {
            j value = getValue(c5);
            return value == j.AD ? j.BC : value;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public j getValue(C c5) {
            try {
                return this.f83213b.e((l0) c5.r(l0.f83326q)).c();
            } catch (IllegalArgumentException e4) {
                throw new ChronoException(e4.getMessage(), (Throwable) e4);
            }
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(C c5, j jVar) {
            if (jVar == null) {
                return false;
            }
            try {
                return this.f83213b.e((l0) c5.r(l0.f83326q)).c() == jVar;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public C withValue(C c5, j jVar, boolean z4) {
            if (jVar == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("隔\u0001"));
            }
            if (this.f83213b.e((l0) c5.r(l0.f83326q)).c() == jVar) {
                return c5;
            }
            throw new IllegalArgumentException(jVar.name());
        }
    }

    k(d dVar) {
        super(ProtectedSandApp.s("隖\u0001"));
        this.history = dVar;
    }

    private Object readResolve() throws ObjectStreamException {
        return this.history.i();
    }

    private u y(net.time4j.engine.d dVar) {
        net.time4j.engine.c<x> cVar = net.time4j.format.a.f82785g;
        x xVar = x.WIDE;
        x xVar2 = (x) dVar.b(cVar, xVar);
        net.time4j.engine.c<Boolean> cVar2 = net.time4j.history.internal.a.f83205c;
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) dVar.b(cVar2, bool)).booleanValue();
        String s4 = ProtectedSandApp.s("隗\u0001");
        String s5 = ProtectedSandApp.s("隘\u0001");
        if (booleanValue) {
            net.time4j.format.b d5 = net.time4j.format.b.d(ProtectedSandApp.s("隙\u0001"), f83212c);
            if (xVar2 == xVar) {
                s4 = s5;
            }
            return d5.q(this, s4);
        }
        net.time4j.format.b f4 = net.time4j.format.b.f((Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT));
        if (!((Boolean) dVar.b(net.time4j.history.internal.a.f83204b, bool)).booleanValue()) {
            return f4.c(xVar2);
        }
        if (xVar2 == xVar) {
            s4 = s5;
        }
        return f4.q(this, s4, ProtectedSandApp.s("隚\u0001"));
    }

    public j B() {
        return j.BC;
    }

    @Override // net.time4j.format.v
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public j parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
        return (j) y(dVar).d(charSequence, parsePosition, j.class, dVar);
    }

    @Override // net.time4j.engine.e
    protected <T extends r<T>> a0<T, j> g(net.time4j.engine.x<T> xVar) {
        if (xVar.K(l0.f83326q)) {
            return new a(this.history);
        }
        return null;
    }

    @Override // net.time4j.engine.q
    public Object getDefaultMaximum() {
        return j.AD;
    }

    @Override // net.time4j.engine.q
    public Object getDefaultMinimum() {
        return j.BC;
    }

    @Override // net.time4j.engine.e, net.time4j.engine.q
    public char getSymbol() {
        return 'G';
    }

    @Override // net.time4j.engine.q
    public Class<j> getType() {
        return j.class;
    }

    @Override // net.time4j.engine.q
    public boolean isDateElement() {
        return true;
    }

    @Override // net.time4j.engine.q
    public boolean isTimeElement() {
        return false;
    }

    @Override // net.time4j.engine.e
    protected boolean k(net.time4j.engine.e<?> eVar) {
        return this.history.equals(((k) eVar).history);
    }

    @Override // net.time4j.format.v
    public void print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar) throws IOException {
        appendable.append(y(dVar).g((Enum) pVar.r(this)));
    }

    public j z() {
        return j.AD;
    }
}
