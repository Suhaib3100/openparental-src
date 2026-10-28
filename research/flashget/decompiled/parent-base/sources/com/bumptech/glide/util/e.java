package com.bumptech.glide.util;

import androidx.annotation.b0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* compiled from: ExceptionPassthroughInputStream.java */
/* loaded from: classes3.dex */
public final class e extends InputStream {

    /* renamed from: d, reason: collision with root package name */
    @b0("POOL")
    private static final Queue<e> f44958d = o.g(0);

    /* renamed from: b, reason: collision with root package name */
    private InputStream f44959b;

    /* renamed from: c, reason: collision with root package name */
    private IOException f44960c;

    e() {
    }

    static void a() {
        synchronized (f44958d) {
            while (true) {
                try {
                    Queue<e> queue = f44958d;
                    if (!queue.isEmpty()) {
                        queue.remove();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @o0
    public static e c(@o0 InputStream inputStream) {
        e poll;
        Queue<e> queue = f44958d;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new e();
        }
        poll.f44959b = inputStream;
        return poll;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f44959b.available();
    }

    @q0
    public IOException b() {
        return this.f44960c;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f44959b.close();
    }

    void d(@o0 InputStream inputStream) {
        this.f44959b = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i4) {
        this.f44959b.mark(i4);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f44959b.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f44959b.read();
        } catch (IOException e4) {
            this.f44960c = e4;
            throw e4;
        }
    }

    public void release() {
        this.f44960c = null;
        this.f44959b = null;
        Queue<e> queue = f44958d;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f44959b.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j4) throws IOException {
        try {
            return this.f44959b.skip(j4);
        } catch (IOException e4) {
            this.f44960c = e4;
            throw e4;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f44959b.read(bArr);
        } catch (IOException e4) {
            this.f44960c = e4;
            throw e4;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        try {
            return this.f44959b.read(bArr, i4, i5);
        } catch (IOException e4) {
            this.f44960c = e4;
            throw e4;
        }
    }
}
