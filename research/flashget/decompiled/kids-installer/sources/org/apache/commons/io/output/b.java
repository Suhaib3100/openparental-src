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
/* loaded from: classes5.dex */
public class b extends OutputStream {

    /* renamed from: t, reason: collision with root package name */
    private static final byte[] f32074t = new byte[0];

    /* renamed from: o, reason: collision with root package name */
    private final List<byte[]> f32075o;

    /* renamed from: p, reason: collision with root package name */
    private int f32076p;

    /* renamed from: q, reason: collision with root package name */
    private int f32077q;

    /* renamed from: r, reason: collision with root package name */
    private byte[] f32078r;

    /* renamed from: s, reason: collision with root package name */
    private int f32079s;

    public b() {
        this(1024);
    }

    private void a(int i5) {
        if (this.f32076p < this.f32075o.size() - 1) {
            this.f32077q += this.f32078r.length;
            int i6 = this.f32076p + 1;
            this.f32076p = i6;
            this.f32078r = this.f32075o.get(i6);
            return;
        }
        byte[] bArr = this.f32078r;
        if (bArr == null) {
            this.f32077q = 0;
        } else {
            i5 = Math.max(bArr.length << 1, i5 - this.f32077q);
            this.f32077q += this.f32078r.length;
        }
        this.f32076p++;
        byte[] bArr2 = new byte[i5];
        this.f32078r = bArr2;
        this.f32075o.add(bArr2);
    }

    private InputStream d() {
        int i5 = this.f32079s;
        if (i5 == 0) {
            return new org.apache.commons.io.input.i();
        }
        ArrayList arrayList = new ArrayList(this.f32075o.size());
        for (byte[] bArr : this.f32075o) {
            int min = Math.min(bArr.length, i5);
            arrayList.add(new ByteArrayInputStream(bArr, 0, min));
            i5 -= min;
            if (i5 == 0) {
                break;
            }
        }
        return new SequenceInputStream(Collections.enumeration(arrayList));
    }

    public static InputStream e(InputStream inputStream) throws IOException {
        b bVar = new b();
        bVar.k(inputStream);
        return bVar.d();
    }

    public synchronized void b() {
        this.f32079s = 0;
        this.f32077q = 0;
        this.f32076p = 0;
        this.f32078r = this.f32075o.get(0);
    }

    public synchronized int c() {
        return this.f32079s;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public synchronized byte[] g() {
        int i5 = this.f32079s;
        if (i5 == 0) {
            return f32074t;
        }
        byte[] bArr = new byte[i5];
        int i6 = 0;
        for (byte[] bArr2 : this.f32075o) {
            int min = Math.min(bArr2.length, i5);
            System.arraycopy(bArr2, 0, bArr, i6, min);
            i6 += min;
            i5 -= min;
            if (i5 == 0) {
                break;
            }
        }
        return bArr;
    }

    public String j(String str) throws UnsupportedEncodingException {
        return new String(g(), str);
    }

    public synchronized int k(InputStream inputStream) throws IOException {
        int i5;
        int i6 = this.f32079s - this.f32077q;
        byte[] bArr = this.f32078r;
        int read = inputStream.read(bArr, i6, bArr.length - i6);
        i5 = 0;
        while (read != -1) {
            i5 += read;
            i6 += read;
            this.f32079s += read;
            byte[] bArr2 = this.f32078r;
            if (i6 == bArr2.length) {
                a(bArr2.length);
                i6 = 0;
            }
            byte[] bArr3 = this.f32078r;
            read = inputStream.read(bArr3, i6, bArr3.length - i6);
        }
        return i5;
    }

    public synchronized void l(OutputStream outputStream) throws IOException {
        int i5 = this.f32079s;
        for (byte[] bArr : this.f32075o) {
            int min = Math.min(bArr.length, i5);
            outputStream.write(bArr, 0, min);
            i5 -= min;
            if (i5 == 0) {
                break;
            }
        }
    }

    public String toString() {
        return new String(g());
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i5, int i6) {
        int i7;
        if (i5 < 0 || i5 > bArr.length || i6 < 0 || (i7 = i5 + i6) > bArr.length || i7 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i6 == 0) {
            return;
        }
        synchronized (this) {
            int i8 = this.f32079s;
            int i9 = i8 + i6;
            int i10 = i8 - this.f32077q;
            while (i6 > 0) {
                int min = Math.min(i6, this.f32078r.length - i10);
                System.arraycopy(bArr, i7 - i6, this.f32078r, i10, min);
                i6 -= min;
                if (i6 > 0) {
                    a(i9);
                    i10 = 0;
                }
            }
            this.f32079s = i9;
        }
    }

    public b(int i5) {
        this.f32075o = new ArrayList();
        if (i5 < 0) {
            throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a("Negative initial size: ", i5));
        }
        synchronized (this) {
            a(i5);
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i5) {
        int i6 = this.f32079s;
        int i7 = i6 - this.f32077q;
        if (i7 == this.f32078r.length) {
            a(i6 + 1);
            i7 = 0;
        }
        this.f32078r[i7] = (byte) i5;
        this.f32079s++;
    }
}
