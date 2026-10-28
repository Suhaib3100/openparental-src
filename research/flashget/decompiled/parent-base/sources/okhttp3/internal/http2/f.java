package okhttp3.internal.http2;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.m;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import okhttp3.b0;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.u;
import okio.m0;
import okio.o0;
import okio.q0;

/* compiled from: Http2ExchangeCodec.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 62\u00020\u0001:\u0001\u0018B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0013H\u0016¢\u0006\u0004\b(\u0010\u0017R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010.R\u0016\u00101\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u00100R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u00102\u001a\u0004\b*\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00104R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00105¨\u00067"}, d2 = {"Lokhttp3/internal/http2/f;", "Lokhttp3/internal/http/d;", "Lokhttp3/b0;", "client", "Lokhttp3/internal/connection/f;", "connection", "Lokhttp3/internal/http/g;", "chain", "Lokhttp3/internal/http2/e;", "http2Connection", "<init>", "(Lokhttp3/b0;Lokhttp3/internal/connection/f;Lokhttp3/internal/http/g;Lokhttp3/internal/http2/e;)V", "Lokhttp3/d0;", "request", "", "contentLength", "Lokio/m0;", "e", "(Lokhttp3/d0;J)Lokio/m0;", "Lkotlin/k2;", "f", "(Lokhttp3/d0;)V", "h", "()V", "a", "", "expectContinue", "Lokhttp3/f0$a;", "g", "(Z)Lokhttp3/f0$a;", "Lokhttp3/f0;", "response", "d", "(Lokhttp3/f0;)J", "Lokio/o0;", "b", "(Lokhttp3/f0;)Lokio/o0;", "Lokhttp3/u;", "i", "()Lokhttp3/u;", "cancel", "Lokhttp3/internal/http2/h;", "c", "Lokhttp3/internal/http2/h;", "stream", "Lokhttp3/c0;", "Lokhttp3/c0;", "protocol", "Z", "canceled", "Lokhttp3/internal/connection/f;", "()Lokhttp3/internal/connection/f;", "Lokhttp3/internal/http/g;", "Lokhttp3/internal/http2/e;", "s", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class f implements okhttp3.internal.http.d {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private volatile h stream;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final c0 protocol;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private volatile boolean canceled;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final okhttp3.internal.connection.f connection;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final okhttp3.internal.http.g chain;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final e http2Connection;

    /* renamed from: p, reason: collision with root package name */
    private static final String f84720p = ProtectedSandApp.s("ᴋ");

    /* renamed from: i, reason: collision with root package name */
    private static final String f84713i = ProtectedSandApp.s("ᴌ");

    /* renamed from: j, reason: collision with root package name */
    private static final String f84714j = ProtectedSandApp.s("ᴍ");

    /* renamed from: k, reason: collision with root package name */
    private static final String f84715k = ProtectedSandApp.s("ᴎ");

    /* renamed from: l, reason: collision with root package name */
    private static final String f84716l = ProtectedSandApp.s("ᴏ");

    /* renamed from: m, reason: collision with root package name */
    private static final String f84717m = ProtectedSandApp.s("ᴐ");

    /* renamed from: n, reason: collision with root package name */
    private static final String f84718n = ProtectedSandApp.s("ᴑ");

    /* renamed from: o, reason: collision with root package name */
    private static final String f84719o = ProtectedSandApp.s("ᴒ");

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* renamed from: q, reason: collision with root package name */
    private static final List<String> f84721q = okhttp3.internal.d.z(ProtectedSandApp.s("ᴌ"), ProtectedSandApp.s("ᴍ"), ProtectedSandApp.s("ᴎ"), ProtectedSandApp.s("ᴏ"), ProtectedSandApp.s("ᴑ"), ProtectedSandApp.s("ᴐ"), ProtectedSandApp.s("ᴒ"), ProtectedSandApp.s("ᴋ"), ProtectedSandApp.s("ᴕ"), ProtectedSandApp.s("ᴖ"), ProtectedSandApp.s("ᴓ"), ProtectedSandApp.s("ᴔ"));

    /* renamed from: r, reason: collision with root package name */
    private static final List<String> f84722r = okhttp3.internal.d.z(ProtectedSandApp.s("ᴌ"), ProtectedSandApp.s("ᴍ"), ProtectedSandApp.s("ᴎ"), ProtectedSandApp.s("ᴏ"), ProtectedSandApp.s("ᴑ"), ProtectedSandApp.s("ᴐ"), ProtectedSandApp.s("ᴒ"), ProtectedSandApp.s("ᴋ"));

    /* compiled from: Http2ExchangeCodec.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013R\u0014\u0010\u001b\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0013R\u0014\u0010\u001d\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0013¨\u0006\u001e"}, d2 = {"Lokhttp3/internal/http2/f$a;", "", "<init>", "()V", "Lokhttp3/d0;", "request", "", "Lokhttp3/internal/http2/b;", "a", "(Lokhttp3/d0;)Ljava/util/List;", "Lokhttp3/u;", "headerBlock", "Lokhttp3/c0;", "protocol", "Lokhttp3/f0$a;", "b", "(Lokhttp3/u;Lokhttp3/c0;)Lokhttp3/f0$a;", "", "CONNECTION", "Ljava/lang/String;", "ENCODING", "HOST", "HTTP_2_SKIPPED_REQUEST_HEADERS", "Ljava/util/List;", "HTTP_2_SKIPPED_RESPONSE_HEADERS", "KEEP_ALIVE", "PROXY_CONNECTION", "TE", "TRANSFER_ENCODING", "UPGRADE", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.http2.f$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final List<b> a(@fg.l d0 request) {
            l0.p(request, ProtectedSandApp.s("\u1cff"));
            u k4 = request.k();
            ArrayList arrayList = new ArrayList(k4.size() + 4);
            arrayList.add(new b(b.f84551k, request.m()));
            arrayList.add(new b(b.f84552l, okhttp3.internal.http.i.f84494a.c(request.q())));
            String i4 = request.i(ProtectedSandApp.s("ᴀ"));
            if (i4 != null) {
                arrayList.add(new b(b.f84554n, i4));
            }
            arrayList.add(new b(b.f84553m, request.q().getScheme()));
            int size = k4.size();
            for (int i5 = 0; i5 < size; i5++) {
                String j4 = k4.j(i5);
                Locale locale = Locale.US;
                l0.o(locale, ProtectedSandApp.s("ᴁ"));
                if (j4 == null) {
                    throw new NullPointerException(ProtectedSandApp.s("ᴅ"));
                }
                String lowerCase = j4.toLowerCase(locale);
                l0.o(lowerCase, ProtectedSandApp.s("ᴂ"));
                if (!f.f84721q.contains(lowerCase) || (l0.g(lowerCase, ProtectedSandApp.s("ᴃ")) && l0.g(k4.s(i5), ProtectedSandApp.s("ᴄ")))) {
                    arrayList.add(new b(lowerCase, k4.s(i5)));
                }
            }
            return arrayList;
        }

        @fg.l
        public final f0.a b(@fg.l u headerBlock, @fg.l c0 protocol) {
            l0.p(headerBlock, ProtectedSandApp.s("ᴆ"));
            l0.p(protocol, ProtectedSandApp.s("ᴇ"));
            u.a aVar = new u.a();
            int size = headerBlock.size();
            okhttp3.internal.http.k kVar = null;
            for (int i4 = 0; i4 < size; i4++) {
                String j4 = headerBlock.j(i4);
                String s4 = headerBlock.s(i4);
                if (l0.g(j4, ProtectedSandApp.s("ᴈ"))) {
                    kVar = okhttp3.internal.http.k.INSTANCE.b(ProtectedSandApp.s("ᴉ") + s4);
                } else if (!f.f84722r.contains(j4)) {
                    aVar.g(j4, s4);
                }
            }
            if (kVar != null) {
                return new f0.a().B(protocol).g(kVar.code).y(kVar.message).w(aVar.i());
            }
            throw new ProtocolException(ProtectedSandApp.s("ᴊ"));
        }

        public Companion(w wVar) {
        }
    }

    public f(@fg.l b0 b0Var, @fg.l okhttp3.internal.connection.f fVar, @fg.l okhttp3.internal.http.g gVar, @fg.l e eVar) {
        l0.p(b0Var, ProtectedSandApp.s("ᴗ"));
        l0.p(fVar, ProtectedSandApp.s("ᴌ"));
        l0.p(gVar, ProtectedSandApp.s("ᴘ"));
        l0.p(eVar, ProtectedSandApp.s("ᴙ"));
        this.connection = fVar;
        this.chain = gVar;
        this.http2Connection = eVar;
        List<c0> h02 = b0Var.h0();
        c0 c0Var = c0.H2_PRIOR_KNOWLEDGE;
        this.protocol = h02.contains(c0Var) ? c0Var : c0.HTTP_2;
    }

    @Override // okhttp3.internal.http.d
    public void a() {
        h hVar = this.stream;
        l0.m(hVar);
        hVar.o().close();
    }

    @Override // okhttp3.internal.http.d
    @fg.l
    public o0 b(@fg.l f0 response) {
        l0.p(response, ProtectedSandApp.s("ᴚ"));
        h hVar = this.stream;
        l0.m(hVar);
        return hVar.getSource();
    }

    @Override // okhttp3.internal.http.d
    @fg.l
    /* renamed from: c, reason: from getter */
    public okhttp3.internal.connection.f getConnection() {
        return this.connection;
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
    public long d(@fg.l f0 response) {
        l0.p(response, ProtectedSandApp.s("ᴚ"));
        if (okhttp3.internal.http.e.c(response)) {
            return okhttp3.internal.d.x(response);
        }
        return 0L;
    }

    @Override // okhttp3.internal.http.d
    @fg.l
    public m0 e(@fg.l d0 request, long contentLength) {
        l0.p(request, ProtectedSandApp.s("ᴛ"));
        h hVar = this.stream;
        l0.m(hVar);
        return hVar.o();
    }

    @Override // okhttp3.internal.http.d
    public void f(@fg.l d0 request) {
        l0.p(request, ProtectedSandApp.s("ᴛ"));
        if (this.stream != null) {
            return;
        }
        this.stream = this.http2Connection.j0(INSTANCE.a(request), request.f() != null);
        if (this.canceled) {
            h hVar = this.stream;
            l0.m(hVar);
            hVar.f(a.CANCEL);
            throw new IOException(ProtectedSandApp.s("ᴜ"));
        }
        h hVar2 = this.stream;
        l0.m(hVar2);
        q0 x4 = hVar2.x();
        long o4 = this.chain.o();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        x4.i(o4, timeUnit);
        h hVar3 = this.stream;
        l0.m(hVar3);
        hVar3.L().i(this.chain.q(), timeUnit);
    }

    @Override // okhttp3.internal.http.d
    @m
    public f0.a g(boolean expectContinue) {
        h hVar = this.stream;
        l0.m(hVar);
        f0.a b5 = INSTANCE.b(hVar.H(), this.protocol);
        if (expectContinue && b5.getCode() == 100) {
            return null;
        }
        return b5;
    }

    @Override // okhttp3.internal.http.d
    public void h() {
        this.http2Connection.flush();
    }

    @Override // okhttp3.internal.http.d
    @fg.l
    public u i() {
        h hVar = this.stream;
        l0.m(hVar);
        return hVar.I();
    }
}
