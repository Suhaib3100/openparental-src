package androidx.paging;

import androidx.annotation.c1;
import androidx.paging.b1;
import androidx.paging.c0;
import androidx.paging.e0;
import androidx.paging.s0;
import androidx.paging.v0;
import java.util.List;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: ContiguousPagedList.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\r\b\u0017\u0018\u0000 p*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u00042\u00020\u00052\b\u0012\u0004\u0012\u00028\u00010\u0006:\u0001qBi\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001eH\u0002¢\u0006\u0004\b$\u0010%J)\u0010&\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00172\u0010\u0010\u001a\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00010\u0012H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J'\u0010/\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u001eH\u0001¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u001bH\u0016¢\u0006\u0004\b1\u00102J)\u00105\u001a\u00020\u001b2\u0018\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u001b03H\u0016¢\u0006\u0004\b5\u00106J\u001f\u00109\u001a\u00020\u001b2\u0006\u00107\u001a\u00020\u00172\u0006\u00108\u001a\u00020(H\u0016¢\u0006\u0004\b9\u0010+J\u0017\u0010<\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020:H\u0017¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u001bH\u0016¢\u0006\u0004\b>\u00102J\u0017\u0010@\u001a\u00020\u001b2\u0006\u0010?\u001a\u00020:H\u0017¢\u0006\u0004\b@\u0010=J'\u0010D\u001a\u00020\u001b2\u0006\u0010A\u001a\u00020:2\u0006\u0010B\u001a\u00020:2\u0006\u0010C\u001a\u00020:H\u0017¢\u0006\u0004\bD\u0010EJ'\u0010G\u001a\u00020\u001b2\u0006\u0010F\u001a\u00020:2\u0006\u0010B\u001a\u00020:2\u0006\u0010C\u001a\u00020:H\u0017¢\u0006\u0004\bG\u0010EJ\u001f\u0010I\u001a\u00020\u001b2\u0006\u0010H\u001a\u00020:2\u0006\u0010?\u001a\u00020:H\u0016¢\u0006\u0004\bI\u0010JJ\u001f\u0010K\u001a\u00020\u001b2\u0006\u0010H\u001a\u00020:2\u0006\u0010?\u001a\u00020:H\u0016¢\u0006\u0004\bK\u0010JR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0006¢\u0006\f\n\u0004\b*\u0010L\u001a\u0004\bM\u0010NR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0016\u0010\u0014\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010W\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010Y\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010VR\u0016\u0010[\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010<R\u0016\u0010]\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010<R\u0016\u0010_\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010VR\u0016\u0010a\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010VR\u0016\u0010c\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010<R\u0014\u0010d\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<R&\u0010h\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010e8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b5\u0010f\u0012\u0004\bg\u00102R\u001c\u0010l\u001a\u0004\u0018\u00018\u00008VX\u0096\u0004¢\u0006\f\u0012\u0004\bk\u00102\u001a\u0004\bi\u0010jR\u0014\u0010o\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010n¨\u0006r"}, d2 = {"Landroidx/paging/k;", "", "K", "V", "Landroidx/paging/s0;", "Landroidx/paging/v0$a;", "Landroidx/paging/c0$b;", "Landroidx/paging/b1;", "pagingSource", "Lkotlinx/coroutines/r0;", "coroutineScope", "Lkotlinx/coroutines/m0;", "notifyDispatcher", "backgroundDispatcher", "Landroidx/paging/s0$a;", "boundaryCallback", "Landroidx/paging/s0$e;", "config", "Landroidx/paging/b1$b$c;", "initialPage", "initialLastKey", "<init>", "(Landroidx/paging/b1;Lkotlinx/coroutines/r0;Lkotlinx/coroutines/m0;Lkotlinx/coroutines/m0;Landroidx/paging/s0$a;Landroidx/paging/s0$e;Landroidx/paging/b1$b$c;Ljava/lang/Object;)V", "Landroidx/paging/g0;", "type", "", "page", "Lkotlin/k2;", "w0", "(Landroidx/paging/g0;Ljava/util/List;)V", "", "post", "x0", "(Z)V", "begin", "end", "s0", "(ZZ)V", "i", "(Landroidx/paging/g0;Landroidx/paging/b1$b$c;)Z", "Landroidx/paging/e0;", "state", "l", "(Landroidx/paging/g0;Landroidx/paging/e0;)V", "deferEmpty", "deferBegin", "deferEnd", "r0", "(ZZZ)V", "h0", "()V", "Lkotlin/Function2;", "callback", "w", "(Lld/p;)V", "loadType", "loadState", "i0", "", "index", "Z", "(I)V", "v", "count", "j", "leadingNulls", "changed", "added", "h", "(III)V", "endPosition", "f", "startOfDrops", "c", "(II)V", "b", "Landroidx/paging/b1;", "O", "()Landroidx/paging/b1;", "m", "Landroidx/paging/s0$a;", "t0", "()Landroidx/paging/s0$a;", "n", "Ljava/lang/Object;", "o", "I", "prependItemsRequested", "p", "appendItemsRequested", "q", "boundaryCallbackBeginDeferred", "r", "boundaryCallbackEndDeferred", "s", "lowestIndexAccessed", "t", "highestIndexAccessed", "u", "replacePagesWithNulls", "shouldTrim", "Landroidx/paging/c0;", "Landroidx/paging/c0;", "v0", "pager", "H", "()Ljava/lang/Object;", "u0", "lastKey", "U", "()Z", "isDetached", "x", "a", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
@androidx.annotation.c1({c1.a.LIBRARY})
/* loaded from: classes3.dex */
public class k<K, V> extends s0<V> implements v0.a, c0.b<V> {

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b1<K, V> pagingSource;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final s0.a<V> boundaryCallback;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final K initialLastKey;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int prependItemsRequested;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int appendItemsRequested;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean boundaryCallbackBeginDeferred;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean boundaryCallbackEndDeferred;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int lowestIndexAccessed;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int highestIndexAccessed;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private boolean replacePagesWithNulls;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldTrim;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c0<K, V> pager;

