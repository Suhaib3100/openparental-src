package okhttp3;

import androidx.compose.ui.graphics.k6;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.x0;
import okhttp3.v;

/* compiled from: Address.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b \u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H\u0007¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0010H\u0007¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0007¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014H\u0007¢\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u00020\u0019H\u0007¢\u0006\u0004\b)\u0010*J\u0011\u0010+\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b+\u0010,J\u0011\u0010-\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b-\u0010.J\u0011\u0010/\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b/\u00100J\u0011\u00101\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0004H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u0002042\u0006\u00109\u001a\u00020\u0000H\u0000¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0002H\u0016¢\u0006\u0004\b<\u0010=R\u0017\u0010@\u001a\u00020\u001d8G¢\u0006\f\n\u0004\b1\u0010>\u001a\u0004\b?\u0010\u001fR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148G¢\u0006\f\n\u0004\b(\u0010A\u001a\u0004\bB\u0010'R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00148G¢\u0006\f\n\u0004\b \u0010A\u001a\u0004\bC\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b/\u0010D\u001a\u0004\bE\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b&\u0010F\u001a\u0004\bG\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007¢\u0006\f\n\u0004\b+\u0010H\u001a\u0004\bI\u0010.R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0007¢\u0006\f\n\u0004\b$\u0010J\u001a\u0004\bK\u00100R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007¢\u0006\f\n\u0004\b)\u0010L\u001a\u0004\bM\u00102R\u0017\u0010\u0011\u001a\u00020\u00108\u0007¢\u0006\f\n\u0004\b\"\u0010N\u001a\u0004\bO\u0010%R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007¢\u0006\f\n\u0004\b-\u0010P\u001a\u0004\bQ\u0010,R\u0017\u0010\u001a\u001a\u00020\u00198\u0007¢\u0006\f\n\u0004\b\u001e\u0010R\u001a\u0004\bS\u0010*¨\u0006T"}, d2 = {"Lokhttp3/a;", "", "", "uriHost", "", "uriPort", "Lokhttp3/q;", "dns", "Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lokhttp3/g;", "certificatePinner", "Lokhttp3/b;", "proxyAuthenticator", "Ljava/net/Proxy;", "proxy", "", "Lokhttp3/c0;", "protocols", "Lokhttp3/l;", "connectionSpecs", "Ljava/net/ProxySelector;", "proxySelector", "<init>", "(Ljava/lang/String;ILokhttp3/q;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lokhttp3/g;Lokhttp3/b;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V", "Lokhttp3/v;", "k", "()Lokhttp3/v;", "c", "()Lokhttp3/q;", "i", "()Ljavax/net/SocketFactory;", "g", "()Lokhttp3/b;", "e", "()Ljava/util/List;", "b", "h", "()Ljava/net/ProxySelector;", "f", "()Ljava/net/Proxy;", "j", "()Ljavax/net/ssl/SSLSocketFactory;", "d", "()Ljavax/net/ssl/HostnameVerifier;", "a", "()Lokhttp3/g;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "that", "o", "(Lokhttp3/a;)Z", "toString", "()Ljava/lang/String;", "Lokhttp3/v;", "w", "url", "Ljava/util/List;", "q", "m", "Lokhttp3/q;", "n", "Ljavax/net/SocketFactory;", "u", "Ljavax/net/ssl/SSLSocketFactory;", "v", "Ljavax/net/ssl/HostnameVerifier;", "p", "Lokhttp3/g;", "l", "Lokhttp3/b;", "s", "Ljava/net/Proxy;", "r", "Ljava/net/ProxySelector;", "t", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final v url;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<c0> protocols;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<l> connectionSpecs;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final q dns;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final SocketFactory socketFactory;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final SSLSocketFactory sslSocketFactory;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final HostnameVerifier hostnameVerifier;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final g certificatePinner;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b proxyAuthenticator;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Proxy proxy;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ProxySelector proxySelector;

    public a(@fg.l String str, int i4, @fg.l q qVar, @fg.l SocketFactory socketFactory, @fg.m SSLSocketFactory sSLSocketFactory, @fg.m HostnameVerifier hostnameVerifier, @fg.m g gVar, @fg.l b bVar, @fg.m Proxy proxy, @fg.l List<? extends c0> list, @fg.l List<l> list2, @fg.l ProxySelector proxySelector) {
        l0.p(str, ProtectedSandApp.s("鸡\u0001"));
        l0.p(qVar, ProtectedSandApp.s("鸢\u0001"));
        l0.p(socketFactory, ProtectedSandApp.s("鸣\u0001"));
        l0.p(bVar, ProtectedSandApp.s("鸤\u0001"));
        l0.p(list, ProtectedSandApp.s("鸥\u0001"));
        l0.p(list2, ProtectedSandApp.s("鸦\u0001"));
        l0.p(proxySelector, ProtectedSandApp.s("鸧\u0001"));
        this.dns = qVar;
        this.socketFactory = socketFactory;
        this.sslSocketFactory = sSLSocketFactory;
        this.hostnameVerifier = hostnameVerifier;
        this.certificatePinner = gVar;
        this.proxyAuthenticator = bVar;
        this.proxy = proxy;
        this.proxySelector = proxySelector;
        this.url = new v.a().M(sSLSocketFactory != null ? ProtectedSandApp.s("鸨\u0001") : ProtectedSandApp.s("鸩\u0001")).x(str).D(i4).h();
        this.protocols = okhttp3.internal.d.c0(list);
        this.connectionSpecs = okhttp3.internal.d.c0(list2);
    }

    @fg.m
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "certificatePinner", imports = {}))
    @kd.i(name = "-deprecated_certificatePinner")
    /* renamed from: a, reason: from getter */
    public final g getCertificatePinner() {
        return this.certificatePinner;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "connectionSpecs", imports = {}))
    @kd.i(name = "-deprecated_connectionSpecs")
    public final List<l> b() {
        return this.connectionSpecs;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "dns", imports = {}))
    @kd.i(name = "-deprecated_dns")
    /* renamed from: c, reason: from getter */
    public final q getDns() {
        return this.dns;
    }

    @fg.m
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "hostnameVerifier", imports = {}))
    @kd.i(name = "-deprecated_hostnameVerifier")
    /* renamed from: d, reason: from getter */
    public final HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "protocols", imports = {}))
    @kd.i(name = "-deprecated_protocols")
    public final List<c0> e() {
        return this.protocols;
    }

    public boolean equals(@fg.m Object other) {
        if (other instanceof a) {
            a aVar = (a) other;
            if (l0.g(this.url, aVar.url) && o(aVar)) {
                return true;
            }
        }
        return false;
    }

    @fg.m
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "proxy", imports = {}))
    @kd.i(name = "-deprecated_proxy")
    /* renamed from: f, reason: from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "proxyAuthenticator", imports = {}))
    @kd.i(name = "-deprecated_proxyAuthenticator")
    /* renamed from: g, reason: from getter */
    public final b getProxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "proxySelector", imports = {}))
    @kd.i(name = "-deprecated_proxySelector")
    /* renamed from: h, reason: from getter */
    public final ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    public int hashCode() {
        return Objects.hashCode(this.certificatePinner) + ((Objects.hashCode(this.hostnameVerifier) + ((Objects.hashCode(this.sslSocketFactory) + ((Objects.hashCode(this.proxy) + ((this.proxySelector.hashCode() + k6.a(this.connectionSpecs, k6.a(this.protocols, (this.proxyAuthenticator.hashCode() + ((this.dns.hashCode() + ((this.url.hashCode() + 527) * 31)) * 31)) * 31, 31), 31)) * 31)) * 31)) * 31)) * 31);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "socketFactory", imports = {}))
    @kd.i(name = "-deprecated_socketFactory")
    /* renamed from: i, reason: from getter */
    public final SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    @fg.m
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "sslSocketFactory", imports = {}))
    @kd.i(name = "-deprecated_sslSocketFactory")
    /* renamed from: j, reason: from getter */
    public final SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "url", imports = {}))
    @kd.i(name = "-deprecated_url")
    /* renamed from: k, reason: from getter */
    public final v getUrl() {
        return this.url;
    }

    @fg.m
    @kd.i(name = "certificatePinner")
    public final g l() {
        return this.certificatePinner;
    }

    @fg.l
    @kd.i(name = "connectionSpecs")
    public final List<l> m() {
        return this.connectionSpecs;
    }

    @fg.l
    @kd.i(name = "dns")
    public final q n() {
        return this.dns;
    }

    public final boolean o(@fg.l a that) {
        l0.p(that, ProtectedSandApp.s("鸪\u0001"));
        return l0.g(this.dns, that.dns) && l0.g(this.proxyAuthenticator, that.proxyAuthenticator) && l0.g(this.protocols, that.protocols) && l0.g(this.connectionSpecs, that.connectionSpecs) && l0.g(this.proxySelector, that.proxySelector) && l0.g(this.proxy, that.proxy) && l0.g(this.sslSocketFactory, that.sslSocketFactory) && l0.g(this.hostnameVerifier, that.hostnameVerifier) && l0.g(this.certificatePinner, that.certificatePinner) && this.url.getPort() == that.url.getPort();
    }

    @fg.m
    @kd.i(name = "hostnameVerifier")
    public final HostnameVerifier p() {
        return this.hostnameVerifier;
    }

    @fg.l
    @kd.i(name = "protocols")
    public final List<c0> q() {
        return this.protocols;
    }

    @fg.m
    @kd.i(name = "proxy")
    public final Proxy r() {
        return this.proxy;
    }

    @fg.l
    @kd.i(name = "proxyAuthenticator")
    public final b s() {
        return this.proxyAuthenticator;
    }

    @fg.l
    @kd.i(name = "proxySelector")
    public final ProxySelector t() {
        return this.proxySelector;
    }

    @fg.l
    public String toString() {
        StringBuilder sb;
        Object obj;
        StringBuilder sb2 = new StringBuilder(ProtectedSandApp.s("鸫\u0001"));
        sb2.append(this.url.getHost());
        sb2.append(':');
        sb2.append(this.url.getPort());
        sb2.append(ProtectedSandApp.s("鸬\u0001"));
        if (this.proxy != null) {
            sb = new StringBuilder(ProtectedSandApp.s("鸭\u0001"));
            obj = this.proxy;
        } else {
            sb = new StringBuilder(ProtectedSandApp.s("鸮\u0001"));
            obj = this.proxySelector;
        }
        sb.append(obj);
        return android.support.v4.media.c.a(sb2, sb.toString(), ProtectedSandApp.s("鸯\u0001"));
    }

    @fg.l
    @kd.i(name = "socketFactory")
    public final SocketFactory u() {
        return this.socketFactory;
    }

    @fg.m
    @kd.i(name = "sslSocketFactory")
    public final SSLSocketFactory v() {
        return this.sslSocketFactory;
    }

    @fg.l
    @kd.i(name = "url")
    public final v w() {
        return this.url;
    }
}
