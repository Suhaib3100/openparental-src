package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.j0;
import kotlin.collections.w;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.f;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.z;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.a0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.x;
import kotlin.reflect.jvm.internal.impl.resolve.l;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.q1;
import kotlin.reflect.jvm.internal.impl.utils.b;
import kotlin.reflect.jvm.internal.impl.utils.g;
import kotlin.reflect.o;

/* compiled from: JvmBuiltInsCustomizer.kt */
@r1({"SMAP\nJvmBuiltInsCustomizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmBuiltInsCustomizer.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,375:1\n1747#2,3:376\n1603#2,9:379\n1855#2:388\n1856#2:390\n1612#2:391\n1549#2:392\n1620#2,3:393\n766#2:396\n857#2:397\n1747#2,3:398\n858#2:401\n766#2:402\n857#2:403\n2624#2,3:404\n858#2:407\n1549#2:408\n1620#2,3:409\n1747#2,3:412\n1603#2,9:415\n1855#2:424\n1856#2:426\n1612#2:427\n1#3:389\n1#3:425\n*S KotlinDebug\n*F\n+ 1 JvmBuiltInsCustomizer.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer\n*L\n119#1:376,3\n135#1:379,9\n135#1:388\n135#1:390\n135#1:391\n194#1:392\n194#1:393,3\n208#1:396\n208#1:397\n213#1:398,3\n208#1:401\n316#1:402\n316#1:403\n318#1:404,3\n316#1:407\n325#1:408\n325#1:409,3\n352#1:412,3\n256#1:415,9\n256#1:424\n256#1:426\n256#1:427\n135#1:389\n256#1:425\n*E\n"})
/* loaded from: classes7.dex */
public final class i implements rd.a, rd.c {

    /* renamed from: i, reason: collision with root package name */
    static final /* synthetic */ o<Object>[] f75780i = {l1.u(new g1(l1.d(i.class), ProtectedSandApp.s("榃\u0001"), ProtectedSandApp.s("榄\u0001"))), l1.u(new g1(l1.d(i.class), ProtectedSandApp.s("榅\u0001"), ProtectedSandApp.s("榆\u0001"))), l1.u(new g1(l1.d(i.class), ProtectedSandApp.s("榇\u0001"), ProtectedSandApp.s("榈\u0001")))};

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final h0 f75781a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.builtins.jvm.d f75782b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.i f75783c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.types.h0 f75784d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.i f75785e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.a<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.descriptors.e> f75786f;

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.i f75787g;

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.g<q0<String, String>, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g> f75788h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: JvmBuiltInsCustomizer.kt */
    private static final class a {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a HIDDEN = new a(ProtectedSandApp.s("楬\u0001"), 0);
        public static final a VISIBLE = new a(ProtectedSandApp.s("業\u0001"), 1);
        public static final a DEPRECATED_LIST_METHODS = new a(ProtectedSandApp.s("楮\u0001"), 2);
        public static final a NOT_CONSIDERED = new a(ProtectedSandApp.s("楯\u0001"), 3);
        public static final a DROP = new a(ProtectedSandApp.s("楰\u0001"), 4);

        private static final /* synthetic */ a[] $values() {
            return new a[]{HIDDEN, VISIBLE, DEPRECATED_LIST_METHODS, NOT_CONSIDERED, DROP};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.c.c($values);
        }

