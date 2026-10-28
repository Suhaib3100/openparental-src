package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.d0;
import com.google.common.collect.o4;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: MapMaker.java */
@w0
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public final class n4 {

    /* renamed from: g, reason: collision with root package name */
    private static final int f55965g = 16;

    /* renamed from: h, reason: collision with root package name */
    private static final int f55966h = 4;

    /* renamed from: i, reason: collision with root package name */
    static final int f55967i = -1;

    /* renamed from: a, reason: collision with root package name */
    boolean f55968a;

    /* renamed from: b, reason: collision with root package name */
    int f55969b = -1;

    /* renamed from: c, reason: collision with root package name */
    int f55970c = -1;

    /* renamed from: d, reason: collision with root package name */
    @zc.a
    o4.q f55971d;

    /* renamed from: e, reason: collision with root package name */
    @zc.a
    o4.q f55972e;

    /* renamed from: f, reason: collision with root package name */
    @zc.a
    com.google.common.base.q<Object> f55973f;

    /* compiled from: MapMaker.java */
    enum a {
        VALUE
    }

    @f9.a
    public n4 a(int i4) {
        int i5 = this.f55970c;
        com.google.common.base.l0.n0(i5 == -1, ProtectedSandApp.s("\uf4f9"), i5);
        com.google.common.base.l0.d(i4 > 0);
        this.f55970c = i4;
        return this;
    }

    int b() {
        int i4 = this.f55970c;
        if (i4 == -1) {
            return 4;
        }
        return i4;
    }

    int c() {
        int i4 = this.f55969b;
        if (i4 == -1) {
            return 16;
        }
        return i4;
    }

    com.google.common.base.q<Object> d() {
        return (com.google.common.base.q) com.google.common.base.d0.a(this.f55973f, e().defaultEquivalence());
    }

    o4.q e() {
        return (o4.q) com.google.common.base.d0.a(this.f55971d, o4.q.STRONG);
    }

    o4.q f() {
        return (o4.q) com.google.common.base.d0.a(this.f55972e, o4.q.STRONG);
    }

    @f9.a
    public n4 g(int i4) {
        int i5 = this.f55969b;
        com.google.common.base.l0.n0(i5 == -1, ProtectedSandApp.s("\uf4fa"), i5);
        com.google.common.base.l0.d(i4 >= 0);
        this.f55969b = i4;
        return this;
    }

    @d9.c
    @f9.a
    n4 h(com.google.common.base.q<Object> qVar) {
        com.google.common.base.q<Object> qVar2 = this.f55973f;
        com.google.common.base.l0.x0(qVar2 == null, ProtectedSandApp.s("\uf4fb"), qVar2);
        qVar.getClass();
        this.f55973f = qVar;
        this.f55968a = true;
        return this;
    }

    public <K, V> ConcurrentMap<K, V> i() {
        return !this.f55968a ? new ConcurrentHashMap(c(), 0.75f, b()) : o4.d(this);
    }

    n4 j(o4.q qVar) {
        o4.q qVar2 = this.f55971d;
        com.google.common.base.l0.x0(qVar2 == null, ProtectedSandApp.s("\uf4fc"), qVar2);
        qVar.getClass();
        this.f55971d = qVar;
        if (qVar != o4.q.STRONG) {
            this.f55968a = true;
        }
        return this;
    }

    n4 k(o4.q qVar) {
        o4.q qVar2 = this.f55972e;
        com.google.common.base.l0.x0(qVar2 == null, ProtectedSandApp.s("\uf4fd"), qVar2);
        qVar.getClass();
        this.f55972e = qVar;
        if (qVar != o4.q.STRONG) {
            this.f55968a = true;
        }
        return this;
    }

    @d9.c
    @f9.a
    public n4 l() {
        return j(o4.q.WEAK);
    }

    @d9.c
    @f9.a
    public n4 m() {
        return k(o4.q.WEAK);
    }

    public String toString() {
        d0.b c5 = com.google.common.base.d0.c(this);
        int i4 = this.f55969b;
        if (i4 != -1) {
            c5.d(ProtectedSandApp.s("\uf4fe"), i4);
        }
        int i5 = this.f55970c;
        if (i5 != -1) {
            c5.d(ProtectedSandApp.s("\uf4ff"), i5);
        }
        o4.q qVar = this.f55971d;
        if (qVar != null) {
            c5.f(ProtectedSandApp.s("\uf500"), com.google.common.base.c.g(qVar.toString()));
        }
        o4.q qVar2 = this.f55972e;
        if (qVar2 != null) {
            c5.f(ProtectedSandApp.s("\uf501"), com.google.common.base.c.g(qVar2.toString()));
        }
        if (this.f55973f != null) {
            c5.s(ProtectedSandApp.s("\uf502"));
        }
        return c5.toString();
    }
}
