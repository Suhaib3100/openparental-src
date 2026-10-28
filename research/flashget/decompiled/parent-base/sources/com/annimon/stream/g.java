package com.annimon.stream;

import com.annimon.stream.function.a1;
import com.annimon.stream.function.g0;
import com.annimon.stream.function.j0;
import com.annimon.stream.function.k0;
import com.annimon.stream.function.l0;
import com.annimon.stream.function.n0;
import com.annimon.stream.function.q;
import com.annimon.stream.function.t1;
import com.annimon.stream.function.x0;
import com.annimon.stream.iterator.f;
import com.annimon.stream.iterator.g;
import com.annimon.stream.operator.a0;
import com.annimon.stream.operator.b0;
import com.annimon.stream.operator.c0;
import com.annimon.stream.operator.d0;
import com.annimon.stream.operator.e0;
import com.annimon.stream.operator.f0;
import com.annimon.stream.operator.h0;
import com.annimon.stream.operator.i0;
import com.annimon.stream.operator.m0;
import com.annimon.stream.operator.o0;
import com.annimon.stream.operator.p0;
import com.annimon.stream.operator.q0;
import com.annimon.stream.operator.r0;
import com.annimon.stream.operator.s0;
import com.annimon.stream.operator.t0;
import com.annimon.stream.operator.w;
import com.annimon.stream.operator.x;
import com.annimon.stream.operator.y;
import com.annimon.stream.operator.z;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Closeable;
import java.util.Comparator;
import java.util.NoSuchElementException;

