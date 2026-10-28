package org.apache.commons.io;

import java.io.File;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* compiled from: FileCleaningTracker.java */
/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    ReferenceQueue<Object> f85357a = new ReferenceQueue<>();

    /* renamed from: b, reason: collision with root package name */
    final Collection<b> f85358b = Collections.synchronizedSet(new HashSet());

    /* renamed from: c, reason: collision with root package name */
    final List<String> f85359c = Collections.synchronizedList(new ArrayList());

    /* renamed from: d, reason: collision with root package name */
    volatile boolean f85360d = false;

    /* renamed from: e, reason: collision with root package name */
    Thread f85361e;

    /* compiled from: FileCleaningTracker.java */
    private final class a extends Thread {
        a() {
            super("File Reaper");
            setPriority(10);
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                if (f.this.f85360d && f.this.f85358b.size() <= 0) {
                    return;
                }
                try {
                    b bVar = (b) f.this.f85357a.remove();
                    f.this.f85358b.remove(bVar);
                    if (!bVar.a()) {
                        f.this.f85359c.add(bVar.b());
                    }
                    bVar.clear();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* compiled from: FileCleaningTracker.java */
    private static final class b extends PhantomReference<Object> {

        /* renamed from: a, reason: collision with root package name */
        private final String f85363a;

        /* renamed from: b, reason: collision with root package name */
        private final g f85364b;

        b(String str, g gVar, Object obj, ReferenceQueue<? super Object> referenceQueue) {
            super(obj, referenceQueue);
            this.f85363a = str;
            this.f85364b = gVar == null ? g.f85405b : gVar;
        }

        public boolean a() {
            return this.f85364b.b(new File(this.f85363a));
        }

        public String b() {
            return this.f85363a;
        }
    }

    private synchronized void a(String str, Object obj, g gVar) {
        try {
            if (this.f85360d) {
                throw new IllegalStateException("No new trackers can be added once exitWhenFinished() is called");
            }
            if (this.f85361e == null) {
                a aVar = new a();
                this.f85361e = aVar;
                aVar.start();
            }
            this.f85358b.add(new b(str, gVar, obj, this.f85357a));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b() {
        this.f85360d = true;
        Thread thread = this.f85361e;
        if (thread != null) {
            synchronized (thread) {
                this.f85361e.interrupt();
            }
        }
    }

    public List<String> c() {
        return this.f85359c;
    }

    public int d() {
        return this.f85358b.size();
    }

    public void e(File file, Object obj) {
        f(file, obj, null);
    }

    public void f(File file, Object obj, g gVar) {
        if (file == null) {
            throw new NullPointerException("The file must not be null");
        }
        a(file.getPath(), obj, gVar);
    }

    public void g(String str, Object obj) {
        h(str, obj, null);
    }

    public void h(String str, Object obj, g gVar) {
        if (str == null) {
            throw new NullPointerException("The path must not be null");
        }
        a(str, obj, gVar);
    }
}
