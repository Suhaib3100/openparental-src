package androidx.paging;

import kotlin.Metadata;
import kotlin.k2;

/* compiled from: Pager.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001BM\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0007\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n0\t¢\u0006\u0004\b\f\u0010\rB7\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n0\t¢\u0006\u0004\b\f\u0010\u000eR)\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00100\u000f8\u0006¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/paging/w0;", "", "Key", "Value", "Landroidx/paging/x0;", "config", "initialKey", "Landroidx/paging/f1;", "remoteMediator", "Lkotlin/Function0;", "Landroidx/paging/b1;", "pagingSourceFactory", "<init>", "(Landroidx/paging/x0;Ljava/lang/Object;Landroidx/paging/f1;Lld/a;)V", "(Landroidx/paging/x0;Ljava/lang/Object;Lld/a;)V", "Lkotlinx/coroutines/flow/i;", "Landroidx/paging/y0;", "a", "Lkotlinx/coroutines/flow/i;", "()Lkotlinx/coroutines/flow/i;", "b", "()V", "flow", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class w0<Key, Value> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.flow.i<y0<Value>> flow;

    /* compiled from: Pager.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* synthetic */ class a extends kotlin.jvm.internal.h0 implements ld.l<b1<Key, Value>>, kotlin.coroutines.jvm.internal.n {
        a(Object obj) {
            super(1, obj, r1.class, "create", "create(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlin.coroutines.d<? super b1<Key, Value>> dVar) {
            return ((r1) this.receiver).b(dVar);
        }
    }

    /* compiled from: Pager.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.Pager$flow$2", f = "Pager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Key", "Value", "Landroidx/paging/b1;", "<anonymous>", "()Landroidx/paging/b1;"}, k = 3, mv = {1, 5, 1})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.l<kotlin.coroutines.d<? super b1<Key, Value>>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f32423b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a<b1<Key, Value>> f32424c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ld.a<? extends b1<Key, Value>> aVar, kotlin.coroutines.d<? super b> dVar) {
            super(1, dVar);
            this.f32424c = aVar;
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.m kotlin.coroutines.d<? super b1<Key, Value>> dVar) {
            return ((b) create(dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.l kotlin.coroutines.d<?> dVar) {
            return new b(this.f32424c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f32423b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            return this.f32424c.invoke();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kd.j
    public w0(@fg.l x0 config, @fg.l ld.a<? extends b1<Key, Value>> pagingSourceFactory) {
        this(config, null, pagingSourceFactory, 2, null);
        kotlin.jvm.internal.l0.p(config, "config");
        kotlin.jvm.internal.l0.p(pagingSourceFactory, "pagingSourceFactory");
    }

    public static /* synthetic */ void b() {
    }

    @fg.l
    public final kotlinx.coroutines.flow.i<y0<Value>> a() {
        return this.flow;
    }

    @p
    public w0(@fg.l x0 config, @fg.m Key key, @fg.m f1<Key, Value> f1Var, @fg.l ld.a<? extends b1<Key, Value>> pagingSourceFactory) {
        kotlin.jvm.internal.l0.p(config, "config");
        kotlin.jvm.internal.l0.p(pagingSourceFactory, "pagingSourceFactory");
        this.flow = new m0(pagingSourceFactory instanceof r1 ? new a(pagingSourceFactory) : new b(pagingSourceFactory, null), key, config, f1Var).i();
    }

    public /* synthetic */ w0(x0 x0Var, Object obj, f1 f1Var, ld.a aVar, int i4, kotlin.jvm.internal.w wVar) {
        this(x0Var, (i4 & 2) != 0 ? null : obj, f1Var, aVar);
    }

    public /* synthetic */ w0(x0 x0Var, Object obj, ld.a aVar, int i4, kotlin.jvm.internal.w wVar) {
        this(x0Var, (i4 & 2) != 0 ? null : obj, aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kd.j
    public w0(@fg.l x0 config, @fg.m Key key, @fg.l ld.a<? extends b1<Key, Value>> pagingSourceFactory) {
        this(config, key, null, pagingSourceFactory);
        kotlin.jvm.internal.l0.p(config, "config");
        kotlin.jvm.internal.l0.p(pagingSourceFactory, "pagingSourceFactory");
    }
}
