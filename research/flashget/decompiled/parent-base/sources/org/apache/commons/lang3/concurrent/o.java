package org.apache.commons.lang3.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* compiled from: Memoizer.java */
/* loaded from: classes6.dex */
public class o<I, O> implements h<I, O> {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentMap<I, Future<O>> f85920a;

    /* renamed from: b, reason: collision with root package name */
    private final h<I, O> f85921b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f85922c;

    public o(h<I, O> hVar) {
        this(hVar, false);
    }

    private /* synthetic */ Object c(Object obj) throws Exception {
        return this.f85921b.a(obj);
    }

    private RuntimeException d(Throwable th) {
        if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        throw new IllegalStateException("Unchecked exception", th);
    }

    @Override // org.apache.commons.lang3.concurrent.h
    public O a(final I i4) throws InterruptedException {
        FutureTask futureTask;
        while (true) {
            Future<O> future = this.f85920a.get(i4);
            if (future == null && (future = this.f85920a.putIfAbsent(i4, (futureTask = new FutureTask(new Callable() { // from class: org.apache.commons.lang3.concurrent.n
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Object a5;
                    a5 = o.this.f85921b.a(i4);
                    return a5;
                }
            })))) == null) {
                futureTask.run();
                future = futureTask;
            }
            try {
                continue;
                return future.get();
            } catch (CancellationException unused) {
                this.f85920a.remove(i4, future);
            } catch (ExecutionException e4) {
                if (this.f85922c) {
                    this.f85920a.remove(i4, future);
                }
                throw d(e4.getCause());
            }
        }
    }

    public o(h<I, O> hVar, boolean z4) {
        this.f85920a = new ConcurrentHashMap();
        this.f85921b = hVar;
        this.f85922c = z4;
    }
}
