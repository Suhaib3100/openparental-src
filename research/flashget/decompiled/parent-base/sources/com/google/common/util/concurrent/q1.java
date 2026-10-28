package com.google.common.util.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.b3;
import com.google.common.collect.c6;
import com.google.common.collect.e5;
import com.google.common.collect.e7;
import com.google.common.collect.f3;
import com.google.common.collect.h3;
import com.google.common.collect.l3;
import com.google.common.collect.l4;
import com.google.common.collect.p4;
import com.google.common.collect.q3;
import com.google.common.collect.r3;
import com.google.common.collect.s4;
import com.google.common.collect.t4;
import com.google.common.collect.u4;
import com.google.common.util.concurrent.c1;
import com.google.common.util.concurrent.f1;
import com.google.common.util.concurrent.p1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: ServiceManager.java */
@b0
@d9.c
/* loaded from: classes6.dex */
public final class q1 implements r1 {

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f57914c = Logger.getLogger(q1.class.getName());

    /* renamed from: d, reason: collision with root package name */
    private static final c1.a<d> f57915d = new a();

    /* renamed from: e, reason: collision with root package name */
    private static final c1.a<d> f57916e = new b();

    /* renamed from: a, reason: collision with root package name */
    private final g f57917a;

    /* renamed from: b, reason: collision with root package name */
    private final f3<p1> f57918b;

    /* compiled from: ServiceManager.java */
    class a implements c1.a<d> {
        a() {
        }

        @Override // com.google.common.util.concurrent.c1.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(d dVar) {
            dVar.b();
        }

