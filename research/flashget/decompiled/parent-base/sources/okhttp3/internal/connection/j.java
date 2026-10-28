package okhttp3.internal.connection;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
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
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import okhttp3.h0;
import okhttp3.r;
import okhttp3.v;

/* compiled from: RouteSelector.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 /2\u00020\u0001:\u0002\u001f\u001aB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u001bH\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010#R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lokhttp3/internal/connection/j;", "", "Lokhttp3/a;", "address", "Lokhttp3/internal/connection/i;", "routeDatabase", "Lokhttp3/e;", "call", "Lokhttp3/r;", "eventListener", "<init>", "(Lokhttp3/a;Lokhttp3/internal/connection/i;Lokhttp3/e;Lokhttp3/r;)V", "Lokhttp3/v;", "url", "Ljava/net/Proxy;", "proxy", "Lkotlin/k2;", "g", "(Lokhttp3/v;Ljava/net/Proxy;)V", "", "c", "()Z", "e", "()Ljava/net/Proxy;", "f", "(Ljava/net/Proxy;)V", "b", "Lokhttp3/internal/connection/j$b;", "d", "()Lokhttp3/internal/connection/j$b;", "", "a", "Ljava/util/List;", "proxies", "", "I", "nextProxyIndex", "Ljava/net/InetSocketAddress;", "inetSocketAddresses", "", "Lokhttp3/h0;", "postponedRoutes", "Lokhttp3/a;", "Lokhttp3/internal/connection/i;", "Lokhttp3/e;", "h", "Lokhttp3/r;", "i", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class j {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private List<? extends Proxy> proxies;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int nextProxyIndex;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private List<? extends InetSocketAddress> inetSocketAddresses;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<h0> postponedRoutes;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final okhttp3.a address;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final i routeDatabase;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final okhttp3.e call;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final r eventListener;

    /* compiled from: RouteSelector.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lokhttp3/internal/connection/j$a;", "", "<init>", "()V", "Ljava/net/InetSocketAddress;", "", "a", "(Ljava/net/InetSocketAddress;)Ljava/lang/String;", "socketHost", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.connection.j$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @l
        public final String a(@l InetSocketAddress inetSocketAddress) {
            l0.p(inetSocketAddress, ProtectedSandApp.s("ꄱ\u0001"));
            InetAddress address = inetSocketAddress.getAddress();
            if (address != null) {
                String hostAddress = address.getHostAddress();
                l0.o(hostAddress, ProtectedSandApp.s("ꄲ\u0001"));
                return hostAddress;
            }
            String hostName = inetSocketAddress.getHostName();
            l0.o(hostName, ProtectedSandApp.s("ꄳ\u0001"));
            return hostName;
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: RouteSelector.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\r\u0010\u0011¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/connection/j$b;", "", "", "Lokhttp3/h0;", "routes", "<init>", "(Ljava/util/List;)V", "", "b", "()Z", "c", "()Lokhttp3/h0;", "", "a", "I", "nextRouteIndex", "Ljava/util/List;", "()Ljava/util/List;", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int nextRouteIndex;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final List<h0> routes;

        public b(@l List<h0> list) {
            l0.p(list, ProtectedSandApp.s("ꄴ\u0001"));
            this.routes = list;
        }

        @l
        public final List<h0> a() {
            return this.routes;
        }

        public final boolean b() {
            return this.nextRouteIndex < this.routes.size();
        }

        @l
        public final h0 c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List<h0> list = this.routes;
            int i4 = this.nextRouteIndex;
            this.nextRouteIndex = i4 + 1;
            return list.get(i4);
        }
    }

    /* compiled from: RouteSelector.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/net/Proxy;", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 4, 0})
    static final class c extends n0 implements ld.a<List<? extends Proxy>> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Proxy f84454c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ v f84455d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Proxy proxy, v vVar) {
            super(0);
            this.f84454c = proxy;
            this.f84455d = vVar;
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Proxy> invoke() {
            Proxy proxy = this.f84454c;
            if (proxy != null) {
                return kotlin.collections.w.k(proxy);
            }
            URI Z = this.f84455d.Z();
            if (Z.getHost() == null) {
                return okhttp3.internal.d.z(Proxy.NO_PROXY);
            }
            List<Proxy> select = j.this.address.t().select(Z);
            List<Proxy> list = select;
            return (list == null || list.isEmpty()) ? okhttp3.internal.d.z(Proxy.NO_PROXY) : okhttp3.internal.d.c0(select);
        }
    }

    public j(@l okhttp3.a aVar, @l i iVar, @l okhttp3.e eVar, @l r rVar) {
        l0.p(aVar, ProtectedSandApp.s("ꄵ\u0001"));
        l0.p(iVar, ProtectedSandApp.s("ꄶ\u0001"));
        l0.p(eVar, ProtectedSandApp.s("ꄷ\u0001"));
        l0.p(rVar, ProtectedSandApp.s("ꄸ\u0001"));
        this.address = aVar;
        this.routeDatabase = iVar;
        this.call = eVar;
        this.eventListener = rVar;
        j0 j0Var = j0.f74919b;
        this.proxies = j0Var;
        this.inetSocketAddresses = j0Var;
        this.postponedRoutes = new ArrayList();
        g(aVar.w(), aVar.r());
    }

    private final boolean c() {
        return this.nextProxyIndex < this.proxies.size();
    }

    private final Proxy e() throws IOException {
        if (!c()) {
            throw new SocketException(ProtectedSandApp.s("ꄹ\u0001") + this.address.w().getHost() + ProtectedSandApp.s("ꄺ\u0001") + this.proxies);
        }
        List<? extends Proxy> list = this.proxies;
        int i4 = this.nextProxyIndex;
        this.nextProxyIndex = i4 + 1;
        Proxy proxy = list.get(i4);
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
                throw new IllegalArgumentException((ProtectedSandApp.s("ꄻ\u0001") + address.getClass()).toString());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
            host = INSTANCE.a(inetSocketAddress);
            port = inetSocketAddress.getPort();
        }
        if (1 > port || 65535 < port) {
            throw new SocketException(ProtectedSandApp.s("ꄹ\u0001") + host + ':' + port + ProtectedSandApp.s("ꄽ\u0001"));
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(host, port));
            return;
        }
        this.eventListener.dnsStart(this.call, host);
        List<InetAddress> lookup = this.address.n().lookup(host);
        if (lookup.isEmpty()) {
            throw new UnknownHostException(this.address.n() + ProtectedSandApp.s("ꄼ\u0001") + host);
        }
        this.eventListener.dnsEnd(this.call, host, lookup);
        Iterator<InetAddress> it = lookup.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress(it.next(), port));
        }
    }

    private final void g(v url, Proxy proxy) {
        c cVar = new c(proxy, url);
        this.eventListener.proxySelectStart(this.call, url);
        List<Proxy> invoke = cVar.invoke();
        this.proxies = invoke;
        this.nextProxyIndex = 0;
        this.eventListener.proxySelectEnd(this.call, url, invoke);
    }

    public final boolean b() {
        return c() || !this.postponedRoutes.isEmpty();
    }

    @l
    public final b d() throws IOException {
        if (!b()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (c()) {
            Proxy e4 = e();
            Iterator<? extends InetSocketAddress> it = this.inetSocketAddresses.iterator();
            while (it.hasNext()) {
                h0 h0Var = new h0(this.address, e4, it.next());
                if (this.routeDatabase.c(h0Var)) {
                    this.postponedRoutes.add(h0Var);
                } else {
                    arrayList.add(h0Var);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            kotlin.collections.w.q0(arrayList, this.postponedRoutes);
            this.postponedRoutes.clear();
        }
        return new b(arrayList);
    }
}
