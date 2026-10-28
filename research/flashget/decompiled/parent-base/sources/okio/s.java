package okio;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.x0;

/* compiled from: ForwardingSource.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0018"}, d2 = {"Lokio/s;", "Lokio/o0;", "delegate", "<init>", "(Lokio/o0;)V", "Lokio/m;", "sink", "", "byteCount", "w3", "(Lokio/m;J)J", "Lokio/q0;", "timeout", "()Lokio/q0;", "Lkotlin/k2;", "close", "()V", "", "toString", "()Ljava/lang/String;", "a", "()Lokio/o0;", "b", "Lokio/o0;", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public abstract class s implements o0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final o0 delegate;

    public s(@fg.l o0 o0Var) {
        kotlin.jvm.internal.l0.p(o0Var, ProtectedSandApp.s("‘"));
        this.delegate = o0Var;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "delegate", imports = {}))
    @kd.i(name = "-deprecated_delegate")
    /* renamed from: a, reason: from getter */
    public final o0 getDelegate() {
        return this.delegate;
    }

    @fg.l
    @kd.i(name = "delegate")
    public final o0 b() {
        return this.delegate;
    }

    @Override // okio.o0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @Override // okio.o0
    @fg.l
    /* renamed from: timeout */
    public q0 getTimeout() {
        return this.delegate.getTimeout();
    }

    @fg.l
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // okio.o0
    public long w3(@fg.l m sink, long byteCount) throws IOException {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("’"));
        return this.delegate.w3(sink, byteCount);
    }
}
