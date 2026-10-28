package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.j0;
import kotlin.collections.w;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.protobuf.q;
import kotlin.reflect.jvm.internal.impl.resolve.i;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.d;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.z;

/* compiled from: DeserializedMemberScope.kt */
/* loaded from: classes7.dex */
public abstract class i extends kotlin.reflect.jvm.internal.impl.resolve.scopes.i {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.o<Object>[] f78118f = {l1.u(new g1(l1.d(i.class), ProtectedSandApp.s("筙\u0001"), ProtectedSandApp.s("筚\u0001"))), l1.u(new g1(l1.d(i.class), ProtectedSandApp.s("筛\u0001"), ProtectedSandApp.s("筜\u0001")))};

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.m f78119b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final a f78120c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.i f78121d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.j f78122e;

    /* compiled from: DeserializedMemberScope.kt */
    private interface a {
        @fg.l
        Collection<z0> a(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar);

        @fg.l
        Collection<u0> b(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar);

        @fg.l
        Set<kotlin.reflect.jvm.internal.impl.name.f> c();

        @fg.l
        Set<kotlin.reflect.jvm.internal.impl.name.f> d();

        @fg.l
        Set<kotlin.reflect.jvm.internal.impl.name.f> e();

        @fg.m
        e1 f(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar);

        void g(@fg.l Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> collection, @fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar, @fg.l ud.b bVar);
    }

    /* compiled from: DeserializedMemberScope.kt */
    @r1({"SMAP\nDeserializedMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,512:1\n502#1:513\n508#1:517\n508#1:532\n508#1:546\n492#1:572\n493#1,5:575\n492#1:580\n493#1,5:583\n1620#2,3:514\n1603#2,9:518\n1855#2:527\n1856#2:530\n1612#2:531\n1603#2,9:533\n1855#2:542\n1856#2:544\n1612#2:545\n1603#2,9:547\n1855#2:556\n1856#2:558\n1612#2:559\n1360#2:560\n1446#2,5:561\n1360#2:566\n1446#2,5:567\n857#2,2:573\n857#2,2:581\n857#2,2:588\n857#2,2:590\n857#2,2:592\n1620#2,3:594\n1603#2,9:597\n1855#2:606\n1856#2:608\n1612#2:609\n1#3:528\n1#3:529\n1#3:543\n1#3:557\n1#3:607\n*S KotlinDebug\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation\n*L\n429#1:513\n432#1:517\n435#1:532\n438#1:546\n447#1:572\n447#1:575,5\n450#1:580\n450#1:583,5\n429#1:514,3\n432#1:518,9\n432#1:527\n432#1:530\n432#1:531\n435#1:533,9\n435#1:542\n435#1:544\n435#1:545\n438#1:547,9\n438#1:556\n438#1:558\n438#1:559\n441#1:560\n441#1:561,5\n444#1:566\n444#1:567,5\n447#1:573,2\n450#1:581,2\n473#1:588,2\n477#1:590,2\n492#1:592,2\n502#1:594,3\n508#1:597,9\n508#1:606\n508#1:608\n508#1:609\n432#1:529\n435#1:543\n438#1:557\n508#1:607\n*E\n"})
    private final class b implements a {

        /* renamed from: o, reason: collision with root package name */
        static final /* synthetic */ kotlin.reflect.o<Object>[] f78123o = {l1.u(new g1(l1.d(b.class), ProtectedSandApp.s("箞\u0001"), ProtectedSandApp.s("箟\u0001"))), l1.u(new g1(l1.d(b.class), ProtectedSandApp.s("箠\u0001"), ProtectedSandApp.s("管\u0001"))), l1.u(new g1(l1.d(b.class), ProtectedSandApp.s("箢\u0001"), ProtectedSandApp.s("箣\u0001"))), l1.u(new g1(l1.d(b.class), ProtectedSandApp.s("箤\u0001"), ProtectedSandApp.s("箥\u0001"))), l1.u(new g1(l1.d(b.class), ProtectedSandApp.s("箦\u0001"), ProtectedSandApp.s("箧\u0001"))), l1.u(new g1(l1.d(b.class), ProtectedSandApp.s("箨\u0001"), ProtectedSandApp.s("箩\u0001"))), l1.u(new g1(l1.d(b.class), ProtectedSandApp.s("箪\u0001"), ProtectedSandApp.s("箫\u0001"))), l1.u(new g1(l1.d(b.class), ProtectedSandApp.s("箬\u0001"), ProtectedSandApp.s("箭\u0001"))), l1.u(new g1(l1.d(b.class), ProtectedSandApp.s("箮\u0001"), ProtectedSandApp.s("箯\u0001"))), l1.u(new g1(l1.d(b.class), ProtectedSandApp.s("箰\u0001"), ProtectedSandApp.s("箱\u0001")))};

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        private final List<a.i> f78124a;

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        private final List<a.n> f78125b;

        /* renamed from: c, reason: collision with root package name */
        @fg.l
        private final List<a.r> f78126c;

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        private final kotlin.reflect.jvm.internal.impl.storage.i f78127d;

