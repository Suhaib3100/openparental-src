package com.google.common.primitives;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: UnsignedInts.java */
@d9.a
@f
@d9.b
/* loaded from: classes6.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    static final long f57550a = 4294967295L;

    /* compiled from: UnsignedInts.java */
    enum a implements Comparator<int[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return ProtectedSandApp.s("\uf8f0");
        }

        @Override // java.util.Comparator
        public int compare(int[] iArr, int[] iArr2) {
            int min = Math.min(iArr.length, iArr2.length);
            for (int i4 = 0; i4 < min; i4++) {
                int i5 = iArr[i4];
                int i6 = iArr2[i4];
                if (i5 != i6) {
                    return x.b(i5, i6);
                }
            }
            return iArr.length - iArr2.length;
        }
    }

    private x() {
    }

    public static int a(long j4) {
        l0.p((j4 >> 32) == 0, ProtectedSandApp.s("\uf8f1"), j4);
        return (int) j4;
    }

    public static int b(int i4, int i5) {
        return l.e(i4 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE);
    }

    @f9.a
    public static int c(String str) {
        p a5 = p.a(str);
        try {
            return k(a5.f57528a, a5.f57529b);
        } catch (NumberFormatException e4) {
            String valueOf = String.valueOf(str);
            int length = valueOf.length();
            String s4 = ProtectedSandApp.s("\uf8f2");
            NumberFormatException numberFormatException = new NumberFormatException(length != 0 ? s4.concat(valueOf) : new String(s4));
            numberFormatException.initCause(e4);
            throw numberFormatException;
        }
    }

    public static int d(int i4, int i5) {
        return (int) ((i4 & f57550a) / (i5 & f57550a));
    }

    static int e(int i4) {
        return i4 ^ Integer.MIN_VALUE;
    }

    public static String f(String str, int... iArr) {
        str.getClass();
        if (iArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(iArr.length * 5);
        sb.append(t(iArr[0], 10));
        for (int i4 = 1; i4 < iArr.length; i4++) {
            sb.append(str);
            sb.append(t(iArr[i4], 10));
        }
        return sb.toString();
    }

    public static Comparator<int[]> g() {
        return a.INSTANCE;
    }

    public static int h(int... iArr) {
        l0.d(iArr.length > 0);
        int i4 = iArr[0] ^ Integer.MIN_VALUE;
        for (int i5 = 1; i5 < iArr.length; i5++) {
            int i6 = iArr[i5] ^ Integer.MIN_VALUE;
            if (i6 > i4) {
                i4 = i6;
            }
        }
        return i4 ^ Integer.MIN_VALUE;
    }

    public static int i(int... iArr) {
        l0.d(iArr.length > 0);
        int i4 = iArr[0] ^ Integer.MIN_VALUE;
        for (int i5 = 1; i5 < iArr.length; i5++) {
            int i6 = iArr[i5] ^ Integer.MIN_VALUE;
            if (i6 < i4) {
                i4 = i6;
            }
        }
        return i4 ^ Integer.MIN_VALUE;
    }

    @f9.a
    public static int j(String str) {
        return k(str, 10);
    }

    @f9.a
    public static int k(String str, int i4) {
        str.getClass();
        long parseLong = Long.parseLong(str, i4);
        if ((f57550a & parseLong) == parseLong) {
            return (int) parseLong;
        }
        StringBuilder sb = new StringBuilder(str.length() + 69);
        sb.append(ProtectedSandApp.s("\uf8f3"));
        sb.append(str);
        sb.append(ProtectedSandApp.s("\uf8f4"));
        sb.append(i4);
        sb.append(ProtectedSandApp.s("\uf8f5"));
        throw new NumberFormatException(sb.toString());
    }

    public static int l(int i4, int i5) {
        return (int) ((i4 & f57550a) % (i5 & f57550a));
    }

    public static int m(long j4) {
        if (j4 <= 0) {
            return 0;
        }
        if (j4 >= 4294967296L) {
            return -1;
        }
        return (int) j4;
    }

    public static void n(int[] iArr) {
        iArr.getClass();
        o(iArr, 0, iArr.length);
    }

    public static void o(int[] iArr, int i4, int i5) {
        iArr.getClass();
        l0.f0(i4, i5, iArr.length);
        for (int i6 = i4; i6 < i5; i6++) {
            iArr[i6] = Integer.MIN_VALUE ^ iArr[i6];
        }
        Arrays.sort(iArr, i4, i5);
        while (i4 < i5) {
            iArr[i4] = iArr[i4] ^ Integer.MIN_VALUE;
            i4++;
        }
    }

    public static void p(int[] iArr) {
        iArr.getClass();
        q(iArr, 0, iArr.length);
    }

    public static void q(int[] iArr, int i4, int i5) {
        iArr.getClass();
        l0.f0(i4, i5, iArr.length);
        for (int i6 = i4; i6 < i5; i6++) {
            iArr[i6] = Integer.MAX_VALUE ^ iArr[i6];
        }
        Arrays.sort(iArr, i4, i5);
        while (i4 < i5) {
            iArr[i4] = iArr[i4] ^ Integer.MAX_VALUE;
            i4++;
        }
    }

    public static long r(int i4) {
        return i4 & f57550a;
    }

    public static String s(int i4) {
        return t(i4, 10);
    }

    public static String t(int i4, int i5) {
        return Long.toString(i4 & f57550a, i5);
    }
}
