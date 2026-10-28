package kotlin.reflect.jvm.internal.impl.builtins;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Set;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;

/* compiled from: CompanionObjectMappingUtils.kt */
/* loaded from: classes5.dex */
public final class d {
    public static final boolean a(@d5.d c cVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        boolean W1;
        l0.p(cVar, ProtectedSandApp.s("䏸"));
        l0.p(eVar, ProtectedSandApp.s("䏹"));
        if (kotlin.reflect.jvm.internal.impl.resolve.e.x(eVar)) {
            Set<kotlin.reflect.jvm.internal.impl.name.b> b6 = cVar.b();
            kotlin.reflect.jvm.internal.impl.name.b k5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.k(eVar);
            W1 = j0.W1(b6, k5 != null ? k5.g() : null);
            if (W1) {
                return true;
            }
        }
        return false;
    }
}
