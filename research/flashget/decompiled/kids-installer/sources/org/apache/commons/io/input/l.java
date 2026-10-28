package org.apache.commons.io.input;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: NullInputStream.java */
/* loaded from: classes5.dex */
public class l extends InputStream {

    /* renamed from: o, reason: collision with root package name */
    private final long f31948o;

    /* renamed from: p, reason: collision with root package name */
    private long f31949p;

    /* renamed from: q, reason: collision with root package name */
    private long f31950q;

    /* renamed from: r, reason: collision with root package name */
    private long f31951r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f31952s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f31953t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f31954u;

    public l(long j5) {
        this(j5, true, false);
    }

    private int a() throws EOFException {
        this.f31952s = true;
        if (this.f31953t) {
            throw new EOFException();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int available() {
        long j5 = this.f31948o - this.f31949p;
        if (j5 <= 0) {
            return 0;
        }
        if (j5 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j5;
    }

    public long b() {
        return this.f31949p;
    }

    public long c() {
        return this.f31948o;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f31952s = false;
        this.f31949p = 0L;
        this.f31950q = -1L;
    }

    protected int d() {
        return 0;
    }

    protected void e(byte[] bArr, int i5, int i6) {
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i5) {
        if (!this.f31954u) {
            throw new UnsupportedOperationException("Mark not supported");
        }
        this.f31950q = this.f31949p;
        this.f31951r = i5;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f31954u;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f31952s) {
            throw new IOException("Read after end of file");
        }
        long j5 = this.f31949p;
        if (j5 == this.f31948o) {
            return a();
        }
        this.f31949p = j5 + 1;
        return d();
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        if (!this.f31954u) {
            throw new UnsupportedOperationException("Mark not supported");
        }
        long j5 = this.f31950q;
        if (j5 < 0) {
            throw new IOException("No position has been marked");
        }
        if (this.f31949p > this.f31951r + j5) {
            throw new IOException("Marked position [" + this.f31950q + "] is no longer valid - passed the read limit [" + this.f31951r + "]");
        }
        this.f31949p = j5;
        this.f31952s = false;
    }

    @Override // java.io.InputStream
    public long skip(long j5) throws IOException {
        if (this.f31952s) {
            throw new IOException("Skip after end of file");
        }
        long j6 = this.f31949p;
        long j7 = this.f31948o;
        if (j6 == j7) {
            return a();
        }
        long j8 = j6 + j5;
        this.f31949p = j8;
        if (j8 <= j7) {
            return j5;
        }
        long j9 = j5 - (j8 - j7);
        this.f31949p = j7;
        return j9;
    }

    public l(long j5, boolean z5, boolean z6) {
        this.f31950q = -1L;
        this.f31948o = j5;
        this.f31954u = z5;
        this.f31953t = z6;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i5, int i6) throws IOException {
        if (!this.f31952s) {
            long j5 = this.f31949p;
            long j6 = this.f31948o;
            if (j5 == j6) {
                return a();
            }
            long j7 = j5 + i6;
            this.f31949p = j7;
            if (j7 > j6) {
                i6 -= (int) (j7 - j6);
                this.f31949p = j6;
            }
            e(bArr, i5, i6);
            return i6;
        }
        throw new IOException("Read after end of file");
    }
}
