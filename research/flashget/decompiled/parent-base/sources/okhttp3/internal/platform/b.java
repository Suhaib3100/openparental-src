package okhttp3.internal.platform;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import okhttp3.c0;
import okhttp3.internal.platform.android.k;
import okhttp3.internal.platform.android.m;
import okhttp3.internal.platform.android.n;

/* compiled from: AndroidPlatform.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 62\u00020\u0001:\u000278B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J4\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0011\u0010\u0019\u001a\r\u0012\t\u0012\u00070\u0017¢\u0006\u0002\b\u00180\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001e\u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010!J!\u0010$\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u00142\b\u0010#\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020\u000fH\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020-2\u0006\u0010)\u001a\u00020\u000fH\u0016¢\u0006\u0004\b.\u0010/R\u001a\u00102\u001a\b\u0012\u0004\u0012\u0002000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00101R\u0014\u00105\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00104¨\u00069"}, d2 = {"Lokhttp3/internal/platform/b;", "Lokhttp3/internal/platform/j;", "<init>", "()V", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", "", "connectTimeout", "Lkotlin/k2;", "g", "(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "s", "(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/c0;", "Lkd/o;", "protocols", "f", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "j", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "closer", "", "k", "(Ljava/lang/String;)Ljava/lang/Object;", "message", "stackTrace", "o", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "l", "(Ljava/lang/String;)Z", "trustManager", "Lue/c;", "d", "(Ljavax/net/ssl/X509TrustManager;)Lue/c;", "Lue/e;", "e", "(Ljavax/net/ssl/X509TrustManager;)Lue/e;", "Lokhttp3/internal/platform/android/m;", "Ljava/util/List;", "socketAdapters", "Lokhttp3/internal/platform/android/j;", "Lokhttp3/internal/platform/android/j;", "closeGuard", "i", "a", "b", "okhttp"}, k = 1, mv = {1, 4, 0})
@okhttp3.internal.c
/* loaded from: classes3.dex */
public final class b extends j {

    /* renamed from: h, reason: collision with root package name */
    private static final boolean f84836h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<m> socketAdapters;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final okhttp3.internal.platform.android.j closeGuard;

    /* compiled from: AndroidPlatform.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lokhttp3/internal/platform/b$a;", "", "<init>", "()V", "Lokhttp3/internal/platform/j;", "a", "()Lokhttp3/internal/platform/j;", "", "isSupported", "Z", "b", "()Z", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.platform.b$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.m
        public final j a() {
            if (b.f84836h) {
                return new b();
            }
            return null;
        }

        public final boolean b() {
            return b.f84836h;
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    /* compiled from: AndroidPlatform.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001e¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/platform/b$b;", "Lue/e;", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Ljava/lang/reflect/Method;", "findByIssuerAndSignatureMethod", "<init>", "(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)V", "b", "()Ljavax/net/ssl/X509TrustManager;", "c", "()Ljava/lang/reflect/Method;", "Ljava/security/cert/X509Certificate;", "cert", "a", "(Ljava/security/cert/X509Certificate;)Ljava/security/cert/X509Certificate;", "d", "(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)Lokhttp3/internal/platform/b$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljavax/net/ssl/X509TrustManager;", "Ljava/lang/reflect/Method;", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.platform.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1324b implements ue.e {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final X509TrustManager trustManager;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Method findByIssuerAndSignatureMethod;

        public C1324b(@l X509TrustManager x509TrustManager, @l Method method) {
            l0.p(x509TrustManager, ProtectedSandApp.s("ḃ"));
            l0.p(method, ProtectedSandApp.s("Ḅ"));
            this.trustManager = x509TrustManager;
            this.findByIssuerAndSignatureMethod = method;
        }

        /* renamed from: b, reason: from getter */
        private final X509TrustManager getTrustManager() {
            return this.trustManager;
        }

        /* renamed from: c, reason: from getter */
        private final Method getFindByIssuerAndSignatureMethod() {
            return this.findByIssuerAndSignatureMethod;
        }

