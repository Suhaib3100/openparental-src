package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b;
import kotlin.reflect.jvm.internal.impl.load.java.p;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.a;
import kotlin.reflect.jvm.internal.impl.load.kotlin.r;
import kotlin.reflect.jvm.internal.impl.load.kotlin.s;
import kotlin.reflect.jvm.internal.impl.load.kotlin.t;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.d;
import wd.d0;
import wd.u;

/* compiled from: LazyJavaPackageScope.kt */
@r1({"SMAP\nLazyJavaPackageScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaPackageScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaPackageScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,189:1\n1620#2,3:190\n1611#2:193\n1855#2:194\n1856#2:196\n1612#2:197\n766#2:198\n857#2,2:199\n1#3:195\n*S KotlinDebug\n*F\n+ 1 LazyJavaPackageScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaPackageScope\n*L\n160#1:190,3\n162#1:193\n162#1:194\n162#1:196\n162#1:197\n185#1:198\n185#1:199,2\n162#1:195\n*E\n"})
/* loaded from: classes7.dex */
public final class i extends m {

    /* renamed from: n, reason: collision with root package name */
    @fg.l
    private final u f76577n;

    /* renamed from: o, reason: collision with root package name */
    @fg.l
    private final h f76578o;

    /* renamed from: p, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.j<Set<String>> f76579p;

    /* renamed from: q, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.h<a, kotlin.reflect.jvm.internal.impl.descriptors.e> f76580q;

    /* compiled from: LazyJavaPackageScope.kt */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        private final kotlin.reflect.jvm.internal.impl.name.f f76581a;

        /* renamed from: b, reason: collision with root package name */
        @fg.m
        private final wd.g f76582b;

        public a(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.m wd.g gVar) {
            l0.p(fVar, ProtectedSandApp.s("熷\u0001"));
            this.f76581a = fVar;
            this.f76582b = gVar;
        }

        @fg.m
        public final wd.g a() {
            return this.f76582b;
        }

        @fg.l
        public final kotlin.reflect.jvm.internal.impl.name.f b() {
            return this.f76581a;
        }

        public boolean equals(@fg.m Object obj) {
            return (obj instanceof a) && l0.g(this.f76581a, ((a) obj).f76581a);
        }

