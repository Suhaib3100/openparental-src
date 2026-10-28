package com.google.zxing.pdf417.encoder;

import java.lang.reflect.Array;

/* compiled from: BarcodeMatrix.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final b[] f63237a;

    /* renamed from: b, reason: collision with root package name */
    private int f63238b;

    /* renamed from: c, reason: collision with root package name */
    private final int f63239c;

    /* renamed from: d, reason: collision with root package name */
    private final int f63240d;

    a(int i4, int i5) {
        b[] bVarArr = new b[i4];
        this.f63237a = bVarArr;
        int length = bVarArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            this.f63237a[i6] = new b(((i5 + 4) * 17) + 1);
        }
        this.f63240d = i5 * 17;
        this.f63239c = i4;
        this.f63238b = -1;
    }

    b a() {
        return this.f63237a[this.f63238b];
    }

    public byte[][] b() {
        return c(1, 1);
    }

    public byte[][] c(int i4, int i5) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.f63239c * i5, this.f63240d * i4);
        int i6 = this.f63239c * i5;
        for (int i7 = 0; i7 < i6; i7++) {
            bArr[(i6 - i7) - 1] = this.f63237a[i7 / i5].b(i4);
        }
        return bArr;
    }

    void d(int i4, int i5, byte b5) {
        this.f63237a[i5].c(i4, b5);
    }

    void e() {
        this.f63238b++;
    }
}
