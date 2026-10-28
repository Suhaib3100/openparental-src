package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: BrokenInputStream.java */
/* loaded from: classes4.dex */
public class d extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    private final IOException f85453b;

    public d(IOException iOException) {
        this.f85453b = iOException;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        throw this.f85453b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        throw this.f85453b;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        throw this.f85453b;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        throw this.f85453b;
    }

    @Override // java.io.InputStream
    public long skip(long j4) throws IOException {
        throw this.f85453b;
    }

    public d() {
        this(new IOException("Broken input stream"));
    }
}
