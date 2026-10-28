package org.apache.commons.lang3.reflect;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.apache.commons.lang3.s;

/* compiled from: MemberUtils.java */
/* loaded from: classes6.dex */
abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final int f86078a = 7;

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?>[] f86079b = {Byte.TYPE, Short.TYPE, Character.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE};

    d() {
    }

    static int a(Constructor<?> constructor, Constructor<?> constructor2, Class<?>[] clsArr) {
        return c(a.a(constructor), a.a(constructor2), clsArr);
    }

    static int b(Method method, Method method2, Class<?>[] clsArr) {
        return c(a.b(method), a.b(method2), clsArr);
    }

    private static int c(a aVar, a aVar2, Class<?>[] clsArr) {
        return Float.compare(f(clsArr, aVar), f(clsArr, aVar2));
    }

    private static float d(Class<?> cls, Class<?> cls2) {
        if (cls2.isPrimitive()) {
            return e(cls, cls2);
        }
        float f4 = 0.0f;
        while (true) {
            if (cls != null && !cls2.equals(cls)) {
                if (cls2.isInterface() && s.P(cls, cls2)) {
                    f4 += 0.25f;
                    break;
                }
                f4 += 1.0f;
                cls = cls.getSuperclass();
            } else {
                break;
            }
        }
        return cls == null ? f4 + 1.5f : f4;
    }

    private static float e(Class<?> cls, Class<?> cls2) {
        float f4;
        if (cls == null) {
            return 1.5f;
        }
        if (cls.isPrimitive()) {
            f4 = 0.0f;
        } else {
            cls = s.d0(cls);
            f4 = 0.1f;
        }
        int i4 = 0;
        while (cls != cls2) {
            Class<?>[] clsArr = f86079b;
            if (i4 >= clsArr.length) {
                break;
            }
            if (cls == clsArr[i4]) {
                f4 += 0.1f;
                if (i4 < clsArr.length - 1) {
                    cls = clsArr[i4 + 1];
                }
            }
            i4++;
        }
        return f4;
    }

    private static float f(Class<?>[] clsArr, a aVar) {
        float d5;
        Class<?>[] c5 = aVar.c();
        boolean d6 = aVar.d();
        int length = c5.length;
        if (d6) {
            length--;
        }
        long j4 = length;
        if (clsArr.length < j4) {
            return Float.MAX_VALUE;
        }
        boolean z4 = false;
        float f4 = 0.0f;
        for (int i4 = 0; i4 < j4; i4++) {
            f4 += d(clsArr[i4], c5[i4]);
        }
        if (!d6) {
            return f4;
        }
        boolean z5 = clsArr.length < c5.length;
        if (clsArr.length == c5.length && clsArr[clsArr.length - 1] != null && clsArr[clsArr.length - 1].isArray()) {
            z4 = true;
        }
        Class<?> componentType = c5[c5.length - 1].getComponentType();
        if (z5) {
            d5 = d(componentType, Object.class);
        } else {
            if (!z4) {
                for (int length2 = c5.length - 1; length2 < clsArr.length; length2++) {
                    f4 += d(clsArr[length2], componentType) + 0.001f;
                }
                return f4;
            }
            d5 = d(clsArr[clsArr.length - 1].getComponentType(), componentType);
        }
        return f4 + d5 + 0.001f;
    }

    static boolean g(Member member) {
        return (member == null || !Modifier.isPublic(member.getModifiers()) || member.isSynthetic()) ? false : true;
    }

    static boolean h(Constructor<?> constructor, Class<?>[] clsArr) {
        return i(a.a(constructor), clsArr);
    }

    private static boolean i(a aVar, Class<?>[] clsArr) {
        Class<?>[] c5 = aVar.c();
        if (s.S(clsArr, c5, true)) {
            return true;
        }
        if (!aVar.d()) {
            return false;
        }
        int i4 = 0;
        while (i4 < c5.length - 1 && i4 < clsArr.length) {
            if (!s.Q(clsArr[i4], c5[i4], true)) {
                return false;
            }
            i4++;
        }
        Class<?> componentType = c5[c5.length - 1].getComponentType();
        while (i4 < clsArr.length) {
            if (!s.Q(clsArr[i4], componentType, true)) {
                return false;
            }
            i4++;
        }
        return true;
    }

    static boolean j(Method method, Class<?>[] clsArr) {
        return i(a.b(method), clsArr);
    }

    static boolean k(int i4) {
        return (i4 & 7) == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean l(AccessibleObject accessibleObject) {
        if (accessibleObject != 0 && !accessibleObject.isAccessible()) {
            Member member = (Member) accessibleObject;
            if (!accessibleObject.isAccessible() && Modifier.isPublic(member.getModifiers()) && k(member.getDeclaringClass().getModifiers())) {
                try {
                    accessibleObject.setAccessible(true);
                    return true;
                } catch (SecurityException unused) {
                }
            }
        }
        return false;
    }

    /* compiled from: MemberUtils.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Class<?>[] f86080a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f86081b;

        private a(Method method) {
            this.f86080a = method.getParameterTypes();
            this.f86081b = method.isVarArgs();
        }

        static a a(Constructor constructor) {
            return new a((Constructor<?>) constructor);
        }

        static a b(Method method) {
            return new a(method);
        }

        private static a e(Constructor<?> constructor) {
            return new a(constructor);
        }

        private static a f(Method method) {
            return new a(method);
        }

        public Class<?>[] c() {
            return this.f86080a;
        }

        public boolean d() {
            return this.f86081b;
        }

        private a(Constructor<?> constructor) {
            this.f86080a = constructor.getParameterTypes();
            this.f86081b = constructor.isVarArgs();
        }
    }
}
