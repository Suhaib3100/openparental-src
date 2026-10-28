package com.google.common.graph;

import java.util.Set;

/* compiled from: ForwardingNetwork.java */
@t
/* loaded from: classes6.dex */
abstract class x<N, E> extends h<N, E> {
    x() {
    }

    @Override // com.google.common.graph.h, com.google.common.graph.s0
    public Set<E> D(u<N> uVar) {
        return R().D(uVar);
    }

    @Override // com.google.common.graph.h, com.google.common.graph.s0
    @zc.a
    public E E(N n4, N n5) {
        return R().E(n4, n5);
    }

    @Override // com.google.common.graph.s0
    public u<N> F(E e4) {
        return R().F(e4);
    }

    @Override // com.google.common.graph.s0
    public s<E> H() {
        return R().H();
    }

    @Override // com.google.common.graph.h, com.google.common.graph.s0
    @zc.a
    public E I(u<N> uVar) {
        return R().I(uVar);
    }

    @Override // com.google.common.graph.s0
    public Set<E> K(N n4) {
        return R().K(n4);
    }

    abstract s0<N, E> R();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.s0, com.google.common.graph.w0
    public /* bridge */ /* synthetic */ Iterable a(Object obj) {
        return a((x<N, E>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.s0, com.google.common.graph.c1
    public /* bridge */ /* synthetic */ Iterable b(Object obj) {
        return b((x<N, E>) obj);
    }

    @Override // com.google.common.graph.s0
    public Set<E> c() {
        return R().c();
    }

    @Override // com.google.common.graph.h, com.google.common.graph.s0
    public boolean d(N n4, N n5) {
        return R().d(n4, n5);
    }

    @Override // com.google.common.graph.s0
    public boolean e() {
        return R().e();
    }

    @Override // com.google.common.graph.h, com.google.common.graph.s0
    public boolean f(u<N> uVar) {
        return R().f(uVar);
    }

    @Override // com.google.common.graph.h, com.google.common.graph.s0
    public int g(N n4) {
        return R().g(n4);
    }

    @Override // com.google.common.graph.s0
    public s<N> h() {
        return R().h();
    }

    @Override // com.google.common.graph.h, com.google.common.graph.s0
    public int i(N n4) {
        return R().i(n4);
    }

    @Override // com.google.common.graph.s0
    public boolean j() {
        return R().j();
    }

    @Override // com.google.common.graph.s0
    public Set<N> k(N n4) {
        return R().k(n4);
    }

    @Override // com.google.common.graph.s0
    public Set<E> l(N n4) {
        return R().l(n4);
    }

    @Override // com.google.common.graph.s0
    public Set<N> m() {
        return R().m();
    }

    @Override // com.google.common.graph.h, com.google.common.graph.s0
    public int n(N n4) {
        return R().n(n4);
    }

    @Override // com.google.common.graph.s0
    public Set<E> v(N n4) {
        return R().v(n4);
    }

    @Override // com.google.common.graph.h, com.google.common.graph.s0
    public Set<E> w(E e4) {
        return R().w(e4);
    }

    @Override // com.google.common.graph.h, com.google.common.graph.s0
    public Set<E> x(N n4, N n5) {
        return R().x(n4, n5);
    }

    @Override // com.google.common.graph.s0
    public boolean y() {
        return R().y();
    }

    @Override // com.google.common.graph.s0, com.google.common.graph.w0
    public Set<N> a(N n4) {
        return R().a((s0<N, E>) n4);
    }

    @Override // com.google.common.graph.s0, com.google.common.graph.c1
    public Set<N> b(N n4) {
        return R().b((s0<N, E>) n4);
    }
}
