package kotlin.reflect.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d;

/* compiled from: RuntimeTypeMapper.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0005\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/l;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "b", "c", "d", "e", "Lkotlin/reflect/jvm/internal/l$a;", "Lkotlin/reflect/jvm/internal/l$b;", "Lkotlin/reflect/jvm/internal/l$c;", "Lkotlin/reflect/jvm/internal/l$d;", "Lkotlin/reflect/jvm/internal/l$e;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class l {

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000bR%\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, d2 = {"Lkotlin/reflect/jvm/internal/l$a;", "Lkotlin/reflect/jvm/internal/l;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "", "a", "()Ljava/lang/String;", "Ljava/lang/Class;", "getJClass", "()Ljava/lang/Class;", "", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "b", "Ljava/util/List;", "()Ljava/util/List;", "methods", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nRuntimeTypeMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RuntimeTypeMapper.kt\nkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,302:1\n6442#2:303\n*S KotlinDebug\n*F\n+ 1 RuntimeTypeMapper.kt\nkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor\n*L\n88#1:303\n*E\n"})
    public static final class a extends l {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Class<?> jClass;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final List<Method> methods;

        /* compiled from: RuntimeTypeMapper.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/lang/reflect/Method;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: kotlin.reflect.jvm.internal.l$a$a, reason: collision with other inner class name */
        static final class C1202a extends kotlin.jvm.internal.n0 implements ld.l<Method, CharSequence> {

            /* renamed from: b, reason: collision with root package name */
            public static final C1202a f78701b = new C1202a(1);

            C1202a() {
                super(1);
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(Method method) {
                Class<?> returnType = method.getReturnType();
                kotlin.jvm.internal.l0.o(returnType, ProtectedSandApp.s("膢\u0001"));
                return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.b(returnType);
            }
        }

        /* compiled from: Comparisons.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 RuntimeTypeMapper.kt\nkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor\n*L\n1#1,328:1\n88#2:329\n*E\n"})
        public static final class b<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t4, T t5) {
                return kotlin.comparisons.a.l(((Method) t4).getName(), ((Method) t5).getName());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@fg.l Class<?> cls) {
            super(null);
            kotlin.jvm.internal.l0.p(cls, ProtectedSandApp.s("膣\u0001"));
            this.jClass = cls;
            Method[] declaredMethods = cls.getDeclaredMethods();
            kotlin.jvm.internal.l0.o(declaredMethods, ProtectedSandApp.s("膤\u0001"));
            this.methods = kotlin.collections.l.Mv(declaredMethods, new b());
        }

        @Override // kotlin.reflect.jvm.internal.l
        @fg.l
        /* renamed from: a */
        public String get_signature() {
            return kotlin.collections.w.m3(this.methods, "", ProtectedSandApp.s("膥\u0001"), ProtectedSandApp.s("膦\u0001"), 0, null, C1202a.f78701b, 24, null);
        }

        @fg.l
        public final List<Method> b() {
            return this.methods;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/l$b;", "Lkotlin/reflect/jvm/internal/l;", "Ljava/lang/reflect/Constructor;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "", "a", "()Ljava/lang/String;", "Ljava/lang/reflect/Constructor;", "b", "()Ljava/lang/reflect/Constructor;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends l {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Constructor<?> constructor;

        /* compiled from: RuntimeTypeMapper.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Class;", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/lang/Class;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<Class<?>, CharSequence> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f78703b = new a(1);

            a() {
                super(1);
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(Class<?> cls) {
                kotlin.jvm.internal.l0.m(cls);
                return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.b(cls);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@fg.l Constructor<?> constructor) {
            super(null);
            kotlin.jvm.internal.l0.p(constructor, ProtectedSandApp.s("膧\u0001"));
            this.constructor = constructor;
        }

        @Override // kotlin.reflect.jvm.internal.l
        @fg.l
        /* renamed from: a */
        public String get_signature() {
            Class<?>[] parameterTypes = this.constructor.getParameterTypes();
            kotlin.jvm.internal.l0.o(parameterTypes, ProtectedSandApp.s("膨\u0001"));
            return kotlin.collections.l.lh(parameterTypes, "", ProtectedSandApp.s("膩\u0001"), ProtectedSandApp.s("膪\u0001"), 0, null, a.f78703b, 24, null);
        }

        @fg.l
        public final Constructor<?> b() {
            return this.constructor;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/l$c;", "Lkotlin/reflect/jvm/internal/l;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "", "a", "()Ljava/lang/String;", "Ljava/lang/reflect/Method;", "b", "()Ljava/lang/reflect/Method;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends l {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Method method;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@fg.l Method method) {
            super(null);
            kotlin.jvm.internal.l0.p(method, ProtectedSandApp.s("膫\u0001"));
            this.method = method;
        }

        @Override // kotlin.reflect.jvm.internal.l
        @fg.l
        /* renamed from: a */
        public String get_signature() {
            String b5;
            b5 = m0.b(this.method);
            return b5;
        }

        @fg.l
        /* renamed from: b, reason: from getter */
        public final Method getMethod() {
            return this.method;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0011\u0010\u000f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\b¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/l$d;", "Lkotlin/reflect/jvm/internal/l;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/d$b;", "signature", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "", "a", "()Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/d$b;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;", "b", "Ljava/lang/String;", "_signature", "constructorDesc", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends l {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final d.b signature;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final String _signature;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@fg.l d.b bVar) {
            super(null);
            kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("膬\u0001"));
            this.signature = bVar;
            this._signature = bVar.a();
        }

        @Override // kotlin.reflect.jvm.internal.l
        @fg.l
        /* renamed from: a, reason: from getter */
        public String get_signature() {
            return this._signature;
        }

        @fg.l
        public final String b() {
            return this.signature.b();
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\bR\u0011\u0010\u0011\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\b¨\u0006\u0012"}, d2 = {"Lkotlin/reflect/jvm/internal/l$e;", "Lkotlin/reflect/jvm/internal/l;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/d$b;", "signature", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "", "a", "()Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/d$b;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;", "b", "Ljava/lang/String;", "_signature", "c", "methodName", "methodDesc", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends l {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final d.b signature;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final String _signature;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@fg.l d.b bVar) {
            super(null);
            kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("膭\u0001"));
            this.signature = bVar;
            this._signature = bVar.a();
        }

        @Override // kotlin.reflect.jvm.internal.l
        @fg.l
        /* renamed from: a, reason: from getter */
        public String get_signature() {
            return this._signature;
        }

        @fg.l
        public final String b() {
            return this.signature.b();
        }

        @fg.l
        public final String c() {
            return this.signature.c();
        }
    }

    public /* synthetic */ l(kotlin.jvm.internal.w wVar) {
        this();
    }

    @fg.l
    /* renamed from: a */
    public abstract String get_signature();

    private l() {
    }
}
