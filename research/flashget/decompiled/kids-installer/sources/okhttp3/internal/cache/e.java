package okhttp3.internal.cache;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import okio.m;
import okio.m0;
import okio.r;
import q3.l;

/* compiled from: FaultHidingSink.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lokhttp3/internal/cache/e;", "Lokio/r;", "Lokio/m;", "source", "", "byteCount", "Lkotlin/m2;", "t0", "flush", "close", "", "p", "Z", "hasErrors", "Lkotlin/Function1;", "Ljava/io/IOException;", "q", "Lq3/l;", "c", "()Lq3/l;", "onException", "Lokio/m0;", "delegate", "<init>", "(Lokio/m0;Lq3/l;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public class e extends r {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean hasErrors;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final l<IOException, m2> onException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(@d5.d m0 m0Var, @d5.d l<? super IOException, m2> lVar) {
        super(m0Var);
        l0.p(m0Var, ProtectedSandApp.s("醦"));
        l0.p(lVar, ProtectedSandApp.s("醧"));
        this.onException = lVar;
    }

    @d5.d
    public final l<IOException, m2> c() {
        return this.onException;
    }

    @Override // okio.r, okio.m0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e6) {
            this.hasErrors = true;
            this.onException.N(e6);
        }
    }

    @Override // okio.r, okio.m0, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e6) {
            this.hasErrors = true;
            this.onException.N(e6);
        }
    }

    @Override // okio.r, okio.m0
    public void t0(@d5.d m mVar, long j5) {
        l0.p(mVar, ProtectedSandApp.s("醨"));
        if (this.hasErrors) {
            mVar.skip(j5);
            return;
        }
        try {
            super.t0(mVar, j5);
        } catch (IOException e6) {
            this.hasErrors = true;
            this.onException.N(e6);
        }
    }
}
