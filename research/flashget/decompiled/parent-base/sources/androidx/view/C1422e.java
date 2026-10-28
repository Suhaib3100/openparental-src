package androidx.view;

import androidx.annotation.q0;
import androidx.view.AbstractC1450w;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ClassesInfoCache.java */
@Deprecated
/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1422e {

    /* renamed from: c, reason: collision with root package name */
    static C1422e f30282c = new C1422e();

    /* renamed from: d, reason: collision with root package name */
    private static final int f30283d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static final int f30284e = 1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f30285f = 2;

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, a> f30286a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Boolean> f30287b = new HashMap();

    /* compiled from: ClassesInfoCache.java */
    @Deprecated
    /* renamed from: androidx.lifecycle.e$a */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        final Map<AbstractC1450w.a, List<b>> f30288a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        final Map<b, AbstractC1450w.a> f30289b;

        a(Map<b, AbstractC1450w.a> map) {
            this.f30289b = map;
            for (Map.Entry<b, AbstractC1450w.a> entry : map.entrySet()) {
                AbstractC1450w.a value = entry.getValue();
                List<b> list = this.f30288a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f30288a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        private static void b(List<b> list, InterfaceC1423e0 interfaceC1423e0, AbstractC1450w.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(interfaceC1423e0, aVar, obj);
                }
            }
        }

        void a(InterfaceC1423e0 interfaceC1423e0, AbstractC1450w.a aVar, Object obj) {
            b(this.f30288a.get(aVar), interfaceC1423e0, aVar, obj);
            b(this.f30288a.get(AbstractC1450w.a.ON_ANY), interfaceC1423e0, aVar, obj);
        }
    }

    /* compiled from: ClassesInfoCache.java */
    @Deprecated
    /* renamed from: androidx.lifecycle.e$b */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        final int f30290a;

        /* renamed from: b, reason: collision with root package name */
        final Method f30291b;

        b(int i4, Method method) {
            this.f30290a = i4;
            this.f30291b = method;
            method.setAccessible(true);
        }

        void a(InterfaceC1423e0 interfaceC1423e0, AbstractC1450w.a aVar, Object obj) {
            try {
                int i4 = this.f30290a;
                if (i4 == 0) {
                    this.f30291b.invoke(obj, null);
                } else if (i4 == 1) {
                    this.f30291b.invoke(obj, interfaceC1423e0);
                } else {
                    if (i4 != 2) {
                        return;
                    }
                    this.f30291b.invoke(obj, interfaceC1423e0, aVar);
                }
            } catch (IllegalAccessException e4) {
                throw new RuntimeException(e4);
            } catch (InvocationTargetException e5) {
                throw new RuntimeException("Failed to call observer method", e5.getCause());
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
            return this.f30290a == bVar.f30290a && this.f30291b.getName().equals(bVar.f30291b.getName());
        }

        public int hashCode() {
            return this.f30291b.getName().hashCode() + (this.f30290a * 31);
        }
    }

    C1422e() {
    }

    private a a(Class<?> cls, @q0 Method[] methodArr) {
        int i4;
        a c5;
        Class<?> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (c5 = c(superclass)) != null) {
            hashMap.putAll(c5.f30289b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, AbstractC1450w.a> entry : c(cls2).f30289b.entrySet()) {
                e(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z4 = false;
        for (Method method : methodArr) {
            q0 q0Var = (q0) method.getAnnotation(q0.class);
            if (q0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i4 = 0;
                } else {
                    if (!InterfaceC1423e0.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i4 = 1;
                }
                AbstractC1450w.a value = q0Var.value();
                if (parameterTypes.length > 1) {
                    if (!AbstractC1450w.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != AbstractC1450w.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i4 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(hashMap, new b(i4, method), value, cls);
                z4 = true;
            }
        }
        a aVar = new a(hashMap);
        this.f30286a.put(cls, aVar);
        this.f30287b.put(cls, Boolean.valueOf(z4));
        return aVar;
    }

    private Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e4) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e4);
        }
    }

    private void e(Map<b, AbstractC1450w.a> map, b bVar, AbstractC1450w.a aVar, Class<?> cls) {
        AbstractC1450w.a aVar2 = map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f30291b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    a c(Class<?> cls) {
        a aVar = this.f30286a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    boolean d(Class<?> cls) {
        Boolean bool = this.f30287b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b5 = b(cls);
        for (Method method : b5) {
            if (((q0) method.getAnnotation(q0.class)) != null) {
                a(cls, b5);
                return true;
            }
        }
        this.f30287b.put(cls, Boolean.FALSE);
        return false;
    }
}