        public static /* synthetic */ C1324b e(C1324b c1324b, X509TrustManager x509TrustManager, Method method, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                x509TrustManager = c1324b.trustManager;
            }
            if ((i4 & 2) != 0) {
                method = c1324b.findByIssuerAndSignatureMethod;
            }
            return c1324b.d(x509TrustManager, method);
        }

        @Override // ue.e
        @fg.m
        public X509Certificate a(@l X509Certificate cert) {
            l0.p(cert, ProtectedSandApp.s("ḅ"));
            try {
                Object invoke = this.findByIssuerAndSignatureMethod.invoke(this.trustManager, cert);
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new NullPointerException(ProtectedSandApp.s("Ḇ"));
            } catch (IllegalAccessException e4) {
                throw new AssertionError(ProtectedSandApp.s("ḇ"), e4);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        @l
        public final C1324b d(@l X509TrustManager trustManager, @l Method findByIssuerAndSignatureMethod) {
            l0.p(trustManager, ProtectedSandApp.s("ḃ"));
            l0.p(findByIssuerAndSignatureMethod, ProtectedSandApp.s("Ḅ"));
            return new C1324b(trustManager, findByIssuerAndSignatureMethod);
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C1324b)) {
                return false;
            }
            C1324b c1324b = (C1324b) other;
            return l0.g(this.trustManager, c1324b.trustManager) && l0.g(this.findByIssuerAndSignatureMethod, c1324b.findByIssuerAndSignatureMethod);
        }

        public int hashCode() {
            X509TrustManager x509TrustManager = this.trustManager;
            int hashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
            Method method = this.findByIssuerAndSignatureMethod;
            return hashCode + (method != null ? method.hashCode() : 0);
        }

        @l
        public String toString() {
            return ProtectedSandApp.s("Ḉ") + this.trustManager + ProtectedSandApp.s("ḉ") + this.findByIssuerAndSignatureMethod + ProtectedSandApp.s("Ḋ");
        }
    }

    static {
        boolean z4 = false;
        if (j.INSTANCE.h() && Build.VERSION.SDK_INT < 30) {
            z4 = true;
        }
        f84836h = z4;
    }

    public b() {
        m b5 = n.Companion.b(n.INSTANCE, null, 1, null);
        okhttp3.internal.platform.android.h.INSTANCE.getClass();
        okhttp3.internal.platform.android.l lVar = new okhttp3.internal.platform.android.l(okhttp3.internal.platform.android.h.f84815f);
        k.INSTANCE.getClass();
        okhttp3.internal.platform.android.l lVar2 = new okhttp3.internal.platform.android.l(k.f84829a);
        okhttp3.internal.platform.android.i.INSTANCE.getClass();
        List Q = kotlin.collections.w.Q(b5, lVar, lVar2, new okhttp3.internal.platform.android.l(okhttp3.internal.platform.android.i.f84823a));
        ArrayList arrayList = new ArrayList();
        for (Object obj : Q) {
            if (((m) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.socketAdapters = arrayList;
        this.closeGuard = okhttp3.internal.platform.android.j.INSTANCE.a();
    }

    @Override // okhttp3.internal.platform.j
    @l
    public ue.c d(@l X509TrustManager trustManager) {
        l0.p(trustManager, ProtectedSandApp.s("ḋ"));
        okhttp3.internal.platform.android.d a5 = okhttp3.internal.platform.android.d.INSTANCE.a(trustManager);
        return a5 != null ? a5 : super.d(trustManager);
    }

    @Override // okhttp3.internal.platform.j
    @l
    public ue.e e(@l X509TrustManager trustManager) {
        l0.p(trustManager, ProtectedSandApp.s("ḋ"));
        try {
            Method declaredMethod = trustManager.getClass().getDeclaredMethod(ProtectedSandApp.s("Ḍ"), X509Certificate.class);
            l0.o(declaredMethod, ProtectedSandApp.s("ḍ"));
            declaredMethod.setAccessible(true);
            return new C1324b(trustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.e(trustManager);
        }
    }

    @Override // okhttp3.internal.platform.j
    public void f(@l SSLSocket sslSocket, @fg.m String hostname, @l List<c0> protocols) {
        Object obj;
        l0.p(sslSocket, ProtectedSandApp.s("Ḏ"));
        l0.p(protocols, ProtectedSandApp.s("ḏ"));
        Iterator<T> it = this.socketAdapters.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((m) obj).a(sslSocket)) {
                    break;
                }
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            mVar.e(sslSocket, hostname, protocols);
        }
    }

    @Override // okhttp3.internal.platform.j
    public void g(@l Socket socket, @l InetSocketAddress address, int connectTimeout) throws IOException {
        l0.p(socket, ProtectedSandApp.s("Ḑ"));
        l0.p(address, ProtectedSandApp.s("ḑ"));
        try {
            socket.connect(address, connectTimeout);
        } catch (ClassCastException e4) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e4;
            }
            throw new IOException(ProtectedSandApp.s("Ḓ"), e4);
        }
    }

    @Override // okhttp3.internal.platform.j
    @fg.m
    public String j(@l SSLSocket sslSocket) {
        Object obj;
        l0.p(sslSocket, ProtectedSandApp.s("Ḏ"));
        Iterator<T> it = this.socketAdapters.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((m) obj).a(sslSocket)) {
                break;
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            return mVar.b(sslSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.j
    @fg.m
    public Object k(@l String closer) {
        l0.p(closer, ProtectedSandApp.s("ḓ"));
        return this.closeGuard.a(closer);
    }

    @Override // okhttp3.internal.platform.j
    public boolean l(@l String hostname) {
        l0.p(hostname, ProtectedSandApp.s("Ḕ"));
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // okhttp3.internal.platform.j
    public void o(@l String message, @fg.m Object stackTrace) {
        l0.p(message, ProtectedSandApp.s("ḕ"));
        if (this.closeGuard.b(stackTrace)) {
            return;
        }
        j.n(this, message, 5, null, 4, null);
    }

    @Override // okhttp3.internal.platform.j
    @fg.m
    public X509TrustManager s(@l SSLSocketFactory sslSocketFactory) {
        Object obj;
        l0.p(sslSocketFactory, ProtectedSandApp.s("Ḗ"));
        Iterator<T> it = this.socketAdapters.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((m) obj).d(sslSocketFactory)) {
                break;
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            return mVar.c(sslSocketFactory);
        }
        return null;
    }
}
