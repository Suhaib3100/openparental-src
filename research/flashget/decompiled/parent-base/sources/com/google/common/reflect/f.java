package com.google.common.reflect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.f3;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

/* compiled from: Invokable.java */
@d9.a
@d
/* loaded from: classes6.dex */
public abstract class f<T, R> implements AnnotatedElement, Member {

    /* renamed from: b, reason: collision with root package name */
    private final AccessibleObject f57573b;

    /* renamed from: c, reason: collision with root package name */
    private final Member f57574c;

    /* compiled from: Invokable.java */
    static class a<T> extends f<T, T> {

        /* renamed from: d, reason: collision with root package name */
        final Constructor<?> f57575d;

        a(Constructor<?> constructor) {
            super(constructor);
            this.f57575d = constructor;
        }

        private boolean M0() {
            Class<?> declaringClass = this.f57575d.getDeclaringClass();
            if (declaringClass.getEnclosingConstructor() != null) {
                return true;
            }
            return declaringClass.getEnclosingMethod() != null ? !Modifier.isStatic(r1.getModifiers()) : (declaringClass.getEnclosingClass() == null || Modifier.isStatic(declaringClass.getModifiers())) ? false : true;
        }

        @Override // com.google.common.reflect.f
        public final boolean G0() {
            return this.f57575d.isVarArgs();
        }

        @Override // com.google.common.reflect.f
        public final TypeVariable<?>[] getTypeParameters() {
            TypeVariable<Class<? super T>>[] typeParameters = getDeclaringClass().getTypeParameters();
            TypeVariable<Constructor<?>>[] typeParameters2 = this.f57575d.getTypeParameters();
            TypeVariable<?>[] typeVariableArr = new TypeVariable[typeParameters.length + typeParameters2.length];
            System.arraycopy(typeParameters, 0, typeVariableArr, 0, typeParameters.length);
            System.arraycopy(typeParameters2, 0, typeVariableArr, typeParameters.length, typeParameters2.length);
            return typeVariableArr;
        }

        @Override // com.google.common.reflect.f
        Type[] l0() {
            return this.f57575d.getGenericExceptionTypes();
        }

        @Override // com.google.common.reflect.f
        Type[] m0() {
            Type[] genericParameterTypes = this.f57575d.getGenericParameterTypes();
            if (genericParameterTypes.length <= 0 || !M0()) {
                return genericParameterTypes;
            }
            Class<?>[] parameterTypes = this.f57575d.getParameterTypes();
            return (genericParameterTypes.length == parameterTypes.length && parameterTypes[0] == getDeclaringClass().getEnclosingClass()) ? (Type[]) Arrays.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length) : genericParameterTypes;
        }

        @Override // com.google.common.reflect.f
        Type n0() {
            Class<? super T> declaringClass = getDeclaringClass();
            TypeVariable<Class<? super T>>[] typeParameters = declaringClass.getTypeParameters();
            return typeParameters.length > 0 ? s.l(declaringClass, typeParameters) : declaringClass;
        }

        @Override // com.google.common.reflect.f
        final Annotation[][] p0() {
            return this.f57575d.getParameterAnnotations();
        }

        @Override // com.google.common.reflect.f
        final Object t0(@zc.a Object obj, Object[] objArr) throws InvocationTargetException, IllegalAccessException {
            try {
                return this.f57575d.newInstance(objArr);
            } catch (InstantiationException e4) {
                String valueOf = String.valueOf(this.f57575d);
                throw new RuntimeException(com.google.common.base.i.a(valueOf.length() + 8, valueOf, ProtectedSandApp.s("蘿")), e4);
            }
        }

