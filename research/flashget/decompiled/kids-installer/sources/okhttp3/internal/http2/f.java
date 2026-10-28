package okhttp3.internal.http2;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.g0;
import okhttp3.v;
import okio.m0;
import okio.o0;
import okio.q0;

/* compiled from: Http2ExchangeCodec.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 /2\u00020\u0001:\u0001\u000bB'\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010$\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020%\u0012\u0006\u0010*\u001a\u00020(¢\u0006\u0004\b-\u0010.J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\bH\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u001a\u0010$\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)¨\u00060"}, d2 = {"Lokhttp3/internal/http2/f;", "Lokhttp3/internal/http/d;", "Lokhttp3/e0;", "request", "", "contentLength", "Lokio/m0;", "h", "Lkotlin/m2;", "b", "e", "a", "", "expectContinue", "Lokhttp3/g0$a;", "d", "Lokhttp3/g0;", "response", "f", "Lokio/o0;", "c", "Lokhttp3/v;", "g", "cancel", "Lokhttp3/internal/http2/h;", "Lokhttp3/internal/http2/h;", "stream", "Lokhttp3/d0;", "Lokhttp3/d0;", "protocol", "Z", "canceled", "Lokhttp3/internal/connection/f;", "Lokhttp3/internal/connection/f;", "getConnection", "()Lokhttp3/internal/connection/f;", "connection", "Lokhttp3/internal/http/g;", "Lokhttp3/internal/http/g;", "chain", "Lokhttp3/internal/http2/e;", "Lokhttp3/internal/http2/e;", "http2Connection", "Lokhttp3/c0;", "client", "<init>", "(Lokhttp3/c0;Lokhttp3/internal/connection/f;Lokhttp3/internal/http/g;Lokhttp3/internal/http2/e;)V", "s", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class f implements okhttp3.internal.http.d {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private volatile h stream;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d0 protocol;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private volatile boolean canceled;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final okhttp3.internal.connection.f connection;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final okhttp3.internal.http.g chain;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final e http2Connection;

    /* renamed from: p, reason: collision with root package name */
    private static final String f31180p = ProtectedSandApp.s("摅");

    /* renamed from: i, reason: collision with root package name */
    private static final String f31173i = ProtectedSandApp.s("摆");

    /* renamed from: j, reason: collision with root package name */
    private static final String f31174j = ProtectedSandApp.s("摇");

    /* renamed from: k, reason: collision with root package name */
    private static final String f31175k = ProtectedSandApp.s("摈");

    /* renamed from: l, reason: collision with root package name */
    private static final String f31176l = ProtectedSandApp.s("摉");

    /* renamed from: m, reason: collision with root package name */
    private static final String f31177m = ProtectedSandApp.s("摊");

    /* renamed from: n, reason: collision with root package name */
    private static final String f31178n = ProtectedSandApp.s("摋");

    /* renamed from: o, reason: collision with root package name */
    private static final String f31179o = ProtectedSandApp.s("摌");

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: q, reason: collision with root package name */
    private static final List<String> f31181q = okhttp3.internal.d.z(ProtectedSandApp.s("摍"), ProtectedSandApp.s("摎"), ProtectedSandApp.s("摏"), ProtectedSandApp.s("摐"), ProtectedSandApp.s("摑"), ProtectedSandApp.s("摒"), ProtectedSandApp.s("摓"), ProtectedSandApp.s("摔"), ProtectedSandApp.s("摕"), ProtectedSandApp.s("摖"), ProtectedSandApp.s("摗"), ProtectedSandApp.s("摘"));

    /* renamed from: r, reason: collision with root package name */
    private static final List<String> f31182r = okhttp3.internal.d.z(ProtectedSandApp.s("摙"), ProtectedSandApp.s("摚"), ProtectedSandApp.s("摛"), ProtectedSandApp.s("摜"), ProtectedSandApp.s("摝"), ProtectedSandApp.s("摞"), ProtectedSandApp.s("摟"), ProtectedSandApp.s("摠"));

    /* compiled from: Http2ExchangeCodec.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000fR\u0014\u0010\u0018\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000fR\u0014\u0010\u0019\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000f¨\u0006\u001c"}, d2 = {"Lokhttp3/internal/http2/f$a;", "", "Lokhttp3/e0;", "request", "", "Lokhttp3/internal/http2/b;", "a", "Lokhttp3/v;", "headerBlock", "Lokhttp3/d0;", "protocol", "Lokhttp3/g0$a;", "b", "", "CONNECTION", "Ljava/lang/String;", "ENCODING", "HOST", "HTTP_2_SKIPPED_REQUEST_HEADERS", "Ljava/util/List;", "HTTP_2_SKIPPED_RESPONSE_HEADERS", "KEEP_ALIVE", "PROXY_CONNECTION", "TE", "TRANSFER_ENCODING", "UPGRADE", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.http2.f$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @d5.d
        public final List<b> a(@d5.d e0 request) {
            l0.p(request, ProtectedSandApp.s("搹"));
            v k5 = request.k();
            ArrayList arrayList = new ArrayList(k5.size() + 4);
            arrayList.add(new b(b.f31024k, request.m()));
            arrayList.add(new b(b.f31025l, okhttp3.internal.http.i.f30967a.c(request.q())));
            String i5 = request.i(ProtectedSandApp.s("携"));
            if (i5 != null) {
                arrayList.add(new b(b.f31027n, i5));
            }
            arrayList.add(new b(b.f31026m, request.q().getScheme()));
            int size = k5.size();
            for (int i6 = 0; i6 < size; i6++) {
                String q5 = k5.q(i6);
                Locale locale = Locale.US;
                l0.o(locale, ProtectedSandApp.s("搻"));
                if (q5 == null) {
                    throw new NullPointerException(ProtectedSandApp.s("搿"));
                }
                String lowerCase = q5.toLowerCase(locale);
                l0.o(lowerCase, ProtectedSandApp.s("搼"));
                if (!f.f31181q.contains(lowerCase) || (l0.g(lowerCase, ProtectedSandApp.s("搽")) && l0.g(k5.x(i6), ProtectedSandApp.s("搾")))) {
                    arrayList.add(new b(lowerCase, k5.x(i6)));
                }
            }
            return arrayList;
        }

        @d5.d
        public final g0.a b(@d5.d v headerBlock, @d5.d d0 protocol) {
            l0.p(headerBlock, ProtectedSandApp.s("摀"));
            l0.p(protocol, ProtectedSandApp.s("摁"));
            v.a aVar = new v.a();
            int size = headerBlock.size();
            okhttp3.internal.http.k kVar = null;
            for (int i5 = 0; i5 < size; i5++) {
                String q5 = headerBlock.q(i5);
                String x5 = headerBlock.x(i5);
                if (l0.g(q5, ProtectedSandApp.s("摂"))) {
                    kVar = okhttp3.internal.http.k.INSTANCE.b(ProtectedSandApp.s("摃") + x5);
                } else if (!f.f31182r.contains(q5)) {
                    aVar.g(q5, x5);
                }
            }
            if (kVar != null) {
                return new g0.a().B(protocol).g(kVar.code).y(kVar.message).w(aVar.i());
            }
            throw new ProtocolException(ProtectedSandApp.s("摄"));
        }

        public Companion(w wVar) {
        }
    }

    public f(@d5.d c0 c0Var, @d5.d okhttp3.internal.connection.f fVar, @d5.d okhttp3.internal.http.g gVar, @d5.d e eVar) {
        l0.p(c0Var, ProtectedSandApp.s("摡"));
        l0.p(fVar, ProtectedSandApp.s("摢"));
        l0.p(gVar, ProtectedSandApp.s("摣"));
        l0.p(eVar, ProtectedSandApp.s("摤"));
        this.connection = fVar;
        this.chain = gVar;
        this.http2Connection = eVar;
        List<d0> m02 = c0Var.m0();
        d0 d0Var = d0.H2_PRIOR_KNOWLEDGE;
        this.protocol = m02.contains(d0Var) ? d0Var : d0.HTTP_2;
    }

    @Override // okhttp3.internal.http.d
    public void a() {
        h hVar = this.stream;
        l0.m(hVar);
        hVar.o().close();
    }

    @Override // okhttp3.internal.http.d
    public void b(@d5.d e0 e0Var) {
        l0.p(e0Var, ProtectedSandApp.s("摥"));
        if (this.stream != null) {
            return;
        }
        this.stream = this.http2Connection.A0(INSTANCE.a(e0Var), e0Var.f() != null);
        if (this.canceled) {
            h hVar = this.stream;
            l0.m(hVar);
            hVar.f(a.CANCEL);
            throw new IOException(ProtectedSandApp.s("摦"));
        }
        h hVar2 = this.stream;
        l0.m(hVar2);
        q0 x5 = hVar2.x();
        long o5 = this.chain.o();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        x5.i(o5, timeUnit);
        h hVar3 = this.stream;
        l0.m(hVar3);
        hVar3.L().i(this.chain.q(), timeUnit);
    }

    @Override // okhttp3.internal.http.d
    @d5.d
    public o0 c(@d5.d g0 response) {
        l0.p(response, ProtectedSandApp.s("摧"));
        h hVar = this.stream;
        l0.m(hVar);
        return hVar.getSource();
    }

    @Override // okhttp3.internal.http.d
    public void cancel() {
        this.canceled = true;
        h hVar = this.stream;
        if (hVar != null) {
            hVar.f(a.CANCEL);
        }
    }

    @Override // okhttp3.internal.http.d
    @d5.e
    public g0.a d(boolean expectContinue) {
        h hVar = this.stream;
        l0.m(hVar);
        g0.a b6 = INSTANCE.b(hVar.H(), this.protocol);
        if (expectContinue && b6.getCode() == 100) {
            return null;
        }
        return b6;
    }

    @Override // okhttp3.internal.http.d
    public void e() {
        this.http2Connection.flush();
    }

    @Override // okhttp3.internal.http.d
    public long f(@d5.d g0 response) {
        l0.p(response, ProtectedSandApp.s("摨"));
        if (okhttp3.internal.http.e.c(response)) {
            return okhttp3.internal.d.x(response);
        }
        return 0L;
    }

    @Override // okhttp3.internal.http.d
    @d5.d
    public v g() {
        h hVar = this.stream;
        l0.m(hVar);
        return hVar.I();
    }

    @Override // okhttp3.internal.http.d
    @d5.d
    public okhttp3.internal.connection.f getConnection() {
        return this.connection;
    }

    @Override // okhttp3.internal.http.d
    @d5.d
    public m0 h(@d5.d e0 request, long contentLength) {
        l0.p(request, ProtectedSandApp.s("摩"));
        h hVar = this.stream;
        l0.m(hVar);
        return hVar.o();
    }
}
