package com.google.common.primitives;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: Primitives.java */
@f
@d9.c
/* loaded from: classes6.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f57530a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f57531b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(16);
        a(linkedHashMap, linkedHashMap2, Boolean.TYPE, Boolean.class);
        a(linkedHashMap, linkedHashMap2, Byte.TYPE, Byte.class);
        a(linkedHashMap, linkedHashMap2, Character.TYPE, Character.class);
        a(linkedHashMap, linkedHashMap2, Double.TYPE, Double.class);
        a(linkedHashMap, linkedHashMap2, Float.TYPE, Float.class);
        a(linkedHashMap, linkedHashMap2, Integer.TYPE, Integer.class);
        a(linkedHashMap, linkedHashMap2, Long.TYPE, Long.class);
        a(linkedHashMap, linkedHashMap2, Short.TYPE, Short.class);
        a(linkedHashMap, linkedHashMap2, Void.TYPE, Void.class);
        f57530a = Collections.unmodifiableMap(linkedHashMap);
        f57531b = Collections.unmodifiableMap(linkedHashMap2);
    }

    private r() {
    }

    private static void a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    public static Set<Class<?>> b() {
        return f57530a.keySet();
    }

    public static Set<Class<?>> c() {
        return f57531b.keySet();
    }

    public static boolean d(Class<?> cls) {
        Map<Class<?>, Class<?>> map = f57531b;
        cls.getClass();
        return map.containsKey(cls);
    }

    public static <T> Class<T> e(Class<T> cls) {
        cls.getClass();
        Class<T> cls2 = (Class) f57531b.get(cls);
        return cls2 == null ? cls : cls2;
    }

    public static <T> Class<T> f(Class<T> cls) {
        cls.getClass();
        Class<T> cls2 = (Class) f57530a.get(cls);
        return cls2 == null ? cls : cls2;
    }
}
