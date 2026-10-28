package org.apache.commons.io.monitor;

import androidx.work.i0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadFactory;

/* compiled from: FileAlterationMonitor.java */
/* loaded from: classes4.dex */
public final class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final long f85562b;

    /* renamed from: c, reason: collision with root package name */
    private final List<d> f85563c;

    /* renamed from: d, reason: collision with root package name */
    private Thread f85564d;

    /* renamed from: e, reason: collision with root package name */
    private ThreadFactory f85565e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f85566f;

    public c() {
        this(i0.f35991f);
    }

    public void a(d dVar) {
        if (dVar != null) {
            this.f85563c.add(dVar);
        }
    }

    public long b() {
        return this.f85562b;
    }

    public Iterable<d> c() {
        return this.f85563c;
    }

    public void d(d dVar) {
        if (dVar != null) {
            while (this.f85563c.remove(dVar)) {
            }
        }
    }

    public synchronized void e(ThreadFactory threadFactory) {
        this.f85565e = threadFactory;
    }

    public synchronized void f() throws Exception {
        try {
            if (this.f85566f) {
                throw new IllegalStateException("Monitor is already running");
            }
            Iterator<d> it = this.f85563c.iterator();
            while (it.hasNext()) {
                it.next().l();
            }
            this.f85566f = true;
            ThreadFactory threadFactory = this.f85565e;
            if (threadFactory != null) {
                this.f85564d = threadFactory.newThread(this);
            } else {
                this.f85564d = new Thread(this);
            }
            this.f85564d.start();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void g() throws Exception {
        h(this.f85562b);
    }

    public synchronized void h(long j4) throws Exception {
        if (!this.f85566f) {
            throw new IllegalStateException("Monitor is not running");
        }
        this.f85566f = false;
        try {
            this.f85564d.join(j4);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        Iterator<d> it = this.f85563c.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (this.f85566f) {
            Iterator<d> it = this.f85563c.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            if (!this.f85566f) {
                return;
            } else {
                try {
                    Thread.sleep(this.f85562b);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public c(long j4) {
        this.f85563c = new CopyOnWriteArrayList();
        this.f85564d = null;
        this.f85566f = false;
        this.f85562b = j4;
    }

    public c(long j4, d... dVarArr) {
        this(j4);
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                a(dVar);
            }
        }
    }
}
