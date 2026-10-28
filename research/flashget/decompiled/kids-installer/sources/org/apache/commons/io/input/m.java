package org.apache.commons.io.input;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

/* compiled from: NullReader.java */
/* loaded from: classes5.dex */
public class m extends Reader {

    /* renamed from: o, reason: collision with root package name */
    private final long f31955o;

    /* renamed from: p, reason: collision with root package name */
    private long f31956p;

    /* renamed from: q, reason: collision with root package name */
    private long f31957q;

    /* renamed from: r, reason: collision with root package name */
    private long f31958r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f31959s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f31960t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f31961u;

    public m(long j5) {
        this(j5, true, false);
    }

    private int a() throws EOFException {
        this.f31959s = true;
        if (this.f31960t) {
            throw new EOFException();
        }
        return -1;
    }

    public long b() {
        return this.f31956p;
    }

    public long c() {
        return this.f31955o;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f31959s = false;
        this.f31956p = 0L;
        this.f31957q = -1L;
    }

    protected int d() {
        return 0;
    }

    protected void e(char[] cArr, int i5, int i6) {
    }

    @Override // java.io.Reader
    public synchronized void mark(int i5) {
        if (!this.f31961u) {
            throw new UnsupportedOperationException("Mark not supported");
        }
        this.f31957q = this.f31956p;
        this.f31958r = i5;
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return this.f31961u;
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        if (this.f31959s) {
            throw new IOException("Read after end of file");
        }
        long j5 = this.f31956p;
        if (j5 == this.f31955o) {
            return a();
        }
        this.f31956p = j5 + 1;
        return d();
    }

    @Override // java.io.Reader
    public synchronized void reset() throws IOException {
        if (!this.f31961u) {
            throw new UnsupportedOperationException("Mark not supported");
        }
        long j5 = this.f31957q;
        if (j5 < 0) {
            throw new IOException("No position has been marked");
        }
        if (this.f31956p > this.f31958r + j5) {
            throw new IOException("Marked position [" + this.f31957q + "] is no longer valid - passed the read limit [" + this.f31958r + "]");
        }
        this.f31956p = j5;
        this.f31959s = false;
    }

    @Override // java.io.Reader
    public long skip(long j5) throws IOException {
        if (this.f31959s) {
            throw new IOException("Skip after end of file");
        }
        long j6 = this.f31956p;
        long j7 = this.f31955o;
        if (j6 == j7) {
            return a();
        }
        long j8 = j6 + j5;
        this.f31956p = j8;
        if (j8 <= j7) {
            return j5;
        }
        long j9 = j5 - (j8 - j7);
        this.f31956p = j7;
        return j9;
    }

    public m(long j5, boolean z5, boolean z6) {
        this.f31957q = -1L;
        this.f31955o = j5;
        this.f31961u = z5;
        this.f31960t = z6;
    }

    @Override // java.io.Reader
    public int read(char[] cArr) throws IOException {
        return read(cArr, 0, cArr.length);
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i5, int i6) throws IOException {
        if (!this.f31959s) {
            long j5 = this.f31956p;
            long j6 = this.f31955o;
            if (j5 == j6) {
                return a();
            }
            long j7 = j5 + i6;
            this.f31956p = j7;
            if (j7 > j6) {
                i6 -= (int) (j7 - j6);
                this.f31956p = j6;
            }
            e(cArr, i5, i6);
            return i6;
        }
        throw new IOException("Read after end of file");
    }
}
