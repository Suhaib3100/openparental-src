package androidx.paging;

import androidx.paging.b1;
import androidx.paging.e0;
import androidx.paging.s0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: LegacyPageFetcher.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002*,BW\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0017H\u0002¢\u0006\u0004\b$\u0010#J\u000f\u0010%\u001a\u00020\u0017H\u0002¢\u0006\u0004\b%\u0010#J\r\u0010&\u001a\u00020\u0017¢\u0006\u0004\b&\u0010#J\r\u0010'\u001a\u00020\u0017¢\u0006\u0004\b'\u0010#J\r\u0010(\u001a\u00020\u0017¢\u0006\u0004\b(\u0010#J\r\u0010)\u001a\u00020\u0017¢\u0006\u0004\b)\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00105R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r8\u0006¢\u0006\f\n\u0004\b.\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R(\u0010D\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b7\u0010@\u0012\u0004\b<\u0010#\u001a\u0004\b9\u0010A\"\u0004\bB\u0010CR\u0011\u0010H\u001a\u00020E8F¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006I"}, d2 = {"Landroidx/paging/c0;", "", "K", "V", "Lkotlinx/coroutines/r0;", "pagedListScope", "Landroidx/paging/s0$e;", "config", "Landroidx/paging/b1;", "source", "Lkotlinx/coroutines/m0;", "notifyDispatcher", "fetchDispatcher", "Landroidx/paging/c0$b;", "pageConsumer", "Landroidx/paging/c0$a;", "keyProvider", "<init>", "(Lkotlinx/coroutines/r0;Landroidx/paging/s0$e;Landroidx/paging/b1;Lkotlinx/coroutines/m0;Lkotlinx/coroutines/m0;Landroidx/paging/c0$b;Landroidx/paging/c0$a;)V", "Landroidx/paging/g0;", "type", "Landroidx/paging/b1$a;", "params", "Lkotlin/k2;", "q", "(Landroidx/paging/g0;Landroidx/paging/b1$a;)V", "Landroidx/paging/b1$b$c;", "value", "n", "(Landroidx/paging/g0;Landroidx/paging/b1$b$c;)V", "", "throwable", "l", "(Landroidx/paging/g0;Ljava/lang/Throwable;)V", "m", "()V", "r", "p", "u", "t", "o", "e", "a", "Lkotlinx/coroutines/r0;", "b", "Landroidx/paging/s0$e;", "f", "()Landroidx/paging/s0$e;", "c", "Landroidx/paging/b1;", "j", "()Landroidx/paging/b1;", "d", "Lkotlinx/coroutines/m0;", "Landroidx/paging/c0$b;", "i", "()Landroidx/paging/c0$b;", "g", "Landroidx/paging/c0$a;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "h", "Ljava/util/concurrent/atomic/AtomicBoolean;", "detached", "Landroidx/paging/s0$f;", "Landroidx/paging/s0$f;", "()Landroidx/paging/s0$f;", "s", "(Landroidx/paging/s0$f;)V", "loadStateManager", "", "k", "()Z", "isDetached", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class c0<K, V> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.r0 pagedListScope;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final s0.e config;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b1<K, V> source;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.m0 notifyDispatcher;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.m0 fetchDispatcher;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b<V> pageConsumer;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final a<K> keyProvider;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final AtomicBoolean detached;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private s0.f loadStateManager;

    /* compiled from: LegacyPageFetcher.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b`\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00018\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00018\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\b"}, d2 = {"Landroidx/paging/c0$a;", "", "K", "h", "()Ljava/lang/Object;", "prevKey", "b", "nextKey", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface a<K> {
        @fg.m
        K b();

        @fg.m
        K h();
    }

    /* compiled from: LegacyPageFetcher.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001J)\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0010\u0010\u0006\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/paging/c0$b;", "", "V", "Landroidx/paging/g0;", "type", "Landroidx/paging/b1$b$c;", "page", "", "i", "(Landroidx/paging/g0;Landroidx/paging/b1$b$c;)Z", "Landroidx/paging/e0;", "state", "Lkotlin/k2;", "l", "(Landroidx/paging/g0;Landroidx/paging/e0;)V", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface b<V> {
        boolean i(@fg.l g0 type, @fg.l b1.b.c<?, V> page);

        void l(@fg.l g0 type, @fg.l e0 state);
    }

    /* compiled from: LegacyPageFetcher.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31582a;

        static {
            int[] iArr = new int[g0.values().length];
            iArr[g0.PREPEND.ordinal()] = 1;
            iArr[g0.APPEND.ordinal()] = 2;
            f31582a = iArr;
        }
    }

    /* compiled from: LegacyPageFetcher.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/paging/c0$d", "Landroidx/paging/s0$f;", "Landroidx/paging/g0;", "type", "Landroidx/paging/e0;", "state", "Lkotlin/k2;", "e", "(Landroidx/paging/g0;Landroidx/paging/e0;)V", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class d extends s0.f {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c0<K, V> f31583d;

        d(c0<K, V> c0Var) {
            this.f31583d = c0Var;
        }

        @Override // androidx.paging.s0.f
        public void e(@fg.l g0 type, @fg.l e0 state) {
            kotlin.jvm.internal.l0.p(type, "type");
            kotlin.jvm.internal.l0.p(state, "state");
            this.f31583d.i().l(type, state);
        }
    }

    /* compiled from: LegacyPageFetcher.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.LegacyPageFetcher$scheduleLoad$1", f = "LegacyPageFetcher.kt", i = {0}, l = {53}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "K", "V", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 5, 1})
    static final class e extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f31584b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f31585c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c0<K, V> f31586d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ b1.a<K> f31587e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ g0 f31588f;

        /* compiled from: LegacyPageFetcher.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.LegacyPageFetcher$scheduleLoad$1$1", f = "LegacyPageFetcher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "K", "V", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 5, 1})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f31589b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b1.b<K, V> f31590c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ c0<K, V> f31591d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ g0 f31592e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b1.b<K, V> bVar, c0<K, V> c0Var, g0 g0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f31590c = bVar;
                this.f31591d = c0Var;
                this.f31592e = g0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f31590c, this.f31591d, this.f31592e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                if (this.f31589b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
                b1.b<K, V> bVar = this.f31590c;
                if (bVar instanceof b1.b.c) {
                    this.f31591d.n(this.f31592e, (b1.b.c) bVar);
                } else if (bVar instanceof b1.b.a) {
                    this.f31591d.l(this.f31592e, ((b1.b.a) bVar).d());
                } else if (bVar instanceof b1.b.C0529b) {
                    this.f31591d.m();
                }
                return k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(c0<K, V> c0Var, b1.a<K> aVar, g0 g0Var, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f31586d = c0Var;
            this.f31587e = aVar;
            this.f31588f = g0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            e eVar = new e(this.f31586d, this.f31587e, this.f31588f, dVar);
            eVar.f31585c = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlinx.coroutines.r0 r0Var;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f31584b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                kotlinx.coroutines.r0 r0Var2 = (kotlinx.coroutines.r0) this.f31585c;
                b1<K, V> j4 = this.f31586d.j();
                b1.a<K> aVar2 = this.f31587e;
                this.f31585c = r0Var2;
                this.f31584b = 1;
                Object g4 = j4.g(aVar2, this);
                if (g4 == aVar) {
                    return aVar;
                }
                r0Var = r0Var2;
                obj = g4;
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r0Var = (kotlinx.coroutines.r0) this.f31585c;
                kotlin.a1.n(obj);
            }
            b1.b bVar = (b1.b) obj;
            if (this.f31586d.j().a()) {
                this.f31586d.e();
                return k2.f75408a;
            }
            kotlinx.coroutines.k.f(r0Var, ((c0) this.f31586d).notifyDispatcher, null, new a(bVar, this.f31586d, this.f31588f, null), 2, null);
            return k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((e) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    public c0(@fg.l kotlinx.coroutines.r0 pagedListScope, @fg.l s0.e config, @fg.l b1<K, V> source, @fg.l kotlinx.coroutines.m0 notifyDispatcher, @fg.l kotlinx.coroutines.m0 fetchDispatcher, @fg.l b<V> pageConsumer, @fg.l a<K> keyProvider) {
        kotlin.jvm.internal.l0.p(pagedListScope, "pagedListScope");
        kotlin.jvm.internal.l0.p(config, "config");
        kotlin.jvm.internal.l0.p(source, "source");
        kotlin.jvm.internal.l0.p(notifyDispatcher, "notifyDispatcher");
        kotlin.jvm.internal.l0.p(fetchDispatcher, "fetchDispatcher");
        kotlin.jvm.internal.l0.p(pageConsumer, "pageConsumer");
        kotlin.jvm.internal.l0.p(keyProvider, "keyProvider");
        this.pagedListScope = pagedListScope;
        this.config = config;
        this.source = source;
        this.notifyDispatcher = notifyDispatcher;
        this.fetchDispatcher = fetchDispatcher;
        this.pageConsumer = pageConsumer;
        this.keyProvider = keyProvider;
        this.detached = new AtomicBoolean(false);
        this.loadStateManager = new d(this);
    }

    public static /* synthetic */ void h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(g0 type, Throwable throwable) {
        if (this.detached.get()) {
            return;
        }
        this.loadStateManager.i(type, new e0.a(throwable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        this.source.f();
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(g0 type, b1.b.c<K, V> value) {
        e0.c cVar;
        if (this.detached.get()) {
            return;
        }
        if (this.pageConsumer.i(type, value)) {
            int i4 = c.f31582a[type.ordinal()];
            if (i4 == 1) {
                r();
                return;
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("Can only fetch more during append/prepend");
                }
                p();
                return;
            }
        }
        s0.f fVar = this.loadStateManager;
        if (value.i().isEmpty()) {
            e0.c.INSTANCE.getClass();
            cVar = e0.c.f31662c;
        } else {
            e0.c.INSTANCE.getClass();
            cVar = e0.c.f31663d;
        }
        fVar.i(type, cVar);
    }

    private final void p() {
        K b5 = this.keyProvider.b();
        if (b5 == null) {
            g0 g0Var = g0.APPEND;
            b1.b.c.INSTANCE.getClass();
            n(g0Var, b1.b.c.f31566h);
        } else {
            s0.f fVar = this.loadStateManager;
            g0 g0Var2 = g0.APPEND;
            fVar.i(g0Var2, e0.b.f31660b);
            s0.e eVar = this.config;
            q(g0Var2, new b1.a.C0527a(b5, eVar.pageSize, eVar.enablePlaceholders));
        }
    }

    private final void q(g0 type, b1.a<K> params) {
        kotlinx.coroutines.k.f(this.pagedListScope, this.fetchDispatcher, null, new e(this, params, type, null), 2, null);
    }

    private final void r() {
        K h4 = this.keyProvider.h();
        if (h4 == null) {
            g0 g0Var = g0.PREPEND;
            b1.b.c.INSTANCE.getClass();
            n(g0Var, b1.b.c.f31566h);
        } else {
            s0.f fVar = this.loadStateManager;
            g0 g0Var2 = g0.PREPEND;
            fVar.i(g0Var2, e0.b.f31660b);
            s0.e eVar = this.config;
            q(g0Var2, new b1.a.c(h4, eVar.pageSize, eVar.enablePlaceholders));
        }
    }

    public final void e() {
        this.detached.set(true);
    }

    @fg.l
    /* renamed from: f, reason: from getter */
    public final s0.e getConfig() {
        return this.config;
    }

    @fg.l
    /* renamed from: g, reason: from getter */
    public final s0.f getLoadStateManager() {
        return this.loadStateManager;
    }

    @fg.l
    public final b<V> i() {
        return this.pageConsumer;
    }

    @fg.l
    public final b1<K, V> j() {
        return this.source;
    }

    public final boolean k() {
        return this.detached.get();
    }

    public final void o() {
        if (this.loadStateManager.getStartState() instanceof e0.a) {
            r();
        }
        if (this.loadStateManager.getEndState() instanceof e0.a) {
            p();
        }
    }

    public final void s(@fg.l s0.f fVar) {
        kotlin.jvm.internal.l0.p(fVar, "<set-?>");
        this.loadStateManager = fVar;
    }

    public final void t() {
        e0 endState = this.loadStateManager.getEndState();
        if (!(endState instanceof e0.c) || endState.getEndOfPaginationReached()) {
            return;
        }
        p();
    }

    public final void u() {
        e0 startState = this.loadStateManager.getStartState();
        if (!(startState instanceof e0.c) || startState.getEndOfPaginationReached()) {
            return;
        }
        r();
    }
}
