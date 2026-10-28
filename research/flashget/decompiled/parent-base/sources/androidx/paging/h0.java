package androidx.paging;

import androidx.paging.c;
import kotlin.Metadata;
import kotlin.k2;
import kotlinx.coroutines.flow.t;

/* compiled from: CachedPagingData.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroidx/paging/h0;", "", "T", "Lkotlinx/coroutines/r0;", "scope", "Landroidx/paging/y0;", "parent", "Landroidx/paging/c;", "tracker", "<init>", "(Lkotlinx/coroutines/r0;Landroidx/paging/y0;Landroidx/paging/c;)V", "a", "()Landroidx/paging/y0;", "Lkotlin/k2;", "b", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/r0;", "d", "()Lkotlinx/coroutines/r0;", "Landroidx/paging/y0;", "c", "Landroidx/paging/c;", "e", "()Landroidx/paging/c;", "Landroidx/paging/d;", "Landroidx/paging/d;", "accumulated", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
final class h0<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.r0 scope;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final y0<T> parent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final c tracker;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final d<T> accumulated;

    /* compiled from: CachedPagingData.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.MulticastedPagingData$accumulated$1", f = "CachedPagingData.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lkotlinx/coroutines/flow/j;", "Landroidx/paging/l0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 5, 1})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.flow.j<? super l0<T>>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f31736b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h0<T> f31737c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h0<T> h0Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f31737c = h0Var;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.flow.j<? super l0<T>> jVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new a(this.f31737c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f31736b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                c tracker = this.f31737c.getTracker();
                if (tracker != null) {
                    c.a aVar2 = c.a.PAGE_EVENT_FLOW;
                    this.f31736b = 1;
                    if (tracker.b(aVar2, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: CachedPagingData.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.MulticastedPagingData$accumulated$2", f = "CachedPagingData.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "T", "Lkotlinx/coroutines/flow/j;", "Landroidx/paging/l0;", "", "it", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.flow.j<? super l0<T>>, Throwable, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f31738b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h0<T> f31739c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(h0<T> h0Var, kotlin.coroutines.d<? super b> dVar) {
            super(3, dVar);
            this.f31739c = h0Var;
        }

        @Override // ld.q
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object R(@fg.l kotlinx.coroutines.flow.j<? super l0<T>> jVar, @fg.m Throwable th, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return new b(this.f31739c, dVar).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f31738b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                c tracker = this.f31739c.getTracker();
                if (tracker != null) {
                    c.a aVar2 = c.a.PAGE_EVENT_FLOW;
                    this.f31738b = 1;
                    if (tracker.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    public h0(@fg.l kotlinx.coroutines.r0 scope, @fg.l y0<T> parent, @fg.m c cVar) {
        kotlin.jvm.internal.l0.p(scope, "scope");
        kotlin.jvm.internal.l0.p(parent, "parent");
        this.scope = scope;
        this.parent = parent;
        this.tracker = cVar;
        this.accumulated = new d<>(new t.b(new t.e(new a(this, null), parent.e()), new b(this, null)), scope);
    }

    @fg.l
    public final y0<T> a() {
        return new y0<>(this.accumulated.f(), this.parent.getReceiver());
    }

    @fg.m
    public final Object b(@fg.l kotlin.coroutines.d<? super k2> dVar) {
        this.accumulated.e();
        return k2.f75408a;
    }

    @fg.l
    public final y0<T> c() {
        return this.parent;
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final kotlinx.coroutines.r0 getScope() {
        return this.scope;
    }

    @fg.m
    /* renamed from: e, reason: from getter */
    public final c getTracker() {
        return this.tracker;
    }

    public /* synthetic */ h0(kotlinx.coroutines.r0 r0Var, y0 y0Var, c cVar, int i4, kotlin.jvm.internal.w wVar) {
        this(r0Var, y0Var, (i4 & 4) != 0 ? null : cVar);
    }
}
