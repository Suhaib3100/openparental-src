package okhttp3.internal.platform;

import com.flashget.kidsdownloader.ProtectedSandApp;
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
import okhttp3.d0;
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;

/* compiled from: OpenJSSEPlatform.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J-\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\u0010\u001a\r\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000f0\rH\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015¨\u0006\u001b"}, d2 = {"Lokhttp3/internal/platform/i;", "Lokhttp3/internal/platform/j;", "Ljavax/net/ssl/SSLContext;", "p", "Ljavax/net/ssl/X509TrustManager;", "r", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "s", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/d0;", "Lp3/o;", "protocols", "Lkotlin/m2;", "f", "j", "Ljava/security/Provider;", "Ljava/security/Provider;", "provider", "<init>", "()V", "h", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public final class i extends j {

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f31320g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Provider provider;

    /* compiled from: OpenJSSEPlatform.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/platform/i$a;", "", "Lokhttp3/internal/platform/i;", "a", "", "isSupported", "Z", "b", "()Z", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.platform.i$a, reason: from kotlin metadata */
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        @d5.e
        public final i a() {
            w wVar = null;
            if (i.f31320g) {
                return new i(wVar);
            }
            return null;
        }

        public final boolean b() {
            return i.f31320g;
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        boolean z5 = false;
        try {
            Class.forName(ProtectedSandApp.s("鈌"), false, companion.getClass().getClassLoader());
            z5 = true;
        } catch (ClassNotFoundException unused) {
        }
        f31320g = z5;
    }

    private i() {
        this.provider = new OpenJSSE();
    }

    @Override // okhttp3.internal.platform.j
    public void f(@d5.d SSLSocket sSLSocket, @d5.e String str, @d5.d List<d0> list) {
        l0.p(sSLSocket, ProtectedSandApp.s("鈍"));
        l0.p(list, ProtectedSandApp.s("鈎"));
        if (!(sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket)) {
            super.f(sSLSocket, str, list);
            return;
        }
        org.openjsse.javax.net.ssl.SSLSocket sSLSocket2 = (org.openjsse.javax.net.ssl.SSLSocket) sSLSocket;
        SSLParameters sSLParameters = sSLSocket2.getSSLParameters();
        if (sSLParameters instanceof SSLParameters) {
            SSLParameters sSLParameters2 = sSLParameters;
            Object[] array = j.INSTANCE.b(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException(ProtectedSandApp.s("鈏"));
            }
            sSLParameters2.setApplicationProtocols((String[]) array);
            sSLSocket2.setSSLParameters(sSLParameters);
        }
    }

    @Override // okhttp3.internal.platform.j
    @d5.e
    public String j(@d5.d SSLSocket sslSocket) {
        l0.p(sslSocket, ProtectedSandApp.s("鈐"));
        if (!(sslSocket instanceof org.openjsse.javax.net.ssl.SSLSocket)) {
            return super.j(sslSocket);
        }
        String applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // okhttp3.internal.platform.j
    @d5.d
    public SSLContext p() {
        SSLContext sSLContext = SSLContext.getInstance(ProtectedSandApp.s("鈑"), this.provider);
        l0.o(sSLContext, ProtectedSandApp.s("鈒"));
        return sSLContext;
    }

    @Override // okhttp3.internal.platform.j
    @d5.d
    public X509TrustManager r() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.provider);
        trustManagerFactory.init((KeyStore) null);
        l0.o(trustManagerFactory, ProtectedSandApp.s("鈓"));
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        l0.m(trustManagers);
        if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                return (X509TrustManager) trustManager;
            }
            throw new NullPointerException(ProtectedSandApp.s("鈔"));
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("鈕"));
        String arrays = Arrays.toString(trustManagers);
        l0.o(arrays, ProtectedSandApp.s("鈖"));
        sb.append(arrays);
        throw new IllegalStateException(sb.toString().toString());
    }

    @Override // okhttp3.internal.platform.j
    @d5.e
    public X509TrustManager s(@d5.d SSLSocketFactory sslSocketFactory) {
        l0.p(sslSocketFactory, ProtectedSandApp.s("鈗"));
        throw new UnsupportedOperationException(ProtectedSandApp.s("鈘"));
    }

    public /* synthetic */ i(w wVar) {
        this();
    }
}
