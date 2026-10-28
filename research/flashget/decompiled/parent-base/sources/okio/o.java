package okio;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.x0;

/* compiled from: BufferedSource.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H'¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H&¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H&¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\tH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\tH&¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\tH&¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\tH&¢\u0006\u0004\b\u001f\u0010\u001cJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b \u0010\rJ\u000f\u0010\"\u001a\u00020!H&¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020!2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00172\u0006\u0010'\u001a\u00020&H&¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H&¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020*2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00172\u0006\u0010/\u001a\u00020*H&¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020*H&¢\u0006\u0004\b2\u00103J'\u00100\u001a\u00020\u00172\u0006\u0010/\u001a\u00020*2\u0006\u00104\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u0017H&¢\u0006\u0004\b0\u00105J\u001f\u00106\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\t2\u0006\u0010/\u001a\u000208H&¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020;H&¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020;2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b>\u0010?J\u0011\u0010@\u001a\u0004\u0018\u00010;H&¢\u0006\u0004\b@\u0010=J\u000f\u0010A\u001a\u00020;H&¢\u0006\u0004\bA\u0010=J\u0017\u0010C\u001a\u00020;2\u0006\u0010B\u001a\u00020\tH&¢\u0006\u0004\bC\u0010?J\u000f\u0010D\u001a\u00020\u0017H&¢\u0006\u0004\bD\u0010\u0019J\u0017\u0010G\u001a\u00020;2\u0006\u0010F\u001a\u00020EH&¢\u0006\u0004\bG\u0010HJ\u001f\u0010I\u001a\u00020;2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010F\u001a\u00020EH&¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020\t2\u0006\u0010K\u001a\u00020\u0010H&¢\u0006\u0004\bL\u0010MJ\u001f\u0010O\u001a\u00020\t2\u0006\u0010K\u001a\u00020\u00102\u0006\u0010N\u001a\u00020\tH&¢\u0006\u0004\bO\u0010PJ'\u0010R\u001a\u00020\t2\u0006\u0010K\u001a\u00020\u00102\u0006\u0010N\u001a\u00020\t2\u0006\u0010Q\u001a\u00020\tH&¢\u0006\u0004\bR\u0010SJ\u0017\u0010U\u001a\u00020\t2\u0006\u0010T\u001a\u00020!H&¢\u0006\u0004\bU\u0010VJ\u001f\u0010W\u001a\u00020\t2\u0006\u0010T\u001a\u00020!2\u0006\u0010N\u001a\u00020\tH&¢\u0006\u0004\bW\u0010XJ\u0017\u0010Z\u001a\u00020\t2\u0006\u0010Y\u001a\u00020!H&¢\u0006\u0004\bZ\u0010VJ\u001f\u0010[\u001a\u00020\t2\u0006\u0010Y\u001a\u00020!2\u0006\u0010N\u001a\u00020\tH&¢\u0006\u0004\b[\u0010XJ\u001f\u0010\\\u001a\u00020\u00062\u0006\u00104\u001a\u00020\t2\u0006\u0010T\u001a\u00020!H&¢\u0006\u0004\b\\\u0010]J/\u0010_\u001a\u00020\u00062\u0006\u00104\u001a\u00020\t2\u0006\u0010T\u001a\u00020!2\u0006\u0010^\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u0017H&¢\u0006\u0004\b_\u0010`J\u000f\u0010a\u001a\u00020\u0000H&¢\u0006\u0004\ba\u0010bJ\u000f\u0010d\u001a\u00020cH&¢\u0006\u0004\bd\u0010eR\u0014\u0010g\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\bf\u0010\u0005¨\u0006h"}, d2 = {"Lokio/o;", "Lokio/o0;", "Ljava/nio/channels/ReadableByteChannel;", "Lokio/m;", "r", "()Lokio/m;", "", "t2", "()Z", "", "byteCount", "Lkotlin/k2;", "J1", "(J)V", "h1", "(J)Z", "", "readByte", "()B", "", "readShort", "()S", "v1", "", "readInt", "()I", "k3", "readLong", "()J", "z1", "y2", "H3", "skip", "Lokio/p;", "b3", "()Lokio/p;", "b2", "(J)Lokio/p;", "Lokio/d0;", "options", "K3", "(Lokio/d0;)I", "", "p2", "()[B", "q1", "(J)[B", "sink", "read", "([B)I", "readFully", "([B)V", "offset", "([BII)I", "t0", "(Lokio/m;J)V", "Lokio/m0;", "z3", "(Lokio/m0;)J", "", "n3", "()Ljava/lang/String;", "V1", "(J)Ljava/lang/String;", "x0", "m1", "limit", "D0", "Z2", "Ljava/nio/charset/Charset;", "charset", "X2", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "q3", "(JLjava/nio/charset/Charset;)Ljava/lang/String;", "b", "Q1", "(B)J", "fromIndex", "s0", "(BJ)J", "toIndex", "v0", "(BJJ)J", "bytes", "m0", "(Lokio/p;)J", "V", "(Lokio/p;J)J", "targetBytes", "w0", "I1", "T0", "(JLokio/p;)Z", "bytesOffset", "o1", "(JLokio/p;II)Z", "peek", "()Lokio/o;", "Ljava/io/InputStream;", "J3", "()Ljava/io/InputStream;", "getBuffer", "buffer", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public interface o extends o0, ReadableByteChannel {
    @fg.l
    String D0(long limit) throws IOException;

    long H3() throws IOException;

    long I1(@fg.l p targetBytes, long fromIndex) throws IOException;

    void J1(long byteCount) throws IOException;

    @fg.l
    InputStream J3();

    int K3(@fg.l d0 options) throws IOException;

    long Q1(byte b5) throws IOException;

    boolean T0(long offset, @fg.l p bytes) throws IOException;

    long V(@fg.l p bytes, long fromIndex) throws IOException;

    @fg.l
    String V1(long byteCount) throws IOException;

    @fg.l
    String X2(@fg.l Charset charset) throws IOException;

    int Z2() throws IOException;

    @fg.l
    p b2(long byteCount) throws IOException;

    @fg.l
    p b3() throws IOException;

    @fg.l
    m getBuffer();

    boolean h1(long byteCount) throws IOException;

    int k3() throws IOException;

    long m0(@fg.l p bytes) throws IOException;

    @fg.l
    String m1() throws IOException;

    @fg.l
    String n3() throws IOException;

    boolean o1(long offset, @fg.l p bytes, int bytesOffset, int byteCount) throws IOException;

    @fg.l
    byte[] p2() throws IOException;

    @fg.l
    o peek();

    @fg.l
    byte[] q1(long byteCount) throws IOException;

    @fg.l
    String q3(long byteCount, @fg.l Charset charset) throws IOException;

    @fg.l
    @kotlin.k(level = kotlin.m.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @x0(expression = "buffer", imports = {}))
    m r();

    int read(@fg.l byte[] sink) throws IOException;

    int read(@fg.l byte[] sink, int offset, int byteCount) throws IOException;

    byte readByte() throws IOException;

    void readFully(@fg.l byte[] sink) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    long s0(byte b5, long fromIndex) throws IOException;

    void skip(long byteCount) throws IOException;

    void t0(@fg.l m sink, long byteCount) throws IOException;

    boolean t2() throws IOException;

    long v0(byte b5, long fromIndex, long toIndex) throws IOException;

    short v1() throws IOException;

    long w0(@fg.l p targetBytes) throws IOException;

    @fg.m
    String x0() throws IOException;

    long y2() throws IOException;

    long z1() throws IOException;

    long z3(@fg.l m0 sink) throws IOException;
}
