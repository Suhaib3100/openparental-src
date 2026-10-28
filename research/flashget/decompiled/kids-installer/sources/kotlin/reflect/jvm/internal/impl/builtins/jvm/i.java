package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.a0;
import kotlin.collections.b0;
import kotlin.collections.j0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.f;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.z;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.v;
import kotlin.reflect.jvm.internal.impl.load.kotlin.w;
import kotlin.reflect.jvm.internal.impl.resolve.k;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.q1;
import kotlin.reflect.jvm.internal.impl.utils.b;
import kotlin.reflect.jvm.internal.impl.utils.f;

/* compiled from: JvmBuiltInsCustomizer.kt */
/* loaded from: classes5.dex */
public final class i implements w3.a, w3.c {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f23988h = {l1.u(new g1(l1.d(i.class), ProtectedSandApp.s("䕳"), ProtectedSandApp.s("䕴"))), l1.u(new g1(l1.d(i.class), ProtectedSandApp.s("䕵"), ProtectedSandApp.s("䕶"))), l1.u(new g1(l1.d(i.class), ProtectedSandApp.s("䕷"), ProtectedSandApp.s("䕸")))};

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final h0 f23989a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.builtins.jvm.d f23990b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i f23991c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.types.h0 f23992d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i f23993e;

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.a<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.descriptors.e> f23994f;

