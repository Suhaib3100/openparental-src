package org.apache.commons.io;

/* compiled from: ThreadMonitor.java */
/* loaded from: classes5.dex */
class p implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final Thread f32115o;

    /* renamed from: p, reason: collision with root package name */
    private final long f32116p;

    private p(Thread thread, long j5) {
        this.f32115o = thread;
        this.f32116p = j5;
    }

    public static Thread a(long j5) {
        return b(Thread.currentThread(), j5);
    }

    public static Thread b(Thread thread, long j5) {
        if (j5 <= 0) {
            return null;
        }
        Thread thread2 = new Thread(new p(thread, j5), p.class.getSimpleName());
        thread2.setDaemon(true);
        thread2.start();
        return thread2;
    }

    public static void c(Thread thread) {
        if (thread != null) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Thread.sleep(this.f32116p);
            this.f32115o.interrupt();
        } catch (InterruptedException unused) {
        }
    }
}
