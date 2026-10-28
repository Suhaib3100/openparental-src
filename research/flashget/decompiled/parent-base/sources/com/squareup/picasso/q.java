package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: MarkableInputStream.java */
/* loaded from: classes6.dex */
final class q extends InputStream {

    /* renamed from: i, reason: collision with root package name */
    private static final int f70949i = 4096;

    /* renamed from: j, reason: collision with root package name */
    private static final int f70950j = 1024;

    /* renamed from: b, reason: collision with root package name */
    private final InputStream f70951b;

    /* renamed from: c, reason: collision with root package name */
    private long f70952c;

    /* renamed from: d, reason: collision with root package name */
    private long f70953d;

    /* renamed from: e, reason: collision with root package name */
    private long f70954e;

    /* renamed from: f, reason: collision with root package name */
    private long f70955f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f70956g;

    /* renamed from: h, reason: collision with root package name */
    private int f70957h;

    q(InputStream inputStream) {
        this(inputStream, 4096);
    }

    private void d(long j4) {
        try {
            long j5 = this.f70953d;
            long j6 = this.f70952c;
            if (j5 >= j6 || j6 > this.f70954e) {
                this.f70953d = j6;
                this.f70951b.mark((int) (j4 - j6));
            } else {
                this.f70951b.reset();
                this.f70951b.mark((int) (j4 - this.f70953d));
                e(this.f70953d, this.f70952c);
            }
            this.f70954e = j4;
        } catch (IOException e4) {
            throw new IllegalStateException("Unable to mark: " + e4);
        }
    }

    private void e(long j4, long j5) throws IOException {
        while (j4 < j5) {
            long skip = this.f70951b.skip(j5 - j4);
            if (skip == 0) {
                if (read() == -1) {
                    return;
                } else {
                    skip = 1;
                }
            }
            j4 += skip;
        }
    }

    public void a(boolean z4) {
        this.f70956g = z4;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f70951b.available();
    }

    public void b(long j4) throws IOException {
        if (this.f70952c > this.f70954e || j4 < this.f70953d) {
            throw new IOException("Cannot reset");
        }
        this.f70951b.reset();
        e(this.f70953d, j4);
        this.f70952c = j4;
    }

    public long c(int i4) {
        long j4 = this.f70952c + i4;
        if (this.f70954e < j4) {
            d(j4);
        }
        return this.f70952c;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f70951b.close();
    }

    @Override // java.io.InputStream
    public void mark(int i4) {
        this.f70955f = c(i4);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f70951b.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (!this.f70956g) {
            long j4 = this.f70952c + 1;
            long j5 = this.f70954e;
            if (j4 > j5) {
                d(j5 + this.f70957h);
            }
        }
        int read = this.f70951b.read();
        if (read != -1) {
            this.f70952c++;
        }
        return read;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        b(this.f70955f);
    }

    @Override // java.io.InputStream
    public long skip(long j4) throws IOException {
        if (!this.f70956g) {
            long j5 = this.f70952c;
            if (j5 + j4 > this.f70954e) {
                d(j5 + j4 + this.f70957h);
            }
        }
        long skip = this.f70951b.skip(j4);
        this.f70952c += skip;
        return skip;
    }

    q(InputStream inputStream, int i4) {
        this(inputStream, i4, 1024);
    }

    private q(InputStream inputStream, int i4, int i5) {
        this.f70955f = -1L;
        this.f70956g = true;
        this.f70957h = -1;
        this.f70951b = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, i4);
        this.f70957h = i5;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        if (!this.f70956g) {
            long j4 = this.f70952c;
            if (bArr.length + j4 > this.f70954e) {
                d(j4 + bArr.length + this.f70957h);
            }
        }
        int read = this.f70951b.read(bArr);
        if (read != -1) {
            this.f70952c += read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        if (!this.f70956g) {
            long j4 = this.f70952c;
            long j5 = i5;
            if (j4 + j5 > this.f70954e) {
                d(j4 + j5 + this.f70957h);
            }
        }
        int read = this.f70951b.read(bArr, i4, i5);
        if (read != -1) {
            this.f70952c += read;
        }
        return read;
    }
}
