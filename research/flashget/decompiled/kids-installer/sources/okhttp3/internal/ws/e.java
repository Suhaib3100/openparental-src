package okhttp3.internal.ws;

import androidx.core.view.s1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.z;
import kotlin.jvm.internal.k1;
import kotlin.m2;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.g0;
import okhttp3.internal.ws.h;
import okhttp3.k0;
import okhttp3.l0;
import okhttp3.r;
import okio.n;
import okio.o;
import okio.p;

/* compiled from: RealWebSocket.kt */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u00012\u00020\u0002:\u000554-+/BA\u0012\u0006\u0010x\u001a\u00020w\u0012\u0006\u0010j\u001a\u00020\r\u0012\u0006\u0010o\u001a\u00020k\u0012\u0006\u0010r\u001a\u00020p\u0012\u0006\u0010s\u001a\u00020\u000f\u0012\b\u0010u\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010v\u001a\u00020\u000f¢\u0006\u0004\by\u0010zJ\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012J!\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dJ\u0006\u0010 \u001a\u00020\u000bJ\u0006\u0010!\u001a\u00020\u0004J\u0016\u0010%\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#J\u0006\u0010&\u001a\u00020\u000bJ\u0006\u0010'\u001a\u00020\bJ\u0006\u0010(\u001a\u00020\bJ\u0006\u0010)\u001a\u00020\bJ\u0010\u0010+\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u001bH\u0016J\u0010\u0010-\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u0006H\u0016J\u0010\u0010/\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u0006H\u0016J\u0010\u00100\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u0006H\u0016J\u0018\u00103\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\b2\u0006\u00102\u001a\u00020\u001bH\u0016J\u0010\u00104\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u001bH\u0016J\u0010\u00105\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0006H\u0016J\u000e\u00106\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0006J\u001a\u00107\u001a\u00020\u00042\u0006\u00101\u001a\u00020\b2\b\u00102\u001a\u0004\u0018\u00010\u001bH\u0016J \u00109\u001a\u00020\u00042\u0006\u00101\u001a\u00020\b2\b\u00102\u001a\u0004\u0018\u00010\u001b2\u0006\u00108\u001a\u00020\u000fJ\u000f\u0010:\u001a\u00020\u0004H\u0000¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u000bH\u0000¢\u0006\u0004\b<\u0010=J\u001c\u0010@\u001a\u00020\u000b2\n\u0010/\u001a\u00060>j\u0002`?2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015R\u0014\u0010B\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010AR\u0018\u0010E\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010DR\u0018\u0010H\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010GR\u0018\u0010K\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010JR\u0018\u0010N\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010MR\u0016\u0010Q\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010PR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010AR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010RR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00060S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010TR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020V0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010TR\u0016\u0010Z\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010]\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010_\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010<R\u0018\u0010a\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010AR\u0016\u0010c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010\\R\u0016\u0010e\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010<R\u0016\u0010f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010<R\u0016\u0010g\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010<R\u0016\u0010h\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010\\R\u0014\u0010j\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010iR\u001a\u0010o\u001a\u00020k8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b@\u0010l\u001a\u0004\bm\u0010nR\u0014\u0010r\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010qR\u0014\u0010s\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010YR\u0018\u0010u\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010tR\u0016\u0010v\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010Y¨\u0006{"}, d2 = {"Lokhttp3/internal/ws/e;", "Lokhttp3/k0;", "Lokhttp3/internal/ws/h$a;", "Lokhttp3/internal/ws/f;", "", "x", "Lokio/p;", "data", "", "formatOpcode", "E", "Lkotlin/m2;", "D", "Lokhttp3/e0;", "g", "", "h", "cancel", "Lokhttp3/c0;", "client", "t", "Lokhttp3/g0;", "response", "Lokhttp3/internal/connection/c;", "exchange", "r", "(Lokhttp3/g0;Lokhttp3/internal/connection/c;)V", "", "name", "Lokhttp3/internal/ws/e$d;", "streams", "w", "y", "A", "timeout", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "q", "G", "F", "B", "C", "text", "d", "bytes", "c", "payload", "e", "i", "code", "reason", "j", "b", "a", "z", "f", "cancelAfterCloseMillis", "s", "H", "()Z", "I", "()V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "u", "Ljava/lang/String;", "key", "Lokhttp3/e;", "Lokhttp3/e;", "call", "Lokhttp3/internal/concurrent/a;", "Lokhttp3/internal/concurrent/a;", "writerTask", "Lokhttp3/internal/ws/h;", "Lokhttp3/internal/ws/h;", "reader", "Lokhttp3/internal/ws/i;", "Lokhttp3/internal/ws/i;", "writer", "Lokhttp3/internal/concurrent/c;", "Lokhttp3/internal/concurrent/c;", "taskQueue", "Lokhttp3/internal/ws/e$d;", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque;", "pongQueue", "", "messageAndCloseQueue", "k", "J", "queueSize", "l", "Z", "enqueuedClose", "m", "receivedCloseCode", "n", "receivedCloseReason", "o", "failed", "p", "sentPingCount", "receivedPingCount", "receivedPongCount", "awaitingPong", "Lokhttp3/e0;", "originalRequest", "Lokhttp3/l0;", "Lokhttp3/l0;", "v", "()Lokhttp3/l0;", "listener", "Ljava/util/Random;", "Ljava/util/Random;", "random", "pingIntervalMillis", "Lokhttp3/internal/ws/f;", "extensions", "minimumDeflateSize", "Lokhttp3/internal/concurrent/d;", "taskRunner", "<init>", "(Lokhttp3/internal/concurrent/d;Lokhttp3/e0;Lokhttp3/l0;Ljava/util/Random;JLokhttp3/internal/ws/f;J)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public final class e implements k0, h.a {
    private static final long A = 16777216;
    private static final long B = 60000;
    public static final long C = 1024;

    /* renamed from: z, reason: collision with root package name */
    private static final List<d0> f31349z;

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
    private final e0 originalRequest;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final l0 listener;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Random random;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final long pingIntervalMillis;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private okhttp3.internal.ws.f extensions;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private long minimumDeflateSize;

    /* compiled from: RealWebSocket.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0003\u0010\u000f¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/ws/e$a;", "", "", "a", "I", "b", "()I", "code", "Lokio/p;", "Lokio/p;", "c", "()Lokio/p;", "reason", "", "J", "()J", "cancelAfterCloseMillis", "<init>", "(ILokio/p;J)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int code;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private final p reason;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final long cancelAfterCloseMillis;

        public a(int i5, @d5.e p pVar, long j5) {
            this.code = i5;
            this.reason = pVar;
            this.cancelAfterCloseMillis = j5;
        }

        /* renamed from: a, reason: from getter */
        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }

        /* renamed from: b, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        @d5.e
        /* renamed from: c, reason: from getter */
        public final p getReason() {
            return this.reason;
        }
    }

    /* compiled from: RealWebSocket.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/ws/e$c;", "", "", "a", "I", "b", "()I", "formatOpcode", "Lokio/p;", "Lokio/p;", "()Lokio/p;", "data", "<init>", "(ILokio/p;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int formatOpcode;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final p data;

        public c(int i5, @d5.d p pVar) {
            kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("旤"));
            this.formatOpcode = i5;
            this.data = pVar;
        }

        @d5.d
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
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/ws/e$d;", "Ljava/io/Closeable;", "", "o", "Z", "a", "()Z", "client", "Lokio/o;", "p", "Lokio/o;", "c", "()Lokio/o;", "source", "Lokio/n;", "q", "Lokio/n;", "b", "()Lokio/n;", "sink", "<init>", "(ZLokio/o;Lokio/n;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static abstract class d implements Closeable {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final boolean client;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final o source;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final n sink;

        public d(boolean z5, @d5.d o oVar, @d5.d n nVar) {
            kotlin.jvm.internal.l0.p(oVar, ProtectedSandApp.s("懵"));
            kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("懶"));
            this.client = z5;
            this.source = oVar;
            this.sink = nVar;
        }

        /* renamed from: a, reason: from getter */
        public final boolean getClient() {
            return this.client;
        }

        @d5.d
        /* renamed from: b, reason: from getter */
        public final n getSink() {
            return this.sink;
        }

        @d5.d
        /* renamed from: c, reason: from getter */
        public final o getSource() {
            return this.source;
        }
    }

    /* compiled from: RealWebSocket.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/ws/e$e;", "Lokhttp3/internal/concurrent/a;", "", "f", "<init>", "(Lokhttp3/internal/ws/e;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.ws.e$e, reason: collision with other inner class name */
    private final class C0486e extends okhttp3.internal.concurrent.a {
        public C0486e() {
            super(e.this.name + ProtectedSandApp.s("鈛"), false, 2, null);
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            try {
                return e.this.H() ? 0L : -1L;
            } catch (IOException e6) {
                e.this.u(e6, null);
                return -1L;
            }
        }
    }

    /* compiled from: RealWebSocket.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"okhttp3/internal/ws/e$f", "Lokhttp3/f;", "Lokhttp3/e;", "call", "Lokhttp3/g0;", "response", "Lkotlin/m2;", "a", "Ljava/io/IOException;", "e", "b", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class f implements okhttp3.f {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e0 f31385b;

        f(e0 e0Var) {
            this.f31385b = e0Var;
        }

        @Override // okhttp3.f
        public void a(@d5.d okhttp3.e eVar, @d5.d g0 g0Var) {
            kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("鈜"));
            kotlin.jvm.internal.l0.p(g0Var, ProtectedSandApp.s("鈝"));
            okhttp3.internal.connection.c exchange = g0Var.getExchange();
            try {
                e.this.r(g0Var, exchange);
                kotlin.jvm.internal.l0.m(exchange);
                d m5 = exchange.m();
                okhttp3.internal.ws.f a6 = okhttp3.internal.ws.f.INSTANCE.a(g0Var.getHeaders());
                e.this.extensions = a6;
                if (!e.this.x(a6)) {
                    synchronized (e.this) {
                        e.this.messageAndCloseQueue.clear();
                        e.this.f(s1.f5671l, ProtectedSandApp.s("鈞"));
                    }
                }
                try {
                    e.this.w(okhttp3.internal.d.f30937i + ProtectedSandApp.s("鈟") + this.f31385b.q().V(), m5);
                    e.this.getListener().f(e.this, g0Var);
                    e.this.y();
                } catch (Exception e6) {
                    e.this.u(e6, null);
                }
            } catch (IOException e7) {
                if (exchange != null) {
                    exchange.v();
                }
                e.this.u(e7, g0Var);
                okhttp3.internal.d.l(g0Var);
            }
        }

        @Override // okhttp3.f
        public void b(@d5.d okhttp3.e eVar, @d5.d IOException iOException) {
            kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("鈠"));
            kotlin.jvm.internal.l0.p(iOException, ProtectedSandApp.s("鈡"));
            e.this.u(iOException, null);
        }
    }

    /* compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0005"}, d2 = {"okhttp3/internal/concurrent/TaskQueue$schedule$2", "Lokhttp3/internal/concurrent/a;", "", "f", "okhttp", "okhttp3/internal/ws/RealWebSocket$$special$$inlined$schedule$1"}, k = 1, mv = {1, 4, 0})
    public static final class g extends okhttp3.internal.concurrent.a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f31386e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f31387f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e f31388g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f31389h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ d f31390i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ okhttp3.internal.ws.f f31391j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, long j5, e eVar, String str3, d dVar, okhttp3.internal.ws.f fVar) {
            super(str2, false, 2, null);
            this.f31386e = str;
            this.f31387f = j5;
            this.f31388g = eVar;
            this.f31389h = str3;
            this.f31390i = dVar;
            this.f31391j = fVar;
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            this.f31388g.I();
            return this.f31387f;
        }
    }

    /* compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0005"}, d2 = {"okhttp3/internal/concurrent/TaskQueue$execute$1", "Lokhttp3/internal/concurrent/a;", "", "f", "okhttp", "okhttp3/internal/ws/RealWebSocket$$special$$inlined$execute$1"}, k = 1, mv = {1, 4, 0})
    public static final class h extends okhttp3.internal.concurrent.a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f31392e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f31393f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e f31394g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ i f31395h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ p f31396i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ k1.h f31397j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ k1.f f31398k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ k1.h f31399l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ k1.h f31400m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ k1.h f31401n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ k1.h f31402o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z5, String str2, boolean z6, e eVar, i iVar, p pVar, k1.h hVar, k1.f fVar, k1.h hVar2, k1.h hVar3, k1.h hVar4, k1.h hVar5) {
            super(str2, z6);
            this.f31392e = str;
            this.f31393f = z5;
            this.f31394g = eVar;
            this.f31395h = iVar;
            this.f31396i = pVar;
            this.f31397j = hVar;
            this.f31398k = fVar;
            this.f31399l = hVar2;
            this.f31400m = hVar3;
            this.f31401n = hVar4;
            this.f31402o = hVar5;
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            this.f31394g.cancel();
            return -1L;
        }
    }

    static {
        List<d0> k5;
        k5 = z.k(d0.HTTP_1_1);
        f31349z = k5;
    }

    public e(@d5.d okhttp3.internal.concurrent.d dVar, @d5.d e0 e0Var, @d5.d l0 l0Var, @d5.d Random random, long j5, @d5.e okhttp3.internal.ws.f fVar, long j6) {
        kotlin.jvm.internal.l0.p(dVar, ProtectedSandApp.s("鈢"));
        kotlin.jvm.internal.l0.p(e0Var, ProtectedSandApp.s("鈣"));
        kotlin.jvm.internal.l0.p(l0Var, ProtectedSandApp.s("鈤"));
        kotlin.jvm.internal.l0.p(random, ProtectedSandApp.s("鈥"));
        this.originalRequest = e0Var;
        this.listener = l0Var;
        this.random = random;
        this.pingIntervalMillis = j5;
        this.extensions = fVar;
        this.minimumDeflateSize = j6;
        this.taskQueue = dVar.j();
        this.pongQueue = new ArrayDeque<>();
        this.messageAndCloseQueue = new ArrayDeque<>();
        this.receivedCloseCode = -1;
        if (!kotlin.jvm.internal.l0.g(ProtectedSandApp.s("鈦"), e0Var.m())) {
            throw new IllegalArgumentException((ProtectedSandApp.s("鈧") + e0Var.m()).toString());
        }
        p.Companion companion = p.INSTANCE;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        m2 m2Var = m2.f23662a;
        this.key = p.Companion.p(companion, bArr, 0, 0, 3, null).l();
    }

    private final void D() {
        if (!okhttp3.internal.d.f30936h || Thread.holdsLock(this)) {
            okhttp3.internal.concurrent.a aVar = this.writerTask;
            if (aVar != null) {
                okhttp3.internal.concurrent.c.p(this.taskQueue, aVar, 0L, 2, null);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("鈨"));
        Thread currentThread = Thread.currentThread();
        kotlin.jvm.internal.l0.o(currentThread, ProtectedSandApp.s("鈩"));
        sb.append(currentThread.getName());
        sb.append(ProtectedSandApp.s("鈪"));
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    private final synchronized boolean E(p data, int formatOpcode) {
        if (!this.failed && !this.enqueuedClose) {
            if (this.queueSize + data.i0() > A) {
                f(1001, null);
                return false;
            }
            this.queueSize += data.i0();
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
            kotlin.jvm.internal.l0.m(hVar);
            hVar.b();
            return this.receivedCloseCode == -1;
        } catch (Exception e6) {
            u(e6, null);
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
    /* JADX WARN: Removed duplicated region for block: B:25:0x0103 A[Catch: all -> 0x01bf, TRY_ENTER, TryCatch #4 {all -> 0x01bf, blocks: (B:25:0x0103, B:38:0x010e, B:41:0x0118, B:42:0x0128, B:45:0x0137, B:49:0x013a, B:50:0x013b, B:51:0x013c, B:52:0x0147, B:53:0x0148, B:57:0x014e, B:44:0x0129), top: B:23:0x0101, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010e A[Catch: all -> 0x01bf, TryCatch #4 {all -> 0x01bf, blocks: (B:25:0x0103, B:38:0x010e, B:41:0x0118, B:42:0x0128, B:45:0x0137, B:49:0x013a, B:50:0x013b, B:51:0x013c, B:52:0x0147, B:53:0x0148, B:57:0x014e, B:44:0x0129), top: B:23:0x0101, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01de  */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, okhttp3.internal.ws.i] */
    /* JADX WARN: Type inference failed for: r1v13, types: [kotlin.jvm.internal.k1$h] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15, types: [T, okhttp3.internal.ws.e$d] */
    /* JADX WARN: Type inference failed for: r2v16, types: [T, okhttp3.internal.ws.h] */
    /* JADX WARN: Type inference failed for: r2v17, types: [T, okhttp3.internal.ws.i] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v16, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [okio.p] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean H() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.e.H():boolean");
    }

    public final void I() {
        synchronized (this) {
            if (this.failed) {
                return;
            }
            i iVar = this.writer;
            if (iVar != null) {
                int i5 = this.awaitingPong ? this.sentPingCount : -1;
                this.sentPingCount++;
                this.awaitingPong = true;
                m2 m2Var = m2.f23662a;
                if (i5 == -1) {
                    try {
                        iVar.g(p.f31688s);
                        return;
                    } catch (IOException e6) {
                        u(e6, null);
                        return;
                    }
                }
                u(new SocketTimeoutException(ProtectedSandApp.s("鈯") + this.pingIntervalMillis + ProtectedSandApp.s("鈰") + (i5 - 1) + ProtectedSandApp.s("鈱")), null);
            }
        }
    }

    @Override // okhttp3.k0
    public boolean a(@d5.d p bytes) {
        kotlin.jvm.internal.l0.p(bytes, ProtectedSandApp.s("鈲"));
        return E(bytes, 2);
    }

    @Override // okhttp3.k0
    public boolean b(@d5.d String text) {
        kotlin.jvm.internal.l0.p(text, ProtectedSandApp.s("鈳"));
        return E(p.INSTANCE.l(text), 1);
    }

    @Override // okhttp3.internal.ws.h.a
    public void c(@d5.d p pVar) throws IOException {
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("鈴"));
        this.listener.e(this, pVar);
    }

    @Override // okhttp3.k0
    public void cancel() {
        okhttp3.e eVar = this.call;
        kotlin.jvm.internal.l0.m(eVar);
        eVar.cancel();
    }

    @Override // okhttp3.internal.ws.h.a
    public void d(@d5.d String str) throws IOException {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("鈵"));
        this.listener.d(this, str);
    }

    @Override // okhttp3.internal.ws.h.a
    public synchronized void e(@d5.d p pVar) {
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("鈶"));
        if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
            this.pongQueue.add(pVar);
            D();
            this.receivedPingCount++;
        }
    }

    @Override // okhttp3.k0
    public boolean f(int code, @d5.e String reason) {
        return s(code, reason, 60000L);
    }

    @Override // okhttp3.k0
    @d5.d
    /* renamed from: g, reason: from getter */
    public e0 getOriginalRequest() {
        return this.originalRequest;
    }

    @Override // okhttp3.k0
    public synchronized long h() {
        return this.queueSize;
    }

    @Override // okhttp3.internal.ws.h.a
    public synchronized void i(@d5.d p pVar) {
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("鈷"));
        this.receivedPongCount++;
        this.awaitingPong = false;
    }

    @Override // okhttp3.internal.ws.h.a
    public void j(int i5, @d5.d String str) {
        d dVar;
        okhttp3.internal.ws.h hVar;
        i iVar;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("鈸"));
        boolean z5 = true;
        if (!(i5 != -1)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("鈺").toString());
        }
        synchronized (this) {
            if (this.receivedCloseCode != -1) {
                z5 = false;
            }
            if (!z5) {
                throw new IllegalStateException(ProtectedSandApp.s("鈹").toString());
            }
            this.receivedCloseCode = i5;
            this.receivedCloseReason = str;
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
            m2 m2Var = m2.f23662a;
        }
        try {
            this.listener.b(this, i5, str);
            if (dVar != null) {
                this.listener.a(this, i5, str);
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

    public final void q(long j5, @d5.d TimeUnit timeUnit) throws InterruptedException {
        kotlin.jvm.internal.l0.p(timeUnit, ProtectedSandApp.s("鈻"));
        this.taskQueue.l().await(j5, timeUnit);
    }

    public final void r(@d5.d g0 response, @d5.e okhttp3.internal.connection.c exchange) throws IOException {
        boolean K1;
        boolean K12;
        kotlin.jvm.internal.l0.p(response, ProtectedSandApp.s("鈼"));
        if (response.getCode() != 101) {
            throw new ProtocolException(ProtectedSandApp.s("鉇") + response.getCode() + ' ' + response.getMessage() + '\'');
        }
        String P = g0.P(response, ProtectedSandApp.s("鈽"), null, 2, null);
        String s5 = ProtectedSandApp.s("鈾");
        K1 = kotlin.text.e0.K1(s5, P, true);
        if (!K1) {
            throw new ProtocolException(ProtectedSandApp.s("鉆") + P + '\'');
        }
        String P2 = g0.P(response, s5, null, 2, null);
        K12 = kotlin.text.e0.K1(ProtectedSandApp.s("鈿"), P2, true);
        if (!K12) {
            throw new ProtocolException(ProtectedSandApp.s("鉅") + P2 + '\'');
        }
        String P3 = g0.P(response, ProtectedSandApp.s("鉀"), null, 2, null);
        String l5 = p.INSTANCE.l(this.key + ProtectedSandApp.s("鉁")).f0().l();
        if (!(!kotlin.jvm.internal.l0.g(l5, P3))) {
            if (exchange == null) {
                throw new ProtocolException(ProtectedSandApp.s("鉂"));
            }
            return;
        }
        throw new ProtocolException(ProtectedSandApp.s("鉃") + l5 + ProtectedSandApp.s("鉄") + P3 + '\'');
    }

    public final synchronized boolean s(int code, @d5.e String reason, long cancelAfterCloseMillis) {
        p pVar;
        String s5 = ProtectedSandApp.s("鉈");
        synchronized (this) {
            okhttp3.internal.ws.g.f31433w.d(code);
            if (reason != null) {
                pVar = p.INSTANCE.l(reason);
                if (!(((long) pVar.i0()) <= 123)) {
                    throw new IllegalArgumentException(s5.concat(reason).toString());
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
        }
    }

    public final void t(@d5.d c0 c0Var) {
        kotlin.jvm.internal.l0.p(c0Var, ProtectedSandApp.s("鉉"));
        e0 e0Var = this.originalRequest;
        String s5 = ProtectedSandApp.s("鉊");
        if (e0Var.i(s5) != null) {
            u(new ProtocolException(ProtectedSandApp.s("鉋")), null);
            return;
        }
        c0.a f02 = c0Var.k0().r(r.f31515a).f0(f31349z);
        f02.getClass();
        c0 c0Var2 = new c0(f02);
        e0 e0Var2 = this.originalRequest;
        e0Var2.getClass();
        e0.a aVar = new e0.a(e0Var2);
        String s6 = ProtectedSandApp.s("鉌");
        String s7 = ProtectedSandApp.s("鉍");
        e0 b6 = aVar.n(s7, s6).n(ProtectedSandApp.s("鉎"), s7).n(ProtectedSandApp.s("鉏"), this.key).n(ProtectedSandApp.s("鉐"), ProtectedSandApp.s("鉑")).n(s5, ProtectedSandApp.s("鉒")).b();
        okhttp3.internal.connection.e eVar = new okhttp3.internal.connection.e(c0Var2, b6, true);
        this.call = eVar;
        kotlin.jvm.internal.l0.m(eVar);
        eVar.R(new f(b6));
    }

    public final void u(@d5.d Exception exc, @d5.e g0 g0Var) {
        kotlin.jvm.internal.l0.p(exc, ProtectedSandApp.s("鉓"));
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
            m2 m2Var = m2.f23662a;
            try {
                this.listener.c(this, exc, g0Var);
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

    @d5.d
    /* renamed from: v, reason: from getter */
    public final l0 getListener() {
        return this.listener;
    }

    public final void w(@d5.d String str, @d5.d d dVar) throws IOException {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("鉔"));
        kotlin.jvm.internal.l0.p(dVar, ProtectedSandApp.s("鉕"));
        okhttp3.internal.ws.f fVar = this.extensions;
        kotlin.jvm.internal.l0.m(fVar);
        synchronized (this) {
            this.name = str;
            this.streams = dVar;
            this.writer = new i(dVar.getClient(), dVar.getSink(), this.random, fVar.perMessageDeflate, fVar.i(dVar.getClient()), this.minimumDeflateSize);
            this.writerTask = new C0486e();
            long j5 = this.pingIntervalMillis;
            if (j5 != 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(j5);
                okhttp3.internal.concurrent.c cVar = this.taskQueue;
                String str2 = str + ProtectedSandApp.s("鉖");
                cVar.n(new g(str2, str2, nanos, this, str, dVar, fVar), nanos);
            }
            if (!this.messageAndCloseQueue.isEmpty()) {
                D();
            }
            m2 m2Var = m2.f23662a;
        }
        this.reader = new okhttp3.internal.ws.h(dVar.getClient(), dVar.getSource(), this, fVar.perMessageDeflate, fVar.i(!dVar.getClient()));
    }

    public final void y() throws IOException {
        while (this.receivedCloseCode == -1) {
            okhttp3.internal.ws.h hVar = this.reader;
            kotlin.jvm.internal.l0.m(hVar);
            hVar.b();
        }
    }

    public final synchronized boolean z(@d5.d p payload) {
        kotlin.jvm.internal.l0.p(payload, ProtectedSandApp.s("鉗"));
        if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
            this.pongQueue.add(payload);
            D();
            return true;
        }
        return false;
    }
}
