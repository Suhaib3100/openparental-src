package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: ThresholdingOutputStream.java */
/* loaded from: classes4.dex */
public abstract class q extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    private final int f85611b;

    /* renamed from: c, reason: collision with root package name */
    private long f85612c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f85613d;

    public q(int i4) {
        this.f85611b = i4;
    }

    protected void a(int i4) throws IOException {
        if (this.f85613d || this.f85612c + i4 <= this.f85611b) {
            return;
        }
        this.f85613d = true;
        g();
    }

    public long b() {
        return this.f85612c;
    }

    protected abstract OutputStream c() throws IOException;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
        } catch (IOException unused) {
        }
        c().close();
    }

    public int d() {
        return this.f85611b;
    }

    public boolean e() {
        return this.f85612c > ((long) this.f85611b);
    }

    protected void f() {
        this.f85613d = false;
        this.f85612c = 0L;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        c().flush();
    }

    protected abstract void g() throws IOException;

    @Override // java.io.OutputStream
    public void write(int i4) throws IOException {
        a(1);
        c().write(i4);
        this.f85612c++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        a(bArr.length);
        c().write(bArr);
        this.f85612c += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i4, int i5) throws IOException {
        a(i5);
        c().write(bArr, i4, i5);
        this.f85612c += i5;
    }
}
