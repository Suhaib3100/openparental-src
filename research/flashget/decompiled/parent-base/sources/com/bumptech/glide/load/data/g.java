package com.bumptech.glide.load.data;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ExifOrientationStream.java */
/* loaded from: classes3.dex */
public final class g extends FilterInputStream {

    /* renamed from: d, reason: collision with root package name */
    private static final int f43773d = 2;

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f43774e;

    /* renamed from: f, reason: collision with root package name */
    private static final int f43775f;

    /* renamed from: g, reason: collision with root package name */
    private static final int f43776g;

    /* renamed from: b, reason: collision with root package name */
    private final byte f43777b;

    /* renamed from: c, reason: collision with root package name */
    private int f43778c;

    static {
        byte[] bArr = {-1, -31, 0, com.google.common.base.c.F, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, com.google.common.base.c.f54875u, 0, 2, 0, 0, 0, 1, 0};
        f43774e = bArr;
        int length = bArr.length;
        f43775f = length;
        f43776g = length + 2;
    }

    public g(InputStream inputStream, int i4) {
        super(inputStream);
        if (i4 < -1 || i4 > 8) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("ࡪ"), i4));
        }
        this.f43777b = (byte) i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i4;
        int i5 = this.f43778c;
        int read = (i5 < 2 || i5 > (i4 = f43776g)) ? super.read() : i5 == i4 ? this.f43777b : f43774e[i5 - 2] & 255;
        if (read != -1) {
            this.f43778c++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j4) throws IOException {
        long skip = super.skip(j4);
        if (skip > 0) {
            this.f43778c = (int) (this.f43778c + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@o0 byte[] bArr, int i4, int i5) throws IOException {
        int i6;
        int i7 = this.f43778c;
        int i10 = f43776g;
        if (i7 > i10) {
            i6 = super.read(bArr, i4, i5);
        } else if (i7 == i10) {
            bArr[i4] = this.f43777b;
            i6 = 1;
        } else if (i7 < 2) {
            i6 = super.read(bArr, i4, 2 - i7);
        } else {
            int min = Math.min(i10 - i7, i5);
            System.arraycopy(f43774e, this.f43778c - 2, bArr, i4, min);
            i6 = min;
        }
        if (i6 > 0) {
            this.f43778c += i6;
        }
        return i6;
    }
}
