package org.apache.commons.io.monitor;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadFactory;

/* compiled from: FileAlterationMonitor.java */
/* loaded from: classes5.dex */
public final class c implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final long f32041o;

    /* renamed from: p, reason: collision with root package name */
    private final List<d> f32042p;

    /* renamed from: q, reason: collision with root package name */
    private Thread f32043q;

    /* renamed from: r, reason: collision with root package name */
    private ThreadFactory f32044r;

    /* renamed from: s, reason: collision with root package name */
    private volatile boolean f32045s;

    public c() {
        this(10000L);
    }

    public void a(d dVar) {
        if (dVar != null) {
            this.f32042p.add(dVar);
        }
    }

    public long b() {
        return this.f32041o;
    }

    public Iterable<d> c() {
        return this.f32042p;
    }

    public void d(d dVar) {
        if (dVar != null) {
            while (this.f32042p.remove(dVar)) {
            }
        }
    }

    public synchronized void e(ThreadFactory threadFactory) {
        this.f32044r = threadFactory;
    }

    public synchronized void f() throws Exception {
        if (this.f32045s) {
            throw new IllegalStateException("Monitor is already running");
        }
        Iterator<d> it = this.f32042p.iterator();
        while (it.hasNext()) {
            it.next().l();
        }
        this.f32045s = true;
        ThreadFactory threadFactory = this.f32044r;
        if (threadFactory != null) {
            this.f32043q = threadFactory.newThread(this);
        } else {
            this.f32043q = new Thread(this);
        }
        this.f32043q.start();
    }

    public synchronized void g() throws Exception {
        h(this.f32041o);
    }

    public synchronized void h(long j5) throws Exception {
        if (!this.f32045s) {
            throw new IllegalStateException("Monitor is not running");
        }
        this.f32045s = false;
        try {
            this.f32043q.join(j5);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        Iterator<d> it = this.f32042p.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (this.f32045s) {
            Iterator<d> it = this.f32042p.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            if (!this.f32045s) {
                return;
            } else {
                try {
                    Thread.sleep(this.f32041o);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public c(long j5) {
        this.f32042p = new CopyOnWriteArrayList();
        this.f32043q = null;
        this.f32045s = false;
        this.f32041o = j5;
    }

    public c(long j5, d... dVarArr) {
        this(j5);
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                a(dVar);
            }
        }
    }
}
