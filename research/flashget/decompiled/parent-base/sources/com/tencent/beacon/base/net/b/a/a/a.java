package com.tencent.beacon.base.net.b.a.a;

import java.io.IOException;

/* compiled from: BinTree.java */
/* loaded from: classes6.dex */
public class a extends b {

    /* renamed from: l, reason: collision with root package name */
    private static final int[] f71161l = new int[256];

    /* renamed from: m, reason: collision with root package name */
    int f71162m;

    /* renamed from: o, reason: collision with root package name */
    int f71164o;

    /* renamed from: p, reason: collision with root package name */
    int[] f71165p;

    /* renamed from: q, reason: collision with root package name */
    int[] f71166q;

    /* renamed from: s, reason: collision with root package name */
    int f71168s;

    /* renamed from: n, reason: collision with root package name */
    int f71163n = 0;

    /* renamed from: r, reason: collision with root package name */
    int f71167r = 255;

    /* renamed from: t, reason: collision with root package name */
    int f71169t = 0;

    /* renamed from: u, reason: collision with root package name */
    boolean f71170u = true;

    /* renamed from: v, reason: collision with root package name */
    int f71171v = 0;

    /* renamed from: w, reason: collision with root package name */
    int f71172w = 4;

    /* renamed from: x, reason: collision with root package name */
    int f71173x = 66560;

    static {
        for (int i4 = 0; i4 < 256; i4++) {
            int i5 = i4;
            for (int i6 = 0; i6 < 8; i6++) {
                int i7 = i5 & 1;
                i5 >>>= 1;
                if (i7 != 0) {
                    i5 ^= -306674912;
                }
            }
            f71161l[i4] = i5;
        }
    }

    public boolean a(int i4, int i5, int i6, int i7) {
        int i10;
        if (i4 > 1073741567) {
            return false;
        }
        this.f71167r = (i6 >> 1) + 16;
        int i11 = i5 + i4;
        super.a(i11, i7 + i6, (((i11 + i6) + i7) / 2) + 256);
        this.f71164o = i6;
        int i12 = i4 + 1;
        if (this.f71163n != i12) {
            this.f71163n = i12;
            this.f71165p = new int[i12 * 2];
        }
        if (this.f71170u) {
            int i13 = i4 - 1;
            int i14 = i13 | (i13 >> 1);
            int i15 = i14 | (i14 >> 2);
            int i16 = i15 | (i15 >> 4);
            int i17 = ((i16 | (i16 >> 8)) >> 1) | 65535;
            if (i17 > 16777216) {
                i17 >>= 1;
            }
            this.f71168s = i17;
            i10 = i17 + 1 + this.f71173x;
        } else {
            i10 = 65536;
        }
        if (i10 != this.f71169t) {
            this.f71169t = i10;
            this.f71166q = new int[i10];
        }
        return true;
    }

    public void c(int i4) {
        boolean z4 = i4 > 2;
        this.f71170u = z4;
        if (z4) {
            this.f71171v = 0;
            this.f71172w = 4;
            this.f71173x = 66560;
        } else {
            this.f71171v = 2;
            this.f71172w = 3;
            this.f71173x = 0;
        }
    }

    public void d(int i4) throws IOException {
        int i5;
        byte[] bArr;
        int i6 = i4;
        do {
            int i7 = this.f71181h;
            int i10 = this.f71164o;
            int i11 = i7 + i10;
            int i12 = this.f71184k;
            if (i11 > i12 && (i10 = i12 - i7) < this.f71172w) {
                e();
            } else {
                int i13 = this.f71163n;
                int i14 = i7 > i13 ? i7 - i13 : 0;
                int i15 = this.f71179f + i7;
                if (this.f71170u) {
                    int[] iArr = f71161l;
                    byte[] bArr2 = this.f71174a;
                    int i16 = iArr[bArr2[i15] & 255] ^ (bArr2[i15 + 1] & 255);
                    int[] iArr2 = this.f71166q;
                    iArr2[i16 & 1023] = i7;
                    int i17 = i16 ^ ((bArr2[i15 + 2] & 255) << 8);
                    iArr2[(65535 & i17) + 1024] = i7;
                    i5 = ((iArr[bArr2[i15 + 3] & 255] << 5) ^ i17) & this.f71168s;
                } else {
                    byte[] bArr3 = this.f71174a;
                    i5 = ((bArr3[i15 + 1] & 255) << 8) ^ (bArr3[i15] & 255);
                }
                int[] iArr3 = this.f71166q;
                int i18 = this.f71173x + i5;
                int i19 = iArr3[i18];
                iArr3[i18] = i7;
                int i20 = this.f71162m << 1;
                int i21 = i20 + 1;
                int i22 = this.f71171v;
                int i23 = this.f71167r;
                int i24 = i22;
                while (i19 > i14) {
                    int i25 = i23 - 1;
                    if (i23 == 0) {
                        break;
                    }
                    int i26 = this.f71181h - i19;
                    int i27 = this.f71162m;
                    int i28 = (i26 <= i27 ? i27 - i26 : (i27 - i26) + this.f71163n) << 1;
                    int i29 = this.f71179f + i19;
                    int min = Math.min(i22, i24);
                    byte[] bArr4 = this.f71174a;
                    if (bArr4[i29 + min] == bArr4[i15 + min]) {
                        do {
                            min++;
                            if (min == i10) {
                                break;
                            } else {
                                bArr = this.f71174a;
                            }
                        } while (bArr[i29 + min] == bArr[i15 + min]);
                        if (min == i10) {
                            int[] iArr4 = this.f71165p;
                            iArr4[i20] = iArr4[i28];
                            iArr4[i21] = iArr4[i28 + 1];
                            break;
                        }
                    }
                    byte[] bArr5 = this.f71174a;
                    if ((bArr5[i29 + min] & 255) < (bArr5[i15 + min] & 255)) {
                        int[] iArr5 = this.f71165p;
                        iArr5[i20] = i19;
                        int i30 = i28 + 1;
                        i19 = iArr5[i30];
                        i20 = i30;
                        i24 = min;
                    } else {
                        int[] iArr6 = this.f71165p;
                        iArr6[i21] = i19;
                        i19 = iArr6[i28];
                        i21 = i28;
                        i22 = min;
                    }
                    i23 = i25;
                }
                int[] iArr7 = this.f71165p;
                iArr7[i20] = 0;
                iArr7[i21] = 0;
                e();
            }
            i6--;
        } while (i6 != 0);
    }

    @Override // com.tencent.beacon.base.net.b.a.a.b
    public void e() throws IOException {
        int i4 = this.f71162m + 1;
        this.f71162m = i4;
        if (i4 >= this.f71163n) {
            this.f71162m = 0;
        }
        super.e();
        if (this.f71181h == 1073741823) {
            h();
        }
    }

    void h() {
        int i4 = this.f71181h;
        int i5 = this.f71163n;
        int i6 = i4 - i5;
        a(this.f71165p, i5 * 2, i6);
        a(this.f71166q, this.f71169t, i6);
        b(i6);
    }

    @Override // com.tencent.beacon.base.net.b.a.a.b
    public void c() throws IOException {
        super.c();
        for (int i4 = 0; i4 < this.f71169t; i4++) {
            this.f71166q[i4] = 0;
        }
        this.f71162m = 0;
        b(-1);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(int[] r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.base.net.b.a.a.a.a(int[]):int");
    }

    void a(int[] iArr, int i4, int i5) {
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = iArr[i6];
            iArr[i6] = i7 <= i5 ? 0 : i7 - i5;
        }
    }
}
