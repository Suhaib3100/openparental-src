package com.google.common.reflect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.c0;
import com.google.common.base.f0;
import com.google.common.base.l0;
import com.google.common.base.n0;
import com.google.common.base.x;
import com.google.common.collect.c4;
import com.google.common.collect.e7;
import com.google.common.collect.f3;
import com.google.common.collect.h3;
import com.google.common.reflect.s;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.AccessControlException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.text.m0;

/* compiled from: Types.java */
@com.google.common.reflect.d
/* loaded from: classes6.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private static final c0 f57623a = c0.p(ProtectedSandApp.s("牢")).s(ProtectedSandApp.s("磊"));

    /* compiled from: Types.java */
    class a extends r {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicReference f57624b;

        a(AtomicReference atomicReference) {
            this.f57624b = atomicReference;
        }

        @Override // com.google.common.reflect.r
        void b(Class<?> cls) {
            this.f57624b.set(cls.getComponentType());
        }

        @Override // com.google.common.reflect.r
        void c(GenericArrayType genericArrayType) {
            this.f57624b.set(genericArrayType.getGenericComponentType());
        }

        @Override // com.google.common.reflect.r
        void e(TypeVariable<?> typeVariable) {
            this.f57624b.set(s.p(typeVariable.getBounds()));
        }

        @Override // com.google.common.reflect.r
        void f(WildcardType wildcardType) {
            this.f57624b.set(s.p(wildcardType.getUpperBounds()));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Types.java */
    private static abstract class b {
        public static final b OWNED_BY_ENCLOSING_CLASS = new a(ProtectedSandApp.s("老"), 0);
        public static final b LOCAL_CLASS_HAS_NO_OWNER = new c(ProtectedSandApp.s("蘆"), 1);
        private static final /* synthetic */ b[] $VALUES = $values();
        static final b JVM_BEHAVIOR = detectJvmBehavior();

        /* compiled from: Types.java */
        enum a extends b {
            a(String str, int i4) {
                super(str, i4, null);
            }

            @Override // com.google.common.reflect.s.b
            @zc.a
            Class<?> getOwnerType(Class<?> cls) {
                return cls.getEnclosingClass();
            }
        }

        /* compiled from: Types.java */
        /* renamed from: com.google.common.reflect.s$b$b, reason: collision with other inner class name */
        class C0882b<T> {
            C0882b() {
            }
        }

        /* compiled from: Types.java */
        enum c extends b {
            c(String str, int i4) {
                super(str, i4, null);
            }

            @Override // com.google.common.reflect.s.b
            @zc.a
            Class<?> getOwnerType(Class<?> cls) {
                if (cls.isLocalClass()) {
                    return null;
                }
                return cls.getEnclosingClass();
            }
        }

        /* compiled from: Types.java */
        class d extends C0882b<String> {
            d() {
            }
        }

        private static /* synthetic */ b[] $values() {
            return new b[]{OWNED_BY_ENCLOSING_CLASS, LOCAL_CLASS_HAS_NO_OWNER};
        }

        private b(String str, int i4) {
        }

        private static b detectJvmBehavior() {
            new d();
            ParameterizedType parameterizedType = (ParameterizedType) d.class.getGenericSuperclass();
            Objects.requireNonNull(parameterizedType);
            ParameterizedType parameterizedType2 = parameterizedType;
            for (b bVar : values()) {
                if (bVar.getOwnerType(C0882b.class) == parameterizedType2.getOwnerType()) {
                    return bVar;
                }
            }
            throw new AssertionError();
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        @zc.a
        abstract Class<?> getOwnerType(Class<?> cls);

        /* synthetic */ b(String str, int i4, a aVar) {
            this(str, i4);
        }
    }

    /* compiled from: Types.java */
    private static final class c implements GenericArrayType, Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final long f57625c = 0;

        /* renamed from: b, reason: collision with root package name */
        private final Type f57626b;

        c(Type type) {
            this.f57626b = d.CURRENT.usedInGenericType(type);
        }

        public boolean equals(@zc.a Object obj) {
            if (obj instanceof GenericArrayType) {
                return f0.a(this.f57626b, ((GenericArrayType) obj).getGenericComponentType());
            }
            return false;
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f57626b;
        }

        public int hashCode() {
            return this.f57626b.hashCode();
        }

        public String toString() {
            return String.valueOf(s.s(this.f57626b)).concat(ProtectedSandApp.s("虜"));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Types.java */
    static abstract class d {
        private static final /* synthetic */ d[] $VALUES;
        static final d CURRENT;
        public static final d JAVA6;
        public static final d JAVA7;
        public static final d JAVA8;
        public static final d JAVA9;

        /* compiled from: Types.java */
        enum a extends d {
            a(String str, int i4) {
                super(str, i4, null);
            }

            @Override // com.google.common.reflect.s.d
            Type usedInGenericType(Type type) {
                type.getClass();
                if (!(type instanceof Class)) {
                    return type;
                }
                Class cls = (Class) type;
                return cls.isArray() ? new c(cls.getComponentType()) : type;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.s.d
            public GenericArrayType newArrayType(Type type) {
                return new c(type);
            }
        }

        /* compiled from: Types.java */
        enum b extends d {
            b(String str, int i4) {
                super(str, i4, null);
            }

            @Override // com.google.common.reflect.s.d
            Type newArrayType(Type type) {
                return type instanceof Class ? s.h((Class) type) : new c(type);
            }

            @Override // com.google.common.reflect.s.d
            Type usedInGenericType(Type type) {
                type.getClass();
                return type;
            }
        }

        /* compiled from: Types.java */
        enum c extends d {
            c(String str, int i4) {
                super(str, i4, null);
            }

            @Override // com.google.common.reflect.s.d
            Type newArrayType(Type type) {
                return d.JAVA7.newArrayType(type);
            }

            @Override // com.google.common.reflect.s.d
            String typeName(Type type) {
                try {
                    return (String) Type.class.getMethod(ProtectedSandApp.s("祿"), null).invoke(type, null);
                } catch (IllegalAccessException e4) {
                    throw new RuntimeException(e4);
                } catch (NoSuchMethodException unused) {
                    throw new AssertionError(ProtectedSandApp.s("綠"));
                } catch (InvocationTargetException e5) {
                    throw new RuntimeException(e5);
                }
            }

            @Override // com.google.common.reflect.s.d
            Type usedInGenericType(Type type) {
                return d.JAVA7.usedInGenericType(type);
            }
        }

        /* compiled from: Types.java */
        /* renamed from: com.google.common.reflect.s$d$d, reason: collision with other inner class name */
        enum C0883d extends d {
            C0883d(String str, int i4) {
                super(str, i4, null);
            }

            @Override // com.google.common.reflect.s.d
            boolean jdkTypeDuplicatesOwnerName() {
                return false;
            }

            @Override // com.google.common.reflect.s.d
            Type newArrayType(Type type) {
                return d.JAVA8.newArrayType(type);
            }

            @Override // com.google.common.reflect.s.d
            String typeName(Type type) {
                return d.JAVA8.typeName(type);
            }

            @Override // com.google.common.reflect.s.d
            Type usedInGenericType(Type type) {
                return d.JAVA8.usedInGenericType(type);
            }
        }

        /* compiled from: Types.java */
        class e extends l<Map.Entry<String, int[][]>> {
            e() {
            }
        }

        /* compiled from: Types.java */
        class f extends l<int[]> {
            f() {
            }
        }

        private static /* synthetic */ d[] $values() {
            return new d[]{JAVA6, JAVA7, JAVA8, JAVA9};
        }

        static {
            a aVar = new a(ProtectedSandApp.s("路"), 0);
            JAVA6 = aVar;
            b bVar = new b(ProtectedSandApp.s("露"), 1);
            JAVA7 = bVar;
            c cVar = new c(ProtectedSandApp.s("魯"), 2);
            JAVA8 = cVar;
            C0883d c0883d = new C0883d(ProtectedSandApp.s("鷺"), 3);
            JAVA9 = c0883d;
            $VALUES = $values();
            if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
                if (new e().a().toString().contains(ProtectedSandApp.s("碌"))) {
                    CURRENT = cVar;
                    return;
                } else {
                    CURRENT = c0883d;
                    return;
                }
            }
            if (new f().a() instanceof Class) {
                CURRENT = bVar;
            } else {
                CURRENT = aVar;
            }
        }

        private d(String str, int i4) {
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }

        boolean jdkTypeDuplicatesOwnerName() {
            return true;
        }

        abstract Type newArrayType(Type type);

        String typeName(Type type) {
            return s.s(type);
        }

        final f3<Type> usedInGenericType(Type[] typeArr) {
            f3.a r4 = f3.r();
            for (Type type : typeArr) {
                r4.j(usedInGenericType(type));
            }
            return r4.e();
        }

        abstract Type usedInGenericType(Type type);

        /* synthetic */ d(String str, int i4, a aVar) {
            this(str, i4);
        }
    }

    /* compiled from: Types.java */
    static final class e<X> {

        /* renamed from: a, reason: collision with root package name */
        static final boolean f57627a = !e.class.getTypeParameters()[0].equals(s.k(e.class, ProtectedSandApp.s("菉"), new Type[0]));

        e() {
        }
    }

    /* compiled from: Types.java */
    private static final class f implements ParameterizedType, Serializable {

        /* renamed from: e, reason: collision with root package name */
        private static final long f57628e = 0;

        /* renamed from: b, reason: collision with root package name */
        @zc.a
        private final Type f57629b;

        /* renamed from: c, reason: collision with root package name */
        private final f3<Type> f57630c;

        /* renamed from: d, reason: collision with root package name */
        private final Class<?> f57631d;

        f(@zc.a Type type, Class<?> cls, Type[] typeArr) {
            cls.getClass();
            l0.d(typeArr.length == cls.getTypeParameters().length);
            s.f(typeArr, ProtectedSandApp.s("錄"));
            this.f57629b = type;
            this.f57631d = cls;
            this.f57630c = d.CURRENT.usedInGenericType(typeArr);
        }

        public boolean equals(@zc.a Object obj) {
            if (!(obj instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            return this.f57631d.equals(parameterizedType.getRawType()) && f0.a(this.f57629b, parameterizedType.getOwnerType()) && Arrays.equals(s.r(this.f57630c), parameterizedType.getActualTypeArguments());
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return s.r(this.f57630c);
        }

        @Override // java.lang.reflect.ParameterizedType
        @zc.a
        public Type getOwnerType() {
            return this.f57629b;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f57631d;
        }

        public int hashCode() {
            Type type = this.f57629b;
            return ((type == null ? 0 : type.hashCode()) ^ this.f57630c.hashCode()) ^ this.f57631d.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.f57629b != null) {
                d dVar = d.CURRENT;
                if (dVar.jdkTypeDuplicatesOwnerName()) {
                    sb.append(dVar.typeName(this.f57629b));
                    sb.append('.');
                }
            }
            sb.append(this.f57631d.getName());
            sb.append(m0.less);
            c0 c0Var = s.f57623a;
            f3<Type> f3Var = this.f57630c;
            final d dVar2 = d.CURRENT;
            Objects.requireNonNull(dVar2);
            sb.append(c0Var.k(c4.U(f3Var, new x() { // from class: com.google.common.reflect.t
                @Override // com.google.common.base.x
                public final Object apply(Object obj) {
                    return s.d.this.typeName((Type) obj);
                }
            })));
            sb.append(m0.greater);
            return sb.toString();
        }
    }

    /* compiled from: Types.java */
    private static final class g<D extends GenericDeclaration> {

        /* renamed from: a, reason: collision with root package name */
        private final D f57632a;

        /* renamed from: b, reason: collision with root package name */
        private final String f57633b;

        /* renamed from: c, reason: collision with root package name */
        private final f3<Type> f57634c;

        g(D d5, String str, Type[] typeArr) {
            s.f(typeArr, ProtectedSandApp.s("鹿"));
            d5.getClass();
            this.f57632a = d5;
            str.getClass();
            this.f57633b = str;
            this.f57634c = f3.D(typeArr);
        }

        public Type[] a() {
            return s.r(this.f57634c);
        }

        public D b() {
            return this.f57632a;
        }

        public String c() {
            return this.f57633b;
        }

        public String d() {
            return this.f57633b;
        }

        public boolean equals(@zc.a Object obj) {
            if (!e.f57627a) {
                if (!(obj instanceof TypeVariable)) {
                    return false;
                }
                TypeVariable typeVariable = (TypeVariable) obj;
                return this.f57633b.equals(typeVariable.getName()) && this.f57632a.equals(typeVariable.getGenericDeclaration());
            }
            if (obj == null || !Proxy.isProxyClass(obj.getClass()) || !(Proxy.getInvocationHandler(obj) instanceof h)) {
                return false;
            }
            g gVar = ((h) Proxy.getInvocationHandler(obj)).f57636a;
            return this.f57633b.equals(gVar.f57633b) && this.f57632a.equals(gVar.f57632a) && this.f57634c.equals(gVar.f57634c);
        }

        public int hashCode() {
            return this.f57632a.hashCode() ^ this.f57633b.hashCode();
        }

        public String toString() {
            return this.f57633b;
        }
    }

    /* compiled from: Types.java */
    private static final class h implements InvocationHandler {

        /* renamed from: b, reason: collision with root package name */
        private static final h3<String, Method> f57635b;

        /* renamed from: a, reason: collision with root package name */
        private final g<?> f57636a;

        static {
            h3.b c5 = h3.c();
            for (Method method : g.class.getMethods()) {
                if (method.getDeclaringClass().equals(g.class)) {
                    try {
                        method.setAccessible(true);
                    } catch (AccessControlException unused) {
                    }
                    c5.i(method.getName(), method);
                }
            }
            f57635b = c5.c();
        }

        h(g<?> gVar) {
            this.f57636a = gVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        @zc.a
        public Object invoke(Object obj, Method method, @zc.a Object[] objArr) throws Throwable {
            String name = method.getName();
            Method method2 = f57635b.get(name);
            if (method2 == null) {
                throw new UnsupportedOperationException(name);
            }
            try {
                return method2.invoke(this.f57636a, objArr);
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        }
    }

    /* compiled from: Types.java */
    static final class i implements WildcardType, Serializable {

        /* renamed from: d, reason: collision with root package name */
        private static final long f57637d = 0;

        /* renamed from: b, reason: collision with root package name */
        private final f3<Type> f57638b;

        /* renamed from: c, reason: collision with root package name */
        private final f3<Type> f57639c;

        i(Type[] typeArr, Type[] typeArr2) {
            s.f(typeArr, ProtectedSandApp.s("論"));
            s.f(typeArr2, ProtectedSandApp.s("壟"));
            d dVar = d.CURRENT;
            this.f57638b = dVar.usedInGenericType(typeArr);
            this.f57639c = dVar.usedInGenericType(typeArr2);
        }

        public boolean equals(@zc.a Object obj) {
            if (!(obj instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) obj;
            return this.f57638b.equals(Arrays.asList(wildcardType.getLowerBounds())) && this.f57639c.equals(Arrays.asList(wildcardType.getUpperBounds()));
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            return s.r(this.f57638b);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return s.r(this.f57639c);
        }

        public int hashCode() {
            return this.f57638b.hashCode() ^ this.f57639c.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("弄"));
            e7<Type> it = this.f57638b.iterator();
            while (it.hasNext()) {
                Type next = it.next();
                sb.append(ProtectedSandApp.s("籠"));
                sb.append(d.CURRENT.typeName(next));
            }
            for (Type type : s.g(this.f57639c)) {
                sb.append(ProtectedSandApp.s("聾"));
                sb.append(d.CURRENT.typeName(type));
            }
            return sb.toString();
        }
    }

    private s() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(Type[] typeArr, String str) {
        for (Type type : typeArr) {
            if (type instanceof Class) {
                l0.y(!r2.isPrimitive(), ProtectedSandApp.s("賂"), (Class) type, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Iterable<Type> g(Iterable<Type> iterable) {
        return c4.o(iterable, n0.q(n0.m(Object.class)));
    }

    static Class<?> h(Class<?> cls) {
        return Array.newInstance(cls, 0).getClass();
    }

    @zc.a
    static Type i(Type type) {
        type.getClass();
        AtomicReference atomicReference = new AtomicReference();
        new a(atomicReference).a(type);
        return (Type) atomicReference.get();
    }

    static Type j(Type type) {
        if (!(type instanceof WildcardType)) {
            return d.CURRENT.newArrayType(type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        l0.e(lowerBounds.length <= 1, ProtectedSandApp.s("雷"));
        if (lowerBounds.length == 1) {
            return q(j(lowerBounds[0]));
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        l0.e(upperBounds.length == 1, ProtectedSandApp.s("壘"));
        return o(j(upperBounds[0]));
    }

    static <D extends GenericDeclaration> TypeVariable<D> k(D d5, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        return n(d5, str, typeArr);
    }

    static ParameterizedType l(Class<?> cls, Type... typeArr) {
        return new f(b.JVM_BEHAVIOR.getOwnerType(cls), cls, typeArr);
    }

    static ParameterizedType m(@zc.a Type type, Class<?> cls, Type... typeArr) {
        if (type == null) {
            return l(cls, typeArr);
        }
        typeArr.getClass();
        l0.u(cls.getEnclosingClass() != null, ProtectedSandApp.s("屢"), cls);
        return new f(type, cls, typeArr);
    }

    private static <D extends GenericDeclaration> TypeVariable<D> n(D d5, String str, Type[] typeArr) {
        return (TypeVariable) k.d(TypeVariable.class, new h(new g(d5, str, typeArr)));
    }

    @d9.d
    static WildcardType o(Type type) {
        return new i(new Type[0], new Type[]{type});
    }

    /* JADX INFO: Access modifiers changed from: private */
    @zc.a
    public static Type p(Type[] typeArr) {
        for (Type type : typeArr) {
            Type i4 = i(type);
            if (i4 != null) {
                if (i4 instanceof Class) {
                    Class cls = (Class) i4;
                    if (cls.isPrimitive()) {
                        return cls;
                    }
                }
                return o(i4);
            }
        }
        return null;
    }

    @d9.d
    static WildcardType q(Type type) {
        return new i(new Type[]{type}, new Type[]{Object.class});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Type[] r(Collection<Type> collection) {
        return (Type[]) collection.toArray(new Type[0]);
    }

    static String s(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
