package kotlin.reflect.jvm.internal.impl.utils;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kotlin.jvm.internal.l0;

/* compiled from: exceptionUtils.kt */
/* loaded from: classes7.dex */
public final class d {
    public static final boolean a(@l Throwable th) {
        l0.p(th, ProtectedSandApp.s("腎\u0001"));
        Class<?> cls = th.getClass();
        while (!l0.g(cls.getCanonicalName(), ProtectedSandApp.s("腏\u0001"))) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }

    @l
    public static final RuntimeException b(@l Throwable th) {
        l0.p(th, ProtectedSandApp.s("腐\u0001"));
        throw th;
    }
}
