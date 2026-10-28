package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.r;
import kotlin.reflect.jvm.internal.impl.metadata.a;

/* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
/* loaded from: classes6.dex */
public final class d extends kotlin.reflect.jvm.internal.impl.load.kotlin.a<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> {

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final h0 f24976c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final k0 f24977d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.e f24978e;

    /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
    /* loaded from: classes5.dex */
    private abstract class a implements r.a {

        /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.d$a$a, reason: collision with other inner class name */
        public static final class C0296a implements r.a {

            /* renamed from: a, reason: collision with root package name */
            private final /* synthetic */ r.a f24980a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ r.a f24981b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f24982c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.f f24983d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> f24984e;

            C0296a(r.a aVar, a aVar2, kotlin.reflect.jvm.internal.impl.name.f fVar, ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> arrayList) {
                this.f24981b = aVar;
                this.f24982c = aVar2;
                this.f24983d = fVar;
                this.f24984e = arrayList;
                this.f24980a = aVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.a
            public void a() {
                Object h5;
                this.f24981b.a();
                a aVar = this.f24982c;
                kotlin.reflect.jvm.internal.impl.name.f fVar = this.f24983d;
                h5 = j0.h5(this.f24984e);
                aVar.h(fVar, new kotlin.reflect.jvm.internal.impl.resolve.constants.a((kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) h5));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.a
            public void b(@d5.e kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar2) {
                l0.p(fVar2, ProtectedSandApp.s("䯤"));
                this.f24980a.b(fVar, fVar2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.a
            public void c(@d5.e kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.e Object obj) {
                this.f24980a.c(fVar, obj);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.a
            public void d(@d5.e kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d kotlin.reflect.jvm.internal.impl.name.b bVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar2) {
                l0.p(bVar, ProtectedSandApp.s("䯥"));
                l0.p(fVar2, ProtectedSandApp.s("䯦"));
                this.f24980a.d(fVar, bVar, fVar2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.a
            @d5.e
            public r.a e(@d5.e kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d kotlin.reflect.jvm.internal.impl.name.b bVar) {
                l0.p(bVar, ProtectedSandApp.s("䯧"));
                return this.f24980a.e(fVar, bVar);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.a
            @d5.e
            public r.b f(@d5.e kotlin.reflect.jvm.internal.impl.name.f fVar) {
                return this.f24980a.f(fVar);
            }
        }

        /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
        public static final class b implements r.b {

            /* renamed from: a, reason: collision with root package name */
            @d5.d
            private final ArrayList<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> f24985a = new ArrayList<>();

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f24986b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.f f24987c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f24988d;

            /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
            /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.d$a$b$a, reason: collision with other inner class name */
            public static final class C0297a implements r.a {

                /* renamed from: a, reason: collision with root package name */
                private final /* synthetic */ r.a f24989a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ r.a f24990b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ b f24991c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> f24992d;

                C0297a(r.a aVar, b bVar, ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> arrayList) {
                    this.f24990b = aVar;
                    this.f24991c = bVar;
                    this.f24992d = arrayList;
                    this.f24989a = aVar;
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.a
                public void a() {
                    Object h5;
                    this.f24990b.a();
                    ArrayList arrayList = this.f24991c.f24985a;
                    h5 = j0.h5(this.f24992d);
                    arrayList.add(new kotlin.reflect.jvm.internal.impl.resolve.constants.a((kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) h5));
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.a
                public void b(@d5.e kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar2) {
                    l0.p(fVar2, ProtectedSandApp.s("䯨"));
                    this.f24989a.b(fVar, fVar2);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.a
                public void c(@d5.e kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.e Object obj) {
                    this.f24989a.c(fVar, obj);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.a
                public void d(@d5.e kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d kotlin.reflect.jvm.internal.impl.name.b bVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar2) {
                    l0.p(bVar, ProtectedSandApp.s("䯩"));
                    l0.p(fVar2, ProtectedSandApp.s("䯪"));
                    this.f24989a.d(fVar, bVar, fVar2);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.a
                @d5.e
                public r.a e(@d5.e kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d kotlin.reflect.jvm.internal.impl.name.b bVar) {
                    l0.p(bVar, ProtectedSandApp.s("䯫"));
                    return this.f24989a.e(fVar, bVar);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.a
                @d5.e
                public r.b f(@d5.e kotlin.reflect.jvm.internal.impl.name.f fVar) {
                    return this.f24989a.f(fVar);
                }
            }

            b(d dVar, kotlin.reflect.jvm.internal.impl.name.f fVar, a aVar) {
                this.f24986b = dVar;
                this.f24987c = fVar;
                this.f24988d = aVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.b
            public void a() {
                this.f24988d.g(this.f24987c, this.f24985a);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.b
            public void b(@d5.e Object obj) {
                this.f24985a.add(this.f24986b.I(this.f24987c, obj));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.b
            public void c(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
                l0.p(bVar, ProtectedSandApp.s("䯬"));
                l0.p(fVar, ProtectedSandApp.s("䯭"));
                this.f24985a.add(new kotlin.reflect.jvm.internal.impl.resolve.constants.j(bVar, fVar));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.b
            @d5.e
            public r.a d(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar) {
                l0.p(bVar, ProtectedSandApp.s("䯮"));
                ArrayList arrayList = new ArrayList();
                d dVar = this.f24986b;
                a1 a1Var = a1.f24103a;
                l0.o(a1Var, ProtectedSandApp.s("䯯"));
                r.a v5 = dVar.v(bVar, a1Var, arrayList);
                l0.m(v5);
                return new C0297a(v5, this, arrayList);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.b
            public void e(@d5.d kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar) {
                l0.p(fVar, ProtectedSandApp.s("䯰"));
                this.f24985a.add(new kotlin.reflect.jvm.internal.impl.resolve.constants.q(fVar));
            }
        }

        public a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.a
        public void b(@d5.e kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar2) {
            l0.p(fVar2, ProtectedSandApp.s("䯱"));
            h(fVar, new kotlin.reflect.jvm.internal.impl.resolve.constants.q(fVar2));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.a
        public void c(@d5.e kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.e Object obj) {
            h(fVar, d.this.I(fVar, obj));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.a
        public void d(@d5.e kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d kotlin.reflect.jvm.internal.impl.name.b bVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar2) {
            l0.p(bVar, ProtectedSandApp.s("䯲"));
            l0.p(fVar2, ProtectedSandApp.s("䯳"));
            h(fVar, new kotlin.reflect.jvm.internal.impl.resolve.constants.j(bVar, fVar2));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.a
        @d5.e
        public r.a e(@d5.e kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d kotlin.reflect.jvm.internal.impl.name.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("䯴"));
            ArrayList arrayList = new ArrayList();
            d dVar = d.this;
            a1 a1Var = a1.f24103a;
            l0.o(a1Var, ProtectedSandApp.s("䯵"));
            r.a v5 = dVar.v(bVar, a1Var, arrayList);
            l0.m(v5);
            return new C0296a(v5, this, fVar, arrayList);
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.a
        @d5.e
        public r.b f(@d5.e kotlin.reflect.jvm.internal.impl.name.f fVar) {
            return new b(d.this, fVar, this);
        }

        public abstract void g(@d5.e kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d ArrayList<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> arrayList);

        public abstract void h(@d5.e kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVar);
    }

    /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
    public static final class b extends a {

        /* renamed from: b, reason: collision with root package name */
        @d5.d
        private final HashMap<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> f24993b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.e f24995d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.b f24996e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> f24997f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ a1 f24998g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, kotlin.reflect.jvm.internal.impl.name.b bVar, List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> list, a1 a1Var) {
            super();
            this.f24995d = eVar;
            this.f24996e = bVar;
            this.f24997f = list;
            this.f24998g = a1Var;
            this.f24993b = new HashMap<>();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.a
        public void a() {
            if (d.this.C(this.f24996e, this.f24993b) || d.this.u(this.f24996e)) {
                return;
            }
            this.f24997f.add(new kotlin.reflect.jvm.internal.impl.descriptors.annotations.d(this.f24995d.E(), this.f24993b, this.f24998g));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.d.a
        public void g(@d5.e kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d ArrayList<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> arrayList) {
            l0.p(arrayList, ProtectedSandApp.s("藚"));
            if (fVar == null) {
                return;
            }
            j1 b6 = kotlin.reflect.jvm.internal.impl.load.java.components.a.b(fVar, this.f24995d);
            if (b6 != null) {
                HashMap<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> hashMap = this.f24993b;
                kotlin.reflect.jvm.internal.impl.resolve.constants.h hVar = kotlin.reflect.jvm.internal.impl.resolve.constants.h.f25899a;
                List<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> c6 = kotlin.reflect.jvm.internal.impl.utils.a.c(arrayList);
                kotlin.reflect.jvm.internal.impl.types.h0 type = b6.getType();
                l0.o(type, ProtectedSandApp.s("藛"));
                hashMap.put(fVar, hVar.b(c6, type));
                return;
            }
            if (d.this.u(this.f24996e) && l0.g(fVar.h(), ProtectedSandApp.s("藜"))) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (obj instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.a) {
                        arrayList2.add(obj);
                    }
                }
                List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> list = this.f24997f;
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    list.add(((kotlin.reflect.jvm.internal.impl.resolve.constants.a) it.next()).b());
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.d.a
        public void h(@d5.e kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVar) {
            l0.p(gVar, ProtectedSandApp.s("藝"));
            if (fVar != null) {
                this.f24993b.put(fVar, gVar);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@d5.d h0 h0Var, @d5.d k0 k0Var, @d5.d kotlin.reflect.jvm.internal.impl.storage.n nVar, @d5.d p pVar) {
        super(nVar, pVar);
        l0.p(h0Var, ProtectedSandApp.s("藞"));
        l0.p(k0Var, ProtectedSandApp.s("藟"));
        l0.p(nVar, ProtectedSandApp.s("藠"));
        l0.p(pVar, ProtectedSandApp.s("藡"));
        this.f24976c = h0Var;
        this.f24977d = k0Var;
        this.f24978e = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.e(h0Var, k0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> I(kotlin.reflect.jvm.internal.impl.name.f fVar, Object obj) {
        kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> c6 = kotlin.reflect.jvm.internal.impl.resolve.constants.h.f25899a.c(obj);
        if (c6 != null) {
            return c6;
        }
        return kotlin.reflect.jvm.internal.impl.resolve.constants.k.f25904b.a(ProtectedSandApp.s("藢") + fVar);
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.e L(kotlin.reflect.jvm.internal.impl.name.b bVar) {
        return kotlin.reflect.jvm.internal.impl.descriptors.y.c(this.f24976c, bVar, this.f24977d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.a
    @d5.e
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> E(@d5.d String str, @d5.d Object obj) {
        boolean T2;
        l0.p(str, ProtectedSandApp.s("藣"));
        l0.p(obj, ProtectedSandApp.s("藤"));
        T2 = kotlin.text.h0.T2(ProtectedSandApp.s("藥"), str, false, 2, null);
        if (T2) {
            int intValue = ((Integer) obj).intValue();
            int hashCode = str.hashCode();
            if (hashCode == 66) {
                if (str.equals(ProtectedSandApp.s("藩"))) {
                    obj = Byte.valueOf((byte) intValue);
                }
                throw new AssertionError(str);
            }
            if (hashCode == 67) {
                if (str.equals(ProtectedSandApp.s("藨"))) {
                    obj = Character.valueOf((char) intValue);
                }
                throw new AssertionError(str);
            }
            if (hashCode == 83) {
                if (str.equals(ProtectedSandApp.s("藧"))) {
                    obj = Short.valueOf((short) intValue);
                }
                throw new AssertionError(str);
            }
            if (hashCode == 90 && str.equals(ProtectedSandApp.s("藦"))) {
                obj = Boolean.valueOf(intValue != 0);
            }
            throw new AssertionError(str);
        }
        return kotlin.reflect.jvm.internal.impl.resolve.constants.h.f25899a.c(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.b
    @d5.d
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.c y(@d5.d a.b bVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar) {
        l0.p(bVar, ProtectedSandApp.s("藪"));
        l0.p(cVar, ProtectedSandApp.s("藫"));
        return this.f24978e.a(bVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.a
    @d5.e
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> G(@d5.d kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVar) {
        kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> yVar;
        l0.p(gVar, ProtectedSandApp.s("藬"));
        if (gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.d) {
            yVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.w(((kotlin.reflect.jvm.internal.impl.resolve.constants.d) gVar).b().byteValue());
        } else if (gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.u) {
            yVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.z(((kotlin.reflect.jvm.internal.impl.resolve.constants.u) gVar).b().shortValue());
        } else if (gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.m) {
            yVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.x(((kotlin.reflect.jvm.internal.impl.resolve.constants.m) gVar).b().intValue());
        } else {
            if (!(gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.r)) {
                return gVar;
            }
            yVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.y(((kotlin.reflect.jvm.internal.impl.resolve.constants.r) gVar).b().longValue());
        }
        return yVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.b
    @d5.e
    protected r.a v(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar, @d5.d a1 a1Var, @d5.d List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> list) {
        l0.p(bVar, ProtectedSandApp.s("藭"));
        l0.p(a1Var, ProtectedSandApp.s("藮"));
        l0.p(list, ProtectedSandApp.s("藯"));
        return new b(L(bVar), bVar, list, a1Var);
    }
}
