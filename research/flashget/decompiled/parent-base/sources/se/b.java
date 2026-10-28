package se;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.h;
import okhttp3.h0;
import okhttp3.o;
import okhttp3.q;
import okhttp3.v;

/* compiled from: JavaNetAuthenticator.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lse/b;", "Lokhttp3/b;", "Lokhttp3/q;", "defaultDns", "<init>", "(Lokhttp3/q;)V", "Ljava/net/Proxy;", "Lokhttp3/v;", "url", "dns", "Ljava/net/InetAddress;", "b", "(Ljava/net/Proxy;Lokhttp3/v;Lokhttp3/q;)Ljava/net/InetAddress;", "Lokhttp3/h0;", "route", "Lokhttp3/f0;", "response", "Lokhttp3/d0;", "a", "(Lokhttp3/h0;Lokhttp3/f0;)Lokhttp3/d0;", "d", "Lokhttp3/q;", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes8.dex */
public final class b implements okhttp3.b {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q defaultDns;

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final InetAddress b(Proxy proxy, v vVar, q qVar) throws IOException {
        Proxy.Type type = proxy.type();
        if (type != null && a.f91855a[type.ordinal()] == 1) {
            return (InetAddress) w.B2(qVar.lookup(vVar.getHost()));
        }
        SocketAddress address = proxy.address();
        if (address == null) {
            throw new NullPointerException(ProtectedSandApp.s("ꌓ\u0001"));
        }
        InetAddress address2 = ((InetSocketAddress) address).getAddress();
        l0.o(address2, ProtectedSandApp.s("ꌒ\u0001"));
        return address2;
    }

    @Override // okhttp3.b
    @m
    public d0 a(@m h0 route, @l f0 response) throws IOException {
        Proxy proxy;
        q qVar;
        PasswordAuthentication requestPasswordAuthentication;
        okhttp3.a d5;
        l0.p(response, ProtectedSandApp.s("ꌔ\u0001"));
        List<h> t4 = response.t();
        d0 request = response.getRequest();
        v q4 = request.q();
        boolean z4 = response.u() == 407;
        if (route == null || (proxy = route.e()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (h hVar : t4) {
            if (kotlin.text.v.K1(ProtectedSandApp.s("ꌕ\u0001"), hVar.h(), true)) {
                if (route == null || (d5 = route.d()) == null || (qVar = d5.n()) == null) {
                    qVar = this.defaultDns;
                }
                String s4 = ProtectedSandApp.s("ꌖ\u0001");
                if (z4) {
                    SocketAddress address = proxy.address();
                    if (address == null) {
                        throw new NullPointerException(ProtectedSandApp.s("ꌓ\u0001"));
                    }
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                    String hostName = inetSocketAddress.getHostName();
                    l0.o(proxy, s4);
                    requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, b(proxy, q4, qVar), inetSocketAddress.getPort(), q4.getScheme(), hVar.g(), hVar.h(), q4.a0(), Authenticator.RequestorType.PROXY);
                } else {
                    String host = q4.getHost();
                    l0.o(proxy, s4);
                    requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(host, b(proxy, q4, qVar), q4.getPort(), q4.getScheme(), hVar.g(), hVar.h(), q4.a0(), Authenticator.RequestorType.SERVER);
                }
                if (requestPasswordAuthentication != null) {
                    String s5 = z4 ? ProtectedSandApp.s("ꌗ\u0001") : ProtectedSandApp.s("ꌘ\u0001");
                    String userName = requestPasswordAuthentication.getUserName();
                    l0.o(userName, ProtectedSandApp.s("ꌙ\u0001"));
                    char[] password = requestPasswordAuthentication.getPassword();
                    l0.o(password, ProtectedSandApp.s("ꌚ\u0001"));
                    return new d0.a(request).n(s5, o.b(userName, new String(password), hVar.f())).b();
                }
            }
        }
        return null;
    }

    public b(@l q qVar) {
        l0.p(qVar, ProtectedSandApp.s("ꌑ\u0001"));
        this.defaultDns = qVar;
    }

    public /* synthetic */ b(q qVar, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? q.f85056a : qVar);
    }
}
