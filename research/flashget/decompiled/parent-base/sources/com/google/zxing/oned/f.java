package com.google.zxing.oned;

import androidx.collection.r2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.Collections;
import kotlin.text.m0;

/* compiled from: Code39Writer.java */
/* loaded from: classes6.dex */
public final class f extends s {
    private static void i(int i4, int[] iArr) {
        for (int i5 = 0; i5 < 9; i5++) {
            int i6 = 1;
            if (((1 << (8 - i5)) & i4) != 0) {
                i6 = 2;
            }
            iArr[i5] = i6;
        }
    }

    private static String j(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (charAt != 0) {
                if (charAt != ' ') {
                    if (charAt == '@') {
                        sb.append(ProtectedSandApp.s("૭\u0001"));
                    } else if (charAt == '`') {
                        sb.append(ProtectedSandApp.s("૬\u0001"));
                    } else if (charAt != '-' && charAt != '.') {
                        if (charAt <= 26) {
                            sb.append('$');
                            sb.append((char) (charAt + '@'));
                        } else if (charAt < ' ') {
                            sb.append('%');
                            sb.append((char) (charAt + m0.amp));
                        } else if (charAt <= ',' || charAt == '/' || charAt == ':') {
                            sb.append('/');
                            sb.append((char) (charAt + ' '));
                        } else if (charAt <= '9') {
                            sb.append(charAt);
                        } else if (charAt <= '?') {
                            sb.append('%');
                            sb.append((char) (charAt + 11));
                        } else if (charAt <= 'Z') {
                            sb.append(charAt);
                        } else if (charAt <= '_') {
                            sb.append('%');
                            sb.append((char) (charAt - 16));
                        } else if (charAt <= 'z') {
                            sb.append('+');
                            sb.append((char) (charAt - ' '));
                        } else {
                            if (charAt > 127) {
                                throw new IllegalArgumentException(ProtectedSandApp.s("૪\u0001") + str.charAt(i4) + ProtectedSandApp.s("૫\u0001"));
                            }
                            sb.append('%');
                            sb.append((char) (charAt - '+'));
                        }
                    }
                }
                sb.append(charAt);
            } else {
                sb.append(ProtectedSandApp.s("૮\u0001"));
            }
        }
        return sb.toString();
    }

    @Override // com.google.zxing.oned.s
    public boolean[] e(String str) {
        String s4;
        int length = str.length();
        String s5 = ProtectedSandApp.s("૯\u0001");
        if (length > 80) {
            throw new IllegalArgumentException(s5.concat(String.valueOf(length)));
        }
        int i4 = 0;
        while (true) {
            s4 = ProtectedSandApp.s("૰\u0001");
            if (i4 >= length) {
                break;
            }
            if (s4.indexOf(str.charAt(i4)) < 0) {
                str = j(str);
                length = str.length();
                if (length > 80) {
                    throw new IllegalArgumentException(r2.a(s5, length, ProtectedSandApp.s("૱\u0001")));
                }
            } else {
                i4++;
            }
        }
        int[] iArr = new int[9];
        boolean[] zArr = new boolean[(length * 13) + 25];
        i(148, iArr);
        int c5 = s.c(zArr, 0, iArr, true);
        int[] iArr2 = {1};
        int c6 = c5 + s.c(zArr, c5, iArr2, false);
        for (int i5 = 0; i5 < length; i5++) {
            i(e.f63019f[s4.indexOf(str.charAt(i5))], iArr);
            int c7 = c6 + s.c(zArr, c6, iArr, true);
            c6 = c7 + s.c(zArr, c7, iArr2, false);
        }
        i(148, iArr);
        s.c(zArr, c6, iArr, true);
        return zArr;
    }

    @Override // com.google.zxing.oned.s
    protected Collection<com.google.zxing.a> g() {
        return Collections.singleton(com.google.zxing.a.CODE_39);
    }
}
