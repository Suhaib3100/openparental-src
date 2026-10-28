package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.load.java.i0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.m;
import kotlin.reflect.jvm.internal.impl.resolve.f;

/* compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
/* loaded from: classes5.dex */
public final class t implements kotlin.reflect.jvm.internal.impl.resolve.f {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final a f24821a = new a(null);

    /* compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
    public static final class a {
        private a() {
        }

        private final boolean b(kotlin.reflect.jvm.internal.impl.descriptors.z zVar) {
            Object h5;
            if (zVar.n().size() != 1) {
                return false;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.m b6 = zVar.b();
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar = b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) b6 : null;
            if (eVar == null) {
                return false;
            }
            List<j1> n5 = zVar.n();
            l0.o(n5, ProtectedSandApp.s("䫢"));
            h5 = kotlin.collections.j0.h5(n5);
            kotlin.reflect.jvm.internal.impl.descriptors.h b7 = ((j1) h5).getType().U0().b();
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar2 = b7 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) b7 : null;
            return eVar2 != null && kotlin.reflect.jvm.internal.impl.builtins.h.q0(eVar) && l0.g(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.l(eVar), kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.l(eVar2));
        }

        private final kotlin.reflect.jvm.internal.impl.load.kotlin.m c(kotlin.reflect.jvm.internal.impl.descriptors.z zVar, j1 j1Var) {
            boolean e6 = kotlin.reflect.jvm.internal.impl.load.kotlin.w.e(zVar);
            String s5 = ProtectedSandApp.s("䫣");
            if (e6 || b(zVar)) {
                kotlin.reflect.jvm.internal.impl.types.h0 type = j1Var.getType();
                l0.o(type, s5);
                return kotlin.reflect.jvm.internal.impl.load.kotlin.w.g(kotlin.reflect.jvm.internal.impl.types.typeUtil.a.u(type));
            }
            kotlin.reflect.jvm.internal.impl.types.h0 type2 = j1Var.getType();
            l0.o(type2, s5);
            return kotlin.reflect.jvm.internal.impl.load.kotlin.w.g(type2);
        }

        public final boolean a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
            List<Pair> i6;
            l0.p(aVar, ProtectedSandApp.s("䫤"));
            l0.p(aVar2, ProtectedSandApp.s("䫥"));
            if ((aVar2 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.e) && (aVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.z)) {
                kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVar = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.e) aVar2;
                eVar.n().size();
                kotlin.reflect.jvm.internal.impl.descriptors.z zVar = (kotlin.reflect.jvm.internal.impl.descriptors.z) aVar;
                zVar.n().size();
                List<j1> n5 = eVar.a().n();
                l0.o(n5, ProtectedSandApp.s("䫦"));
                List<j1> n6 = zVar.a().n();
                l0.o(n6, ProtectedSandApp.s("䫧"));
                i6 = kotlin.collections.j0.i6(n5, n6);
                for (Pair pair : i6) {
                    j1 j1Var = (j1) pair.a();
                    j1 j1Var2 = (j1) pair.b();
                    l0.o(j1Var, ProtectedSandApp.s("䫨"));
                    boolean z5 = c((kotlin.reflect.jvm.internal.impl.descriptors.z) aVar2, j1Var) instanceof m.d;
                    l0.o(j1Var2, ProtectedSandApp.s("䫩"));
                    if (z5 != (c(zVar, j1Var2) instanceof m.d)) {
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
        if ((aVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.b) && (aVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.z) && !kotlin.reflect.jvm.internal.impl.builtins.h.f0(aVar2)) {
            f fVar = f.f24568n;
            kotlin.reflect.jvm.internal.impl.descriptors.z zVar = (kotlin.reflect.jvm.internal.impl.descriptors.z) aVar2;
            kotlin.reflect.jvm.internal.impl.name.f name = zVar.getName();
            String s5 = ProtectedSandApp.s("䫪");
            l0.o(name, s5);
            if (!fVar.l(name)) {
                i0.a aVar3 = i0.f24581a;
                kotlin.reflect.jvm.internal.impl.name.f name2 = zVar.getName();
                l0.o(name2, s5);
                if (!aVar3.k(name2)) {
                    return false;
                }
            }
            kotlin.reflect.jvm.internal.impl.descriptors.b e6 = h0.e((kotlin.reflect.jvm.internal.impl.descriptors.b) aVar);
            boolean z5 = aVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.z;
            kotlin.reflect.jvm.internal.impl.descriptors.z zVar2 = z5 ? (kotlin.reflect.jvm.internal.impl.descriptors.z) aVar : null;
            if ((!(zVar2 != null && zVar.D0() == zVar2.D0())) && (e6 == null || !zVar.D0())) {
                return true;
            }
            if ((eVar instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.c) && zVar.k0() == null && e6 != null && !h0.f(eVar, e6)) {
                if ((e6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.z) && z5 && f.k((kotlin.reflect.jvm.internal.impl.descriptors.z) e6) != null) {
                    String c6 = kotlin.reflect.jvm.internal.impl.load.kotlin.w.c(zVar, false, false, 2, null);
                    kotlin.reflect.jvm.internal.impl.descriptors.z a6 = ((kotlin.reflect.jvm.internal.impl.descriptors.z) aVar).a();
                    l0.o(a6, ProtectedSandApp.s("䫫"));
                    if (l0.g(c6, kotlin.reflect.jvm.internal.impl.load.kotlin.w.c(a6, false, false, 2, null))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.f
    @d5.d
    public f.a a() {
        return f.a.CONFLICTS_ONLY;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.f
    @d5.d
    public f.b b(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, @d5.e kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l0.p(aVar, ProtectedSandApp.s("䫬"));
        l0.p(aVar2, ProtectedSandApp.s("䫭"));
        return c(aVar, aVar2, eVar) ? f.b.INCOMPATIBLE : f24821a.a(aVar, aVar2) ? f.b.INCOMPATIBLE : f.b.UNKNOWN;
    }
}
