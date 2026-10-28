package okhttp3.internal.platform;

import com.flashget.kidsdownloader.ProtectedSandApp;
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
import kotlin.Metadata;
import kotlin.collections.b0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import okhttp3.c0;
import okhttp3.d0;
import okio.m;
import p3.n;

/* compiled from: Platform.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 ,2\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b/\u00100J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J-\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0011\u0010\u0011\u001a\r\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\u00100\u000eH\u0016J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J \u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J&\u0010!\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u001a2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010#\u001a\u00020\"2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0012\u0010%\u001a\u0004\u0018\u00010\u00012\u0006\u0010$\u001a\u00020\u0002H\u0016J\u001a\u0010'\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u0016J\u0010\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020\u0006H\u0016J\u0010\u0010,\u001a\u00020+2\u0006\u0010(\u001a\u00020\u0006H\u0016J\u0010\u0010-\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u0006H\u0016J\b\u0010.\u001a\u00020\u0002H\u0016¨\u00062"}, d2 = {"Lokhttp3/internal/platform/j;", "", "", "i", "Ljavax/net/ssl/SSLContext;", "p", "Ljavax/net/ssl/X509TrustManager;", "r", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "s", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "hostname", "", "Lokhttp3/d0;", "Lp3/o;", "protocols", "Lkotlin/m2;", "f", "c", "j", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", "", "connectTimeout", "g", "message", "level", "", "t", "m", "", "l", "closer", "k", "stackTrace", "o", "trustManager", "Lu4/c;", "d", "Lu4/e;", "e", "q", "toString", "<init>", "()V", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static volatile j f31323a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final int f31324b = 4;

    /* renamed from: c, reason: collision with root package name */
    public static final int f31325c = 5;

    /* renamed from: d, reason: collision with root package name */
    private static final Logger f31326d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* compiled from: Platform.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0002J\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0014\u0010\u0010\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u0014\u0010\u0014\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u001a\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u001b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u001c\u0010!\u001a\n  *\u0004\u0018\u00010\u001f0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010#¨\u0006&"}, d2 = {"Lokhttp3/internal/platform/j$a;", "", "Lokhttp3/internal/platform/j;", "f", "d", "e", "g", "platform", "Lkotlin/m2;", "l", "", "Lokhttp3/d0;", "protocols", "", "b", "", "c", "", "j", "()Z", "isConscryptPreferred", "k", "isOpenJSSEPreferred", "i", "isBouncyCastlePreferred", "h", "isAndroid", "", "INFO", "I", "WARN", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "Lokhttp3/internal/platform/j;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.platform.j$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        private final j d() {
            okhttp3.internal.platform.android.e.f31273d.b();
            j a6 = a.INSTANCE.a();
            if (a6 != null) {
                return a6;
            }
            j a7 = b.INSTANCE.a();
            l0.m(a7);
            return a7;
        }

        private final j e() {
            i a6;
            c a7;
            d c6;
            if (j() && (c6 = d.INSTANCE.c()) != null) {
                return c6;
            }
            if (i() && (a7 = c.INSTANCE.a()) != null) {
                return a7;
            }
            if (k() && (a6 = i.INSTANCE.a()) != null) {
                return a6;
            }
            h a8 = h.INSTANCE.a();
            if (a8 != null) {
                return a8;
            }
            j a9 = e.INSTANCE.a();
            return a9 != null ? a9 : new j();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final j f() {
            return h() ? d() : e();
        }

        private final boolean i() {
            Provider provider = Security.getProviders()[0];
            l0.o(provider, ProtectedSandApp.s("旂"));
            return l0.g(ProtectedSandApp.s("旃"), provider.getName());
        }

        private final boolean j() {
            Provider provider = Security.getProviders()[0];
            l0.o(provider, ProtectedSandApp.s("旄"));
            return l0.g(ProtectedSandApp.s("旅"), provider.getName());
        }

        private final boolean k() {
            Provider provider = Security.getProviders()[0];
            l0.o(provider, ProtectedSandApp.s("旆"));
            return l0.g(ProtectedSandApp.s("旇"), provider.getName());
        }

        public static /* synthetic */ void m(Companion companion, j jVar, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                jVar = companion.f();
            }
            companion.l(jVar);
        }

        @d5.d
        public final List<String> b(@d5.d List<? extends d0> protocols) {
            int b02;
            l0.p(protocols, ProtectedSandApp.s("旈"));
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((d0) obj) != d0.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            b02 = b0.b0(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(b02);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((d0) it.next()).getProtocol());
            }
            return arrayList2;
        }

        @d5.d
        public final byte[] c(@d5.d List<? extends d0> protocols) {
            l0.p(protocols, ProtectedSandApp.s("旉"));
            m mVar = new m();
            for (String str : b(protocols)) {
                mVar.writeByte(str.length());
                mVar.j0(str);
            }
            return mVar.I();
        }

        @d5.d
        @n
        public final j g() {
            return j.f31323a;
        }

        public final boolean h() {
            return l0.g(ProtectedSandApp.s("旋"), System.getProperty(ProtectedSandApp.s("旊")));
        }

        public final void l(@d5.d j jVar) {
            l0.p(jVar, ProtectedSandApp.s("旌"));
            j.f31323a = jVar;
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f31323a = companion.f();
        f31326d = Logger.getLogger(c0.class.getName());
    }

    @d5.d
    @n
    public static final j h() {
        INSTANCE.getClass();
        return f31323a;
    }

    public static /* synthetic */ void n(j jVar, String str, int i5, Throwable th, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("擻"));
        }
        if ((i6 & 2) != 0) {
            i5 = 4;
        }
        if ((i6 & 4) != 0) {
            th = null;
        }
        jVar.m(str, i5, th);
    }

    public void c(@d5.d SSLSocket sSLSocket) {
        l0.p(sSLSocket, ProtectedSandApp.s("擼"));
    }

    @d5.d
    public u4.c d(@d5.d X509TrustManager trustManager) {
        l0.p(trustManager, ProtectedSandApp.s("擽"));
        return new u4.a(e(trustManager));
    }

    @d5.d
    public u4.e e(@d5.d X509TrustManager trustManager) {
        l0.p(trustManager, ProtectedSandApp.s("擾"));
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        l0.o(acceptedIssuers, ProtectedSandApp.s("擿"));
        return new u4.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void f(@d5.d SSLSocket sSLSocket, @d5.e String str, @d5.d List<d0> list) {
        l0.p(sSLSocket, ProtectedSandApp.s("攀"));
        l0.p(list, ProtectedSandApp.s("攁"));
    }

    public void g(@d5.d Socket socket, @d5.d InetSocketAddress inetSocketAddress, int i5) throws IOException {
        l0.p(socket, ProtectedSandApp.s("攂"));
        l0.p(inetSocketAddress, ProtectedSandApp.s("攃"));
        socket.connect(inetSocketAddress, i5);
    }

    @d5.d
    public final String i() {
        return ProtectedSandApp.s("攄");
    }

    @d5.e
    public String j(@d5.d SSLSocket sslSocket) {
        l0.p(sslSocket, ProtectedSandApp.s("攅"));
        return null;
    }

    @d5.e
    public Object k(@d5.d String closer) {
        l0.p(closer, ProtectedSandApp.s("攆"));
        if (f31326d.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    public boolean l(@d5.d String hostname) {
        l0.p(hostname, ProtectedSandApp.s("攇"));
        return true;
    }

    public void m(@d5.d String str, int i5, @d5.e Throwable th) {
        l0.p(str, ProtectedSandApp.s("攈"));
        f31326d.log(i5 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void o(@d5.d String str, @d5.e Object obj) {
        l0.p(str, ProtectedSandApp.s("攉"));
        if (obj == null) {
            str = androidx.concurrent.futures.b.a(str, ProtectedSandApp.s("攊"));
        }
        m(str, 5, (Throwable) obj);
    }

    @d5.d
    public SSLContext p() {
        SSLContext sSLContext = SSLContext.getInstance(ProtectedSandApp.s("攋"));
        l0.o(sSLContext, ProtectedSandApp.s("攌"));
        return sSLContext;
    }

    @d5.d
    public SSLSocketFactory q(@d5.d X509TrustManager trustManager) {
        l0.p(trustManager, ProtectedSandApp.s("攍"));
        try {
            SSLContext p5 = p();
            p5.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = p5.getSocketFactory();
            l0.o(socketFactory, ProtectedSandApp.s("攎"));
            return socketFactory;
        } catch (GeneralSecurityException e6) {
            throw new AssertionError(ProtectedSandApp.s("攏") + e6, e6);
        }
    }

    @d5.d
    public X509TrustManager r() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        l0.o(trustManagerFactory, ProtectedSandApp.s("攐"));
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        l0.m(trustManagers);
        if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                return (X509TrustManager) trustManager;
            }
            throw new NullPointerException(ProtectedSandApp.s("攑"));
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("攒"));
        String arrays = Arrays.toString(trustManagers);
        l0.o(arrays, ProtectedSandApp.s("攓"));
        sb.append(arrays);
        throw new IllegalStateException(sb.toString().toString());
    }

    @d5.e
    public X509TrustManager s(@d5.d SSLSocketFactory sslSocketFactory) {
        l0.p(sslSocketFactory, ProtectedSandApp.s("攔"));
        try {
            Class<?> cls = Class.forName(ProtectedSandApp.s("攕"));
            l0.o(cls, ProtectedSandApp.s("攖"));
            Object Q = okhttp3.internal.d.Q(sslSocketFactory, cls, ProtectedSandApp.s("攗"));
            if (Q != null) {
                return (X509TrustManager) okhttp3.internal.d.Q(Q, X509TrustManager.class, ProtectedSandApp.s("攘"));
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @d5.d
    public String toString() {
        String simpleName = getClass().getSimpleName();
        l0.o(simpleName, ProtectedSandApp.s("攙"));
        return simpleName;
    }
}
