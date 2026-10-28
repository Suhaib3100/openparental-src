package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.t;
import kotlin.reflect.jvm.internal.impl.metadata.a;

/* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
/* loaded from: classes7.dex */
public final class e extends kotlin.reflect.jvm.internal.impl.load.kotlin.a<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> {

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final h0 f76856d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private final k0 f76857e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.e f76858f;

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e f76859g;

    /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
    private abstract class a implements t.a {

        /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.e$a$a, reason: collision with other inner class name */
        public static final class C1101a implements t.a {

            /* renamed from: a, reason: collision with root package name */
            private final /* synthetic */ t.a f76861a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ t.a f76862b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f76863c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.f f76864d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> f76865e;

            C1101a(t.a aVar, a aVar2, kotlin.reflect.jvm.internal.impl.name.f fVar, ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> arrayList) {
                this.f76862b = aVar;
                this.f76863c = aVar2;
                this.f76864d = fVar;
                this.f76865e = arrayList;
                this.f76861a = aVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.a
            public void a() {
                this.f76862b.a();
                this.f76863c.h(this.f76864d, new kotlin.reflect.jvm.internal.impl.resolve.constants.a((kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) kotlin.collections.w.h5(this.f76865e)));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.a
            public void b(@fg.m kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l kotlin.reflect.jvm.internal.impl.name.b bVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar2) {
                l0.p(bVar, ProtectedSandApp.s("玩\u0001"));
                l0.p(fVar2, ProtectedSandApp.s("玪\u0001"));
                this.f76861a.b(fVar, bVar, fVar2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.a
            @fg.m
            public t.a c(@fg.m kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l kotlin.reflect.jvm.internal.impl.name.b bVar) {
                l0.p(bVar, ProtectedSandApp.s("玫\u0001"));
                return this.f76861a.c(fVar, bVar);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.a
            public void d(@fg.m kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar2) {
                l0.p(fVar2, ProtectedSandApp.s("玬\u0001"));
                this.f76861a.d(fVar, fVar2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.a
            public void e(@fg.m kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.m Object obj) {
                this.f76861a.e(fVar, obj);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.a
            @fg.m
            public t.b f(@fg.m kotlin.reflect.jvm.internal.impl.name.f fVar) {
                return this.f76861a.f(fVar);
            }
        }

        /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
        public static final class b implements t.b {

            /* renamed from: a, reason: collision with root package name */
            @fg.l
            private final ArrayList<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> f76866a = new ArrayList<>();

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f76867b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.f f76868c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f76869d;

            /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
            /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.e$a$b$a, reason: collision with other inner class name */
            public static final class C1102a implements t.a {

                /* renamed from: a, reason: collision with root package name */
                private final /* synthetic */ t.a f76870a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ t.a f76871b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ b f76872c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> f76873d;

                C1102a(t.a aVar, b bVar, ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> arrayList) {
                    this.f76871b = aVar;
                    this.f76872c = bVar;
                    this.f76873d = arrayList;
                    this.f76870a = aVar;
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.a
                public void a() {
                    this.f76871b.a();
                    this.f76872c.f76866a.add(new kotlin.reflect.jvm.internal.impl.resolve.constants.a((kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) kotlin.collections.w.h5(this.f76873d)));
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.a
                public void b(@fg.m kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l kotlin.reflect.jvm.internal.impl.name.b bVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar2) {
                    l0.p(bVar, ProtectedSandApp.s("玭\u0001"));
                    l0.p(fVar2, ProtectedSandApp.s("玮\u0001"));
                    this.f76870a.b(fVar, bVar, fVar2);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.a
                @fg.m
                public t.a c(@fg.m kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l kotlin.reflect.jvm.internal.impl.name.b bVar) {
                    l0.p(bVar, ProtectedSandApp.s("环\u0001"));
                    return this.f76870a.c(fVar, bVar);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.a
                public void d(@fg.m kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar2) {
                    l0.p(fVar2, ProtectedSandApp.s("现\u0001"));
                    this.f76870a.d(fVar, fVar2);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.a
                public void e(@fg.m kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.m Object obj) {
                    this.f76870a.e(fVar, obj);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.a
                @fg.m
                public t.b f(@fg.m kotlin.reflect.jvm.internal.impl.name.f fVar) {
                    return this.f76870a.f(fVar);
                }
            }

            b(e eVar, kotlin.reflect.jvm.internal.impl.name.f fVar, a aVar) {
                this.f76867b = eVar;
                this.f76868c = fVar;
                this.f76869d = aVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.b
            public void a() {
                this.f76869d.g(this.f76868c, this.f76866a);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.b
            @fg.m
            public t.a b(@fg.l kotlin.reflect.jvm.internal.impl.name.b bVar) {
                l0.p(bVar, ProtectedSandApp.s("玱\u0001"));
                ArrayList arrayList = new ArrayList();
                e eVar = this.f76867b;
                a1 a1Var = a1.f75900a;
                l0.o(a1Var, ProtectedSandApp.s("玲\u0001"));
                t.a x4 = eVar.x(bVar, a1Var, arrayList);
                l0.m(x4);
                return new C1102a(x4, this, arrayList);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.b
            public void c(@fg.m Object obj) {
                this.f76866a.add(this.f76867b.J(this.f76868c, obj));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.b
            public void d(@fg.l kotlin.reflect.jvm.internal.impl.name.b bVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
                l0.p(bVar, ProtectedSandApp.s("玳\u0001"));
                l0.p(fVar, ProtectedSandApp.s("玴\u0001"));
                this.f76866a.add(new kotlin.reflect.jvm.internal.impl.resolve.constants.j(bVar, fVar));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.b
            public void e(@fg.l kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar) {
                l0.p(fVar, ProtectedSandApp.s("玵\u0001"));
                this.f76866a.add(new kotlin.reflect.jvm.internal.impl.resolve.constants.q(fVar));
            }
        }

        public a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.a
        public void b(@fg.m kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l kotlin.reflect.jvm.internal.impl.name.b bVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar2) {
            l0.p(bVar, ProtectedSandApp.s("玶\u0001"));
            l0.p(fVar2, ProtectedSandApp.s("玷\u0001"));
            h(fVar, new kotlin.reflect.jvm.internal.impl.resolve.constants.j(bVar, fVar2));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.a
        @fg.m
        public t.a c(@fg.m kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l kotlin.reflect.jvm.internal.impl.name.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("玸\u0001"));
            ArrayList arrayList = new ArrayList();
            e eVar = e.this;
            a1 a1Var = a1.f75900a;
            l0.o(a1Var, ProtectedSandApp.s("玹\u0001"));
            t.a x4 = eVar.x(bVar, a1Var, arrayList);
            l0.m(x4);
            return new C1101a(x4, this, fVar, arrayList);
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.a
        public void d(@fg.m kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar2) {
            l0.p(fVar2, ProtectedSandApp.s("玺\u0001"));
            h(fVar, new kotlin.reflect.jvm.internal.impl.resolve.constants.q(fVar2));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.a
        public void e(@fg.m kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.m Object obj) {
            h(fVar, e.this.J(fVar, obj));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.a
        @fg.m
        public t.b f(@fg.m kotlin.reflect.jvm.internal.impl.name.f fVar) {
            return new b(e.this, fVar, this);
        }

        public abstract void g(@fg.m kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ArrayList<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> arrayList);

        public abstract void h(@fg.m kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVar);
    }

    /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
    @r1({"SMAP\nBinaryClassAnnotationAndConstantLoaderImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinaryClassAnnotationAndConstantLoaderImpl.kt\norg/jetbrains/kotlin/load/kotlin/BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,245:1\n800#2,11:246\n1620#2,3:257\n*S KotlinDebug\n*F\n+ 1 BinaryClassAnnotationAndConstantLoaderImpl.kt\norg/jetbrains/kotlin/load/kotlin/BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1\n*L\n93#1:246,11\n93#1:257,3\n*E\n"})
    public static final class b extends a {

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        private final HashMap<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> f76874b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.e f76876d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.b f76877e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> f76878f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ a1 f76879g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, kotlin.reflect.jvm.internal.impl.name.b bVar, List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> list, a1 a1Var) {
            super();
            this.f76876d = eVar;
            this.f76877e = bVar;
            this.f76878f = list;
            this.f76879g = a1Var;
            this.f76874b = new HashMap<>();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.a
        public void a() {
            if (e.this.D(this.f76877e, this.f76874b) || e.this.v(this.f76877e)) {
                return;
            }
            this.f76878f.add(new kotlin.reflect.jvm.internal.impl.descriptors.annotations.d(this.f76876d.r(), this.f76874b, this.f76879g));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.e.a
        public void g(@fg.m kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ArrayList<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> arrayList) {
            l0.p(arrayList, ProtectedSandApp.s("玻\u0001"));
            if (fVar == null) {
                return;
            }
            j1 b5 = kotlin.reflect.jvm.internal.impl.load.java.components.a.b(fVar, this.f76876d);
            if (b5 != null) {
                HashMap<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> hashMap = this.f76874b;
                kotlin.reflect.jvm.internal.impl.resolve.constants.h hVar = kotlin.reflect.jvm.internal.impl.resolve.constants.h.f77876a;
                List<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> c5 = kotlin.reflect.jvm.internal.impl.utils.a.c(arrayList);
                kotlin.reflect.jvm.internal.impl.types.h0 type = b5.getType();
                l0.o(type, ProtectedSandApp.s("玼\u0001"));
                hashMap.put(fVar, hVar.b(c5, type));
                return;
            }
            if (e.this.v(this.f76877e) && l0.g(fVar.b(), ProtectedSandApp.s("玽\u0001"))) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (obj instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.a) {
                        arrayList2.add(obj);
                    }
                }
                List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> list = this.f76878f;
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    list.add(((kotlin.reflect.jvm.internal.impl.resolve.constants.a) it.next()).b());
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.e.a
        public void h(@fg.m kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVar) {
            l0.p(gVar, ProtectedSandApp.s("玽\u0001"));
            if (fVar != null) {
                this.f76874b.put(fVar, gVar);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@fg.l h0 h0Var, @fg.l k0 k0Var, @fg.l kotlin.reflect.jvm.internal.impl.storage.n nVar, @fg.l r rVar) {
        super(nVar, rVar);
        l0.p(h0Var, ProtectedSandApp.s("珅\u0001"));
        l0.p(k0Var, ProtectedSandApp.s("珆\u0001"));
        l0.p(nVar, ProtectedSandApp.s("珇\u0001"));
        l0.p(rVar, ProtectedSandApp.s("珈\u0001"));
        this.f76856d = h0Var;
        this.f76857e = k0Var;
        this.f76858f = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.e(h0Var, k0Var);
        this.f76859g = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e.f77546i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> J(kotlin.reflect.jvm.internal.impl.name.f fVar, Object obj) {
        kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> c5 = kotlin.reflect.jvm.internal.impl.resolve.constants.h.f77876a.c(obj, this.f76856d);
        if (c5 != null) {
            return c5;
        }
        return kotlin.reflect.jvm.internal.impl.resolve.constants.k.f77880b.a(ProtectedSandApp.s("珉\u0001") + fVar);
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.e M(kotlin.reflect.jvm.internal.impl.name.b bVar) {
        return kotlin.reflect.jvm.internal.impl.descriptors.y.c(this.f76856d, bVar, this.f76857e);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.b
    @fg.l
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.c w(@fg.l a.b bVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar) {
        l0.p(bVar, ProtectedSandApp.s("珊\u0001"));
        l0.p(cVar, ProtectedSandApp.s("珋\u0001"));
        return this.f76858f.a(bVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.a
    @fg.m
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> F(@fg.l String str, @fg.l Object obj) {
        l0.p(str, ProtectedSandApp.s("珌\u0001"));
        l0.p(obj, ProtectedSandApp.s("珍\u0001"));
        if (kotlin.text.v.T2(ProtectedSandApp.s("珎\u0001"), str, false, 2, null)) {
            int intValue = ((Integer) obj).intValue();
            int hashCode = str.hashCode();
            if (hashCode == 66) {
                if (str.equals(ProtectedSandApp.s("珒\u0001"))) {
                    obj = Byte.valueOf((byte) intValue);
                }
                throw new AssertionError(str);
            }
            if (hashCode == 67) {
                if (str.equals(ProtectedSandApp.s("珑\u0001"))) {
                    obj = Character.valueOf((char) intValue);
                }
                throw new AssertionError(str);
            }
            if (hashCode == 83) {
                if (str.equals(ProtectedSandApp.s("珐\u0001"))) {
                    obj = Short.valueOf((short) intValue);
                }
                throw new AssertionError(str);
            }
            if (hashCode == 90 && str.equals(ProtectedSandApp.s("珏\u0001"))) {
                obj = Boolean.valueOf(intValue != 0);
            }
            throw new AssertionError(str);
        }
        return kotlin.reflect.jvm.internal.impl.resolve.constants.h.f77876a.c(obj, this.f76856d);
    }

    public void N(@fg.l kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e eVar) {
        l0.p(eVar, ProtectedSandApp.s("珓\u0001"));
        this.f76859g = eVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.a
    @fg.m
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> H(@fg.l kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVar) {
        kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> zVar;
        l0.p(gVar, ProtectedSandApp.s("珔\u0001"));
        if (gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.d) {
            zVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.x(((kotlin.reflect.jvm.internal.impl.resolve.constants.d) gVar).b().byteValue());
        } else if (gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.u) {
            zVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.a0(((kotlin.reflect.jvm.internal.impl.resolve.constants.u) gVar).b().shortValue());
        } else if (gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.m) {
            zVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.y(((kotlin.reflect.jvm.internal.impl.resolve.constants.m) gVar).b().intValue());
        } else {
            if (!(gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.r)) {
                return gVar;
            }
            zVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.z(((kotlin.reflect.jvm.internal.impl.resolve.constants.r) gVar).b().longValue());
        }
        return zVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.b
    @fg.l
    public kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e t() {
        return this.f76859g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.b
    @fg.m
    protected t.a x(@fg.l kotlin.reflect.jvm.internal.impl.name.b bVar, @fg.l a1 a1Var, @fg.l List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> list) {
        l0.p(bVar, ProtectedSandApp.s("珕\u0001"));
        l0.p(a1Var, ProtectedSandApp.s("珖\u0001"));
        l0.p(list, ProtectedSandApp.s("珗\u0001"));
        return new b(M(bVar), bVar, list, a1Var);
    }
}
