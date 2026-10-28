package okhttp3.internal.connection;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okhttp3.c0;
import okhttp3.i0;
import okhttp3.internal.connection.j;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.r;
import okhttp3.w;

/* compiled from: ExchangeFinder.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010+\u001a\u00020)\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00103\u001a\u000200\u0012\u0006\u00107\u001a\u000204¢\u0006\u0004\b8\u00109J8\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002J0\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u0016\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0007J\u000e\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010 R\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u0016\u0010%\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\"R\u0018\u0010(\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010'R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010*R\u001a\u0010/\u001a\u00020,8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010-\u001a\u0004\b$\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u0006:"}, d2 = {"Lokhttp3/internal/connection/d;", "", "", "connectTimeout", "readTimeout", "writeTimeout", "pingIntervalMillis", "", "connectionRetryEnabled", "doExtensiveHealthChecks", "Lokhttp3/internal/connection/f;", "c", "b", "Lokhttp3/i0;", "f", "Lokhttp3/c0;", "client", "Lokhttp3/internal/http/g;", "chain", "Lokhttp3/internal/http/d;", "a", "Ljava/io/IOException;", "e", "Lkotlin/m2;", "h", "Lokhttp3/w;", "url", "g", "Lokhttp3/internal/connection/j$b;", "Lokhttp3/internal/connection/j$b;", "routeSelection", "Lokhttp3/internal/connection/j;", "Lokhttp3/internal/connection/j;", "routeSelector", "I", "refusedStreamCount", "d", "connectionShutdownCount", "otherFailureCount", "Lokhttp3/i0;", "nextRouteToTry", "Lokhttp3/internal/connection/h;", "Lokhttp3/internal/connection/h;", "connectionPool", "Lokhttp3/a;", "Lokhttp3/a;", "()Lokhttp3/a;", "address", "Lokhttp3/internal/connection/e;", "i", "Lokhttp3/internal/connection/e;", "call", "Lokhttp3/r;", "j", "Lokhttp3/r;", "eventListener", "<init>", "(Lokhttp3/internal/connection/h;Lokhttp3/a;Lokhttp3/internal/connection/e;Lokhttp3/r;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private j.b routeSelection;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private j routeSelector;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int refusedStreamCount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int connectionShutdownCount;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int otherFailureCount;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private i0 nextRouteToTry;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final h connectionPool;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final okhttp3.a address;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final e call;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final r eventListener;

    public d(@d5.d h hVar, @d5.d okhttp3.a aVar, @d5.d e eVar, @d5.d r rVar) {
        l0.p(hVar, ProtectedSandApp.s("憰"));
        l0.p(aVar, ProtectedSandApp.s("憱"));
        l0.p(eVar, ProtectedSandApp.s("憲"));
        l0.p(rVar, ProtectedSandApp.s("憳"));
        this.connectionPool = hVar;
        this.address = aVar;
        this.call = eVar;
        this.eventListener = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final okhttp3.internal.connection.f b(int r15, int r16, int r17, int r18, boolean r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.d.b(int, int, int, int, boolean):okhttp3.internal.connection.f");
    }

    private final f c(int connectTimeout, int readTimeout, int writeTimeout, int pingIntervalMillis, boolean connectionRetryEnabled, boolean doExtensiveHealthChecks) throws IOException {
        while (true) {
            f b6 = b(connectTimeout, readTimeout, writeTimeout, pingIntervalMillis, connectionRetryEnabled);
            if (b6.B(doExtensiveHealthChecks)) {
                return b6;
            }
            b6.G();
            if (this.nextRouteToTry == null) {
                j.b bVar = this.routeSelection;
                if (bVar != null ? bVar.b() : true) {
                    continue;
                } else {
                    j jVar = this.routeSelector;
                    if (!(jVar != null ? jVar.b() : true)) {
                        throw new IOException(ProtectedSandApp.s("憷"));
                    }
                }
            }
        }
    }

    private final i0 f() {
        f connection;
        if (this.refusedStreamCount > 1 || this.connectionShutdownCount > 1 || this.otherFailureCount > 0 || (connection = this.call.getConnection()) == null) {
            return null;
        }
        synchronized (connection) {
            if (connection.getRouteFailureCount() != 0) {
                return null;
            }
            if (okhttp3.internal.d.i(connection.getRoute().d().w(), this.address.w())) {
                return connection.getRoute();
            }
            return null;
        }
    }

    @d5.d
    public final okhttp3.internal.http.d a(@d5.d c0 client, @d5.d okhttp3.internal.http.g chain) {
        l0.p(client, ProtectedSandApp.s("憸"));
        l0.p(chain, ProtectedSandApp.s("憹"));
        try {
            return c(chain.m(), chain.o(), chain.q(), client.getPingIntervalMillis(), client.s0(), !l0.g(chain.p().m(), ProtectedSandApp.s("憺"))).D(client, chain);
        } catch (IOException e6) {
            h(e6);
            throw new RouteException(e6);
        } catch (RouteException e7) {
            h(e7.getLastConnectException());
            throw e7;
        }
    }

    @d5.d
    /* renamed from: d, reason: from getter */
    public final okhttp3.a getAddress() {
        return this.address;
    }

    public final boolean e() {
        j jVar;
        if (this.refusedStreamCount == 0 && this.connectionShutdownCount == 0 && this.otherFailureCount == 0) {
            return false;
        }
        if (this.nextRouteToTry != null) {
            return true;
        }
        i0 f6 = f();
        if (f6 != null) {
            this.nextRouteToTry = f6;
            return true;
        }
        j.b bVar = this.routeSelection;
        if ((bVar == null || !bVar.b()) && (jVar = this.routeSelector) != null) {
            return jVar.b();
        }
        return true;
    }

    public final boolean g(@d5.d w url) {
        l0.p(url, ProtectedSandApp.s("憻"));
        w w5 = this.address.w();
        return url.getPort() == w5.getPort() && l0.g(url.getHost(), w5.getHost());
    }

    public final void h(@d5.d IOException iOException) {
        l0.p(iOException, ProtectedSandApp.s("憼"));
        this.nextRouteToTry = null;
        if ((iOException instanceof StreamResetException) && ((StreamResetException) iOException).errorCode == okhttp3.internal.http2.a.REFUSED_STREAM) {
            this.refusedStreamCount++;
        } else if (iOException instanceof ConnectionShutdownException) {
            this.connectionShutdownCount++;
        } else {
            this.otherFailureCount++;
        }
    }
}
