package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import ce.u;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kd.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.r0;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.i;
import kotlin.reflect.jvm.internal.impl.types.b0;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.n1;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.p1;
import kotlin.reflect.jvm.internal.impl.types.q;
import kotlin.reflect.jvm.internal.impl.types.t1;
import kotlin.reflect.jvm.internal.impl.types.v0;
import kotlin.reflect.jvm.internal.impl.types.v1;
import kotlin.reflect.jvm.internal.impl.types.w1;
import kotlin.reflect.jvm.internal.impl.types.x0;
import kotlin.reflect.jvm.internal.impl.types.x1;
import ld.l;

/* compiled from: TypeUtils.kt */
@r1({"SMAP\nTypeUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeUtils.kt\norg/jetbrains/kotlin/types/typeUtil/TypeUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,406:1\n261#1,14:433\n276#1:451\n265#1,12:452\n261#1,14:464\n276#1:482\n265#1,12:483\n272#1,3:501\n276#1:508\n272#1,3:509\n276#1:516\n272#1,3:517\n276#1:524\n397#1:550\n397#1:551\n397#1:552\n1747#2,3:407\n1549#2:410\n1620#2,3:411\n1855#2,2:414\n1603#2,9:417\n1855#2:426\n1856#2:428\n1612#2:429\n766#2:430\n857#2,2:431\n1549#2:447\n1620#2,3:448\n1549#2:478\n1620#2,3:479\n1747#2,3:495\n1747#2,3:498\n1549#2:504\n1620#2,3:505\n1549#2:512\n1620#2,3:513\n1549#2:520\n1620#2,3:521\n1549#2:525\n1620#2,3:526\n1549#2:529\n1620#2,3:530\n1747#2,3:533\n288#2,2:536\n1549#2:538\n1620#2,3:539\n1549#2:542\n1620#2,3:543\n1549#2:546\n1620#2,3:547\n1#3:416\n1#3:427\n*S KotlinDebug\n*F\n+ 1 TypeUtils.kt\norg/jetbrains/kotlin/types/typeUtil/TypeUtilsKt\n*L\n200#1:433,14\n200#1:451\n200#1:452,12\n201#1:464,14\n201#1:482\n201#1:483,12\n264#1:501,3\n264#1:508\n265#1:509,3\n265#1:516\n267#1:517,3\n267#1:524\n389#1:550\n392#1:551\n395#1:552\n90#1:407,3\n141#1:410\n141#1:411,3\n157#1:414,2\n183#1:417,9\n183#1:426\n183#1:428\n183#1:429\n189#1:430\n189#1:431,2\n200#1:447\n200#1:448,3\n201#1:478\n201#1:479,3\n239#1:495,3\n251#1:498,3\n264#1:504\n264#1:505,3\n265#1:512\n265#1:513,3\n267#1:520\n267#1:521,3\n274#1:525\n274#1:526,3\n281#1:529\n281#1:530,3\n307#1:533,3\n314#1:536,2\n324#1:538\n324#1:539,3\n343#1:542\n343#1:543,3\n351#1:546\n351#1:547,3\n183#1:427\n*E\n"})
/* loaded from: classes7.dex */
public final class a {

    /* compiled from: TypeUtils.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.types.typeUtil.a$a, reason: collision with other inner class name */
    static final class C1196a extends n0 implements l<w1, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1196a f78547b = new C1196a(1);

