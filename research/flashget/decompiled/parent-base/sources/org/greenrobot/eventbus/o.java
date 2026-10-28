package org.greenrobot.eventbus;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.m0;

/* compiled from: SubscriberMethodFinder.java */
/* loaded from: classes6.dex */
class o {

    /* renamed from: d, reason: collision with root package name */
    private static final int f86875d = 64;

    /* renamed from: e, reason: collision with root package name */
    private static final int f86876e = 4096;

    /* renamed from: f, reason: collision with root package name */
    private static final int f86877f = 5192;

    /* renamed from: h, reason: collision with root package name */
    private static final int f86879h = 4;

    /* renamed from: a, reason: collision with root package name */
    private List<org.greenrobot.eventbus.meta.d> f86881a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f86882b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f86883c;

    /* renamed from: g, reason: collision with root package name */
    private static final Map<Class<?>, List<n>> f86878g = new ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    private static final a[] f86880i = new a[4];

    /* compiled from: SubscriberMethodFinder.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        final List<n> f86884a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        final Map<Class, Object> f86885b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        final Map<String, Class> f86886c = new HashMap();

        /* renamed from: d, reason: collision with root package name */
        final StringBuilder f86887d = new StringBuilder(128);

        /* renamed from: e, reason: collision with root package name */
        Class<?> f86888e;

        /* renamed from: f, reason: collision with root package name */
        Class<?> f86889f;

        /* renamed from: g, reason: collision with root package name */
        boolean f86890g;

        /* renamed from: h, reason: collision with root package name */
        org.greenrobot.eventbus.meta.c f86891h;

        a() {
        }

        private boolean b(Method method, Class<?> cls) {
            this.f86887d.setLength(0);
            this.f86887d.append(method.getName());
            StringBuilder sb = this.f86887d;
            sb.append(m0.greater);
            sb.append(cls.getName());
            String sb2 = this.f86887d.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class put = this.f86886c.put(sb2, declaringClass);
            if (put == null || put.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.f86886c.put(sb2, put);
            return false;
        }

        boolean a(Method method, Class<?> cls) {
            Object put = this.f86885b.put(cls, method);
            if (put == null) {
                return true;
            }
            if (put instanceof Method) {
                if (!b((Method) put, cls)) {
                    throw new IllegalStateException();
                }
                this.f86885b.put(cls, this);
            }
            return b(method, cls);
        }

        void c(Class<?> cls) {
            this.f86889f = cls;
            this.f86888e = cls;
            this.f86890g = false;
            this.f86891h = null;
        }

        void d() {
            if (this.f86890g) {
                this.f86889f = null;
                return;
            }
            Class<? super Object> superclass = this.f86889f.getSuperclass();
            this.f86889f = superclass;
            String name = superclass.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.") || name.startsWith("androidx.")) {
                this.f86889f = null;
            }
        }

