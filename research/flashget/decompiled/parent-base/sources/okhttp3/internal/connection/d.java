package okhttp3.internal.connection;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okhttp3.b0;
import okhttp3.h0;
import okhttp3.internal.connection.j;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.r;
import okhttp3.v;

/* compiled from: ExchangeFinder.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ?\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u0017\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\u0015\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b&\u0010'J\r\u0010$\u001a\u00020\u0011¢\u0006\u0004\b$\u0010(J\u0015\u0010+\u001a\u00020\u00112\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010.R\u0018\u00102\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u00101R\u0016\u00104\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00103R\u0016\u00106\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00103R\u0016\u00107\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u00103R\u0018\u00109\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010:R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010;\u001a\u0004\b5\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006A"}, d2 = {"Lokhttp3/internal/connection/d;", "", "Lokhttp3/internal/connection/h;", "connectionPool", "Lokhttp3/a;", "address", "Lokhttp3/internal/connection/e;", "call", "Lokhttp3/r;", "eventListener", "<init>", "(Lokhttp3/internal/connection/h;Lokhttp3/a;Lokhttp3/internal/connection/e;Lokhttp3/r;)V", "", "connectTimeout", "readTimeout", "writeTimeout", "pingIntervalMillis", "", "connectionRetryEnabled", "doExtensiveHealthChecks", "Lokhttp3/internal/connection/f;", "c", "(IIIIZZ)Lokhttp3/internal/connection/f;", "b", "(IIIIZ)Lokhttp3/internal/connection/f;", "Lokhttp3/h0;", "f", "()Lokhttp3/h0;", "Lokhttp3/b0;", "client", "Lokhttp3/internal/http/g;", "chain", "Lokhttp3/internal/http/d;", "a", "(Lokhttp3/b0;Lokhttp3/internal/http/g;)Lokhttp3/internal/http/d;", "Ljava/io/IOException;", "e", "Lkotlin/k2;", "h", "(Ljava/io/IOException;)V", "()Z", "Lokhttp3/v;", "url", "g", "(Lokhttp3/v;)Z", "Lokhttp3/internal/connection/j$b;", "Lokhttp3/internal/connection/j$b;", "routeSelection", "Lokhttp3/internal/connection/j;", "Lokhttp3/internal/connection/j;", "routeSelector", "I", "refusedStreamCount", "d", "connectionShutdownCount", "otherFailureCount", "Lokhttp3/h0;", "nextRouteToTry", "Lokhttp3/internal/connection/h;", "Lokhttp3/a;", "()Lokhttp3/a;", "i", "Lokhttp3/internal/connection/e;", "j", "Lokhttp3/r;", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
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
    private h0 nextRouteToTry;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final h connectionPool;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @l
    private final okhttp3.a address;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final e call;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final r eventListener;

    public d(@l h hVar, @l okhttp3.a aVar, @l e eVar, @l r rVar) {
        l0.p(hVar, ProtectedSandApp.s("ꂳ\u0001"));
        l0.p(aVar, ProtectedSandApp.s("ꂴ\u0001"));
        l0.p(eVar, ProtectedSandApp.s("ꂵ\u0001"));
        l0.p(rVar, ProtectedSandApp.s("ꂶ\u0001"));
        this.connectionPool = hVar;
        this.address = aVar;
        this.call = eVar;
        this.eventListener = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0152  */
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
            f b5 = b(connectTimeout, readTimeout, writeTimeout, pingIntervalMillis, connectionRetryEnabled);
            if (b5.B(doExtensiveHealthChecks)) {
                return b5;
            }
            b5.G();
            if (this.nextRouteToTry == null) {
                j.b bVar = this.routeSelection;
                if (bVar != null ? bVar.b() : true) {
                    continue;
                } else {
                    j jVar = this.routeSelector;
                    if (!(jVar != null ? jVar.b() : true)) {
                        throw new IOException(ProtectedSandApp.s("ꂹ\u0001"));
                    }
                }
            }
        }
    }

    private final h0 f() {
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

    @l
    public final okhttp3.internal.http.d a(@l b0 client, @l okhttp3.internal.http.g chain) {
        l0.p(client, ProtectedSandApp.s("ꂺ\u0001"));
        l0.p(chain, ProtectedSandApp.s("ꂻ\u0001"));
        try {
            return c(chain.m(), chain.o(), chain.q(), client.getPingIntervalMillis(), client.o0(), !l0.g(chain.p().m(), ProtectedSandApp.s("ꂼ\u0001"))).D(client, chain);
        } catch (IOException e4) {
            h(e4);
            throw new RouteException(e4);
        } catch (RouteException e5) {
            h(e5.getLastConnectException());
            throw e5;
        }
    }

    @l
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
        h0 f4 = f();
        if (f4 != null) {
            this.nextRouteToTry = f4;
            return true;
        }
        j.b bVar = this.routeSelection;
        if ((bVar == null || !bVar.b()) && (jVar = this.routeSelector) != null) {
            return jVar.b();
        }
        return true;
    }

    public final boolean g(@l v url) {
        l0.p(url, ProtectedSandApp.s("ꂽ\u0001"));
        v w4 = this.address.w();
        return url.getPort() == w4.getPort() && l0.g(url.getHost(), w4.getHost());
    }

    public final void h(@l IOException e4) {
        l0.p(e4, ProtectedSandApp.s("ꂾ\u0001"));
        this.nextRouteToTry = null;
        if ((e4 instanceof StreamResetException) && ((StreamResetException) e4).errorCode == okhttp3.internal.http2.a.REFUSED_STREAM) {
            this.refusedStreamCount++;
        } else if (e4 instanceof ConnectionShutdownException) {
            this.connectionShutdownCount++;
        } else {
            this.otherFailureCount++;
        }
    }
}
