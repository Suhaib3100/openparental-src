package org.apache.commons.lang3.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.b1;
import org.apache.commons.lang3.k1;
import org.apache.commons.lang3.s;

/* compiled from: FieldUtils.java */
/* loaded from: classes6.dex */
public class b {
    public static void A(Object obj, String str, Object obj2) throws IllegalAccessException {
        B(obj, str, obj2, false);
    }

    public static void B(Object obj, String str, Object obj2, boolean z4) throws IllegalAccessException {
        k1.b0(obj, "target object must not be null", new Object[0]);
        Class<?> cls = obj.getClass();
        Field f4 = f(cls, str, z4);
        k1.B(f4 != null, "Cannot locate declared field %s.%s", cls.getName(), str);
        D(f4, obj, obj2, false);
    }

    public static void C(Field field, Object obj, Object obj2) throws IllegalAccessException {
        D(field, obj, obj2, false);
    }

    public static void D(Field field, Object obj, Object obj2, boolean z4) throws IllegalAccessException {
        k1.b0(field, "The field must not be null", new Object[0]);
        if (!z4 || field.isAccessible()) {
            d.l(field);
        } else {
            field.setAccessible(true);
        }
        field.set(obj, obj2);
    }

    public static void E(Class<?> cls, String str, Object obj) throws IllegalAccessException {
        F(cls, str, obj, false);
    }

    public static void F(Class<?> cls, String str, Object obj, boolean z4) throws IllegalAccessException {
        Field f4 = f(cls, str, z4);
        k1.b0(f4, "Cannot locate field %s on %s", str, cls);
        H(f4, obj, false);
    }

    public static void G(Field field, Object obj) throws IllegalAccessException {
        H(field, obj, false);
    }

    public static void H(Field field, Object obj, boolean z4) throws IllegalAccessException {
        k1.b0(field, "The field must not be null", new Object[0]);
        k1.B(Modifier.isStatic(field.getModifiers()), "The field %s.%s is not static", field.getDeclaringClass().getName(), field.getName());
        D(field, null, obj, z4);
    }

    public static Field[] a(Class<?> cls) {
        return (Field[]) b(cls).toArray(org.apache.commons.lang3.e.f85958j);
    }

