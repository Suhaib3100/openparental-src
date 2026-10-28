package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import b4.r;
import b4.x;
import b4.y;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.IndexedValue;
import kotlin.collections.b0;
import kotlin.collections.e1;
import kotlin.collections.j0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.w;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.c;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.s1;
import kotlin.reflect.jvm.internal.impl.types.t1;

/* compiled from: LazyJavaScope.kt */
/* loaded from: classes6.dex */
public abstract class j extends kotlin.reflect.jvm.internal.impl.resolve.scopes.i {

    /* renamed from: m, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f24715m = {l1.u(new g1(l1.d(j.class), ProtectedSandApp.s("蒨"), ProtectedSandApp.s("蒩"))), l1.u(new g1(l1.d(j.class), ProtectedSandApp.s("蒪"), ProtectedSandApp.s("蒫"))), l1.u(new g1(l1.d(j.class), ProtectedSandApp.s("蒬"), ProtectedSandApp.s("蒭")))};

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.g f24716b;

    /* renamed from: c, reason: collision with root package name */
    @d5.e
    private final j f24717c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i<Collection<kotlin.reflect.jvm.internal.impl.descriptors.m>> f24718d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b> f24719e;

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.f, Collection<z0>> f24720f;

    /* renamed from: g, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.f, u0> f24721g;

    /* renamed from: h, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.f, Collection<z0>> f24722h;

    /* renamed from: i, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i f24723i;

    /* renamed from: j, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i f24724j;

    /* renamed from: k, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i f24725k;

    /* renamed from: l, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.f, List<u0>> f24726l;

    /* compiled from: LazyJavaScope.kt */
    /* loaded from: classes5.dex */
    protected static final class a {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        private final h0 f24727a;

        /* renamed from: b, reason: collision with root package name */
        @d5.e
        private final h0 f24728b;

        /* renamed from: c, reason: collision with root package name */
        @d5.d
        private final List<j1> f24729c;

        /* renamed from: d, reason: collision with root package name */
        @d5.d
        private final List<f1> f24730d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f24731e;

        /* renamed from: f, reason: collision with root package name */
        @d5.d
        private final List<String> f24732f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@d5.d h0 h0Var, @d5.e h0 h0Var2, @d5.d List<? extends j1> list, @d5.d List<? extends f1> list2, boolean z5, @d5.d List<String> list3) {
            l0.p(h0Var, ProtectedSandApp.s("䩡"));
            l0.p(list, ProtectedSandApp.s("䩢"));
            l0.p(list2, ProtectedSandApp.s("䩣"));
            l0.p(list3, ProtectedSandApp.s("䩤"));
            this.f24727a = h0Var;
            this.f24728b = h0Var2;
            this.f24729c = list;
            this.f24730d = list2;
            this.f24731e = z5;
            this.f24732f = list3;
        }

        @d5.d
        public final List<String> a() {
            return this.f24732f;
        }

        public final boolean b() {
            return this.f24731e;
        }

        @d5.e
        public final h0 c() {
            return this.f24728b;
        }

        @d5.d
        public final h0 d() {
            return this.f24727a;
        }

        @d5.d
        public final List<f1> e() {
            return this.f24730d;
        }

        public boolean equals(@d5.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l0.g(this.f24727a, aVar.f24727a) && l0.g(this.f24728b, aVar.f24728b) && l0.g(this.f24729c, aVar.f24729c) && l0.g(this.f24730d, aVar.f24730d) && this.f24731e == aVar.f24731e && l0.g(this.f24732f, aVar.f24732f);
        }

        @d5.d
        public final List<j1> f() {
            return this.f24729c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f24727a.hashCode() * 31;
            h0 h0Var = this.f24728b;
            int hashCode2 = (this.f24730d.hashCode() + ((this.f24729c.hashCode() + ((hashCode + (h0Var == null ? 0 : h0Var.hashCode())) * 31)) * 31)) * 31;
            boolean z5 = this.f24731e;
            int i5 = z5;
            if (z5 != 0) {
                i5 = 1;
            }
            return this.f24732f.hashCode() + ((hashCode2 + i5) * 31);
        }

        @d5.d
        public String toString() {
            return ProtectedSandApp.s("䩥") + this.f24727a + ProtectedSandApp.s("䩦") + this.f24728b + ProtectedSandApp.s("䩧") + this.f24729c + ProtectedSandApp.s("䩨") + this.f24730d + ProtectedSandApp.s("䩩") + this.f24731e + ProtectedSandApp.s("䩪") + this.f24732f + ')';
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* loaded from: classes5.dex */
    protected static final class b {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        private final List<j1> f24733a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f24734b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@d5.d List<? extends j1> list, boolean z5) {
            l0.p(list, ProtectedSandApp.s("䩫"));
            this.f24733a = list;
            this.f24734b = z5;
        }

        @d5.d
        public final List<j1> a() {
            return this.f24733a;
        }

        public final boolean b() {
            return this.f24734b;
        }
    }

