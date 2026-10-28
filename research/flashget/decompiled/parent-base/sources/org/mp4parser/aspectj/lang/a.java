package org.mp4parser.aspectj.lang;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* compiled from: Aspects14.java */
/* loaded from: classes9.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static final Class[] f87681b;

    /* renamed from: c, reason: collision with root package name */
    private static final Class[] f87682c;

    /* renamed from: d, reason: collision with root package name */
    private static final Object[] f87683d;

    /* renamed from: g, reason: collision with root package name */
    static /* synthetic */ Class f87686g;

    /* renamed from: h, reason: collision with root package name */
    static /* synthetic */ Class f87687h;

    /* renamed from: e, reason: collision with root package name */
    private static final String f87684e = "aspectOf";

    /* renamed from: f, reason: collision with root package name */
    private static final String f87685f = "hasAspect";

    /* renamed from: a, reason: collision with root package name */
    private static final Class[] f87680a = new Class[0];

    static {
        Class cls = f87686g;
        if (cls == null) {
            cls = f("java.lang.Object");
            f87686g = cls;
        }
        f87681b = new Class[]{cls};
        Class cls2 = f87687h;
        if (cls2 == null) {
            cls2 = f("java.lang.Class");
            f87687h = cls2;
        }
        f87682c = new Class[]{cls2};
        f87683d = new Object[0];
    }

    public static Object a(Class cls) throws NoAspectBoundException {
        try {
            return k(cls).invoke(null, f87683d);
        } catch (InvocationTargetException e4) {
            throw new NoAspectBoundException(cls.getName(), e4);
        } catch (Exception e5) {
            throw new NoAspectBoundException(cls.getName(), e5);
        }
    }

    public static Object b(Class cls, Class cls2) throws NoAspectBoundException {
        try {
            return i(cls).invoke(null, cls2);
        } catch (InvocationTargetException e4) {
            throw new NoAspectBoundException(cls.getName(), e4);
        } catch (Exception e5) {
            throw new NoAspectBoundException(cls.getName(), e5);
        }
    }

    public static Object c(Class cls, Object obj) throws NoAspectBoundException {
        try {
            return g(cls).invoke(null, obj);
        } catch (InvocationTargetException e4) {
            throw new NoAspectBoundException(cls.getName(), e4);
        } catch (Exception e5) {
            throw new NoAspectBoundException(cls.getName(), e5);
        }
    }

    private static Method d(Method method, Class cls) throws NoSuchMethodException {
        method.setAccessible(true);
        if (method.isAccessible() && Modifier.isPublic(method.getModifiers()) && Modifier.isStatic(method.getModifiers())) {
            return method;
        }
        throw new NoSuchMethodException(cls.getName().concat(".aspectOf(..) is not accessible public static"));
    }

    private static Method e(Method method, Class cls) throws NoSuchMethodException {
        method.setAccessible(true);
        if (method.isAccessible() && Modifier.isPublic(method.getModifiers()) && Modifier.isStatic(method.getModifiers())) {
            return method;
        }
        throw new NoSuchMethodException(cls.getName().concat(".hasAspect(..) is not accessible public static"));
    }

    static /* synthetic */ Class f(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e4) {
            throw new NoClassDefFoundError(e4.getMessage());
        }
    }

    private static Method g(Class cls) throws NoSuchMethodException {
        return d(cls.getDeclaredMethod("aspectOf", f87681b), cls);
    }

    private static Method h(Class cls) throws NoSuchMethodException {
        return e(cls.getDeclaredMethod("hasAspect", f87681b), cls);
    }

    private static Method i(Class cls) throws NoSuchMethodException {
        return d(cls.getDeclaredMethod("aspectOf", f87682c), cls);
    }

    private static Method j(Class cls) throws NoSuchMethodException {
        return e(cls.getDeclaredMethod("hasAspect", f87682c), cls);
    }

    private static Method k(Class cls) throws NoSuchMethodException {
        return d(cls.getDeclaredMethod("aspectOf", f87680a), cls);
    }

    private static Method l(Class cls) throws NoSuchMethodException {
        return e(cls.getDeclaredMethod("hasAspect", f87680a), cls);
    }

    public static boolean m(Class cls) throws NoAspectBoundException {
        try {
            return ((Boolean) l(cls).invoke(null, f87683d)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean n(Class cls, Class cls2) throws NoAspectBoundException {
        try {
            return ((Boolean) j(cls).invoke(null, cls2)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean o(Class cls, Object obj) throws NoAspectBoundException {
        try {
            return ((Boolean) h(cls).invoke(null, obj)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
