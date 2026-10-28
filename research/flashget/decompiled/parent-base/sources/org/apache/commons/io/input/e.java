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

/* compiled from: CharSequenceInputStream.java */
/* loaded from: classes4.dex */
public class e extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    private final CharsetEncoder f85454b;

    /* renamed from: c, reason: collision with root package name */
    private final CharBuffer f85455c;

    /* renamed from: d, reason: collision with root package name */
    private final ByteBuffer f85456d;

    /* renamed from: e, reason: collision with root package name */
    private int f85457e;

    public e(CharSequence charSequence, Charset charset, int i4) {
        CharsetEncoder newEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        this.f85454b = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        ByteBuffer allocate = ByteBuffer.allocate(i4);
        this.f85456d = allocate;
        allocate.flip();
        this.f85455c = CharBuffer.wrap(charSequence);
        this.f85457e = -1;
    }

    private void a() throws CharacterCodingException {
        this.f85456d.compact();
        CoderResult encode = this.f85454b.encode(this.f85455c, this.f85456d, true);
        if (encode.isError()) {
            encode.throwException();
        }
        this.f85456d.flip();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f85455c.remaining();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i4) {
        this.f85457e = this.f85455c.position();
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("Byte array is null");
        }
        if (i5 < 0 || i4 + i5 > bArr.length) {
            StringBuilder sb = new StringBuilder("Array Size=");
            androidx.paging.l.a(sb, bArr.length, ", offset=", i4, ", length=");
            sb.append(i5);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        int i6 = 0;
        if (i5 == 0) {
            return 0;
        }
        if (!this.f85456d.hasRemaining() && !this.f85455c.hasRemaining()) {
            return -1;
        }
        while (i5 > 0) {
            if (!this.f85456d.hasRemaining()) {
                a();
                if (!this.f85456d.hasRemaining() && !this.f85455c.hasRemaining()) {
                    break;
                }
            } else {
                int min = Math.min(this.f85456d.remaining(), i5);
                this.f85456d.get(bArr, i4, min);
                i4 += min;
                i5 -= min;
                i6 += min;
            }
        }
        if (i6 != 0 || this.f85455c.hasRemaining()) {
            return i6;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        int i4 = this.f85457e;
        if (i4 != -1) {
            this.f85455c.position(i4);
            this.f85457e = -1;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j4) throws IOException {
        int i4 = 0;
        while (j4 > 0 && this.f85455c.hasRemaining()) {
            this.f85455c.get();
            j4--;
            i4++;
        }
        return i4;
    }

    public e(CharSequence charSequence, String str, int i4) {
        this(charSequence, Charset.forName(str), i4);
    }

    public e(CharSequence charSequence, Charset charset) {
        this(charSequence, charset, 2048);
    }

    public e(CharSequence charSequence, String str) {
        this(charSequence, str, 2048);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        while (!this.f85456d.hasRemaining()) {
            a();
            if (!this.f85456d.hasRemaining() && !this.f85455c.hasRemaining()) {
                return -1;
            }
        }
        return this.f85456d.get() & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }
}
