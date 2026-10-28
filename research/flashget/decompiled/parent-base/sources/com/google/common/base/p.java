package com.google.common.base;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: Enums.java */
@o
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @d9.c
    private static final Map<Class<? extends Enum<?>>, Map<String, WeakReference<? extends Enum<?>>>> f54994a = new WeakHashMap();

    /* compiled from: Enums.java */
    private static final class a<T extends Enum<T>> extends m<String, T> implements Serializable {

        /* renamed from: e, reason: collision with root package name */
        private static final long f54995e = 0;

        /* renamed from: d, reason: collision with root package name */
        private final Class<T> f54996d;

        a(Class<T> cls) {
            cls.getClass();
            this.f54996d = cls;
        }

        @Override // com.google.common.base.m, com.google.common.base.x
        public boolean equals(@zc.a Object obj) {
            if (obj instanceof a) {
                return this.f54996d.equals(((a) obj).f54996d);
            }
            return false;
        }

        @Override // com.google.common.base.m
        protected String h(Object obj) {
            return ((Enum) obj).name();
        }

        public int hashCode() {
            return this.f54996d.hashCode();
        }

        @Override // com.google.common.base.m
        protected Object i(String str) {
            return Enum.valueOf(this.f54996d, str);
        }

        protected String o(T t4) {
            return t4.name();
        }

        protected T p(String str) {
            return (T) Enum.valueOf(this.f54996d, str);
        }

        public String toString() {
            String name = this.f54996d.getName();
            return h.a(name.length() + 29, ProtectedSandApp.s("\uf334"), name, ProtectedSandApp.s("\uf335"));
        }
    }

    private p() {
    }

    @d9.c
    static <T extends Enum<T>> Map<String, WeakReference<? extends Enum<?>>> a(Class<T> cls) {
        Map<String, WeakReference<? extends Enum<?>>> map;
        Map<Class<? extends Enum<?>>, Map<String, WeakReference<? extends Enum<?>>>> map2 = f54994a;
        synchronized (map2) {
            try {
                map = map2.get(cls);
                if (map == null) {
                    map = d(cls);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map;
    }

    @d9.c
    public static Field b(Enum<?> r12) {
        try {
            return r12.getDeclaringClass().getDeclaredField(r12.name());
        } catch (NoSuchFieldException e4) {
            throw new AssertionError(e4);
        }
    }

    public static <T extends Enum<T>> g0<T> c(Class<T> cls, String str) {
        cls.getClass();
        str.getClass();
        return k0.e(cls, str);
    }

    @d9.c
    private static <T extends Enum<T>> Map<String, WeakReference<? extends Enum<?>>> d(Class<T> cls) {
        HashMap hashMap = new HashMap();
        Iterator it = EnumSet.allOf(cls).iterator();
        while (it.hasNext()) {
            Enum r22 = (Enum) it.next();
            hashMap.put(r22.name(), new WeakReference(r22));
        }
        f54994a.put(cls, hashMap);
        return hashMap;
    }

    public static <T extends Enum<T>> m<String, T> e(Class<T> cls) {
        return new a(cls);
    }
}
