package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: DemuxOutputStream.java */
/* loaded from: classes4.dex */
public class g extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    private final InheritableThreadLocal<OutputStream> f85601b = new InheritableThreadLocal<>();

    public OutputStream a(OutputStream outputStream) {
        OutputStream outputStream2 = this.f85601b.get();
        this.f85601b.set(outputStream);
        return outputStream2;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        OutputStream outputStream = this.f85601b.get();
        if (outputStream != null) {
            outputStream.close();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        OutputStream outputStream = this.f85601b.get();
        if (outputStream != null) {
            outputStream.flush();
        }
    }

    @Override // java.io.OutputStream
    public void write(int i4) throws IOException {
        OutputStream outputStream = this.f85601b.get();
        if (outputStream != null) {
            outputStream.write(i4);
        }
    }
}
