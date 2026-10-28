package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: TeeOutputStream.java */
/* loaded from: classes6.dex */
public class p extends l {

    /* renamed from: o, reason: collision with root package name */
    protected OutputStream f32098o;

    public p(OutputStream outputStream, OutputStream outputStream2) {
        super(outputStream);
        this.f32098o = outputStream2;
    }

    @Override // org.apache.commons.io.output.l, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            super.close();
        } finally {
            this.f32098o.close();
        }
    }

    @Override // org.apache.commons.io.output.l, java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        super.flush();
        this.f32098o.flush();
    }

    @Override // org.apache.commons.io.output.l, java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr) throws IOException {
        super.write(bArr);
        this.f32098o.write(bArr);
    }

    @Override // org.apache.commons.io.output.l, java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i5, int i6) throws IOException {
        super.write(bArr, i5, i6);
        this.f32098o.write(bArr, i5, i6);
    }

    @Override // org.apache.commons.io.output.l, java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(int i5) throws IOException {
        super.write(i5);
        this.f32098o.write(i5);
    }
}
