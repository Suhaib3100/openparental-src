package net.time4j.history;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ObjectStreamException;
import net.time4j.engine.ChronoException;
import net.time4j.engine.a0;
import net.time4j.engine.q;
import net.time4j.engine.r;
import net.time4j.engine.x;
import net.time4j.l0;

/* compiled from: HistoricDateElement.java */
/* loaded from: classes7.dex */
final class i extends net.time4j.engine.e<h> {
    private static final long serialVersionUID = -5386613740709845550L;
    private final d history;

    /* compiled from: HistoricDateElement.java */
    private static class a<C extends r<C>> implements a0<C, h> {

        /* renamed from: b, reason: collision with root package name */
        private final d f83202b;

        a(d dVar) {
            this.f83202b = dVar;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtCeiling(C c5) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("陽\u0001"));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtFloor(C c5) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("陽\u0001"));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public h getMaximum(C c5) {
            d dVar = this.f83202b;
            return dVar == d.f83161t ? h.g(j.BYZANTINE, 999984973, 8, 31) : dVar == d.f83160s ? h.g(j.AD, 999979465, 12, 31) : dVar == d.f83159r ? h.g(j.AD, 999999999, 12, 31) : h.g(j.AD, org.threeten.bp.chrono.m.f87989n, 12, 31);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public h getMinimum(C c5) {
            d dVar = this.f83202b;
            return dVar == d.f83161t ? h.g(j.BYZANTINE, 0, 9, 1) : dVar == d.f83160s ? h.g(j.BC, 999979466, 1, 1) : dVar == d.f83159r ? h.g(j.BC, 1000000000, 1, 1) : h.g(j.BC, 45, 1, 1);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public h getValue(C c5) {
            try {
                return this.f83202b.e((l0) c5.r(l0.f83326q));
            } catch (IllegalArgumentException e4) {
                throw new ChronoException(e4.getMessage(), (Throwable) e4);
            }
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(C c5, h hVar) {
            return this.f83202b.A(hVar);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public C withValue(C c5, h hVar, boolean z4) {
            if (hVar == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("陾\u0001"));
            }
            return (C) c5.M(l0.f83326q, this.f83202b.d(hVar));
        }
    }

    i(d dVar) {
        super(ProtectedSandApp.s("陿\u0001"));
        this.history = dVar;
    }

    private Object readResolve() throws ObjectStreamException {
        return this.history.f();
    }

    @Override // net.time4j.engine.e
    protected <T extends r<T>> a0<T, h> g(x<T> xVar) {
        if (xVar.K(l0.f83326q)) {
            return new a(this.history);
        }
        return null;
    }

    @Override // net.time4j.engine.q
    public Class<h> getType() {
        return h.class;
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
        return this.history.equals(((i) eVar).history);
    }

    @Override // net.time4j.engine.q
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public h getDefaultMaximum() {
        return h.g(j.AD, org.threeten.bp.chrono.m.f87989n, 12, 31);
    }

    @Override // net.time4j.engine.q
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public h getDefaultMinimum() {
        return h.g(j.BC, 45, 1, 1);
    }
}
