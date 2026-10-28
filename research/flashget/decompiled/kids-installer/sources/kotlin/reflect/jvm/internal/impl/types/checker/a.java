package kotlin.reflect.jvm.internal.impl.types.checker;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.types.checker.f;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.reflect.jvm.internal.impl.types.g1;

/* compiled from: ClassicTypeCheckerState.kt */
/* loaded from: classes5.dex */
public final class a {
    @d5.d
    public static final g1 a(boolean z5, boolean z6, @d5.d b bVar, @d5.d f fVar, @d5.d g gVar) {
        l0.p(bVar, ProtectedSandApp.s("哇"));
        l0.p(fVar, ProtectedSandApp.s("哈"));
        l0.p(gVar, ProtectedSandApp.s("哉"));
        return new g1(z5, z6, true, bVar, fVar, gVar);
    }

    public static /* synthetic */ g1 b(boolean z5, boolean z6, b bVar, f fVar, g gVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z6 = true;
        }
        if ((i5 & 4) != 0) {
            bVar = q.f26369a;
        }
        if ((i5 & 8) != 0) {
            fVar = f.a.f26342a;
        }
        if ((i5 & 16) != 0) {
            gVar = g.a.f26343a;
        }
        return a(z5, z6, bVar, fVar, gVar);
    }
}
