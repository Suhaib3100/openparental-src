package retrofit2;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* compiled from: ServiceMethod.java */
/* loaded from: classes9.dex */
abstract class z<T> {
    z() {
    }

    static <T> z<T> b(y yVar, Method method) {
        w b5 = w.b(yVar, method);
        Type genericReturnType = method.getGenericReturnType();
        if (c0.j(genericReturnType)) {
            throw c0.n(method, null, ProtectedSandApp.s("ꖼ\u0001"), genericReturnType);
        }
        if (genericReturnType != Void.TYPE) {
            return j.f(yVar, method, b5);
        }
        throw c0.n(method, null, ProtectedSandApp.s("ꖻ\u0001"), new Object[0]);
    }

    @zc.h
    abstract T a(Object[] objArr);
}
