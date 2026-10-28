package okhttp3.internal.http;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
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
import kotlin.text.r;
import okhttp3.b0;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.f0;
import okhttp3.h0;
import okhttp3.v;
import okhttp3.w;

/* compiled from: RetryAndFollowUpInterceptor.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0007\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0007\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010%¨\u0006&"}, d2 = {"Lokhttp3/internal/http/j;", "Lokhttp3/w;", "Lokhttp3/b0;", "client", "<init>", "(Lokhttp3/b0;)V", "Ljava/io/IOException;", "e", "Lokhttp3/internal/connection/e;", "call", "Lokhttp3/d0;", "userRequest", "", "requestSendStarted", "d", "(Ljava/io/IOException;Lokhttp3/internal/connection/e;Lokhttp3/d0;Z)Z", "(Ljava/io/IOException;Lokhttp3/d0;)Z", "c", "(Ljava/io/IOException;Z)Z", "Lokhttp3/f0;", "userResponse", "Lokhttp3/internal/connection/c;", "exchange", "b", "(Lokhttp3/f0;Lokhttp3/internal/connection/c;)Lokhttp3/d0;", "", "method", "a", "(Lokhttp3/f0;Ljava/lang/String;)Lokhttp3/d0;", "", "defaultDelay", "f", "(Lokhttp3/f0;I)I", "Lokhttp3/w$a;", "chain", "intercept", "(Lokhttp3/w$a;)Lokhttp3/f0;", "Lokhttp3/b0;", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class j implements w {

    /* renamed from: c, reason: collision with root package name */
    private static final int f84495c = 20;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b0 client;

    public j(@l b0 b0Var) {
        l0.p(b0Var, ProtectedSandApp.s("a"));
        this.client = b0Var;
    }

    private final d0 a(f0 userResponse, String method) {
        String C;
        v W;
        if (!this.client.getFollowRedirects() || (C = f0.C(userResponse, ProtectedSandApp.s("b"), null, 2, null)) == null || (W = userResponse.getRequest().q().W(C)) == null) {
            return null;
        }
        if (!l0.g(W.getScheme(), userResponse.getRequest().q().getScheme()) && !this.client.getFollowSslRedirects()) {
            return null;
        }
        d0 request = userResponse.getRequest();
        request.getClass();
        d0.a aVar = new d0.a(request);
        if (f.b(method)) {
            int u4 = userResponse.u();
            f fVar = f.f84481a;
            boolean z4 = fVar.d(method) || u4 == 308 || u4 == 307;
            if (!fVar.c(method) || u4 == 308 || u4 == 307) {
                aVar.p(method, z4 ? userResponse.getRequest().f() : null);
            } else {
                aVar.p(ProtectedSandApp.s("c"), null);
            }
            if (!z4) {
                aVar.t(ProtectedSandApp.s("d"));
                aVar.t(ProtectedSandApp.s("e"));
                aVar.t(ProtectedSandApp.s("f"));
            }
        }
        if (!okhttp3.internal.d.i(userResponse.getRequest().q(), W)) {
            aVar.t(ProtectedSandApp.s("g"));
        }
        return aVar.D(W).b();
    }

    private final d0 b(f0 userResponse, okhttp3.internal.connection.c exchange) throws IOException {
        okhttp3.internal.connection.f connection;
        h0 route = (exchange == null || (connection = exchange.getConnection()) == null) ? null : connection.getRoute();
        int u4 = userResponse.u();
        String m4 = userResponse.getRequest().m();
        if (u4 != 307 && u4 != 308) {
            if (u4 == 401) {
                return this.client.getAuthenticator().a(route, userResponse);
            }
            if (u4 == 421) {
                e0 f4 = userResponse.getRequest().f();
                if ((f4 != null && f4.isOneShot()) || exchange == null || !exchange.k()) {
                    return null;
                }
                exchange.getConnection().F();
                return userResponse.getRequest();
            }
            if (u4 == 503) {
                f0 priorResponse = userResponse.getPriorResponse();
                if ((priorResponse == null || priorResponse.u() != 503) && f(userResponse, Integer.MAX_VALUE) == 0) {
                    return userResponse.getRequest();
                }
                return null;
            }
            if (u4 == 407) {
                l0.m(route);
                if (route.e().type() == Proxy.Type.HTTP) {
                    return this.client.getProxyAuthenticator().a(route, userResponse);
                }
                throw new ProtocolException(ProtectedSandApp.s("h"));
            }
            if (u4 == 408) {
                if (!this.client.o0()) {
                    return null;
                }
                e0 f5 = userResponse.getRequest().f();
                if (f5 != null && f5.isOneShot()) {
                    return null;
                }
                f0 priorResponse2 = userResponse.getPriorResponse();
                if ((priorResponse2 == null || priorResponse2.u() != 408) && f(userResponse, 0) <= 0) {
                    return userResponse.getRequest();
                }
                return null;
            }
            switch (u4) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return a(userResponse, m4);
    }

    private final boolean c(IOException e4, boolean requestSendStarted) {
        if (e4 instanceof ProtocolException) {
            return false;
        }
        return e4 instanceof InterruptedIOException ? (e4 instanceof SocketTimeoutException) && !requestSendStarted : (((e4 instanceof SSLHandshakeException) && (e4.getCause() instanceof CertificateException)) || (e4 instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final boolean d(IOException e4, okhttp3.internal.connection.e call, d0 userRequest, boolean requestSendStarted) {
        if (this.client.o0()) {
            return !(requestSendStarted && e(e4, userRequest)) && c(e4, requestSendStarted) && call.A();
        }
        return false;
    }

    private final boolean e(IOException e4, d0 userRequest) {
        e0 f4 = userRequest.f();
        return (f4 != null && f4.isOneShot()) || (e4 instanceof FileNotFoundException);
    }

    private final int f(f0 userResponse, int defaultDelay) {
        String C = f0.C(userResponse, ProtectedSandApp.s("i"), null, 2, null);
        if (C == null) {
            return defaultDelay;
        }
        if (!new r(ProtectedSandApp.s("j")).k(C)) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(C);
        l0.o(valueOf, ProtectedSandApp.s("k"));
        return valueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r7 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        r0.getClass();
        r0 = new okhttp3.f0.a(r0).A(new okhttp3.f0.a(r7).b(null).c()).c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        r0 = r1.getInterceptorScopedExchange();
        r6 = b(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if (r6 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
    
        r0 = r6.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (r0.isOneShot() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        r1.l(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        r0 = r7.o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        okhttp3.internal.d.l(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
    
        if (r8 > 20) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a3, code lost:
    
        throw new java.net.ProtocolException(com.flashget.parentalcontrol.ProtectedSandApp.s("m") + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0056, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005c, code lost:
    
        if (r0.getIsDuplex() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005e, code lost:
    
        r1.D();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0061, code lost:
    
        r1.l(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
    
        return r7;
     */
    @Override // okhttp3.w
    @fg.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okhttp3.f0 intercept(@fg.l okhttp3.w.a r11) throws java.io.IOException {
        /*
            r10 = this;
            java.lang.String r0 = "l"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r11, r0)
            okhttp3.internal.http.g r11 = (okhttp3.internal.http.g) r11
            okhttp3.d0 r0 = r11.p()
            okhttp3.internal.connection.e r1 = r11.getCall()
            kotlin.collections.j0 r2 = kotlin.collections.j0.f74919b
            r3 = 0
            r4 = 0
            r5 = 1
            r8 = r3
            r7 = r4
        L1a:
            r6 = r5
        L1b:
            r1.k(r0, r6)
            boolean r6 = r1.getCanceled()     // Catch: java.lang.Throwable -> L49
            if (r6 != 0) goto Lde
            okhttp3.f0 r0 = r11.c(r0)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> La4 okhttp3.internal.connection.RouteException -> Lbf
            if (r7 == 0) goto L47
            r0.getClass()     // Catch: java.lang.Throwable -> L49
            okhttp3.f0$a r6 = new okhttp3.f0$a     // Catch: java.lang.Throwable -> L49
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L49
            okhttp3.f0$a r0 = new okhttp3.f0$a     // Catch: java.lang.Throwable -> L49
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L49
            okhttp3.f0$a r0 = r0.b(r4)     // Catch: java.lang.Throwable -> L49
            okhttp3.f0 r0 = r0.c()     // Catch: java.lang.Throwable -> L49
            okhttp3.f0$a r0 = r6.A(r0)     // Catch: java.lang.Throwable -> L49
            okhttp3.f0 r0 = r0.c()     // Catch: java.lang.Throwable -> L49
        L47:
            r7 = r0
            goto L4c
        L49:
            r11 = move-exception
            goto Lea
        L4c:
            okhttp3.internal.connection.c r0 = r1.getInterceptorScopedExchange()     // Catch: java.lang.Throwable -> L49
            okhttp3.d0 r6 = r10.b(r7, r0)     // Catch: java.lang.Throwable -> L49
            if (r6 != 0) goto L65
            if (r0 == 0) goto L61
            boolean r11 = r0.getIsDuplex()     // Catch: java.lang.Throwable -> L49
            if (r11 == 0) goto L61
            r1.D()     // Catch: java.lang.Throwable -> L49
        L61:
            r1.l(r3)
            return r7
        L65:
            okhttp3.e0 r0 = r6.f()     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L75
            boolean r0 = r0.isOneShot()     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L75
            r1.l(r3)
            return r7
        L75:
            okhttp3.g0 r0 = r7.o()     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L7e
            okhttp3.internal.d.l(r0)     // Catch: java.lang.Throwable -> L49
        L7e:
            int r8 = r8 + 1
            r0 = 20
            if (r8 > r0) goto L89
            r1.l(r5)
            r0 = r6
            goto L1a
        L89:
            java.net.ProtocolException r11 = new java.net.ProtocolException     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r0.<init>()     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = "m"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)     // Catch: java.lang.Throwable -> L49
            r0.append(r2)     // Catch: java.lang.Throwable -> L49
            r0.append(r8)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L49
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L49
            throw r11     // Catch: java.lang.Throwable -> L49
        La4:
            r6 = move-exception
            boolean r9 = r6 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L49
            r9 = r9 ^ r5
            boolean r9 = r10.d(r6, r1, r0, r9)     // Catch: java.lang.Throwable -> L49
            if (r9 == 0) goto Lba
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L49
            java.util.List r2 = kotlin.collections.w.E4(r2, r6)     // Catch: java.lang.Throwable -> L49
        Lb4:
            r1.l(r5)
            r6 = r3
            goto L1b
        Lba:
            java.lang.Throwable r11 = okhttp3.internal.d.j0(r6, r2)     // Catch: java.lang.Throwable -> L49
            throw r11     // Catch: java.lang.Throwable -> L49
        Lbf:
            r6 = move-exception
            java.io.IOException r9 = r6.getLastConnectException()     // Catch: java.lang.Throwable -> L49
            boolean r9 = r10.d(r9, r1, r0, r3)     // Catch: java.lang.Throwable -> L49
            if (r9 == 0) goto Ld5
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L49
            java.io.IOException r6 = r6.getFirstConnectException()     // Catch: java.lang.Throwable -> L49
            java.util.List r2 = kotlin.collections.w.E4(r2, r6)     // Catch: java.lang.Throwable -> L49
            goto Lb4
        Ld5:
            java.io.IOException r11 = r6.getFirstConnectException()     // Catch: java.lang.Throwable -> L49
            java.lang.Throwable r11 = okhttp3.internal.d.j0(r11, r2)     // Catch: java.lang.Throwable -> L49
            throw r11     // Catch: java.lang.Throwable -> L49
        Lde:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = "n"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)     // Catch: java.lang.Throwable -> L49
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L49
            throw r11     // Catch: java.lang.Throwable -> L49
        Lea:
            r1.l(r5)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.j.intercept(okhttp3.w$a):okhttp3.f0");
    }
}
