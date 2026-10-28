package okhttp3;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.x0;
import okhttp3.u;

/* compiled from: Response.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u00011B}\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H\u0007¢\u0006\u0004\b \u0010!J\u0011\u0010\"\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\"\u0010#J\u001b\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060%2\u0006\u0010$\u001a\u00020\u0006¢\u0006\u0004\b&\u0010'J%\u0010)\u001a\u0004\u0018\u00010\u00062\u0006\u0010$\u001a\u00020\u00062\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\fH\u0007¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\f¢\u0006\u0004\b-\u0010,J\u0015\u0010/\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\b/\u00100J\u0011\u00101\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b1\u00102J\r\u00104\u001a\u000203¢\u0006\u0004\b4\u00105J\u0011\u00106\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b6\u00107J\u0011\u00108\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b8\u00107J\u0011\u00109\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b9\u00107J\u0013\u0010;\u001a\b\u0012\u0004\u0012\u00020:0%¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u00020=H\u0007¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0013H\u0007¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0013H\u0007¢\u0006\u0004\bB\u0010AJ\u000f\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u0006H\u0016¢\u0006\u0004\bF\u0010!R\u0018\u0010H\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010GR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b8\u0010I\u001a\u0004\bJ\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u001e\u0010K\u001a\u0004\bL\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\"\u0010M\u001a\u0004\bN\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b+\u00104\u001a\u0004\bO\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007¢\u0006\f\n\u0004\b \u0010P\u001a\u0004\bQ\u0010#R\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b6\u0010R\u001a\u0004\bS\u0010,R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007¢\u0006\f\n\u0004\b9\u0010T\u001a\u0004\bU\u00102R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u00107R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b\u001c\u0010W\u001a\u0004\bY\u00107R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\bB\u0010W\u001a\u0004\bZ\u00107R\u0017\u0010\u0014\u001a\u00020\u00138\u0007¢\u0006\f\n\u0004\b\u001a\u0010/\u001a\u0004\b[\u0010AR\u0017\u0010\u0015\u001a\u00020\u00138\u0007¢\u0006\f\n\u0004\b@\u0010/\u001a\u0004\b\\\u0010AR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0001X\u0080\u0004¢\u0006\f\n\u0004\bU\u0010]\u001a\u0004\b^\u0010_R\u0011\u0010c\u001a\u00020`8F¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0011\u0010e\u001a\u00020`8F¢\u0006\u0006\u001a\u0004\bd\u0010bR\u0011\u0010g\u001a\u00020=8G¢\u0006\u0006\u001a\u0004\bf\u0010?¨\u0006h"}, d2 = {"Lokhttp3/f0;", "Ljava/io/Closeable;", "Lokhttp3/d0;", "request", "Lokhttp3/c0;", "protocol", "", "message", "", "code", "Lokhttp3/t;", "handshake", "Lokhttp3/u;", "headers", "Lokhttp3/g0;", "body", "networkResponse", "cacheResponse", "priorResponse", "", "sentRequestAtMillis", "receivedResponseAtMillis", "Lokhttp3/internal/connection/c;", "exchange", "<init>", "(Lokhttp3/d0;Lokhttp3/c0;Ljava/lang/String;ILokhttp3/t;Lokhttp3/u;Lokhttp3/g0;Lokhttp3/f0;Lokhttp3/f0;Lokhttp3/f0;JJLokhttp3/internal/connection/c;)V", "m", "()Lokhttp3/d0;", "k", "()Lokhttp3/c0;", "d", "()I", "g", "()Ljava/lang/String;", "e", "()Lokhttp3/t;", "name", "", "D", "(Ljava/lang/String;)Ljava/util/List;", "defaultValue", "B", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "f", "()Lokhttp3/u;", "Q", "byteCount", "J", "(J)Lokhttp3/g0;", "a", "()Lokhttp3/g0;", "Lokhttp3/f0$a;", "I", "()Lokhttp3/f0$a;", "h", "()Lokhttp3/f0;", "c", "i", "Lokhttp3/h;", "t", "()Ljava/util/List;", "Lokhttp3/d;", "b", "()Lokhttp3/d;", "n", "()J", "l", "Lkotlin/k2;", "close", "()V", "toString", "Lokhttp3/d;", "lazyCacheControl", "Lokhttp3/d0;", "N", "Lokhttp3/c0;", "L", "Ljava/lang/String;", "G", "u", "Lokhttp3/t;", "y", "Lokhttp3/u;", "E", "Lokhttp3/g0;", "o", "j", "Lokhttp3/f0;", "H", "s", "K", "O", "M", "Lokhttp3/internal/connection/c;", "x", "()Lokhttp3/internal/connection/c;", "", "r1", "()Z", "isSuccessful", "F", "isRedirect", "q", "cacheControl", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class f0 implements Closeable {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private d lazyCacheControl;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final d0 request;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c0 protocol;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String message;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int code;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final t handshake;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final u headers;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final g0 body;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final f0 networkResponse;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final f0 cacheResponse;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final f0 priorResponse;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final long sentRequestAtMillis;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long receivedResponseAtMillis;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final okhttp3.internal.connection.c exchange;

    public f0(@fg.l d0 d0Var, @fg.l c0 c0Var, @fg.l String str, int i4, @fg.m t tVar, @fg.l u uVar, @fg.m g0 g0Var, @fg.m f0 f0Var, @fg.m f0 f0Var2, @fg.m f0 f0Var3, long j4, long j5, @fg.m okhttp3.internal.connection.c cVar) {
        l0.p(d0Var, ProtectedSandApp.s("鼂\u0001"));
        l0.p(c0Var, ProtectedSandApp.s("鼃\u0001"));
        l0.p(str, ProtectedSandApp.s("鼄\u0001"));
        l0.p(uVar, ProtectedSandApp.s("鼅\u0001"));
        this.request = d0Var;
        this.protocol = c0Var;
        this.message = str;
        this.code = i4;
        this.handshake = tVar;
        this.headers = uVar;
        this.body = g0Var;
        this.networkResponse = f0Var;
        this.cacheResponse = f0Var2;
        this.priorResponse = f0Var3;
        this.sentRequestAtMillis = j4;
        this.receivedResponseAtMillis = j5;
        this.exchange = cVar;
    }

    public static /* synthetic */ String C(f0 f0Var, String str, String str2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str2 = null;
        }
        return f0Var.B(str, str2);
    }

    @fg.m
    @kd.j
    public final String B(@fg.l String name, @fg.m String defaultValue) {
        l0.p(name, ProtectedSandApp.s("鼆\u0001"));
        String f4 = this.headers.f(name);
        return f4 != null ? f4 : defaultValue;
    }

    @fg.l
    public final List<String> D(@fg.l String name) {
        l0.p(name, ProtectedSandApp.s("鼆\u0001"));
        return this.headers.v(name);
    }

    @fg.l
    @kd.i(name = "headers")
    /* renamed from: E, reason: from getter */
    public final u getHeaders() {
        return this.headers;
    }

    public final boolean F() {
        int i4 = this.code;
        if (i4 != 307 && i4 != 308) {
            switch (i4) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    @fg.l
    @kd.i(name = "message")
    /* renamed from: G, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @fg.m
    @kd.i(name = "networkResponse")
    /* renamed from: H, reason: from getter */
    public final f0 getNetworkResponse() {
        return this.networkResponse;
    }

    @fg.l
    public final a I() {
        return new a(this);
    }

    @fg.l
    public final g0 J(long byteCount) throws IOException {
        g0 g0Var = this.body;
        l0.m(g0Var);
        okio.o peek = g0Var.getF84142d().peek();
        okio.m mVar = new okio.m();
        peek.h1(byteCount);
        mVar.f3(peek, Math.min(byteCount, peek.getBuffer().size()));
        return g0.INSTANCE.f(mVar, this.body.getF84143e(), mVar.size());
    }

    @fg.m
    @kd.i(name = "priorResponse")
    /* renamed from: K, reason: from getter */
    public final f0 getPriorResponse() {
        return this.priorResponse;
    }

    @fg.l
    @kd.i(name = "protocol")
    /* renamed from: L, reason: from getter */
    public final c0 getProtocol() {
        return this.protocol;
    }

    @kd.i(name = "receivedResponseAtMillis")
    /* renamed from: M, reason: from getter */
    public final long getReceivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @fg.l
    @kd.i(name = "request")
    /* renamed from: N, reason: from getter */
    public final d0 getRequest() {
        return this.request;
    }

    @kd.i(name = "sentRequestAtMillis")
    /* renamed from: O, reason: from getter */
    public final long getSentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    @fg.l
    public final u Q() throws IOException {
        okhttp3.internal.connection.c cVar = this.exchange;
        if (cVar != null) {
            return cVar.u();
        }
        throw new IllegalStateException(ProtectedSandApp.s("鼇\u0001"));
    }

    @fg.m
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "body", imports = {}))
    @kd.i(name = "-deprecated_body")
    /* renamed from: a, reason: from getter */
    public final g0 getBody() {
        return this.body;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "cacheControl", imports = {}))
    @kd.i(name = "-deprecated_cacheControl")
    public final d b() {
        return q();
    }

    @fg.m
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "cacheResponse", imports = {}))
    @kd.i(name = "-deprecated_cacheResponse")
    /* renamed from: c, reason: from getter */
    public final f0 getCacheResponse() {
        return this.cacheResponse;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        g0 g0Var = this.body;
        if (g0Var == null) {
            throw new IllegalStateException(ProtectedSandApp.s("鼈\u0001"));
        }
        g0Var.close();
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "code", imports = {}))
    @kd.i(name = "-deprecated_code")
    /* renamed from: d, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @fg.m
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "handshake", imports = {}))
    @kd.i(name = "-deprecated_handshake")
    /* renamed from: e, reason: from getter */
    public final t getHandshake() {
        return this.handshake;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "headers", imports = {}))
    @kd.i(name = "-deprecated_headers")
    public final u f() {
        return this.headers;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "message", imports = {}))
    @kd.i(name = "-deprecated_message")
    public final String g() {
        return this.message;
    }

    @fg.m
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "networkResponse", imports = {}))
    @kd.i(name = "-deprecated_networkResponse")
    public final f0 h() {
        return this.networkResponse;
    }

    @fg.m
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "priorResponse", imports = {}))
    @kd.i(name = "-deprecated_priorResponse")
    public final f0 i() {
        return this.priorResponse;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "protocol", imports = {}))
    @kd.i(name = "-deprecated_protocol")
    public final c0 k() {
        return this.protocol;
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "receivedResponseAtMillis", imports = {}))
    @kd.i(name = "-deprecated_receivedResponseAtMillis")
    public final long l() {
        return this.receivedResponseAtMillis;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "request", imports = {}))
    @kd.i(name = "-deprecated_request")
    public final d0 m() {
        return this.request;
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "sentRequestAtMillis", imports = {}))
    @kd.i(name = "-deprecated_sentRequestAtMillis")
    public final long n() {
        return this.sentRequestAtMillis;
    }

    @fg.m
    @kd.i(name = "body")
    public final g0 o() {
        return this.body;
    }

    @fg.l
    @kd.i(name = "cacheControl")
    public final d q() {
        d dVar = this.lazyCacheControl;
        if (dVar != null) {
            return dVar;
        }
        d c5 = d.INSTANCE.c(this.headers);
        this.lazyCacheControl = c5;
        return c5;
    }

    public final boolean r1() {
        int i4 = this.code;
        return 200 <= i4 && 299 >= i4;
    }

    @fg.m
    @kd.i(name = "cacheResponse")
    public final f0 s() {
        return this.cacheResponse;
    }

    @fg.l
    public final List<h> t() {
        String s4;
        u uVar = this.headers;
        int i4 = this.code;
        if (i4 == 401) {
            s4 = ProtectedSandApp.s("鼊\u0001");
        } else {
            if (i4 != 407) {
                return kotlin.collections.j0.f74919b;
            }
            s4 = ProtectedSandApp.s("鼉\u0001");
        }
        return okhttp3.internal.http.e.b(uVar, s4);
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("鼋\u0001") + this.protocol + ProtectedSandApp.s("鼌\u0001") + this.code + ProtectedSandApp.s("鼍\u0001") + this.message + ProtectedSandApp.s("鼎\u0001") + this.request.q() + '}';
    }

    @kd.i(name = "code")
    public final int u() {
        return this.code;
    }

    @fg.m
    @kd.i(name = "exchange")
    /* renamed from: x, reason: from getter */
    public final okhttp3.internal.connection.c getExchange() {
        return this.exchange;
    }

    @fg.m
    @kd.i(name = "handshake")
    public final t y() {
        return this.handshake;
    }

    @fg.m
    @kd.j
    public final String z(@fg.l String str) {
        return C(this, str, null, 2, null);
    }

    /* compiled from: Response.kt */
    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J!\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010\"J\u0017\u0010$\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010\u001bJ\u0017\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0019\u0010+\u001a\u00020\u00002\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,J\u0019\u0010.\u001a\u00020\u00002\b\u0010-\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b.\u0010/J\u0019\u00101\u001a\u00020\u00002\b\u00100\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b1\u0010/J\u0019\u00103\u001a\u00020\u00002\b\u00102\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b3\u0010/J\u0017\u00106\u001a\u00020\u00002\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u00002\u0006\u00108\u001a\u000204H\u0016¢\u0006\u0004\b9\u00107J\u0017\u0010<\u001a\u00020\t2\u0006\u0010;\u001a\u00020:H\u0000¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0004H\u0016¢\u0006\u0004\b>\u0010?R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010\u0016\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b>\u0010J\u001a\u0004\bK\u0010L\"\u0004\bJ\u0010MR$\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010&\u001a\u00020X8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R$\u0010*\u001a\u0004\u0018\u00010)8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR$\u0010-\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b_\u0010c\u001a\u0004\bd\u0010?\"\u0004\be\u0010\u0006R$\u00100\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bf\u0010c\u001a\u0004\bf\u0010?\"\u0004\bg\u0010\u0006R$\u00102\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010c\u001a\u0004\bh\u0010?\"\u0004\bi\u0010\u0006R\"\u00105\u001a\u0002048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u00108\u001a\u0002048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bT\u0010k\u001a\u0004\bp\u0010m\"\u0004\bq\u0010oR$\u0010t\u001a\u0004\u0018\u00010:8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bZ\u0010r\u001a\u0004\bj\u0010s\"\u0004\bk\u0010=¨\u0006u"}, d2 = {"Lokhttp3/f0$a;", "", "<init>", "()V", "Lokhttp3/f0;", "response", "(Lokhttp3/f0;)V", "", "name", "Lkotlin/k2;", "f", "(Ljava/lang/String;Lokhttp3/f0;)V", "e", "Lokhttp3/d0;", "request", "E", "(Lokhttp3/d0;)Lokhttp3/f0$a;", "Lokhttp3/c0;", "protocol", "B", "(Lokhttp3/c0;)Lokhttp3/f0$a;", "", "code", "g", "(I)Lokhttp3/f0$a;", "message", "y", "(Ljava/lang/String;)Lokhttp3/f0$a;", "Lokhttp3/t;", "handshake", "u", "(Lokhttp3/t;)Lokhttp3/f0$a;", "value", "v", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/f0$a;", "a", "D", "Lokhttp3/u;", "headers", "w", "(Lokhttp3/u;)Lokhttp3/f0$a;", "Lokhttp3/g0;", "body", "b", "(Lokhttp3/g0;)Lokhttp3/f0$a;", "networkResponse", "z", "(Lokhttp3/f0;)Lokhttp3/f0$a;", "cacheResponse", "d", "priorResponse", "A", "", "sentRequestAtMillis", "F", "(J)Lokhttp3/f0$a;", "receivedResponseAtMillis", "C", "Lokhttp3/internal/connection/c;", "deferredTrailers", "x", "(Lokhttp3/internal/connection/c;)V", "c", "()Lokhttp3/f0;", "Lokhttp3/d0;", "s", "()Lokhttp3/d0;", "R", "(Lokhttp3/d0;)V", "Lokhttp3/c0;", "q", "()Lokhttp3/c0;", "P", "(Lokhttp3/c0;)V", "I", "j", "()I", "(I)V", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "M", "(Ljava/lang/String;)V", "Lokhttp3/t;", "l", "()Lokhttp3/t;", "K", "(Lokhttp3/t;)V", "Lokhttp3/u$a;", "Lokhttp3/u$a;", "m", "()Lokhttp3/u$a;", "L", "(Lokhttp3/u$a;)V", "Lokhttp3/g0;", "h", "()Lokhttp3/g0;", "G", "(Lokhttp3/g0;)V", "Lokhttp3/f0;", "o", "N", "i", "H", "p", "O", "k", "J", "t", "()J", "S", "(J)V", "r", "Q", "Lokhttp3/internal/connection/c;", "()Lokhttp3/internal/connection/c;", "exchange", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private d0 request;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private c0 protocol;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int code;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private String message;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private t handshake;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private u.a headers;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private g0 body;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private f0 networkResponse;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private f0 cacheResponse;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private f0 priorResponse;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private long sentRequestAtMillis;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private long receivedResponseAtMillis;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private okhttp3.internal.connection.c exchange;

        public a() {
            this.code = -1;
            this.headers = new u.a();
        }

        private final void e(f0 response) {
            if (response != null) {
                if (!(response.o() == null)) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("黯\u0001"));
                }
            }
        }

        private final void f(String name, f0 response) {
            if (response != null) {
                if (!(response.o() == null)) {
                    throw new IllegalArgumentException(androidx.compose.runtime.changelist.j.a(name, ProtectedSandApp.s("黳\u0001")).toString());
                }
                if (!(response.getNetworkResponse() == null)) {
                    throw new IllegalArgumentException(androidx.compose.runtime.changelist.j.a(name, ProtectedSandApp.s("黲\u0001")).toString());
                }
                if (!(response.s() == null)) {
                    throw new IllegalArgumentException(androidx.compose.runtime.changelist.j.a(name, ProtectedSandApp.s("黱\u0001")).toString());
                }
                if (!(response.getPriorResponse() == null)) {
                    throw new IllegalArgumentException(androidx.compose.runtime.changelist.j.a(name, ProtectedSandApp.s("黰\u0001")).toString());
                }
            }
        }

        @fg.l
        public a A(@fg.m f0 priorResponse) {
            e(priorResponse);
            this.priorResponse = priorResponse;
            return this;
        }

        @fg.l
        public a B(@fg.l c0 protocol) {
            l0.p(protocol, ProtectedSandApp.s("黴\u0001"));
            this.protocol = protocol;
            return this;
        }

        @fg.l
        public a C(long receivedResponseAtMillis) {
            this.receivedResponseAtMillis = receivedResponseAtMillis;
            return this;
        }

        @fg.l
        public a D(@fg.l String name) {
            l0.p(name, ProtectedSandApp.s("黵\u0001"));
            this.headers.l(name);
            return this;
        }

        @fg.l
        public a E(@fg.l d0 request) {
            l0.p(request, ProtectedSandApp.s("黶\u0001"));
            this.request = request;
            return this;
        }

        @fg.l
        public a F(long sentRequestAtMillis) {
            this.sentRequestAtMillis = sentRequestAtMillis;
            return this;
        }

        public final void G(@fg.m g0 g0Var) {
            this.body = g0Var;
        }

        public final void H(@fg.m f0 f0Var) {
            this.cacheResponse = f0Var;
        }

        public final void I(int i4) {
            this.code = i4;
        }

        public final void J(@fg.m okhttp3.internal.connection.c cVar) {
            this.exchange = cVar;
        }

        public final void K(@fg.m t tVar) {
            this.handshake = tVar;
        }

        public final void L(@fg.l u.a aVar) {
            l0.p(aVar, ProtectedSandApp.s("黷\u0001"));
            this.headers = aVar;
        }

        public final void M(@fg.m String str) {
            this.message = str;
        }

        public final void N(@fg.m f0 f0Var) {
            this.networkResponse = f0Var;
        }

        public final void O(@fg.m f0 f0Var) {
            this.priorResponse = f0Var;
        }

        public final void P(@fg.m c0 c0Var) {
            this.protocol = c0Var;
        }

        public final void Q(long j4) {
            this.receivedResponseAtMillis = j4;
        }

        public final void R(@fg.m d0 d0Var) {
            this.request = d0Var;
        }

        public final void S(long j4) {
            this.sentRequestAtMillis = j4;
        }

        @fg.l
        public a a(@fg.l String name, @fg.l String value) {
            l0.p(name, ProtectedSandApp.s("黵\u0001"));
            l0.p(value, ProtectedSandApp.s("黸\u0001"));
            this.headers.b(name, value);
            return this;
        }

        @fg.l
        public a b(@fg.m g0 body) {
            this.body = body;
            return this;
        }

        @fg.l
        public f0 c() {
            int i4 = this.code;
            if (!(i4 >= 0)) {
                throw new IllegalStateException((ProtectedSandApp.s("黼\u0001") + this.code).toString());
            }
            d0 d0Var = this.request;
            if (d0Var == null) {
                throw new IllegalStateException(ProtectedSandApp.s("黻\u0001"));
            }
            c0 c0Var = this.protocol;
            if (c0Var == null) {
                throw new IllegalStateException(ProtectedSandApp.s("黺\u0001"));
            }
            String str = this.message;
            if (str != null) {
                return new f0(d0Var, c0Var, str, i4, this.handshake, this.headers.i(), this.body, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange);
            }
            throw new IllegalStateException(ProtectedSandApp.s("黹\u0001"));
        }

        @fg.l
        public a d(@fg.m f0 cacheResponse) {
            f(ProtectedSandApp.s("黽\u0001"), cacheResponse);
            this.cacheResponse = cacheResponse;
            return this;
        }

        @fg.l
        public a g(int code) {
            this.code = code;
            return this;
        }

        @fg.m
        /* renamed from: h, reason: from getter */
        public final g0 getBody() {
            return this.body;
        }

        @fg.m
        /* renamed from: i, reason: from getter */
        public final f0 getCacheResponse() {
            return this.cacheResponse;
        }

        /* renamed from: j, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        @fg.m
        /* renamed from: k, reason: from getter */
        public final okhttp3.internal.connection.c getExchange() {
            return this.exchange;
        }

        @fg.m
        /* renamed from: l, reason: from getter */
        public final t getHandshake() {
            return this.handshake;
        }

        @fg.l
        /* renamed from: m, reason: from getter */
        public final u.a getHeaders() {
            return this.headers;
        }

        @fg.m
        /* renamed from: n, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @fg.m
        /* renamed from: o, reason: from getter */
        public final f0 getNetworkResponse() {
            return this.networkResponse;
        }

        @fg.m
        /* renamed from: p, reason: from getter */
        public final f0 getPriorResponse() {
            return this.priorResponse;
        }

        @fg.m
        /* renamed from: q, reason: from getter */
        public final c0 getProtocol() {
            return this.protocol;
        }

        /* renamed from: r, reason: from getter */
        public final long getReceivedResponseAtMillis() {
            return this.receivedResponseAtMillis;
        }

        @fg.m
        /* renamed from: s, reason: from getter */
        public final d0 getRequest() {
            return this.request;
        }

        /* renamed from: t, reason: from getter */
        public final long getSentRequestAtMillis() {
            return this.sentRequestAtMillis;
        }

        @fg.l
        public a u(@fg.m t handshake) {
            this.handshake = handshake;
            return this;
        }

        @fg.l
        public a v(@fg.l String name, @fg.l String value) {
            l0.p(name, ProtectedSandApp.s("黵\u0001"));
            l0.p(value, ProtectedSandApp.s("黸\u0001"));
            this.headers.m(name, value);
            return this;
        }

        @fg.l
        public a w(@fg.l u headers) {
            l0.p(headers, ProtectedSandApp.s("黾\u0001"));
            this.headers = headers.m();
            return this;
        }

        public final void x(@fg.l okhttp3.internal.connection.c deferredTrailers) {
            l0.p(deferredTrailers, ProtectedSandApp.s("黿\u0001"));
            this.exchange = deferredTrailers;
        }

        @fg.l
        public a y(@fg.l String message) {
            l0.p(message, ProtectedSandApp.s("鼀\u0001"));
            this.message = message;
            return this;
        }

        @fg.l
        public a z(@fg.m f0 networkResponse) {
            f(ProtectedSandApp.s("鼁\u0001"), networkResponse);
            this.networkResponse = networkResponse;
            return this;
        }

        public a(@fg.l f0 f0Var) {
            l0.p(f0Var, ProtectedSandApp.s("黮\u0001"));
            this.code = -1;
            this.request = f0Var.getRequest();
            this.protocol = f0Var.getProtocol();
            this.code = f0Var.u();
            this.message = f0Var.getMessage();
            this.handshake = f0Var.y();
            this.headers = f0Var.getHeaders().m();
            this.body = f0Var.o();
            this.networkResponse = f0Var.getNetworkResponse();
            this.cacheResponse = f0Var.s();
            this.priorResponse = f0Var.getPriorResponse();
            this.sentRequestAtMillis = f0Var.getSentRequestAtMillis();
            this.receivedResponseAtMillis = f0Var.getReceivedResponseAtMillis();
            this.exchange = f0Var.getExchange();
        }
    }
}
