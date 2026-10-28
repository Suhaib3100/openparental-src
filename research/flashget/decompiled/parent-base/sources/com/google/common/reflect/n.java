package com.google.common.reflect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.c0;
import com.google.common.base.l0;
import com.google.common.collect.h3;
import com.google.common.reflect.s;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.text.m0;

/* compiled from: TypeResolver.java */
@com.google.common.reflect.d
/* loaded from: classes6.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final c f57585a;

    /* compiled from: TypeResolver.java */
    class a extends r {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f57586b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Type f57587c;

        a(Map map, Type type) {
            this.f57586b = map;
            this.f57587c = type;
        }

        @Override // com.google.common.reflect.r
        void b(Class<?> cls) {
            if (this.f57587c instanceof WildcardType) {
                return;
            }
            String valueOf = String.valueOf(cls);
            String valueOf2 = String.valueOf(this.f57587c);
            throw new IllegalArgumentException(com.google.common.base.e.a(valueOf2.length() + valueOf.length() + 25, ProtectedSandApp.s("珞"), valueOf, ProtectedSandApp.s("落"), valueOf2));
        }

        @Override // com.google.common.reflect.r
        void c(GenericArrayType genericArrayType) {
            Type type = this.f57587c;
            if (type instanceof WildcardType) {
                return;
            }
            Type i4 = s.i(type);
            l0.u(i4 != null, ProtectedSandApp.s("酪"), this.f57587c);
            n.g(this.f57586b, genericArrayType.getGenericComponentType(), i4);
        }

        @Override // com.google.common.reflect.r
        void d(ParameterizedType parameterizedType) {
            Type type = this.f57587c;
            if (type instanceof WildcardType) {
                return;
            }
            ParameterizedType parameterizedType2 = (ParameterizedType) n.e(ParameterizedType.class, type);
            if (parameterizedType.getOwnerType() != null && parameterizedType2.getOwnerType() != null) {
                n.g(this.f57586b, parameterizedType.getOwnerType(), parameterizedType2.getOwnerType());
            }
            l0.y(parameterizedType.getRawType().equals(parameterizedType2.getRawType()), ProtectedSandApp.s("駱"), parameterizedType, this.f57587c);
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
            l0.y(actualTypeArguments.length == actualTypeArguments2.length, ProtectedSandApp.s("亂"), parameterizedType, parameterizedType2);
            for (int i4 = 0; i4 < actualTypeArguments.length; i4++) {
                n.g(this.f57586b, actualTypeArguments[i4], actualTypeArguments2[i4]);
            }
        }

        @Override // com.google.common.reflect.r
        void e(TypeVariable<?> typeVariable) {
            this.f57586b.put(new d(typeVariable), this.f57587c);
        }

        @Override // com.google.common.reflect.r
        void f(WildcardType wildcardType) {
            Type type = this.f57587c;
            if (type instanceof WildcardType) {
                WildcardType wildcardType2 = (WildcardType) type;
                Type[] upperBounds = wildcardType.getUpperBounds();
                Type[] upperBounds2 = wildcardType2.getUpperBounds();
                Type[] lowerBounds = wildcardType.getLowerBounds();
                Type[] lowerBounds2 = wildcardType2.getLowerBounds();
                l0.y(upperBounds.length == upperBounds2.length && lowerBounds.length == lowerBounds2.length, ProtectedSandApp.s("卵"), wildcardType, this.f57587c);
                for (int i4 = 0; i4 < upperBounds.length; i4++) {
                    n.g(this.f57586b, upperBounds[i4], upperBounds2[i4]);
                }
                for (int i5 = 0; i5 < lowerBounds.length; i5++) {
                    n.g(this.f57586b, lowerBounds[i5], lowerBounds2[i5]);
                }
            }
        }
    }

    /* compiled from: TypeResolver.java */
    private static final class b extends r {

        /* renamed from: b, reason: collision with root package name */
        private final Map<d, Type> f57588b = new HashMap();

        private b() {
        }

        static h3<d, Type> g(Type type) {
            type.getClass();
            b bVar = new b();
            bVar.a(type);
            return h3.i(bVar.f57588b);
        }

        private void h(d dVar, Type type) {
            if (this.f57588b.containsKey(dVar)) {
                return;
            }
            Type type2 = type;
            while (type2 != null) {
                if (dVar.a(type2)) {
                    while (type != null) {
                        type = this.f57588b.remove(d.c(type));
                    }
                    return;
                }
                type2 = this.f57588b.get(d.c(type2));
            }
            this.f57588b.put(dVar, type);
        }

        @Override // com.google.common.reflect.r
        void b(Class<?> cls) {
            a(cls.getGenericSuperclass());
            a(cls.getGenericInterfaces());
        }

        @Override // com.google.common.reflect.r
        void d(ParameterizedType parameterizedType) {
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            l0.g0(typeParameters.length == actualTypeArguments.length);
            for (int i4 = 0; i4 < typeParameters.length; i4++) {
                h(new d(typeParameters[i4]), actualTypeArguments[i4]);
            }
            a(cls);
            a(parameterizedType.getOwnerType());
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

    /* compiled from: TypeResolver.java */
    static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final TypeVariable<?> f57592a;

        d(TypeVariable<?> typeVariable) {
            typeVariable.getClass();
            this.f57592a = typeVariable;
        }

        private boolean b(TypeVariable<?> typeVariable) {
            return this.f57592a.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && this.f57592a.getName().equals(typeVariable.getName());
        }

        @zc.a
        static d c(Type type) {
            if (type instanceof TypeVariable) {
                return new d((TypeVariable) type);
            }
            return null;
        }

        boolean a(Type type) {
            if (type instanceof TypeVariable) {
                return b((TypeVariable) type);
            }
            return false;
        }

        public boolean equals(@zc.a Object obj) {
            if (obj instanceof d) {
                return b(((d) obj).f57592a);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f57592a.getGenericDeclaration(), this.f57592a.getName()});
        }

        public String toString() {
            return this.f57592a.toString();
        }
    }

    /* compiled from: TypeResolver.java */
    private static class e {

        /* renamed from: b, reason: collision with root package name */
        static final e f57593b = new e();

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f57594a;

        /* compiled from: TypeResolver.java */
        class a extends e {

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ TypeVariable f57595c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, AtomicInteger atomicInteger, TypeVariable typeVariable) {
                super(atomicInteger, null);
                this.f57595c = typeVariable;
            }

            @Override // com.google.common.reflect.n.e
            TypeVariable<?> b(Type[] typeArr) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(typeArr));
                linkedHashSet.addAll(Arrays.asList(this.f57595c.getBounds()));
                if (linkedHashSet.size() > 1) {
                    linkedHashSet.remove(Object.class);
                }
                return super.b((Type[]) linkedHashSet.toArray(new Type[0]));
            }
        }

        /* synthetic */ e(AtomicInteger atomicInteger, a aVar) {
            this(atomicInteger);
        }

        @zc.a
        private Type c(@zc.a Type type) {
            if (type == null) {
                return null;
            }
            return a(type);
        }

        private e d(TypeVariable<?> typeVariable) {
            return new a(this, this.f57594a, typeVariable);
        }

        private e e() {
            return new e(this.f57594a);
        }

        final Type a(Type type) {
            type.getClass();
            if (type instanceof Class) {
                return type;
            }
            if (type instanceof TypeVariable) {
                return type;
            }
            if (type instanceof GenericArrayType) {
                return s.j(e().a(((GenericArrayType) type).getGenericComponentType()));
            }
            if (!(type instanceof ParameterizedType)) {
                if (!(type instanceof WildcardType)) {
                    throw new AssertionError(ProtectedSandApp.s("爛"));
                }
                WildcardType wildcardType = (WildcardType) type;
                return wildcardType.getLowerBounds().length == 0 ? b(wildcardType.getUpperBounds()) : type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable<?>[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            for (int i4 = 0; i4 < actualTypeArguments.length; i4++) {
                actualTypeArguments[i4] = d(typeParameters[i4]).a(actualTypeArguments[i4]);
            }
            return s.m(e().c(parameterizedType.getOwnerType()), cls, actualTypeArguments);
        }

        TypeVariable<?> b(Type[] typeArr) {
            int incrementAndGet = this.f57594a.incrementAndGet();
            String n4 = c0.o(m0.amp).n(typeArr);
            StringBuilder sb = new StringBuilder(com.google.android.gms.common.internal.b.a(n4, 33));
            sb.append(ProtectedSandApp.s("蘭"));
            sb.append(incrementAndGet);
            sb.append(ProtectedSandApp.s("鸞"));
            sb.append(n4);
            return s.k(e.class, sb.toString(), typeArr);
        }

        private e() {
            this(new AtomicInteger());
        }

        private e(AtomicInteger atomicInteger) {
            this.f57594a = atomicInteger;
        }
    }

    /* synthetic */ n(c cVar, a aVar) {
        this(cVar);
    }

    static n d(Type type) {
        return new n().o(b.g(type));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T e(Class<T> cls, Object obj) {
        try {
            return cls.cast(obj);
        } catch (ClassCastException unused) {
            String valueOf = String.valueOf(obj);
            String simpleName = cls.getSimpleName();
            throw new IllegalArgumentException(com.google.common.base.h.a(simpleName.length() + valueOf.length() + 10, valueOf, ProtectedSandApp.s("嵐"), simpleName));
        }
    }

    static n f(Type type) {
        return new n().o(b.g(e.f57593b.a(type)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(Map<d, Type> map, Type type, Type type2) {
        if (type.equals(type2)) {
            return;
        }
        new a(map, type2).a(type);
    }

    private Type h(GenericArrayType genericArrayType) {
        return s.j(j(genericArrayType.getGenericComponentType()));
    }

    private ParameterizedType i(ParameterizedType parameterizedType) {
        Type ownerType = parameterizedType.getOwnerType();
        return s.m(ownerType == null ? null : j(ownerType), (Class) j(parameterizedType.getRawType()), k(parameterizedType.getActualTypeArguments()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Type[] k(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i4 = 0; i4 < typeArr.length; i4++) {
            typeArr2[i4] = j(typeArr[i4]);
        }
        return typeArr2;
    }

    private WildcardType m(WildcardType wildcardType) {
        return new s.i(k(wildcardType.getLowerBounds()), k(wildcardType.getUpperBounds()));
    }

    public Type j(Type type) {
        type.getClass();
        return type instanceof TypeVariable ? this.f57585a.a((TypeVariable) type) : type instanceof ParameterizedType ? i((ParameterizedType) type) : type instanceof GenericArrayType ? h((GenericArrayType) type) : type instanceof WildcardType ? m((WildcardType) type) : type;
    }

    Type[] l(Type[] typeArr) {
        for (int i4 = 0; i4 < typeArr.length; i4++) {
            typeArr[i4] = j(typeArr[i4]);
        }
        return typeArr;
    }

    public n n(Type type, Type type2) {
        HashMap hashMap = new HashMap();
        type.getClass();
        type2.getClass();
        g(hashMap, type, type2);
        return o(hashMap);
    }

    n o(Map<d, ? extends Type> map) {
        return new n(this.f57585a.c(map));
    }

    /* compiled from: TypeResolver.java */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private final h3<d, Type> f57589a;

        /* compiled from: TypeResolver.java */
        class a extends c {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TypeVariable f57590b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ c f57591c;

            a(c cVar, TypeVariable typeVariable, c cVar2) {
                this.f57590b = typeVariable;
                this.f57591c = cVar2;
            }

            @Override // com.google.common.reflect.n.c
            public Type b(TypeVariable<?> typeVariable, c cVar) {
                return typeVariable.getGenericDeclaration().equals(this.f57590b.getGenericDeclaration()) ? typeVariable : this.f57591c.b(typeVariable, cVar);
            }
        }

        c() {
            this.f57589a = h3.t();
        }

        final Type a(TypeVariable<?> typeVariable) {
            return b(typeVariable, new a(this, typeVariable, this));
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.reflect.GenericDeclaration] */
        Type b(TypeVariable<?> typeVariable, c cVar) {
            Type type = this.f57589a.get(new d(typeVariable));
            a aVar = null;
            if (type != null) {
                return new n(cVar, aVar).j(type);
            }
            Type[] bounds = typeVariable.getBounds();
            if (bounds.length == 0) {
                return typeVariable;
            }
            Type[] k4 = new n(cVar, aVar).k(bounds);
            return (s.e.f57627a && Arrays.equals(bounds, k4)) ? typeVariable : s.k(typeVariable.getGenericDeclaration(), typeVariable.getName(), k4);
        }

        final c c(Map<d, ? extends Type> map) {
            h3.b c5 = h3.c();
            c5.l(this.f57589a);
            for (Map.Entry<d, ? extends Type> entry : map.entrySet()) {
                d key = entry.getKey();
                Type value = entry.getValue();
                l0.u(!key.a(value), ProtectedSandApp.s("欄"), key);
                c5.i(key, value);
            }
            return new c(c5.d());
        }

        private c(h3<d, Type> h3Var) {
            this.f57589a = h3Var;
        }
    }

    public n() {
        this.f57585a = new c();
    }

    private n(c cVar) {
        this.f57585a = cVar;
    }
}
