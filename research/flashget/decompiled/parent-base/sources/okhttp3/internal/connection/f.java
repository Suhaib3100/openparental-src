package okhttp3.internal.connection;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import okhttp3.b0;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.h0;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.http2.e;
import okhttp3.internal.ws.e;
import okhttp3.r;
import okhttp3.t;
import okhttp3.v;
import okio.a0;
import okio.n;
import okio.o;
import okio.q0;
import org.apache.http.HttpStatus;

/* compiled from: RealConnection.kt */
@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u0000 \u0095\u00012\u00020\u00012\u00020\u0002:\u0001hB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0014\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010#\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001fH\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010*\u001a\u00020)2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050'H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020)2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020)2\u0006\u0010\"\u001a\u00020!2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0011H\u0000¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0011H\u0000¢\u0006\u0004\b4\u00103J\u000f\u00105\u001a\u00020\u0011H\u0000¢\u0006\u0004\b5\u00103JE\u00107\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u00106\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b7\u00108J'\u0010<\u001a\u00020)2\u0006\u0010:\u001a\u0002092\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010'H\u0000¢\u0006\u0004\b<\u0010=J\u001f\u0010C\u001a\u00020B2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0000¢\u0006\u0004\bC\u0010DJ\u0017\u0010H\u001a\u00020G2\u0006\u0010F\u001a\u00020EH\u0000¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0005H\u0016¢\u0006\u0004\bJ\u0010KJ\r\u0010L\u001a\u00020\u0011¢\u0006\u0004\bL\u00103J\u000f\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bN\u0010OJ\u0015\u0010Q\u001a\u00020)2\u0006\u0010P\u001a\u00020)¢\u0006\u0004\bQ\u0010RJ\u0017\u0010U\u001a\u00020\u00112\u0006\u0010T\u001a\u00020SH\u0016¢\u0006\u0004\bU\u0010VJ\u001f\u0010[\u001a\u00020\u00112\u0006\u0010X\u001a\u00020W2\u0006\u0010Z\u001a\u00020YH\u0016¢\u0006\u0004\b[\u0010\\J\u0011\u0010]\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b]\u0010^J'\u0010b\u001a\u00020\u00112\u0006\u0010?\u001a\u00020>2\u0006\u0010_\u001a\u00020\u00052\u0006\u0010a\u001a\u00020`H\u0000¢\u0006\u0004\bb\u0010cJ!\u0010e\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020d2\b\u0010[\u001a\u0004\u0018\u00010`H\u0000¢\u0006\u0004\be\u0010fJ\u000f\u0010h\u001a\u00020gH\u0016¢\u0006\u0004\bh\u0010iJ\u000f\u0010k\u001a\u00020jH\u0016¢\u0006\u0004\bk\u0010lR\u0018\u0010n\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010mR\u0018\u0010o\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010mR\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010pR\u0018\u0010r\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010qR\u0018\u0010u\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0018\u0010y\u001a\u0004\u0018\u00010v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0018\u0010}\u001a\u0004\u0018\u00010z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R'\u0010\u0084\u0001\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0017\u0010\u0085\u0001\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010\u007fR'\u0010\u008a\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b0\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0005\b\u0089\u0001\u0010\u001cR\u0018\u0010\u008b\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b7\u0010\u0086\u0001R\u0018\u0010\u008c\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bb\u0010\u0086\u0001R\u0018\u0010\u008d\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0014\u0010\u0086\u0001R)\u0010\u0093\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020d0\u008f\u00010\u008e\u00018\u0006¢\u0006\u000f\n\u0005\b\u001d\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R)\u0010\u0098\u0001\u001a\u00030\u0094\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u0012\u0010\u0082\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0086\u0001\u0010\u0097\u0001R\u001a\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\u000f\n\u0005\b#\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0015\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b%\u0010\u009c\u0001R\u0017\u0010\u009e\u0001\u001a\u00020)8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u0081\u0001¨\u0006\u009f\u0001"}, d2 = {"Lokhttp3/internal/connection/f;", "Lokhttp3/internal/http2/e$d;", "Lokhttp3/j;", "Lokhttp3/internal/connection/h;", "connectionPool", "Lokhttp3/h0;", "route", "<init>", "(Lokhttp3/internal/connection/h;Lokhttp3/h0;)V", "", "connectTimeout", "readTimeout", "writeTimeout", "Lokhttp3/e;", "call", "Lokhttp3/r;", "eventListener", "Lkotlin/k2;", "q", "(IIILokhttp3/e;Lokhttp3/r;)V", "o", "(IILokhttp3/e;Lokhttp3/r;)V", "Lokhttp3/internal/connection/b;", "connectionSpecSelector", "pingIntervalMillis", "t", "(Lokhttp3/internal/connection/b;ILokhttp3/e;Lokhttp3/r;)V", "L", "(I)V", "p", "(Lokhttp3/internal/connection/b;)V", "Lokhttp3/d0;", "tunnelRequest", "Lokhttp3/v;", "url", "r", "(IILokhttp3/d0;Lokhttp3/v;)Lokhttp3/d0;", "s", "()Lokhttp3/d0;", "", "candidates", "", "H", "(Ljava/util/List;)Z", "M", "(Lokhttp3/v;)Z", "Lokhttp3/t;", "handshake", "l", "(Lokhttp3/v;Lokhttp3/t;)Z", "G", "()V", "F", "z", "connectionRetryEnabled", "m", "(IIIIZLokhttp3/e;Lokhttp3/r;)V", "Lokhttp3/a;", "address", "routes", "A", "(Lokhttp3/a;Ljava/util/List;)Z", "Lokhttp3/b0;", "client", "Lokhttp3/internal/http/g;", "chain", "Lokhttp3/internal/http/d;", "D", "(Lokhttp3/b0;Lokhttp3/internal/http/g;)Lokhttp3/internal/http/d;", "Lokhttp3/internal/connection/c;", "exchange", "Lokhttp3/internal/ws/e$d;", "E", "(Lokhttp3/internal/connection/c;)Lokhttp3/internal/ws/e$d;", "b", "()Lokhttp3/h0;", "k", "Ljava/net/Socket;", "d", "()Ljava/net/Socket;", "doExtensiveChecks", "B", "(Z)Z", "Lokhttp3/internal/http2/h;", "stream", "f", "(Lokhttp3/internal/http2/h;)V", "Lokhttp3/internal/http2/e;", "connection", "Lokhttp3/internal/http2/l;", "settings", "e", "(Lokhttp3/internal/http2/e;Lokhttp3/internal/http2/l;)V", "c", "()Lokhttp3/t;", "failedRoute", "Ljava/io/IOException;", "failure", "n", "(Lokhttp3/b0;Lokhttp3/h0;Ljava/io/IOException;)V", "Lokhttp3/internal/connection/e;", "N", "(Lokhttp3/internal/connection/e;Ljava/io/IOException;)V", "Lokhttp3/c0;", "a", "()Lokhttp3/c0;", "", "toString", "()Ljava/lang/String;", "Ljava/net/Socket;", "rawSocket", "socket", "Lokhttp3/t;", "Lokhttp3/c0;", "protocol", "g", "Lokhttp3/internal/http2/e;", "http2Connection", "Lokio/o;", "h", "Lokio/o;", "source", "Lokio/n;", "i", "Lokio/n;", "sink", "j", "Z", "x", "()Z", "J", "(Z)V", "noNewExchanges", "noCoalescedConnections", "I", "y", "()I", "K", "routeFailureCount", "successCount", "refusedStreamCount", "allocationLimit", "", "Ljava/lang/ref/Reference;", "Ljava/util/List;", "u", "()Ljava/util/List;", "calls", "", "w", "()J", "(J)V", "idleAtNs", "Lokhttp3/internal/connection/h;", "v", "()Lokhttp3/internal/connection/h;", "Lokhttp3/h0;", "C", "isMultiplexed", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class f extends e.d implements okhttp3.j {

    /* renamed from: u, reason: collision with root package name */
    private static final int f84406u = 21;

    /* renamed from: v, reason: collision with root package name */
    public static final long f84407v = 10000000000L;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Socket rawSocket;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Socket socket;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private t handshake;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private c0 protocol;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private okhttp3.internal.http2.e http2Connection;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private o source;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private n sink;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean noNewExchanges;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean noCoalescedConnections;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int routeFailureCount;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int successCount;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int refusedStreamCount;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int allocationLimit;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @l
    private final List<Reference<e>> calls;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private long idleAtNs;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @l
    private final h connectionPool;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final h0 route;

    /* renamed from: t, reason: collision with root package name */
    private static final String f84405t = ProtectedSandApp.s("ꃦ\u0001");

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* compiled from: RealConnection.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lokhttp3/internal/connection/f$a;", "", "<init>", "()V", "Lokhttp3/internal/connection/h;", "connectionPool", "Lokhttp3/h0;", "route", "Ljava/net/Socket;", "socket", "", "idleAtNs", "Lokhttp3/internal/connection/f;", "a", "(Lokhttp3/internal/connection/h;Lokhttp3/h0;Ljava/net/Socket;J)Lokhttp3/internal/connection/f;", "IDLE_CONNECTION_HEALTHY_NS", "J", "", "MAX_TUNNEL_ATTEMPTS", "I", "", "NPE_THROW_WITH_NULL", "Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.connection.f$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @l
        public final f a(@l h connectionPool, @l h0 route, @l Socket socket, long idleAtNs) {
            l0.p(connectionPool, ProtectedSandApp.s("ꃢ\u0001"));
            l0.p(route, ProtectedSandApp.s("ꃣ\u0001"));
            l0.p(socket, ProtectedSandApp.s("ꃤ\u0001"));
            f fVar = new f(connectionPool, route);
            fVar.socket = socket;
            fVar.I(idleAtNs);
            return fVar;
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: RealConnection.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/Certificate;", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 4, 0})
    static final class b extends n0 implements ld.a<List<? extends Certificate>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ okhttp3.g f84426b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ t f84427c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ okhttp3.a f84428d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(okhttp3.g gVar, t tVar, okhttp3.a aVar) {
            super(0);
            this.f84426b = gVar;
            this.f84427c = tVar;
            this.f84428d = aVar;
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Certificate> invoke() {
            ue.c certificateChainCleaner = this.f84426b.getCertificateChainCleaner();
            l0.m(certificateChainCleaner);
            return certificateChainCleaner.a(this.f84427c.m(), this.f84428d.w().getHost());
        }
    }

    /* compiled from: RealConnection.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/X509Certificate;", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 4, 0})
    static final class c extends n0 implements ld.a<List<? extends X509Certificate>> {
        c() {
            super(0);
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<X509Certificate> invoke() {
            t tVar = f.this.handshake;
            l0.m(tVar);
            List<Certificate> m4 = tVar.m();
            ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(m4, 10));
            for (Certificate certificate : m4) {
                if (certificate == null) {
                    throw new NullPointerException(ProtectedSandApp.s("ꃥ\u0001"));
                }
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    /* compiled from: RealConnection.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"okhttp3/internal/connection/f$d", "Lokhttp3/internal/ws/e$d;", "Lkotlin/k2;", "close", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class d extends e.d {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ okhttp3.internal.connection.c f84430e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ o f84431f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ n f84432g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(okhttp3.internal.connection.c cVar, o oVar, n nVar, boolean z4, o oVar2, n nVar2) {
            super(z4, oVar2, nVar2);
            this.f84430e = cVar;
            this.f84431f = oVar;
            this.f84432g = nVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f84430e.a(-1L, true, true, null);
        }
    }

    public f(@l h hVar, @l h0 h0Var) {
        l0.p(hVar, ProtectedSandApp.s("ꃧ\u0001"));
        l0.p(h0Var, ProtectedSandApp.s("ꃨ\u0001"));
        this.connectionPool = hVar;
        this.route = h0Var;
        this.allocationLimit = 1;
        this.calls = new ArrayList();
        this.idleAtNs = Long.MAX_VALUE;
    }

    private final boolean H(List<h0> candidates) {
        List<h0> list = candidates;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (h0 h0Var : list) {
            Proxy.Type type = h0Var.e().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.route.e().type() == type2 && l0.g(this.route.g(), h0Var.g())) {
                return true;
            }
        }
        return false;
    }

    private final void L(int pingIntervalMillis) throws IOException {
        Socket socket = this.socket;
        l0.m(socket);
        o oVar = this.source;
        l0.m(oVar);
        n nVar = this.sink;
        l0.m(nVar);
        socket.setSoTimeout(0);
        e.b l4 = new e.b(true, okhttp3.internal.concurrent.d.f84336h).y(socket, this.route.d().w().getHost(), oVar, nVar).k(this).l(pingIntervalMillis);
        l4.getClass();
        okhttp3.internal.http2.e eVar = new okhttp3.internal.http2.e(l4);
        this.http2Connection = eVar;
        okhttp3.internal.http2.e.INSTANCE.getClass();
        this.allocationLimit = okhttp3.internal.http2.e.F.f();
        okhttp3.internal.http2.e.e1(eVar, false, null, 3, null);
    }

    private final boolean M(v url) {
        t tVar;
        if (okhttp3.internal.d.f84463h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ꃩ\u0001"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("ꃪ\u0001"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("ꃫ\u0001"));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        v w4 = this.route.d().w();
        if (url.getPort() != w4.getPort()) {
            return false;
        }
        if (l0.g(url.getHost(), w4.getHost())) {
            return true;
        }
        if (this.noCoalescedConnections || (tVar = this.handshake) == null) {
            return false;
        }
        l0.m(tVar);
        return l(url, tVar);
    }

    private final boolean l(v url, t handshake) {
        List<Certificate> m4 = handshake.m();
        if (m4.isEmpty()) {
            return false;
        }
        ue.d dVar = ue.d.f92771c;
        String host = url.getHost();
        Certificate certificate = m4.get(0);
        if (certificate != null) {
            return dVar.c(host, (X509Certificate) certificate);
        }
        throw new NullPointerException(ProtectedSandApp.s("ꃬ\u0001"));
    }

    private final void o(int connectTimeout, int readTimeout, okhttp3.e call, r eventListener) throws IOException {
        Socket socket;
        int i4;
        Proxy e4 = this.route.e();
        okhttp3.a d5 = this.route.d();
        Proxy.Type type = e4.type();
        if (type != null && ((i4 = g.f84433a[type.ordinal()]) == 1 || i4 == 2)) {
            socket = d5.u().createSocket();
            l0.m(socket);
        } else {
            socket = new Socket(e4);
        }
        this.rawSocket = socket;
        eventListener.connectStart(call, this.route.g(), e4);
        socket.setSoTimeout(readTimeout);
        try {
            okhttp3.internal.platform.j.INSTANCE.getClass();
            okhttp3.internal.platform.j.f84863a.g(socket, this.route.g(), connectTimeout);
            try {
                this.source = a0.d(a0.n(socket));
                this.sink = a0.c(a0.i(socket));
            } catch (NullPointerException e5) {
                if (l0.g(e5.getMessage(), ProtectedSandApp.s("ꃦ\u0001"))) {
                    throw new IOException(e5);
                }
            }
        } catch (ConnectException e6) {
            ConnectException connectException = new ConnectException(ProtectedSandApp.s("ꃭ\u0001") + this.route.g());
            connectException.initCause(e6);
            throw connectException;
        }
    }

    private final void p(okhttp3.internal.connection.b connectionSpecSelector) throws IOException {
        String s4 = ProtectedSandApp.s("ꃮ\u0001");
        String s5 = ProtectedSandApp.s("ꃯ\u0001");
        okhttp3.a d5 = this.route.d();
        SSLSocketFactory v4 = d5.v();
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            l0.m(v4);
            Socket createSocket = v4.createSocket(this.rawSocket, d5.w().getHost(), d5.w().getPort(), true);
            if (createSocket == null) {
                throw new NullPointerException(ProtectedSandApp.s("ꃷ\u0001"));
            }
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                okhttp3.l a5 = connectionSpecSelector.a(sSLSocket2);
                if (a5.k()) {
                    okhttp3.internal.platform.j.INSTANCE.getClass();
                    okhttp3.internal.platform.j.f84863a.f(sSLSocket2, d5.w().getHost(), d5.q());
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                t.Companion companion = t.INSTANCE;
                l0.o(session, ProtectedSandApp.s("ꃰ\u0001"));
                t b5 = companion.b(session);
                HostnameVerifier p4 = d5.p();
                l0.m(p4);
                if (p4.verify(d5.w().getHost(), session)) {
                    okhttp3.g l4 = d5.l();
                    l0.m(l4);
                    this.handshake = new t(b5.o(), b5.g(), b5.k(), new b(l4, b5, d5));
                    l4.c(d5.w().getHost(), new c());
                    if (a5.k()) {
                        okhttp3.internal.platform.j.INSTANCE.getClass();
                        str = okhttp3.internal.platform.j.f84863a.j(sSLSocket2);
                    }
                    this.socket = sSLSocket2;
                    this.source = a0.d(a0.n(sSLSocket2));
                    this.sink = a0.c(a0.i(sSLSocket2));
                    this.protocol = str != null ? c0.INSTANCE.a(str) : c0.HTTP_1_1;
                    okhttp3.internal.platform.j.INSTANCE.getClass();
                    okhttp3.internal.platform.j.f84863a.c(sSLSocket2);
                    return;
                }
                List<Certificate> m4 = b5.m();
                if (m4.isEmpty()) {
                    throw new SSLPeerUnverifiedException(s4 + d5.w().getHost() + ProtectedSandApp.s("ꃶ\u0001"));
                }
                Certificate certificate = m4.get(0);
                if (certificate == null) {
                    throw new NullPointerException(ProtectedSandApp.s("ꃬ\u0001"));
                }
                X509Certificate x509Certificate = (X509Certificate) certificate;
                StringBuilder sb = new StringBuilder(s5);
                sb.append(d5.w().getHost());
                sb.append(ProtectedSandApp.s("ꃱ\u0001"));
                sb.append(okhttp3.g.INSTANCE.a(x509Certificate));
                sb.append(ProtectedSandApp.s("ꃲ\u0001"));
                Principal subjectDN = x509Certificate.getSubjectDN();
                l0.o(subjectDN, ProtectedSandApp.s("ꃳ\u0001"));
                sb.append(subjectDN.getName());
                sb.append(ProtectedSandApp.s("ꃴ\u0001"));
                sb.append(ue.d.f92771c.a(x509Certificate));
                sb.append(ProtectedSandApp.s("ꃵ\u0001"));
                throw new SSLPeerUnverifiedException(kotlin.text.v.r(sb.toString(), null, 1, null));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    okhttp3.internal.platform.j.INSTANCE.getClass();
                    okhttp3.internal.platform.j.f84863a.c(sSLSocket);
                }
                if (sSLSocket != null) {
                    okhttp3.internal.d.n(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final void q(int connectTimeout, int readTimeout, int writeTimeout, okhttp3.e call, r eventListener) throws IOException {
        d0 s4 = s();
        v q4 = s4.q();
        for (int i4 = 0; i4 < 21; i4++) {
            o(connectTimeout, readTimeout, call, eventListener);
            s4 = r(readTimeout, writeTimeout, s4, q4);
            if (s4 == null) {
                return;
            }
            Socket socket = this.rawSocket;
            if (socket != null) {
                okhttp3.internal.d.n(socket);
            }
            this.rawSocket = null;
            this.sink = null;
            this.source = null;
            eventListener.connectEnd(call, this.route.g(), this.route.e(), null);
        }
    }

    private final d0 r(int readTimeout, int writeTimeout, d0 tunnelRequest, v url) throws IOException {
        String str = ProtectedSandApp.s("ꃸ\u0001") + okhttp3.internal.d.a0(url, true) + ProtectedSandApp.s("ꃹ\u0001");
        while (true) {
            o oVar = this.source;
            l0.m(oVar);
            n nVar = this.sink;
            l0.m(nVar);
            okhttp3.internal.http1.b bVar = new okhttp3.internal.http1.b(null, this, oVar, nVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            oVar.getTimeout().i(readTimeout, timeUnit);
            nVar.getTimeout().i(writeTimeout, timeUnit);
            bVar.C(tunnelRequest.k(), str);
            bVar.a();
            f0.a g4 = bVar.g(false);
            l0.m(g4);
            f0 c5 = g4.E(tunnelRequest).c();
            bVar.B(c5);
            int u4 = c5.u();
            if (u4 == 200) {
                if (oVar.getBufferField().t2() && nVar.getBufferField().t2()) {
                    return null;
                }
                throw new IOException(ProtectedSandApp.s("ꃾ\u0001"));
            }
            if (u4 != 407) {
                throw new IOException(ProtectedSandApp.s("ꃽ\u0001") + c5.u());
            }
            d0 a5 = this.route.d().s().a(this.route, c5);
            if (a5 == null) {
                throw new IOException(ProtectedSandApp.s("ꃼ\u0001"));
            }
            if (kotlin.text.v.K1(ProtectedSandApp.s("ꃻ\u0001"), f0.C(c5, ProtectedSandApp.s("ꃺ\u0001"), null, 2, null), true)) {
                return a5;
            }
            tunnelRequest = a5;
        }
    }

    private final d0 s() throws IOException {
        d0 b5 = new d0.a().D(this.route.d().w()).p(ProtectedSandApp.s("ꃿ\u0001"), null).n(ProtectedSandApp.s("ꄀ\u0001"), okhttp3.internal.d.a0(this.route.d().w(), true)).n(ProtectedSandApp.s("ꄁ\u0001"), ProtectedSandApp.s("ꄂ\u0001")).n(ProtectedSandApp.s("ꄃ\u0001"), ProtectedSandApp.s("ꄄ\u0001")).b();
        d0 a5 = this.route.d().s().a(this.route, new f0.a().E(b5).B(c0.HTTP_1_1).g(HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED).y(ProtectedSandApp.s("ꄅ\u0001")).b(okhttp3.internal.d.f84458c).F(-1L).C(-1L).v(ProtectedSandApp.s("ꄆ\u0001"), ProtectedSandApp.s("ꄇ\u0001")).c());
        return a5 != null ? a5 : b5;
    }

    private final void t(okhttp3.internal.connection.b connectionSpecSelector, int pingIntervalMillis, okhttp3.e call, r eventListener) throws IOException {
        if (this.route.d().v() != null) {
            eventListener.secureConnectStart(call);
            p(connectionSpecSelector);
            eventListener.secureConnectEnd(call, this.handshake);
            if (this.protocol == c0.HTTP_2) {
                L(pingIntervalMillis);
                return;
            }
            return;
        }
        List<c0> q4 = this.route.d().q();
        c0 c0Var = c0.H2_PRIOR_KNOWLEDGE;
        if (!q4.contains(c0Var)) {
            this.socket = this.rawSocket;
            this.protocol = c0.HTTP_1_1;
        } else {
            this.socket = this.rawSocket;
            this.protocol = c0Var;
            L(pingIntervalMillis);
        }
    }

    public final boolean A(@l okhttp3.a address, @m List<h0> routes) {
        l0.p(address, ProtectedSandApp.s("ꄈ\u0001"));
        if (okhttp3.internal.d.f84463h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ꃩ\u0001"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("ꃪ\u0001"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("ꃫ\u0001"));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        if (this.calls.size() >= this.allocationLimit || this.noNewExchanges || !this.route.d().o(address)) {
            return false;
        }
        if (l0.g(address.w().getHost(), this.route.d().w().getHost())) {
            return true;
        }
        if (this.http2Connection == null || routes == null || !H(routes) || address.p() != ue.d.f92771c || !M(address.w())) {
            return false;
        }
        try {
            okhttp3.g l4 = address.l();
            l0.m(l4);
            String host = address.w().getHost();
            t tVar = this.handshake;
            l0.m(tVar);
            l4.a(host, tVar.m());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final boolean B(boolean doExtensiveChecks) {
        long j4;
        if (okhttp3.internal.d.f84463h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ꃩ\u0001"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("ꃪ\u0001"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("ꄉ\u0001"));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        long nanoTime = System.nanoTime();
        Socket socket = this.rawSocket;
        l0.m(socket);
        Socket socket2 = this.socket;
        l0.m(socket2);
        o oVar = this.source;
        l0.m(oVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        okhttp3.internal.http2.e eVar = this.http2Connection;
        if (eVar != null) {
            return eVar.Y(nanoTime);
        }
        synchronized (this) {
            j4 = nanoTime - this.idleAtNs;
        }
        if (j4 < f84407v || !doExtensiveChecks) {
            return true;
        }
        return okhttp3.internal.d.K(socket2, oVar);
    }

    public final boolean C() {
        return this.http2Connection != null;
    }

    @l
    public final okhttp3.internal.http.d D(@l b0 client, @l okhttp3.internal.http.g chain) throws SocketException {
        l0.p(client, ProtectedSandApp.s("ꄊ\u0001"));
        l0.p(chain, ProtectedSandApp.s("ꄋ\u0001"));
        Socket socket = this.socket;
        l0.m(socket);
        o oVar = this.source;
        l0.m(oVar);
        n nVar = this.sink;
        l0.m(nVar);
        okhttp3.internal.http2.e eVar = this.http2Connection;
        if (eVar != null) {
            return new okhttp3.internal.http2.f(client, this, chain, eVar);
        }
        socket.setSoTimeout(chain.getReadTimeoutMillis());
        q0 timeout = oVar.getTimeout();
        long o4 = chain.o();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.i(o4, timeUnit);
        nVar.getTimeout().i(chain.q(), timeUnit);
        return new okhttp3.internal.http1.b(client, this, oVar, nVar);
    }

    @l
    public final e.d E(@l okhttp3.internal.connection.c exchange) throws SocketException {
        l0.p(exchange, ProtectedSandApp.s("ꄌ\u0001"));
        Socket socket = this.socket;
        l0.m(socket);
        o oVar = this.source;
        l0.m(oVar);
        n nVar = this.sink;
        l0.m(nVar);
        socket.setSoTimeout(0);
        G();
        return new d(exchange, oVar, nVar, true, oVar, nVar);
    }

    public final synchronized void F() {
        this.noCoalescedConnections = true;
    }

    public final synchronized void G() {
        this.noNewExchanges = true;
    }

    public final void I(long j4) {
        this.idleAtNs = j4;
    }

    public final void J(boolean z4) {
        this.noNewExchanges = z4;
    }

    public final void K(int i4) {
        this.routeFailureCount = i4;
    }

    public final synchronized void N(@l e call, @m IOException e4) {
        try {
            l0.p(call, ProtectedSandApp.s("ꄍ\u0001"));
            if (e4 instanceof StreamResetException) {
                if (((StreamResetException) e4).errorCode == okhttp3.internal.http2.a.REFUSED_STREAM) {
                    int i4 = this.refusedStreamCount + 1;
                    this.refusedStreamCount = i4;
                    if (i4 > 1) {
                        this.noNewExchanges = true;
                        this.routeFailureCount++;
                    }
                } else if (((StreamResetException) e4).errorCode != okhttp3.internal.http2.a.CANCEL || !call.getCanceled()) {
                    this.noNewExchanges = true;
                    this.routeFailureCount++;
                }
            } else if (!C() || (e4 instanceof ConnectionShutdownException)) {
                this.noNewExchanges = true;
                if (this.successCount == 0) {
                    if (e4 != null) {
                        n(call.getClient(), this.route, e4);
                    }
                    this.routeFailureCount++;
                }
            }
        } finally {
        }
    }

    @Override // okhttp3.j
    @l
    public c0 a() {
        c0 c0Var = this.protocol;
        l0.m(c0Var);
        return c0Var;
    }

    @Override // okhttp3.j
    @l
    /* renamed from: b, reason: from getter */
    public h0 getRoute() {
        return this.route;
    }

    @Override // okhttp3.j
    @m
    /* renamed from: c, reason: from getter */
    public t getHandshake() {
        return this.handshake;
    }

    @Override // okhttp3.j
    @l
    public Socket d() {
        Socket socket = this.socket;
        l0.m(socket);
        return socket;
    }

    @Override // okhttp3.internal.http2.e.d
    public synchronized void e(@l okhttp3.internal.http2.e connection, @l okhttp3.internal.http2.l settings) {
        l0.p(connection, ProtectedSandApp.s("ꄎ\u0001"));
        l0.p(settings, ProtectedSandApp.s("ꄏ\u0001"));
        this.allocationLimit = settings.f();
    }

    @Override // okhttp3.internal.http2.e.d
    public void f(@l okhttp3.internal.http2.h stream) throws IOException {
        l0.p(stream, ProtectedSandApp.s("ꄐ\u0001"));
        stream.d(okhttp3.internal.http2.a.REFUSED_STREAM, null);
    }

    public final void k() {
        Socket socket = this.rawSocket;
        if (socket != null) {
            okhttp3.internal.d.n(socket);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r17, int r18, int r19, int r20, boolean r21, @fg.l okhttp3.e r22, @fg.l okhttp3.r r23) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.f.m(int, int, int, int, boolean, okhttp3.e, okhttp3.r):void");
    }

    public final void n(@l b0 client, @l h0 failedRoute, @l IOException failure) {
        l0.p(client, ProtectedSandApp.s("ꄊ\u0001"));
        l0.p(failedRoute, ProtectedSandApp.s("ꄘ\u0001"));
        l0.p(failure, ProtectedSandApp.s("ꄙ\u0001"));
        if (failedRoute.e().type() != Proxy.Type.DIRECT) {
            okhttp3.a d5 = failedRoute.d();
            d5.t().connectFailed(d5.w().Z(), failedRoute.e().address(), failure);
        }
        client.getRouteDatabase().b(failedRoute);
    }

    @l
    public String toString() {
        Object s4;
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ꄚ\u0001"));
        sb.append(this.route.d().w().getHost());
        sb.append(':');
        sb.append(this.route.d().w().getPort());
        sb.append(ProtectedSandApp.s("ꄛ\u0001"));
        sb.append(this.route.e());
        sb.append(ProtectedSandApp.s("ꄜ\u0001"));
        sb.append(this.route.g());
        sb.append(ProtectedSandApp.s("ꄝ\u0001"));
        t tVar = this.handshake;
        if (tVar == null || (s4 = tVar.g()) == null) {
            s4 = ProtectedSandApp.s("ꄞ\u0001");
        }
        sb.append(s4);
        sb.append(ProtectedSandApp.s("ꄟ\u0001"));
        sb.append(this.protocol);
        sb.append('}');
        return sb.toString();
    }

    @l
    public final List<Reference<e>> u() {
        return this.calls;
    }

    @l
    /* renamed from: v, reason: from getter */
    public final h getConnectionPool() {
        return this.connectionPool;
    }

    /* renamed from: w, reason: from getter */
    public final long getIdleAtNs() {
        return this.idleAtNs;
    }

    /* renamed from: x, reason: from getter */
    public final boolean getNoNewExchanges() {
        return this.noNewExchanges;
    }

    /* renamed from: y, reason: from getter */
    public final int getRouteFailureCount() {
        return this.routeFailureCount;
    }

    public final synchronized void z() {
        this.successCount++;
    }
}
