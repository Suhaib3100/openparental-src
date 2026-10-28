package com.bumptech.glide.util;

import androidx.annotation.o0;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: MarkEnforcingInputStream.java */
/* loaded from: classes.dex */
public class j extends FilterInputStream {

    /* renamed from: p, reason: collision with root package name */
    private static final int f12164p = Integer.MIN_VALUE;

    /* renamed from: q, reason: collision with root package name */
    private static final int f12165q = -1;

    /* renamed from: o, reason: collision with root package name */
    private int f12166o;

    public j(@o0 InputStream inputStream) {
        super(inputStream);
        this.f12166o = Integer.MIN_VALUE;
    }

    private long a(long j5) {
        int i5 = this.f12166o;
        if (i5 == 0) {
            return -1L;
        }
        return (i5 == Integer.MIN_VALUE || j5 <= ((long) i5)) ? j5 : i5;
    }

    private void b(long j5) {
        int i5 = this.f12166o;
        if (i5 == Integer.MIN_VALUE || j5 == -1) {
            return;
        }
        this.f12166o = (int) (i5 - j5);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i5 = this.f12166o;
        return i5 == Integer.MIN_VALUE ? super.available() : Math.min(i5, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i5) {
        super.mark(i5);
        this.f12166o = i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (a(1L) == -1) {
            return -1;
        }
        int read = super.read();
        b(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        super.reset();
        this.f12166o = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j5) throws IOException {
        long a6 = a(j5);
        if (a6 == -1) {
            return 0L;
        }
        long skip = super.skip(a6);
        b(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@o0 byte[] bArr, int i5, int i6) throws IOException {
        int a6 = (int) a(i6);
        if (a6 == -1) {
            return -1;
        }
        int read = super.read(bArr, i5, a6);
        b(read);
        return read;
    }
}
