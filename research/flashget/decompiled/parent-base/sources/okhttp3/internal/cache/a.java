package okhttp3.internal.cache;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.text.v;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.g0;
import okhttp3.internal.cache.c;
import okhttp3.internal.http.f;
import okhttp3.internal.http.h;
import okhttp3.r;
import okhttp3.u;
import okhttp3.w;
import okio.a0;
import okio.m0;
import okio.n;
import okio.o;
import okio.o0;
import okio.q0;

/* compiled from: CacheInterceptor.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\nB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/cache/a;", "Lokhttp3/w;", "Lokhttp3/c;", "cache", "<init>", "(Lokhttp3/c;)V", "Lokhttp3/internal/cache/b;", "cacheRequest", "Lokhttp3/f0;", "response", "a", "(Lokhttp3/internal/cache/b;Lokhttp3/f0;)Lokhttp3/f0;", "Lokhttp3/w$a;", "chain", "intercept", "(Lokhttp3/w$a;)Lokhttp3/f0;", "b", "Lokhttp3/c;", "()Lokhttp3/c;", "c", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class a implements w {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @m
    private final okhttp3.c cache;

    /* compiled from: CacheInterceptor.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/cache/a$a;", "", "<init>", "()V", "Lokhttp3/f0;", "response", "f", "(Lokhttp3/f0;)Lokhttp3/f0;", "Lokhttp3/u;", "cachedHeaders", "networkHeaders", "c", "(Lokhttp3/u;Lokhttp3/u;)Lokhttp3/u;", "", "fieldName", "", "e", "(Ljava/lang/String;)Z", "d", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.cache.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final u c(u cachedHeaders, u networkHeaders) {
            u.a aVar = new u.a();
            int size = cachedHeaders.size();
            for (int i4 = 0; i4 < size; i4++) {
                String j4 = cachedHeaders.j(i4);
                String s4 = cachedHeaders.s(i4);
                if ((!v.K1(ProtectedSandApp.s("鿷\u0001"), j4, true) || !v.s2(s4, ProtectedSandApp.s("鿸\u0001"), false, 2, null)) && (d(j4) || !e(j4) || networkHeaders.f(j4) == null)) {
                    aVar.g(j4, s4);
                }
            }
            int size2 = networkHeaders.size();
            for (int i5 = 0; i5 < size2; i5++) {
                String j5 = networkHeaders.j(i5);
                if (!d(j5) && e(j5)) {
                    aVar.g(j5, networkHeaders.s(i5));
                }
            }
            return aVar.i();
        }

        private final boolean d(String fieldName) {
            return v.K1(ProtectedSandApp.s("鿹\u0001"), fieldName, true) || v.K1(ProtectedSandApp.s("鿺\u0001"), fieldName, true) || v.K1(ProtectedSandApp.s("鿻\u0001"), fieldName, true);
        }

        private final boolean e(String fieldName) {
            return (v.K1(ProtectedSandApp.s("鿼\u0001"), fieldName, true) || v.K1(ProtectedSandApp.s("鿽\u0001"), fieldName, true) || v.K1(ProtectedSandApp.s("鿾\u0001"), fieldName, true) || v.K1(ProtectedSandApp.s("鿿\u0001"), fieldName, true) || v.K1(ProtectedSandApp.s("ꀀ\u0001"), fieldName, true) || v.K1(ProtectedSandApp.s("ꀁ\u0001"), fieldName, true) || v.K1(ProtectedSandApp.s("ꀂ\u0001"), fieldName, true) || v.K1(ProtectedSandApp.s("ꀃ\u0001"), fieldName, true)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final f0 f(f0 response) {
            if ((response != null ? response.o() : null) == null) {
                return response;
            }
            response.getClass();
            return new f0.a(response).b(null).c();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    /* compiled from: CacheInterceptor.kt */
    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"okhttp3/internal/cache/a$b", "Lokio/o0;", "Lokio/m;", "sink", "", "byteCount", "w3", "(Lokio/m;J)J", "Lokio/q0;", "timeout", "()Lokio/q0;", "Lkotlin/k2;", "close", "()V", "", "b", "Z", "cacheRequestClosed", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class b implements o0 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean cacheRequestClosed;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ o f84224c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ okhttp3.internal.cache.b f84225d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ n f84226e;

        b(o oVar, okhttp3.internal.cache.b bVar, n nVar) {
            this.f84224c = oVar;
            this.f84225d = bVar;
            this.f84226e = nVar;
        }

        @Override // okio.o0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.cacheRequestClosed && !okhttp3.internal.d.t(this, 100, TimeUnit.MILLISECONDS)) {
                this.cacheRequestClosed = true;
                this.f84225d.abort();
            }
            this.f84224c.close();
        }

        @Override // okio.o0
        @l
        /* renamed from: timeout */
        public q0 getTimeout() {
            return this.f84224c.getTimeout();
        }

        @Override // okio.o0
        public long w3(@l okio.m sink, long byteCount) throws IOException {
            l0.p(sink, ProtectedSandApp.s("ꀄ\u0001"));
            try {
                long w32 = this.f84224c.w3(sink, byteCount);
                if (w32 != -1) {
                    sink.n(this.f84226e.getBufferField(), sink.size() - w32, w32);
                    this.f84226e.y0();
                    return w32;
                }
                if (!this.cacheRequestClosed) {
                    this.cacheRequestClosed = true;
                    this.f84226e.close();
                }
                return -1L;
            } catch (IOException e4) {
                if (!this.cacheRequestClosed) {
                    this.cacheRequestClosed = true;
                    this.f84225d.abort();
                }
                throw e4;
            }
        }
    }

    public a(@m okhttp3.c cVar) {
        this.cache = cVar;
    }

    private final f0 a(okhttp3.internal.cache.b cacheRequest, f0 response) throws IOException {
        if (cacheRequest == null) {
            return response;
        }
        m0 body = cacheRequest.getBody();
        g0 o4 = response.o();
        l0.m(o4);
        b bVar = new b(o4.getSource(), cacheRequest, a0.c(body));
        return new f0.a(response).b(new h(f0.C(response, ProtectedSandApp.s("ꀅ\u0001"), null, 2, null), response.o().getContentLength(), a0.d(bVar))).c();
    }

    @m
    /* renamed from: b, reason: from getter */
    public final okhttp3.c getCache() {
        return this.cache;
    }

    @Override // okhttp3.w
    @l
    public f0 intercept(@l w.a chain) throws IOException {
        r rVar;
        g0 o4;
        g0 o5;
        l0.p(chain, ProtectedSandApp.s("ꀆ\u0001"));
        okhttp3.e call = chain.call();
        okhttp3.c cVar = this.cache;
        f0 f4 = cVar != null ? cVar.f(chain.getRequest()) : null;
        c b5 = new c.b(System.currentTimeMillis(), chain.getRequest(), f4).b();
        d0 networkRequest = b5.getNetworkRequest();
        f0 cacheResponse = b5.getCacheResponse();
        okhttp3.c cVar2 = this.cache;
        if (cVar2 != null) {
            cVar2.z(b5);
        }
        okhttp3.internal.connection.e eVar = (okhttp3.internal.connection.e) (call instanceof okhttp3.internal.connection.e ? call : null);
        if (eVar == null || (rVar = eVar.getEventListener()) == null) {
            rVar = r.NONE;
        }
        if (f4 != null && cacheResponse == null && (o5 = f4.o()) != null) {
            okhttp3.internal.d.l(o5);
        }
        if (networkRequest == null && cacheResponse == null) {
            f0 c5 = new f0.a().E(chain.getRequest()).B(c0.HTTP_1_1).g(504).y(ProtectedSandApp.s("ꀇ\u0001")).b(okhttp3.internal.d.f84458c).F(-1L).C(System.currentTimeMillis()).c();
            rVar.satisfactionFailure(call, c5);
            return c5;
        }
        if (networkRequest == null) {
            l0.m(cacheResponse);
            cacheResponse.getClass();
            f0 c6 = new f0.a(cacheResponse).d(INSTANCE.f(cacheResponse)).c();
            rVar.cacheHit(call, c6);
            return c6;
        }
        if (cacheResponse != null) {
            rVar.cacheConditionalHit(call, cacheResponse);
        } else if (this.cache != null) {
            rVar.cacheMiss(call);
        }
        try {
            f0 c7 = chain.c(networkRequest);
            if (c7 == null && f4 != null && o4 != null) {
            }
            if (cacheResponse != null) {
                if (c7 != null && c7.u() == 304) {
                    f0.a aVar = new f0.a(cacheResponse);
                    Companion companion = INSTANCE;
                    f0 c10 = aVar.w(companion.c(cacheResponse.getHeaders(), c7.getHeaders())).F(c7.getSentRequestAtMillis()).C(c7.getReceivedResponseAtMillis()).d(companion.f(cacheResponse)).z(companion.f(c7)).c();
                    g0 o6 = c7.o();
                    l0.m(o6);
                    o6.close();
                    okhttp3.c cVar3 = this.cache;
                    l0.m(cVar3);
                    cVar3.y();
                    this.cache.B(cacheResponse, c10);
                    rVar.cacheHit(call, c10);
                    return c10;
                }
                g0 o7 = cacheResponse.o();
                if (o7 != null) {
                    okhttp3.internal.d.l(o7);
                }
            }
            l0.m(c7);
            c7.getClass();
            f0.a aVar2 = new f0.a(c7);
            Companion companion2 = INSTANCE;
            f0 c11 = aVar2.d(companion2.f(cacheResponse)).z(companion2.f(c7)).c();
            if (this.cache != null) {
                if (okhttp3.internal.http.e.c(c11) && c.INSTANCE.a(c11, networkRequest)) {
                    f0 a5 = a(this.cache.q(c11), c11);
                    if (cacheResponse != null) {
                        rVar.cacheMiss(call);
                    }
                    return a5;
                }
                if (f.f84481a.a(networkRequest.m())) {
                    try {
                        this.cache.s(networkRequest);
                    } catch (IOException unused) {
                    }
                }
            }
            return c11;
        } finally {
            if (f4 != null && (o4 = f4.o()) != null) {
                okhttp3.internal.d.l(o4);
            }
        }
    }
}
