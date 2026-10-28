package kotlin.reflect.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.i0;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.types.t1;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: KTypeImpl.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u001b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001d\u0010#\u001a\u0004\u0018\u00010\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b!\u0010\"R!\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b\u001f\u0010'R\u0016\u0010+\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020/0$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010'¨\u00063²\u0006\u0012\u00102\u001a\b\u0012\u0004\u0012\u00020\u00050$8\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/d0;", "Lkotlin/jvm/internal/m0;", "Lkotlin/reflect/jvm/internal/impl/types/h0;", "type", "Lkotlin/Function0;", "Ljava/lang/reflect/Type;", "computeJavaType", "<init>", "(Lorg/jetbrains/kotlin/types/KotlinType;Lld/a;)V", "Lkotlin/reflect/g;", "i", "(Lkotlin/reflect/jvm/internal/impl/types/h0;)Lkotlin/reflect/g;", "", "nullable", "o", "(Z)Lkotlin/reflect/jvm/internal/d0;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "Lkotlin/reflect/jvm/internal/impl/types/h0;", "getType", "()Lorg/jetbrains/kotlin/types/KotlinType;", "Lkotlin/reflect/jvm/internal/i0$a;", "c", "Lkotlin/reflect/jvm/internal/i0$a;", "d", "()Lkotlin/reflect/g;", "classifier", "", "Lkotlin/reflect/u;", "e", "()Ljava/util/List;", "arguments", "s", "()Ljava/lang/reflect/Type;", "javaType", "f", "()Z", "isMarkedNullable", "", "getAnnotations", "annotations", "parameterizedTypeArguments", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nKTypeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KTypeImpl.kt\nkotlin/reflect/jvm/internal/KTypeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
/* loaded from: classes7.dex */
public final class d0 implements kotlin.jvm.internal.m0 {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.o<Object>[] f75629f = {l1.u(new g1(l1.d(d0.class), ProtectedSandApp.s("杇\u0001"), ProtectedSandApp.s("杈\u0001"))), l1.u(new g1(l1.d(d0.class), ProtectedSandApp.s("杉\u0001"), ProtectedSandApp.s("杊\u0001")))};

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.types.h0 type;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final i0.a<Type> computeJavaType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i0.a classifier;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i0.a arguments;

    /* compiled from: KTypeImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lkotlin/reflect/u;", "kotlin.jvm.PlatformType", "b", "()Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nKTypeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KTypeImpl.kt\nkotlin/reflect/jvm/internal/KTypeImpl$arguments$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,136:1\n1559#2:137\n1590#2,4:138\n*S KotlinDebug\n*F\n+ 1 KTypeImpl.kt\nkotlin/reflect/jvm/internal/KTypeImpl$arguments$2\n*L\n81#1:137\n81#1:138,4\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<List<? extends kotlin.reflect.u>> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a<Type> f75635c;

        /* compiled from: KTypeImpl.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/lang/reflect/Type;", "a", "()Ljava/lang/reflect/Type;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: kotlin.reflect.jvm.internal.d0$a$a, reason: collision with other inner class name */
        static final class C1070a extends kotlin.jvm.internal.n0 implements ld.a<Type> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d0 f75636b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f75637c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlin.b0<List<Type>> f75638d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1070a(d0 d0Var, int i4, kotlin.b0<? extends List<? extends Type>> b0Var) {
                super(0);
                this.f75636b = d0Var;
                this.f75637c = i4;
                this.f75638d = b0Var;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Type invoke() {
                Type s4 = this.f75636b.s();
                if (s4 instanceof Class) {
                    Class cls = (Class) s4;
                    Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                    kotlin.jvm.internal.l0.m(componentType);
                    return componentType;
                }
                if (s4 instanceof GenericArrayType) {
                    if (this.f75637c == 0) {
                        Type genericComponentType = ((GenericArrayType) s4).getGenericComponentType();
                        kotlin.jvm.internal.l0.m(genericComponentType);
                        return genericComponentType;
                    }
                    throw new g0(ProtectedSandApp.s("杂\u0001") + this.f75636b);
                }
                if (!(s4 instanceof ParameterizedType)) {
                    throw new g0(ProtectedSandApp.s("杅\u0001") + this.f75636b);
                }
                Type type = this.f75638d.getValue().get(this.f75637c);
                if (type instanceof WildcardType) {
                    WildcardType wildcardType = (WildcardType) type;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    kotlin.jvm.internal.l0.o(lowerBounds, ProtectedSandApp.s("权\u0001"));
                    Type type2 = (Type) kotlin.collections.l.nc(lowerBounds);
                    if (type2 == null) {
                        Type[] upperBounds = wildcardType.getUpperBounds();
                        kotlin.jvm.internal.l0.o(upperBounds, ProtectedSandApp.s("杄\u0001"));
                        type = (Type) kotlin.collections.l.Rb(upperBounds);
                    } else {
                        type = type2;
                    }
                }
                kotlin.jvm.internal.l0.m(type);
                return type;
            }
        }

