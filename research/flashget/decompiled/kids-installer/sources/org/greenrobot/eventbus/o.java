package org.greenrobot.eventbus;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Typography;

/* compiled from: SubscriberMethodFinder.java */
/* loaded from: classes5.dex */
class o {

    /* renamed from: d, reason: collision with root package name */
    private static final int f32202d = 64;

    /* renamed from: e, reason: collision with root package name */
    private static final int f32203e = 4096;

    /* renamed from: f, reason: collision with root package name */
    private static final int f32204f = 5192;

    /* renamed from: h, reason: collision with root package name */
    private static final int f32206h = 4;

    /* renamed from: a, reason: collision with root package name */
    private List<org.greenrobot.eventbus.meta.d> f32208a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f32209b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f32210c;

    /* renamed from: g, reason: collision with root package name */
    private static final Map<Class<?>, List<n>> f32205g = new ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    private static final a[] f32207i = new a[4];

    /* compiled from: SubscriberMethodFinder.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        final List<n> f32211a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        final Map<Class, Object> f32212b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        final Map<String, Class> f32213c = new HashMap();

        /* renamed from: d, reason: collision with root package name */
        final StringBuilder f32214d = new StringBuilder(128);

        /* renamed from: e, reason: collision with root package name */
        Class<?> f32215e;

        /* renamed from: f, reason: collision with root package name */
        Class<?> f32216f;

        /* renamed from: g, reason: collision with root package name */
        boolean f32217g;

        /* renamed from: h, reason: collision with root package name */
        org.greenrobot.eventbus.meta.c f32218h;

        a() {
        }

        private boolean b(Method method, Class<?> cls) {
            this.f32214d.setLength(0);
            this.f32214d.append(method.getName());
            StringBuilder sb = this.f32214d;
            sb.append(Typography.f27130f);
            sb.append(cls.getName());
            String sb2 = this.f32214d.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class put = this.f32213c.put(sb2, declaringClass);
            if (put == null || put.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.f32213c.put(sb2, put);
            return false;
        }

        boolean a(Method method, Class<?> cls) {
            Object put = this.f32212b.put(cls, method);
            if (put == null) {
                return true;
            }
            if (put instanceof Method) {
                if (!b((Method) put, cls)) {
                    throw new IllegalStateException();
                }
                this.f32212b.put(cls, this);
            }
            return b(method, cls);
        }

        void c(Class<?> cls) {
            this.f32216f = cls;
            this.f32215e = cls;
            this.f32217g = false;
            this.f32218h = null;
        }

        void d() {
            if (this.f32217g) {
                this.f32216f = null;
                return;
            }
            Class<? super Object> superclass = this.f32216f.getSuperclass();
            this.f32216f = superclass;
            String name = superclass.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.") || name.startsWith("androidx.")) {
                this.f32216f = null;
            }
        }

