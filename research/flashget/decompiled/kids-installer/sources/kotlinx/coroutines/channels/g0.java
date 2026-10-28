package kotlinx.coroutines.channels;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.m2;
import kotlinx.coroutines.c2;
import kotlinx.coroutines.i2;
import kotlinx.coroutines.internal.q0;

/* compiled from: Channel.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0013\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0001\u0010\u0004J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH¦\u0002J\u001a\u0010\u000e\u001a\u00020\r2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bH&J\b\u0010\u000f\u001a\u00020\rH\u0017J\u0014\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0010H'J\u0011\u0010\u0013\u001a\u0004\u0018\u00018\u0000H\u0017¢\u0006\u0004\b\u0013\u0010\u0007J\u0015\u0010\u0014\u001a\u0004\u0018\u00018\u0000H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00118&X§\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00118&X§\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001a\u0010\u0016R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR#\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u001c8&X¦\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\"\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001c8VX\u0097\u0004¢\u0006\f\u0012\u0004\b#\u0010\u0018\u001a\u0004\b\"\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Lkotlinx/coroutines/channels/g0;", "E", "", "N", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/r;", "A", "()Ljava/lang/Object;", "Lkotlinx/coroutines/channels/p;", "iterator", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Lkotlin/m2;", "e", "cancel", "", "", "a", "poll", "C", "f", "()Z", "isClosedForReceive$annotations", "()V", "isClosedForReceive", "isEmpty", "isEmpty$annotations", "Lkotlinx/coroutines/selects/d;", "h", "()Lkotlinx/coroutines/selects/d;", "onReceive", "p", "onReceiveCatching", "q", "getOnReceiveOrNull$annotations", "onReceiveOrNull", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public interface g0<E> {

    /* compiled from: Channel.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {

        /* compiled from: Channel.kt */
        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001JL\u0010\n\u001a\u00020\t\"\u0004\b\u0001\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032$\u0010\b\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0017ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"kotlinx/coroutines/channels/g0$a$a", "Lkotlinx/coroutines/selects/d;", "R", "Lkotlinx/coroutines/selects/f;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "block", "Lkotlin/m2;", "L", "(Lkotlinx/coroutines/selects/f;Lq3/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
        /* renamed from: kotlinx.coroutines.channels.g0$a$a, reason: collision with other inner class name */
        public static final class C0409a implements kotlinx.coroutines.selects.d<E> {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ g0<E> f27332o;

            /* JADX INFO: Add missing generic type declarations: [R] */
            /* compiled from: Channel.kt */
            @DebugMetadata(c = "kotlinx.coroutines.channels.ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1", f = "Channel.kt", i = {}, l = {375}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001 \u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"R", "E", "Lkotlinx/coroutines/channels/r;", "it", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            /* renamed from: kotlinx.coroutines.channels.g0$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            static final class C0410a<R> extends SuspendLambda implements q3.p<r<? extends E>, Continuation<? super R>, Object> {

                /* renamed from: s, reason: collision with root package name */
                int f27333s;

                /* renamed from: t, reason: collision with root package name */
                /* synthetic */ Object f27334t;

                /* renamed from: u, reason: collision with root package name */
                final /* synthetic */ q3.p<E, Continuation<? super R>, Object> f27335u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0410a(q3.p<? super E, ? super Continuation<? super R>, ? extends Object> pVar, Continuation<? super C0410a> continuation) {
                    super(2, continuation);
                    this.f27335u = pVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @d5.e
                public final Object A(@d5.d Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i5 = this.f27333s;
                    if (i5 == 0) {
                        a1.n(obj);
                        Object holder = ((r) this.f27334t).getHolder();
                        Throwable f6 = r.f(holder);
                        if (f6 != null) {
                            throw f6;
                        }
                        q3.p<E, Continuation<? super R>, Object> pVar = this.f27335u;
                        Object h5 = r.h(holder);
                        this.f27333s = 1;
                        obj = pVar.g0(h5, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException(ProtectedSandApp.s("邎"));
                        }
                        a1.n(obj);
                    }
                    return obj;
                }

                @d5.e
                public final Object R(@d5.d Object obj, @d5.e Continuation<? super R> continuation) {
                    return ((C0410a) c(r.b(obj), continuation)).A(m2.f23662a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @d5.d
                public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
                    C0410a c0410a = new C0410a(this.f27335u, continuation);
                    c0410a.f27334t = obj;
                    return c0410a;
                }

                @Override // q3.p
                public /* bridge */ /* synthetic */ Object g0(Object obj, Object obj2) {
                    return R(((r) obj).getHolder(), (Continuation) obj2);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C0409a(g0<? extends E> g0Var) {
                this.f27332o = g0Var;
            }

            @Override // kotlinx.coroutines.selects.d
            @i2
            public <R> void L(@d5.d kotlinx.coroutines.selects.f<? super R> select, @d5.d q3.p<? super E, ? super Continuation<? super R>, ? extends Object> block) {
                this.f27332o.p().L(select, new C0410a(block, null));
            }
        }

        /* compiled from: Channel.kt */
        @DebugMetadata(c = "kotlinx.coroutines.channels.ReceiveChannel$DefaultImpls", f = "Channel.kt", i = {}, l = {354}, m = "receiveOrNull", n = {}, s = {})
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes6.dex */
        static final class b<E> extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f27336r;

            /* renamed from: s, reason: collision with root package name */
            int f27337s;

            b(Continuation<? super b> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                this.f27336r = obj;
                this.f27337s |= Integer.MIN_VALUE;
                return a.i(null, this);
            }
        }

        public static /* synthetic */ void b(g0 g0Var, CancellationException cancellationException, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("岼"));
            }
            if ((i5 & 1) != 0) {
                cancellationException = null;
            }
            g0Var.e(cancellationException);
        }

        public static /* synthetic */ boolean c(g0 g0Var, Throwable th, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("岽"));
            }
            if ((i5 & 1) != 0) {
                th = null;
            }
            return g0Var.a(th);
        }

        @d5.d
        public static <E> kotlinx.coroutines.selects.d<E> d(@d5.d g0<? extends E> g0Var) {
            return new C0409a(g0Var);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in favor of onReceiveCatching extension", replaceWith = @ReplaceWith(expression = "onReceiveCatching", imports = {}))
        public static /* synthetic */ void e() {
        }

        @c2
        public static /* synthetic */ void f() {
        }

        @c2
        public static /* synthetic */ void g() {
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
        @d5.e
        public static <E> E h(@d5.d g0<? extends E> g0Var) {
            Object A = g0Var.A();
            if (r.m(A)) {
                return (E) r.i(A);
            }
            Throwable f6 = r.f(A);
            if (f6 == null) {
                return null;
            }
            throw q0.p(f6);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @kotlin.internal.LowPriorityInOverloadResolution
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @kotlin.ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static <E> java.lang.Object i(@d5.d kotlinx.coroutines.channels.g0<? extends E> r4, @d5.d kotlin.coroutines.Continuation<? super E> r5) {
            /*
                boolean r0 = r5 instanceof kotlinx.coroutines.channels.g0.a.b
                if (r0 == 0) goto L13
                r0 = r5
                kotlinx.coroutines.channels.g0$a$b r0 = (kotlinx.coroutines.channels.g0.a.b) r0
                int r1 = r0.f27337s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f27337s = r1
                goto L18
            L13:
                kotlinx.coroutines.channels.g0$a$b r0 = new kotlinx.coroutines.channels.g0$a$b
                r0.<init>(r5)
            L18:
                java.lang.Object r5 = r0.f27336r
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f27337s
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L2d
                kotlin.a1.n(r5)
                kotlinx.coroutines.channels.r r5 = (kotlinx.coroutines.channels.r) r5
                java.lang.Object r4 = r5.getHolder()
                goto L45
            L2d:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "岾"
                java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
                r4.<init>(r5)
                throw r4
            L39:
                kotlin.a1.n(r5)
                r0.f27337s = r3
                java.lang.Object r4 = r4.E(r0)
                if (r4 != r1) goto L45
                return r1
            L45:
                java.lang.Object r4 = kotlinx.coroutines.channels.r.h(r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.g0.a.i(kotlinx.coroutines.channels.g0, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @d5.d
    Object A();

    @LowPriorityInOverloadResolution
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    @d5.e
    Object C(@d5.d Continuation<? super E> continuation);

    @d5.e
    Object E(@d5.d Continuation<? super r<? extends E>> continuation);

    @d5.e
    Object N(@d5.d Continuation<? super E> continuation);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ boolean a(Throwable cause);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    void e(@d5.e CancellationException cancellationException);

    boolean f();

    @d5.d
    kotlinx.coroutines.selects.d<E> h();

    boolean isEmpty();

    @d5.d
    p<E> iterator();

    @d5.d
    kotlinx.coroutines.selects.d<r<E>> p();

    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
    @d5.e
    E poll();

    @d5.d
    kotlinx.coroutines.selects.d<E> q();
}
