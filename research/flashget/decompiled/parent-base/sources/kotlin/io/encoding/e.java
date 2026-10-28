package kotlin.io.encoding;

import androidx.collection.n1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Base64IOStream.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0010J\u000f\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR\u0016\u0010!\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u0016\u0010(\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010 ¨\u0006)"}, d2 = {"Lkotlin/io/encoding/e;", "Ljava/io/OutputStream;", "output", "Lkotlin/io/encoding/a;", "base64", "<init>", "(Ljava/io/OutputStream;Lkotlin/io/encoding/a;)V", "", "source", "", "startIndex", "endIndex", "b", "([BII)I", "Lkotlin/k2;", "c", "()V", "d", "a", "write", "(I)V", "offset", "length", "([BII)V", "flush", "close", "Ljava/io/OutputStream;", "Lkotlin/io/encoding/a;", "", "Z", "isClosed", "e", "I", "lineLength", "f", "[B", "symbolBuffer", "g", "byteBuffer", "h", "byteBufferLength", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@f
/* loaded from: classes7.dex */
final class e extends OutputStream {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final OutputStream output;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final a base64;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isClosed;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int lineLength;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    private final byte[] symbolBuffer;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l
    private final byte[] byteBuffer;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int byteBufferLength;

    public e(@l OutputStream outputStream, @l a aVar) {
        l0.p(outputStream, ProtectedSandApp.s("揝\u0001"));
        l0.p(aVar, ProtectedSandApp.s("揞\u0001"));
        this.output = outputStream;
        this.base64 = aVar;
        this.lineLength = aVar.getIsMimeScheme() ? 76 : -1;
        this.symbolBuffer = new byte[1024];
        this.byteBuffer = new byte[3];
    }

    private final void a() {
        if (this.isClosed) {
            throw new IOException(ProtectedSandApp.s("揟\u0001"));
        }
    }

    private final int b(byte[] source, int startIndex, int endIndex) {
        int min = Math.min(3 - this.byteBufferLength, endIndex - startIndex);
        kotlin.collections.l.v0(source, this.byteBuffer, this.byteBufferLength, startIndex, startIndex + min);
        int i4 = this.byteBufferLength + min;
        this.byteBufferLength = i4;
        if (i4 == 3) {
            c();
        }
        return min;
    }

    private final void c() {
        if (d(this.byteBuffer, 0, this.byteBufferLength) != 4) {
            throw new IllegalStateException(ProtectedSandApp.s("揠\u0001"));
        }
        this.byteBufferLength = 0;
    }

    private final int d(byte[] source, int startIndex, int endIndex) {
        int t4 = this.base64.t(source, this.symbolBuffer, 0, startIndex, endIndex);
        if (this.lineLength == 0) {
            OutputStream outputStream = this.output;
            a.INSTANCE.getClass();
            outputStream.write(a.f75129k);
            this.lineLength = 76;
            if (t4 > 76) {
                throw new IllegalStateException(ProtectedSandApp.s("揠\u0001"));
            }
        }
        this.output.write(this.symbolBuffer, 0, t4);
        this.lineLength -= t4;
        return t4;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        if (this.byteBufferLength != 0) {
            c();
        }
        this.output.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        a();
        this.output.flush();
    }

    @Override // java.io.OutputStream
    public void write(int b5) {
        a();
        byte[] bArr = this.byteBuffer;
        int i4 = this.byteBufferLength;
        int i5 = i4 + 1;
        this.byteBufferLength = i5;
        bArr[i4] = (byte) b5;
        if (i5 == 3) {
            c();
        }
    }

    @Override // java.io.OutputStream
    public void write(@l byte[] source, int offset, int length) {
        int i4;
        l0.p(source, ProtectedSandApp.s("握\u0001"));
        a();
        if (offset < 0 || length < 0 || (i4 = offset + length) > source.length) {
            StringBuilder a5 = n1.a(ProtectedSandApp.s("揢\u0001"), offset, ProtectedSandApp.s("揣\u0001"), length, ProtectedSandApp.s("揤\u0001"));
            a5.append(source.length);
            throw new IndexOutOfBoundsException(a5.toString());
        }
        if (length == 0) {
            return;
        }
        int i5 = this.byteBufferLength;
        String s4 = ProtectedSandApp.s("揠\u0001");
        if (i5 < 3) {
            if (i5 != 0) {
                offset += b(source, offset, i4);
                if (this.byteBufferLength != 0) {
                    return;
                }
            }
            while (offset + 3 <= i4) {
                int min = Math.min((this.base64.getIsMimeScheme() ? this.lineLength : this.symbolBuffer.length) / 4, (i4 - offset) / 3);
                int i6 = (min * 3) + offset;
                if (d(source, offset, i6) != min * 4) {
                    throw new IllegalStateException(s4);
                }
                offset = i6;
            }
            kotlin.collections.l.v0(source, this.byteBuffer, 0, offset, i4);
            this.byteBufferLength = i4 - offset;
            return;
        }
        throw new IllegalStateException(s4);
    }
}
