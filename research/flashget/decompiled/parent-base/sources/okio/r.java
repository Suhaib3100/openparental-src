package okio;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.x0;

/* compiled from: ForwardingSink.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0002\u0010\u0016¨\u0006\u0018"}, d2 = {"Lokio/r;", "Lokio/m0;", "delegate", "<init>", "(Lokio/m0;)V", "Lokio/m;", "source", "", "byteCount", "Lkotlin/k2;", "write", "(Lokio/m;J)V", "flush", "()V", "Lokio/q0;", "timeout", "()Lokio/q0;", "close", "", "toString", "()Ljava/lang/String;", "-deprecated_delegate", "()Lokio/m0;", "Lokio/m0;", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public abstract class r implements m0 {

    @fg.l
    private final m0 delegate;

    public r(@fg.l m0 m0Var) {
        kotlin.jvm.internal.l0.p(m0Var, ProtectedSandApp.s("—"));
        this.delegate = m0Var;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "delegate", imports = {}))
    @kd.i(name = "-deprecated_delegate")
    /* renamed from: -deprecated_delegate, reason: not valid java name and from getter */
    public final m0 getDelegate() {
        return this.delegate;
    }

    @Override // okio.m0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @fg.l
    @kd.i(name = "delegate")
    public final m0 delegate() {
        return this.delegate;
    }

    @Override // okio.m0, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // okio.m0
    @fg.l
    /* renamed from: timeout */
    public q0 getTimeout() {
        return this.delegate.getTimeout();
    }

    @fg.l
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // okio.m0
    public void write(@fg.l m source, long byteCount) throws IOException {
        kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("―"));
        this.delegate.write(source, byteCount);
    }
}
