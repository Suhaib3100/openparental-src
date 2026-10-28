package org.apache.commons.lang3.concurrent.locks;

import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.StampedLock;
import java.util.function.Supplier;
import xe.m0;
import xe.n1;

/* compiled from: LockingVisitors.java */
/* loaded from: classes6.dex */
public class a {

    /* compiled from: LockingVisitors.java */
    /* renamed from: org.apache.commons.lang3.concurrent.locks.a$a, reason: collision with other inner class name */
    public static class C1337a<O, L> {

        /* renamed from: a, reason: collision with root package name */
        private final L f85908a;

        /* renamed from: b, reason: collision with root package name */
        private final O f85909b;

        /* renamed from: c, reason: collision with root package name */
        private final Supplier<Lock> f85910c;

        /* renamed from: d, reason: collision with root package name */
        private final Supplier<Lock> f85911d;

        protected C1337a(O o4, L l4, Supplier<Lock> supplier, Supplier<Lock> supplier2) {
            Objects.requireNonNull(o4, "object");
            this.f85909b = o4;
            Objects.requireNonNull(l4, "lock");
            this.f85908a = l4;
            Objects.requireNonNull(supplier, "readLockSupplier");
            this.f85910c = supplier;
            Objects.requireNonNull(supplier2, "writeLockSupplier");
            this.f85911d = supplier2;
        }

        public void a(m0<O, ?> m0Var) {
            g(this.f85910c, m0Var);
        }

        public void b(m0<O, ?> m0Var) {
            g(this.f85911d, m0Var);
        }

        public <T> T c(n1<O, T, ?> n1Var) {
            return (T) h(this.f85910c, n1Var);
        }

        public <T> T d(n1<O, T, ?> n1Var) {
            return (T) h(this.f85911d, n1Var);
        }

        public L e() {
            return this.f85908a;
        }

        public O f() {
            return this.f85909b;
        }

        protected void g(Supplier<Lock> supplier, m0<O, ?> m0Var) {
            supplier.get().lock();
            try {
                m0Var.accept(this.f85909b);
            } finally {
            }
        }

        protected <T> T h(Supplier<Lock> supplier, n1<O, T, ?> n1Var) {
            supplier.get().lock();
            try {
                return n1Var.apply(this.f85909b);
            } finally {
            }
        }
    }

    /* compiled from: LockingVisitors.java */
    public static class b<O> extends C1337a<O, ReadWriteLock> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        protected b(O o4, final ReadWriteLock readWriteLock) {
            super(o4, readWriteLock, new Supplier() { // from class: org.apache.commons.lang3.concurrent.locks.b
                @Override // java.util.function.Supplier
                public final Object get() {
                    return readWriteLock.readLock();
                }
            }, new Supplier() { // from class: org.apache.commons.lang3.concurrent.locks.c
                @Override // java.util.function.Supplier
                public final Object get() {
                    return readWriteLock.writeLock();
                }
            });
            readWriteLock.getClass();
        }
    }

    /* compiled from: LockingVisitors.java */
    public static class c<O> extends C1337a<O, StampedLock> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        protected c(O o4, final StampedLock stampedLock) {
            super(o4, stampedLock, new Supplier() { // from class: org.apache.commons.lang3.concurrent.locks.d
                @Override // java.util.function.Supplier
                public final Object get() {
                    return stampedLock.asReadLock();
                }
            }, new Supplier() { // from class: org.apache.commons.lang3.concurrent.locks.e
                @Override // java.util.function.Supplier
                public final Object get() {
                    return stampedLock.asWriteLock();
                }
            });
            stampedLock.getClass();
        }
    }

    public static <O> b<O> a(O o4) {
        return new b<>(o4, new ReentrantReadWriteLock());
    }

    public static <O> c<O> b(O o4) {
        return new c<>(o4, new StampedLock());
    }
}
