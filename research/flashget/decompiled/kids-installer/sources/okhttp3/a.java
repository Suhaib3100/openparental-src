package okhttp3;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import okhttp3.w;

/* compiled from: Address.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b&\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010M\u001a\u00020+\u0012\u0006\u0010N\u001a\u00020&\u0012\u0006\u00107\u001a\u00020\u0005\u0012\u0006\u0010:\u001a\u00020\b\u0012\b\u0010=\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010@\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010C\u001a\u0004\u0018\u00010 \u0012\u0006\u0010F\u001a\u00020\u000b\u0012\b\u0010I\u001a\u0004\u0018\u00010\u0017\u0012\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e\u0012\u0006\u0010L\u001a\u00020\u0014¢\u0006\u0004\bO\u0010PJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010!\u001a\u0004\u0018\u00010 H\u0007¢\u0006\u0004\b!\u0010\"J\u0013\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010'\u001a\u00020&H\u0016J\u0017\u0010)\u001a\u00020$2\u0006\u0010(\u001a\u00020\u0000H\u0000¢\u0006\u0004\b)\u0010*J\b\u0010,\u001a\u00020+H\u0016R\u0017\u0010/\u001a\u00020\u00028G¢\u0006\f\n\u0004\b!\u0010-\u001a\u0004\b.\u0010\u0004R\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8G¢\u0006\f\n\u0004\b\u0013\u00100\u001a\u0004\b1\u0010\u0011R\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e8G¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b3\u0010\u0011R\u0017\u00107\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u001e\u00105\u001a\u0004\b6\u0010\u0007R\u0017\u0010:\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\u0010\u00108\u001a\u0004\b9\u0010\nR\u0019\u0010=\u001a\u0004\u0018\u00010\u001a8\u0007¢\u0006\f\n\u0004\b\u0018\u0010;\u001a\u0004\b<\u0010\u001cR\u0019\u0010@\u001a\u0004\u0018\u00010\u001d8\u0007¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010\u001fR\u0019\u0010C\u001a\u0004\u0018\u00010 8\u0007¢\u0006\f\n\u0004\b\u0015\u0010A\u001a\u0004\bB\u0010\"R\u0017\u0010F\u001a\u00020\u000b8\u0007¢\u0006\f\n\u0004\b\t\u0010D\u001a\u0004\bE\u0010\rR\u0019\u0010I\u001a\u0004\u0018\u00010\u00178\u0007¢\u0006\f\n\u0004\b\u001b\u0010G\u001a\u0004\bH\u0010\u0019R\u0017\u0010L\u001a\u00020\u00148\u0007¢\u0006\f\n\u0004\b\u0003\u0010J\u001a\u0004\bK\u0010\u0016¨\u0006Q"}, d2 = {"Lokhttp3/a;", "", "Lokhttp3/w;", "k", "()Lokhttp3/w;", "Lokhttp3/q;", "c", "()Lokhttp3/q;", "Ljavax/net/SocketFactory;", "i", "()Ljavax/net/SocketFactory;", "Lokhttp3/b;", "g", "()Lokhttp3/b;", "", "Lokhttp3/d0;", "e", "()Ljava/util/List;", "Lokhttp3/l;", "b", "Ljava/net/ProxySelector;", "h", "()Ljava/net/ProxySelector;", "Ljava/net/Proxy;", "f", "()Ljava/net/Proxy;", "Ljavax/net/ssl/SSLSocketFactory;", "j", "()Ljavax/net/ssl/SSLSocketFactory;", "Ljavax/net/ssl/HostnameVerifier;", "d", "()Ljavax/net/ssl/HostnameVerifier;", "Lokhttp3/g;", "a", "()Lokhttp3/g;", "other", "", "equals", "", "hashCode", "that", "o", "(Lokhttp3/a;)Z", "", "toString", "Lokhttp3/w;", "w", "url", "Ljava/util/List;", "q", "protocols", "m", "connectionSpecs", "Lokhttp3/q;", "n", "dns", "Ljavax/net/SocketFactory;", "u", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "v", "sslSocketFactory", "Ljavax/net/ssl/HostnameVerifier;", "p", "hostnameVerifier", "Lokhttp3/g;", "l", "certificatePinner", "Lokhttp3/b;", "s", "proxyAuthenticator", "Ljava/net/Proxy;", "r", "proxy", "Ljava/net/ProxySelector;", "t", "proxySelector", "uriHost", "uriPort", "<init>", "(Ljava/lang/String;ILokhttp3/q;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lokhttp3/g;Lokhttp3/b;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final w url;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final List<d0> protocols;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final List<l> connectionSpecs;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final q dns;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final SocketFactory socketFactory;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final SSLSocketFactory sslSocketFactory;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final HostnameVerifier hostnameVerifier;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final g certificatePinner;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final b proxyAuthenticator;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final Proxy proxy;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final ProxySelector proxySelector;

    public a(@d5.d String str, int i5, @d5.d q qVar, @d5.d SocketFactory socketFactory, @d5.e SSLSocketFactory sSLSocketFactory, @d5.e HostnameVerifier hostnameVerifier, @d5.e g gVar, @d5.d b bVar, @d5.e Proxy proxy, @d5.d List<? extends d0> list, @d5.d List<l> list2, @d5.d ProxySelector proxySelector) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("廉"));
        kotlin.jvm.internal.l0.p(qVar, ProtectedSandApp.s("廊"));
        kotlin.jvm.internal.l0.p(socketFactory, ProtectedSandApp.s("廋"));
        kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("廌"));
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("廍"));
        kotlin.jvm.internal.l0.p(list2, ProtectedSandApp.s("廎"));
        kotlin.jvm.internal.l0.p(proxySelector, ProtectedSandApp.s("廏"));
        this.dns = qVar;
        this.socketFactory = socketFactory;
        this.sslSocketFactory = sSLSocketFactory;
        this.hostnameVerifier = hostnameVerifier;
        this.certificatePinner = gVar;
        this.proxyAuthenticator = bVar;
        this.proxy = proxy;
        this.proxySelector = proxySelector;
        this.url = new w.a().M(sSLSocketFactory != null ? ProtectedSandApp.s("廐") : ProtectedSandApp.s("廑")).x(str).D(i5).h();
        this.protocols = okhttp3.internal.d.c0(list);
        this.connectionSpecs = okhttp3.internal.d.c0(list2);
    }

    @p3.i(name = "-deprecated_certificatePinner")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "certificatePinner", imports = {}))
    @d5.e
    /* renamed from: a, reason: from getter */
    public final g getCertificatePinner() {
        return this.certificatePinner;
    }

    @p3.i(name = "-deprecated_connectionSpecs")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "connectionSpecs", imports = {}))
    @d5.d
    public final List<l> b() {
        return this.connectionSpecs;
    }

    @p3.i(name = "-deprecated_dns")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "dns", imports = {}))
    @d5.d
    /* renamed from: c, reason: from getter */
    public final q getDns() {
        return this.dns;
    }

    @p3.i(name = "-deprecated_hostnameVerifier")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "hostnameVerifier", imports = {}))
    @d5.e
    /* renamed from: d, reason: from getter */
    public final HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    @p3.i(name = "-deprecated_protocols")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "protocols", imports = {}))
    @d5.d
    public final List<d0> e() {
        return this.protocols;
    }

    public boolean equals(@d5.e Object other) {
        if (other instanceof a) {
            a aVar = (a) other;
            if (kotlin.jvm.internal.l0.g(this.url, aVar.url) && o(aVar)) {
                return true;
            }
        }
        return false;
    }

    @p3.i(name = "-deprecated_proxy")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "proxy", imports = {}))
    @d5.e
    /* renamed from: f, reason: from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    @p3.i(name = "-deprecated_proxyAuthenticator")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "proxyAuthenticator", imports = {}))
    @d5.d
    /* renamed from: g, reason: from getter */
    public final b getProxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @p3.i(name = "-deprecated_proxySelector")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "proxySelector", imports = {}))
    @d5.d
    /* renamed from: h, reason: from getter */
    public final ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    public int hashCode() {
        return Objects.hashCode(this.certificatePinner) + ((Objects.hashCode(this.hostnameVerifier) + ((Objects.hashCode(this.sslSocketFactory) + ((Objects.hashCode(this.proxy) + ((this.proxySelector.hashCode() + ((this.connectionSpecs.hashCode() + ((this.protocols.hashCode() + ((this.proxyAuthenticator.hashCode() + ((this.dns.hashCode() + ((this.url.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @p3.i(name = "-deprecated_socketFactory")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "socketFactory", imports = {}))
    @d5.d
    /* renamed from: i, reason: from getter */
    public final SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    @p3.i(name = "-deprecated_sslSocketFactory")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "sslSocketFactory", imports = {}))
    @d5.e
    /* renamed from: j, reason: from getter */
    public final SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    @p3.i(name = "-deprecated_url")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "url", imports = {}))
    @d5.d
    /* renamed from: k, reason: from getter */
    public final w getUrl() {
        return this.url;
    }

    @p3.i(name = "certificatePinner")
    @d5.e
    public final g l() {
        return this.certificatePinner;
    }

    @p3.i(name = "connectionSpecs")
    @d5.d
    public final List<l> m() {
        return this.connectionSpecs;
    }

    @p3.i(name = "dns")
    @d5.d
    public final q n() {
        return this.dns;
    }

    public final boolean o(@d5.d a that) {
        kotlin.jvm.internal.l0.p(that, ProtectedSandApp.s("廒"));
        return kotlin.jvm.internal.l0.g(this.dns, that.dns) && kotlin.jvm.internal.l0.g(this.proxyAuthenticator, that.proxyAuthenticator) && kotlin.jvm.internal.l0.g(this.protocols, that.protocols) && kotlin.jvm.internal.l0.g(this.connectionSpecs, that.connectionSpecs) && kotlin.jvm.internal.l0.g(this.proxySelector, that.proxySelector) && kotlin.jvm.internal.l0.g(this.proxy, that.proxy) && kotlin.jvm.internal.l0.g(this.sslSocketFactory, that.sslSocketFactory) && kotlin.jvm.internal.l0.g(this.hostnameVerifier, that.hostnameVerifier) && kotlin.jvm.internal.l0.g(this.certificatePinner, that.certificatePinner) && this.url.getPort() == that.url.getPort();
    }

    @p3.i(name = "hostnameVerifier")
    @d5.e
    public final HostnameVerifier p() {
        return this.hostnameVerifier;
    }

    @p3.i(name = "protocols")
    @d5.d
    public final List<d0> q() {
        return this.protocols;
    }

    @p3.i(name = "proxy")
    @d5.e
    public final Proxy r() {
        return this.proxy;
    }

    @p3.i(name = "proxyAuthenticator")
    @d5.d
    public final b s() {
        return this.proxyAuthenticator;
    }

    @p3.i(name = "proxySelector")
    @d5.d
    public final ProxySelector t() {
        return this.proxySelector;
    }

    @d5.d
    public String toString() {
        StringBuilder sb;
        Object obj;
        StringBuilder sb2 = new StringBuilder(ProtectedSandApp.s("廓"));
        sb2.append(this.url.getHost());
        sb2.append(':');
        sb2.append(this.url.getPort());
        sb2.append(ProtectedSandApp.s("廔"));
        if (this.proxy != null) {
            sb = new StringBuilder(ProtectedSandApp.s("廕"));
            obj = this.proxy;
        } else {
            sb = new StringBuilder(ProtectedSandApp.s("廖"));
            obj = this.proxySelector;
        }
        sb.append(obj);
        sb2.append(sb.toString());
        sb2.append(ProtectedSandApp.s("廗"));
        return sb2.toString();
    }

    @p3.i(name = "socketFactory")
    @d5.d
    public final SocketFactory u() {
        return this.socketFactory;
    }

    @p3.i(name = "sslSocketFactory")
    @d5.e
    public final SSLSocketFactory v() {
        return this.sslSocketFactory;
    }

    @p3.i(name = "url")
    @d5.d
    public final w w() {
        return this.url;
    }
}