        C1196a() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l w1 w1Var) {
            l0.p(w1Var, ProtectedSandApp.s("聍\u0001"));
            h c5 = w1Var.O0().c();
            return Boolean.valueOf(c5 != null ? a.s(c5) : false);
        }
    }

    /* compiled from: TypeUtils.kt */
    static final class b extends n0 implements l<w1, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f78548b = new b(1);

        b() {
            super(1);
        }

        @Override // ld.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(w1 w1Var) {
            return Boolean.valueOf(t1.m(w1Var));
        }
    }

    /* compiled from: TypeUtils.kt */
    static final class c extends n0 implements l<w1, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f78549b = new c(1);

        c() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l w1 w1Var) {
            l0.p(w1Var, ProtectedSandApp.s("聎\u0001"));
            h c5 = w1Var.O0().c();
            boolean z4 = false;
            if (c5 != null && ((c5 instanceof e1) || (c5 instanceof f1))) {
                z4 = true;
            }
            return Boolean.valueOf(z4);
        }
    }

    /* compiled from: TypeUtils.kt */
    static final class d extends n0 implements l<w1, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f78550b = new d(1);

        d() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l w1 w1Var) {
            l0.p(w1Var, ProtectedSandApp.s("聏\u0001"));
            return Boolean.valueOf((w1Var instanceof x0) || (w1Var.O0() instanceof u) || j0.a(w1Var));
        }
    }

    public static final boolean A(@m h0 h0Var) {
        return h0Var == null || b(h0Var, d.f78550b);
    }

    @fg.l
    public static final l1 a(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("聐\u0001"));
        return new n1(h0Var);
    }

    public static final boolean b(@fg.l h0 h0Var, @fg.l l<? super w1, Boolean> lVar) {
        l0.p(h0Var, ProtectedSandApp.s("聐\u0001"));
        l0.p(lVar, ProtectedSandApp.s("聑\u0001"));
        return t1.c(h0Var, lVar);
    }

    private static final boolean c(h0 h0Var, h1 h1Var, Set<? extends f1> set) {
        boolean c5;
        if (l0.g(h0Var.O0(), h1Var)) {
            return true;
        }
        h c6 = h0Var.O0().c();
        i iVar = c6 instanceof i ? (i) c6 : null;
        List<f1> s4 = iVar != null ? iVar.s() : null;
        Iterable<r0> h6 = w.h6(h0Var.M0());
        if (!(h6 instanceof Collection) || !((Collection) h6).isEmpty()) {
            for (r0 r0Var : h6) {
                int index = r0Var.getIndex();
                l1 l1Var = (l1) r0Var.b();
                f1 f1Var = s4 != null ? (f1) w.W2(s4, index) : null;
                if ((f1Var == null || set == null || !set.contains(f1Var)) && !l1Var.b()) {
                    h0 type = l1Var.getType();
                    l0.o(type, ProtectedSandApp.s("聒\u0001"));
                    c5 = c(type, h1Var, set);
                } else {
                    c5 = false;
                }
                if (c5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean d(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("聐\u0001"));
        return b(h0Var, C1196a.f78547b);
    }

    public static final boolean e(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("聐\u0001"));
        return t1.c(h0Var, b.f78548b);
    }

    @fg.l
    public static final l1 f(@fg.l h0 h0Var, @fg.l x1 x1Var, @m f1 f1Var) {
        l0.p(h0Var, ProtectedSandApp.s("聓\u0001"));
        l0.p(x1Var, ProtectedSandApp.s("联\u0001"));
        if ((f1Var != null ? f1Var.o() : null) == x1Var) {
            x1Var = x1.INVARIANT;
        }
        return new n1(x1Var, h0Var);
    }

    @fg.l
    public static final Set<f1> g(@fg.l h0 h0Var, @m Set<? extends f1> set) {
        l0.p(h0Var, ProtectedSandApp.s("聐\u0001"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        h(h0Var, h0Var, linkedHashSet, set);
        return linkedHashSet;
    }

    private static final void h(h0 h0Var, h0 h0Var2, Set<f1> set, Set<? extends f1> set2) {
        h c5 = h0Var.O0().c();
        if (c5 instanceof f1) {
            if (!l0.g(h0Var.O0(), h0Var2.O0())) {
                set.add(c5);
                return;
            }
            for (h0 h0Var3 : ((f1) c5).getUpperBounds()) {
                l0.m(h0Var3);
                h(h0Var3, h0Var2, set, set2);
            }
            return;
        }
        h c6 = h0Var.O0().c();
        i iVar = c6 instanceof i ? (i) c6 : null;
        List<f1> s4 = iVar != null ? iVar.s() : null;
        int i4 = 0;
        for (l1 l1Var : h0Var.M0()) {
            int i5 = i4 + 1;
            f1 f1Var = s4 != null ? (f1) w.W2(s4, i4) : null;
            if ((f1Var == null || set2 == null || !set2.contains(f1Var)) && !l1Var.b() && !w.W1(set, l1Var.getType().O0().c()) && !l0.g(l1Var.getType().O0(), h0Var2.O0())) {
                h0 type = l1Var.getType();
                l0.o(type, ProtectedSandApp.s("聒\u0001"));
                h(type, h0Var2, set, set2);
            }
            i4 = i5;
        }
    }

    @fg.l
    public static final kotlin.reflect.jvm.internal.impl.builtins.h i(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("聐\u0001"));
        kotlin.reflect.jvm.internal.impl.builtins.h p4 = h0Var.O0().p();
        l0.o(p4, ProtectedSandApp.s("聕\u0001"));
        return p4;
    }

    @fg.l
    public static final h0 j(@fg.l f1 f1Var) {
        Object obj;
        l0.p(f1Var, ProtectedSandApp.s("聐\u0001"));
        List<h0> upperBounds = f1Var.getUpperBounds();
        String s4 = ProtectedSandApp.s("聖\u0001");
        l0.o(upperBounds, s4);
        upperBounds.isEmpty();
        List<h0> upperBounds2 = f1Var.getUpperBounds();
        l0.o(upperBounds2, s4);
        Iterator<T> it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            h c5 = ((h0) next).O0().c();
            e eVar = c5 instanceof e ? (e) c5 : null;
            if (eVar != null && eVar.b() != f.INTERFACE && eVar.b() != f.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        h0 h0Var = (h0) obj;
        if (h0Var != null) {
            return h0Var;
        }
        List<h0> upperBounds3 = f1Var.getUpperBounds();
        l0.o(upperBounds3, s4);
        Object B2 = w.B2(upperBounds3);
        l0.o(B2, ProtectedSandApp.s("聗\u0001"));
        return (h0) B2;
    }

    @j
    public static final boolean k(@fg.l f1 f1Var) {
        l0.p(f1Var, ProtectedSandApp.s("聘\u0001"));
        return m(f1Var, null, null, 6, null);
    }

    @j
    public static final boolean l(@fg.l f1 f1Var, @m h1 h1Var, @m Set<? extends f1> set) {
        l0.p(f1Var, ProtectedSandApp.s("聘\u0001"));
        List<h0> upperBounds = f1Var.getUpperBounds();
        l0.o(upperBounds, ProtectedSandApp.s("聖\u0001"));
        List<h0> list = upperBounds;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (h0 h0Var : list) {
            l0.m(h0Var);
            if (c(h0Var, f1Var.r().O0(), set) && (h1Var == null || l0.g(h0Var.O0(), h1Var))) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean m(f1 f1Var, h1 h1Var, Set set, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            h1Var = null;
        }
        if ((i4 & 4) != 0) {
            set = null;
        }
        return l(f1Var, h1Var, set);
    }

    public static final boolean n(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("聐\u0001"));
        return kotlin.reflect.jvm.internal.impl.builtins.h.f0(h0Var);
    }

    public static final boolean o(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("聐\u0001"));
        return kotlin.reflect.jvm.internal.impl.builtins.h.n0(h0Var);
    }

    public static final boolean p(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("聐\u0001"));
        return (h0Var instanceof kotlin.reflect.jvm.internal.impl.types.f) || ((h0Var instanceof q) && (((q) h0Var).a1() instanceof kotlin.reflect.jvm.internal.impl.types.f));
    }

    public static final boolean q(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("聐\u0001"));
        return (h0Var instanceof x0) || ((h0Var instanceof q) && (((q) h0Var).a1() instanceof x0));
    }

    public static final boolean r(@fg.l h0 h0Var, @fg.l h0 h0Var2) {
        l0.p(h0Var, ProtectedSandApp.s("聐\u0001"));
        l0.p(h0Var2, ProtectedSandApp.s("聙\u0001"));
        return kotlin.reflect.jvm.internal.impl.types.checker.e.f78349a.d(h0Var, h0Var2);
    }

    public static final boolean s(@fg.l h hVar) {
        l0.p(hVar, ProtectedSandApp.s("聐\u0001"));
        return (hVar instanceof f1) && (((f1) hVar).c() instanceof e1);
    }

    public static final boolean t(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("聐\u0001"));
        return t1.m(h0Var);
    }

    public static final boolean u(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("聓\u0001"));
        return (h0Var instanceof kotlin.reflect.jvm.internal.impl.types.error.h) && ((kotlin.reflect.jvm.internal.impl.types.error.h) h0Var).Y0().isUnresolved();
    }

    @fg.l
    public static final h0 v(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("聐\u0001"));
        h0 n4 = t1.n(h0Var);
        l0.o(n4, ProtectedSandApp.s("聚\u0001"));
        return n4;
    }

    @fg.l
    public static final h0 w(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("聐\u0001"));
        h0 o4 = t1.o(h0Var);
        l0.o(o4, ProtectedSandApp.s("聛\u0001"));
        return o4;
    }

    @fg.l
    public static final h0 x(@fg.l h0 h0Var, @fg.l g gVar) {
        l0.p(h0Var, ProtectedSandApp.s("聐\u0001"));
        l0.p(gVar, ProtectedSandApp.s("聜\u0001"));
        return (h0Var.getAnnotations().isEmpty() && gVar.isEmpty()) ? h0Var : h0Var.R0().U0(kotlin.reflect.jvm.internal.impl.types.e1.a(h0Var.N0(), gVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [kotlin.reflect.jvm.internal.impl.types.w1] */
    @fg.l
    public static final h0 y(@fg.l h0 h0Var) {
        p0 p0Var;
        l0.p(h0Var, ProtectedSandApp.s("聐\u0001"));
        w1 R0 = h0Var.R0();
        boolean z4 = R0 instanceof b0;
        String s4 = ProtectedSandApp.s("聝\u0001");
        if (z4) {
            b0 b0Var = (b0) R0;
            p0 W0 = b0Var.W0();
            if (!W0.O0().getParameters().isEmpty() && W0.O0().c() != null) {
                List<f1> parameters = W0.O0().getParameters();
                l0.o(parameters, s4);
                List<f1> list = parameters;
                ArrayList arrayList = new ArrayList(w.b0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new v0((f1) it.next()));
                }
                W0 = p1.f(W0, arrayList, null, 2, null);
            }
            p0 X0 = b0Var.X0();
            if (!X0.O0().getParameters().isEmpty() && X0.O0().c() != null) {
                List<f1> parameters2 = X0.O0().getParameters();
                l0.o(parameters2, s4);
                List<f1> list2 = parameters2;
                ArrayList arrayList2 = new ArrayList(w.b0(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new v0((f1) it2.next()));
                }
                X0 = p1.f(X0, arrayList2, null, 2, null);
            }
            p0Var = i0.d(W0, X0);
        } else {
            if (!(R0 instanceof p0)) {
                throw new NoWhenBranchMatchedException();
            }
            p0 p0Var2 = (p0) R0;
            boolean isEmpty = p0Var2.O0().getParameters().isEmpty();
            p0Var = p0Var2;
            if (!isEmpty) {
                h c5 = p0Var2.O0().c();
                p0Var = p0Var2;
                if (c5 != null) {
                    List<f1> parameters3 = p0Var2.O0().getParameters();
                    l0.o(parameters3, s4);
                    List<f1> list3 = parameters3;
                    ArrayList arrayList3 = new ArrayList(w.b0(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new v0((f1) it3.next()));
                    }
                    p0Var = p1.f(p0Var2, arrayList3, null, 2, null);
                }
            }
        }
        return v1.b(p0Var, R0);
    }

    public static final boolean z(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("聐\u0001"));
        return b(h0Var, c.f78549b);
    }
}
