package com.bumptech.glide.util;

import androidx.annotation.o0;
import androidx.annotation.q0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* compiled from: ExceptionCatchingInputStream.java */
@Deprecated
/* loaded from: classes3.dex */
public class d extends InputStream {

    /* renamed from: d, reason: collision with root package name */
    private static final Queue<d> f44955d = o.g(0);

    /* renamed from: b, reason: collision with root package name */
    private InputStream f44956b;

    /* renamed from: c, reason: collision with root package name */
    private IOException f44957c;

    d() {
    }

    static void a() {
        while (true) {
            Queue<d> queue = f44955d;
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
        Queue<d> queue = f44955d;
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
        return this.f44956b.available();
    }

    @q0
    public IOException b() {
        return this.f44957c;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f44956b.close();
    }

    void d(@o0 InputStream inputStream) {
        this.f44956b = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i4) {
        this.f44956b.mark(i4);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f44956b.markSupported();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f44956b.read(bArr);
        } catch (IOException e4) {
            this.f44957c = e4;
            return -1;
        }
    }

    public void release() {
        this.f44957c = null;
        this.f44956b = null;
        Queue<d> queue = f44955d;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f44956b.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j4) {
        try {
            return this.f44956b.skip(j4);
        } catch (IOException e4) {
            this.f44957c = e4;
            return 0L;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) {
        try {
            return this.f44956b.read(bArr, i4, i5);
        } catch (IOException e4) {
            this.f44957c = e4;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f44956b.read();
        } catch (IOException e4) {
            this.f44957c = e4;
            return -1;
        }
    }
}
