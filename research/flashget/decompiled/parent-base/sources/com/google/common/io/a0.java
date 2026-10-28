package com.google.common.io;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

/* compiled from: MultiInputStream.java */
@p
@d9.c
/* loaded from: classes6.dex */
final class a0 extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    private Iterator<? extends f> f57092b;

    /* renamed from: c, reason: collision with root package name */
    @zc.a
    private InputStream f57093c;

    public a0(Iterator<? extends f> it) throws IOException {
        it.getClass();
        this.f57092b = it;
        a();
    }

    private void a() throws IOException {
        close();
        if (this.f57092b.hasNext()) {
            this.f57093c = this.f57092b.next().m();
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        InputStream inputStream = this.f57093c;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f57093c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f57093c = null;
            }
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f57093c;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read();
            if (read != -1) {
                return read;
            }
            a();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j4) throws IOException {
        InputStream inputStream = this.f57093c;
        if (inputStream == null || j4 <= 0) {
            return 0L;
        }
        long skip = inputStream.skip(j4);
        if (skip != 0) {
            return skip;
        }
        if (read() == -1) {
            return 0L;
        }
        return this.f57093c.skip(j4 - 1) + 1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        bArr.getClass();
        while (true) {
            InputStream inputStream = this.f57093c;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read(bArr, i4, i5);
            if (read != -1) {
                return read;
            }
            a();
        }
    }
}
