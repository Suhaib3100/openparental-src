package com.annimon.stream;

import com.annimon.stream.function.b0;
import com.annimon.stream.function.d0;
import com.annimon.stream.function.e0;
import com.annimon.stream.function.o0;
import com.annimon.stream.function.p0;
import com.annimon.stream.function.q;
import com.annimon.stream.function.q0;
import com.annimon.stream.function.r0;
import com.annimon.stream.function.s0;
import com.annimon.stream.function.t0;
import com.annimon.stream.function.u1;
import com.annimon.stream.function.v0;
import com.annimon.stream.function.y0;
import com.annimon.stream.iterator.f;
import com.annimon.stream.iterator.g;
import com.annimon.stream.operator.a1;
import com.annimon.stream.operator.b1;
import com.annimon.stream.operator.c1;
import com.annimon.stream.operator.d1;
import com.annimon.stream.operator.e1;
import com.annimon.stream.operator.f1;
import com.annimon.stream.operator.g1;
import com.annimon.stream.operator.h1;
import com.annimon.stream.operator.i1;
import com.annimon.stream.operator.j1;
import com.annimon.stream.operator.k1;
import com.annimon.stream.operator.l1;
import com.annimon.stream.operator.m1;
import com.annimon.stream.operator.n1;
import com.annimon.stream.operator.o1;
import com.annimon.stream.operator.p1;
import com.annimon.stream.operator.q1;
import com.annimon.stream.operator.u0;
import com.annimon.stream.operator.w0;
import com.annimon.stream.operator.x0;
import com.annimon.stream.operator.z0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Closeable;
import java.util.Comparator;
import java.util.NoSuchElementException;

