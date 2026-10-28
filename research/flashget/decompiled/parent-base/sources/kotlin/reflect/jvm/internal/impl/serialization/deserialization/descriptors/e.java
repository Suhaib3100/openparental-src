package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.j0;
import kotlin.collections.l1;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.g1;
import kotlin.reflect.jvm.internal.impl.descriptors.h1;
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
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.b0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.c0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.d0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.f0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.r;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.y;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.z;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: DeserializedClassDescriptor.kt */
@r1({"SMAP\nDeserializedClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedClassDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,427:1\n288#2,2:428\n766#2:430\n857#2,2:431\n1549#2:433\n1620#2,3:434\n1549#2:437\n1620#2,3:438\n1603#2,9:441\n1855#2:450\n1856#2:452\n1612#2:453\n661#2,11:455\n1#3:451\n1#3:454\n*S KotlinDebug\n*F\n+ 1 DeserializedClassDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor\n*L\n139#1:428,2\n151#1:430\n151#1:431,2\n151#1:433\n151#1:434,3\n157#1:437\n157#1:438,3\n188#1:441,9\n188#1:450\n188#1:452\n188#1:453\n218#1:455,11\n188#1:451\n*E\n"})
/* loaded from: classes7.dex */
public final class e extends kotlin.reflect.jvm.internal.impl.descriptors.impl.a implements w {

    @fg.l
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g A;

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private final a.c f78073h;

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a f78074i;

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    private final a1 f78075j;

    /* renamed from: k, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.name.b f78076k;

    /* renamed from: l, reason: collision with root package name */
    @fg.l
    private final e0 f78077l;

    /* renamed from: m, reason: collision with root package name */
    @fg.l
    private final u f78078m;

    /* renamed from: n, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.descriptors.f f78079n;

    /* renamed from: o, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.m f78080o;

    /* renamed from: p, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.i f78081p;

    /* renamed from: q, reason: collision with root package name */
    @fg.l
    private final b f78082q;

    /* renamed from: r, reason: collision with root package name */
    @fg.l
    private final y0<a> f78083r;

    /* renamed from: s, reason: collision with root package name */
    @fg.m
    private final c f78084s;

    /* renamed from: t, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.descriptors.m f78085t;

    /* renamed from: u, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.descriptors.d> f78086u;

    /* renamed from: v, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.i<Collection<kotlin.reflect.jvm.internal.impl.descriptors.d>> f78087v;

    /* renamed from: w, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.descriptors.e> f78088w;

    /* renamed from: x, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.i<Collection<kotlin.reflect.jvm.internal.impl.descriptors.e>> f78089x;

    /* renamed from: y, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.j<h1<p0>> f78090y;

    /* renamed from: z, reason: collision with root package name */
    @fg.l
    private final b0.a f78091z;

    /* compiled from: DeserializedClassDescriptor.kt */
    @r1({"SMAP\nDeserializedClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedClassDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor$DeserializedClassMemberScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 addToStdlib.kt\norg/jetbrains/kotlin/utils/addToStdlib/AddToStdlibKt\n*L\n1#1,427:1\n1549#2:428\n1620#2,3:429\n1446#2,5:433\n1446#2,5:438\n1#3:432\n206#4,5:443\n*S KotlinDebug\n*F\n+ 1 DeserializedClassDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor$DeserializedClassMemberScope\n*L\n272#1:428\n272#1:429,3\n352#1:433,5\n358#1:438,5\n364#1:443,5\n*E\n"})
    private final class a extends kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i {

        /* renamed from: g, reason: collision with root package name */
        @fg.l
        private final kotlin.reflect.jvm.internal.impl.types.checker.g f78092g;

        /* renamed from: h, reason: collision with root package name */
        @fg.l
        private final kotlin.reflect.jvm.internal.impl.storage.i<Collection<kotlin.reflect.jvm.internal.impl.descriptors.m>> f78093h;

        /* renamed from: i, reason: collision with root package name */
        @fg.l
        private final kotlin.reflect.jvm.internal.impl.storage.i<Collection<h0>> f78094i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ e f78095j;

        /* compiled from: DeserializedClassDescriptor.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e$a$a, reason: collision with other inner class name */
        static final class C1182a extends n0 implements ld.a<List<? extends kotlin.reflect.jvm.internal.impl.name.f>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ List<kotlin.reflect.jvm.internal.impl.name.f> f78096b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1182a(List<kotlin.reflect.jvm.internal.impl.name.f> list) {
                super(0);
                this.f78096b = list;
            }

            @fg.l
            public final List<kotlin.reflect.jvm.internal.impl.name.f> a() {
                return this.f78096b;
            }

            @Override // ld.a
            public List<? extends kotlin.reflect.jvm.internal.impl.name.f> invoke() {
                return this.f78096b;
            }
        }

