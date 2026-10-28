package com.nostra13.universalimageloader.core.assist;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: ContentLengthInputStream.java */
/* loaded from: classes6.dex */
public class a extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    private final InputStream f70258b;

    /* renamed from: c, reason: collision with root package name */
    private final int f70259c;

    public a(InputStream inputStream, int i4) {
        this.f70258b = inputStream;
        this.f70259c = i4;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f70259c;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f70258b.close();
    }

    @Override // java.io.InputStream
    public void mark(int i4) {
        this.f70258b.mark(i4);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f70258b.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        return this.f70258b.read();
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        this.f70258b.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j4) throws IOException {
        return this.f70258b.skip(j4);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return this.f70258b.read(bArr);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        return this.f70258b.read(bArr, i4, i5);
    }
}
