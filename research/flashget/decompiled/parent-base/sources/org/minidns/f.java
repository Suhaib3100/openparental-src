package org.minidns;

import java.io.IOException;
import java.lang.Exception;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.minidns.util.k;

/* compiled from: MiniDnsFuture.java */
/* loaded from: classes3.dex */
public abstract class f<V, E extends Exception> implements Future<V>, org.minidns.util.c<V, E> {

    /* renamed from: g, reason: collision with root package name */
    private static final ExecutorService f87334g;

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ boolean f87335h = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f87336b;

    /* renamed from: c, reason: collision with root package name */
    protected V f87337c;

    /* renamed from: d, reason: collision with root package name */
    protected E f87338d;

    /* renamed from: e, reason: collision with root package name */
    private k<V> f87339e;

    /* renamed from: f, reason: collision with root package name */
    private org.minidns.util.e<E> f87340f;

    /* compiled from: MiniDnsFuture.java */
    class a implements ThreadFactory {
        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setDaemon(true);
            thread.setName("MiniDnsFuture Thread");
            return thread;
        }
    }

    /* compiled from: MiniDnsFuture.java */
    class b implements RejectedExecutionHandler {
        b() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            runnable.run();
        }
    }

    /* compiled from: MiniDnsFuture.java */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.f87339e.onSuccess(f.this.f87337c);
        }
    }

    /* compiled from: MiniDnsFuture.java */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.f87340f.a(f.this.f87338d);
        }
    }

    /* compiled from: MiniDnsFuture.java */
    class e implements k<V> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Collection f87343a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f87344b;

        e(Collection collection, h hVar) {
            this.f87343a = collection;
            this.f87344b = hVar;
        }

        @Override // org.minidns.util.k
        public void onSuccess(V v4) {
            Iterator it = this.f87343a.iterator();
            while (it.hasNext()) {
                ((f) it.next()).cancel(true);
            }
            this.f87344b.p(v4);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [EI] */
    /* compiled from: MiniDnsFuture.java */
    /* renamed from: org.minidns.f$f, reason: collision with other inner class name */
    class C1356f<EI> implements org.minidns.util.e<EI> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f87345a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Collection f87346b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f87347c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ h f87348d;

        C1356f(List list, Collection collection, g gVar, h hVar) {
            this.f87345a = list;
            this.f87346b = collection;
            this.f87347c = gVar;
            this.f87348d = hVar;
        }

        /* JADX WARN: Incorrect types in method signature: (TEI;)V */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.minidns.util.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Exception exc) {
            this.f87345a.add(exc);
            if (this.f87345a.size() == this.f87346b.size()) {
                this.f87348d.o(this.f87347c.a(this.f87345a));
            }
        }
    }

    /* compiled from: MiniDnsFuture.java */
    public interface g<EI extends Exception, EO extends Exception> {
        EO a(List<EI> list);
    }

    /* compiled from: MiniDnsFuture.java */
    public static class h<V, E extends Exception> extends f<V, E> {
        public final synchronized void o(E e4) {
            if (isDone()) {
                return;
            }
            this.f87338d = e4;
            notifyAll();
            n();
        }

        public final synchronized void p(V v4) {
            if (isDone()) {
                return;
            }
            this.f87337c = v4;
            notifyAll();
            n();
        }
    }

    static {
        a aVar = new a();
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(128);
        b bVar = new b();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (availableProcessors <= 4) {
            availableProcessors = 2;
        }
        f87334g = new ThreadPoolExecutor(0, availableProcessors, 60L, TimeUnit.SECONDS, arrayBlockingQueue, aVar, bVar);
    }

    public static <V> f<V, IOException> f(Collection<f<V, IOException>> collection) {
        return g(collection, new org.minidns.e());
    }

    public static <V, EI extends Exception, EO extends Exception> f<V, EO> g(Collection<f<V, EI>> collection, g<EI, EO> gVar) {
        h hVar = new h();
        List synchronizedList = Collections.synchronizedList(new ArrayList(collection.size()));
        for (f<V, EI> fVar : collection) {
            fVar.b(new e(collection, hVar));
            fVar.a(new C1356f(synchronizedList, collection, gVar, hVar));
        }
        return hVar;
    }

    public static <V, E extends Exception> f<V, E> h(V v4) {
        h hVar = new h();
        hVar.p(v4);
        return hVar;
    }

    private V j() throws ExecutionException {
        V v4 = this.f87337c;
        if (v4 != null) {
            return v4;
        }
        if (this.f87338d == null) {
            throw new CancellationException();
        }
        throw new ExecutionException(this.f87338d);
    }

    @Override // org.minidns.util.c
    public org.minidns.util.c<V, E> a(org.minidns.util.e<E> eVar) {
        this.f87340f = eVar;
        n();
        return this;
    }

    @Override // org.minidns.util.c
    public org.minidns.util.c<V, E> b(k<V> kVar) {
        this.f87339e = kVar;
        n();
        return this;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean cancel(boolean z4) {
        if (isDone()) {
            return false;
        }
        this.f87336b = true;
        if (z4) {
            notifyAll();
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public final synchronized V get() throws InterruptedException, ExecutionException {
        while (this.f87337c == null && this.f87338d == null && !this.f87336b) {
            try {
                wait();
            } catch (Throwable th) {
                throw th;
            }
        }
        return j();
    }

    public final synchronized V i() throws Exception {
        V v4;
        while (true) {
            v4 = this.f87337c;
            if (v4 != null || this.f87338d != null || this.f87336b) {
                break;
            }
            try {
                wait();
            } catch (InterruptedException e4) {
                throw new RuntimeException(e4);
            }
        }
        E e5 = this.f87338d;
        if (e5 != null) {
            throw e5;
        }
        if (this.f87336b) {
            throw new CancellationException();
        }
        return v4;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.f87336b;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        boolean z4;
        if (!l()) {
            z4 = k();
        }
        return z4;
    }

    public final synchronized boolean k() {
        return this.f87338d != null;
    }

    public final synchronized boolean l() {
        return this.f87337c != null;
    }

    protected final synchronized void n() {
        try {
            if (this.f87336b) {
                return;
            }
            if (this.f87337c != null && this.f87339e != null) {
                f87334g.submit(new c());
            } else if (this.f87338d != null && this.f87340f != null) {
                f87334g.submit(new d());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.util.concurrent.Future
    public final synchronized V get(long j4, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        V v4;
        try {
            long currentTimeMillis = System.currentTimeMillis() + timeUnit.toMillis(j4);
            while (true) {
                v4 = this.f87337c;
                if (v4 == null || this.f87338d == null || this.f87336b) {
                    break;
                }
                long currentTimeMillis2 = currentTimeMillis - System.currentTimeMillis();
                if (currentTimeMillis2 > 0) {
                    wait(currentTimeMillis2);
                }
            }
            if (!this.f87336b) {
                if (v4 != null && this.f87338d != null) {
                } else {
                    throw new TimeoutException();
                }
            } else {
                throw new CancellationException();
            }
        } catch (Throwable th) {
            throw th;
        }
        return j();
    }
}
