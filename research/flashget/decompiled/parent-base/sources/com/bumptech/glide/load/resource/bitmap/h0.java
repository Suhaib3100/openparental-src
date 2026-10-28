package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.m1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: RecyclableBufferedInputStream.java */
/* loaded from: classes3.dex */
public class h0 extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    private volatile byte[] f44481b;

    /* renamed from: c, reason: collision with root package name */
    private int f44482c;

    /* renamed from: d, reason: collision with root package name */
    private int f44483d;

    /* renamed from: e, reason: collision with root package name */
    private int f44484e;

    /* renamed from: f, reason: collision with root package name */
    private int f44485f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f44486g;

    /* compiled from: RecyclableBufferedInputStream.java */
    static class a extends IOException {

        /* renamed from: b, reason: collision with root package name */
        private static final long f44487b = -4338378848813561757L;

        a(String str) {
            super(str);
        }
    }

    public h0(@androidx.annotation.o0 InputStream inputStream, @androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this(inputStream, bVar, 65536);
    }

    private int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i4 = this.f44484e;
        if (i4 != -1) {
            int i5 = this.f44485f - i4;
            int i6 = this.f44483d;
            if (i5 < i6) {
                if (i4 == 0 && i6 > bArr.length && this.f44482c == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i6) {
                        i6 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f44486g.d(i6, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f44481b = bArr2;
                    this.f44486g.put(bArr);
                    bArr = bArr2;
                } else if (i4 > 0) {
                    System.arraycopy(bArr, i4, bArr, 0, bArr.length - i4);
                }
                int i7 = this.f44485f - this.f44484e;
                this.f44485f = i7;
                this.f44484e = 0;
                this.f44482c = 0;
                int read = inputStream.read(bArr, i7, bArr.length - i7);
                int i10 = this.f44485f;
                if (read > 0) {
                    i10 += read;
                }
                this.f44482c = i10;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f44484e = -1;
            this.f44485f = 0;
            this.f44482c = read2;
        }
        return read2;
    }

    private static IOException c() throws IOException {
        throw new IOException(ProtectedSandApp.s("ব"));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f44481b == null || inputStream == null) {
            throw c();
        }
        return (this.f44482c - this.f44485f) + inputStream.available();
    }

    public synchronized void b() {
        this.f44483d = this.f44481b.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f44481b != null) {
            this.f44486g.put(this.f44481b);
            this.f44481b = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i4) {
        this.f44483d = Math.max(this.f44483d, i4);
        this.f44484e = this.f44485f;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.f44481b;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw c();
        }
        if (this.f44485f >= this.f44482c && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f44481b && (bArr = this.f44481b) == null) {
            throw c();
        }
        int i4 = this.f44482c;
        int i5 = this.f44485f;
        if (i4 - i5 <= 0) {
            return -1;
        }
        this.f44485f = i5 + 1;
        return bArr[i5] & 255;
    }

    public synchronized void release() {
        if (this.f44481b != null) {
            this.f44486g.put(this.f44481b);
            this.f44481b = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        String s4 = ProtectedSandApp.s("ভ");
        synchronized (this) {
            if (this.f44481b == null) {
                throw new IOException(ProtectedSandApp.s("য"));
            }
            int i4 = this.f44484e;
            if (-1 == i4) {
                throw new a(s4 + this.f44485f + ProtectedSandApp.s("ম") + this.f44483d);
            }
            this.f44485f = i4;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j4) throws IOException {
        if (j4 < 1) {
            return 0L;
        }
        byte[] bArr = this.f44481b;
        if (bArr == null) {
            throw c();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw c();
        }
        int i4 = this.f44482c;
        int i5 = this.f44485f;
        if (i4 - i5 >= j4) {
            this.f44485f = (int) (i5 + j4);
            return j4;
        }
        long j5 = i4 - i5;
        this.f44485f = i4;
        if (this.f44484e == -1 || j4 > this.f44483d) {
            long skip = inputStream.skip(j4 - j5);
            if (skip > 0) {
                this.f44484e = -1;
            }
            return j5 + skip;
        }
        if (a(inputStream, bArr) == -1) {
            return j5;
        }
        int i6 = this.f44482c;
        int i7 = this.f44485f;
        if (i6 - i7 >= j4 - j5) {
            this.f44485f = (int) ((i7 + j4) - j5);
            return j4;
        }
        long j6 = (j5 + i6) - i7;
        this.f44485f = i6;
        return j6;
    }

    @m1
    h0(@androidx.annotation.o0 InputStream inputStream, @androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar, int i4) {
        super(inputStream);
        this.f44484e = -1;
        this.f44486g = bVar;
        this.f44481b = (byte[]) bVar.d(i4, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(@androidx.annotation.o0 byte[] bArr, int i4, int i5) throws IOException {
        int i6;
        int i7;
        byte[] bArr2 = this.f44481b;
        if (bArr2 == null) {
            throw c();
        }
        if (i5 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i10 = this.f44485f;
            int i11 = this.f44482c;
            if (i10 < i11) {
                int i12 = i11 - i10 >= i5 ? i5 : i11 - i10;
                System.arraycopy(bArr2, i10, bArr, i4, i12);
                this.f44485f += i12;
                if (i12 == i5 || inputStream.available() == 0) {
                    return i12;
                }
                i4 += i12;
                i6 = i5 - i12;
            } else {
                i6 = i5;
            }
            while (true) {
                if (this.f44484e == -1 && i6 >= bArr2.length) {
                    i7 = inputStream.read(bArr, i4, i6);
                    if (i7 == -1) {
                        return i6 != i5 ? i5 - i6 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i6 != i5 ? i5 - i6 : -1;
                    }
                    if (bArr2 != this.f44481b && (bArr2 = this.f44481b) == null) {
                        throw c();
                    }
                    int i13 = this.f44482c;
                    int i14 = this.f44485f;
                    i7 = i13 - i14 >= i6 ? i6 : i13 - i14;
                    System.arraycopy(bArr2, i14, bArr, i4, i7);
                    this.f44485f += i7;
                }
                i6 -= i7;
                if (i6 == 0) {
                    return i5;
                }
                if (inputStream.available() == 0) {
                    return i5 - i6;
                }
                i4 += i7;
            }
        } else {
            throw c();
        }
    }
}
