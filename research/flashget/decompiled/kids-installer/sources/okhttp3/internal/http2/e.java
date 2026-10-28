package okhttp3.internal.http2;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.m2;
import okhttp3.internal.concurrent.c;
import okhttp3.internal.http2.g;
import okio.a0;
import okio.m;
import okio.n;
import okio.o;
import okio.p;

/* compiled from: Http2Connection.kt */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 Z2\u00020\u0001:\u0007¾\u0001¿\u0001À\u0001\fB\u0015\b\u0000\u0012\b\u0010»\u0001\u001a\u00030º\u0001¢\u0006\u0006\b¼\u0001\u0010½\u0001J&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\u0006\u0010\u000f\u001a\u00020\u0002J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u0002J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007J\u001c\u0010\u001a\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007J-\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00072\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ(\u0010\"\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\u0015J\u001f\u0010%\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010'\u001a\u00020#H\u0000¢\u0006\u0004\b(\u0010&J\u001f\u0010*\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u0015H\u0000¢\u0006\u0004\b*\u0010+J\u001e\u0010/\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0002J\u0006\u00100\u001a\u00020\rJ\u0006\u00101\u001a\u00020\rJ\u0006\u00102\u001a\u00020\rJ\u0006\u00103\u001a\u00020\rJ\u000e\u00104\u001a\u00020\r2\u0006\u0010'\u001a\u00020#J\b\u00105\u001a\u00020\rH\u0016J)\u00109\u001a\u00020\r2\u0006\u00106\u001a\u00020#2\u0006\u00107\u001a\u00020#2\b\u00108\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b9\u0010:J\u001c\u0010>\u001a\u00020\r2\b\b\u0002\u0010;\u001a\u00020\u00072\b\b\u0002\u0010=\u001a\u00020<H\u0007J\u000e\u0010A\u001a\u00020\r2\u0006\u0010@\u001a\u00020?J\u000e\u0010C\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\u0015J\u000f\u0010D\u001a\u00020\rH\u0000¢\u0006\u0004\bD\u0010EJ\u0017\u0010F\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0002H\u0000¢\u0006\u0004\bF\u0010GJ%\u0010H\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\bH\u0010IJ-\u0010K\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010J\u001a\u00020\u0007H\u0000¢\u0006\u0004\bK\u0010LJ/\u0010O\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010N\u001a\u00020M2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010J\u001a\u00020\u0007H\u0000¢\u0006\u0004\bO\u0010PJ\u001f\u0010Q\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\bQ\u0010&R\u001a\u0010V\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u001a\u0010\\\u001a\u00020W8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R&\u0010b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0]8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u001a\u0010h\u001a\u00020c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\"\u0010o\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010r\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bp\u0010j\u001a\u0004\bS\u0010l\"\u0004\bq\u0010nR\u0016\u0010t\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010SR\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010z\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010|\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010yR\u0014\u0010~\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010yR\u0017\u0010\u0082\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0019\u0010\u0085\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0019\u0010\u0087\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0084\u0001R\u0019\u0010\u0089\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0084\u0001R\u0019\u0010\u008b\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0084\u0001R\u0019\u0010\u008d\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u0084\u0001R\u0019\u0010\u008f\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u0084\u0001R\u0018\u0010\u0090\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b2\u0010\u0084\u0001R\u001b\u0010\u0094\u0001\u001a\u00020?8\u0006¢\u0006\u000f\n\u0005\b9\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R(\u0010\u0098\u0001\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bj\u0010\u0091\u0001\u001a\u0006\b\u0095\u0001\u0010\u0093\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R*\u0010\u009c\u0001\u001a\u00020\u00152\u0007\u0010\u0099\u0001\u001a\u00020\u00158\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0084\u0001\u0010\u0084\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R*\u0010\u009f\u0001\u001a\u00020\u00152\u0007\u0010\u0099\u0001\u001a\u00020\u00158\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010\u0084\u0001\u001a\u0006\b\u009e\u0001\u0010\u009b\u0001R*\u0010¢\u0001\u001a\u00020\u00152\u0007\u0010\u0099\u0001\u001a\u00020\u00158\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b \u0001\u0010\u0084\u0001\u001a\u0006\b¡\u0001\u0010\u009b\u0001R*\u0010¥\u0001\u001a\u00020\u00152\u0007\u0010\u0099\u0001\u001a\u00020\u00158\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b£\u0001\u0010\u0084\u0001\u001a\u0006\b¤\u0001\u0010\u009b\u0001R \u0010«\u0001\u001a\u00030¦\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001R\u001c\u0010°\u0001\u001a\u00030¬\u00018\u0006¢\u0006\u000f\n\u0005\b\u000e\u0010\u00ad\u0001\u001a\u0006\b®\u0001\u0010¯\u0001R \u0010µ\u0001\u001a\u00070±\u0001R\u00020\u00008\u0006¢\u0006\u000f\n\u0005\bT\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001R\u001e\u0010¹\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020¶\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001¨\u0006Á\u0001"}, d2 = {"Lokhttp3/internal/http2/e;", "Ljava/io/Closeable;", "", "associatedStreamId", "", "Lokhttp3/internal/http2/b;", "requestHeaders", "", "out", "Lokhttp3/internal/http2/h;", "y0", "Ljava/io/IOException;", "e", "Lkotlin/m2;", "O", "B0", "id", "k0", "streamId", "R0", "(I)Lokhttp3/internal/http2/h;", "", "read", "t1", "(J)V", "N0", "A0", "outFinished", "alternating", "v1", "(IZLjava/util/List;)V", "Lokio/m;", "buffer", "byteCount", "u1", "Lokhttp3/internal/http2/a;", "errorCode", "A1", "(ILokhttp3/internal/http2/a;)V", "statusCode", "z1", "unacknowledgedBytesRead", "B1", "(IJ)V", "reply", "payload1", "payload2", "x1", "y1", "w1", "G", "flush", "i1", "close", "connectionCode", "streamCode", "cause", "H", "(Lokhttp3/internal/http2/a;Lokhttp3/internal/http2/a;Ljava/io/IOException;)V", "sendConnectionPreface", "Lokhttp3/internal/concurrent/d;", "taskRunner", "q1", "Lokhttp3/internal/http2/l;", "settings", "g1", "nowNs", "p0", "T0", "()V", "O0", "(I)Z", "J0", "(ILjava/util/List;)V", "inFinished", "F0", "(ILjava/util/List;Z)V", "Lokio/o;", "source", "E0", "(ILokio/o;IZ)V", "M0", "o", "Z", "P", "()Z", "client", "Lokhttp3/internal/http2/e$d;", "p", "Lokhttp3/internal/http2/e$d;", "X", "()Lokhttp3/internal/http2/e$d;", "listener", "", "q", "Ljava/util/Map;", "l0", "()Ljava/util/Map;", "streams", "", "r", "Ljava/lang/String;", "R", "()Ljava/lang/String;", "connectionName", "s", "I", "U", "()I", "U0", "(I)V", "lastGoodStreamId", "t", "b1", "nextStreamId", "u", "isShutdown", "v", "Lokhttp3/internal/concurrent/d;", "Lokhttp3/internal/concurrent/c;", "w", "Lokhttp3/internal/concurrent/c;", "writerQueue", "x", "pushQueue", "y", "settingsListenerQueue", "Lokhttp3/internal/http2/k;", "z", "Lokhttp3/internal/http2/k;", "pushObserver", "A", "J", "intervalPingsSent", "B", "intervalPongsReceived", "C", "degradedPingsSent", "D", "degradedPongsReceived", "E", "awaitPingsSent", "F", "awaitPongsReceived", "degradedPongDeadlineNs", "Lokhttp3/internal/http2/l;", "b0", "()Lokhttp3/internal/http2/l;", "okHttpSettings", "d0", "f1", "(Lokhttp3/internal/http2/l;)V", "peerSettings", "<set-?>", "f0", "()J", "readBytesTotal", "K", "e0", "readBytesAcknowledged", "L", "n0", "writeBytesTotal", "M", "m0", "writeBytesMaximum", "Ljava/net/Socket;", "N", "Ljava/net/Socket;", "i0", "()Ljava/net/Socket;", "socket", "Lokhttp3/internal/http2/i;", "Lokhttp3/internal/http2/i;", "o0", "()Lokhttp3/internal/http2/i;", "writer", "Lokhttp3/internal/http2/e$e;", "Lokhttp3/internal/http2/e$e;", "g0", "()Lokhttp3/internal/http2/e$e;", "readerRunnable", "", "Q", "Ljava/util/Set;", "currentPushRequests", "Lokhttp3/internal/http2/e$b;", "builder", "<init>", "(Lokhttp3/internal/http2/e$b;)V", "b", "c", "d", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class e implements Closeable {
    public static final int R = 16777216;

    @d5.d
    private static final okhttp3.internal.http2.l S;
    public static final int T = 1;
    public static final int U = 2;
    public static final int V = 3;
    public static final int W = 1000000000;

    /* renamed from: X, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: A, reason: from kotlin metadata */
    private long intervalPingsSent;

    /* renamed from: B, reason: from kotlin metadata */
    private long intervalPongsReceived;

    /* renamed from: C, reason: from kotlin metadata */
    private long degradedPingsSent;

    /* renamed from: D, reason: from kotlin metadata */
    private long degradedPongsReceived;

    /* renamed from: E, reason: from kotlin metadata */
    private long awaitPingsSent;

    /* renamed from: F, reason: from kotlin metadata */
    private long awaitPongsReceived;

    /* renamed from: G, reason: from kotlin metadata */
    private long degradedPongDeadlineNs;

    /* renamed from: H, reason: from kotlin metadata */
    @d5.d
    private final okhttp3.internal.http2.l okHttpSettings;

    /* renamed from: I, reason: from kotlin metadata */
    @d5.d
    private okhttp3.internal.http2.l peerSettings;

    /* renamed from: J, reason: from kotlin metadata */
    private long readBytesTotal;

    /* renamed from: K, reason: from kotlin metadata */
    private long readBytesAcknowledged;

    /* renamed from: L, reason: from kotlin metadata */
    private long writeBytesTotal;

    /* renamed from: M, reason: from kotlin metadata */
    private long writeBytesMaximum;

    /* renamed from: N, reason: from kotlin metadata */
    @d5.d
    private final Socket socket;

    /* renamed from: O, reason: from kotlin metadata */
    @d5.d
    private final okhttp3.internal.http2.i writer;

    /* renamed from: P, reason: from kotlin metadata */
    @d5.d
    private final C0479e readerRunnable;

    /* renamed from: Q, reason: from kotlin metadata */
    private final Set<Integer> currentPushRequests;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final boolean client;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final d listener;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final Map<Integer, okhttp3.internal.http2.h> streams;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String connectionName;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int lastGoodStreamId;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int nextStreamId;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private boolean isShutdown;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final okhttp3.internal.concurrent.d taskRunner;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final okhttp3.internal.concurrent.c writerQueue;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final okhttp3.internal.concurrent.c pushQueue;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final okhttp3.internal.concurrent.c settingsListenerQueue;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final okhttp3.internal.http2.k pushObserver;

    /* compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"okhttp3/internal/concurrent/c$c", "Lokhttp3/internal/concurrent/a;", "", "f", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a extends okhttp3.internal.concurrent.a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f31095e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ e f31096f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f31097g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, e eVar, long j5) {
            super(str2, false, 2, null);
            this.f31095e = str;
            this.f31096f = eVar;
            this.f31097g = j5;
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            boolean z5;
            synchronized (this.f31096f) {
                if (this.f31096f.intervalPongsReceived < this.f31096f.intervalPingsSent) {
                    z5 = true;
                } else {
                    this.f31096f.intervalPingsSent++;
                    z5 = false;
                }
            }
            if (z5) {
                this.f31096f.O(null);
                return -1L;
            }
            this.f31096f.x1(false, 1, 0);
            return this.f31097g;
        }
    }

    /* compiled from: Http2Connection.kt */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010@\u001a\u00020;\u0012\u0006\u0010E\u001a\u00020A¢\u0006\u0004\bF\u0010GJ.\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0015\u001a\u00020\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010!\u001a\u00020\u00048\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u001d\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010\t\u001a\u00020\b8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\f\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b'\u0010/\"\u0004\b0\u00101R\"\u0010\u000f\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b2\u00104\"\u0004\b5\u00106R\"\u0010\u0012\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u00107\u001a\u0004\b-\u00108\"\u0004\b9\u0010:R\"\u0010@\u001a\u00020;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010<\u001a\u0004\b\u001b\u0010=\"\u0004\b>\u0010?R\u001a\u0010E\u001a\u00020A8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010B\u001a\u0004\bC\u0010D¨\u0006H"}, d2 = {"Lokhttp3/internal/http2/e$b;", "", "Ljava/net/Socket;", "socket", "", "peerName", "Lokio/o;", "source", "Lokio/n;", "sink", "y", "Lokhttp3/internal/http2/e$d;", "listener", "k", "Lokhttp3/internal/http2/k;", "pushObserver", "m", "", "pingIntervalMillis", "l", "Lokhttp3/internal/http2/e;", "a", "Ljava/net/Socket;", "h", "()Ljava/net/Socket;", "t", "(Ljava/net/Socket;)V", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "o", "(Ljava/lang/String;)V", "connectionName", "Lokio/o;", "i", "()Lokio/o;", "u", "(Lokio/o;)V", "d", "Lokio/n;", "g", "()Lokio/n;", "s", "(Lokio/n;)V", "e", "Lokhttp3/internal/http2/e$d;", "()Lokhttp3/internal/http2/e$d;", "p", "(Lokhttp3/internal/http2/e$d;)V", "f", "Lokhttp3/internal/http2/k;", "()Lokhttp3/internal/http2/k;", "r", "(Lokhttp3/internal/http2/k;)V", "I", "()I", "q", "(I)V", "", "Z", "()Z", "n", "(Z)V", "client", "Lokhttp3/internal/concurrent/d;", "Lokhttp3/internal/concurrent/d;", "j", "()Lokhttp3/internal/concurrent/d;", "taskRunner", "<init>", "(ZLokhttp3/internal/concurrent/d;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.d
        public Socket socket;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d5.d
        public String connectionName;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @d5.d
        public o source;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @d5.d
        public n sink;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private d listener;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private okhttp3.internal.http2.k pushObserver;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private int pingIntervalMillis;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean client;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final okhttp3.internal.concurrent.d taskRunner;

        public b(boolean z5, @d5.d okhttp3.internal.concurrent.d dVar) {
            l0.p(dVar, ProtectedSandApp.s("搆"));
            this.client = z5;
            this.taskRunner = dVar;
            this.listener = d.f31107a;
            this.pushObserver = okhttp3.internal.http2.k.f31246a;
        }

        public static /* synthetic */ b z(b bVar, Socket socket, String str, o oVar, n nVar, int i5, Object obj) throws IOException {
            if ((i5 & 2) != 0) {
                str = okhttp3.internal.d.O(socket);
            }
            if ((i5 & 4) != 0) {
                oVar = a0.d(a0.n(socket));
            }
            if ((i5 & 8) != 0) {
                nVar = a0.c(a0.i(socket));
            }
            return bVar.y(socket, str, oVar, nVar);
        }

        @d5.d
        public final e a() {
            return new e(this);
        }

        /* renamed from: b, reason: from getter */
        public final boolean getClient() {
            return this.client;
        }

        @d5.d
        public final String c() {
            String str = this.connectionName;
            if (str == null) {
                l0.S(ProtectedSandApp.s("搇"));
            }
            return str;
        }

        @d5.d
        /* renamed from: d, reason: from getter */
        public final d getListener() {
            return this.listener;
        }

        /* renamed from: e, reason: from getter */
        public final int getPingIntervalMillis() {
            return this.pingIntervalMillis;
        }

        @d5.d
        /* renamed from: f, reason: from getter */
        public final okhttp3.internal.http2.k getPushObserver() {
            return this.pushObserver;
        }

        @d5.d
        public final n g() {
            n nVar = this.sink;
            if (nVar == null) {
                l0.S(ProtectedSandApp.s("搈"));
            }
            return nVar;
        }

        @d5.d
        public final Socket h() {
            Socket socket = this.socket;
            if (socket == null) {
                l0.S(ProtectedSandApp.s("搉"));
            }
            return socket;
        }

        @d5.d
        public final o i() {
            o oVar = this.source;
            if (oVar == null) {
                l0.S(ProtectedSandApp.s("搊"));
            }
            return oVar;
        }

        @d5.d
        /* renamed from: j, reason: from getter */
        public final okhttp3.internal.concurrent.d getTaskRunner() {
            return this.taskRunner;
        }

        @d5.d
        public final b k(@d5.d d listener) {
            l0.p(listener, ProtectedSandApp.s("搋"));
            this.listener = listener;
            return this;
        }

        @d5.d
        public final b l(int pingIntervalMillis) {
            this.pingIntervalMillis = pingIntervalMillis;
            return this;
        }

        @d5.d
        public final b m(@d5.d okhttp3.internal.http2.k pushObserver) {
            l0.p(pushObserver, ProtectedSandApp.s("搌"));
            this.pushObserver = pushObserver;
            return this;
        }

        public final void n(boolean z5) {
            this.client = z5;
        }

        public final void o(@d5.d String str) {
            l0.p(str, ProtectedSandApp.s("損"));
            this.connectionName = str;
        }

        public final void p(@d5.d d dVar) {
            l0.p(dVar, ProtectedSandApp.s("搎"));
            this.listener = dVar;
        }

        public final void q(int i5) {
            this.pingIntervalMillis = i5;
        }

        public final void r(@d5.d okhttp3.internal.http2.k kVar) {
            l0.p(kVar, ProtectedSandApp.s("搏"));
            this.pushObserver = kVar;
        }

        public final void s(@d5.d n nVar) {
            l0.p(nVar, ProtectedSandApp.s("搐"));
            this.sink = nVar;
        }

        public final void t(@d5.d Socket socket) {
            l0.p(socket, ProtectedSandApp.s("搑"));
            this.socket = socket;
        }

        public final void u(@d5.d o oVar) {
            l0.p(oVar, ProtectedSandApp.s("搒"));
            this.source = oVar;
        }

        @d5.d
        @p3.j
        public final b v(@d5.d Socket socket) throws IOException {
            return z(this, socket, null, null, null, 14, null);
        }

        @d5.d
        @p3.j
        public final b w(@d5.d Socket socket, @d5.d String str) throws IOException {
            return z(this, socket, str, null, null, 12, null);
        }

        @d5.d
        @p3.j
        public final b x(@d5.d Socket socket, @d5.d String str, @d5.d o oVar) throws IOException {
            return z(this, socket, str, oVar, null, 8, null);
        }

        @d5.d
        @p3.j
        public final b y(@d5.d Socket socket, @d5.d String peerName, @d5.d o source, @d5.d n sink) throws IOException {
            String a6;
            l0.p(socket, ProtectedSandApp.s("搓"));
            l0.p(peerName, ProtectedSandApp.s("搔"));
            l0.p(source, ProtectedSandApp.s("搕"));
            l0.p(sink, ProtectedSandApp.s("搖"));
            this.socket = socket;
            if (this.client) {
                a6 = okhttp3.internal.d.f30937i + ' ' + peerName;
            } else {
                a6 = androidx.constraintlayout.motion.widget.g.a(ProtectedSandApp.s("搗"), peerName);
            }
            this.connectionName = a6;
            this.source = source;
            this.sink = sink;
            return this;
        }
    }

    /* compiled from: Http2Connection.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/http2/e$c;", "", "Lokhttp3/internal/http2/l;", "DEFAULT_SETTINGS", "Lokhttp3/internal/http2/l;", "a", "()Lokhttp3/internal/http2/l;", "", "AWAIT_PING", "I", "DEGRADED_PING", "DEGRADED_PONG_TIMEOUT_NS", "INTERVAL_PING", "OKHTTP_CLIENT_WINDOW_SIZE", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.http2.e$c, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @d5.d
        public final okhttp3.internal.http2.l a() {
            return e.S;
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: Http2Connection.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/http2/e$d;", "", "Lokhttp3/internal/http2/h;", "stream", "Lkotlin/m2;", "f", "Lokhttp3/internal/http2/e;", "connection", "Lokhttp3/internal/http2/l;", "settings", "e", "<init>", "()V", "b", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        @p3.f
        public static final d f31107a = new a();

        /* compiled from: Http2Connection.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"okhttp3/internal/http2/e$d$a", "Lokhttp3/internal/http2/e$d;", "Lokhttp3/internal/http2/h;", "stream", "Lkotlin/m2;", "f", "okhttp"}, k = 1, mv = {1, 4, 0})
        public static final class a extends d {
            a() {
            }

            @Override // okhttp3.internal.http2.e.d
            public void f(@d5.d okhttp3.internal.http2.h hVar) throws IOException {
                l0.p(hVar, ProtectedSandApp.s("搘"));
                hVar.d(okhttp3.internal.http2.a.REFUSED_STREAM, null);
            }
        }

        public void e(@d5.d e eVar, @d5.d okhttp3.internal.http2.l lVar) {
            l0.p(eVar, ProtectedSandApp.s("懷"));
            l0.p(lVar, ProtectedSandApp.s("懸"));
        }

        public abstract void f(@d5.d okhttp3.internal.http2.h hVar) throws IOException;
    }

    /* compiled from: Http2Connection.kt */
    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\b\u0000\u0012\u0006\u00109\u001a\u000204¢\u0006\u0004\b:\u0010;J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J.\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0016\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0016J \u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J \u0010\"\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 H\u0016J\u0018\u0010%\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#H\u0016J(\u0010)\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0005H\u0016J&\u0010,\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J8\u00103\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020 2\u0006\u00100\u001a\u00020-2\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020#H\u0016R\u001a\u00109\u001a\u0002048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006<"}, d2 = {"Lokhttp3/internal/http2/e$e;", "Lokhttp3/internal/http2/g$c;", "Lkotlin/Function0;", "Lkotlin/m2;", "u", "", "inFinished", "", "streamId", "Lokio/o;", "source", "length", "i", "associatedStreamId", "", "Lokhttp3/internal/http2/b;", "headerBlock", "c", "Lokhttp3/internal/http2/a;", "errorCode", "l", "clearPrevious", "Lokhttp3/internal/http2/l;", "settings", "b", "s", "a", "ack", "payload1", "payload2", "j", "lastGoodStreamId", "Lokio/p;", "debugData", "r", "", "windowSizeIncrement", "d", "streamDependency", "weight", "exclusive", "k", "promisedStreamId", "requestHeaders", "m", "", "origin", "protocol", "host", "port", "maxAge", "g", "Lokhttp3/internal/http2/g;", "o", "Lokhttp3/internal/http2/g;", "t", "()Lokhttp3/internal/http2/g;", "reader", "<init>", "(Lokhttp3/internal/http2/e;Lokhttp3/internal/http2/g;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.http2.e$e, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public final class C0479e implements g.c, q3.a<m2> {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final okhttp3.internal.http2.g reader;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ e f31110p;

        /* compiled from: TaskQueue.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0005"}, d2 = {"okhttp3/internal/concurrent/TaskQueue$execute$1", "Lokhttp3/internal/concurrent/a;", "", "f", "okhttp", "okhttp3/internal/http2/Http2Connection$ReaderRunnable$$special$$inlined$synchronized$lambda$1"}, k = 1, mv = {1, 4, 0})
        /* renamed from: okhttp3.internal.http2.e$e$a */
        /* loaded from: classes5.dex */
        public static final class a extends okhttp3.internal.concurrent.a {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f31111e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f31112f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C0479e f31113g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ k1.h f31114h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ boolean f31115i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ okhttp3.internal.http2.l f31116j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ k1.g f31117k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ k1.h f31118l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z5, String str2, boolean z6, C0479e c0479e, k1.h hVar, boolean z7, okhttp3.internal.http2.l lVar, k1.g gVar, k1.h hVar2) {
                super(str2, z6);
                this.f31111e = str;
                this.f31112f = z5;
                this.f31113g = c0479e;
                this.f31114h = hVar;
                this.f31115i = z7;
                this.f31116j = lVar;
                this.f31117k = gVar;
                this.f31118l = hVar2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // okhttp3.internal.concurrent.a
            public long f() {
                this.f31113g.f31110p.getListener().e(this.f31113g.f31110p, (okhttp3.internal.http2.l) this.f31114h.f23572o);
                return -1L;
            }
        }

        /* compiled from: TaskQueue.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0005"}, d2 = {"okhttp3/internal/concurrent/TaskQueue$execute$1", "Lokhttp3/internal/concurrent/a;", "", "f", "okhttp", "okhttp3/internal/http2/Http2Connection$ReaderRunnable$$special$$inlined$execute$1"}, k = 1, mv = {1, 4, 0})
        /* renamed from: okhttp3.internal.http2.e$e$b */
        /* loaded from: classes5.dex */
        public static final class b extends okhttp3.internal.concurrent.a {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f31119e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f31120f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ okhttp3.internal.http2.h f31121g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ C0479e f31122h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ okhttp3.internal.http2.h f31123i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ int f31124j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ List f31125k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ boolean f31126l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z5, String str2, boolean z6, okhttp3.internal.http2.h hVar, C0479e c0479e, okhttp3.internal.http2.h hVar2, int i5, List list, boolean z7) {
                super(str2, z6);
                this.f31119e = str;
                this.f31120f = z5;
                this.f31121g = hVar;
                this.f31122h = c0479e;
                this.f31123i = hVar2;
                this.f31124j = i5;
                this.f31125k = list;
                this.f31126l = z7;
            }

            @Override // okhttp3.internal.concurrent.a
            public long f() {
                try {
                    this.f31122h.f31110p.getListener().f(this.f31121g);
                    return -1L;
                } catch (IOException e6) {
                    okhttp3.internal.platform.j.INSTANCE.getClass();
                    okhttp3.internal.platform.j.f31323a.m(ProtectedSandApp.s("搙") + this.f31122h.f31110p.getConnectionName(), 4, e6);
                    try {
                        this.f31121g.d(okhttp3.internal.http2.a.PROTOCOL_ERROR, e6);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        /* compiled from: TaskQueue.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"okhttp3/internal/concurrent/c$b", "Lokhttp3/internal/concurrent/a;", "", "f", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: okhttp3.internal.http2.e$e$c */
        /* loaded from: classes5.dex */
        public static final class c extends okhttp3.internal.concurrent.a {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f31127e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f31128f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C0479e f31129g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f31130h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f31131i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z5, String str2, boolean z6, C0479e c0479e, int i5, int i6) {
                super(str2, z6);
                this.f31127e = str;
                this.f31128f = z5;
                this.f31129g = c0479e;
                this.f31130h = i5;
                this.f31131i = i6;
            }

            @Override // okhttp3.internal.concurrent.a
            public long f() {
                this.f31129g.f31110p.x1(true, this.f31130h, this.f31131i);
                return -1L;
            }
        }

        /* compiled from: TaskQueue.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"okhttp3/internal/concurrent/c$b", "Lokhttp3/internal/concurrent/a;", "", "f", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: okhttp3.internal.http2.e$e$d */
        /* loaded from: classes5.dex */
        public static final class d extends okhttp3.internal.concurrent.a {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f31132e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f31133f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C0479e f31134g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ boolean f31135h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ okhttp3.internal.http2.l f31136i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str, boolean z5, String str2, boolean z6, C0479e c0479e, boolean z7, okhttp3.internal.http2.l lVar) {
                super(str2, z6);
                this.f31132e = str;
                this.f31133f = z5;
                this.f31134g = c0479e;
                this.f31135h = z7;
                this.f31136i = lVar;
            }

            @Override // okhttp3.internal.concurrent.a
            public long f() {
                this.f31134g.s(this.f31135h, this.f31136i);
                return -1L;
            }
        }

        public C0479e(@d5.d e eVar, okhttp3.internal.http2.g gVar) {
            l0.p(gVar, ProtectedSandApp.s("釉"));
            this.f31110p = eVar;
            this.reader = gVar;
        }

        @Override // okhttp3.internal.http2.g.c
        public void a() {
        }

        @Override // okhttp3.internal.http2.g.c
        public void b(boolean z5, @d5.d okhttp3.internal.http2.l lVar) {
            l0.p(lVar, ProtectedSandApp.s("释"));
            okhttp3.internal.concurrent.c cVar = this.f31110p.writerQueue;
            String str = this.f31110p.getConnectionName() + ProtectedSandApp.s("釋");
            cVar.n(new d(str, true, str, true, this, z5, lVar), 0L);
        }

        @Override // okhttp3.internal.http2.g.c
        public void c(boolean z5, int i5, int i6, @d5.d List<okhttp3.internal.http2.b> list) {
            l0.p(list, ProtectedSandApp.s("里"));
            if (this.f31110p.O0(i5)) {
                this.f31110p.F0(i5, list, z5);
                return;
            }
            synchronized (this.f31110p) {
                okhttp3.internal.http2.h k02 = this.f31110p.k0(i5);
                if (k02 != null) {
                    m2 m2Var = m2.f23662a;
                    k02.z(okhttp3.internal.d.X(list), z5);
                    return;
                }
                if (this.f31110p.isShutdown) {
                    return;
                }
                if (i5 <= this.f31110p.getLastGoodStreamId()) {
                    return;
                }
                if (i5 % 2 == this.f31110p.getNextStreamId() % 2) {
                    return;
                }
                okhttp3.internal.http2.h hVar = new okhttp3.internal.http2.h(i5, this.f31110p, false, z5, okhttp3.internal.d.X(list));
                this.f31110p.U0(i5);
                this.f31110p.l0().put(Integer.valueOf(i5), hVar);
                okhttp3.internal.concurrent.c j5 = this.f31110p.taskRunner.j();
                String str = this.f31110p.getConnectionName() + '[' + i5 + ProtectedSandApp.s("重");
                j5.n(new b(str, true, str, true, hVar, this, k02, i5, list, z5), 0L);
            }
        }

        @Override // okhttp3.internal.http2.g.c
        public void d(int i5, long j5) {
            if (i5 != 0) {
                okhttp3.internal.http2.h k02 = this.f31110p.k0(i5);
                if (k02 != null) {
                    synchronized (k02) {
                        k02.a(j5);
                        m2 m2Var = m2.f23662a;
                    }
                    return;
                }
                return;
            }
            synchronized (this.f31110p) {
                e eVar = this.f31110p;
                eVar.writeBytesMaximum = eVar.getWriteBytesMaximum() + j5;
                e eVar2 = this.f31110p;
                if (eVar2 == null) {
                    throw new NullPointerException(ProtectedSandApp.s("野"));
                }
                eVar2.notifyAll();
                m2 m2Var2 = m2.f23662a;
            }
        }

        @Override // okhttp3.internal.http2.g.c
        public void g(int i5, @d5.d String str, @d5.d p pVar, @d5.d String str2, int i6, long j5) {
            l0.p(str, ProtectedSandApp.s("量"));
            l0.p(pVar, ProtectedSandApp.s("釐"));
            l0.p(str2, ProtectedSandApp.s("金"));
        }

        @Override // okhttp3.internal.http2.g.c
        public void i(boolean z5, int i5, @d5.d o oVar, int i6) throws IOException {
            l0.p(oVar, ProtectedSandApp.s("釒"));
            if (this.f31110p.O0(i5)) {
                this.f31110p.E0(i5, oVar, i6, z5);
                return;
            }
            okhttp3.internal.http2.h k02 = this.f31110p.k0(i5);
            if (k02 == null) {
                this.f31110p.A1(i5, okhttp3.internal.http2.a.PROTOCOL_ERROR);
                long j5 = i6;
                this.f31110p.t1(j5);
                oVar.skip(j5);
                return;
            }
            k02.y(oVar, i6);
            if (z5) {
                k02.z(okhttp3.internal.d.f30930b, true);
            }
        }

        @Override // okhttp3.internal.http2.g.c
        public void j(boolean z5, int i5, int i6) {
            if (!z5) {
                okhttp3.internal.concurrent.c cVar = this.f31110p.writerQueue;
                String str = this.f31110p.getConnectionName() + ProtectedSandApp.s("釔");
                cVar.n(new c(str, true, str, true, this, i5, i6), 0L);
                return;
            }
            synchronized (this.f31110p) {
                if (i5 == 1) {
                    this.f31110p.intervalPongsReceived++;
                } else if (i5 != 2) {
                    if (i5 == 3) {
                        this.f31110p.awaitPongsReceived++;
                        e eVar = this.f31110p;
                        if (eVar == null) {
                            throw new NullPointerException(ProtectedSandApp.s("釓"));
                        }
                        eVar.notifyAll();
                    }
                    m2 m2Var = m2.f23662a;
                } else {
                    this.f31110p.degradedPongsReceived++;
                }
            }
        }

        @Override // okhttp3.internal.http2.g.c
        public void k(int i5, int i6, int i7, boolean z5) {
        }

        @Override // okhttp3.internal.http2.g.c
        public void l(int i5, @d5.d okhttp3.internal.http2.a aVar) {
            l0.p(aVar, ProtectedSandApp.s("釕"));
            if (this.f31110p.O0(i5)) {
                this.f31110p.M0(i5, aVar);
                return;
            }
            okhttp3.internal.http2.h R0 = this.f31110p.R0(i5);
            if (R0 != null) {
                R0.A(aVar);
            }
        }

        @Override // okhttp3.internal.http2.g.c
        public void m(int i5, int i6, @d5.d List<okhttp3.internal.http2.b> list) {
            l0.p(list, ProtectedSandApp.s("釖"));
            this.f31110p.J0(i6, list);
        }

        @Override // q3.a
        public /* bridge */ /* synthetic */ m2 n() {
            u();
            return m2.f23662a;
        }

        @Override // okhttp3.internal.http2.g.c
        public void r(int i5, @d5.d okhttp3.internal.http2.a aVar, @d5.d p pVar) {
            int i6;
            okhttp3.internal.http2.h[] hVarArr;
            l0.p(aVar, ProtectedSandApp.s("釗"));
            l0.p(pVar, ProtectedSandApp.s("釘"));
            pVar.i0();
            synchronized (this.f31110p) {
                Object[] array = this.f31110p.l0().values().toArray(new okhttp3.internal.http2.h[0]);
                if (array == null) {
                    throw new NullPointerException(ProtectedSandApp.s("釙"));
                }
                hVarArr = (okhttp3.internal.http2.h[]) array;
                this.f31110p.isShutdown = true;
                m2 m2Var = m2.f23662a;
            }
            for (okhttp3.internal.http2.h hVar : hVarArr) {
                if (hVar.getId() > i5 && hVar.v()) {
                    hVar.A(okhttp3.internal.http2.a.REFUSED_STREAM);
                    this.f31110p.R0(hVar.getId());
                }
            }
        }

        /* JADX WARN: Can't wrap try/catch for region: R(8:(2:15|(10:17|18|19|20|21|22|23|24|25|26)(2:51|52))|20|21|22|23|24|25|26) */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00e2, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00e3, code lost:
        
            r21.f31110p.O(r0);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, okhttp3.internal.http2.l] */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Type inference failed for: r2v16 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void s(boolean r22, @d5.d okhttp3.internal.http2.l r23) {
            /*
                Method dump skipped, instructions count: 280
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.C0479e.s(boolean, okhttp3.internal.http2.l):void");
        }

        @d5.d
        /* renamed from: t, reason: from getter */
        public final okhttp3.internal.http2.g getReader() {
            return this.reader;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http2.a] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable, okhttp3.internal.http2.g] */
        public void u() {
            okhttp3.internal.http2.a aVar;
            okhttp3.internal.http2.a aVar2 = okhttp3.internal.http2.a.INTERNAL_ERROR;
            IOException e6 = null;
            try {
                try {
                    this.reader.c(this);
                    while (this.reader.b(false, this)) {
                    }
                    okhttp3.internal.http2.a aVar3 = okhttp3.internal.http2.a.NO_ERROR;
                    try {
                        this.f31110p.H(aVar3, okhttp3.internal.http2.a.CANCEL, null);
                        aVar = aVar3;
                    } catch (IOException e7) {
                        e6 = e7;
                        okhttp3.internal.http2.a aVar4 = okhttp3.internal.http2.a.PROTOCOL_ERROR;
                        e eVar = this.f31110p;
                        eVar.H(aVar4, aVar4, e6);
                        aVar = eVar;
                        aVar2 = this.reader;
                        okhttp3.internal.d.l(aVar2);
                    }
                } catch (Throwable th) {
                    th = th;
                    this.f31110p.H(aVar, aVar2, e6);
                    okhttp3.internal.d.l(this.reader);
                    throw th;
                }
            } catch (IOException e8) {
                e6 = e8;
            } catch (Throwable th2) {
                th = th2;
                aVar = aVar2;
                this.f31110p.H(aVar, aVar2, e6);
                okhttp3.internal.d.l(this.reader);
                throw th;
            }
            aVar2 = this.reader;
            okhttp3.internal.d.l(aVar2);
        }
    }

    /* compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"okhttp3/internal/concurrent/c$b", "Lokhttp3/internal/concurrent/a;", "", "f", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class f extends okhttp3.internal.concurrent.a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f31137e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f31138f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e f31139g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f31140h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ m f31141i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f31142j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f31143k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, boolean z5, String str2, boolean z6, e eVar, int i5, m mVar, int i6, boolean z7) {
            super(str2, z6);
            this.f31137e = str;
            this.f31138f = z5;
            this.f31139g = eVar;
            this.f31140h = i5;
            this.f31141i = mVar;
            this.f31142j = i6;
            this.f31143k = z7;
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            try {
                boolean d6 = this.f31139g.pushObserver.d(this.f31140h, this.f31141i, this.f31142j, this.f31143k);
                if (d6) {
                    this.f31139g.getWriter().o(this.f31140h, okhttp3.internal.http2.a.CANCEL);
                }
                if (!d6 && !this.f31143k) {
                    return -1L;
                }
                synchronized (this.f31139g) {
                    this.f31139g.currentPushRequests.remove(Integer.valueOf(this.f31140h));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"okhttp3/internal/concurrent/c$b", "Lokhttp3/internal/concurrent/a;", "", "f", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class g extends okhttp3.internal.concurrent.a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f31144e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f31145f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e f31146g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f31147h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ List f31148i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f31149j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z5, String str2, boolean z6, e eVar, int i5, List list, boolean z7) {
            super(str2, z6);
            this.f31144e = str;
            this.f31145f = z5;
            this.f31146g = eVar;
            this.f31147h = i5;
            this.f31148i = list;
            this.f31149j = z7;
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            boolean b6 = this.f31146g.pushObserver.b(this.f31147h, this.f31148i, this.f31149j);
            if (b6) {
                try {
                    this.f31146g.getWriter().o(this.f31147h, okhttp3.internal.http2.a.CANCEL);
                } catch (IOException unused) {
                    return -1L;
                }
            }
            if (!b6 && !this.f31149j) {
                return -1L;
            }
            synchronized (this.f31146g) {
                this.f31146g.currentPushRequests.remove(Integer.valueOf(this.f31147h));
            }
            return -1L;
        }
    }

    /* compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"okhttp3/internal/concurrent/c$b", "Lokhttp3/internal/concurrent/a;", "", "f", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class h extends okhttp3.internal.concurrent.a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f31150e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f31151f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e f31152g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f31153h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ List f31154i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z5, String str2, boolean z6, e eVar, int i5, List list) {
            super(str2, z6);
            this.f31150e = str;
            this.f31151f = z5;
            this.f31152g = eVar;
            this.f31153h = i5;
            this.f31154i = list;
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            if (!this.f31152g.pushObserver.a(this.f31153h, this.f31154i)) {
                return -1L;
            }
            try {
                this.f31152g.getWriter().o(this.f31153h, okhttp3.internal.http2.a.CANCEL);
                synchronized (this.f31152g) {
                    this.f31152g.currentPushRequests.remove(Integer.valueOf(this.f31153h));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"okhttp3/internal/concurrent/c$b", "Lokhttp3/internal/concurrent/a;", "", "f", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class i extends okhttp3.internal.concurrent.a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f31155e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f31156f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e f31157g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f31158h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ okhttp3.internal.http2.a f31159i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, boolean z5, String str2, boolean z6, e eVar, int i5, okhttp3.internal.http2.a aVar) {
            super(str2, z6);
            this.f31155e = str;
            this.f31156f = z5;
            this.f31157g = eVar;
            this.f31158h = i5;
            this.f31159i = aVar;
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            this.f31157g.pushObserver.c(this.f31158h, this.f31159i);
            synchronized (this.f31157g) {
                this.f31157g.currentPushRequests.remove(Integer.valueOf(this.f31158h));
                m2 m2Var = m2.f23662a;
            }
            return -1L;
        }
    }

    /* compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"okhttp3/internal/concurrent/c$b", "Lokhttp3/internal/concurrent/a;", "", "f", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class j extends okhttp3.internal.concurrent.a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f31160e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f31161f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e f31162g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, boolean z5, String str2, boolean z6, e eVar) {
            super(str2, z6);
            this.f31160e = str;
            this.f31161f = z5;
            this.f31162g = eVar;
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            this.f31162g.x1(false, 2, 0);
            return -1L;
        }
    }

    /* compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"okhttp3/internal/concurrent/c$b", "Lokhttp3/internal/concurrent/a;", "", "f", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class k extends okhttp3.internal.concurrent.a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f31163e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f31164f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e f31165g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f31166h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ okhttp3.internal.http2.a f31167i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, boolean z5, String str2, boolean z6, e eVar, int i5, okhttp3.internal.http2.a aVar) {
            super(str2, z6);
            this.f31163e = str;
            this.f31164f = z5;
            this.f31165g = eVar;
            this.f31166h = i5;
            this.f31167i = aVar;
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            try {
                this.f31165g.z1(this.f31166h, this.f31167i);
                return -1L;
            } catch (IOException e6) {
                this.f31165g.O(e6);
                return -1L;
            }
        }
    }

    /* compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"okhttp3/internal/concurrent/c$b", "Lokhttp3/internal/concurrent/a;", "", "f", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class l extends okhttp3.internal.concurrent.a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f31168e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f31169f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e f31170g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f31171h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f31172i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, boolean z5, String str2, boolean z6, e eVar, int i5, long j5) {
            super(str2, z6);
            this.f31168e = str;
            this.f31169f = z5;
            this.f31170g = eVar;
            this.f31171h = i5;
            this.f31172i = j5;
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            try {
                this.f31170g.getWriter().t(this.f31171h, this.f31172i);
                return -1L;
            } catch (IOException e6) {
                this.f31170g.O(e6);
                return -1L;
            }
        }
    }

    static {
        okhttp3.internal.http2.l lVar = new okhttp3.internal.http2.l();
        lVar.k(7, 65535);
        lVar.k(5, 16384);
        S = lVar;
    }

    public e(@d5.d b bVar) {
        l0.p(bVar, ProtectedSandApp.s("搚"));
        boolean client = bVar.getClient();
        this.client = client;
        this.listener = bVar.getListener();
        this.streams = new LinkedHashMap();
        String c6 = bVar.c();
        this.connectionName = c6;
        this.nextStreamId = bVar.getClient() ? 3 : 2;
        okhttp3.internal.concurrent.d taskRunner = bVar.getTaskRunner();
        this.taskRunner = taskRunner;
        okhttp3.internal.concurrent.c j5 = taskRunner.j();
        this.writerQueue = j5;
        this.pushQueue = taskRunner.j();
        this.settingsListenerQueue = taskRunner.j();
        this.pushObserver = bVar.getPushObserver();
        okhttp3.internal.http2.l lVar = new okhttp3.internal.http2.l();
        if (bVar.getClient()) {
            lVar.k(7, 16777216);
        }
        m2 m2Var = m2.f23662a;
        this.okHttpSettings = lVar;
        this.peerSettings = S;
        this.writeBytesMaximum = r2.e();
        this.socket = bVar.h();
        this.writer = new okhttp3.internal.http2.i(bVar.g(), client);
        this.readerRunnable = new C0479e(this, new okhttp3.internal.http2.g(bVar.i(), client));
        this.currentPushRequests = new LinkedHashSet();
        if (bVar.getPingIntervalMillis() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(bVar.getPingIntervalMillis());
            String a6 = androidx.concurrent.futures.b.a(c6, ProtectedSandApp.s("搛"));
            j5.n(new a(a6, a6, this, nanos), nanos);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(IOException iOException) {
        okhttp3.internal.http2.a aVar = okhttp3.internal.http2.a.PROTOCOL_ERROR;
        H(aVar, aVar, iOException);
    }

    public static /* synthetic */ void s1(e eVar, boolean z5, okhttp3.internal.concurrent.d dVar, int i5, Object obj) throws IOException {
        if ((i5 & 1) != 0) {
            z5 = true;
        }
        if ((i5 & 2) != 0) {
            dVar = okhttp3.internal.concurrent.d.f30815h;
        }
        eVar.q1(z5, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048 A[Catch: all -> 0x0085, TryCatch #0 {, blocks: (B:6:0x0007, B:8:0x000e, B:9:0x0013, B:11:0x0017, B:13:0x002a, B:15:0x0032, B:19:0x0042, B:21:0x0048, B:22:0x0051, B:37:0x007f, B:38:0x0084), top: B:5:0x0007, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final okhttp3.internal.http2.h y0(int r11, java.util.List<okhttp3.internal.http2.b> r12, boolean r13) throws java.io.IOException {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            okhttp3.internal.http2.i r7 = r10.writer
            monitor-enter(r7)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L88
            int r0 = r10.nextStreamId     // Catch: java.lang.Throwable -> L85
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L13
            okhttp3.internal.http2.a r0 = okhttp3.internal.http2.a.REFUSED_STREAM     // Catch: java.lang.Throwable -> L85
            r10.i1(r0)     // Catch: java.lang.Throwable -> L85
        L13:
            boolean r0 = r10.isShutdown     // Catch: java.lang.Throwable -> L85
            if (r0 != 0) goto L7f
            int r8 = r10.nextStreamId     // Catch: java.lang.Throwable -> L85
            int r0 = r8 + 2
            r10.nextStreamId = r0     // Catch: java.lang.Throwable -> L85
            okhttp3.internal.http2.h r9 = new okhttp3.internal.http2.h     // Catch: java.lang.Throwable -> L85
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L85
            r0 = 1
            if (r13 == 0) goto L41
            long r1 = r10.writeBytesTotal     // Catch: java.lang.Throwable -> L85
            long r3 = r10.writeBytesMaximum     // Catch: java.lang.Throwable -> L85
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 >= 0) goto L41
            long r1 = r9.getWriteBytesTotal()     // Catch: java.lang.Throwable -> L85
            long r3 = r9.getWriteBytesMaximum()     // Catch: java.lang.Throwable -> L85
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 < 0) goto L3f
            goto L41
        L3f:
            r13 = 0
            goto L42
        L41:
            r13 = r0
        L42:
            boolean r1 = r9.w()     // Catch: java.lang.Throwable -> L85
            if (r1 == 0) goto L51
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.h> r1 = r10.streams     // Catch: java.lang.Throwable -> L85
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L85
            r1.put(r2, r9)     // Catch: java.lang.Throwable -> L85
        L51:
            kotlin.m2 r1 = kotlin.m2.f23662a     // Catch: java.lang.Throwable -> L85
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L88
            if (r11 != 0) goto L5c
            okhttp3.internal.http2.i r11 = r10.writer     // Catch: java.lang.Throwable -> L88
            r11.k(r6, r8, r12)     // Catch: java.lang.Throwable -> L88
            goto L66
        L5c:
            boolean r1 = r10.client     // Catch: java.lang.Throwable -> L88
            r0 = r0 ^ r1
            if (r0 == 0) goto L6f
            okhttp3.internal.http2.i r0 = r10.writer     // Catch: java.lang.Throwable -> L88
            r0.n(r11, r8, r12)     // Catch: java.lang.Throwable -> L88
        L66:
            monitor-exit(r7)
            if (r13 == 0) goto L6e
            okhttp3.internal.http2.i r11 = r10.writer
            r11.flush()
        L6e:
            return r9
        L6f:
            java.lang.String r11 = "搜"
            java.lang.String r11 = com.flashget.kidsdownloader.ProtectedSandApp.s(r11)     // Catch: java.lang.Throwable -> L88
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L88
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L88
            r12.<init>(r11)     // Catch: java.lang.Throwable -> L88
            throw r12     // Catch: java.lang.Throwable -> L88
        L7f:
            okhttp3.internal.http2.ConnectionShutdownException r11 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L85
            r11.<init>()     // Catch: java.lang.Throwable -> L85
            throw r11     // Catch: java.lang.Throwable -> L85
        L85:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L88
            throw r11     // Catch: java.lang.Throwable -> L88
        L88:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.y0(int, java.util.List, boolean):okhttp3.internal.http2.h");
    }

    @d5.d
    public final okhttp3.internal.http2.h A0(@d5.d List<okhttp3.internal.http2.b> requestHeaders, boolean out) throws IOException {
        l0.p(requestHeaders, ProtectedSandApp.s("搝"));
        return y0(0, requestHeaders, out);
    }

    public final void A1(int streamId, @d5.d okhttp3.internal.http2.a errorCode) {
        l0.p(errorCode, ProtectedSandApp.s("搞"));
        okhttp3.internal.concurrent.c cVar = this.writerQueue;
        String str = this.connectionName + '[' + streamId + ProtectedSandApp.s("搟");
        cVar.n(new k(str, true, str, true, this, streamId, errorCode), 0L);
    }

    public final synchronized int B0() {
        return this.streams.size();
    }

    public final void B1(int streamId, long unacknowledgedBytesRead) {
        okhttp3.internal.concurrent.c cVar = this.writerQueue;
        String str = this.connectionName + '[' + streamId + ProtectedSandApp.s("搠");
        cVar.n(new l(str, true, str, true, this, streamId, unacknowledgedBytesRead), 0L);
    }

    public final void E0(int streamId, @d5.d o source, int byteCount, boolean inFinished) throws IOException {
        l0.p(source, ProtectedSandApp.s("搡"));
        m mVar = new m();
        long j5 = byteCount;
        source.h1(j5);
        source.X0(mVar, j5);
        okhttp3.internal.concurrent.c cVar = this.pushQueue;
        String str = this.connectionName + '[' + streamId + ProtectedSandApp.s("搢");
        cVar.n(new f(str, true, str, true, this, streamId, mVar, byteCount, inFinished), 0L);
    }

    public final void F0(int streamId, @d5.d List<okhttp3.internal.http2.b> requestHeaders, boolean inFinished) {
        l0.p(requestHeaders, ProtectedSandApp.s("搣"));
        okhttp3.internal.concurrent.c cVar = this.pushQueue;
        String str = this.connectionName + '[' + streamId + ProtectedSandApp.s("搤");
        cVar.n(new g(str, true, str, true, this, streamId, requestHeaders, inFinished), 0L);
    }

    public final synchronized void G() throws InterruptedException {
        while (this.awaitPongsReceived < this.awaitPingsSent) {
            wait();
        }
    }

    public final void H(@d5.d okhttp3.internal.http2.a connectionCode, @d5.d okhttp3.internal.http2.a streamCode, @d5.e IOException cause) {
        int i5;
        okhttp3.internal.http2.h[] hVarArr;
        l0.p(connectionCode, ProtectedSandApp.s("搥"));
        l0.p(streamCode, ProtectedSandApp.s("搦"));
        if (okhttp3.internal.d.f30936h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("搧"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("搨"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("搩"));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        try {
            i1(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.streams.isEmpty()) {
                Object[] array = this.streams.values().toArray(new okhttp3.internal.http2.h[0]);
                if (array == null) {
                    throw new NullPointerException(ProtectedSandApp.s("搪"));
                }
                hVarArr = (okhttp3.internal.http2.h[]) array;
                this.streams.clear();
            } else {
                hVarArr = null;
            }
            m2 m2Var = m2.f23662a;
        }
        if (hVarArr != null) {
            for (okhttp3.internal.http2.h hVar : hVarArr) {
                try {
                    hVar.d(streamCode, cause);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.writer.close();
        } catch (IOException unused3) {
        }
        try {
            this.socket.close();
        } catch (IOException unused4) {
        }
        this.writerQueue.u();
        this.pushQueue.u();
        this.settingsListenerQueue.u();
    }

    public final void J0(int streamId, @d5.d List<okhttp3.internal.http2.b> requestHeaders) {
        l0.p(requestHeaders, ProtectedSandApp.s("搫"));
        synchronized (this) {
            if (this.currentPushRequests.contains(Integer.valueOf(streamId))) {
                A1(streamId, okhttp3.internal.http2.a.PROTOCOL_ERROR);
                return;
            }
            this.currentPushRequests.add(Integer.valueOf(streamId));
            okhttp3.internal.concurrent.c cVar = this.pushQueue;
            String str = this.connectionName + '[' + streamId + ProtectedSandApp.s("搬");
            cVar.n(new h(str, true, str, true, this, streamId, requestHeaders), 0L);
        }
    }

    public final void M0(int streamId, @d5.d okhttp3.internal.http2.a errorCode) {
        l0.p(errorCode, ProtectedSandApp.s("搭"));
        okhttp3.internal.concurrent.c cVar = this.pushQueue;
        String str = this.connectionName + '[' + streamId + ProtectedSandApp.s("搮");
        cVar.n(new i(str, true, str, true, this, streamId, errorCode), 0L);
    }

    @d5.d
    public final okhttp3.internal.http2.h N0(int associatedStreamId, @d5.d List<okhttp3.internal.http2.b> requestHeaders, boolean out) throws IOException {
        l0.p(requestHeaders, ProtectedSandApp.s("搯"));
        if (!this.client) {
            return y0(associatedStreamId, requestHeaders, out);
        }
        throw new IllegalStateException(ProtectedSandApp.s("搰").toString());
    }

    public final boolean O0(int streamId) {
        return streamId != 0 && (streamId & 1) == 0;
    }

    /* renamed from: P, reason: from getter */
    public final boolean getClient() {
        return this.client;
    }

    @d5.d
    /* renamed from: R, reason: from getter */
    public final String getConnectionName() {
        return this.connectionName;
    }

    @d5.e
    public final synchronized okhttp3.internal.http2.h R0(int streamId) {
        okhttp3.internal.http2.h remove;
        remove = this.streams.remove(Integer.valueOf(streamId));
        notifyAll();
        return remove;
    }

    public final void T0() {
        synchronized (this) {
            long j5 = this.degradedPongsReceived;
            long j6 = this.degradedPingsSent;
            if (j5 < j6) {
                return;
            }
            this.degradedPingsSent = j6 + 1;
            this.degradedPongDeadlineNs = System.nanoTime() + W;
            m2 m2Var = m2.f23662a;
            okhttp3.internal.concurrent.c cVar = this.writerQueue;
            String a6 = androidx.concurrent.futures.a.a(new StringBuilder(), this.connectionName, ProtectedSandApp.s("搱"));
            cVar.n(new j(a6, true, a6, true, this), 0L);
        }
    }

    /* renamed from: U, reason: from getter */
    public final int getLastGoodStreamId() {
        return this.lastGoodStreamId;
    }

    public final void U0(int i5) {
        this.lastGoodStreamId = i5;
    }

    @d5.d
    /* renamed from: X, reason: from getter */
    public final d getListener() {
        return this.listener;
    }

    /* renamed from: Z, reason: from getter */
    public final int getNextStreamId() {
        return this.nextStreamId;
    }

    @d5.d
    /* renamed from: b0, reason: from getter */
    public final okhttp3.internal.http2.l getOkHttpSettings() {
        return this.okHttpSettings;
    }

    public final void b1(int i5) {
        this.nextStreamId = i5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        H(okhttp3.internal.http2.a.NO_ERROR, okhttp3.internal.http2.a.CANCEL, null);
    }

    @d5.d
    /* renamed from: d0, reason: from getter */
    public final okhttp3.internal.http2.l getPeerSettings() {
        return this.peerSettings;
    }

    /* renamed from: e0, reason: from getter */
    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    /* renamed from: f0, reason: from getter */
    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final void f1(@d5.d okhttp3.internal.http2.l lVar) {
        l0.p(lVar, ProtectedSandApp.s("搲"));
        this.peerSettings = lVar;
    }

    public final void flush() throws IOException {
        this.writer.flush();
    }

    @d5.d
    /* renamed from: g0, reason: from getter */
    public final C0479e getReaderRunnable() {
        return this.readerRunnable;
    }

    public final void g1(@d5.d okhttp3.internal.http2.l lVar) throws IOException {
        l0.p(lVar, ProtectedSandApp.s("搳"));
        synchronized (this.writer) {
            synchronized (this) {
                if (this.isShutdown) {
                    throw new ConnectionShutdownException();
                }
                this.okHttpSettings.j(lVar);
                m2 m2Var = m2.f23662a;
            }
            this.writer.r(lVar);
        }
    }

    @d5.d
    /* renamed from: i0, reason: from getter */
    public final Socket getSocket() {
        return this.socket;
    }

    public final void i1(@d5.d okhttp3.internal.http2.a aVar) throws IOException {
        l0.p(aVar, ProtectedSandApp.s("搴"));
        synchronized (this.writer) {
            synchronized (this) {
                if (this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                int i5 = this.lastGoodStreamId;
                m2 m2Var = m2.f23662a;
                this.writer.j(i5, aVar, okhttp3.internal.d.f30929a);
            }
        }
    }

    @d5.e
    public final synchronized okhttp3.internal.http2.h k0(int id) {
        return this.streams.get(Integer.valueOf(id));
    }

    @d5.d
    public final Map<Integer, okhttp3.internal.http2.h> l0() {
        return this.streams;
    }

    /* renamed from: m0, reason: from getter */
    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    @p3.j
    public final void m1() throws IOException {
        s1(this, false, null, 3, null);
    }

    /* renamed from: n0, reason: from getter */
    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    @p3.j
    public final void n1(boolean z5) throws IOException {
        s1(this, z5, null, 2, null);
    }

    @d5.d
    /* renamed from: o0, reason: from getter */
    public final okhttp3.internal.http2.i getWriter() {
        return this.writer;
    }

    public final synchronized boolean p0(long nowNs) {
        if (this.isShutdown) {
            return false;
        }
        if (this.degradedPongsReceived < this.degradedPingsSent) {
            if (nowNs >= this.degradedPongDeadlineNs) {
                return false;
            }
        }
        return true;
    }

    @p3.j
    public final void q1(boolean z5, @d5.d okhttp3.internal.concurrent.d dVar) throws IOException {
        l0.p(dVar, ProtectedSandApp.s("搵"));
        if (z5) {
            this.writer.b();
            this.writer.r(this.okHttpSettings);
            if (this.okHttpSettings.e() != 65535) {
                this.writer.t(0, r7 - 65535);
            }
        }
        okhttp3.internal.concurrent.c j5 = dVar.j();
        String str = this.connectionName;
        j5.n(new c.b(this.readerRunnable, str, true, str, true), 0L);
    }

    public final synchronized void t1(long read) {
        long j5 = this.readBytesTotal + read;
        this.readBytesTotal = j5;
        long j6 = j5 - this.readBytesAcknowledged;
        if (j6 >= this.okHttpSettings.e() / 2) {
            B1(0, j6);
            this.readBytesAcknowledged += j6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.writer.l());
        r6 = r2;
        r8.writeBytesTotal += r6;
        r4 = kotlin.m2.f23662a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u1(int r9, boolean r10, @d5.e okio.m r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            okhttp3.internal.http2.i r12 = r8.writer
            r12.c(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L70
            monitor-enter(r8)
        L12:
            long r4 = r8.writeBytesTotal     // Catch: java.lang.Throwable -> L5f java.lang.InterruptedException -> L61
            long r6 = r8.writeBytesMaximum     // Catch: java.lang.Throwable -> L5f java.lang.InterruptedException -> L61
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L36
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.h> r2 = r8.streams     // Catch: java.lang.Throwable -> L5f java.lang.InterruptedException -> L61
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L5f java.lang.InterruptedException -> L61
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L5f java.lang.InterruptedException -> L61
            if (r2 == 0) goto L2a
            r8.wait()     // Catch: java.lang.Throwable -> L5f java.lang.InterruptedException -> L61
            goto L12
        L2a:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L5f java.lang.InterruptedException -> L61
            java.lang.String r10 = "搶"
            java.lang.String r10 = com.flashget.kidsdownloader.ProtectedSandApp.s(r10)     // Catch: java.lang.Throwable -> L5f java.lang.InterruptedException -> L61
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L5f java.lang.InterruptedException -> L61
            throw r9     // Catch: java.lang.Throwable -> L5f java.lang.InterruptedException -> L61
        L36:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L5f
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L5f
            okhttp3.internal.http2.i r4 = r8.writer     // Catch: java.lang.Throwable -> L5f
            int r4 = r4.getMaxFrameSize()     // Catch: java.lang.Throwable -> L5f
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L5f
            long r4 = r8.writeBytesTotal     // Catch: java.lang.Throwable -> L5f
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L5f
            long r4 = r4 + r6
            r8.writeBytesTotal = r4     // Catch: java.lang.Throwable -> L5f
            kotlin.m2 r4 = kotlin.m2.f23662a     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r8)
            long r12 = r12 - r6
            okhttp3.internal.http2.i r4 = r8.writer
            if (r10 == 0) goto L5a
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L5a
            r5 = 1
            goto L5b
        L5a:
            r5 = r3
        L5b:
            r4.c(r5, r9, r11, r2)
            goto Ld
        L5f:
            r9 = move-exception
            goto L6e
        L61:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L5f
            r9.interrupt()     // Catch: java.lang.Throwable -> L5f
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L5f
            r9.<init>()     // Catch: java.lang.Throwable -> L5f
            throw r9     // Catch: java.lang.Throwable -> L5f
        L6e:
            monitor-exit(r8)
            throw r9
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.u1(int, boolean, okio.m, long):void");
    }

    public final void v1(int streamId, boolean outFinished, @d5.d List<okhttp3.internal.http2.b> alternating) throws IOException {
        l0.p(alternating, ProtectedSandApp.s("搷"));
        this.writer.k(outFinished, streamId, alternating);
    }

    public final void w1() throws InterruptedException {
        synchronized (this) {
            this.awaitPingsSent++;
        }
        x1(false, 3, 1330343787);
    }

    public final void x1(boolean z5, int i5, int i6) {
        try {
            this.writer.m(z5, i5, i6);
        } catch (IOException e6) {
            O(e6);
        }
    }

    public final void y1() throws InterruptedException {
        w1();
        G();
    }

    public final void z1(int streamId, @d5.d okhttp3.internal.http2.a statusCode) throws IOException {
        l0.p(statusCode, ProtectedSandApp.s("搸"));
        this.writer.o(streamId, statusCode);
    }
}
