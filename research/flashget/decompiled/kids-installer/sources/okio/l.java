package okio;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: Okio.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, d2 = {"Lokio/l;", "Lokio/m0;", "Lokio/m;", "source", "", "byteCount", "Lkotlin/m2;", "t0", "flush", "Lokio/q0;", "h", "close", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
final class l implements m0 {
    @Override // okio.m0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // okio.m0, java.io.Flushable
    public void flush() {
    }

    @Override // okio.m0
    @d5.d
    /* renamed from: h */
    public q0 getTimeout() {
        return q0.f31704d;
    }

    @Override // okio.m0
    public void t0(@d5.d m mVar, long j5) {
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("錘"));
        mVar.skip(j5);
    }
}
