package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;

/* compiled from: ScopesHolderForClass.kt */
/* loaded from: classes5.dex */
public final class y0<T extends kotlin.reflect.jvm.internal.impl.resolve.scopes.h> {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final e f24458a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final q3.l<kotlin.reflect.jvm.internal.impl.types.checker.g, T> f24459b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.types.checker.g f24460c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i f24461d;

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f24457f = {kotlin.jvm.internal.l1.u(new kotlin.jvm.internal.g1(kotlin.jvm.internal.l1.d(y0.class), ProtectedSandApp.s("䣖"), ProtectedSandApp.s("䣗")))};

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    public static final a f24456e = new a(null);

    /* compiled from: ScopesHolderForClass.kt */
    public static final class a {
        private a() {
        }

        @d5.d
        public final <T extends kotlin.reflect.jvm.internal.impl.resolve.scopes.h> y0<T> a(@d5.d e eVar, @d5.d kotlin.reflect.jvm.internal.impl.storage.n nVar, @d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.types.checker.g, ? extends T> lVar) {
            kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("䣒"));
            kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("䣓"));
            kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("䣔"));
            kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("䣕"));
            return new y0<>(eVar, nVar, lVar, gVar, null);
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: ScopesHolderForClass.kt */
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.a<T> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ y0<T> f24462p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.checker.g f24463q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(y0<T> y0Var, kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            super(0);
            this.f24462p = y0Var;
            this.f24463q = gVar;
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T n() {
            return (T) ((y0) this.f24462p).f24459b.N(this.f24463q);
        }
    }

    /* compiled from: ScopesHolderForClass.kt */
    /* loaded from: classes6.dex */
    static final class c extends Lambda implements q3.a<T> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ y0<T> f24464p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(y0<T> y0Var) {
            super(0);
            this.f24464p = y0Var;
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T n() {
            return (T) ((y0) this.f24464p).f24459b.N(((y0) this.f24464p).f24460c);
        }
    }

    public /* synthetic */ y0(e eVar, kotlin.reflect.jvm.internal.impl.storage.n nVar, q3.l lVar, kotlin.reflect.jvm.internal.impl.types.checker.g gVar, kotlin.jvm.internal.w wVar) {
        this(eVar, nVar, lVar, gVar);
    }

    private final T d() {
        return (T) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f24461d, this, f24457f[0]);
    }

    @d5.d
    public final T c(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("䣘"));
        if (!gVar.d(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.p(this.f24458a))) {
            return d();
        }
        kotlin.reflect.jvm.internal.impl.types.h1 m5 = this.f24458a.m();
        kotlin.jvm.internal.l0.o(m5, ProtectedSandApp.s("䣙"));
        return !gVar.e(m5) ? d() : (T) gVar.c(this.f24458a, new b(this, gVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private y0(e eVar, kotlin.reflect.jvm.internal.impl.storage.n nVar, q3.l<? super kotlin.reflect.jvm.internal.impl.types.checker.g, ? extends T> lVar, kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        this.f24458a = eVar;
        this.f24459b = lVar;
        this.f24460c = gVar;
        this.f24461d = nVar.d(new c(this));
    }
}
