package okio;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;

/* compiled from: BufferedSource.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H'J\b\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\r\u001a\u00020\fH&J\b\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0010\u001a\u00020\u000eH&J\b\u0010\u0012\u001a\u00020\u0011H&J\b\u0010\u0013\u001a\u00020\u0011H&J\b\u0010\u0014\u001a\u00020\u0007H&J\b\u0010\u0015\u001a\u00020\u0007H&J\b\u0010\u0016\u001a\u00020\u0007H&J\b\u0010\u0017\u001a\u00020\u0007H&J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\u001a\u001a\u00020\u0019H&J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH&J\b\u0010 \u001a\u00020\u001fH&J\u0010\u0010!\u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010#\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u001fH&J\u0010\u0010$\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u001fH&J \u0010#\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0011H&J\u0018\u0010&\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010(\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020'H&J\b\u0010*\u001a\u00020)H&J\u0010\u0010+\u001a\u00020)2\u0006\u0010\b\u001a\u00020\u0007H&J\n\u0010,\u001a\u0004\u0018\u00010)H&J\b\u0010-\u001a\u00020)H&J\u0010\u0010/\u001a\u00020)2\u0006\u0010.\u001a\u00020\u0007H&J\b\u00100\u001a\u00020\u0011H&J\u0010\u00103\u001a\u00020)2\u0006\u00102\u001a\u000201H&J\u0018\u00104\u001a\u00020)2\u0006\u0010\b\u001a\u00020\u00072\u0006\u00102\u001a\u000201H&J\u0010\u00106\u001a\u00020\u00072\u0006\u00105\u001a\u00020\fH&J\u0018\u00108\u001a\u00020\u00072\u0006\u00105\u001a\u00020\f2\u0006\u00107\u001a\u00020\u0007H&J \u0010:\u001a\u00020\u00072\u0006\u00105\u001a\u00020\f2\u0006\u00107\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u0007H&J\u0010\u0010<\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u0019H&J\u0018\u0010=\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u0007H&J\u0010\u0010?\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u0019H&J\u0018\u0010@\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u0007H&J\u0018\u0010A\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u0019H&J(\u0010C\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u00192\u0006\u0010B\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0011H&J\b\u0010D\u001a\u00020\u0000H&J\b\u0010F\u001a\u00020EH&R\u0014\u0010I\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lokio/o;", "Lokio/o0;", "Ljava/nio/channels/ReadableByteChannel;", "Lokio/m;", "f", "", "M", "", "byteCount", "Lkotlin/m2;", "h1", "C0", "", "readByte", "", "readShort", "V0", "", "readInt", "H0", "readLong", "Y0", "a0", "o1", "skip", "Lokio/p;", "x0", "v", "Lokio/d0;", "options", "r1", "", "I", "K0", "sink", "read", "readFully", "offset", "S", "Lokio/m0;", "Z0", "", "L0", "q", "W", "G0", "limit", "c0", "s0", "Ljava/nio/charset/Charset;", "charset", "r0", "Q0", "b", "l1", "fromIndex", "Q", "toIndex", "T", "bytes", "K", "u", "targetBytes", "V", "e1", "q0", "bytesOffset", "I0", "peek", "Ljava/io/InputStream;", "p1", "i", "()Lokio/m;", "buffer", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public interface o extends o0, ReadableByteChannel {
    boolean C0(long byteCount) throws IOException;

    @d5.d
    String G0() throws IOException;

    int H0() throws IOException;

    @d5.d
    byte[] I() throws IOException;

    boolean I0(long offset, @d5.d p bytes, int bytesOffset, int byteCount) throws IOException;

    long K(@d5.d p bytes) throws IOException;

    @d5.d
    byte[] K0(long byteCount) throws IOException;

    @d5.d
    String L0() throws IOException;

    boolean M() throws IOException;

    long Q(byte b6, long fromIndex) throws IOException;

    @d5.d
    String Q0(long byteCount, @d5.d Charset charset) throws IOException;

    void S(@d5.d m mVar, long j5) throws IOException;

    long T(byte b6, long fromIndex, long toIndex) throws IOException;

    long V(@d5.d p targetBytes) throws IOException;

    short V0() throws IOException;

    @d5.e
    String W() throws IOException;

    long Y0() throws IOException;

    long Z0(@d5.d m0 sink) throws IOException;

    long a0() throws IOException;

    @d5.d
    String c0(long limit) throws IOException;

    long e1(@d5.d p targetBytes, long fromIndex) throws IOException;

    @Deprecated(level = DeprecationLevel.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @ReplaceWith(expression = "buffer", imports = {}))
    @d5.d
    m f();

    void h1(long j5) throws IOException;

    @d5.d
    m i();

    long l1(byte b6) throws IOException;

    long o1() throws IOException;

    @d5.d
    InputStream p1();

    @d5.d
    o peek();

    @d5.d
    String q(long byteCount) throws IOException;

    boolean q0(long offset, @d5.d p bytes) throws IOException;

    @d5.d
    String r0(@d5.d Charset charset) throws IOException;

    int r1(@d5.d d0 options) throws IOException;

    int read(@d5.d byte[] sink) throws IOException;

    int read(@d5.d byte[] sink, int offset, int byteCount) throws IOException;

    byte readByte() throws IOException;

    void readFully(@d5.d byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    int s0() throws IOException;

    void skip(long j5) throws IOException;

    long u(@d5.d p bytes, long fromIndex) throws IOException;

    @d5.d
    p v(long byteCount) throws IOException;

    @d5.d
    p x0() throws IOException;
}
