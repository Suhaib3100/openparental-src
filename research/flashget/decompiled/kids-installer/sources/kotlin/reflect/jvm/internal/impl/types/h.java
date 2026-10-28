package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.m2;

/* compiled from: AbstractTypeConstructor.kt */
/* loaded from: classes6.dex */
public abstract class h extends n {

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i<b> f26451b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f26452c;

    /* compiled from: AbstractTypeConstructor.kt */
    private final class a implements h1 {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        private final kotlin.reflect.jvm.internal.impl.types.checker.g f26453a;

        /* renamed from: b, reason: collision with root package name */
        @d5.d
        private final Lazy f26454b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f26455c;

        /* compiled from: AbstractTypeConstructor.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.types.h$a$a, reason: collision with other inner class name */
        static final class C0390a extends Lambda implements q3.a<List<? extends h0>> {

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ h f26457q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0390a(h hVar) {
                super(0);
                this.f26457q = hVar;
            }

            @Override // q3.a
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<h0> n() {
                return kotlin.reflect.jvm.internal.impl.types.checker.h.b(a.this.f26453a, this.f26457q.m());
            }
        }

        public a(@d5.d h hVar, kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            Lazy b6;
            kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("襇"));
            this.f26455c = hVar;
            this.f26453a = gVar;
            b6 = kotlin.d0.b(LazyThreadSafetyMode.PUBLICATION, new C0390a(hVar));
            this.f26454b = b6;
        }

        private final List<h0> g() {
            return (List) this.f26454b.getValue();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        @d5.d
        public kotlin.reflect.jvm.internal.impl.builtins.h A() {
            kotlin.reflect.jvm.internal.impl.builtins.h A = this.f26455c.A();
            kotlin.jvm.internal.l0.o(A, ProtectedSandApp.s("襈"));
            return A;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        @d5.d
        public h1 a(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("襉"));
            return this.f26455c.a(gVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        @d5.d
        public kotlin.reflect.jvm.internal.impl.descriptors.h b() {
            return this.f26455c.b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        public boolean d() {
            return this.f26455c.d();
        }

        public boolean equals(@d5.e Object obj) {
            return this.f26455c.equals(obj);
        }

        @d5.d
        public List<h0> h() {
            return g();
        }

        public int hashCode() {
            return this.f26455c.hashCode();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        public Collection m() {
            return g();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        @d5.d
        public List<kotlin.reflect.jvm.internal.impl.descriptors.f1> r() {
            List<kotlin.reflect.jvm.internal.impl.descriptors.f1> r5 = this.f26455c.r();
            kotlin.jvm.internal.l0.o(r5, ProtectedSandApp.s("襊"));
            return r5;
        }

        @d5.d
        public String toString() {
            return this.f26455c.toString();
        }
    }

    /* compiled from: AbstractTypeConstructor.kt */
    /* loaded from: classes5.dex */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        private final Collection<h0> f26458a;

        /* renamed from: b, reason: collision with root package name */
        @d5.d
        private List<? extends h0> f26459b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@d5.d Collection<? extends h0> collection) {
            List<? extends h0> k5;
            kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("圲"));
            this.f26458a = collection;
            k5 = kotlin.collections.z.k(kotlin.reflect.jvm.internal.impl.types.error.k.f26404a.l());
            this.f26459b = k5;
        }

        @d5.d
        public final Collection<h0> a() {
            return this.f26458a;
        }

        @d5.d
        public final List<h0> b() {
            return this.f26459b;
        }

        public final void c(@d5.d List<? extends h0> list) {
            kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("圳"));
            this.f26459b = list;
        }
    }

    /* compiled from: AbstractTypeConstructor.kt */
    static final class c extends Lambda implements q3.a<b> {
        c() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b n() {
            return new b(h.this.k());
        }
    }

    /* compiled from: AbstractTypeConstructor.kt */
    static final class d extends Lambda implements q3.l<Boolean, b> {

        /* renamed from: p, reason: collision with root package name */
        public static final d f26461p = new d();

        d() {
            super(1);
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ b N(Boolean bool) {
            return a(bool.booleanValue());
        }

        @d5.d
        public final b a(boolean z5) {
            List k5;
            k5 = kotlin.collections.z.k(kotlin.reflect.jvm.internal.impl.types.error.k.f26404a.l());
            return new b(k5);
        }
    }

    /* compiled from: AbstractTypeConstructor.kt */
    static final class e extends Lambda implements q3.l<b, m2> {

        /* compiled from: AbstractTypeConstructor.kt */
        static final class a extends Lambda implements q3.l<h1, Iterable<? extends h0>> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ h f26463p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar) {
                super(1);
                this.f26463p = hVar;
            }

            @Override // q3.l
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Iterable<h0> N(@d5.d h1 h1Var) {
                kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("襋"));
                return this.f26463p.j(h1Var, true);
            }
        }

