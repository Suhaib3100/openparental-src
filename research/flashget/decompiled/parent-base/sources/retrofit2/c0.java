package retrofit2;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import okhttp3.g0;

/* compiled from: Utils.java */
/* loaded from: classes9.dex */
final class c0 {

    /* renamed from: a, reason: collision with root package name */
    static final Type[] f89884a = new Type[0];

    /* compiled from: Utils.java */
    private static final class a implements GenericArrayType {

        /* renamed from: b, reason: collision with root package name */
        private final Type f89885b;

        a(Type type) {
            this.f89885b = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && c0.d(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f89885b;
        }

        public int hashCode() {
            return this.f89885b.hashCode();
        }

        public String toString() {
            return android.support.v4.media.c.a(new StringBuilder(), c0.t(this.f89885b), ProtectedSandApp.s("ꖟ\u0001"));
        }
    }

    /* compiled from: Utils.java */
    static final class b implements ParameterizedType {

        /* renamed from: b, reason: collision with root package name */
        @zc.h
        private final Type f89886b;

        /* renamed from: c, reason: collision with root package name */
        private final Type f89887c;

        /* renamed from: d, reason: collision with root package name */
        private final Type[] f89888d;

        b(@zc.h Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, ProtectedSandApp.s("ꖠ\u0001"));
                c0.b(type3);
            }
            this.f89886b = type;
            this.f89887c = type2;
            this.f89888d = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && c0.d(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f89888d.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        @zc.h
        public Type getOwnerType() {
            return this.f89886b;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f89887c;
        }

        public int hashCode() {
            int hashCode = Arrays.hashCode(this.f89888d) ^ this.f89887c.hashCode();
            Type type = this.f89886b;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            Type[] typeArr = this.f89888d;
            if (typeArr.length == 0) {
                return c0.t(this.f89887c);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(c0.t(this.f89887c));
            sb.append(ProtectedSandApp.s("ꖡ\u0001"));
            sb.append(c0.t(this.f89888d[0]));
            for (int i4 = 1; i4 < this.f89888d.length; i4++) {
                sb.append(ProtectedSandApp.s("ꖢ\u0001"));
                sb.append(c0.t(this.f89888d[i4]));
            }
            sb.append(ProtectedSandApp.s("ꖣ\u0001"));
            return sb.toString();
        }
    }

    /* compiled from: Utils.java */
    private static final class c implements WildcardType {

        /* renamed from: b, reason: collision with root package name */
        private final Type f89889b;

        /* renamed from: c, reason: collision with root package name */
        @zc.h
        private final Type f89890c;

        c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                c0.b(typeArr[0]);
                this.f89890c = null;
                this.f89889b = typeArr[0];
                return;
            }
            typeArr2[0].getClass();
            c0.b(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f89890c = typeArr2[0];
            this.f89889b = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && c0.d(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f89890c;
            return type != null ? new Type[]{type} : c0.f89884a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f89889b};
        }

        public int hashCode() {
            Type type = this.f89890c;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f89889b.hashCode() + 31);
        }

        public String toString() {
            if (this.f89890c != null) {
                return ProtectedSandApp.s("ꖤ\u0001") + c0.t(this.f89890c);
            }
            if (this.f89889b == Object.class) {
                return ProtectedSandApp.s("ꖥ\u0001");
            }
            return ProtectedSandApp.s("ꖦ\u0001") + c0.t(this.f89889b);
        }
    }

    private c0() {
    }

    static g0 a(g0 g0Var) throws IOException {
        okio.m mVar = new okio.m();
        g0Var.getF84142d().z3(mVar);
        return g0.INSTANCE.b(g0Var.getF84143e(), g0Var.getF84144f(), mVar);
    }

