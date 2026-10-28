package org.apache.commons.io.input;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ProxyInputStream.java */
/* loaded from: classes4.dex */
public abstract class n extends FilterInputStream {
    public n(InputStream inputStream) {
        super(inputStream);
    }

    protected void a(int i4) throws IOException {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        try {
            return super.available();
        } catch (IOException e4) {
            c(e4);
            return 0;
        }
    }

    protected void b(int i4) throws IOException {
    }

    protected void c(IOException iOException) throws IOException {
        throw iOException;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            ((FilterInputStream) this).in.close();
        } catch (IOException e4) {
            c(e4);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i4) {
        ((FilterInputStream) this).in.mark(i4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return ((FilterInputStream) this).in.markSupported();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i4 = 1;
        try {
            b(1);
            int read = ((FilterInputStream) this).in.read();
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

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        try {
            ((FilterInputStream) this).in.reset();
        } catch (IOException e4) {
            c(e4);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j4) throws IOException {
        try {
            return ((FilterInputStream) this).in.skip(j4);
        } catch (IOException e4) {
            c(e4);
            return 0L;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        int length;
        if (bArr != null) {
            try {
                length = bArr.length;
            } catch (IOException e4) {
                c(e4);
                return -1;
            }
        } else {
            length = 0;
        }
        b(length);
        int read = ((FilterInputStream) this).in.read(bArr);
        a(read);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        try {
            b(i5);
            int read = ((FilterInputStream) this).in.read(bArr, i4, i5);
            a(read);
            return read;
        } catch (IOException e4) {
            c(e4);
            return -1;
        }
    }
}
