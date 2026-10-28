package okio;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: DeflaterSink.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001fB\u0019\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0001\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u000f\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lokio/q;", "Lokio/m0;", "", "syncFlush", "Lkotlin/m2;", "a", "Lokio/m;", "source", "", "byteCount", "t0", "flush", "b", "()V", "close", "Lokio/q0;", "h", "", "toString", "o", "Z", "closed", "Lokio/n;", "p", "Lokio/n;", "sink", "Ljava/util/zip/Deflater;", "q", "Ljava/util/zip/Deflater;", "deflater", "<init>", "(Lokio/n;Ljava/util/zip/Deflater;)V", "(Lokio/m0;Ljava/util/zip/Deflater;)V", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public final class q implements m0 {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final n sink;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Deflater deflater;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(@d5.d m0 m0Var, @d5.d Deflater deflater) {
        this(c0.b(m0Var), deflater);
        kotlin.jvm.internal.l0.p(m0Var, ProtectedSandApp.s("鍽"));
        kotlin.jvm.internal.l0.p(deflater, ProtectedSandApp.s("鍾"));
    }

    @IgnoreJRERequirement
    private final void a(boolean z5) {
        j0 i12;
        int deflate;
        m i5 = this.sink.i();
        while (true) {
            i12 = i5.i1(1);
            if (z5) {
                Deflater deflater = this.deflater;
                byte[] bArr = i12.data;
                int i6 = i12.limit;
                deflate = deflater.deflate(bArr, i6, 8192 - i6, 2);
            } else {
                Deflater deflater2 = this.deflater;
                byte[] bArr2 = i12.data;
                int i7 = i12.limit;
                deflate = deflater2.deflate(bArr2, i7, 8192 - i7);
            }
            if (deflate > 0) {
                i12.limit += deflate;
                i5.M0(i5.size() + deflate);
                this.sink.Y();
            } else if (this.deflater.needsInput()) {
                break;
            }
        }
        if (i12.pos == i12.limit) {
            i5.head = i12.b();
            k0.d(i12);
        }
    }

    public final void b() {
        this.deflater.finish();
        a(false);
    }

    @Override // okio.m0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        try {
            b();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.sink.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.closed = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.m0, java.io.Flushable
    public void flush() throws IOException {
        a(true);
        this.sink.flush();
    }

    @Override // okio.m0
    @d5.d
    public q0 h() {
        return this.sink.h();
    }

    @Override // okio.m0
    public void t0(@d5.d m mVar, long j5) throws IOException {
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("鎁"));
        j.e(mVar.size(), 0L, j5);
        while (j5 > 0) {
            j0 j0Var = mVar.head;
            kotlin.jvm.internal.l0.m(j0Var);
            int min = (int) Math.min(j5, j0Var.limit - j0Var.pos);
            this.deflater.setInput(j0Var.data, j0Var.pos, min);
            a(false);
            long j6 = min;
            mVar.M0(mVar.size() - j6);
            int i5 = j0Var.pos + min;
            j0Var.pos = i5;
            if (i5 == j0Var.limit) {
                mVar.head = j0Var.b();
                k0.d(j0Var);
            }
            j5 -= j6;
        }
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("鎂") + this.sink + ')';
    }

    public q(@d5.d n nVar, @d5.d Deflater deflater) {
        kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("鍿"));
        kotlin.jvm.internal.l0.p(deflater, ProtectedSandApp.s("鎀"));
        this.sink = nVar;
        this.deflater = deflater;
    }
}
