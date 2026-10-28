package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.load.kotlin.b.a;
import kotlin.reflect.jvm.internal.impl.load.kotlin.t;
import kotlin.reflect.jvm.internal.impl.load.kotlin.w;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.a;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.b0;

/* compiled from: AbstractBinaryClassAnnotationLoader.kt */
@r1({"SMAP\nAbstractBinaryClassAnnotationLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractBinaryClassAnnotationLoader.kt\norg/jetbrains/kotlin/load/kotlin/AbstractBinaryClassAnnotationLoader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,338:1\n1549#2:339\n1620#2,3:340\n1549#2:343\n1620#2,3:344\n*S KotlinDebug\n*F\n+ 1 AbstractBinaryClassAnnotationLoader.kt\norg/jetbrains/kotlin/load/kotlin/AbstractBinaryClassAnnotationLoader\n*L\n197#1:339\n197#1:340,3\n201#1:343\n201#1:344,3\n*E\n"})
/* loaded from: classes7.dex */
public abstract class b<A, S extends a<? extends A>> implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.f<A> {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    public static final C1100b f76826b = new C1100b();

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final r f76827a;

    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    public static abstract class a<A> {
        @fg.l
        public abstract Map<w, List<A>> a();
    }

    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    @r1({"SMAP\nAbstractBinaryClassAnnotationLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractBinaryClassAnnotationLoader.kt\norg/jetbrains/kotlin/load/kotlin/AbstractBinaryClassAnnotationLoader$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,338:1\n1#2:339\n*E\n"})
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.b$b, reason: collision with other inner class name */
    public static final class C1100b {
        private C1100b() {
        }

        @fg.m
        public final t a(@fg.l kotlin.reflect.jvm.internal.impl.serialization.deserialization.b0 b0Var, boolean z4, boolean z5, @fg.m Boolean bool, boolean z6, @fg.l r rVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e eVar) {
            b0.a h4;
            l0.p(b0Var, ProtectedSandApp.s("玍\u0001"));
            l0.p(rVar, ProtectedSandApp.s("玎\u0001"));
            l0.p(eVar, ProtectedSandApp.s("玏\u0001"));
            if (z4) {
                if (bool == null) {
                    throw new IllegalStateException((ProtectedSandApp.s("玔\u0001") + b0Var + ')').toString());
                }
                if (b0Var instanceof b0.a) {
                    b0.a aVar = (b0.a) b0Var;
                    if (aVar.g() == a.c.EnumC1120c.INTERFACE) {
                        kotlin.reflect.jvm.internal.impl.name.b d5 = aVar.e().d(kotlin.reflect.jvm.internal.impl.name.f.f(ProtectedSandApp.s("玐\u0001")));
                        l0.o(d5, ProtectedSandApp.s("玑\u0001"));
                        return s.a(rVar, d5, eVar);
                    }
                }
                if (bool.booleanValue() && (b0Var instanceof b0.b)) {
                    a1 c5 = b0Var.c();
                    n nVar = c5 instanceof n ? (n) c5 : null;
                    kotlin.reflect.jvm.internal.impl.resolve.jvm.d f4 = nVar != null ? nVar.f() : null;
                    if (f4 != null) {
                        String f5 = f4.f();
                        l0.o(f5, ProtectedSandApp.s("玒\u0001"));
                        kotlin.reflect.jvm.internal.impl.name.b m4 = kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(kotlin.text.v.h2(f5, '/', '.', false, 4, null)));
                        l0.o(m4, ProtectedSandApp.s("玓\u0001"));
                        return s.a(rVar, m4, eVar);
                    }
                }
            }
            if (z5 && (b0Var instanceof b0.a)) {
                b0.a aVar2 = (b0.a) b0Var;
                if (aVar2.g() == a.c.EnumC1120c.COMPANION_OBJECT && (h4 = aVar2.h()) != null && (h4.g() == a.c.EnumC1120c.CLASS || h4.g() == a.c.EnumC1120c.ENUM_CLASS || (z6 && (h4.g() == a.c.EnumC1120c.INTERFACE || h4.g() == a.c.EnumC1120c.ANNOTATION_CLASS)))) {
                    a1 c6 = h4.c();
                    v vVar = c6 instanceof v ? (v) c6 : null;
                    if (vVar != null) {
                        return vVar.d();
                    }
                    return null;
                }
            }
            if (!(b0Var instanceof b0.b) || !(b0Var.c() instanceof n)) {
                return null;
            }
            a1 c7 = b0Var.c();
            l0.n(c7, ProtectedSandApp.s("玕\u0001"));
            n nVar2 = (n) c7;
            t g4 = nVar2.g();
            return g4 == null ? s.a(rVar, nVar2.d(), eVar) : g4;
        }

