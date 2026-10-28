package com.google.zxing.oned;

import com.google.zxing.NotFoundException;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: UPCEANExtension5Support.java */
/* loaded from: classes6.dex */
final class w {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f63148c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* renamed from: a, reason: collision with root package name */
    private final int[] f63149a = new int[4];

    /* renamed from: b, reason: collision with root package name */
    private final StringBuilder f63150b = new StringBuilder();

    w() {
    }

    private int a(com.google.zxing.common.a aVar, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.f63149a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int o4 = aVar.o();
        int i4 = iArr[1];
        int i5 = 0;
        for (int i6 = 0; i6 < 5 && i4 < o4; i6++) {
            int j4 = y.j(aVar, iArr2, i4, y.f63160j);
            sb.append((char) ((j4 % 10) + 48));
            for (int i7 : iArr2) {
                i4 += i7;
            }
            if (j4 >= 10) {
                i5 |= 1 << (4 - i6);
            }
            if (i6 != 4) {
                i4 = aVar.n(aVar.m(i4));
            }
        }
        if (sb.length() != 5) {
            throw NotFoundException.a();
        }
        if (d(sb.toString()) == c(i5)) {
            return i4;
        }
        throw NotFoundException.a();
    }

    private static int c(int i4) throws NotFoundException {
        for (int i5 = 0; i5 < 10; i5++) {
            if (i4 == f63148c[i5]) {
                return i5;
            }
        }
        throw NotFoundException.a();
    }

    private static int d(CharSequence charSequence) {
        int length = charSequence.length();
        int i4 = 0;
        for (int i5 = length - 2; i5 >= 0; i5 -= 2) {
            i4 += charSequence.charAt(i5) - '0';
        }
        int i6 = i4 * 3;
        for (int i7 = length - 1; i7 >= 0; i7 -= 2) {
            i6 += charSequence.charAt(i7) - '0';
        }
        return (i6 * 3) % 10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        if (r5.equals(com.flashget.parentalcontrol.ProtectedSandApp.s("ం\u0001")) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String e(java.lang.String r5) {
        /*
            r0 = 1
            r1 = 0
            char r2 = r5.charAt(r1)
            r3 = 48
            if (r2 == r3) goto L65
            r3 = 53
            if (r2 == r3) goto L5e
            r3 = 57
            java.lang.String r4 = ""
            if (r2 == r3) goto L15
            goto L6b
        L15:
            r2 = -1
            int r3 = r5.hashCode()
            switch(r3) {
                case 54118329: goto L3d;
                case 54395376: goto L2e;
                case 54395377: goto L1f;
                default: goto L1d;
            }
        L1d:
            r1 = r2
            goto L4a
        L1f:
            java.lang.String r1 = "ఀ\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L2c
            goto L1d
        L2c:
            r1 = 2
            goto L4a
        L2e:
            java.lang.String r1 = "ఁ\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L3b
            goto L1d
        L3b:
            r1 = r0
            goto L4a
        L3d:
            java.lang.String r3 = "ం\u0001"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L4a
            goto L1d
        L4a:
            switch(r1) {
                case 0: goto L5c;
                case 1: goto L55;
                case 2: goto L4e;
                default: goto L4d;
            }
        L4d:
            goto L6b
        L4e:
            java.lang.String r5 = "ః\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            return r5
        L55:
            java.lang.String r5 = "ఄ\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            return r5
        L5c:
            r5 = 0
            return r5
        L5e:
            java.lang.String r4 = "అ\u0001"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)
            goto L6b
        L65:
            java.lang.String r4 = "ఆ\u0001"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)
        L6b:
            java.lang.String r5 = r5.substring(r0)
            int r5 = java.lang.Integer.parseInt(r5)
            int r0 = r5 / 100
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r5 = r5 % 100
            r1 = 10
            if (r5 >= r1) goto L8e
            java.lang.String r1 = "ఇ\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r1.concat(r5)
            goto L92
        L8e:
            java.lang.String r5 = java.lang.String.valueOf(r5)
        L92:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r1.append(r0)
            r0 = 46
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.w.e(java.lang.String):java.lang.String");
    }

    private static Map<com.google.zxing.o, Object> f(String str) {
        String e4;
        if (str.length() != 5 || (e4 = e(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(com.google.zxing.o.class);
        enumMap.put((EnumMap) com.google.zxing.o.SUGGESTED_PRICE, (com.google.zxing.o) e4);
        return enumMap;
    }

    com.google.zxing.n b(int i4, com.google.zxing.common.a aVar, int[] iArr) throws NotFoundException {
        StringBuilder sb = this.f63150b;
        sb.setLength(0);
        int a5 = a(aVar, iArr, sb);
        String sb2 = sb.toString();
        Map<com.google.zxing.o, Object> f4 = f(sb2);
        float f5 = i4;
        com.google.zxing.n nVar = new com.google.zxing.n(sb2, null, new com.google.zxing.p[]{new com.google.zxing.p((iArr[0] + iArr[1]) / 2.0f, f5), new com.google.zxing.p(a5, f5)}, com.google.zxing.a.UPC_EAN_EXTENSION);
        if (f4 != null) {
            nVar.i(f4);
        }
        return nVar;
    }
}
