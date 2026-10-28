package org.apache.commons.lang3.concurrent;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.k1;

/* compiled from: ConcurrentUtils.java */
/* loaded from: classes6.dex */
public class j {

    /* compiled from: ConcurrentUtils.java */
    static final class a<T> implements Future<T> {

        /* renamed from: b, reason: collision with root package name */
        private final T f85897b;

        a(T t4) {
            this.f85897b = t4;
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z4) {
            return false;
        }

        @Override // java.util.concurrent.Future
        public T get() {
            return this.f85897b;
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return false;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public T get(long j4, TimeUnit timeUnit) {
            return this.f85897b;
        }
    }

    private j() {
    }

    static Throwable a(Throwable th) {
        k1.B((th == null || (th instanceof RuntimeException) || (th instanceof Error)) ? false : true, "Not a checked exception: " + th, new Object[0]);
        return th;
    }

    public static <T> Future<T> b(T t4) {
        return new a(t4);
    }

    public static <K, V> V c(ConcurrentMap<K, V> concurrentMap, K k4, i<V> iVar) throws ConcurrentException {
        if (concurrentMap == null || iVar == null) {
            return null;
        }
        V v4 = concurrentMap.get(k4);
        return v4 == null ? (V) k(concurrentMap, k4, iVar.get()) : v4;
    }

    public static <K, V> V d(ConcurrentMap<K, V> concurrentMap, K k4, i<V> iVar) {
        try {
            return (V) c(concurrentMap, k4, iVar);
        } catch (ConcurrentException e4) {
            throw new ConcurrentRuntimeException(e4.getCause());
        }
    }

    public static ConcurrentException e(ExecutionException executionException) {
        if (executionException == null || executionException.getCause() == null) {
            return null;
        }
        l(executionException);
        return new ConcurrentException(executionException.getMessage(), executionException.getCause());
    }

    public static ConcurrentRuntimeException f(ExecutionException executionException) {
        if (executionException == null || executionException.getCause() == null) {
            return null;
        }
        l(executionException);
        return new ConcurrentRuntimeException(executionException.getMessage(), executionException.getCause());
    }

    public static void g(ExecutionException executionException) throws ConcurrentException {
        ConcurrentException e4 = e(executionException);
        if (e4 != null) {
            throw e4;
        }
    }

    public static void h(ExecutionException executionException) {
        ConcurrentRuntimeException f4 = f(executionException);
        if (f4 != null) {
            throw f4;
        }
    }

    public static <T> T i(i<T> iVar) throws ConcurrentException {
        if (iVar != null) {
            return iVar.get();
        }
        return null;
    }

    public static <T> T j(i<T> iVar) {
        try {
            return (T) i(iVar);
        } catch (ConcurrentException e4) {
            throw new ConcurrentRuntimeException(e4.getCause());
        }
    }

    public static <K, V> V k(ConcurrentMap<K, V> concurrentMap, K k4, V v4) {
        if (concurrentMap == null) {
            return null;
        }
        V putIfAbsent = concurrentMap.putIfAbsent(k4, v4);
        return putIfAbsent != null ? putIfAbsent : v4;
    }

    private static void l(ExecutionException executionException) {
        if (executionException.getCause() instanceof RuntimeException) {
            throw ((RuntimeException) executionException.getCause());
        }
        if (executionException.getCause() instanceof Error) {
            throw ((Error) executionException.getCause());
        }
    }
}
