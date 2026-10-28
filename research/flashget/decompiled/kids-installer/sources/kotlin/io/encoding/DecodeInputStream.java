package kotlin.io.encoding;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.collections.p;
import kotlin.jvm.internal.l0;

/* compiled from: Base64IOStream.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0002J(\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tH\u0002J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tH\u0002J\b\u0010\u001d\u001a\u00020\tH\u0016J \u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0016J\b\u0010 \u001a\u00020\tH\u0002J\b\u0010!\u001a\u00020\u0014H\u0002J\b\u0010\"\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lkotlin/io/encoding/DecodeInputStream;", "Ljava/io/InputStream;", "input", "base64", "Lkotlin/io/encoding/Base64;", "(Ljava/io/InputStream;Lkotlin/io/encoding/Base64;)V", "byteBuffer", "", "byteBufferEndIndex", "", "byteBufferLength", "getByteBufferLength", "()I", "byteBufferStartIndex", "isClosed", "", "isEOF", "singleByteBuffer", "symbolBuffer", "close", "", "copyByteBufferInto", "dst", "dstOffset", "length", "decodeSymbolBufferInto", "dstEndIndex", "symbolBufferLength", "handlePaddingSymbol", "read", "destination", "offset", "readNextSymbol", "resetByteBufferIfEmpty", "shiftByteBufferToStartIfNeeded", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalEncodingApi
/* renamed from: kotlin.io.encoding.d, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
final class DecodeInputStream extends InputStream {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final InputStream f23379o;

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    private final Base64 f23380p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f23381q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f23382r;

    /* renamed from: s, reason: collision with root package name */
    @d5.d
    private final byte[] f23383s;

    /* renamed from: t, reason: collision with root package name */
    @d5.d
    private final byte[] f23384t;

    /* renamed from: u, reason: collision with root package name */
    @d5.d
    private final byte[] f23385u;

    /* renamed from: v, reason: collision with root package name */
    private int f23386v;

    /* renamed from: w, reason: collision with root package name */
    private int f23387w;

    public DecodeInputStream(@d5.d InputStream inputStream, @d5.d Base64 base64) {
        l0.p(inputStream, ProtectedSandApp.s("㿐"));
        l0.p(base64, ProtectedSandApp.s("㿑"));
        this.f23379o = inputStream;
        this.f23380p = base64;
        this.f23383s = new byte[1];
        this.f23384t = new byte[1024];
        this.f23385u = new byte[1024];
    }

    private final void a(byte[] bArr, int i5, int i6) {
        byte[] bArr2 = this.f23385u;
        int i7 = this.f23386v;
        p.v0(bArr2, bArr, i5, i7, i7 + i6);
        this.f23386v += i6;
        g();
    }

    private final int b(byte[] bArr, int i5, int i6, int i7) {
        int i8 = this.f23387w;
        int n5 = i8 + this.f23380p.n(this.f23384t, this.f23385u, i8, 0, i7);
        this.f23387w = n5;
        int min = Math.min(n5 - this.f23386v, i6 - i5);
        a(bArr, i5, min);
        j();
        return min;
    }

    private final int c() {
        return this.f23387w - this.f23386v;
    }

    private final int d(int i5) {
        this.f23384t[i5] = Base64.f23367h;
        if ((i5 & 3) != 2) {
            return i5 + 1;
        }
        int e6 = e();
        if (e6 >= 0) {
            this.f23384t[i5 + 1] = (byte) e6;
        }
        return i5 + 2;
    }

    private final int e() {
        int read;
        if (!this.f23380p.getF23374b()) {
            return this.f23379o.read();
        }
        do {
            read = this.f23379o.read();
            if (read == -1) {
                break;
            }
        } while (!c.g(read));
        return read;
    }

    private final void g() {
        if (this.f23386v == this.f23387w) {
            this.f23386v = 0;
            this.f23387w = 0;
        }
    }

    private final void j() {
        byte[] bArr = this.f23385u;
        int length = bArr.length;
        int i5 = this.f23387w;
        if ((this.f23384t.length / 4) * 3 > length - i5) {
            p.v0(bArr, bArr, 0, this.f23386v, i5);
            this.f23387w -= this.f23386v;
            this.f23386v = 0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f23381q) {
            return;
        }
        this.f23381q = true;
        this.f23379o.close();
    }

    @Override // java.io.InputStream
    public int read() {
        int i5 = this.f23386v;
        if (i5 < this.f23387w) {
            int i6 = this.f23385u[i5] & UByte.f27220r;
            this.f23386v = i5 + 1;
            g();
            return i6;
        }
        int read = read(this.f23383s, 0, 1);
        if (read == -1) {
            return -1;
        }
        if (read == 1) {
            return this.f23383s[0] & UByte.f27220r;
        }
        throw new IllegalStateException(ProtectedSandApp.s("㿒").toString());
    }

    @Override // java.io.InputStream
    public int read(@d5.d byte[] destination, int offset, int length) {
        int i5;
        boolean z5;
        boolean z6;
        l0.p(destination, ProtectedSandApp.s("㿓"));
        if (offset >= 0 && length >= 0 && (i5 = offset + length) <= destination.length) {
            if (!this.f23381q) {
                if (this.f23382r) {
                    return -1;
                }
                if (length == 0) {
                    return 0;
                }
                int i6 = this.f23387w;
                int i7 = this.f23386v;
                if (i6 - i7 >= length) {
                    a(destination, offset, length);
                    return length;
                }
                int i8 = ((((length - (i6 - i7)) + 3) - 1) / 3) * 4;
                int i9 = offset;
                while (true) {
                    z5 = this.f23382r;
                    if (z5 || i8 <= 0) {
                        break;
                    }
                    int min = Math.min(this.f23384t.length, i8);
                    int i10 = 0;
                    while (true) {
                        z6 = this.f23382r;
                        if (z6 || i10 >= min) {
                            break;
                        }
                        int e6 = e();
                        if (e6 == -1) {
                            this.f23382r = true;
                        } else if (e6 != 61) {
                            this.f23384t[i10] = (byte) e6;
                            i10++;
                        } else {
                            i10 = d(i10);
                            this.f23382r = true;
                        }
                    }
                    if (z6 || i10 == min) {
                        i8 -= i10;
                        i9 += b(destination, i9, i5, i10);
                    } else {
                        throw new IllegalStateException(ProtectedSandApp.s("㿔").toString());
                    }
                }
                if (i9 == offset && z5) {
                    return -1;
                }
                return i9 - offset;
            }
            throw new IOException(ProtectedSandApp.s("㿕"));
        }
        throw new IndexOutOfBoundsException(ProtectedSandApp.s("㿖") + offset + ProtectedSandApp.s("㿗") + length + ProtectedSandApp.s("㿘") + destination.length);
    }
}
