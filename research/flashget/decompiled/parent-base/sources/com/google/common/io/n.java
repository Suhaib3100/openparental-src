package com.google.common.io;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: CountingInputStream.java */
@p
@d9.a
@d9.c
/* loaded from: classes6.dex */
public final class n extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    private long f57149b;

    /* renamed from: c, reason: collision with root package name */
    private long f57150c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(InputStream inputStream) {
        super(inputStream);
        inputStream.getClass();
        this.f57150c = -1L;
    }

    public long a() {
        return this.f57149b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i4) {
        ((FilterInputStream) this).in.mark(i4);
        this.f57150c = this.f57149b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.f57149b++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException(ProtectedSandApp.s("\uf6b7"));
        }
        if (this.f57150c == -1) {
            throw new IOException(ProtectedSandApp.s("\uf6b6"));
        }
        ((FilterInputStream) this).in.reset();
        this.f57149b = this.f57150c;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j4) throws IOException {
        long skip = ((FilterInputStream) this).in.skip(j4);
        this.f57149b += skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        int read = ((FilterInputStream) this).in.read(bArr, i4, i5);
        if (read != -1) {
            this.f57149b += read;
        }
        return read;
    }
}
