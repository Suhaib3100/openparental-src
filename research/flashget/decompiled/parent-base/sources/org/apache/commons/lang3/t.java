package org.apache.commons.lang3;

import java.util.UUID;
import kotlin.g2;

/* compiled from: Conversion.java */
/* loaded from: classes6.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean[] f86120a = {true, true, true, true};

    /* renamed from: b, reason: collision with root package name */
    private static final boolean[] f86121b = {false, true, true, true};

    /* renamed from: c, reason: collision with root package name */
    private static final boolean[] f86122c = {true, false, true, true};

    /* renamed from: d, reason: collision with root package name */
    private static final boolean[] f86123d = {false, false, true, true};

    /* renamed from: e, reason: collision with root package name */
    private static final boolean[] f86124e = {true, true, false, true};

    /* renamed from: f, reason: collision with root package name */
    private static final boolean[] f86125f = {false, true, false, true};

    /* renamed from: g, reason: collision with root package name */
    private static final boolean[] f86126g = {true, false, false, true};

    /* renamed from: h, reason: collision with root package name */
    private static final boolean[] f86127h = {false, false, false, true};

    /* renamed from: i, reason: collision with root package name */
    private static final boolean[] f86128i = {true, true, true, false};

    /* renamed from: j, reason: collision with root package name */
    private static final boolean[] f86129j = {false, true, true, false};

    /* renamed from: k, reason: collision with root package name */
    private static final boolean[] f86130k = {true, false, true, false};

    /* renamed from: l, reason: collision with root package name */
    private static final boolean[] f86131l = {false, false, true, false};

    /* renamed from: m, reason: collision with root package name */
    private static final boolean[] f86132m = {true, true, false, false};

    /* renamed from: n, reason: collision with root package name */
    private static final boolean[] f86133n = {false, true, false, false};

    /* renamed from: o, reason: collision with root package name */
    private static final boolean[] f86134o = {true, false, false, false};

    /* renamed from: p, reason: collision with root package name */
    private static final boolean[] f86135p = {false, false, false, false};

    /* renamed from: q, reason: collision with root package name */
    static final /* synthetic */ boolean f86136q = false;

    public static byte[] A(int i4, int i5, byte[] bArr, int i6, int i7) {
        if (i7 == 0) {
            return bArr;
        }
        if (androidx.core.graphics.y.a(i7, 1, 8, i5) >= 32) {
            throw new IllegalArgumentException("(nBytes-1)*8+srcPos is greater or equal to than 32");
        }
        for (int i10 = 0; i10 < i7; i10++) {
            bArr[i6 + i10] = (byte) ((i4 >> ((i10 * 8) + i5)) & 255);
        }
        return bArr;
    }

    public static String B(int i4, int i5, String str, int i6, int i7) {
        if (i7 == 0) {
            return str;
        }
        if (androidx.core.graphics.y.a(i7, 1, 4, i5) >= 32) {
            throw new IllegalArgumentException("(nHexs-1)*4+srcPos is greater or equal to than 32");
        }
        StringBuilder sb = new StringBuilder(str);
        int length = sb.length();
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = (i4 >> ((i10 * 4) + i5)) & 15;
            int i12 = i6 + i10;
            if (i12 == length) {
                length++;
                sb.append(C(i11));
            } else {
                sb.setCharAt(i12, C(i11));
            }
        }
        return sb.toString();
    }

    public static char C(int i4) {
        char forDigit = Character.forDigit(i4, 16);
        if (forDigit != 0) {
            return forDigit;
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a("nibble value not between 0 and 15: ", i4));
    }

    public static char D(int i4) {
        switch (i4) {
            case 0:
                return '0';
            case 1:
                return '8';
            case 2:
                return '4';
            case 3:
                return 'c';
            case 4:
                return '2';
            case 5:
                return 'a';
            case 6:
                return '6';
            case 7:
                return 'e';
            case 8:
                return '1';
            case 9:
                return '9';
            case 10:
                return '5';
            case 11:
                return 'd';
            case 12:
                return '3';
            case 13:
                return 'b';
            case 14:
                return '7';
            case 15:
                return 'f';
            default:
                throw new IllegalArgumentException(android.support.v4.media.a.a("nibble value not between 0 and 15: ", i4));
        }
    }

    public static short[] E(int i4, int i5, short[] sArr, int i6, int i7) {
        if (i7 == 0) {
            return sArr;
        }
        if (androidx.core.graphics.y.a(i7, 1, 16, i5) >= 32) {
            throw new IllegalArgumentException("(nShorts-1)*16+srcPos is greater or equal to than 32");
        }
        for (int i10 = 0; i10 < i7; i10++) {
            sArr[i6 + i10] = (short) ((i4 >> ((i10 * 16) + i5)) & 65535);
        }
        return sArr;
    }

    public static boolean[] F(long j4, int i4, boolean[] zArr, int i5, int i6) {
        if (i6 == 0) {
            return zArr;
        }
        if ((i6 - 1) + i4 >= 64) {
            throw new IllegalArgumentException("nBools-1+srcPos is greater or equal to than 64");
        }
        for (int i7 = 0; i7 < i6; i7++) {
            zArr[i5 + i7] = (1 & (j4 >> (i7 + i4))) != 0;
        }
        return zArr;
    }

    public static byte[] G(long j4, int i4, byte[] bArr, int i5, int i6) {
        if (i6 == 0) {
            return bArr;
        }
        if (androidx.core.graphics.y.a(i6, 1, 8, i4) >= 64) {
            throw new IllegalArgumentException("(nBytes-1)*8+srcPos is greater or equal to than 64");
        }
        for (int i7 = 0; i7 < i6; i7++) {
            bArr[i5 + i7] = (byte) (255 & (j4 >> ((i7 * 8) + i4)));
        }
        return bArr;
    }

    public static String H(long j4, int i4, String str, int i5, int i6) {
        if (i6 == 0) {
            return str;
        }
        if (androidx.core.graphics.y.a(i6, 1, 4, i4) >= 64) {
            throw new IllegalArgumentException("(nHexs-1)*4+srcPos is greater or equal to than 64");
        }
        StringBuilder sb = new StringBuilder(str);
        int length = sb.length();
        for (int i7 = 0; i7 < i6; i7++) {
            int i10 = (int) ((j4 >> ((i7 * 4) + i4)) & 15);
            int i11 = i5 + i7;
            if (i11 == length) {
                length++;
                sb.append(C(i10));
            } else {
                sb.setCharAt(i11, C(i10));
            }
        }
        return sb.toString();
    }

    public static int[] I(long j4, int i4, int[] iArr, int i5, int i6) {
        if (i6 == 0) {
            return iArr;
        }
        if (androidx.core.graphics.y.a(i6, 1, 32, i4) >= 64) {
            throw new IllegalArgumentException("(nInts-1)*32+srcPos is greater or equal to than 64");
        }
        for (int i7 = 0; i7 < i6; i7++) {
            iArr[i5 + i7] = (int) (j4 >> ((i7 * 32) + i4));
        }
        return iArr;
    }

    public static short[] J(long j4, int i4, short[] sArr, int i5, int i6) {
        if (i6 == 0) {
            return sArr;
        }
        if (androidx.core.graphics.y.a(i6, 1, 16, i4) >= 64) {
            throw new IllegalArgumentException("(nShorts-1)*16+srcPos is greater or equal to than 64");
        }
        for (int i7 = 0; i7 < i6; i7++) {
            sArr[i5 + i7] = (short) (okhttp3.internal.ws.g.f84969s & (j4 >> ((i7 * 16) + i4)));
        }
        return sArr;
    }

    public static int K(short[] sArr, int i4, int i5, int i6, int i7) {
        if ((sArr.length == 0 && i4 == 0) || i7 == 0) {
            return i5;
        }
        if (androidx.core.graphics.y.a(i7, 1, 16, i6) >= 32) {
            throw new IllegalArgumentException("(nShorts-1)*16+dstPos is greater or equal to than 32");
        }
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = (i10 * 16) + i6;
            i5 = (i5 & (~(65535 << i11))) | ((sArr[i10 + i4] & g2.f75095e) << i11);
        }
        return i5;
    }

    public static long L(short[] sArr, int i4, long j4, int i5, int i6) {
        if ((sArr.length == 0 && i4 == 0) || i6 == 0) {
            return j4;
        }
        if (androidx.core.graphics.y.a(i6, 1, 16, i5) >= 64) {
            throw new IllegalArgumentException("(nShorts-1)*16+dstPos is greater or equal to than 64");
        }
        for (int i7 = 0; i7 < i6; i7++) {
            int i10 = (i7 * 16) + i5;
            j4 = (j4 & (~(okhttp3.internal.ws.g.f84969s << i10))) | ((sArr[i7 + i4] & okhttp3.internal.ws.g.f84969s) << i10);
        }
        return j4;
    }

    public static boolean[] M(short s4, int i4, boolean[] zArr, int i5, int i6) {
        if (i6 == 0) {
            return zArr;
        }
        if ((i6 - 1) + i4 >= 16) {
            throw new IllegalArgumentException("nBools-1+srcPos is greater or equal to than 16");
        }
        for (int i7 = 0; i7 < i6; i7++) {
            int i10 = i5 + i7;
            boolean z4 = true;
            if (((s4 >> (i7 + i4)) & 1) == 0) {
                z4 = false;
            }
            zArr[i10] = z4;
        }
        return zArr;
    }

    public static byte[] N(short s4, int i4, byte[] bArr, int i5, int i6) {
        if (i6 == 0) {
            return bArr;
        }
        if (androidx.core.graphics.y.a(i6, 1, 8, i4) >= 16) {
            throw new IllegalArgumentException("(nBytes-1)*8+srcPos is greater or equal to than 16");
        }
        for (int i7 = 0; i7 < i6; i7++) {
            bArr[i5 + i7] = (byte) ((s4 >> ((i7 * 8) + i4)) & 255);
        }
        return bArr;
    }

    public static String O(short s4, int i4, String str, int i5, int i6) {
        if (i6 == 0) {
            return str;
        }
        if (androidx.core.graphics.y.a(i6, 1, 4, i4) >= 16) {
            throw new IllegalArgumentException("(nHexs-1)*4+srcPos is greater or equal to than 16");
        }
        StringBuilder sb = new StringBuilder(str);
        int length = sb.length();
        for (int i7 = 0; i7 < i6; i7++) {
            int i10 = (s4 >> ((i7 * 4) + i4)) & 15;
            int i11 = i5 + i7;
            if (i11 == length) {
                length++;
                sb.append(C(i10));
            } else {
                sb.setCharAt(i11, C(i10));
            }
        }
        return sb.toString();
    }

    public static byte[] P(UUID uuid, byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return bArr;
        }
        if (i5 > 16) {
            throw new IllegalArgumentException("nBytes is greater than 16");
        }
        G(uuid.getMostSignificantBits(), 0, bArr, i4, Math.min(i5, 8));
        if (i5 >= 8) {
            G(uuid.getLeastSignificantBits(), 0, bArr, i4 + 8, i5 - 8);
        }
        return bArr;
    }

    public static char a(boolean[] zArr) {
        return b(zArr, 0);
    }

    public static char b(boolean[] zArr, int i4) {
        if (zArr.length == 0) {
            throw new IllegalArgumentException("Cannot convert an empty array.");
        }
        int length = ((zArr.length - 1) - i4) + 1;
        int min = Math.min(4, length);
        boolean[] zArr2 = new boolean[4];
        System.arraycopy(zArr, length - min, zArr2, 4 - min, min);
        return zArr2[0] ? zArr2[1] ? zArr2[2] ? zArr2[3] ? 'f' : 'e' : zArr2[3] ? 'd' : 'c' : zArr2[2] ? zArr2[3] ? 'b' : 'a' : zArr2[3] ? '9' : '8' : zArr2[1] ? zArr2[2] ? zArr2[3] ? '7' : '6' : zArr2[3] ? '5' : '4' : zArr2[2] ? zArr2[3] ? '3' : '2' : zArr2[3] ? '1' : '0';
    }

    public static byte c(boolean[] zArr, int i4, byte b5, int i5, int i6) {
        if ((zArr.length == 0 && i4 == 0) || i6 == 0) {
            return b5;
        }
        if ((i6 - 1) + i5 >= 8) {
            throw new IllegalArgumentException("nBools-1+dstPos is greater or equal to than 8");
        }
        for (int i7 = 0; i7 < i6; i7++) {
            int i10 = i7 + i5;
            b5 = (byte) ((b5 & (~(1 << i10))) | ((zArr[i7 + i4] ? 1 : 0) << i10));
        }
        return b5;
    }

    public static char d(boolean[] zArr) {
        return e(zArr, 0);
    }

    public static char e(boolean[] zArr, int i4) {
        if (zArr.length == 0) {
            throw new IllegalArgumentException("Cannot convert an empty array.");
        }
        int i5 = i4 + 3;
        if (zArr.length > i5 && zArr[i5]) {
            return zArr[i4 + 2] ? zArr[i4 + 1] ? zArr[i4] ? 'f' : 'e' : zArr[i4] ? 'd' : 'c' : zArr[i4 + 1] ? zArr[i4] ? 'b' : 'a' : zArr[i4] ? '9' : '8';
        }
        int i6 = i4 + 2;
        if (zArr.length > i6 && zArr[i6]) {
            return zArr[i4 + 1] ? zArr[i4] ? '7' : '6' : zArr[i4] ? '5' : '4';
        }
        int i7 = i4 + 1;
        return (zArr.length <= i7 || !zArr[i7]) ? zArr[i4] ? '1' : '0' : zArr[i4] ? '3' : '2';
    }

    public static char f(boolean[] zArr) {
        return g(zArr, 0);
    }

    public static char g(boolean[] zArr, int i4) {
        if (zArr.length > 8) {
            throw new IllegalArgumentException("src.length>8: src.length=" + zArr.length);
        }
        if (zArr.length - i4 >= 4) {
            return zArr[i4 + 3] ? zArr[i4 + 2] ? zArr[i4 + 1] ? zArr[i4] ? 'f' : '7' : zArr[i4] ? 'b' : '3' : zArr[i4 + 1] ? zArr[i4] ? 'd' : '5' : zArr[i4] ? '9' : '1' : zArr[i4 + 2] ? zArr[i4 + 1] ? zArr[i4] ? 'e' : '6' : zArr[i4] ? 'a' : '2' : zArr[i4 + 1] ? zArr[i4] ? 'c' : '4' : zArr[i4] ? '8' : '0';
        }
        throw new IllegalArgumentException("src.length-srcPos<4: src.length=" + zArr.length + ", srcPos=" + i4);
    }

    public static int h(boolean[] zArr, int i4, int i5, int i6, int i7) {
        if ((zArr.length == 0 && i4 == 0) || i7 == 0) {
            return i5;
        }
        if ((i7 - 1) + i6 >= 32) {
            throw new IllegalArgumentException("nBools-1+dstPos is greater or equal to than 32");
        }
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = i10 + i6;
            i5 = (i5 & (~(1 << i11))) | ((zArr[i10 + i4] ? 1 : 0) << i11);
        }
        return i5;
    }

    public static long i(boolean[] zArr, int i4, long j4, int i5, int i6) {
        if ((zArr.length == 0 && i4 == 0) || i6 == 0) {
            return j4;
        }
        if ((i6 - 1) + i5 >= 64) {
            throw new IllegalArgumentException("nBools-1+dstPos is greater or equal to than 64");
        }
        for (int i7 = 0; i7 < i6; i7++) {
            int i10 = i7 + i5;
            j4 = (j4 & (~(1 << i10))) | ((zArr[i7 + i4] ? 1L : 0L) << i10);
        }
        return j4;
    }

    public static short j(boolean[] zArr, int i4, short s4, int i5, int i6) {
        if ((zArr.length == 0 && i4 == 0) || i6 == 0) {
            return s4;
        }
        if ((i6 - 1) + i5 >= 16) {
            throw new IllegalArgumentException("nBools-1+dstPos is greater or equal to than 16");
        }
        for (int i7 = 0; i7 < i6; i7++) {
            int i10 = i7 + i5;
            s4 = (short) ((s4 & (~(1 << i10))) | ((zArr[i7 + i4] ? 1 : 0) << i10));
        }
        return s4;
    }

    public static int k(byte[] bArr, int i4, int i5, int i6, int i7) {
        if ((bArr.length == 0 && i4 == 0) || i7 == 0) {
            return i5;
        }
        if (androidx.core.graphics.y.a(i7, 1, 8, i6) >= 32) {
            throw new IllegalArgumentException("(nBytes-1)*8+dstPos is greater or equal to than 32");
        }
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = (i10 * 8) + i6;
            i5 = (i5 & (~(255 << i11))) | ((bArr[i10 + i4] & 255) << i11);
        }
        return i5;
    }

    public static long l(byte[] bArr, int i4, long j4, int i5, int i6) {
        if ((bArr.length == 0 && i4 == 0) || i6 == 0) {
            return j4;
        }
        if (androidx.core.graphics.y.a(i6, 1, 8, i5) >= 64) {
            throw new IllegalArgumentException("(nBytes-1)*8+dstPos is greater or equal to than 64");
        }
        for (int i7 = 0; i7 < i6; i7++) {
            int i10 = (i7 * 8) + i5;
            j4 = (j4 & (~(255 << i10))) | ((bArr[i7 + i4] & 255) << i10);
        }
        return j4;
    }

    public static short m(byte[] bArr, int i4, short s4, int i5, int i6) {
        if ((bArr.length == 0 && i4 == 0) || i6 == 0) {
            return s4;
        }
        if (androidx.core.graphics.y.a(i6, 1, 8, i5) >= 16) {
            throw new IllegalArgumentException("(nBytes-1)*8+dstPos is greater or equal to than 16");
        }
        for (int i7 = 0; i7 < i6; i7++) {
            int i10 = (i7 * 8) + i5;
            s4 = (short) ((s4 & (~(255 << i10))) | ((bArr[i7 + i4] & 255) << i10));
        }
        return s4;
    }

    public static UUID n(byte[] bArr, int i4) {
        if (bArr.length - i4 >= 16) {
            return new UUID(l(bArr, i4, 0L, 0, 8), l(bArr, i4 + 8, 0L, 0, 8));
        }
        throw new IllegalArgumentException("Need at least 16 bytes for UUID");
    }

    public static boolean[] o(byte b5, int i4, boolean[] zArr, int i5, int i6) {
        if (i6 == 0) {
            return zArr;
        }
        if ((i6 - 1) + i4 >= 8) {
            throw new IllegalArgumentException("nBools-1+srcPos is greater or equal to than 8");
        }
        for (int i7 = 0; i7 < i6; i7++) {
            int i10 = i5 + i7;
            boolean z4 = true;
            if (((b5 >> (i7 + i4)) & 1) == 0) {
                z4 = false;
            }
            zArr[i10] = z4;
        }
        return zArr;
    }

    public static String p(byte b5, int i4, String str, int i5, int i6) {
        if (i6 == 0) {
            return str;
        }
        if (androidx.core.graphics.y.a(i6, 1, 4, i4) >= 8) {
            throw new IllegalArgumentException("(nHexs-1)*4+srcPos is greater or equal to than 8");
        }
        StringBuilder sb = new StringBuilder(str);
        int length = sb.length();
        for (int i7 = 0; i7 < i6; i7++) {
            int i10 = (b5 >> ((i7 * 4) + i4)) & 15;
            int i11 = i5 + i7;
            if (i11 == length) {
                length++;
                sb.append(C(i10));
            } else {
                sb.setCharAt(i11, C(i10));
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean[] q(char r3) {
        /*
            switch(r3) {
                case 48: goto La9;
                case 49: goto La0;
                case 50: goto L97;
                case 51: goto L8e;
                case 52: goto L85;
                case 53: goto L7c;
                case 54: goto L73;
                case 55: goto L6a;
                case 56: goto L61;
                case 57: goto L58;
                default: goto L3;
            }
        L3:
            switch(r3) {
                case 65: goto L4f;
                case 66: goto L46;
                case 67: goto L3d;
                case 68: goto L34;
                case 69: goto L2b;
                case 70: goto L22;
                default: goto L6;
            }
        L6:
            switch(r3) {
                case 97: goto L4f;
                case 98: goto L46;
                case 99: goto L3d;
                case 100: goto L34;
                case 101: goto L2b;
                case 102: goto L22;
                default: goto L9;
            }
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot interpret '"
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = "' as a hexadecimal digit"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L22:
            boolean[] r3 = org.apache.commons.lang3.t.f86120a
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L2b:
            boolean[] r3 = org.apache.commons.lang3.t.f86128i
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L34:
            boolean[] r3 = org.apache.commons.lang3.t.f86124e
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L3d:
            boolean[] r3 = org.apache.commons.lang3.t.f86132m
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L46:
            boolean[] r3 = org.apache.commons.lang3.t.f86122c
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L4f:
            boolean[] r3 = org.apache.commons.lang3.t.f86130k
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L58:
            boolean[] r3 = org.apache.commons.lang3.t.f86126g
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L61:
            boolean[] r3 = org.apache.commons.lang3.t.f86134o
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L6a:
            boolean[] r3 = org.apache.commons.lang3.t.f86121b
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L73:
            boolean[] r3 = org.apache.commons.lang3.t.f86129j
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L7c:
            boolean[] r3 = org.apache.commons.lang3.t.f86125f
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L85:
            boolean[] r3 = org.apache.commons.lang3.t.f86133n
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L8e:
            boolean[] r3 = org.apache.commons.lang3.t.f86123d
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L97:
            boolean[] r3 = org.apache.commons.lang3.t.f86131l
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        La0:
            boolean[] r3 = org.apache.commons.lang3.t.f86127h
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        La9:
            boolean[] r3 = org.apache.commons.lang3.t.f86135p
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.t.q(char):boolean[]");
    }

    public static int r(char c5) {
        switch (c5) {
            case '0':
                return 0;
            case '1':
                return 8;
            case '2':
                return 4;
            case '3':
                return 12;
            case '4':
                return 2;
            case '5':
                return 10;
            case '6':
                return 6;
            case '7':
                return 14;
            case '8':
                return 1;
            case '9':
                return 9;
            default:
                switch (c5) {
                    case 'A':
                        return 5;
                    case 'B':
                        return 13;
                    case 'C':
                        return 3;
                    case 'D':
                        return 11;
                    case 'E':
                        return 7;
                    case 'F':
                        return 15;
                    default:
                        switch (c5) {
                            case 'a':
                                return 5;
                            case 'b':
                                return 13;
                            case 'c':
                                return 3;
                            case 'd':
                                return 11;
                            case 'e':
                                return 7;
                            case 'f':
                                return 15;
                            default:
                                throw new IllegalArgumentException("Cannot interpret '" + c5 + "' as a hexadecimal digit");
                        }
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean[] s(char r3) {
        /*
            switch(r3) {
                case 48: goto La9;
                case 49: goto La0;
                case 50: goto L97;
                case 51: goto L8e;
                case 52: goto L85;
                case 53: goto L7c;
                case 54: goto L73;
                case 55: goto L6a;
                case 56: goto L61;
                case 57: goto L58;
                default: goto L3;
            }
        L3:
            switch(r3) {
                case 65: goto L4f;
                case 66: goto L46;
                case 67: goto L3d;
                case 68: goto L34;
                case 69: goto L2b;
                case 70: goto L22;
                default: goto L6;
            }
        L6:
            switch(r3) {
                case 97: goto L4f;
                case 98: goto L46;
                case 99: goto L3d;
                case 100: goto L34;
                case 101: goto L2b;
                case 102: goto L22;
                default: goto L9;
            }
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot interpret '"
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = "' as a hexadecimal digit"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L22:
            boolean[] r3 = org.apache.commons.lang3.t.f86120a
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L2b:
            boolean[] r3 = org.apache.commons.lang3.t.f86121b
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L34:
            boolean[] r3 = org.apache.commons.lang3.t.f86122c
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L3d:
            boolean[] r3 = org.apache.commons.lang3.t.f86123d
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L46:
            boolean[] r3 = org.apache.commons.lang3.t.f86124e
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L4f:
            boolean[] r3 = org.apache.commons.lang3.t.f86125f
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L58:
            boolean[] r3 = org.apache.commons.lang3.t.f86126g
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L61:
            boolean[] r3 = org.apache.commons.lang3.t.f86127h
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L6a:
            boolean[] r3 = org.apache.commons.lang3.t.f86128i
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L73:
            boolean[] r3 = org.apache.commons.lang3.t.f86129j
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L7c:
            boolean[] r3 = org.apache.commons.lang3.t.f86130k
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L85:
            boolean[] r3 = org.apache.commons.lang3.t.f86131l
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L8e:
            boolean[] r3 = org.apache.commons.lang3.t.f86132m
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        L97:
            boolean[] r3 = org.apache.commons.lang3.t.f86133n
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        La0:
            boolean[] r3 = org.apache.commons.lang3.t.f86134o
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        La9:
            boolean[] r3 = org.apache.commons.lang3.t.f86135p
            java.lang.Object r3 = r3.clone()
            boolean[] r3 = (boolean[]) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.t.s(char):boolean[]");
    }

    public static int t(char c5) {
        int digit = Character.digit(c5, 16);
        if (digit >= 0) {
            return digit;
        }
        throw new IllegalArgumentException("Cannot interpret '" + c5 + "' as a hexadecimal digit");
    }

    public static byte u(String str, int i4, byte b5, int i5, int i6) {
        if (i6 == 0) {
            return b5;
        }
        if (androidx.core.graphics.y.a(i6, 1, 4, i5) >= 8) {
            throw new IllegalArgumentException("(nHexs-1)*4+dstPos is greater or equal to than 8");
        }
        for (int i7 = 0; i7 < i6; i7++) {
            int i10 = (i7 * 4) + i5;
            b5 = (byte) ((b5 & (~(15 << i10))) | ((t(str.charAt(i7 + i4)) & 15) << i10));
        }
        return b5;
    }

    public static int v(String str, int i4, int i5, int i6, int i7) {
        if (i7 == 0) {
            return i5;
        }
        if (androidx.core.graphics.y.a(i7, 1, 4, i6) >= 32) {
            throw new IllegalArgumentException("(nHexs-1)*4+dstPos is greater or equal to than 32");
        }
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = (i10 * 4) + i6;
            i5 = (i5 & (~(15 << i11))) | ((t(str.charAt(i10 + i4)) & 15) << i11);
        }
        return i5;
    }

    public static long w(String str, int i4, long j4, int i5, int i6) {
        if (i6 == 0) {
            return j4;
        }
        if (androidx.core.graphics.y.a(i6, 1, 4, i5) >= 64) {
            throw new IllegalArgumentException("(nHexs-1)*4+dstPos is greater or equal to than 64");
        }
        for (int i7 = 0; i7 < i6; i7++) {
            int i10 = (i7 * 4) + i5;
            j4 = (j4 & (~(15 << i10))) | ((t(str.charAt(i7 + i4)) & 15) << i10);
        }
        return j4;
    }

    public static short x(String str, int i4, short s4, int i5, int i6) {
        if (i6 == 0) {
            return s4;
        }
        if (androidx.core.graphics.y.a(i6, 1, 4, i5) >= 16) {
            throw new IllegalArgumentException("(nHexs-1)*4+dstPos is greater or equal to than 16");
        }
        for (int i7 = 0; i7 < i6; i7++) {
            int i10 = (i7 * 4) + i5;
            s4 = (short) ((s4 & (~(15 << i10))) | ((t(str.charAt(i7 + i4)) & 15) << i10));
        }
        return s4;
    }

    public static long y(int[] iArr, int i4, long j4, int i5, int i6) {
        if ((iArr.length == 0 && i4 == 0) || i6 == 0) {
            return j4;
        }
        if (androidx.core.graphics.y.a(i6, 1, 32, i5) >= 64) {
            throw new IllegalArgumentException("(nInts-1)*32+dstPos is greater or equal to than 64");
        }
        for (int i7 = 0; i7 < i6; i7++) {
            int i10 = (i7 * 32) + i5;
            j4 = (j4 & (~(4294967295 << i10))) | ((iArr[i7 + i4] & 4294967295L) << i10);
        }
        return j4;
    }

    public static boolean[] z(int i4, int i5, boolean[] zArr, int i6, int i7) {
        if (i7 == 0) {
            return zArr;
        }
        if ((i7 - 1) + i5 >= 32) {
            throw new IllegalArgumentException("nBools-1+srcPos is greater or equal to than 32");
        }
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = i6 + i10;
            boolean z4 = true;
            if (((i4 >> (i10 + i5)) & 1) == 0) {
                z4 = false;
            }
            zArr[i11] = z4;
        }
        return zArr;
    }
}
