package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: descriptorUtil.kt */
/* loaded from: classes5.dex */
public final class s {
    @d5.e
    public static final h a(@d5.d m mVar) {
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("䢶"));
        m b6 = mVar.b();
        if (b6 != null && !(mVar instanceof l0)) {
            if (!b(b6)) {
                return a(b6);
            }
            if (b6 instanceof h) {
                return (h) b6;
            }
        }
        return null;
    }

    public static final boolean b(@d5.d m mVar) {
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("䢷"));
        return mVar.b() instanceof l0;
    }

    @d5.e
    public static final e c(@d5.d h0 h0Var, @d5.d kotlin.reflect.jvm.internal.impl.name.c cVar, @d5.d z3.b bVar) {
        h hVar;
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h F0;
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("䢸"));
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("䢹"));
        kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("䢺"));
        if (cVar.d()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.name.c e6 = cVar.e();
        String s5 = ProtectedSandApp.s("䢻");
        kotlin.jvm.internal.l0.o(e6, s5);
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h C = h0Var.V(e6).C();
        kotlin.reflect.jvm.internal.impl.name.f g5 = cVar.g();
        String s6 = ProtectedSandApp.s("䢼");
        kotlin.jvm.internal.l0.o(g5, s6);
        h h5 = C.h(g5, bVar);
        e eVar = h5 instanceof e ? (e) h5 : null;
        if (eVar != null) {
            return eVar;
        }
        kotlin.reflect.jvm.internal.impl.name.c e7 = cVar.e();
        kotlin.jvm.internal.l0.o(e7, s5);
        e c6 = c(h0Var, e7, bVar);
        if (c6 == null || (F0 = c6.F0()) == null) {
            hVar = null;
        } else {
            kotlin.reflect.jvm.internal.impl.name.f g6 = cVar.g();
            kotlin.jvm.internal.l0.o(g6, s6);
            hVar = F0.h(g6, bVar);
        }
        if (hVar instanceof e) {
            return (e) hVar;
        }
        return null;
    }
}