        public C1100b(kotlin.jvm.internal.w wVar) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    private static final class c {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c PROPERTY = new c(ProtectedSandApp.s("玖\u0001"), 0);
        public static final c BACKING_FIELD = new c(ProtectedSandApp.s("玗\u0001"), 1);
        public static final c DELEGATE_FIELD = new c(ProtectedSandApp.s("玘\u0001"), 2);

        private static final /* synthetic */ c[] $values() {
            return new c[]{PROPERTY, BACKING_FIELD, DELEGATE_FIELD};
        }

        static {
            c[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.c.c($values);
        }

        private c(String str, int i4) {
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76828a;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.serialization.deserialization.b.values().length];
            try {
                iArr[kotlin.reflect.jvm.internal.impl.serialization.deserialization.b.PROPERTY_GETTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.serialization.deserialization.b.PROPERTY_SETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.serialization.deserialization.b.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f76828a = iArr;
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    public static final class e implements t.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b<A, S> f76829a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList<A> f76830b;

        e(b<A, S> bVar, ArrayList<A> arrayList) {
            this.f76829a = bVar;
            this.f76830b = arrayList;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.c
        public void a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.c
        @fg.m
        public t.a c(@fg.l kotlin.reflect.jvm.internal.impl.name.b bVar, @fg.l a1 a1Var) {
            l0.p(bVar, ProtectedSandApp.s("玙\u0001"));
            l0.p(a1Var, ProtectedSandApp.s("玚\u0001"));
            return this.f76829a.y(bVar, a1Var, this.f76830b);
        }
    }

    public b(@fg.l r rVar) {
        l0.p(rVar, ProtectedSandApp.s("獫\u0001"));
        this.f76827a = rVar;
    }

    private final t A(b0.a aVar) {
        a1 c5 = aVar.c();
        v vVar = c5 instanceof v ? (v) c5 : null;
        if (vVar != null) {
            return vVar.d();
        }
        return null;
    }

    private final int l(kotlin.reflect.jvm.internal.impl.serialization.deserialization.b0 b0Var, kotlin.reflect.jvm.internal.impl.protobuf.o oVar) {
        if (oVar instanceof a.i) {
            if (!kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.g((a.i) oVar)) {
                return 0;
            }
        } else if (oVar instanceof a.n) {
            if (!kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.h((a.n) oVar)) {
                return 0;
            }
        } else {
            if (!(oVar instanceof a.d)) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("獭\u0001") + oVar.getClass());
            }
            l0.n(b0Var, ProtectedSandApp.s("獬\u0001"));
            b0.a aVar = (b0.a) b0Var;
            if (aVar.g() == a.c.EnumC1120c.ENUM_CLASS) {
                return 2;
            }
            if (!aVar.i()) {
                return 0;
            }
        }
        return 1;
    }

    private final List<A> m(kotlin.reflect.jvm.internal.impl.serialization.deserialization.b0 b0Var, w wVar, boolean z4, boolean z5, Boolean bool, boolean z6) {
        t o4 = o(b0Var, f76826b.a(b0Var, z4, z5, bool, z6, this.f76827a, t()));
        if (o4 == null) {
            return j0.f74919b;
        }
        List<A> list = p(o4).a().get(wVar);
        return list == null ? j0.f74919b : list;
    }

    static /* synthetic */ List n(b bVar, kotlin.reflect.jvm.internal.impl.serialization.deserialization.b0 b0Var, w wVar, boolean z4, boolean z5, Boolean bool, boolean z6, int i4, Object obj) {
        if (obj == null) {
            return bVar.m(b0Var, wVar, (i4 & 4) != 0 ? false : z4, (i4 & 8) != 0 ? false : z5, (i4 & 16) != 0 ? null : bool, (i4 & 32) != 0 ? false : z6);
        }
        throw new UnsupportedOperationException(ProtectedSandApp.s("獮\u0001"));
    }

    public static /* synthetic */ w s(b bVar, kotlin.reflect.jvm.internal.impl.protobuf.o oVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, kotlin.reflect.jvm.internal.impl.serialization.deserialization.b bVar2, boolean z4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("獯\u0001"));
        }
        if ((i4 & 16) != 0) {
            z4 = false;
        }
        return bVar.r(oVar, cVar, gVar, bVar2, z4);
    }

