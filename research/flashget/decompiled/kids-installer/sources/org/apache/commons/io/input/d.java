package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: BrokenInputStream.java */
/* loaded from: classes5.dex */
public class d extends InputStream {

    /* renamed from: o, reason: collision with root package name */
    private final IOException f31936o;

    public d(IOException iOException) {
        this.f31936o = iOException;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        throw this.f31936o;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        throw this.f31936o;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        throw this.f31936o;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        throw this.f31936o;
    }

    @Override // java.io.InputStream
    public long skip(long j5) throws IOException {
        throw this.f31936o;
    }

    public d() {
        this(new IOException("Broken input stream"));
    }
}
