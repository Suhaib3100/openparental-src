package okio;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: Okio.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0003¨\u0006\u0010"}, d2 = {"Lokio/l;", "Lokio/m0;", "<init>", "()V", "Lokio/m;", "source", "", "byteCount", "Lkotlin/k2;", "write", "(Lokio/m;J)V", "flush", "Lokio/q0;", "timeout", "()Lokio/q0;", "close", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
final class l implements m0 {
    @Override // okio.m0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // okio.m0, java.io.Flushable
    public void flush() {
    }

    @Override // okio.m0
    @fg.l
    /* renamed from: timeout */
    public q0 getTimeout() {
        return q0.f85260d;
    }

    @Override // okio.m0
    public void write(@fg.l m source, long byteCount) {
        kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("᾿"));
        source.skip(byteCount);
    }
}
