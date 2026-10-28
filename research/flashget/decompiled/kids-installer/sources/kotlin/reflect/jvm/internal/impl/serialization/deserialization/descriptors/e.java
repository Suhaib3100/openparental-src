package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.b0;
import kotlin.collections.e1;
import kotlin.collections.f0;
import kotlin.collections.j0;
import kotlin.collections.r1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.g1;
import kotlin.reflect.jvm.internal.impl.descriptors.h1;
import kotlin.reflect.jvm.internal.impl.descriptors.i0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.p;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.descriptors.w;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.h;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.k;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.c0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.r;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.x;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.y;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: DeserializedClassDescriptor.kt */
/* loaded from: classes6.dex */
public final class e extends kotlin.reflect.jvm.internal.impl.descriptors.impl.a implements w {

    @d5.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.f A;

    @d5.d
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.m B;

    @d5.d
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.i C;

    @d5.d
    private final b D;

    @d5.d
    private final y0<a> E;

    @d5.e
    private final c F;

    @d5.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.m G;

    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.descriptors.d> H;

    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i<Collection<kotlin.reflect.jvm.internal.impl.descriptors.d>> I;

    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.descriptors.e> J;

    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i<Collection<kotlin.reflect.jvm.internal.impl.descriptors.e>> K;

    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.j<h1<p0>> L;

    @d5.d
    private final a0.a M;

    @d5.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g N;

    /* renamed from: u, reason: collision with root package name */
    @d5.d
    private final a.c f26084u;

    /* renamed from: v, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a f26085v;

    /* renamed from: w, reason: collision with root package name */
    @d5.d
    private final a1 f26086w;

    /* renamed from: x, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.name.b f26087x;

    /* renamed from: y, reason: collision with root package name */
    @d5.d
    private final e0 f26088y;

    /* renamed from: z, reason: collision with root package name */
    @d5.d
    private final u f26089z;

    /* compiled from: DeserializedClassDescriptor.kt */
    private final class a extends kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i {

        /* renamed from: g, reason: collision with root package name */
        @d5.d
        private final kotlin.reflect.jvm.internal.impl.types.checker.g f26090g;

        /* renamed from: h, reason: collision with root package name */
        @d5.d
        private final kotlin.reflect.jvm.internal.impl.storage.i<Collection<kotlin.reflect.jvm.internal.impl.descriptors.m>> f26091h;

        /* renamed from: i, reason: collision with root package name */
        @d5.d
        private final kotlin.reflect.jvm.internal.impl.storage.i<Collection<h0>> f26092i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ e f26093j;

        /* compiled from: DeserializedClassDescriptor.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e$a$a, reason: collision with other inner class name */
        static final class C0378a extends Lambda implements q3.a<List<? extends kotlin.reflect.jvm.internal.impl.name.f>> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ List<kotlin.reflect.jvm.internal.impl.name.f> f26094p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0378a(List<kotlin.reflect.jvm.internal.impl.name.f> list) {
                super(0);
                this.f26094p = list;
            }

            @d5.d
            public final List<kotlin.reflect.jvm.internal.impl.name.f> a() {
                return this.f26094p;
            }

            @Override // q3.a
            public List<? extends kotlin.reflect.jvm.internal.impl.name.f> n() {
                return this.f26094p;
            }
        }

        /* compiled from: DeserializedClassDescriptor.kt */
        static final class b extends Lambda implements q3.a<Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.m>> {
            b() {
                super(0);
            }

            @Override // q3.a
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> n() {
                return a.this.k(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f25989o, kotlin.reflect.jvm.internal.impl.resolve.scopes.h.f26014a.a(), z3.d.WHEN_GET_ALL_DESCRIPTORS);
            }
        }

        /* compiled from: DeserializedClassDescriptor.kt */
        public static final class c extends kotlin.reflect.jvm.internal.impl.resolve.i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<D> f26096a;

            c(List<D> list) {
                this.f26096a = list;
            }

