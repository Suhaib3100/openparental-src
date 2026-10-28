package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.List;
import kotlin.k2;

/* compiled from: AbstractTypeConstructor.kt */
/* loaded from: classes7.dex */
public abstract class h extends n {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.i<b> f78460b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f78461c;

    /* compiled from: AbstractTypeConstructor.kt */
    private final class a implements h1 {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        private final kotlin.reflect.jvm.internal.impl.types.checker.g f78462a;

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        private final kotlin.b0 f78463b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f78464c;

        /* compiled from: AbstractTypeConstructor.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.types.h$a$a, reason: collision with other inner class name */
        static final class C1194a extends kotlin.jvm.internal.n0 implements ld.a<List<? extends h0>> {

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ h f78466c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1194a(h hVar) {
                super(0);
                this.f78466c = hVar;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<h0> invoke() {
                return kotlin.reflect.jvm.internal.impl.types.checker.h.b(a.this.f78462a, this.f78466c.j());
            }
        }

        public a(@fg.l h hVar, kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("罒\u0001"));
            this.f78464c = hVar;
            this.f78462a = gVar;
            this.f78463b = kotlin.c0.b(kotlin.f0.PUBLICATION, new C1194a(hVar));
        }

        private final List<h0> f() {
            return (List) this.f78463b.getValue();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        @fg.l
        public h1 a(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("罒\u0001"));
            return this.f78464c.a(gVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        @fg.l
        public kotlin.reflect.jvm.internal.impl.descriptors.h c() {
            return this.f78464c.c();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        public boolean d() {
            return this.f78464c.d();
        }

        public boolean equals(@fg.m Object obj) {
            return this.f78464c.equals(obj);
        }

        @fg.l
        public List<h0> g() {
            return f();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        @fg.l
        public List<kotlin.reflect.jvm.internal.impl.descriptors.f1> getParameters() {
            List<kotlin.reflect.jvm.internal.impl.descriptors.f1> parameters = this.f78464c.getParameters();
            kotlin.jvm.internal.l0.o(parameters, ProtectedSandApp.s("罓\u0001"));
            return parameters;
        }

        public int hashCode() {
            return this.f78464c.hashCode();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        public Collection j() {
            return f();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.h1
        @fg.l
        public kotlin.reflect.jvm.internal.impl.builtins.h p() {
            kotlin.reflect.jvm.internal.impl.builtins.h p4 = this.f78464c.p();
            kotlin.jvm.internal.l0.o(p4, ProtectedSandApp.s("罔\u0001"));
            return p4;
        }

        @fg.l
        public String toString() {
            return this.f78464c.toString();
        }
    }

    /* compiled from: AbstractTypeConstructor.kt */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        private final Collection<h0> f78467a;

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        private List<? extends h0> f78468b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@fg.l Collection<? extends h0> collection) {
            kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("罕\u0001"));
            this.f78467a = collection;
            this.f78468b = kotlin.collections.w.k(kotlin.reflect.jvm.internal.impl.types.error.k.f78413a.l());
        }

        @fg.l
        public final Collection<h0> a() {
            return this.f78467a;
        }

        @fg.l
        public final List<h0> b() {
            return this.f78468b;
        }

        public final void c(@fg.l List<? extends h0> list) {
            kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("罖\u0001"));
            this.f78468b = list;
        }
    }

    /* compiled from: AbstractTypeConstructor.kt */
    static final class c extends kotlin.jvm.internal.n0 implements ld.a<b> {
        c() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke() {
            return new b(h.this.k());
        }
    }

    /* compiled from: AbstractTypeConstructor.kt */
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<Boolean, b> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f78470b = new d(1);

        d() {
            super(1);
        }

        @fg.l
        public final b a(boolean z4) {
            return new b(kotlin.collections.w.k(kotlin.reflect.jvm.internal.impl.types.error.k.f78413a.l()));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ b invoke(Boolean bool) {
            return a(bool.booleanValue());
        }
    }

    /* compiled from: AbstractTypeConstructor.kt */
    @kotlin.jvm.internal.r1({"SMAP\nAbstractTypeConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractTypeConstructor.kt\norg/jetbrains/kotlin/types/AbstractTypeConstructor$supertypes$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
    static final class e extends kotlin.jvm.internal.n0 implements ld.l<b, k2> {

        /* compiled from: AbstractTypeConstructor.kt */
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<h1, Iterable<? extends h0>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f78472b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar) {
                super(1);
                this.f78472b = hVar;
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Iterable<h0> invoke(@fg.l h1 h1Var) {
                kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("罗\u0001"));
                return this.f78472b.i(h1Var, true);
            }
        }

        /* compiled from: AbstractTypeConstructor.kt */
        static final class b extends kotlin.jvm.internal.n0 implements ld.l<h0, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f78473b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(h hVar) {
                super(1);
                this.f78473b = hVar;
            }

            public final void a(@fg.l h0 h0Var) {
                kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("罘\u0001"));
                this.f78473b.s(h0Var);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(h0 h0Var) {
                a(h0Var);
                return k2.f75408a;
            }
        }

        /* compiled from: AbstractTypeConstructor.kt */
        static final class c extends kotlin.jvm.internal.n0 implements ld.l<h1, Iterable<? extends h0>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f78474b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(h hVar) {
                super(1);
                this.f78474b = hVar;
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Iterable<h0> invoke(@fg.l h1 h1Var) {
                kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("罙\u0001"));
                return this.f78474b.i(h1Var, false);
            }
        }

