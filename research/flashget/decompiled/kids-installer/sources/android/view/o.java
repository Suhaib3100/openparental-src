package android.view;

import androidx.annotation.x0;
import d5.d;
import d5.e;
import java.time.Duration;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlinx.coroutines.channels.n;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.u0;
import p3.i;
import q3.p;

/* compiled from: FlowLiveData.kt */
@i(name = "FlowLiveDataConversions")
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007\u001a\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0006\u001a0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007¨\u0006\f"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "Lkotlin/coroutines/g;", "context", "", "timeoutInMs", "Landroidx/lifecycle/LiveData;", "d", "a", "Ljava/time/Duration;", "timeout", "e", "lifecycle-livedata-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class o {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FlowLiveData.kt */
    @DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", i = {0, 0, 0, 1, 1, 2, 2}, l = {98, 102, 103}, m = "invokeSuspend", n = {"$this$flow", "channel", "observer", "$this$flow", "observer", "$this$flow", "observer"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1"})
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/flow/j;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes4.dex */
    static final class a<T> extends SuspendLambda implements p<j<? super T>, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        Object f8616s;

        /* renamed from: t, reason: collision with root package name */
        Object f8617t;

        /* renamed from: u, reason: collision with root package name */
        int f8618u;

        /* renamed from: v, reason: collision with root package name */
        private /* synthetic */ Object f8619v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ LiveData<T> f8620w;

        /* compiled from: FlowLiveData.kt */
        @DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", f = "FlowLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/u0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        /* renamed from: androidx.lifecycle.o$a$a, reason: collision with other inner class name */
        static final class C0099a extends SuspendLambda implements p<u0, Continuation<? super m2>, Object> {

            /* renamed from: s, reason: collision with root package name */
            int f8621s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ LiveData<T> f8622t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ k0<T> f8623u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0099a(LiveData<T> liveData, k0<T> k0Var, Continuation<? super C0099a> continuation) {
                super(2, continuation);
                this.f8622t = liveData;
                this.f8623u = k0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @e
            public final Object A(@d Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.f8621s != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
                this.f8622t.k(this.f8623u);
                return m2.f23662a;
            }

            @Override // q3.p
            @e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object g0(@d u0 u0Var, @e Continuation<? super m2> continuation) {
                return ((C0099a) c(u0Var, continuation)).A(m2.f23662a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d
            public final Continuation<m2> c(@e Object obj, @d Continuation<?> continuation) {
                return new C0099a(this.f8622t, this.f8623u, continuation);
            }
        }

        /* compiled from: FlowLiveData.kt */
        @DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2", f = "FlowLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/u0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        static final class b extends SuspendLambda implements p<u0, Continuation<? super m2>, Object> {

            /* renamed from: s, reason: collision with root package name */
            int f8624s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ LiveData<T> f8625t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ k0<T> f8626u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(LiveData<T> liveData, k0<T> k0Var, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f8625t = liveData;
                this.f8626u = k0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @e
            public final Object A(@d Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.f8624s != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
                this.f8625t.o(this.f8626u);
                return m2.f23662a;
            }

            @Override // q3.p
            @e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object g0(@d u0 u0Var, @e Continuation<? super m2> continuation) {
                return ((b) c(u0Var, continuation)).A(m2.f23662a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d
            public final Continuation<m2> c(@e Object obj, @d Continuation<?> continuation) {
                return new b(this.f8625t, this.f8626u, continuation);
            }
        }

        /* compiled from: FlowLiveData.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        /* loaded from: classes3.dex */
        static final class c<T> implements k0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ n<T> f8627a;

            c(n<T> nVar) {
                this.f8627a = nVar;
            }

            @Override // android.view.k0
            public final void a(T t5) {
                this.f8627a.Y(t5);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(LiveData<T> liveData, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f8620w = liveData;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0097 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00a5 A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #0 {all -> 0x00d6, blocks: (B:16:0x009d, B:18:0x00a5), top: B:15:0x009d }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00bc  */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v12 */
        /* JADX WARN: Type inference failed for: r4v22 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v4, types: [androidx.lifecycle.k0] */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r4v7 */
        /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlinx.coroutines.flow.j] */
        /* JADX WARN: Type inference failed for: r7v6 */
        /* JADX WARN: Type inference failed for: r7v7 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00b8 -> B:9:0x0089). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object A(@d5.d java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 247
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.o.a.A(java.lang.Object):java.lang.Object");
        }

        @Override // q3.p
        @e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d j<? super T> jVar, @e Continuation<? super m2> continuation) {
            return ((a) c(jVar, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d
        public final Continuation<m2> c(@e Object obj, @d Continuation<?> continuation) {
            a aVar = new a(this.f8620w, continuation);
            aVar.f8619v = obj;
            return aVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FlowLiveData.kt */
    @DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"T", "Landroidx/lifecycle/f0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes4.dex */
    static final class b<T> extends SuspendLambda implements p<f0<T>, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f8628s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f8629t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T> f8630u;

        /* compiled from: Collect.kt */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/n$a", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
        /* loaded from: classes3.dex */
        public static final class a implements j<T> {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ f0 f8631o;

            public a(f0 f0Var) {
                this.f8631o = f0Var;
            }

            @Override // kotlinx.coroutines.flow.j
            @e
            public Object b(T t5, @d Continuation<? super m2> continuation) {
                Object b6 = this.f8631o.b(t5, continuation);
                return b6 == CoroutineSingletons.COROUTINE_SUSPENDED ? b6 : m2.f23662a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(kotlinx.coroutines.flow.i<? extends T> iVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f8630u = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object A(@d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f8628s;
            if (i5 == 0) {
                a1.n(obj);
                f0 f0Var = (f0) this.f8629t;
                kotlinx.coroutines.flow.i<T> iVar = this.f8630u;
                a aVar = new a(f0Var);
                this.f8628s = 1;
                if (iVar.a(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            return m2.f23662a;
        }

        @Override // q3.p
        @e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d f0<T> f0Var, @e Continuation<? super m2> continuation) {
            return ((b) c(f0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d
        public final Continuation<m2> c(@e Object obj, @d Continuation<?> continuation) {
            b bVar = new b(this.f8630u, continuation);
            bVar.f8629t = obj;
            return bVar;
        }
    }

    @d
    public static final <T> kotlinx.coroutines.flow.i<T> a(@d LiveData<T> liveData) {
        l0.p(liveData, "<this>");
        return k.I0(new a(liveData, null));
    }

    @d
    @p3.j
    public static final <T> LiveData<T> b(@d kotlinx.coroutines.flow.i<? extends T> iVar) {
        l0.p(iVar, "<this>");
        return f(iVar, null, 0L, 3, null);
    }

    @d
    @p3.j
    public static final <T> LiveData<T> c(@d kotlinx.coroutines.flow.i<? extends T> iVar, @d CoroutineContext context) {
        l0.p(iVar, "<this>");
        l0.p(context, "context");
        return f(iVar, context, 0L, 2, null);
    }

    @d
    @p3.j
    public static final <T> LiveData<T> d(@d kotlinx.coroutines.flow.i<? extends T> iVar, @d CoroutineContext context, long j5) {
        l0.p(iVar, "<this>");
        l0.p(context, "context");
        return C0532i.b(context, j5, new b(iVar, null));
    }

    @x0(26)
    @d
    public static final <T> LiveData<T> e(@d kotlinx.coroutines.flow.i<? extends T> iVar, @d CoroutineContext context, @d Duration timeout) {
        long millis;
        l0.p(iVar, "<this>");
        l0.p(context, "context");
        l0.p(timeout, "timeout");
        millis = timeout.toMillis();
        return d(iVar, context, millis);
    }

    public static /* synthetic */ LiveData f(kotlinx.coroutines.flow.i iVar, CoroutineContext coroutineContext, long j5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f23294o;
        }
        if ((i5 & 2) != 0) {
            j5 = C0532i.f8582a;
        }
        return d(iVar, coroutineContext, j5);
    }

    public static /* synthetic */ LiveData g(kotlinx.coroutines.flow.i iVar, CoroutineContext coroutineContext, Duration duration, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f23294o;
        }
        return e(iVar, coroutineContext, duration);
    }
}
