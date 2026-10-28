package com.google.zxing;

import androidx.constraintlayout.core.motion.utils.w;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: RGBLuminanceSource.java */
/* loaded from: classes6.dex */
public final class l extends h {

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f62918c;

    /* renamed from: d, reason: collision with root package name */
    private final int f62919d;

    /* renamed from: e, reason: collision with root package name */
    private final int f62920e;

    /* renamed from: f, reason: collision with root package name */
    private final int f62921f;

    /* renamed from: g, reason: collision with root package name */
    private final int f62922g;

    public l(int i4, int i5, int[] iArr) {
        super(i4, i5);
        this.f62919d = i4;
        this.f62920e = i5;
        this.f62921f = 0;
        this.f62922g = 0;
        int i6 = i4 * i5;
        this.f62918c = new byte[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            int i10 = iArr[i7];
            this.f62918c[i7] = (byte) (((((i10 >> 16) & 255) + ((i10 >> 7) & w.g.f22543r)) + (i10 & 255)) / 4);
        }
    }

    @Override // com.google.zxing.h
    public h a(int i4, int i5, int i6, int i7) {
        return new l(this.f62918c, this.f62919d, this.f62920e, this.f62921f + i4, this.f62922g + i5, i6, i7);
    }

    @Override // com.google.zxing.h
    public byte[] c() {
        int e4 = e();
        int b5 = b();
        int i4 = this.f62919d;
        if (e4 == i4 && b5 == this.f62920e) {
            return this.f62918c;
        }
        int i5 = e4 * b5;
        byte[] bArr = new byte[i5];
        int i6 = (this.f62922g * i4) + this.f62921f;
        if (e4 == i4) {
            System.arraycopy(this.f62918c, i6, bArr, 0, i5);
            return bArr;
        }
        for (int i7 = 0; i7 < b5; i7++) {
            System.arraycopy(this.f62918c, i6, bArr, i7 * e4, e4);
            i6 += this.f62919d;
        }
        return bArr;
    }

    @Override // com.google.zxing.h
    public byte[] d(int i4, byte[] bArr) {
        if (i4 < 0 || i4 >= b()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ઽ\u0001").concat(String.valueOf(i4)));
        }
        int e4 = e();
        if (bArr == null || bArr.length < e4) {
            bArr = new byte[e4];
        }
        System.arraycopy(this.f62918c, ((i4 + this.f62922g) * this.f62919d) + this.f62921f, bArr, 0, e4);
        return bArr;
    }

    @Override // com.google.zxing.h
    public boolean g() {
        return true;
    }

    private l(byte[] bArr, int i4, int i5, int i6, int i7, int i10, int i11) {
        super(i10, i11);
        if (i10 + i6 <= i4 && i11 + i7 <= i5) {
            this.f62918c = bArr;
            this.f62919d = i4;
            this.f62920e = i5;
            this.f62921f = i6;
            this.f62922g = i7;
            return;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("઼\u0001"));
    }
}
