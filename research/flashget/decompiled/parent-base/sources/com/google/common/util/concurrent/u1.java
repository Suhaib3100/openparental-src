package com.google.common.util.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.b5;
import com.google.common.util.concurrent.u1;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: SimpleTimeLimiter.java */
@b0
@d9.a
@d9.c
/* loaded from: classes6.dex */
public final class u1 implements f2 {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f57962a;

    /* compiled from: SimpleTimeLimiter.java */
    class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f57963a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f57964b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ TimeUnit f57965c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Set f57966d;

        a(Object obj, long j4, TimeUnit timeUnit, Set set) {
            this.f57963a = obj;
            this.f57964b = j4;
            this.f57965c = timeUnit;
            this.f57966d = set;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Object b(Method method, Object obj, Object[] objArr) throws Exception {
            try {
                return method.invoke(obj, objArr);
            } catch (InvocationTargetException e4) {
                throw u1.n(e4, false);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        @zc.a
        public Object invoke(Object obj, final Method method, @zc.a final Object[] objArr) throws Throwable {
            final Object obj2 = this.f57963a;
            return u1.this.h(new Callable() { // from class: com.google.common.util.concurrent.t1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Object b5;
                    b5 = u1.a.b(method, obj2, objArr);
                    return b5;
                }
            }, this.f57964b, this.f57965c, this.f57966d.contains(method));
        }
    }

    private u1(ExecutorService executorService) {
        executorService.getClass();
        this.f57962a = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> T h(Callable<T> callable, long j4, TimeUnit timeUnit, boolean z4) throws Exception {
        callable.getClass();
        timeUnit.getClass();
        i(j4);
        Future<T> submit = this.f57962a.submit(callable);
        try {
            if (!z4) {
                return (T) j2.g(submit, j4, timeUnit);
            }
            try {
                return submit.get(j4, timeUnit);
            } catch (InterruptedException e4) {
                submit.cancel(true);
                throw e4;
            }
        } catch (ExecutionException e5) {
            throw n(e5, true);
        } catch (TimeoutException e6) {
            submit.cancel(true);
            throw new UncheckedTimeoutException(e6);
        }
    }

    private static void i(long j4) {
        com.google.common.base.l0.p(j4 > 0, ProtectedSandApp.s("隷"), j4);
    }

    public static u1 j(ExecutorService executorService) {
        return new u1(executorService);
    }

    private static boolean k(Method method) {
        for (Class<?> cls : method.getExceptionTypes()) {
            if (cls == InterruptedException.class) {
                return true;
            }
        }
        return false;
    }

    private static Set<Method> l(Class<?> cls) {
        HashSet hashSet = new HashSet();
        for (Method method : cls.getMethods()) {
            if (k(method)) {
                hashSet.add(method);
            }
        }
        return hashSet;
    }

    private static <T> T m(Class<T> cls, InvocationHandler invocationHandler) {
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Exception n(Exception exc, boolean z4) throws Exception {
        Throwable cause = exc.getCause();
        if (cause == null) {
            throw exc;
        }
        if (z4) {
            cause.setStackTrace((StackTraceElement[]) b5.f(cause.getStackTrace(), exc.getStackTrace(), StackTraceElement.class));
        }
        if (cause instanceof Exception) {
            throw ((Exception) cause);
        }
        if (cause instanceof Error) {
            throw ((Error) cause);
        }
        throw exc;
    }

    private void o(Throwable th) throws ExecutionException {
        if (th instanceof Error) {
            throw new c0(th);
        }
        if (!(th instanceof RuntimeException)) {
            throw new ExecutionException(th);
        }
        throw new UncheckedExecutionException(th);
    }

    private void p(Throwable th) {
        if (!(th instanceof Error)) {
            throw new UncheckedExecutionException(th);
        }
        throw new c0(th);
    }

    @Override // com.google.common.util.concurrent.f2
    public void a(Runnable runnable, long j4, TimeUnit timeUnit) throws TimeoutException, InterruptedException {
        runnable.getClass();
        timeUnit.getClass();
        i(j4);
        Future<?> submit = this.f57962a.submit(runnable);
        try {
            submit.get(j4, timeUnit);
        } catch (InterruptedException e4) {
            e = e4;
            submit.cancel(true);
            throw e;
        } catch (ExecutionException e5) {
            p(e5.getCause());
            throw new AssertionError();
        } catch (TimeoutException e6) {
            e = e6;
            submit.cancel(true);
            throw e;
        }
    }

    @Override // com.google.common.util.concurrent.f2
    public <T> T b(T t4, Class<T> cls, long j4, TimeUnit timeUnit) {
        t4.getClass();
        cls.getClass();
        timeUnit.getClass();
        i(j4);
        com.google.common.base.l0.e(cls.isInterface(), ProtectedSandApp.s("侮"));
        return (T) m(cls, new a(t4, j4, timeUnit, l(cls)));
    }

    @Override // com.google.common.util.concurrent.f2
    public void c(Runnable runnable, long j4, TimeUnit timeUnit) throws TimeoutException {
        runnable.getClass();
        timeUnit.getClass();
        i(j4);
        Future<?> submit = this.f57962a.submit(runnable);
        try {
            j2.g(submit, j4, timeUnit);
        } catch (ExecutionException e4) {
            p(e4.getCause());
            throw new AssertionError();
        } catch (TimeoutException e5) {
            submit.cancel(true);
            throw e5;
        }
    }

    @Override // com.google.common.util.concurrent.f2
    @f9.a
    public <T> T d(Callable<T> callable, long j4, TimeUnit timeUnit) throws TimeoutException, ExecutionException {
        callable.getClass();
        timeUnit.getClass();
        i(j4);
        Future<T> submit = this.f57962a.submit(callable);
        try {
            return (T) j2.g(submit, j4, timeUnit);
        } catch (ExecutionException e4) {
            o(e4.getCause());
            throw new AssertionError();
        } catch (TimeoutException e5) {
            submit.cancel(true);
            throw e5;
        }
    }

    @Override // com.google.common.util.concurrent.f2
    @f9.a
    public <T> T e(Callable<T> callable, long j4, TimeUnit timeUnit) throws TimeoutException, InterruptedException, ExecutionException {
        callable.getClass();
        timeUnit.getClass();
        i(j4);
        Future<T> submit = this.f57962a.submit(callable);
        try {
            return submit.get(j4, timeUnit);
        } catch (InterruptedException e4) {
            e = e4;
            submit.cancel(true);
            throw e;
        } catch (ExecutionException e5) {
            o(e5.getCause());
            throw new AssertionError();
        } catch (TimeoutException e6) {
            e = e6;
            submit.cancel(true);
            throw e;
        }
    }
}
