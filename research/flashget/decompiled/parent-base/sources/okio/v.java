package okio;

import androidx.compose.material3.s3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.Metadata;

/* compiled from: GzipSource.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J'\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001d\u0010\u0007R\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0014\u0010\u0002\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"Lokio/v;", "Lokio/o0;", "source", "<init>", "(Lokio/o0;)V", "Lkotlin/k2;", "b", "()V", "c", "Lokio/m;", "buffer", "", "offset", "byteCount", "d", "(Lokio/m;JJ)V", "", "name", "", "expected", "actual", "a", "(Ljava/lang/String;II)V", "sink", "w3", "(Lokio/m;J)J", "Lokio/q0;", "timeout", "()Lokio/q0;", "close", "", "B", "section", "Lokio/i0;", "Lokio/i0;", "Ljava/util/zip/Inflater;", "Ljava/util/zip/Inflater;", "inflater", "Lokio/y;", "e", "Lokio/y;", "inflaterSource", "Ljava/util/zip/CRC32;", "f", "Ljava/util/zip/CRC32;", "crc", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class v implements o0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private byte section;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i0 source;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Inflater inflater;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final y inflaterSource;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final CRC32 crc;

    public v(@fg.l o0 o0Var) {
        kotlin.jvm.internal.l0.p(o0Var, ProtectedSandApp.s("‷"));
        i0 i0Var = new i0(o0Var);
        this.source = i0Var;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new y((o) i0Var, inflater);
        this.crc = new CRC32();
    }

    private final void a(String name, int expected, int actual) {
        if (actual != expected) {
            throw new IOException(s3.a(new Object[]{name, Integer.valueOf(actual), Integer.valueOf(expected)}, 3, ProtectedSandApp.s("‸"), ProtectedSandApp.s("‹")));
        }
    }

    private final void b() throws IOException {
        this.source.J1(10L);
        byte z4 = this.source.bufferField.z(3L);
        boolean z5 = ((z4 >> 1) & 1) == 1;
        if (z5) {
            d(this.source.bufferField, 0L, 10L);
        }
        a(ProtectedSandApp.s("›"), 8075, this.source.readShort());
        this.source.skip(8L);
        if (((z4 >> 2) & 1) == 1) {
            this.source.J1(2L);
            if (z5) {
                d(this.source.bufferField, 0L, 2L);
            }
            long v12 = this.source.bufferField.v1();
            this.source.J1(v12);
            if (z5) {
                d(this.source.bufferField, 0L, v12);
            }
            this.source.skip(v12);
        }
        if (((z4 >> 3) & 1) == 1) {
            long Q1 = this.source.Q1((byte) 0);
            if (Q1 == -1) {
                throw new EOFException();
            }
            if (z5) {
                d(this.source.bufferField, 0L, Q1 + 1);
            }
            this.source.skip(Q1 + 1);
        }
        if (((z4 >> 4) & 1) == 1) {
            long Q12 = this.source.Q1((byte) 0);
            if (Q12 == -1) {
                throw new EOFException();
            }
            if (z5) {
                d(this.source.bufferField, 0L, Q12 + 1);
            }
            this.source.skip(Q12 + 1);
        }
        if (z5) {
            a(ProtectedSandApp.s("※"), this.source.v1(), (short) this.crc.getValue());
            this.crc.reset();
        }
    }

    private final void c() throws IOException {
        a(ProtectedSandApp.s("‼"), this.source.k3(), (int) this.crc.getValue());
        a(ProtectedSandApp.s("‽"), this.source.k3(), (int) this.inflater.getBytesWritten());
    }

    private final void d(m buffer, long offset, long byteCount) {
        j0 j0Var = buffer.head;
        kotlin.jvm.internal.l0.m(j0Var);
        while (true) {
            int i4 = j0Var.limit;
            int i5 = j0Var.pos;
            if (offset < i4 - i5) {
                break;
            }
            offset -= i4 - i5;
            j0Var = j0Var.next;
            kotlin.jvm.internal.l0.m(j0Var);
        }
        while (byteCount > 0) {
            int min = (int) Math.min(j0Var.limit - r6, byteCount);
            this.crc.update(j0Var.data, (int) (j0Var.pos + offset), min);
            byteCount -= min;
            j0Var = j0Var.next;
            kotlin.jvm.internal.l0.m(j0Var);
            offset = 0;
        }
    }

    @Override // okio.o0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.inflaterSource.close();
    }

    @Override // okio.o0
    @fg.l
    public q0 timeout() {
        return this.source.source.timeout();
    }

    @Override // okio.o0
    public long w3(@fg.l m sink, long byteCount) throws IOException {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("‾"));
        if (!(byteCount >= 0)) {
            throw new IllegalArgumentException(androidx.collection.p0.a(ProtectedSandApp.s("⁀"), byteCount).toString());
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
            long w32 = this.inflaterSource.w3(sink, byteCount);
            if (w32 != -1) {
                d(sink, size, w32);
                return w32;
            }
            this.section = (byte) 2;
        }
        if (this.section == 2) {
            c();
            this.section = (byte) 3;
            if (!this.source.t2()) {
                throw new IOException(ProtectedSandApp.s("‿"));
            }
        }
        return -1L;
    }
}
