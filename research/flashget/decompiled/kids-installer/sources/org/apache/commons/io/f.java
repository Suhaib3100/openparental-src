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
/* loaded from: classes5.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    ReferenceQueue<Object> f31857a = new ReferenceQueue<>();

    /* renamed from: b, reason: collision with root package name */
    final Collection<b> f31858b = Collections.synchronizedSet(new HashSet());

    /* renamed from: c, reason: collision with root package name */
    final List<String> f31859c = Collections.synchronizedList(new ArrayList());

    /* renamed from: d, reason: collision with root package name */
    volatile boolean f31860d = false;

    /* renamed from: e, reason: collision with root package name */
    Thread f31861e;

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
                if (f.this.f31860d && f.this.f31858b.size() <= 0) {
                    return;
                }
                try {
                    b bVar = (b) f.this.f31857a.remove();
                    f.this.f31858b.remove(bVar);
                    if (!bVar.a()) {
                        f.this.f31859c.add(bVar.b());
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
        private final String f31863a;

        /* renamed from: b, reason: collision with root package name */
        private final g f31864b;

        b(String str, g gVar, Object obj, ReferenceQueue<? super Object> referenceQueue) {
            super(obj, referenceQueue);
            this.f31863a = str;
            this.f31864b = gVar == null ? g.f31905b : gVar;
        }

        public boolean a() {
            return this.f31864b.b(new File(this.f31863a));
        }

        public String b() {
            return this.f31863a;
        }
    }

    private synchronized void a(String str, Object obj, g gVar) {
        if (this.f31860d) {
            throw new IllegalStateException("No new trackers can be added once exitWhenFinished() is called");
        }
        if (this.f31861e == null) {
            a aVar = new a();
            this.f31861e = aVar;
            aVar.start();
        }
        this.f31858b.add(new b(str, gVar, obj, this.f31857a));
    }

    public synchronized void b() {
        this.f31860d = true;
        Thread thread = this.f31861e;
        if (thread != null) {
            synchronized (thread) {
                this.f31861e.interrupt();
            }
        }
    }

    public List<String> c() {
        return this.f31859c;
    }

    public int d() {
        return this.f31858b.size();
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
