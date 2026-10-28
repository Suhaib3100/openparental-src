package com.google.common.reflect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.c0;
import com.google.common.base.l0;
import com.google.common.base.m0;
import com.google.common.collect.e5;
import com.google.common.collect.e7;
import com.google.common.collect.f3;
import com.google.common.collect.h3;
import com.google.common.collect.j2;
import com.google.common.collect.o1;
import com.google.common.collect.q3;
import com.google.common.reflect.f;
import com.google.common.reflect.n;
import com.google.common.reflect.s;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: TypeToken.java */
@com.google.common.reflect.d
/* loaded from: classes6.dex */
public abstract class p<T> extends l<T> implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    private static final long f57596e = 3637540370352322684L;

    /* renamed from: b, reason: collision with root package name */
    private final Type f57597b;

    /* renamed from: c, reason: collision with root package name */
    @zc.a
    private transient n f57598c;

    /* renamed from: d, reason: collision with root package name */
    @zc.a
    private transient n f57599d;

    /* compiled from: TypeToken.java */
    class a extends f.b<T> {
        a(Method method) {
            super(method);
        }

        @Override // com.google.common.reflect.f.b, com.google.common.reflect.f
        Type[] l0() {
            return p.this.r().l(this.f57576d.getGenericExceptionTypes());
        }

        @Override // com.google.common.reflect.f.b, com.google.common.reflect.f
        Type[] m0() {
            return p.this.u().l(this.f57576d.getGenericParameterTypes());
        }

        @Override // com.google.common.reflect.f.b, com.google.common.reflect.f
        Type n0() {
            return p.this.r().j(this.f57576d.getGenericReturnType());
        }

        @Override // com.google.common.reflect.f
        public p<T> o0() {
            return p.this;
        }

        @Override // com.google.common.reflect.f
        public String toString() {
            String valueOf = String.valueOf(o0());
            String fVar = super.toString();
            return com.google.common.base.h.a(com.google.android.gms.common.internal.b.a(fVar, valueOf.length() + 1), valueOf, ProtectedSandApp.s("濫"), fVar);
        }
    }

    /* compiled from: TypeToken.java */
    class b extends f.a<T> {
        b(Constructor constructor) {
            super(constructor);
        }

        @Override // com.google.common.reflect.f.a, com.google.common.reflect.f
        Type[] l0() {
            return p.this.r().l(this.f57575d.getGenericExceptionTypes());
        }

        @Override // com.google.common.reflect.f.a, com.google.common.reflect.f
        Type[] m0() {
            return p.this.u().l(super.m0());
        }

        @Override // com.google.common.reflect.f.a, com.google.common.reflect.f
        Type n0() {
            return p.this.r().j(super.n0());
        }

        @Override // com.google.common.reflect.f
        public p<T> o0() {
            return p.this;
        }

        @Override // com.google.common.reflect.f
        public String toString() {
            String valueOf = String.valueOf(o0());
            String n4 = c0.p(ProtectedSandApp.s("藍")).n(m0());
            return com.google.common.base.e.a(com.google.android.gms.common.internal.b.a(n4, valueOf.length() + 2), valueOf, ProtectedSandApp.s("襤"), n4, ProtectedSandApp.s("拉"));
        }
    }

    /* compiled from: TypeToken.java */
    class c extends r {
        c() {
        }

        @Override // com.google.common.reflect.r
        void c(GenericArrayType genericArrayType) {
            a(genericArrayType.getGenericComponentType());
        }

        @Override // com.google.common.reflect.r
        void d(ParameterizedType parameterizedType) {
            a(parameterizedType.getActualTypeArguments());
            a(parameterizedType.getOwnerType());
        }

        @Override // com.google.common.reflect.r
        void e(TypeVariable<?> typeVariable) {
            String valueOf = String.valueOf(p.this.f57597b);
            throw new IllegalArgumentException(com.google.common.base.i.a(valueOf.length() + 58, valueOf, ProtectedSandApp.s("臘")));
        }

        @Override // com.google.common.reflect.r
        void f(WildcardType wildcardType) {
            a(wildcardType.getLowerBounds());
            a(wildcardType.getUpperBounds());
        }
    }

    /* compiled from: TypeToken.java */
    class d extends r {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q3.a f57603b;

        d(p pVar, q3.a aVar) {
            this.f57603b = aVar;
        }

        @Override // com.google.common.reflect.r
        void b(Class<?> cls) {
            this.f57603b.a(cls);
        }

        @Override // com.google.common.reflect.r
        void c(GenericArrayType genericArrayType) {
            this.f57603b.a(s.h(p.T(genericArrayType.getGenericComponentType()).w()));
        }

        @Override // com.google.common.reflect.r
        void d(ParameterizedType parameterizedType) {
            this.f57603b.a((Class) parameterizedType.getRawType());
        }

        @Override // com.google.common.reflect.r
        void e(TypeVariable<?> typeVariable) {
            a(typeVariable.getBounds());
        }

        @Override // com.google.common.reflect.r
        void f(WildcardType wildcardType) {
            a(wildcardType.getUpperBounds());
        }
    }

    /* compiled from: TypeToken.java */
    private static class e {

        /* renamed from: a, reason: collision with root package name */
        private final Type[] f57604a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f57605b;

        e(Type[] typeArr, boolean z4) {
            this.f57604a = typeArr;
            this.f57605b = z4;
        }

        boolean a(Type type) {
            for (Type type2 : this.f57604a) {
                boolean J = p.T(type2).J(type);
                boolean z4 = this.f57605b;
                if (J == z4) {
                    return z4;
                }
            }
            return !this.f57605b;
        }

        boolean b(Type type) {
            p<?> T = p.T(type);
            for (Type type2 : this.f57604a) {
                boolean J = T.J(type2);
                boolean z4 = this.f57605b;
                if (J == z4) {
                    return z4;
                }
            }
            return !this.f57605b;
        }
    }

    /* compiled from: TypeToken.java */
    private final class f extends p<T>.k {

        /* renamed from: g, reason: collision with root package name */
        private static final long f57606g = 0;

        /* renamed from: e, reason: collision with root package name */
        @zc.a
        private transient q3<p<? super T>> f57607e;

        private f() {
            super();
        }

        private Object Z3() {
            p pVar = p.this;
            pVar.getClass();
            return new k().W3();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.reflect.p.k, com.google.common.collect.j2, com.google.common.collect.q1
        /* renamed from: T3 */
        public Set<p<? super T>> u3() {
            q3<p<? super T>> q3Var = this.f57607e;
            if (q3Var != null) {
                return q3Var;
            }
            i<p<?>> iVar = i.f57614a;
            iVar.getClass();
            q3<p<? super T>> W = o1.F(new i.c(iVar).d(p.this)).v(j.IGNORE_TYPE_VARIABLE_OR_WILDCARD).W();
            this.f57607e = W;
            return W;
        }

        @Override // com.google.common.reflect.p.k
        public p<T>.k W3() {
            return this;
        }

        @Override // com.google.common.reflect.p.k
        public p<T>.k X3() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("蠟"));
        }

        @Override // com.google.common.reflect.p.k
        public Set<Class<? super T>> Y3() {
            i<Class<?>> iVar = i.f57615b;
            iVar.getClass();
            return q3.A(new i.c(iVar).c(p.this.x()));
        }

        /* synthetic */ f(p pVar, a aVar) {
            this();
        }
    }

    /* compiled from: TypeToken.java */
    private final class g extends p<T>.k {

        /* renamed from: h, reason: collision with root package name */
        private static final long f57609h = 0;

        /* renamed from: e, reason: collision with root package name */
        private final transient p<T>.k f57610e;

        /* renamed from: f, reason: collision with root package name */
        @zc.a
        private transient q3<p<? super T>> f57611f;

        g(p<T>.k kVar) {
            super();
            this.f57610e = kVar;
        }

        private Object Z3() {
            p pVar = p.this;
            pVar.getClass();
            return new k().X3();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.reflect.p.k, com.google.common.collect.j2, com.google.common.collect.q1
        /* renamed from: T3 */
        public Set<p<? super T>> u3() {
            q3<p<? super T>> q3Var = this.f57611f;
            if (q3Var != null) {
                return q3Var;
            }
            q3<p<? super T>> W = o1.F(this.f57610e).v(j.INTERFACE_ONLY).W();
            this.f57611f = W;
            return W;
        }

        @Override // com.google.common.reflect.p.k
        public p<T>.k W3() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("廊"));
        }

        @Override // com.google.common.reflect.p.k
        public p<T>.k X3() {
            return this;
        }

        @Override // com.google.common.reflect.p.k
        public Set<Class<? super T>> Y3() {
            return o1.F(i.f57615b.c(p.this.x())).v(new q()).W();
        }
    }

    /* compiled from: TypeToken.java */
    private static final class h<T> extends p<T> {

        /* renamed from: f, reason: collision with root package name */
        private static final long f57613f = 0;

        h(Type type) {
            super(type, null);
        }
    }

    /* compiled from: TypeToken.java */
    private static abstract class i<K> {

        /* renamed from: a, reason: collision with root package name */
        static final i<p<?>> f57614a = new a();

        /* renamed from: b, reason: collision with root package name */
        static final i<Class<?>> f57615b = new b();

        /* compiled from: TypeToken.java */
        class a extends i<p<?>> {
            a() {
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.p.i
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public Iterable<? extends p<?>> e(p<?> pVar) {
                return pVar.s();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.p.i
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public Class<?> f(p<?> pVar) {
                return pVar.w();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.p.i
            @zc.a
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public p<?> g(p<?> pVar) {
                return pVar.t();
            }
        }

        /* compiled from: TypeToken.java */
        class b extends i<Class<?>> {
            b() {
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.p.i
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public Iterable<? extends Class<?>> e(Class<?> cls) {
                return Arrays.asList(cls.getInterfaces());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.p.i
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public Class<?> f(Class<?> cls) {
                return cls;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.p.i
            @zc.a
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public Class<?> g(Class<?> cls) {
                return cls.getSuperclass();
            }
        }

        /* compiled from: TypeToken.java */
        class c extends e<K> {
            c(i iVar, i iVar2) {
                super(iVar2);
            }

            @Override // com.google.common.reflect.p.i
            f3<K> c(Iterable<? extends K> iterable) {
                f3.a r4 = f3.r();
                for (K k4 : iterable) {
                    if (!f(k4).isInterface()) {
                        r4.j(k4);
                    }
                }
                return super.c(r4.e());
            }

            @Override // com.google.common.reflect.p.i.e, com.google.common.reflect.p.i
            Iterable<? extends K> e(K k4) {
                return q3.I();
            }
        }

        /* compiled from: TypeToken.java */
        class d extends e5<K> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Comparator f57616d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Map f57617e;

            d(Comparator comparator, Map map) {
                this.f57616d = comparator;
                this.f57617e = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.e5, java.util.Comparator
            public int compare(K k4, K k5) {
                Comparator comparator = this.f57616d;
                Object obj = this.f57617e.get(k4);
                Objects.requireNonNull(obj);
                Object obj2 = this.f57617e.get(k5);
                Objects.requireNonNull(obj2);
                return comparator.compare(obj, obj2);
            }
        }

        /* compiled from: TypeToken.java */
        private static class e<K> extends i<K> {

            /* renamed from: c, reason: collision with root package name */
            private final i<K> f57618c;

            e(i<K> iVar) {
                this.f57618c = iVar;
            }

            @Override // com.google.common.reflect.p.i
            Iterable<? extends K> e(K k4) {
                return this.f57618c.e(k4);
            }

            @Override // com.google.common.reflect.p.i
            Class<?> f(K k4) {
                return this.f57618c.f(k4);
            }

            @Override // com.google.common.reflect.p.i
            @zc.a
            K g(K k4) {
                return this.f57618c.g(k4);
            }
        }

        private i() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @f9.a
        private int b(K k4, Map<? super K, Integer> map) {
            Integer num = map.get(k4);
            if (num != null) {
                return num.intValue();
            }
            boolean isInterface = f(k4).isInterface();
            Iterator<? extends K> it = e(k4).iterator();
            int i4 = isInterface;
            while (it.hasNext()) {
                i4 = Math.max(i4, b(it.next(), map));
            }
            K g4 = g(k4);
            int i5 = i4;
            if (g4 != null) {
                i5 = Math.max(i4, b(g4, map));
            }
            int i6 = i5 + 1;
            map.put(k4, Integer.valueOf(i6));
            return i6;
        }

        private static <K, V> f3<K> h(Map<K, V> map, Comparator<? super V> comparator) {
            return f3.b0(new d(comparator, map), map.keySet());
        }

        final i<K> a() {
            return new c(this);
        }

        f3<K> c(Iterable<? extends K> iterable) {
            HashMap hashMap = new HashMap();
            Iterator<? extends K> it = iterable.iterator();
            while (it.hasNext()) {
                b(it.next(), hashMap);
            }
            return h(hashMap, e5.c0().v0());
        }

        final f3<K> d(K k4) {
            return c(f3.I(k4));
        }

        abstract Iterable<? extends K> e(K k4);

        abstract Class<?> f(K k4);

        @zc.a
        abstract K g(K k4);

        i(a aVar) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TypeToken.java */
    private static abstract class j implements m0<p<?>> {
        public static final j IGNORE_TYPE_VARIABLE_OR_WILDCARD = new a(ProtectedSandApp.s("爐"), 0);
        public static final j INTERFACE_ONLY = new b(ProtectedSandApp.s("盧"), 1);
        private static final /* synthetic */ j[] $VALUES = $values();

        /* compiled from: TypeToken.java */
        enum a extends j {
            a(String str, int i4) {
                super(str, i4, null);
            }

            @Override // com.google.common.base.m0
            public boolean apply(p<?> pVar) {
                return ((((p) pVar).f57597b instanceof TypeVariable) || (((p) pVar).f57597b instanceof WildcardType)) ? false : true;
            }
        }

        /* compiled from: TypeToken.java */
        enum b extends j {
            b(String str, int i4) {
                super(str, i4, null);
            }

            @Override // com.google.common.base.m0
            public boolean apply(p<?> pVar) {
                return pVar.w().isInterface();
            }
        }

        private static /* synthetic */ j[] $values() {
            return new j[]{IGNORE_TYPE_VARIABLE_OR_WILDCARD, INTERFACE_ONLY};
        }

        private j(String str, int i4) {
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) $VALUES.clone();
        }

        /* synthetic */ j(String str, int i4, a aVar) {
            this(str, i4);
        }
    }

    /* compiled from: TypeToken.java */
    public class k extends j2<p<? super T>> implements Serializable {

        /* renamed from: d, reason: collision with root package name */
        private static final long f57619d = 0;

        /* renamed from: b, reason: collision with root package name */
        @zc.a
        private transient q3<p<? super T>> f57620b;

        k() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.j2, com.google.common.collect.q1
        /* renamed from: T3 */
        public Set<p<? super T>> u3() {
            q3<p<? super T>> q3Var = this.f57620b;
            if (q3Var != null) {
                return q3Var;
            }
            q3<p<? super T>> W = o1.F(i.f57614a.d(p.this)).v(j.IGNORE_TYPE_VARIABLE_OR_WILDCARD).W();
            this.f57620b = W;
            return W;
        }

        public p<T>.k W3() {
            return new f(p.this, null);
        }

        public p<T>.k X3() {
            return new g(this);
        }

        public Set<Class<? super T>> Y3() {
            return q3.A(i.f57615b.c(p.this.x()));
        }
    }

    /* synthetic */ p(Type type, a aVar) {
        this(type);
    }

    private p<? super T> B(Class<? super T> cls, Type[] typeArr) {
        for (Type type : typeArr) {
            p<?> T = T(type);
            if (T.J(cls)) {
                return (p<? super T>) T.A(cls);
            }
        }
        String valueOf = String.valueOf(cls);
        String valueOf2 = String.valueOf(this);
        throw new IllegalArgumentException(com.google.common.base.h.a(valueOf2.length() + valueOf.length() + 23, valueOf, ProtectedSandApp.s("浪"), valueOf2));
    }

    private boolean E(Type type, TypeVariable<?> typeVariable) {
        if (this.f57597b.equals(type)) {
            return true;
        }
        if (!(type instanceof WildcardType)) {
            return l(this.f57597b).equals(l(type));
        }
        WildcardType j4 = j(typeVariable, (WildcardType) type);
        return n(j4.getUpperBounds()).b(this.f57597b) && n(j4.getLowerBounds()).a(this.f57597b);
    }

    private boolean G(Type type) {
        Iterator<p<? super T>> it = new k().iterator();
        while (it.hasNext()) {
            Type v4 = it.next().v();
            if (v4 != null && T(v4).J(type)) {
                return true;
            }
        }
        return false;
    }

    private boolean K(GenericArrayType genericArrayType) {
        Type type = this.f57597b;
        if (!(type instanceof Class)) {
            if (type instanceof GenericArrayType) {
                return T(((GenericArrayType) type).getGenericComponentType()).J(genericArrayType.getGenericComponentType());
            }
            return false;
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            return S(cls.getComponentType()).J(genericArrayType.getGenericComponentType());
        }
        return false;
    }

    private boolean L(ParameterizedType parameterizedType) {
        Class<? super Object> w4 = T(parameterizedType).w();
        if (!Y(w4)) {
            return false;
        }
        TypeVariable<Class<? super Object>>[] typeParameters = w4.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i4 = 0; i4 < typeParameters.length; i4++) {
            if (!T(r().j(typeParameters[i4])).E(actualTypeArguments[i4], typeParameters[i4])) {
                return false;
            }
        }
        return Modifier.isStatic(((Class) parameterizedType.getRawType()).getModifiers()) || parameterizedType.getOwnerType() == null || G(parameterizedType.getOwnerType());
    }

    private boolean O(GenericArrayType genericArrayType) {
        Type type = this.f57597b;
        if (type instanceof Class) {
            Class cls = (Class) type;
            return !cls.isArray() ? cls.isAssignableFrom(Object[].class) : T(genericArrayType.getGenericComponentType()).J(cls.getComponentType());
        }
        if (type instanceof GenericArrayType) {
            return T(genericArrayType.getGenericComponentType()).J(((GenericArrayType) this.f57597b).getGenericComponentType());
        }
        return false;
    }

    private boolean P() {
        return com.google.common.primitives.r.c().contains(this.f57597b);
    }

    private static Type R(Type type) {
        return s.d.JAVA7.newArrayType(type);
    }

    public static <T> p<T> S(Class<T> cls) {
        return new h(cls, null);
    }

    public static p<?> T(Type type) {
        return new h(type, null);
    }

    private p<?> V(Type type) {
        p<?> T = T(r().j(type));
        T.f57599d = this.f57599d;
        T.f57598c = this.f57598c;
        return T;
    }

    private Type X(Class<?> cls) {
        if ((this.f57597b instanceof Class) && (cls.getTypeParameters().length == 0 || w().getTypeParameters().length != 0)) {
            return cls;
        }
        p Z = Z(cls);
        return new n().n(Z.A(w()).f57597b, this.f57597b).j(Z.f57597b);
    }

    private boolean Y(Class<?> cls) {
        e7<Class<? super T>> it = x().iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(it.next())) {
                return true;
            }
        }
        return false;
    }

    @d9.d
    static <T> p<? extends T> Z(Class<T> cls) {
        if (cls.isArray()) {
            return (p<? extends T>) T(s.j(Z(cls.getComponentType()).f57597b));
        }
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        Type type = (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) ? null : Z(cls.getEnclosingClass()).f57597b;
        return (typeParameters.length > 0 || !(type == null || type == cls.getEnclosingClass())) ? (p<? extends T>) T(s.m(type, cls, typeParameters)) : S(cls);
    }

    private static e f(Type[] typeArr) {
        return new e(typeArr, true);
    }

    @zc.a
    private p<? super T> g(Type type) {
        p<? super T> pVar = (p<? super T>) T(type);
        if (pVar.w().isInterface()) {
            return null;
        }
        return pVar;
    }

    private f3<p<? super T>> h(Type[] typeArr) {
        f3.a r4 = f3.r();
        for (Type type : typeArr) {
            p<?> T = T(type);
            if (T.w().isInterface()) {
                r4.j(T);
            }
        }
        return r4.e();
    }

    private static Type i(TypeVariable<?> typeVariable, Type type) {
        return type instanceof WildcardType ? j(typeVariable, (WildcardType) type) : l(type);
    }

    private static WildcardType j(TypeVariable<?> typeVariable, WildcardType wildcardType) {
        Type[] bounds = typeVariable.getBounds();
        ArrayList arrayList = new ArrayList();
        for (Type type : wildcardType.getUpperBounds()) {
            if (!f(bounds).a(type)) {
                arrayList.add(l(type));
            }
        }
        return new s.i(wildcardType.getLowerBounds(), (Type[]) arrayList.toArray(new Type[0]));
    }

    private static ParameterizedType k(ParameterizedType parameterizedType) {
        Class cls = (Class) parameterizedType.getRawType();
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i4 = 0; i4 < actualTypeArguments.length; i4++) {
            actualTypeArguments[i4] = i(typeParameters[i4], actualTypeArguments[i4]);
        }
        return s.m(parameterizedType.getOwnerType(), cls, actualTypeArguments);
    }

    private static Type l(Type type) {
        return type instanceof ParameterizedType ? k((ParameterizedType) type) : type instanceof GenericArrayType ? s.j(l(((GenericArrayType) type).getGenericComponentType())) : type;
    }

    private static e n(Type[] typeArr) {
        return new e(typeArr, false);
    }

    private p<? extends T> o(Class<?> cls) {
        Class<?> componentType = cls.getComponentType();
        if (componentType != null) {
            p<?> q4 = q();
            Objects.requireNonNull(q4);
            return (p<? extends T>) T(s.d.JAVA7.newArrayType(q4.y(componentType).f57597b));
        }
        String valueOf = String.valueOf(cls);
        String valueOf2 = String.valueOf(this);
        throw new IllegalArgumentException(com.google.common.base.h.a(valueOf2.length() + valueOf.length() + 36, valueOf, ProtectedSandApp.s("狼"), valueOf2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private p<? super T> p(Class<? super T> cls) {
        p<?> q4 = q();
        if (q4 != 0) {
            Class<?> componentType = cls.getComponentType();
            Objects.requireNonNull(componentType);
            return (p<? super T>) T(s.d.JAVA7.newArrayType(q4.A(componentType).f57597b));
        }
        String valueOf = String.valueOf(cls);
        String valueOf2 = String.valueOf(this);
        throw new IllegalArgumentException(com.google.common.base.h.a(valueOf2.length() + valueOf.length() + 23, valueOf, ProtectedSandApp.s("浪"), valueOf2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public n r() {
        n nVar = this.f57599d;
        if (nVar != null) {
            return nVar;
        }
        n d5 = n.d(this.f57597b);
        this.f57599d = d5;
        return d5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public n u() {
        n nVar = this.f57598c;
        if (nVar != null) {
            return nVar;
        }
        n f4 = n.f(this.f57597b);
        this.f57598c = f4;
        return f4;
    }

    @zc.a
    private Type v() {
        Type type = this.f57597b;
        if (type instanceof ParameterizedType) {
            return ((ParameterizedType) type).getOwnerType();
        }
        if (type instanceof Class) {
            return ((Class) type).getEnclosingClass();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public q3<Class<? super T>> x() {
        q3.a r4 = q3.r();
        new d(this, r4).a(this.f57597b);
        return r4.e();
    }

    private p<? extends T> z(Class<?> cls, Type[] typeArr) {
        if (typeArr.length > 0) {
            return (p<? extends T>) T(typeArr[0]).y(cls);
        }
        String valueOf = String.valueOf(cls);
        String valueOf2 = String.valueOf(this);
        throw new IllegalArgumentException(com.google.common.base.h.a(valueOf2.length() + valueOf.length() + 21, valueOf, ProtectedSandApp.s("郎"), valueOf2));
    }

    public final p<? super T> A(Class<? super T> cls) {
        l0.y(Y(cls), ProtectedSandApp.s("來"), cls, this);
        Type type = this.f57597b;
        return type instanceof TypeVariable ? B(cls, ((TypeVariable) type).getBounds()) : type instanceof WildcardType ? B(cls, ((WildcardType) type).getUpperBounds()) : cls.isArray() ? p(cls) : (p<? super T>) V(Z(cls).f57597b);
    }

    public final Type C() {
        return this.f57597b;
    }

    public final p<T>.k D() {
        return new k();
    }

    public final boolean F() {
        return q() != null;
    }

    public final boolean H() {
        Type type = this.f57597b;
        return (type instanceof Class) && ((Class) type).isPrimitive();
    }

    public final boolean I(p<?> pVar) {
        return J(pVar.f57597b);
    }

    public final boolean J(Type type) {
        type.getClass();
        if (type instanceof WildcardType) {
            return f(((WildcardType) type).getLowerBounds()).b(this.f57597b);
        }
        Type type2 = this.f57597b;
        if (type2 instanceof WildcardType) {
            return f(((WildcardType) type2).getUpperBounds()).a(type);
        }
        if (type2 instanceof TypeVariable) {
            return type2.equals(type) || f(((TypeVariable) this.f57597b).getBounds()).a(type);
        }
        if (type2 instanceof GenericArrayType) {
            return T(type).O((GenericArrayType) this.f57597b);
        }
        if (type instanceof Class) {
            return Y((Class) type);
        }
        if (type instanceof ParameterizedType) {
            return L((ParameterizedType) type);
        }
        if (type instanceof GenericArrayType) {
            return K((GenericArrayType) type);
        }
        return false;
    }

    public final boolean M(p<?> pVar) {
        return pVar.J(this.f57597b);
    }

    public final boolean N(Type type) {
        return T(type).J(this.f57597b);
    }

    @d9.a
    public final com.google.common.reflect.f<T, Object> Q(Method method) {
        l0.y(Y(method.getDeclaringClass()), ProtectedSandApp.s("冷"), method, this);
        return new a(method);
    }

    @f9.a
    final p<T> U() {
        new c().a(this.f57597b);
        return this;
    }

    public final p<?> W(Type type) {
        type.getClass();
        return T(u().j(type));
    }

    public final p<T> a0() {
        return P() ? S(com.google.common.primitives.r.e((Class) this.f57597b)) : this;
    }

    public final <X> p<T> b0(m<X> mVar, p<X> pVar) {
        return new h(new n().o(h3.u(new n.d(mVar.f57584b), pVar.f57597b)).j(this.f57597b), null);
    }

    public final <X> p<T> c0(m<X> mVar, Class<X> cls) {
        return b0(mVar, S(cls));
    }

    public final p<T> d0() {
        return H() ? S(com.google.common.primitives.r.f((Class) this.f57597b)) : this;
    }

    protected Object e0() {
        return T(new n().j(this.f57597b));
    }

    public boolean equals(@zc.a Object obj) {
        if (obj instanceof p) {
            return this.f57597b.equals(((p) obj).f57597b);
        }
        return false;
    }

    public int hashCode() {
        return this.f57597b.hashCode();
    }

    @d9.a
    public final com.google.common.reflect.f<T, T> m(Constructor<?> constructor) {
        l0.y(constructor.getDeclaringClass() == w(), ProtectedSandApp.s("冷"), constructor, w());
        return new b(constructor);
    }

    @zc.a
    public final p<?> q() {
        Type i4 = s.i(this.f57597b);
        if (i4 == null) {
            return null;
        }
        return T(i4);
    }

    final f3<p<? super T>> s() {
        Type type = this.f57597b;
        if (type instanceof TypeVariable) {
            return h(((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return h(((WildcardType) type).getUpperBounds());
        }
        f3.a r4 = f3.r();
        for (Type type2 : w().getGenericInterfaces()) {
            r4.j(V(type2));
        }
        return r4.e();
    }

    @zc.a
    final p<? super T> t() {
        Type type = this.f57597b;
        if (type instanceof TypeVariable) {
            return g(((TypeVariable) type).getBounds()[0]);
        }
        if (type instanceof WildcardType) {
            return g(((WildcardType) type).getUpperBounds()[0]);
        }
        Type genericSuperclass = w().getGenericSuperclass();
        if (genericSuperclass == null) {
            return null;
        }
        return (p<? super T>) V(genericSuperclass);
    }

    public String toString() {
        return s.s(this.f57597b);
    }

    public final Class<? super T> w() {
        return x().iterator().next();
    }

    public final p<? extends T> y(Class<?> cls) {
        l0.u(!(this.f57597b instanceof TypeVariable), ProtectedSandApp.s("勞"), this);
        Type type = this.f57597b;
        if (type instanceof WildcardType) {
            return z(cls, ((WildcardType) type).getLowerBounds());
        }
        if (F()) {
            return o(cls);
        }
        l0.y(w().isAssignableFrom(cls), ProtectedSandApp.s("擄"), cls, this);
        p<? extends T> pVar = (p<? extends T>) T(X(cls));
        pVar.getClass();
        l0.y(pVar.J(this.f57597b), ProtectedSandApp.s("櫓"), pVar, this);
        return pVar;
    }

    protected p() {
        Type a5 = a();
        this.f57597b = a5;
        l0.x0(!(a5 instanceof TypeVariable), ProtectedSandApp.s("朗"), a5);
    }

    protected p(Class<?> cls) {
        Type a5 = a();
        if (a5 instanceof Class) {
            this.f57597b = a5;
        } else {
            this.f57597b = n.d(cls).j(a5);
        }
    }

    private p(Type type) {
        type.getClass();
        this.f57597b = type;
    }
}