        /* renamed from: e, reason: collision with root package name */
        @fg.l
        private final kotlin.reflect.jvm.internal.impl.storage.i f78128e;

        /* renamed from: f, reason: collision with root package name */
        @fg.l
        private final kotlin.reflect.jvm.internal.impl.storage.i f78129f;

        /* renamed from: g, reason: collision with root package name */
        @fg.l
        private final kotlin.reflect.jvm.internal.impl.storage.i f78130g;

        /* renamed from: h, reason: collision with root package name */
        @fg.l
        private final kotlin.reflect.jvm.internal.impl.storage.i f78131h;

        /* renamed from: i, reason: collision with root package name */
        @fg.l
        private final kotlin.reflect.jvm.internal.impl.storage.i f78132i;

        /* renamed from: j, reason: collision with root package name */
        @fg.l
        private final kotlin.reflect.jvm.internal.impl.storage.i f78133j;

        /* renamed from: k, reason: collision with root package name */
        @fg.l
        private final kotlin.reflect.jvm.internal.impl.storage.i f78134k;

        /* renamed from: l, reason: collision with root package name */
        @fg.l
        private final kotlin.reflect.jvm.internal.impl.storage.i f78135l;

        /* renamed from: m, reason: collision with root package name */
        @fg.l
        private final kotlin.reflect.jvm.internal.impl.storage.i f78136m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ i f78137n;