    private final List<A> z(kotlin.reflect.jvm.internal.impl.serialization.deserialization.b0 b0Var, a.n nVar, c cVar) {
        Boolean d5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.B.d(nVar.b0());
        l0.o(d5, ProtectedSandApp.s("獰\u0001"));
        d5.booleanValue();
        boolean f4 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.f(nVar);
        if (cVar == c.PROPERTY) {
            w b5 = kotlin.reflect.jvm.internal.impl.load.kotlin.c.b(nVar, b0Var.b(), b0Var.d(), false, true, false, 40, null);
            return b5 == null ? j0.f74919b : n(this, b0Var, b5, true, false, d5, f4, 8, null);
        }
        w b6 = kotlin.reflect.jvm.internal.impl.load.kotlin.c.b(nVar, b0Var.b(), b0Var.d(), true, false, false, 48, null);
        if (b6 == null) {
            return j0.f74919b;
        }
        return kotlin.text.v.T2(b6.a(), ProtectedSandApp.s("獱\u0001"), false, 2, null) != (cVar == c.DELEGATE_FIELD) ? j0.f74919b : m(b0Var, b6, true, true, d5, f4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @fg.l
    public List<A> a(@fg.l kotlin.reflect.jvm.internal.impl.serialization.deserialization.b0 b0Var, @fg.l kotlin.reflect.jvm.internal.impl.protobuf.o oVar, @fg.l kotlin.reflect.jvm.internal.impl.serialization.deserialization.b bVar, int i4, @fg.l a.u uVar) {
        l0.p(b0Var, ProtectedSandApp.s("獲\u0001"));
        l0.p(oVar, ProtectedSandApp.s("獳\u0001"));
        l0.p(bVar, ProtectedSandApp.s("獴\u0001"));
        l0.p(uVar, ProtectedSandApp.s("獵\u0001"));
        w s4 = s(this, oVar, b0Var.b(), b0Var.d(), bVar, false, 16, null);
        if (s4 == null) {
            return j0.f74919b;
        }
        return n(this, b0Var, w.f76957b.e(s4, i4 + l(b0Var, oVar)), false, false, null, false, 60, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @fg.l
    public List<A> b(@fg.l b0.a aVar) {
        l0.p(aVar, ProtectedSandApp.s("獲\u0001"));
        t A = A(aVar);
        if (A != null) {
            ArrayList arrayList = new ArrayList(1);
            A.p(new e(this, arrayList), q(A));
            return arrayList;
        }
        throw new IllegalStateException((ProtectedSandApp.s("獶\u0001") + aVar.a()).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @fg.l
    public List<A> c(@fg.l a.q qVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar) {
        l0.p(qVar, ProtectedSandApp.s("獵\u0001"));
        l0.p(cVar, ProtectedSandApp.s("獷\u0001"));
        Object r4 = qVar.r(kotlin.reflect.jvm.internal.impl.metadata.jvm.a.f77452f);
        l0.o(r4, ProtectedSandApp.s("獸\u0001"));
        Iterable<a.b> iterable = (Iterable) r4;
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(iterable, 10));
        for (a.b bVar : iterable) {
            l0.m(bVar);
            arrayList.add(w(bVar, cVar));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @fg.l
    public List<A> d(@fg.l kotlin.reflect.jvm.internal.impl.serialization.deserialization.b0 b0Var, @fg.l a.g gVar) {
        l0.p(b0Var, ProtectedSandApp.s("獲\u0001"));
        l0.p(gVar, ProtectedSandApp.s("獵\u0001"));
        w.a aVar = w.f76957b;
        String string = b0Var.b().getString(gVar.G());
        String c5 = ((b0.a) b0Var).e().c();
        l0.o(c5, ProtectedSandApp.s("獹\u0001"));
        return n(this, b0Var, aVar.a(string, kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.b.b(c5)), false, false, null, false, 60, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @fg.l
    public List<A> e(@fg.l kotlin.reflect.jvm.internal.impl.serialization.deserialization.b0 b0Var, @fg.l kotlin.reflect.jvm.internal.impl.protobuf.o oVar, @fg.l kotlin.reflect.jvm.internal.impl.serialization.deserialization.b bVar) {
        l0.p(b0Var, ProtectedSandApp.s("獲\u0001"));
        l0.p(oVar, ProtectedSandApp.s("獵\u0001"));
        l0.p(bVar, ProtectedSandApp.s("獴\u0001"));
        if (bVar == kotlin.reflect.jvm.internal.impl.serialization.deserialization.b.PROPERTY) {
            return z(b0Var, (a.n) oVar, c.PROPERTY);
        }
        w s4 = s(this, oVar, b0Var.b(), b0Var.d(), bVar, false, 16, null);
        return s4 == null ? j0.f74919b : n(this, b0Var, s4, false, false, null, false, 60, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @fg.l
    public List<A> g(@fg.l a.s sVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar) {
        l0.p(sVar, ProtectedSandApp.s("獵\u0001"));
        l0.p(cVar, ProtectedSandApp.s("獷\u0001"));
        Object r4 = sVar.r(kotlin.reflect.jvm.internal.impl.metadata.jvm.a.f77454h);
        l0.o(r4, ProtectedSandApp.s("獸\u0001"));
        Iterable<a.b> iterable = (Iterable) r4;
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(iterable, 10));
        for (a.b bVar : iterable) {
            l0.m(bVar);
            arrayList.add(w(bVar, cVar));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @fg.l
    public List<A> i(@fg.l kotlin.reflect.jvm.internal.impl.serialization.deserialization.b0 b0Var, @fg.l a.n nVar) {
        l0.p(b0Var, ProtectedSandApp.s("獲\u0001"));
        l0.p(nVar, ProtectedSandApp.s("獵\u0001"));
        return z(b0Var, nVar, c.BACKING_FIELD);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @fg.l
    public List<A> j(@fg.l kotlin.reflect.jvm.internal.impl.serialization.deserialization.b0 b0Var, @fg.l kotlin.reflect.jvm.internal.impl.protobuf.o oVar, @fg.l kotlin.reflect.jvm.internal.impl.serialization.deserialization.b bVar) {
        l0.p(b0Var, ProtectedSandApp.s("獲\u0001"));
        l0.p(oVar, ProtectedSandApp.s("獵\u0001"));
        l0.p(bVar, ProtectedSandApp.s("獴\u0001"));
        w s4 = s(this, oVar, b0Var.b(), b0Var.d(), bVar, false, 16, null);
        return s4 != null ? n(this, b0Var, w.f76957b.e(s4, 0), false, false, null, false, 60, null) : j0.f74919b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @fg.l
    public List<A> k(@fg.l kotlin.reflect.jvm.internal.impl.serialization.deserialization.b0 b0Var, @fg.l a.n nVar) {
        l0.p(b0Var, ProtectedSandApp.s("獲\u0001"));
        l0.p(nVar, ProtectedSandApp.s("獵\u0001"));
        return z(b0Var, nVar, c.DELEGATE_FIELD);
    }

    @fg.m
    protected final t o(@fg.l kotlin.reflect.jvm.internal.impl.serialization.deserialization.b0 b0Var, @fg.m t tVar) {
        l0.p(b0Var, ProtectedSandApp.s("獲\u0001"));
        if (tVar != null) {
            return tVar;
        }
        if (b0Var instanceof b0.a) {
            return A((b0.a) b0Var);
        }
        return null;
    }

    @fg.l
    protected abstract S p(@fg.l t tVar);

    @fg.m
    protected byte[] q(@fg.l t tVar) {
        l0.p(tVar, ProtectedSandApp.s("獺\u0001"));
        return null;
    }

    @fg.m
    protected final w r(@fg.l kotlin.reflect.jvm.internal.impl.protobuf.o oVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, @fg.l kotlin.reflect.jvm.internal.impl.serialization.deserialization.b bVar, boolean z4) {
        l0.p(oVar, ProtectedSandApp.s("獵\u0001"));
        l0.p(cVar, ProtectedSandApp.s("獷\u0001"));
        l0.p(gVar, ProtectedSandApp.s("獻\u0001"));
        l0.p(bVar, ProtectedSandApp.s("獴\u0001"));
        if (oVar instanceof a.d) {
            w.a aVar = w.f76957b;
            d.b b5 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.f77559a.b((a.d) oVar, cVar, gVar);
            if (b5 == null) {
                return null;
            }
            return aVar.b(b5);
        }
        if (oVar instanceof a.i) {
            w.a aVar2 = w.f76957b;
            d.b e4 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.f77559a.e((a.i) oVar, cVar, gVar);
            if (e4 == null) {
                return null;
            }
            return aVar2.b(e4);
        }
        if (!(oVar instanceof a.n)) {
            return null;
        }
        h.g<a.n, a.d> gVar2 = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.f77450d;
        l0.o(gVar2, ProtectedSandApp.s("獼\u0001"));
        a.d dVar = (a.d) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a((h.d) oVar, gVar2);
        if (dVar == null) {
            return null;
        }
        int i4 = d.f76828a[bVar.ordinal()];
        if (i4 == 1) {
            if (!dVar.I()) {
                return null;
            }
            w.a aVar3 = w.f76957b;
            a.c D = dVar.D();
            l0.o(D, ProtectedSandApp.s("獾\u0001"));
            return aVar3.c(cVar, D);
        }
        if (i4 != 2) {
            if (i4 != 3) {
                return null;
            }
            return kotlin.reflect.jvm.internal.impl.load.kotlin.c.a((a.n) oVar, cVar, gVar, true, true, z4);
        }
        if (!dVar.J()) {
            return null;
        }
        w.a aVar4 = w.f76957b;
        a.c E = dVar.E();
        l0.o(E, ProtectedSandApp.s("獽\u0001"));
        return aVar4.c(cVar, E);
    }

    @fg.l
    public abstract kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e t();

    @fg.l
    protected final r u() {
        return this.f76827a;
    }

    protected final boolean v(@fg.l kotlin.reflect.jvm.internal.impl.name.b bVar) {
        t a5;
        l0.p(bVar, ProtectedSandApp.s("獿\u0001"));
        return bVar.g() != null && l0.g(bVar.j().b(), ProtectedSandApp.s("玀\u0001")) && (a5 = s.a(this.f76827a, bVar, t())) != null && kotlin.reflect.jvm.internal.impl.a.f75657a.c(a5);
    }

    @fg.l
    public abstract A w(@fg.l a.b bVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar);

    @fg.m
    protected abstract t.a x(@fg.l kotlin.reflect.jvm.internal.impl.name.b bVar, @fg.l a1 a1Var, @fg.l List<A> list);

    @fg.m
    protected final t.a y(@fg.l kotlin.reflect.jvm.internal.impl.name.b bVar, @fg.l a1 a1Var, @fg.l List<A> list) {
        l0.p(bVar, ProtectedSandApp.s("玁\u0001"));
        l0.p(a1Var, ProtectedSandApp.s("玂\u0001"));
        l0.p(list, ProtectedSandApp.s("玃\u0001"));
        if (kotlin.reflect.jvm.internal.impl.a.f75657a.b().contains(bVar)) {
            return null;
        }
        return x(bVar, a1Var, list);
    }
}
