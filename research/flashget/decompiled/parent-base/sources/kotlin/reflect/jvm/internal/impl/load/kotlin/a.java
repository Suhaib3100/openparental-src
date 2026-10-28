package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.load.kotlin.t;
import kotlin.reflect.jvm.internal.impl.load.kotlin.w;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.resolve.constants.q;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
/* loaded from: classes7.dex */
public abstract class a<A, C> extends kotlin.reflect.jvm.internal.impl.load.kotlin.b<A, kotlin.reflect.jvm.internal.impl.load.kotlin.d<? extends A, ? extends C>> implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.c<A, C> {

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.g<t, kotlin.reflect.jvm.internal.impl.load.kotlin.d<A, C>> f76811c;

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.a$a, reason: collision with other inner class name */
    static final class C1097a extends n0 implements ld.p<kotlin.reflect.jvm.internal.impl.load.kotlin.d<? extends A, ? extends C>, w, C> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1097a f76812b = new C1097a(2);

        C1097a() {
            super(2);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C invoke(@fg.l kotlin.reflect.jvm.internal.impl.load.kotlin.d<? extends A, ? extends C> dVar, @fg.l w wVar) {
            l0.p(dVar, ProtectedSandApp.s("獐\u0001"));
            l0.p(wVar, ProtectedSandApp.s("獑\u0001"));
            return dVar.b().get(wVar);
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    public static final class b implements t.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a<A, C> f76813a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ HashMap<w, List<A>> f76814b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ t f76815c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ HashMap<w, C> f76816d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ HashMap<w, C> f76817e;

        /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.a$b$a, reason: collision with other inner class name */
        public final class C1098a extends kotlin.reflect.jvm.internal.impl.load.kotlin.a$b.b implements t.e {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ b f76818d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1098a(@fg.l b bVar, w wVar) {
                super(bVar, wVar);
                l0.p(wVar, ProtectedSandApp.s("獕\u0001"));
                this.f76818d = bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.e
            @fg.m
            public t.a b(int i4, @fg.l kotlin.reflect.jvm.internal.impl.name.b bVar, @fg.l a1 a1Var) {
                l0.p(bVar, ProtectedSandApp.s("獖\u0001"));
                l0.p(a1Var, ProtectedSandApp.s("獗\u0001"));
                w e4 = w.f76957b.e(d(), i4);
                List<A> list = this.f76818d.f76814b.get(e4);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f76818d.f76814b.put(e4, list);
                }
                return this.f76818d.f76813a.y(bVar, a1Var, list);
            }
        }

        /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.a$b$b, reason: collision with other inner class name */
        public class C1099b implements t.c {

            /* renamed from: a, reason: collision with root package name */
            @fg.l
            private final w f76819a;

            /* renamed from: b, reason: collision with root package name */
            @fg.l
            private final ArrayList<A> f76820b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f76821c;

            public C1099b(@fg.l b bVar, w wVar) {
                l0.p(wVar, ProtectedSandApp.s("獒\u0001"));
                this.f76821c = bVar;
                this.f76819a = wVar;
                this.f76820b = new ArrayList<>();
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.c
            public void a() {
                if (this.f76820b.isEmpty()) {
                    return;
                }
                this.f76821c.f76814b.put(this.f76819a, this.f76820b);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.c
            @fg.m
            public t.a c(@fg.l kotlin.reflect.jvm.internal.impl.name.b bVar, @fg.l a1 a1Var) {
                l0.p(bVar, ProtectedSandApp.s("獓\u0001"));
                l0.p(a1Var, ProtectedSandApp.s("獔\u0001"));
                return this.f76821c.f76813a.y(bVar, a1Var, this.f76820b);
            }

            @fg.l
            protected final w d() {
                return this.f76819a;
            }
        }

        b(a<A, C> aVar, HashMap<w, List<A>> hashMap, t tVar, HashMap<w, C> hashMap2, HashMap<w, C> hashMap3) {
            this.f76813a = aVar;
            this.f76814b = hashMap;
            this.f76815c = tVar;
            this.f76816d = hashMap2;
            this.f76817e = hashMap3;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.d
        @fg.m
        public t.c a(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l String str, @fg.m Object obj) {
            C F;
            l0.p(fVar, ProtectedSandApp.s("獘\u0001"));
            l0.p(str, ProtectedSandApp.s("獙\u0001"));
            w.a aVar = w.f76957b;
            String b5 = fVar.b();
            l0.o(b5, ProtectedSandApp.s("獚\u0001"));
            w a5 = aVar.a(b5, str);
            if (obj != null && (F = this.f76813a.F(str, obj)) != null) {
                this.f76817e.put(a5, F);
            }
            return new C1099b(this, a5);
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.d
        @fg.m
        public t.e b(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l String str) {
            l0.p(fVar, ProtectedSandApp.s("獘\u0001"));
            l0.p(str, ProtectedSandApp.s("獙\u0001"));
            w.a aVar = w.f76957b;
            String b5 = fVar.b();
            l0.o(b5, ProtectedSandApp.s("獚\u0001"));
            return new C1098a(this, aVar.d(b5, str));
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    static final class c extends n0 implements ld.p<kotlin.reflect.jvm.internal.impl.load.kotlin.d<? extends A, ? extends C>, w, C> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f76822b = new c(2);

        c() {
            super(2);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C invoke(@fg.l kotlin.reflect.jvm.internal.impl.load.kotlin.d<? extends A, ? extends C> dVar, @fg.l w wVar) {
            l0.p(dVar, ProtectedSandApp.s("獛\u0001"));
            l0.p(wVar, ProtectedSandApp.s("獜\u0001"));
            return dVar.c().get(wVar);
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    static final class d extends n0 implements ld.l<t, kotlin.reflect.jvm.internal.impl.load.kotlin.d<? extends A, ? extends C>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a<A, C> f76823b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(a<A, C> aVar) {
            super(1);
            this.f76823b = aVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.load.kotlin.d<A, C> invoke(@fg.l t tVar) {
            l0.p(tVar, ProtectedSandApp.s("獝\u0001"));
            return this.f76823b.E(tVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@fg.l kotlin.reflect.jvm.internal.impl.storage.n nVar, @fg.l r rVar) {
        super(rVar);
        l0.p(nVar, ProtectedSandApp.s("玄\u0001"));
        l0.p(rVar, ProtectedSandApp.s("玅\u0001"));
        this.f76811c = nVar.e(new d(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.load.kotlin.d<A, C> E(t tVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        tVar.n(new b(this, hashMap, tVar, hashMap3, hashMap2), q(tVar));
        return new kotlin.reflect.jvm.internal.impl.load.kotlin.d<>(hashMap, hashMap2, hashMap3);
    }

    private final C G(kotlin.reflect.jvm.internal.impl.serialization.deserialization.b0 b0Var, a.n nVar, kotlin.reflect.jvm.internal.impl.serialization.deserialization.b bVar, h0 h0Var, ld.p<? super kotlin.reflect.jvm.internal.impl.load.kotlin.d<? extends A, ? extends C>, ? super w, ? extends C> pVar) {
        C invoke;
        t o4 = o(b0Var, kotlin.reflect.jvm.internal.impl.load.kotlin.b.f76826b.a(b0Var, true, true, kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.B.d(nVar.b0()), kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.f(nVar), u(), t()));
        if (o4 == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e d5 = o4.o().d();
        j.f76914b.getClass();
        w r4 = r(nVar, b0Var.b(), b0Var.d(), bVar, d5.d(j.f76919g));
        if (r4 == null || (invoke = pVar.invoke(this.f76811c.invoke(o4), r4)) == null) {
            return null;
        }
        return kotlin.reflect.jvm.internal.impl.builtins.p.d(h0Var) ? H(invoke) : invoke;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.b
    @fg.l
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.load.kotlin.d<A, C> p(@fg.l t tVar) {
        l0.p(tVar, ProtectedSandApp.s("玆\u0001"));
        return this.f76811c.invoke(tVar);
    }

    protected final boolean D(@fg.l kotlin.reflect.jvm.internal.impl.name.b bVar, @fg.l Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> map) {
        l0.p(bVar, ProtectedSandApp.s("率\u0001"));
        l0.p(map, ProtectedSandApp.s("玈\u0001"));
        if (!l0.g(bVar, kotlin.reflect.jvm.internal.impl.a.f75657a.a())) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVar = map.get(kotlin.reflect.jvm.internal.impl.name.f.f(ProtectedSandApp.s("玉\u0001")));
        kotlin.reflect.jvm.internal.impl.resolve.constants.q qVar = gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.q ? (kotlin.reflect.jvm.internal.impl.resolve.constants.q) gVar : null;
        if (qVar == null) {
            return false;
        }
        q.b b5 = qVar.b();
        q.b.C1177b c1177b = b5 instanceof q.b.C1177b ? (q.b.C1177b) b5 : null;
        if (c1177b == null) {
            return false;
        }
        return v(c1177b.b());
    }

    @fg.m
    protected abstract C F(@fg.l String str, @fg.l Object obj);

    @fg.m
    protected abstract C H(@fg.l C c5);

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.c
    @fg.m
    public C f(@fg.l kotlin.reflect.jvm.internal.impl.serialization.deserialization.b0 b0Var, @fg.l a.n nVar, @fg.l h0 h0Var) {
        l0.p(b0Var, ProtectedSandApp.s("玊\u0001"));
        l0.p(nVar, ProtectedSandApp.s("王\u0001"));
        l0.p(h0Var, ProtectedSandApp.s("玌\u0001"));
        return G(b0Var, nVar, kotlin.reflect.jvm.internal.impl.serialization.deserialization.b.PROPERTY_GETTER, h0Var, C1097a.f76812b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.c
    @fg.m
    public C h(@fg.l kotlin.reflect.jvm.internal.impl.serialization.deserialization.b0 b0Var, @fg.l a.n nVar, @fg.l h0 h0Var) {
        l0.p(b0Var, ProtectedSandApp.s("玊\u0001"));
        l0.p(nVar, ProtectedSandApp.s("王\u0001"));
        l0.p(h0Var, ProtectedSandApp.s("玌\u0001"));
        return G(b0Var, nVar, kotlin.reflect.jvm.internal.impl.serialization.deserialization.b.PROPERTY, h0Var, c.f76822b);
    }
}
