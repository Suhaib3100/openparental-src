package okhttp3.internal.platform;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.flashget.kidsdownloader.ProtectedSandApp;
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
import kotlin.collections.a0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import okhttp3.d0;
import okhttp3.internal.platform.android.k;
import okhttp3.internal.platform.android.l;
import okhttp3.internal.platform.android.m;
import okhttp3.internal.platform.android.n;

/* compiled from: AndroidPlatform.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 -2\u00020\u0001:\u0002./B\u0007¢\u0006\u0004\b+\u0010,J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J-\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0011\u0010\u0015\u001a\r\u0012\t\u0012\u00070\u0013¢\u0006\u0002\b\u00140\u0012H\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J\u001a\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\fH\u0016J\u0010\u0010$\u001a\u00020#2\u0006\u0010 \u001a\u00020\fH\u0016R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020%0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)¨\u00060"}, d2 = {"Lokhttp3/internal/platform/b;", "Lokhttp3/internal/platform/j;", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", "", "connectTimeout", "Lkotlin/m2;", "g", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "s", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/d0;", "Lp3/o;", "protocols", "f", "j", "closer", "", "k", "message", "stackTrace", "o", "", "l", "trustManager", "Lu4/c;", "d", "Lu4/e;", "e", "Lokhttp3/internal/platform/android/m;", "Ljava/util/List;", "socketAdapters", "Lokhttp3/internal/platform/android/j;", "Lokhttp3/internal/platform/android/j;", "closeGuard", "<init>", "()V", "i", "a", "b", "okhttp"}, k = 1, mv = {1, 4, 0})
@okhttp3.internal.c
/* loaded from: classes5.dex */
public final class b extends j {

    /* renamed from: h, reason: collision with root package name */
    private static final boolean f31296h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<m> socketAdapters;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final okhttp3.internal.platform.android.j closeGuard;

