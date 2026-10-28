package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import b4.q;
import b4.r;
import b4.x;
import b4.y;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.a0;
import kotlin.collections.b0;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.e1;
import kotlin.collections.f0;
import kotlin.collections.j0;
import kotlin.collections.r1;
import kotlin.collections.z;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.reflect.KDeclarationContainer;
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
import kotlin.reflect.jvm.internal.impl.load.java.components.j;
import kotlin.reflect.jvm.internal.impl.load.java.i0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j;
import kotlin.reflect.jvm.internal.impl.load.java.p;
import kotlin.reflect.jvm.internal.impl.load.java.s;
import kotlin.reflect.jvm.internal.impl.load.kotlin.w;
import kotlin.reflect.jvm.internal.impl.resolve.k;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.s1;
import kotlin.reflect.jvm.internal.impl.types.t1;
import kotlin.reflect.jvm.internal.impl.utils.f;

/* compiled from: LazyJavaClassMemberScope.kt */
/* loaded from: classes6.dex */
public final class g extends kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j {

    /* renamed from: n, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.e f24670n;

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final b4.g f24671o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f24672p;

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i<List<kotlin.reflect.jvm.internal.impl.descriptors.d>> f24673q;

    /* renamed from: r, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i<Set<kotlin.reflect.jvm.internal.impl.name.f>> f24674r;

    /* renamed from: s, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i<Set<kotlin.reflect.jvm.internal.impl.name.f>> f24675s;

    /* renamed from: t, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i<Map<kotlin.reflect.jvm.internal.impl.name.f, b4.n>> f24676t;

    /* renamed from: u, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.descriptors.e> f24677u;

    /* compiled from: LazyJavaClassMemberScope.kt */
    static final class a extends Lambda implements q3.l<q, Boolean> {

        /* renamed from: p, reason: collision with root package name */
        public static final a f24678p = new a();

