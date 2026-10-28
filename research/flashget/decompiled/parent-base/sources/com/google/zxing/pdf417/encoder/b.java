package com.google.zxing.pdf417.encoder;

/* compiled from: BarcodeRow.java */
/* loaded from: classes6.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f63241a;

    /* renamed from: b, reason: collision with root package name */
    private int f63242b = 0;

    b(int i4) {
        this.f63241a = new byte[i4];
    }

    private void d(int i4, boolean z4) {
        this.f63241a[i4] = z4 ? (byte) 1 : (byte) 0;
    }

    void a(boolean z4, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = this.f63242b;
            this.f63242b = i6 + 1;
            d(i6, z4);
        }
    }

    byte[] b(int i4) {
        int length = this.f63241a.length * i4;
        byte[] bArr = new byte[length];
        for (int i5 = 0; i5 < length; i5++) {
            bArr[i5] = this.f63241a[i5 / i4];
        }
        return bArr;
    }

    void c(int i4, byte b5) {
        this.f63241a[i4] = b5;
    }
}
