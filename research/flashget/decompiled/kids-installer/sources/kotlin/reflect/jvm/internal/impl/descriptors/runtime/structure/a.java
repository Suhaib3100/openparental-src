package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Method;
import kotlin.jvm.internal.l0;

/* compiled from: ReflectJavaRecordComponent.kt */
/* loaded from: classes5.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final a f24373a = new a();

    /* renamed from: b, reason: collision with root package name */
    @d5.e
    private static C0279a f24374b;

    /* compiled from: ReflectJavaRecordComponent.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a$a, reason: collision with other inner class name */
    public static final class C0279a {

        /* renamed from: a, reason: collision with root package name */
        @d5.e
        private final Method f24375a;

        /* renamed from: b, reason: collision with root package name */
        @d5.e
        private final Method f24376b;

        public C0279a(@d5.e Method method, @d5.e Method method2) {
            this.f24375a = method;
            this.f24376b = method2;
        }

        @d5.e
        public final Method a() {
            return this.f24376b;
        }

        @d5.e
        public final Method b() {
            return this.f24375a;
        }
    }

    private a() {
    }

    private final C0279a a(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new C0279a(cls.getMethod(ProtectedSandApp.s("䡴"), new Class[0]), cls.getMethod(ProtectedSandApp.s("䡵"), new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new C0279a(null, null);
        }
    }

    private final C0279a b(Object obj) {
        C0279a c0279a = f24374b;
        if (c0279a != null) {
            return c0279a;
        }
        C0279a a6 = a(obj);
        f24374b = a6;
        return a6;
    }

    @d5.e
    public final Method c(@d5.d Object obj) {
        l0.p(obj, ProtectedSandApp.s("䡶"));
        Method a6 = b(obj).a();
        if (a6 == null) {
            return null;
        }
        Object invoke = a6.invoke(obj, new Object[0]);
        l0.n(invoke, ProtectedSandApp.s("䡷"));
        return (Method) invoke;
    }

    @d5.e
    public final Class<?> d(@d5.d Object obj) {
        l0.p(obj, ProtectedSandApp.s("䡸"));
        Method b6 = b(obj).b();
        if (b6 == null) {
            return null;
        }
        Object invoke = b6.invoke(obj, new Object[0]);
        l0.n(invoke, ProtectedSandApp.s("䡹"));
        return (Class) invoke;
    }
}
