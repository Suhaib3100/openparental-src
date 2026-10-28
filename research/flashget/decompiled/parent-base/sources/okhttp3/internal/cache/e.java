package okhttp3.internal.cache;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k2;
import okio.m;
import okio.m0;
import okio.r;

/* compiled from: FaultHidingSink.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0010\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lokhttp3/internal/cache/e;", "Lokio/r;", "Lokio/m0;", "delegate", "Lkotlin/Function1;", "Ljava/io/IOException;", "Lkotlin/k2;", "onException", "<init>", "(Lokio/m0;Lld/l;)V", "Lokio/m;", "source", "", "byteCount", "write", "(Lokio/m;J)V", "flush", "()V", "close", "", "b", "Z", "hasErrors", "c", "Lld/l;", "a", "()Lld/l;", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public class e extends r {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean hasErrors;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final ld.l<IOException, k2> onException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(@l m0 m0Var, @l ld.l<? super IOException, k2> lVar) {
        super(m0Var);
        l0.p(m0Var, ProtectedSandApp.s("ꁖ\u0001"));
        l0.p(lVar, ProtectedSandApp.s("ꁗ\u0001"));
        this.onException = lVar;
    }

    @l
    public final ld.l<IOException, k2> a() {
        return this.onException;
    }

    @Override // okio.r, okio.m0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e4) {
            this.hasErrors = true;
            this.onException.invoke(e4);
        }
    }

    @Override // okio.r, okio.m0, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e4) {
            this.hasErrors = true;
            this.onException.invoke(e4);
        }
    }

    @Override // okio.r, okio.m0
    public void write(@l m source, long byteCount) {
        l0.p(source, ProtectedSandApp.s("ꁘ\u0001"));
        if (this.hasErrors) {
            source.skip(byteCount);
            return;
        }
        try {
            super.write(source, byteCount);
        } catch (IOException e4) {
            this.hasErrors = true;
            this.onException.invoke(e4);
        }
    }
}
