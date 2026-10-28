package com.google.common.base;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: Utf8.java */
@d9.a
@o
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public final class y0 {
    private y0() {
    }

    public static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i4 = 0;
        while (i4 < length && charSequence.charAt(i4) < 128) {
            i4++;
        }
        int i5 = length;
        while (true) {
            if (i4 < length) {
                char charAt = charSequence.charAt(i4);
                if (charAt >= 2048) {
                    i5 += b(charSequence, i4);
                    break;
                }
                i5 += (127 - charAt) >>> 31;
                i4++;
            } else {
                break;
            }
        }
        if (i5 >= length) {
            return i5;
        }
        long j4 = i5 + 4294967296L;
        StringBuilder sb = new StringBuilder(54);
        sb.append(ProtectedSandApp.s("\uf3b7"));
        sb.append(j4);
        throw new IllegalArgumentException(sb.toString());
    }

    private static int b(CharSequence charSequence, int i4) {
        int length = charSequence.length();
        int i5 = 0;
        while (i4 < length) {
            char charAt = charSequence.charAt(i4);
            if (charAt < 2048) {
                i5 += (127 - charAt) >>> 31;
            } else {
                i5 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i4) == charAt) {
                        throw new IllegalArgumentException(f(i4));
                    }
                    i4++;
                }
            }
            i4++;
        }
        return i5;
    }

    public static boolean c(byte[] bArr) {
        return d(bArr, 0, bArr.length);
    }

    public static boolean d(byte[] bArr, int i4, int i5) {
        int i6 = i5 + i4;
        l0.f0(i4, i6, bArr.length);
        while (i4 < i6) {
            if (bArr[i4] < 0) {
                return e(bArr, i4, i6);
            }
            i4++;
        }
        return true;
    }

    private static boolean e(byte[] bArr, int i4, int i5) {
        byte b5;
        while (i4 < i5) {
            int i6 = i4 + 1;
            byte b6 = bArr[i4];
            if (b6 < 0) {
                if (b6 < -32) {
                    if (i6 != i5 && b6 >= -62) {
                        i4 += 2;
                        if (bArr[i6] > -65) {
                        }
                    }
                    return false;
                }
                if (b6 < -16) {
                    int i7 = i4 + 2;
                    if (i7 < i5 && (b5 = bArr[i6]) <= -65 && ((b6 != -32 || b5 >= -96) && (b6 != -19 || -96 > b5))) {
                        i4 += 3;
                        if (bArr[i7] > -65) {
                        }
                    }
                    return false;
                }
                if (i4 + 3 >= i5) {
                    return false;
                }
                int i10 = i4 + 2;
                byte b7 = bArr[i6];
                if (b7 <= -65) {
                    if ((((b7 + 112) + (b6 << c.F)) >> 30) == 0) {
                        int i11 = i4 + 3;
                        if (bArr[i10] <= -65) {
                            i4 += 4;
                            if (bArr[i11] > -65) {
                            }
                        }
                    }
                }
                return false;
            }
            i4 = i6;
        }
        return true;
    }

    private static String f(int i4) {
        return com.google.android.gms.internal.location.a.a(39, ProtectedSandApp.s("\uf3b8"), i4);
    }
}
