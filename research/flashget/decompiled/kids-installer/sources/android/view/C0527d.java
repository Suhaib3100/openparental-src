package android.view;

import android.view.t;
import androidx.annotation.q0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ClassesInfoCache.java */
@Deprecated
/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0527d {

    /* renamed from: c, reason: collision with root package name */
    static C0527d f8514c = new C0527d();

    /* renamed from: d, reason: collision with root package name */
    private static final int f8515d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static final int f8516e = 1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f8517f = 2;

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, a> f8518a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Boolean> f8519b = new HashMap();

    /* compiled from: ClassesInfoCache.java */
    @Deprecated
    /* renamed from: androidx.lifecycle.d$a */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        final Map<t.b, List<b>> f8520a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        final Map<b, t.b> f8521b;

        a(Map<b, t.b> map) {
            this.f8521b = map;
            for (Map.Entry<b, t.b> entry : map.entrySet()) {
                t.b value = entry.getValue();
                List<b> list = this.f8520a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f8520a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        private static void b(List<b> list, a0 a0Var, t.b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(a0Var, bVar, obj);
                }
            }
        }

        void a(a0 a0Var, t.b bVar, Object obj) {
            b(this.f8520a.get(bVar), a0Var, bVar, obj);
            b(this.f8520a.get(t.b.ON_ANY), a0Var, bVar, obj);
        }
    }

    /* compiled from: ClassesInfoCache.java */
    @Deprecated
    /* renamed from: androidx.lifecycle.d$b */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        final int f8522a;

        /* renamed from: b, reason: collision with root package name */
        final Method f8523b;

        b(int i5, Method method) {
            this.f8522a = i5;
            this.f8523b = method;
            method.setAccessible(true);
        }

        void a(a0 a0Var, t.b bVar, Object obj) {
            try {
                int i5 = this.f8522a;
                if (i5 == 0) {
                    this.f8523b.invoke(obj, new Object[0]);
                } else if (i5 == 1) {
                    this.f8523b.invoke(obj, a0Var);
                } else {
                    if (i5 != 2) {
                        return;
                    }
                    this.f8523b.invoke(obj, a0Var, bVar);
                }
            } catch (IllegalAccessException e6) {
                throw new RuntimeException(e6);
            } catch (InvocationTargetException e7) {
                throw new RuntimeException("Failed to call observer method", e7.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f8522a == bVar.f8522a && this.f8523b.getName().equals(bVar.f8523b.getName());
        }

        public int hashCode() {
            return this.f8523b.getName().hashCode() + (this.f8522a * 31);
        }
    }

    C0527d() {
    }

    private a a(Class<?> cls, @q0 Method[] methodArr) {
        int i5;
        a c6;
        Class<?> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (c6 = c(superclass)) != null) {
            hashMap.putAll(c6.f8521b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, t.b> entry : c(cls2).f8521b.entrySet()) {
                e(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z5 = false;
        for (Method method : methodArr) {
            l0 l0Var = (l0) method.getAnnotation(l0.class);
            if (l0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i5 = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(a0.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i5 = 1;
                }
                t.b value = l0Var.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(t.b.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != t.b.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i5 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(hashMap, new b(i5, method), value, cls);
                z5 = true;
            }
        }
        a aVar = new a(hashMap);
        this.f8518a.put(cls, aVar);
        this.f8519b.put(cls, Boolean.valueOf(z5));
        return aVar;
    }

    private Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e6) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e6);
        }
    }

    private void e(Map<b, t.b> map, b bVar, t.b bVar2, Class<?> cls) {
        t.b bVar3 = map.get(bVar);
        if (bVar3 == null || bVar2 == bVar3) {
            if (bVar3 == null) {
                map.put(bVar, bVar2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f8523b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + bVar3 + ", new value " + bVar2);
    }

    a c(Class<?> cls) {
        a aVar = this.f8518a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    boolean d(Class<?> cls) {
        Boolean bool = this.f8519b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b6 = b(cls);
        for (Method method : b6) {
            if (((l0) method.getAnnotation(l0.class)) != null) {
                a(cls, b6);
                return true;
            }
        }
        this.f8519b.put(cls, Boolean.FALSE);
        return false;
    }
}
