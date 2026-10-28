package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.utils.b;
import kotlin.sequences.p;
import wd.q;

/* compiled from: LazyJavaStaticClassScope.kt */
@r1({"SMAP\nLazyJavaStaticClassScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaStaticClassScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaStaticClassScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,171:1\n1#2:172\n1477#3:173\n1502#3,3:174\n1505#3,3:184\n1549#3:193\n1620#3,3:194\n372#4,7:177\n76#5:187\n96#5,5:188\n*S KotlinDebug\n*F\n+ 1 LazyJavaStaticClassScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaStaticClassScope\n*L\n112#1:173\n112#1:174,3\n112#1:184,3\n168#1:193\n168#1:194,3\n112#1:177,7\n114#1:187\n114#1:188,5\n*E\n"})
/* loaded from: classes7.dex */
public final class l extends m {

    /* renamed from: n, reason: collision with root package name */
    @fg.l
    private final wd.g f76627n;

    /* renamed from: o, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.load.java.descriptors.c f76628o;

    /* compiled from: LazyJavaStaticClassScope.kt */
    static final class a extends n0 implements ld.l<q, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f76629b = new a(1);

        a() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l q qVar) {
            l0.p(qVar, ProtectedSandApp.s("營\u0001"));
            return Boolean.valueOf(qVar.o());
        }
    }

    /* compiled from: LazyJavaStaticClassScope.kt */
    static final class b extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.resolve.scopes.h, Collection<? extends u0>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.f f76630b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.reflect.jvm.internal.impl.name.f fVar) {
            super(1);
            this.f76630b = fVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<? extends u0> invoke(@fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar) {
            l0.p(hVar, ProtectedSandApp.s("燠\u0001"));
            return hVar.b(this.f76630b, ud.d.WHEN_GET_SUPER_MEMBERS);
        }
    }

    /* compiled from: LazyJavaStaticClassScope.kt */
    static final class c extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.resolve.scopes.h, Collection<? extends kotlin.reflect.jvm.internal.impl.name.f>> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f76631b = new c(1);

        c() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<kotlin.reflect.jvm.internal.impl.name.f> invoke(@fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar) {
            l0.p(hVar, ProtectedSandApp.s("燡\u0001"));
            return hVar.d();
        }
    }

    /* compiled from: LazyJavaStaticClassScope.kt */
    static final class d extends n0 implements ld.l<h0, kotlin.reflect.jvm.internal.impl.descriptors.e> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f76632b = new d(1);

        d() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.descriptors.e invoke(h0 h0Var) {
            kotlin.reflect.jvm.internal.impl.descriptors.h c5 = h0Var.O0().c();
            if (c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                return (kotlin.reflect.jvm.internal.impl.descriptors.e) c5;
            }
            return null;
        }
    }

    /* compiled from: LazyJavaStaticClassScope.kt */
    public static final class e extends b.AbstractC1200b<kotlin.reflect.jvm.internal.impl.descriptors.e, k2> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.e f76633a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set<R> f76634b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<kotlin.reflect.jvm.internal.impl.resolve.scopes.h, Collection<R>> f76635c;

        /* JADX WARN: Multi-variable type inference failed */
        e(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, Set<R> set, ld.l<? super kotlin.reflect.jvm.internal.impl.resolve.scopes.h, ? extends Collection<? extends R>> lVar) {
            this.f76633a = eVar;
            this.f76634b = set;
            this.f76635c = lVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.AbstractC1200b, kotlin.reflect.jvm.internal.impl.utils.b.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean b(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            l0.p(eVar, ProtectedSandApp.s("燢\u0001"));
            if (eVar == this.f76633a) {
                return true;
            }
            kotlin.reflect.jvm.internal.impl.resolve.scopes.h o02 = eVar.o0();
            l0.o(o02, ProtectedSandApp.s("燣\u0001"));
            if (!(o02 instanceof m)) {
                return true;
            }
            this.f76634b.addAll((Collection) this.f76635c.invoke(o02));
            return false;
        }

        public void d() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.e
        public Object result() {
            return k2.f75408a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@fg.l kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, @fg.l wd.g gVar2, @fg.l kotlin.reflect.jvm.internal.impl.load.java.descriptors.c cVar) {
        super(gVar);
        l0.p(gVar, ProtectedSandApp.s("燤\u0001"));
        l0.p(gVar2, ProtectedSandApp.s("燥\u0001"));
        l0.p(cVar, ProtectedSandApp.s("燦\u0001"));
        this.f76627n = gVar2;
        this.f76628o = cVar;
    }

    private final <R> Set<R> P(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, Set<R> set, ld.l<? super kotlin.reflect.jvm.internal.impl.resolve.scopes.h, ? extends Collection<? extends R>> lVar) {
        kotlin.reflect.jvm.internal.impl.utils.b.b(w.k(eVar), k.f76626a, new e(eVar, set, lVar));
        return set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable Q(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        Collection<h0> j4 = eVar.j().j();
        l0.o(j4, ProtectedSandApp.s("燧\u0001"));
        return p.N(p.p1(w.A1(j4), d.f76632b));
    }

    private final u0 S(u0 u0Var) {
        if (u0Var.b().isReal()) {
            return u0Var;
        }
        Collection<? extends u0> e4 = u0Var.e();
        l0.o(e4, ProtectedSandApp.s("燨\u0001"));
        Collection<? extends u0> collection = e4;
        ArrayList arrayList = new ArrayList(w.b0(collection, 10));
        for (u0 u0Var2 : collection) {
            l0.m(u0Var2);
            arrayList.add(S(u0Var2));
        }
        return (u0) w.h5(w.a2(arrayList));
    }

    private final Set<z0> T(kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l b5 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.h.b(eVar);
        return b5 == null ? kotlin.collections.l0.f74939b : w.a6(b5.a(fVar, ud.d.WHEN_GET_SUPER_MEMBERS));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    public kotlin.reflect.jvm.internal.impl.descriptors.m D() {
        return this.f76628o;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    @fg.l
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a q() {
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a(this.f76627n, a.f76629b);
    }

    @fg.l
    protected kotlin.reflect.jvm.internal.impl.load.java.descriptors.c R() {
        return this.f76628o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.m
    public kotlin.reflect.jvm.internal.impl.descriptors.h f(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("燩\u0001"));
        l0.p(bVar, ProtectedSandApp.s("燪\u0001"));
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    @fg.l
    protected Set<kotlin.reflect.jvm.internal.impl.name.f> m(@fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @fg.m ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("燫\u0001"));
        return kotlin.collections.l0.f74939b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    @fg.l
    protected Set<kotlin.reflect.jvm.internal.impl.name.f> o(@fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @fg.m ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("燫\u0001"));
        Set<kotlin.reflect.jvm.internal.impl.name.f> Z5 = w.Z5(z().invoke().a());
        l b5 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.h.b(this.f76628o);
        Set<kotlin.reflect.jvm.internal.impl.name.f> c5 = b5 != null ? b5.c() : null;
        if (c5 == null) {
            c5 = kotlin.collections.l0.f74939b;
        }
        Z5.addAll(c5);
        if (this.f76627n.b()) {
            Z5.addAll(w.O(kotlin.reflect.jvm.internal.impl.builtins.l.f75817f, kotlin.reflect.jvm.internal.impl.builtins.l.f75815d));
        }
        Z5.addAll(x().a().w().f(x(), this.f76628o));
        return Z5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    protected void p(@fg.l Collection<z0> collection, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(collection, ProtectedSandApp.s("燬\u0001"));
        l0.p(fVar, ProtectedSandApp.s("燩\u0001"));
        x().a().w().c(x(), this.f76628o, fVar, collection);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    protected void s(@fg.l Collection<z0> collection, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(collection, ProtectedSandApp.s("燬\u0001"));
        l0.p(fVar, ProtectedSandApp.s("燩\u0001"));
        Collection<? extends z0> e4 = kotlin.reflect.jvm.internal.impl.load.java.components.a.e(fVar, T(fVar, this.f76628o), collection, this.f76628o, x().a().c(), x().a().k().a());
        l0.o(e4, ProtectedSandApp.s("燭\u0001"));
        collection.addAll(e4);
        if (this.f76627n.b()) {
            if (l0.g(fVar, kotlin.reflect.jvm.internal.impl.builtins.l.f75817f)) {
                z0 g4 = kotlin.reflect.jvm.internal.impl.resolve.e.g(this.f76628o);
                l0.o(g4, ProtectedSandApp.s("燮\u0001"));
                collection.add(g4);
            } else if (l0.g(fVar, kotlin.reflect.jvm.internal.impl.builtins.l.f75815d)) {
                z0 h4 = kotlin.reflect.jvm.internal.impl.resolve.e.h(this.f76628o);
                l0.o(h4, ProtectedSandApp.s("燯\u0001"));
                collection.add(h4);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.m, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    protected void t(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l Collection<u0> collection) {
        l0.p(fVar, ProtectedSandApp.s("燩\u0001"));
        l0.p(collection, ProtectedSandApp.s("燬\u0001"));
        Set P = P(this.f76628o, new LinkedHashSet(), new b(fVar));
        boolean isEmpty = collection.isEmpty();
        String s4 = ProtectedSandApp.s("燭\u0001");
        if (isEmpty) {
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
                Collection e4 = kotlin.reflect.jvm.internal.impl.load.java.components.a.e(fVar, (Collection) ((Map.Entry) it.next()).getValue(), collection, this.f76628o, x().a().c(), x().a().k().a());
                l0.o(e4, s4);
                w.q0(arrayList, e4);
            }
            collection.addAll(arrayList);
        } else {
            Collection<? extends u0> e5 = kotlin.reflect.jvm.internal.impl.load.java.components.a.e(fVar, P, collection, this.f76628o, x().a().c(), x().a().k().a());
            l0.o(e5, s4);
            collection.addAll(e5);
        }
        if (this.f76627n.b() && l0.g(fVar, kotlin.reflect.jvm.internal.impl.builtins.l.f75816e)) {
            kotlin.reflect.jvm.internal.impl.utils.a.a(collection, kotlin.reflect.jvm.internal.impl.resolve.e.f(this.f76628o));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    @fg.l
    protected Set<kotlin.reflect.jvm.internal.impl.name.f> u(@fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @fg.m ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("燫\u0001"));
        Set<kotlin.reflect.jvm.internal.impl.name.f> Z5 = w.Z5(z().invoke().c());
        P(this.f76628o, Z5, c.f76631b);
        if (this.f76627n.b()) {
            Z5.add(kotlin.reflect.jvm.internal.impl.builtins.l.f75816e);
        }
        return Z5;
    }
}
