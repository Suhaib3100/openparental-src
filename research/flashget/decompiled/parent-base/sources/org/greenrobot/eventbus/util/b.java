package org.greenrobot.eventbus.util;

import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.logging.Level;

/* compiled from: AsyncExecutor.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f86897a;

    /* renamed from: b, reason: collision with root package name */
    private final Constructor<?> f86898b;

    /* renamed from: c, reason: collision with root package name */
    private final org.greenrobot.eventbus.c f86899c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f86900d;

    /* compiled from: AsyncExecutor.java */
    /* renamed from: org.greenrobot.eventbus.util.b$b, reason: collision with other inner class name */
    public static class C1345b {

        /* renamed from: a, reason: collision with root package name */
        private Executor f86901a;

        /* renamed from: b, reason: collision with root package name */
        private Class<?> f86902b;

        /* renamed from: c, reason: collision with root package name */
        private org.greenrobot.eventbus.c f86903c;

        private C1345b() {
        }

        public b a() {
            return b(null);
        }

        public b b(Object obj) {
            if (this.f86903c == null) {
                this.f86903c = org.greenrobot.eventbus.c.f();
            }
            if (this.f86901a == null) {
                this.f86901a = Executors.newCachedThreadPool();
            }
            if (this.f86902b == null) {
                this.f86902b = e.class;
            }
            return new b(this.f86901a, this.f86903c, this.f86902b, obj);
        }

        public C1345b c(org.greenrobot.eventbus.c cVar) {
            this.f86903c = cVar;
            return this;
        }

        public C1345b d(Class<?> cls) {
            this.f86902b = cls;
            return this;
        }

        public C1345b e(Executor executor) {
            this.f86901a = executor;
            return this;
        }

        C1345b(a aVar) {
        }
    }

    /* compiled from: AsyncExecutor.java */
    public interface c {
        void run() throws Exception;
    }

    public static C1345b b() {
        return new C1345b();
    }

    public static b c() {
        return new C1345b().b(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(c cVar) {
        try {
            cVar.run();
        } catch (Exception e4) {
            try {
                Object newInstance = this.f86898b.newInstance(e4);
                if (newInstance instanceof d) {
                    ((d) newInstance).b(this.f86900d);
                }
                this.f86899c.q(newInstance);
            } catch (Exception e5) {
                this.f86899c.h().a(Level.SEVERE, "Original exception:", e4);
                throw new RuntimeException("Could not create failure event", e5);
            }
        }
    }

    public void d(final c cVar) {
        this.f86897a.execute(new Runnable() { // from class: org.greenrobot.eventbus.util.a
            @Override // java.lang.Runnable
            public final void run() {
                b.this.e(cVar);
            }
        });
    }

    private b(Executor executor, org.greenrobot.eventbus.c cVar, Class<?> cls, Object obj) {
        this.f86897a = executor;
        this.f86899c = cVar;
        this.f86900d = obj;
        try {
            this.f86898b = cls.getConstructor(Throwable.class);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("Failure event class must have a constructor with one parameter of type Throwable", e4);
        }
    }
}
