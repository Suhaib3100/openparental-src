package com.google.zxing.common;

/* compiled from: BitSource.java */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f62767a;

    /* renamed from: b, reason: collision with root package name */
    private int f62768b;

    /* renamed from: c, reason: collision with root package name */
    private int f62769c;

    public c(byte[] bArr) {
        this.f62767a = bArr;
    }

    public int a() {
        return ((this.f62767a.length - this.f62768b) * 8) - this.f62769c;
    }

    public int b() {
        return this.f62769c;
    }

    public int c() {
        return this.f62768b;
    }

    public int d(int i4) {
        if (i4 <= 0 || i4 > 32 || i4 > a()) {
            throw new IllegalArgumentException(String.valueOf(i4));
        }
        int i5 = this.f62769c;
        int i6 = 0;
        if (i5 > 0) {
            int i7 = 8 - i5;
            int min = Math.min(i4, i7);
            int i10 = i7 - min;
            byte[] bArr = this.f62767a;
            int i11 = this.f62768b;
            int i12 = (((255 >> (8 - min)) << i10) & bArr[i11]) >> i10;
            i4 -= min;
            int i13 = this.f62769c + min;
            this.f62769c = i13;
            if (i13 == 8) {
                this.f62769c = 0;
                this.f62768b = i11 + 1;
            }
            i6 = i12;
        }
        if (i4 <= 0) {
            return i6;
        }
        while (i4 >= 8) {
            int i14 = i6 << 8;
            byte[] bArr2 = this.f62767a;
            int i15 = this.f62768b;
            i6 = (bArr2[i15] & 255) | i14;
            this.f62768b = i15 + 1;
            i4 -= 8;
        }
        if (i4 <= 0) {
            return i6;
        }
        int i16 = 8 - i4;
        int i17 = (i6 << i4) | ((((255 >> i16) << i16) & this.f62767a[this.f62768b]) >> i16);
        this.f62769c += i4;
        return i17;
    }
}
