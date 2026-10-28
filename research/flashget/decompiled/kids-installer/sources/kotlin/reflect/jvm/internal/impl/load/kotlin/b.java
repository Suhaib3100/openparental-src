package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.load.kotlin.b.a;
import kotlin.reflect.jvm.internal.impl.load.kotlin.r;
import kotlin.reflect.jvm.internal.impl.load.kotlin.u;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.a;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a0;
import kotlin.text.e0;
import kotlin.text.h0;

/* compiled from: AbstractBinaryClassAnnotationLoader.kt */
/* loaded from: classes5.dex */
public abstract class b<A, S extends a<? extends A>> implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.f<A> {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final p f24951a;

    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    public static abstract class a<A> {
        @d5.d
        public abstract Map<u, List<A>> a();
    }

    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.b$b, reason: collision with other inner class name */
    private enum EnumC0295b {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD
    }

    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24952a;

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
            f24952a = iArr;
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    public static final class d implements r.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b<A, S> f24953a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList<A> f24954b;

        d(b<A, S> bVar, ArrayList<A> arrayList) {
            this.f24953a = bVar;
            this.f24954b = arrayList;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.c
        public void a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.c
        @d5.e
        public r.a b(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar, @d5.d a1 a1Var) {
            l0.p(bVar, ProtectedSandApp.s("䮝"));
            l0.p(a1Var, ProtectedSandApp.s("䮞"));
            return this.f24953a.w(bVar, a1Var, this.f24954b);
        }
    }

    public b(@d5.d p pVar) {
        l0.p(pVar, ProtectedSandApp.s("䮠"));
        this.f24951a = pVar;
    }

