package net.time4j.android.spi;

import android.os.SystemClock;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.time4j.base.c;
import net.time4j.scale.e;

/* compiled from: AndroidTickerSPI.java */
/* loaded from: classes7.dex */
class a implements e {

    /* renamed from: a, reason: collision with root package name */
    private static final Class[] f81865a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object[] f81866b;

    /* renamed from: c, reason: collision with root package name */
    private static final Method f81867c;

    static {
        Class[] clsArr = new Class[0];
        f81865a = clsArr;
        Object[] objArr = new Object[0];
        f81866b = objArr;
        Method method = null;
        try {
            Method method2 = SystemClock.class.getMethod(ProtectedSandApp.s("觔\u0001"), clsArr);
            method2.invoke(null, objArr);
            method = method2;
        } catch (IllegalAccessException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
        }
        f81867c = method;
    }

    a() {
    }

    @Override // net.time4j.scale.e
    public String a() {
        return ProtectedSandApp.s("觕\u0001");
    }

    @Override // net.time4j.scale.e
    public long k() {
        Method method = f81867c;
        if (method != null) {
            try {
                return ((Long) method.invoke(null, f81866b)).longValue();
            } catch (IllegalAccessException e4) {
                e4.printStackTrace(System.err);
            } catch (InvocationTargetException e5) {
                e5.printStackTrace(System.err);
            }
        }
        return c.i(SystemClock.elapsedRealtime(), 1000000L);
    }
}
