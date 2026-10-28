package com.google.common.io;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.Objects;

/* compiled from: CharSequenceReader.java */
@p
@d9.c
/* loaded from: classes6.dex */
final class h extends Reader {

    /* renamed from: b, reason: collision with root package name */
    @zc.a
    private CharSequence f57129b;

    /* renamed from: c, reason: collision with root package name */
    private int f57130c;

    /* renamed from: d, reason: collision with root package name */
    private int f57131d;

    public h(CharSequence charSequence) {
        charSequence.getClass();
        this.f57129b = charSequence;
    }

    private void a() throws IOException {
        if (this.f57129b == null) {
            throw new IOException(ProtectedSandApp.s("\uf6a6"));
        }
    }

    private boolean b() {
        return c() > 0;
    }

    private int c() {
        Objects.requireNonNull(this.f57129b);
        return this.f57129b.length() - this.f57130c;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f57129b = null;
    }

    @Override // java.io.Reader
    public synchronized void mark(int i4) throws IOException {
        l0.k(i4 >= 0, ProtectedSandApp.s("\uf6a7"), i4);
        a();
        this.f57131d = this.f57130c;
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader
    public synchronized int read() throws IOException {
        char c5;
        a();
        Objects.requireNonNull(this.f57129b);
        if (b()) {
            CharSequence charSequence = this.f57129b;
            int i4 = this.f57130c;
            this.f57130c = i4 + 1;
            c5 = charSequence.charAt(i4);
        } else {
            c5 = 65535;
        }
        return c5;
    }

    @Override // java.io.Reader
    public synchronized boolean ready() throws IOException {
        a();
        return true;
    }

    @Override // java.io.Reader
    public synchronized void reset() throws IOException {
        a();
        this.f57130c = this.f57131d;
    }

    @Override // java.io.Reader
    public synchronized long skip(long j4) throws IOException {
        int min;
        l0.p(j4 >= 0, ProtectedSandApp.s("\uf6a8"), j4);
        a();
        min = (int) Math.min(c(), j4);
        this.f57130c += min;
        return min;
    }

    @Override // java.io.Reader
    public synchronized int read(char[] cArr, int i4, int i5) throws IOException {
        l0.f0(i4, i4 + i5, cArr.length);
        a();
        Objects.requireNonNull(this.f57129b);
        if (!b()) {
            return -1;
        }
        int min = Math.min(i5, c());
        for (int i6 = 0; i6 < min; i6++) {
            CharSequence charSequence = this.f57129b;
            int i7 = this.f57130c;
            this.f57130c = i7 + 1;
            cArr[i4 + i6] = charSequence.charAt(i7);
        }
        return min;
    }

    @Override // java.io.Reader, java.lang.Readable
    public synchronized int read(CharBuffer charBuffer) throws IOException {
        charBuffer.getClass();
        a();
        Objects.requireNonNull(this.f57129b);
        if (!b()) {
            return -1;
        }
        int min = Math.min(charBuffer.remaining(), c());
        for (int i4 = 0; i4 < min; i4++) {
            CharSequence charSequence = this.f57129b;
            int i5 = this.f57130c;
            this.f57130c = i5 + 1;
            charBuffer.put(charSequence.charAt(i5));
        }
        return min;
    }
}