    private final int l(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a0 a0Var, kotlin.reflect.jvm.internal.impl.protobuf.o oVar) {
        if (oVar instanceof a.i) {
            if (kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.g((a.i) oVar)) {
                return 1;
            }
        } else if (oVar instanceof a.n) {
            if (kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.h((a.n) oVar)) {
                return 1;
            }
        } else {
            if (!(oVar instanceof a.d)) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("䮢") + oVar.getClass());
            }
            l0.n(a0Var, ProtectedSandApp.s("䮡"));
            a0.a aVar = (a0.a) a0Var;
            if (aVar.g() == a.c.EnumC0315c.ENUM_CLASS) {
                return 2;
            }
            if (aVar.i()) {
                return 1;
            }
        }
        return 0;
    }

    private final List<A> m(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a0 a0Var, u uVar, boolean z5, boolean z6, Boolean bool, boolean z7) {
        r o5 = o(a0Var, t(a0Var, z5, z6, bool, z7));
        if (o5 == null) {
            return EmptyList.f23167o;
        }
        List<A> list = p(o5).a().get(uVar);
        return list == null ? EmptyList.f23167o : list;
    }

    static /* synthetic */ List n(b bVar, kotlin.reflect.jvm.internal.impl.serialization.deserialization.a0 a0Var, u uVar, boolean z5, boolean z6, Boolean bool, boolean z7, int i5, Object obj) {
        if (obj == null) {
            return bVar.m(a0Var, uVar, (i5 & 4) != 0 ? false : z5, (i5 & 8) != 0 ? false : z6, (i5 & 16) != 0 ? null : bool, (i5 & 32) != 0 ? false : z7);
        }
        throw new UnsupportedOperationException(ProtectedSandApp.s("䮣"));
    }

    public static /* synthetic */ u s(b bVar, kotlin.reflect.jvm.internal.impl.protobuf.o oVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, kotlin.reflect.jvm.internal.impl.serialization.deserialization.b bVar2, boolean z5, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("䮤"));
        }
        if ((i5 & 16) != 0) {
            z5 = false;
        }
        return bVar.r(oVar, cVar, gVar, bVar2, z5);
    }

    private final List<A> x(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a0 a0Var, a.n nVar, EnumC0295b enumC0295b) {
        boolean T2;
        Boolean d6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.A.d(nVar.b0());
        l0.o(d6, ProtectedSandApp.s("䮥"));
        boolean booleanValue = d6.booleanValue();
        boolean f6 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.f(nVar);
        if (enumC0295b == EnumC0295b.PROPERTY) {
            u b6 = kotlin.reflect.jvm.internal.impl.load.kotlin.c.b(nVar, a0Var.b(), a0Var.d(), false, true, false, 40, null);
            return b6 == null ? EmptyList.f23167o : n(this, a0Var, b6, true, false, Boolean.valueOf(booleanValue), f6, 8, null);
        }
        u b7 = kotlin.reflect.jvm.internal.impl.load.kotlin.c.b(nVar, a0Var.b(), a0Var.d(), true, false, false, 48, null);
        if (b7 == null) {
            return EmptyList.f23167o;
        }
        T2 = h0.T2(b7.a(), ProtectedSandApp.s("䮦"), false, 2, null);
        return T2 != (enumC0295b == EnumC0295b.DELEGATE_FIELD) ? EmptyList.f23167o : m(a0Var, b7, true, true, Boolean.valueOf(booleanValue), f6);
    }

    private final r z(a0.a aVar) {
        a1 c6 = aVar.c();
        t tVar = c6 instanceof t ? (t) c6 : null;
        if (tVar != null) {
            return tVar.d();
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @d5.d
    public List<A> a(@d5.d a.s sVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar) {
        int b02;
        l0.p(sVar, ProtectedSandApp.s("䮧"));
        l0.p(cVar, ProtectedSandApp.s("䮨"));
        Object r5 = sVar.r(kotlin.reflect.jvm.internal.impl.metadata.jvm.a.f25476h);
        l0.o(r5, ProtectedSandApp.s("䮩"));
        Iterable<a.b> iterable = (Iterable) r5;
        b02 = kotlin.collections.b0.b0(iterable, 10);
        ArrayList arrayList = new ArrayList(b02);
        for (a.b bVar : iterable) {
            l0.o(bVar, ProtectedSandApp.s("䮪"));
            arrayList.add(y(bVar, cVar));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @d5.d
    public List<A> b(@d5.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.a0 a0Var, @d5.d kotlin.reflect.jvm.internal.impl.protobuf.o oVar, @d5.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.b bVar, int i5, @d5.d a.u uVar) {
        l0.p(a0Var, ProtectedSandApp.s("䮫"));
        l0.p(oVar, ProtectedSandApp.s("䮬"));
        l0.p(bVar, ProtectedSandApp.s("䮭"));
        l0.p(uVar, ProtectedSandApp.s("䮮"));
        u s5 = s(this, oVar, a0Var.b(), a0Var.d(), bVar, false, 16, null);
        if (s5 == null) {
            return EmptyList.f23167o;
        }
        return n(this, a0Var, u.f25075b.e(s5, i5 + l(a0Var, oVar)), false, false, null, false, 60, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @d5.d
    public List<A> c(@d5.d a0.a aVar) {
        l0.p(aVar, ProtectedSandApp.s("䮯"));
        r z5 = z(aVar);
        if (z5 != null) {
            ArrayList arrayList = new ArrayList(1);
            z5.b(new d(this, arrayList), q(z5));
            return arrayList;
        }
        throw new IllegalStateException((ProtectedSandApp.s("䮰") + aVar.a()).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @d5.d
    public List<A> d(@d5.d a.q qVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar) {
        int b02;
        l0.p(qVar, ProtectedSandApp.s("䮱"));
        l0.p(cVar, ProtectedSandApp.s("䮲"));
        Object r5 = qVar.r(kotlin.reflect.jvm.internal.impl.metadata.jvm.a.f25474f);
        l0.o(r5, ProtectedSandApp.s("䮳"));
        Iterable<a.b> iterable = (Iterable) r5;
        b02 = kotlin.collections.b0.b0(iterable, 10);
        ArrayList arrayList = new ArrayList(b02);
        for (a.b bVar : iterable) {
            l0.o(bVar, ProtectedSandApp.s("䮴"));
            arrayList.add(y(bVar, cVar));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @d5.d
    public List<A> f(@d5.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.a0 a0Var, @d5.d a.g gVar) {
        l0.p(a0Var, ProtectedSandApp.s("䮵"));
        l0.p(gVar, ProtectedSandApp.s("䮶"));
        u.a aVar = u.f25075b;
        String string = a0Var.b().getString(gVar.F());
        String c6 = ((a0.a) a0Var).e().c();
        l0.o(c6, ProtectedSandApp.s("䮷"));
        return n(this, a0Var, aVar.a(string, kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.b.b(c6)), false, false, null, false, 60, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @d5.d
    public List<A> g(@d5.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.a0 a0Var, @d5.d a.n nVar) {
        l0.p(a0Var, ProtectedSandApp.s("䮸"));
        l0.p(nVar, ProtectedSandApp.s("䮹"));
        return x(a0Var, nVar, EnumC0295b.BACKING_FIELD);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @d5.d
    public List<A> h(@d5.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.a0 a0Var, @d5.d kotlin.reflect.jvm.internal.impl.protobuf.o oVar, @d5.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.b bVar) {
        l0.p(a0Var, ProtectedSandApp.s("䮺"));
        l0.p(oVar, ProtectedSandApp.s("䮻"));
        l0.p(bVar, ProtectedSandApp.s("䮼"));
        u s5 = s(this, oVar, a0Var.b(), a0Var.d(), bVar, false, 16, null);
        return s5 != null ? n(this, a0Var, u.f25075b.e(s5, 0), false, false, null, false, 60, null) : EmptyList.f23167o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @d5.d
    public List<A> i(@d5.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.a0 a0Var, @d5.d a.n nVar) {
        l0.p(a0Var, ProtectedSandApp.s("䮽"));
        l0.p(nVar, ProtectedSandApp.s("䮾"));
        return x(a0Var, nVar, EnumC0295b.DELEGATE_FIELD);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @d5.d
    public List<A> j(@d5.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.a0 a0Var, @d5.d kotlin.reflect.jvm.internal.impl.protobuf.o oVar, @d5.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.b bVar) {
        l0.p(a0Var, ProtectedSandApp.s("䮿"));
        l0.p(oVar, ProtectedSandApp.s("䯀"));
        l0.p(bVar, ProtectedSandApp.s("䯁"));
        if (bVar == kotlin.reflect.jvm.internal.impl.serialization.deserialization.b.PROPERTY) {
            return x(a0Var, (a.n) oVar, EnumC0295b.PROPERTY);
        }
        u s5 = s(this, oVar, a0Var.b(), a0Var.d(), bVar, false, 16, null);
        return s5 == null ? EmptyList.f23167o : n(this, a0Var, s5, false, false, null, false, 60, null);
    }

    @d5.e
    protected final r o(@d5.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.a0 a0Var, @d5.e r rVar) {
        l0.p(a0Var, ProtectedSandApp.s("䯂"));
        if (rVar != null) {
            return rVar;
        }
        if (a0Var instanceof a0.a) {
            return z((a0.a) a0Var);
        }
        return null;
    }

    @d5.d
    protected abstract S p(@d5.d r rVar);

    @d5.e
    protected byte[] q(@d5.d r rVar) {
        l0.p(rVar, ProtectedSandApp.s("䯃"));
        return null;
    }

    @d5.e
    protected final u r(@d5.d kotlin.reflect.jvm.internal.impl.protobuf.o oVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, @d5.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.b bVar, boolean z5) {
        l0.p(oVar, ProtectedSandApp.s("䯄"));
        l0.p(cVar, ProtectedSandApp.s("䯅"));
        l0.p(gVar, ProtectedSandApp.s("䯆"));
        l0.p(bVar, ProtectedSandApp.s("䯇"));
        if (oVar instanceof a.d) {
            u.a aVar = u.f25075b;
            d.b b6 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.f25577a.b((a.d) oVar, cVar, gVar);
            if (b6 == null) {
                return null;
            }
            return aVar.b(b6);
        }
        if (oVar instanceof a.i) {
            u.a aVar2 = u.f25075b;
            d.b e6 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.f25577a.e((a.i) oVar, cVar, gVar);
            if (e6 == null) {
                return null;
            }
            return aVar2.b(e6);
        }
        if (!(oVar instanceof a.n)) {
            return null;
        }
        h.g<a.n, a.d> gVar2 = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.f25472d;
        l0.o(gVar2, ProtectedSandApp.s("䯈"));
        a.d dVar = (a.d) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a((h.d) oVar, gVar2);
        if (dVar == null) {
            return null;
        }
        int i5 = c.f24952a[bVar.ordinal()];
        if (i5 == 1) {
            if (!dVar.H()) {
                return null;
            }
            u.a aVar3 = u.f25075b;
            a.c C = dVar.C();
            l0.o(C, ProtectedSandApp.s("䯊"));
            return aVar3.c(cVar, C);
        }
        if (i5 != 2) {
            if (i5 != 3) {
                return null;
            }
            return kotlin.reflect.jvm.internal.impl.load.kotlin.c.a((a.n) oVar, cVar, gVar, true, true, z5);
        }
        if (!dVar.I()) {
            return null;
        }
        u.a aVar4 = u.f25075b;
        a.c D = dVar.D();
        l0.o(D, ProtectedSandApp.s("䯉"));
        return aVar4.c(cVar, D);
    }

    @d5.e
    protected final r t(@d5.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.a0 a0Var, boolean z5, boolean z6, @d5.e Boolean bool, boolean z7) {
        a0.a h5;
        String h22;
        l0.p(a0Var, ProtectedSandApp.s("䯋"));
        if (z5) {
            if (bool == null) {
                throw new IllegalStateException((ProtectedSandApp.s("䯐") + a0Var + ')').toString());
            }
            if (a0Var instanceof a0.a) {
                a0.a aVar = (a0.a) a0Var;
                if (aVar.g() == a.c.EnumC0315c.INTERFACE) {
                    p pVar = this.f24951a;
                    kotlin.reflect.jvm.internal.impl.name.b d6 = aVar.e().d(kotlin.reflect.jvm.internal.impl.name.f.p(ProtectedSandApp.s("䯌")));
                    l0.o(d6, ProtectedSandApp.s("䯍"));
                    return q.b(pVar, d6);
                }
            }
            if (bool.booleanValue() && (a0Var instanceof a0.b)) {
                a1 c6 = a0Var.c();
                l lVar = c6 instanceof l ? (l) c6 : null;
                kotlin.reflect.jvm.internal.impl.resolve.jvm.d f6 = lVar != null ? lVar.f() : null;
                if (f6 != null) {
                    p pVar2 = this.f24951a;
                    String f7 = f6.f();
                    l0.o(f7, ProtectedSandApp.s("䯎"));
                    h22 = e0.h2(f7, org.apache.commons.io.n.f32060b, org.apache.commons.io.k.f32026a, false, 4, null);
                    kotlin.reflect.jvm.internal.impl.name.b m5 = kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(h22));
                    l0.o(m5, ProtectedSandApp.s("䯏"));
                    return q.b(pVar2, m5);
                }
            }
        }
        if (z6 && (a0Var instanceof a0.a)) {
            a0.a aVar2 = (a0.a) a0Var;
            if (aVar2.g() == a.c.EnumC0315c.COMPANION_OBJECT && (h5 = aVar2.h()) != null && (h5.g() == a.c.EnumC0315c.CLASS || h5.g() == a.c.EnumC0315c.ENUM_CLASS || (z7 && (h5.g() == a.c.EnumC0315c.INTERFACE || h5.g() == a.c.EnumC0315c.ANNOTATION_CLASS)))) {
                return z(h5);
            }
        }
        if (!(a0Var instanceof a0.b) || !(a0Var.c() instanceof l)) {
            return null;
        }
        a1 c7 = a0Var.c();
        l0.n(c7, ProtectedSandApp.s("䯑"));
        l lVar2 = (l) c7;
        r g5 = lVar2.g();
        return g5 == null ? q.b(this.f24951a, lVar2.d()) : g5;
    }

    protected final boolean u(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar) {
        r b6;
        l0.p(bVar, ProtectedSandApp.s("䯒"));
        return bVar.g() != null && l0.g(bVar.j().h(), ProtectedSandApp.s("䯓")) && (b6 = q.b(this.f24951a, bVar)) != null && kotlin.reflect.jvm.internal.impl.a.f23881a.c(b6);
    }

    @d5.e
    protected abstract r.a v(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar, @d5.d a1 a1Var, @d5.d List<A> list);

    @d5.e
    protected final r.a w(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar, @d5.d a1 a1Var, @d5.d List<A> list) {
        l0.p(bVar, ProtectedSandApp.s("䯔"));
        l0.p(a1Var, ProtectedSandApp.s("䯕"));
        l0.p(list, ProtectedSandApp.s("䯖"));
        if (kotlin.reflect.jvm.internal.impl.a.f23881a.b().contains(bVar)) {
            return null;
        }
        return v(bVar, a1Var, list);
    }

    @d5.d
    protected abstract A y(@d5.d a.b bVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar);
}
