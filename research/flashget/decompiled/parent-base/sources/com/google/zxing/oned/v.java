package com.google.zxing.oned;

import com.google.zxing.NotFoundException;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: UPCEANExtension2Support.java */
/* loaded from: classes6.dex */
final class v {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f63146a = new int[4];

    /* renamed from: b, reason: collision with root package name */
    private final StringBuilder f63147b = new StringBuilder();

    v() {
    }

    private int a(com.google.zxing.common.a aVar, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.f63146a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int o4 = aVar.o();
        int i4 = iArr[1];
        int i5 = 0;
        for (int i6 = 0; i6 < 2 && i4 < o4; i6++) {
            int j4 = y.j(aVar, iArr2, i4, y.f63160j);
            sb.append((char) ((j4 % 10) + 48));
            for (int i7 : iArr2) {
                i4 += i7;
            }
            if (j4 >= 10) {
                i5 |= 1 << (1 - i6);
            }
            if (i6 != 1) {
                i4 = aVar.n(aVar.m(i4));
            }
        }
        if (sb.length() != 2) {
            throw NotFoundException.a();
        }
        if (Integer.parseInt(sb.toString()) % 4 == i5) {
            return i4;
        }
        throw NotFoundException.a();
    }

    private static Map<com.google.zxing.o, Object> c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(com.google.zxing.o.class);
        enumMap.put((EnumMap) com.google.zxing.o.ISSUE_NUMBER, (com.google.zxing.o) Integer.valueOf(str));
        return enumMap;
    }

    com.google.zxing.n b(int i4, com.google.zxing.common.a aVar, int[] iArr) throws NotFoundException {
        StringBuilder sb = this.f63147b;
        sb.setLength(0);
        int a5 = a(aVar, iArr, sb);
        String sb2 = sb.toString();
        Map<com.google.zxing.o, Object> c5 = c(sb2);
        float f4 = i4;
        com.google.zxing.n nVar = new com.google.zxing.n(sb2, null, new com.google.zxing.p[]{new com.google.zxing.p((iArr[0] + iArr[1]) / 2.0f, f4), new com.google.zxing.p(a5, f4)}, com.google.zxing.a.UPC_EAN_EXTENSION);
        if (c5 != null) {
            nVar.i(c5);
        }
        return nVar;
    }
}