        void e() {
            this.f32211a.clear();
            this.f32212b.clear();
            this.f32213c.clear();
            this.f32214d.setLength(0);
            this.f32215e = null;
            this.f32216f = null;
            this.f32217g = false;
            this.f32218h = null;
        }
    }

    o(List<org.greenrobot.eventbus.meta.d> list, boolean z5, boolean z6) {
        this.f32208a = list;
        this.f32209b = z5;
        this.f32210c = z6;
    }

    static void a() {
        f32205g.clear();
    }

    private List<n> c(Class<?> cls) {
        a h5 = h();
        h5.c(cls);
        while (h5.f32216f != null) {
            org.greenrobot.eventbus.meta.c g5 = g(h5);
            h5.f32218h = g5;
            if (g5 != null) {
                for (n nVar : g5.a()) {
                    if (h5.a(nVar.f32196a, nVar.f32198c)) {
                        h5.f32211a.add(nVar);
                    }
                }
            } else {
                e(h5);
            }
            h5.d();
        }
        return f(h5);
    }

    private List<n> d(Class<?> cls) {
        a h5 = h();
        h5.c(cls);
        while (h5.f32216f != null) {
            e(h5);
            h5.d();
        }
        return f(h5);
    }

    private void e(a aVar) {
        Method[] methods;
        try {
            try {
                methods = aVar.f32216f.getDeclaredMethods();
            } catch (LinkageError e6) {
                String concat = "Could not inspect methods of ".concat(aVar.f32216f.getName());
                throw new EventBusException(this.f32210c ? androidx.concurrent.futures.b.a(concat, ". Please consider using EventBus annotation processor to avoid reflection.") : androidx.concurrent.futures.b.a(concat, ". Please make this class visible to EventBus annotation processor to avoid reflection."), e6);
            }
        } catch (Throwable unused) {
            methods = aVar.f32216f.getMethods();
            aVar.f32217g = true;
        }
        for (Method method : methods) {
            int modifiers = method.getModifiers();
            if ((modifiers & 1) != 0 && (modifiers & f32204f) == 0) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    l lVar = (l) method.getAnnotation(l.class);
                    if (lVar != null) {
                        Class<?> cls = parameterTypes[0];
                        if (aVar.a(method, cls)) {
                            aVar.f32211a.add(new n(method, cls, lVar.threadMode(), lVar.priority(), lVar.sticky()));
                        }
                    }
                } else if (this.f32209b && method.isAnnotationPresent(l.class)) {
                    StringBuilder a6 = androidx.appcompat.view.g.a("@Subscribe method ", method.getDeclaringClass().getName() + "." + method.getName(), "must have exactly 1 parameter but has ");
                    a6.append(parameterTypes.length);
                    throw new EventBusException(a6.toString());
                }
            } else if (this.f32209b && method.isAnnotationPresent(l.class)) {
                throw new EventBusException(androidx.concurrent.futures.b.a(method.getDeclaringClass().getName() + "." + method.getName(), " is a illegal @Subscribe method: must be public, non-static, and non-abstract"));
            }
        }
    }

    private List<n> f(a aVar) {
        ArrayList arrayList = new ArrayList(aVar.f32211a);
        aVar.e();
        synchronized (f32207i) {
            int i5 = 0;
            while (true) {
                if (i5 >= 4) {
                    break;
                }
                a[] aVarArr = f32207i;
                if (aVarArr[i5] == null) {
                    aVarArr[i5] = aVar;
                    break;
                }
                i5++;
            }
        }
        return arrayList;
    }

    private org.greenrobot.eventbus.meta.c g(a aVar) {
        org.greenrobot.eventbus.meta.c cVar = aVar.f32218h;
        if (cVar != null && cVar.b() != null) {
            org.greenrobot.eventbus.meta.c b6 = aVar.f32218h.b();
            if (aVar.f32216f == b6.d()) {
                return b6;
            }
        }
        List<org.greenrobot.eventbus.meta.d> list = this.f32208a;
        if (list == null) {
            return null;
        }
        Iterator<org.greenrobot.eventbus.meta.d> it = list.iterator();
        while (it.hasNext()) {
            org.greenrobot.eventbus.meta.c a6 = it.next().a(aVar.f32216f);
            if (a6 != null) {
                return a6;
            }
        }
        return null;
    }

    private a h() {
        synchronized (f32207i) {
            for (int i5 = 0; i5 < 4; i5++) {
                a[] aVarArr = f32207i;
                a aVar = aVarArr[i5];
                if (aVar != null) {
                    aVarArr[i5] = null;
                    return aVar;
                }
            }
            return new a();
        }
    }

    List<n> b(Class<?> cls) {
        Map<Class<?>, List<n>> map = f32205g;
        List<n> list = map.get(cls);
        if (list != null) {
            return list;
        }
        List<n> d6 = this.f32210c ? d(cls) : c(cls);
        if (!d6.isEmpty()) {
            map.put(cls, d6);
            return d6;
        }
        throw new EventBusException("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
    }
}
