package com.bumptech.glide.util;

import androidx.annotation.o0;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: MarkEnforcingInputStream.java */
/* loaded from: classes3.dex */
public class k extends FilterInputStream {

    /* renamed from: c, reason: collision with root package name */
    private static final int f44973c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    private static final int f44974d = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f44975b;

    public k(@o0 InputStream inputStream) {
        super(inputStream);
        this.f44975b = Integer.MIN_VALUE;
    }

    private long a(long j4) {
        int i4 = this.f44975b;
        if (i4 == 0) {
            return -1L;
        }
        return (i4 == Integer.MIN_VALUE || j4 <= ((long) i4)) ? j4 : i4;
    }

    private void b(long j4) {
        int i4 = this.f44975b;
        if (i4 == Integer.MIN_VALUE || j4 == -1) {
            return;
        }
        this.f44975b = (int) (i4 - j4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i4 = this.f44975b;
        return i4 == Integer.MIN_VALUE ? super.available() : Math.min(i4, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i4) {
        super.mark(i4);
        this.f44975b = i4;
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
        this.f44975b = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j4) throws IOException {
        long a5 = a(j4);
        if (a5 == -1) {
            return 0L;
        }
        long skip = super.skip(a5);
        b(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@o0 byte[] bArr, int i4, int i5) throws IOException {
        int a5 = (int) a(i5);
        if (a5 == -1) {
            return -1;
        }
        int read = super.read(bArr, i4, a5);
        b(read);
        return read;
    }
}
