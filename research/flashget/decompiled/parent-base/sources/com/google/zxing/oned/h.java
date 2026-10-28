package com.google.zxing.oned;

import androidx.compose.material3.j4;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.Collections;
import kotlin.text.m0;

/* compiled from: Code93Writer.java */
/* loaded from: classes6.dex */
public class h extends s {
    @Deprecated
    protected static int c(boolean[] zArr, int i4, int[] iArr, boolean z4) {
        int length = iArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = i4 + 1;
            zArr[i4] = iArr[i5] != 0;
            i5++;
            i4 = i6;
        }
        return 9;
    }

    private static int i(boolean[] zArr, int i4, int i5) {
        for (int i6 = 0; i6 < 9; i6++) {
            boolean z4 = true;
            int i7 = i4 + i6;
            if (((1 << (8 - i6)) & i5) == 0) {
                z4 = false;
            }
            zArr[i7] = z4;
        }
        return 9;
    }

    private static int j(String str, int i4) {
        int i5 = 0;
        int i6 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i5 += ProtectedSandApp.s("\u0af3\u0001").indexOf(str.charAt(length)) * i6;
            i6++;
            if (i6 > i4) {
                i6 = 1;
            }
        }
        return i5 % 47;
    }

    static String k(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length << 1);
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (charAt == 0) {
                sb.append(ProtectedSandApp.s("\u0af4\u0001"));
            } else if (charAt <= 26) {
                sb.append('a');
                sb.append((char) (charAt + '@'));
            } else if (charAt <= 31) {
                sb.append('b');
                sb.append((char) (charAt + m0.amp));
            } else if (charAt == ' ' || charAt == '$' || charAt == '%' || charAt == '+') {
                sb.append(charAt);
            } else if (charAt <= ',') {
                sb.append('c');
                sb.append((char) (charAt + ' '));
            } else if (charAt <= '9') {
                sb.append(charAt);
            } else if (charAt == ':') {
                sb.append(ProtectedSandApp.s("\u0af5\u0001"));
            } else if (charAt <= '?') {
                sb.append('b');
                sb.append((char) (charAt + 11));
            } else if (charAt == '@') {
                sb.append(ProtectedSandApp.s("\u0af6\u0001"));
            } else if (charAt <= 'Z') {
                sb.append(charAt);
            } else if (charAt <= '_') {
                sb.append('b');
                sb.append((char) (charAt - 16));
            } else if (charAt == '`') {
                sb.append(ProtectedSandApp.s("\u0af7\u0001"));
            } else if (charAt <= 'z') {
                sb.append('d');
                sb.append((char) (charAt - ' '));
            } else {
                if (charAt > 127) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("\u0af8\u0001") + charAt + ProtectedSandApp.s("ૹ\u0001"));
                }
                sb.append('b');
                sb.append((char) (charAt - '+'));
            }
        }
        return sb.toString();
    }

    @Override // com.google.zxing.oned.s
    public boolean[] e(String str) {
        String k4 = k(str);
        int length = k4.length();
        if (length > 80) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ૺ\u0001").concat(String.valueOf(length)));
        }
        boolean[] zArr = new boolean[((k4.length() + 4) * 9) + 1];
        int i4 = 0;
        int i5 = i(zArr, 0, g.f63028f);
        while (true) {
            String s4 = ProtectedSandApp.s("\u0af3\u0001");
            if (i4 >= length) {
                int j4 = j(k4, 20);
                int[] iArr = g.f63027e;
                int i6 = i5 + i(zArr, i5, iArr[j4]);
                StringBuilder a5 = j4.a(k4);
                a5.append(s4.charAt(j4));
                int i7 = i6 + i(zArr, i6, iArr[j(a5.toString(), 15)]);
                zArr[i7 + i(zArr, i7, g.f63028f)] = true;
                return zArr;
            }
            i5 += i(zArr, i5, g.f63027e[s4.indexOf(k4.charAt(i4))]);
            i4++;
        }
    }

    @Override // com.google.zxing.oned.s
    protected Collection<com.google.zxing.a> g() {
        return Collections.singleton(com.google.zxing.a.CODE_93);
    }
}
