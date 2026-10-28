package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.load.kotlin.b;
import kotlin.reflect.jvm.internal.impl.load.kotlin.r;
import kotlin.reflect.jvm.internal.impl.load.kotlin.u;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.resolve.constants.q;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
/* loaded from: classes6.dex */
public abstract class a<A, C> extends kotlin.reflect.jvm.internal.impl.load.kotlin.b<A, C0293a<? extends A, ? extends C>> implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.c<A, C> {

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.g<r, C0293a<A, C>> f24934b;

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0293a<A, C> extends b.a<A> {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        private final Map<u, List<A>> f24935a;

        /* renamed from: b, reason: collision with root package name */
        @d5.d
        private final Map<u, C> f24936b;

        /* renamed from: c, reason: collision with root package name */
        @d5.d
        private final Map<u, C> f24937c;

        /* JADX WARN: Multi-variable type inference failed */
        public C0293a(@d5.d Map<u, ? extends List<? extends A>> map, @d5.d Map<u, ? extends C> map2, @d5.d Map<u, ? extends C> map3) {
            l0.p(map, ProtectedSandApp.s("䮆"));
            l0.p(map2, ProtectedSandApp.s("䮇"));
            l0.p(map3, ProtectedSandApp.s("䮈"));
            this.f24935a = map;
            this.f24936b = map2;
            this.f24937c = map3;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.b.a
        @d5.d
        public Map<u, List<A>> a() {
            return this.f24935a;
        }

        @d5.d
        public final Map<u, C> b() {
            return this.f24937c;
        }

        @d5.d
        public final Map<u, C> c() {
            return this.f24936b;
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    static final class b extends Lambda implements q3.p<C0293a<? extends A, ? extends C>, u, C> {

        /* renamed from: p, reason: collision with root package name */
        public static final b f24938p = new b();

        b() {
            super(2);
        }

        @Override // q3.p
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C g0(@d5.d C0293a<? extends A, ? extends C> c0293a, @d5.d u uVar) {
            l0.p(c0293a, ProtectedSandApp.s("藆"));
            l0.p(uVar, ProtectedSandApp.s("藇"));
            return c0293a.b().get(uVar);
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* loaded from: classes5.dex */
    public static final class c implements r.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a<A, C> f24939a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ HashMap<u, List<A>> f24940b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ r f24941c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ HashMap<u, C> f24942d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ HashMap<u, C> f24943e;

        /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public final class C0294a extends b implements r.e {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ c f24944d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0294a(@d5.d c cVar, u uVar) {
                super(cVar, uVar);
                l0.p(uVar, ProtectedSandApp.s("藈"));
                this.f24944d = cVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.e
            @d5.e
            public r.a c(int i5, @d5.d kotlin.reflect.jvm.internal.impl.name.b bVar, @d5.d a1 a1Var) {
                l0.p(bVar, ProtectedSandApp.s("藉"));
                l0.p(a1Var, ProtectedSandApp.s("藊"));
                u e6 = u.f25075b.e(d(), i5);
                List<A> list = this.f24944d.f24940b.get(e6);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f24944d.f24940b.put(e6, list);
                }
                return this.f24944d.f24939a.w(bVar, a1Var, list);
            }
        }

        /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
        public class b implements r.c {

            /* renamed from: a, reason: collision with root package name */
            @d5.d
            private final u f24945a;

            /* renamed from: b, reason: collision with root package name */
            @d5.d
            private final ArrayList<A> f24946b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ c f24947c;

            public b(@d5.d c cVar, u uVar) {
                l0.p(uVar, ProtectedSandApp.s("䮉"));
                this.f24947c = cVar;
                this.f24945a = uVar;
                this.f24946b = new ArrayList<>();
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.c
            public void a() {
                if (!this.f24946b.isEmpty()) {
                    this.f24947c.f24940b.put(this.f24945a, this.f24946b);
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.c
            @d5.e
            public r.a b(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar, @d5.d a1 a1Var) {
                l0.p(bVar, ProtectedSandApp.s("䮊"));
                l0.p(a1Var, ProtectedSandApp.s("䮋"));
                return this.f24947c.f24939a.w(bVar, a1Var, this.f24946b);
            }

            @d5.d
            protected final u d() {
                return this.f24945a;
            }
        }

        c(a<A, C> aVar, HashMap<u, List<A>> hashMap, r rVar, HashMap<u, C> hashMap2, HashMap<u, C> hashMap3) {
            this.f24939a = aVar;
            this.f24940b = hashMap;
            this.f24941c = rVar;
            this.f24942d = hashMap2;
            this.f24943e = hashMap3;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.d
        @d5.e
        public r.c a(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d String str, @d5.e Object obj) {
            C E;
            l0.p(fVar, ProtectedSandApp.s("䮌"));
            l0.p(str, ProtectedSandApp.s("䮍"));
            u.a aVar = u.f25075b;
            String h5 = fVar.h();
            l0.o(h5, ProtectedSandApp.s("䮎"));
            u a6 = aVar.a(h5, str);
            if (obj != null && (E = this.f24939a.E(str, obj)) != null) {
                this.f24943e.put(a6, E);
            }
            return new b(this, a6);
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.d
        @d5.e
        public r.e b(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d String str) {
            l0.p(fVar, ProtectedSandApp.s("䮏"));
            l0.p(str, ProtectedSandApp.s("䮐"));
            u.a aVar = u.f25075b;
            String h5 = fVar.h();
            l0.o(h5, ProtectedSandApp.s("䮑"));
            return new C0294a(this, aVar.d(h5, str));
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    static final class d extends Lambda implements q3.p<C0293a<? extends A, ? extends C>, u, C> {

        /* renamed from: p, reason: collision with root package name */
        public static final d f24948p = new d();

        d() {
            super(2);
        }

        @Override // q3.p
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C g0(@d5.d C0293a<? extends A, ? extends C> c0293a, @d5.d u uVar) {
            l0.p(c0293a, ProtectedSandApp.s("藋"));
            l0.p(uVar, ProtectedSandApp.s("藌"));
            return c0293a.c().get(uVar);
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    static final class e extends Lambda implements q3.l<r, C0293a<? extends A, ? extends C>> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ a<A, C> f24949p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(a<A, C> aVar) {
            super(1);
            this.f24949p = aVar;
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0293a<A, C> N(@d5.d r rVar) {
            l0.p(rVar, ProtectedSandApp.s("藍"));
            return this.f24949p.D(rVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@d5.d kotlin.reflect.jvm.internal.impl.storage.n nVar, @d5.d p pVar) {
        super(pVar);
        l0.p(nVar, ProtectedSandApp.s("藎"));
        l0.p(pVar, ProtectedSandApp.s("藏"));
        this.f24934b = nVar.g(new e(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0293a<A, C> D(r rVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        rVar.c(new c(this, hashMap, rVar, hashMap3, hashMap2), q(rVar));
        return new C0293a<>(hashMap, hashMap2, hashMap3);
    }

    private final C F(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a0 a0Var, a.n nVar, kotlin.reflect.jvm.internal.impl.serialization.deserialization.b bVar, h0 h0Var, q3.p<? super C0293a<? extends A, ? extends C>, ? super u, ? extends C> pVar) {
        C g02;
        r o5 = o(a0Var, t(a0Var, true, true, kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.A.d(nVar.b0()), kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.f(nVar)));
        if (o5 == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e d6 = o5.a().d();
        h.f25003b.getClass();
        u r5 = r(nVar, a0Var.b(), a0Var.d(), bVar, d6.d(h.f25008g));
        if (r5 == null || (g02 = pVar.g0(this.f24934b.N(o5), r5)) == null) {
            return null;
        }
        return kotlin.reflect.jvm.internal.impl.builtins.p.d(h0Var) ? G(g02) : g02;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.b
    @d5.d
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public C0293a<A, C> p(@d5.d r rVar) {
        l0.p(rVar, ProtectedSandApp.s("藐"));
        return this.f24934b.N(rVar);
    }

    protected final boolean C(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar, @d5.d Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> map) {
        l0.p(bVar, ProtectedSandApp.s("藑"));
        l0.p(map, ProtectedSandApp.s("藒"));
        if (!l0.g(bVar, kotlin.reflect.jvm.internal.impl.a.f23881a.a())) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVar = map.get(kotlin.reflect.jvm.internal.impl.name.f.p(ProtectedSandApp.s("藓")));
        kotlin.reflect.jvm.internal.impl.resolve.constants.q qVar = gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.q ? (kotlin.reflect.jvm.internal.impl.resolve.constants.q) gVar : null;
        if (qVar == null) {
            return false;
        }
        q.b b6 = qVar.b();
        q.b.C0373b c0373b = b6 instanceof q.b.C0373b ? (q.b.C0373b) b6 : null;
        if (c0373b == null) {
            return false;
        }
        return u(c0373b.b());
    }

    @d5.e
    protected abstract C E(@d5.d String str, @d5.d Object obj);

    @d5.e
    protected abstract C G(@d5.d C c6);

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.c
    @d5.e
    public C e(@d5.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.a0 a0Var, @d5.d a.n nVar, @d5.d h0 h0Var) {
        l0.p(a0Var, ProtectedSandApp.s("藔"));
        l0.p(nVar, ProtectedSandApp.s("藕"));
        l0.p(h0Var, ProtectedSandApp.s("藖"));
        return F(a0Var, nVar, kotlin.reflect.jvm.internal.impl.serialization.deserialization.b.PROPERTY, h0Var, d.f24948p);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.c
    @d5.e
    public C k(@d5.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.a0 a0Var, @d5.d a.n nVar, @d5.d h0 h0Var) {
        l0.p(a0Var, ProtectedSandApp.s("藗"));
        l0.p(nVar, ProtectedSandApp.s("藘"));
        l0.p(h0Var, ProtectedSandApp.s("藙"));
        return F(a0Var, nVar, kotlin.reflect.jvm.internal.impl.serialization.deserialization.b.PROPERTY_GETTER, h0Var, b.f24938p);
    }
}
