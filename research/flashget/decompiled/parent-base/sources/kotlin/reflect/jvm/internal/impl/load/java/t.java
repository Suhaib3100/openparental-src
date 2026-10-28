package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.load.java.i0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.o;
import kotlin.reflect.jvm.internal.impl.resolve.g;

/* compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
/* loaded from: classes7.dex */
public final class t implements kotlin.reflect.jvm.internal.impl.resolve.g {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final a f76696a = new a();

    /* compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
    public static final class a {
        private a() {
        }

        private final boolean b(kotlin.reflect.jvm.internal.impl.descriptors.z zVar) {
            if (zVar.i().size() != 1) {
                return false;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.m c5 = zVar.c();
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar = c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) c5 : null;
            if (eVar == null) {
                return false;
            }
            List<j1> i4 = zVar.i();
            l0.o(i4, ProtectedSandApp.s("犈\u0001"));
            kotlin.reflect.jvm.internal.impl.descriptors.h c6 = ((j1) kotlin.collections.w.h5(i4)).getType().O0().c();
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar2 = c6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) c6 : null;
            return eVar2 != null && kotlin.reflect.jvm.internal.impl.builtins.h.r0(eVar) && l0.g(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.l(eVar), kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.l(eVar2));
        }

        private final kotlin.reflect.jvm.internal.impl.load.kotlin.o c(kotlin.reflect.jvm.internal.impl.descriptors.z zVar, j1 j1Var) {
            boolean e4 = kotlin.reflect.jvm.internal.impl.load.kotlin.y.e(zVar);
            String s4 = ProtectedSandApp.s("犉\u0001");
            if (e4 || b(zVar)) {
                kotlin.reflect.jvm.internal.impl.types.h0 type = j1Var.getType();
                l0.o(type, s4);
                return kotlin.reflect.jvm.internal.impl.load.kotlin.y.g(kotlin.reflect.jvm.internal.impl.types.typeUtil.a.w(type));
            }
            kotlin.reflect.jvm.internal.impl.types.h0 type2 = j1Var.getType();
            l0.o(type2, s4);
            return kotlin.reflect.jvm.internal.impl.load.kotlin.y.g(type2);
        }

        public final boolean a(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
            l0.p(aVar, ProtectedSandApp.s("犊\u0001"));
            l0.p(aVar2, ProtectedSandApp.s("犋\u0001"));
            if ((aVar2 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.e) && (aVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.z)) {
                kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVar = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.e) aVar2;
                eVar.i().size();
                kotlin.reflect.jvm.internal.impl.descriptors.z zVar = (kotlin.reflect.jvm.internal.impl.descriptors.z) aVar;
                zVar.i().size();
                List<j1> i4 = eVar.a().i();
                String s4 = ProtectedSandApp.s("犈\u0001");
                l0.o(i4, s4);
                List<j1> i5 = zVar.a().i();
                l0.o(i5, s4);
                for (q0 q0Var : kotlin.collections.w.i6(i4, i5)) {
                    j1 j1Var = (j1) q0Var.a();
                    j1 j1Var2 = (j1) q0Var.b();
                    l0.m(j1Var);
                    boolean z4 = c((kotlin.reflect.jvm.internal.impl.descriptors.z) aVar2, j1Var) instanceof o.d;
                    l0.m(j1Var2);
                    if (z4 != (c(zVar, j1Var2) instanceof o.d)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    private final boolean c(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if ((aVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.b) && (aVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.z) && !kotlin.reflect.jvm.internal.impl.builtins.h.g0(aVar2)) {
            f fVar = f.f76422o;
            kotlin.reflect.jvm.internal.impl.descriptors.z zVar = (kotlin.reflect.jvm.internal.impl.descriptors.z) aVar2;
            kotlin.reflect.jvm.internal.impl.name.f name = zVar.getName();
            String s4 = ProtectedSandApp.s("犌\u0001");
            l0.o(name, s4);
            if (!fVar.l(name)) {
                i0.a aVar3 = i0.f76436a;
                kotlin.reflect.jvm.internal.impl.name.f name2 = zVar.getName();
                l0.o(name2, s4);
                if (!aVar3.k(name2)) {
                    return false;
                }
            }
            kotlin.reflect.jvm.internal.impl.descriptors.b e4 = h0.e((kotlin.reflect.jvm.internal.impl.descriptors.b) aVar);
            boolean z4 = aVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.z;
            kotlin.reflect.jvm.internal.impl.descriptors.z zVar2 = z4 ? (kotlin.reflect.jvm.internal.impl.descriptors.z) aVar : null;
            if (!(zVar2 != null && zVar.E0() == zVar2.E0()) && (e4 == null || !zVar.E0())) {
                return true;
            }
            if ((eVar instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.c) && zVar.u0() == null && e4 != null && !h0.f(eVar, e4)) {
                if ((e4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.z) && z4 && f.k((kotlin.reflect.jvm.internal.impl.descriptors.z) e4) != null) {
                    String c5 = kotlin.reflect.jvm.internal.impl.load.kotlin.y.c(zVar, false, false, 2, null);
                    kotlin.reflect.jvm.internal.impl.descriptors.z a5 = ((kotlin.reflect.jvm.internal.impl.descriptors.z) aVar).a();
                    l0.o(a5, ProtectedSandApp.s("犍\u0001"));
                    if (l0.g(c5, kotlin.reflect.jvm.internal.impl.load.kotlin.y.c(a5, false, false, 2, null))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.g
    @fg.l
    public g.a a() {
        return g.a.CONFLICTS_ONLY;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.g
    @fg.l
    public g.b b(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, @fg.m kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l0.p(aVar, ProtectedSandApp.s("犎\u0001"));
        l0.p(aVar2, ProtectedSandApp.s("犏\u0001"));
        return c(aVar, aVar2, eVar) ? g.b.INCOMPATIBLE : f76696a.a(aVar, aVar2) ? g.b.INCOMPATIBLE : g.b.UNKNOWN;
    }
}
