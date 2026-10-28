package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.compose.animation.d1;
import androidx.compose.ui.graphics.k6;
import androidx.compose.ui.graphics.l6;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.j0;
import kotlin.collections.r0;
import kotlin.collections.w;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.y;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.c;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.s1;
import kotlin.reflect.jvm.internal.impl.types.t1;
import kotlin.reflect.o;
import wd.b0;
import wd.r;
import wd.x;

/* compiled from: LazyJavaScope.kt */
@r1({"SMAP\nLazyJavaScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,408:1\n1477#2:409\n1502#2,3:410\n1505#2,3:420\n1549#2:423\n1620#2,3:424\n1549#2:427\n1620#2,3:428\n372#3,7:413\n1#4:431\n*S KotlinDebug\n*F\n+ 1 LazyJavaScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaScope\n*L\n129#1:409\n129#1:410,3\n129#1:420,3\n165#1:423\n165#1:424,3\n212#1:427\n212#1:428,3\n129#1:413,7\n*E\n"})
/* loaded from: classes7.dex */
public abstract class j extends kotlin.reflect.jvm.internal.impl.resolve.scopes.i {

    /* renamed from: m, reason: collision with root package name */
    static final /* synthetic */ o<Object>[] f76590m = {l1.u(new g1(l1.d(j.class), ProtectedSandApp.s("煯\u0001"), ProtectedSandApp.s("煰\u0001"))), l1.u(new g1(l1.d(j.class), ProtectedSandApp.s("煱\u0001"), ProtectedSandApp.s("煲\u0001"))), l1.u(new g1(l1.d(j.class), ProtectedSandApp.s("煳\u0001"), ProtectedSandApp.s("煴\u0001")))};

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.g f76591b;

    /* renamed from: c, reason: collision with root package name */
    @fg.m
    private final j f76592c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.i<Collection<kotlin.reflect.jvm.internal.impl.descriptors.m>> f76593d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b> f76594e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.f, Collection<z0>> f76595f;

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.f, u0> f76596g;

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.f, Collection<z0>> f76597h;

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.i f76598i;

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.i f76599j;

    /* renamed from: k, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.i f76600k;

    /* renamed from: l, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.f, List<u0>> f76601l;

    /* compiled from: LazyJavaScope.kt */
    protected static final class a {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        private final h0 f76602a;

        /* renamed from: b, reason: collision with root package name */
        @fg.m
        private final h0 f76603b;

        /* renamed from: c, reason: collision with root package name */
        @fg.l
        private final List<j1> f76604c;

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        private final List<f1> f76605d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f76606e;

        /* renamed from: f, reason: collision with root package name */
        @fg.l
        private final List<String> f76607f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@fg.l h0 h0Var, @fg.m h0 h0Var2, @fg.l List<? extends j1> list, @fg.l List<? extends f1> list2, boolean z4, @fg.l List<String> list3) {
            l0.p(h0Var, ProtectedSandApp.s("燏\u0001"));
            l0.p(list, ProtectedSandApp.s("燐\u0001"));
            l0.p(list2, ProtectedSandApp.s("燑\u0001"));
            l0.p(list3, ProtectedSandApp.s("燒\u0001"));
            this.f76602a = h0Var;
            this.f76603b = h0Var2;
            this.f76604c = list;
            this.f76605d = list2;
            this.f76606e = z4;
            this.f76607f = list3;
        }

        @fg.l
        public final List<String> a() {
            return this.f76607f;
        }

        public final boolean b() {
            return this.f76606e;
        }

        @fg.m
        public final h0 c() {
            return this.f76603b;
        }

        @fg.l
        public final h0 d() {
            return this.f76602a;
        }

        @fg.l
        public final List<f1> e() {
            return this.f76605d;
        }

        public boolean equals(@fg.m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l0.g(this.f76602a, aVar.f76602a) && l0.g(this.f76603b, aVar.f76603b) && l0.g(this.f76604c, aVar.f76604c) && l0.g(this.f76605d, aVar.f76605d) && this.f76606e == aVar.f76606e && l0.g(this.f76607f, aVar.f76607f);
        }

