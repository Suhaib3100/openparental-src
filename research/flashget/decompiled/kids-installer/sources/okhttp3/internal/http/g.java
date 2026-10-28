package okhttp3.internal.http;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okhttp3.e0;
import okhttp3.g0;
import okhttp3.x;

/* compiled from: RealInterceptorChain.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0019\u001a\u00020\u001f\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020$0#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b1\u00102JM\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0018\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0002H\u0016J\u0018\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\u0018\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001dR\u001a\u0010\u0019\u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\b\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b-\u0010.R\u001a\u0010\t\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b/\u0010.R\u001a\u0010\n\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b0\u0010.¨\u00063"}, d2 = {"Lokhttp3/internal/http/g;", "Lokhttp3/x$a;", "", "index", "Lokhttp3/internal/connection/c;", "exchange", "Lokhttp3/e0;", "request", "connectTimeoutMillis", "readTimeoutMillis", "writeTimeoutMillis", "j", "(ILokhttp3/internal/connection/c;Lokhttp3/e0;III)Lokhttp3/internal/http/g;", "Lokhttp3/j;", "f", "i", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "d", "b", "h", "c", "a", "Lokhttp3/e;", "call", "g", "Lokhttp3/g0;", "e", "I", "calls", "Lokhttp3/internal/connection/e;", "Lokhttp3/internal/connection/e;", "l", "()Lokhttp3/internal/connection/e;", "", "Lokhttp3/x;", "Ljava/util/List;", "interceptors", "Lokhttp3/internal/connection/c;", "n", "()Lokhttp3/internal/connection/c;", "Lokhttp3/e0;", "p", "()Lokhttp3/e0;", "m", "()I", "o", "q", "<init>", "(Lokhttp3/internal/connection/e;Ljava/util/List;ILokhttp3/internal/connection/c;Lokhttp3/e0;III)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class g implements x.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int calls;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final okhttp3.internal.connection.e call;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<x> interceptors;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final okhttp3.internal.connection.c exchange;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final e0 request;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int connectTimeoutMillis;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int readTimeoutMillis;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int writeTimeoutMillis;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@d5.d okhttp3.internal.connection.e eVar, @d5.d List<? extends x> list, int i5, @d5.e okhttp3.internal.connection.c cVar, @d5.d e0 e0Var, int i6, int i7, int i8) {
        l0.p(eVar, ProtectedSandApp.s("挣"));
        l0.p(list, ProtectedSandApp.s("挤"));
        l0.p(e0Var, ProtectedSandApp.s("挥"));
        this.call = eVar;
        this.interceptors = list;
        this.index = i5;
        this.exchange = cVar;
        this.request = e0Var;
        this.connectTimeoutMillis = i6;
        this.readTimeoutMillis = i7;
        this.writeTimeoutMillis = i8;
    }

    public static /* synthetic */ g k(g gVar, int i5, okhttp3.internal.connection.c cVar, e0 e0Var, int i6, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i5 = gVar.index;
        }
        if ((i9 & 2) != 0) {
            cVar = gVar.exchange;
        }
        okhttp3.internal.connection.c cVar2 = cVar;
        if ((i9 & 4) != 0) {
            e0Var = gVar.request;
        }
        e0 e0Var2 = e0Var;
        if ((i9 & 8) != 0) {
            i6 = gVar.connectTimeoutMillis;
        }
        int i10 = i6;
        if ((i9 & 16) != 0) {
            i7 = gVar.readTimeoutMillis;
        }
        int i11 = i7;
        if ((i9 & 32) != 0) {
            i8 = gVar.writeTimeoutMillis;
        }
        return gVar.j(i5, cVar2, e0Var2, i10, i11, i8);
    }

    @Override // okhttp3.x.a
    @d5.d
    public x.a a(int timeout, @d5.d TimeUnit unit) {
        l0.p(unit, ProtectedSandApp.s("挦"));
        if (this.exchange == null) {
            return k(this, 0, null, null, 0, 0, okhttp3.internal.d.j(ProtectedSandApp.s("挧"), timeout, unit), 31, null);
        }
        throw new IllegalStateException(ProtectedSandApp.s("挨").toString());
    }

    @Override // okhttp3.x.a
    /* renamed from: b, reason: from getter */
    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @Override // okhttp3.x.a
    /* renamed from: c, reason: from getter */
    public int getWriteTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    @Override // okhttp3.x.a
    @d5.d
    public okhttp3.e call() {
        return this.call;
    }

    @Override // okhttp3.x.a
    @d5.d
    public x.a d(int timeout, @d5.d TimeUnit unit) {
        l0.p(unit, ProtectedSandApp.s("挩"));
        if (this.exchange == null) {
            return k(this, 0, null, null, okhttp3.internal.d.j(ProtectedSandApp.s("挪"), timeout, unit), 0, 0, 55, null);
        }
        throw new IllegalStateException(ProtectedSandApp.s("挫").toString());
    }

    @Override // okhttp3.x.a
    @d5.d
    public g0 e(@d5.d e0 request) throws IOException {
        l0.p(request, ProtectedSandApp.s("挬"));
        if (!(this.index < this.interceptors.size())) {
            throw new IllegalStateException(ProtectedSandApp.s("挳").toString());
        }
        this.calls++;
        okhttp3.internal.connection.c cVar = this.exchange;
        String s5 = ProtectedSandApp.s("挭");
        String s6 = ProtectedSandApp.s("挮");
        if (cVar != null) {
            if (!cVar.getFinder().g(request.q())) {
                throw new IllegalStateException((s6 + this.interceptors.get(this.index - 1) + ProtectedSandApp.s("振")).toString());
            }
            if (!(this.calls == 1)) {
                throw new IllegalStateException((s6 + this.interceptors.get(this.index - 1) + s5).toString());
            }
        }
        g k5 = k(this, this.index + 1, null, request, 0, 0, 0, 58, null);
        x xVar = this.interceptors.get(this.index);
        g0 a6 = xVar.a(k5);
        String s7 = ProtectedSandApp.s("挰");
        if (a6 == null) {
            throw new NullPointerException(s7 + xVar + ProtectedSandApp.s("挲"));
        }
        if (this.exchange != null) {
            if (!(this.index + 1 >= this.interceptors.size() || k5.calls == 1)) {
                throw new IllegalStateException((s6 + xVar + s5).toString());
            }
        }
        if (a6.t() != null) {
            return a6;
        }
        throw new IllegalStateException((s7 + xVar + ProtectedSandApp.s("挱")).toString());
    }

    @Override // okhttp3.x.a
    @d5.e
    public okhttp3.j f() {
        okhttp3.internal.connection.c cVar = this.exchange;
        if (cVar != null) {
            return cVar.getConnection();
        }
        return null;
    }

    @Override // okhttp3.x.a
    @d5.d
    /* renamed from: g, reason: from getter */
    public e0 getRequest() {
        return this.request;
    }

    @Override // okhttp3.x.a
    @d5.d
    public x.a h(int timeout, @d5.d TimeUnit unit) {
        l0.p(unit, ProtectedSandApp.s("挴"));
        if (this.exchange == null) {
            return k(this, 0, null, null, 0, okhttp3.internal.d.j(ProtectedSandApp.s("挵"), timeout, unit), 0, 47, null);
        }
        throw new IllegalStateException(ProtectedSandApp.s("挶").toString());
    }

    @Override // okhttp3.x.a
    /* renamed from: i, reason: from getter */
    public int getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @d5.d
    public final g j(int index, @d5.e okhttp3.internal.connection.c exchange, @d5.d e0 request, int connectTimeoutMillis, int readTimeoutMillis, int writeTimeoutMillis) {
        l0.p(request, ProtectedSandApp.s("挷"));
        return new g(this.call, this.interceptors, index, exchange, request, connectTimeoutMillis, readTimeoutMillis, writeTimeoutMillis);
    }

    @d5.d
    /* renamed from: l, reason: from getter */
    public final okhttp3.internal.connection.e getCall() {
        return this.call;
    }

    public final int m() {
        return this.connectTimeoutMillis;
    }

    @d5.e
    /* renamed from: n, reason: from getter */
    public final okhttp3.internal.connection.c getExchange() {
        return this.exchange;
    }

    public final int o() {
        return this.readTimeoutMillis;
    }

    @d5.d
    public final e0 p() {
        return this.request;
    }

    public final int q() {
        return this.writeTimeoutMillis;
    }
}