/* compiled from: IntStream.java */
/* loaded from: classes3.dex */
public final class g implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    private static final g f41474d = new g(null, new a());

    /* renamed from: e, reason: collision with root package name */
    private static final t1<Integer> f41475e = new e();

    /* renamed from: b, reason: collision with root package name */
    private final g.b f41476b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.internal.d f41477c;

    /* compiled from: IntStream.java */
    static class a extends g.b {
        a() {
        }

        @Override // com.annimon.stream.iterator.g.b
        public int b() {
            return 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }
    }

    /* compiled from: IntStream.java */
    class b implements g0 {
        b() {
        }

        @Override // com.annimon.stream.function.g0
        public int a(int i4, int i5) {
            return i4 < i5 ? i4 : i5;
        }
    }

    /* compiled from: IntStream.java */
    class c implements g0 {
        c() {
        }

        @Override // com.annimon.stream.function.g0
        public int a(int i4, int i5) {
            return i4 > i5 ? i4 : i5;
        }
    }

    /* compiled from: IntStream.java */
    class d implements g0 {
        d() {
        }

        @Override // com.annimon.stream.function.g0
        public int a(int i4, int i5) {
            return i5;
        }
    }

    /* compiled from: IntStream.java */
    static class e implements t1<Integer> {
        e() {
        }

        public int a(Integer num) {
            return num.intValue();
        }

        @Override // com.annimon.stream.function.t1
        public int c(Integer num) {
            return num.intValue();
        }
    }

    private g(g.b bVar) {
        this(null, bVar);
    }

    public static g B(k0 k0Var) {
        k0Var.getClass();
        return new g(null, new d0(k0Var));
    }

    public static g C(int i4, j0 j0Var, n0 n0Var) {
        j0Var.getClass();
        return D(i4, n0Var).S0(j0Var);
    }

    public static g D(int i4, n0 n0Var) {
        n0Var.getClass();
        return new g(null, new e0(i4, n0Var));
    }

    public static g Q(int i4) {
        return new g(null, new w(new int[]{i4}));
    }

    public static g S(g.b bVar) {
        bVar.getClass();
        return new g(null, bVar);
    }

    public static g X(int... iArr) {
        iArr.getClass();
        return iArr.length == 0 ? f41474d : new g(null, new w(iArr));
    }

    public static g Y(CharSequence charSequence) {
        return new g(null, new x(charSequence));
    }

    public static g e(g gVar, g gVar2) {
        gVar.getClass();
        gVar2.getClass();
        return new g(null, new y(gVar.f41476b, gVar2.f41476b)).c0(com.annimon.stream.internal.b.a(gVar, gVar2));
    }

    public static g k() {
        return f41474d;
    }

    public static g n0(int i4, int i5) {
        return i4 >= i5 ? f41474d : o0(i4, i5 - 1);
    }

    public static g o0(int i4, int i5) {
        return i4 > i5 ? f41474d : i4 == i5 ? Q(i4) : new g(null, new m0(i4, i5));
    }

    public g A0(int i4, g0 g0Var) {
        g0Var.getClass();
        return new g(this.f41477c, new p0(this.f41476b, i4, g0Var));
    }

    public g B0(g0 g0Var) {
        g0Var.getClass();
        return new g(this.f41477c, new o0(this.f41476b, g0Var));
    }

    public int C0() {
        if (!this.f41476b.hasNext()) {
            throw new NoSuchElementException(ProtectedSandApp.s("߉"));
        }
        int b5 = this.f41476b.b();
        if (this.f41476b.hasNext()) {
            throw new IllegalStateException(ProtectedSandApp.s("߈"));
        }
        return b5;
    }

    public g.b E() {
        return this.f41476b;
    }

    public g F(long j4) {
        if (j4 >= 0) {
            return j4 == 0 ? f41474d : new g(this.f41477c, new f0(this.f41476b, j4));
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ߊ"));
    }

    public g G(n0 n0Var) {
        return new g(this.f41477c, new com.annimon.stream.operator.g0(this.f41476b, n0Var));
    }

    public g H(int i4, int i5, g0 g0Var) {
        return new g(this.f41477c, new h0(new f.b(i4, i5, this.f41476b), g0Var));
    }

    public g H0(long j4) {
        if (j4 >= 0) {
            return j4 == 0 ? this : new g(this.f41477c, new q0(this.f41476b, j4));
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ߋ"));
    }

    public g I(g0 g0Var) {
        return H(0, 1, g0Var);
    }

    public com.annimon.stream.d J(l0 l0Var) {
        return new com.annimon.stream.d(this.f41477c, new i0(this.f41476b, l0Var));
    }

    public h K(com.annimon.stream.function.m0 m0Var) {
        return new h(this.f41477c, new com.annimon.stream.operator.j0(this.f41476b, m0Var));
    }

    public g K0() {
        return new g(this.f41477c, new r0(this.f41476b));
    }

    public <R> p<R> L(com.annimon.stream.function.i0<? extends R> i0Var) {
        return new p<>(this.f41477c, new com.annimon.stream.operator.k0(this.f41476b, i0Var));
    }

    public m M() {
        return r0(new c());
    }

    public g M0(Comparator<Integer> comparator) {
        return c().m2(comparator).q0(f41475e);
    }

    public m N() {
        return r0(new b());
    }

    public int N0() {
        int i4 = 0;
        while (this.f41476b.hasNext()) {
            i4 += this.f41476b.b();
        }
        return i4;
    }

    public boolean O(j0 j0Var) {
        while (this.f41476b.hasNext()) {
            if (j0Var.test(this.f41476b.b())) {
                return false;
            }
        }
        return true;
    }

    public g O0(j0 j0Var) {
        return new g(this.f41477c, new s0(this.f41476b, j0Var));
    }

    public g S0(j0 j0Var) {
        return new g(this.f41477c, new t0(this.f41476b, j0Var));
    }

    public int[] U0() {
        return com.annimon.stream.internal.c.c(this.f41476b);
    }

    public boolean a(j0 j0Var) {
        while (this.f41476b.hasNext()) {
            if (!j0Var.test(this.f41476b.b())) {
                return false;
            }
        }
        return true;
    }

    public boolean b(j0 j0Var) {
        while (this.f41476b.hasNext()) {
            if (j0Var.test(this.f41476b.b())) {
                return true;
            }
        }
        return false;
    }

    public p<Integer> c() {
        return new p<>(this.f41477c, this.f41476b);
    }

    public g c0(Runnable runnable) {
        runnable.getClass();
        com.annimon.stream.internal.d dVar = this.f41477c;
        if (dVar == null) {
            dVar = new com.annimon.stream.internal.d();
            dVar.f41494a = runnable;
        } else {
            dVar.f41494a = com.annimon.stream.internal.b.b(dVar.f41494a, runnable);
        }
        return new g(dVar, this.f41476b);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Runnable runnable;
        com.annimon.stream.internal.d dVar = this.f41477c;
        if (dVar == null || (runnable = dVar.f41494a) == null) {
            return;
        }
        runnable.run();
        this.f41477c.f41494a = null;
    }

    public <R> R d(a1<R> a1Var, x0<R> x0Var) {
        R r4 = a1Var.get();
        while (this.f41476b.hasNext()) {
            x0Var.b(r4, this.f41476b.b());
        }
        return r4;
    }

    public long f() {
        long j4 = 0;
        while (this.f41476b.hasNext()) {
            this.f41476b.b();
            j4++;
        }
        return j4;
    }

    public <R> R g(q<g, R> qVar) {
        qVar.getClass();
        return qVar.apply(this);
    }

    public g h() {
        return c().k().q0(f41475e);
    }

    public g i(j0 j0Var) {
        return new g(this.f41477c, new z(this.f41476b, j0Var));
    }

    public g j0(com.annimon.stream.function.h0 h0Var) {
        return new g(this.f41477c, new com.annimon.stream.operator.l0(this.f41476b, h0Var));
    }

    public g l(j0 j0Var) {
        return new g(this.f41477c, new a0(this.f41476b, j0Var));
    }

    public g m(int i4, int i5, com.annimon.stream.function.a0 a0Var) {
        return new g(this.f41477c, new b0(new f.b(i4, i5, this.f41476b), a0Var));
    }

    public g n(com.annimon.stream.function.a0 a0Var) {
        return m(0, 1, a0Var);
    }

    public g o(j0 j0Var) {
        return l(j0.a.b(j0Var));
    }

    public m q() {
        return this.f41476b.hasNext() ? m.p(this.f41476b.b()) : m.b();
    }

    public int q0(int i4, g0 g0Var) {
        while (this.f41476b.hasNext()) {
            i4 = g0Var.a(i4, this.f41476b.b());
        }
        return i4;
    }

    public m r0(g0 g0Var) {
        boolean z4 = false;
        int i4 = 0;
        while (this.f41476b.hasNext()) {
            int b5 = this.f41476b.b();
            if (z4) {
                i4 = g0Var.a(i4, b5);
            } else {
                z4 = true;
                i4 = b5;
            }
        }
        return z4 ? m.p(i4) : m.b();
    }

    public m s() {
        return r0(new d());
    }

    public m t() {
        if (!this.f41476b.hasNext()) {
            return m.b();
        }
        int b5 = this.f41476b.b();
        if (this.f41476b.hasNext()) {
            throw new IllegalStateException(ProtectedSandApp.s("߈"));
        }
        return m.p(b5);
    }

    public g u(com.annimon.stream.function.i0<? extends g> i0Var) {
        return new g(this.f41477c, new c0(this.f41476b, i0Var));
    }

    public g u0(int i4) {
        if (i4 > 0) {
            return i4 == 1 ? this : new g(this.f41477c, new com.annimon.stream.operator.n0(this.f41476b, i4));
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ߌ"));
    }

    public void x(com.annimon.stream.function.h0 h0Var) {
        while (this.f41476b.hasNext()) {
            h0Var.f(this.f41476b.b());
        }
    }

    public void y(int i4, int i5, com.annimon.stream.function.y yVar) {
        while (this.f41476b.hasNext()) {
            yVar.a(i4, this.f41476b.b());
            i4 += i5;
        }
    }

    public void z(com.annimon.stream.function.y yVar) {
        y(0, 1, yVar);
    }

    g(com.annimon.stream.internal.d dVar, g.b bVar) {
        this.f41477c = dVar;
        this.f41476b = bVar;
    }
}
