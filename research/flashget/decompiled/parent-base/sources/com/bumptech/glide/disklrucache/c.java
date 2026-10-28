package com.bumptech.glide.disklrucache;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* compiled from: StrictLineReader.java */
/* loaded from: classes3.dex */
class c implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    private static final byte f42873g = 13;

    /* renamed from: h, reason: collision with root package name */
    private static final byte f42874h = 10;

    /* renamed from: b, reason: collision with root package name */
    private final InputStream f42875b;

    /* renamed from: c, reason: collision with root package name */
    private final Charset f42876c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f42877d;

    /* renamed from: e, reason: collision with root package name */
    private int f42878e;

    /* renamed from: f, reason: collision with root package name */
    private int f42879f;

    /* compiled from: StrictLineReader.java */
    class a extends ByteArrayOutputStream {
        a(int i4) {
            super(i4);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i4 = ((ByteArrayOutputStream) this).count;
            if (i4 > 0 && ((ByteArrayOutputStream) this).buf[i4 - 1] == 13) {
                i4--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i4, c.this.f42876c.name());
            } catch (UnsupportedEncodingException e4) {
                throw new AssertionError(e4);
            }
        }
    }

    public c(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void b() throws IOException {
        InputStream inputStream = this.f42875b;
        byte[] bArr = this.f42877d;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.f42878e = 0;
        this.f42879f = read;
    }

    public boolean c() {
        return this.f42879f == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f42875b) {
            try {
                if (this.f42877d != null) {
                    this.f42877d = null;
                    this.f42875b.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String d() throws IOException {
        int i4;
        byte[] bArr;
        int i5;
        synchronized (this.f42875b) {
            try {
                if (this.f42877d == null) {
                    throw new IOException(ProtectedSandApp.s("࠲"));
                }
                if (this.f42878e >= this.f42879f) {
                    b();
                }
                for (int i6 = this.f42878e; i6 != this.f42879f; i6++) {
                    byte[] bArr2 = this.f42877d;
                    if (bArr2[i6] == 10) {
                        int i7 = this.f42878e;
                        if (i6 != i7) {
                            i5 = i6 - 1;
                            if (bArr2[i5] == 13) {
                                String str = new String(bArr2, i7, i5 - i7, this.f42876c.name());
                                this.f42878e = i6 + 1;
                                return str;
                            }
                        }
                        i5 = i6;
                        String str2 = new String(bArr2, i7, i5 - i7, this.f42876c.name());
                        this.f42878e = i6 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.f42879f - this.f42878e) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.f42877d;
                    int i10 = this.f42878e;
                    aVar.write(bArr3, i10, this.f42879f - i10);
                    this.f42879f = -1;
                    b();
                    i4 = this.f42878e;
                    while (i4 != this.f42879f) {
                        bArr = this.f42877d;
                        if (bArr[i4] == 10) {
                            break loop1;
                        }
                        i4++;
                    }
                }
                int i11 = this.f42878e;
                if (i4 != i11) {
                    aVar.write(bArr, i11, i4 - i11);
                }
                this.f42878e = i4 + 1;
                return aVar.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public c(InputStream inputStream, int i4, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i4 < 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("࠱"));
        }
        if (!charset.equals(d.f42881a)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("࠰"));
        }
        this.f42875b = inputStream;
        this.f42876c = charset;
        this.f42877d = new byte[i4];
    }
}
