package okhttp3.internal.platform.android;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import okhttp3.d0;
import okhttp3.internal.platform.android.l;
import okhttp3.internal.platform.android.m;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* compiled from: BouncyCastleSocketAdapter.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/platform/android/i;", "Lokhttp3/internal/platform/android/m;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "a", "isSupported", "", "b", "hostname", "", "Lokhttp3/d0;", "protocols", "Lkotlin/m2;", "e", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class i implements m {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private static final l.a f31283a = new a();

    /* compiled from: BouncyCastleSocketAdapter.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"okhttp3/internal/platform/android/i$a", "Lokhttp3/internal/platform/android/l$a;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "a", "Lokhttp3/internal/platform/android/m;", "b", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a implements l.a {
        a() {
        }

        @Override // okhttp3.internal.platform.android.l.a
        public boolean a(@d5.d SSLSocket sslSocket) {
            l0.p(sslSocket, ProtectedSandApp.s("敗"));
            okhttp3.internal.platform.c.INSTANCE.getClass();
            return okhttp3.internal.platform.c.f31302g && (sslSocket instanceof BCSSLSocket);
        }

        @Override // okhttp3.internal.platform.android.l.a
        @d5.d
        public m b(@d5.d SSLSocket sslSocket) {
            l0.p(sslSocket, ProtectedSandApp.s("敘"));
            return new i();
        }
    }

    /* compiled from: BouncyCastleSocketAdapter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lokhttp3/internal/platform/android/i$b;", "", "Lokhttp3/internal/platform/android/l$a;", "factory", "Lokhttp3/internal/platform/android/l$a;", "a", "()Lokhttp3/internal/platform/android/l$a;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.platform.android.i$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @d5.d
        public final l.a a() {
            return i.f31283a;
        }

        public Companion(w wVar) {
        }
    }

    @Override // okhttp3.internal.platform.android.m
    public boolean a(@d5.d SSLSocket sslSocket) {
        l0.p(sslSocket, ProtectedSandApp.s("教"));
        return sslSocket instanceof BCSSLSocket;
    }

    @Override // okhttp3.internal.platform.android.m
    @d5.e
    public String b(@d5.d SSLSocket sslSocket) {
        l0.p(sslSocket, ProtectedSandApp.s("敚"));
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // okhttp3.internal.platform.android.m
    @d5.e
    public X509TrustManager c(@d5.d SSLSocketFactory sSLSocketFactory) {
        l0.p(sSLSocketFactory, ProtectedSandApp.s("敛"));
        return m.a.b(this, sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.m
    public boolean d(@d5.d SSLSocketFactory sSLSocketFactory) {
        l0.p(sSLSocketFactory, ProtectedSandApp.s("敜"));
        return m.a.a(this, sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.m
    public void e(@d5.d SSLSocket sSLSocket, @d5.e String str, @d5.d List<? extends d0> list) {
        l0.p(sSLSocket, ProtectedSandApp.s("敝"));
        l0.p(list, ProtectedSandApp.s("敞"));
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            l0.o(parameters, ProtectedSandApp.s("敟"));
            Object[] array = okhttp3.internal.platform.j.INSTANCE.b(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException(ProtectedSandApp.s("敠"));
            }
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // okhttp3.internal.platform.android.m
    public boolean isSupported() {
        okhttp3.internal.platform.c.INSTANCE.getClass();
        return okhttp3.internal.platform.c.f31302g;
    }
}
