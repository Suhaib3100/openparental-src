package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: BrokenOutputStream.java */
/* loaded from: classes5.dex */
public class a extends OutputStream {

    /* renamed from: o, reason: collision with root package name */
    private final IOException f32073o;

    public a(IOException iOException) {
        this.f32073o = iOException;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        throw this.f32073o;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        throw this.f32073o;
    }

    @Override // java.io.OutputStream
    public void write(int i5) throws IOException {
        throw this.f32073o;
    }

    public a() {
        this(new IOException("Broken output stream"));
    }
}
