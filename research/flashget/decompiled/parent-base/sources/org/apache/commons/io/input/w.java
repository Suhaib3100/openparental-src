package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: TeeInputStream.java */
/* loaded from: classes4.dex */
public class w extends n {

    /* renamed from: b, reason: collision with root package name */
    private final OutputStream f85512b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f85513c;

    public w(InputStream inputStream, OutputStream outputStream, boolean z4) {
        super(inputStream);
        this.f85512b = outputStream;
        this.f85513c = z4;
    }

    @Override // org.apache.commons.io.input.n, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            super.close();
        } finally {
            if (this.f85513c) {
                this.f85512b.close();
            }
        }
    }

    @Override // org.apache.commons.io.input.n, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = super.read();
        if (read != -1) {
            this.f85512b.write(read);
        }
        return read;
    }

    @Override // org.apache.commons.io.input.n, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        int read = super.read(bArr, i4, i5);
        if (read != -1) {
            this.f85512b.write(bArr, i4, read);
        }
        return read;
    }

    public w(InputStream inputStream, OutputStream outputStream) {
        this(inputStream, outputStream, false);
    }

    @Override // org.apache.commons.io.input.n, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        int read = super.read(bArr);
        if (read != -1) {
            this.f85512b.write(bArr, 0, read);
        }
        return read;
    }
}
