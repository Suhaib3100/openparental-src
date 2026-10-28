package com.google.zxing.datamatrix.encoder;

import com.android.internal.telephony.cdma.UserData;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;

/* compiled from: HighLevelEncoder.java */
/* loaded from: classes6.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final char f62873a = 129;

    /* renamed from: b, reason: collision with root package name */
    static final char f62874b = 230;

    /* renamed from: c, reason: collision with root package name */
    static final char f62875c = 231;

    /* renamed from: d, reason: collision with root package name */
    static final char f62876d = 235;

    /* renamed from: e, reason: collision with root package name */
    private static final char f62877e = 236;

    /* renamed from: f, reason: collision with root package name */
    private static final char f62878f = 237;

    /* renamed from: g, reason: collision with root package name */
    static final char f62879g = 238;

    /* renamed from: h, reason: collision with root package name */
    static final char f62880h = 239;

    /* renamed from: i, reason: collision with root package name */
    static final char f62881i = 240;

    /* renamed from: j, reason: collision with root package name */
    static final char f62882j = 254;

    /* renamed from: k, reason: collision with root package name */
    static final char f62883k = 254;

    /* renamed from: l, reason: collision with root package name */
    private static final String f62884l = ProtectedSandApp.s("ઞ\u0001");

    /* renamed from: m, reason: collision with root package name */
    private static final String f62885m = ProtectedSandApp.s("ઠ\u0001");

    /* renamed from: n, reason: collision with root package name */
    private static final String f62886n = ProtectedSandApp.s("ટ\u0001");

    /* renamed from: o, reason: collision with root package name */
    static final int f62887o = 0;

    /* renamed from: p, reason: collision with root package name */
    static final int f62888p = 1;

    /* renamed from: q, reason: collision with root package name */
    static final int f62889q = 2;

    /* renamed from: r, reason: collision with root package name */
    static final int f62890r = 3;

    /* renamed from: s, reason: collision with root package name */
    static final int f62891s = 4;

    /* renamed from: t, reason: collision with root package name */
    static final int f62892t = 5;

    private j() {
    }

    public static int a(CharSequence charSequence, int i4) {
        int length = charSequence.length();
        int i5 = 0;
        if (i4 < length) {
            char charAt = charSequence.charAt(i4);
            while (g(charAt) && i4 < length) {
                i5++;
                i4++;
                if (i4 < length) {
                    charAt = charSequence.charAt(i4);
                }
            }
        }
        return i5;
    }

    public static String b(String str) {
        return c(str, l.FORCE_NONE, null, null);
    }

    public static String c(String str, l lVar, com.google.zxing.e eVar, com.google.zxing.e eVar2) {
        int i4 = 0;
        g[] gVarArr = {new a(), new c(), new m(), new n(), new f(), new b()};
        h hVar = new h(str);
        hVar.o(lVar);
        hVar.m(eVar, eVar2);
        boolean startsWith = str.startsWith(ProtectedSandApp.s("ઞ\u0001"));
        String s4 = ProtectedSandApp.s("ટ\u0001");
        if (startsWith && str.endsWith(s4)) {
            hVar.s(f62877e);
            hVar.n(2);
            hVar.f62864f += 7;
        } else if (str.startsWith(ProtectedSandApp.s("ઠ\u0001")) && str.endsWith(s4)) {
            hVar.s(f62878f);
            hVar.n(2);
            hVar.f62864f += 7;
        }
        while (hVar.j()) {
            gVarArr[i4].a(hVar);
            if (hVar.f() >= 0) {
                i4 = hVar.f();
                hVar.k();
            }
        }
        int a5 = hVar.a();
        hVar.q();
        int b5 = hVar.h().b();
        if (a5 < b5 && i4 != 0 && i4 != 5 && i4 != 4) {
            hVar.s((char) 254);
        }
        StringBuilder b6 = hVar.b();
        if (b6.length() < b5) {
            b6.append(f62873a);
        }
        while (b6.length() < b5) {
            b6.append(p(b6.length() + 1));
        }
        return hVar.b().toString();
    }

    private static int d(float[] fArr, int[] iArr, int i4, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i5 = 0; i5 < 6; i5++) {
            int ceil = (int) Math.ceil(fArr[i5]);
            iArr[i5] = ceil;
            if (i4 > ceil) {
                Arrays.fill(bArr, (byte) 0);
                i4 = ceil;
            }
            if (i4 == ceil) {
                bArr[i5] = (byte) (bArr[i5] + 1);
            }
        }
        return i4;
    }

    private static int e(byte[] bArr) {
        int i4 = 0;
        for (int i5 = 0; i5 < 6; i5++) {
            i4 += bArr[i5];
        }
        return i4;
    }

    static void f(char c5) {
        String hexString = Integer.toHexString(c5);
        throw new IllegalArgumentException(ProtectedSandApp.s("ઢ\u0001") + c5 + ProtectedSandApp.s("ણ\u0001") + (ProtectedSandApp.s("ડ\u0001").substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    static boolean g(char c5) {
        return c5 >= '0' && c5 <= '9';
    }

    static boolean h(char c5) {
        return c5 >= 128 && c5 <= 255;
    }

    private static boolean i(char c5) {
        if (c5 == ' ') {
            return true;
        }
        if (c5 < '0' || c5 > '9') {
            return c5 >= 'A' && c5 <= 'Z';
        }
        return true;
    }

    private static boolean j(char c5) {
        return c5 >= ' ' && c5 <= '^';
    }

    private static boolean k(char c5) {
        if (c5 == ' ') {
            return true;
        }
        if (c5 < '0' || c5 > '9') {
            return c5 >= 'a' && c5 <= 'z';
        }
        return true;
    }

    private static boolean l(char c5) {
        if (n(c5) || c5 == ' ') {
            return true;
        }
        if (c5 < '0' || c5 > '9') {
            return c5 >= 'A' && c5 <= 'Z';
        }
        return true;
    }

    private static boolean m(char c5) {
        return false;
    }

    private static boolean n(char c5) {
        return c5 == '\r' || c5 == '*' || c5 == '>';
    }

    static int o(CharSequence charSequence, int i4, int i5) {
        float[] fArr;
        int i6;
        if (i4 >= charSequence.length()) {
            return i5;
        }
        float f4 = 2.0f;
        int i7 = 6;
        int i10 = 5;
        if (i5 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[6];
            fArr[0] = 1.0f;
            fArr[1] = 2.0f;
            fArr[2] = 2.0f;
            fArr[3] = 2.0f;
            fArr[4] = 2.0f;
            fArr[5] = 2.25f;
            fArr[i5] = 0.0f;
        }
        int i11 = 0;
        while (true) {
            int i12 = i4 + i11;
            if (i12 == charSequence.length()) {
                byte[] bArr = new byte[i7];
                int[] iArr = new int[i7];
                int d5 = d(fArr, iArr, Integer.MAX_VALUE, bArr);
                int e4 = e(bArr);
                if (iArr[0] == d5) {
                    return 0;
                }
                if (e4 == 1 && bArr[i10] > 0) {
                    return i10;
                }
                if (e4 == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (e4 != 1 || bArr[2] <= 0) {
                    return (e4 != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char charAt = charSequence.charAt(i12);
            i11++;
            if (g(charAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (h(charAt)) {
                float ceil = (float) Math.ceil(fArr[0]);
                fArr[0] = ceil;
                fArr[0] = ceil + f4;
            } else {
                float ceil2 = (float) Math.ceil(fArr[0]);
                fArr[0] = ceil2;
                fArr[0] = ceil2 + 1.0f;
            }
            if (i(charAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (h(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (k(charAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (h(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (l(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (h(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (j(charAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (h(charAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            fArr[5] = fArr[5] + 1.0f;
            if (i11 >= 4) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                d(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int e5 = e(bArr2);
                int i13 = iArr2[0];
                int i14 = iArr2[5];
                if (i13 < i14 && i13 < iArr2[1] && i13 < iArr2[2] && i13 < iArr2[3] && i13 < iArr2[4]) {
                    return 0;
                }
                if (i14 < i13) {
                    return 5;
                }
                byte b5 = bArr2[1];
                byte b6 = bArr2[2];
                byte b7 = bArr2[3];
                byte b10 = bArr2[4];
                if (b5 + b6 + b7 + b10 == 0) {
                    return 5;
                }
                if (e5 == 1 && b10 > 0) {
                    return 4;
                }
                if (e5 == 1 && b6 > 0) {
                    return 2;
                }
                if (e5 == 1 && b7 > 0) {
                    return 3;
                }
                int i15 = iArr2[1];
                if (i15 + 1 < i13 && i15 + 1 < i14 && i15 + 1 < iArr2[4] && i15 + 1 < iArr2[2]) {
                    int i16 = iArr2[3];
                    if (i15 < i16) {
                        return 1;
                    }
                    if (i15 == i16) {
                        for (int i17 = i4 + i11 + 1; i17 < charSequence.length(); i17++) {
                            char charAt2 = charSequence.charAt(i17);
                            if (n(charAt2)) {
                                return 3;
                            }
                            if (!l(charAt2)) {
                                break;
                            }
                        }
                        return 1;
                    }
                }
                i6 = 5;
            } else {
                i6 = 5;
            }
            i10 = i6;
            f4 = 2.0f;
            i7 = 6;
        }
    }

    private static char p(int i4) {
        int i5 = (i4 * 149) % 253;
        int i6 = i5 + UserData.IS91_MSG_TYPE_VOICEMAIL_STATUS;
        if (i6 > 254) {
            i6 = i5 - 124;
        }
        return (char) i6;
    }
}
