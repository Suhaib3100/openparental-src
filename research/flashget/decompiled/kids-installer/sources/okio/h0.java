package okio;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;

/* compiled from: RealBufferedSink.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010B\u001a\u00020?¢\u0006\u0004\bG\u0010HJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\tH\u0016J \u0010\u000e\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J \u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fH\u0016J\u0010\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u0018\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J(\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u001bH\u0016J \u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\fH\u0016J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u001dH\u0016J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u001eH\u0016J\u0018\u0010 \u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\"\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\fH\u0016J\u0010\u0010$\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\fH\u0016J\u0010\u0010%\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\fH\u0016J\u0010\u0010'\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\fH\u0016J\u0010\u0010(\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\fH\u0016J\u0010\u0010*\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u0005H\u0016J\u0010\u0010+\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u0005H\u0016J\u0010\u0010,\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u0005H\u0016J\u0010\u0010-\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u0005H\u0016J\b\u0010.\u001a\u00020\u0001H\u0016J\b\u0010/\u001a\u00020\u0001H\u0016J\b\u00101\u001a\u000200H\u0016J\b\u00102\u001a\u00020\u0007H\u0016J\b\u00104\u001a\u000203H\u0016J\b\u00105\u001a\u00020\u0007H\u0016J\b\u00107\u001a\u000206H\u0016J\b\u00108\u001a\u00020\u000fH\u0016R\u0014\u0010;\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010>\u001a\u0002038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001b\u0010F\u001a\u00020\u00028Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\bD\u0010E\u001a\u0004\b&\u0010C¨\u0006I"}, d2 = {"Lokio/h0;", "Lokio/n;", "Lokio/m;", "f", "source", "", "byteCount", "Lkotlin/m2;", "t0", "Lokio/p;", "byteString", "S0", "", "offset", "A", "", "string", "j0", "beginIndex", "endIndex", "u0", "codePoint", "y", "Ljava/nio/charset/Charset;", "charset", "z0", "d1", "", "write", "Ljava/nio/ByteBuffer;", "Lokio/o0;", "v0", "D0", "b", "writeByte", "s", "writeShort", "h0", "i", "writeInt", "L", "v", "writeLong", "E", "j1", "w0", "Y", "x", "Ljava/io/OutputStream;", "k1", "flush", "", "isOpen", "close", "Lokio/q0;", "h", "toString", "o", "Lokio/m;", "bufferField", "p", "Z", "closed", "Lokio/m0;", "q", "Lokio/m0;", "sink", "()Lokio/m;", "getBuffer$annotations", "()V", "buffer", "<init>", "(Lokio/m0;)V", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public final class h0 implements n {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d5.d
    @p3.f
    public final m bufferField;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @p3.f
    public boolean closed;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @d5.d
    @p3.f
    public final m0 sink;

    public h0(@d5.d m0 m0Var) {
        kotlin.jvm.internal.l0.p(m0Var, ProtectedSandApp.s("銱"));
        this.sink = m0Var;
        this.bufferField = new m();
    }

    public static /* synthetic */ void a() {
    }

    @Override // okio.n
    @d5.d
    public n A(@d5.d p byteString, int offset, int byteCount) {
        kotlin.jvm.internal.l0.p(byteString, ProtectedSandApp.s("銲"));
        if (!(!this.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("銳").toString());
        }
        this.bufferField.A(byteString, offset, byteCount);
        return Y();
    }

    @Override // okio.n
    @d5.d
    public n D0(@d5.d o0 source, long byteCount) {
        kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("銴"));
        while (byteCount > 0) {
            long X0 = source.X0(this.bufferField, byteCount);
            if (X0 == -1) {
                throw new EOFException();
            }
            byteCount -= X0;
            Y();
        }
        return this;
    }

    @Override // okio.n
    @d5.d
    public n E(long v5) {
        if (!(!this.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("銵").toString());
        }
        this.bufferField.E(v5);
        return Y();
    }

    @Override // okio.n
    @d5.d
    public n L(int i5) {
        if (!(!this.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("銶").toString());
        }
        this.bufferField.L(i5);
        return Y();
    }

    @Override // okio.n
    @d5.d
    public n S0(@d5.d p byteString) {
        kotlin.jvm.internal.l0.p(byteString, ProtectedSandApp.s("銷"));
        if (!(!this.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("銸").toString());
        }
        this.bufferField.S0(byteString);
        return Y();
    }

    @Override // okio.n
    @d5.d
    public n Y() {
        if (!(!this.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("銹").toString());
        }
        long e6 = this.bufferField.e();
        if (e6 > 0) {
            this.sink.t0(this.bufferField, e6);
        }
        return this;
    }

    @Override // okio.m0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        try {
            if (this.bufferField.size() > 0) {
                m0 m0Var = this.sink;
                m mVar = this.bufferField;
                m0Var.t0(mVar, mVar.size());
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.sink.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.closed = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.n
    @d5.d
    public n d1(@d5.d String string, int beginIndex, int endIndex, @d5.d Charset charset) {
        kotlin.jvm.internal.l0.p(string, ProtectedSandApp.s("銺"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("銻"));
        if (!(!this.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("銼").toString());
        }
        this.bufferField.d1(string, beginIndex, endIndex, charset);
        return Y();
    }

    @Override // okio.n
    @d5.d
    /* renamed from: f, reason: from getter */
    public m getBufferField() {
        return this.bufferField;
    }

    @Override // okio.n, okio.m0, java.io.Flushable
    public void flush() {
        if (!(!this.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("銽").toString());
        }
        if (this.bufferField.size() > 0) {
            m0 m0Var = this.sink;
            m mVar = this.bufferField;
            m0Var.t0(mVar, mVar.size());
        }
        this.sink.flush();
    }

    @Override // okio.m0
    @d5.d
    /* renamed from: h */
    public q0 getTimeout() {
        return this.sink.getTimeout();
    }

    @Override // okio.n
    @d5.d
    public n h0(int s5) {
        if (!(!this.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("銾").toString());
        }
        this.bufferField.h0(s5);
        return Y();
    }

    @Override // okio.n
    @d5.d
    public m i() {
        return this.bufferField;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    @Override // okio.n
    @d5.d
    public n j0(@d5.d String string) {
        kotlin.jvm.internal.l0.p(string, ProtectedSandApp.s("銿"));
        if (!(!this.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("鋀").toString());
        }
        this.bufferField.j0(string);
        return Y();
    }

    @Override // okio.n
    @d5.d
    public n j1(long v5) {
        if (!(!this.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("鋁").toString());
        }
        this.bufferField.j1(v5);
        return Y();
    }

    @Override // okio.n
    @d5.d
    public OutputStream k1() {
        return new a();
    }

    @Override // okio.m0
    public void t0(@d5.d m mVar, long j5) {
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("鋂"));
        if (!(!this.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("鋃").toString());
        }
        this.bufferField.t0(mVar, j5);
        Y();
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("鋄") + this.sink + ')';
    }

    @Override // okio.n
    @d5.d
    public n u0(@d5.d String string, int beginIndex, int endIndex) {
        kotlin.jvm.internal.l0.p(string, ProtectedSandApp.s("鋅"));
        if (!(!this.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("鋆").toString());
        }
        this.bufferField.u0(string, beginIndex, endIndex);
        return Y();
    }

    @Override // okio.n
    public long v0(@d5.d o0 source) {
        kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("鋇"));
        long j5 = 0;
        while (true) {
            long X0 = source.X0(this.bufferField, 8192);
            if (X0 == -1) {
                return j5;
            }
            j5 += X0;
            Y();
        }
    }

    @Override // okio.n
    @d5.d
    public n w0(long v5) {
        if (!(!this.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("鋈").toString());
        }
        this.bufferField.w0(v5);
        return Y();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@d5.d ByteBuffer source) {
        kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("鋉"));
        if (!(!this.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("鋊").toString());
        }
        int write = this.bufferField.write(source);
        Y();
        return write;
    }

    @Override // okio.n
    @d5.d
    public n writeByte(int b6) {
        if (!(!this.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("鋏").toString());
        }
        this.bufferField.writeByte(b6);
        return Y();
    }

    @Override // okio.n
    @d5.d
    public n writeInt(int i5) {
        if (!(!this.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("鋐").toString());
        }
        this.bufferField.writeInt(i5);
        return Y();
    }

    @Override // okio.n
    @d5.d
    public n writeLong(long v5) {
        if (!(!this.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("鋑").toString());
        }
        this.bufferField.writeLong(v5);
        return Y();
    }

    @Override // okio.n
    @d5.d
    public n writeShort(int s5) {
        if (!(!this.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("鋒").toString());
        }
        this.bufferField.writeShort(s5);
        return Y();
    }

    @Override // okio.n
    @d5.d
    public n x() {
        if (!(!this.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("鋓").toString());
        }
        long size = this.bufferField.size();
        if (size > 0) {
            this.sink.t0(this.bufferField, size);
        }
        return this;
    }

    @Override // okio.n
    @d5.d
    public n y(int codePoint) {
        if (!(!this.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("鋔").toString());
        }
        this.bufferField.y(codePoint);
        return Y();
    }

    @Override // okio.n
    @d5.d
    public n z0(@d5.d String string, @d5.d Charset charset) {
        kotlin.jvm.internal.l0.p(string, ProtectedSandApp.s("鋕"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("鋖"));
        if (!(!this.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("鋗").toString());
        }
        this.bufferField.z0(string, charset);
        return Y();
    }

    /* compiled from: RealBufferedSink.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"okio/h0$a", "Ljava/io/OutputStream;", "", "b", "Lkotlin/m2;", "write", "", "data", "offset", "byteCount", "flush", "close", "", "toString", "okio"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class a extends OutputStream {
        a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            h0.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            h0 h0Var = h0.this;
            if (h0Var.closed) {
                return;
            }
            h0Var.flush();
        }

        @d5.d
        public String toString() {
            return h0.this + ProtectedSandApp.s("栫");
        }

        @Override // java.io.OutputStream
        public void write(int i5) {
            h0 h0Var = h0.this;
            if (h0Var.closed) {
                throw new IOException(ProtectedSandApp.s("栬"));
            }
            h0Var.bufferField.writeByte((byte) i5);
            h0.this.Y();
        }

        @Override // java.io.OutputStream
        public void write(@d5.d byte[] bArr, int i5, int i6) {
            kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("栭"));
            h0 h0Var = h0.this;
            if (!h0Var.closed) {
                h0Var.bufferField.write(bArr, i5, i6);
                h0.this.Y();
                return;
            }
            throw new IOException(ProtectedSandApp.s("栮"));
        }
    }

    @Override // okio.n
    @d5.d
    public n write(@d5.d byte[] source) {
        kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("鋋"));
        if (!this.closed) {
            this.bufferField.write(source);
            return Y();
        }
        throw new IllegalStateException(ProtectedSandApp.s("鋌").toString());
    }

    @Override // okio.n
    @d5.d
    public n write(@d5.d byte[] source, int offset, int byteCount) {
        kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("鋍"));
        if (!this.closed) {
            this.bufferField.write(source, offset, byteCount);
            return Y();
        }
        throw new IllegalStateException(ProtectedSandApp.s("鋎").toString());
    }
}
