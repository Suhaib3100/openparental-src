package com.google.zxing.common;

import com.google.zxing.NotFoundException;

/* compiled from: GlobalHistogramBinarizer.java */
/* loaded from: classes6.dex */
public class h extends com.google.zxing.b {

    /* renamed from: d, reason: collision with root package name */
    private static final int f62782d = 5;

    /* renamed from: e, reason: collision with root package name */
    private static final int f62783e = 3;

    /* renamed from: f, reason: collision with root package name */
    private static final int f62784f = 32;

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f62785g = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    private byte[] f62786b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f62787c;

    public h(com.google.zxing.h hVar) {
        super(hVar);
        this.f62786b = f62785g;
        this.f62787c = new int[32];
    }

    private static int g(int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            int i10 = iArr[i7];
            if (i10 > i4) {
                i6 = i7;
                i4 = i10;
            }
            if (i10 > i5) {
                i5 = i10;
            }
        }
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = i13 - i6;
            int i15 = iArr[i13] * i14 * i14;
            if (i15 > i12) {
                i11 = i13;
                i12 = i15;
            }
        }
        if (i6 <= i11) {
            int i16 = i6;
            i6 = i11;
            i11 = i16;
        }
        if (i6 - i11 <= length / 16) {
            throw NotFoundException.a();
        }
        int i17 = i6 - 1;
        int i18 = -1;
        int i19 = i17;
        while (i17 > i11) {
            int i20 = i17 - i11;
            int i21 = (i5 - iArr[i17]) * (i6 - i17) * i20 * i20;
            if (i21 > i18) {
                i19 = i17;
                i18 = i21;
            }
            i17--;
        }
        return i19 << 3;
    }

    private void h(int i4) {
        if (this.f62786b.length < i4) {
            this.f62786b = new byte[i4];
        }
        for (int i5 = 0; i5 < 32; i5++) {
            this.f62787c[i5] = 0;
        }
    }

    @Override // com.google.zxing.b
    public com.google.zxing.b a(com.google.zxing.h hVar) {
        return new h(hVar);
    }

    @Override // com.google.zxing.b
    public b b() throws NotFoundException {
        com.google.zxing.h e4 = e();
        int e5 = e4.e();
        int b5 = e4.b();
        b bVar = new b(e5, b5);
        h(e5);
        int[] iArr = this.f62787c;
        for (int i4 = 1; i4 < 5; i4++) {
            byte[] d5 = e4.d((b5 * i4) / 5, this.f62786b);
            int i5 = (e5 << 2) / 5;
            for (int i6 = e5 / 5; i6 < i5; i6++) {
                int i7 = (d5[i6] & 255) >> 3;
                iArr[i7] = iArr[i7] + 1;
            }
        }
        int g4 = g(iArr);
        byte[] c5 = e4.c();
        for (int i10 = 0; i10 < b5; i10++) {
            int i11 = i10 * e5;
            for (int i12 = 0; i12 < e5; i12++) {
                if ((c5[i11 + i12] & 255) < g4) {
                    bVar.s(i12, i10);
                }
            }
        }
        return bVar;
    }

    @Override // com.google.zxing.b
    public a c(int i4, a aVar) throws NotFoundException {
        com.google.zxing.h e4 = e();
        int e5 = e4.e();
        if (aVar == null || aVar.o() < e5) {
            aVar = new a(e5);
        } else {
            aVar.e();
        }
        h(e5);
        byte[] d5 = e4.d(i4, this.f62786b);
        int[] iArr = this.f62787c;
        for (int i5 = 0; i5 < e5; i5++) {
            int i6 = (d5[i5] & 255) >> 3;
            iArr[i6] = iArr[i6] + 1;
        }
        int g4 = g(iArr);
        if (e5 < 3) {
            for (int i7 = 0; i7 < e5; i7++) {
                if ((d5[i7] & 255) < g4) {
                    aVar.t(i7);
                }
            }
        } else {
            int i10 = 1;
            int i11 = d5[0] & 255;
            int i12 = d5[1] & 255;
            while (i10 < e5 - 1) {
                int i13 = i10 + 1;
                int i14 = d5[i13] & 255;
                if ((((i12 << 2) - i11) - i14) / 2 < g4) {
                    aVar.t(i10);
                }
                i11 = i12;
                i10 = i13;
                i12 = i14;
            }
        }
        return aVar;
    }
}
