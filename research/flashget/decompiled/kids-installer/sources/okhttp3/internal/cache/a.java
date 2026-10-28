package okhttp3.internal.cache;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.text.e0;
import okhttp3.d0;
import okhttp3.g0;
import okhttp3.h0;
import okhttp3.internal.cache.c;
import okhttp3.internal.http.f;
import okhttp3.internal.http.h;
import okhttp3.r;
import okhttp3.v;
import okhttp3.x;
import okio.a0;
import okio.m;
import okio.m0;
import okio.n;
import okio.o;
import okio.o0;
import okio.q0;

/* compiled from: CacheInterceptor.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\tB\u0011\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/cache/a;", "Lokhttp3/x;", "Lokhttp3/internal/cache/b;", "cacheRequest", "Lokhttp3/g0;", "response", "b", "Lokhttp3/x$a;", "chain", "a", "Lokhttp3/c;", "Lokhttp3/c;", "c", "()Lokhttp3/c;", "cache", "<init>", "(Lokhttp3/c;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class a implements x {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final okhttp3.c cache;

    /* compiled from: CacheInterceptor.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/cache/a$a;", "", "Lokhttp3/g0;", "response", "f", "Lokhttp3/v;", "cachedHeaders", "networkHeaders", "c", "", "fieldName", "", "e", "d", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.cache.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final v c(v cachedHeaders, v networkHeaders) {
            int i5;
            boolean K1;
            boolean s22;
            v.a aVar = new v.a();
            int size = cachedHeaders.size();
            for (0; i5 < size; i5 + 1) {
                String q5 = cachedHeaders.q(i5);
                String x5 = cachedHeaders.x(i5);
                K1 = e0.K1(ProtectedSandApp.s("惝"), q5, true);
                if (K1) {
                    s22 = e0.s2(x5, ProtectedSandApp.s("惞"), false, 2, null);
                    i5 = s22 ? i5 + 1 : 0;
                }
                if (d(q5) || !e(q5) || networkHeaders.g(q5) == null) {
                    aVar.g(q5, x5);
                }
            }
            int size2 = networkHeaders.size();
            for (int i6 = 0; i6 < size2; i6++) {
                String q6 = networkHeaders.q(i6);
                if (!d(q6) && e(q6)) {
                    aVar.g(q6, networkHeaders.x(i6));
                }
            }
            return aVar.i();
        }

        private final boolean d(String fieldName) {
            boolean K1;
            boolean K12;
            boolean K13;
            K1 = e0.K1(ProtectedSandApp.s("惟"), fieldName, true);
            if (K1) {
                return true;
            }
            K12 = e0.K1(ProtectedSandApp.s("惠"), fieldName, true);
            if (K12) {
                return true;
            }
            K13 = e0.K1(ProtectedSandApp.s("惡"), fieldName, true);
            return K13;
        }

        private final boolean e(String fieldName) {
            boolean K1;
            boolean K12;
            boolean K13;
            boolean K14;
            boolean K15;
            boolean K16;
            boolean K17;
            boolean K18;
            K1 = e0.K1(ProtectedSandApp.s("惢"), fieldName, true);
            if (!K1) {
                K12 = e0.K1(ProtectedSandApp.s("惣"), fieldName, true);
                if (!K12) {
                    K13 = e0.K1(ProtectedSandApp.s("惤"), fieldName, true);
                    if (!K13) {
                        K14 = e0.K1(ProtectedSandApp.s("惥"), fieldName, true);
                        if (!K14) {
                            K15 = e0.K1(ProtectedSandApp.s("惦"), fieldName, true);
                            if (!K15) {
                                K16 = e0.K1(ProtectedSandApp.s("惧"), fieldName, true);
                                if (!K16) {
                                    K17 = e0.K1(ProtectedSandApp.s("惨"), fieldName, true);
                                    if (!K17) {
                                        K18 = e0.K1(ProtectedSandApp.s("惩"), fieldName, true);
                                        if (!K18) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final g0 f(g0 response) {
            if ((response != null ? response.t() : null) == null) {
                return response;
            }
            response.getClass();
            return new g0.a(response).b(null).c();
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    /* compiled from: CacheInterceptor.kt */
    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"okhttp3/internal/cache/a$b", "Lokio/o0;", "Lokio/m;", "sink", "", "byteCount", "X0", "Lokio/q0;", "h", "Lkotlin/m2;", "close", "", "o", "Z", "cacheRequestClosed", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class b implements o0 {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private boolean cacheRequestClosed;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ o f30716p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ okhttp3.internal.cache.b f30717q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ n f30718r;

        b(o oVar, okhttp3.internal.cache.b bVar, n nVar) {
            this.f30716p = oVar;
            this.f30717q = bVar;
            this.f30718r = nVar;
        }

        @Override // okio.o0
        public long X0(@d5.d m sink, long byteCount) throws IOException {
            l0.p(sink, ProtectedSandApp.s("惪"));
            try {
                long X0 = this.f30716p.X0(sink, byteCount);
                if (X0 != -1) {
                    sink.o(this.f30718r.i(), sink.size() - X0, X0);
                    this.f30718r.Y();
                    return X0;
                }
                if (!this.cacheRequestClosed) {
                    this.cacheRequestClosed = true;
                    this.f30718r.close();
                }
                return -1L;
            } catch (IOException e6) {
                if (!this.cacheRequestClosed) {
                    this.cacheRequestClosed = true;
                    this.f30717q.a();
                }
                throw e6;
            }
        }

        @Override // okio.o0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.cacheRequestClosed && !okhttp3.internal.d.t(this, 100, TimeUnit.MILLISECONDS)) {
                this.cacheRequestClosed = true;
                this.f30717q.a();
            }
            this.f30716p.close();
        }

        @Override // okio.o0
        @d5.d
        /* renamed from: h */
        public q0 getTimeout() {
            return this.f30716p.getTimeout();
        }
    }

    public a(@d5.e okhttp3.c cVar) {
        this.cache = cVar;
    }

    private final g0 b(okhttp3.internal.cache.b cacheRequest, g0 response) throws IOException {
        if (cacheRequest == null) {
            return response;
        }
        m0 body = cacheRequest.getBody();
        h0 t5 = response.t();
        l0.m(t5);
        b bVar = new b(t5.getBodySource(), cacheRequest, a0.c(body));
        return new g0.a(response).b(new h(g0.P(response, ProtectedSandApp.s("惫"), null, 2, null), response.t().getContentLength(), a0.d(bVar))).c();
    }

    @Override // okhttp3.x
    @d5.d
    public g0 a(@d5.d x.a chain) throws IOException {
        r rVar;
        h0 t5;
        h0 t6;
        l0.p(chain, ProtectedSandApp.s("惬"));
        okhttp3.e call = chain.call();
        okhttp3.c cVar = this.cache;
        g0 g5 = cVar != null ? cVar.g(chain.getRequest()) : null;
        c b6 = new c.b(System.currentTimeMillis(), chain.getRequest(), g5).b();
        okhttp3.e0 networkRequest = b6.getNetworkRequest();
        g0 cacheResponse = b6.getCacheResponse();
        okhttp3.c cVar2 = this.cache;
        if (cVar2 != null) {
            cVar2.H(b6);
        }
        okhttp3.internal.connection.e eVar = (okhttp3.internal.connection.e) (call instanceof okhttp3.internal.connection.e ? call : null);
        if (eVar == null || (rVar = eVar.getEventListener()) == null) {
            rVar = r.f31515a;
        }
        if (g5 != null && cacheResponse == null && (t6 = g5.t()) != null) {
            okhttp3.internal.d.l(t6);
        }
        if (networkRequest == null && cacheResponse == null) {
            g0 c6 = new g0.a().E(chain.getRequest()).B(d0.HTTP_1_1).g(504).y(ProtectedSandApp.s("惭")).b(okhttp3.internal.d.f30931c).F(-1L).C(System.currentTimeMillis()).c();
            rVar.A(call, c6);
            return c6;
        }
        if (networkRequest == null) {
            l0.m(cacheResponse);
            cacheResponse.getClass();
            g0 c7 = new g0.a(cacheResponse).d(INSTANCE.f(cacheResponse)).c();
            rVar.b(call, c7);
            return c7;
        }
        if (cacheResponse != null) {
            rVar.a(call, cacheResponse);
        } else if (this.cache != null) {
            rVar.c(call);
        }
        try {
            g0 e6 = chain.e(networkRequest);
            if (e6 == null && g5 != null && t5 != null) {
            }
            if (cacheResponse != null) {
                if (e6 != null && e6.getCode() == 304) {
                    g0.a aVar = new g0.a(cacheResponse);
                    Companion companion = INSTANCE;
                    g0 c8 = aVar.w(companion.c(cacheResponse.getHeaders(), e6.getHeaders())).F(e6.getSentRequestAtMillis()).C(e6.getReceivedResponseAtMillis()).d(companion.f(cacheResponse)).z(companion.f(e6)).c();
                    h0 t7 = e6.t();
                    l0.m(t7);
                    t7.close();
                    okhttp3.c cVar3 = this.cache;
                    l0.m(cVar3);
                    cVar3.G();
                    this.cache.O(cacheResponse, c8);
                    rVar.b(call, c8);
                    return c8;
                }
                h0 t8 = cacheResponse.t();
                if (t8 != null) {
                    okhttp3.internal.d.l(t8);
                }
            }
            l0.m(e6);
            e6.getClass();
            g0.a aVar2 = new g0.a(e6);
            Companion companion2 = INSTANCE;
            g0 c9 = aVar2.d(companion2.f(cacheResponse)).z(companion2.f(e6)).c();
            if (this.cache != null) {
                if (okhttp3.internal.http.e.c(c9) && c.INSTANCE.a(c9, networkRequest)) {
                    g0 b7 = b(this.cache.w(c9), c9);
                    if (cacheResponse != null) {
                        rVar.c(call);
                    }
                    return b7;
                }
                if (f.f30954a.a(networkRequest.m())) {
                    try {
                        this.cache.z(networkRequest);
                    } catch (IOException unused) {
                    }
                }
            }
            return c9;
        } finally {
            if (g5 != null && (t5 = g5.t()) != null) {
                okhttp3.internal.d.l(t5);
            }
        }
    }

    @d5.e
    /* renamed from: c, reason: from getter */
    public final okhttp3.c getCache() {
        return this.cache;
    }
}
