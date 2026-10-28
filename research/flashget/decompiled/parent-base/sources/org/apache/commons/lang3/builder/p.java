package org.apache.commons.lang3.builder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import org.apache.commons.lang3.k1;

/* compiled from: ReflectionToStringBuilder.java */
/* loaded from: classes6.dex */
public class p extends r {

    /* renamed from: f, reason: collision with root package name */
    private boolean f85770f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f85771g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f85772h;

    /* renamed from: i, reason: collision with root package name */
    protected String[] f85773i;

    /* renamed from: j, reason: collision with root package name */
    private Class<?> f85774j;

    public p(Object obj) {
        super(k0(obj), null, null);
        this.f85770f = false;
        this.f85771g = false;
        this.f85774j = null;
    }

    public static String A0(Object obj, t tVar) {
        return D0(obj, tVar, false, false, null);
    }

    public static String B0(Object obj, t tVar, boolean z4) {
        return D0(obj, tVar, z4, false, null);
    }

    public static String C0(Object obj, t tVar, boolean z4, boolean z5) {
        return D0(obj, tVar, z4, z5, null);
    }

    public static <T> String D0(T t4, t tVar, boolean z4, boolean z5, Class<? super T> cls) {
        return new p(t4, tVar, null, cls, z4, z5).toString();
    }

    public static <T> String E0(T t4, t tVar, boolean z4, boolean z5, boolean z6, Class<? super T> cls) {
        return new p(t4, tVar, null, cls, z4, z5, z6).toString();
    }

    public static String F0(Object obj, Collection<String> collection) {
        return G0(obj, x0(collection));
    }

    public static String G0(Object obj, String... strArr) {
        return new p(obj).u0(strArr).toString();
    }

    private static Object k0(Object obj) {
        return k1.b0(obj, "The Object passed in should not be null.", new Object[0]);
    }

    static String[] x0(Collection<String> collection) {
        return collection == null ? org.apache.commons.lang3.e.f85969u : y0(collection.toArray());
    }

    static String[] y0(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj.toString());
            }
        }
        return (String[]) arrayList.toArray(org.apache.commons.lang3.e.f85969u);
    }

    public static String z0(Object obj) {
        return D0(obj, null, false, false, null);
    }

    protected boolean i0(Field field) {
        if (field.getName().indexOf(36) != -1) {
            return false;
        }
        if (Modifier.isTransient(field.getModifiers()) && !p0()) {
            return false;
        }
        if (Modifier.isStatic(field.getModifiers()) && !o0()) {
            return false;
        }
        String[] strArr = this.f85773i;
        if (strArr == null || Arrays.binarySearch(strArr, field.getName()) < 0) {
            return !field.isAnnotationPresent(s.class);
        }
        return false;
    }

    protected void j0(Class<?> cls) {
        if (cls.isArray()) {
            r0(a0());
            return;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        Arrays.sort(declaredFields, Comparator.comparing(new i()));
        AccessibleObject.setAccessible(declaredFields, true);
        for (Field field : declaredFields) {
            String name = field.getName();
            if (i0(field)) {
                try {
                    Object n02 = n0(field);
                    if (!this.f85772h || n02 != null) {
                        p(name, n02, !field.isAnnotationPresent(u.class));
                    }
                } catch (IllegalAccessException e4) {
                    throw new InternalError("Unexpected IllegalAccessException: " + e4.getMessage());
                }
            }
        }
    }

    public String[] l0() {
        return (String[]) this.f85773i.clone();
    }

    public Class<?> m0() {
        return this.f85774j;
    }

    protected Object n0(Field field) throws IllegalAccessException {
        return field.get(a0());
    }

    public boolean o0() {
        return this.f85770f;
    }

    public boolean p0() {
        return this.f85771g;
    }

    public boolean q0() {
        return this.f85772h;
    }

    public p r0(Object obj) {
        c0().K0(b0(), null, obj);
        return this;
    }

    public void s0(boolean z4) {
        this.f85770f = z4;
    }

    public void t0(boolean z4) {
        this.f85771g = z4;
    }

    @Override // org.apache.commons.lang3.builder.r
    public String toString() {
        if (a0() == null) {
            return c0().t0();
        }
        Class<?> cls = a0().getClass();
        j0(cls);
        while (cls.getSuperclass() != null && cls != m0()) {
            cls = cls.getSuperclass();
            j0(cls);
        }
        return super.toString();
    }

    public p u0(String... strArr) {
        if (strArr == null) {
            this.f85773i = null;
        } else {
            String[] y02 = y0(strArr);
            this.f85773i = y02;
            Arrays.sort(y02);
        }
        return this;
    }

    public void v0(boolean z4) {
        this.f85772h = z4;
    }

    public void w0(Class<?> cls) {
        Object a02;
        if (cls != null && (a02 = a0()) != null && !cls.isInstance(a02)) {
            throw new IllegalArgumentException("Specified class is not a superclass of the object");
        }
        this.f85774j = cls;
    }

    public p(Object obj, t tVar) {
        super(k0(obj), tVar, null);
        this.f85770f = false;
        this.f85771g = false;
        this.f85774j = null;
    }

    public p(Object obj, t tVar, StringBuffer stringBuffer) {
        super(k0(obj), tVar, stringBuffer);
        this.f85770f = false;
        this.f85771g = false;
        this.f85774j = null;
    }

    public <T> p(T t4, t tVar, StringBuffer stringBuffer, Class<? super T> cls, boolean z4, boolean z5) {
        super(k0(t4), tVar, stringBuffer);
        this.f85770f = false;
        this.f85771g = false;
        this.f85774j = null;
        w0(cls);
        t0(z4);
        s0(z5);
    }

    public <T> p(T t4, t tVar, StringBuffer stringBuffer, Class<? super T> cls, boolean z4, boolean z5, boolean z6) {
        super(k0(t4), tVar, stringBuffer);
        this.f85770f = false;
        this.f85771g = false;
        this.f85774j = null;
        w0(cls);
        t0(z4);
        s0(z5);
        v0(z6);
    }
}
