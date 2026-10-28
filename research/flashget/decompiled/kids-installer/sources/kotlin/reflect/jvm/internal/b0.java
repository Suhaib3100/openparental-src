package kotlin.reflect.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.KTypeBase;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l1;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KProperty;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.types.t1;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: KTypeImpl.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010-¢\u0006\u0004\b.\u0010/J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00048VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u001cR!\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\"R\u0016\u0010&\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020*0\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\"¨\u00061²\u0006\u0012\u00100\u001a\b\u0012\u0004\u0012\u00020\u00160\u001e8\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/b0;", "Lkotlin/jvm/internal/m0;", "Lkotlin/reflect/jvm/internal/impl/types/h0;", "type", "Lkotlin/reflect/g;", "n", "", "nullable", "z", "(Z)Lkotlin/reflect/jvm/internal/b0;", "", "other", "equals", "", "hashCode", "", "toString", "o", "Lkotlin/reflect/jvm/internal/impl/types/h0;", "getType", "()Lorg/jetbrains/kotlin/types/KotlinType;", "Lkotlin/reflect/jvm/internal/g0$a;", "Ljava/lang/reflect/Type;", "p", "Lkotlin/reflect/jvm/internal/g0$a;", "computeJavaType", "q", "k", "()Lkotlin/reflect/g;", "classifier", "", "Lkotlin/reflect/u;", "r", "g", "()Ljava/util/List;", "arguments", "W", "()Ljava/lang/reflect/Type;", "javaType", "L", "()Z", "isMarkedNullable", "", "getAnnotations", "annotations", "Lkotlin/Function0;", "<init>", "(Lorg/jetbrains/kotlin/types/KotlinType;Lq3/a;)V", "parameterizedTypeArguments", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class b0 implements KTypeBase {

    /* renamed from: s, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f23795s = {l1.u(new g1(l1.d(b0.class), ProtectedSandApp.s("羌"), ProtectedSandApp.s("羍"))), l1.u(new g1(l1.d(b0.class), ProtectedSandApp.s("美"), ProtectedSandApp.s("羏")))};

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.types.h0 type;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final g0.a<Type> computeJavaType;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final g0.a classifier;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final g0.a arguments;

    /* compiled from: KTypeImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lkotlin/reflect/u;", "kotlin.jvm.PlatformType", "b", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    static final class a extends Lambda implements q3.a<List<? extends KTypeProjection>> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ q3.a<Type> f23801q;

        /* compiled from: KTypeImpl.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/lang/reflect/Type;", "a", "()Ljava/lang/reflect/Type;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: kotlin.reflect.jvm.internal.b0$a$a, reason: collision with other inner class name */
        static final class C0262a extends Lambda implements q3.a<Type> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ b0 f23802p;

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ int f23803q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ Lazy<List<Type>> f23804r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0262a(b0 b0Var, int i5, Lazy<? extends List<? extends Type>> lazy) {
                super(0);
                this.f23802p = b0Var;
                this.f23803q = i5;
                this.f23804r = lazy;
            }

            @Override // q3.a
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Type n() {
                Object nc;
                Object Rb;
                Type W = this.f23802p.W();
                boolean z5 = W instanceof Class;
                String s5 = ProtectedSandApp.s("羆");
                if (z5) {
                    Class cls = (Class) W;
                    Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                    kotlin.jvm.internal.l0.o(componentType, s5);
                    return componentType;
                }
                if (W instanceof GenericArrayType) {
                    if (this.f23803q == 0) {
                        Type genericComponentType = ((GenericArrayType) W).getGenericComponentType();
                        kotlin.jvm.internal.l0.o(genericComponentType, s5);
                        return genericComponentType;
                    }
                    throw new e0(ProtectedSandApp.s("羇") + this.f23802p);
                }
                if (!(W instanceof ParameterizedType)) {
                    throw new e0(ProtectedSandApp.s("羊") + this.f23802p);
                }
                Type type = (Type) a.c(this.f23804r).get(this.f23803q);
                if (type instanceof WildcardType) {
                    WildcardType wildcardType = (WildcardType) type;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    kotlin.jvm.internal.l0.o(lowerBounds, ProtectedSandApp.s("羈"));
                    nc = kotlin.collections.t.nc(lowerBounds);
                    Type type2 = (Type) nc;
                    if (type2 == null) {
                        Type[] upperBounds = wildcardType.getUpperBounds();
                        kotlin.jvm.internal.l0.o(upperBounds, ProtectedSandApp.s("羉"));
                        Rb = kotlin.collections.t.Rb(upperBounds);
                        type = (Type) Rb;
                    } else {
                        type = type2;
                    }
                }
                kotlin.jvm.internal.l0.o(type, s5);
                return type;
            }
        }

        /* compiled from: KTypeImpl.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f23805a;

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
                f23805a = iArr;
            }
        }

        /* compiled from: KTypeImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/lang/reflect/Type;", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
        static final class c extends Lambda implements q3.a<List<? extends Type>> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ b0 f23806p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(b0 b0Var) {
                super(0);
                this.f23806p = b0Var;
            }

            @Override // q3.a
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<Type> n() {
                Type W = this.f23806p.W();
                kotlin.jvm.internal.l0.m(W);
                return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.d(W);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(q3.a<? extends Type> aVar) {
            super(0);
            this.f23801q = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List<Type> c(Lazy<? extends List<? extends Type>> lazy) {
            return (List) lazy.getValue();
        }

        @Override // q3.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List<KTypeProjection> n() {
            Lazy b6;
            int b02;
            KTypeProjection e6;
            List<kotlin.reflect.jvm.internal.impl.types.l1> S0 = b0.this.getType().S0();
            if (S0.isEmpty()) {
                return EmptyList.f23167o;
            }
            b6 = kotlin.d0.b(LazyThreadSafetyMode.PUBLICATION, new c(b0.this));
            q3.a<Type> aVar = this.f23801q;
            b0 b0Var = b0.this;
            b02 = kotlin.collections.b0.b0(S0, 10);
            ArrayList arrayList = new ArrayList(b02);
            int i5 = 0;
            for (Object obj : S0) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    kotlin.collections.a0.Z();
                }
                kotlin.reflect.jvm.internal.impl.types.l1 l1Var = (kotlin.reflect.jvm.internal.impl.types.l1) obj;
                if (l1Var.c()) {
                    KTypeProjection.f26861c.getClass();
                    e6 = KTypeProjection.f26862d;
                } else {
                    kotlin.reflect.jvm.internal.impl.types.h0 type = l1Var.getType();
                    kotlin.jvm.internal.l0.o(type, ProtectedSandApp.s("羋"));
                    b0 b0Var2 = new b0(type, aVar == null ? null : new C0262a(b0Var, i5, b6));
                    int i7 = b.f23805a[l1Var.b().ordinal()];
                    if (i7 == 1) {
                        e6 = KTypeProjection.f26861c.e(b0Var2);
                    } else if (i7 == 2) {
                        e6 = KTypeProjection.f26861c.a(b0Var2);
                    } else {
                        if (i7 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        e6 = KTypeProjection.f26861c.b(b0Var2);
                    }
                }
                arrayList.add(e6);
                i5 = i6;
            }
            return arrayList;
        }
    }

    /* compiled from: KTypeImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/reflect/g;", "a", "()Lkotlin/reflect/g;"}, k = 3, mv = {1, 8, 0})
    static final class b extends Lambda implements q3.a<KClassifier> {
        b() {
            super(0);
        }

        @Override // q3.a
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KClassifier n() {
            b0 b0Var = b0.this;
            return b0Var.n(b0Var.getType());
        }
    }

    public b0(@d5.d kotlin.reflect.jvm.internal.impl.types.h0 h0Var, @d5.e q3.a<? extends Type> aVar) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("羐"));
        this.type = h0Var;
        g0.a<Type> aVar2 = null;
        g0.a<Type> aVar3 = aVar instanceof g0.a ? (g0.a) aVar : null;
        if (aVar3 != null) {
            aVar2 = aVar3;
        } else if (aVar != null) {
            aVar2 = g0.d(aVar);
        }
        this.computeJavaType = aVar2;
        this.classifier = g0.d(new b());
        this.arguments = g0.d(new a(aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KClassifier n(kotlin.reflect.jvm.internal.impl.types.h0 type) {
        Object k5;
        kotlin.reflect.jvm.internal.impl.types.h0 type2;
        kotlin.reflect.jvm.internal.impl.descriptors.h b6 = type.U0().b();
        if (!(b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
            if (b6 instanceof f1) {
                return new c0(null, (f1) b6);
            }
            if (b6 instanceof e1) {
                throw new NotImplementedError(ProtectedSandApp.s("羒"));
            }
            return null;
        }
        Class<?> p5 = n0.p((kotlin.reflect.jvm.internal.impl.descriptors.e) b6);
        if (p5 == null) {
            return null;
        }
        if (!p5.isArray()) {
            if (t1.l(type)) {
                return new m(p5);
            }
            Class<?> e6 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.e(p5);
            if (e6 != null) {
                p5 = e6;
            }
            return new m(p5);
        }
        k5 = kotlin.collections.j0.k5(type.S0());
        kotlin.reflect.jvm.internal.impl.types.l1 l1Var = (kotlin.reflect.jvm.internal.impl.types.l1) k5;
        if (l1Var == null || (type2 = l1Var.getType()) == null) {
            return new m(p5);
        }
        KClassifier n5 = n(type2);
        if (n5 != null) {
            return new m(n0.f(p3.b.e(kotlin.reflect.jvm.d.a(n5))));
        }
        throw new e0(ProtectedSandApp.s("羑") + this);
    }

    @Override // kotlin.reflect.KType
    public boolean L() {
        return this.type.V0();
    }

    @Override // kotlin.jvm.internal.KTypeBase
    @d5.e
    public Type W() {
        g0.a<Type> aVar = this.computeJavaType;
        if (aVar != null) {
            return aVar.n();
        }
        return null;
    }

    public boolean equals(@d5.e Object other) {
        if (other instanceof b0) {
            b0 b0Var = (b0) other;
            if (kotlin.jvm.internal.l0.g(this.type, b0Var.type) && kotlin.jvm.internal.l0.g(getF23643o(), b0Var.getF23643o()) && kotlin.jvm.internal.l0.g(g(), b0Var.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.KType
    @d5.d
    public List<KTypeProjection> g() {
        T b6 = this.arguments.b(this, f23795s[1]);
        kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("羓"));
        return (List) b6;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    @d5.d
    public List<Annotation> getAnnotations() {
        return n0.e(this.type);
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        KClassifier f23643o = getF23643o();
        return g().hashCode() + ((hashCode + (f23643o != null ? f23643o.hashCode() : 0)) * 31);
    }

    @Override // kotlin.reflect.KType
    @d5.e
    /* renamed from: k */
    public KClassifier getF23643o() {
        return (KClassifier) this.classifier.b(this, f23795s[0]);
    }

    @d5.d
    public String toString() {
        return i0.f23876a.h(this.type);
    }

    @d5.d
    /* renamed from: v, reason: from getter */
    public final kotlin.reflect.jvm.internal.impl.types.h0 getType() {
        return this.type;
    }

    @d5.d
    public final b0 z(boolean nullable) {
        if (!kotlin.reflect.jvm.internal.impl.types.e0.b(this.type) && L() == nullable) {
            return this;
        }
        kotlin.reflect.jvm.internal.impl.types.h0 p5 = t1.p(this.type, nullable);
        kotlin.jvm.internal.l0.o(p5, ProtectedSandApp.s("羔"));
        return new b0(p5, this.computeJavaType);
    }

    public /* synthetic */ b0(kotlin.reflect.jvm.internal.impl.types.h0 h0Var, q3.a aVar, int i5, kotlin.jvm.internal.w wVar) {
        this(h0Var, (i5 & 2) != 0 ? null : aVar);
    }
}