        public int hashCode() {
            return this.f76581a.hashCode();
        }
    }

    /* compiled from: LazyJavaPackageScope.kt */
    private static abstract class b {

        /* compiled from: LazyJavaPackageScope.kt */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @fg.l
            private final kotlin.reflect.jvm.internal.impl.descriptors.e f76583a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
                super(null);
                l0.p(eVar, ProtectedSandApp.s("熸\u0001"));
                this.f76583a = eVar;
            }

            @fg.l
            public final kotlin.reflect.jvm.internal.impl.descriptors.e a() {
                return this.f76583a;
            }
        }

        /* compiled from: LazyJavaPackageScope.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.i$b$b, reason: collision with other inner class name */
        public static final class C1092b extends b {

            /* renamed from: a, reason: collision with root package name */
            @fg.l
            public static final C1092b f76584a = new C1092b(null);

            private C1092b() {
                super(null);
            }
        }

        /* compiled from: LazyJavaPackageScope.kt */
        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            @fg.l
            public static final c f76585a = new c(null);

            private c() {
                super(null);
            }
        }

        public /* synthetic */ b(w wVar) {
            this();
        }

        private b() {
        }
    }

    /* compiled from: LazyJavaPackageScope.kt */
    @r1({"SMAP\nLazyJavaPackageScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaPackageScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaPackageScope$classes$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,189:1\n1#2:190\n*E\n"})
    static final class c extends n0 implements ld.l<a, kotlin.reflect.jvm.internal.impl.descriptors.e> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.g f76587c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar) {
            super(1);
            this.f76587c = gVar;
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.descriptors.e invoke(@fg.l a aVar) {
            l0.p(aVar, ProtectedSandApp.s("熹\u0001"));
            kotlin.reflect.jvm.internal.impl.name.b bVar = new kotlin.reflect.jvm.internal.impl.name.b(i.this.T().g(), aVar.b());
            r.a b5 = aVar.a() != null ? this.f76587c.a().j().b(aVar.a(), i.this.S()) : this.f76587c.a().j().a(bVar, i.this.S());
            t a5 = b5 != null ? b5.a() : null;
            kotlin.reflect.jvm.internal.impl.name.b m4 = a5 != null ? a5.m() : null;
            if (m4 != null && (m4.l() || m4.k())) {
                return null;
            }
            b U = i.this.U(a5);
            if (U instanceof b.a) {
                return ((b.a) U).a();
            }
            if (U instanceof b.c) {
                return null;
            }
            if (!(U instanceof b.C1092b)) {
                throw new NoWhenBranchMatchedException();
            }
            wd.g a6 = aVar.a();
            if (a6 == null) {
                p d5 = this.f76587c.a().d();
                r.a.C1109a c1109a = b5 instanceof r.a.C1109a ? (r.a.C1109a) b5 : null;
                a6 = d5.a(new p.a(bVar, c1109a != null ? c1109a.b() : null, null, 4, null));
            }
            wd.g gVar = a6;
            if ((gVar != null ? gVar.K() : null) != d0.BINARY) {
                kotlin.reflect.jvm.internal.impl.name.c g4 = gVar != null ? gVar.g() : null;
                if (g4 == null || g4.d() || !l0.g(g4.e(), i.this.T().g())) {
                    return null;
                }
                f fVar = new f(this.f76587c, i.this.T(), gVar, null, 8, null);
                this.f76587c.a().e().a(fVar);
                return fVar;
            }
            throw new IllegalStateException(ProtectedSandApp.s("熺\u0001") + gVar + ProtectedSandApp.s("熻\u0001") + bVar + ProtectedSandApp.s("熼\u0001") + s.b(this.f76587c.a().j(), gVar, i.this.S()) + ProtectedSandApp.s("熽\u0001") + s.a(this.f76587c.a().j(), bVar, i.this.S()) + '\n');
        }
    }

    /* compiled from: LazyJavaPackageScope.kt */
    static final class d extends n0 implements ld.a<Set<? extends String>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.g f76588b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f76589c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, i iVar) {
            super(0);
            this.f76588b = gVar;
            this.f76589c = iVar;
        }

        @Override // ld.a
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set<String> invoke() {
            return this.f76588b.a().d().c(this.f76589c.T().g());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@fg.l kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, @fg.l u uVar, @fg.l h hVar) {
        super(gVar);
        l0.p(gVar, ProtectedSandApp.s("燅\u0001"));
        l0.p(uVar, ProtectedSandApp.s("燆\u0001"));
        l0.p(hVar, ProtectedSandApp.s("燇\u0001"));
        this.f76577n = uVar;
        this.f76578o = hVar;
        this.f76579p = gVar.e().i(new d(gVar, this));
        this.f76580q = gVar.e().b(new c(gVar));
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.e P(kotlin.reflect.jvm.internal.impl.name.f fVar, wd.g gVar) {
        if (!kotlin.reflect.jvm.internal.impl.name.h.f77588a.a(fVar)) {
            return null;
        }
        Set<String> invoke = this.f76579p.invoke();
        if (gVar != null || invoke == null || invoke.contains(fVar.b())) {
            return this.f76580q.invoke(new a(fVar, gVar));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e S() {
        return kotlin.reflect.jvm.internal.impl.utils.c.a(x().a().b().d().g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b U(t tVar) {
        if (tVar == null) {
            return b.C1092b.f76584a;
        }
        if (tVar.o().c() != a.EnumC1104a.CLASS) {
            return b.c.f76585a;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e l4 = x().a().b().l(tVar);
        return l4 != null ? new b.a(l4) : b.C1092b.f76584a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    public kotlin.reflect.jvm.internal.impl.descriptors.m D() {
        return this.f76578o;
    }

    @fg.m
    public final kotlin.reflect.jvm.internal.impl.descriptors.e Q(@fg.l wd.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("燈\u0001"));
        return P(gVar.getName(), gVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.m
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.e f(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("燉\u0001"));
        l0.p(bVar, ProtectedSandApp.s("燊\u0001"));
        return P(fVar, null);
    }

    @fg.l
    protected h T() {
        return this.f76578o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j, kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.l
    public Collection<u0> b(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("燉\u0001"));
        l0.p(bVar, ProtectedSandApp.s("燊\u0001"));
        return j0.f74919b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j, kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.l
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g(@fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("燋\u0001"));
        l0.p(lVar, ProtectedSandApp.s("燌\u0001"));
        d.a aVar = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f77961c;
        aVar.getClass();
        int i4 = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f77970l;
        aVar.getClass();
        if (!dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f77963e | i4)) {
            return j0.f74919b;
        }
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> invoke = w().invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : invoke) {
            kotlin.reflect.jvm.internal.impl.descriptors.m mVar = (kotlin.reflect.jvm.internal.impl.descriptors.m) obj;
            if (mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                kotlin.reflect.jvm.internal.impl.name.f name = ((kotlin.reflect.jvm.internal.impl.descriptors.e) mVar).getName();
                l0.o(name, ProtectedSandApp.s("燍\u0001"));
                if (lVar.invoke(name).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    @fg.l
    protected Set<kotlin.reflect.jvm.internal.impl.name.f> m(@fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @fg.m ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("燋\u0001"));
        kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f77961c.getClass();
        if (!dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f77963e)) {
            return kotlin.collections.l0.f74939b;
        }
        Set<String> invoke = this.f76579p.invoke();
        if (invoke != null) {
            HashSet hashSet = new HashSet();
            Iterator<T> it = invoke.iterator();
            while (it.hasNext()) {
                hashSet.add(kotlin.reflect.jvm.internal.impl.name.f.f((String) it.next()));
            }
            return hashSet;
        }
        u uVar = this.f76577n;
        if (lVar == null) {
            lVar = kotlin.reflect.jvm.internal.impl.utils.e.a();
        }
        Collection<wd.g> F = uVar.F(lVar);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (wd.g gVar : F) {
            kotlin.reflect.jvm.internal.impl.name.f name = gVar.K() == d0.SOURCE ? null : gVar.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    @fg.l
    protected Set<kotlin.reflect.jvm.internal.impl.name.f> o(@fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @fg.m ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("燋\u0001"));
        return kotlin.collections.l0.f74939b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    @fg.l
    protected kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b q() {
        return b.a.f76501a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    protected void s(@fg.l Collection<z0> collection, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(collection, ProtectedSandApp.s("燎\u0001"));
        l0.p(fVar, ProtectedSandApp.s("燉\u0001"));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    @fg.l
    protected Set<kotlin.reflect.jvm.internal.impl.name.f> u(@fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @fg.m ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("燋\u0001"));
        return kotlin.collections.l0.f74939b;
    }
}
