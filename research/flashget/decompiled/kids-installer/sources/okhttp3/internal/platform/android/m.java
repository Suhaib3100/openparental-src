package okhttp3.internal.platform.android;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okhttp3.d0;

/* compiled from: SocketAdapter.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\bH&¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/platform/android/m;", "", "", "isSupported", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "c", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "a", "d", "", "hostname", "", "Lokhttp3/d0;", "protocols", "Lkotlin/m2;", "e", "b", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public interface m {

    /* compiled from: SocketAdapter.kt */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public static final class a {
        public static boolean a(@d5.d m mVar, @d5.d SSLSocketFactory sSLSocketFactory) {
            l0.p(sSLSocketFactory, ProtectedSandApp.s("敶"));
            return false;
        }

        @d5.e
        public static X509TrustManager b(@d5.d m mVar, @d5.d SSLSocketFactory sSLSocketFactory) {
            l0.p(sSLSocketFactory, ProtectedSandApp.s("敷"));
            return null;
        }
    }

    boolean a(@d5.d SSLSocket sslSocket);

    @d5.e
    String b(@d5.d SSLSocket sslSocket);

    @d5.e
    X509TrustManager c(@d5.d SSLSocketFactory sslSocketFactory);

    boolean d(@d5.d SSLSocketFactory sslSocketFactory);

    void e(@d5.d SSLSocket sSLSocket, @d5.e String str, @d5.d List<? extends d0> list);

    boolean isSupported();
}
