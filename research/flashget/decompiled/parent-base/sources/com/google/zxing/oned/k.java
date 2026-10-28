package com.google.zxing.oned;

import com.google.zxing.NotFoundException;

/* compiled from: EAN8Reader.java */
/* loaded from: classes6.dex */
public final class k extends y {

    /* renamed from: k, reason: collision with root package name */
    private final int[] f63034k = new int[4];

    @Override // com.google.zxing.oned.y
    protected int l(com.google.zxing.common.a aVar, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.f63034k;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int o4 = aVar.o();
        int i4 = iArr[1];
        for (int i5 = 0; i5 < 4 && i4 < o4; i5++) {
            sb.append((char) (y.j(aVar, iArr2, i4, y.f63159i) + 48));
            for (int i6 : iArr2) {
                i4 += i6;
            }
        }
        int i7 = y.n(aVar, i4, true, y.f63157g)[1];
        for (int i10 = 0; i10 < 4 && i7 < o4; i10++) {
            sb.append((char) (y.j(aVar, iArr2, i7, y.f63159i) + 48));
            for (int i11 : iArr2) {
                i7 += i11;
            }
        }
        return i7;
    }

    @Override // com.google.zxing.oned.y
    com.google.zxing.a q() {
        return com.google.zxing.a.EAN_8;
    }
}
