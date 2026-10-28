package org.apache.commons.io.input;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

/* compiled from: NullReader.java */
/* loaded from: classes4.dex */
public class m extends Reader {

    /* renamed from: b, reason: collision with root package name */
    private final long f85472b;

    /* renamed from: c, reason: collision with root package name */
    private long f85473c;

    /* renamed from: d, reason: collision with root package name */
    private long f85474d;

    /* renamed from: e, reason: collision with root package name */
    private long f85475e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f85476f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f85477g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f85478h;

    public m(long j4) {
        this(j4, true, false);
    }

    private int a() throws EOFException {
        this.f85476f = true;
        if (this.f85477g) {
            throw new EOFException();
        }
        return -1;
    }

    public long b() {
        return this.f85473c;
    }

    public long c() {
        return this.f85472b;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f85476f = false;
        this.f85473c = 0L;
        this.f85474d = -1L;
    }

    protected int d() {
        return 0;
    }

    protected void e(char[] cArr, int i4, int i5) {
    }

    @Override // java.io.Reader
    public synchronized void mark(int i4) {
        if (!this.f85478h) {
            throw new UnsupportedOperationException("Mark not supported");
        }
        this.f85474d = this.f85473c;
        this.f85475e = i4;
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return this.f85478h;
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        if (this.f85476f) {
            throw new IOException("Read after end of file");
        }
        long j4 = this.f85473c;
        if (j4 == this.f85472b) {
            return a();
        }
        this.f85473c = j4 + 1;
        return d();
    }

    @Override // java.io.Reader
    public synchronized void reset() throws IOException {
        if (!this.f85478h) {
            throw new UnsupportedOperationException("Mark not supported");
        }
        long j4 = this.f85474d;
        if (j4 < 0) {
            throw new IOException("No position has been marked");
        }
        if (this.f85473c > this.f85475e + j4) {
            throw new IOException("Marked position [" + this.f85474d + "] is no longer valid - passed the read limit [" + this.f85475e + "]");
        }
        this.f85473c = j4;
        this.f85476f = false;
    }

    @Override // java.io.Reader
    public long skip(long j4) throws IOException {
        if (this.f85476f) {
            throw new IOException("Skip after end of file");
        }
        long j5 = this.f85473c;
        long j6 = this.f85472b;
        if (j5 == j6) {
            return a();
        }
        long j7 = j5 + j4;
        this.f85473c = j7;
        if (j7 <= j6) {
            return j4;
        }
        long j10 = j4 - (j7 - j6);
        this.f85473c = j6;
        return j10;
    }

    public m(long j4, boolean z4, boolean z5) {
        this.f85474d = -1L;
        this.f85472b = j4;
        this.f85478h = z4;
        this.f85477g = z5;
    }

    @Override // java.io.Reader
    public int read(char[] cArr) throws IOException {
        return read(cArr, 0, cArr.length);
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i4, int i5) throws IOException {
        if (!this.f85476f) {
            long j4 = this.f85473c;
            long j5 = this.f85472b;
            if (j4 == j5) {
                return a();
            }
            long j6 = j4 + i5;
            this.f85473c = j6;
            if (j6 > j5) {
                i5 -= (int) (j6 - j5);
                this.f85473c = j5;
            }
            e(cArr, i4, i5);
            return i5;
        }
        throw new IOException("Read after end of file");
    }
}