        @fg.l
        public final List<j1> f() {
            return this.f76604c;
        }

        public int hashCode() {
            int hashCode = this.f76602a.hashCode() * 31;
            h0 h0Var = this.f76603b;
            return this.f76607f.hashCode() + d1.a(this.f76606e, k6.a(this.f76605d, k6.a(this.f76604c, (hashCode + (h0Var == null ? 0 : h0Var.hashCode())) * 31, 31), 31), 31);
        }

        @fg.l
        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("燓\u0001"));
            sb.append(this.f76602a);
            sb.append(ProtectedSandApp.s("燔\u0001"));
            sb.append(this.f76603b);
            sb.append(ProtectedSandApp.s("燕\u0001"));
            sb.append(this.f76604c);
            sb.append(ProtectedSandApp.s("燖\u0001"));
            sb.append(this.f76605d);
            sb.append(ProtectedSandApp.s("燗\u0001"));
            sb.append(this.f76606e);
            sb.append(ProtectedSandApp.s("燘\u0001"));
            return l6.a(sb, this.f76607f, ')');
        }
    }

    /* compiled from: LazyJavaScope.kt */
    protected static final class b {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        private final List<j1> f76608a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f76609b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@fg.l List<? extends j1> list, boolean z4) {
            l0.p(list, ProtectedSandApp.s("燙\u0001"));
            this.f76608a = list;
            this.f76609b = z4;
        }

        @fg.l
        public final List<j1> a() {
            return this.f76608a;
        }

        public final boolean b() {
            return this.f76609b;
        }
    }

    /* compiled from: LazyJavaScope.kt */
    static final class c extends n0 implements ld.a<Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.m>> {
        c() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> invoke() {
            return j.this.n(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f77973o, kotlin.reflect.jvm.internal.impl.resolve.scopes.h.f77998a.a());
        }
    }

    /* compiled from: LazyJavaScope.kt */
    static final class d extends n0 implements ld.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>> {
        d() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set<kotlin.reflect.jvm.internal.impl.name.f> invoke() {
            return j.this.m(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f77978t, null);
        }
    }

    /* compiled from: LazyJavaScope.kt */
    static final class e extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.name.f, u0> {
        e() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u0 invoke(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("燚\u0001"));
            if (j.this.C() != null) {
                return (u0) j.this.C().f76596g.invoke(fVar);
            }
            wd.n f4 = j.this.z().invoke().f(fVar);
            if (f4 == null || f4.J()) {
                return null;
            }
            return j.this.K(f4);
        }
    }

    /* compiled from: LazyJavaScope.kt */
    static final class f extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends z0>> {
        f() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<z0> invoke(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("燛\u0001"));
            if (j.this.C() != null) {
                return (Collection) j.this.C().f76595f.invoke(fVar);
            }
            ArrayList arrayList = new ArrayList();
            for (r rVar : j.this.z().invoke().d(fVar)) {
                kotlin.reflect.jvm.internal.impl.load.java.descriptors.e J = j.this.J(rVar);
                if (j.this.H(J)) {
                    j.this.x().a().h().a(rVar, J);
                    arrayList.add(J);
                }
            }
            j.this.p(arrayList, fVar);
            return arrayList;
        }
    }

    /* compiled from: LazyJavaScope.kt */
    static final class g extends n0 implements ld.a<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b> {
        g() {
            super(0);
        }

        @fg.l
        public final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b a() {
            return j.this.q();
        }

        @Override // ld.a
        public kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b invoke() {
            return j.this.q();
        }
    }

    /* compiled from: LazyJavaScope.kt */
    static final class h extends n0 implements ld.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>> {
        h() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set<kotlin.reflect.jvm.internal.impl.name.f> invoke() {
            return j.this.o(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f77980v, null);
        }
    }

    /* compiled from: LazyJavaScope.kt */
    static final class i extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends z0>> {
        i() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<z0> invoke(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("燜\u0001"));
            LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) j.this.f76595f.invoke(fVar));
            j.this.M(linkedHashSet);
            j.this.s(linkedHashSet, fVar);
            return w.V5(j.this.x().a().r().g(j.this.x(), linkedHashSet));
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j$j, reason: collision with other inner class name */
    static final class C1093j extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.name.f, List<? extends u0>> {
        C1093j() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<u0> invoke(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("燝\u0001"));
            ArrayList arrayList = new ArrayList();
            kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, j.this.f76596g.invoke(fVar));
            j.this.t(fVar, arrayList);
            return kotlin.reflect.jvm.internal.impl.resolve.f.t(j.this.D()) ? w.V5(arrayList) : w.V5(j.this.x().a().r().g(j.this.x(), arrayList));
        }
    }

    /* compiled from: LazyJavaScope.kt */
    static final class k extends n0 implements ld.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>> {
        k() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set<kotlin.reflect.jvm.internal.impl.name.f> invoke() {
            return j.this.u(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f77981w, null);
        }
    }

    /* compiled from: LazyJavaScope.kt */
    static final class l extends n0 implements ld.a<kotlin.reflect.jvm.internal.impl.storage.j<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ wd.n f76620c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k1.h<c0> f76621d;

        /* compiled from: LazyJavaScope.kt */
        static final class a extends n0 implements ld.a<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f76622b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ wd.n f76623c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ k1.h<c0> f76624d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j jVar, wd.n nVar, k1.h<c0> hVar) {
                super(0);
                this.f76622b = jVar;
                this.f76623c = nVar;
                this.f76624d = hVar;
            }

            @Override // ld.a
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> invoke() {
                return this.f76622b.x().a().g().a(this.f76623c, this.f76624d.f75329b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(wd.n nVar, k1.h<c0> hVar) {
            super(0);
            this.f76620c = nVar;
            this.f76621d = hVar;
        }

        @Override // ld.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> invoke() {
            return j.this.x().e().i(new a(j.this, this.f76620c, this.f76621d));
        }
    }

    /* compiled from: LazyJavaScope.kt */
    static final class m extends n0 implements ld.l<z0, kotlin.reflect.jvm.internal.impl.descriptors.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final m f76625b = new m(1);

        m() {
            super(1);
        }

        @fg.l
        public final kotlin.reflect.jvm.internal.impl.descriptors.a a(@fg.l z0 z0Var) {
            l0.p(z0Var, ProtectedSandApp.s("燞\u0001"));
            return z0Var;
        }

        @Override // ld.l
        public kotlin.reflect.jvm.internal.impl.descriptors.a invoke(z0 z0Var) {
            z0 z0Var2 = z0Var;
            l0.p(z0Var2, ProtectedSandApp.s("燞\u0001"));
            return z0Var2;
        }
    }

    public /* synthetic */ j(kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, j jVar, int i4, kotlin.jvm.internal.w wVar) {
        this(gVar, (i4 & 2) != 0 ? null : jVar);
    }

    private final Set<kotlin.reflect.jvm.internal.impl.name.f> B() {
        return (Set) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f76598i, this, f76590m[0]);
    }

    private final Set<kotlin.reflect.jvm.internal.impl.name.f> E() {
        return (Set) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f76599j, this, f76590m[1]);
    }

    private final h0 F(wd.n nVar) {
        h0 o4 = this.f76591b.g().o(nVar.getType(), kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(s1.COMMON, false, false, null, 7, null));
        if ((!kotlin.reflect.jvm.internal.impl.builtins.h.s0(o4) && !kotlin.reflect.jvm.internal.impl.builtins.h.v0(o4)) || !G(nVar) || !nVar.M()) {
            return o4;
        }
        h0 n4 = t1.n(o4);
        l0.o(n4, ProtectedSandApp.s("煶\u0001"));
        return n4;
    }

    private final boolean G(wd.n nVar) {
        return nVar.isFinal() && nVar.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, kotlin.reflect.jvm.internal.impl.descriptors.impl.c0] */
    /* JADX WARN: Type inference failed for: r1v13, types: [T, kotlin.reflect.jvm.internal.impl.descriptors.impl.c0] */
    public final u0 K(wd.n nVar) {
        k1.h hVar = new k1.h();
        ?? v4 = v(nVar);
        hVar.f75329b = v4;
        v4.X0(null, null, null, null);
        h0 F = F(nVar);
        c0 c0Var = (c0) hVar.f75329b;
        j0 j0Var = j0.f74919b;
        c0Var.d1(F, j0Var, A(), null, j0Var);
        kotlin.reflect.jvm.internal.impl.descriptors.m D = D();
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = D instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) D : null;
        if (eVar != null) {
            kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar = this.f76591b;
            hVar.f75329b = gVar.a().w().h(gVar, eVar, (c0) hVar.f75329b);
        }
        T t4 = hVar.f75329b;
        if (kotlin.reflect.jvm.internal.impl.resolve.f.K((kotlin.reflect.jvm.internal.impl.descriptors.l1) t4, ((c0) t4).getType())) {
            ((c0) hVar.f75329b).N0(new l(nVar, hVar));
        }
        this.f76591b.a().h().d(nVar, (u0) hVar.f75329b);
        return (u0) hVar.f75329b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(Set<z0> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            String c5 = y.c((z0) obj, false, false, 2, null);
            Object obj2 = linkedHashMap.get(c5);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(c5, obj2);
            }
            ((List) obj2).add(obj);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                List list2 = list;
                Collection<? extends z0> a5 = kotlin.reflect.jvm.internal.impl.resolve.n.a(list2, m.f76625b);
                set.removeAll(list2);
                set.addAll(a5);
            }
        }
    }

    private final c0 v(wd.n nVar) {
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.f h12 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.f.h1(D(), kotlin.reflect.jvm.internal.impl.load.java.lazy.e.a(this.f76591b, nVar), e0.FINAL, kotlin.reflect.jvm.internal.impl.load.java.j0.d(nVar.getVisibility()), !nVar.isFinal(), nVar.getName(), this.f76591b.a().t().a(nVar), G(nVar));
        l0.o(h12, ProtectedSandApp.s("煷\u0001"));
        return h12;
    }

    private final Set<kotlin.reflect.jvm.internal.impl.name.f> y() {
        return (Set) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f76600k, this, f76590m[2]);
    }

    @fg.m
    protected abstract x0 A();

    @fg.m
    protected final j C() {
        return this.f76592c;
    }

    @fg.l
    protected abstract kotlin.reflect.jvm.internal.impl.descriptors.m D();

    protected boolean H(@fg.l kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVar) {
        l0.p(eVar, ProtectedSandApp.s("煸\u0001"));
        return true;
    }

    @fg.l
    protected abstract a I(@fg.l r rVar, @fg.l List<? extends f1> list, @fg.l h0 h0Var, @fg.l List<? extends j1> list2);

    @fg.l
    protected final kotlin.reflect.jvm.internal.impl.load.java.descriptors.e J(@fg.l r rVar) {
        l0.p(rVar, ProtectedSandApp.s("煹\u0001"));
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.e q12 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.q1(D(), kotlin.reflect.jvm.internal.impl.load.java.lazy.e.a(this.f76591b, rVar), rVar.getName(), this.f76591b.a().t().a(rVar), this.f76594e.invoke().e(rVar.getName()) != null && rVar.i().isEmpty());
        l0.o(q12, ProtectedSandApp.s("煺\u0001"));
        kotlin.reflect.jvm.internal.impl.load.java.lazy.g f4 = kotlin.reflect.jvm.internal.impl.load.java.lazy.a.f(this.f76591b, q12, rVar, 0, 4, null);
        List<wd.y> typeParameters = rVar.getTypeParameters();
        List<? extends f1> arrayList = new ArrayList<>(w.b0(typeParameters, 10));
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            f1 a5 = f4.f().a((wd.y) it.next());
            l0.m(a5);
            arrayList.add(a5);
        }
        b L = L(f4, q12, rVar.i());
        a I = I(rVar, arrayList, r(rVar, f4), L.a());
        h0 c5 = I.c();
        q12.p1(c5 != null ? kotlin.reflect.jvm.internal.impl.resolve.e.i(q12, c5, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b()) : null, A(), j0.f74919b, I.e(), I.f(), I.d(), e0.Companion.a(false, rVar.isAbstract(), true ^ rVar.isFinal()), kotlin.reflect.jvm.internal.impl.load.java.j0.d(rVar.getVisibility()), I.c() != null ? kotlin.collections.z0.k(new q0(kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.H, w.B2(L.a()))) : kotlin.collections.z0.z());
        q12.t1(I.b(), L.b());
        if (!I.a().isEmpty()) {
            f4.a().s().a(q12, I.a());
        }
        return q12;
    }

    @fg.l
    protected final b L(@fg.l kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, @fg.l z zVar, @fg.l List<? extends b0> list) {
        q0 q0Var;
        kotlin.reflect.jvm.internal.impl.name.f name;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar2 = gVar;
        l0.p(gVar2, ProtectedSandApp.s("煵\u0001"));
        l0.p(zVar, ProtectedSandApp.s("煻\u0001"));
        l0.p(list, ProtectedSandApp.s("煼\u0001"));
        Iterable<r0> h6 = w.h6(list);
        ArrayList arrayList = new ArrayList(w.b0(h6, 10));
        boolean z4 = false;
        for (r0 r0Var : h6) {
            int index = r0Var.getIndex();
            b0 b0Var = (b0) r0Var.b();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g a5 = kotlin.reflect.jvm.internal.impl.load.java.lazy.e.a(gVar2, b0Var);
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a b5 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(s1.COMMON, false, false, null, 7, null);
            if (b0Var.a()) {
                x type = b0Var.getType();
                wd.f fVar = type instanceof wd.f ? (wd.f) type : null;
                if (fVar == null) {
                    throw new AssertionError(ProtectedSandApp.s("煽\u0001") + b0Var);
                }
                h0 k4 = gVar.g().k(fVar, b5, true);
                q0Var = new q0(k4, gVar.d().p().k(k4));
            } else {
                q0Var = new q0(gVar.g().o(b0Var.getType(), b5), null);
            }
            h0 h0Var = (h0) q0Var.a();
            h0 h0Var2 = (h0) q0Var.b();
            if (l0.g(zVar.getName().b(), ProtectedSandApp.s("煾\u0001")) && list.size() == 1 && l0.g(gVar.d().p().I(), h0Var)) {
                name = kotlin.reflect.jvm.internal.impl.name.f.f(ProtectedSandApp.s("煿\u0001"));
            } else {
                name = b0Var.getName();
                if (name == null) {
                    z4 = true;
                }
                if (name == null) {
                    name = kotlin.reflect.jvm.internal.impl.name.f.f(ProtectedSandApp.s("熀\u0001") + index);
                    l0.o(name, ProtectedSandApp.s("熁\u0001"));
                }
            }
            boolean z5 = z4;
            kotlin.reflect.jvm.internal.impl.name.f fVar2 = name;
            l0.m(fVar2);
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new kotlin.reflect.jvm.internal.impl.descriptors.impl.l0(zVar, null, index, a5, fVar2, h0Var, false, false, false, h0Var2, gVar.a().t().a(b0Var)));
            arrayList = arrayList2;
            z4 = z5;
            gVar2 = gVar;
        }
        return new b(w.V5(arrayList), z4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.l
    public Collection<z0> a(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("熂\u0001"));
        l0.p(bVar, ProtectedSandApp.s("熃\u0001"));
        return !c().contains(fVar) ? j0.f74919b : this.f76597h.invoke(fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.l
    public Collection<u0> b(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("熂\u0001"));
        l0.p(bVar, ProtectedSandApp.s("熃\u0001"));
        return !d().contains(fVar) ? j0.f74919b : this.f76601l.invoke(fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.l
    public Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
        return B();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.l
    public Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
        return E();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.l
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g(@fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("熄\u0001"));
        l0.p(lVar, ProtectedSandApp.s("熅\u0001"));
        return this.f76593d.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.l
    public Set<kotlin.reflect.jvm.internal.impl.name.f> h() {
        return y();
    }

    @fg.l
    protected abstract Set<kotlin.reflect.jvm.internal.impl.name.f> m(@fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @fg.m ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar);

    @fg.l
    protected final List<kotlin.reflect.jvm.internal.impl.descriptors.m> n(@fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("熄\u0001"));
        l0.p(lVar, ProtectedSandApp.s("熅\u0001"));
        ud.d dVar2 = ud.d.WHEN_GET_ALL_DESCRIPTORS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f77961c.getClass();
        if (dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f77970l)) {
            for (kotlin.reflect.jvm.internal.impl.name.f fVar : m(dVar, lVar)) {
                if (lVar.invoke(fVar).booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.utils.a.a(linkedHashSet, f(fVar, dVar2));
                }
            }
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f77961c.getClass();
        if (dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f77967i) && !dVar.l().contains(c.a.f77958a)) {
            for (kotlin.reflect.jvm.internal.impl.name.f fVar2 : o(dVar, lVar)) {
                if (lVar.invoke(fVar2).booleanValue()) {
                    linkedHashSet.addAll(a(fVar2, dVar2));
                }
            }
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f77961c.getClass();
        if (dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f77968j) && !dVar.l().contains(c.a.f77958a)) {
            for (kotlin.reflect.jvm.internal.impl.name.f fVar3 : u(dVar, lVar)) {
                if (lVar.invoke(fVar3).booleanValue()) {
                    linkedHashSet.addAll(b(fVar3, dVar2));
                }
            }
        }
        return w.V5(linkedHashSet);
    }

    @fg.l
    protected abstract Set<kotlin.reflect.jvm.internal.impl.name.f> o(@fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @fg.m ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar);

    protected void p(@fg.l Collection<z0> collection, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(collection, ProtectedSandApp.s("熆\u0001"));
        l0.p(fVar, ProtectedSandApp.s("熂\u0001"));
    }

    @fg.l
    protected abstract kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b q();

    @fg.l
    protected final h0 r(@fg.l r rVar, @fg.l kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar) {
        l0.p(rVar, ProtectedSandApp.s("煹\u0001"));
        l0.p(gVar, ProtectedSandApp.s("煵\u0001"));
        return gVar.g().o(rVar.getReturnType(), kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(s1.COMMON, rVar.N().t(), false, null, 6, null));
    }

    protected abstract void s(@fg.l Collection<z0> collection, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar);

    protected abstract void t(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l Collection<u0> collection);

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("熇\u0001") + D();
    }

    @fg.l
    protected abstract Set<kotlin.reflect.jvm.internal.impl.name.f> u(@fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @fg.m ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar);

    @fg.l
    protected final kotlin.reflect.jvm.internal.impl.storage.i<Collection<kotlin.reflect.jvm.internal.impl.descriptors.m>> w() {
        return this.f76593d;
    }

    @fg.l
    protected final kotlin.reflect.jvm.internal.impl.load.java.lazy.g x() {
        return this.f76591b;
    }

    @fg.l
    protected final kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b> z() {
        return this.f76594e;
    }

    public j(@fg.l kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, @fg.m j jVar) {
        l0.p(gVar, ProtectedSandApp.s("煵\u0001"));
        this.f76591b = gVar;
        this.f76592c = jVar;
        this.f76593d = gVar.e().d(new c(), j0.f74919b);
        this.f76594e = gVar.e().h(new g());
        this.f76595f = gVar.e().e(new f());
        this.f76596g = gVar.e().b(new e());
        this.f76597h = gVar.e().e(new i());
        this.f76598i = gVar.e().h(new h());
        this.f76599j = gVar.e().h(new k());
        this.f76600k = gVar.e().h(new d());
        this.f76601l = gVar.e().e(new C1093j());
    }
}
