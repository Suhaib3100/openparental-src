package org.apache.commons.io.output;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ByteArrayOutputStream.java */
/* loaded from: classes4.dex */
public class b extends OutputStream {

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f85586g = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    private final List<byte[]> f85587b;

    /* renamed from: c, reason: collision with root package name */
    private int f85588c;

    /* renamed from: d, reason: collision with root package name */
    private int f85589d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f85590e;

    /* renamed from: f, reason: collision with root package name */
    private int f85591f;

    public b() {
        this(1024);
    }

    private void a(int i4) {
        if (this.f85588c < this.f85587b.size() - 1) {
            this.f85589d += this.f85590e.length;
            int i5 = this.f85588c + 1;
            this.f85588c = i5;
            this.f85590e = this.f85587b.get(i5);
            return;
        }
        byte[] bArr = this.f85590e;
        if (bArr == null) {
            this.f85589d = 0;
        } else {
            i4 = Math.max(bArr.length << 1, i4 - this.f85589d);
            this.f85589d += this.f85590e.length;
        }
        this.f85588c++;
        byte[] bArr2 = new byte[i4];
        this.f85590e = bArr2;
        this.f85587b.add(bArr2);
    }

    private InputStream d() {
        int i4 = this.f85591f;
        if (i4 == 0) {
            return new org.apache.commons.io.input.i();
        }
        ArrayList arrayList = new ArrayList(this.f85587b.size());
        for (byte[] bArr : this.f85587b) {
            int min = Math.min(bArr.length, i4);
            arrayList.add(new ByteArrayInputStream(bArr, 0, min));
            i4 -= min;
            if (i4 == 0) {
                break;
            }
        }
        return new SequenceInputStream(Collections.enumeration(arrayList));
    }

    public static InputStream e(InputStream inputStream) throws IOException {
        b bVar = new b();
        bVar.h(inputStream);
        return bVar.d();
    }

    public synchronized void b() {
        this.f85591f = 0;
        this.f85589d = 0;
        this.f85588c = 0;
        this.f85590e = this.f85587b.get(0);
    }

    public synchronized int c() {
        return this.f85591f;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public synchronized byte[] f() {
        int i4 = this.f85591f;
        if (i4 == 0) {
            return f85586g;
        }
        byte[] bArr = new byte[i4];
        int i5 = 0;
        for (byte[] bArr2 : this.f85587b) {
            int min = Math.min(bArr2.length, i4);
            System.arraycopy(bArr2, 0, bArr, i5, min);
            i5 += min;
            i4 -= min;
            if (i4 == 0) {
                break;
            }
        }
        return bArr;
    }

    public String g(String str) throws UnsupportedEncodingException {
        return new String(f(), str);
    }

    public synchronized int h(InputStream inputStream) throws IOException {
        int i4;
        try {
            int i5 = this.f85591f - this.f85589d;
            byte[] bArr = this.f85590e;
            int read = inputStream.read(bArr, i5, bArr.length - i5);
            i4 = 0;
            while (read != -1) {
                i4 += read;
                i5 += read;
                this.f85591f += read;
                byte[] bArr2 = this.f85590e;
                if (i5 == bArr2.length) {
                    a(bArr2.length);
                    i5 = 0;
                }
                byte[] bArr3 = this.f85590e;
                read = inputStream.read(bArr3, i5, bArr3.length - i5);
            }
        } catch (Throwable th) {
            throw th;
        }
        return i4;
    }

    public synchronized void i(OutputStream outputStream) throws IOException {
        int i4 = this.f85591f;
        for (byte[] bArr : this.f85587b) {
            int min = Math.min(bArr.length, i4);
            outputStream.write(bArr, 0, min);
            i4 -= min;
            if (i4 == 0) {
                break;
            }
        }
    }

    public String toString() {
        return new String(f());
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i4, int i5) {
        int i6;
        if (i4 < 0 || i4 > bArr.length || i5 < 0 || (i6 = i4 + i5) > bArr.length || i6 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i5 == 0) {
            return;
        }
        synchronized (this) {
            try {
                int i7 = this.f85591f;
                int i10 = i7 + i5;
                int i11 = i7 - this.f85589d;
                while (i5 > 0) {
                    int min = Math.min(i5, this.f85590e.length - i11);
                    System.arraycopy(bArr, i6 - i5, this.f85590e, i11, min);
                    i5 -= min;
                    if (i5 > 0) {
                        a(i10);
                        i11 = 0;
                    }
                }
                this.f85591f = i10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public b(int i4) {
        this.f85587b = new ArrayList();
        if (i4 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("Negative initial size: ", i4));
        }
        synchronized (this) {
            a(i4);
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i4) {
        try {
            int i5 = this.f85591f;
            int i6 = i5 - this.f85589d;
            if (i6 == this.f85590e.length) {
                a(i5 + 1);
                i6 = 0;
            }
            this.f85590e[i6] = (byte) i4;
            this.f85591f++;
        } catch (Throwable th) {
            throw th;
        }
    }
}
