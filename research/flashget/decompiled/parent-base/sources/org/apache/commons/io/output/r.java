package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;

/* compiled from: WriterOutputStream.java */
/* loaded from: classes4.dex */
public class r extends OutputStream {

    /* renamed from: g, reason: collision with root package name */
    private static final int f85614g = 1024;

    /* renamed from: b, reason: collision with root package name */
    private final Writer f85615b;

    /* renamed from: c, reason: collision with root package name */
    private final CharsetDecoder f85616c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f85617d;

    /* renamed from: e, reason: collision with root package name */
    private final ByteBuffer f85618e;

    /* renamed from: f, reason: collision with root package name */
    private final CharBuffer f85619f;

    public r(Writer writer, CharsetDecoder charsetDecoder) {
        this(writer, charsetDecoder, 1024, false);
    }

    private void a() throws IOException {
        if (this.f85619f.position() > 0) {
            this.f85615b.write(this.f85619f.array(), 0, this.f85619f.position());
            this.f85619f.rewind();
        }
    }

    private void b(boolean z4) throws IOException {
        CoderResult decode;
        this.f85618e.flip();
        while (true) {
            decode = this.f85616c.decode(this.f85618e, this.f85619f, z4);
            if (!decode.isOverflow()) {
                break;
            } else {
                a();
            }
        }
        if (!decode.isUnderflow()) {
            throw new IOException("Unexpected coder result");
        }
        this.f85618e.compact();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        b(true);
        a();
        this.f85615b.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        a();
        this.f85615b.flush();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i4, int i5) throws IOException {
        while (i5 > 0) {
            int min = Math.min(i5, this.f85618e.remaining());
            this.f85618e.put(bArr, i4, min);
            b(false);
            i5 -= min;
            i4 += min;
        }
        if (this.f85617d) {
            a();
        }
    }

    public r(Writer writer, CharsetDecoder charsetDecoder, int i4, boolean z4) {
        this.f85618e = ByteBuffer.allocate(128);
        this.f85615b = writer;
        this.f85616c = charsetDecoder;
        this.f85617d = z4;
        this.f85619f = CharBuffer.allocate(i4);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(int i4) throws IOException {
        write(new byte[]{(byte) i4}, 0, 1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r(java.io.Writer r2, java.nio.charset.Charset r3, int r4, boolean r5) {
        /*
            r1 = this;
            java.nio.charset.CharsetDecoder r3 = r3.newDecoder()
            java.nio.charset.CodingErrorAction r0 = java.nio.charset.CodingErrorAction.REPLACE
            java.nio.charset.CharsetDecoder r3 = r3.onMalformedInput(r0)
            java.nio.charset.CharsetDecoder r3 = r3.onUnmappableCharacter(r0)
            java.lang.String r0 = "?"
            java.nio.charset.CharsetDecoder r3 = r3.replaceWith(r0)
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.output.r.<init>(java.io.Writer, java.nio.charset.Charset, int, boolean):void");
    }

    public r(Writer writer, Charset charset) {
        this(writer, charset, 1024, false);
    }

    public r(Writer writer, String str, int i4, boolean z4) {
        this(writer, Charset.forName(str), i4, z4);
    }

    public r(Writer writer, String str) {
        this(writer, str, 1024, false);
    }

    public r(Writer writer) {
        this(writer, Charset.defaultCharset(), 1024, false);
    }
}