    /* compiled from: AndroidPlatform.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/platform/b$a;", "", "Lokhttp3/internal/platform/j;", "a", "", "isSupported", "Z", "b", "()Z", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.platform.b$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @d5.e
        public final j a() {
            if (b.f31296h) {
                return new b();
            }
            return null;
        }

        public final boolean b() {
            return b.f31296h;
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    /* compiled from: AndroidPlatform.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÂ\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0004HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0018"}, d2 = {"Lokhttp3/internal/platform/b$b;", "Lu4/e;", "Ljavax/net/ssl/X509TrustManager;", "b", "Ljava/lang/reflect/Method;", "c", "Ljava/security/cert/X509Certificate;", "cert", "a", "trustManager", "findByIssuerAndSignatureMethod", "d", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljavax/net/ssl/X509TrustManager;", "Ljava/lang/reflect/Method;", "<init>", "(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.platform.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0485b implements u4.e {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final X509TrustManager trustManager;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Method findByIssuerAndSignatureMethod;

        public C0485b(@d5.d X509TrustManager x509TrustManager, @d5.d Method method) {
            l0.p(x509TrustManager, ProtectedSandApp.s("敿"));
            l0.p(method, ProtectedSandApp.s("斀"));
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

        public static /* synthetic */ C0485b e(C0485b c0485b, X509TrustManager x509TrustManager, Method method, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                x509TrustManager = c0485b.trustManager;
            }
            if ((i5 & 2) != 0) {
                method = c0485b.findByIssuerAndSignatureMethod;
            }
            return c0485b.d(x509TrustManager, method);
        }

        @Override // u4.e
        @d5.e
        public X509Certificate a(@d5.d X509Certificate cert) {
            l0.p(cert, ProtectedSandApp.s("斁"));
            try {
                Object invoke = this.findByIssuerAndSignatureMethod.invoke(this.trustManager, cert);
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new NullPointerException(ProtectedSandApp.s("斂"));
            } catch (IllegalAccessException e6) {
                throw new AssertionError(ProtectedSandApp.s("斃"), e6);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        @d5.d
        public final C0485b d(@d5.d X509TrustManager trustManager, @d5.d Method findByIssuerAndSignatureMethod) {
            l0.p(trustManager, ProtectedSandApp.s("斄"));
            l0.p(findByIssuerAndSignatureMethod, ProtectedSandApp.s("斅"));
            return new C0485b(trustManager, findByIssuerAndSignatureMethod);
        }

        public boolean equals(@d5.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C0485b)) {
                return false;
            }
            C0485b c0485b = (C0485b) other;
            return l0.g(this.trustManager, c0485b.trustManager) && l0.g(this.findByIssuerAndSignatureMethod, c0485b.findByIssuerAndSignatureMethod);
        }

        public int hashCode() {
            X509TrustManager x509TrustManager = this.trustManager;
            int hashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
            Method method = this.findByIssuerAndSignatureMethod;
            return hashCode + (method != null ? method.hashCode() : 0);
        }

        @d5.d
        public String toString() {
            return ProtectedSandApp.s("斆") + this.trustManager + ProtectedSandApp.s("文") + this.findByIssuerAndSignatureMethod + ProtectedSandApp.s("斈");
        }
    }

    static {
        boolean z5 = false;
        if (j.INSTANCE.h() && Build.VERSION.SDK_INT < 30) {
            z5 = true;
        }
        f31296h = z5;
    }

    public b() {
        List Q;
        okhttp3.internal.platform.android.h.INSTANCE.getClass();
        k.INSTANCE.getClass();
        okhttp3.internal.platform.android.i.INSTANCE.getClass();
        Q = a0.Q(n.Companion.b(n.INSTANCE, null, 1, null), new l(okhttp3.internal.platform.android.h.f31275f), new l(k.f31289a), new l(okhttp3.internal.platform.android.i.f31283a));
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
    @d5.d
    public u4.c d(@d5.d X509TrustManager trustManager) {
        l0.p(trustManager, ProtectedSandApp.s("斉"));
        okhttp3.internal.platform.android.d a6 = okhttp3.internal.platform.android.d.INSTANCE.a(trustManager);
        return a6 != null ? a6 : super.d(trustManager);
    }

    @Override // okhttp3.internal.platform.j
    @d5.d
    public u4.e e(@d5.d X509TrustManager trustManager) {
        l0.p(trustManager, ProtectedSandApp.s("斊"));
        try {
            Method declaredMethod = trustManager.getClass().getDeclaredMethod(ProtectedSandApp.s("斋"), X509Certificate.class);
            l0.o(declaredMethod, ProtectedSandApp.s("斌"));
            declaredMethod.setAccessible(true);
            return new C0485b(trustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.e(trustManager);
        }
    }

    @Override // okhttp3.internal.platform.j
    public void f(@d5.d SSLSocket sSLSocket, @d5.e String str, @d5.d List<d0> list) {
        Object obj;
        l0.p(sSLSocket, ProtectedSandApp.s("斍"));
        l0.p(list, ProtectedSandApp.s("斎"));
        Iterator<T> it = this.socketAdapters.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((m) obj).a(sSLSocket)) {
                    break;
                }
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            mVar.e(sSLSocket, str, list);
        }
    }

    @Override // okhttp3.internal.platform.j
    public void g(@d5.d Socket socket, @d5.d InetSocketAddress inetSocketAddress, int i5) throws IOException {
        l0.p(socket, ProtectedSandApp.s("斏"));
        l0.p(inetSocketAddress, ProtectedSandApp.s("斐"));
        try {
            socket.connect(inetSocketAddress, i5);
        } catch (ClassCastException e6) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e6;
            }
            throw new IOException(ProtectedSandApp.s("斑"), e6);
        }
    }

    @Override // okhttp3.internal.platform.j
    @d5.e
    public String j(@d5.d SSLSocket sslSocket) {
        Object obj;
        l0.p(sslSocket, ProtectedSandApp.s("斒"));
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
    @d5.e
    public Object k(@d5.d String closer) {
        l0.p(closer, ProtectedSandApp.s("斓"));
        return this.closeGuard.a(closer);
    }

    @Override // okhttp3.internal.platform.j
    public boolean l(@d5.d String hostname) {
        l0.p(hostname, ProtectedSandApp.s("斔"));
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // okhttp3.internal.platform.j
    public void o(@d5.d String str, @d5.e Object obj) {
        l0.p(str, ProtectedSandApp.s("斕"));
        if (this.closeGuard.b(obj)) {
            return;
        }
        j.n(this, str, 5, null, 4, null);
    }

    @Override // okhttp3.internal.platform.j
    @d5.e
    public X509TrustManager s(@d5.d SSLSocketFactory sslSocketFactory) {
        Object obj;
        l0.p(sslSocketFactory, ProtectedSandApp.s("斖"));
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
