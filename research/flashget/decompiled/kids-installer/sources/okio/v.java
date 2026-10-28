package okio;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.Metadata;

/* compiled from: GzipSource.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u0001¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J \u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002J \u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0002H\u0016R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lokio/v;", "Lokio/o0;", "Lkotlin/m2;", "b", "c", "Lokio/m;", "buffer", "", "offset", "byteCount", "d", "", "name", "", "expected", "actual", "a", "sink", "X0", "Lokio/q0;", "h", "close", "", "o", "B", "section", "Lokio/i0;", "p", "Lokio/i0;", "source", "Ljava/util/zip/Inflater;", "q", "Ljava/util/zip/Inflater;", "inflater", "Lokio/y;", "r", "Lokio/y;", "inflaterSource", "Ljava/util/zip/CRC32;", "s", "Ljava/util/zip/CRC32;", "crc", "<init>", "(Lokio/o0;)V", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public final class v implements o0 {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private byte section;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final i0 source;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Inflater inflater;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final y inflaterSource;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final CRC32 crc;

    public v(@d5.d o0 o0Var) {
        kotlin.jvm.internal.l0.p(o0Var, ProtectedSandApp.s("鎊"));
        i0 i0Var = new i0(o0Var);
        this.source = i0Var;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new y((o) i0Var, inflater);
        this.crc = new CRC32();
    }

    private final void a(String str, int i5, int i6) {
        if (i6 == i5) {
            return;
        }
        String format = String.format(ProtectedSandApp.s("鎋"), Arrays.copyOf(new Object[]{str, Integer.valueOf(i6), Integer.valueOf(i5)}, 3));
        kotlin.jvm.internal.l0.o(format, ProtectedSandApp.s("鎌"));
        throw new IOException(format);
    }

    private final void b() throws IOException {
        this.source.h1(10L);
        byte b02 = this.source.bufferField.b0(3L);
        boolean z5 = ((b02 >> 1) & 1) == 1;
        if (z5) {
            d(this.source.bufferField, 0L, 10L);
        }
        a(ProtectedSandApp.s("鎍"), 8075, this.source.readShort());
        this.source.skip(8L);
        if (((b02 >> 2) & 1) == 1) {
            this.source.h1(2L);
            if (z5) {
                d(this.source.bufferField, 0L, 2L);
            }
            long V0 = this.source.bufferField.V0();
            this.source.h1(V0);
            if (z5) {
                d(this.source.bufferField, 0L, V0);
            }
            this.source.skip(V0);
        }
        if (((b02 >> 3) & 1) == 1) {
            long l12 = this.source.l1((byte) 0);
            if (l12 == -1) {
                throw new EOFException();
            }
            if (z5) {
                d(this.source.bufferField, 0L, l12 + 1);
            }
            this.source.skip(l12 + 1);
        }
        if (((b02 >> 4) & 1) == 1) {
            long l13 = this.source.l1((byte) 0);
            if (l13 == -1) {
                throw new EOFException();
            }
            if (z5) {
                d(this.source.bufferField, 0L, l13 + 1);
            }
            this.source.skip(l13 + 1);
        }
        if (z5) {
            a(ProtectedSandApp.s("鎎"), this.source.V0(), (short) this.crc.getValue());
            this.crc.reset();
        }
    }

    private final void c() throws IOException {
        a(ProtectedSandApp.s("鎏"), this.source.H0(), (int) this.crc.getValue());
        a(ProtectedSandApp.s("鎐"), this.source.H0(), (int) this.inflater.getBytesWritten());
    }

    private final void d(m mVar, long j5, long j6) {
        j0 j0Var = mVar.head;
        kotlin.jvm.internal.l0.m(j0Var);
        while (true) {
            int i5 = j0Var.limit;
            int i6 = j0Var.pos;
            if (j5 < i5 - i6) {
                break;
            }
            j5 -= i5 - i6;
            j0Var = j0Var.next;
            kotlin.jvm.internal.l0.m(j0Var);
        }
        while (j6 > 0) {
            int min = (int) Math.min(j0Var.limit - r6, j6);
            this.crc.update(j0Var.data, (int) (j0Var.pos + j5), min);
            j6 -= min;
            j0Var = j0Var.next;
            kotlin.jvm.internal.l0.m(j0Var);
            j5 = 0;
        }
    }

    @Override // okio.o0
    public long X0(@d5.d m sink, long byteCount) throws IOException {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("鎑"));
        if (!(byteCount >= 0)) {
            throw new IllegalArgumentException(com.bumptech.glide.load.resource.bitmap.p0.a(ProtectedSandApp.s("鎓"), byteCount).toString());
        }
        if (byteCount == 0) {
            return 0L;
        }
        if (this.section == 0) {
            b();
            this.section = (byte) 1;
        }
        if (this.section == 1) {
            long size = sink.size();
            long X0 = this.inflaterSource.X0(sink, byteCount);
            if (X0 != -1) {
                d(sink, size, X0);
                return X0;
            }
            this.section = (byte) 2;
        }
        if (this.section == 2) {
            c();
            this.section = (byte) 3;
            if (!this.source.M()) {
                throw new IOException(ProtectedSandApp.s("鎒"));
            }
        }
        return -1L;
    }

    @Override // okio.o0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.inflaterSource.close();
    }

    @Override // okio.o0
    @d5.d
    public q0 h() {
        return this.source.h();
    }
}
