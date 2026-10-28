package org.apache.commons.io.input;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;

/* compiled from: ProxyReader.java */
/* loaded from: classes4.dex */
public abstract class o extends FilterReader {
    public o(Reader reader) {
        super(reader);
    }

    protected void a(int i4) throws IOException {
    }

    protected void b(int i4) throws IOException {
    }

    protected void c(IOException iOException) throws IOException {
        throw iOException;
    }

    @Override // java.io.FilterReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            ((FilterReader) this).in.close();
        } catch (IOException e4) {
            c(e4);
        }
    }

    @Override // java.io.FilterReader, java.io.Reader
    public synchronized void mark(int i4) throws IOException {
        try {
            ((FilterReader) this).in.mark(i4);
        } catch (IOException e4) {
            c(e4);
        }
    }

    @Override // java.io.FilterReader, java.io.Reader
    public boolean markSupported() {
        return ((FilterReader) this).in.markSupported();
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() throws IOException {
        int i4 = 1;
        try {
            b(1);
            int read = ((FilterReader) this).in.read();
            if (read == -1) {
                i4 = -1;
            }
            a(i4);
            return read;
        } catch (IOException e4) {
            c(e4);
            return -1;
        }
    }

    @Override // java.io.FilterReader, java.io.Reader
    public boolean ready() throws IOException {
        try {
            return ((FilterReader) this).in.ready();
        } catch (IOException e4) {
            c(e4);
            return false;
        }
    }

    @Override // java.io.FilterReader, java.io.Reader
    public synchronized void reset() throws IOException {
        try {
            ((FilterReader) this).in.reset();
        } catch (IOException e4) {
            c(e4);
        }
    }

    @Override // java.io.FilterReader, java.io.Reader
    public long skip(long j4) throws IOException {
        try {
            return ((FilterReader) this).in.skip(j4);
        } catch (IOException e4) {
            c(e4);
            return 0L;
        }
    }

    @Override // java.io.Reader
    public int read(char[] cArr) throws IOException {
        int length;
        if (cArr != null) {
            try {
                length = cArr.length;
            } catch (IOException e4) {
                c(e4);
                return -1;
            }
        } else {
            length = 0;
        }
        b(length);
        int read = ((FilterReader) this).in.read(cArr);
        a(read);
        return read;
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read(char[] cArr, int i4, int i5) throws IOException {
        try {
            b(i5);
            int read = ((FilterReader) this).in.read(cArr, i4, i5);
            a(read);
            return read;
        } catch (IOException e4) {
            c(e4);
            return -1;
        }
    }

    @Override // java.io.Reader, java.lang.Readable
    public int read(CharBuffer charBuffer) throws IOException {
        int length;
        if (charBuffer != null) {
            try {
                length = charBuffer.length();
            } catch (IOException e4) {
                c(e4);
                return -1;
            }
        } else {
            length = 0;
        }
        b(length);
        int read = ((FilterReader) this).in.read(charBuffer);
        a(read);
        return read;
    }
}
