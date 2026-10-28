package net.time4j.format.expert;

/* compiled from: MergedAttributes.java */
/* loaded from: classes7.dex */
final class r implements net.time4j.engine.d {

    /* renamed from: a, reason: collision with root package name */
    private final net.time4j.engine.d f83032a;

    /* renamed from: b, reason: collision with root package name */
    private final net.time4j.engine.d f83033b;

    r(net.time4j.engine.d dVar, net.time4j.engine.d dVar2) {
        this.f83032a = dVar;
        this.f83033b = dVar2;
    }

    @Override // net.time4j.engine.d
    public <A> A a(net.time4j.engine.c<A> cVar) {
        return this.f83032a.c(cVar) ? (A) this.f83032a.a(cVar) : (A) this.f83033b.a(cVar);
    }

    @Override // net.time4j.engine.d
    public <A> A b(net.time4j.engine.c<A> cVar, A a5) {
        return this.f83032a.c(cVar) ? (A) this.f83032a.a(cVar) : (A) this.f83033b.b(cVar, a5);
    }

    @Override // net.time4j.engine.d
    public boolean c(net.time4j.engine.c<?> cVar) {
        return this.f83032a.c(cVar) || this.f83033b.c(cVar);
    }
}
