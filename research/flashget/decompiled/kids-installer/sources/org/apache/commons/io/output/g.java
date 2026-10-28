package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: DemuxOutputStream.java */
/* loaded from: classes5.dex */
public class g extends OutputStream {

    /* renamed from: o, reason: collision with root package name */
    private final InheritableThreadLocal<OutputStream> f32089o = new InheritableThreadLocal<>();

    public OutputStream a(OutputStream outputStream) {
        OutputStream outputStream2 = this.f32089o.get();
        this.f32089o.set(outputStream);
        return outputStream2;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        OutputStream outputStream = this.f32089o.get();
        if (outputStream != null) {
            outputStream.close();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        OutputStream outputStream = this.f32089o.get();
        if (outputStream != null) {
            outputStream.flush();
        }
    }

    @Override // java.io.OutputStream
    public void write(int i5) throws IOException {
        OutputStream outputStream = this.f32089o.get();
        if (outputStream != null) {
            outputStream.write(i5);
        }
    }
}
