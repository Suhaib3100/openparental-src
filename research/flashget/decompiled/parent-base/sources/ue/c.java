package ue;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import okhttp3.internal.platform.j;

/* compiled from: CertificateChainCleaner.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lue/c;", "", "<init>", "()V", "", "Ljava/security/cert/Certificate;", "chain", "", "hostname", "a", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* compiled from: CertificateChainCleaner.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\u00062\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lue/c$a;", "", "<init>", "()V", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lue/c;", "a", "(Ljavax/net/ssl/X509TrustManager;)Lue/c;", "", "Ljava/security/cert/X509Certificate;", "caCerts", "b", "([Ljava/security/cert/X509Certificate;)Lue/c;", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: ue.c$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @l
        public final c a(@l X509TrustManager trustManager) {
            l0.p(trustManager, ProtectedSandApp.s("₀"));
            j.INSTANCE.getClass();
            return j.f84863a.d(trustManager);
        }

        @l
        public final c b(@l X509Certificate... caCerts) {
            l0.p(caCerts, ProtectedSandApp.s("₁"));
            return new a(new b((X509Certificate[]) Arrays.copyOf(caCerts, caCerts.length)));
        }

        public Companion(w wVar) {
        }
    }

    @l
    public abstract List<Certificate> a(@l List<? extends Certificate> chain, @l String hostname) throws SSLPeerUnverifiedException;
}
