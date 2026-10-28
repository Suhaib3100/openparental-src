package retrofit2;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* compiled from: ServiceMethod.java */
/* loaded from: classes5.dex */
abstract class x<T> {
    x() {
    }

    static <T> x<T> b(w wVar, Method method) {
        u b6 = u.b(wVar, method);
        Type genericReturnType = method.getGenericReturnType();
        if (a0.j(genericReturnType)) {
            throw a0.n(method, null, ProtectedSandApp.s("槔"), genericReturnType);
        }
        if (genericReturnType != Void.TYPE) {
            return j.f(wVar, method, b6);
        }
        throw a0.n(method, null, ProtectedSandApp.s("槓"), new Object[0]);
    }

    @Nullable
    abstract T a(Object[] objArr);
}