        /* compiled from: KTypeImpl.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f75639a;

            static {
                int[] iArr = new int[x1.values().length];
                try {
                    iArr[x1.INVARIANT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[x1.IN_VARIANCE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[x1.OUT_VARIANCE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f75639a = iArr;
            }
        }

        /* compiled from: KTypeImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/lang/reflect/Type;", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
        static final class c extends kotlin.jvm.internal.n0 implements ld.a<List<? extends Type>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d0 f75640b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(d0 d0Var) {
                super(0);
                this.f75640b = d0Var;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<Type> invoke() {
                Type s4 = this.f75640b.s();
                kotlin.jvm.internal.l0.m(s4);
                return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.d(s4);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ld.a<? extends Type> aVar) {
            super(0);
            this.f75635c = aVar;
        }

        public static final List a(kotlin.b0 b0Var) {
            return (List) b0Var.getValue();
        }

        private static final List<Type> c(kotlin.b0<? extends List<? extends Type>> b0Var) {
            return (List) b0Var.getValue();
        }

        @Override // ld.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List<kotlin.reflect.u> invoke() {
            kotlin.reflect.u e4;
            List<kotlin.reflect.jvm.internal.impl.types.l1> M0 = d0.this.getType().M0();
            if (M0.isEmpty()) {
                return kotlin.collections.j0.f74919b;
            }
            kotlin.b0 b5 = kotlin.c0.b(kotlin.f0.PUBLICATION, new c(d0.this));
            List<kotlin.reflect.jvm.internal.impl.types.l1> list = M0;
            ld.a<Type> aVar = this.f75635c;
            d0 d0Var = d0.this;
            ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(list, 10));
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    kotlin.collections.w.Z();
                }
                kotlin.reflect.jvm.internal.impl.types.l1 l1Var = (kotlin.reflect.jvm.internal.impl.types.l1) obj;
                if (l1Var.b()) {
                    kotlin.reflect.u.INSTANCE.getClass();
                    e4 = kotlin.reflect.u.f78866d;
                } else {
                    kotlin.reflect.jvm.internal.impl.types.h0 type = l1Var.getType();
                    kotlin.jvm.internal.l0.o(type, ProtectedSandApp.s("杆\u0001"));
                    d0 d0Var2 = new d0(type, aVar == null ? null : new C1070a(d0Var, i4, b5));
                    int i6 = b.f75639a[l1Var.c().ordinal()];
                    if (i6 == 1) {
                        e4 = kotlin.reflect.u.INSTANCE.e(d0Var2);
                    } else if (i6 == 2) {
                        e4 = kotlin.reflect.u.INSTANCE.a(d0Var2);
                    } else {
                        if (i6 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        e4 = kotlin.reflect.u.INSTANCE.b(d0Var2);
                    }
                }
                arrayList.add(e4);
                i4 = i5;
            }
            return arrayList;
        }
    }

    /* compiled from: KTypeImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/reflect/g;", "a", "()Lkotlin/reflect/g;"}, k = 3, mv = {1, 9, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<kotlin.reflect.g> {
        b() {
            super(0);
        }

        @Override // ld.a
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.g invoke() {
            d0 d0Var = d0.this;
            return d0Var.i(d0Var.getType());
        }
    }

    public d0(@fg.l kotlin.reflect.jvm.internal.impl.types.h0 h0Var, @fg.m ld.a<? extends Type> aVar) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("杋\u0001"));
        this.type = h0Var;
        i0.a<Type> aVar2 = null;
        i0.a<Type> aVar3 = aVar instanceof i0.a ? (i0.a) aVar : null;
        if (aVar3 != null) {
            aVar2 = aVar3;
        } else if (aVar != null) {
            aVar2 = i0.c(aVar);
        }
        this.computeJavaType = aVar2;
        this.classifier = i0.c(new b());
        this.arguments = i0.c(new a(aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.g i(kotlin.reflect.jvm.internal.impl.types.h0 type) {
        kotlin.reflect.jvm.internal.impl.types.h0 type2;
        kotlin.reflect.jvm.internal.impl.descriptors.h c5 = type.O0().c();
        if (!(c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
            if (c5 instanceof f1) {
                return new e0(null, (f1) c5);
            }
            if (c5 instanceof e1) {
                throw new kotlin.g0(ProtectedSandApp.s("杍\u0001"));
            }
            return null;
        }
        Class<?> s4 = p0.s((kotlin.reflect.jvm.internal.impl.descriptors.e) c5);
        if (s4 == null) {
            return null;
        }
        if (!s4.isArray()) {
            if (t1.l(type)) {
                return new o(s4);
            }
            Class<?> e4 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.e(s4);
            if (e4 != null) {
                s4 = e4;
            }
            return new o(s4);
        }
        kotlin.reflect.jvm.internal.impl.types.l1 l1Var = (kotlin.reflect.jvm.internal.impl.types.l1) kotlin.collections.w.k5(type.M0());
        if (l1Var == null || (type2 = l1Var.getType()) == null) {
            return new o(s4);
        }
        kotlin.reflect.g i4 = i(type2);
        if (i4 != null) {
            return new o(p0.f(kd.b.e(kotlin.reflect.jvm.d.a(i4))));
        }
        throw new g0(ProtectedSandApp.s("杌\u0001") + this);
    }

    @Override // kotlin.reflect.s
    @fg.l
    public List<kotlin.reflect.u> c() {
        i0.a aVar = this.arguments;
        kotlin.reflect.o<Object> oVar = f75629f[1];
        Object invoke = aVar.invoke();
        kotlin.jvm.internal.l0.o(invoke, ProtectedSandApp.s("李\u0001"));
        return (List) invoke;
    }

    @Override // kotlin.reflect.s
    @fg.m
    /* renamed from: d */
    public kotlin.reflect.g getClassifier() {
        i0.a aVar = this.classifier;
        kotlin.reflect.o<Object> oVar = f75629f[0];
        return (kotlin.reflect.g) aVar.invoke();
    }

