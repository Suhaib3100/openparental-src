package com.google.common.reflect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/* compiled from: AbstractInvocationHandler.java */
@d
/* loaded from: classes6.dex */
public abstract class a implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    private static final Object[] f57560a = new Object[0];

    private static boolean b(Object obj, Class<?> cls) {
        return cls.isInstance(obj) || (Proxy.isProxyClass(obj.getClass()) && Arrays.equals(obj.getClass().getInterfaces(), cls.getInterfaces()));
    }

    @zc.a
    protected abstract Object a(Object obj, Method method, Object[] objArr) throws Throwable;

    public boolean equals(@zc.a Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    @Override // java.lang.reflect.InvocationHandler
    @zc.a
    public final Object invoke(Object obj, Method method, @zc.a Object[] objArr) throws Throwable {
        if (objArr == null) {
            objArr = f57560a;
        }
        if (objArr.length == 0 && method.getName().equals(ProtectedSandApp.s("豈"))) {
            return Integer.valueOf(hashCode());
        }
        if (objArr.length != 1 || !method.getName().equals(ProtectedSandApp.s("更")) || method.getParameterTypes()[0] != Object.class) {
            return (objArr.length == 0 && method.getName().equals(ProtectedSandApp.s("車"))) ? toString() : a(obj, method, objArr);
        }
        Object obj2 = objArr[0];
        if (obj2 == null) {
            return Boolean.FALSE;
        }
        if (obj == obj2) {
            return Boolean.TRUE;
        }
        return Boolean.valueOf(b(obj2, obj.getClass()) && equals(Proxy.getInvocationHandler(obj2)));
    }

    public String toString() {
        return super.toString();
    }
}
