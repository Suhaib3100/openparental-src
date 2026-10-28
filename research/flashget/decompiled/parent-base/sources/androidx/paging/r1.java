package androidx.paging;

import kotlin.Metadata;
import kotlin.k2;

/* compiled from: SuspendingPagingSourceFactory.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004B)\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR&\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/paging/r1;", "", "Key", "Value", "Lkotlin/Function0;", "Landroidx/paging/b1;", "Lkotlinx/coroutines/m0;", "dispatcher", "delegate", "<init>", "(Lkotlinx/coroutines/m0;Lld/a;)V", "b", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "c", "()Landroidx/paging/b1;", "Lkotlinx/coroutines/m0;", "Lld/a;", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class r1<Key, Value> implements ld.a<b1<Key, Value>> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.m0 dispatcher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<b1<Key, Value>> delegate;

    /* compiled from: SuspendingPagingSourceFactory.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SuspendingPagingSourceFactory$create$2", f = "SuspendingPagingSourceFactory.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "Lkotlinx/coroutines/r0;", "Landroidx/paging/b1;", "<anonymous>", "(Lkotlinx/coroutines/r0;)Landroidx/paging/b1;"}, k = 3, mv = {1, 5, 1})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super b1<Key, Value>>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f32265b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ r1<Key, Value> f32266c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(r1<Key, Value> r1Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f32266c = r1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new a(this.f32266c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f32265b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            return ((r1) this.f32266c).delegate.invoke();
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super b1<Key, Value>> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r1(@fg.l kotlinx.coroutines.m0 dispatcher, @fg.l ld.a<? extends b1<Key, Value>> delegate) {
        kotlin.jvm.internal.l0.p(dispatcher, "dispatcher");
        kotlin.jvm.internal.l0.p(delegate, "delegate");
        this.dispatcher = dispatcher;
        this.delegate = delegate;
    }

    @fg.m
    public final Object b(@fg.l kotlin.coroutines.d<? super b1<Key, Value>> dVar) {
        return kotlinx.coroutines.i.h(this.dispatcher, new a(this, null), dVar);
    }

    @Override // ld.a
    @fg.l
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public b1<Key, Value> invoke() {
        return this.delegate.invoke();
    }
}
