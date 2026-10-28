package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: DemuxInputStream.java */
/* loaded from: classes4.dex */
public class k extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    private final InheritableThreadLocal<InputStream> f85464b = new InheritableThreadLocal<>();

    public InputStream a(InputStream inputStream) {
        InputStream inputStream2 = this.f85464b.get();
        this.f85464b.set(inputStream);
        return inputStream2;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f85464b.get();
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        InputStream inputStream = this.f85464b.get();
        if (inputStream != null) {
            return inputStream.read();
        }
        return -1;
    }
}
