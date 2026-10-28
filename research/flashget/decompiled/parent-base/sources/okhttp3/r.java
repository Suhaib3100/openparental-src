package okhttp3;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: EventListener.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\b&\u0018\u0000 N2\u00020\u0001:\u0002OPB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0011\u0010\u0010\u001a\r\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000f0\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J2\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0011\u0010\u0018\u001a\r\u0012\t\u0012\u00070\u0017¢\u0006\u0002\b\u000f0\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010\bJ!\u0010#\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J1\u0010'\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J9\u0010+\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u001f\u00101\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b1\u00100J\u0017\u00102\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b2\u0010\bJ\u001f\u00105\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b7\u0010\bJ\u001f\u0010:\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u001f\u0010<\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b>\u0010\bJ\u001f\u0010A\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bC\u0010\bJ\u001f\u0010D\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\bD\u0010;J\u001f\u0010E\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\bE\u0010=J\u0017\u0010F\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bF\u0010\bJ\u001f\u0010G\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\bG\u0010=J\u0017\u0010H\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bH\u0010\bJ\u001f\u0010I\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bI\u0010BJ\u001f\u0010J\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bJ\u0010BJ\u0017\u0010K\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bK\u0010\bJ\u001f\u0010M\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010L\u001a\u00020?H\u0016¢\u0006\u0004\bM\u0010B¨\u0006Q"}, d2 = {"Lokhttp3/r;", "", "<init>", "()V", "Lokhttp3/e;", "call", "Lkotlin/k2;", "callStart", "(Lokhttp3/e;)V", "Lokhttp3/v;", "url", "proxySelectStart", "(Lokhttp3/e;Lokhttp3/v;)V", "", "Ljava/net/Proxy;", "Lkd/o;", "proxies", "proxySelectEnd", "(Lokhttp3/e;Lokhttp3/v;Ljava/util/List;)V", "", "domainName", "dnsStart", "(Lokhttp3/e;Ljava/lang/String;)V", "Ljava/net/InetAddress;", "inetAddressList", "dnsEnd", "(Lokhttp3/e;Ljava/lang/String;Ljava/util/List;)V", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "connectStart", "(Lokhttp3/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V", "secureConnectStart", "Lokhttp3/t;", "handshake", "secureConnectEnd", "(Lokhttp3/e;Lokhttp3/t;)V", "Lokhttp3/c0;", "protocol", "connectEnd", "(Lokhttp3/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/c0;)V", "Ljava/io/IOException;", "ioe", "connectFailed", "(Lokhttp3/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/c0;Ljava/io/IOException;)V", "Lokhttp3/j;", "connection", "connectionAcquired", "(Lokhttp3/e;Lokhttp3/j;)V", "connectionReleased", "requestHeadersStart", "Lokhttp3/d0;", "request", "requestHeadersEnd", "(Lokhttp3/e;Lokhttp3/d0;)V", "requestBodyStart", "", "byteCount", "requestBodyEnd", "(Lokhttp3/e;J)V", "requestFailed", "(Lokhttp3/e;Ljava/io/IOException;)V", "responseHeadersStart", "Lokhttp3/f0;", "response", "responseHeadersEnd", "(Lokhttp3/e;Lokhttp3/f0;)V", "responseBodyStart", "responseBodyEnd", "responseFailed", "callEnd", "callFailed", "canceled", "satisfactionFailure", "cacheHit", "cacheMiss", "cachedResponse", "cacheConditionalHit", "Companion", "b", "c", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public abstract class r {

    @fg.l
    @kd.f
    public static final r NONE = new a();

    /* compiled from: EventListener.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okhttp3/r$a", "Lokhttp3/r;", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a extends r {
        a() {
        }
    }

    /* compiled from: EventListener.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/r$c;", "", "Lokhttp3/e;", "call", "Lokhttp3/r;", "create", "(Lokhttp3/e;)Lokhttp3/r;", "okhttp"}, k = 1, mv = {1, 4, 0})
    public interface c {
        @fg.l
        r create(@fg.l e call);
    }

    public void cacheConditionalHit(@fg.l e call, @fg.l f0 cachedResponse) {
        l0.p(call, ProtectedSandApp.s("天\u0001"));
        l0.p(cachedResponse, ProtectedSandApp.s("太\u0001"));
    }

    public void cacheHit(@fg.l e call, @fg.l f0 response) {
        l0.p(call, ProtectedSandApp.s("天\u0001"));
        l0.p(response, ProtectedSandApp.s("夫\u0001"));
    }

    public void cacheMiss(@fg.l e call) {
        l0.p(call, ProtectedSandApp.s("天\u0001"));
    }

    public void callEnd(@fg.l e call) {
        l0.p(call, ProtectedSandApp.s("天\u0001"));
    }

    public void callFailed(@fg.l e call, @fg.l IOException ioe) {
        l0.p(call, ProtectedSandApp.s("天\u0001"));
        l0.p(ioe, ProtectedSandApp.s("夬\u0001"));
    }

    public void callStart(@fg.l e call) {
        l0.p(call, ProtectedSandApp.s("天\u0001"));
    }

    public void canceled(@fg.l e call) {
        l0.p(call, ProtectedSandApp.s("天\u0001"));
    }

    public void connectEnd(@fg.l e call, @fg.l InetSocketAddress inetSocketAddress, @fg.l Proxy proxy, @fg.m c0 protocol) {
        l0.p(call, ProtectedSandApp.s("天\u0001"));
        l0.p(inetSocketAddress, ProtectedSandApp.s("夭\u0001"));
        l0.p(proxy, ProtectedSandApp.s("央\u0001"));
    }

    public void connectFailed(@fg.l e call, @fg.l InetSocketAddress inetSocketAddress, @fg.l Proxy proxy, @fg.m c0 protocol, @fg.l IOException ioe) {
        l0.p(call, ProtectedSandApp.s("天\u0001"));
        l0.p(inetSocketAddress, ProtectedSandApp.s("夭\u0001"));
        l0.p(proxy, ProtectedSandApp.s("央\u0001"));
        l0.p(ioe, ProtectedSandApp.s("夬\u0001"));
    }

    public void connectStart(@fg.l e call, @fg.l InetSocketAddress inetSocketAddress, @fg.l Proxy proxy) {
        l0.p(call, ProtectedSandApp.s("天\u0001"));
        l0.p(inetSocketAddress, ProtectedSandApp.s("夭\u0001"));
        l0.p(proxy, ProtectedSandApp.s("央\u0001"));
    }

    public void connectionAcquired(@fg.l e call, @fg.l j connection) {
        l0.p(call, ProtectedSandApp.s("天\u0001"));
        l0.p(connection, ProtectedSandApp.s("夯\u0001"));
    }

    public void connectionReleased(@fg.l e call, @fg.l j connection) {
        l0.p(call, ProtectedSandApp.s("天\u0001"));
        l0.p(connection, ProtectedSandApp.s("夯\u0001"));
    }

    public void dnsEnd(@fg.l e call, @fg.l String domainName, @fg.l List<InetAddress> inetAddressList) {
        l0.p(call, ProtectedSandApp.s("天\u0001"));
        l0.p(domainName, ProtectedSandApp.s("夰\u0001"));
        l0.p(inetAddressList, ProtectedSandApp.s("失\u0001"));
    }

    public void dnsStart(@fg.l e call, @fg.l String domainName) {
        l0.p(call, ProtectedSandApp.s("天\u0001"));
        l0.p(domainName, ProtectedSandApp.s("夰\u0001"));
    }

    public void proxySelectEnd(@fg.l e call, @fg.l v url, @fg.l List<Proxy> proxies) {
        l0.p(call, ProtectedSandApp.s("天\u0001"));
        l0.p(url, ProtectedSandApp.s("夲\u0001"));
        l0.p(proxies, ProtectedSandApp.s("夳\u0001"));
    }

    public void proxySelectStart(@fg.l e call, @fg.l v url) {
        l0.p(call, ProtectedSandApp.s("天\u0001"));
        l0.p(url, ProtectedSandApp.s("夲\u0001"));
    }

    public void requestBodyEnd(@fg.l e call, long byteCount) {
        l0.p(call, ProtectedSandApp.s("天\u0001"));
    }

    public void requestBodyStart(@fg.l e call) {
        l0.p(call, ProtectedSandApp.s("天\u0001"));
    }

    public void requestFailed(@fg.l e call, @fg.l IOException ioe) {
        l0.p(call, ProtectedSandApp.s("天\u0001"));
        l0.p(ioe, ProtectedSandApp.s("夬\u0001"));
    }

    public void requestHeadersEnd(@fg.l e call, @fg.l d0 request) {
        l0.p(call, ProtectedSandApp.s("天\u0001"));
        l0.p(request, ProtectedSandApp.s("头\u0001"));
    }

    public void requestHeadersStart(@fg.l e call) {
        l0.p(call, ProtectedSandApp.s("天\u0001"));
    }

    public void responseBodyEnd(@fg.l e call, long byteCount) {
        l0.p(call, ProtectedSandApp.s("天\u0001"));
    }

    public void responseBodyStart(@fg.l e call) {
        l0.p(call, ProtectedSandApp.s("天\u0001"));
    }

    public void responseFailed(@fg.l e call, @fg.l IOException ioe) {
        l0.p(call, ProtectedSandApp.s("天\u0001"));
        l0.p(ioe, ProtectedSandApp.s("夬\u0001"));
    }

    public void responseHeadersEnd(@fg.l e call, @fg.l f0 response) {
        l0.p(call, ProtectedSandApp.s("天\u0001"));
        l0.p(response, ProtectedSandApp.s("夫\u0001"));
    }

    public void responseHeadersStart(@fg.l e call) {
        l0.p(call, ProtectedSandApp.s("天\u0001"));
    }

    public void satisfactionFailure(@fg.l e call, @fg.l f0 response) {
        l0.p(call, ProtectedSandApp.s("天\u0001"));
        l0.p(response, ProtectedSandApp.s("夫\u0001"));
    }

    public void secureConnectEnd(@fg.l e call, @fg.m t handshake) {
        l0.p(call, ProtectedSandApp.s("天\u0001"));
    }

    public void secureConnectStart(@fg.l e call) {
        l0.p(call, ProtectedSandApp.s("天\u0001"));
    }
}
