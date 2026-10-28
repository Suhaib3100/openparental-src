package com.bumptech.glide.util;

import androidx.annotation.o0;
import androidx.annotation.q0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* compiled from: ExceptionCatchingInputStream.java */
@Deprecated
/* loaded from: classes.dex */
public class d extends InputStream {

    /* renamed from: q, reason: collision with root package name */
    private static final Queue<d> f12148q = n.f(0);

    /* renamed from: o, reason: collision with root package name */
    private InputStream f12149o;

    /* renamed from: p, reason: collision with root package name */
    private IOException f12150p;

    d() {
    }

    static void a() {
        while (true) {
            Queue<d> queue = f12148q;
            if (queue.isEmpty()) {
                return;
            } else {
                queue.remove();
            }
        }
    }

    @o0
    public static d c(@o0 InputStream inputStream) {
        d poll;
        Queue<d> queue = f12148q;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new d();
        }
        poll.d(inputStream);
        return poll;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f12149o.available();
    }

    @q0
    public IOException b() {
        return this.f12150p;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f12149o.close();
    }

    void d(@o0 InputStream inputStream) {
        this.f12149o = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i5) {
        this.f12149o.mark(i5);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f12149o.markSupported();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f12149o.read(bArr);
        } catch (IOException e6) {
            this.f12150p = e6;
            return -1;
        }
    }

    public void release() {
        this.f12150p = null;
        this.f12149o = null;
        Queue<d> queue = f12148q;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f12149o.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j5) {
        try {
            return this.f12149o.skip(j5);
        } catch (IOException e6) {
            this.f12150p = e6;
            return 0L;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i5, int i6) {
        try {
            return this.f12149o.read(bArr, i5, i6);
        } catch (IOException e6) {
            this.f12150p = e6;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f12149o.read();
        } catch (IOException e6) {
            this.f12150p = e6;
            return -1;
        }
    }
}