/* compiled from: LongStream.java */
/* loaded from: classes3.dex */
public final class h implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    private static final h f41481d = new h(null, new a());

    /* renamed from: e, reason: collision with root package name */
    private static final u1<Long> f41482e = new e();

    /* renamed from: b, reason: collision with root package name */
    private final g.c f41483b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.internal.d f41484c;

    /* compiled from: LongStream.java */
    static class a extends g.c {
        a() {
        }

        @Override // com.annimon.stream.iterator.g.c
        public long b() {
            return 0L;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }
    }

    /* compiled from: LongStream.java */
    class b implements o0 {
        b() {
        }

        @Override // com.annimon.stream.function.o0
        public long a(long j4, long j5) {
            return Math.min(j4, j5);
        }
    }

    /* compiled from: LongStream.java */
    class c implements o0 {
        c() {
        }

        @Override // com.annimon.stream.function.o0
        public long a(long j4, long j5) {
            return Math.max(j4, j5);
        }
    }

    /* compiled from: LongStream.java */
    class d implements o0 {
        d() {
        }

        @Override // com.annimon.stream.function.o0
        public long a(long j4, long j5) {
            return j5;
        }
    }

    /* compiled from: LongStream.java */
    static class e implements u1<Long> {
        e() {
        }

        public long a(Long l4) {
            return l4.longValue();
        }

        @Override // com.annimon.stream.function.u1
        public long applyAsLong(Long l4) {
            return l4.longValue();
        }
    }

    private h(g.c cVar) {
        this(null, cVar);
    }

    public static h B(s0 s0Var) {
        s0Var.getClass();
        return new h(null, new a1(s0Var));
    }

    public static h C(long j4, r0 r0Var, v0 v0Var) {
        r0Var.getClass();
        return D(j4, v0Var).O0(r0Var);
    }

    public static h D(long j4, v0 v0Var) {
        v0Var.getClass();
        return new h(null, new b1(j4, v0Var));
    }

    public static h Q(long j4) {
        return new h(null, new u0(new long[]{j4}));
    }

    public static h S(g.c cVar) {
        cVar.getClass();
        return new h(null, cVar);
    }

    public static h X(long... jArr) {
        jArr.getClass();
        return jArr.length == 0 ? f41481d : new h(null, new u0(jArr));
    }

    public static h e(h hVar, h hVar2) {
        hVar.getClass();
        hVar2.getClass();
        return new h(null, new com.annimon.stream.operator.v0(hVar.f41483b, hVar2.f41483b)).Y(com.annimon.stream.internal.b.a(hVar, hVar2));
    }

    public static h j0(long j4, long j5) {
        return j4 >= j5 ? f41481d : n0(j4, j5 - 1);
    }

    public static h k() {
        return f41481d;
    }

    public static h n0(long j4, long j5) {
        return j4 > j5 ? f41481d : j4 == j5 ? Q(j4) : new h(null, new j1(j4, j5));
    }

    public h A0(o0 o0Var) {
        o0Var.getClass();
        return new h(this.f41484c, new l1(this.f41483b, o0Var));
    }

    public long B0() {
        if (!this.f41483b.hasNext()) {
            throw new NoSuchElementException(ProtectedSandApp.s("ߏ"));
        }
        long b5 = this.f41483b.b();
        if (this.f41483b.hasNext()) {
            throw new IllegalStateException(ProtectedSandApp.s("ߎ"));
        }
        return b5;
    }

    public h C0(long j4) {
        if (j4 >= 0) {
            return j4 == 0 ? this : new h(this.f41484c, new n1(this.f41483b, j4));
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ߐ"));
    }

    public g.c E() {
        return this.f41483b;
    }

    public h F(long j4) {
        if (j4 >= 0) {
            return j4 == 0 ? f41481d : new h(this.f41484c, new c1(this.f41483b, j4));
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ߑ"));
    }

    public h G(v0 v0Var) {
        return new h(this.f41484c, new d1(this.f41483b, v0Var));
    }

    public h H(int i4, int i5, e0 e0Var) {
        return new h(this.f41484c, new e1(new f.c(i4, i5, this.f41483b), e0Var));
    }

    public h H0() {
        return new h(this.f41484c, new o1(this.f41483b));
    }

    public h I(e0 e0Var) {
        return H(0, 1, e0Var);
    }

    public com.annimon.stream.d J(t0 t0Var) {
        return new com.annimon.stream.d(this.f41484c, new f1(this.f41483b, t0Var));
    }

    public g K(com.annimon.stream.function.u0 u0Var) {
        return new g(this.f41484c, new g1(this.f41483b, u0Var));
    }

    public h K0(Comparator<Long> comparator) {
        return c().m2(comparator).r0(f41482e);
    }

    public <R> p<R> L(q0<? extends R> q0Var) {
        return new p<>(this.f41484c, new h1(this.f41483b, q0Var));
    }

    public n M() {
        return q0(new c());
    }

    public long M0() {
        long j4 = 0;
        while (this.f41483b.hasNext()) {
            j4 += this.f41483b.b();
        }
        return j4;
    }

    public n N() {
        return q0(new b());
    }

    public h N0(r0 r0Var) {
        return new h(this.f41484c, new p1(this.f41483b, r0Var));
    }

    public boolean O(r0 r0Var) {
        while (this.f41483b.hasNext()) {
            if (r0Var.d(this.f41483b.b())) {
                return false;
            }
        }
        return true;
    }

    public h O0(r0 r0Var) {
        return new h(this.f41484c, new q1(this.f41483b, r0Var));
    }

    public long[] S0() {
        return com.annimon.stream.internal.c.e(this.f41483b);
    }

    public h Y(Runnable runnable) {
        runnable.getClass();
        com.annimon.stream.internal.d dVar = this.f41484c;
        if (dVar == null) {
            dVar = new com.annimon.stream.internal.d();
            dVar.f41494a = runnable;
        } else {
            dVar.f41494a = com.annimon.stream.internal.b.b(dVar.f41494a, runnable);
        }
        return new h(dVar, this.f41483b);
    }

    public boolean a(r0 r0Var) {
        while (this.f41483b.hasNext()) {
            if (!r0Var.d(this.f41483b.b())) {
                return false;
            }
        }
        return true;
    }

    public boolean b(r0 r0Var) {
        while (this.f41483b.hasNext()) {
            if (r0Var.d(this.f41483b.b())) {
                return true;
            }
        }
        return false;
    }

    public p<Long> c() {
        return new p<>(this.f41484c, this.f41483b);
    }

    public h c0(p0 p0Var) {
        return new h(this.f41484c, new i1(this.f41483b, p0Var));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Runnable runnable;
        com.annimon.stream.internal.d dVar = this.f41484c;
        if (dVar == null || (runnable = dVar.f41494a) == null) {
            return;
        }
        runnable.run();
        this.f41484c.f41494a = null;
    }

    public <R> R d(com.annimon.stream.function.a1<R> a1Var, y0<R> y0Var) {
        R r4 = a1Var.get();
        while (this.f41483b.hasNext()) {
            y0Var.b(r4, this.f41483b.b());
        }
        return r4;
    }

    public long f() {
        long j4 = 0;
        while (this.f41483b.hasNext()) {
            this.f41483b.b();
            j4++;
        }
        return j4;
    }

    public <R> R g(q<h, R> qVar) {
        qVar.getClass();
        return qVar.apply(this);
    }

    public h h() {
        return c().k().r0(f41482e);
    }

    public h i(r0 r0Var) {
        return new h(this.f41484c, new w0(this.f41483b, r0Var));
    }

    public h l(r0 r0Var) {
        return new h(this.f41484c, new x0(this.f41483b, r0Var));
    }

    public h m(int i4, int i5, d0 d0Var) {
        return new h(this.f41484c, new com.annimon.stream.operator.y0(new f.c(i4, i5, this.f41483b), d0Var));
    }

    public h n(d0 d0Var) {
        return m(0, 1, d0Var);
    }

    public h o(r0 r0Var) {
        return l(r0.a.b(r0Var));
    }

    public long o0(long j4, o0 o0Var) {
        while (this.f41483b.hasNext()) {
            j4 = o0Var.a(j4, this.f41483b.b());
        }
        return j4;
    }

    public n q() {
        return this.f41483b.hasNext() ? n.o(this.f41483b.b()) : n.b();
    }

    public n q0(o0 o0Var) {
        boolean z4 = false;
        long j4 = 0;
        while (this.f41483b.hasNext()) {
            long b5 = this.f41483b.b();
            if (z4) {
                j4 = o0Var.a(j4, b5);
            } else {
                z4 = true;
                j4 = b5;
            }
        }
        return z4 ? n.o(j4) : n.b();
    }

    public h r0(int i4) {
        if (i4 > 0) {
            return i4 == 1 ? this : new h(this.f41484c, new k1(this.f41483b, i4));
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ߒ"));
    }

    public n s() {
        return q0(new d());
    }

    public n t() {
        if (!this.f41483b.hasNext()) {
            return n.b();
        }
        long b5 = this.f41483b.b();
        if (this.f41483b.hasNext()) {
            throw new IllegalStateException(ProtectedSandApp.s("ߎ"));
        }
        return n.o(b5);
    }

    public h u(q0<? extends h> q0Var) {
        return new h(this.f41484c, new z0(this.f41483b, q0Var));
    }

    public h u0(long j4, o0 o0Var) {
        o0Var.getClass();
        return new h(this.f41484c, new m1(this.f41483b, j4, o0Var));
    }

    public void x(p0 p0Var) {
        while (this.f41483b.hasNext()) {
            p0Var.h(this.f41483b.b());
        }
    }

    public void y(int i4, int i5, b0 b0Var) {
        while (this.f41483b.hasNext()) {
            b0Var.a(i4, this.f41483b.b());
            i4 += i5;
        }
    }

    public void z(b0 b0Var) {
        y(0, 1, b0Var);
    }

    h(com.annimon.stream.internal.d dVar, g.c cVar) {
        this.f41484c = dVar;
        this.f41483b = cVar;
    }
}
