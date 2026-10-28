package okhttp3.internal.platform;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Provider;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kd.n;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import okhttp3.b0;
import okhttp3.c0;
import okio.m;

/* compiled from: Platform.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 ;2\u00020\u0001:\u0001@B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0011\u0010\u0017\u001a\r\u0012\t\u0012\u00070\u0015¢\u0006\u0002\b\u00160\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010%\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J-\u0010+\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u00042\b\b\u0002\u0010(\u001a\u00020#2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020-2\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b.\u0010/J\u0019\u00101\u001a\u0004\u0018\u00010\u00012\u0006\u00100\u001a\u00020\u0004H\u0016¢\u0006\u0004\b1\u00102J!\u00104\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u00042\b\u00103\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u0002072\u0006\u00106\u001a\u00020\nH\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020:2\u0006\u00106\u001a\u00020\nH\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\r2\u0006\u00106\u001a\u00020\nH\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0004H\u0016¢\u0006\u0004\b?\u0010\u0006¨\u0006A"}, d2 = {"Lokhttp3/internal/platform/j;", "", "<init>", "()V", "", "i", "()Ljava/lang/String;", "Ljavax/net/ssl/SSLContext;", "p", "()Ljavax/net/ssl/SSLContext;", "Ljavax/net/ssl/X509TrustManager;", "r", "()Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "s", "(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "hostname", "", "Lokhttp3/c0;", "Lkd/o;", "protocols", "Lkotlin/k2;", "f", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "c", "(Ljavax/net/ssl/SSLSocket;)V", "j", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", "", "connectTimeout", "g", "(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V", "message", "level", "", "t", "m", "(Ljava/lang/String;ILjava/lang/Throwable;)V", "", "l", "(Ljava/lang/String;)Z", "closer", "k", "(Ljava/lang/String;)Ljava/lang/Object;", "stackTrace", "o", "(Ljava/lang/String;Ljava/lang/Object;)V", "trustManager", "Lue/c;", "d", "(Ljavax/net/ssl/X509TrustManager;)Lue/c;", "Lue/e;", "e", "(Ljavax/net/ssl/X509TrustManager;)Lue/e;", "q", "(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;", "toString", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static volatile j f84863a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final int f84864b = 4;

    /* renamed from: c, reason: collision with root package name */
    public static final int f84865c = 5;

    /* renamed from: d, reason: collision with root package name */
    private static final Logger f84866d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* compiled from: Platform.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u00142\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010 \u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019R\u0014\u0010\"\u001a\u00020!8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020!8\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010#R\u001c\u0010'\u001a\n &*\u0004\u0018\u00010%0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010)¨\u0006*"}, d2 = {"Lokhttp3/internal/platform/j$a;", "", "<init>", "()V", "Lokhttp3/internal/platform/j;", "f", "()Lokhttp3/internal/platform/j;", "d", "e", "g", "platform", "Lkotlin/k2;", "l", "(Lokhttp3/internal/platform/j;)V", "", "Lokhttp3/c0;", "protocols", "", "b", "(Ljava/util/List;)Ljava/util/List;", "", "c", "(Ljava/util/List;)[B", "", "j", "()Z", "isConscryptPreferred", "k", "isOpenJSSEPreferred", "i", "isBouncyCastlePreferred", "h", "isAndroid", "", "INFO", "I", "WARN", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "Lokhttp3/internal/platform/j;", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.platform.j$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        private final j d() {
            okhttp3.internal.platform.android.e.f84813d.b();
            j a5 = a.INSTANCE.a();
            if (a5 != null) {
                return a5;
            }
            j a6 = b.INSTANCE.a();
            l0.m(a6);
            return a6;
        }

        private final j e() {
            i a5;
            c a6;
            d c5;
            if (j() && (c5 = d.INSTANCE.c()) != null) {
                return c5;
            }
            if (i() && (a6 = c.INSTANCE.a()) != null) {
                return a6;
            }
            if (k() && (a5 = i.INSTANCE.a()) != null) {
                return a5;
            }
            h a7 = h.INSTANCE.a();
            if (a7 != null) {
                return a7;
            }
            j a8 = e.INSTANCE.a();
            return a8 != null ? a8 : new j();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final j f() {
            return h() ? d() : e();
        }

        private final boolean i() {
            Provider provider = Security.getProviders()[0];
            l0.o(provider, ProtectedSandApp.s("ṫ"));
            return l0.g(ProtectedSandApp.s("Ṭ"), provider.getName());
        }

        private final boolean j() {
            Provider provider = Security.getProviders()[0];
            l0.o(provider, ProtectedSandApp.s("ṫ"));
            return l0.g(ProtectedSandApp.s("ṭ"), provider.getName());
        }

        private final boolean k() {
            Provider provider = Security.getProviders()[0];
            l0.o(provider, ProtectedSandApp.s("ṫ"));
            return l0.g(ProtectedSandApp.s("Ṯ"), provider.getName());
        }

        public static /* synthetic */ void m(Companion companion, j jVar, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                jVar = companion.f();
            }
            companion.l(jVar);
        }

        @l
        public final List<String> b(@l List<? extends c0> protocols) {
            l0.p(protocols, ProtectedSandApp.s("ṯ"));
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((c0) obj) != c0.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(w.b0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((c0) it.next()).getProtocol());
            }
            return arrayList2;
        }

        @l
        public final byte[] c(@l List<? extends c0> protocols) {
            l0.p(protocols, ProtectedSandApp.s("ṯ"));
            m mVar = new m();
            for (String str : b(protocols)) {
                mVar.writeByte(str.length());
                mVar.Q0(str);
            }
            return mVar.p2();
        }

        @l
        @n
        public final j g() {
            return j.f84863a;
        }

        public final boolean h() {
            return l0.g(ProtectedSandApp.s("ṱ"), System.getProperty(ProtectedSandApp.s("Ṱ")));
        }

        public final void l(@l j platform) {
            l0.p(platform, ProtectedSandApp.s("Ṳ"));
            j.f84863a = platform;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f84863a = companion.f();
        f84866d = Logger.getLogger(b0.class.getName());
    }

    @l
    @n
    public static final j h() {
        INSTANCE.getClass();
        return f84863a;
    }

    public static /* synthetic */ void n(j jVar, String str, int i4, Throwable th, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("ᶒ"));
        }
        if ((i5 & 2) != 0) {
            i4 = 4;
        }
        if ((i5 & 4) != 0) {
            th = null;
        }
        jVar.m(str, i4, th);
    }

    public void c(@l SSLSocket sslSocket) {
        l0.p(sslSocket, ProtectedSandApp.s("ᶓ"));
    }

    @l
    public ue.c d(@l X509TrustManager trustManager) {
        l0.p(trustManager, ProtectedSandApp.s("ᶔ"));
        return new ue.a(e(trustManager));
    }

    @l
    public ue.e e(@l X509TrustManager trustManager) {
        l0.p(trustManager, ProtectedSandApp.s("ᶔ"));
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        l0.o(acceptedIssuers, ProtectedSandApp.s("ᶕ"));
        return new ue.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void f(@l SSLSocket sslSocket, @fg.m String hostname, @l List<c0> protocols) {
        l0.p(sslSocket, ProtectedSandApp.s("ᶓ"));
        l0.p(protocols, ProtectedSandApp.s("ᶖ"));
    }

    public void g(@l Socket socket, @l InetSocketAddress address, int connectTimeout) throws IOException {
        l0.p(socket, ProtectedSandApp.s("ᶗ"));
        l0.p(address, ProtectedSandApp.s("ᶘ"));
        socket.connect(address, connectTimeout);
    }

    @l
    public final String i() {
        return ProtectedSandApp.s("ᶙ");
    }

    @fg.m
    public String j(@l SSLSocket sslSocket) {
        l0.p(sslSocket, ProtectedSandApp.s("ᶓ"));
        return null;
    }

    @fg.m
    public Object k(@l String closer) {
        l0.p(closer, ProtectedSandApp.s("ᶚ"));
        if (f84866d.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    public boolean l(@l String hostname) {
        l0.p(hostname, ProtectedSandApp.s("ᶛ"));
        return true;
    }

    public void m(@l String message, int level, @fg.m Throwable t4) {
        l0.p(message, ProtectedSandApp.s("ᶜ"));
        f84866d.log(level == 5 ? Level.WARNING : Level.INFO, message, t4);
    }

    public void o(@l String message, @fg.m Object stackTrace) {
        l0.p(message, ProtectedSandApp.s("ᶜ"));
        if (stackTrace == null) {
            message = androidx.compose.runtime.changelist.j.a(message, ProtectedSandApp.s("ᶝ"));
        }
        m(message, 5, (Throwable) stackTrace);
    }

    @l
    public SSLContext p() {
        SSLContext sSLContext = SSLContext.getInstance(ProtectedSandApp.s("ᶞ"));
        l0.o(sSLContext, ProtectedSandApp.s("ᶟ"));
        return sSLContext;
    }

    @l
    public SSLSocketFactory q(@l X509TrustManager trustManager) {
        l0.p(trustManager, ProtectedSandApp.s("ᶔ"));
        try {
            SSLContext p4 = p();
            p4.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = p4.getSocketFactory();
            l0.o(socketFactory, ProtectedSandApp.s("ᶠ"));
            return socketFactory;
        } catch (GeneralSecurityException e4) {
            throw new AssertionError(ProtectedSandApp.s("ᶡ") + e4, e4);
        }
    }

    @l
    public X509TrustManager r() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        l0.o(trustManagerFactory, ProtectedSandApp.s("ᶢ"));
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        l0.m(trustManagers);
        if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                return (X509TrustManager) trustManager;
            }
            throw new NullPointerException(ProtectedSandApp.s("ᶣ"));
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ᶤ"));
        String arrays = Arrays.toString(trustManagers);
        l0.o(arrays, ProtectedSandApp.s("ᶥ"));
        sb.append(arrays);
        throw new IllegalStateException(sb.toString().toString());
    }

    @fg.m
    public X509TrustManager s(@l SSLSocketFactory sslSocketFactory) {
        l0.p(sslSocketFactory, ProtectedSandApp.s("ᶦ"));
        try {
            Class<?> cls = Class.forName(ProtectedSandApp.s("ᶧ"));
            l0.o(cls, ProtectedSandApp.s("ᶨ"));
            Object Q = okhttp3.internal.d.Q(sslSocketFactory, cls, ProtectedSandApp.s("ᶩ"));
            if (Q != null) {
                return (X509TrustManager) okhttp3.internal.d.Q(Q, X509TrustManager.class, ProtectedSandApp.s("ᶔ"));
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @l
    public String toString() {
        String simpleName = getClass().getSimpleName();
        l0.o(simpleName, ProtectedSandApp.s("ᶪ"));
        return simpleName;
    }
}
