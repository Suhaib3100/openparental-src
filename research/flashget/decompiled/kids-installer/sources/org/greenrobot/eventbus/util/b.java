package org.greenrobot.eventbus.util;

import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.logging.Level;

/* compiled from: AsyncExecutor.java */
/* loaded from: classes5.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f32224a;

    /* renamed from: b, reason: collision with root package name */
    private final Constructor<?> f32225b;

    /* renamed from: c, reason: collision with root package name */
    private final org.greenrobot.eventbus.c f32226c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f32227d;

    /* compiled from: AsyncExecutor.java */
    /* renamed from: org.greenrobot.eventbus.util.b$b, reason: collision with other inner class name */
    public static class C0496b {

        /* renamed from: a, reason: collision with root package name */
        private Executor f32228a;

        /* renamed from: b, reason: collision with root package name */
        private Class<?> f32229b;

        /* renamed from: c, reason: collision with root package name */
        private org.greenrobot.eventbus.c f32230c;

        private C0496b() {
        }

        public b a() {
            return b(null);
        }

        public b b(Object obj) {
            if (this.f32230c == null) {
                this.f32230c = org.greenrobot.eventbus.c.f();
            }
            if (this.f32228a == null) {
                this.f32228a = Executors.newCachedThreadPool();
            }
            if (this.f32229b == null) {
                this.f32229b = e.class;
            }
            return new b(this.f32228a, this.f32230c, this.f32229b, obj);
        }

        public C0496b c(org.greenrobot.eventbus.c cVar) {
            this.f32230c = cVar;
            return this;
        }

        public C0496b d(Class<?> cls) {
            this.f32229b = cls;
            return this;
        }

        public C0496b e(Executor executor) {
            this.f32228a = executor;
            return this;
        }

        C0496b(a aVar) {
        }
    }

    /* compiled from: AsyncExecutor.java */
    public interface c {
        void run() throws Exception;
    }

    public static C0496b b() {
        return new C0496b(null);
    }

    public static b c() {
        return new C0496b(null).b(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(c cVar) {
        try {
            cVar.run();
        } catch (Exception e6) {
            try {
                Object newInstance = this.f32225b.newInstance(e6);
                if (newInstance instanceof d) {
                    ((d) newInstance).a(this.f32227d);
                }
                this.f32226c.q(newInstance);
            } catch (Exception e7) {
                this.f32226c.h().b(Level.SEVERE, "Original exception:", e6);
                throw new RuntimeException("Could not create failure event", e7);
            }
        }
    }

    public void d(final c cVar) {
        this.f32224a.execute(new Runnable() { // from class: org.greenrobot.eventbus.util.a
            @Override // java.lang.Runnable
            public final void run() {
                b.this.e(cVar);
            }
        });
    }

    private b(Executor executor, org.greenrobot.eventbus.c cVar, Class<?> cls, Object obj) {
        this.f32224a = executor;
        this.f32226c = cVar;
        this.f32227d = obj;
        try {
            this.f32225b = cls.getConstructor(Throwable.class);
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException("Failure event class must have a constructor with one parameter of type Throwable", e6);
        }
    }
}
