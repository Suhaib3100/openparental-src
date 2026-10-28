package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: TeeInputStream.java */
/* loaded from: classes6.dex */
public class w extends n {

    /* renamed from: o, reason: collision with root package name */
    private final OutputStream f31995o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f31996p;

    public w(InputStream inputStream, OutputStream outputStream) {
        this(inputStream, outputStream, false);
    }

    @Override // org.apache.commons.io.input.n, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            super.close();
        } finally {
            if (this.f31996p) {
                this.f31995o.close();
            }
        }
    }

    @Override // org.apache.commons.io.input.n, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = super.read();
        if (read != -1) {
            this.f31995o.write(read);
        }
        return read;
    }

    public w(InputStream inputStream, OutputStream outputStream, boolean z5) {
        super(inputStream);
        this.f31995o = outputStream;
        this.f31996p = z5;
    }

    @Override // org.apache.commons.io.input.n, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i5, int i6) throws IOException {
        int read = super.read(bArr, i5, i6);
        if (read != -1) {
            this.f31995o.write(bArr, i5, read);
        }
        return read;
    }

    @Override // org.apache.commons.io.input.n, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        int read = super.read(bArr);
        if (read != -1) {
            this.f31995o.write(bArr, 0, read);
        }
        return read;
    }
}
