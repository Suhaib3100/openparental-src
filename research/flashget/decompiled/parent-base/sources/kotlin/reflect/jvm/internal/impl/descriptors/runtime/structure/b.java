package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Method;
import kotlin.jvm.internal.l0;

/* compiled from: ReflectJavaClass.kt */
/* loaded from: classes7.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final b f76228a = new b();

    /* renamed from: b, reason: collision with root package name */
    @fg.m
    private static a f76229b;

    /* compiled from: ReflectJavaClass.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @fg.m
        private final Method f76230a;

        /* renamed from: b, reason: collision with root package name */
        @fg.m
        private final Method f76231b;

        /* renamed from: c, reason: collision with root package name */
        @fg.m
        private final Method f76232c;

        /* renamed from: d, reason: collision with root package name */
        @fg.m
        private final Method f76233d;

        public a(@fg.m Method method, @fg.m Method method2, @fg.m Method method3, @fg.m Method method4) {
            this.f76230a = method;
            this.f76231b = method2;
            this.f76232c = method3;
            this.f76233d = method4;
        }

        @fg.m
        public final Method a() {
            return this.f76231b;
        }

        @fg.m
        public final Method b() {
            return this.f76233d;
        }

        @fg.m
        public final Method c() {
            return this.f76232c;
        }

        @fg.m
        public final Method d() {
            return this.f76230a;
        }
    }

    private b() {
    }

    private final a a() {
        try {
            return new a(Class.class.getMethod(ProtectedSandApp.s("源\u0001"), null), Class.class.getMethod(ProtectedSandApp.s("溑\u0001"), null), Class.class.getMethod(ProtectedSandApp.s("溒\u0001"), null), Class.class.getMethod(ProtectedSandApp.s("溓\u0001"), null));
        } catch (NoSuchMethodException unused) {
            return new a(null, null, null, null);
        }
    }

    private final a b() {
        a aVar = f76229b;
        if (aVar != null) {
            return aVar;
        }
        a a5 = a();
        f76229b = a5;
        return a5;
    }

    @fg.m
    public final Class<?>[] c(@fg.l Class<?> cls) {
        l0.p(cls, ProtectedSandApp.s("溔\u0001"));
        Method a5 = b().a();
        if (a5 == null) {
            return null;
        }
        Object invoke = a5.invoke(cls, null);
        l0.n(invoke, ProtectedSandApp.s("溕\u0001"));
        return (Class[]) invoke;
    }

    @fg.m
    public final Object[] d(@fg.l Class<?> cls) {
        l0.p(cls, ProtectedSandApp.s("溔\u0001"));
        Method b5 = b().b();
        if (b5 == null) {
            return null;
        }
        return (Object[]) b5.invoke(cls, null);
    }

    @fg.m
    public final Boolean e(@fg.l Class<?> cls) {
        l0.p(cls, ProtectedSandApp.s("溔\u0001"));
        Method c5 = b().c();
        if (c5 == null) {
            return null;
        }
        Object invoke = c5.invoke(cls, null);
        l0.n(invoke, ProtectedSandApp.s("準\u0001"));
        return (Boolean) invoke;
    }

    @fg.m
    public final Boolean f(@fg.l Class<?> cls) {
        l0.p(cls, ProtectedSandApp.s("溔\u0001"));
        Method d5 = b().d();
        if (d5 == null) {
            return null;
        }
        Object invoke = d5.invoke(cls, null);
        l0.n(invoke, ProtectedSandApp.s("準\u0001"));
        return (Boolean) invoke;
    }
}
