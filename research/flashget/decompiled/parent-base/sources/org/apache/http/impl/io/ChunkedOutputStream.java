package org.apache.http.impl.io;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.io.SessionOutputBuffer;

@NotThreadSafe
/* loaded from: classes3.dex */
public class ChunkedOutputStream extends OutputStream {
    private final byte[] cache;
    private int cachePosition;
    private boolean closed;
    private final SessionOutputBuffer out;
    private boolean wroteLastChunk;

    @Deprecated
    public ChunkedOutputStream(SessionOutputBuffer sessionOutputBuffer, int i4) throws IOException {
        this(i4, sessionOutputBuffer);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        finish();
        this.out.flush();
    }

    public void finish() throws IOException {
        if (this.wroteLastChunk) {
            return;
        }
        flushCache();
        writeClosingChunk();
        this.wroteLastChunk = true;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        flushCache();
        this.out.flush();
    }

    protected void flushCache() throws IOException {
        int i4 = this.cachePosition;
        if (i4 > 0) {
            this.out.writeLine(Integer.toHexString(i4));
            this.out.write(this.cache, 0, this.cachePosition);
            this.out.writeLine("");
            this.cachePosition = 0;
        }
    }

    protected void flushCacheWithAppend(byte[] bArr, int i4, int i5) throws IOException {
        this.out.writeLine(Integer.toHexString(this.cachePosition + i5));
        this.out.write(this.cache, 0, this.cachePosition);
        this.out.write(bArr, i4, i5);
        this.out.writeLine("");
        this.cachePosition = 0;
    }

    @Override // java.io.OutputStream
    public void write(int i4) throws IOException {
        if (this.closed) {
            throw new IOException("Attempted write to closed stream.");
        }
        byte[] bArr = this.cache;
        int i5 = this.cachePosition;
        bArr[i5] = (byte) i4;
        int i6 = i5 + 1;
        this.cachePosition = i6;
        if (i6 == bArr.length) {
            flushCache();
        }
    }

    protected void writeClosingChunk() throws IOException {
        this.out.writeLine("0");
        this.out.writeLine("");
    }

    @Deprecated
    public ChunkedOutputStream(SessionOutputBuffer sessionOutputBuffer) throws IOException {
        this(2048, sessionOutputBuffer);
    }

    public ChunkedOutputStream(int i4, SessionOutputBuffer sessionOutputBuffer) {
        this.cachePosition = 0;
        this.wroteLastChunk = false;
        this.closed = false;
        this.cache = new byte[i4];
        this.out = sessionOutputBuffer;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i4, int i5) throws IOException {
        if (!this.closed) {
            byte[] bArr2 = this.cache;
            int length = bArr2.length;
            int i6 = this.cachePosition;
            if (i5 >= length - i6) {
                flushCacheWithAppend(bArr, i4, i5);
                return;
            } else {
                System.arraycopy(bArr, i4, bArr2, i6, i5);
                this.cachePosition += i5;
                return;
            }
        }
        throw new IOException("Attempted write to closed stream.");
    }
}
