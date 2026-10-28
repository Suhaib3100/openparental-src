package okhttp3.internal.platform;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import okhttp3.c0;
import org.openjsse.net.ssl.OpenJSSE;

/* compiled from: OpenJSSEPlatform.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ4\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0011\u0010\u0015\u001a\r\u0012\t\u0012\u00070\u0013¢\u0006\u0002\b\u00140\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001c¨\u0006 "}, d2 = {"Lokhttp3/internal/platform/i;", "Lokhttp3/internal/platform/j;", "<init>", "()V", "Ljavax/net/ssl/SSLContext;", "p", "()Ljavax/net/ssl/SSLContext;", "Ljavax/net/ssl/X509TrustManager;", "r", "()Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "s", "(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/c0;", "Lkd/o;", "protocols", "Lkotlin/k2;", "f", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "j", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Ljava/security/Provider;", "Ljava/security/Provider;", "provider", "h", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class i extends j {

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f84860g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Provider provider;

    /* compiled from: OpenJSSEPlatform.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lokhttp3/internal/platform/i$a;", "", "<init>", "()V", "Lokhttp3/internal/platform/i;", "a", "()Lokhttp3/internal/platform/i;", "", "isSupported", "Z", "b", "()Z", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.platform.i$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @m
        public final i a() {
            w wVar = null;
            if (i.f84860g) {
                return new i(wVar);
            }
            return null;
        }

        public final boolean b() {
            return i.f84860g;
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        boolean z4 = false;
        try {
            Class.forName(ProtectedSandApp.s("Ṡ"), false, companion.getClass().getClassLoader());
            z4 = true;
        } catch (ClassNotFoundException unused) {
        }
        f84860g = z4;
    }

    private i() {
        this.provider = new OpenJSSE();
    }

    @Override // okhttp3.internal.platform.j
    public void f(@l SSLSocket sslSocket, @m String hostname, @l List<c0> protocols) {
        l0.p(sslSocket, ProtectedSandApp.s("ṡ"));
        l0.p(protocols, ProtectedSandApp.s("Ṣ"));
        super.f(sslSocket, hostname, protocols);
    }

    @Override // okhttp3.internal.platform.j
    @m
    public String j(@l SSLSocket sslSocket) {
        l0.p(sslSocket, ProtectedSandApp.s("ṡ"));
        return super.j(sslSocket);
    }

    @Override // okhttp3.internal.platform.j
    @l
    public SSLContext p() {
        SSLContext sSLContext = SSLContext.getInstance(ProtectedSandApp.s("ṣ"), this.provider);
        l0.o(sSLContext, ProtectedSandApp.s("Ṥ"));
        return sSLContext;
    }

    @Override // okhttp3.internal.platform.j
    @l
    public X509TrustManager r() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.provider);
        trustManagerFactory.init((KeyStore) null);
        l0.o(trustManagerFactory, ProtectedSandApp.s("ṥ"));
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        l0.m(trustManagers);
        if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                return (X509TrustManager) trustManager;
            }
            throw new NullPointerException(ProtectedSandApp.s("Ṧ"));
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ṧ"));
        String arrays = Arrays.toString(trustManagers);
        l0.o(arrays, ProtectedSandApp.s("Ṩ"));
        sb.append(arrays);
        throw new IllegalStateException(sb.toString().toString());
    }

    @Override // okhttp3.internal.platform.j
    @m
    public X509TrustManager s(@l SSLSocketFactory sslSocketFactory) {
        l0.p(sslSocketFactory, ProtectedSandApp.s("ṩ"));
        throw new UnsupportedOperationException(ProtectedSandApp.s("Ṫ"));
    }

    public /* synthetic */ i(w wVar) {
        this();
    }
}