        @Override // com.google.common.reflect.f
        public final boolean y0() {
            return false;
        }
    }

    /* compiled from: Invokable.java */
    static class b<T> extends f<T, Object> {

        /* renamed from: d, reason: collision with root package name */
        final Method f57576d;

        b(Method method) {
            super(method);
            this.f57576d = method;
        }

        @Override // com.google.common.reflect.f
        public final boolean G0() {
            return this.f57576d.isVarArgs();
        }

        @Override // com.google.common.reflect.f
        public final TypeVariable<?>[] getTypeParameters() {
            return this.f57576d.getTypeParameters();
        }

        @Override // com.google.common.reflect.f
        Type[] l0() {
            return this.f57576d.getGenericExceptionTypes();
        }

        @Override // com.google.common.reflect.f
        Type[] m0() {
            return this.f57576d.getGenericParameterTypes();
        }

        @Override // com.google.common.reflect.f
        Type n0() {
            return this.f57576d.getGenericReturnType();
        }

        @Override // com.google.common.reflect.f
        final Annotation[][] p0() {
            return this.f57576d.getParameterAnnotations();
        }

        @Override // com.google.common.reflect.f
        @zc.a
        final Object t0(@zc.a Object obj, Object[] objArr) throws InvocationTargetException, IllegalAccessException {
            return this.f57576d.invoke(obj, objArr);
        }

        @Override // com.google.common.reflect.f
        public final boolean y0() {
            return (w0() || A0() || D0() || Modifier.isFinal(getDeclaringClass().getModifiers())) ? false : true;
        }
    }

    <M extends AccessibleObject & Member> f(M m4) {
        m4.getClass();
        this.f57573b = m4;
        this.f57574c = m4;
    }

    public static <T> f<T, T> c(Constructor<T> constructor) {
        return new a(constructor);
    }

    public static f<?, Object> d(Method method) {
        return new b(method);
    }

    public final boolean A0() {
        return Modifier.isPrivate(this.f57574c.getModifiers());
    }

    public final boolean B0() {
        return Modifier.isProtected(this.f57574c.getModifiers());
    }

    public final boolean C0() {
        return Modifier.isPublic(this.f57574c.getModifiers());
    }

    public final boolean D0() {
        return Modifier.isStatic(this.f57574c.getModifiers());
    }

    public final boolean E0() {
        return Modifier.isSynchronized(this.f57574c.getModifiers());
    }

    final boolean F0() {
        return Modifier.isTransient(this.f57574c.getModifiers());
    }

    public abstract boolean G0();

    final boolean H0() {
        return Modifier.isVolatile(this.f57574c.getModifiers());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R1 extends R> f<T, R1> I0(p<R1> pVar) {
        if (pVar.M(r0())) {
            return this;
        }
        String valueOf = String.valueOf(r0());
        String valueOf2 = String.valueOf(pVar);
        throw new IllegalArgumentException(com.google.common.base.e.a(valueOf2.length() + valueOf.length() + 35, ProtectedSandApp.s("癩"), valueOf, ProtectedSandApp.s("羅"), valueOf2));
    }

    public final <R1 extends R> f<T, R1> J0(Class<R1> cls) {
        return I0(p.S(cls));
    }

    public final void K0(boolean z4) {
        this.f57573b.setAccessible(z4);
    }

    public final boolean L0() {
        try {
            this.f57573b.setAccessible(true);
            return true;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    public boolean equals(@zc.a Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return o0().equals(fVar.o0()) && this.f57574c.equals(fVar.f57574c);
    }

    @Override // java.lang.reflect.AnnotatedElement
    @zc.a
    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this.f57573b.getAnnotation(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getAnnotations() {
        return this.f57573b.getAnnotations();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getDeclaredAnnotations() {
        return this.f57573b.getDeclaredAnnotations();
    }

    @Override // java.lang.reflect.Member
    public final Class<? super T> getDeclaringClass() {
        return (Class<? super T>) this.f57574c.getDeclaringClass();
    }

    @Override // java.lang.reflect.Member
    public final int getModifiers() {
        return this.f57574c.getModifiers();
    }

    @Override // java.lang.reflect.Member
    public final String getName() {
        return this.f57574c.getName();
    }

    public abstract TypeVariable<?>[] getTypeParameters();

    public int hashCode() {
        return this.f57574c.hashCode();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        return this.f57573b.isAnnotationPresent(cls);
    }

    @Override // java.lang.reflect.Member
    public final boolean isSynthetic() {
        return this.f57574c.isSynthetic();
    }

    public final f3<p<? extends Throwable>> k0() {
        f3.a r4 = f3.r();
        for (Type type : l0()) {
            r4.j(p.T(type));
        }
        return r4.e();
    }

    abstract Type[] l0();

    abstract Type[] m0();

    abstract Type n0();

    public p<T> o0() {
        return p.S(this.f57574c.getDeclaringClass());
    }

    abstract Annotation[][] p0();

    public final f3<i> q0() {
        Type[] m02 = m0();
        Annotation[][] p02 = p0();
        f3.a r4 = f3.r();
        for (int i4 = 0; i4 < m02.length; i4++) {
            r4.j(new i(this, i4, p.T(m02[i4]), p02[i4]));
        }
        return r4.e();
    }

    public final p<? extends R> r0() {
        return (p<? extends R>) p.T(n0());
    }

    @zc.a
    @f9.a
    public final R s0(@zc.a T t4, Object... objArr) throws InvocationTargetException, IllegalAccessException {
        objArr.getClass();
        return (R) t0(t4, objArr);
    }

    @zc.a
    abstract Object t0(@zc.a Object obj, Object[] objArr) throws InvocationTargetException, IllegalAccessException;

    public String toString() {
        return this.f57574c.toString();
    }

    public final boolean u0() {
        return Modifier.isAbstract(this.f57574c.getModifiers());
    }

    public final boolean v0() {
        return this.f57573b.isAccessible();
    }

    public final boolean w0() {
        return Modifier.isFinal(this.f57574c.getModifiers());
    }

    public final boolean x0() {
        return Modifier.isNative(this.f57574c.getModifiers());
    }

    public abstract boolean y0();

    public final boolean z0() {
        return (A0() || C0() || B0()) ? false : true;
    }
}