        /* compiled from: AbstractTypeConstructor.kt */
        static final class d extends kotlin.jvm.internal.n0 implements ld.l<h0, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f78475b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(h hVar) {
                super(1);
                this.f78475b = hVar;
            }

            public final void a(@fg.l h0 h0Var) {
                kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("罚\u0001"));
                this.f78475b.t(h0Var);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(h0 h0Var) {
                a(h0Var);
                return k2.f75408a;
            }
        }

        e() {
            super(1);
        }

        public final void a(@fg.l b bVar) {
            kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("罛\u0001"));
            List a5 = h.this.o().a(h.this, bVar.a(), new c(h.this), new d(h.this));
            if (a5.isEmpty()) {
                h0 l4 = h.this.l();
                List k4 = l4 != null ? kotlin.collections.w.k(l4) : null;
                if (k4 == null) {
                    k4 = kotlin.collections.j0.f74919b;
                }
                a5 = k4;
            }
            if (h.this.n()) {
                kotlin.reflect.jvm.internal.impl.descriptors.d1 o4 = h.this.o();
                h hVar = h.this;
                o4.a(hVar, a5, new a(hVar), new b(h.this));
            }
            h hVar2 = h.this;
            List<h0> list = a5 instanceof List ? (List) a5 : null;
            if (list == null) {
                list = kotlin.collections.w.V5(a5);
            }
            bVar.c(hVar2.r(list));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(b bVar) {
            a(bVar);
            return k2.f75408a;
        }
    }

    public h(@fg.l kotlin.reflect.jvm.internal.impl.storage.n nVar) {
        kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("栫\u0001"));
        this.f78460b = nVar.g(new c(), d.f78470b, new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<h0> i(h1 h1Var, boolean z4) {
        List D4;
        h hVar = h1Var instanceof h ? (h) h1Var : null;
        if (hVar != null && (D4 = kotlin.collections.w.D4(hVar.f78460b.invoke().a(), hVar.m(z4))) != null) {
            return D4;
        }
        Collection<h0> j4 = h1Var.j();
        kotlin.jvm.internal.l0.o(j4, ProtectedSandApp.s("栬\u0001"));
        return j4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @fg.l
    public h1 a(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("栭\u0001"));
        return new a(this, gVar);
    }

    @fg.l
    protected abstract Collection<h0> k();

    @fg.m
    protected h0 l() {
        return null;
    }

    @fg.l
    protected Collection<h0> m(boolean z4) {
        return kotlin.collections.j0.f74919b;
    }

    protected boolean n() {
        return this.f78461c;
    }

    @fg.l
    protected abstract kotlin.reflect.jvm.internal.impl.descriptors.d1 o();

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @fg.l
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public List<h0> j() {
        return this.f78460b.invoke().b();
    }

    @fg.l
    protected List<h0> r(@fg.l List<h0> list) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("栮\u0001"));
        return list;
    }

    protected void s(@fg.l h0 h0Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("栯\u0001"));
    }

    protected void t(@fg.l h0 h0Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("栯\u0001"));
    }
}
