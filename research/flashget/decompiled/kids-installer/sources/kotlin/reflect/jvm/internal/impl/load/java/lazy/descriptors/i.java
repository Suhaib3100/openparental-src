package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import b4.d0;
import b4.u;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b;
import kotlin.reflect.jvm.internal.impl.load.java.p;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.a;
import kotlin.reflect.jvm.internal.impl.load.kotlin.p;
import kotlin.reflect.jvm.internal.impl.load.kotlin.q;
import kotlin.reflect.jvm.internal.impl.load.kotlin.r;

/* compiled from: LazyJavaPackageScope.kt */
/* loaded from: classes6.dex */
public final class i extends m {

    /* renamed from: n, reason: collision with root package name */
    @d5.d
    private final u f24702n;

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final h f24703o;

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.j<Set<String>> f24704p;

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.h<a, kotlin.reflect.jvm.internal.impl.descriptors.e> f24705q;

    /* compiled from: LazyJavaPackageScope.kt */
    /* loaded from: classes5.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        private final kotlin.reflect.jvm.internal.impl.name.f f24706a;

        /* renamed from: b, reason: collision with root package name */
        @d5.e
        private final b4.g f24707b;

        public a(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.e b4.g gVar) {
            l0.p(fVar, ProtectedSandApp.s("䩟"));
            this.f24706a = fVar;
            this.f24707b = gVar;
        }

        @d5.e
        public final b4.g a() {
            return this.f24707b;
        }

        @d5.d
        public final kotlin.reflect.jvm.internal.impl.name.f b() {
            return this.f24706a;
        }

        public boolean equals(@d5.e Object obj) {
            return (obj instanceof a) && l0.g(this.f24706a, ((a) obj).f24706a);
        }

