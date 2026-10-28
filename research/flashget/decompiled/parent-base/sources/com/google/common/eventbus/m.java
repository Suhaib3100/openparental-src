package com.google.common.eventbus;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.d0;
import com.google.common.base.l0;
import com.google.common.base.w0;
import com.google.common.cache.CacheLoader;
import com.google.common.collect.d4;
import com.google.common.collect.e7;
import com.google.common.collect.f3;
import com.google.common.collect.l4;
import com.google.common.collect.q3;
import com.google.common.collect.r4;
import com.google.common.collect.u2;
import com.google.common.primitives.r;
import com.google.common.reflect.p;
import com.google.common.util.concurrent.UncheckedExecutionException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: SubscriberRegistry.java */
@e
/* loaded from: classes6.dex */
final class m {

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.common.cache.j<Class<?>, f3<Method>> f56738c = com.google.common.cache.d.D().M().b(new a());

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.common.cache.j<Class<?>, q3<Class<?>>> f56739d = com.google.common.cache.d.D().M().b(new b());

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, CopyOnWriteArraySet<j>> f56740a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    @ma.i
    private final f f56741b;

    /* compiled from: SubscriberRegistry.java */
    class a extends CacheLoader<Class<?>, f3<Method>> {
        a() {
        }

        @Override // com.google.common.cache.CacheLoader
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public f3<Method> d(Class<?> cls) throws Exception {
            return m.e(cls);
        }
    }

    /* compiled from: SubscriberRegistry.java */
    class b extends CacheLoader<Class<?>, q3<Class<?>>> {
        b() {
        }

        @Override // com.google.common.cache.CacheLoader
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public q3<Class<?>> d(Class<?> cls) {
            return q3.A(p.S(cls).D().Y3());
        }
    }

    /* compiled from: SubscriberRegistry.java */
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f56742a;

        /* renamed from: b, reason: collision with root package name */
        private final List<Class<?>> f56743b;

        c(Method method) {
            this.f56742a = method.getName();
            this.f56743b = Arrays.asList(method.getParameterTypes());
        }

        public boolean equals(@zc.a Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f56742a.equals(cVar.f56742a) && this.f56743b.equals(cVar.f56743b);
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f56742a, this.f56743b});
        }
    }

    m(f fVar) {
        fVar.getClass();
        this.f56741b = fVar;
    }

    private r4<Class<?>, j> b(Object obj) {
        u2 I = u2.I();
        e7<Method> it = d(obj.getClass()).iterator();
        while (it.hasNext()) {
            Method next = it.next();
            I.put(next.getParameterTypes()[0], j.c(this.f56741b, obj, next));
        }
        return I;
    }

    @d9.d
    static q3<Class<?>> c(Class<?> cls) {
        try {
            return f56739d.X(cls);
        } catch (UncheckedExecutionException e4) {
            throw w0.q(e4.getCause());
        }
    }

    private static f3<Method> d(Class<?> cls) {
        try {
            return f56738c.X(cls);
        } catch (UncheckedExecutionException e4) {
            w0.w(e4.getCause());
            throw e4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static f3<Method> e(Class<?> cls) {
        Set Y3 = p.S(cls).D().Y3();
        HashMap hashMap = new HashMap();
        Iterator it = Y3.iterator();
        while (it.hasNext()) {
            for (Method method : ((Class) it.next()).getDeclaredMethods()) {
                if (method.isAnnotationPresent(h.class) && !method.isSynthetic()) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    l0.w(parameterTypes.length == 1, ProtectedSandApp.s("\uf5a1"), method, parameterTypes.length);
                    l0.z(!parameterTypes[0].isPrimitive(), ProtectedSandApp.s("\uf5a2"), method, parameterTypes[0].getName(), r.f(parameterTypes[0]).getSimpleName());
                    c cVar = new c(method);
                    if (!hashMap.containsKey(cVar)) {
                        hashMap.put(cVar, method);
                    }
                }
            }
        }
        return f3.x(hashMap.values());
    }

    Iterator<j> f(Object obj) {
        q3<Class<?>> c5 = c(obj.getClass());
        ArrayList u4 = l4.u(c5.size());
        e7<Class<?>> it = c5.iterator();
        while (it.hasNext()) {
            CopyOnWriteArraySet<j> copyOnWriteArraySet = this.f56740a.get(it.next());
            if (copyOnWriteArraySet != null) {
                u4.add(copyOnWriteArraySet.iterator());
            }
        }
        return d4.i(u4.iterator());
    }

    @d9.d
    Set<j> g(Class<?> cls) {
        return (Set) d0.a(this.f56740a.get(cls), q3.I());
    }

    void h(Object obj) {
        for (Map.Entry<Class<?>, Collection<j>> entry : b(obj).f().entrySet()) {
            Class<?> key = entry.getKey();
            Collection<j> value = entry.getValue();
            CopyOnWriteArraySet<j> copyOnWriteArraySet = this.f56740a.get(key);
            if (copyOnWriteArraySet == null) {
                CopyOnWriteArraySet<j> copyOnWriteArraySet2 = new CopyOnWriteArraySet<>();
                copyOnWriteArraySet = (CopyOnWriteArraySet) d0.a(this.f56740a.putIfAbsent(key, copyOnWriteArraySet2), copyOnWriteArraySet2);
            }
            copyOnWriteArraySet.addAll(value);
        }
    }

    void i(Object obj) {
        for (Map.Entry<Class<?>, Collection<j>> entry : b(obj).f().entrySet()) {
            Class<?> key = entry.getKey();
            Collection<j> value = entry.getValue();
            CopyOnWriteArraySet<j> copyOnWriteArraySet = this.f56740a.get(key);
            if (copyOnWriteArraySet == null || !copyOnWriteArraySet.removeAll(value)) {
                String valueOf = String.valueOf(obj);
                throw new IllegalArgumentException(com.google.common.base.h.a(valueOf.length() + 65, ProtectedSandApp.s("\uf5a3"), valueOf, ProtectedSandApp.s("\uf5a4")));
            }
        }
    }
}
