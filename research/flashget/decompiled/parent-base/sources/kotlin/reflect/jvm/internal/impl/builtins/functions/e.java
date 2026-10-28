package kotlin.reflect.jvm.internal.impl.builtins.functions;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.j0;
import kotlin.collections.r0;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.p;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.q1;
import kotlin.reflect.jvm.internal.impl.types.x1;
import kotlin.reflect.jvm.internal.impl.util.q;

/* compiled from: FunctionInvokeDescriptor.kt */
@r1({"SMAP\nFunctionInvokeDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FunctionInvokeDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionInvokeDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,161:1\n2624#2,3:162\n1549#2:165\n1620#2,3:166\n1726#2,3:169\n1549#2:172\n1620#2,3:173\n1747#2,3:176\n*S KotlinDebug\n*F\n+ 1 FunctionInvokeDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionInvokeDescriptor\n*L\n63#1:162,3\n64#1:165\n64#1:166,3\n88#1:169,3\n92#1:172\n92#1:173,3\n106#1:176,3\n*E\n"})
/* loaded from: classes7.dex */
public final class e extends g0 {

    @l
    public static final a F = new a();

    /* compiled from: FunctionInvokeDescriptor.kt */
    @r1({"SMAP\nFunctionInvokeDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FunctionInvokeDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionInvokeDescriptor$Factory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,161:1\n959#2,7:162\n1549#2:169\n1620#2,3:170\n*S KotlinDebug\n*F\n+ 1 FunctionInvokeDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionInvokeDescriptor$Factory\n*L\n122#1:162,7\n124#1:169\n124#1:170,3\n*E\n"})
    public static final class a {
        private a() {
        }

        private final j1 b(e eVar, int i4, f1 f1Var) {
            String lowerCase;
            String b5 = f1Var.getName().b();
            l0.o(b5, ProtectedSandApp.s("桰\u0001"));
            if (l0.g(b5, ProtectedSandApp.s("桱\u0001"))) {
                lowerCase = ProtectedSandApp.s("桲\u0001");
            } else if (l0.g(b5, ProtectedSandApp.s("桳\u0001"))) {
                lowerCase = ProtectedSandApp.s("桴\u0001");
            } else {
                lowerCase = b5.toLowerCase(Locale.ROOT);
                l0.o(lowerCase, ProtectedSandApp.s("桵\u0001"));
            }
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b6 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b();
            kotlin.reflect.jvm.internal.impl.name.f f4 = kotlin.reflect.jvm.internal.impl.name.f.f(lowerCase);
            l0.o(f4, ProtectedSandApp.s("桶\u0001"));
            p0 r4 = f1Var.r();
            l0.o(r4, ProtectedSandApp.s("桷\u0001"));
            a1 a1Var = a1.f75900a;
            l0.o(a1Var, ProtectedSandApp.s("桸\u0001"));
            return new kotlin.reflect.jvm.internal.impl.descriptors.impl.l0(eVar, null, i4, b6, f4, r4, false, false, false, null, a1Var);
        }

        @l
        public final e a(@l b bVar, boolean z4) {
            l0.p(bVar, ProtectedSandApp.s("桹\u0001"));
            List<f1> s4 = bVar.s();
            e eVar = new e(bVar, null, b.a.DECLARATION, z4, null);
            x0 K0 = bVar.K0();
            j0 j0Var = j0.f74919b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : s4) {
                if (((f1) obj).o() != x1.IN_VARIANCE) {
                    break;
                }
                arrayList.add(obj);
            }
            Iterable<r0> h6 = w.h6(arrayList);
            ArrayList arrayList2 = new ArrayList(w.b0(h6, 10));
            for (r0 r0Var : h6) {
                arrayList2.add(e.F.b(eVar, r0Var.e(), (f1) r0Var.f()));
            }
            eVar.S0(null, K0, j0Var, j0Var, arrayList2, ((f1) w.p3(s4)).r(), e0.ABSTRACT, t.f76290e);
            eVar.a1(true);
            return eVar;
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ e(m mVar, e eVar, b.a aVar, boolean z4, kotlin.jvm.internal.w wVar) {
        this(mVar, eVar, aVar, z4);
    }

