package kotlin.reflect.jvm.internal.impl.builtins;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.j0;
import kotlin.collections.w;
import kotlin.collections.z0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.builtins.functions.f;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.resolve.constants.v;
import kotlin.reflect.jvm.internal.impl.types.e1;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: functionTypes.kt */
@r1({"SMAP\nfunctionTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 functionTypes.kt\norg/jetbrains/kotlin/builtins/FunctionTypesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,301:1\n1#2:302\n1549#3:303\n1620#3,3:304\n223#3,2:307\n1549#3:309\n1620#3,3:310\n1549#3:313\n1620#3,3:314\n1590#3,4:317\n*S KotlinDebug\n*F\n+ 1 functionTypes.kt\norg/jetbrains/kotlin/builtins/FunctionTypesKt\n*L\n160#1:303\n160#1:304,3\n195#1:307,2\n200#1:309\n200#1:310,3\n222#1:313\n222#1:314,3\n225#1:317,4\n*E\n"})
/* loaded from: classes7.dex */
public final class g {
    public static final int a(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("森\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c k4 = h0Var.getAnnotations().k(l.a.D);
        if (k4 == null) {
            return 0;
        }
        kotlin.reflect.jvm.internal.impl.resolve.constants.g gVar = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) z0.K(k4.a(), l.f75826o);
        l0.n(gVar, ProtectedSandApp.s("棯\u0001"));
        return ((kotlin.reflect.jvm.internal.impl.resolve.constants.m) gVar).b().intValue();
    }

    @fg.l
    @kd.j
    public static final p0 b(@fg.l h hVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.m h0 h0Var, @fg.l List<? extends h0> list, @fg.l List<? extends h0> list2, @fg.m List<kotlin.reflect.jvm.internal.impl.name.f> list3, @fg.l h0 h0Var2, boolean z4) {
        l0.p(hVar, ProtectedSandApp.s("棰\u0001"));
        l0.p(gVar, ProtectedSandApp.s("棱\u0001"));
        l0.p(list, ProtectedSandApp.s("棲\u0001"));
        l0.p(list2, ProtectedSandApp.s("棳\u0001"));
        l0.p(h0Var2, ProtectedSandApp.s("棴\u0001"));
        List<l1> g4 = g(h0Var, list, list2, list3, h0Var2, hVar);
        kotlin.reflect.jvm.internal.impl.descriptors.e f4 = f(hVar, list.size() + list2.size() + (h0Var == null ? 0 : 1), z4);
        if (h0Var != null) {
            gVar = u(gVar, hVar);
        }
        if (!list.isEmpty()) {
            gVar = t(gVar, hVar, list.size());
        }
        return i0.g(e1.b(gVar), f4, g4);
    }

