package okhttp3.internal.platform;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
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
import okhttp3.c0;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;

/* compiled from: ConscryptPlatform.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 !2\u00020\u0001:\u0002\"#B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ4\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0011\u0010\u0015\u001a\r\u0012\t\u0012\u00070\u0013¢\u0006\u0002\b\u00140\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001f¨\u0006$"}, d2 = {"Lokhttp3/internal/platform/d;", "Lokhttp3/internal/platform/j;", "<init>", "()V", "Ljavax/net/ssl/SSLContext;", "p", "()Ljavax/net/ssl/SSLContext;", "Ljavax/net/ssl/X509TrustManager;", "r", "()Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "s", "(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/c0;", "Lkd/o;", "protocols", "Lkotlin/k2;", "f", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "j", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "trustManager", "q", "(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;", "Ljava/security/Provider;", "Ljava/security/Provider;", "provider", "h", "a", "b", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class d extends j {

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f84845g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Provider provider;

    /* compiled from: ConscryptPlatform.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/platform/d$a;", "", "<init>", "()V", "Lokhttp3/internal/platform/d;", "c", "()Lokhttp3/internal/platform/d;", "", "major", "minor", "patch", "", "a", "(III)Z", "isSupported", "Z", "d", "()Z", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.platform.d$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ boolean b(Companion companion, int i4, int i5, int i6, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                i5 = 0;
            }
            if ((i7 & 4) != 0) {
                i6 = 0;
            }
            return companion.a(i4, i5, i6);
        }

        public final boolean a(int major, int minor, int patch) {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != major ? version.major() > major : version.minor() != minor ? version.minor() > minor : version.patch() >= patch;
        }

        @m
        public final d c() {
            w wVar = null;
            if (d.f84845g) {
                return new d(wVar);
            }
            return null;
        }

        public final boolean d() {
            return d.f84845g;
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    /* compiled from: ConscryptPlatform.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ5\u0010\u000e\u001a\u00020\b2\u0010\u0010\r\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/platform/d$b;", "Lorg/conscrypt/ConscryptHostnameVerifier;", "<init>", "()V", "", "hostname", "Ljavax/net/ssl/SSLSession;", "session", "", "a", "(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z", "", "Ljava/security/cert/X509Certificate;", "certs", "b", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class b implements ConscryptHostnameVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f84848a = new b();

        private b() {
        }

        public final boolean a(@m String hostname, @m SSLSession session) {
            return true;
        }

        public boolean b(@m X509Certificate[] certs, @m String hostname, @m SSLSession session) {
            return true;
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        boolean z4 = false;
        try {
            Class.forName(ProtectedSandApp.s("Ḥ"), false, companion.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (companion.a(2, 1, 0)) {
                    z4 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f84845g = z4;
    }

    private d() {
        Provider newProvider = Conscrypt.newProvider();
        l0.o(newProvider, ProtectedSandApp.s("ḥ"));
        this.provider = newProvider;
    }

    @Override // okhttp3.internal.platform.j
    public void f(@l SSLSocket sslSocket, @m String hostname, @l List<c0> protocols) {
        l0.p(sslSocket, ProtectedSandApp.s("Ḧ"));
        l0.p(protocols, ProtectedSandApp.s("ḧ"));
        if (!Conscrypt.isConscrypt(sslSocket)) {
            super.f(sslSocket, hostname, protocols);
            return;
        }
        Conscrypt.setUseSessionTickets(sslSocket, true);
        Object[] array = j.INSTANCE.b(protocols).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException(ProtectedSandApp.s("Ḩ"));
        }
        Conscrypt.setApplicationProtocols(sslSocket, (String[]) array);
    }

    @Override // okhttp3.internal.platform.j
    @m
    public String j(@l SSLSocket sslSocket) {
        l0.p(sslSocket, ProtectedSandApp.s("Ḧ"));
        return Conscrypt.isConscrypt(sslSocket) ? Conscrypt.getApplicationProtocol(sslSocket) : super.j(sslSocket);
    }

    @Override // okhttp3.internal.platform.j
    @l
    public SSLContext p() {
        SSLContext sSLContext = SSLContext.getInstance(ProtectedSandApp.s("ḩ"), this.provider);
        l0.o(sSLContext, ProtectedSandApp.s("Ḫ"));
        return sSLContext;
    }

    @Override // okhttp3.internal.platform.j
    @l
    public SSLSocketFactory q(@l X509TrustManager trustManager) {
        l0.p(trustManager, ProtectedSandApp.s("ḫ"));
        SSLContext p4 = p();
        p4.init(null, new TrustManager[]{trustManager}, null);
        SSLSocketFactory socketFactory = p4.getSocketFactory();
        l0.o(socketFactory, ProtectedSandApp.s("Ḭ"));
        return socketFactory;
    }

    @Override // okhttp3.internal.platform.j
    @l
    public X509TrustManager r() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        l0.o(trustManagerFactory, ProtectedSandApp.s("ḭ"));
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        l0.m(trustManagers);
        if (!(trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager))) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ḯ"));
            String arrays = Arrays.toString(trustManagers);
            l0.o(arrays, ProtectedSandApp.s("Ḱ"));
            sb.append(arrays);
            throw new IllegalStateException(sb.toString().toString());
        }
        TrustManager trustManager = trustManagers[0];
        if (trustManager == null) {
            throw new NullPointerException(ProtectedSandApp.s("Ḯ"));
        }
        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
        Conscrypt.setHostnameVerifier(x509TrustManager, b.f84848a);
        return x509TrustManager;
    }

    @Override // okhttp3.internal.platform.j
    @m
    public X509TrustManager s(@l SSLSocketFactory sslSocketFactory) {
        l0.p(sslSocketFactory, ProtectedSandApp.s("ḱ"));
        return null;
    }

    public /* synthetic */ d(w wVar) {
        this();
    }
}
