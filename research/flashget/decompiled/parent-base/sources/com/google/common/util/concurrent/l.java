package com.google.common.util.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.d6;
import com.google.common.util.concurrent.c;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import ma.f;

/* compiled from: AggregateFutureState.java */
@b0
@ma.f(f.a.FULL)
@d9.b(emulated = true)
/* loaded from: classes6.dex */
abstract class l<OutputT> extends c.j<OutputT> {

    /* renamed from: l, reason: collision with root package name */
    private static final b f57884l;

    /* renamed from: m, reason: collision with root package name */
    private static final Logger f57885m = Logger.getLogger(l.class.getName());

    /* renamed from: j, reason: collision with root package name */
    @zc.a
    private volatile Set<Throwable> f57886j = null;

    /* renamed from: k, reason: collision with root package name */
    private volatile int f57887k;

    /* compiled from: AggregateFutureState.java */
    private static abstract class b {
        private b() {
        }

        abstract void a(l<?> lVar, @zc.a Set<Throwable> set, Set<Throwable> set2);

        abstract int b(l<?> lVar);

        b(a aVar) {
        }
    }

    /* compiled from: AggregateFutureState.java */
    private static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<l<?>, Set<Throwable>> f57888a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicIntegerFieldUpdater<l<?>> f57889b;

        c(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            this.f57888a = atomicReferenceFieldUpdater;
            this.f57889b = atomicIntegerFieldUpdater;
        }

        @Override // com.google.common.util.concurrent.l.b
        void a(l<?> lVar, @zc.a Set<Throwable> set, Set<Throwable> set2) {
            androidx.concurrent.futures.c.a(this.f57888a, lVar, set, set2);
        }

        @Override // com.google.common.util.concurrent.l.b
        int b(l<?> lVar) {
            return this.f57889b.decrementAndGet(lVar);
        }
    }

    /* compiled from: AggregateFutureState.java */
    private static final class d extends b {
        private d() {
        }

        @Override // com.google.common.util.concurrent.l.b
        void a(l<?> lVar, @zc.a Set<Throwable> set, Set<Throwable> set2) {
            synchronized (lVar) {
                try {
                    if (((l) lVar).f57886j == set) {
                        ((l) lVar).f57886j = set2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.common.util.concurrent.l.b
        int b(l<?> lVar) {
            int H;
            synchronized (lVar) {
                H = l.H(lVar);
            }
            return H;
        }

        d(a aVar) {
        }
    }

    static {
        b dVar;
        try {
            dVar = new c(AtomicReferenceFieldUpdater.newUpdater(l.class, Set.class, ProtectedSandApp.s("藺")), AtomicIntegerFieldUpdater.newUpdater(l.class, ProtectedSandApp.s("隣")));
            th = null;
        } catch (Throwable th) {
            th = th;
            dVar = new d();
        }
        f57884l = dVar;
        if (th != null) {
            f57885m.log(Level.SEVERE, ProtectedSandApp.s("鱗"), th);
        }
    }

    l(int i4) {
        this.f57887k = i4;
    }

    static /* synthetic */ int H(l lVar) {
        int i4 = lVar.f57887k - 1;
        lVar.f57887k = i4;
        return i4;
    }

    abstract void I(Set<Throwable> set);

    final void L() {
        this.f57886j = null;
    }

    final int M() {
        return f57884l.b(this);
    }

    final Set<Throwable> N() {
        Set<Throwable> set = this.f57886j;
        if (set != null) {
            return set;
        }
        Set<Throwable> p4 = d6.p();
        I(p4);
        f57884l.a(this, null, p4);
        Set<Throwable> set2 = this.f57886j;
        Objects.requireNonNull(set2);
        return set2;
    }
}
