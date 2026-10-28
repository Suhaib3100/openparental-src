package kotlin.reflect.jvm.internal.impl.util;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.util.g;

/* compiled from: modifierChecks.kt */
/* loaded from: classes7.dex */
public abstract class b {
    @fg.l
    public final g a(@fg.l z zVar) {
        l0.p(zVar, ProtectedSandApp.s("肴\u0001"));
        for (h hVar : b()) {
            if (hVar.b(zVar)) {
                return hVar.a(zVar);
            }
        }
        return g.a.f78590b;
    }

    @fg.l
    public abstract List<h> b();
}
