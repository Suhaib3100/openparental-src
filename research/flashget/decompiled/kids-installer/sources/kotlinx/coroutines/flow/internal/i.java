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
import kotlin.jvm.internal.k1;
import kotlin.m2;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.v0;

/* compiled from: Merge.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003Bz\u0012B\u0010\u001a\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0011¢\u0006\u0002\b\u0017\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014J!\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010RS\u0010\u001a\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0011¢\u0006\u0002\b\u00178\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/flow/internal/i;", "T", "R", "Lkotlinx/coroutines/flow/internal/g;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/m;", "onBufferOverflow", "Lkotlinx/coroutines/flow/internal/d;", "i", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "u", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lkotlin/r0;", "name", "value", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "s", "Lq3/q;", "transform", "Lkotlinx/coroutines/flow/i;", "flow", "<init>", "(Lq3/q;Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/m;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class i<T, R> extends g<T, R> {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final q3.q<kotlinx.coroutines.flow.j<? super R>, T, Continuation<? super m2>, Object> transform;

    /* compiled from: Merge.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/u0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    static final class a extends SuspendLambda implements q3.p<u0, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f28026s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f28027t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ i<T, R> f28028u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<R> f28029v;

        /* compiled from: Merge.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: kotlinx.coroutines.flow.internal.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C0426a<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ k1.h<n2> f28030o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ u0 f28031p;

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ i<T, R> f28032q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j<R> f28033r;

            /* compiled from: Merge.kt */
            @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/u0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            /* renamed from: kotlinx.coroutines.flow.internal.i$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            static final class C0427a extends SuspendLambda implements q3.p<u0, Continuation<? super m2>, Object> {

                /* renamed from: s, reason: collision with root package name */
                int f28034s;

                /* renamed from: t, reason: collision with root package name */
                final /* synthetic */ i<T, R> f28035t;

                /* renamed from: u, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.flow.j<R> f28036u;

                /* renamed from: v, reason: collision with root package name */
                final /* synthetic */ T f28037v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0427a(i<T, R> iVar, kotlinx.coroutines.flow.j<? super R> jVar, T t5, Continuation<? super C0427a> continuation) {
                    super(2, continuation);
                    this.f28035t = iVar;
                    this.f28036u = jVar;
                    this.f28037v = t5;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @d5.e
                public final Object A(@d5.d Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i5 = this.f28034s;
                    if (i5 == 0) {
                        a1.n(obj);
                        q3.q qVar = ((i) this.f28035t).transform;
                        kotlinx.coroutines.flow.j<R> jVar = this.f28036u;
                        T t5 = this.f28037v;
                        this.f28034s = 1;
                        if (qVar.G(jVar, t5, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException(ProtectedSandApp.s("郹"));
                        }
                        a1.n(obj);
                    }
                    return m2.f23662a;
                }

                @Override // q3.p
                @d5.e
                /* renamed from: R, reason: merged with bridge method [inline-methods] */
                public final Object g0(@d5.d u0 u0Var, @d5.e Continuation<? super m2> continuation) {
                    return ((C0427a) c(u0Var, continuation)).A(m2.f23662a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @d5.d
                public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
                    return new C0427a(this.f28035t, this.f28036u, this.f28037v, continuation);
                }
            }

            /* compiled from: Merge.kt */
            @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", i = {0, 0}, l = {30}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: kotlinx.coroutines.flow.internal.i$a$a$b */
            /* loaded from: classes6.dex */
            static final class b extends ContinuationImpl {

                /* renamed from: r, reason: collision with root package name */
                Object f28038r;

                /* renamed from: s, reason: collision with root package name */
                Object f28039s;

                /* renamed from: t, reason: collision with root package name */
                Object f28040t;

                /* renamed from: u, reason: collision with root package name */
                /* synthetic */ Object f28041u;

                /* renamed from: v, reason: collision with root package name */
                final /* synthetic */ C0426a<T> f28042v;

                /* renamed from: w, reason: collision with root package name */
                int f28043w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(C0426a<? super T> c0426a, Continuation<? super b> continuation) {
                    super(continuation);
                    this.f28042v = c0426a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @d5.e
                public final Object A(@d5.d Object obj) {
                    this.f28041u = obj;
                    this.f28043w |= Integer.MIN_VALUE;
                    return this.f28042v.b(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C0426a(k1.h<n2> hVar, u0 u0Var, i<T, R> iVar, kotlinx.coroutines.flow.j<? super R> jVar) {
                this.f28030o = hVar;
                this.f28031p = u0Var;
                this.f28032q = iVar;
                this.f28033r = jVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // kotlinx.coroutines.flow.j
            @d5.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object b(T r8, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.i.a.C0426a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    kotlinx.coroutines.flow.internal.i$a$a$b r0 = (kotlinx.coroutines.flow.internal.i.a.C0426a.b) r0
                    int r1 = r0.f28043w
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f28043w = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.internal.i$a$a$b r0 = new kotlinx.coroutines.flow.internal.i$a$a$b
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.f28041u
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.f28043w
                    r3 = 1
                    if (r2 == 0) goto L3d
                    if (r2 != r3) goto L31
                    java.lang.Object r8 = r0.f28040t
                    kotlinx.coroutines.n2 r8 = (kotlinx.coroutines.n2) r8
                    java.lang.Object r8 = r0.f28039s
                    java.lang.Object r0 = r0.f28038r
                    kotlinx.coroutines.flow.internal.i$a$a r0 = (kotlinx.coroutines.flow.internal.i.a.C0426a) r0
                    kotlin.a1.n(r9)
                    goto L60
                L31:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "嵔"
                    java.lang.String r9 = com.flashget.kidsdownloader.ProtectedSandApp.s(r9)
                    r8.<init>(r9)
                    throw r8
                L3d:
                    kotlin.a1.n(r9)
                    kotlin.jvm.internal.k1$h<kotlinx.coroutines.n2> r9 = r7.f28030o
                    T r9 = r9.f23572o
                    kotlinx.coroutines.n2 r9 = (kotlinx.coroutines.n2) r9
                    if (r9 == 0) goto L5f
                    kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
                    r2.<init>()
                    r9.e(r2)
                    r0.f28038r = r7
                    r0.f28039s = r8
                    r0.f28040t = r9
                    r0.f28043w = r3
                    java.lang.Object r9 = r9.H(r0)
                    if (r9 != r1) goto L5f
                    return r1
                L5f:
                    r0 = r7
                L60:
                    kotlin.jvm.internal.k1$h<kotlinx.coroutines.n2> r9 = r0.f28030o
                    kotlinx.coroutines.u0 r1 = r0.f28031p
                    r2 = 0
                    kotlinx.coroutines.w0 r3 = kotlinx.coroutines.w0.UNDISPATCHED
                    kotlinx.coroutines.flow.internal.i$a$a$a r4 = new kotlinx.coroutines.flow.internal.i$a$a$a
                    kotlinx.coroutines.flow.internal.i<T, R> r5 = r0.f28032q
                    kotlinx.coroutines.flow.j<R> r0 = r0.f28033r
                    r6 = 0
                    r4.<init>(r5, r0, r8, r6)
                    r5 = 1
                    kotlinx.coroutines.n2 r8 = kotlinx.coroutines.j.e(r1, r2, r3, r4, r5, r6)
                    r9.f23572o = r8
                    kotlin.m2 r8 = kotlin.m2.f23662a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.i.a.C0426a.b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(i<T, R> iVar, kotlinx.coroutines.flow.j<? super R> jVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f28028u = iVar;
            this.f28029v = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f28026s;
            if (i5 == 0) {
                a1.n(obj);
                u0 u0Var = (u0) this.f28027t;
                k1.h hVar = new k1.h();
                i<T, R> iVar = this.f28028u;
                kotlinx.coroutines.flow.i<S> iVar2 = iVar.flow;
                C0426a c0426a = new C0426a(hVar, u0Var, iVar, this.f28029v);
                this.f28026s = 1;
                if (iVar2.a(c0426a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("郺"));
                }
                a1.n(obj);
            }
            return m2.f23662a;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d u0 u0Var, @d5.e Continuation<? super m2> continuation) {
            return ((a) c(u0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            a aVar = new a(this.f28028u, this.f28029v, continuation);
            aVar.f28027t = obj;
            return aVar;
        }
    }

    public /* synthetic */ i(q3.q qVar, kotlinx.coroutines.flow.i iVar, CoroutineContext coroutineContext, int i5, kotlinx.coroutines.channels.m mVar, int i6, kotlin.jvm.internal.w wVar) {
        this(qVar, iVar, (i6 & 4) != 0 ? EmptyCoroutineContext.f23294o : coroutineContext, (i6 & 8) != 0 ? -2 : i5, (i6 & 16) != 0 ? kotlinx.coroutines.channels.m.SUSPEND : mVar);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @d5.d
    protected d<R> i(@d5.d CoroutineContext context, int capacity, @d5.d kotlinx.coroutines.channels.m onBufferOverflow) {
        return new i(this.transform, this.flow, context, capacity, onBufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.g
    @d5.e
    protected Object u(@d5.d kotlinx.coroutines.flow.j<? super R> jVar, @d5.d Continuation<? super m2> continuation) {
        Object g5 = v0.g(new a(this, jVar, null), continuation);
        return g5 == CoroutineSingletons.COROUTINE_SUSPENDED ? g5 : m2.f23662a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(@d5.d q3.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T, ? super Continuation<? super m2>, ? extends Object> qVar, @d5.d kotlinx.coroutines.flow.i<? extends T> iVar, @d5.d CoroutineContext coroutineContext, int i5, @d5.d kotlinx.coroutines.channels.m mVar) {
        super(iVar, coroutineContext, i5, mVar);
        this.transform = qVar;
    }
}
