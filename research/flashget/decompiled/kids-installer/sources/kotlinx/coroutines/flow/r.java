package kotlinx.coroutines.flow;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.k1;
import kotlin.m2;
import kotlin.time.Duration;
import kotlinx.coroutines.channels.r;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.f1;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import kotlinx.coroutines.flow.internal.n;

/* compiled from: Delay.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a2\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0005H\u0007\u001a3\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a<\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a9\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\f\u001a&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000f\u001a\u00020\u0002H\u0007\u001a$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0002H\u0000\u001a3\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0017\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "", "timeoutMillis", "a", "Lkotlin/Function1;", "b", "Lkotlin/time/e;", "timeout", "c", "(Lkotlinx/coroutines/flow/i;J)Lkotlinx/coroutines/flow/i;", "d", "(Lkotlinx/coroutines/flow/i;Lq3/l;)Lkotlinx/coroutines/flow/i;", "timeoutMillisSelector", "e", "periodMillis", "h", "Lkotlinx/coroutines/u0;", "delayMillis", "initialDelayMillis", "Lkotlinx/coroutines/channels/g0;", "Lkotlin/m2;", "f", "period", "i", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes5.dex */
final /* synthetic */ class r {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Delay.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Long;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class a<T> extends Lambda implements q3.l<T, Long> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ long f28275p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j5) {
            super(1);
            this.f28275p = j5;
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long N(T t5) {
            return Long.valueOf(this.f28275p);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Delay.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "emittedItem", "", "a", "(Ljava/lang/Object;)Ljava/lang/Long;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class b<T> extends Lambda implements q3.l<T, Long> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.l<T, Duration> f28276p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(q3.l<? super T, Duration> lVar) {
            super(1);
            this.f28276p = lVar;
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long N(T t5) {
            return Long.valueOf(f1.e(this.f28276p.N(t5).getF27200o()));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Delay.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {222, 355}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "timeoutMillis", "downstream", "values", "lastValue", "timeoutMillis"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/u0;", "Lkotlinx/coroutines/flow/j;", "downstream", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class c<T> extends SuspendLambda implements q3.q<kotlinx.coroutines.u0, j<? super T>, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        Object f28277s;

        /* renamed from: t, reason: collision with root package name */
        Object f28278t;

        /* renamed from: u, reason: collision with root package name */
        int f28279u;

        /* renamed from: v, reason: collision with root package name */
        private /* synthetic */ Object f28280v;

        /* renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f28281w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ q3.l<T, Long> f28282x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ i<T> f28283y;

        /* compiled from: Delay.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", i = {}, l = {233}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@"}, d2 = {"T", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        static final class a extends SuspendLambda implements q3.l<Continuation<? super m2>, Object> {

            /* renamed from: s, reason: collision with root package name */
            int f28284s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ j<T> f28285t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ k1.h<Object> f28286u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(j<? super T> jVar, k1.h<Object> hVar, Continuation<? super a> continuation) {
                super(1, continuation);
                this.f28285t = jVar;
                this.f28286u = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.f28284s;
                if (i5 == 0) {
                    a1.n(obj);
                    j<T> jVar = this.f28285t;
                    kotlinx.coroutines.internal.r0 r0Var = kotlinx.coroutines.flow.internal.s.f28115a;
                    T t5 = this.f28286u.f23572o;
                    if (t5 == r0Var) {
                        t5 = null;
                    }
                    this.f28284s = 1;
                    if (jVar.b(t5, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("鄑"));
                    }
                    a1.n(obj);
                }
                this.f28286u.f23572o = null;
                return m2.f23662a;
            }

            @Override // q3.l
            @d5.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object N(@d5.e Continuation<? super m2> continuation) {
                return ((a) w(continuation)).A(m2.f23662a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.d
            public final Continuation<m2> w(@d5.d Continuation<?> continuation) {
                return new a(this.f28285t, this.f28286u, continuation);
            }
        }

        /* compiled from: Delay.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", i = {0}, l = {243}, m = "invokeSuspend", n = {"$this$onFailure_u2dWpGqRn0$iv"}, s = {"L$0"})
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/channels/r;", "", "value", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        static final class b extends SuspendLambda implements q3.p<kotlinx.coroutines.channels.r<? extends Object>, Continuation<? super m2>, Object> {

            /* renamed from: s, reason: collision with root package name */
            Object f28287s;

            /* renamed from: t, reason: collision with root package name */
            int f28288t;

            /* renamed from: u, reason: collision with root package name */
            /* synthetic */ Object f28289u;

            /* renamed from: v, reason: collision with root package name */
            final /* synthetic */ k1.h<Object> f28290v;

            /* renamed from: w, reason: collision with root package name */
            final /* synthetic */ j<T> f28291w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(k1.h<Object> hVar, j<? super T> jVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f28290v = hVar;
                this.f28291w = jVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                k1.h<Object> hVar;
                k1.h<Object> hVar2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.f28288t;
                if (i5 == 0) {
                    a1.n(obj);
                    T t5 = (T) ((kotlinx.coroutines.channels.r) this.f28289u).getHolder();
                    hVar = this.f28290v;
                    boolean z5 = t5 instanceof r.c;
                    if (!z5) {
                        hVar.f23572o = t5;
                    }
                    j<T> jVar = this.f28291w;
                    if (z5) {
                        Throwable f6 = kotlinx.coroutines.channels.r.f(t5);
                        if (f6 != null) {
                            throw f6;
                        }
                        Object obj2 = hVar.f23572o;
                        if (obj2 != null) {
                            if (obj2 == kotlinx.coroutines.flow.internal.s.f28115a) {
                                obj2 = null;
                            }
                            this.f28289u = t5;
                            this.f28287s = hVar;
                            this.f28288t = 1;
                            if (jVar.b(obj2, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            hVar2 = hVar;
                        }
                        hVar.f23572o = (T) kotlinx.coroutines.flow.internal.s.f28117c;
                    }
                    return m2.f23662a;
                }
                if (i5 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("鄒"));
                }
                hVar2 = (k1.h) this.f28287s;
                a1.n(obj);
                hVar = hVar2;
                hVar.f23572o = (T) kotlinx.coroutines.flow.internal.s.f28117c;
                return m2.f23662a;
            }

            @d5.e
            public final Object R(@d5.d Object obj, @d5.e Continuation<? super m2> continuation) {
                return ((b) c(kotlinx.coroutines.channels.r.b(obj), continuation)).A(m2.f23662a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.d
            public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
                b bVar = new b(this.f28290v, this.f28291w, continuation);
                bVar.f28289u = obj;
                return bVar;
            }

            @Override // q3.p
            public /* bridge */ /* synthetic */ Object g0(kotlinx.coroutines.channels.r<? extends Object> rVar, Continuation<? super m2> continuation) {
                return R(rVar.getHolder(), continuation);
            }
        }

        /* compiled from: Delay.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", i = {}, l = {211}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/channels/e0;", "", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* renamed from: kotlinx.coroutines.flow.r$c$c, reason: collision with other inner class name */
        static final class C0438c extends SuspendLambda implements q3.p<kotlinx.coroutines.channels.e0<? super Object>, Continuation<? super m2>, Object> {

            /* renamed from: s, reason: collision with root package name */
            int f28292s;

            /* renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f28293t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ i<T> f28294u;

            /* compiled from: Delay.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
            /* renamed from: kotlinx.coroutines.flow.r$c$c$a */
            /* loaded from: classes5.dex */
            static final class a<T> implements j {

                /* renamed from: o, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.channels.e0<Object> f28295o;

                /* compiled from: Delay.kt */
                @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", f = "Delay.kt", i = {}, l = {211}, m = "emit", n = {}, s = {})
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                /* renamed from: kotlinx.coroutines.flow.r$c$c$a$a, reason: collision with other inner class name */
                /* loaded from: classes6.dex */
                static final class C0439a extends ContinuationImpl {

                    /* renamed from: r, reason: collision with root package name */
                    /* synthetic */ Object f28296r;

                    /* renamed from: s, reason: collision with root package name */
                    final /* synthetic */ a<T> f28297s;

                    /* renamed from: t, reason: collision with root package name */
                    int f28298t;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0439a(a<? super T> aVar, Continuation<? super C0439a> continuation) {
                        super(continuation);
                        this.f28297s = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @d5.e
                    public final Object A(@d5.d Object obj) {
                        this.f28296r = obj;
                        this.f28298t |= Integer.MIN_VALUE;
                        return this.f28297s.b(null, this);
                    }
                }

                a(kotlinx.coroutines.channels.e0<Object> e0Var) {
                    this.f28295o = e0Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // kotlinx.coroutines.flow.j
                @d5.e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object b(T r5, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof kotlinx.coroutines.flow.r.c.C0438c.a.C0439a
                        if (r0 == 0) goto L13
                        r0 = r6
                        kotlinx.coroutines.flow.r$c$c$a$a r0 = (kotlinx.coroutines.flow.r.c.C0438c.a.C0439a) r0
                        int r1 = r0.f28298t
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f28298t = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.r$c$c$a$a r0 = new kotlinx.coroutines.flow.r$c$c$a$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.f28296r
                        kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r2 = r0.f28298t
                        r3 = 1
                        if (r2 == 0) goto L33
                        if (r2 != r3) goto L27
                        kotlin.a1.n(r6)
                        goto L45
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "嵽"
                        java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
                        r5.<init>(r6)
                        throw r5
                    L33:
                        kotlin.a1.n(r6)
                        kotlinx.coroutines.channels.e0<java.lang.Object> r6 = r4.f28295o
                        if (r5 != 0) goto L3c
                        kotlinx.coroutines.internal.r0 r5 = kotlinx.coroutines.flow.internal.s.f28115a
                    L3c:
                        r0.f28298t = r3
                        java.lang.Object r5 = r6.a0(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        kotlin.m2 r5 = kotlin.m2.f23662a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r.c.C0438c.a.b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0438c(i<? extends T> iVar, Continuation<? super C0438c> continuation) {
                super(2, continuation);
                this.f28294u = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.f28292s;
                if (i5 == 0) {
                    a1.n(obj);
                    kotlinx.coroutines.channels.e0 e0Var = (kotlinx.coroutines.channels.e0) this.f28293t;
                    i<T> iVar = this.f28294u;
                    a aVar = new a(e0Var);
                    this.f28292s = 1;
                    if (iVar.a(aVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("鄓"));
                    }
                    a1.n(obj);
                }
                return m2.f23662a;
            }

            @Override // q3.p
            @d5.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object g0(@d5.d kotlinx.coroutines.channels.e0<Object> e0Var, @d5.e Continuation<? super m2> continuation) {
                return ((C0438c) c(e0Var, continuation)).A(m2.f23662a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.d
            public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
                C0438c c0438c = new C0438c(this.f28294u, continuation);
                c0438c.f28293t = obj;
                return c0438c;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(q3.l<? super T, Long> lVar, i<? extends T> iVar, Continuation<? super c> continuation) {
            super(3, continuation);
            this.f28282x = lVar;
            this.f28283y = iVar;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:50|26|30|31|32|33|(1:35)|36|37|(1:39)|(1:41)(1:42)) */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00fd, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00fe, code lost:
        
            r10.i1(r0);
         */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00e6 A[Catch: all -> 0x00fd, TryCatch #0 {all -> 0x00fd, blocks: (B:33:0x00e2, B:35:0x00e6, B:36:0x00f0), top: B:32:0x00e2 }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x010e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x010f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x010f -> B:6:0x0071). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object A(@d5.d java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 280
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r.c.A(java.lang.Object):java.lang.Object");
        }

        @Override // q3.q
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object G(@d5.d kotlinx.coroutines.u0 u0Var, @d5.d j<? super T> jVar, @d5.e Continuation<? super m2> continuation) {
            c cVar = new c(this.f28282x, this.f28283y, continuation);
            cVar.f28280v = u0Var;
            cVar.f28281w = jVar;
            return cVar.A(m2.f23662a);
        }
    }

    /* compiled from: Delay.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3", f = "Delay.kt", i = {0, 1, 2}, l = {314, 316, 317}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/channels/e0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class d extends SuspendLambda implements q3.p<kotlinx.coroutines.channels.e0<? super m2>, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f28299s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f28300t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ long f28301u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ long f28302v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j5, long j6, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f28301u = j5;
            this.f28302v = j6;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x005f A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x005d -> B:12:0x0042). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object A(@d5.d java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r7.f28299s
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2c
                if (r1 == r4) goto Lf
                if (r1 == r3) goto L23
                if (r1 != r2) goto L17
            Lf:
                java.lang.Object r1 = r7.f28300t
                kotlinx.coroutines.channels.e0 r1 = (kotlinx.coroutines.channels.e0) r1
                kotlin.a1.n(r8)
                goto L41
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "鄖"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                r8.<init>(r0)
                throw r8
            L23:
                java.lang.Object r1 = r7.f28300t
                kotlinx.coroutines.channels.e0 r1 = (kotlinx.coroutines.channels.e0) r1
                kotlin.a1.n(r8)
                r8 = r7
                goto L53
            L2c:
                kotlin.a1.n(r8)
                java.lang.Object r8 = r7.f28300t
                r1 = r8
                kotlinx.coroutines.channels.e0 r1 = (kotlinx.coroutines.channels.e0) r1
                long r5 = r7.f28301u
                r7.f28300t = r1
                r7.f28299s = r4
                java.lang.Object r8 = kotlinx.coroutines.f1.b(r5, r7)
                if (r8 != r0) goto L41
                return r0
            L41:
                r8 = r7
            L42:
                kotlinx.coroutines.channels.k0 r4 = r1.g()
                kotlin.m2 r5 = kotlin.m2.f23662a
                r8.f28300t = r1
                r8.f28299s = r3
                java.lang.Object r4 = r4.a0(r5, r8)
                if (r4 != r0) goto L53
                return r0
            L53:
                long r4 = r8.f28302v
                r8.f28300t = r1
                r8.f28299s = r2
                java.lang.Object r4 = kotlinx.coroutines.f1.b(r4, r8)
                if (r4 != r0) goto L42
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r.d.A(java.lang.Object):java.lang.Object");
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d kotlinx.coroutines.channels.e0<? super m2> e0Var, @d5.e Continuation<? super m2> continuation) {
            return ((d) c(e0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            d dVar = new d(this.f28301u, this.f28302v, continuation);
            dVar.f28300t = obj;
            return dVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Delay.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", i = {0, 0, 0, 0}, l = {352}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "ticker"}, s = {"L$0", "L$1", "L$2", "L$3"})
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/u0;", "Lkotlinx/coroutines/flow/j;", "downstream", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class e<T> extends SuspendLambda implements q3.q<kotlinx.coroutines.u0, j<? super T>, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        Object f28303s;

        /* renamed from: t, reason: collision with root package name */
        Object f28304t;

        /* renamed from: u, reason: collision with root package name */
        int f28305u;

        /* renamed from: v, reason: collision with root package name */
        private /* synthetic */ Object f28306v;

        /* renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f28307w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ long f28308x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ i<T> f28309y;

        /* compiled from: Delay.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/channels/r;", "", "result", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        static final class a extends SuspendLambda implements q3.p<kotlinx.coroutines.channels.r<? extends Object>, Continuation<? super m2>, Object> {

            /* renamed from: s, reason: collision with root package name */
            int f28310s;

            /* renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f28311t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ k1.h<Object> f28312u;

            /* renamed from: v, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.channels.g0<m2> f28313v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k1.h<Object> hVar, kotlinx.coroutines.channels.g0<m2> g0Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f28312u = hVar;
                this.f28313v = g0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.f28310s != 0) {
                    throw new IllegalStateException(ProtectedSandApp.s("鄗"));
                }
                a1.n(obj);
                T t5 = (T) ((kotlinx.coroutines.channels.r) this.f28311t).getHolder();
                k1.h<Object> hVar = this.f28312u;
                boolean z5 = t5 instanceof r.c;
                if (!z5) {
                    hVar.f23572o = t5;
                }
                kotlinx.coroutines.channels.g0<m2> g0Var = this.f28313v;
                if (z5) {
                    Throwable f6 = kotlinx.coroutines.channels.r.f(t5);
                    if (f6 != null) {
                        throw f6;
                    }
                    g0Var.e(new ChildCancelledException());
                    hVar.f23572o = (T) kotlinx.coroutines.flow.internal.s.f28117c;
                }
                return m2.f23662a;
            }

            @d5.e
            public final Object R(@d5.d Object obj, @d5.e Continuation<? super m2> continuation) {
                return ((a) c(kotlinx.coroutines.channels.r.b(obj), continuation)).A(m2.f23662a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.d
            public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
                a aVar = new a(this.f28312u, this.f28313v, continuation);
                aVar.f28311t = obj;
                return aVar;
            }

            @Override // q3.p
            public /* bridge */ /* synthetic */ Object g0(kotlinx.coroutines.channels.r<? extends Object> rVar, Continuation<? super m2> continuation) {
                return R(rVar.getHolder(), continuation);
            }
        }

        /* compiled from: Delay.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", f = "Delay.kt", i = {}, l = {300}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlin/m2;", "it", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        static final class b extends SuspendLambda implements q3.p<m2, Continuation<? super m2>, Object> {

            /* renamed from: s, reason: collision with root package name */
            int f28314s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ k1.h<Object> f28315t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ j<T> f28316u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(k1.h<Object> hVar, j<? super T> jVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f28315t = hVar;
                this.f28316u = jVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.f28314s;
                if (i5 == 0) {
                    a1.n(obj);
                    k1.h<Object> hVar = this.f28315t;
                    Object obj2 = hVar.f23572o;
                    if (obj2 == null) {
                        return m2.f23662a;
                    }
                    hVar.f23572o = null;
                    j<T> jVar = this.f28316u;
                    if (obj2 == kotlinx.coroutines.flow.internal.s.f28115a) {
                        obj2 = null;
                    }
                    this.f28314s = 1;
                    if (jVar.b(obj2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("鄘"));
                    }
                    a1.n(obj);
                }
                return m2.f23662a;
            }

            @Override // q3.p
            @d5.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object g0(@d5.d m2 m2Var, @d5.e Continuation<? super m2> continuation) {
                return ((b) c(m2Var, continuation)).A(m2.f23662a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.d
            public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
                return new b(this.f28315t, this.f28316u, continuation);
            }
        }

        /* compiled from: Delay.kt */
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1", f = "Delay.kt", i = {}, l = {280}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/channels/e0;", "", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        static final class c extends SuspendLambda implements q3.p<kotlinx.coroutines.channels.e0<? super Object>, Continuation<? super m2>, Object> {

            /* renamed from: s, reason: collision with root package name */
            int f28317s;

            /* renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f28318t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ i<T> f28319u;

            /* compiled from: Delay.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
            /* loaded from: classes5.dex */
            static final class a<T> implements j {

                /* renamed from: o, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.channels.e0<Object> f28320o;

                /* compiled from: Delay.kt */
                @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1", f = "Delay.kt", i = {}, l = {280}, m = "emit", n = {}, s = {})
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                /* renamed from: kotlinx.coroutines.flow.r$e$c$a$a, reason: collision with other inner class name */
                /* loaded from: classes6.dex */
                static final class C0440a extends ContinuationImpl {

                    /* renamed from: r, reason: collision with root package name */
                    /* synthetic */ Object f28321r;

                    /* renamed from: s, reason: collision with root package name */
                    final /* synthetic */ a<T> f28322s;

                    /* renamed from: t, reason: collision with root package name */
                    int f28323t;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0440a(a<? super T> aVar, Continuation<? super C0440a> continuation) {
                        super(continuation);
                        this.f28322s = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @d5.e
                    public final Object A(@d5.d Object obj) {
                        this.f28321r = obj;
                        this.f28323t |= Integer.MIN_VALUE;
                        return this.f28322s.b(null, this);
                    }
                }

                a(kotlinx.coroutines.channels.e0<Object> e0Var) {
                    this.f28320o = e0Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // kotlinx.coroutines.flow.j
                @d5.e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object b(T r5, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof kotlinx.coroutines.flow.r.e.c.a.C0440a
                        if (r0 == 0) goto L13
                        r0 = r6
                        kotlinx.coroutines.flow.r$e$c$a$a r0 = (kotlinx.coroutines.flow.r.e.c.a.C0440a) r0
                        int r1 = r0.f28323t
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f28323t = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.r$e$c$a$a r0 = new kotlinx.coroutines.flow.r$e$c$a$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.f28321r
                        kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r2 = r0.f28323t
                        r3 = 1
                        if (r2 == 0) goto L33
                        if (r2 != r3) goto L27
                        kotlin.a1.n(r6)
                        goto L45
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "嵾"
                        java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
                        r5.<init>(r6)
                        throw r5
                    L33:
                        kotlin.a1.n(r6)
                        kotlinx.coroutines.channels.e0<java.lang.Object> r6 = r4.f28320o
                        if (r5 != 0) goto L3c
                        kotlinx.coroutines.internal.r0 r5 = kotlinx.coroutines.flow.internal.s.f28115a
                    L3c:
                        r0.f28323t = r3
                        java.lang.Object r5 = r6.a0(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        kotlin.m2 r5 = kotlin.m2.f23662a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r.e.c.a.b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(i<? extends T> iVar, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f28319u = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.f28317s;
                if (i5 == 0) {
                    a1.n(obj);
                    kotlinx.coroutines.channels.e0 e0Var = (kotlinx.coroutines.channels.e0) this.f28318t;
                    i<T> iVar = this.f28319u;
                    a aVar = new a(e0Var);
                    this.f28317s = 1;
                    if (iVar.a(aVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("鄙"));
                    }
                    a1.n(obj);
                }
                return m2.f23662a;
            }

            @Override // q3.p
            @d5.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object g0(@d5.d kotlinx.coroutines.channels.e0<Object> e0Var, @d5.e Continuation<? super m2> continuation) {
                return ((c) c(e0Var, continuation)).A(m2.f23662a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.d
            public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
                c cVar = new c(this.f28319u, continuation);
                cVar.f28318t = obj;
                return cVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(long j5, i<? extends T> iVar, Continuation<? super e> continuation) {
            super(3, continuation);
            this.f28308x = j5;
            this.f28309y = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            j jVar;
            kotlinx.coroutines.channels.g0 g0Var;
            k1.h hVar;
            kotlinx.coroutines.channels.g0 g5;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f28305u;
            if (i5 == 0) {
                a1.n(obj);
                kotlinx.coroutines.u0 u0Var = (kotlinx.coroutines.u0) this.f28306v;
                j jVar2 = (j) this.f28307w;
                kotlinx.coroutines.channels.g0 h5 = kotlinx.coroutines.channels.c0.h(u0Var, null, -1, new c(this.f28309y, null), 1, null);
                k1.h hVar2 = new k1.h();
                jVar = jVar2;
                g0Var = h5;
                hVar = hVar2;
                g5 = r.g(u0Var, this.f28308x, 0L, 2, null);
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("鄚"));
                }
                g5 = (kotlinx.coroutines.channels.g0) this.f28304t;
                hVar = (k1.h) this.f28303s;
                g0Var = (kotlinx.coroutines.channels.g0) this.f28307w;
                jVar = (j) this.f28306v;
                a1.n(obj);
            }
            while (hVar.f23572o != kotlinx.coroutines.flow.internal.s.f28117c) {
                this.f28306v = jVar;
                this.f28307w = g0Var;
                this.f28303s = hVar;
                this.f28304t = g5;
                this.f28305u = 1;
                kotlinx.coroutines.selects.b bVar = new kotlinx.coroutines.selects.b(this);
                try {
                    bVar.s0(g0Var.p(), new a(hVar, g5, null));
                    bVar.s0(g5.h(), new b(hVar, jVar, null));
                } catch (Throwable th) {
                    bVar.i1(th);
                }
                Object h12 = bVar.h1();
                if (h12 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    kotlin.coroutines.jvm.internal.h.c(this);
                }
                if (h12 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return m2.f23662a;
        }

        @Override // q3.q
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object G(@d5.d kotlinx.coroutines.u0 u0Var, @d5.d j<? super T> jVar, @d5.e Continuation<? super m2> continuation) {
            e eVar = new e(this.f28308x, this.f28309y, continuation);
            eVar.f28306v = u0Var;
            eVar.f28307w = jVar;
            return eVar.A(m2.f23662a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d2
    @d5.d
    public static final <T> i<T> a(@d5.d i<? extends T> iVar, long j5) {
        if (j5 >= 0) {
            return j5 == 0 ? iVar : e(iVar, new a(j5));
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("嶁").toString());
    }

    @d2
    @d5.d
    @OverloadResolutionByLambdaReturnType
    public static final <T> i<T> b(@d5.d i<? extends T> iVar, @d5.d q3.l<? super T, Long> lVar) {
        return e(iVar, lVar);
    }

    @d2
    @d5.d
    public static final <T> i<T> c(@d5.d i<? extends T> iVar, long j5) {
        return a(iVar, f1.e(j5));
    }

    @d2
    @p3.i(name = "debounceDuration")
    @d5.d
    @OverloadResolutionByLambdaReturnType
    public static final <T> i<T> d(@d5.d i<? extends T> iVar, @d5.d q3.l<? super T, Duration> lVar) {
        return e(iVar, new b(lVar));
    }

    private static final <T> i<T> e(i<? extends T> iVar, q3.l<? super T, Long> lVar) {
        return new n.a(new c(lVar, iVar, null));
    }

    @d5.d
    public static final kotlinx.coroutines.channels.g0<m2> f(@d5.d kotlinx.coroutines.u0 u0Var, long j5, long j6) {
        boolean z5 = j5 >= 0;
        String s5 = ProtectedSandApp.s("嶂");
        if (!z5) {
            throw new IllegalArgumentException((ProtectedSandApp.s("嶄") + j5 + s5).toString());
        }
        if (j6 >= 0) {
            return kotlinx.coroutines.channels.c0.h(u0Var, null, 0, new d(j6, j5, null), 1, null);
        }
        throw new IllegalArgumentException((ProtectedSandApp.s("嶃") + j6 + s5).toString());
    }

    public static kotlinx.coroutines.channels.g0 g(kotlinx.coroutines.u0 u0Var, long j5, long j6, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            j6 = j5;
        }
        return f(u0Var, j5, j6);
    }

    @d2
    @d5.d
    public static final <T> i<T> h(@d5.d i<? extends T> iVar, long j5) {
        if (j5 > 0) {
            return new n.a(new e(j5, iVar, null));
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("嶅").toString());
    }

    @d2
    @d5.d
    public static final <T> i<T> i(@d5.d i<? extends T> iVar, long j5) {
        return h(iVar, f1.e(j5));
    }
}
