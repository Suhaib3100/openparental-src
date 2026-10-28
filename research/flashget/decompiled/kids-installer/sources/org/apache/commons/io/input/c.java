package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: BoundedInputStream.java */
/* loaded from: classes5.dex */
public class c extends InputStream {

    /* renamed from: o, reason: collision with root package name */
    private final InputStream f31931o;

    /* renamed from: p, reason: collision with root package name */
    private final long f31932p;

    /* renamed from: q, reason: collision with root package name */
    private long f31933q;

    /* renamed from: r, reason: collision with root package name */
    private long f31934r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f31935s;

    public c(InputStream inputStream, long j5) {
        this.f31933q = 0L;
        this.f31934r = -1L;
        this.f31935s = true;
        this.f31932p = j5;
        this.f31931o = inputStream;
    }

    public boolean a() {
        return this.f31935s;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        long j5 = this.f31932p;
        if (j5 < 0 || this.f31933q < j5) {
            return this.f31931o.available();
        }
        return 0;
    }

    public void b(boolean z5) {
        this.f31935s = z5;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f31935s) {
            this.f31931o.close();
        }
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i5) {
        this.f31931o.mark(i5);
        this.f31934r = this.f31933q;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f31931o.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        long j5 = this.f31932p;
        if (j5 >= 0 && this.f31933q >= j5) {
            return -1;
        }
        int read = this.f31931o.read();
        this.f31933q++;
        return read;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f31931o.reset();
        this.f31933q = this.f31934r;
    }

    @Override // java.io.InputStream
    public long skip(long j5) throws IOException {
        long j6 = this.f31932p;
        if (j6 >= 0) {
            j5 = Math.min(j5, j6 - this.f31933q);
        }
        long skip = this.f31931o.skip(j5);
        this.f31933q += skip;
        return skip;
    }

    public String toString() {
        return this.f31931o.toString();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i5, int i6) throws IOException {
        long j5 = this.f31932p;
        if (j5 >= 0 && this.f31933q >= j5) {
            return -1;
        }
        int read = this.f31931o.read(bArr, i5, (int) (j5 >= 0 ? Math.min(i6, j5 - this.f31933q) : i6));
        if (read == -1) {
            return -1;
        }
        this.f31933q += read;
        return read;
    }

    public c(InputStream inputStream) {
        this(inputStream, -1L);
    }
}
