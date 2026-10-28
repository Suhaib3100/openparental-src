package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.m1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;

/* compiled from: RecyclableBufferedInputStream.java */
/* loaded from: classes.dex */
public class g0 extends FilterInputStream {

    /* renamed from: o, reason: collision with root package name */
    private volatile byte[] f11716o;

    /* renamed from: p, reason: collision with root package name */
    private int f11717p;

    /* renamed from: q, reason: collision with root package name */
    private int f11718q;

    /* renamed from: r, reason: collision with root package name */
    private int f11719r;

    /* renamed from: s, reason: collision with root package name */
    private int f11720s;

    /* renamed from: t, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f11721t;

    /* compiled from: RecyclableBufferedInputStream.java */
    static class a extends IOException {

        /* renamed from: o, reason: collision with root package name */
        private static final long f11722o = -4338378848813561757L;

        a(String str) {
            super(str);
        }
    }

    public g0(@androidx.annotation.o0 InputStream inputStream, @androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this(inputStream, bVar, 65536);
    }

    private int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i5 = this.f11719r;
        if (i5 != -1) {
            int i6 = this.f11720s - i5;
            int i7 = this.f11718q;
            if (i6 < i7) {
                if (i5 == 0 && i7 > bArr.length && this.f11717p == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i7) {
                        i7 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f11721t.e(i7, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f11716o = bArr2;
                    this.f11721t.put(bArr);
                    bArr = bArr2;
                } else if (i5 > 0) {
                    System.arraycopy(bArr, i5, bArr, 0, bArr.length - i5);
                }
                int i8 = this.f11720s - this.f11719r;
                this.f11720s = i8;
                this.f11719r = 0;
                this.f11717p = 0;
                int read = inputStream.read(bArr, i8, bArr.length - i8);
                int i9 = this.f11720s;
                if (read > 0) {
                    i9 += read;
                }
                this.f11717p = i9;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f11719r = -1;
            this.f11720s = 0;
            this.f11717p = read2;
        }
        return read2;
    }

    private static IOException c() throws IOException {
        throw new IOException(ProtectedSandApp.s("Ƙ"));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f11716o == null || inputStream == null) {
            throw c();
        }
        return (this.f11717p - this.f11720s) + inputStream.available();
    }

    public synchronized void b() {
        this.f11718q = this.f11716o.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f11716o != null) {
            this.f11721t.put(this.f11716o);
            this.f11716o = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i5) {
        this.f11718q = Math.max(this.f11718q, i5);
        this.f11719r = this.f11720s;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.f11716o;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw c();
        }
        if (this.f11720s >= this.f11717p && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f11716o && (bArr = this.f11716o) == null) {
            throw c();
        }
        int i5 = this.f11717p;
        int i6 = this.f11720s;
        if (i5 - i6 <= 0) {
            return -1;
        }
        this.f11720s = i6 + 1;
        return bArr[i6] & UByte.f27220r;
    }

    public synchronized void release() {
        if (this.f11716o != null) {
            this.f11721t.put(this.f11716o);
            this.f11716o = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        String s5 = ProtectedSandApp.s("ƙ");
        synchronized (this) {
            if (this.f11716o == null) {
                throw new IOException(ProtectedSandApp.s("ƛ"));
            }
            int i5 = this.f11719r;
            if (-1 == i5) {
                throw new a(s5 + this.f11720s + ProtectedSandApp.s("ƚ") + this.f11718q);
            }
            this.f11720s = i5;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j5) throws IOException {
        if (j5 < 1) {
            return 0L;
        }
        byte[] bArr = this.f11716o;
        if (bArr == null) {
            throw c();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw c();
        }
        int i5 = this.f11717p;
        int i6 = this.f11720s;
        if (i5 - i6 >= j5) {
            this.f11720s = (int) (i6 + j5);
            return j5;
        }
        long j6 = i5 - i6;
        this.f11720s = i5;
        if (this.f11719r == -1 || j5 > this.f11718q) {
            long skip = inputStream.skip(j5 - j6);
            if (skip > 0) {
                this.f11719r = -1;
            }
            return j6 + skip;
        }
        if (a(inputStream, bArr) == -1) {
            return j6;
        }
        int i7 = this.f11717p;
        int i8 = this.f11720s;
        if (i7 - i8 >= j5 - j6) {
            this.f11720s = (int) ((i8 + j5) - j6);
            return j5;
        }
        long j7 = (j6 + i7) - i8;
        this.f11720s = i7;
        return j7;
    }

    @m1
    g0(@androidx.annotation.o0 InputStream inputStream, @androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar, int i5) {
        super(inputStream);
        this.f11719r = -1;
        this.f11721t = bVar;
        this.f11716o = (byte[]) bVar.e(i5, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(@androidx.annotation.o0 byte[] bArr, int i5, int i6) throws IOException {
        int i7;
        int i8;
        byte[] bArr2 = this.f11716o;
        if (bArr2 == null) {
            throw c();
        }
        if (i6 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i9 = this.f11720s;
            int i10 = this.f11717p;
            if (i9 < i10) {
                int i11 = i10 - i9 >= i6 ? i6 : i10 - i9;
                System.arraycopy(bArr2, i9, bArr, i5, i11);
                this.f11720s += i11;
                if (i11 == i6 || inputStream.available() == 0) {
                    return i11;
                }
                i5 += i11;
                i7 = i6 - i11;
            } else {
                i7 = i6;
            }
            while (true) {
                if (this.f11719r == -1 && i7 >= bArr2.length) {
                    i8 = inputStream.read(bArr, i5, i7);
                    if (i8 == -1) {
                        return i7 != i6 ? i6 - i7 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i7 != i6 ? i6 - i7 : -1;
                    }
                    if (bArr2 != this.f11716o && (bArr2 = this.f11716o) == null) {
                        throw c();
                    }
                    int i12 = this.f11717p;
                    int i13 = this.f11720s;
                    i8 = i12 - i13 >= i7 ? i7 : i12 - i13;
                    System.arraycopy(bArr2, i13, bArr, i5, i8);
                    this.f11720s += i8;
                }
                i7 -= i8;
                if (i7 == 0) {
                    return i6;
                }
                if (inputStream.available() == 0) {
                    return i6 - i7;
                }
                i5 += i8;
            }
        } else {
            throw c();
        }
    }
}
