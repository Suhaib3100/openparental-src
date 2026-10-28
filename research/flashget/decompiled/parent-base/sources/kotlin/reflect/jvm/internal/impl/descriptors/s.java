package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.r1;

/* compiled from: descriptorUtil.kt */
@r1({"SMAP\ndescriptorUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 descriptorUtil.kt\norg/jetbrains/kotlin/descriptors/DescriptorUtilKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 coreLib.kt\norg/jetbrains/kotlin/utils/CoreLibKt\n*L\n1#1,108:1\n1#2:109\n19#3:110\n*S KotlinDebug\n*F\n+ 1 descriptorUtil.kt\norg/jetbrains/kotlin/descriptors/DescriptorUtilKt\n*L\n38#1:110\n*E\n"})
/* loaded from: classes7.dex */
public final class s {
    @fg.m
    public static final h a(@fg.l m mVar) {
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("漖\u0001"));
        m c5 = mVar.c();
        if (c5 == null || (mVar instanceof l0)) {
            return null;
        }
        if (!b(c5)) {
            return a(c5);
        }
        if (c5 instanceof h) {
            return (h) c5;
        }
        return null;
    }

    public static final boolean b(@fg.l m mVar) {
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("漖\u0001"));
        return mVar.c() instanceof l0;
    }

    public static final boolean c(@fg.l z zVar) {
        kotlin.reflect.jvm.internal.impl.types.p0 r4;
        kotlin.reflect.jvm.internal.impl.types.h0 y4;
        kotlin.reflect.jvm.internal.impl.types.h0 returnType;
        kotlin.jvm.internal.l0.p(zVar, ProtectedSandApp.s("漖\u0001"));
        m c5 = zVar.c();
        e eVar = c5 instanceof e ? (e) c5 : null;
        if (eVar == null) {
            return false;
        }
        e eVar2 = kotlin.reflect.jvm.internal.impl.resolve.h.g(eVar) ? eVar : null;
        if (eVar2 == null || (r4 = eVar2.r()) == null || (y4 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.y(r4)) == null || (returnType = zVar.getReturnType()) == null || !kotlin.jvm.internal.l0.g(zVar.getName(), kotlin.reflect.jvm.internal.impl.util.q.f78623e)) {
            return false;
        }
        if ((!kotlin.reflect.jvm.internal.impl.types.typeUtil.a.n(returnType) && !kotlin.reflect.jvm.internal.impl.types.typeUtil.a.o(returnType)) || zVar.i().size() != 1) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.types.h0 type = zVar.i().get(0).getType();
        kotlin.jvm.internal.l0.o(type, ProtectedSandApp.s("漗\u0001"));
        return kotlin.jvm.internal.l0.g(kotlin.reflect.jvm.internal.impl.types.typeUtil.a.y(type), y4) && zVar.z0().isEmpty() && zVar.S() == null;
    }

    @fg.m
    public static final e d(@fg.l h0 h0Var, @fg.l kotlin.reflect.jvm.internal.impl.name.c cVar, @fg.l ud.b bVar) {
        h hVar;
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h W;
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("漖\u0001"));
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("漘\u0001"));
        kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("漙\u0001"));
        if (cVar.d()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.name.c e4 = cVar.e();
        String s4 = ProtectedSandApp.s("漚\u0001");
        kotlin.jvm.internal.l0.o(e4, s4);
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h q4 = h0Var.n0(e4).q();
        kotlin.reflect.jvm.internal.impl.name.f g4 = cVar.g();
        String s5 = ProtectedSandApp.s("漛\u0001");
        kotlin.jvm.internal.l0.o(g4, s5);
        h f4 = q4.f(g4, bVar);
        e eVar = f4 instanceof e ? (e) f4 : null;
        if (eVar != null) {
            return eVar;
        }
        kotlin.reflect.jvm.internal.impl.name.c e5 = cVar.e();
        kotlin.jvm.internal.l0.o(e5, s4);
        e d5 = d(h0Var, e5, bVar);
        if (d5 == null || (W = d5.W()) == null) {
            hVar = null;
        } else {
            kotlin.reflect.jvm.internal.impl.name.f g5 = cVar.g();
            kotlin.jvm.internal.l0.o(g5, s5);
            hVar = W.f(g5, bVar);
        }
        if (hVar instanceof e) {
            return (e) hVar;
        }
        return null;
    }
}