        void e() {
            this.f86884a.clear();
            this.f86885b.clear();
            this.f86886c.clear();
            this.f86887d.setLength(0);
            this.f86888e = null;
            this.f86889f = null;
            this.f86890g = false;
            this.f86891h = null;
        }
    }

    o(List<org.greenrobot.eventbus.meta.d> list, boolean z4, boolean z5) {
        this.f86881a = list;
        this.f86882b = z4;
        this.f86883c = z5;
    }

    static void a() {
        f86878g.clear();
    }

    private List<n> c(Class<?> cls) {
        a h4 = h();
        h4.c(cls);
        while (h4.f86889f != null) {
            org.greenrobot.eventbus.meta.c g4 = g(h4);
            h4.f86891h = g4;
            if (g4 != null) {
                for (n nVar : g4.a()) {
                    if (h4.a(nVar.f86869a, nVar.f86871c)) {
                        h4.f86884a.add(nVar);
                    }
                }
            } else {
                e(h4);
            }
            h4.d();
        }
        return f(h4);
    }

    private List<n> d(Class<?> cls) {
        a h4 = h();
        h4.c(cls);
        while (h4.f86889f != null) {
            e(h4);
            h4.d();
        }
        return f(h4);
    }

    private void e(a aVar) {
        Method[] methods;
        try {
            try {
                methods = aVar.f86889f.getDeclaredMethods();
            } catch (LinkageError e4) {
                String concat = "Could not inspect methods of ".concat(aVar.f86889f.getName());
                throw new EventBusException(this.f86883c ? androidx.compose.runtime.changelist.j.a(concat, ". Please consider using EventBus annotation processor to avoid reflection.") : androidx.compose.runtime.changelist.j.a(concat, ". Please make this class visible to EventBus annotation processor to avoid reflection."), e4);
            }
        } catch (Throwable unused) {
            methods = aVar.f86889f.getMethods();
            aVar.f86890g = true;
        }
        for (Method method : methods) {
            int modifiers = method.getModifiers();
            if ((modifiers & 1) != 0 && (modifiers & f86877f) == 0) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    l lVar = (l) method.getAnnotation(l.class);
                    if (lVar != null) {
                        Class<?> cls = parameterTypes[0];
                        if (aVar.a(method, cls)) {
                            aVar.f86884a.add(new n(method, cls, lVar.threadMode(), lVar.priority(), lVar.sticky()));
                        }
                    }
                } else if (this.f86882b && method.isAnnotationPresent(l.class)) {
                    StringBuilder a5 = androidx.appcompat.view.g.a("@Subscribe method ", method.getDeclaringClass().getName() + "." + method.getName(), "must have exactly 1 parameter but has ");
                    a5.append(parameterTypes.length);
                    throw new EventBusException(a5.toString());
                }
            } else if (this.f86882b && method.isAnnotationPresent(l.class)) {
                throw new EventBusException(androidx.compose.runtime.changelist.j.a(method.getDeclaringClass().getName() + "." + method.getName(), " is a illegal @Subscribe method: must be public, non-static, and non-abstract"));
            }
        }
    }

    private List<n> f(a aVar) {
        ArrayList arrayList = new ArrayList(aVar.f86884a);
        aVar.e();
        synchronized (f86880i) {
            int i4 = 0;
            while (true) {
                if (i4 >= 4) {
                    break;
                }
                try {
                    a[] aVarArr = f86880i;
                    if (aVarArr[i4] == null) {
                        aVarArr[i4] = aVar;
                        break;
                    }
                    i4++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return arrayList;
    }

    private org.greenrobot.eventbus.meta.c g(a aVar) {
        org.greenrobot.eventbus.meta.c cVar = aVar.f86891h;
        if (cVar != null && cVar.c() != null) {
            org.greenrobot.eventbus.meta.c c5 = aVar.f86891h.c();
            if (aVar.f86889f == c5.b()) {
                return c5;
            }
        }
        List<org.greenrobot.eventbus.meta.d> list = this.f86881a;
        if (list == null) {
            return null;
        }
        Iterator<org.greenrobot.eventbus.meta.d> it = list.iterator();
        while (it.hasNext()) {
            org.greenrobot.eventbus.meta.c a5 = it.next().a(aVar.f86889f);
            if (a5 != null) {
                return a5;
            }
        }
        return null;
    }

    private a h() {
        synchronized (f86880i) {
            for (int i4 = 0; i4 < 4; i4++) {
                try {
                    a[] aVarArr = f86880i;
                    a aVar = aVarArr[i4];
                    if (aVar != null) {
                        aVarArr[i4] = null;
                        return aVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return new a();
        }
    }

    List<n> b(Class<?> cls) {
        Map<Class<?>, List<n>> map = f86878g;
        List<n> list = map.get(cls);
        if (list != null) {
            return list;
        }
        List<n> d5 = this.f86883c ? d(cls) : c(cls);
        if (!d5.isEmpty()) {
            map.put(cls, d5);
            return d5;
        }
        throw new EventBusException("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
    }
}
