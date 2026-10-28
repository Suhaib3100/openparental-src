package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import com.flashget.kidsdownloader.ProtectedSandApp;
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
import kotlin.collections.EmptyList;
import kotlin.collections.b0;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.f1;
import kotlin.collections.j0;
import kotlin.collections.r1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.m2;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.protobuf.q;
import kotlin.reflect.jvm.internal.impl.resolve.h;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.d;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.y;

/* compiled from: DeserializedMemberScope.kt */
/* loaded from: classes6.dex */
public abstract class i extends kotlin.reflect.jvm.internal.impl.resolve.scopes.i {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f26116f = {l1.u(new g1(l1.d(i.class), ProtectedSandApp.s("蝤"), ProtectedSandApp.s("蝥"))), l1.u(new g1(l1.d(i.class), ProtectedSandApp.s("蝦"), ProtectedSandApp.s("蝧")))};

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.m f26117b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final a f26118c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i f26119d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.j f26120e;

    /* compiled from: DeserializedMemberScope.kt */
    /* loaded from: classes5.dex */
    private interface a {
        @d5.d
        Collection<z0> a(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar);

        @d5.d
        Set<kotlin.reflect.jvm.internal.impl.name.f> b();

        @d5.d
        Set<kotlin.reflect.jvm.internal.impl.name.f> c();

        @d5.d
        Collection<u0> d(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar);

        void e(@d5.d Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> collection, @d5.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar, @d5.d z3.b bVar);

        @d5.d
        Set<kotlin.reflect.jvm.internal.impl.name.f> f();

        @d5.e
        e1 g(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar);
    }

    /* compiled from: DeserializedMemberScope.kt */
    /* loaded from: classes5.dex */
    private final class b implements a {

        /* renamed from: o, reason: collision with root package name */
        static final /* synthetic */ KProperty<Object>[] f26121o = {l1.u(new g1(l1.d(b.class), ProtectedSandApp.s("厤"), ProtectedSandApp.s("厥"))), l1.u(new g1(l1.d(b.class), ProtectedSandApp.s("厦"), ProtectedSandApp.s("厧"))), l1.u(new g1(l1.d(b.class), ProtectedSandApp.s("厨"), ProtectedSandApp.s("厩"))), l1.u(new g1(l1.d(b.class), ProtectedSandApp.s("厪"), ProtectedSandApp.s("厫"))), l1.u(new g1(l1.d(b.class), ProtectedSandApp.s("厬"), ProtectedSandApp.s("厭"))), l1.u(new g1(l1.d(b.class), ProtectedSandApp.s("厮"), ProtectedSandApp.s("厯"))), l1.u(new g1(l1.d(b.class), ProtectedSandApp.s("厰"), ProtectedSandApp.s("厱"))), l1.u(new g1(l1.d(b.class), ProtectedSandApp.s("厲"), ProtectedSandApp.s("厳"))), l1.u(new g1(l1.d(b.class), ProtectedSandApp.s("厴"), ProtectedSandApp.s("厵"))), l1.u(new g1(l1.d(b.class), ProtectedSandApp.s("厶"), ProtectedSandApp.s("厷")))};

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        private final List<a.i> f26122a;

        /* renamed from: b, reason: collision with root package name */
        @d5.d
        private final List<a.n> f26123b;

        /* renamed from: c, reason: collision with root package name */
        @d5.d
        private final List<a.r> f26124c;

        /* renamed from: d, reason: collision with root package name */
        @d5.d
        private final kotlin.reflect.jvm.internal.impl.storage.i f26125d;

        /* renamed from: e, reason: collision with root package name */
        @d5.d
        private final kotlin.reflect.jvm.internal.impl.storage.i f26126e;

        /* renamed from: f, reason: collision with root package name */
        @d5.d
        private final kotlin.reflect.jvm.internal.impl.storage.i f26127f;

        /* renamed from: g, reason: collision with root package name */
        @d5.d
        private final kotlin.reflect.jvm.internal.impl.storage.i f26128g;

        /* renamed from: h, reason: collision with root package name */
        @d5.d
        private final kotlin.reflect.jvm.internal.impl.storage.i f26129h;

        /* renamed from: i, reason: collision with root package name */
        @d5.d
        private final kotlin.reflect.jvm.internal.impl.storage.i f26130i;

        /* renamed from: j, reason: collision with root package name */
        @d5.d
        private final kotlin.reflect.jvm.internal.impl.storage.i f26131j;

