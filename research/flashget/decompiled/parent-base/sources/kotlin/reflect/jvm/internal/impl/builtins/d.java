package kotlin.reflect.jvm.internal.impl.builtins;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Set;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;

/* compiled from: CompanionObjectMappingUtils.kt */
/* loaded from: classes7.dex */
public final class d {
    public static final boolean a(@fg.l c cVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l0.p(cVar, ProtectedSandApp.s("杶\u0001"));
        l0.p(eVar, ProtectedSandApp.s("杷\u0001"));
        if (kotlin.reflect.jvm.internal.impl.resolve.f.x(eVar)) {
            Set<kotlin.reflect.jvm.internal.impl.name.b> b5 = cVar.b();
            kotlin.reflect.jvm.internal.impl.name.b k4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.k(eVar);
            if (w.W1(b5, k4 != null ? k4.g() : null)) {
                return true;
            }
        }
        return false;
    }
}
