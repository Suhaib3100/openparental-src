package androidx.paging;

import androidx.constraintlayout.core.motion.utils.w;
import androidx.paging.b1;
import androidx.paging.e0;
import androidx.paging.l0;
import androidx.paging.p0;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.k2;
import kotlinx.coroutines.flow.l;
import kotlinx.coroutines.flow.t;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.p2;
import org.apache.http.HttpStatus;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: PageFetcherSnapshot.kt */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0085\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0010\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001d\u001a\u00020\n*\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010 \u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u001f0\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@ø\u0001\u0000¢\u0006\u0004\b \u0010!J'\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b$\u0010%J\u0013\u0010&\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b&\u0010'J#\u0010*\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010)\u001a\u00020(H\u0082@ø\u0001\u0000¢\u0006\u0004\b*\u0010+J+\u0010-\u001a\u00020\n*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010,2\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@ø\u0001\u0000¢\u0006\u0004\b-\u0010.J3\u00101\u001a\u00020\n*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010,2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00100\u001a\u00020/H\u0082@ø\u0001\u0000¢\u0006\u0004\b1\u00102J9\u00105\u001a\u0004\u0018\u00018\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010,2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00103\u001a\u00020\u001f2\u0006\u00104\u001a\u00020\u001fH\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\nH\u0002¢\u0006\u0004\b7\u00108J\u0015\u00109\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020\n¢\u0006\u0004\b;\u00108J\u001f\u0010<\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010H\u0086@ø\u0001\u0000¢\u0006\u0004\b<\u0010'R\u001c\u0010\u0004\u001a\u0004\u0018\u00018\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\"\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010V\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010Z\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR \u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\\0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R \u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010g\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR#\u0010k\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\\0\t8\u0006¢\u0006\f\n\u0004\bh\u0010H\u001a\u0004\bi\u0010j\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006l"}, d2 = {"Landroidx/paging/n0;", "", "Key", "Value", "initialKey", "Landroidx/paging/b1;", "pagingSource", "Landroidx/paging/x0;", "config", "Lkotlinx/coroutines/flow/i;", "Lkotlin/k2;", "retryFlow", "", "triggerRemoteRefresh", "Landroidx/paging/j1;", "remoteMediatorConnection", "Landroidx/paging/d1;", "previousPagingState", "Lkotlin/Function0;", "invalidate", "<init>", "(Ljava/lang/Object;Landroidx/paging/b1;Landroidx/paging/x0;Lkotlinx/coroutines/flow/i;ZLandroidx/paging/j1;Landroidx/paging/d1;Lld/a;)V", "Landroidx/paging/g0;", "loadType", "Landroidx/paging/w1;", "viewportHint", "D", "(Landroidx/paging/g0;Landroidx/paging/w1;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/r0;", "G", "(Lkotlinx/coroutines/r0;)V", "", "s", "(Lkotlinx/coroutines/flow/i;Landroidx/paging/g0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "key", "Landroidx/paging/b1$a;", "A", "(Landroidx/paging/g0;Ljava/lang/Object;)Landroidx/paging/b1$a;", "u", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/paging/t;", "generationalHint", "v", "(Landroidx/paging/g0;Landroidx/paging/t;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/paging/p0;", "F", "(Landroidx/paging/p0;Landroidx/paging/g0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/paging/e0$a;", "error", "E", "(Landroidx/paging/p0;Landroidx/paging/g0;Landroidx/paging/e0$a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "generationId", "presentedItemsBeyondAnchor", "B", "(Landroidx/paging/p0;Landroidx/paging/g0;II)Ljava/lang/Object;", "C", "()V", "q", "(Landroidx/paging/w1;)V", "r", "t", "a", "Ljava/lang/Object;", "w", "()Ljava/lang/Object;", "b", "Landroidx/paging/b1;", "y", "()Landroidx/paging/b1;", "c", "Landroidx/paging/x0;", "d", "Lkotlinx/coroutines/flow/i;", "e", "Z", "f", "Landroidx/paging/j1;", "z", "()Landroidx/paging/j1;", "g", "Landroidx/paging/d1;", "h", "Lld/a;", "Landroidx/paging/u;", "i", "Landroidx/paging/u;", "hintHandler", "Ljava/util/concurrent/atomic/AtomicBoolean;", "j", "Ljava/util/concurrent/atomic/AtomicBoolean;", "pageEventChCollected", "Lkotlinx/coroutines/channels/l;", "Landroidx/paging/l0;", "k", "Lkotlinx/coroutines/channels/l;", "pageEventCh", "Landroidx/paging/p0$a;", "l", "Landroidx/paging/p0$a;", "stateHolder", "Lkotlinx/coroutines/b0;", "m", "Lkotlinx/coroutines/b0;", "pageEventChannelFlowJob", "n", "x", "()Lkotlinx/coroutines/flow/i;", "pageEventFlow", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class n0<Key, Value> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Key initialKey;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b1<Key, Value> pagingSource;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final x0 config;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.flow.i<k2> retryFlow;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean triggerRemoteRefresh;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final j1<Key, Value> remoteMediatorConnection;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final d1<Key, Value> previousPagingState;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<k2> invalidate;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final u hintHandler;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final AtomicBoolean pageEventChCollected;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.channels.l<l0<Value>> pageEventCh;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final p0.a<Key, Value> stateHolder;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.b0 pageEventChannelFlowJob;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.flow.i<l0<Value>> pageEventFlow;

    /* compiled from: PageFetcherSnapshot.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Key", "Value", "Lkotlin/k2;", "<anonymous>", "()V"}, k = 3, mv = {1, 5, 1})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f32041b = new a(0);

        a() {
            super(0);
        }

        public final void a() {
        }

        @Override // ld.a
        public k2 invoke() {
            return k2.f75408a;
        }
    }

    /* compiled from: PageFetcherSnapshot.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32042a;

        static {
            int[] iArr = new int[g0.values().length];
            iArr[g0.REFRESH.ordinal()] = 1;
            iArr[g0.PREPEND.ordinal()] = 2;
            iArr[g0.APPEND.ordinal()] = 3;
            f32042a = iArr;
        }
    }

    /* compiled from: Collect.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/n$a", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c implements kotlinx.coroutines.flow.j<t> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g0 f32044c;

        public c(g0 g0Var) {
            this.f32044c = g0Var;
        }

        @Override // kotlinx.coroutines.flow.j
        @fg.m
        public Object emit(t tVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            Object v4 = n0.this.v(this.f32044c, tVar, dVar);
            return v4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? v4 : k2.f75408a;
        }
    }

    /* compiled from: FlowExt.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1", f = "PageFetcherSnapshot.kt", i = {0, 0, 0}, l = {229, 244}, m = "invokeSuspend", n = {"this_$iv", "$this$withLock_u24default$iv$iv", "generationId"}, s = {"L$1", "L$2", "I$0"})
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/k2;", "androidx/paging/s$b", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.flow.j<? super t>, Integer, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f32045b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f32046c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f32047d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ n0 f32048e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ g0 f32049f;

        /* renamed from: g, reason: collision with root package name */
        Object f32050g;

        /* renamed from: h, reason: collision with root package name */
        int f32051h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kotlin.coroutines.d dVar, n0 n0Var, g0 g0Var) {
            super(3, dVar);
            this.f32048e = n0Var;
            this.f32049f = g0Var;
        }

        @Override // ld.q
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object R(@fg.l kotlinx.coroutines.flow.j<? super t> jVar, Integer num, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            d dVar2 = new d(dVar, this.f32048e, this.f32049f);
            dVar2.f32046c = jVar;
            dVar2.f32047d = num;
            return dVar2.invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlinx.coroutines.flow.j jVar;
            int intValue;
            p0.a aVar;
            kotlinx.coroutines.sync.a aVar2;
            p0 p0Var;
            kotlinx.coroutines.flow.i fVar;
            kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f32045b;
            try {
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    jVar = (kotlinx.coroutines.flow.j) this.f32046c;
                    intValue = ((Number) this.f32047d).intValue();
                    aVar = this.f32048e.stateHolder;
                    aVar2 = aVar.lock;
                    this.f32046c = jVar;
                    this.f32047d = aVar;
                    this.f32050g = aVar2;
                    this.f32051h = intValue;
                    this.f32045b = 1;
                    if (aVar2.f(null, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a1.n(obj);
                        return k2.f75408a;
                    }
                    intValue = this.f32051h;
                    aVar2 = (kotlinx.coroutines.sync.a) this.f32050g;
                    aVar = (p0.a) this.f32047d;
                    jVar = (kotlinx.coroutines.flow.j) this.f32046c;
                    kotlin.a1.n(obj);
                }
                p0Var = aVar.state;
                e0 a5 = p0Var.getSourceLoadStates().a(this.f32049f);
                e0.c.Companion companion = e0.c.INSTANCE;
                companion.getClass();
                if (kotlin.jvm.internal.l0.g(a5, e0.c.f31662c)) {
                    fVar = new l.k(new t[0]);
                } else {
                    if (!(p0Var.getSourceLoadStates().a(this.f32049f) instanceof e0.a)) {
                        j0 sourceLoadStates = p0Var.getSourceLoadStates();
                        g0 g0Var = this.f32049f;
                        companion.getClass();
                        sourceLoadStates.f(g0Var, e0.c.f31663d);
                    }
                    k2 k2Var = k2.f75408a;
                    aVar2.g(null);
                    fVar = new f(kotlinx.coroutines.flow.k.j0(this.f32048e.hintHandler.c(this.f32049f), intValue == 0 ? 0 : 1), intValue);
                }
                this.f32046c = null;
                this.f32047d = null;
                this.f32050g = null;
                this.f32045b = 2;
                if (kotlinx.coroutines.flow.k.m0(jVar, fVar, this) == aVar3) {
                    return aVar3;
                }
                return k2.f75408a;
            } finally {
                aVar2.g(null);
            }
        }
    }

    /* compiled from: PageFetcherSnapshot.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$3", f = "PageFetcherSnapshot.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Landroidx/paging/t;", "previous", "next", "<anonymous>", "(Landroidx/paging/t;Landroidx/paging/t;)Landroidx/paging/t;"}, k = 3, mv = {1, 5, 1})
    static final class e extends kotlin.coroutines.jvm.internal.o implements ld.q<t, t, kotlin.coroutines.d<? super t>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f32052b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f32053c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f32054d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ g0 f32055e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(g0 g0Var, kotlin.coroutines.d<? super e> dVar) {
            super(3, dVar);
            this.f32055e = g0Var;
        }

        @Override // ld.q
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object R(@fg.l t tVar, @fg.l t tVar2, @fg.m kotlin.coroutines.d<? super t> dVar) {
            e eVar = new e(this.f32055e, dVar);
            eVar.f32053c = tVar;
            eVar.f32054d = tVar2;
            return eVar.invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f32052b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            t tVar = (t) this.f32053c;
            t tVar2 = (t) this.f32054d;
            return o0.a(tVar2, tVar, this.f32055e) ? tVar2 : tVar;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$f", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class f implements kotlinx.coroutines.flow.i<t> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f32056b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f32057c;

        /* compiled from: Collect.kt */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$f$b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class a implements kotlinx.coroutines.flow.j<w1> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f32058b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f32059c;

            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda-6$$inlined$map$1$2", f = "PageFetcherSnapshot.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            /* renamed from: androidx.paging.n0$f$a$a, reason: collision with other inner class name */
            public static final class C0555a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f32060b;

                /* renamed from: c, reason: collision with root package name */
                int f32061c;

                /* renamed from: d, reason: collision with root package name */
                Object f32062d;

                public C0555a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    this.f32060b = obj;
                    this.f32061c |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.j jVar, int i4) {
                this.f32058b = jVar;
                this.f32059c = i4;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // kotlinx.coroutines.flow.j
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object emit(androidx.paging.w1 r6, @fg.l kotlin.coroutines.d r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof androidx.paging.n0.f.a.C0555a
                    if (r0 == 0) goto L13
                    r0 = r7
                    androidx.paging.n0$f$a$a r0 = (androidx.paging.n0.f.a.C0555a) r0
                    int r1 = r0.f32061c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f32061c = r1
                    goto L18
                L13:
                    androidx.paging.n0$f$a$a r0 = new androidx.paging.n0$f$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f32060b
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r2 = r0.f32061c
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    kotlin.a1.n(r7)
                    goto L46
                L27:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L2f:
                    kotlin.a1.n(r7)
                    kotlinx.coroutines.flow.j r7 = r5.f32058b
                    androidx.paging.w1 r6 = (androidx.paging.w1) r6
                    androidx.paging.t r2 = new androidx.paging.t
                    int r4 = r5.f32059c
                    r2.<init>(r4, r6)
                    r0.f32061c = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L46
                    return r1
                L46:
                    kotlin.k2 r6 = kotlin.k2.f75408a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.n0.f.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public f(kotlinx.coroutines.flow.i iVar, int i4) {
            this.f32056b = iVar;
            this.f32057c = i4;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l kotlinx.coroutines.flow.j<? super t> jVar, @fg.l kotlin.coroutines.d dVar) {
            Object a5 = this.f32056b.a(new a(jVar, this.f32057c), dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
        }
    }

    /* compiled from: PageFetcherSnapshot.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", i = {0, 0, 0}, l = {w.e.f22500x}, m = "currentPagingState", n = {"this", "this_$iv", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1", "L$2"})
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f32064b;

        /* renamed from: c, reason: collision with root package name */
        Object f32065c;

        /* renamed from: d, reason: collision with root package name */
        Object f32066d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f32067e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ n0<Key, Value> f32068f;

        /* renamed from: g, reason: collision with root package name */
        int f32069g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(n0<Key, Value> n0Var, kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
            this.f32068f = n0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f32067e = obj;
            this.f32069g |= Integer.MIN_VALUE;
            return this.f32068f.t(this);
        }
    }

    /* compiled from: PageFetcherSnapshot.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", i = {0, 0, 0, 1, 1, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8}, l = {w.e.f22500x, 280, 283, 619, 630, w.a.f22420r, 641, 652, 341}, m = "doInitialLoad", n = {"this", "this_$iv", "$this$withLock_u24default$iv$iv", "this", "$this$withLock_u24default$iv$iv", "this", "this", "result", "this_$iv", "$this$withLock_u24default$iv$iv", "this", "result", "this_$iv", "$this$withLock_u24default$iv$iv", "this", "result", "$this$withLock_u24default$iv$iv", "this", "result", "this_$iv", "$this$withLock_u24default$iv$iv", "this", "result", "this_$iv", "$this$withLock_u24default$iv$iv", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0"})
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f32070b;

        /* renamed from: c, reason: collision with root package name */
        Object f32071c;

        /* renamed from: d, reason: collision with root package name */
        Object f32072d;

        /* renamed from: e, reason: collision with root package name */
        Object f32073e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f32074f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ n0<Key, Value> f32075g;

        /* renamed from: h, reason: collision with root package name */
        int f32076h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(n0<Key, Value> n0Var, kotlin.coroutines.d<? super h> dVar) {
            super(dVar);
            this.f32075g = n0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f32074f = obj;
            this.f32076h |= Integer.MIN_VALUE;
            return this.f32075g.u(this);
        }
    }

    /* compiled from: PageFetcherSnapshot.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, l = {w.e.f22501y, 620, 398, HttpStatus.SC_NOT_ACCEPTABLE, 631, 642, net.minidev.json.parser.f.f81763q, 653, 470, 496, 664}, m = "doLoad", n = {"this", "loadType", "generationalHint", "itemsLoaded", "this_$iv", "$this$withLock_u24default$iv$iv", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "this_$iv", "$this$withLock_u24default$iv$iv", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "$this$withLock_u24default$iv$iv", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "endOfPaginationReached", "params", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "endOfPaginationReached", "params", "result", "this_$iv", "$this$withLock_u24default$iv$iv", "this", "loadType", "generationalHint", "result", "this_$iv", "$this$withLock_u24default$iv$iv", "loadType", "generationalHint", "$this$withLock_u24default$iv$iv", "state", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "endOfPaginationReached", "params", "result", "dropType", "this_$iv", "$this$withLock_u24default$iv$iv", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "endOfPaginationReached", "params", "result", "$this$withLock_u24default$iv$iv", "state", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "endOfPaginationReached", "params", "result", "$this$withLock_u24default$iv$iv", "this", "loadType", "generationalHint", "itemsLoaded", "loadKey", "endOfPaginationReached", "this_$iv", "$this$withLock_u24default$iv$iv", "endsPrepend", "endsAppend"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1"})
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f32077b;

        /* renamed from: c, reason: collision with root package name */
        Object f32078c;

        /* renamed from: d, reason: collision with root package name */
        Object f32079d;

        /* renamed from: e, reason: collision with root package name */
        Object f32080e;

        /* renamed from: f, reason: collision with root package name */
        Object f32081f;

        /* renamed from: g, reason: collision with root package name */
        Object f32082g;

        /* renamed from: h, reason: collision with root package name */
        Object f32083h;

        /* renamed from: i, reason: collision with root package name */
        Object f32084i;

        /* renamed from: j, reason: collision with root package name */
        Object f32085j;

        /* renamed from: k, reason: collision with root package name */
        Object f32086k;

        /* renamed from: l, reason: collision with root package name */
        Object f32087l;

        /* renamed from: m, reason: collision with root package name */
        int f32088m;

        /* renamed from: n, reason: collision with root package name */
        int f32089n;

        /* renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f32090o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ n0<Key, Value> f32091p;

        /* renamed from: q, reason: collision with root package name */
        int f32092q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(n0<Key, Value> n0Var, kotlin.coroutines.d<? super i> dVar) {
            super(dVar);
            this.f32091p = n0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f32090o = obj;
            this.f32092q |= Integer.MIN_VALUE;
            return this.f32091p.v(null, null, this);
        }
    }

    /* compiled from: PageFetcherSnapshot.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1", f = "PageFetcherSnapshot.kt", i = {0, 0, 0, 0, 1, 2, 2, 2}, l = {w.e.f22500x, 163, 619}, m = "invokeSuspend", n = {"$this$cancelableChannelFlow", "it", "this_$iv", "$this$withLock_u24default$iv$iv", "$this$cancelableChannelFlow", "$this$cancelableChannelFlow", "this_$iv", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$0", "L$1", "L$2"})
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Landroidx/paging/n1;", "Landroidx/paging/l0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/paging/n1;)V"}, k = 3, mv = {1, 5, 1})
    static final class j extends kotlin.coroutines.jvm.internal.o implements ld.p<n1<l0<Value>>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f32093b;

        /* renamed from: c, reason: collision with root package name */
        Object f32094c;

        /* renamed from: d, reason: collision with root package name */
        Object f32095d;

        /* renamed from: e, reason: collision with root package name */
        int f32096e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f32097f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ n0<Key, Value> f32098g;

        /* compiled from: PageFetcherSnapshot.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2", f = "PageFetcherSnapshot.kt", i = {}, l = {w.e.f22494r}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 5, 1})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f32099b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ n0<Key, Value> f32100c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ n1<l0<Value>> f32101d;

            /* compiled from: Collect.kt */
            @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/n$a", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
            /* renamed from: androidx.paging.n0$j$a$a, reason: collision with other inner class name */
            public static final class C0556a implements kotlinx.coroutines.flow.j<l0<Value>> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ n1 f32102b;

                @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$invokeSuspend$$inlined$collect$1", f = "PageFetcherSnapshot.kt", i = {}, l = {SyslogAppender.LOG_LOCAL1}, m = "emit", n = {}, s = {})
                @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
                /* renamed from: androidx.paging.n0$j$a$a$a, reason: collision with other inner class name */
                public static final class C0557a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f32103b;

                    /* renamed from: c, reason: collision with root package name */
                    int f32104c;

                    public C0557a(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.m
                    public final Object invokeSuspend(@fg.l Object obj) {
                        this.f32103b = obj;
                        this.f32104c |= Integer.MIN_VALUE;
                        return C0556a.this.emit(null, this);
                    }
                }

                public C0556a(n1 n1Var) {
                    this.f32102b = n1Var;
                }

                /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
                /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
                @Override // kotlinx.coroutines.flow.j
                @fg.m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public java.lang.Object emit(androidx.paging.l0<Value> r5, @fg.l kotlin.coroutines.d<? super kotlin.k2> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.paging.n0.j.a.C0556a.C0557a
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.paging.n0$j$a$a$a r0 = (androidx.paging.n0.j.a.C0556a.C0557a) r0
                        int r1 = r0.f32104c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f32104c = r1
                        goto L18
                    L13:
                        androidx.paging.n0$j$a$a$a r0 = new androidx.paging.n0$j$a$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f32103b
                        kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                        int r2 = r0.f32104c
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        kotlin.a1.n(r6)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L3f
                        goto L3f
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        kotlin.a1.n(r6)
                        androidx.paging.l0 r5 = (androidx.paging.l0) r5
                        androidx.paging.n1 r6 = r4.f32102b     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L3f
                        r0.f32104c = r3     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L3f
                        java.lang.Object r5 = r6.f0(r5, r0)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L3f
                        if (r5 != r1) goto L3f
                        return r1
                    L3f:
                        kotlin.k2 r5 = kotlin.k2.f75408a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.n0.j.a.C0556a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n0<Key, Value> n0Var, n1<l0<Value>> n1Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f32100c = n0Var;
                this.f32101d = n1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f32100c, this.f32101d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f32099b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    kotlinx.coroutines.flow.i X = kotlinx.coroutines.flow.k.X(((n0) this.f32100c).pageEventCh);
                    C0556a c0556a = new C0556a(this.f32101d);
                    this.f32099b = 1;
                    if (X.a(c0556a, this) == aVar) {
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

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        /* compiled from: PageFetcherSnapshot.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3", f = "PageFetcherSnapshot.kt", i = {}, l = {w.e.f22494r}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 5, 1})
        static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f32106b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ n0<Key, Value> f32107c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.channels.l<k2> f32108d;

            /* compiled from: Collect.kt */
            @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/n$a", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
            public static final class a implements kotlinx.coroutines.flow.j<k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.channels.l f32109b;

                public a(kotlinx.coroutines.channels.l lVar) {
                    this.f32109b = lVar;
                }

                @Override // kotlinx.coroutines.flow.j
                @fg.m
                public Object emit(k2 k2Var, @fg.l kotlin.coroutines.d<? super k2> dVar) {
                    Object M = this.f32109b.M(k2Var);
                    return M == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? M : k2.f75408a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(n0<Key, Value> n0Var, kotlinx.coroutines.channels.l<k2> lVar, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f32107c = n0Var;
                this.f32108d = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new b(this.f32107c, this.f32108d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f32106b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    kotlinx.coroutines.flow.i iVar = ((n0) this.f32107c).retryFlow;
                    a aVar2 = new a(this.f32108d);
                    this.f32106b = 1;
                    if (iVar.a(aVar2, this) == aVar) {
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

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((b) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        /* compiled from: PageFetcherSnapshot.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4", f = "PageFetcherSnapshot.kt", i = {}, l = {w.e.f22494r}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 5, 1})
        static final class c extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f32110b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f32111c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.channels.l<k2> f32112d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ n0<Key, Value> f32113e;

            /* compiled from: PageFetcherSnapshot.kt */
            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            public /* synthetic */ class a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f32114a;

                static {
                    int[] iArr = new int[g0.values().length];
                    iArr[g0.REFRESH.ordinal()] = 1;
                    f32114a = iArr;
                }
            }

            /* compiled from: Collect.kt */
            @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/n$a", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
            public static final class b implements kotlinx.coroutines.flow.j<k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ n0 f32115b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.r0 f32116c;

                @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1", f = "PageFetcherSnapshot.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 13, 13, 13, 13, 14, 14, 15, 15, 15}, l = {142, 164, 157, 181, 169, 195, 213, 157, 224, 169, 235, 247, 157, 258, 169, 269}, m = "emit", n = {"this", "this_$iv", "$this$withLock_u24default$iv$iv", "this", "this_$iv", "loadType", "this_$iv", "$this$withLock_u24default$iv$iv", "this", "this_$iv", "loadType", "$this$withLock_u24default$iv$iv", "this", "this_$iv", "loadType", "this_$iv", "$this$withLock_u24default$iv$iv", "this", "this_$iv", "loadType", "this", "this_$iv", "this_$iv", "$this$withLock_u24default$iv$iv", "this", "this_$iv", "loadType", "this_$iv", "$this$withLock_u24default$iv$iv", "this", "this_$iv", "loadType", "$this$withLock_u24default$iv$iv", "this", "this_$iv", "loadType", "this_$iv", "$this$withLock_u24default$iv$iv", "this", "this_$iv", "loadType", "this", "this_$iv", "this_$iv", "$this$withLock_u24default$iv$iv", "this", "loadType", "this_$iv", "$this$withLock_u24default$iv$iv", "this", "loadType", "$this$withLock_u24default$iv$iv", "this", "loadType", "this_$iv", "$this$withLock_u24default$iv$iv", "this", "loadType", "this", "this_$iv", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$0", "L$1", "L$2"})
                @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
                public static final class a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f32117b;

                    /* renamed from: c, reason: collision with root package name */
                    int f32118c;

                    /* renamed from: e, reason: collision with root package name */
                    Object f32120e;

                    /* renamed from: f, reason: collision with root package name */
                    Object f32121f;

                    /* renamed from: g, reason: collision with root package name */
                    Object f32122g;

                    /* renamed from: h, reason: collision with root package name */
                    Object f32123h;

                    /* renamed from: i, reason: collision with root package name */
                    Object f32124i;

                    /* renamed from: j, reason: collision with root package name */
                    Object f32125j;

                    /* renamed from: k, reason: collision with root package name */
                    Object f32126k;

                    public a(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.m
                    public final Object invokeSuspend(@fg.l Object obj) {
                        this.f32117b = obj;
                        this.f32118c |= Integer.MIN_VALUE;
                        return b.this.emit(null, this);
                    }
                }

                public b(n0 n0Var, kotlinx.coroutines.r0 r0Var) {
                    this.f32115b = n0Var;
                    this.f32116c = r0Var;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:104:0x0338  */
                /* JADX WARN: Removed duplicated region for block: B:105:0x033d  */
                /* JADX WARN: Removed duplicated region for block: B:110:0x00f2  */
                /* JADX WARN: Removed duplicated region for block: B:113:0x031b A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:114:0x031c  */
                /* JADX WARN: Removed duplicated region for block: B:115:0x010e  */
                /* JADX WARN: Removed duplicated region for block: B:120:0x02c0  */
                /* JADX WARN: Removed duplicated region for block: B:124:0x02db  */
                /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
                /* JADX WARN: Removed duplicated region for block: B:135:0x0123  */
                /* JADX WARN: Removed duplicated region for block: B:138:0x028f  */
                /* JADX WARN: Removed duplicated region for block: B:141:0x0136  */
                /* JADX WARN: Removed duplicated region for block: B:147:0x0288 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:148:0x0289  */
                /* JADX WARN: Removed duplicated region for block: B:153:0x0157  */
                /* JADX WARN: Removed duplicated region for block: B:159:0x0234  */
                /* JADX WARN: Removed duplicated region for block: B:160:0x0239  */
                /* JADX WARN: Removed duplicated region for block: B:165:0x016d  */
                /* JADX WARN: Removed duplicated region for block: B:170:0x01ae  */
                /* JADX WARN: Removed duplicated region for block: B:175:0x0214  */
                /* JADX WARN: Removed duplicated region for block: B:178:0x0225  */
                /* JADX WARN: Removed duplicated region for block: B:17:0x04c1  */
                /* JADX WARN: Removed duplicated region for block: B:183:0x01be  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x048e  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x0488 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:38:0x0489  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x0066  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x0436  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x043b  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x007a  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x041b A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:60:0x041c  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x0091  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x03c7  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x03e2  */
                /* JADX WARN: Removed duplicated region for block: B:80:0x00a6  */
                /* JADX WARN: Removed duplicated region for block: B:83:0x0395  */
                /* JADX WARN: Removed duplicated region for block: B:86:0x00b9  */
                /* JADX WARN: Removed duplicated region for block: B:92:0x038e A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:93:0x038f  */
                /* JADX WARN: Removed duplicated region for block: B:98:0x00da  */
                /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
                /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.k2] */
                /* JADX WARN: Type inference failed for: r12v1, types: [kotlinx.coroutines.sync.a] */
                /* JADX WARN: Type inference failed for: r12v100 */
                /* JADX WARN: Type inference failed for: r12v101 */
                /* JADX WARN: Type inference failed for: r12v103 */
                /* JADX WARN: Type inference failed for: r12v104 */
                /* JADX WARN: Type inference failed for: r12v16, types: [kotlinx.coroutines.sync.a] */
                /* JADX WARN: Type inference failed for: r12v2, types: [kotlinx.coroutines.sync.a] */
                /* JADX WARN: Type inference failed for: r12v3, types: [kotlinx.coroutines.sync.a] */
                /* JADX WARN: Type inference failed for: r12v43, types: [kotlinx.coroutines.sync.a] */
                /* JADX WARN: Type inference failed for: r12v74, types: [kotlinx.coroutines.sync.a] */
                /* JADX WARN: Type inference failed for: r12v96 */
                /* JADX WARN: Type inference failed for: r12v97 */
                @Override // kotlinx.coroutines.flow.j
                @fg.m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public java.lang.Object emit(kotlin.k2 r12, @fg.l kotlin.coroutines.d<? super kotlin.k2> r13) {
                    /*
                        Method dump skipped, instructions count: 1292
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.n0.j.c.b.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(kotlinx.coroutines.channels.l<k2> lVar, n0<Key, Value> n0Var, kotlin.coroutines.d<? super c> dVar) {
                super(2, dVar);
                this.f32112d = lVar;
                this.f32113e = n0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                c cVar = new c(this.f32112d, this.f32113e, dVar);
                cVar.f32111c = obj;
                return cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f32110b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f32111c;
                    kotlinx.coroutines.flow.i X = kotlinx.coroutines.flow.k.X(this.f32112d);
                    b bVar = new b(this.f32113e, r0Var);
                    this.f32110b = 1;
                    if (X.a(bVar, this) == aVar) {
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

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((c) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(n0<Key, Value> n0Var, kotlin.coroutines.d<? super j> dVar) {
            super(2, dVar);
            this.f32098g = n0Var;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l n1<l0<Value>> n1Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((j) create(n1Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            j jVar = new j(this.f32098g, dVar);
            jVar.f32097f = obj;
            return jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0117  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00ff A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00e6 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 300
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.n0.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: PageFetcherSnapshot.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$2", f = "PageFetcherSnapshot.kt", i = {0, 0}, l = {w.e.f22500x, 174}, m = "invokeSuspend", n = {"this_$iv", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1"})
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lkotlinx/coroutines/flow/j;", "Landroidx/paging/l0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 5, 1})
    static final class k extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.flow.j<? super l0<Value>>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f32127b;

        /* renamed from: c, reason: collision with root package name */
        Object f32128c;

        /* renamed from: d, reason: collision with root package name */
        int f32129d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f32130e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ n0<Key, Value> f32131f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(n0<Key, Value> n0Var, kotlin.coroutines.d<? super k> dVar) {
            super(2, dVar);
            this.f32131f = n0Var;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.flow.j<? super l0<Value>> jVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((k) create(jVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            k kVar = new k(this.f32131f, dVar);
            kVar.f32130e = obj;
            return kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlinx.coroutines.flow.j jVar;
            p0.a aVar;
            kotlinx.coroutines.sync.a aVar2;
            kotlinx.coroutines.sync.a aVar3;
            p0 p0Var;
            kotlin.coroutines.intrinsics.a aVar4 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f32129d;
            try {
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    jVar = (kotlinx.coroutines.flow.j) this.f32130e;
                    aVar = ((n0) this.f32131f).stateHolder;
                    aVar2 = aVar.lock;
                    this.f32130e = aVar;
                    this.f32127b = aVar2;
                    this.f32128c = jVar;
                    this.f32129d = 1;
                    if (aVar2.f(null, this) == aVar4) {
                        return aVar4;
                    }
                    aVar3 = aVar2;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a1.n(obj);
                        return k2.f75408a;
                    }
                    jVar = (kotlinx.coroutines.flow.j) this.f32128c;
                    aVar3 = (kotlinx.coroutines.sync.a) this.f32127b;
                    aVar = (p0.a) this.f32130e;
                    kotlin.a1.n(obj);
                }
                p0Var = aVar.state;
                f0 j4 = p0Var.getSourceLoadStates().j();
                aVar3.g(null);
                l0.c cVar = new l0.c(j4, null, 2, null);
                this.f32130e = null;
                this.f32127b = null;
                this.f32128c = null;
                this.f32129d = 2;
                if (jVar.emit(cVar, this) == aVar4) {
                    return aVar4;
                }
                return k2.f75408a;
            } catch (Throwable th) {
                aVar3.g(null);
                throw th;
            }
        }
    }

    /* compiled from: PageFetcherSnapshot.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1$1", f = "PageFetcherSnapshot.kt", i = {}, l = {222}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 5, 1})
    static final class l extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f32132b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n0<Key, Value> f32133c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ g0 f32134d;

        /* compiled from: PageFetcherSnapshot.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1$1$2", f = "PageFetcherSnapshot.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Landroidx/paging/w1;", "it", "Lkotlin/k2;", "<anonymous>", "(Landroidx/paging/w1;)V"}, k = 3, mv = {1, 5, 1})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<w1, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f32135b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ n0<Key, Value> f32136c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n0<Key, Value> n0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f32136c = n0Var;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l w1 w1Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((a) create(w1Var, dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f32136c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                if (this.f32135b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
                ((n0) this.f32136c).invalidate.invoke();
                return k2.f75408a;
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class b implements kotlinx.coroutines.flow.i<w1> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i f32137b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ n0 f32138c;

            /* compiled from: Collect.kt */
            @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$a$b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
            public static final class a implements kotlinx.coroutines.flow.j<w1> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.flow.j f32139b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ n0 f32140c;

                @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1$1$invokeSuspend$$inlined$filter$1$2", f = "PageFetcherSnapshot.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
                @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
                /* renamed from: androidx.paging.n0$l$b$a$a, reason: collision with other inner class name */
                public static final class C0558a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f32141b;

                    /* renamed from: c, reason: collision with root package name */
                    int f32142c;

                    /* renamed from: d, reason: collision with root package name */
                    Object f32143d;

                    /* renamed from: e, reason: collision with root package name */
                    Object f32144e;

                    public C0558a(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.m
                    public final Object invokeSuspend(@fg.l Object obj) {
                        this.f32141b = obj;
                        this.f32142c |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(kotlinx.coroutines.flow.j jVar, n0 n0Var) {
                    this.f32139b = jVar;
                    this.f32140c = n0Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // kotlinx.coroutines.flow.j
                @fg.m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public java.lang.Object emit(androidx.paging.w1 r7, @fg.l kotlin.coroutines.d r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof androidx.paging.n0.l.b.a.C0558a
                        if (r0 == 0) goto L13
                        r0 = r8
                        androidx.paging.n0$l$b$a$a r0 = (androidx.paging.n0.l.b.a.C0558a) r0
                        int r1 = r0.f32142c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f32142c = r1
                        goto L18
                    L13:
                        androidx.paging.n0$l$b$a$a r0 = new androidx.paging.n0$l$b$a$a
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.f32141b
                        kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                        int r2 = r0.f32142c
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        kotlin.a1.n(r8)
                        goto L60
                    L27:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L2f:
                        kotlin.a1.n(r8)
                        kotlinx.coroutines.flow.j r8 = r6.f32139b
                        r2 = r7
                        androidx.paging.w1 r2 = (androidx.paging.w1) r2
                        int r4 = r2.getPresentedItemsBefore()
                        int r4 = r4 * (-1)
                        androidx.paging.n0 r5 = r6.f32140c
                        androidx.paging.x0 r5 = androidx.paging.n0.d(r5)
                        int r5 = r5.jumpThreshold
                        if (r4 > r5) goto L57
                        int r2 = r2.getPresentedItemsAfter()
                        int r2 = r2 * (-1)
                        androidx.paging.n0 r4 = r6.f32140c
                        androidx.paging.x0 r4 = androidx.paging.n0.d(r4)
                        int r4 = r4.jumpThreshold
                        if (r2 <= r4) goto L60
                    L57:
                        r0.f32142c = r3
                        java.lang.Object r7 = r8.emit(r7, r0)
                        if (r7 != r1) goto L60
                        return r1
                    L60:
                        kotlin.k2 r7 = kotlin.k2.f75408a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.n0.l.b.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                }
            }

            public b(kotlinx.coroutines.flow.i iVar, n0 n0Var) {
                this.f32137b = iVar;
                this.f32138c = n0Var;
            }

            @Override // kotlinx.coroutines.flow.i
            @fg.m
            public Object a(@fg.l kotlinx.coroutines.flow.j<? super w1> jVar, @fg.l kotlin.coroutines.d dVar) {
                Object a5 = this.f32137b.a(new a(jVar, this.f32138c), dVar);
                return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(n0<Key, Value> n0Var, g0 g0Var, kotlin.coroutines.d<? super l> dVar) {
            super(2, dVar);
            this.f32133c = n0Var;
            this.f32134d = g0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new l(this.f32133c, this.f32134d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f32132b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                b bVar = new b(((n0) this.f32133c).hintHandler.c(this.f32134d), this.f32133c);
                a aVar2 = new a(this.f32133c, null);
                this.f32132b = 1;
                if (kotlinx.coroutines.flow.k.A(bVar, aVar2, this) == aVar) {
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

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((l) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: PageFetcherSnapshot.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$2", f = "PageFetcherSnapshot.kt", i = {0, 0}, l = {w.e.f22500x, 229}, m = "invokeSuspend", n = {"this_$iv", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1"})
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 5, 1})
    static final class m extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f32146b;

        /* renamed from: c, reason: collision with root package name */
        Object f32147c;

        /* renamed from: d, reason: collision with root package name */
        Object f32148d;

        /* renamed from: e, reason: collision with root package name */
        int f32149e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ n0<Key, Value> f32150f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(n0<Key, Value> n0Var, kotlin.coroutines.d<? super m> dVar) {
            super(2, dVar);
            this.f32150f = n0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new m(this.f32150f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            n0<Key, Value> n0Var;
            p0.a aVar;
            kotlinx.coroutines.sync.a aVar2;
            kotlinx.coroutines.sync.a aVar3;
            p0 p0Var;
            kotlin.coroutines.intrinsics.a aVar4 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f32149e;
            try {
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    n0Var = this.f32150f;
                    aVar = ((n0) n0Var).stateHolder;
                    aVar2 = aVar.lock;
                    this.f32146b = aVar;
                    this.f32147c = aVar2;
                    this.f32148d = n0Var;
                    this.f32149e = 1;
                    if (aVar2.f(null, this) == aVar4) {
                        return aVar4;
                    }
                    aVar3 = aVar2;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a1.n(obj);
                        return k2.f75408a;
                    }
                    n0Var = (n0) this.f32148d;
                    aVar3 = (kotlinx.coroutines.sync.a) this.f32147c;
                    aVar = (p0.a) this.f32146b;
                    kotlin.a1.n(obj);
                }
                p0Var = aVar.state;
                kotlinx.coroutines.flow.i<Integer> f4 = p0Var.f();
                aVar3.g(null);
                g0 g0Var = g0.PREPEND;
                this.f32146b = null;
                this.f32147c = null;
                this.f32148d = null;
                this.f32149e = 2;
                if (n0Var.s(f4, g0Var, this) == aVar4) {
                    return aVar4;
                }
                return k2.f75408a;
            } catch (Throwable th) {
                aVar3.g(null);
                throw th;
            }
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((m) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: PageFetcherSnapshot.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$3", f = "PageFetcherSnapshot.kt", i = {0, 0}, l = {w.e.f22500x, 234}, m = "invokeSuspend", n = {"this_$iv", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1"})
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 5, 1})
    static final class n extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f32151b;

        /* renamed from: c, reason: collision with root package name */
        Object f32152c;

        /* renamed from: d, reason: collision with root package name */
        Object f32153d;

        /* renamed from: e, reason: collision with root package name */
        int f32154e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ n0<Key, Value> f32155f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(n0<Key, Value> n0Var, kotlin.coroutines.d<? super n> dVar) {
            super(2, dVar);
            this.f32155f = n0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new n(this.f32155f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            n0<Key, Value> n0Var;
            p0.a aVar;
            kotlinx.coroutines.sync.a aVar2;
            kotlinx.coroutines.sync.a aVar3;
            p0 p0Var;
            kotlin.coroutines.intrinsics.a aVar4 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f32154e;
            try {
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    n0Var = this.f32155f;
                    aVar = ((n0) n0Var).stateHolder;
                    aVar2 = aVar.lock;
                    this.f32151b = aVar;
                    this.f32152c = aVar2;
                    this.f32153d = n0Var;
                    this.f32154e = 1;
                    if (aVar2.f(null, this) == aVar4) {
                        return aVar4;
                    }
                    aVar3 = aVar2;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a1.n(obj);
                        return k2.f75408a;
                    }
                    n0Var = (n0) this.f32153d;
                    aVar3 = (kotlinx.coroutines.sync.a) this.f32152c;
                    aVar = (p0.a) this.f32151b;
                    kotlin.a1.n(obj);
                }
                p0Var = aVar.state;
                kotlinx.coroutines.flow.i<Integer> e4 = p0Var.e();
                aVar3.g(null);
                g0 g0Var = g0.APPEND;
                this.f32151b = null;
                this.f32152c = null;
                this.f32153d = null;
                this.f32154e = 2;
                if (n0Var.s(e4, g0Var, this) == aVar4) {
                    return aVar4;
                }
                return k2.f75408a;
            } catch (Throwable th) {
                aVar3.g(null);
                throw th;
            }
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((n) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    public n0(@fg.m Key key, @fg.l b1<Key, Value> pagingSource, @fg.l x0 config, @fg.l kotlinx.coroutines.flow.i<k2> retryFlow, boolean z4, @fg.m j1<Key, Value> j1Var, @fg.m d1<Key, Value> d1Var, @fg.l ld.a<k2> invalidate) {
        kotlinx.coroutines.b0 c5;
        kotlin.jvm.internal.l0.p(pagingSource, "pagingSource");
        kotlin.jvm.internal.l0.p(config, "config");
        kotlin.jvm.internal.l0.p(retryFlow, "retryFlow");
        kotlin.jvm.internal.l0.p(invalidate, "invalidate");
        this.initialKey = key;
        this.pagingSource = pagingSource;
        this.config = config;
        this.retryFlow = retryFlow;
        this.triggerRemoteRefresh = z4;
        this.remoteMediatorConnection = j1Var;
        this.previousPagingState = d1Var;
        this.invalidate = invalidate;
        if (!(config.jumpThreshold == Integer.MIN_VALUE || pagingSource.c())) {
            throw new IllegalArgumentException("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.");
        }
        this.hintHandler = new u();
        this.pageEventChCollected = new AtomicBoolean(false);
        this.pageEventCh = kotlinx.coroutines.channels.o.d(-2, null, null, 6, null);
        this.stateHolder = new p0.a<>(config);
        c5 = p2.c(null, 1, null);
        this.pageEventChannelFlowJob = c5;
        this.pageEventFlow = new t.e(new k(this, null), androidx.paging.f.a(c5, new j(this, null)));
    }

    private final b1.a<Key> A(g0 loadType, Key key) {
        return b1.a.INSTANCE.a(loadType, key, loadType == g0.REFRESH ? this.config.initialLoadSize : this.config.pageSize, this.config.enablePlaceholders);
    }

    private final Key B(p0<Key, Value> p0Var, g0 g0Var, int i4, int i5) {
        if (i4 == p0Var.j(g0Var) && !(p0Var.getSourceLoadStates().a(g0Var) instanceof e0.a) && i5 < this.config.prefetchDistance) {
            return g0Var == g0.PREPEND ? (Key) ((b1.b.c) kotlin.collections.w.B2(p0Var.m())).m() : (Key) ((b1.b.c) kotlin.collections.w.p3(p0Var.m())).l();
        }
        return null;
    }

    private final void C() {
        r();
        this.pagingSource.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object D(g0 g0Var, w1 w1Var, kotlin.coroutines.d<? super k2> dVar) {
        if (b.f32042a[g0Var.ordinal()] == 1) {
            Object u4 = u(dVar);
            return u4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? u4 : k2.f75408a;
        }
        if (!(w1Var != null)) {
            throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint");
        }
        this.hintHandler.a(g0Var, w1Var);
        return k2.f75408a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object E(p0<Key, Value> p0Var, g0 g0Var, e0.a aVar, kotlin.coroutines.d<? super k2> dVar) {
        if (kotlin.jvm.internal.l0.g(p0Var.getSourceLoadStates().a(g0Var), aVar)) {
            return k2.f75408a;
        }
        p0Var.getSourceLoadStates().f(g0Var, aVar);
        Object f02 = this.pageEventCh.f0(new l0.c(p0Var.getSourceLoadStates().j(), null), dVar);
        return f02 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? f02 : k2.f75408a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object F(p0<Key, Value> p0Var, g0 g0Var, kotlin.coroutines.d<? super k2> dVar) {
        e0 a5 = p0Var.getSourceLoadStates().a(g0Var);
        e0.b bVar = e0.b.f31660b;
        if (kotlin.jvm.internal.l0.g(a5, bVar)) {
            return k2.f75408a;
        }
        p0Var.getSourceLoadStates().f(g0Var, bVar);
        Object f02 = this.pageEventCh.f0(new l0.c(p0Var.getSourceLoadStates().j(), null), dVar);
        return f02 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? f02 : k2.f75408a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(kotlinx.coroutines.r0 r0Var) {
        if (this.config.jumpThreshold != Integer.MIN_VALUE) {
            Iterator it = kotlin.collections.w.O(g0.APPEND, g0.PREPEND).iterator();
            while (it.hasNext()) {
                kotlinx.coroutines.k.f(r0Var, null, null, new l(this, (g0) it.next(), null), 3, null);
            }
        }
        kotlinx.coroutines.k.f(r0Var, null, null, new m(this, null), 3, null);
        kotlinx.coroutines.k.f(r0Var, null, null, new n(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s(kotlinx.coroutines.flow.i<Integer> iVar, g0 g0Var, kotlin.coroutines.d<? super k2> dVar) {
        Object a5 = kotlinx.coroutines.flow.k.W(s.f(s.h(iVar, new d(null, this, g0Var)), new e(g0Var, null))).a(new c(g0Var), dVar);
        return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0116 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x027c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015e A[Catch: all -> 0x016f, TryCatch #5 {all -> 0x016f, blocks: (B:68:0x0137, B:70:0x015e, B:71:0x0172, B:73:0x017b), top: B:67:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017b A[Catch: all -> 0x016f, TRY_LEAVE, TryCatch #5 {all -> 0x016f, blocks: (B:68:0x0137, B:70:0x015e, B:71:0x0172, B:73:0x017b), top: B:67:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r2v30, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v9, types: [kotlinx.coroutines.sync.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(kotlin.coroutines.d<? super kotlin.k2> r13) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.n0.u(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0354, code lost:
    
        r0 = r8;
        r8 = r12;
        r12 = r14;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x053f A[Catch: all -> 0x067e, TRY_LEAVE, TryCatch #7 {all -> 0x067e, blocks: (B:70:0x052d, B:110:0x053f), top: B:69:0x052d }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0328 A[Catch: all -> 0x0689, TRY_LEAVE, TryCatch #5 {all -> 0x0689, blocks: (B:192:0x030c, B:195:0x0328), top: B:191:0x030c }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0691 A[Catch: all -> 0x0253, TRY_ENTER, TryCatch #1 {all -> 0x0253, blocks: (B:204:0x021f, B:211:0x02d5, B:216:0x0236, B:218:0x0246, B:219:0x0257, B:221:0x0261, B:226:0x027f, B:228:0x0298, B:231:0x02b7, B:236:0x0691, B:237:0x0696), top: B:203:0x021f }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0521 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x058e A[Catch: all -> 0x008d, TryCatch #6 {all -> 0x008d, blocks: (B:73:0x0577, B:75:0x058e, B:77:0x059a, B:79:0x05a2, B:80:0x05b5, B:81:0x05ac, B:82:0x05b8, B:86:0x05ed, B:114:0x056f, B:168:0x0084, B:171:0x00b9), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x05a2 A[Catch: all -> 0x008d, TryCatch #6 {all -> 0x008d, blocks: (B:73:0x0577, B:75:0x058e, B:77:0x059a, B:79:0x05a2, B:80:0x05b5, B:81:0x05ac, B:82:0x05b8, B:86:0x05ed, B:114:0x056f, B:168:0x0084, B:171:0x00b9), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x05ac A[Catch: all -> 0x008d, TryCatch #6 {all -> 0x008d, blocks: (B:73:0x0577, B:75:0x058e, B:77:0x059a, B:79:0x05a2, B:80:0x05b5, B:81:0x05ac, B:82:0x05b8, B:86:0x05ed, B:114:0x056f, B:168:0x0084, B:171:0x00b9), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x05e2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v46, types: [androidx.paging.n0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v48, types: [androidx.paging.n0] */
    /* JADX WARN: Type inference failed for: r12v51 */
    /* JADX WARN: Type inference failed for: r12v54 */
    /* JADX WARN: Type inference failed for: r12v55 */
    /* JADX WARN: Type inference failed for: r1v17, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [T] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r5v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v75 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x0642 -> B:13:0x0648). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(androidx.paging.g0 r18, androidx.paging.t r19, kotlin.coroutines.d<? super kotlin.k2> r20) {
        /*
            Method dump skipped, instructions count: 1726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.n0.v(androidx.paging.g0, androidx.paging.t, kotlin.coroutines.d):java.lang.Object");
    }

    public final void q(@fg.l w1 viewportHint) {
        kotlin.jvm.internal.l0.p(viewportHint, "viewportHint");
        this.hintHandler.d(viewportHint);
    }

    public final void r() {
        k2.a.b(this.pageEventChannelFlowJob, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(@fg.l kotlin.coroutines.d<? super androidx.paging.d1<Key, Value>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.paging.n0.g
            if (r0 == 0) goto L13
            r0 = r6
            androidx.paging.n0$g r0 = (androidx.paging.n0.g) r0
            int r1 = r0.f32069g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32069g = r1
            goto L18
        L13:
            androidx.paging.n0$g r0 = new androidx.paging.n0$g
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f32067e
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f32069g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r1 = r0.f32066d
            kotlinx.coroutines.sync.a r1 = (kotlinx.coroutines.sync.a) r1
            java.lang.Object r2 = r0.f32065c
            androidx.paging.p0$a r2 = (androidx.paging.p0.a) r2
            java.lang.Object r0 = r0.f32064b
            androidx.paging.n0 r0 = (androidx.paging.n0) r0
            kotlin.a1.n(r6)
            goto L56
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3c:
            kotlin.a1.n(r6)
            androidx.paging.p0$a<Key, Value> r2 = r5.stateHolder
            kotlinx.coroutines.sync.a r6 = androidx.paging.p0.a.a(r2)
            r0.f32064b = r5
            r0.f32065c = r2
            r0.f32066d = r6
            r0.f32069g = r3
            java.lang.Object r0 = r6.f(r4, r0)
            if (r0 != r1) goto L54
            return r1
        L54:
            r0 = r5
            r1 = r6
        L56:
            androidx.paging.p0 r6 = androidx.paging.p0.a.b(r2)     // Catch: java.lang.Throwable -> L68
            androidx.paging.u r0 = r0.hintHandler     // Catch: java.lang.Throwable -> L68
            androidx.paging.w1$a r0 = r0.b()     // Catch: java.lang.Throwable -> L68
            androidx.paging.d1 r6 = r6.g(r0)     // Catch: java.lang.Throwable -> L68
            r1.g(r4)
            return r6
        L68:
            r6 = move-exception
            r1.g(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.n0.t(kotlin.coroutines.d):java.lang.Object");
    }

    @fg.m
    public final Key w() {
        return this.initialKey;
    }

    @fg.l
    public final kotlinx.coroutines.flow.i<l0<Value>> x() {
        return this.pageEventFlow;
    }

    @fg.l
    public final b1<Key, Value> y() {
        return this.pagingSource;
    }

    @fg.m
    public final j1<Key, Value> z() {
        return this.remoteMediatorConnection;
    }

    public /* synthetic */ n0(Object obj, b1 b1Var, x0 x0Var, kotlinx.coroutines.flow.i iVar, boolean z4, j1 j1Var, d1 d1Var, ld.a aVar, int i4, kotlin.jvm.internal.w wVar) {
        this(obj, b1Var, x0Var, iVar, (i4 & 16) != 0 ? false : z4, (i4 & 32) != 0 ? null : j1Var, (i4 & 64) != 0 ? null : d1Var, (i4 & 128) != 0 ? a.f32041b : aVar);
    }
}
