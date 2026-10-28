package kotlinx.coroutines.channels;

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
import kotlinx.coroutines.d3;
import kotlinx.coroutines.e2;
import kotlinx.coroutines.m1;

/* compiled from: TickerChannels.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007\u001a1\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a1\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"", "delayMillis", "initialDelayMillis", "Lkotlin/coroutines/g;", "context", "Lkotlinx/coroutines/channels/o0;", "mode", "Lkotlinx/coroutines/channels/g0;", "Lkotlin/m2;", "e", "Lkotlinx/coroutines/channels/k0;", "channel", "d", "(JJLkotlinx/coroutines/channels/k0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "c", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class n0 {

    /* compiled from: TickerChannels.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 1, 1, 2, 2}, l = {106, 108, 109}, m = "fixedDelayTicker", n = {"channel", "delayMillis", "channel", "delayMillis", "channel", "delayMillis"}, s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class a extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        long f27368r;

        /* renamed from: s, reason: collision with root package name */
        Object f27369s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f27370t;

        /* renamed from: u, reason: collision with root package name */
        int f27371u;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f27370t = obj;
            this.f27371u |= Integer.MIN_VALUE;
            return n0.c(0L, 0L, null, this);
        }
    }

    /* compiled from: TickerChannels.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, l = {84, 88, 94, 96}, m = "fixedPeriodTicker", n = {"channel", "delayMillis", "deadline", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs"}, s = {"L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class b extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        long f27372r;

        /* renamed from: s, reason: collision with root package name */
        long f27373s;

        /* renamed from: t, reason: collision with root package name */
        Object f27374t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f27375u;

        /* renamed from: v, reason: collision with root package name */
        int f27376v;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f27375u = obj;
            this.f27376v |= Integer.MIN_VALUE;
            return n0.d(0L, 0L, null, this);
        }
    }

    /* compiled from: TickerChannels.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", f = "TickerChannels.kt", i = {}, l = {72, 73}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/channels/e0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class c extends SuspendLambda implements q3.p<e0<? super m2>, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f27377s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f27378t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ o0 f27379u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ long f27380v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ long f27381w;

        /* compiled from: TickerChannels.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f27382a;

            static {
                int[] iArr = new int[o0.values().length];
                iArr[o0.FIXED_PERIOD.ordinal()] = 1;
                iArr[o0.FIXED_DELAY.ordinal()] = 2;
                f27382a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(o0 o0Var, long j5, long j6, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f27379u = o0Var;
            this.f27380v = j5;
            this.f27381w = j6;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f27377s;
            if (i5 == 0) {
                a1.n(obj);
                e0 e0Var = (e0) this.f27378t;
                int i6 = a.f27382a[this.f27379u.ordinal()];
                if (i6 == 1) {
                    long j5 = this.f27380v;
                    long j6 = this.f27381w;
                    k0 g5 = e0Var.g();
                    this.f27377s = 1;
                    if (n0.d(j5, j6, g5, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (i6 == 2) {
                    long j7 = this.f27380v;
                    long j8 = this.f27381w;
                    k0 g6 = e0Var.g();
                    this.f27377s = 2;
                    if (n0.c(j7, j8, g6, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i5 != 1 && i5 != 2) {
                    throw new IllegalStateException(ProtectedSandApp.s("邚"));
                }
                a1.n(obj);
            }
            return m2.f23662a;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d e0<? super m2> e0Var, @d5.e Continuation<? super m2> continuation) {
            return ((c) c(e0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            c cVar = new c(this.f27379u, this.f27380v, this.f27381w, continuation);
            cVar.f27378t = obj;
            return cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007f -> B:12:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(long r6, long r8, kotlinx.coroutines.channels.k0<? super kotlin.m2> r10, kotlin.coroutines.Continuation<? super kotlin.m2> r11) {
        /*
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.n0.a
            if (r0 == 0) goto L13
            r0 = r11
            kotlinx.coroutines.channels.n0$a r0 = (kotlinx.coroutines.channels.n0.a) r0
            int r1 = r0.f27371u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27371u = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.n0$a r0 = new kotlinx.coroutines.channels.n0$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f27370t
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f27371u
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L55
            if (r2 == r5) goto L4a
            if (r2 == r4) goto L40
            if (r2 != r3) goto L34
            long r6 = r0.f27368r
            java.lang.Object r8 = r0.f27369s
            kotlinx.coroutines.channels.k0 r8 = (kotlinx.coroutines.channels.k0) r8
            kotlin.a1.n(r11)
        L32:
            r10 = r8
            goto L65
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "峉"
            java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)
            r6.<init>(r7)
            throw r6
        L40:
            long r6 = r0.f27368r
            java.lang.Object r8 = r0.f27369s
            kotlinx.coroutines.channels.k0 r8 = (kotlinx.coroutines.channels.k0) r8
            kotlin.a1.n(r11)
            goto L75
        L4a:
            long r6 = r0.f27368r
            java.lang.Object r8 = r0.f27369s
            r10 = r8
            kotlinx.coroutines.channels.k0 r10 = (kotlinx.coroutines.channels.k0) r10
            kotlin.a1.n(r11)
            goto L65
        L55:
            kotlin.a1.n(r11)
            r0.f27369s = r10
            r0.f27368r = r6
            r0.f27371u = r5
            java.lang.Object r8 = kotlinx.coroutines.f1.b(r8, r0)
            if (r8 != r1) goto L65
            return r1
        L65:
            kotlin.m2 r8 = kotlin.m2.f23662a
            r0.f27369s = r10
            r0.f27368r = r6
            r0.f27371u = r4
            java.lang.Object r8 = r10.a0(r8, r0)
            if (r8 != r1) goto L74
            return r1
        L74:
            r8 = r10
        L75:
            r0.f27369s = r8
            r0.f27368r = r6
            r0.f27371u = r3
            java.lang.Object r9 = kotlinx.coroutines.f1.b(r6, r0)
            if (r9 != r1) goto L32
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.n0.c(long, long, kotlinx.coroutines.channels.k0, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00e9 -> B:17:0x0098). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00fd -> B:16:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(long r19, long r21, kotlinx.coroutines.channels.k0<? super kotlin.m2> r23, kotlin.coroutines.Continuation<? super kotlin.m2> r24) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.n0.d(long, long, kotlinx.coroutines.channels.k0, kotlin.coroutines.d):java.lang.Object");
    }

    @d3
    @d5.d
    public static final g0<m2> e(long j5, long j6, @d5.d CoroutineContext coroutineContext, @d5.d o0 o0Var) {
        boolean z5 = j5 >= 0;
        String s5 = ProtectedSandApp.s("峋");
        if (!z5) {
            throw new IllegalArgumentException((ProtectedSandApp.s("峍") + j5 + s5).toString());
        }
        if (j6 >= 0) {
            return c0.e(e2.f27717o, m1.g().B(coroutineContext), 0, new c(o0Var, j5, j6, null));
        }
        throw new IllegalArgumentException((ProtectedSandApp.s("峌") + j6 + s5).toString());
    }

    public static /* synthetic */ g0 f(long j5, long j6, CoroutineContext coroutineContext, o0 o0Var, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            j6 = j5;
        }
        if ((i5 & 4) != 0) {
            coroutineContext = EmptyCoroutineContext.f23294o;
        }
        if ((i5 & 8) != 0) {
            o0Var = o0.FIXED_PERIOD;
        }
        return e(j5, j6, coroutineContext, o0Var);
    }
}
