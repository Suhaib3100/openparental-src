package com.google.zxing.qrcode.encoder;

/* compiled from: MaskUtil.java */
/* loaded from: classes6.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final int f63345a = 3;

    /* renamed from: b, reason: collision with root package name */
    private static final int f63346b = 3;

    /* renamed from: c, reason: collision with root package name */
    private static final int f63347c = 40;

    /* renamed from: d, reason: collision with root package name */
    private static final int f63348d = 10;

    private d() {
    }

    static int a(b bVar) {
        return b(bVar, true) + b(bVar, false);
    }

    private static int b(b bVar, boolean z4) {
        int d5 = z4 ? bVar.d() : bVar.e();
        int e4 = z4 ? bVar.e() : bVar.d();
        byte[][] c5 = bVar.c();
        int i4 = 0;
        for (int i5 = 0; i5 < d5; i5++) {
            byte b5 = -1;
            int i6 = 0;
            for (int i7 = 0; i7 < e4; i7++) {
                byte b6 = z4 ? c5[i5][i7] : c5[i7][i5];
                if (b6 == b5) {
                    i6++;
                } else {
                    if (i6 >= 5) {
                        i4 += i6 - 2;
                    }
                    i6 = 1;
                    b5 = b6;
                }
            }
            if (i6 >= 5) {
                i4 = (i6 - 2) + i4;
            }
        }
        return i4;
    }

    static int c(b bVar) {
        byte[][] c5 = bVar.c();
        int e4 = bVar.e();
        int d5 = bVar.d();
        int i4 = 0;
        for (int i5 = 0; i5 < d5 - 1; i5++) {
            byte[] bArr = c5[i5];
            int i6 = 0;
            while (i6 < e4 - 1) {
                byte b5 = bArr[i6];
                int i7 = i6 + 1;
                if (b5 == bArr[i7]) {
                    byte[] bArr2 = c5[i5 + 1];
                    if (b5 == bArr2[i6] && b5 == bArr2[i7]) {
                        i4++;
                    }
                }
                i6 = i7;
            }
        }
        return i4 * 3;
    }

    static int d(b bVar) {
        byte[][] c5 = bVar.c();
        int e4 = bVar.e();
        int d5 = bVar.d();
        int i4 = 0;
        for (int i5 = 0; i5 < d5; i5++) {
            for (int i6 = 0; i6 < e4; i6++) {
                byte[] bArr = c5[i5];
                int i7 = i6 + 6;
                if (i7 < e4 && bArr[i6] == 1 && bArr[i6 + 1] == 0 && bArr[i6 + 2] == 1 && bArr[i6 + 3] == 1 && bArr[i6 + 4] == 1 && bArr[i6 + 5] == 0 && bArr[i7] == 1 && (g(bArr, i6 - 4, i6) || g(bArr, i6 + 7, i6 + 11))) {
                    i4++;
                }
                int i10 = i5 + 6;
                if (i10 < d5 && c5[i5][i6] == 1 && c5[i5 + 1][i6] == 0 && c5[i5 + 2][i6] == 1 && c5[i5 + 3][i6] == 1 && c5[i5 + 4][i6] == 1 && c5[i5 + 5][i6] == 0 && c5[i10][i6] == 1 && (h(c5, i6, i5 - 4, i5) || h(c5, i6, i5 + 7, i5 + 11))) {
                    i4++;
                }
            }
        }
        return i4 * 40;
    }

    static int e(b bVar) {
        byte[][] c5 = bVar.c();
        int e4 = bVar.e();
        int d5 = bVar.d();
        int i4 = 0;
        for (int i5 = 0; i5 < d5; i5++) {
            byte[] bArr = c5[i5];
            for (int i6 = 0; i6 < e4; i6++) {
                if (bArr[i6] == 1) {
                    i4++;
                }
            }
        }
        int e5 = bVar.e() * bVar.d();
        return ((Math.abs((i4 << 1) - e5) * 10) / e5) * 10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean f(int r1, int r2, int r3) {
        /*
            r0 = 1
            switch(r1) {
                case 0: goto L41;
                case 1: goto L28;
                case 2: goto L3e;
                case 3: goto L3a;
                case 4: goto L32;
                case 5: goto L2b;
                case 6: goto L22;
                case 7: goto L18;
                default: goto L4;
            }
        L4:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "ౢ\u0001"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L18:
            int r1 = r3 * r2
            int r1 = r1 % 3
            int r3 = r3 + r2
            r2 = r3 & 1
            int r1 = r1 + r2
            r1 = r1 & r0
            goto L43
        L22:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r3 = r3 + r1
        L28:
            r1 = r3 & 1
            goto L43
        L2b:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
            goto L43
        L32:
            int r3 = r3 / 2
            int r2 = r2 / 3
            int r2 = r2 + r3
            r1 = r2 & 1
            goto L43
        L3a:
            int r3 = r3 + r2
            int r1 = r3 % 3
            goto L43
        L3e:
            int r1 = r2 % 3
            goto L43
        L41:
            int r3 = r3 + r2
            goto L28
        L43:
            if (r1 != 0) goto L46
            return r0
        L46:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.encoder.d.f(int, int, int):boolean");
    }

    private static boolean g(byte[] bArr, int i4, int i5) {
        int min = Math.min(i5, bArr.length);
        for (int max = Math.max(i4, 0); max < min; max++) {
            if (bArr[max] == 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean h(byte[][] bArr, int i4, int i5, int i6) {
        int min = Math.min(i6, bArr.length);
        for (int max = Math.max(i5, 0); max < min; max++) {
            if (bArr[max][i4] == 1) {
                return false;
            }
        }
        return true;
    }
}