        /* compiled from: DeserializedClassDescriptor.kt */
        static final class b extends n0 implements ld.a<Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.m>> {
            b() {
                super(0);
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> invoke() {
                return a.this.k(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f77973o, kotlin.reflect.jvm.internal.impl.resolve.scopes.h.f77998a.a(), ud.d.WHEN_GET_ALL_DESCRIPTORS);
            }
        }

        /* compiled from: DeserializedClassDescriptor.kt */
        public static final class c extends kotlin.reflect.jvm.internal.impl.resolve.j {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<D> f78098a;

            c(List<D> list) {
                this.f78098a = list;
            }

            @Override // kotlin.reflect.jvm.internal.impl.resolve.k
            public void a(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
                l0.p(bVar, ProtectedSandApp.s("策\u0001"));
                kotlin.reflect.jvm.internal.impl.resolve.l.K(bVar, null);
                this.f78098a.add(bVar);
            }

            @Override // kotlin.reflect.jvm.internal.impl.resolve.j
            protected void e(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar2) {
                l0.p(bVar, ProtectedSandApp.s("筗\u0001"));
                l0.p(bVar2, ProtectedSandApp.s("筘\u0001"));
                if (bVar2 instanceof p) {
                    ((p) bVar2).V0(v.f76303a, bVar);
                }
            }
        }

