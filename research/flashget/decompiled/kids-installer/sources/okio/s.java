package okio;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;

/* compiled from: ForwardingSource.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u000f\u0010\r\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0015"}, d2 = {"Lokio/s;", "Lokio/o0;", "Lokio/m;", "sink", "", "byteCount", "X0", "Lokio/q0;", "h", "Lkotlin/m2;", "close", "", "toString", "a", "()Lokio/o0;", "o", "Lokio/o0;", "b", "delegate", "<init>", "(Lokio/o0;)V", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public abstract class s implements o0 {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final o0 delegate;

    public s(@d5.d o0 o0Var) {
        kotlin.jvm.internal.l0.p(o0Var, ProtectedSandApp.s("醙"));
        this.delegate = o0Var;
    }

    @Override // okio.o0
    public long X0(@d5.d m sink, long byteCount) throws IOException {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("醚"));
        return this.delegate.X0(sink, byteCount);
    }

    @p3.i(name = "-deprecated_delegate")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "delegate", imports = {}))
    @d5.d
    /* renamed from: a, reason: from getter */
    public final o0 getDelegate() {
        return this.delegate;
    }

    @p3.i(name = "delegate")
    @d5.d
    public final o0 b() {
        return this.delegate;
    }

    @Override // okio.o0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @Override // okio.o0
    @d5.d
    /* renamed from: h */
    public q0 getTimeout() {
        return this.delegate.getTimeout();
    }

    @d5.d
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
