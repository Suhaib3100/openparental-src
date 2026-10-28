package okhttp3.internal.connection;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.f0;
import kotlin.collections.z;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import okhttp3.i0;
import okhttp3.r;

/* compiled from: RouteSelector.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 *2\u00020\u0001:\u0002\u0010\fB'\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\u0006\u0010#\u001a\u00020!\u0012\u0006\u0010'\u001a\u00020$¢\u0006\u0004\b(\u0010)J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\t\u0010\f\u001a\u00020\bH\u0086\u0002J\t\u0010\u000e\u001a\u00020\rH\u0086\u0002R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lokhttp3/internal/connection/j;", "", "Lokhttp3/w;", "url", "Ljava/net/Proxy;", "proxy", "Lkotlin/m2;", "g", "", "c", "e", "f", "b", "Lokhttp3/internal/connection/j$b;", "d", "", "a", "Ljava/util/List;", "proxies", "", "I", "nextProxyIndex", "Ljava/net/InetSocketAddress;", "inetSocketAddresses", "", "Lokhttp3/i0;", "postponedRoutes", "Lokhttp3/a;", "Lokhttp3/a;", "address", "Lokhttp3/internal/connection/i;", "Lokhttp3/internal/connection/i;", "routeDatabase", "Lokhttp3/e;", "Lokhttp3/e;", "call", "Lokhttp3/r;", "h", "Lokhttp3/r;", "eventListener", "<init>", "(Lokhttp3/a;Lokhttp3/internal/connection/i;Lokhttp3/e;Lokhttp3/r;)V", "i", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private List<? extends Proxy> proxies;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int nextProxyIndex;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private List<? extends InetSocketAddress> inetSocketAddresses;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<i0> postponedRoutes;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final okhttp3.a address;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final i routeDatabase;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final okhttp3.e call;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final r eventListener;

    /* compiled from: RouteSelector.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u0006\u001a\u00020\u0003*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lokhttp3/internal/connection/j$a;", "", "Ljava/net/InetSocketAddress;", "", "a", "(Ljava/net/InetSocketAddress;)Ljava/lang/String;", "socketHost", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.connection.j$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @d5.d
        public final String a(@d5.d InetSocketAddress inetSocketAddress) {
            l0.p(inetSocketAddress, ProtectedSandApp.s("托"));
            InetAddress address = inetSocketAddress.getAddress();
            if (address != null) {
                String hostAddress = address.getHostAddress();
                l0.o(hostAddress, ProtectedSandApp.s("扙"));
                return hostAddress;
            }
            String hostName = inetSocketAddress.getHostName();
            l0.o(hostName, ProtectedSandApp.s("扚"));
            return hostName;
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: RouteSelector.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u0086\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\u0007\u0010\f¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/connection/j$b;", "", "", "b", "Lokhttp3/i0;", "c", "", "a", "I", "nextRouteIndex", "", "Ljava/util/List;", "()Ljava/util/List;", "routes", "<init>", "(Ljava/util/List;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int nextRouteIndex;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final List<i0> routes;

        public b(@d5.d List<i0> list) {
            l0.p(list, ProtectedSandApp.s("扛"));
            this.routes = list;
        }

        @d5.d
        public final List<i0> a() {
            return this.routes;
        }

        public final boolean b() {
            return this.nextRouteIndex < this.routes.size();
        }

        @d5.d
        public final i0 c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List<i0> list = this.routes;
            int i5 = this.nextRouteIndex;
            this.nextRouteIndex = i5 + 1;
            return list.get(i5);
        }
    }

    /* compiled from: RouteSelector.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/net/Proxy;", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes6.dex */
    static final class c extends Lambda implements q3.a<List<? extends Proxy>> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Proxy f30927q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ okhttp3.w f30928r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Proxy proxy, okhttp3.w wVar) {
            super(0);
            this.f30927q = proxy;
            this.f30928r = wVar;
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Proxy> n() {
            List<Proxy> k5;
            Proxy proxy = this.f30927q;
            if (proxy != null) {
                k5 = z.k(proxy);
                return k5;
            }
            URI Z = this.f30928r.Z();
            if (Z.getHost() == null) {
                return okhttp3.internal.d.z(Proxy.NO_PROXY);
            }
            List<Proxy> select = j.this.address.t().select(Z);
            return select == null || select.isEmpty() ? okhttp3.internal.d.z(Proxy.NO_PROXY) : okhttp3.internal.d.c0(select);
        }
    }

    public j(@d5.d okhttp3.a aVar, @d5.d i iVar, @d5.d okhttp3.e eVar, @d5.d r rVar) {
        l0.p(aVar, ProtectedSandApp.s("扜"));
        l0.p(iVar, ProtectedSandApp.s("扝"));
        l0.p(eVar, ProtectedSandApp.s("扞"));
        l0.p(rVar, ProtectedSandApp.s("扟"));
        this.address = aVar;
        this.routeDatabase = iVar;
        this.call = eVar;
        this.eventListener = rVar;
        EmptyList emptyList = EmptyList.f23167o;
        this.proxies = emptyList;
        this.inetSocketAddresses = emptyList;
        this.postponedRoutes = new ArrayList();
        g(aVar.w(), aVar.r());
    }

    private final boolean c() {
        return this.nextProxyIndex < this.proxies.size();
    }

    private final Proxy e() throws IOException {
        if (!c()) {
            throw new SocketException(ProtectedSandApp.s("扠") + this.address.w().getHost() + ProtectedSandApp.s("扡") + this.proxies);
        }
        List<? extends Proxy> list = this.proxies;
        int i5 = this.nextProxyIndex;
        this.nextProxyIndex = i5 + 1;
        Proxy proxy = list.get(i5);
        f(proxy);
        return proxy;
    }

    private final void f(Proxy proxy) throws IOException {
        String host;
        int port;
        ArrayList arrayList = new ArrayList();
        this.inetSocketAddresses = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            host = this.address.w().getHost();
            port = this.address.w().getPort();
        } else {
            SocketAddress address = proxy.address();
            if (!(address instanceof InetSocketAddress)) {
                throw new IllegalArgumentException((ProtectedSandApp.s("扢") + address.getClass()).toString());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
            host = INSTANCE.a(inetSocketAddress);
            port = inetSocketAddress.getPort();
        }
        if (1 > port || 65535 < port) {
            throw new SocketException(ProtectedSandApp.s("扤") + host + ':' + port + ProtectedSandApp.s("扥"));
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(host, port));
            return;
        }
        this.eventListener.n(this.call, host);
        List<InetAddress> a6 = this.address.n().a(host);
        if (a6.isEmpty()) {
            throw new UnknownHostException(this.address.n() + ProtectedSandApp.s("扣") + host);
        }
        this.eventListener.m(this.call, host, a6);
        Iterator<InetAddress> it = a6.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress(it.next(), port));
        }
    }

    private final void g(okhttp3.w wVar, Proxy proxy) {
        c cVar = new c(proxy, wVar);
        this.eventListener.p(this.call, wVar);
        List<Proxy> n5 = cVar.n();
        this.proxies = n5;
        this.nextProxyIndex = 0;
        this.eventListener.o(this.call, wVar, n5);
    }

    public final boolean b() {
        return c() || (this.postponedRoutes.isEmpty() ^ true);
    }

    @d5.d
    public final b d() throws IOException {
        if (!b()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (c()) {
            Proxy e6 = e();
            Iterator<? extends InetSocketAddress> it = this.inetSocketAddresses.iterator();
            while (it.hasNext()) {
                i0 i0Var = new i0(this.address, e6, it.next());
                if (this.routeDatabase.c(i0Var)) {
                    this.postponedRoutes.add(i0Var);
                } else {
                    arrayList.add(i0Var);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            f0.q0(arrayList, this.postponedRoutes);
            this.postponedRoutes.clear();
        }
        return new b(arrayList);
    }
}
