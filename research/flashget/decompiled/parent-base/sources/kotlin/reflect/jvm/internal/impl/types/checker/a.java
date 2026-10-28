package kotlin.reflect.jvm.internal.impl.types.checker;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.types.checker.f;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.reflect.jvm.internal.impl.types.g1;

/* compiled from: ClassicTypeCheckerState.kt */
/* loaded from: classes7.dex */
public final class a {
    @fg.l
    public static final g1 a(boolean z4, boolean z5, @fg.l b bVar, @fg.l f fVar, @fg.l g gVar) {
        l0.p(bVar, ProtectedSandApp.s("絆\u0001"));
        l0.p(fVar, ProtectedSandApp.s("絇\u0001"));
        l0.p(gVar, ProtectedSandApp.s("絈\u0001"));
        return new g1(z4, z5, true, bVar, fVar, gVar);
    }

    public static /* synthetic */ g1 b(boolean z4, boolean z5, b bVar, f fVar, g gVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z5 = true;
        }
        if ((i4 & 4) != 0) {
            bVar = q.f78377a;
        }
        if ((i4 & 8) != 0) {
            fVar = f.a.f78350a;
        }
        if ((i4 & 16) != 0) {
            gVar = g.a.f78351a;
        }
        return a(z4, z5, bVar, fVar, gVar);
    }
}
