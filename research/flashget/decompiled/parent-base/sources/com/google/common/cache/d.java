package com.google.common.cache;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.d0;
import com.google.common.base.l0;
import com.google.common.base.u0;
import com.google.common.base.v0;
import com.google.common.base.x0;
import com.google.common.cache.a;
import com.google.common.cache.k;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: CacheBuilder.java */
@g
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public final class d<K, V> {

    /* renamed from: q, reason: collision with root package name */
    private static final int f55107q = 16;

    /* renamed from: r, reason: collision with root package name */
    private static final int f55108r = 4;

    /* renamed from: s, reason: collision with root package name */
    private static final int f55109s = 0;

    /* renamed from: t, reason: collision with root package name */
    private static final int f55110t = 0;

    /* renamed from: u, reason: collision with root package name */
    static final u0<? extends a.b> f55111u = v0.d(new a());

    /* renamed from: v, reason: collision with root package name */
    static final f f55112v = new f(0, 0, 0, 0, 0, 0);

    /* renamed from: w, reason: collision with root package name */
    static final u0<a.b> f55113w = new b();

    /* renamed from: x, reason: collision with root package name */
    static final x0 f55114x = new c();

    /* renamed from: y, reason: collision with root package name */
    private static final Logger f55115y = Logger.getLogger(d.class.getName());

    /* renamed from: z, reason: collision with root package name */
    static final int f55116z = -1;

    /* renamed from: f, reason: collision with root package name */
    x<? super K, ? super V> f55122f;

    /* renamed from: g, reason: collision with root package name */
    k.t f55123g;

    /* renamed from: h, reason: collision with root package name */
    k.t f55124h;

    /* renamed from: l, reason: collision with root package name */
    com.google.common.base.q<Object> f55128l;

    /* renamed from: m, reason: collision with root package name */
    com.google.common.base.q<Object> f55129m;

    /* renamed from: n, reason: collision with root package name */
    r<? super K, ? super V> f55130n;

    /* renamed from: o, reason: collision with root package name */
    x0 f55131o;

    /* renamed from: a, reason: collision with root package name */
    boolean f55117a = true;

    /* renamed from: b, reason: collision with root package name */
    int f55118b = -1;

    /* renamed from: c, reason: collision with root package name */
    int f55119c = -1;

    /* renamed from: d, reason: collision with root package name */
    long f55120d = -1;

    /* renamed from: e, reason: collision with root package name */
    long f55121e = -1;

    /* renamed from: i, reason: collision with root package name */
    long f55125i = -1;

    /* renamed from: j, reason: collision with root package name */
    long f55126j = -1;

    /* renamed from: k, reason: collision with root package name */
    long f55127k = -1;

    /* renamed from: p, reason: collision with root package name */
    u0<? extends a.b> f55132p = f55111u;

    /* compiled from: CacheBuilder.java */
    class a implements a.b {
        a() {
        }

        @Override // com.google.common.cache.a.b
        public void a(int i4) {
        }

        @Override // com.google.common.cache.a.b
        public void b(int i4) {
        }

        @Override // com.google.common.cache.a.b
        public void c() {
        }

        @Override // com.google.common.cache.a.b
        public void d(long j4) {
        }

        @Override // com.google.common.cache.a.b
        public void e(long j4) {
        }

        @Override // com.google.common.cache.a.b
        public f f() {
            return d.f55112v;
        }
    }

    /* compiled from: CacheBuilder.java */
    class b implements u0<a.b> {
        b() {
        }

        @Override // com.google.common.base.u0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a.b get() {
            return new a.C0833a();
        }
    }

    /* compiled from: CacheBuilder.java */
    class c extends x0 {
        c() {
        }

        @Override // com.google.common.base.x0
        public long a() {
            return 0L;
        }
    }

    /* compiled from: CacheBuilder.java */
    /* renamed from: com.google.common.cache.d$d, reason: collision with other inner class name */
    enum EnumC0834d implements r<Object, Object> {
        INSTANCE;

        @Override // com.google.common.cache.r
        public void onRemoval(v<Object, Object> vVar) {
        }
    }

    /* compiled from: CacheBuilder.java */
    enum e implements x<Object, Object> {
        INSTANCE;

        @Override // com.google.common.cache.x
        public int weigh(Object obj, Object obj2) {
            return 1;
        }
    }

    private d() {
    }

    @f9.b
    public static d<Object, Object> D() {
        return new d<>();
    }

    private void c() {
        l0.h0(this.f55127k == -1, ProtectedSandApp.s("\uf3d0"));
    }

    private void d() {
        if (this.f55122f == null) {
            l0.h0(this.f55121e == -1, ProtectedSandApp.s("\uf3d1"));
        } else if (this.f55117a) {
            l0.h0(this.f55121e != -1, ProtectedSandApp.s("\uf3d2"));
        } else if (this.f55121e == -1) {
            f55115y.log(Level.WARNING, ProtectedSandApp.s("\uf3d3"));
        }
    }

    @f9.b
    @d9.c
    public static d<Object, Object> h(com.google.common.cache.e eVar) {
        d<Object, Object> f4 = eVar.f();
        f4.f55117a = false;
        return f4;
    }

    @f9.b
    @d9.c
    public static d<Object, Object> i(String str) {
        return h(com.google.common.cache.e.e(str));
    }

    @d9.c
    d<K, V> A() {
        this.f55117a = false;
        return this;
    }

    public d<K, V> B(long j4) {
        long j5 = this.f55120d;
        l0.s0(j5 == -1, ProtectedSandApp.s("\uf3d4"), j5);
        long j6 = this.f55121e;
        l0.s0(j6 == -1, ProtectedSandApp.s("\uf3d5"), j6);
        l0.h0(this.f55122f == null, ProtectedSandApp.s("\uf3d6"));
        l0.e(j4 >= 0, ProtectedSandApp.s("\uf3d7"));
        this.f55120d = j4;
        return this;
    }

    @d9.c
    public d<K, V> C(long j4) {
        long j5 = this.f55121e;
        l0.s0(j5 == -1, ProtectedSandApp.s("\uf3d5"), j5);
        long j6 = this.f55120d;
        l0.s0(j6 == -1, ProtectedSandApp.s("\uf3d4"), j6);
        l0.e(j4 >= 0, ProtectedSandApp.s("\uf3d8"));
        this.f55121e = j4;
        return this;
    }

    public d<K, V> E() {
        this.f55132p = f55113w;
        return this;
    }

    @d9.c
    public d<K, V> F(long j4, TimeUnit timeUnit) {
        timeUnit.getClass();
        long j5 = this.f55127k;
        l0.s0(j5 == -1, ProtectedSandApp.s("\uf3d9"), j5);
        l0.t(j4 > 0, ProtectedSandApp.s("\uf3da"), j4, timeUnit);
        this.f55127k = timeUnit.toNanos(j4);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @f9.b
    public <K1 extends K, V1 extends V> d<K1, V1> G(r<? super K1, ? super V1> rVar) {
        l0.g0(this.f55130n == null);
        rVar.getClass();
        this.f55130n = rVar;
        return this;
    }

    d<K, V> H(k.t tVar) {
        k.t tVar2 = this.f55123g;
        l0.x0(tVar2 == null, ProtectedSandApp.s("\uf3db"), tVar2);
        tVar.getClass();
        this.f55123g = tVar;
        return this;
    }

    d<K, V> I(k.t tVar) {
        k.t tVar2 = this.f55124h;
        l0.x0(tVar2 == null, ProtectedSandApp.s("\uf3dc"), tVar2);
        tVar.getClass();
        this.f55124h = tVar;
        return this;
    }

    @d9.c
    public d<K, V> J() {
        return I(k.t.SOFT);
    }

    public d<K, V> K(x0 x0Var) {
        l0.g0(this.f55131o == null);
        x0Var.getClass();
        this.f55131o = x0Var;
        return this;
    }

    @d9.c
    d<K, V> L(com.google.common.base.q<Object> qVar) {
        com.google.common.base.q<Object> qVar2 = this.f55129m;
        l0.x0(qVar2 == null, ProtectedSandApp.s("\uf3dd"), qVar2);
        qVar.getClass();
        this.f55129m = qVar;
        return this;
    }

    @d9.c
    public d<K, V> M() {
        return H(k.t.WEAK);
    }

    @d9.c
    public d<K, V> N() {
        return I(k.t.WEAK);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d9.c
    public <K1 extends K, V1 extends V> d<K1, V1> O(x<? super K1, ? super V1> xVar) {
        l0.g0(this.f55122f == null);
        if (this.f55117a) {
            long j4 = this.f55120d;
            l0.s0(j4 == -1, ProtectedSandApp.s("\uf3de"), j4);
        }
        xVar.getClass();
        this.f55122f = xVar;
        return this;
    }

    @f9.b
    public <K1 extends K, V1 extends V> com.google.common.cache.c<K1, V1> a() {
        d();
        c();
        return new k.o(this);
    }

    @f9.b
    public <K1 extends K, V1 extends V> j<K1, V1> b(CacheLoader<? super K1, V1> cacheLoader) {
        d();
        return new k.n(this, cacheLoader);
    }

    public d<K, V> e(int i4) {
        int i5 = this.f55119c;
        l0.n0(i5 == -1, ProtectedSandApp.s("\uf3df"), i5);
        l0.d(i4 > 0);
        this.f55119c = i4;
        return this;
    }

    public d<K, V> f(long j4, TimeUnit timeUnit) {
        long j5 = this.f55126j;
        l0.s0(j5 == -1, ProtectedSandApp.s("\uf3e0"), j5);
        l0.t(j4 >= 0, ProtectedSandApp.s("\uf3e1"), j4, timeUnit);
        this.f55126j = timeUnit.toNanos(j4);
        return this;
    }

    public d<K, V> g(long j4, TimeUnit timeUnit) {
        long j5 = this.f55125i;
        l0.s0(j5 == -1, ProtectedSandApp.s("\uf3e2"), j5);
        l0.t(j4 >= 0, ProtectedSandApp.s("\uf3e1"), j4, timeUnit);
        this.f55125i = timeUnit.toNanos(j4);
        return this;
    }

    int j() {
        int i4 = this.f55119c;
        if (i4 == -1) {
            return 4;
        }
        return i4;
    }

    long k() {
        long j4 = this.f55126j;
        if (j4 == -1) {
            return 0L;
        }
        return j4;
    }

    long l() {
        long j4 = this.f55125i;
        if (j4 == -1) {
            return 0L;
        }
        return j4;
    }

    int m() {
        int i4 = this.f55118b;
        if (i4 == -1) {
            return 16;
        }
        return i4;
    }

    com.google.common.base.q<Object> n() {
        return (com.google.common.base.q) d0.a(this.f55128l, o().defaultEquivalence());
    }

    k.t o() {
        return (k.t) d0.a(this.f55123g, k.t.STRONG);
    }

    long p() {
        if (this.f55125i == 0 || this.f55126j == 0) {
            return 0L;
        }
        return this.f55122f == null ? this.f55120d : this.f55121e;
    }

    long q() {
        long j4 = this.f55127k;
        if (j4 == -1) {
            return 0L;
        }
        return j4;
    }

    <K1 extends K, V1 extends V> r<K1, V1> r() {
        return (r) d0.a(this.f55130n, EnumC0834d.INSTANCE);
    }

    u0<? extends a.b> s() {
        return this.f55132p;
    }

    x0 t(boolean z4) {
        x0 x0Var = this.f55131o;
        return x0Var != null ? x0Var : z4 ? x0.b() : f55114x;
    }

    public String toString() {
        d0.b c5 = d0.c(this);
        int i4 = this.f55118b;
        if (i4 != -1) {
            c5.d(ProtectedSandApp.s("\uf3e3"), i4);
        }
        int i5 = this.f55119c;
        if (i5 != -1) {
            c5.d(ProtectedSandApp.s("\uf3e4"), i5);
        }
        long j4 = this.f55120d;
        if (j4 != -1) {
            c5.e(ProtectedSandApp.s("\uf3e5"), j4);
        }
        long j5 = this.f55121e;
        if (j5 != -1) {
            c5.e(ProtectedSandApp.s("\uf3e6"), j5);
        }
        long j6 = this.f55125i;
        String s4 = ProtectedSandApp.s("\uf3e7");
        if (j6 != -1) {
            StringBuilder sb = new StringBuilder(22);
            sb.append(j6);
            sb.append(s4);
            c5.f(ProtectedSandApp.s("\uf3e8"), sb.toString());
        }
        long j7 = this.f55126j;
        if (j7 != -1) {
            StringBuilder sb2 = new StringBuilder(22);
            sb2.append(j7);
            sb2.append(s4);
            c5.f(ProtectedSandApp.s("\uf3e9"), sb2.toString());
        }
        k.t tVar = this.f55123g;
        if (tVar != null) {
            c5.f(ProtectedSandApp.s("\uf3ea"), com.google.common.base.c.g(tVar.toString()));
        }
        k.t tVar2 = this.f55124h;
        if (tVar2 != null) {
            c5.f(ProtectedSandApp.s("\uf3eb"), com.google.common.base.c.g(tVar2.toString()));
        }
        if (this.f55128l != null) {
            c5.s(ProtectedSandApp.s("\uf3ec"));
        }
        if (this.f55129m != null) {
            c5.s(ProtectedSandApp.s("\uf3ed"));
        }
        if (this.f55130n != null) {
            c5.s(ProtectedSandApp.s("\uf3ee"));
        }
        return c5.toString();
    }

    com.google.common.base.q<Object> u() {
        return (com.google.common.base.q) d0.a(this.f55129m, v().defaultEquivalence());
    }

    k.t v() {
        return (k.t) d0.a(this.f55124h, k.t.STRONG);
    }

    <K1 extends K, V1 extends V> x<K1, V1> w() {
        return (x) d0.a(this.f55122f, e.INSTANCE);
    }

    public d<K, V> x(int i4) {
        int i5 = this.f55118b;
        l0.n0(i5 == -1, ProtectedSandApp.s("\uf3ef"), i5);
        l0.d(i4 >= 0);
        this.f55118b = i4;
        return this;
    }

    boolean y() {
        return this.f55132p == f55113w;
    }

    @d9.c
    d<K, V> z(com.google.common.base.q<Object> qVar) {
        com.google.common.base.q<Object> qVar2 = this.f55128l;
        l0.x0(qVar2 == null, ProtectedSandApp.s("\uf3f0"), qVar2);
        qVar.getClass();
        this.f55128l = qVar;
        return this;
    }
}
