package org.apache.commons.io.input;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: NullInputStream.java */
/* loaded from: classes4.dex */
public class l extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    private final long f85465b;

    /* renamed from: c, reason: collision with root package name */
    private long f85466c;

    /* renamed from: d, reason: collision with root package name */
    private long f85467d;

    /* renamed from: e, reason: collision with root package name */
    private long f85468e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f85469f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f85470g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f85471h;

    public l(long j4) {
        this(j4, true, false);
    }

    private int a() throws EOFException {
        this.f85469f = true;
        if (this.f85470g) {
            throw new EOFException();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int available() {
        long j4 = this.f85465b - this.f85466c;
        if (j4 <= 0) {
            return 0;
        }
        if (j4 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j4;
    }

    public long b() {
        return this.f85466c;
    }

    public long c() {
        return this.f85465b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f85469f = false;
        this.f85466c = 0L;
        this.f85467d = -1L;
    }

    protected int d() {
        return 0;
    }

    protected void e(byte[] bArr, int i4, int i5) {
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i4) {
        if (!this.f85471h) {
            throw new UnsupportedOperationException("Mark not supported");
        }
        this.f85467d = this.f85466c;
        this.f85468e = i4;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f85471h;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f85469f) {
            throw new IOException("Read after end of file");
        }
        long j4 = this.f85466c;
        if (j4 == this.f85465b) {
            return a();
        }
        this.f85466c = j4 + 1;
        return d();
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        if (!this.f85471h) {
            throw new UnsupportedOperationException("Mark not supported");
        }
        long j4 = this.f85467d;
        if (j4 < 0) {
            throw new IOException("No position has been marked");
        }
        if (this.f85466c > this.f85468e + j4) {
            throw new IOException("Marked position [" + this.f85467d + "] is no longer valid - passed the read limit [" + this.f85468e + "]");
        }
        this.f85466c = j4;
        this.f85469f = false;
    }

    @Override // java.io.InputStream
    public long skip(long j4) throws IOException {
        if (this.f85469f) {
            throw new IOException("Skip after end of file");
        }
        long j5 = this.f85466c;
        long j6 = this.f85465b;
        if (j5 == j6) {
            return a();
        }
        long j7 = j5 + j4;
        this.f85466c = j7;
        if (j7 <= j6) {
            return j4;
        }
        long j10 = j4 - (j7 - j6);
        this.f85466c = j6;
        return j10;
    }

    public l(long j4, boolean z4, boolean z5) {
        this.f85467d = -1L;
        this.f85465b = j4;
        this.f85471h = z4;
        this.f85470g = z5;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        if (!this.f85469f) {
            long j4 = this.f85466c;
            long j5 = this.f85465b;
            if (j4 == j5) {
                return a();
            }
            long j6 = j4 + i5;
            this.f85466c = j6;
            if (j6 > j5) {
                i5 -= (int) (j6 - j5);
                this.f85466c = j5;
            }
            e(bArr, i4, i5);
            return i5;
        }
        throw new IOException("Read after end of file");
    }
}
