package com.google.zxing.oned;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.Collections;

/* compiled from: CodaBarWriter.java */
/* loaded from: classes6.dex */
public final class b extends s {

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f62981b;

    /* renamed from: c, reason: collision with root package name */
    private static final char[] f62982c = {'T', 'N', '*', 'E'};

    /* renamed from: d, reason: collision with root package name */
    private static final char[] f62983d = {'/', ':', '+', '.'};

    /* renamed from: e, reason: collision with root package name */
    private static final char f62984e;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f62981b = cArr;
        f62984e = cArr[0];
    }

    @Override // com.google.zxing.oned.s
    public boolean[] e(String str) {
        int i4;
        if (str.length() < 2) {
            StringBuilder sb = new StringBuilder();
            char c5 = f62984e;
            sb.append(c5);
            sb.append(str);
            sb.append(c5);
            str = sb.toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f62981b;
            boolean h4 = a.h(cArr, upperCase);
            boolean h5 = a.h(cArr, upperCase2);
            char[] cArr2 = f62982c;
            boolean h6 = a.h(cArr2, upperCase);
            boolean h7 = a.h(cArr2, upperCase2);
            String s4 = ProtectedSandApp.s("ૠ\u0001");
            if (h4) {
                if (!h5) {
                    throw new IllegalArgumentException(s4.concat(str));
                }
            } else if (!h6) {
                if (h5 || h7) {
                    throw new IllegalArgumentException(s4.concat(str));
                }
                StringBuilder sb2 = new StringBuilder();
                char c6 = f62984e;
                sb2.append(c6);
                sb2.append(str);
                sb2.append(c6);
                str = sb2.toString();
            } else if (!h7) {
                throw new IllegalArgumentException(s4.concat(str));
            }
        }
        int i5 = 20;
        for (int i6 = 1; i6 < str.length() - 1; i6++) {
            if (Character.isDigit(str.charAt(i6)) || str.charAt(i6) == '-' || str.charAt(i6) == '$') {
                i5 += 9;
            } else {
                if (!a.h(f62983d, str.charAt(i6))) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("ૡ\u0001") + str.charAt(i6) + '\'');
                }
                i5 += 10;
            }
        }
        boolean[] zArr = new boolean[(str.length() - 1) + i5];
        int i7 = 0;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i10));
            if (i10 == 0 || i10 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i11 = 0;
            while (true) {
                char[] cArr3 = a.f62971g;
                if (i11 >= cArr3.length) {
                    i4 = 0;
                    break;
                }
                if (upperCase3 == cArr3[i11]) {
                    i4 = a.f62972h[i11];
                    break;
                }
                i11++;
            }
            int i12 = 0;
            int i13 = 0;
            boolean z4 = true;
            while (i12 < 7) {
                zArr[i7] = z4;
                i7++;
                if (((i4 >> (6 - i12)) & 1) == 0 || i13 == 1) {
                    z4 = !z4;
                    i12++;
                    i13 = 0;
                } else {
                    i13++;
                }
            }
            if (i10 < str.length() - 1) {
                zArr[i7] = false;
                i7++;
            }
        }
        return zArr;
    }

    @Override // com.google.zxing.oned.s
    protected Collection<com.google.zxing.a> g() {
        return Collections.singleton(com.google.zxing.a.CODABAR);
    }
}
