package com.google.common.hash;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: HashingOutputStream.java */
@d9.a
@k
/* loaded from: classes6.dex */
public final class u extends FilterOutputStream {

    /* renamed from: b, reason: collision with root package name */
    private final r f57041b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(q qVar, OutputStream outputStream) {
        super(outputStream);
        outputStream.getClass();
        r f4 = qVar.f();
        f4.getClass();
        this.f57041b = f4;
    }

    public p a() {
        return this.f57041b.o();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i4) throws IOException {
        this.f57041b.d((byte) i4);
        ((FilterOutputStream) this).out.write(i4);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i4, int i5) throws IOException {
        this.f57041b.k(bArr, i4, i5);
        ((FilterOutputStream) this).out.write(bArr, i4, i5);
    }
}
