package net.time4j;

import java.lang.Comparable;

/* compiled from: AbstractDateElement.java */
/* loaded from: classes7.dex */
abstract class a<V extends Comparable<V>> extends net.time4j.format.d<V> implements c<V, l0> {

    /* renamed from: c, reason: collision with root package name */
    private final transient q<l0> f81811c;

    /* renamed from: d, reason: collision with root package name */
    private final transient q<l0> f81812d;

    a(String str) {
        super(str);
        this.f81811c = new l(this, 0, null);
        this.f81812d = new l(this, 1, null);
    }

    @Override // net.time4j.m1
    public net.time4j.engine.t<d0, V> at(net.time4j.tz.p pVar) {
        return new n1(this, pVar);
    }

    @Override // net.time4j.m1
    public net.time4j.engine.t<d0, V> atUTC() {
        return at(net.time4j.tz.p.f83649l);
    }

    @Override // net.time4j.c
    public q<l0> b() {
        return this.f81811c;
    }

    @Override // net.time4j.c
    public q<l0> c() {
        return this.f81812d;
    }

    @Override // net.time4j.c
    public q<l0> f() {
        return new l(this, 3, null);
    }

    @Override // net.time4j.c
    public q<l0> h() {
        return new l(this, 5, null);
    }

    @Override // net.time4j.m1
    public net.time4j.engine.t<d0, V> in(net.time4j.tz.l lVar) {
        return new n1(this, lVar);
    }

    @Override // net.time4j.m1
    public net.time4j.engine.t<d0, V> inStdTimezone() {
        return in(net.time4j.tz.l.e0());
    }

    @Override // net.time4j.m1
    public net.time4j.engine.t<d0, V> inTimezone(net.time4j.tz.k kVar) {
        return in(net.time4j.tz.l.c0(kVar));
    }

    @Override // net.time4j.c
    public q<l0> j() {
        return new l(this, 4, null);
    }

    @Override // net.time4j.c
    public q<l0> l() {
        return new l(this, 2, null);
    }

    @Override // net.time4j.c
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public q<l0> l0(V v4) {
        return new l(this, -1, v4);
    }

    public q<l0> z(V v4) {
        return new l(this, 6, v4);
    }
}
