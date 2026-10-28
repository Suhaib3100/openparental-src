package com.google.common.io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: CountingOutputStream.java */
@p
@d9.c
/* loaded from: classes6.dex */
public final class o extends FilterOutputStream {

    /* renamed from: b, reason: collision with root package name */
    private long f57151b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(OutputStream outputStream) {
        super(outputStream);
        outputStream.getClass();
    }

    public long a() {
        return this.f57151b;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i4, int i5) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i4, i5);
        this.f57151b += i5;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i4) throws IOException {
        ((FilterOutputStream) this).out.write(i4);
        this.f57151b++;
    }
}
