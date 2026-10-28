package com.google.zxing;

import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: PlanarYUVLuminanceSource.java */
/* loaded from: classes6.dex */
public final class k extends h {

    /* renamed from: h, reason: collision with root package name */
    private static final int f62912h = 2;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f62913c;

    /* renamed from: d, reason: collision with root package name */
    private final int f62914d;

    /* renamed from: e, reason: collision with root package name */
    private final int f62915e;

    /* renamed from: f, reason: collision with root package name */
    private final int f62916f;

    /* renamed from: g, reason: collision with root package name */
    private final int f62917g;

    public k(byte[] bArr, int i4, int i5, int i6, int i7, int i10, int i11, boolean z4) {
        super(i10, i11);
        if (i6 + i10 > i4 || i7 + i11 > i5) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\u0aba\u0001"));
        }
        this.f62913c = bArr;
        this.f62914d = i4;
        this.f62915e = i5;
        this.f62916f = i6;
        this.f62917g = i7;
        if (z4) {
            n(i10, i11);
        }
    }

    private void n(int i4, int i5) {
        byte[] bArr = this.f62913c;
        int i6 = (this.f62917g * this.f62914d) + this.f62916f;
        int i7 = 0;
        while (i7 < i5) {
            int i10 = (i4 / 2) + i6;
            int i11 = (i6 + i4) - 1;
            int i12 = i6;
            while (i12 < i10) {
                byte b5 = bArr[i12];
                bArr[i12] = bArr[i11];
                bArr[i11] = b5;
                i12++;
                i11--;
            }
            i7++;
            i6 += this.f62914d;
        }
    }

    @Override // com.google.zxing.h
    public h a(int i4, int i5, int i6, int i7) {
        return new k(this.f62913c, this.f62914d, this.f62915e, this.f62916f + i4, this.f62917g + i5, i6, i7, false);
    }

    @Override // com.google.zxing.h
    public byte[] c() {
        int e4 = e();
        int b5 = b();
        int i4 = this.f62914d;
        if (e4 == i4 && b5 == this.f62915e) {
            return this.f62913c;
        }
        int i5 = e4 * b5;
        byte[] bArr = new byte[i5];
        int i6 = (this.f62917g * i4) + this.f62916f;
        if (e4 == i4) {
            System.arraycopy(this.f62913c, i6, bArr, 0, i5);
            return bArr;
        }
        for (int i7 = 0; i7 < b5; i7++) {
            System.arraycopy(this.f62913c, i6, bArr, i7 * e4, e4);
            i6 += this.f62914d;
        }
        return bArr;
    }

    @Override // com.google.zxing.h
    public byte[] d(int i4, byte[] bArr) {
        if (i4 < 0 || i4 >= b()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\u0abb\u0001").concat(String.valueOf(i4)));
        }
        int e4 = e();
        if (bArr == null || bArr.length < e4) {
            bArr = new byte[e4];
        }
        System.arraycopy(this.f62913c, ((i4 + this.f62917g) * this.f62914d) + this.f62916f, bArr, 0, e4);
        return bArr;
    }

    @Override // com.google.zxing.h
    public boolean g() {
        return true;
    }

    public int k() {
        return b() / 2;
    }

    public int l() {
        return e() / 2;
    }

    public int[] m() {
        int e4 = e() / 2;
        int b5 = b() / 2;
        int[] iArr = new int[e4 * b5];
        byte[] bArr = this.f62913c;
        int i4 = (this.f62917g * this.f62914d) + this.f62916f;
        for (int i5 = 0; i5 < b5; i5++) {
            int i6 = i5 * e4;
            for (int i7 = 0; i7 < e4; i7++) {
                iArr[i6 + i7] = ((bArr[(i7 << 1) + i4] & 255) * 65793) | x1.f27484y;
            }
            i4 += this.f62914d << 1;
        }
        return iArr;
    }
}