        /* compiled from: DeserializedClassDescriptor.kt */
        static final class d extends n0 implements ld.a<Collection<? extends h0>> {
            d() {
                super(0);
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection<h0> invoke() {
                return a.this.f78092g.g(a.this.f78095j);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(@fg.l kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e r8, kotlin.reflect.jvm.internal.impl.types.checker.g r9) {
            /*
                r7 = this;
                java.lang.String r0 = "筨\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.p(r9, r0)
                r7.f78095j = r8
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r2 = r8.a1()
                kotlin.reflect.jvm.internal.impl.metadata.a$c r0 = r8.b1()
                java.util.List r3 = r0.J0()
                java.lang.String r0 = "筩\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.o(r3, r0)
                kotlin.reflect.jvm.internal.impl.metadata.a$c r0 = r8.b1()
                java.util.List r4 = r0.X0()
                java.lang.String r0 = "筪\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.o(r4, r0)
                kotlin.reflect.jvm.internal.impl.metadata.a$c r0 = r8.b1()
                java.util.List r5 = r0.f1()
                java.lang.String r0 = "筫\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.o(r5, r0)
                kotlin.reflect.jvm.internal.impl.metadata.a$c r0 = r8.b1()
                java.util.List r0 = r0.U0()
                java.lang.String r1 = "筬\u0001"
                java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
                kotlin.jvm.internal.l0.o(r0, r1)
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r8 = r8.a1()
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r8 = r8.g()
                java.util.ArrayList r1 = new java.util.ArrayList
                r6 = 10
                int r6 = kotlin.collections.w.b0(r0, r6)
                r1.<init>(r6)
                java.util.Iterator r0 = r0.iterator()
            L6c:
                boolean r6 = r0.hasNext()
                if (r6 == 0) goto L84
                java.lang.Object r6 = r0.next()
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                kotlin.reflect.jvm.internal.impl.name.f r6 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.z.b(r8, r6)
                r1.add(r6)
                goto L6c
            L84:
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e$a$a r6 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e$a$a
                r6.<init>(r1)
                r1 = r7
                r1.<init>(r2, r3, r4, r5, r6)
                r7.f78092g = r9
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r8 = r7.q()
                kotlin.reflect.jvm.internal.impl.storage.n r8 = r8.h()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e$a$b r9 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e$a$b
                r9.<init>()
                kotlin.reflect.jvm.internal.impl.storage.i r8 = r8.h(r9)
                r7.f78093h = r8
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r8 = r7.q()
                kotlin.reflect.jvm.internal.impl.storage.n r8 = r8.h()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e$a$d r9 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e$a$d
                r9.<init>()
                kotlin.reflect.jvm.internal.impl.storage.i r8 = r8.h(r9)
                r7.f78094i = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e.a.<init>(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e, kotlin.reflect.jvm.internal.impl.types.checker.g):void");
        }

        private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.b> void B(kotlin.reflect.jvm.internal.impl.name.f fVar, Collection<? extends D> collection, List<D> list) {
            q().c().n().a().v(fVar, collection, new ArrayList(list), this.f78095j, new c(list));
        }

        private final e C() {
            return this.f78095j;
        }

        public static final e z(a aVar) {
            return aVar.f78095j;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
        @fg.l
        public Collection<z0> a(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
            l0.p(fVar, ProtectedSandApp.s("筭\u0001"));
            l0.p(bVar, ProtectedSandApp.s("筮\u0001"));
            e(fVar, bVar);
            return super.a(fVar, bVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
        @fg.l
        public Collection<u0> b(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
            l0.p(fVar, ProtectedSandApp.s("筭\u0001"));
            l0.p(bVar, ProtectedSandApp.s("筮\u0001"));
            e(fVar, bVar);
            return super.b(fVar, bVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
        public void e(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
            l0.p(fVar, ProtectedSandApp.s("筭\u0001"));
            l0.p(bVar, ProtectedSandApp.s("筮\u0001"));
            td.a.a(q().c().p(), bVar, this.f78095j, fVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
        @fg.m
        public kotlin.reflect.jvm.internal.impl.descriptors.h f(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
            kotlin.reflect.jvm.internal.impl.descriptors.e f4;
            l0.p(fVar, ProtectedSandApp.s("筭\u0001"));
            l0.p(bVar, ProtectedSandApp.s("筮\u0001"));
            e(fVar, bVar);
            c cVar = this.f78095j.f78084s;
            return (cVar == null || (f4 = cVar.f(fVar)) == null) ? super.f(fVar, bVar) : f4;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
        @fg.l
        public Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g(@fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
            l0.p(dVar, ProtectedSandApp.s("筯\u0001"));
            l0.p(lVar, ProtectedSandApp.s("筰\u0001"));
            return this.f78093h.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i
        protected void j(@fg.l Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> collection, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
            l0.p(collection, ProtectedSandApp.s("筱\u0001"));
            l0.p(lVar, ProtectedSandApp.s("筰\u0001"));
            c cVar = this.f78095j.f78084s;
            Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> d5 = cVar != null ? cVar.d() : null;
            if (d5 == null) {
                d5 = j0.f74919b;
            }
            collection.addAll(d5);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i
        protected void l(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l List<z0> list) {
            l0.p(fVar, ProtectedSandApp.s("筭\u0001"));
            l0.p(list, ProtectedSandApp.s("筲\u0001"));
            ArrayList arrayList = new ArrayList();
            Iterator<h0> it = this.f78094i.invoke().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().q().a(fVar, ud.d.FOR_ALREADY_TRACKED));
            }
            list.addAll(q().c().c().a(fVar, this.f78095j));
            B(fVar, arrayList, list);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i
        protected void m(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l List<u0> list) {
            l0.p(fVar, ProtectedSandApp.s("筭\u0001"));
            l0.p(list, ProtectedSandApp.s("筳\u0001"));
            ArrayList arrayList = new ArrayList();
            Iterator<h0> it = this.f78094i.invoke().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().q().b(fVar, ud.d.FOR_ALREADY_TRACKED));
            }
            B(fVar, arrayList, list);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i
        @fg.l
        protected kotlin.reflect.jvm.internal.impl.name.b n(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("筭\u0001"));
            kotlin.reflect.jvm.internal.impl.name.b d5 = this.f78095j.f78076k.d(fVar);
            l0.o(d5, ProtectedSandApp.s("筴\u0001"));
            return d5;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i
        @fg.m
        protected Set<kotlin.reflect.jvm.internal.impl.name.f> t() {
            List<h0> j4 = this.f78095j.f78082q.j();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = j4.iterator();
            while (it.hasNext()) {
                Set<kotlin.reflect.jvm.internal.impl.name.f> h4 = ((h0) it.next()).q().h();
                if (h4 == null) {
                    return null;
                }
                kotlin.collections.w.q0(linkedHashSet, h4);
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i
        @fg.l
        protected Set<kotlin.reflect.jvm.internal.impl.name.f> u() {
            List<h0> j4 = this.f78095j.f78082q.j();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = j4.iterator();
            while (it.hasNext()) {
                kotlin.collections.w.q0(linkedHashSet, ((h0) it.next()).q().c());
            }
            linkedHashSet.addAll(q().c().c().e(this.f78095j));
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i
        @fg.l
        protected Set<kotlin.reflect.jvm.internal.impl.name.f> v() {
            List<h0> j4 = this.f78095j.f78082q.j();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = j4.iterator();
            while (it.hasNext()) {
                kotlin.collections.w.q0(linkedHashSet, ((h0) it.next()).q().d());
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i
        protected boolean y(@fg.l z0 z0Var) {
            l0.p(z0Var, ProtectedSandApp.s("筵\u0001"));
            return q().c().t().b(this.f78095j, z0Var);
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    @r1({"SMAP\nDeserializedClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedClassDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor$DeserializedClassTypeConstructor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,427:1\n1549#2:428\n1620#2,3:429\n1603#2,9:432\n1855#2:441\n1856#2:443\n1612#2:444\n1549#2:445\n1620#2,3:446\n1#3:442\n*S KotlinDebug\n*F\n+ 1 DeserializedClassDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor$DeserializedClassTypeConstructor\n*L\n239#1:428\n239#1:429,3\n243#1:432,9\n243#1:441\n243#1:443\n243#1:444\n250#1:445\n250#1:446,3\n243#1:442\n*E\n"})
    private final class b extends kotlin.reflect.jvm.internal.impl.types.b {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        private final kotlin.reflect.jvm.internal.impl.storage.i<List<f1>> f78100d;

        /* compiled from: DeserializedClassDescriptor.kt */
        static final class a extends n0 implements ld.a<List<? extends f1>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f78102b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar) {
                super(0);
                this.f78102b = eVar;
            }

            @fg.l
            public final List<f1> a() {
                return g1.d(this.f78102b);
            }

            @Override // ld.a
            public List<? extends f1> invoke() {
                return g1.d(this.f78102b);
            }
        }

        public b() {
            super(e.this.a1().h());
            this.f78100d = e.this.a1().h().h(new a(e.this));
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.b, kotlin.reflect.jvm.internal.impl.types.n, kotlin.reflect.jvm.internal.impl.types.h1
        public kotlin.reflect.jvm.internal.impl.descriptors.h c() {
            return e.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        public boolean d() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        @fg.l
        public List<f1> getParameters() {
            return this.f78100d.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h
        @fg.l
        protected Collection<h0> k() {
            String b5;
            kotlin.reflect.jvm.internal.impl.name.c b6;
            List<a.q> o4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.o(e.this.b1(), e.this.a1().j());
            e eVar = e.this;
            ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(o4, 10));
            Iterator<T> it = o4.iterator();
            while (it.hasNext()) {
                arrayList.add(eVar.a1().i().q((a.q) it.next()));
            }
            List D4 = kotlin.collections.w.D4(arrayList, e.this.a1().c().c().d(e.this));
            ArrayList<k0.b> arrayList2 = new ArrayList();
            Iterator it2 = D4.iterator();
            while (it2.hasNext()) {
                kotlin.reflect.jvm.internal.impl.descriptors.h c5 = ((h0) it2.next()).O0().c();
                k0.b bVar = c5 instanceof k0.b ? (k0.b) c5 : null;
                if (bVar != null) {
                    arrayList2.add(bVar);
                }
            }
            if (!arrayList2.isEmpty()) {
                r j4 = e.this.a1().c().j();
                e eVar2 = e.this;
                ArrayList arrayList3 = new ArrayList(kotlin.collections.w.b0(arrayList2, 10));
                for (k0.b bVar2 : arrayList2) {
                    kotlin.reflect.jvm.internal.impl.name.b k4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.k(bVar2);
                    if (k4 == null || (b6 = k4.b()) == null || (b5 = b6.b()) == null) {
                        b5 = bVar2.getName().b();
                    }
                    arrayList3.add(b5);
                }
                j4.b(eVar2, arrayList3);
            }
            return kotlin.collections.w.V5(D4);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h
        @fg.l
        protected d1 o() {
            return d1.a.f75932a;
        }

        @fg.l
        public String toString() {
            String fVar = e.this.getName().toString();
            l0.o(fVar, ProtectedSandApp.s("筶\u0001"));
            return fVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.b
        /* renamed from: v */
        public kotlin.reflect.jvm.internal.impl.descriptors.e c() {
            return e.this;
        }

        @fg.l
        public e w() {
            return e.this;
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    @r1({"SMAP\nDeserializedClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedClassDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor$EnumEntryClassDescriptors\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,427:1\n1194#2,2:428\n1222#2,4:430\n1620#2,3:434\n1620#2,3:437\n1603#2,9:440\n1855#2:449\n1856#2:451\n1612#2:452\n1#3:450\n*S KotlinDebug\n*F\n+ 1 DeserializedClassDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor$EnumEntryClassDescriptors\n*L\n387#1:428,2\n387#1:430,4\n419#1:434,3\n420#1:437,3\n424#1:440,9\n424#1:449\n424#1:451\n424#1:452\n424#1:450\n*E\n"})
    private final class c {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        private final Map<kotlin.reflect.jvm.internal.impl.name.f, a.g> f78103a;

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        private final kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.descriptors.e> f78104b;

        /* renamed from: c, reason: collision with root package name */
        @fg.l
        private final kotlin.reflect.jvm.internal.impl.storage.i<Set<kotlin.reflect.jvm.internal.impl.name.f>> f78105c;

        /* compiled from: DeserializedClassDescriptor.kt */
        static final class a extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.descriptors.e> {

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ e f78108c;

            /* compiled from: DeserializedClassDescriptor.kt */
            /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e$c$a$a, reason: collision with other inner class name */
            static final class C1183a extends n0 implements ld.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ e f78109b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ a.g f78110c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1183a(e eVar, a.g gVar) {
                    super(0);
                    this.f78109b = eVar;
                    this.f78110c = gVar;
                }

                @Override // ld.a
                @fg.l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> invoke() {
                    return kotlin.collections.w.V5(this.f78109b.a1().c().d().d(this.f78109b.f1(), this.f78110c));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar) {
                super(1);
                this.f78108c = eVar;
            }

            @Override // ld.l
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.descriptors.e invoke(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
                l0.p(fVar, ProtectedSandApp.s("筷\u0001"));
                a.g gVar = (a.g) c.this.f78103a.get(fVar);
                if (gVar == null) {
                    return null;
                }
                e eVar = this.f78108c;
                return kotlin.reflect.jvm.internal.impl.descriptors.impl.n.M0(eVar.a1().h(), eVar, fVar, c.this.f78105c, new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b(eVar.a1().h(), new C1183a(eVar, gVar)), a1.f75900a);
            }
        }

        /* compiled from: DeserializedClassDescriptor.kt */
        static final class b extends n0 implements ld.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>> {
            b() {
                super(0);
            }

            @fg.l
            public final Set<kotlin.reflect.jvm.internal.impl.name.f> a() {
                return c.this.e();
            }

            @Override // ld.a
            public Set<? extends kotlin.reflect.jvm.internal.impl.name.f> invoke() {
                return c.this.e();
            }
        }

        public c() {
            List<a.g> E0 = e.this.b1().E0();
            l0.o(E0, ProtectedSandApp.s("筸\u0001"));
            List<a.g> list = E0;
            int j4 = kotlin.collections.z0.j(kotlin.collections.w.b0(list, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(j4 < 16 ? 16 : j4);
            for (Object obj : list) {
                linkedHashMap.put(z.b(e.this.a1().g(), ((a.g) obj).G()), obj);
            }
            this.f78103a = linkedHashMap;
            this.f78104b = e.this.a1().h().b(new a(e.this));
            this.f78105c = e.this.a1().h().h(new b());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Set<kotlin.reflect.jvm.internal.impl.name.f> e() {
            HashSet hashSet = new HashSet();
            Iterator<h0> it = e.this.j().j().iterator();
            while (it.hasNext()) {
                for (kotlin.reflect.jvm.internal.impl.descriptors.m mVar : k.a.a(it.next().q(), null, null, 3, null)) {
                    if ((mVar instanceof z0) || (mVar instanceof u0)) {
                        hashSet.add(mVar.getName());
                    }
                }
            }
            List<a.i> J0 = e.this.b1().J0();
            l0.o(J0, ProtectedSandApp.s("筹\u0001"));
            e eVar = e.this;
            Iterator<T> it2 = J0.iterator();
            while (it2.hasNext()) {
                hashSet.add(z.b(eVar.a1().g(), ((a.i) it2.next()).e0()));
            }
            List<a.n> X0 = e.this.b1().X0();
            l0.o(X0, ProtectedSandApp.s("筺\u0001"));
            e eVar2 = e.this;
            Iterator<T> it3 = X0.iterator();
            while (it3.hasNext()) {
                hashSet.add(z.b(eVar2.a1().g(), ((a.n) it3.next()).d0()));
            }
            return l1.C(hashSet, hashSet);
        }

        @fg.l
        public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> d() {
            Set<kotlin.reflect.jvm.internal.impl.name.f> keySet = this.f78103a.keySet();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                kotlin.reflect.jvm.internal.impl.descriptors.e f4 = f((kotlin.reflect.jvm.internal.impl.name.f) it.next());
                if (f4 != null) {
                    arrayList.add(f4);
                }
            }
            return arrayList;
        }

        @fg.m
        public final kotlin.reflect.jvm.internal.impl.descriptors.e f(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("筻\u0001"));
            return this.f78104b.invoke(fVar);
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    static final class d extends n0 implements ld.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> {
        d() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> invoke() {
            return kotlin.collections.w.V5(e.this.a1().c().d().b(e.this.f1()));
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e$e, reason: collision with other inner class name */
    static final class C1184e extends n0 implements ld.a<kotlin.reflect.jvm.internal.impl.descriptors.e> {
        C1184e() {
            super(0);
        }

        @fg.m
        public final kotlin.reflect.jvm.internal.impl.descriptors.e a() {
            return e.this.U0();
        }

        @Override // ld.a
        public kotlin.reflect.jvm.internal.impl.descriptors.e invoke() {
            return e.this.U0();
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* synthetic */ class f extends g0 implements ld.l<a.q, p0> {
        f(Object obj) {
            super(1, obj);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public final p0 invoke(@fg.l a.q qVar) {
            l0.p(qVar, ProtectedSandApp.s("筼\u0001"));
            return f0.n((f0) this.receiver, qVar, false, 2, null);
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.c
        @fg.l
        public final String getName() {
            return ProtectedSandApp.s("筽\u0001");
        }

        @Override // kotlin.jvm.internal.q
        @fg.l
        public final kotlin.reflect.h getOwner() {
            return kotlin.jvm.internal.l1.d(l0.a.class);
        }

        @Override // kotlin.jvm.internal.q
        @fg.l
        public final String getSignature() {
            return ProtectedSandApp.s("签\u0001");
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* synthetic */ class g extends g0 implements ld.l<kotlin.reflect.jvm.internal.impl.name.f, p0> {
        g(Object obj) {
            super(1, obj);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public final p0 invoke(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("筿\u0001"));
            return ((e) this.receiver).g1(fVar);
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.c
        @fg.l
        public final String getName() {
            return ProtectedSandApp.s("简\u0001");
        }

        @Override // kotlin.jvm.internal.q
        @fg.l
        public final kotlin.reflect.h getOwner() {
            return kotlin.jvm.internal.l1.d(e.class);
        }

        @Override // kotlin.jvm.internal.q
        @fg.l
        public final String getSignature() {
            return ProtectedSandApp.s("箁\u0001");
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    static final class h extends n0 implements ld.a<Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.d>> {
        h() {
            super(0);
        }

        @fg.l
        public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> a() {
            return e.this.V0();
        }

        @Override // ld.a
        public Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.d> invoke() {
            return e.this.V0();
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* synthetic */ class i extends g0 implements ld.l<kotlin.reflect.jvm.internal.impl.types.checker.g, a> {
        i(Object obj) {
            super(1, obj);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public final a invoke(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            l0.p(gVar, ProtectedSandApp.s("箂\u0001"));
            return new a((e) this.receiver, gVar);
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.c
        @fg.l
        public final String getName() {
            return ProtectedSandApp.s("箃\u0001");
        }

        @Override // kotlin.jvm.internal.q
        @fg.l
        public final kotlin.reflect.h getOwner() {
            return kotlin.jvm.internal.l1.d(a.class);
        }

        @Override // kotlin.jvm.internal.q
        @fg.l
        public final String getSignature() {
            return ProtectedSandApp.s("箄\u0001");
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    static final class j extends n0 implements ld.a<kotlin.reflect.jvm.internal.impl.descriptors.d> {
        j() {
            super(0);
        }

        @fg.m
        public final kotlin.reflect.jvm.internal.impl.descriptors.d a() {
            return e.this.W0();
        }

        @Override // ld.a
        public kotlin.reflect.jvm.internal.impl.descriptors.d invoke() {
            return e.this.W0();
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    static final class k extends n0 implements ld.a<Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.e>> {
        k() {
            super(0);
        }

        @fg.l
        public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> a() {
            return e.this.Y0();
        }

        @Override // ld.a
        public Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.e> invoke() {
            return e.this.Y0();
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    static final class l extends n0 implements ld.a<h1<p0>> {
        l() {
            super(0);
        }

        @fg.m
        public final h1<p0> a() {
            return e.this.Z0();
        }

        @Override // ld.a
        public h1<p0> invoke() {
            return e.this.Z0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@fg.l kotlin.reflect.jvm.internal.impl.serialization.deserialization.m mVar, @fg.l a.c cVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar2, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.a aVar, @fg.l a1 a1Var) {
        super(mVar.h(), z.a(cVar2, cVar.G0()).j());
        kotlin.reflect.jvm.internal.impl.resolve.scopes.i iVar;
        l0.p(mVar, ProtectedSandApp.s("箅\u0001"));
        l0.p(cVar, ProtectedSandApp.s("箆\u0001"));
        l0.p(cVar2, ProtectedSandApp.s("箇\u0001"));
        l0.p(aVar, ProtectedSandApp.s("箈\u0001"));
        l0.p(a1Var, ProtectedSandApp.s("箉\u0001"));
        this.f78073h = cVar;
        this.f78074i = aVar;
        this.f78075j = a1Var;
        this.f78076k = z.a(cVar2, cVar.G0());
        c0 c0Var = c0.f78056a;
        this.f78077l = c0Var.b(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77415e.d(cVar.F0()));
        this.f78078m = d0.a(c0Var, kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77414d.d(cVar.F0()));
        kotlin.reflect.jvm.internal.impl.descriptors.f a5 = c0Var.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77416f.d(cVar.F0()));
        this.f78079n = a5;
        List<a.s> i12 = cVar.i1();
        l0.o(i12, ProtectedSandApp.s("箊\u0001"));
        a.t j12 = cVar.j1();
        l0.o(j12, ProtectedSandApp.s("箋\u0001"));
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.g(j12);
        h.a aVar2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.h.f77444b;
        a.w l12 = cVar.l1();
        l0.o(l12, ProtectedSandApp.s("箌\u0001"));
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.m a6 = mVar.a(this, i12, cVar2, gVar, aVar2.a(l12), aVar);
        this.f78080o = a6;
        kotlin.reflect.jvm.internal.impl.descriptors.f fVar = kotlin.reflect.jvm.internal.impl.descriptors.f.ENUM_CLASS;
        if (a5 == fVar) {
            Boolean d5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77423m.d(cVar.F0());
            l0.o(d5, ProtectedSandApp.s("箍\u0001"));
            iVar = new kotlin.reflect.jvm.internal.impl.resolve.scopes.l(a6.h(), this, d5.booleanValue() || l0.g(a6.c().i().a(), Boolean.TRUE));
        } else {
            iVar = h.c.f78002b;
        }
        this.f78081p = iVar;
        this.f78082q = new b();
        this.f78083r = y0.f76306e.a(this, a6.h(), a6.c().n().c(), new i(1, this));
        this.f78084s = a5 == fVar ? new c() : null;
        kotlin.reflect.jvm.internal.impl.descriptors.m e4 = mVar.e();
        this.f78085t = e4;
        this.f78086u = a6.h().i(new j());
        this.f78087v = a6.h().h(new h());
        this.f78088w = a6.h().i(new C1184e());
        this.f78089x = a6.h().h(new k());
        this.f78090y = a6.h().i(new l());
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.c g4 = a6.g();
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.g j4 = a6.j();
        e eVar = e4 instanceof e ? (e) e4 : null;
        this.f78091z = new b0.a(cVar, g4, j4, a1Var, eVar != null ? eVar.f78091z : null);
        this.A = !kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77413c.d(cVar.F0()).booleanValue() ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b() : new o(a6.h(), new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.e U0() {
        if (!this.f78073h.m1()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h f4 = c1().f(z.b(this.f78080o.g(), this.f78073h.s0()), ud.d.FROM_DESERIALIZATION);
        if (f4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.e) f4;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> V0() {
        return kotlin.collections.w.D4(kotlin.collections.w.D4(X0(), kotlin.collections.w.P(H())), this.f78080o.c().c().c(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.d W0() {
        Object obj;
        if (this.f78079n.isSingleton()) {
            kotlin.reflect.jvm.internal.impl.descriptors.impl.f l4 = kotlin.reflect.jvm.internal.impl.resolve.e.l(this, a1.f75900a);
            l4.h1(r());
            return l4;
        }
        List<a.d> v02 = this.f78073h.v0();
        l0.o(v02, ProtectedSandApp.s("箎\u0001"));
        Iterator<T> it = v02.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77424n.d(((a.d) obj).K()).booleanValue()) {
                break;
            }
        }
        a.d dVar = (a.d) obj;
        if (dVar != null) {
            return this.f78080o.f().i(dVar, true);
        }
        return null;
    }

    private final List<kotlin.reflect.jvm.internal.impl.descriptors.d> X0() {
        List<a.d> v02 = this.f78073h.v0();
        l0.o(v02, ProtectedSandApp.s("箎\u0001"));
        ArrayList<a.d> arrayList = new ArrayList();
        for (Object obj : v02) {
            Boolean d5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77424n.d(((a.d) obj).K());
            l0.o(d5, ProtectedSandApp.s("箍\u0001"));
            if (d5.booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.w.b0(arrayList, 10));
        for (a.d dVar : arrayList) {
            y f4 = this.f78080o.f();
            l0.m(dVar);
            arrayList2.add(f4.i(dVar, false));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> Y0() {
        if (this.f78077l != e0.SEALED) {
            return j0.f74919b;
        }
        List<Integer> Y0 = this.f78073h.Y0();
        l0.m(Y0);
        if (Y0.isEmpty()) {
            return kotlin.reflect.jvm.internal.impl.resolve.a.f77859a.a(this, false);
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : Y0) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.k c5 = this.f78080o.c();
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c g4 = this.f78080o.g();
            l0.m(num);
            kotlin.reflect.jvm.internal.impl.descriptors.e b5 = c5.b(z.a(g4, num.intValue()));
            if (b5 != null) {
                arrayList.add(b5);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h1<p0> Z0() {
        if (!k() && !w()) {
            return null;
        }
        h1<p0> a5 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.h0.a(this.f78073h, this.f78080o.g(), this.f78080o.j(), new f(1, this.f78080o.i()), new g(1, this));
        if (a5 != null) {
            return a5;
        }
        if (this.f78074i.c(1, 5, 1)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.d H = H();
        if (H == null) {
            throw new IllegalStateException((ProtectedSandApp.s("箒\u0001") + this).toString());
        }
        List<j1> i4 = H.i();
        l0.o(i4, ProtectedSandApp.s("箏\u0001"));
        kotlin.reflect.jvm.internal.impl.name.f name = ((j1) kotlin.collections.w.B2(i4)).getName();
        l0.o(name, ProtectedSandApp.s("箐\u0001"));
        p0 g12 = g1(name);
        if (g12 != null) {
            return new a0(name, g12);
        }
        throw new IllegalStateException((ProtectedSandApp.s("箑\u0001") + this).toString());
    }

    private final a c1() {
        return this.f78083r.c(this.f78080o.c().n().c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002d, code lost:
    
        if (r1 == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.types.p0 g1(kotlin.reflect.jvm.internal.impl.name.f r6) {
        /*
            r5 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e$a r0 = r5.c1()
            ud.d r1 = ud.d.FROM_DESERIALIZATION
            java.util.Collection r6 = r0.b(r6, r1)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
            r0 = 0
            r1 = 0
            r2 = r0
        L13:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r6.next()
            r4 = r3
            kotlin.reflect.jvm.internal.impl.descriptors.u0 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.u0) r4
            kotlin.reflect.jvm.internal.impl.descriptors.x0 r4 = r4.S()
            if (r4 != 0) goto L13
            if (r1 == 0) goto L2a
        L28:
            r2 = r0
            goto L30
        L2a:
            r1 = 1
            r2 = r3
            goto L13
        L2d:
            if (r1 != 0) goto L30
            goto L28
        L30:
            kotlin.reflect.jvm.internal.impl.descriptors.u0 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.u0) r2
            if (r2 == 0) goto L38
            kotlin.reflect.jvm.internal.impl.types.h0 r0 = r2.getType()
        L38:
            kotlin.reflect.jvm.internal.impl.types.p0 r0 = (kotlin.reflect.jvm.internal.impl.types.p0) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e.g1(kotlin.reflect.jvm.internal.impl.name.f):kotlin.reflect.jvm.internal.impl.types.p0");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean C() {
        Boolean d5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77418h.d(this.f78073h.F0());
        l0.o(d5, ProtectedSandApp.s("箍\u0001"));
        return d5.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.m
    public kotlin.reflect.jvm.internal.impl.descriptors.d H() {
        return this.f78086u.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.m
    public h1<p0> X() {
        return this.f78090y.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean a0() {
        return false;
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.m a1() {
        return this.f78080o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.f b() {
        return this.f78079n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.a, kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.l
    public List<x0> b0() {
        List<a.q> b5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.b(this.f78073h, this.f78080o.j());
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(b5, 10));
        Iterator<T> it = b5.iterator();
        while (it.hasNext()) {
            arrayList.add(new kotlin.reflect.jvm.internal.impl.descriptors.impl.f0(K0(), new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.b(this, this.f78080o.i().q((a.q) it.next()), null, null), kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b()));
        }
        return arrayList;
    }

    @fg.l
    public final a.c b1() {
        return this.f78073h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.n, kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.m c() {
        return this.f78085t;
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a d1() {
        return this.f78074i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean e0() {
        return kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77416f.d(this.f78073h.F0()) == a.c.EnumC1120c.COMPANION_OBJECT;
    }

    @fg.l
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.i e1() {
        return this.f78081p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p
    @fg.l
    public a1 f() {
        return this.f78075j;
    }

    @fg.l
    public final b0.a f1() {
        return this.f78091z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return this.A;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.q, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @fg.l
    public u getVisibility() {
        return this.f78078m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.l
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> h() {
        return this.f78087v.invoke();
    }

    public final boolean h1(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(fVar, ProtectedSandApp.s("箓\u0001"));
        return c1().r().contains(fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h
    @fg.l
    public kotlin.reflect.jvm.internal.impl.types.h1 j() {
        return this.f78082q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean k() {
        Boolean d5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77421k.d(this.f78073h.F0());
        l0.o(d5, ProtectedSandApp.s("箍\u0001"));
        return d5.booleanValue() && this.f78074i.e(1, 4, 1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.t
    @fg.l
    protected kotlin.reflect.jvm.internal.impl.resolve.scopes.h l0(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("箔\u0001"));
        return this.f78083r.c(gVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.l
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> m() {
        return this.f78089x.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean m0() {
        Boolean d5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77420j.d(this.f78073h.F0());
        l0.o(d5, ProtectedSandApp.s("箍\u0001"));
        return d5.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i
    public boolean n() {
        Boolean d5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77417g.d(this.f78073h.F0());
        l0.o(d5, ProtectedSandApp.s("箍\u0001"));
        return d5.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h o0() {
        return this.f78081p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @fg.m
    public kotlin.reflect.jvm.internal.impl.descriptors.e p0() {
        return this.f78088w.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.i
    @fg.l
    public List<f1> s() {
        return this.f78080o.i().j();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean t() {
        Boolean d5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77419i.d(this.f78073h.F0());
        l0.o(d5, ProtectedSandApp.s("箍\u0001"));
        return d5.booleanValue();
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("箕\u0001"));
        sb.append(m0() ? ProtectedSandApp.s("箖\u0001") : "");
        sb.append(ProtectedSandApp.s("算\u0001"));
        sb.append(getName());
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.d0
    @fg.l
    public e0 u() {
        return this.f78077l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean v() {
        Boolean d5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77422l.d(this.f78073h.F0());
        l0.o(d5, ProtectedSandApp.s("箍\u0001"));
        return d5.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean w() {
        Boolean d5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f77421k.d(this.f78073h.F0());
        l0.o(d5, ProtectedSandApp.s("箍\u0001"));
        return d5.booleanValue() && this.f78074i.c(1, 4, 2);
    }
}
