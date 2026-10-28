package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

/* compiled from: ReaderInputStream.java */
/* loaded from: classes4.dex */
public class p extends InputStream {

    /* renamed from: h, reason: collision with root package name */
    private static final int f85479h = 1024;

    /* renamed from: b, reason: collision with root package name */
    private final Reader f85480b;

    /* renamed from: c, reason: collision with root package name */
    private final CharsetEncoder f85481c;

    /* renamed from: d, reason: collision with root package name */
    private final CharBuffer f85482d;

    /* renamed from: e, reason: collision with root package name */
    private final ByteBuffer f85483e;

    /* renamed from: f, reason: collision with root package name */
    private CoderResult f85484f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f85485g;

    public p(Reader reader, CharsetEncoder charsetEncoder) {
        this(reader, charsetEncoder, 1024);
    }

    private void a() throws IOException {
        CoderResult coderResult;
        if (!this.f85485g && ((coderResult = this.f85484f) == null || coderResult.isUnderflow())) {
            this.f85482d.compact();
            int position = this.f85482d.position();
            int read = this.f85480b.read(this.f85482d.array(), position, this.f85482d.remaining());
            if (read == -1) {
                this.f85485g = true;
            } else {
                this.f85482d.position(position + read);
            }
            this.f85482d.flip();
        }
        this.f85483e.compact();
        this.f85484f = this.f85481c.encode(this.f85482d, this.f85483e, this.f85485g);
        this.f85483e.flip();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f85480b.close();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("Byte array must not be null");
        }
        if (i5 < 0 || i4 < 0 || i4 + i5 > bArr.length) {
            StringBuilder sb = new StringBuilder("Array Size=");
            androidx.paging.l.a(sb, bArr.length, ", offset=", i4, ", length=");
            sb.append(i5);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        int i6 = 0;
        if (i5 == 0) {
            return 0;
        }
        while (i5 > 0) {
            if (!this.f85483e.hasRemaining()) {
                a();
                if (this.f85485g && !this.f85483e.hasRemaining()) {
                    break;
                }
            } else {
                int min = Math.min(this.f85483e.remaining(), i5);
                this.f85483e.get(bArr, i4, min);
                i4 += min;
                i5 -= min;
                i6 += min;
            }
        }
        if (i6 == 0 && this.f85485g) {
            return -1;
        }
        return i6;
    }

    public p(Reader reader, CharsetEncoder charsetEncoder, int i4) {
        this.f85480b = reader;
        this.f85481c = charsetEncoder;
        CharBuffer allocate = CharBuffer.allocate(i4);
        this.f85482d = allocate;
        allocate.flip();
        ByteBuffer allocate2 = ByteBuffer.allocate(128);
        this.f85483e = allocate2;
        allocate2.flip();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p(java.io.Reader r2, java.nio.charset.Charset r3, int r4) {
        /*
            r1 = this;
            java.nio.charset.CharsetEncoder r3 = r3.newEncoder()
            java.nio.charset.CodingErrorAction r0 = java.nio.charset.CodingErrorAction.REPLACE
            java.nio.charset.CharsetEncoder r3 = r3.onMalformedInput(r0)
            java.nio.charset.CharsetEncoder r3 = r3.onUnmappableCharacter(r0)
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.input.p.<init>(java.io.Reader, java.nio.charset.Charset, int):void");
    }

    public p(Reader reader, Charset charset) {
        this(reader, charset, 1024);
    }

    public p(Reader reader, String str, int i4) {
        this(reader, Charset.forName(str), i4);
    }

    public p(Reader reader, String str) {
        this(reader, str, 1024);
    }

    public p(Reader reader) {
        this(reader, Charset.defaultCharset());
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        while (!this.f85483e.hasRemaining()) {
            a();
            if (this.f85485g && !this.f85483e.hasRemaining()) {
                return -1;
            }
        }
        return this.f85483e.get() & 255;
    }
}
