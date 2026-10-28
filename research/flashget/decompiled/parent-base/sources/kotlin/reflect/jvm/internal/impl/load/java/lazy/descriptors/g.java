package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.w;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.load.java.a0;
import kotlin.reflect.jvm.internal.impl.load.java.b0;
import kotlin.reflect.jvm.internal.impl.load.java.components.j;
import kotlin.reflect.jvm.internal.impl.load.java.f0;
import kotlin.reflect.jvm.internal.impl.load.java.i0;
import kotlin.reflect.jvm.internal.impl.load.java.j0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j;
import kotlin.reflect.jvm.internal.impl.load.java.p;
import kotlin.reflect.jvm.internal.impl.load.java.s;
import kotlin.reflect.jvm.internal.impl.load.kotlin.y;
import kotlin.reflect.jvm.internal.impl.resolve.l;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.s1;
import kotlin.reflect.jvm.internal.impl.types.t1;
import kotlin.reflect.jvm.internal.impl.utils.g;
import wd.q;
import wd.r;
import wd.x;

/* compiled from: LazyJavaClassMemberScope.kt */
@r1({"SMAP\nLazyJavaClassMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaClassMemberScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassMemberScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,890:1\n1446#2,5:891\n1747#2,2:897\n1747#2,3:899\n1749#2:902\n1603#2,9:903\n1855#2:912\n1856#2:914\n1612#2:915\n1747#2,3:916\n1549#2:919\n1620#2,3:920\n819#2:923\n847#2,2:924\n766#2:926\n857#2,2:927\n1747#2,3:929\n1747#2,3:932\n2624#2,3:935\n766#2:938\n857#2,2:939\n766#2:941\n857#2,2:942\n1549#2:944\n1620#2,3:945\n2624#2,3:948\n288#2,2:951\n1549#2:953\n1620#2,3:954\n1446#2,5:957\n2624#2,3:962\n1360#2:965\n1446#2,2:966\n1549#2:968\n1620#2,3:969\n1448#2,3:972\n1549#2:975\n1620#2,3:976\n3190#2,10:979\n1446#2,5:989\n1#3:896\n1#3:913\n*S KotlinDebug\n*F\n+ 1 LazyJavaClassMemberScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassMemberScope\n*L\n74#1:891,5\n160#1:897,2\n161#1:899,3\n160#1:902\n189#1:903,9\n189#1:912\n189#1:914\n189#1:915\n193#1:916,3\n199#1:919\n199#1:920,3\n202#1:923\n202#1:924,2\n211#1:926\n211#1:927,2\n216#1:929,3\n222#1:932,3\n322#1:935,3\n327#1:938\n327#1:939,2\n354#1:941\n354#1:942,2\n376#1:944\n376#1:945,3\n461#1:948,3\n470#1:951,2\n476#1:953\n476#1:954,3\n489#1:957,5\n495#1:962,3\n649#1:965\n649#1:966,2\n650#1:968\n650#1:969,3\n649#1:972,3\n698#1:975\n698#1:976,3\n749#1:979,10\n879#1:989,5\n189#1:913\n*E\n"})
/* loaded from: classes7.dex */
public final class g extends kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j {

    /* renamed from: n, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.descriptors.e f76542n;

    /* renamed from: o, reason: collision with root package name */
    @fg.l
    private final wd.g f76543o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f76544p;

    /* renamed from: q, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.i<List<kotlin.reflect.jvm.internal.impl.descriptors.d>> f76545q;

    /* renamed from: r, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.i<Set<kotlin.reflect.jvm.internal.impl.name.f>> f76546r;

    /* renamed from: s, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.i<Set<kotlin.reflect.jvm.internal.impl.name.f>> f76547s;

    /* renamed from: t, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.i<Map<kotlin.reflect.jvm.internal.impl.name.f, wd.n>> f76548t;

    /* renamed from: u, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.descriptors.e> f76549u;

    /* compiled from: LazyJavaClassMemberScope.kt */
    static final class a extends n0 implements ld.l<q, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f76550b = new a(1);

