package kotlin.reflect.full;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: KAnnotatedElements.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\t\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\u00072\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lkotlin/reflect/full/a;", "", "<init>", "()V", "Lkotlin/reflect/full/a$a;", "a", "()Lkotlin/reflect/full/a$a;", "Ljava/lang/Class;", "", "klass", "b", "(Ljava/lang/Class;)Ljava/lang/Class;", "Lkotlin/reflect/full/a$a;", "getCache", "setCache", "(Lkotlin/reflect/full/a$a;)V", "cache", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nKAnnotatedElements.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KAnnotatedElements.kt\nkotlin/reflect/full/Java8RepeatableContainerLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
/* loaded from: classes7.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final a f75522a = new a();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @m
    private static C1065a cache;

    /* compiled from: KAnnotatedElements.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR!\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/full/a$a;", "", "Ljava/lang/Class;", "", "repeatableClass", "Ljava/lang/reflect/Method;", "valueMethod", "<init>", "(Ljava/lang/Class;Ljava/lang/reflect/Method;)V", "a", "Ljava/lang/Class;", "()Ljava/lang/Class;", "b", "Ljava/lang/reflect/Method;", "()Ljava/lang/reflect/Method;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.reflect.full.a$a, reason: collision with other inner class name */
    public static final class C1065a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @m
        private final Class<? extends Annotation> repeatableClass;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @m
        private final Method valueMethod;

        public C1065a(@m Class<? extends Annotation> cls, @m Method method) {
            this.repeatableClass = cls;
            this.valueMethod = method;
        }

        @m
        public final Class<? extends Annotation> a() {
            return this.repeatableClass;
        }

        @m
        /* renamed from: b, reason: from getter */
        public final Method getValueMethod() {
            return this.valueMethod;
        }
    }

    private a() {
    }

    private final C1065a a() {
        try {
            l0.n(Repeatable.class, ProtectedSandApp.s("昙\u0001"));
            return new C1065a(Repeatable.class, Repeatable.class.getMethod(ProtectedSandApp.s("昚\u0001"), null));
        } catch (ClassNotFoundException unused) {
            return new C1065a(null, null);
        }
    }

    @m
    public final Class<? extends Annotation> b(@l Class<? extends Annotation> klass) {
        Annotation annotation;
        Method valueMethod;
        l0.p(klass, ProtectedSandApp.s("昛\u0001"));
        C1065a c1065a = cache;
        if (c1065a == null) {
            synchronized (this) {
                c1065a = cache;
                if (c1065a == null) {
                    c1065a = f75522a.a();
                    cache = c1065a;
                }
            }
        }
        Class a5 = c1065a.a();
        if (a5 == null || (annotation = klass.getAnnotation(a5)) == null || (valueMethod = c1065a.getValueMethod()) == null) {
            return null;
        }
        Object invoke = valueMethod.invoke(annotation, null);
        l0.n(invoke, ProtectedSandApp.s("昙\u0001"));
        return (Class) invoke;
    }
}
