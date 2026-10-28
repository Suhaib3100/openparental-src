package com.bumptech.glide.disklrucache;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* compiled from: StrictLineReader.java */
/* loaded from: classes.dex */
class c implements Closeable {

    /* renamed from: t, reason: collision with root package name */
    private static final byte f10785t = 13;

    /* renamed from: u, reason: collision with root package name */
    private static final byte f10786u = 10;

    /* renamed from: o, reason: collision with root package name */
    private final InputStream f10787o;

    /* renamed from: p, reason: collision with root package name */
    private final Charset f10788p;

    /* renamed from: q, reason: collision with root package name */
    private byte[] f10789q;

    /* renamed from: r, reason: collision with root package name */
    private int f10790r;

    /* renamed from: s, reason: collision with root package name */
    private int f10791s;

    /* compiled from: StrictLineReader.java */
    class a extends ByteArrayOutputStream {
        a(int i5) {
            super(i5);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i5 = ((ByteArrayOutputStream) this).count;
            if (i5 > 0 && ((ByteArrayOutputStream) this).buf[i5 - 1] == 13) {
                i5--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i5, c.this.f10788p.name());
            } catch (UnsupportedEncodingException e6) {
                throw new AssertionError(e6);
            }
        }
    }

    public c(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void b() throws IOException {
        InputStream inputStream = this.f10787o;
        byte[] bArr = this.f10789q;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.f10790r = 0;
        this.f10791s = read;
    }

    public boolean c() {
        return this.f10791s == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f10787o) {
            if (this.f10789q != null) {
                this.f10789q = null;
                this.f10787o.close();
            }
        }
    }

    public String d() throws IOException {
        int i5;
        byte[] bArr;
        int i6;
        synchronized (this.f10787o) {
            if (this.f10789q == null) {
                throw new IOException(ProtectedSandApp.s("Þ"));
            }
            if (this.f10790r >= this.f10791s) {
                b();
            }
            for (int i7 = this.f10790r; i7 != this.f10791s; i7++) {
                byte[] bArr2 = this.f10789q;
                if (bArr2[i7] == 10) {
                    int i8 = this.f10790r;
                    if (i7 != i8) {
                        i6 = i7 - 1;
                        if (bArr2[i6] == 13) {
                            String str = new String(bArr2, i8, i6 - i8, this.f10788p.name());
                            this.f10790r = i7 + 1;
                            return str;
                        }
                    }
                    i6 = i7;
                    String str2 = new String(bArr2, i8, i6 - i8, this.f10788p.name());
                    this.f10790r = i7 + 1;
                    return str2;
                }
            }
            a aVar = new a((this.f10791s - this.f10790r) + 80);
            loop1: while (true) {
                byte[] bArr3 = this.f10789q;
                int i9 = this.f10790r;
                aVar.write(bArr3, i9, this.f10791s - i9);
                this.f10791s = -1;
                b();
                i5 = this.f10790r;
                while (i5 != this.f10791s) {
                    bArr = this.f10789q;
                    if (bArr[i5] == 10) {
                        break loop1;
                    }
                    i5++;
                }
            }
            int i10 = this.f10790r;
            if (i5 != i10) {
                aVar.write(bArr, i10, i5 - i10);
            }
            this.f10790r = i5 + 1;
            return aVar.toString();
        }
    }

    public c(InputStream inputStream, int i5, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i5 < 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("Ý"));
        }
        if (!charset.equals(d.f10793a)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("Ü"));
        }
        this.f10787o = inputStream;
        this.f10788p = charset;
        this.f10789q = new byte[i5];
    }
}
