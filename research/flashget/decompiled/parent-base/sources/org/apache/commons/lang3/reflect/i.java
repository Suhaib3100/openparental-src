package org.apache.commons.lang3.reflect;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.text.m0;
import org.apache.commons.lang3.k1;
import org.apache.commons.lang3.p0;
import org.apache.commons.lang3.s;

/* compiled from: TypeUtils.java */
/* loaded from: classes6.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static final WildcardType f86087a = new d().d(Object.class).a();

    /* compiled from: TypeUtils.java */
    private static final class b implements GenericArrayType {

        /* renamed from: b, reason: collision with root package name */
        private final Type f86088b;

        public boolean equals(Object obj) {
            return obj == this || ((obj instanceof GenericArrayType) && i.k(this, (GenericArrayType) obj));
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f86088b;
        }

        public int hashCode() {
            return this.f86088b.hashCode() | 1072;
        }

        public String toString() {
            return i.Z(this);
        }

        private b(Type type) {
            this.f86088b = type;
        }
    }

    /* compiled from: TypeUtils.java */
    private static final class c implements ParameterizedType {

        /* renamed from: b, reason: collision with root package name */
        private final Class<?> f86089b;

        /* renamed from: c, reason: collision with root package name */
        private final Type f86090c;

        /* renamed from: d, reason: collision with root package name */
        private final Type[] f86091d;

        public boolean equals(Object obj) {
            return obj == this || ((obj instanceof ParameterizedType) && i.l(this, (ParameterizedType) obj));
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f86091d.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f86090c;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f86089b;
        }

        public int hashCode() {
            return ((((this.f86089b.hashCode() | 1136) << 4) | Objects.hashCode(this.f86090c)) << 8) | Arrays.hashCode(this.f86091d);
        }

        public String toString() {
            return i.Z(this);
        }

        private c(Class<?> cls, Type type, Type[] typeArr) {
            this.f86089b = cls;
            this.f86090c = type;
            this.f86091d = (Type[]) Arrays.copyOf(typeArr, typeArr.length, Type[].class);
        }
    }

    /* compiled from: TypeUtils.java */
    public static class d implements org.apache.commons.lang3.builder.a<WildcardType> {

        /* renamed from: b, reason: collision with root package name */
        private Type[] f86092b;

        /* renamed from: c, reason: collision with root package name */
        private Type[] f86093c;

        private d() {
        }

        @Override // org.apache.commons.lang3.builder.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public WildcardType a() {
            return new e(this.f86092b, this.f86093c);
        }

        public d c(Type... typeArr) {
            this.f86093c = typeArr;
            return this;
        }

        public d d(Type... typeArr) {
            this.f86092b = typeArr;
            return this;
        }

        d(a aVar) {
        }
    }

    /* compiled from: TypeUtils.java */
    private static final class e implements WildcardType {

        /* renamed from: b, reason: collision with root package name */
        private final Type[] f86094b;

        /* renamed from: c, reason: collision with root package name */
        private final Type[] f86095c;

        public boolean equals(Object obj) {
            return obj == this || ((obj instanceof WildcardType) && i.n(this, (WildcardType) obj));
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            return (Type[]) this.f86095c.clone();
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return (Type[]) this.f86094b.clone();
        }

        public int hashCode() {
            return ((Arrays.hashCode(this.f86094b) | 18688) << 8) | Arrays.hashCode(this.f86095c);
        }

        public String toString() {
            return i.Z(this);
        }

        private e(Type[] typeArr, Type[] typeArr2) {
            Type[] typeArr3 = org.apache.commons.lang3.e.f85971w;
            this.f86094b = (Type[]) p0.t(typeArr, typeArr3);
            this.f86095c = typeArr2 == null ? typeArr3 : typeArr2;
        }
    }

    private static Map<TypeVariable<?>, Type> A(Class<?> cls, Class<?> cls2, Map<TypeVariable<?>, Type> map) {
        if (!G(cls, cls2)) {
            return null;
        }
        if (cls.isPrimitive()) {
            if (cls2.isPrimitive()) {
                return new HashMap();
            }
            cls = s.Y(cls);
        }
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        return cls2.equals(cls) ? hashMap : E(u(cls, cls2), cls2, hashMap);
    }

    public static Map<TypeVariable<?>, Type> B(ParameterizedType parameterizedType) {
        return C(parameterizedType, y(parameterizedType), null);
    }

    private static Map<TypeVariable<?>, Type> C(ParameterizedType parameterizedType, Class<?> cls, Map<TypeVariable<?>, Type> map) {
        Map<TypeVariable<?>, Type> hashMap;
        Class<?> y4 = y(parameterizedType);
        if (!G(y4, cls)) {
            return null;
        }
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            ParameterizedType parameterizedType2 = (ParameterizedType) ownerType;
            hashMap = C(parameterizedType2, y(parameterizedType2), map);
        } else {
            hashMap = map == null ? new HashMap<>() : new HashMap(map);
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        TypeVariable<Class<?>>[] typeParameters = y4.getTypeParameters();
        for (int i4 = 0; i4 < typeParameters.length; i4++) {
            Type type = actualTypeArguments[i4];
            hashMap.put(typeParameters[i4], hashMap.getOrDefault(type, type));
        }
        return cls.equals(y4) ? hashMap : E(u(y4, cls), cls, hashMap);
    }

    public static Map<TypeVariable<?>, Type> D(Type type, Class<?> cls) {
        return E(type, cls, null);
    }

    private static Map<TypeVariable<?>, Type> E(Type type, Class<?> cls, Map<TypeVariable<?>, Type> map) {
        if (type instanceof Class) {
            return A((Class) type, cls, map);
        }
        if (type instanceof ParameterizedType) {
            return C((ParameterizedType) type, cls, map);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            if (cls.isArray()) {
                cls = cls.getComponentType();
            }
            return E(genericComponentType, cls, map);
        }
        int i4 = 0;
        if (type instanceof WildcardType) {
            Type[] x4 = x((WildcardType) type);
            int length = x4.length;
            while (i4 < length) {
                Type type2 = x4[i4];
                if (G(type2, cls)) {
                    return E(type2, cls, map);
                }
                i4++;
            }
            return null;
        }
        if (!(type instanceof TypeVariable)) {
            throw new IllegalStateException("found an unhandled type: " + type);
        }
        Type[] v4 = v((TypeVariable) type);
        int length2 = v4.length;
        while (i4 < length2) {
            Type type3 = v4[i4];
            if (G(type3, cls)) {
                return E(type3, cls, map);
            }
            i4++;
        }
        return null;
    }

    public static boolean F(Type type) {
        return (type instanceof GenericArrayType) || ((type instanceof Class) && ((Class) type).isArray());
    }

    private static boolean G(Type type, Class<?> cls) {
        if (type == null) {
            return cls == null || !cls.isPrimitive();
        }
        if (cls == null) {
            return false;
        }
        if (cls.equals(type)) {
            return true;
        }
        if (type instanceof Class) {
            return s.P((Class) type, cls);
        }
        if (type instanceof ParameterizedType) {
            return G(y((ParameterizedType) type), cls);
        }
        if (type instanceof TypeVariable) {
            for (Type type2 : ((TypeVariable) type).getBounds()) {
                if (G(type2, cls)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            if (cls.equals(Object.class)) {
                return true;
            }
            return cls.isArray() && G(((GenericArrayType) type).getGenericComponentType(), cls.getComponentType());
        }
        if (type instanceof WildcardType) {
            return false;
        }
        throw new IllegalStateException("found an unhandled type: " + type);
    }

    private static boolean H(Type type, GenericArrayType genericArrayType, Map<TypeVariable<?>, Type> map) {
        if (type == null) {
            return true;
        }
        if (genericArrayType == null) {
            return false;
        }
        if (genericArrayType.equals(type)) {
            return true;
        }
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() && K(cls.getComponentType(), genericComponentType, map);
        }
        if (type instanceof GenericArrayType) {
            return K(((GenericArrayType) type).getGenericComponentType(), genericComponentType, map);
        }
        if (type instanceof WildcardType) {
            for (Type type2 : x((WildcardType) type)) {
                if (K(type2, genericArrayType, null)) {
                    return true;
                }
            }
            return false;
        }
        if (!(type instanceof TypeVariable)) {
            if (type instanceof ParameterizedType) {
                return false;
            }
            throw new IllegalStateException("found an unhandled type: " + type);
        }
        for (Type type3 : v((TypeVariable) type)) {
            if (K(type3, genericArrayType, null)) {
                return true;
            }
        }
        return false;
    }

    private static boolean I(Type type, ParameterizedType parameterizedType, Map<TypeVariable<?>, Type> map) {
        if (type == null) {
            return true;
        }
        if (parameterizedType == null) {
            return false;
        }
        if (parameterizedType.equals(type)) {
            return true;
        }
        Class<?> y4 = y(parameterizedType);
        Map<TypeVariable<?>, Type> E = E(type, y4, null);
        if (E == null) {
            return false;
        }
        if (E.isEmpty()) {
            return true;
        }
        Map<TypeVariable<?>, Type> C = C(parameterizedType, y4, map);
        for (TypeVariable<?> typeVariable : C.keySet()) {
            Type d02 = d0(typeVariable, C);
            Type d03 = d0(typeVariable, E);
            if (d02 != null || !(d03 instanceof Class)) {
                if (d03 != null && !d02.equals(d03) && (!(d02 instanceof WildcardType) || !K(d03, d02, map))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean J(Type type, Type type2) {
        return K(type, type2, null);
    }

    private static boolean K(Type type, Type type2, Map<TypeVariable<?>, Type> map) {
        if (type2 == null || (type2 instanceof Class)) {
            return G(type, (Class) type2);
        }
        if (type2 instanceof ParameterizedType) {
            return I(type, (ParameterizedType) type2, map);
        }
        if (type2 instanceof GenericArrayType) {
            return H(type, (GenericArrayType) type2, map);
        }
        if (type2 instanceof WildcardType) {
            return M(type, (WildcardType) type2, map);
        }
        if (type2 instanceof TypeVariable) {
            return L(type, (TypeVariable) type2, map);
        }
        throw new IllegalStateException("found an unhandled type: " + type2);
    }

    private static boolean L(Type type, TypeVariable<?> typeVariable, Map<TypeVariable<?>, Type> map) {
        if (type == null) {
            return true;
        }
        if (typeVariable == null) {
            return false;
        }
        if (typeVariable.equals(type)) {
            return true;
        }
        if (type instanceof TypeVariable) {
            for (Type type2 : v((TypeVariable) type)) {
                if (L(type2, typeVariable, map)) {
                    return true;
                }
            }
        }
        if ((type instanceof Class) || (type instanceof ParameterizedType) || (type instanceof GenericArrayType) || (type instanceof WildcardType)) {
            return false;
        }
        throw new IllegalStateException("found an unhandled type: " + type);
    }

    private static boolean M(Type type, WildcardType wildcardType, Map<TypeVariable<?>, Type> map) {
        if (type == null) {
            return true;
        }
        if (wildcardType == null) {
            return false;
        }
        if (wildcardType.equals(type)) {
            return true;
        }
        Type[] x4 = x(wildcardType);
        Type[] w4 = w(wildcardType);
        if (!(type instanceof WildcardType)) {
            for (Type type2 : x4) {
                if (!K(type, W(type2, map), map)) {
                    return false;
                }
            }
            for (Type type3 : w4) {
                if (!K(W(type3, map), type, map)) {
                    return false;
                }
            }
            return true;
        }
        WildcardType wildcardType2 = (WildcardType) type;
        Type[] x5 = x(wildcardType2);
        Type[] w5 = w(wildcardType2);
        for (Type type4 : x4) {
            Type W = W(type4, map);
            for (Type type5 : x5) {
                if (!K(type5, W, map)) {
                    return false;
                }
            }
        }
        for (Type type6 : w4) {
            Type W2 = W(type6, map);
            for (Type type7 : w5) {
                if (!K(W2, type7, map)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean N(Object obj, Type type) {
        if (type == null) {
            return false;
        }
        return obj == null ? ((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true : K(obj.getClass(), type, null);
    }

    private static /* synthetic */ Type O(Type type) {
        return type;
    }

    private static <T> void P(Class<T> cls, ParameterizedType parameterizedType, Map<TypeVariable<?>, Type> map) {
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            P(cls, (ParameterizedType) ownerType, map);
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        TypeVariable<Class<?>>[] typeParameters = y(parameterizedType).getTypeParameters();
        List asList = Arrays.asList(cls.getTypeParameters());
        for (int i4 = 0; i4 < actualTypeArguments.length; i4++) {
            TypeVariable<Class<?>> typeVariable = typeParameters[i4];
            Type type = actualTypeArguments[i4];
            if (asList.contains(type) && map.containsKey(typeVariable)) {
                map.put((TypeVariable) type, map.get(typeVariable));
            }
        }
    }

    public static Type[] Q(Type[] typeArr) {
        int i4;
        k1.b0(typeArr, "null value specified for bounds array", new Object[0]);
        if (typeArr.length < 2) {
            return typeArr;
        }
        HashSet hashSet = new HashSet(typeArr.length);
        for (Type type : typeArr) {
            int length = typeArr.length;
            while (true) {
                if (i4 >= length) {
                    hashSet.add(type);
                    break;
                }
                Type type2 = typeArr[i4];
                i4 = (type == type2 || !K(type2, type, null)) ? i4 + 1 : 0;
            }
        }
        return (Type[]) hashSet.toArray(org.apache.commons.lang3.e.f85971w);
    }

    public static final ParameterizedType R(Class<?> cls, Map<TypeVariable<?>, Type> map) {
        k1.b0(cls, "raw class is null", new Object[0]);
        k1.b0(map, "typeArgMappings is null", new Object[0]);
        return U(null, cls, p(map, cls.getTypeParameters()));
    }

    public static final ParameterizedType S(Class<?> cls, Type... typeArr) {
        return U(null, cls, typeArr);
    }

    public static final ParameterizedType T(Type type, Class<?> cls, Map<TypeVariable<?>, Type> map) {
        k1.b0(cls, "raw class is null", new Object[0]);
        k1.b0(map, "typeArgMappings is null", new Object[0]);
        return U(type, cls, p(map, cls.getTypeParameters()));
    }

    public static final ParameterizedType U(Type type, Class<?> cls, Type... typeArr) {
        k1.b0(cls, "raw class is null", new Object[0]);
        if (cls.getEnclosingClass() == null) {
            k1.B(type == null, "no owner allowed for top-level %s", cls);
            type = null;
        } else if (type == null) {
            type = cls.getEnclosingClass();
        } else {
            k1.B(G(type, cls.getEnclosingClass()), "%s is invalid owner type for parameterized %s", type, cls);
        }
        k1.N(typeArr, "null type argument at index %s", new Object[0]);
        k1.B(cls.getTypeParameters().length == typeArr.length, "invalid number of type parameters specified: expected %d, got %d", Integer.valueOf(cls.getTypeParameters().length), Integer.valueOf(typeArr.length));
        return new c(cls, type, typeArr);
    }

    private static String V(ParameterizedType parameterizedType) {
        StringBuilder sb = new StringBuilder();
        Type ownerType = parameterizedType.getOwnerType();
        Class cls = (Class) parameterizedType.getRawType();
        if (ownerType == null) {
            sb.append(cls.getName());
        } else {
            if (ownerType instanceof Class) {
                sb.append(((Class) ownerType).getName());
            } else {
                sb.append(ownerType.toString());
            }
            sb.append('.');
            sb.append(cls.getSimpleName());
        }
        int[] q4 = q(parameterizedType);
        if (q4.length > 0) {
            f(sb, q4, parameterizedType.getActualTypeArguments());
        } else {
            sb.append(m0.less);
            e(sb, ", ", parameterizedType.getActualTypeArguments()).append(m0.greater);
        }
        return sb.toString();
    }

    private static Type W(Type type, Map<TypeVariable<?>, Type> map) {
        if (!(type instanceof TypeVariable) || map == null) {
            return type;
        }
        Type type2 = map.get(type);
        if (type2 != null) {
            return type2;
        }
        throw new IllegalArgumentException("missing assignment type for type variable " + type);
    }

    public static String X(TypeVariable<?> typeVariable) {
        k1.b0(typeVariable, "var is null", new Object[0]);
        StringBuilder sb = new StringBuilder();
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            Class<?> cls = (Class) genericDeclaration;
            while (cls.getEnclosingClass() != null) {
                sb.insert(0, cls.getSimpleName()).insert(0, '.');
                cls = cls.getEnclosingClass();
            }
            sb.insert(0, cls.getName());
        } else if (genericDeclaration instanceof Type) {
            sb.append(Z((Type) genericDeclaration));
        } else {
            sb.append(genericDeclaration);
        }
        sb.append(':');
        sb.append(a0(typeVariable));
        return sb.toString();
    }

    private static <T> String Y(T t4) {
        return t4 instanceof Type ? Z((Type) t4) : t4.toString();
    }

    public static String Z(Type type) {
        k1.a0(type);
        if (type instanceof Class) {
            return g((Class) type);
        }
        if (type instanceof ParameterizedType) {
            return V((ParameterizedType) type);
        }
        if (type instanceof WildcardType) {
            return g0((WildcardType) type);
        }
        if (type instanceof TypeVariable) {
            return a0((TypeVariable) type);
        }
        if (type instanceof GenericArrayType) {
            return s((GenericArrayType) type);
        }
        throw new IllegalArgumentException(p0.A(type));
    }

    public static /* synthetic */ Type a(Type type) {
        return type;
    }

    private static String a0(TypeVariable<?> typeVariable) {
        StringBuilder sb = new StringBuilder(typeVariable.getName());
        Type[] bounds = typeVariable.getBounds();
        if (bounds.length > 0 && (bounds.length != 1 || !Object.class.equals(bounds[0]))) {
            sb.append(" extends ");
            e(sb, " & ", typeVariable.getBounds());
        }
        return sb.toString();
    }

    public static boolean b0(Map<TypeVariable<?>, Type> map) {
        k1.b0(map, "typeVarAssigns is null", new Object[0]);
        for (Map.Entry<TypeVariable<?>, Type> entry : map.entrySet()) {
            TypeVariable<?> key = entry.getKey();
            Type value = entry.getValue();
            for (Type type : v(key)) {
                if (!K(value, W(type, map), map)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static Type[] c0(Map<TypeVariable<?>, Type> map, Type[] typeArr) {
        int i4 = 0;
        while (i4 < typeArr.length) {
            Type e02 = e0(map, typeArr[i4]);
            if (e02 == null) {
                typeArr = (Type[]) org.apache.commons.lang3.e.Q2(typeArr, i4);
                i4--;
            } else {
                typeArr[i4] = e02;
            }
            i4++;
        }
        return typeArr;
    }

    private static Type d0(TypeVariable<?> typeVariable, Map<TypeVariable<?>, Type> map) {
        Type type;
        while (true) {
            type = map.get(typeVariable);
            if (!(type instanceof TypeVariable) || type.equals(typeVariable)) {
                break;
            }
            typeVariable = (TypeVariable) type;
        }
        return type;
    }

    private static <T> StringBuilder e(StringBuilder sb, String str, T... tArr) {
        k1.W(k1.M(tArr));
        if (tArr.length > 0) {
            sb.append(Y(tArr[0]));
            for (int i4 = 1; i4 < tArr.length; i4++) {
                sb.append(str);
                sb.append(Y(tArr[i4]));
            }
        }
        return sb;
    }

    public static Type e0(Map<TypeVariable<?>, Type> map, Type type) {
        if (map == null) {
            map = Collections.emptyMap();
        }
        if (h(type)) {
            if (type instanceof TypeVariable) {
                return e0(map, map.get(type));
            }
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                if (parameterizedType.getOwnerType() != null) {
                    HashMap hashMap = new HashMap(map);
                    hashMap.putAll(B(parameterizedType));
                    map = hashMap;
                }
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i4 = 0; i4 < actualTypeArguments.length; i4++) {
                    Type e02 = e0(map, actualTypeArguments[i4]);
                    if (e02 != null) {
                        actualTypeArguments[i4] = e02;
                    }
                }
                return U(parameterizedType.getOwnerType(), (Class) parameterizedType.getRawType(), actualTypeArguments);
            }
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                return new d().d(c0(map, wildcardType.getUpperBounds())).c(c0(map, wildcardType.getLowerBounds())).a();
            }
        }
        return type;
    }

    private static void f(StringBuilder sb, int[] iArr, Type[] typeArr) {
        for (int i4 = 0; i4 < iArr.length; i4++) {
            sb.append(m0.less);
            e(sb, ", ", typeArr[i4].toString()).append(m0.greater);
        }
        Type[] typeArr2 = (Type[]) org.apache.commons.lang3.e.b3(typeArr, iArr);
        if (typeArr2.length > 0) {
            sb.append(m0.less);
            e(sb, ", ", typeArr2).append(m0.greater);
        }
    }

    public static d f0() {
        return new d();
    }

    private static String g(Class<?> cls) {
        if (cls.isArray()) {
            return Z(cls.getComponentType()) + "[]";
        }
        StringBuilder sb = new StringBuilder();
        if (cls.getEnclosingClass() != null) {
            sb.append(g(cls.getEnclosingClass()));
            sb.append('.');
            sb.append(cls.getSimpleName());
        } else {
            sb.append(cls.getName());
        }
        if (cls.getTypeParameters().length > 0) {
            sb.append(m0.less);
            e(sb, ", ", cls.getTypeParameters());
            sb.append(m0.greater);
        }
        return sb.toString();
    }

    private static String g0(WildcardType wildcardType) {
        StringBuilder sb = new StringBuilder();
        sb.append('?');
        Type[] lowerBounds = wildcardType.getLowerBounds();
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (lowerBounds.length > 1 || (lowerBounds.length == 1 && lowerBounds[0] != null)) {
            sb.append(" super ");
            e(sb, " & ", lowerBounds);
        } else if (upperBounds.length > 1 || (upperBounds.length == 1 && !Object.class.equals(upperBounds[0]))) {
            sb.append(" extends ");
            e(sb, " & ", upperBounds);
        }
        return sb.toString();
    }

    public static boolean h(Type type) {
        if (type instanceof TypeVariable) {
            return true;
        }
        if (type instanceof Class) {
            return ((Class) type).getTypeParameters().length > 0;
        }
        if (!(type instanceof ParameterizedType)) {
            if (!(type instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            return h(w(wildcardType)[0]) || h(x(wildcardType)[0]);
        }
        for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
            if (h(type2)) {
                return true;
            }
        }
        return false;
    }

    public static <T> j<T> h0(Class<T> cls) {
        return new h(cls);
    }

    private static boolean i(TypeVariable<?> typeVariable, ParameterizedType parameterizedType) {
        return org.apache.commons.lang3.e.b0(typeVariable.getBounds(), parameterizedType);
    }

    public static <T> j<T> i0(Type type) {
        return new h(type);
    }

    public static Map<TypeVariable<?>, Type> j(Class<?> cls, ParameterizedType parameterizedType) {
        k1.b0(cls, "cls is null", new Object[0]);
        k1.b0(parameterizedType, "superType is null", new Object[0]);
        Class<?> y4 = y(parameterizedType);
        if (!G(cls, y4)) {
            return null;
        }
        if (cls.equals(y4)) {
            return C(parameterizedType, y4, null);
        }
        Type u4 = u(cls, y4);
        if (u4 instanceof Class) {
            return j((Class) u4, parameterizedType);
        }
        ParameterizedType parameterizedType2 = (ParameterizedType) u4;
        Map<TypeVariable<?>, Type> j4 = j(y(parameterizedType2), parameterizedType);
        P(cls, parameterizedType2, j4);
        return j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean k(GenericArrayType genericArrayType, Type type) {
        return (type instanceof GenericArrayType) && m(genericArrayType.getGenericComponentType(), ((GenericArrayType) type).getGenericComponentType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(ParameterizedType parameterizedType, Type type) {
        if (!(type instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType2 = (ParameterizedType) type;
        if (m(parameterizedType.getRawType(), parameterizedType2.getRawType()) && m(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType())) {
            return o(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        return false;
    }

    public static boolean m(Type type, Type type2) {
        if (Objects.equals(type, type2)) {
            return true;
        }
        if (type instanceof ParameterizedType) {
            return l((ParameterizedType) type, type2);
        }
        if (type instanceof GenericArrayType) {
            return k((GenericArrayType) type, type2);
        }
        if (type instanceof WildcardType) {
            return n((WildcardType) type, type2);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean n(WildcardType wildcardType, Type type) {
        if (!(type instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType2 = (WildcardType) type;
        return o(w(wildcardType), w(wildcardType2)) && o(x(wildcardType), x(wildcardType2));
    }

    private static boolean o(Type[] typeArr, Type[] typeArr2) {
        if (typeArr.length != typeArr2.length) {
            return false;
        }
        for (int i4 = 0; i4 < typeArr.length; i4++) {
            if (!m(typeArr[i4], typeArr2[i4])) {
                return false;
            }
        }
        return true;
    }

    private static Type[] p(Map<TypeVariable<?>, Type> map, TypeVariable<?>[] typeVariableArr) {
        Type[] typeArr = new Type[typeVariableArr.length];
        int length = typeVariableArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            TypeVariable<?> typeVariable = typeVariableArr[i4];
            k1.B(map.containsKey(typeVariable), "missing argument mapping for %s", Z(typeVariable));
            typeArr[i5] = map.get(typeVariable);
            i4++;
            i5++;
        }
        return typeArr;
    }

    private static int[] q(ParameterizedType parameterizedType) {
        Type[] typeArr = (Type[]) Arrays.copyOf(parameterizedType.getActualTypeArguments(), parameterizedType.getActualTypeArguments().length);
        int[] iArr = new int[0];
        for (int i4 = 0; i4 < typeArr.length; i4++) {
            Type type = typeArr[i4];
            if ((type instanceof TypeVariable) && i((TypeVariable) type, parameterizedType)) {
                iArr = org.apache.commons.lang3.e.j(iArr, i4);
            }
        }
        return iArr;
    }

    public static GenericArrayType r(Type type) {
        return new b((Type) k1.b0(type, "componentType is null", new Object[0]));
    }

    private static String s(GenericArrayType genericArrayType) {
        return String.format("%s[]", Z(genericArrayType.getGenericComponentType()));
    }

    public static Type t(Type type) {
        if (!(type instanceof Class)) {
            if (type instanceof GenericArrayType) {
                return ((GenericArrayType) type).getGenericComponentType();
            }
            return null;
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            return cls.getComponentType();
        }
        return null;
    }

    private static Type u(Class<?> cls, Class<?> cls2) {
        Class<?> cls3;
        if (cls2.isInterface()) {
            Type type = null;
            for (Type type2 : cls.getGenericInterfaces()) {
                if (type2 instanceof ParameterizedType) {
                    cls3 = y((ParameterizedType) type2);
                } else {
                    if (!(type2 instanceof Class)) {
                        throw new IllegalStateException("Unexpected generic interface type found: " + type2);
                    }
                    cls3 = (Class) type2;
                }
                if (G(cls3, cls2) && K(type, cls3, null)) {
                    type = type2;
                }
            }
            if (type != null) {
                return type;
            }
        }
        return cls.getGenericSuperclass();
    }

    public static Type[] v(TypeVariable<?> typeVariable) {
        k1.b0(typeVariable, "typeVariable is null", new Object[0]);
        Type[] bounds = typeVariable.getBounds();
        return bounds.length == 0 ? new Type[]{Object.class} : Q(bounds);
    }

    public static Type[] w(WildcardType wildcardType) {
        k1.b0(wildcardType, "wildcardType is null", new Object[0]);
        Type[] lowerBounds = wildcardType.getLowerBounds();
        return lowerBounds.length == 0 ? new Type[]{null} : lowerBounds;
    }

    public static Type[] x(WildcardType wildcardType) {
        k1.b0(wildcardType, "wildcardType is null", new Object[0]);
        Type[] upperBounds = wildcardType.getUpperBounds();
        return upperBounds.length == 0 ? new Type[]{Object.class} : Q(upperBounds);
    }

    private static Class<?> y(ParameterizedType parameterizedType) {
        Type rawType = parameterizedType.getRawType();
        if (rawType instanceof Class) {
            return (Class) rawType;
        }
        throw new IllegalStateException("Wait... What!? Type of rawType: " + rawType);
    }

    public static Class<?> z(Type type, Type type2) {
        Map<TypeVariable<?>, Type> E;
        Type type3;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return y((ParameterizedType) type);
        }
        if (!(type instanceof TypeVariable)) {
            if (type instanceof GenericArrayType) {
                return Array.newInstance(z(((GenericArrayType) type).getGenericComponentType(), type2), 0).getClass();
            }
            if (type instanceof WildcardType) {
                return null;
            }
            throw new IllegalArgumentException("unknown type: " + type);
        }
        if (type2 == null) {
            return null;
        }
        GenericDeclaration genericDeclaration = ((TypeVariable) type).getGenericDeclaration();
        if (!(genericDeclaration instanceof Class) || (E = E(type2, (Class) genericDeclaration, null)) == null || (type3 = E.get(type)) == null) {
            return null;
        }
        return z(type3, type2);
    }
}
