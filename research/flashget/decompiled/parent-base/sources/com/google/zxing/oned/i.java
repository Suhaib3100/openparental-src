package com.google.zxing.oned;

import com.google.zxing.NotFoundException;

/* compiled from: EAN13Reader.java */
/* loaded from: classes6.dex */
public final class i extends y {

    /* renamed from: l, reason: collision with root package name */
    static final int[] f63031l = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: k, reason: collision with root package name */
    private final int[] f63032k = new int[4];

    private static void s(StringBuilder sb, int i4) throws NotFoundException {
        for (int i5 = 0; i5 < 10; i5++) {
            if (i4 == f63031l[i5]) {
                sb.insert(0, (char) (i5 + 48));
                return;
            }
        }
        throw NotFoundException.a();
    }

    @Override // com.google.zxing.oned.y
    protected int l(com.google.zxing.common.a aVar, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.f63032k;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int o4 = aVar.o();
        int i4 = iArr[1];
        int i5 = 0;
        for (int i6 = 0; i6 < 6 && i4 < o4; i6++) {
            int j4 = y.j(aVar, iArr2, i4, y.f63160j);
            sb.append((char) ((j4 % 10) + 48));
            for (int i7 : iArr2) {
                i4 += i7;
            }
            if (j4 >= 10) {
                i5 |= 1 << (5 - i6);
            }
        }
        s(sb, i5);
        int i10 = y.n(aVar, i4, true, y.f63157g)[1];
        for (int i11 = 0; i11 < 6 && i10 < o4; i11++) {
            sb.append((char) (y.j(aVar, iArr2, i10, y.f63159i) + 48));
            for (int i12 : iArr2) {
                i10 += i12;
            }
        }
        return i10;
    }

    @Override // com.google.zxing.oned.y
    com.google.zxing.a q() {
        return com.google.zxing.a.EAN_13;
    }
}
