package kotlinx.coroutines.channels;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.a3;
import kotlinx.coroutines.b2;
import kotlinx.coroutines.j1;

/* compiled from: TickerChannels.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001a1\u0010\r\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a1\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"", "delayMillis", "initialDelayMillis", "Lkotlin/coroutines/g;", "context", "Lkotlinx/coroutines/channels/g0;", "mode", "Lkotlinx/coroutines/channels/d0;", "Lkotlin/k2;", "e", "(JJLkotlin/coroutines/g;Lkotlinx/coroutines/channels/g0;)Lkotlinx/coroutines/channels/d0;", "Lkotlinx/coroutines/channels/e0;", "channel", "d", "(JJLkotlinx/coroutines/channels/e0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "c", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTickerChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TickerChannels.kt\nkotlinx/coroutines/channels/TickerChannelsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
/* loaded from: classes7.dex */
public final class f0 {

    /* compiled from: TickerChannels.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 1, 1, 2, 2}, l = {106, 108, 109}, m = "fixedDelayTicker", n = {"channel", "delayMillis", "channel", "delayMillis", "channel", "delayMillis"}, s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        long f79301b;

        /* renamed from: c, reason: collision with root package name */
        Object f79302c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f79303d;

        /* renamed from: e, reason: collision with root package name */
        int f79304e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f79303d = obj;
            this.f79304e |= Integer.MIN_VALUE;
            return f0.c(0L, 0L, null, this);
        }
    }

    /* compiled from: TickerChannels.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, l = {84, 88, 94, 96}, m = "fixedPeriodTicker", n = {"channel", "delayMillis", "deadline", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs"}, s = {"L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        long f79305b;

        /* renamed from: c, reason: collision with root package name */
        long f79306c;

        /* renamed from: d, reason: collision with root package name */
        Object f79307d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f79308e;

        /* renamed from: f, reason: collision with root package name */
        int f79309f;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f79308e = obj;
            this.f79309f |= Integer.MIN_VALUE;
            return f0.d(0L, 0L, null, this);
        }
    }

    /* compiled from: TickerChannels.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", f = "TickerChannels.kt", i = {}, l = {72, 73}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/channels/b0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.coroutines.jvm.internal.o implements ld.p<b0<? super k2>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f79310b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f79311c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ g0 f79312d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f79313e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f79314f;

        /* compiled from: TickerChannels.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f79315a;

            static {
                int[] iArr = new int[g0.values().length];
                try {
                    iArr[g0.FIXED_PERIOD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[g0.FIXED_DELAY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f79315a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(g0 g0Var, long j4, long j5, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f79312d = g0Var;
            this.f79313e = j4;
            this.f79314f = j5;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l b0<? super k2> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f79312d, this.f79313e, this.f79314f, dVar);
            cVar.f79311c = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f79310b;
            if (i4 == 0) {
                a1.n(obj);
                b0 b0Var = (b0) this.f79311c;
                int i5 = a.f79315a[this.f79312d.ordinal()];
                if (i5 == 1) {
                    long j4 = this.f79313e;
                    long j5 = this.f79314f;
                    e0 a5 = b0Var.a();
                    this.f79310b = 1;
                    if (f0.d(j4, j5, a5, this) == aVar) {
                        return aVar;
                    }
                } else if (i5 == 2) {
                    long j6 = this.f79313e;
                    long j7 = this.f79314f;
                    e0 a6 = b0Var.a();
                    this.f79310b = 2;
                    if (f0.c(j6, j7, a6, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i4 != 1 && i4 != 2) {
                    throw new IllegalStateException(ProtectedSandApp.s("蘝\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
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
    public static final java.lang.Object c(long r6, long r8, kotlinx.coroutines.channels.e0<? super kotlin.k2> r10, kotlin.coroutines.d<? super kotlin.k2> r11) {
        /*
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.f0.a
            if (r0 == 0) goto L13
            r0 = r11
            kotlinx.coroutines.channels.f0$a r0 = (kotlinx.coroutines.channels.f0.a) r0
            int r1 = r0.f79304e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79304e = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.f0$a r0 = new kotlinx.coroutines.channels.f0$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f79303d
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f79304e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L55
            if (r2 == r5) goto L4a
            if (r2 == r4) goto L40
            if (r2 != r3) goto L34
            long r6 = r0.f79301b
            java.lang.Object r8 = r0.f79302c
            kotlinx.coroutines.channels.e0 r8 = (kotlinx.coroutines.channels.e0) r8
            kotlin.a1.n(r11)
        L32:
            r10 = r8
            goto L65
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "蘞\u0001"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
            r6.<init>(r7)
            throw r6
        L40:
            long r6 = r0.f79301b
            java.lang.Object r8 = r0.f79302c
            kotlinx.coroutines.channels.e0 r8 = (kotlinx.coroutines.channels.e0) r8
            kotlin.a1.n(r11)
            goto L75
        L4a:
            long r6 = r0.f79301b
            java.lang.Object r8 = r0.f79302c
            r10 = r8
            kotlinx.coroutines.channels.e0 r10 = (kotlinx.coroutines.channels.e0) r10
            kotlin.a1.n(r11)
            goto L65
        L55:
            kotlin.a1.n(r11)
            r0.f79302c = r10
            r0.f79301b = r6
            r0.f79304e = r5
            java.lang.Object r8 = kotlinx.coroutines.c1.b(r8, r0)
            if (r8 != r1) goto L65
            return r1
        L65:
            kotlin.k2 r8 = kotlin.k2.f75408a
            r0.f79302c = r10
            r0.f79301b = r6
            r0.f79304e = r4
            java.lang.Object r8 = r10.f0(r8, r0)
            if (r8 != r1) goto L74
            return r1
        L74:
            r8 = r10
        L75:
            r0.f79302c = r8
            r0.f79301b = r6
            r0.f79304e = r3
            java.lang.Object r9 = kotlinx.coroutines.c1.b(r6, r0)
            if (r9 != r1) goto L32
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.f0.c(long, long, kotlinx.coroutines.channels.e0, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0116 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00fe -> B:15:0x00ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0114 -> B:13:0x003b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(long r18, long r20, kotlinx.coroutines.channels.e0<? super kotlin.k2> r22, kotlin.coroutines.d<? super kotlin.k2> r23) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.f0.d(long, long, kotlinx.coroutines.channels.e0, kotlin.coroutines.d):java.lang.Object");
    }

    @fg.l
    @a3
    public static final d0<k2> e(long j4, long j5, @fg.l kotlin.coroutines.g gVar, @fg.l g0 g0Var) {
        String s4 = ProtectedSandApp.s("蘟\u0001");
        if (j4 < 0) {
            throw new IllegalArgumentException(androidx.compose.ui.input.pointer.s.a(ProtectedSandApp.s("蘡\u0001"), j4, s4).toString());
        }
        if (j5 >= 0) {
            return z.e(b2.f79269b, j1.g().O(gVar), 0, new c(g0Var, j4, j5, null));
        }
        throw new IllegalArgumentException(androidx.compose.ui.input.pointer.s.a(ProtectedSandApp.s("蘠\u0001"), j5, s4).toString());
    }

    public static /* synthetic */ d0 f(long j4, long j5, kotlin.coroutines.g gVar, g0 g0Var, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j5 = j4;
        }
        if ((i4 & 4) != 0) {
            gVar = kotlin.coroutines.i.f75057b;
        }
        if ((i4 & 8) != 0) {
            g0Var = g0.FIXED_PERIOD;
        }
        return e(j4, j5, gVar, g0Var);
    }
}
