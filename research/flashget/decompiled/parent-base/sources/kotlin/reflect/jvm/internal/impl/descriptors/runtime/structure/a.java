package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Method;
import kotlin.jvm.internal.l0;

/* compiled from: ReflectJavaRecordComponent.kt */
/* loaded from: classes7.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final a f76223a = new a();

    /* renamed from: b, reason: collision with root package name */
    @fg.m
    private static C1083a f76224b;

    /* compiled from: ReflectJavaRecordComponent.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a$a, reason: collision with other inner class name */
    public static final class C1083a {

        /* renamed from: a, reason: collision with root package name */
        @fg.m
        private final Method f76225a;

        /* renamed from: b, reason: collision with root package name */
        @fg.m
        private final Method f76226b;

        public C1083a(@fg.m Method method, @fg.m Method method2) {
            this.f76225a = method;
            this.f76226b = method2;
        }

        @fg.m
        public final Method a() {
            return this.f76226b;
        }

        @fg.m
        public final Method b() {
            return this.f76225a;
        }
    }

    private a() {
    }

    private final C1083a a(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new C1083a(cls.getMethod(ProtectedSandApp.s("溆\u0001"), null), cls.getMethod(ProtectedSandApp.s("溇\u0001"), null));
        } catch (NoSuchMethodException unused) {
            return new C1083a(null, null);
        }
    }

    private final C1083a b(Object obj) {
        C1083a c1083a = f76224b;
        if (c1083a != null) {
            return c1083a;
        }
        C1083a a5 = a(obj);
        f76224b = a5;
        return a5;
    }

    @fg.m
    public final Method c(@fg.l Object obj) {
        l0.p(obj, ProtectedSandApp.s("溈\u0001"));
        Method a5 = b(obj).a();
        if (a5 == null) {
            return null;
        }
        Object invoke = a5.invoke(obj, null);
        l0.n(invoke, ProtectedSandApp.s("溉\u0001"));
        return (Method) invoke;
    }

    @fg.m
    public final Class<?> d(@fg.l Object obj) {
        l0.p(obj, ProtectedSandApp.s("溈\u0001"));
        Method b5 = b(obj).b();
        if (b5 == null) {
            return null;
        }
        Object invoke = b5.invoke(obj, null);
        l0.n(invoke, ProtectedSandApp.s("溊\u0001"));
        return (Class) invoke;
    }
}