            @Override // kotlin.reflect.jvm.internal.impl.resolve.j
            public void a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
                l0.p(bVar, ProtectedSandApp.s("蝡"));
                kotlin.reflect.jvm.internal.impl.resolve.k.K(bVar, null);
                this.f26096a.add(bVar);
            }

            @Override // kotlin.reflect.jvm.internal.impl.resolve.i
            protected void e(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar2) {
                l0.p(bVar, ProtectedSandApp.s("蝢"));
                l0.p(bVar2, ProtectedSandApp.s("蝣"));
                if (bVar2 instanceof p) {
                    ((p) bVar2).b1(v.f24453a, bVar);
                }
            }
        }

        /* compiled from: DeserializedClassDescriptor.kt */
        static final class d extends Lambda implements q3.a<Collection<? extends h0>> {
            d() {
                super(0);
            }

            @Override // q3.a
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection<h0> n() {
                return a.this.f26090g.g(a.this.f26093j);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(@d5.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e r8, kotlin.reflect.jvm.internal.impl.types.checker.g r9) {
            /*
                r7 = this;
                java.lang.String r0 = "蝼"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.p(r9, r0)
                r7.f26093j = r8
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r2 = r8.h1()
                kotlin.reflect.jvm.internal.impl.metadata.a$c r0 = r8.i1()
                java.util.List r3 = r0.I0()
                java.lang.String r0 = "蝽"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.o(r3, r0)
                kotlin.reflect.jvm.internal.impl.metadata.a$c r0 = r8.i1()
                java.util.List r4 = r0.W0()
                java.lang.String r0 = "蝾"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.o(r4, r0)
                kotlin.reflect.jvm.internal.impl.metadata.a$c r0 = r8.i1()
                java.util.List r5 = r0.e1()
                java.lang.String r0 = "蝿"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.o(r5, r0)
                kotlin.reflect.jvm.internal.impl.metadata.a$c r0 = r8.i1()
                java.util.List r0 = r0.T0()
                java.lang.String r1 = "螀"
                java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
                kotlin.jvm.internal.l0.o(r0, r1)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r8 = r8.h1()
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r8 = r8.g()
                java.util.ArrayList r1 = new java.util.ArrayList
                r6 = 10
                int r6 = kotlin.collections.y.b0(r0, r6)
                r1.<init>(r6)
                java.util.Iterator r0 = r0.iterator()
            L6a:
                boolean r6 = r0.hasNext()
                if (r6 == 0) goto L82
                java.lang.Object r6 = r0.next()
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                kotlin.reflect.jvm.internal.impl.name.f r6 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.y.b(r8, r6)
                r1.add(r6)
                goto L6a
            L82:
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e$a$a r6 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e$a$a
                r6.<init>(r1)
                r1 = r7
                r1.<init>(r2, r3, r4, r5, r6)
                r7.f26090g = r9
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r8 = r7.q()
                kotlin.reflect.jvm.internal.impl.storage.n r8 = r8.h()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e$a$b r9 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e$a$b
                r9.<init>()
                kotlin.reflect.jvm.internal.impl.storage.i r8 = r8.d(r9)
                r7.f26091h = r8
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r8 = r7.q()
                kotlin.reflect.jvm.internal.impl.storage.n r8 = r8.h()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e$a$d r9 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e$a$d
                r9.<init>()
                kotlin.reflect.jvm.internal.impl.storage.i r8 = r8.d(r9)
                r7.f26092i = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e.a.<init>(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e, kotlin.reflect.jvm.internal.impl.types.checker.g):void");
        }

        private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.b> void B(kotlin.reflect.jvm.internal.impl.name.f fVar, Collection<? extends D> collection, List<D> list) {
            q().c().m().a().v(fVar, collection, new ArrayList(list), this.f26093j, new c(list));
        }

        private final e C() {
            return this.f26093j;
        }

        public static final e z(a aVar) {
            return aVar.f26093j;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
        @d5.d
        public Collection<z0> a(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
            l0.p(fVar, ProtectedSandApp.s("螁"));
            l0.p(bVar, ProtectedSandApp.s("螂"));
            e(fVar, bVar);
            return super.a(fVar, bVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
        @d5.d
        public Collection<u0> d(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
            l0.p(fVar, ProtectedSandApp.s("螃"));
            l0.p(bVar, ProtectedSandApp.s("螄"));
            e(fVar, bVar);
            return super.d(fVar, bVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
        public void e(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
            l0.p(fVar, ProtectedSandApp.s("螅"));
            l0.p(bVar, ProtectedSandApp.s("螆"));
            y3.a.a(q().c().o(), bVar, this.f26093j, fVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
        @d5.d
        public Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g(@d5.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
            l0.p(dVar, ProtectedSandApp.s("螇"));
            l0.p(lVar, ProtectedSandApp.s("螈"));
            return this.f26091h.n();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
        @d5.e
        public kotlin.reflect.jvm.internal.impl.descriptors.h h(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
            kotlin.reflect.jvm.internal.impl.descriptors.e f6;
            l0.p(fVar, ProtectedSandApp.s("螉"));
            l0.p(bVar, ProtectedSandApp.s("螊"));
            e(fVar, bVar);
            c cVar = this.f26093j.F;
            return (cVar == null || (f6 = cVar.f(fVar)) == null) ? super.h(fVar, bVar) : f6;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i
        protected void j(@d5.d Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> collection, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
            l0.p(collection, ProtectedSandApp.s("螋"));
            l0.p(lVar, ProtectedSandApp.s("螌"));
            c cVar = this.f26093j.F;
            Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> d6 = cVar != null ? cVar.d() : null;
            if (d6 == null) {
                d6 = EmptyList.f23167o;
            }
            collection.addAll(d6);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i
        protected void l(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d List<z0> list) {
            l0.p(fVar, ProtectedSandApp.s("融"));
            l0.p(list, ProtectedSandApp.s("螎"));
            ArrayList arrayList = new ArrayList();
            Iterator<h0> it = this.f26092i.n().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().C().a(fVar, z3.d.FOR_ALREADY_TRACKED));
            }
            list.addAll(q().c().c().b(fVar, this.f26093j));
            B(fVar, arrayList, list);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i
        protected void m(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d List<u0> list) {
            l0.p(fVar, ProtectedSandApp.s("螏"));
            l0.p(list, ProtectedSandApp.s("螐"));
            ArrayList arrayList = new ArrayList();
            Iterator<h0> it = this.f26092i.n().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().C().d(fVar, z3.d.FOR_ALREADY_TRACKED));
            }
            B(fVar, arrayList, list);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i
        @d5.d
        protected kotlin.reflect.jvm.internal.impl.name.b n(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("螑"));
            kotlin.reflect.jvm.internal.impl.name.b d6 = this.f26093j.f26087x.d(fVar);
            l0.o(d6, ProtectedSandApp.s("螒"));
            return d6;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i
        @d5.e
        protected Set<kotlin.reflect.jvm.internal.impl.name.f> t() {
            List<h0> m5 = this.f26093j.D.m();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = m5.iterator();
            while (it.hasNext()) {
                Set<kotlin.reflect.jvm.internal.impl.name.f> f6 = ((h0) it.next()).C().f();
                if (f6 == null) {
                    return null;
                }
                f0.q0(linkedHashSet, f6);
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i
        @d5.d
        protected Set<kotlin.reflect.jvm.internal.impl.name.f> u() {
            List<h0> m5 = this.f26093j.D.m();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = m5.iterator();
            while (it.hasNext()) {
                f0.q0(linkedHashSet, ((h0) it.next()).C().b());
            }
            linkedHashSet.addAll(q().c().c().e(this.f26093j));
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i
        @d5.d
        protected Set<kotlin.reflect.jvm.internal.impl.name.f> v() {
            List<h0> m5 = this.f26093j.D.m();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = m5.iterator();
            while (it.hasNext()) {
                f0.q0(linkedHashSet, ((h0) it.next()).C().c());
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i
        protected boolean y(@d5.d z0 z0Var) {
            l0.p(z0Var, ProtectedSandApp.s("螓"));
            return q().c().s().c(this.f26093j, z0Var);
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    private final class b extends kotlin.reflect.jvm.internal.impl.types.b {

        /* renamed from: d, reason: collision with root package name */
        @d5.d
        private final kotlin.reflect.jvm.internal.impl.storage.i<List<f1>> f26098d;

        /* compiled from: DeserializedClassDescriptor.kt */
        static final class a extends Lambda implements q3.a<List<? extends f1>> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ e f26100p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar) {
                super(0);
                this.f26100p = eVar;
            }

            @Override // q3.a
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<f1> n() {
                return g1.d(this.f26100p);
            }
        }

        public b() {
            super(e.this.h1().h());
            this.f26098d = e.this.h1().h().d(new a(e.this));
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.b, kotlin.reflect.jvm.internal.impl.types.n, kotlin.reflect.jvm.internal.impl.types.h1
        public kotlin.reflect.jvm.internal.impl.descriptors.h b() {
            return e.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        public boolean d() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h
        @d5.d
        protected Collection<h0> k() {
            int b02;
            List D4;
            List V5;
            int b03;
            String h5;
            kotlin.reflect.jvm.internal.impl.name.c b6;
            List<a.q> o5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.o(e.this.i1(), e.this.h1().j());
            e eVar = e.this;
            b02 = b0.b0(o5, 10);
            ArrayList arrayList = new ArrayList(b02);
            Iterator<T> it = o5.iterator();
            while (it.hasNext()) {
                arrayList.add(eVar.h1().i().q((a.q) it.next()));
            }
            D4 = j0.D4(arrayList, e.this.h1().c().c().d(e.this));
            ArrayList<k0.b> arrayList2 = new ArrayList();
            Iterator it2 = D4.iterator();
            while (it2.hasNext()) {
                kotlin.reflect.jvm.internal.impl.descriptors.h b7 = ((h0) it2.next()).U0().b();
                k0.b bVar = b7 instanceof k0.b ? (k0.b) b7 : null;
                if (bVar != null) {
                    arrayList2.add(bVar);
                }
            }
            if (!arrayList2.isEmpty()) {
                r i5 = e.this.h1().c().i();
                e eVar2 = e.this;
                b03 = b0.b0(arrayList2, 10);
                ArrayList arrayList3 = new ArrayList(b03);
                for (k0.b bVar2 : arrayList2) {
                    kotlin.reflect.jvm.internal.impl.name.b k5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.k(bVar2);
                    if (k5 == null || (b6 = k5.b()) == null || (h5 = b6.b()) == null) {
                        h5 = bVar2.getName().h();
                    }
                    arrayList3.add(h5);
                }
                i5.b(eVar2, arrayList3);
            }
            V5 = j0.V5(D4);
            return V5;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h
        @d5.d
        protected d1 p() {
            return d1.a.f24134a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        @d5.d
        public List<f1> r() {
            return this.f26098d.n();
        }

        @d5.d
        public String toString() {
            String fVar = e.this.getName().toString();
            l0.o(fVar, ProtectedSandApp.s("螔"));
            return fVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.b
        /* renamed from: w */
        public kotlin.reflect.jvm.internal.impl.descriptors.e b() {
            return e.this;
        }

        @d5.d
        public e x() {
            return e.this;
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* loaded from: classes5.dex */
    private final class c {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        private final Map<kotlin.reflect.jvm.internal.impl.name.f, a.g> f26101a;

        /* renamed from: b, reason: collision with root package name */
        @d5.d
        private final kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.descriptors.e> f26102b;

        /* renamed from: c, reason: collision with root package name */
        @d5.d
        private final kotlin.reflect.jvm.internal.impl.storage.i<Set<kotlin.reflect.jvm.internal.impl.name.f>> f26103c;

        /* compiled from: DeserializedClassDescriptor.kt */
        /* loaded from: classes6.dex */
        static final class a extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.descriptors.e> {

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ e f26106q;

            /* compiled from: DeserializedClassDescriptor.kt */
            /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e$c$a$a, reason: collision with other inner class name */
            static final class C0379a extends Lambda implements q3.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> {

                /* renamed from: p, reason: collision with root package name */
                final /* synthetic */ e f26107p;

                /* renamed from: q, reason: collision with root package name */
                final /* synthetic */ a.g f26108q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0379a(e eVar, a.g gVar) {
                    super(0);
                    this.f26107p = eVar;
                    this.f26108q = gVar;
                }

                @Override // q3.a
                @d5.d
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> n() {
                    List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> V5;
                    V5 = j0.V5(this.f26107p.h1().c().d().f(this.f26107p.m1(), this.f26108q));
                    return V5;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar) {
                super(1);
                this.f26106q = eVar;
            }

            @Override // q3.l
            @d5.e
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.descriptors.e N(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
                l0.p(fVar, ProtectedSandApp.s("螕"));
                a.g gVar = (a.g) c.this.f26101a.get(fVar);
                if (gVar == null) {
                    return null;
                }
                e eVar = this.f26106q;
                return kotlin.reflect.jvm.internal.impl.descriptors.impl.n.S0(eVar.h1().h(), eVar, fVar, c.this.f26103c, new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b(eVar.h1().h(), new C0379a(eVar, gVar)), a1.f24103a);
            }
        }

        /* compiled from: DeserializedClassDescriptor.kt */
        /* loaded from: classes6.dex */
        static final class b extends Lambda implements q3.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>> {
            b() {
                super(0);
            }

            @Override // q3.a
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Set<kotlin.reflect.jvm.internal.impl.name.f> n() {
                return c.this.e();
            }
        }

        public c() {
            int b02;
            int j5;
            List<a.g> D0 = e.this.i1().D0();
            l0.o(D0, ProtectedSandApp.s("厝"));
            b02 = b0.b0(D0, 10);
            j5 = e1.j(b02);
            LinkedHashMap linkedHashMap = new LinkedHashMap(j5 < 16 ? 16 : j5);
            for (Object obj : D0) {
                linkedHashMap.put(y.b(e.this.h1().g(), ((a.g) obj).F()), obj);
            }
            this.f26101a = linkedHashMap;
            this.f26102b = e.this.h1().h().i(new a(e.this));
            this.f26103c = e.this.h1().h().d(new b());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Set<kotlin.reflect.jvm.internal.impl.name.f> e() {
            Set<kotlin.reflect.jvm.internal.impl.name.f> C;
            HashSet hashSet = new HashSet();
            Iterator<h0> it = e.this.m().m().iterator();
            while (it.hasNext()) {
                for (kotlin.reflect.jvm.internal.impl.descriptors.m mVar : k.a.a(it.next().C(), null, null, 3, null)) {
                    if ((mVar instanceof z0) || (mVar instanceof u0)) {
                        hashSet.add(mVar.getName());
                    }
                }
            }
            List<a.i> I0 = e.this.i1().I0();
            l0.o(I0, ProtectedSandApp.s("厞"));
            e eVar = e.this;
            Iterator<T> it2 = I0.iterator();
            while (it2.hasNext()) {
                hashSet.add(y.b(eVar.h1().g(), ((a.i) it2.next()).e0()));
            }
            List<a.n> W0 = e.this.i1().W0();
            l0.o(W0, ProtectedSandApp.s("原"));
            e eVar2 = e.this;
            Iterator<T> it3 = W0.iterator();
            while (it3.hasNext()) {
                hashSet.add(y.b(eVar2.h1().g(), ((a.n) it3.next()).d0()));
            }
            C = r1.C(hashSet, hashSet);
            return C;
        }

        @d5.d
        public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> d() {
            Set<kotlin.reflect.jvm.internal.impl.name.f> keySet = this.f26101a.keySet();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                kotlin.reflect.jvm.internal.impl.descriptors.e f6 = f((kotlin.reflect.jvm.internal.impl.name.f) it.next());
                if (f6 != null) {
                    arrayList.add(f6);
                }
            }
            return arrayList;
        }

        @d5.e
        public final kotlin.reflect.jvm.internal.impl.descriptors.e f(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("厠"));
            return this.f26102b.N(fVar);
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    static final class d extends Lambda implements q3.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> {
        d() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> n() {
            List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> V5;
            V5 = j0.V5(e.this.h1().c().d().c(e.this.m1()));
            return V5;
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e$e, reason: collision with other inner class name */
    static final class C0380e extends Lambda implements q3.a<kotlin.reflect.jvm.internal.impl.descriptors.e> {
        C0380e() {
            super(0);
        }

        @Override // q3.a
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.descriptors.e n() {
            return e.this.Z0();
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    static final class f extends Lambda implements q3.a<Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.d>> {
        f() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> n() {
            return e.this.a1();
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* synthetic */ class g extends g0 implements q3.l<kotlin.reflect.jvm.internal.impl.types.checker.g, a> {
        g(Object obj) {
            super(1, obj);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: A0, reason: merged with bridge method [inline-methods] */
        public final a N(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            l0.p(gVar, ProtectedSandApp.s("螖"));
            return new a((e) this.f23596p, gVar);
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.KCallable
        @d5.d
        public final String getName() {
            return ProtectedSandApp.s("螗");
        }

        @Override // kotlin.jvm.internal.q
        @d5.d
        public final KDeclarationContainer w0() {
            return l1.d(a.class);
        }

        @Override // kotlin.jvm.internal.q
        @d5.d
        public final String y0() {
            return ProtectedSandApp.s("螘");
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    static final class h extends Lambda implements q3.a<kotlin.reflect.jvm.internal.impl.descriptors.d> {
        h() {
            super(0);
        }

        @Override // q3.a
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.descriptors.d n() {
            return e.this.d1();
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    static final class i extends Lambda implements q3.a<Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.e>> {
        i() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> n() {
            return e.this.f1();
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    static final class j extends Lambda implements q3.a<h1<p0>> {
        j() {
            super(0);
        }

        @Override // q3.a
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h1<p0> n() {
            return e.this.g1();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@d5.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.m mVar, @d5.d a.c cVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar2, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.a aVar, @d5.d a1 a1Var) {
        super(mVar.h(), y.a(cVar2, cVar.F0()).j());
        l0.p(mVar, ProtectedSandApp.s("螙"));
        l0.p(cVar, ProtectedSandApp.s("螚"));
        l0.p(cVar2, ProtectedSandApp.s("螛"));
        l0.p(aVar, ProtectedSandApp.s("螜"));
        l0.p(a1Var, ProtectedSandApp.s("螝"));
        this.f26084u = cVar;
        this.f26085v = aVar;
        this.f26086w = a1Var;
        this.f26087x = y.a(cVar2, cVar.F0());
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.b0 b0Var = kotlin.reflect.jvm.internal.impl.serialization.deserialization.b0.f26063a;
        this.f26088y = b0Var.b(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25437e.d(cVar.E0()));
        this.f26089z = c0.a(b0Var, kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25436d.d(cVar.E0()));
        kotlin.reflect.jvm.internal.impl.descriptors.f a6 = b0Var.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25438f.d(cVar.E0()));
        this.A = a6;
        List<a.s> h12 = cVar.h1();
        l0.o(h12, ProtectedSandApp.s("螞"));
        a.t i12 = cVar.i1();
        l0.o(i12, ProtectedSandApp.s("螟"));
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.g(i12);
        h.a aVar2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.h.f25466b;
        a.w k12 = cVar.k1();
        l0.o(k12, ProtectedSandApp.s("螠"));
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.m a7 = mVar.a(this, h12, cVar2, gVar, aVar2.a(k12), aVar);
        this.B = a7;
        kotlin.reflect.jvm.internal.impl.descriptors.f fVar = kotlin.reflect.jvm.internal.impl.descriptors.f.ENUM_CLASS;
        this.C = a6 == fVar ? new kotlin.reflect.jvm.internal.impl.resolve.scopes.l(a7.h(), this) : h.c.f26018b;
        this.D = new b();
        this.E = y0.f24456e.a(this, a7.h(), a7.c().m().c(), new g(this));
        this.F = a6 == fVar ? new c() : null;
        kotlin.reflect.jvm.internal.impl.descriptors.m e6 = mVar.e();
        this.G = e6;
        this.H = a7.h().f(new h());
        this.I = a7.h().d(new f());
        this.J = a7.h().f(new C0380e());
        this.K = a7.h().d(new i());
        this.L = a7.h().f(new j());
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.c g5 = a7.g();
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.g j5 = a7.j();
        e eVar = e6 instanceof e ? (e) e6 : null;
        this.M = new a0.a(cVar, g5, j5, a1Var, eVar != null ? eVar.M : null);
        this.N = !kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25435c.d(cVar.E0()).booleanValue() ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b() : new o(a7.h(), new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.e Z0() {
        if (!this.f26084u.l1()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h h5 = j1().h(y.b(this.B.g(), this.f26084u.r0()), z3.d.FROM_DESERIALIZATION);
        if (h5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.e) h5;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> a1() {
        List P;
        List D4;
        List D42;
        List<kotlin.reflect.jvm.internal.impl.descriptors.d> e12 = e1();
        P = kotlin.collections.a0.P(Y());
        D4 = j0.D4(e12, P);
        D42 = j0.D4(D4, this.B.c().c().a(this));
        return D42;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.a0<p0> b1() {
        Object B2;
        kotlin.reflect.jvm.internal.impl.name.f name;
        p0 p0Var;
        Object obj = null;
        if (!p() && !x()) {
            return null;
        }
        if (x() && !this.f26084u.o1() && !this.f26084u.p1() && !this.f26084u.q1() && this.f26084u.M0() > 0) {
            return null;
        }
        if (this.f26084u.o1()) {
            name = y.b(this.B.g(), this.f26084u.J0());
        } else {
            if (this.f26085v.c(1, 5, 1)) {
                throw new IllegalStateException((ProtectedSandApp.s("螦") + this).toString());
            }
            kotlin.reflect.jvm.internal.impl.descriptors.d Y = Y();
            if (Y == null) {
                throw new IllegalStateException((ProtectedSandApp.s("螥") + this).toString());
            }
            List<j1> n5 = Y.n();
            l0.o(n5, ProtectedSandApp.s("螡"));
            B2 = j0.B2(n5);
            name = ((j1) B2).getName();
            l0.o(name, ProtectedSandApp.s("螢"));
        }
        a.q i5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.i(this.f26084u, this.B.j());
        if (i5 == null || (p0Var = kotlin.reflect.jvm.internal.impl.serialization.deserialization.e0.n(this.B.i(), i5, false, 2, null)) == null) {
            Iterator<T> it = j1().d(name, z3.d.FROM_DESERIALIZATION).iterator();
            Object obj2 = null;
            boolean z5 = false;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (((u0) next).t0() == null) {
                        if (z5) {
                            break;
                        }
                        z5 = true;
                        obj2 = next;
                    }
                } else if (z5) {
                    obj = obj2;
                }
            }
            u0 u0Var = (u0) obj;
            if (u0Var == null) {
                throw new IllegalStateException((ProtectedSandApp.s("螤") + this).toString());
            }
            h0 type = u0Var.getType();
            l0.n(type, ProtectedSandApp.s("螣"));
            p0Var = (p0) type;
        }
        return new kotlin.reflect.jvm.internal.impl.descriptors.a0<>(name, p0Var);
    }

    private final i0<p0> c1() {
        int b02;
        String s5;
        List<a.q> S0;
        int b03;
        List i6;
        int b04;
        List<Integer> N0 = this.f26084u.N0();
        l0.o(N0, ProtectedSandApp.s("螧"));
        b02 = b0.b0(N0, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator<T> it = N0.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            s5 = ProtectedSandApp.s("螨");
            if (!hasNext) {
                break;
            }
            Integer num = (Integer) it.next();
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c g5 = this.B.g();
            l0.o(num, s5);
            arrayList.add(y.b(g5, num.intValue()));
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        if (!x()) {
            throw new IllegalArgumentException((ProtectedSandApp.s("螬") + this).toString());
        }
        Pair pair = new Pair(Integer.valueOf(this.f26084u.Q0()), Integer.valueOf(this.f26084u.P0()));
        if (l0.g(pair, new Pair(Integer.valueOf(arrayList.size()), 0))) {
            List<Integer> R0 = this.f26084u.R0();
            l0.o(R0, ProtectedSandApp.s("螩"));
            b04 = b0.b0(R0, 10);
            S0 = new ArrayList<>(b04);
            for (Integer num2 : R0) {
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.g j5 = this.B.j();
                l0.o(num2, s5);
                S0.add(j5.a(num2.intValue()));
            }
        } else {
            if (!l0.g(pair, new Pair(0, Integer.valueOf(arrayList.size())))) {
                throw new IllegalStateException((ProtectedSandApp.s("螫") + this).toString());
            }
            S0 = this.f26084u.S0();
        }
        l0.o(S0, ProtectedSandApp.s("螪"));
        b03 = b0.b0(S0, 10);
        ArrayList arrayList2 = new ArrayList(b03);
        for (a.q qVar : S0) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.e0 i5 = this.B.i();
            l0.o(qVar, s5);
            arrayList2.add(kotlin.reflect.jvm.internal.impl.serialization.deserialization.e0.n(i5, qVar, false, 2, null));
        }
        i6 = j0.i6(arrayList, arrayList2);
        return new i0<>(i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.d d1() {
        Object obj;
        if (this.A.isSingleton()) {
            kotlin.reflect.jvm.internal.impl.descriptors.impl.f l5 = kotlin.reflect.jvm.internal.impl.resolve.d.l(this, a1.f24103a);
            l5.n1(E());
            return l5;
        }
        List<a.d> u02 = this.f26084u.u0();
        l0.o(u02, ProtectedSandApp.s("螭"));
        Iterator<T> it = u02.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25445m.d(((a.d) obj).J()).booleanValue()) {
                break;
            }
        }
        a.d dVar = (a.d) obj;
        if (dVar != null) {
            return this.B.f().i(dVar, true);
        }
        return null;
    }

    private final List<kotlin.reflect.jvm.internal.impl.descriptors.d> e1() {
        int b02;
        List<a.d> u02 = this.f26084u.u0();
        l0.o(u02, ProtectedSandApp.s("螮"));
        ArrayList<a.d> arrayList = new ArrayList();
        for (Object obj : u02) {
            Boolean d6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25445m.d(((a.d) obj).J());
            l0.o(d6, ProtectedSandApp.s("螯"));
            if (d6.booleanValue()) {
                arrayList.add(obj);
            }
        }
        b02 = b0.b0(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(b02);
        for (a.d dVar : arrayList) {
            x f6 = this.B.f();
            l0.o(dVar, ProtectedSandApp.s("螰"));
            arrayList2.add(f6.i(dVar, false));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> f1() {
        if (this.f26088y != e0.SEALED) {
            return EmptyList.f23167o;
        }
        List<Integer> X0 = this.f26084u.X0();
        l0.o(X0, ProtectedSandApp.s("螱"));
        if (!(!X0.isEmpty())) {
            return kotlin.reflect.jvm.internal.impl.resolve.a.f25878a.a(this, false);
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : X0) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.k c6 = this.B.c();
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c g5 = this.B.g();
            l0.o(num, ProtectedSandApp.s("螲"));
            kotlin.reflect.jvm.internal.impl.descriptors.e b6 = c6.b(y.a(g5, num.intValue()));
            if (b6 != null) {
                arrayList.add(b6);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h1<p0> g1() {
        kotlin.reflect.jvm.internal.impl.descriptors.a0<p0> b12 = b1();
        i0<p0> c12 = c1();
        if (b12 != null && c12 != null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("螳") + this);
        }
        if ((!x() && !p()) || b12 != null || c12 != null) {
            return b12 != null ? b12 : c12;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("螴") + this);
    }

    private final a j1() {
        return this.E.c(this.B.c().m().c());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.i
    @d5.d
    public List<f1> G() {
        return this.B.i().j();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.e
    public h1<p0> G0() {
        return this.L.n();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean I() {
        Boolean d6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25440h.d(this.f26084u.E0());
        l0.o(d6, ProtectedSandApp.s("螵"));
        return d6.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean L() {
        return kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25438f.d(this.f26084u.E0()) == a.c.EnumC0315c.COMPANION_OBJECT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean L0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.a, kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.d
    public List<x0> N0() {
        int b02;
        List<a.q> b6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.b(this.f26084u, this.B.j());
        b02 = b0.b0(b6, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator<T> it = b6.iterator();
        while (it.hasNext()) {
            arrayList.add(new kotlin.reflect.jvm.internal.impl.descriptors.impl.f0(Q0(), new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.b(this, this.B.i().q((a.q) it.next()), null, null), kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.t
    @d5.d
    protected kotlin.reflect.jvm.internal.impl.resolve.scopes.h S(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("螶"));
        return this.E.c(gVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean U() {
        Boolean d6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25442j.d(this.f26084u.E0());
        l0.o(d6, ProtectedSandApp.s("螷"));
        return d6.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.e
    public kotlin.reflect.jvm.internal.impl.descriptors.d Y() {
        return this.H.n();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h Z() {
        return this.C;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.n, kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.m b() {
        return this.G;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.e
    public kotlin.reflect.jvm.internal.impl.descriptors.e b0() {
        return this.J.n();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.q, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @d5.d
    public u c() {
        return this.f26089z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return this.N;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.m h1() {
        return this.B;
    }

    @d5.d
    public final a.c i1() {
        return this.f26084u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.f j() {
        return this.A;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p
    @d5.d
    public a1 k() {
        return this.f26086w;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a k1() {
        return this.f26085v;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> l() {
        return this.I.n();
    }

    @d5.d
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.i l1() {
        return this.C;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h
    @d5.d
    public kotlin.reflect.jvm.internal.impl.types.h1 m() {
        return this.D;
    }

    @d5.d
    public final a0.a m1() {
        return this.M;
    }

    public final boolean n1(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(fVar, ProtectedSandApp.s("螸"));
        return j1().r().contains(fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean p() {
        Boolean d6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25443k.d(this.f26084u.E0());
        l0.o(d6, ProtectedSandApp.s("螹"));
        return d6.booleanValue() && this.f26085v.e(1, 4, 1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean q() {
        Boolean d6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25441i.d(this.f26084u.E0());
        l0.o(d6, ProtectedSandApp.s("螺"));
        return d6.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @d5.d
    public e0 r() {
        return this.f26088y;
    }

    @d5.d
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("螻"));
        sb.append(U() ? ProtectedSandApp.s("螼") : "");
        sb.append(ProtectedSandApp.s("螽"));
        sb.append(getName());
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean u() {
        Boolean d6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25444l.d(this.f26084u.E0());
        l0.o(d6, ProtectedSandApp.s("螾"));
        return d6.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @d5.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> w() {
        return this.K.n();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean x() {
        Boolean d6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25443k.d(this.f26084u.E0());
        l0.o(d6, ProtectedSandApp.s("螿"));
        return d6.booleanValue() && this.f26085v.c(1, 4, 2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i
    public boolean y() {
        Boolean d6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f25439g.d(this.f26084u.E0());
        l0.o(d6, ProtectedSandApp.s("蟀"));
        return d6.booleanValue();
    }
}