        public int hashCode() {
            return this.f24706a.hashCode();
        }
    }

    /* compiled from: LazyJavaPackageScope.kt */
    /* loaded from: classes5.dex */
    private static abstract class b {

        /* compiled from: LazyJavaPackageScope.kt */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @d5.d
            private final kotlin.reflect.jvm.internal.impl.descriptors.e f24708a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
                super(null);
                l0.p(eVar, ProtectedSandApp.s("䩠"));
                this.f24708a = eVar;
            }

            @d5.d
            public final kotlin.reflect.jvm.internal.impl.descriptors.e a() {
                return this.f24708a;
            }
        }

        /* compiled from: LazyJavaPackageScope.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.i$b$b, reason: collision with other inner class name */
        public static final class C0288b extends b {

            /* renamed from: a, reason: collision with root package name */
            @d5.d
            public static final C0288b f24709a = new C0288b();

            private C0288b() {
                super(null);
            }
        }

        /* compiled from: LazyJavaPackageScope.kt */
        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            @d5.d
            public static final c f24710a = new c();

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
    static final class c extends Lambda implements q3.l<a, kotlin.reflect.jvm.internal.impl.descriptors.e> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.g f24712q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar) {
            super(1);
            this.f24712q = gVar;
        }

        @Override // q3.l
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.descriptors.e N(@d5.d a aVar) {
            byte[] bArr;
            l0.p(aVar, ProtectedSandApp.s("蔝"));
            kotlin.reflect.jvm.internal.impl.name.b bVar = new kotlin.reflect.jvm.internal.impl.name.b(i.this.R().f(), aVar.b());
            p.a c6 = aVar.a() != null ? this.f24712q.a().j().c(aVar.a()) : this.f24712q.a().j().b(bVar);
            r a6 = c6 != null ? c6.a() : null;
            kotlin.reflect.jvm.internal.impl.name.b h5 = a6 != null ? a6.h() : null;
            if (h5 != null && (h5.l() || h5.k())) {
                return null;
            }
            b S = i.this.S(a6);
            if (S instanceof b.a) {
                return ((b.a) S).a();
            }
            if (S instanceof b.c) {
                return null;
            }
            if (!(S instanceof b.C0288b)) {
                throw new NoWhenBranchMatchedException();
            }
            b4.g a7 = aVar.a();
            if (a7 == null) {
                kotlin.reflect.jvm.internal.impl.load.java.p d6 = this.f24712q.a().d();
                if (c6 != null) {
                    if (!(c6 instanceof p.a.C0304a)) {
                        c6 = null;
                    }
                    p.a.C0304a c0304a = (p.a.C0304a) c6;
                    if (c0304a != null) {
                        bArr = c0304a.b();
                        a7 = d6.a(new p.a(bVar, bArr, null, 4, null));
                    }
                }
                bArr = null;
                a7 = d6.a(new p.a(bVar, bArr, null, 4, null));
            }
            b4.g gVar = a7;
            if ((gVar != null ? gVar.L() : null) != d0.BINARY) {
                kotlin.reflect.jvm.internal.impl.name.c f6 = gVar != null ? gVar.f() : null;
                if (f6 == null || f6.d() || !l0.g(f6.e(), i.this.R().f())) {
                    return null;
                }
                f fVar = new f(this.f24712q, i.this.R(), gVar, null, 8, null);
                this.f24712q.a().e().a(fVar);
                return fVar;
            }
            throw new IllegalStateException(ProtectedSandApp.s("蔞") + gVar + ProtectedSandApp.s("蔟") + bVar + ProtectedSandApp.s("蔠") + q.a(this.f24712q.a().j(), gVar) + ProtectedSandApp.s("蔡") + q.b(this.f24712q.a().j(), bVar) + '\n');
        }
    }

    /* compiled from: LazyJavaPackageScope.kt */
    static final class d extends Lambda implements q3.a<Set<? extends String>> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.g f24713p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ i f24714q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, i iVar) {
            super(0);
            this.f24713p = gVar;
            this.f24714q = iVar;
        }

        @Override // q3.a
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set<String> n() {
            return this.f24713p.a().d().b(this.f24714q.R().f());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@d5.d kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, @d5.d u uVar, @d5.d h hVar) {
        super(gVar);
        l0.p(gVar, ProtectedSandApp.s("蔩"));
        l0.p(uVar, ProtectedSandApp.s("蔪"));
        l0.p(hVar, ProtectedSandApp.s("蔫"));
        this.f24702n = uVar;
        this.f24703o = hVar;
        this.f24704p = gVar.e().f(new d(gVar, this));
        this.f24705q = gVar.e().i(new c(gVar));
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.e O(kotlin.reflect.jvm.internal.impl.name.f fVar, b4.g gVar) {
        if (!kotlin.reflect.jvm.internal.impl.name.h.f25605a.a(fVar)) {
            return null;
        }
        Set<String> n5 = this.f24704p.n();
        if (gVar != null || n5 == null || n5.contains(fVar.h())) {
            return this.f24705q.N(new a(fVar, gVar));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b S(r rVar) {
        if (rVar == null) {
            return b.C0288b.f24709a;
        }
        if (rVar.a().c() != a.EnumC0299a.CLASS) {
            return b.c.f24710a;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e k5 = x().a().b().k(rVar);
        return k5 != null ? new b.a(k5) : b.C0288b.f24709a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    public kotlin.reflect.jvm.internal.impl.descriptors.m D() {
        return this.f24703o;
    }

    @d5.e
    public final kotlin.reflect.jvm.internal.impl.descriptors.e P(@d5.d b4.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("蔬"));
        return O(gVar.getName(), gVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.e
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.e h(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("蔭"));
        l0.p(bVar, ProtectedSandApp.s("蔮"));
        return O(fVar, null);
    }

    @d5.d
    protected h R() {
        return this.f24703o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j, kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    public Collection<u0> d(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("蔯"));
        l0.p(bVar, ProtectedSandApp.s("蔰"));
        return EmptyList.f23167o;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f A[SYNTHETIC] */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j, kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g(@d5.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d r5, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r6) {
        /*
            r4 = this;
            java.lang.String r0 = "蔱"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r5, r0)
            java.lang.String r0 = "蔲"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r6, r0)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.d$a r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f25977c
            r0.getClass()
            int r1 = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.c()
            r0.getClass()
            int r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.e()
            r0 = r0 | r1
            boolean r5 = r5.a(r0)
            if (r5 != 0) goto L2c
            kotlin.collections.m0 r5 = kotlin.collections.EmptyList.f23167o
            goto L75
        L2c:
            kotlin.reflect.jvm.internal.impl.storage.i r5 = r4.w()
            java.lang.Object r5 = r5.n()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L3f:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L74
            java.lang.Object r1 = r5.next()
            r2 = r1
            kotlin.reflect.jvm.internal.impl.descriptors.m r2 = (kotlin.reflect.jvm.internal.impl.descriptors.m) r2
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e
            if (r3 == 0) goto L6d
            kotlin.reflect.jvm.internal.impl.descriptors.e r2 = (kotlin.reflect.jvm.internal.impl.descriptors.e) r2
            kotlin.reflect.jvm.internal.impl.name.f r2 = r2.getName()
            java.lang.String r3 = "蔳"
            java.lang.String r3 = com.flashget.kidsdownloader.ProtectedSandApp.s(r3)
            kotlin.jvm.internal.l0.o(r2, r3)
            java.lang.Object r2 = r6.N(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L6d
            r2 = 1
            goto L6e
        L6d:
            r2 = 0
        L6e:
            if (r2 == 0) goto L3f
            r0.add(r1)
            goto L3f
        L74:
            r5 = r0
        L75:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.i.g(kotlin.reflect.jvm.internal.impl.resolve.scopes.d, q3.l):java.util.Collection");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    @d5.d
    protected Set<kotlin.reflect.jvm.internal.impl.name.f> m(@d5.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @d5.e q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("蔴"));
        kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f25977c.getClass();
        if (!dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f25979e)) {
            return EmptySet.f23181o;
        }
        Set<String> n5 = this.f24704p.n();
        if (n5 != null) {
            HashSet hashSet = new HashSet();
            Iterator<T> it = n5.iterator();
            while (it.hasNext()) {
                hashSet.add(kotlin.reflect.jvm.internal.impl.name.f.p((String) it.next()));
            }
            return hashSet;
        }
        u uVar = this.f24702n;
        if (lVar == null) {
            lVar = kotlin.reflect.jvm.internal.impl.utils.d.a();
        }
        Collection<b4.g> D = uVar.D(lVar);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (b4.g gVar : D) {
            kotlin.reflect.jvm.internal.impl.name.f name = gVar.L() == d0.SOURCE ? null : gVar.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    @d5.d
    protected Set<kotlin.reflect.jvm.internal.impl.name.f> o(@d5.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @d5.e q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("蔵"));
        return EmptySet.f23181o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    @d5.d
    protected kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b q() {
        return b.a.f24642a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    protected void s(@d5.d Collection<z0> collection, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(collection, ProtectedSandApp.s("蔶"));
        l0.p(fVar, ProtectedSandApp.s("蔷"));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    @d5.d
    protected Set<kotlin.reflect.jvm.internal.impl.name.f> u(@d5.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @d5.e q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("蔸"));
        return EmptySet.f23181o;
    }
}
