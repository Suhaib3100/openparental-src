package com.bumptech.glide.load.data;

import androidx.annotation.m1;
import androidx.annotation.o0;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: BufferedOutputStream.java */
/* loaded from: classes.dex */
public final class c extends OutputStream {

    /* renamed from: o, reason: collision with root package name */
    @o0
    private final OutputStream f11060o;

    /* renamed from: p, reason: collision with root package name */
    private byte[] f11061p;

    /* renamed from: q, reason: collision with root package name */
    private com.bumptech.glide.load.engine.bitmap_recycle.b f11062q;

    /* renamed from: r, reason: collision with root package name */
    private int f11063r;

    public c(@o0 OutputStream outputStream, @o0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this(outputStream, bVar, 65536);
    }

    private void a() throws IOException {
        int i5 = this.f11063r;
        if (i5 > 0) {
            this.f11060o.write(this.f11061p, 0, i5);
            this.f11063r = 0;
        }
    }

    private void b() throws IOException {
        if (this.f11063r == this.f11061p.length) {
            a();
        }
    }

    private void release() {
        byte[] bArr = this.f11061p;
        if (bArr != null) {
            this.f11062q.put(bArr);
            this.f11061p = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f11060o.close();
            release();
        } catch (Throwable th) {
            this.f11060o.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        a();
        this.f11060o.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i5) throws IOException {
        byte[] bArr = this.f11061p;
        int i6 = this.f11063r;
        this.f11063r = i6 + 1;
        bArr[i6] = (byte) i5;
        b();
    }

    @m1
    c(@o0 OutputStream outputStream, com.bumptech.glide.load.engine.bitmap_recycle.b bVar, int i5) {
        this.f11060o = outputStream;
        this.f11062q = bVar;
        this.f11061p = (byte[]) bVar.e(i5, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(@o0 byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(@o0 byte[] bArr, int i5, int i6) throws IOException {
        int i7 = 0;
        do {
            int i8 = i6 - i7;
            int i9 = i5 + i7;
            int i10 = this.f11063r;
            if (i10 == 0 && i8 >= this.f11061p.length) {
                this.f11060o.write(bArr, i9, i8);
                return;
            }
            int min = Math.min(i8, this.f11061p.length - i10);
            System.arraycopy(bArr, i9, this.f11061p, this.f11063r, min);
            this.f11063r += min;
            i7 += min;
            b();
        } while (i7 < i6);
    }
}
