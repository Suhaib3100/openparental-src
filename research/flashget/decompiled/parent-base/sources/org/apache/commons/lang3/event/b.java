package org.apache.commons.lang3.event;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang3.reflect.f;

/* compiled from: EventUtils.java */
/* loaded from: classes6.dex */
public class b {

    /* compiled from: EventUtils.java */
    private static class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private final Object f85981a;

        /* renamed from: b, reason: collision with root package name */
        private final String f85982b;

        /* renamed from: c, reason: collision with root package name */
        private final Set<String> f85983c;

        a(Object obj, String str, String[] strArr) {
            this.f85981a = obj;
            this.f85982b = str;
            this.f85983c = new HashSet(Arrays.asList(strArr));
        }

        private boolean a(Method method) {
            return f.b(this.f85981a.getClass(), this.f85982b, method.getParameterTypes()) != null;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (this.f85983c.isEmpty() || this.f85983c.contains(method.getName())) {
                return a(method) ? f.v(this.f85981a, this.f85982b, objArr) : f.u(this.f85981a, this.f85982b);
            }
            return null;
        }
    }

    public static <L> void a(Object obj, Class<L> cls, L l4) {
        try {
            f.v(obj, "add".concat(cls.getSimpleName()), l4);
        } catch (IllegalAccessException unused) {
            throw new IllegalArgumentException("Class " + obj.getClass().getName() + " does not have an accessible add" + cls.getSimpleName() + " method which takes a parameter of type " + cls.getName() + ".");
        } catch (NoSuchMethodException unused2) {
            throw new IllegalArgumentException("Class " + obj.getClass().getName() + " does not have a public add" + cls.getSimpleName() + " method which takes a parameter of type " + cls.getName() + ".");
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Unable to add listener.", e4.getCause());
        }
    }

    public static <L> void b(Object obj, String str, Object obj2, Class<L> cls, String... strArr) {
        a(obj2, cls, cls.cast(Proxy.newProxyInstance(obj.getClass().getClassLoader(), new Class[]{cls}, new a(obj, str, strArr))));
    }
}
