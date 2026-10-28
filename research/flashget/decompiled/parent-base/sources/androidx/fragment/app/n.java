package androidx.fragment.app;

import androidx.collection.a3;
import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;

/* compiled from: FragmentFactory.java */
/* loaded from: classes3.dex */
public class n {
    private static final a3<ClassLoader, a3<String, Class<?>>> sClassCacheMap = new a3<>();

    static boolean isFragmentClass(@androidx.annotation.o0 ClassLoader classLoader, @androidx.annotation.o0 String str) {
        try {
            return Fragment.class.isAssignableFrom(loadClass(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @androidx.annotation.o0
    private static Class<?> loadClass(@androidx.annotation.o0 ClassLoader classLoader, @androidx.annotation.o0 String str) throws ClassNotFoundException {
        a3<ClassLoader, a3<String, Class<?>>> a3Var = sClassCacheMap;
        a3<String, Class<?>> a3Var2 = a3Var.get(classLoader);
        if (a3Var2 == null) {
            a3Var2 = new a3<>();
            a3Var.put(classLoader, a3Var2);
        }
        Class<?> cls = a3Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        a3Var2.put(str, cls2);
        return cls2;
    }

    @androidx.annotation.o0
    public static Class<? extends Fragment> loadFragmentClass(@androidx.annotation.o0 ClassLoader classLoader, @androidx.annotation.o0 String str) {
        try {
            return loadClass(classLoader, str);
        } catch (ClassCastException e4) {
            throw new Fragment.InstantiationException(android.support.v4.media.d.a("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), (Throwable) e4);
        } catch (ClassNotFoundException e5) {
            throw new Fragment.InstantiationException(android.support.v4.media.d.a("Unable to instantiate fragment ", str, ": make sure class name exists"), (Throwable) e5);
        }
    }

    @androidx.annotation.o0
    public Fragment instantiate(@androidx.annotation.o0 ClassLoader classLoader, @androidx.annotation.o0 String str) {
        try {
            return loadFragmentClass(classLoader, str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e4) {
            throw new Fragment.InstantiationException(android.support.v4.media.d.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), (Throwable) e4);
        } catch (InstantiationException e5) {
            throw new Fragment.InstantiationException(android.support.v4.media.d.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), (Throwable) e5);
        } catch (NoSuchMethodException e6) {
            throw new Fragment.InstantiationException(android.support.v4.media.d.a("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), (Throwable) e6);
        } catch (InvocationTargetException e7) {
            throw new Fragment.InstantiationException(android.support.v4.media.d.a("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), (Throwable) e7);
        }
    }
}
