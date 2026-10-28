package retrofit2;

import android.os.Handler;
import android.os.Looper;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import retrofit2.c;
import retrofit2.f;

/* compiled from: Platform.java */
/* loaded from: classes5.dex */
class s {

    /* renamed from: b, reason: collision with root package name */
    private static final s f33090b = f();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f33091a;

    /* compiled from: Platform.java */
    /* loaded from: classes6.dex */
    static final class a extends s {

        /* compiled from: Platform.java */
        /* renamed from: retrofit2.s$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static class ExecutorC0509a implements Executor {

            /* renamed from: o, reason: collision with root package name */
            private final Handler f33092o = new Handler(Looper.getMainLooper());

            ExecutorC0509a() {
            }

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.f33092o.post(runnable);
            }
        }

        a() {
            super(true);
        }

        @Override // retrofit2.s
        public Executor c() {
            return new ExecutorC0509a();
        }
    }

    s(boolean z5) {
        this.f33091a = z5;
    }

    private static s f() {
        try {
            Class.forName(ProtectedSandApp.s("楆"));
            return new a();
        } catch (ClassNotFoundException unused) {
            return new s(true);
        }
    }

    static s g() {
        return f33090b;
    }

    List<? extends c.a> a(@Nullable Executor executor) {
        g gVar = new g(executor);
        return this.f33091a ? Arrays.asList(e.f32982a, gVar) : Collections.singletonList(gVar);
    }

    int b() {
        return this.f33091a ? 2 : 1;
    }

    @Nullable
    Executor c() {
        return null;
    }

    List<? extends f.a> d() {
        return this.f33091a ? Collections.singletonList(n.f33043a) : Collections.emptyList();
    }

    int e() {
        return this.f33091a ? 1 : 0;
    }

    @Nullable
    Object h(Method method, Class<?> cls, Object obj, @Nullable Object... objArr) throws Throwable {
        MethodHandle unreflectSpecial;
        MethodHandle bindTo;
        Object invokeWithArguments;
        Constructor declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
        declaredConstructor.setAccessible(true);
        unreflectSpecial = ((MethodHandles.Lookup) declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls);
        bindTo = unreflectSpecial.bindTo(obj);
        invokeWithArguments = bindTo.invokeWithArguments(objArr);
        return invokeWithArguments;
    }

    boolean i(Method method) {
        return this.f33091a && method.isDefault();
    }
}
