package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Method;
import kotlin.jvm.internal.l0;

/* compiled from: ReflectJavaClass.kt */
/* loaded from: classes5.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final b f24378a = new b();

    /* renamed from: b, reason: collision with root package name */
    @d5.e
    private static a f24379b;

    /* compiled from: ReflectJavaClass.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @d5.e
        private final Method f24380a;

        /* renamed from: b, reason: collision with root package name */
        @d5.e
        private final Method f24381b;

        /* renamed from: c, reason: collision with root package name */
        @d5.e
        private final Method f24382c;

        /* renamed from: d, reason: collision with root package name */
        @d5.e
        private final Method f24383d;

        public a(@d5.e Method method, @d5.e Method method2, @d5.e Method method3, @d5.e Method method4) {
            this.f24380a = method;
            this.f24381b = method2;
            this.f24382c = method3;
            this.f24383d = method4;
        }

        @d5.e
        public final Method a() {
            return this.f24381b;
        }

        @d5.e
        public final Method b() {
            return this.f24383d;
        }

        @d5.e
        public final Method c() {
            return this.f24382c;
        }

        @d5.e
        public final Method d() {
            return this.f24380a;
        }
    }

    private b() {
    }

    private final a a() {
        try {
            return new a(Class.class.getMethod(ProtectedSandApp.s("䡺"), new Class[0]), Class.class.getMethod(ProtectedSandApp.s("䡻"), new Class[0]), Class.class.getMethod(ProtectedSandApp.s("䡼"), new Class[0]), Class.class.getMethod(ProtectedSandApp.s("䡽"), new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new a(null, null, null, null);
        }
    }

    private final a b() {
        a aVar = f24379b;
        if (aVar != null) {
            return aVar;
        }
        a a6 = a();
        f24379b = a6;
        return a6;
    }

    @d5.e
    public final Class<?>[] c(@d5.d Class<?> cls) {
        l0.p(cls, ProtectedSandApp.s("䡾"));
        Method a6 = b().a();
        if (a6 == null) {
            return null;
        }
        Object invoke = a6.invoke(cls, new Object[0]);
        l0.n(invoke, ProtectedSandApp.s("䡿"));
        return (Class[]) invoke;
    }

    @d5.e
    public final Object[] d(@d5.d Class<?> cls) {
        l0.p(cls, ProtectedSandApp.s("䢀"));
        Method b6 = b().b();
        if (b6 == null) {
            return null;
        }
        return (Object[]) b6.invoke(cls, new Object[0]);
    }

    @d5.e
    public final Boolean e(@d5.d Class<?> cls) {
        l0.p(cls, ProtectedSandApp.s("䢁"));
        Method c6 = b().c();
        if (c6 == null) {
            return null;
        }
        Object invoke = c6.invoke(cls, new Object[0]);
        l0.n(invoke, ProtectedSandApp.s("䢂"));
        return (Boolean) invoke;
    }

    @d5.e
    public final Boolean f(@d5.d Class<?> cls) {
        l0.p(cls, ProtectedSandApp.s("䢃"));
        Method d6 = b().d();
        if (d6 == null) {
            return null;
        }
        Object invoke = d6.invoke(cls, new Object[0]);
        l0.n(invoke, ProtectedSandApp.s("䢄"));
        return (Boolean) invoke;
    }
}
