package com.google.common.io;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;

/* compiled from: ReaderInputStream.java */
@p
@d9.c
/* loaded from: classes6.dex */
final class e0 extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    private final Reader f57099b;

    /* renamed from: c, reason: collision with root package name */
    private final CharsetEncoder f57100c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f57101d;

    /* renamed from: e, reason: collision with root package name */
    private CharBuffer f57102e;

    /* renamed from: f, reason: collision with root package name */
    private ByteBuffer f57103f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f57104g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f57105h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f57106i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    e0(java.io.Reader r2, java.nio.charset.Charset r3, int r4) {
        /*
            r1 = this;
            java.nio.charset.CharsetEncoder r3 = r3.newEncoder()
            java.nio.charset.CodingErrorAction r0 = java.nio.charset.CodingErrorAction.REPLACE
            java.nio.charset.CharsetEncoder r3 = r3.onMalformedInput(r0)
            java.nio.charset.CharsetEncoder r3 = r3.onUnmappableCharacter(r0)
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.io.e0.<init>(java.io.Reader, java.nio.charset.Charset, int):void");
    }

    private static int a(Buffer buffer) {
        return buffer.capacity() - buffer.limit();
    }

    private int b(byte[] bArr, int i4, int i5) {
        int min = Math.min(i5, this.f57103f.remaining());
        this.f57103f.get(bArr, i4, min);
        return min;
    }

    private static CharBuffer c(CharBuffer charBuffer) {
        CharBuffer wrap = CharBuffer.wrap(Arrays.copyOf(charBuffer.array(), charBuffer.capacity() * 2));
        wrap.position(charBuffer.position());
        wrap.limit(charBuffer.limit());
        return wrap;
    }

    private void d() throws IOException {
        if (a(this.f57102e) == 0) {
            if (this.f57102e.position() > 0) {
                this.f57102e.compact().flip();
            } else {
                this.f57102e = c(this.f57102e);
            }
        }
        int limit = this.f57102e.limit();
        int read = this.f57099b.read(this.f57102e.array(), limit, a(this.f57102e));
        if (read == -1) {
            this.f57104g = true;
        } else {
            this.f57102e.limit(limit + read);
        }
    }

    private void e(boolean z4) {
        this.f57103f.flip();
        if (z4 && this.f57103f.remaining() == 0) {
            this.f57103f = ByteBuffer.allocate(this.f57103f.capacity() * 2);
        } else {
            this.f57105h = true;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f57099b.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f57101d) == 1) {
            return this.f57101d[0] & 255;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r2 <= 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return r2;
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(byte[] r8, int r9, int r10) throws java.io.IOException {
        /*
            r7 = this;
            int r0 = r9 + r10
            int r1 = r8.length
            com.google.common.base.l0.f0(r9, r0, r1)
            r0 = 0
            if (r10 != 0) goto La
            return r0
        La:
            boolean r1 = r7.f57104g
            r2 = r0
        Ld:
            boolean r3 = r7.f57105h
            if (r3 == 0) goto L2e
            int r3 = r9 + r2
            int r4 = r10 - r2
            int r3 = r7.b(r8, r3, r4)
            int r2 = r2 + r3
            if (r2 == r10) goto L29
            boolean r3 = r7.f57106i
            if (r3 == 0) goto L21
            goto L29
        L21:
            r7.f57105h = r0
            java.nio.ByteBuffer r3 = r7.f57103f
            r3.clear()
            goto L2e
        L29:
            if (r2 <= 0) goto L2c
            goto L2d
        L2c:
            r2 = -1
        L2d:
            return r2
        L2e:
            boolean r3 = r7.f57106i
            if (r3 == 0) goto L35
            java.nio.charset.CoderResult r3 = java.nio.charset.CoderResult.UNDERFLOW
            goto L4c
        L35:
            if (r1 == 0) goto L40
            java.nio.charset.CharsetEncoder r3 = r7.f57100c
            java.nio.ByteBuffer r4 = r7.f57103f
            java.nio.charset.CoderResult r3 = r3.flush(r4)
            goto L4c
        L40:
            java.nio.charset.CharsetEncoder r3 = r7.f57100c
            java.nio.CharBuffer r4 = r7.f57102e
            java.nio.ByteBuffer r5 = r7.f57103f
            boolean r6 = r7.f57104g
            java.nio.charset.CoderResult r3 = r3.encode(r4, r5, r6)
        L4c:
            boolean r4 = r3.isOverflow()
            r5 = 1
            if (r4 == 0) goto L57
            r7.e(r5)
            goto Ld
        L57:
            boolean r4 = r3.isUnderflow()
            if (r4 == 0) goto L6f
            if (r1 == 0) goto L65
            r7.f57106i = r5
            r7.e(r0)
            goto Ld
        L65:
            boolean r3 = r7.f57104g
            if (r3 == 0) goto L6b
            r1 = r5
            goto L2e
        L6b:
            r7.d()
            goto L2e
        L6f:
            boolean r4 = r3.isError()
            if (r4 == 0) goto L2e
            r3.throwException()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.io.e0.read(byte[], int, int):int");
    }

    e0(Reader reader, CharsetEncoder charsetEncoder, int i4) {
        this.f57101d = new byte[1];
        reader.getClass();
        this.f57099b = reader;
        charsetEncoder.getClass();
        this.f57100c = charsetEncoder;
        l0.k(i4 > 0, ProtectedSandApp.s("\uf685"), i4);
        charsetEncoder.reset();
        CharBuffer allocate = CharBuffer.allocate(i4);
        this.f57102e = allocate;
        allocate.flip();
        this.f57103f = ByteBuffer.allocate(i4);
    }
}
