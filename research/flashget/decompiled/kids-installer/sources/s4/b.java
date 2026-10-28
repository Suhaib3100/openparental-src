package s4;

import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.d;
import d5.e;
import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import okhttp3.e0;
import okhttp3.g0;
import okhttp3.h;
import okhttp3.i0;
import okhttp3.o;
import okhttp3.q;
import okhttp3.w;

/* compiled from: JavaNetAuthenticator.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Ls4/b;", "Lokhttp3/b;", "Ljava/net/Proxy;", "Lokhttp3/w;", "url", "Lokhttp3/q;", "dns", "Ljava/net/InetAddress;", "b", "Lokhttp3/i0;", "route", "Lokhttp3/g0;", "response", "Lokhttp3/e0;", "a", "d", "Lokhttp3/q;", "defaultDns", "<init>", "(Lokhttp3/q;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public final class b implements okhttp3.b {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q defaultDns;

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final InetAddress b(Proxy proxy, w wVar, q qVar) throws IOException {
        Object B2;
        Proxy.Type type = proxy.type();
        if (type != null && a.f33437a[type.ordinal()] == 1) {
            B2 = j0.B2(qVar.a(wVar.getHost()));
            return (InetAddress) B2;
        }
        SocketAddress address = proxy.address();
        if (address == null) {
            throw new NullPointerException(ProtectedSandApp.s("鑝"));
        }
        InetAddress address2 = ((InetSocketAddress) address).getAddress();
        l0.o(address2, ProtectedSandApp.s("鑜"));
        return address2;
    }

    @Override // okhttp3.b
    @e
    public e0 a(@e i0 route, @d g0 response) throws IOException {
        Proxy proxy;
        boolean K1;
        q qVar;
        PasswordAuthentication requestPasswordAuthentication;
        okhttp3.a d6;
        l0.p(response, ProtectedSandApp.s("鑞"));
        List<h> B = response.B();
        e0 request = response.getRequest();
        w q5 = request.q();
        boolean z5 = response.getCode() == 407;
        if (route == null || (proxy = route.e()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (h hVar : B) {
            K1 = kotlin.text.e0.K1(ProtectedSandApp.s("鑟"), hVar.h(), true);
            if (K1) {
                if (route == null || (d6 = route.d()) == null || (qVar = d6.n()) == null) {
                    qVar = this.defaultDns;
                }
                String s5 = ProtectedSandApp.s("鑠");
                if (z5) {
                    SocketAddress address = proxy.address();
                    if (address == null) {
                        throw new NullPointerException(ProtectedSandApp.s("鑡"));
                    }
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                    String hostName = inetSocketAddress.getHostName();
                    l0.o(proxy, s5);
                    requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, b(proxy, q5, qVar), inetSocketAddress.getPort(), q5.getScheme(), hVar.g(), hVar.h(), q5.a0(), Authenticator.RequestorType.PROXY);
                } else {
                    String host = q5.getHost();
                    l0.o(proxy, s5);
                    requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(host, b(proxy, q5, qVar), q5.getPort(), q5.getScheme(), hVar.g(), hVar.h(), q5.a0(), Authenticator.RequestorType.SERVER);
                }
                if (requestPasswordAuthentication != null) {
                    String s6 = z5 ? ProtectedSandApp.s("鑢") : ProtectedSandApp.s("鑣");
                    String userName = requestPasswordAuthentication.getUserName();
                    l0.o(userName, ProtectedSandApp.s("鑤"));
                    char[] password = requestPasswordAuthentication.getPassword();
                    l0.o(password, ProtectedSandApp.s("鑥"));
                    return new e0.a(request).n(s6, o.b(userName, new String(password), hVar.f())).b();
                }
            }
        }
        return null;
    }

    public b(@d q qVar) {
        l0.p(qVar, ProtectedSandApp.s("鑛"));
        this.defaultDns = qVar;
    }

    public /* synthetic */ b(q qVar, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? q.f31512a : qVar);
    }
}
