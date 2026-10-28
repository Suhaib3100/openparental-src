package okhttp3;

import com.bumptech.glide.load.resource.bitmap.p0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.net.Proxy;
import java.net.ProxySelector;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import okhttp3.e;
import okhttp3.internal.platform.j;
import okhttp3.k0;
import okhttp3.r;
import okhttp3.x;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import u4.c;

/* compiled from: OkHttpClient.kt */
@Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u0000 ±\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\t\rB\u0014\b\u0000\u0012\u0007\u0010\u00ad\u0001\u001a\u00020\u000e¢\u0006\u0006\b®\u0001\u0010¯\u0001B\u000b\b\u0016¢\u0006\u0006\b®\u0001\u0010°\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0007¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001eH\u0007¢\u0006\u0004\b$\u0010 J\u000f\u0010%\u001a\u00020\u001eH\u0007¢\u0006\u0004\b%\u0010 J\u000f\u0010'\u001a\u00020&H\u0007¢\u0006\u0004\b'\u0010(J\u0011\u0010*\u001a\u0004\u0018\u00010)H\u0007¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0007¢\u0006\u0004\b-\u0010.J\u0011\u00100\u001a\u0004\u0018\u00010/H\u0007¢\u0006\u0004\b0\u00101J\u000f\u00103\u001a\u000202H\u0007¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020!H\u0007¢\u0006\u0004\b5\u0010#J\u000f\u00107\u001a\u000206H\u0007¢\u0006\u0004\b7\u00108J\u000f\u0010:\u001a\u000209H\u0007¢\u0006\u0004\b:\u0010;J\u0015\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u0016H\u0007¢\u0006\u0004\b=\u0010\u0019J\u0015\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u0016H\u0007¢\u0006\u0004\b?\u0010\u0019J\u000f\u0010A\u001a\u00020@H\u0007¢\u0006\u0004\bA\u0010BJ\u000f\u0010D\u001a\u00020CH\u0007¢\u0006\u0004\bD\u0010EJ\u000f\u0010G\u001a\u00020FH\u0007¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020FH\u0007¢\u0006\u0004\bI\u0010HJ\u000f\u0010J\u001a\u00020FH\u0007¢\u0006\u0004\bJ\u0010HJ\u000f\u0010K\u001a\u00020FH\u0007¢\u0006\u0004\bK\u0010HJ\u000f\u0010L\u001a\u00020FH\u0007¢\u0006\u0004\bL\u0010HR\u0017\u0010O\u001a\u00020\u00108G¢\u0006\f\n\u0004\b\u001c\u0010M\u001a\u0004\bN\u0010\u0012R\u0017\u0010R\u001a\u00020\u00138G¢\u0006\f\n\u0004\b$\u0010P\u001a\u0004\bQ\u0010\u0015R\u001d\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168G¢\u0006\f\n\u0004\b%\u0010S\u001a\u0004\bT\u0010\u0019R\u001d\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168G¢\u0006\f\n\u0004\bV\u0010S\u001a\u0004\bW\u0010\u0019R\u0017\u0010[\u001a\u00020\u001b8G¢\u0006\f\n\u0004\bA\u0010Y\u001a\u0004\bZ\u0010\u001dR\u0017\u0010_\u001a\u00020\u001e8G¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010 R\u0017\u0010b\u001a\u00020!8G¢\u0006\f\n\u0004\b\u0018\u0010`\u001a\u0004\ba\u0010#R\u0017\u0010d\u001a\u00020\u001e8G¢\u0006\f\n\u0004\b\u001a\u0010]\u001a\u0004\bc\u0010 R\u0017\u0010f\u001a\u00020\u001e8G¢\u0006\f\n\u0004\bL\u0010]\u001a\u0004\be\u0010 R\u0017\u0010i\u001a\u00020&8G¢\u0006\f\n\u0004\b?\u0010g\u001a\u0004\bh\u0010(R\u0019\u0010l\u001a\u0004\u0018\u00010)8G¢\u0006\f\n\u0004\b0\u0010j\u001a\u0004\bk\u0010+R\u0017\u0010o\u001a\u00020,8G¢\u0006\f\n\u0004\b5\u0010m\u001a\u0004\bn\u0010.R\u0019\u0010r\u001a\u0004\u0018\u00010/8G¢\u0006\f\n\u0004\b3\u0010p\u001a\u0004\bq\u00101R\u0017\u0010u\u001a\u0002028G¢\u0006\f\n\u0004\bJ\u0010s\u001a\u0004\bt\u00104R\u0017\u0010w\u001a\u00020!8G¢\u0006\f\n\u0004\b\u001f\u0010`\u001a\u0004\bv\u0010#R\u0017\u0010z\u001a\u0002068G¢\u0006\f\n\u0004\b7\u0010x\u001a\u0004\by\u00108R\u0016\u0010|\u001a\u0004\u0018\u0001098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010{R\u001b\u0010\u0081\u0001\u001a\u0004\u0018\u00010}8G¢\u0006\r\n\u0004\bK\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R \u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020<0\u00168G¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010S\u001a\u0005\b\u0083\u0001\u0010\u0019R \u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020>0\u00168G¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010S\u001a\u0005\b\u0086\u0001\u0010\u0019R\u001b\u0010\u008b\u0001\u001a\u00020@8G¢\u0006\u000f\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0005\b\u008a\u0001\u0010BR\u001b\u0010\u008f\u0001\u001a\u00020C8G¢\u0006\u000f\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0005\b\u008e\u0001\u0010ER\u001e\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0090\u00018G¢\u0006\u000f\n\u0005\ba\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001a\u0010\u0096\u0001\u001a\u00020F8G¢\u0006\u000e\n\u0005\bk\u0010\u0088\u0001\u001a\u0005\b\u0095\u0001\u0010HR\u001b\u0010\u0098\u0001\u001a\u00020F8G¢\u0006\u000f\n\u0006\b\u0095\u0001\u0010\u0088\u0001\u001a\u0005\b\u0097\u0001\u0010HR\u001b\u0010\u009a\u0001\u001a\u00020F8G¢\u0006\u000f\n\u0006\b\u0092\u0001\u0010\u0088\u0001\u001a\u0005\b\u0099\u0001\u0010HR\u001b\u0010\u009d\u0001\u001a\u00020F8G¢\u0006\u000f\n\u0006\b\u009b\u0001\u0010\u0088\u0001\u001a\u0005\b\u009c\u0001\u0010HR\u001b\u0010 \u0001\u001a\u00020F8G¢\u0006\u000f\n\u0006\b\u009e\u0001\u0010\u0088\u0001\u001a\u0005\b\u009f\u0001\u0010HR\u001d\u0010¤\u0001\u001a\u00030¡\u00018G¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u008c\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R\u001d\u0010ª\u0001\u001a\u00030¥\u00018\u0006¢\u0006\u0010\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001R\u0013\u0010¬\u0001\u001a\u0002098G¢\u0006\u0007\u001a\u0005\b«\u0001\u0010;¨\u0006²\u0001"}, d2 = {"Lokhttp3/c0;", "", "Lokhttp3/e$a;", "Lokhttp3/k0$a;", "Lkotlin/m2;", "v0", "Lokhttp3/e0;", "request", "Lokhttp3/e;", "a", "Lokhttp3/l0;", "listener", "Lokhttp3/k0;", "b", "Lokhttp3/c0$a;", "k0", "Lokhttp3/p;", "m", "()Lokhttp3/p;", "Lokhttp3/k;", "j", "()Lokhttp3/k;", "", "Lokhttp3/x;", "u", "()Ljava/util/List;", "v", "Lokhttp3/r$c;", "o", "()Lokhttp3/r$c;", "", "C", "()Z", "Lokhttp3/b;", "c", "()Lokhttp3/b;", "p", "q", "Lokhttp3/n;", "l", "()Lokhttp3/n;", "Lokhttp3/c;", "d", "()Lokhttp3/c;", "Lokhttp3/q;", "n", "()Lokhttp3/q;", "Ljava/net/Proxy;", "y", "()Ljava/net/Proxy;", "Ljava/net/ProxySelector;", "A", "()Ljava/net/ProxySelector;", "z", "Ljavax/net/SocketFactory;", "D", "()Ljavax/net/SocketFactory;", "Ljavax/net/ssl/SSLSocketFactory;", "E", "()Ljavax/net/ssl/SSLSocketFactory;", "Lokhttp3/l;", "k", "Lokhttp3/d0;", "x", "Ljavax/net/ssl/HostnameVerifier;", "s", "()Ljavax/net/ssl/HostnameVerifier;", "Lokhttp3/g;", "f", "()Lokhttp3/g;", "", "e", "()I", "i", "B", "F", "w", "Lokhttp3/p;", "Y", "dispatcher", "Lokhttp3/k;", "T", "connectionPool", "Ljava/util/List;", "h0", "interceptors", "r", "j0", "networkInterceptors", "Lokhttp3/r$c;", "b0", "eventListenerFactory", "t", "Z", "s0", "retryOnConnectionFailure", "Lokhttp3/b;", "K", "authenticator", "c0", "followRedirects", "d0", "followSslRedirects", "Lokhttp3/n;", "W", "cookieJar", "Lokhttp3/c;", "L", "cache", "Lokhttp3/q;", "a0", "dns", "Ljava/net/Proxy;", "n0", "proxy", "Ljava/net/ProxySelector;", "q0", "proxySelector", "o0", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "t0", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactoryOrNull", "Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/X509TrustManager;", "x0", "()Ljavax/net/ssl/X509TrustManager;", "x509TrustManager", "G", "V", "connectionSpecs", "H", "m0", "protocols", "I", "Ljavax/net/ssl/HostnameVerifier;", "g0", "hostnameVerifier", "J", "Lokhttp3/g;", "Q", "certificatePinner", "Lu4/c;", "Lu4/c;", "N", "()Lu4/c;", "certificateChainCleaner", "M", "callTimeoutMillis", "S", "connectTimeoutMillis", "r0", "readTimeoutMillis", "O", "w0", "writeTimeoutMillis", "P", "l0", "pingIntervalMillis", "", "i0", "()J", "minWebSocketMessageToCompress", "Lokhttp3/internal/connection/i;", "R", "Lokhttp3/internal/connection/i;", "e0", "()Lokhttp3/internal/connection/i;", "routeDatabase", "u0", "sslSocketFactory", "builder", "<init>", "(Lokhttp3/c0$a;)V", "()V", "U", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public class c0 implements Cloneable, e.a, k0.a {

    /* renamed from: A, reason: from kotlin metadata */
    @d5.e
    private final Proxy proxy;

    /* renamed from: B, reason: from kotlin metadata */
    @d5.d
    private final ProxySelector proxySelector;

    /* renamed from: C, reason: from kotlin metadata */
    @d5.d
    private final b proxyAuthenticator;

    /* renamed from: D, reason: from kotlin metadata */
    @d5.d
    private final SocketFactory socketFactory;

    /* renamed from: E, reason: from kotlin metadata */
    private final SSLSocketFactory sslSocketFactoryOrNull;

    /* renamed from: F, reason: from kotlin metadata */
    @d5.e
    private final X509TrustManager x509TrustManager;

    /* renamed from: G, reason: from kotlin metadata */
    @d5.d
    private final List<l> connectionSpecs;

    /* renamed from: H, reason: from kotlin metadata */
    @d5.d
    private final List<d0> protocols;

    /* renamed from: I, reason: from kotlin metadata */
    @d5.d
    private final HostnameVerifier hostnameVerifier;

    /* renamed from: J, reason: from kotlin metadata */
    @d5.d
    private final g certificatePinner;

    /* renamed from: K, reason: from kotlin metadata */
    @d5.e
    private final u4.c certificateChainCleaner;

    /* renamed from: L, reason: from kotlin metadata */
    private final int callTimeoutMillis;

    /* renamed from: M, reason: from kotlin metadata */
    private final int connectTimeoutMillis;

    /* renamed from: N, reason: from kotlin metadata */
    private final int readTimeoutMillis;

    /* renamed from: O, reason: from kotlin metadata */
    private final int writeTimeoutMillis;

    /* renamed from: P, reason: from kotlin metadata */
    private final int pingIntervalMillis;

    /* renamed from: Q, reason: from kotlin metadata */
    private final long minWebSocketMessageToCompress;

    /* renamed from: R, reason: from kotlin metadata */
    @d5.d
    private final okhttp3.internal.connection.i routeDatabase;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final p dispatcher;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final k connectionPool;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final List<x> interceptors;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final List<x> networkInterceptors;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final r.c eventListenerFactory;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final boolean retryOnConnectionFailure;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final b authenticator;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final boolean followRedirects;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final boolean followSslRedirects;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final n cookieJar;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final c cache;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final q dns;

    /* renamed from: U, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @d5.d
    private static final List<d0> S = okhttp3.internal.d.z(d0.HTTP_2, d0.HTTP_1_1);

    @d5.d
    private static final List<l> T = okhttp3.internal.d.z(l.f31462h, l.f31464j);

    /* compiled from: OkHttpClient.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007¨\u0006\r"}, d2 = {"Lokhttp3/c0$b;", "", "", "Lokhttp3/d0;", "DEFAULT_PROTOCOLS", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lokhttp3/l;", "DEFAULT_CONNECTION_SPECS", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.c0$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @d5.d
        public final List<l> a() {
            return c0.T;
        }

        @d5.d
        public final List<d0> b() {
            return c0.S;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public c0(@d5.d a aVar) {
        ProxySelector proxySelector;
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("弿"));
        this.dispatcher = aVar.getDispatcher();
        this.connectionPool = aVar.getConnectionPool();
        this.interceptors = okhttp3.internal.d.c0(aVar.K());
        this.networkInterceptors = okhttp3.internal.d.c0(aVar.M());
        this.eventListenerFactory = aVar.getEventListenerFactory();
        this.retryOnConnectionFailure = aVar.getRetryOnConnectionFailure();
        this.authenticator = aVar.getAuthenticator();
        this.followRedirects = aVar.getFollowRedirects();
        this.followSslRedirects = aVar.getFollowSslRedirects();
        this.cookieJar = aVar.getCookieJar();
        this.cache = aVar.getCache();
        this.dns = aVar.getDns();
        this.proxy = aVar.getProxy();
        if (aVar.getProxy() != null) {
            proxySelector = t4.a.f33452a;
        } else {
            proxySelector = aVar.getProxySelector();
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = t4.a.f33452a;
            }
        }
        this.proxySelector = proxySelector;
        this.proxyAuthenticator = aVar.getProxyAuthenticator();
        this.socketFactory = aVar.getSocketFactory();
        List<l> C = aVar.C();
        this.connectionSpecs = C;
        this.protocols = aVar.O();
        this.hostnameVerifier = aVar.getHostnameVerifier();
        this.callTimeoutMillis = aVar.getCallTimeout();
        this.connectTimeoutMillis = aVar.getConnectTimeout();
        this.readTimeoutMillis = aVar.getReadTimeout();
        this.writeTimeoutMillis = aVar.getWriteTimeout();
        this.pingIntervalMillis = aVar.getPingInterval();
        this.minWebSocketMessageToCompress = aVar.getMinWebSocketMessageToCompress();
        okhttp3.internal.connection.i routeDatabase = aVar.getRouteDatabase();
        this.routeDatabase = routeDatabase == null ? new okhttp3.internal.connection.i() : routeDatabase;
        boolean z5 = true;
        if (!(C instanceof Collection) || !C.isEmpty()) {
            Iterator<T> it = C.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((l) it.next()).getIsTls()) {
                    z5 = false;
                    break;
                }
            }
        }
        if (z5) {
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = g.f30592c;
        } else if (aVar.getSslSocketFactoryOrNull() != null) {
            this.sslSocketFactoryOrNull = aVar.getSslSocketFactoryOrNull();
            u4.c certificateChainCleaner = aVar.getCertificateChainCleaner();
            kotlin.jvm.internal.l0.m(certificateChainCleaner);
            this.certificateChainCleaner = certificateChainCleaner;
            X509TrustManager x509TrustManagerOrNull = aVar.getX509TrustManagerOrNull();
            kotlin.jvm.internal.l0.m(x509TrustManagerOrNull);
            this.x509TrustManager = x509TrustManagerOrNull;
            g certificatePinner = aVar.getCertificatePinner();
            kotlin.jvm.internal.l0.m(certificateChainCleaner);
            this.certificatePinner = certificatePinner.j(certificateChainCleaner);
        } else {
            j.Companion companion = okhttp3.internal.platform.j.INSTANCE;
            companion.getClass();
            X509TrustManager r5 = okhttp3.internal.platform.j.f31323a.r();
            this.x509TrustManager = r5;
            companion.getClass();
            okhttp3.internal.platform.j jVar = okhttp3.internal.platform.j.f31323a;
            kotlin.jvm.internal.l0.m(r5);
            this.sslSocketFactoryOrNull = jVar.q(r5);
            c.Companion companion2 = u4.c.INSTANCE;
            kotlin.jvm.internal.l0.m(r5);
            u4.c a6 = companion2.a(r5);
            this.certificateChainCleaner = a6;
            g certificatePinner2 = aVar.getCertificatePinner();
            kotlin.jvm.internal.l0.m(a6);
            this.certificatePinner = certificatePinner2.j(a6);
        }
        v0();
    }

    private final void v0() {
        boolean z5;
        List<x> list = this.interceptors;
        String s5 = ProtectedSandApp.s("彀");
        if (list == null) {
            throw new NullPointerException(s5);
        }
        if (!(!list.contains(null))) {
            throw new IllegalStateException((ProtectedSandApp.s("彆") + this.interceptors).toString());
        }
        if (this.networkInterceptors == null) {
            throw new NullPointerException(s5);
        }
        if (!(!r0.contains(null))) {
            throw new IllegalStateException((ProtectedSandApp.s("彅") + this.networkInterceptors).toString());
        }
        List<l> list2 = this.connectionSpecs;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).getIsTls()) {
                    z5 = false;
                    break;
                }
            }
        }
        z5 = true;
        if (!z5) {
            if (this.sslSocketFactoryOrNull == null) {
                throw new IllegalStateException(ProtectedSandApp.s("彄").toString());
            }
            if (this.certificateChainCleaner == null) {
                throw new IllegalStateException(ProtectedSandApp.s("彃").toString());
            }
            if (this.x509TrustManager == null) {
                throw new IllegalStateException(ProtectedSandApp.s("彂").toString());
            }
            return;
        }
        boolean z6 = this.sslSocketFactoryOrNull == null;
        String s6 = ProtectedSandApp.s("彁");
        if (!z6) {
            throw new IllegalStateException(s6.toString());
        }
        if (!(this.certificateChainCleaner == null)) {
            throw new IllegalStateException(s6.toString());
        }
        if (!(this.x509TrustManager == null)) {
            throw new IllegalStateException(s6.toString());
        }
        if (!kotlin.jvm.internal.l0.g(this.certificatePinner, g.f30592c)) {
            throw new IllegalStateException(s6.toString());
        }
    }

    @p3.i(name = "-deprecated_proxySelector")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "proxySelector", imports = {}))
    @d5.d
    /* renamed from: A, reason: from getter */
    public final ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    @p3.i(name = "-deprecated_readTimeoutMillis")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "readTimeoutMillis", imports = {}))
    /* renamed from: B, reason: from getter */
    public final int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @p3.i(name = "-deprecated_retryOnConnectionFailure")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "retryOnConnectionFailure", imports = {}))
    /* renamed from: C, reason: from getter */
    public final boolean getRetryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    @p3.i(name = "-deprecated_socketFactory")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "socketFactory", imports = {}))
    @d5.d
    /* renamed from: D, reason: from getter */
    public final SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    @p3.i(name = "-deprecated_sslSocketFactory")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "sslSocketFactory", imports = {}))
    @d5.d
    public final SSLSocketFactory E() {
        return u0();
    }

    @p3.i(name = "-deprecated_writeTimeoutMillis")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "writeTimeoutMillis", imports = {}))
    /* renamed from: F, reason: from getter */
    public final int getWriteTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    @p3.i(name = "authenticator")
    @d5.d
    /* renamed from: K, reason: from getter */
    public final b getAuthenticator() {
        return this.authenticator;
    }

    @p3.i(name = "cache")
    @d5.e
    /* renamed from: L, reason: from getter */
    public final c getCache() {
        return this.cache;
    }

    @p3.i(name = "callTimeoutMillis")
    /* renamed from: M, reason: from getter */
    public final int getCallTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    @p3.i(name = "certificateChainCleaner")
    @d5.e
    /* renamed from: N, reason: from getter */
    public final u4.c getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    @p3.i(name = "certificatePinner")
    @d5.d
    /* renamed from: Q, reason: from getter */
    public final g getCertificatePinner() {
        return this.certificatePinner;
    }

    @p3.i(name = "connectTimeoutMillis")
    /* renamed from: S, reason: from getter */
    public final int getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @p3.i(name = "connectionPool")
    @d5.d
    /* renamed from: T, reason: from getter */
    public final k getConnectionPool() {
        return this.connectionPool;
    }

    @p3.i(name = "connectionSpecs")
    @d5.d
    public final List<l> V() {
        return this.connectionSpecs;
    }

    @p3.i(name = "cookieJar")
    @d5.d
    /* renamed from: W, reason: from getter */
    public final n getCookieJar() {
        return this.cookieJar;
    }

    @p3.i(name = "dispatcher")
    @d5.d
    /* renamed from: Y, reason: from getter */
    public final p getDispatcher() {
        return this.dispatcher;
    }

    @Override // okhttp3.e.a
    @d5.d
    public e a(@d5.d e0 request) {
        kotlin.jvm.internal.l0.p(request, ProtectedSandApp.s("彇"));
        return new okhttp3.internal.connection.e(this, request, false);
    }

    @p3.i(name = "dns")
    @d5.d
    /* renamed from: a0, reason: from getter */
    public final q getDns() {
        return this.dns;
    }

    @Override // okhttp3.k0.a
    @d5.d
    public k0 b(@d5.d e0 request, @d5.d l0 listener) {
        kotlin.jvm.internal.l0.p(request, ProtectedSandApp.s("彈"));
        kotlin.jvm.internal.l0.p(listener, ProtectedSandApp.s("彉"));
        okhttp3.internal.ws.e eVar = new okhttp3.internal.ws.e(okhttp3.internal.concurrent.d.f30815h, request, listener, new Random(), this.pingIntervalMillis, null, this.minWebSocketMessageToCompress);
        eVar.t(this);
        return eVar;
    }

    @p3.i(name = "eventListenerFactory")
    @d5.d
    /* renamed from: b0, reason: from getter */
    public final r.c getEventListenerFactory() {
        return this.eventListenerFactory;
    }

    @p3.i(name = "-deprecated_authenticator")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "authenticator", imports = {}))
    @d5.d
    public final b c() {
        return this.authenticator;
    }

    @p3.i(name = "followRedirects")
    /* renamed from: c0, reason: from getter */
    public final boolean getFollowRedirects() {
        return this.followRedirects;
    }

    @d5.d
    public Object clone() {
        return super.clone();
    }

    @p3.i(name = "-deprecated_cache")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "cache", imports = {}))
    @d5.e
    public final c d() {
        return this.cache;
    }

    @p3.i(name = "followSslRedirects")
    /* renamed from: d0, reason: from getter */
    public final boolean getFollowSslRedirects() {
        return this.followSslRedirects;
    }

    @p3.i(name = "-deprecated_callTimeoutMillis")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "callTimeoutMillis", imports = {}))
    public final int e() {
        return this.callTimeoutMillis;
    }

    @d5.d
    /* renamed from: e0, reason: from getter */
    public final okhttp3.internal.connection.i getRouteDatabase() {
        return this.routeDatabase;
    }

    @p3.i(name = "-deprecated_certificatePinner")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "certificatePinner", imports = {}))
    @d5.d
    public final g f() {
        return this.certificatePinner;
    }

    @p3.i(name = "hostnameVerifier")
    @d5.d
    /* renamed from: g0, reason: from getter */
    public final HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    @p3.i(name = "interceptors")
    @d5.d
    public final List<x> h0() {
        return this.interceptors;
    }

    @p3.i(name = "-deprecated_connectTimeoutMillis")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "connectTimeoutMillis", imports = {}))
    public final int i() {
        return this.connectTimeoutMillis;
    }

    @p3.i(name = "minWebSocketMessageToCompress")
    /* renamed from: i0, reason: from getter */
    public final long getMinWebSocketMessageToCompress() {
        return this.minWebSocketMessageToCompress;
    }

    @p3.i(name = "-deprecated_connectionPool")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "connectionPool", imports = {}))
    @d5.d
    public final k j() {
        return this.connectionPool;
    }

    @p3.i(name = "networkInterceptors")
    @d5.d
    public final List<x> j0() {
        return this.networkInterceptors;
    }

    @p3.i(name = "-deprecated_connectionSpecs")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "connectionSpecs", imports = {}))
    @d5.d
    public final List<l> k() {
        return this.connectionSpecs;
    }

    @d5.d
    public a k0() {
        return new a(this);
    }

    @p3.i(name = "-deprecated_cookieJar")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "cookieJar", imports = {}))
    @d5.d
    public final n l() {
        return this.cookieJar;
    }

    @p3.i(name = "pingIntervalMillis")
    /* renamed from: l0, reason: from getter */
    public final int getPingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    @p3.i(name = "-deprecated_dispatcher")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "dispatcher", imports = {}))
    @d5.d
    public final p m() {
        return this.dispatcher;
    }

    @p3.i(name = "protocols")
    @d5.d
    public final List<d0> m0() {
        return this.protocols;
    }

    @p3.i(name = "-deprecated_dns")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "dns", imports = {}))
    @d5.d
    public final q n() {
        return this.dns;
    }

    @p3.i(name = "proxy")
    @d5.e
    /* renamed from: n0, reason: from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    @p3.i(name = "-deprecated_eventListenerFactory")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "eventListenerFactory", imports = {}))
    @d5.d
    public final r.c o() {
        return this.eventListenerFactory;
    }

    @p3.i(name = "proxyAuthenticator")
    @d5.d
    /* renamed from: o0, reason: from getter */
    public final b getProxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @p3.i(name = "-deprecated_followRedirects")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "followRedirects", imports = {}))
    public final boolean p() {
        return this.followRedirects;
    }

    @p3.i(name = "-deprecated_followSslRedirects")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "followSslRedirects", imports = {}))
    public final boolean q() {
        return this.followSslRedirects;
    }

    @p3.i(name = "proxySelector")
    @d5.d
    public final ProxySelector q0() {
        return this.proxySelector;
    }

    @p3.i(name = "readTimeoutMillis")
    public final int r0() {
        return this.readTimeoutMillis;
    }

    @p3.i(name = "-deprecated_hostnameVerifier")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "hostnameVerifier", imports = {}))
    @d5.d
    public final HostnameVerifier s() {
        return this.hostnameVerifier;
    }

    @p3.i(name = "retryOnConnectionFailure")
    public final boolean s0() {
        return this.retryOnConnectionFailure;
    }

    @p3.i(name = "socketFactory")
    @d5.d
    public final SocketFactory t0() {
        return this.socketFactory;
    }

    @p3.i(name = "-deprecated_interceptors")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "interceptors", imports = {}))
    @d5.d
    public final List<x> u() {
        return this.interceptors;
    }

    @p3.i(name = "sslSocketFactory")
    @d5.d
    public final SSLSocketFactory u0() {
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactoryOrNull;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException(ProtectedSandApp.s("彊"));
    }

    @p3.i(name = "-deprecated_networkInterceptors")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "networkInterceptors", imports = {}))
    @d5.d
    public final List<x> v() {
        return this.networkInterceptors;
    }

    @p3.i(name = "-deprecated_pingIntervalMillis")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "pingIntervalMillis", imports = {}))
    public final int w() {
        return this.pingIntervalMillis;
    }

    @p3.i(name = "writeTimeoutMillis")
    public final int w0() {
        return this.writeTimeoutMillis;
    }

    @p3.i(name = "-deprecated_protocols")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "protocols", imports = {}))
    @d5.d
    public final List<d0> x() {
        return this.protocols;
    }

    @p3.i(name = "x509TrustManager")
    @d5.e
    /* renamed from: x0, reason: from getter */
    public final X509TrustManager getX509TrustManager() {
        return this.x509TrustManager;
    }

    @p3.i(name = "-deprecated_proxy")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "proxy", imports = {}))
    @d5.e
    public final Proxy y() {
        return this.proxy;
    }

    @p3.i(name = "-deprecated_proxyAuthenticator")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "proxyAuthenticator", imports = {}))
    @d5.d
    public final b z() {
        return this.proxyAuthenticator;
    }

    /* compiled from: OkHttpClient.kt */
    @Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b_\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\bè\u0001\u0010é\u0001B\u0014\b\u0010\u0012\u0007\u0010ê\u0001\u001a\u00020c¢\u0006\u0006\bè\u0001\u0010ë\u0001J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\tJ8\u0010\u0014\u001a\u00020\u00002#\b\u0004\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\rH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\tJ8\u0010\u0018\u001a\u00020\u00002#\b\u0004\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\rH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0015J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001cJ\u000e\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001fJ\u000e\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u001fJ\u000e\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u001fJ\u000e\u0010+\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)J\u0010\u0010.\u001a\u00020\u00002\b\u0010-\u001a\u0004\u0018\u00010,J\u000e\u00101\u001a\u00020\u00002\u0006\u00100\u001a\u00020/J\u0010\u00104\u001a\u00020\u00002\b\u00103\u001a\u0004\u0018\u000102J\u000e\u00107\u001a\u00020\u00002\u0006\u00106\u001a\u000205J\u000e\u00109\u001a\u00020\u00002\u0006\u00108\u001a\u00020\"J\u000e\u0010<\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:J\u0010\u0010?\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=H\u0007J\u0016\u0010B\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=2\u0006\u0010A\u001a\u00020@J\u0014\u0010F\u001a\u00020\u00002\f\u0010E\u001a\b\u0012\u0004\u0012\u00020D0CJ\u0014\u0010I\u001a\u00020\u00002\f\u0010H\u001a\b\u0012\u0004\u0012\u00020G0CJ\u000e\u0010L\u001a\u00020\u00002\u0006\u0010K\u001a\u00020JJ\u000e\u0010O\u001a\u00020\u00002\u0006\u0010N\u001a\u00020MJ\u0016\u0010T\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020P2\u0006\u0010S\u001a\u00020RJ\u0010\u0010W\u001a\u00020\u00002\u0006\u0010V\u001a\u00020UH\u0007J\u0016\u0010X\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020P2\u0006\u0010S\u001a\u00020RJ\u0010\u0010Y\u001a\u00020\u00002\u0006\u0010V\u001a\u00020UH\u0007J\u0016\u0010Z\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020P2\u0006\u0010S\u001a\u00020RJ\u0010\u0010[\u001a\u00020\u00002\u0006\u0010V\u001a\u00020UH\u0007J\u0016\u0010\\\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020P2\u0006\u0010S\u001a\u00020RJ\u0010\u0010]\u001a\u00020\u00002\u0006\u0010V\u001a\u00020UH\u0007J\u0016\u0010_\u001a\u00020\u00002\u0006\u0010^\u001a\u00020P2\u0006\u0010S\u001a\u00020RJ\u0010\u0010`\u001a\u00020\u00002\u0006\u0010V\u001a\u00020UH\u0007J\u000e\u0010b\u001a\u00020\u00002\u0006\u0010a\u001a\u00020PJ\u0006\u0010d\u001a\u00020cR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u0010\u0006\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR \u0010r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010o\u001a\u0004\bp\u0010qR \u0010t\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010o\u001a\u0004\bs\u0010qR\"\u0010\u001d\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\"\u0010 \u001a\u00020\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bd\u0010L\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R%\u0010#\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b.\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R$\u0010%\u001a\u00020\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\bT\u0010L\u001a\u0005\b\u0083\u0001\u0010{\"\u0005\b\u0084\u0001\u0010}R%\u0010\u0087\u0001\u001a\u00020\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\bW\u0010L\u001a\u0005\b\u0085\u0001\u0010{\"\u0005\b\u0086\u0001\u0010}R'\u0010*\u001a\u00020)8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bO\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R)\u0010-\u001a\u0004\u0018\u00010,8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bX\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R'\u00100\u001a\u00020/8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bY\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R)\u00103\u001a\u0004\u0018\u0001028\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u0007\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R)\u00106\u001a\u0004\u0018\u0001058\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bF\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R&\u00108\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0004\b+\u0010~\u001a\u0006\b¡\u0001\u0010\u0080\u0001\"\u0006\b¢\u0001\u0010\u0082\u0001R'\u0010;\u001a\u00020:8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u0004\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R*\u0010\u00ad\u0001\u001a\u0004\u0018\u00010=8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b1\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R*\u0010³\u0001\u001a\u0004\u0018\u00010@8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u001b\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R+\u0010E\u001a\b\u0012\u0004\u0012\u00020D0C8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b\u001e\u0010o\u001a\u0005\b´\u0001\u0010q\"\u0006\bµ\u0001\u0010¶\u0001R+\u0010H\u001a\b\u0012\u0004\u0012\u00020G0C8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b&\u0010o\u001a\u0005\b·\u0001\u0010q\"\u0006\b¸\u0001\u0010¶\u0001R'\u0010K\u001a\u00020J8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b(\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001R'\u0010N\u001a\u00020M8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0006\bÁ\u0001\u0010Â\u0001R,\u0010É\u0001\u001a\u0005\u0018\u00010Ã\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010Ä\u0001\u001a\u0006\bÅ\u0001\u0010Æ\u0001\"\u0006\bÇ\u0001\u0010È\u0001R*\u0010Ï\u0001\u001a\u00030Ê\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bË\u0001\u0010\u0085\u0001\u001a\u0006\bË\u0001\u0010Ì\u0001\"\u0006\bÍ\u0001\u0010Î\u0001R*\u0010Ò\u0001\u001a\u00030Ê\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÅ\u0001\u0010\u0085\u0001\u001a\u0006\bÐ\u0001\u0010Ì\u0001\"\u0006\bÑ\u0001\u0010Î\u0001R*\u0010Õ\u0001\u001a\u00030Ê\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¿\u0001\u0010\u0085\u0001\u001a\u0006\bÓ\u0001\u0010Ì\u0001\"\u0006\bÔ\u0001\u0010Î\u0001R*\u0010Ø\u0001\u001a\u00030Ê\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÐ\u0001\u0010\u0085\u0001\u001a\u0006\bÖ\u0001\u0010Ì\u0001\"\u0006\b×\u0001\u0010Î\u0001R)\u0010Û\u0001\u001a\u00030Ê\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bk\u0010\u0085\u0001\u001a\u0006\bÙ\u0001\u0010Ì\u0001\"\u0006\bÚ\u0001\u0010Î\u0001R)\u0010à\u0001\u001a\u00020P8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b´\u0001\u0010º\u0001\u001a\u0006\bÜ\u0001\u0010Ý\u0001\"\u0006\bÞ\u0001\u0010ß\u0001R,\u0010ç\u0001\u001a\u0005\u0018\u00010á\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010â\u0001\u001a\u0006\bã\u0001\u0010ä\u0001\"\u0006\bå\u0001\u0010æ\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006ì\u0001"}, d2 = {"Lokhttp3/c0$a;", "", "Lokhttp3/p;", "dispatcher", "p", "Lokhttp3/k;", "connectionPool", "m", "", "Lokhttp3/x;", "a0", "interceptor", "c", "Lkotlin/Function1;", "Lokhttp3/x$a;", "Lkotlin/r0;", "name", "chain", "Lokhttp3/g0;", "block", "a", "(Lq3/l;)Lokhttp3/c0$a;", "c0", "d", "b", "Lokhttp3/r;", "eventListener", "r", "Lokhttp3/r$c;", "eventListenerFactory", "s", "", "retryOnConnectionFailure", "l0", "Lokhttp3/b;", "authenticator", "e", "followRedirects", "t", "followProtocolRedirects", "u", "Lokhttp3/n;", "cookieJar", "o", "Lokhttp3/c;", "cache", "g", "Lokhttp3/q;", "dns", "q", "Ljava/net/Proxy;", "proxy", "g0", "Ljava/net/ProxySelector;", "proxySelector", "i0", "proxyAuthenticator", "h0", "Ljavax/net/SocketFactory;", "socketFactory", "O0", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "P0", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Q0", "", "Lokhttp3/l;", "connectionSpecs", "n", "Lokhttp3/d0;", "protocols", "f0", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Z", "Lokhttp3/g;", "certificatePinner", "j", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "h", "Ljava/time/Duration;", "duration", "i", "k", "l", "j0", "k0", "R0", "S0", "interval", "d0", "e0", "bytes", "b0", "Lokhttp3/c0;", "f", "Lokhttp3/p;", "E", "()Lokhttp3/p;", "v0", "(Lokhttp3/p;)V", "Lokhttp3/k;", "B", "()Lokhttp3/k;", "s0", "(Lokhttp3/k;)V", "Ljava/util/List;", "K", "()Ljava/util/List;", "interceptors", "M", "networkInterceptors", "Lokhttp3/r$c;", "G", "()Lokhttp3/r$c;", "x0", "(Lokhttp3/r$c;)V", "T", "()Z", "I0", "(Z)V", "Lokhttp3/b;", "v", "()Lokhttp3/b;", "m0", "(Lokhttp3/b;)V", "H", "y0", "I", "z0", "followSslRedirects", "Lokhttp3/n;", "D", "()Lokhttp3/n;", "u0", "(Lokhttp3/n;)V", "Lokhttp3/c;", "w", "()Lokhttp3/c;", "n0", "(Lokhttp3/c;)V", "Lokhttp3/q;", "F", "()Lokhttp3/q;", "w0", "(Lokhttp3/q;)V", "Ljava/net/Proxy;", "P", "()Ljava/net/Proxy;", "E0", "(Ljava/net/Proxy;)V", "Ljava/net/ProxySelector;", "R", "()Ljava/net/ProxySelector;", "G0", "(Ljava/net/ProxySelector;)V", "Q", "F0", "Ljavax/net/SocketFactory;", "V", "()Ljavax/net/SocketFactory;", "K0", "(Ljavax/net/SocketFactory;)V", "Ljavax/net/ssl/SSLSocketFactory;", "W", "()Ljavax/net/ssl/SSLSocketFactory;", "L0", "(Ljavax/net/ssl/SSLSocketFactory;)V", "sslSocketFactoryOrNull", "Ljavax/net/ssl/X509TrustManager;", "Y", "()Ljavax/net/ssl/X509TrustManager;", "N0", "(Ljavax/net/ssl/X509TrustManager;)V", "x509TrustManagerOrNull", "C", "t0", "(Ljava/util/List;)V", "O", "D0", "Ljavax/net/ssl/HostnameVerifier;", "J", "()Ljavax/net/ssl/HostnameVerifier;", "A0", "(Ljavax/net/ssl/HostnameVerifier;)V", "Lokhttp3/g;", "z", "()Lokhttp3/g;", "q0", "(Lokhttp3/g;)V", "Lu4/c;", "Lu4/c;", "y", "()Lu4/c;", "p0", "(Lu4/c;)V", "certificateChainCleaner", "", "x", "()I", "o0", "(I)V", "callTimeout", "A", "r0", "connectTimeout", "S", "H0", "readTimeout", "X", "M0", "writeTimeout", "N", "C0", "pingInterval", "L", "()J", "B0", "(J)V", "minWebSocketMessageToCompress", "Lokhttp3/internal/connection/i;", "Lokhttp3/internal/connection/i;", "U", "()Lokhttp3/internal/connection/i;", "J0", "(Lokhttp3/internal/connection/i;)V", "routeDatabase", "<init>", "()V", "okHttpClient", "(Lokhttp3/c0;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* renamed from: A, reason: from kotlin metadata */
        private int writeTimeout;

        /* renamed from: B, reason: from kotlin metadata */
        private int pingInterval;

        /* renamed from: C, reason: from kotlin metadata */
        private long minWebSocketMessageToCompress;

        /* renamed from: D, reason: from kotlin metadata */
        @d5.e
        private okhttp3.internal.connection.i routeDatabase;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private p dispatcher;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private k connectionPool;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final List<x> interceptors;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final List<x> networkInterceptors;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private r.c eventListenerFactory;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean retryOnConnectionFailure;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private okhttp3.b authenticator;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean followRedirects;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private boolean followSslRedirects;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private n cookieJar;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private c cache;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private q dns;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private Proxy proxy;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private ProxySelector proxySelector;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private okhttp3.b proxyAuthenticator;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private SocketFactory socketFactory;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private SSLSocketFactory sslSocketFactoryOrNull;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private X509TrustManager x509TrustManagerOrNull;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private List<l> connectionSpecs;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private List<? extends d0> protocols;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private HostnameVerifier hostnameVerifier;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private g certificatePinner;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private u4.c certificateChainCleaner;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata */
        private int callTimeout;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata */
        private int connectTimeout;

        /* renamed from: z, reason: collision with root package name and from kotlin metadata */
        private int readTimeout;

        /* compiled from: OkHttpClient.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lokhttp3/x$a;", "chain", "Lokhttp3/g0;", "a", "(Lokhttp3/x$a;)Lokhttp3/g0;"}, k = 3, mv = {1, 4, 0})
        /* renamed from: okhttp3.c0$a$a, reason: collision with other inner class name */
        public static final class C0469a implements x {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ q3.l f30546b;

            public C0469a(q3.l lVar) {
                this.f30546b = lVar;
            }

            @Override // okhttp3.x
            @d5.d
            public final g0 a(@d5.d x.a aVar) {
                kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("异"));
                return (g0) this.f30546b.N(aVar);
            }
        }

        /* compiled from: OkHttpClient.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lokhttp3/x$a;", "chain", "Lokhttp3/g0;", "a", "(Lokhttp3/x$a;)Lokhttp3/g0;"}, k = 3, mv = {1, 4, 0})
        public static final class b implements x {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ q3.l f30547b;

            public b(q3.l lVar) {
                this.f30547b = lVar;
            }

            @Override // okhttp3.x
            @d5.d
            public final g0 a(@d5.d x.a aVar) {
                kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("弃"));
                return (g0) this.f30547b.N(aVar);
            }
        }

        public a() {
            this.dispatcher = new p();
            this.connectionPool = new k();
            this.interceptors = new ArrayList();
            this.networkInterceptors = new ArrayList();
            this.eventListenerFactory = okhttp3.internal.d.e(r.f31515a);
            this.retryOnConnectionFailure = true;
            okhttp3.b bVar = okhttp3.b.f30462a;
            this.authenticator = bVar;
            this.followRedirects = true;
            this.followSslRedirects = true;
            this.cookieJar = n.f31501a;
            this.dns = q.f31512a;
            this.proxyAuthenticator = bVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            kotlin.jvm.internal.l0.o(socketFactory, ProtectedSandApp.s("弄"));
            this.socketFactory = socketFactory;
            Companion companion = c0.INSTANCE;
            companion.getClass();
            this.connectionSpecs = c0.T;
            companion.getClass();
            this.protocols = c0.S;
            this.hostnameVerifier = u4.d.f33738c;
            this.certificatePinner = g.f30592c;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
            this.minWebSocketMessageToCompress = 1024L;
        }

        /* renamed from: A, reason: from getter */
        public final int getConnectTimeout() {
            return this.connectTimeout;
        }

        public final void A0(@d5.d HostnameVerifier hostnameVerifier) {
            kotlin.jvm.internal.l0.p(hostnameVerifier, ProtectedSandApp.s("弆"));
            this.hostnameVerifier = hostnameVerifier;
        }

        @d5.d
        /* renamed from: B, reason: from getter */
        public final k getConnectionPool() {
            return this.connectionPool;
        }

        public final void B0(long j5) {
            this.minWebSocketMessageToCompress = j5;
        }

        @d5.d
        public final List<l> C() {
            return this.connectionSpecs;
        }

        public final void C0(int i5) {
            this.pingInterval = i5;
        }

        @d5.d
        /* renamed from: D, reason: from getter */
        public final n getCookieJar() {
            return this.cookieJar;
        }

        public final void D0(@d5.d List<? extends d0> list) {
            kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("弇"));
            this.protocols = list;
        }

        @d5.d
        /* renamed from: E, reason: from getter */
        public final p getDispatcher() {
            return this.dispatcher;
        }

        public final void E0(@d5.e Proxy proxy) {
            this.proxy = proxy;
        }

        @d5.d
        /* renamed from: F, reason: from getter */
        public final q getDns() {
            return this.dns;
        }

        public final void F0(@d5.d okhttp3.b bVar) {
            kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("弈"));
            this.proxyAuthenticator = bVar;
        }

        @d5.d
        /* renamed from: G, reason: from getter */
        public final r.c getEventListenerFactory() {
            return this.eventListenerFactory;
        }

        public final void G0(@d5.e ProxySelector proxySelector) {
            this.proxySelector = proxySelector;
        }

        /* renamed from: H, reason: from getter */
        public final boolean getFollowRedirects() {
            return this.followRedirects;
        }

        public final void H0(int i5) {
            this.readTimeout = i5;
        }

        /* renamed from: I, reason: from getter */
        public final boolean getFollowSslRedirects() {
            return this.followSslRedirects;
        }

        public final void I0(boolean z5) {
            this.retryOnConnectionFailure = z5;
        }

        @d5.d
        /* renamed from: J, reason: from getter */
        public final HostnameVerifier getHostnameVerifier() {
            return this.hostnameVerifier;
        }

        public final void J0(@d5.e okhttp3.internal.connection.i iVar) {
            this.routeDatabase = iVar;
        }

        @d5.d
        public final List<x> K() {
            return this.interceptors;
        }

        public final void K0(@d5.d SocketFactory socketFactory) {
            kotlin.jvm.internal.l0.p(socketFactory, ProtectedSandApp.s("弉"));
            this.socketFactory = socketFactory;
        }

        /* renamed from: L, reason: from getter */
        public final long getMinWebSocketMessageToCompress() {
            return this.minWebSocketMessageToCompress;
        }

        public final void L0(@d5.e SSLSocketFactory sSLSocketFactory) {
            this.sslSocketFactoryOrNull = sSLSocketFactory;
        }

        @d5.d
        public final List<x> M() {
            return this.networkInterceptors;
        }

        public final void M0(int i5) {
            this.writeTimeout = i5;
        }

        /* renamed from: N, reason: from getter */
        public final int getPingInterval() {
            return this.pingInterval;
        }

        public final void N0(@d5.e X509TrustManager x509TrustManager) {
            this.x509TrustManagerOrNull = x509TrustManager;
        }

        @d5.d
        public final List<d0> O() {
            return this.protocols;
        }

        @d5.d
        public final a O0(@d5.d SocketFactory socketFactory) {
            kotlin.jvm.internal.l0.p(socketFactory, ProtectedSandApp.s("弊"));
            if (!(!(socketFactory instanceof SSLSocketFactory))) {
                throw new IllegalArgumentException(ProtectedSandApp.s("弋").toString());
            }
            if (!kotlin.jvm.internal.l0.g(socketFactory, this.socketFactory)) {
                this.routeDatabase = null;
            }
            this.socketFactory = socketFactory;
            return this;
        }

        @d5.e
        /* renamed from: P, reason: from getter */
        public final Proxy getProxy() {
            return this.proxy;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Use the sslSocketFactory overload that accepts a X509TrustManager.")
        @d5.d
        public final a P0(@d5.d SSLSocketFactory sslSocketFactory) {
            kotlin.jvm.internal.l0.p(sslSocketFactory, ProtectedSandApp.s("弌"));
            if (!kotlin.jvm.internal.l0.g(sslSocketFactory, this.sslSocketFactoryOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sslSocketFactory;
            j.Companion companion = okhttp3.internal.platform.j.INSTANCE;
            companion.getClass();
            X509TrustManager s5 = okhttp3.internal.platform.j.f31323a.s(sslSocketFactory);
            if (s5 == null) {
                StringBuilder sb = new StringBuilder(ProtectedSandApp.s("弍"));
                companion.getClass();
                sb.append(okhttp3.internal.platform.j.f31323a);
                sb.append(ProtectedSandApp.s("弎"));
                sb.append(sslSocketFactory.getClass());
                throw new IllegalStateException(sb.toString());
            }
            this.x509TrustManagerOrNull = s5;
            companion.getClass();
            okhttp3.internal.platform.j jVar = okhttp3.internal.platform.j.f31323a;
            X509TrustManager x509TrustManager = this.x509TrustManagerOrNull;
            kotlin.jvm.internal.l0.m(x509TrustManager);
            this.certificateChainCleaner = jVar.d(x509TrustManager);
            return this;
        }

        @d5.d
        /* renamed from: Q, reason: from getter */
        public final okhttp3.b getProxyAuthenticator() {
            return this.proxyAuthenticator;
        }

        @d5.d
        public final a Q0(@d5.d SSLSocketFactory sslSocketFactory, @d5.d X509TrustManager trustManager) {
            kotlin.jvm.internal.l0.p(sslSocketFactory, ProtectedSandApp.s("式"));
            kotlin.jvm.internal.l0.p(trustManager, ProtectedSandApp.s("弐"));
            if ((!kotlin.jvm.internal.l0.g(sslSocketFactory, this.sslSocketFactoryOrNull)) || (!kotlin.jvm.internal.l0.g(trustManager, this.x509TrustManagerOrNull))) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sslSocketFactory;
            this.certificateChainCleaner = u4.c.INSTANCE.a(trustManager);
            this.x509TrustManagerOrNull = trustManager;
            return this;
        }

        @d5.e
        /* renamed from: R, reason: from getter */
        public final ProxySelector getProxySelector() {
            return this.proxySelector;
        }

        @d5.d
        public final a R0(long timeout, @d5.d TimeUnit unit) {
            kotlin.jvm.internal.l0.p(unit, ProtectedSandApp.s("弑"));
            this.writeTimeout = okhttp3.internal.d.j(ProtectedSandApp.s("弒"), timeout, unit);
            return this;
        }

        /* renamed from: S, reason: from getter */
        public final int getReadTimeout() {
            return this.readTimeout;
        }

        @d5.d
        @IgnoreJRERequirement
        public final a S0(@d5.d Duration duration) {
            long millis;
            kotlin.jvm.internal.l0.p(duration, ProtectedSandApp.s("弓"));
            millis = duration.toMillis();
            R0(millis, TimeUnit.MILLISECONDS);
            return this;
        }

        /* renamed from: T, reason: from getter */
        public final boolean getRetryOnConnectionFailure() {
            return this.retryOnConnectionFailure;
        }

        @d5.e
        /* renamed from: U, reason: from getter */
        public final okhttp3.internal.connection.i getRouteDatabase() {
            return this.routeDatabase;
        }

        @d5.d
        /* renamed from: V, reason: from getter */
        public final SocketFactory getSocketFactory() {
            return this.socketFactory;
        }

        @d5.e
        /* renamed from: W, reason: from getter */
        public final SSLSocketFactory getSslSocketFactoryOrNull() {
            return this.sslSocketFactoryOrNull;
        }

        /* renamed from: X, reason: from getter */
        public final int getWriteTimeout() {
            return this.writeTimeout;
        }

        @d5.e
        /* renamed from: Y, reason: from getter */
        public final X509TrustManager getX509TrustManagerOrNull() {
            return this.x509TrustManagerOrNull;
        }

        @d5.d
        public final a Z(@d5.d HostnameVerifier hostnameVerifier) {
            kotlin.jvm.internal.l0.p(hostnameVerifier, ProtectedSandApp.s("弔"));
            if (!kotlin.jvm.internal.l0.g(hostnameVerifier, this.hostnameVerifier)) {
                this.routeDatabase = null;
            }
            this.hostnameVerifier = hostnameVerifier;
            return this;
        }

        @p3.i(name = "-addInterceptor")
        @d5.d
        public final a a(@d5.d q3.l<? super x.a, g0> block) {
            kotlin.jvm.internal.l0.p(block, ProtectedSandApp.s("引"));
            return c(new C0469a(block));
        }

        @d5.d
        public final List<x> a0() {
            return this.interceptors;
        }

        @p3.i(name = "-addNetworkInterceptor")
        @d5.d
        public final a b(@d5.d q3.l<? super x.a, g0> block) {
            kotlin.jvm.internal.l0.p(block, ProtectedSandApp.s("弖"));
            return d(new b(block));
        }

        @d5.d
        public final a b0(long bytes) {
            if (!(bytes >= 0)) {
                throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("弗"), bytes).toString());
            }
            this.minWebSocketMessageToCompress = bytes;
            return this;
        }

        @d5.d
        public final a c(@d5.d x interceptor) {
            kotlin.jvm.internal.l0.p(interceptor, ProtectedSandApp.s("弘"));
            this.interceptors.add(interceptor);
            return this;
        }

        @d5.d
        public final List<x> c0() {
            return this.networkInterceptors;
        }

        @d5.d
        public final a d(@d5.d x interceptor) {
            kotlin.jvm.internal.l0.p(interceptor, ProtectedSandApp.s("弙"));
            this.networkInterceptors.add(interceptor);
            return this;
        }

        @d5.d
        public final a d0(long interval, @d5.d TimeUnit unit) {
            kotlin.jvm.internal.l0.p(unit, ProtectedSandApp.s("弚"));
            this.pingInterval = okhttp3.internal.d.j(ProtectedSandApp.s("弛"), interval, unit);
            return this;
        }

        @d5.d
        public final a e(@d5.d okhttp3.b authenticator) {
            kotlin.jvm.internal.l0.p(authenticator, ProtectedSandApp.s("弜"));
            this.authenticator = authenticator;
            return this;
        }

        @d5.d
        @IgnoreJRERequirement
        public final a e0(@d5.d Duration duration) {
            long millis;
            kotlin.jvm.internal.l0.p(duration, ProtectedSandApp.s("弝"));
            millis = duration.toMillis();
            d0(millis, TimeUnit.MILLISECONDS);
            return this;
        }

        @d5.d
        public final c0 f() {
            return new c0(this);
        }

        @d5.d
        public final a f0(@d5.d List<? extends d0> protocols) {
            List Y5;
            kotlin.jvm.internal.l0.p(protocols, ProtectedSandApp.s("弞"));
            Y5 = kotlin.collections.j0.Y5(protocols);
            d0 d0Var = d0.H2_PRIOR_KNOWLEDGE;
            if (!(Y5.contains(d0Var) || Y5.contains(d0.HTTP_1_1))) {
                throw new IllegalArgumentException((ProtectedSandApp.s("弣") + Y5).toString());
            }
            if (!(!Y5.contains(d0Var) || Y5.size() <= 1)) {
                throw new IllegalArgumentException((ProtectedSandApp.s("弢") + Y5).toString());
            }
            if (!(!Y5.contains(d0.HTTP_1_0))) {
                throw new IllegalArgumentException((ProtectedSandApp.s("弡") + Y5).toString());
            }
            if (!(!Y5.contains(null))) {
                throw new IllegalArgumentException(ProtectedSandApp.s("张").toString());
            }
            Y5.remove(d0.SPDY_3);
            if (!kotlin.jvm.internal.l0.g(Y5, this.protocols)) {
                this.routeDatabase = null;
            }
            List<? extends d0> unmodifiableList = Collections.unmodifiableList(Y5);
            kotlin.jvm.internal.l0.o(unmodifiableList, ProtectedSandApp.s("弟"));
            this.protocols = unmodifiableList;
            return this;
        }

        @d5.d
        public final a g(@d5.e c cache) {
            this.cache = cache;
            return this;
        }

        @d5.d
        public final a g0(@d5.e Proxy proxy) {
            if (!kotlin.jvm.internal.l0.g(proxy, this.proxy)) {
                this.routeDatabase = null;
            }
            this.proxy = proxy;
            return this;
        }

        @d5.d
        public final a h(long timeout, @d5.d TimeUnit unit) {
            kotlin.jvm.internal.l0.p(unit, ProtectedSandApp.s("弤"));
            this.callTimeout = okhttp3.internal.d.j(ProtectedSandApp.s("弥"), timeout, unit);
            return this;
        }

        @d5.d
        public final a h0(@d5.d okhttp3.b proxyAuthenticator) {
            kotlin.jvm.internal.l0.p(proxyAuthenticator, ProtectedSandApp.s("弦"));
            if (!kotlin.jvm.internal.l0.g(proxyAuthenticator, this.proxyAuthenticator)) {
                this.routeDatabase = null;
            }
            this.proxyAuthenticator = proxyAuthenticator;
            return this;
        }

        @d5.d
        @IgnoreJRERequirement
        public final a i(@d5.d Duration duration) {
            long millis;
            kotlin.jvm.internal.l0.p(duration, ProtectedSandApp.s("弧"));
            millis = duration.toMillis();
            h(millis, TimeUnit.MILLISECONDS);
            return this;
        }

        @d5.d
        public final a i0(@d5.d ProxySelector proxySelector) {
            kotlin.jvm.internal.l0.p(proxySelector, ProtectedSandApp.s("弨"));
            if (!kotlin.jvm.internal.l0.g(proxySelector, this.proxySelector)) {
                this.routeDatabase = null;
            }
            this.proxySelector = proxySelector;
            return this;
        }

        @d5.d
        public final a j(@d5.d g certificatePinner) {
            kotlin.jvm.internal.l0.p(certificatePinner, ProtectedSandApp.s("弩"));
            if (!kotlin.jvm.internal.l0.g(certificatePinner, this.certificatePinner)) {
                this.routeDatabase = null;
            }
            this.certificatePinner = certificatePinner;
            return this;
        }

        @d5.d
        public final a j0(long timeout, @d5.d TimeUnit unit) {
            kotlin.jvm.internal.l0.p(unit, ProtectedSandApp.s("弪"));
            this.readTimeout = okhttp3.internal.d.j(ProtectedSandApp.s("弫"), timeout, unit);
            return this;
        }

        @d5.d
        public final a k(long timeout, @d5.d TimeUnit unit) {
            kotlin.jvm.internal.l0.p(unit, ProtectedSandApp.s("弬"));
            this.connectTimeout = okhttp3.internal.d.j(ProtectedSandApp.s("弭"), timeout, unit);
            return this;
        }

        @d5.d
        @IgnoreJRERequirement
        public final a k0(@d5.d Duration duration) {
            long millis;
            kotlin.jvm.internal.l0.p(duration, ProtectedSandApp.s("弮"));
            millis = duration.toMillis();
            j0(millis, TimeUnit.MILLISECONDS);
            return this;
        }

        @d5.d
        @IgnoreJRERequirement
        public final a l(@d5.d Duration duration) {
            long millis;
            kotlin.jvm.internal.l0.p(duration, ProtectedSandApp.s("弯"));
            millis = duration.toMillis();
            k(millis, TimeUnit.MILLISECONDS);
            return this;
        }

        @d5.d
        public final a l0(boolean retryOnConnectionFailure) {
            this.retryOnConnectionFailure = retryOnConnectionFailure;
            return this;
        }

        @d5.d
        public final a m(@d5.d k connectionPool) {
            kotlin.jvm.internal.l0.p(connectionPool, ProtectedSandApp.s("弰"));
            this.connectionPool = connectionPool;
            return this;
        }

        public final void m0(@d5.d okhttp3.b bVar) {
            kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("弱"));
            this.authenticator = bVar;
        }

        @d5.d
        public final a n(@d5.d List<l> connectionSpecs) {
            kotlin.jvm.internal.l0.p(connectionSpecs, ProtectedSandApp.s("弲"));
            if (!kotlin.jvm.internal.l0.g(connectionSpecs, this.connectionSpecs)) {
                this.routeDatabase = null;
            }
            this.connectionSpecs = okhttp3.internal.d.c0(connectionSpecs);
            return this;
        }

        public final void n0(@d5.e c cVar) {
            this.cache = cVar;
        }

        @d5.d
        public final a o(@d5.d n cookieJar) {
            kotlin.jvm.internal.l0.p(cookieJar, ProtectedSandApp.s("弳"));
            this.cookieJar = cookieJar;
            return this;
        }

        public final void o0(int i5) {
            this.callTimeout = i5;
        }

        @d5.d
        public final a p(@d5.d p dispatcher) {
            kotlin.jvm.internal.l0.p(dispatcher, ProtectedSandApp.s("弴"));
            this.dispatcher = dispatcher;
            return this;
        }

        public final void p0(@d5.e u4.c cVar) {
            this.certificateChainCleaner = cVar;
        }

        @d5.d
        public final a q(@d5.d q dns) {
            kotlin.jvm.internal.l0.p(dns, ProtectedSandApp.s("張"));
            if (!kotlin.jvm.internal.l0.g(dns, this.dns)) {
                this.routeDatabase = null;
            }
            this.dns = dns;
            return this;
        }

        public final void q0(@d5.d g gVar) {
            kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("弶"));
            this.certificatePinner = gVar;
        }

        @d5.d
        public final a r(@d5.d r eventListener) {
            kotlin.jvm.internal.l0.p(eventListener, ProtectedSandApp.s("強"));
            this.eventListenerFactory = okhttp3.internal.d.e(eventListener);
            return this;
        }

        public final void r0(int i5) {
            this.connectTimeout = i5;
        }

        @d5.d
        public final a s(@d5.d r.c eventListenerFactory) {
            kotlin.jvm.internal.l0.p(eventListenerFactory, ProtectedSandApp.s("弸"));
            this.eventListenerFactory = eventListenerFactory;
            return this;
        }

        public final void s0(@d5.d k kVar) {
            kotlin.jvm.internal.l0.p(kVar, ProtectedSandApp.s("弹"));
            this.connectionPool = kVar;
        }

        @d5.d
        public final a t(boolean followRedirects) {
            this.followRedirects = followRedirects;
            return this;
        }

        public final void t0(@d5.d List<l> list) {
            kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("强"));
            this.connectionSpecs = list;
        }

        @d5.d
        public final a u(boolean followProtocolRedirects) {
            this.followSslRedirects = followProtocolRedirects;
            return this;
        }

        public final void u0(@d5.d n nVar) {
            kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("弻"));
            this.cookieJar = nVar;
        }

        @d5.d
        /* renamed from: v, reason: from getter */
        public final okhttp3.b getAuthenticator() {
            return this.authenticator;
        }

        public final void v0(@d5.d p pVar) {
            kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("弼"));
            this.dispatcher = pVar;
        }

        @d5.e
        /* renamed from: w, reason: from getter */
        public final c getCache() {
            return this.cache;
        }

        public final void w0(@d5.d q qVar) {
            kotlin.jvm.internal.l0.p(qVar, ProtectedSandApp.s("弽"));
            this.dns = qVar;
        }

        /* renamed from: x, reason: from getter */
        public final int getCallTimeout() {
            return this.callTimeout;
        }

        public final void x0(@d5.d r.c cVar) {
            kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("弾"));
            this.eventListenerFactory = cVar;
        }

        @d5.e
        /* renamed from: y, reason: from getter */
        public final u4.c getCertificateChainCleaner() {
            return this.certificateChainCleaner;
        }

        public final void y0(boolean z5) {
            this.followRedirects = z5;
        }

        @d5.d
        /* renamed from: z, reason: from getter */
        public final g getCertificatePinner() {
            return this.certificatePinner;
        }

        public final void z0(boolean z5) {
            this.followSslRedirects = z5;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@d5.d c0 c0Var) {
            this();
            kotlin.jvm.internal.l0.p(c0Var, ProtectedSandApp.s("弅"));
            this.dispatcher = c0Var.getDispatcher();
            this.connectionPool = c0Var.getConnectionPool();
            kotlin.collections.f0.q0(this.interceptors, c0Var.h0());
            kotlin.collections.f0.q0(this.networkInterceptors, c0Var.j0());
            this.eventListenerFactory = c0Var.getEventListenerFactory();
            this.retryOnConnectionFailure = c0Var.s0();
            this.authenticator = c0Var.getAuthenticator();
            this.followRedirects = c0Var.getFollowRedirects();
            this.followSslRedirects = c0Var.getFollowSslRedirects();
            this.cookieJar = c0Var.getCookieJar();
            this.cache = c0Var.getCache();
            this.dns = c0Var.getDns();
            this.proxy = c0Var.getProxy();
            this.proxySelector = c0Var.q0();
            this.proxyAuthenticator = c0Var.getProxyAuthenticator();
            this.socketFactory = c0Var.t0();
            this.sslSocketFactoryOrNull = c0Var.sslSocketFactoryOrNull;
            this.x509TrustManagerOrNull = c0Var.getX509TrustManager();
            this.connectionSpecs = c0Var.V();
            this.protocols = c0Var.m0();
            this.hostnameVerifier = c0Var.getHostnameVerifier();
            this.certificatePinner = c0Var.getCertificatePinner();
            this.certificateChainCleaner = c0Var.getCertificateChainCleaner();
            this.callTimeout = c0Var.getCallTimeoutMillis();
            this.connectTimeout = c0Var.getConnectTimeoutMillis();
            this.readTimeout = c0Var.r0();
            this.writeTimeout = c0Var.w0();
            this.pingInterval = c0Var.getPingIntervalMillis();
            this.minWebSocketMessageToCompress = c0Var.getMinWebSocketMessageToCompress();
            this.routeDatabase = c0Var.getRouteDatabase();
        }
    }

    public c0() {
        this(new a());
    }
}
