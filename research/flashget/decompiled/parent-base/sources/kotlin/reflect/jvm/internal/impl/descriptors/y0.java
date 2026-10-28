package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;

/* compiled from: ScopesHolderForClass.kt */
/* loaded from: classes7.dex */
public final class y0<T extends kotlin.reflect.jvm.internal.impl.resolve.scopes.h> {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final e f76308a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final ld.l<kotlin.reflect.jvm.internal.impl.types.checker.g, T> f76309b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.types.checker.g f76310c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.i f76311d;

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.o<Object>[] f76307f = {kotlin.jvm.internal.l1.u(new kotlin.jvm.internal.g1(kotlin.jvm.internal.l1.d(y0.class), ProtectedSandApp.s("潭\u0001"), ProtectedSandApp.s("潮\u0001")))};

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    public static final a f76306e = new a();

    /* compiled from: ScopesHolderForClass.kt */
    public static final class a {
        private a() {
        }

        @fg.l
        public final <T extends kotlin.reflect.jvm.internal.impl.resolve.scopes.h> y0<T> a(@fg.l e eVar, @fg.l kotlin.reflect.jvm.internal.impl.storage.n nVar, @fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.types.checker.g, ? extends T> lVar) {
            kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("潩\u0001"));
            kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("潪\u0001"));
            kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("潫\u0001"));
            kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("潬\u0001"));
            return new y0<>(eVar, nVar, lVar, gVar, null);
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: ScopesHolderForClass.kt */
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ y0<T> f76312b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.checker.g f76313c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(y0<T> y0Var, kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            super(0);
            this.f76312b = y0Var;
            this.f76313c = gVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke() {
            return (T) ((y0) this.f76312b).f76309b.invoke(this.f76313c);
        }
    }

    /* compiled from: ScopesHolderForClass.kt */
    static final class c extends kotlin.jvm.internal.n0 implements ld.a<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ y0<T> f76314b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(y0<T> y0Var) {
            super(0);
            this.f76314b = y0Var;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke() {
            return (T) ((y0) this.f76314b).f76309b.invoke(((y0) this.f76314b).f76310c);
        }
    }

    public /* synthetic */ y0(e eVar, kotlin.reflect.jvm.internal.impl.storage.n nVar, ld.l lVar, kotlin.reflect.jvm.internal.impl.types.checker.g gVar, kotlin.jvm.internal.w wVar) {
        this(eVar, nVar, lVar, gVar);
    }

    private final T d() {
        return (T) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f76311d, this, f76307f[0]);
    }

    @fg.l
    public final T c(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("潯\u0001"));
        if (!gVar.d(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.p(this.f76308a))) {
            return d();
        }
        kotlin.reflect.jvm.internal.impl.types.h1 j4 = this.f76308a.j();
        kotlin.jvm.internal.l0.o(j4, ProtectedSandApp.s("潰\u0001"));
        return !gVar.e(j4) ? d() : (T) gVar.c(this.f76308a, new b(this, gVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private y0(e eVar, kotlin.reflect.jvm.internal.impl.storage.n nVar, ld.l<? super kotlin.reflect.jvm.internal.impl.types.checker.g, ? extends T> lVar, kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        this.f76308a = eVar;
        this.f76309b = lVar;
        this.f76310c = gVar;
        this.f76311d = nVar.h(new c(this));
    }
}
