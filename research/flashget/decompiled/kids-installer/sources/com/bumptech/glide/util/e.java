package com.bumptech.glide.util;

import androidx.annotation.b0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* compiled from: ExceptionPassthroughInputStream.java */
/* loaded from: classes.dex */
public final class e extends InputStream {

    /* renamed from: q, reason: collision with root package name */
    @b0("POOL")
    private static final Queue<e> f12151q = n.f(0);

    /* renamed from: o, reason: collision with root package name */
    private InputStream f12152o;

    /* renamed from: p, reason: collision with root package name */
    private IOException f12153p;

    e() {
    }

    static void a() {
        synchronized (f12151q) {
            while (true) {
                Queue<e> queue = f12151q;
                if (!queue.isEmpty()) {
                    queue.remove();
                }
            }
        }
    }

    @o0
    public static e c(@o0 InputStream inputStream) {
        e poll;
        Queue<e> queue = f12151q;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new e();
        }
        poll.f12152o = inputStream;
        return poll;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f12152o.available();
    }

    @q0
    public IOException b() {
        return this.f12153p;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f12152o.close();
    }

    void d(@o0 InputStream inputStream) {
        this.f12152o = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i5) {
        this.f12152o.mark(i5);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f12152o.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f12152o.read();
        } catch (IOException e6) {
            this.f12153p = e6;
            throw e6;
        }
    }

    public void release() {
        this.f12153p = null;
        this.f12152o = null;
        Queue<e> queue = f12151q;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f12152o.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j5) throws IOException {
        try {
            return this.f12152o.skip(j5);
        } catch (IOException e6) {
            this.f12153p = e6;
            throw e6;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f12152o.read(bArr);
        } catch (IOException e6) {
            this.f12153p = e6;
            throw e6;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i5, int i6) throws IOException {
        try {
            return this.f12152o.read(bArr, i5, i6);
        } catch (IOException e6) {
            this.f12153p = e6;
            throw e6;
        }
    }
}
