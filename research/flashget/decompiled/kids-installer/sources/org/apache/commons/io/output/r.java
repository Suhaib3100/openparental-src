package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/* compiled from: WriterOutputStream.java */
/* loaded from: classes5.dex */
public class r extends OutputStream {

    /* renamed from: t, reason: collision with root package name */
    private static final int f32102t = 1024;

    /* renamed from: o, reason: collision with root package name */
    private final Writer f32103o;

    /* renamed from: p, reason: collision with root package name */
    private final CharsetDecoder f32104p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f32105q;

    /* renamed from: r, reason: collision with root package name */
    private final ByteBuffer f32106r;

    /* renamed from: s, reason: collision with root package name */
    private final CharBuffer f32107s;

    public r(Writer writer, CharsetDecoder charsetDecoder) {
        this(writer, charsetDecoder, 1024, false);
    }

    private void a() throws IOException {
        if (this.f32107s.position() > 0) {
            this.f32103o.write(this.f32107s.array(), 0, this.f32107s.position());
            this.f32107s.rewind();
        }
    }

    private void b(boolean z5) throws IOException {
        CoderResult decode;
        this.f32106r.flip();
        while (true) {
            decode = this.f32104p.decode(this.f32106r, this.f32107s, z5);
            if (!decode.isOverflow()) {
                break;
            } else {
                a();
            }
        }
        if (!decode.isUnderflow()) {
            throw new IOException("Unexpected coder result");
        }
        this.f32106r.compact();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        b(true);
        a();
        this.f32103o.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        a();
        this.f32103o.flush();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i5, int i6) throws IOException {
        while (i6 > 0) {
            int min = Math.min(i6, this.f32106r.remaining());
            this.f32106r.put(bArr, i5, min);
            b(false);
            i6 -= min;
            i5 += min;
        }
        if (this.f32105q) {
            a();
        }
    }

    public r(Writer writer, CharsetDecoder charsetDecoder, int i5, boolean z5) {
        this.f32106r = ByteBuffer.allocate(128);
        this.f32103o = writer;
        this.f32104p = charsetDecoder;
        this.f32105q = z5;
        this.f32107s = CharBuffer.allocate(i5);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(int i5) throws IOException {
        write(new byte[]{(byte) i5}, 0, 1);
    }

    public r(Writer writer, Charset charset, int i5, boolean z5) {
        this(writer, charset.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE).replaceWith("?"), i5, z5);
    }

    public r(Writer writer, Charset charset) {
        this(writer, charset, 1024, false);
    }

    public r(Writer writer, String str, int i5, boolean z5) {
        this(writer, Charset.forName(str), i5, z5);
    }

    public r(Writer writer, String str) {
        this(writer, str, 1024, false);
    }

    public r(Writer writer) {
        this(writer, Charset.defaultCharset(), 1024, false);
    }
}
