package com.google.common.primitives;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: SignedBytes.java */
@f
@d9.b
/* loaded from: classes6.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f57540a = 64;

    /* compiled from: SignedBytes.java */
    private enum a implements Comparator<byte[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return ProtectedSandApp.s("\uf8e0");
        }

        @Override // java.util.Comparator
        public int compare(byte[] bArr, byte[] bArr2) {
            int min = Math.min(bArr.length, bArr2.length);
            for (int i4 = 0; i4 < min; i4++) {
                int i5 = bArr[i4] - bArr2[i4];
                if (i5 != 0) {
                    return i5;
                }
            }
            return bArr.length - bArr2.length;
        }
    }

    private u() {
    }

    public static byte a(long j4) {
        byte b5 = (byte) j4;
        l0.p(((long) b5) == j4, ProtectedSandApp.s("\uf8e1"), j4);
        return b5;
    }

    public static int b(byte b5, byte b6) {
        return b5 - b6;
    }

    public static String c(String str, byte... bArr) {
        str.getClass();
        if (bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(bArr.length * 5);
        sb.append((int) bArr[0]);
        for (int i4 = 1; i4 < bArr.length; i4++) {
            sb.append(str);
            sb.append((int) bArr[i4]);
        }
        return sb.toString();
    }

    public static Comparator<byte[]> d() {
        return a.INSTANCE;
    }

    public static byte e(byte... bArr) {
        l0.d(bArr.length > 0);
        byte b5 = bArr[0];
        for (int i4 = 1; i4 < bArr.length; i4++) {
            byte b6 = bArr[i4];
            if (b6 > b5) {
                b5 = b6;
            }
        }
        return b5;
    }

    public static byte f(byte... bArr) {
        l0.d(bArr.length > 0);
        byte b5 = bArr[0];
        for (int i4 = 1; i4 < bArr.length; i4++) {
            byte b6 = bArr[i4];
            if (b6 < b5) {
                b5 = b6;
            }
        }
        return b5;
    }

    public static byte g(long j4) {
        if (j4 > 127) {
            return Byte.MAX_VALUE;
        }
        if (j4 < -128) {
            return Byte.MIN_VALUE;
        }
        return (byte) j4;
    }

    public static void h(byte[] bArr) {
        bArr.getClass();
        i(bArr, 0, bArr.length);
    }

    public static void i(byte[] bArr, int i4, int i5) {
        bArr.getClass();
        l0.f0(i4, i5, bArr.length);
        Arrays.sort(bArr, i4, i5);
        b.n(bArr, i4, i5);
    }
}
