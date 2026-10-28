package okhttp3.internal.platform.android;

import android.net.http.X509TrustManagerExtensions;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: AndroidCertificateChainCleaner.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lokhttp3/internal/platform/android/d;", "Lu4/c;", "", "Ljava/security/cert/Certificate;", "chain", "", "hostname", "a", "", "other", "", "equals", "", "hashCode", "Ljavax/net/ssl/X509TrustManager;", "b", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Landroid/net/http/X509TrustManagerExtensions;", "c", "Landroid/net/http/X509TrustManagerExtensions;", "x509TrustManagerExtensions", "<init>", "(Ljavax/net/ssl/X509TrustManager;Landroid/net/http/X509TrustManagerExtensions;)V", "d", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class d extends u4.c {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final X509TrustManager trustManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final X509TrustManagerExtensions x509TrustManagerExtensions;

    /* compiled from: AndroidCertificateChainCleaner.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lokhttp3/internal/platform/android/d$a;", "", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lokhttp3/internal/platform/android/d;", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.platform.android.d$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @d5.e
        @okhttp3.internal.c
        public final d a(@d5.d X509TrustManager trustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            l0.p(trustManager, ProtectedSandApp.s("攩"));
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new d(trustManager, x509TrustManagerExtensions);
            }
            return null;
        }

        public Companion(w wVar) {
        }
    }

    public d(@d5.d X509TrustManager x509TrustManager, @d5.d X509TrustManagerExtensions x509TrustManagerExtensions) {
        l0.p(x509TrustManager, ProtectedSandApp.s("攪"));
        l0.p(x509TrustManagerExtensions, ProtectedSandApp.s("攫"));
        this.trustManager = x509TrustManager;
        this.x509TrustManagerExtensions = x509TrustManagerExtensions;
    }

    @Override // u4.c
    @d5.d
    @okhttp3.internal.c
    public List<Certificate> a(@d5.d List<? extends Certificate> chain, @d5.d String hostname) throws SSLPeerUnverifiedException {
        l0.p(chain, ProtectedSandApp.s("攬"));
        l0.p(hostname, ProtectedSandApp.s("攭"));
        Object[] array = chain.toArray(new X509Certificate[0]);
        if (array == null) {
            throw new NullPointerException(ProtectedSandApp.s("攰"));
        }
        try {
            List<X509Certificate> checkServerTrusted = this.x509TrustManagerExtensions.checkServerTrusted((X509Certificate[]) array, ProtectedSandApp.s("攮"), hostname);
            l0.o(checkServerTrusted, ProtectedSandApp.s("支"));
            return checkServerTrusted;
        } catch (CertificateException e6) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e6.getMessage());
            sSLPeerUnverifiedException.initCause(e6);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(@d5.e Object other) {
        return (other instanceof d) && ((d) other).trustManager == this.trustManager;
    }

    public int hashCode() {
        return System.identityHashCode(this.trustManager);
    }
}
