package retrofit2;

import android.os.Handler;
import android.os.Looper;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import retrofit2.c;
import retrofit2.f;

/* compiled from: Platform.java */
/* loaded from: classes9.dex */
class u {

    /* renamed from: b, reason: collision with root package name */
    private static final u f90006b = f();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f90007a;

    /* compiled from: Platform.java */
    static final class a extends u {

        /* compiled from: Platform.java */
        /* renamed from: retrofit2.u$a$a, reason: collision with other inner class name */
        static class ExecutorC1391a implements Executor {

            /* renamed from: b, reason: collision with root package name */
            private final Handler f90008b = new Handler(Looper.getMainLooper());

            ExecutorC1391a() {
            }

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.f90008b.post(runnable);
            }
        }

        a() {
            super(true);
        }

        @Override // retrofit2.u
        public Executor c() {
            return new ExecutorC1391a();
        }
    }

    u(boolean z4) {
        this.f90007a = z4;
    }

    private static u f() {
        try {
            Class.forName(ProtectedSandApp.s("ꘃ\u0001"));
            return new a(true);
        } catch (ClassNotFoundException unused) {
            return new u(true);
        }
    }

    static u g() {
        return f90006b;
    }

    List<? extends c.a> a(@zc.h Executor executor) {
        g gVar = new g(executor);
        return this.f90007a ? Arrays.asList(e.f89898a, gVar) : Collections.singletonList(gVar);
    }

    int b() {
        return this.f90007a ? 2 : 1;
    }

    @zc.h
    Executor c() {
        return null;
    }

    List<? extends f.a> d() {
        return this.f90007a ? Collections.singletonList(n.f89959a) : Collections.emptyList();
    }

    int e() {
        return this.f90007a ? 1 : 0;
    }

    @zc.h
    Object h(Method method, Class<?> cls, Object obj, @zc.h Object... objArr) throws Throwable {
        MethodHandle unreflectSpecial;
        MethodHandle bindTo;
        Object invokeWithArguments;
        Constructor declaredConstructor = p.a().getDeclaredConstructor(Class.class, Integer.TYPE);
        declaredConstructor.setAccessible(true);
        unreflectSpecial = q.a(declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls);
        bindTo = unreflectSpecial.bindTo(obj);
        invokeWithArguments = bindTo.invokeWithArguments(objArr);
        return invokeWithArguments;
    }

    boolean i(Method method) {
        return this.f90007a && method.isDefault();
    }
}