        a() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l q qVar) {
            l0.p(qVar, ProtectedSandApp.s("煢\u0001"));
            return Boolean.valueOf(!qVar.o());
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* synthetic */ class b extends g0 implements ld.l<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends z0>> {
        b(Object obj) {
            super(1, obj);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public final Collection<z0> invoke(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("煣\u0001"));
            return ((g) this.receiver).J0(fVar);
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.c
        @fg.l
        public final String getName() {
            return ProtectedSandApp.s("煤\u0001");
        }

        @Override // kotlin.jvm.internal.q
        @fg.l
        public final kotlin.reflect.h getOwner() {
            return l1.d(g.class);
        }

        @Override // kotlin.jvm.internal.q
        @fg.l
        public final String getSignature() {
            return ProtectedSandApp.s("煥\u0001");
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* synthetic */ class c extends g0 implements ld.l<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends z0>> {
        c(Object obj) {
            super(1, obj);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public final Collection<z0> invoke(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("煦\u0001"));
            return ((g) this.receiver).K0(fVar);
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.c
        @fg.l
        public final String getName() {
            return ProtectedSandApp.s("照\u0001");
        }

        @Override // kotlin.jvm.internal.q
        @fg.l
        public final kotlin.reflect.h getOwner() {
            return l1.d(g.class);
        }

        @Override // kotlin.jvm.internal.q
        @fg.l
        public final String getSignature() {
            return ProtectedSandApp.s("煨\u0001");
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    static final class d extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends z0>> {
        d() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<z0> invoke(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("煩\u0001"));
            return g.this.J0(fVar);
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    static final class e extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends z0>> {
        e() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<z0> invoke(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("煪\u0001"));
            return g.this.K0(fVar);
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    @r1({"SMAP\nLazyJavaClassMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaClassMemberScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassMemberScope$constructors$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 collections.kt\norg/jetbrains/kotlin/utils/CollectionsKt\n*L\n1#1,890:1\n2624#2,3:891\n1#3:894\n55#4:895\n*S KotlinDebug\n*F\n+ 1 LazyJavaClassMemberScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassMemberScope$constructors$1\n*L\n95#1:891,3\n105#1:895\n*E\n"})
    static final class f extends n0 implements ld.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.d>> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.g f76554c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar) {
            super(0);
            this.f76554c = gVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Collection] */
        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<kotlin.reflect.jvm.internal.impl.descriptors.d> invoke() {
            Collection<wd.k> h4 = g.this.f76543o.h();
            ArrayList arrayList = new ArrayList(h4.size());
            Iterator<wd.k> it = h4.iterator();
            while (it.hasNext()) {
                arrayList.add(g.this.H0(it.next()));
            }
            if (g.this.f76543o.v()) {
                kotlin.reflect.jvm.internal.impl.descriptors.d g02 = g.this.g0();
                String c5 = y.c(g02, false, false, 2, null);
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (l0.g(y.c((kotlin.reflect.jvm.internal.impl.descriptors.d) it2.next(), false, false, 2, null), c5)) {
                            break;
                        }
                    }
                }
                arrayList.add(g02);
                this.f76554c.a().h().c(g.this.f76543o, g02);
            }
            kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar = this.f76554c;
            gVar.a().w().a(gVar, g.this.A0(), arrayList);
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.l r4 = this.f76554c.a().r();
            kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar2 = this.f76554c;
            g gVar3 = g.this;
            boolean isEmpty = arrayList.isEmpty();
            ArrayList arrayList2 = arrayList;
            if (isEmpty) {
                arrayList2 = w.P(gVar3.f0());
            }
            return w.V5(r4.g(gVar2, arrayList2));
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    @r1({"SMAP\nLazyJavaClassMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaClassMemberScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassMemberScope$enumEntryIndex$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,890:1\n766#2:891\n857#2,2:892\n1194#2,2:894\n1222#2,4:896\n*S KotlinDebug\n*F\n+ 1 LazyJavaClassMemberScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassMemberScope$enumEntryIndex$1\n*L\n811#1:891\n811#1:892,2\n811#1:894,2\n811#1:896,4\n*E\n"})
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g$g, reason: collision with other inner class name */
    static final class C1091g extends n0 implements ld.a<Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends wd.n>> {
        C1091g() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<kotlin.reflect.jvm.internal.impl.name.f, wd.n> invoke() {
            Collection<wd.n> l4 = g.this.f76543o.l();
            ArrayList arrayList = new ArrayList();
            for (Object obj : l4) {
                if (((wd.n) obj).J()) {
                    arrayList.add(obj);
                }
            }
            int j4 = kotlin.collections.z0.j(w.b0(arrayList, 10));
            if (j4 < 16) {
                j4 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(j4);
            for (Object obj2 : arrayList) {
                linkedHashMap.put(((wd.n) obj2).getName(), obj2);
            }
            return linkedHashMap;
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    @r1({"SMAP\nLazyJavaClassMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaClassMemberScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassMemberScope$generatedNestedClassNames$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,890:1\n1#2:891\n*E\n"})
    static final class h extends n0 implements ld.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.g f76556b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f76557c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, g gVar2) {
            super(0);
            this.f76556b = gVar;
            this.f76557c = gVar2;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set<kotlin.reflect.jvm.internal.impl.name.f> invoke() {
            kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar = this.f76556b;
            return w.a6(gVar.a().w().g(gVar, this.f76557c.A0()));
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    static final class i extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends z0>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z0 f76558b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f76559c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(z0 z0Var, g gVar) {
            super(1);
            this.f76558b = z0Var;
            this.f76559c = gVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<z0> invoke(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("煫\u0001"));
            return l0.g(this.f76558b.getName(), fVar) ? w.k(this.f76558b) : w.D4(this.f76559c.J0(fVar), this.f76559c.K0(fVar));
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    static final class j extends n0 implements ld.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>> {
        j() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set<kotlin.reflect.jvm.internal.impl.name.f> invoke() {
            return w.a6(g.this.f76543o.C());
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    @r1({"SMAP\nLazyJavaClassMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaClassMemberScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassMemberScope$nestedClasses$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,890:1\n1#2:891\n*E\n"})
    static final class k extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.descriptors.e> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.g f76562c;

        /* compiled from: LazyJavaClassMemberScope.kt */
        static final class a extends n0 implements ld.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ g f76563b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g gVar) {
                super(0);
                this.f76563b = gVar;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Set<kotlin.reflect.jvm.internal.impl.name.f> invoke() {
                return kotlin.collections.l1.C(this.f76563b.c(), this.f76563b.d());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar) {
            super(1);
            this.f76562c = gVar;
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.descriptors.e invoke(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("煬\u0001"));
            if (((Set) g.this.f76546r.invoke()).contains(fVar)) {
                p d5 = this.f76562c.a().d();
                kotlin.reflect.jvm.internal.impl.name.b k4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.k(g.this.A0());
                l0.m(k4);
                kotlin.reflect.jvm.internal.impl.name.b d6 = k4.d(fVar);
                l0.o(d6, ProtectedSandApp.s("煭\u0001"));
                wd.g a5 = d5.a(new p.a(d6, null, g.this.f76543o, 2, null));
                if (a5 == null) {
                    return null;
                }
                kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar = this.f76562c;
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f fVar2 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f(gVar, g.this.A0(), a5, null, 8, null);
                gVar.a().e().a(fVar2);
                return fVar2;
            }
            if (!((Set) g.this.f76547s.invoke()).contains(fVar)) {
                wd.n nVar = (wd.n) ((Map) g.this.f76548t.invoke()).get(fVar);
                if (nVar == null) {
                    return null;
                }
                return kotlin.reflect.jvm.internal.impl.descriptors.impl.n.M0(this.f76562c.e(), g.this.A0(), fVar, this.f76562c.e().h(new a(g.this)), kotlin.reflect.jvm.internal.impl.load.java.lazy.e.a(this.f76562c, nVar), this.f76562c.a().t().a(nVar));
            }
            kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar2 = this.f76562c;
            g gVar3 = g.this;
            kotlin.collections.builders.b bVar = new kotlin.collections.builders.b();
            gVar2.a().w().d(gVar2, gVar3.A0(), fVar, bVar);
            List a6 = w.a(bVar);
            int size = a6.size();
            if (size == 0) {
                return null;
            }
            if (size == 1) {
                return (kotlin.reflect.jvm.internal.impl.descriptors.e) w.h5(a6);
            }
            throw new IllegalStateException((ProtectedSandApp.s("煮\u0001") + a6).toString());
        }
    }

    public /* synthetic */ g(kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, wd.g gVar2, boolean z4, g gVar3, int i4, kotlin.jvm.internal.w wVar) {
        this(gVar, eVar, gVar2, z4, (i4 & 16) != 0 ? null : gVar3);
    }

    private final Set<u0> B0(kotlin.reflect.jvm.internal.impl.name.f fVar) {
        Collection<h0> d02 = d0();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = d02.iterator();
        while (it.hasNext()) {
            Collection<? extends u0> b5 = ((h0) it.next()).q().b(fVar, ud.d.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(w.b0(b5, 10));
            Iterator<T> it2 = b5.iterator();
            while (it2.hasNext()) {
                arrayList2.add((u0) it2.next());
            }
            w.q0(arrayList, arrayList2);
        }
        return w.a6(arrayList);
    }

    private final boolean C0(z0 z0Var, z zVar) {
        String c5 = y.c(z0Var, false, false, 2, null);
        z a5 = zVar.a();
        l0.o(a5, ProtectedSandApp.s("熋\u0001"));
        return l0.g(c5, y.c(a5, false, false, 2, null)) && !q0(z0Var, zVar);
    }

    private final boolean D0(z0 z0Var) {
        kotlin.reflect.jvm.internal.impl.name.f name = z0Var.getName();
        l0.o(name, ProtectedSandApp.s("熌\u0001"));
        List<kotlin.reflect.jvm.internal.impl.name.f> a5 = f0.a(name);
        if (!(a5 instanceof Collection) || !a5.isEmpty()) {
            Iterator<T> it = a5.iterator();
            while (it.hasNext()) {
                Set<u0> B0 = B0((kotlin.reflect.jvm.internal.impl.name.f) it.next());
                if (!(B0 instanceof Collection) || !B0.isEmpty()) {
                    for (u0 u0Var : B0) {
                        if (p0(u0Var, new i(z0Var, this))) {
                            if (!u0Var.Q()) {
                                String b5 = z0Var.getName().b();
                                l0.o(b5, ProtectedSandApp.s("熍\u0001"));
                                if (!a0.d(b5)) {
                                }
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return (r0(z0Var) || L0(z0Var) || t0(z0Var)) ? false : true;
    }

    private final z0 E0(z0 z0Var, ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, ? extends Collection<? extends z0>> lVar, Collection<? extends z0> collection) {
        z0 i02;
        z k4 = kotlin.reflect.jvm.internal.impl.load.java.f.k(z0Var);
        if (k4 == null || (i02 = i0(k4, lVar)) == null) {
            return null;
        }
        if (!D0(i02)) {
            i02 = null;
        }
        if (i02 != null) {
            return h0(i02, k4, collection);
        }
        return null;
    }

    private final z0 F0(z0 z0Var, ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, ? extends Collection<? extends z0>> lVar, kotlin.reflect.jvm.internal.impl.name.f fVar, Collection<? extends z0> collection) {
        z0 z0Var2 = (z0) kotlin.reflect.jvm.internal.impl.load.java.h0.d(z0Var);
        if (z0Var2 == null) {
            return null;
        }
        String b5 = kotlin.reflect.jvm.internal.impl.load.java.h0.b(z0Var2);
        l0.m(b5);
        kotlin.reflect.jvm.internal.impl.name.f f4 = kotlin.reflect.jvm.internal.impl.name.f.f(b5);
        l0.o(f4, ProtectedSandApp.s("熎\u0001"));
        Iterator<? extends z0> it = lVar.invoke(f4).iterator();
        while (it.hasNext()) {
            z0 n02 = n0(it.next(), fVar);
            if (s0(z0Var2, n02)) {
                return h0(n02, z0Var2, collection);
            }
        }
        return null;
    }

    private final z0 G0(z0 z0Var, ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, ? extends Collection<? extends z0>> lVar) {
        if (!z0Var.isSuspend()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.name.f name = z0Var.getName();
        l0.o(name, ProtectedSandApp.s("熌\u0001"));
        Iterator<T> it = lVar.invoke(name).iterator();
        while (it.hasNext()) {
            z0 o02 = o0((z0) it.next());
            if (o02 == null || !q0(o02, z0Var)) {
                o02 = null;
            }
            if (o02 != null) {
                return o02;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.load.java.descriptors.b H0(wd.k kVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = this.f76542n;
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.b u12 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.b.u1(eVar, kotlin.reflect.jvm.internal.impl.load.java.lazy.e.a(x(), kVar), false, x().a().t().a(kVar));
        l0.o(u12, ProtectedSandApp.s("熏\u0001"));
        kotlin.reflect.jvm.internal.impl.load.java.lazy.g e4 = kotlin.reflect.jvm.internal.impl.load.java.lazy.a.e(x(), u12, kVar, eVar.s().size());
        j.b L = L(e4, u12, kVar.i());
        List<f1> s4 = eVar.s();
        l0.o(s4, ProtectedSandApp.s("熐\u0001"));
        List<f1> list = s4;
        List<wd.y> typeParameters = kVar.getTypeParameters();
        ArrayList arrayList = new ArrayList(w.b0(typeParameters, 10));
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            f1 a5 = e4.f().a((wd.y) it.next());
            l0.m(a5);
            arrayList.add(a5);
        }
        u12.s1(L.a(), j0.d(kVar.getVisibility()), w.D4(list, arrayList));
        u12.Z0(false);
        u12.a1(L.b());
        u12.h1(eVar.r());
        e4.a().h().c(kVar, u12);
        return u12;
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.descriptors.e I0(wd.w wVar) {
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.e q12 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.q1(this.f76542n, kotlin.reflect.jvm.internal.impl.load.java.lazy.e.a(x(), wVar), wVar.getName(), x().a().t().a(wVar), true);
        l0.o(q12, ProtectedSandApp.s("熑\u0001"));
        h0 o4 = x().g().o(wVar.getType(), kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(s1.COMMON, false, false, null, 6, null));
        x0 l4 = kotlin.reflect.jvm.internal.impl.resolve.f.l(this.f76542n);
        kotlin.collections.j0 j0Var = kotlin.collections.j0.f74919b;
        q12.p1(null, l4, j0Var, j0Var, j0Var, o4, e0.Companion.a(false, false, true), t.f76290e, null);
        q12.t1(false, false);
        x().a().h().a(wVar, q12);
        return q12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<z0> J0(kotlin.reflect.jvm.internal.impl.name.f fVar) {
        Collection<r> d5 = z().invoke().d(fVar);
        ArrayList arrayList = new ArrayList(w.b0(d5, 10));
        Iterator<T> it = d5.iterator();
        while (it.hasNext()) {
            arrayList.add(J((r) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<z0> K0(kotlin.reflect.jvm.internal.impl.name.f fVar) {
        Set<z0> z02 = z0(fVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : z02) {
            z0 z0Var = (z0) obj;
            if (!kotlin.reflect.jvm.internal.impl.load.java.h0.a(z0Var) && kotlin.reflect.jvm.internal.impl.load.java.f.k(z0Var) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final boolean L0(z0 z0Var) {
        kotlin.reflect.jvm.internal.impl.load.java.f fVar = kotlin.reflect.jvm.internal.impl.load.java.f.f76422o;
        kotlin.reflect.jvm.internal.impl.name.f name = z0Var.getName();
        String s4 = ProtectedSandApp.s("熌\u0001");
        l0.o(name, s4);
        if (!fVar.l(name)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.name.f name2 = z0Var.getName();
        l0.o(name2, s4);
        Set<z0> z02 = z0(name2);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = z02.iterator();
        while (it.hasNext()) {
            z k4 = kotlin.reflect.jvm.internal.impl.load.java.f.k((z0) it.next());
            if (k4 != null) {
                arrayList.add(k4);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (C0(z0Var, (z) it2.next())) {
                return true;
            }
        }
        return false;
    }

    private final void W(List<j1> list, kotlin.reflect.jvm.internal.impl.descriptors.l lVar, int i4, r rVar, h0 h0Var, h0 h0Var2) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b5 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b();
        kotlin.reflect.jvm.internal.impl.name.f name = rVar.getName();
        h0 n4 = t1.n(h0Var);
        l0.o(n4, ProtectedSandApp.s("熒\u0001"));
        list.add(new kotlin.reflect.jvm.internal.impl.descriptors.impl.l0(lVar, null, i4, b5, name, n4, rVar.L(), false, false, h0Var2 != null ? t1.n(h0Var2) : null, x().a().t().a(rVar)));
    }

    private final void X(Collection<z0> collection, kotlin.reflect.jvm.internal.impl.name.f fVar, Collection<? extends z0> collection2, boolean z4) {
        Collection<? extends z0> d5 = kotlin.reflect.jvm.internal.impl.load.java.components.a.d(fVar, collection2, collection, this.f76542n, x().a().c(), x().a().k().a());
        l0.o(d5, ProtectedSandApp.s("熓\u0001"));
        if (!z4) {
            collection.addAll(d5);
            return;
        }
        Collection<? extends z0> collection3 = d5;
        List D4 = w.D4(collection, collection3);
        ArrayList arrayList = new ArrayList(w.b0(collection3, 10));
        for (z0 z0Var : collection3) {
            z0 z0Var2 = (z0) kotlin.reflect.jvm.internal.impl.load.java.h0.e(z0Var);
            if (z0Var2 == null) {
                l0.m(z0Var);
            } else {
                l0.m(z0Var);
                z0Var = h0(z0Var, z0Var2, D4);
            }
            arrayList.add(z0Var);
        }
        collection.addAll(arrayList);
    }

    private final void Y(kotlin.reflect.jvm.internal.impl.name.f fVar, Collection<? extends z0> collection, Collection<? extends z0> collection2, Collection<z0> collection3, ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, ? extends Collection<? extends z0>> lVar) {
        for (z0 z0Var : collection2) {
            kotlin.reflect.jvm.internal.impl.utils.a.a(collection3, F0(z0Var, lVar, fVar, collection));
            kotlin.reflect.jvm.internal.impl.utils.a.a(collection3, E0(z0Var, lVar, collection));
            kotlin.reflect.jvm.internal.impl.utils.a.a(collection3, G0(z0Var, lVar));
        }
    }

    private final void Z(Set<? extends u0> set, Collection<u0> collection, Set<u0> set2, ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, ? extends Collection<? extends z0>> lVar) {
        for (u0 u0Var : set) {
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.f j02 = j0(u0Var, lVar);
            if (j02 != null) {
                collection.add(j02);
                if (set2 != null) {
                    set2.add(u0Var);
                    return;
                }
                return;
            }
        }
    }

    private final void a0(kotlin.reflect.jvm.internal.impl.name.f fVar, Collection<u0> collection) {
        r rVar = (r) w.i5(z().invoke().d(fVar));
        if (rVar == null) {
            return;
        }
        collection.add(l0(this, rVar, null, e0.FINAL, 2, null));
    }

    private final Collection<h0> d0() {
        if (!this.f76544p) {
            return x().a().k().c().g(this.f76542n);
        }
        Collection<h0> j4 = this.f76542n.j().j();
        l0.o(j4, ProtectedSandApp.s("熔\u0001"));
        return j4;
    }

    private final List<j1> e0(kotlin.reflect.jvm.internal.impl.descriptors.impl.f fVar) {
        q0 q0Var;
        Collection<r> e4 = this.f76543o.e();
        ArrayList arrayList = new ArrayList(e4.size());
        kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a b5 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(s1.COMMON, true, false, null, 6, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : e4) {
            if (l0.g(((r) obj).getName(), b0.f76327c)) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        q0 q0Var2 = new q0(arrayList2, arrayList3);
        List list = (List) q0Var2.a();
        List<r> list2 = (List) q0Var2.b();
        list.size();
        r rVar = (r) w.G2(list);
        if (rVar != null) {
            x returnType = rVar.getReturnType();
            if (returnType instanceof wd.f) {
                wd.f fVar2 = (wd.f) returnType;
                q0Var = new q0(x().g().k(fVar2, b5, true), x().g().o(fVar2.s(), b5));
            } else {
                q0Var = new q0(x().g().o(returnType, b5), null);
            }
            W(arrayList, fVar, 0, rVar, (h0) q0Var.a(), (h0) q0Var.b());
        }
        int i4 = 0;
        int i5 = rVar == null ? 0 : 1;
        for (r rVar2 : list2) {
            W(arrayList, fVar, i4 + i5, rVar2, x().g().o(rVar2.getReturnType(), b5), null);
            i4++;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.d f0() {
        boolean t4 = this.f76543o.t();
        if ((this.f76543o.f() || !this.f76543o.w()) && !t4) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = this.f76542n;
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.b u12 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.b.u1(eVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b(), true, x().a().t().a(this.f76543o));
        l0.o(u12, ProtectedSandApp.s("熏\u0001"));
        List<j1> e02 = t4 ? e0(u12) : Collections.emptyList();
        u12.a1(false);
        u12.r1(e02, x0(eVar));
        u12.Z0(true);
        u12.h1(eVar.r());
        x().a().h().c(this.f76543o, u12);
        return u12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.d g0() {
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = this.f76542n;
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.b u12 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.b.u1(eVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b(), true, x().a().t().a(this.f76543o));
        l0.o(u12, ProtectedSandApp.s("熏\u0001"));
        List<j1> m02 = m0(u12);
        u12.a1(false);
        u12.r1(m02, x0(eVar));
        u12.Z0(false);
        u12.h1(eVar.r());
        return u12;
    }

    private final z0 h0(z0 z0Var, kotlin.reflect.jvm.internal.impl.descriptors.a aVar, Collection<? extends z0> collection) {
        Collection<? extends z0> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return z0Var;
        }
        for (z0 z0Var2 : collection2) {
            if (!l0.g(z0Var, z0Var2) && z0Var2.u0() == null && q0(z0Var2, aVar)) {
                z0 a5 = z0Var.A().j().a();
                l0.m(a5);
                return a5;
            }
        }
        return z0Var;
    }

    private final z0 i0(z zVar, ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, ? extends Collection<? extends z0>> lVar) {
        Object obj;
        kotlin.reflect.jvm.internal.impl.name.f name = zVar.getName();
        l0.o(name, ProtectedSandApp.s("熌\u0001"));
        Iterator<T> it = lVar.invoke(name).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C0((z0) obj, zVar)) {
                break;
            }
        }
        z0 z0Var = (z0) obj;
        if (z0Var == null) {
            return null;
        }
        z.a<? extends z0> A = z0Var.A();
        List<j1> i4 = zVar.i();
        String s4 = ProtectedSandApp.s("熕\u0001");
        l0.o(i4, s4);
        List<j1> list = i4;
        ArrayList arrayList = new ArrayList(w.b0(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((j1) it2.next()).getType());
        }
        List<j1> i5 = z0Var.i();
        l0.o(i5, s4);
        A.c(kotlin.reflect.jvm.internal.impl.load.java.descriptors.h.a(arrayList, i5, zVar));
        A.u();
        A.m();
        A.h(kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.I, Boolean.TRUE);
        return A.a();
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.descriptors.f j0(u0 u0Var, ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, ? extends Collection<? extends z0>> lVar) {
        z0 z0Var;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.e0 e0Var;
        if (!p0(u0Var, lVar)) {
            return null;
        }
        z0 v02 = v0(u0Var, lVar);
        l0.m(v02);
        if (u0Var.Q()) {
            z0Var = w0(u0Var, lVar);
            l0.m(z0Var);
        } else {
            z0Var = null;
        }
        if (z0Var != null) {
            z0Var.u();
            v02.u();
        }
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.d dVar = new kotlin.reflect.jvm.internal.impl.load.java.descriptors.d(this.f76542n, v02, z0Var, u0Var);
        h0 returnType = v02.getReturnType();
        l0.m(returnType);
        kotlin.collections.j0 j0Var = kotlin.collections.j0.f74919b;
        dVar.d1(returnType, j0Var, kotlin.reflect.jvm.internal.impl.resolve.f.l(this.f76542n), null, j0Var);
        d0 k4 = kotlin.reflect.jvm.internal.impl.resolve.e.k(dVar, v02.getAnnotations(), false, false, false, v02.f());
        k4.O0(v02);
        k4.R0(dVar.getType());
        l0.o(k4, ProtectedSandApp.s("熖\u0001"));
        if (z0Var != null) {
            List<j1> i4 = z0Var.i();
            l0.o(i4, ProtectedSandApp.s("熕\u0001"));
            j1 j1Var = (j1) w.G2(i4);
            if (j1Var == null) {
                throw new AssertionError(ProtectedSandApp.s("熗\u0001") + z0Var);
            }
            e0Var = kotlin.reflect.jvm.internal.impl.resolve.e.m(dVar, z0Var.getAnnotations(), j1Var.getAnnotations(), false, false, false, z0Var.getVisibility(), z0Var.f());
            e0Var.O0(z0Var);
        } else {
            e0Var = null;
        }
        dVar.X0(k4, e0Var, null, null);
        return dVar;
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.descriptors.f k0(r rVar, h0 h0Var, e0 e0Var) {
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.f h12 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.f.h1(this.f76542n, kotlin.reflect.jvm.internal.impl.load.java.lazy.e.a(x(), rVar), e0Var, j0.d(rVar.getVisibility()), false, rVar.getName(), x().a().t().a(rVar), false);
        l0.o(h12, ProtectedSandApp.s("熘\u0001"));
        d0 d5 = kotlin.reflect.jvm.internal.impl.resolve.e.d(h12, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b());
        l0.o(d5, ProtectedSandApp.s("熙\u0001"));
        h12.W0(d5, null);
        h0 r4 = h0Var == null ? r(rVar, kotlin.reflect.jvm.internal.impl.load.java.lazy.a.f(x(), h12, rVar, 0, 4, null)) : h0Var;
        kotlin.collections.j0 j0Var = kotlin.collections.j0.f74919b;
        h12.d1(r4, j0Var, kotlin.reflect.jvm.internal.impl.resolve.f.l(this.f76542n), null, j0Var);
        d5.R0(r4);
        return h12;
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.descriptors.f l0(g gVar, r rVar, h0 h0Var, e0 e0Var, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            h0Var = null;
        }
        return gVar.k0(rVar, h0Var, e0Var);
    }

    private final List<j1> m0(kotlin.reflect.jvm.internal.impl.descriptors.impl.f fVar) {
        Collection<wd.w> r4 = this.f76543o.r();
        ArrayList arrayList = new ArrayList(r4.size());
        kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a b5 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(s1.COMMON, false, false, null, 6, null);
        Iterator<wd.w> it = r4.iterator();
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (!it.hasNext()) {
                return arrayList;
            }
            i4 = i5 + 1;
            wd.w next = it.next();
            h0 o4 = x().g().o(next.getType(), b5);
            arrayList.add(new kotlin.reflect.jvm.internal.impl.descriptors.impl.l0(fVar, null, i5, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b(), next.getName(), o4, false, false, false, next.a() ? x().a().m().p().k(o4) : null, x().a().t().a(next)));
        }
    }

    private final z0 n0(z0 z0Var, kotlin.reflect.jvm.internal.impl.name.f fVar) {
        z.a<? extends z0> A = z0Var.A();
        A.k(fVar);
        A.u();
        A.m();
        z0 a5 = A.a();
        l0.m(a5);
        return a5;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.reflect.jvm.internal.impl.descriptors.z0 o0(kotlin.reflect.jvm.internal.impl.descriptors.z0 r6) {
        /*
            r5 = this;
            java.util.List r0 = r6.i()
            java.lang.String r1 = "熕\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            kotlin.jvm.internal.l0.o(r0, r1)
            java.lang.Object r0 = kotlin.collections.w.v3(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r0
            r2 = 0
            if (r0 == 0) goto L82
            kotlin.reflect.jvm.internal.impl.types.h0 r3 = r0.getType()
            kotlin.reflect.jvm.internal.impl.types.h1 r3 = r3.O0()
            kotlin.reflect.jvm.internal.impl.descriptors.h r3 = r3.c()
            if (r3 == 0) goto L39
            kotlin.reflect.jvm.internal.impl.name.d r3 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.m(r3)
            if (r3 == 0) goto L39
            boolean r4 = r3.f()
            if (r4 == 0) goto L31
            goto L32
        L31:
            r3 = r2
        L32:
            if (r3 == 0) goto L39
            kotlin.reflect.jvm.internal.impl.name.c r3 = r3.l()
            goto L3a
        L39:
            r3 = r2
        L3a:
            kotlin.reflect.jvm.internal.impl.name.c r4 = kotlin.reflect.jvm.internal.impl.builtins.l.f75831t
            boolean r3 = kotlin.jvm.internal.l0.g(r3, r4)
            if (r3 == 0) goto L43
            goto L44
        L43:
            r0 = r2
        L44:
            if (r0 != 0) goto L47
            goto L82
        L47:
            kotlin.reflect.jvm.internal.impl.descriptors.z$a r2 = r6.A()
            java.util.List r6 = r6.i()
            kotlin.jvm.internal.l0.o(r6, r1)
            r1 = 1
            java.util.List r6 = kotlin.collections.w.d2(r6, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.z$a r6 = r2.c(r6)
            kotlin.reflect.jvm.internal.impl.types.h0 r0 = r0.getType()
            java.util.List r0 = r0.M0()
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            kotlin.reflect.jvm.internal.impl.types.l1 r0 = (kotlin.reflect.jvm.internal.impl.types.l1) r0
            kotlin.reflect.jvm.internal.impl.types.h0 r0 = r0.getType()
            kotlin.reflect.jvm.internal.impl.descriptors.z$a r6 = r6.n(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.z r6 = r6.a()
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r6 = (kotlin.reflect.jvm.internal.impl.descriptors.z0) r6
            r0 = r6
            kotlin.reflect.jvm.internal.impl.descriptors.impl.g0 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.g0) r0
            if (r0 != 0) goto L7e
            goto L81
        L7e:
            r0.i1(r1)
        L81:
            return r6
        L82:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g.o0(kotlin.reflect.jvm.internal.impl.descriptors.z0):kotlin.reflect.jvm.internal.impl.descriptors.z0");
    }

    private final boolean p0(u0 u0Var, ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, ? extends Collection<? extends z0>> lVar) {
        if (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c.a(u0Var)) {
            return false;
        }
        z0 v02 = v0(u0Var, lVar);
        z0 w02 = w0(u0Var, lVar);
        if (v02 == null) {
            return false;
        }
        if (u0Var.Q()) {
            return w02 != null && w02.u() == v02.u();
        }
        return true;
    }

    private final boolean q0(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        l.i.a c5 = kotlin.reflect.jvm.internal.impl.resolve.l.f77929f.F(aVar2, aVar, true).c();
        l0.o(c5, ProtectedSandApp.s("熚\u0001"));
        return c5 == l.i.a.OVERRIDABLE && !kotlin.reflect.jvm.internal.impl.load.java.t.f76696a.a(aVar2, aVar);
    }

    private final boolean r0(z0 z0Var) {
        i0.a aVar = i0.f76436a;
        kotlin.reflect.jvm.internal.impl.name.f name = z0Var.getName();
        l0.o(name, ProtectedSandApp.s("熌\u0001"));
        kotlin.reflect.jvm.internal.impl.name.f b5 = aVar.b(name);
        if (b5 == null) {
            return false;
        }
        Set<z0> z02 = z0(b5);
        ArrayList arrayList = new ArrayList();
        for (Object obj : z02) {
            if (kotlin.reflect.jvm.internal.impl.load.java.h0.a((z0) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        z0 n02 = n0(z0Var, b5);
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (s0((z0) it.next(), n02)) {
                return true;
            }
        }
        return false;
    }

    private final boolean s0(z0 z0Var, z zVar) {
        if (kotlin.reflect.jvm.internal.impl.load.java.e.f76416o.k(z0Var)) {
            zVar = zVar.a();
        }
        l0.m(zVar);
        return q0(zVar, z0Var);
    }

    private final boolean t0(z0 z0Var) {
        z0 o02 = o0(z0Var);
        if (o02 == null) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.name.f name = z0Var.getName();
        l0.o(name, ProtectedSandApp.s("熌\u0001"));
        Set<z0> z02 = z0(name);
        if ((z02 instanceof Collection) && z02.isEmpty()) {
            return false;
        }
        for (z0 z0Var2 : z02) {
            if (z0Var2.isSuspend() && q0(o02, z0Var2)) {
                return true;
            }
        }
        return false;
    }

    private final z0 u0(u0 u0Var, String str, ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, ? extends Collection<? extends z0>> lVar) {
        z0 z0Var;
        kotlin.reflect.jvm.internal.impl.name.f f4 = kotlin.reflect.jvm.internal.impl.name.f.f(str);
        l0.o(f4, ProtectedSandApp.s("熎\u0001"));
        Iterator<T> it = lVar.invoke(f4).iterator();
        do {
            z0Var = null;
            if (!it.hasNext()) {
                break;
            }
            z0 z0Var2 = (z0) it.next();
            if (z0Var2.i().size() == 0) {
                kotlin.reflect.jvm.internal.impl.types.checker.e eVar = kotlin.reflect.jvm.internal.impl.types.checker.e.f78349a;
                h0 returnType = z0Var2.getReturnType();
                if (returnType == null ? false : eVar.d(returnType, u0Var.getType())) {
                    z0Var = z0Var2;
                }
            }
        } while (z0Var == null);
        return z0Var;
    }

    private final z0 v0(u0 u0Var, ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, ? extends Collection<? extends z0>> lVar) {
        v0 getter = u0Var.getGetter();
        v0 v0Var = getter != null ? (v0) kotlin.reflect.jvm.internal.impl.load.java.h0.d(getter) : null;
        String a5 = v0Var != null ? kotlin.reflect.jvm.internal.impl.load.java.i.f76434a.a(v0Var) : null;
        if (a5 != null && !kotlin.reflect.jvm.internal.impl.load.java.h0.f(this.f76542n, v0Var)) {
            return u0(u0Var, a5, lVar);
        }
        String b5 = u0Var.getName().b();
        l0.o(b5, ProtectedSandApp.s("熍\u0001"));
        return u0(u0Var, a0.b(b5), lVar);
    }

    private final z0 w0(u0 u0Var, ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, ? extends Collection<? extends z0>> lVar) {
        z0 z0Var;
        h0 returnType;
        String b5 = u0Var.getName().b();
        l0.o(b5, ProtectedSandApp.s("熍\u0001"));
        kotlin.reflect.jvm.internal.impl.name.f f4 = kotlin.reflect.jvm.internal.impl.name.f.f(a0.e(b5));
        l0.o(f4, ProtectedSandApp.s("熎\u0001"));
        Iterator<T> it = lVar.invoke(f4).iterator();
        do {
            z0Var = null;
            if (!it.hasNext()) {
                break;
            }
            z0 z0Var2 = (z0) it.next();
            if (z0Var2.i().size() == 1 && (returnType = z0Var2.getReturnType()) != null && kotlin.reflect.jvm.internal.impl.builtins.h.C0(returnType)) {
                kotlin.reflect.jvm.internal.impl.types.checker.e eVar = kotlin.reflect.jvm.internal.impl.types.checker.e.f78349a;
                List<j1> i4 = z0Var2.i();
                l0.o(i4, ProtectedSandApp.s("熕\u0001"));
                if (eVar.b(((j1) w.h5(i4)).getType(), u0Var.getType())) {
                    z0Var = z0Var2;
                }
            }
        } while (z0Var == null);
        return z0Var;
    }

    private final u x0(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        u visibility = eVar.getVisibility();
        l0.o(visibility, ProtectedSandApp.s("熛\u0001"));
        if (!l0.g(visibility, s.f76693b)) {
            return visibility;
        }
        u uVar = s.f76694c;
        l0.o(uVar, ProtectedSandApp.s("熜\u0001"));
        return uVar;
    }

    private final Set<z0> z0(kotlin.reflect.jvm.internal.impl.name.f fVar) {
        Collection<h0> d02 = d0();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = d02.iterator();
        while (it.hasNext()) {
            w.q0(linkedHashSet, ((h0) it.next()).q().a(fVar, ud.d.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    @fg.m
    protected x0 A() {
        return kotlin.reflect.jvm.internal.impl.resolve.f.l(this.f76542n);
    }

    @fg.l
    protected kotlin.reflect.jvm.internal.impl.descriptors.e A0() {
        return this.f76542n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    public kotlin.reflect.jvm.internal.impl.descriptors.m D() {
        return this.f76542n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    protected boolean H(@fg.l kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVar) {
        l0.p(eVar, ProtectedSandApp.s("熝\u0001"));
        if (this.f76543o.t()) {
            return false;
        }
        return D0(eVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    @fg.l
    protected j.a I(@fg.l r rVar, @fg.l List<? extends f1> list, @fg.l h0 h0Var, @fg.l List<? extends j1> list2) {
        l0.p(rVar, ProtectedSandApp.s("熞\u0001"));
        l0.p(list, ProtectedSandApp.s("熟\u0001"));
        l0.p(h0Var, ProtectedSandApp.s("熠\u0001"));
        l0.p(list2, ProtectedSandApp.s("熡\u0001"));
        j.b b5 = x().a().s().b(rVar, this.f76542n, h0Var, null, list2, list);
        l0.o(b5, ProtectedSandApp.s("熢\u0001"));
        h0 d5 = b5.d();
        l0.o(d5, ProtectedSandApp.s("熣\u0001"));
        h0 c5 = b5.c();
        List<j1> f4 = b5.f();
        l0.o(f4, ProtectedSandApp.s("熕\u0001"));
        List<f1> e4 = b5.e();
        l0.o(e4, ProtectedSandApp.s("熤\u0001"));
        boolean g4 = b5.g();
        List<String> b6 = b5.b();
        l0.o(b6, ProtectedSandApp.s("熥\u0001"));
        return new j.a(d5, c5, f4, e4, g4, b6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j, kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.l
    public Collection<z0> a(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("熦\u0001"));
        l0.p(bVar, ProtectedSandApp.s("熧\u0001"));
        e(fVar, bVar);
        return super.a(fVar, bVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j, kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.l
    public Collection<u0> b(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("熦\u0001"));
        l0.p(bVar, ProtectedSandApp.s("熧\u0001"));
        e(fVar, bVar);
        return super.b(fVar, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    @fg.l
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.f> o(@fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @fg.m ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("熨\u0001"));
        Collection<h0> j4 = this.f76542n.j().j();
        l0.o(j4, ProtectedSandApp.s("熔\u0001"));
        LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.f> linkedHashSet = new LinkedHashSet<>();
        Iterator<T> it = j4.iterator();
        while (it.hasNext()) {
            w.q0(linkedHashSet, ((h0) it.next()).q().c());
        }
        linkedHashSet.addAll(z().invoke().a());
        linkedHashSet.addAll(z().invoke().b());
        linkedHashSet.addAll(m(dVar, lVar));
        linkedHashSet.addAll(x().a().w().e(x(), this.f76542n));
        return linkedHashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    @fg.l
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a q() {
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a(this.f76543o, a.f76550b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    public void e(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("熦\u0001"));
        l0.p(bVar, ProtectedSandApp.s("熧\u0001"));
        td.a.a(x().a().l(), bVar, this.f76542n, fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.m
    public kotlin.reflect.jvm.internal.impl.descriptors.h f(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.descriptors.e> hVar;
        kotlin.reflect.jvm.internal.impl.descriptors.e invoke;
        l0.p(fVar, ProtectedSandApp.s("熦\u0001"));
        l0.p(bVar, ProtectedSandApp.s("熧\u0001"));
        e(fVar, bVar);
        g gVar = (g) C();
        return (gVar == null || (hVar = gVar.f76549u) == null || (invoke = hVar.invoke(fVar)) == null) ? this.f76549u.invoke(fVar) : invoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    @fg.l
    protected Set<kotlin.reflect.jvm.internal.impl.name.f> m(@fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @fg.m ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("熨\u0001"));
        return kotlin.collections.l1.C(this.f76546r.invoke(), this.f76548t.invoke().keySet());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    protected void p(@fg.l Collection<z0> collection, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(collection, ProtectedSandApp.s("熩\u0001"));
        l0.p(fVar, ProtectedSandApp.s("熦\u0001"));
        if (this.f76543o.v() && z().invoke().e(fVar) != null) {
            Collection<z0> collection2 = collection;
            if (!collection2.isEmpty()) {
                Iterator<T> it = collection2.iterator();
                while (it.hasNext()) {
                    if (((z0) it.next()).i().isEmpty()) {
                        break;
                    }
                }
            }
            wd.w e4 = z().invoke().e(fVar);
            l0.m(e4);
            collection.add(I0(e4));
        }
        x().a().w().b(x(), this.f76542n, fVar, collection);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    protected void s(@fg.l Collection<z0> collection, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(collection, ProtectedSandApp.s("熩\u0001"));
        l0.p(fVar, ProtectedSandApp.s("熦\u0001"));
        Set<z0> z02 = z0(fVar);
        if (!i0.f76436a.k(fVar) && !kotlin.reflect.jvm.internal.impl.load.java.f.f76422o.l(fVar)) {
            Set<z0> set = z02;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (((z) it.next()).isSuspend()) {
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                if (D0((z0) obj)) {
                    arrayList.add(obj);
                }
            }
            X(collection, fVar, arrayList, false);
            return;
        }
        kotlin.reflect.jvm.internal.impl.utils.g a5 = kotlin.reflect.jvm.internal.impl.utils.g.f78687d.a();
        Collection<? extends z0> d5 = kotlin.reflect.jvm.internal.impl.load.java.components.a.d(fVar, z02, kotlin.collections.j0.f74919b, this.f76542n, kotlin.reflect.jvm.internal.impl.serialization.deserialization.r.f78264a, x().a().k().a());
        l0.o(d5, ProtectedSandApp.s("熓\u0001"));
        Y(fVar, collection, d5, collection, new b(1, this));
        Y(fVar, collection, d5, a5, new c(1, this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : z02) {
            if (D0((z0) obj2)) {
                arrayList2.add(obj2);
            }
        }
        X(collection, fVar, w.D4(arrayList2, a5), true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    protected void t(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l Collection<u0> collection) {
        l0.p(fVar, ProtectedSandApp.s("熦\u0001"));
        l0.p(collection, ProtectedSandApp.s("熩\u0001"));
        if (this.f76543o.t()) {
            a0(fVar, collection);
        }
        Set<u0> B0 = B0(fVar);
        if (B0.isEmpty()) {
            return;
        }
        g.b bVar = kotlin.reflect.jvm.internal.impl.utils.g.f78687d;
        kotlin.reflect.jvm.internal.impl.utils.g a5 = bVar.a();
        kotlin.reflect.jvm.internal.impl.utils.g a6 = bVar.a();
        Z(B0, collection, a5, new d());
        Z(kotlin.collections.l1.x(B0, a5), a6, null, new e());
        Collection<? extends u0> d5 = kotlin.reflect.jvm.internal.impl.load.java.components.a.d(fVar, kotlin.collections.l1.C(B0, a6), collection, this.f76542n, x().a().c(), x().a().k().a());
        l0.o(d5, ProtectedSandApp.s("熓\u0001"));
        collection.addAll(d5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    @fg.l
    public String toString() {
        return ProtectedSandApp.s("熪\u0001") + this.f76543o.g();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    @fg.l
    protected Set<kotlin.reflect.jvm.internal.impl.name.f> u(@fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @fg.m ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("熨\u0001"));
        if (this.f76543o.t()) {
            return c();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(z().invoke().c());
        Collection<h0> j4 = this.f76542n.j().j();
        l0.o(j4, ProtectedSandApp.s("熔\u0001"));
        Iterator<T> it = j4.iterator();
        while (it.hasNext()) {
            w.q0(linkedHashSet, ((h0) it.next()).q().d());
        }
        return linkedHashSet;
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.storage.i<List<kotlin.reflect.jvm.internal.impl.descriptors.d>> y0() {
        return this.f76545q;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@fg.l kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @fg.l wd.g gVar2, boolean z4, @fg.m g gVar3) {
        super(gVar, gVar3);
        l0.p(gVar, ProtectedSandApp.s("熈\u0001"));
        l0.p(eVar, ProtectedSandApp.s("熉\u0001"));
        l0.p(gVar2, ProtectedSandApp.s("熊\u0001"));
        this.f76542n = eVar;
        this.f76543o = gVar2;
        this.f76544p = z4;
        this.f76545q = gVar.e().h(new f(gVar));
        this.f76546r = gVar.e().h(new j());
        this.f76547s = gVar.e().h(new h(gVar, this));
        this.f76548t = gVar.e().h(new C1091g());
        this.f76549u = gVar.e().b(new k(gVar));
    }
}
