package android.view;

import android.view.t;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class Lifecycling {

    /* renamed from: a, reason: collision with root package name */
    private static final int f8410a = 1;

    /* renamed from: b, reason: collision with root package name */
    private static final int f8411b = 2;

    /* renamed from: c, reason: collision with root package name */
    private static Map<Class<?>, Integer> f8412c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private static Map<Class<?>, List<Constructor<? extends q>>> f8413d = new HashMap();

    private Lifecycling() {
    }

    private static q a(Constructor<? extends q> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e6) {
            throw new RuntimeException(e6);
        } catch (InstantiationException e7) {
            throw new RuntimeException(e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    @q0
    private static Constructor<? extends q> b(Class<?> cls) {
        try {
            Package r02 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r02 != null ? r02.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String c6 = c(canonicalName);
            if (!name.isEmpty()) {
                c6 = name + "." + c6;
            }
            Constructor declaredConstructor = Class.forName(c6).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException(e6);
        }
    }

    public static String c(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    @o0
    @Deprecated
    static r d(Object obj) {
        final w g5 = g(obj);
        return new r() { // from class: androidx.lifecycle.Lifecycling.1
            @Override // android.view.w
            public void h(@o0 a0 a0Var, @o0 t.b bVar) {
                w.this.h(a0Var, bVar);
            }
        };
    }

    private static int e(Class<?> cls) {
        Integer num = f8412c.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int h5 = h(cls);
        f8412c.put(cls, Integer.valueOf(h5));
        return h5;
    }

    private static boolean f(Class<?> cls) {
        return cls != null && z.class.isAssignableFrom(cls);
    }

    @o0
    static w g(Object obj) {
        boolean z5 = obj instanceof w;
        boolean z6 = obj instanceof p;
        if (z5 && z6) {
            return new FullLifecycleObserverAdapter((p) obj, (w) obj);
        }
        if (z6) {
            return new FullLifecycleObserverAdapter((p) obj, null);
        }
        if (z5) {
            return (w) obj;
        }
        Class<?> cls = obj.getClass();
        if (e(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List<Constructor<? extends q>> list = f8413d.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(a(list.get(0), obj));
        }
        q[] qVarArr = new q[list.size()];
        for (int i5 = 0; i5 < list.size(); i5++) {
            qVarArr[i5] = a(list.get(i5), obj);
        }
        return new CompositeGeneratedAdaptersObserver(qVarArr);
    }

    private static int h(Class<?> cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends q> b6 = b(cls);
        if (b6 != null) {
            f8413d.put(cls, Collections.singletonList(b6));
            return 2;
        }
        if (C0527d.f8514c.d(cls)) {
            return 1;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (!f(superclass)) {
            arrayList = null;
        } else {
            if (e(superclass) == 1) {
                return 1;
            }
            arrayList = new ArrayList(f8413d.get(superclass));
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (f(cls2)) {
                if (e(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.addAll(f8413d.get(cls2));
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f8413d.put(cls, arrayList);
        return 2;
    }
}
