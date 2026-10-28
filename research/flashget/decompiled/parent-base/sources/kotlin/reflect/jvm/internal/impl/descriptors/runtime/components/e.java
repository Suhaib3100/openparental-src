package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;

/* compiled from: ReflectJavaClassFinder.kt */
/* loaded from: classes7.dex */
public final class e {
    @fg.m
    public static final Class<?> a(@fg.l ClassLoader classLoader, @fg.l String str) {
        l0.p(classLoader, ProtectedSandApp.s("湞\u0001"));
        l0.p(str, ProtectedSandApp.s("湟\u0001"));
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
