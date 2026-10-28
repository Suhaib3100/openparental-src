package com.google.common.eventbus;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/* compiled from: Subscriber.java */
@e
/* loaded from: classes6.dex */
class j {

    /* renamed from: a, reason: collision with root package name */
    @ma.i
    private f f56730a;

    /* renamed from: b, reason: collision with root package name */
    @d9.d
    final Object f56731b;

    /* renamed from: c, reason: collision with root package name */
    private final Method f56732c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f56733d;

    /* compiled from: Subscriber.java */
    @d9.d
    static final class b extends j {
        private b(f fVar, Object obj, Method method) {
            super(fVar, obj, method);
        }

        @Override // com.google.common.eventbus.j
        void e(Object obj) throws InvocationTargetException {
            synchronized (this) {
                super.e(obj);
            }
        }

        b(f fVar, Object obj, Method method, a aVar) {
            super(fVar, obj, method);
        }
    }

    private k b(Object obj) {
        return new k(this.f56730a, obj, this.f56731b, this.f56732c);
    }

    static j c(f fVar, Object obj, Method method) {
        return f(method) ? new j(fVar, obj, method) : new b(fVar, obj, method, null);
    }

    private static boolean f(Method method) {
        return method.getAnnotation(com.google.common.eventbus.a.class) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(Object obj) {
        try {
            e(obj);
        } catch (InvocationTargetException e4) {
            this.f56730a.b(e4.getCause(), b(obj));
        }
    }

    final void d(final Object obj) {
        this.f56733d.execute(new Runnable() { // from class: com.google.common.eventbus.i
            @Override // java.lang.Runnable
            public final void run() {
                j.this.g(obj);
            }
        });
    }

    @d9.d
    void e(Object obj) throws InvocationTargetException {
        try {
            Method method = this.f56732c;
            Object obj2 = this.f56731b;
            obj.getClass();
            method.invoke(obj2, obj);
        } catch (IllegalAccessException e4) {
            String valueOf = String.valueOf(obj);
            throw new Error(com.google.common.base.i.a(valueOf.length() + 28, ProtectedSandApp.s("\uf59f"), valueOf), e4);
        } catch (IllegalArgumentException e5) {
            String valueOf2 = String.valueOf(obj);
            throw new Error(com.google.common.base.i.a(valueOf2.length() + 33, ProtectedSandApp.s("\uf5a0"), valueOf2), e5);
        } catch (InvocationTargetException e6) {
            if (!(e6.getCause() instanceof Error)) {
                throw e6;
            }
            throw ((Error) e6.getCause());
        }
    }

    public final boolean equals(@zc.a Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f56731b == jVar.f56731b && this.f56732c.equals(jVar.f56732c);
    }

    public final int hashCode() {
        return System.identityHashCode(this.f56731b) + ((this.f56732c.hashCode() + 31) * 31);
    }

    private j(f fVar, Object obj, Method method) {
        this.f56730a = fVar;
        obj.getClass();
        this.f56731b = obj;
        this.f56732c = method;
        method.setAccessible(true);
        this.f56733d = fVar.a();
    }
}
