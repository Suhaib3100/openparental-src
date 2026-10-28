package com.google.zxing.oned;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* compiled from: UPCEReader.java */
/* loaded from: classes6.dex */
public final class a0 extends y {

    /* renamed from: l, reason: collision with root package name */
    private static final int[] f62978l = {1, 1, 1, 1, 1, 1};

    /* renamed from: m, reason: collision with root package name */
    static final int[][] f62979m = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: k, reason: collision with root package name */
    private final int[] f62980k = new int[4];

    public static String s(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb = new StringBuilder(12);
        sb.append(str.charAt(0));
        char c5 = cArr[5];
        String s4 = ProtectedSandApp.s("\u0ad3\u0001");
        String s5 = ProtectedSandApp.s("\u0ad4\u0001");
        switch (c5) {
            case '0':
            case '1':
            case '2':
                sb.append(cArr, 0, 2);
                sb.append(c5);
                sb.append(s5);
                sb.append(cArr, 2, 3);
                break;
            case '3':
                sb.append(cArr, 0, 3);
                sb.append(s4);
                sb.append(cArr, 3, 2);
                break;
            case '4':
                sb.append(cArr, 0, 4);
                sb.append(s4);
                sb.append(cArr[4]);
                break;
            default:
                sb.append(cArr, 0, 5);
                sb.append(s5);
                sb.append(c5);
                break;
        }
        if (str.length() >= 8) {
            sb.append(str.charAt(7));
        }
        return sb.toString();
    }

    private static void t(StringBuilder sb, int i4) throws NotFoundException {
        for (int i5 = 0; i5 <= 1; i5++) {
            for (int i6 = 0; i6 < 10; i6++) {
                if (i4 == f62979m[i5][i6]) {
                    sb.insert(0, (char) (i5 + 48));
                    sb.append((char) (i6 + 48));
                    return;
                }
            }
        }
        throw NotFoundException.a();
    }

    @Override // com.google.zxing.oned.y
    protected boolean h(String str) throws FormatException {
        return y.i(s(str));
    }

    @Override // com.google.zxing.oned.y
    protected int[] k(com.google.zxing.common.a aVar, int i4) throws NotFoundException {
        return y.n(aVar, i4, true, f62978l);
    }

    @Override // com.google.zxing.oned.y
    protected int l(com.google.zxing.common.a aVar, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.f62980k;
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
        t(sb, i5);
        return i4;
    }

    @Override // com.google.zxing.oned.y
    com.google.zxing.a q() {
        return com.google.zxing.a.UPC_E;
    }
}
