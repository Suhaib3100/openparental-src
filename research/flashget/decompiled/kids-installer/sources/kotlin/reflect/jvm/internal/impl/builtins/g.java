package kotlin.reflect.jvm.internal.impl.builtins;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.a0;
import kotlin.collections.b0;
import kotlin.collections.f1;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.builtins.functions.c;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.resolve.constants.v;
import kotlin.reflect.jvm.internal.impl.types.e1;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: functionTypes.kt */
/* loaded from: classes5.dex */
public final class g {
    public static final int a(@d5.d h0 h0Var) {
        Object K;
        l0.p(h0Var, ProtectedSandApp.s("䓊"));
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c e6 = h0Var.getAnnotations().e(l.a.D);
        if (e6 == null) {
            return 0;
        }
        K = f1.K(e6.a(), l.f24025k);
        kotlin.reflect.jvm.internal.impl.resolve.constants.g gVar = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) K;
        l0.n(gVar, ProtectedSandApp.s("䓋"));
        return ((kotlin.reflect.jvm.internal.impl.resolve.constants.m) gVar).b().intValue();
    }

    @d5.d
    @p3.j
    public static final p0 b(@d5.d h hVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.e h0 h0Var, @d5.d List<? extends h0> list, @d5.d List<? extends h0> list2, @d5.e List<kotlin.reflect.jvm.internal.impl.name.f> list3, @d5.d h0 h0Var2, boolean z5) {
        l0.p(hVar, ProtectedSandApp.s("䓌"));
        l0.p(gVar, ProtectedSandApp.s("䓍"));
        l0.p(list, ProtectedSandApp.s("䓎"));
        l0.p(list2, ProtectedSandApp.s("䓏"));
        l0.p(h0Var2, ProtectedSandApp.s("䓐"));
        List<l1> g5 = g(h0Var, list, list2, list3, h0Var2, hVar);
        kotlin.reflect.jvm.internal.impl.descriptors.e f6 = f(hVar, list.size() + list2.size() + (h0Var == null ? 0 : 1), z5);
        if (h0Var != null) {
            gVar = t(gVar, hVar);
        }
        if (!list.isEmpty()) {
            gVar = s(gVar, hVar, list.size());
        }
        return i0.g(e1.b(gVar), f6, g5);
    }

    @d5.e
    public static final kotlin.reflect.jvm.internal.impl.name.f d(@d5.d h0 h0Var) {
        Object i5;
        String b6;
        l0.p(h0Var, ProtectedSandApp.s("䓑"));
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c e6 = h0Var.getAnnotations().e(l.a.E);
        if (e6 == null) {
            return null;
        }
        i5 = j0.i5(e6.a().values());
        v vVar = i5 instanceof v ? (v) i5 : null;
        if (vVar != null && (b6 = vVar.b()) != null) {
            if (!kotlin.reflect.jvm.internal.impl.name.f.r(b6)) {
                b6 = null;
            }
            if (b6 != null) {
                return kotlin.reflect.jvm.internal.impl.name.f.p(b6);
            }
        }
        return null;
    }

    @d5.d
    public static final List<h0> e(@d5.d h0 h0Var) {
        int b02;
        l0.p(h0Var, ProtectedSandApp.s("䓒"));
        o(h0Var);
        int a6 = a(h0Var);
        if (a6 == 0) {
            return EmptyList.f23167o;
        }
        List<l1> subList = h0Var.S0().subList(0, a6);
        b02 = b0.b0(subList, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator<T> it = subList.iterator();
        while (it.hasNext()) {
            h0 type = ((l1) it.next()).getType();
            l0.o(type, ProtectedSandApp.s("䓓"));
            arrayList.add(type);
        }
        return arrayList;
    }

    @d5.d
    public static final kotlin.reflect.jvm.internal.impl.descriptors.e f(@d5.d h hVar, int i5, boolean z5) {
        l0.p(hVar, ProtectedSandApp.s("䓔"));
        kotlin.reflect.jvm.internal.impl.descriptors.e X = z5 ? hVar.X(i5) : hVar.C(i5);
        l0.o(X, ProtectedSandApp.s("䓕"));
        return X;
    }

    @d5.d
    public static final List<l1> g(@d5.e h0 h0Var, @d5.d List<? extends h0> list, @d5.d List<? extends h0> list2, @d5.e List<kotlin.reflect.jvm.internal.impl.name.f> list3, @d5.d h0 h0Var2, @d5.d h hVar) {
        int b02;
        kotlin.reflect.jvm.internal.impl.name.f fVar;
        Map k5;
        List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> A4;
        l0.p(list, ProtectedSandApp.s("䓖"));
        l0.p(list2, ProtectedSandApp.s("䓗"));
        l0.p(h0Var2, ProtectedSandApp.s("䓘"));
        l0.p(hVar, ProtectedSandApp.s("䓙"));
        int i5 = 0;
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + (h0Var != null ? 1 : 0) + 1);
        b02 = b0.b0(list, 10);
        ArrayList arrayList2 = new ArrayList(b02);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(kotlin.reflect.jvm.internal.impl.types.typeUtil.a.a((h0) it.next()));
        }
        arrayList.addAll(arrayList2);
        kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, h0Var != null ? kotlin.reflect.jvm.internal.impl.types.typeUtil.a.a(h0Var) : null);
        for (Object obj : list2) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                a0.Z();
            }
            h0 h0Var3 = (h0) obj;
            if (list3 == null || (fVar = list3.get(i5)) == null || fVar.q()) {
                fVar = null;
            }
            if (fVar != null) {
                kotlin.reflect.jvm.internal.impl.name.c cVar = l.a.E;
                kotlin.reflect.jvm.internal.impl.name.f p5 = kotlin.reflect.jvm.internal.impl.name.f.p(ProtectedSandApp.s("䓚"));
                String h5 = fVar.h();
                l0.o(h5, ProtectedSandApp.s("䓛"));
                k5 = kotlin.collections.e1.k(new Pair(p5, new v(h5)));
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.j jVar = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.j(hVar, cVar, k5);
                g.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e;
                A4 = j0.A4(h0Var3.getAnnotations(), jVar);
                h0Var3 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.v(h0Var3, aVar.a(A4));
            }
            arrayList.add(kotlin.reflect.jvm.internal.impl.types.typeUtil.a.a(h0Var3));
            i5 = i6;
        }
        arrayList.add(kotlin.reflect.jvm.internal.impl.types.typeUtil.a.a(h0Var2));
        return arrayList;
    }

    @d5.e
    public static final kotlin.reflect.jvm.internal.impl.builtins.functions.c h(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        l0.p(mVar, ProtectedSandApp.s("䓜"));
        if ((mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) && h.A0(mVar)) {
            return i(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.m(mVar));
        }
        return null;
    }

    private static final kotlin.reflect.jvm.internal.impl.builtins.functions.c i(kotlin.reflect.jvm.internal.impl.name.d dVar) {
        if (!dVar.f() || dVar.e()) {
            return null;
        }
        c.a aVar = kotlin.reflect.jvm.internal.impl.builtins.functions.c.Companion;
        String h5 = dVar.i().h();
        l0.o(h5, ProtectedSandApp.s("䓝"));
        kotlin.reflect.jvm.internal.impl.name.c e6 = dVar.l().e();
        l0.o(e6, ProtectedSandApp.s("䓞"));
        return aVar.b(h5, e6);
    }

    @d5.e
    public static final h0 j(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("䓟"));
        o(h0Var);
        if (!r(h0Var)) {
            return null;
        }
        return h0Var.S0().get(a(h0Var)).getType();
    }

    @d5.d
    public static final h0 k(@d5.d h0 h0Var) {
        Object p32;
        l0.p(h0Var, ProtectedSandApp.s("䓠"));
        o(h0Var);
        p32 = j0.p3(h0Var.S0());
        h0 type = ((l1) p32).getType();
        l0.o(type, ProtectedSandApp.s("䓡"));
        return type;
    }

    @d5.d
    public static final List<l1> l(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("䓢"));
        o(h0Var);
        return h0Var.S0().subList((m(h0Var) ? 1 : 0) + a(h0Var), r0.size() - 1);
    }

    public static final boolean m(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("䓣"));
        return o(h0Var) && r(h0Var);
    }

    public static final boolean n(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        l0.p(mVar, ProtectedSandApp.s("䓤"));
        kotlin.reflect.jvm.internal.impl.builtins.functions.c h5 = h(mVar);
        return h5 == kotlin.reflect.jvm.internal.impl.builtins.functions.c.Function || h5 == kotlin.reflect.jvm.internal.impl.builtins.functions.c.SuspendFunction;
    }

    public static final boolean o(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("䓥"));
        kotlin.reflect.jvm.internal.impl.descriptors.h b6 = h0Var.U0().b();
        return b6 != null && n(b6);
    }

    public static final boolean p(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("䓦"));
        kotlin.reflect.jvm.internal.impl.descriptors.h b6 = h0Var.U0().b();
        return (b6 != null ? h(b6) : null) == kotlin.reflect.jvm.internal.impl.builtins.functions.c.Function;
    }

    public static final boolean q(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("䓧"));
        kotlin.reflect.jvm.internal.impl.descriptors.h b6 = h0Var.U0().b();
        return (b6 != null ? h(b6) : null) == kotlin.reflect.jvm.internal.impl.builtins.functions.c.SuspendFunction;
    }

    private static final boolean r(h0 h0Var) {
        return h0Var.getAnnotations().e(l.a.C) != null;
    }

    @d5.d
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g s(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d h hVar, int i5) {
        Map k5;
        List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> A4;
        l0.p(gVar, ProtectedSandApp.s("䓨"));
        l0.p(hVar, ProtectedSandApp.s("䓩"));
        kotlin.reflect.jvm.internal.impl.name.c cVar = l.a.D;
        if (gVar.O0(cVar)) {
            return gVar;
        }
        g.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e;
        k5 = kotlin.collections.e1.k(new Pair(l.f24025k, new kotlin.reflect.jvm.internal.impl.resolve.constants.m(i5)));
        A4 = j0.A4(gVar, new kotlin.reflect.jvm.internal.impl.descriptors.annotations.j(hVar, cVar, k5));
        return aVar.a(A4);
    }

    @d5.d
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g t(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.d h hVar) {
        Map z5;
        List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> A4;
        l0.p(gVar, ProtectedSandApp.s("䓪"));
        l0.p(hVar, ProtectedSandApp.s("䓫"));
        kotlin.reflect.jvm.internal.impl.name.c cVar = l.a.C;
        if (gVar.O0(cVar)) {
            return gVar;
        }
        g.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e;
        z5 = f1.z();
        A4 = j0.A4(gVar, new kotlin.reflect.jvm.internal.impl.descriptors.annotations.j(hVar, cVar, z5));
        return aVar.a(A4);
    }
}