    /* renamed from: g, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i f23995g;

    /* compiled from: JvmBuiltInsCustomizer.kt */
    private enum a {
        HIDDEN,
        VISIBLE,
        NOT_CONSIDERED,
        DROP
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23996a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.NOT_CONSIDERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f23996a = iArr;
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    /* loaded from: classes6.dex */
    static final class c extends Lambda implements q3.a<p0> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ n f23998q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(n nVar) {
            super(0);
            this.f23998q = nVar;
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p0 n() {
            h0 a6 = i.this.u().a();
            kotlin.reflect.jvm.internal.impl.builtins.jvm.e.f23963d.getClass();
            return y.c(a6, kotlin.reflect.jvm.internal.impl.builtins.jvm.e.f23967h, new k0(this.f23998q, i.this.u().a())).E();
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    /* loaded from: classes6.dex */
    public static final class d extends z {
        d(h0 h0Var, kotlin.reflect.jvm.internal.impl.name.c cVar) {
            super(h0Var, cVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.l0
        public kotlin.reflect.jvm.internal.impl.resolve.scopes.h C() {
            return h.c.f26018b;
        }

        @d5.d
        public h.c M0() {
            return h.c.f26018b;
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    /* loaded from: classes6.dex */
    static final class e extends Lambda implements q3.a<kotlin.reflect.jvm.internal.impl.types.h0> {
        e() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.types.h0 n() {
            p0 i5 = i.this.f23989a.A().i();
            l0.o(i5, ProtectedSandApp.s("胪"));
            return i5;
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    /* loaded from: classes6.dex */
    static final class f extends Lambda implements q3.a<kotlin.reflect.jvm.internal.impl.descriptors.e> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f f24000p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.e f24001q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            super(0);
            this.f24000p = fVar;
            this.f24001q = eVar;
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.descriptors.e n() {
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f fVar = this.f24000p;
            kotlin.reflect.jvm.internal.impl.load.java.components.g gVar = kotlin.reflect.jvm.internal.impl.load.java.components.g.f24545a;
            l0.o(gVar, ProtectedSandApp.s("胫"));
            return fVar.U0(gVar, this.f24001q);
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    /* loaded from: classes6.dex */
    static final class g extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.resolve.scopes.h, Collection<? extends z0>> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.f f24002p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(kotlin.reflect.jvm.internal.impl.name.f fVar) {
            super(1);
            this.f24002p = fVar;
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<z0> N(@d5.d kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar) {
            l0.p(hVar, ProtectedSandApp.s("胬"));
            return hVar.a(this.f24002p, z3.d.FROM_BUILTINS);
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    /* loaded from: classes6.dex */
    public static final class h extends b.AbstractC0396b<kotlin.reflect.jvm.internal.impl.descriptors.e, a> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f24003a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.h<a> f24004b;

        h(String str, k1.h<a> hVar) {
            this.f24003a = str;
            this.f24004b = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.i$a] */
        /* JADX WARN: Type inference failed for: r0v6, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.i$a] */
        /* JADX WARN: Type inference failed for: r0v7, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.i$a] */
        @Override // kotlin.reflect.jvm.internal.impl.utils.b.AbstractC0396b, kotlin.reflect.jvm.internal.impl.utils.b.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean c(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            l0.p(eVar, ProtectedSandApp.s("胭"));
            String a6 = v.a(kotlin.reflect.jvm.internal.impl.load.kotlin.y.f25078a, eVar, this.f24003a);
            k kVar = k.f24008a;
            if (kVar.e().contains(a6)) {
                this.f24004b.f23572o = a.HIDDEN;
            } else if (kVar.h().contains(a6)) {
                this.f24004b.f23572o = a.VISIBLE;
            } else if (kVar.c().contains(a6)) {
                this.f24004b.f23572o = a.DROP;
            }
            return this.f24004b.f23572o == null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.e
        @d5.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a a() {
            a aVar = this.f24004b.f23572o;
            return aVar == null ? a.NOT_CONSIDERED : aVar;
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.i$i, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    static final class C0273i extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {
        C0273i() {
            super(1);
        }

        @Override // q3.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean N(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            boolean z5;
            if (bVar.j() == b.a.DECLARATION) {
                kotlin.reflect.jvm.internal.impl.builtins.jvm.d dVar = i.this.f23990b;
                m b6 = bVar.b();
                l0.n(b6, ProtectedSandApp.s("胮"));
                if (dVar.c((kotlin.reflect.jvm.internal.impl.descriptors.e) b6)) {
                    z5 = true;
                    return Boolean.valueOf(z5);
                }
            }
            z5 = false;
            return Boolean.valueOf(z5);
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    /* loaded from: classes6.dex */
    static final class j extends Lambda implements q3.a<kotlin.reflect.jvm.internal.impl.descriptors.annotations.g> {
        j() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g n() {
            List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> k5;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c b6 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.b(i.this.f23989a.A(), ProtectedSandApp.s("胯"), null, null, 6, null);
            g.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e;
            k5 = kotlin.collections.z.k(b6);
            return aVar.a(k5);
        }
    }

    public i(@d5.d h0 h0Var, @d5.d n nVar, @d5.d q3.a<f.b> aVar) {
        l0.p(h0Var, ProtectedSandApp.s("䕹"));
        l0.p(nVar, ProtectedSandApp.s("䕺"));
        l0.p(aVar, ProtectedSandApp.s("䕻"));
        this.f23989a = h0Var;
        this.f23990b = kotlin.reflect.jvm.internal.impl.builtins.jvm.d.f23962a;
        this.f23991c = nVar.d(aVar);
        this.f23992d = l(nVar);
        this.f23993e = nVar.d(new c(nVar));
        this.f23994f = nVar.e();
        this.f23995g = nVar.d(new j());
    }

    private final z0 k(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e eVar, z0 z0Var) {
        z.a<? extends z0> F = z0Var.F();
        F.o(eVar);
        F.n(t.f24440e);
        F.f(eVar.E());
        F.d(eVar.Q0());
        z0 build = F.build();
        l0.m(build);
        return build;
    }

    private final kotlin.reflect.jvm.internal.impl.types.h0 l(n nVar) {
        List k5;
        d dVar = new d(this.f23989a, new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("䕼")));
        k5 = kotlin.collections.z.k(new kotlin.reflect.jvm.internal.impl.types.k0(nVar, new e()));
        kotlin.reflect.jvm.internal.impl.descriptors.impl.h hVar = new kotlin.reflect.jvm.internal.impl.descriptors.impl.h(dVar, kotlin.reflect.jvm.internal.impl.name.f.p(ProtectedSandApp.s("䕽")), e0.ABSTRACT, kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE, k5, a1.f24103a, false, nVar);
        hVar.R0(h.c.f26018b, EmptySet.f23181o, null);
        p0 E = hVar.E();
        l0.o(E, ProtectedSandApp.s("䕾"));
        return E;
    }

    private final Collection<z0> m(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, q3.l<? super kotlin.reflect.jvm.internal.impl.resolve.scopes.h, ? extends Collection<? extends z0>> lVar) {
        Object t32;
        int b02;
        boolean z5;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f q5 = q(eVar);
        if (q5 == null) {
            return EmptyList.f23167o;
        }
        kotlin.reflect.jvm.internal.impl.builtins.jvm.d dVar = this.f23990b;
        kotlin.reflect.jvm.internal.impl.name.c l5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.l(q5);
        kotlin.reflect.jvm.internal.impl.builtins.jvm.b.f23940i.getClass();
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> g5 = dVar.g(l5, kotlin.reflect.jvm.internal.impl.builtins.jvm.b.f23941j);
        t32 = j0.t3(g5);
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.e) t32;
        if (eVar2 == null) {
            return EmptyList.f23167o;
        }
        f.b bVar = kotlin.reflect.jvm.internal.impl.utils.f.f26679q;
        b02 = b0.b0(g5, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator<T> it = g5.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.l((kotlin.reflect.jvm.internal.impl.descriptors.e) it.next()));
        }
        kotlin.reflect.jvm.internal.impl.utils.f b6 = bVar.b(arrayList);
        boolean c6 = this.f23990b.c(eVar);
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h K0 = this.f23994f.a(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.l(q5), new f(q5, eVar2)).K0();
        l0.o(K0, ProtectedSandApp.s("䕿"));
        Collection<? extends z0> N = lVar.N(K0);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : N) {
            z0 z0Var = (z0) obj;
            boolean z6 = false;
            if (z0Var.j() == b.a.DECLARATION && z0Var.c().d() && !kotlin.reflect.jvm.internal.impl.builtins.h.j0(z0Var)) {
                Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.z> g6 = z0Var.g();
                l0.o(g6, ProtectedSandApp.s("䖀"));
                if (!(g6 instanceof Collection) || !g6.isEmpty()) {
                    Iterator<T> it2 = g6.iterator();
                    while (it2.hasNext()) {
                        m b7 = ((kotlin.reflect.jvm.internal.impl.descriptors.z) it2.next()).b();
                        l0.o(b7, ProtectedSandApp.s("䖁"));
                        if (b6.contains(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.l(b7))) {
                            z5 = true;
                            break;
                        }
                    }
                }
                z5 = false;
                if (!z5 && !v(z0Var, c6)) {
                    z6 = true;
                }
            }
            if (z6) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    private final p0 n() {
        return (p0) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f23993e, this, f23988h[1]);
    }

    private static final boolean o(kotlin.reflect.jvm.internal.impl.descriptors.l lVar, q1 q1Var, kotlin.reflect.jvm.internal.impl.descriptors.l lVar2) {
        return kotlin.reflect.jvm.internal.impl.resolve.k.x(lVar, lVar2.d(q1Var)) == k.i.a.OVERRIDABLE;
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f q(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        kotlin.reflect.jvm.internal.impl.name.b n5;
        kotlin.reflect.jvm.internal.impl.name.c b6;
        if (kotlin.reflect.jvm.internal.impl.builtins.h.a0(eVar) || !kotlin.reflect.jvm.internal.impl.builtins.h.A0(eVar)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.name.d m5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.m(eVar);
        if (!m5.f() || (n5 = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f23942a.n(m5)) == null || (b6 = n5.b()) == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e c6 = s.c(u().a(), b6, z3.d.FROM_BUILTINS);
        if (c6 instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f) {
            return (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f) c6;
        }
        return null;
    }

    private final a r(kotlin.reflect.jvm.internal.impl.descriptors.z zVar) {
        List k5;
        m b6 = zVar.b();
        l0.n(b6, ProtectedSandApp.s("䖂"));
        String c6 = w.c(zVar, false, false, 3, null);
        k1.h hVar = new k1.h();
        k5 = kotlin.collections.z.k((kotlin.reflect.jvm.internal.impl.descriptors.e) b6);
        Object b7 = kotlin.reflect.jvm.internal.impl.utils.b.b(k5, new kotlin.reflect.jvm.internal.impl.builtins.jvm.h(this), new h(c6, hVar));
        l0.o(b7, ProtectedSandApp.s("䖃"));
        return (a) b7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable s(i iVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l0.p(iVar, ProtectedSandApp.s("䖄"));
        Collection<kotlin.reflect.jvm.internal.impl.types.h0> m5 = eVar.m().m();
        l0.o(m5, ProtectedSandApp.s("䖅"));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = m5.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.h b6 = ((kotlin.reflect.jvm.internal.impl.types.h0) it.next()).U0().b();
            kotlin.reflect.jvm.internal.impl.descriptors.h a6 = b6 != null ? b6.a() : null;
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar2 = a6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) a6 : null;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f q5 = eVar2 != null ? iVar.q(eVar2) : null;
            if (q5 != null) {
                arrayList.add(q5);
            }
        }
        return arrayList;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g t() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.annotations.g) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f23995g, this, f23988h[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.b u() {
        return (f.b) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f23991c, this, f23988h[0]);
    }

    private final boolean v(z0 z0Var, boolean z5) {
        List k5;
        m b6 = z0Var.b();
        l0.n(b6, ProtectedSandApp.s("䖆"));
        String c6 = w.c(z0Var, false, false, 3, null);
        if (z5 ^ k.f24008a.f().contains(v.a(kotlin.reflect.jvm.internal.impl.load.kotlin.y.f25078a, (kotlin.reflect.jvm.internal.impl.descriptors.e) b6, c6))) {
            return true;
        }
        k5 = kotlin.collections.z.k(z0Var);
        Boolean e6 = kotlin.reflect.jvm.internal.impl.utils.b.e(k5, kotlin.reflect.jvm.internal.impl.builtins.jvm.g.f23986a, new C0273i());
        l0.o(e6, ProtectedSandApp.s("䖇"));
        return e6.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable w(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        return bVar.a().g();
    }

    private final boolean x(kotlin.reflect.jvm.internal.impl.descriptors.l lVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        Object h5;
        if (lVar.n().size() == 1) {
            List<j1> n5 = lVar.n();
            l0.o(n5, ProtectedSandApp.s("䖈"));
            h5 = j0.h5(n5);
            kotlin.reflect.jvm.internal.impl.descriptors.h b6 = ((j1) h5).getType().U0().b();
            if (l0.g(b6 != null ? kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.m(b6) : null, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.m(eVar))) {
                return true;
            }
        }
        return false;
    }

    @Override // w3.a
    @d5.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        int b02;
        boolean z5;
        l0.p(eVar, ProtectedSandApp.s("䖉"));
        if (eVar.j() != kotlin.reflect.jvm.internal.impl.descriptors.f.CLASS || !u().b()) {
            return EmptyList.f23167o;
        }
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f q5 = q(eVar);
        if (q5 == null) {
            return EmptyList.f23167o;
        }
        kotlin.reflect.jvm.internal.impl.builtins.jvm.d dVar = this.f23990b;
        kotlin.reflect.jvm.internal.impl.name.c l5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.l(q5);
        kotlin.reflect.jvm.internal.impl.builtins.jvm.b.f23940i.getClass();
        kotlin.reflect.jvm.internal.impl.descriptors.e f6 = kotlin.reflect.jvm.internal.impl.builtins.jvm.d.f(dVar, l5, kotlin.reflect.jvm.internal.impl.builtins.jvm.b.f23941j, null, 4, null);
        if (f6 == null) {
            return EmptyList.f23167o;
        }
        q1 c6 = l.a(f6, q5).c();
        List<kotlin.reflect.jvm.internal.impl.descriptors.d> l6 = q5.l();
        ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.d> arrayList = new ArrayList();
        Iterator<T> it = l6.iterator();
        while (true) {
            boolean z6 = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            kotlin.reflect.jvm.internal.impl.descriptors.d dVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.d) next;
            if (dVar2.c().d()) {
                Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> l7 = f6.l();
                l0.o(l7, ProtectedSandApp.s("䖊"));
                if (!(l7 instanceof Collection) || !l7.isEmpty()) {
                    for (kotlin.reflect.jvm.internal.impl.descriptors.d dVar3 : l7) {
                        l0.o(dVar3, ProtectedSandApp.s("䖋"));
                        if (o(dVar3, c6, dVar2)) {
                            z5 = false;
                            break;
                        }
                    }
                }
                z5 = true;
                if (z5 && !x(dVar2, eVar) && !kotlin.reflect.jvm.internal.impl.builtins.h.j0(dVar2) && !k.f24008a.d().contains(v.a(kotlin.reflect.jvm.internal.impl.load.kotlin.y.f25078a, q5, w.c(dVar2, false, false, 3, null)))) {
                    z6 = true;
                }
            }
            if (z6) {
                arrayList.add(next);
            }
        }
        b02 = b0.b0(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(b02);
        for (kotlin.reflect.jvm.internal.impl.descriptors.d dVar4 : arrayList) {
            z.a<? extends kotlin.reflect.jvm.internal.impl.descriptors.z> F = dVar4.F();
            F.o(eVar);
            F.f(eVar.E());
            F.e();
            F.k(c6.j());
            if (!k.f24008a.g().contains(v.a(kotlin.reflect.jvm.internal.impl.load.kotlin.y.f25078a, q5, w.c(dVar4, false, false, 3, null)))) {
                F.r(t());
            }
            kotlin.reflect.jvm.internal.impl.descriptors.z build = F.build();
            l0.n(build, ProtectedSandApp.s("䖌"));
            arrayList2.add((kotlin.reflect.jvm.internal.impl.descriptors.d) build);
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0112, code lost:
    
        if (r2 != 3) goto L42;
     */
    @Override // w3.a
    @d5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.z0> b(@d5.d kotlin.reflect.jvm.internal.impl.name.f r7, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e r8) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.jvm.i.b(kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.descriptors.e):java.util.Collection");
    }

    @Override // w3.c
    public boolean c(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d z0 z0Var) {
        l0.p(eVar, ProtectedSandApp.s("䖒"));
        l0.p(z0Var, ProtectedSandApp.s("䖓"));
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f q5 = q(eVar);
        if (q5 == null || !z0Var.getAnnotations().O0(w3.d.a())) {
            return true;
        }
        if (!u().b()) {
            return false;
        }
        String c6 = w.c(z0Var, false, false, 3, null);
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g K0 = q5.K0();
        kotlin.reflect.jvm.internal.impl.name.f name = z0Var.getName();
        l0.o(name, ProtectedSandApp.s("䖔"));
        Collection<z0> a6 = K0.a(name, z3.d.FROM_BUILTINS);
        if (!(a6 instanceof Collection) || !a6.isEmpty()) {
            Iterator<T> it = a6.iterator();
            while (it.hasNext()) {
                if (l0.g(w.c((z0) it.next(), false, false, 3, null), c6)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // w3.a
    @d5.d
    public Collection<kotlin.reflect.jvm.internal.impl.types.h0> d(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        List k5;
        List O;
        l0.p(eVar, ProtectedSandApp.s("䖕"));
        kotlin.reflect.jvm.internal.impl.name.d m5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.m(eVar);
        k kVar = k.f24008a;
        if (kVar.i(m5)) {
            p0 n5 = n();
            l0.o(n5, ProtectedSandApp.s("䖖"));
            O = a0.O(n5, this.f23992d);
            return O;
        }
        if (!kVar.j(m5)) {
            return EmptyList.f23167o;
        }
        k5 = kotlin.collections.z.k(this.f23992d);
        return k5;
    }

    @Override // w3.a
    @d5.d
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Set<kotlin.reflect.jvm.internal.impl.name.f> e(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g K0;
        Set<kotlin.reflect.jvm.internal.impl.name.f> b6;
        l0.p(eVar, ProtectedSandApp.s("䖗"));
        if (!u().b()) {
            return EmptySet.f23181o;
        }
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f q5 = q(eVar);
        return (q5 == null || (K0 = q5.K0()) == null || (b6 = K0.b()) == null) ? EmptySet.f23181o : b6;
    }
}
