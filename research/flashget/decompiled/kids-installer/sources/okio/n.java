package okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;

/* compiled from: BufferedSink.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H'J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H&J \u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH&J \u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000fH&J\u0018\u0010\u0012\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0010H&J\u0010\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H&J \u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH&J\u0010\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\bH&J\u0018\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001bH&J(\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH&J\u0010\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\bH&J\u0010\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\bH&J\u0010\u0010#\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\bH&J\u0010\u0010%\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\bH&J\u0010\u0010&\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\bH&J\u0010\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0010H&J\u0010\u0010)\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0010H&J\u0010\u0010*\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0010H&J\u0010\u0010+\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0010H&J\b\u0010-\u001a\u00020,H&J\b\u0010.\u001a\u00020\u0000H&J\b\u0010/\u001a\u00020\u0000H&J\b\u00101\u001a\u000200H&R\u0014\u00103\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u00102¨\u00064"}, d2 = {"Lokio/n;", "Lokio/m0;", "Ljava/nio/channels/WritableByteChannel;", "Lokio/m;", "f", "Lokio/p;", "byteString", "S0", "", "offset", "byteCount", "A", "", "source", "write", "Lokio/o0;", "", "v0", "D0", "", "string", "j0", "beginIndex", "endIndex", "u0", "codePoint", "y", "Ljava/nio/charset/Charset;", "charset", "z0", "d1", "b", "writeByte", "s", "writeShort", "h0", "i", "writeInt", "L", "v", "writeLong", "E", "j1", "w0", "Lkotlin/m2;", "flush", "x", "Y", "Ljava/io/OutputStream;", "k1", "()Lokio/m;", "buffer", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public interface n extends m0, WritableByteChannel {
    @d5.d
    n A(@d5.d p byteString, int offset, int byteCount) throws IOException;

    @d5.d
    n D0(@d5.d o0 source, long byteCount) throws IOException;

    @d5.d
    n E(long v5) throws IOException;

    @d5.d
    n L(int i5) throws IOException;

    @d5.d
    n S0(@d5.d p byteString) throws IOException;

    @d5.d
    n Y() throws IOException;

    @d5.d
    n d1(@d5.d String string, int beginIndex, int endIndex, @d5.d Charset charset) throws IOException;

    @Deprecated(level = DeprecationLevel.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @ReplaceWith(expression = "buffer", imports = {}))
    @d5.d
    /* renamed from: f */
    m getBufferField();

    @Override // okio.m0, java.io.Flushable
    void flush() throws IOException;

    @d5.d
    n h0(int s5) throws IOException;

    @d5.d
    m i();

    @d5.d
    n j0(@d5.d String string) throws IOException;

    @d5.d
    n j1(long v5) throws IOException;

    @d5.d
    OutputStream k1();

    @d5.d
    n u0(@d5.d String string, int beginIndex, int endIndex) throws IOException;

    long v0(@d5.d o0 source) throws IOException;

    @d5.d
    n w0(long v5) throws IOException;

    @d5.d
    n write(@d5.d byte[] source) throws IOException;

    @d5.d
    n write(@d5.d byte[] source, int offset, int byteCount) throws IOException;

    @d5.d
    n writeByte(int b6) throws IOException;

    @d5.d
    n writeInt(int i5) throws IOException;

    @d5.d
    n writeLong(long v5) throws IOException;

    @d5.d
    n writeShort(int s5) throws IOException;

    @d5.d
    n x() throws IOException;

    @d5.d
    n y(int codePoint) throws IOException;

    @d5.d
    n z0(@d5.d String string, @d5.d Charset charset) throws IOException;
}
