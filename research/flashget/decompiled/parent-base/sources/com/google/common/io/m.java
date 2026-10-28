package com.google.common.io;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.w0;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: Closer.java */
@p
@d9.a
@d9.c
/* loaded from: classes6.dex */
public final class m implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    private static final c f57143e;

    /* renamed from: b, reason: collision with root package name */
    @d9.d
    final c f57144b;

    /* renamed from: c, reason: collision with root package name */
    private final Deque<Closeable> f57145c = new ArrayDeque(4);

    /* renamed from: d, reason: collision with root package name */
    @zc.a
    private Throwable f57146d;

    /* compiled from: Closer.java */
    @d9.d
    static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        static final a f57147a = new a();

        a() {
        }

        @Override // com.google.common.io.m.c
        public void a(Closeable closeable, Throwable th, Throwable th2) {
            Logger logger = l.f57142a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(closeable);
            logger.log(level, com.google.common.base.i.a(valueOf.length() + 42, ProtectedSandApp.s("\uf6b4"), valueOf), th2);
        }
    }

    /* compiled from: Closer.java */
    @d9.d
    static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final Method f57148a;

        private b(Method method) {
            this.f57148a = method;
        }

        @zc.a
        static b b() {
            try {
                return new b(Throwable.class.getMethod(ProtectedSandApp.s("\uf6b5"), Throwable.class));
            } catch (Throwable unused) {
                return null;
            }
        }

        @Override // com.google.common.io.m.c
        public void a(Closeable closeable, Throwable th, Throwable th2) {
            if (th == th2) {
                return;
            }
            try {
                this.f57148a.invoke(th, th2);
            } catch (Throwable unused) {
                a.f57147a.a(closeable, th, th2);
            }
        }
    }

    /* compiled from: Closer.java */
    @d9.d
    interface c {
        void a(Closeable closeable, Throwable th, Throwable th2);
    }

    static {
        c b5 = b.b();
        if (b5 == null) {
            b5 = a.f57147a;
        }
        f57143e = b5;
    }

    @d9.d
    m(c cVar) {
        cVar.getClass();
        this.f57144b = cVar;
    }

    public static m a() {
        return new m(f57143e);
    }

    @c0
    @f9.a
    public <C extends Closeable> C b(@c0 C c5) {
        if (c5 != null) {
            this.f57145c.addFirst(c5);
        }
        return c5;
    }

    public RuntimeException c(Throwable th) throws IOException {
        th.getClass();
        this.f57146d = th;
        w0.t(th, IOException.class);
        throw new RuntimeException(th);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Throwable th = this.f57146d;
        while (!this.f57145c.isEmpty()) {
            Closeable removeFirst = this.f57145c.removeFirst();
            try {
                removeFirst.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    this.f57144b.a(removeFirst, th, th2);
                }
            }
        }
        if (this.f57146d != null || th == null) {
            return;
        }
        w0.t(th, IOException.class);
        throw new AssertionError(th);
    }

    public <X extends Exception> RuntimeException d(Throwable th, Class<X> cls) throws IOException, Exception {
        th.getClass();
        this.f57146d = th;
        w0.t(th, IOException.class);
        w0.t(th, cls);
        throw new RuntimeException(th);
    }

    public <X1 extends Exception, X2 extends Exception> RuntimeException e(Throwable th, Class<X1> cls, Class<X2> cls2) throws IOException, Exception, Exception {
        th.getClass();
        this.f57146d = th;
        w0.t(th, IOException.class);
        w0.u(th, cls, cls2);
        throw new RuntimeException(th);
    }
}
