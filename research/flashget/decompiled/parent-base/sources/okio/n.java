package okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.x0;

/* compiled from: BufferedSink.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&¢\u0006\u0004\b\u0011\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u0015H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010 \u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nH&¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\nH&¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020%H&¢\u0006\u0004\b'\u0010(J/\u0010)\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010&\u001a\u00020%H&¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\nH&¢\u0006\u0004\b,\u0010$J\u0017\u0010.\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\nH&¢\u0006\u0004\b.\u0010$J\u0017\u0010/\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\nH&¢\u0006\u0004\b/\u0010$J\u0017\u00101\u001a\u00020\u00002\u0006\u00100\u001a\u00020\nH&¢\u0006\u0004\b1\u0010$J\u0017\u00102\u001a\u00020\u00002\u0006\u00100\u001a\u00020\nH&¢\u0006\u0004\b2\u0010$J\u0017\u00104\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0015H&¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0015H&¢\u0006\u0004\b6\u00105J\u0017\u00107\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0015H&¢\u0006\u0004\b7\u00105J\u0017\u00108\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0015H&¢\u0006\u0004\b8\u00105J\u000f\u0010:\u001a\u000209H&¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0000H&¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0000H&¢\u0006\u0004\b>\u0010=J\u000f\u0010@\u001a\u00020?H&¢\u0006\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u0005¨\u0006D"}, d2 = {"Lokio/n;", "Lokio/m0;", "Ljava/nio/channels/WritableByteChannel;", "Lokio/m;", "r", "()Lokio/m;", "Lokio/p;", "byteString", "t3", "(Lokio/p;)Lokio/n;", "", "offset", "byteCount", "h2", "(Lokio/p;II)Lokio/n;", "", "source", "write", "([B)Lokio/n;", "([BII)Lokio/n;", "Lokio/o0;", "", "b1", "(Lokio/o0;)J", "f3", "(Lokio/o0;J)Lokio/n;", "", "string", "Q0", "(Ljava/lang/String;)Lokio/n;", "beginIndex", "endIndex", "a1", "(Ljava/lang/String;II)Lokio/n;", "codePoint", "f0", "(I)Lokio/n;", "Ljava/nio/charset/Charset;", "charset", "c3", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lokio/n;", "G1", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Lokio/n;", "b", "writeByte", "s", "writeShort", "J2", "i", "writeInt", "s2", "v", "writeLong", "(J)Lokio/n;", "i0", "N1", "a3", "Lkotlin/k2;", "flush", "()V", "d0", "()Lokio/n;", "y0", "Ljava/io/OutputStream;", "G3", "()Ljava/io/OutputStream;", "getBuffer", "buffer", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public interface n extends m0, WritableByteChannel {
    @fg.l
    n G1(@fg.l String string, int beginIndex, int endIndex, @fg.l Charset charset) throws IOException;

    @fg.l
    OutputStream G3();

    @fg.l
    n J2(int s4) throws IOException;

    @fg.l
    n N1(long v4) throws IOException;

    @fg.l
    n Q0(@fg.l String string) throws IOException;

    @fg.l
    n a1(@fg.l String string, int beginIndex, int endIndex) throws IOException;

    @fg.l
    n a3(long v4) throws IOException;

    long b1(@fg.l o0 source) throws IOException;

    @fg.l
    n c3(@fg.l String string, @fg.l Charset charset) throws IOException;

    @fg.l
    n d0() throws IOException;

    @fg.l
    n f0(int codePoint) throws IOException;

    @fg.l
    n f3(@fg.l o0 source, long byteCount) throws IOException;

    @Override // okio.m0, java.io.Flushable
    void flush() throws IOException;

    @fg.l
    /* renamed from: getBuffer */
    m getBufferField();

    @fg.l
    n h2(@fg.l p byteString, int offset, int byteCount) throws IOException;

    @fg.l
    n i0(long v4) throws IOException;

    @fg.l
    @kotlin.k(level = kotlin.m.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @x0(expression = "buffer", imports = {}))
    m r();

    @fg.l
    n s2(int i4) throws IOException;

    @fg.l
    n t3(@fg.l p byteString) throws IOException;

    @fg.l
    n write(@fg.l byte[] source) throws IOException;

    @fg.l
    n write(@fg.l byte[] source, int offset, int byteCount) throws IOException;

    @fg.l
    n writeByte(int b5) throws IOException;

    @fg.l
    n writeInt(int i4) throws IOException;

    @fg.l
    n writeLong(long v4) throws IOException;

    @fg.l
    n writeShort(int s4) throws IOException;

    @fg.l
    n y0() throws IOException;
}
