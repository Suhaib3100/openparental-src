package okio;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.UByte;

/* compiled from: RealBufferedSource.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\n\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010U\u001a\u00020S¢\u0006\u0004\b[\u0010\\J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0016H\u0016J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0016H\u0016J \u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0014H\u0016J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u001eH\u0016J\b\u0010!\u001a\u00020 H\u0016J\u0010\u0010\"\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010%\u001a\u00020 2\u0006\u0010$\u001a\u00020#H\u0016J\u0018\u0010&\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010$\u001a\u00020#H\u0016J\n\u0010'\u001a\u0004\u0018\u00010 H\u0016J\b\u0010(\u001a\u00020 H\u0016J\u0010\u0010*\u001a\u00020 2\u0006\u0010)\u001a\u00020\u0005H\u0016J\b\u0010+\u001a\u00020\u0014H\u0016J\b\u0010-\u001a\u00020,H\u0016J\b\u0010.\u001a\u00020,H\u0016J\b\u0010/\u001a\u00020\u0014H\u0016J\b\u00100\u001a\u00020\u0014H\u0016J\b\u00101\u001a\u00020\u0005H\u0016J\b\u00102\u001a\u00020\u0005H\u0016J\b\u00103\u001a\u00020\u0005H\u0016J\b\u00104\u001a\u00020\u0005H\u0016J\u0010\u00105\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u00107\u001a\u00020\u00052\u0006\u00106\u001a\u00020\rH\u0016J\u0018\u00109\u001a\u00020\u00052\u0006\u00106\u001a\u00020\r2\u0006\u00108\u001a\u00020\u0005H\u0016J \u0010;\u001a\u00020\u00052\u0006\u00106\u001a\u00020\r2\u0006\u00108\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\u0005H\u0016J\u0010\u0010=\u001a\u00020\u00052\u0006\u0010<\u001a\u00020\u000fH\u0016J\u0018\u0010>\u001a\u00020\u00052\u0006\u0010<\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u0005H\u0016J\u0010\u0010@\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u000fH\u0016J\u0018\u0010A\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u0005H\u0016J\u0018\u0010B\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010<\u001a\u00020\u000fH\u0016J(\u0010D\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010<\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0014H\u0016J\b\u0010E\u001a\u00020\u0001H\u0016J\b\u0010G\u001a\u00020FH\u0016J\b\u0010H\u001a\u00020\bH\u0016J\b\u0010I\u001a\u00020\nH\u0016J\b\u0010K\u001a\u00020JH\u0016J\b\u0010L\u001a\u00020 H\u0016R\u0014\u0010O\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010R\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010U\u001a\u00020S8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010TR\u001b\u0010Z\u001a\u00020\u00028Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\bX\u0010Y\u001a\u0004\bV\u0010W¨\u0006]"}, d2 = {"Lokio/i0;", "Lokio/o;", "Lokio/m;", "f", "sink", "", "byteCount", "X0", "", "M", "Lkotlin/m2;", "h1", "C0", "", "readByte", "Lokio/p;", "x0", "v", "Lokio/d0;", "options", "", "r1", "", "I", "K0", "read", "readFully", "offset", "Ljava/nio/ByteBuffer;", "S", "Lokio/m0;", "Z0", "", "L0", "q", "Ljava/nio/charset/Charset;", "charset", "r0", "Q0", "W", "G0", "limit", "c0", "s0", "", "readShort", "V0", "readInt", "H0", "readLong", "Y0", "a0", "o1", "skip", "b", "l1", "fromIndex", "Q", "toIndex", "T", "bytes", "K", "u", "targetBytes", "V", "e1", "q0", "bytesOffset", "I0", "peek", "Ljava/io/InputStream;", "p1", "isOpen", "close", "Lokio/q0;", "h", "toString", "o", "Lokio/m;", "bufferField", "p", "Z", "closed", "Lokio/o0;", "Lokio/o0;", "source", "i", "()Lokio/m;", "getBuffer$annotations", "()V", "buffer", "<init>", "(Lokio/o0;)V", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public final class i0 implements o {

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
    public final o0 source;

    public i0(@d5.d o0 o0Var) {
        kotlin.jvm.internal.l0.p(o0Var, ProtectedSandApp.s("鋘"));
        this.source = o0Var;
        this.bufferField = new m();
    }

    public static /* synthetic */ void a() {
    }

    @Override // okio.o
    public boolean C0(long byteCount) {
        if (!(byteCount >= 0)) {
            throw new IllegalArgumentException(com.bumptech.glide.load.resource.bitmap.p0.a(ProtectedSandApp.s("鋚"), byteCount).toString());
        }
        if (!(!this.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("鋙").toString());
        }
        while (this.bufferField.size() < byteCount) {
            if (this.source.X0(this.bufferField, 8192) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.o
    @d5.d
    public String G0() {
        return c0(Long.MAX_VALUE);
    }

    @Override // okio.o
    public int H0() {
        h1(4L);
        return this.bufferField.H0();
    }

    @Override // okio.o
    @d5.d
    public byte[] I() {
        this.bufferField.v0(this.source);
        return this.bufferField.I();
    }

    @Override // okio.o
    public boolean I0(long offset, @d5.d p bytes, int bytesOffset, int byteCount) {
        int i5;
        kotlin.jvm.internal.l0.p(bytes, ProtectedSandApp.s("鋛"));
        if (!(!this.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("鋜").toString());
        }
        if (offset >= 0 && bytesOffset >= 0 && byteCount >= 0 && bytes.i0() - bytesOffset >= byteCount) {
            for (0; i5 < byteCount; i5 + 1) {
                long j5 = i5 + offset;
                i5 = (C0(1 + j5) && this.bufferField.b0(j5) == bytes.x(bytesOffset + i5)) ? i5 + 1 : 0;
            }
            return true;
        }
        return false;
    }

    @Override // okio.o
    public long K(@d5.d p bytes) {
        kotlin.jvm.internal.l0.p(bytes, ProtectedSandApp.s("鋝"));
        return u(bytes, 0L);
    }

    @Override // okio.o
    @d5.d
    public byte[] K0(long byteCount) {
        h1(byteCount);
        return this.bufferField.K0(byteCount);
    }

    @Override // okio.o
    @d5.d
    public String L0() {
        this.bufferField.v0(this.source);
        return this.bufferField.L0();
    }

    @Override // okio.o
    public boolean M() {
        if (!this.closed) {
            return this.bufferField.M() && this.source.X0(this.bufferField, (long) 8192) == -1;
        }
        throw new IllegalStateException(ProtectedSandApp.s("鋞").toString());
    }

    @Override // okio.o
    public long Q(byte b6, long fromIndex) {
        return T(b6, fromIndex, Long.MAX_VALUE);
    }

    @Override // okio.o
    @d5.d
    public String Q0(long byteCount, @d5.d Charset charset) {
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("鋟"));
        h1(byteCount);
        return this.bufferField.Q0(byteCount, charset);
    }

    @Override // okio.o
    public void S(@d5.d m mVar, long j5) {
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("鋠"));
        try {
            h1(j5);
            this.bufferField.S(mVar, j5);
        } catch (EOFException e6) {
            mVar.v0(this.bufferField);
            throw e6;
        }
    }

    @Override // okio.o
    public long T(byte b6, long fromIndex, long toIndex) {
        if (!(!this.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("鋣").toString());
        }
        if (!(0 <= fromIndex && toIndex >= fromIndex)) {
            throw new IllegalArgumentException((ProtectedSandApp.s("鋡") + fromIndex + ProtectedSandApp.s("鋢") + toIndex).toString());
        }
        while (fromIndex < toIndex) {
            long T = this.bufferField.T(b6, fromIndex, toIndex);
            if (T != -1) {
                return T;
            }
            long size = this.bufferField.size();
            if (size >= toIndex || this.source.X0(this.bufferField, 8192) == -1) {
                return -1L;
            }
            fromIndex = Math.max(fromIndex, size);
        }
        return -1L;
    }

    @Override // okio.o
    public long V(@d5.d p targetBytes) {
        kotlin.jvm.internal.l0.p(targetBytes, ProtectedSandApp.s("鋤"));
        return e1(targetBytes, 0L);
    }

    @Override // okio.o
    public short V0() {
        h1(2L);
        return this.bufferField.V0();
    }

    @Override // okio.o
    @d5.e
    public String W() {
        long l12 = l1((byte) 10);
        if (l12 != -1) {
            return v4.a.b0(this.bufferField, l12);
        }
        if (this.bufferField.size() != 0) {
            return q(this.bufferField.size());
        }
        return null;
    }

    @Override // okio.o0
    public long X0(@d5.d m sink, long byteCount) {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("鋥"));
        if (!(byteCount >= 0)) {
            throw new IllegalArgumentException(com.bumptech.glide.load.resource.bitmap.p0.a(ProtectedSandApp.s("鋧"), byteCount).toString());
        }
        if (!(!this.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("鋦").toString());
        }
        if (this.bufferField.size() == 0 && this.source.X0(this.bufferField, 8192) == -1) {
            return -1L;
        }
        return this.bufferField.X0(sink, Math.min(byteCount, this.bufferField.size()));
    }

    @Override // okio.o
    public long Y0() {
        h1(8L);
        return this.bufferField.Y0();
    }

    @Override // okio.o
    public long Z0(@d5.d m0 sink) {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("鋨"));
        long j5 = 0;
        while (this.source.X0(this.bufferField, 8192) != -1) {
            long e6 = this.bufferField.e();
            if (e6 > 0) {
                j5 += e6;
                sink.t0(this.bufferField, e6);
            }
        }
        if (this.bufferField.size() <= 0) {
            return j5;
        }
        long size = j5 + this.bufferField.size();
        m mVar = this.bufferField;
        sink.t0(mVar, mVar.size());
        return size;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        r1 = new java.lang.StringBuilder(com.flashget.kidsdownloader.ProtectedSandApp.s("鋩"));
        r2 = kotlin.text.d.a(16);
        r2 = kotlin.text.d.a(r2);
        r2 = java.lang.Integer.toString(r8, r2);
        kotlin.jvm.internal.l0.o(r2, com.flashget.kidsdownloader.ProtectedSandApp.s("鋪"));
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
    public long a0() {
        /*
            r10 = this;
            r0 = 1
            r10.h1(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r10.C0(r6)
            if (r8 == 0) goto L5e
            okio.m r8 = r10.bufferField
            byte r8 = r8.b0(r4)
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
            java.lang.String r2 = "鋩"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
            r1.<init>(r2)
            r2 = 16
            int r2 = kotlin.text.c.a(r2)
            int r2 = kotlin.text.c.a(r2)
            java.lang.String r2 = java.lang.Integer.toString(r8, r2)
            java.lang.String r3 = "鋪"
            java.lang.String r3 = com.flashget.kidsdownloader.ProtectedSandApp.s(r3)
            kotlin.jvm.internal.l0.o(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L5e:
            okio.m r0 = r10.bufferField
            long r0 = r0.a0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.i0.a0():long");
    }

    @Override // okio.o
    @d5.d
    public String c0(long limit) {
        if (!(limit >= 0)) {
            throw new IllegalArgumentException(com.bumptech.glide.load.resource.bitmap.p0.a(ProtectedSandApp.s("鋮"), limit).toString());
        }
        long j5 = limit == Long.MAX_VALUE ? Long.MAX_VALUE : limit + 1;
        byte b6 = (byte) 10;
        long T = T(b6, 0L, j5);
        if (T != -1) {
            return v4.a.b0(this.bufferField, T);
        }
        if (j5 < Long.MAX_VALUE && C0(j5) && this.bufferField.b0(j5 - 1) == ((byte) 13) && C0(1 + j5) && this.bufferField.b0(j5) == b6) {
            return v4.a.b0(this.bufferField, j5);
        }
        m mVar = new m();
        m mVar2 = this.bufferField;
        mVar2.o(mVar, 0L, Math.min(32, mVar2.size()));
        throw new EOFException(ProtectedSandApp.s("鋫") + Math.min(this.bufferField.size(), limit) + ProtectedSandApp.s("鋬") + mVar.x0().C() + ProtectedSandApp.s("鋭"));
    }

    @Override // okio.o0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.source.close();
        this.bufferField.c();
    }

    @Override // okio.o
    public long e1(@d5.d p targetBytes, long fromIndex) {
        kotlin.jvm.internal.l0.p(targetBytes, ProtectedSandApp.s("鋯"));
        if (!(!this.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("鋰").toString());
        }
        while (true) {
            long e12 = this.bufferField.e1(targetBytes, fromIndex);
            if (e12 != -1) {
                return e12;
            }
            long size = this.bufferField.size();
            if (this.source.X0(this.bufferField, 8192) == -1) {
                return -1L;
            }
            fromIndex = Math.max(fromIndex, size);
        }
    }

    @Override // okio.o
    @d5.d
    /* renamed from: f, reason: from getter */
    public m getBufferField() {
        return this.bufferField;
    }

    @Override // okio.o0
    @d5.d
    /* renamed from: h */
    public q0 getTimeout() {
        return this.source.getTimeout();
    }

    @Override // okio.o
    public void h1(long j5) {
        if (!C0(j5)) {
            throw new EOFException();
        }
    }

    @Override // okio.o
    @d5.d
    public m i() {
        return this.bufferField;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    @Override // okio.o
    public long l1(byte b6) {
        return T(b6, 0L, Long.MAX_VALUE);
    }

    @Override // okio.o
    public long o1() {
        byte b02;
        int a6;
        int a7;
        h1(1L);
        int i5 = 0;
        while (true) {
            int i6 = i5 + 1;
            if (!C0(i6)) {
                break;
            }
            b02 = this.bufferField.b0(i5);
            if ((b02 < ((byte) 48) || b02 > ((byte) 57)) && ((b02 < ((byte) 97) || b02 > ((byte) 102)) && (b02 < ((byte) 65) || b02 > ((byte) 70)))) {
                break;
            }
            i5 = i6;
        }
        if (i5 == 0) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("鋱"));
            a6 = kotlin.text.d.a(16);
            a7 = kotlin.text.d.a(a6);
            String num = Integer.toString(b02, a7);
            kotlin.jvm.internal.l0.o(num, ProtectedSandApp.s("鋲"));
            sb.append(num);
            throw new NumberFormatException(sb.toString());
        }
        return this.bufferField.o1();
    }

    @Override // okio.o
    @d5.d
    public InputStream p1() {
        return new a();
    }

    @Override // okio.o
    @d5.d
    public o peek() {
        return c0.c(new f0(this));
    }

    @Override // okio.o
    @d5.d
    public String q(long byteCount) {
        h1(byteCount);
        return this.bufferField.q(byteCount);
    }

    @Override // okio.o
    public boolean q0(long offset, @d5.d p bytes) {
        kotlin.jvm.internal.l0.p(bytes, ProtectedSandApp.s("鋳"));
        return I0(offset, bytes, 0, bytes.i0());
    }

    @Override // okio.o
    @d5.d
    public String r0(@d5.d Charset charset) {
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("鋴"));
        this.bufferField.v0(this.source);
        return this.bufferField.r0(charset);
    }

    @Override // okio.o
    public int r1(@d5.d d0 options) {
        kotlin.jvm.internal.l0.p(options, ProtectedSandApp.s("鋵"));
        if (!(!this.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("鋶").toString());
        }
        while (true) {
            int d02 = v4.a.d0(this.bufferField, options, true);
            if (d02 != -2) {
                if (d02 != -1) {
                    this.bufferField.skip(options.getByteStrings()[d02].i0());
                    return d02;
                }
            } else if (this.source.X0(this.bufferField, 8192) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // okio.o
    public int read(@d5.d byte[] sink) {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("鋸"));
        return read(sink, 0, sink.length);
    }

    @Override // okio.o
    public byte readByte() {
        h1(1L);
        return this.bufferField.readByte();
    }

    @Override // okio.o
    public void readFully(@d5.d byte[] bArr) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("鋺"));
        try {
            h1(bArr.length);
            this.bufferField.readFully(bArr);
        } catch (EOFException e6) {
            int i5 = 0;
            while (this.bufferField.size() > 0) {
                m mVar = this.bufferField;
                int read = mVar.read(bArr, i5, (int) mVar.size());
                if (read == -1) {
                    throw new AssertionError();
                }
                i5 += read;
            }
            throw e6;
        }
    }

    @Override // okio.o
    public int readInt() {
        h1(4L);
        return this.bufferField.readInt();
    }

    @Override // okio.o
    public long readLong() {
        h1(8L);
        return this.bufferField.readLong();
    }

    @Override // okio.o
    public short readShort() {
        h1(2L);
        return this.bufferField.readShort();
    }

    @Override // okio.o
    public int s0() {
        h1(1L);
        byte b02 = this.bufferField.b0(0L);
        if ((b02 & 224) == 192) {
            h1(2L);
        } else if ((b02 & 240) == 224) {
            h1(3L);
        } else if ((b02 & 248) == 240) {
            h1(4L);
        }
        return this.bufferField.s0();
    }

    @Override // okio.o
    public void skip(long j5) {
        if (!(!this.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("鋻").toString());
        }
        while (j5 > 0) {
            if (this.bufferField.size() == 0 && this.source.X0(this.bufferField, 8192) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j5, this.bufferField.size());
            this.bufferField.skip(min);
            j5 -= min;
        }
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("鋼") + this.source + ')';
    }

    @Override // okio.o
    public long u(@d5.d p bytes, long fromIndex) {
        kotlin.jvm.internal.l0.p(bytes, ProtectedSandApp.s("鋽"));
        if (!(!this.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("鋾").toString());
        }
        while (true) {
            long u5 = this.bufferField.u(bytes, fromIndex);
            if (u5 != -1) {
                return u5;
            }
            long size = this.bufferField.size();
            if (this.source.X0(this.bufferField, 8192) == -1) {
                return -1L;
            }
            fromIndex = Math.max(fromIndex, (size - bytes.i0()) + 1);
        }
    }

    @Override // okio.o
    @d5.d
    public p v(long byteCount) {
        h1(byteCount);
        return this.bufferField.v(byteCount);
    }

    @Override // okio.o
    @d5.d
    public p x0() {
        this.bufferField.v0(this.source);
        return this.bufferField.x0();
    }

    @Override // okio.o
    public int read(@d5.d byte[] sink, int offset, int byteCount) {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("鋹"));
        long j5 = byteCount;
        j.e(sink.length, offset, j5);
        if (this.bufferField.size() == 0 && this.source.X0(this.bufferField, 8192) == -1) {
            return -1;
        }
        return this.bufferField.read(sink, offset, (int) Math.min(j5, this.bufferField.size()));
    }

    /* compiled from: RealBufferedSource.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\r"}, d2 = {"okio/i0$a", "Ljava/io/InputStream;", "", "read", "", "data", "offset", "byteCount", "available", "Lkotlin/m2;", "close", "", "toString", "okio"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() {
            i0 i0Var = i0.this;
            if (i0Var.closed) {
                throw new IOException(ProtectedSandApp.s("栳"));
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
                throw new IOException(ProtectedSandApp.s("栴"));
            }
            if (i0Var.bufferField.size() == 0) {
                i0 i0Var2 = i0.this;
                if (i0Var2.source.X0(i0Var2.bufferField, 8192) == -1) {
                    return -1;
                }
            }
            return i0.this.bufferField.readByte() & UByte.f27220r;
        }

        @d5.d
        public String toString() {
            return i0.this + ProtectedSandApp.s("样");
        }

        @Override // java.io.InputStream
        public int read(@d5.d byte[] data, int offset, int byteCount) {
            kotlin.jvm.internal.l0.p(data, ProtectedSandApp.s("栵"));
            if (!i0.this.closed) {
                j.e(data.length, offset, byteCount);
                if (i0.this.bufferField.size() == 0) {
                    i0 i0Var = i0.this;
                    if (i0Var.source.X0(i0Var.bufferField, 8192) == -1) {
                        return -1;
                    }
                }
                return i0.this.bufferField.read(data, offset, byteCount);
            }
            throw new IOException(ProtectedSandApp.s("栶"));
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@d5.d ByteBuffer sink) {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("鋷"));
        if (this.bufferField.size() == 0 && this.source.X0(this.bufferField, 8192) == -1) {
            return -1;
        }
        return this.bufferField.read(sink);
    }
}
