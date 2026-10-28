package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: BoundedInputStream.java */
/* loaded from: classes4.dex */
public class c extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    private final InputStream f85448b;

    /* renamed from: c, reason: collision with root package name */
    private final long f85449c;

    /* renamed from: d, reason: collision with root package name */
    private long f85450d;

    /* renamed from: e, reason: collision with root package name */
    private long f85451e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f85452f;

    public c(InputStream inputStream, long j4) {
        this.f85450d = 0L;
        this.f85451e = -1L;
        this.f85452f = true;
        this.f85449c = j4;
        this.f85448b = inputStream;
    }

    public boolean a() {
        return this.f85452f;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        long j4 = this.f85449c;
        if (j4 < 0 || this.f85450d < j4) {
            return this.f85448b.available();
        }
        return 0;
    }

    public void b(boolean z4) {
        this.f85452f = z4;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f85452f) {
            this.f85448b.close();
        }
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i4) {
        this.f85448b.mark(i4);
        this.f85451e = this.f85450d;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f85448b.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        long j4 = this.f85449c;
        if (j4 >= 0 && this.f85450d >= j4) {
            return -1;
        }
        int read = this.f85448b.read();
        this.f85450d++;
        return read;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f85448b.reset();
        this.f85450d = this.f85451e;
    }

    @Override // java.io.InputStream
    public long skip(long j4) throws IOException {
        long j5 = this.f85449c;
        if (j5 >= 0) {
            j4 = Math.min(j4, j5 - this.f85450d);
        }
        long skip = this.f85448b.skip(j4);
        this.f85450d += skip;
        return skip;
    }

    public String toString() {
        return this.f85448b.toString();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        long j4 = this.f85449c;
        if (j4 >= 0 && this.f85450d >= j4) {
            return -1;
        }
        int read = this.f85448b.read(bArr, i4, (int) (j4 >= 0 ? Math.min(i5, j4 - this.f85450d) : i5));
        if (read == -1) {
            return -1;
        }
        this.f85450d += read;
        return read;
    }

    public c(InputStream inputStream) {
        this(inputStream, -1L);
    }
}
