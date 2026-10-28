package com.google.common.util.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.f3;
import com.google.common.collect.l4;
import com.google.common.collect.n4;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: Striped.java */
@b0
@d9.c
@d9.a
/* loaded from: classes6.dex */
public abstract class c2<L> {

    /* renamed from: a, reason: collision with root package name */
    private static final int f57715a = 1024;

    /* renamed from: b, reason: collision with root package name */
    private static final int f57716b = -1;

    /* compiled from: Striped.java */
    private static class b<L> extends f<L> {

        /* renamed from: d, reason: collision with root package name */
        private final Object[] f57717d;

        @Override // com.google.common.util.concurrent.c2
        public L j(int i4) {
            return (L) this.f57717d[i4];
        }

        @Override // com.google.common.util.concurrent.c2
        public int v() {
            return this.f57717d.length;
        }

        private b(int i4, com.google.common.base.u0<L> u0Var) {
            super(i4);
            int i5 = 0;
            com.google.common.base.l0.e(i4 <= 1073741824, ProtectedSandApp.s("寧"));
            this.f57717d = new Object[this.f57727c + 1];
            while (true) {
                Object[] objArr = this.f57717d;
                if (i5 >= objArr.length) {
                    return;
                }
                objArr[i5] = u0Var.get();
                i5++;
            }
        }
    }

    /* compiled from: Striped.java */
    @d9.d
    static class c<L> extends f<L> {

        /* renamed from: d, reason: collision with root package name */
        final ConcurrentMap<Integer, L> f57718d;

        /* renamed from: e, reason: collision with root package name */
        final com.google.common.base.u0<L> f57719e;

        /* renamed from: f, reason: collision with root package name */
        final int f57720f;

        c(int i4, com.google.common.base.u0<L> u0Var) {
            super(i4);
            int i5 = this.f57727c;
            this.f57720f = i5 == -1 ? Integer.MAX_VALUE : i5 + 1;
            this.f57719e = u0Var;
            this.f57718d = new n4().m().i();
        }

        @Override // com.google.common.util.concurrent.c2
        public L j(int i4) {
            if (this.f57720f != Integer.MAX_VALUE) {
                com.google.common.base.l0.C(i4, v());
            }
            L l4 = this.f57718d.get(Integer.valueOf(i4));
            if (l4 != null) {
                return l4;
            }
            L l5 = this.f57719e.get();
            return (L) com.google.common.base.d0.a(this.f57718d.putIfAbsent(Integer.valueOf(i4), l5), l5);
        }