    /* compiled from: ContiguousPagedList.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/paging/k$a;", "", "<init>", "()V", "", "prefetchDistance", "index", "leadingNulls", "b", "(III)I", "itemsBeforeTrailingNulls", "a", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: androidx.paging.k$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final int a(int prefetchDistance, int index, int itemsBeforeTrailingNulls) {
            return ((index + prefetchDistance) + 1) - itemsBeforeTrailingNulls;
        }

        public final int b(int prefetchDistance, int index, int leadingNulls) {
            return prefetchDistance - (index - leadingNulls);
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: ContiguousPagedList.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.ContiguousPagedList$deferBoundaryCallbacks$1", f = "ContiguousPagedList.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "K", "V", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 5, 1})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f31779b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f31780c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k<K, V> f31781d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f31782e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f31783f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z4, k<K, V> kVar, boolean z5, boolean z6, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f31780c = z4;
            this.f31781d = kVar;
            this.f31782e = z5;
            this.f31783f = z6;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new b(this.f31780c, this.f31781d, this.f31782e, this.f31783f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f31779b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            if (this.f31780c) {
                this.f31781d.t0().c();
            }
            if (this.f31782e) {
                ((k) this.f31781d).boundaryCallbackBeginDeferred = true;
            }
            if (this.f31783f) {
                ((k) this.f31781d).boundaryCallbackEndDeferred = true;
            }
            this.f31781d.x0(false);
            return k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((b) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: ContiguousPagedList.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.ContiguousPagedList$tryDispatchBoundaryCallbacks$1", f = "ContiguousPagedList.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "K", "V", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 5, 1})
    static final class c extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f31784b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k<K, V> f31785c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f31786d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f31787e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k<K, V> kVar, boolean z4, boolean z5, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f31785c = kVar;
            this.f31786d = z4;
            this.f31787e = z5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new c(this.f31785c, this.f31786d, this.f31787e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f31784b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            this.f31785c.s0(this.f31786d, this.f31787e);
            return k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((c) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@fg.l b1<K, V> pagingSource, @fg.l kotlinx.coroutines.r0 coroutineScope, @fg.l kotlinx.coroutines.m0 notifyDispatcher, @fg.l kotlinx.coroutines.m0 backgroundDispatcher, @fg.m s0.a<V> aVar, @fg.l s0.e config, @fg.l b1.b.c<K, V> initialPage, @fg.m K k4) {
        super(pagingSource, coroutineScope, notifyDispatcher, new v0(), config);
        kotlin.jvm.internal.l0.p(pagingSource, "pagingSource");
        kotlin.jvm.internal.l0.p(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.l0.p(notifyDispatcher, "notifyDispatcher");
        kotlin.jvm.internal.l0.p(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.l0.p(config, "config");
        kotlin.jvm.internal.l0.p(initialPage, "initialPage");
        this.pagingSource = pagingSource;
        this.boundaryCallback = aVar;
        this.initialLastKey = k4;
        this.lowestIndexAccessed = Integer.MAX_VALUE;
        this.highestIndexAccessed = Integer.MIN_VALUE;
        this.shouldTrim = config.maxSize != Integer.MAX_VALUE;
        this.pager = new c0<>(coroutineScope, config, pagingSource, notifyDispatcher, backgroundDispatcher, this, T());
        if (config.enablePlaceholders) {
            T().A(initialPage.k() != Integer.MIN_VALUE ? initialPage.k() : 0, initialPage, initialPage.j() != Integer.MIN_VALUE ? initialPage.j() : 0, 0, this, (initialPage.k() == Integer.MIN_VALUE || initialPage.j() == Integer.MIN_VALUE) ? false : true);
        } else {
            T().A(0, initialPage, 0, initialPage.k() != Integer.MIN_VALUE ? initialPage.k() : 0, this, false);
        }
        w0(g0.REFRESH, initialPage.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s0(boolean begin, boolean end) {
        if (begin) {
            s0.a<V> aVar = this.boundaryCallback;
            kotlin.jvm.internal.l0.m(aVar);
            aVar.b(T().q());
        }
        if (end) {
            s0.a<V> aVar2 = this.boundaryCallback;
            kotlin.jvm.internal.l0.m(aVar2);
            aVar2.a(T().s());
        }
    }

    public static /* synthetic */ void u0() {
    }

