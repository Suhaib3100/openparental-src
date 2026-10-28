package com.google.common.hash;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: HashingInputStream.java */
@d9.a
@k
/* loaded from: classes6.dex */
public final class t extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    private final r f57040b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(q qVar, InputStream inputStream) {
        super(inputStream);
        inputStream.getClass();
        r f4 = qVar.f();
        f4.getClass();
        this.f57040b = f4;
    }

    public p a() {
        return this.f57040b.o();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i4) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    @f9.a
    public int read() throws IOException {
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.f57040b.d((byte) read);
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new IOException(ProtectedSandApp.s("\uf64c"));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    @f9.a
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        int read = ((FilterInputStream) this).in.read(bArr, i4, i5);
        if (read != -1) {
            this.f57040b.k(bArr, i4, read);
        }
        return read;
    }
}