    /* compiled from: LazyJavaScope.kt */
    static final class c extends Lambda implements q3.a<Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.m>> {
        c() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> n() {
            return j.this.n(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f25989o, kotlin.reflect.jvm.internal.impl.resolve.scopes.h.f26014a.a());
        }
    }

    /* compiled from: LazyJavaScope.kt */
    static final class d extends Lambda implements q3.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>> {
        d() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set<kotlin.reflect.jvm.internal.impl.name.f> n() {
            return j.this.m(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f25994t, null);
        }
    }

    /* compiled from: LazyJavaScope.kt */
    static final class e extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.name.f, u0> {
        e() {
            super(1);
        }

        @Override // q3.l
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u0 N(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("蔹"));
            if (j.this.C() != null) {
                return (u0) j.this.C().f24721g.N(fVar);
            }
            b4.n c6 = j.this.z().n().c(fVar);
            if (c6 == null || c6.J()) {
                return null;
            }
            return j.this.K(c6);
        }
    }

    /* compiled from: LazyJavaScope.kt */
    static final class f extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends z0>> {
        f() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<z0> N(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("蔺"));
            if (j.this.C() != null) {
                return (Collection) j.this.C().f24720f.N(fVar);
            }
            ArrayList arrayList = new ArrayList();
            for (r rVar : j.this.z().n().f(fVar)) {
                kotlin.reflect.jvm.internal.impl.load.java.descriptors.e J = j.this.J(rVar);
                if (j.this.H(J)) {
                    j.this.x().a().h().e(rVar, J);
                    arrayList.add(J);
                }
            }
            j.this.p(arrayList, fVar);
            return arrayList;
        }
    }

    /* compiled from: LazyJavaScope.kt */
    static final class g extends Lambda implements q3.a<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b> {
        g() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b n() {
            return j.this.q();
        }
    }

    /* compiled from: LazyJavaScope.kt */
    static final class h extends Lambda implements q3.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>> {
        h() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set<kotlin.reflect.jvm.internal.impl.name.f> n() {
            return j.this.o(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f25996v, null);
        }
    }

    /* compiled from: LazyJavaScope.kt */
    static final class i extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends z0>> {
        i() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<z0> N(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
            List V5;
            l0.p(fVar, ProtectedSandApp.s("蔻"));
            LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) j.this.f24720f.N(fVar));
            j.this.M(linkedHashSet);
            j.this.s(linkedHashSet, fVar);
            V5 = j0.V5(j.this.x().a().r().g(j.this.x(), linkedHashSet));
            return V5;
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j$j, reason: collision with other inner class name */
    static final class C0289j extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.name.f, List<? extends u0>> {
        C0289j() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<u0> N(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
            List<u0> V5;
            List<u0> V52;
            l0.p(fVar, ProtectedSandApp.s("蔼"));
            ArrayList arrayList = new ArrayList();
            kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, j.this.f24721g.N(fVar));
            j.this.t(fVar, arrayList);
            if (kotlin.reflect.jvm.internal.impl.resolve.e.t(j.this.D())) {
                V52 = j0.V5(arrayList);
                return V52;
            }
            V5 = j0.V5(j.this.x().a().r().g(j.this.x(), arrayList));
            return V5;
        }
    }

    /* compiled from: LazyJavaScope.kt */
    static final class k extends Lambda implements q3.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>> {
        k() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set<kotlin.reflect.jvm.internal.impl.name.f> n() {
            return j.this.u(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f25997w, null);
        }
    }

    /* compiled from: LazyJavaScope.kt */
    static final class l extends Lambda implements q3.a<kotlin.reflect.jvm.internal.impl.storage.j<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ b4.n f24745q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ c0 f24746r;

        /* compiled from: LazyJavaScope.kt */
        static final class a extends Lambda implements q3.a<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ j f24747p;

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ b4.n f24748q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ c0 f24749r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j jVar, b4.n nVar, c0 c0Var) {
                super(0);
                this.f24747p = jVar;
                this.f24748q = nVar;
                this.f24749r = c0Var;
            }

            @Override // q3.a
            @d5.e
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> n() {
                return this.f24747p.x().a().g().a(this.f24748q, this.f24749r);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(b4.n nVar, c0 c0Var) {
            super(0);
            this.f24745q = nVar;
            this.f24746r = c0Var;
        }

        @Override // q3.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> n() {
            return j.this.x().e().f(new a(j.this, this.f24745q, this.f24746r));
        }
    }

    /* compiled from: LazyJavaScope.kt */
    static final class m extends Lambda implements q3.l<z0, kotlin.reflect.jvm.internal.impl.descriptors.a> {

        /* renamed from: p, reason: collision with root package name */
        public static final m f24750p = new m();

        m() {
            super(1);
        }

        @Override // q3.l
        public kotlin.reflect.jvm.internal.impl.descriptors.a N(z0 z0Var) {
            z0 z0Var2 = z0Var;
            l0.p(z0Var2, ProtectedSandApp.s("蔽"));
            return z0Var2;
        }

        @d5.d
        public final kotlin.reflect.jvm.internal.impl.descriptors.a a(@d5.d z0 z0Var) {
            l0.p(z0Var, ProtectedSandApp.s("蔾"));
            return z0Var;
        }
    }

    public /* synthetic */ j(kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, j jVar, int i5, w wVar) {
        this(gVar, (i5 & 2) != 0 ? null : jVar);
    }

    private final Set<kotlin.reflect.jvm.internal.impl.name.f> B() {
        return (Set) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f24723i, this, f24715m[0]);
    }

    private final Set<kotlin.reflect.jvm.internal.impl.name.f> E() {
        return (Set) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f24724j, this, f24715m[1]);
    }

    private final h0 F(b4.n nVar) {
        h0 o5 = this.f24716b.g().o(nVar.getType(), kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(s1.COMMON, false, false, null, 7, null));
        if (!((kotlin.reflect.jvm.internal.impl.builtins.h.r0(o5) || kotlin.reflect.jvm.internal.impl.builtins.h.u0(o5)) && G(nVar) && nVar.R())) {
            return o5;
        }
        h0 n5 = t1.n(o5);
        l0.o(n5, ProtectedSandApp.s("蒯"));
        return n5;
    }

    private final boolean G(b4.n nVar) {
        return nVar.a() && nVar.T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u0 K(b4.n nVar) {
        c0 v5 = v(nVar);
        v5.d1(null, null, null, null);
        h0 F = F(nVar);
        EmptyList emptyList = EmptyList.f23167o;
        v5.j1(F, emptyList, A(), null, emptyList);
        if (kotlin.reflect.jvm.internal.impl.resolve.e.K(v5, v5.getType())) {
            v5.T0(new l(nVar, v5));
        }
        this.f24716b.a().h().c(nVar, v5);
        return v5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(Set<z0> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            String c6 = kotlin.reflect.jvm.internal.impl.load.kotlin.w.c((z0) obj, false, false, 2, null);
            Object obj2 = linkedHashMap.get(c6);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(c6, obj2);
            }
            ((List) obj2).add(obj);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                Collection<? extends z0> a6 = kotlin.reflect.jvm.internal.impl.resolve.m.a(list, m.f24750p);
                set.removeAll(list);
                set.addAll(a6);
            }
        }
    }

    private final c0 v(b4.n nVar) {
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.f n12 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.f.n1(D(), kotlin.reflect.jvm.internal.impl.load.java.lazy.e.a(this.f24716b, nVar), e0.FINAL, kotlin.reflect.jvm.internal.impl.load.java.j0.d(nVar.c()), !nVar.a(), nVar.getName(), this.f24716b.a().t().a(nVar), G(nVar));
        l0.o(n12, ProtectedSandApp.s("蒰"));
        return n12;
    }

    private final Set<kotlin.reflect.jvm.internal.impl.name.f> y() {
        return (Set) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f24725k, this, f24715m[2]);
    }

    @d5.e
    protected abstract x0 A();

    @d5.e
    protected final j C() {
        return this.f24717c;
    }

    @d5.d
    protected abstract kotlin.reflect.jvm.internal.impl.descriptors.m D();

    protected boolean H(@d5.d kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVar) {
        l0.p(eVar, ProtectedSandApp.s("蒱"));
        return true;
    }

    @d5.d
    protected abstract a I(@d5.d r rVar, @d5.d List<? extends f1> list, @d5.d h0 h0Var, @d5.d List<? extends j1> list2);

    @d5.d
    protected final kotlin.reflect.jvm.internal.impl.load.java.descriptors.e J(@d5.d r rVar) {
        int b02;
        Map<? extends a.InterfaceC0274a<?>, ?> z5;
        Object B2;
        l0.p(rVar, ProtectedSandApp.s("蒲"));
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.e w12 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.w1(D(), kotlin.reflect.jvm.internal.impl.load.java.lazy.e.a(this.f24716b, rVar), rVar.getName(), this.f24716b.a().t().a(rVar), this.f24719e.n().b(rVar.getName()) != null && rVar.n().isEmpty());
        l0.o(w12, ProtectedSandApp.s("蒳"));
        kotlin.reflect.jvm.internal.impl.load.java.lazy.g f6 = kotlin.reflect.jvm.internal.impl.load.java.lazy.a.f(this.f24716b, w12, rVar, 0, 4, null);
        List<y> typeParameters = rVar.getTypeParameters();
        b02 = b0.b0(typeParameters, 10);
        List<? extends f1> arrayList = new ArrayList<>(b02);
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            f1 a6 = f6.f().a((y) it.next());
            l0.m(a6);
            arrayList.add(a6);
        }
        b L = L(f6, w12, rVar.n());
        a I = I(rVar, arrayList, r(rVar, f6), L.a());
        h0 c6 = I.c();
        x0 i5 = c6 != null ? kotlin.reflect.jvm.internal.impl.resolve.d.i(w12, c6, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b()) : null;
        x0 A = A();
        EmptyList emptyList = EmptyList.f23167o;
        List<f1> e6 = I.e();
        List<j1> f7 = I.f();
        h0 d6 = I.d();
        e0 a7 = e0.Companion.a(false, rVar.d(), !rVar.a());
        u d7 = kotlin.reflect.jvm.internal.impl.load.java.j0.d(rVar.c());
        if (I.c() != null) {
            a.InterfaceC0274a<j1> interfaceC0274a = kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.U;
            B2 = j0.B2(L.a());
            z5 = e1.k(new Pair(interfaceC0274a, B2));
        } else {
            z5 = kotlin.collections.f1.z();
        }
        w12.v1(i5, A, emptyList, e6, f7, d6, a7, d7, z5);
        w12.z1(I.b(), L.b());
        if (!I.a().isEmpty()) {
            f6.a().s().a(w12, I.a());
        }
        return w12;
    }

    @d5.d
    protected final b L(@d5.d kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, @d5.d z zVar, @d5.d List<? extends b4.b0> list) {
        Iterable<IndexedValue> h6;
        int b02;
        List V5;
        Pair pair;
        kotlin.reflect.jvm.internal.impl.name.f name;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar2 = gVar;
        l0.p(gVar2, ProtectedSandApp.s("蒴"));
        l0.p(zVar, ProtectedSandApp.s("蒵"));
        l0.p(list, ProtectedSandApp.s("蒶"));
        h6 = j0.h6(list);
        b02 = b0.b0(h6, 10);
        ArrayList arrayList = new ArrayList(b02);
        boolean z5 = false;
        for (IndexedValue indexedValue : h6) {
            int f23235a = indexedValue.getF23235a();
            b4.b0 b0Var = (b4.b0) indexedValue.b();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g a6 = kotlin.reflect.jvm.internal.impl.load.java.lazy.e.a(gVar2, b0Var);
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a b6 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(s1.COMMON, false, false, null, 7, null);
            if (b0Var.b()) {
                x type = b0Var.getType();
                b4.f fVar = type instanceof b4.f ? (b4.f) type : null;
                if (fVar == null) {
                    throw new AssertionError(ProtectedSandApp.s("蒷") + b0Var);
                }
                h0 k5 = gVar.g().k(fVar, b6, true);
                pair = new Pair(k5, gVar.d().A().k(k5));
            } else {
                pair = new Pair(gVar.g().o(b0Var.getType(), b6), null);
            }
            h0 h0Var = (h0) pair.a();
            h0 h0Var2 = (h0) pair.b();
            if (l0.g(zVar.getName().h(), ProtectedSandApp.s("蒸")) && list.size() == 1 && l0.g(gVar.d().A().I(), h0Var)) {
                name = kotlin.reflect.jvm.internal.impl.name.f.p(ProtectedSandApp.s("蒹"));
            } else {
                name = b0Var.getName();
                if (name == null) {
                    z5 = true;
                }
                if (name == null) {
                    name = kotlin.reflect.jvm.internal.impl.name.f.p(ProtectedSandApp.s("蒺") + f23235a);
                    l0.o(name, ProtectedSandApp.s("蒻"));
                }
            }
            kotlin.reflect.jvm.internal.impl.name.f fVar2 = name;
            l0.o(fVar2, ProtectedSandApp.s("蒼"));
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new kotlin.reflect.jvm.internal.impl.descriptors.impl.l0(zVar, null, f23235a, a6, fVar2, h0Var, false, false, false, h0Var2, gVar.a().t().a(b0Var)));
            arrayList = arrayList2;
            z5 = z5;
            gVar2 = gVar;
        }
        V5 = j0.V5(arrayList);
        return new b(V5, z5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.d
    public Collection<z0> a(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("蒽"));
        l0.p(bVar, ProtectedSandApp.s("蒾"));
        return !b().contains(fVar) ? EmptyList.f23167o : this.f24722h.N(fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
        return B();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
        return E();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    public Collection<u0> d(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("蒿"));
        l0.p(bVar, ProtectedSandApp.s("蓀"));
        return !c().contains(fVar) ? EmptyList.f23167o : this.f24726l.N(fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
        return y();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g(@d5.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("蓁"));
        l0.p(lVar, ProtectedSandApp.s("蓂"));
        return this.f24718d.n();
    }

    @d5.d
    protected abstract Set<kotlin.reflect.jvm.internal.impl.name.f> m(@d5.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @d5.e q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar);

    @d5.d
    protected final List<kotlin.reflect.jvm.internal.impl.descriptors.m> n(@d5.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        List<kotlin.reflect.jvm.internal.impl.descriptors.m> V5;
        l0.p(dVar, ProtectedSandApp.s("蓃"));
        l0.p(lVar, ProtectedSandApp.s("蓄"));
        z3.d dVar2 = z3.d.WHEN_GET_ALL_DESCRIPTORS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f25977c.getClass();
        if (dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f25986l)) {
            for (kotlin.reflect.jvm.internal.impl.name.f fVar : m(dVar, lVar)) {
                if (lVar.N(fVar).booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.utils.a.a(linkedHashSet, h(fVar, dVar2));
                }
            }
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f25977c.getClass();
        if (dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f25983i) && !dVar.l().contains(c.a.f25974a)) {
            for (kotlin.reflect.jvm.internal.impl.name.f fVar2 : o(dVar, lVar)) {
                if (lVar.N(fVar2).booleanValue()) {
                    linkedHashSet.addAll(a(fVar2, dVar2));
                }
            }
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f25977c.getClass();
        if (dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f25984j) && !dVar.l().contains(c.a.f25974a)) {
            for (kotlin.reflect.jvm.internal.impl.name.f fVar3 : u(dVar, lVar)) {
                if (lVar.N(fVar3).booleanValue()) {
                    linkedHashSet.addAll(d(fVar3, dVar2));
                }
            }
        }
        V5 = j0.V5(linkedHashSet);
        return V5;
    }

    @d5.d
    protected abstract Set<kotlin.reflect.jvm.internal.impl.name.f> o(@d5.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @d5.e q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar);

    protected void p(@d5.d Collection<z0> collection, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(collection, ProtectedSandApp.s("蓅"));
        l0.p(fVar, ProtectedSandApp.s("蓆"));
    }

    @d5.d
    protected abstract kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b q();

    @d5.d
    protected final h0 r(@d5.d r rVar, @d5.d kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar) {
        l0.p(rVar, ProtectedSandApp.s("蓇"));
        l0.p(gVar, ProtectedSandApp.s("蓈"));
        return gVar.g().o(rVar.i(), kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(s1.COMMON, rVar.S().x(), false, null, 6, null));
    }

    protected abstract void s(@d5.d Collection<z0> collection, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar);

    protected abstract void t(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d Collection<u0> collection);

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("蓉") + D();
    }

    @d5.d
    protected abstract Set<kotlin.reflect.jvm.internal.impl.name.f> u(@d5.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @d5.e q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar);

    @d5.d
    protected final kotlin.reflect.jvm.internal.impl.storage.i<Collection<kotlin.reflect.jvm.internal.impl.descriptors.m>> w() {
        return this.f24718d;
    }

    @d5.d
    protected final kotlin.reflect.jvm.internal.impl.load.java.lazy.g x() {
        return this.f24716b;
    }

    @d5.d
    protected final kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b> z() {
        return this.f24719e;
    }

    public j(@d5.d kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, @d5.e j jVar) {
        l0.p(gVar, ProtectedSandApp.s("蒮"));
        this.f24716b = gVar;
        this.f24717c = jVar;
        this.f24718d = gVar.e().h(new c(), EmptyList.f23167o);
        this.f24719e = gVar.e().d(new g());
        this.f24720f = gVar.e().g(new f());
        this.f24721g = gVar.e().i(new e());
        this.f24722h = gVar.e().g(new i());
        this.f24723i = gVar.e().d(new h());
        this.f24724j = gVar.e().d(new k());
        this.f24725k = gVar.e().d(new d());
        this.f24726l = gVar.e().g(new C0289j());
    }
}