        /* renamed from: k, reason: collision with root package name */
        @d5.d
        private final kotlin.reflect.jvm.internal.impl.storage.i f26132k;

        /* renamed from: l, reason: collision with root package name */
        @d5.d
        private final kotlin.reflect.jvm.internal.impl.storage.i f26133l;

        /* renamed from: m, reason: collision with root package name */
        @d5.d
        private final kotlin.reflect.jvm.internal.impl.storage.i f26134m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ i f26135n;

        /* compiled from: DeserializedMemberScope.kt */
        /* loaded from: classes6.dex */
        static final class a extends Lambda implements q3.a<List<? extends z0>> {
            a() {
                super(0);
            }

            @Override // q3.a
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<z0> n() {
                List<z0> D4;
                D4 = j0.D4(b.this.D(), b.this.t());
                return D4;
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i$b$b, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        static final class C0381b extends Lambda implements q3.a<List<? extends u0>> {
            C0381b() {
                super(0);
            }

            @Override // q3.a
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<u0> n() {
                List<u0> D4;
                D4 = j0.D4(b.this.E(), b.this.u());
                return D4;
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* loaded from: classes6.dex */
        static final class c extends Lambda implements q3.a<List<? extends e1>> {
            c() {
                super(0);
            }

            @Override // q3.a
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<e1> n() {
                return b.this.z();
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* loaded from: classes6.dex */
        static final class d extends Lambda implements q3.a<List<? extends z0>> {
            d() {
                super(0);
            }

            @Override // q3.a
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<z0> n() {
                return b.this.v();
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* loaded from: classes6.dex */
        static final class e extends Lambda implements q3.a<List<? extends u0>> {
            e() {
                super(0);
            }

            @Override // q3.a
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<u0> n() {
                return b.this.y();
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* loaded from: classes6.dex */
        static final class f extends Lambda implements q3.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>> {

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ i f26142q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(i iVar) {
                super(0);
                this.f26142q = iVar;
            }

            @Override // q3.a
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Set<kotlin.reflect.jvm.internal.impl.name.f> n() {
                Set<kotlin.reflect.jvm.internal.impl.name.f> C;
                b bVar = b.this;
                List list = bVar.f26122a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                i iVar = bVar.f26135n;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(y.b(iVar.q().g(), ((a.i) ((kotlin.reflect.jvm.internal.impl.protobuf.o) it.next())).e0()));
                }
                C = r1.C(linkedHashSet, this.f26142q.u());
                return C;
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* loaded from: classes6.dex */
        static final class g extends Lambda implements q3.a<Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends List<? extends z0>>> {
            g() {
                super(0);
            }

            @Override // q3.a
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Map<kotlin.reflect.jvm.internal.impl.name.f, List<z0>> n() {
                List A = b.this.A();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : A) {
                    kotlin.reflect.jvm.internal.impl.name.f name = ((z0) obj).getName();
                    l0.o(name, ProtectedSandApp.s("蟁"));
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
        /* loaded from: classes6.dex */
        static final class h extends Lambda implements q3.a<Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends List<? extends u0>>> {
            h() {
                super(0);
            }

            @Override // q3.a
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Map<kotlin.reflect.jvm.internal.impl.name.f, List<u0>> n() {
                List B = b.this.B();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : B) {
                    kotlin.reflect.jvm.internal.impl.name.f name = ((u0) obj).getName();
                    l0.o(name, ProtectedSandApp.s("蟂"));
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
        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i$b$i, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        static final class C0382i extends Lambda implements q3.a<Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends e1>> {
            C0382i() {
                super(0);
            }

            @Override // q3.a
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Map<kotlin.reflect.jvm.internal.impl.name.f, e1> n() {
                int b02;
                int j5;
                List C = b.this.C();
                b02 = b0.b0(C, 10);
                j5 = kotlin.collections.e1.j(b02);
                if (j5 < 16) {
                    j5 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(j5);
                for (Object obj : C) {
                    kotlin.reflect.jvm.internal.impl.name.f name = ((e1) obj).getName();
                    l0.o(name, ProtectedSandApp.s("蟃"));
                    linkedHashMap.put(name, obj);
                }
                return linkedHashMap;
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* loaded from: classes6.dex */
        static final class j extends Lambda implements q3.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>> {

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ i f26147q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(i iVar) {
                super(0);
                this.f26147q = iVar;
            }

            @Override // q3.a
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Set<kotlin.reflect.jvm.internal.impl.name.f> n() {
                Set<kotlin.reflect.jvm.internal.impl.name.f> C;
                b bVar = b.this;
                List list = bVar.f26123b;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                i iVar = bVar.f26135n;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(y.b(iVar.q().g(), ((a.n) ((kotlin.reflect.jvm.internal.impl.protobuf.o) it.next())).d0()));
                }
                C = r1.C(linkedHashSet, this.f26147q.v());
                return C;
            }
        }

        public b(@d5.d i iVar, @d5.d List<a.i> list, @d5.d List<a.n> list2, List<a.r> list3) {
            l0.p(list, ProtectedSandApp.s("厸"));
            l0.p(list2, ProtectedSandApp.s("厹"));
            l0.p(list3, ProtectedSandApp.s("厺"));
            this.f26135n = iVar;
            this.f26122a = list;
            this.f26123b = list2;
            this.f26124c = iVar.q().c().g().f() ? list3 : EmptyList.f23167o;
            this.f26125d = iVar.q().h().d(new d());
            this.f26126e = iVar.q().h().d(new e());
            this.f26127f = iVar.q().h().d(new c());
            this.f26128g = iVar.q().h().d(new a());
            this.f26129h = iVar.q().h().d(new C0381b());
            this.f26130i = iVar.q().h().d(new C0382i());
            this.f26131j = iVar.q().h().d(new g());
            this.f26132k = iVar.q().h().d(new h());
            this.f26133l = iVar.q().h().d(new f(iVar));
            this.f26134m = iVar.q().h().d(new j(iVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<z0> A() {
            return (List) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f26128g, this, f26121o[3]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<u0> B() {
            return (List) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f26129h, this, f26121o[4]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<e1> C() {
            return (List) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f26127f, this, f26121o[2]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<z0> D() {
            return (List) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f26125d, this, f26121o[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<u0> E() {
            return (List) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f26126e, this, f26121o[1]);
        }

        private final Map<kotlin.reflect.jvm.internal.impl.name.f, Collection<z0>> F() {
            return (Map) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f26131j, this, f26121o[6]);
        }

        private final Map<kotlin.reflect.jvm.internal.impl.name.f, Collection<u0>> G() {
            return (Map) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f26132k, this, f26121o[7]);
        }

        private final Map<kotlin.reflect.jvm.internal.impl.name.f, e1> H() {
            return (Map) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f26130i, this, f26121o[5]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<z0> t() {
            Set<kotlin.reflect.jvm.internal.impl.name.f> u5 = this.f26135n.u();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = u5.iterator();
            while (it.hasNext()) {
                f0.q0(arrayList, w((kotlin.reflect.jvm.internal.impl.name.f) it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<u0> u() {
            Set<kotlin.reflect.jvm.internal.impl.name.f> v5 = this.f26135n.v();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = v5.iterator();
            while (it.hasNext()) {
                f0.q0(arrayList, x((kotlin.reflect.jvm.internal.impl.name.f) it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<z0> v() {
            List<a.i> list = this.f26122a;
            i iVar = this.f26135n;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                z0 j5 = iVar.q().f().j((a.i) ((kotlin.reflect.jvm.internal.impl.protobuf.o) it.next()));
                if (!iVar.y(j5)) {
                    j5 = null;
                }
                if (j5 != null) {
                    arrayList.add(j5);
                }
            }
            return arrayList;
        }

        private final List<z0> w(kotlin.reflect.jvm.internal.impl.name.f fVar) {
            List<z0> D = D();
            i iVar = this.f26135n;
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
            i iVar = this.f26135n;
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
            List<a.n> list = this.f26123b;
            i iVar = this.f26135n;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                u0 l5 = iVar.q().f().l((a.n) ((kotlin.reflect.jvm.internal.impl.protobuf.o) it.next()));
                if (l5 != null) {
                    arrayList.add(l5);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<e1> z() {
            List<a.r> list = this.f26124c;
            i iVar = this.f26135n;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                e1 m5 = iVar.q().f().m((a.r) ((kotlin.reflect.jvm.internal.impl.protobuf.o) it.next()));
                if (m5 != null) {
                    arrayList.add(m5);
                }
            }
            return arrayList;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.a
        @d5.d
        public Collection<z0> a(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
            l0.p(fVar, ProtectedSandApp.s("去"));
            l0.p(bVar, ProtectedSandApp.s("厼"));
            if (!b().contains(fVar)) {
                return EmptyList.f23167o;
            }
            Collection<z0> collection = F().get(fVar);
            return collection == null ? EmptyList.f23167o : collection;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.a
        @d5.d
        public Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
            return (Set) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f26133l, this, f26121o[8]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.a
        @d5.d
        public Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
            return (Set) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f26134m, this, f26121o[9]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.a
        @d5.d
        public Collection<u0> d(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
            l0.p(fVar, ProtectedSandApp.s("厽"));
            l0.p(bVar, ProtectedSandApp.s("厾"));
            if (!c().contains(fVar)) {
                return EmptyList.f23167o;
            }
            Collection<u0> collection = G().get(fVar);
            return collection == null ? EmptyList.f23167o : collection;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.a
        public void e(@d5.d Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> collection, @d5.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar, @d5.d z3.b bVar) {
            l0.p(collection, ProtectedSandApp.s("县"));
            l0.p(dVar, ProtectedSandApp.s("叀"));
            l0.p(lVar, ProtectedSandApp.s("叁"));
            l0.p(bVar, ProtectedSandApp.s("参"));
            kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f25977c.getClass();
            boolean a6 = dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f25984j);
            String s5 = ProtectedSandApp.s("參");
            if (a6) {
                for (Object obj : B()) {
                    kotlin.reflect.jvm.internal.impl.name.f name = ((u0) obj).getName();
                    l0.o(name, s5);
                    if (lVar.N(name).booleanValue()) {
                        collection.add(obj);
                    }
                }
            }
            kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f25977c.getClass();
            if (dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f25983i)) {
                for (Object obj2 : A()) {
                    kotlin.reflect.jvm.internal.impl.name.f name2 = ((z0) obj2).getName();
                    l0.o(name2, s5);
                    if (lVar.N(name2).booleanValue()) {
                        collection.add(obj2);
                    }
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.a
        @d5.d
        public Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
            List<a.r> list = this.f26124c;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            i iVar = this.f26135n;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(y.b(iVar.q().g(), ((a.r) ((kotlin.reflect.jvm.internal.impl.protobuf.o) it.next())).W()));
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.a
        @d5.e
        public e1 g(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("叄"));
            return H().get(fVar);
        }
    }

    /* compiled from: DeserializedMemberScope.kt */
    /* loaded from: classes5.dex */
    private final class c implements a {

        /* renamed from: j, reason: collision with root package name */
        static final /* synthetic */ KProperty<Object>[] f26148j = {l1.u(new g1(l1.d(c.class), ProtectedSandApp.s("叅"), ProtectedSandApp.s("叆"))), l1.u(new g1(l1.d(c.class), ProtectedSandApp.s("叇"), ProtectedSandApp.s("又")))};

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        private final Map<kotlin.reflect.jvm.internal.impl.name.f, byte[]> f26149a;

        /* renamed from: b, reason: collision with root package name */
        @d5.d
        private final Map<kotlin.reflect.jvm.internal.impl.name.f, byte[]> f26150b;

        /* renamed from: c, reason: collision with root package name */
        @d5.d
        private final Map<kotlin.reflect.jvm.internal.impl.name.f, byte[]> f26151c;

        /* renamed from: d, reason: collision with root package name */
        @d5.d
        private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.f, Collection<z0>> f26152d;

        /* renamed from: e, reason: collision with root package name */
        @d5.d
        private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.f, Collection<u0>> f26153e;

        /* renamed from: f, reason: collision with root package name */
        @d5.d
        private final kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.f, e1> f26154f;

        /* renamed from: g, reason: collision with root package name */
        @d5.d
        private final kotlin.reflect.jvm.internal.impl.storage.i f26155g;

        /* renamed from: h, reason: collision with root package name */
        @d5.d
        private final kotlin.reflect.jvm.internal.impl.storage.i f26156h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ i f26157i;

        /* compiled from: DeserializedMemberScope.kt */
        /* loaded from: classes6.dex */
        static final class a extends Lambda implements q3.a<Object> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ q<Object> f26158p;

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ ByteArrayInputStream f26159q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ i f26160r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(q<Object> qVar, ByteArrayInputStream byteArrayInputStream, i iVar) {
                super(0);
                this.f26158p = qVar;
                this.f26159q = byteArrayInputStream;
                this.f26160r = iVar;
            }

            @Override // q3.a
            @d5.e
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object n() {
                return (kotlin.reflect.jvm.internal.impl.protobuf.o) this.f26158p.c(this.f26159q, this.f26160r.q().c().j());
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* loaded from: classes6.dex */
        static final class b extends Lambda implements q3.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>> {

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ i f26162q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(i iVar) {
                super(0);
                this.f26162q = iVar;
            }

            @Override // q3.a
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Set<kotlin.reflect.jvm.internal.impl.name.f> n() {
                Set<kotlin.reflect.jvm.internal.impl.name.f> C;
                C = r1.C(c.this.f26149a.keySet(), this.f26162q.u());
                return C;
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i$c$c, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        static final class C0383c extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends z0>> {
            C0383c() {
                super(1);
            }

            @Override // q3.l
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection<z0> N(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
                l0.p(fVar, ProtectedSandApp.s("蟄"));
                return c.this.m(fVar);
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* loaded from: classes6.dex */
        static final class d extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends u0>> {
            d() {
                super(1);
            }

            @Override // q3.l
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection<u0> N(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
                l0.p(fVar, ProtectedSandApp.s("蟅"));
                return c.this.n(fVar);
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* loaded from: classes6.dex */
        static final class e extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.name.f, e1> {
            e() {
                super(1);
            }

            @Override // q3.l
            @d5.e
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e1 N(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
                l0.p(fVar, ProtectedSandApp.s("蟆"));
                return c.this.o(fVar);
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* loaded from: classes6.dex */
        static final class f extends Lambda implements q3.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>> {

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ i f26167q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(i iVar) {
                super(0);
                this.f26167q = iVar;
            }

            @Override // q3.a
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Set<kotlin.reflect.jvm.internal.impl.name.f> n() {
                Set<kotlin.reflect.jvm.internal.impl.name.f> C;
                C = r1.C(c.this.f26150b.keySet(), this.f26167q.v());
                return C;
            }
        }

        public c(@d5.d i iVar, @d5.d List<a.i> list, @d5.d List<a.n> list2, List<a.r> list3) {
            Map<kotlin.reflect.jvm.internal.impl.name.f, byte[]> z5;
            l0.p(list, ProtectedSandApp.s("叉"));
            l0.p(list2, ProtectedSandApp.s("及"));
            l0.p(list3, ProtectedSandApp.s("友"));
            this.f26157i = iVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                kotlin.reflect.jvm.internal.impl.name.f b6 = y.b(iVar.q().g(), ((a.i) ((kotlin.reflect.jvm.internal.impl.protobuf.o) obj)).e0());
                Object obj2 = linkedHashMap.get(b6);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(b6, obj2);
                }
                ((List) obj2).add(obj);
            }
            this.f26149a = p(linkedHashMap);
            i iVar2 = this.f26157i;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : list2) {
                kotlin.reflect.jvm.internal.impl.name.f b7 = y.b(iVar2.q().g(), ((a.n) ((kotlin.reflect.jvm.internal.impl.protobuf.o) obj3)).d0());
                Object obj4 = linkedHashMap2.get(b7);
                if (obj4 == null) {
                    obj4 = new ArrayList();
                    linkedHashMap2.put(b7, obj4);
                }
                ((List) obj4).add(obj3);
            }
            this.f26150b = p(linkedHashMap2);
            if (this.f26157i.q().c().g().f()) {
                i iVar3 = this.f26157i;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj5 : list3) {
                    kotlin.reflect.jvm.internal.impl.name.f b8 = y.b(iVar3.q().g(), ((a.r) ((kotlin.reflect.jvm.internal.impl.protobuf.o) obj5)).W());
                    Object obj6 = linkedHashMap3.get(b8);
                    if (obj6 == null) {
                        obj6 = new ArrayList();
                        linkedHashMap3.put(b8, obj6);
                    }
                    ((List) obj6).add(obj5);
                }
                z5 = p(linkedHashMap3);
            } else {
                z5 = f1.z();
            }
            this.f26151c = z5;
            this.f26152d = this.f26157i.q().h().g(new C0383c());
            this.f26153e = this.f26157i.q().h().g(new d());
            this.f26154f = this.f26157i.q().h().i(new e());
            this.f26155g = this.f26157i.q().h().d(new b(this.f26157i));
            this.f26156h = this.f26157i.q().h().d(new f(this.f26157i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
        
            if (r0 != null) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.z0> m(kotlin.reflect.jvm.internal.impl.name.f r7) {
            /*
                r6 = this;
                java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, byte[]> r0 = r6.f26149a
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$i> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.i.K
                java.lang.String r2 = "双"
                java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
                kotlin.jvm.internal.l0.o(r1, r2)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i r2 = r6.f26157i
                java.lang.Object r0 = r0.get(r7)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L2e
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i r3 = r6.f26157i
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i$c$a r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i$c$a
                r0.<init>(r1, r4, r3)
                kotlin.sequences.m r0 = kotlin.sequences.p.m(r0)
                java.util.List r0 = kotlin.sequences.p.c3(r0)
                if (r0 == 0) goto L2e
                goto L30
            L2e:
                kotlin.collections.m0 r0 = kotlin.collections.EmptyList.f23167o
            L30:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r3 = r0.size()
                r1.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L3d:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L6c
                java.lang.Object r3 = r0.next()
                kotlin.reflect.jvm.internal.impl.metadata.a$i r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.i) r3
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r4 = r2.q()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.x r4 = r4.f()
                java.lang.String r5 = "反"
                java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
                kotlin.jvm.internal.l0.o(r3, r5)
                kotlin.reflect.jvm.internal.impl.descriptors.z0 r3 = r4.j(r3)
                boolean r4 = r2.y(r3)
                if (r4 == 0) goto L65
                goto L66
            L65:
                r3 = 0
            L66:
                if (r3 == 0) goto L3d
                r1.add(r3)
                goto L3d
            L6c:
                r2.l(r7, r1)
                java.util.List r7 = kotlin.reflect.jvm.internal.impl.utils.a.c(r1)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.c.m(kotlin.reflect.jvm.internal.impl.name.f):java.util.Collection");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
        
            if (r0 != null) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.u0> n(kotlin.reflect.jvm.internal.impl.name.f r7) {
            /*
                r6 = this;
                java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, byte[]> r0 = r6.f26150b
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.a$n> r1 = kotlin.reflect.jvm.internal.impl.metadata.a.n.K
                java.lang.String r2 = "収"
                java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
                kotlin.jvm.internal.l0.o(r1, r2)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i r2 = r6.f26157i
                java.lang.Object r0 = r0.get(r7)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L2e
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i r3 = r6.f26157i
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i$c$a r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i$c$a
                r0.<init>(r1, r4, r3)
                kotlin.sequences.m r0 = kotlin.sequences.p.m(r0)
                java.util.List r0 = kotlin.sequences.p.c3(r0)
                if (r0 == 0) goto L2e
                goto L30
            L2e:
                kotlin.collections.m0 r0 = kotlin.collections.EmptyList.f23167o
            L30:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r3 = r0.size()
                r1.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L3d:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L64
                java.lang.Object r3 = r0.next()
                kotlin.reflect.jvm.internal.impl.metadata.a$n r3 = (kotlin.reflect.jvm.internal.impl.metadata.a.n) r3
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r4 = r2.q()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.x r4 = r4.f()
                java.lang.String r5 = "叏"
                java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
                kotlin.jvm.internal.l0.o(r3, r5)
                kotlin.reflect.jvm.internal.impl.descriptors.u0 r3 = r4.l(r3)
                if (r3 == 0) goto L3d
                r1.add(r3)
                goto L3d
            L64:
                r2.m(r7, r1)
                java.util.List r7 = kotlin.reflect.jvm.internal.impl.utils.a.c(r1)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.c.n(kotlin.reflect.jvm.internal.impl.name.f):java.util.Collection");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final e1 o(kotlin.reflect.jvm.internal.impl.name.f fVar) {
            a.r o02;
            byte[] bArr = this.f26151c.get(fVar);
            if (bArr == null || (o02 = a.r.o0(new ByteArrayInputStream(bArr), this.f26157i.q().c().j())) == null) {
                return null;
            }
            return this.f26157i.q().f().m(o02);
        }

        private final Map<kotlin.reflect.jvm.internal.impl.name.f, byte[]> p(Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.protobuf.a>> map) {
            int j5;
            int b02;
            j5 = kotlin.collections.e1.j(map.size());
            LinkedHashMap linkedHashMap = new LinkedHashMap(j5);
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable iterable = (Iterable) entry.getValue();
                b02 = b0.b0(iterable, 10);
                ArrayList arrayList = new ArrayList(b02);
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    ((kotlin.reflect.jvm.internal.impl.protobuf.a) it2.next()).c(byteArrayOutputStream);
                    arrayList.add(m2.f23662a);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.a
        @d5.d
        public Collection<z0> a(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
            l0.p(fVar, ProtectedSandApp.s("叐"));
            l0.p(bVar, ProtectedSandApp.s("发"));
            return !b().contains(fVar) ? EmptyList.f23167o : this.f26152d.N(fVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.a
        @d5.d
        public Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
            return (Set) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f26155g, this, f26148j[0]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.a
        @d5.d
        public Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
            return (Set) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f26156h, this, f26148j[1]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.a
        @d5.d
        public Collection<u0> d(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
            l0.p(fVar, ProtectedSandApp.s("叒"));
            l0.p(bVar, ProtectedSandApp.s("叓"));
            return !c().contains(fVar) ? EmptyList.f23167o : this.f26153e.N(fVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.a
        public void e(@d5.d Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> collection, @d5.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar, @d5.d z3.b bVar) {
            l0.p(collection, ProtectedSandApp.s("叔"));
            l0.p(dVar, ProtectedSandApp.s("叕"));
            l0.p(lVar, ProtectedSandApp.s("取"));
            l0.p(bVar, ProtectedSandApp.s("受"));
            kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f25977c.getClass();
            boolean a6 = dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f25984j);
            String s5 = ProtectedSandApp.s("变");
            if (a6) {
                Set<kotlin.reflect.jvm.internal.impl.name.f> c6 = c();
                ArrayList arrayList = new ArrayList();
                for (kotlin.reflect.jvm.internal.impl.name.f fVar : c6) {
                    if (lVar.N(fVar).booleanValue()) {
                        arrayList.addAll(d(fVar, bVar));
                    }
                }
                h.b bVar2 = h.b.f25936o;
                l0.o(bVar2, s5);
                e0.p0(arrayList, bVar2);
                collection.addAll(arrayList);
            }
            kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f25977c.getClass();
            if (dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f25983i)) {
                Set<kotlin.reflect.jvm.internal.impl.name.f> b6 = b();
                ArrayList arrayList2 = new ArrayList();
                for (kotlin.reflect.jvm.internal.impl.name.f fVar2 : b6) {
                    if (lVar.N(fVar2).booleanValue()) {
                        arrayList2.addAll(a(fVar2, bVar));
                    }
                }
                h.b bVar3 = h.b.f25936o;
                l0.o(bVar3, s5);
                e0.p0(arrayList2, bVar3);
                collection.addAll(arrayList2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.a
        @d5.d
        public Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
            return this.f26151c.keySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i.a
        @d5.e
        public e1 g(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("叙"));
            return this.f26154f.N(fVar);
        }
    }

    /* compiled from: DeserializedMemberScope.kt */
    static final class d extends Lambda implements q3.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.a<Collection<kotlin.reflect.jvm.internal.impl.name.f>> f26168p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(q3.a<? extends Collection<kotlin.reflect.jvm.internal.impl.name.f>> aVar) {
            super(0);
            this.f26168p = aVar;
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set<kotlin.reflect.jvm.internal.impl.name.f> n() {
            Set<kotlin.reflect.jvm.internal.impl.name.f> a6;
            a6 = j0.a6(this.f26168p.n());
            return a6;
        }
    }

    /* compiled from: DeserializedMemberScope.kt */
    static final class e extends Lambda implements q3.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>> {
        e() {
            super(0);
        }

        @Override // q3.a
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set<kotlin.reflect.jvm.internal.impl.name.f> n() {
            Set C;
            Set<kotlin.reflect.jvm.internal.impl.name.f> C2;
            Set<kotlin.reflect.jvm.internal.impl.name.f> t5 = i.this.t();
            if (t5 == null) {
                return null;
            }
            C = r1.C(i.this.r(), i.this.f26118c.f());
            C2 = r1.C(C, t5);
            return C2;
        }
    }

    protected i(@d5.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.m mVar, @d5.d List<a.i> list, @d5.d List<a.n> list2, @d5.d List<a.r> list3, @d5.d q3.a<? extends Collection<kotlin.reflect.jvm.internal.impl.name.f>> aVar) {
        l0.p(mVar, ProtectedSandApp.s("蝨"));
        l0.p(list, ProtectedSandApp.s("蝩"));
        l0.p(list2, ProtectedSandApp.s("蝪"));
        l0.p(list3, ProtectedSandApp.s("蝫"));
        l0.p(aVar, ProtectedSandApp.s("蝬"));
        this.f26117b = mVar;
        this.f26118c = o(list, list2, list3);
        this.f26119d = mVar.h().d(new d(aVar));
        this.f26120e = mVar.h().f(new e());
    }

    private final a o(List<a.i> list, List<a.n> list2, List<a.r> list3) {
        return this.f26117b.c().g().a() ? new b(this, list, list2, list3) : new c(this, list, list2, list3);
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.e p(kotlin.reflect.jvm.internal.impl.name.f fVar) {
        return this.f26117b.c().b(n(fVar));
    }

    private final Set<kotlin.reflect.jvm.internal.impl.name.f> s() {
        return (Set) kotlin.reflect.jvm.internal.impl.storage.m.b(this.f26120e, this, f26116f[1]);
    }

    private final e1 w(kotlin.reflect.jvm.internal.impl.name.f fVar) {
        return this.f26118c.g(fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.d
    public Collection<z0> a(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("蝭"));
        l0.p(bVar, ProtectedSandApp.s("蝮"));
        return this.f26118c.a(fVar, bVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
        return this.f26118c.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
        return this.f26118c.c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    public Collection<u0> d(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("蝯"));
        l0.p(bVar, ProtectedSandApp.s("蝰"));
        return this.f26118c.d(fVar, bVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.e
    public Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
        return s();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.e
    public kotlin.reflect.jvm.internal.impl.descriptors.h h(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("蝱"));
        l0.p(bVar, ProtectedSandApp.s("蝲"));
        if (x(fVar)) {
            return p(fVar);
        }
        if (this.f26118c.f().contains(fVar)) {
            return w(fVar);
        }
        return null;
    }

    protected abstract void j(@d5.d Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> collection, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar);

    @d5.d
    protected final Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> k(@d5.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar, @d5.d z3.b bVar) {
        l0.p(dVar, ProtectedSandApp.s("蝳"));
        l0.p(lVar, ProtectedSandApp.s("蝴"));
        l0.p(bVar, ProtectedSandApp.s("蝵"));
        ArrayList arrayList = new ArrayList(0);
        d.a aVar = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f25977c;
        aVar.getClass();
        if (dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f25980f)) {
            j(arrayList, lVar);
        }
        this.f26118c.e(arrayList, dVar, lVar, bVar);
        aVar.getClass();
        if (dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f25986l)) {
            for (kotlin.reflect.jvm.internal.impl.name.f fVar : r()) {
                if (lVar.N(fVar).booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, p(fVar));
                }
            }
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f25977c.getClass();
        if (dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f25981g)) {
            for (kotlin.reflect.jvm.internal.impl.name.f fVar2 : this.f26118c.f()) {
                if (lVar.N(fVar2).booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, this.f26118c.g(fVar2));
                }
            }
        }
        return kotlin.reflect.jvm.internal.impl.utils.a.c(arrayList);
    }

    protected void l(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d List<z0> list) {
        l0.p(fVar, ProtectedSandApp.s("蝶"));
        l0.p(list, ProtectedSandApp.s("蝷"));
    }

    protected void m(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d List<u0> list) {
        l0.p(fVar, ProtectedSandApp.s("蝸"));
        l0.p(list, ProtectedSandApp.s("蝹"));
    }

    @d5.d
    protected abstract kotlin.reflect.jvm.internal.impl.name.b n(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar);

    @d5.d
    protected final kotlin.reflect.jvm.internal.impl.serialization.deserialization.m q() {
        return this.f26117b;
    }

    @d5.d
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> r() {
        return (Set) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f26119d, this, f26116f[0]);
    }

    @d5.e
    protected abstract Set<kotlin.reflect.jvm.internal.impl.name.f> t();

    @d5.d
    protected abstract Set<kotlin.reflect.jvm.internal.impl.name.f> u();

    @d5.d
    protected abstract Set<kotlin.reflect.jvm.internal.impl.name.f> v();

    protected boolean x(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(fVar, ProtectedSandApp.s("蝺"));
        return r().contains(fVar);
    }

    protected boolean y(@d5.d z0 z0Var) {
        l0.p(z0Var, ProtectedSandApp.s("蝻"));
        return true;
    }
}
