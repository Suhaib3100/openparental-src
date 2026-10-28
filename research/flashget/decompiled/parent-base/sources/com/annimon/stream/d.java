package com.annimon.stream;

import com.annimon.stream.function.a1;
import com.annimon.stream.function.l;
import com.annimon.stream.function.q;
import com.annimon.stream.function.s1;
import com.annimon.stream.function.t;
import com.annimon.stream.function.w;
import com.annimon.stream.function.w0;
import com.annimon.stream.iterator.f;
import com.annimon.stream.iterator.g;
import com.annimon.stream.operator.r;
import com.annimon.stream.operator.s;
import com.annimon.stream.operator.u;
import com.annimon.stream.operator.v;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Closeable;
import java.util.Comparator;
import java.util.NoSuchElementException;

/* compiled from: DoubleStream.java */
/* loaded from: classes3.dex */
public final class d implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    private static final d f41345d = new d(null, new a());

    /* renamed from: e, reason: collision with root package name */
    private static final s1<Double> f41346e = new e();

    /* renamed from: b, reason: collision with root package name */
    private final g.a f41347b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.internal.d f41348c;

    /* compiled from: DoubleStream.java */
    static class a extends g.a {
        a() {
        }

        @Override // com.annimon.stream.iterator.g.a
        public double b() {
            return com.google.firebase.remoteconfig.p.f60679p;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }
    }

    /* compiled from: DoubleStream.java */
    class b implements com.annimon.stream.function.i {
        b() {
        }

        @Override // com.annimon.stream.function.i
        public double a(double d5, double d6) {
            return Math.min(d5, d6);
        }
    }

    /* compiled from: DoubleStream.java */
    class c implements com.annimon.stream.function.i {
        c() {
        }

        @Override // com.annimon.stream.function.i
        public double a(double d5, double d6) {
            return Math.max(d5, d6);
        }
    }

    /* compiled from: DoubleStream.java */
    /* renamed from: com.annimon.stream.d$d, reason: collision with other inner class name */
    class C0685d implements com.annimon.stream.function.i {
        C0685d() {
        }

        @Override // com.annimon.stream.function.i
        public double a(double d5, double d6) {
            return d6;
        }
    }

    /* compiled from: DoubleStream.java */
    static class e implements s1<Double> {
        e() {
        }

        public double a(Double d5) {
            return d5.doubleValue();
        }

        @Override // com.annimon.stream.function.s1
        public double c(Double d5) {
            return d5.doubleValue();
        }
    }

    private d(g.a aVar) {
        this(null, aVar);
    }

    public static d C(com.annimon.stream.function.m mVar) {
        mVar.getClass();
        return new d(null, new com.annimon.stream.operator.g(mVar));
    }

    public static d D(double d5, com.annimon.stream.function.l lVar, com.annimon.stream.function.p pVar) {
        lVar.getClass();
        return E(d5, pVar).N0(lVar);
    }

    public static d E(double d5, com.annimon.stream.function.p pVar) {
        pVar.getClass();
        return new d(null, new com.annimon.stream.operator.h(d5, pVar));
    }

    public static d S(double d5) {
        return new d(null, new com.annimon.stream.operator.a(new double[]{d5}));
    }

    public static d X(g.a aVar) {
        aVar.getClass();
        return new d(null, aVar);
    }

    public static d Y(double... dArr) {
        dArr.getClass();
        return dArr.length == 0 ? f41345d : new d(null, new com.annimon.stream.operator.a(dArr));
    }

    public static d f(d dVar, d dVar2) {
        dVar.getClass();
        dVar2.getClass();
        return new d(null, new com.annimon.stream.operator.b(dVar.f41347b, dVar2.f41347b)).c0(com.annimon.stream.internal.b.a(dVar, dVar2));
    }

    public static d l() {
        return f41345d;
    }

    public double A0() {
        if (!this.f41347b.hasNext()) {
            throw new NoSuchElementException(ProtectedSandApp.s("\u07bf"));
        }
        double b5 = this.f41347b.b();
        if (this.f41347b.hasNext()) {
            throw new IllegalStateException(ProtectedSandApp.s("\u07be"));
        }
        return b5;
    }

    public void B(t tVar) {
        z(0, 1, tVar);
    }

    public d B0(long j4) {
        if (j4 >= 0) {
            return j4 == 0 ? this : new d(this.f41348c, new s(this.f41347b, j4));
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("߀"));
    }

    public d C0() {
        return new d(this.f41348c, new com.annimon.stream.operator.t(this.f41347b));
    }

    public g.a F() {
        return this.f41347b;
    }

    public d G(long j4) {
        if (j4 >= 0) {
            return j4 == 0 ? f41345d : new d(this.f41348c, new com.annimon.stream.operator.i(this.f41347b, j4));
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("߁"));
    }

    public d H(com.annimon.stream.function.p pVar) {
        return new d(this.f41348c, new com.annimon.stream.operator.j(this.f41347b, pVar));
    }

    public d H0(Comparator<Double> comparator) {
        return d().m2(comparator).o0(f41346e);
    }

    public d I(int i4, int i5, w wVar) {
        return new d(this.f41348c, new com.annimon.stream.operator.k(new f.a(i4, i5, this.f41347b), wVar));
    }

    public d J(w wVar) {
        return I(0, 1, wVar);
    }

    public g K(com.annimon.stream.function.n nVar) {
        return new g(this.f41348c, new com.annimon.stream.operator.l(this.f41347b, nVar));
    }

    public double K0() {
        double d5 = com.google.firebase.remoteconfig.p.f60679p;
        while (this.f41347b.hasNext()) {
            d5 += this.f41347b.b();
        }
        return d5;
    }

    public h L(com.annimon.stream.function.o oVar) {
        return new h(this.f41348c, new com.annimon.stream.operator.m(this.f41347b, oVar));
    }

    public <R> p<R> M(com.annimon.stream.function.k<? extends R> kVar) {
        return new p<>(this.f41348c, new com.annimon.stream.operator.n(this.f41347b, kVar));
    }

    public d M0(com.annimon.stream.function.l lVar) {
        return new d(this.f41348c, new u(this.f41347b, lVar));
    }

    public l N() {
        return o0(new c());
    }

    public d N0(com.annimon.stream.function.l lVar) {
        return new d(this.f41348c, new v(this.f41347b, lVar));
    }

    public l O() {
        return o0(new b());
    }

    public double[] O0() {
        return com.annimon.stream.internal.c.b(this.f41347b);
    }

    public boolean Q(com.annimon.stream.function.l lVar) {
        while (this.f41347b.hasNext()) {
            if (lVar.d(this.f41347b.b())) {
                return false;
            }
        }
        return true;
    }

    public boolean a(com.annimon.stream.function.l lVar) {
        while (this.f41347b.hasNext()) {
            if (!lVar.d(this.f41347b.b())) {
                return false;
            }
        }
        return true;
    }

    public boolean b(com.annimon.stream.function.l lVar) {
        while (this.f41347b.hasNext()) {
            if (lVar.d(this.f41347b.b())) {
                return true;
            }
        }
        return false;
    }

    public l c() {
        double d5 = com.google.firebase.remoteconfig.p.f60679p;
        long j4 = 0;
        while (this.f41347b.hasNext()) {
            d5 += this.f41347b.b();
            j4++;
        }
        return j4 == 0 ? l.b() : l.p(d5 / j4);
    }

    public d c0(Runnable runnable) {
        runnable.getClass();
        com.annimon.stream.internal.d dVar = this.f41348c;
        if (dVar == null) {
            dVar = new com.annimon.stream.internal.d();
            dVar.f41494a = runnable;
        } else {
            dVar.f41494a = com.annimon.stream.internal.b.b(dVar.f41494a, runnable);
        }
        return new d(dVar, this.f41347b);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Runnable runnable;
        com.annimon.stream.internal.d dVar = this.f41348c;
        if (dVar == null || (runnable = dVar.f41494a) == null) {
            return;
        }
        runnable.run();
        this.f41348c.f41494a = null;
    }

    public p<Double> d() {
        return new p<>(this.f41348c, this.f41347b);
    }

    public <R> R e(a1<R> a1Var, w0<R> w0Var) {
        R r4 = a1Var.get();
        while (this.f41347b.hasNext()) {
            w0Var.b(r4, this.f41347b.b());
        }
        return r4;
    }

    public long g() {
        long j4 = 0;
        while (this.f41347b.hasNext()) {
            this.f41347b.b();
            j4++;
        }
        return j4;
    }

    public <R> R h(q<d, R> qVar) {
        qVar.getClass();
        return qVar.apply(this);
    }

    public d i() {
        return d().k().o0(f41346e);
    }

    public d j0(com.annimon.stream.function.j jVar) {
        return new d(this.f41348c, new com.annimon.stream.operator.o(this.f41347b, jVar));
    }

    public d k(com.annimon.stream.function.l lVar) {
        return new d(this.f41348c, new com.annimon.stream.operator.c(this.f41347b, lVar));
    }

    public d m(com.annimon.stream.function.l lVar) {
        return new d(this.f41348c, new com.annimon.stream.operator.d(this.f41347b, lVar));
    }

    public d n(int i4, int i5, com.annimon.stream.function.v vVar) {
        return new d(this.f41348c, new com.annimon.stream.operator.e(new f.a(i4, i5, this.f41347b), vVar));
    }

    public double n0(double d5, com.annimon.stream.function.i iVar) {
        while (this.f41347b.hasNext()) {
            d5 = iVar.a(d5, this.f41347b.b());
        }
        return d5;
    }

    public d o(com.annimon.stream.function.v vVar) {
        return n(0, 1, vVar);
    }

    public l o0(com.annimon.stream.function.i iVar) {
        boolean z4 = false;
        double d5 = com.google.firebase.remoteconfig.p.f60679p;
        while (this.f41347b.hasNext()) {
            double b5 = this.f41347b.b();
            if (z4) {
                d5 = iVar.a(d5, b5);
            } else {
                z4 = true;
                d5 = b5;
            }
        }
        return z4 ? l.p(d5) : l.b();
    }

    public d q(com.annimon.stream.function.l lVar) {
        return m(l.a.b(lVar));
    }

    public d q0(int i4) {
        if (i4 > 0) {
            return i4 == 1 ? this : new d(this.f41348c, new com.annimon.stream.operator.p(this.f41347b, i4));
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("߂"));
    }

    public d r0(double d5, com.annimon.stream.function.i iVar) {
        iVar.getClass();
        return new d(this.f41348c, new r(this.f41347b, d5, iVar));
    }

    public l s() {
        return this.f41347b.hasNext() ? l.p(this.f41347b.b()) : l.b();
    }

    public l t() {
        return o0(new C0685d());
    }

    public l u() {
        if (!this.f41347b.hasNext()) {
            return l.b();
        }
        double b5 = this.f41347b.b();
        if (this.f41347b.hasNext()) {
            throw new IllegalStateException(ProtectedSandApp.s("\u07be"));
        }
        return l.p(b5);
    }

    public d u0(com.annimon.stream.function.i iVar) {
        iVar.getClass();
        return new d(this.f41348c, new com.annimon.stream.operator.q(this.f41347b, iVar));
    }

    public d x(com.annimon.stream.function.k<? extends d> kVar) {
        return new d(this.f41348c, new com.annimon.stream.operator.f(this.f41347b, kVar));
    }

    public void y(com.annimon.stream.function.j jVar) {
        while (this.f41347b.hasNext()) {
            jVar.c(this.f41347b.b());
        }
    }

    public void z(int i4, int i5, t tVar) {
        while (this.f41347b.hasNext()) {
            tVar.a(i4, this.f41347b.b());
            i4 += i5;
        }
    }

    d(com.annimon.stream.internal.d dVar, g.a aVar) {
        this.f41348c = dVar;
        this.f41347b = aVar;
    }
}
