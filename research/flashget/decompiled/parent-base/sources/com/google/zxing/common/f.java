package com.google.zxing.common;

import com.google.zxing.NotFoundException;

/* compiled from: DefaultGridSampler.java */
/* loaded from: classes6.dex */
public final class f extends i {
    @Override // com.google.zxing.common.i
    public b c(b bVar, int i4, int i5, float f4, float f5, float f6, float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21) throws NotFoundException {
        return d(bVar, i4, i5, k.b(f4, f5, f6, f7, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21));
    }

    @Override // com.google.zxing.common.i
    public b d(b bVar, int i4, int i5, k kVar) throws NotFoundException {
        if (i4 <= 0 || i5 <= 0) {
            throw NotFoundException.a();
        }
        b bVar2 = new b(i4, i5);
        int i6 = i4 * 2;
        float[] fArr = new float[i6];
        for (int i7 = 0; i7 < i5; i7++) {
            float f4 = i7 + 0.5f;
            for (int i10 = 0; i10 < i6; i10 += 2) {
                fArr[i10] = (i10 / 2) + 0.5f;
                fArr[i10 + 1] = f4;
            }
            kVar.f(fArr);
            i.a(bVar, fArr);
            for (int i11 = 0; i11 < i6; i11 += 2) {
                try {
                    if (bVar.f((int) fArr[i11], (int) fArr[i11 + 1])) {
                        bVar2.s(i11 / 2, i7);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw NotFoundException.a();
                }
            }
        }
        return bVar2;
    }
}
