package org.apache.commons.io.output;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: ProxyOutputStream.java */
/* loaded from: classes5.dex */
public class l extends FilterOutputStream {
    public l(OutputStream outputStream) {
        super(outputStream);
    }

    protected void a(int i5) throws IOException {
    }

    protected void b(int i5) throws IOException {
    }

    protected void c(IOException iOException) throws IOException {
        throw iOException;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            ((FilterOutputStream) this).out.close();
        } catch (IOException e6) {
            c(e6);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        try {
            ((FilterOutputStream) this).out.flush();
        } catch (IOException e6) {
            c(e6);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i5) throws IOException {
        try {
            b(1);
            ((FilterOutputStream) this).out.write(i5);
            a(1);
        } catch (IOException e6) {
            c(e6);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        int length;
        if (bArr != null) {
            try {
                length = bArr.length;
            } catch (IOException e6) {
                c(e6);
                return;
            }
        } else {
            length = 0;
        }
        b(length);
        ((FilterOutputStream) this).out.write(bArr);
        a(length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i5, int i6) throws IOException {
        try {
            b(i6);
            ((FilterOutputStream) this).out.write(bArr, i5, i6);
            a(i6);
        } catch (IOException e6) {
            c(e6);
        }
    }
}
