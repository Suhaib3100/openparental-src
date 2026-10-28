package org.apache.commons.lang3.concurrent;

import java.lang.Thread;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.lang3.k1;

/* compiled from: BasicThreadFactory.java */
/* loaded from: classes6.dex */
public class e implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    private final AtomicLong f85885b;

    /* renamed from: c, reason: collision with root package name */
    private final ThreadFactory f85886c;

    /* renamed from: d, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f85887d;

    /* renamed from: e, reason: collision with root package name */
    private final String f85888e;

    /* renamed from: f, reason: collision with root package name */
    private final Integer f85889f;

    /* renamed from: g, reason: collision with root package name */
    private final Boolean f85890g;

    /* compiled from: BasicThreadFactory.java */
    public static class b implements org.apache.commons.lang3.builder.a<e> {

        /* renamed from: b, reason: collision with root package name */
        private ThreadFactory f85891b;

        /* renamed from: c, reason: collision with root package name */
        private Thread.UncaughtExceptionHandler f85892c;

        /* renamed from: d, reason: collision with root package name */
        private String f85893d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f85894e;

        /* renamed from: f, reason: collision with root package name */
        private Boolean f85895f;

        @Override // org.apache.commons.lang3.builder.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public e a() {
            e eVar = new e(this);
            k();
            return eVar;
        }

        public b h(boolean z4) {
            this.f85895f = Boolean.valueOf(z4);
            return this;
        }

        public b i(String str) {
            k1.b0(str, "Naming pattern must not be null!", new Object[0]);
            this.f85893d = str;
            return this;
        }

        public b j(int i4) {
            this.f85894e = Integer.valueOf(i4);
            return this;
        }

        public void k() {
            this.f85891b = null;
            this.f85892c = null;
            this.f85893d = null;
            this.f85894e = null;
            this.f85895f = null;
        }

        public b l(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            k1.b0(uncaughtExceptionHandler, "Uncaught exception handler must not be null!", new Object[0]);
            this.f85892c = uncaughtExceptionHandler;
            return this;
        }

        public b m(ThreadFactory threadFactory) {
            k1.b0(threadFactory, "Wrapped ThreadFactory must not be null!", new Object[0]);
            this.f85891b = threadFactory;
            return this;
        }
    }

    private void g(Thread thread) {
        if (this.f85888e != null) {
            thread.setName(String.format(this.f85888e, Long.valueOf(this.f85885b.incrementAndGet())));
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f85887d;
        if (uncaughtExceptionHandler != null) {
            thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
        Integer num = this.f85889f;
        if (num != null) {
            thread.setPriority(num.intValue());
        }
        Boolean bool = this.f85890g;
        if (bool != null) {
            thread.setDaemon(bool.booleanValue());
        }
    }

    public final Boolean a() {
        return this.f85890g;
    }

    public final String b() {
        return this.f85888e;
    }

    public final Integer c() {
        return this.f85889f;
    }

    public long d() {
        return this.f85885b.get();
    }

    public final Thread.UncaughtExceptionHandler e() {
        return this.f85887d;
    }

    public final ThreadFactory f() {
        return this.f85886c;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f85886c.newThread(runnable);
        g(newThread);
        return newThread;
    }

    private e(b bVar) {
        if (bVar.f85891b == null) {
            this.f85886c = Executors.defaultThreadFactory();
        } else {
            this.f85886c = bVar.f85891b;
        }
        this.f85888e = bVar.f85893d;
        this.f85889f = bVar.f85894e;
        this.f85890g = bVar.f85895f;
        this.f85887d = bVar.f85892c;
        this.f85885b = new AtomicLong();
    }
}
