package okio;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;

/* compiled from: RealBufferedSink.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J/\u0010&\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010\r\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020(H\u0016¢\u0006\u0004\b\r\u0010)J'\u0010\r\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020(2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\r\u0010*J\u0017\u0010\r\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020+H\u0016¢\u0006\u0004\b\r\u0010,J\u0017\u0010.\u001a\u00020\n2\u0006\u0010\t\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020-2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u0013H\u0016¢\u0006\u0004\b3\u0010!J\u0017\u00105\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u0013H\u0016¢\u0006\u0004\b5\u0010!J\u0017\u00106\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u0013H\u0016¢\u0006\u0004\b6\u0010!J\u0017\u00108\u001a\u00020\u00012\u0006\u00107\u001a\u00020\u0013H\u0016¢\u0006\u0004\b8\u0010!J\u0017\u00109\u001a\u00020\u00012\u0006\u00107\u001a\u00020\u0013H\u0016¢\u0006\u0004\b9\u0010!J\u0017\u0010;\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\nH\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\nH\u0016¢\u0006\u0004\b=\u0010<J\u0017\u0010>\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\nH\u0016¢\u0006\u0004\b>\u0010<J\u0017\u0010?\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\nH\u0016¢\u0006\u0004\b?\u0010<J\u000f\u0010@\u001a\u00020\u0001H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0001H\u0016¢\u0006\u0004\bB\u0010AJ\u000f\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\fH\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\fH\u0016¢\u0006\u0004\bK\u0010GJ\u000f\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\u0017H\u0016¢\u0006\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010QR\u0016\u0010U\u001a\u00020H8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u001b\u0010Z\u001a\u00020\u00068Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\bY\u0010G\u001a\u0004\bX\u0010\b¨\u0006["}, d2 = {"Lokio/h0;", "Lokio/n;", "Lokio/m0;", "sink", "<init>", "(Lokio/m0;)V", "Lokio/m;", "r", "()Lokio/m;", "source", "", "byteCount", "Lkotlin/k2;", "write", "(Lokio/m;J)V", "Lokio/p;", "byteString", "t3", "(Lokio/p;)Lokio/n;", "", "offset", "h2", "(Lokio/p;II)Lokio/n;", "", "string", "Q0", "(Ljava/lang/String;)Lokio/n;", "beginIndex", "endIndex", "a1", "(Ljava/lang/String;II)Lokio/n;", "codePoint", "f0", "(I)Lokio/n;", "Ljava/nio/charset/Charset;", "charset", "c3", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lokio/n;", "G1", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Lokio/n;", "", "([B)Lokio/n;", "([BII)Lokio/n;", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)I", "Lokio/o0;", "b1", "(Lokio/o0;)J", "f3", "(Lokio/o0;J)Lokio/n;", "b", "writeByte", "s", "writeShort", "J2", "i", "writeInt", "s2", "v", "writeLong", "(J)Lokio/n;", "i0", "N1", "a3", "y0", "()Lokio/n;", "d0", "Ljava/io/OutputStream;", "G3", "()Ljava/io/OutputStream;", "flush", "()V", "", "isOpen", "()Z", "close", "Lokio/q0;", "timeout", "()Lokio/q0;", "toString", "()Ljava/lang/String;", "Lokio/m;", "bufferField", "c", "Z", "closed", "d", "Lokio/m0;", "getBuffer", "a", "buffer", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class h0 implements n {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final m bufferField;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public boolean closed;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final m0 sink;

    public h0(@fg.l m0 m0Var) {
        kotlin.jvm.internal.l0.p(m0Var, ProtectedSandApp.s("Ὃ"));
        this.sink = m0Var;
        this.bufferField = new m();
    }

    public static /* synthetic */ void a() {
    }

    @Override // okio.n
    @fg.l
    public n G1(@fg.l String string, int beginIndex, int endIndex, @fg.l Charset charset) {
        kotlin.jvm.internal.l0.p(string, ProtectedSandApp.s("Ὄ"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("Ὅ"));
        if (this.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("\u1f4e"));
        }
        this.bufferField.G1(string, beginIndex, endIndex, charset);
        return y0();
    }

    @Override // okio.n
    @fg.l
    public OutputStream G3() {
        return new a();
    }

    @Override // okio.n
    @fg.l
    public n J2(int s4) {
        if (this.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("\u1f4e"));
        }
        this.bufferField.J2(s4);
        return y0();
    }

    @Override // okio.n
    @fg.l
    public n N1(long v4) {
        if (this.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("\u1f4e"));
        }
        this.bufferField.N1(v4);
        return y0();
    }

    @Override // okio.n
    @fg.l
    public n Q0(@fg.l String string) {
        kotlin.jvm.internal.l0.p(string, ProtectedSandApp.s("Ὄ"));
        if (this.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("\u1f4e"));
        }
        this.bufferField.Q0(string);
        return y0();
    }

    @Override // okio.n
    @fg.l
    public n a1(@fg.l String string, int beginIndex, int endIndex) {
        kotlin.jvm.internal.l0.p(string, ProtectedSandApp.s("Ὄ"));
        if (this.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("\u1f4e"));
        }
        this.bufferField.a1(string, beginIndex, endIndex);
        return y0();
    }

    @Override // okio.n
    @fg.l
    public n a3(long v4) {
        if (this.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("\u1f4e"));
        }
        this.bufferField.a3(v4);
        return y0();
    }

    @Override // okio.n
    public long b1(@fg.l o0 source) {
        kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("\u1f4f"));
        long j4 = 0;
        while (true) {
            long w32 = source.w3(this.bufferField, 8192);
            if (w32 == -1) {
                return j4;
            }
            j4 += w32;
            y0();
        }
    }

    @Override // okio.n
    @fg.l
    public n c3(@fg.l String string, @fg.l Charset charset) {
        kotlin.jvm.internal.l0.p(string, ProtectedSandApp.s("Ὄ"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("Ὅ"));
        if (this.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("\u1f4e"));
        }
        this.bufferField.c3(string, charset);
        return y0();
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
                m0Var.write(mVar, mVar.size());
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
    @fg.l
    public n d0() {
        if (this.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("\u1f4e"));
        }
        long size = this.bufferField.size();
        if (size > 0) {
            this.sink.write(this.bufferField, size);
        }
        return this;
    }

    @Override // okio.n
    @fg.l
    public n f0(int codePoint) {
        if (this.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("\u1f4e"));
        }
        this.bufferField.f0(codePoint);
        return y0();
    }

    @Override // okio.n
    @fg.l
    public n f3(@fg.l o0 source, long byteCount) {
        kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("\u1f4f"));
        while (byteCount > 0) {
            long w32 = source.w3(this.bufferField, byteCount);
            if (w32 == -1) {
                throw new EOFException();
            }
            byteCount -= w32;
            y0();
        }
        return this;
    }

    @Override // okio.n, okio.m0, java.io.Flushable
    public void flush() {
        if (this.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("\u1f4e"));
        }
        if (this.bufferField.size() > 0) {
            m0 m0Var = this.sink;
            m mVar = this.bufferField;
            m0Var.write(mVar, mVar.size());
        }
        this.sink.flush();
    }

    @Override // okio.n
    @fg.l
    /* renamed from: getBuffer, reason: from getter */
    public m getBufferField() {
        return this.bufferField;
    }

    @Override // okio.n
    @fg.l
    public n h2(@fg.l p byteString, int offset, int byteCount) {
        kotlin.jvm.internal.l0.p(byteString, ProtectedSandApp.s("ὐ"));
        if (this.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("\u1f4e"));
        }
        this.bufferField.h2(byteString, offset, byteCount);
        return y0();
    }

    @Override // okio.n
    @fg.l
    public n i0(long v4) {
        if (this.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("\u1f4e"));
        }
        this.bufferField.i0(v4);
        return y0();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    @Override // okio.n
    @fg.l
    public m r() {
        return this.bufferField;
    }

    @Override // okio.n
    @fg.l
    public n s2(int i4) {
        if (this.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("\u1f4e"));
        }
        this.bufferField.s2(i4);
        return y0();
    }

    @Override // okio.n
    @fg.l
    public n t3(@fg.l p byteString) {
        kotlin.jvm.internal.l0.p(byteString, ProtectedSandApp.s("ὐ"));
        if (this.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("\u1f4e"));
        }
        this.bufferField.t3(byteString);
        return y0();
    }

    @Override // okio.m0
    @fg.l
    /* renamed from: timeout */
    public q0 getTimeout() {
        return this.sink.getTimeout();
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("ὑ") + this.sink + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@fg.l ByteBuffer source) {
        kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("\u1f4f"));
        if (this.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("\u1f4e"));
        }
        int write = this.bufferField.write(source);
        y0();
        return write;
    }

    @Override // okio.n
    @fg.l
    public n writeByte(int b5) {
        if (this.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("\u1f4e"));
        }
        this.bufferField.writeByte(b5);
        return y0();
    }

    @Override // okio.n
    @fg.l
    public n writeInt(int i4) {
        if (this.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("\u1f4e"));
        }
        this.bufferField.writeInt(i4);
        return y0();
    }

    @Override // okio.n
    @fg.l
    public n writeLong(long v4) {
        if (this.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("\u1f4e"));
        }
        this.bufferField.writeLong(v4);
        return y0();
    }

    @Override // okio.n
    @fg.l
    public n writeShort(int s4) {
        if (this.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("\u1f4e"));
        }
        this.bufferField.writeShort(s4);
        return y0();
    }

    @Override // okio.n
    @fg.l
    public n y0() {
        if (this.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("\u1f4e"));
        }
        long f4 = this.bufferField.f();
        if (f4 > 0) {
            this.sink.write(this.bufferField, f4);
        }
        return this;
    }

    /* compiled from: RealBufferedSink.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"okio/h0$a", "Ljava/io/OutputStream;", "", "b", "Lkotlin/k2;", "write", "(I)V", "", "data", "offset", "byteCount", "([BII)V", "flush", "()V", "close", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {1, 4, 0})
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

        @fg.l
        public String toString() {
            return h0.this + ProtectedSandApp.s("Ὀ");
        }

        @Override // java.io.OutputStream
        public void write(int b5) {
            h0 h0Var = h0.this;
            if (h0Var.closed) {
                throw new IOException(ProtectedSandApp.s("Ὁ"));
            }
            h0Var.bufferField.writeByte((byte) b5);
            h0.this.y0();
        }

        @Override // java.io.OutputStream
        public void write(@fg.l byte[] data, int offset, int byteCount) {
            kotlin.jvm.internal.l0.p(data, ProtectedSandApp.s("Ὂ"));
            h0 h0Var = h0.this;
            if (!h0Var.closed) {
                h0Var.bufferField.write(data, offset, byteCount);
                h0.this.y0();
                return;
            }
            throw new IOException(ProtectedSandApp.s("Ὁ"));
        }
    }

    @Override // okio.m0
    public void write(@fg.l m source, long byteCount) {
        kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("\u1f4f"));
        if (!this.closed) {
            this.bufferField.write(source, byteCount);
            y0();
            return;
        }
        throw new IllegalStateException(ProtectedSandApp.s("\u1f4e"));
    }

    @Override // okio.n
    @fg.l
    public n write(@fg.l byte[] source) {
        kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("\u1f4f"));
        if (!this.closed) {
            this.bufferField.write(source);
            return y0();
        }
        throw new IllegalStateException(ProtectedSandApp.s("\u1f4e"));
    }

    @Override // okio.n
    @fg.l
    public n write(@fg.l byte[] source, int offset, int byteCount) {
        kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("\u1f4f"));
        if (!this.closed) {
            this.bufferField.write(source, offset, byteCount);
            return y0();
        }
        throw new IllegalStateException(ProtectedSandApp.s("\u1f4e"));
    }
}
