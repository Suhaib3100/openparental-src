package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;

/* compiled from: FragmentFactory.java */
/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private static final androidx.collection.i<ClassLoader, androidx.collection.i<String, Class<?>>> f8317a = new androidx.collection.i<>();

    static boolean b(@androidx.annotation.o0 ClassLoader classLoader, @androidx.annotation.o0 String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @androidx.annotation.o0
    private static Class<?> c(@androidx.annotation.o0 ClassLoader classLoader, @androidx.annotation.o0 String str) throws ClassNotFoundException {
        androidx.collection.i<ClassLoader, androidx.collection.i<String, Class<?>>> iVar = f8317a;
        androidx.collection.i<String, Class<?>> iVar2 = iVar.get(classLoader);
        if (iVar2 == null) {
            iVar2 = new androidx.collection.i<>();
            iVar.put(classLoader, iVar2);
        }
        Class<?> cls = iVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        iVar2.put(str, cls2);
        return cls2;
    }

    @androidx.annotation.o0
    public static Class<? extends Fragment> d(@androidx.annotation.o0 ClassLoader classLoader, @androidx.annotation.o0 String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e6) {
            throw new Fragment.InstantiationException(androidx.constraintlayout.solver.widgets.analyzer.e.a("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e6);
        } catch (ClassNotFoundException e7) {
            throw new Fragment.InstantiationException(androidx.constraintlayout.solver.widgets.analyzer.e.a("Unable to instantiate fragment ", str, ": make sure class name exists"), e7);
        }
    }

    @androidx.annotation.o0
    public Fragment a(@androidx.annotation.o0 ClassLoader classLoader, @androidx.annotation.o0 String str) {
        try {
            return d(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e6) {
            throw new Fragment.InstantiationException(androidx.constraintlayout.solver.widgets.analyzer.e.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e6);
        } catch (InstantiationException e7) {
            throw new Fragment.InstantiationException(androidx.constraintlayout.solver.widgets.analyzer.e.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e7);
        } catch (NoSuchMethodException e8) {
            throw new Fragment.InstantiationException(androidx.constraintlayout.solver.widgets.analyzer.e.a("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e8);
        } catch (InvocationTargetException e9) {
            throw new Fragment.InstantiationException(androidx.constraintlayout.solver.widgets.analyzer.e.a("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e9);
        }
    }
}