        /* compiled from: AbstractTypeConstructor.kt */
        static final class b extends Lambda implements q3.l<h0, m2> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ h f26464p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(h hVar) {
                super(1);
                this.f26464p = hVar;
            }

            @Override // q3.l
            public /* bridge */ /* synthetic */ m2 N(h0 h0Var) {
                a(h0Var);
                return m2.f23662a;
            }

            public final void a(@d5.d h0 h0Var) {
                kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("襌"));
                this.f26464p.t(h0Var);
            }
        }

        /* compiled from: AbstractTypeConstructor.kt */
        static final class c extends Lambda implements q3.l<h1, Iterable<? extends h0>> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ h f26465p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(h hVar) {
                super(1);
                this.f26465p = hVar;
            }

            @Override // q3.l
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Iterable<h0> N(@d5.d h1 h1Var) {
                kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("襍"));
                return this.f26465p.j(h1Var, false);
            }
        }

        /* compiled from: AbstractTypeConstructor.kt */
        static final class d extends Lambda implements q3.l<h0, m2> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ h f26466p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(h hVar) {
                super(1);
                this.f26466p = hVar;
            }

            @Override // q3.l
            public /* bridge */ /* synthetic */ m2 N(h0 h0Var) {
                a(h0Var);
                return m2.f23662a;
            }

            public final void a(@d5.d h0 h0Var) {
                kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("襎"));
                this.f26466p.u(h0Var);
            }
        }

        e() {
            super(1);
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ m2 N(b bVar) {
            a(bVar);
            return m2.f23662a;
        }

        public final void a(@d5.d b bVar) {
            kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("襏"));
            Collection<h0> a6 = h.this.p().a(h.this, bVar.a(), new c(h.this), new d(h.this));
            if (a6.isEmpty()) {
                h0 l5 = h.this.l();
                a6 = l5 != null ? kotlin.collections.z.k(l5) : null;
                if (a6 == null) {
                    a6 = EmptyList.f23167o;
                }
            }
            if (h.this.o()) {
                kotlin.reflect.jvm.internal.impl.descriptors.d1 p5 = h.this.p();
                h hVar = h.this;
                p5.a(hVar, a6, new a(hVar), new b(h.this));
            }
            h hVar2 = h.this;
            List<h0> list = a6 instanceof List ? (List) a6 : null;
            if (list == null) {
                list = kotlin.collections.j0.V5(a6);
            }
            bVar.c(hVar2.s(list));
        }
    }

    public h(@d5.d kotlin.reflect.jvm.internal.impl.storage.n nVar) {
        kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("耫"));
        this.f26451b = nVar.c(new c(), d.f26461p, new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000b, code lost:
    
        r4 = kotlin.collections.j0.D4(r0.f26451b.n().a(), r0.n(r4));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.h0> j(kotlin.reflect.jvm.internal.impl.types.h1 r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.types.h
            if (r0 == 0) goto L8
            r0 = r3
            kotlin.reflect.jvm.internal.impl.types.h r0 = (kotlin.reflect.jvm.internal.impl.types.h) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto L22
            kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.types.h$b> r1 = r0.f26451b
            java.lang.Object r1 = r1.n()
            kotlin.reflect.jvm.internal.impl.types.h$b r1 = (kotlin.reflect.jvm.internal.impl.types.h.b) r1
            java.util.Collection r1 = r1.a()
            java.util.Collection r4 = r0.n(r4)
            java.util.List r4 = kotlin.collections.y.D4(r1, r4)
            if (r4 == 0) goto L22
            goto L2f
        L22:
            java.util.Collection r4 = r3.m()
            java.lang.String r3 = "耬"
            java.lang.String r3 = com.flashget.kidsdownloader.ProtectedSandApp.s(r3)
            kotlin.jvm.internal.l0.o(r4, r3)
        L2f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.h.j(kotlin.reflect.jvm.internal.impl.types.h1, boolean):java.util.Collection");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @d5.d
    public h1 a(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("耭"));
        return new a(this, gVar);
    }

    @d5.d
    protected abstract Collection<h0> k();

    @d5.e
    protected h0 l() {
        return null;
    }

    @d5.d
    protected Collection<h0> n(boolean z5) {
        return EmptyList.f23167o;
    }

    protected boolean o() {
        return this.f26452c;
    }

    @d5.d
    protected abstract kotlin.reflect.jvm.internal.impl.descriptors.d1 p();

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @d5.d
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public List<h0> m() {
        return this.f26451b.n().b();
    }

    @d5.d
    protected List<h0> s(@d5.d List<h0> list) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("耮"));
        return list;
    }

    protected void t(@d5.d h0 h0Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("耯"));
    }

    protected void u(@d5.d h0 h0Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("耰"));
    }
}
