package com.bumptech.glide.load.data;

import androidx.annotation.m1;
import androidx.annotation.o0;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: BufferedOutputStream.java */
/* loaded from: classes3.dex */
public final class c extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final OutputStream f43766b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f43767c;

    /* renamed from: d, reason: collision with root package name */
    private com.bumptech.glide.load.engine.bitmap_recycle.b f43768d;

    /* renamed from: e, reason: collision with root package name */
    private int f43769e;

    public c(@o0 OutputStream outputStream, @o0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this(outputStream, bVar, 65536);
    }

    private void a() throws IOException {
        int i4 = this.f43769e;
        if (i4 > 0) {
            this.f43766b.write(this.f43767c, 0, i4);
            this.f43769e = 0;
        }
    }

    private void b() throws IOException {
        if (this.f43769e == this.f43767c.length) {
            a();
        }
    }

    private void release() {
        byte[] bArr = this.f43767c;
        if (bArr != null) {
            this.f43768d.put(bArr);
            this.f43767c = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f43766b.close();
            release();
        } catch (Throwable th) {
            this.f43766b.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        a();
        this.f43766b.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i4) throws IOException {
        byte[] bArr = this.f43767c;
        int i5 = this.f43769e;
        this.f43769e = i5 + 1;
        bArr[i5] = (byte) i4;
        b();
    }

    @m1
    c(@o0 OutputStream outputStream, com.bumptech.glide.load.engine.bitmap_recycle.b bVar, int i4) {
        this.f43766b = outputStream;
        this.f43768d = bVar;
        this.f43767c = (byte[]) bVar.d(i4, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(@o0 byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(@o0 byte[] bArr, int i4, int i5) throws IOException {
        int i6 = 0;
        do {
            int i7 = i5 - i6;
            int i10 = i4 + i6;
            int i11 = this.f43769e;
            if (i11 == 0 && i7 >= this.f43767c.length) {
                this.f43766b.write(bArr, i10, i7);
                return;
            }
            int min = Math.min(i7, this.f43767c.length - i11);
            System.arraycopy(bArr, i10, this.f43767c, this.f43769e, min);
            this.f43769e += min;
            i6 += min;
            b();
        } while (i6 < i5);
    }
}
