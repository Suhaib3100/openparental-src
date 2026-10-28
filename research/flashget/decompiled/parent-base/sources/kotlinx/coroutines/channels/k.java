package kotlinx.coroutines.channels;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.k2;
import kotlinx.coroutines.internal.s0;
import kotlinx.coroutines.internal.x0;

/* compiled from: BufferedChannel.kt */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b?\u001a3\u0010\u0004\u001a \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0001\"\u0004\b\u0000\u0010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001aN\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\f\u001a\u00028\u00002%\b\u0002\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0000\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0000\u0010\u0019\u001a\u001f\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001f\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001f\u0010 \"\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\"\u0014\u0010'\u001a\u00020\u00178\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b%\u0010&\"\u0014\u0010)\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&\"\u0014\u0010,\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010+\"\u0014\u0010.\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010+\"\u0014\u00102\u001a\u00020/8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b0\u00101\"\u0014\u00104\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101\"\u0014\u00106\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00101\"\u0014\u00108\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00101\"\u0014\u0010:\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00101\"\u0014\u0010<\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00101\"\u0014\u0010>\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00101\"\u0014\u0010@\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00101\"\u001a\u0010D\u001a\u00020/8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u00101\u001a\u0004\bB\u0010C\"\u0014\u0010F\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u00101\"\u0014\u0010H\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u00101\"\u0014\u0010J\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u00101\"\u0014\u0010L\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\bK\u0010&\"\u0014\u0010N\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\bM\u0010&\"\u0014\u0010P\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\bO\u0010&\"\u0014\u0010R\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\bQ\u0010&\"\u0014\u0010S\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010&\"\u0014\u0010T\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010&\"\u0014\u0010U\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00101\"\u0014\u0010V\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00101\"\u0014\u0010W\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u00101\"\u0014\u0010Y\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u00101\"\u0014\u0010[\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\bZ\u0010&\"\u0014\u0010]\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\\\u0010&\"\u0014\u0010_\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b^\u0010&\"\u0014\u0010`\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0000\u0010&\"\u0014\u0010a\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010&\"\u0014\u0010c\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\bb\u0010+\"\u0014\u0010e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\bd\u0010+\"\u0014\u0010f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010+\"\u0019\u0010h\u001a\u00020\u0002*\u00020\u00028Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b^\u0010g\"\u0019\u0010j\u001a\u00020\u0017*\u00020\u00028Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010i\"\u0019\u0010k\u001a\u00020\u0002*\u00020\u00028Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010g\"\u0019\u0010m\u001a\u00020\u0014*\u00020\u00028Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010l¨\u0006n"}, d2 = {"E", "Lkotlin/reflect/KFunction2;", "", "Lkotlinx/coroutines/channels/q;", "y", "()Lkotlin/reflect/i;", "id", "prev", "x", "(JLkotlinx/coroutines/channels/q;)Lkotlinx/coroutines/channels/q;", "T", "Lkotlinx/coroutines/p;", "value", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "cause", "Lkotlin/k2;", "onCancellation", "", "F", "(Lkotlinx/coroutines/p;Ljava/lang/Object;Lld/l;)Z", "", "capacity", "(I)J", "counter", "closeStatus", "w", "(JI)J", "pauseEB", "v", "(JZ)J", "", "a", "Lkotlinx/coroutines/channels/q;", "NULL_SEGMENT", "b", "I", "SEGMENT_SIZE", "c", "EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS", "d", "J", "BUFFER_END_RENDEZVOUS", "e", "BUFFER_END_UNLIMITED", "Lkotlinx/coroutines/internal/s0;", "f", "Lkotlinx/coroutines/internal/s0;", "BUFFERED", "g", "IN_BUFFER", "h", "RESUMING_BY_RCV", "i", "RESUMING_BY_EB", "j", "POISONED", "k", "DONE_RCV", "l", "INTERRUPTED_SEND", "m", "INTERRUPTED_RCV", "n", "z", "()Lkotlinx/coroutines/internal/s0;", "CHANNEL_CLOSED", "o", "SUSPEND", "p", "SUSPEND_NO_WAITER", "q", "FAILED", "r", "RESULT_RENDEZVOUS", "s", "RESULT_BUFFERED", "t", "RESULT_SUSPEND", "u", "RESULT_SUSPEND_NO_WAITER", "RESULT_CLOSED", "RESULT_FAILED", "NO_RECEIVE_RESULT", "CLOSE_HANDLER_CLOSED", "CLOSE_HANDLER_INVOKED", "A", "NO_CLOSE_CAUSE", "B", "CLOSE_STATUS_ACTIVE", "C", "CLOSE_STATUS_CANCELLATION_STARTED", "D", "CLOSE_STATUS_CLOSED", "CLOSE_STATUS_CANCELLED", "SENDERS_CLOSE_STATUS_SHIFT", "G", "SENDERS_COUNTER_MASK", "H", "EB_COMPLETED_PAUSE_EXPAND_BUFFERS_BIT", "EB_COMPLETED_COUNTER_MASK", "(J)J", "sendersCounter", "(J)I", "sendersCloseStatus", "ebCompletedCounter", "(J)Z", "ebPauseExpandBuffers", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class k {

    @fg.l
    private static final s0 A;
    private static final int B = 0;
    private static final int C = 1;
    private static final int D = 2;
    private static final int E = 3;
    private static final int F = 60;
    private static final long G = 1152921504606846975L;
    private static final long H = 4611686018427387904L;
    private static final long I = 4611686018427387903L;

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final q<Object> f79364a = new q<>(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    @kd.f
    public static final int f79365b;

    /* renamed from: c, reason: collision with root package name */
    private static final int f79366c;

    /* renamed from: d, reason: collision with root package name */
    private static final long f79367d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static final long f79368e = Long.MAX_VALUE;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final s0 f79369f;

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final s0 f79370g;

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final s0 f79371h;

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private static final s0 f79372i;

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    private static final s0 f79373j;

    /* renamed from: k, reason: collision with root package name */
    @fg.l
    private static final s0 f79374k;

    /* renamed from: l, reason: collision with root package name */
    @fg.l
    private static final s0 f79375l;

    /* renamed from: m, reason: collision with root package name */
    @fg.l
    private static final s0 f79376m;

    /* renamed from: n, reason: collision with root package name */
    @fg.l
    private static final s0 f79377n;

    /* renamed from: o, reason: collision with root package name */
    @fg.l
    private static final s0 f79378o;

    /* renamed from: p, reason: collision with root package name */
    @fg.l
    private static final s0 f79379p;

    /* renamed from: q, reason: collision with root package name */
    @fg.l
    private static final s0 f79380q;

    /* renamed from: r, reason: collision with root package name */
    private static final int f79381r = 0;

    /* renamed from: s, reason: collision with root package name */
    private static final int f79382s = 1;

    /* renamed from: t, reason: collision with root package name */
    private static final int f79383t = 2;

    /* renamed from: u, reason: collision with root package name */
    private static final int f79384u = 3;

    /* renamed from: v, reason: collision with root package name */
    private static final int f79385v = 4;

    /* renamed from: w, reason: collision with root package name */
    private static final int f79386w = 5;

    /* renamed from: x, reason: collision with root package name */
    @fg.l
    private static final s0 f79387x;

    /* renamed from: y, reason: collision with root package name */
    @fg.l
    private static final s0 f79388y;

    /* renamed from: z, reason: collision with root package name */
    @fg.l
    private static final s0 f79389z;

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: BufferedChannel.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class a<E> extends kotlin.jvm.internal.h0 implements ld.p<Long, q<E>, q<E>> {

        /* renamed from: d, reason: collision with root package name */
        public static final a f79390d = new a();

        a() {
            super(2, k.class, ProtectedSandApp.s("虃\u0001"), ProtectedSandApp.s("虂\u0001"), 1);
        }

        @fg.l
        public final q<E> Z(long j4, @fg.l q<E> qVar) {
            return k.x(j4, qVar);
        }

        @Override // ld.p
        public Object invoke(Long l4, Object obj) {
            return k.x(l4.longValue(), (q) obj);
        }
    }

    static {
        int e4;
        int e5;
        e4 = x0.e(ProtectedSandApp.s("虄\u0001"), 32, 0, 0, 12, null);
        f79365b = e4;
        e5 = x0.e(ProtectedSandApp.s("虅\u0001"), 10000, 0, 0, 12, null);
        f79366c = e5;
        f79369f = new s0(ProtectedSandApp.s("虆\u0001"));
        f79370g = new s0(ProtectedSandApp.s("虇\u0001"));
        f79371h = new s0(ProtectedSandApp.s("虈\u0001"));
        f79372i = new s0(ProtectedSandApp.s("虉\u0001"));
        f79373j = new s0(ProtectedSandApp.s("虊\u0001"));
        f79374k = new s0(ProtectedSandApp.s("虋\u0001"));
        f79375l = new s0(ProtectedSandApp.s("虌\u0001"));
        f79376m = new s0(ProtectedSandApp.s("虍\u0001"));
        f79377n = new s0(ProtectedSandApp.s("虎\u0001"));
        f79378o = new s0(ProtectedSandApp.s("虏\u0001"));
        f79379p = new s0(ProtectedSandApp.s("虐\u0001"));
        f79380q = new s0(ProtectedSandApp.s("虑\u0001"));
        f79387x = new s0(ProtectedSandApp.s("虒\u0001"));
        f79388y = new s0(ProtectedSandApp.s("虓\u0001"));
        f79389z = new s0(ProtectedSandApp.s("虔\u0001"));
        A = new s0(ProtectedSandApp.s("處\u0001"));
    }

    private static final long A(long j4) {
        return j4 & 4611686018427387903L;
    }

    private static final boolean B(long j4) {
        return (j4 & 4611686018427387904L) != 0;
    }

    private static final int C(long j4) {
        return (int) (j4 >> 60);
    }

    private static final long D(long j4) {
        return j4 & G;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long E(int i4) {
        if (i4 == 0) {
            return 0L;
        }
        if (i4 != Integer.MAX_VALUE) {
            return i4;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean F(kotlinx.coroutines.p<? super T> pVar, T t4, ld.l<? super Throwable, k2> lVar) {
        Object i02 = pVar.i0(t4, null, lVar);
        if (i02 == null) {
            return false;
        }
        pVar.l0(i02);
        return true;
    }

    static /* synthetic */ boolean G(kotlinx.coroutines.p pVar, Object obj, ld.l lVar, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            lVar = null;
        }
        return F(pVar, obj, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long v(long j4, boolean z4) {
        return (z4 ? 4611686018427387904L : 0L) + j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long w(long j4, int i4) {
        return (i4 << 60) + j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> q<E> x(long j4, q<E> qVar) {
        return new q<>(j4, qVar, qVar.w(), 0);
    }

    @fg.l
    public static final <E> kotlin.reflect.i<q<E>> y() {
        return a.f79390d;
    }

    @fg.l
    public static final s0 z() {
        return f79377n;
    }
}
