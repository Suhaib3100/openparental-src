package kotlin.reflect.full;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: KAnnotatedElements.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u000b\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u0007\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004R$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/full/a;", "", "Lkotlin/reflect/full/a$a;", "a", "Ljava/lang/Class;", "", "klass", "b", "Lkotlin/reflect/full/a$a;", "getCache", "()Lkotlin/reflect/full/a$a;", "setCache", "(Lkotlin/reflect/full/a$a;)V", "cache", "<init>", "()V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final a f23773a = new a();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private static C0261a cache;

    /* compiled from: KAnnotatedElements.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eR!\u0010\u0007\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/full/a$a;", "", "Ljava/lang/Class;", "", "a", "Ljava/lang/Class;", "()Ljava/lang/Class;", "repeatableClass", "Ljava/lang/reflect/Method;", "b", "Ljava/lang/reflect/Method;", "()Ljava/lang/reflect/Method;", "valueMethod", "<init>", "(Ljava/lang/Class;Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    /* renamed from: kotlin.reflect.full.a$a, reason: collision with other inner class name */
    public static final class C0261a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private final Class<? extends Annotation> repeatableClass;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private final Method valueMethod;

        public C0261a(@d5.e Class<? extends Annotation> cls, @d5.e Method method) {
            this.repeatableClass = cls;
            this.valueMethod = method;
        }

        @d5.e
        public final Class<? extends Annotation> a() {
            return this.repeatableClass;
        }

        @d5.e
        /* renamed from: b, reason: from getter */
        public final Method getValueMethod() {
            return this.valueMethod;
        }
    }

    private a() {
    }

    private final C0261a a() {
        try {
            l0.n(Repeatable.class, ProtectedSandApp.s("䋝"));
            return new C0261a(Repeatable.class, Repeatable.class.getMethod(ProtectedSandApp.s("䋞"), new Class[0]));
        } catch (ClassNotFoundException unused) {
            return new C0261a(null, null);
        }
    }

    @d5.e
    public final Class<? extends Annotation> b(@d5.d Class<? extends Annotation> klass) {
        Annotation annotation;
        Method valueMethod;
        l0.p(klass, ProtectedSandApp.s("䋟"));
        C0261a c0261a = cache;
        if (c0261a == null) {
            synchronized (this) {
                c0261a = cache;
                if (c0261a == null) {
                    c0261a = f23773a.a();
                    cache = c0261a;
                }
            }
        }
        Class a6 = c0261a.a();
        if (a6 == null || (annotation = klass.getAnnotation(a6)) == null || (valueMethod = c0261a.getValueMethod()) == null) {
            return null;
        }
        Object invoke = valueMethod.invoke(annotation, new Object[0]);
        l0.n(invoke, ProtectedSandApp.s("䋠"));
        return (Class) invoke;
    }
}
