package kotlin.reflect.jvm.internal.impl.util;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.util.g;

/* compiled from: modifierChecks.kt */
/* loaded from: classes5.dex */
public abstract class b {
    @d5.d
    public final g a(@d5.d z zVar) {
        l0.p(zVar, ProtectedSandApp.s("塼"));
        for (h hVar : b()) {
            if (hVar.b(zVar)) {
                return hVar.a(zVar);
            }
        }
        return g.a.f26582b;
    }

    @d5.d
    public abstract List<h> b();
}
