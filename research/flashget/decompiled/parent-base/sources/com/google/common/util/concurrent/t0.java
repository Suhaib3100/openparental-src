package com.google.common.util.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.e5;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: FuturesGetChecked.java */
@b0
@d9.c
/* loaded from: classes6.dex */
final class t0 {

    /* renamed from: a, reason: collision with root package name */
    private static final e5<Constructor<?>> f57956a = e5.c0().u0(new a()).v0();

    /* compiled from: FuturesGetChecked.java */
    class a implements com.google.common.base.x<Constructor<?>, Boolean> {
        a() {
        }

        @Override // com.google.common.base.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean apply(Constructor<?> constructor) {
            return Boolean.valueOf(Arrays.asList(constructor.getParameterTypes()).contains(String.class));
        }
    }

    /* compiled from: FuturesGetChecked.java */
    @d9.d
    interface b {
        void validateClass(Class<? extends Exception> cls);
    }

    /* compiled from: FuturesGetChecked.java */
    @d9.d
    static class c {

        /* renamed from: a, reason: collision with root package name */
        static final b f57957a = t0.k();

        /* compiled from: FuturesGetChecked.java */
        enum a implements b {
            INSTANCE;

            private static final Set<WeakReference<Class<? extends Exception>>> validClasses = new CopyOnWriteArraySet();

            @Override // com.google.common.util.concurrent.t0.b
            public void validateClass(Class<? extends Exception> cls) {
                Iterator<WeakReference<Class<? extends Exception>>> it = validClasses.iterator();
                while (it.hasNext()) {
                    if (cls.equals(it.next().get())) {
                        return;
                    }
                }
                t0.b(cls);
                Set<WeakReference<Class<? extends Exception>>> set = validClasses;
                if (set.size() > 1000) {
                    set.clear();
                }
                set.add(new WeakReference<>(cls));
            }
        }

        c() {
        }

        static b a() {
            return t0.k();
        }
    }

    private t0() {
    }

    private static b a() {
        return c.f57957a;
    }

    @d9.d
    static void b(Class<? extends Exception> cls) {
        com.google.common.base.l0.u(g(cls), ProtectedSandApp.s("飼"), cls);
        com.google.common.base.l0.u(f(cls), ProtectedSandApp.s("館"), cls);
    }

    @d9.d
    @f9.a
    @j1
    static <V, X extends Exception> V c(b bVar, Future<V> future, Class<X> cls) throws Exception {
        bVar.validateClass(cls);
        try {
            return future.get();
        } catch (InterruptedException e4) {
            Thread.currentThread().interrupt();
            throw i(cls, e4);
        } catch (ExecutionException e5) {
            l(e5.getCause(), cls);
            throw new AssertionError();
        }
    }

    @f9.a
    @j1
    static <V, X extends Exception> V d(Future<V> future, Class<X> cls) throws Exception {
        return (V) c(c.f57957a, future, cls);
    }

    @f9.a
    @j1
    static <V, X extends Exception> V e(Future<V> future, Class<X> cls, long j4, TimeUnit timeUnit) throws Exception {
        c.f57957a.validateClass(cls);
        try {
            return future.get(j4, timeUnit);
        } catch (InterruptedException e4) {
            Thread.currentThread().interrupt();
            throw i(cls, e4);
        } catch (ExecutionException e5) {
            l(e5.getCause(), cls);
            throw new AssertionError();
        } catch (TimeoutException e6) {
            throw i(cls, e6);
        }
    }

    private static boolean f(Class<? extends Exception> cls) {
        try {
            i(cls, new Exception());
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @d9.d
    static boolean g(Class<? extends Exception> cls) {
        return !RuntimeException.class.isAssignableFrom(cls);
    }

    @zc.a
    private static <X> X h(Constructor<X> constructor, Throwable th) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        for (int i4 = 0; i4 < parameterTypes.length; i4++) {
            Class<?> cls = parameterTypes[i4];
            if (cls.equals(String.class)) {
                objArr[i4] = th.toString();
            } else {
                if (!cls.equals(Throwable.class)) {
                    return null;
                }
                objArr[i4] = th;
            }
        }
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static <X extends Exception> X i(Class<X> cls, Throwable th) {
        Iterator it = f57956a.w0(Arrays.asList(cls.getConstructors())).iterator();
        while (it.hasNext()) {
            X x4 = (X) h((Constructor) it.next(), th);
            if (x4 != null) {
                if (x4.getCause() == null) {
                    x4.initCause(th);
                }
                return x4;
            }
        }
        String valueOf = String.valueOf(cls);
        throw new IllegalArgumentException(com.google.common.base.h.a(valueOf.length() + 82, ProtectedSandApp.s("鶴"), valueOf, ProtectedSandApp.s("郞")), th);
    }

    private static <X extends Exception> List<Constructor<X>> j(List<Constructor<X>> list) {
        return (List<Constructor<X>>) f57956a.w0(list);
    }

    @d9.d
    static b k() {
        return c.a.INSTANCE;
    }

    private static <X extends Exception> void l(Throwable th, Class<X> cls) throws Exception {
        if (th instanceof Error) {
            throw new c0(th);
        }
        if (!(th instanceof RuntimeException)) {
            throw i(cls, th);
        }
        throw new UncheckedExecutionException(th);
    }
}
