package org.apache.commons.io.input;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;

/* compiled from: ProxyReader.java */
/* loaded from: classes5.dex */
public abstract class o extends FilterReader {
    public o(Reader reader) {
        super(reader);
    }

    protected void a(int i5) throws IOException {
    }

    protected void b(int i5) throws IOException {
    }

    protected void c(IOException iOException) throws IOException {
        throw iOException;
    }

    @Override // java.io.FilterReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            ((FilterReader) this).in.close();
        } catch (IOException e6) {
            c(e6);
        }
    }

    @Override // java.io.FilterReader, java.io.Reader
    public synchronized void mark(int i5) throws IOException {
        try {
            ((FilterReader) this).in.mark(i5);
        } catch (IOException e6) {
            c(e6);
        }
    }

    @Override // java.io.FilterReader, java.io.Reader
    public boolean markSupported() {
        return ((FilterReader) this).in.markSupported();
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() throws IOException {
        int i5 = 1;
        try {
            b(1);
            int read = ((FilterReader) this).in.read();
            if (read == -1) {
                i5 = -1;
            }
            a(i5);
            return read;
        } catch (IOException e6) {
            c(e6);
            return -1;
        }
    }

    @Override // java.io.FilterReader, java.io.Reader
    public boolean ready() throws IOException {
        try {
            return ((FilterReader) this).in.ready();
        } catch (IOException e6) {
            c(e6);
            return false;
        }
    }

    @Override // java.io.FilterReader, java.io.Reader
    public synchronized void reset() throws IOException {
        try {
            ((FilterReader) this).in.reset();
        } catch (IOException e6) {
            c(e6);
        }
    }

    @Override // java.io.FilterReader, java.io.Reader
    public long skip(long j5) throws IOException {
        try {
            return ((FilterReader) this).in.skip(j5);
        } catch (IOException e6) {
            c(e6);
            return 0L;
        }
    }

    @Override // java.io.Reader
    public int read(char[] cArr) throws IOException {
        int length;
        if (cArr != null) {
            try {
                length = cArr.length;
            } catch (IOException e6) {
                c(e6);
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
    public int read(char[] cArr, int i5, int i6) throws IOException {
        try {
            b(i6);
            int read = ((FilterReader) this).in.read(cArr, i5, i6);
            a(read);
            return read;
        } catch (IOException e6) {
            c(e6);
            return -1;
        }
    }

    @Override // java.io.Reader, java.lang.Readable
    public int read(CharBuffer charBuffer) throws IOException {
        int length;
        if (charBuffer != null) {
            try {
                length = charBuffer.length();
            } catch (IOException e6) {
                c(e6);
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
