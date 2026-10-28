package kotlinx.coroutines.flow;

import androidx.constraintlayout.core.motion.utils.w;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.c1;
import kotlinx.coroutines.channels.p;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import kotlinx.coroutines.flow.internal.n;

/* compiled from: Delay.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\u0005\u001a<\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0006H\u0007ø\u0001\u0001¢\u0006\u0004\b\f\u0010\b\u001a9\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\b\u001a-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0010\u0010\u0005\u001a+\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a3\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0018\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0005\u001a3\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0005\u001a3\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\n\u001a\u00020\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0005\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "", "timeoutMillis", "a", "(Lkotlinx/coroutines/flow/i;J)Lkotlinx/coroutines/flow/i;", "Lkotlin/Function1;", "b", "(Lkotlinx/coroutines/flow/i;Lld/l;)Lkotlinx/coroutines/flow/i;", "Lkotlin/time/e;", "timeout", "c", "d", "timeoutMillisSelector", "e", "periodMillis", "h", "Lkotlinx/coroutines/r0;", "delayMillis", "initialDelayMillis", "Lkotlinx/coroutines/channels/d0;", "Lkotlin/k2;", "f", "(Lkotlinx/coroutines/r0;JJ)Lkotlinx/coroutines/channels/d0;", "period", "i", "j", "k", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
@r1({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,415:1\n1#2:416\n*E\n"})
/* loaded from: classes7.dex */
final /* synthetic */ class r {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Delay.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0})
    static final class a<T> extends kotlin.jvm.internal.n0 implements ld.l<T, Long> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f80309b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j4) {
            super(1);
            this.f80309b = j4;
        }

        @fg.l
        public final Long a(T t4) {
            return Long.valueOf(this.f80309b);
        }

        @Override // ld.l
        public Long invoke(Object obj) {
            return Long.valueOf(this.f80309b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Delay.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "emittedItem", "", "a", "(Ljava/lang/Object;)Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0})
    static final class b<T> extends kotlin.jvm.internal.n0 implements ld.l<T, Long> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<T, kotlin.time.e> f80310b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ld.l<? super T, kotlin.time.e> lVar) {
            super(1);
            this.f80310b = lVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke(T t4) {
            return Long.valueOf(c1.e(this.f80310b.invoke(t4).getRawValue()));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Delay.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {221, 426}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "timeoutMillis", "downstream", "values", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlinx/coroutines/r0;", "Lkotlinx/coroutines/flow/j;", "downstream", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,415:1\n18#2:416\n18#2:418\n1#3:417\n55#4,8:419\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1\n*L\n218#1:416\n221#1:418\n228#1:419,8\n*E\n"})
    static final class c<T> extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.r0, j<? super T>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f80311b;

        /* renamed from: c, reason: collision with root package name */
        Object f80312c;

        /* renamed from: d, reason: collision with root package name */
        int f80313d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f80314e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80315f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.l<T, Long> f80316g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ i<T> f80317h;

        /* compiled from: Delay.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", i = {}, l = {232}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/k2;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$1\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,415:1\n18#2:416\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$1\n*L\n232#1:416\n*E\n"})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.l<kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f80318b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ j<T> f80319c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ k1.h<Object> f80320d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(j<? super T> jVar, k1.h<Object> hVar, kotlin.coroutines.d<? super a> dVar) {
                super(1, dVar);
                this.f80319c = jVar;
                this.f80320d = hVar;
            }

            @Override // ld.l
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((a) create(dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f80319c, this.f80320d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f80318b;
                if (i4 == 0) {
                    a1.n(obj);
                    j<T> jVar = this.f80319c;
                    kotlinx.coroutines.internal.s0 s0Var = kotlinx.coroutines.flow.internal.s.f80148a;
                    T t4 = this.f80320d.f75329b;
                    if (t4 == s0Var) {
                        t4 = null;
                    }
                    this.f80318b = 1;
                    if (jVar.emit(t4, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("蝜\u0001"));
                    }
                    a1.n(obj);
                }
                this.f80320d.f75329b = null;
                return k2.f75408a;
            }
        }

        /* compiled from: Delay.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", i = {0}, l = {242}, m = "invokeSuspend", n = {"$this$onFailure_u2dWpGqRn0$iv"}, s = {"L$0"})
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlinx/coroutines/channels/p;", "", "value", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/p;)V"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$2\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,415:1\n514#2,6:416\n530#2,4:422\n534#2:428\n1#3:426\n18#4:427\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$2\n*L\n238#1:416,6\n239#1:422,4\n239#1:428\n242#1:427\n*E\n"})
        static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.p<? extends Object>, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            Object f80321b;

            /* renamed from: c, reason: collision with root package name */
            int f80322c;

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f80323d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ k1.h<Object> f80324e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ j<T> f80325f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(k1.h<Object> hVar, j<? super T> jVar, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f80324e = hVar;
                this.f80325f = jVar;
            }

            @fg.m
            public final Object a(@fg.l Object obj, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((b) create(kotlinx.coroutines.channels.p.b(obj), dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                b bVar = new b(this.f80324e, this.f80325f, dVar);
                bVar.f80323d = obj;
                return bVar;
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.channels.p<? extends Object> pVar, kotlin.coroutines.d<? super k2> dVar) {
                return a(pVar.getHolder(), dVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                k1.h<Object> hVar;
                k1.h<Object> hVar2;
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f80322c;
                if (i4 == 0) {
                    a1.n(obj);
                    T t4 = (T) ((kotlinx.coroutines.channels.p) this.f80323d).getHolder();
                    hVar = this.f80324e;
                    boolean z4 = t4 instanceof p.c;
                    if (!z4) {
                        hVar.f75329b = t4;
                    }
                    j<T> jVar = this.f80325f;
                    if (z4) {
                        Throwable f4 = kotlinx.coroutines.channels.p.f(t4);
                        if (f4 != null) {
                            throw f4;
                        }
                        Object obj2 = hVar.f75329b;
                        if (obj2 != null) {
                            if (obj2 == kotlinx.coroutines.flow.internal.s.f80148a) {
                                obj2 = null;
                            }
                            this.f80323d = t4;
                            this.f80321b = hVar;
                            this.f80322c = 1;
                            if (jVar.emit(obj2, this) == aVar) {
                                return aVar;
                            }
                            hVar2 = hVar;
                        }
                        hVar.f75329b = (T) kotlinx.coroutines.flow.internal.s.f80150c;
                    }
                    return k2.f75408a;
                }
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("蝝\u0001"));
                }
                hVar2 = (k1.h) this.f80321b;
                a1.n(obj);
                hVar = hVar2;
                hVar.f75329b = (T) kotlinx.coroutines.flow.internal.s.f80150c;
                return k2.f75408a;
            }
        }

        /* compiled from: Delay.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", i = {}, l = {210}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlinx/coroutines/channels/b0;", "", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: kotlinx.coroutines.flow.r$c$c, reason: collision with other inner class name */
        static final class C1245c extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<? super Object>, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f80326b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f80327c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ i<T> f80328d;

            /* compiled from: Delay.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: kotlinx.coroutines.flow.r$c$c$a */
            static final class a<T> implements j {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.channels.b0<Object> f80329b;

                /* compiled from: Delay.kt */
                @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", f = "Delay.kt", i = {}, l = {210}, m = "emit", n = {}, s = {})
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                /* renamed from: kotlinx.coroutines.flow.r$c$c$a$a, reason: collision with other inner class name */
                static final class C1246a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f80330b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ a<T> f80331c;

                    /* renamed from: d, reason: collision with root package name */
                    int f80332d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C1246a(a<? super T> aVar, kotlin.coroutines.d<? super C1246a> dVar) {
                        super(dVar);
                        this.f80331c = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.m
                    public final Object invokeSuspend(@fg.l Object obj) {
                        this.f80330b = obj;
                        this.f80332d |= Integer.MIN_VALUE;
                        return this.f80331c.emit(null, this);
                    }
                }

                a(kotlinx.coroutines.channels.b0<Object> b0Var) {
                    this.f80329b = b0Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // kotlinx.coroutines.flow.j
                @fg.m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T r5, @fg.l kotlin.coroutines.d<? super kotlin.k2> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof kotlinx.coroutines.flow.r.c.C1245c.a.C1246a
                        if (r0 == 0) goto L13
                        r0 = r6
                        kotlinx.coroutines.flow.r$c$c$a$a r0 = (kotlinx.coroutines.flow.r.c.C1245c.a.C1246a) r0
                        int r1 = r0.f80332d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f80332d = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.r$c$c$a$a r0 = new kotlinx.coroutines.flow.r$c$c$a$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.f80330b
                        kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                        int r2 = r0.f80332d
                        r3 = 1
                        if (r2 == 0) goto L33
                        if (r2 != r3) goto L27
                        kotlin.a1.n(r6)
                        goto L45
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "蝞\u0001"
                        java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
                        r5.<init>(r6)
                        throw r5
                    L33:
                        kotlin.a1.n(r6)
                        kotlinx.coroutines.channels.b0<java.lang.Object> r6 = r4.f80329b
                        if (r5 != 0) goto L3c
                        kotlinx.coroutines.internal.s0 r5 = kotlinx.coroutines.flow.internal.s.f80148a
                    L3c:
                        r0.f80332d = r3
                        java.lang.Object r5 = r6.f0(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        kotlin.k2 r5 = kotlin.k2.f75408a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r.c.C1245c.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1245c(i<? extends T> iVar, kotlin.coroutines.d<? super C1245c> dVar) {
                super(2, dVar);
                this.f80328d = iVar;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<Object> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((C1245c) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                C1245c c1245c = new C1245c(this.f80328d, dVar);
                c1245c.f80327c = obj;
                return c1245c;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f80326b;
                if (i4 == 0) {
                    a1.n(obj);
                    kotlinx.coroutines.channels.b0 b0Var = (kotlinx.coroutines.channels.b0) this.f80327c;
                    i<T> iVar = this.f80328d;
                    a aVar2 = new a(b0Var);
                    this.f80326b = 1;
                    if (iVar.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("蝟\u0001"));
                    }
                    a1.n(obj);
                }
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(ld.l<? super T, Long> lVar, i<? extends T> iVar, kotlin.coroutines.d<? super c> dVar) {
            super(3, dVar);
            this.f80316g = lVar;
            this.f80317h = iVar;
        }

        @Override // ld.q
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object R(@fg.l kotlinx.coroutines.r0 r0Var, @fg.l j<? super T> jVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            c cVar = new c(this.f80316g, this.f80317h, dVar);
            cVar.f80314e = r0Var;
            cVar.f80315f = jVar;
            return cVar.invokeSuspend(k2.f75408a);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00ea A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0068  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00e8 -> B:6:0x001c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 238
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: Delay.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3", f = "Delay.kt", i = {0, 1, 2}, l = {w.a.f22419q, w.a.f22421s, 319}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/channels/b0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<? super k2>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f80333b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f80334c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f80335d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f80336e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j4, long j5, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f80335d = j4;
            this.f80336e = j5;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<? super k2> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(this.f80335d, this.f80336e, dVar);
            dVar2.f80334c = obj;
            return dVar2;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0051 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x005e A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x005c -> B:12:0x0041). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r7.f80333b
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2c
                if (r1 == r4) goto L24
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L10
                goto L24
            L10:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "蝢\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                r8.<init>(r0)
                throw r8
            L1c:
                java.lang.Object r1 = r7.f80334c
                kotlinx.coroutines.channels.b0 r1 = (kotlinx.coroutines.channels.b0) r1
                kotlin.a1.n(r8)
                goto L52
            L24:
                java.lang.Object r1 = r7.f80334c
                kotlinx.coroutines.channels.b0 r1 = (kotlinx.coroutines.channels.b0) r1
                kotlin.a1.n(r8)
                goto L41
            L2c:
                kotlin.a1.n(r8)
                java.lang.Object r8 = r7.f80334c
                r1 = r8
                kotlinx.coroutines.channels.b0 r1 = (kotlinx.coroutines.channels.b0) r1
                long r5 = r7.f80335d
                r7.f80334c = r1
                r7.f80333b = r4
                java.lang.Object r8 = kotlinx.coroutines.c1.b(r5, r7)
                if (r8 != r0) goto L41
                return r0
            L41:
                kotlinx.coroutines.channels.e0 r8 = r1.a()
                kotlin.k2 r4 = kotlin.k2.f75408a
                r7.f80334c = r1
                r7.f80333b = r3
                java.lang.Object r8 = r8.f0(r4, r7)
                if (r8 != r0) goto L52
                return r0
            L52:
                long r4 = r7.f80336e
                r7.f80334c = r1
                r7.f80333b = r2
                java.lang.Object r8 = kotlinx.coroutines.c1.b(r4, r7)
                if (r8 != r0) goto L41
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Delay.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", i = {0, 0, 0, 0}, l = {423}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "ticker"}, s = {"L$0", "L$1", "L$2", "L$3"})
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlinx/coroutines/r0;", "Lkotlinx/coroutines/flow/j;", "downstream", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2\n+ 2 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,415:1\n55#2,8:416\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2\n*L\n284#1:416,8\n*E\n"})
    static final class e<T> extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.r0, j<? super T>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f80337b;

        /* renamed from: c, reason: collision with root package name */
        Object f80338c;

        /* renamed from: d, reason: collision with root package name */
        int f80339d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f80340e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80341f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f80342g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ i<T> f80343h;

        /* compiled from: Delay.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlinx/coroutines/channels/p;", "", "result", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/p;)V"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$1\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,415:1\n514#2,6:416\n530#2,4:422\n534#2:427\n1#3:426\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$1\n*L\n287#1:416,6\n288#1:422,4\n288#1:427\n*E\n"})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.p<? extends Object>, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f80344b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f80345c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ k1.h<Object> f80346d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.channels.d0<k2> f80347e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k1.h<Object> hVar, kotlinx.coroutines.channels.d0<k2> d0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f80346d = hVar;
                this.f80347e = d0Var;
            }

            @fg.m
            public final Object a(@fg.l Object obj, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((a) create(kotlinx.coroutines.channels.p.b(obj), dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f80346d, this.f80347e, dVar);
                aVar.f80345c = obj;
                return aVar;
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.channels.p<? extends Object> pVar, kotlin.coroutines.d<? super k2> dVar) {
                return a(pVar.getHolder(), dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                if (this.f80344b != 0) {
                    throw new IllegalStateException(ProtectedSandApp.s("蝣\u0001"));
                }
                a1.n(obj);
                T t4 = (T) ((kotlinx.coroutines.channels.p) this.f80345c).getHolder();
                k1.h<Object> hVar = this.f80346d;
                boolean z4 = t4 instanceof p.c;
                if (!z4) {
                    hVar.f75329b = t4;
                }
                kotlinx.coroutines.channels.d0<k2> d0Var = this.f80347e;
                if (z4) {
                    Throwable f4 = kotlinx.coroutines.channels.p.f(t4);
                    if (f4 != null) {
                        throw f4;
                    }
                    d0Var.b(new ChildCancelledException());
                    hVar.f75329b = (T) kotlinx.coroutines.flow.internal.s.f80150c;
                }
                return k2.f75408a;
            }
        }

        /* compiled from: Delay.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", f = "Delay.kt", i = {}, l = {299}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlin/k2;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$2\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,415:1\n18#2:416\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$2\n*L\n299#1:416\n*E\n"})
        static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<k2, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f80348b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ k1.h<Object> f80349c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ j<T> f80350d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(k1.h<Object> hVar, j<? super T> jVar, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f80349c = hVar;
                this.f80350d = jVar;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l k2 k2Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((b) create(k2Var, dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new b(this.f80349c, this.f80350d, dVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f80348b;
                if (i4 == 0) {
                    a1.n(obj);
                    k1.h<Object> hVar = this.f80349c;
                    Object obj2 = hVar.f75329b;
                    if (obj2 == null) {
                        return k2.f75408a;
                    }
                    hVar.f75329b = null;
                    j<T> jVar = this.f80350d;
                    if (obj2 == kotlinx.coroutines.flow.internal.s.f80148a) {
                        obj2 = null;
                    }
                    this.f80348b = 1;
                    if (jVar.emit(obj2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("蝤\u0001"));
                    }
                    a1.n(obj);
                }
                return k2.f75408a;
            }
        }

        /* compiled from: Delay.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1", f = "Delay.kt", i = {}, l = {279}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlinx/coroutines/channels/b0;", "", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
        static final class c extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<? super Object>, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f80351b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f80352c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ i<T> f80353d;

            /* compiled from: Delay.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            static final class a<T> implements j {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.channels.b0<Object> f80354b;

                /* compiled from: Delay.kt */
                @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1", f = "Delay.kt", i = {}, l = {279}, m = "emit", n = {}, s = {})
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                /* renamed from: kotlinx.coroutines.flow.r$e$c$a$a, reason: collision with other inner class name */
                static final class C1247a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f80355b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ a<T> f80356c;

                    /* renamed from: d, reason: collision with root package name */
                    int f80357d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C1247a(a<? super T> aVar, kotlin.coroutines.d<? super C1247a> dVar) {
                        super(dVar);
                        this.f80356c = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.m
                    public final Object invokeSuspend(@fg.l Object obj) {
                        this.f80355b = obj;
                        this.f80357d |= Integer.MIN_VALUE;
                        return this.f80356c.emit(null, this);
                    }
                }

                a(kotlinx.coroutines.channels.b0<Object> b0Var) {
                    this.f80354b = b0Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // kotlinx.coroutines.flow.j
                @fg.m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T r5, @fg.l kotlin.coroutines.d<? super kotlin.k2> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof kotlinx.coroutines.flow.r.e.c.a.C1247a
                        if (r0 == 0) goto L13
                        r0 = r6
                        kotlinx.coroutines.flow.r$e$c$a$a r0 = (kotlinx.coroutines.flow.r.e.c.a.C1247a) r0
                        int r1 = r0.f80357d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f80357d = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.r$e$c$a$a r0 = new kotlinx.coroutines.flow.r$e$c$a$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.f80355b
                        kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                        int r2 = r0.f80357d
                        r3 = 1
                        if (r2 == 0) goto L33
                        if (r2 != r3) goto L27
                        kotlin.a1.n(r6)
                        goto L45
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "蝥\u0001"
                        java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
                        r5.<init>(r6)
                        throw r5
                    L33:
                        kotlin.a1.n(r6)
                        kotlinx.coroutines.channels.b0<java.lang.Object> r6 = r4.f80354b
                        if (r5 != 0) goto L3c
                        kotlinx.coroutines.internal.s0 r5 = kotlinx.coroutines.flow.internal.s.f80148a
                    L3c:
                        r0.f80357d = r3
                        java.lang.Object r5 = r6.f0(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        kotlin.k2 r5 = kotlin.k2.f75408a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r.e.c.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(i<? extends T> iVar, kotlin.coroutines.d<? super c> dVar) {
                super(2, dVar);
                this.f80353d = iVar;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<Object> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((c) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                c cVar = new c(this.f80353d, dVar);
                cVar.f80352c = obj;
                return cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f80351b;
                if (i4 == 0) {
                    a1.n(obj);
                    kotlinx.coroutines.channels.b0 b0Var = (kotlinx.coroutines.channels.b0) this.f80352c;
                    i<T> iVar = this.f80353d;
                    a aVar2 = new a(b0Var);
                    this.f80351b = 1;
                    if (iVar.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("蝦\u0001"));
                    }
                    a1.n(obj);
                }
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(long j4, i<? extends T> iVar, kotlin.coroutines.d<? super e> dVar) {
            super(3, dVar);
            this.f80342g = j4;
            this.f80343h = iVar;
        }

        @Override // ld.q
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object R(@fg.l kotlinx.coroutines.r0 r0Var, @fg.l j<? super T> jVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            e eVar = new e(this.f80342g, this.f80343h, dVar);
            eVar.f80340e = r0Var;
            eVar.f80341f = jVar;
            return eVar.invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            j jVar;
            kotlinx.coroutines.channels.d0 d0Var;
            k1.h hVar;
            kotlinx.coroutines.channels.d0 g4;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f80339d;
            if (i4 == 0) {
                a1.n(obj);
                kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f80340e;
                j jVar2 = (j) this.f80341f;
                kotlinx.coroutines.channels.d0 h4 = kotlinx.coroutines.channels.z.h(r0Var, null, -1, new c(this.f80343h, null), 1, null);
                k1.h hVar2 = new k1.h();
                jVar = jVar2;
                d0Var = h4;
                hVar = hVar2;
                g4 = r.g(r0Var, this.f80342g, 0L, 2, null);
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("蝧\u0001"));
                }
                g4 = (kotlinx.coroutines.channels.d0) this.f80338c;
                hVar = (k1.h) this.f80337b;
                d0Var = (kotlinx.coroutines.channels.d0) this.f80341f;
                jVar = (j) this.f80340e;
                a1.n(obj);
            }
            while (hVar.f75329b != kotlinx.coroutines.flow.internal.s.f80150c) {
                kotlinx.coroutines.selects.l lVar = new kotlinx.coroutines.selects.l(getF75269b());
                lVar.c(d0Var.Q(), new a(hVar, g4, null));
                lVar.c(g4.P(), new b(hVar, jVar, null));
                this.f80340e = jVar;
                this.f80341f = d0Var;
                this.f80337b = hVar;
                this.f80338c = g4;
                this.f80339d = 1;
                if (lVar.W(this) == aVar) {
                    return aVar;
                }
            }
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Delay.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1", f = "Delay.kt", i = {0, 0}, l = {424}, m = "invokeSuspend", n = {"downStream", "values"}, s = {"L$0", "L$1"})
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlinx/coroutines/r0;", "Lkotlinx/coroutines/flow/j;", "downStream", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1\n+ 2 WhileSelect.kt\nkotlinx/coroutines/selects/WhileSelectKt\n+ 3 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,415:1\n31#2:416\n32#2:425\n55#3,8:417\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1\n*L\n401#1:416\n401#1:425\n401#1:417,8\n*E\n"})
    static final class f<T> extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.r0, j<? super T>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        long f80358b;

        /* renamed from: c, reason: collision with root package name */
        int f80359c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f80360d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f80361e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f80362f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ i<T> f80363g;

        /* compiled from: Delay.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", f = "Delay.kt", i = {0}, l = {404}, m = "invokeSuspend", n = {"$this$onSuccess_u2dWpGqRn0$iv"}, s = {"L$0"})
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlinx/coroutines/channels/p;", "value", "", "<anonymous>", "(Lkotlinx/coroutines/channels/p;)Z"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1$1$1\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n*L\n1#1,415:1\n514#2,6:416\n548#2,5:422\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1$1$1\n*L\n403#1:416,6\n405#1:422,5\n*E\n"})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.p<? extends T>, kotlin.coroutines.d<? super Boolean>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f80364b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f80365c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ j<T> f80366d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(j<? super T> jVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f80366d = jVar;
            }

            @fg.m
            public final Object a(@fg.l Object obj, @fg.m kotlin.coroutines.d<? super Boolean> dVar) {
                return ((a) create(kotlinx.coroutines.channels.p.b(obj), dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f80366d, dVar);
                aVar.f80365c = obj;
                return aVar;
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, kotlin.coroutines.d<? super Boolean> dVar) {
                return a(((kotlinx.coroutines.channels.p) obj).getHolder(), dVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x003e  */
            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r5) {
                /*
                    r4 = this;
                    kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r1 = r4.f80364b
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto Lf
                    java.lang.Object r0 = r4.f80365c
                    kotlin.a1.n(r5)
                    goto L38
                Lf:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "蝨\u0001"
                    java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                    r5.<init>(r0)
                    throw r5
                L1b:
                    kotlin.a1.n(r5)
                    java.lang.Object r5 = r4.f80365c
                    kotlinx.coroutines.channels.p r5 = (kotlinx.coroutines.channels.p) r5
                    java.lang.Object r5 = r5.getHolder()
                    kotlinx.coroutines.flow.j<T> r1 = r4.f80366d
                    boolean r3 = r5 instanceof kotlinx.coroutines.channels.p.c
                    if (r3 != 0) goto L39
                    r4.f80365c = r5
                    r4.f80364b = r2
                    java.lang.Object r1 = r1.emit(r5, r4)
                    if (r1 != r0) goto L37
                    return r0
                L37:
                    r0 = r5
                L38:
                    r5 = r0
                L39:
                    boolean r0 = r5 instanceof kotlinx.coroutines.channels.p.a
                    if (r0 == 0) goto L44
                    kotlinx.coroutines.channels.p.f(r5)
                    java.lang.Boolean r5 = java.lang.Boolean.FALSE
                    return r5
                L44:
                    java.lang.Boolean r5 = java.lang.Boolean.TRUE
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: Delay.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2", f = "Delay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
        static final class b extends kotlin.coroutines.jvm.internal.o implements ld.l<kotlin.coroutines.d<?>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f80367b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f80368c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(long j4, kotlin.coroutines.d<? super b> dVar) {
                super(1, dVar);
                this.f80368c = j4;
            }

            @Override // ld.l
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.m kotlin.coroutines.d<?> dVar) {
                return ((b) create(dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.l kotlin.coroutines.d<?> dVar) {
                return new b(this.f80368c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                if (this.f80367b != 0) {
                    throw new IllegalStateException(ProtectedSandApp.s("蝩\u0001"));
                }
                a1.n(obj);
                throw new TimeoutCancellationException(ProtectedSandApp.s("蝪\u0001") + ((Object) kotlin.time.e.w0(this.f80368c)), null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(long j4, i<? extends T> iVar, kotlin.coroutines.d<? super f> dVar) {
            super(3, dVar);
            this.f80362f = j4;
            this.f80363g = iVar;
        }

        @Override // ld.q
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object R(@fg.l kotlinx.coroutines.r0 r0Var, @fg.l j<? super T> jVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            f fVar = new f(this.f80362f, this.f80363g, dVar);
            fVar.f80360d = r0Var;
            fVar.f80361e = jVar;
            return fVar.invokeSuspend(k2.f75408a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x007b A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0079 -> B:5:0x007c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r10) {
            /*
                r9 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r9.f80359c
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L24
                if (r1 != r2) goto L18
                long r4 = r9.f80358b
                java.lang.Object r1 = r9.f80361e
                kotlinx.coroutines.channels.d0 r1 = (kotlinx.coroutines.channels.d0) r1
                java.lang.Object r6 = r9.f80360d
                kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.j) r6
                kotlin.a1.n(r10)
                goto L7c
            L18:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "蝫\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                r10.<init>(r0)
                throw r10
            L24:
                kotlin.a1.n(r10)
                java.lang.Object r10 = r9.f80360d
                kotlinx.coroutines.r0 r10 = (kotlinx.coroutines.r0) r10
                java.lang.Object r1 = r9.f80361e
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                long r4 = r9.f80362f
                kotlin.time.e$a r6 = kotlin.time.e.INSTANCE
                r6.getClass()
                long r6 = kotlin.time.e.c()
                int r4 = kotlin.time.e.h(r4, r6)
                if (r4 <= 0) goto L87
                kotlinx.coroutines.flow.i<T> r4 = r9.f80363g
                r5 = 0
                r6 = 2
                kotlinx.coroutines.flow.i r4 = kotlinx.coroutines.flow.p.d(r4, r5, r3, r6, r3)
                kotlinx.coroutines.channels.d0 r10 = kotlinx.coroutines.flow.m.f(r4, r10)
                long r4 = r9.f80362f
                r6 = r1
                r1 = r10
            L50:
                kotlinx.coroutines.selects.l r10 = new kotlinx.coroutines.selects.l
                kotlin.coroutines.g r7 = r9.getF75269b()
                r10.<init>(r7)
                kotlinx.coroutines.selects.g r7 = r1.Q()
                kotlinx.coroutines.flow.r$f$a r8 = new kotlinx.coroutines.flow.r$f$a
                r8.<init>(r6, r3)
                r10.c(r7, r8)
                kotlinx.coroutines.flow.r$f$b r7 = new kotlinx.coroutines.flow.r$f$b
                r7.<init>(r4, r3)
                kotlinx.coroutines.selects.b.b(r10, r4, r7)
                r9.f80360d = r6
                r9.f80361e = r1
                r9.f80358b = r4
                r9.f80359c = r2
                java.lang.Object r10 = r10.W(r9)
                if (r10 != r0) goto L7c
                return r0
            L7c:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 != 0) goto L50
                kotlin.k2 r10 = kotlin.k2.f75408a
                return r10
            L87:
                kotlinx.coroutines.TimeoutCancellationException r10 = new kotlinx.coroutines.TimeoutCancellationException
                java.lang.String r0 = "蝬\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                r10.<init>(r0, r3)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    @a2
    public static final <T> i<T> a(@fg.l i<? extends T> iVar, long j4) {
        if (j4 >= 0) {
            return j4 == 0 ? iVar : e(iVar, new a(j4));
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("蝰\u0001"));
    }

    @fg.l
    @kotlin.p0
    @a2
    public static final <T> i<T> b(@fg.l i<? extends T> iVar, @fg.l ld.l<? super T, Long> lVar) {
        return e(iVar, lVar);
    }

    @fg.l
    @a2
    public static final <T> i<T> c(@fg.l i<? extends T> iVar, long j4) {
        return a(iVar, c1.e(j4));
    }

    @fg.l
    @kd.i(name = "debounceDuration")
    @kotlin.p0
    @a2
    public static final <T> i<T> d(@fg.l i<? extends T> iVar, @fg.l ld.l<? super T, kotlin.time.e> lVar) {
        return e(iVar, new b(lVar));
    }

    private static final <T> i<T> e(i<? extends T> iVar, ld.l<? super T, Long> lVar) {
        return new n.a(new c(lVar, iVar, null));
    }

    @fg.l
    public static final kotlinx.coroutines.channels.d0<k2> f(@fg.l kotlinx.coroutines.r0 r0Var, long j4, long j5) {
        String s4 = ProtectedSandApp.s("蝱\u0001");
        if (j4 < 0) {
            throw new IllegalArgumentException(androidx.compose.ui.input.pointer.s.a(ProtectedSandApp.s("蝳\u0001"), j4, s4).toString());
        }
        if (j5 >= 0) {
            return kotlinx.coroutines.channels.z.h(r0Var, null, 0, new d(j5, j4, null), 1, null);
        }
        throw new IllegalArgumentException(androidx.compose.ui.input.pointer.s.a(ProtectedSandApp.s("蝲\u0001"), j5, s4).toString());
    }

    public static kotlinx.coroutines.channels.d0 g(kotlinx.coroutines.r0 r0Var, long j4, long j5, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j5 = j4;
        }
        return f(r0Var, j4, j5);
    }

    @fg.l
    @a2
    public static final <T> i<T> h(@fg.l i<? extends T> iVar, long j4) {
        if (j4 > 0) {
            return new n.a(new e(j4, iVar, null));
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("蝴\u0001"));
    }

    @fg.l
    @a2
    public static final <T> i<T> i(@fg.l i<? extends T> iVar, long j4) {
        return h(iVar, c1.e(j4));
    }

    @fg.l
    @a2
    public static final <T> i<T> j(@fg.l i<? extends T> iVar, long j4) {
        return k(iVar, j4);
    }

    private static final <T> i<T> k(i<? extends T> iVar, long j4) {
        return new n.a(new f(j4, iVar, null));
    }
}
