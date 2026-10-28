package okhttp3.internal.http2;

import com.flashget.parentalcontrol.ProtectedSandApp;
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
import kotlin.k2;
import okhttp3.internal.concurrent.c;
import okhttp3.internal.http2.g;
import okio.a0;
import okio.m;
import okio.n;
import okio.o;
import okio.p;

/* compiled from: Http2Connection.kt */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0003\u0018\u0000 ©\u00012\u00020\u0001:\u0004`fl\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001a\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010 \u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b \u0010\u000fJ#\u0010!\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b!\u0010\"J-\u0010%\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u000b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b%\u0010&J/\u0010*\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010)\u001a\u00020\u001c¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,H\u0000¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u00100\u001a\u00020,H\u0000¢\u0006\u0004\b1\u0010/J\u001f\u00103\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u001cH\u0000¢\u0006\u0004\b3\u00104J%\u00108\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u0006¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\u0012¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0012¢\u0006\u0004\b<\u0010;J\r\u0010=\u001a\u00020\u0012¢\u0006\u0004\b=\u0010;J\r\u0010>\u001a\u00020\u0012¢\u0006\u0004\b>\u0010;J\u0015\u0010?\u001a\u00020\u00122\u0006\u00100\u001a\u00020,¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u0012H\u0016¢\u0006\u0004\bA\u0010;J)\u0010E\u001a\u00020\u00122\u0006\u0010B\u001a\u00020,2\u0006\u0010C\u001a\u00020,2\b\u0010D\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\bE\u0010FJ#\u0010J\u001a\u00020\u00122\b\b\u0002\u0010G\u001a\u00020\u000b2\b\b\u0002\u0010I\u001a\u00020HH\u0007¢\u0006\u0004\bJ\u0010KJ\u0015\u0010N\u001a\u00020\u00122\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bN\u0010OJ\u0015\u0010Q\u001a\u00020\u000b2\u0006\u0010P\u001a\u00020\u001c¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u0012H\u0000¢\u0006\u0004\bS\u0010;J\u0017\u0010T\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0006H\u0000¢\u0006\u0004\bT\u0010UJ%\u0010V\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\bV\u0010WJ-\u0010Y\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010X\u001a\u00020\u000bH\u0000¢\u0006\u0004\bY\u0010ZJ/\u0010]\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\\\u001a\u00020[2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010X\u001a\u00020\u000bH\u0000¢\u0006\u0004\b]\u0010^J\u001f\u0010_\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,H\u0000¢\u0006\u0004\b_\u0010/R\u001a\u0010d\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u001a\u0010j\u001a\u00020e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR&\u0010p\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0k8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR\u001a\u0010u\u001a\u00020q8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010r\u001a\u0004\bs\u0010tR\"\u0010{\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010\u0016\"\u0004\by\u0010zR\"\u0010\u007f\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b|\u0010w\u001a\u0004\b}\u0010\u0016\"\u0004\b~\u0010zR\u0018\u0010\u0081\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010aR\u0016\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0086\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0086\u0001R\u0018\u0010\u008f\u0001\u001a\u00030\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0019\u0010\u0092\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0019\u0010\u0094\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0091\u0001R\u0019\u0010\u0096\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0091\u0001R\u0019\u0010\u0098\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0091\u0001R\u0019\u0010\u009a\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u0091\u0001R\u0019\u0010\u009c\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u0091\u0001R\u0019\u0010\u009e\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u0091\u0001R\u001c\u0010£\u0001\u001a\u00020L8\u0006¢\u0006\u0010\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R'\u0010¦\u0001\u001a\u00020L8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b¤\u0001\u0010 \u0001\u001a\u0005\bw\u0010¢\u0001\"\u0005\b¥\u0001\u0010OR*\u0010«\u0001\u001a\u00020\u001c2\u0007\u0010§\u0001\u001a\u00020\u001c8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b¨\u0001\u0010\u0091\u0001\u001a\u0006\b©\u0001\u0010ª\u0001R*\u0010\u00ad\u0001\u001a\u00020\u001c2\u0007\u0010§\u0001\u001a\u00020\u001c8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b¬\u0001\u0010\u0091\u0001\u001a\u0006\b\u0091\u0001\u0010ª\u0001R)\u0010¯\u0001\u001a\u00020\u001c2\u0007\u0010§\u0001\u001a\u00020\u001c8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b=\u0010\u0091\u0001\u001a\u0006\b®\u0001\u0010ª\u0001R)\u0010±\u0001\u001a\u00020\u001c2\u0007\u0010§\u0001\u001a\u00020\u001c8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\bE\u0010\u0091\u0001\u001a\u0006\b°\u0001\u0010ª\u0001R \u0010·\u0001\u001a\u00030²\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001R\u001c\u0010¼\u0001\u001a\u00030¸\u00018\u0006¢\u0006\u000f\n\u0005\b\u0013\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001R \u0010Á\u0001\u001a\u00070½\u0001R\u00020\u00008\u0006¢\u0006\u000f\n\u0005\bb\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001R\u001d\u0010Ä\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060Â\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bs\u0010Ã\u0001¨\u0006Å\u0001"}, d2 = {"Lokhttp3/internal/http2/e;", "Ljava/io/Closeable;", "Lokhttp3/internal/http2/e$b;", "builder", "<init>", "(Lokhttp3/internal/http2/e$b;)V", "", "associatedStreamId", "", "Lokhttp3/internal/http2/b;", "requestHeaders", "", "out", "Lokhttp3/internal/http2/h;", "c0", "(ILjava/util/List;Z)Lokhttp3/internal/http2/h;", "Ljava/io/IOException;", "e", "Lkotlin/k2;", "B", "(Ljava/io/IOException;)V", "n0", "()I", "id", "N", "(I)Lokhttp3/internal/http2/h;", "streamId", "C0", "", "read", "g1", "(J)V", "A0", "j0", "(Ljava/util/List;Z)Lokhttp3/internal/http2/h;", "outFinished", "alternating", "k1", "(IZLjava/util/List;)V", "Lokio/m;", "buffer", "byteCount", "j1", "(IZLokio/m;J)V", "Lokhttp3/internal/http2/a;", "errorCode", "B1", "(ILokhttp3/internal/http2/a;)V", "statusCode", "y1", "unacknowledgedBytesRead", "D1", "(IJ)V", "reply", "payload1", "payload2", "n1", "(ZII)V", "t1", "()V", "l1", "y", "flush", "S0", "(Lokhttp3/internal/http2/a;)V", "close", "connectionCode", "streamCode", "cause", "z", "(Lokhttp3/internal/http2/a;Lokhttp3/internal/http2/a;Ljava/io/IOException;)V", "sendConnectionPreface", "Lokhttp3/internal/concurrent/d;", "taskRunner", "d1", "(ZLokhttp3/internal/concurrent/d;)V", "Lokhttp3/internal/http2/l;", "settings", "O0", "(Lokhttp3/internal/http2/l;)V", "nowNs", "Y", "(J)Z", "H0", "B0", "(I)Z", "r0", "(ILjava/util/List;)V", "inFinished", "q0", "(ILjava/util/List;Z)V", "Lokio/o;", "source", "o0", "(ILokio/o;IZ)V", "u0", "b", "Z", "C", "()Z", "client", "Lokhttp3/internal/http2/e$d;", "c", "Lokhttp3/internal/http2/e$d;", "F", "()Lokhttp3/internal/http2/e$d;", "listener", "", "d", "Ljava/util/Map;", "O", "()Ljava/util/Map;", "streams", "", "Ljava/lang/String;", "D", "()Ljava/lang/String;", "connectionName", "f", "I", "E", "K0", "(I)V", "lastGoodStreamId", "g", "G", "M0", "nextStreamId", "h", "isShutdown", "i", "Lokhttp3/internal/concurrent/d;", "Lokhttp3/internal/concurrent/c;", "j", "Lokhttp3/internal/concurrent/c;", "writerQueue", "k", "pushQueue", "l", "settingsListenerQueue", "Lokhttp3/internal/http2/k;", "m", "Lokhttp3/internal/http2/k;", "pushObserver", "n", "J", "intervalPingsSent", "o", "intervalPongsReceived", "p", "degradedPingsSent", "q", "degradedPongsReceived", "r", "awaitPingsSent", "s", "awaitPongsReceived", "t", "degradedPongDeadlineNs", "u", "Lokhttp3/internal/http2/l;", "H", "()Lokhttp3/internal/http2/l;", "okHttpSettings", "v", "N0", "peerSettings", "<set-?>", "w", "K", "()J", "readBytesTotal", "x", "readBytesAcknowledged", "S", "writeBytesTotal", "Q", "writeBytesMaximum", "Ljava/net/Socket;", "A", "Ljava/net/Socket;", "M", "()Ljava/net/Socket;", "socket", "Lokhttp3/internal/http2/i;", "Lokhttp3/internal/http2/i;", "X", "()Lokhttp3/internal/http2/i;", "writer", "Lokhttp3/internal/http2/e$e;", "Lokhttp3/internal/http2/e$e;", "L", "()Lokhttp3/internal/http2/e$e;", "readerRunnable", "", "Ljava/util/Set;", "currentPushRequests", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class e implements Closeable {
    public static final int E = 16777216;

    @fg.l
    private static final okhttp3.internal.http2.l F;
    public static final int G = 1;
    public static final int H = 2;
    public static final int I = 3;
    public static final int J = 1000000000;

    /* renamed from: K, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* renamed from: A, reason: from kotlin metadata */
    @fg.l
    private final Socket socket;

    /* renamed from: B, reason: from kotlin metadata */
    @fg.l
    private final okhttp3.internal.http2.i writer;

    /* renamed from: C, reason: from kotlin metadata */
    @fg.l
    private final C1318e readerRunnable;

    /* renamed from: D, reason: from kotlin metadata */
    private final Set<Integer> currentPushRequests;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean client;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final d listener;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<Integer, okhttp3.internal.http2.h> streams;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String connectionName;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int lastGoodStreamId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int nextStreamId;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isShutdown;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final okhttp3.internal.concurrent.d taskRunner;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final okhttp3.internal.concurrent.c writerQueue;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final okhttp3.internal.concurrent.c pushQueue;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final okhttp3.internal.concurrent.c settingsListenerQueue;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final okhttp3.internal.http2.k pushObserver;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private long intervalPingsSent;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private long intervalPongsReceived;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private long degradedPingsSent;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private long degradedPongsReceived;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private long awaitPingsSent;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private long awaitPongsReceived;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private long degradedPongDeadlineNs;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final okhttp3.internal.http2.l okHttpSettings;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private okhttp3.internal.http2.l peerSettings;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private long readBytesTotal;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private long readBytesAcknowledged;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private long writeBytesTotal;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private long writeBytesMaximum;

    /* compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"okhttp3/internal/concurrent/c$c", "Lokhttp3/internal/concurrent/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a extends okhttp3.internal.concurrent.a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f84635e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ e f84636f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f84637g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, e eVar, long j4) {
            super(str2, false, 2, null);
            this.f84635e = str;
            this.f84636f = eVar;
            this.f84637g = j4;
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            boolean z4;
            synchronized (this.f84636f) {
                if (this.f84636f.intervalPongsReceived < this.f84636f.intervalPingsSent) {
                    z4 = true;
                } else {
                    this.f84636f.intervalPingsSent++;
                    z4 = false;
                }
            }
            if (z4) {
                this.f84636f.B(null);
                return -1L;
            }
            this.f84636f.n1(false, 1, 0);
            return this.f84637g;
        }
    }

    /* compiled from: Http2Connection.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b/\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\u0010\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 R\"\u0010\t\u001a\u00020\b8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010,\u001a\u00020\n8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\r\u001a\u00020\f8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b(\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010\u000f\u001a\u00020\u000e8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010\u0013\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b2\u0010:\"\u0004\b;\u0010<R\"\u0010\u0017\u001a\u00020\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b=\u0010?\"\u0004\b@\u0010AR\"\u0010\u001b\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u0010B\u001a\u0004\b8\u0010C\"\u0004\bD\u0010ER\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010F\u001a\u0004\b&\u0010G\"\u0004\bH\u0010IR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010J\u001a\u0004\bK\u0010L¨\u0006M"}, d2 = {"Lokhttp3/internal/http2/e$b;", "", "", "client", "Lokhttp3/internal/concurrent/d;", "taskRunner", "<init>", "(ZLokhttp3/internal/concurrent/d;)V", "Ljava/net/Socket;", "socket", "", "peerName", "Lokio/o;", "source", "Lokio/n;", "sink", "y", "(Ljava/net/Socket;Ljava/lang/String;Lokio/o;Lokio/n;)Lokhttp3/internal/http2/e$b;", "Lokhttp3/internal/http2/e$d;", "listener", "k", "(Lokhttp3/internal/http2/e$d;)Lokhttp3/internal/http2/e$b;", "Lokhttp3/internal/http2/k;", "pushObserver", "m", "(Lokhttp3/internal/http2/k;)Lokhttp3/internal/http2/e$b;", "", "pingIntervalMillis", "l", "(I)Lokhttp3/internal/http2/e$b;", "Lokhttp3/internal/http2/e;", "a", "()Lokhttp3/internal/http2/e;", "Ljava/net/Socket;", "h", "()Ljava/net/Socket;", "t", "(Ljava/net/Socket;)V", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "o", "(Ljava/lang/String;)V", "connectionName", "Lokio/o;", "i", "()Lokio/o;", "u", "(Lokio/o;)V", "d", "Lokio/n;", "g", "()Lokio/n;", "s", "(Lokio/n;)V", "e", "Lokhttp3/internal/http2/e$d;", "()Lokhttp3/internal/http2/e$d;", "p", "(Lokhttp3/internal/http2/e$d;)V", "f", "Lokhttp3/internal/http2/k;", "()Lokhttp3/internal/http2/k;", "r", "(Lokhttp3/internal/http2/k;)V", "I", "()I", "q", "(I)V", "Z", "()Z", "n", "(Z)V", "Lokhttp3/internal/concurrent/d;", "j", "()Lokhttp3/internal/concurrent/d;", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        public Socket socket;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        public String connectionName;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        public o source;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        public n sink;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private d listener;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private okhttp3.internal.http2.k pushObserver;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private int pingIntervalMillis;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean client;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final okhttp3.internal.concurrent.d taskRunner;

        public b(boolean z4, @fg.l okhttp3.internal.concurrent.d dVar) {
            l0.p(dVar, ProtectedSandApp.s("\u1cc8"));
            this.client = z4;
            this.taskRunner = dVar;
            this.listener = d.f84647a;
            this.pushObserver = okhttp3.internal.http2.k.f84786a;
        }

        public static /* synthetic */ b z(b bVar, Socket socket, String str, o oVar, n nVar, int i4, Object obj) throws IOException {
            if ((i4 & 2) != 0) {
                str = okhttp3.internal.d.O(socket);
            }
            if ((i4 & 4) != 0) {
                oVar = a0.d(a0.n(socket));
            }
            if ((i4 & 8) != 0) {
                nVar = a0.c(a0.i(socket));
            }
            return bVar.y(socket, str, oVar, nVar);
        }

        @fg.l
        public final e a() {
            return new e(this);
        }

        /* renamed from: b, reason: from getter */
        public final boolean getClient() {
            return this.client;
        }

        @fg.l
        public final String c() {
            String str = this.connectionName;
            if (str == null) {
                l0.S(ProtectedSandApp.s("\u1cc9"));
            }
            return str;
        }

        @fg.l
        /* renamed from: d, reason: from getter */
        public final d getListener() {
            return this.listener;
        }

        /* renamed from: e, reason: from getter */
        public final int getPingIntervalMillis() {
            return this.pingIntervalMillis;
        }

        @fg.l
        /* renamed from: f, reason: from getter */
        public final okhttp3.internal.http2.k getPushObserver() {
            return this.pushObserver;
        }

        @fg.l
        public final n g() {
            n nVar = this.sink;
            if (nVar == null) {
                l0.S(ProtectedSandApp.s("\u1cca"));
            }
            return nVar;
        }

        @fg.l
        public final Socket h() {
            Socket socket = this.socket;
            if (socket == null) {
                l0.S(ProtectedSandApp.s("\u1ccb"));
            }
            return socket;
        }

        @fg.l
        public final o i() {
            o oVar = this.source;
            if (oVar == null) {
                l0.S(ProtectedSandApp.s("\u1ccc"));
            }
            return oVar;
        }

        @fg.l
        /* renamed from: j, reason: from getter */
        public final okhttp3.internal.concurrent.d getTaskRunner() {
            return this.taskRunner;
        }

        @fg.l
        public final b k(@fg.l d listener) {
            l0.p(listener, ProtectedSandApp.s("\u1ccd"));
            this.listener = listener;
            return this;
        }

        @fg.l
        public final b l(int pingIntervalMillis) {
            this.pingIntervalMillis = pingIntervalMillis;
            return this;
        }

        @fg.l
        public final b m(@fg.l okhttp3.internal.http2.k pushObserver) {
            l0.p(pushObserver, ProtectedSandApp.s("\u1cce"));
            this.pushObserver = pushObserver;
            return this;
        }

        public final void n(boolean z4) {
            this.client = z4;
        }

        public final void o(@fg.l String str) {
            l0.p(str, ProtectedSandApp.s("\u1ccf"));
            this.connectionName = str;
        }

        public final void p(@fg.l d dVar) {
            l0.p(dVar, ProtectedSandApp.s("\u1ccf"));
            this.listener = dVar;
        }

        public final void q(int i4) {
            this.pingIntervalMillis = i4;
        }

        public final void r(@fg.l okhttp3.internal.http2.k kVar) {
            l0.p(kVar, ProtectedSandApp.s("\u1ccf"));
            this.pushObserver = kVar;
        }

        public final void s(@fg.l n nVar) {
            l0.p(nVar, ProtectedSandApp.s("\u1ccf"));
            this.sink = nVar;
        }

        public final void t(@fg.l Socket socket) {
            l0.p(socket, ProtectedSandApp.s("\u1ccf"));
            this.socket = socket;
        }

        public final void u(@fg.l o oVar) {
            l0.p(oVar, ProtectedSandApp.s("\u1ccf"));
            this.source = oVar;
        }

        @fg.l
        @kd.j
        public final b v(@fg.l Socket socket) throws IOException {
            return z(this, socket, null, null, null, 14, null);
        }

        @fg.l
        @kd.j
        public final b w(@fg.l Socket socket, @fg.l String str) throws IOException {
            return z(this, socket, str, null, null, 12, null);
        }

        @fg.l
        @kd.j
        public final b x(@fg.l Socket socket, @fg.l String str, @fg.l o oVar) throws IOException {
            return z(this, socket, str, oVar, null, 8, null);
        }

        @fg.l
        @kd.j
        public final b y(@fg.l Socket socket, @fg.l String peerName, @fg.l o source, @fg.l n sink) throws IOException {
            String a5;
            l0.p(socket, ProtectedSandApp.s("\u1ccb"));
            l0.p(peerName, ProtectedSandApp.s("᳐"));
            l0.p(source, ProtectedSandApp.s("\u1ccc"));
            l0.p(sink, ProtectedSandApp.s("\u1cca"));
            this.socket = socket;
            if (this.client) {
                a5 = okhttp3.internal.d.f84464i + ' ' + peerName;
            } else {
                a5 = androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("᳑"), peerName);
            }
            this.connectionName = a5;
            this.source = source;
            this.sink = sink;
            return this;
        }
    }

    /* compiled from: Http2Connection.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/http2/e$c;", "", "<init>", "()V", "Lokhttp3/internal/http2/l;", "DEFAULT_SETTINGS", "Lokhttp3/internal/http2/l;", "a", "()Lokhttp3/internal/http2/l;", "", "AWAIT_PING", "I", "DEGRADED_PING", "DEGRADED_PONG_TIMEOUT_NS", "INTERVAL_PING", "OKHTTP_CLIENT_WINDOW_SIZE", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.http2.e$c, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final okhttp3.internal.http2.l a() {
            return e.F;
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: Http2Connection.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/http2/e$d;", "", "<init>", "()V", "Lokhttp3/internal/http2/h;", "stream", "Lkotlin/k2;", "f", "(Lokhttp3/internal/http2/h;)V", "Lokhttp3/internal/http2/e;", "connection", "Lokhttp3/internal/http2/l;", "settings", "e", "(Lokhttp3/internal/http2/e;Lokhttp3/internal/http2/l;)V", "b", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        @kd.f
        public static final d f84647a = new a();

        /* compiled from: Http2Connection.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"okhttp3/internal/http2/e$d$a", "Lokhttp3/internal/http2/e$d;", "Lokhttp3/internal/http2/h;", "stream", "Lkotlin/k2;", "f", "(Lokhttp3/internal/http2/h;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
        public static final class a extends d {
            a() {
            }

            @Override // okhttp3.internal.http2.e.d
            public void f(@fg.l okhttp3.internal.http2.h stream) throws IOException {
                l0.p(stream, ProtectedSandApp.s("᳔"));
                stream.d(okhttp3.internal.http2.a.REFUSED_STREAM, null);
            }
        }

        public void e(@fg.l e connection, @fg.l okhttp3.internal.http2.l settings) {
            l0.p(connection, ProtectedSandApp.s("᳒"));
            l0.p(settings, ProtectedSandApp.s("᳓"));
        }

        public abstract void f(@fg.l okhttp3.internal.http2.h stream) throws IOException;
    }

    /* compiled from: Http2Connection.kt */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010\tJ'\u0010'\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\fH\u0016¢\u0006\u0004\b'\u0010(J'\u0010,\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J/\u00105\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020\f2\u0006\u00104\u001a\u00020\nH\u0016¢\u0006\u0004\b5\u00106J-\u00109\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u00107\u001a\u00020\f2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b9\u0010:J?\u0010A\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020*2\u0006\u0010>\u001a\u00020;2\u0006\u0010?\u001a\u00020\f2\u0006\u0010@\u001a\u00020.H\u0016¢\u0006\u0004\bA\u0010BR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010C\u001a\u0004\bD\u0010E¨\u0006F"}, d2 = {"Lokhttp3/internal/http2/e$e;", "Lokhttp3/internal/http2/g$c;", "Lkotlin/Function0;", "Lkotlin/k2;", "Lokhttp3/internal/http2/g;", "reader", "<init>", "(Lokhttp3/internal/http2/e;Lokhttp3/internal/http2/g;)V", "s", "()V", "", "inFinished", "", "streamId", "Lokio/o;", "source", "length", "j", "(ZILokio/o;I)V", "associatedStreamId", "", "Lokhttp3/internal/http2/b;", "headerBlock", "b", "(ZIILjava/util/List;)V", "Lokhttp3/internal/http2/a;", "errorCode", "n", "(ILokhttp3/internal/http2/a;)V", "clearPrevious", "Lokhttp3/internal/http2/l;", "settings", "a", "(ZLokhttp3/internal/http2/l;)V", "q", "h", "ack", "payload1", "payload2", "l", "(ZII)V", "lastGoodStreamId", "Lokio/p;", "debugData", "p", "(ILokhttp3/internal/http2/a;Lokio/p;)V", "", "windowSizeIncrement", "c", "(IJ)V", "streamDependency", "weight", "exclusive", "m", "(IIIZ)V", "promisedStreamId", "requestHeaders", "f", "(IILjava/util/List;)V", "", "origin", "protocol", "host", "port", "maxAge", "d", "(ILjava/lang/String;Lokio/p;Ljava/lang/String;IJ)V", "Lokhttp3/internal/http2/g;", "r", "()Lokhttp3/internal/http2/g;", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.http2.e$e, reason: collision with other inner class name */
    public final class C1318e implements g.c, ld.a<k2> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final okhttp3.internal.http2.g reader;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f84650c;

        /* compiled from: TaskQueue.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006¸\u0006\u0005"}, d2 = {"okhttp3/internal/concurrent/TaskQueue$execute$1", "Lokhttp3/internal/concurrent/a;", "", "f", "()J", "okhttp3/internal/http2/Http2Connection$ReaderRunnable$$special$$inlined$synchronized$lambda$1", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: okhttp3.internal.http2.e$e$a */
        public static final class a extends okhttp3.internal.concurrent.a {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f84651e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f84652f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C1318e f84653g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ k1.h f84654h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ boolean f84655i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ okhttp3.internal.http2.l f84656j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ k1.g f84657k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ k1.h f84658l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z4, String str2, boolean z5, C1318e c1318e, k1.h hVar, boolean z6, okhttp3.internal.http2.l lVar, k1.g gVar, k1.h hVar2) {
                super(str2, z5);
                this.f84651e = str;
                this.f84652f = z4;
                this.f84653g = c1318e;
                this.f84654h = hVar;
                this.f84655i = z6;
                this.f84656j = lVar;
                this.f84657k = gVar;
                this.f84658l = hVar2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // okhttp3.internal.concurrent.a
            public long f() {
                this.f84653g.f84650c.getListener().e(this.f84653g.f84650c, (okhttp3.internal.http2.l) this.f84654h.f75329b);
                return -1L;
            }
        }

        /* compiled from: TaskQueue.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006¸\u0006\u0005"}, d2 = {"okhttp3/internal/concurrent/TaskQueue$execute$1", "Lokhttp3/internal/concurrent/a;", "", "f", "()J", "okhttp3/internal/http2/Http2Connection$ReaderRunnable$$special$$inlined$execute$1", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: okhttp3.internal.http2.e$e$b */
        public static final class b extends okhttp3.internal.concurrent.a {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f84659e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f84660f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ okhttp3.internal.http2.h f84661g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ C1318e f84662h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ okhttp3.internal.http2.h f84663i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ int f84664j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ List f84665k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ boolean f84666l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z4, String str2, boolean z5, okhttp3.internal.http2.h hVar, C1318e c1318e, okhttp3.internal.http2.h hVar2, int i4, List list, boolean z6) {
                super(str2, z5);
                this.f84659e = str;
                this.f84660f = z4;
                this.f84661g = hVar;
                this.f84662h = c1318e;
                this.f84663i = hVar2;
                this.f84664j = i4;
                this.f84665k = list;
                this.f84666l = z6;
            }

            @Override // okhttp3.internal.concurrent.a
            public long f() {
                try {
                    this.f84662h.f84650c.getListener().f(this.f84661g);
                    return -1L;
                } catch (IOException e4) {
                    okhttp3.internal.platform.j.INSTANCE.getClass();
                    okhttp3.internal.platform.j.f84863a.m(ProtectedSandApp.s("᳕") + this.f84662h.f84650c.getConnectionName(), 4, e4);
                    try {
                        this.f84661g.d(okhttp3.internal.http2.a.PROTOCOL_ERROR, e4);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        /* compiled from: TaskQueue.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"okhttp3/internal/concurrent/c$b", "Lokhttp3/internal/concurrent/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: okhttp3.internal.http2.e$e$c */
        public static final class c extends okhttp3.internal.concurrent.a {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f84667e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f84668f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C1318e f84669g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f84670h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f84671i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z4, String str2, boolean z5, C1318e c1318e, int i4, int i5) {
                super(str2, z5);
                this.f84667e = str;
                this.f84668f = z4;
                this.f84669g = c1318e;
                this.f84670h = i4;
                this.f84671i = i5;
            }

            @Override // okhttp3.internal.concurrent.a
            public long f() {
                this.f84669g.f84650c.n1(true, this.f84670h, this.f84671i);
                return -1L;
            }
        }

        /* compiled from: TaskQueue.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"okhttp3/internal/concurrent/c$b", "Lokhttp3/internal/concurrent/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: okhttp3.internal.http2.e$e$d */
        public static final class d extends okhttp3.internal.concurrent.a {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f84672e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f84673f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C1318e f84674g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ boolean f84675h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ okhttp3.internal.http2.l f84676i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str, boolean z4, String str2, boolean z5, C1318e c1318e, boolean z6, okhttp3.internal.http2.l lVar) {
                super(str2, z5);
                this.f84672e = str;
                this.f84673f = z4;
                this.f84674g = c1318e;
                this.f84675h = z6;
                this.f84676i = lVar;
            }

            @Override // okhttp3.internal.concurrent.a
            public long f() {
                this.f84674g.q(this.f84675h, this.f84676i);
                return -1L;
            }
        }

        public C1318e(@fg.l e eVar, okhttp3.internal.http2.g gVar) {
            l0.p(gVar, ProtectedSandApp.s("᳖"));
            this.f84650c = eVar;
            this.reader = gVar;
        }

        @Override // okhttp3.internal.http2.g.c
        public void a(boolean clearPrevious, @fg.l okhttp3.internal.http2.l settings) {
            l0.p(settings, ProtectedSandApp.s("᳗"));
            okhttp3.internal.concurrent.c cVar = this.f84650c.writerQueue;
            String str = this.f84650c.getConnectionName() + ProtectedSandApp.s("᳘");
            cVar.n(new d(str, true, str, true, this, clearPrevious, settings), 0L);
        }

        @Override // okhttp3.internal.http2.g.c
        public void b(boolean inFinished, int streamId, int associatedStreamId, @fg.l List<okhttp3.internal.http2.b> headerBlock) {
            l0.p(headerBlock, ProtectedSandApp.s("᳙"));
            if (this.f84650c.B0(streamId)) {
                this.f84650c.q0(streamId, headerBlock, inFinished);
                return;
            }
            synchronized (this.f84650c) {
                okhttp3.internal.http2.h N = this.f84650c.N(streamId);
                if (N != null) {
                    k2 k2Var = k2.f75408a;
                    N.z(okhttp3.internal.d.X(headerBlock), inFinished);
                    return;
                }
                if (this.f84650c.isShutdown) {
                    return;
                }
                if (streamId <= this.f84650c.getLastGoodStreamId()) {
                    return;
                }
                if (streamId % 2 == this.f84650c.getNextStreamId() % 2) {
                    return;
                }
                okhttp3.internal.http2.h hVar = new okhttp3.internal.http2.h(streamId, this.f84650c, false, inFinished, okhttp3.internal.d.X(headerBlock));
                this.f84650c.K0(streamId);
                this.f84650c.O().put(Integer.valueOf(streamId), hVar);
                okhttp3.internal.concurrent.c j4 = this.f84650c.taskRunner.j();
                String str = this.f84650c.getConnectionName() + '[' + streamId + ProtectedSandApp.s("᳚");
                j4.n(new b(str, true, str, true, hVar, this, N, streamId, headerBlock, inFinished), 0L);
            }
        }

        @Override // okhttp3.internal.http2.g.c
        public void c(int streamId, long windowSizeIncrement) {
            if (streamId != 0) {
                okhttp3.internal.http2.h N = this.f84650c.N(streamId);
                if (N != null) {
                    synchronized (N) {
                        N.a(windowSizeIncrement);
                        k2 k2Var = k2.f75408a;
                    }
                    return;
                }
                return;
            }
            synchronized (this.f84650c) {
                e eVar = this.f84650c;
                eVar.writeBytesMaximum = eVar.getWriteBytesMaximum() + windowSizeIncrement;
                e eVar2 = this.f84650c;
                if (eVar2 == null) {
                    throw new NullPointerException(ProtectedSandApp.s("᳛"));
                }
                eVar2.notifyAll();
                k2 k2Var2 = k2.f75408a;
            }
        }

        @Override // okhttp3.internal.http2.g.c
        public void d(int streamId, @fg.l String origin, @fg.l p protocol, @fg.l String host, int port, long maxAge) {
            l0.p(origin, ProtectedSandApp.s("᳜"));
            l0.p(protocol, ProtectedSandApp.s("᳝"));
            l0.p(host, ProtectedSandApp.s("᳞"));
        }

        @Override // okhttp3.internal.http2.g.c
        public void f(int streamId, int promisedStreamId, @fg.l List<okhttp3.internal.http2.b> requestHeaders) {
            l0.p(requestHeaders, ProtectedSandApp.s("᳟"));
            this.f84650c.r0(promisedStreamId, requestHeaders);
        }

        @Override // okhttp3.internal.http2.g.c
        public void h() {
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            s();
            return k2.f75408a;
        }

        @Override // okhttp3.internal.http2.g.c
        public void j(boolean inFinished, int streamId, @fg.l o source, int length) throws IOException {
            l0.p(source, ProtectedSandApp.s("᳠"));
            if (this.f84650c.B0(streamId)) {
                this.f84650c.o0(streamId, source, length, inFinished);
                return;
            }
            okhttp3.internal.http2.h N = this.f84650c.N(streamId);
            if (N == null) {
                this.f84650c.B1(streamId, okhttp3.internal.http2.a.PROTOCOL_ERROR);
                long j4 = length;
                this.f84650c.g1(j4);
                source.skip(j4);
                return;
            }
            N.y(source, length);
            if (inFinished) {
                N.z(okhttp3.internal.d.f84457b, true);
            }
        }

        @Override // okhttp3.internal.http2.g.c
        public void l(boolean ack, int payload1, int payload2) {
            if (!ack) {
                okhttp3.internal.concurrent.c cVar = this.f84650c.writerQueue;
                String str = this.f84650c.getConnectionName() + ProtectedSandApp.s("᳡");
                cVar.n(new c(str, true, str, true, this, payload1, payload2), 0L);
                return;
            }
            synchronized (this.f84650c) {
                try {
                    if (payload1 == 1) {
                        this.f84650c.intervalPongsReceived++;
                    } else if (payload1 != 2) {
                        if (payload1 == 3) {
                            this.f84650c.awaitPongsReceived++;
                            e eVar = this.f84650c;
                            if (eVar == null) {
                                throw new NullPointerException(ProtectedSandApp.s("᳛"));
                            }
                            eVar.notifyAll();
                        }
                        k2 k2Var = k2.f75408a;
                    } else {
                        this.f84650c.degradedPongsReceived++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // okhttp3.internal.http2.g.c
        public void m(int streamId, int streamDependency, int weight, boolean exclusive) {
        }

        @Override // okhttp3.internal.http2.g.c
        public void n(int streamId, @fg.l okhttp3.internal.http2.a errorCode) {
            l0.p(errorCode, ProtectedSandApp.s("᳢"));
            if (this.f84650c.B0(streamId)) {
                this.f84650c.u0(streamId, errorCode);
                return;
            }
            okhttp3.internal.http2.h C0 = this.f84650c.C0(streamId);
            if (C0 != null) {
                C0.A(errorCode);
            }
        }

        @Override // okhttp3.internal.http2.g.c
        public void p(int lastGoodStreamId, @fg.l okhttp3.internal.http2.a errorCode, @fg.l p debugData) {
            int i4;
            okhttp3.internal.http2.h[] hVarArr;
            l0.p(errorCode, ProtectedSandApp.s("᳢"));
            l0.p(debugData, ProtectedSandApp.s("᳣"));
            debugData.q();
            synchronized (this.f84650c) {
                Object[] array = this.f84650c.O().values().toArray(new okhttp3.internal.http2.h[0]);
                if (array == null) {
                    throw new NullPointerException(ProtectedSandApp.s("᳤"));
                }
                hVarArr = (okhttp3.internal.http2.h[]) array;
                this.f84650c.isShutdown = true;
                k2 k2Var = k2.f75408a;
            }
            for (okhttp3.internal.http2.h hVar : hVarArr) {
                if (hVar.getId() > lastGoodStreamId && hVar.v()) {
                    hVar.A(okhttp3.internal.http2.a.REFUSED_STREAM);
                    this.f84650c.C0(hVar.getId());
                }
            }
        }

        /* JADX WARN: Can't wrap try/catch for region: R(8:(2:15|(10:17|18|19|20|21|22|23|24|25|26)(2:51|52))|20|21|22|23|24|25|26) */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00e9, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00ea, code lost:
        
            r21.f84650c.B(r0);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, okhttp3.internal.http2.l] */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Type inference failed for: r2v16 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void q(boolean r22, @fg.l okhttp3.internal.http2.l r23) {
            /*
                Method dump skipped, instructions count: 282
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.C1318e.q(boolean, okhttp3.internal.http2.l):void");
        }

        @fg.l
        /* renamed from: r, reason: from getter */
        public final okhttp3.internal.http2.g getReader() {
            return this.reader;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http2.a] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable, okhttp3.internal.http2.g] */
        public void s() {
            okhttp3.internal.http2.a aVar;
            okhttp3.internal.http2.a aVar2 = okhttp3.internal.http2.a.INTERNAL_ERROR;
            IOException e4 = null;
            try {
                try {
                    this.reader.c(this);
                    while (this.reader.b(false, this)) {
                    }
                    okhttp3.internal.http2.a aVar3 = okhttp3.internal.http2.a.NO_ERROR;
                    try {
                        this.f84650c.z(aVar3, okhttp3.internal.http2.a.CANCEL, null);
                        aVar = aVar3;
                    } catch (IOException e5) {
                        e4 = e5;
                        okhttp3.internal.http2.a aVar4 = okhttp3.internal.http2.a.PROTOCOL_ERROR;
                        e eVar = this.f84650c;
                        eVar.z(aVar4, aVar4, e4);
                        aVar = eVar;
                        aVar2 = this.reader;
                        okhttp3.internal.d.l(aVar2);
                    }
                } catch (Throwable th) {
                    th = th;
                    this.f84650c.z(aVar, aVar2, e4);
                    okhttp3.internal.d.l(this.reader);
                    throw th;
                }
            } catch (IOException e6) {
                e4 = e6;
            } catch (Throwable th2) {
                th = th2;
                aVar = aVar2;
                this.f84650c.z(aVar, aVar2, e4);
                okhttp3.internal.d.l(this.reader);
                throw th;
            }
            aVar2 = this.reader;
            okhttp3.internal.d.l(aVar2);
        }
    }

    /* compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"okhttp3/internal/concurrent/c$b", "Lokhttp3/internal/concurrent/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class f extends okhttp3.internal.concurrent.a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f84677e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f84678f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e f84679g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f84680h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ m f84681i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f84682j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f84683k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, boolean z4, String str2, boolean z5, e eVar, int i4, m mVar, int i5, boolean z6) {
            super(str2, z5);
            this.f84677e = str;
            this.f84678f = z4;
            this.f84679g = eVar;
            this.f84680h = i4;
            this.f84681i = mVar;
            this.f84682j = i5;
            this.f84683k = z6;
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            try {
                boolean d5 = this.f84679g.pushObserver.d(this.f84680h, this.f84681i, this.f84682j, this.f84683k);
                if (d5) {
                    this.f84679g.getWriter().m(this.f84680h, okhttp3.internal.http2.a.CANCEL);
                }
                if (!d5 && !this.f84683k) {
                    return -1L;
                }
                synchronized (this.f84679g) {
                    this.f84679g.currentPushRequests.remove(Integer.valueOf(this.f84680h));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"okhttp3/internal/concurrent/c$b", "Lokhttp3/internal/concurrent/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class g extends okhttp3.internal.concurrent.a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f84684e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f84685f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e f84686g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f84687h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ List f84688i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f84689j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z4, String str2, boolean z5, e eVar, int i4, List list, boolean z6) {
            super(str2, z5);
            this.f84684e = str;
            this.f84685f = z4;
            this.f84686g = eVar;
            this.f84687h = i4;
            this.f84688i = list;
            this.f84689j = z6;
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            boolean c5 = this.f84686g.pushObserver.c(this.f84687h, this.f84688i, this.f84689j);
            if (c5) {
                try {
                    this.f84686g.getWriter().m(this.f84687h, okhttp3.internal.http2.a.CANCEL);
                } catch (IOException unused) {
                    return -1L;
                }
            }
            if (!c5 && !this.f84689j) {
                return -1L;
            }
            synchronized (this.f84686g) {
                this.f84686g.currentPushRequests.remove(Integer.valueOf(this.f84687h));
            }
            return -1L;
        }
    }

    /* compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"okhttp3/internal/concurrent/c$b", "Lokhttp3/internal/concurrent/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class h extends okhttp3.internal.concurrent.a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f84690e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f84691f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e f84692g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f84693h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ List f84694i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z4, String str2, boolean z5, e eVar, int i4, List list) {
            super(str2, z5);
            this.f84690e = str;
            this.f84691f = z4;
            this.f84692g = eVar;
            this.f84693h = i4;
            this.f84694i = list;
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            if (!this.f84692g.pushObserver.b(this.f84693h, this.f84694i)) {
                return -1L;
            }
            try {
                this.f84692g.getWriter().m(this.f84693h, okhttp3.internal.http2.a.CANCEL);
                synchronized (this.f84692g) {
                    this.f84692g.currentPushRequests.remove(Integer.valueOf(this.f84693h));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"okhttp3/internal/concurrent/c$b", "Lokhttp3/internal/concurrent/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class i extends okhttp3.internal.concurrent.a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f84695e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f84696f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e f84697g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f84698h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ okhttp3.internal.http2.a f84699i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, boolean z4, String str2, boolean z5, e eVar, int i4, okhttp3.internal.http2.a aVar) {
            super(str2, z5);
            this.f84695e = str;
            this.f84696f = z4;
            this.f84697g = eVar;
            this.f84698h = i4;
            this.f84699i = aVar;
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            this.f84697g.pushObserver.a(this.f84698h, this.f84699i);
            synchronized (this.f84697g) {
                this.f84697g.currentPushRequests.remove(Integer.valueOf(this.f84698h));
                k2 k2Var = k2.f75408a;
            }
            return -1L;
        }
    }

    /* compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"okhttp3/internal/concurrent/c$b", "Lokhttp3/internal/concurrent/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class j extends okhttp3.internal.concurrent.a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f84700e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f84701f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e f84702g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, boolean z4, String str2, boolean z5, e eVar) {
            super(str2, z5);
            this.f84700e = str;
            this.f84701f = z4;
            this.f84702g = eVar;
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            this.f84702g.n1(false, 2, 0);
            return -1L;
        }
    }

    /* compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"okhttp3/internal/concurrent/c$b", "Lokhttp3/internal/concurrent/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class k extends okhttp3.internal.concurrent.a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f84703e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f84704f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e f84705g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f84706h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ okhttp3.internal.http2.a f84707i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, boolean z4, String str2, boolean z5, e eVar, int i4, okhttp3.internal.http2.a aVar) {
            super(str2, z5);
            this.f84703e = str;
            this.f84704f = z4;
            this.f84705g = eVar;
            this.f84706h = i4;
            this.f84707i = aVar;
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            try {
                this.f84705g.y1(this.f84706h, this.f84707i);
                return -1L;
            } catch (IOException e4) {
                this.f84705g.B(e4);
                return -1L;
            }
        }
    }

    /* compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"okhttp3/internal/concurrent/c$b", "Lokhttp3/internal/concurrent/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class l extends okhttp3.internal.concurrent.a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f84708e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f84709f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e f84710g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f84711h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f84712i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, boolean z4, String str2, boolean z5, e eVar, int i4, long j4) {
            super(str2, z5);
            this.f84708e = str;
            this.f84709f = z4;
            this.f84710g = eVar;
            this.f84711h = i4;
            this.f84712i = j4;
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            try {
                this.f84710g.getWriter().o(this.f84711h, this.f84712i);
                return -1L;
            } catch (IOException e4) {
                this.f84710g.B(e4);
                return -1L;
            }
        }
    }

    static {
        okhttp3.internal.http2.l lVar = new okhttp3.internal.http2.l();
        lVar.k(7, 65535);
        lVar.k(5, 16384);
        F = lVar;
    }

    public e(@fg.l b bVar) {
        l0.p(bVar, ProtectedSandApp.s("᳦"));
        boolean client = bVar.getClient();
        this.client = client;
        this.listener = bVar.getListener();
        this.streams = new LinkedHashMap();
        String c5 = bVar.c();
        this.connectionName = c5;
        this.nextStreamId = bVar.getClient() ? 3 : 2;
        okhttp3.internal.concurrent.d taskRunner = bVar.getTaskRunner();
        this.taskRunner = taskRunner;
        okhttp3.internal.concurrent.c j4 = taskRunner.j();
        this.writerQueue = j4;
        this.pushQueue = taskRunner.j();
        this.settingsListenerQueue = taskRunner.j();
        this.pushObserver = bVar.getPushObserver();
        okhttp3.internal.http2.l lVar = new okhttp3.internal.http2.l();
        if (bVar.getClient()) {
            lVar.k(7, 16777216);
        }
        k2 k2Var = k2.f75408a;
        this.okHttpSettings = lVar;
        this.peerSettings = F;
        this.writeBytesMaximum = r2.e();
        this.socket = bVar.h();
        this.writer = new okhttp3.internal.http2.i(bVar.g(), client);
        this.readerRunnable = new C1318e(this, new okhttp3.internal.http2.g(bVar.i(), client));
        this.currentPushRequests = new LinkedHashSet();
        if (bVar.getPingIntervalMillis() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(bVar.getPingIntervalMillis());
            String a5 = androidx.compose.runtime.changelist.j.a(c5, ProtectedSandApp.s("᳧"));
            j4.n(new a(a5, a5, this, nanos), nanos);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(IOException e4) {
        okhttp3.internal.http2.a aVar = okhttp3.internal.http2.a.PROTOCOL_ERROR;
        z(aVar, aVar, e4);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:6:0x0006, B:8:0x000d, B:9:0x0016, B:11:0x001a, B:13:0x002d, B:15:0x0035, B:19:0x0045, B:21:0x004b, B:22:0x0054, B:37:0x007f, B:38:0x0084), top: B:5:0x0006, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final okhttp3.internal.http2.h c0(int r11, java.util.List<okhttp3.internal.http2.b> r12, boolean r13) throws java.io.IOException {
        /*
            r10 = this;
            r6 = r13 ^ 1
            okhttp3.internal.http2.i r7 = r10.writer
            monitor-enter(r7)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L5f
            int r0 = r10.nextStreamId     // Catch: java.lang.Throwable -> L13
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L16
            okhttp3.internal.http2.a r0 = okhttp3.internal.http2.a.REFUSED_STREAM     // Catch: java.lang.Throwable -> L13
            r10.S0(r0)     // Catch: java.lang.Throwable -> L13
            goto L16
        L13:
            r11 = move-exception
            goto L85
        L16:
            boolean r0 = r10.isShutdown     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L7f
            int r8 = r10.nextStreamId     // Catch: java.lang.Throwable -> L13
            int r0 = r8 + 2
            r10.nextStreamId = r0     // Catch: java.lang.Throwable -> L13
            okhttp3.internal.http2.h r9 = new okhttp3.internal.http2.h     // Catch: java.lang.Throwable -> L13
            r5 = 0
            r4 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L13
            if (r13 == 0) goto L44
            long r0 = r10.writeBytesTotal     // Catch: java.lang.Throwable -> L13
            long r2 = r10.writeBytesMaximum     // Catch: java.lang.Throwable -> L13
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 >= 0) goto L44
            long r0 = r9.getWriteBytesTotal()     // Catch: java.lang.Throwable -> L13
            long r2 = r9.getWriteBytesMaximum()     // Catch: java.lang.Throwable -> L13
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 < 0) goto L42
            goto L44
        L42:
            r13 = 0
            goto L45
        L44:
            r13 = 1
        L45:
            boolean r0 = r9.w()     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L54
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.h> r0 = r10.streams     // Catch: java.lang.Throwable -> L13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L13
            r0.put(r1, r9)     // Catch: java.lang.Throwable -> L13
        L54:
            kotlin.k2 r0 = kotlin.k2.f75408a     // Catch: java.lang.Throwable -> L13
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L5f
            if (r11 != 0) goto L61
            okhttp3.internal.http2.i r11 = r10.writer     // Catch: java.lang.Throwable -> L5f
            r11.h(r6, r8, r12)     // Catch: java.lang.Throwable -> L5f
            goto L6a
        L5f:
            r11 = move-exception
            goto L87
        L61:
            boolean r0 = r10.client     // Catch: java.lang.Throwable -> L5f
            if (r0 != 0) goto L73
            okhttp3.internal.http2.i r0 = r10.writer     // Catch: java.lang.Throwable -> L5f
            r0.l(r11, r8, r12)     // Catch: java.lang.Throwable -> L5f
        L6a:
            monitor-exit(r7)
            if (r13 == 0) goto L72
            okhttp3.internal.http2.i r11 = r10.writer
            r11.flush()
        L72:
            return r9
        L73:
            java.lang.String r11 = "᳨"
            java.lang.String r11 = com.flashget.parentalcontrol.ProtectedSandApp.s(r11)     // Catch: java.lang.Throwable -> L5f
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L5f
            r12.<init>(r11)     // Catch: java.lang.Throwable -> L5f
            throw r12     // Catch: java.lang.Throwable -> L5f
        L7f:
            okhttp3.internal.http2.ConnectionShutdownException r11 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L13
            r11.<init>()     // Catch: java.lang.Throwable -> L13
            throw r11     // Catch: java.lang.Throwable -> L13
        L85:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L5f
            throw r11     // Catch: java.lang.Throwable -> L5f
        L87:
            monitor-exit(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.c0(int, java.util.List, boolean):okhttp3.internal.http2.h");
    }

    public static /* synthetic */ void e1(e eVar, boolean z4, okhttp3.internal.concurrent.d dVar, int i4, Object obj) throws IOException {
        if ((i4 & 1) != 0) {
            z4 = true;
        }
        if ((i4 & 2) != 0) {
            dVar = okhttp3.internal.concurrent.d.f84336h;
        }
        eVar.d1(z4, dVar);
    }

    @fg.l
    public final okhttp3.internal.http2.h A0(int associatedStreamId, @fg.l List<okhttp3.internal.http2.b> requestHeaders, boolean out) throws IOException {
        l0.p(requestHeaders, ProtectedSandApp.s("ᳩ"));
        if (this.client) {
            throw new IllegalStateException(ProtectedSandApp.s("ᳪ"));
        }
        return c0(associatedStreamId, requestHeaders, out);
    }

    public final boolean B0(int streamId) {
        return streamId != 0 && (streamId & 1) == 0;
    }

    public final void B1(int streamId, @fg.l okhttp3.internal.http2.a errorCode) {
        l0.p(errorCode, ProtectedSandApp.s("ᳫ"));
        okhttp3.internal.concurrent.c cVar = this.writerQueue;
        String str = this.connectionName + '[' + streamId + ProtectedSandApp.s("ᳬ");
        cVar.n(new k(str, true, str, true, this, streamId, errorCode), 0L);
    }

    /* renamed from: C, reason: from getter */
    public final boolean getClient() {
        return this.client;
    }

    @fg.m
    public final synchronized okhttp3.internal.http2.h C0(int streamId) {
        okhttp3.internal.http2.h remove;
        remove = this.streams.remove(Integer.valueOf(streamId));
        notifyAll();
        return remove;
    }

    @fg.l
    /* renamed from: D, reason: from getter */
    public final String getConnectionName() {
        return this.connectionName;
    }

    public final void D1(int streamId, long unacknowledgedBytesRead) {
        okhttp3.internal.concurrent.c cVar = this.writerQueue;
        String str = this.connectionName + '[' + streamId + ProtectedSandApp.s("᳭");
        cVar.n(new l(str, true, str, true, this, streamId, unacknowledgedBytesRead), 0L);
    }

    /* renamed from: E, reason: from getter */
    public final int getLastGoodStreamId() {
        return this.lastGoodStreamId;
    }

    @fg.l
    /* renamed from: F, reason: from getter */
    public final d getListener() {
        return this.listener;
    }

    /* renamed from: G, reason: from getter */
    public final int getNextStreamId() {
        return this.nextStreamId;
    }

    @fg.l
    /* renamed from: H, reason: from getter */
    public final okhttp3.internal.http2.l getOkHttpSettings() {
        return this.okHttpSettings;
    }

    public final void H0() {
        synchronized (this) {
            long j4 = this.degradedPongsReceived;
            long j5 = this.degradedPingsSent;
            if (j4 < j5) {
                return;
            }
            this.degradedPingsSent = j5 + 1;
            this.degradedPongDeadlineNs = System.nanoTime() + 1000000000;
            k2 k2Var = k2.f75408a;
            okhttp3.internal.concurrent.c cVar = this.writerQueue;
            String a5 = android.support.v4.media.c.a(new StringBuilder(), this.connectionName, ProtectedSandApp.s("᳧"));
            cVar.n(new j(a5, true, a5, true, this), 0L);
        }
    }

    @fg.l
    /* renamed from: I, reason: from getter */
    public final okhttp3.internal.http2.l getPeerSettings() {
        return this.peerSettings;
    }

    /* renamed from: J, reason: from getter */
    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    /* renamed from: K, reason: from getter */
    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final void K0(int i4) {
        this.lastGoodStreamId = i4;
    }

    @fg.l
    /* renamed from: L, reason: from getter */
    public final C1318e getReaderRunnable() {
        return this.readerRunnable;
    }

    @fg.l
    /* renamed from: M, reason: from getter */
    public final Socket getSocket() {
        return this.socket;
    }

    public final void M0(int i4) {
        this.nextStreamId = i4;
    }

    @fg.m
    public final synchronized okhttp3.internal.http2.h N(int id2) {
        return this.streams.get(Integer.valueOf(id2));
    }

    public final void N0(@fg.l okhttp3.internal.http2.l lVar) {
        l0.p(lVar, ProtectedSandApp.s("ᳮ"));
        this.peerSettings = lVar;
    }

    @fg.l
    public final Map<Integer, okhttp3.internal.http2.h> O() {
        return this.streams;
    }

    public final void O0(@fg.l okhttp3.internal.http2.l settings) throws IOException {
        l0.p(settings, ProtectedSandApp.s("ᳯ"));
        synchronized (this.writer) {
            synchronized (this) {
                if (this.isShutdown) {
                    throw new ConnectionShutdownException();
                }
                this.okHttpSettings.j(settings);
                k2 k2Var = k2.f75408a;
            }
            this.writer.n(settings);
        }
    }

    /* renamed from: Q, reason: from getter */
    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    /* renamed from: S, reason: from getter */
    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final void S0(@fg.l okhttp3.internal.http2.a statusCode) throws IOException {
        l0.p(statusCode, ProtectedSandApp.s("ᳰ"));
        synchronized (this.writer) {
            synchronized (this) {
                if (this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                int i4 = this.lastGoodStreamId;
                k2 k2Var = k2.f75408a;
                this.writer.g(i4, statusCode, okhttp3.internal.d.f84456a);
            }
        }
    }

    @kd.j
    public final void U0() throws IOException {
        e1(this, false, null, 3, null);
    }

    @fg.l
    /* renamed from: X, reason: from getter */
    public final okhttp3.internal.http2.i getWriter() {
        return this.writer;
    }

    public final synchronized boolean Y(long nowNs) {
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

    @kd.j
    public final void c1(boolean z4) throws IOException {
        e1(this, z4, null, 2, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        z(okhttp3.internal.http2.a.NO_ERROR, okhttp3.internal.http2.a.CANCEL, null);
    }

    @kd.j
    public final void d1(boolean sendConnectionPreface, @fg.l okhttp3.internal.concurrent.d taskRunner) throws IOException {
        l0.p(taskRunner, ProtectedSandApp.s("ᳱ"));
        if (sendConnectionPreface) {
            this.writer.b();
            this.writer.n(this.okHttpSettings);
            if (this.okHttpSettings.e() != 65535) {
                this.writer.o(0, r7 - 65535);
            }
        }
        okhttp3.internal.concurrent.c j4 = taskRunner.j();
        String str = this.connectionName;
        j4.n(new c.b(this.readerRunnable, str, true, str, true), 0L);
    }

    public final void flush() throws IOException {
        this.writer.flush();
    }

    public final synchronized void g1(long read) {
        long j4 = this.readBytesTotal + read;
        this.readBytesTotal = j4;
        long j5 = j4 - this.readBytesAcknowledged;
        if (j5 >= this.okHttpSettings.e() / 2) {
            D1(0, j5);
            this.readBytesAcknowledged += j5;
        }
    }

    @fg.l
    public final okhttp3.internal.http2.h j0(@fg.l List<okhttp3.internal.http2.b> requestHeaders, boolean out) throws IOException {
        l0.p(requestHeaders, ProtectedSandApp.s("ᳩ"));
        return c0(0, requestHeaders, out);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.writer.i());
        r6 = r2;
        r8.writeBytesTotal += r6;
        r4 = kotlin.k2.f75408a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j1(int r9, boolean r10, @fg.m okio.m r11, long r12) throws java.io.IOException {
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
            long r4 = r8.writeBytesTotal     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L61
            long r6 = r8.writeBytesMaximum     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L61
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L38
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.h> r2 = r8.streams     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L61
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L61
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L61
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L61
            goto L12
        L2a:
            r9 = move-exception
            goto L6e
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L61
            java.lang.String r10 = "ᳲ"
            java.lang.String r10 = com.flashget.parentalcontrol.ProtectedSandApp.s(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L61
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L61
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L61
        L38:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            okhttp3.internal.http2.i r4 = r8.writer     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.getMaxFrameSize()     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.writeBytesTotal     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.writeBytesTotal = r4     // Catch: java.lang.Throwable -> L2a
            kotlin.k2 r4 = kotlin.k2.f75408a     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            okhttp3.internal.http2.i r4 = r8.writer
            if (r10 == 0) goto L5c
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L5c
            r5 = 1
            goto L5d
        L5c:
            r5 = r3
        L5d:
            r4.c(r5, r9, r11, r2)
            goto Ld
        L61:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L6e:
            monitor-exit(r8)
            throw r9
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.j1(int, boolean, okio.m, long):void");
    }

    public final void k1(int streamId, boolean outFinished, @fg.l List<okhttp3.internal.http2.b> alternating) throws IOException {
        l0.p(alternating, ProtectedSandApp.s("ᳳ"));
        this.writer.h(outFinished, streamId, alternating);
    }

    public final void l1() throws InterruptedException {
        synchronized (this) {
            this.awaitPingsSent++;
        }
        n1(false, 3, 1330343787);
    }

    public final synchronized int n0() {
        return this.streams.size();
    }

    public final void n1(boolean reply, int payload1, int payload2) {
        try {
            this.writer.k(reply, payload1, payload2);
        } catch (IOException e4) {
            B(e4);
        }
    }

    public final void o0(int streamId, @fg.l o source, int byteCount, boolean inFinished) throws IOException {
        l0.p(source, ProtectedSandApp.s("᳴"));
        m mVar = new m();
        long j4 = byteCount;
        source.J1(j4);
        source.w3(mVar, j4);
        okhttp3.internal.concurrent.c cVar = this.pushQueue;
        String str = this.connectionName + '[' + streamId + ProtectedSandApp.s("ᳵ");
        cVar.n(new f(str, true, str, true, this, streamId, mVar, byteCount, inFinished), 0L);
    }

    public final void q0(int streamId, @fg.l List<okhttp3.internal.http2.b> requestHeaders, boolean inFinished) {
        l0.p(requestHeaders, ProtectedSandApp.s("ᳩ"));
        okhttp3.internal.concurrent.c cVar = this.pushQueue;
        String str = this.connectionName + '[' + streamId + ProtectedSandApp.s("ᳶ");
        cVar.n(new g(str, true, str, true, this, streamId, requestHeaders, inFinished), 0L);
    }

    public final void r0(int streamId, @fg.l List<okhttp3.internal.http2.b> requestHeaders) {
        l0.p(requestHeaders, ProtectedSandApp.s("ᳩ"));
        synchronized (this) {
            if (this.currentPushRequests.contains(Integer.valueOf(streamId))) {
                B1(streamId, okhttp3.internal.http2.a.PROTOCOL_ERROR);
                return;
            }
            this.currentPushRequests.add(Integer.valueOf(streamId));
            okhttp3.internal.concurrent.c cVar = this.pushQueue;
            String str = this.connectionName + '[' + streamId + ProtectedSandApp.s("᳷");
            cVar.n(new h(str, true, str, true, this, streamId, requestHeaders), 0L);
        }
    }

    public final void t1() throws InterruptedException {
        l1();
        y();
    }

    public final void u0(int streamId, @fg.l okhttp3.internal.http2.a errorCode) {
        l0.p(errorCode, ProtectedSandApp.s("ᳫ"));
        okhttp3.internal.concurrent.c cVar = this.pushQueue;
        String str = this.connectionName + '[' + streamId + ProtectedSandApp.s("᳸");
        cVar.n(new i(str, true, str, true, this, streamId, errorCode), 0L);
    }

    public final synchronized void y() throws InterruptedException {
        while (this.awaitPongsReceived < this.awaitPingsSent) {
            wait();
        }
    }

    public final void y1(int streamId, @fg.l okhttp3.internal.http2.a statusCode) throws IOException {
        l0.p(statusCode, ProtectedSandApp.s("ᳰ"));
        this.writer.m(streamId, statusCode);
    }

    public final void z(@fg.l okhttp3.internal.http2.a connectionCode, @fg.l okhttp3.internal.http2.a streamCode, @fg.m IOException cause) {
        int i4;
        okhttp3.internal.http2.h[] hVarArr;
        l0.p(connectionCode, ProtectedSandApp.s("᳹"));
        l0.p(streamCode, ProtectedSandApp.s("ᳺ"));
        if (okhttp3.internal.d.f84463h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\u1cfb"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("\u1cfc"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("\u1cfd"));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        try {
            S0(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.streams.isEmpty()) {
                    hVarArr = null;
                } else {
                    Object[] array = this.streams.values().toArray(new okhttp3.internal.http2.h[0]);
                    if (array == null) {
                        throw new NullPointerException(ProtectedSandApp.s("\u1cfe"));
                    }
                    hVarArr = (okhttp3.internal.http2.h[]) array;
                    this.streams.clear();
                }
                k2 k2Var = k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
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
}
