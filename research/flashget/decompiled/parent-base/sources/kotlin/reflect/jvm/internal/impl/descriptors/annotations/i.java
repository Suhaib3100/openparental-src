package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;

/* compiled from: Annotations.kt */
/* loaded from: classes7.dex */
public final class i {
    @fg.l
    public static final g a(@fg.l g gVar, @fg.l g gVar2) {
        l0.p(gVar, ProtectedSandApp.s("欂\u0001"));
        l0.p(gVar2, ProtectedSandApp.s("欃\u0001"));
        return gVar.isEmpty() ? gVar2 : gVar2.isEmpty() ? gVar : new k(gVar, gVar2);
    }
}
