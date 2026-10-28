package org.apache.commons.io;

/* compiled from: ThreadMonitor.java */
/* loaded from: classes4.dex */
class o implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final Thread f85583b;

    /* renamed from: c, reason: collision with root package name */
    private final long f85584c;

    private o(Thread thread, long j4) {
        this.f85583b = thread;
        this.f85584c = j4;
    }

    public static Thread a(long j4) {
        return b(Thread.currentThread(), j4);
    }

    public static Thread b(Thread thread, long j4) {
        if (j4 <= 0) {
            return null;
        }
        Thread thread2 = new Thread(new o(thread, j4), o.class.getSimpleName());
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
            Thread.sleep(this.f85584c);
            this.f85583b.interrupt();
        } catch (InterruptedException unused) {
        }
    }
}
