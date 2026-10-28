package okhttp3.internal.http;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.text.Regex;
import okhttp3.c0;
import okhttp3.e0;
import okhttp3.f0;
import okhttp3.g0;
import okhttp3.i0;
import okhttp3.w;
import okhttp3.x;

/* compiled from: RetryAndFollowUpInterceptor.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ(\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0018\u0010\u0016\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001b¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/http/j;", "Lokhttp3/x;", "Ljava/io/IOException;", "e", "Lokhttp3/internal/connection/e;", "call", "Lokhttp3/e0;", "userRequest", "", "requestSendStarted", "f", "d", "Lokhttp3/g0;", "userResponse", "Lokhttp3/internal/connection/c;", "exchange", "c", "", "method", "b", "", "defaultDelay", "g", "Lokhttp3/x$a;", "chain", "a", "Lokhttp3/c0;", "Lokhttp3/c0;", "client", "<init>", "(Lokhttp3/c0;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class j implements x {

    /* renamed from: c, reason: collision with root package name */
    private static final int f30968c = 20;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c0 client;

    public j(@d5.d c0 c0Var) {
        l0.p(c0Var, ProtectedSandApp.s("挾"));
        this.client = c0Var;
    }

    private final e0 b(g0 userResponse, String method) {
        String P;
        w W;
        if (!this.client.getFollowRedirects() || (P = g0.P(userResponse, ProtectedSandApp.s("挿"), null, 2, null)) == null || (W = userResponse.getRequest().q().W(P)) == null) {
            return null;
        }
        if (!l0.g(W.getScheme(), userResponse.getRequest().q().getScheme()) && !this.client.getFollowSslRedirects()) {
            return null;
        }
        e0 request = userResponse.getRequest();
        request.getClass();
        e0.a aVar = new e0.a(request);
        if (f.b(method)) {
            int code = userResponse.getCode();
            f fVar = f.f30954a;
            boolean z5 = fVar.d(method) || code == 308 || code == 307;
            if (!fVar.c(method) || code == 308 || code == 307) {
                aVar.p(method, z5 ? userResponse.getRequest().f() : null);
            } else {
                aVar.p(ProtectedSandApp.s("捀"), null);
            }
            if (!z5) {
                aVar.t(ProtectedSandApp.s("捁"));
                aVar.t(ProtectedSandApp.s("捂"));
                aVar.t(ProtectedSandApp.s("捃"));
            }
        }
        if (!okhttp3.internal.d.i(userResponse.getRequest().q(), W)) {
            aVar.t(ProtectedSandApp.s("捄"));
        }
        return aVar.D(W).b();
    }

    private final e0 c(g0 userResponse, okhttp3.internal.connection.c exchange) throws IOException {
        okhttp3.internal.connection.f connection;
        i0 route = (exchange == null || (connection = exchange.getConnection()) == null) ? null : connection.getRoute();
        int code = userResponse.getCode();
        String m5 = userResponse.getRequest().m();
        if (code != 307 && code != 308) {
            if (code == 401) {
                return this.client.getAuthenticator().a(route, userResponse);
            }
            if (code == 421) {
                f0 f6 = userResponse.getRequest().f();
                if ((f6 != null && f6.q()) || exchange == null || !exchange.k()) {
                    return null;
                }
                exchange.getConnection().F();
                return userResponse.getRequest();
            }
            if (code == 503) {
                g0 priorResponse = userResponse.getPriorResponse();
                if ((priorResponse == null || priorResponse.getCode() != 503) && g(userResponse, Integer.MAX_VALUE) == 0) {
                    return userResponse.getRequest();
                }
                return null;
            }
            if (code == 407) {
                l0.m(route);
                if (route.e().type() == Proxy.Type.HTTP) {
                    return this.client.getProxyAuthenticator().a(route, userResponse);
                }
                throw new ProtocolException(ProtectedSandApp.s("捅"));
            }
            if (code == 408) {
                if (!this.client.s0()) {
                    return null;
                }
                f0 f7 = userResponse.getRequest().f();
                if (f7 != null && f7.q()) {
                    return null;
                }
                g0 priorResponse2 = userResponse.getPriorResponse();
                if ((priorResponse2 == null || priorResponse2.getCode() != 408) && g(userResponse, 0) <= 0) {
                    return userResponse.getRequest();
                }
                return null;
            }
            switch (code) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return b(userResponse, m5);
    }

    private final boolean d(IOException e6, boolean requestSendStarted) {
        if (e6 instanceof ProtocolException) {
            return false;
        }
        return e6 instanceof InterruptedIOException ? (e6 instanceof SocketTimeoutException) && !requestSendStarted : (((e6 instanceof SSLHandshakeException) && (e6.getCause() instanceof CertificateException)) || (e6 instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final boolean e(IOException e6, okhttp3.internal.connection.e call, e0 userRequest, boolean requestSendStarted) {
        if (this.client.s0()) {
            return !(requestSendStarted && f(e6, userRequest)) && d(e6, requestSendStarted) && call.A();
        }
        return false;
    }

    private final boolean f(IOException e6, e0 userRequest) {
        f0 f6 = userRequest.f();
        return (f6 != null && f6.q()) || (e6 instanceof FileNotFoundException);
    }

    private final int g(g0 userResponse, int defaultDelay) {
        String P = g0.P(userResponse, ProtectedSandApp.s("捆"), null, 2, null);
        if (P == null) {
            return defaultDelay;
        }
        if (!new Regex(ProtectedSandApp.s("捇")).k(P)) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(P);
        l0.o(valueOf, ProtectedSandApp.s("捈"));
        return valueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r5 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        r0.getClass();
        r0 = new okhttp3.g0.a(r0).A(new okhttp3.g0.a(r5).b(null).c()).c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        r5 = r0;
        r0 = r1.getInterceptorScopedExchange();
        r8 = c(r5, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if (r8 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
    
        r0 = r8.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        if (r0.q() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        r1.k(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        r0 = r5.t();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        okhttp3.internal.d.l(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
    
        if (r6 > 20) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
    
        throw new java.net.ProtocolException(com.flashget.kidsdownloader.ProtectedSandApp.s("捊") + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0052, code lost:
    
        if (r0 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
    
        if (r0.getIsDuplex() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005a, code lost:
    
        r1.D();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005d, code lost:
    
        r1.k(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0060, code lost:
    
        return r5;
     */
    @Override // okhttp3.x
    @d5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okhttp3.g0 a(@d5.d okhttp3.x.a r11) throws java.io.IOException {
        /*
            r10 = this;
            java.lang.String r0 = "捉"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r11, r0)
            okhttp3.internal.http.g r11 = (okhttp3.internal.http.g) r11
            okhttp3.e0 r0 = r11.p()
            okhttp3.internal.connection.e r1 = r11.getCall()
            kotlin.collections.m0 r2 = kotlin.collections.EmptyList.f23167o
            r3 = 0
            r4 = 0
            r6 = r3
            r5 = r4
        L19:
            r7 = 1
            r8 = r7
        L1b:
            r1.j(r0, r8)
            boolean r8 = r1.getCanceled()     // Catch: java.lang.Throwable -> Le5
            if (r8 != 0) goto Ld9
            okhttp3.g0 r0 = r11.e(r0)     // Catch: java.io.IOException -> L9f okhttp3.internal.connection.RouteException -> Lb7 java.lang.Throwable -> Le5
            if (r5 == 0) goto L47
            r0.getClass()     // Catch: java.lang.Throwable -> Le5
            okhttp3.g0$a r8 = new okhttp3.g0$a     // Catch: java.lang.Throwable -> Le5
            r8.<init>(r0)     // Catch: java.lang.Throwable -> Le5
            okhttp3.g0$a r0 = new okhttp3.g0$a     // Catch: java.lang.Throwable -> Le5
            r0.<init>(r5)     // Catch: java.lang.Throwable -> Le5
            okhttp3.g0$a r0 = r0.b(r4)     // Catch: java.lang.Throwable -> Le5
            okhttp3.g0 r0 = r0.c()     // Catch: java.lang.Throwable -> Le5
            okhttp3.g0$a r0 = r8.A(r0)     // Catch: java.lang.Throwable -> Le5
            okhttp3.g0 r0 = r0.c()     // Catch: java.lang.Throwable -> Le5
        L47:
            r5 = r0
            okhttp3.internal.connection.c r0 = r1.getInterceptorScopedExchange()     // Catch: java.lang.Throwable -> Le5
            okhttp3.e0 r8 = r10.c(r5, r0)     // Catch: java.lang.Throwable -> Le5
            if (r8 != 0) goto L61
            if (r0 == 0) goto L5d
            boolean r11 = r0.getIsDuplex()     // Catch: java.lang.Throwable -> Le5
            if (r11 == 0) goto L5d
            r1.D()     // Catch: java.lang.Throwable -> Le5
        L5d:
            r1.k(r3)
            return r5
        L61:
            okhttp3.f0 r0 = r8.f()     // Catch: java.lang.Throwable -> Le5
            if (r0 == 0) goto L71
            boolean r0 = r0.q()     // Catch: java.lang.Throwable -> Le5
            if (r0 == 0) goto L71
            r1.k(r3)
            return r5
        L71:
            okhttp3.h0 r0 = r5.t()     // Catch: java.lang.Throwable -> Le5
            if (r0 == 0) goto L7a
            okhttp3.internal.d.l(r0)     // Catch: java.lang.Throwable -> Le5
        L7a:
            int r6 = r6 + r7
            r0 = 20
            if (r6 > r0) goto L84
            r1.k(r7)
            r0 = r8
            goto L19
        L84:
            java.net.ProtocolException r11 = new java.net.ProtocolException     // Catch: java.lang.Throwable -> Le5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le5
            r0.<init>()     // Catch: java.lang.Throwable -> Le5
            java.lang.String r2 = "捊"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)     // Catch: java.lang.Throwable -> Le5
            r0.append(r2)     // Catch: java.lang.Throwable -> Le5
            r0.append(r6)     // Catch: java.lang.Throwable -> Le5
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Le5
            r11.<init>(r0)     // Catch: java.lang.Throwable -> Le5
            throw r11     // Catch: java.lang.Throwable -> Le5
        L9f:
            r8 = move-exception
            boolean r9 = r8 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> Le5
            if (r9 != 0) goto La6
            r9 = r7
            goto La7
        La6:
            r9 = r3
        La7:
            boolean r9 = r10.e(r8, r1, r0, r9)     // Catch: java.lang.Throwable -> Le5
            if (r9 == 0) goto Lb2
            java.util.List r2 = kotlin.collections.y.E4(r2, r8)     // Catch: java.lang.Throwable -> Le5
            goto Lca
        Lb2:
            java.lang.Throwable r11 = okhttp3.internal.d.j0(r8, r2)     // Catch: java.lang.Throwable -> Le5
            throw r11     // Catch: java.lang.Throwable -> Le5
        Lb7:
            r8 = move-exception
            java.io.IOException r9 = r8.getLastConnectException()     // Catch: java.lang.Throwable -> Le5
            boolean r9 = r10.e(r9, r1, r0, r3)     // Catch: java.lang.Throwable -> Le5
            if (r9 == 0) goto Ld0
            java.io.IOException r8 = r8.getFirstConnectException()     // Catch: java.lang.Throwable -> Le5
            java.util.List r2 = kotlin.collections.y.E4(r2, r8)     // Catch: java.lang.Throwable -> Le5
        Lca:
            r1.k(r7)
            r8 = r3
            goto L1b
        Ld0:
            java.io.IOException r11 = r8.getFirstConnectException()     // Catch: java.lang.Throwable -> Le5
            java.lang.Throwable r11 = okhttp3.internal.d.j0(r11, r2)     // Catch: java.lang.Throwable -> Le5
            throw r11     // Catch: java.lang.Throwable -> Le5
        Ld9:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> Le5
            java.lang.String r0 = "捋"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)     // Catch: java.lang.Throwable -> Le5
            r11.<init>(r0)     // Catch: java.lang.Throwable -> Le5
            throw r11     // Catch: java.lang.Throwable -> Le5
        Le5:
            r11 = move-exception
            r1.k(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.j.a(okhttp3.x$a):okhttp3.g0");
    }
}
