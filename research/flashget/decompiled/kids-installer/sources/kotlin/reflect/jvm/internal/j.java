package kotlin.reflect.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d;

/* compiled from: RuntimeTypeMapper.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0003\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H&\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/jvm/internal/j;", "", "", "a", "<init>", "()V", "b", "c", "d", "e", "Lkotlin/reflect/jvm/internal/j$a;", "Lkotlin/reflect/jvm/internal/j$b;", "Lkotlin/reflect/jvm/internal/j$c;", "Lkotlin/reflect/jvm/internal/j$d;", "Lkotlin/reflect/jvm/internal/j$e;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public abstract class j {

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001b\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R%\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0012"}, d2 = {"Lkotlin/reflect/jvm/internal/j$a;", "Lkotlin/reflect/jvm/internal/j;", "", "a", "Ljava/lang/Class;", "Ljava/lang/Class;", "getJClass", "()Ljava/lang/Class;", "jClass", "", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "b", "Ljava/util/List;", "()Ljava/util/List;", "methods", "<init>", "(Ljava/lang/Class;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    public static final class a extends j {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final Class<?> jClass;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final List<Method> methods;

        /* compiled from: RuntimeTypeMapper.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/lang/reflect/Method;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: kotlin.reflect.jvm.internal.j$a$a, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        static final class C0398a extends Lambda implements q3.l<Method, CharSequence> {

            /* renamed from: p, reason: collision with root package name */
            public static final C0398a f26687p = new C0398a();

            C0398a() {
                super(1);
            }

            @Override // q3.l
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence N(Method method) {
                Class<?> returnType = method.getReturnType();
                kotlin.jvm.internal.l0.o(returnType, ProtectedSandApp.s("觨"));
                return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.b(returnType);
            }
        }

        /* compiled from: Comparisons.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g$a", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class b<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t5, T t6) {
                int l5;
                l5 = kotlin.comparisons.g.l(((Method) t5).getName(), ((Method) t6).getName());
                return l5;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@d5.d Class<?> cls) {
            super(null);
            List<Method> Lv;
            kotlin.jvm.internal.l0.p(cls, ProtectedSandApp.s("夳"));
            this.jClass = cls;
            Method[] declaredMethods = cls.getDeclaredMethods();
            kotlin.jvm.internal.l0.o(declaredMethods, ProtectedSandApp.s("头"));
            Lv = kotlin.collections.t.Lv(declaredMethods, new b());
            this.methods = Lv;
        }

        @Override // kotlin.reflect.jvm.internal.j
        @d5.d
        /* renamed from: a */
        public String get_signature() {
            String m32;
            m32 = kotlin.collections.j0.m3(this.methods, "", ProtectedSandApp.s("夵"), ProtectedSandApp.s("夶"), 0, null, C0398a.f26687p, 24, null);
            return m32;
        }

        @d5.d
        public final List<Method> b() {
            return this.methods;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001b\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/j$b;", "Lkotlin/reflect/jvm/internal/j;", "", "a", "Ljava/lang/reflect/Constructor;", "Ljava/lang/reflect/Constructor;", "b", "()Ljava/lang/reflect/Constructor;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    public static final class b extends j {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final Constructor<?> constructor;

        /* compiled from: RuntimeTypeMapper.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Class;", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/lang/Class;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
        /* loaded from: classes6.dex */
        static final class a extends Lambda implements q3.l<Class<?>, CharSequence> {

            /* renamed from: p, reason: collision with root package name */
            public static final a f26689p = new a();

            a() {
                super(1);
            }

            @Override // q3.l
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence N(Class<?> cls) {
                kotlin.jvm.internal.l0.o(cls, ProtectedSandApp.s("觩"));
                return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.b(cls);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@d5.d Constructor<?> constructor) {
            super(null);
            kotlin.jvm.internal.l0.p(constructor, ProtectedSandApp.s("夷"));
            this.constructor = constructor;
        }

        @Override // kotlin.reflect.jvm.internal.j
        @d5.d
        /* renamed from: a */
        public String get_signature() {
            String lh;
            Class<?>[] parameterTypes = this.constructor.getParameterTypes();
            kotlin.jvm.internal.l0.o(parameterTypes, ProtectedSandApp.s("夸"));
            lh = kotlin.collections.t.lh(parameterTypes, "", ProtectedSandApp.s("夹"), ProtectedSandApp.s("夺"), 0, null, a.f26689p, 24, null);
            return lh;
        }

        @d5.d
        public final Constructor<?> b() {
            return this.constructor;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/j$c;", "Lkotlin/reflect/jvm/internal/j;", "", "a", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Method;", "b", "()Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    public static final class c extends j {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final Method method;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@d5.d Method method) {
            super(null);
            kotlin.jvm.internal.l0.p(method, ProtectedSandApp.s("夻"));
            this.method = method;
        }

        @Override // kotlin.reflect.jvm.internal.j
        @d5.d
        /* renamed from: a */
        public String get_signature() {
            String b6;
            b6 = k0.b(this.method);
            return b6;
        }

        @d5.d
        /* renamed from: b, reason: from getter */
        public final Method getMethod() {
            return this.method;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0011\u0010\r\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\f¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/j$d;", "Lkotlin/reflect/jvm/internal/j;", "", "a", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/d$b;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/d$b;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;", "signature", "b", "Ljava/lang/String;", "_signature", "()Ljava/lang/String;", "constructorDesc", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    public static final class d extends j {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final d.b signature;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final String _signature;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@d5.d d.b bVar) {
            super(null);
            kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("夼"));
            this.signature = bVar;
            this._signature = bVar.a();
        }

        @Override // kotlin.reflect.jvm.internal.j
        @d5.d
        /* renamed from: a, reason: from getter */
        public String get_signature() {
            return this._signature;
        }

        @d5.d
        public final String b() {
            return this.signature.b();
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0011\u0010\u000e\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\r¨\u0006\u0012"}, d2 = {"Lkotlin/reflect/jvm/internal/j$e;", "Lkotlin/reflect/jvm/internal/j;", "", "a", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/d$b;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/d$b;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;", "signature", "b", "Ljava/lang/String;", "_signature", "c", "()Ljava/lang/String;", "methodName", "methodDesc", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    public static final class e extends j {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final d.b signature;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final String _signature;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@d5.d d.b bVar) {
            super(null);
            kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("夽"));
            this.signature = bVar;
            this._signature = bVar.a();
        }

        @Override // kotlin.reflect.jvm.internal.j
        @d5.d
        /* renamed from: a, reason: from getter */
        public String get_signature() {
            return this._signature;
        }

        @d5.d
        public final String b() {
            return this.signature.b();
        }

        @d5.d
        public final String c() {
            return this.signature.c();
        }
    }

    public /* synthetic */ j(kotlin.jvm.internal.w wVar) {
        this();
    }

    @d5.d
    /* renamed from: a */
    public abstract String get_signature();

    private j() {
    }
}
