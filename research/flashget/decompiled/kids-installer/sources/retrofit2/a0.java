package retrofit2;

import com.flashget.kidsdownloader.ProtectedSandApp;
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
import javax.annotation.Nullable;
import okhttp3.h0;

/* compiled from: Utils.java */
/* loaded from: classes5.dex */
final class a0 {

    /* renamed from: a, reason: collision with root package name */
    static final Type[] f32968a = new Type[0];

    /* compiled from: Utils.java */
    private static final class a implements GenericArrayType {

        /* renamed from: o, reason: collision with root package name */
        private final Type f32969o;

        a(Type type) {
            this.f32969o = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && a0.d(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f32969o;
        }

        public int hashCode() {
            return this.f32969o.hashCode();
        }

        public String toString() {
            return androidx.concurrent.futures.a.a(new StringBuilder(), a0.t(this.f32969o), ProtectedSandApp.s("椪"));
        }
    }

    /* compiled from: Utils.java */
    static final class b implements ParameterizedType {

        /* renamed from: o, reason: collision with root package name */
        @Nullable
        private final Type f32970o;

        /* renamed from: p, reason: collision with root package name */
        private final Type f32971p;

        /* renamed from: q, reason: collision with root package name */
        private final Type[] f32972q;

        b(@Nullable Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, ProtectedSandApp.s("椫"));
                a0.b(type3);
            }
            this.f32970o = type;
            this.f32971p = type2;
            this.f32972q = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && a0.d(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f32972q.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        @Nullable
        public Type getOwnerType() {
            return this.f32970o;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f32971p;
        }

        public int hashCode() {
            int hashCode = Arrays.hashCode(this.f32972q) ^ this.f32971p.hashCode();
            Type type = this.f32970o;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            Type[] typeArr = this.f32972q;
            if (typeArr.length == 0) {
                return a0.t(this.f32971p);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(a0.t(this.f32971p));
            sb.append(ProtectedSandApp.s("椬"));
            sb.append(a0.t(this.f32972q[0]));
            for (int i5 = 1; i5 < this.f32972q.length; i5++) {
                sb.append(ProtectedSandApp.s("椭"));
                sb.append(a0.t(this.f32972q[i5]));
            }
            sb.append(ProtectedSandApp.s("椮"));
            return sb.toString();
        }
    }

    /* compiled from: Utils.java */
    private static final class c implements WildcardType {

        /* renamed from: o, reason: collision with root package name */
        private final Type f32973o;

        /* renamed from: p, reason: collision with root package name */
        @Nullable
        private final Type f32974p;

        c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                Type type = typeArr[0];
                type.getClass();
                a0.b(type);
                this.f32974p = null;
                this.f32973o = typeArr[0];
                return;
            }
            Type type2 = typeArr2[0];
            type2.getClass();
            a0.b(type2);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f32974p = typeArr2[0];
            this.f32973o = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && a0.d(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f32974p;
            return type != null ? new Type[]{type} : a0.f32968a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f32973o};
        }

        public int hashCode() {
            Type type = this.f32974p;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f32973o.hashCode() + 31);
        }