        /* compiled from: DeserializedMemberScope.kt */
        static final class a extends n0 implements ld.a<List<? extends z0>> {
            a() {
                super(0);
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<z0> invoke() {
                return w.D4(b.this.D(), b.this.t());
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i$b$b, reason: collision with other inner class name */
        static final class C1185b extends n0 implements ld.a<List<? extends u0>> {
            C1185b() {
                super(0);
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<u0> invoke() {
                return w.D4(b.this.E(), b.this.u());
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        static final class c extends n0 implements ld.a<List<? extends e1>> {
            c() {
                super(0);
            }

            @fg.l
            public final List<e1> a() {
                return b.this.z();
            }

            @Override // ld.a
            public List<? extends e1> invoke() {
                return b.this.z();
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        static final class d extends n0 implements ld.a<List<? extends z0>> {
            d() {
                super(0);
            }

            @fg.l
            public final List<z0> a() {
                return b.this.v();
            }

            @Override // ld.a
            public List<? extends z0> invoke() {
                return b.this.v();
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        static final class e extends n0 implements ld.a<List<? extends u0>> {
            e() {
                super(0);
            }

            @fg.l
            public final List<u0> a() {
                return b.this.y();
            }

            @Override // ld.a
            public List<? extends u0> invoke() {
                return b.this.y();
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        @r1({"SMAP\nDeserializedMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation$functionNames$2\n+ 2 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,512:1\n502#2:513\n1620#3,3:514\n*S KotlinDebug\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation$functionNames$2\n*L\n421#1:513\n421#1:514,3\n*E\n"})
        static final class f extends n0 implements ld.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>> {

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ i f78144c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(i iVar) {
                super(0);
                this.f78144c = iVar;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Set<kotlin.reflect.jvm.internal.impl.name.f> invoke() {
                b bVar = b.this;
                List list = bVar.f78124a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                i iVar = bVar.f78137n;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(z.b(iVar.q().g(), ((a.i) ((kotlin.reflect.jvm.internal.impl.protobuf.o) it.next())).e0()));
                }
                return kotlin.collections.l1.C(linkedHashSet, this.f78144c.u());
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        @r1({"SMAP\nDeserializedMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation$functionsByName$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,512:1\n1477#2:513\n1502#2,3:514\n1505#2,3:524\n372#3,7:517\n*S KotlinDebug\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation$functionsByName$2\n*L\n415#1:513\n415#1:514,3\n415#1:524,3\n415#1:517,7\n*E\n"})
        static final class g extends n0 implements ld.a<Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends List<? extends z0>>> {
            g() {
                super(0);
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Map<kotlin.reflect.jvm.internal.impl.name.f, List<z0>> invoke() {
                List A = b.this.A();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : A) {
                    kotlin.reflect.jvm.internal.impl.name.f name = ((z0) obj).getName();
                    l0.o(name, ProtectedSandApp.s("箛\u0001"));
                    Object obj2 = linkedHashMap.get(name);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(name, obj2);
                    }
                    ((List) obj2).add(obj);
                }
                return linkedHashMap;
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        @r1({"SMAP\nDeserializedMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation$propertiesByName$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,512:1\n1477#2:513\n1502#2,3:514\n1505#2,3:524\n372#3,7:517\n*S KotlinDebug\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation$propertiesByName$2\n*L\n418#1:513\n418#1:514,3\n418#1:524,3\n418#1:517,7\n*E\n"})
        static final class h extends n0 implements ld.a<Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends List<? extends u0>>> {
            h() {
                super(0);
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Map<kotlin.reflect.jvm.internal.impl.name.f, List<u0>> invoke() {
                List B = b.this.B();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : B) {
                    kotlin.reflect.jvm.internal.impl.name.f name = ((u0) obj).getName();
                    l0.o(name, ProtectedSandApp.s("箜\u0001"));
                    Object obj2 = linkedHashMap.get(name);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(name, obj2);
                    }
                    ((List) obj2).add(obj);
                }
                return linkedHashMap;
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        @r1({"SMAP\nDeserializedMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation$typeAliasesByName$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,512:1\n1194#2,2:513\n1222#2,4:515\n*S KotlinDebug\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation$typeAliasesByName$2\n*L\n412#1:513,2\n412#1:515,4\n*E\n"})
        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i$b$i, reason: collision with other inner class name */
        static final class C1186i extends n0 implements ld.a<Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends e1>> {
            C1186i() {
                super(0);
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Map<kotlin.reflect.jvm.internal.impl.name.f, e1> invoke() {
                List C = b.this.C();
                int j4 = kotlin.collections.z0.j(w.b0(C, 10));
                if (j4 < 16) {
                    j4 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(j4);
                for (Object obj : C) {
                    kotlin.reflect.jvm.internal.impl.name.f name = ((e1) obj).getName();
                    l0.o(name, ProtectedSandApp.s("箝\u0001"));
                    linkedHashMap.put(name, obj);
                }
                return linkedHashMap;
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        @r1({"SMAP\nDeserializedMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation$variableNames$2\n+ 2 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,512:1\n502#2:513\n1620#3,3:514\n*S KotlinDebug\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation$variableNames$2\n*L\n425#1:513\n425#1:514,3\n*E\n"})
        static final class j extends n0 implements ld.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>> {

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ i f78149c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(i iVar) {
                super(0);
                this.f78149c = iVar;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Set<kotlin.reflect.jvm.internal.impl.name.f> invoke() {
                b bVar = b.this;
                List list = bVar.f78125b;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                i iVar = bVar.f78137n;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(z.b(iVar.q().g(), ((a.n) ((kotlin.reflect.jvm.internal.impl.protobuf.o) it.next())).d0()));
                }
                return kotlin.collections.l1.C(linkedHashSet, this.f78149c.v());
            }
        }

        public b(@fg.l i iVar, @fg.l List<a.i> list, @fg.l List<a.n> list2, List<a.r> list3) {
            l0.p(list, ProtectedSandApp.s("箲\u0001"));
            l0.p(list2, ProtectedSandApp.s("箳\u0001"));
            l0.p(list3, ProtectedSandApp.s("箴\u0001"));
            this.f78137n = iVar;
            this.f78124a = list;
            this.f78125b = list2;
            this.f78126c = iVar.q().c().g().d() ? list3 : j0.f74919b;
            this.f78127d = iVar.q().h().h(new d());
            this.f78128e = iVar.q().h().h(new e());
            this.f78129f = iVar.q().h().h(new c());
            this.f78130g = iVar.q().h().h(new a());
            this.f78131h = iVar.q().h().h(new C1185b());
            this.f78132i = iVar.q().h().h(new C1186i());
            this.f78133j = iVar.q().h().h(new g());
            this.f78134k = iVar.q().h().h(new h());
            this.f78135l = iVar.q().h().h(new f(iVar));
            this.f78136m = iVar.q().h().h(new j(iVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<z0> A() {
            return (List) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f78130g, this, f78123o[3]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<u0> B() {
            return (List) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f78131h, this, f78123o[4]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<e1> C() {
            return (List) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f78129f, this, f78123o[2]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<z0> D() {
            return (List) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f78127d, this, f78123o[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<u0> E() {
            return (List) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f78128e, this, f78123o[1]);
        }

        private final Map<kotlin.reflect.jvm.internal.impl.name.f, Collection<z0>> F() {
            return (Map) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f78133j, this, f78123o[6]);
        }

        private final Map<kotlin.reflect.jvm.internal.impl.name.f, Collection<u0>> G() {
            return (Map) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f78134k, this, f78123o[7]);
        }

        private final Map<kotlin.reflect.jvm.internal.impl.name.f, e1> H() {
            return (Map) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f78132i, this, f78123o[5]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<z0> t() {
            Set<kotlin.reflect.jvm.internal.impl.name.f> u4 = this.f78137n.u();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = u4.iterator();
            while (it.hasNext()) {
                w.q0(arrayList, w((kotlin.reflect.jvm.internal.impl.name.f) it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<u0> u() {
            Set<kotlin.reflect.jvm.internal.impl.name.f> v4 = this.f78137n.v();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = v4.iterator();
            while (it.hasNext()) {
                w.q0(arrayList, x((kotlin.reflect.jvm.internal.impl.name.f) it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<z0> v() {
            List<a.i> list = this.f78124a;
            i iVar = this.f78137n;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                z0 j4 = iVar.q().f().j((a.i) ((kotlin.reflect.jvm.internal.impl.protobuf.o) it.next()));
                if (!iVar.y(j4)) {
                    j4 = null;
                }
                if (j4 != null) {
                    arrayList.add(j4);
                }
            }
            return arrayList;
        }

        private final List<z0> w(kotlin.reflect.jvm.internal.impl.name.f fVar) {
            List<z0> D = D();
            i iVar = this.f78137n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : D) {
                if (l0.g(((kotlin.reflect.jvm.internal.impl.descriptors.m) obj).getName(), fVar)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            iVar.l(fVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        private final List<u0> x(kotlin.reflect.jvm.internal.impl.name.f fVar) {
            List<u0> E = E();
            i iVar = this.f78137n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : E) {
                if (l0.g(((kotlin.reflect.jvm.internal.impl.descriptors.m) obj).getName(), fVar)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            iVar.m(fVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<u0> y() {
            List<a.n> list = this.f78125b;
            i iVar = this.f78137n;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                u0 l4 = iVar.q().f().l((a.n) ((kotlin.reflect.jvm.internal.impl.protobuf.o) it.next()));
                if (l4 != null) {
                    arrayList.add(l4);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<e1> z() {
            List<a.r> list = this.f78126c;
            i iVar = this.f78137n;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                e1 m4 = iVar.q().f().m((a.r) ((kotlin.reflect.jvm.internal.impl.protobuf.o) it.next()));
                if (m4 != null) {
                    arrayList.add(m4);
                }
            }
            return arrayList;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.a
        @fg.l
        public Collection<z0> a(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
            l0.p(fVar, ProtectedSandApp.s("箵\u0001"));
            l0.p(bVar, ProtectedSandApp.s("箶\u0001"));
            if (!c().contains(fVar)) {
                return j0.f74919b;
            }
            Collection<z0> collection = F().get(fVar);
            return collection == null ? j0.f74919b : collection;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.a
        @fg.l
        public Collection<u0> b(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
            l0.p(fVar, ProtectedSandApp.s("箵\u0001"));
            l0.p(bVar, ProtectedSandApp.s("箶\u0001"));
            if (!d().contains(fVar)) {
                return j0.f74919b;
            }
            Collection<u0> collection = G().get(fVar);
            return collection == null ? j0.f74919b : collection;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.a
        @fg.l
        public Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
            return (Set) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f78135l, this, f78123o[8]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.a
        @fg.l
        public Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
            return (Set) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f78136m, this, f78123o[9]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.a
        @fg.l
        public Set<kotlin.reflect.jvm.internal.impl.name.f> e() {
            List<a.r> list = this.f78126c;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            i iVar = this.f78137n;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(z.b(iVar.q().g(), ((a.r) ((kotlin.reflect.jvm.internal.impl.protobuf.o) it.next())).X()));
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.a
        @fg.m
        public e1 f(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("箵\u0001"));
            return H().get(fVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.a
        public void g(@fg.l Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> collection, @fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar, @fg.l ud.b bVar) {
            l0.p(collection, ProtectedSandApp.s("箷\u0001"));
            l0.p(dVar, ProtectedSandApp.s("箸\u0001"));
            l0.p(lVar, ProtectedSandApp.s("箹\u0001"));
            l0.p(bVar, ProtectedSandApp.s("箶\u0001"));
            kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f77961c.getClass();
            boolean a5 = dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f77968j);
            String s4 = ProtectedSandApp.s("箺\u0001");
            if (a5) {
                for (Object obj : B()) {
                    kotlin.reflect.jvm.internal.impl.name.f name = ((u0) obj).getName();
                    l0.o(name, s4);
                    if (lVar.invoke(name).booleanValue()) {
                        collection.add(obj);
                    }
                }
            }
            kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f77961c.getClass();
            if (dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f77967i)) {
                for (Object obj2 : A()) {
                    kotlin.reflect.jvm.internal.impl.name.f name2 = ((z0) obj2).getName();
                    l0.o(name2, s4);
                    if (lVar.invoke(name2).booleanValue()) {
                        collection.add(obj2);
                    }
                }
            }
        }
    }

    /* compiled from: DeserializedMemberScope.kt */
    @r1({"SMAP\nDeserializedMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$OptimizedImplementation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,512:1\n269#1:513\n269#1:528\n269#1:543\n287#1,17:581\n305#1,2:604\n296#1:606\n303#1:607\n305#1,2:613\n287#1,17:620\n305#1,2:642\n296#1:644\n370#1,11:645\n370#1,11:656\n1477#2:514\n1502#2,3:515\n1505#2,3:525\n1477#2:529\n1502#2,3:530\n1505#2,3:540\n1477#2:544\n1502#2,3:545\n1505#2,3:555\n1238#2,2:560\n1549#2:562\n1620#2,3:563\n1241#2:566\n1477#2:567\n1502#2,3:568\n1505#2,3:578\n1611#2:598\n1855#2:599\n1856#2:602\n1612#2:603\n1611#2:608\n1855#2:609\n1856#2:611\n1612#2:612\n1611#2:615\n1855#2:616\n1856#2:618\n1612#2:619\n1611#2:637\n1855#2:638\n1856#2:640\n1612#2:641\n372#3,7:518\n372#3,7:533\n372#3,7:548\n453#3:558\n403#3:559\n372#3,7:571\n1#4:600\n1#4:601\n1#4:610\n1#4:617\n1#4:639\n*S KotlinDebug\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$OptimizedImplementation\n*L\n233#1:513\n235#1:528\n239#1:543\n272#1:581,17\n272#1:604,2\n272#1:606\n287#1:607\n287#1:613,2\n310#1:620,17\n310#1:642,2\n310#1:644\n348#1:645,11\n356#1:656,11\n233#1:514\n233#1:515,3\n233#1:525,3\n235#1:529\n235#1:530,3\n235#1:540,3\n239#1:544\n239#1:545,3\n239#1:555,3\n244#1:560,2\n246#1:562\n246#1:563,3\n244#1:566\n269#1:567\n269#1:568,3\n269#1:578,3\n272#1:598\n272#1:599\n272#1:602\n272#1:603\n287#1:608\n287#1:609\n287#1:611\n287#1:612\n303#1:615\n303#1:616\n303#1:618\n303#1:619\n310#1:637\n310#1:638\n310#1:640\n310#1:641\n233#1:518,7\n235#1:533,7\n239#1:548,7\n244#1:558\n244#1:559\n269#1:571,7\n272#1:601\n287#1:610\n303#1:617\n310#1:639\n*E\n"})
    private final class c implements a {

        /* renamed from: j, reason: collision with root package name */
        static final /* synthetic */ kotlin.reflect.o<Object>[] f78150j = {l1.u(new g1(l1.d(c.class), ProtectedSandApp.s("箾\u0001"), ProtectedSandApp.s("箿\u0001"))), l1.u(new g1(l1.d(c.class), ProtectedSandApp.s("節\u0001"), ProtectedSandApp.s("篁\u0001")))};

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        private final Map<kotlin.reflect.jvm.internal.impl.name.f, byte[]> f78151a;

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        private final Map<kotlin.reflect.jvm.internal.impl.name.f, byte[]> f78152b;

        /* renamed from: c, reason: collision with root package name */
        @fg.l
        private final Map<kotlin.reflect.jvm.internal.impl.name.f, byte[]> f78153c;

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.f, Collection<z0>> f78154d;

        /* renamed from: e, reason: collision with root package name */
        @fg.l
        private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.f, Collection<u0>> f78155e;

        /* renamed from: f, reason: collision with root package name */
        @fg.l
        private final kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.f, e1> f78156f;

        /* renamed from: g, reason: collision with root package name */
        @fg.l
        private final kotlin.reflect.jvm.internal.impl.storage.i f78157g;

        /* renamed from: h, reason: collision with root package name */
        @fg.l
        private final kotlin.reflect.jvm.internal.impl.storage.i f78158h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ i f78159i;

        /* compiled from: DeserializedMemberScope.kt */
        @r1({"SMAP\nDeserializedMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1\n*L\n1#1,512:1\n*E\n"})
        static final class a extends n0 implements ld.a<Object> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ q<Object> f78160b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ByteArrayInputStream f78161c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ i f78162d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(q<Object> qVar, ByteArrayInputStream byteArrayInputStream, i iVar) {
                super(0);
                this.f78160b = qVar;
                this.f78161c = byteArrayInputStream;
                this.f78162d = iVar;
            }

            @Override // ld.a
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke() {
                return (kotlin.reflect.jvm.internal.impl.protobuf.o) this.f78160b.d(this.f78161c, this.f78162d.q().c().k());
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        static final class b extends n0 implements ld.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>> {

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ i f78164c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(i iVar) {
                super(0);
                this.f78164c = iVar;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Set<kotlin.reflect.jvm.internal.impl.name.f> invoke() {
                return kotlin.collections.l1.C(c.this.f78151a.keySet(), this.f78164c.u());
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i$c$c, reason: collision with other inner class name */
        static final class C1187c extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends z0>> {
            C1187c() {
                super(1);
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection<z0> invoke(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
                l0.p(fVar, ProtectedSandApp.s("箻\u0001"));
                return c.this.m(fVar);
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        static final class d extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends u0>> {
            d() {
                super(1);
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection<u0> invoke(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
                l0.p(fVar, ProtectedSandApp.s("箼\u0001"));
                return c.this.n(fVar);
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        static final class e extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.name.f, e1> {
            e() {
                super(1);
            }

            @Override // ld.l
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e1 invoke(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
                l0.p(fVar, ProtectedSandApp.s("箽\u0001"));
                return c.this.o(fVar);
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        static final class f extends n0 implements ld.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>> {

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ i f78169c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(i iVar) {
                super(0);
                this.f78169c = iVar;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Set<kotlin.reflect.jvm.internal.impl.name.f> invoke() {
                return kotlin.collections.l1.C(c.this.f78152b.keySet(), this.f78169c.v());
            }
        }

        public c(@fg.l i iVar, @fg.l List<a.i> list, @fg.l List<a.n> list2, List<a.r> list3) {
            Map<kotlin.reflect.jvm.internal.impl.name.f, byte[]> z4;
            l0.p(list, ProtectedSandApp.s("篂\u0001"));
            l0.p(list2, ProtectedSandApp.s("篃\u0001"));
            l0.p(list3, ProtectedSandApp.s("範\u0001"));
            this.f78159i = iVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                kotlin.reflect.jvm.internal.impl.name.f b5 = z.b(iVar.q().g(), ((a.i) ((kotlin.reflect.jvm.internal.impl.protobuf.o) obj)).e0());
                Object obj2 = linkedHashMap.get(b5);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(b5, obj2);
                }
                ((List) obj2).add(obj);
            }
            this.f78151a = p(linkedHashMap);
            i iVar2 = this.f78159i;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : list2) {
                kotlin.reflect.jvm.internal.impl.name.f b6 = z.b(iVar2.q().g(), ((a.n) ((kotlin.reflect.jvm.internal.impl.protobuf.o) obj3)).d0());
                Object obj4 = linkedHashMap2.get(b6);
                if (obj4 == null) {
                    obj4 = new ArrayList();
                    linkedHashMap2.put(b6, obj4);
                }
                ((List) obj4).add(obj3);
            }
            this.f78152b = p(linkedHashMap2);
            if (this.f78159i.q().c().g().d()) {
                i iVar3 = this.f78159i;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj5 : list3) {
                    kotlin.reflect.jvm.internal.impl.name.f b7 = z.b(iVar3.q().g(), ((a.r) ((kotlin.reflect.jvm.internal.impl.protobuf.o) obj5)).X());
                    Object obj6 = linkedHashMap3.get(b7);
                    if (obj6 == null) {
                        obj6 = new ArrayList();
                        linkedHashMap3.put(b7, obj6);
                    }
                    ((List) obj6).add(obj5);
                }
                z4 = p(linkedHashMap3);
            } else {
                z4 = kotlin.collections.z0.z();
            }
            this.f78153c = z4;
            this.f78154d = this.f78159i.q().h().e(new C1187c());
            this.f78155e = this.f78159i.q().h().e(new d());
            this.f78156f = this.f78159i.q().h().b(new e());
            this.f78157g = this.f78159i.q().h().h(new b(this.f78159i));
            this.f78158h = this.f78159i.q().h().h(new f(this.f78159i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.z0> m(kotlin.reflect.jvm.internal.impl.name.f r6) {
            /*
                r5 = this;
                java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, byte[]> r0 = r5.f78151a
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$i> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.i.f77123x
                java.lang.String r2 = "篅\u0001"
                java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
                kotlin.jvm.internal.l0.o(r1, r2)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i r2 = r5.f78159i
                java.lang.Object r0 = r0.get(r6)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L30
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i r3 = r5.f78159i
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i$c$a r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i$c$a
                r0.<init>(r1, r4, r3)
                kotlin.sequences.m r0 = kotlin.sequences.p.m(r0)
                java.util.List r0 = kotlin.sequences.p.c3(r0)
                if (r0 == 0) goto L30
                java.util.Collection r0 = (java.util.Collection) r0
                goto L32
            L30:
                kotlin.collections.j0 r0 = kotlin.collections.j0.f74919b
            L32:
                r1 = r0
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r3 = new java.util.ArrayList
                int r0 = r0.size()
                r3.<init>(r0)
                java.util.Iterator r0 = r1.iterator()
            L42:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L6b
                java.lang.Object r1 = r0.next()
                kotlin.reflect.jvm.internal.impl.metadata.a$i r1 = (kotlin.reflect.jvm.internal.impl.metadata.a.i) r1
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r4 = r2.q()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.y r4 = r4.f()
                kotlin.jvm.internal.l0.m(r1)
                kotlin.reflect.jvm.internal.impl.descriptors.z0 r1 = r4.j(r1)
                boolean r4 = r2.y(r1)
                if (r4 == 0) goto L64
                goto L65
            L64:
                r1 = 0
            L65:
                if (r1 == 0) goto L42
                r3.add(r1)
                goto L42
            L6b:
                r2.l(r6, r3)
                java.util.List r6 = kotlin.reflect.jvm.internal.impl.utils.a.c(r3)
                java.util.Collection r6 = (java.util.Collection) r6
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.c.m(kotlin.reflect.jvm.internal.impl.name.f):java.util.Collection");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.u0> n(kotlin.reflect.jvm.internal.impl.name.f r6) {
            /*
                r5 = this;
                java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, byte[]> r0 = r5.f78152b
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$n> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.n.f77191x
                java.lang.String r2 = "篅\u0001"
                java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
                kotlin.jvm.internal.l0.o(r1, r2)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i r2 = r5.f78159i
                java.lang.Object r0 = r0.get(r6)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L30
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i r3 = r5.f78159i
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i$c$a r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i$c$a
                r0.<init>(r1, r4, r3)
                kotlin.sequences.m r0 = kotlin.sequences.p.m(r0)
                java.util.List r0 = kotlin.sequences.p.c3(r0)
                if (r0 == 0) goto L30
                java.util.Collection r0 = (java.util.Collection) r0
                goto L32
            L30:
                kotlin.collections.j0 r0 = kotlin.collections.j0.f74919b
            L32:
                r1 = r0
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r3 = new java.util.ArrayList
                int r0 = r0.size()
                r3.<init>(r0)
                java.util.Iterator r0 = r1.iterator()
            L42:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L63
                java.lang.Object r1 = r0.next()
                kotlin.reflect.jvm.internal.impl.metadata.a$n r1 = (kotlin.reflect.jvm.internal.impl.metadata.a.n) r1
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r4 = r2.q()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.y r4 = r4.f()
                kotlin.jvm.internal.l0.m(r1)
                kotlin.reflect.jvm.internal.impl.descriptors.u0 r1 = r4.l(r1)
                if (r1 == 0) goto L42
                r3.add(r1)
                goto L42
            L63:
                r2.m(r6, r3)
                java.util.List r6 = kotlin.reflect.jvm.internal.impl.utils.a.c(r3)
                java.util.Collection r6 = (java.util.Collection) r6
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.c.n(kotlin.reflect.jvm.internal.impl.name.f):java.util.Collection");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final e1 o(kotlin.reflect.jvm.internal.impl.name.f fVar) {
            a.r o02;
            byte[] bArr = this.f78153c.get(fVar);
            if (bArr == null || (o02 = a.r.o0(new ByteArrayInputStream(bArr), this.f78159i.q().c().k())) == null) {
                return null;
            }
            return this.f78159i.q().f().m(o02);
        }

        private final Map<kotlin.reflect.jvm.internal.impl.name.f, byte[]> p(Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.protobuf.a>> map) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.z0.j(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(w.b0(iterable, 10));
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    ((kotlin.reflect.jvm.internal.impl.protobuf.a) it2.next()).d(byteArrayOutputStream);
                    arrayList.add(k2.f75408a);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.a
        @fg.l
        public Collection<z0> a(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
            l0.p(fVar, ProtectedSandApp.s("篆\u0001"));
            l0.p(bVar, ProtectedSandApp.s("篇\u0001"));
            return !c().contains(fVar) ? j0.f74919b : this.f78154d.invoke(fVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.a
        @fg.l
        public Collection<u0> b(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
            l0.p(fVar, ProtectedSandApp.s("篆\u0001"));
            l0.p(bVar, ProtectedSandApp.s("篇\u0001"));
            return !d().contains(fVar) ? j0.f74919b : this.f78155e.invoke(fVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.a
        @fg.l
        public Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
            return (Set) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f78157g, this, f78150j[0]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.a
        @fg.l
        public Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
            return (Set) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f78158h, this, f78150j[1]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.a
        @fg.l
        public Set<kotlin.reflect.jvm.internal.impl.name.f> e() {
            return this.f78153c.keySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.a
        @fg.m
        public e1 f(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("篆\u0001"));
            return this.f78156f.invoke(fVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.a
        public void g(@fg.l Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> collection, @fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar, @fg.l ud.b bVar) {
            l0.p(collection, ProtectedSandApp.s("篈\u0001"));
            l0.p(dVar, ProtectedSandApp.s("築\u0001"));
            l0.p(lVar, ProtectedSandApp.s("篊\u0001"));
            l0.p(bVar, ProtectedSandApp.s("篇\u0001"));
            kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f77961c.getClass();
            boolean a5 = dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f77968j);
            String s4 = ProtectedSandApp.s("篋\u0001");
            if (a5) {
                Set<kotlin.reflect.jvm.internal.impl.name.f> d5 = d();
                ArrayList arrayList = new ArrayList();
                for (kotlin.reflect.jvm.internal.impl.name.f fVar : d5) {
                    if (lVar.invoke(fVar).booleanValue()) {
                        arrayList.addAll(b(fVar, bVar));
                    }
                }
                i.b bVar2 = i.b.f77919b;
                l0.o(bVar2, s4);
                w.p0(arrayList, bVar2);
                collection.addAll(arrayList);
            }
            kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f77961c.getClass();
            if (dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f77967i)) {
                Set<kotlin.reflect.jvm.internal.impl.name.f> c5 = c();
                ArrayList arrayList2 = new ArrayList();
                for (kotlin.reflect.jvm.internal.impl.name.f fVar2 : c5) {
                    if (lVar.invoke(fVar2).booleanValue()) {
                        arrayList2.addAll(a(fVar2, bVar));
                    }
                }
                i.b bVar3 = i.b.f77919b;
                l0.o(bVar3, s4);
                w.p0(arrayList2, bVar3);
                collection.addAll(arrayList2);
            }
        }
    }

    /* compiled from: DeserializedMemberScope.kt */
    static final class d extends n0 implements ld.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<Collection<kotlin.reflect.jvm.internal.impl.name.f>> f78170b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(ld.a<? extends Collection<kotlin.reflect.jvm.internal.impl.name.f>> aVar) {
            super(0);
            this.f78170b = aVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set<kotlin.reflect.jvm.internal.impl.name.f> invoke() {
            return w.a6(this.f78170b.invoke());
        }
    }

    /* compiled from: DeserializedMemberScope.kt */
    static final class e extends n0 implements ld.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>> {
        e() {
            super(0);
        }

        @Override // ld.a
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set<kotlin.reflect.jvm.internal.impl.name.f> invoke() {
            Set<kotlin.reflect.jvm.internal.impl.name.f> t4 = i.this.t();
            if (t4 == null) {
                return null;
            }
            return kotlin.collections.l1.C(kotlin.collections.l1.C(i.this.r(), i.this.f78120c.e()), t4);
        }
    }

    protected i(@fg.l kotlin.reflect.jvm.internal.impl.serialization.deserialization.m mVar, @fg.l List<a.i> list, @fg.l List<a.n> list2, @fg.l List<a.r> list3, @fg.l ld.a<? extends Collection<kotlin.reflect.jvm.internal.impl.name.f>> aVar) {
        l0.p(mVar, ProtectedSandApp.s("筝\u0001"));
        l0.p(list, ProtectedSandApp.s("筞\u0001"));
        l0.p(list2, ProtectedSandApp.s("筟\u0001"));
        l0.p(list3, ProtectedSandApp.s("筠\u0001"));
        l0.p(aVar, ProtectedSandApp.s("筙\u0001"));
        this.f78119b = mVar;
        this.f78120c = o(list, list2, list3);
        this.f78121d = mVar.h().h(new d(aVar));
        this.f78122e = mVar.h().i(new e());
    }

    private final a o(List<a.i> list, List<a.n> list2, List<a.r> list3) {
        return this.f78119b.c().g().a() ? new b(this, list, list2, list3) : new c(this, list, list2, list3);
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.e p(kotlin.reflect.jvm.internal.impl.name.f fVar) {
        return this.f78119b.c().b(n(fVar));
    }

    private final Set<kotlin.reflect.jvm.internal.impl.name.f> s() {
        return (Set) kotlin.reflect.jvm.internal.impl.storage.m.b(this.f78122e, this, f78118f[1]);
    }

    private final e1 w(kotlin.reflect.jvm.internal.impl.name.f fVar) {
        return this.f78120c.f(fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.l
    public Collection<z0> a(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("筡\u0001"));
        l0.p(bVar, ProtectedSandApp.s("筢\u0001"));
        return this.f78120c.a(fVar, bVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.l
    public Collection<u0> b(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("筡\u0001"));
        l0.p(bVar, ProtectedSandApp.s("筢\u0001"));
        return this.f78120c.b(fVar, bVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.l
    public Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
        return this.f78120c.c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.l
    public Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
        return this.f78120c.d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.m
    public kotlin.reflect.jvm.internal.impl.descriptors.h f(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("筡\u0001"));
        l0.p(bVar, ProtectedSandApp.s("筢\u0001"));
        if (x(fVar)) {
            return p(fVar);
        }
        if (this.f78120c.e().contains(fVar)) {
            return this.f78120c.f(fVar);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.m
    public Set<kotlin.reflect.jvm.internal.impl.name.f> h() {
        return s();
    }

    protected abstract void j(@fg.l Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> collection, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar);

    @fg.l
    protected final Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> k(@fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar, @fg.l ud.b bVar) {
        l0.p(dVar, ProtectedSandApp.s("筣\u0001"));
        l0.p(lVar, ProtectedSandApp.s("筤\u0001"));
        l0.p(bVar, ProtectedSandApp.s("筢\u0001"));
        ArrayList arrayList = new ArrayList(0);
        d.a aVar = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f77961c;
        aVar.getClass();
        if (dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f77964f)) {
            j(arrayList, lVar);
        }
        this.f78120c.g(arrayList, dVar, lVar, bVar);
        aVar.getClass();
        if (dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f77970l)) {
            for (kotlin.reflect.jvm.internal.impl.name.f fVar : r()) {
                if (lVar.invoke(fVar).booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, p(fVar));
                }
            }
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f77961c.getClass();
        if (dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f77965g)) {
            for (kotlin.reflect.jvm.internal.impl.name.f fVar2 : this.f78120c.e()) {
                if (lVar.invoke(fVar2).booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, this.f78120c.f(fVar2));
                }
            }
        }
        return kotlin.reflect.jvm.internal.impl.utils.a.c(arrayList);
    }

    protected void l(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l List<z0> list) {
        l0.p(fVar, ProtectedSandApp.s("筡\u0001"));
        l0.p(list, ProtectedSandApp.s("筥\u0001"));
    }

    protected void m(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l List<u0> list) {
        l0.p(fVar, ProtectedSandApp.s("筡\u0001"));
        l0.p(list, ProtectedSandApp.s("筦\u0001"));
    }

    @fg.l
    protected abstract kotlin.reflect.jvm.internal.impl.name.b n(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar);

    @fg.l
    protected final kotlin.reflect.jvm.internal.impl.serialization.deserialization.m q() {
        return this.f78119b;
    }

    @fg.l
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> r() {
        return (Set) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f78121d, this, f78118f[0]);
    }

    @fg.m
    protected abstract Set<kotlin.reflect.jvm.internal.impl.name.f> t();

    @fg.l
    protected abstract Set<kotlin.reflect.jvm.internal.impl.name.f> u();

    @fg.l
    protected abstract Set<kotlin.reflect.jvm.internal.impl.name.f> v();

    protected boolean x(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(fVar, ProtectedSandApp.s("筡\u0001"));
        return r().contains(fVar);
    }

    protected boolean y(@fg.l z0 z0Var) {
        l0.p(z0Var, ProtectedSandApp.s("筧\u0001"));
        return true;
    }
}
