package okhttp3.internal.ws;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.k2;
import kotlin.text.v;
import okhttp3.b0;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.internal.ws.h;
import okhttp3.j0;
import okhttp3.k0;
import okhttp3.r;
import okio.n;
import okio.o;
import okio.p;

/* compiled from: RealWebSocket.kt */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0019\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0005MRODABA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010\u001dJ\u0015\u0010%\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J!\u0010+\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010)H\u0000¢\u0006\u0004\b+\u0010,J\u001d\u00101\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\u001b¢\u0006\u0004\b3\u0010\u001dJ\r\u00104\u001a\u00020\u0012¢\u0006\u0004\b4\u00105J\u001d\u00109\u001a\u00020\u001b2\u0006\u00106\u001a\u00020\u000b2\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020\u001b¢\u0006\u0004\b;\u0010\u001dJ\r\u0010<\u001a\u00020\u0017¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\u0017¢\u0006\u0004\b>\u0010=J\r\u0010?\u001a\u00020\u0017¢\u0006\u0004\b?\u0010=J\u0017\u0010A\u001a\u00020\u001b2\u0006\u0010@\u001a\u00020-H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020\u0015H\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\u001b2\u0006\u0010F\u001a\u00020\u0015H\u0016¢\u0006\u0004\bG\u0010EJ\u0017\u0010H\u001a\u00020\u001b2\u0006\u0010F\u001a\u00020\u0015H\u0016¢\u0006\u0004\bH\u0010EJ\u001f\u0010K\u001a\u00020\u001b2\u0006\u0010I\u001a\u00020\u00172\u0006\u0010J\u001a\u00020-H\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020\u00122\u0006\u0010@\u001a\u00020-H\u0016¢\u0006\u0004\bM\u0010NJ\u0017\u0010O\u001a\u00020\u00122\u0006\u0010C\u001a\u00020\u0015H\u0016¢\u0006\u0004\bO\u0010PJ\u0015\u0010Q\u001a\u00020\u00122\u0006\u0010F\u001a\u00020\u0015¢\u0006\u0004\bQ\u0010PJ!\u0010R\u001a\u00020\u00122\u0006\u0010I\u001a\u00020\u00172\b\u0010J\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\bR\u0010SJ'\u0010U\u001a\u00020\u00122\u0006\u0010I\u001a\u00020\u00172\b\u0010J\u001a\u0004\u0018\u00010-2\u0006\u0010T\u001a\u00020\u000b¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\u0012H\u0000¢\u0006\u0004\bW\u00105J\u000f\u0010X\u001a\u00020\u001bH\u0000¢\u0006\u0004\bX\u0010\u001dJ#\u0010[\u001a\u00020\u001b2\n\u0010A\u001a\u00060Yj\u0002`Z2\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b[\u0010\\R\u0014\u0010^\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010]R\u0018\u0010a\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010`R\u0018\u0010d\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010cR\u0018\u0010g\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010fR\u0018\u0010j\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010iR\u0016\u0010m\u001a\u00020k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010lR\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010]R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010nR\u001a\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00150o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010pR\u001a\u0010s\u001a\b\u0012\u0004\u0012\u00020r0o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010pR\u0016\u0010v\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0016\u0010y\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010{\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010XR\u0018\u0010}\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010]R\u0016\u0010\u007f\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010xR\u0018\u0010\u0081\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010XR\u0017\u0010\u0082\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010XR\u0017\u0010\u0083\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010XR\u0017\u0010\u0084\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010xR\u0015\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b%\u0010\u0085\u0001R\u001d\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b[\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0016\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0089\u0001R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010uR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0013\u0010\u008a\u0001R\u0016\u0010\u000f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010u¨\u0006\u008b\u0001"}, d2 = {"Lokhttp3/internal/ws/e;", "Lokhttp3/j0;", "Lokhttp3/internal/ws/h$a;", "Lokhttp3/internal/concurrent/d;", "taskRunner", "Lokhttp3/d0;", "originalRequest", "Lokhttp3/k0;", "listener", "Ljava/util/Random;", "random", "", "pingIntervalMillis", "Lokhttp3/internal/ws/f;", "extensions", "minimumDeflateSize", "<init>", "(Lokhttp3/internal/concurrent/d;Lokhttp3/d0;Lokhttp3/k0;Ljava/util/Random;JLokhttp3/internal/ws/f;J)V", "", "x", "(Lokhttp3/internal/ws/f;)Z", "Lokio/p;", "data", "", "formatOpcode", "E", "(Lokio/p;I)Z", "Lkotlin/k2;", "D", "()V", "h", "()Lokhttp3/d0;", "g", "()J", "cancel", "Lokhttp3/b0;", "client", "t", "(Lokhttp3/b0;)V", "Lokhttp3/f0;", "response", "Lokhttp3/internal/connection/c;", "exchange", "r", "(Lokhttp3/f0;Lokhttp3/internal/connection/c;)V", "", "name", "Lokhttp3/internal/ws/e$d;", "streams", "w", "(Ljava/lang/String;Lokhttp3/internal/ws/e$d;)V", "y", "A", "()Z", "timeout", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "q", "(JLjava/util/concurrent/TimeUnit;)V", "G", "F", "()I", "B", "C", "text", "e", "(Ljava/lang/String;)V", "bytes", "d", "(Lokio/p;)V", "payload", "f", "i", "code", "reason", "j", "(ILjava/lang/String;)V", "a", "(Ljava/lang/String;)Z", "c", "(Lokio/p;)Z", "z", "b", "(ILjava/lang/String;)Z", "cancelAfterCloseMillis", "s", "(ILjava/lang/String;J)Z", "H", "I", "Ljava/lang/Exception;", "Lkotlin/Exception;", "u", "(Ljava/lang/Exception;Lokhttp3/f0;)V", "Ljava/lang/String;", "key", "Lokhttp3/e;", "Lokhttp3/e;", "call", "Lokhttp3/internal/concurrent/a;", "Lokhttp3/internal/concurrent/a;", "writerTask", "Lokhttp3/internal/ws/h;", "Lokhttp3/internal/ws/h;", "reader", "Lokhttp3/internal/ws/i;", "Lokhttp3/internal/ws/i;", "writer", "Lokhttp3/internal/concurrent/c;", "Lokhttp3/internal/concurrent/c;", "taskQueue", "Lokhttp3/internal/ws/e$d;", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque;", "pongQueue", "", "messageAndCloseQueue", "k", "J", "queueSize", "l", "Z", "enqueuedClose", "m", "receivedCloseCode", "n", "receivedCloseReason", "o", "failed", "p", "sentPingCount", "receivedPingCount", "receivedPongCount", "awaitingPong", "Lokhttp3/d0;", "Lokhttp3/k0;", "v", "()Lokhttp3/k0;", "Ljava/util/Random;", "Lokhttp3/internal/ws/f;", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class e implements j0, h.a {
    private static final long A = 16777216;
    private static final long B = 60000;
    public static final long C = 1024;

    /* renamed from: z, reason: collision with root package name */
    private static final List<c0> f84889z = w.k(c0.HTTP_1_1);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String key;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private okhttp3.e call;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private okhttp3.internal.concurrent.a writerTask;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private okhttp3.internal.ws.h reader;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private i writer;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private okhttp3.internal.concurrent.c taskQueue;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private String name;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private d streams;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque<p> pongQueue;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque<Object> messageAndCloseQueue;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private long queueSize;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean enqueuedClose;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int receivedCloseCode;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private String receivedCloseReason;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean failed;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int sentPingCount;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int receivedPingCount;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int receivedPongCount;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean awaitingPong;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final d0 originalRequest;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @l
    private final k0 listener;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Random random;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final long pingIntervalMillis;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private okhttp3.internal.ws.f extensions;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private long minimumDeflateSize;

    /* compiled from: RealWebSocket.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\n\u0010\u0012¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/ws/e$a;", "", "", "code", "Lokio/p;", "reason", "", "cancelAfterCloseMillis", "<init>", "(ILokio/p;J)V", "a", "I", "b", "()I", "Lokio/p;", "c", "()Lokio/p;", "J", "()J", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int code;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @m
        private final p reason;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final long cancelAfterCloseMillis;

        public a(int i4, @m p pVar, long j4) {
            this.code = i4;
            this.reason = pVar;
            this.cancelAfterCloseMillis = j4;
        }

        /* renamed from: a, reason: from getter */
        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }

        /* renamed from: b, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        @m
        /* renamed from: c, reason: from getter */
        public final p getReason() {
            return this.reason;
        }
    }

    /* compiled from: RealWebSocket.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/ws/e$c;", "", "", "formatOpcode", "Lokio/p;", "data", "<init>", "(ILokio/p;)V", "a", "I", "b", "()I", "Lokio/p;", "()Lokio/p;", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int formatOpcode;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final p data;

        public c(int i4, @l p pVar) {
            l0.p(pVar, ProtectedSandApp.s("Ẉ"));
            this.formatOpcode = i4;
            this.data = pVar;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final p getData() {
            return this.data;
        }

        /* renamed from: b, reason: from getter */
        public final int getFormatOpcode() {
            return this.formatOpcode;
        }
    }

    /* compiled from: RealWebSocket.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\n\u0010\u0013¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/ws/e$d;", "Ljava/io/Closeable;", "", "client", "Lokio/o;", "source", "Lokio/n;", "sink", "<init>", "(ZLokio/o;Lokio/n;)V", "b", "Z", "a", "()Z", "c", "Lokio/o;", "()Lokio/o;", "d", "Lokio/n;", "()Lokio/n;", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static abstract class d implements Closeable {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean client;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @l
        private final o source;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @l
        private final n sink;

        public d(boolean z4, @l o oVar, @l n nVar) {
            l0.p(oVar, ProtectedSandApp.s("ẉ"));
            l0.p(nVar, ProtectedSandApp.s("Ẋ"));
            this.client = z4;
            this.source = oVar;
            this.sink = nVar;
        }

        /* renamed from: a, reason: from getter */
        public final boolean getClient() {
            return this.client;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final n getSink() {
            return this.sink;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final o getSource() {
            return this.source;
        }
    }

    /* compiled from: RealWebSocket.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/ws/e$e;", "Lokhttp3/internal/concurrent/a;", "<init>", "(Lokhttp3/internal/ws/e;)V", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.ws.e$e, reason: collision with other inner class name */
    private final class C1325e extends okhttp3.internal.concurrent.a {
        public C1325e() {
            super(e.this.name + ProtectedSandApp.s("ẋ"), false, 2, null);
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            try {
                return e.this.H() ? 0L : -1L;
            } catch (IOException e4) {
                e.this.u(e4, null);
                return -1L;
            }
        }
    }

    /* compiled from: RealWebSocket.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"okhttp3/internal/ws/e$f", "Lokhttp3/f;", "Lokhttp3/e;", "call", "Lokhttp3/f0;", "response", "Lkotlin/k2;", "b", "(Lokhttp3/e;Lokhttp3/f0;)V", "Ljava/io/IOException;", "e", "a", "(Lokhttp3/e;Ljava/io/IOException;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class f implements okhttp3.f {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0 f84925b;

        f(d0 d0Var) {
            this.f84925b = d0Var;
        }

        @Override // okhttp3.f
        public void a(@l okhttp3.e call, @l IOException e4) {
            l0.p(call, ProtectedSandApp.s("Ẍ"));
            l0.p(e4, ProtectedSandApp.s("ẍ"));
            e.this.u(e4, null);
        }

        @Override // okhttp3.f
        public void b(@l okhttp3.e call, @l f0 response) {
            l0.p(call, ProtectedSandApp.s("Ẍ"));
            l0.p(response, ProtectedSandApp.s("Ẏ"));
            okhttp3.internal.connection.c exchange = response.getExchange();
            try {
                e.this.r(response, exchange);
                l0.m(exchange);
                d m4 = exchange.m();
                okhttp3.internal.ws.f a5 = okhttp3.internal.ws.f.INSTANCE.a(response.getHeaders());
                e.this.extensions = a5;
                if (!e.this.x(a5)) {
                    synchronized (e.this) {
                        e.this.messageAndCloseQueue.clear();
                        e.this.b(1010, ProtectedSandApp.s("ẏ"));
                    }
                }
                try {
                    e.this.w(okhttp3.internal.d.f84464i + ProtectedSandApp.s("Ẑ") + this.f84925b.q().V(), m4);
                    e.this.getListener().j(e.this, response);
                    e.this.y();
                } catch (Exception e4) {
                    e.this.u(e4, null);
                }
            } catch (IOException e5) {
                if (exchange != null) {
                    exchange.v();
                }
                e.this.u(e5, response);
                okhttp3.internal.d.l(response);
            }
        }
    }

    /* compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006¸\u0006\u0005"}, d2 = {"okhttp3/internal/concurrent/TaskQueue$schedule$2", "Lokhttp3/internal/concurrent/a;", "", "f", "()J", "okhttp3/internal/ws/RealWebSocket$$special$$inlined$schedule$1", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class g extends okhttp3.internal.concurrent.a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f84926e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f84927f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e f84928g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f84929h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ d f84930i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ okhttp3.internal.ws.f f84931j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, long j4, e eVar, String str3, d dVar, okhttp3.internal.ws.f fVar) {
            super(str2, false, 2, null);
            this.f84926e = str;
            this.f84927f = j4;
            this.f84928g = eVar;
            this.f84929h = str3;
            this.f84930i = dVar;
            this.f84931j = fVar;
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            this.f84928g.I();
            return this.f84927f;
        }
    }

    /* compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006¸\u0006\u0005"}, d2 = {"okhttp3/internal/concurrent/TaskQueue$execute$1", "Lokhttp3/internal/concurrent/a;", "", "f", "()J", "okhttp3/internal/ws/RealWebSocket$$special$$inlined$execute$1", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class h extends okhttp3.internal.concurrent.a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f84932e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f84933f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e f84934g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ i f84935h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ p f84936i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ k1.h f84937j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ k1.f f84938k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ k1.h f84939l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ k1.h f84940m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ k1.h f84941n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ k1.h f84942o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z4, String str2, boolean z5, e eVar, i iVar, p pVar, k1.h hVar, k1.f fVar, k1.h hVar2, k1.h hVar3, k1.h hVar4, k1.h hVar5) {
            super(str2, z5);
            this.f84932e = str;
            this.f84933f = z4;
            this.f84934g = eVar;
            this.f84935h = iVar;
            this.f84936i = pVar;
            this.f84937j = hVar;
            this.f84938k = fVar;
            this.f84939l = hVar2;
            this.f84940m = hVar3;
            this.f84941n = hVar4;
            this.f84942o = hVar5;
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            this.f84934g.cancel();
            return -1L;
        }
    }

    public e(@l okhttp3.internal.concurrent.d dVar, @l d0 d0Var, @l k0 k0Var, @l Random random, long j4, @m okhttp3.internal.ws.f fVar, long j5) {
        l0.p(dVar, ProtectedSandApp.s("ẑ"));
        l0.p(d0Var, ProtectedSandApp.s("Ẓ"));
        l0.p(k0Var, ProtectedSandApp.s("ẓ"));
        l0.p(random, ProtectedSandApp.s("Ẕ"));
        this.originalRequest = d0Var;
        this.listener = k0Var;
        this.random = random;
        this.pingIntervalMillis = j4;
        this.extensions = fVar;
        this.minimumDeflateSize = j5;
        this.taskQueue = dVar.j();
        this.pongQueue = new ArrayDeque<>();
        this.messageAndCloseQueue = new ArrayDeque<>();
        this.receivedCloseCode = -1;
        if (!l0.g(ProtectedSandApp.s("ẕ"), d0Var.m())) {
            throw new IllegalArgumentException((ProtectedSandApp.s("ẖ") + d0Var.m()).toString());
        }
        p.Companion companion = p.INSTANCE;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        k2 k2Var = k2.f75408a;
        this.key = p.Companion.p(companion, bArr, 0, 0, 3, null).d();
    }

    private final void D() {
        if (!okhttp3.internal.d.f84463h || Thread.holdsLock(this)) {
            okhttp3.internal.concurrent.a aVar = this.writerTask;
            if (aVar != null) {
                okhttp3.internal.concurrent.c.p(this.taskQueue, aVar, 0L, 2, null);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ẗ"));
        Thread currentThread = Thread.currentThread();
        l0.o(currentThread, ProtectedSandApp.s("ẘ"));
        sb.append(currentThread.getName());
        sb.append(ProtectedSandApp.s("ẙ"));
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    private final synchronized boolean E(p data, int formatOpcode) {
        if (!this.failed && !this.enqueuedClose) {
            if (this.queueSize + data.q() > A) {
                b(1001, null);
                return false;
            }
            this.queueSize += data.q();
            this.messageAndCloseQueue.add(new c(formatOpcode, data));
            D();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean x(okhttp3.internal.ws.f fVar) {
        if (fVar.unknownValues || fVar.clientMaxWindowBits != null) {
            return false;
        }
        Integer num = fVar.serverMaxWindowBits;
        if (num == null) {
            return true;
        }
        int intValue = num.intValue();
        return 8 <= intValue && 15 >= intValue;
    }

    public final boolean A() throws IOException {
        try {
            okhttp3.internal.ws.h hVar = this.reader;
            l0.m(hVar);
            hVar.b();
            return this.receivedCloseCode == -1;
        } catch (Exception e4) {
            u(e4, null);
            return false;
        }
    }

    public final synchronized int B() {
        return this.receivedPingCount;
    }

    public final synchronized int C() {
        return this.receivedPongCount;
    }

    public final synchronized int F() {
        return this.sentPingCount;
    }

    public final void G() throws InterruptedException {
        this.taskQueue.u();
        this.taskQueue.l().await(10L, TimeUnit.SECONDS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0106 A[Catch: all -> 0x0112, TRY_ENTER, TryCatch #1 {all -> 0x0112, blocks: (B:25:0x0106, B:38:0x011b, B:41:0x0125, B:42:0x0135, B:45:0x0144, B:49:0x0147, B:50:0x0148, B:51:0x0149, B:52:0x0154, B:53:0x0155, B:57:0x015b, B:44:0x0136), top: B:23:0x0104, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011b A[Catch: all -> 0x0112, TryCatch #1 {all -> 0x0112, blocks: (B:25:0x0106, B:38:0x011b, B:41:0x0125, B:42:0x0135, B:45:0x0144, B:49:0x0147, B:50:0x0148, B:51:0x0149, B:52:0x0154, B:53:0x0155, B:57:0x015b, B:44:0x0136), top: B:23:0x0104, inners: #3 }] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, okhttp3.internal.ws.i] */
    /* JADX WARN: Type inference failed for: r1v20, types: [okhttp3.internal.ws.i] */
    /* JADX WARN: Type inference failed for: r2v15, types: [T, okhttp3.internal.ws.e$d] */
    /* JADX WARN: Type inference failed for: r2v16, types: [T, okhttp3.internal.ws.h] */
    /* JADX WARN: Type inference failed for: r2v17, types: [T, okhttp3.internal.ws.i] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v16, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [okio.p] */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean H() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.e.H():boolean");
    }

    public final void I() {
        synchronized (this) {
            try {
                if (this.failed) {
                    return;
                }
                i iVar = this.writer;
                if (iVar != null) {
                    int i4 = this.awaitingPong ? this.sentPingCount : -1;
                    this.sentPingCount++;
                    this.awaitingPong = true;
                    k2 k2Var = k2.f75408a;
                    if (i4 != -1) {
                        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ẝ"));
                        sb.append(this.pingIntervalMillis);
                        sb.append(ProtectedSandApp.s("ẞ"));
                        u(new SocketTimeoutException(android.support.v4.media.b.a(sb, i4 - 1, ProtectedSandApp.s("ẟ"))), null);
                        return;
                    }
                    try {
                        iVar.f(p.f85244f);
                    } catch (IOException e4) {
                        u(e4, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // okhttp3.j0
    public boolean a(@l String text) {
        l0.p(text, ProtectedSandApp.s("Ạ"));
        return E(p.INSTANCE.l(text), 1);
    }

    @Override // okhttp3.j0
    public boolean b(int code, @m String reason) {
        return s(code, reason, 60000L);
    }

    @Override // okhttp3.j0
    public boolean c(@l p bytes) {
        l0.p(bytes, ProtectedSandApp.s("ạ"));
        return E(bytes, 2);
    }

    @Override // okhttp3.j0
    public void cancel() {
        okhttp3.e eVar = this.call;
        l0.m(eVar);
        eVar.cancel();
    }

    @Override // okhttp3.internal.ws.h.a
    public void d(@l p bytes) throws IOException {
        l0.p(bytes, ProtectedSandApp.s("ạ"));
        this.listener.i(this, bytes);
    }

    @Override // okhttp3.internal.ws.h.a
    public void e(@l String text) throws IOException {
        l0.p(text, ProtectedSandApp.s("Ạ"));
        this.listener.h(this, text);
    }

    @Override // okhttp3.internal.ws.h.a
    public synchronized void f(@l p payload) {
        try {
            l0.p(payload, ProtectedSandApp.s("Ả"));
            if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
                this.pongQueue.add(payload);
                D();
                this.receivedPingCount++;
            }
        } finally {
        }
    }

    @Override // okhttp3.j0
    public synchronized long g() {
        return this.queueSize;
    }

    @Override // okhttp3.j0
    @l
    /* renamed from: h, reason: from getter */
    public d0 getOriginalRequest() {
        return this.originalRequest;
    }

    @Override // okhttp3.internal.ws.h.a
    public synchronized void i(@l p payload) {
        l0.p(payload, ProtectedSandApp.s("Ả"));
        this.receivedPongCount++;
        this.awaitingPong = false;
    }

    @Override // okhttp3.internal.ws.h.a
    public void j(int code, @l String reason) {
        d dVar;
        okhttp3.internal.ws.h hVar;
        i iVar;
        l0.p(reason, ProtectedSandApp.s("ả"));
        if (!(code != -1)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ấ"));
        }
        synchronized (this) {
            try {
                if (!(this.receivedCloseCode == -1)) {
                    throw new IllegalStateException(ProtectedSandApp.s("Ấ"));
                }
                this.receivedCloseCode = code;
                this.receivedCloseReason = reason;
                dVar = null;
                if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                    d dVar2 = this.streams;
                    this.streams = null;
                    hVar = this.reader;
                    this.reader = null;
                    iVar = this.writer;
                    this.writer = null;
                    this.taskQueue.u();
                    dVar = dVar2;
                } else {
                    hVar = null;
                    iVar = null;
                }
                k2 k2Var = k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            this.listener.f(this, code, reason);
            if (dVar != null) {
                this.listener.e(this, code, reason);
            }
        } finally {
            if (dVar != null) {
                okhttp3.internal.d.l(dVar);
            }
            if (hVar != null) {
                okhttp3.internal.d.l(hVar);
            }
            if (iVar != null) {
                okhttp3.internal.d.l(iVar);
            }
        }
    }

    public final void q(long timeout, @l TimeUnit timeUnit) throws InterruptedException {
        l0.p(timeUnit, ProtectedSandApp.s("Ầ"));
        this.taskQueue.l().await(timeout, timeUnit);
    }

    public final void r(@l f0 response, @m okhttp3.internal.connection.c exchange) throws IOException {
        l0.p(response, ProtectedSandApp.s("ầ"));
        if (response.u() != 101) {
            throw new ProtocolException(ProtectedSandApp.s("Ẳ") + response.u() + ' ' + response.getMessage() + '\'');
        }
        String C2 = f0.C(response, ProtectedSandApp.s("Ẩ"), null, 2, null);
        String s4 = ProtectedSandApp.s("ẩ");
        if (!v.K1(s4, C2, true)) {
            throw new ProtocolException(ProtectedSandApp.s("ằ") + C2 + '\'');
        }
        String C3 = f0.C(response, s4, null, 2, null);
        if (!v.K1(ProtectedSandApp.s("Ẫ"), C3, true)) {
            throw new ProtocolException(ProtectedSandApp.s("Ằ") + C3 + '\'');
        }
        String C4 = f0.C(response, ProtectedSandApp.s("ẫ"), null, 2, null);
        String d5 = p.INSTANCE.l(this.key + ProtectedSandApp.s("Ậ")).a0().d();
        if (l0.g(d5, C4)) {
            if (exchange == null) {
                throw new ProtocolException(ProtectedSandApp.s("ậ"));
            }
            return;
        }
        throw new ProtocolException(ProtectedSandApp.s("Ắ") + d5 + ProtectedSandApp.s("ắ") + C4 + '\'');
    }

    public final synchronized boolean s(int code, @m String reason, long cancelAfterCloseMillis) {
        p pVar;
        String s4 = ProtectedSandApp.s("ẳ");
        synchronized (this) {
            try {
                okhttp3.internal.ws.g.f84973w.d(code);
                if (reason != null) {
                    pVar = p.INSTANCE.l(reason);
                    if (!(((long) pVar.q()) <= 123)) {
                        throw new IllegalArgumentException(s4.concat(reason).toString());
                    }
                } else {
                    pVar = null;
                }
                if (!this.failed && !this.enqueuedClose) {
                    this.enqueuedClose = true;
                    this.messageAndCloseQueue.add(new a(code, pVar, cancelAfterCloseMillis));
                    D();
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    public final void t(@l b0 client) {
        l0.p(client, ProtectedSandApp.s("Ẵ"));
        d0 d0Var = this.originalRequest;
        String s4 = ProtectedSandApp.s("ẵ");
        if (d0Var.i(s4) != null) {
            u(new ProtocolException(ProtectedSandApp.s("Ặ")), null);
            return;
        }
        b0.a f02 = client.f0().r(r.NONE).f0(f84889z);
        f02.getClass();
        b0 b0Var = new b0(f02);
        d0 d0Var2 = this.originalRequest;
        d0Var2.getClass();
        d0.a aVar = new d0.a(d0Var2);
        String s5 = ProtectedSandApp.s("Ẫ");
        String s6 = ProtectedSandApp.s("ẩ");
        d0 b5 = aVar.n(s6, s5).n(ProtectedSandApp.s("Ẩ"), s6).n(ProtectedSandApp.s("ặ"), this.key).n(ProtectedSandApp.s("Ẹ"), ProtectedSandApp.s("ẹ")).n(s4, ProtectedSandApp.s("Ẻ")).b();
        okhttp3.internal.connection.e eVar = new okhttp3.internal.connection.e(b0Var, b5, true);
        this.call = eVar;
        l0.m(eVar);
        eVar.n2(new f(b5));
    }

    public final void u(@l Exception e4, @m f0 response) {
        l0.p(e4, ProtectedSandApp.s("ẻ"));
        synchronized (this) {
            if (this.failed) {
                return;
            }
            this.failed = true;
            d dVar = this.streams;
            this.streams = null;
            okhttp3.internal.ws.h hVar = this.reader;
            this.reader = null;
            i iVar = this.writer;
            this.writer = null;
            this.taskQueue.u();
            k2 k2Var = k2.f75408a;
            try {
                this.listener.g(this, e4, response);
            } finally {
                if (dVar != null) {
                    okhttp3.internal.d.l(dVar);
                }
                if (hVar != null) {
                    okhttp3.internal.d.l(hVar);
                }
                if (iVar != null) {
                    okhttp3.internal.d.l(iVar);
                }
            }
        }
    }

    @l
    /* renamed from: v, reason: from getter */
    public final k0 getListener() {
        return this.listener;
    }

    public final void w(@l String name, @l d streams) throws IOException {
        l0.p(name, ProtectedSandApp.s("Ẽ"));
        l0.p(streams, ProtectedSandApp.s("ẽ"));
        okhttp3.internal.ws.f fVar = this.extensions;
        l0.m(fVar);
        synchronized (this) {
            try {
                this.name = name;
                this.streams = streams;
                this.writer = new i(streams.getClient(), streams.getSink(), this.random, fVar.perMessageDeflate, fVar.i(streams.getClient()), this.minimumDeflateSize);
                this.writerTask = new C1325e();
                long j4 = this.pingIntervalMillis;
                if (j4 != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j4);
                    okhttp3.internal.concurrent.c cVar = this.taskQueue;
                    String str = name + ProtectedSandApp.s("Ế");
                    cVar.n(new g(str, str, nanos, this, name, streams, fVar), nanos);
                }
                if (!this.messageAndCloseQueue.isEmpty()) {
                    D();
                }
                k2 k2Var = k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.reader = new okhttp3.internal.ws.h(streams.getClient(), streams.getSource(), this, fVar.perMessageDeflate, fVar.i(!streams.getClient()));
    }

    public final void y() throws IOException {
        while (this.receivedCloseCode == -1) {
            okhttp3.internal.ws.h hVar = this.reader;
            l0.m(hVar);
            hVar.b();
        }
    }

    public final synchronized boolean z(@l p payload) {
        try {
            l0.p(payload, ProtectedSandApp.s("Ả"));
            if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
                this.pongQueue.add(payload);
                D();
                return true;
            }
            return false;
        } finally {
        }
    }
}
