package com.nostra13.universalimageloader.cache.disc.impl.ext;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* compiled from: StrictLineReader.java */
/* loaded from: classes6.dex */
class c implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    private static final byte f70223g = 13;

    /* renamed from: h, reason: collision with root package name */
    private static final byte f70224h = 10;

    /* renamed from: b, reason: collision with root package name */
    private final InputStream f70225b;

    /* renamed from: c, reason: collision with root package name */
    private final Charset f70226c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f70227d;

    /* renamed from: e, reason: collision with root package name */
    private int f70228e;

    /* renamed from: f, reason: collision with root package name */
    private int f70229f;

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
                return new String(((ByteArrayOutputStream) this).buf, 0, i4, c.this.f70226c.name());
            } catch (UnsupportedEncodingException e4) {
                throw new AssertionError(e4);
            }
        }
    }

    public c(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void b() throws IOException {
        InputStream inputStream = this.f70225b;
        byte[] bArr = this.f70227d;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.f70228e = 0;
        this.f70229f = read;
    }

    public String c() throws IOException {
        int i4;
        byte[] bArr;
        int i5;
        synchronized (this.f70225b) {
            try {
                if (this.f70227d == null) {
                    throw new IOException(ProtectedSandApp.s("ᨱ\u0001"));
                }
                if (this.f70228e >= this.f70229f) {
                    b();
                }
                for (int i6 = this.f70228e; i6 != this.f70229f; i6++) {
                    byte[] bArr2 = this.f70227d;
                    if (bArr2[i6] == 10) {
                        int i7 = this.f70228e;
                        if (i6 != i7) {
                            i5 = i6 - 1;
                            if (bArr2[i5] == 13) {
                                String str = new String(bArr2, i7, i5 - i7, this.f70226c.name());
                                this.f70228e = i6 + 1;
                                return str;
                            }
                        }
                        i5 = i6;
                        String str2 = new String(bArr2, i7, i5 - i7, this.f70226c.name());
                        this.f70228e = i6 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.f70229f - this.f70228e) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.f70227d;
                    int i10 = this.f70228e;
                    aVar.write(bArr3, i10, this.f70229f - i10);
                    this.f70229f = -1;
                    b();
                    i4 = this.f70228e;
                    while (i4 != this.f70229f) {
                        bArr = this.f70227d;
                        if (bArr[i4] == 10) {
                            break loop1;
                        }
                        i4++;
                    }
                }
                int i11 = this.f70228e;
                if (i4 != i11) {
                    aVar.write(bArr, i11, i4 - i11);
                }
                this.f70228e = i4 + 1;
                return aVar.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f70225b) {
            try {
                if (this.f70227d != null) {
                    this.f70227d = null;
                    this.f70225b.close();
                }
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
            throw new IllegalArgumentException(ProtectedSandApp.s("ᨰ\u0001"));
        }
        if (!charset.equals(d.f70231a)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᨯ\u0001"));
        }
        this.f70225b = inputStream;
        this.f70226c = charset;
        this.f70227d = new byte[i4];
    }
}
