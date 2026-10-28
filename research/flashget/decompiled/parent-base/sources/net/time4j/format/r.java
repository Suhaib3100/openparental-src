package net.time4j.format;

import com.flashget.parentalcontrol.ProtectedSandApp;
import net.time4j.engine.ChronoException;
import net.time4j.g0;

/* compiled from: RawValues.java */
/* loaded from: classes7.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private net.time4j.engine.p f83110a = new b();

    /* compiled from: RawValues.java */
    private static class b implements net.time4j.engine.p {
        private b() {
        }

        @Override // net.time4j.engine.p
        public boolean e() {
            return false;
        }

        @Override // net.time4j.engine.p
        public <V> V g(net.time4j.engine.q<V> qVar) {
            throw new ChronoException(g0.a(qVar, new StringBuilder(ProtectedSandApp.s("问\u0001"))));
        }

        @Override // net.time4j.engine.p
        public <V> V i(net.time4j.engine.q<V> qVar) {
            throw new ChronoException(g0.a(qVar, new StringBuilder(ProtectedSandApp.s("问\u0001"))));
        }

        @Override // net.time4j.engine.p
        public int l(net.time4j.engine.q<Integer> qVar) {
            return Integer.MIN_VALUE;
        }

        @Override // net.time4j.engine.p
        public <V> V r(net.time4j.engine.q<V> qVar) {
            throw new ChronoException(g0.a(qVar, new StringBuilder(ProtectedSandApp.s("问\u0001"))));
        }

        public String toString() {
            return ProtectedSandApp.s("闯\u0001");
        }

        @Override // net.time4j.engine.p
        public net.time4j.tz.k v() {
            throw new ChronoException(ProtectedSandApp.s("闰\u0001"));
        }

        @Override // net.time4j.engine.p
        public boolean w(net.time4j.engine.q<?> qVar) {
            return false;
        }

        b(a aVar) {
        }
    }

    public void a(net.time4j.engine.p pVar) {
        if (pVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("闱\u0001"));
        }
        this.f83110a = pVar;
    }

    public net.time4j.engine.p b() {
        return this.f83110a;
    }
}