        public String toString() {
            if (this.f32974p != null) {
                return ProtectedSandApp.s("椯") + a0.t(this.f32974p);
            }
            if (this.f32973o == Object.class) {
                return ProtectedSandApp.s("椰");
            }
            return ProtectedSandApp.s("椱") + a0.t(this.f32973o);
        }
    }

    private a0() {
    }

    static h0 a(h0 h0Var) throws IOException {
        okio.m mVar = new okio.m();
        h0Var.getF30636q().Z0(mVar);
        return h0.m(h0Var.getF30637r(), h0Var.getF30638s(), mVar);
    }

    static void b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    @Nullable
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
            for (int i5 = 0; i5 < length; i5++) {
                Class<?> cls3 = interfaces[i5];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i5];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return e(cls.getGenericInterfaces()[i5], interfaces[i5], cls2);
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

    static Type f(int i5, ParameterizedType parameterizedType) {
        Type type = parameterizedType.getActualTypeArguments()[i5];
        return type instanceof WildcardType ? ((WildcardType) type).getLowerBounds()[0] : type;
    }

    static Type g(int i5, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i5 >= 0 && i5 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i5];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder a6 = androidx.core.app.x.a(ProtectedSandApp.s("椲"), i5, ProtectedSandApp.s("椳"));
        a6.append(actualTypeArguments.length);
        a6.append(ProtectedSandApp.s("椴"));
        a6.append(parameterizedType);
        throw new IllegalArgumentException(a6.toString());
    }

    static Class<?> h(Type type) {
        Objects.requireNonNull(type, ProtectedSandApp.s("椵"));
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
        throw new IllegalArgumentException(ProtectedSandApp.s("椶") + type + ProtectedSandApp.s("椷") + type.getClass().getName());
    }

    static Type i(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return q(type, cls, e(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    static boolean j(@Nullable Type type) {
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
        throw new IllegalArgumentException(ProtectedSandApp.s("椹") + type + ProtectedSandApp.s("椺") + (type == null ? ProtectedSandApp.s("椸") : type.getClass().getName()));
    }

    private static int k(Object[] objArr, Object obj) {
        for (int i5 = 0; i5 < objArr.length; i5++) {
            if (obj.equals(objArr[i5])) {
                return i5;
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

    static RuntimeException n(Method method, @Nullable Throwable th, String str, Object... objArr) {
        StringBuilder a6 = androidx.constraintlayout.motion.widget.c.a(String.format(str, objArr), ProtectedSandApp.s("椻"));
        a6.append(method.getDeclaringClass().getSimpleName());
        a6.append(ProtectedSandApp.s("椼"));
        a6.append(method.getName());
        return new IllegalArgumentException(a6.toString(), th);
    }

    static RuntimeException o(Method method, int i5, String str, Object... objArr) {
        StringBuilder a6 = androidx.constraintlayout.motion.widget.c.a(str, ProtectedSandApp.s("椽"));
        a6.append(i5 + 1);
        a6.append(ProtectedSandApp.s("椾"));
        return n(method, null, a6.toString(), objArr);
    }

    static RuntimeException p(Method method, Throwable th, int i5, String str, Object... objArr) {
        StringBuilder a6 = androidx.constraintlayout.motion.widget.c.a(str, ProtectedSandApp.s("椿"));
        a6.append(i5 + 1);
        a6.append(ProtectedSandApp.s("楀"));
        return n(method, th, a6.toString(), objArr);
    }

    static Type q(Type type, Class<?> cls, Type type2) {
        Type type3 = type2;
        while (type3 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type3;
            Type r5 = r(type, cls, typeVariable);
            if (r5 == typeVariable) {
                return r5;
            }
            type3 = r5;
        }
        if (type3 instanceof Class) {
            Class cls2 = (Class) type3;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type q5 = q(type, cls, componentType);
                return componentType == q5 ? cls2 : new a(q5);
            }
        }
        if (type3 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type3;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type q6 = q(type, cls, genericComponentType);
            return genericComponentType == q6 ? genericArrayType : new a(q6);
        }
        if (type3 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type3;
            Type ownerType = parameterizedType.getOwnerType();
            Type q7 = q(type, cls, ownerType);
            boolean z5 = q7 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i5 = 0; i5 < length; i5++) {
                Type q8 = q(type, cls, actualTypeArguments[i5]);
                if (q8 != actualTypeArguments[i5]) {
                    if (!z5) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z5 = true;
                    }
                    actualTypeArguments[i5] = q8;
                }
            }
            return z5 ? new b(q7, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        boolean z6 = type3 instanceof WildcardType;
        Type type4 = type3;
        if (z6) {
            WildcardType wildcardType = (WildcardType) type3;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type q9 = q(type, cls, lowerBounds[0]);
                type4 = wildcardType;
                if (q9 != lowerBounds[0]) {
                    return new c(new Type[]{Object.class}, new Type[]{q9});
                }
            } else {
                type4 = wildcardType;
                if (upperBounds.length == 1) {
                    Type q10 = q(type, cls, upperBounds[0]);
                    type4 = wildcardType;
                    if (q10 != upperBounds[0]) {
                        return new c(new Type[]{q10}, f32968a);
                    }
                }
            }
        }
        return type4;
    }

    private static Type r(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> c6 = c(typeVariable);
        if (c6 == null) {
            return typeVariable;
        }
        Type e6 = e(type, cls, c6);
        if (!(e6 instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) e6).getActualTypeArguments()[k(c6.getTypeParameters(), typeVariable)];
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
