package net.time4j;

import java.lang.Comparable;

/* compiled from: AbstractTimeElement.java */
/* loaded from: classes7.dex */
abstract class b<V extends Comparable<V>> extends net.time4j.format.d<V> implements c<V, m0> {

    /* renamed from: c, reason: collision with root package name */
    private final transient q<m0> f81868c;

    /* renamed from: d, reason: collision with root package name */
    private final transient q<m0> f81869d;

    b(String str) {
        super(str);
        this.f81868c = new z0(this, 0, null);
        this.f81869d = new z0(this, 1, null);
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
    public q<m0> b() {
        return this.f81868c;
    }

    @Override // net.time4j.c
    public q<m0> c() {
        return this.f81869d;
    }

    @Override // net.time4j.c
    public q<m0> f() {
        return new z0(this, 3, null);
    }

    @Override // net.time4j.c
    public q<m0> h() {
        return new z0(this, 5, null);
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
    public q<m0> j() {
        return new z0(this, 4, null);
    }

    @Override // net.time4j.c
    public q<m0> l() {
        return new z0(this, 2, null);
    }

    @Override // net.time4j.c
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public q<m0> l0(V v4) {
        return new z0(this, -1, v4);
    }

    public q<m0> z(V v4) {
        return new z0(this, 6, v4);
    }
}
