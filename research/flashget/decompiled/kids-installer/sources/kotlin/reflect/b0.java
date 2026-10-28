package kotlin.reflect;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.collections.j0;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.internal.KTypeBase;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.l0;
import kotlin.sequences.Sequence;
import kotlin.text.e0;

/* compiled from: TypesJVM.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a\"\u0010\n\u001a\u00020\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0003\u001a\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0001H\u0002\u001a\u0016\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0003\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00078BX\u0083\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\b\u001a\u0004\b\u0005\u0010\t¨\u0006\u0015"}, d2 = {"javaType", "Ljava/lang/reflect/Type;", "Lkotlin/reflect/KType;", "getJavaType$annotations", "(Lkotlin/reflect/KType;)V", "getJavaType", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;", "Lkotlin/reflect/KTypeProjection;", "(Lkotlin/reflect/KTypeProjection;)V", "(Lkotlin/reflect/KTypeProjection;)Ljava/lang/reflect/Type;", "createPossiblyInnerType", "jClass", "Ljava/lang/Class;", "arguments", "", "typeToString", "", "type", "computeJavaType", "forceWrapper", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,230:1\n1#2:231\n1549#3:232\n1620#3,3:233\n1549#3:236\n1620#3,3:237\n1549#3:240\n1620#3,3:241\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n*L\n69#1:232\n69#1:233,3\n71#1:236\n71#1:237,3\n77#1:240\n77#1:241,3\n*E\n"})
/* loaded from: classes5.dex */
public final class b0 {

    /* compiled from: TypesJVM.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23767a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f23767a = iArr;
        }
    }

    /* compiled from: TypesJVM.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    /* synthetic */ class b extends h0 implements q3.l<Class<?>, Class<?>> {

        /* renamed from: x, reason: collision with root package name */
        public static final b f23768x = new b();

        b() {
            super(1, Class.class, ProtectedSandApp.s("罶"), ProtectedSandApp.s("罷"), 0);
        }

        @Override // q3.l
        /* renamed from: A0, reason: merged with bridge method [inline-methods] */
        public final Class<?> N(@d5.d Class<?> cls) {
            l0.p(cls, ProtectedSandApp.s("罸"));
            return cls.getComponentType();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ExperimentalStdlibApi
    public static final Type c(KType kType, boolean z5) {
        Object k5;
        KClassifier k6 = kType.k();
        if (k6 instanceof KTypeParameter) {
            return new TypeVariableImpl((KTypeParameter) k6);
        }
        if (!(k6 instanceof KClass)) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("䋎") + kType);
        }
        KClass kClass = (KClass) k6;
        Class g5 = z5 ? p3.b.g(kClass) : p3.b.e(kClass);
        List<KTypeProjection> g6 = kType.g();
        if (g6.isEmpty()) {
            return g5;
        }
        if (!g5.isArray()) {
            return e(g5, g6);
        }
        if (g5.getComponentType().isPrimitive()) {
            return g5;
        }
        k5 = j0.k5(g6);
        KTypeProjection kTypeProjection = (KTypeProjection) k5;
        if (kTypeProjection == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("䋍") + kType);
        }
        KVariance f26863a = kTypeProjection.getF26863a();
        KType f26864b = kTypeProjection.getF26864b();
        int i5 = f26863a == null ? -1 : a.f23767a[f26863a.ordinal()];
        if (i5 == -1 || i5 == 1) {
            return g5;
        }
        if (i5 != 2 && i5 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        l0.m(f26864b);
        Type d6 = d(f26864b, false, 1, null);
        return d6 instanceof Class ? g5 : new GenericArrayTypeImpl(d6);
    }

    static /* synthetic */ Type d(KType kType, boolean z5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z5 = false;
        }
        return c(kType, z5);
    }

    @ExperimentalStdlibApi
    private static final Type e(Class<?> cls, List<KTypeProjection> list) {
        int b02;
        int b03;
        int b04;
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            b04 = kotlin.collections.b0.b0(list, 10);
            ArrayList arrayList = new ArrayList(b04);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(g((KTypeProjection) it.next()));
            }
            return new ParameterizedTypeImpl(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            b03 = kotlin.collections.b0.b0(list, 10);
            ArrayList arrayList2 = new ArrayList(b03);
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(g((KTypeProjection) it2.next()));
            }
            return new ParameterizedTypeImpl(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type e6 = e(declaringClass, list.subList(length, list.size()));
        List<KTypeProjection> subList = list.subList(0, length);
        b02 = kotlin.collections.b0.b0(subList, 10);
        ArrayList arrayList3 = new ArrayList(b02);
        Iterator<T> it3 = subList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(g((KTypeProjection) it3.next()));
        }
        return new ParameterizedTypeImpl(cls, e6, arrayList3);
    }

    @d5.d
    public static final Type f(@d5.d KType kType) {
        Type W;
        l0.p(kType, ProtectedSandApp.s("䋏"));
        return (!(kType instanceof KTypeBase) || (W = ((KTypeBase) kType).W()) == null) ? d(kType, false, 1, null) : W;
    }

    private static final Type g(KTypeProjection kTypeProjection) {
        KVariance h5 = kTypeProjection.h();
        if (h5 == null) {
            WildcardTypeImpl.f23769q.getClass();
            return WildcardTypeImpl.f23770r;
        }
        KType g5 = kTypeProjection.g();
        l0.m(g5);
        int i5 = a.f23767a[h5.ordinal()];
        if (i5 == 1) {
            return new WildcardTypeImpl(null, c(g5, true));
        }
        if (i5 == 2) {
            return c(g5, true);
        }
        if (i5 == 3) {
            return new WildcardTypeImpl(c(g5, true), null);
        }
        throw new NoWhenBranchMatchedException();
    }

    @ExperimentalStdlibApi
    @SinceKotlin(version = "1.4")
    @LowPriorityInOverloadResolution
    public static /* synthetic */ void h(KType kType) {
    }

    @ExperimentalStdlibApi
    private static /* synthetic */ void i(KTypeProjection kTypeProjection) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(Type type) {
        String name;
        Sequence l5;
        Object f12;
        int g02;
        String e22;
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            l5 = kotlin.sequences.s.l(type, b.f23768x);
            StringBuilder sb = new StringBuilder();
            f12 = kotlin.sequences.v.f1(l5);
            sb.append(((Class) f12).getName());
            String s5 = ProtectedSandApp.s("䋐");
            g02 = kotlin.sequences.v.g0(l5);
            e22 = e0.e2(s5, g02);
            sb.append(e22);
            name = sb.toString();
        } else {
            name = cls.getName();
        }
        l0.m(name);
        return name;
    }
}
