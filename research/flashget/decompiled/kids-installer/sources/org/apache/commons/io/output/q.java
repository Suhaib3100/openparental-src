package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: ThresholdingOutputStream.java */
/* loaded from: classes5.dex */
public abstract class q extends OutputStream {

    /* renamed from: o, reason: collision with root package name */
    private final int f32099o;

    /* renamed from: p, reason: collision with root package name */
    private long f32100p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f32101q;

    public q(int i5) {
        this.f32099o = i5;
    }

    protected void a(int i5) throws IOException {
        if (this.f32101q || this.f32100p + i5 <= this.f32099o) {
            return;
        }
        this.f32101q = true;
        j();
    }

    public long b() {
        return this.f32100p;
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
        return this.f32099o;
    }

    public boolean e() {
        return this.f32100p > ((long) this.f32099o);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        c().flush();
    }

    protected void g() {
        this.f32101q = false;
        this.f32100p = 0L;
    }

    protected abstract void j() throws IOException;

    @Override // java.io.OutputStream
    public void write(int i5) throws IOException {
        a(1);
        c().write(i5);
        this.f32100p++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        a(bArr.length);
        c().write(bArr);
        this.f32100p += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i5, int i6) throws IOException {
        a(i6);
        c().write(bArr, i5, i6);
        this.f32100p += i6;
    }
}