    static void b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    @zc.h
    private static Class<?> c(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    static boolean d(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    static Type e(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i4 = 0; i4 < length; i4++) {
                Class<?> cls3 = interfaces[i4];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i4];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return e(cls.getGenericInterfaces()[i4], interfaces[i4], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    static Type f(int i4, ParameterizedType parameterizedType) {
        Type type = parameterizedType.getActualTypeArguments()[i4];
        return type instanceof WildcardType ? ((WildcardType) type).getLowerBounds()[0] : type;
    }

    static Type g(int i4, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i4 >= 0 && i4 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i4];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder a5 = androidx.collection.s.a(ProtectedSandApp.s("ꖧ\u0001"), i4, ProtectedSandApp.s("ꖨ\u0001"));
        a5.append(actualTypeArguments.length);
        a5.append(ProtectedSandApp.s("ꖩ\u0001"));
        a5.append(parameterizedType);
        throw new IllegalArgumentException(a5.toString());
    }

    static Class<?> h(Type type) {
        Objects.requireNonNull(type, ProtectedSandApp.s("ꖪ\u0001"));
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(h(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return h(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ꖫ\u0001") + type + ProtectedSandApp.s("ꖬ\u0001") + type.getClass().getName());
    }

    static Type i(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return q(type, cls, e(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    static boolean j(@zc.h Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (j(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return j(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ꖫ\u0001") + type + ProtectedSandApp.s("ꖬ\u0001") + (type == null ? ProtectedSandApp.s("ꖭ\u0001") : type.getClass().getName()));
    }

    private static int k(Object[] objArr, Object obj) {
        for (int i4 = 0; i4 < objArr.length; i4++) {
            if (obj.equals(objArr[i4])) {
                return i4;
            }
        }
        throw new NoSuchElementException();
    }

    static boolean l(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    static RuntimeException m(Method method, String str, Object... objArr) {
        return n(method, null, str, objArr);
    }

    static RuntimeException n(Method method, @zc.h Throwable th, String str, Object... objArr) {
        StringBuilder a5 = androidx.constraintlayout.core.e.a(String.format(str, objArr), ProtectedSandApp.s("ꖮ\u0001"));
        a5.append(method.getDeclaringClass().getSimpleName());
        a5.append(ProtectedSandApp.s("ꖯ\u0001"));
        a5.append(method.getName());
        return new IllegalArgumentException(a5.toString(), th);
    }

    static RuntimeException o(Method method, int i4, String str, Object... objArr) {
        StringBuilder a5 = androidx.constraintlayout.core.e.a(str, ProtectedSandApp.s("ꖰ\u0001"));
        a5.append(i4 + 1);
        a5.append(ProtectedSandApp.s("ꖱ\u0001"));
        return n(method, null, a5.toString(), objArr);
    }

    static RuntimeException p(Method method, Throwable th, int i4, String str, Object... objArr) {
        StringBuilder a5 = androidx.constraintlayout.core.e.a(str, ProtectedSandApp.s("ꖰ\u0001"));
        a5.append(i4 + 1);
        a5.append(ProtectedSandApp.s("ꖱ\u0001"));
        return n(method, th, a5.toString(), objArr);
    }

    static Type q(Type type, Class<?> cls, Type type2) {
        Type type3 = type2;
        while (type3 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type3;
            Type r4 = r(type, cls, typeVariable);
            if (r4 == typeVariable) {
                return r4;
            }
            type3 = r4;
        }
        if (type3 instanceof Class) {
            Class cls2 = (Class) type3;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type q4 = q(type, cls, componentType);
                return componentType == q4 ? cls2 : new a(q4);
            }
        }
        if (type3 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type3;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type q5 = q(type, cls, genericComponentType);
            return genericComponentType == q5 ? genericArrayType : new a(q5);
        }
        if (type3 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type3;
            Type ownerType = parameterizedType.getOwnerType();
            Type q6 = q(type, cls, ownerType);
            boolean z4 = q6 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i4 = 0; i4 < length; i4++) {
                Type q7 = q(type, cls, actualTypeArguments[i4]);
                if (q7 != actualTypeArguments[i4]) {
                    if (!z4) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z4 = true;
                    }
                    actualTypeArguments[i4] = q7;
                }
            }
            return z4 ? new b(q6, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        boolean z5 = type3 instanceof WildcardType;
        Type type4 = type3;
        if (z5) {
            WildcardType wildcardType = (WildcardType) type3;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type q10 = q(type, cls, lowerBounds[0]);
                type4 = wildcardType;
                if (q10 != lowerBounds[0]) {
                    return new c(new Type[]{Object.class}, new Type[]{q10});
                }
            } else {
                type4 = wildcardType;
                if (upperBounds.length == 1) {
                    Type q11 = q(type, cls, upperBounds[0]);
                    type4 = wildcardType;
                    if (q11 != upperBounds[0]) {
                        return new c(new Type[]{q11}, f89884a);
                    }
                }
            }
        }
        return type4;
    }

    private static Type r(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> c5 = c(typeVariable);
        if (c5 == null) {
            return typeVariable;
        }
        Type e4 = e(type, cls, c5);
        if (!(e4 instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) e4).getActualTypeArguments()[k(c5.getTypeParameters(), typeVariable)];
    }

    static void s(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    static String t(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
