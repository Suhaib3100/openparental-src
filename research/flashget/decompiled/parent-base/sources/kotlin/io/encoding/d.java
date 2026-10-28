package kotlin.io.encoding;

import androidx.collection.n1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Base64IOStream.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u0019J'\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001e\u0010\u0014R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010#R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010#R\u0014\u0010'\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010&R\u0014\u0010(\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010&R\u0014\u0010*\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010&R\u0016\u0010-\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0014\u00100\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0019¨\u00061"}, d2 = {"Lkotlin/io/encoding/d;", "Ljava/io/InputStream;", "input", "Lkotlin/io/encoding/a;", "base64", "<init>", "(Ljava/io/InputStream;Lkotlin/io/encoding/a;)V", "", "dst", "", "dstOffset", "dstEndIndex", "symbolBufferLength", "b", "([BIII)I", "length", "Lkotlin/k2;", "a", "([BII)V", "f", "()V", "g", "d", "(I)I", "e", "()I", "read", "destination", "offset", "([BII)I", "close", "Ljava/io/InputStream;", "c", "Lkotlin/io/encoding/a;", "", "Z", "isClosed", "isEOF", "[B", "singleByteBuffer", "symbolBuffer", "h", "byteBuffer", "i", "I", "byteBufferStartIndex", "j", "byteBufferEndIndex", "byteBufferLength", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@f
/* loaded from: classes7.dex */
final class d extends InputStream {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final InputStream input;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final a base64;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isClosed;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isEOF;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    private final byte[] singleByteBuffer;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l
    private final byte[] symbolBuffer;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @l
    private final byte[] byteBuffer;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int byteBufferStartIndex;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int byteBufferEndIndex;

    public d(@l InputStream inputStream, @l a aVar) {
        l0.p(inputStream, ProtectedSandApp.s("揔\u0001"));
        l0.p(aVar, ProtectedSandApp.s("揕\u0001"));
        this.input = inputStream;
        this.base64 = aVar;
        this.singleByteBuffer = new byte[1];
        this.symbolBuffer = new byte[1024];
        this.byteBuffer = new byte[1024];
    }

    private final void a(byte[] dst, int dstOffset, int length) {
        byte[] bArr = this.byteBuffer;
        int i4 = this.byteBufferStartIndex;
        kotlin.collections.l.v0(bArr, dst, dstOffset, i4, i4 + length);
        this.byteBufferStartIndex += length;
        f();
    }

    private final int b(byte[] dst, int dstOffset, int dstEndIndex, int symbolBufferLength) {
        int i4 = this.byteBufferEndIndex;
        this.byteBufferEndIndex = i4 + this.base64.n(this.symbolBuffer, this.byteBuffer, i4, 0, symbolBufferLength);
        int min = Math.min(c(), dstEndIndex - dstOffset);
        a(dst, dstOffset, min);
        g();
        return min;
    }

    private final int c() {
        return this.byteBufferEndIndex - this.byteBufferStartIndex;
    }

    private final int d(int symbolBufferLength) {
        this.symbolBuffer[symbolBufferLength] = a.f75126h;
        if ((symbolBufferLength & 3) != 2) {
            return symbolBufferLength + 1;
        }
        int e4 = e();
        if (e4 >= 0) {
            this.symbolBuffer[symbolBufferLength + 1] = (byte) e4;
        }
        return symbolBufferLength + 2;
    }

    private final int e() {
        int read;
        if (!this.base64.getIsMimeScheme()) {
            return this.input.read();
        }
        do {
            read = this.input.read();
            if (read == -1) {
                break;
            }
        } while (!c.g(read));
        return read;
    }

    private final void f() {
        if (this.byteBufferStartIndex == this.byteBufferEndIndex) {
            this.byteBufferStartIndex = 0;
            this.byteBufferEndIndex = 0;
        }
    }

    private final void g() {
        byte[] bArr = this.byteBuffer;
        int length = bArr.length;
        int i4 = this.byteBufferEndIndex;
        if ((this.symbolBuffer.length / 4) * 3 > length - i4) {
            kotlin.collections.l.v0(bArr, bArr, 0, this.byteBufferStartIndex, i4);
            this.byteBufferEndIndex -= this.byteBufferStartIndex;
            this.byteBufferStartIndex = 0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        this.input.close();
    }

    @Override // java.io.InputStream
    public int read() {
        int i4 = this.byteBufferStartIndex;
        if (i4 < this.byteBufferEndIndex) {
            int i5 = this.byteBuffer[i4] & 255;
            this.byteBufferStartIndex = i4 + 1;
            f();
            return i5;
        }
        int read = read(this.singleByteBuffer, 0, 1);
        if (read == -1) {
            return -1;
        }
        if (read == 1) {
            return this.singleByteBuffer[0] & 255;
        }
        throw new IllegalStateException(ProtectedSandApp.s("揖\u0001"));
    }

    @Override // java.io.InputStream
    public int read(@l byte[] destination, int offset, int length) {
        int i4;
        boolean z4;
        boolean z5;
        l0.p(destination, ProtectedSandApp.s("揗\u0001"));
        if (offset >= 0 && length >= 0 && (i4 = offset + length) <= destination.length) {
            if (!this.isClosed) {
                if (this.isEOF) {
                    return -1;
                }
                if (length == 0) {
                    return 0;
                }
                if (c() >= length) {
                    a(destination, offset, length);
                    return length;
                }
                int c5 = (((length - c()) + 2) / 3) * 4;
                int i5 = offset;
                while (true) {
                    z4 = this.isEOF;
                    if (z4 || c5 <= 0) {
                        break;
                    }
                    int min = Math.min(this.symbolBuffer.length, c5);
                    int i6 = 0;
                    while (true) {
                        z5 = this.isEOF;
                        if (z5 || i6 >= min) {
                            break;
                        }
                        int e4 = e();
                        if (e4 == -1) {
                            this.isEOF = true;
                        } else if (e4 != 61) {
                            this.symbolBuffer[i6] = (byte) e4;
                            i6++;
                        } else {
                            i6 = d(i6);
                            this.isEOF = true;
                        }
                    }
                    if (!z5 && i6 != min) {
                        throw new IllegalStateException(ProtectedSandApp.s("揘\u0001"));
                    }
                    c5 -= i6;
                    i5 += b(destination, i5, i4, i6);
                }
                if (i5 == offset && z4) {
                    return -1;
                }
                return i5 - offset;
            }
            throw new IOException(ProtectedSandApp.s("揙\u0001"));
        }
        StringBuilder a5 = n1.a(ProtectedSandApp.s("揚\u0001"), offset, ProtectedSandApp.s("換\u0001"), length, ProtectedSandApp.s("揜\u0001"));
        a5.append(destination.length);
        throw new IndexOutOfBoundsException(a5.toString());
    }
}