        @Override // com.google.common.util.concurrent.c2
        public int v() {
            return this.f57720f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Striped.java */
    static class d extends ReentrantLock {

        /* renamed from: b, reason: collision with root package name */
        long f57721b;

        /* renamed from: c, reason: collision with root package name */
        long f57722c;

        /* renamed from: d, reason: collision with root package name */
        long f57723d;

        d() {
            super(false);
        }
    }

    /* compiled from: Striped.java */
    private static class e extends Semaphore {

        /* renamed from: b, reason: collision with root package name */
        long f57724b;

        /* renamed from: c, reason: collision with root package name */
        long f57725c;

        /* renamed from: d, reason: collision with root package name */
        long f57726d;

        e(int i4) {
            super(i4, false);
        }
    }

    /* compiled from: Striped.java */
    private static abstract class f<L> extends c2<L> {

        /* renamed from: c, reason: collision with root package name */
        final int f57727c;

        f(int i4) {
            com.google.common.base.l0.e(i4 > 0, ProtectedSandApp.s("囹"));
            this.f57727c = i4 > 1073741824 ? -1 : c2.g(i4) - 1;
        }

        @Override // com.google.common.util.concurrent.c2
        public final L i(Object obj) {
            return j(k(obj));
        }

        @Override // com.google.common.util.concurrent.c2
        final int k(Object obj) {
            return c2.w(obj.hashCode()) & this.f57727c;
        }
    }

    /* compiled from: Striped.java */
    @d9.d
    static class g<L> extends f<L> {

        /* renamed from: d, reason: collision with root package name */
        final AtomicReferenceArray<a<? extends L>> f57728d;

        /* renamed from: e, reason: collision with root package name */
        final com.google.common.base.u0<L> f57729e;

        /* renamed from: f, reason: collision with root package name */
        final int f57730f;

        /* renamed from: g, reason: collision with root package name */
        final ReferenceQueue<L> f57731g;

        /* compiled from: Striped.java */
        private static final class a<L> extends WeakReference<L> {

            /* renamed from: a, reason: collision with root package name */
            final int f57732a;

            a(L l4, int i4, ReferenceQueue<L> referenceQueue) {
                super(l4, referenceQueue);
                this.f57732a = i4;
            }
        }

        g(int i4, com.google.common.base.u0<L> u0Var) {
            super(i4);
            this.f57731g = new ReferenceQueue<>();
            int i5 = this.f57727c;
            int i6 = i5 == -1 ? Integer.MAX_VALUE : i5 + 1;
            this.f57730f = i6;
            this.f57728d = new AtomicReferenceArray<>(i6);
            this.f57729e = u0Var;
        }

        private void x() {
            while (true) {
                Reference<? extends L> poll = this.f57731g.poll();
                if (poll == null) {
                    return;
                }
                a aVar = (a) poll;
                d2.a(this.f57728d, aVar.f57732a, aVar, null);
            }
        }

        @Override // com.google.common.util.concurrent.c2
        public L j(int i4) {
            if (this.f57730f != Integer.MAX_VALUE) {
                com.google.common.base.l0.C(i4, v());
            }
            a<? extends L> aVar = this.f57728d.get(i4);
            L l4 = aVar == null ? null : aVar.get();
            if (l4 != null) {
                return l4;
            }
            L l5 = this.f57729e.get();
            a aVar2 = new a(l5, i4, this.f57731g);
            while (!d2.a(this.f57728d, i4, aVar, aVar2)) {
                aVar = this.f57728d.get(i4);
                L l6 = aVar == null ? null : aVar.get();
                if (l6 != null) {
                    return l6;
                }
            }
            x();
            return l5;
        }

        @Override // com.google.common.util.concurrent.c2
        public int v() {
            return this.f57730f;
        }
    }

    /* compiled from: Striped.java */
    private static final class h extends k0 {

        /* renamed from: a, reason: collision with root package name */
        private final Condition f57733a;

        /* renamed from: b, reason: collision with root package name */
        private final j f57734b;

        h(Condition condition, j jVar) {
            this.f57733a = condition;
            this.f57734b = jVar;
        }

        @Override // com.google.common.util.concurrent.k0
        Condition a() {
            return this.f57733a;
        }
    }

    /* compiled from: Striped.java */
    private static final class i extends q0 {

        /* renamed from: b, reason: collision with root package name */
        private final Lock f57735b;

        /* renamed from: c, reason: collision with root package name */
        private final j f57736c;

        i(Lock lock, j jVar) {
            this.f57735b = lock;
            this.f57736c = jVar;
        }

        @Override // com.google.common.util.concurrent.q0
        Lock a() {
            return this.f57735b;
        }

        @Override // com.google.common.util.concurrent.q0, java.util.concurrent.locks.Lock
        public Condition newCondition() {
            return new h(this.f57735b.newCondition(), this.f57736c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Striped.java */
    static final class j implements ReadWriteLock {

        /* renamed from: b, reason: collision with root package name */
        private final ReadWriteLock f57737b = new ReentrantReadWriteLock();

        j() {
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock readLock() {
            return new i(this.f57737b.readLock(), this);
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock writeLock() {
            return new i(this.f57737b.writeLock(), this);
        }
    }

    private c2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int g(int i4) {
        return 1 << com.google.common.math.f.p(i4, RoundingMode.CEILING);
    }

    static <L> c2<L> h(int i4, com.google.common.base.u0<L> u0Var) {
        return new b(i4, u0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Lock l() {
        return new ReentrantLock(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Semaphore m(int i4) {
        return new Semaphore(i4, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Semaphore n(int i4) {
        return new e(i4, false);
    }

    private static <L> c2<L> o(int i4, com.google.common.base.u0<L> u0Var) {
        return i4 < 1024 ? new g(i4, u0Var) : new c(i4, u0Var);
    }

    public static c2<Lock> p(int i4) {
        return o(i4, new a2());
    }

    public static c2<ReadWriteLock> q(int i4) {
        return o(i4, new w1());
    }

    public static c2<Semaphore> r(int i4, final int i5) {
        return o(i4, new com.google.common.base.u0() { // from class: com.google.common.util.concurrent.z1
            @Override // com.google.common.base.u0
            public final Object get() {
                Semaphore m4;
                m4 = c2.m(i5);
                return m4;
            }
        });
    }

    public static c2<Lock> s(int i4) {
        return h(i4, new x1());
    }

    public static c2<ReadWriteLock> t(int i4) {
        return h(i4, new b2());
    }

    public static c2<Semaphore> u(int i4, final int i5) {
        return h(i4, new com.google.common.base.u0() { // from class: com.google.common.util.concurrent.y1
            @Override // com.google.common.base.u0
            public final Object get() {
                Semaphore n4;
                n4 = c2.n(i5);
                return n4;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int w(int i4) {
        int i5 = i4 ^ ((i4 >>> 20) ^ (i4 >>> 12));
        return (i5 >>> 4) ^ ((i5 >>> 7) ^ i5);
    }

    public Iterable<L> f(Iterable<? extends Object> iterable) {
        ArrayList r4 = l4.r(iterable);
        if (r4.isEmpty()) {
            return f3.H();
        }
        int[] iArr = new int[r4.size()];
        for (int i4 = 0; i4 < r4.size(); i4++) {
            iArr[i4] = k(r4.get(i4));
        }
        Arrays.sort(iArr);
        int i5 = iArr[0];
        r4.set(0, j(i5));
        for (int i6 = 1; i6 < r4.size(); i6++) {
            int i7 = iArr[i6];
            if (i7 == i5) {
                r4.set(i6, r4.get(i6 - 1));
            } else {
                r4.set(i6, j(i7));
                i5 = i7;
            }
        }
        return Collections.unmodifiableList(r4);
    }

    public abstract L i(Object obj);

    public abstract L j(int i4);

    abstract int k(Object obj);

    public abstract int v();

    c2(a aVar) {
    }
}