    @fg.m
    public static final kotlin.reflect.jvm.internal.impl.name.f d(@fg.l h0 h0Var) {
        String b5;
        l0.p(h0Var, ProtectedSandApp.s("森\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c k4 = h0Var.getAnnotations().k(l.a.E);
        if (k4 == null) {
            return null;
        }
        Object i5 = w.i5(k4.a().values());
        v vVar = i5 instanceof v ? (v) i5 : null;
        if (vVar != null && (b5 = vVar.b()) != null) {
            if (!kotlin.reflect.jvm.internal.impl.name.f.h(b5)) {
                b5 = null;
            }
            if (b5 != null) {
                return kotlin.reflect.jvm.internal.impl.name.f.f(b5);
            }
        }
        return null;
    }

    @fg.l
    public static final List<h0> e(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("森\u0001"));
        p(h0Var);
        int a5 = a(h0Var);
        if (a5 == 0) {
            return j0.f74919b;
        }
        List<l1> subList = h0Var.M0().subList(0, a5);
        ArrayList arrayList = new ArrayList(w.b0(subList, 10));
        Iterator<T> it = subList.iterator();
        while (it.hasNext()) {
            h0 type = ((l1) it.next()).getType();
            l0.o(type, ProtectedSandApp.s("棵\u0001"));
            arrayList.add(type);
        }
        return arrayList;
    }

    @fg.l
    public static final kotlin.reflect.jvm.internal.impl.descriptors.e f(@fg.l h hVar, int i4, boolean z4) {
        l0.p(hVar, ProtectedSandApp.s("棰\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.e X = z4 ? hVar.X(i4) : hVar.C(i4);
        l0.m(X);
        return X;
    }

    @fg.l
    public static final List<l1> g(@fg.m h0 h0Var, @fg.l List<? extends h0> list, @fg.l List<? extends h0> list2, @fg.m List<kotlin.reflect.jvm.internal.impl.name.f> list3, @fg.l h0 h0Var2, @fg.l h hVar) {
        kotlin.reflect.jvm.internal.impl.name.f fVar;
        l0.p(list, ProtectedSandApp.s("棲\u0001"));
        l0.p(list2, ProtectedSandApp.s("棳\u0001"));
        l0.p(h0Var2, ProtectedSandApp.s("棴\u0001"));
        l0.p(hVar, ProtectedSandApp.s("棰\u0001"));
        int i4 = 0;
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + (h0Var != null ? 1 : 0) + 1);
        List<? extends h0> list4 = list;
        ArrayList arrayList2 = new ArrayList(w.b0(list4, 10));
        Iterator<T> it = list4.iterator();
        while (it.hasNext()) {
            arrayList2.add(kotlin.reflect.jvm.internal.impl.types.typeUtil.a.a((h0) it.next()));
        }
        arrayList.addAll(arrayList2);
        kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, h0Var != null ? kotlin.reflect.jvm.internal.impl.types.typeUtil.a.a(h0Var) : null);
        for (Object obj : list2) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                w.Z();
            }
            h0 h0Var3 = (h0) obj;
            if (list3 == null || (fVar = list3.get(i4)) == null || fVar.g()) {
                fVar = null;
            }
            if (fVar != null) {
                kotlin.reflect.jvm.internal.impl.name.c cVar = l.a.E;
                kotlin.reflect.jvm.internal.impl.name.f fVar2 = l.f75822k;
                String b5 = fVar.b();
                l0.o(b5, ProtectedSandApp.s("棶\u0001"));
                h0Var3 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.x(h0Var3, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.a(w.A4(h0Var3.getAnnotations(), new kotlin.reflect.jvm.internal.impl.descriptors.annotations.j(hVar, cVar, z0.k(new q0(fVar2, new v(b5))), false, 8, null))));
            }
            arrayList.add(kotlin.reflect.jvm.internal.impl.types.typeUtil.a.a(h0Var3));
            i4 = i5;
        }
        arrayList.add(kotlin.reflect.jvm.internal.impl.types.typeUtil.a.a(h0Var2));
        return arrayList;
    }

    @fg.m
    public static final kotlin.reflect.jvm.internal.impl.builtins.functions.f h(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        l0.p(mVar, ProtectedSandApp.s("森\u0001"));
        if ((mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) && h.B0(mVar)) {
            return i(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.m(mVar));
        }
        return null;
    }

    private static final kotlin.reflect.jvm.internal.impl.builtins.functions.f i(kotlin.reflect.jvm.internal.impl.name.d dVar) {
        if (!dVar.f() || dVar.e()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.builtins.functions.g.f75692c.getClass();
        kotlin.reflect.jvm.internal.impl.builtins.functions.g gVar = kotlin.reflect.jvm.internal.impl.builtins.functions.g.f75693d;
        kotlin.reflect.jvm.internal.impl.name.c e4 = dVar.l().e();
        l0.o(e4, ProtectedSandApp.s("棷\u0001"));
        String b5 = dVar.i().b();
        l0.o(b5, ProtectedSandApp.s("棶\u0001"));
        return gVar.b(e4, b5);
    }

    @fg.m
    public static final kotlin.reflect.jvm.internal.impl.builtins.functions.f j(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("森\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.h c5 = h0Var.O0().c();
        if (c5 != null) {
            return h(c5);
        }
        return null;
    }

    @fg.m
    public static final h0 k(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("森\u0001"));
        p(h0Var);
        if (!s(h0Var)) {
            return null;
        }
        return h0Var.M0().get(a(h0Var)).getType();
    }

    @fg.l
    public static final h0 l(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("森\u0001"));
        p(h0Var);
        h0 type = ((l1) w.p3(h0Var.M0())).getType();
        l0.o(type, ProtectedSandApp.s("棵\u0001"));
        return type;
    }

    @fg.l
    public static final List<l1> m(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("森\u0001"));
        p(h0Var);
        return h0Var.M0().subList((n(h0Var) ? 1 : 0) + a(h0Var), r0.size() - 1);
    }

    public static final boolean n(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("森\u0001"));
        return p(h0Var) && s(h0Var);
    }

    public static final boolean o(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        l0.p(mVar, ProtectedSandApp.s("森\u0001"));
        kotlin.reflect.jvm.internal.impl.builtins.functions.f h4 = h(mVar);
        return l0.g(h4, f.a.f75688e) || l0.g(h4, f.d.f75691e);
    }

    public static final boolean p(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("森\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.h c5 = h0Var.O0().c();
        return c5 != null && o(c5);
    }

    public static final boolean q(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("森\u0001"));
        return l0.g(j(h0Var), f.a.f75688e);
    }

    public static final boolean r(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("森\u0001"));
        return l0.g(j(h0Var), f.d.f75691e);
    }

    private static final boolean s(h0 h0Var) {
        return h0Var.getAnnotations().k(l.a.C) != null;
    }

    @fg.l
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g t(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.l h hVar, int i4) {
        l0.p(gVar, ProtectedSandApp.s("森\u0001"));
        l0.p(hVar, ProtectedSandApp.s("棰\u0001"));
        kotlin.reflect.jvm.internal.impl.name.c cVar = l.a.D;
        return gVar.o3(cVar) ? gVar : kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.a(w.A4(gVar, new kotlin.reflect.jvm.internal.impl.descriptors.annotations.j(hVar, cVar, z0.k(new q0(l.f75826o, new kotlin.reflect.jvm.internal.impl.resolve.constants.m(i4))), false, 8, null)));
    }

    @fg.l
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g u(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.l h hVar) {
        l0.p(gVar, ProtectedSandApp.s("森\u0001"));
        l0.p(hVar, ProtectedSandApp.s("棰\u0001"));
        kotlin.reflect.jvm.internal.impl.name.c cVar = l.a.C;
        return gVar.o3(cVar) ? gVar : kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.a(w.A4(gVar, new kotlin.reflect.jvm.internal.impl.descriptors.annotations.j(hVar, cVar, z0.z(), false, 8, null)));
    }
}
