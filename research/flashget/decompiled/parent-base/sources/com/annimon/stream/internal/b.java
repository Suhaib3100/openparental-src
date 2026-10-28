package com.annimon.stream.internal;

import java.io.Closeable;

/* compiled from: Compose.java */
/* loaded from: classes3.dex */
public final class b {

    /* compiled from: Compose.java */
    static class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f41490b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Runnable f41491c;

        a(Runnable runnable, Runnable runnable2) {
            this.f41490b = runnable;
            this.f41491c = runnable2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f41490b.run();
                this.f41491c.run();
            } catch (Throwable th) {
                try {
                    this.f41491c.run();
                } catch (Throwable unused) {
                }
                if (!(th instanceof RuntimeException)) {
                    throw ((Error) th);
                }
                throw ((RuntimeException) th);
            }
        }
    }

    /* compiled from: Compose.java */
    /* renamed from: com.annimon.stream.internal.b$b, reason: collision with other inner class name */
    static class RunnableC0728b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Closeable f41492b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Closeable f41493c;

        RunnableC0728b(Closeable closeable, Closeable closeable2) {
            this.f41492b = closeable;
            this.f41493c = closeable2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f41492b.close();
                try {
                    this.f41493c.close();
                } catch (Throwable th) {
                    if (th instanceof RuntimeException) {
                        throw ((RuntimeException) th);
                    }
                    if (!(th instanceof Error)) {
                        throw new RuntimeException(th);
                    }
                    throw ((Error) th);
                }
            } catch (Throwable th2) {
                try {
                    this.f41493c.close();
                } catch (Throwable unused) {
                }
                if (!(th2 instanceof RuntimeException)) {
                    throw ((Error) th2);
                }
                throw ((RuntimeException) th2);
            }
        }
    }

    private b() {
    }

    public static Runnable a(Closeable closeable, Closeable closeable2) {
        return new RunnableC0728b(closeable, closeable2);
    }

    public static Runnable b(Runnable runnable, Runnable runnable2) {
        return new a(runnable, runnable2);
    }
}
