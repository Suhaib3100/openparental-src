package org.mp4parser.aspectj.runtime.internal.cflowstack;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

/* compiled from: ThreadCounterImpl11.java */
/* loaded from: classes9.dex */
public class b implements org.mp4parser.aspectj.runtime.internal.cflowstack.a {

    /* renamed from: e, reason: collision with root package name */
    private static final int f87718e = 20000;

    /* renamed from: f, reason: collision with root package name */
    private static final int f87719f = 100;

    /* renamed from: b, reason: collision with root package name */
    private Thread f87721b;

    /* renamed from: c, reason: collision with root package name */
    private a f87722c;

    /* renamed from: a, reason: collision with root package name */
    private Hashtable f87720a = new Hashtable();

    /* renamed from: d, reason: collision with root package name */
    private int f87723d = 0;

    /* compiled from: ThreadCounterImpl11.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        protected int f87724a = 0;

        a() {
        }
    }

    private synchronized a e() {
        try {
            if (Thread.currentThread() != this.f87721b) {
                Thread currentThread = Thread.currentThread();
                this.f87721b = currentThread;
                a aVar = (a) this.f87720a.get(currentThread);
                this.f87722c = aVar;
                if (aVar == null) {
                    a aVar2 = new a();
                    this.f87722c = aVar2;
                    this.f87720a.put(this.f87721b, aVar2);
                }
                this.f87723d++;
                if (this.f87723d > Math.max(100, 20000 / Math.max(1, this.f87720a.size()))) {
                    ArrayList arrayList = new ArrayList();
                    Enumeration keys = this.f87720a.keys();
                    while (keys.hasMoreElements()) {
                        Thread thread = (Thread) keys.nextElement();
                        if (!thread.isAlive()) {
                            arrayList.add(thread);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        this.f87720a.remove((Thread) it.next());
                    }
                    this.f87723d = 0;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f87722c;
    }

    @Override // org.mp4parser.aspectj.runtime.internal.cflowstack.a
    public void a() {
        a e4 = e();
        e4.f87724a--;
    }

    @Override // org.mp4parser.aspectj.runtime.internal.cflowstack.a
    public void b() {
    }

    @Override // org.mp4parser.aspectj.runtime.internal.cflowstack.a
    public void c() {
        e().f87724a++;
    }

    @Override // org.mp4parser.aspectj.runtime.internal.cflowstack.a
    public boolean d() {
        return e().f87724a != 0;
    }
}
