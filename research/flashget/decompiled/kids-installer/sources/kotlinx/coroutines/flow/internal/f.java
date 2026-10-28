package kotlinx.coroutines.flow.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.m2;
import kotlinx.coroutines.channels.c0;
import kotlinx.coroutines.channels.e0;
import kotlinx.coroutines.channels.g0;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.u0;

/* compiled from: Merge.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BA\u0012\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0013\u001a\u00020\u0012H\u0014R \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/flow/internal/f;", "T", "Lkotlinx/coroutines/flow/internal/d;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/m;", "onBufferOverflow", "i", "Lkotlinx/coroutines/u0;", "scope", "Lkotlinx/coroutines/channels/g0;", "o", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/m2;", "h", "(Lkotlinx/coroutines/channels/e0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "e", "Lkotlinx/coroutines/flow/i;", "r", "Lkotlinx/coroutines/flow/i;", "flow", "s", "I", "concurrency", "<init>", "(Lkotlinx/coroutines/flow/i;ILkotlin/coroutines/g;ILkotlinx/coroutines/channels/m;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class f<T> extends d<T> {

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final kotlinx.coroutines.flow.i<kotlinx.coroutines.flow.i<T>> flow;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final int concurrency;

    /* compiled from: Merge.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "inner", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes5.dex */
    static final class a<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ n2 f28008o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.sync.f f28009p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ e0<T> f28010q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ w<T> f28011r;

        /* compiled from: Merge.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/u0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* renamed from: kotlinx.coroutines.flow.internal.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        static final class C0425a extends SuspendLambda implements q3.p<u0, Continuation<? super m2>, Object> {

            /* renamed from: s, reason: collision with root package name */
            int f28012s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i<T> f28013t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ w<T> f28014u;

            /* renamed from: v, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.sync.f f28015v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0425a(kotlinx.coroutines.flow.i<? extends T> iVar, w<T> wVar, kotlinx.coroutines.sync.f fVar, Continuation<? super C0425a> continuation) {
                super(2, continuation);
                this.f28013t = iVar;
                this.f28014u = wVar;
                this.f28015v = fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.f28012s;
                try {
                    if (i5 == 0) {
                        a1.n(obj);
                        kotlinx.coroutines.flow.i<T> iVar = this.f28013t;
                        w<T> wVar = this.f28014u;
                        this.f28012s = 1;
                        if (iVar.a(wVar, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException(ProtectedSandApp.s("郵"));
                        }
                        a1.n(obj);
                    }
                    this.f28015v.release();
                    return m2.f23662a;
                } catch (Throwable th) {
                    this.f28015v.release();
                    throw th;
                }
            }

            @Override // q3.p
            @d5.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object g0(@d5.d u0 u0Var, @d5.e Continuation<? super m2> continuation) {
                return ((C0425a) c(u0Var, continuation)).A(m2.f23662a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.d
            public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
                return new C0425a(this.f28013t, this.f28014u, this.f28015v, continuation);
            }
        }

        /* compiled from: Merge.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2", f = "Merge.kt", i = {0, 0}, l = {66}, m = "emit", n = {"this", "inner"}, s = {"L$0", "L$1"})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes6.dex */
        static final class b extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            Object f28016r;

            /* renamed from: s, reason: collision with root package name */
            Object f28017s;

            /* renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f28018t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ a<T> f28019u;

            /* renamed from: v, reason: collision with root package name */
            int f28020v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(a<? super T> aVar, Continuation<? super b> continuation) {
                super(continuation);
                this.f28019u = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f28018t = obj;
                this.f28020v |= Integer.MIN_VALUE;
                return this.f28019u.b(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(n2 n2Var, kotlinx.coroutines.sync.f fVar, e0<? super T> e0Var, w<T> wVar) {
            this.f28008o = n2Var;
            this.f28009p = fVar;
            this.f28010q = e0Var;
            this.f28011r = wVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.j
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object b(@d5.d kotlinx.coroutines.flow.i<? extends T> r8, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.f.a.b
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.internal.f$a$b r0 = (kotlinx.coroutines.flow.internal.f.a.b) r0
                int r1 = r0.f28020v
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28020v = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.internal.f$a$b r0 = new kotlinx.coroutines.flow.internal.f$a$b
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f28018t
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f28020v
                r3 = 1
                if (r2 == 0) goto L3b
                if (r2 != r3) goto L2f
                java.lang.Object r8 = r0.f28017s
                kotlinx.coroutines.flow.i r8 = (kotlinx.coroutines.flow.i) r8
                java.lang.Object r0 = r0.f28016r
                kotlinx.coroutines.flow.internal.f$a r0 = (kotlinx.coroutines.flow.internal.f.a) r0
                kotlin.a1.n(r9)
                goto L55
            L2f:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "嵓"
                java.lang.String r9 = com.flashget.kidsdownloader.ProtectedSandApp.s(r9)
                r8.<init>(r9)
                throw r8
            L3b:
                kotlin.a1.n(r9)
                kotlinx.coroutines.n2 r9 = r7.f28008o
                if (r9 == 0) goto L45
                kotlinx.coroutines.q2.A(r9)
            L45:
                kotlinx.coroutines.sync.f r9 = r7.f28009p
                r0.f28016r = r7
                r0.f28017s = r8
                r0.f28020v = r3
                java.lang.Object r9 = r9.b(r0)
                if (r9 != r1) goto L54
                return r1
            L54:
                r0 = r7
            L55:
                kotlinx.coroutines.channels.e0<T> r1 = r0.f28010q
                r2 = 0
                r3 = 0
                kotlinx.coroutines.flow.internal.f$a$a r4 = new kotlinx.coroutines.flow.internal.f$a$a
                kotlinx.coroutines.flow.internal.w<T> r9 = r0.f28011r
                kotlinx.coroutines.sync.f r0 = r0.f28009p
                r5 = 0
                r4.<init>(r8, r9, r0, r5)
                r5 = 3
                r6 = 0
                kotlinx.coroutines.j.e(r1, r2, r3, r4, r5, r6)
                kotlin.m2 r8 = kotlin.m2.f23662a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.f.a.b(kotlinx.coroutines.flow.i, kotlin.coroutines.d):java.lang.Object");
        }
    }

    public /* synthetic */ f(kotlinx.coroutines.flow.i iVar, int i5, CoroutineContext coroutineContext, int i6, kotlinx.coroutines.channels.m mVar, int i7, kotlin.jvm.internal.w wVar) {
        this(iVar, i5, (i7 & 4) != 0 ? EmptyCoroutineContext.f23294o : coroutineContext, (i7 & 8) != 0 ? -2 : i6, (i7 & 16) != 0 ? kotlinx.coroutines.channels.m.SUSPEND : mVar);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @d5.d
    protected String e() {
        return ProtectedSandApp.s("郶") + this.concurrency;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @d5.e
    protected Object h(@d5.d e0<? super T> e0Var, @d5.d Continuation<? super m2> continuation) {
        Object a6 = this.flow.a(new a((n2) continuation.getContext().b(n2.INSTANCE), kotlinx.coroutines.sync.h.b(this.concurrency, 0, 2, null), e0Var, new w(e0Var)), continuation);
        return a6 == CoroutineSingletons.COROUTINE_SUSPENDED ? a6 : m2.f23662a;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @d5.d
    protected d<T> i(@d5.d CoroutineContext context, int capacity, @d5.d kotlinx.coroutines.channels.m onBufferOverflow) {
        return new f(this.flow, this.concurrency, context, capacity, onBufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @d5.d
    public g0<T> o(@d5.d u0 scope) {
        return c0.e(scope, this.context, this.capacity, m());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@d5.d kotlinx.coroutines.flow.i<? extends kotlinx.coroutines.flow.i<? extends T>> iVar, int i5, @d5.d CoroutineContext coroutineContext, int i6, @d5.d kotlinx.coroutines.channels.m mVar) {
        super(coroutineContext, i6, mVar);
        this.flow = iVar;
        this.concurrency = i5;
    }
}
