package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;

/* compiled from: ReflectJavaClassFinder.kt */
/* loaded from: classes5.dex */
public final class e {
    @d5.e
    public static final Class<?> a(@d5.d ClassLoader classLoader, @d5.d String str) {
        l0.p(classLoader, ProtectedSandApp.s("䡒"));
        l0.p(str, ProtectedSandApp.s("䡓"));
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
