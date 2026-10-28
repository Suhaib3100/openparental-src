package androidx.work.impl.utils;

import androidx.annotation.m1;
import androidx.annotation.o0;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: SerialExecutor.java */
/* loaded from: classes3.dex */
public class n implements Executor {

    /* renamed from: c, reason: collision with root package name */
    private final Executor f36499c;

    /* renamed from: e, reason: collision with root package name */
    private volatile Runnable f36501e;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque<a> f36498b = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private final Object f36500d = new Object();

    /* compiled from: SerialExecutor.java */
    static class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final n f36502b;

        /* renamed from: c, reason: collision with root package name */
        final Runnable f36503c;

        a(@o0 n serialExecutor, @o0 Runnable runnable) {
            this.f36502b = serialExecutor;
            this.f36503c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f36503c.run();
            } finally {
                this.f36502b.c();
            }
        }
    }

    public n(@o0 Executor executor) {
        this.f36499c = executor;
    }

    @o0
    @m1
    public Executor a() {
        return this.f36499c;
    }

    public boolean b() {
        boolean z4;
        synchronized (this.f36500d) {
            z4 = !this.f36498b.isEmpty();
        }
        return z4;
    }

    void c() {
        synchronized (this.f36500d) {
            try {
                a poll = this.f36498b.poll();
                this.f36501e = poll;
                if (poll != null) {
                    this.f36499c.execute(this.f36501e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(@o0 Runnable command) {
        synchronized (this.f36500d) {
            try {
                this.f36498b.add(new a(this, command));
                if (this.f36501e == null) {
                    c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
