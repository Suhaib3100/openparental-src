package org.apache.commons.lang3.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.apache.commons.lang3.k1;
import org.apache.commons.lang3.s;

/* compiled from: MethodUtils.java */
/* loaded from: classes6.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator<Method> f86082a = Comparator.comparing(new e());

    public static Object A(Class<?> cls, String str, Object... objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Object[] D2 = org.apache.commons.lang3.e.D2(objArr);
        return B(cls, str, D2, s.b0(D2));
    }

    public static Object B(Class<?> cls, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Object[] D2 = org.apache.commons.lang3.e.D2(objArr);
        Method h4 = h(cls, str, org.apache.commons.lang3.e.y2(clsArr));
        if (h4 != null) {
            return h4.invoke(null, C(h4, D2));
        }
        StringBuilder a5 = androidx.appcompat.view.g.a("No such accessible method: ", str, "() on class: ");
        a5.append(cls.getName());
        throw new NoSuchMethodException(a5.toString());
    }

    private static Object[] C(Method method, Object[] objArr) {
        return method.isVarArgs() ? o(objArr, method.getParameterTypes()) : objArr;
    }

    private static int a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (!s.S(clsArr, clsArr2, true)) {
            return -1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < clsArr.length; i5++) {
            if (!clsArr[i5].equals(clsArr2[i5])) {
                i4 = (!s.Q(clsArr[i5], clsArr2[i5], true) || s.Q(clsArr[i5], clsArr2[i5], false)) ? i4 + 2 : i4 + 1;
            }
        }
        return i4;
    }

    public static Method b(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return c(cls.getMethod(str, clsArr));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Method c(Method method) {
        if (!d.g(method)) {
            return null;
        }
        Class<?> declaringClass = method.getDeclaringClass();
        if (Modifier.isPublic(declaringClass.getModifiers())) {
            return method;
        }
        String name = method.getName();
        Class<?>[] parameterTypes = method.getParameterTypes();
        Method d5 = d(declaringClass, name, parameterTypes);
        return d5 == null ? e(declaringClass, name, parameterTypes) : d5;
    }

    private static Method d(Class<?> cls, String str, Class<?>... clsArr) {
        while (cls != null) {
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (Modifier.isPublic(cls2.getModifiers())) {
                    try {
                        return cls2.getDeclaredMethod(str, clsArr);
                    } catch (NoSuchMethodException unused) {
                        Method d5 = d(cls2, str, clsArr);
                        if (d5 != null) {
                            return d5;
                        }
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    private static Method e(Class<?> cls, String str, Class<?>... clsArr) {
        for (Class<? super Object> superclass = cls.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            if (Modifier.isPublic(superclass.getModifiers())) {
                try {
                    return superclass.getMethod(str, clsArr);
                } catch (NoSuchMethodException unused) {
                    return null;
                }
            }
        }
        return null;
    }

    private static List<Class<?>> f(Class<?> cls) {
        Class<?> cls2;
        int i4;
        if (cls == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List<Class<?>> i5 = s.i(cls);
        List<Class<?>> g4 = s.g(cls);
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= g4.size() && i7 >= i5.size()) {
                return arrayList;
            }
            if (i6 >= g4.size()) {
                i4 = i7 + 1;
                cls2 = i5.get(i7);
            } else if (i7 >= i5.size() || i6 < i7 || i7 >= i6) {
                int i10 = i7;
                cls2 = g4.get(i6);
                i6++;
                i4 = i10;
            } else {
                i4 = i7 + 1;
                cls2 = i5.get(i7);
            }
            arrayList.add(cls2);
            i7 = i4;
        }
    }

    public static <A extends Annotation> A g(Method method, Class<A> cls, boolean z4, boolean z5) {
        k1.b0(method, "The method must not be null", new Object[0]);
        k1.b0(cls, "The annotation class must not be null", new Object[0]);
        if (!z5 && !d.g(method)) {
            return null;
        }
        A a5 = (A) method.getAnnotation(cls);
        if (a5 == null && z4) {
            for (Class<?> cls2 : f(method.getDeclaringClass())) {
                Method i4 = z5 ? i(cls2, method.getName(), method.getParameterTypes()) : h(cls2, method.getName(), method.getParameterTypes());
                if (i4 != null && (a5 = (A) i4.getAnnotation(cls)) != null) {
                    break;
                }
            }
        }
        return a5;
    }

    public static Method h(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            d.l(method);
            return method;
        } catch (NoSuchMethodException unused) {
            Method[] methods = cls.getMethods();
            ArrayList arrayList = new ArrayList();
            for (Method method2 : methods) {
                if (method2.getName().equals(str) && d.j(method2, clsArr)) {
                    arrayList.add(method2);
                }
            }
            arrayList.sort(f86082a);
            Iterator it = arrayList.iterator();
            Method method3 = null;
            while (it.hasNext()) {
                Method c5 = c((Method) it.next());
                if (c5 != null && (method3 == null || d.b(c5, method3, clsArr) < 0)) {
                    method3 = c5;
                }
            }
            if (method3 != null) {
                d.l(method3);
            }
            if (method3 != null && method3.isVarArgs() && method3.getParameterTypes().length > 0 && clsArr.length > 0) {
                String name = s.Y(method3.getParameterTypes()[r5.length - 1].getComponentType()).getName();
                Class<?> cls2 = clsArr[clsArr.length - 1];
                String name2 = cls2 == null ? null : cls2.getName();
                String name3 = cls2 == null ? null : cls2.getSuperclass().getName();
                if (name2 != null && name3 != null && !name.equals(name2) && !name.equals(name3)) {
                    return null;
                }
            }
            return method3;
        }
    }

    public static Method i(Class<?> cls, String str, Class<?>... clsArr) {
        k1.b0(cls, "Null class not allowed.", new Object[0]);
        k1.R(str, "Null or blank methodName not allowed.", new Object[0]);
        Method[] declaredMethods = cls.getDeclaredMethods();
        Iterator<Class<?>> it = s.i(cls).iterator();
        while (it.hasNext()) {
            declaredMethods = (Method[]) org.apache.commons.lang3.e.z(declaredMethods, it.next().getDeclaredMethods());
        }
        Method method = null;
        for (Method method2 : declaredMethods) {
            if (str.equals(method2.getName()) && Objects.deepEquals(clsArr, method2.getParameterTypes())) {
                return method2;
            }
            if (str.equals(method2.getName()) && s.S(clsArr, method2.getParameterTypes(), true) && (method == null || a(clsArr, method2.getParameterTypes()) < a(clsArr, method.getParameterTypes()))) {
                method = method2;
            }
        }
        return method;
    }

    public static List<Method> j(Class<?> cls, Class<? extends Annotation> cls2) {
        return k(cls, cls2, false, false);
    }

    public static List<Method> k(Class<?> cls, Class<? extends Annotation> cls2, boolean z4, boolean z5) {
        k1.b0(cls, "The class must not be null", new Object[0]);
        k1.b0(cls2, "The annotation class must not be null", new Object[0]);
        List<Class> f4 = z4 ? f(cls) : new ArrayList();
        f4.add(0, cls);
        ArrayList arrayList = new ArrayList();
        for (Class cls3 : f4) {
            for (Method method : z5 ? cls3.getDeclaredMethods() : cls3.getMethods()) {
                if (method.getAnnotation(cls2) != null) {
                    arrayList.add(method);
                }
            }
        }
        return arrayList;
    }

    public static Method[] l(Class<?> cls, Class<? extends Annotation> cls2) {
        return m(cls, cls2, false, false);
    }

    public static Method[] m(Class<?> cls, Class<? extends Annotation> cls2, boolean z4, boolean z5) {
        return (Method[]) k(cls, cls2, z4, z5).toArray(org.apache.commons.lang3.e.f85965q);
    }

    public static Set<Method> n(Method method, s.c cVar) {
        k1.a0(method);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(method);
        Class<?>[] parameterTypes = method.getParameterTypes();
        Class<?> declaringClass = method.getDeclaringClass();
        Iterator<Class<?>> it = s.O(declaringClass, cVar).iterator();
        it.next();
        while (it.hasNext()) {
            Method h4 = h(it.next(), method.getName(), parameterTypes);
            if (h4 != null) {
                if (!Arrays.equals(h4.getParameterTypes(), parameterTypes)) {
                    Map<TypeVariable<?>, Type> D = i.D(declaringClass, h4.getDeclaringClass());
                    int i4 = 0;
                    while (true) {
                        if (i4 >= parameterTypes.length) {
                            linkedHashSet.add(h4);
                            break;
                        }
                        if (!i.m(i.e0(D, method.getGenericParameterTypes()[i4]), i.e0(D, h4.getGenericParameterTypes()[i4]))) {
                            break;
                        }
                        i4++;
                    }
                } else {
                    linkedHashSet.add(h4);
                }
            }
        }
        return linkedHashSet;
    }

    static Object[] o(Object[] objArr, Class<?>[] clsArr) {
        if (objArr.length == clsArr.length && (objArr[objArr.length - 1] == null || objArr[objArr.length - 1].getClass().equals(clsArr[clsArr.length - 1]))) {
            return objArr;
        }
        Object[] objArr2 = new Object[clsArr.length];
        System.arraycopy(objArr, 0, objArr2, 0, clsArr.length - 1);
        Class<?> componentType = clsArr[clsArr.length - 1].getComponentType();
        int length = (objArr.length - clsArr.length) + 1;
        Object newInstance = Array.newInstance(s.Y(componentType), length);
        System.arraycopy(objArr, clsArr.length - 1, newInstance, 0, length);
        if (componentType.isPrimitive()) {
            newInstance = org.apache.commons.lang3.e.B5(newInstance);
        }
        objArr2[clsArr.length - 1] = newInstance;
        return objArr2;
    }

    public static Object p(Object obj, String str) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return r(obj, str, org.apache.commons.lang3.e.f85966r, null);
    }

    public static Object q(Object obj, String str, Object... objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Object[] D2 = org.apache.commons.lang3.e.D2(objArr);
        return r(obj, str, D2, s.b0(D2));
    }

    public static Object r(Object obj, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Object[] D2 = org.apache.commons.lang3.e.D2(objArr);
        Method b5 = b(obj.getClass(), str, org.apache.commons.lang3.e.y2(clsArr));
        if (b5 != null) {
            return b5.invoke(obj, D2);
        }
        StringBuilder a5 = androidx.appcompat.view.g.a("No such accessible method: ", str, "() on object: ");
        a5.append(obj.getClass().getName());
        throw new NoSuchMethodException(a5.toString());
    }

    public static Object s(Class<?> cls, String str, Object... objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Object[] D2 = org.apache.commons.lang3.e.D2(objArr);
        return t(cls, str, D2, s.b0(D2));
    }

    public static Object t(Class<?> cls, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Object[] D2 = org.apache.commons.lang3.e.D2(objArr);
        Method b5 = b(cls, str, org.apache.commons.lang3.e.y2(clsArr));
        if (b5 != null) {
            return b5.invoke(null, D2);
        }
        StringBuilder a5 = androidx.appcompat.view.g.a("No such accessible method: ", str, "() on class: ");
        a5.append(cls.getName());
        throw new NoSuchMethodException(a5.toString());
    }

    public static Object u(Object obj, String str) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return z(obj, false, str, org.apache.commons.lang3.e.f85966r, null);
    }

    public static Object v(Object obj, String str, Object... objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Object[] D2 = org.apache.commons.lang3.e.D2(objArr);
        return z(obj, false, str, D2, s.b0(D2));
    }

    public static Object w(Object obj, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return z(obj, false, str, objArr, clsArr);
    }

    public static Object x(Object obj, boolean z4, String str) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return z(obj, z4, str, org.apache.commons.lang3.e.f85966r, null);
    }

    public static Object y(Object obj, boolean z4, String str, Object... objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Object[] D2 = org.apache.commons.lang3.e.D2(objArr);
        return z(obj, z4, str, D2, s.b0(D2));
    }

    public static Object z(Object obj, boolean z4, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Method h4;
        String str2;
        Class<?>[] y22 = org.apache.commons.lang3.e.y2(clsArr);
        Object[] D2 = org.apache.commons.lang3.e.D2(objArr);
        if (z4) {
            h4 = i(obj.getClass(), str, y22);
            if (h4 != null && !h4.isAccessible()) {
                h4.setAccessible(true);
            }
            str2 = "No such method: ";
        } else {
            h4 = h(obj.getClass(), str, y22);
            str2 = "No such accessible method: ";
        }
        if (h4 != null) {
            return h4.invoke(obj, C(h4, D2));
        }
        throw new NoSuchMethodException(str2 + str + "() on object: " + obj.getClass().getName());
    }
}
