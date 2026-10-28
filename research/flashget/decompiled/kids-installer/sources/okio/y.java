package okio;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.Metadata;

/* compiled from: InflaterSource.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001fB\u0019\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0001\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lokio/y;", "Lokio/o0;", "Lkotlin/m2;", "c", "Lokio/m;", "sink", "", "byteCount", "X0", "a", "", "b", "Lokio/q0;", "h", "close", "", "o", "I", "bufferBytesHeldByInflater", "p", "Z", "closed", "Lokio/o;", "q", "Lokio/o;", "source", "Ljava/util/zip/Inflater;", "r", "Ljava/util/zip/Inflater;", "inflater", "<init>", "(Lokio/o;Ljava/util/zip/Inflater;)V", "(Lokio/o0;Ljava/util/zip/Inflater;)V", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public final class y implements o0 {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int bufferBytesHeldByInflater;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final o source;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Inflater inflater;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(@d5.d o0 o0Var, @d5.d Inflater inflater) {
        this(c0.c(o0Var), inflater);
        kotlin.jvm.internal.l0.p(o0Var, ProtectedSandApp.s("鎢"));
        kotlin.jvm.internal.l0.p(inflater, ProtectedSandApp.s("鎣"));
    }

    private final void c() {
        int i5 = this.bufferBytesHeldByInflater;
        if (i5 == 0) {
            return;
        }
        int remaining = i5 - this.inflater.getRemaining();
        this.bufferBytesHeldByInflater -= remaining;
        this.source.skip(remaining);
    }

    @Override // okio.o0
    public long X0(@d5.d m sink, long byteCount) throws IOException {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("鎦"));
        do {
            long a6 = a(sink, byteCount);
            if (a6 > 0) {
                return a6;
            }
            if (this.inflater.finished() || this.inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.source.M());
        throw new EOFException(ProtectedSandApp.s("鎧"));
    }

    public final long a(@d5.d m sink, long byteCount) throws IOException {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("鎨"));
        if (!(byteCount >= 0)) {
            throw new IllegalArgumentException(com.bumptech.glide.load.resource.bitmap.p0.a(ProtectedSandApp.s("鎪"), byteCount).toString());
        }
        if (!(!this.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("鎩").toString());
        }
        if (byteCount == 0) {
            return 0L;
        }
        try {
            j0 i12 = sink.i1(1);
            int min = (int) Math.min(byteCount, 8192 - i12.limit);
            b();
            int inflate = this.inflater.inflate(i12.data, i12.limit, min);
            c();
            if (inflate > 0) {
                i12.limit += inflate;
                long j5 = inflate;
                sink.M0(sink.size() + j5);
                return j5;
            }
            if (i12.pos == i12.limit) {
                sink.head = i12.b();
                k0.d(i12);
            }
            return 0L;
        } catch (DataFormatException e6) {
            throw new IOException(e6);
        }
    }

    public final boolean b() throws IOException {
        if (!this.inflater.needsInput()) {
            return false;
        }
        if (this.source.M()) {
            return true;
        }
        j0 j0Var = this.source.i().head;
        kotlin.jvm.internal.l0.m(j0Var);
        int i5 = j0Var.limit;
        int i6 = j0Var.pos;
        int i7 = i5 - i6;
        this.bufferBytesHeldByInflater = i7;
        this.inflater.setInput(j0Var.data, i6, i7);
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
    @d5.d
    public q0 h() {
        return this.source.h();
    }

    public y(@d5.d o oVar, @d5.d Inflater inflater) {
        kotlin.jvm.internal.l0.p(oVar, ProtectedSandApp.s("鎤"));
        kotlin.jvm.internal.l0.p(inflater, ProtectedSandApp.s("鎥"));
        this.source = oVar;
        this.inflater = inflater;
    }
}