    private static /* synthetic */ void v0() {
    }

    private final void w0(g0 type, List<? extends V> page) {
        if (this.boundaryCallback != null) {
            boolean z4 = false;
            boolean z5 = T().getSize() == 0;
            boolean z6 = !z5 && type == g0.PREPEND && page.isEmpty();
            if (!z5 && type == g0.APPEND && page.isEmpty()) {
                z4 = true;
            }
            r0(z5, z6, z4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x0(boolean post) {
        boolean z4 = this.boundaryCallbackBeginDeferred && this.lowestIndexAccessed <= getConfig().prefetchDistance;
        boolean z5 = this.boundaryCallbackEndDeferred && this.highestIndexAccessed >= (S() - 1) - getConfig().prefetchDistance;
        if (z4 || z5) {
            if (z4) {
                this.boundaryCallbackBeginDeferred = false;
            }
            if (z5) {
                this.boundaryCallbackEndDeferred = false;
            }
            if (post) {
                kotlinx.coroutines.k.f(getCoroutineScope(), getNotifyDispatcher(), null, new c(this, z4, z5, null), 2, null);
            } else {
                s0(z4, z5);
            }
        }
    }

    @Override // androidx.paging.s0
    @fg.m
    public K H() {
        d1<?, V> x4 = T().x(getConfig());
        K e4 = x4 == null ? null : this.pagingSource.e(x4);
        return e4 == null ? this.initialLastKey : e4;
    }

    @Override // androidx.paging.s0
    @fg.l
    public final b1<K, V> O() {
        return this.pagingSource;
    }

    @Override // androidx.paging.s0
    /* renamed from: U */
    public boolean getIsDetached() {
        return this.pager.k();
    }

    @Override // androidx.paging.s0
    @androidx.annotation.l0
    public void Z(int index) {
        Companion companion = INSTANCE;
        int i4 = getConfig().prefetchDistance;
        int placeholdersBefore = T().getPlaceholdersBefore();
        companion.getClass();
        int i5 = i4 - (index - placeholdersBefore);
        int a5 = companion.a(getConfig().prefetchDistance, index, T().getStorageCount() + T().getPlaceholdersBefore());
        int max = Math.max(i5, this.prependItemsRequested);
        this.prependItemsRequested = max;
        if (max > 0) {
            this.pager.u();
        }
        int max2 = Math.max(a5, this.appendItemsRequested);
        this.appendItemsRequested = max2;
        if (max2 > 0) {
            this.pager.t();
        }
        this.lowestIndexAccessed = Math.min(this.lowestIndexAccessed, index);
        this.highestIndexAccessed = Math.max(this.highestIndexAccessed, index);
        x0(true);
    }

    @Override // androidx.paging.v0.a
    public void b(int startOfDrops, int count) {
        a0(startOfDrops, count);
    }

    @Override // androidx.paging.v0.a
    public void c(int startOfDrops, int count) {
        d0(startOfDrops, count);
    }

    @Override // androidx.paging.v0.a
    @androidx.annotation.l0
    public void f(int endPosition, int changed, int added) {
        a0(endPosition, changed);
        b0(endPosition + changed, added);
    }

    @Override // androidx.paging.v0.a
    @androidx.annotation.l0
    public void h(int leadingNulls, int changed, int added) {
        a0(leadingNulls, changed);
        b0(0, added);
        this.lowestIndexAccessed += added;
        this.highestIndexAccessed += added;
    }

    @Override // androidx.paging.s0
    public void h0() {
        Runnable refreshRetryCallback;
        this.pager.o();
        if (!(this.pager.getLoadStateManager().getRefreshState() instanceof e0.a) || (refreshRetryCallback = getRefreshRetryCallback()) == null) {
            return;
        }
        refreshRetryCallback.run();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0064, code lost:
    
        if (r0.isEmpty() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008b, code lost:
    
        if (r0.isEmpty() == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    @Override // androidx.paging.c0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean i(@fg.l androidx.paging.g0 r9, @fg.l androidx.paging.b1.b.c<?, V> r10) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.k.i(androidx.paging.g0, androidx.paging.b1$b$c):boolean");
    }

    @Override // androidx.paging.s0
    public void i0(@fg.l g0 loadType, @fg.l e0 loadState) {
        kotlin.jvm.internal.l0.p(loadType, "loadType");
        kotlin.jvm.internal.l0.p(loadState, "loadState");
        this.pager.getLoadStateManager().i(loadType, loadState);
    }

    @Override // androidx.paging.v0.a
    @androidx.annotation.l0
    public void j(int count) {
        b0(0, count);
        this.replacePagesWithNulls = T().getPlaceholdersBefore() > 0 || T().getPlaceholdersAfter() > 0;
    }

    @Override // androidx.paging.c0.b
    public void l(@fg.l g0 type, @fg.l e0 state) {
        kotlin.jvm.internal.l0.p(type, "type");
        kotlin.jvm.internal.l0.p(state, "state");
        x(type, state);
    }

    @androidx.annotation.d
    public final void r0(boolean deferEmpty, boolean deferBegin, boolean deferEnd) {
        if (this.boundaryCallback == null) {
            throw new IllegalStateException("Can't defer BoundaryCallback, no instance");
        }
        if (this.lowestIndexAccessed == Integer.MAX_VALUE) {
            this.lowestIndexAccessed = T().getSize();
        }
        if (this.highestIndexAccessed == Integer.MIN_VALUE) {
            this.highestIndexAccessed = 0;
        }
        if (deferEmpty || deferBegin || deferEnd) {
            kotlinx.coroutines.k.f(getCoroutineScope(), getNotifyDispatcher(), null, new b(deferEmpty, this, deferBegin, deferEnd, null), 2, null);
        }
    }

    @fg.m
    public final s0.a<V> t0() {
        return this.boundaryCallback;
    }

    @Override // androidx.paging.s0
    public void v() {
        this.pager.e();
    }

    @Override // androidx.paging.s0
    public void w(@fg.l ld.p<? super g0, ? super e0, k2> callback) {
        kotlin.jvm.internal.l0.p(callback, "callback");
        this.pager.getLoadStateManager().a(callback);
    }
}
