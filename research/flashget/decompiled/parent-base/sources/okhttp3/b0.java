package okhttp3;

import androidx.collection.p0;
import com.flashget.parentalcontrol.ProtectedSandApp;
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
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.x0;
import okhttp3.e;
import okhttp3.internal.platform.j;
import okhttp3.j0;
import okhttp3.r;
import okhttp3.w;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import ue.c;

/* compiled from: OkHttpClient.kt */
@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 ®\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0003¯\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0007¢\u0006\u0004\b!\u0010 J\u000f\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0007¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020%H\u0007¢\u0006\u0004\b+\u0010'J\u000f\u0010,\u001a\u00020%H\u0007¢\u0006\u0004\b,\u0010'J\u000f\u0010.\u001a\u00020-H\u0007¢\u0006\u0004\b.\u0010/J\u0011\u00101\u001a\u0004\u0018\u000100H\u0007¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0007¢\u0006\u0004\b4\u00105J\u0011\u00107\u001a\u0004\u0018\u000106H\u0007¢\u0006\u0004\b7\u00108J\u000f\u0010:\u001a\u000209H\u0007¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020(H\u0007¢\u0006\u0004\b<\u0010*J\u000f\u0010>\u001a\u00020=H\u0007¢\u0006\u0004\b>\u0010?J\u000f\u0010A\u001a\u00020@H\u0007¢\u0006\u0004\bA\u0010BJ\u0015\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u001dH\u0007¢\u0006\u0004\bD\u0010 J\u0015\u0010F\u001a\b\u0012\u0004\u0012\u00020E0\u001dH\u0007¢\u0006\u0004\bF\u0010 J\u000f\u0010H\u001a\u00020GH\u0007¢\u0006\u0004\bH\u0010IJ\u000f\u0010K\u001a\u00020JH\u0007¢\u0006\u0004\bK\u0010LJ\u000f\u0010N\u001a\u00020MH\u0007¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020MH\u0007¢\u0006\u0004\bP\u0010OJ\u000f\u0010Q\u001a\u00020MH\u0007¢\u0006\u0004\bQ\u0010OJ\u000f\u0010R\u001a\u00020MH\u0007¢\u0006\u0004\bR\u0010OJ\u000f\u0010S\u001a\u00020MH\u0007¢\u0006\u0004\bS\u0010OR\u0017\u0010V\u001a\u00020\u00178G¢\u0006\f\n\u0004\b\u000e\u0010T\u001a\u0004\bU\u0010\u0019R\u0017\u0010Y\u001a\u00020\u001a8G¢\u0006\f\n\u0004\b\u0013\u0010W\u001a\u0004\bX\u0010\u001cR\u001d\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8G¢\u0006\f\n\u0004\b)\u0010Z\u001a\u0004\b[\u0010 R\u001d\u0010^\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8G¢\u0006\f\n\u0004\b1\u0010Z\u001a\u0004\b]\u0010 R\u0017\u0010a\u001a\u00020\"8G¢\u0006\f\n\u0004\bN\u0010_\u001a\u0004\b`\u0010$R\u0017\u0010d\u001a\u00020%8G¢\u0006\f\n\u0004\bK\u0010b\u001a\u0004\bc\u0010'R\u0017\u0010h\u001a\u00020(8G¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010*R\u0017\u0010j\u001a\u00020%8G¢\u0006\f\n\u0004\bP\u0010b\u001a\u0004\bi\u0010'R\u0017\u0010l\u001a\u00020%8G¢\u0006\f\n\u0004\bk\u0010b\u001a\u0004\bb\u0010'R\u0017\u0010o\u001a\u00020-8G¢\u0006\f\n\u0004\b\u001b\u0010m\u001a\u0004\bn\u0010/R\u0019\u0010r\u001a\u0004\u0018\u0001008G¢\u0006\f\n\u0004\bD\u0010p\u001a\u0004\bq\u00102R\u0017\u0010u\u001a\u0002038G¢\u0006\f\n\u0004\b.\u0010s\u001a\u0004\bt\u00105R\u0019\u0010x\u001a\u0004\u0018\u0001068G¢\u0006\f\n\u0004\b\u0018\u0010v\u001a\u0004\bw\u00108R\u0017\u0010{\u001a\u0002098G¢\u0006\f\n\u0004\b4\u0010y\u001a\u0004\bz\u0010;R\u0017\u0010}\u001a\u00020(8G¢\u0006\f\n\u0004\b#\u0010f\u001a\u0004\b|\u0010*R\u0018\u0010\u0080\u0001\u001a\u00020=8G¢\u0006\f\n\u0004\b+\u0010~\u001a\u0004\b\u007f\u0010?R\u0018\u0010\u0082\u0001\u001a\u0004\u0018\u00010@8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b,\u0010\u0081\u0001R\u001e\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0083\u00018G¢\u0006\u000f\n\u0005\bH\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001f\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020C0\u001d8G¢\u0006\r\n\u0004\b\u001f\u0010Z\u001a\u0005\b\u0088\u0001\u0010 R\u001f\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020E0\u001d8G¢\u0006\r\n\u0004\b!\u0010Z\u001a\u0005\b\u008a\u0001\u0010 R\u001a\u0010\u008e\u0001\u001a\u00020G8G¢\u0006\u000e\n\u0005\bS\u0010\u008c\u0001\u001a\u0005\b\u008d\u0001\u0010IR\u001a\u0010\u0091\u0001\u001a\u00020J8G¢\u0006\u000e\n\u0005\bF\u0010\u008f\u0001\u001a\u0005\b\u0090\u0001\u0010LR\u001f\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0092\u00018G¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001a\u0010\u009a\u0001\u001a\u00020M8G¢\u0006\u000e\n\u0005\b7\u0010\u0098\u0001\u001a\u0005\b\u0099\u0001\u0010OR\u001a\u0010\u009c\u0001\u001a\u00020M8G¢\u0006\u000e\n\u0005\b<\u0010\u0098\u0001\u001a\u0005\b\u009b\u0001\u0010OR\u001a\u0010\u009e\u0001\u001a\u00020M8G¢\u0006\u000e\n\u0005\b:\u0010\u0098\u0001\u001a\u0005\b\u009d\u0001\u0010OR\u001a\u0010 \u0001\u001a\u00020M8G¢\u0006\u000e\n\u0005\bQ\u0010\u0098\u0001\u001a\u0005\b\u009f\u0001\u0010OR\u001a\u0010¢\u0001\u001a\u00020M8G¢\u0006\u000e\n\u0005\b&\u0010\u0098\u0001\u001a\u0005\b¡\u0001\u0010OR\u001b\u0010¦\u0001\u001a\u00030£\u00018G¢\u0006\u000e\n\u0004\b>\u0010g\u001a\u0006\b¤\u0001\u0010¥\u0001R\u001c\u0010«\u0001\u001a\u00030§\u00018\u0006¢\u0006\u000f\n\u0005\bA\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001R\u0013\u0010\u00ad\u0001\u001a\u00020@8G¢\u0006\u0007\u001a\u0005\b¬\u0001\u0010B¨\u0006°\u0001"}, d2 = {"Lokhttp3/b0;", "", "Lokhttp3/e$a;", "Lokhttp3/j0$a;", "Lokhttp3/b0$a;", "builder", "<init>", "(Lokhttp3/b0$a;)V", "()V", "Lkotlin/k2;", "s0", "Lokhttp3/d0;", "request", "Lokhttp3/e;", "b", "(Lokhttp3/d0;)Lokhttp3/e;", "Lokhttp3/k0;", "listener", "Lokhttp3/j0;", "c", "(Lokhttp3/d0;Lokhttp3/k0;)Lokhttp3/j0;", "f0", "()Lokhttp3/b0$a;", "Lokhttp3/p;", "n", "()Lokhttp3/p;", "Lokhttp3/k;", "k", "()Lokhttp3/k;", "", "Lokhttp3/w;", "t", "()Ljava/util/List;", "u", "Lokhttp3/r$c;", "p", "()Lokhttp3/r$c;", "", "C", "()Z", "Lokhttp3/b;", "d", "()Lokhttp3/b;", "q", "r", "Lokhttp3/n;", "m", "()Lokhttp3/n;", "Lokhttp3/c;", "e", "()Lokhttp3/c;", "Lokhttp3/q;", "o", "()Lokhttp3/q;", "Ljava/net/Proxy;", "y", "()Ljava/net/Proxy;", "Ljava/net/ProxySelector;", "A", "()Ljava/net/ProxySelector;", "z", "Ljavax/net/SocketFactory;", "D", "()Ljavax/net/SocketFactory;", "Ljavax/net/ssl/SSLSocketFactory;", "E", "()Ljavax/net/ssl/SSLSocketFactory;", "Lokhttp3/l;", "l", "Lokhttp3/c0;", "w", "Ljavax/net/ssl/HostnameVerifier;", "s", "()Ljavax/net/ssl/HostnameVerifier;", "Lokhttp3/g;", "g", "()Lokhttp3/g;", "", "f", "()I", "i", "B", "F", "v", "Lokhttp3/p;", "U", "dispatcher", "Lokhttp3/k;", "R", "connectionPool", "Ljava/util/List;", "c0", "interceptors", "e0", "networkInterceptors", "Lokhttp3/r$c;", "W", "eventListenerFactory", "Z", "o0", "retryOnConnectionFailure", "h", "Lokhttp3/b;", "J", "authenticator", "Y", "followRedirects", "j", "followSslRedirects", "Lokhttp3/n;", "T", "cookieJar", "Lokhttp3/c;", "K", "cache", "Lokhttp3/q;", "V", "dns", "Ljava/net/Proxy;", "i0", "proxy", "Ljava/net/ProxySelector;", "l0", "proxySelector", "k0", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "p0", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactoryOrNull", "Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/X509TrustManager;", "u0", "()Ljavax/net/ssl/X509TrustManager;", "x509TrustManager", "S", "connectionSpecs", "h0", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "b0", "hostnameVerifier", "Lokhttp3/g;", "O", "certificatePinner", "Lue/c;", "x", "Lue/c;", "N", "()Lue/c;", "certificateChainCleaner", "I", "M", "callTimeoutMillis", "P", "connectTimeoutMillis", "m0", "readTimeoutMillis", "t0", "writeTimeoutMillis", "g0", "pingIntervalMillis", "", "d0", "()J", "minWebSocketMessageToCompress", "Lokhttp3/internal/connection/i;", "Lokhttp3/internal/connection/i;", "a0", "()Lokhttp3/internal/connection/i;", "routeDatabase", "q0", "sslSocketFactory", "H", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public class b0 implements Cloneable, e.a, j0.a {

    /* renamed from: A, reason: from kotlin metadata */
    private final int readTimeoutMillis;

    /* renamed from: B, reason: from kotlin metadata */
    private final int writeTimeoutMillis;

    /* renamed from: C, reason: from kotlin metadata */
    private final int pingIntervalMillis;

    /* renamed from: D, reason: from kotlin metadata */
    private final long minWebSocketMessageToCompress;

    /* renamed from: E, reason: from kotlin metadata */
    @fg.l
    private final okhttp3.internal.connection.i routeDatabase;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final p dispatcher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k connectionPool;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<w> interceptors;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<w> networkInterceptors;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final r.c eventListenerFactory;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean retryOnConnectionFailure;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b authenticator;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean followRedirects;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean followSslRedirects;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final n cookieJar;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final c cache;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final q dns;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Proxy proxy;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ProxySelector proxySelector;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b proxyAuthenticator;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final SocketFactory socketFactory;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final SSLSocketFactory sslSocketFactoryOrNull;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final X509TrustManager x509TrustManager;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<l> connectionSpecs;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<c0> protocols;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final HostnameVerifier hostnameVerifier;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final g certificatePinner;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ue.c certificateChainCleaner;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final int callTimeoutMillis;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final int connectTimeoutMillis;

    /* renamed from: H, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    @fg.l
    private static final List<c0> F = okhttp3.internal.d.z(c0.HTTP_2, c0.HTTP_1_1);

    @fg.l
    private static final List<l> G = okhttp3.internal.d.z(l.f85006h, l.f85008j);

    /* compiled from: OkHttpClient.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lokhttp3/b0$b;", "", "<init>", "()V", "", "Lokhttp3/c0;", "DEFAULT_PROTOCOLS", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lokhttp3/l;", "DEFAULT_CONNECTION_SPECS", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.b0$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final List<l> a() {
            return b0.G;
        }

        @fg.l
        public final List<c0> b() {
            return b0.F;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public b0(@fg.l a aVar) {
        ProxySelector proxySelector;
        l0.p(aVar, ProtectedSandApp.s("鹕\u0001"));
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
            proxySelector = te.a.f91920a;
        } else {
            proxySelector = aVar.getProxySelector();
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = te.a.f91920a;
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
        List<l> list = C;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).getIsTls()) {
                    if (aVar.getSslSocketFactoryOrNull() != null) {
                        this.sslSocketFactoryOrNull = aVar.getSslSocketFactoryOrNull();
                        ue.c certificateChainCleaner = aVar.getCertificateChainCleaner();
                        l0.m(certificateChainCleaner);
                        this.certificateChainCleaner = certificateChainCleaner;
                        X509TrustManager x509TrustManagerOrNull = aVar.getX509TrustManagerOrNull();
                        l0.m(x509TrustManagerOrNull);
                        this.x509TrustManager = x509TrustManagerOrNull;
                        g certificatePinner = aVar.getCertificatePinner();
                        l0.m(certificateChainCleaner);
                        this.certificatePinner = certificatePinner.j(certificateChainCleaner);
                    } else {
                        j.Companion companion = okhttp3.internal.platform.j.INSTANCE;
                        companion.getClass();
                        X509TrustManager r4 = okhttp3.internal.platform.j.f84863a.r();
                        this.x509TrustManager = r4;
                        companion.getClass();
                        okhttp3.internal.platform.j jVar = okhttp3.internal.platform.j.f84863a;
                        l0.m(r4);
                        this.sslSocketFactoryOrNull = jVar.q(r4);
                        c.Companion companion2 = ue.c.INSTANCE;
                        l0.m(r4);
                        ue.c a5 = companion2.a(r4);
                        this.certificateChainCleaner = a5;
                        g certificatePinner2 = aVar.getCertificatePinner();
                        l0.m(a5);
                        this.certificatePinner = certificatePinner2.j(a5);
                    }
                    s0();
                }
            }
        }
        this.sslSocketFactoryOrNull = null;
        this.certificateChainCleaner = null;
        this.x509TrustManager = null;
        this.certificatePinner = g.f84125c;
        s0();
    }

    private final void s0() {
        List<w> list = this.interceptors;
        String s4 = ProtectedSandApp.s("鹖\u0001");
        if (list == null) {
            throw new NullPointerException(s4);
        }
        if (list.contains(null)) {
            throw new IllegalStateException((ProtectedSandApp.s("鹜\u0001") + this.interceptors).toString());
        }
        List<w> list2 = this.networkInterceptors;
        if (list2 == null) {
            throw new NullPointerException(s4);
        }
        if (list2.contains(null)) {
            throw new IllegalStateException((ProtectedSandApp.s("鹛\u0001") + this.networkInterceptors).toString());
        }
        List<l> list3 = this.connectionSpecs;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).getIsTls()) {
                    if (this.sslSocketFactoryOrNull == null) {
                        throw new IllegalStateException(ProtectedSandApp.s("鹙\u0001"));
                    }
                    if (this.certificateChainCleaner == null) {
                        throw new IllegalStateException(ProtectedSandApp.s("鹘\u0001"));
                    }
                    if (this.x509TrustManager == null) {
                        throw new IllegalStateException(ProtectedSandApp.s("鹗\u0001"));
                    }
                    return;
                }
            }
        }
        boolean z4 = this.sslSocketFactoryOrNull == null;
        String s5 = ProtectedSandApp.s("鹚\u0001");
        if (!z4) {
            throw new IllegalStateException(s5);
        }
        if (!(this.certificateChainCleaner == null)) {
            throw new IllegalStateException(s5);
        }
        if (!(this.x509TrustManager == null)) {
            throw new IllegalStateException(s5);
        }
        if (!l0.g(this.certificatePinner, g.f84125c)) {
            throw new IllegalStateException(s5);
        }
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "proxySelector", imports = {}))
    @kd.i(name = "-deprecated_proxySelector")
    /* renamed from: A, reason: from getter */
    public final ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "readTimeoutMillis", imports = {}))
    @kd.i(name = "-deprecated_readTimeoutMillis")
    /* renamed from: B, reason: from getter */
    public final int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "retryOnConnectionFailure", imports = {}))
    @kd.i(name = "-deprecated_retryOnConnectionFailure")
    /* renamed from: C, reason: from getter */
    public final boolean getRetryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "socketFactory", imports = {}))
    @kd.i(name = "-deprecated_socketFactory")
    /* renamed from: D, reason: from getter */
    public final SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "sslSocketFactory", imports = {}))
    @kd.i(name = "-deprecated_sslSocketFactory")
    public final SSLSocketFactory E() {
        return q0();
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "writeTimeoutMillis", imports = {}))
    @kd.i(name = "-deprecated_writeTimeoutMillis")
    /* renamed from: F, reason: from getter */
    public final int getWriteTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    @fg.l
    @kd.i(name = "authenticator")
    /* renamed from: J, reason: from getter */
    public final b getAuthenticator() {
        return this.authenticator;
    }

    @fg.m
    @kd.i(name = "cache")
    /* renamed from: K, reason: from getter */
    public final c getCache() {
        return this.cache;
    }

    @kd.i(name = "callTimeoutMillis")
    /* renamed from: M, reason: from getter */
    public final int getCallTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    @fg.m
    @kd.i(name = "certificateChainCleaner")
    /* renamed from: N, reason: from getter */
    public final ue.c getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    @fg.l
    @kd.i(name = "certificatePinner")
    /* renamed from: O, reason: from getter */
    public final g getCertificatePinner() {
        return this.certificatePinner;
    }

    @kd.i(name = "connectTimeoutMillis")
    /* renamed from: P, reason: from getter */
    public final int getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @fg.l
    @kd.i(name = "connectionPool")
    /* renamed from: R, reason: from getter */
    public final k getConnectionPool() {
        return this.connectionPool;
    }

    @fg.l
    @kd.i(name = "connectionSpecs")
    public final List<l> S() {
        return this.connectionSpecs;
    }

    @fg.l
    @kd.i(name = "cookieJar")
    /* renamed from: T, reason: from getter */
    public final n getCookieJar() {
        return this.cookieJar;
    }

    @fg.l
    @kd.i(name = "dispatcher")
    /* renamed from: U, reason: from getter */
    public final p getDispatcher() {
        return this.dispatcher;
    }

    @fg.l
    @kd.i(name = "dns")
    /* renamed from: V, reason: from getter */
    public final q getDns() {
        return this.dns;
    }

    @fg.l
    @kd.i(name = "eventListenerFactory")
    /* renamed from: W, reason: from getter */
    public final r.c getEventListenerFactory() {
        return this.eventListenerFactory;
    }

    @kd.i(name = "followRedirects")
    /* renamed from: Y, reason: from getter */
    public final boolean getFollowRedirects() {
        return this.followRedirects;
    }

    @kd.i(name = "followSslRedirects")
    /* renamed from: Z, reason: from getter */
    public final boolean getFollowSslRedirects() {
        return this.followSslRedirects;
    }

    @fg.l
    /* renamed from: a0, reason: from getter */
    public final okhttp3.internal.connection.i getRouteDatabase() {
        return this.routeDatabase;
    }

    @Override // okhttp3.e.a
    @fg.l
    public e b(@fg.l d0 request) {
        l0.p(request, ProtectedSandApp.s("鹝\u0001"));
        return new okhttp3.internal.connection.e(this, request, false);
    }

    @fg.l
    @kd.i(name = "hostnameVerifier")
    /* renamed from: b0, reason: from getter */
    public final HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    @Override // okhttp3.j0.a
    @fg.l
    public j0 c(@fg.l d0 request, @fg.l k0 listener) {
        l0.p(request, ProtectedSandApp.s("鹝\u0001"));
        l0.p(listener, ProtectedSandApp.s("鹞\u0001"));
        okhttp3.internal.ws.e eVar = new okhttp3.internal.ws.e(okhttp3.internal.concurrent.d.f84336h, request, listener, new Random(), this.pingIntervalMillis, null, this.minWebSocketMessageToCompress);
        eVar.t(this);
        return eVar;
    }

    @fg.l
    @kd.i(name = "interceptors")
    public final List<w> c0() {
        return this.interceptors;
    }

    @fg.l
    public Object clone() {
        return super.clone();
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "authenticator", imports = {}))
    @kd.i(name = "-deprecated_authenticator")
    public final b d() {
        return this.authenticator;
    }

    @kd.i(name = "minWebSocketMessageToCompress")
    /* renamed from: d0, reason: from getter */
    public final long getMinWebSocketMessageToCompress() {
        return this.minWebSocketMessageToCompress;
    }

    @fg.m
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "cache", imports = {}))
    @kd.i(name = "-deprecated_cache")
    public final c e() {
        return this.cache;
    }

    @fg.l
    @kd.i(name = "networkInterceptors")
    public final List<w> e0() {
        return this.networkInterceptors;
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "callTimeoutMillis", imports = {}))
    @kd.i(name = "-deprecated_callTimeoutMillis")
    public final int f() {
        return this.callTimeoutMillis;
    }

    @fg.l
    public a f0() {
        return new a(this);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "certificatePinner", imports = {}))
    @kd.i(name = "-deprecated_certificatePinner")
    public final g g() {
        return this.certificatePinner;
    }

    @kd.i(name = "pingIntervalMillis")
    /* renamed from: g0, reason: from getter */
    public final int getPingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    @fg.l
    @kd.i(name = "protocols")
    public final List<c0> h0() {
        return this.protocols;
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "connectTimeoutMillis", imports = {}))
    @kd.i(name = "-deprecated_connectTimeoutMillis")
    public final int i() {
        return this.connectTimeoutMillis;
    }

    @fg.m
    @kd.i(name = "proxy")
    /* renamed from: i0, reason: from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "connectionPool", imports = {}))
    @kd.i(name = "-deprecated_connectionPool")
    public final k k() {
        return this.connectionPool;
    }

    @fg.l
    @kd.i(name = "proxyAuthenticator")
    /* renamed from: k0, reason: from getter */
    public final b getProxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "connectionSpecs", imports = {}))
    @kd.i(name = "-deprecated_connectionSpecs")
    public final List<l> l() {
        return this.connectionSpecs;
    }

    @fg.l
    @kd.i(name = "proxySelector")
    public final ProxySelector l0() {
        return this.proxySelector;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "cookieJar", imports = {}))
    @kd.i(name = "-deprecated_cookieJar")
    public final n m() {
        return this.cookieJar;
    }

    @kd.i(name = "readTimeoutMillis")
    public final int m0() {
        return this.readTimeoutMillis;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "dispatcher", imports = {}))
    @kd.i(name = "-deprecated_dispatcher")
    public final p n() {
        return this.dispatcher;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "dns", imports = {}))
    @kd.i(name = "-deprecated_dns")
    public final q o() {
        return this.dns;
    }

    @kd.i(name = "retryOnConnectionFailure")
    public final boolean o0() {
        return this.retryOnConnectionFailure;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "eventListenerFactory", imports = {}))
    @kd.i(name = "-deprecated_eventListenerFactory")
    public final r.c p() {
        return this.eventListenerFactory;
    }

    @fg.l
    @kd.i(name = "socketFactory")
    public final SocketFactory p0() {
        return this.socketFactory;
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "followRedirects", imports = {}))
    @kd.i(name = "-deprecated_followRedirects")
    public final boolean q() {
        return this.followRedirects;
    }

    @fg.l
    @kd.i(name = "sslSocketFactory")
    public final SSLSocketFactory q0() {
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactoryOrNull;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException(ProtectedSandApp.s("鹟\u0001"));
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "followSslRedirects", imports = {}))
    @kd.i(name = "-deprecated_followSslRedirects")
    public final boolean r() {
        return this.followSslRedirects;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "hostnameVerifier", imports = {}))
    @kd.i(name = "-deprecated_hostnameVerifier")
    public final HostnameVerifier s() {
        return this.hostnameVerifier;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "interceptors", imports = {}))
    @kd.i(name = "-deprecated_interceptors")
    public final List<w> t() {
        return this.interceptors;
    }

    @kd.i(name = "writeTimeoutMillis")
    public final int t0() {
        return this.writeTimeoutMillis;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "networkInterceptors", imports = {}))
    @kd.i(name = "-deprecated_networkInterceptors")
    public final List<w> u() {
        return this.networkInterceptors;
    }

    @fg.m
    @kd.i(name = "x509TrustManager")
    /* renamed from: u0, reason: from getter */
    public final X509TrustManager getX509TrustManager() {
        return this.x509TrustManager;
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "pingIntervalMillis", imports = {}))
    @kd.i(name = "-deprecated_pingIntervalMillis")
    public final int v() {
        return this.pingIntervalMillis;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "protocols", imports = {}))
    @kd.i(name = "-deprecated_protocols")
    public final List<c0> w() {
        return this.protocols;
    }

    @fg.m
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "proxy", imports = {}))
    @kd.i(name = "-deprecated_proxy")
    public final Proxy y() {
        return this.proxy;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "proxyAuthenticator", imports = {}))
    @kd.i(name = "-deprecated_proxyAuthenticator")
    public final b z() {
        return this.proxyAuthenticator;
    }

    /* compiled from: OkHttpClient.kt */
    @Metadata(d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bn\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J8\u0010\u001d\u001a\u00020\u00002#\b\u0004\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u001b0\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u001f\u0010\u0012J\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b \u0010\u0015J8\u0010!\u001a\u00020\u00002#\b\u0004\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u001b0\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b!\u0010\u001eJ\u0015\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0015\u00100\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020\u00002\u0006\u00102\u001a\u00020*¢\u0006\u0004\b3\u0010-J\u0015\u00105\u001a\u00020\u00002\u0006\u00104\u001a\u00020*¢\u0006\u0004\b5\u0010-J\u0015\u00108\u001a\u00020\u00002\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\u00002\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b<\u0010=J\u0015\u0010@\u001a\u00020\u00002\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u00020\u00002\b\u0010C\u001a\u0004\u0018\u00010B¢\u0006\u0004\bD\u0010EJ\u0015\u0010H\u001a\u00020\u00002\u0006\u0010G\u001a\u00020F¢\u0006\u0004\bH\u0010IJ\u0015\u0010K\u001a\u00020\u00002\u0006\u0010J\u001a\u00020.¢\u0006\u0004\bK\u00101J\u0015\u0010N\u001a\u00020\u00002\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bN\u0010OJ\u0017\u0010R\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020PH\u0007¢\u0006\u0004\bR\u0010SJ\u001d\u0010V\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020P2\u0006\u0010U\u001a\u00020T¢\u0006\u0004\bV\u0010WJ\u001b\u0010[\u001a\u00020\u00002\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0X¢\u0006\u0004\b[\u0010\\J\u001b\u0010_\u001a\u00020\u00002\f\u0010^\u001a\b\u0012\u0004\u0012\u00020]0X¢\u0006\u0004\b_\u0010\\J\u0015\u0010b\u001a\u00020\u00002\u0006\u0010a\u001a\u00020`¢\u0006\u0004\bb\u0010cJ\u0015\u0010f\u001a\u00020\u00002\u0006\u0010e\u001a\u00020d¢\u0006\u0004\bf\u0010gJ\u001d\u0010l\u001a\u00020\u00002\u0006\u0010i\u001a\u00020h2\u0006\u0010k\u001a\u00020j¢\u0006\u0004\bl\u0010mJ\u0017\u0010p\u001a\u00020\u00002\u0006\u0010o\u001a\u00020nH\u0007¢\u0006\u0004\bp\u0010qJ\u001d\u0010r\u001a\u00020\u00002\u0006\u0010i\u001a\u00020h2\u0006\u0010k\u001a\u00020j¢\u0006\u0004\br\u0010mJ\u0017\u0010s\u001a\u00020\u00002\u0006\u0010o\u001a\u00020nH\u0007¢\u0006\u0004\bs\u0010qJ\u001d\u0010t\u001a\u00020\u00002\u0006\u0010i\u001a\u00020h2\u0006\u0010k\u001a\u00020j¢\u0006\u0004\bt\u0010mJ\u0017\u0010u\u001a\u00020\u00002\u0006\u0010o\u001a\u00020nH\u0007¢\u0006\u0004\bu\u0010qJ\u001d\u0010v\u001a\u00020\u00002\u0006\u0010i\u001a\u00020h2\u0006\u0010k\u001a\u00020j¢\u0006\u0004\bv\u0010mJ\u0017\u0010w\u001a\u00020\u00002\u0006\u0010o\u001a\u00020nH\u0007¢\u0006\u0004\bw\u0010qJ\u001d\u0010y\u001a\u00020\u00002\u0006\u0010x\u001a\u00020h2\u0006\u0010k\u001a\u00020j¢\u0006\u0004\by\u0010mJ\u0017\u0010z\u001a\u00020\u00002\u0006\u0010o\u001a\u00020nH\u0007¢\u0006\u0004\bz\u0010qJ\u0015\u0010|\u001a\u00020\u00002\u0006\u0010{\u001a\u00020h¢\u0006\u0004\b|\u0010}J\r\u0010~\u001a\u00020\u0004¢\u0006\u0004\b~\u0010\u007fR'\u0010\b\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u001d\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R'\u0010\f\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b!\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R#\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0000X\u0080\u0004¢\u0006\u000e\n\u0005\b\u0014\u0010\u008a\u0001\u001a\u0005\b\u008b\u0001\u0010\u0012R#\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0000X\u0080\u0004¢\u0006\u000e\n\u0005\b \u0010\u008a\u0001\u001a\u0005\b\u008d\u0001\u0010\u0012R'\u0010'\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b0\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R&\u0010+\u001a\u00020*8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0004\b~\u0010b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R'\u0010/\u001a\u00020.8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b<\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R&\u00102\u001a\u00020*8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0004\bl\u0010b\u001a\u0006\b\u009d\u0001\u0010\u0095\u0001\"\u0006\b\u009e\u0001\u0010\u0097\u0001R'\u0010¡\u0001\u001a\u00020*8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0004\bp\u0010b\u001a\u0006\b\u009f\u0001\u0010\u0095\u0001\"\u0006\b \u0001\u0010\u0097\u0001R'\u00107\u001a\u0002068\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bf\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R)\u0010;\u001a\u0004\u0018\u00010:8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\br\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R'\u0010?\u001a\u00020>8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bs\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R)\u0010C\u001a\u0004\u0018\u00010B8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\r\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R)\u0010G\u001a\u0004\u0018\u00010F8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b[\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R'\u0010J\u001a\u00020.8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b8\u0010\u0098\u0001\u001a\u0006\b»\u0001\u0010\u009a\u0001\"\u0006\b¼\u0001\u0010\u009c\u0001R'\u0010M\u001a\u00020L8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\t\u0010½\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0006\bÀ\u0001\u0010Á\u0001R*\u0010Ç\u0001\u001a\u0004\u0018\u00010P8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b@\u0010Â\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001\"\u0006\bÅ\u0001\u0010Æ\u0001R*\u0010Í\u0001\u001a\u0004\u0018\u00010T8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b$\u0010È\u0001\u001a\u0006\bÉ\u0001\u0010Ê\u0001\"\u0006\bË\u0001\u0010Ì\u0001R,\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0X8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b(\u0010\u008a\u0001\u001a\u0005\bÎ\u0001\u0010\u0012\"\u0006\bÏ\u0001\u0010Ð\u0001R,\u0010^\u001a\b\u0012\u0004\u0012\u00020]0X8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b3\u0010\u008a\u0001\u001a\u0005\bÑ\u0001\u0010\u0012\"\u0006\bÒ\u0001\u0010Ð\u0001R'\u0010a\u001a\u00020`8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b5\u0010Ó\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001\"\u0006\bÖ\u0001\u0010×\u0001R(\u0010e\u001a\u00020d8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010Ø\u0001\u001a\u0006\bÙ\u0001\u0010Ú\u0001\"\u0006\bÛ\u0001\u0010Ü\u0001R,\u0010ã\u0001\u001a\u0005\u0018\u00010Ý\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¨\u0001\u0010Þ\u0001\u001a\u0006\bß\u0001\u0010à\u0001\"\u0006\bá\u0001\u0010â\u0001R*\u0010é\u0001\u001a\u00030ä\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bå\u0001\u0010\u009f\u0001\u001a\u0006\bå\u0001\u0010æ\u0001\"\u0006\bç\u0001\u0010è\u0001R*\u0010ì\u0001\u001a\u00030ä\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bß\u0001\u0010\u009f\u0001\u001a\u0006\bê\u0001\u0010æ\u0001\"\u0006\bë\u0001\u0010è\u0001R*\u0010ï\u0001\u001a\u00030ä\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÙ\u0001\u0010\u009f\u0001\u001a\u0006\bí\u0001\u0010æ\u0001\"\u0006\bî\u0001\u0010è\u0001R*\u0010ò\u0001\u001a\u00030ä\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bê\u0001\u0010\u009f\u0001\u001a\u0006\bð\u0001\u0010æ\u0001\"\u0006\bñ\u0001\u0010è\u0001R*\u0010õ\u0001\u001a\u00030ä\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u009f\u0001\u001a\u0006\bó\u0001\u0010æ\u0001\"\u0006\bô\u0001\u0010è\u0001R)\u0010ú\u0001\u001a\u00020h8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÎ\u0001\u0010Ô\u0001\u001a\u0006\bö\u0001\u0010÷\u0001\"\u0006\bø\u0001\u0010ù\u0001R,\u0010\u0081\u0002\u001a\u0005\u0018\u00010û\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b£\u0001\u0010ü\u0001\u001a\u0006\bý\u0001\u0010þ\u0001\"\u0006\bÿ\u0001\u0010\u0080\u0002\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0082\u0002"}, d2 = {"Lokhttp3/b0$a;", "", "<init>", "()V", "Lokhttp3/b0;", "okHttpClient", "(Lokhttp3/b0;)V", "Lokhttp3/p;", "dispatcher", "p", "(Lokhttp3/p;)Lokhttp3/b0$a;", "Lokhttp3/k;", "connectionPool", "m", "(Lokhttp3/k;)Lokhttp3/b0$a;", "", "Lokhttp3/w;", "a0", "()Ljava/util/List;", "interceptor", "c", "(Lokhttp3/w;)Lokhttp3/b0$a;", "Lkotlin/Function1;", "Lokhttp3/w$a;", "Lkotlin/r0;", "name", "chain", "Lokhttp3/f0;", "block", "a", "(Lld/l;)Lokhttp3/b0$a;", "c0", "d", "b", "Lokhttp3/r;", "eventListener", "r", "(Lokhttp3/r;)Lokhttp3/b0$a;", "Lokhttp3/r$c;", "eventListenerFactory", "s", "(Lokhttp3/r$c;)Lokhttp3/b0$a;", "", "retryOnConnectionFailure", "l0", "(Z)Lokhttp3/b0$a;", "Lokhttp3/b;", "authenticator", "e", "(Lokhttp3/b;)Lokhttp3/b0$a;", "followRedirects", "t", "followProtocolRedirects", "u", "Lokhttp3/n;", "cookieJar", "o", "(Lokhttp3/n;)Lokhttp3/b0$a;", "Lokhttp3/c;", "cache", "g", "(Lokhttp3/c;)Lokhttp3/b0$a;", "Lokhttp3/q;", "dns", "q", "(Lokhttp3/q;)Lokhttp3/b0$a;", "Ljava/net/Proxy;", "proxy", "g0", "(Ljava/net/Proxy;)Lokhttp3/b0$a;", "Ljava/net/ProxySelector;", "proxySelector", "i0", "(Ljava/net/ProxySelector;)Lokhttp3/b0$a;", "proxyAuthenticator", "h0", "Ljavax/net/SocketFactory;", "socketFactory", "O0", "(Ljavax/net/SocketFactory;)Lokhttp3/b0$a;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "P0", "(Ljavax/net/ssl/SSLSocketFactory;)Lokhttp3/b0$a;", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Q0", "(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)Lokhttp3/b0$a;", "", "Lokhttp3/l;", "connectionSpecs", "n", "(Ljava/util/List;)Lokhttp3/b0$a;", "Lokhttp3/c0;", "protocols", "f0", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Z", "(Ljavax/net/ssl/HostnameVerifier;)Lokhttp3/b0$a;", "Lokhttp3/g;", "certificatePinner", "j", "(Lokhttp3/g;)Lokhttp3/b0$a;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "h", "(JLjava/util/concurrent/TimeUnit;)Lokhttp3/b0$a;", "Ljava/time/Duration;", "duration", "i", "(Ljava/time/Duration;)Lokhttp3/b0$a;", "k", "l", "j0", "k0", "R0", "S0", "interval", "d0", "e0", "bytes", "b0", "(J)Lokhttp3/b0$a;", "f", "()Lokhttp3/b0;", "Lokhttp3/p;", "E", "()Lokhttp3/p;", "v0", "(Lokhttp3/p;)V", "Lokhttp3/k;", "B", "()Lokhttp3/k;", "s0", "(Lokhttp3/k;)V", "Ljava/util/List;", "K", "interceptors", "M", "networkInterceptors", "Lokhttp3/r$c;", "G", "()Lokhttp3/r$c;", "x0", "(Lokhttp3/r$c;)V", "T", "()Z", "I0", "(Z)V", "Lokhttp3/b;", "v", "()Lokhttp3/b;", "m0", "(Lokhttp3/b;)V", "H", "y0", "I", "z0", "followSslRedirects", "Lokhttp3/n;", "D", "()Lokhttp3/n;", "u0", "(Lokhttp3/n;)V", "Lokhttp3/c;", "w", "()Lokhttp3/c;", "n0", "(Lokhttp3/c;)V", "Lokhttp3/q;", "F", "()Lokhttp3/q;", "w0", "(Lokhttp3/q;)V", "Ljava/net/Proxy;", "P", "()Ljava/net/Proxy;", "E0", "(Ljava/net/Proxy;)V", "Ljava/net/ProxySelector;", "R", "()Ljava/net/ProxySelector;", "G0", "(Ljava/net/ProxySelector;)V", "Q", "F0", "Ljavax/net/SocketFactory;", "V", "()Ljavax/net/SocketFactory;", "K0", "(Ljavax/net/SocketFactory;)V", "Ljavax/net/ssl/SSLSocketFactory;", "W", "()Ljavax/net/ssl/SSLSocketFactory;", "L0", "(Ljavax/net/ssl/SSLSocketFactory;)V", "sslSocketFactoryOrNull", "Ljavax/net/ssl/X509TrustManager;", "Y", "()Ljavax/net/ssl/X509TrustManager;", "N0", "(Ljavax/net/ssl/X509TrustManager;)V", "x509TrustManagerOrNull", "C", "t0", "(Ljava/util/List;)V", "O", "D0", "Ljavax/net/ssl/HostnameVerifier;", "J", "()Ljavax/net/ssl/HostnameVerifier;", "A0", "(Ljavax/net/ssl/HostnameVerifier;)V", "Lokhttp3/g;", "z", "()Lokhttp3/g;", "q0", "(Lokhttp3/g;)V", "Lue/c;", "Lue/c;", "y", "()Lue/c;", "p0", "(Lue/c;)V", "certificateChainCleaner", "", "x", "()I", "o0", "(I)V", "callTimeout", "A", "r0", "connectTimeout", "S", "H0", "readTimeout", "X", "M0", "writeTimeout", "N", "C0", "pingInterval", "L", "()J", "B0", "(J)V", "minWebSocketMessageToCompress", "Lokhttp3/internal/connection/i;", "Lokhttp3/internal/connection/i;", "U", "()Lokhttp3/internal/connection/i;", "J0", "(Lokhttp3/internal/connection/i;)V", "routeDatabase", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* renamed from: A, reason: from kotlin metadata */
        private int writeTimeout;

        /* renamed from: B, reason: from kotlin metadata */
        private int pingInterval;

        /* renamed from: C, reason: from kotlin metadata */
        private long minWebSocketMessageToCompress;

        /* renamed from: D, reason: from kotlin metadata */
        @fg.m
        private okhttp3.internal.connection.i routeDatabase;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private p dispatcher;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private k connectionPool;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final List<w> interceptors;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final List<w> networkInterceptors;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private r.c eventListenerFactory;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean retryOnConnectionFailure;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private okhttp3.b authenticator;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean followRedirects;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private boolean followSslRedirects;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private n cookieJar;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private c cache;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private q dns;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private Proxy proxy;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private ProxySelector proxySelector;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private okhttp3.b proxyAuthenticator;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private SocketFactory socketFactory;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private SSLSocketFactory sslSocketFactoryOrNull;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private X509TrustManager x509TrustManagerOrNull;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private List<l> connectionSpecs;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private List<? extends c0> protocols;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private HostnameVerifier hostnameVerifier;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private g certificatePinner;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private ue.c certificateChainCleaner;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata */
        private int callTimeout;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata */
        private int connectTimeout;

        /* renamed from: z, reason: collision with root package name and from kotlin metadata */
        private int readTimeout;

        /* compiled from: OkHttpClient.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lokhttp3/w$a;", "chain", "Lokhttp3/f0;", "intercept", "(Lokhttp3/w$a;)Lokhttp3/f0;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        /* renamed from: okhttp3.b0$a$a, reason: collision with other inner class name */
        public static final class C1306a implements w {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.l f84013b;

            public C1306a(ld.l lVar) {
                this.f84013b = lVar;
            }

            @Override // okhttp3.w
            @fg.l
            public final f0 intercept(@fg.l w.a aVar) {
                l0.p(aVar, ProtectedSandApp.s("鸱\u0001"));
                return (f0) this.f84013b.invoke(aVar);
            }
        }

        /* compiled from: OkHttpClient.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lokhttp3/w$a;", "chain", "Lokhttp3/f0;", "intercept", "(Lokhttp3/w$a;)Lokhttp3/f0;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        public static final class b implements w {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.l f84014b;

            public b(ld.l lVar) {
                this.f84014b = lVar;
            }

            @Override // okhttp3.w
            @fg.l
            public final f0 intercept(@fg.l w.a aVar) {
                l0.p(aVar, ProtectedSandApp.s("鸲\u0001"));
                return (f0) this.f84014b.invoke(aVar);
            }
        }

        public a() {
            this.dispatcher = new p();
            this.connectionPool = new k();
            this.interceptors = new ArrayList();
            this.networkInterceptors = new ArrayList();
            this.eventListenerFactory = okhttp3.internal.d.e(r.NONE);
            this.retryOnConnectionFailure = true;
            okhttp3.b bVar = okhttp3.b.f83958a;
            this.authenticator = bVar;
            this.followRedirects = true;
            this.followSslRedirects = true;
            this.cookieJar = n.f85045a;
            this.dns = q.f85056a;
            this.proxyAuthenticator = bVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            l0.o(socketFactory, ProtectedSandApp.s("鸳\u0001"));
            this.socketFactory = socketFactory;
            Companion companion = b0.INSTANCE;
            companion.getClass();
            this.connectionSpecs = b0.G;
            companion.getClass();
            this.protocols = b0.F;
            this.hostnameVerifier = ue.d.f92771c;
            this.certificatePinner = g.f84125c;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
            this.minWebSocketMessageToCompress = 1024L;
        }

        /* renamed from: A, reason: from getter */
        public final int getConnectTimeout() {
            return this.connectTimeout;
        }

        public final void A0(@fg.l HostnameVerifier hostnameVerifier) {
            l0.p(hostnameVerifier, ProtectedSandApp.s("鸵\u0001"));
            this.hostnameVerifier = hostnameVerifier;
        }

        @fg.l
        /* renamed from: B, reason: from getter */
        public final k getConnectionPool() {
            return this.connectionPool;
        }

        public final void B0(long j4) {
            this.minWebSocketMessageToCompress = j4;
        }

        @fg.l
        public final List<l> C() {
            return this.connectionSpecs;
        }

        public final void C0(int i4) {
            this.pingInterval = i4;
        }

        @fg.l
        /* renamed from: D, reason: from getter */
        public final n getCookieJar() {
            return this.cookieJar;
        }

        public final void D0(@fg.l List<? extends c0> list) {
            l0.p(list, ProtectedSandApp.s("鸵\u0001"));
            this.protocols = list;
        }

        @fg.l
        /* renamed from: E, reason: from getter */
        public final p getDispatcher() {
            return this.dispatcher;
        }

        public final void E0(@fg.m Proxy proxy) {
            this.proxy = proxy;
        }

        @fg.l
        /* renamed from: F, reason: from getter */
        public final q getDns() {
            return this.dns;
        }

        public final void F0(@fg.l okhttp3.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("鸵\u0001"));
            this.proxyAuthenticator = bVar;
        }

        @fg.l
        /* renamed from: G, reason: from getter */
        public final r.c getEventListenerFactory() {
            return this.eventListenerFactory;
        }

        public final void G0(@fg.m ProxySelector proxySelector) {
            this.proxySelector = proxySelector;
        }

        /* renamed from: H, reason: from getter */
        public final boolean getFollowRedirects() {
            return this.followRedirects;
        }

        public final void H0(int i4) {
            this.readTimeout = i4;
        }

        /* renamed from: I, reason: from getter */
        public final boolean getFollowSslRedirects() {
            return this.followSslRedirects;
        }

        public final void I0(boolean z4) {
            this.retryOnConnectionFailure = z4;
        }

        @fg.l
        /* renamed from: J, reason: from getter */
        public final HostnameVerifier getHostnameVerifier() {
            return this.hostnameVerifier;
        }

        public final void J0(@fg.m okhttp3.internal.connection.i iVar) {
            this.routeDatabase = iVar;
        }

        @fg.l
        public final List<w> K() {
            return this.interceptors;
        }

        public final void K0(@fg.l SocketFactory socketFactory) {
            l0.p(socketFactory, ProtectedSandApp.s("鸵\u0001"));
            this.socketFactory = socketFactory;
        }

        /* renamed from: L, reason: from getter */
        public final long getMinWebSocketMessageToCompress() {
            return this.minWebSocketMessageToCompress;
        }

        public final void L0(@fg.m SSLSocketFactory sSLSocketFactory) {
            this.sslSocketFactoryOrNull = sSLSocketFactory;
        }

        @fg.l
        public final List<w> M() {
            return this.networkInterceptors;
        }

        public final void M0(int i4) {
            this.writeTimeout = i4;
        }

        /* renamed from: N, reason: from getter */
        public final int getPingInterval() {
            return this.pingInterval;
        }

        public final void N0(@fg.m X509TrustManager x509TrustManager) {
            this.x509TrustManagerOrNull = x509TrustManager;
        }

        @fg.l
        public final List<c0> O() {
            return this.protocols;
        }

        @fg.l
        public final a O0(@fg.l SocketFactory socketFactory) {
            l0.p(socketFactory, ProtectedSandApp.s("鸶\u0001"));
            if (socketFactory instanceof SSLSocketFactory) {
                throw new IllegalArgumentException(ProtectedSandApp.s("鸷\u0001"));
            }
            if (!l0.g(socketFactory, this.socketFactory)) {
                this.routeDatabase = null;
            }
            this.socketFactory = socketFactory;
            return this;
        }

        @fg.m
        /* renamed from: P, reason: from getter */
        public final Proxy getProxy() {
            return this.proxy;
        }

        @fg.l
        @kotlin.k(level = kotlin.m.ERROR, message = "Use the sslSocketFactory overload that accepts a X509TrustManager.")
        public final a P0(@fg.l SSLSocketFactory sslSocketFactory) {
            l0.p(sslSocketFactory, ProtectedSandApp.s("鸸\u0001"));
            if (!l0.g(sslSocketFactory, this.sslSocketFactoryOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sslSocketFactory;
            j.Companion companion = okhttp3.internal.platform.j.INSTANCE;
            companion.getClass();
            X509TrustManager s4 = okhttp3.internal.platform.j.f84863a.s(sslSocketFactory);
            if (s4 == null) {
                StringBuilder sb = new StringBuilder(ProtectedSandApp.s("鸹\u0001"));
                companion.getClass();
                sb.append(okhttp3.internal.platform.j.f84863a);
                sb.append(ProtectedSandApp.s("鸺\u0001"));
                sb.append(sslSocketFactory.getClass());
                throw new IllegalStateException(sb.toString());
            }
            this.x509TrustManagerOrNull = s4;
            companion.getClass();
            okhttp3.internal.platform.j jVar = okhttp3.internal.platform.j.f84863a;
            X509TrustManager x509TrustManager = this.x509TrustManagerOrNull;
            l0.m(x509TrustManager);
            this.certificateChainCleaner = jVar.d(x509TrustManager);
            return this;
        }

        @fg.l
        /* renamed from: Q, reason: from getter */
        public final okhttp3.b getProxyAuthenticator() {
            return this.proxyAuthenticator;
        }

        @fg.l
        public final a Q0(@fg.l SSLSocketFactory sslSocketFactory, @fg.l X509TrustManager trustManager) {
            l0.p(sslSocketFactory, ProtectedSandApp.s("鸸\u0001"));
            l0.p(trustManager, ProtectedSandApp.s("鸻\u0001"));
            if (!l0.g(sslSocketFactory, this.sslSocketFactoryOrNull) || !l0.g(trustManager, this.x509TrustManagerOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sslSocketFactory;
            this.certificateChainCleaner = ue.c.INSTANCE.a(trustManager);
            this.x509TrustManagerOrNull = trustManager;
            return this;
        }

        @fg.m
        /* renamed from: R, reason: from getter */
        public final ProxySelector getProxySelector() {
            return this.proxySelector;
        }

        @fg.l
        public final a R0(long timeout, @fg.l TimeUnit unit) {
            l0.p(unit, ProtectedSandApp.s("鸼\u0001"));
            this.writeTimeout = okhttp3.internal.d.j(ProtectedSandApp.s("鸽\u0001"), timeout, unit);
            return this;
        }

        /* renamed from: S, reason: from getter */
        public final int getReadTimeout() {
            return this.readTimeout;
        }

        @fg.l
        @IgnoreJRERequirement
        public final a S0(@fg.l Duration duration) {
            long millis;
            l0.p(duration, ProtectedSandApp.s("鸾\u0001"));
            millis = duration.toMillis();
            R0(millis, TimeUnit.MILLISECONDS);
            return this;
        }

        /* renamed from: T, reason: from getter */
        public final boolean getRetryOnConnectionFailure() {
            return this.retryOnConnectionFailure;
        }

        @fg.m
        /* renamed from: U, reason: from getter */
        public final okhttp3.internal.connection.i getRouteDatabase() {
            return this.routeDatabase;
        }

        @fg.l
        /* renamed from: V, reason: from getter */
        public final SocketFactory getSocketFactory() {
            return this.socketFactory;
        }

        @fg.m
        /* renamed from: W, reason: from getter */
        public final SSLSocketFactory getSslSocketFactoryOrNull() {
            return this.sslSocketFactoryOrNull;
        }

        /* renamed from: X, reason: from getter */
        public final int getWriteTimeout() {
            return this.writeTimeout;
        }

        @fg.m
        /* renamed from: Y, reason: from getter */
        public final X509TrustManager getX509TrustManagerOrNull() {
            return this.x509TrustManagerOrNull;
        }

        @fg.l
        public final a Z(@fg.l HostnameVerifier hostnameVerifier) {
            l0.p(hostnameVerifier, ProtectedSandApp.s("鸿\u0001"));
            if (!l0.g(hostnameVerifier, this.hostnameVerifier)) {
                this.routeDatabase = null;
            }
            this.hostnameVerifier = hostnameVerifier;
            return this;
        }

        @fg.l
        @kd.i(name = "-addInterceptor")
        public final a a(@fg.l ld.l<? super w.a, f0> block) {
            l0.p(block, ProtectedSandApp.s("鹀\u0001"));
            return c(new C1306a(block));
        }

        @fg.l
        public final List<w> a0() {
            return this.interceptors;
        }

        @fg.l
        @kd.i(name = "-addNetworkInterceptor")
        public final a b(@fg.l ld.l<? super w.a, f0> block) {
            l0.p(block, ProtectedSandApp.s("鹀\u0001"));
            return d(new b(block));
        }

        @fg.l
        public final a b0(long bytes) {
            if (!(bytes >= 0)) {
                throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("鹁\u0001"), bytes).toString());
            }
            this.minWebSocketMessageToCompress = bytes;
            return this;
        }

        @fg.l
        public final a c(@fg.l w interceptor) {
            l0.p(interceptor, ProtectedSandApp.s("鹂\u0001"));
            this.interceptors.add(interceptor);
            return this;
        }

        @fg.l
        public final List<w> c0() {
            return this.networkInterceptors;
        }

        @fg.l
        public final a d(@fg.l w interceptor) {
            l0.p(interceptor, ProtectedSandApp.s("鹂\u0001"));
            this.networkInterceptors.add(interceptor);
            return this;
        }

        @fg.l
        public final a d0(long interval, @fg.l TimeUnit unit) {
            l0.p(unit, ProtectedSandApp.s("鸼\u0001"));
            this.pingInterval = okhttp3.internal.d.j(ProtectedSandApp.s("鹃\u0001"), interval, unit);
            return this;
        }

        @fg.l
        public final a e(@fg.l okhttp3.b authenticator) {
            l0.p(authenticator, ProtectedSandApp.s("鹄\u0001"));
            this.authenticator = authenticator;
            return this;
        }

        @fg.l
        @IgnoreJRERequirement
        public final a e0(@fg.l Duration duration) {
            long millis;
            l0.p(duration, ProtectedSandApp.s("鸾\u0001"));
            millis = duration.toMillis();
            d0(millis, TimeUnit.MILLISECONDS);
            return this;
        }

        @fg.l
        public final b0 f() {
            return new b0(this);
        }

        @fg.l
        public final a f0(@fg.l List<? extends c0> protocols) {
            l0.p(protocols, ProtectedSandApp.s("鹅\u0001"));
            List Y5 = kotlin.collections.w.Y5(protocols);
            c0 c0Var = c0.H2_PRIOR_KNOWLEDGE;
            if (!(Y5.contains(c0Var) || Y5.contains(c0.HTTP_1_1))) {
                throw new IllegalArgumentException((ProtectedSandApp.s("鹊\u0001") + Y5).toString());
            }
            if (!(!Y5.contains(c0Var) || Y5.size() <= 1)) {
                throw new IllegalArgumentException((ProtectedSandApp.s("鹉\u0001") + Y5).toString());
            }
            if (Y5.contains(c0.HTTP_1_0)) {
                throw new IllegalArgumentException((ProtectedSandApp.s("鹈\u0001") + Y5).toString());
            }
            if (Y5.contains(null)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("鹇\u0001"));
            }
            Y5.remove(c0.SPDY_3);
            if (!l0.g(Y5, this.protocols)) {
                this.routeDatabase = null;
            }
            List<? extends c0> unmodifiableList = Collections.unmodifiableList(Y5);
            l0.o(unmodifiableList, ProtectedSandApp.s("鹆\u0001"));
            this.protocols = unmodifiableList;
            return this;
        }

        @fg.l
        public final a g(@fg.m c cache) {
            this.cache = cache;
            return this;
        }

        @fg.l
        public final a g0(@fg.m Proxy proxy) {
            if (!l0.g(proxy, this.proxy)) {
                this.routeDatabase = null;
            }
            this.proxy = proxy;
            return this;
        }

        @fg.l
        public final a h(long timeout, @fg.l TimeUnit unit) {
            l0.p(unit, ProtectedSandApp.s("鸼\u0001"));
            this.callTimeout = okhttp3.internal.d.j(ProtectedSandApp.s("鸽\u0001"), timeout, unit);
            return this;
        }

        @fg.l
        public final a h0(@fg.l okhttp3.b proxyAuthenticator) {
            l0.p(proxyAuthenticator, ProtectedSandApp.s("鹋\u0001"));
            if (!l0.g(proxyAuthenticator, this.proxyAuthenticator)) {
                this.routeDatabase = null;
            }
            this.proxyAuthenticator = proxyAuthenticator;
            return this;
        }

        @fg.l
        @IgnoreJRERequirement
        public final a i(@fg.l Duration duration) {
            long millis;
            l0.p(duration, ProtectedSandApp.s("鸾\u0001"));
            millis = duration.toMillis();
            h(millis, TimeUnit.MILLISECONDS);
            return this;
        }

        @fg.l
        public final a i0(@fg.l ProxySelector proxySelector) {
            l0.p(proxySelector, ProtectedSandApp.s("鹌\u0001"));
            if (!l0.g(proxySelector, this.proxySelector)) {
                this.routeDatabase = null;
            }
            this.proxySelector = proxySelector;
            return this;
        }

        @fg.l
        public final a j(@fg.l g certificatePinner) {
            l0.p(certificatePinner, ProtectedSandApp.s("鹍\u0001"));
            if (!l0.g(certificatePinner, this.certificatePinner)) {
                this.routeDatabase = null;
            }
            this.certificatePinner = certificatePinner;
            return this;
        }

        @fg.l
        public final a j0(long timeout, @fg.l TimeUnit unit) {
            l0.p(unit, ProtectedSandApp.s("鸼\u0001"));
            this.readTimeout = okhttp3.internal.d.j(ProtectedSandApp.s("鸽\u0001"), timeout, unit);
            return this;
        }

        @fg.l
        public final a k(long timeout, @fg.l TimeUnit unit) {
            l0.p(unit, ProtectedSandApp.s("鸼\u0001"));
            this.connectTimeout = okhttp3.internal.d.j(ProtectedSandApp.s("鸽\u0001"), timeout, unit);
            return this;
        }

        @fg.l
        @IgnoreJRERequirement
        public final a k0(@fg.l Duration duration) {
            long millis;
            l0.p(duration, ProtectedSandApp.s("鸾\u0001"));
            millis = duration.toMillis();
            j0(millis, TimeUnit.MILLISECONDS);
            return this;
        }

        @fg.l
        @IgnoreJRERequirement
        public final a l(@fg.l Duration duration) {
            long millis;
            l0.p(duration, ProtectedSandApp.s("鸾\u0001"));
            millis = duration.toMillis();
            k(millis, TimeUnit.MILLISECONDS);
            return this;
        }

        @fg.l
        public final a l0(boolean retryOnConnectionFailure) {
            this.retryOnConnectionFailure = retryOnConnectionFailure;
            return this;
        }

        @fg.l
        public final a m(@fg.l k connectionPool) {
            l0.p(connectionPool, ProtectedSandApp.s("鹎\u0001"));
            this.connectionPool = connectionPool;
            return this;
        }

        public final void m0(@fg.l okhttp3.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("鸵\u0001"));
            this.authenticator = bVar;
        }

        @fg.l
        public final a n(@fg.l List<l> connectionSpecs) {
            l0.p(connectionSpecs, ProtectedSandApp.s("鹏\u0001"));
            if (!l0.g(connectionSpecs, this.connectionSpecs)) {
                this.routeDatabase = null;
            }
            this.connectionSpecs = okhttp3.internal.d.c0(connectionSpecs);
            return this;
        }

        public final void n0(@fg.m c cVar) {
            this.cache = cVar;
        }

        @fg.l
        public final a o(@fg.l n cookieJar) {
            l0.p(cookieJar, ProtectedSandApp.s("鹐\u0001"));
            this.cookieJar = cookieJar;
            return this;
        }

        public final void o0(int i4) {
            this.callTimeout = i4;
        }

        @fg.l
        public final a p(@fg.l p dispatcher) {
            l0.p(dispatcher, ProtectedSandApp.s("鹑\u0001"));
            this.dispatcher = dispatcher;
            return this;
        }

        public final void p0(@fg.m ue.c cVar) {
            this.certificateChainCleaner = cVar;
        }

        @fg.l
        public final a q(@fg.l q dns) {
            l0.p(dns, ProtectedSandApp.s("鹒\u0001"));
            if (!l0.g(dns, this.dns)) {
                this.routeDatabase = null;
            }
            this.dns = dns;
            return this;
        }

        public final void q0(@fg.l g gVar) {
            l0.p(gVar, ProtectedSandApp.s("鸵\u0001"));
            this.certificatePinner = gVar;
        }

        @fg.l
        public final a r(@fg.l r eventListener) {
            l0.p(eventListener, ProtectedSandApp.s("鹓\u0001"));
            this.eventListenerFactory = okhttp3.internal.d.e(eventListener);
            return this;
        }

        public final void r0(int i4) {
            this.connectTimeout = i4;
        }

        @fg.l
        public final a s(@fg.l r.c eventListenerFactory) {
            l0.p(eventListenerFactory, ProtectedSandApp.s("鹔\u0001"));
            this.eventListenerFactory = eventListenerFactory;
            return this;
        }

        public final void s0(@fg.l k kVar) {
            l0.p(kVar, ProtectedSandApp.s("鸵\u0001"));
            this.connectionPool = kVar;
        }

        @fg.l
        public final a t(boolean followRedirects) {
            this.followRedirects = followRedirects;
            return this;
        }

        public final void t0(@fg.l List<l> list) {
            l0.p(list, ProtectedSandApp.s("鸵\u0001"));
            this.connectionSpecs = list;
        }

        @fg.l
        public final a u(boolean followProtocolRedirects) {
            this.followSslRedirects = followProtocolRedirects;
            return this;
        }

        public final void u0(@fg.l n nVar) {
            l0.p(nVar, ProtectedSandApp.s("鸵\u0001"));
            this.cookieJar = nVar;
        }

        @fg.l
        /* renamed from: v, reason: from getter */
        public final okhttp3.b getAuthenticator() {
            return this.authenticator;
        }

        public final void v0(@fg.l p pVar) {
            l0.p(pVar, ProtectedSandApp.s("鸵\u0001"));
            this.dispatcher = pVar;
        }

        @fg.m
        /* renamed from: w, reason: from getter */
        public final c getCache() {
            return this.cache;
        }

        public final void w0(@fg.l q qVar) {
            l0.p(qVar, ProtectedSandApp.s("鸵\u0001"));
            this.dns = qVar;
        }

        /* renamed from: x, reason: from getter */
        public final int getCallTimeout() {
            return this.callTimeout;
        }

        public final void x0(@fg.l r.c cVar) {
            l0.p(cVar, ProtectedSandApp.s("鸵\u0001"));
            this.eventListenerFactory = cVar;
        }

        @fg.m
        /* renamed from: y, reason: from getter */
        public final ue.c getCertificateChainCleaner() {
            return this.certificateChainCleaner;
        }

        public final void y0(boolean z4) {
            this.followRedirects = z4;
        }

        @fg.l
        /* renamed from: z, reason: from getter */
        public final g getCertificatePinner() {
            return this.certificatePinner;
        }

        public final void z0(boolean z4) {
            this.followSslRedirects = z4;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@fg.l b0 b0Var) {
            this();
            l0.p(b0Var, ProtectedSandApp.s("鸴\u0001"));
            this.dispatcher = b0Var.getDispatcher();
            this.connectionPool = b0Var.getConnectionPool();
            kotlin.collections.w.q0(this.interceptors, b0Var.c0());
            kotlin.collections.w.q0(this.networkInterceptors, b0Var.e0());
            this.eventListenerFactory = b0Var.getEventListenerFactory();
            this.retryOnConnectionFailure = b0Var.o0();
            this.authenticator = b0Var.getAuthenticator();
            this.followRedirects = b0Var.getFollowRedirects();
            this.followSslRedirects = b0Var.getFollowSslRedirects();
            this.cookieJar = b0Var.getCookieJar();
            this.cache = b0Var.getCache();
            this.dns = b0Var.getDns();
            this.proxy = b0Var.getProxy();
            this.proxySelector = b0Var.l0();
            this.proxyAuthenticator = b0Var.getProxyAuthenticator();
            this.socketFactory = b0Var.p0();
            this.sslSocketFactoryOrNull = b0Var.sslSocketFactoryOrNull;
            this.x509TrustManagerOrNull = b0Var.getX509TrustManager();
            this.connectionSpecs = b0Var.S();
            this.protocols = b0Var.h0();
            this.hostnameVerifier = b0Var.getHostnameVerifier();
            this.certificatePinner = b0Var.getCertificatePinner();
            this.certificateChainCleaner = b0Var.getCertificateChainCleaner();
            this.callTimeout = b0Var.getCallTimeoutMillis();
            this.connectTimeout = b0Var.getConnectTimeoutMillis();
            this.readTimeout = b0Var.m0();
            this.writeTimeout = b0Var.t0();
            this.pingInterval = b0Var.getPingIntervalMillis();
            this.minWebSocketMessageToCompress = b0Var.getMinWebSocketMessageToCompress();
            this.routeDatabase = b0Var.getRouteDatabase();
        }
    }

    public b0() {
        this(new a());
    }
}