        private a(String str, int i4) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f75789a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.DEPRECATED_LIST_METHODS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.NOT_CONSIDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.DROP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.VISIBLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f75789a = iArr;
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    static final class c extends n0 implements ld.a<p0> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n f75791c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(n nVar) {
            super(0);
            this.f75791c = nVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p0 invoke() {
            h0 a5 = i.this.u().a();
            kotlin.reflect.jvm.internal.impl.builtins.jvm.e.f75755d.getClass();
            return y.c(a5, kotlin.reflect.jvm.internal.impl.builtins.jvm.e.f75759h, new k0(this.f75791c, i.this.u().a())).r();
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    public static final class d extends z {
        d(h0 h0Var, kotlin.reflect.jvm.internal.impl.name.c cVar) {
            super(h0Var, cVar);
        }

        @fg.l
        public h.c I0() {
            return h.c.f78002b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.l0
        public kotlin.reflect.jvm.internal.impl.resolve.scopes.h q() {
            return h.c.f78002b;
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    static final class e extends n0 implements ld.a<kotlin.reflect.jvm.internal.impl.types.h0> {
        e() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.types.h0 invoke() {
            p0 i4 = i.this.f75781a.p().i();
            l0.o(i4, ProtectedSandApp.s("楸\u0001"));
            return i4;
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    static final class f extends n0 implements ld.l<q0<? extends String, ? extends String>, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g> {
        f() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g invoke(@fg.l q0<String, String> q0Var) {
            l0.p(q0Var, ProtectedSandApp.s("楹\u0001"));
            String a5 = q0Var.a();
            String b5 = q0Var.b();
            return kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.a(w.k(kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.b(i.this.f75781a.p(), androidx.core.database.c.a(ProtectedSandApp.s("楺\u0001"), a5, ProtectedSandApp.s("楻\u0001"), b5, ProtectedSandApp.s("楼\u0001")), androidx.compose.runtime.changelist.j.a(b5, ProtectedSandApp.s("楽\u0001")), null, true, 4, null)));
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    static final class g extends n0 implements ld.a<kotlin.reflect.jvm.internal.impl.descriptors.e> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f f75794b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.e f75795c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            super(0);
            this.f75794b = fVar;
            this.f75795c = eVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.descriptors.e invoke() {
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f fVar = this.f75794b;
            kotlin.reflect.jvm.internal.impl.load.java.components.g gVar = kotlin.reflect.jvm.internal.impl.load.java.components.g.f76399a;
            l0.o(gVar, ProtectedSandApp.s("楾\u0001"));
            return fVar.O0(gVar, this.f75795c);
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    static final class h extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.resolve.scopes.h, Collection<? extends z0>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.f f75796b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(kotlin.reflect.jvm.internal.impl.name.f fVar) {
            super(1);
            this.f75796b = fVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<z0> invoke(@fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar) {
            l0.p(hVar, ProtectedSandApp.s("楿\u0001"));
            return hVar.a(this.f75796b, ud.d.FROM_BUILTINS);
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.i$i, reason: collision with other inner class name */
    public static final class C1076i extends b.AbstractC1200b<kotlin.reflect.jvm.internal.impl.descriptors.e, a> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f75797a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.h<a> f75798b;

        C1076i(String str, k1.h<a> hVar) {
            this.f75797a = str;
            this.f75798b = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.i$a] */
        /* JADX WARN: Type inference failed for: r0v6, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.i$a] */
        /* JADX WARN: Type inference failed for: r0v7, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.i$a] */
        /* JADX WARN: Type inference failed for: r0v8, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.i$a] */
        @Override // kotlin.reflect.jvm.internal.impl.utils.b.AbstractC1200b, kotlin.reflect.jvm.internal.impl.utils.b.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean b(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            l0.p(eVar, ProtectedSandApp.s("榀\u0001"));
            String a5 = x.a(a0.f76824a, eVar, this.f75797a);
            l lVar = l.f75804a;
            if (lVar.f().contains(a5)) {
                this.f75798b.f75329b = a.HIDDEN;
            } else if (lVar.i().contains(a5)) {
                this.f75798b.f75329b = a.VISIBLE;
            } else if (lVar.c().contains(a5)) {
                this.f75798b.f75329b = a.DEPRECATED_LIST_METHODS;
            } else if (lVar.d().contains(a5)) {
                this.f75798b.f75329b = a.DROP;
            }
            return this.f75798b.f75329b == null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.e
        @fg.l
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a result() {
            a aVar = this.f75798b.f75329b;
            return aVar == null ? a.NOT_CONSIDERED : aVar;
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    static final class j extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {
        j() {
            super(1);
        }

        @Override // ld.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            boolean z4;
            if (bVar.b() == b.a.DECLARATION) {
                kotlin.reflect.jvm.internal.impl.builtins.jvm.d dVar = i.this.f75782b;
                kotlin.reflect.jvm.internal.impl.descriptors.m c5 = bVar.c();
                l0.n(c5, ProtectedSandApp.s("榁\u0001"));
                if (dVar.c((kotlin.reflect.jvm.internal.impl.descriptors.e) c5)) {
                    z4 = true;
                    return Boolean.valueOf(z4);
                }
            }
            z4 = false;
            return Boolean.valueOf(z4);
        }
    }

    /* compiled from: JvmBuiltInsCustomizer.kt */
    static final class k extends n0 implements ld.a<kotlin.reflect.jvm.internal.impl.descriptors.annotations.g> {
        k() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g invoke() {
            return kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.a(w.k(kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.b(i.this.f75781a.p(), ProtectedSandApp.s("概\u0001"), null, null, true, 6, null)));
        }
    }

    public i(@fg.l h0 h0Var, @fg.l n nVar, @fg.l ld.a<f.b> aVar) {
        l0.p(h0Var, ProtectedSandApp.s("榉\u0001"));
        l0.p(nVar, ProtectedSandApp.s("榊\u0001"));
        l0.p(aVar, ProtectedSandApp.s("榋\u0001"));
        this.f75781a = h0Var;
        this.f75782b = kotlin.reflect.jvm.internal.impl.builtins.jvm.d.f75754a;
        this.f75783c = nVar.h(aVar);
        this.f75784d = l(nVar);
        this.f75785e = nVar.h(new c(nVar));
        this.f75786f = nVar.a();
        this.f75787g = nVar.h(new k());
        this.f75788h = nVar.e(new f());
    }

    private final z0 k(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e eVar, z0 z0Var) {
        z.a<? extends z0> A = z0Var.A();
        A.r(eVar);
        A.i(t.f76290e);
        A.n(eVar.r());
        A.d(eVar.K0());
        z0 a5 = A.a();
        l0.m(a5);
        return a5;
    }

    private final kotlin.reflect.jvm.internal.impl.types.h0 l(n nVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.impl.h hVar = new kotlin.reflect.jvm.internal.impl.descriptors.impl.h(new d(this.f75781a, new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("榌\u0001"))), kotlin.reflect.jvm.internal.impl.name.f.f(ProtectedSandApp.s("榍\u0001")), e0.ABSTRACT, kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE, w.k(new kotlin.reflect.jvm.internal.impl.types.k0(nVar, new e())), a1.f75900a, false, nVar);
        hVar.L0(h.c.f78002b, kotlin.collections.l0.f74939b, null);
        p0 r4 = hVar.r();
        l0.o(r4, ProtectedSandApp.s("榎\u0001"));
        return r4;
    }

    private final Collection<z0> m(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, ld.l<? super kotlin.reflect.jvm.internal.impl.resolve.scopes.h, ? extends Collection<? extends z0>> lVar) {
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f q4 = q(eVar);
        if (q4 == null) {
            return j0.f74919b;
        }
        kotlin.reflect.jvm.internal.impl.builtins.jvm.d dVar = this.f75782b;
        kotlin.reflect.jvm.internal.impl.name.c l4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.l(q4);
        kotlin.reflect.jvm.internal.impl.builtins.jvm.b.f75732i.getClass();
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> g4 = dVar.g(l4, kotlin.reflect.jvm.internal.impl.builtins.jvm.b.f75733j);
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.e) w.t3(g4);
        if (eVar2 == null) {
            return j0.f74919b;
        }
        g.b bVar = kotlin.reflect.jvm.internal.impl.utils.g.f78687d;
        ArrayList arrayList = new ArrayList(w.b0(g4, 10));
        Iterator<T> it = g4.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.l((kotlin.reflect.jvm.internal.impl.descriptors.e) it.next()));
        }
        kotlin.reflect.jvm.internal.impl.utils.g b5 = bVar.b(arrayList);
        boolean c5 = this.f75782b.c(eVar);
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h Z = this.f75786f.a(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.l(q4), new g(q4, eVar2)).Z();
        l0.o(Z, ProtectedSandApp.s("榏\u0001"));
        Collection<? extends z0> invoke = lVar.invoke(Z);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : invoke) {
            z0 z0Var = (z0) obj;
            if (z0Var.b() == b.a.DECLARATION && z0Var.getVisibility().d() && !kotlin.reflect.jvm.internal.impl.builtins.h.k0(z0Var)) {
                Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.z> e4 = z0Var.e();
                l0.o(e4, ProtectedSandApp.s("榐\u0001"));
                Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.z> collection = e4;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    Iterator<T> it2 = collection.iterator();
                    while (it2.hasNext()) {
                        kotlin.reflect.jvm.internal.impl.descriptors.m c6 = ((kotlin.reflect.jvm.internal.impl.descriptors.z) it2.next()).c();
                        l0.o(c6, ProtectedSandApp.s("榑\u0001"));
                        if (b5.contains(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.l(c6))) {
                            break;
                        }
                    }
                }
                if (!v(z0Var, c5)) {
                    arrayList2.add(obj);
                }
            }
        }
        return arrayList2;
    }

    private final p0 n() {
        return (p0) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f75785e, this, f75780i[1]);
    }

    private static final boolean o(kotlin.reflect.jvm.internal.impl.descriptors.l lVar, q1 q1Var, kotlin.reflect.jvm.internal.impl.descriptors.l lVar2) {
        return kotlin.reflect.jvm.internal.impl.resolve.l.x(lVar, lVar2.d(q1Var)) == l.i.a.OVERRIDABLE;
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f q(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        kotlin.reflect.jvm.internal.impl.name.b n4;
        kotlin.reflect.jvm.internal.impl.name.c b5;
        if (kotlin.reflect.jvm.internal.impl.builtins.h.a0(eVar) || !kotlin.reflect.jvm.internal.impl.builtins.h.B0(eVar)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.name.d m4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.m(eVar);
        if (!m4.f() || (n4 = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f75734a.n(m4)) == null || (b5 = n4.b()) == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e d5 = s.d(u().a(), b5, ud.d.FROM_BUILTINS);
        if (d5 instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f) {
            return (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f) d5;
        }
        return null;
    }

    private final a r(kotlin.reflect.jvm.internal.impl.descriptors.z zVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.m c5 = zVar.c();
        l0.n(c5, ProtectedSandApp.s("榒\u0001"));
        Object b5 = kotlin.reflect.jvm.internal.impl.utils.b.b(w.k((kotlin.reflect.jvm.internal.impl.descriptors.e) c5), new kotlin.reflect.jvm.internal.impl.builtins.jvm.h(this), new C1076i(kotlin.reflect.jvm.internal.impl.load.kotlin.y.c(zVar, false, false, 3, null), new k1.h()));
        l0.o(b5, ProtectedSandApp.s("榓\u0001"));
        return (a) b5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable s(i iVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l0.p(iVar, ProtectedSandApp.s("榔\u0001"));
        Collection<kotlin.reflect.jvm.internal.impl.types.h0> j4 = eVar.j().j();
        l0.o(j4, ProtectedSandApp.s("榕\u0001"));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = j4.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.h c5 = ((kotlin.reflect.jvm.internal.impl.types.h0) it.next()).O0().c();
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f fVar = null;
            kotlin.reflect.jvm.internal.impl.descriptors.h a5 = c5 != null ? c5.a() : null;
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar2 = a5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) a5 : null;
            if (eVar2 != null && (fVar = iVar.q(eVar2)) == null) {
                fVar = eVar2;
            }
            if (fVar != null) {
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g t() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.annotations.g) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f75787g, this, f75780i[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.b u() {
        return (f.b) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f75783c, this, f75780i[0]);
    }

    private final boolean v(z0 z0Var, boolean z4) {
        kotlin.reflect.jvm.internal.impl.descriptors.m c5 = z0Var.c();
        l0.n(c5, ProtectedSandApp.s("榒\u0001"));
        String c6 = kotlin.reflect.jvm.internal.impl.load.kotlin.y.c(z0Var, false, false, 3, null);
        if (z4 ^ l.f75804a.g().contains(x.a(a0.f76824a, (kotlin.reflect.jvm.internal.impl.descriptors.e) c5, c6))) {
            return true;
        }
        Boolean e4 = kotlin.reflect.jvm.internal.impl.utils.b.e(w.k(z0Var), kotlin.reflect.jvm.internal.impl.builtins.jvm.g.f75778a, new j());
        l0.o(e4, ProtectedSandApp.s("榖\u0001"));
        return e4.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable w(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        return bVar.a().e();
    }

    private final boolean x(kotlin.reflect.jvm.internal.impl.descriptors.l lVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (lVar.i().size() == 1) {
            List<j1> i4 = lVar.i();
            l0.o(i4, ProtectedSandApp.s("榗\u0001"));
            kotlin.reflect.jvm.internal.impl.descriptors.h c5 = ((j1) w.h5(i4)).getType().O0().c();
            if (l0.g(c5 != null ? kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.m(c5) : null, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.m(eVar))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x011c, code lost:
    
        if (r3 != 4) goto L52;
     */
    @Override // rd.a
    @fg.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.z0> a(@fg.l kotlin.reflect.jvm.internal.impl.name.f r7, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.e r8) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.jvm.i.a(kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.descriptors.e):java.util.Collection");
    }

    @Override // rd.c
    public boolean b(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @fg.l z0 z0Var) {
        l0.p(eVar, ProtectedSandApp.s("榙\u0001"));
        l0.p(z0Var, ProtectedSandApp.s("榟\u0001"));
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f q4 = q(eVar);
        if (q4 == null || !z0Var.getAnnotations().o3(rd.d.a())) {
            return true;
        }
        if (!u().b()) {
            return false;
        }
        String c5 = kotlin.reflect.jvm.internal.impl.load.kotlin.y.c(z0Var, false, false, 3, null);
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g Z = q4.Z();
        kotlin.reflect.jvm.internal.impl.name.f name = z0Var.getName();
        l0.o(name, ProtectedSandApp.s("榠\u0001"));
        Collection<z0> a5 = Z.a(name, ud.d.FROM_BUILTINS);
        if (!(a5 instanceof Collection) || !a5.isEmpty()) {
            Iterator<T> it = a5.iterator();
            while (it.hasNext()) {
                if (l0.g(kotlin.reflect.jvm.internal.impl.load.kotlin.y.c((z0) it.next(), false, false, 3, null), c5)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // rd.a
    @fg.l
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> c(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l0.p(eVar, ProtectedSandApp.s("榙\u0001"));
        if (eVar.b() != kotlin.reflect.jvm.internal.impl.descriptors.f.CLASS || !u().b()) {
            return j0.f74919b;
        }
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f q4 = q(eVar);
        if (q4 == null) {
            return j0.f74919b;
        }
        kotlin.reflect.jvm.internal.impl.builtins.jvm.d dVar = this.f75782b;
        kotlin.reflect.jvm.internal.impl.name.c l4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.l(q4);
        kotlin.reflect.jvm.internal.impl.builtins.jvm.b.f75732i.getClass();
        kotlin.reflect.jvm.internal.impl.descriptors.e f4 = kotlin.reflect.jvm.internal.impl.builtins.jvm.d.f(dVar, l4, kotlin.reflect.jvm.internal.impl.builtins.jvm.b.f75733j, null, 4, null);
        if (f4 == null) {
            return j0.f74919b;
        }
        q1 c5 = m.a(f4, q4).c();
        List<kotlin.reflect.jvm.internal.impl.descriptors.d> h4 = q4.h();
        ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.d> arrayList = new ArrayList();
        for (Object obj : h4) {
            kotlin.reflect.jvm.internal.impl.descriptors.d dVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.d) obj;
            if (dVar2.getVisibility().d()) {
                Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> h5 = f4.h();
                l0.o(h5, ProtectedSandApp.s("榡\u0001"));
                Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> collection = h5;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    for (kotlin.reflect.jvm.internal.impl.descriptors.d dVar3 : collection) {
                        l0.m(dVar3);
                        if (o(dVar3, c5, dVar2)) {
                            break;
                        }
                    }
                }
                if (!x(dVar2, eVar) && !kotlin.reflect.jvm.internal.impl.builtins.h.k0(dVar2) && !l.f75804a.e().contains(x.a(a0.f76824a, q4, kotlin.reflect.jvm.internal.impl.load.kotlin.y.c(dVar2, false, false, 3, null)))) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(w.b0(arrayList, 10));
        for (kotlin.reflect.jvm.internal.impl.descriptors.d dVar4 : arrayList) {
            z.a<? extends kotlin.reflect.jvm.internal.impl.descriptors.z> A = dVar4.A();
            A.r(eVar);
            A.n(eVar.r());
            A.m();
            A.g(c5.j());
            if (!l.f75804a.h().contains(x.a(a0.f76824a, q4, kotlin.reflect.jvm.internal.impl.load.kotlin.y.c(dVar4, false, false, 3, null)))) {
                A.t(t());
            }
            kotlin.reflect.jvm.internal.impl.descriptors.z a5 = A.a();
            l0.n(a5, ProtectedSandApp.s("榢\u0001"));
            arrayList2.add((kotlin.reflect.jvm.internal.impl.descriptors.d) a5);
        }
        return arrayList2;
    }

    @Override // rd.a
    @fg.l
    public Collection<kotlin.reflect.jvm.internal.impl.types.h0> d(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l0.p(eVar, ProtectedSandApp.s("榙\u0001"));
        kotlin.reflect.jvm.internal.impl.name.d m4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.m(eVar);
        l lVar = l.f75804a;
        if (!lVar.j(m4)) {
            return lVar.k(m4) ? w.k(this.f75784d) : j0.f74919b;
        }
        p0 n4 = n();
        l0.o(n4, ProtectedSandApp.s("榣\u0001"));
        return w.O(n4, this.f75784d);
    }

    @Override // rd.a
    @fg.l
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Set<kotlin.reflect.jvm.internal.impl.name.f> e(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g Z;
        Set<kotlin.reflect.jvm.internal.impl.name.f> c5;
        l0.p(eVar, ProtectedSandApp.s("榙\u0001"));
        if (!u().b()) {
            return kotlin.collections.l0.f74939b;
        }
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f q4 = q(eVar);
        return (q4 == null || (Z = q4.Z()) == null || (c5 = Z.c()) == null) ? kotlin.collections.l0.f74939b : c5;
    }
}
