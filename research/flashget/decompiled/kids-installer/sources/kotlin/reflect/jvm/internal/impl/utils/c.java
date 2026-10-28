package kotlin.reflect.jvm.internal.impl.utils;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;

/* compiled from: exceptionUtils.kt */
/* loaded from: classes5.dex */
public final class c {
    public static final boolean a(@d5.d Throwable th) {
        l0.p(th, ProtectedSandApp.s("外"));
        Class<?> cls = th.getClass();
        while (!l0.g(cls.getCanonicalName(), ProtectedSandApp.s("夗"))) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }

    @d5.d
    public static final RuntimeException b(@d5.d Throwable th) {
        l0.p(th, ProtectedSandApp.s("夘"));
        throw th;
    }
}