        public String toString() {
            return ProtectedSandApp.s("﨎");
        }
    }

    /* compiled from: ServiceManager.java */
    class b implements c1.a<d> {
        b() {
        }

        @Override // com.google.common.util.concurrent.c1.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(d dVar) {
            dVar.c();
        }

        public String toString() {
            return ProtectedSandApp.s("﨏");
        }
    }

    /* compiled from: ServiceManager.java */
    private static final class c extends Throwable {
        private c() {
        }

        c(a aVar) {
        }
    }

    /* compiled from: ServiceManager.java */
    public static abstract class d {
        public void a(p1 p1Var) {
        }

        public void b() {
        }

        public void c() {
        }
    }

    /* compiled from: ServiceManager.java */
    private static final class e extends com.google.common.util.concurrent.g {
        private e() {
        }

        @Override // com.google.common.util.concurrent.g
        protected void m() {
            u();
        }

        @Override // com.google.common.util.concurrent.g
        protected void n() {
            v();
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }

    /* compiled from: ServiceManager.java */
    private static final class f extends p1.a {

        /* renamed from: a, reason: collision with root package name */
        final p1 f57919a;

        /* renamed from: b, reason: collision with root package name */
        final WeakReference<g> f57920b;

        f(p1 p1Var, WeakReference<g> weakReference) {
            this.f57919a = p1Var;
            this.f57920b = weakReference;
        }

        @Override // com.google.common.util.concurrent.p1.a
        public void a(p1.b bVar, Throwable th) {
            g gVar = this.f57920b.get();
            if (gVar != null) {
                if (!(this.f57919a instanceof e)) {
                    Logger logger = q1.f57914c;
                    Level level = Level.SEVERE;
                    String valueOf = String.valueOf(this.f57919a);
                    String valueOf2 = String.valueOf(bVar);
                    StringBuilder a5 = com.google.common.base.g.a(valueOf2.length() + valueOf.length() + 34, ProtectedSandApp.s("塚"), valueOf, ProtectedSandApp.s("﨑"), valueOf2);
                    a5.append(ProtectedSandApp.s("晴"));
                    logger.log(level, a5.toString(), th);
                }
                gVar.n(this.f57919a, bVar, p1.b.FAILED);
            }
        }

        @Override // com.google.common.util.concurrent.p1.a
        public void b() {
            g gVar = this.f57920b.get();
            if (gVar != null) {
                gVar.n(this.f57919a, p1.b.STARTING, p1.b.RUNNING);
            }
        }

        @Override // com.google.common.util.concurrent.p1.a
        public void c() {
            g gVar = this.f57920b.get();
            if (gVar != null) {
                gVar.n(this.f57919a, p1.b.NEW, p1.b.STARTING);
                if (this.f57919a instanceof e) {
                    return;
                }
                q1.f57914c.log(Level.FINE, ProtectedSandApp.s("﨓"), this.f57919a);
            }
        }

        @Override // com.google.common.util.concurrent.p1.a
        public void d(p1.b bVar) {
            g gVar = this.f57920b.get();
            if (gVar != null) {
                gVar.n(this.f57919a, bVar, p1.b.STOPPING);
            }
        }

        @Override // com.google.common.util.concurrent.p1.a
        public void e(p1.b bVar) {
            g gVar = this.f57920b.get();
            if (gVar != null) {
                if (!(this.f57919a instanceof e)) {
                    q1.f57914c.log(Level.FINE, ProtectedSandApp.s("﨔"), new Object[]{this.f57919a, bVar});
                }
                gVar.n(this.f57919a, bVar, p1.b.TERMINATED);
            }
        }
    }

    /* compiled from: ServiceManager.java */
    private static final class g {

        /* renamed from: a, reason: collision with root package name */
        final f1 f57921a = new f1();

        /* renamed from: b, reason: collision with root package name */
        @g9.a("monitor")
        final c6<p1.b, p1> f57922b;

        /* renamed from: c, reason: collision with root package name */
        @g9.a("monitor")
        final u4<p1.b> f57923c;

        /* renamed from: d, reason: collision with root package name */
        @g9.a("monitor")
        final Map<p1, com.google.common.base.s0> f57924d;

        /* renamed from: e, reason: collision with root package name */
        @g9.a("monitor")
        boolean f57925e;

        /* renamed from: f, reason: collision with root package name */
        @g9.a("monitor")
        boolean f57926f;

        /* renamed from: g, reason: collision with root package name */
        final int f57927g;

        /* renamed from: h, reason: collision with root package name */
        final f1.a f57928h;

        /* renamed from: i, reason: collision with root package name */
        final f1.a f57929i;

        /* renamed from: j, reason: collision with root package name */
        final c1<d> f57930j;

        /* compiled from: ServiceManager.java */
        class a implements com.google.common.base.x<Map.Entry<p1, Long>, Long> {
            a(g gVar) {
            }

            @Override // com.google.common.base.x
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Long apply(Map.Entry<p1, Long> entry) {
                return entry.getValue();
            }
        }

        /* compiled from: ServiceManager.java */
        class b implements c1.a<d> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ p1 f57931a;

            b(g gVar, p1 p1Var) {
                this.f57931a = p1Var;
            }

            @Override // com.google.common.util.concurrent.c1.a
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(d dVar) {
                dVar.a(this.f57931a);
            }

            public String toString() {
                String valueOf = String.valueOf(this.f57931a);
                return com.google.common.base.h.a(valueOf.length() + 18, ProtectedSandApp.s("凞"), valueOf, ProtectedSandApp.s("猪"));
            }
        }

        /* compiled from: ServiceManager.java */
        final class c extends f1.a {
            c() {
                super(g.this.f57921a);
            }

            @Override // com.google.common.util.concurrent.f1.a
            @g9.a("ServiceManagerState.this.monitor")
            public boolean a() {
                int W2 = g.this.f57923c.W2(p1.b.RUNNING);
                g gVar = g.this;
                return W2 == gVar.f57927g || gVar.f57923c.contains(p1.b.STOPPING) || g.this.f57923c.contains(p1.b.TERMINATED) || g.this.f57923c.contains(p1.b.FAILED);
            }
        }

        /* compiled from: ServiceManager.java */
        final class d extends f1.a {
            d() {
                super(g.this.f57921a);
            }

            @Override // com.google.common.util.concurrent.f1.a
            @g9.a("ServiceManagerState.this.monitor")
            public boolean a() {
                return g.this.f57923c.W2(p1.b.FAILED) + g.this.f57923c.W2(p1.b.TERMINATED) == g.this.f57927g;
            }
        }

        g(b3<p1> b3Var) {
            c6<p1.b, p1> a5 = s4.c(p1.b.class).g().a();
            this.f57922b = a5;
            this.f57923c = a5.keys();
            this.f57924d = new IdentityHashMap();
            this.f57928h = new c();
            this.f57929i = new d();
            this.f57930j = new c1<>();
            this.f57927g = b3Var.size();
            a5.k1(p1.b.NEW, b3Var);
        }

        void a(d dVar, Executor executor) {
            this.f57930j.b(dVar, executor);
        }

        void b() {
            this.f57921a.q(this.f57928h);
            try {
                f();
            } finally {
                this.f57921a.D();
            }
        }

        void c(long j4, TimeUnit timeUnit) throws TimeoutException {
            this.f57921a.g();
            try {
                if (this.f57921a.N(this.f57928h, j4, timeUnit)) {
                    f();
                    return;
                }
                String valueOf = String.valueOf(t4.n(this.f57922b, com.google.common.base.n0.n(q3.L(p1.b.NEW, p1.b.STARTING))));
                StringBuilder sb = new StringBuilder(valueOf.length() + 93);
                sb.append(ProtectedSandApp.s("益"));
                sb.append(valueOf);
                throw new TimeoutException(sb.toString());
            } finally {
                this.f57921a.D();
            }
        }

        void d() {
            this.f57921a.q(this.f57929i);
            this.f57921a.D();
        }

        void e(long j4, TimeUnit timeUnit) throws TimeoutException {
            this.f57921a.g();
            try {
                if (this.f57921a.N(this.f57929i, j4, timeUnit)) {
                    return;
                }
                String valueOf = String.valueOf(t4.n(this.f57922b, com.google.common.base.n0.q(com.google.common.base.n0.n(EnumSet.of(p1.b.TERMINATED, p1.b.FAILED)))));
                StringBuilder sb = new StringBuilder(valueOf.length() + 83);
                sb.append(ProtectedSandApp.s("礼"));
                sb.append(valueOf);
                throw new TimeoutException(sb.toString());
            } finally {
                this.f57921a.D();
            }
        }

        @g9.a("monitor")
        void f() {
            u4<p1.b> u4Var = this.f57923c;
            p1.b bVar = p1.b.RUNNING;
            if (u4Var.W2(bVar) == this.f57927g) {
                return;
            }
            String valueOf = String.valueOf(t4.n(this.f57922b, com.google.common.base.n0.q(com.google.common.base.n0.m(bVar))));
            throw new IllegalStateException(com.google.common.base.i.a(valueOf.length() + 79, ProtectedSandApp.s("神"), valueOf));
        }

        void g() {
            com.google.common.base.l0.h0(!this.f57921a.B(), ProtectedSandApp.s("祥"));
            this.f57930j.c();
        }

        void h(p1 p1Var) {
            this.f57930j.d(new b(this, p1Var));
        }

        void i() {
            this.f57930j.d(q1.f57915d);
        }

        void j() {
            this.f57930j.d(q1.f57916e);
        }

        void k() {
            this.f57921a.g();
            try {
                if (!this.f57926f) {
                    this.f57925e = true;
                    return;
                }
                ArrayList arrayList = new ArrayList();
                e7<p1> it = l().values().iterator();
                while (it.hasNext()) {
                    p1 next = it.next();
                    if (next.state() != p1.b.NEW) {
                        arrayList.add(next);
                    }
                }
                String valueOf = String.valueOf(arrayList);
                StringBuilder sb = new StringBuilder(valueOf.length() + 89);
                sb.append(ProtectedSandApp.s("福"));
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            } finally {
                this.f57921a.D();
            }
        }

        r3<p1.b, p1> l() {
            r3.a aVar = new r3.a();
            this.f57921a.g();
            try {
                for (Map.Entry<p1.b, p1> entry : this.f57922b.t()) {
                    if (!(entry.getValue() instanceof e)) {
                        aVar.q(entry);
                    }
                }
                this.f57921a.D();
                return aVar.a();
            } catch (Throwable th) {
                this.f57921a.D();
                throw th;
            }
        }

        h3<p1, Long> m() {
            this.f57921a.g();
            try {
                ArrayList u4 = l4.u(this.f57924d.size());
                for (Map.Entry<p1, com.google.common.base.s0> entry : this.f57924d.entrySet()) {
                    p1 key = entry.getKey();
                    com.google.common.base.s0 value = entry.getValue();
                    if (!value.i() && !(key instanceof e)) {
                        u4.add(p4.O(key, Long.valueOf(value.g(TimeUnit.MILLISECONDS))));
                    }
                }
                this.f57921a.D();
                Collections.sort(u4, e5.c0().u0(new a()));
                return h3.h(u4);
            } catch (Throwable th) {
                this.f57921a.D();
                throw th;
            }
        }

        void n(p1 p1Var, p1.b bVar, p1.b bVar2) {
            p1Var.getClass();
            com.google.common.base.l0.d(bVar != bVar2);
            this.f57921a.g();
            try {
                this.f57926f = true;
                if (!this.f57925e) {
                    this.f57921a.D();
                    g();
                    return;
                }
                com.google.common.base.l0.B0(this.f57922b.remove(bVar, p1Var), ProtectedSandApp.s("靖"), p1Var, bVar);
                com.google.common.base.l0.B0(this.f57922b.put(bVar2, p1Var), ProtectedSandApp.s("精"), p1Var, bVar2);
                com.google.common.base.s0 s0Var = this.f57924d.get(p1Var);
                if (s0Var == null) {
                    s0Var = com.google.common.base.s0.c();
                    this.f57924d.put(p1Var, s0Var);
                }
                p1.b bVar3 = p1.b.RUNNING;
                if (bVar2.compareTo(bVar3) >= 0 && s0Var.i()) {
                    s0Var.l();
                    if (!(p1Var instanceof e)) {
                        q1.f57914c.log(Level.FINE, ProtectedSandApp.s("羽"), new Object[]{p1Var, s0Var});
                    }
                }
                p1.b bVar4 = p1.b.FAILED;
                if (bVar2 == bVar4) {
                    h(p1Var);
                }
                if (this.f57923c.W2(bVar3) == this.f57927g) {
                    i();
                } else if (this.f57923c.W2(p1.b.TERMINATED) + this.f57923c.W2(bVar4) == this.f57927g) {
                    j();
                }
                this.f57921a.D();
                g();
            } catch (Throwable th) {
                this.f57921a.D();
                g();
                throw th;
            }
        }

        void o(p1 p1Var) {
            this.f57921a.g();
            try {
                if (this.f57924d.get(p1Var) == null) {
                    this.f57924d.put(p1Var, com.google.common.base.s0.c());
                }
            } finally {
                this.f57921a.D();
            }
        }
    }

    public q1(Iterable<? extends p1> iterable) {
        f3<p1> w4 = f3.w(iterable);
        if (w4.isEmpty()) {
            f57914c.log(Level.WARNING, ProtectedSandApp.s("﨟"), (Throwable) new c());
            w4 = f3.I(new e(null));
        }
        g gVar = new g(w4);
        this.f57917a = gVar;
        this.f57918b = w4;
        WeakReference weakReference = new WeakReference(gVar);
        e7<p1> it = w4.iterator();
        while (it.hasNext()) {
            p1 next = it.next();
            next.a(new f(next, weakReference), a0.INSTANCE);
            com.google.common.base.l0.u(next.state() == p1.b.NEW, ProtectedSandApp.s("蘒"), next);
        }
        this.f57917a.k();
    }

    @Override // com.google.common.util.concurrent.r1
    public l3 a() {
        return this.f57917a.l();
    }

    public void e(d dVar, Executor executor) {
        this.f57917a.a(dVar, executor);
    }

    public void f() {
        this.f57917a.b();
    }

    public void g(long j4, TimeUnit timeUnit) throws TimeoutException {
        this.f57917a.c(j4, timeUnit);
    }

    public void h() {
        this.f57917a.d();
    }

    public void i(long j4, TimeUnit timeUnit) throws TimeoutException {
        this.f57917a.e(j4, timeUnit);
    }

    public boolean j() {
        e7<p1> it = this.f57918b.iterator();
        while (it.hasNext()) {
            if (!it.next().isRunning()) {
                return false;
            }
        }
        return true;
    }

    public r3<p1.b, p1> k() {
        return this.f57917a.l();
    }

    @f9.a
    public q1 l() {
        e7<p1> it = this.f57918b.iterator();
        while (it.hasNext()) {
            com.google.common.base.l0.x0(it.next().state() == p1.b.NEW, ProtectedSandApp.s("﨡"), this);
        }
        e7<p1> it2 = this.f57918b.iterator();
        while (it2.hasNext()) {
            p1 next = it2.next();
            try {
                this.f57917a.o(next);
                next.e();
            } catch (IllegalStateException e4) {
                Logger logger = f57914c;
                Level level = Level.WARNING;
                String valueOf = String.valueOf(next);
                logger.log(level, com.google.common.base.i.a(valueOf.length() + 24, ProtectedSandApp.s("諸"), valueOf), (Throwable) e4);
            }
        }
        return this;
    }

    public h3<p1, Long> m() {
        return this.f57917a.m();
    }

    @f9.a
    public q1 n() {
        e7<p1> it = this.f57918b.iterator();
        while (it.hasNext()) {
            it.next().h();
        }
        return this;
    }

    public String toString() {
        return com.google.common.base.d0.b(q1.class).f(ProtectedSandApp.s("﨣"), com.google.common.collect.c0.d(this.f57918b, com.google.common.base.n0.q(com.google.common.base.n0.o(e.class)))).toString();
    }
}
