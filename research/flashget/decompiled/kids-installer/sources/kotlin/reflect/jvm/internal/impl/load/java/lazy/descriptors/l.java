package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import b4.q;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.collections.a0;
import kotlin.collections.b0;
import kotlin.collections.f0;
import kotlin.collections.j0;
import kotlin.collections.z;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.utils.b;
import kotlin.sequences.Sequence;
import kotlin.sequences.v;

/* compiled from: LazyJavaStaticClassScope.kt */
/* loaded from: classes6.dex */
public final class l extends m {

    /* renamed from: n, reason: collision with root package name */
    @d5.d
    private final b4.g f24752n;

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.load.java.descriptors.c f24753o;

    /* compiled from: LazyJavaStaticClassScope.kt */
    static final class a extends Lambda implements q3.l<q, Boolean> {

        /* renamed from: p, reason: collision with root package name */
        public static final a f24754p = new a();

        a() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean N(@d5.d q qVar) {
            l0.p(qVar, ProtectedSandApp.s("蔿"));
            return Boolean.valueOf(qVar.T());
        }
    }

    /* compiled from: LazyJavaStaticClassScope.kt */
    static final class b extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.resolve.scopes.h, Collection<? extends u0>> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.f f24755p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.reflect.jvm.internal.impl.name.f fVar) {
            super(1);
            this.f24755p = fVar;
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<? extends u0> N(@d5.d kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar) {
            l0.p(hVar, ProtectedSandApp.s("蕀"));
            return hVar.d(this.f24755p, z3.d.WHEN_GET_SUPER_MEMBERS);
        }
    }

    /* compiled from: LazyJavaStaticClassScope.kt */
    static final class c extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.resolve.scopes.h, Collection<? extends kotlin.reflect.jvm.internal.impl.name.f>> {

        /* renamed from: p, reason: collision with root package name */
        public static final c f24756p = new c();

        c() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<kotlin.reflect.jvm.internal.impl.name.f> N(@d5.d kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar) {
            l0.p(hVar, ProtectedSandApp.s("蕁"));
            return hVar.c();
        }
    }

    /* compiled from: LazyJavaStaticClassScope.kt */
    static final class d extends Lambda implements q3.l<h0, kotlin.reflect.jvm.internal.impl.descriptors.e> {

        /* renamed from: p, reason: collision with root package name */
        public static final d f24757p = new d();

        d() {
            super(1);
        }

        @Override // q3.l
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.descriptors.e N(h0 h0Var) {
            kotlin.reflect.jvm.internal.impl.descriptors.h b6 = h0Var.U0().b();
            if (b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                return (kotlin.reflect.jvm.internal.impl.descriptors.e) b6;
            }
            return null;
        }
    }

    /* compiled from: LazyJavaStaticClassScope.kt */
    public static final class e extends b.AbstractC0396b<kotlin.reflect.jvm.internal.impl.descriptors.e, m2> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.e f24758a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set<R> f24759b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q3.l<kotlin.reflect.jvm.internal.impl.resolve.scopes.h, Collection<R>> f24760c;

        /* JADX WARN: Multi-variable type inference failed */
        e(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, Set<R> set, q3.l<? super kotlin.reflect.jvm.internal.impl.resolve.scopes.h, ? extends Collection<? extends R>> lVar) {
            this.f24758a = eVar;
            this.f24759b = set;
            this.f24760c = lVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.e
        public Object a() {
            return m2.f23662a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.AbstractC0396b, kotlin.reflect.jvm.internal.impl.utils.b.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean c(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            l0.p(eVar, ProtectedSandApp.s("蕂"));
            if (eVar == this.f24758a) {
                return true;
            }
            kotlin.reflect.jvm.internal.impl.resolve.scopes.h Z = eVar.Z();
            l0.o(Z, ProtectedSandApp.s("蕃"));
            if (!(Z instanceof m)) {
                return true;
            }
            this.f24759b.addAll((Collection) this.f24760c.N(Z));
            return false;
        }

        public void e() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@d5.d kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, @d5.d b4.g gVar2, @d5.d kotlin.reflect.jvm.internal.impl.load.java.descriptors.c cVar) {
        super(gVar);
        l0.p(gVar, ProtectedSandApp.s("蕄"));
        l0.p(gVar2, ProtectedSandApp.s("蕅"));
        l0.p(cVar, ProtectedSandApp.s("蕆"));
        this.f24752n = gVar2;
        this.f24753o = cVar;
    }

    private final <R> Set<R> P(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, Set<R> set, q3.l<? super kotlin.reflect.jvm.internal.impl.resolve.scopes.h, ? extends Collection<? extends R>> lVar) {
        List k5;
        k5 = z.k(eVar);
        kotlin.reflect.jvm.internal.impl.utils.b.b(k5, k.f24751a, new e(eVar, set, lVar));
        return set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable Q(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        Sequence A1;
        Sequence p12;
        Iterable N;
        Collection<h0> m5 = eVar.m().m();
        l0.o(m5, ProtectedSandApp.s("蕇"));
        A1 = j0.A1(m5);
        p12 = v.p1(A1, d.f24757p);
        N = v.N(p12);
        return N;
    }

    private final u0 S(u0 u0Var) {
        int b02;
        List a22;
        Object h5;
        if (u0Var.j().isReal()) {
            return u0Var;
        }
        Collection<? extends u0> g5 = u0Var.g();
        l0.o(g5, ProtectedSandApp.s("蕈"));
        b02 = b0.b0(g5, 10);
        ArrayList arrayList = new ArrayList(b02);
        for (u0 u0Var2 : g5) {
            l0.o(u0Var2, ProtectedSandApp.s("蕉"));
            arrayList.add(S(u0Var2));
        }
        a22 = j0.a2(arrayList);
        h5 = j0.h5(a22);
        return (u0) h5;
    }

    private final Set<z0> T(kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        Set<z0> a6;
        l b6 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.h.b(eVar);
        if (b6 == null) {
            return EmptySet.f23181o;
        }
        a6 = j0.a6(b6.a(fVar, z3.d.WHEN_GET_SUPER_MEMBERS));
        return a6;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    public kotlin.reflect.jvm.internal.impl.descriptors.m D() {
        return this.f24753o;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    @d5.d
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a q() {
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a(this.f24752n, a.f24754p);
    }

    @d5.d
    protected kotlin.reflect.jvm.internal.impl.load.java.descriptors.c R() {
        return this.f24753o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.e
    public kotlin.reflect.jvm.internal.impl.descriptors.h h(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("蕊"));
        l0.p(bVar, ProtectedSandApp.s("蕋"));
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    @d5.d
    protected Set<kotlin.reflect.jvm.internal.impl.name.f> m(@d5.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @d5.e q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("蕌"));
        return EmptySet.f23181o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    @d5.d
    protected Set<kotlin.reflect.jvm.internal.impl.name.f> o(@d5.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @d5.e q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        Set<kotlin.reflect.jvm.internal.impl.name.f> Z5;
        List O;
        l0.p(dVar, ProtectedSandApp.s("蕍"));
        Z5 = j0.Z5(z().n().a());
        l b6 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.h.b(this.f24753o);
        Set<kotlin.reflect.jvm.internal.impl.name.f> b7 = b6 != null ? b6.b() : null;
        if (b7 == null) {
            b7 = EmptySet.f23181o;
        }
        Z5.addAll(b7);
        if (this.f24752n.G()) {
            O = a0.O(kotlin.reflect.jvm.internal.impl.builtins.l.f24020f, kotlin.reflect.jvm.internal.impl.builtins.l.f24018d);
            Z5.addAll(O);
        }
        Z5.addAll(x().a().w().e(x(), this.f24753o));
        return Z5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    protected void p(@d5.d Collection<z0> collection, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(collection, ProtectedSandApp.s("蕎"));
        l0.p(fVar, ProtectedSandApp.s("蕏"));
        x().a().w().a(x(), this.f24753o, fVar, collection);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    protected void s(@d5.d Collection<z0> collection, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(collection, ProtectedSandApp.s("蕐"));
        l0.p(fVar, ProtectedSandApp.s("蕑"));
        Collection<? extends z0> e6 = kotlin.reflect.jvm.internal.impl.load.java.components.a.e(fVar, T(fVar, this.f24753o), collection, this.f24753o, x().a().c(), x().a().k().a());
        l0.o(e6, ProtectedSandApp.s("蕒"));
        collection.addAll(e6);
        if (this.f24752n.G()) {
            if (l0.g(fVar, kotlin.reflect.jvm.internal.impl.builtins.l.f24020f)) {
                z0 g5 = kotlin.reflect.jvm.internal.impl.resolve.d.g(this.f24753o);
                l0.o(g5, ProtectedSandApp.s("蕓"));
                collection.add(g5);
            } else if (l0.g(fVar, kotlin.reflect.jvm.internal.impl.builtins.l.f24018d)) {
                z0 h5 = kotlin.reflect.jvm.internal.impl.resolve.d.h(this.f24753o);
                l0.o(h5, ProtectedSandApp.s("蕔"));
                collection.add(h5);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.m, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    protected void t(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d Collection<u0> collection) {
        l0.p(fVar, ProtectedSandApp.s("蕕"));
        l0.p(collection, ProtectedSandApp.s("蕖"));
        Set P = P(this.f24753o, new LinkedHashSet(), new b(fVar));
        boolean z5 = !collection.isEmpty();
        String s5 = ProtectedSandApp.s("蕗");
        if (z5) {
            Collection<? extends u0> e6 = kotlin.reflect.jvm.internal.impl.load.java.components.a.e(fVar, P, collection, this.f24753o, x().a().c(), x().a().k().a());
            l0.o(e6, s5);
            collection.addAll(e6);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : P) {
                u0 S = S((u0) obj);
                Object obj2 = linkedHashMap.get(S);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(S, obj2);
                }
                ((List) obj2).add(obj);
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection e7 = kotlin.reflect.jvm.internal.impl.load.java.components.a.e(fVar, (Collection) ((Map.Entry) it.next()).getValue(), collection, this.f24753o, x().a().c(), x().a().k().a());
                l0.o(e7, s5);
                f0.q0(arrayList, e7);
            }
            collection.addAll(arrayList);
        }
        if (this.f24752n.G() && l0.g(fVar, kotlin.reflect.jvm.internal.impl.builtins.l.f24019e)) {
            kotlin.reflect.jvm.internal.impl.utils.a.a(collection, kotlin.reflect.jvm.internal.impl.resolve.d.f(this.f24753o));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    @d5.d
    protected Set<kotlin.reflect.jvm.internal.impl.name.f> u(@d5.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @d5.e q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        Set<kotlin.reflect.jvm.internal.impl.name.f> Z5;
        l0.p(dVar, ProtectedSandApp.s("蕘"));
        Z5 = j0.Z5(z().n().e());
        P(this.f24753o, Z5, c.f24756p);
        if (this.f24752n.G()) {
            Z5.add(kotlin.reflect.jvm.internal.impl.builtins.l.f24019e);
        }
        return Z5;
    }
}
