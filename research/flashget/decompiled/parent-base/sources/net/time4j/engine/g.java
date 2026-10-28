package net.time4j.engine;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import net.time4j.engine.r;

/* compiled from: BridgeChronology.java */
/* loaded from: classes7.dex */
public final class g<S, T extends r<T>> extends x<S> {

    /* renamed from: i, reason: collision with root package name */
    private final y<S, T> f82716i;

    /* renamed from: j, reason: collision with root package name */
    private final x<T> f82717j;

    /* compiled from: BridgeChronology.java */
    private static class a<S, T> implements l<S> {

        /* renamed from: a, reason: collision with root package name */
        private final y<S, T> f82718a;

        /* renamed from: b, reason: collision with root package name */
        private final l<T> f82719b;

        a(y<S, T> yVar, l<T> lVar) {
            this.f82718a = yVar;
            this.f82719b = lVar;
        }

        @Override // net.time4j.engine.l
        public List<j> a() {
            return this.f82719b.a();
        }

        @Override // net.time4j.engine.l
        public long d() {
            return this.f82719b.d();
        }

        @Override // net.time4j.engine.l
        public S e(long j4) {
            return (S) this.f82718a.c(this.f82719b.e(j4));
        }

        @Override // net.time4j.engine.l
        public long f(S s4) {
            return this.f82719b.f(this.f82718a.b(s4));
        }

        @Override // net.time4j.engine.l
        public long g() {
            return this.f82719b.g();
        }
    }

    public g(y<S, T> yVar, x<T> xVar) {
        super(yVar.a());
        if (!r.class.isAssignableFrom(xVar.C())) {
            throw new IllegalArgumentException(ProtectedSandApp.s("錅\u0001"));
        }
        this.f82716i = yVar;
        this.f82717j = xVar;
    }

    @Override // net.time4j.engine.x
    public List<s> E() {
        return Collections.emptyList();
    }

    @Override // net.time4j.engine.x
    public Set<q<?>> H() {
        return Collections.emptySet();
    }

    @Override // net.time4j.engine.x
    public boolean J() {
        return this.f82717j.J();
    }

    @Override // net.time4j.engine.x
    public boolean M(q<?> qVar) {
        return false;
    }

    @Override // net.time4j.engine.x, net.time4j.engine.u
    public g0 a() {
        return this.f82717j.a();
    }

    @Override // net.time4j.engine.x, net.time4j.engine.u
    public x<?> d() {
        return this.f82717j;
    }

    @Override // net.time4j.engine.x, net.time4j.engine.u
    public S e(r<?> rVar, d dVar, boolean z4, boolean z5) {
        T cast = this.f82717j.C().isInstance(rVar) ? this.f82717j.C().cast(rVar) : this.f82717j.e(rVar, dVar, z4, z5);
        if (cast == null) {
            return null;
        }
        return (S) this.f82716i.c(cast);
    }

    @Override // net.time4j.engine.x, net.time4j.engine.u
    public int g() {
        return this.f82717j.g();
    }

    @Override // net.time4j.engine.x, net.time4j.engine.u
    public p k(S s4, d dVar) {
        return this.f82717j.k(this.f82716i.b(s4), dVar);
    }

    @Override // net.time4j.engine.x, net.time4j.engine.u
    public String n(z zVar, Locale locale) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("錆\u0001"));
    }

    @Override // net.time4j.engine.x, net.time4j.engine.u
    public S o(net.time4j.base.e<?> eVar, d dVar) {
        T o4 = this.f82717j.o(eVar, dVar);
        if (o4 == null) {
            return null;
        }
        return this.f82716i.c(o4);
    }

    @Override // net.time4j.engine.x
    public l<S> y() {
        return new a(this.f82716i, this.f82717j.y());
    }

    @Override // net.time4j.engine.x
    public l<S> z(String str) {
        return new a(this.f82716i, this.f82717j.z(str));
    }
}