    public boolean equals(@fg.m Object other) {
        if (other instanceof d0) {
            d0 d0Var = (d0) other;
            if (kotlin.jvm.internal.l0.g(this.type, d0Var.type) && kotlin.jvm.internal.l0.g(getClassifier(), d0Var.getClassifier()) && kotlin.jvm.internal.l0.g(c(), d0Var.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.s
    public boolean f() {
        return this.type.P0();
    }

    @Override // kotlin.reflect.b
    @fg.l
    public List<Annotation> getAnnotations() {
        return p0.e(this.type);
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        kotlin.reflect.g classifier = getClassifier();
        return c().hashCode() + ((hashCode + (classifier != null ? classifier.hashCode() : 0)) * 31);
    }

    @fg.l
    /* renamed from: l, reason: from getter */
    public final kotlin.reflect.jvm.internal.impl.types.h0 getType() {
        return this.type;
    }

    @fg.l
    public final d0 o(boolean nullable) {
        if (!kotlin.reflect.jvm.internal.impl.types.e0.b(this.type) && this.type.P0() == nullable) {
            return this;
        }
        kotlin.reflect.jvm.internal.impl.types.h0 p4 = t1.p(this.type, nullable);
        kotlin.jvm.internal.l0.o(p4, ProtectedSandApp.s("杏\u0001"));
        return new d0(p4, this.computeJavaType);
    }

    @Override // kotlin.jvm.internal.m0
    @fg.m
    public Type s() {
        i0.a<Type> aVar = this.computeJavaType;
        if (aVar != null) {
            return aVar.invoke();
        }
        return null;
    }

    @fg.l
    public String toString() {
        return k0.f78694a.h(this.type);
    }

    public /* synthetic */ d0(kotlin.reflect.jvm.internal.impl.types.h0 h0Var, ld.a aVar, int i4, kotlin.jvm.internal.w wVar) {
        this(h0Var, (i4 & 2) != 0 ? null : aVar);
    }
}
