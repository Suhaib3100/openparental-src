package okhttp3;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.x0;

/* compiled from: Route.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\u000f¨\u0006\""}, d2 = {"Lokhttp3/h0;", "", "Lokhttp3/a;", "address", "Ljava/net/Proxy;", "proxy", "Ljava/net/InetSocketAddress;", "socketAddress", "<init>", "(Lokhttp3/a;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V", "a", "()Lokhttp3/a;", "b", "()Ljava/net/Proxy;", "c", "()Ljava/net/InetSocketAddress;", "", "f", "()Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lokhttp3/a;", "d", "Ljava/net/Proxy;", "e", "Ljava/net/InetSocketAddress;", "g", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final a address;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Proxy proxy;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final InetSocketAddress socketAddress;

    public h0(@fg.l a aVar, @fg.l Proxy proxy, @fg.l InetSocketAddress inetSocketAddress) {
        l0.p(aVar, ProtectedSandApp.s("齀\u0001"));
        l0.p(proxy, ProtectedSandApp.s("齁\u0001"));
        l0.p(inetSocketAddress, ProtectedSandApp.s("齂\u0001"));
        this.address = aVar;
        this.proxy = proxy;
        this.socketAddress = inetSocketAddress;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "address", imports = {}))
    @kd.i(name = "-deprecated_address")
    /* renamed from: a, reason: from getter */
    public final a getAddress() {
        return this.address;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "proxy", imports = {}))
    @kd.i(name = "-deprecated_proxy")
    /* renamed from: b, reason: from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "socketAddress", imports = {}))
    @kd.i(name = "-deprecated_socketAddress")
    /* renamed from: c, reason: from getter */
    public final InetSocketAddress getSocketAddress() {
        return this.socketAddress;
    }

    @fg.l
    @kd.i(name = "address")
    public final a d() {
        return this.address;
    }

    @fg.l
    @kd.i(name = "proxy")
    public final Proxy e() {
        return this.proxy;
    }

    public boolean equals(@fg.m Object other) {
        if (other instanceof h0) {
            h0 h0Var = (h0) other;
            if (l0.g(h0Var.address, this.address) && l0.g(h0Var.proxy, this.proxy) && l0.g(h0Var.socketAddress, this.socketAddress)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.address.v() != null && this.proxy.type() == Proxy.Type.HTTP;
    }

    @fg.l
    @kd.i(name = "socketAddress")
    public final InetSocketAddress g() {
        return this.socketAddress;
    }

    public int hashCode() {
        return this.socketAddress.hashCode() + ((this.proxy.hashCode() + ((this.address.hashCode() + 527) * 31)) * 31);
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("齃\u0001") + this.socketAddress + '}';
    }
}
