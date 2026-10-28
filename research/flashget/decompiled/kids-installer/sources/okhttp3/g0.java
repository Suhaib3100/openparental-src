package okhttp3;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.EmptyList;
import okhttp3.v;

/* compiled from: Response.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u001eB}\b\u0000\u0012\u0006\u00106\u001a\u00020\u0002\u0012\u0006\u0010:\u001a\u00020\u0005\u0012\u0006\u0010=\u001a\u00020\u000b\u0012\u0006\u0010A\u001a\u00020\b\u0012\b\u0010E\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010I\u001a\u00020\u0016\u0012\b\u0010L\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010P\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010S\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010V\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010Y\u001a\u00020\u001a\u0012\u0006\u0010\\\u001a\u00020\u001a\u0012\b\u0010a\u001a\u0004\u0018\u00010]¢\u0006\u0004\bi\u0010jJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00122\u0006\u0010\u0011\u001a\u00020\u000bJ\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000bH\u0007J\u000f\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u0016J\u000e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0006\u0010!\u001a\u00020 J\u0011\u0010\"\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\"\u0010#J\u0011\u0010$\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b$\u0010#J\u0011\u0010%\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b%\u0010#J\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0012J\u000f\u0010)\u001a\u00020(H\u0007¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u001aH\u0007¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u001aH\u0007¢\u0006\u0004\b-\u0010,J\b\u0010/\u001a\u00020.H\u0016J\b\u00100\u001a\u00020\u000bH\u0016R\u0018\u00102\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u00101R\u0017\u00106\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u0004R\u0017\u0010:\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010\u0007R\u0017\u0010=\u001a\u00020\u000b8\u0007¢\u0006\f\n\u0004\b+\u0010;\u001a\u0004\b<\u0010\rR\u0017\u0010A\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010\nR\u0019\u0010E\u001a\u0004\u0018\u00010\u000e8\u0007¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010\u0010R\u0017\u0010I\u001a\u00020\u00168\u0007¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010\u0018R\u0019\u0010L\u001a\u0004\u0018\u00010\u001c8\u0007¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bB\u0010\u001fR\u0019\u0010P\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010#R\u0019\u0010S\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\bQ\u0010N\u001a\u0004\bR\u0010#R\u0019\u0010V\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\bT\u0010N\u001a\u0004\bU\u0010#R\u0017\u0010Y\u001a\u00020\u001a8\u0007¢\u0006\f\n\u0004\bR\u0010W\u001a\u0004\bX\u0010,R\u0017\u0010\\\u001a\u00020\u001a8\u0007¢\u0006\f\n\u0004\bZ\u0010W\u001a\u0004\b[\u0010,R\u001c\u0010a\u001a\u0004\u0018\u00010]8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010^\u001a\u0004\b_\u0010`R\u0011\u0010e\u001a\u00020b8F¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0011\u0010g\u001a\u00020b8F¢\u0006\u0006\u001a\u0004\bf\u0010dR\u0011\u0010h\u001a\u00020(8G¢\u0006\u0006\u001a\u0004\bM\u0010*¨\u0006k"}, d2 = {"Lokhttp3/g0;", "Ljava/io/Closeable;", "Lokhttp3/e0;", "o", "()Lokhttp3/e0;", "Lokhttp3/d0;", "m", "()Lokhttp3/d0;", "", "d", "()I", "", "j", "()Ljava/lang/String;", "Lokhttp3/t;", "e", "()Lokhttp3/t;", "name", "", "R", "defaultValue", "O", "Lokhttp3/v;", "g", "()Lokhttp3/v;", "n0", "", "byteCount", "Lokhttp3/h0;", "f0", "a", "()Lokhttp3/h0;", "Lokhttp3/g0$a;", "e0", "k", "()Lokhttp3/g0;", "c", "l", "Lokhttp3/h;", "B", "Lokhttp3/d;", "b", "()Lokhttp3/d;", "r", "()J", "n", "Lkotlin/m2;", "close", "toString", "Lokhttp3/d;", "lazyCacheControl", "p", "Lokhttp3/e0;", "l0", "request", "q", "Lokhttp3/d0;", "i0", "protocol", "Ljava/lang/String;", "b0", "message", "s", "I", "D", "code", "t", "Lokhttp3/t;", "G", "handshake", "u", "Lokhttp3/v;", "U", "headers", "v", "Lokhttp3/h0;", "body", "w", "Lokhttp3/g0;", "d0", "networkResponse", "x", "z", "cacheResponse", "y", "g0", "priorResponse", "J", "m0", "sentRequestAtMillis", "A", "k0", "receivedResponseAtMillis", "Lokhttp3/internal/connection/c;", "Lokhttp3/internal/connection/c;", "F", "()Lokhttp3/internal/connection/c;", "exchange", "", "Z", "()Z", "isSuccessful", "X", "isRedirect", "cacheControl", "<init>", "(Lokhttp3/e0;Lokhttp3/d0;Ljava/lang/String;ILokhttp3/t;Lokhttp3/v;Lokhttp3/h0;Lokhttp3/g0;Lokhttp3/g0;Lokhttp3/g0;JJLokhttp3/internal/connection/c;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class g0 implements Closeable {

    /* renamed from: A, reason: from kotlin metadata */
    private final long receivedResponseAtMillis;

    /* renamed from: B, reason: from kotlin metadata */
    @d5.e
    private final okhttp3.internal.connection.c exchange;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private d lazyCacheControl;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final e0 request;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final d0 protocol;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String message;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final int code;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final t handshake;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final v headers;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final h0 body;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final g0 networkResponse;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final g0 cacheResponse;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final g0 priorResponse;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final long sentRequestAtMillis;

    public g0(@d5.d e0 e0Var, @d5.d d0 d0Var, @d5.d String str, int i5, @d5.e t tVar, @d5.d v vVar, @d5.e h0 h0Var, @d5.e g0 g0Var, @d5.e g0 g0Var2, @d5.e g0 g0Var3, long j5, long j6, @d5.e okhttp3.internal.connection.c cVar) {
        kotlin.jvm.internal.l0.p(e0Var, ProtectedSandApp.s("怄"));
        kotlin.jvm.internal.l0.p(d0Var, ProtectedSandApp.s("怅"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("怆"));
        kotlin.jvm.internal.l0.p(vVar, ProtectedSandApp.s("怇"));
        this.request = e0Var;
        this.protocol = d0Var;
        this.message = str;
        this.code = i5;
        this.handshake = tVar;
        this.headers = vVar;
        this.body = h0Var;
        this.networkResponse = g0Var;
        this.cacheResponse = g0Var2;
        this.priorResponse = g0Var3;
        this.sentRequestAtMillis = j5;
        this.receivedResponseAtMillis = j6;
        this.exchange = cVar;
    }

    public static /* synthetic */ String P(g0 g0Var, String str, String str2, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str2 = null;
        }
        return g0Var.O(str, str2);
    }

    @d5.d
    public final List<h> B() {
        String s5;
        v vVar = this.headers;
        int i5 = this.code;
        if (i5 == 401) {
            s5 = ProtectedSandApp.s("怉");
        } else {
            if (i5 != 407) {
                return EmptyList.f23167o;
            }
            s5 = ProtectedSandApp.s("怈");
        }
        return okhttp3.internal.http.e.b(vVar, s5);
    }

    @p3.i(name = "code")
    /* renamed from: D, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @p3.i(name = "exchange")
    @d5.e
    /* renamed from: F, reason: from getter */
    public final okhttp3.internal.connection.c getExchange() {
        return this.exchange;
    }

    @p3.i(name = "handshake")
    @d5.e
    /* renamed from: G, reason: from getter */
    public final t getHandshake() {
        return this.handshake;
    }

    @d5.e
    @p3.j
    public final String H(@d5.d String str) {
        return P(this, str, null, 2, null);
    }

    @d5.e
    @p3.j
    public final String O(@d5.d String name, @d5.e String defaultValue) {
        kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("怊"));
        String g5 = this.headers.g(name);
        return g5 != null ? g5 : defaultValue;
    }

    @d5.d
    public final List<String> R(@d5.d String name) {
        kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("怋"));
        return this.headers.y(name);
    }

    @p3.i(name = "headers")
    @d5.d
    /* renamed from: U, reason: from getter */
    public final v getHeaders() {
        return this.headers;
    }

    public final boolean X() {
        int i5 = this.code;
        if (i5 != 307 && i5 != 308) {
            switch (i5) {
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

    public final boolean Z() {
        int i5 = this.code;
        return 200 <= i5 && 299 >= i5;
    }

    @p3.i(name = "-deprecated_body")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "body", imports = {}))
    @d5.e
    /* renamed from: a, reason: from getter */
    public final h0 getBody() {
        return this.body;
    }

    @p3.i(name = "-deprecated_cacheControl")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "cacheControl", imports = {}))
    @d5.d
    public final d b() {
        return w();
    }

    @p3.i(name = "message")
    @d5.d
    /* renamed from: b0, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @p3.i(name = "-deprecated_cacheResponse")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "cacheResponse", imports = {}))
    @d5.e
    /* renamed from: c, reason: from getter */
    public final g0 getCacheResponse() {
        return this.cacheResponse;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        h0 h0Var = this.body;
        if (h0Var == null) {
            throw new IllegalStateException(ProtectedSandApp.s("怌").toString());
        }
        h0Var.close();
    }

    @p3.i(name = "-deprecated_code")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "code", imports = {}))
    public final int d() {
        return this.code;
    }

    @p3.i(name = "networkResponse")
    @d5.e
    /* renamed from: d0, reason: from getter */
    public final g0 getNetworkResponse() {
        return this.networkResponse;
    }

    @p3.i(name = "-deprecated_handshake")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "handshake", imports = {}))
    @d5.e
    public final t e() {
        return this.handshake;
    }

    @d5.d
    public final a e0() {
        return new a(this);
    }

    @d5.d
    public final h0 f0(long byteCount) throws IOException {
        h0 h0Var = this.body;
        kotlin.jvm.internal.l0.m(h0Var);
        okio.o peek = h0Var.getF30636q().peek();
        okio.m mVar = new okio.m();
        peek.C0(byteCount);
        mVar.D0(peek, Math.min(byteCount, peek.i().size()));
        return h0.INSTANCE.f(mVar, this.body.getF30637r(), mVar.size());
    }

    @p3.i(name = "-deprecated_headers")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "headers", imports = {}))
    @d5.d
    public final v g() {
        return this.headers;
    }

    @p3.i(name = "priorResponse")
    @d5.e
    /* renamed from: g0, reason: from getter */
    public final g0 getPriorResponse() {
        return this.priorResponse;
    }

    @p3.i(name = "protocol")
    @d5.d
    /* renamed from: i0, reason: from getter */
    public final d0 getProtocol() {
        return this.protocol;
    }

    @p3.i(name = "-deprecated_message")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "message", imports = {}))
    @d5.d
    public final String j() {
        return this.message;
    }

    @p3.i(name = "-deprecated_networkResponse")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "networkResponse", imports = {}))
    @d5.e
    public final g0 k() {
        return this.networkResponse;
    }

    @p3.i(name = "receivedResponseAtMillis")
    /* renamed from: k0, reason: from getter */
    public final long getReceivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @p3.i(name = "-deprecated_priorResponse")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "priorResponse", imports = {}))
    @d5.e
    public final g0 l() {
        return this.priorResponse;
    }

    @p3.i(name = "request")
    @d5.d
    /* renamed from: l0, reason: from getter */
    public final e0 getRequest() {
        return this.request;
    }

    @p3.i(name = "-deprecated_protocol")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "protocol", imports = {}))
    @d5.d
    public final d0 m() {
        return this.protocol;
    }

    @p3.i(name = "sentRequestAtMillis")
    /* renamed from: m0, reason: from getter */
    public final long getSentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    @p3.i(name = "-deprecated_receivedResponseAtMillis")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "receivedResponseAtMillis", imports = {}))
    public final long n() {
        return this.receivedResponseAtMillis;
    }

    @d5.d
    public final v n0() throws IOException {
        okhttp3.internal.connection.c cVar = this.exchange;
        if (cVar != null) {
            return cVar.u();
        }
        throw new IllegalStateException(ProtectedSandApp.s("怍").toString());
    }

    @p3.i(name = "-deprecated_request")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "request", imports = {}))
    @d5.d
    public final e0 o() {
        return this.request;
    }

    @p3.i(name = "-deprecated_sentRequestAtMillis")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "sentRequestAtMillis", imports = {}))
    public final long r() {
        return this.sentRequestAtMillis;
    }

    @p3.i(name = "body")
    @d5.e
    public final h0 t() {
        return this.body;
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("怎") + this.protocol + ProtectedSandApp.s("怏") + this.code + ProtectedSandApp.s("怐") + this.message + ProtectedSandApp.s("怑") + this.request.q() + '}';
    }

    @p3.i(name = "cacheControl")
    @d5.d
    public final d w() {
        d dVar = this.lazyCacheControl;
        if (dVar != null) {
            return dVar;
        }
        d c6 = d.INSTANCE.c(this.headers);
        this.lazyCacheControl = c6;
        return c6;
    }

    @p3.i(name = "cacheResponse")
    @d5.e
    public final g0 z() {
        return this.cacheResponse;
    }

    /* compiled from: Response.kt */
    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b!\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\bh\u0010iB\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bh\u0010XJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0012\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\u0010\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0012\u0010 \u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016J\u0012\u0010\"\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010$\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010&\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010)\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'H\u0016J\u0010\u0010+\u001a\u00020\u00002\u0006\u0010*\u001a\u00020'H\u0016J\u0017\u0010.\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,H\u0000¢\u0006\u0004\b.\u0010/J\b\u00100\u001a\u00020\u0004H\u0016R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u0010;\u001a\u0004\b<\u0010=\"\u0004\b;\u0010>R$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010\u001c\u001a\u00020I8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010!\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bP\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010#\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bY\u0010T\u001a\u0004\bY\u0010V\"\u0004\bZ\u0010XR$\u0010%\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010T\u001a\u0004\b[\u0010V\"\u0004\b\\\u0010XR\"\u0010(\u001a\u00020'8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010*\u001a\u00020'8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u0010^\u001a\u0004\bc\u0010`\"\u0004\bd\u0010bR$\u0010g\u001a\u0004\u0018\u00010,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010e\u001a\u0004\b]\u0010f\"\u0004\b^\u0010/¨\u0006j"}, d2 = {"Lokhttp3/g0$a;", "", "", "name", "Lokhttp3/g0;", "response", "Lkotlin/m2;", "f", "e", "Lokhttp3/e0;", "request", "E", "Lokhttp3/d0;", "protocol", "B", "", "code", "g", "message", "y", "Lokhttp3/t;", "handshake", "u", "value", "v", "a", "D", "Lokhttp3/v;", "headers", "w", "Lokhttp3/h0;", "body", "b", "networkResponse", "z", "cacheResponse", "d", "priorResponse", "A", "", "sentRequestAtMillis", "F", "receivedResponseAtMillis", "C", "Lokhttp3/internal/connection/c;", "deferredTrailers", "x", "(Lokhttp3/internal/connection/c;)V", "c", "Lokhttp3/e0;", "s", "()Lokhttp3/e0;", "R", "(Lokhttp3/e0;)V", "Lokhttp3/d0;", "q", "()Lokhttp3/d0;", "P", "(Lokhttp3/d0;)V", "I", "j", "()I", "(I)V", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "M", "(Ljava/lang/String;)V", "Lokhttp3/t;", "l", "()Lokhttp3/t;", "K", "(Lokhttp3/t;)V", "Lokhttp3/v$a;", "Lokhttp3/v$a;", "m", "()Lokhttp3/v$a;", "L", "(Lokhttp3/v$a;)V", "Lokhttp3/h0;", "h", "()Lokhttp3/h0;", "G", "(Lokhttp3/h0;)V", "Lokhttp3/g0;", "o", "()Lokhttp3/g0;", "N", "(Lokhttp3/g0;)V", "i", "H", "p", "O", "k", "J", "t", "()J", "S", "(J)V", "r", "Q", "Lokhttp3/internal/connection/c;", "()Lokhttp3/internal/connection/c;", "exchange", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private e0 request;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private d0 protocol;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int code;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private String message;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private t handshake;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private v.a headers;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private h0 body;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private g0 networkResponse;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private g0 cacheResponse;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private g0 priorResponse;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private long sentRequestAtMillis;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private long receivedResponseAtMillis;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private okhttp3.internal.connection.c exchange;

        public a() {
            this.code = -1;
            this.headers = new v.a();
        }

        private final void e(g0 g0Var) {
            if (g0Var != null) {
                if (!(g0Var.t() == null)) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("忮").toString());
                }
            }
        }

        private final void f(String str, g0 g0Var) {
            if (g0Var != null) {
                if (!(g0Var.t() == null)) {
                    throw new IllegalArgumentException(androidx.concurrent.futures.b.a(str, ProtectedSandApp.s("忲")).toString());
                }
                if (!(g0Var.getNetworkResponse() == null)) {
                    throw new IllegalArgumentException(androidx.concurrent.futures.b.a(str, ProtectedSandApp.s("忱")).toString());
                }
                if (!(g0Var.z() == null)) {
                    throw new IllegalArgumentException(androidx.concurrent.futures.b.a(str, ProtectedSandApp.s("忰")).toString());
                }
                if (!(g0Var.getPriorResponse() == null)) {
                    throw new IllegalArgumentException(androidx.concurrent.futures.b.a(str, ProtectedSandApp.s("忯")).toString());
                }
            }
        }

        @d5.d
        public a A(@d5.e g0 priorResponse) {
            e(priorResponse);
            this.priorResponse = priorResponse;
            return this;
        }

        @d5.d
        public a B(@d5.d d0 protocol) {
            kotlin.jvm.internal.l0.p(protocol, ProtectedSandApp.s("忳"));
            this.protocol = protocol;
            return this;
        }

        @d5.d
        public a C(long receivedResponseAtMillis) {
            this.receivedResponseAtMillis = receivedResponseAtMillis;
            return this;
        }

        @d5.d
        public a D(@d5.d String name) {
            kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("忴"));
            this.headers.l(name);
            return this;
        }

        @d5.d
        public a E(@d5.d e0 request) {
            kotlin.jvm.internal.l0.p(request, ProtectedSandApp.s("念"));
            this.request = request;
            return this;
        }

        @d5.d
        public a F(long sentRequestAtMillis) {
            this.sentRequestAtMillis = sentRequestAtMillis;
            return this;
        }

        public final void G(@d5.e h0 h0Var) {
            this.body = h0Var;
        }

        public final void H(@d5.e g0 g0Var) {
            this.cacheResponse = g0Var;
        }

        public final void I(int i5) {
            this.code = i5;
        }

        public final void J(@d5.e okhttp3.internal.connection.c cVar) {
            this.exchange = cVar;
        }

        public final void K(@d5.e t tVar) {
            this.handshake = tVar;
        }

        public final void L(@d5.d v.a aVar) {
            kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("忶"));
            this.headers = aVar;
        }

        public final void M(@d5.e String str) {
            this.message = str;
        }

        public final void N(@d5.e g0 g0Var) {
            this.networkResponse = g0Var;
        }

        public final void O(@d5.e g0 g0Var) {
            this.priorResponse = g0Var;
        }

        public final void P(@d5.e d0 d0Var) {
            this.protocol = d0Var;
        }

        public final void Q(long j5) {
            this.receivedResponseAtMillis = j5;
        }

        public final void R(@d5.e e0 e0Var) {
            this.request = e0Var;
        }

        public final void S(long j5) {
            this.sentRequestAtMillis = j5;
        }

        @d5.d
        public a a(@d5.d String name, @d5.d String value) {
            kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("忷"));
            kotlin.jvm.internal.l0.p(value, ProtectedSandApp.s("忸"));
            this.headers.b(name, value);
            return this;
        }

        @d5.d
        public a b(@d5.e h0 body) {
            this.body = body;
            return this;
        }

        @d5.d
        public g0 c() {
            int i5 = this.code;
            if (!(i5 >= 0)) {
                throw new IllegalStateException((ProtectedSandApp.s("忼") + this.code).toString());
            }
            e0 e0Var = this.request;
            if (e0Var == null) {
                throw new IllegalStateException(ProtectedSandApp.s("忻").toString());
            }
            d0 d0Var = this.protocol;
            if (d0Var == null) {
                throw new IllegalStateException(ProtectedSandApp.s("忺").toString());
            }
            String str = this.message;
            if (str != null) {
                return new g0(e0Var, d0Var, str, i5, this.handshake, this.headers.i(), this.body, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange);
            }
            throw new IllegalStateException(ProtectedSandApp.s("忹").toString());
        }

        @d5.d
        public a d(@d5.e g0 cacheResponse) {
            f(ProtectedSandApp.s("忽"), cacheResponse);
            this.cacheResponse = cacheResponse;
            return this;
        }

        @d5.d
        public a g(int code) {
            this.code = code;
            return this;
        }

        @d5.e
        /* renamed from: h, reason: from getter */
        public final h0 getBody() {
            return this.body;
        }

        @d5.e
        /* renamed from: i, reason: from getter */
        public final g0 getCacheResponse() {
            return this.cacheResponse;
        }

        /* renamed from: j, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        @d5.e
        /* renamed from: k, reason: from getter */
        public final okhttp3.internal.connection.c getExchange() {
            return this.exchange;
        }

        @d5.e
        /* renamed from: l, reason: from getter */
        public final t getHandshake() {
            return this.handshake;
        }

        @d5.d
        /* renamed from: m, reason: from getter */
        public final v.a getHeaders() {
            return this.headers;
        }

        @d5.e
        /* renamed from: n, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @d5.e
        /* renamed from: o, reason: from getter */
        public final g0 getNetworkResponse() {
            return this.networkResponse;
        }

        @d5.e
        /* renamed from: p, reason: from getter */
        public final g0 getPriorResponse() {
            return this.priorResponse;
        }

        @d5.e
        /* renamed from: q, reason: from getter */
        public final d0 getProtocol() {
            return this.protocol;
        }

        /* renamed from: r, reason: from getter */
        public final long getReceivedResponseAtMillis() {
            return this.receivedResponseAtMillis;
        }

        @d5.e
        /* renamed from: s, reason: from getter */
        public final e0 getRequest() {
            return this.request;
        }

        /* renamed from: t, reason: from getter */
        public final long getSentRequestAtMillis() {
            return this.sentRequestAtMillis;
        }

        @d5.d
        public a u(@d5.e t handshake) {
            this.handshake = handshake;
            return this;
        }

        @d5.d
        public a v(@d5.d String name, @d5.d String value) {
            kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("忾"));
            kotlin.jvm.internal.l0.p(value, ProtectedSandApp.s("忿"));
            this.headers.m(name, value);
            return this;
        }

        @d5.d
        public a w(@d5.d v headers) {
            kotlin.jvm.internal.l0.p(headers, ProtectedSandApp.s("怀"));
            this.headers = headers.s();
            return this;
        }

        public final void x(@d5.d okhttp3.internal.connection.c deferredTrailers) {
            kotlin.jvm.internal.l0.p(deferredTrailers, ProtectedSandApp.s("态"));
            this.exchange = deferredTrailers;
        }

        @d5.d
        public a y(@d5.d String message) {
            kotlin.jvm.internal.l0.p(message, ProtectedSandApp.s("怂"));
            this.message = message;
            return this;
        }

        @d5.d
        public a z(@d5.e g0 networkResponse) {
            f(ProtectedSandApp.s("怃"), networkResponse);
            this.networkResponse = networkResponse;
            return this;
        }

        public a(@d5.d g0 g0Var) {
            kotlin.jvm.internal.l0.p(g0Var, ProtectedSandApp.s("忭"));
            this.code = -1;
            this.request = g0Var.getRequest();
            this.protocol = g0Var.getProtocol();
            this.code = g0Var.getCode();
            this.message = g0Var.getMessage();
            this.handshake = g0Var.getHandshake();
            this.headers = g0Var.getHeaders().s();
            this.body = g0Var.t();
            this.networkResponse = g0Var.getNetworkResponse();
            this.cacheResponse = g0Var.z();
            this.priorResponse = g0Var.getPriorResponse();
            this.sentRequestAtMillis = g0Var.getSentRequestAtMillis();
            this.receivedResponseAtMillis = g0Var.getReceivedResponseAtMillis();
            this.exchange = g0Var.getExchange();
        }
    }
}
