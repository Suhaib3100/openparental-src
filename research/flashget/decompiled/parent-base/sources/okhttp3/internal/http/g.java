package okhttp3.internal.http;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.w;

/* compiled from: RealInterceptorChain.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011JM\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u0018J\u001f\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ\u000f\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010\u0018J\u001f\u0010!\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\u001dJ\u000f\u0010\u0003\u001a\u00020\"H\u0016¢\u0006\u0004\b\u0003\u0010#J\u000f\u0010$\u001a\u00020\u000bH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010.R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010)R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010/\u001a\u0004\b0\u00101R\u001a\u0010\f\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u00102\u001a\u0004\b3\u0010%R\u001a\u0010\r\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010)\u001a\u0004\b4\u0010\u0018R\u001a\u0010\u000e\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010)\u001a\u0004\b5\u0010\u0018R\u001a\u0010\u000f\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010)\u001a\u0004\b6\u0010\u0018¨\u00067"}, d2 = {"Lokhttp3/internal/http/g;", "Lokhttp3/w$a;", "Lokhttp3/internal/connection/e;", "call", "", "Lokhttp3/w;", "interceptors", "", "index", "Lokhttp3/internal/connection/c;", "exchange", "Lokhttp3/d0;", "request", "connectTimeoutMillis", "readTimeoutMillis", "writeTimeoutMillis", "<init>", "(Lokhttp3/internal/connection/e;Ljava/util/List;ILokhttp3/internal/connection/c;Lokhttp3/d0;III)V", "j", "(ILokhttp3/internal/connection/c;Lokhttp3/d0;III)Lokhttp3/internal/http/g;", "Lokhttp3/j;", "f", "()Lokhttp3/j;", "i", "()I", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "b", "(ILjava/util/concurrent/TimeUnit;)Lokhttp3/w$a;", "a", "g", "e", "d", "Lokhttp3/e;", "()Lokhttp3/e;", "h", "()Lokhttp3/d0;", "Lokhttp3/f0;", "c", "(Lokhttp3/d0;)Lokhttp3/f0;", "I", "calls", "Lokhttp3/internal/connection/e;", "l", "()Lokhttp3/internal/connection/e;", "Ljava/util/List;", "Lokhttp3/internal/connection/c;", "n", "()Lokhttp3/internal/connection/c;", "Lokhttp3/d0;", "p", "m", "o", "q", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class g implements w.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int calls;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final okhttp3.internal.connection.e call;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<w> interceptors;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @m
    private final okhttp3.internal.connection.c exchange;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    private final d0 request;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int connectTimeoutMillis;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int readTimeoutMillis;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int writeTimeoutMillis;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@l okhttp3.internal.connection.e eVar, @l List<? extends w> list, int i4, @m okhttp3.internal.connection.c cVar, @l d0 d0Var, int i5, int i6, int i7) {
        l0.p(eVar, ProtectedSandApp.s("L"));
        l0.p(list, ProtectedSandApp.s("M"));
        l0.p(d0Var, ProtectedSandApp.s("N"));
        this.call = eVar;
        this.interceptors = list;
        this.index = i4;
        this.exchange = cVar;
        this.request = d0Var;
        this.connectTimeoutMillis = i5;
        this.readTimeoutMillis = i6;
        this.writeTimeoutMillis = i7;
    }

    public static /* synthetic */ g k(g gVar, int i4, okhttp3.internal.connection.c cVar, d0 d0Var, int i5, int i6, int i7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i4 = gVar.index;
        }
        if ((i10 & 2) != 0) {
            cVar = gVar.exchange;
        }
        okhttp3.internal.connection.c cVar2 = cVar;
        if ((i10 & 4) != 0) {
            d0Var = gVar.request;
        }
        d0 d0Var2 = d0Var;
        if ((i10 & 8) != 0) {
            i5 = gVar.connectTimeoutMillis;
        }
        int i11 = i5;
        if ((i10 & 16) != 0) {
            i6 = gVar.readTimeoutMillis;
        }
        int i12 = i6;
        if ((i10 & 32) != 0) {
            i7 = gVar.writeTimeoutMillis;
        }
        return gVar.j(i4, cVar2, d0Var2, i11, i12, i7);
    }

    @Override // okhttp3.w.a
    /* renamed from: a, reason: from getter */
    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @Override // okhttp3.w.a
    @l
    public w.a b(int timeout, @l TimeUnit unit) {
        l0.p(unit, ProtectedSandApp.s("O"));
        if (this.exchange == null) {
            return k(this, 0, null, null, okhttp3.internal.d.j(ProtectedSandApp.s("P"), timeout, unit), 0, 0, 55, null);
        }
        throw new IllegalStateException(ProtectedSandApp.s("Q"));
    }

    @Override // okhttp3.w.a
    @l
    public f0 c(@l d0 request) throws IOException {
        l0.p(request, ProtectedSandApp.s("N"));
        if (!(this.index < this.interceptors.size())) {
            throw new IllegalStateException(ProtectedSandApp.s("X"));
        }
        this.calls++;
        okhttp3.internal.connection.c cVar = this.exchange;
        String s4 = ProtectedSandApp.s("R");
        String s5 = ProtectedSandApp.s("S");
        if (cVar != null) {
            if (!cVar.getFinder().g(request.q())) {
                throw new IllegalStateException((s5 + this.interceptors.get(this.index - 1) + ProtectedSandApp.s("T")).toString());
            }
            if (!(this.calls == 1)) {
                throw new IllegalStateException((s5 + this.interceptors.get(this.index - 1) + s4).toString());
            }
        }
        g k4 = k(this, this.index + 1, null, request, 0, 0, 0, 58, null);
        w wVar = this.interceptors.get(this.index);
        f0 intercept = wVar.intercept(k4);
        String s6 = ProtectedSandApp.s("U");
        if (intercept == null) {
            throw new NullPointerException(s6 + wVar + ProtectedSandApp.s("W"));
        }
        if (this.exchange != null) {
            if (!(this.index + 1 >= this.interceptors.size() || k4.calls == 1)) {
                throw new IllegalStateException((s5 + wVar + s4).toString());
            }
        }
        if (intercept.o() != null) {
            return intercept;
        }
        throw new IllegalStateException((s6 + wVar + ProtectedSandApp.s("V")).toString());
    }

    @Override // okhttp3.w.a
    @l
    public okhttp3.e call() {
        return this.call;
    }

    @Override // okhttp3.w.a
    @l
    public w.a d(int timeout, @l TimeUnit unit) {
        l0.p(unit, ProtectedSandApp.s("O"));
        if (this.exchange == null) {
            return k(this, 0, null, null, 0, 0, okhttp3.internal.d.j(ProtectedSandApp.s("Y"), timeout, unit), 31, null);
        }
        throw new IllegalStateException(ProtectedSandApp.s("Q"));
    }

    @Override // okhttp3.w.a
    /* renamed from: e, reason: from getter */
    public int getWriteTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    @Override // okhttp3.w.a
    @m
    public okhttp3.j f() {
        okhttp3.internal.connection.c cVar = this.exchange;
        if (cVar != null) {
            return cVar.getConnection();
        }
        return null;
    }

    @Override // okhttp3.w.a
    @l
    public w.a g(int timeout, @l TimeUnit unit) {
        l0.p(unit, ProtectedSandApp.s("O"));
        if (this.exchange == null) {
            return k(this, 0, null, null, 0, okhttp3.internal.d.j(ProtectedSandApp.s("Z"), timeout, unit), 0, 47, null);
        }
        throw new IllegalStateException(ProtectedSandApp.s("Q"));
    }

    @Override // okhttp3.w.a
    @l
    /* renamed from: h, reason: from getter */
    public d0 getRequest() {
        return this.request;
    }

    @Override // okhttp3.w.a
    /* renamed from: i, reason: from getter */
    public int getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @l
    public final g j(int index, @m okhttp3.internal.connection.c exchange, @l d0 request, int connectTimeoutMillis, int readTimeoutMillis, int writeTimeoutMillis) {
        l0.p(request, ProtectedSandApp.s("N"));
        return new g(this.call, this.interceptors, index, exchange, request, connectTimeoutMillis, readTimeoutMillis, writeTimeoutMillis);
    }

    @l
    /* renamed from: l, reason: from getter */
    public final okhttp3.internal.connection.e getCall() {
        return this.call;
    }

    public final int m() {
        return this.connectTimeoutMillis;
    }

    @m
    /* renamed from: n, reason: from getter */
    public final okhttp3.internal.connection.c getExchange() {
        return this.exchange;
    }

    public final int o() {
        return this.readTimeoutMillis;
    }

    @l
    public final d0 p() {
        return this.request;
    }

    public final int q() {
        return this.writeTimeoutMillis;
    }
}
