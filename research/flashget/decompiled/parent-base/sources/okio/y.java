package okio;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.Metadata;

/* compiled from: InflaterSource.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u000bR\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lokio/y;", "Lokio/o0;", "Lokio/o;", "source", "Ljava/util/zip/Inflater;", "inflater", "<init>", "(Lokio/o;Ljava/util/zip/Inflater;)V", "(Lokio/o0;Ljava/util/zip/Inflater;)V", "Lkotlin/k2;", "c", "()V", "Lokio/m;", "sink", "", "byteCount", "w3", "(Lokio/m;J)J", "a", "", "b", "()Z", "Lokio/q0;", "timeout", "()Lokio/q0;", "close", "", "I", "bufferBytesHeldByInflater", "Z", "closed", "d", "Lokio/o;", "e", "Ljava/util/zip/Inflater;", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class y implements o0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int bufferBytesHeldByInflater;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final o source;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Inflater inflater;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(@fg.l o0 o0Var, @fg.l Inflater inflater) {
        this(c0.c(o0Var), inflater);
        kotlin.jvm.internal.l0.p(o0Var, ProtectedSandApp.s("⁝"));
        kotlin.jvm.internal.l0.p(inflater, ProtectedSandApp.s("⁞"));
    }

    private final void c() {
        int i4 = this.bufferBytesHeldByInflater;
        if (i4 == 0) {
            return;
        }
        int remaining = i4 - this.inflater.getRemaining();
        this.bufferBytesHeldByInflater -= remaining;
        this.source.skip(remaining);
    }

    public final long a(@fg.l m sink, long byteCount) throws IOException {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("\u205f"));
        if (!(byteCount >= 0)) {
            throw new IllegalArgumentException(androidx.collection.p0.a(ProtectedSandApp.s("\u2061"), byteCount).toString());
        }
        if (this.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("\u2060"));
        }
        if (byteCount == 0) {
            return 0L;
        }
        try {
            j0 B0 = sink.B0(1);
            int min = (int) Math.min(byteCount, 8192 - B0.limit);
            b();
            int inflate = this.inflater.inflate(B0.data, B0.limit, min);
            c();
            if (inflate > 0) {
                B0.limit += inflate;
                long j4 = inflate;
                sink.Y(sink.size() + j4);
                return j4;
            }
            if (B0.pos == B0.limit) {
                sink.head = B0.b();
                k0.d(B0);
            }
            return 0L;
        } catch (DataFormatException e4) {
            throw new IOException(e4);
        }
    }

    public final boolean b() throws IOException {
        if (!this.inflater.needsInput()) {
            return false;
        }
        if (this.source.t2()) {
            return true;
        }
        j0 j0Var = this.source.getBuffer().head;
        kotlin.jvm.internal.l0.m(j0Var);
        int i4 = j0Var.limit;
        int i5 = j0Var.pos;
        int i6 = i4 - i5;
        this.bufferBytesHeldByInflater = i6;
        this.inflater.setInput(j0Var.data, i5, i6);
        return false;
    }

    @Override // okio.o0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.inflater.end();
        this.closed = true;
        this.source.close();
    }

    @Override // okio.o0
    @fg.l
    public q0 timeout() {
        return this.source.timeout();
    }

    @Override // okio.o0
    public long w3(@fg.l m sink, long byteCount) throws IOException {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("\u205f"));
        do {
            long a5 = a(sink, byteCount);
            if (a5 > 0) {
                return a5;
            }
            if (this.inflater.finished() || this.inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.source.t2());
        throw new EOFException(ProtectedSandApp.s("\u2062"));
    }

    public y(@fg.l o oVar, @fg.l Inflater inflater) {
        kotlin.jvm.internal.l0.p(oVar, ProtectedSandApp.s("⁝"));
        kotlin.jvm.internal.l0.p(inflater, ProtectedSandApp.s("⁞"));
        this.source = oVar;
        this.inflater = inflater;
    }
}
