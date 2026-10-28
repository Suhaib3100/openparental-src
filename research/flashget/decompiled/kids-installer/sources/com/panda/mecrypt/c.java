package com.panda.mecrypt;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.UnsupportedEncodingException;
import kotlin.jvm.internal.ByteCompanionObject;
import okio.r0;

/* compiled from: Base64.java */
/* loaded from: classes5.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    static final int f21469a = 76;

    /* renamed from: c, reason: collision with root package name */
    static final int f21471c = 255;

    /* renamed from: d, reason: collision with root package name */
    static final int f21472d = 64;

    /* renamed from: e, reason: collision with root package name */
    static final int f21473e = 8;

    /* renamed from: f, reason: collision with root package name */
    static final int f21474f = 16;

    /* renamed from: g, reason: collision with root package name */
    static final int f21475g = 24;

    /* renamed from: h, reason: collision with root package name */
    static final int f21476h = 4;

    /* renamed from: i, reason: collision with root package name */
    static final int f21477i = -128;

    /* renamed from: j, reason: collision with root package name */
    static final byte f21478j = 61;

    /* renamed from: b, reason: collision with root package name */
    static final byte[] f21470b = ProtectedSandApp.s("㗡").getBytes();

    /* renamed from: k, reason: collision with root package name */
    private static byte[] f21479k = new byte[255];

    /* renamed from: l, reason: collision with root package name */
    private static byte[] f21480l = new byte[64];

    static {
        int i5;
        int i6;
        int i7 = 0;
        for (int i8 = 0; i8 < 255; i8++) {
            f21479k[i8] = -1;
        }
        for (int i9 = 90; i9 >= 65; i9--) {
            f21479k[i9] = (byte) (i9 - 65);
        }
        int i10 = 122;
        while (true) {
            i5 = 26;
            if (i10 < 97) {
                break;
            }
            f21479k[i10] = (byte) ((i10 - 97) + 26);
            i10--;
        }
        int i11 = 57;
        while (true) {
            i6 = 52;
            if (i11 < 48) {
                break;
            }
            f21479k[i11] = (byte) ((i11 - 48) + 52);
            i11--;
        }
        byte[] bArr = f21479k;
        bArr[43] = 62;
        bArr[47] = r0.f31710a;
        for (int i12 = 0; i12 <= 25; i12++) {
            f21480l[i12] = (byte) (i12 + 65);
        }
        int i13 = 0;
        while (i5 <= 51) {
            f21480l[i5] = (byte) (i13 + 97);
            i5++;
            i13++;
        }
        while (i6 <= 61) {
            f21480l[i6] = (byte) (i7 + 48);
            i6++;
            i7++;
        }
        byte[] bArr2 = f21480l;
        bArr2[62] = 43;
        bArr2[63] = 47;
    }

    public static String a(String str) throws UnsupportedEncodingException {
        String s5 = ProtectedSandApp.s("㗢");
        if (str.length() < 40) {
            return "";
        }
        try {
            String str2 = new String(d(str.getBytes(s5)));
            return new String(d(str2.substring(40, str2.length()).getBytes(s5)));
        } catch (ArrayIndexOutOfBoundsException unused) {
            return "";
        }
    }

    public static byte[] b(byte[] bArr) {
        return d(bArr);
    }

    public static byte[] c(String str) {
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        int q5 = q(charArray);
        if (q5 % 4 != 0) {
            return null;
        }
        int i5 = q5 / 4;
        if (i5 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i5 * 3];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < i5 - 1) {
            int i9 = i7 + 1;
            char c6 = charArray[i7];
            if (n(c6)) {
                int i10 = i9 + 1;
                char c7 = charArray[i9];
                if (n(c7)) {
                    int i11 = i10 + 1;
                    char c8 = charArray[i10];
                    if (n(c8)) {
                        int i12 = i11 + 1;
                        char c9 = charArray[i11];
                        if (n(c9)) {
                            byte[] bArr2 = f21479k;
                            byte b6 = bArr2[c6];
                            byte b7 = bArr2[c7];
                            byte b8 = bArr2[c8];
                            byte b9 = bArr2[c9];
                            int i13 = i8 + 1;
                            bArr[i8] = (byte) ((b6 << 2) | (b7 >> 4));
                            int i14 = i13 + 1;
                            bArr[i13] = (byte) (((b7 & 15) << 4) | ((b8 >> 2) & 15));
                            i8 = i14 + 1;
                            bArr[i14] = (byte) ((b8 << 6) | b9);
                            i6++;
                            i7 = i12;
                        }
                    }
                }
            }
            return null;
        }
        int i15 = i7 + 1;
        char c10 = charArray[i7];
        if (!n(c10)) {
            return null;
        }
        int i16 = i15 + 1;
        char c11 = charArray[i15];
        if (!n(c11)) {
            return null;
        }
        byte[] bArr3 = f21479k;
        byte b10 = bArr3[c10];
        byte b11 = bArr3[c11];
        int i17 = i16 + 1;
        char c12 = charArray[i16];
        char c13 = charArray[i17];
        if (n(c12) && n(c13)) {
            byte[] bArr4 = f21479k;
            byte b12 = bArr4[c12];
            byte b13 = bArr4[c13];
            int i18 = i8 + 1;
            bArr[i8] = (byte) ((b10 << 2) | (b11 >> 4));
            bArr[i18] = (byte) (((b11 & 15) << 4) | ((b12 >> 2) & 15));
            bArr[i18 + 1] = (byte) (b13 | (b12 << 6));
            return bArr;
        }
        if (o(c12) && o(c13)) {
            if ((b11 & 15) != 0) {
                return null;
            }
            int i19 = i6 * 3;
            byte[] bArr5 = new byte[i19 + 1];
            System.arraycopy(bArr, 0, bArr5, 0, i19);
            bArr5[i8] = (byte) ((b10 << 2) | (b11 >> 4));
            return bArr5;
        }
        if (o(c12) || !o(c13)) {
            return null;
        }
        byte b14 = f21479k[c12];
        if ((b14 & 3) != 0) {
            return null;
        }
        int i20 = i6 * 3;
        byte[] bArr6 = new byte[i20 + 2];
        System.arraycopy(bArr, 0, bArr6, 0, i20);
        bArr6[i8] = (byte) ((b10 << 2) | (b11 >> 4));
        bArr6[i8 + 1] = (byte) (((b14 >> 2) & 15) | ((b11 & 15) << 4));
        return bArr6;
    }

    public static byte[] d(byte[] bArr) {
        byte[] e6 = e(bArr);
        if (e6.length == 0) {
            return new byte[0];
        }
        int length = e6.length / 4;
        int length2 = e6.length;
        while (e6[length2 - 1] == 61) {
            length2--;
            if (length2 == 0) {
                return new byte[0];
            }
        }
        byte[] bArr2 = new byte[length2 - length];
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = i6 * 4;
            byte b6 = e6[i7 + 2];
            byte b7 = e6[i7 + 3];
            byte[] bArr3 = f21479k;
            byte b8 = bArr3[e6[i7]];
            byte b9 = bArr3[e6[i7 + 1]];
            if (b6 != 61 && b7 != 61) {
                byte b10 = bArr3[b6];
                byte b11 = bArr3[b7];
                bArr2[i5] = (byte) ((b8 << 2) | (b9 >> 4));
                bArr2[i5 + 1] = (byte) (((b9 & 15) << 4) | ((b10 >> 2) & 15));
                bArr2[i5 + 2] = (byte) ((b10 << 6) | b11);
            } else if (b6 == 61) {
                bArr2[i5] = (byte) ((b9 >> 4) | (b8 << 2));
            } else if (b7 == 61) {
                byte b12 = bArr3[b6];
                bArr2[i5] = (byte) ((b8 << 2) | (b9 >> 4));
                bArr2[i5 + 1] = (byte) (((b9 & 15) << 4) | ((b12 >> 2) & 15));
            }
            i5 += 3;
        }
        return bArr2;
    }

    static byte[] e(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i5 = 0;
        for (int i6 = 0; i6 < bArr.length; i6++) {
            if (m(bArr[i6])) {
                bArr2[i5] = bArr[i6];
                i5++;
            }
        }
        byte[] bArr3 = new byte[i5];
        System.arraycopy(bArr2, 0, bArr3, 0, i5);
        return bArr3;
    }

    static byte[] f(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i5 = 0;
        for (byte b6 : bArr) {
            if (b6 != 9 && b6 != 10 && b6 != 13 && b6 != 32) {
                bArr2[i5] = b6;
                i5++;
            }
        }
        byte[] bArr3 = new byte[i5];
        System.arraycopy(bArr2, 0, bArr3, 0, i5);
        return bArr3;
    }

    public static String g(String str) throws UnsupportedEncodingException {
        String s5 = ProtectedSandApp.s("㗣");
        return new String(j(androidx.concurrent.futures.b.a(j.a(str).toUpperCase(), new String(j(str.getBytes(s5), false))).getBytes(s5), false));
    }

    public static byte[] h(byte[] bArr) {
        return j(bArr, false);
    }

    public static byte[] i(byte[] bArr) {
        return j(bArr, false);
    }

    public static byte[] j(byte[] bArr, boolean z5) {
        int i5;
        int length = bArr.length * 8;
        int i6 = length % 24;
        int i7 = length / 24;
        int i8 = i6 != 0 ? (i7 + 1) * 4 : i7 * 4;
        if (z5) {
            byte[] bArr2 = f21470b;
            i5 = bArr2.length == 0 ? 0 : (int) Math.ceil(i8 / 76.0f);
            i8 += bArr2.length * i5;
        } else {
            i5 = 0;
        }
        byte[] bArr3 = new byte[i8];
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 76;
        while (i9 < i7) {
            int i13 = i9 * 3;
            byte b6 = bArr[i13];
            byte b7 = bArr[i13 + 1];
            byte b8 = bArr[i13 + 2];
            byte b9 = (byte) (b7 & 15);
            byte b10 = (byte) (b6 & 3);
            int i14 = b6 & ByteCompanionObject.f23584b;
            int i15 = b6 >> 2;
            if (i14 != 0) {
                i15 ^= 192;
            }
            byte b11 = (byte) i15;
            int i16 = b7 & ByteCompanionObject.f23584b;
            int i17 = b7 >> 4;
            if (i16 != 0) {
                i17 ^= 240;
            }
            byte b12 = (byte) i17;
            int i18 = b8 >> 6;
            if ((b8 & ByteCompanionObject.f23584b) != 0) {
                i18 ^= 252;
            }
            byte[] bArr4 = f21480l;
            bArr3[i10] = bArr4[b11];
            bArr3[i10 + 1] = bArr4[(b10 << 4) | b12];
            bArr3[i10 + 2] = bArr4[(b9 << 2) | ((byte) i18)];
            bArr3[i10 + 3] = bArr4[b8 & r0.f31710a];
            i10 += 4;
            if (z5 && i10 == i12) {
                byte[] bArr5 = f21470b;
                System.arraycopy(bArr5, 0, bArr3, i10, bArr5.length);
                i11++;
                i12 = (bArr5.length * i11) + ((i11 + 1) * 76);
                i10 += bArr5.length;
            }
            i9++;
        }
        int i19 = i9 * 3;
        if (i6 == 8) {
            byte b13 = bArr[i19];
            byte b14 = (byte) (b13 & 3);
            int i20 = b13 & ByteCompanionObject.f23584b;
            int i21 = b13 >> 2;
            if (i20 != 0) {
                i21 ^= 192;
            }
            byte[] bArr6 = f21480l;
            bArr3[i10] = bArr6[(byte) i21];
            bArr3[i10 + 1] = bArr6[b14 << 4];
            bArr3[i10 + 2] = 61;
            bArr3[i10 + 3] = 61;
        } else if (i6 == 16) {
            byte b15 = bArr[i19];
            byte b16 = bArr[i19 + 1];
            byte b17 = (byte) (b16 & 15);
            byte b18 = (byte) (b15 & 3);
            int i22 = b15 & ByteCompanionObject.f23584b;
            int i23 = b15 >> 2;
            if (i22 != 0) {
                i23 ^= 192;
            }
            byte b19 = (byte) i23;
            int i24 = b16 & ByteCompanionObject.f23584b;
            int i25 = b16 >> 4;
            if (i24 != 0) {
                i25 ^= 240;
            }
            byte[] bArr7 = f21480l;
            bArr3[i10] = bArr7[b19];
            bArr3[i10 + 1] = bArr7[((byte) i25) | (b18 << 4)];
            bArr3[i10 + 2] = bArr7[b17 << 2];
            bArr3[i10 + 3] = 61;
        }
        if (z5 && i11 < i5) {
            byte[] bArr8 = f21470b;
            System.arraycopy(bArr8, 0, bArr3, i8 - bArr8.length, bArr8.length);
        }
        return bArr3;
    }

    public static byte[] k(byte[] bArr) {
        return j(bArr, true);
    }

    public static boolean l(byte[] bArr) {
        byte[] f6 = f(bArr);
        if (f6.length == 0) {
            return true;
        }
        for (byte b6 : f6) {
            if (!m(b6)) {
                return false;
            }
        }
        return true;
    }

    private static boolean m(byte b6) {
        return b6 == 61 || f21479k[b6] != -1;
    }

    private static boolean n(char c6) {
        return c6 < 255 && f21479k[c6] != -1;
    }

    private static boolean o(char c6) {
        return c6 == '=';
    }

    private static boolean p(char c6) {
        return c6 == ' ' || c6 == '\r' || c6 == '\n' || c6 == '\t';
    }

    private static int q(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            if (!p(cArr[i6])) {
                cArr[i5] = cArr[i6];
                i5++;
            }
        }
        return i5;
    }
}
