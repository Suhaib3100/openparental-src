package kotlin.reflect.jvm.internal.impl.builtins;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.y;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: suspendFunctionTypes.kt */
@r1({"SMAP\nsuspendFunctionTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 suspendFunctionTypes.kt\norg/jetbrains/kotlin/builtins/SuspendFunctionTypesKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1549#2:66\n1620#2,3:67\n1#3:70\n*S KotlinDebug\n*F\n+ 1 suspendFunctionTypes.kt\norg/jetbrains/kotlin/builtins/SuspendFunctionTypesKt\n*L\n54#1:66\n54#1:67,3\n*E\n"})
/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final y f75890a;

    static {
        kotlin.reflect.jvm.internal.impl.descriptors.impl.m mVar = new kotlin.reflect.jvm.internal.impl.descriptors.impl.m(kotlin.reflect.jvm.internal.impl.types.error.k.f78413a.i(), l.f75828q);
        kotlin.reflect.jvm.internal.impl.descriptors.f fVar = kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE;
        kotlin.reflect.jvm.internal.impl.name.f g4 = l.f75831t.g();
        a1 a1Var = a1.f75900a;
        kotlin.reflect.jvm.internal.impl.storage.n nVar = kotlin.reflect.jvm.internal.impl.storage.f.f78308e;
        y yVar = new y(mVar, fVar, false, false, g4, a1Var, nVar);
        yVar.N0(e0.ABSTRACT);
        yVar.P0(t.f76290e);
        yVar.O0(w.k(k0.S0(yVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b(), false, x1.IN_VARIANCE, kotlin.reflect.jvm.internal.impl.name.f.f(ProtectedSandApp.s("檮\u0001")), 0, nVar)));
        yVar.L0();
        f75890a = yVar;
    }

    @fg.l
    public static final p0 a(@fg.l h0 h0Var) {
        p0 b5;
        l0.p(h0Var, ProtectedSandApp.s("檯\u0001"));
        g.r(h0Var);
        h i4 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.i(h0Var);
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = h0Var.getAnnotations();
        h0 k4 = g.k(h0Var);
        List<h0> e4 = g.e(h0Var);
        List<l1> m4 = g.m(h0Var);
        ArrayList arrayList = new ArrayList(w.b0(m4, 10));
        Iterator<T> it = m4.iterator();
        while (it.hasNext()) {
            arrayList.add(((l1) it.next()).getType());
        }
        d1.f78389c.getClass();
        d1 d1Var = d1.f78390d;
        h1 j4 = f75890a.j();
        l0.o(j4, ProtectedSandApp.s("檰\u0001"));
        List E4 = w.E4(arrayList, i0.l(d1Var, j4, w.k(kotlin.reflect.jvm.internal.impl.types.typeUtil.a.a(g.l(h0Var))), false, null, 16, null));
        p0 I = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.i(h0Var).I();
        l0.o(I, ProtectedSandApp.s("檱\u0001"));
        b5 = g.b(i4, annotations, k4, e4, E4, null, I, (r17 & 128) != 0 ? false : false);
        return b5.V0(h0Var.P0());
    }
}
