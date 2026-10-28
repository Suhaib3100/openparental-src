package com.android.volley.toolbox;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: PoolingByteArrayOutputStream.java */
/* loaded from: classes3.dex */
public class y extends ByteArrayOutputStream {

    /* renamed from: c, reason: collision with root package name */
    private static final int f41077c = 256;

    /* renamed from: b, reason: collision with root package name */
    private final h f41078b;

    public y(h hVar) {
        this(hVar, 256);
    }

    private void a(int i4) {
        int i5 = ((ByteArrayOutputStream) this).count;
        if (i5 + i4 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        byte[] a5 = this.f41078b.a((i5 + i4) * 2);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, a5, 0, ((ByteArrayOutputStream) this).count);
        this.f41078b.b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = a5;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f41078b.b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public void finalize() {
        this.f41078b.b(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i4, int i5) {
        a(i5);
        super.write(bArr, i4, i5);
    }

    public y(h hVar, int i4) {
        this.f41078b = hVar;
        ((ByteArrayOutputStream) this).buf = hVar.a(Math.max(i4, 256));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i4) {
        a(1);
        super.write(i4);
    }
}
