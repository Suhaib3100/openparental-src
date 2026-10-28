package com.bumptech.glide.load.data;

import androidx.annotation.o0;
import androidx.appcompat.view.menu.s;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;

/* compiled from: ExifOrientationStream.java */
/* loaded from: classes.dex */
public final class g extends FilterInputStream {

    /* renamed from: q, reason: collision with root package name */
    private static final int f11067q = 2;

    /* renamed from: r, reason: collision with root package name */
    private static final byte[] f11068r;

    /* renamed from: s, reason: collision with root package name */
    private static final int f11069s;

    /* renamed from: t, reason: collision with root package name */
    private static final int f11070t;

    /* renamed from: o, reason: collision with root package name */
    private final byte f11071o;

    /* renamed from: p, reason: collision with root package name */
    private int f11072p;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f11068r = bArr;
        int length = bArr.length;
        f11069s = length;
        f11070t = length + 2;
    }

    public g(InputStream inputStream, int i5) {
        super(inputStream);
        if (i5 < -1 || i5 > 8) {
            throw new IllegalArgumentException(s.a(ProtectedSandApp.s("Ą"), i5));
        }
        this.f11071o = (byte) i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i5) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i5;
        int i6 = this.f11072p;
        int read = (i6 < 2 || i6 > (i5 = f11070t)) ? super.read() : i6 == i5 ? this.f11071o : f11068r[i6 - 2] & UByte.f27220r;
        if (read != -1) {
            this.f11072p++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j5) throws IOException {
        long skip = super.skip(j5);
        if (skip > 0) {
            this.f11072p = (int) (this.f11072p + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@o0 byte[] bArr, int i5, int i6) throws IOException {
        int i7;
        int i8 = this.f11072p;
        int i9 = f11070t;
        if (i8 > i9) {
            i7 = super.read(bArr, i5, i6);
        } else if (i8 == i9) {
            bArr[i5] = this.f11071o;
            i7 = 1;
        } else if (i8 < 2) {
            i7 = super.read(bArr, i5, 2 - i8);
        } else {
            int min = Math.min(i9 - i8, i6);
            System.arraycopy(f11068r, this.f11072p - 2, bArr, i5, min);
            i7 = min;
        }
        if (i7 > 0) {
            this.f11072p += i7;
        }
        return i7;
    }
}
