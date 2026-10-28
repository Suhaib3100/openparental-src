package okhttp3.internal.platform.android;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import okhttp3.c0;
import okhttp3.internal.platform.android.l;
import okhttp3.internal.platform.android.m;
import org.conscrypt.Conscrypt;

/* compiled from: ConscryptSocketAdapter.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/platform/android/k;", "Lokhttp3/internal/platform/android/m;", "<init>", "()V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "a", "(Ljavax/net/ssl/SSLSocket;)Z", "isSupported", "()Z", "", "b", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "hostname", "", "Lokhttp3/c0;", "protocols", "Lkotlin/k2;", "e", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class k implements m {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final l.a f84829a = new a();

    /* compiled from: ConscryptSocketAdapter.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"okhttp3/internal/platform/android/k$a", "Lokhttp3/internal/platform/android/l$a;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "a", "(Ljavax/net/ssl/SSLSocket;)Z", "Lokhttp3/internal/platform/android/m;", "b", "(Ljavax/net/ssl/SSLSocket;)Lokhttp3/internal/platform/android/m;", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a implements l.a {
        a() {
        }

        @Override // okhttp3.internal.platform.android.l.a
        public boolean a(@fg.l SSLSocket sslSocket) {
            l0.p(sslSocket, ProtectedSandApp.s("ᷫ"));
            return okhttp3.internal.platform.d.INSTANCE.d() && Conscrypt.isConscrypt(sslSocket);
        }

        @Override // okhttp3.internal.platform.android.l.a
        @fg.l
        public m b(@fg.l SSLSocket sslSocket) {
            l0.p(sslSocket, ProtectedSandApp.s("ᷫ"));
            return new k();
        }
    }

    /* compiled from: ConscryptSocketAdapter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/internal/platform/android/k$b;", "", "<init>", "()V", "Lokhttp3/internal/platform/android/l$a;", "factory", "Lokhttp3/internal/platform/android/l$a;", "a", "()Lokhttp3/internal/platform/android/l$a;", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.platform.android.k$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final l.a a() {
            return k.f84829a;
        }

        public Companion(w wVar) {
        }
    }

    @Override // okhttp3.internal.platform.android.m
    public boolean a(@fg.l SSLSocket sslSocket) {
        l0.p(sslSocket, ProtectedSandApp.s("ᷬ"));
        return Conscrypt.isConscrypt(sslSocket);
    }

    @Override // okhttp3.internal.platform.android.m
    @fg.m
    public String b(@fg.l SSLSocket sslSocket) {
        l0.p(sslSocket, ProtectedSandApp.s("ᷬ"));
        if (a(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.android.m
    @fg.m
    public X509TrustManager c(@fg.l SSLSocketFactory sSLSocketFactory) {
        l0.p(sSLSocketFactory, ProtectedSandApp.s("ᷭ"));
        return m.a.b(this, sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.m
    public boolean d(@fg.l SSLSocketFactory sSLSocketFactory) {
        l0.p(sSLSocketFactory, ProtectedSandApp.s("ᷭ"));
        return m.a.a(this, sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.m
    public void e(@fg.l SSLSocket sslSocket, @fg.m String hostname, @fg.l List<? extends c0> protocols) {
        l0.p(sslSocket, ProtectedSandApp.s("ᷬ"));
        l0.p(protocols, ProtectedSandApp.s("ᷮ"));
        if (a(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Object[] array = okhttp3.internal.platform.j.INSTANCE.b(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException(ProtectedSandApp.s("ᷯ"));
            }
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) array);
        }
    }

    @Override // okhttp3.internal.platform.android.m
    public boolean isSupported() {
        okhttp3.internal.platform.d.INSTANCE.getClass();
        return okhttp3.internal.platform.d.f84845g;
    }
}
