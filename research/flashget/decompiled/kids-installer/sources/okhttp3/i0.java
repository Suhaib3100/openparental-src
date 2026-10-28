package okhttp3;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;

/* compiled from: Route.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\f\u001a\u00020\u000bJ\u0013\u0010\u000e\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0017\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004R\u0017\u0010\u0018\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007R\u0017\u0010\u001b\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\n¨\u0006\u001e"}, d2 = {"Lokhttp3/i0;", "", "Lokhttp3/a;", "a", "()Lokhttp3/a;", "Ljava/net/Proxy;", "b", "()Ljava/net/Proxy;", "Ljava/net/InetSocketAddress;", "c", "()Ljava/net/InetSocketAddress;", "", "f", "other", "equals", "", "hashCode", "", "toString", "Lokhttp3/a;", "d", "address", "Ljava/net/Proxy;", "e", "proxy", "Ljava/net/InetSocketAddress;", "g", "socketAddress", "<init>", "(Lokhttp3/a;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final a address;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final Proxy proxy;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final InetSocketAddress socketAddress;

    public i0(@d5.d a aVar, @d5.d Proxy proxy, @d5.d InetSocketAddress inetSocketAddress) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("恈"));
        kotlin.jvm.internal.l0.p(proxy, ProtectedSandApp.s("恉"));
        kotlin.jvm.internal.l0.p(inetSocketAddress, ProtectedSandApp.s("恊"));
        this.address = aVar;
        this.proxy = proxy;
        this.socketAddress = inetSocketAddress;
    }

    @p3.i(name = "-deprecated_address")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "address", imports = {}))
    @d5.d
    /* renamed from: a, reason: from getter */
    public final a getAddress() {
        return this.address;
    }

    @p3.i(name = "-deprecated_proxy")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "proxy", imports = {}))
    @d5.d
    /* renamed from: b, reason: from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    @p3.i(name = "-deprecated_socketAddress")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "socketAddress", imports = {}))
    @d5.d
    /* renamed from: c, reason: from getter */
    public final InetSocketAddress getSocketAddress() {
        return this.socketAddress;
    }

    @p3.i(name = "address")
    @d5.d
    public final a d() {
        return this.address;
    }

    @p3.i(name = "proxy")
    @d5.d
    public final Proxy e() {
        return this.proxy;
    }

    public boolean equals(@d5.e Object other) {
        if (other instanceof i0) {
            i0 i0Var = (i0) other;
            if (kotlin.jvm.internal.l0.g(i0Var.address, this.address) && kotlin.jvm.internal.l0.g(i0Var.proxy, this.proxy) && kotlin.jvm.internal.l0.g(i0Var.socketAddress, this.socketAddress)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.address.v() != null && this.proxy.type() == Proxy.Type.HTTP;
    }

    @p3.i(name = "socketAddress")
    @d5.d
    public final InetSocketAddress g() {
        return this.socketAddress;
    }

    public int hashCode() {
        return this.socketAddress.hashCode() + ((this.proxy.hashCode() + ((this.address.hashCode() + 527) * 31)) * 31);
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("恋") + this.socketAddress + '}';
    }
}
