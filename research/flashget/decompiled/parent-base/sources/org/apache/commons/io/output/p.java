package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: TeeOutputStream.java */
/* loaded from: classes4.dex */
public class p extends l {

    /* renamed from: b, reason: collision with root package name */
    protected OutputStream f85610b;

    public p(OutputStream outputStream, OutputStream outputStream2) {
        super(outputStream);
        this.f85610b = outputStream2;
    }

    @Override // org.apache.commons.io.output.l, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            super.close();
        } finally {
            this.f85610b.close();
        }
    }

    @Override // org.apache.commons.io.output.l, java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        super.flush();
        this.f85610b.flush();
    }

    @Override // org.apache.commons.io.output.l, java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr) throws IOException {
        super.write(bArr);
        this.f85610b.write(bArr);
    }

    @Override // org.apache.commons.io.output.l, java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i4, int i5) throws IOException {
        super.write(bArr, i4, i5);
        this.f85610b.write(bArr, i4, i5);
    }

    @Override // org.apache.commons.io.output.l, java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(int i4) throws IOException {
        super.write(i4);
        this.f85610b.write(i4);
    }
}
