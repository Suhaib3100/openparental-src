package okio;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;

/* compiled from: RealBufferedSource.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\n\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020 2\u0006\u0010\t\u001a\u00020#H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020#H\u0016¢\u0006\u0004\b*\u0010+J'\u0010(\u001a\u00020 2\u0006\u0010\t\u001a\u00020#2\u0006\u0010,\u001a\u00020 2\u0006\u0010\u000b\u001a\u00020 H\u0016¢\u0006\u0004\b(\u0010-J\u0017\u0010(\u001a\u00020 2\u0006\u0010\t\u001a\u00020.H\u0016¢\u0006\u0004\b(\u0010/J\u001f\u00100\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\n2\u0006\u0010\t\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u0002052\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u0002052\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010>\u001a\u0002052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b>\u0010?J\u0011\u0010@\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\b@\u00107J\u000f\u0010A\u001a\u000205H\u0016¢\u0006\u0004\bA\u00107J\u0017\u0010C\u001a\u0002052\u0006\u0010B\u001a\u00020\nH\u0016¢\u0006\u0004\bC\u00109J\u000f\u0010D\u001a\u00020 H\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020FH\u0016¢\u0006\u0004\bI\u0010HJ\u000f\u0010J\u001a\u00020 H\u0016¢\u0006\u0004\bJ\u0010EJ\u000f\u0010K\u001a\u00020 H\u0016¢\u0006\u0004\bK\u0010EJ\u000f\u0010L\u001a\u00020\nH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\nH\u0016¢\u0006\u0004\bN\u0010MJ\u000f\u0010O\u001a\u00020\nH\u0016¢\u0006\u0004\bO\u0010MJ\u000f\u0010P\u001a\u00020\nH\u0016¢\u0006\u0004\bP\u0010MJ\u0017\u0010Q\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\bQ\u0010\u0013J\u0017\u0010S\u001a\u00020\n2\u0006\u0010R\u001a\u00020\u0016H\u0016¢\u0006\u0004\bS\u0010TJ\u001f\u0010V\u001a\u00020\n2\u0006\u0010R\u001a\u00020\u00162\u0006\u0010U\u001a\u00020\nH\u0016¢\u0006\u0004\bV\u0010WJ'\u0010Y\u001a\u00020\n2\u0006\u0010R\u001a\u00020\u00162\u0006\u0010U\u001a\u00020\n2\u0006\u0010X\u001a\u00020\nH\u0016¢\u0006\u0004\bY\u0010ZJ\u0017\u0010\\\u001a\u00020\n2\u0006\u0010[\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\\\u0010]J\u001f\u0010^\u001a\u00020\n2\u0006\u0010[\u001a\u00020\u00192\u0006\u0010U\u001a\u00020\nH\u0016¢\u0006\u0004\b^\u0010_J\u0017\u0010a\u001a\u00020\n2\u0006\u0010`\u001a\u00020\u0019H\u0016¢\u0006\u0004\ba\u0010]J\u001f\u0010b\u001a\u00020\n2\u0006\u0010`\u001a\u00020\u00192\u0006\u0010U\u001a\u00020\nH\u0016¢\u0006\u0004\bb\u0010_J\u001f\u0010c\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\n2\u0006\u0010[\u001a\u00020\u0019H\u0016¢\u0006\u0004\bc\u0010dJ/\u0010f\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\n2\u0006\u0010[\u001a\u00020\u00192\u0006\u0010e\u001a\u00020 2\u0006\u0010\u000b\u001a\u00020 H\u0016¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020\u0001H\u0016¢\u0006\u0004\bh\u0010iJ\u000f\u0010k\u001a\u00020jH\u0016¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00020\u000eH\u0016¢\u0006\u0004\bm\u0010\u0010J\u000f\u0010n\u001a\u00020\u0011H\u0016¢\u0006\u0004\bn\u0010oJ\u000f\u0010q\u001a\u00020pH\u0016¢\u0006\u0004\bq\u0010rJ\u000f\u0010s\u001a\u000205H\u0016¢\u0006\u0004\bs\u00107R\u0014\u0010u\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bR\u0010tR\u0016\u0010x\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u001b\u0010}\u001a\u00020\u00068Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\b|\u0010o\u001a\u0004\b{\u0010\b¨\u0006~"}, d2 = {"Lokio/i0;", "Lokio/o;", "Lokio/o0;", "source", "<init>", "(Lokio/o0;)V", "Lokio/m;", "r", "()Lokio/m;", "sink", "", "byteCount", "w3", "(Lokio/m;J)J", "", "t2", "()Z", "Lkotlin/k2;", "J1", "(J)V", "h1", "(J)Z", "", "readByte", "()B", "Lokio/p;", "b3", "()Lokio/p;", "b2", "(J)Lokio/p;", "Lokio/d0;", "options", "", "K3", "(Lokio/d0;)I", "", "p2", "()[B", "q1", "(J)[B", "read", "([B)I", "readFully", "([B)V", "offset", "([BII)I", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)I", "t0", "(Lokio/m;J)V", "Lokio/m0;", "z3", "(Lokio/m0;)J", "", "n3", "()Ljava/lang/String;", "V1", "(J)Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "X2", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "q3", "(JLjava/nio/charset/Charset;)Ljava/lang/String;", "x0", "m1", "limit", "D0", "Z2", "()I", "", "readShort", "()S", "v1", "readInt", "k3", "readLong", "()J", "z1", "y2", "H3", "skip", "b", "Q1", "(B)J", "fromIndex", "s0", "(BJ)J", "toIndex", "v0", "(BJJ)J", "bytes", "m0", "(Lokio/p;)J", "V", "(Lokio/p;J)J", "targetBytes", "w0", "I1", "T0", "(JLokio/p;)Z", "bytesOffset", "o1", "(JLokio/p;II)Z", "peek", "()Lokio/o;", "Ljava/io/InputStream;", "J3", "()Ljava/io/InputStream;", "isOpen", "close", "()V", "Lokio/q0;", "timeout", "()Lokio/q0;", "toString", "Lokio/m;", "bufferField", "c", "Z", "closed", "d", "Lokio/o0;", "getBuffer", "a", "buffer", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class i0 implements o {

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
    public final o0 source;

    public i0(@fg.l o0 o0Var) {
        kotlin.jvm.internal.l0.p(o0Var, ProtectedSandApp.s("ὗ"));
        this.source = o0Var;
        this.bufferField = new m();
    }

    public static /* synthetic */ void a() {
    }

    @Override // okio.o
    @fg.l
    public String D0(long limit) {
        if (!(limit >= 0)) {
            throw new IllegalArgumentException(androidx.collection.p0.a(ProtectedSandApp.s("Ὓ"), limit).toString());
        }
        long j4 = limit == Long.MAX_VALUE ? Long.MAX_VALUE : limit + 1;
        byte b5 = (byte) 10;
        long v02 = v0(b5, 0L, j4);
        if (v02 != -1) {
            return ve.a.b0(this.bufferField, v02);
        }
        if (j4 < Long.MAX_VALUE && h1(j4) && this.bufferField.z(j4 - 1) == ((byte) 13) && h1(1 + j4) && this.bufferField.z(j4) == b5) {
            return ve.a.b0(this.bufferField, j4);
        }
        m mVar = new m();
        m mVar2 = this.bufferField;
        mVar2.n(mVar, 0L, Math.min(32, mVar2.size()));
        throw new EOFException(ProtectedSandApp.s("\u1f58") + Math.min(this.bufferField.size(), limit) + ProtectedSandApp.s("Ὑ") + mVar.b3().s() + ProtectedSandApp.s("\u1f5a"));
    }

    @Override // okio.o
    public long H3() {
        byte z4;
        J1(1L);
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            if (!h1(i5)) {
                break;
            }
            z4 = this.bufferField.z(i4);
            if ((z4 < ((byte) 48) || z4 > ((byte) 57)) && ((z4 < ((byte) 97) || z4 > ((byte) 102)) && (z4 < ((byte) 65) || z4 > ((byte) 70)))) {
                break;
            }
            i4 = i5;
        }
        if (i4 == 0) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\u1f5c"));
            String num = Integer.toString(z4, kotlin.text.c.a(kotlin.text.c.a(16)));
            kotlin.jvm.internal.l0.o(num, ProtectedSandApp.s("Ὕ"));
            sb.append(num);
            throw new NumberFormatException(sb.toString());
        }
        return this.bufferField.H3();
    }

    @Override // okio.o
    public long I1(@fg.l p targetBytes, long fromIndex) {
        kotlin.jvm.internal.l0.p(targetBytes, ProtectedSandApp.s("\u1f5e"));
        if (this.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("Ὗ"));
        }
        while (true) {
            long I1 = this.bufferField.I1(targetBytes, fromIndex);
            if (I1 != -1) {
                return I1;
            }
            long size = this.bufferField.size();
            if (this.source.w3(this.bufferField, 8192) == -1) {
                return -1L;
            }
            fromIndex = Math.max(fromIndex, size);
        }
    }

    @Override // okio.o
    public void J1(long byteCount) {
        if (!h1(byteCount)) {
            throw new EOFException();
        }
    }

    @Override // okio.o
    @fg.l
    public InputStream J3() {
        return new a();
    }

    @Override // okio.o
    public int K3(@fg.l d0 options) {
        kotlin.jvm.internal.l0.p(options, ProtectedSandApp.s("ὠ"));
        if (this.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("Ὗ"));
        }
        while (true) {
            int d02 = ve.a.d0(this.bufferField, options, true);
            if (d02 != -2) {
                if (d02 != -1) {
                    this.bufferField.skip(options.getByteStrings()[d02].q());
                    return d02;
                }
            } else if (this.source.w3(this.bufferField, 8192) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // okio.o
    public long Q1(byte b5) {
        return v0(b5, 0L, Long.MAX_VALUE);
    }

    @Override // okio.o
    public boolean T0(long offset, @fg.l p bytes) {
        kotlin.jvm.internal.l0.p(bytes, ProtectedSandApp.s("ὡ"));
        return o1(offset, bytes, 0, bytes.q());
    }

    @Override // okio.o
    public long V(@fg.l p bytes, long fromIndex) {
        kotlin.jvm.internal.l0.p(bytes, ProtectedSandApp.s("ὡ"));
        if (this.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("Ὗ"));
        }
        while (true) {
            long V = this.bufferField.V(bytes, fromIndex);
            if (V != -1) {
                return V;
            }
            long size = this.bufferField.size();
            if (this.source.w3(this.bufferField, 8192) == -1) {
                return -1L;
            }
            fromIndex = Math.max(fromIndex, (size - bytes.q()) + 1);
        }
    }

    @Override // okio.o
    @fg.l
    public String V1(long byteCount) {
        J1(byteCount);
        m mVar = this.bufferField;
        mVar.getClass();
        return mVar.q3(byteCount, kotlin.text.f.UTF_8);
    }

    @Override // okio.o
    @fg.l
    public String X2(@fg.l Charset charset) {
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("ὢ"));
        this.bufferField.b1(this.source);
        return this.bufferField.X2(charset);
    }

    @Override // okio.o
    public int Z2() {
        J1(1L);
        byte z4 = this.bufferField.z(0L);
        if ((z4 & 224) == 192) {
            J1(2L);
        } else if ((z4 & 240) == 224) {
            J1(3L);
        } else if ((z4 & 248) == 240) {
            J1(4L);
        }
        return this.bufferField.Z2();
    }

    @Override // okio.o
    @fg.l
    public p b2(long byteCount) {
        J1(byteCount);
        return this.bufferField.b2(byteCount);
    }

    @Override // okio.o
    @fg.l
    public p b3() {
        this.bufferField.b1(this.source);
        return this.bufferField.b3();
    }

    @Override // okio.o0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.source.close();
        this.bufferField.d();
    }

    @Override // okio.o
    @fg.l
    /* renamed from: getBuffer, reason: from getter */
    public m getBufferField() {
        return this.bufferField;
    }

    @Override // okio.o
    public boolean h1(long byteCount) {
        if (!(byteCount >= 0)) {
            throw new IllegalArgumentException(androidx.collection.p0.a(ProtectedSandApp.s("ὣ"), byteCount).toString());
        }
        if (this.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("Ὗ"));
        }
        while (this.bufferField.size() < byteCount) {
            if (this.source.w3(this.bufferField, 8192) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    @Override // okio.o
    public int k3() {
        J1(4L);
        return this.bufferField.k3();
    }

    @Override // okio.o
    public long m0(@fg.l p bytes) {
        kotlin.jvm.internal.l0.p(bytes, ProtectedSandApp.s("ὡ"));
        return V(bytes, 0L);
    }

    @Override // okio.o
    @fg.l
    public String m1() {
        return D0(Long.MAX_VALUE);
    }

    @Override // okio.o
    @fg.l
    public String n3() {
        this.bufferField.b1(this.source);
        return this.bufferField.n3();
    }

    @Override // okio.o
    public boolean o1(long offset, @fg.l p bytes, int bytesOffset, int byteCount) {
        kotlin.jvm.internal.l0.p(bytes, ProtectedSandApp.s("ὡ"));
        if (this.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("Ὗ"));
        }
        if (offset < 0 || bytesOffset < 0 || byteCount < 0 || bytes.q() - bytesOffset < byteCount) {
            return false;
        }
        for (int i4 = 0; i4 < byteCount; i4++) {
            long j4 = i4 + offset;
            if (!h1(1 + j4) || this.bufferField.z(j4) != bytes.G(bytesOffset + i4)) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.o
    @fg.l
    public byte[] p2() {
        this.bufferField.b1(this.source);
        return this.bufferField.p2();
    }

    @Override // okio.o
    @fg.l
    public o peek() {
        return c0.c(new f0(this));
    }

    @Override // okio.o
    @fg.l
    public byte[] q1(long byteCount) {
        J1(byteCount);
        return this.bufferField.q1(byteCount);
    }

    @Override // okio.o
    @fg.l
    public String q3(long byteCount, @fg.l Charset charset) {
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("ὢ"));
        J1(byteCount);
        return this.bufferField.q3(byteCount, charset);
    }

    @Override // okio.o
    @fg.l
    public m r() {
        return this.bufferField;
    }

    @Override // okio.o
    public int read(@fg.l byte[] sink) {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("ὤ"));
        return read(sink, 0, sink.length);
    }

    @Override // okio.o
    public byte readByte() {
        J1(1L);
        return this.bufferField.readByte();
    }

    @Override // okio.o
    public void readFully(@fg.l byte[] sink) {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("ὤ"));
        try {
            J1(sink.length);
            this.bufferField.readFully(sink);
        } catch (EOFException e4) {
            int i4 = 0;
            while (this.bufferField.size() > 0) {
                m mVar = this.bufferField;
                int read = mVar.read(sink, i4, (int) mVar.size());
                if (read == -1) {
                    throw new AssertionError();
                }
                i4 += read;
            }
            throw e4;
        }
    }

    @Override // okio.o
    public int readInt() {
        J1(4L);
        return this.bufferField.readInt();
    }

    @Override // okio.o
    public long readLong() {
        J1(8L);
        return this.bufferField.readLong();
    }

    @Override // okio.o
    public short readShort() {
        J1(2L);
        return this.bufferField.readShort();
    }

    @Override // okio.o
    public long s0(byte b5, long fromIndex) {
        return v0(b5, fromIndex, Long.MAX_VALUE);
    }

    @Override // okio.o
    public void skip(long byteCount) {
        if (this.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("Ὗ"));
        }
        while (byteCount > 0) {
            if (this.bufferField.size() == 0 && this.source.w3(this.bufferField, 8192) == -1) {
                throw new EOFException();
            }
            long min = Math.min(byteCount, this.bufferField.size());
            this.bufferField.skip(min);
            byteCount -= min;
        }
    }

    @Override // okio.o
    public void t0(@fg.l m sink, long byteCount) {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("ὤ"));
        try {
            J1(byteCount);
            this.bufferField.t0(sink, byteCount);
        } catch (EOFException e4) {
            sink.b1(this.bufferField);
            throw e4;
        }
    }

    @Override // okio.o
    public boolean t2() {
        if (this.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("Ὗ"));
        }
        return this.bufferField.t2() && this.source.w3(this.bufferField, (long) 8192) == -1;
    }

    @Override // okio.o0
    @fg.l
    /* renamed from: timeout */
    public q0 getTimeout() {
        return this.source.getTimeout();
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("ὥ") + this.source + ')';
    }

    @Override // okio.o
    public long v0(byte b5, long fromIndex, long toIndex) {
        if (this.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("Ὗ"));
        }
        if (!(0 <= fromIndex && toIndex >= fromIndex)) {
            StringBuilder a5 = androidx.compose.runtime.snapshots.f0.a(ProtectedSandApp.s("ὦ"), fromIndex, ProtectedSandApp.s("ὧ"));
            a5.append(toIndex);
            throw new IllegalArgumentException(a5.toString().toString());
        }
        while (fromIndex < toIndex) {
            long v02 = this.bufferField.v0(b5, fromIndex, toIndex);
            if (v02 != -1) {
                return v02;
            }
            long size = this.bufferField.size();
            if (size >= toIndex || this.source.w3(this.bufferField, 8192) == -1) {
                return -1L;
            }
            fromIndex = Math.max(fromIndex, size);
        }
        return -1L;
    }

    @Override // okio.o
    public short v1() {
        J1(2L);
        return this.bufferField.v1();
    }

    @Override // okio.o
    public long w0(@fg.l p targetBytes) {
        kotlin.jvm.internal.l0.p(targetBytes, ProtectedSandApp.s("\u1f5e"));
        return I1(targetBytes, 0L);
    }

    @Override // okio.o0
    public long w3(@fg.l m sink, long byteCount) {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("ὤ"));
        if (!(byteCount >= 0)) {
            throw new IllegalArgumentException(androidx.collection.p0.a(ProtectedSandApp.s("ὣ"), byteCount).toString());
        }
        if (this.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("Ὗ"));
        }
        if (this.bufferField.size() == 0 && this.source.w3(this.bufferField, 8192) == -1) {
            return -1L;
        }
        return this.bufferField.w3(sink, Math.min(byteCount, this.bufferField.size()));
    }

    @Override // okio.o
    @fg.m
    public String x0() {
        long Q1 = Q1((byte) 10);
        if (Q1 != -1) {
            return ve.a.b0(this.bufferField, Q1);
        }
        if (this.bufferField.size() != 0) {
            return V1(this.bufferField.size());
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        r1 = new java.lang.StringBuilder(com.flashget.parentalcontrol.ProtectedSandApp.s("Ὠ"));
        r2 = java.lang.Integer.toString(r8, kotlin.text.c.a(kotlin.text.c.a(16)));
        kotlin.jvm.internal.l0.o(r2, com.flashget.parentalcontrol.ProtectedSandApp.s("Ὕ"));
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // okio.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long y2() {
        /*
            r10 = this;
            r0 = 1
            r10.J1(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r10.h1(r6)
            if (r8 == 0) goto L5e
            okio.m r8 = r10.bufferField
            byte r8 = r8.z(r4)
            r9 = 48
            byte r9 = (byte) r9
            if (r8 < r9) goto L20
            r9 = 57
            byte r9 = (byte) r9
            if (r8 <= r9) goto L2a
        L20:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L2c
            r5 = 45
            byte r5 = (byte) r5
            if (r8 == r5) goto L2a
            goto L2c
        L2a:
            r4 = r6
            goto L8
        L2c:
            if (r4 == 0) goto L2f
            goto L5e
        L2f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Ὠ"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            r1.<init>(r2)
            r2 = 16
            int r2 = kotlin.text.c.a(r2)
            int r2 = kotlin.text.c.a(r2)
            java.lang.String r2 = java.lang.Integer.toString(r8, r2)
            java.lang.String r3 = "Ὕ"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
            kotlin.jvm.internal.l0.o(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L5e:
            okio.m r0 = r10.bufferField
            long r0 = r0.y2()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.i0.y2():long");
    }

    @Override // okio.o
    public long z1() {
        J1(8L);
        return this.bufferField.z1();
    }

    @Override // okio.o
    public long z3(@fg.l m0 sink) {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("ὤ"));
        long j4 = 0;
        while (this.source.w3(this.bufferField, 8192) != -1) {
            long f4 = this.bufferField.f();
            if (f4 > 0) {
                j4 += f4;
                sink.write(this.bufferField, f4);
            }
        }
        if (this.bufferField.size() <= 0) {
            return j4;
        }
        long size = j4 + this.bufferField.size();
        m mVar = this.bufferField;
        sink.write(mVar, mVar.size());
        return size;
    }

    @Override // okio.o
    public int read(@fg.l byte[] sink, int offset, int byteCount) {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("ὤ"));
        long j4 = byteCount;
        j.e(sink.length, offset, j4);
        if (this.bufferField.size() == 0 && this.source.w3(this.bufferField, 8192) == -1) {
            return -1;
        }
        return this.bufferField.read(sink, offset, (int) Math.min(j4, this.bufferField.size()));
    }

    /* compiled from: RealBufferedSource.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"okio/i0$a", "Ljava/io/InputStream;", "", "read", "()I", "", "data", "offset", "byteCount", "([BII)I", "available", "Lkotlin/k2;", "close", "()V", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {1, 4, 0})
    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() {
            i0 i0Var = i0.this;
            if (i0Var.closed) {
                throw new IOException(ProtectedSandApp.s("ὔ"));
            }
            return (int) Math.min(i0Var.bufferField.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            i0.this.close();
        }

        @Override // java.io.InputStream
        public int read() {
            i0 i0Var = i0.this;
            if (i0Var.closed) {
                throw new IOException(ProtectedSandApp.s("ὔ"));
            }
            if (i0Var.bufferField.size() == 0) {
                i0 i0Var2 = i0.this;
                if (i0Var2.source.w3(i0Var2.bufferField, 8192) == -1) {
                    return -1;
                }
            }
            return i0.this.bufferField.readByte() & 255;
        }

        @fg.l
        public String toString() {
            return i0.this + ProtectedSandApp.s("ὖ");
        }

        @Override // java.io.InputStream
        public int read(@fg.l byte[] data, int offset, int byteCount) {
            kotlin.jvm.internal.l0.p(data, ProtectedSandApp.s("ὕ"));
            if (!i0.this.closed) {
                j.e(data.length, offset, byteCount);
                if (i0.this.bufferField.size() == 0) {
                    i0 i0Var = i0.this;
                    if (i0Var.source.w3(i0Var.bufferField, 8192) == -1) {
                        return -1;
                    }
                }
                return i0.this.bufferField.read(data, offset, byteCount);
            }
            throw new IOException(ProtectedSandApp.s("ὔ"));
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@fg.l ByteBuffer sink) {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("ὤ"));
        if (this.bufferField.size() == 0 && this.source.w3(this.bufferField, 8192) == -1) {
            return -1;
        }
        return this.bufferField.read(sink);
    }
}
