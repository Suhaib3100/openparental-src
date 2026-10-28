package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import kotlin.UByte;

/* compiled from: CharSequenceInputStream.java */
/* loaded from: classes5.dex */
public class e extends InputStream {

    /* renamed from: o, reason: collision with root package name */
    private final CharsetEncoder f31937o;

    /* renamed from: p, reason: collision with root package name */
    private final CharBuffer f31938p;

    /* renamed from: q, reason: collision with root package name */
    private final ByteBuffer f31939q;

    /* renamed from: r, reason: collision with root package name */
    private int f31940r;

    public e(CharSequence charSequence, Charset charset, int i5) {
        this.f31937o = charset.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
        ByteBuffer allocate = ByteBuffer.allocate(i5);
        this.f31939q = allocate;
        allocate.flip();
        this.f31938p = CharBuffer.wrap(charSequence);
        this.f31940r = -1;
    }

    private void a() throws CharacterCodingException {
        this.f31939q.compact();
        CoderResult encode = this.f31937o.encode(this.f31938p, this.f31939q, true);
        if (encode.isError()) {
            encode.throwException();
        }
        this.f31939q.flip();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f31938p.remaining();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i5) {
        this.f31940r = this.f31938p.position();
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i5, int i6) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("Byte array is null");
        }
        if (i6 < 0 || i5 + i6 > bArr.length) {
            throw new IndexOutOfBoundsException("Array Size=" + bArr.length + ", offset=" + i5 + ", length=" + i6);
        }
        int i7 = 0;
        if (i6 == 0) {
            return 0;
        }
        if (!this.f31939q.hasRemaining() && !this.f31938p.hasRemaining()) {
            return -1;
        }
        while (i6 > 0) {
            if (!this.f31939q.hasRemaining()) {
                a();
                if (!this.f31939q.hasRemaining() && !this.f31938p.hasRemaining()) {
                    break;
                }
            } else {
                int min = Math.min(this.f31939q.remaining(), i6);
                this.f31939q.get(bArr, i5, min);
                i5 += min;
                i6 -= min;
                i7 += min;
            }
        }
        if (i7 != 0 || this.f31938p.hasRemaining()) {
            return i7;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        int i5 = this.f31940r;
        if (i5 != -1) {
            this.f31938p.position(i5);
            this.f31940r = -1;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j5) throws IOException {
        int i5 = 0;
        while (j5 > 0 && this.f31938p.hasRemaining()) {
            this.f31938p.get();
            j5--;
            i5++;
        }
        return i5;
    }

    public e(CharSequence charSequence, String str, int i5) {
        this(charSequence, Charset.forName(str), i5);
    }

    public e(CharSequence charSequence, Charset charset) {
        this(charSequence, charset, 2048);
    }

    public e(CharSequence charSequence, String str) {
        this(charSequence, str, 2048);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        while (!this.f31939q.hasRemaining()) {
            a();
            if (!this.f31939q.hasRemaining() && !this.f31938p.hasRemaining()) {
                return -1;
            }
        }
        return this.f31939q.get() & UByte.f27220r;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }
}
