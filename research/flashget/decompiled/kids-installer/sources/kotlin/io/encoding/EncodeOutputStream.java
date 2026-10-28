package kotlin.io.encoding;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.l0;

/* compiled from: Base64IOStream.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J \u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0002J\b\u0010\u0015\u001a\u00020\u000fH\u0002J \u0010\u0016\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0002J\b\u0010\u0017\u001a\u00020\u000fH\u0016J \u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0016J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lkotlin/io/encoding/EncodeOutputStream;", "Ljava/io/OutputStream;", "output", "base64", "Lkotlin/io/encoding/Base64;", "(Ljava/io/OutputStream;Lkotlin/io/encoding/Base64;)V", "byteBuffer", "", "byteBufferLength", "", "isClosed", "", "lineLength", "symbolBuffer", "checkOpen", "", "close", "copyIntoByteBuffer", "source", "startIndex", "endIndex", "encodeByteBufferIntoOutput", "encodeIntoOutput", "flush", "write", "offset", "length", "b", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalEncodingApi
/* renamed from: kotlin.io.encoding.e, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
final class EncodeOutputStream extends OutputStream {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final OutputStream f23388o;

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    private final Base64 f23389p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f23390q;

    /* renamed from: r, reason: collision with root package name */
    private int f23391r;

    /* renamed from: s, reason: collision with root package name */
    @d5.d
    private final byte[] f23392s;

    /* renamed from: t, reason: collision with root package name */
    @d5.d
    private final byte[] f23393t;

    /* renamed from: u, reason: collision with root package name */
    private int f23394u;

    public EncodeOutputStream(@d5.d OutputStream outputStream, @d5.d Base64 base64) {
        l0.p(outputStream, ProtectedSandApp.s("㿙"));
        l0.p(base64, ProtectedSandApp.s("㿚"));
        this.f23388o = outputStream;
        this.f23389p = base64;
        this.f23391r = base64.getF23374b() ? 76 : -1;
        this.f23392s = new byte[1024];
        this.f23393t = new byte[3];
    }

    private final void a() {
        if (this.f23390q) {
            throw new IOException(ProtectedSandApp.s("㿛"));
        }
    }

    private final int b(byte[] bArr, int i5, int i6) {
        int min = Math.min(3 - this.f23394u, i6 - i5);
        p.v0(bArr, this.f23393t, this.f23394u, i5, i5 + min);
        int i7 = this.f23394u + min;
        this.f23394u = i7;
        if (i7 == 3) {
            c();
        }
        return min;
    }

    private final void c() {
        if (!(d(this.f23393t, 0, this.f23394u) == 4)) {
            throw new IllegalStateException(ProtectedSandApp.s("㿜").toString());
        }
        this.f23394u = 0;
    }

    private final int d(byte[] bArr, int i5, int i6) {
        int t5 = this.f23389p.t(bArr, this.f23392s, 0, i5, i6);
        if (this.f23391r == 0) {
            OutputStream outputStream = this.f23388o;
            Base64.f23362c.getClass();
            outputStream.write(Base64.f23370k);
            this.f23391r = 76;
            if (!(t5 <= 76)) {
                throw new IllegalStateException(ProtectedSandApp.s("㿝").toString());
            }
        }
        this.f23388o.write(this.f23392s, 0, t5);
        this.f23391r -= t5;
        return t5;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f23390q) {
            return;
        }
        this.f23390q = true;
        if (this.f23394u != 0) {
            c();
        }
        this.f23388o.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        a();
        this.f23388o.flush();
    }

    @Override // java.io.OutputStream
    public void write(int b6) {
        a();
        byte[] bArr = this.f23393t;
        int i5 = this.f23394u;
        int i6 = i5 + 1;
        this.f23394u = i6;
        bArr[i5] = (byte) b6;
        if (i6 == 3) {
            c();
        }
    }

    @Override // java.io.OutputStream
    public void write(@d5.d byte[] source, int offset, int length) {
        int i5;
        l0.p(source, ProtectedSandApp.s("㿞"));
        a();
        if (offset < 0 || length < 0 || (i5 = offset + length) > source.length) {
            throw new IndexOutOfBoundsException(ProtectedSandApp.s("㿠") + offset + ProtectedSandApp.s("㿡") + length + ProtectedSandApp.s("㿢") + source.length);
        }
        if (length == 0) {
            return;
        }
        int i6 = this.f23394u;
        boolean z5 = i6 < 3;
        String s5 = ProtectedSandApp.s("㿟");
        if (z5) {
            if (i6 != 0) {
                offset += b(source, offset, i5);
                if (this.f23394u != 0) {
                    return;
                }
            }
            while (offset + 3 <= i5) {
                int min = Math.min((this.f23389p.getF23374b() ? this.f23391r : this.f23392s.length) / 4, (i5 - offset) / 3);
                int i7 = (min * 3) + offset;
                if (!(d(source, offset, i7) == min * 4)) {
                    throw new IllegalStateException(s5.toString());
                }
                offset = i7;
            }
            p.v0(source, this.f23393t, 0, offset, i5);
            this.f23394u = i5 - offset;
            return;
        }
        throw new IllegalStateException(s5.toString());
    }
}
