package okhttp3.internal.connection;

import com.flashget.kidsdownloader.ProtectedSandApp;
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
import kotlin.collections.b0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.text.x;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.g0;
import okhttp3.i0;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.http2.e;
import okhttp3.internal.ws.e;
import okhttp3.l;
import okhttp3.r;
import okhttp3.t;
import okio.a0;
import okio.n;
import okio.o;
import okio.q0;

/* compiled from: RealConnection.kt */
@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 ~2\u00020\u00012\u00020\u0002:\u0001RB\u001c\u0012\b\u0010\u0086\u0001\u001a\u00030\u0082\u0001\u0012\u0007\u0010\u0088\u0001\u001a\u00020\u001b¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J(\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J(\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J*\u0010\u0018\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\u0016\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0018\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010!\u001a\u00020 H\u0002J\u000f\u0010#\u001a\u00020\u000bH\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0000¢\u0006\u0004\b%\u0010$J\u000f\u0010&\u001a\u00020\u000bH\u0000¢\u0006\u0004\b&\u0010$J>\u0010(\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ'\u0010,\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020)2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0000¢\u0006\u0004\b,\u0010-J\u001f\u00103\u001a\u0002022\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0000¢\u0006\u0004\b3\u00104J\u0017\u00108\u001a\u0002072\u0006\u00106\u001a\u000205H\u0000¢\u0006\u0004\b8\u00109J\b\u0010:\u001a\u00020\u001bH\u0016J\u0006\u0010;\u001a\u00020\u000bJ\b\u0010=\u001a\u00020<H\u0016J\u000e\u0010?\u001a\u00020\u001d2\u0006\u0010>\u001a\u00020\u001dJ\u0010\u0010B\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020@H\u0016J\u0018\u0010G\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020EH\u0016J\n\u0010H\u001a\u0004\u0018\u00010 H\u0016J'\u0010L\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.2\u0006\u0010I\u001a\u00020\u001b2\u0006\u0010K\u001a\u00020JH\u0000¢\u0006\u0004\bL\u0010MJ!\u0010O\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020N2\b\u0010G\u001a\u0004\u0018\u00010JH\u0000¢\u0006\u0004\bO\u0010PJ\b\u0010R\u001a\u00020QH\u0016J\b\u0010T\u001a\u00020SH\u0016R\u0018\u0010V\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010UR\u0018\u0010W\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010UR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010XR\u0018\u0010Z\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010YR\u0018\u0010]\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010a\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010e\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\"\u0010l\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0016\u0010m\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010gR\"\u0010s\u001a\u00020\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\u0016\u0010t\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010nR\u0016\u0010u\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010nR\u0016\u0010v\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010nR#\u0010|\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020N0x0w8\u0006¢\u0006\f\n\u0004\b\u0013\u0010y\u001a\u0004\bz\u0010{R$\u0010\u0081\u0001\u001a\u00020}8\u0000@\u0000X\u0080\u000e¢\u0006\u0013\n\u0004\b\f\u0010j\u001a\u0004\b~\u0010\u007f\"\u0005\bn\u0010\u0080\u0001R\u001c\u0010\u0086\u0001\u001a\u00030\u0082\u00018\u0006¢\u0006\u000f\n\u0005\b\u0018\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0016\u0010\u0088\u0001\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010\u0087\u0001R\u0016\u0010\u008a\u0001\u001a\u00020\u001d8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010i¨\u0006\u008d\u0001"}, d2 = {"Lokhttp3/internal/connection/f;", "Lokhttp3/internal/http2/e$d;", "Lokhttp3/j;", "", "connectTimeout", "readTimeout", "writeTimeout", "Lokhttp3/e;", "call", "Lokhttp3/r;", "eventListener", "Lkotlin/m2;", "q", "o", "Lokhttp3/internal/connection/b;", "connectionSpecSelector", "pingIntervalMillis", "t", "L", "p", "Lokhttp3/e0;", "tunnelRequest", "Lokhttp3/w;", "url", "r", "s", "", "Lokhttp3/i0;", "candidates", "", "H", "M", "Lokhttp3/t;", "handshake", "l", "G", "()V", "F", "z", "connectionRetryEnabled", "m", "Lokhttp3/a;", "address", "routes", "A", "(Lokhttp3/a;Ljava/util/List;)Z", "Lokhttp3/c0;", "client", "Lokhttp3/internal/http/g;", "chain", "Lokhttp3/internal/http/d;", "D", "(Lokhttp3/c0;Lokhttp3/internal/http/g;)Lokhttp3/internal/http/d;", "Lokhttp3/internal/connection/c;", "exchange", "Lokhttp3/internal/ws/e$d;", "E", "(Lokhttp3/internal/connection/c;)Lokhttp3/internal/ws/e$d;", "b", "k", "Ljava/net/Socket;", "d", "doExtensiveChecks", "B", "Lokhttp3/internal/http2/h;", "stream", "f", "Lokhttp3/internal/http2/e;", "connection", "Lokhttp3/internal/http2/l;", "settings", "e", "c", "failedRoute", "Ljava/io/IOException;", "failure", "n", "(Lokhttp3/c0;Lokhttp3/i0;Ljava/io/IOException;)V", "Lokhttp3/internal/connection/e;", "N", "(Lokhttp3/internal/connection/e;Ljava/io/IOException;)V", "Lokhttp3/d0;", "a", "", "toString", "Ljava/net/Socket;", "rawSocket", "socket", "Lokhttp3/t;", "Lokhttp3/d0;", "protocol", "g", "Lokhttp3/internal/http2/e;", "http2Connection", "Lokio/o;", "h", "Lokio/o;", "source", "Lokio/n;", "i", "Lokio/n;", "sink", "j", "Z", "x", "()Z", "J", "(Z)V", "noNewExchanges", "noCoalescedConnections", "I", "y", "()I", "K", "(I)V", "routeFailureCount", "successCount", "refusedStreamCount", "allocationLimit", "", "Ljava/lang/ref/Reference;", "Ljava/util/List;", "u", "()Ljava/util/List;", "calls", "", "w", "()J", "(J)V", "idleAtNs", "Lokhttp3/internal/connection/h;", "Lokhttp3/internal/connection/h;", "v", "()Lokhttp3/internal/connection/h;", "connectionPool", "Lokhttp3/i0;", "route", "C", "isMultiplexed", "<init>", "(Lokhttp3/internal/connection/h;Lokhttp3/i0;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class f extends e.d implements okhttp3.j {

    /* renamed from: u, reason: collision with root package name */
    private static final int f30879u = 21;

    /* renamed from: v, reason: collision with root package name */
    public static final long f30880v = 10000000000L;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Socket rawSocket;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Socket socket;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private t handshake;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private d0 protocol;

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
    @d5.d
    private final List<Reference<e>> calls;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private long idleAtNs;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final h connectionPool;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final i0 route;

    /* renamed from: t, reason: collision with root package name */
    private static final String f30878t = ProtectedSandApp.s("懹");

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: RealConnection.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bR\u0014\u0010\f\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/connection/f$a;", "", "Lokhttp3/internal/connection/h;", "connectionPool", "Lokhttp3/i0;", "route", "Ljava/net/Socket;", "socket", "", "idleAtNs", "Lokhttp3/internal/connection/f;", "a", "IDLE_CONNECTION_HEALTHY_NS", "J", "", "MAX_TUNNEL_ATTEMPTS", "I", "", "NPE_THROW_WITH_NULL", "Ljava/lang/String;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.connection.f$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @d5.d
        public final f a(@d5.d h connectionPool, @d5.d i0 route, @d5.d Socket socket, long idleAtNs) {
            l0.p(connectionPool, ProtectedSandApp.s("懲"));
            l0.p(route, ProtectedSandApp.s("懳"));
            l0.p(socket, ProtectedSandApp.s("懴"));
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
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.a<List<? extends Certificate>> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ okhttp3.g f30899p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ t f30900q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ okhttp3.a f30901r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(okhttp3.g gVar, t tVar, okhttp3.a aVar) {
            super(0);
            this.f30899p = gVar;
            this.f30900q = tVar;
            this.f30901r = aVar;
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Certificate> n() {
            u4.c certificateChainCleaner = this.f30899p.getCertificateChainCleaner();
            l0.m(certificateChainCleaner);
            return certificateChainCleaner.a(this.f30900q.m(), this.f30901r.w().getHost());
        }
    }

    /* compiled from: RealConnection.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/X509Certificate;", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes6.dex */
    static final class c extends Lambda implements q3.a<List<? extends X509Certificate>> {
        c() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<X509Certificate> n() {
            int b02;
            t tVar = f.this.handshake;
            l0.m(tVar);
            List<Certificate> m5 = tVar.m();
            b02 = b0.b0(m5, 10);
            ArrayList arrayList = new ArrayList(b02);
            for (Certificate certificate : m5) {
                if (certificate == null) {
                    throw new NullPointerException(ProtectedSandApp.s("醹"));
                }
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    /* compiled from: RealConnection.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"okhttp3/internal/connection/f$d", "Lokhttp3/internal/ws/e$d;", "Lkotlin/m2;", "close", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class d extends e.d {

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ okhttp3.internal.connection.c f30903r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ o f30904s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ n f30905t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(okhttp3.internal.connection.c cVar, o oVar, n nVar, boolean z5, o oVar2, n nVar2) {
            super(z5, oVar2, nVar2);
            this.f30903r = cVar;
            this.f30904s = oVar;
            this.f30905t = nVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f30903r.a(-1L, true, true, null);
        }
    }

    public f(@d5.d h hVar, @d5.d i0 i0Var) {
        l0.p(hVar, ProtectedSandApp.s("懺"));
        l0.p(i0Var, ProtectedSandApp.s("懻"));
        this.connectionPool = hVar;
        this.route = i0Var;
        this.allocationLimit = 1;
        this.calls = new ArrayList();
        this.idleAtNs = Long.MAX_VALUE;
    }

    private final boolean H(List<i0> candidates) {
        if ((candidates instanceof Collection) && candidates.isEmpty()) {
            return false;
        }
        for (i0 i0Var : candidates) {
            if (i0Var.e().type() == Proxy.Type.DIRECT && this.route.e().type() == Proxy.Type.DIRECT && l0.g(this.route.g(), i0Var.g())) {
                return true;
            }
        }
        return false;
    }

    private final void L(int i5) throws IOException {
        Socket socket = this.socket;
        l0.m(socket);
        o oVar = this.source;
        l0.m(oVar);
        n nVar = this.sink;
        l0.m(nVar);
        socket.setSoTimeout(0);
        e.b l5 = new e.b(true, okhttp3.internal.concurrent.d.f30815h).y(socket, this.route.d().w().getHost(), oVar, nVar).k(this).l(i5);
        l5.getClass();
        okhttp3.internal.http2.e eVar = new okhttp3.internal.http2.e(l5);
        this.http2Connection = eVar;
        okhttp3.internal.http2.e.INSTANCE.getClass();
        this.allocationLimit = okhttp3.internal.http2.e.S.f();
        okhttp3.internal.http2.e.s1(eVar, false, null, 3, null);
    }

    private final boolean M(okhttp3.w url) {
        t tVar;
        if (okhttp3.internal.d.f30936h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("懼"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("懽"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("懾"));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        okhttp3.w w5 = this.route.d().w();
        if (url.getPort() != w5.getPort()) {
            return false;
        }
        if (l0.g(url.getHost(), w5.getHost())) {
            return true;
        }
        if (this.noCoalescedConnections || (tVar = this.handshake) == null) {
            return false;
        }
        l0.m(tVar);
        return l(url, tVar);
    }

    private final boolean l(okhttp3.w url, t handshake) {
        List<Certificate> m5 = handshake.m();
        if (!m5.isEmpty()) {
            u4.d dVar = u4.d.f33738c;
            String host = url.getHost();
            Certificate certificate = m5.get(0);
            if (certificate == null) {
                throw new NullPointerException(ProtectedSandApp.s("懿"));
            }
            if (dVar.c(host, (X509Certificate) certificate)) {
                return true;
            }
        }
        return false;
    }

    private final void o(int i5, int i6, okhttp3.e eVar, r rVar) throws IOException {
        Socket socket;
        int i7;
        Proxy e6 = this.route.e();
        okhttp3.a d6 = this.route.d();
        Proxy.Type type = e6.type();
        if (type != null && ((i7 = g.f30906a[type.ordinal()]) == 1 || i7 == 2)) {
            socket = d6.u().createSocket();
            l0.m(socket);
        } else {
            socket = new Socket(e6);
        }
        this.rawSocket = socket;
        rVar.j(eVar, this.route.g(), e6);
        socket.setSoTimeout(i6);
        try {
            okhttp3.internal.platform.j.INSTANCE.getClass();
            okhttp3.internal.platform.j.f31323a.g(socket, this.route.g(), i5);
            try {
                this.source = a0.d(a0.n(socket));
                this.sink = a0.c(a0.i(socket));
            } catch (NullPointerException e7) {
                if (l0.g(e7.getMessage(), ProtectedSandApp.s("戀"))) {
                    throw new IOException(e7);
                }
            }
        } catch (ConnectException e8) {
            ConnectException connectException = new ConnectException(ProtectedSandApp.s("戁") + this.route.g());
            connectException.initCause(e8);
            throw connectException;
        }
    }

    private final void p(okhttp3.internal.connection.b bVar) throws IOException {
        String r5;
        String s5 = ProtectedSandApp.s("戂");
        String s6 = ProtectedSandApp.s("戃");
        okhttp3.a d6 = this.route.d();
        SSLSocketFactory v5 = d6.v();
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            l0.m(v5);
            Socket createSocket = v5.createSocket(this.rawSocket, d6.w().getHost(), d6.w().getPort(), true);
            if (createSocket == null) {
                throw new NullPointerException(ProtectedSandApp.s("戌"));
            }
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                l a6 = bVar.a(sSLSocket2);
                if (a6.k()) {
                    okhttp3.internal.platform.j.INSTANCE.getClass();
                    okhttp3.internal.platform.j.f31323a.f(sSLSocket2, d6.w().getHost(), d6.q());
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                t.Companion companion = t.INSTANCE;
                l0.o(session, ProtectedSandApp.s("戄"));
                t b6 = companion.b(session);
                HostnameVerifier p5 = d6.p();
                l0.m(p5);
                if (p5.verify(d6.w().getHost(), session)) {
                    okhttp3.g l5 = d6.l();
                    l0.m(l5);
                    this.handshake = new t(b6.o(), b6.g(), b6.k(), new b(l5, b6, d6));
                    l5.c(d6.w().getHost(), new c());
                    if (a6.k()) {
                        okhttp3.internal.platform.j.INSTANCE.getClass();
                        str = okhttp3.internal.platform.j.f31323a.j(sSLSocket2);
                    }
                    this.socket = sSLSocket2;
                    this.source = a0.d(a0.n(sSLSocket2));
                    this.sink = a0.c(a0.i(sSLSocket2));
                    this.protocol = str != null ? d0.INSTANCE.a(str) : d0.HTTP_1_1;
                    okhttp3.internal.platform.j.INSTANCE.getClass();
                    okhttp3.internal.platform.j.f31323a.c(sSLSocket2);
                    return;
                }
                List<Certificate> m5 = b6.m();
                if (!(!m5.isEmpty())) {
                    throw new SSLPeerUnverifiedException(s6 + d6.w().getHost() + ProtectedSandApp.s("戋"));
                }
                Certificate certificate = m5.get(0);
                if (certificate == null) {
                    throw new NullPointerException(ProtectedSandApp.s("戅"));
                }
                X509Certificate x509Certificate = (X509Certificate) certificate;
                StringBuilder sb = new StringBuilder(s5);
                sb.append(d6.w().getHost());
                sb.append(ProtectedSandApp.s("戆"));
                sb.append(okhttp3.g.INSTANCE.a(x509Certificate));
                sb.append(ProtectedSandApp.s("戇"));
                Principal subjectDN = x509Certificate.getSubjectDN();
                l0.o(subjectDN, ProtectedSandApp.s("戈"));
                sb.append(subjectDN.getName());
                sb.append(ProtectedSandApp.s("戉"));
                sb.append(u4.d.f33738c.a(x509Certificate));
                sb.append(ProtectedSandApp.s("戊"));
                r5 = x.r(sb.toString(), null, 1, null);
                throw new SSLPeerUnverifiedException(r5);
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    okhttp3.internal.platform.j.INSTANCE.getClass();
                    okhttp3.internal.platform.j.f31323a.c(sSLSocket);
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

    private final void q(int i5, int i6, int i7, okhttp3.e eVar, r rVar) throws IOException {
        e0 s5 = s();
        okhttp3.w q5 = s5.q();
        for (int i8 = 0; i8 < 21; i8++) {
            o(i5, i6, eVar, rVar);
            s5 = r(i6, i7, s5, q5);
            if (s5 == null) {
                return;
            }
            Socket socket = this.rawSocket;
            if (socket != null) {
                okhttp3.internal.d.n(socket);
            }
            this.rawSocket = null;
            this.sink = null;
            this.source = null;
            rVar.h(eVar, this.route.g(), this.route.e(), null);
        }
    }

    private final e0 r(int readTimeout, int writeTimeout, e0 tunnelRequest, okhttp3.w url) throws IOException {
        boolean K1;
        String str = ProtectedSandApp.s("戍") + okhttp3.internal.d.a0(url, true) + ProtectedSandApp.s("戎");
        while (true) {
            o oVar = this.source;
            l0.m(oVar);
            n nVar = this.sink;
            l0.m(nVar);
            okhttp3.internal.http1.b bVar = new okhttp3.internal.http1.b(null, this, oVar, nVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            oVar.getTimeout().i(readTimeout, timeUnit);
            nVar.getTimeout().i(writeTimeout, timeUnit);
            bVar.B(tunnelRequest.k(), str);
            bVar.a();
            g0.a d6 = bVar.d(false);
            l0.m(d6);
            g0 c6 = d6.E(tunnelRequest).c();
            bVar.A(c6);
            int code = c6.getCode();
            if (code == 200) {
                if (oVar.i().M() && nVar.i().M()) {
                    return null;
                }
                throw new IOException(ProtectedSandApp.s("戓"));
            }
            if (code != 407) {
                throw new IOException(ProtectedSandApp.s("戒") + c6.getCode());
            }
            e0 a6 = this.route.d().s().a(this.route, c6);
            if (a6 == null) {
                throw new IOException(ProtectedSandApp.s("我"));
            }
            K1 = kotlin.text.e0.K1(ProtectedSandApp.s("成"), g0.P(c6, ProtectedSandApp.s("戏"), null, 2, null), true);
            if (K1) {
                return a6;
            }
            tunnelRequest = a6;
        }
    }

    private final e0 s() throws IOException {
        e0 b6 = new e0.a().D(this.route.d().w()).p(ProtectedSandApp.s("戔"), null).n(ProtectedSandApp.s("戕"), okhttp3.internal.d.a0(this.route.d().w(), true)).n(ProtectedSandApp.s("或"), ProtectedSandApp.s("戗")).n(ProtectedSandApp.s("战"), ProtectedSandApp.s("戙")).b();
        e0 a6 = this.route.d().s().a(this.route, new g0.a().E(b6).B(d0.HTTP_1_1).g(407).y(ProtectedSandApp.s("戚")).b(okhttp3.internal.d.f30931c).F(-1L).C(-1L).v(ProtectedSandApp.s("戛"), ProtectedSandApp.s("戜")).c());
        return a6 != null ? a6 : b6;
    }

    private final void t(okhttp3.internal.connection.b bVar, int i5, okhttp3.e eVar, r rVar) throws IOException {
        if (this.route.d().v() != null) {
            rVar.C(eVar);
            p(bVar);
            rVar.B(eVar, this.handshake);
            if (this.protocol == d0.HTTP_2) {
                L(i5);
                return;
            }
            return;
        }
        List<d0> q5 = this.route.d().q();
        d0 d0Var = d0.H2_PRIOR_KNOWLEDGE;
        if (!q5.contains(d0Var)) {
            this.socket = this.rawSocket;
            this.protocol = d0.HTTP_1_1;
        } else {
            this.socket = this.rawSocket;
            this.protocol = d0Var;
            L(i5);
        }
    }

    public final boolean A(@d5.d okhttp3.a address, @d5.e List<i0> routes) {
        l0.p(address, ProtectedSandApp.s("戝"));
        if (okhttp3.internal.d.f30936h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("戞"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("戟"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("戠"));
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        if (this.calls.size() >= this.allocationLimit || this.noNewExchanges || !this.route.d().o(address)) {
            return false;
        }
        if (l0.g(address.w().getHost(), this.route.d().w().getHost())) {
            return true;
        }
        if (this.http2Connection == null || routes == null || !H(routes) || address.p() != u4.d.f33738c || !M(address.w())) {
            return false;
        }
        try {
            okhttp3.g l5 = address.l();
            l0.m(l5);
            String host = address.w().getHost();
            t tVar = this.handshake;
            l0.m(tVar);
            l5.a(host, tVar.m());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final boolean B(boolean doExtensiveChecks) {
        long j5;
        if (okhttp3.internal.d.f30936h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("戡"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("戢"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("戣"));
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
            return eVar.p0(nanoTime);
        }
        synchronized (this) {
            j5 = nanoTime - this.idleAtNs;
        }
        if (j5 < f30880v || !doExtensiveChecks) {
            return true;
        }
        return okhttp3.internal.d.K(socket2, oVar);
    }

    public final boolean C() {
        return this.http2Connection != null;
    }

    @d5.d
    public final okhttp3.internal.http.d D(@d5.d c0 client, @d5.d okhttp3.internal.http.g chain) throws SocketException {
        l0.p(client, ProtectedSandApp.s("戤"));
        l0.p(chain, ProtectedSandApp.s("戥"));
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
        long o5 = chain.o();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.i(o5, timeUnit);
        nVar.getTimeout().i(chain.q(), timeUnit);
        return new okhttp3.internal.http1.b(client, this, oVar, nVar);
    }

    @d5.d
    public final e.d E(@d5.d okhttp3.internal.connection.c exchange) throws SocketException {
        l0.p(exchange, ProtectedSandApp.s("戦"));
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

    public final void I(long j5) {
        this.idleAtNs = j5;
    }

    public final void J(boolean z5) {
        this.noNewExchanges = z5;
    }

    public final void K(int i5) {
        this.routeFailureCount = i5;
    }

    public final synchronized void N(@d5.d e call, @d5.e IOException e6) {
        l0.p(call, ProtectedSandApp.s("戧"));
        if (e6 instanceof StreamResetException) {
            if (((StreamResetException) e6).errorCode == okhttp3.internal.http2.a.REFUSED_STREAM) {
                int i5 = this.refusedStreamCount + 1;
                this.refusedStreamCount = i5;
                if (i5 > 1) {
                    this.noNewExchanges = true;
                    this.routeFailureCount++;
                }
            } else if (((StreamResetException) e6).errorCode != okhttp3.internal.http2.a.CANCEL || !call.getCanceled()) {
                this.noNewExchanges = true;
                this.routeFailureCount++;
            }
        } else if (!C() || (e6 instanceof ConnectionShutdownException)) {
            this.noNewExchanges = true;
            if (this.successCount == 0) {
                if (e6 != null) {
                    n(call.getClient(), this.route, e6);
                }
                this.routeFailureCount++;
            }
        }
    }

    @Override // okhttp3.j
    @d5.d
    public d0 a() {
        d0 d0Var = this.protocol;
        l0.m(d0Var);
        return d0Var;
    }

    @Override // okhttp3.j
    @d5.d
    /* renamed from: b, reason: from getter */
    public i0 getRoute() {
        return this.route;
    }

    @Override // okhttp3.j
    @d5.e
    /* renamed from: c, reason: from getter */
    public t getHandshake() {
        return this.handshake;
    }

    @Override // okhttp3.j
    @d5.d
    public Socket d() {
        Socket socket = this.socket;
        l0.m(socket);
        return socket;
    }

    @Override // okhttp3.internal.http2.e.d
    public synchronized void e(@d5.d okhttp3.internal.http2.e eVar, @d5.d okhttp3.internal.http2.l lVar) {
        l0.p(eVar, ProtectedSandApp.s("戨"));
        l0.p(lVar, ProtectedSandApp.s("戩"));
        this.allocationLimit = lVar.f();
    }

    @Override // okhttp3.internal.http2.e.d
    public void f(@d5.d okhttp3.internal.http2.h hVar) throws IOException {
        l0.p(hVar, ProtectedSandApp.s("截"));
        hVar.d(okhttp3.internal.http2.a.REFUSED_STREAM, null);
    }

    public final void k() {
        Socket socket = this.rawSocket;
        if (socket != null) {
            okhttp3.internal.d.n(socket);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r17, int r18, int r19, int r20, boolean r21, @d5.d okhttp3.e r22, @d5.d okhttp3.r r23) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.f.m(int, int, int, int, boolean, okhttp3.e, okhttp3.r):void");
    }

    public final void n(@d5.d c0 client, @d5.d i0 failedRoute, @d5.d IOException failure) {
        l0.p(client, ProtectedSandApp.s("戳"));
        l0.p(failedRoute, ProtectedSandApp.s("戴"));
        l0.p(failure, ProtectedSandApp.s("戵"));
        if (failedRoute.e().type() != Proxy.Type.DIRECT) {
            okhttp3.a d6 = failedRoute.d();
            d6.t().connectFailed(d6.w().Z(), failedRoute.e().address(), failure);
        }
        client.getRouteDatabase().b(failedRoute);
    }

    @d5.d
    public String toString() {
        Object s5;
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("戶"));
        sb.append(this.route.d().w().getHost());
        sb.append(':');
        sb.append(this.route.d().w().getPort());
        sb.append(ProtectedSandApp.s("户"));
        sb.append(this.route.e());
        sb.append(ProtectedSandApp.s("戸"));
        sb.append(this.route.g());
        sb.append(ProtectedSandApp.s("戹"));
        t tVar = this.handshake;
        if (tVar == null || (s5 = tVar.g()) == null) {
            s5 = ProtectedSandApp.s("戺");
        }
        sb.append(s5);
        sb.append(ProtectedSandApp.s("戻"));
        sb.append(this.protocol);
        sb.append('}');
        return sb.toString();
    }

    @d5.d
    public final List<Reference<e>> u() {
        return this.calls;
    }

    @d5.d
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
