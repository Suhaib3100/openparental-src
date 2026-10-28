package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: BrokenOutputStream.java */
/* loaded from: classes4.dex */
public class a extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    private final IOException f85585b;

    public a(IOException iOException) {
        this.f85585b = iOException;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        throw this.f85585b;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        throw this.f85585b;
    }

    @Override // java.io.OutputStream
    public void write(int i4) throws IOException {
        throw this.f85585b;
    }

    public a() {
        this(new IOException("Broken output stream"));
    }
}
