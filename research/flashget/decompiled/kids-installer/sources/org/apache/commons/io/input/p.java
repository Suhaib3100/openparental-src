package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import kotlin.UByte;

/* compiled from: ReaderInputStream.java */
/* loaded from: classes5.dex */
public class p extends InputStream {

    /* renamed from: u, reason: collision with root package name */
    private static final int f31962u = 1024;

    /* renamed from: o, reason: collision with root package name */
    private final Reader f31963o;

    /* renamed from: p, reason: collision with root package name */
    private final CharsetEncoder f31964p;

    /* renamed from: q, reason: collision with root package name */
    private final CharBuffer f31965q;

    /* renamed from: r, reason: collision with root package name */
    private final ByteBuffer f31966r;

    /* renamed from: s, reason: collision with root package name */
    private CoderResult f31967s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f31968t;

    public p(Reader reader, CharsetEncoder charsetEncoder) {
        this(reader, charsetEncoder, 1024);
    }

    private void a() throws IOException {
        CoderResult coderResult;
        if (!this.f31968t && ((coderResult = this.f31967s) == null || coderResult.isUnderflow())) {
            this.f31965q.compact();
            int position = this.f31965q.position();
            int read = this.f31963o.read(this.f31965q.array(), position, this.f31965q.remaining());
            if (read == -1) {
                this.f31968t = true;
            } else {
                this.f31965q.position(position + read);
            }
            this.f31965q.flip();
        }
        this.f31966r.compact();
        this.f31967s = this.f31964p.encode(this.f31965q, this.f31966r, this.f31968t);
        this.f31966r.flip();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f31963o.close();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i5, int i6) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("Byte array must not be null");
        }
        if (i6 < 0 || i5 < 0 || i5 + i6 > bArr.length) {
            throw new IndexOutOfBoundsException("Array Size=" + bArr.length + ", offset=" + i5 + ", length=" + i6);
        }
        int i7 = 0;
        if (i6 == 0) {
            return 0;
        }
        while (i6 > 0) {
            if (!this.f31966r.hasRemaining()) {
                a();
                if (this.f31968t && !this.f31966r.hasRemaining()) {
                    break;
                }
            } else {
                int min = Math.min(this.f31966r.remaining(), i6);
                this.f31966r.get(bArr, i5, min);
                i5 += min;
                i6 -= min;
                i7 += min;
            }
        }
        if (i7 == 0 && this.f31968t) {
            return -1;
        }
        return i7;
    }

    public p(Reader reader, CharsetEncoder charsetEncoder, int i5) {
        this.f31963o = reader;
        this.f31964p = charsetEncoder;
        CharBuffer allocate = CharBuffer.allocate(i5);
        this.f31965q = allocate;
        allocate.flip();
        ByteBuffer allocate2 = ByteBuffer.allocate(128);
        this.f31966r = allocate2;
        allocate2.flip();
    }

    public p(Reader reader, Charset charset, int i5) {
        this(reader, charset.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE), i5);
    }

    public p(Reader reader, Charset charset) {
        this(reader, charset, 1024);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public p(Reader reader, String str, int i5) {
        this(reader, Charset.forName(str), i5);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        while (!this.f31966r.hasRemaining()) {
            a();
            if (this.f31968t && !this.f31966r.hasRemaining()) {
                return -1;
            }
        }
        return this.f31966r.get() & UByte.f27220r;
    }

    public p(Reader reader, String str) {
        this(reader, str, 1024);
    }

    public p(Reader reader) {
        this(reader, Charset.defaultCharset());
    }
}