    private final z q1(List<kotlin.reflect.jvm.internal.impl.name.f> list) {
        kotlin.reflect.jvm.internal.impl.name.f fVar;
        int size = i().size() - list.size();
        boolean z4 = true;
        String s4 = ProtectedSandApp.s("棗\u0001");
        if (size == 0) {
            List<j1> i4 = i();
            l0.o(i4, s4);
            List<q0> i6 = w.i6(list, i4);
            if (!(i6 instanceof Collection) || !i6.isEmpty()) {
                for (q0 q0Var : i6) {
                    if (!l0.g((kotlin.reflect.jvm.internal.impl.name.f) q0Var.a(), ((j1) q0Var.b()).getName())) {
                    }
                }
            }
            return this;
        }
        List<j1> i5 = i();
        l0.o(i5, s4);
        List<j1> list2 = i5;
        ArrayList arrayList = new ArrayList(w.b0(list2, 10));
        for (j1 j1Var : list2) {
            kotlin.reflect.jvm.internal.impl.name.f name = j1Var.getName();
            l0.o(name, ProtectedSandApp.s("棘\u0001"));
            int index = j1Var.getIndex();
            int i7 = index - size;
            if (i7 >= 0 && (fVar = list.get(i7)) != null) {
                name = fVar;
            }
            arrayList.add(j1Var.c0(this, name, index));
        }
        p.c T0 = T0(q1.f78532b);
        List<kotlin.reflect.jvm.internal.impl.name.f> list3 = list;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                if (((kotlin.reflect.jvm.internal.impl.name.f) it.next()) == null) {
                    break;
                }
            }
        }
        z4 = false;
        p.c o4 = T0.H(z4).c(arrayList).o(a());
        l0.o(o4, ProtectedSandApp.s("棙\u0001"));
        z N0 = super.N0(o4);
        l0.m(N0);
        return N0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.z
    public boolean G() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.g0, kotlin.reflect.jvm.internal.impl.descriptors.impl.p
    @l
    protected p M0(@l m mVar, @fg.m z zVar, @l b.a aVar, @fg.m kotlin.reflect.jvm.internal.impl.name.f fVar, @l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @l a1 a1Var) {
        l0.p(mVar, ProtectedSandApp.s("棚\u0001"));
        l0.p(aVar, ProtectedSandApp.s("棛\u0001"));
        l0.p(gVar, ProtectedSandApp.s("棜\u0001"));
        l0.p(a1Var, ProtectedSandApp.s("棝\u0001"));
        return new e(mVar, (e) zVar, aVar, isSuspend());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p
    @fg.m
    protected z N0(@l p.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("棞\u0001"));
        e eVar = (e) super.N0(cVar);
        if (eVar == null) {
            return null;
        }
        List<j1> i4 = eVar.i();
        String s4 = ProtectedSandApp.s("棗\u0001");
        l0.o(i4, s4);
        List<j1> list = i4;
        if ((list instanceof Collection) && list.isEmpty()) {
            return eVar;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            h0 type = ((j1) it.next()).getType();
            String s5 = ProtectedSandApp.s("棟\u0001");
            l0.o(type, s5);
            if (kotlin.reflect.jvm.internal.impl.builtins.g.d(type) != null) {
                List<j1> i5 = eVar.i();
                l0.o(i5, s4);
                List<j1> list2 = i5;
                ArrayList arrayList = new ArrayList(w.b0(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    h0 type2 = ((j1) it2.next()).getType();
                    l0.o(type2, s5);
                    arrayList.add(kotlin.reflect.jvm.internal.impl.builtins.g.d(type2));
                }
                return eVar.q1(arrayList);
            }
        }
        return eVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.z
    public boolean k() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean t() {
        return false;
    }

    private e(m mVar, e eVar, b.a aVar, boolean z4) {
        super(mVar, eVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b(), q.f78627i, aVar, a1.f75900a);
        g1(true);
        i1(z4);
        Z0(false);
    }
}