    public static List<Field> b(Class<?> cls) {
        k1.b0(cls, "The class must not be null", new Object[0]);
        ArrayList arrayList = new ArrayList();
        while (cls != null) {
            Collections.addAll(arrayList, cls.getDeclaredFields());
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    public static Field c(Class<?> cls, String str) {
        return d(cls, str, false);
    }

    public static Field d(Class<?> cls, String str, boolean z4) {
        k1.b0(cls, "The class must not be null", new Object[0]);
        k1.B(b1.K0(str), "The field name must not be blank/empty", new Object[0]);
        try {
            Field declaredField = cls.getDeclaredField(str);
            if (!d.g(declaredField)) {
                if (!z4) {
                    return null;
                }
                declaredField.setAccessible(true);
            }
            return declaredField;
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    public static Field e(Class<?> cls, String str) {
        Field f4 = f(cls, str, false);
        d.l(f4);
        return f4;
    }

    public static Field f(Class<?> cls, String str, boolean z4) {
        Field declaredField;
        k1.b0(cls, "The class must not be null", new Object[0]);
        k1.B(b1.K0(str), "The field name must not be blank/empty", new Object[0]);
        for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            try {
                declaredField = cls2.getDeclaredField(str);
            } catch (NoSuchFieldException unused) {
            }
            if (!Modifier.isPublic(declaredField.getModifiers())) {
                if (z4) {
                    declaredField.setAccessible(true);
                } else {
                    continue;
                }
            }
            return declaredField;
        }
        Iterator<Class<?>> it = s.g(cls).iterator();
        Field field = null;
        while (it.hasNext()) {
            try {
                Field field2 = it.next().getField(str);
                k1.B(field == null, "Reference to field %s is ambiguous relative to %s; a matching field exists on two or more implemented interfaces.", str, cls);
                field = field2;
            } catch (NoSuchFieldException unused2) {
            }
        }
        return field;
    }

    public static List<Field> g(Class<?> cls, Class<? extends Annotation> cls2) {
        k1.b0(cls2, "The annotation class must not be null", new Object[0]);
        List<Field> b5 = b(cls);
        ArrayList arrayList = new ArrayList();
        for (Field field : b5) {
            if (field.getAnnotation(cls2) != null) {
                arrayList.add(field);
            }
        }
        return arrayList;
    }

    public static Field[] h(Class<?> cls, Class<? extends Annotation> cls2) {
        return (Field[]) g(cls, cls2).toArray(org.apache.commons.lang3.e.f85958j);
    }

    public static Object i(Object obj, String str) throws IllegalAccessException {
        return j(obj, str, false);
    }

    public static Object j(Object obj, String str, boolean z4) throws IllegalAccessException {
        k1.b0(obj, "target object must not be null", new Object[0]);
        Class<?> cls = obj.getClass();
        Field d5 = d(cls, str, z4);
        k1.B(d5 != null, "Cannot locate declared field %s.%s", cls, str);
        return p(d5, obj, false);
    }

    public static Object k(Class<?> cls, String str) throws IllegalAccessException {
        return l(cls, str, false);
    }

    public static Object l(Class<?> cls, String str, boolean z4) throws IllegalAccessException {
        Field d5 = d(cls, str, z4);
        k1.b0(d5, "Cannot locate declared field %s.%s", cls.getName(), str);
        return t(d5, false);
    }

    public static Object m(Object obj, String str) throws IllegalAccessException {
        return n(obj, str, false);
    }

    public static Object n(Object obj, String str, boolean z4) throws IllegalAccessException {
        k1.b0(obj, "target object must not be null", new Object[0]);
        Class<?> cls = obj.getClass();
        Field f4 = f(cls, str, z4);
        k1.B(f4 != null, "Cannot locate field %s on %s", str, cls);
        return p(f4, obj, false);
    }

    public static Object o(Field field, Object obj) throws IllegalAccessException {
        return p(field, obj, false);
    }

    public static Object p(Field field, Object obj, boolean z4) throws IllegalAccessException {
        k1.b0(field, "The field must not be null", new Object[0]);
        if (!z4 || field.isAccessible()) {
            d.l(field);
        } else {
            field.setAccessible(true);
        }
        return field.get(obj);
    }

    public static Object q(Class<?> cls, String str) throws IllegalAccessException {
        return r(cls, str, false);
    }

    public static Object r(Class<?> cls, String str, boolean z4) throws IllegalAccessException {
        Field f4 = f(cls, str, z4);
        k1.b0(f4, "Cannot locate field '%s' on %s", str, cls);
        return t(f4, false);
    }

    public static Object s(Field field) throws IllegalAccessException {
        return t(field, false);
    }

    public static Object t(Field field, boolean z4) throws IllegalAccessException {
        k1.b0(field, "The field must not be null", new Object[0]);
        k1.B(Modifier.isStatic(field.getModifiers()), "The field '%s' is not static", field.getName());
        return p(field, null, z4);
    }

    public static void u(Field field) {
        v(field, true);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void v(java.lang.reflect.Field r3, boolean r4) {
        /*
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "The field must not be null"
            org.apache.commons.lang3.k1.b0(r3, r2, r1)
            int r1 = r3.getModifiers()     // Catch: java.lang.IllegalAccessException -> L25 java.lang.NoSuchFieldException -> L27
            boolean r1 = java.lang.reflect.Modifier.isFinal(r1)     // Catch: java.lang.IllegalAccessException -> L25 java.lang.NoSuchFieldException -> L27
            if (r1 == 0) goto L4d
            java.lang.Class<java.lang.reflect.Field> r1 = java.lang.reflect.Field.class
            java.lang.String r2 = "modifiers"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.IllegalAccessException -> L25 java.lang.NoSuchFieldException -> L27
            r2 = 1
            if (r4 == 0) goto L29
            boolean r4 = r1.isAccessible()     // Catch: java.lang.IllegalAccessException -> L25 java.lang.NoSuchFieldException -> L27
            if (r4 != 0) goto L29
            r4 = r2
            goto L2a
        L25:
            r3 = move-exception
            goto L45
        L27:
            r3 = move-exception
            goto L45
        L29:
            r4 = r0
        L2a:
            if (r4 == 0) goto L2f
            r1.setAccessible(r2)     // Catch: java.lang.IllegalAccessException -> L25 java.lang.NoSuchFieldException -> L27
        L2f:
            int r2 = r3.getModifiers()     // Catch: java.lang.Throwable -> L3e
            r2 = r2 & (-17)
            r1.setInt(r3, r2)     // Catch: java.lang.Throwable -> L3e
            if (r4 == 0) goto L4d
            r1.setAccessible(r0)     // Catch: java.lang.IllegalAccessException -> L25 java.lang.NoSuchFieldException -> L27
            goto L4d
        L3e:
            r3 = move-exception
            if (r4 == 0) goto L44
            r1.setAccessible(r0)     // Catch: java.lang.IllegalAccessException -> L25 java.lang.NoSuchFieldException -> L27
        L44:
            throw r3     // Catch: java.lang.IllegalAccessException -> L25 java.lang.NoSuchFieldException -> L27
        L45:
            org.apache.commons.lang3.n0 r4 = org.apache.commons.lang3.n0.JAVA_12
            boolean r4 = org.apache.commons.lang3.c1.n(r4)
            if (r4 != 0) goto L4e
        L4d:
            return
        L4e:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "In java 12+ final cannot be removed."
            r4.<init>(r0, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.reflect.b.v(java.lang.reflect.Field, boolean):void");
    }

    public static void w(Object obj, String str, Object obj2) throws IllegalAccessException {
        x(obj, str, obj2, false);
    }

    public static void x(Object obj, String str, Object obj2, boolean z4) throws IllegalAccessException {
        k1.b0(obj, "target object must not be null", new Object[0]);
        Class<?> cls = obj.getClass();
        Field d5 = d(cls, str, z4);
        k1.B(d5 != null, "Cannot locate declared field %s.%s", cls.getName(), str);
        D(d5, obj, obj2, false);
    }

    public static void y(Class<?> cls, String str, Object obj) throws IllegalAccessException {
        z(cls, str, obj, false);
    }

    public static void z(Class<?> cls, String str, Object obj, boolean z4) throws IllegalAccessException {
        Field d5 = d(cls, str, z4);
        k1.b0(d5, "Cannot locate declared field %s.%s", cls.getName(), str);
        D(d5, null, obj, false);
    }
}
