package androidx.paging;

import androidx.paging.e0;
import androidx.paging.l0;
import com.luck.picture.lib.config.PictureConfig;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.k2;
import kotlinx.coroutines.channels.e0;
import kotlinx.coroutines.flow.a0;
import kotlinx.coroutines.flow.t;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.p2;

/* compiled from: PageFetcher.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u001f!B^\u0012(\u0010\u0007\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011JI\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00180\u0017*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ5\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00062\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u0011R9\u0010\u0007\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\b\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(R#\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010,0\u00178\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\u0082\u0002\u0004\n\u0002\b\u0019¨\u00062"}, d2 = {"Landroidx/paging/m0;", "", "Key", "Value", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "Landroidx/paging/b1;", "pagingSourceFactory", "initialKey", "Landroidx/paging/x0;", "config", "Landroidx/paging/f1;", "remoteMediator", "<init>", "(Lld/l;Ljava/lang/Object;Landroidx/paging/x0;Landroidx/paging/f1;)V", "Lkotlin/k2;", "k", "()V", "Landroidx/paging/n0;", "Lkotlinx/coroutines/k2;", "job", "Landroidx/paging/h1;", "accessor", "Lkotlinx/coroutines/flow/i;", "Landroidx/paging/l0;", "j", "(Landroidx/paging/n0;Lkotlinx/coroutines/k2;Landroidx/paging/h1;)Lkotlinx/coroutines/flow/i;", "previousPagingSource", "h", "(Landroidx/paging/b1;Lkotlin/coroutines/d;)Ljava/lang/Object;", "l", "a", "Lld/l;", "b", "Ljava/lang/Object;", "c", "Landroidx/paging/x0;", "Landroidx/paging/j;", "", "d", "Landroidx/paging/j;", "refreshEvents", "e", "retryEvents", "Landroidx/paging/y0;", "f", "Lkotlinx/coroutines/flow/i;", "i", "()Lkotlinx/coroutines/flow/i;", "flow", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class m0<Key, Value> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<kotlin.coroutines.d<? super b1<Key, Value>>, Object> pagingSourceFactory;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Key initialKey;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final x0 config;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final j<Boolean> refreshEvents;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final j<k2> retryEvents;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.flow.i<y0<Value>> flow;

    /* compiled from: PageFetcher.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001B9\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\f\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/paging/m0$a;", "", "Key", "Value", "Landroidx/paging/n0;", "snapshot", "Landroidx/paging/d1;", "state", "Lkotlinx/coroutines/k2;", "job", "<init>", "(Landroidx/paging/n0;Landroidx/paging/d1;Lkotlinx/coroutines/k2;)V", "a", "Landroidx/paging/n0;", "b", "()Landroidx/paging/n0;", "Landroidx/paging/d1;", "c", "()Landroidx/paging/d1;", "Lkotlinx/coroutines/k2;", "()Lkotlinx/coroutines/k2;", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class a<Key, Value> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final n0<Key, Value> snapshot;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private final d1<Key, Value> state;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final kotlinx.coroutines.k2 job;

        public a(@fg.l n0<Key, Value> snapshot, @fg.m d1<Key, Value> d1Var, @fg.l kotlinx.coroutines.k2 job) {
            kotlin.jvm.internal.l0.p(snapshot, "snapshot");
            kotlin.jvm.internal.l0.p(job, "job");
            this.snapshot = snapshot;
            this.state = d1Var;
            this.job = job;
        }

        @fg.l
        /* renamed from: a, reason: from getter */
        public final kotlinx.coroutines.k2 getJob() {
            return this.job;
        }

        @fg.l
        public final n0<Key, Value> b() {
            return this.snapshot;
        }

        @fg.m
        public final d1<Key, Value> c() {
            return this.state;
        }
    }

    /* compiled from: PageFetcher.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0004B+\u0012\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0011R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/paging/m0$b;", "", "Key", "Value", "Landroidx/paging/u1;", "Landroidx/paging/n0;", "pageFetcherSnapshot", "Landroidx/paging/j;", "Lkotlin/k2;", "retryEventBus", "<init>", "(Landroidx/paging/m0;Landroidx/paging/n0;Landroidx/paging/j;)V", "Landroidx/paging/w1;", "viewportHint", "a", "(Landroidx/paging/w1;)V", "b", "()V", "refresh", "Landroidx/paging/n0;", "c", "()Landroidx/paging/n0;", "Landroidx/paging/j;", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public final class b<Key, Value> implements u1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final n0<Key, Value> pageFetcherSnapshot;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final j<k2> retryEventBus;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m0<Key, Value> f31944c;

        public b(@fg.l @androidx.annotation.m1(otherwise = 2) m0 this$0, @fg.l n0<Key, Value> pageFetcherSnapshot, j<k2> retryEventBus) {
            kotlin.jvm.internal.l0.p(this$0, "this$0");
            kotlin.jvm.internal.l0.p(pageFetcherSnapshot, "pageFetcherSnapshot");
            kotlin.jvm.internal.l0.p(retryEventBus, "retryEventBus");
            this.f31944c = this$0;
            this.pageFetcherSnapshot = pageFetcherSnapshot;
            this.retryEventBus = retryEventBus;
        }

        @Override // androidx.paging.u1
        public void a(@fg.l w1 viewportHint) {
            kotlin.jvm.internal.l0.p(viewportHint, "viewportHint");
            this.pageFetcherSnapshot.q(viewportHint);
        }

        @Override // androidx.paging.u1
        public void b() {
            this.retryEventBus.b(k2.f75408a);
        }

        @fg.l
        public final n0<Key, Value> c() {
            return this.pageFetcherSnapshot;
        }

        @Override // androidx.paging.u1
        public void refresh() {
            this.f31944c.l();
        }
    }

    /* compiled from: PageFetcher.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcher$flow$1", f = "PageFetcher.kt", i = {}, l = {233}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Landroidx/paging/n1;", "Landroidx/paging/y0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/paging/n1;)V"}, k = 3, mv = {1, 5, 1})
    static final class c extends kotlin.coroutines.jvm.internal.o implements ld.p<n1<y0<Value>>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f31945b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f31946c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f1<Key, Value> f31947d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ m0<Key, Value> f31948e;

        /* compiled from: PageFetcher.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcher$flow$1$1", f = "PageFetcher.kt", i = {}, l = {62, 62}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lkotlinx/coroutines/flow/j;", "", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 5, 1})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.flow.j<? super Boolean>, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f31949b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f31950c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ h1<Key, Value> f31951d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h1<Key, Value> h1Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f31951d = h1Var;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l kotlinx.coroutines.flow.j<? super Boolean> jVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((a) create(jVar, dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f31951d, dVar);
                aVar.f31950c = obj;
                return aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0050 A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r7) {
                /*
                    r6 = this;
                    kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r1 = r6.f31949b
                    r2 = 0
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L21
                    if (r1 == r4) goto L19
                    if (r1 != r3) goto L11
                    kotlin.a1.n(r7)
                    goto L51
                L11:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L19:
                    java.lang.Object r1 = r6.f31950c
                    kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                    kotlin.a1.n(r7)
                    goto L3a
                L21:
                    kotlin.a1.n(r7)
                    java.lang.Object r7 = r6.f31950c
                    r1 = r7
                    kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                    androidx.paging.h1<Key, Value> r7 = r6.f31951d
                    if (r7 != 0) goto L2f
                    r7 = r2
                    goto L3c
                L2f:
                    r6.f31950c = r1
                    r6.f31949b = r4
                    java.lang.Object r7 = r7.a(r6)
                    if (r7 != r0) goto L3a
                    return r0
                L3a:
                    androidx.paging.f1$a r7 = (androidx.paging.f1.a) r7
                L3c:
                    androidx.paging.f1$a r5 = androidx.paging.f1.a.LAUNCH_INITIAL_REFRESH
                    if (r7 != r5) goto L41
                    goto L42
                L41:
                    r4 = 0
                L42:
                    java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
                    r6.f31950c = r2
                    r6.f31949b = r3
                    java.lang.Object r7 = r1.emit(r7, r6)
                    if (r7 != r0) goto L51
                    return r0
                L51:
                    kotlin.k2 r7 = kotlin.k2.f75408a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.m0.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: PageFetcher.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcher$flow$1$2", f = "PageFetcher.kt", i = {0, 0, 1, 1, 1}, l = {66, 70}, m = "invokeSuspend", n = {"previousGeneration", "triggerRemoteRefresh", "previousGeneration", "pagingSource", "triggerRemoteRefresh"}, s = {"L$0", "Z$0", "L$0", "L$1", "Z$0"})
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Key", "Value", "Landroidx/paging/m0$a;", "previousGeneration", "", "triggerRemoteRefresh", "<anonymous>", "(Landroidx/paging/m0$a;Z)Landroidx/paging/m0$a;"}, k = 3, mv = {1, 5, 1})
        static final class b extends kotlin.coroutines.jvm.internal.o implements ld.q<a<Key, Value>, Boolean, kotlin.coroutines.d<? super a<Key, Value>>, Object> {

            /* renamed from: b, reason: collision with root package name */
            Object f31952b;

            /* renamed from: c, reason: collision with root package name */
            int f31953c;

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f31954d;

            /* renamed from: e, reason: collision with root package name */
            /* synthetic */ boolean f31955e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ m0<Key, Value> f31956f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ h1<Key, Value> f31957g;

            /* compiled from: PageFetcher.kt */
            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            /* synthetic */ class a extends kotlin.jvm.internal.h0 implements ld.a<k2> {
                a(Object obj) {
                    super(0, obj, m0.class, "refresh", "refresh()V", 0);
                }

                public final void Z() {
                    ((m0) this.receiver).l();
                }

                @Override // ld.a
                public /* bridge */ /* synthetic */ k2 invoke() {
                    Z();
                    return k2.f75408a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(m0<Key, Value> m0Var, h1<Key, Value> h1Var, kotlin.coroutines.d<? super b> dVar) {
                super(3, dVar);
                this.f31956f = m0Var;
                this.f31957g = h1Var;
            }

            @Override // ld.q
            public /* bridge */ /* synthetic */ Object R(Object obj, Boolean bool, Object obj2) {
                return a((a) obj, bool.booleanValue(), (kotlin.coroutines.d) obj2);
            }

            @fg.m
            public final Object a(@fg.m a<Key, Value> aVar, boolean z4, @fg.m kotlin.coroutines.d<? super a<Key, Value>> dVar) {
                b bVar = new b(this.f31956f, this.f31957g, dVar);
                bVar.f31954d = aVar;
                bVar.f31955e = z4;
                return bVar.invokeSuspend(k2.f75408a);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x008a  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x00b0  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x00b8  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x00cf  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x00d7  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x00e1  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00eb  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00d1  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0080  */
            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r18) {
                /*
                    Method dump skipped, instructions count: 284
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.m0.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: Collect.kt */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/n$a", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: androidx.paging.m0$c$c, reason: collision with other inner class name */
        public static final class C0548c implements kotlinx.coroutines.flow.j<y0<Value>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ n1 f31958b;

            public C0548c(n1 n1Var) {
                this.f31958b = n1Var;
            }

            @Override // kotlinx.coroutines.flow.j
            @fg.m
            public Object emit(y0<Value> y0Var, @fg.l kotlin.coroutines.d<? super k2> dVar) {
                Object f02 = this.f31958b.f0(y0Var, dVar);
                return f02 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? f02 : k2.f75408a;
            }
        }

        /* compiled from: FlowExt.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1", f = "PageFetcher.kt", i = {}, l = {226}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/k2;", "androidx/paging/s$c", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.flow.j<? super y0<Value>>, a<Key, Value>, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f31959b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f31960c;

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f31961d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ m0 f31962e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ h1 f31963f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(kotlin.coroutines.d dVar, m0 m0Var, h1 h1Var) {
                super(3, dVar);
                this.f31962e = m0Var;
                this.f31963f = h1Var;
            }

            @Override // ld.q
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object R(@fg.l kotlinx.coroutines.flow.j<? super y0<Value>> jVar, a<Key, Value> aVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                d dVar2 = new d(dVar, this.f31962e, this.f31963f);
                dVar2.f31960c = jVar;
                dVar2.f31961d = aVar;
                return dVar2.invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f31959b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f31960c;
                    a aVar2 = (a) this.f31961d;
                    y0 y0Var = new y0(this.f31962e.j(aVar2.b(), aVar2.getJob(), this.f31963f), new b(this.f31962e, aVar2.b(), this.f31962e.retryEvents));
                    this.f31959b = 1;
                    if (jVar.emit(y0Var, this) == aVar) {
                        return aVar;
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(f1<Key, Value> f1Var, m0<Key, Value> m0Var, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f31947d = f1Var;
            this.f31948e = m0Var;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l n1<y0<Value>> n1Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((c) create(n1Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f31947d, this.f31948e, dVar);
            cVar.f31946c = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f31945b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                n1 n1Var = (n1) this.f31946c;
                f1<Key, Value> f1Var = this.f31947d;
                h1 a5 = f1Var == null ? null : i1.a(n1Var, f1Var);
                kotlinx.coroutines.flow.i h4 = s.h(new a0.e(s.g(new t.e(new a(a5, null), ((m0) this.f31948e).refreshEvents.a()), null, new b(this.f31948e, a5, null))), new d(null, this.f31948e, a5));
                C0548c c0548c = new C0548c(n1Var);
                this.f31945b = 1;
                if (h4.a(c0548c, this) == aVar) {
                    return aVar;
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

    /* compiled from: PageFetcher.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcher", f = "PageFetcher.kt", i = {0, 0}, l = {PictureConfig.CHOOSE_REQUEST}, m = "generateNewPagingSource", n = {"this", "previousPagingSource"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f31964b;

        /* renamed from: c, reason: collision with root package name */
        Object f31965c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f31966d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ m0<Key, Value> f31967e;

        /* renamed from: f, reason: collision with root package name */
        int f31968f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(m0<Key, Value> m0Var, kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
            this.f31967e = m0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f31966d = obj;
            this.f31968f |= Integer.MIN_VALUE;
            return this.f31967e.h(null, this);
        }
    }

    /* compiled from: PageFetcher.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* synthetic */ class e extends kotlin.jvm.internal.h0 implements ld.a<k2> {
        e(Object obj) {
            super(0, obj, m0.class, "invalidate", "invalidate()V", 0);
        }

        public final void Z() {
            ((m0) this.receiver).k();
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            Z();
            return k2.f75408a;
        }
    }

    /* compiled from: PageFetcher.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* synthetic */ class f extends kotlin.jvm.internal.h0 implements ld.a<k2> {
        f(Object obj) {
            super(0, obj, m0.class, "invalidate", "invalidate()V", 0);
        }

        public final void Z() {
            ((m0) this.receiver).k();
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            Z();
            return k2.f75408a;
        }
    }

    /* compiled from: PageFetcher.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcher$injectRemoteEvents$1", f = "PageFetcher.kt", i = {}, l = {233}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Landroidx/paging/n1;", "Landroidx/paging/l0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/paging/n1;)V"}, k = 3, mv = {1, 5, 1})
    static final class g extends kotlin.coroutines.jvm.internal.o implements ld.p<n1<l0<Value>>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f31969b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f31970c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ h1<Key, Value> f31971d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ n0<Key, Value> f31972e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ j0 f31973f;

        /* compiled from: Collect.kt */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/n$a", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class a implements kotlinx.coroutines.flow.j<l0<Value>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ n1 f31974b;

            public a(n1 n1Var) {
                this.f31974b = n1Var;
            }

            @Override // kotlinx.coroutines.flow.j
            @fg.m
            public Object emit(l0<Value> l0Var, @fg.l kotlin.coroutines.d<? super k2> dVar) {
                Object f02 = this.f31974b.f0(l0Var, dVar);
                return f02 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? f02 : k2.f75408a;
            }
        }

        /* compiled from: FlowExt.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1", f = "PageFetcher.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T1", "T2", "R", "Landroidx/paging/n1;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/paging/n1;)V", "androidx/paging/s$a"}, k = 3, mv = {1, 5, 1})
        public static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<n1<l0<Value>>, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f31975b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f31976c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i f31977d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i f31978e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ j0 f31979f;

            /* compiled from: FlowExt.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$1", f = "PageFetcher.kt", i = {}, l = {222}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u008a@¨\u0006\b"}, d2 = {"T1", "T2", "R", "t1", "t2", "Landroidx/paging/h;", "updateFrom", "Lkotlin/k2;", "androidx/paging/s$a$c", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends kotlin.coroutines.jvm.internal.o implements ld.r<f0, l0<Value>, h, kotlin.coroutines.d<? super k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f31980b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f31981c;

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f31982d;

                /* renamed from: e, reason: collision with root package name */
                /* synthetic */ Object f31983e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ n1<l0<Value>> f31984f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ j0 f31985g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(n1 n1Var, kotlin.coroutines.d dVar, j0 j0Var) {
                    super(4, dVar);
                    this.f31985g = j0Var;
                    this.f31984f = n1Var;
                }

                @Override // ld.r
                @fg.m
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object i(f0 f0Var, l0<Value> l0Var, @fg.l h hVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                    a aVar = new a(this.f31984f, dVar, this.f31985g);
                    aVar.f31981c = f0Var;
                    aVar.f31982d = l0Var;
                    aVar.f31983e = hVar;
                    return aVar.invokeSuspend(k2.f75408a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f31980b;
                    if (i4 == 0) {
                        kotlin.a1.n(obj);
                        Object obj2 = this.f31981c;
                        Object obj3 = this.f31982d;
                        h hVar = (h) this.f31983e;
                        n1<l0<Value>> n1Var = this.f31984f;
                        Object obj4 = (l0) obj3;
                        f0 f0Var = (f0) obj2;
                        if (hVar == h.RECEIVER) {
                            obj4 = new l0.c(this.f31985g.j(), f0Var);
                        } else if (obj4 instanceof l0.b) {
                            l0.b bVar = (l0.b) obj4;
                            this.f31985g.e(bVar.u());
                            obj4 = l0.b.o(bVar, null, null, 0, 0, bVar.u(), f0Var, 15, null);
                        } else if (obj4 instanceof l0.a) {
                            j0 j0Var = this.f31985g;
                            g0 m4 = ((l0.a) obj4).m();
                            e0.c.INSTANCE.getClass();
                            j0Var.f(m4, e0.c.f31663d);
                        } else {
                            if (!(obj4 instanceof l0.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            l0.c cVar = (l0.c) obj4;
                            this.f31985g.e(cVar.l());
                            obj4 = new l0.c(cVar.l(), f0Var);
                        }
                        this.f31980b = 1;
                        if (n1Var.f0(obj4, this) == aVar) {
                            return aVar;
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

            /* compiled from: FlowExt.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1", f = "FlowExt.kt", i = {}, l = {222}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V", "androidx/paging/s$a$a"}, k = 3, mv = {1, 5, 1})
            /* renamed from: androidx.paging.m0$g$b$b, reason: collision with other inner class name */
            public static final class C0549b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f31986b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ n1<l0<Value>> f31987c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.flow.i f31988d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ AtomicInteger f31989e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ v1 f31990f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ int f31991g;

                /* compiled from: Collect.kt */
                @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "androidx/paging/s$a$a$a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
                /* renamed from: androidx.paging.m0$g$b$b$a */
                public static final class a implements kotlinx.coroutines.flow.j<Object> {

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ v1 f31992b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ int f31993c;

                    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$1", f = "PageFetcher.kt", i = {}, l = {135, 138}, m = "emit", n = {}, s = {})
                    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
                    /* renamed from: androidx.paging.m0$g$b$b$a$a, reason: collision with other inner class name */
                    public static final class C0550a extends kotlin.coroutines.jvm.internal.d {

                        /* renamed from: b, reason: collision with root package name */
                        /* synthetic */ Object f31994b;

                        /* renamed from: c, reason: collision with root package name */
                        int f31995c;

                        public C0550a(kotlin.coroutines.d dVar) {
                            super(dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        @fg.m
                        public final Object invokeSuspend(@fg.l Object obj) {
                            this.f31994b = obj;
                            this.f31995c |= Integer.MIN_VALUE;
                            return a.this.emit(null, this);
                        }
                    }

                    public a(v1 v1Var, int i4) {
                        this.f31992b = v1Var;
                        this.f31993c = i4;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:19:0x004e A[RETURN] */
                    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
                    @Override // kotlinx.coroutines.flow.j
                    @fg.m
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public java.lang.Object emit(java.lang.Object r6, @fg.l kotlin.coroutines.d r7) {
                        /*
                            r5 = this;
                            boolean r0 = r7 instanceof androidx.paging.m0.g.b.C0549b.a.C0550a
                            if (r0 == 0) goto L13
                            r0 = r7
                            androidx.paging.m0$g$b$b$a$a r0 = (androidx.paging.m0.g.b.C0549b.a.C0550a) r0
                            int r1 = r0.f31995c
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.f31995c = r1
                            goto L18
                        L13:
                            androidx.paging.m0$g$b$b$a$a r0 = new androidx.paging.m0$g$b$b$a$a
                            r0.<init>(r7)
                        L18:
                            java.lang.Object r7 = r0.f31994b
                            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                            int r2 = r0.f31995c
                            r3 = 2
                            r4 = 1
                            if (r2 == 0) goto L36
                            if (r2 == r4) goto L32
                            if (r2 != r3) goto L2a
                            kotlin.a1.n(r7)
                            goto L4f
                        L2a:
                            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                            r6.<init>(r7)
                            throw r6
                        L32:
                            kotlin.a1.n(r7)
                            goto L46
                        L36:
                            kotlin.a1.n(r7)
                            androidx.paging.v1 r7 = r5.f31992b
                            int r2 = r5.f31993c
                            r0.f31995c = r4
                            java.lang.Object r6 = r7.a(r2, r6, r0)
                            if (r6 != r1) goto L46
                            return r1
                        L46:
                            r0.f31995c = r3
                            java.lang.Object r6 = kotlinx.coroutines.a4.a(r0)
                            if (r6 != r1) goto L4f
                            return r1
                        L4f:
                            kotlin.k2 r6 = kotlin.k2.f75408a
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.m0.g.b.C0549b.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0549b(kotlinx.coroutines.flow.i iVar, AtomicInteger atomicInteger, n1 n1Var, v1 v1Var, int i4, kotlin.coroutines.d dVar) {
                    super(2, dVar);
                    this.f31988d = iVar;
                    this.f31989e = atomicInteger;
                    this.f31990f = v1Var;
                    this.f31991g = i4;
                    this.f31987c = n1Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    return new C0549b(this.f31988d, this.f31989e, this.f31987c, this.f31990f, this.f31991g, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    AtomicInteger atomicInteger;
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f31986b;
                    try {
                        if (i4 == 0) {
                            kotlin.a1.n(obj);
                            kotlinx.coroutines.flow.i iVar = this.f31988d;
                            a aVar2 = new a(this.f31990f, this.f31991g);
                            this.f31986b = 1;
                            if (iVar.a(aVar2, this) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.a1.n(obj);
                        }
                        if (atomicInteger.decrementAndGet() == 0) {
                            e0.a.a(this.f31987c, null, 1, null);
                        }
                        return k2.f75408a;
                    } finally {
                        if (this.f31989e.decrementAndGet() == 0) {
                            e0.a.a(this.f31987c, null, 1, null);
                        }
                    }
                }

                @Override // ld.p
                @fg.m
                public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                    return ((C0549b) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
                }
            }

            /* compiled from: FlowExt.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T1", "T2", "R", "Lkotlin/k2;", "<anonymous>", "()V", "androidx/paging/s$a$b"}, k = 3, mv = {1, 5, 1})
            public static final class c extends kotlin.jvm.internal.n0 implements ld.a<k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.b0 f31997b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(kotlinx.coroutines.b0 b0Var) {
                    super(0);
                    this.f31997b = b0Var;
                }

                public final void a() {
                    k2.a.b(this.f31997b, null, 1, null);
                }

                @Override // ld.a
                public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
                    a();
                    return kotlin.k2.f75408a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(kotlinx.coroutines.flow.i iVar, kotlinx.coroutines.flow.i iVar2, kotlin.coroutines.d dVar, j0 j0Var) {
                super(2, dVar);
                this.f31977d = iVar;
                this.f31978e = iVar2;
                this.f31979f = j0Var;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l n1<l0<Value>> n1Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((b) create(n1Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                b bVar = new b(this.f31977d, this.f31978e, dVar, this.f31979f);
                bVar.f31976c = obj;
                return bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlinx.coroutines.b0 c5;
                int i4 = 0;
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i5 = this.f31975b;
                if (i5 == 0) {
                    kotlin.a1.n(obj);
                    n1 n1Var = (n1) this.f31976c;
                    AtomicInteger atomicInteger = new AtomicInteger(2);
                    v1 v1Var = new v1(new a(n1Var, null, this.f31979f));
                    c5 = p2.c(null, 1, null);
                    kotlinx.coroutines.flow.i[] iVarArr = {this.f31977d, this.f31978e};
                    int i6 = 0;
                    while (i4 < 2) {
                        kotlinx.coroutines.k.f(n1Var, c5, null, new C0549b(iVarArr[i4], atomicInteger, n1Var, v1Var, i6, null), 2, null);
                        i4++;
                        i6++;
                        iVarArr = iVarArr;
                    }
                    c cVar = new c(c5);
                    this.f31975b = 1;
                    if (n1Var.y(cVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                }
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(h1<Key, Value> h1Var, n0<Key, Value> n0Var, j0 j0Var, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f31971d = h1Var;
            this.f31972e = n0Var;
            this.f31973f = j0Var;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l n1<l0<Value>> n1Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((g) create(n1Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            g gVar = new g(this.f31971d, this.f31972e, this.f31973f, dVar);
            gVar.f31970c = obj;
            return gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f31969b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                n1 n1Var = (n1) this.f31970c;
                kotlinx.coroutines.flow.i a5 = m1.a(new b(this.f31971d.getState(), this.f31972e.x(), null, this.f31973f));
                a aVar2 = new a(n1Var);
                this.f31969b = 1;
                if (a5.a(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m0(@fg.l ld.l<? super kotlin.coroutines.d<? super b1<Key, Value>>, ? extends Object> pagingSourceFactory, @fg.m Key key, @fg.l x0 config, @fg.m f1<Key, Value> f1Var) {
        kotlin.jvm.internal.l0.p(pagingSourceFactory, "pagingSourceFactory");
        kotlin.jvm.internal.l0.p(config, "config");
        this.pagingSourceFactory = pagingSourceFactory;
        this.initialKey = key;
        this.config = config;
        this.refreshEvents = new j<>(null, 1, null);
        this.retryEvents = new j<>(null, 1, null);
        this.flow = m1.a(new c(f1Var, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(androidx.paging.b1<Key, Value> r5, kotlin.coroutines.d<? super androidx.paging.b1<Key, Value>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.paging.m0.d
            if (r0 == 0) goto L13
            r0 = r6
            androidx.paging.m0$d r0 = (androidx.paging.m0.d) r0
            int r1 = r0.f31968f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31968f = r1
            goto L18
        L13:
            androidx.paging.m0$d r0 = new androidx.paging.m0$d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f31966d
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f31968f
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f31965c
            androidx.paging.b1 r5 = (androidx.paging.b1) r5
            java.lang.Object r0 = r0.f31964b
            androidx.paging.m0 r0 = (androidx.paging.m0) r0
            kotlin.a1.n(r6)
            goto L4a
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.a1.n(r6)
            ld.l<kotlin.coroutines.d<? super androidx.paging.b1<Key, Value>>, java.lang.Object> r6 = r4.pagingSourceFactory
            r0.f31964b = r4
            r0.f31965c = r5
            r0.f31968f = r3
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            r0 = r4
        L4a:
            androidx.paging.b1 r6 = (androidx.paging.b1) r6
            boolean r1 = r6 instanceof androidx.paging.d0
            if (r1 == 0) goto L5a
            r1 = r6
            androidx.paging.d0 r1 = (androidx.paging.d0) r1
            androidx.paging.x0 r2 = r0.config
            int r2 = r2.pageSize
            r1.l(r2)
        L5a:
            if (r6 == r5) goto L5d
            goto L5e
        L5d:
            r3 = 0
        L5e:
            if (r3 == 0) goto L7a
            androidx.paging.m0$e r1 = new androidx.paging.m0$e
            r1.<init>(r0)
            r6.h(r1)
            if (r5 != 0) goto L6b
            goto L73
        L6b:
            androidx.paging.m0$f r1 = new androidx.paging.m0$f
            r1.<init>(r0)
            r5.i(r1)
        L73:
            if (r5 != 0) goto L76
            goto L79
        L76:
            r5.f()
        L79:
            return r6
        L7a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.m0.h(androidx.paging.b1, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.coroutines.flow.i<l0<Value>> j(n0<Key, Value> n0Var, kotlinx.coroutines.k2 k2Var, h1<Key, Value> h1Var) {
        return h1Var == null ? n0Var.x() : androidx.paging.f.a(k2Var, new g(h1Var, n0Var, new j0(), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        this.refreshEvents.b(Boolean.FALSE);
    }

    @fg.l
    public final kotlinx.coroutines.flow.i<y0<Value>> i() {
        return this.flow;
    }

    public final void l() {
        this.refreshEvents.b(Boolean.TRUE);
    }

    public /* synthetic */ m0(ld.l lVar, Object obj, x0 x0Var, f1 f1Var, int i4, kotlin.jvm.internal.w wVar) {
        this(lVar, obj, x0Var, (i4 & 8) != 0 ? null : f1Var);
    }
}
