package okhttp3.internal.platform;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.security.KeyStore;
import java.security.Provider;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import okhttp3.d0;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;

/* compiled from: ConscryptPlatform.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001dB\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J-\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\u0010\u001a\r\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000f0\rH\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0004H\u0016R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017¨\u0006\u001e"}, d2 = {"Lokhttp3/internal/platform/d;", "Lokhttp3/internal/platform/j;", "Ljavax/net/ssl/SSLContext;", "p", "Ljavax/net/ssl/X509TrustManager;", "r", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "s", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/d0;", "Lp3/o;", "protocols", "Lkotlin/m2;", "f", "j", "trustManager", "q", "Ljava/security/Provider;", "Ljava/security/Provider;", "provider", "<init>", "()V", "h", "a", "b", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public final class d extends j {

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f31305g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Provider provider;

    /* compiled from: ConscryptPlatform.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/platform/d$a;", "", "Lokhttp3/internal/platform/d;", "c", "", "major", "minor", "patch", "", "a", "isSupported", "Z", "d", "()Z", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.platform.d$a, reason: from kotlin metadata */
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ boolean b(Companion companion, int i5, int i6, int i7, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                i6 = 0;
            }
            if ((i8 & 4) != 0) {
                i7 = 0;
            }
            return companion.a(i5, i6, i7);
        }

        public final boolean a(int major, int minor, int patch) {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != major ? version.major() > major : version.minor() != minor ? version.minor() > minor : version.patch() >= patch;
        }

        @d5.e
        public final d c() {
            w wVar = null;
            if (d.f31305g) {
                return new d(wVar);
            }
            return null;
        }

        public final boolean d() {
            return d.f31305g;
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    /* compiled from: ConscryptPlatform.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J5\u0010\u000b\u001a\u00020\u00062\u0010\u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/platform/d$b;", "Lorg/conscrypt/ConscryptHostnameVerifier;", "", "hostname", "Ljavax/net/ssl/SSLSession;", "session", "", "a", "", "Ljava/security/cert/X509Certificate;", "certs", "b", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class b implements ConscryptHostnameVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f31308a = new b();

        private b() {
        }

        public final boolean a(@d5.e String hostname, @d5.e SSLSession session) {
            return true;
        }

        public boolean b(@d5.e X509Certificate[] certs, @d5.e String hostname, @d5.e SSLSession session) {
            return true;
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        boolean z5 = false;
        try {
            Class.forName(ProtectedSandApp.s("釦"), false, companion.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (companion.a(2, 1, 0)) {
                    z5 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f31305g = z5;
    }

    private d() {
        Provider newProvider = Conscrypt.newProvider();
        l0.o(newProvider, ProtectedSandApp.s("釧"));
        this.provider = newProvider;
    }

    @Override // okhttp3.internal.platform.j
    public void f(@d5.d SSLSocket sSLSocket, @d5.e String str, @d5.d List<d0> list) {
        l0.p(sSLSocket, ProtectedSandApp.s("釨"));
        l0.p(list, ProtectedSandApp.s("釩"));
        if (!Conscrypt.isConscrypt(sSLSocket)) {
            super.f(sSLSocket, str, list);
            return;
        }
        Conscrypt.setUseSessionTickets(sSLSocket, true);
        Object[] array = j.INSTANCE.b(list).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException(ProtectedSandApp.s("釪"));
        }
        Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
    }

    @Override // okhttp3.internal.platform.j
    @d5.e
    public String j(@d5.d SSLSocket sslSocket) {
        l0.p(sslSocket, ProtectedSandApp.s("釫"));
        return Conscrypt.isConscrypt(sslSocket) ? Conscrypt.getApplicationProtocol(sslSocket) : super.j(sslSocket);
    }

    @Override // okhttp3.internal.platform.j
    @d5.d
    public SSLContext p() {
        SSLContext sSLContext = SSLContext.getInstance(ProtectedSandApp.s("釬"), this.provider);
        l0.o(sSLContext, ProtectedSandApp.s("釭"));
        return sSLContext;
    }

    @Override // okhttp3.internal.platform.j
    @d5.d
    public SSLSocketFactory q(@d5.d X509TrustManager trustManager) {
        l0.p(trustManager, ProtectedSandApp.s("釮"));
        SSLContext p5 = p();
        p5.init(null, new TrustManager[]{trustManager}, null);
        SSLSocketFactory socketFactory = p5.getSocketFactory();
        l0.o(socketFactory, ProtectedSandApp.s("釯"));
        return socketFactory;
    }

    @Override // okhttp3.internal.platform.j
    @d5.d
    public X509TrustManager r() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        l0.o(trustManagerFactory, ProtectedSandApp.s("釰"));
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        l0.m(trustManagers);
        if (!(trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager))) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("釲"));
            String arrays = Arrays.toString(trustManagers);
            l0.o(arrays, ProtectedSandApp.s("釳"));
            sb.append(arrays);
            throw new IllegalStateException(sb.toString().toString());
        }
        TrustManager trustManager = trustManagers[0];
        if (trustManager == null) {
            throw new NullPointerException(ProtectedSandApp.s("釱"));
        }
        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
        Conscrypt.setHostnameVerifier(x509TrustManager, b.f31308a);
        return x509TrustManager;
    }

    @Override // okhttp3.internal.platform.j
    @d5.e
    public X509TrustManager s(@d5.d SSLSocketFactory sslSocketFactory) {
        l0.p(sslSocketFactory, ProtectedSandApp.s("釴"));
        return null;
    }

    public /* synthetic */ d(w wVar) {
        this();
    }
}