        a() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean N(@d5.d q qVar) {
            l0.p(qVar, ProtectedSandApp.s("蒛"));
            return Boolean.valueOf(!qVar.T());
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* synthetic */ class b extends g0 implements q3.l<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends z0>> {
        b(Object obj) {
            super(1, obj);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: A0, reason: merged with bridge method [inline-methods] */
        public final Collection<z0> N(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("蒜"));
            return ((g) this.f23596p).J0(fVar);
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.KCallable
        @d5.d
        public final String getName() {
            return ProtectedSandApp.s("蒝");
        }

        @Override // kotlin.jvm.internal.q
        @d5.d
        public final KDeclarationContainer w0() {
            return l1.d(g.class);
        }

        @Override // kotlin.jvm.internal.q
        @d5.d
        public final String y0() {
            return ProtectedSandApp.s("蒞");
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* synthetic */ class c extends g0 implements q3.l<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends z0>> {
        c(Object obj) {
            super(1, obj);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: A0, reason: merged with bridge method [inline-methods] */
        public final Collection<z0> N(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("蒟"));
            return ((g) this.f23596p).K0(fVar);
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.KCallable
        @d5.d
        public final String getName() {
            return ProtectedSandApp.s("蒠");
        }

        @Override // kotlin.jvm.internal.q
        @d5.d
        public final KDeclarationContainer w0() {
            return l1.d(g.class);
        }

        @Override // kotlin.jvm.internal.q
        @d5.d
        public final String y0() {
            return ProtectedSandApp.s("蒡");
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    static final class d extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends z0>> {
        d() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<z0> N(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("蒢"));
            return g.this.J0(fVar);
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    static final class e extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends z0>> {
        e() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<z0> N(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("蒣"));
            return g.this.K0(fVar);
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    static final class f extends Lambda implements q3.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.d>> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.g f24682q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar) {
            super(0);
            this.f24682q = gVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<kotlin.reflect.jvm.internal.impl.descriptors.d> n() {
            List<kotlin.reflect.jvm.internal.impl.descriptors.d> V5;
            ?? P;
            Collection<b4.k> l5 = g.this.f24671o.l();
            ArrayList arrayList = new ArrayList(l5.size());
            Iterator<b4.k> it = l5.iterator();
            while (it.hasNext()) {
                arrayList.add(g.this.H0(it.next()));
            }
            if (g.this.f24671o.y()) {
                kotlin.reflect.jvm.internal.impl.descriptors.d g02 = g.this.g0();
                boolean z5 = false;
                String c6 = w.c(g02, false, false, 2, null);
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (l0.g(w.c((kotlin.reflect.jvm.internal.impl.descriptors.d) it2.next(), false, false, 2, null), c6)) {
                            break;
                        }
                    }
                }
                z5 = true;
                if (z5) {
                    arrayList.add(g02);
                    this.f24682q.a().h().b(g.this.f24671o, g02);
                }
            }
            kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar = this.f24682q;
            gVar.a().w().c(gVar, g.this.A0(), arrayList);
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.l r5 = this.f24682q.a().r();
            kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar2 = this.f24682q;
            g gVar3 = g.this;
            boolean isEmpty = arrayList.isEmpty();
            ArrayList arrayList2 = arrayList;
            if (isEmpty) {
                P = a0.P(gVar3.f0());
                arrayList2 = P;
            }
            V5 = j0.V5(r5.g(gVar2, arrayList2));
            return V5;
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g$g, reason: collision with other inner class name */
    static final class C0287g extends Lambda implements q3.a<Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends b4.n>> {
        C0287g() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<kotlin.reflect.jvm.internal.impl.name.f, b4.n> n() {
            int b02;
            int j5;
            Collection<b4.n> v5 = g.this.f24671o.v();
            ArrayList arrayList = new ArrayList();
            for (Object obj : v5) {
                if (((b4.n) obj).J()) {
                    arrayList.add(obj);
                }
            }
            b02 = b0.b0(arrayList, 10);
            j5 = e1.j(b02);
            if (j5 < 16) {
                j5 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(j5);
            for (Object obj2 : arrayList) {
                linkedHashMap.put(((b4.n) obj2).getName(), obj2);
            }
            return linkedHashMap;
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    static final class h extends Lambda implements q3.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.g f24684p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ g f24685q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, g gVar2) {
            super(0);
            this.f24684p = gVar;
            this.f24685q = gVar2;
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set<kotlin.reflect.jvm.internal.impl.name.f> n() {
            Set<kotlin.reflect.jvm.internal.impl.name.f> a6;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar = this.f24684p;
            a6 = j0.a6(gVar.a().w().f(gVar, this.f24685q.A0()));
            return a6;
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    static final class i extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends z0>> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ z0 f24686p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ g f24687q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(z0 z0Var, g gVar) {
            super(1);
            this.f24686p = z0Var;
            this.f24687q = gVar;
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<z0> N(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
            List D4;
            List k5;
            l0.p(fVar, ProtectedSandApp.s("蒤"));
            if (l0.g(this.f24686p.getName(), fVar)) {
                k5 = z.k(this.f24686p);
                return k5;
            }
            D4 = j0.D4(this.f24687q.J0(fVar), this.f24687q.K0(fVar));
            return D4;
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    static final class j extends Lambda implements q3.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>> {
        j() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set<kotlin.reflect.jvm.internal.impl.name.f> n() {
            Set<kotlin.reflect.jvm.internal.impl.name.f> a6;
            a6 = j0.a6(g.this.f24671o.N());
            return a6;
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    static final class k extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.descriptors.e> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.g f24690q;

        /* compiled from: LazyJavaClassMemberScope.kt */
        static final class a extends Lambda implements q3.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ g f24691p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g gVar) {
                super(0);
                this.f24691p = gVar;
            }

            @Override // q3.a
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Set<kotlin.reflect.jvm.internal.impl.name.f> n() {
                Set<kotlin.reflect.jvm.internal.impl.name.f> C;
                C = r1.C(this.f24691p.b(), this.f24691p.c());
                return C;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar) {
            super(1);
            this.f24690q = gVar;
        }

        @Override // q3.l
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.descriptors.e N(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
            List a6;
            Object h5;
            l0.p(fVar, ProtectedSandApp.s("蒥"));
            if (((Set) g.this.f24674r.n()).contains(fVar)) {
                p d6 = this.f24690q.a().d();
                kotlin.reflect.jvm.internal.impl.name.b k5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.k(g.this.A0());
                l0.m(k5);
                kotlin.reflect.jvm.internal.impl.name.b d7 = k5.d(fVar);
                l0.o(d7, ProtectedSandApp.s("蒦"));
                b4.g a7 = d6.a(new p.a(d7, null, g.this.f24671o, 2, null));
                if (a7 == null) {
                    return null;
                }
                kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar = this.f24690q;
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f fVar2 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f(gVar, g.this.A0(), a7, null, 8, null);
                gVar.a().e().a(fVar2);
                return fVar2;
            }
            if (!((Set) g.this.f24675s.n()).contains(fVar)) {
                b4.n nVar = (b4.n) ((Map) g.this.f24676t.n()).get(fVar);
                if (nVar == null) {
                    return null;
                }
                return kotlin.reflect.jvm.internal.impl.descriptors.impl.n.S0(this.f24690q.e(), g.this.A0(), fVar, this.f24690q.e().d(new a(g.this)), kotlin.reflect.jvm.internal.impl.load.java.lazy.e.a(this.f24690q, nVar), this.f24690q.a().t().a(nVar));
            }
            kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar2 = this.f24690q;
            g gVar3 = g.this;
            ListBuilder listBuilder = new ListBuilder();
            gVar2.a().w().b(gVar2, gVar3.A0(), fVar, listBuilder);
            a6 = z.a(listBuilder);
            int size = a6.size();
            if (size == 0) {
                return null;
            }
            if (size == 1) {
                h5 = j0.h5(a6);
                return (kotlin.reflect.jvm.internal.impl.descriptors.e) h5;
            }
            throw new IllegalStateException((ProtectedSandApp.s("蒧") + a6).toString());
        }
    }

    public /* synthetic */ g(kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, b4.g gVar2, boolean z5, g gVar3, int i5, kotlin.jvm.internal.w wVar) {
        this(gVar, eVar, gVar2, z5, (i5 & 16) != 0 ? null : gVar3);
    }

    private final Set<u0> B0(kotlin.reflect.jvm.internal.impl.name.f fVar) {
        Set<u0> a6;
        int b02;
        Collection<h0> d02 = d0();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = d02.iterator();
        while (it.hasNext()) {
            Collection<? extends u0> d6 = ((h0) it.next()).C().d(fVar, z3.d.WHEN_GET_SUPER_MEMBERS);
            b02 = b0.b0(d6, 10);
            ArrayList arrayList2 = new ArrayList(b02);
            Iterator<T> it2 = d6.iterator();
            while (it2.hasNext()) {
                arrayList2.add((u0) it2.next());
            }
            f0.q0(arrayList, arrayList2);
        }
        a6 = j0.a6(arrayList);
        return a6;
    }

    private final boolean C0(z0 z0Var, kotlin.reflect.jvm.internal.impl.descriptors.z zVar) {
        String c6 = w.c(z0Var, false, false, 2, null);
        kotlin.reflect.jvm.internal.impl.descriptors.z a6 = zVar.a();
        l0.o(a6, ProtectedSandApp.s("蓍"));
        return l0.g(c6, w.c(a6, false, false, 2, null)) && !q0(z0Var, zVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if (kotlin.reflect.jvm.internal.impl.load.java.a0.d(r4) == false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[LOOP:1: B:32:0x0043->B:46:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean D0(kotlin.reflect.jvm.internal.impl.descriptors.z0 r7) {
        /*
            r6 = this;
            kotlin.reflect.jvm.internal.impl.name.f r0 = r7.getName()
            java.lang.String r1 = "蓎"
            java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
            kotlin.jvm.internal.l0.o(r0, r1)
            java.util.List r0 = kotlin.reflect.jvm.internal.impl.load.java.f0.a(r0)
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1f
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L1f
        L1d:
            r0 = r3
            goto L80
        L1f:
            java.util.Iterator r0 = r0.iterator()
        L23:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.name.f r1 = (kotlin.reflect.jvm.internal.impl.name.f) r1
            java.util.Set r1 = r6.B0(r1)
            boolean r4 = r1 instanceof java.util.Collection
            if (r4 == 0) goto L3f
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L3f
        L3d:
            r1 = r3
            goto L7d
        L3f:
            java.util.Iterator r1 = r1.iterator()
        L43:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L3d
            java.lang.Object r4 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.u0 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.u0) r4
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g$i r5 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g$i
            r5.<init>(r7, r6)
            boolean r5 = r6.p0(r4, r5)
            if (r5 == 0) goto L79
            boolean r4 = r4.q0()
            if (r4 != 0) goto L77
            kotlin.reflect.jvm.internal.impl.name.f r4 = r7.getName()
            java.lang.String r4 = r4.h()
            java.lang.String r5 = "蓏"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            kotlin.jvm.internal.l0.o(r4, r5)
            boolean r4 = kotlin.reflect.jvm.internal.impl.load.java.a0.d(r4)
            if (r4 != 0) goto L79
        L77:
            r4 = r2
            goto L7a
        L79:
            r4 = r3
        L7a:
            if (r4 == 0) goto L43
            r1 = r2
        L7d:
            if (r1 == 0) goto L23
            r0 = r2
        L80:
            if (r0 == 0) goto L83
            return r3
        L83:
            boolean r0 = r6.r0(r7)
            if (r0 != 0) goto L96
            boolean r0 = r6.L0(r7)
            if (r0 != 0) goto L96
            boolean r7 = r6.t0(r7)
            if (r7 != 0) goto L96
            goto L97
        L96:
            r2 = r3
        L97:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g.D0(kotlin.reflect.jvm.internal.impl.descriptors.z0):boolean");
    }

    private final z0 E0(z0 z0Var, q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, ? extends Collection<? extends z0>> lVar, Collection<? extends z0> collection) {
        z0 i02;
        kotlin.reflect.jvm.internal.impl.descriptors.z k5 = kotlin.reflect.jvm.internal.impl.load.java.f.k(z0Var);
        if (k5 == null || (i02 = i0(k5, lVar)) == null) {
            return null;
        }
        if (!D0(i02)) {
            i02 = null;
        }
        if (i02 != null) {
            return h0(i02, k5, collection);
        }
        return null;
    }

    private final z0 F0(z0 z0Var, q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, ? extends Collection<? extends z0>> lVar, kotlin.reflect.jvm.internal.impl.name.f fVar, Collection<? extends z0> collection) {
        z0 z0Var2 = (z0) kotlin.reflect.jvm.internal.impl.load.java.h0.d(z0Var);
        if (z0Var2 == null) {
            return null;
        }
        String b6 = kotlin.reflect.jvm.internal.impl.load.java.h0.b(z0Var2);
        l0.m(b6);
        kotlin.reflect.jvm.internal.impl.name.f p5 = kotlin.reflect.jvm.internal.impl.name.f.p(b6);
        l0.o(p5, ProtectedSandApp.s("蓐"));
        Iterator<? extends z0> it = lVar.N(p5).iterator();
        while (it.hasNext()) {
            z0 n02 = n0(it.next(), fVar);
            if (s0(z0Var2, n02)) {
                return h0(n02, z0Var2, collection);
            }
        }
        return null;
    }

    private final z0 G0(z0 z0Var, q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, ? extends Collection<? extends z0>> lVar) {
        if (!z0Var.o()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.name.f name = z0Var.getName();
        l0.o(name, ProtectedSandApp.s("蓑"));
        Iterator<T> it = lVar.N(name).iterator();
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
    public final kotlin.reflect.jvm.internal.impl.load.java.descriptors.b H0(b4.k kVar) {
        int b02;
        List<f1> D4;
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = this.f24670n;
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.b A1 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.b.A1(eVar, kotlin.reflect.jvm.internal.impl.load.java.lazy.e.a(x(), kVar), false, x().a().t().a(kVar));
        l0.o(A1, ProtectedSandApp.s("蓒"));
        kotlin.reflect.jvm.internal.impl.load.java.lazy.g e6 = kotlin.reflect.jvm.internal.impl.load.java.lazy.a.e(x(), A1, kVar, eVar.G().size());
        j.b L = L(e6, A1, kVar.n());
        List<f1> G = eVar.G();
        l0.o(G, ProtectedSandApp.s("蓓"));
        List<y> typeParameters = kVar.getTypeParameters();
        b02 = b0.b0(typeParameters, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            f1 a6 = e6.f().a((y) it.next());
            l0.m(a6);
            arrayList.add(a6);
        }
        D4 = j0.D4(G, arrayList);
        A1.y1(L.a(), kotlin.reflect.jvm.internal.impl.load.java.j0.d(kVar.c()), D4);
        A1.f1(false);
        A1.g1(L.b());
        A1.n1(eVar.E());
        e6.a().h().b(kVar, A1);
        return A1;
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.descriptors.e I0(b4.w wVar) {
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.e w12 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.w1(this.f24670n, kotlin.reflect.jvm.internal.impl.load.java.lazy.e.a(x(), wVar), wVar.getName(), x().a().t().a(wVar), true);
        l0.o(w12, ProtectedSandApp.s("蓔"));
        h0 o5 = x().g().o(wVar.getType(), kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(s1.COMMON, false, false, null, 6, null));
        x0 A = A();
        EmptyList emptyList = EmptyList.f23167o;
        w12.v1(null, A, emptyList, emptyList, emptyList, o5, e0.Companion.a(false, false, true), t.f24440e, null);
        w12.z1(false, false);
        x().a().h().e(wVar, w12);
        return w12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<z0> J0(kotlin.reflect.jvm.internal.impl.name.f fVar) {
        int b02;
        Collection<r> f6 = z().n().f(fVar);
        b02 = b0.b0(f6, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator<T> it = f6.iterator();
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
            if (!(kotlin.reflect.jvm.internal.impl.load.java.h0.a(z0Var) || kotlin.reflect.jvm.internal.impl.load.java.f.k(z0Var) != null)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final boolean L0(z0 z0Var) {
        kotlin.reflect.jvm.internal.impl.load.java.f fVar = kotlin.reflect.jvm.internal.impl.load.java.f.f24568n;
        kotlin.reflect.jvm.internal.impl.name.f name = z0Var.getName();
        String s5 = ProtectedSandApp.s("蓕");
        l0.o(name, s5);
        if (!fVar.l(name)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.name.f name2 = z0Var.getName();
        l0.o(name2, s5);
        Set<z0> z02 = z0(name2);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = z02.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.z k5 = kotlin.reflect.jvm.internal.impl.load.java.f.k((z0) it.next());
            if (k5 != null) {
                arrayList.add(k5);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (C0(z0Var, (kotlin.reflect.jvm.internal.impl.descriptors.z) it2.next())) {
                return true;
            }
        }
        return false;
    }

    private final void W(List<j1> list, kotlin.reflect.jvm.internal.impl.descriptors.l lVar, int i5, r rVar, h0 h0Var, h0 h0Var2) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b6 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b();
        kotlin.reflect.jvm.internal.impl.name.f name = rVar.getName();
        h0 n5 = t1.n(h0Var);
        l0.o(n5, ProtectedSandApp.s("蓖"));
        list.add(new kotlin.reflect.jvm.internal.impl.descriptors.impl.l0(lVar, null, i5, b6, name, n5, rVar.O(), false, false, h0Var2 != null ? t1.n(h0Var2) : null, x().a().t().a(rVar)));
    }

    private final void X(Collection<z0> collection, kotlin.reflect.jvm.internal.impl.name.f fVar, Collection<? extends z0> collection2, boolean z5) {
        List D4;
        int b02;
        Collection<? extends z0> d6 = kotlin.reflect.jvm.internal.impl.load.java.components.a.d(fVar, collection2, collection, this.f24670n, x().a().c(), x().a().k().a());
        l0.o(d6, ProtectedSandApp.s("蓗"));
        if (!z5) {
            collection.addAll(d6);
            return;
        }
        D4 = j0.D4(collection, d6);
        b02 = b0.b0(d6, 10);
        ArrayList arrayList = new ArrayList(b02);
        for (z0 z0Var : d6) {
            z0 z0Var2 = (z0) kotlin.reflect.jvm.internal.impl.load.java.h0.e(z0Var);
            String s5 = ProtectedSandApp.s("蓘");
            if (z0Var2 == null) {
                l0.o(z0Var, s5);
            } else {
                l0.o(z0Var, s5);
                z0Var = h0(z0Var, z0Var2, D4);
            }
            arrayList.add(z0Var);
        }
        collection.addAll(arrayList);
    }

    private final void Y(kotlin.reflect.jvm.internal.impl.name.f fVar, Collection<? extends z0> collection, Collection<? extends z0> collection2, Collection<z0> collection3, q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, ? extends Collection<? extends z0>> lVar) {
        for (z0 z0Var : collection2) {
            kotlin.reflect.jvm.internal.impl.utils.a.a(collection3, F0(z0Var, lVar, fVar, collection));
            kotlin.reflect.jvm.internal.impl.utils.a.a(collection3, E0(z0Var, lVar, collection));
            kotlin.reflect.jvm.internal.impl.utils.a.a(collection3, G0(z0Var, lVar));
        }
    }

    private final void Z(Set<? extends u0> set, Collection<u0> collection, Set<u0> set2, q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, ? extends Collection<? extends z0>> lVar) {
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
        Object i5;
        i5 = j0.i5(z().n().f(fVar));
        r rVar = (r) i5;
        if (rVar == null) {
            return;
        }
        collection.add(l0(this, rVar, null, e0.FINAL, 2, null));
    }

    private final Collection<h0> d0() {
        if (!this.f24672p) {
            return x().a().k().c().g(this.f24670n);
        }
        Collection<h0> m5 = this.f24670n.m().m();
        l0.o(m5, ProtectedSandApp.s("蓙"));
        return m5;
    }

    private final List<j1> e0(kotlin.reflect.jvm.internal.impl.descriptors.impl.f fVar) {
        Object G2;
        Pair pair;
        Collection<r> P = this.f24671o.P();
        ArrayList arrayList = new ArrayList(P.size());
        kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a b6 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(s1.COMMON, true, false, null, 6, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : P) {
            if (l0.g(((r) obj).getName(), kotlin.reflect.jvm.internal.impl.load.java.b0.f24477c)) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        Pair pair2 = new Pair(arrayList2, arrayList3);
        List list = (List) pair2.a();
        List<r> list2 = (List) pair2.b();
        list.size();
        G2 = j0.G2(list);
        r rVar = (r) G2;
        if (rVar != null) {
            x i5 = rVar.i();
            if (i5 instanceof b4.f) {
                b4.f fVar2 = (b4.f) i5;
                pair = new Pair(x().g().k(fVar2, b6, true), x().g().o(fVar2.p(), b6));
            } else {
                pair = new Pair(x().g().o(i5, b6), null);
            }
            W(arrayList, fVar, 0, rVar, (h0) pair.a(), (h0) pair.b());
        }
        int i6 = 0;
        int i7 = rVar == null ? 0 : 1;
        for (r rVar2 : list2) {
            W(arrayList, fVar, i6 + i7, rVar2, x().g().o(rVar2.i(), b6), null);
            i6++;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.d f0() {
        boolean x5 = this.f24671o.x();
        if ((this.f24671o.K() || !this.f24671o.z()) && !x5) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = this.f24670n;
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.b A1 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.b.A1(eVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b(), true, x().a().t().a(this.f24671o));
        l0.o(A1, ProtectedSandApp.s("蓚"));
        List<j1> e02 = x5 ? e0(A1) : Collections.emptyList();
        A1.g1(false);
        A1.x1(e02, x0(eVar));
        A1.f1(true);
        A1.n1(eVar.E());
        x().a().h().b(this.f24671o, A1);
        return A1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.d g0() {
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = this.f24670n;
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.b A1 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.b.A1(eVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b(), true, x().a().t().a(this.f24671o));
        l0.o(A1, ProtectedSandApp.s("蓛"));
        List<j1> m02 = m0(A1);
        A1.g1(false);
        A1.x1(m02, x0(eVar));
        A1.f1(false);
        A1.n1(eVar.E());
        return A1;
    }

    private final z0 h0(z0 z0Var, kotlin.reflect.jvm.internal.impl.descriptors.a aVar, Collection<? extends z0> collection) {
        boolean z5 = true;
        if (!(collection instanceof Collection) || !collection.isEmpty()) {
            Iterator<T> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                z0 z0Var2 = (z0) it.next();
                if (!l0.g(z0Var, z0Var2) && z0Var2.k0() == null && q0(z0Var2, aVar)) {
                    z5 = false;
                    break;
                }
            }
        }
        if (z5) {
            return z0Var;
        }
        z0 build = z0Var.F().p().build();
        l0.m(build);
        return build;
    }

    private final z0 i0(kotlin.reflect.jvm.internal.impl.descriptors.z zVar, q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, ? extends Collection<? extends z0>> lVar) {
        Object obj;
        int b02;
        kotlin.reflect.jvm.internal.impl.name.f name = zVar.getName();
        l0.o(name, ProtectedSandApp.s("蓜"));
        Iterator<T> it = lVar.N(name).iterator();
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
        z.a<? extends z0> F = z0Var.F();
        List<j1> n5 = zVar.n();
        l0.o(n5, ProtectedSandApp.s("蓝"));
        b02 = b0.b0(n5, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator<T> it2 = n5.iterator();
        while (it2.hasNext()) {
            arrayList.add(((j1) it2.next()).getType());
        }
        List<j1> n6 = z0Var.n();
        l0.o(n6, ProtectedSandApp.s("蓞"));
        F.b(kotlin.reflect.jvm.internal.impl.load.java.descriptors.h.a(arrayList, n6, zVar));
        F.t();
        F.e();
        F.m(kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.V, Boolean.TRUE);
        return F.build();
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.descriptors.f j0(u0 u0Var, q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, ? extends Collection<? extends z0>> lVar) {
        z0 z0Var;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.e0 e0Var;
        Object G2;
        if (!p0(u0Var, lVar)) {
            return null;
        }
        z0 v02 = v0(u0Var, lVar);
        l0.m(v02);
        if (u0Var.q0()) {
            z0Var = w0(u0Var, lVar);
            l0.m(z0Var);
        } else {
            z0Var = null;
        }
        if (z0Var != null) {
            z0Var.r();
            v02.r();
        }
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.d dVar = new kotlin.reflect.jvm.internal.impl.load.java.descriptors.d(this.f24670n, v02, z0Var, u0Var);
        h0 i5 = v02.i();
        l0.m(i5);
        EmptyList emptyList = EmptyList.f23167o;
        dVar.j1(i5, emptyList, A(), null, emptyList);
        d0 k5 = kotlin.reflect.jvm.internal.impl.resolve.d.k(dVar, v02.getAnnotations(), false, false, false, v02.k());
        k5.U0(v02);
        k5.X0(dVar.getType());
        l0.o(k5, ProtectedSandApp.s("蓟"));
        if (z0Var != null) {
            List<j1> n5 = z0Var.n();
            l0.o(n5, ProtectedSandApp.s("蓠"));
            G2 = j0.G2(n5);
            j1 j1Var = (j1) G2;
            if (j1Var == null) {
                throw new AssertionError(ProtectedSandApp.s("蓡") + z0Var);
            }
            e0Var = kotlin.reflect.jvm.internal.impl.resolve.d.m(dVar, z0Var.getAnnotations(), j1Var.getAnnotations(), false, false, false, z0Var.c(), z0Var.k());
            e0Var.U0(z0Var);
        } else {
            e0Var = null;
        }
        dVar.d1(k5, e0Var, null, null);
        return dVar;
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.descriptors.f k0(r rVar, h0 h0Var, e0 e0Var) {
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.f n12 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.f.n1(this.f24670n, kotlin.reflect.jvm.internal.impl.load.java.lazy.e.a(x(), rVar), e0Var, kotlin.reflect.jvm.internal.impl.load.java.j0.d(rVar.c()), false, rVar.getName(), x().a().t().a(rVar), false);
        l0.o(n12, ProtectedSandApp.s("蓢"));
        d0 d6 = kotlin.reflect.jvm.internal.impl.resolve.d.d(n12, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b());
        l0.o(d6, ProtectedSandApp.s("蓣"));
        n12.c1(d6, null);
        h0 r5 = h0Var == null ? r(rVar, kotlin.reflect.jvm.internal.impl.load.java.lazy.a.f(x(), n12, rVar, 0, 4, null)) : h0Var;
        EmptyList emptyList = EmptyList.f23167o;
        n12.j1(r5, emptyList, A(), null, emptyList);
        d6.X0(r5);
        return n12;
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.descriptors.f l0(g gVar, r rVar, h0 h0Var, e0 e0Var, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            h0Var = null;
        }
        return gVar.k0(rVar, h0Var, e0Var);
    }

    private final List<j1> m0(kotlin.reflect.jvm.internal.impl.descriptors.impl.f fVar) {
        Collection<b4.w> w5 = this.f24671o.w();
        ArrayList arrayList = new ArrayList(w5.size());
        kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a b6 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(s1.COMMON, false, false, null, 6, null);
        Iterator<b4.w> it = w5.iterator();
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (!it.hasNext()) {
                return arrayList;
            }
            i5 = i6 + 1;
            b4.w next = it.next();
            h0 o5 = x().g().o(next.getType(), b6);
            arrayList.add(new kotlin.reflect.jvm.internal.impl.descriptors.impl.l0(fVar, null, i6, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b(), next.getName(), o5, false, false, false, next.b() ? x().a().m().A().k(o5) : null, x().a().t().a(next)));
        }
    }

    private final z0 n0(z0 z0Var, kotlin.reflect.jvm.internal.impl.name.f fVar) {
        z.a<? extends z0> F = z0Var.F();
        F.s(fVar);
        F.t();
        F.e();
        z0 build = F.build();
        l0.m(build);
        return build;
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
            java.util.List r0 = r6.n()
            java.lang.String r1 = "蓤"
            java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
            kotlin.jvm.internal.l0.o(r0, r1)
            java.lang.Object r0 = kotlin.collections.y.v3(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r0
            r2 = 0
            if (r0 == 0) goto L82
            kotlin.reflect.jvm.internal.impl.types.h0 r3 = r0.getType()
            kotlin.reflect.jvm.internal.impl.types.h1 r3 = r3.U0()
            kotlin.reflect.jvm.internal.impl.descriptors.h r3 = r3.b()
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
            kotlin.reflect.jvm.internal.impl.name.c r4 = kotlin.reflect.jvm.internal.impl.builtins.l.f24030p
            boolean r3 = kotlin.jvm.internal.l0.g(r3, r4)
            if (r3 == 0) goto L43
            goto L44
        L43:
            r0 = r2
        L44:
            if (r0 != 0) goto L47
            goto L82
        L47:
            kotlin.reflect.jvm.internal.impl.descriptors.z$a r2 = r6.F()
            java.util.List r6 = r6.n()
            kotlin.jvm.internal.l0.o(r6, r1)
            r1 = 1
            java.util.List r6 = kotlin.collections.y.d2(r6, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.z$a r6 = r2.b(r6)
            kotlin.reflect.jvm.internal.impl.types.h0 r0 = r0.getType()
            java.util.List r0 = r0.S0()
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            kotlin.reflect.jvm.internal.impl.types.l1 r0 = (kotlin.reflect.jvm.internal.impl.types.l1) r0
            kotlin.reflect.jvm.internal.impl.types.h0 r0 = r0.getType()
            kotlin.reflect.jvm.internal.impl.descriptors.z$a r6 = r6.f(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.z r6 = r6.build()
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r6 = (kotlin.reflect.jvm.internal.impl.descriptors.z0) r6
            r0 = r6
            kotlin.reflect.jvm.internal.impl.descriptors.impl.g0 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.g0) r0
            if (r0 != 0) goto L7e
            goto L81
        L7e:
            r0.o1(r1)
        L81:
            return r6
        L82:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g.o0(kotlin.reflect.jvm.internal.impl.descriptors.z0):kotlin.reflect.jvm.internal.impl.descriptors.z0");
    }

    private final boolean p0(u0 u0Var, q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, ? extends Collection<? extends z0>> lVar) {
        if (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c.a(u0Var)) {
            return false;
        }
        z0 v02 = v0(u0Var, lVar);
        z0 w02 = w0(u0Var, lVar);
        if (v02 == null) {
            return false;
        }
        if (u0Var.q0()) {
            return w02 != null && w02.r() == v02.r();
        }
        return true;
    }

    private final boolean q0(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        k.i.a c6 = kotlin.reflect.jvm.internal.impl.resolve.k.f25946f.F(aVar2, aVar, true).c();
        l0.o(c6, ProtectedSandApp.s("蓥"));
        return c6 == k.i.a.OVERRIDABLE && !kotlin.reflect.jvm.internal.impl.load.java.t.f24821a.a(aVar2, aVar);
    }

    private final boolean r0(z0 z0Var) {
        i0.a aVar = i0.f24581a;
        kotlin.reflect.jvm.internal.impl.name.f name = z0Var.getName();
        l0.o(name, ProtectedSandApp.s("蓦"));
        kotlin.reflect.jvm.internal.impl.name.f b6 = aVar.b(name);
        if (b6 == null) {
            return false;
        }
        Set<z0> z02 = z0(b6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : z02) {
            if (kotlin.reflect.jvm.internal.impl.load.java.h0.a((z0) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        z0 n02 = n0(z0Var, b6);
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

    private final boolean s0(z0 z0Var, kotlin.reflect.jvm.internal.impl.descriptors.z zVar) {
        if (kotlin.reflect.jvm.internal.impl.load.java.e.f24562n.k(z0Var)) {
            zVar = zVar.a();
        }
        l0.o(zVar, ProtectedSandApp.s("蓧"));
        return q0(zVar, z0Var);
    }

    private final boolean t0(z0 z0Var) {
        z0 o02 = o0(z0Var);
        if (o02 == null) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.name.f name = z0Var.getName();
        l0.o(name, ProtectedSandApp.s("蓨"));
        Set<z0> z02 = z0(name);
        if ((z02 instanceof Collection) && z02.isEmpty()) {
            return false;
        }
        for (z0 z0Var2 : z02) {
            if (z0Var2.o() && q0(o02, z0Var2)) {
                return true;
            }
        }
        return false;
    }

    private final z0 u0(u0 u0Var, String str, q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, ? extends Collection<? extends z0>> lVar) {
        z0 z0Var;
        kotlin.reflect.jvm.internal.impl.name.f p5 = kotlin.reflect.jvm.internal.impl.name.f.p(str);
        l0.o(p5, ProtectedSandApp.s("蓩"));
        Iterator<T> it = lVar.N(p5).iterator();
        do {
            z0Var = null;
            if (!it.hasNext()) {
                break;
            }
            z0 z0Var2 = (z0) it.next();
            if (z0Var2.n().size() == 0) {
                kotlin.reflect.jvm.internal.impl.types.checker.e eVar = kotlin.reflect.jvm.internal.impl.types.checker.e.f26341a;
                h0 i5 = z0Var2.i();
                if (i5 == null ? false : eVar.d(i5, u0Var.getType())) {
                    z0Var = z0Var2;
                }
            }
        } while (z0Var == null);
        return z0Var;
    }

    private final z0 v0(u0 u0Var, q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, ? extends Collection<? extends z0>> lVar) {
        v0 e6 = u0Var.e();
        v0 v0Var = e6 != null ? (v0) kotlin.reflect.jvm.internal.impl.load.java.h0.d(e6) : null;
        String a6 = v0Var != null ? kotlin.reflect.jvm.internal.impl.load.java.i.f24579a.a(v0Var) : null;
        if (a6 != null && !kotlin.reflect.jvm.internal.impl.load.java.h0.f(this.f24670n, v0Var)) {
            return u0(u0Var, a6, lVar);
        }
        String h5 = u0Var.getName().h();
        l0.o(h5, ProtectedSandApp.s("蓪"));
        return u0(u0Var, kotlin.reflect.jvm.internal.impl.load.java.a0.b(h5), lVar);
    }

    private final z0 w0(u0 u0Var, q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, ? extends Collection<? extends z0>> lVar) {
        z0 z0Var;
        h0 i5;
        Object h5;
        String h6 = u0Var.getName().h();
        l0.o(h6, ProtectedSandApp.s("蓫"));
        kotlin.reflect.jvm.internal.impl.name.f p5 = kotlin.reflect.jvm.internal.impl.name.f.p(kotlin.reflect.jvm.internal.impl.load.java.a0.e(h6));
        l0.o(p5, ProtectedSandApp.s("蓬"));
        Iterator<T> it = lVar.N(p5).iterator();
        do {
            z0Var = null;
            if (!it.hasNext()) {
                break;
            }
            z0 z0Var2 = (z0) it.next();
            if (z0Var2.n().size() == 1 && (i5 = z0Var2.i()) != null && kotlin.reflect.jvm.internal.impl.builtins.h.B0(i5)) {
                kotlin.reflect.jvm.internal.impl.types.checker.e eVar = kotlin.reflect.jvm.internal.impl.types.checker.e.f26341a;
                List<j1> n5 = z0Var2.n();
                l0.o(n5, ProtectedSandApp.s("蓭"));
                h5 = j0.h5(n5);
                if (eVar.b(((j1) h5).getType(), u0Var.getType())) {
                    z0Var = z0Var2;
                }
            }
        } while (z0Var == null);
        return z0Var;
    }

    private final u x0(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        u c6 = eVar.c();
        l0.o(c6, ProtectedSandApp.s("蓮"));
        if (!l0.g(c6, s.f24818b)) {
            return c6;
        }
        u uVar = s.f24819c;
        l0.o(uVar, ProtectedSandApp.s("蓯"));
        return uVar;
    }

    private final Set<z0> z0(kotlin.reflect.jvm.internal.impl.name.f fVar) {
        Collection<h0> d02 = d0();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = d02.iterator();
        while (it.hasNext()) {
            f0.q0(linkedHashSet, ((h0) it.next()).C().a(fVar, z3.d.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    @d5.e
    protected x0 A() {
        return kotlin.reflect.jvm.internal.impl.resolve.e.l(this.f24670n);
    }

    @d5.d
    protected kotlin.reflect.jvm.internal.impl.descriptors.e A0() {
        return this.f24670n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    public kotlin.reflect.jvm.internal.impl.descriptors.m D() {
        return this.f24670n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    protected boolean H(@d5.d kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVar) {
        l0.p(eVar, ProtectedSandApp.s("蓰"));
        if (this.f24671o.x()) {
            return false;
        }
        return D0(eVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    @d5.d
    protected j.a I(@d5.d r rVar, @d5.d List<? extends f1> list, @d5.d h0 h0Var, @d5.d List<? extends j1> list2) {
        l0.p(rVar, ProtectedSandApp.s("蓱"));
        l0.p(list, ProtectedSandApp.s("蓲"));
        l0.p(h0Var, ProtectedSandApp.s("蓳"));
        l0.p(list2, ProtectedSandApp.s("蓴"));
        j.b b6 = x().a().s().b(rVar, this.f24670n, h0Var, null, list2, list);
        l0.o(b6, ProtectedSandApp.s("蓵"));
        h0 d6 = b6.d();
        l0.o(d6, ProtectedSandApp.s("蓶"));
        h0 c6 = b6.c();
        List<j1> f6 = b6.f();
        l0.o(f6, ProtectedSandApp.s("蓷"));
        List<f1> e6 = b6.e();
        l0.o(e6, ProtectedSandApp.s("蓸"));
        boolean g5 = b6.g();
        List<String> b7 = b6.b();
        l0.o(b7, ProtectedSandApp.s("蓹"));
        return new j.a(d6, c6, f6, e6, g5, b7);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j, kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.d
    public Collection<z0> a(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("蓺"));
        l0.p(bVar, ProtectedSandApp.s("蓻"));
        e(fVar, bVar);
        return super.a(fVar, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    @d5.d
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.f> o(@d5.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @d5.e q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("蓼"));
        Collection<h0> m5 = this.f24670n.m().m();
        l0.o(m5, ProtectedSandApp.s("蓽"));
        LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.f> linkedHashSet = new LinkedHashSet<>();
        Iterator<T> it = m5.iterator();
        while (it.hasNext()) {
            f0.q0(linkedHashSet, ((h0) it.next()).C().b());
        }
        linkedHashSet.addAll(z().n().a());
        linkedHashSet.addAll(z().n().d());
        linkedHashSet.addAll(m(dVar, lVar));
        linkedHashSet.addAll(x().a().w().d(x(), this.f24670n));
        return linkedHashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    @d5.d
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a q() {
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a(this.f24671o, a.f24678p);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j, kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    public Collection<u0> d(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("蓾"));
        l0.p(bVar, ProtectedSandApp.s("蓿"));
        e(fVar, bVar);
        return super.d(fVar, bVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    public void e(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("蔀"));
        l0.p(bVar, ProtectedSandApp.s("蔁"));
        y3.a.a(x().a().l(), bVar, this.f24670n, fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.e
    public kotlin.reflect.jvm.internal.impl.descriptors.h h(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.descriptors.e> hVar;
        kotlin.reflect.jvm.internal.impl.descriptors.e N;
        l0.p(fVar, ProtectedSandApp.s("蔂"));
        l0.p(bVar, ProtectedSandApp.s("蔃"));
        e(fVar, bVar);
        g gVar = (g) C();
        return (gVar == null || (hVar = gVar.f24677u) == null || (N = hVar.N(fVar)) == null) ? this.f24677u.N(fVar) : N;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    @d5.d
    protected Set<kotlin.reflect.jvm.internal.impl.name.f> m(@d5.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @d5.e q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        Set<kotlin.reflect.jvm.internal.impl.name.f> C;
        l0.p(dVar, ProtectedSandApp.s("蔄"));
        C = r1.C(this.f24674r.n(), this.f24676t.n().keySet());
        return C;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    protected void p(@d5.d Collection<z0> collection, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(collection, ProtectedSandApp.s("蔅"));
        l0.p(fVar, ProtectedSandApp.s("蔆"));
        if (this.f24671o.y() && z().n().b(fVar) != null) {
            boolean z5 = true;
            if (!collection.isEmpty()) {
                Iterator<T> it = collection.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((z0) it.next()).n().isEmpty()) {
                        z5 = false;
                        break;
                    }
                }
            }
            if (z5) {
                b4.w b6 = z().n().b(fVar);
                l0.m(b6);
                collection.add(I0(b6));
            }
        }
        x().a().w().g(x(), this.f24670n, fVar, collection);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    protected void s(@d5.d Collection<z0> collection, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
        List D4;
        boolean z5;
        l0.p(collection, ProtectedSandApp.s("蔇"));
        l0.p(fVar, ProtectedSandApp.s("蔈"));
        Set<z0> z02 = z0(fVar);
        if (!i0.f24581a.k(fVar) && !kotlin.reflect.jvm.internal.impl.load.java.f.f24568n.l(fVar)) {
            if (!(z02 instanceof Collection) || !z02.isEmpty()) {
                Iterator<T> it = z02.iterator();
                while (it.hasNext()) {
                    if (((kotlin.reflect.jvm.internal.impl.descriptors.z) it.next()).o()) {
                        z5 = false;
                        break;
                    }
                }
            }
            z5 = true;
            if (z5) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : z02) {
                    if (D0((z0) obj)) {
                        arrayList.add(obj);
                    }
                }
                X(collection, fVar, arrayList, false);
                return;
            }
        }
        kotlin.reflect.jvm.internal.impl.utils.f a6 = kotlin.reflect.jvm.internal.impl.utils.f.f26679q.a();
        Collection<? extends z0> d6 = kotlin.reflect.jvm.internal.impl.load.java.components.a.d(fVar, z02, EmptyList.f23167o, this.f24670n, kotlin.reflect.jvm.internal.impl.serialization.deserialization.r.f26255a, x().a().k().a());
        l0.o(d6, ProtectedSandApp.s("蔉"));
        Y(fVar, collection, d6, collection, new b(this));
        Y(fVar, collection, d6, a6, new c(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : z02) {
            if (D0((z0) obj2)) {
                arrayList2.add(obj2);
            }
        }
        D4 = j0.D4(arrayList2, a6);
        X(collection, fVar, D4, true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    protected void t(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d Collection<u0> collection) {
        Set<? extends u0> x5;
        Set C;
        l0.p(fVar, ProtectedSandApp.s("蔊"));
        l0.p(collection, ProtectedSandApp.s("蔋"));
        if (this.f24671o.x()) {
            a0(fVar, collection);
        }
        Set<u0> B0 = B0(fVar);
        if (B0.isEmpty()) {
            return;
        }
        f.b bVar = kotlin.reflect.jvm.internal.impl.utils.f.f26679q;
        kotlin.reflect.jvm.internal.impl.utils.f a6 = bVar.a();
        kotlin.reflect.jvm.internal.impl.utils.f a7 = bVar.a();
        Z(B0, collection, a6, new d());
        x5 = r1.x(B0, a6);
        Z(x5, a7, null, new e());
        C = r1.C(B0, a7);
        Collection<? extends u0> d6 = kotlin.reflect.jvm.internal.impl.load.java.components.a.d(fVar, C, collection, this.f24670n, x().a().c(), x().a().k().a());
        l0.o(d6, ProtectedSandApp.s("蔌"));
        collection.addAll(d6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    @d5.d
    public String toString() {
        return ProtectedSandApp.s("蔍") + this.f24671o.f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    @d5.d
    protected Set<kotlin.reflect.jvm.internal.impl.name.f> u(@d5.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @d5.e q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("蔎"));
        if (this.f24671o.x()) {
            return b();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(z().n().e());
        Collection<h0> m5 = this.f24670n.m().m();
        l0.o(m5, ProtectedSandApp.s("蔏"));
        Iterator<T> it = m5.iterator();
        while (it.hasNext()) {
            f0.q0(linkedHashSet, ((h0) it.next()).C().c());
        }
        return linkedHashSet;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.storage.i<List<kotlin.reflect.jvm.internal.impl.descriptors.d>> y0() {
        return this.f24673q;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@d5.d kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d b4.g gVar2, boolean z5, @d5.e g gVar3) {
        super(gVar, gVar3);
        l0.p(gVar, ProtectedSandApp.s("蓊"));
        l0.p(eVar, ProtectedSandApp.s("蓋"));
        l0.p(gVar2, ProtectedSandApp.s("蓌"));
        this.f24670n = eVar;
        this.f24671o = gVar2;
        this.f24672p = z5;
        this.f24673q = gVar.e().d(new f(gVar));
        this.f24674r = gVar.e().d(new j());
        this.f24675s = gVar.e().d(new h(gVar, this));
        this.f24676t = gVar.e().d(new C0287g());
        this.f24677u = gVar.e().i(new k(gVar));
    }
}
