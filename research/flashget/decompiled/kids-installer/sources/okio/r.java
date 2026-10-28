package okio;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;

/* compiled from: ForwardingSink.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u000f\u0010\u000e\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0016"}, d2 = {"Lokio/r;", "Lokio/m0;", "Lokio/m;", "source", "", "byteCount", "Lkotlin/m2;", "t0", "flush", "Lokio/q0;", "h", "close", "", "toString", "a", "()Lokio/m0;", "o", "Lokio/m0;", "b", "delegate", "<init>", "(Lokio/m0;)V", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public abstract class r implements m0 {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final m0 delegate;

    public r(@d5.d m0 m0Var) {
        kotlin.jvm.internal.l0.p(m0Var, ProtectedSandApp.s("醛"));
        this.delegate = m0Var;
    }

    @p3.i(name = "-deprecated_delegate")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "delegate", imports = {}))
    @d5.d
    /* renamed from: a, reason: from getter */
    public final m0 getDelegate() {
        return this.delegate;
    }

    @p3.i(name = "delegate")
    @d5.d
    public final m0 b() {
        return this.delegate;
    }

    @Override // okio.m0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @Override // okio.m0, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // okio.m0
    @d5.d
    /* renamed from: h */
    public q0 getTimeout() {
        return this.delegate.getTimeout();
    }

    @Override // okio.m0
    public void t0(@d5.d m mVar, long j5) throws IOException {
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("醜"));
        this.delegate.t0(mVar, j5);
    }

    @d5.d
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
