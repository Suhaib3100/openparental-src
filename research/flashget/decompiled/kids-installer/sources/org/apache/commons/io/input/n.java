package org.apache.commons.io.input;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ProxyInputStream.java */
/* loaded from: classes5.dex */
public abstract class n extends FilterInputStream {
    public n(InputStream inputStream) {
        super(inputStream);
    }

    protected void a(int i5) throws IOException {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        try {
            return super.available();
        } catch (IOException e6) {
            c(e6);
            return 0;
        }
    }

    protected void b(int i5) throws IOException {
    }

    protected void c(IOException iOException) throws IOException {
        throw iOException;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            ((FilterInputStream) this).in.close();
        } catch (IOException e6) {
            c(e6);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i5) {
        ((FilterInputStream) this).in.mark(i5);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return ((FilterInputStream) this).in.markSupported();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i5 = 1;
        try {
            b(1);
            int read = ((FilterInputStream) this).in.read();
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

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        try {
            ((FilterInputStream) this).in.reset();
        } catch (IOException e6) {
            c(e6);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j5) throws IOException {
        try {
            return ((FilterInputStream) this).in.skip(j5);
        } catch (IOException e6) {
            c(e6);
            return 0L;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        int length;
        if (bArr != null) {
            try {
                length = bArr.length;
            } catch (IOException e6) {
                c(e6);
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
    public int read(byte[] bArr, int i5, int i6) throws IOException {
        try {
            b(i6);
            int read = ((FilterInputStream) this).in.read(bArr, i5, i6);
            a(read);
            return read;
        } catch (IOException e6) {
            c(e6);
            return -1;
        }
    }
}
